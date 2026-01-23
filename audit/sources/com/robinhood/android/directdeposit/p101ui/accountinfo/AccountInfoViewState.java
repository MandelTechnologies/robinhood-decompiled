package com.robinhood.android.directdeposit.p101ui.accountinfo;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountInfoViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/accountinfo/AccountInfoViewState;", "", "routingDetails", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;", "fullName", "", "routingDetailsError", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;Ljava/lang/String;Lcom/robinhood/udf/UiEvent;)V", "getRoutingDetails", "()Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;", "getFullName", "()Ljava/lang/String;", "getRoutingDetailsError", "()Lcom/robinhood/udf/UiEvent;", "summaryText", "Lcom/robinhood/utils/resource/StringResource;", "getSummaryText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final /* data */ class AccountInfoViewState {
    public static final int $stable = 8;
    private final String fullName;
    private final AccountRoutingDetailsStore.RoutingDetails routingDetails;
    private final UiEvent<Throwable> routingDetailsError;

    public AccountInfoViewState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountInfoViewState copy$default(AccountInfoViewState accountInfoViewState, AccountRoutingDetailsStore.RoutingDetails routingDetails, String str, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            routingDetails = accountInfoViewState.routingDetails;
        }
        if ((i & 2) != 0) {
            str = accountInfoViewState.fullName;
        }
        if ((i & 4) != 0) {
            uiEvent = accountInfoViewState.routingDetailsError;
        }
        return accountInfoViewState.copy(routingDetails, str, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final AccountRoutingDetailsStore.RoutingDetails getRoutingDetails() {
        return this.routingDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    public final UiEvent<Throwable> component3() {
        return this.routingDetailsError;
    }

    public final AccountInfoViewState copy(AccountRoutingDetailsStore.RoutingDetails routingDetails, String fullName, UiEvent<Throwable> routingDetailsError) {
        return new AccountInfoViewState(routingDetails, fullName, routingDetailsError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountInfoViewState)) {
            return false;
        }
        AccountInfoViewState accountInfoViewState = (AccountInfoViewState) other;
        return Intrinsics.areEqual(this.routingDetails, accountInfoViewState.routingDetails) && Intrinsics.areEqual(this.fullName, accountInfoViewState.fullName) && Intrinsics.areEqual(this.routingDetailsError, accountInfoViewState.routingDetailsError);
    }

    public int hashCode() {
        AccountRoutingDetailsStore.RoutingDetails routingDetails = this.routingDetails;
        int iHashCode = (routingDetails == null ? 0 : routingDetails.hashCode()) * 31;
        String str = this.fullName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.routingDetailsError;
        return iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "AccountInfoViewState(routingDetails=" + this.routingDetails + ", fullName=" + this.fullName + ", routingDetailsError=" + this.routingDetailsError + ")";
    }

    public AccountInfoViewState(AccountRoutingDetailsStore.RoutingDetails routingDetails, String str, UiEvent<Throwable> uiEvent) {
        this.routingDetails = routingDetails;
        this.fullName = str;
        this.routingDetailsError = uiEvent;
    }

    public /* synthetic */ AccountInfoViewState(AccountRoutingDetailsStore.RoutingDetails routingDetails, String str, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : routingDetails, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : uiEvent);
    }

    public final AccountRoutingDetailsStore.RoutingDetails getRoutingDetails() {
        return this.routingDetails;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final UiEvent<Throwable> getRoutingDetailsError() {
        return this.routingDetailsError;
    }

    public final StringResource getSummaryText() {
        int i;
        AccountRoutingDetailsStore.RoutingDetails routingDetails = this.routingDetails;
        if (routingDetails == null) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = C14044R.string.direct_deposit_account_info_summary;
        if (routingDetails instanceof AccountRoutingDetailsStore.RoutingDetails.CashManagement) {
            i = C11048R.string.general_label_robinhood;
        } else {
            if (!(routingDetails instanceof AccountRoutingDetailsStore.RoutingDetails.RhySpending)) {
                throw new NoWhenBranchMatchedException();
            }
            i = C14044R.string.direct_deposit_confirmation_account_spending;
        }
        return companion.invoke(i2, companion.invoke(i, new Object[0]));
    }
}
