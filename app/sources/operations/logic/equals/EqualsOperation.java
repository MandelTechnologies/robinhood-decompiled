package operations.logic.equals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import operations.ComparingOperation;
import operations.logic.unwrap.EqualsUnwrapStrategy;
import operations.logic.unwrap.SingleNestedValueUnwrapStrategy;
import utils.AnyUtils;
import utils.ListUtils3;

/* compiled from: EqualsOperation.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"Loperations/logic/equals/EqualsOperation;", "Loperations/ComparingOperation;", "Loperations/logic/unwrap/EqualsUnwrapStrategy;", "Loperations/logic/unwrap/SingleNestedValueUnwrapStrategy;", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface EqualsOperation extends ComparingOperation, EqualsUnwrapStrategy, SingleNestedValueUnwrapStrategy {

    /* compiled from: EqualsOperation.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static boolean compareListOfTwo(EqualsOperation equalsOperation, List<? extends Object> list, Function2<? super Integer, ? super Integer, Boolean> operator) {
            Intrinsics.checkNotNullParameter(operator, "operator");
            return ComparingOperation.DefaultImpls.compareListOfTwo(equalsOperation, list, operator);
        }

        public static List<Comparable<?>> unwrapAsComparable(EqualsOperation equalsOperation, Comparable<?> comparable, Comparable<?> comparable2) {
            return ComparingOperation.DefaultImpls.unwrapAsComparable(equalsOperation, comparable, comparable2);
        }

        public static List<Comparable<?>> unwrapAsComparableWithTypeSensitivity(EqualsOperation equalsOperation, Comparable<?> comparable, Comparable<?> comparable2) {
            return ComparingOperation.DefaultImpls.unwrapAsComparableWithTypeSensitivity(equalsOperation, comparable, comparable2);
        }

        public static Object unwrapSingleNestedValueOrDefault(EqualsOperation equalsOperation, Object obj) {
            return SingleNestedValueUnwrapStrategy.DefaultImpls.unwrapSingleNestedValueOrDefault(equalsOperation, obj);
        }

        public static Object unwrapValue(EqualsOperation equalsOperation, Object obj) {
            return EqualsUnwrapStrategy.DefaultImpls.unwrapValue(equalsOperation, obj);
        }

        public static Boolean unwrapValueAsBoolean(EqualsOperation equalsOperation, Object obj) {
            return ComparingOperation.DefaultImpls.unwrapValueAsBoolean(equalsOperation, obj);
        }

        public static boolean compare(EqualsOperation equalsOperation, Object obj, Function2<? super Integer, ? super Integer, Boolean> operator) {
            Intrinsics.checkNotNullParameter(operator, "operator");
            List<Object> asList = AnyUtils.getAsList(obj);
            Object objUnwrapSingleNestedValueOrDefault = equalsOperation.unwrapSingleNestedValueOrDefault(CollectionsKt.firstOrNull((List) asList));
            Object objUnwrapSingleNestedValueOrDefault2 = equalsOperation.unwrapSingleNestedValueOrDefault(ListUtils3.secondOrNull(asList));
            EqualsTableOfTruth equalsTableOfTruth = EqualsTableOfTruth.INSTANCE;
            List<Object> list = equalsTableOfTruth.get(objUnwrapSingleNestedValueOrDefault);
            List<Object> list2 = equalsTableOfTruth.get(objUnwrapSingleNestedValueOrDefault2);
            if (list != null || list2 != null) {
                if (list != null ? list.contains(objUnwrapSingleNestedValueOrDefault2) : false) {
                    return true;
                }
                return list2 != null ? list2.contains(objUnwrapSingleNestedValueOrDefault) : false;
            }
            List<Object> list3 = asList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(equalsOperation.unwrapValue(it.next()));
            }
            return equalsOperation.compareListOfTwo(arrayList, operator);
        }
    }
}
