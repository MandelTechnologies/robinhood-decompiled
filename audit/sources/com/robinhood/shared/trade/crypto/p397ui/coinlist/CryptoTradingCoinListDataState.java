package com.robinhood.shared.trade.crypto.p397ui.coinlist;

import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import com.robinhood.shared.crypto.contracts.CryptoTradingCoinListFragmentKey;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.coinlist.CryptoTradingCoinListViewState;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoTradingCoinListDataState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListDataState;", "", "entryPoint", "Lcom/robinhood/shared/crypto/contracts/CryptoTradingCoinListFragmentKey$EntryPoint;", "query", "", "results", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions$TradingOptionItem;", "<init>", "(Lcom/robinhood/shared/crypto/contracts/CryptoTradingCoinListFragmentKey$EntryPoint;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getEntryPoint", "()Lcom/robinhood/shared/crypto/contracts/CryptoTradingCoinListFragmentKey$EntryPoint;", "getQuery", "()Ljava/lang/String;", "getResults", "()Lkotlinx/collections/immutable/ImmutableList;", "displayItems", "Lkotlinx/collections/immutable/PersistentList;", "getDisplayItems", "()Lkotlinx/collections/immutable/PersistentList;", "infoSheetContent", "Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState$InfoSheetContent;", "getInfoSheetContent", "()Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState$InfoSheetContent;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class CryptoTradingCoinListDataState {
    public static final int $stable = 8;
    private final CryptoTradingCoinListFragmentKey.EntryPoint entryPoint;
    private final String query;
    private final ImmutableList<CryptoTradingOptions.TradingOptionItem> results;

    /* compiled from: CryptoTradingCoinListDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoTradingCoinListFragmentKey.EntryPoint.values().length];
            try {
                iArr[CryptoTradingCoinListFragmentKey.EntryPoint.TAX_LOTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoTradingCoinListDataState copy$default(CryptoTradingCoinListDataState cryptoTradingCoinListDataState, CryptoTradingCoinListFragmentKey.EntryPoint entryPoint, String str, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            entryPoint = cryptoTradingCoinListDataState.entryPoint;
        }
        if ((i & 2) != 0) {
            str = cryptoTradingCoinListDataState.query;
        }
        if ((i & 4) != 0) {
            immutableList = cryptoTradingCoinListDataState.results;
        }
        return cryptoTradingCoinListDataState.copy(entryPoint, str, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoTradingCoinListFragmentKey.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final ImmutableList<CryptoTradingOptions.TradingOptionItem> component3() {
        return this.results;
    }

    public final CryptoTradingCoinListDataState copy(CryptoTradingCoinListFragmentKey.EntryPoint entryPoint, String query, ImmutableList<CryptoTradingOptions.TradingOptionItem> results) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new CryptoTradingCoinListDataState(entryPoint, query, results);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTradingCoinListDataState)) {
            return false;
        }
        CryptoTradingCoinListDataState cryptoTradingCoinListDataState = (CryptoTradingCoinListDataState) other;
        return this.entryPoint == cryptoTradingCoinListDataState.entryPoint && Intrinsics.areEqual(this.query, cryptoTradingCoinListDataState.query) && Intrinsics.areEqual(this.results, cryptoTradingCoinListDataState.results);
    }

    public int hashCode() {
        CryptoTradingCoinListFragmentKey.EntryPoint entryPoint = this.entryPoint;
        int iHashCode = (((entryPoint == null ? 0 : entryPoint.hashCode()) * 31) + this.query.hashCode()) * 31;
        ImmutableList<CryptoTradingOptions.TradingOptionItem> immutableList = this.results;
        return iHashCode + (immutableList != null ? immutableList.hashCode() : 0);
    }

    public String toString() {
        return "CryptoTradingCoinListDataState(entryPoint=" + this.entryPoint + ", query=" + this.query + ", results=" + this.results + ")";
    }

    public CryptoTradingCoinListDataState(CryptoTradingCoinListFragmentKey.EntryPoint entryPoint, String query, ImmutableList<CryptoTradingOptions.TradingOptionItem> immutableList) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.entryPoint = entryPoint;
        this.query = query;
        this.results = immutableList;
    }

    public final CryptoTradingCoinListFragmentKey.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public /* synthetic */ CryptoTradingCoinListDataState(CryptoTradingCoinListFragmentKey.EntryPoint entryPoint, String str, ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(entryPoint, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : immutableList);
    }

    public final String getQuery() {
        return this.query;
    }

    public final ImmutableList<CryptoTradingOptions.TradingOptionItem> getResults() {
        return this.results;
    }

    public final ImmutableList3<CryptoTradingOptions.TradingOptionItem> getDisplayItems() {
        Iterable iterableEmptyList = this.results;
        if (iterableEmptyList == null) {
            iterableEmptyList = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterableEmptyList) {
            ImmutableList<String> searchItems = ((CryptoTradingOptions.TradingOptionItem) obj).getSearchItems();
            if (searchItems != null && !searchItems.isEmpty()) {
                Iterator<String> it = searchItems.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (StringsKt.contains((CharSequence) it.next(), (CharSequence) this.query, true)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        return extensions2.toPersistentList(arrayList);
    }

    public final CryptoTradingCoinListViewState.InfoSheetContent getInfoSheetContent() {
        CryptoTradingCoinListFragmentKey.EntryPoint entryPoint = this.entryPoint;
        if ((entryPoint == null ? -1 : WhenMappings.$EnumSwitchMapping$0[entryPoint.ordinal()]) == 1) {
            StringResource.Companion companion = StringResource.INSTANCE;
            return new CryptoTradingCoinListViewState.InfoSheetContent(companion.invoke(C40095R.string.crypto_trading_coin_list_info_title, new Object[0]), companion.invoke(C40095R.string.crypto_trading_coin_list_info_tax_lots_body, new Object[0]), companion.invoke(C40095R.string.crypto_trading_coin_list_info_dismiss_cta_text, new Object[0]));
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        return new CryptoTradingCoinListViewState.InfoSheetContent(companion2.invoke(C40095R.string.crypto_trading_coin_list_info_title, new Object[0]), companion2.invoke(C40095R.string.crypto_trading_coin_list_info_body, new Object[0]), companion2.invoke(C40095R.string.crypto_trading_coin_list_info_dismiss_cta_text, new Object[0]));
    }
}
