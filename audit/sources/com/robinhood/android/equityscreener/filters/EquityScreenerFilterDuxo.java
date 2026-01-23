package com.robinhood.android.equityscreener.filters;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.equityscreener.filters.EquityScreenerFilterFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.equityscreener.models.LocalScreenerMetadata;
import com.robinhood.equityscreener.models.p294db.ScanResultResponse;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.IndicatorsStore;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScanStore;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import com.robinhood.rosetta.eventlogging.Screen;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
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

/* compiled from: EquityScreenerFilterDuxo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001(BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0010\u0010\"\u001a\u00020 2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J)\u0010#\u001a\u00020 2\u0006\u0010#\u001a\u00020$2\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&¢\u0006\u0002\b'R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0017\u001a\u0004\u0018\u00010\u00188FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c*\u0004\b\u0019\u0010\u001a¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterDataState;", "Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "indicatorsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;", "scanStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore;", "screenersStore", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterProvider;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/IndicatorsStore;Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScanStore;Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "screenerId", "", "getScreenerId$delegate", "(Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterDuxo;)Ljava/lang/Object;", "getScreenerId", "()Ljava/lang/String;", "screenerId$receiver", "Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterFragment$Args;", "onResume", "", "onCreate", "resetAllFilters", "loading", "", "mutation", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "Companion", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityScreenerFilterDuxo extends BaseDuxo<EquityScreenerFilterDataState, EquityScreenerFilterViewState> implements HasSavedState {
    private final EventLogger eventLogger;
    private final IndicatorsStore indicatorsStore;
    private final SavedStateHandle savedStateHandle;
    private final ScanStore scanStore;

    /* renamed from: screenerId$receiver, reason: from kotlin metadata */
    private final EquityScreenerFilterFragment.Args screenerId;
    private final ScreenersStore screenersStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityScreenerFilterDataState loading$lambda$5(EquityScreenerFilterDataState equityScreenerFilterDataState) {
        Intrinsics.checkNotNullParameter(equityScreenerFilterDataState, "<this>");
        return equityScreenerFilterDataState;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityScreenerFilterDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, IndicatorsStore indicatorsStore, ScanStore scanStore, ScreenersStore screenersStore, EventLogger eventLogger, EquityScreenerFilterViewState3 stateProvider) {
        super(new EquityScreenerFilterDataState(null, null, false, null, 15, null), stateProvider, duxoBundle);
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
        this.screenerId = (EquityScreenerFilterFragment.Args) INSTANCE.getArgs((HasSavedState) this);
    }

    public final String getScreenerId() {
        return this.screenerId.getScreenerId();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, this.indicatorsStore.getIndicatorGroups(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityScreenerFilterDuxo.onResume$lambda$0(this.f$0, (List) obj);
            }
        });
        Observable observableDoOnError = ScanStore.scan$default(this.scanStore, getScreenerId(), false, ((EquityScreenerFilterFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber(), 2, null).map(new Function() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterDuxo.onResume.2
            @Override // io.reactivex.functions.Function
            public final String apply(ScanResultResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getSubtitle();
            }
        }).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterDuxo.onResume.3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                EquityScreenerFilterDuxo.loading$default(EquityScreenerFilterDuxo.this, true, null, 2, null);
            }
        }).doOnError(new Consumer() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterDuxo.onResume.4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                EquityScreenerFilterDuxo.loading$default(EquityScreenerFilterDuxo.this, false, null, 2, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnError, "doOnError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDoOnError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityScreenerFilterDuxo.onResume$lambda$2(this.f$0, (String) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.screenersStore.getLocalScreener(getScreenerId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityScreenerFilterDuxo.onResume$lambda$3(this.f$0, (LocalScreenerMetadata) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(EquityScreenerFilterDuxo equityScreenerFilterDuxo, List indicatorGroups) {
        Intrinsics.checkNotNullParameter(indicatorGroups, "indicatorGroups");
        equityScreenerFilterDuxo.applyMutation(new EquityScreenerFilterDuxo2(indicatorGroups, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(EquityScreenerFilterDuxo equityScreenerFilterDuxo, final String str) {
        equityScreenerFilterDuxo.loading(false, new Function1() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityScreenerFilterDuxo.onResume$lambda$2$lambda$1(str, (EquityScreenerFilterDataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityScreenerFilterDataState onResume$lambda$2$lambda$1(String str, EquityScreenerFilterDataState loading) {
        Intrinsics.checkNotNullParameter(loading, "$this$loading");
        Intrinsics.checkNotNull(str);
        return EquityScreenerFilterDataState.copy$default(loading, null, str, false, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(EquityScreenerFilterDuxo equityScreenerFilterDuxo, LocalScreenerMetadata it) {
        Intrinsics.checkNotNullParameter(it, "it");
        equityScreenerFilterDuxo.applyMutation(new EquityScreenerFilterDuxo3(it, null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, new Screen(Screen.Name.SCREENER_INDICATORS_LIST, null, null, null, 14, null), null, null, null, 29, null);
    }

    public final void resetAllFilters(String screenerId) {
        Single<Boolean> singleDoOnError = this.screenersStore.resetFilters(screenerId).doOnError(new Consumer() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterDuxo.resetAllFilters.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                EquityScreenerFilterDuxo.loading$default(EquityScreenerFilterDuxo.this, false, null, 2, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnError, "doOnError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityScreenerFilterDuxo.resetAllFilters$lambda$4(this.f$0, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resetAllFilters$lambda$4(EquityScreenerFilterDuxo equityScreenerFilterDuxo, Boolean bool) {
        if (bool.booleanValue()) {
            loading$default(equityScreenerFilterDuxo, true, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loading$default(EquityScreenerFilterDuxo equityScreenerFilterDuxo, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.equityscreener.filters.EquityScreenerFilterDuxo$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return EquityScreenerFilterDuxo.loading$lambda$5((EquityScreenerFilterDataState) obj2);
                }
            };
        }
        equityScreenerFilterDuxo.loading(z, function1);
    }

    /* compiled from: EquityScreenerFilterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.filters.EquityScreenerFilterDuxo$loading$2", m3645f = "EquityScreenerFilterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityscreener.filters.EquityScreenerFilterDuxo$loading$2 */
    static final class C157022 extends ContinuationImpl7 implements Function2<EquityScreenerFilterDataState, Continuation<? super EquityScreenerFilterDataState>, Object> {
        final /* synthetic */ boolean $loading;
        final /* synthetic */ Function1<EquityScreenerFilterDataState, EquityScreenerFilterDataState> $mutation;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C157022(Function1<? super EquityScreenerFilterDataState, EquityScreenerFilterDataState> function1, boolean z, Continuation<? super C157022> continuation) {
            super(2, continuation);
            this.$mutation = function1;
            this.$loading = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C157022 c157022 = new C157022(this.$mutation, this.$loading, continuation);
            c157022.L$0 = obj;
            return c157022;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityScreenerFilterDataState equityScreenerFilterDataState, Continuation<? super EquityScreenerFilterDataState> continuation) {
            return ((C157022) create(equityScreenerFilterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return this.$mutation.invoke(EquityScreenerFilterDataState.copy$default((EquityScreenerFilterDataState) this.L$0, null, null, this.$loading, null, 11, null));
        }
    }

    public final void loading(boolean loading, Function1<? super EquityScreenerFilterDataState, EquityScreenerFilterDataState> mutation) {
        Intrinsics.checkNotNullParameter(mutation, "mutation");
        applyMutation(new C157022(mutation, loading, null));
    }

    /* compiled from: EquityScreenerFilterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterDuxo;", "Lcom/robinhood/android/equityscreener/filters/EquityScreenerFilterFragment$Args;", "<init>", "()V", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EquityScreenerFilterDuxo, EquityScreenerFilterFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EquityScreenerFilterFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (EquityScreenerFilterFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EquityScreenerFilterFragment.Args getArgs(EquityScreenerFilterDuxo equityScreenerFilterDuxo) {
            return (EquityScreenerFilterFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, equityScreenerFilterDuxo);
        }
    }
}
