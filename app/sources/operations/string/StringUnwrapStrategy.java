package operations.string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import utils.AnyUtils;

/* compiled from: StringUnwrapStrategy.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u0003*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\t\u0010\u0005¨\u0006\n"}, m3636d2 = {"Loperations/string/StringUnwrapStrategy;", "", "value", "", "stringify", "(Ljava/lang/Object;)Ljava/lang/String;", "", "flattenNestedLists", "(Ljava/lang/Object;)Ljava/util/List;", "formatAsString", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface StringUnwrapStrategy {

    /* compiled from: StringUnwrapStrategy.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static List<String> unwrapValueAsString(StringUnwrapStrategy stringUnwrapStrategy, Object obj) {
            List<Object> asList = AnyUtils.getAsList(obj);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asList, 10));
            Iterator<T> it = asList.iterator();
            while (it.hasNext()) {
                arrayList.add(stringify(stringUnwrapStrategy, it.next()));
            }
            return arrayList;
        }

        private static String stringify(StringUnwrapStrategy stringUnwrapStrategy, Object obj) {
            List list = obj instanceof List ? (List) obj : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList, flattenNestedLists(stringUnwrapStrategy, it.next()));
                }
                String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
                if (strJoinToString$default != null) {
                    return strJoinToString$default;
                }
            }
            return formatAsString(stringUnwrapStrategy, obj);
        }

        private static List<String> flattenNestedLists(StringUnwrapStrategy stringUnwrapStrategy, Object obj) {
            List list = obj instanceof List ? (List) obj : null;
            if (list == null) {
                return CollectionsKt.listOf(formatAsString(stringUnwrapStrategy, obj));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, flattenNestedLists(stringUnwrapStrategy, it.next()));
            }
            return arrayList;
        }

        private static String formatAsString(StringUnwrapStrategy stringUnwrapStrategy, Object obj) {
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number.doubleValue() == number.intValue()) {
                    return String.valueOf(number.intValue());
                }
            }
            return AnyUtils.toStringOrEmpty(obj);
        }
    }
}
