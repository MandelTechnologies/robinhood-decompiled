package com.robinhood.android.lib.accountswitcher.sdui;

import contracts.account_switcher.proto.p427v1.GetAccountSwitcherResponseDto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiAccountSwitcherViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/accountswitcher/sdui/SduiAccountSwitcherViewState;", "", "accountSwitcherResponseDto", "Lcontracts/account_switcher/proto/v1/GetAccountSwitcherResponseDto;", "<init>", "(Lcontracts/account_switcher/proto/v1/GetAccountSwitcherResponseDto;)V", "getAccountSwitcherResponseDto", "()Lcontracts/account_switcher/proto/v1/GetAccountSwitcherResponseDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SduiAccountSwitcherViewState {
    public static final int $stable = 8;
    private final GetAccountSwitcherResponseDto accountSwitcherResponseDto;

    /* JADX WARN: Multi-variable type inference failed */
    public SduiAccountSwitcherViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SduiAccountSwitcherViewState copy$default(SduiAccountSwitcherViewState sduiAccountSwitcherViewState, GetAccountSwitcherResponseDto getAccountSwitcherResponseDto, int i, Object obj) {
        if ((i & 1) != 0) {
            getAccountSwitcherResponseDto = sduiAccountSwitcherViewState.accountSwitcherResponseDto;
        }
        return sduiAccountSwitcherViewState.copy(getAccountSwitcherResponseDto);
    }

    /* renamed from: component1, reason: from getter */
    public final GetAccountSwitcherResponseDto getAccountSwitcherResponseDto() {
        return this.accountSwitcherResponseDto;
    }

    public final SduiAccountSwitcherViewState copy(GetAccountSwitcherResponseDto accountSwitcherResponseDto) {
        return new SduiAccountSwitcherViewState(accountSwitcherResponseDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SduiAccountSwitcherViewState) && Intrinsics.areEqual(this.accountSwitcherResponseDto, ((SduiAccountSwitcherViewState) other).accountSwitcherResponseDto);
    }

    public int hashCode() {
        GetAccountSwitcherResponseDto getAccountSwitcherResponseDto = this.accountSwitcherResponseDto;
        if (getAccountSwitcherResponseDto == null) {
            return 0;
        }
        return getAccountSwitcherResponseDto.hashCode();
    }

    public String toString() {
        return "SduiAccountSwitcherViewState(accountSwitcherResponseDto=" + this.accountSwitcherResponseDto + ")";
    }

    public SduiAccountSwitcherViewState(GetAccountSwitcherResponseDto getAccountSwitcherResponseDto) {
        this.accountSwitcherResponseDto = getAccountSwitcherResponseDto;
    }

    public /* synthetic */ SduiAccountSwitcherViewState(GetAccountSwitcherResponseDto getAccountSwitcherResponseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : getAccountSwitcherResponseDto);
    }

    public final GetAccountSwitcherResponseDto getAccountSwitcherResponseDto() {
        return this.accountSwitcherResponseDto;
    }
}
