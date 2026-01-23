package com.robinhood.android.lib.margin.api;

import com.robinhood.models.util.Money;
import com.robinhood.utils.moshi.jsonadapter.SerializeNullsJsonAdapterFactory2;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiMarginSettingUpdate.kt */
@SerializeNullsJsonAdapterFactory2
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginSettingUpdate;", "", "isEnabled", "", "userSetLimit", "Lcom/robinhood/models/util/Money;", "<init>", "(ZLcom/robinhood/models/util/Money;)V", "()Z", "getUserSetLimit", "()Lcom/robinhood/models/util/Money;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ApiMarginSettingUpdate {
    private final boolean isEnabled;
    private final Money userSetLimit;

    public static /* synthetic */ ApiMarginSettingUpdate copy$default(ApiMarginSettingUpdate apiMarginSettingUpdate, boolean z, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            z = apiMarginSettingUpdate.isEnabled;
        }
        if ((i & 2) != 0) {
            money = apiMarginSettingUpdate.userSetLimit;
        }
        return apiMarginSettingUpdate.copy(z, money);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getUserSetLimit() {
        return this.userSetLimit;
    }

    public final ApiMarginSettingUpdate copy(@Json(name = "is_enabled") boolean isEnabled, @Json(name = "user_set_limit") Money userSetLimit) {
        return new ApiMarginSettingUpdate(isEnabled, userSetLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiMarginSettingUpdate)) {
            return false;
        }
        ApiMarginSettingUpdate apiMarginSettingUpdate = (ApiMarginSettingUpdate) other;
        return this.isEnabled == apiMarginSettingUpdate.isEnabled && Intrinsics.areEqual(this.userSetLimit, apiMarginSettingUpdate.userSetLimit);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isEnabled) * 31;
        Money money = this.userSetLimit;
        return iHashCode + (money == null ? 0 : money.hashCode());
    }

    public String toString() {
        return "ApiMarginSettingUpdate(isEnabled=" + this.isEnabled + ", userSetLimit=" + this.userSetLimit + ")";
    }

    public ApiMarginSettingUpdate(@Json(name = "is_enabled") boolean z, @Json(name = "user_set_limit") Money money) {
        this.isEnabled = z;
        this.userSetLimit = money;
    }

    public /* synthetic */ ApiMarginSettingUpdate(boolean z, Money money, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : money);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final Money getUserSetLimit() {
        return this.userSetLimit;
    }
}
