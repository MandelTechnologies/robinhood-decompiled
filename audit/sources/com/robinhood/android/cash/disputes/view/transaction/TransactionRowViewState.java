package com.robinhood.android.cash.disputes.view.transaction;

import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionRowViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÂ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/view/transaction/TransactionRowViewState;", "", "transactionSecondaryText", "", "isDuplicateTransaction", "", "primaryText", "metadataText", "<init>", "(Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getPrimaryText", "()Ljava/lang/CharSequence;", "getMetadataText", "secondaryText", "Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TransactionRowViewState {
    public static final int $stable = 8;
    private final boolean isDuplicateTransaction;
    private final CharSequence metadataText;
    private final CharSequence primaryText;
    private final CharSequence transactionSecondaryText;

    public TransactionRowViewState() {
        this(null, false, null, null, 15, null);
    }

    /* renamed from: component1, reason: from getter */
    private final CharSequence getTransactionSecondaryText() {
        return this.transactionSecondaryText;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getIsDuplicateTransaction() {
        return this.isDuplicateTransaction;
    }

    public static /* synthetic */ TransactionRowViewState copy$default(TransactionRowViewState transactionRowViewState, CharSequence charSequence, boolean z, CharSequence charSequence2, CharSequence charSequence3, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = transactionRowViewState.transactionSecondaryText;
        }
        if ((i & 2) != 0) {
            z = transactionRowViewState.isDuplicateTransaction;
        }
        if ((i & 4) != 0) {
            charSequence2 = transactionRowViewState.primaryText;
        }
        if ((i & 8) != 0) {
            charSequence3 = transactionRowViewState.metadataText;
        }
        return transactionRowViewState.copy(charSequence, z, charSequence2, charSequence3);
    }

    /* renamed from: component3, reason: from getter */
    public final CharSequence getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component4, reason: from getter */
    public final CharSequence getMetadataText() {
        return this.metadataText;
    }

    public final TransactionRowViewState copy(CharSequence transactionSecondaryText, boolean isDuplicateTransaction, CharSequence primaryText, CharSequence metadataText) {
        return new TransactionRowViewState(transactionSecondaryText, isDuplicateTransaction, primaryText, metadataText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionRowViewState)) {
            return false;
        }
        TransactionRowViewState transactionRowViewState = (TransactionRowViewState) other;
        return Intrinsics.areEqual(this.transactionSecondaryText, transactionRowViewState.transactionSecondaryText) && this.isDuplicateTransaction == transactionRowViewState.isDuplicateTransaction && Intrinsics.areEqual(this.primaryText, transactionRowViewState.primaryText) && Intrinsics.areEqual(this.metadataText, transactionRowViewState.metadataText);
    }

    public int hashCode() {
        CharSequence charSequence = this.transactionSecondaryText;
        int iHashCode = (((charSequence == null ? 0 : charSequence.hashCode()) * 31) + Boolean.hashCode(this.isDuplicateTransaction)) * 31;
        CharSequence charSequence2 = this.primaryText;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.metadataText;
        return iHashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public String toString() {
        CharSequence charSequence = this.transactionSecondaryText;
        return "TransactionRowViewState(transactionSecondaryText=" + ((Object) charSequence) + ", isDuplicateTransaction=" + this.isDuplicateTransaction + ", primaryText=" + ((Object) this.primaryText) + ", metadataText=" + ((Object) this.metadataText) + ")";
    }

    public TransactionRowViewState(CharSequence charSequence, boolean z, CharSequence charSequence2, CharSequence charSequence3) {
        this.transactionSecondaryText = charSequence;
        this.isDuplicateTransaction = z;
        this.primaryText = charSequence2;
        this.metadataText = charSequence3;
    }

    public /* synthetic */ TransactionRowViewState(CharSequence charSequence, boolean z, CharSequence charSequence2, CharSequence charSequence3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : charSequence2, (i & 8) != 0 ? null : charSequence3);
    }

    public final CharSequence getPrimaryText() {
        return this.primaryText;
    }

    public final CharSequence getMetadataText() {
        return this.metadataText;
    }

    public final StringResource getSecondaryText() {
        if (this.isDuplicateTransaction) {
            return StringResource.INSTANCE.invoke(C10007R.string.transaction_row_view_duplicate_transaction, new Object[0]);
        }
        CharSequence charSequence = this.transactionSecondaryText;
        if (charSequence != null) {
            return StringResource.INSTANCE.invoke(charSequence);
        }
        return null;
    }
}
