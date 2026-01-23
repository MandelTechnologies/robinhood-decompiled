package com.robinhood.android.crypto.p094ui.detail;

import androidx.paging.PagedList;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.p094ui.detail.CryptoDetailMenu;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.models.crypto.p314db.CryptoDescription;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p314db.Cryptobility;
import com.robinhood.models.crypto.p315ui.UiCryptoHistorical;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.models.util.Money;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: CryptoDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001zB\u0081\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020\u001e\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010$\u001a\u00020\u001e\u0012\b\b\u0002\u0010%\u001a\u00020\u001e\u0012\b\b\u0002\u0010&\u001a\u00020\u001e¢\u0006\u0004\b'\u0010(J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u001b\u0010h\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013\u0018\u00010\u0010HÆ\u0003J\u0011\u0010i\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0005HÆ\u0003J\u0011\u0010j\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0005HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0011\u0010l\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bHÆ\u0003J\t\u0010m\u001a\u00020\u001eHÆ\u0003J\t\u0010n\u001a\u00020\u001eHÆ\u0003J\t\u0010o\u001a\u00020\u001eHÆ\u0003J\t\u0010p\u001a\u00020\u001eHÂ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010#HÂ\u0003J\t\u0010r\u001a\u00020\u001eHÂ\u0003J\t\u0010s\u001a\u00020\u001eHÆ\u0003J\t\u0010t\u001a\u00020\u001eHÆ\u0003J\u0085\u0002\u0010u\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013\u0018\u00010\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00052\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020\u001e2\b\b\u0002\u0010%\u001a\u00020\u001e2\b\b\u0002\u0010&\u001a\u00020\u001eHÆ\u0001J\u0013\u0010v\u001a\u00020\u001e2\b\u0010w\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010x\u001a\u00020NHÖ\u0001J\t\u0010y\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R#\u0010\u000f\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010,R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010=R\u0011\u0010\u001f\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010=R\u0011\u0010 \u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b \u0010=R\u000e\u0010!\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010%\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010=R\u0011\u0010&\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010=R\u0011\u0010>\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b>\u0010=R\u0014\u0010?\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0014\u0010@\u001a\u00020A8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020A0\u00058F¢\u0006\u0006\u001a\u0004\bE\u0010,R\u0019\u0010F\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u0010,R\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010,R\u0011\u0010K\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bL\u0010=R\u0011\u0010M\u001a\u00020N8G¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010Q\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bQ\u0010=R\u0011\u0010R\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bR\u0010=R\u0011\u0010S\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bT\u0010=R\u0013\u0010U\u001a\u0004\u0018\u00010V8F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0011\u0010Y\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bZ\u0010=R\u000e\u0010[\u001a\u00020\\X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010]\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0011\u0010`\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\ba\u0010_¨\u0006{"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/CryptoDetailViewState;", "", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "userListIds", "", "Ljava/util/UUID;", "cryptoQuote", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "graphSelection", "Lcom/robinhood/models/ui/GraphSelection;", "cryptoHistorical", "Lcom/robinhood/models/crypto/ui/UiCryptoHistorical;", "unifiedAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "historyItems", "Landroidx/paging/PagedList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "assetNewsItems", "Lcom/robinhood/models/newsfeed/db/dao/NewsFeedElement;", "allCoins", "Lcom/robinhood/models/db/CuratedListItem;", "cryptoDescription", "Lcom/robinhood/models/crypto/db/CryptoDescription;", "rhcUpsellEvent", "Lcom/robinhood/udf/UiEvent;", "", "isRewardsSectionEnabled", "", "isCryptoHistoricalSduiChartEnabled", "isAssetDigestsCryptoEnabled", "isShowingEducationTour", "cryptobility", "Lcom/robinhood/models/crypto/db/Cryptobility;", "isRhcApp", "isPipExperimentEnabled", "isPerpetualsEnabled", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/util/List;Lcom/robinhood/models/crypto/db/CryptoQuote;Lcom/robinhood/models/ui/GraphSelection;Lcom/robinhood/models/crypto/ui/UiCryptoHistorical;Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;Landroidx/paging/PagedList;Ljava/util/List;Ljava/util/List;Lcom/robinhood/models/crypto/db/CryptoDescription;Lcom/robinhood/udf/UiEvent;ZZZZLcom/robinhood/models/crypto/db/Cryptobility;ZZZ)V", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getUserListIds", "()Ljava/util/List;", "getCryptoQuote", "()Lcom/robinhood/models/crypto/db/CryptoQuote;", "getGraphSelection", "()Lcom/robinhood/models/ui/GraphSelection;", "getCryptoHistorical", "()Lcom/robinhood/models/crypto/ui/UiCryptoHistorical;", "getUnifiedAccount", "()Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "getHistoryItems", "()Landroidx/paging/PagedList;", "getAssetNewsItems", "getAllCoins", "getCryptoDescription", "()Lcom/robinhood/models/crypto/db/CryptoDescription;", "getRhcUpsellEvent", "()Lcom/robinhood/udf/UiEvent;", "()Z", "isAdvancedAlertsEnabled", "isBeingWatched", "defaultMenuAction", "Lcom/robinhood/android/crypto/ui/detail/CryptoDetailMenu$MenuAction;", "getDefaultMenuAction", "()Lcom/robinhood/android/crypto/ui/detail/CryptoDetailMenu$MenuAction;", "menuActions", "getMenuActions", "dataPoints", "Lcom/robinhood/models/ui/DataPoint$Asset;", "getDataPoints", "otherCoinsIds", "getOtherCoinsIds", "hasNewsItems", "getHasNewsItems", "historyTitle", "", "getHistoryTitle", "()I", "isHistoryTitleVisible", "isUnifiedHistoryVisible", "showStats", "getShowStats", "assetDigestData", "Lcom/robinhood/android/crypto/ui/detail/CryptoDetailViewState$AssetDigestData;", "getAssetDigestData", "()Lcom/robinhood/android/crypto/ui/detail/CryptoDetailViewState$AssetDigestData;", "showCard", "getShowCard", "priceFormat", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "toolbarTitle", "getToolbarTitle", "()Ljava/lang/String;", "toolbarSubtitle", "getToolbarSubtitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "other", "hashCode", "toString", "AssetDigestData", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class CryptoDetailViewState {
    public static final int $stable = 8;
    private final List<CuratedListItem> allCoins;
    private final List<NewsFeedElement> assetNewsItems;
    private final CryptoDescription cryptoDescription;
    private final UiCryptoHistorical cryptoHistorical;
    private final CryptoQuote cryptoQuote;
    private final Cryptobility cryptobility;
    private final UiCurrencyPair currencyPair;
    private final List<DataPoint.Asset> dataPoints;
    private final GraphSelection graphSelection;
    private final PagedList<StatefulHistoryEvent<HistoryEvent>> historyItems;
    private final boolean isAssetDigestsCryptoEnabled;
    private final boolean isCryptoHistoricalSduiChartEnabled;
    private final boolean isPerpetualsEnabled;
    private final boolean isPipExperimentEnabled;
    private final boolean isRewardsSectionEnabled;
    private final boolean isRhcApp;
    private final boolean isShowingEducationTour;
    private final List<UUID> otherCoinsIds;
    private final NumberFormatter priceFormat;
    private final UiEvent<String> rhcUpsellEvent;
    private final UnifiedAccountV2 unifiedAccount;
    private final List<UUID> userListIds;

    /* renamed from: component15, reason: from getter */
    private final boolean getIsShowingEducationTour() {
        return this.isShowingEducationTour;
    }

    /* renamed from: component16, reason: from getter */
    private final Cryptobility getCryptobility() {
        return this.cryptobility;
    }

    /* renamed from: component17, reason: from getter */
    private final boolean getIsRhcApp() {
        return this.isRhcApp;
    }

    public static /* synthetic */ CryptoDetailViewState copy$default(CryptoDetailViewState cryptoDetailViewState, UiCurrencyPair uiCurrencyPair, List list, CryptoQuote cryptoQuote, GraphSelection graphSelection, UiCryptoHistorical uiCryptoHistorical, UnifiedAccountV2 unifiedAccountV2, PagedList pagedList, List list2, List list3, CryptoDescription cryptoDescription, UiEvent uiEvent, boolean z, boolean z2, boolean z3, boolean z4, Cryptobility cryptobility, boolean z5, boolean z6, boolean z7, int i, Object obj) {
        boolean z8;
        boolean z9;
        UiCurrencyPair uiCurrencyPair2 = (i & 1) != 0 ? cryptoDetailViewState.currencyPair : uiCurrencyPair;
        List list4 = (i & 2) != 0 ? cryptoDetailViewState.userListIds : list;
        CryptoQuote cryptoQuote2 = (i & 4) != 0 ? cryptoDetailViewState.cryptoQuote : cryptoQuote;
        GraphSelection graphSelection2 = (i & 8) != 0 ? cryptoDetailViewState.graphSelection : graphSelection;
        UiCryptoHistorical uiCryptoHistorical2 = (i & 16) != 0 ? cryptoDetailViewState.cryptoHistorical : uiCryptoHistorical;
        UnifiedAccountV2 unifiedAccountV22 = (i & 32) != 0 ? cryptoDetailViewState.unifiedAccount : unifiedAccountV2;
        PagedList pagedList2 = (i & 64) != 0 ? cryptoDetailViewState.historyItems : pagedList;
        List list5 = (i & 128) != 0 ? cryptoDetailViewState.assetNewsItems : list2;
        List list6 = (i & 256) != 0 ? cryptoDetailViewState.allCoins : list3;
        CryptoDescription cryptoDescription2 = (i & 512) != 0 ? cryptoDetailViewState.cryptoDescription : cryptoDescription;
        UiEvent uiEvent2 = (i & 1024) != 0 ? cryptoDetailViewState.rhcUpsellEvent : uiEvent;
        boolean z10 = (i & 2048) != 0 ? cryptoDetailViewState.isRewardsSectionEnabled : z;
        boolean z11 = (i & 4096) != 0 ? cryptoDetailViewState.isCryptoHistoricalSduiChartEnabled : z2;
        boolean z12 = (i & 8192) != 0 ? cryptoDetailViewState.isAssetDigestsCryptoEnabled : z3;
        UiCurrencyPair uiCurrencyPair3 = uiCurrencyPair2;
        boolean z13 = (i & 16384) != 0 ? cryptoDetailViewState.isShowingEducationTour : z4;
        Cryptobility cryptobility2 = (i & 32768) != 0 ? cryptoDetailViewState.cryptobility : cryptobility;
        boolean z14 = (i & 65536) != 0 ? cryptoDetailViewState.isRhcApp : z5;
        boolean z15 = (i & 131072) != 0 ? cryptoDetailViewState.isPipExperimentEnabled : z6;
        if ((i & 262144) != 0) {
            z9 = z15;
            z8 = cryptoDetailViewState.isPerpetualsEnabled;
        } else {
            z8 = z7;
            z9 = z15;
        }
        return cryptoDetailViewState.copy(uiCurrencyPair3, list4, cryptoQuote2, graphSelection2, uiCryptoHistorical2, unifiedAccountV22, pagedList2, list5, list6, cryptoDescription2, uiEvent2, z10, z11, z12, z13, cryptobility2, z14, z9, z8);
    }

    /* renamed from: component1, reason: from getter */
    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    /* renamed from: component10, reason: from getter */
    public final CryptoDescription getCryptoDescription() {
        return this.cryptoDescription;
    }

    public final UiEvent<String> component11() {
        return this.rhcUpsellEvent;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsRewardsSectionEnabled() {
        return this.isRewardsSectionEnabled;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsCryptoHistoricalSduiChartEnabled() {
        return this.isCryptoHistoricalSduiChartEnabled;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsAssetDigestsCryptoEnabled() {
        return this.isAssetDigestsCryptoEnabled;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsPipExperimentEnabled() {
        return this.isPipExperimentEnabled;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsPerpetualsEnabled() {
        return this.isPerpetualsEnabled;
    }

    public final List<UUID> component2() {
        return this.userListIds;
    }

    /* renamed from: component3, reason: from getter */
    public final CryptoQuote getCryptoQuote() {
        return this.cryptoQuote;
    }

    /* renamed from: component4, reason: from getter */
    public final GraphSelection getGraphSelection() {
        return this.graphSelection;
    }

    /* renamed from: component5, reason: from getter */
    public final UiCryptoHistorical getCryptoHistorical() {
        return this.cryptoHistorical;
    }

    /* renamed from: component6, reason: from getter */
    public final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> component7() {
        return this.historyItems;
    }

    public final List<NewsFeedElement> component8() {
        return this.assetNewsItems;
    }

    public final List<CuratedListItem> component9() {
        return this.allCoins;
    }

    public final CryptoDetailViewState copy(UiCurrencyPair currencyPair, List<UUID> userListIds, CryptoQuote cryptoQuote, GraphSelection graphSelection, UiCryptoHistorical cryptoHistorical, UnifiedAccountV2 unifiedAccount, PagedList<StatefulHistoryEvent<HistoryEvent>> historyItems, List<NewsFeedElement> assetNewsItems, List<CuratedListItem> allCoins, CryptoDescription cryptoDescription, UiEvent<String> rhcUpsellEvent, boolean isRewardsSectionEnabled, boolean isCryptoHistoricalSduiChartEnabled, boolean isAssetDigestsCryptoEnabled, boolean isShowingEducationTour, Cryptobility cryptobility, boolean isRhcApp, boolean isPipExperimentEnabled, boolean isPerpetualsEnabled) {
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        return new CryptoDetailViewState(currencyPair, userListIds, cryptoQuote, graphSelection, cryptoHistorical, unifiedAccount, historyItems, assetNewsItems, allCoins, cryptoDescription, rhcUpsellEvent, isRewardsSectionEnabled, isCryptoHistoricalSduiChartEnabled, isAssetDigestsCryptoEnabled, isShowingEducationTour, cryptobility, isRhcApp, isPipExperimentEnabled, isPerpetualsEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDetailViewState)) {
            return false;
        }
        CryptoDetailViewState cryptoDetailViewState = (CryptoDetailViewState) other;
        return Intrinsics.areEqual(this.currencyPair, cryptoDetailViewState.currencyPair) && Intrinsics.areEqual(this.userListIds, cryptoDetailViewState.userListIds) && Intrinsics.areEqual(this.cryptoQuote, cryptoDetailViewState.cryptoQuote) && this.graphSelection == cryptoDetailViewState.graphSelection && Intrinsics.areEqual(this.cryptoHistorical, cryptoDetailViewState.cryptoHistorical) && Intrinsics.areEqual(this.unifiedAccount, cryptoDetailViewState.unifiedAccount) && Intrinsics.areEqual(this.historyItems, cryptoDetailViewState.historyItems) && Intrinsics.areEqual(this.assetNewsItems, cryptoDetailViewState.assetNewsItems) && Intrinsics.areEqual(this.allCoins, cryptoDetailViewState.allCoins) && Intrinsics.areEqual(this.cryptoDescription, cryptoDetailViewState.cryptoDescription) && Intrinsics.areEqual(this.rhcUpsellEvent, cryptoDetailViewState.rhcUpsellEvent) && this.isRewardsSectionEnabled == cryptoDetailViewState.isRewardsSectionEnabled && this.isCryptoHistoricalSduiChartEnabled == cryptoDetailViewState.isCryptoHistoricalSduiChartEnabled && this.isAssetDigestsCryptoEnabled == cryptoDetailViewState.isAssetDigestsCryptoEnabled && this.isShowingEducationTour == cryptoDetailViewState.isShowingEducationTour && Intrinsics.areEqual(this.cryptobility, cryptoDetailViewState.cryptobility) && this.isRhcApp == cryptoDetailViewState.isRhcApp && this.isPipExperimentEnabled == cryptoDetailViewState.isPipExperimentEnabled && this.isPerpetualsEnabled == cryptoDetailViewState.isPerpetualsEnabled;
    }

    public int hashCode() {
        int iHashCode = this.currencyPair.hashCode() * 31;
        List<UUID> list = this.userListIds;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        CryptoQuote cryptoQuote = this.cryptoQuote;
        int iHashCode3 = (iHashCode2 + (cryptoQuote == null ? 0 : cryptoQuote.hashCode())) * 31;
        GraphSelection graphSelection = this.graphSelection;
        int iHashCode4 = (iHashCode3 + (graphSelection == null ? 0 : graphSelection.hashCode())) * 31;
        UiCryptoHistorical uiCryptoHistorical = this.cryptoHistorical;
        int iHashCode5 = (iHashCode4 + (uiCryptoHistorical == null ? 0 : uiCryptoHistorical.hashCode())) * 31;
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        int iHashCode6 = (iHashCode5 + (unifiedAccountV2 == null ? 0 : unifiedAccountV2.hashCode())) * 31;
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList = this.historyItems;
        int iHashCode7 = (iHashCode6 + (pagedList == null ? 0 : pagedList.hashCode())) * 31;
        List<NewsFeedElement> list2 = this.assetNewsItems;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CuratedListItem> list3 = this.allCoins;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        CryptoDescription cryptoDescription = this.cryptoDescription;
        int iHashCode10 = (iHashCode9 + (cryptoDescription == null ? 0 : cryptoDescription.hashCode())) * 31;
        UiEvent<String> uiEvent = this.rhcUpsellEvent;
        int iHashCode11 = (((((((((iHashCode10 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + Boolean.hashCode(this.isRewardsSectionEnabled)) * 31) + Boolean.hashCode(this.isCryptoHistoricalSduiChartEnabled)) * 31) + Boolean.hashCode(this.isAssetDigestsCryptoEnabled)) * 31) + Boolean.hashCode(this.isShowingEducationTour)) * 31;
        Cryptobility cryptobility = this.cryptobility;
        return ((((((iHashCode11 + (cryptobility != null ? cryptobility.hashCode() : 0)) * 31) + Boolean.hashCode(this.isRhcApp)) * 31) + Boolean.hashCode(this.isPipExperimentEnabled)) * 31) + Boolean.hashCode(this.isPerpetualsEnabled);
    }

    public String toString() {
        return "CryptoDetailViewState(currencyPair=" + this.currencyPair + ", userListIds=" + this.userListIds + ", cryptoQuote=" + this.cryptoQuote + ", graphSelection=" + this.graphSelection + ", cryptoHistorical=" + this.cryptoHistorical + ", unifiedAccount=" + this.unifiedAccount + ", historyItems=" + this.historyItems + ", assetNewsItems=" + this.assetNewsItems + ", allCoins=" + this.allCoins + ", cryptoDescription=" + this.cryptoDescription + ", rhcUpsellEvent=" + this.rhcUpsellEvent + ", isRewardsSectionEnabled=" + this.isRewardsSectionEnabled + ", isCryptoHistoricalSduiChartEnabled=" + this.isCryptoHistoricalSduiChartEnabled + ", isAssetDigestsCryptoEnabled=" + this.isAssetDigestsCryptoEnabled + ", isShowingEducationTour=" + this.isShowingEducationTour + ", cryptobility=" + this.cryptobility + ", isRhcApp=" + this.isRhcApp + ", isPipExperimentEnabled=" + this.isPipExperimentEnabled + ", isPerpetualsEnabled=" + this.isPerpetualsEnabled + ")";
    }

    public CryptoDetailViewState(UiCurrencyPair currencyPair, List<UUID> list, CryptoQuote cryptoQuote, GraphSelection graphSelection, UiCryptoHistorical uiCryptoHistorical, UnifiedAccountV2 unifiedAccountV2, PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList, List<NewsFeedElement> list2, List<CuratedListItem> list3, CryptoDescription cryptoDescription, UiEvent<String> uiEvent, boolean z, boolean z2, boolean z3, boolean z4, Cryptobility cryptobility, boolean z5, boolean z6, boolean z7) {
        List<UUID> listEmptyList;
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        this.currencyPair = currencyPair;
        this.userListIds = list;
        this.cryptoQuote = cryptoQuote;
        this.graphSelection = graphSelection;
        this.cryptoHistorical = uiCryptoHistorical;
        this.unifiedAccount = unifiedAccountV2;
        this.historyItems = pagedList;
        this.assetNewsItems = list2;
        this.allCoins = list3;
        this.cryptoDescription = cryptoDescription;
        this.rhcUpsellEvent = uiEvent;
        this.isRewardsSectionEnabled = z;
        this.isCryptoHistoricalSduiChartEnabled = z2;
        this.isAssetDigestsCryptoEnabled = z3;
        this.isShowingEducationTour = z4;
        this.cryptobility = cryptobility;
        this.isRhcApp = z5;
        this.isPipExperimentEnabled = z6;
        this.isPerpetualsEnabled = z7;
        List<DataPoint.Asset> dataPointsForDisplay$default = null;
        dataPointsForDisplay$default = null;
        if (uiCryptoHistorical != null && graphSelection != null) {
            Money markPrice = cryptoQuote != null ? cryptoQuote.getMarkPrice() : null;
            Instant receivedAt = (cryptoQuote == null || (receivedAt = cryptoQuote.getReceivedAt()) == null) ? Instant.EPOCH : receivedAt;
            Intrinsics.checkNotNull(receivedAt);
            dataPointsForDisplay$default = Historical.DefaultImpls.getDataPointsForDisplay$default(uiCryptoHistorical, markPrice, receivedAt, graphSelection, null, null, 24, null);
        }
        this.dataPoints = dataPointsForDisplay$default;
        if (list3 == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list3) {
                if (!Intrinsics.areEqual(((CuratedListItem) obj).getDisplaySymbol(), this.currencyPair.getAssetCurrency().getCode())) {
                    arrayList.add(obj);
                }
            }
            listEmptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                listEmptyList.add(((CuratedListItem) it.next()).getId());
            }
        }
        this.otherCoinsIds = listEmptyList;
        this.priceFormat = CurrencyDefinitions.getCryptoFiatPriceFormatterForTicker(this.currencyPair.getQuoteCurrencyForPriceInput());
    }

    public /* synthetic */ CryptoDetailViewState(UiCurrencyPair uiCurrencyPair, List list, CryptoQuote cryptoQuote, GraphSelection graphSelection, UiCryptoHistorical uiCryptoHistorical, UnifiedAccountV2 unifiedAccountV2, PagedList pagedList, List list2, List list3, CryptoDescription cryptoDescription, UiEvent uiEvent, boolean z, boolean z2, boolean z3, boolean z4, Cryptobility cryptobility, boolean z5, boolean z6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiCurrencyPair, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : cryptoQuote, (i & 8) != 0 ? null : graphSelection, (i & 16) != 0 ? null : uiCryptoHistorical, (i & 32) != 0 ? null : unifiedAccountV2, (i & 64) != 0 ? null : pagedList, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : list3, (i & 512) != 0 ? null : cryptoDescription, (i & 1024) != 0 ? null : uiEvent, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? false : z2, (i & 8192) != 0 ? false : z3, (i & 16384) != 0 ? false : z4, (i & 32768) != 0 ? null : cryptobility, (i & 65536) != 0 ? false : z5, (i & 131072) != 0 ? false : z6, (i & 262144) != 0 ? false : z7);
    }

    public final UiCurrencyPair getCurrencyPair() {
        return this.currencyPair;
    }

    public final List<UUID> getUserListIds() {
        return this.userListIds;
    }

    public final CryptoQuote getCryptoQuote() {
        return this.cryptoQuote;
    }

    public final GraphSelection getGraphSelection() {
        return this.graphSelection;
    }

    public final UiCryptoHistorical getCryptoHistorical() {
        return this.cryptoHistorical;
    }

    public final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> getHistoryItems() {
        return this.historyItems;
    }

    public final List<NewsFeedElement> getAssetNewsItems() {
        return this.assetNewsItems;
    }

    public final List<CuratedListItem> getAllCoins() {
        return this.allCoins;
    }

    public final CryptoDescription getCryptoDescription() {
        return this.cryptoDescription;
    }

    public final UiEvent<String> getRhcUpsellEvent() {
        return this.rhcUpsellEvent;
    }

    public final boolean isRewardsSectionEnabled() {
        return this.isRewardsSectionEnabled;
    }

    public final boolean isCryptoHistoricalSduiChartEnabled() {
        return this.isCryptoHistoricalSduiChartEnabled;
    }

    public final boolean isAssetDigestsCryptoEnabled() {
        return this.isAssetDigestsCryptoEnabled;
    }

    public final boolean isPipExperimentEnabled() {
        return this.isPipExperimentEnabled;
    }

    public final boolean isPerpetualsEnabled() {
        return this.isPerpetualsEnabled;
    }

    public final boolean isAdvancedAlertsEnabled() {
        return !this.currencyPair.getMarketOrdersOnly();
    }

    private final boolean isBeingWatched() {
        List<UUID> list = this.userListIds;
        return list != null && (list.isEmpty() ^ true);
    }

    private final CryptoDetailMenu.MenuAction getDefaultMenuAction() {
        if (isBeingWatched()) {
            return CryptoDetailMenu.MenuAction.UPDATE;
        }
        return CryptoDetailMenu.MenuAction.ADD;
    }

    public final List<CryptoDetailMenu.MenuAction> getMenuActions() {
        List listEmptyList;
        List listEmptyList2;
        if (this.isRhcApp) {
            return CollectionsKt.listOf(getDefaultMenuAction());
        }
        List listListOf = CollectionsKt.listOf(getDefaultMenuAction());
        if (isAdvancedAlertsEnabled()) {
            listEmptyList = CollectionsKt.listOf(CryptoDetailMenu.MenuAction.ALERTS);
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        List listPlus = CollectionsKt.plus((Collection) listListOf, (Iterable) listEmptyList);
        if (this.isPipExperimentEnabled) {
            listEmptyList2 = CollectionsKt.listOf(CryptoDetailMenu.MenuAction.PICTURE_IN_PICTURE);
        } else {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus((Collection) listPlus, (Iterable) listEmptyList2);
    }

    public final List<DataPoint.Asset> getDataPoints() {
        return this.dataPoints;
    }

    public final List<UUID> getOtherCoinsIds() {
        return this.otherCoinsIds;
    }

    public final boolean getHasNewsItems() {
        List<NewsFeedElement> list = this.assetNewsItems;
        return !(list == null || list.isEmpty());
    }

    public final int getHistoryTitle() {
        return C12757R.string.crypto_detail_your_history_label;
    }

    public final boolean isHistoryTitleVisible() {
        return isUnifiedHistoryVisible();
    }

    public final boolean isUnifiedHistoryVisible() {
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList;
        return (this.currencyPair.getDisplayOnly() || (pagedList = this.historyItems) == null || !(pagedList.isEmpty() ^ true)) ? false : true;
    }

    public final boolean getShowStats() {
        return !this.isRhcApp;
    }

    public final AssetDigestData getAssetDigestData() {
        UnifiedAccountV2 unifiedAccountV2;
        String accountNumber;
        if (this.isRhcApp || !this.isAssetDigestsCryptoEnabled || (unifiedAccountV2 = this.unifiedAccount) == null || (accountNumber = unifiedAccountV2.getAccountNumber()) == null) {
            return null;
        }
        return new AssetDigestData(accountNumber, this.currencyPair.getId());
    }

    public final boolean getShowCard() {
        return !this.isRhcApp;
    }

    public final String getToolbarTitle() {
        CryptoQuote cryptoQuote = this.cryptoQuote;
        if (cryptoQuote != null) {
            return this.priceFormat.format(cryptoQuote.getMarkPrice().getDecimalValue());
        }
        return "";
    }

    public final String getToolbarSubtitle() {
        if (getToolbarTitle().length() > 0) {
            return this.currencyPair.getDisplayName();
        }
        return "";
    }

    /* compiled from: CryptoDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/CryptoDetailViewState$AssetDigestData;", "", "accountNumber", "", "currencyPairId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getAccountNumber", "()Ljava/lang/String;", "getCurrencyPairId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AssetDigestData {
        public static final int $stable = 8;
        private final String accountNumber;
        private final UUID currencyPairId;

        public static /* synthetic */ AssetDigestData copy$default(AssetDigestData assetDigestData, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = assetDigestData.accountNumber;
            }
            if ((i & 2) != 0) {
                uuid = assetDigestData.currencyPairId;
            }
            return assetDigestData.copy(str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final AssetDigestData copy(String accountNumber, UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return new AssetDigestData(accountNumber, currencyPairId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AssetDigestData)) {
                return false;
            }
            AssetDigestData assetDigestData = (AssetDigestData) other;
            return Intrinsics.areEqual(this.accountNumber, assetDigestData.accountNumber) && Intrinsics.areEqual(this.currencyPairId, assetDigestData.currencyPairId);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.currencyPairId.hashCode();
        }

        public String toString() {
            return "AssetDigestData(accountNumber=" + this.accountNumber + ", currencyPairId=" + this.currencyPairId + ")";
        }

        public AssetDigestData(String accountNumber, UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.accountNumber = accountNumber;
            this.currencyPairId = currencyPairId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }
    }
}
