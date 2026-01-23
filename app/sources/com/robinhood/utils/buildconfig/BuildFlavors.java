package com.robinhood.utils.buildconfig;

import com.robinhood.utils.android.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuildFlavors.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/utils/buildconfig/BuildFlavors;", "", "<init>", "()V", "INTERNAL", "", "EXTERNAL", "isDebugOrInternal", "", "()Z", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class BuildFlavors {
    public static final String EXTERNAL = "external";
    public static final String INTERNAL = "internal";
    public static final BuildFlavors INSTANCE = new BuildFlavors();
    private static final boolean isDebugOrInternal = Intrinsics.areEqual(BuildConfig.FLAVOR, "internal");

    private BuildFlavors() {
    }

    public final boolean isDebugOrInternal() {
        return isDebugOrInternal;
    }
}
