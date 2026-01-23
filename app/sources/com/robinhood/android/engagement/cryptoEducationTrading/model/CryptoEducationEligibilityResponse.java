package com.robinhood.android.engagement.cryptoEducationTrading.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoEducationEligibilityResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/engagement/cryptoEducationTrading/model/CryptoEducationEligibilityResponse;", "", "lessonSeriesId", "", "<init>", "(Ljava/lang/String;)V", "getLessonSeriesId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-crypto-education-trading_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CryptoEducationEligibilityResponse {
    public static final int $stable = 0;
    private final String lessonSeriesId;

    public static /* synthetic */ CryptoEducationEligibilityResponse copy$default(CryptoEducationEligibilityResponse cryptoEducationEligibilityResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoEducationEligibilityResponse.lessonSeriesId;
        }
        return cryptoEducationEligibilityResponse.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLessonSeriesId() {
        return this.lessonSeriesId;
    }

    public final CryptoEducationEligibilityResponse copy(@Json(name = "lesson_series_id") String lessonSeriesId) {
        Intrinsics.checkNotNullParameter(lessonSeriesId, "lessonSeriesId");
        return new CryptoEducationEligibilityResponse(lessonSeriesId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoEducationEligibilityResponse) && Intrinsics.areEqual(this.lessonSeriesId, ((CryptoEducationEligibilityResponse) other).lessonSeriesId);
    }

    public int hashCode() {
        return this.lessonSeriesId.hashCode();
    }

    public String toString() {
        return "CryptoEducationEligibilityResponse(lessonSeriesId=" + this.lessonSeriesId + ")";
    }

    public CryptoEducationEligibilityResponse(@Json(name = "lesson_series_id") String lessonSeriesId) {
        Intrinsics.checkNotNullParameter(lessonSeriesId, "lessonSeriesId");
        this.lessonSeriesId = lessonSeriesId;
    }

    public final String getLessonSeriesId() {
        return this.lessonSeriesId;
    }
}
