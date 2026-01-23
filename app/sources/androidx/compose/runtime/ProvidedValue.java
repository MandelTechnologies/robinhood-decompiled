package androidx.compose.runtime;

import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Composer.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b%\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bl\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\u0012\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f¢\u0006\u0002\b\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR-\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f¢\u0006\u0002\b\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0010\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b#\u0010$R\u0016\u0010%\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068G@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010$R\u0017\u0010\u0005\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u001a\u00100\u001a\u00028\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010+R\u0014\u00102\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010$¨\u00063"}, m3636d2 = {"Landroidx/compose/runtime/ProvidedValue;", "T", "", "Landroidx/compose/runtime/CompositionLocal;", "compositionLocal", "value", "", "explicitNull", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "mutationPolicy", "Landroidx/compose/runtime/MutableState;", "state", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "compute", "isDynamic", "<init>", "(Landroidx/compose/runtime/CompositionLocal;Ljava/lang/Object;ZLandroidx/compose/runtime/SnapshotMutationPolicy;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Z)V", "ifNotAlreadyProvided$runtime_release", "()Landroidx/compose/runtime/ProvidedValue;", "ifNotAlreadyProvided", "Landroidx/compose/runtime/CompositionLocal;", "getCompositionLocal", "()Landroidx/compose/runtime/CompositionLocal;", "Z", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getMutationPolicy$runtime_release", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "Landroidx/compose/runtime/MutableState;", "getState$runtime_release", "()Landroidx/compose/runtime/MutableState;", "Lkotlin/jvm/functions/Function1;", "getCompute$runtime_release", "()Lkotlin/jvm/functions/Function1;", "isDynamic$runtime_release", "()Z", "providedValue", "Ljava/lang/Object;", "<set-?>", "canOverride", "getCanOverride", "getValue", "()Ljava/lang/Object;", "getValue$annotations", "()V", "getEffectiveValue$runtime_release", "getEffectiveValue$runtime_release$annotations", "effectiveValue", "isStatic$runtime_release", "isStatic", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ProvidedValue<T> {
    public static final int $stable = 8;
    private boolean canOverride = true;
    private final CompositionLocal<T> compositionLocal;
    private final Function1<CompositionLocal2, T> compute;
    private final boolean explicitNull;
    private final boolean isDynamic;
    private final SnapshotMutationPolicy<T> mutationPolicy;
    private final T providedValue;
    private final SnapshotState<T> state;

    /* JADX WARN: Multi-variable type inference failed */
    public ProvidedValue(CompositionLocal<T> compositionLocal, T t, boolean z, SnapshotMutationPolicy<T> snapshotMutationPolicy, SnapshotState<T> snapshotState, Function1<? super CompositionLocal2, ? extends T> function1, boolean z2) {
        this.compositionLocal = compositionLocal;
        this.explicitNull = z;
        this.mutationPolicy = snapshotMutationPolicy;
        this.state = snapshotState;
        this.compute = function1;
        this.isDynamic = z2;
        this.providedValue = t;
    }

    public final CompositionLocal<T> getCompositionLocal() {
        return this.compositionLocal;
    }

    public final SnapshotMutationPolicy<T> getMutationPolicy$runtime_release() {
        return this.mutationPolicy;
    }

    public final SnapshotState<T> getState$runtime_release() {
        return this.state;
    }

    public final Function1<CompositionLocal2, T> getCompute$runtime_release() {
        return this.compute;
    }

    /* renamed from: isDynamic$runtime_release, reason: from getter */
    public final boolean getIsDynamic() {
        return this.isDynamic;
    }

    public final T getValue() {
        return this.providedValue;
    }

    @JvmName
    public final boolean getCanOverride() {
        return this.canOverride;
    }

    public final T getEffectiveValue$runtime_release() {
        if (this.explicitNull) {
            return null;
        }
        SnapshotState<T> snapshotState = this.state;
        if (snapshotState != null) {
            return snapshotState.getValue();
        }
        T t = this.providedValue;
        if (t != null) {
            return t;
        }
        ComposerKt.composeRuntimeError("Unexpected form of a provided value");
        throw new ExceptionsH();
    }

    public final boolean isStatic$runtime_release() {
        return (this.explicitNull || getValue() != null) && !this.isDynamic;
    }

    public final ProvidedValue<T> ifNotAlreadyProvided$runtime_release() {
        this.canOverride = false;
        return this;
    }
}
