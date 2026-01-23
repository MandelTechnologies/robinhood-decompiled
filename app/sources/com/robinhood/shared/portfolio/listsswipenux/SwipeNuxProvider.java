package com.robinhood.shared.portfolio.listsswipenux;

import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: SwipeNuxProvider.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0016*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u0018J\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u0016¢\u0006\u0004\b$\u0010\u0018J\r\u0010%\u001a\u00020 ¢\u0006\u0004\b%\u0010\"J\r\u0010&\u001a\u00020 ¢\u0006\u0004\b&\u0010\"J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00162\b\u0010'\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010.R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00104¨\u00065"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxProvider;", "", "Lcom/robinhood/shared/portfolio/listsswipenux/SwipeContext;", "context", "Lcom/robinhood/prefs/StringPreference;", "peekLastShownPref", "Lcom/robinhood/prefs/IntPreference;", "peekCountPref", "lastSwipePref", "tooltipLastShownPref", "Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxGateProvider;", "swipeNuxGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/shared/store/history/HistoryStore;", "historyStore", "j$/time/Clock", Card.Icon.CLOCK, "", "enableTooltips", "<init>", "(Lcom/robinhood/shared/portfolio/listsswipenux/SwipeContext;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxGateProvider;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/store/history/HistoryStore;Lj$/time/Clock;Z)V", "Lkotlinx/coroutines/flow/Flow;", "validateShowPeek", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/utils/Optional;", "", "j$/time/Instant", "mapToInstant", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "showTooltip", "showPeek", "", "onPeekShown", "()V", "Lcom/robinhood/utils/resource/StringResource;", "tooltip", "onTooltipShown", "onSwipe", "peekLastShown", "", "streamEquityTradesSinceLastPeek", "(Lj$/time/Instant;)Lkotlinx/coroutines/flow/Flow;", "getContext", "()Lcom/robinhood/shared/portfolio/listsswipenux/SwipeContext;", "Lcom/robinhood/shared/portfolio/listsswipenux/SwipeContext;", "Lcom/robinhood/prefs/StringPreference;", "Lcom/robinhood/prefs/IntPreference;", "Lcom/robinhood/shared/portfolio/listsswipenux/SwipeNuxGateProvider;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "Lcom/robinhood/shared/store/history/HistoryStore;", "Lj$/time/Clock;", "Z", "lib-lists-swipe-nux_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class SwipeNuxProvider {
    private final Clock clock;
    private final SwipeContext context;
    private final boolean enableTooltips;
    private final HistoryStore historyStore;
    private final StringPreference lastSwipePref;
    private final IntPreference peekCountPref;
    private final StringPreference peekLastShownPref;
    private final RegionGateProvider regionGateProvider;
    private final SwipeNuxGateProvider swipeNuxGateProvider;
    private final StringPreference tooltipLastShownPref;

    public SwipeNuxProvider(SwipeContext context, StringPreference peekLastShownPref, IntPreference peekCountPref, StringPreference lastSwipePref, StringPreference tooltipLastShownPref, SwipeNuxGateProvider swipeNuxGateProvider, RegionGateProvider regionGateProvider, HistoryStore historyStore, Clock clock, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(peekLastShownPref, "peekLastShownPref");
        Intrinsics.checkNotNullParameter(peekCountPref, "peekCountPref");
        Intrinsics.checkNotNullParameter(lastSwipePref, "lastSwipePref");
        Intrinsics.checkNotNullParameter(tooltipLastShownPref, "tooltipLastShownPref");
        Intrinsics.checkNotNullParameter(swipeNuxGateProvider, "swipeNuxGateProvider");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.context = context;
        this.peekLastShownPref = peekLastShownPref;
        this.peekCountPref = peekCountPref;
        this.lastSwipePref = lastSwipePref;
        this.tooltipLastShownPref = tooltipLastShownPref;
        this.swipeNuxGateProvider = swipeNuxGateProvider;
        this.regionGateProvider = regionGateProvider;
        this.historyStore = historyStore;
        this.clock = clock;
        this.enableTooltips = z;
    }

    public /* synthetic */ SwipeNuxProvider(SwipeContext swipeContext, StringPreference stringPreference, IntPreference intPreference, StringPreference stringPreference2, StringPreference stringPreference3, SwipeNuxGateProvider swipeNuxGateProvider, RegionGateProvider regionGateProvider, HistoryStore historyStore, Clock clock, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(swipeContext, stringPreference, intPreference, stringPreference2, stringPreference3, swipeNuxGateProvider, regionGateProvider, historyStore, clock, (i & 512) != 0 ? true : z);
    }

    public final Flow<Boolean> showPeek() {
        return Operators.connectWhen(validateShowPeek(), this.swipeNuxGateProvider.isSwipeNuxEnabled(), FlowKt.flowOf(Boolean.FALSE));
    }

    private final Flow<Boolean> validateShowPeek() {
        Flow<Instant> flowMapToInstant = mapToInstant(Context7.buffer$default(RxConvert.asFlow(this.peekLastShownPref.changes()), Integer.MAX_VALUE, null, 2, null));
        return FlowKt.combine(Context7.buffer$default(RxConvert.asFlow(this.peekCountPref.getChanges()), Integer.MAX_VALUE, null, 2, null), flowMapToInstant, mapToInstant(Context7.buffer$default(RxConvert.asFlow(this.lastSwipePref.changes()), Integer.MAX_VALUE, null, 2, null)), FlowKt.transformLatest(flowMapToInstant, new SwipeNuxProvider$validateShowPeek$$inlined$flatMapLatest$1(null, this)), new C394861(null));
    }

    /* compiled from: SwipeNuxProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m3636d2 = {"", "peekCount", "j$/time/Instant", "peekLastShown", "lastSwipe", "tradesSinceLastPeek", "", "<anonymous>", "(ILj$/time/Instant;Lj$/time/Instant;I)Z"}, m3637k = 3, m3638mv = {2, 1, 0})
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.listsswipenux.SwipeNuxProvider$validateShowPeek$1", m3645f = "SwipeNuxProvider.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.listsswipenux.SwipeNuxProvider$validateShowPeek$1 */
    static final class C394861 extends ContinuationImpl7 implements Function5<Integer, Instant, Instant, Integer, Continuation<? super Boolean>, Object> {
        /* synthetic */ int I$0;
        /* synthetic */ int I$1;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C394861(Continuation<? super C394861> continuation) {
            super(5, continuation);
        }

        public final Object invoke(int i, Instant instant, Instant instant2, int i2, Continuation<? super Boolean> continuation) {
            C394861 c394861 = SwipeNuxProvider.this.new C394861(continuation);
            c394861.I$0 = i;
            c394861.L$0 = instant;
            c394861.L$1 = instant2;
            c394861.I$1 = i2;
            return c394861.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Instant instant, Instant instant2, Integer num2, Continuation<? super Boolean> continuation) {
            return invoke(num.intValue(), instant, instant2, num2.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                int i = this.I$0;
                Instant instant = (Instant) this.L$0;
                Instant instant2 = (Instant) this.L$1;
                int i2 = this.I$1;
                Instant instantMinus = Instant.now(SwipeNuxProvider.this.clock).minus((TemporalAmount) Duration.ofDays(60L));
                Intrinsics.checkNotNullExpressionValue(instantMinus, "minus(...)");
                boolean z = false;
                boolean z2 = i < 3;
                boolean z3 = instant == null;
                boolean z4 = instant != null && instant.isBefore(instantMinus) && (instant2 == null || instant2.isBefore(instantMinus));
                boolean z5 = i2 >= 5;
                if (z2 && (z3 || z4 || z5)) {
                    z = true;
                }
                return boxing.boxBoolean(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final Flow<Instant> mapToInstant(final Flow<? extends Optional<String>> flow) {
        return new Flow<Instant>() { // from class: com.robinhood.shared.portfolio.listsswipenux.SwipeNuxProvider$mapToInstant$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.portfolio.listsswipenux.SwipeNuxProvider$mapToInstant$$inlined$map$1$2 */
            public static final class C394832<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.listsswipenux.SwipeNuxProvider$mapToInstant$$inlined$map$1$2", m3645f = "SwipeNuxProvider.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.portfolio.listsswipenux.SwipeNuxProvider$mapToInstant$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C394832.this.emit(null, this);
                    }
                }

                public C394832(FlowCollector flowCollector) {
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
                        String str = (String) ((Optional) obj).getOrNull();
                        Instant instant = str != null ? Instant.parse(str) : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(instant, anonymousClass1) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Instant> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C394832(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final void onPeekShown() {
        String string2 = Instant.now(this.clock).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        int i = this.peekCountPref.get() + 1;
        this.peekLastShownPref.set(string2);
        this.peekCountPref.set(i);
    }

    public final Flow<StringResource> tooltip() {
        if (!this.enableTooltips) {
            return FlowKt.flowOf((Object) null);
        }
        final Flow<Boolean> flowShowTooltip = showTooltip();
        return Operators.connectWhen(new Flow<StringResource>() { // from class: com.robinhood.shared.portfolio.listsswipenux.SwipeNuxProvider$tooltip$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super StringResource> flowCollector, Continuation continuation) {
                Object objCollect = flowShowTooltip.collect(new C394842(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.portfolio.listsswipenux.SwipeNuxProvider$tooltip$$inlined$map$1$2 */
            public static final class C394842<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.listsswipenux.SwipeNuxProvider$tooltip$$inlined$map$1$2", m3645f = "SwipeNuxProvider.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.portfolio.listsswipenux.SwipeNuxProvider$tooltip$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C394842.this.emit(null, this);
                    }
                }

                public C394842(FlowCollector flowCollector) {
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
                        StringResource stringResourceInvoke = ((Boolean) obj).booleanValue() ? StringResource.INSTANCE.invoke(C39480R.string.watchlist_equity_swipe_nux_tooltip, new Object[0]) : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(stringResourceInvoke, anonymousClass1) == coroutine_suspended) {
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
        }, this.swipeNuxGateProvider.isSwipeNuxEnabled(), FlowKt.flowOf((Object) null));
    }

    private final Flow<Boolean> showTooltip() {
        return FlowKt.combine(Context7.buffer$default(RxConvert.asFlow(this.peekCountPref.getChanges()), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(this.tooltipLastShownPref.changes()), Integer.MAX_VALUE, null, 2, null), new C394851(null));
    }

    /* compiled from: SwipeNuxProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "peekCount", "", "<destruct>", "Lcom/robinhood/utils/Optional;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.listsswipenux.SwipeNuxProvider$showTooltip$1", m3645f = "SwipeNuxProvider.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.listsswipenux.SwipeNuxProvider$showTooltip$1 */
    static final class C394851 extends ContinuationImpl7 implements Function3<Integer, Optional<? extends String>, Continuation<? super Boolean>, Object> {
        /* synthetic */ int I$0;
        /* synthetic */ Object L$0;
        int label;

        C394851(Continuation<? super C394851> continuation) {
            super(3, continuation);
        }

        public final Object invoke(int i, Optional<String> optional, Continuation<? super Boolean> continuation) {
            C394851 c394851 = new C394851(continuation);
            c394851.I$0 = i;
            c394851.L$0 = optional;
            return c394851.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Optional<? extends String> optional, Continuation<? super Boolean> continuation) {
            return invoke(num.intValue(), (Optional<String>) optional, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(this.I$0 > 0 && ((String) ((Optional) this.L$0).component1()) == null);
        }
    }

    public final void onTooltipShown() {
        String string2 = Instant.now(this.clock).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.tooltipLastShownPref.set(string2);
    }

    public final void onSwipe() {
        String string2 = Instant.now(this.clock).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.lastSwipePref.set(string2);
    }

    public final Flow<Integer> streamEquityTradesSinceLastPeek(Instant peekLastShown) {
        if (peekLastShown != null) {
            return Context7.buffer$default(RxConvert.asFlow(HistoryStore.count$default(this.historyStore, (HistoryEvent.State) null, SwipeContext2.getHistoryTransactionTypes(this.context), peekLastShown, (Instant) null, (HistoryStaticFilter) null, 24, (Object) null)), Integer.MAX_VALUE, null, 2, null);
        }
        return FlowKt.flowOf(0);
    }

    public final SwipeContext getContext() {
        return this.context;
    }
}
