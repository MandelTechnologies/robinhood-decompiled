package androidx.compose.runtime.collection;

import androidx.collection.ObjectList;
import androidx.collection.ObjectList2;
import androidx.collection.ObjectList3;
import androidx.collection.ScatterMap6;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: MultiValueMap.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b!\u0010\u001fJ\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015¢\u0006\u0004\b#\u0010$J8\u0010,\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002!\u0010)\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00110&¢\u0006\u0004\b*\u0010+J\u0010\u00100\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00104\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00107\u001a\u00020\u00112\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u0010\u0013R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¨\u00069"}, m3636d2 = {"Landroidx/compose/runtime/collection/MultiValueMap;", "", "K", "V", "Landroidx/collection/MutableScatterMap;", "map", "constructor-impl", "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/MutableScatterMap;", "key", "value", "", "add-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V", "add", "clear-impl", "(Landroidx/collection/MutableScatterMap;)V", "clear", "", "contains-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z", "contains", "Landroidx/collection/ObjectList;", "get-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "get", "isEmpty-impl", "(Landroidx/collection/MutableScatterMap;)Z", "isEmpty", "isNotEmpty-impl", "isNotEmpty", "removeLast-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Ljava/lang/Object;", "removeLast", "removeFirst-impl", "removeFirst", "values-impl", "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/ObjectList;", "values", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "condition", "removeValueIf-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "removeValueIf", "", "toString-impl", "(Landroidx/collection/MutableScatterMap;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroidx/collection/MutableScatterMap;)I", "hashCode", "other", "equals-impl", "equals", "Landroidx/collection/MutableScatterMap;", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MultiValueMap<K, V> {
    private final ScatterMap6<Object, Object> map;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MultiValueMap m6400boximpl(ScatterMap6 scatterMap6) {
        return new MultiValueMap(scatterMap6);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <K, V> ScatterMap6<Object, Object> m6402constructorimpl(ScatterMap6<Object, Object> scatterMap6) {
        return scatterMap6;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6405equalsimpl(ScatterMap6<Object, Object> scatterMap6, Object obj) {
        return (obj instanceof MultiValueMap) && Intrinsics.areEqual(scatterMap6, ((MultiValueMap) obj).getMap());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6407hashCodeimpl(ScatterMap6<Object, Object> scatterMap6) {
        return scatterMap6.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6413toStringimpl(ScatterMap6<Object, Object> scatterMap6) {
        return "MultiValueMap(map=" + scatterMap6 + ')';
    }

    public boolean equals(Object obj) {
        return m6405equalsimpl(this.map, obj);
    }

    public int hashCode() {
        return m6407hashCodeimpl(this.map);
    }

    public String toString() {
        return m6413toStringimpl(this.map);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ ScatterMap6 getMap() {
        return this.map;
    }

    private /* synthetic */ MultiValueMap(ScatterMap6 scatterMap6) {
        this.map = scatterMap6;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ScatterMap6 m6403constructorimpl$default(ScatterMap6 scatterMap6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = 1;
        if ((i & 1) != 0) {
            scatterMap6 = new ScatterMap6(0, i2, null);
        }
        return m6402constructorimpl(scatterMap6);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m6401clearimpl(ScatterMap6<Object, Object> scatterMap6) {
        scatterMap6.clear();
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m6404containsimpl(ScatterMap6<Object, Object> scatterMap6, K k) {
        return scatterMap6.contains(k);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final ObjectList<V> m6406getimpl(ScatterMap6<Object, Object> scatterMap6, K k) {
        Object obj = scatterMap6.get(k);
        if (obj == null) {
            return ObjectList3.emptyObjectList();
        }
        return obj instanceof ObjectList2 ? (ObjectList) obj : ObjectList3.objectListOf(obj);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m6408isEmptyimpl(ScatterMap6<Object, Object> scatterMap6) {
        return scatterMap6.isEmpty();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m6409isNotEmptyimpl(ScatterMap6<Object, Object> scatterMap6) {
        return scatterMap6.isNotEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: removeLast-impl, reason: not valid java name */
    public static final V m6411removeLastimpl(ScatterMap6<Object, Object> scatterMap6, K k) {
        V v = (V) scatterMap6.get(k);
        if (v == 0) {
            return null;
        }
        if (v instanceof ObjectList2) {
            ObjectList2 objectList2 = (ObjectList2) v;
            V v2 = (V) ExtensionsKt.removeLast(objectList2);
            Intrinsics.checkNotNull(v2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            if (objectList2.isEmpty()) {
                scatterMap6.remove(k);
            }
            if (objectList2.get_size() == 1) {
                scatterMap6.set(k, objectList2.first());
            }
            return v2;
        }
        scatterMap6.remove(k);
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: removeFirst-impl, reason: not valid java name */
    public static final V m6410removeFirstimpl(ScatterMap6<Object, Object> scatterMap6, K k) {
        V v = (V) scatterMap6.get(k);
        if (v == 0) {
            return null;
        }
        if (v instanceof ObjectList2) {
            ObjectList2 objectList2 = (ObjectList2) v;
            V v2 = (V) objectList2.removeAt(0);
            if (objectList2.isEmpty()) {
                scatterMap6.remove(k);
            }
            if (objectList2.get_size() == 1) {
                scatterMap6.set(k, objectList2.first());
            }
            return v2;
        }
        scatterMap6.remove(k);
        return v;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* renamed from: values-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ObjectList<V> m6414valuesimpl(ScatterMap6<Object, Object> scatterMap6) {
        if (scatterMap6.isEmpty()) {
            return ObjectList3.emptyObjectList();
        }
        ObjectList2 objectList2 = new ObjectList2(0, 1, null);
        Object[] objArr = scatterMap6.values;
        long[] jArr = scatterMap6.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof ObjectList2) {
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>");
                                objectList2.addAll((ObjectList2) obj);
                            } else {
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                objectList2.add(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return objectList2;
    }

    /* renamed from: removeValueIf-impl, reason: not valid java name */
    public static final void m6412removeValueIfimpl(ScatterMap6<Object, Object> scatterMap6, K k, Function1<? super V, Boolean> function1) {
        Object obj = scatterMap6.get(k);
        if (obj != null) {
            if (obj instanceof ObjectList2) {
                ObjectList2 objectList2 = (ObjectList2) obj;
                int i = objectList2._size;
                Object[] objArr = objectList2.content;
                int i2 = 0;
                PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, i);
                int first = primitiveRanges2Until.getFirst();
                int last = primitiveRanges2Until.getLast();
                if (first <= last) {
                    while (true) {
                        objArr[first - i2] = objArr[first];
                        if (function1.invoke(objArr[first]).booleanValue()) {
                            i2++;
                        }
                        if (first == last) {
                            break;
                        } else {
                            first++;
                        }
                    }
                }
                ArraysKt.fill(objArr, (Object) null, i - i2, i);
                objectList2._size -= i2;
                if (objectList2.isEmpty()) {
                    scatterMap6.remove(k);
                }
                if (objectList2.get_size() == 0) {
                    scatterMap6.set(k, objectList2.first());
                    return;
                }
                return;
            }
            if (function1.invoke(obj).booleanValue()) {
                scatterMap6.remove(k);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: add-impl, reason: not valid java name */
    public static final void m6399addimpl(ScatterMap6<Object, Object> scatterMap6, K k, V v) {
        int iFindInsertIndex = scatterMap6.findInsertIndex(k);
        boolean z = iFindInsertIndex < 0;
        Object obj = z ? null : scatterMap6.values[iFindInsertIndex];
        TypeIntrinsics.isMutableList(obj);
        if (obj != null) {
            if (obj instanceof ObjectList2) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<kotlin.Any>");
                ObjectList2 objectList2 = (ObjectList2) obj;
                objectList2.add(v);
                v = objectList2;
            } else {
                v = (V) ObjectList3.mutableObjectListOf(obj, v);
            }
        }
        if (z) {
            int i = ~iFindInsertIndex;
            scatterMap6.keys[i] = k;
            scatterMap6.values[i] = v;
            return;
        }
        scatterMap6.values[iFindInsertIndex] = v;
    }
}
