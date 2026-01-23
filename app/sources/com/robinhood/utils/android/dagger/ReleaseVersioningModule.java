package com.robinhood.utils.android.dagger;

import android.app.Application;
import android.content.pm.PackageInfo;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.extensions.Contexts8;
import com.robinhood.utils.extensions.PackageInfos;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReleaseVersioningModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/utils/android/dagger/ReleaseVersioningModule;", "", "<init>", "()V", "provideReleaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "app", "Landroid/app/Application;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ReleaseVersioningModule {
    public static final ReleaseVersioningModule INSTANCE = new ReleaseVersioningModule();

    private ReleaseVersioningModule() {
    }

    public final ReleaseVersion provideReleaseVersion(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        PackageInfo packageInfo$default = Contexts8.getPackageInfo$default(app, 0, 1, null);
        long versionCodeCompat = PackageInfos.getVersionCodeCompat(packageInfo$default);
        String str = packageInfo$default.versionName;
        if (str == null) {
            str = "Unknown";
        }
        return new ReleaseVersion(versionCodeCompat, str);
    }
}
