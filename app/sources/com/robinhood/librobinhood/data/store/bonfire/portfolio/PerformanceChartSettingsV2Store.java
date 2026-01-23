package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.portfolio.BenchmarkSelection;
import com.robinhood.android.models.portfolio.PerformanceChartBenchmarkV2;
import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2;
import com.robinhood.android.models.portfolio.api.ApiPerformanceChartSettingsBenchmarkV2;
import com.robinhood.android.models.portfolio.api.ApiPerformanceChartSettingsV2;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartExperiments;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: PerformanceChartSettingsV2Store.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0010H\u0002J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00172\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\n\u001a&\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f \r*\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00120\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2Store;", "Lcom/robinhood/store/Store;", "settingsHelperStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2HelperStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2HelperStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/store/StoreBundle;)V", "persistSelectionsEnabled", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "localActiveBenchmarksRelays", "", "", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "getLocalActiveBenchmarksRelays", "accountNumber", "querySettings", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/portfolio/PerformanceChartSettingsV2;", "chartType", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "updateSettings", "Lkotlinx/coroutines/Job;", "settings", "benchmarkSelections", "", "Lcom/robinhood/android/models/portfolio/BenchmarkSelection;", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class PerformanceChartSettingsV2Store extends Store {
    private final Map<String, BehaviorRelay<Set<String>>> localActiveBenchmarksRelays;
    private final Observable<Boolean> persistSelectionsEnabled;
    private final PerformanceChartSettingsV2Store2 settingsHelperStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceChartSettingsV2Store(PerformanceChartSettingsV2Store2 settingsHelperStore, ExperimentsStore experimentsStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(settingsHelperStore, "settingsHelperStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.settingsHelperStore = settingsHelperStore;
        this.persistSelectionsEnabled = ExperimentsProvider.DefaultImpls.streamVariant$default(experimentsStore, PerformanceChartExperiments.Benchmarking.INSTANCE, PerformanceChartExperiments.Benchmarking.Variants.CONTROL, false, 4, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2Store$persistSelectionsEnabled$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(PerformanceChartExperiments.Benchmarking.Variants it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it == PerformanceChartExperiments.Benchmarking.Variants.MEMBER_2);
            }
        });
        this.localActiveBenchmarksRelays = new LinkedHashMap();
    }

    private final BehaviorRelay<Set<String>> getLocalActiveBenchmarksRelays(String accountNumber) {
        Map<String, BehaviorRelay<Set<String>>> map = this.localActiveBenchmarksRelays;
        BehaviorRelay<Set<String>> behaviorRelayCreateDefault = map.get(accountNumber);
        if (behaviorRelayCreateDefault == null) {
            behaviorRelayCreateDefault = BehaviorRelay.createDefault(SetsKt.emptySet());
            Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
            map.put(accountNumber, behaviorRelayCreateDefault);
        }
        return behaviorRelayCreateDefault;
    }

    public final Flow<PerformanceChartSettingsV2> querySettings(String accountNumber, PerformanceChartType chartType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Observable observableCombineLatest = Observable.combineLatest(this.persistSelectionsEnabled, this.settingsHelperStore.querySettings$lib_store_portfolio_externalDebug(accountNumber, chartType), getLocalActiveBenchmarksRelays(accountNumber), new Function3() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2Store.querySettings.1
            @Override // io.reactivex.functions.Function3
            public final PerformanceChartSettingsV2 apply(Boolean persistSelections, PerformanceChartSettingsV2 settings, Set<String> localBenchmarkSelections) {
                Intrinsics.checkNotNullParameter(persistSelections, "persistSelections");
                Intrinsics.checkNotNullParameter(settings, "settings");
                Intrinsics.checkNotNullParameter(localBenchmarkSelections, "localBenchmarkSelections");
                if (persistSelections.booleanValue()) {
                    return settings;
                }
                List<PerformanceChartBenchmarkV2> benchmarks = settings.getBenchmarks();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(benchmarks, 10));
                for (PerformanceChartBenchmarkV2 performanceChartBenchmarkV2 : benchmarks) {
                    arrayList.add(PerformanceChartBenchmarkV2.copy$default(performanceChartBenchmarkV2, null, null, null, null, localBenchmarkSelections.contains(performanceChartBenchmarkV2.getId()), null, 47, null));
                }
                return PerformanceChartSettingsV2.copy$default(settings, null, null, arrayList, null, 11, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        return Context7.buffer$default(RxConvert.asFlow(observableCombineLatest), Integer.MAX_VALUE, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Job updateSettings$default(PerformanceChartSettingsV2Store performanceChartSettingsV2Store, PerformanceChartSettingsV2 performanceChartSettingsV2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return performanceChartSettingsV2Store.updateSettings(performanceChartSettingsV2, list);
    }

    public final Job updateSettings(PerformanceChartSettingsV2 settings, List<BenchmarkSelection> benchmarkSelections) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(settings, "settings");
        if (benchmarkSelections != null) {
            List<BenchmarkSelection> list = benchmarkSelections;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((BenchmarkSelection) it.next()).toUpdateModel());
            }
        } else {
            List<PerformanceChartBenchmarkV2> benchmarks = settings.getBenchmarks();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(benchmarks, 10));
            Iterator<T> it2 = benchmarks.iterator();
            while (it2.hasNext()) {
                arrayList.add(((PerformanceChartBenchmarkV2) it2.next()).toUpdateModel());
            }
        }
        BehaviorRelay<Set<String>> localActiveBenchmarksRelays = getLocalActiveBenchmarksRelays(settings.getAccountNumber());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((ApiPerformanceChartSettingsBenchmarkV2) obj).is_selected()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((ApiPerformanceChartSettingsBenchmarkV2) it3.next()).getId());
        }
        localActiveBenchmarksRelays.accept(CollectionsKt.toSet(arrayList3));
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C346713(arrayList, settings, null), 3, null);
    }

    /* compiled from: PerformanceChartSettingsV2Store.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2Store$updateSettings$3", m3645f = "PerformanceChartSettingsV2Store.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2Store$updateSettings$3 */
    static final class C346713 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PerformanceChartSettingsV2 $settings;
        final /* synthetic */ List<ApiPerformanceChartSettingsBenchmarkV2> $unifiedBenchmarks;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346713(List<ApiPerformanceChartSettingsBenchmarkV2> list, PerformanceChartSettingsV2 performanceChartSettingsV2, Continuation<? super C346713> continuation) {
            super(2, continuation);
            this.$unifiedBenchmarks = list;
            this.$settings = performanceChartSettingsV2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PerformanceChartSettingsV2Store.this.new C346713(this.$unifiedBenchmarks, this.$settings, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C346713) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            List<ApiPerformanceChartSettingsBenchmarkV2> list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable observable = PerformanceChartSettingsV2Store.this.persistSelectionsEnabled;
                Intrinsics.checkNotNullExpressionValue(observable, "access$getPersistSelectionsEnabled$p(...)");
                this.label = 1;
                obj = RxAwait3.awaitFirst(observable, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                list = this.$unifiedBenchmarks;
            } else {
                List<ApiPerformanceChartSettingsBenchmarkV2> list2 = this.$unifiedBenchmarks;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(ApiPerformanceChartSettingsBenchmarkV2.copy$default((ApiPerformanceChartSettingsBenchmarkV2) it.next(), null, false, null, 5, null));
                }
                list = arrayList;
            }
            PerformanceChartSettingsV2Store.this.settingsHelperStore.updateSettings$lib_store_portfolio_externalDebug(this.$settings.getAccountNumber(), this.$settings.getChartType().getServerValue(), new ApiPerformanceChartSettingsV2(list, this.$settings.getChartStyle()));
            return Unit.INSTANCE;
        }
    }
}
