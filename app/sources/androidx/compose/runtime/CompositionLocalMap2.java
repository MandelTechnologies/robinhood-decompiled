package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap2;
import androidx.compose.runtime.internal.PersistentCompositionLocalMap3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CompositionLocalMap.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u000e\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t2\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"T", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "Landroidx/compose/runtime/CompositionLocal;", "key", "", "contains", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/CompositionLocal;)Z", "read", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "parentScope", "previous", "updateCompositionMap", "([Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/PersistentCompositionLocalMap;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "runtime_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.CompositionLocalMapKt, reason: use source file name */
/* loaded from: classes.dex */
public final class CompositionLocalMap2 {
    public static final <T> boolean contains(CompositionLocalMap3 compositionLocalMap3, CompositionLocal<T> compositionLocal) {
        Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return compositionLocalMap3.containsKey(compositionLocal);
    }

    public static final <T> T read(CompositionLocalMap3 compositionLocalMap3, CompositionLocal<T> compositionLocal) {
        Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        ValueHolders5<T> defaultValueHolder$runtime_release = (ValueHolders5<T>) compositionLocalMap3.get((Object) compositionLocal);
        if (defaultValueHolder$runtime_release == null) {
            defaultValueHolder$runtime_release = compositionLocal.getDefaultValueHolder$runtime_release();
        }
        return (T) defaultValueHolder$runtime_release.readValue(compositionLocalMap3);
    }

    public static /* synthetic */ CompositionLocalMap3 updateCompositionMap$default(ProvidedValue[] providedValueArr, CompositionLocalMap3 compositionLocalMap3, CompositionLocalMap3 compositionLocalMap32, int i, Object obj) {
        if ((i & 4) != 0) {
            compositionLocalMap32 = PersistentCompositionLocalMap3.persistentCompositionLocalHashMapOf();
        }
        return updateCompositionMap(providedValueArr, compositionLocalMap3, compositionLocalMap32);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    public static final CompositionLocalMap3 updateCompositionMap(ProvidedValue<?>[] providedValueArr, CompositionLocalMap3 compositionLocalMap3, CompositionLocalMap3 compositionLocalMap32) {
        ImmutableMap2.Builder<CompositionLocal<Object>, ValueHolders5<Object>> builder = PersistentCompositionLocalMap3.persistentCompositionLocalHashMapOf().builder2();
        for (ProvidedValue<?> providedValue : providedValueArr) {
            CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
            Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            CompositionLocal6 compositionLocal6 = (CompositionLocal6) compositionLocal;
            if (providedValue.getCanOverride() || !contains(compositionLocalMap3, compositionLocal6)) {
                ValueHolders5<Object> valueHolders5 = (ValueHolders5) compositionLocalMap32.get((Object) compositionLocal6);
                Intrinsics.checkNotNull(providedValue, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                builder.put(compositionLocal6, compositionLocal6.updatedStateOf$runtime_release(providedValue, valueHolders5));
            }
        }
        return builder.build2();
    }
}
