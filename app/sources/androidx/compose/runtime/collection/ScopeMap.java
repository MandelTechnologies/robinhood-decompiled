package androidx.compose.runtime.collection;

import androidx.collection.ScatterMap6;
import androidx.collection.ScatterMap7;
import androidx.collection.ScatterSet2;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScopeMap.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006#"}, m3636d2 = {"Landroidx/compose/runtime/collection/ScopeMap;", "", "Key", "Scope", "Landroidx/collection/MutableScatterMap;", "map", "constructor-impl", "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/MutableScatterMap;", "key", "scope", "", "add-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V", "add", "value", "set-impl", "set", "element", "", "contains-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z", "contains", "clear-impl", "(Landroidx/collection/MutableScatterMap;)V", "clear", "remove-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "remove", "removeScope-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)V", "removeScope", "", "getSize-impl", "(Landroidx/collection/MutableScatterMap;)I", "size", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ScopeMap<Key, Scope> {
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <Key, Scope> ScatterMap6<Object, Object> m6418constructorimpl(ScatterMap6<Object, Object> scatterMap6) {
        return scatterMap6;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ScatterMap6 m6419constructorimpl$default(ScatterMap6 scatterMap6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            scatterMap6 = ScatterMap7.mutableScatterMapOf();
        }
        return m6418constructorimpl(scatterMap6);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m6421getSizeimpl(ScatterMap6<Object, Object> scatterMap6) {
        return scatterMap6.get_size();
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m6424setimpl(ScatterMap6<Object, Object> scatterMap6, Key key, Scope scope) {
        scatterMap6.set(key, scope);
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m6420containsimpl(ScatterMap6<Object, Object> scatterMap6, Key key) {
        return scatterMap6.containsKey(key);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m6417clearimpl(ScatterMap6<Object, Object> scatterMap6) {
        scatterMap6.clear();
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final boolean m6422removeimpl(ScatterMap6<Object, Object> scatterMap6, Key key, Scope scope) {
        Object obj = scatterMap6.get(key);
        if (obj == null) {
            return false;
        }
        if (obj instanceof ScatterSet2) {
            ScatterSet2 scatterSet2 = (ScatterSet2) obj;
            boolean zRemove = scatterSet2.remove(scope);
            if (zRemove && scatterSet2.isEmpty()) {
                scatterMap6.remove(key);
            }
            return zRemove;
        }
        if (!Intrinsics.areEqual(obj, scope)) {
            return false;
        }
        scatterMap6.remove(key);
        return true;
    }

    /* renamed from: removeScope-impl, reason: not valid java name */
    public static final void m6423removeScopeimpl(ScatterMap6<Object, Object> scatterMap6, Scope scope) {
        boolean zIsEmpty;
        long[] jArr = scatterMap6.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = scatterMap6.keys[i4];
                        Object obj2 = scatterMap6.values[i4];
                        if (obj2 instanceof ScatterSet2) {
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            ScatterSet2 scatterSet2 = (ScatterSet2) obj2;
                            scatterSet2.remove(scope);
                            zIsEmpty = scatterSet2.isEmpty();
                        } else {
                            zIsEmpty = obj2 == scope;
                        }
                        if (zIsEmpty) {
                            scatterMap6.removeValueAt(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.collection.MutableScatterSet] */
    /* renamed from: add-impl, reason: not valid java name */
    public static final void m6416addimpl(ScatterMap6<Object, Object> scatterMap6, Key key, Scope scope) {
        int iFindInsertIndex = scatterMap6.findInsertIndex(key);
        boolean z = iFindInsertIndex < 0;
        Scope scope2 = z ? null : scatterMap6.values[iFindInsertIndex];
        if (scope2 != null) {
            if (scope2 instanceof ScatterSet2) {
                Intrinsics.checkNotNull(scope2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                ((ScatterSet2) scope2).add(scope);
            } else if (scope2 != scope) {
                ?? scatterSet2 = new ScatterSet2(0, 1, null);
                Intrinsics.checkNotNull(scope2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                scatterSet2.add(scope2);
                scatterSet2.add(scope);
                scope = scatterSet2;
            }
            scope = scope2;
        }
        if (z) {
            int i = ~iFindInsertIndex;
            scatterMap6.keys[i] = key;
            scatterMap6.values[i] = scope;
            return;
        }
        scatterMap6.values[iFindInsertIndex] = scope;
    }
}
