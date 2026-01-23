package com.google.android.play.core.appupdate;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes27.dex */
public abstract class AppUpdateOptions {

    /* compiled from: com.google.android.play:app-update@@2.1.0 */
    public static abstract class Builder {
        public abstract AppUpdateOptions build();

        public abstract Builder setAllowAssetPackDeletion(boolean z);
    }

    public static Builder newBuilder(int i) {
        zzv zzvVar = new zzv();
        zzvVar.setAppUpdateType(i);
        zzvVar.setAllowAssetPackDeletion(false);
        return zzvVar;
    }

    public abstract boolean allowAssetPackDeletion();

    public abstract int appUpdateType();
}
