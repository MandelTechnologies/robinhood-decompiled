package androidx.compose.runtime.snapshots.tooling;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapper2;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList2;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObject;
import com.singular.sdk.internal.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SnapshotObserver.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aq\u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\r0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aI\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0012\u001aA\u0010\u0015\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00022\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"$\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u0012\u0004\b!\u0010\"¨\u0006#"}, m3636d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;", "Landroidx/compose/runtime/snapshots/Snapshot;", "parent", "", "readonly", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "Lkotlin/Pair;", "Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;", "", "mergeObservers", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "result", "observerMap", "dispatchCreatedObservers", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Ljava/util/Map;)V", "snapshot", "dispatchObserverOnPreDispose", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "changes", "dispatchObserverOnApplied", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/collection/ScatterSet;)V", "observers", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "getObservers$annotations", "()V", "runtime_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class SnapshotObserver3 {
    private static ImmutableList2<? extends SnapshotObserver> observers;

    public static final void dispatchCreatedObservers(ImmutableList2<? extends SnapshotObserver> immutableList2, Snapshot snapshot, Snapshot snapshot2, Map<SnapshotObserver, SnapshotObserver2> map) {
        int size = immutableList2.size();
        for (int i = 0; i < size; i++) {
            SnapshotObserver snapshotObserver = immutableList2.get(i);
            snapshotObserver.onCreated(snapshot2, snapshot, map != null ? map.get(snapshotObserver) : null);
        }
    }

    public static final Tuples2<SnapshotObserver2, Map<SnapshotObserver, SnapshotObserver2>> mergeObservers(ImmutableList2<? extends SnapshotObserver> immutableList2, Snapshot snapshot, boolean z, Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        int size = immutableList2.size();
        LinkedHashMap linkedHashMap = null;
        for (int i = 0; i < size; i++) {
            SnapshotObserver snapshotObserver = immutableList2.get(i);
            SnapshotObserver2 snapshotObserver2OnPreCreate = snapshotObserver.onPreCreate(snapshot, z);
            if (snapshotObserver2OnPreCreate != null) {
                function1 = mergeObservers(snapshotObserver2OnPreCreate.getReadObserver(), function1);
                function12 = mergeObservers(snapshotObserver2OnPreCreate.getWriteObserver(), function12);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(snapshotObserver, snapshotObserver2OnPreCreate);
            }
        }
        return Tuples4.m3642to(new SnapshotObserver2(function1, function12), linkedHashMap);
    }

    private static final Function1<Object, Unit> mergeObservers(final Function1<Object, Unit> function1, final Function1<Object, Unit> function12) {
        if (function1 == null || function12 == null) {
            return function1 == null ? function12 : function1;
        }
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.mergeObservers.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                function1.invoke(obj);
                function12.invoke(obj);
            }
        };
    }

    public static final void dispatchObserverOnPreDispose(Snapshot snapshot) {
        ImmutableList2<? extends SnapshotObserver> immutableList2 = observers;
        if (immutableList2 != null) {
            int size = immutableList2.size();
            for (int i = 0; i < size; i++) {
                immutableList2.get(i).onPreDispose(snapshot);
            }
        }
    }

    public static final void dispatchObserverOnApplied(Snapshot snapshot, ScatterSet<StateObject> scatterSet) {
        Set<? extends Object> setEmptySet;
        ImmutableList2<? extends SnapshotObserver> immutableList2 = observers;
        if (immutableList2 == null || immutableList2.isEmpty()) {
            return;
        }
        if (scatterSet == null || (setEmptySet = ScatterSetWrapper2.wrapIntoSet(scatterSet)) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        int size = immutableList2.size();
        for (int i = 0; i < size; i++) {
            immutableList2.get(i).onApplied(snapshot, setEmptySet);
        }
    }
}
