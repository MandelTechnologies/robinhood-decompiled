package androidx.compose.runtime;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterMap6;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSet2;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateObjectImpl2;
import androidx.compose.runtime.tooling.CompositionObserver;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Composition.kt */
@Metadata(m3635d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0004B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u0019\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u00020\u00172\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b(\u0010)J)\u0010-\u001a\u00020,2\u0006\u0010&\u001a\u00020%2\u0006\u0010+\u001a\u00020*2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b-\u0010.J!\u00102\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00040/H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0011\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b4\u00105J\u001d\u00106\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b6\u0010\u0011J\u001d\u00107\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b7\u0010\u0011J\u001d\u00108\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b8\u0010\u0011J\u000f\u0010:\u001a\u00020\u000eH\u0000¢\u0006\u0004\b9\u0010\u0013J\u000f\u0010;\u001a\u00020\u000eH\u0016¢\u0006\u0004\b;\u0010\u0013J\u001d\u0010<\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0016¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001bH\u0016¢\u0006\u0004\b>\u0010?J\u001d\u0010A\u001a\u00020\u000e2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\bC\u0010 J\u0017\u0010D\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\bD\u0010 J\u000f\u0010E\u001a\u00020\u0017H\u0016¢\u0006\u0004\bE\u0010FJ+\u0010K\u001a\u00020\u000e2\u001a\u0010J\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020I\u0012\u0006\u0012\u0004\u0018\u00010I0H0GH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u000eH\u0016¢\u0006\u0004\bQ\u0010\u0013J\u000f\u0010R\u001a\u00020\u000eH\u0016¢\u0006\u0004\bR\u0010\u0013J\u000f\u0010S\u001a\u00020\u000eH\u0016¢\u0006\u0004\bS\u0010\u0013J\u000f\u0010T\u001a\u00020\u000eH\u0016¢\u0006\u0004\bT\u0010\u0013J\u000f\u0010U\u001a\u00020\u000eH\u0016¢\u0006\u0004\bU\u0010\u0013J5\u0010Z\u001a\u00028\u0000\"\u0004\b\u0000\u0010V2\b\u0010W\u001a\u0004\u0018\u00010\u00012\u0006\u0010Y\u001a\u00020X2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\bZ\u0010[J!\u0010\\\u001a\u00020,2\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b^\u0010_J\u001f\u0010b\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b`\u0010aJ\u001b\u0010f\u001a\u00020\u000e2\n\u0010N\u001a\u0006\u0012\u0002\b\u00030cH\u0000¢\u0006\u0004\bd\u0010eJ\u000f\u0010g\u001a\u00020\u000eH\u0016¢\u0006\u0004\bg\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010h\u001a\u0004\bi\u0010jR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010kR(\u0010n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040lj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010p\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR \u0010t\u001a\b\u0012\u0004\u0012\u00020s0r8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bt\u0010u\u0012\u0004\bv\u0010\u0013R \u0010x\u001a\u00020w8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\bx\u0010y\u0012\u0004\b|\u0010\u0013\u001a\u0004\bz\u0010{R&\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020%0/8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b}\u0010~R\u001d\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001d\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0081\u0001R,\u0010\u0083\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030c0/8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010~R\u0015\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010\u0084\u0001R\u0017\u0010\u0085\u0001\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0084\u0001R(\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020%0/8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010~R*\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00040/8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010~R/\u0010\u0088\u0001\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u001e\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u0012\u0005\b\u008d\u0001\u0010\u0013\u001a\u0005\b\u008a\u0001\u0010F\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0090\u0001\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R \u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0019\u0010\u009a\u0001\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001b\u0010\u009c\u0001\u001a\u00020\u00178\u0006¢\u0006\u000f\n\u0006\b\u009c\u0001\u0010\u0089\u0001\u001a\u0005\b\u009c\u0001\u0010FR\u0019\u0010\u009d\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0089\u0001R.\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0005\b¢\u0001\u0010\u0011R\u0016\u0010¤\u0001\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010FR\u0016\u0010¥\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010FR\u0016\u0010¦\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010FR\u0016\u0010¨\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b§\u0001\u0010F\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006©\u0001"}, m3636d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Applier;", "applier", "Lkotlin/coroutines/CoroutineContext;", "recomposeContext", "<init>", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function0;", "", "content", "composeInitial", "(Lkotlin/jvm/functions/Function2;)V", "drainPendingModificationsForCompositionLocked", "()V", "drainPendingModificationsLocked", "drainPendingModificationsOutOfBandLocked", "value", "", "forgetConditionalScopes", "addPendingInvalidationsLocked", "(Ljava/lang/Object;Z)V", "", "values", "(Ljava/util/Set;Z)V", "cleanUpDerivedStateObservations", "invalidateScopeOfLocked", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/changelist/ChangeList;", "changes", "applyChangesInLocked", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "tryImminentInvalidation", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/Anchor;", "anchor", "Landroidx/compose/runtime/InvalidationResult;", "invalidateChecked", "(Landroidx/compose/runtime/RecomposeScopeImpl;Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "Landroidx/compose/runtime/collection/ScopeMap;", "takeInvalidations-afanTW4", "()Landroidx/collection/MutableScatterMap;", "takeInvalidations", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observer", "()Landroidx/compose/runtime/tooling/CompositionObserver;", "setContent", "setContentWithReuse", "composeContent", "updateMovingInvalidations$runtime_release", "updateMovingInvalidations", "dispose", "recordModificationsOf", "(Ljava/util/Set;)V", "observesAnyOf", "(Ljava/util/Set;)Z", "block", "prepareCompose", "(Lkotlin/jvm/functions/Function0;)V", "recordReadOf", "recordWriteOf", "recompose", "()Z", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContent", "(Ljava/util/List;)V", "Landroidx/compose/runtime/MovableContentState;", "state", "disposeUnusedMovableContent", "(Landroidx/compose/runtime/MovableContentState;)V", "applyChanges", "applyLateChanges", "changesApplied", "abandonChanges", "invalidateAll", "R", "to", "", "groupIndex", "delegateInvalidations", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "invalidate", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "recomposeScopeReleased", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "removeObservation$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V", "removeObservation", "Landroidx/compose/runtime/DerivedState;", "removeDerivedStateObservation$runtime_release", "(Landroidx/compose/runtime/DerivedState;)V", "removeDerivedStateObservation", "deactivate", "Landroidx/compose/runtime/CompositionContext;", "getParent", "()Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Applier;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "lock", "Ljava/lang/Object;", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "Ljava/util/Set;", "getAbandonSet$annotations", "Landroidx/compose/runtime/SlotTable;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release$annotations", "observations", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterSet;", "invalidatedScopes", "Landroidx/collection/MutableScatterSet;", "conditionallyInvalidatedScopes", "derivedStates", "Landroidx/compose/runtime/changelist/ChangeList;", "lateChanges", "observationsProcessed", "invalidations", "pendingInvalidScopes", "Z", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "getPendingInvalidScopes$runtime_release$annotations", "invalidationDelegate", "Landroidx/compose/runtime/CompositionImpl;", "invalidationDelegateGroup", "I", "Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime_release", "()Landroidx/compose/runtime/CompositionObserverHolder;", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "_recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "isRoot", "disposed", "composable", "Lkotlin/jvm/functions/Function2;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "getAreChildrenComposing", "areChildrenComposing", "isComposing", "isDisposed", "getHasInvalidations", "hasInvalidations", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeImpl5 {
    private final CoroutineContext _recomposeContext;
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final ChangeList changes;
    private Function2<? super Composer, ? super Integer, Unit> composable;
    private final ComposerImpl composer;
    private final ScatterSet2<RecomposeScopeImpl> conditionallyInvalidatedScopes;
    private final ScatterMap6<Object, Object> derivedStates;
    private boolean disposed;
    private final ScatterSet2<RecomposeScopeImpl> invalidatedScopes;
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;
    private ScatterMap6<Object, Object> invalidations;
    private final boolean isRoot;
    private final ChangeList lateChanges;
    private final Object lock;
    private final ScatterMap6<Object, Object> observations;
    private final ScatterMap6<Object, Object> observationsProcessed;
    private final CompositionObserverHolder observerHolder;
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    private final AtomicReference<Object> pendingModifications;
    private final SlotTable slotTable;

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(List<Tuples2<MovableContentStateReference, MovableContentStateReference>> references) {
        int size = references.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!Intrinsics.areEqual(references.get(i).getFirst().getComposition(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        try {
            this.composer.insertMovableContentReferences(references);
            Unit unit = Unit.INSTANCE;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0176 A[EDGE_INSN: B:70:0x0176->B:219:0x0113 BREAK  A[LOOP:13: B:60:0x0144->B:71:0x0178]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void addPendingInvalidationsLocked(Set<? extends Object> values, boolean forgetConditionalScopes) {
        char c;
        long j;
        long j2;
        long j3;
        int i;
        long[] jArr;
        String str;
        long[] jArr2;
        String str2;
        long j4;
        boolean zContains;
        long j5;
        long[] jArr3;
        int i2;
        long[] jArr4;
        int i3;
        int i4;
        long j6;
        boolean zIsEmpty;
        int i5;
        long j7;
        long j8;
        char c2;
        long j9;
        int i6;
        int i7;
        int i8;
        Object obj = null;
        char c3 = 7;
        long j10 = -9187201950435737472L;
        int i9 = 8;
        if (values instanceof ScatterSetWrapper) {
            ScatterSet set$runtime_release = ((ScatterSetWrapper) values).getSet$runtime_release();
            Object[] objArr = set$runtime_release.elements;
            long[] jArr5 = set$runtime_release.metadata;
            int length = jArr5.length - 2;
            if (length >= 0) {
                int i10 = 0;
                j2 = 128;
                while (true) {
                    long j11 = jArr5[i10];
                    j3 = 255;
                    if ((((~j11) << c3) & j11 & j10) != j10) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        int i12 = 0;
                        while (i12 < i11) {
                            if ((j11 & 255) < 128) {
                                c2 = c3;
                                Object obj2 = objArr[(i10 << 3) + i12];
                                j9 = j10;
                                if (obj2 instanceof RecomposeScopeImpl) {
                                    ((RecomposeScopeImpl) obj2).invalidateForResult(obj);
                                } else {
                                    addPendingInvalidationsLocked(obj2, forgetConditionalScopes);
                                    Object obj3 = this.derivedStates.get(obj2);
                                    if (obj3 != null) {
                                        if (obj3 instanceof ScatterSet2) {
                                            ScatterSet2 scatterSet2 = (ScatterSet2) obj3;
                                            Object[] objArr2 = scatterSet2.elements;
                                            long[] jArr6 = scatterSet2.metadata;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                j8 = j11;
                                                int i13 = 0;
                                                while (true) {
                                                    long j12 = jArr6[i13];
                                                    int i14 = i9;
                                                    i6 = length;
                                                    if ((((~j12) << c2) & j12 & j9) != j9) {
                                                        int i15 = 8 - ((~(i13 - length2)) >>> 31);
                                                        int i16 = 0;
                                                        while (i16 < i15) {
                                                            if ((j12 & 255) < 128) {
                                                                i8 = i14;
                                                                addPendingInvalidationsLocked((DerivedState) objArr2[(i13 << 3) + i16], forgetConditionalScopes);
                                                            } else {
                                                                i8 = i14;
                                                            }
                                                            j12 >>= i8;
                                                            i16++;
                                                            i14 = i8;
                                                        }
                                                        if (i15 != i14) {
                                                            break;
                                                        }
                                                        if (i13 == length2) {
                                                            break;
                                                        }
                                                        i13++;
                                                        length = i6;
                                                        i9 = 8;
                                                    }
                                                }
                                            }
                                        } else {
                                            j8 = j11;
                                            i6 = length;
                                            addPendingInvalidationsLocked((DerivedState) obj3, forgetConditionalScopes);
                                        }
                                        i7 = 8;
                                    }
                                }
                                j8 = j11;
                                i6 = length;
                                i7 = 8;
                            } else {
                                j8 = j11;
                                c2 = c3;
                                j9 = j10;
                                i6 = length;
                                i7 = i9;
                            }
                            i12++;
                            length = i6;
                            i9 = i7;
                            c3 = c2;
                            j10 = j9;
                            j11 = j8 >> i7;
                            obj = null;
                        }
                        c = c3;
                        j = j10;
                        int i17 = length;
                        if (i11 != i9) {
                            break;
                        } else {
                            length = i17;
                        }
                    } else {
                        c = c3;
                        j = j10;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                    c3 = c;
                    j10 = j;
                    obj = null;
                    i9 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
            for (Object obj4 : values) {
                if (obj4 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj4).invalidateForResult(null);
                } else {
                    addPendingInvalidationsLocked(obj4, forgetConditionalScopes);
                    Object obj5 = this.derivedStates.get(obj4);
                    if (obj5 != null) {
                        if (obj5 instanceof ScatterSet2) {
                            ScatterSet2 scatterSet22 = (ScatterSet2) obj5;
                            Object[] objArr3 = scatterSet22.elements;
                            long[] jArr7 = scatterSet22.metadata;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j13 = jArr7[i];
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i18 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i19 = 0; i19 < i18; i19++) {
                                            if ((j13 & 255) < 128) {
                                                addPendingInvalidationsLocked((DerivedState) objArr3[(i << 3) + i19], forgetConditionalScopes);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i18 == 8) {
                                            i = i != length3 ? i + 1 : 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            addPendingInvalidationsLocked((DerivedState) obj5, forgetConditionalScopes);
                        }
                    }
                }
            }
        }
        ScatterSet2<RecomposeScopeImpl> scatterSet23 = this.conditionallyInvalidatedScopes;
        ScatterSet2<RecomposeScopeImpl> scatterSet24 = this.invalidatedScopes;
        String str3 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        if (!forgetConditionalScopes || !scatterSet23.isNotEmpty()) {
            if (scatterSet24.isNotEmpty()) {
                ScatterMap6<Object, Object> scatterMap6 = this.observations;
                long[] jArr8 = scatterMap6.metadata;
                int length4 = jArr8.length - 2;
                if (length4 >= 0) {
                    int i20 = 0;
                    while (true) {
                        long j14 = jArr8[i20];
                        if ((((~j14) << c) & j14 & j) != j) {
                            int i21 = 8 - ((~(i20 - length4)) >>> 31);
                            int i22 = 0;
                            while (i22 < i21) {
                                if ((j14 & j3) < j2) {
                                    int i23 = (i20 << 3) + i22;
                                    Object obj6 = scatterMap6.keys[i23];
                                    Object obj7 = scatterMap6.values[i23];
                                    if (obj7 instanceof ScatterSet2) {
                                        Intrinsics.checkNotNull(obj7, str3);
                                        ScatterSet2 scatterSet25 = (ScatterSet2) obj7;
                                        Object[] objArr4 = scatterSet25.elements;
                                        long[] jArr9 = scatterSet25.metadata;
                                        int length5 = jArr9.length - 2;
                                        jArr2 = jArr8;
                                        str2 = str3;
                                        if (length5 >= 0) {
                                            int i24 = 0;
                                            while (true) {
                                                long j15 = jArr9[i24];
                                                j4 = j14;
                                                if ((((~j15) << c) & j15 & j) != j) {
                                                    int i25 = 8 - ((~(i24 - length5)) >>> 31);
                                                    int i26 = 0;
                                                    while (i26 < i25) {
                                                        if ((j15 & j3) < j2) {
                                                            j5 = j15;
                                                            int i27 = (i24 << 3) + i26;
                                                            if (scatterSet24.contains((RecomposeScopeImpl) objArr4[i27])) {
                                                                scatterSet25.removeElementAt(i27);
                                                            }
                                                        } else {
                                                            j5 = j15;
                                                        }
                                                        i26++;
                                                        j15 = j5 >> 8;
                                                    }
                                                    if (i25 != 8) {
                                                        break;
                                                    }
                                                    if (i24 == length5) {
                                                        break;
                                                    }
                                                    i24++;
                                                    j14 = j4;
                                                }
                                            }
                                        } else {
                                            j4 = j14;
                                        }
                                        zContains = scatterSet25.isEmpty();
                                    } else {
                                        jArr2 = jArr8;
                                        str2 = str3;
                                        j4 = j14;
                                        Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        zContains = scatterSet24.contains((RecomposeScopeImpl) obj7);
                                    }
                                    if (zContains) {
                                        scatterMap6.removeValueAt(i23);
                                    }
                                } else {
                                    jArr2 = jArr8;
                                    str2 = str3;
                                    j4 = j14;
                                }
                                j14 = j4 >> 8;
                                i22++;
                                jArr8 = jArr2;
                                str3 = str2;
                            }
                            jArr = jArr8;
                            str = str3;
                            if (i21 != 8) {
                                break;
                            }
                        } else {
                            jArr = jArr8;
                            str = str3;
                        }
                        if (i20 == length4) {
                            break;
                        }
                        i20++;
                        jArr8 = jArr;
                        str3 = str;
                    }
                }
                cleanUpDerivedStateObservations();
                scatterSet24.clear();
                return;
            }
            return;
        }
        ScatterMap6<Object, Object> scatterMap62 = this.observations;
        long[] jArr10 = scatterMap62.metadata;
        int length6 = jArr10.length - 2;
        if (length6 >= 0) {
            int i28 = 0;
            while (true) {
                long j16 = jArr10[i28];
                if ((((~j16) << c) & j16 & j) != j) {
                    int i29 = 8 - ((~(i28 - length6)) >>> 31);
                    int i30 = 0;
                    while (i30 < i29) {
                        if ((j16 & j3) < j2) {
                            int i31 = (i28 << 3) + i30;
                            Object obj8 = scatterMap62.keys[i31];
                            Object obj9 = scatterMap62.values[i31];
                            if (obj9 instanceof ScatterSet2) {
                                Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                ScatterSet2 scatterSet26 = (ScatterSet2) obj9;
                                Object[] objArr5 = scatterSet26.elements;
                                long[] jArr11 = scatterSet26.metadata;
                                jArr4 = jArr10;
                                int length7 = jArr11.length - 2;
                                if (length7 >= 0) {
                                    j6 = j16;
                                    int i32 = 0;
                                    while (true) {
                                        long j17 = jArr11[i32];
                                        i3 = length6;
                                        i4 = i28;
                                        if ((((~j17) << c) & j17 & j) != j) {
                                            int i33 = 8 - ((~(i32 - length7)) >>> 31);
                                            for (int i34 = 0; i34 < i33; i34 = i5 + 1) {
                                                if ((j17 & j3) < j2) {
                                                    i5 = i34;
                                                    int i35 = (i32 << 3) + i5;
                                                    j7 = j17;
                                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr5[i35];
                                                    if (scatterSet23.contains(recomposeScopeImpl) || scatterSet24.contains(recomposeScopeImpl)) {
                                                        scatterSet26.removeElementAt(i35);
                                                    }
                                                } else {
                                                    i5 = i34;
                                                    j7 = j17;
                                                }
                                                j17 = j7 >> 8;
                                            }
                                            if (i33 != 8) {
                                                break;
                                            }
                                            if (i32 == length7) {
                                                break;
                                            }
                                            i32++;
                                            length6 = i3;
                                            i28 = i4;
                                        }
                                    }
                                } else {
                                    i3 = length6;
                                    i4 = i28;
                                    j6 = j16;
                                }
                                zIsEmpty = scatterSet26.isEmpty();
                            } else {
                                jArr4 = jArr10;
                                i3 = length6;
                                i4 = i28;
                                j6 = j16;
                                Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj9;
                                zIsEmpty = scatterSet23.contains(recomposeScopeImpl2) || scatterSet24.contains(recomposeScopeImpl2);
                            }
                            if (zIsEmpty) {
                                scatterMap62.removeValueAt(i31);
                            }
                        } else {
                            jArr4 = jArr10;
                            i3 = length6;
                            i4 = i28;
                            j6 = j16;
                        }
                        j16 = j6 >> 8;
                        i30++;
                        length6 = i3;
                        jArr10 = jArr4;
                        i28 = i4;
                    }
                    jArr3 = jArr10;
                    int i36 = length6;
                    int i37 = i28;
                    if (i29 != 8) {
                        break;
                    }
                    length6 = i36;
                    i2 = i37;
                } else {
                    jArr3 = jArr10;
                    i2 = i28;
                }
                if (i2 == length6) {
                    break;
                }
                i28 = i2 + 1;
                jArr10 = jArr3;
            }
        }
        scatterSet23.clear();
        cleanUpDerivedStateObservations();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean observesAnyOf(Set<? extends Object> values) {
        if (values instanceof ScatterSetWrapper) {
            ScatterSet set$runtime_release = ((ScatterSetWrapper) values).getSet$runtime_release();
            Object[] objArr = set$runtime_release.elements;
            long[] jArr = set$runtime_release.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (ScopeMap.m6420containsimpl(this.observations, obj) || ScopeMap.m6420containsimpl(this.derivedStates, obj)) {
                                    break loop0;
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
        } else {
            for (Object obj2 : values) {
                if (ScopeMap.m6420containsimpl(this.observations, obj2) || ScopeMap.m6420containsimpl(this.derivedStates, obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public CompositionImpl(CompositionContext compositionContext, Applier<?> applier, CoroutineContext coroutineContext) {
        this.parent = compositionContext;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        Set<RememberObserver> setAsMutableSet = new ScatterSet2(0, 1, null).asMutableSet();
        this.abandonSet = setAsMutableSet;
        SlotTable slotTable = new SlotTable();
        if (compositionContext.getCollectingCallByInformation$runtime_release()) {
            slotTable.collectCalledByInformation();
        }
        if (compositionContext.getCollectingSourceInformation()) {
            slotTable.collectSourceInformation();
        }
        this.slotTable = slotTable;
        this.observations = ScopeMap.m6419constructorimpl$default(null, 1, null);
        this.invalidatedScopes = new ScatterSet2<>(0, 1, null);
        this.conditionallyInvalidatedScopes = new ScatterSet2<>(0, 1, null);
        this.derivedStates = ScopeMap.m6419constructorimpl$default(null, 1, null);
        ChangeList changeList = new ChangeList();
        this.changes = changeList;
        ChangeList changeList2 = new ChangeList();
        this.lateChanges = changeList2;
        this.observationsProcessed = ScopeMap.m6419constructorimpl$default(null, 1, null);
        this.invalidations = ScopeMap.m6419constructorimpl$default(null, 1, null);
        this.observerHolder = new CompositionObserverHolder(null, false, 3, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, setAsMutableSet, changeList, changeList2, this);
        compositionContext.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = coroutineContext;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m6350getLambda1$runtime_release();
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i & 4) != 0 ? null : coroutineContext);
    }

    /* renamed from: getObserverHolder$runtime_release, reason: from getter */
    public final CompositionObserverHolder getObserverHolder() {
        return this.observerHolder;
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    /* renamed from: isDisposed, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(Function2<? super Composer, ? super Integer, Unit> content) {
        composeInitial(content);
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(Function2<? super Composer, ? super Integer, Unit> content) {
        this.composer.startReuseFromRoot();
        composeInitial(content);
        this.composer.endReuseFromRoot();
    }

    private final void composeInitial(Function2<? super Composer, ? super Integer, Unit> content) {
        if (this.disposed) {
            Preconditions3.throwIllegalStateException("The composition is disposed");
        }
        this.composable = content;
        this.parent.composeInitial$runtime_release(this, content);
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.PendingApplyNoModifications);
        if (andSet != null) {
            if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new ExceptionsH();
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set<? extends Object>) andSet, true);
                return;
            }
            if (andSet instanceof Object[]) {
                for (Set<? extends Object> set : (Set[]) andSet) {
                    addPendingInvalidationsLocked(set, true);
                }
                return;
            }
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new ExceptionsH();
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new ExceptionsH();
        }
        ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new ExceptionsH();
    }

    private final void drainPendingModificationsOutOfBandLocked() {
        Object andSet = this.pendingModifications.getAndSet(SetsKt.emptySet());
        if (Intrinsics.areEqual(andSet, CompositionKt.PendingApplyNoModifications) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new ExceptionsH();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(Function2<? super Composer, ? super Integer, Unit> content) {
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                ScatterMap6<Object, Object> scatterMap6M6357takeInvalidationsafanTW4 = m6357takeInvalidationsafanTW4();
                try {
                    observer();
                    this.composer.m6354composeContentZbOJvo$runtime_release(scatterMap6M6357takeInvalidationsafanTW4, content, null);
                } catch (Exception e) {
                    this.invalidations = scatterMap6M6357takeInvalidationsafanTW4;
                    throw e;
                }
            }
        } finally {
        }
    }

    public final void updateMovingInvalidations$runtime_release() {
        synchronized (this.lock) {
            drainPendingModificationsOutOfBandLocked();
            ScatterMap6<Object, Object> scatterMap6M6357takeInvalidationsafanTW4 = m6357takeInvalidationsafanTW4();
            try {
                this.composer.m6356updateComposerInvalidationsRY85e9Y(scatterMap6M6357takeInvalidationsafanTW4);
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                this.invalidations = scatterMap6M6357takeInvalidationsafanTW4;
                throw e;
            }
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            try {
                if (this.composer.getIsComposing()) {
                    Preconditions3.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.disposed) {
                    this.disposed = true;
                    this.composable = ComposableSingletons$CompositionKt.INSTANCE.m6351getLambda2$runtime_release();
                    ChangeList deferredChanges$runtime_release = this.composer.getDeferredChanges();
                    if (deferredChanges$runtime_release != null) {
                        applyChangesInLocked(deferredChanges$runtime_release);
                    }
                    boolean z = this.slotTable.getGroupsSize() > 0;
                    if (z || !this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                        if (z) {
                            this.applier.onBeginChanges();
                            SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                            try {
                                ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
                                Unit unit = Unit.INSTANCE;
                                slotWriterOpenWriter.close(true);
                                this.applier.clear();
                                this.applier.onEndChanges();
                                rememberEventDispatcher.dispatchRememberObservers();
                            } catch (Throwable th) {
                                slotWriterOpenWriter.close(false);
                                throw th;
                            }
                        }
                        rememberEventDispatcher.dispatchAbandons();
                    }
                    this.composer.dispose$runtime_release();
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            z = ScopeMap.m6421getSizeimpl(this.invalidations) > 0;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(Set<? extends Object> values) {
        Object obj;
        Set<? extends Object> setPlus;
        do {
            obj = this.pendingModifications.get();
            if (obj == null ? true : Intrinsics.areEqual(obj, CompositionKt.PendingApplyNoModifications)) {
                setPlus = values;
            } else if (obj instanceof Set) {
                setPlus = new Set[]{obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                setPlus = ArraysKt.plus((Set<? extends Object>[]) obj, values);
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(this.pendingModifications, obj, setPlus));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(Function0<Unit> block) {
        this.composer.prepareCompose$runtime_release(block);
    }

    private final void addPendingInvalidationsLocked(Object value, boolean forgetConditionalScopes) {
        Object obj = this.observations.get(value);
        if (obj == null) {
            return;
        }
        if (obj instanceof ScatterSet2) {
            ScatterSet2 scatterSet2 = (ScatterSet2) obj;
            Object[] objArr = scatterSet2.elements;
            long[] jArr = scatterSet2.metadata;
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
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                            if (!ScopeMap.m6422removeimpl(this.observationsProcessed, value, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(value) != InvalidationResult.IGNORED) {
                                if (recomposeScopeImpl.isConditional() && !forgetConditionalScopes) {
                                    this.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                                } else {
                                    this.invalidatedScopes.add(recomposeScopeImpl);
                                }
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
        } else {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj;
            if (ScopeMap.m6422removeimpl(this.observationsProcessed, value, recomposeScopeImpl2) || recomposeScopeImpl2.invalidateForResult(value) == InvalidationResult.IGNORED) {
                return;
            }
            if (recomposeScopeImpl2.isConditional() && !forgetConditionalScopes) {
                this.conditionallyInvalidatedScopes.add(recomposeScopeImpl2);
            } else {
                this.invalidatedScopes.add(recomposeScopeImpl2);
            }
        }
    }

    private final void cleanUpDerivedStateObservations() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean zIsEmpty;
        long[] jArr3;
        int i3;
        int i4;
        ScatterMap6<Object, Object> scatterMap6 = this.derivedStates;
        long[] jArr4 = scatterMap6.metadata;
        int length = jArr4.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (length >= 0) {
            int i6 = 0;
            long j8 = 128;
            while (true) {
                long j9 = jArr4[i6];
                j2 = 255;
                if ((((~j9) << c3) & j9 & j7) != j7) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j9 & 255) < j8) {
                            c2 = c3;
                            int i9 = (i6 << 3) + i8;
                            j5 = j7;
                            Object obj = scatterMap6.keys[i9];
                            Object obj2 = scatterMap6.values[i9];
                            if (obj2 instanceof ScatterSet2) {
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                ScatterSet2 scatterSet2 = (ScatterSet2) obj2;
                                Object[] objArr = scatterSet2.elements;
                                long[] jArr5 = scatterSet2.metadata;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i10 = 0;
                                    int i11 = i5;
                                    while (true) {
                                        int i12 = length2;
                                        long j10 = jArr5[i10];
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i10 - i12)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & 255) < j6) {
                                                    jArr3 = jArr4;
                                                    int i15 = (i10 << 3) + i14;
                                                    i3 = i14;
                                                    i4 = i8;
                                                    if (!ScopeMap.m6420containsimpl(this.observations, (DerivedState) objArr[i15])) {
                                                        scatterSet2.removeElementAt(i15);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i3 = i14;
                                                    i4 = i8;
                                                }
                                                j10 >>= i11;
                                                i14 = i3 + 1;
                                                i8 = i4;
                                                jArr4 = jArr3;
                                            }
                                            jArr2 = jArr4;
                                            i = i8;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i = i8;
                                        }
                                        length2 = i12;
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        j9 = j4;
                                        i8 = i;
                                        jArr4 = jArr2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                zIsEmpty = scatterSet2.isEmpty();
                            } else {
                                jArr2 = jArr4;
                                j4 = j9;
                                i = i8;
                                j6 = j8;
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zIsEmpty = !ScopeMap.m6420containsimpl(this.observations, (DerivedState) obj2);
                            }
                            if (zIsEmpty) {
                                scatterMap6.removeValueAt(i9);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr4;
                            j4 = j9;
                            i = i8;
                            c2 = c3;
                            j5 = j7;
                            j6 = j8;
                            i2 = i5;
                        }
                        j9 = j4 >> i2;
                        i8 = i + 1;
                        i5 = i2;
                        c3 = c2;
                        j7 = j5;
                        j8 = j6;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    c = c3;
                    j = j7;
                    j3 = j8;
                    if (i7 != i5) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    c = c3;
                    j = j7;
                    j3 = j8;
                }
                if (i6 == length) {
                    break;
                }
                i6++;
                c3 = c;
                j7 = j;
                j8 = j3;
                jArr4 = jArr;
                i5 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        if (!this.conditionallyInvalidatedScopes.isNotEmpty()) {
            return;
        }
        ScatterSet2<RecomposeScopeImpl> scatterSet22 = this.conditionallyInvalidatedScopes;
        Object[] objArr2 = scatterSet22.elements;
        long[] jArr6 = scatterSet22.metadata;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            long j11 = jArr6[i16];
            if ((((~j11) << c) & j11 & j) != j) {
                int i17 = 8 - ((~(i16 - length3)) >>> 31);
                for (int i18 = 0; i18 < i17; i18++) {
                    if ((j11 & j2) < j3) {
                        int i19 = (i16 << 3) + i18;
                        if (!((RecomposeScopeImpl) objArr2[i19]).isConditional()) {
                            scatterSet22.removeElementAt(i19);
                        }
                    }
                    j11 >>= 8;
                }
                if (i17 != 8) {
                    return;
                }
            }
            if (i16 == length3) {
                return;
            } else {
                i16++;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeImpl5
    public void recordReadOf(Object value) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        int i;
        int i2;
        int i3;
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        int i4 = 1;
        currentRecomposeScope$runtime_release.setUsed(true);
        if (currentRecomposeScope$runtime_release.recordRead(value)) {
            return;
        }
        if (value instanceof StateObjectImpl) {
            ((StateObjectImpl) value).m6432recordReadInh_f27i8$runtime_release(StateObjectImpl2.m6430constructorimpl(1));
        }
        ScopeMap.m6416addimpl(this.observations, value, currentRecomposeScope$runtime_release);
        if (value instanceof DerivedState) {
            DerivedState<?> derivedState = (DerivedState) value;
            DerivedState.Record<?> currentRecord = derivedState.getCurrentRecord();
            ScopeMap.m6423removeScopeimpl(this.derivedStates, value);
            ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
            Object[] objArr = dependencies.keys;
            long[] jArr = dependencies.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j = jArr[i5];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j & 255) < 128) {
                                i2 = i4;
                                StateObject stateObject = (StateObject) objArr[(i5 << 3) + i8];
                                if (stateObject instanceof StateObjectImpl) {
                                    i3 = i6;
                                    ((StateObjectImpl) stateObject).m6432recordReadInh_f27i8$runtime_release(StateObjectImpl2.m6430constructorimpl(i2));
                                } else {
                                    i3 = i6;
                                }
                                ScopeMap.m6416addimpl(this.derivedStates, stateObject, value);
                            } else {
                                i2 = i4;
                                i3 = i6;
                            }
                            j >>= i3;
                            i8++;
                            i4 = i2;
                            i6 = i3;
                        }
                        i = i4;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        i = i4;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    i4 = i;
                }
            }
            currentRecomposeScope$runtime_release.recordDerivedStateValue(derivedState, currentRecord.getCurrentValue());
        }
    }

    private final void invalidateScopeOfLocked(Object value) {
        Object obj = this.observations.get(value);
        if (obj == null) {
            return;
        }
        if (obj instanceof ScatterSet2) {
            ScatterSet2 scatterSet2 = (ScatterSet2) obj;
            Object[] objArr = scatterSet2.elements;
            long[] jArr = scatterSet2.metadata;
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
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                            if (recomposeScopeImpl.invalidateForResult(value) == InvalidationResult.IMMINENT) {
                                ScopeMap.m6416addimpl(this.observationsProcessed, value, recomposeScopeImpl);
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
        } else {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj;
            if (recomposeScopeImpl2.invalidateForResult(value) == InvalidationResult.IMMINENT) {
                ScopeMap.m6416addimpl(this.observationsProcessed, value, recomposeScopeImpl2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void recordWriteOf(Object value) {
        synchronized (this.lock) {
            try {
                invalidateScopeOfLocked(value);
                Object obj = this.derivedStates.get(value);
                if (obj != null) {
                    if (obj instanceof ScatterSet2) {
                        ScatterSet2 scatterSet2 = (ScatterSet2) obj;
                        Object[] objArr = scatterSet2.elements;
                        long[] jArr = scatterSet2.metadata;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            invalidateScopeOfLocked((DerivedState) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i == length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        invalidateScopeOfLocked((DerivedState) obj);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean zM6355recomposeaFTiNEg$runtime_release;
        synchronized (this.lock) {
            try {
                drainPendingModificationsForCompositionLocked();
                try {
                    ScatterMap6<Object, Object> scatterMap6M6357takeInvalidationsafanTW4 = m6357takeInvalidationsafanTW4();
                    try {
                        observer();
                        zM6355recomposeaFTiNEg$runtime_release = this.composer.m6355recomposeaFTiNEg$runtime_release(scatterMap6M6357takeInvalidationsafanTW4, null);
                        if (!zM6355recomposeaFTiNEg$runtime_release) {
                            drainPendingModificationsLocked();
                        }
                    } catch (Exception e) {
                        this.invalidations = scatterMap6M6357takeInvalidationsafanTW4;
                        throw e;
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zM6355recomposeaFTiNEg$runtime_release;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(MovableContentState state) {
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter slotWriterOpenWriter = state.getSlotTable().openWriter();
        try {
            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
            Unit unit = Unit.INSTANCE;
            slotWriterOpenWriter.close(true);
            rememberEventDispatcher.dispatchRememberObservers();
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    private final void applyChangesInLocked(ChangeList changes) throws Throwable {
        RememberEventDispatcher rememberEventDispatcher;
        long[] jArr;
        RememberEventDispatcher rememberEventDispatcher2;
        long[] jArr2;
        int i;
        long j;
        char c;
        long j2;
        int i2;
        boolean zIsEmpty;
        long[] jArr3;
        RememberEventDispatcher rememberEventDispatcher3 = new RememberEventDispatcher(this.abandonSet);
        try {
            if (!changes.isEmpty()) {
                try {
                    Trace trace = Trace.INSTANCE;
                    Object objBeginSection = trace.beginSection("Compose:applyChanges");
                    try {
                        Applier<?> applier = this.applier;
                        applier.onBeginChanges();
                        SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                        int i3 = 0;
                        try {
                            changes.executeAndFlushAllPendingChanges(applier, slotWriterOpenWriter, rememberEventDispatcher3);
                            Unit unit = Unit.INSTANCE;
                            slotWriterOpenWriter.close(true);
                            applier.onEndChanges();
                            trace.endSection(objBeginSection);
                            rememberEventDispatcher3.dispatchRememberObservers();
                            rememberEventDispatcher3.dispatchSideEffects();
                            if (this.pendingInvalidScopes) {
                                Object objBeginSection2 = trace.beginSection("Compose:unobserve");
                                try {
                                    this.pendingInvalidScopes = false;
                                    ScatterMap6<Object, Object> scatterMap6 = this.observations;
                                    long[] jArr4 = scatterMap6.metadata;
                                    int length = jArr4.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        while (true) {
                                            long j3 = jArr4[i4];
                                            char c2 = 7;
                                            long j4 = -9187201950435737472L;
                                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8;
                                                int i6 = 8 - ((~(i4 - length)) >>> 31);
                                                int i7 = i3;
                                                while (i7 < i6) {
                                                    if ((j3 & 255) < 128) {
                                                        c = c2;
                                                        int i8 = (i4 << 3) + i7;
                                                        j2 = j4;
                                                        Object obj = scatterMap6.keys[i8];
                                                        Object obj2 = scatterMap6.values[i8];
                                                        if (obj2 instanceof ScatterSet2) {
                                                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                                            ScatterSet2 scatterSet2 = (ScatterSet2) obj2;
                                                            Object[] objArr = scatterSet2.elements;
                                                            long[] jArr5 = scatterSet2.metadata;
                                                            int i9 = i5;
                                                            int length2 = jArr5.length - 2;
                                                            rememberEventDispatcher2 = rememberEventDispatcher3;
                                                            if (length2 >= 0) {
                                                                j = j3;
                                                                int i10 = 0;
                                                                while (true) {
                                                                    try {
                                                                        long j5 = jArr5[i10];
                                                                        long[] jArr6 = jArr5;
                                                                        i = i7;
                                                                        if ((((~j5) << c) & j5 & j2) != j2) {
                                                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                            int i12 = 0;
                                                                            while (i12 < i11) {
                                                                                if ((j5 & 255) < 128) {
                                                                                    jArr3 = jArr4;
                                                                                    int i13 = (i10 << 3) + i12;
                                                                                    if (!((RecomposeScopeImpl) objArr[i13]).getValid()) {
                                                                                        scatterSet2.removeElementAt(i13);
                                                                                    }
                                                                                } else {
                                                                                    jArr3 = jArr4;
                                                                                }
                                                                                j5 >>= i9;
                                                                                i12++;
                                                                                jArr4 = jArr3;
                                                                            }
                                                                            jArr2 = jArr4;
                                                                            if (i11 != i9) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            jArr2 = jArr4;
                                                                        }
                                                                        if (i10 == length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        i7 = i;
                                                                        jArr5 = jArr6;
                                                                        jArr4 = jArr2;
                                                                        i9 = 8;
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        Trace.INSTANCE.endSection(objBeginSection2);
                                                                        throw th;
                                                                    }
                                                                }
                                                            } else {
                                                                jArr2 = jArr4;
                                                                i = i7;
                                                                j = j3;
                                                            }
                                                            zIsEmpty = scatterSet2.isEmpty();
                                                        } else {
                                                            rememberEventDispatcher2 = rememberEventDispatcher3;
                                                            jArr2 = jArr4;
                                                            i = i7;
                                                            j = j3;
                                                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                            zIsEmpty = !((RecomposeScopeImpl) obj2).getValid();
                                                        }
                                                        if (zIsEmpty) {
                                                            scatterMap6.removeValueAt(i8);
                                                        }
                                                        i2 = 8;
                                                    } else {
                                                        rememberEventDispatcher2 = rememberEventDispatcher3;
                                                        jArr2 = jArr4;
                                                        i = i7;
                                                        j = j3;
                                                        c = c2;
                                                        j2 = j4;
                                                        i2 = i5;
                                                    }
                                                    j3 = j >> i2;
                                                    i7 = i + 1;
                                                    i5 = i2;
                                                    c2 = c;
                                                    j4 = j2;
                                                    rememberEventDispatcher3 = rememberEventDispatcher2;
                                                    jArr4 = jArr2;
                                                }
                                                rememberEventDispatcher = rememberEventDispatcher3;
                                                jArr = jArr4;
                                                if (i6 != i5) {
                                                    break;
                                                }
                                            } else {
                                                rememberEventDispatcher = rememberEventDispatcher3;
                                                jArr = jArr4;
                                            }
                                            if (i4 == length) {
                                                break;
                                            }
                                            i4++;
                                            rememberEventDispatcher3 = rememberEventDispatcher;
                                            jArr4 = jArr;
                                            i3 = 0;
                                        }
                                    } else {
                                        rememberEventDispatcher = rememberEventDispatcher3;
                                    }
                                    cleanUpDerivedStateObservations();
                                    Unit unit2 = Unit.INSTANCE;
                                    Trace.INSTANCE.endSection(objBeginSection2);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } else {
                                rememberEventDispatcher = rememberEventDispatcher3;
                            }
                            if (this.lateChanges.isEmpty()) {
                                rememberEventDispatcher.dispatchAbandons();
                            }
                        } catch (Throwable th3) {
                            try {
                                slotWriterOpenWriter.close(false);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                Trace.INSTANCE.endSection(objBeginSection);
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (this.lateChanges.isEmpty()) {
                        rememberEventDispatcher3.dispatchAbandons();
                    }
                    throw th;
                }
            } else if (this.lateChanges.isEmpty()) {
                rememberEventDispatcher3.dispatchAbandons();
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e) {
                        abandonChanges();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.isNotEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e) {
                        abandonChanges();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime_release();
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e) {
                        abandonChanges();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            try {
                for (Object obj : this.slotTable.getSlots()) {
                    RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(ControlledComposition to, int groupIndex, Function0<? extends R> block) {
        if (to != null && !Intrinsics.areEqual(to, this) && groupIndex >= 0) {
            this.invalidationDelegate = (CompositionImpl) to;
            this.invalidationDelegateGroup = groupIndex;
            try {
                return block.invoke();
            } finally {
                this.invalidationDelegate = null;
                this.invalidationDelegateGroup = 0;
            }
        }
        return block.invoke();
    }

    @Override // androidx.compose.runtime.RecomposeScopeImpl5
    public InvalidationResult invalidate(RecomposeScopeImpl scope, Object instance) {
        CompositionImpl compositionImpl;
        if (scope.getDefaultsInScope()) {
            scope.setDefaultsInvalid(true);
        }
        Anchor anchor = scope.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (!this.slotTable.ownsAnchor(anchor)) {
            synchronized (this.lock) {
                compositionImpl = this.invalidationDelegate;
            }
            if (compositionImpl != null && compositionImpl.tryImminentInvalidation(scope, instance)) {
                return InvalidationResult.IMMINENT;
            }
            return InvalidationResult.IGNORED;
        }
        if (!scope.getCanRecompose()) {
            return InvalidationResult.IGNORED;
        }
        return invalidateChecked(scope, anchor, instance);
    }

    @Override // androidx.compose.runtime.RecomposeScopeImpl5
    public void recomposeScopeReleased(RecomposeScopeImpl scope) {
        this.pendingInvalidScopes = true;
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl scope, Object instance) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime_release(scope, instance);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9 A[Catch: all -> 0x001e, EDGE_INSN: B:65:0x00a9->B:50:0x00a9 BREAK  A[LOOP:0: B:32:0x0060->B:46:0x00a1], EDGE_INSN: B:66:0x00a9->B:50:0x00a9 BREAK  A[LOOP:0: B:32:0x0060->B:46:0x00a1], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:19:0x002d, B:21:0x0032, B:22:0x003b, B:24:0x003f, B:25:0x0048, B:27:0x0050, B:29:0x0054, B:32:0x0060, B:34:0x0070, B:36:0x007c, B:38:0x0086, B:42:0x0095, B:46:0x00a1, B:47:0x00a4, B:50:0x00a9), top: B:63:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final InvalidationResult invalidateChecked(RecomposeScopeImpl scope, Anchor anchor, Object instance) {
        int i;
        synchronized (this.lock) {
            try {
                CompositionImpl compositionImpl = this.invalidationDelegate;
                CompositionImpl compositionImpl2 = null;
                if (compositionImpl != null) {
                    if (!this.slotTable.groupContainsAnchor(this.invalidationDelegateGroup, anchor)) {
                        compositionImpl = null;
                    }
                    compositionImpl2 = compositionImpl;
                }
                if (compositionImpl2 == null) {
                    if (tryImminentInvalidation(scope, instance)) {
                        return InvalidationResult.IMMINENT;
                    }
                    observer();
                    if (instance != null && (instance instanceof DerivedState)) {
                        Object obj = this.invalidations.get(scope);
                        if (obj != null) {
                            if (obj instanceof ScatterSet2) {
                                ScatterSet2 scatterSet2 = (ScatterSet2) obj;
                                Object[] objArr = scatterSet2.elements;
                                long[] jArr = scatterSet2.metadata;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i2 = 0;
                                    loop0: while (true) {
                                        long j = jArr[i2];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i3 = 8;
                                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                                            int i5 = 0;
                                            while (i5 < i4) {
                                                if ((j & 255) < 128) {
                                                    i = i3;
                                                    if (objArr[(i2 << 3) + i5] == ScopeInvalidated.INSTANCE) {
                                                        break loop0;
                                                    }
                                                } else {
                                                    i = i3;
                                                }
                                                j >>= i;
                                                i5++;
                                                i3 = i;
                                            }
                                            if (i4 != i3) {
                                                break;
                                            }
                                            if (i2 == length) {
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                    ScopeMap.m6416addimpl(this.invalidations, scope, instance);
                                }
                            } else if (obj == ScopeInvalidated.INSTANCE) {
                            }
                        } else {
                            ScopeMap.m6416addimpl(this.invalidations, scope, instance);
                        }
                    } else {
                        ScopeMap.m6424setimpl(this.invalidations, scope, ScopeInvalidated.INSTANCE);
                    }
                }
                if (compositionImpl2 != null) {
                    return compositionImpl2.invalidateChecked(scope, anchor, instance);
                }
                this.parent.invalidate$runtime_release(this);
                return isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void removeObservation$runtime_release(Object instance, RecomposeScopeImpl scope) {
        ScopeMap.m6422removeimpl(this.observations, instance, scope);
    }

    public final void removeDerivedStateObservation$runtime_release(DerivedState<?> state) {
        if (ScopeMap.m6420containsimpl(this.observations, state)) {
            return;
        }
        ScopeMap.m6423removeScopeimpl(this.derivedStates, state);
    }

    /* renamed from: takeInvalidations-afanTW4, reason: not valid java name */
    private final ScatterMap6<Object, Object> m6357takeInvalidationsafanTW4() {
        ScatterMap6<Object, Object> scatterMap6 = this.invalidations;
        this.invalidations = ScopeMap.m6419constructorimpl$default(null, 1, null);
        return scatterMap6;
    }

    private final CompositionObserver observer() {
        CompositionObserverHolder compositionObserverHolder = this.observerHolder;
        if (compositionObserverHolder.getRoot()) {
            compositionObserverHolder.getObserver();
            return null;
        }
        CompositionObserverHolder observerHolder$runtime_release = this.parent.getObserverHolder();
        if (observerHolder$runtime_release != null) {
            observerHolder$runtime_release.getObserver();
        }
        compositionObserverHolder.getObserver();
        if (!Intrinsics.areEqual((Object) null, (Object) null)) {
            compositionObserverHolder.setObserver(null);
        }
        return null;
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        synchronized (this.lock) {
            try {
                boolean z = this.slotTable.getGroupsSize() > 0;
                if (z || !this.abandonSet.isEmpty()) {
                    Trace trace = Trace.INSTANCE;
                    Object objBeginSection = trace.beginSection("Compose:deactivate");
                    try {
                        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                        if (z) {
                            this.applier.onBeginChanges();
                            SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                            try {
                                ComposerKt.deactivateCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
                                Unit unit = Unit.INSTANCE;
                                slotWriterOpenWriter.close(true);
                                this.applier.onEndChanges();
                                rememberEventDispatcher.dispatchRememberObservers();
                            } catch (Throwable th) {
                                slotWriterOpenWriter.close(false);
                                throw th;
                            }
                        }
                        rememberEventDispatcher.dispatchAbandons();
                        Unit unit2 = Unit.INSTANCE;
                        trace.endSection(objBeginSection);
                    } catch (Throwable th2) {
                        Trace.INSTANCE.endSection(objBeginSection);
                        throw th2;
                    }
                }
                ScopeMap.m6417clearimpl(this.observations);
                ScopeMap.m6417clearimpl(this.derivedStates);
                ScopeMap.m6417clearimpl(this.invalidations);
                this.changes.clear();
                this.lateChanges.clear();
                this.composer.deactivate$runtime_release();
                Unit unit3 = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
