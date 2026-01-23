package com.robinhood.android.directdeposit.p101ui.p102v3;

import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositV3ManualSetupViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupViewState;", "", "routingDetails", "Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;", "emailStatus", "Lcom/robinhood/android/directdeposit/ui/v3/EmailStatus;", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;Lcom/robinhood/android/directdeposit/ui/v3/EmailStatus;)V", "getRoutingDetails", "()Lcom/robinhood/librobinhood/data/store/AccountRoutingDetailsStore$RoutingDetails;", "getEmailStatus", "()Lcom/robinhood/android/directdeposit/ui/v3/EmailStatus;", "isEmailSending", "", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final /* data */ class DirectDepositV3ManualSetupViewState {
    public static final int $stable = 8;
    private final DirectDepositV3ManualSetupViewState2 emailStatus;
    private final AccountRoutingDetailsStore.RoutingDetails routingDetails;

    /* JADX WARN: Multi-variable type inference failed */
    public DirectDepositV3ManualSetupViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DirectDepositV3ManualSetupViewState copy$default(DirectDepositV3ManualSetupViewState directDepositV3ManualSetupViewState, AccountRoutingDetailsStore.RoutingDetails routingDetails, DirectDepositV3ManualSetupViewState2 directDepositV3ManualSetupViewState2, int i, Object obj) {
        if ((i & 1) != 0) {
            routingDetails = directDepositV3ManualSetupViewState.routingDetails;
        }
        if ((i & 2) != 0) {
            directDepositV3ManualSetupViewState2 = directDepositV3ManualSetupViewState.emailStatus;
        }
        return directDepositV3ManualSetupViewState.copy(routingDetails, directDepositV3ManualSetupViewState2);
    }

    /* renamed from: component1, reason: from getter */
    public final AccountRoutingDetailsStore.RoutingDetails getRoutingDetails() {
        return this.routingDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final DirectDepositV3ManualSetupViewState2 getEmailStatus() {
        return this.emailStatus;
    }

    public final DirectDepositV3ManualSetupViewState copy(AccountRoutingDetailsStore.RoutingDetails routingDetails, DirectDepositV3ManualSetupViewState2 emailStatus) {
        Intrinsics.checkNotNullParameter(emailStatus, "emailStatus");
        return new DirectDepositV3ManualSetupViewState(routingDetails, emailStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectDepositV3ManualSetupViewState)) {
            return false;
        }
        DirectDepositV3ManualSetupViewState directDepositV3ManualSetupViewState = (DirectDepositV3ManualSetupViewState) other;
        return Intrinsics.areEqual(this.routingDetails, directDepositV3ManualSetupViewState.routingDetails) && this.emailStatus == directDepositV3ManualSetupViewState.emailStatus;
    }

    public int hashCode() {
        AccountRoutingDetailsStore.RoutingDetails routingDetails = this.routingDetails;
        return ((routingDetails == null ? 0 : routingDetails.hashCode()) * 31) + this.emailStatus.hashCode();
    }

    public String toString() {
        return "DirectDepositV3ManualSetupViewState(routingDetails=" + this.routingDetails + ", emailStatus=" + this.emailStatus + ")";
    }

    public DirectDepositV3ManualSetupViewState(AccountRoutingDetailsStore.RoutingDetails routingDetails, DirectDepositV3ManualSetupViewState2 emailStatus) {
        Intrinsics.checkNotNullParameter(emailStatus, "emailStatus");
        this.routingDetails = routingDetails;
        this.emailStatus = emailStatus;
    }

    public final AccountRoutingDetailsStore.RoutingDetails getRoutingDetails() {
        return this.routingDetails;
    }

    public /* synthetic */ DirectDepositV3ManualSetupViewState(AccountRoutingDetailsStore.RoutingDetails routingDetails, DirectDepositV3ManualSetupViewState2 directDepositV3ManualSetupViewState2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : routingDetails, (i & 2) != 0 ? DirectDepositV3ManualSetupViewState2.READY_TO_EMAIL : directDepositV3ManualSetupViewState2);
    }

    public final DirectDepositV3ManualSetupViewState2 getEmailStatus() {
        return this.emailStatus;
    }

    public final boolean isEmailSending() {
        return this.emailStatus == DirectDepositV3ManualSetupViewState2.EMAIL_SENDING;
    }
}
