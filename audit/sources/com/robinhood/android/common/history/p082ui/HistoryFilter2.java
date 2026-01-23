package com.robinhood.android.common.history.p082ui;

import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.store.history.HistoryStore;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: HistoryFilter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a:\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u001a:\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\u0003*\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, m3636d2 = {"streamCountsByFilter", "", "Lcom/robinhood/android/common/history/ui/HistoryFilter;", "Lio/reactivex/Observable;", "", "Lcom/robinhood/shared/store/history/HistoryStore;", "filters", "", "staticFilter", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "toSelectableFilters", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "showPersistentFiltersWithNoItems", "", "lib-history-row_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.history.ui.HistoryFilterKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class HistoryFilter2 {
    public static final Observable<Set<HistoryFilter>> toSelectableFilters(Map<HistoryFilter, ? extends Observable<Integer>> map, final AppType appType, final boolean z) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(appType, "appType");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<HistoryFilter, ? extends Observable<Integer>> entry : map.entrySet()) {
            final HistoryFilter key = entry.getKey();
            arrayList.add(entry.getValue().map(new Function() { // from class: com.robinhood.android.common.history.ui.HistoryFilterKt$toSelectableFilters$1$1
                @Override // io.reactivex.functions.Function
                public final Tuples2<HistoryFilter, Integer> apply(Integer it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Tuples4.m3642to(key, it);
                }
            }));
        }
        Observable<Set<HistoryFilter>> observableCombineLatest = Observable.combineLatest(arrayList, new Function() { // from class: com.robinhood.android.common.history.ui.HistoryFilterKt$toSelectableFilters$$inlined$combineLatest$1
            /* JADX WARN: Type inference failed for: r0v3, types: [R, java.lang.Object, java.util.AbstractCollection, java.util.EnumSet] */
            @Override // io.reactivex.functions.Function
            public final R apply(Object[] values) {
                Intrinsics.checkNotNullParameter(values, "values");
                List<Tuples2> listAsList = ArraysKt.asList(values);
                Intrinsics.checkNotNull(listAsList, "null cannot be cast to non-null type kotlin.collections.List<T of com.robinhood.utils.extensions.ObservablesKt.combineLatest>");
                ?? r0 = (R) EnumSet.noneOf(HistoryFilter.class);
                for (Tuples2 tuples2 : listAsList) {
                    HistoryFilter historyFilter = (HistoryFilter) tuples2.component1();
                    Object objComponent2 = tuples2.component2();
                    Intrinsics.checkNotNullExpressionValue(objComponent2, "component2(...)");
                    Integer num = (Integer) objComponent2;
                    if ((z && historyFilter.isPersistent(appType)) || num.intValue() > 0) {
                        if (historyFilter.isValid(appType)) {
                            r0.add(historyFilter);
                        }
                    }
                }
                Intrinsics.checkNotNullExpressionValue(r0, "apply(...)");
                return r0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        return observableCombineLatest;
    }

    public static /* synthetic */ Map streamCountsByFilter$default(HistoryStore historyStore, List list, HistoryStaticFilter historyStaticFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            historyStaticFilter = null;
        }
        return streamCountsByFilter(historyStore, list, historyStaticFilter);
    }

    public static final Map<HistoryFilter, Observable<Integer>> streamCountsByFilter(HistoryStore historyStore, List<? extends HistoryFilter> list, HistoryStaticFilter historyStaticFilter) {
        Intrinsics.checkNotNullParameter(historyStore, "<this>");
        if (list == null) {
            list = ArraysKt.asList(HistoryFilter.values());
        }
        EnumMap enumMap = new EnumMap(HistoryFilter.class);
        for (Object obj : list) {
            Set<HistoryTransactionType> transactionTypes = ((HistoryFilter) obj).getTransactionTypes();
            Instant EPOCH = Instant.EPOCH;
            Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
            HistoryStore historyStore2 = historyStore;
            HistoryStaticFilter historyStaticFilter2 = historyStaticFilter;
            enumMap.put((EnumMap) obj, (Object) HistoryStore.count$default(historyStore2, (HistoryEvent.State) null, transactionTypes, EPOCH, (Instant) null, historyStaticFilter2, 8, (Object) null).replay(1).refCount().distinctUntilChanged());
            historyStore = historyStore2;
            historyStaticFilter = historyStaticFilter2;
        }
        return enumMap;
    }

    public static /* synthetic */ Observable toSelectableFilters$default(Map map, AppType appType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return toSelectableFilters(map, appType, z);
    }
}
