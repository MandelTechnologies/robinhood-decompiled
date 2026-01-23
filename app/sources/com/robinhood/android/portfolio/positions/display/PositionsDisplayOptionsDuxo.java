package com.robinhood.android.portfolio.positions.display;

import com.robinhood.android.lib.p166fx.provider.DisplayCurrencySelectionPrefs3;
import com.robinhood.android.models.portfolio.PositionsDisplayOptions;
import com.robinhood.android.models.portfolio.SelectedPositionsDisplayOption;
import com.robinhood.android.portfolio.contracts.PositionsDisplayOptionsKey;
import com.robinhood.android.regiongate.McwCurrencySwitcherRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsDisplayOptionsStore;
import com.robinhood.prefs.IntPreference;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.utils.Optional;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: PositionsDisplayOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B3\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u001a\u0010\u0017\u001a\u00020\u00152\n\u0010\u0018\u001a\u00060\u0019j\u0002`\u001a2\u0006\u0010\u001b\u001a\u00020\u0012J\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsDataState;", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsViewState;", "positionsDisplayOptionsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsDisplayOptionsStore;", "displayCurrencyPref", "Lcom/robinhood/prefs/IntPreference;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "stateProvider", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsDisplayOptionsStore;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "dataSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/robinhood/android/portfolio/contracts/PositionsDisplayOptionsKey;", "kotlin.jvm.PlatformType", "onCreate", "", "onStart", "onDisplayValueSelected", "displayType", "", "Lcom/robinhood/android/models/portfolio/PositionDisplayType;", WebsocketGatewayConstants.DATA_KEY, "setData", "lib-positions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PositionsDisplayOptionsDuxo extends BaseDuxo<PositionsDisplayOptionsDataState, PositionsDisplayOptionsViewState> {
    public static final int $stable = 8;
    private final BehaviorSubject<PositionsDisplayOptionsKey> dataSubject;
    private final IntPreference displayCurrencyPref;
    private final PositionsDisplayOptionsStore positionsDisplayOptionsStore;
    private final RegionGateProvider regionGateProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsDisplayOptionsDuxo(PositionsDisplayOptionsStore positionsDisplayOptionsStore, @DisplayCurrencySelectionPrefs3 IntPreference displayCurrencyPref, RegionGateProvider regionGateProvider, PositionsDisplayOptionsStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new PositionsDisplayOptionsDataState(null, null, null, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(positionsDisplayOptionsStore, "positionsDisplayOptionsStore");
        Intrinsics.checkNotNullParameter(displayCurrencyPref, "displayCurrencyPref");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.positionsDisplayOptionsStore = positionsDisplayOptionsStore;
        this.displayCurrencyPref = displayCurrencyPref;
        this.regionGateProvider = regionGateProvider;
        BehaviorSubject<PositionsDisplayOptionsKey> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.dataSubject = behaviorSubjectCreate;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C258331(null));
    }

    /* compiled from: PositionsDisplayOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onCreate$1", m3645f = "PositionsDisplayOptionsDuxo.kt", m3646l = {45}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onCreate$1 */
    static final class C258331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C258331(Continuation<? super C258331> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionsDisplayOptionsDuxo.this.new C258331(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C258331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(PositionsDisplayOptionsDuxo.this.regionGateProvider, McwCurrencySwitcherRegionGate.INSTANCE, false, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PositionsDisplayOptionsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamRegionGateStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: PositionsDisplayOptionsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onCreate$1$1", m3645f = "PositionsDisplayOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ PositionsDisplayOptionsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PositionsDisplayOptionsDuxo positionsDisplayOptionsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = positionsDisplayOptionsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PositionsDisplayOptionsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onCreate$1$1$1", m3645f = "PositionsDisplayOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504751 extends ContinuationImpl7 implements Function2<PositionsDisplayOptionsDataState, Continuation<? super PositionsDisplayOptionsDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504751(boolean z, Continuation<? super C504751> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504751 c504751 = new C504751(this.$it, continuation);
                    c504751.L$0 = obj;
                    return c504751;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PositionsDisplayOptionsDataState positionsDisplayOptionsDataState, Continuation<? super PositionsDisplayOptionsDataState> continuation) {
                    return ((C504751) create(positionsDisplayOptionsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PositionsDisplayOptionsDataState.copy$default((PositionsDisplayOptionsDataState) this.L$0, null, null, boxing.boxBoolean(this.$it), 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504751(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Observable<R> observableFlatMap = this.dataSubject.flatMap(new Function() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<SelectedPositionsDisplayOption>> apply(PositionsDisplayOptionsKey data) {
                Intrinsics.checkNotNullParameter(data, "data");
                return PositionsDisplayOptionsDuxo.this.positionsDisplayOptionsStore.streamSelectedPositionsDisplayOption(data.getAccountNumber(), data.getInstrumentType());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionsDisplayOptionsDuxo.onStart$lambda$0(this.f$0, (Optional) obj);
            }
        });
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C258363(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(PositionsDisplayOptionsDuxo positionsDisplayOptionsDuxo, Optional optional) {
        positionsDisplayOptionsDuxo.applyMutation(new PositionsDisplayOptionsDuxo2((SelectedPositionsDisplayOption) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: PositionsDisplayOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onStart$3", m3645f = "PositionsDisplayOptionsDuxo.kt", m3646l = {82}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onStart$3 */
    static final class C258363 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C258363(Continuation<? super C258363> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionsDisplayOptionsDuxo.this.new C258363(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C258363) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.combine(RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(PositionsDisplayOptionsDuxo.this.regionGateProvider, McwCurrencySwitcherRegionGate.INSTANCE, false, 2, null), Context7.buffer$default(RxConvert.asFlow(PositionsDisplayOptionsDuxo.this.displayCurrencyPref.getChanges()), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(PositionsDisplayOptionsDuxo.this.dataSubject), Integer.MAX_VALUE, null, 2, null), new AnonymousClass1(null)), new C25832x1a032aa2(null, PositionsDisplayOptionsDuxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(PositionsDisplayOptionsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: PositionsDisplayOptionsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/rosetta/common/Currency;", "Lcom/robinhood/android/portfolio/contracts/PositionsDisplayOptionsKey;", "kotlin.jvm.PlatformType", "isMcwCurrencySwitcherEnabled", "", "displayCurrency", "", WebsocketGatewayConstants.DATA_KEY}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onStart$3$1", m3645f = "PositionsDisplayOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onStart$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function4<Boolean, Integer, PositionsDisplayOptionsKey, Continuation<? super Tuples2<? extends Currency, ? extends PositionsDisplayOptionsKey>>, Object> {
            /* synthetic */ int I$0;
            /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(4, continuation);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Integer num, PositionsDisplayOptionsKey positionsDisplayOptionsKey, Continuation<? super Tuples2<? extends Currency, ? extends PositionsDisplayOptionsKey>> continuation) {
                return invoke(bool.booleanValue(), num.intValue(), positionsDisplayOptionsKey, (Continuation<? super Tuples2<? extends Currency, PositionsDisplayOptionsKey>>) continuation);
            }

            public final Object invoke(boolean z, int i, PositionsDisplayOptionsKey positionsDisplayOptionsKey, Continuation<? super Tuples2<? extends Currency, PositionsDisplayOptionsKey>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = z;
                anonymousClass1.I$0 = i;
                anonymousClass1.L$0 = positionsDisplayOptionsKey;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z = this.Z$0;
                int value = this.I$0;
                PositionsDisplayOptionsKey positionsDisplayOptionsKey = (PositionsDisplayOptionsKey) this.L$0;
                if (!z) {
                    value = Currency.USD.getValue();
                }
                return Tuples4.m3642to(Currency.INSTANCE.fromValue(value), positionsDisplayOptionsKey);
            }
        }

        /* compiled from: PositionsDisplayOptionsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "displayOptions", "Lcom/robinhood/android/models/portfolio/PositionsDisplayOptions;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onStart$3$3", m3645f = "PositionsDisplayOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onStart$3$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<PositionsDisplayOptions, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PositionsDisplayOptionsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PositionsDisplayOptionsDuxo positionsDisplayOptionsDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = positionsDisplayOptionsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PositionsDisplayOptions positionsDisplayOptions, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(positionsDisplayOptions, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: PositionsDisplayOptionsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onStart$3$3$1", m3645f = "PositionsDisplayOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onStart$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PositionsDisplayOptionsDataState, Continuation<? super PositionsDisplayOptionsDataState>, Object> {
                final /* synthetic */ PositionsDisplayOptions $displayOptions;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PositionsDisplayOptions positionsDisplayOptions, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$displayOptions = positionsDisplayOptions;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$displayOptions, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PositionsDisplayOptionsDataState positionsDisplayOptionsDataState, Continuation<? super PositionsDisplayOptionsDataState> continuation) {
                    return ((AnonymousClass1) create(positionsDisplayOptionsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PositionsDisplayOptionsDataState.copy$default((PositionsDisplayOptionsDataState) this.L$0, null, this.$displayOptions, null, 5, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((PositionsDisplayOptions) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void onDisplayValueSelected(String displayType, PositionsDisplayOptionsKey data) {
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(data, "data");
        this.positionsDisplayOptionsStore.updateSelectedPositionDisplayOption(data.getAccountNumber(), data.getInstrumentType(), displayType);
        applyMutation(new C258341(displayType, null));
    }

    /* compiled from: PositionsDisplayOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onDisplayValueSelected$1", m3645f = "PositionsDisplayOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onDisplayValueSelected$1 */
    static final class C258341 extends ContinuationImpl7 implements Function2<PositionsDisplayOptionsDataState, Continuation<? super PositionsDisplayOptionsDataState>, Object> {
        final /* synthetic */ String $displayType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C258341(String str, Continuation<? super C258341> continuation) {
            super(2, continuation);
            this.$displayType = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C258341 c258341 = new C258341(this.$displayType, continuation);
            c258341.L$0 = obj;
            return c258341;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PositionsDisplayOptionsDataState positionsDisplayOptionsDataState, Continuation<? super PositionsDisplayOptionsDataState> continuation) {
            return ((C258341) create(positionsDisplayOptionsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PositionsDisplayOptionsDataState.copy$default((PositionsDisplayOptionsDataState) this.L$0, this.$displayType, null, null, 6, null);
        }
    }

    public final void setData(PositionsDisplayOptionsKey data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.dataSubject.onNext(data);
    }
}
