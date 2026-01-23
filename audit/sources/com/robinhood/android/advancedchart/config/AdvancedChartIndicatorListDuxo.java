package com.robinhood.android.advancedchart.config;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advanced.chart.AdvancedChartExperiments;
import com.robinhood.android.advanced.chart.IndicatorState;
import com.robinhood.android.advanced.chart.IndicatorState4;
import com.robinhood.android.advanced.chart.IndicatorStateList;
import com.robinhood.android.advancedchart.AdvancedChartIndicatorsAnalyticsCommonData;
import com.robinhood.android.advancedchart.AdvancedChartLoggings3;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartIndicatorListFragmentKey;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.shared.models.advancedChart.p386db.TechnicalIndicatorConfigList;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
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

/* compiled from: AdvancedChartIndicatorListDuxo.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\"B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\u00172\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "advancedChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/utils/moshi/LazyMoshi;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "indicatorsJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "onCreate", "", "toggleIndicatorState", "id", "", "deleteIndicatorState", "reorderIndicatorState", "newPosition", "", "updateIndicatorStatesWithStoreScope", "newIndicatorStates", "Lcom/robinhood/android/advanced/chart/IndicatorState;", "Companion", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AdvancedChartIndicatorListDuxo extends OldBaseDuxo<AdvancedChartIndicatorListViewState> implements HasSavedState {
    private final AdvancedChartStore advancedChartStore;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final JsonAdapter<List<ApiTechnicalIndicator>> indicatorsJsonAdapter;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdvancedChartIndicatorListDuxo(AdvancedChartStore advancedChartStore, ExperimentsStore experimentsStore, EventLogger eventLogger, LazyMoshi moshi, SavedStateHandle savedStateHandle) {
        super(new AdvancedChartIndicatorListViewState(null, null, 3, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(advancedChartStore, "advancedChartStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.advancedChartStore = advancedChartStore;
        this.experimentsStore = experimentsStore;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
        Types types = Types.INSTANCE;
        this.indicatorsJsonAdapter = moshi.adapter(new TypeToken<List<? extends ApiTechnicalIndicator>>() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListDuxo$special$$inlined$getAdapter$1
        }.getType());
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Observable<TechnicalIndicatorConfigList> observableDistinctUntilChanged = this.advancedChartStore.streamTechnicalIndicatorConfigList().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartIndicatorListDuxo.onCreate$lambda$1(this.f$0, (TechnicalIndicatorConfigList) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, AdvancedChartExperiments.ChartsIndicatorImprovementP3.INSTANCE, AdvancedChartExperiments.ChartsIndicatorImprovementP3.Variant.CONTROL, false, 4, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartIndicatorListDuxo.onCreate$lambda$3(this.f$0, (AdvancedChartExperiments.ChartsIndicatorImprovementP3.Variant) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(AdvancedChartIndicatorListDuxo advancedChartIndicatorListDuxo, final TechnicalIndicatorConfigList technicalIndicatorConfigList) {
        advancedChartIndicatorListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartIndicatorListDuxo.onCreate$lambda$1$lambda$0(technicalIndicatorConfigList, (AdvancedChartIndicatorListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvancedChartIndicatorListViewState onCreate$lambda$1$lambda$0(TechnicalIndicatorConfigList technicalIndicatorConfigList, AdvancedChartIndicatorListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        IndicatorStateList indicatorStateList = applyMutation.getIndicatorStateList();
        Intrinsics.checkNotNull(technicalIndicatorConfigList);
        return AdvancedChartIndicatorListViewState.copy$default(applyMutation, indicatorStateList.getNewIndicatorStateListWith(technicalIndicatorConfigList), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(AdvancedChartIndicatorListDuxo advancedChartIndicatorListDuxo, final AdvancedChartExperiments.ChartsIndicatorImprovementP3.Variant variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        advancedChartIndicatorListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartIndicatorListDuxo.onCreate$lambda$3$lambda$2(variant, (AdvancedChartIndicatorListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvancedChartIndicatorListViewState onCreate$lambda$3$lambda$2(AdvancedChartExperiments.ChartsIndicatorImprovementP3.Variant variant, AdvancedChartIndicatorListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AdvancedChartIndicatorListViewState.copy$default(applyMutation, null, variant, 1, null);
    }

    public final void toggleIndicatorState(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Observable observableTake = getStates().map(new Function() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListDuxo.toggleIndicatorState.1
            @Override // io.reactivex.functions.Function
            public final IndicatorStateList apply(AdvancedChartIndicatorListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getIndicatorStateList();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartIndicatorListDuxo.toggleIndicatorState$lambda$6(this.f$0, id, (IndicatorStateList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleIndicatorState$lambda$6(AdvancedChartIndicatorListDuxo advancedChartIndicatorListDuxo, String str, final IndicatorStateList indicatorStateList) {
        List<IndicatorState> indicatorStates = indicatorStateList.getIndicatorStates();
        Iterator<IndicatorState> it = indicatorStates.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().getId(), str)) {
                break;
            }
            i++;
        }
        IndicatorState indicatorState = indicatorStates.get(i);
        final List mutableList = CollectionsKt.toMutableList((Collection) indicatorStates);
        mutableList.set(i, indicatorState.toggle());
        long epochMilli = Instant.now().toEpochMilli();
        advancedChartIndicatorListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartIndicatorListDuxo.toggleIndicatorState$lambda$6$lambda$5(indicatorStateList, mutableList, (AdvancedChartIndicatorListViewState) obj);
            }
        });
        advancedChartIndicatorListDuxo.advancedChartStore.updateIndicatorConfigsWithStoreScope(IndicatorState4.toIndicatorConfigs(mutableList), epochMilli);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvancedChartIndicatorListViewState toggleIndicatorState$lambda$6$lambda$5(IndicatorStateList indicatorStateList, List list, AdvancedChartIndicatorListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AdvancedChartIndicatorListViewState.copy$default(applyMutation, IndicatorStateList.copy$default(indicatorStateList, list, 0L, 2, null), null, 2, null);
    }

    public final void deleteIndicatorState(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Observable observableTake = getStates().map(new Function() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListDuxo.deleteIndicatorState.1
            @Override // io.reactivex.functions.Function
            public final IndicatorStateList apply(AdvancedChartIndicatorListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getIndicatorStateList();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartIndicatorListDuxo.deleteIndicatorState$lambda$10(this.f$0, id, (IndicatorStateList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteIndicatorState$lambda$10(AdvancedChartIndicatorListDuxo advancedChartIndicatorListDuxo, final String str, IndicatorStateList indicatorStateList) {
        ApiTechnicalIndicator.Type type2;
        Object next;
        ApiTechnicalIndicator apiTechnicalIndicator;
        List<IndicatorState> mutableList = CollectionsKt.toMutableList((Collection) indicatorStateList.getIndicatorStates());
        List<IndicatorState> list = mutableList;
        Iterator<T> it = list.iterator();
        while (true) {
            type2 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((IndicatorState) next).getId(), str)) {
                break;
            }
        }
        IndicatorState indicatorState = (IndicatorState) next;
        if (indicatorState != null && (apiTechnicalIndicator = indicatorState.getApiTechnicalIndicator()) != null) {
            type2 = apiTechnicalIndicator.getType();
        }
        CollectionsKt.removeAll((List) mutableList, new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AdvancedChartIndicatorListDuxo.deleteIndicatorState$lambda$10$lambda$8(str, (IndicatorState) obj));
            }
        });
        advancedChartIndicatorListDuxo.updateIndicatorStatesWithStoreScope(mutableList);
        UUID instrumentId = ((AdvancedChartIndicatorListFragmentKey) INSTANCE.getArgs((HasSavedState) advancedChartIndicatorListDuxo)).getInstrumentId();
        if (type2 == null) {
            type2 = ApiTechnicalIndicator.Type.UNKNOWN;
        }
        JsonAdapter<List<ApiTechnicalIndicator>> jsonAdapter = advancedChartIndicatorListDuxo.indicatorsJsonAdapter;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((IndicatorState) it2.next()).getApiTechnicalIndicator());
        }
        String json = jsonAdapter.toJson(arrayList);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        AdvancedChartLoggings3.logIndicatorRemoved(advancedChartIndicatorListDuxo.eventLogger, new AdvancedChartIndicatorsAnalyticsCommonData(instrumentId, type2, json));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deleteIndicatorState$lambda$10$lambda$8(String str, IndicatorState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getId(), str);
    }

    public final void reorderIndicatorState(final String id, final int newPosition) {
        Intrinsics.checkNotNullParameter(id, "id");
        Observable observableTake = getStates().map(new Function() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListDuxo.reorderIndicatorState.1
            @Override // io.reactivex.functions.Function
            public final IndicatorStateList apply(AdvancedChartIndicatorListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getIndicatorStateList();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartIndicatorListDuxo.reorderIndicatorState$lambda$12(newPosition, this, id, (IndicatorStateList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reorderIndicatorState$lambda$12(int i, AdvancedChartIndicatorListDuxo advancedChartIndicatorListDuxo, String str, IndicatorStateList indicatorStateList) {
        List<IndicatorState> mutableList = CollectionsKt.toMutableList((Collection) indicatorStateList.getIndicatorStates());
        Iterator<IndicatorState> it = mutableList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().getId(), str)) {
                break;
            }
            i2++;
        }
        if (i < 0 || i2 < 0 || i >= mutableList.size() || i == i2) {
            return Unit.INSTANCE;
        }
        mutableList.add(i, mutableList.remove(i2));
        advancedChartIndicatorListDuxo.updateIndicatorStatesWithStoreScope(mutableList);
        return Unit.INSTANCE;
    }

    private final void updateIndicatorStatesWithStoreScope(final List<IndicatorState> newIndicatorStates) {
        final long epochMilli = Instant.now().toEpochMilli();
        applyMutation(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartIndicatorListDuxo.updateIndicatorStatesWithStoreScope$lambda$13(newIndicatorStates, epochMilli, (AdvancedChartIndicatorListViewState) obj);
            }
        });
        this.advancedChartStore.updateIndicatorConfigsWithStoreScope(IndicatorState4.toIndicatorConfigs(newIndicatorStates), epochMilli);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvancedChartIndicatorListViewState updateIndicatorStatesWithStoreScope$lambda$13(List list, long j, AdvancedChartIndicatorListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AdvancedChartIndicatorListViewState.copy$default(applyMutation, new IndicatorStateList(list, j), null, 2, null);
    }

    /* compiled from: AdvancedChartIndicatorListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListDuxo;", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartIndicatorListFragmentKey;", "<init>", "()V", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AdvancedChartIndicatorListDuxo, AdvancedChartIndicatorListFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvancedChartIndicatorListFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (AdvancedChartIndicatorListFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AdvancedChartIndicatorListFragmentKey getArgs(AdvancedChartIndicatorListDuxo advancedChartIndicatorListDuxo) {
            return (AdvancedChartIndicatorListFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, advancedChartIndicatorListDuxo);
        }
    }
}
