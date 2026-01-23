package com.robinhood.android.cash.transaction.p079ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardTransactionDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/FraudActionResult;", "", "<init>", "()V", "CardLocked", "PurchaseEnabled", "Lcom/robinhood/android/cash/transaction/ui/FraudActionResult$CardLocked;", "Lcom/robinhood/android/cash/transaction/ui/FraudActionResult$PurchaseEnabled;", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.transaction.ui.FraudActionResult, reason: use source file name */
/* loaded from: classes7.dex */
public abstract class CardTransactionDetailViewState3 {
    public static final int $stable = 0;

    public /* synthetic */ CardTransactionDetailViewState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CardTransactionDetailViewState3() {
    }

    /* compiled from: CardTransactionDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/FraudActionResult$CardLocked;", "Lcom/robinhood/android/cash/transaction/ui/FraudActionResult;", "<init>", "()V", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.transaction.ui.FraudActionResult$CardLocked */
    public static final class CardLocked extends CardTransactionDetailViewState3 {
        public static final int $stable = 0;
        public static final CardLocked INSTANCE = new CardLocked();

        private CardLocked() {
            super(null);
        }
    }

    /* compiled from: CardTransactionDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/FraudActionResult$PurchaseEnabled;", "Lcom/robinhood/android/cash/transaction/ui/FraudActionResult;", "merchantName", "", "<init>", "(Ljava/lang/CharSequence;)V", "getMerchantName", "()Ljava/lang/CharSequence;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.transaction.ui.FraudActionResult$PurchaseEnabled, reason: from toString */
    public static final /* data */ class PurchaseEnabled extends CardTransactionDetailViewState3 {
        public static final int $stable = 8;
        private final CharSequence merchantName;

        public static /* synthetic */ PurchaseEnabled copy$default(PurchaseEnabled purchaseEnabled, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = purchaseEnabled.merchantName;
            }
            return purchaseEnabled.copy(charSequence);
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getMerchantName() {
            return this.merchantName;
        }

        public final PurchaseEnabled copy(CharSequence merchantName) {
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            return new PurchaseEnabled(merchantName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PurchaseEnabled) && Intrinsics.areEqual(this.merchantName, ((PurchaseEnabled) other).merchantName);
        }

        public int hashCode() {
            return this.merchantName.hashCode();
        }

        public String toString() {
            return "PurchaseEnabled(merchantName=" + ((Object) this.merchantName) + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PurchaseEnabled(CharSequence merchantName) {
            super(null);
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            this.merchantName = merchantName;
        }

        public final CharSequence getMerchantName() {
            return this.merchantName;
        }
    }
}
