package com.robinhood.android.rhymigration.p245ui.directdeposit;

import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyDirectDepositViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0014\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/directdeposit/RhyDirectDepositViewState;", "", "routingDetails", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;", "email", "", "routingDetailsError", "Lcom/robinhood/udf/UiEvent;", "", "emailDetailsClicked", "", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;Ljava/lang/String;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getEmail", "()Ljava/lang/String;", "getRoutingDetailsError", "()Lcom/robinhood/udf/UiEvent;", "getEmailDetailsClicked", "routingNumber", "getRoutingNumber", "accountNumber", "getAccountNumber", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyDirectDepositViewState {
    public static final int $stable = 8;
    private final String email;
    private final UiEvent<Boolean> emailDetailsClicked;
    private final AccountRoutingDetailsStore.RoutingDetails routingDetails;
    private final UiEvent<Throwable> routingDetailsError;

    public RhyDirectDepositViewState() {
        this(null, null, null, null, 15, null);
    }

    /* renamed from: component1, reason: from getter */
    private final AccountRoutingDetailsStore.RoutingDetails getRoutingDetails() {
        return this.routingDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RhyDirectDepositViewState copy$default(RhyDirectDepositViewState rhyDirectDepositViewState, AccountRoutingDetailsStore.RoutingDetails routingDetails, String str, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            routingDetails = rhyDirectDepositViewState.routingDetails;
        }
        if ((i & 2) != 0) {
            str = rhyDirectDepositViewState.email;
        }
        if ((i & 4) != 0) {
            uiEvent = rhyDirectDepositViewState.routingDetailsError;
        }
        if ((i & 8) != 0) {
            uiEvent2 = rhyDirectDepositViewState.emailDetailsClicked;
        }
        return rhyDirectDepositViewState.copy(routingDetails, str, uiEvent, uiEvent2);
    }

    /* renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final UiEvent<Throwable> component3() {
        return this.routingDetailsError;
    }

    public final UiEvent<Boolean> component4() {
        return this.emailDetailsClicked;
    }

    public final RhyDirectDepositViewState copy(AccountRoutingDetailsStore.RoutingDetails routingDetails, String email, UiEvent<Throwable> routingDetailsError, UiEvent<Boolean> emailDetailsClicked) {
        return new RhyDirectDepositViewState(routingDetails, email, routingDetailsError, emailDetailsClicked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyDirectDepositViewState)) {
            return false;
        }
        RhyDirectDepositViewState rhyDirectDepositViewState = (RhyDirectDepositViewState) other;
        return Intrinsics.areEqual(this.routingDetails, rhyDirectDepositViewState.routingDetails) && Intrinsics.areEqual(this.email, rhyDirectDepositViewState.email) && Intrinsics.areEqual(this.routingDetailsError, rhyDirectDepositViewState.routingDetailsError) && Intrinsics.areEqual(this.emailDetailsClicked, rhyDirectDepositViewState.emailDetailsClicked);
    }

    public int hashCode() {
        AccountRoutingDetailsStore.RoutingDetails routingDetails = this.routingDetails;
        int iHashCode = (routingDetails == null ? 0 : routingDetails.hashCode()) * 31;
        String str = this.email;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.routingDetailsError;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Boolean> uiEvent2 = this.emailDetailsClicked;
        return iHashCode3 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "RhyDirectDepositViewState(routingDetails=" + this.routingDetails + ", email=" + this.email + ", routingDetailsError=" + this.routingDetailsError + ", emailDetailsClicked=" + this.emailDetailsClicked + ")";
    }

    public RhyDirectDepositViewState(AccountRoutingDetailsStore.RoutingDetails routingDetails, String str, UiEvent<Throwable> uiEvent, UiEvent<Boolean> uiEvent2) {
        this.routingDetails = routingDetails;
        this.email = str;
        this.routingDetailsError = uiEvent;
        this.emailDetailsClicked = uiEvent2;
    }

    public /* synthetic */ RhyDirectDepositViewState(AccountRoutingDetailsStore.RoutingDetails routingDetails, String str, UiEvent uiEvent, UiEvent uiEvent2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : routingDetails, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : uiEvent, (i & 8) != 0 ? null : uiEvent2);
    }

    public final String getEmail() {
        return this.email;
    }

    public final UiEvent<Throwable> getRoutingDetailsError() {
        return this.routingDetailsError;
    }

    public final UiEvent<Boolean> getEmailDetailsClicked() {
        return this.emailDetailsClicked;
    }

    public final String getRoutingNumber() {
        String routingNumber;
        AccountRoutingDetailsStore.RoutingDetails routingDetails = this.routingDetails;
        return (routingDetails == null || (routingNumber = routingDetails.getRoutingNumber()) == null) ? "" : routingNumber;
    }

    public final String getAccountNumber() {
        String accountNumber;
        AccountRoutingDetailsStore.RoutingDetails routingDetails = this.routingDetails;
        return (routingDetails == null || (accountNumber = routingDetails.getAccountNumber()) == null) ? "" : accountNumber;
    }
}
