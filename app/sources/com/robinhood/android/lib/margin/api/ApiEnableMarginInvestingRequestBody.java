package com.robinhood.android.lib.margin.api;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiEnableMarginInvestingRequestBody.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiEnableMarginInvestingRequestBody;", "", "planId", "Ljava/util/UUID;", "marginInvestingSetting", "Lcom/robinhood/android/lib/margin/api/ApiMarginSettingUpdate;", "marginWithdrawalSetting", "skipMin2kEquityCheck", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/lib/margin/api/ApiMarginSettingUpdate;Lcom/robinhood/android/lib/margin/api/ApiMarginSettingUpdate;Z)V", "getPlanId", "()Ljava/util/UUID;", "getMarginInvestingSetting", "()Lcom/robinhood/android/lib/margin/api/ApiMarginSettingUpdate;", "getMarginWithdrawalSetting", "getSkipMin2kEquityCheck", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ApiEnableMarginInvestingRequestBody {
    private final ApiMarginSettingUpdate marginInvestingSetting;
    private final ApiMarginSettingUpdate marginWithdrawalSetting;
    private final UUID planId;
    private final boolean skipMin2kEquityCheck;

    public static /* synthetic */ ApiEnableMarginInvestingRequestBody copy$default(ApiEnableMarginInvestingRequestBody apiEnableMarginInvestingRequestBody, UUID uuid, ApiMarginSettingUpdate apiMarginSettingUpdate, ApiMarginSettingUpdate apiMarginSettingUpdate2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = apiEnableMarginInvestingRequestBody.planId;
        }
        if ((i & 2) != 0) {
            apiMarginSettingUpdate = apiEnableMarginInvestingRequestBody.marginInvestingSetting;
        }
        if ((i & 4) != 0) {
            apiMarginSettingUpdate2 = apiEnableMarginInvestingRequestBody.marginWithdrawalSetting;
        }
        if ((i & 8) != 0) {
            z = apiEnableMarginInvestingRequestBody.skipMin2kEquityCheck;
        }
        return apiEnableMarginInvestingRequestBody.copy(uuid, apiMarginSettingUpdate, apiMarginSettingUpdate2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getPlanId() {
        return this.planId;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiMarginSettingUpdate getMarginInvestingSetting() {
        return this.marginInvestingSetting;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiMarginSettingUpdate getMarginWithdrawalSetting() {
        return this.marginWithdrawalSetting;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSkipMin2kEquityCheck() {
        return this.skipMin2kEquityCheck;
    }

    public final ApiEnableMarginInvestingRequestBody copy(@Json(name = "plan_id") UUID planId, @Json(name = "margin_investing") ApiMarginSettingUpdate marginInvestingSetting, @Json(name = "margin_withdrawal") ApiMarginSettingUpdate marginWithdrawalSetting, @Json(name = "skip_min_2k_equity_check") boolean skipMin2kEquityCheck) {
        return new ApiEnableMarginInvestingRequestBody(planId, marginInvestingSetting, marginWithdrawalSetting, skipMin2kEquityCheck);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiEnableMarginInvestingRequestBody)) {
            return false;
        }
        ApiEnableMarginInvestingRequestBody apiEnableMarginInvestingRequestBody = (ApiEnableMarginInvestingRequestBody) other;
        return Intrinsics.areEqual(this.planId, apiEnableMarginInvestingRequestBody.planId) && Intrinsics.areEqual(this.marginInvestingSetting, apiEnableMarginInvestingRequestBody.marginInvestingSetting) && Intrinsics.areEqual(this.marginWithdrawalSetting, apiEnableMarginInvestingRequestBody.marginWithdrawalSetting) && this.skipMin2kEquityCheck == apiEnableMarginInvestingRequestBody.skipMin2kEquityCheck;
    }

    public int hashCode() {
        UUID uuid = this.planId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        ApiMarginSettingUpdate apiMarginSettingUpdate = this.marginInvestingSetting;
        int iHashCode2 = (iHashCode + (apiMarginSettingUpdate == null ? 0 : apiMarginSettingUpdate.hashCode())) * 31;
        ApiMarginSettingUpdate apiMarginSettingUpdate2 = this.marginWithdrawalSetting;
        return ((iHashCode2 + (apiMarginSettingUpdate2 != null ? apiMarginSettingUpdate2.hashCode() : 0)) * 31) + Boolean.hashCode(this.skipMin2kEquityCheck);
    }

    public String toString() {
        return "ApiEnableMarginInvestingRequestBody(planId=" + this.planId + ", marginInvestingSetting=" + this.marginInvestingSetting + ", marginWithdrawalSetting=" + this.marginWithdrawalSetting + ", skipMin2kEquityCheck=" + this.skipMin2kEquityCheck + ")";
    }

    public ApiEnableMarginInvestingRequestBody(@Json(name = "plan_id") UUID uuid, @Json(name = "margin_investing") ApiMarginSettingUpdate apiMarginSettingUpdate, @Json(name = "margin_withdrawal") ApiMarginSettingUpdate apiMarginSettingUpdate2, @Json(name = "skip_min_2k_equity_check") boolean z) {
        this.planId = uuid;
        this.marginInvestingSetting = apiMarginSettingUpdate;
        this.marginWithdrawalSetting = apiMarginSettingUpdate2;
        this.skipMin2kEquityCheck = z;
    }

    public /* synthetic */ ApiEnableMarginInvestingRequestBody(UUID uuid, ApiMarginSettingUpdate apiMarginSettingUpdate, ApiMarginSettingUpdate apiMarginSettingUpdate2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? null : apiMarginSettingUpdate, (i & 4) != 0 ? null : apiMarginSettingUpdate2, (i & 8) != 0 ? false : z);
    }

    public final UUID getPlanId() {
        return this.planId;
    }

    public final ApiMarginSettingUpdate getMarginInvestingSetting() {
        return this.marginInvestingSetting;
    }

    public final ApiMarginSettingUpdate getMarginWithdrawalSetting() {
        return this.marginWithdrawalSetting;
    }

    public final boolean getSkipMin2kEquityCheck() {
        return this.skipMin2kEquityCheck;
    }
}
