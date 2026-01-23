package io.bitdrift.capture.replay.internal.mappers;

import kotlin.Metadata;

/* compiled from: ButtonMapper.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/mappers/ButtonMapperConfig;", "", "", "paddingStart", "paddingTop", "paddingEnd", "paddingBottom", "<init>", "(IIII)V", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingStart", "getPaddingTop", "getPaddingEnd", "getPaddingBottom", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ButtonMapperConfig {
    private final int paddingBottom;
    private final int paddingEnd;
    private final int paddingStart;
    private final int paddingTop;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonMapperConfig)) {
            return false;
        }
        ButtonMapperConfig buttonMapperConfig = (ButtonMapperConfig) other;
        return this.paddingStart == buttonMapperConfig.paddingStart && this.paddingTop == buttonMapperConfig.paddingTop && this.paddingEnd == buttonMapperConfig.paddingEnd && this.paddingBottom == buttonMapperConfig.paddingBottom;
    }

    public int hashCode() {
        return (((((this.paddingStart * 31) + this.paddingTop) * 31) + this.paddingEnd) * 31) + this.paddingBottom;
    }

    public String toString() {
        return "ButtonMapperConfig(paddingStart=" + this.paddingStart + ", paddingTop=" + this.paddingTop + ", paddingEnd=" + this.paddingEnd + ", paddingBottom=" + this.paddingBottom + ')';
    }

    public ButtonMapperConfig(int i, int i2, int i3, int i4) {
        this.paddingStart = i;
        this.paddingTop = i2;
        this.paddingEnd = i3;
        this.paddingBottom = i4;
    }

    public final int getPaddingStart() {
        return this.paddingStart;
    }

    public final int getPaddingTop() {
        return this.paddingTop;
    }

    public final int getPaddingEnd() {
        return this.paddingEnd;
    }

    public final int getPaddingBottom() {
        return this.paddingBottom;
    }
}
