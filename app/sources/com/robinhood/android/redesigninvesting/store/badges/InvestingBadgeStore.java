package com.robinhood.android.redesigninvesting.store.badges;

import androidx.paging.PagedList;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.newsfeed.models.breakingnews.api.ApiAssetType;
import com.robinhood.android.newsfeed.models.breakingnews.p199db.BreakingNews;
import com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore;
import com.robinhood.android.redesign.dao.HighlightImpressionDao;
import com.robinhood.android.redesign.model.AssetQuote;
import com.robinhood.android.redesign.model.HighlightImpression;
import com.robinhood.android.redesigninvesting.models.badges.InvestingBadge;
import com.robinhood.android.redesigninvesting.models.highlights.volatility.p233db.FundamentalRisk;
import com.robinhood.android.redesigninvesting.redesignsettings.RedesignSettings;
import com.robinhood.android.redesigninvesting.store.volatility.FundamentalRiskStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Earning;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Fundamental;
import com.robinhood.shared.equities.models.instrumentdetails.p381ui.UiEarnings;
import com.robinhood.shared.equities.models.instrumentdetails.store.FundamentalStore;
import com.robinhood.shared.equities.models.store.TraderEarningStore;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: InvestingBadgeStore.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010#\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001Ba\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b$\u0010%J-\u0010)\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b'\u0010(J\u0018\u0010.\u001a\u00020+2\u0006\u0010*\u001a\u00020\u001aH\u0081@¢\u0006\u0004\b,\u0010-J\u0018\u0010/\u001a\u00020+2\u0006\u0010*\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b/\u0010-J%\u00102\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b0\u00101J/\u00105\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020\u001e2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b5\u00106J-\u00109\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00108\u001a\u000207H\u0007¢\u0006\u0004\b9\u0010:J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020\u001eH\u0001¢\u0006\u0004\b;\u0010<J-\u0010?\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b>\u0010(J#\u0010@\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b@\u00101J-\u0010C\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ER\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010FR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010GR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010IR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010JR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010KR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010LR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010MR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001a0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/store/badges/InvestingBadgeStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;", "breakingNewsStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "equityQuoteStore", "Lcom/robinhood/shared/equities/models/store/TraderEarningStore;", "earningsStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoQuoteStore", "Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore;", "fundamentalRiskStore", "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;", "advancedAlertStore", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;", "fundamentalStore", "Lcom/robinhood/android/redesign/dao/HighlightImpressionDao;", "highlightImpressionDao", "Lcom/robinhood/shared/store/history/HistoryStore;", "historyStore", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/shared/equities/models/store/TraderEarningStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore;Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;Lcom/robinhood/android/redesign/dao/HighlightImpressionDao;Lcom/robinhood/shared/store/history/HistoryStore;Lj$/time/Clock;)V", "", "accountNumber", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;", "instrumentType", "Ljava/util/UUID;", "metadataId", "Lcom/robinhood/android/redesigninvesting/redesignsettings/RedesignSettings;", "settings", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/redesigninvesting/models/badges/InvestingBadge;", "streamBadgeData", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;Ljava/util/UUID;Lcom/robinhood/android/redesigninvesting/redesignsettings/RedesignSettings;)Lkotlinx/coroutines/flow/Flow;", "assetId", "streamPriceAlerts$lib_store_badges_externalDebug", "(Ljava/util/UUID;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;Lcom/robinhood/android/redesigninvesting/redesignsettings/RedesignSettings;)Lkotlinx/coroutines/flow/Flow;", "streamPriceAlerts", "priceAlertId", "", "markPriceAlertGenerated$lib_store_badges_externalDebug", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markPriceAlertGenerated", "markPriceAlertSeen", "streamMarketHalt$lib_store_badges_externalDebug", "(Ljava/util/UUID;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;)Lkotlinx/coroutines/flow/Flow;", "streamMarketHalt", "Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiAssetType;", "assetType", "streamHasBreakingNews", "(Ljava/util/UUID;Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiAssetType;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Ljava/math/BigDecimal;", "threshold", "streamIsTopMover", "(Ljava/util/UUID;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;Ljava/math/BigDecimal;)Lkotlinx/coroutines/flow/Flow;", "streamEarnings$lib_store_badges_externalDebug", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "streamEarnings", "streamVolatility$lib_store_badges_externalDebug", "streamVolatility", "stream52WeekHighLow", "streamPendingOrders$lib_store_badges_externalDebug", "(Ljava/util/UUID;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentType;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "streamPendingOrders", "Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/shared/equities/models/store/TraderEarningStore;", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore;", "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;", "Lcom/robinhood/android/redesign/dao/HighlightImpressionDao;", "Lcom/robinhood/shared/store/history/HistoryStore;", "Lj$/time/Clock;", "", "priceAlertImpressionGeneratedCache", "Ljava/util/Set;", "lib-store-badges_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class InvestingBadgeStore extends Store {
    private final AdvancedAlertStore advancedAlertStore;
    private final BreakingNewsStore breakingNewsStore;
    private final Clock clock;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final TraderEarningStore earningsStore;
    private final QuoteStore equityQuoteStore;
    private final FundamentalRiskStore fundamentalRiskStore;
    private final FundamentalStore fundamentalStore;
    private final HighlightImpressionDao highlightImpressionDao;
    private final HistoryStore historyStore;
    private final Set<String> priceAlertImpressionGeneratedCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingBadgeStore(StoreBundle storeBundle, BreakingNewsStore breakingNewsStore, QuoteStore equityQuoteStore, TraderEarningStore earningsStore, CryptoQuoteStore cryptoQuoteStore, FundamentalRiskStore fundamentalRiskStore, AdvancedAlertStore advancedAlertStore, FundamentalStore fundamentalStore, HighlightImpressionDao highlightImpressionDao, HistoryStore historyStore, Clock clock) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(breakingNewsStore, "breakingNewsStore");
        Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
        Intrinsics.checkNotNullParameter(earningsStore, "earningsStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(fundamentalRiskStore, "fundamentalRiskStore");
        Intrinsics.checkNotNullParameter(advancedAlertStore, "advancedAlertStore");
        Intrinsics.checkNotNullParameter(fundamentalStore, "fundamentalStore");
        Intrinsics.checkNotNullParameter(highlightImpressionDao, "highlightImpressionDao");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.breakingNewsStore = breakingNewsStore;
        this.equityQuoteStore = equityQuoteStore;
        this.earningsStore = earningsStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.fundamentalRiskStore = fundamentalRiskStore;
        this.advancedAlertStore = advancedAlertStore;
        this.fundamentalStore = fundamentalStore;
        this.highlightImpressionDao = highlightImpressionDao;
        this.historyStore = historyStore;
        this.clock = clock;
        this.priceAlertImpressionGeneratedCache = new LinkedHashSet();
    }

    public final Flow<InvestingBadge> streamBadgeData(String accountNumber, InstrumentType instrumentType, UUID metadataId, RedesignSettings settings) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(metadataId, "metadataId");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Flow flowOnStart = FlowKt.onStart(streamMarketHalt$lib_store_badges_externalDebug(metadataId, instrumentType), new InvestingBadgeStore5(null));
        Flow flowOnStart2 = FlowKt.onStart(streamHasBreakingNews(metadataId, Conversion2.toAssetType(instrumentType), accountNumber), new InvestingBadgeStore3(null));
        Flow flowOnStart3 = FlowKt.onStart(streamEarnings$lib_store_badges_externalDebug(metadataId), new InvestingBadgeStore4(null));
        return FlowKt.distinctUntilChanged(FlowExtKt.combineFlows(flowOnStart2, flowOnStart, FlowKt.onStart(streamVolatility$lib_store_badges_externalDebug(metadataId, instrumentType, settings), new InvestingBadgeStore7(null)), FlowKt.onStart(streamPriceAlerts$lib_store_badges_externalDebug(metadataId, instrumentType, settings), new InvestingBadgeStore6(null)), flowOnStart3, new C266501(metadataId, null)));
    }

    /* compiled from: InvestingBadgeStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/models/badges/InvestingBadge;", "breakingNewsBadge", "marketHaltBadge", "volatilityBadge", "priceAlertsBadge", "earningsBadge"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamBadgeData$1", m3645f = "InvestingBadgeStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamBadgeData$1 */
    static final class C266501 extends ContinuationImpl7 implements Function6<InvestingBadge, InvestingBadge, InvestingBadge, InvestingBadge, InvestingBadge, Continuation<? super InvestingBadge>, Object> {
        final /* synthetic */ UUID $metadataId;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        /* synthetic */ Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C266501(UUID uuid, Continuation<? super C266501> continuation) {
            super(6, continuation);
            this.$metadataId = uuid;
        }

        @Override // kotlin.jvm.functions.Function6
        public final Object invoke(InvestingBadge investingBadge, InvestingBadge investingBadge2, InvestingBadge investingBadge3, InvestingBadge investingBadge4, InvestingBadge investingBadge5, Continuation<? super InvestingBadge> continuation) {
            C266501 c266501 = new C266501(this.$metadataId, continuation);
            c266501.L$0 = investingBadge;
            c266501.L$1 = investingBadge2;
            c266501.L$2 = investingBadge3;
            c266501.L$3 = investingBadge4;
            c266501.L$4 = investingBadge5;
            return c266501.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object next;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InvestingBadge investingBadge = (InvestingBadge) this.L$0;
            InvestingBadge investingBadge2 = (InvestingBadge) this.L$1;
            InvestingBadge investingBadge3 = (InvestingBadge) this.L$2;
            InvestingBadge investingBadge4 = (InvestingBadge) this.L$3;
            InvestingBadge investingBadge5 = (InvestingBadge) this.L$4;
            Timber.INSTANCE.mo3350d("Badge results (" + this.$metadataId + "): breakingNewsBadge=" + investingBadge + ", marketHalt=" + investingBadge2 + ", volatilityBadge=" + investingBadge3 + ", priceAlertBadge=" + investingBadge4 + ", earningsBadge=" + investingBadge5 + ", ", new Object[0]);
            Iterator it = CollectionsKt.listOf((Object[]) new InvestingBadge[]{investingBadge, investingBadge2, investingBadge3, investingBadge4, investingBadge5}).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!Intrinsics.areEqual((InvestingBadge) next, InvestingBadge.None.INSTANCE)) {
                    break;
                }
            }
            InvestingBadge investingBadge6 = (InvestingBadge) next;
            return investingBadge6 == null ? InvestingBadge.None.INSTANCE : investingBadge6;
        }
    }

    public final Flow<InvestingBadge> streamPriceAlerts$lib_store_badges_externalDebug(UUID assetId, InstrumentType instrumentType, RedesignSettings settings) {
        UUID uuid;
        Flow flow;
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(settings, "settings");
        InstrumentType instrumentType2 = InstrumentType.EQUITY;
        if (instrumentType != instrumentType2 && instrumentType != InstrumentType.CRYPTO) {
            return FlowKt.flowOf(InvestingBadge.None.INSTANCE);
        }
        if (instrumentType == instrumentType2) {
            final Flow flowFilterNotNull = FlowKt.filterNotNull(this.equityQuoteStore.streamQuote(assetId));
            flow = new Flow<AssetQuote.Equity>() { // from class: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamPriceAlerts$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super AssetQuote.Equity> flowCollector, Continuation continuation) {
                    Object objCollect = flowFilterNotNull.collect(new C266442(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamPriceAlerts$$inlined$map$1$2 */
                public static final class C266442<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamPriceAlerts$$inlined$map$1$2", m3645f = "InvestingBadgeStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamPriceAlerts$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C266442.this.emit(null, this);
                        }
                    }

                    public C266442(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            AssetQuote.Equity equity = new AssetQuote.Equity((Quote) obj, null, 2, null);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(equity, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            uuid = assetId;
        } else {
            uuid = assetId;
            final Flow<CryptoQuote> flowAsFlow = this.cryptoQuoteStore.getStreamCryptoQuote().asFlow(new CryptoQuoteStore.CryptoQuoteArgs(uuid, null, null, 6, null));
            flow = new Flow<AssetQuote.Crypto>() { // from class: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamPriceAlerts$$inlined$map$2
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super AssetQuote.Crypto> flowCollector, Continuation continuation) {
                    Object objCollect = flowAsFlow.collect(new C266452(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamPriceAlerts$$inlined$map$2$2 */
                public static final class C266452<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamPriceAlerts$$inlined$map$2$2", m3645f = "InvestingBadgeStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamPriceAlerts$$inlined$map$2$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C266452.this.emit(null, this);
                        }
                    }

                    public C266452(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            AssetQuote.Crypto crypto2 = new AssetQuote.Crypto((CryptoQuote) obj, null, null, 6, null);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(crypto2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
        }
        return FlowKt.combine(Context7.buffer$default(RxConvert.asFlow(this.advancedAlertStore.streamAdvancedAlert(uuid)), Integer.MAX_VALUE, null, 2, null), flow, new InvestingBadgeStore8(this, settings, null));
    }

    public final Object markPriceAlertGenerated$lib_store_badges_externalDebug(String str, Continuation<? super Unit> continuation) {
        if (this.priceAlertImpressionGeneratedCache.contains(str)) {
            return Unit.INSTANCE;
        }
        this.priceAlertImpressionGeneratedCache.add(str);
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new InvestingBadgeStore2(this, str, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* compiled from: InvestingBadgeStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$markPriceAlertSeen$2", m3645f = "InvestingBadgeStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$markPriceAlertSeen$2 */
    static final class C266492 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $priceAlertId;
        long J$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C266492(String str, Continuation<? super C266492> continuation) {
            super(2, continuation);
            this.$priceAlertId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestingBadgeStore.this.new C266492(this.$priceAlertId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C266492) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        
            if (r7.updateImpression(r1, r3, r6) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long epochMilli = InvestingBadgeStore.this.clock.instant().toEpochMilli();
                HighlightImpressionDao highlightImpressionDao = InvestingBadgeStore.this.highlightImpressionDao;
                String str = this.$priceAlertId;
                this.J$0 = epochMilli;
                this.label = 1;
                obj = highlightImpressionDao.getImpression(str, this);
                if (obj != coroutine_suspended) {
                    j = epochMilli;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            j = this.J$0;
            ResultKt.throwOnFailure(obj);
            HighlightImpression highlightImpression = (HighlightImpression) obj;
            if (highlightImpression != null && highlightImpression.getFirstSeenAt() == null) {
                HighlightImpressionDao highlightImpressionDao2 = InvestingBadgeStore.this.highlightImpressionDao;
                String str2 = this.$priceAlertId;
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    public final Object markPriceAlertSeen(String str, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C266492(str, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final Flow<InvestingBadge> streamMarketHalt$lib_store_badges_externalDebug(UUID assetId, InstrumentType instrumentType) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        if (instrumentType != InstrumentType.EQUITY) {
            return FlowKt.flowOf(InvestingBadge.None.INSTANCE);
        }
        final Flow<Quote> flowStreamQuote = this.equityQuoteStore.streamQuote(assetId);
        final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamMarketHalt$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamQuote.collect(new C266412(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamMarketHalt$$inlined$map$1$2 */
            public static final class C266412<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamMarketHalt$$inlined$map$1$2", m3645f = "InvestingBadgeStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamMarketHalt$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266412.this.emit(null, this);
                    }
                }

                public C266412(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Quote quote = (Quote) obj;
                        Boolean boolBoxBoolean = boxing.boxBoolean(quote != null ? quote.getTradingHalted() : false);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
        return new Flow<InvestingBadge>() { // from class: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamMarketHalt$$inlined$map$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super InvestingBadge> flowCollector, Continuation continuation) {
                Object objCollect = flowDistinctUntilChanged.collect(new C266422(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamMarketHalt$$inlined$map$2$2 */
            public static final class C266422<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamMarketHalt$$inlined$map$2$2", m3645f = "InvestingBadgeStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamMarketHalt$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266422.this.emit(null, this);
                    }
                }

                public C266422(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object obj2;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj3 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj3);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (((Boolean) obj).booleanValue()) {
                            obj2 = InvestingBadge.MarketHalt.INSTANCE;
                        } else {
                            obj2 = InvestingBadge.None.INSTANCE;
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj3);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    public final Flow<InvestingBadge> streamHasBreakingNews(UUID assetId, ApiAssetType assetType, String accountNumber) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        if (assetType == null) {
            return FlowKt.flowOf(InvestingBadge.None.INSTANCE);
        }
        final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.breakingNewsStore.streamBreakingNewsOrNull(assetId, assetType, accountNumber));
        return new Flow<InvestingBadge>() { // from class: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamHasBreakingNews$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super InvestingBadge> flowCollector, Continuation continuation) {
                Object objCollect = flowDistinctUntilChanged.collect(new C266362(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamHasBreakingNews$$inlined$map$1$2 */
            public static final class C266362<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamHasBreakingNews$$inlined$map$1$2", m3645f = "InvestingBadgeStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamHasBreakingNews$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266362.this.emit(null, this);
                    }
                }

                public C266362(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object obj2;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj3 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj3);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (((BreakingNews) obj) == null) {
                            obj2 = InvestingBadge.None.INSTANCE;
                        } else {
                            obj2 = InvestingBadge.BreakingNews.INSTANCE;
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj3);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    public final Flow<InvestingBadge> streamIsTopMover(UUID assetId, InstrumentType instrumentType, final BigDecimal threshold) {
        final Flow flow;
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        InstrumentType instrumentType2 = InstrumentType.EQUITY;
        if (instrumentType != instrumentType2 && instrumentType != InstrumentType.CRYPTO) {
            return FlowKt.flowOf(InvestingBadge.None.INSTANCE);
        }
        if (instrumentType == instrumentType2) {
            final Flow<Quote> flowStreamQuote = this.equityQuoteStore.streamQuote(assetId);
            flow = new Flow<Optional<? extends AssetQuote.Equity>>() { // from class: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamIsTopMover$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Optional<? extends AssetQuote.Equity>> flowCollector, Continuation continuation) {
                    Object objCollect = flowStreamQuote.collect(new C266372(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamIsTopMover$$inlined$map$1$2 */
                public static final class C266372<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamIsTopMover$$inlined$map$1$2", m3645f = "InvestingBadgeStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamIsTopMover$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C266372.this.emit(null, this);
                        }
                    }

                    public C266372(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    /* JADX WARN: Type inference failed for: r5v0, types: [com.robinhood.android.redesign.model.AssetQuote$Equity] */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Quote quote = (Quote) obj;
                            Optional<T> optionalM2972of = Optional.INSTANCE.m2972of(quote != null ? new AssetQuote.Equity(quote, null, 2, null) : null);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(optionalM2972of, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
        } else {
            final Flow<CryptoQuote> flowAsFlow = this.cryptoQuoteStore.getStreamCryptoQuote().asFlow(new CryptoQuoteStore.CryptoQuoteArgs(assetId, null, null, 6, null));
            flow = new Flow<Optional<? extends AssetQuote.Crypto>>() { // from class: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamIsTopMover$$inlined$map$2
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Optional<? extends AssetQuote.Crypto>> flowCollector, Continuation continuation) {
                    Object objCollect = flowAsFlow.collect(new C266382(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamIsTopMover$$inlined$map$2$2 */
                public static final class C266382<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamIsTopMover$$inlined$map$2$2", m3645f = "InvestingBadgeStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamIsTopMover$$inlined$map$2$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C266382.this.emit(null, this);
                        }
                    }

                    public C266382(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Optional<T> optionalM2972of = Optional.INSTANCE.m2972of(new AssetQuote.Crypto((CryptoQuote) obj, null, null, 6, null));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(optionalM2972of, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
        }
        final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<BigDecimal>() { // from class: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamIsTopMover$$inlined$map$3
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super BigDecimal> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C266392(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamIsTopMover$$inlined$map$3$2 */
            public static final class C266392<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamIsTopMover$$inlined$map$3$2", m3645f = "InvestingBadgeStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamIsTopMover$$inlined$map$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266392.this.emit(null, this);
                    }
                }

                public C266392(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        AssetQuote assetQuote = (AssetQuote) ((Optional) obj).getOrNull();
                        BigDecimal percentChange = assetQuote != null ? assetQuote.getPercentChange() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(percentChange, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
        return new Flow<InvestingBadge>() { // from class: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamIsTopMover$$inlined$map$4
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super InvestingBadge> flowCollector, Continuation continuation) {
                Object objCollect = flowDistinctUntilChanged.collect(new C266402(flowCollector, threshold), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamIsTopMover$$inlined$map$4$2 */
            public static final class C266402<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ BigDecimal $threshold$inlined;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamIsTopMover$$inlined$map$4$2", m3645f = "InvestingBadgeStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamIsTopMover$$inlined$map$4$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266402.this.emit(null, this);
                    }
                }

                public C266402(FlowCollector flowCollector, BigDecimal bigDecimal) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$threshold$inlined = bigDecimal;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object obj2;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj3 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj3);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        BigDecimal bigDecimal = (BigDecimal) obj;
                        if (bigDecimal == null) {
                            obj2 = InvestingBadge.None.INSTANCE;
                        } else {
                            boolean z = bigDecimal.compareTo(this.$threshold$inlined) > 0;
                            BigDecimal bigDecimalNegate = this.$threshold$inlined.negate();
                            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
                            boolean z2 = bigDecimal.compareTo(bigDecimalNegate) < 0;
                            if (z) {
                                obj2 = InvestingBadge.TopMoverUp.INSTANCE;
                            } else if (z2) {
                                obj2 = InvestingBadge.TopMoverDown.INSTANCE;
                            } else {
                                obj2 = InvestingBadge.None.INSTANCE;
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj3);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    public final Flow<InvestingBadge> streamEarnings$lib_store_badges_externalDebug(final UUID assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        final Flow<UiEarnings> flowStreamEarnings = this.earningsStore.streamEarnings(assetId);
        final Flow<List<? extends Earning>> flow = new Flow<List<? extends Earning>>() { // from class: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamEarnings$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends Earning>> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamEarnings.collect(new C266332(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamEarnings$$inlined$map$1$2 */
            public static final class C266332<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamEarnings$$inlined$map$1$2", m3645f = "InvestingBadgeStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamEarnings$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266332.this.emit(null, this);
                    }
                }

                public C266332(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        List<Earning> earnings = ((UiEarnings) obj).getEarnings();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(earnings, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
        return FlowKt.distinctUntilChanged(new Flow<InvestingBadge>() { // from class: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamEarnings$$inlined$map$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super InvestingBadge> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C266342(flowCollector, this, assetId), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamEarnings$$inlined$map$2$2 */
            public static final class C266342<T> implements FlowCollector {
                final /* synthetic */ UUID $assetId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ InvestingBadgeStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamEarnings$$inlined$map$2$2", m3645f = "InvestingBadgeStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamEarnings$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266342.this.emit(null, this);
                    }
                }

                public C266342(FlowCollector flowCollector, InvestingBadgeStore investingBadgeStore, UUID uuid) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = investingBadgeStore;
                    this.$assetId$inlined = uuid;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object obj2;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj3 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj3);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Instant instant = this.this$0.clock.instant();
                        Iterator<T> it = CollectionsKt.sortedWith((List) obj, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0050: INVOKE (r13v5 'it' java.util.Iterator<T>) = 
                              (wrap:java.util.List:0x004a: INVOKE 
                              (wrap:java.util.List:0x0037: CHECK_CAST (java.util.List) (r13v0 'obj' java.lang.Object))
                              (wrap:java.util.Comparator:0x0047: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:1068) call: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamEarnings$lambda$13$$inlined$sortedByDescending$1.<init>():void type: CONSTRUCTOR)
                             STATIC call: kotlin.collections.CollectionsKt.sortedWith(java.lang.Iterable, java.util.Comparator):java.util.List A[MD:<T>:(java.lang.Iterable<? extends T>, java.util.Comparator<? super T>):java.util.List<T> (m), WRAPPED] (LINE:1068))
                             INTERFACE call: java.lang.Iterable.iterator():java.util.Iterator A[DECLARE_VAR, MD:():java.util.Iterator<T> (c)] (LINE:57) in method: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamEarnings$$inlined$map$2.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes5.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamEarnings$lambda$13$$inlined$sortedByDescending$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:97)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:878)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 21 more
                            */
                        /*
                            Method dump skipped, instructions count: 441
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamEarnings$$inlined$map$2.C266342.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }
            });
        }

        public final Flow<InvestingBadge> streamVolatility$lib_store_badges_externalDebug(UUID assetId, InstrumentType instrumentType, RedesignSettings settings) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (instrumentType != InstrumentType.EQUITY) {
                return FlowKt.flowOf(InvestingBadge.None.INSTANCE);
            }
            final BigDecimal bigDecimalValueOf = BigDecimal.valueOf(settings.getHighlightSettings().getRiskScoreThreshold());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.fundamentalRiskStore.streamFundamentalRisks(CollectionsKt.listOf(assetId)));
            return new Flow<InvestingBadge>() { // from class: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamVolatility$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super InvestingBadge> flowCollector, Continuation continuation) {
                    Object objCollect = flowDistinctUntilChanged.collect(new C266482(flowCollector, bigDecimalValueOf), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamVolatility$$inlined$map$1$2 */
                public static final class C266482<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ BigDecimal $threshold$inlined;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamVolatility$$inlined$map$1$2", m3645f = "InvestingBadgeStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamVolatility$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C266482.this.emit(null, this);
                        }
                    }

                    public C266482(FlowCollector flowCollector, BigDecimal bigDecimal) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$threshold$inlined = bigDecimal;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        BigDecimal bigDecimal;
                        Object obj2;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj3 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj3);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            FundamentalRisk fundamentalRisk = (FundamentalRisk) CollectionsKt.firstOrNull((List) obj);
                            if (fundamentalRisk == null || (bigDecimal = fundamentalRisk.getVolatilityScore()) == null) {
                                bigDecimal = new BigDecimal(0);
                            }
                            if (bigDecimal.compareTo(this.$threshold$inlined) > 0) {
                                obj2 = InvestingBadge.IncreasedVolatility.INSTANCE;
                            } else {
                                obj2 = InvestingBadge.None.INSTANCE;
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj3);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
        }

        public final Flow<InvestingBadge> stream52WeekHighLow(UUID assetId, InstrumentType instrumentType) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            if (instrumentType != InstrumentType.EQUITY && instrumentType != InstrumentType.CRYPTO) {
                return FlowKt.flowOf(InvestingBadge.None.INSTANCE);
            }
            final Flow flowAsFlow = FundamentalStore.streamFundamental$default(this.fundamentalStore, null, 1, null).asFlow(assetId);
            return FlowKt.distinctUntilChanged(new Flow<InvestingBadge>() { // from class: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$stream52WeekHighLow$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super InvestingBadge> flowCollector, Continuation continuation) {
                    Object objCollect = flowAsFlow.collect(new C266322(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$stream52WeekHighLow$$inlined$map$1$2 */
                public static final class C266322<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$stream52WeekHighLow$$inlined$map$1$2", m3645f = "InvestingBadgeStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$stream52WeekHighLow$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C266322.this.emit(null, this);
                        }
                    }

                    public C266322(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        BigDecimal high52Weeks;
                        BigDecimal low;
                        BigDecimal low52Weeks;
                        Object obj2;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj3 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj3);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Fundamental fundamental = (Fundamental) obj;
                            BigDecimal high = fundamental.getHigh();
                            if (high == null || (high52Weeks = fundamental.getHigh52Weeks()) == null || (low = fundamental.getLow()) == null || (low52Weeks = fundamental.getLow52Weeks()) == null) {
                                obj2 = InvestingBadge.None.INSTANCE;
                            } else if (high.compareTo(high52Weeks) >= 0) {
                                obj2 = InvestingBadge.FiftyTwoWeekHigh.INSTANCE;
                            } else {
                                obj2 = low.compareTo(low52Weeks) <= 0 ? InvestingBadge.FiftyTwoWeekLow.INSTANCE : InvestingBadge.None.INSTANCE;
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj3);
                        }
                        return Unit.INSTANCE;
                    }
                }
            });
        }

        public final Flow<InvestingBadge> streamPendingOrders$lib_store_badges_externalDebug(UUID assetId, InstrumentType instrumentType, String accountNumber) {
            Intrinsics.checkNotNullParameter(assetId, "assetId");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            if (instrumentType != InstrumentType.EQUITY) {
                return FlowKt.flowOf(InvestingBadge.None.INSTANCE);
            }
            HistoryStaticFilter historyStaticFilter = new HistoryStaticFilter(new HistoryStaticFilter.InstrumentFilter(assetId, HistoryStaticFilter.InstrumentFilterType.EQUITY), new HistoryStaticFilter.RhsAccountContext(accountNumber, BrokerageAccountType.INDIVIDUAL), null, null, null, null, null, null, Boolean.TRUE, null, 764, null);
            Set of = SetsKt.setOf(HistoryTransactionType.EQUITY_ORDER);
            HistoryStore historyStore = this.historyStore;
            Observable observableJust = Observable.just(Optional.INSTANCE.m2972of(HistoryEvent.State.PENDING));
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            Observable observableJust2 = Observable.just(of);
            Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
            Observable observableJust3 = Observable.just(Instant.EPOCH);
            Intrinsics.checkNotNullExpressionValue(observableJust3, "just(...)");
            Observable observableDistinctUntilChanged = HistoryStore.stream$default(historyStore, observableJust, observableJust2, observableJust3, null, historyStaticFilter, 1, 8, null).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
            final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableDistinctUntilChanged), Integer.MAX_VALUE, null, 2, null);
            return new Flow<InvestingBadge>() { // from class: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamPendingOrders$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super InvestingBadge> flowCollector, Continuation continuation) {
                    Object objCollect = flowBuffer$default.collect(new C266432(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamPendingOrders$$inlined$map$1$2 */
                public static final class C266432<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamPendingOrders$$inlined$map$1$2", m3645f = "InvestingBadgeStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamPendingOrders$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C266432.this.emit(null, this);
                        }
                    }

                    public C266432(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        Object obj2;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj3 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj3);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            if (((PagedList) obj).size() == 0) {
                                obj2 = InvestingBadge.None.INSTANCE;
                            } else {
                                obj2 = InvestingBadge.PendingOrder.INSTANCE;
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj3);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
        }
    }
