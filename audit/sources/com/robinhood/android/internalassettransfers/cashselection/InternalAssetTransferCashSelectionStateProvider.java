package com.robinhood.android.internalassettransfers.cashselection;

import com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionViewState;
import com.robinhood.android.internalassettransfers.review.models.UiAssets3;
import com.robinhood.android.udf.StateProvider;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: InternalAssetTransferCashSelectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionDataState;", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionViewState;", "<init>", "()V", "reduce", "dataState", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InternalAssetTransferCashSelectionStateProvider implements StateProvider<InternalAssetTransferCashSelectionDataState, InternalAssetTransferCashSelectionViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public InternalAssetTransferCashSelectionViewState reduce(InternalAssetTransferCashSelectionDataState dataState) {
        BigDecimal bigDecimalAbs;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(dataState.getCashInput());
        if (bigDecimalOrNull == null || (bigDecimalAbs = bigDecimalOrNull.abs()) == null) {
            bigDecimalAbs = BigDecimal.ZERO;
        }
        return new InternalAssetTransferCashSelectionViewState(dataState.getCurrency(), UiAssets3.toTransferableUiModel(dataState.getEligibleAssets()), UiAssets3.toNontransferableUiModel(dataState.getEligibleAssets()), dataState.getCashTextValue(), bigDecimalAbs.compareTo(dataState.getEligibleAssets().getAvailableCash().abs()) > 0 ? InternalAssetTransferCashSelectionViewState.CashInputError.CashInputExceeded.INSTANCE : null, dataState.getCashBalanceQuantity(), dataState.isMarginBalance());
    }
}
