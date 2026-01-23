package com.robinhood.android.equityscreener.filters;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.equityscreener.filters.IndicatorFilterDuxo;
import com.robinhood.android.equityscreener.filters.IndicatorFilterFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedSingle;
import com.robinhood.equityscreener.models.p294db.ScanResultResponse;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScanStore;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import com.robinhood.models.serverdriven.experimental.api.ScreenerFilter;
import com.robinhood.models.serverdriven.experimental.api.ScreenerIndicator;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.Optional;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IndicatorFilterDuxo.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001,BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J$\u0010\"\u001a\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010$\u001a\u00020\u00182\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&J)\u0010'\u001a\u00020 2\u0006\u0010'\u001a\u00020(2\u0019\b\u0002\u0010)\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020*¢\u0006\u0002\b+R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0017\u001a\u0004\u0018\u00010\u00188FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c*\u0004\b\u0019\u0010\u001a¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/filters/IndicatorFilterDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equityscreener/filters/IndicatorFilterDataState;", "Lcom/robinhood/android/equityscreener/filters/IndicatorFilterViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "indicatorsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "scanStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/equityscreener/filters/IndicatorFilterProvider;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore;Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/equityscreener/filters/IndicatorFilterProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "screenerId", "", "getScreenerId$delegate", "(Lcom/robinhood/android/equityscreener/filters/IndicatorFilterDuxo;)Ljava/lang/Object;", "getScreenerId", "()Ljava/lang/String;", "screenerId$receiver", "Lcom/robinhood/android/equityscreener/filters/IndicatorFilterFragment$Args;", "onStart", "", "onCreate", "updateIndicatorFilterSetting", "Lio/reactivex/Completable;", "indicatorKey", "screenerFilter", "Lcom/robinhood/models/serverdriven/experimental/api/ScreenerFilter;", "loading", "", "mutation", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "Companion", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class IndicatorFilterDuxo extends BaseDuxo<IndicatorFilterDataState, IndicatorFilterViewState> implements HasSavedState {
    private final EventLogger eventLogger;
    private final IndicatorsStore indicatorsStore;
    private final SavedStateHandle savedStateHandle;
    private final ScanStore scanStore;

    /* renamed from: screenerId$receiver, reason: from kotlin metadata */
    private final IndicatorFilterFragment.Args screenerId;
    private final ScreenersStore screenersStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final IndicatorFilterDataState loading$lambda$4(IndicatorFilterDataState indicatorFilterDataState) {
        Intrinsics.checkNotNullParameter(indicatorFilterDataState, "<this>");
        return indicatorFilterDataState;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorFilterDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, IndicatorsStore indicatorsStore, ScanStore scanStore, ScreenersStore screenersStore, EventLogger eventLogger, IndicatorFilterViewState3 stateProvider) {
        super(new IndicatorFilterDataState(null, false, null, null, null, null, 63, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(indicatorsStore, "indicatorsStore");
        Intrinsics.checkNotNullParameter(scanStore, "scanStore");
        Intrinsics.checkNotNullParameter(screenersStore, "screenersStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.savedStateHandle = savedStateHandle;
        this.indicatorsStore = indicatorsStore;
        this.scanStore = scanStore;
        this.screenersStore = screenersStore;
        this.eventLogger = eventLogger;
        this.screenerId = (IndicatorFilterFragment.Args) INSTANCE.getArgs((HasSavedState) this);
    }

    public final String getScreenerId() {
        return this.screenerId.getScreenerId();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        loading$default(this, true, null, 2, null);
        ScanStore scanStore = this.scanStore;
        Companion companion = INSTANCE;
        Observable observableDoOnError = ScanStore.scan$default(scanStore, ((IndicatorFilterFragment.Args) companion.getArgs((HasSavedState) this)).getScreenerId(), false, ((IndicatorFilterFragment.Args) companion.getArgs((HasSavedState) this)).getAccountNumber(), 2, null).doOnError(new Consumer() { // from class: com.robinhood.android.equityscreener.filters.IndicatorFilterDuxo.onStart.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                IndicatorFilterDuxo.loading$default(IndicatorFilterDuxo.this, false, null, 2, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnError, "doOnError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDoOnError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.filters.IndicatorFilterDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndicatorFilterDuxo.onStart$lambda$1(this.f$0, (ScanResultResponse) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.screenersStore.getFilter(((IndicatorFilterFragment.Args) companion.getArgs((HasSavedState) this)).getScreenerId(), ((IndicatorFilterFragment.Args) companion.getArgs((HasSavedState) this)).getKey()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.filters.IndicatorFilterDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndicatorFilterDuxo.onStart$lambda$2(this.f$0, (Optional) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.indicatorsStore.getIndicator(((IndicatorFilterFragment.Args) companion.getArgs((HasSavedState) this)).getKey()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.filters.IndicatorFilterDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndicatorFilterDuxo.onStart$lambda$3(this.f$0, (ScreenerIndicator) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(IndicatorFilterDuxo indicatorFilterDuxo, final ScanResultResponse scanResultResponse) {
        indicatorFilterDuxo.loading(false, new Function1() { // from class: com.robinhood.android.equityscreener.filters.IndicatorFilterDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IndicatorFilterDuxo.onStart$lambda$1$lambda$0(scanResultResponse, (IndicatorFilterDataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IndicatorFilterDataState onStart$lambda$1$lambda$0(ScanResultResponse scanResultResponse, IndicatorFilterDataState loading) {
        Intrinsics.checkNotNullParameter(loading, "$this$loading");
        return IndicatorFilterDataState.copy$default(loading, null, false, null, scanResultResponse, null, null, 55, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(IndicatorFilterDuxo indicatorFilterDuxo, Optional filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        indicatorFilterDuxo.applyMutation(new IndicatorFilterDuxo2(filter, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(IndicatorFilterDuxo indicatorFilterDuxo, ScreenerIndicator indicator) {
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        indicatorFilterDuxo.applyMutation(new IndicatorFilterDuxo3(indicator, null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, new Screen(Screen.Name.SCREENER_INDICATOR_DETAIL, null, null, null, 14, null), null, null, null, 29, null);
    }

    public static /* synthetic */ Completable updateIndicatorFilterSetting$default(IndicatorFilterDuxo indicatorFilterDuxo, String str, String str2, ScreenerFilter screenerFilter, int i, Object obj) {
        if ((i & 4) != 0) {
            screenerFilter = null;
        }
        return indicatorFilterDuxo.updateIndicatorFilterSetting(str, str2, screenerFilter);
    }

    /* compiled from: IndicatorFilterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.filters.IndicatorFilterDuxo$updateIndicatorFilterSetting$1", m3645f = "IndicatorFilterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityscreener.filters.IndicatorFilterDuxo$updateIndicatorFilterSetting$1 */
    static final class C157151 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $indicatorKey;
        final /* synthetic */ ScreenerFilter $screenerFilter;
        final /* synthetic */ String $screenerId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C157151(String str, String str2, ScreenerFilter screenerFilter, Continuation<? super C157151> continuation) {
            super(2, continuation);
            this.$screenerId = str;
            this.$indicatorKey = str2;
            this.$screenerFilter = screenerFilter;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IndicatorFilterDuxo.this.new C157151(this.$screenerId, this.$indicatorKey, this.$screenerFilter, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C157151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IndicatorFilterDuxo indicatorFilterDuxo = IndicatorFilterDuxo.this;
            Single<Boolean> filter = indicatorFilterDuxo.screenersStore.setFilter(this.$screenerId, this.$indicatorKey, this.$screenerFilter);
            final IndicatorFilterDuxo indicatorFilterDuxo2 = IndicatorFilterDuxo.this;
            Single<Boolean> singleDoOnSubscribe = filter.doOnSubscribe(new Consumer() { // from class: com.robinhood.android.equityscreener.filters.IndicatorFilterDuxo.updateIndicatorFilterSetting.1.1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Disposable disposable) {
                    IndicatorFilterDuxo.loading$default(indicatorFilterDuxo2, true, null, 2, null);
                }
            });
            final IndicatorFilterDuxo indicatorFilterDuxo3 = IndicatorFilterDuxo.this;
            Single<Boolean> singleDoOnError = singleDoOnSubscribe.doOnError(new Consumer() { // from class: com.robinhood.android.equityscreener.filters.IndicatorFilterDuxo.updateIndicatorFilterSetting.1.2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Throwable th) {
                    IndicatorFilterDuxo.loading$default(indicatorFilterDuxo3, false, null, 2, null);
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleDoOnError, "doOnError(...)");
            ScopedSingle scopedSingleBind$default = LifecycleHost.DefaultImpls.bind$default(indicatorFilterDuxo, singleDoOnError, (LifecycleEvent) null, 1, (Object) null);
            final IndicatorFilterDuxo indicatorFilterDuxo4 = IndicatorFilterDuxo.this;
            scopedSingleBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.filters.IndicatorFilterDuxo$updateIndicatorFilterSetting$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return IndicatorFilterDuxo.C157151.invokeSuspend$lambda$0(indicatorFilterDuxo4, (Boolean) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(IndicatorFilterDuxo indicatorFilterDuxo, Boolean bool) {
            Intrinsics.checkNotNull(bool);
            IndicatorFilterDuxo.loading$default(indicatorFilterDuxo, bool.booleanValue(), null, 2, null);
            return Unit.INSTANCE;
        }
    }

    public final Completable updateIndicatorFilterSetting(String screenerId, String indicatorKey, ScreenerFilter screenerFilter) {
        Intrinsics.checkNotNullParameter(indicatorKey, "indicatorKey");
        return RxFactory.DefaultImpls.rxCompletable$default(this, null, new C157151(screenerId, indicatorKey, screenerFilter, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loading$default(IndicatorFilterDuxo indicatorFilterDuxo, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.equityscreener.filters.IndicatorFilterDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return IndicatorFilterDuxo.loading$lambda$4((IndicatorFilterDataState) obj2);
                }
            };
        }
        indicatorFilterDuxo.loading(z, function1);
    }

    /* compiled from: IndicatorFilterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityscreener/filters/IndicatorFilterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.filters.IndicatorFilterDuxo$loading$2", m3645f = "IndicatorFilterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityscreener.filters.IndicatorFilterDuxo$loading$2 */
    static final class C157132 extends ContinuationImpl7 implements Function2<IndicatorFilterDataState, Continuation<? super IndicatorFilterDataState>, Object> {
        final /* synthetic */ boolean $loading;
        final /* synthetic */ Function1<IndicatorFilterDataState, IndicatorFilterDataState> $mutation;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C157132(Function1<? super IndicatorFilterDataState, IndicatorFilterDataState> function1, boolean z, Continuation<? super C157132> continuation) {
            super(2, continuation);
            this.$mutation = function1;
            this.$loading = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C157132 c157132 = new C157132(this.$mutation, this.$loading, continuation);
            c157132.L$0 = obj;
            return c157132;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IndicatorFilterDataState indicatorFilterDataState, Continuation<? super IndicatorFilterDataState> continuation) {
            return ((C157132) create(indicatorFilterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return this.$mutation.invoke(IndicatorFilterDataState.copy$default((IndicatorFilterDataState) this.L$0, null, this.$loading, null, null, null, null, 61, null));
        }
    }

    public final void loading(boolean loading, Function1<? super IndicatorFilterDataState, IndicatorFilterDataState> mutation) {
        Intrinsics.checkNotNullParameter(mutation, "mutation");
        applyMutation(new C157132(mutation, loading, null));
    }

    /* compiled from: IndicatorFilterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/filters/IndicatorFilterDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/equityscreener/filters/IndicatorFilterDuxo;", "Lcom/robinhood/android/equityscreener/filters/IndicatorFilterFragment$Args;", "<init>", "()V", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<IndicatorFilterDuxo, IndicatorFilterFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public IndicatorFilterFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (IndicatorFilterFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public IndicatorFilterFragment.Args getArgs(IndicatorFilterDuxo indicatorFilterDuxo) {
            return (IndicatorFilterFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, indicatorFilterDuxo);
        }
    }
}
