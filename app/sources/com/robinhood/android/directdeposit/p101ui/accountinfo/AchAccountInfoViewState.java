package com.robinhood.android.directdeposit.p101ui.accountinfo;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchAccountInfoDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoViewState;", "", "contentState", "Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoViewState$ContentState;", "showAccountNumber", "", "toggleWithdrawalsLockedPending", "toggleWithdrawalsLockedThrowable", "Lcom/robinhood/udf/UiEvent;", "", "withdrawalsLocked", "<init>", "(Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoViewState$ContentState;ZZLcom/robinhood/udf/UiEvent;Z)V", "getContentState", "()Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoViewState$ContentState;", "getShowAccountNumber", "()Z", "getToggleWithdrawalsLockedPending", "getToggleWithdrawalsLockedThrowable", "()Lcom/robinhood/udf/UiEvent;", "getWithdrawalsLocked", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "ContentState", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final /* data */ class AchAccountInfoViewState {
    public static final int $stable = 8;
    private final ContentState contentState;
    private final boolean showAccountNumber;
    private final boolean toggleWithdrawalsLockedPending;
    private final UiEvent<Throwable> toggleWithdrawalsLockedThrowable;
    private final boolean withdrawalsLocked;

    public AchAccountInfoViewState() {
        this(null, false, false, null, false, 31, null);
    }

    public static /* synthetic */ AchAccountInfoViewState copy$default(AchAccountInfoViewState achAccountInfoViewState, ContentState contentState, boolean z, boolean z2, UiEvent uiEvent, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            contentState = achAccountInfoViewState.contentState;
        }
        if ((i & 2) != 0) {
            z = achAccountInfoViewState.showAccountNumber;
        }
        if ((i & 4) != 0) {
            z2 = achAccountInfoViewState.toggleWithdrawalsLockedPending;
        }
        if ((i & 8) != 0) {
            uiEvent = achAccountInfoViewState.toggleWithdrawalsLockedThrowable;
        }
        if ((i & 16) != 0) {
            z3 = achAccountInfoViewState.withdrawalsLocked;
        }
        boolean z4 = z3;
        boolean z5 = z2;
        return achAccountInfoViewState.copy(contentState, z, z5, uiEvent, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final ContentState getContentState() {
        return this.contentState;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowAccountNumber() {
        return this.showAccountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getToggleWithdrawalsLockedPending() {
        return this.toggleWithdrawalsLockedPending;
    }

    public final UiEvent<Throwable> component4() {
        return this.toggleWithdrawalsLockedThrowable;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getWithdrawalsLocked() {
        return this.withdrawalsLocked;
    }

    public final AchAccountInfoViewState copy(ContentState contentState, boolean showAccountNumber, boolean toggleWithdrawalsLockedPending, UiEvent<Throwable> toggleWithdrawalsLockedThrowable, boolean withdrawalsLocked) {
        return new AchAccountInfoViewState(contentState, showAccountNumber, toggleWithdrawalsLockedPending, toggleWithdrawalsLockedThrowable, withdrawalsLocked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AchAccountInfoViewState)) {
            return false;
        }
        AchAccountInfoViewState achAccountInfoViewState = (AchAccountInfoViewState) other;
        return Intrinsics.areEqual(this.contentState, achAccountInfoViewState.contentState) && this.showAccountNumber == achAccountInfoViewState.showAccountNumber && this.toggleWithdrawalsLockedPending == achAccountInfoViewState.toggleWithdrawalsLockedPending && Intrinsics.areEqual(this.toggleWithdrawalsLockedThrowable, achAccountInfoViewState.toggleWithdrawalsLockedThrowable) && this.withdrawalsLocked == achAccountInfoViewState.withdrawalsLocked;
    }

    public int hashCode() {
        ContentState contentState = this.contentState;
        int iHashCode = (((((contentState == null ? 0 : contentState.hashCode()) * 31) + Boolean.hashCode(this.showAccountNumber)) * 31) + Boolean.hashCode(this.toggleWithdrawalsLockedPending)) * 31;
        UiEvent<Throwable> uiEvent = this.toggleWithdrawalsLockedThrowable;
        return ((iHashCode + (uiEvent != null ? uiEvent.hashCode() : 0)) * 31) + Boolean.hashCode(this.withdrawalsLocked);
    }

    public String toString() {
        return "AchAccountInfoViewState(contentState=" + this.contentState + ", showAccountNumber=" + this.showAccountNumber + ", toggleWithdrawalsLockedPending=" + this.toggleWithdrawalsLockedPending + ", toggleWithdrawalsLockedThrowable=" + this.toggleWithdrawalsLockedThrowable + ", withdrawalsLocked=" + this.withdrawalsLocked + ")";
    }

    public AchAccountInfoViewState(ContentState contentState, boolean z, boolean z2, UiEvent<Throwable> uiEvent, boolean z3) {
        this.contentState = contentState;
        this.showAccountNumber = z;
        this.toggleWithdrawalsLockedPending = z2;
        this.toggleWithdrawalsLockedThrowable = uiEvent;
        this.withdrawalsLocked = z3;
    }

    public /* synthetic */ AchAccountInfoViewState(ContentState contentState, boolean z, boolean z2, UiEvent uiEvent, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : contentState, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : uiEvent, (i & 16) != 0 ? false : z3);
    }

    public final ContentState getContentState() {
        return this.contentState;
    }

    public final boolean getShowAccountNumber() {
        return this.showAccountNumber;
    }

    public final boolean getToggleWithdrawalsLockedPending() {
        return this.toggleWithdrawalsLockedPending;
    }

    public final UiEvent<Throwable> getToggleWithdrawalsLockedThrowable() {
        return this.toggleWithdrawalsLockedThrowable;
    }

    public final boolean getWithdrawalsLocked() {
        return this.withdrawalsLocked;
    }

    /* compiled from: AchAccountInfoDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoViewState$ContentState;", "", "<init>", "()V", "Failure", "Success", "Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoViewState$ContentState$Failure;", "Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoViewState$ContentState$Success;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ContentState {
        public static final int $stable = 0;

        public /* synthetic */ ContentState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: AchAccountInfoDuxo.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoViewState$ContentState$Failure;", "Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoViewState$ContentState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Failure extends ContentState {
            public static final int $stable = 0;
            public static final Failure INSTANCE = new Failure();

            public boolean equals(Object other) {
                return this == other || (other instanceof Failure);
            }

            public int hashCode() {
                return -1396169301;
            }

            public String toString() {
                return "Failure";
            }

            private Failure() {
                super(null);
            }
        }

        private ContentState() {
        }

        /* compiled from: AchAccountInfoDuxo.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoViewState$ContentState$Success;", "Lcom/robinhood/android/directdeposit/ui/accountinfo/AchAccountInfoViewState$ContentState;", "accountNumber", "", "routingNumber", "fullBankName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getRoutingNumber", "getFullBankName", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends ContentState {
            public static final int $stable = 0;
            private final String accountNumber;
            private final String fullBankName;
            private final String routingNumber;

            public static /* synthetic */ Success copy$default(Success success, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.accountNumber;
                }
                if ((i & 2) != 0) {
                    str2 = success.routingNumber;
                }
                if ((i & 4) != 0) {
                    str3 = success.fullBankName;
                }
                return success.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAccountNumber() {
                return this.accountNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final String getRoutingNumber() {
                return this.routingNumber;
            }

            /* renamed from: component3, reason: from getter */
            public final String getFullBankName() {
                return this.fullBankName;
            }

            public final Success copy(String accountNumber, String routingNumber, String fullBankName) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
                Intrinsics.checkNotNullParameter(fullBankName, "fullBankName");
                return new Success(accountNumber, routingNumber, fullBankName);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.areEqual(this.accountNumber, success.accountNumber) && Intrinsics.areEqual(this.routingNumber, success.routingNumber) && Intrinsics.areEqual(this.fullBankName, success.fullBankName);
            }

            public int hashCode() {
                return (((this.accountNumber.hashCode() * 31) + this.routingNumber.hashCode()) * 31) + this.fullBankName.hashCode();
            }

            public String toString() {
                return "Success(accountNumber=" + this.accountNumber + ", routingNumber=" + this.routingNumber + ", fullBankName=" + this.fullBankName + ")";
            }

            public final String getAccountNumber() {
                return this.accountNumber;
            }

            public final String getRoutingNumber() {
                return this.routingNumber;
            }

            public final String getFullBankName() {
                return this.fullBankName;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(String accountNumber, String routingNumber, String fullBankName) {
                super(null);
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                Intrinsics.checkNotNullParameter(routingNumber, "routingNumber");
                Intrinsics.checkNotNullParameter(fullBankName, "fullBankName");
                this.accountNumber = accountNumber;
                this.routingNumber = routingNumber;
                this.fullBankName = fullBankName;
            }
        }
    }
}
