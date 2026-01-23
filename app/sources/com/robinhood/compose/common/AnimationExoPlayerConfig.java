package com.robinhood.compose.common;

import kotlin.Metadata;

/* compiled from: AnimationExoPlayer.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/compose/common/AnimationExoPlayerConfig;", "", "repeatMode", "", "resizeMode", "<init>", "(II)V", "getRepeatMode", "()I", "getResizeMode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AnimationExoPlayerConfig {
    public static final int $stable = 0;
    private final int repeatMode;
    private final int resizeMode;

    public static /* synthetic */ AnimationExoPlayerConfig copy$default(AnimationExoPlayerConfig animationExoPlayerConfig, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = animationExoPlayerConfig.repeatMode;
        }
        if ((i3 & 2) != 0) {
            i2 = animationExoPlayerConfig.resizeMode;
        }
        return animationExoPlayerConfig.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRepeatMode() {
        return this.repeatMode;
    }

    /* renamed from: component2, reason: from getter */
    public final int getResizeMode() {
        return this.resizeMode;
    }

    public final AnimationExoPlayerConfig copy(int repeatMode, int resizeMode) {
        return new AnimationExoPlayerConfig(repeatMode, resizeMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimationExoPlayerConfig)) {
            return false;
        }
        AnimationExoPlayerConfig animationExoPlayerConfig = (AnimationExoPlayerConfig) other;
        return this.repeatMode == animationExoPlayerConfig.repeatMode && this.resizeMode == animationExoPlayerConfig.resizeMode;
    }

    public int hashCode() {
        return (Integer.hashCode(this.repeatMode) * 31) + Integer.hashCode(this.resizeMode);
    }

    public String toString() {
        return "AnimationExoPlayerConfig(repeatMode=" + this.repeatMode + ", resizeMode=" + this.resizeMode + ")";
    }

    public AnimationExoPlayerConfig(int i, int i2) {
        this.repeatMode = i;
        this.resizeMode = i2;
    }

    public final int getRepeatMode() {
        return this.repeatMode;
    }

    public final int getResizeMode() {
        return this.resizeMode;
    }
}
