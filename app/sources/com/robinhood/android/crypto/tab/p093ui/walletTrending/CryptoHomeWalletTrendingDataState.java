package com.robinhood.android.crypto.tab.p093ui.walletTrending;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.trading.CryptoTradingOptionsCategory;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreCategories;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import com.robinhood.shared.crypto.chips.CryptoChipsComposable;
import com.robinhood.shared.crypto.contracts.CryptoExploreFragmentKey;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoHomeWalletTrendingDataState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingDataState;", "", "categoriesResponse", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;", "tradingOptions", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;", "<init>", "(Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;)V", "getCategoriesResponse", "()Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;", "getTradingOptions", "()Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;", "tokenChips", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/chips/CryptoChip;", "getTokenChips", "()Lkotlinx/collections/immutable/ImmutableList;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "headerState", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/WalletTrendingHeaderState;", "getHeaderState", "()Lcom/robinhood/android/crypto/tab/ui/walletTrending/WalletTrendingHeaderState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeWalletTrendingDataState {
    public static final int $stable = 8;
    private final CryptoExploreCategories categoriesResponse;
    private final CryptoTradingOptions tradingOptions;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoHomeWalletTrendingDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CryptoHomeWalletTrendingDataState copy$default(CryptoHomeWalletTrendingDataState cryptoHomeWalletTrendingDataState, CryptoExploreCategories cryptoExploreCategories, CryptoTradingOptions cryptoTradingOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoExploreCategories = cryptoHomeWalletTrendingDataState.categoriesResponse;
        }
        if ((i & 2) != 0) {
            cryptoTradingOptions = cryptoHomeWalletTrendingDataState.tradingOptions;
        }
        return cryptoHomeWalletTrendingDataState.copy(cryptoExploreCategories, cryptoTradingOptions);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoExploreCategories getCategoriesResponse() {
        return this.categoriesResponse;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoTradingOptions getTradingOptions() {
        return this.tradingOptions;
    }

    public final CryptoHomeWalletTrendingDataState copy(CryptoExploreCategories categoriesResponse, CryptoTradingOptions tradingOptions) {
        return new CryptoHomeWalletTrendingDataState(categoriesResponse, tradingOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomeWalletTrendingDataState)) {
            return false;
        }
        CryptoHomeWalletTrendingDataState cryptoHomeWalletTrendingDataState = (CryptoHomeWalletTrendingDataState) other;
        return Intrinsics.areEqual(this.categoriesResponse, cryptoHomeWalletTrendingDataState.categoriesResponse) && Intrinsics.areEqual(this.tradingOptions, cryptoHomeWalletTrendingDataState.tradingOptions);
    }

    public int hashCode() {
        CryptoExploreCategories cryptoExploreCategories = this.categoriesResponse;
        int iHashCode = (cryptoExploreCategories == null ? 0 : cryptoExploreCategories.hashCode()) * 31;
        CryptoTradingOptions cryptoTradingOptions = this.tradingOptions;
        return iHashCode + (cryptoTradingOptions != null ? cryptoTradingOptions.hashCode() : 0);
    }

    public String toString() {
        return "CryptoHomeWalletTrendingDataState(categoriesResponse=" + this.categoriesResponse + ", tradingOptions=" + this.tradingOptions + ")";
    }

    public CryptoHomeWalletTrendingDataState(CryptoExploreCategories cryptoExploreCategories, CryptoTradingOptions cryptoTradingOptions) {
        this.categoriesResponse = cryptoExploreCategories;
        this.tradingOptions = cryptoTradingOptions;
    }

    public /* synthetic */ CryptoHomeWalletTrendingDataState(CryptoExploreCategories cryptoExploreCategories, CryptoTradingOptions cryptoTradingOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoExploreCategories, (i & 2) != 0 ? null : cryptoTradingOptions);
    }

    public final CryptoExploreCategories getCategoriesResponse() {
        return this.categoriesResponse;
    }

    public final CryptoTradingOptions getTradingOptions() {
        return this.tradingOptions;
    }

    public final ImmutableList<CryptoChipsComposable> getTokenChips() {
        ImmutableList<CryptoTradingOptions.TradingOptionItem> results;
        CryptoTradingOptions cryptoTradingOptions = this.tradingOptions;
        if (cryptoTradingOptions == null || (results = cryptoTradingOptions.getResults()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator<CryptoTradingOptions.TradingOptionItem> it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(CryptoHomeWalletTrendingDataState2.toLoadedCryptoChip(it.next()));
        }
        return extensions2.toImmutableList(arrayList);
    }

    public final FragmentKey getFragmentKey() {
        CryptoExploreCategories cryptoExploreCategories = this.categoriesResponse;
        if (cryptoExploreCategories == null) {
            return null;
        }
        Iterator<CryptoTradingOptionsCategory> it = cryptoExploreCategories.getCategories().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().getServerName(), CryptoHomeWalletTrendingDataState2.WALLET_TRENDING_CATEGORY)) {
                break;
            }
            i++;
        }
        return new CryptoExploreFragmentKey(cryptoExploreCategories, RangesKt.coerceAtLeast(i, 0), cryptoExploreCategories.getTitle());
    }

    public final WalletTrendingHeaderState getHeaderState() {
        CryptoTradingOptions cryptoTradingOptions = this.tradingOptions;
        if (cryptoTradingOptions == null) {
            return null;
        }
        String title = cryptoTradingOptions.getTitle();
        if (title == null) {
            title = "";
        }
        return new WalletTrendingHeaderState(title, cryptoTradingOptions.getDescription(), cryptoTradingOptions.getDisclosure());
    }
}
