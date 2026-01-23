package com.robinhood.android.acatsin.coowner.review;

import com.robinhood.android.acatsin.util.names.NamesOnAccount;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInCoOwnerReviewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDataState;", "", "acatsTransfer", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "account", "Lcom/robinhood/models/db/Account;", "namesOnAccount", "Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "isCancelRequestInProgress", "", "<init>", "(Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;Lcom/robinhood/models/db/Account;Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;Z)V", "getAcatsTransfer", "()Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getNamesOnAccount", "()Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInCoOwnerReviewDataState {
    public static final int $stable = 8;
    private final AcatsTransfer acatsTransfer;
    private final Account account;
    private final boolean isCancelRequestInProgress;
    private final NamesOnAccount namesOnAccount;

    public AcatsInCoOwnerReviewDataState() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ AcatsInCoOwnerReviewDataState copy$default(AcatsInCoOwnerReviewDataState acatsInCoOwnerReviewDataState, AcatsTransfer acatsTransfer, Account account, NamesOnAccount namesOnAccount, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            acatsTransfer = acatsInCoOwnerReviewDataState.acatsTransfer;
        }
        if ((i & 2) != 0) {
            account = acatsInCoOwnerReviewDataState.account;
        }
        if ((i & 4) != 0) {
            namesOnAccount = acatsInCoOwnerReviewDataState.namesOnAccount;
        }
        if ((i & 8) != 0) {
            z = acatsInCoOwnerReviewDataState.isCancelRequestInProgress;
        }
        return acatsInCoOwnerReviewDataState.copy(acatsTransfer, account, namesOnAccount, z);
    }

    /* renamed from: component1, reason: from getter */
    public final AcatsTransfer getAcatsTransfer() {
        return this.acatsTransfer;
    }

    /* renamed from: component2, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component3, reason: from getter */
    public final NamesOnAccount getNamesOnAccount() {
        return this.namesOnAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCancelRequestInProgress() {
        return this.isCancelRequestInProgress;
    }

    public final AcatsInCoOwnerReviewDataState copy(AcatsTransfer acatsTransfer, Account account, NamesOnAccount namesOnAccount, boolean isCancelRequestInProgress) {
        return new AcatsInCoOwnerReviewDataState(acatsTransfer, account, namesOnAccount, isCancelRequestInProgress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInCoOwnerReviewDataState)) {
            return false;
        }
        AcatsInCoOwnerReviewDataState acatsInCoOwnerReviewDataState = (AcatsInCoOwnerReviewDataState) other;
        return Intrinsics.areEqual(this.acatsTransfer, acatsInCoOwnerReviewDataState.acatsTransfer) && Intrinsics.areEqual(this.account, acatsInCoOwnerReviewDataState.account) && Intrinsics.areEqual(this.namesOnAccount, acatsInCoOwnerReviewDataState.namesOnAccount) && this.isCancelRequestInProgress == acatsInCoOwnerReviewDataState.isCancelRequestInProgress;
    }

    public int hashCode() {
        AcatsTransfer acatsTransfer = this.acatsTransfer;
        int iHashCode = (acatsTransfer == null ? 0 : acatsTransfer.hashCode()) * 31;
        Account account = this.account;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        NamesOnAccount namesOnAccount = this.namesOnAccount;
        return ((iHashCode2 + (namesOnAccount != null ? namesOnAccount.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCancelRequestInProgress);
    }

    public String toString() {
        return "AcatsInCoOwnerReviewDataState(acatsTransfer=" + this.acatsTransfer + ", account=" + this.account + ", namesOnAccount=" + this.namesOnAccount + ", isCancelRequestInProgress=" + this.isCancelRequestInProgress + ")";
    }

    public AcatsInCoOwnerReviewDataState(AcatsTransfer acatsTransfer, Account account, NamesOnAccount namesOnAccount, boolean z) {
        this.acatsTransfer = acatsTransfer;
        this.account = account;
        this.namesOnAccount = namesOnAccount;
        this.isCancelRequestInProgress = z;
    }

    public /* synthetic */ AcatsInCoOwnerReviewDataState(AcatsTransfer acatsTransfer, Account account, NamesOnAccount namesOnAccount, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : acatsTransfer, (i & 2) != 0 ? null : account, (i & 4) != 0 ? null : namesOnAccount, (i & 8) != 0 ? false : z);
    }

    public final AcatsTransfer getAcatsTransfer() {
        return this.acatsTransfer;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final NamesOnAccount getNamesOnAccount() {
        return this.namesOnAccount;
    }

    public final boolean isCancelRequestInProgress() {
        return this.isCancelRequestInProgress;
    }
}
