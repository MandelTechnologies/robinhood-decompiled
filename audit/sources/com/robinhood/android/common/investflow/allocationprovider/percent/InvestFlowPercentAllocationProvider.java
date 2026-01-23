package com.robinhood.android.common.investflow.allocationprovider.percent;

import com.robinhood.android.common.investflow.allocationprovider.IllegalAllocationException;
import com.robinhood.android.common.investflow.allocationprovider.InvestFlowAllocationProvider;
import com.robinhood.investflow.models.api.allocation.ApiInvestFlowPercentAllocationResponse;
import com.robinhood.librobinhood.data.store.bonfire.investflow.InvestFlowPercentAllocationStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.util.Money;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: InvestFlowPercentAllocationProvider.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00030\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/investflow/allocationprovider/percent/InvestFlowPercentAllocationProvider;", "Lcom/robinhood/android/common/investflow/allocationprovider/InvestFlowAllocationProvider;", "assetWeights", "", "Ljava/util/UUID;", "", "percentAllocationStore", "Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowPercentAllocationStore;", "<init>", "(Ljava/util/Map;Lcom/robinhood/librobinhood/data/store/bonfire/investflow/InvestFlowPercentAllocationStore;)V", "getSplit", "Lio/reactivex/Single;", "Lcom/robinhood/models/db/Instrument;", "Lcom/robinhood/models/util/Money;", "totalAmount", "instruments", "", "feature-lib-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class InvestFlowPercentAllocationProvider implements InvestFlowAllocationProvider {
    private final Map<UUID, Float> assetWeights;
    private final InvestFlowPercentAllocationStore percentAllocationStore;

    public InvestFlowPercentAllocationProvider(Map<UUID, Float> assetWeights, InvestFlowPercentAllocationStore percentAllocationStore) {
        Intrinsics.checkNotNullParameter(assetWeights, "assetWeights");
        Intrinsics.checkNotNullParameter(percentAllocationStore, "percentAllocationStore");
        this.assetWeights = assetWeights;
        this.percentAllocationStore = percentAllocationStore;
    }

    @Override // com.robinhood.android.common.investflow.allocationprovider.InvestFlowAllocationProvider
    public Single<Map<Instrument, Money>> getSplit(final Money totalAmount, final List<Instrument> instruments) {
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        if (totalAmount == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Single<Map<Instrument, Money>> singleFlatMap = Single.create(new SingleOnSubscribe() { // from class: com.robinhood.android.common.investflow.allocationprovider.percent.InvestFlowPercentAllocationProvider.getSplit.1
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter<Tuples2<Money, List<Instrument>>> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                List listSorted = CollectionsKt.sorted(InvestFlowPercentAllocationProvider.this.assetWeights.keySet());
                List<Instrument> list = instruments;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Instrument) it.next()).getId());
                }
                if (!Intrinsics.areEqual(listSorted, CollectionsKt.sorted(arrayList))) {
                    emitter.onError(new IllegalAllocationException());
                } else {
                    emitter.onSuccess(Tuples4.m3642to(totalAmount, instruments));
                }
            }
        }).flatMap(new Function() { // from class: com.robinhood.android.common.investflow.allocationprovider.percent.InvestFlowPercentAllocationProvider.getSplit.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Map<Instrument, Money>> apply(Tuples2<Money, ? extends List<Instrument>> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Money moneyComponent1 = tuples2.component1();
                List<Instrument> listComponent2 = tuples2.component2();
                final LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listComponent2, 10)), 16));
                for (T t : listComponent2) {
                    linkedHashMap.put(((Instrument) t).getId(), t);
                }
                return InvestFlowPercentAllocationProvider.this.percentAllocationStore.getDollarAmountAllocationsByPercent(moneyComponent1, InvestFlowPercentAllocationProvider.this.assetWeights).map(new Function() { // from class: com.robinhood.android.common.investflow.allocationprovider.percent.InvestFlowPercentAllocationProvider.getSplit.2.1
                    @Override // io.reactivex.functions.Function
                    public final Map<Instrument, Money> apply(List<ApiInvestFlowPercentAllocationResponse.Amount> amounts) {
                        Intrinsics.checkNotNullParameter(amounts, "amounts");
                        List<ApiInvestFlowPercentAllocationResponse.Amount> list = amounts;
                        Map<UUID, Instrument> map = linkedHashMap;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (ApiInvestFlowPercentAllocationResponse.Amount amount : list) {
                            UUID id = amount.getId();
                            Tuples2 tuples2M3642to = Tuples4.m3642to(MapsKt.getValue(map, id), amount.getAmount());
                            linkedHashMap2.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                        }
                        return linkedHashMap2;
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }
}
