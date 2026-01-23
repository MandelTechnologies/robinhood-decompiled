package utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import type.JsonLogicList;

/* compiled from: AnyUtils.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0011\u001a\u00020\u0012*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0014\u001a\u00020\u0015*\u0004\u0018\u00010\u0002\" \u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\")\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"(\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0016"}, m3636d2 = {"asComparable", "", "", "getAsComparable", "(Ljava/lang/Object;)Ljava/lang/Comparable;", "asDoubleList", "", "", "getAsDoubleList", "(Ljava/lang/Object;)Ljava/util/List;", "asList", "getAsList", "comparableList", "getComparableList", "(Ljava/util/List;)Ljava/util/List;", "doubleList", "getDoubleList", "isExpression", "", "isSingleNullList", "toStringOrEmpty", "", "utils"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: utils.AnyUtilsKt, reason: use source file name */
/* loaded from: classes28.dex */
public final class AnyUtils {
    public static final List<Object> getAsList(Object obj) {
        List list = obj instanceof List ? (List) obj : null;
        if (list != null) {
            return new JsonLogicList(list);
        }
        return new JsonLogicList(CollectionsKt.listOf(obj));
    }

    public static final List<Comparable<?>> getComparableList(List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<Object> asList = getAsList(list);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asList, 10));
        Iterator<T> it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add(getAsComparable(it.next()));
        }
        return arrayList;
    }

    private static final Comparable<?> getAsComparable(Object obj) {
        if (obj instanceof Comparable) {
            return (Comparable) obj;
        }
        if (obj instanceof List) {
            return new JsonLogicList((List) obj);
        }
        return null;
    }

    public static final List<Double> getAsDoubleList(Object obj) {
        return getDoubleList(getAsList(obj));
    }

    private static final List<Double> getDoubleList(List<? extends Object> list) {
        Double doubleOrNull;
        List<? extends Object> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Object obj : list2) {
            if (obj instanceof Number) {
                doubleOrNull = Double.valueOf(((Number) obj).doubleValue());
            } else {
                doubleOrNull = obj instanceof String ? StringsKt.toDoubleOrNull((String) obj) : null;
            }
            arrayList.add(doubleOrNull);
        }
        return arrayList;
    }

    public static final String toStringOrEmpty(Object obj) {
        String string2 = obj != null ? obj.toString() : null;
        return string2 == null ? "" : string2;
    }

    public static final boolean isSingleNullList(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        return list.size() == 1 && CollectionsKt.first(list) == null;
    }

    public static final boolean isExpression(Object obj) {
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null && !map.isEmpty()) {
            Set setKeySet = map.keySet();
            if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
                return true;
            }
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof String)) {
                }
            }
            return true;
        }
        return false;
    }
}
