package com.robinhood.android.crypto.costbasis.utils;

import com.robinhood.models.api.ErrorResponse;
import com.robinhood.utils.resource.StringResource;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CostBasisErrors.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0001\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0019J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003Jm\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/utils/CostBasisErrorResponse;", "", "errorCode", "", "errorMessage", "errorTitle", "primaryCtaText", "primaryCtaDeeplink", "secondaryCtaText", "secondaryCtaDeeplink", "fieldErrorMessages", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorMessage", "getErrorTitle", "getPrimaryCtaText", "getPrimaryCtaDeeplink", "getSecondaryCtaText", "getSecondaryCtaDeeplink", "getFieldErrorMessages", "()Ljava/util/Map;", "toErrorDetails", "Lcom/robinhood/android/crypto/costbasis/utils/CostBasisErrorDetails;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CostBasisErrorResponse {
    public static final int $stable = 8;
    private final String errorCode;
    private final String errorMessage;
    private final String errorTitle;
    private final Map<String, String> fieldErrorMessages;
    private final String primaryCtaDeeplink;
    private final String primaryCtaText;
    private final String secondaryCtaDeeplink;
    private final String secondaryCtaText;

    public static /* synthetic */ CostBasisErrorResponse copy$default(CostBasisErrorResponse costBasisErrorResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = costBasisErrorResponse.errorCode;
        }
        if ((i & 2) != 0) {
            str2 = costBasisErrorResponse.errorMessage;
        }
        if ((i & 4) != 0) {
            str3 = costBasisErrorResponse.errorTitle;
        }
        if ((i & 8) != 0) {
            str4 = costBasisErrorResponse.primaryCtaText;
        }
        if ((i & 16) != 0) {
            str5 = costBasisErrorResponse.primaryCtaDeeplink;
        }
        if ((i & 32) != 0) {
            str6 = costBasisErrorResponse.secondaryCtaText;
        }
        if ((i & 64) != 0) {
            str7 = costBasisErrorResponse.secondaryCtaDeeplink;
        }
        if ((i & 128) != 0) {
            map = costBasisErrorResponse.fieldErrorMessages;
        }
        String str8 = str7;
        Map map2 = map;
        String str9 = str5;
        String str10 = str6;
        return costBasisErrorResponse.copy(str, str2, str3, str4, str9, str10, str8, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getErrorTitle() {
        return this.errorTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPrimaryCtaDeeplink() {
        return this.primaryCtaDeeplink;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSecondaryCtaText() {
        return this.secondaryCtaText;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSecondaryCtaDeeplink() {
        return this.secondaryCtaDeeplink;
    }

    public final Map<String, String> component8() {
        return this.fieldErrorMessages;
    }

    public final CostBasisErrorResponse copy(@Json(name = ErrorResponse.ERROR_CODE) String errorCode, @Json(name = "error_message") String errorMessage, @Json(name = ErrorResponse.ERROR_TITLE) String errorTitle, @Json(name = "primary_cta_text") String primaryCtaText, @Json(name = "primary_cta_deeplink") String primaryCtaDeeplink, @Json(name = "secondary_cta_text") String secondaryCtaText, @Json(name = "secondary_cta_deeplink") String secondaryCtaDeeplink, @Json(name = "field_error_messages") Map<String, String> fieldErrorMessages) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(errorTitle, "errorTitle");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        return new CostBasisErrorResponse(errorCode, errorMessage, errorTitle, primaryCtaText, primaryCtaDeeplink, secondaryCtaText, secondaryCtaDeeplink, fieldErrorMessages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CostBasisErrorResponse)) {
            return false;
        }
        CostBasisErrorResponse costBasisErrorResponse = (CostBasisErrorResponse) other;
        return Intrinsics.areEqual(this.errorCode, costBasisErrorResponse.errorCode) && Intrinsics.areEqual(this.errorMessage, costBasisErrorResponse.errorMessage) && Intrinsics.areEqual(this.errorTitle, costBasisErrorResponse.errorTitle) && Intrinsics.areEqual(this.primaryCtaText, costBasisErrorResponse.primaryCtaText) && Intrinsics.areEqual(this.primaryCtaDeeplink, costBasisErrorResponse.primaryCtaDeeplink) && Intrinsics.areEqual(this.secondaryCtaText, costBasisErrorResponse.secondaryCtaText) && Intrinsics.areEqual(this.secondaryCtaDeeplink, costBasisErrorResponse.secondaryCtaDeeplink) && Intrinsics.areEqual(this.fieldErrorMessages, costBasisErrorResponse.fieldErrorMessages);
    }

    public int hashCode() {
        int iHashCode = ((((((this.errorCode.hashCode() * 31) + this.errorMessage.hashCode()) * 31) + this.errorTitle.hashCode()) * 31) + this.primaryCtaText.hashCode()) * 31;
        String str = this.primaryCtaDeeplink;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secondaryCtaText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondaryCtaDeeplink;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.fieldErrorMessages;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "CostBasisErrorResponse(errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", errorTitle=" + this.errorTitle + ", primaryCtaText=" + this.primaryCtaText + ", primaryCtaDeeplink=" + this.primaryCtaDeeplink + ", secondaryCtaText=" + this.secondaryCtaText + ", secondaryCtaDeeplink=" + this.secondaryCtaDeeplink + ", fieldErrorMessages=" + this.fieldErrorMessages + ")";
    }

    public CostBasisErrorResponse(@Json(name = ErrorResponse.ERROR_CODE) String errorCode, @Json(name = "error_message") String errorMessage, @Json(name = ErrorResponse.ERROR_TITLE) String errorTitle, @Json(name = "primary_cta_text") String primaryCtaText, @Json(name = "primary_cta_deeplink") String str, @Json(name = "secondary_cta_text") String str2, @Json(name = "secondary_cta_deeplink") String str3, @Json(name = "field_error_messages") Map<String, String> map) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(errorTitle, "errorTitle");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorTitle = errorTitle;
        this.primaryCtaText = primaryCtaText;
        this.primaryCtaDeeplink = str;
        this.secondaryCtaText = str2;
        this.secondaryCtaDeeplink = str3;
        this.fieldErrorMessages = map;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getErrorTitle() {
        return this.errorTitle;
    }

    public final String getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    public final String getPrimaryCtaDeeplink() {
        return this.primaryCtaDeeplink;
    }

    public final String getSecondaryCtaText() {
        return this.secondaryCtaText;
    }

    public final String getSecondaryCtaDeeplink() {
        return this.secondaryCtaDeeplink;
    }

    public final Map<String, String> getFieldErrorMessages() {
        return this.fieldErrorMessages;
    }

    public final CostBasisErrorDetails toErrorDetails() {
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(this.errorTitle);
        StringResource stringResourceInvoke2 = companion.invoke(this.errorMessage);
        StringResource stringResourceInvoke3 = companion.invoke(this.primaryCtaText);
        String str = this.primaryCtaDeeplink;
        String str2 = this.secondaryCtaText;
        return new CostBasisErrorDetails(stringResourceInvoke, stringResourceInvoke2, stringResourceInvoke3, str, str2 != null ? companion.invoke(str2) : null, this.secondaryCtaDeeplink);
    }
}
