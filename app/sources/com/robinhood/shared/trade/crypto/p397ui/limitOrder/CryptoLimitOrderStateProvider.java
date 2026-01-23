package com.robinhood.shared.trade.crypto.p397ui.limitOrder;

import android.content.res.Resources;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderDataState;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderViewState;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoLimitOrderStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDataState;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoLimitOrderStateProvider implements StateProvider<CryptoLimitOrderDataState, CryptoLimitOrderViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public CryptoLimitOrderStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoLimitOrderViewState reduce(CryptoLimitOrderDataState dataState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState instanceof CryptoLimitOrderDataState.Loading) {
            return new CryptoLimitOrderViewState.Loading(dataState.getRequestInputs());
        }
        if (!(dataState instanceof CryptoLimitOrderDataState.Loaded)) {
            throw new NoWhenBranchMatchedException();
        }
        CryptoLimitOrderDataState.Loaded loaded = (CryptoLimitOrderDataState.Loaded) dataState;
        CryptoOrderContext cryptoOrderContext = loaded.getCryptoOrderContext();
        CryptoLimitOrderViewState.Loaded.ToolbarContent toolbarContent = loaded.getToolbarContent();
        DefaultOrderState formState = loaded.getFormState();
        CryptoLimitOrderViewState.Loaded.HeaderContent headerContent = loaded.headerContent(this.resources);
        CryptoLimitOrderViewState.Loaded.InputAmountRow inputAmountRow = loaded.getInputAmountRow();
        CryptoOrderReviewRowState feeRow1 = loaded.getFeeRow1();
        CryptoLimitOrderViewState.Loaded.LimitRow limitRow = loaded.getLimitRow();
        CryptoOrderReviewRowState feeRow2 = loaded.getFeeRow2();
        CryptoLimitOrderEdtType focusedEdtType = loaded.getFocusedEdtType();
        RequestInputs requestInputs = dataState.getRequestInputs();
        return new CryptoLimitOrderViewState.Loaded(cryptoOrderContext, toolbarContent, formState, headerContent, inputAmountRow, feeRow1, limitRow, feeRow2, focusedEdtType, loaded.isNumpadDecimalSeparatorEnabled(), loaded.getEstimatedAmountRow(), loaded.getReviewMessageAndDisclosuresState(), loaded.getCtaButtonState(), requestInputs);
    }
}
