package com.robinhood.android.slip.lib.history;

import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.SlipGroupedPayment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipGroupedPaymentDetailState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/slip/lib/history/SlipGroupedPaymentDetailDataState;", "", "slipPayment", "Lcom/robinhood/models/db/SlipGroupedPayment;", "account", "Lcom/robinhood/models/db/Account;", "error", "", "<init>", "(Lcom/robinhood/models/db/SlipGroupedPayment;Lcom/robinhood/models/db/Account;Ljava/lang/Throwable;)V", "getSlipPayment", "()Lcom/robinhood/models/db/SlipGroupedPayment;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SlipGroupedPaymentDetailDataState {
    public static final int $stable = 8;
    private final Account account;
    private final Throwable error;
    private final SlipGroupedPayment slipPayment;

    public SlipGroupedPaymentDetailDataState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SlipGroupedPaymentDetailDataState copy$default(SlipGroupedPaymentDetailDataState slipGroupedPaymentDetailDataState, SlipGroupedPayment slipGroupedPayment, Account account, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            slipGroupedPayment = slipGroupedPaymentDetailDataState.slipPayment;
        }
        if ((i & 2) != 0) {
            account = slipGroupedPaymentDetailDataState.account;
        }
        if ((i & 4) != 0) {
            th = slipGroupedPaymentDetailDataState.error;
        }
        return slipGroupedPaymentDetailDataState.copy(slipGroupedPayment, account, th);
    }

    /* renamed from: component1, reason: from getter */
    public final SlipGroupedPayment getSlipPayment() {
        return this.slipPayment;
    }

    /* renamed from: component2, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final SlipGroupedPaymentDetailDataState copy(SlipGroupedPayment slipPayment, Account account, Throwable error) {
        return new SlipGroupedPaymentDetailDataState(slipPayment, account, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlipGroupedPaymentDetailDataState)) {
            return false;
        }
        SlipGroupedPaymentDetailDataState slipGroupedPaymentDetailDataState = (SlipGroupedPaymentDetailDataState) other;
        return Intrinsics.areEqual(this.slipPayment, slipGroupedPaymentDetailDataState.slipPayment) && Intrinsics.areEqual(this.account, slipGroupedPaymentDetailDataState.account) && Intrinsics.areEqual(this.error, slipGroupedPaymentDetailDataState.error);
    }

    public int hashCode() {
        SlipGroupedPayment slipGroupedPayment = this.slipPayment;
        int iHashCode = (slipGroupedPayment == null ? 0 : slipGroupedPayment.hashCode()) * 31;
        Account account = this.account;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        Throwable th = this.error;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "SlipGroupedPaymentDetailDataState(slipPayment=" + this.slipPayment + ", account=" + this.account + ", error=" + this.error + ")";
    }

    public SlipGroupedPaymentDetailDataState(SlipGroupedPayment slipGroupedPayment, Account account, Throwable th) {
        this.slipPayment = slipGroupedPayment;
        this.account = account;
        this.error = th;
    }

    public /* synthetic */ SlipGroupedPaymentDetailDataState(SlipGroupedPayment slipGroupedPayment, Account account, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : slipGroupedPayment, (i & 2) != 0 ? null : account, (i & 4) != 0 ? null : th);
    }

    public final SlipGroupedPayment getSlipPayment() {
        return this.slipPayment;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final Throwable getError() {
        return this.error;
    }
}
