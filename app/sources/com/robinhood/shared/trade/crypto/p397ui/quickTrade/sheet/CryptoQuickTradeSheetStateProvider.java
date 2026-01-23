package com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet;

import android.content.res.Resources;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoQuickTradeSheetStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetDataState;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoQuickTradeSheetStateProvider implements StateProvider<CryptoQuickTradeSheetDataState, CryptoQuickTradeSheetViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public CryptoQuickTradeSheetStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoQuickTradeSheetViewState reduce(CryptoQuickTradeSheetDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new CryptoQuickTradeSheetViewState(dataState.getInputStageHeader(), dataState.getOrderTypeDropdownSelectorState(), dataState.inputStageRows(this.resources), dataState.getDisclosureVisible(), dataState.getActionBarState(), dataState.getNumpadState(), dataState.getTradeStage());
    }
}
