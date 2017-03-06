package com.taiji.library.application;

import android.app.Application;
import android.os.Environment;

import com.alipay.euler.andfix.patch.PatchManager;
import com.facebook.react.BuildConfig;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.uuzuche.lib_zxing.activity.ZXingLibrary;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private PatchManager mPatchManager;

  private static final String APATCH_PATH = "/out.apatch";
  private String version;

  @Override
  public void onCreate() {
    super.onCreate();
    //摄像头扫描二维码
    ZXingLibrary.initDisplayOpinion(this);
    //阿里热更新框架
    try {
      version = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
      mPatchManager = new PatchManager(this);
      mPatchManager.init(version);
      mPatchManager.loadPatch();
      String patchFileString = Environment.getExternalStorageDirectory().getAbsolutePath()
              +APATCH_PATH;
      mPatchManager.addPatch(patchFileString);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage()
      );
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
      return mReactNativeHost;
  }
}
