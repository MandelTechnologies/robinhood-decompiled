package com.robinhood.android.pricealerts.libpricealertsbanner;

import androidx.lifecycle.ViewModel2;
import com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore;
import com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerViewState;
import com.robinhood.android.redesign.dao.HighlightImpressionDao;
import com.robinhood.android.redesign.model.HighlightImpression;
import com.robinhood.android.redesigninvesting.experiments.RedesignInvestingExperimentStore;
import com.robinhood.android.redesigninvesting.store.volatility.FundamentalRiskStore;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore;
import com.robinhood.models.advanced.alert.p302db.AdvancedAlert;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingItem;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: PriceAlertsBannerDuxo.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0083@¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J(\u0010)\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u001cH\u0081@¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00100¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerViewState;", "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;", "advancedAlertStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "equityQuoteStore", "Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;", "badgeExperimentStore", "Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;", "breakingNewsStore", "Lcom/robinhood/android/redesign/dao/HighlightImpressionDao;", "highlightImpressionDao", "Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore;", "fundamentalRiskStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;Lcom/robinhood/android/redesign/dao/HighlightImpressionDao;Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;)V", "Lcom/robinhood/models/db/Instrument;", "instrument", "Lkotlinx/coroutines/flow/Flow;", "checkForValidPriceAlert", "(Lcom/robinhood/models/db/Instrument;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem$PriceBelow;", "priceAlert", "Lcom/robinhood/models/db/Quote;", "quote", "", "isValidPriceBelowAlert", "(Lj$/time/Clock;Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem$PriceBelow;Lcom/robinhood/models/db/Quote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "accountNumber", "Lkotlinx/coroutines/Job;", "initPriceAlertsStream", "(Lcom/robinhood/models/db/Instrument;Ljava/lang/String;)Lkotlinx/coroutines/Job;", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem$PriceAbove;", "isValidPriceAboveAlert$lib_price_alerts_banner_externalDebug", "(Lj$/time/Clock;Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem$PriceAbove;Lcom/robinhood/models/db/Quote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isValidPriceAboveAlert", "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/android/redesigninvesting/experiments/RedesignInvestingExperimentStore;", "Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;", "Lcom/robinhood/android/redesign/dao/HighlightImpressionDao;", "Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore;", "Lj$/time/Clock;", "lib-price-alerts-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PriceAlertsBannerDuxo extends BaseDuxo4<PriceAlertsBannerViewState> {
    public static final int $stable = 8;
    private final AdvancedAlertStore advancedAlertStore;
    private final RedesignInvestingExperimentStore badgeExperimentStore;
    private final BreakingNewsStore breakingNewsStore;
    private final Clock clock;
    private final QuoteStore equityQuoteStore;
    private final FundamentalRiskStore fundamentalRiskStore;
    private final HighlightImpressionDao highlightImpressionDao;

    /* compiled from: PriceAlertsBannerDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerDuxo", m3645f = "PriceAlertsBannerDuxo.kt", m3646l = {155}, m3647m = "isValidPriceBelowAlert")
    /* renamed from: com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerDuxo$isValidPriceBelowAlert$1 */
    static final class C258631 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C258631(Continuation<? super C258631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PriceAlertsBannerDuxo.this.isValidPriceBelowAlert(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceAlertsBannerDuxo(AdvancedAlertStore advancedAlertStore, QuoteStore equityQuoteStore, RedesignInvestingExperimentStore badgeExperimentStore, BreakingNewsStore breakingNewsStore, HighlightImpressionDao highlightImpressionDao, FundamentalRiskStore fundamentalRiskStore, Clock clock, DuxoBundle duxoBundle) {
        super(PriceAlertsBannerViewState.None.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(advancedAlertStore, "advancedAlertStore");
        Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
        Intrinsics.checkNotNullParameter(badgeExperimentStore, "badgeExperimentStore");
        Intrinsics.checkNotNullParameter(breakingNewsStore, "breakingNewsStore");
        Intrinsics.checkNotNullParameter(highlightImpressionDao, "highlightImpressionDao");
        Intrinsics.checkNotNullParameter(fundamentalRiskStore, "fundamentalRiskStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.advancedAlertStore = advancedAlertStore;
        this.equityQuoteStore = equityQuoteStore;
        this.badgeExperimentStore = badgeExperimentStore;
        this.breakingNewsStore = breakingNewsStore;
        this.highlightImpressionDao = highlightImpressionDao;
        this.fundamentalRiskStore = fundamentalRiskStore;
        this.clock = clock;
    }

    public final Job initPriceAlertsStream(Instrument instrument, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(6);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        CompletableJob completableJobSupervisorJob$default = Supervisor3.SupervisorJob$default(null, 1, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), completableJobSupervisorJob$default, null, new C258621(instrument, accountNumber, bigDecimalValueOf, null), 2, null);
        return completableJobSupervisorJob$default;
    }

    /* compiled from: PriceAlertsBannerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerDuxo$initPriceAlertsStream$1", m3645f = "PriceAlertsBannerDuxo.kt", m3646l = {86}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerDuxo$initPriceAlertsStream$1 */
    static final class C258621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ Instrument $instrument;
        final /* synthetic */ BigDecimal $threshold;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C258621(Instrument instrument, String str, BigDecimal bigDecimal, Continuation<? super C258621> continuation) {
            super(2, continuation);
            this.$instrument = instrument;
            this.$accountNumber = str;
            this.$threshold = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PriceAlertsBannerDuxo.this.new C258621(this.$instrument, this.$accountNumber, this.$threshold, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C258621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(PriceAlertsBannerDuxo.this.badgeExperimentStore.isInvestingBadgeEnabled()), new C25859x21d9c551(null, PriceAlertsBannerDuxo.this, this.$instrument, this.$accountNumber, this.$threshold));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(PriceAlertsBannerDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: PriceAlertsBannerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerDuxo$initPriceAlertsStream$1$2", m3645f = "PriceAlertsBannerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerDuxo$initPriceAlertsStream$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PriceAlertsBannerViewState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PriceAlertsBannerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PriceAlertsBannerDuxo priceAlertsBannerDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = priceAlertsBannerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PriceAlertsBannerViewState priceAlertsBannerViewState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(priceAlertsBannerViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PriceAlertsBannerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerDuxo$initPriceAlertsStream$1$2$1", m3645f = "PriceAlertsBannerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerDuxo$initPriceAlertsStream$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PriceAlertsBannerViewState, Continuation<? super PriceAlertsBannerViewState>, Object> {
                final /* synthetic */ PriceAlertsBannerViewState $it;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PriceAlertsBannerViewState priceAlertsBannerViewState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = priceAlertsBannerViewState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$it, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PriceAlertsBannerViewState priceAlertsBannerViewState, Continuation<? super PriceAlertsBannerViewState> continuation) {
                    return ((AnonymousClass1) create(priceAlertsBannerViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return this.$it;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((PriceAlertsBannerViewState) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<PriceAlertsBannerViewState> checkForValidPriceAlert(Instrument instrument) {
        return FlowKt.combine(Context7.buffer$default(RxConvert.asFlow(this.advancedAlertStore.streamAdvancedAlert(instrument.getId())), Integer.MAX_VALUE, null, 2, null), FlowKt.filterNotNull(this.equityQuoteStore.streamQuote(instrument.getId())), new C258611(instrument, null));
    }

    /* compiled from: PriceAlertsBannerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pricealerts/libpricealertsbanner/PriceAlertsBannerViewState;", "alert", "Lcom/robinhood/models/advanced/alert/db/AdvancedAlert;", "quote", "Lcom/robinhood/models/db/Quote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerDuxo$checkForValidPriceAlert$1", m3645f = "PriceAlertsBannerDuxo.kt", m3646l = {104, 108}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerDuxo$checkForValidPriceAlert$1 */
    static final class C258611 extends ContinuationImpl7 implements Function3<AdvancedAlert, Quote, Continuation<? super PriceAlertsBannerViewState>, Object> {
        final /* synthetic */ Instrument $instrument;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C258611(Instrument instrument, Continuation<? super C258611> continuation) {
            super(3, continuation);
            this.$instrument = instrument;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(AdvancedAlert advancedAlert, Quote quote, Continuation<? super PriceAlertsBannerViewState> continuation) {
            C258611 c258611 = PriceAlertsBannerDuxo.this.new C258611(this.$instrument, continuation);
            c258611.L$0 = advancedAlert;
            c258611.L$1 = quote;
            return c258611.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00d2, code lost:
        
            if (r10 == r0) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d2 -> B:30:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00dc -> B:32:0x00dd). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Collection arrayList;
            Iterator it;
            PriceAlertsBannerDuxo priceAlertsBannerDuxo;
            final Quote quote;
            Object next;
            boolean zBooleanValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AdvancedAlert advancedAlert = (AdvancedAlert) this.L$0;
                Quote quote2 = (Quote) this.L$1;
                List listFilterNotNull = CollectionsKt.filterNotNull(advancedAlert.getSettings());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listFilterNotNull) {
                    if (((AlertHubSettingItem) obj2).getEnabled()) {
                        arrayList2.add(obj2);
                    }
                }
                PriceAlertsBannerDuxo priceAlertsBannerDuxo2 = PriceAlertsBannerDuxo.this;
                arrayList = new ArrayList();
                it = arrayList2.iterator();
                priceAlertsBannerDuxo = priceAlertsBannerDuxo2;
                quote = quote2;
                if (!it.hasNext()) {
                }
            } else if (i == 1) {
                next = this.L$4;
                it = (Iterator) this.L$3;
                arrayList = (Collection) this.L$2;
                priceAlertsBannerDuxo = (PriceAlertsBannerDuxo) this.L$1;
                quote = (Quote) this.L$0;
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                }
                if (!it.hasNext()) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                next = this.L$4;
                it = (Iterator) this.L$3;
                arrayList = (Collection) this.L$2;
                priceAlertsBannerDuxo = (PriceAlertsBannerDuxo) this.L$1;
                quote = (Quote) this.L$0;
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    arrayList.add(next);
                }
                if (!it.hasNext()) {
                    next = it.next();
                    AlertHubSettingItem alertHubSettingItem = (AlertHubSettingItem) next;
                    if (alertHubSettingItem instanceof AlertHubSettingItem.PriceAbove) {
                        this.L$0 = quote;
                        this.L$1 = priceAlertsBannerDuxo;
                        this.L$2 = arrayList;
                        this.L$3 = it;
                        this.L$4 = next;
                        this.label = 1;
                        Object objIsValidPriceAboveAlert$lib_price_alerts_banner_externalDebug = priceAlertsBannerDuxo.isValidPriceAboveAlert$lib_price_alerts_banner_externalDebug(priceAlertsBannerDuxo.clock, (AlertHubSettingItem.PriceAbove) alertHubSettingItem, quote, this);
                        if (objIsValidPriceAboveAlert$lib_price_alerts_banner_externalDebug != coroutine_suspended) {
                            zBooleanValue = ((Boolean) objIsValidPriceAboveAlert$lib_price_alerts_banner_externalDebug).booleanValue();
                            if (zBooleanValue) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (alertHubSettingItem instanceof AlertHubSettingItem.PriceBelow) {
                        this.L$0 = quote;
                        this.L$1 = priceAlertsBannerDuxo;
                        this.L$2 = arrayList;
                        this.L$3 = it;
                        this.L$4 = next;
                        this.label = 2;
                        obj = priceAlertsBannerDuxo.isValidPriceBelowAlert(priceAlertsBannerDuxo.clock, (AlertHubSettingItem.PriceBelow) alertHubSettingItem, quote, this);
                    } else {
                        zBooleanValue = false;
                        if (zBooleanValue) {
                        }
                    }
                    if (!it.hasNext()) {
                        AlertHubSettingItem alertHubSettingItem2 = (AlertHubSettingItem) CollectionsKt.firstOrNull(CollectionsKt.sortedWith((List) arrayList, new Comparator() { // from class: com.robinhood.android.pricealerts.libpricealertsbanner.PriceAlertsBannerDuxo$checkForValidPriceAlert$1$invokeSuspend$$inlined$sortedBy$1
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                Money money$default;
                                Money money$default2;
                                BigDecimal price = ((AlertHubSettingItem) t).getPrice();
                                if (price == null || (money$default = Money3.toMoney$default(price, null, 1, null)) == null) {
                                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                                    money$default = Money3.toMoney$default(bigDecimalValueOf, null, 1, null);
                                }
                                Money moneyAbs = money$default.minus(quote.getLastTradePrice()).abs();
                                BigDecimal price2 = ((AlertHubSettingItem) t2).getPrice();
                                if (price2 == null || (money$default2 = Money3.toMoney$default(price2, null, 1, null)) == null) {
                                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(0L);
                                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                                    money$default2 = Money3.toMoney$default(bigDecimalValueOf2, null, 1, null);
                                }
                                return ComparisonsKt.compareValues(moneyAbs, money$default2.minus(quote.getLastTradePrice()).abs());
                            }
                        }));
                        return alertHubSettingItem2 != null ? new PriceAlertsBannerViewState.PriceAlert(this.$instrument.getSymbol(), alertHubSettingItem2) : PriceAlertsBannerViewState.None.INSTANCE;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isValidPriceAboveAlert$lib_price_alerts_banner_externalDebug(Clock clock, AlertHubSettingItem.PriceAbove priceAbove, Quote quote, Continuation<? super Boolean> continuation) {
        PriceAlertsBannerDuxo3 priceAlertsBannerDuxo3;
        Money money$default;
        Instant instant;
        Money money;
        boolean zNotSeenWithin;
        if (continuation instanceof PriceAlertsBannerDuxo3) {
            priceAlertsBannerDuxo3 = (PriceAlertsBannerDuxo3) continuation;
            int i = priceAlertsBannerDuxo3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                priceAlertsBannerDuxo3.label = i - Integer.MIN_VALUE;
            } else {
                priceAlertsBannerDuxo3 = new PriceAlertsBannerDuxo3(this, continuation);
            }
        }
        Object obj = priceAlertsBannerDuxo3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = priceAlertsBannerDuxo3.label;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Instant instant2 = clock.instant();
            BigDecimal price = priceAbove.getPrice();
            if (price == null || (money$default = Money3.toMoney$default(price, null, 1, null)) == null) {
                return boxing.boxBoolean(false);
            }
            String id = priceAbove.getId();
            if (id == null) {
                return boxing.boxBoolean(false);
            }
            HighlightImpressionDao highlightImpressionDao = this.highlightImpressionDao;
            priceAlertsBannerDuxo3.L$0 = quote;
            priceAlertsBannerDuxo3.L$1 = instant2;
            priceAlertsBannerDuxo3.L$2 = money$default;
            priceAlertsBannerDuxo3.label = 1;
            Object badgeImpression = highlightImpressionDao.getBadgeImpression(id, priceAlertsBannerDuxo3);
            if (badgeImpression == coroutine_suspended) {
                return coroutine_suspended;
            }
            instant = instant2;
            money = money$default;
            obj = badgeImpression;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            money = (Money) priceAlertsBannerDuxo3.L$2;
            instant = (Instant) priceAlertsBannerDuxo3.L$1;
            quote = (Quote) priceAlertsBannerDuxo3.L$0;
            ResultKt.throwOnFailure(obj);
        }
        HighlightImpression highlightImpression = (HighlightImpression) obj;
        boolean z2 = quote.getPreviousClose().compareTo(money) < 0;
        boolean z3 = money.compareTo(quote.getLastTradePrice()) < 0;
        if (highlightImpression != null) {
            Intrinsics.checkNotNull(instant);
            Duration durationOfHours = Duration.ofHours(3L);
            Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
            zNotSeenWithin = highlightImpression.notSeenWithin(instant, durationOfHours);
        } else {
            zNotSeenWithin = true;
        }
        if (z3 && z2 && zNotSeenWithin) {
            z = true;
        }
        return boxing.boxBoolean(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isValidPriceBelowAlert(Clock clock, AlertHubSettingItem.PriceBelow priceBelow, Quote quote, Continuation<? super Boolean> continuation) {
        C258631 c258631;
        Money money$default;
        Instant instant;
        Money money;
        boolean zNotSeenWithin;
        if (continuation instanceof C258631) {
            c258631 = (C258631) continuation;
            int i = c258631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c258631.label = i - Integer.MIN_VALUE;
            } else {
                c258631 = new C258631(continuation);
            }
        }
        Object obj = c258631.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c258631.label;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Instant instant2 = clock.instant();
            BigDecimal price = priceBelow.getPrice();
            if (price == null || (money$default = Money3.toMoney$default(price, null, 1, null)) == null) {
                return boxing.boxBoolean(false);
            }
            String id = priceBelow.getId();
            if (id == null) {
                return boxing.boxBoolean(false);
            }
            HighlightImpressionDao highlightImpressionDao = this.highlightImpressionDao;
            c258631.L$0 = quote;
            c258631.L$1 = instant2;
            c258631.L$2 = money$default;
            c258631.label = 1;
            Object badgeImpression = highlightImpressionDao.getBadgeImpression(id, c258631);
            if (badgeImpression == coroutine_suspended) {
                return coroutine_suspended;
            }
            instant = instant2;
            money = money$default;
            obj = badgeImpression;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            money = (Money) c258631.L$2;
            instant = (Instant) c258631.L$1;
            quote = (Quote) c258631.L$0;
            ResultKt.throwOnFailure(obj);
        }
        HighlightImpression highlightImpression = (HighlightImpression) obj;
        boolean z2 = money.compareTo(quote.getPreviousClose()) < 0;
        boolean z3 = quote.getLastTradePrice().compareTo(money) < 0;
        if (highlightImpression != null) {
            Intrinsics.checkNotNull(instant);
            Duration durationOfHours = Duration.ofHours(3L);
            Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
            zNotSeenWithin = highlightImpression.notSeenWithin(instant, durationOfHours);
        } else {
            zNotSeenWithin = true;
        }
        if (z3 && z2 && zNotSeenWithin) {
            z = true;
        }
        return boxing.boxBoolean(z);
    }
}
