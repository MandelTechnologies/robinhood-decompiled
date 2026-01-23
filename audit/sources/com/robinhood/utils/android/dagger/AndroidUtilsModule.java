package com.robinhood.utils.android.dagger;

import android.app.Application;
import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.robinhood.shared.i18n.dynamic.translations.DynamicTranslationsContextWrapper;
import com.robinhood.utils.android.dagger.annotation.Process;
import com.robinhood.utils.dagger.annotation.CacheDirectory;
import com.robinhood.utils.dagger.annotation.FilesDirectory;
import com.robinhood.utils.extensions.ContextSystemServices;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;

/* compiled from: AndroidUtilsModule.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0007¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/utils/android/dagger/AndroidUtilsModule;", "", "<init>", "()V", "provideSystemFileSystem", "Lokio/FileSystem;", "provideCacheDirectory", "Ljava/io/File;", "app", "Landroid/app/Application;", "provideFilesDirectory", "provideAssetManager", "Landroid/content/res/AssetManager;", "provideConnectivityManager", "Landroid/net/ConnectivityManager;", "provideContentResolver", "Landroid/content/ContentResolver;", "application", "provideResources", "Landroid/content/res/Resources;", "dynamicTranslationsContextWrapper", "Lcom/robinhood/shared/i18n/dynamic/translations/DynamicTranslationsContextWrapper;", "providePowerManager", "Landroid/os/PowerManager;", "provideTelephonyManager", "Landroid/telephony/TelephonyManager;", "provideWifiManager", "Landroid/net/wifi/WifiManager;", "provideProcessLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class AndroidUtilsModule {
    public static final AndroidUtilsModule INSTANCE = new AndroidUtilsModule();

    private AndroidUtilsModule() {
    }

    public final FileSystem provideSystemFileSystem() {
        return FileSystem.SYSTEM;
    }

    @CacheDirectory
    public final File provideCacheDirectory(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        File cacheDir = app.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        return cacheDir;
    }

    @FilesDirectory
    public final File provideFilesDirectory(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        File filesDir = app.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        return filesDir;
    }

    public final AssetManager provideAssetManager(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        AssetManager assets = app.getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
        return assets;
    }

    public final ConnectivityManager provideConnectivityManager(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        return ContextSystemServices.getConnectivityManager(app);
    }

    public final ContentResolver provideContentResolver(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        ContentResolver contentResolver = application.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        return contentResolver;
    }

    public final Resources provideResources(Application app, DynamicTranslationsContextWrapper dynamicTranslationsContextWrapper) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(dynamicTranslationsContextWrapper, "dynamicTranslationsContextWrapper");
        Resources resources = dynamicTranslationsContextWrapper.wrap(app).getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return resources;
    }

    public final PowerManager providePowerManager(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        return ContextSystemServices.getPowerManager(app);
    }

    public final TelephonyManager provideTelephonyManager(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        return ContextSystemServices.getTelephonyManager(app);
    }

    public final WifiManager provideWifiManager(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        return ContextSystemServices.getWifiManager(app);
    }

    @Process
    public final LifecycleOwner provideProcessLifecycleOwner() {
        return ProcessLifecycleOwner.INSTANCE.get();
    }
}
