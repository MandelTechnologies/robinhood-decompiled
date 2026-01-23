package com.robinhood.shared.crypto.movers;

import android.net.Uri;
import com.robinhood.android.charts.models.p080db.ChartLine;
import com.robinhood.android.models.portfolio.InstrumentDetails3;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.api.ApiCryptoTradingOptions3;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.shared.crypto.movers.CryptoDailyMoversViewState;
import com.robinhood.shared.crypto.movers.InstrumentPreviewCard4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoDailyMoversDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0019\u001a\u00020\f*\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\t\u0010\u001e\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u0010 \u001a\u00020\u0003HÂ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÂ\u0003J5\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006("}, m3636d2 = {"Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversDataState;", "", "isLoggedIn", "", "response", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;", "lastPollUnsuccessful", "tabOverride", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "<init>", "(ZLcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;ZLcom/robinhood/android/navigation/keys/FragmentTab;)V", "title", "", "getTitle", "()Ljava/lang/String;", "cards", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/movers/InstrumentPreviewCardState;", "getCards", "()Lkotlinx/collections/immutable/ImmutableList;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "getDisclosure", "hideEverything", "getHideEverything", "()Z", "appendTabOverrideToDeeplink", "dailyMoversBottomSheetState", "Lcom/robinhood/shared/crypto/movers/CryptoHomeDailyMoversBottomSheetState;", "getDailyMoversBottomSheetState", "()Lcom/robinhood/shared/crypto/movers/CryptoHomeDailyMoversBottomSheetState;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "lib-crypto-movers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class CryptoDailyMoversDataState {
    public static final int $stable = 8;
    private final boolean isLoggedIn;
    private final boolean lastPollUnsuccessful;
    private final CryptoTradingOptions response;
    private final FragmentTab tabOverride;

    /* renamed from: component1, reason: from getter */
    private final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    /* renamed from: component2, reason: from getter */
    private final CryptoTradingOptions getResponse() {
        return this.response;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getLastPollUnsuccessful() {
        return this.lastPollUnsuccessful;
    }

    /* renamed from: component4, reason: from getter */
    private final FragmentTab getTabOverride() {
        return this.tabOverride;
    }

    public static /* synthetic */ CryptoDailyMoversDataState copy$default(CryptoDailyMoversDataState cryptoDailyMoversDataState, boolean z, CryptoTradingOptions cryptoTradingOptions, boolean z2, FragmentTab fragmentTab, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cryptoDailyMoversDataState.isLoggedIn;
        }
        if ((i & 2) != 0) {
            cryptoTradingOptions = cryptoDailyMoversDataState.response;
        }
        if ((i & 4) != 0) {
            z2 = cryptoDailyMoversDataState.lastPollUnsuccessful;
        }
        if ((i & 8) != 0) {
            fragmentTab = cryptoDailyMoversDataState.tabOverride;
        }
        return cryptoDailyMoversDataState.copy(z, cryptoTradingOptions, z2, fragmentTab);
    }

    public final CryptoDailyMoversDataState copy(boolean isLoggedIn, CryptoTradingOptions response, boolean lastPollUnsuccessful, FragmentTab tabOverride) {
        return new CryptoDailyMoversDataState(isLoggedIn, response, lastPollUnsuccessful, tabOverride);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDailyMoversDataState)) {
            return false;
        }
        CryptoDailyMoversDataState cryptoDailyMoversDataState = (CryptoDailyMoversDataState) other;
        return this.isLoggedIn == cryptoDailyMoversDataState.isLoggedIn && Intrinsics.areEqual(this.response, cryptoDailyMoversDataState.response) && this.lastPollUnsuccessful == cryptoDailyMoversDataState.lastPollUnsuccessful && this.tabOverride == cryptoDailyMoversDataState.tabOverride;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoggedIn) * 31;
        CryptoTradingOptions cryptoTradingOptions = this.response;
        int iHashCode2 = (((iHashCode + (cryptoTradingOptions == null ? 0 : cryptoTradingOptions.hashCode())) * 31) + Boolean.hashCode(this.lastPollUnsuccessful)) * 31;
        FragmentTab fragmentTab = this.tabOverride;
        return iHashCode2 + (fragmentTab != null ? fragmentTab.hashCode() : 0);
    }

    public String toString() {
        return "CryptoDailyMoversDataState(isLoggedIn=" + this.isLoggedIn + ", response=" + this.response + ", lastPollUnsuccessful=" + this.lastPollUnsuccessful + ", tabOverride=" + this.tabOverride + ")";
    }

    public CryptoDailyMoversDataState(boolean z, CryptoTradingOptions cryptoTradingOptions, boolean z2, FragmentTab fragmentTab) {
        this.isLoggedIn = z;
        this.response = cryptoTradingOptions;
        this.lastPollUnsuccessful = z2;
        this.tabOverride = fragmentTab;
    }

    public /* synthetic */ CryptoDailyMoversDataState(boolean z, CryptoTradingOptions cryptoTradingOptions, boolean z2, FragmentTab fragmentTab, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, cryptoTradingOptions, z2, (i & 8) != 0 ? null : fragmentTab);
    }

    public final String getTitle() {
        CryptoTradingOptions cryptoTradingOptions = this.response;
        if (cryptoTradingOptions != null) {
            return cryptoTradingOptions.getTitle();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ImmutableList<InstrumentPreviewCard4> getCards() {
        ImmutableList<CryptoTradingOptions.TradingOptionItem> results;
        CryptoTradingOptions cryptoTradingOptions = this.response;
        int i = 1;
        ApiCryptoTradingOptions3 apiCryptoTradingOptions3 = null;
        Object[] objArr = 0;
        if (cryptoTradingOptions != null && (results = cryptoTradingOptions.getResults()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            for (CryptoTradingOptions.TradingOptionItem tradingOptionItem : results) {
                InstrumentDetails3.Chart chart = tradingOptionItem.getChart();
                List<ChartLine> chartLines = chart != null ? chart.getChartLines() : null;
                InstrumentDetails3.Chart chart2 = tradingOptionItem.getChart();
                Direction pageDirection = chart2 != null ? chart2.getPageDirection() : null;
                String percentChange = tradingOptionItem.getPercentChange();
                String lastPrice = tradingOptionItem.getLastPrice();
                String subtitle = tradingOptionItem.getSubtitle();
                String title = tradingOptionItem.getTitle();
                String deeplink = tradingOptionItem.getDeeplink();
                FragmentTab fragmentTab = this.tabOverride;
                if ((fragmentTab != null) != false) {
                    if (fragmentTab == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    deeplink = appendTabOverrideToDeeplink(deeplink, fragmentTab);
                }
                arrayList.add(new CryptoDailyMoversViewState.CryptoCard(deeplink, this.isLoggedIn ? Boolean.TRUE : null, title, subtitle, lastPrice, percentChange, chartLines, pageDirection, this.response.getStyle()));
            }
            ImmutableList<InstrumentPreviewCard4> immutableList = extensions2.toImmutableList(arrayList);
            if (immutableList != null) {
                return immutableList;
            }
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            arrayList2.add(new InstrumentPreviewCard4.Loading(apiCryptoTradingOptions3, i, objArr == true ? 1 : 0));
        }
        return extensions2.toImmutableList(arrayList2);
    }

    public final String getDisclosure() {
        CryptoTradingOptions cryptoTradingOptions = this.response;
        if (cryptoTradingOptions != null) {
            return cryptoTradingOptions.getDisclosure();
        }
        return null;
    }

    public final boolean getHideEverything() {
        CryptoTradingOptions cryptoTradingOptions;
        ImmutableList<CryptoTradingOptions.TradingOptionItem> results;
        return this.lastPollUnsuccessful && (cryptoTradingOptions = this.response) != null && (results = cryptoTradingOptions.getResults()) != null && (results.isEmpty() ^ true);
    }

    private final String appendTabOverrideToDeeplink(String str, FragmentTab fragmentTab) {
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) Content.MarketIndicator.CRYPTO_TYPE, false, 2, (Object) null)) {
            return str;
        }
        String string2 = Uri.parse(str).buildUpon().appendQueryParameter("tab_override", fragmentTab.name()).build().toString();
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    public final CryptoHomeDailyMoversBottomSheetState getDailyMoversBottomSheetState() {
        CryptoTradingOptions cryptoTradingOptions = this.response;
        if (cryptoTradingOptions == null) {
            return null;
        }
        String title = cryptoTradingOptions.getTitle();
        String description = cryptoTradingOptions.getDescription();
        if (title == null || description == null) {
            return null;
        }
        return new CryptoHomeDailyMoversBottomSheetState(title, description);
    }
}
