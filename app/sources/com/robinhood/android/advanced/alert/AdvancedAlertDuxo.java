package com.robinhood.android.advanced.alert;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.advanced.alert.AdvancedAlertEvent;
import com.robinhood.android.advanced.alert.AdvancedAlertFragment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore;
import com.robinhood.librobinhood.data.store.alert.SortingType;
import com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert2;
import com.robinhood.models.advanced.alert.api.ApiDeleteAdvancedAlertSettingItemRequest;
import com.robinhood.models.advanced.alert.api.ApiDeleteAdvancedAlertSettingRequest;
import com.robinhood.models.advanced.alert.api.ApiUpdateAdvancedAlertSettingItemRequest;
import com.robinhood.models.advanced.alert.p302db.AdvancedAlert;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingItem;
import com.robinhood.models.advanced.alert.p302db.AlertHubUiResources;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.shared.models.advancedChart.p386db.TechnicalIndicatorConfigList;
import com.robinhood.utils.Either;
import com.robinhood.utils.math.BigDecimals7;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvancedAlertDuxo.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 42\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00014B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\u000e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%J\u001e\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020!2\u0006\u0010'\u001a\u00020%J\u000e\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020!2\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u00020!2\u0006\u00103\u001a\u00020*R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertDataState;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "alertStore", "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;", "advancedChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore;", "stateProvider", "Lcom/robinhood/android/advanced/alert/AdvancedAlertStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore;Lcom/robinhood/android/advanced/alert/AdvancedAlertStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "entityId", "Ljava/util/UUID;", "getEntityId", "()Ljava/util/UUID;", "entityType", "Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "getEntityType", "()Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "onCreate", "", "onResume", "fetchUiResource", "digestId", "", "updateSetting", "settingId", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "enabled", "", "deleteSetting", "toggleIndicatorAdvancedAlert", "alert", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "updateSelectedSegment", "alertType", "Lcom/robinhood/android/advanced/alert/AlertType;", "updateNotificationRelayEnabled", "isEnabled", "Companion", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AdvancedAlertDuxo extends BaseDuxo3<AdvancedAlertDataState, AdvancedAlertViewState, AdvancedAlertEvent> implements HasSavedState {
    private final AdvancedChartStore advancedChartStore;
    private final AdvancedAlertStore alertStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdvancedAlertDuxo(AdvancedAlertStore alertStore, AdvancedChartStore advancedChartStore, AdvancedAlertStateProvider stateProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        AlertType alertType;
        Intrinsics.checkNotNullParameter(alertStore, "alertStore");
        Intrinsics.checkNotNullParameter(advancedChartStore, "advancedChartStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        if (((AdvancedAlertFragment.Args) companion.getArgs(savedStateHandle)).getDefaultToPriceAlert() || (((AdvancedAlertFragment.Args) companion.getArgs(savedStateHandle)).getEntity() instanceof Either.Right)) {
            alertType = AlertType.PRICE;
        } else {
            alertType = AlertType.INDICATOR;
        }
        super(new AdvancedAlertDataState(null, null, alertType, false, null, null, 59, null), stateProvider, duxoBundle);
        this.alertStore = alertStore;
        this.advancedChartStore = advancedChartStore;
        this.savedStateHandle = savedStateHandle;
    }

    private final UUID getEntityId() {
        Either<Instrument, UiCurrencyPair> entity = ((AdvancedAlertFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getEntity();
        if (!(entity instanceof Either.Left)) {
            if (!(entity instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            return ((UiCurrencyPair) ((Either.Right) entity).getValue()).getId();
        }
        return ((Instrument) ((Either.Left) entity).getValue()).getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApiAdvancedAlert2 getEntityType() {
        Either<Instrument, UiCurrencyPair> entity = ((AdvancedAlertFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getEntity();
        if (!(entity instanceof Either.Left)) {
            if (!(entity instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            return ApiAdvancedAlert2.CRYPTO;
        }
        return ApiAdvancedAlert2.INSTRUMENTS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UiCurrencyPair getCurrencyPair() {
        Either<Instrument, UiCurrencyPair> entity = ((AdvancedAlertFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getEntity();
        Either.Right right = entity instanceof Either.Right ? (Either.Right) entity : null;
        if (right != null) {
            return (UiCurrencyPair) right.getValue();
        }
        return null;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        submit(new AdvancedAlertEvent.LoadingEvent(true));
        if (getEntityType() == ApiAdvancedAlert2.CRYPTO) {
            applyMutation(new C83721(null));
        }
        LifecycleHost.DefaultImpls.bind$default(this, this.alertStore.fetchAdvancedAlert(getEntityId(), getEntityType(), SortingType.CREATED_AT, true), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
    }

    /* compiled from: AdvancedAlertDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advanced/alert/AdvancedAlertDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertDuxo$onCreate$1", m3645f = "AdvancedAlertDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$onCreate$1 */
    static final class C83721 extends ContinuationImpl7 implements Function2<AdvancedAlertDataState, Continuation<? super AdvancedAlertDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C83721(Continuation<? super C83721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C83721 c83721 = AdvancedAlertDuxo.this.new C83721(continuation);
            c83721.L$0 = obj;
            return c83721;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvancedAlertDataState advancedAlertDataState, Continuation<? super AdvancedAlertDataState> continuation) {
            return ((C83721) create(advancedAlertDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            BigDecimal minOrderPriceIncrement;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AdvancedAlertDataState advancedAlertDataState = (AdvancedAlertDataState) this.L$0;
                UiCurrencyPair currencyPair = AdvancedAlertDuxo.this.getCurrencyPair();
                return AdvancedAlertDataState.copy$default(advancedAlertDataState, null, null, null, false, null, (currencyPair == null || (minOrderPriceIncrement = currencyPair.getMinOrderPriceIncrement()) == null) ? null : boxing.boxInt(BigDecimals7.getNumberOfDecimalPlaces(minOrderPriceIncrement)), 31, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.alertStore.streamAdvancedAlert(getEntityId()), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedAlertDuxo.onResume$lambda$5(this.f$0, (AdvancedAlert) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedAlertDuxo.onResume$lambda$6(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        Observable<TechnicalIndicatorConfigList> observableDistinctUntilChanged = this.advancedChartStore.streamTechnicalIndicatorConfigList().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedAlertDuxo.onResume$lambda$7(this.f$0, (TechnicalIndicatorConfigList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(AdvancedAlertDuxo advancedAlertDuxo, AdvancedAlert alert) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        advancedAlertDuxo.applyMutation(new AdvancedAlertDuxo4(alert, null));
        advancedAlertDuxo.submit(new AdvancedAlertEvent.LoadingEvent(false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(AdvancedAlertDuxo advancedAlertDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        advancedAlertDuxo.submit(new AdvancedAlertEvent.ErrorEvent(it));
        advancedAlertDuxo.submit(new AdvancedAlertEvent.LoadingEvent(false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(AdvancedAlertDuxo advancedAlertDuxo, TechnicalIndicatorConfigList technicalIndicatorConfigList) {
        advancedAlertDuxo.applyMutation(new AdvancedAlertDuxo5(technicalIndicatorConfigList, null));
        return Unit.INSTANCE;
    }

    public final void fetchUiResource(final String digestId) {
        Intrinsics.checkNotNullParameter(digestId, "digestId");
        Observable<R> observableSwitchMap = this.alertStore.isDigestExist(digestId).take(1L).switchMap(new Function() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertDuxo.fetchUiResource.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends AlertHubUiResources> apply(Integer count) {
                Intrinsics.checkNotNullParameter(count, "count");
                return count.intValue() == 0 ? AdvancedAlertDuxo.this.alertStore.fetchAlertHubResource(AdvancedAlertDuxo.this.getEntityType()) : AdvancedAlertDuxo.this.alertStore.streamAlertHubResource(digestId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedAlertDuxo.fetchUiResource$lambda$8(this.f$0, (AlertHubUiResources) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchUiResource$lambda$8(AdvancedAlertDuxo advancedAlertDuxo, AlertHubUiResources alertHubUiResources) {
        advancedAlertDuxo.applyMutation(new AdvancedAlertDuxo3(alertHubUiResources, null));
        return Unit.INSTANCE;
    }

    public final void updateSetting(String settingId, String price, boolean enabled) {
        Intrinsics.checkNotNullParameter(settingId, "settingId");
        Intrinsics.checkNotNullParameter(price, "price");
        submit(new AdvancedAlertEvent.LoadingEvent(true));
        LifecycleHost.DefaultImpls.bind$default(this, this.alertStore.updateAdvancedAlert(getEntityId(), getEntityType(), SortingType.CREATED_AT, new ApiUpdateAdvancedAlertSettingItemRequest(settingId, price, enabled), true), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedAlertDuxo.updateSetting$lambda$9(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedAlertDuxo.updateSetting$lambda$10(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateSetting$lambda$9(AdvancedAlertDuxo advancedAlertDuxo) {
        advancedAlertDuxo.submit(new AdvancedAlertEvent.LoadingEvent(false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateSetting$lambda$10(AdvancedAlertDuxo advancedAlertDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        advancedAlertDuxo.submit(new AdvancedAlertEvent.ErrorEvent(it));
        advancedAlertDuxo.submit(new AdvancedAlertEvent.LoadingEvent(false));
        return Unit.INSTANCE;
    }

    public final void deleteSetting(String settingId) {
        Intrinsics.checkNotNullParameter(settingId, "settingId");
        submit(new AdvancedAlertEvent.LoadingEvent(true));
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.alertStore.deleteAdvancedAlert(getEntityId(), getEntityType(), new ApiDeleteAdvancedAlertSettingRequest(CollectionsKt.listOf(new ApiDeleteAdvancedAlertSettingItemRequest(settingId)))), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedAlertDuxo.deleteSetting$lambda$11(this.f$0, (AdvancedAlert) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedAlertDuxo.deleteSetting$lambda$12(this.f$0, (Throwable) obj);
            }
        }, new Function0() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedAlertDuxo.deleteSetting$lambda$13(this.f$0);
            }
        }, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteSetting$lambda$11(AdvancedAlertDuxo advancedAlertDuxo, AdvancedAlert alert) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        advancedAlertDuxo.applyMutation(new AdvancedAlertDuxo2(alert, null));
        advancedAlertDuxo.submit(new AdvancedAlertEvent.LoadingEvent(false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteSetting$lambda$13(AdvancedAlertDuxo advancedAlertDuxo) {
        advancedAlertDuxo.submit(new AdvancedAlertEvent.LoadingEvent(false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteSetting$lambda$12(AdvancedAlertDuxo advancedAlertDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        advancedAlertDuxo.submit(new AdvancedAlertEvent.ErrorEvent(it));
        advancedAlertDuxo.submit(new AdvancedAlertEvent.LoadingEvent(false));
        return Unit.INSTANCE;
    }

    public final void toggleIndicatorAdvancedAlert(AlertHubSettingItem alert) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        submit(new AdvancedAlertEvent.LoadingEvent(true));
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.alertStore.toggleIndicatorAdvancedAlert(getEntityId(), alert.toApiModel().toggle()), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedAlertDuxo.toggleIndicatorAdvancedAlert$lambda$14(this.f$0, (AdvancedAlert) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedAlertDuxo.toggleIndicatorAdvancedAlert$lambda$15(this.f$0, (Throwable) obj);
            }
        }, new Function0() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedAlertDuxo.toggleIndicatorAdvancedAlert$lambda$16(this.f$0);
            }
        }, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleIndicatorAdvancedAlert$lambda$14(AdvancedAlertDuxo advancedAlertDuxo, AdvancedAlert newAlert) {
        Intrinsics.checkNotNullParameter(newAlert, "newAlert");
        advancedAlertDuxo.applyMutation(new AdvancedAlertDuxo6(newAlert, null));
        advancedAlertDuxo.submit(new AdvancedAlertEvent.LoadingEvent(false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleIndicatorAdvancedAlert$lambda$16(AdvancedAlertDuxo advancedAlertDuxo) {
        advancedAlertDuxo.submit(new AdvancedAlertEvent.LoadingEvent(false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleIndicatorAdvancedAlert$lambda$15(AdvancedAlertDuxo advancedAlertDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        advancedAlertDuxo.submit(new AdvancedAlertEvent.ErrorEvent(it));
        advancedAlertDuxo.submit(new AdvancedAlertEvent.LoadingEvent(false));
        return Unit.INSTANCE;
    }

    /* compiled from: AdvancedAlertDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advanced/alert/AdvancedAlertDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertDuxo$updateSelectedSegment$1", m3645f = "AdvancedAlertDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$updateSelectedSegment$1 */
    static final class C83741 extends ContinuationImpl7 implements Function2<AdvancedAlertDataState, Continuation<? super AdvancedAlertDataState>, Object> {
        final /* synthetic */ AlertType $alertType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C83741(AlertType alertType, Continuation<? super C83741> continuation) {
            super(2, continuation);
            this.$alertType = alertType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C83741 c83741 = new C83741(this.$alertType, continuation);
            c83741.L$0 = obj;
            return c83741;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvancedAlertDataState advancedAlertDataState, Continuation<? super AdvancedAlertDataState> continuation) {
            return ((C83741) create(advancedAlertDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AdvancedAlertDataState.copy$default((AdvancedAlertDataState) this.L$0, null, null, this.$alertType, false, null, null, 59, null);
        }
    }

    public final void updateSelectedSegment(AlertType alertType) {
        Intrinsics.checkNotNullParameter(alertType, "alertType");
        applyMutation(new C83741(alertType, null));
    }

    /* compiled from: AdvancedAlertDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advanced/alert/AdvancedAlertDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertDuxo$updateNotificationRelayEnabled$1", m3645f = "AdvancedAlertDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertDuxo$updateNotificationRelayEnabled$1 */
    static final class C83731 extends ContinuationImpl7 implements Function2<AdvancedAlertDataState, Continuation<? super AdvancedAlertDataState>, Object> {
        final /* synthetic */ boolean $isEnabled;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C83731(boolean z, Continuation<? super C83731> continuation) {
            super(2, continuation);
            this.$isEnabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C83731 c83731 = new C83731(this.$isEnabled, continuation);
            c83731.L$0 = obj;
            return c83731;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdvancedAlertDataState advancedAlertDataState, Continuation<? super AdvancedAlertDataState> continuation) {
            return ((C83731) create(advancedAlertDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AdvancedAlertDataState.copy$default((AdvancedAlertDataState) this.L$0, null, null, null, this.$isEnabled, null, null, 55, null);
        }
    }

    public final void updateNotificationRelayEnabled(boolean isEnabled) {
        applyMutation(new C83731(isEnabled, null));
    }

    /* compiled from: AdvancedAlertDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertDuxo;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertFragment$Args;", "<init>", "()V", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AdvancedAlertDuxo, AdvancedAlertFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvancedAlertFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AdvancedAlertFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvancedAlertFragment.Args getArgs(AdvancedAlertDuxo advancedAlertDuxo) {
            return (AdvancedAlertFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, advancedAlertDuxo);
        }
    }
}
