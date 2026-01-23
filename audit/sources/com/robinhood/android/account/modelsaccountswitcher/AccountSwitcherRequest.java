package com.robinhood.android.account.modelsaccountswitcher;

import account_aggregation.service.p005v1.GetAccountSwitcherRequestDto;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSwitcherRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherRequest;", "", "assetId", "", "location", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherLocation;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherLocation;)V", "getAssetId", "()Ljava/lang/String;", "getLocation", "()Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherLocation;", "toDto", "Laccount_aggregation/service/v1/GetAccountSwitcherRequestDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-models-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AccountSwitcherRequest {
    private final String assetId;
    private final AccountSwitcherLocation location;

    public static /* synthetic */ AccountSwitcherRequest copy$default(AccountSwitcherRequest accountSwitcherRequest, String str, AccountSwitcherLocation accountSwitcherLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountSwitcherRequest.assetId;
        }
        if ((i & 2) != 0) {
            accountSwitcherLocation = accountSwitcherRequest.location;
        }
        return accountSwitcherRequest.copy(str, accountSwitcherLocation);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAssetId() {
        return this.assetId;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountSwitcherLocation getLocation() {
        return this.location;
    }

    public final AccountSwitcherRequest copy(String assetId, AccountSwitcherLocation location) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(location, "location");
        return new AccountSwitcherRequest(assetId, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSwitcherRequest)) {
            return false;
        }
        AccountSwitcherRequest accountSwitcherRequest = (AccountSwitcherRequest) other;
        return Intrinsics.areEqual(this.assetId, accountSwitcherRequest.assetId) && this.location == accountSwitcherRequest.location;
    }

    public int hashCode() {
        return (this.assetId.hashCode() * 31) + this.location.hashCode();
    }

    public String toString() {
        return "AccountSwitcherRequest(assetId=" + this.assetId + ", location=" + this.location + ")";
    }

    public AccountSwitcherRequest(String assetId, AccountSwitcherLocation location) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(location, "location");
        this.assetId = assetId;
        this.location = location;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final AccountSwitcherLocation getLocation() {
        return this.location;
    }

    public final GetAccountSwitcherRequestDto toDto() {
        return new GetAccountSwitcherRequestDto(this.assetId, this.location.toDto());
    }
}
