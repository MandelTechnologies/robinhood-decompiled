package com.robinhood.android.rhy.referral.track;

import com.robinhood.android.car.result.CarResultComposable2;
import kotlin.Metadata;

/* compiled from: RhyReferralsStatusInfoSheetData.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusInfoSheetData;", "", "title", "", CarResultComposable2.BODY, "<init>", "(II)V", "getTitle", "()I", "getBody", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyReferralsStatusInfoSheetData {
    public static final int $stable = 0;
    private final int body;
    private final int title;

    public static /* synthetic */ RhyReferralsStatusInfoSheetData copy$default(RhyReferralsStatusInfoSheetData rhyReferralsStatusInfoSheetData, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = rhyReferralsStatusInfoSheetData.title;
        }
        if ((i3 & 2) != 0) {
            i2 = rhyReferralsStatusInfoSheetData.body;
        }
        return rhyReferralsStatusInfoSheetData.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBody() {
        return this.body;
    }

    public final RhyReferralsStatusInfoSheetData copy(int title, int body) {
        return new RhyReferralsStatusInfoSheetData(title, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyReferralsStatusInfoSheetData)) {
            return false;
        }
        RhyReferralsStatusInfoSheetData rhyReferralsStatusInfoSheetData = (RhyReferralsStatusInfoSheetData) other;
        return this.title == rhyReferralsStatusInfoSheetData.title && this.body == rhyReferralsStatusInfoSheetData.body;
    }

    public int hashCode() {
        return (Integer.hashCode(this.title) * 31) + Integer.hashCode(this.body);
    }

    public String toString() {
        return "RhyReferralsStatusInfoSheetData(title=" + this.title + ", body=" + this.body + ")";
    }

    public RhyReferralsStatusInfoSheetData(int i, int i2) {
        this.title = i;
        this.body = i2;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getBody() {
        return this.body;
    }
}
