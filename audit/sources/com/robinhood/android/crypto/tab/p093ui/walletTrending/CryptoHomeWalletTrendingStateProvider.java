package com.robinhood.android.crypto.tab.p093ui.walletTrending;

import com.robinhood.android.crypto.tab.p093ui.walletTrending.CryptoHomeWalletTrendingViewState;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.shared.crypto.chips.CryptoChipsComposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoHomeWalletTrendingStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingDataState;", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingViewState;", "<init>", "()V", "reduce", "dataState", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeWalletTrendingStateProvider implements StateProvider<CryptoHomeWalletTrendingDataState, CryptoHomeWalletTrendingViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoHomeWalletTrendingViewState reduce(CryptoHomeWalletTrendingDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        FragmentKey fragmentKey = dataState.getFragmentKey();
        ImmutableList<CryptoChipsComposable> tokenChips = dataState.getTokenChips();
        WalletTrendingHeaderState headerState = dataState.getHeaderState();
        if (tokenChips == null || fragmentKey == null || headerState == null) {
            return CryptoHomeWalletTrendingViewState.Loading.INSTANCE;
        }
        return new CryptoHomeWalletTrendingViewState.Loaded(tokenChips, fragmentKey, headerState);
    }
}
