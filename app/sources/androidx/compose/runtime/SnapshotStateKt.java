package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(m3635d1 = {"androidx/compose/runtime/SnapshotStateKt__DerivedStateKt", "androidx/compose/runtime/SnapshotStateKt__ProduceStateKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotMutationPolicyKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotStateKt"}, m3637k = 4, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class SnapshotStateKt {
    public static final <T extends R, R> SnapshotState4<R> collectAsState(Flow<? extends T> flow, R r, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        return SnapshotFlow.collectAsState(flow, r, coroutineContext, composer, i, i2);
    }

    public static final <T> SnapshotState4<T> collectAsState(StateFlow<? extends T> stateFlow, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        return SnapshotFlow.collectAsState(stateFlow, coroutineContext, composer, i, i2);
    }

    public static final MutableVector<DerivedState4> derivedStateObservers() {
        return DerivedState5.derivedStateObservers();
    }

    public static final <T> SnapshotState4<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, Function0<? extends T> function0) {
        return DerivedState5.derivedStateOf(snapshotMutationPolicy, function0);
    }

    public static final <T> SnapshotState4<T> derivedStateOf(Function0<? extends T> function0) {
        return DerivedState5.derivedStateOf(function0);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return SnapshotState3.mutableStateListOf();
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        return SnapshotState3.mutableStateListOf(tArr);
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return SnapshotState3.mutableStateMapOf();
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(Tuples2<? extends K, ? extends V>... tuples2Arr) {
        return SnapshotState3.mutableStateMapOf(tuples2Arr);
    }

    public static final <T> SnapshotState<T> mutableStateOf(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotState3.mutableStateOf(t, snapshotMutationPolicy);
    }

    public static final <T> SnapshotStateSet<T> mutableStateSetOf() {
        return SnapshotState3.mutableStateSetOf();
    }

    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return SnapshotMutationPolicy4.neverEqualPolicy();
    }

    public static final <T> SnapshotState4<T> produceState(T t, Object obj, Object obj2, Function2<? super ProduceState<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i) {
        return ProduceState3.produceState(t, obj, obj2, function2, composer, i);
    }

    public static final <T> SnapshotState4<T> produceState(T t, Object obj, Function2<? super ProduceState<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i) {
        return ProduceState3.produceState(t, obj, function2, composer, i);
    }

    public static final <T> SnapshotState4<T> produceState(T t, Function2<? super ProduceState<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i) {
        return ProduceState3.produceState(t, function2, composer, i);
    }

    public static final <T> SnapshotState4<T> produceState(T t, Object[] objArr, Function2<? super ProduceState<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i) {
        return ProduceState3.produceState((Object) t, objArr, (Function2) function2, composer, i);
    }

    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotMutationPolicy4.referentialEqualityPolicy();
    }

    public static final <T> SnapshotState4<T> rememberUpdatedState(T t, Composer composer, int i) {
        return SnapshotState3.rememberUpdatedState(t, composer, i);
    }

    public static final <T> Flow<T> snapshotFlow(Function0<? extends T> function0) {
        return SnapshotFlow.snapshotFlow(function0);
    }

    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return SnapshotMutationPolicy4.structuralEqualityPolicy();
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> collection) {
        return SnapshotState3.toMutableStateList(collection);
    }

    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(Iterable<? extends Tuples2<? extends K, ? extends V>> iterable) {
        return SnapshotState3.toMutableStateMap(iterable);
    }
}
