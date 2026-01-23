package array;

import array.Sort4;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import operation.StandardLogicOperation;
import utils.AnyUtils;
import utils.ListUtils3;

/* compiled from: Sort.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Larray/Sort;", "Loperation/StandardLogicOperation;", "<init>", "()V", "", "Larray/SortOrder;", "toSortOrder", "(Ljava/lang/String;)Larray/SortOrder;", "", "", "sortingMode", "sortByMode", "(Ljava/util/List;Larray/SortOrder;)Ljava/lang/Object;", "Lkotlin/Function0;", "ascSort", "descSort", "modeBasedSort", "(Larray/SortOrder;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "expression", WebsocketGatewayConstants.DATA_KEY, "evaluateLogic", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class Sort implements StandardLogicOperation {
    public static final Sort INSTANCE = new Sort();

    private Sort() {
    }

    @Override // operation.StandardLogicOperation
    public Object evaluateLogic(Object expression, Object data) {
        List<Object> asList = AnyUtils.getAsList(expression);
        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) asList);
        List<? extends Object> list = objFirstOrNull instanceof List ? (List) objFirstOrNull : null;
        if (list == null) {
            return null;
        }
        Sort sort = INSTANCE;
        Object objSecondOrNull = ListUtils3.secondOrNull(asList);
        return sort.sortByMode(list, sort.toSortOrder(objSecondOrNull instanceof String ? (String) objSecondOrNull : null));
    }

    private final Sort4 toSortOrder(String str) {
        return Intrinsics.areEqual(str, "desc") ? Sort4.Descending.INSTANCE : Intrinsics.areEqual(str, "asc") ? Sort4.Ascending.INSTANCE : Sort4.Unknown.INSTANCE;
    }

    private final Object sortByMode(final List<? extends Object> list, Sort4 sort4) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
            numValueOf = Integer.valueOf(arrayList.size());
        } else {
            numValueOf = null;
        }
        if (Intrinsics.areEqual(numValueOf, list != null ? Integer.valueOf(list.size()) : null)) {
            if (!(list instanceof List)) {
                list = null;
            }
            if (list != null) {
                return modeBasedSort(sort4, new Function0<Object>() { // from class: array.Sort$sortComparable$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CollectionsKt.sorted(list);
                    }
                }, new Function0<Object>() { // from class: array.Sort$sortComparable$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CollectionsKt.sortedDescending(list);
                    }
                });
            }
            return null;
        }
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof Boolean) {
                    arrayList2.add(obj2);
                }
            }
            numValueOf2 = Integer.valueOf(arrayList2.size());
        } else {
            numValueOf2 = null;
        }
        if (Intrinsics.areEqual(numValueOf2, list != null ? Integer.valueOf(list.size()) : null)) {
            if (!(list instanceof List)) {
                list = null;
            }
            if (list != null) {
                return modeBasedSort(sort4, new Function0<Object>() { // from class: array.Sort$sortComparable$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CollectionsKt.sorted(list);
                    }
                }, new Function0<Object>() { // from class: array.Sort$sortComparable$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CollectionsKt.sortedDescending(list);
                    }
                });
            }
            return null;
        }
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof Number) {
                    arrayList3.add(obj3);
                }
            }
            numValueOf3 = Integer.valueOf(arrayList3.size());
        } else {
            numValueOf3 = null;
        }
        if (!Intrinsics.areEqual(numValueOf3, list != null ? Integer.valueOf(list.size()) : null)) {
            return null;
        }
        final List listFilterNotNull = CollectionsKt.filterNotNull(AnyUtils.getAsDoubleList(list));
        return modeBasedSort(sort4, new Function0<Object>() { // from class: array.Sort$sortComparable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CollectionsKt.sorted(listFilterNotNull);
            }
        }, new Function0<Object>() { // from class: array.Sort$sortComparable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CollectionsKt.sortedDescending(listFilterNotNull);
            }
        });
    }

    private final Object modeBasedSort(Sort4 sortingMode, Function0<? extends Object> ascSort, Function0<? extends Object> descSort) {
        if (Intrinsics.areEqual(sortingMode, Sort4.Descending.INSTANCE)) {
            return descSort.invoke();
        }
        if (Intrinsics.areEqual(sortingMode, Sort4.Ascending.INSTANCE)) {
            return ascSort.invoke();
        }
        if (Intrinsics.areEqual(sortingMode, Sort4.Unknown.INSTANCE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
