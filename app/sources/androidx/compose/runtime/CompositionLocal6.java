package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompositionLocal.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H ¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u000f\u0010\rJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u0010\u0010\rJ3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m3636d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/CompositionLocal;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/ProvidedValue;", "value", "Landroidx/compose/runtime/ValueHolder;", "valueHolderOf", "(Landroidx/compose/runtime/ProvidedValue;)Landroidx/compose/runtime/ValueHolder;", "defaultProvidedValue$runtime_release", "(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;", "defaultProvidedValue", "provides", "providesDefault", "previous", "updatedStateOf$runtime_release", "(Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/ValueHolder;)Landroidx/compose/runtime/ValueHolder;", "updatedStateOf", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.runtime.ProvidableCompositionLocal, reason: use source file name */
/* loaded from: classes.dex */
public abstract class CompositionLocal6<T> extends CompositionLocal<T> {
    public abstract ProvidedValue<T> defaultProvidedValue$runtime_release(T value);

    public CompositionLocal6(Function0<? extends T> function0) {
        super(function0, null);
    }

    public final ProvidedValue<T> provides(T value) {
        return defaultProvidedValue$runtime_release(value);
    }

    public final ProvidedValue<T> providesDefault(T value) {
        return defaultProvidedValue$runtime_release(value).ifNotAlreadyProvided$runtime_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 androidx.compose.runtime.DynamicValueHolder) = (r5v5 androidx.compose.runtime.DynamicValueHolder), (r5v6 androidx.compose.runtime.DynamicValueHolder) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.runtime.CompositionLocal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ValueHolders5<T> updatedStateOf$runtime_release(ProvidedValue<T> value, ValueHolders5<T> previous) {
        DynamicValueHolder valueHolders2;
        DynamicValueHolder valueHolders22 = null;
        if (previous instanceof DynamicValueHolder) {
            if (value.getIsDynamic()) {
                valueHolders22 = (DynamicValueHolder) previous;
                valueHolders22.getState().setValue(value.getEffectiveValue$runtime_release());
            }
        } else if (previous instanceof StaticValueHolder) {
            if (value.isStatic$runtime_release()) {
                StaticValueHolder staticValueHolder = (StaticValueHolder) previous;
                boolean zAreEqual = Intrinsics.areEqual(value.getEffectiveValue$runtime_release(), staticValueHolder.getValue());
                valueHolders2 = staticValueHolder;
                if (zAreEqual) {
                    valueHolders22 = valueHolders2;
                }
            }
        } else if (previous instanceof ComputedValueHolder) {
            Function1<CompositionLocal2, T> compute$runtime_release = value.getCompute$runtime_release();
            ComputedValueHolder valueHolders = (ComputedValueHolder) previous;
            Function1<CompositionLocal2, T> compute = valueHolders.getCompute();
            valueHolders2 = valueHolders;
            if (compute$runtime_release == compute) {
            }
        }
        return valueHolders22 == null ? valueHolderOf(value) : valueHolders22;
    }

    private final ValueHolders5<T> valueHolderOf(ProvidedValue<T> value) {
        if (!value.getIsDynamic()) {
            return value.getCompute$runtime_release() != null ? new ComputedValueHolder(value.getCompute$runtime_release()) : value.getState$runtime_release() != null ? new DynamicValueHolder(value.getState$runtime_release()) : new StaticValueHolder(value.getEffectiveValue$runtime_release());
        }
        SnapshotState<T> state$runtime_release = value.getState$runtime_release();
        if (state$runtime_release == null) {
            T value2 = value.getValue();
            SnapshotMutationPolicy<T> mutationPolicy$runtime_release = value.getMutationPolicy$runtime_release();
            if (mutationPolicy$runtime_release == null) {
                mutationPolicy$runtime_release = SnapshotStateKt.structuralEqualityPolicy();
            }
            state$runtime_release = SnapshotStateKt.mutableStateOf(value2, mutationPolicy$runtime_release);
        }
        return new DynamicValueHolder(state$runtime_release);
    }
}
