package com.robinhood.android.crypto.tab.p093ui.walletTrending;

import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import com.robinhood.shared.crypto.chips.CryptoChipsComposable;
import kotlin.Metadata;

/* compiled from: CryptoHomeWalletTrendingDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m3636d2 = {"WALLET_TRENDING_CATEGORY", "", "toLoadedCryptoChip", "Lcom/robinhood/shared/crypto/chips/CryptoChip;", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions$TradingOptionItem;", "feature-crypto-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingDataStateKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeWalletTrendingDataState2 {
    public static final String WALLET_TRENDING_CATEGORY = "on_robinhood_wallet";

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoChipsComposable toLoadedCryptoChip(CryptoTradingOptions.TradingOptionItem tradingOptionItem) {
        return new CryptoChipsComposable.Loaded(tradingOptionItem.getLogoUrl(), tradingOptionItem.getTitle(), tradingOptionItem.getPercentChange(), tradingOptionItem.getDeeplink(), null, false, 48, null);
    }
}
