package com.withpersona.sdk2.inquiry.governmentid;

import kotlin.Metadata;

/* compiled from: IdFrameHelper.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/OverlayAssets;", "", "", "hintAnimation", "guideDrawable", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHintAnimation", "getGuideDrawable", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class OverlayAssets {
    private final int guideDrawable;
    private final int hintAnimation;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayAssets)) {
            return false;
        }
        OverlayAssets overlayAssets = (OverlayAssets) other;
        return this.hintAnimation == overlayAssets.hintAnimation && this.guideDrawable == overlayAssets.guideDrawable;
    }

    public int hashCode() {
        return (Integer.hashCode(this.hintAnimation) * 31) + Integer.hashCode(this.guideDrawable);
    }

    public String toString() {
        return "OverlayAssets(hintAnimation=" + this.hintAnimation + ", guideDrawable=" + this.guideDrawable + ")";
    }

    public OverlayAssets(int i, int i2) {
        this.hintAnimation = i;
        this.guideDrawable = i2;
    }

    public final int getHintAnimation() {
        return this.hintAnimation;
    }

    public final int getGuideDrawable() {
        return this.guideDrawable;
    }
}
