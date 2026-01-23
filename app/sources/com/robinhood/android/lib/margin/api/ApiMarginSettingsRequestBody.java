package com.robinhood.android.lib.margin.api;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiMarginSettingsRequestBody.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginSettingsRequestBody;", "", "marginInvestingSetting", "Lcom/robinhood/android/lib/margin/api/ApiMarginSettingUpdate;", "marginWithdrawalSetting", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiMarginSettingUpdate;Lcom/robinhood/android/lib/margin/api/ApiMarginSettingUpdate;)V", "getMarginInvestingSetting", "()Lcom/robinhood/android/lib/margin/api/ApiMarginSettingUpdate;", "getMarginWithdrawalSetting", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ApiMarginSettingsRequestBody {
    private final ApiMarginSettingUpdate marginInvestingSetting;
    private final ApiMarginSettingUpdate marginWithdrawalSetting;

    /* JADX WARN: Multi-variable type inference failed */
    public ApiMarginSettingsRequestBody() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ApiMarginSettingsRequestBody copy$default(ApiMarginSettingsRequestBody apiMarginSettingsRequestBody, ApiMarginSettingUpdate apiMarginSettingUpdate, ApiMarginSettingUpdate apiMarginSettingUpdate2, int i, Object obj) {
        if ((i & 1) != 0) {
            apiMarginSettingUpdate = apiMarginSettingsRequestBody.marginInvestingSetting;
        }
        if ((i & 2) != 0) {
            apiMarginSettingUpdate2 = apiMarginSettingsRequestBody.marginWithdrawalSetting;
        }
        return apiMarginSettingsRequestBody.copy(apiMarginSettingUpdate, apiMarginSettingUpdate2);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiMarginSettingUpdate getMarginInvestingSetting() {
        return this.marginInvestingSetting;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiMarginSettingUpdate getMarginWithdrawalSetting() {
        return this.marginWithdrawalSetting;
    }

    public final ApiMarginSettingsRequestBody copy(@Json(name = "margin_investing") ApiMarginSettingUpdate marginInvestingSetting, @Json(name = "margin_withdrawal") ApiMarginSettingUpdate marginWithdrawalSetting) {
        return new ApiMarginSettingsRequestBody(marginInvestingSetting, marginWithdrawalSetting);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiMarginSettingsRequestBody)) {
            return false;
        }
        ApiMarginSettingsRequestBody apiMarginSettingsRequestBody = (ApiMarginSettingsRequestBody) other;
        return Intrinsics.areEqual(this.marginInvestingSetting, apiMarginSettingsRequestBody.marginInvestingSetting) && Intrinsics.areEqual(this.marginWithdrawalSetting, apiMarginSettingsRequestBody.marginWithdrawalSetting);
    }

    public int hashCode() {
        ApiMarginSettingUpdate apiMarginSettingUpdate = this.marginInvestingSetting;
        int iHashCode = (apiMarginSettingUpdate == null ? 0 : apiMarginSettingUpdate.hashCode()) * 31;
        ApiMarginSettingUpdate apiMarginSettingUpdate2 = this.marginWithdrawalSetting;
        return iHashCode + (apiMarginSettingUpdate2 != null ? apiMarginSettingUpdate2.hashCode() : 0);
    }

    public String toString() {
        return "ApiMarginSettingsRequestBody(marginInvestingSetting=" + this.marginInvestingSetting + ", marginWithdrawalSetting=" + this.marginWithdrawalSetting + ")";
    }

    public ApiMarginSettingsRequestBody(@Json(name = "margin_investing") ApiMarginSettingUpdate apiMarginSettingUpdate, @Json(name = "margin_withdrawal") ApiMarginSettingUpdate apiMarginSettingUpdate2) {
        this.marginInvestingSetting = apiMarginSettingUpdate;
        this.marginWithdrawalSetting = apiMarginSettingUpdate2;
    }

    public /* synthetic */ ApiMarginSettingsRequestBody(ApiMarginSettingUpdate apiMarginSettingUpdate, ApiMarginSettingUpdate apiMarginSettingUpdate2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiMarginSettingUpdate, (i & 2) != 0 ? null : apiMarginSettingUpdate2);
    }

    public final ApiMarginSettingUpdate getMarginInvestingSetting() {
        return this.marginInvestingSetting;
    }

    public final ApiMarginSettingUpdate getMarginWithdrawalSetting() {
        return this.marginWithdrawalSetting;
    }
}
