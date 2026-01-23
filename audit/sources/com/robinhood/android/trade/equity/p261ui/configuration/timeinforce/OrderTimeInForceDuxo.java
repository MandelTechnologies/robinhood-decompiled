package com.robinhood.android.trade.equity.p261ui.configuration.timeinforce;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.equities.tradesettings.utils.StringsKt;
import com.robinhood.android.equityadvancedorder.prefs.DefaultTimeInForcePref;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.trade.equity.p261ui.configuration.timeinforce.OrderTimeInForceFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.EquityOrderExpireDateStore;
import com.robinhood.models.api.ApiOrderExpireDate;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.prefs.StringPreference;
import com.robinhood.udf.UiEvent;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.LocalDate;

/* compiled from: OrderTimeInForceDuxo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\"B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDataState;", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "marketHoursStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "orderExpireDateStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;", "stateProvider", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/markethours/data/store/MarketHoursStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "defaultTimeInForcePref", "Lcom/robinhood/prefs/StringPreference;", "getDefaultTimeInForcePref", "()Lcom/robinhood/prefs/StringPreference;", "setDefaultTimeInForcePref", "(Lcom/robinhood/prefs/StringPreference;)V", "onStart", "", "onResume", "selectTimeInForce", "timeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "saveDefaultTimeInForce", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OrderTimeInForceDuxo extends BaseDuxo<OrderTimeInForceDataState, OrderTimeInForceViewState> implements HasSavedState {

    @DefaultTimeInForcePref
    public StringPreference defaultTimeInForcePref;
    private final TraderMarketHoursManager marketHoursManager;
    private final MarketHoursStore marketHoursStore;
    private final EquityOrderExpireDateStore orderExpireDateStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OrderTimeInForceDuxo(MarketHoursStore marketHoursStore, TraderMarketHoursManager marketHoursManager, EquityOrderExpireDateStore orderExpireDateStore, OrderTimeInForceStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(orderExpireDateStore, "orderExpireDateStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new OrderTimeInForceDataState(null, null, null, ((OrderTimeInForceFragment.Args) companion.getArgs(savedStateHandle)).getConfiguration(), null, null, ((OrderTimeInForceFragment.Args) companion.getArgs(savedStateHandle)).getIsOrderReplacement(), 55, null), stateProvider, duxoBundle);
        this.marketHoursStore = marketHoursStore;
        this.marketHoursManager = marketHoursManager;
        this.orderExpireDateStore = orderExpireDateStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final StringPreference getDefaultTimeInForcePref() {
        StringPreference stringPreference = this.defaultTimeInForcePref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("defaultTimeInForcePref");
        return null;
    }

    public final void setDefaultTimeInForcePref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.defaultTimeInForcePref = stringPreference;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        applyMutation(new C294431(null));
        Observable<MarketHours> currentMarketHoursObservable = this.marketHoursManager.getCurrentMarketHoursObservable();
        LifecycleHost.DefaultImpls.bind$default(this, currentMarketHoursObservable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderTimeInForceDuxo.onStart$lambda$0(this.f$0, (MarketHours) obj);
            }
        });
        Observable<R> observableSwitchMap = currentMarketHoursObservable.switchMap(new Function() { // from class: com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceDuxo.onStart.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends MarketHours> apply(MarketHours marketHours) {
                Intrinsics.checkNotNullParameter(marketHours, "marketHours");
                LocalDate nextOpenHours = marketHours.getNextOpenHours();
                OrderTimeInForceDuxo.this.marketHoursStore.refresh(false, nextOpenHours);
                return OrderTimeInForceDuxo.this.marketHoursStore.getMarketHours(nextOpenHours);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderTimeInForceDuxo.onStart$lambda$1(this.f$0, (MarketHours) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C294455(null), 3, null);
    }

    /* compiled from: OrderTimeInForceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceDuxo$onStart$1", m3645f = "OrderTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceDuxo$onStart$1 */
    static final class C294431 extends ContinuationImpl7 implements Function2<OrderTimeInForceDataState, Continuation<? super OrderTimeInForceDataState>, Object> {
        int label;

        C294431(Continuation<? super C294431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderTimeInForceDuxo.this.new C294431(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OrderTimeInForceDataState orderTimeInForceDataState, Continuation<? super OrderTimeInForceDataState> continuation) {
            return ((C294431) create(orderTimeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Companion companion = OrderTimeInForceDuxo.INSTANCE;
            return new OrderTimeInForceDataState(null, null, null, ((OrderTimeInForceFragment.Args) companion.getArgs((HasSavedState) OrderTimeInForceDuxo.this)).getConfiguration(), null, null, ((OrderTimeInForceFragment.Args) companion.getArgs(OrderTimeInForceDuxo.this.getSavedStateHandle())).getIsOrderReplacement(), 55, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(OrderTimeInForceDuxo orderTimeInForceDuxo, MarketHours hours) {
        Intrinsics.checkNotNullParameter(hours, "hours");
        orderTimeInForceDuxo.applyMutation(new OrderTimeInForceDuxo3(hours, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(OrderTimeInForceDuxo orderTimeInForceDuxo, MarketHours marketHours) {
        orderTimeInForceDuxo.applyMutation(new OrderTimeInForceDuxo4(marketHours, null));
        return Unit.INSTANCE;
    }

    /* compiled from: OrderTimeInForceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceDuxo$onStart$5", m3645f = "OrderTimeInForceDuxo.kt", m3646l = {76}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceDuxo$onStart$5 */
    static final class C294455 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C294455(Continuation<? super C294455> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderTimeInForceDuxo.this.new C294455(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C294455) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EquityOrderExpireDateStore equityOrderExpireDateStore = OrderTimeInForceDuxo.this.orderExpireDateStore;
                this.label = 1;
                obj = equityOrderExpireDateStore.getExpireDate(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OrderTimeInForceDuxo.this.applyMutation(new AnonymousClass1(((ApiOrderExpireDate) obj).getGtc_expire_datetime(), null));
            return Unit.INSTANCE;
        }

        /* compiled from: OrderTimeInForceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceDuxo$onStart$5$1", m3645f = "OrderTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceDuxo$onStart$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderTimeInForceDataState, Continuation<? super OrderTimeInForceDataState>, Object> {
            final /* synthetic */ String $dateTimeStr;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$dateTimeStr = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$dateTimeStr, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OrderTimeInForceDataState orderTimeInForceDataState, Continuation<? super OrderTimeInForceDataState> continuation) {
                return ((AnonymousClass1) create(orderTimeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OrderTimeInForceDataState.copy$default((OrderTimeInForceDataState) this.L$0, null, null, this.$dateTimeStr, null, null, null, false, 123, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        String str;
        super.onResume();
        Companion companion = INSTANCE;
        OrderTimeInForce defaultTimeInForce = ((OrderTimeInForceFragment.Args) companion.getArgs((HasSavedState) this)).getDefaultTimeInForce();
        if (defaultTimeInForce == null) {
            OrderTimeInForce orderTimeInForceFromServerValue = OrderTimeInForce.INSTANCE.fromServerValue((((OrderTimeInForceFragment.Args) companion.getArgs((HasSavedState) this)).getIsOrderReplacement() || (str = getDefaultTimeInForcePref().get()) == null) ? null : StringsKt.blankToNull(str));
            if (orderTimeInForceFromServerValue != null) {
                applyMutation(new OrderTimeInForceDuxo2(orderTimeInForceFromServerValue, null));
                return;
            }
            return;
        }
        applyMutation(new C294422(defaultTimeInForce, null));
    }

    /* compiled from: OrderTimeInForceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceDuxo$onResume$2", m3645f = "OrderTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceDuxo$onResume$2 */
    static final class C294422 extends ContinuationImpl7 implements Function2<OrderTimeInForceDataState, Continuation<? super OrderTimeInForceDataState>, Object> {
        final /* synthetic */ OrderTimeInForce $defaultTimeInForceArg;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C294422(OrderTimeInForce orderTimeInForce, Continuation<? super C294422> continuation) {
            super(2, continuation);
            this.$defaultTimeInForceArg = orderTimeInForce;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C294422 c294422 = new C294422(this.$defaultTimeInForceArg, continuation);
            c294422.L$0 = obj;
            return c294422;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OrderTimeInForceDataState orderTimeInForceDataState, Continuation<? super OrderTimeInForceDataState> continuation) {
            return ((C294422) create(orderTimeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OrderTimeInForceDataState.copy$default((OrderTimeInForceDataState) this.L$0, null, null, null, null, null, new UiEvent(this.$defaultTimeInForceArg), false, 95, null);
        }
    }

    /* compiled from: OrderTimeInForceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceDuxo$selectTimeInForce$1", m3645f = "OrderTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.timeinforce.OrderTimeInForceDuxo$selectTimeInForce$1 */
    static final class C294461 extends ContinuationImpl7 implements Function2<OrderTimeInForceDataState, Continuation<? super OrderTimeInForceDataState>, Object> {
        final /* synthetic */ OrderTimeInForce $timeInForce;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C294461(OrderTimeInForce orderTimeInForce, Continuation<? super C294461> continuation) {
            super(2, continuation);
            this.$timeInForce = orderTimeInForce;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C294461 c294461 = new C294461(this.$timeInForce, continuation);
            c294461.L$0 = obj;
            return c294461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OrderTimeInForceDataState orderTimeInForceDataState, Continuation<? super OrderTimeInForceDataState> continuation) {
            return ((C294461) create(orderTimeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OrderTimeInForceDataState.copy$default((OrderTimeInForceDataState) this.L$0, null, null, null, null, this.$timeInForce, null, false, 111, null);
        }
    }

    public final void selectTimeInForce(OrderTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        applyMutation(new C294461(timeInForce, null));
    }

    public final void saveDefaultTimeInForce(OrderTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        getDefaultTimeInForcePref().set(timeInForce.getServerValue());
    }

    /* compiled from: OrderTimeInForceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceDuxo;", "Lcom/robinhood/android/trade/equity/ui/configuration/timeinforce/OrderTimeInForceFragment$Args;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OrderTimeInForceDuxo, OrderTimeInForceFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OrderTimeInForceFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OrderTimeInForceFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OrderTimeInForceFragment.Args getArgs(OrderTimeInForceDuxo orderTimeInForceDuxo) {
            return (OrderTimeInForceFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, orderTimeInForceDuxo);
        }
    }
}
