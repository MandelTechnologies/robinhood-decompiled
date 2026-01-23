package com.robinhood.android.directdeposit.p101ui.intro;

import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositBranchV2DataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/intro/DirectDepositBranchV2DataState;", "", "routingDetails", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;", "emailDetailsSent", "Lcom/robinhood/udf/UiEvent;", "", "email", "", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;Lcom/robinhood/udf/UiEvent;Ljava/lang/String;)V", "getRoutingDetails", "()Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;", "getEmailDetailsSent", "()Lcom/robinhood/udf/UiEvent;", "getEmail", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final /* data */ class DirectDepositBranchV2DataState {
    public static final int $stable = 8;
    private final String email;
    private final UiEvent<Unit> emailDetailsSent;
    private final AccountRoutingDetailsStore.RoutingDetails routingDetails;

    public DirectDepositBranchV2DataState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DirectDepositBranchV2DataState copy$default(DirectDepositBranchV2DataState directDepositBranchV2DataState, AccountRoutingDetailsStore.RoutingDetails routingDetails, UiEvent uiEvent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            routingDetails = directDepositBranchV2DataState.routingDetails;
        }
        if ((i & 2) != 0) {
            uiEvent = directDepositBranchV2DataState.emailDetailsSent;
        }
        if ((i & 4) != 0) {
            str = directDepositBranchV2DataState.email;
        }
        return directDepositBranchV2DataState.copy(routingDetails, uiEvent, str);
    }

    /* renamed from: component1, reason: from getter */
    public final AccountRoutingDetailsStore.RoutingDetails getRoutingDetails() {
        return this.routingDetails;
    }

    public final UiEvent<Unit> component2() {
        return this.emailDetailsSent;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final DirectDepositBranchV2DataState copy(AccountRoutingDetailsStore.RoutingDetails routingDetails, UiEvent<Unit> emailDetailsSent, String email) {
        return new DirectDepositBranchV2DataState(routingDetails, emailDetailsSent, email);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectDepositBranchV2DataState)) {
            return false;
        }
        DirectDepositBranchV2DataState directDepositBranchV2DataState = (DirectDepositBranchV2DataState) other;
        return Intrinsics.areEqual(this.routingDetails, directDepositBranchV2DataState.routingDetails) && Intrinsics.areEqual(this.emailDetailsSent, directDepositBranchV2DataState.emailDetailsSent) && Intrinsics.areEqual(this.email, directDepositBranchV2DataState.email);
    }

    public int hashCode() {
        AccountRoutingDetailsStore.RoutingDetails routingDetails = this.routingDetails;
        int iHashCode = (routingDetails == null ? 0 : routingDetails.hashCode()) * 31;
        UiEvent<Unit> uiEvent = this.emailDetailsSent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        String str = this.email;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DirectDepositBranchV2DataState(routingDetails=" + this.routingDetails + ", emailDetailsSent=" + this.emailDetailsSent + ", email=" + this.email + ")";
    }

    public DirectDepositBranchV2DataState(AccountRoutingDetailsStore.RoutingDetails routingDetails, UiEvent<Unit> uiEvent, String str) {
        this.routingDetails = routingDetails;
        this.emailDetailsSent = uiEvent;
        this.email = str;
    }

    public /* synthetic */ DirectDepositBranchV2DataState(AccountRoutingDetailsStore.RoutingDetails routingDetails, UiEvent uiEvent, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : routingDetails, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : str);
    }

    public final AccountRoutingDetailsStore.RoutingDetails getRoutingDetails() {
        return this.routingDetails;
    }

    public final UiEvent<Unit> getEmailDetailsSent() {
        return this.emailDetailsSent;
    }

    public final String getEmail() {
        return this.email;
    }
}
