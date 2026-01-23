package com.robinhood.android.advanced.alert.alerthub;

import com.robinhood.android.advanced.chart.IndicatorState;
import com.robinhood.android.advanced.chart.IndicatorState4;
import com.robinhood.android.advanced.chart.IndicatorStateList;
import com.robinhood.android.brokeragecontent.BrokerageDisclosure;
import com.robinhood.android.brokeragecontent.BrokerageResource2;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore;
import com.robinhood.models.advanced.alert.p302db.AlertHubUiResources;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.models.advancedChart.p386db.TechnicalIndicatorConfigList;
import com.robinhood.shared.store.user.UserStore;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: AlertHubIndicatorListDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\fJ\u0016\u0010\u0015\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthub/AlertHubIndicatorListDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/advanced/alert/alerthub/AlertHubIndicatorListViewState;", "advancedChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore;", "alertStore", "Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/instrument/AdvancedChartStore;Lcom/robinhood/librobinhood/data/store/alert/AdvancedAlertStore;Lcom/robinhood/shared/store/user/UserStore;)V", "onCreate", "", "onResume", "deleteIndicatorState", "id", "", "reorderIndicatorState", "newPosition", "", "fetchUiResource", "updateIndicatorStatesWithStoreScope", "newIndicatorStates", "", "Lcom/robinhood/android/advanced/chart/IndicatorState;", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AlertHubIndicatorListDuxo extends OldBaseDuxo<AlertHubIndicatorListViewState> {
    public static final int $stable = 8;
    private final AdvancedChartStore advancedChartStore;
    private final AdvancedAlertStore alertStore;
    private final UserStore userStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AlertHubIndicatorListDuxo(AdvancedChartStore advancedChartStore, AdvancedAlertStore alertStore, UserStore userStore) {
        super(new AlertHubIndicatorListViewState(null, null, null, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(advancedChartStore, "advancedChartStore");
        Intrinsics.checkNotNullParameter(alertStore, "alertStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        this.advancedChartStore = advancedChartStore;
        this.alertStore = alertStore;
        this.userStore = userStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Observable<R> map = this.userStore.getUser().map(new Function() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final String apply(User it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return BrokerageResource2.getContentfulId(BrokerageDisclosure.ADVANCED_CHART, it.getOrigin().getLocality());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubIndicatorListDuxo.onCreate$lambda$1(this.f$0, (String) obj);
            }
        });
        Observable<TechnicalIndicatorConfigList> observableDistinctUntilChanged = this.advancedChartStore.streamTechnicalIndicatorConfigList().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubIndicatorListDuxo.onCreate$lambda$3(this.f$0, (TechnicalIndicatorConfigList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(AlertHubIndicatorListDuxo alertHubIndicatorListDuxo, final String str) {
        alertHubIndicatorListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubIndicatorListDuxo.onCreate$lambda$1$lambda$0(str, (AlertHubIndicatorListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertHubIndicatorListViewState onCreate$lambda$1$lambda$0(String str, AlertHubIndicatorListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AlertHubIndicatorListViewState.copy$default(applyMutation, str, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(AlertHubIndicatorListDuxo alertHubIndicatorListDuxo, final TechnicalIndicatorConfigList technicalIndicatorConfigList) {
        alertHubIndicatorListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubIndicatorListDuxo.onCreate$lambda$3$lambda$2(technicalIndicatorConfigList, (AlertHubIndicatorListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertHubIndicatorListViewState onCreate$lambda$3$lambda$2(TechnicalIndicatorConfigList technicalIndicatorConfigList, AlertHubIndicatorListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        IndicatorStateList indicatorStateList = applyMutation.getIndicatorStateList();
        Intrinsics.checkNotNull(technicalIndicatorConfigList);
        return AlertHubIndicatorListViewState.copy$default(applyMutation, null, indicatorStateList.getNewIndicatorStateListWith(technicalIndicatorConfigList), null, 5, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        fetchUiResource();
    }

    public final void deleteIndicatorState(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Observable observableTake = getStates().map(new Function() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListDuxo.deleteIndicatorState.1
            @Override // io.reactivex.functions.Function
            public final IndicatorStateList apply(AlertHubIndicatorListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getIndicatorStateList();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubIndicatorListDuxo.deleteIndicatorState$lambda$5(this.f$0, id, (IndicatorStateList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteIndicatorState$lambda$5(AlertHubIndicatorListDuxo alertHubIndicatorListDuxo, final String str, IndicatorStateList indicatorStateList) {
        List<IndicatorState> mutableList = CollectionsKt.toMutableList((Collection) indicatorStateList.getIndicatorStates());
        CollectionsKt.removeAll((List) mutableList, new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AlertHubIndicatorListDuxo.deleteIndicatorState$lambda$5$lambda$4(str, (IndicatorState) obj));
            }
        });
        alertHubIndicatorListDuxo.updateIndicatorStatesWithStoreScope(mutableList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deleteIndicatorState$lambda$5$lambda$4(String str, IndicatorState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getId(), str);
    }

    public final void reorderIndicatorState(final String id, final int newPosition) {
        Intrinsics.checkNotNullParameter(id, "id");
        Observable observableTake = getStates().map(new Function() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListDuxo.reorderIndicatorState.1
            @Override // io.reactivex.functions.Function
            public final IndicatorStateList apply(AlertHubIndicatorListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getIndicatorStateList();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubIndicatorListDuxo.reorderIndicatorState$lambda$7(newPosition, this, id, (IndicatorStateList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reorderIndicatorState$lambda$7(int i, AlertHubIndicatorListDuxo alertHubIndicatorListDuxo, String str, IndicatorStateList indicatorStateList) {
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
        if (i < 0 || i >= mutableList.size() || i == i2) {
            return Unit.INSTANCE;
        }
        mutableList.add(i, mutableList.remove(i2));
        alertHubIndicatorListDuxo.updateIndicatorStatesWithStoreScope(mutableList);
        return Unit.INSTANCE;
    }

    public final void fetchUiResource() {
        LifecycleHost.DefaultImpls.bind$default(this, this.alertStore.streamFirstAlertHubResource(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubIndicatorListDuxo.fetchUiResource$lambda$9(this.f$0, (AlertHubUiResources) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchUiResource$lambda$9(AlertHubIndicatorListDuxo alertHubIndicatorListDuxo, final AlertHubUiResources uiResource) {
        Intrinsics.checkNotNullParameter(uiResource, "uiResource");
        alertHubIndicatorListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubIndicatorListDuxo.fetchUiResource$lambda$9$lambda$8(uiResource, (AlertHubIndicatorListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertHubIndicatorListViewState fetchUiResource$lambda$9$lambda$8(AlertHubUiResources alertHubUiResources, AlertHubIndicatorListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AlertHubIndicatorListViewState.copy$default(applyMutation, null, null, alertHubUiResources, 3, null);
    }

    private final void updateIndicatorStatesWithStoreScope(final List<IndicatorState> newIndicatorStates) {
        final long epochMilli = Instant.now().toEpochMilli();
        applyMutation(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubIndicatorListDuxo.updateIndicatorStatesWithStoreScope$lambda$10(newIndicatorStates, epochMilli, (AlertHubIndicatorListViewState) obj);
            }
        });
        this.advancedChartStore.updateIndicatorConfigsWithStoreScope(IndicatorState4.toIndicatorConfigs(newIndicatorStates), epochMilli);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertHubIndicatorListViewState updateIndicatorStatesWithStoreScope$lambda$10(List list, long j, AlertHubIndicatorListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AlertHubIndicatorListViewState.copy$default(applyMutation, null, new IndicatorStateList(list, j), null, 5, null);
    }
}
