package kotlin.collections;

import com.robinhood.android.eventcontracts.analytics.EventAnalyticsString;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Tuples2;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapsJVM.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\u001a9\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0001¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\b\u0010\f\u001a;\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aA\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013\u001aG\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0012\u0010\u0016\u001a[\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0001\u0010\u00012*\u0010\u0018\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0017\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a9\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u000f\u001a\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0001¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"K", "V", "Lkotlin/Pair;", EventAnalyticsString.CONTROL_CONTRACT_SELECTOR_PAIR_MODE, "", "mapOf", "(Lkotlin/Pair;)Ljava/util/Map;", "", "createMapBuilder", "()Ljava/util/Map;", "", "capacity", "(I)Ljava/util/Map;", "builder", "build", "(Ljava/util/Map;)Ljava/util/Map;", "", "Ljava/util/SortedMap;", "toSortedMap", "(Ljava/util/Map;)Ljava/util/SortedMap;", "Ljava/util/Comparator;", "comparator", "(Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/SortedMap;", "", "pairs", "sortedMapOf", "([Lkotlin/Pair;)Ljava/util/SortedMap;", "toSingletonMap", "expectedSize", "mapCapacity", "(I)I", "kotlin-stdlib"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/collections/MapsKt")
@SourceDebugExtension
/* renamed from: kotlin.collections.MapsKt__MapsJVMKt, reason: use source file name */
/* loaded from: classes21.dex */
public class MapsJVM extends MapWithDefault2 {
    @PublishedApi
    public static int mapCapacity(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> mapOf(Tuples2<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    @SinceKotlin
    @PublishedApi
    public static <K, V> Map<K, V> createMapBuilder() {
        return new MapBuilder();
    }

    @SinceKotlin
    @PublishedApi
    public static <K, V> Map<K, V> createMapBuilder(int i) {
        return new MapBuilder(i);
    }

    @SinceKotlin
    @PublishedApi
    public static <K, V> Map<K, V> build(Map<K, V> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((MapBuilder) builder).build();
    }

    public static <K extends Comparable<? super K>, V> SortedMap<K, V> toSortedMap(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new TreeMap(map);
    }

    public static <K, V> SortedMap<K, V> toSortedMap(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

    public static <K extends Comparable<? super K>, V> SortedMap<K, V> sortedMapOf(Tuples2<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        TreeMap treeMap = new TreeMap();
        Maps4.putAll(treeMap, pairs);
        return treeMap;
    }

    public static final <K, V> Map<K, V> toSingletonMap(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
