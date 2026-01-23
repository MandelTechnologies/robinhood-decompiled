package com.mux.stats.sdk.muxstats;

/* loaded from: classes27.dex */
public interface IPlayerListener {
    long getCurrentPosition();

    String getMimeType();

    Long getPlayerManifestNewestTime();

    Long getPlayerProgramTime();

    int getPlayerViewHeight();

    int getPlayerViewWidth();

    Integer getSourceAdvertisedBitrate();

    Float getSourceAdvertisedFramerate();

    default String getSourceCodec() {
        return null;
    }

    Long getSourceDuration();

    Integer getSourceHeight();

    Integer getSourceWidth();

    Long getVideoHoldback();

    Long getVideoPartHoldback();

    Long getVideoPartTargetDuration();

    Long getVideoTargetDuration();

    boolean isPaused();
}
