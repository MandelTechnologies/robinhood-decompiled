package com.robinhood.android.account.settings.accountnumbers;

import bonfire.proto.idl.accounts.p028v1.AccountNumbersResponseDto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountNumbersDataState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersDataState;", "", "isSecondaryAuthenticated", "", "accountNumbersResponse", "Lbonfire/proto/idl/accounts/v1/AccountNumbersResponseDto;", "<init>", "(ZLbonfire/proto/idl/accounts/v1/AccountNumbersResponseDto;)V", "()Z", "getAccountNumbersResponse", "()Lbonfire/proto/idl/accounts/v1/AccountNumbersResponseDto;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-account-number-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AccountNumbersDataState {
    public static final int $stable = 8;
    private final AccountNumbersResponseDto accountNumbersResponse;
    private final boolean isSecondaryAuthenticated;

    /* JADX WARN: Multi-variable type inference failed */
    public AccountNumbersDataState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AccountNumbersDataState copy$default(AccountNumbersDataState accountNumbersDataState, boolean z, AccountNumbersResponseDto accountNumbersResponseDto, int i, Object obj) {
        if ((i & 1) != 0) {
            z = accountNumbersDataState.isSecondaryAuthenticated;
        }
        if ((i & 2) != 0) {
            accountNumbersResponseDto = accountNumbersDataState.accountNumbersResponse;
        }
        return accountNumbersDataState.copy(z, accountNumbersResponseDto);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSecondaryAuthenticated() {
        return this.isSecondaryAuthenticated;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountNumbersResponseDto getAccountNumbersResponse() {
        return this.accountNumbersResponse;
    }

    public final AccountNumbersDataState copy(boolean isSecondaryAuthenticated, AccountNumbersResponseDto accountNumbersResponse) {
        return new AccountNumbersDataState(isSecondaryAuthenticated, accountNumbersResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountNumbersDataState)) {
            return false;
        }
        AccountNumbersDataState accountNumbersDataState = (AccountNumbersDataState) other;
        return this.isSecondaryAuthenticated == accountNumbersDataState.isSecondaryAuthenticated && Intrinsics.areEqual(this.accountNumbersResponse, accountNumbersDataState.accountNumbersResponse);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSecondaryAuthenticated) * 31;
        AccountNumbersResponseDto accountNumbersResponseDto = this.accountNumbersResponse;
        return iHashCode + (accountNumbersResponseDto == null ? 0 : accountNumbersResponseDto.hashCode());
    }

    public String toString() {
        return "AccountNumbersDataState(isSecondaryAuthenticated=" + this.isSecondaryAuthenticated + ", accountNumbersResponse=" + this.accountNumbersResponse + ")";
    }

    public AccountNumbersDataState(boolean z, AccountNumbersResponseDto accountNumbersResponseDto) {
        this.isSecondaryAuthenticated = z;
        this.accountNumbersResponse = accountNumbersResponseDto;
    }

    public /* synthetic */ AccountNumbersDataState(boolean z, AccountNumbersResponseDto accountNumbersResponseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : accountNumbersResponseDto);
    }

    public final boolean isSecondaryAuthenticated() {
        return this.isSecondaryAuthenticated;
    }

    public final AccountNumbersResponseDto getAccountNumbersResponse() {
        return this.accountNumbersResponse;
    }
}
