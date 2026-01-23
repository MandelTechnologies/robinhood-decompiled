package com.robinhood.android.acats.plaid.transfer.partial.edit;

import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRowData;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo3;
import com.robinhood.android.acats.plaid.transfer.partial.edit.utils.AmountInputVisualTransformation;
import java.io.IOException;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AcatsPlaidPartialTransferEditDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditViewState;", "", "Loading", "Ready", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditViewState$Loading;", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditViewState$Ready;", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditViewState, reason: use source file name */
/* loaded from: classes24.dex */
public interface AcatsPlaidPartialTransferEditDuxo6 {

    /* compiled from: AcatsPlaidPartialTransferEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditViewState$Loading;", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditViewState$Loading */
    public static final /* data */ class Loading implements AcatsPlaidPartialTransferEditDuxo6 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1716051404;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: AcatsPlaidPartialTransferEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÂ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003JY\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u001d\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u001e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditViewState$Ready;", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditViewState;", "editAsset", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;", "isCurrency", "", "amountFormatter", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/utils/AmountInputVisualTransformation;", "showDelimiter", "adjustedAmount", "", "userFinishedEditing", "selectedRow", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditSelectedRow;", "showBorrowingFeeTooltip", "<init>", "(Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;ZLcom/robinhood/android/acats/plaid/transfer/partial/edit/utils/AmountInputVisualTransformation;ZLjava/lang/String;ZLcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditSelectedRow;Z)V", "getEditAsset", "()Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;", "getAmountFormatter", "()Lcom/robinhood/android/acats/plaid/transfer/partial/edit/utils/AmountInputVisualTransformation;", "getShowDelimiter", "()Z", "getAdjustedAmount", "()Ljava/lang/String;", "getUserFinishedEditing", "getSelectedRow", "()Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditSelectedRow;", "getShowBorrowingFeeTooltip", "isZeroOrLess", "validAdjustedAmount", "getValidAdjustedAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditViewState$Ready, reason: from toString */
    public static final /* data */ class Ready implements AcatsPlaidPartialTransferEditDuxo6 {
        public static final int $stable = 0;
        private final String adjustedAmount;
        private final AmountInputVisualTransformation amountFormatter;
        private final AcatsPlaidPartialTransferAssetRowData editAsset;
        private final boolean isCurrency;
        private final AcatsPlaidPartialTransferEditDuxo4 selectedRow;
        private final boolean showBorrowingFeeTooltip;
        private final boolean showDelimiter;
        private final boolean userFinishedEditing;

        /* renamed from: component2, reason: from getter */
        private final boolean getIsCurrency() {
            return this.isCurrency;
        }

        public static /* synthetic */ Ready copy$default(Ready ready, AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, boolean z, AmountInputVisualTransformation amountInputVisualTransformation, boolean z2, String str, boolean z3, AcatsPlaidPartialTransferEditDuxo4 acatsPlaidPartialTransferEditDuxo4, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                acatsPlaidPartialTransferAssetRowData = ready.editAsset;
            }
            if ((i & 2) != 0) {
                z = ready.isCurrency;
            }
            if ((i & 4) != 0) {
                amountInputVisualTransformation = ready.amountFormatter;
            }
            if ((i & 8) != 0) {
                z2 = ready.showDelimiter;
            }
            if ((i & 16) != 0) {
                str = ready.adjustedAmount;
            }
            if ((i & 32) != 0) {
                z3 = ready.userFinishedEditing;
            }
            if ((i & 64) != 0) {
                acatsPlaidPartialTransferEditDuxo4 = ready.selectedRow;
            }
            if ((i & 128) != 0) {
                z4 = ready.showBorrowingFeeTooltip;
            }
            AcatsPlaidPartialTransferEditDuxo4 acatsPlaidPartialTransferEditDuxo42 = acatsPlaidPartialTransferEditDuxo4;
            boolean z5 = z4;
            String str2 = str;
            boolean z6 = z3;
            return ready.copy(acatsPlaidPartialTransferAssetRowData, z, amountInputVisualTransformation, z2, str2, z6, acatsPlaidPartialTransferEditDuxo42, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final AcatsPlaidPartialTransferAssetRowData getEditAsset() {
            return this.editAsset;
        }

        /* renamed from: component3, reason: from getter */
        public final AmountInputVisualTransformation getAmountFormatter() {
            return this.amountFormatter;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowDelimiter() {
            return this.showDelimiter;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAdjustedAmount() {
            return this.adjustedAmount;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getUserFinishedEditing() {
            return this.userFinishedEditing;
        }

        /* renamed from: component7, reason: from getter */
        public final AcatsPlaidPartialTransferEditDuxo4 getSelectedRow() {
            return this.selectedRow;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getShowBorrowingFeeTooltip() {
            return this.showBorrowingFeeTooltip;
        }

        public final Ready copy(AcatsPlaidPartialTransferAssetRowData editAsset, boolean isCurrency, AmountInputVisualTransformation amountFormatter, boolean showDelimiter, String adjustedAmount, boolean userFinishedEditing, AcatsPlaidPartialTransferEditDuxo4 selectedRow, boolean showBorrowingFeeTooltip) {
            Intrinsics.checkNotNullParameter(editAsset, "editAsset");
            Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
            Intrinsics.checkNotNullParameter(adjustedAmount, "adjustedAmount");
            Intrinsics.checkNotNullParameter(selectedRow, "selectedRow");
            return new Ready(editAsset, isCurrency, amountFormatter, showDelimiter, adjustedAmount, userFinishedEditing, selectedRow, showBorrowingFeeTooltip);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.editAsset, ready.editAsset) && this.isCurrency == ready.isCurrency && Intrinsics.areEqual(this.amountFormatter, ready.amountFormatter) && this.showDelimiter == ready.showDelimiter && Intrinsics.areEqual(this.adjustedAmount, ready.adjustedAmount) && this.userFinishedEditing == ready.userFinishedEditing && this.selectedRow == ready.selectedRow && this.showBorrowingFeeTooltip == ready.showBorrowingFeeTooltip;
        }

        public int hashCode() {
            return (((((((((((((this.editAsset.hashCode() * 31) + Boolean.hashCode(this.isCurrency)) * 31) + this.amountFormatter.hashCode()) * 31) + Boolean.hashCode(this.showDelimiter)) * 31) + this.adjustedAmount.hashCode()) * 31) + Boolean.hashCode(this.userFinishedEditing)) * 31) + this.selectedRow.hashCode()) * 31) + Boolean.hashCode(this.showBorrowingFeeTooltip);
        }

        public String toString() {
            return "Ready(editAsset=" + this.editAsset + ", isCurrency=" + this.isCurrency + ", amountFormatter=" + this.amountFormatter + ", showDelimiter=" + this.showDelimiter + ", adjustedAmount=" + this.adjustedAmount + ", userFinishedEditing=" + this.userFinishedEditing + ", selectedRow=" + this.selectedRow + ", showBorrowingFeeTooltip=" + this.showBorrowingFeeTooltip + ")";
        }

        public Ready(AcatsPlaidPartialTransferAssetRowData editAsset, boolean z, AmountInputVisualTransformation amountFormatter, boolean z2, String adjustedAmount, boolean z3, AcatsPlaidPartialTransferEditDuxo4 selectedRow, boolean z4) {
            Intrinsics.checkNotNullParameter(editAsset, "editAsset");
            Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
            Intrinsics.checkNotNullParameter(adjustedAmount, "adjustedAmount");
            Intrinsics.checkNotNullParameter(selectedRow, "selectedRow");
            this.editAsset = editAsset;
            this.isCurrency = z;
            this.amountFormatter = amountFormatter;
            this.showDelimiter = z2;
            this.adjustedAmount = adjustedAmount;
            this.userFinishedEditing = z3;
            this.selectedRow = selectedRow;
            this.showBorrowingFeeTooltip = z4;
        }

        public final AcatsPlaidPartialTransferAssetRowData getEditAsset() {
            return this.editAsset;
        }

        public /* synthetic */ Ready(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, boolean z, AmountInputVisualTransformation amountInputVisualTransformation, boolean z2, String str, boolean z3, AcatsPlaidPartialTransferEditDuxo4 acatsPlaidPartialTransferEditDuxo4, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            boolean z5;
            AmountInputVisualTransformation amountInputVisualTransformation2;
            char c = 1;
            int i2 = 0;
            if ((i & 2) != 0) {
                z5 = (acatsPlaidPartialTransferAssetRowData.getType() instanceof AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) || (acatsPlaidPartialTransferAssetRowData.getType() instanceof AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment);
            } else {
                z5 = z;
            }
            if ((i & 4) != 0) {
                amountInputVisualTransformation2 = new AmountInputVisualTransformation(i2, z5, c == true ? 1 : 0, null);
            } else {
                amountInputVisualTransformation2 = amountInputVisualTransformation;
            }
            this(acatsPlaidPartialTransferAssetRowData, z5, amountInputVisualTransformation2, (i & 8) != 0 ? z5 : z2, (i & 16) != 0 ? "0" : str, (i & 32) == 0 ? z3 : true, (i & 64) != 0 ? AcatsPlaidPartialTransferEditDuxo4.ALL : acatsPlaidPartialTransferEditDuxo4, (i & 128) != 0 ? false : z4);
        }

        public final AmountInputVisualTransformation getAmountFormatter() {
            return this.amountFormatter;
        }

        public final boolean getShowDelimiter() {
            return this.showDelimiter;
        }

        public final String getAdjustedAmount() {
            return this.adjustedAmount;
        }

        public final boolean getUserFinishedEditing() {
            return this.userFinishedEditing;
        }

        public final AcatsPlaidPartialTransferEditDuxo4 getSelectedRow() {
            return this.selectedRow;
        }

        public final boolean getShowBorrowingFeeTooltip() {
            return this.showBorrowingFeeTooltip;
        }

        public final boolean isZeroOrLess() {
            BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(AcatsPlaidPartialTransferEditDuxo3.cleansedString(this.adjustedAmount));
            if (bigDecimalOrNull == null) {
                return true;
            }
            AcatsPlaidPartialTransferDuxo3 type2 = this.editAsset.getType();
            if (!(type2 instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment)) {
                return bigDecimalOrNull.compareTo(BigDecimal.ZERO) <= 0;
            }
            BigDecimal quantity = ((AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) type2).getEquityAsset().getQuantity();
            BigDecimal bigDecimal = BigDecimal.ZERO;
            return quantity.compareTo(bigDecimal) < 0 ? bigDecimalOrNull.compareTo(bigDecimal) >= 0 : bigDecimalOrNull.compareTo(bigDecimal) <= 0;
        }

        public final boolean getValidAdjustedAmount() throws IOException {
            String strCleansedString = AcatsPlaidPartialTransferEditDuxo3.cleansedString(this.adjustedAmount);
            AcatsPlaidPartialTransferDuxo3 type2 = this.editAsset.getType();
            if (type2 instanceof AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) {
                BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(strCleansedString);
                return bigDecimalOrNull != null && bigDecimalOrNull.compareTo(BigDecimal.ZERO) >= 0 && bigDecimalOrNull.compareTo(((AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) type2).getOriginalCashBalance().getAmount()) <= 0;
            }
            if (type2 instanceof AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment) {
                BigDecimal bigDecimalOrNull2 = StringsKt.toBigDecimalOrNull(strCleansedString);
                return bigDecimalOrNull2 != null && bigDecimalOrNull2.compareTo(BigDecimal.ZERO) >= 0 && bigDecimalOrNull2.compareTo(((AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment) type2).getOriginalMarginCashBalance().getAmount()) <= 0;
            }
            if (type2 instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) {
                BigDecimal bigDecimalOrNull3 = StringsKt.toBigDecimalOrNull(strCleansedString);
                if (bigDecimalOrNull3 == null) {
                    return false;
                }
                BigDecimal quantity = ((AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) type2).getEquityAsset().getQuantity();
                BigDecimal bigDecimal = BigDecimal.ZERO;
                return quantity.compareTo(bigDecimal) < 0 ? bigDecimalOrNull3.compareTo(bigDecimal) <= 0 && bigDecimalOrNull3.compareTo(quantity) >= 0 : bigDecimalOrNull3.compareTo(bigDecimal) >= 0 && bigDecimalOrNull3.compareTo(quantity) <= 0;
            }
            if (!(type2 instanceof AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment)) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal bigDecimalOrNull4 = StringsKt.toBigDecimalOrNull(strCleansedString);
            return bigDecimalOrNull4 != null && bigDecimalOrNull4.compareTo(BigDecimal.ZERO) >= 0 && bigDecimalOrNull4.compareTo(((AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment) type2).getOptionsAsset().getQuantity()) <= 0;
        }
    }
}
