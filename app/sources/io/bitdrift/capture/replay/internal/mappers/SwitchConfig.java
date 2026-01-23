package io.bitdrift.capture.replay.internal.mappers;

import kotlin.Metadata;

/* compiled from: ButtonMapper.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/mappers/SwitchConfig;", "", "", "paddingStart", "widthRatio", "heightRatio", "<init>", "(III)V", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "getWidthRatio", "getHeightRatio", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SwitchConfig {
    private final int heightRatio;
    private final int paddingStart;
    private final int widthRatio;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchConfig)) {
            return false;
        }
        SwitchConfig switchConfig = (SwitchConfig) other;
        return this.paddingStart == switchConfig.paddingStart && this.widthRatio == switchConfig.widthRatio && this.heightRatio == switchConfig.heightRatio;
    }

    public int hashCode() {
        return (((this.paddingStart * 31) + this.widthRatio) * 31) + this.heightRatio;
    }

    public String toString() {
        return "SwitchConfig(paddingStart=" + this.paddingStart + ", widthRatio=" + this.widthRatio + ", heightRatio=" + this.heightRatio + ')';
    }

    public SwitchConfig(int i, int i2, int i3) {
        this.paddingStart = i;
        this.widthRatio = i2;
        this.heightRatio = i3;
    }

    public final int getPaddingStart() {
        return this.paddingStart;
    }

    public final int getWidthRatio() {
        return this.widthRatio;
    }

    public final int getHeightRatio() {
        return this.heightRatio;
    }
}
