package com.robinhood.android.internalassettransfers.cashselection;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.cashselection.models.CashBalanceQuantity;
import com.robinhood.android.internalassettransfers.review.models.UiAssets;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferCashSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00016BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003JQ\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u00101\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001cR\u0011\u0010\"\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001cR\u0011\u0010'\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001c¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionViewState;", "", "currency", "Ljava/util/Currency;", "transferableAssets", "Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "nontransferableAssets", "cashAmountTextValue", "", "cashInputError", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionViewState$CashInputError;", "cashBalanceQuantity", "Lcom/robinhood/android/internalassettransfers/cashselection/models/CashBalanceQuantity;", "isMarginBalance", "", "<init>", "(Ljava/util/Currency;Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;Ljava/lang/String;Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionViewState$CashInputError;Lcom/robinhood/android/internalassettransfers/cashselection/models/CashBalanceQuantity;Z)V", "getCurrency", "()Ljava/util/Currency;", "getTransferableAssets", "()Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "getNontransferableAssets", "getCashAmountTextValue", "()Ljava/lang/String;", "getCashInputError", "()Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionViewState$CashInputError;", "getCashBalanceQuantity", "()Lcom/robinhood/android/internalassettransfers/cashselection/models/CashBalanceQuantity;", "()Z", "cashInputColor", "Landroidx/compose/ui/graphics/Color;", "getCashInputColor", "(Landroidx/compose/runtime/Composer;I)J", "isCashInputError", "bottomBarButtonText", "getBottomBarButtonText", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "showErrorMessage", "getShowErrorMessage", "enableBottomButton", "getEnableBottomButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "CashInputError", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InternalAssetTransferCashSelectionViewState {
    public static final int $stable = 8;
    private final String cashAmountTextValue;
    private final CashBalanceQuantity cashBalanceQuantity;
    private final CashInputError cashInputError;
    private final Currency currency;
    private final boolean isMarginBalance;
    private final UiAssets nontransferableAssets;
    private final UiAssets transferableAssets;

    public static /* synthetic */ InternalAssetTransferCashSelectionViewState copy$default(InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewState, Currency currency, UiAssets uiAssets, UiAssets uiAssets2, String str, CashInputError cashInputError, CashBalanceQuantity cashBalanceQuantity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            currency = internalAssetTransferCashSelectionViewState.currency;
        }
        if ((i & 2) != 0) {
            uiAssets = internalAssetTransferCashSelectionViewState.transferableAssets;
        }
        if ((i & 4) != 0) {
            uiAssets2 = internalAssetTransferCashSelectionViewState.nontransferableAssets;
        }
        if ((i & 8) != 0) {
            str = internalAssetTransferCashSelectionViewState.cashAmountTextValue;
        }
        if ((i & 16) != 0) {
            cashInputError = internalAssetTransferCashSelectionViewState.cashInputError;
        }
        if ((i & 32) != 0) {
            cashBalanceQuantity = internalAssetTransferCashSelectionViewState.cashBalanceQuantity;
        }
        if ((i & 64) != 0) {
            z = internalAssetTransferCashSelectionViewState.isMarginBalance;
        }
        CashBalanceQuantity cashBalanceQuantity2 = cashBalanceQuantity;
        boolean z2 = z;
        CashInputError cashInputError2 = cashInputError;
        UiAssets uiAssets3 = uiAssets2;
        return internalAssetTransferCashSelectionViewState.copy(currency, uiAssets, uiAssets3, str, cashInputError2, cashBalanceQuantity2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final Currency getCurrency() {
        return this.currency;
    }

    /* renamed from: component2, reason: from getter */
    public final UiAssets getTransferableAssets() {
        return this.transferableAssets;
    }

    /* renamed from: component3, reason: from getter */
    public final UiAssets getNontransferableAssets() {
        return this.nontransferableAssets;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCashAmountTextValue() {
        return this.cashAmountTextValue;
    }

    /* renamed from: component5, reason: from getter */
    public final CashInputError getCashInputError() {
        return this.cashInputError;
    }

    /* renamed from: component6, reason: from getter */
    public final CashBalanceQuantity getCashBalanceQuantity() {
        return this.cashBalanceQuantity;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsMarginBalance() {
        return this.isMarginBalance;
    }

    public final InternalAssetTransferCashSelectionViewState copy(Currency currency, UiAssets transferableAssets, UiAssets nontransferableAssets, String cashAmountTextValue, CashInputError cashInputError, CashBalanceQuantity cashBalanceQuantity, boolean isMarginBalance) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(transferableAssets, "transferableAssets");
        Intrinsics.checkNotNullParameter(nontransferableAssets, "nontransferableAssets");
        Intrinsics.checkNotNullParameter(cashAmountTextValue, "cashAmountTextValue");
        Intrinsics.checkNotNullParameter(cashBalanceQuantity, "cashBalanceQuantity");
        return new InternalAssetTransferCashSelectionViewState(currency, transferableAssets, nontransferableAssets, cashAmountTextValue, cashInputError, cashBalanceQuantity, isMarginBalance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAssetTransferCashSelectionViewState)) {
            return false;
        }
        InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewState = (InternalAssetTransferCashSelectionViewState) other;
        return Intrinsics.areEqual(this.currency, internalAssetTransferCashSelectionViewState.currency) && Intrinsics.areEqual(this.transferableAssets, internalAssetTransferCashSelectionViewState.transferableAssets) && Intrinsics.areEqual(this.nontransferableAssets, internalAssetTransferCashSelectionViewState.nontransferableAssets) && Intrinsics.areEqual(this.cashAmountTextValue, internalAssetTransferCashSelectionViewState.cashAmountTextValue) && Intrinsics.areEqual(this.cashInputError, internalAssetTransferCashSelectionViewState.cashInputError) && Intrinsics.areEqual(this.cashBalanceQuantity, internalAssetTransferCashSelectionViewState.cashBalanceQuantity) && this.isMarginBalance == internalAssetTransferCashSelectionViewState.isMarginBalance;
    }

    public int hashCode() {
        int iHashCode = ((((((this.currency.hashCode() * 31) + this.transferableAssets.hashCode()) * 31) + this.nontransferableAssets.hashCode()) * 31) + this.cashAmountTextValue.hashCode()) * 31;
        CashInputError cashInputError = this.cashInputError;
        return ((((iHashCode + (cashInputError == null ? 0 : cashInputError.hashCode())) * 31) + this.cashBalanceQuantity.hashCode()) * 31) + Boolean.hashCode(this.isMarginBalance);
    }

    public String toString() {
        return "InternalAssetTransferCashSelectionViewState(currency=" + this.currency + ", transferableAssets=" + this.transferableAssets + ", nontransferableAssets=" + this.nontransferableAssets + ", cashAmountTextValue=" + this.cashAmountTextValue + ", cashInputError=" + this.cashInputError + ", cashBalanceQuantity=" + this.cashBalanceQuantity + ", isMarginBalance=" + this.isMarginBalance + ")";
    }

    public InternalAssetTransferCashSelectionViewState(Currency currency, UiAssets transferableAssets, UiAssets nontransferableAssets, String cashAmountTextValue, CashInputError cashInputError, CashBalanceQuantity cashBalanceQuantity, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(transferableAssets, "transferableAssets");
        Intrinsics.checkNotNullParameter(nontransferableAssets, "nontransferableAssets");
        Intrinsics.checkNotNullParameter(cashAmountTextValue, "cashAmountTextValue");
        Intrinsics.checkNotNullParameter(cashBalanceQuantity, "cashBalanceQuantity");
        this.currency = currency;
        this.transferableAssets = transferableAssets;
        this.nontransferableAssets = nontransferableAssets;
        this.cashAmountTextValue = cashAmountTextValue;
        this.cashInputError = cashInputError;
        this.cashBalanceQuantity = cashBalanceQuantity;
        this.isMarginBalance = z;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final UiAssets getTransferableAssets() {
        return this.transferableAssets;
    }

    public final UiAssets getNontransferableAssets() {
        return this.nontransferableAssets;
    }

    public final String getCashAmountTextValue() {
        return this.cashAmountTextValue;
    }

    public final CashInputError getCashInputError() {
        return this.cashInputError;
    }

    public final CashBalanceQuantity getCashBalanceQuantity() {
        return this.cashBalanceQuantity;
    }

    public final boolean isMarginBalance() {
        return this.isMarginBalance;
    }

    @JvmName
    public final long getCashInputColor(Composer composer, int i) {
        long jM21425getFg0d7_KjU;
        composer.startReplaceGroup(-596100330);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-596100330, i, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionViewState.<get-cashInputColor> (InternalAssetTransferCashSelectionViewState.kt:22)");
        }
        if (isCashInputError()) {
            composer.startReplaceGroup(1264881146);
            jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1264936512);
            jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21425getFg0d7_KjU;
    }

    public final boolean isCashInputError() {
        return this.cashInputError != null;
    }

    @JvmName
    public final String getBottomBarButtonText(Composer composer, int i) {
        String strStringResource;
        composer.startReplaceGroup(1638702608);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1638702608, i, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionViewState.<get-bottomBarButtonText> (InternalAssetTransferCashSelectionViewState.kt:32)");
        }
        if (Intrinsics.areEqual(this.cashBalanceQuantity, CashBalanceQuantity.SpecificAmount.INSTANCE)) {
            composer.startReplaceGroup(1991194061);
            strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_cash_selection_update_button, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1991300236);
            strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_cash_selection_confirm_button, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }

    public final boolean getShowErrorMessage() {
        return this.cashBalanceQuantity instanceof CashBalanceQuantity.SpecificAmount;
    }

    public final boolean getEnableBottomButton() {
        return (this.cashBalanceQuantity instanceof CashBalanceQuantity.EntireBalance) || !isCashInputError();
    }

    /* compiled from: InternalAssetTransferCashSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionViewState$CashInputError;", "", "CashInputExceeded", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionViewState$CashInputError$CashInputExceeded;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface CashInputError {

        /* compiled from: InternalAssetTransferCashSelectionViewState.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionViewState$CashInputError$CashInputExceeded;", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionViewState$CashInputError;", "<init>", "()V", "message", "", "getMessage", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CashInputExceeded implements CashInputError {
            public static final int $stable = 0;
            public static final CashInputExceeded INSTANCE = new CashInputExceeded();

            public boolean equals(Object other) {
                return this == other || (other instanceof CashInputExceeded);
            }

            public int hashCode() {
                return 1287816996;
            }

            public String toString() {
                return "CashInputExceeded";
            }

            private CashInputExceeded() {
            }

            @JvmName
            public final String getMessage(Composer composer, int i) {
                composer.startReplaceGroup(-1710929729);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1710929729, i, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionViewState.CashInputError.CashInputExceeded.<get-message> (InternalAssetTransferCashSelectionViewState.kt:49)");
                }
                String strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_cash_selection_too_many_cash, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return strStringResource;
            }
        }
    }
}
