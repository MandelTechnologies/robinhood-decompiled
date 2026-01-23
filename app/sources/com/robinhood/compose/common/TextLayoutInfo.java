package com.robinhood.compose.common;

import kotlin.Metadata;

/* compiled from: MarqueeText.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/compose/common/TextLayoutInfo;", "", "textWidth", "", "containerWidth", "<init>", "(II)V", "getTextWidth", "()I", "getContainerWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
final /* data */ class TextLayoutInfo {
    private final int containerWidth;
    private final int textWidth;

    public static /* synthetic */ TextLayoutInfo copy$default(TextLayoutInfo textLayoutInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = textLayoutInfo.textWidth;
        }
        if ((i3 & 2) != 0) {
            i2 = textLayoutInfo.containerWidth;
        }
        return textLayoutInfo.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTextWidth() {
        return this.textWidth;
    }

    /* renamed from: component2, reason: from getter */
    public final int getContainerWidth() {
        return this.containerWidth;
    }

    public final TextLayoutInfo copy(int textWidth, int containerWidth) {
        return new TextLayoutInfo(textWidth, containerWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLayoutInfo)) {
            return false;
        }
        TextLayoutInfo textLayoutInfo = (TextLayoutInfo) other;
        return this.textWidth == textLayoutInfo.textWidth && this.containerWidth == textLayoutInfo.containerWidth;
    }

    public int hashCode() {
        return (Integer.hashCode(this.textWidth) * 31) + Integer.hashCode(this.containerWidth);
    }

    public String toString() {
        return "TextLayoutInfo(textWidth=" + this.textWidth + ", containerWidth=" + this.containerWidth + ")";
    }

    public TextLayoutInfo(int i, int i2) {
        this.textWidth = i;
        this.containerWidth = i2;
    }

    public final int getContainerWidth() {
        return this.containerWidth;
    }

    public final int getTextWidth() {
        return this.textWidth;
    }
}
