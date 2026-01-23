package com.robinhood.android.advancedchart.config;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advanced.chart.IndicatorState;
import com.robinhood.android.advanced.chart.IndicatorState4;
import com.robinhood.android.advancedchart.AdvancedChartIndicatorsAnalyticsCommonData;
import com.robinhood.android.advancedchart.AdvancedChartLoggings3;
import com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorViewState2;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartEditIndicatorFragmentKey;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartEditIndicatorLaunchMode;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.shared.models.advancedChart.p386db.TechnicalIndicatorConfigList;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: AdvancedChartEditIndicatorDuxo.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001%B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0015J\u0006\u0010\u001c\u001a\u00020\u0015J\u0016\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0016\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartEditIndicatorDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartEditIndicatorViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "advancedChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/utils/moshi/LazyMoshi;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "indicatorsJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "onCreate", "", "setConfigAttribute", "newValue", "Ljava/math/BigDecimal;", "position", "", "validateAndSaveApiTechnicalIndicator", "deleteApiTechnicalIndicator", "getIndicatorAnalyticsData", "Lcom/robinhood/android/advancedchart/AdvancedChartIndicatorsAnalyticsCommonData;", "indicators", "logIndicatorUpdateError", "instrumentId", "Ljava/util/UUID;", "message", "", "Companion", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AdvancedChartEditIndicatorDuxo extends OldBaseDuxo<AdvancedChartEditIndicatorViewState> implements HasSavedState {
    private final AdvancedChartStore advancedChartStore;
    private final EventLogger eventLogger;
    private final JsonAdapter<List<ApiTechnicalIndicator>> indicatorsJsonAdapter;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public AdvancedChartEditIndicatorDuxo(AdvancedChartStore advancedChartStore, EventLogger eventLogger, LazyMoshi moshi, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(advancedChartStore, "advancedChartStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new AdvancedChartEditIndicatorViewState(AdvancedChartEditIndicatorDuxo2.getConfigAttributeList(((AdvancedChartEditIndicatorFragmentKey) companion.getArgs(savedStateHandle)).getLaunchMode()), null, AdvancedChartEditIndicatorDuxo2.getIndicatorType(((AdvancedChartEditIndicatorFragmentKey) companion.getArgs(savedStateHandle)).getLaunchMode()), null, 10, null), null, 2, 0 == true ? 1 : 0);
        this.advancedChartStore = advancedChartStore;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
        Types types = Types.INSTANCE;
        this.indicatorsJsonAdapter = moshi.adapter(new TypeToken<List<? extends ApiTechnicalIndicator>>() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorDuxo$special$$inlined$getAdapter$1
        }.getType());
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Observable<TechnicalIndicatorConfigList> observableDistinctUntilChanged = this.advancedChartStore.streamTechnicalIndicatorConfigList().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartEditIndicatorDuxo.onCreate$lambda$1(this.f$0, (TechnicalIndicatorConfigList) obj);
            }
        });
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorDuxo$onCreate$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((AdvancedChartEditIndicatorViewState) it).getIndicatorStates());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((AdvancedChartEditIndicatorDuxo$onCreate$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartEditIndicatorDuxo.onCreate$lambda$4(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(AdvancedChartEditIndicatorDuxo advancedChartEditIndicatorDuxo, final TechnicalIndicatorConfigList technicalIndicatorConfigList) {
        advancedChartEditIndicatorDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartEditIndicatorDuxo.onCreate$lambda$1$lambda$0(technicalIndicatorConfigList, (AdvancedChartEditIndicatorViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvancedChartEditIndicatorViewState onCreate$lambda$1$lambda$0(TechnicalIndicatorConfigList technicalIndicatorConfigList, AdvancedChartEditIndicatorViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AdvancedChartEditIndicatorViewState.copy$default(applyMutation, null, IndicatorState4.toIndicatorStates(technicalIndicatorConfigList.getTechnicalIndicatorConfigs()), null, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(AdvancedChartEditIndicatorDuxo advancedChartEditIndicatorDuxo, List list) {
        if (((AdvancedChartEditIndicatorFragmentKey) INSTANCE.getArgs((HasSavedState) advancedChartEditIndicatorDuxo)).getLaunchMode() instanceof AdvancedChartEditIndicatorLaunchMode.Editing) {
            EventLogger eventLogger = advancedChartEditIndicatorDuxo.eventLogger;
            Intrinsics.checkNotNull(list);
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((IndicatorState) it.next()).getApiTechnicalIndicator());
            }
            AdvancedChartLoggings3.logEditExistingIndicator(eventLogger, advancedChartEditIndicatorDuxo.getIndicatorAnalyticsData(arrayList));
        }
        return Unit.INSTANCE;
    }

    public final void setConfigAttribute(final BigDecimal newValue, final int position) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        applyMutation(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartEditIndicatorDuxo.setConfigAttribute$lambda$5(position, newValue, (AdvancedChartEditIndicatorViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvancedChartEditIndicatorViewState setConfigAttribute$lambda$5(int i, BigDecimal bigDecimal, AdvancedChartEditIndicatorViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        List mutableList = CollectionsKt.toMutableList((Collection) applyMutation.getAttributeList());
        mutableList.set(i, TechnicalIndicatorConfigAttribute.copy$default(applyMutation.getAttributeList().get(i), 0, bigDecimal, null, 5, null));
        return AdvancedChartEditIndicatorViewState.copy$default(applyMutation, mutableList, null, null, null, 14, null);
    }

    public final void validateAndSaveApiTechnicalIndicator() {
        Observable<R> observableSwitchMapSingle = getStates().take(1L).switchMapSingle(new Function() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorDuxo.validateAndSaveApiTechnicalIndicator.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends AdvancedChartEditIndicatorViewState2> apply(AdvancedChartEditIndicatorViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                final List<ApiTechnicalIndicator> updatedConfig = state.getUpdatedConfig(((AdvancedChartEditIndicatorFragmentKey) AdvancedChartEditIndicatorDuxo.INSTANCE.getArgs((HasSavedState) AdvancedChartEditIndicatorDuxo.this)).getLaunchMode());
                Single<Unit> singleUpdateIndicatorsSingle = AdvancedChartEditIndicatorDuxo.this.advancedChartStore.updateIndicatorsSingle(updatedConfig, Instant.now().toEpochMilli());
                final AdvancedChartEditIndicatorDuxo advancedChartEditIndicatorDuxo = AdvancedChartEditIndicatorDuxo.this;
                return singleUpdateIndicatorsSingle.map(new Function() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorDuxo.validateAndSaveApiTechnicalIndicator.1.1
                    @Override // io.reactivex.functions.Function
                    public final AdvancedChartEditIndicatorViewState2 apply(Unit it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (((AdvancedChartEditIndicatorFragmentKey) AdvancedChartEditIndicatorDuxo.INSTANCE.getArgs((HasSavedState) advancedChartEditIndicatorDuxo)).getLaunchMode() instanceof AdvancedChartEditIndicatorLaunchMode.Adding) {
                            AdvancedChartLoggings3.logNewIndicatorAdded(advancedChartEditIndicatorDuxo.eventLogger, advancedChartEditIndicatorDuxo.getIndicatorAnalyticsData(updatedConfig));
                        }
                        return AdvancedChartEditIndicatorViewState2.Success.INSTANCE;
                    }
                }).onErrorReturn(new Function() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorDuxo.validateAndSaveApiTechnicalIndicator.1.2
                    @Override // io.reactivex.functions.Function
                    public final AdvancedChartEditIndicatorViewState2 apply(Throwable throwable) {
                        Intrinsics.checkNotNullParameter(throwable, "throwable");
                        return new AdvancedChartEditIndicatorViewState2.NetworkError(throwable);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartEditIndicatorDuxo.validateAndSaveApiTechnicalIndicator$lambda$7(this.f$0, (AdvancedChartEditIndicatorViewState2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateAndSaveApiTechnicalIndicator$lambda$7(AdvancedChartEditIndicatorDuxo advancedChartEditIndicatorDuxo, final AdvancedChartEditIndicatorViewState2 advancedChartEditIndicatorViewState2) {
        advancedChartEditIndicatorDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartEditIndicatorDuxo.validateAndSaveApiTechnicalIndicator$lambda$7$lambda$6(advancedChartEditIndicatorViewState2, (AdvancedChartEditIndicatorViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvancedChartEditIndicatorViewState validateAndSaveApiTechnicalIndicator$lambda$7$lambda$6(AdvancedChartEditIndicatorViewState2 advancedChartEditIndicatorViewState2, AdvancedChartEditIndicatorViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AdvancedChartEditIndicatorViewState.copy$default(applyMutation, null, null, null, new UiEvent(advancedChartEditIndicatorViewState2), 7, null);
    }

    public final void deleteApiTechnicalIndicator() {
        Observable<R> observableSwitchMapSingle = getStates().take(1L).switchMapSingle(new Function() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorDuxo.deleteApiTechnicalIndicator.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends AdvancedChartEditIndicatorViewState2> apply(AdvancedChartEditIndicatorViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                AdvancedChartEditIndicatorLaunchMode launchMode = ((AdvancedChartEditIndicatorFragmentKey) AdvancedChartEditIndicatorDuxo.INSTANCE.getArgs((HasSavedState) AdvancedChartEditIndicatorDuxo.this)).getLaunchMode();
                Intrinsics.checkNotNull(launchMode, "null cannot be cast to non-null type com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartEditIndicatorLaunchMode.Editing");
                final List<ApiTechnicalIndicator> deletedConfig = state.getDeletedConfig(((AdvancedChartEditIndicatorLaunchMode.Editing) launchMode).getApiTechnicalIndicator().getId());
                Single<Unit> singleUpdateIndicatorsSingle = AdvancedChartEditIndicatorDuxo.this.advancedChartStore.updateIndicatorsSingle(deletedConfig, Instant.now().toEpochMilli());
                final AdvancedChartEditIndicatorDuxo advancedChartEditIndicatorDuxo = AdvancedChartEditIndicatorDuxo.this;
                return singleUpdateIndicatorsSingle.map(new Function() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorDuxo.deleteApiTechnicalIndicator.1.1
                    @Override // io.reactivex.functions.Function
                    public final AdvancedChartEditIndicatorViewState2 apply(Unit it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        AdvancedChartLoggings3.logIndicatorRemoved(advancedChartEditIndicatorDuxo.eventLogger, advancedChartEditIndicatorDuxo.getIndicatorAnalyticsData(deletedConfig));
                        return AdvancedChartEditIndicatorViewState2.Success.INSTANCE;
                    }
                }).onErrorReturn(new Function() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorDuxo.deleteApiTechnicalIndicator.1.2
                    @Override // io.reactivex.functions.Function
                    public final AdvancedChartEditIndicatorViewState2 apply(Throwable throwable) {
                        Intrinsics.checkNotNullParameter(throwable, "throwable");
                        return new AdvancedChartEditIndicatorViewState2.NetworkError(throwable);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartEditIndicatorDuxo.deleteApiTechnicalIndicator$lambda$9(this.f$0, (AdvancedChartEditIndicatorViewState2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteApiTechnicalIndicator$lambda$9(AdvancedChartEditIndicatorDuxo advancedChartEditIndicatorDuxo, final AdvancedChartEditIndicatorViewState2 advancedChartEditIndicatorViewState2) {
        advancedChartEditIndicatorDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartEditIndicatorDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartEditIndicatorDuxo.deleteApiTechnicalIndicator$lambda$9$lambda$8(advancedChartEditIndicatorViewState2, (AdvancedChartEditIndicatorViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvancedChartEditIndicatorViewState deleteApiTechnicalIndicator$lambda$9$lambda$8(AdvancedChartEditIndicatorViewState2 advancedChartEditIndicatorViewState2, AdvancedChartEditIndicatorViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AdvancedChartEditIndicatorViewState.copy$default(applyMutation, null, null, null, new UiEvent(advancedChartEditIndicatorViewState2), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdvancedChartIndicatorsAnalyticsCommonData getIndicatorAnalyticsData(List<? extends ApiTechnicalIndicator> indicators) {
        Companion companion = INSTANCE;
        UUID instrumentId = ((AdvancedChartEditIndicatorFragmentKey) companion.getArgs((HasSavedState) this)).getInstrumentId();
        ApiTechnicalIndicator.Type indicatorType = AdvancedChartEditIndicatorDuxo2.getIndicatorType(((AdvancedChartEditIndicatorFragmentKey) companion.getArgs((HasSavedState) this)).getLaunchMode());
        String json = this.indicatorsJsonAdapter.toJson(indicators);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return new AdvancedChartIndicatorsAnalyticsCommonData(instrumentId, indicatorType, json);
    }

    public final void logIndicatorUpdateError(UUID instrumentId, String message) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(message, "message");
        AdvancedChartLoggings3.logIndicatorUpdateError(this.eventLogger, instrumentId, message);
    }

    /* compiled from: AdvancedChartEditIndicatorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartEditIndicatorDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartEditIndicatorDuxo;", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartEditIndicatorFragmentKey;", "<init>", "()V", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AdvancedChartEditIndicatorDuxo, AdvancedChartEditIndicatorFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvancedChartEditIndicatorFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (AdvancedChartEditIndicatorFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvancedChartEditIndicatorFragmentKey getArgs(AdvancedChartEditIndicatorDuxo advancedChartEditIndicatorDuxo) {
            return (AdvancedChartEditIndicatorFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, advancedChartEditIndicatorDuxo);
        }
    }
}
