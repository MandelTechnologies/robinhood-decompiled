package androidx.compose.runtime.internal;

import androidx.collection.IntList3;
import androidx.collection.ScatterMap6;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSet2;
import androidx.collection.ScatterSet5;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.collection.MutableVector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RememberEventDispatcher.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010 \u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J/\u0010\"\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020\n¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\n¢\u0006\u0004\b*\u0010)J\r\u0010+\u001a\u00020\n¢\u0006\u0004\b+\u0010)R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010,R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010-R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R \u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010-R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00102R$\u00105\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u000204\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\r078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R*\u0010?\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010>8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b?\u0010@\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, m3636d2 = {"Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "", "Landroidx/compose/runtime/RememberObserver;", "abandoning", "<init>", "(Ljava/util/Set;)V", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/RememberObserverHolder;", "list", "", "dispatchRememberList", "(Landroidx/compose/runtime/collection/MutableVector;)V", "", "instance", "", "endRelativeOrder", "priority", "endRelativeAfter", "recordLeaving", "(Ljava/lang/Object;III)V", "processPendingLeaving", "(I)V", "remembering", "(Landroidx/compose/runtime/RememberObserverHolder;)V", "forgetting", "(Landroidx/compose/runtime/RememberObserverHolder;III)V", "Lkotlin/Function0;", "effect", "sideEffect", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "deactivating", "(Landroidx/compose/runtime/ComposeNodeLifecycleCallback;III)V", "releasing", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "startResumingScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "endResumingScope", "dispatchRememberObservers", "()V", "dispatchSideEffects", "dispatchAbandons", "Ljava/util/Set;", "Landroidx/compose/runtime/collection/MutableVector;", "currentRememberingList", "leaving", "sideEffects", "Landroidx/collection/MutableScatterSet;", "Landroidx/collection/MutableScatterSet;", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/internal/PausedCompositionRemembers;", "pausedPlaceholders", "Landroidx/collection/MutableScatterMap;", "", "pending", "Ljava/util/List;", "Landroidx/collection/MutableIntList;", "priorities", "Landroidx/collection/MutableIntList;", "afters", "Landroidx/compose/runtime/Stack;", "nestedRemembersLists", "Ljava/util/ArrayList;", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RememberEventDispatcher implements RememberManager {
    private final Set<RememberObserver> abandoning;
    private final IntList3 afters;
    private MutableVector<RememberObserverHolder> currentRememberingList;
    private final MutableVector<Object> leaving;
    private ArrayList nestedRemembersLists;
    private ScatterMap6<RecomposeScopeImpl, RememberEventDispatcher2> pausedPlaceholders;
    private final List<Object> pending;
    private final IntList3 priorities;
    private ScatterSet2<ComposeNodeLifecycleCallback> releasing;
    private final MutableVector<RememberObserverHolder> remembering;
    private final MutableVector<Function0<Unit>> sideEffects;

    public RememberEventDispatcher(Set<RememberObserver> set) {
        this.abandoning = set;
        MutableVector<RememberObserverHolder> mutableVector = new MutableVector<>(new RememberObserverHolder[16], 0);
        this.remembering = mutableVector;
        this.currentRememberingList = mutableVector;
        this.leaving = new MutableVector<>(new Object[16], 0);
        this.sideEffects = new MutableVector<>(new Function0[16], 0);
        this.pending = new ArrayList();
        this.priorities = new IntList3(0, 1, null);
        this.afters = new IntList3(0, 1, null);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void remembering(RememberObserverHolder instance) {
        this.currentRememberingList.add(instance);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void forgetting(RememberObserverHolder instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        recordLeaving(instance, endRelativeOrder, priority, endRelativeAfter);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void sideEffect(Function0<Unit> effect) {
        this.sideEffects.add(effect);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void deactivating(ComposeNodeLifecycleCallback instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        recordLeaving(instance, endRelativeOrder, priority, endRelativeAfter);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void releasing(ComposeNodeLifecycleCallback instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        ScatterSet2<ComposeNodeLifecycleCallback> scatterSet2MutableScatterSetOf = this.releasing;
        if (scatterSet2MutableScatterSetOf == null) {
            scatterSet2MutableScatterSetOf = ScatterSet5.mutableScatterSetOf();
            this.releasing = scatterSet2MutableScatterSetOf;
        }
        scatterSet2MutableScatterSetOf.plusAssign((ScatterSet2<ComposeNodeLifecycleCallback>) instance);
        recordLeaving(instance, endRelativeOrder, priority, endRelativeAfter);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void startResumingScope(RecomposeScopeImpl scope) {
        ScatterMap6<RecomposeScopeImpl, RememberEventDispatcher2> scatterMap6 = this.pausedPlaceholders;
        RememberEventDispatcher2 rememberEventDispatcher2 = scatterMap6 != null ? scatterMap6.get(scope) : null;
        if (rememberEventDispatcher2 != null) {
            ArrayList arrayListM6379constructorimpl$default = this.nestedRemembersLists;
            if (arrayListM6379constructorimpl$default == null) {
                arrayListM6379constructorimpl$default = Stack.m6379constructorimpl$default(null, 1, null);
                this.nestedRemembersLists = arrayListM6379constructorimpl$default;
            }
            Stack.m6386pushimpl(arrayListM6379constructorimpl$default, this.currentRememberingList);
            this.currentRememberingList = rememberEventDispatcher2.getPausedRemembers();
        }
    }

    @Override // androidx.compose.runtime.RememberManager
    public void endResumingScope(RecomposeScopeImpl scope) {
        MutableVector<RememberObserverHolder> mutableVector;
        ScatterMap6<RecomposeScopeImpl, RememberEventDispatcher2> scatterMap6 = this.pausedPlaceholders;
        if (scatterMap6 == null || scatterMap6.get(scope) == null) {
            return;
        }
        ArrayList arrayList = this.nestedRemembersLists;
        if (arrayList != null && (mutableVector = (MutableVector) Stack.m6385popimpl(arrayList)) != null) {
            this.currentRememberingList = mutableVector;
        }
        scatterMap6.remove(scope);
    }

    public final void dispatchRememberObservers() {
        Object objBeginSection;
        processPendingLeaving(Integer.MIN_VALUE);
        if (this.leaving.getSize() != 0) {
            objBeginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
            try {
                ScatterSet scatterSet = this.releasing;
                for (int size = this.leaving.getSize() - 1; -1 < size; size--) {
                    Object obj = this.leaving.content[size];
                    if (obj instanceof RememberObserverHolder) {
                        RememberObserver wrapped = ((RememberObserverHolder) obj).getWrapped();
                        this.abandoning.remove(wrapped);
                        wrapped.onForgotten();
                    }
                    if (obj instanceof ComposeNodeLifecycleCallback) {
                        if (scatterSet != null && scatterSet.contains(obj)) {
                            ((ComposeNodeLifecycleCallback) obj).onRelease();
                        } else {
                            ((ComposeNodeLifecycleCallback) obj).onDeactivate();
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.remembering.getSize() != 0) {
            Trace trace = Trace.INSTANCE;
            objBeginSection = trace.beginSection("Compose:onRemembered");
            try {
                dispatchRememberList(this.remembering);
                Unit unit2 = Unit.INSTANCE;
                trace.endSection(objBeginSection);
            } finally {
                Trace.INSTANCE.endSection(objBeginSection);
            }
        }
    }

    public final void dispatchSideEffects() {
        if (this.sideEffects.getSize() != 0) {
            Object objBeginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
            try {
                MutableVector<Function0<Unit>> mutableVector = this.sideEffects;
                Function0<Unit>[] function0Arr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    function0Arr[i].invoke();
                }
                this.sideEffects.clear();
                Unit unit = Unit.INSTANCE;
                Trace.INSTANCE.endSection(objBeginSection);
            } catch (Throwable th) {
                Trace.INSTANCE.endSection(objBeginSection);
                throw th;
            }
        }
    }

    public final void dispatchAbandons() {
        if (this.abandoning.isEmpty()) {
            return;
        }
        Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
        try {
            Iterator<RememberObserver> it = this.abandoning.iterator();
            while (it.hasNext()) {
                RememberObserver next = it.next();
                it.remove();
                next.onAbandoned();
            }
            Unit unit = Unit.INSTANCE;
            Trace.INSTANCE.endSection(objBeginSection);
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(objBeginSection);
            throw th;
        }
    }

    private final void recordLeaving(Object instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        processPendingLeaving(endRelativeOrder);
        if (endRelativeAfter >= 0 && endRelativeAfter < endRelativeOrder) {
            this.pending.add(instance);
            this.priorities.add(priority);
            this.afters.add(endRelativeAfter);
            return;
        }
        this.leaving.add(instance);
    }

    private final void processPendingLeaving(int endRelativeOrder) {
        if (this.pending.isEmpty()) {
            return;
        }
        int i = 0;
        int i2 = 0;
        List<? extends Object> listMutableListOf = null;
        IntList3 intList3 = null;
        IntList3 intList32 = null;
        while (true) {
            IntList3 intList33 = this.afters;
            if (i2 >= intList33._size) {
                break;
            }
            if (endRelativeOrder <= intList33.get(i2)) {
                Object objRemove = this.pending.remove(i2);
                int iRemoveAt = this.afters.removeAt(i2);
                int iRemoveAt2 = this.priorities.removeAt(i2);
                if (listMutableListOf == null) {
                    listMutableListOf = CollectionsKt.mutableListOf(objRemove);
                    intList32 = new IntList3(0, 1, null);
                    intList32.add(iRemoveAt);
                    intList3 = new IntList3(0, 1, null);
                    intList3.add(iRemoveAt2);
                } else {
                    Intrinsics.checkNotNull(intList3, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    Intrinsics.checkNotNull(intList32, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    listMutableListOf.add(objRemove);
                    intList32.add(iRemoveAt);
                    intList3.add(iRemoveAt2);
                }
            } else {
                i2++;
            }
        }
        if (listMutableListOf != null) {
            Intrinsics.checkNotNull(intList3, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            Intrinsics.checkNotNull(intList32, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = listMutableListOf.size() - 1;
            while (i < size) {
                int i3 = i + 1;
                int size2 = listMutableListOf.size();
                for (int i4 = i3; i4 < size2; i4++) {
                    int i5 = intList32.get(i);
                    int i6 = intList32.get(i4);
                    if (i5 < i6 || (i6 == i5 && intList3.get(i) < intList3.get(i4))) {
                        RememberEventDispatcher3.swap(listMutableListOf, i, i4);
                        RememberEventDispatcher3.swap(intList3, i, i4);
                        RememberEventDispatcher3.swap(intList32, i, i4);
                    }
                }
                i = i3;
            }
            MutableVector<Object> mutableVector = this.leaving;
            mutableVector.addAll(mutableVector.getSize(), listMutableListOf);
        }
    }

    private final void dispatchRememberList(MutableVector<RememberObserverHolder> list) {
        RememberObserverHolder[] rememberObserverHolderArr = list.content;
        int size = list.getSize();
        for (int i = 0; i < size; i++) {
            RememberObserver wrapped = rememberObserverHolderArr[i].getWrapped();
            this.abandoning.remove(wrapped);
            wrapped.onRemembered();
        }
    }
}
