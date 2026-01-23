package operations.logic.equals.strict;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import operations.logic.equals.EqualsOperation;
import utils.AnyUtils;

/* compiled from: StrictEqualsOperation.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Loperations/logic/equals/strict/StrictEqualsOperation;", "Loperations/logic/equals/EqualsOperation;", "", "wrappedValue", "unwrapValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface StrictEqualsOperation extends EqualsOperation {
    Object unwrapValue(Object wrappedValue);

    /* compiled from: StrictEqualsOperation.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static boolean compareListOfTwo(StrictEqualsOperation strictEqualsOperation, List<? extends Object> list, Function2<? super Integer, ? super Integer, Boolean> operator) {
            Intrinsics.checkNotNullParameter(operator, "operator");
            return EqualsOperation.DefaultImpls.compareListOfTwo(strictEqualsOperation, list, operator);
        }

        public static List<Comparable<?>> unwrapAsComparableWithTypeSensitivity(StrictEqualsOperation strictEqualsOperation, Comparable<?> comparable, Comparable<?> comparable2) {
            return EqualsOperation.DefaultImpls.unwrapAsComparableWithTypeSensitivity(strictEqualsOperation, comparable, comparable2);
        }

        public static Object unwrapSingleNestedValueOrDefault(StrictEqualsOperation strictEqualsOperation, Object obj) {
            return EqualsOperation.DefaultImpls.unwrapSingleNestedValueOrDefault(strictEqualsOperation, obj);
        }

        public static Boolean unwrapValueAsBoolean(StrictEqualsOperation strictEqualsOperation, Object obj) {
            return EqualsOperation.DefaultImpls.unwrapValueAsBoolean(strictEqualsOperation, obj);
        }

        public static boolean compare(StrictEqualsOperation strictEqualsOperation, Object obj, Function2<? super Integer, ? super Integer, Boolean> operator) {
            Intrinsics.checkNotNullParameter(operator, "operator");
            List<Object> asList = AnyUtils.getAsList(obj);
            if (asList.size() == 1) {
                return false;
            }
            List<Object> list = asList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(strictEqualsOperation.unwrapValue(it.next()));
            }
            return strictEqualsOperation.compareListOfTwo(arrayList, operator);
        }

        public static Object unwrapValue(StrictEqualsOperation strictEqualsOperation, Object obj) {
            Number number = obj instanceof Number ? (Number) obj : null;
            return number != null ? Double.valueOf(number.doubleValue()) : obj;
        }

        public static List<Comparable<?>> unwrapAsComparable(StrictEqualsOperation strictEqualsOperation, Comparable<?> comparable, Comparable<?> comparable2) {
            return strictEqualsOperation.unwrapAsComparableWithTypeSensitivity(comparable, comparable2);
        }
    }
}
