package com.withpersona.sdk2.inquiry.network.dto.selfie;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PoseConfig.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJJ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;", "", "pose", "", "allowReview", "", "manualCaptureEnabled", "manualCaptureDelayMs", "", "autoCaptureEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getPose", "()Ljava/lang/String;", "getAllowReview", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getManualCaptureEnabled", "getManualCaptureDelayMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAutoCaptureEnabled", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/network/dto/selfie/PoseConfig;", "equals", "other", "hashCode", "", "toString", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class PoseConfig {
    private final Boolean allowReview;
    private final Boolean autoCaptureEnabled;
    private final Long manualCaptureDelayMs;
    private final Boolean manualCaptureEnabled;
    private final String pose;

    public static /* synthetic */ PoseConfig copy$default(PoseConfig poseConfig, String str, Boolean bool, Boolean bool2, Long l, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = poseConfig.pose;
        }
        if ((i & 2) != 0) {
            bool = poseConfig.allowReview;
        }
        if ((i & 4) != 0) {
            bool2 = poseConfig.manualCaptureEnabled;
        }
        if ((i & 8) != 0) {
            l = poseConfig.manualCaptureDelayMs;
        }
        if ((i & 16) != 0) {
            bool3 = poseConfig.autoCaptureEnabled;
        }
        Boolean bool4 = bool3;
        Boolean bool5 = bool2;
        return poseConfig.copy(str, bool, bool5, l, bool4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPose() {
        return this.pose;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getAllowReview() {
        return this.allowReview;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getManualCaptureEnabled() {
        return this.manualCaptureEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getManualCaptureDelayMs() {
        return this.manualCaptureDelayMs;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getAutoCaptureEnabled() {
        return this.autoCaptureEnabled;
    }

    public final PoseConfig copy(String pose, Boolean allowReview, Boolean manualCaptureEnabled, Long manualCaptureDelayMs, Boolean autoCaptureEnabled) {
        return new PoseConfig(pose, allowReview, manualCaptureEnabled, manualCaptureDelayMs, autoCaptureEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PoseConfig)) {
            return false;
        }
        PoseConfig poseConfig = (PoseConfig) other;
        return Intrinsics.areEqual(this.pose, poseConfig.pose) && Intrinsics.areEqual(this.allowReview, poseConfig.allowReview) && Intrinsics.areEqual(this.manualCaptureEnabled, poseConfig.manualCaptureEnabled) && Intrinsics.areEqual(this.manualCaptureDelayMs, poseConfig.manualCaptureDelayMs) && Intrinsics.areEqual(this.autoCaptureEnabled, poseConfig.autoCaptureEnabled);
    }

    public int hashCode() {
        String str = this.pose;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.allowReview;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.manualCaptureEnabled;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.manualCaptureDelayMs;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool3 = this.autoCaptureEnabled;
        return iHashCode4 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        return "PoseConfig(pose=" + this.pose + ", allowReview=" + this.allowReview + ", manualCaptureEnabled=" + this.manualCaptureEnabled + ", manualCaptureDelayMs=" + this.manualCaptureDelayMs + ", autoCaptureEnabled=" + this.autoCaptureEnabled + ")";
    }

    public PoseConfig(String str, Boolean bool, Boolean bool2, Long l, Boolean bool3) {
        this.pose = str;
        this.allowReview = bool;
        this.manualCaptureEnabled = bool2;
        this.manualCaptureDelayMs = l;
        this.autoCaptureEnabled = bool3;
    }

    public final String getPose() {
        return this.pose;
    }

    public final Boolean getAllowReview() {
        return this.allowReview;
    }

    public final Boolean getManualCaptureEnabled() {
        return this.manualCaptureEnabled;
    }

    public final Long getManualCaptureDelayMs() {
        return this.manualCaptureDelayMs;
    }

    public final Boolean getAutoCaptureEnabled() {
        return this.autoCaptureEnabled;
    }
}
