package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.api.ApiOptionsProfitLossChart;
import com.robinhood.models.api.ApiOptionsProfitLossChartRequestParams;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.util.Money;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionsProfitLossChartStore.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006%"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionsProfitLossChartStore;", "Lcom/robinhood/store/Store;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "apiRequestLegListJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams$Leg;", "moneyJsonAdapter", "Lcom/robinhood/models/util/Money;", "hasExactlyOneUnderlying", "Lio/reactivex/Observable;", "", "optionChainId", "Ljava/util/UUID;", "shouldShowProfitLoss", "accountNumber", "", "optionOrderBundle", "Lcom/robinhood/models/ui/OptionOrderBundle;", "getOptionsProfitLossChart", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;", "Lcom/robinhood/models/api/ApiOptionsProfitLossChart;", "getGetOptionsProfitLossChart", "()Lcom/robinhood/android/moria/network/Endpoint;", "Companion", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionsProfitLossChartStore extends Store {
    public static final long CHAIN_THROTTLE_TIMEOUT_MS = 20;
    public static final long DEFAULT_THROTTLE_TIMEOUT_MS = 200;
    private final JsonAdapter<List<ApiOptionsProfitLossChartRequestParams.Leg>> apiRequestLegListJsonAdapter;
    private final Endpoint<ApiOptionsProfitLossChartRequestParams, ApiOptionsProfitLossChart> getOptionsProfitLossChart;
    private final JsonAdapter<Money> moneyJsonAdapter;
    private final OptionChainStore optionChainStore;
    private final OptionPositionStore optionPositionStore;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOptionsProfitLossChart$lambda$3(Long l) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsProfitLossChartStore(OptionChainStore optionChainStore, OptionPositionStore optionPositionStore, OptionsApi optionsApi, StoreBundle storeBundle, LazyMoshi moshi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.optionChainStore = optionChainStore;
        this.optionPositionStore = optionPositionStore;
        Types types = Types.INSTANCE;
        this.apiRequestLegListJsonAdapter = moshi.adapter(new TypeToken<List<? extends ApiOptionsProfitLossChartRequestParams.Leg>>() { // from class: com.robinhood.librobinhood.data.store.OptionsProfitLossChartStore$special$$inlined$getAdapter$1
        }.getType());
        this.moneyJsonAdapter = moshi.adapter(new TypeToken<Money>() { // from class: com.robinhood.librobinhood.data.store.OptionsProfitLossChartStore$special$$inlined$getAdapter$2
        }.getType());
        this.getOptionsProfitLossChart = Endpoint.INSTANCE.create(new OptionsProfitLossChartStore2(optionsApi, this, null), getLogoutKillswitch(), new OptionsProfitLossChartStore3(null), storeBundle.getClock(), new Function1() { // from class: com.robinhood.librobinhood.data.store.OptionsProfitLossChartStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(OptionsProfitLossChartStore.getOptionsProfitLossChart$lambda$3((Long) obj));
            }
        });
    }

    private final Observable<Boolean> hasExactlyOneUnderlying(UUID optionChainId) {
        Observable map = this.optionChainStore.getStreamUiOptionChain().asObservable(optionChainId).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsProfitLossChartStore.hasExactlyOneUnderlying.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(UiOptionChain uiOptionChain) {
                Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
                return Boolean.valueOf(uiOptionChain.getUnderlyings().size() == 1);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<Boolean> shouldShowProfitLoss(String accountNumber, OptionOrderBundle optionOrderBundle) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(optionOrderBundle, "optionOrderBundle");
        ImmutableList<OptionLegBundle> legBundles = optionOrderBundle.getLegBundles();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundles, 10));
        for (OptionLegBundle optionLegBundle : legBundles) {
            arrayList.add(this.optionPositionStore.getOrderPositionEffect(accountNumber, optionLegBundle.getOptionInstrument().getId(), optionLegBundle.getOptionConfigurationBundle().getOptionSide()));
        }
        Observable<Boolean> observableHasExactlyOneUnderlying = hasExactlyOneUnderlying(optionOrderBundle.getOptionChainBundle().getOptionChainId());
        Observable map = ObservablesKt.combineLatest(Observables.INSTANCE, arrayList).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsProfitLossChartStore$shouldShowProfitLoss$noPositionClosingLegsObs$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(List<? extends OrderPositionEffect> orderPositionEffects) {
                Intrinsics.checkNotNullParameter(orderPositionEffects, "orderPositionEffects");
                List<? extends OrderPositionEffect> list = orderPositionEffects;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((OrderPositionEffect) it.next()) == OrderPositionEffect.CLOSE) {
                            z = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(!z);
            }
        });
        ImmutableList<OptionLegBundle> legBundles2 = optionOrderBundle.getLegBundles();
        LinkedHashSet linkedHashSet = legBundles2 != null ? new LinkedHashSet(legBundles2.size()) : new LinkedHashSet();
        Iterator<OptionLegBundle> it = legBundles2.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().getOptionConfigurationBundle().getOptionChainBundle().getOptionChainId());
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        Iterator it2 = setUnmodifiableSet.iterator();
        while (it2.hasNext()) {
            this.optionPositionStore.refresh(false, (UUID) it2.next(), accountNumber);
        }
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(map);
        Observable<Boolean> observableDistinctUntilChanged = observables.combineLatest(map, observableHasExactlyOneUnderlying).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionsProfitLossChartStore.shouldShowProfitLoss.3
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Tuples2<Boolean, Boolean> conditions) {
                Intrinsics.checkNotNullParameter(conditions, "conditions");
                List list = Tuples4.toList(conditions);
                boolean z = true;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Boolean bool = (Boolean) it3.next();
                        Intrinsics.checkNotNull(bool);
                        if (!bool.booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public final Endpoint<ApiOptionsProfitLossChartRequestParams, ApiOptionsProfitLossChart> getGetOptionsProfitLossChart() {
        return this.getOptionsProfitLossChart;
    }
}
