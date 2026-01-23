package com.robinhood.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReleaseVersion.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/utils/ReleaseVersion;", "", "versionCode", "", "versionName", "", "<init>", "(JLjava/lang/String;)V", "getVersionCode", "()J", "getVersionName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class ReleaseVersion {
    private final long versionCode;
    private final String versionName;

    public static /* synthetic */ ReleaseVersion copy$default(ReleaseVersion releaseVersion, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = releaseVersion.versionCode;
        }
        if ((i & 2) != 0) {
            str = releaseVersion.versionName;
        }
        return releaseVersion.copy(j, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getVersionCode() {
        return this.versionCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    public final ReleaseVersion copy(long versionCode, String versionName) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        return new ReleaseVersion(versionCode, versionName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReleaseVersion)) {
            return false;
        }
        ReleaseVersion releaseVersion = (ReleaseVersion) other;
        return this.versionCode == releaseVersion.versionCode && Intrinsics.areEqual(this.versionName, releaseVersion.versionName);
    }

    public int hashCode() {
        return (Long.hashCode(this.versionCode) * 31) + this.versionName.hashCode();
    }

    public String toString() {
        return "ReleaseVersion(versionCode=" + this.versionCode + ", versionName=" + this.versionName + ")";
    }

    public ReleaseVersion(long j, String versionName) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        this.versionCode = j;
        this.versionName = versionName;
    }

    public final long getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }
}
