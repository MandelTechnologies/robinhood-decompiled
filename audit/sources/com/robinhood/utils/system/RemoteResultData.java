package com.robinhood.utils.system;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResultReceivers.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/utils/system/RemoteResultData;", "", "resultCode", "", "resultData", "Landroid/os/Bundle;", "<init>", "(ILandroid/os/Bundle;)V", "getResultCode", "()I", "getResultData", "()Landroid/os/Bundle;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RemoteResultData {
    private final int resultCode;
    private final Bundle resultData;

    public static /* synthetic */ RemoteResultData copy$default(RemoteResultData remoteResultData, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = remoteResultData.resultCode;
        }
        if ((i2 & 2) != 0) {
            bundle = remoteResultData.resultData;
        }
        return remoteResultData.copy(i, bundle);
    }

    /* renamed from: component1, reason: from getter */
    public final int getResultCode() {
        return this.resultCode;
    }

    /* renamed from: component2, reason: from getter */
    public final Bundle getResultData() {
        return this.resultData;
    }

    public final RemoteResultData copy(int resultCode, Bundle resultData) {
        return new RemoteResultData(resultCode, resultData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteResultData)) {
            return false;
        }
        RemoteResultData remoteResultData = (RemoteResultData) other;
        return this.resultCode == remoteResultData.resultCode && Intrinsics.areEqual(this.resultData, remoteResultData.resultData);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.resultCode) * 31;
        Bundle bundle = this.resultData;
        return iHashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    public String toString() {
        return "RemoteResultData(resultCode=" + this.resultCode + ", resultData=" + this.resultData + ")";
    }

    public RemoteResultData(int i, Bundle bundle) {
        this.resultCode = i;
        this.resultData = bundle;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final Bundle getResultData() {
        return this.resultData;
    }
}
