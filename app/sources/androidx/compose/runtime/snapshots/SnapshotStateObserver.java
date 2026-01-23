package androidx.compose.runtime.snapshots;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMap2;
import androidx.collection.ScatterMap6;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSet2;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedState4;
import androidx.compose.runtime.Preconditions3;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: SnapshotStateObserver.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001CB0\u0012'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001c\u001a\u00020\u001b\"\b\b\u0000\u0010\u0019*\u00020\u00012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010!\u001a\u00020\u0004\"\b\b\u0000\u0010\u0019*\u00020\u00012\u0006\u0010\u001e\u001a\u00028\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b#\u0010$J0\u0010&\u001a\u00020\u00042!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u000b0\u0002¢\u0006\u0004\b&\u0010\nJ\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u000fJ\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u000fJ\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\u000fR5\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R(\u0010,\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010*j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R,\u00102\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0004008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010)R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u001b058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010/R\u0018\u0010>\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006D"}, m3636d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "drainChanges", "()Z", "sendNotifications", "()V", "", "set", "addChanges", "(Ljava/util/Set;)V", "removeChanges", "()Ljava/util/Set;", "", "report", "()Ljava/lang/Void;", "T", "onChanged", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "ensureMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "scope", "onValueChangedForScope", "block", "observeReads", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "clear", "(Ljava/lang/Object;)V", "predicate", "clearIf", "start", "stop", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "pendingChanges", "Ljava/util/concurrent/atomic/AtomicReference;", "sendingNotifications", "Z", "Lkotlin/Function2;", "Landroidx/compose/runtime/snapshots/Snapshot;", "applyObserver", "Lkotlin/jvm/functions/Function2;", "readObserver", "Landroidx/compose/runtime/collection/MutableVector;", "observedScopeMaps", "Landroidx/compose/runtime/collection/MutableVector;", "observedScopeMapsLock", "Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "applyUnsubscribe", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "isPaused", "currentMap", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "currentMapThreadId", "J", "ObservedScopeMap", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SnapshotStateObserver {
    public static final int $stable = 8;
    private ObserverHandle applyUnsubscribe;
    private ObservedScopeMap currentMap;
    private boolean isPaused;
    private final Function1<Function0<Unit>, Unit> onChangedExecutor;
    private boolean sendingNotifications;
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);
    private final Function2<Set<? extends Object>, Snapshot, Unit> applyObserver = new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, Snapshot snapshot) {
            invoke2(set, snapshot);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Set<? extends Object> set, Snapshot snapshot) {
            this.this$0.addChanges(set);
            if (this.this$0.drainChanges()) {
                this.this$0.sendNotifications();
            }
        }
    };
    private final Function1<Object, Unit> readObserver = new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
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
            if (this.this$0.isPaused) {
                return;
            }
            Object obj2 = this.this$0.observedScopeMapsLock;
            SnapshotStateObserver snapshotStateObserver = this.this$0;
            synchronized (obj2) {
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = snapshotStateObserver.currentMap;
                Intrinsics.checkNotNull(observedScopeMap);
                observedScopeMap.recordRead(obj);
                Unit unit = Unit.INSTANCE;
            }
        }
    };
    private final MutableVector<ObservedScopeMap> observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);
    private final Object observedScopeMapsLock = new Object();
    private long currentMapThreadId = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(Function1<? super Function0<Unit>, Unit> function1) {
        this.onChangedExecutor = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean drainChanges() {
        boolean z;
        synchronized (this.observedScopeMapsLock) {
            z = this.sendingNotifications;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set<? extends Object> setRemoveChanges = removeChanges();
            if (setRemoveChanges == null) {
                return z2;
            }
            synchronized (this.observedScopeMapsLock) {
                try {
                    MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                    ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                    int size = mutableVector.getSize();
                    for (int i = 0; i < size; i++) {
                        z2 = observedScopeMapArr[i].recordInvalidation(setRemoveChanges) || z2;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNotifications() {
        this.onChangedExecutor.invoke(new Function0<Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver.sendNotifications.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                do {
                    Object obj = SnapshotStateObserver.this.observedScopeMapsLock;
                    SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
                    synchronized (obj) {
                        try {
                            if (!snapshotStateObserver.sendingNotifications) {
                                snapshotStateObserver.sendingNotifications = true;
                                try {
                                    MutableVector mutableVector = snapshotStateObserver.observedScopeMaps;
                                    Object[] objArr = mutableVector.content;
                                    int size = mutableVector.getSize();
                                    for (int i = 0; i < size; i++) {
                                        ((ObservedScopeMap) objArr[i]).notifyInvalidatedScopes();
                                    }
                                    snapshotStateObserver.sendingNotifications = false;
                                } finally {
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (SnapshotStateObserver.this.drainChanges());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addChanges(Set<? extends Object> set) {
        Object obj;
        List listPlus;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                listPlus = set;
            } else if (obj instanceof Set) {
                listPlus = CollectionsKt.listOf((Object[]) new Set[]{obj, set});
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new ExceptionsH();
                }
                listPlus = CollectionsKt.plus((Collection) obj, (Iterable) CollectionsKt.listOf(set));
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(this.pendingChanges, obj, listPlus));
    }

    private final Set<Object> removeChanges() {
        Object obj;
        Object objSubList;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else if (obj instanceof List) {
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            } else {
                report();
                throw new ExceptionsH();
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(this.pendingChanges, obj, objSubList));
        return set;
    }

    private final Void report() {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new ExceptionsH();
    }

    public final void clear() {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    observedScopeMapArr[i].clear();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clear(Object scope) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    ObservedScopeMap observedScopeMap = mutableVector.content[i2];
                    observedScopeMap.clearScopeObservations(scope);
                    if (!observedScopeMap.hasScopeObservations()) {
                        i++;
                    } else if (i > 0) {
                        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                        observedScopeMapArr[i2 - i] = observedScopeMapArr[i2];
                    }
                }
                int i3 = size - i;
                ArraysKt.fill(mutableVector.content, (Object) null, i3, size);
                mutableVector.setSize(i3);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clearIf(Function1<Object, Boolean> predicate) {
        synchronized (this.observedScopeMapsLock) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    ObservedScopeMap observedScopeMap = mutableVector.content[i2];
                    observedScopeMap.removeScopeIf(predicate);
                    if (!observedScopeMap.hasScopeObservations()) {
                        i++;
                    } else if (i > 0) {
                        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
                        observedScopeMapArr[i2 - i] = observedScopeMapArr[i2];
                    }
                }
                int i3 = size - i;
                ArraysKt.fill(mutableVector.content, (Object) null, i3, size);
                mutableVector.setSize(i3);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <T> void observeReads(T scope, Function1<? super T, Unit> onValueChangedForScope, Function0<Unit> block) {
        ObservedScopeMap observedScopeMapEnsureMap;
        synchronized (this.observedScopeMapsLock) {
            observedScopeMapEnsureMap = ensureMap(onValueChangedForScope);
        }
        boolean z = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        long j = this.currentMapThreadId;
        if (j != -1) {
            if (!(j == Thread_jvmKt.currentThreadId())) {
                Preconditions3.throwIllegalArgumentException("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + Thread_jvmKt.currentThreadId() + ", name=" + Thread_jvmKt.currentThreadName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.isPaused = false;
            this.currentMap = observedScopeMapEnsureMap;
            this.currentMapThreadId = Thread_jvmKt.currentThreadId();
            observedScopeMapEnsureMap.observe(scope, this.readObserver, block);
        } finally {
            this.currentMap = observedScopeMap;
            this.isPaused = z;
            this.currentMapThreadId = j;
        }
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.INSTANCE.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    private final <T> ObservedScopeMap ensureMap(Function1<? super T, Unit> onChanged) {
        ObservedScopeMap observedScopeMap;
        MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
        ObservedScopeMap[] observedScopeMapArr = mutableVector.content;
        int size = mutableVector.getSize();
        int i = 0;
        while (true) {
            if (i >= size) {
                observedScopeMap = null;
                break;
            }
            observedScopeMap = observedScopeMapArr[i];
            if (observedScopeMap.getOnChanged() == onChanged) {
                break;
            }
            i++;
        }
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 != null) {
            return observedScopeMap2;
        }
        Intrinsics.checkNotNull(onChanged, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        ObservedScopeMap observedScopeMap3 = new ObservedScopeMap((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(onChanged, 1));
        this.observedScopeMaps.add(observedScopeMap3);
        return observedScopeMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnapshotStateObserver.kt */
    @Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u0011J7\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u0011J0\u0010\u001e\u001a\u00020\u00032!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u001c0\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\r\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u00020\u001c2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010#¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\u00032\n\u0010(\u001a\u0006\u0012\u0002\b\u00030'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0003¢\u0006\u0004\b+\u0010\"R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010.R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010/R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00102R&\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u00105R&\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00105R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0001088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010<\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030'0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0017\u0010?\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00102R*\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030'038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bD\u00105R<\u0010G\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030'\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ej\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030'\u0012\u0006\u0012\u0004\u0018\u00010\u0001`F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006I"}, m3636d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;", "", "Lkotlin/Function1;", "", "onChanged", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "currentToken", "currentScope", "Landroidx/collection/MutableObjectIntMap;", "recordedValues", "recordRead", "(Ljava/lang/Object;ILjava/lang/Object;Landroidx/collection/MutableObjectIntMap;)V", "scope", "clearObsoleteStateReads", "(Ljava/lang/Object;)V", "removeObservation", "(Ljava/lang/Object;Ljava/lang/Object;)V", "readObserver", "Lkotlin/Function0;", "block", "observe", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "clearScopeObservations", "Lkotlin/ParameterName;", "name", "", "predicate", "removeScopeIf", "hasScopeObservations", "()Z", "clear", "()V", "", "changes", "recordInvalidation", "(Ljava/util/Set;)Z", "Landroidx/compose/runtime/DerivedState;", "derivedState", "rereadDerivedState", "(Landroidx/compose/runtime/DerivedState;)V", "notifyInvalidatedScopes", "Lkotlin/jvm/functions/Function1;", "getOnChanged", "()Lkotlin/jvm/functions/Function1;", "Ljava/lang/Object;", "currentScopeReads", "Landroidx/collection/MutableObjectIntMap;", "I", "Landroidx/compose/runtime/collection/ScopeMap;", "valueToScopes", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterMap;", "scopeToValues", "Landroidx/collection/MutableScatterSet;", "invalidated", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/collection/MutableVector;", "statesToReread", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/DerivedStateObserver;", "derivedStateObserver", "Landroidx/compose/runtime/DerivedStateObserver;", "getDerivedStateObserver", "()Landroidx/compose/runtime/DerivedStateObserver;", "deriveStateScopeCount", "dependencyToDerivedStates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "recordedDerivedStateValues", "Ljava/util/HashMap;", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    static final class ObservedScopeMap {
        private Object currentScope;
        private ObjectIntMap2<Object> currentScopeReads;
        private int deriveStateScopeCount;
        private final Function1<Object, Unit> onChanged;
        private int currentToken = -1;
        private final ScatterMap6<Object, Object> valueToScopes = ScopeMap.m6419constructorimpl$default(null, 1, null);
        private final ScatterMap6<Object, ObjectIntMap2<Object>> scopeToValues = new ScatterMap6<>(0, 1, null);
        private final ScatterSet2<Object> invalidated = new ScatterSet2<>(0, 1, null);
        private final MutableVector<DerivedState<?>> statesToReread = new MutableVector<>(new DerivedState[16], 0);
        private final DerivedState4 derivedStateObserver = new DerivedState4() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedState4
            public void start(DerivedState<?> derivedState) {
                this.this$0.deriveStateScopeCount++;
            }

            @Override // androidx.compose.runtime.DerivedState4
            public void done(DerivedState<?> derivedState) {
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = this.this$0;
                observedScopeMap.deriveStateScopeCount--;
            }
        };
        private final ScatterMap6<Object, Object> dependencyToDerivedStates = ScopeMap.m6419constructorimpl$default(null, 1, null);
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues = new HashMap<>();

        public ObservedScopeMap(Function1<Object, Unit> function1) {
            this.onChanged = function1;
        }

        public final Function1<Object, Unit> getOnChanged() {
            return this.onChanged;
        }

        public final void recordRead(Object value) {
            Object obj = this.currentScope;
            Intrinsics.checkNotNull(obj);
            int i = this.currentToken;
            ObjectIntMap2<Object> objectIntMap2 = this.currentScopeReads;
            if (objectIntMap2 == null) {
                objectIntMap2 = new ObjectIntMap2<>(0, 1, null);
                this.currentScopeReads = objectIntMap2;
                this.scopeToValues.set(obj, objectIntMap2);
                Unit unit = Unit.INSTANCE;
            }
            recordRead(value, i, obj, objectIntMap2);
        }

        private final void recordRead(Object value, int currentToken, Object currentScope, ObjectIntMap2<Object> recordedValues) {
            int i;
            int i2;
            int i3;
            if (this.deriveStateScopeCount > 0) {
                return;
            }
            int iPut = recordedValues.put(value, currentToken, -1);
            int i4 = 2;
            if (!(value instanceof DerivedState) || iPut == currentToken) {
                i = 2;
                i2 = -1;
            } else {
                DerivedState.Record currentRecord = ((DerivedState) value).getCurrentRecord();
                this.recordedDerivedStateValues.put(value, currentRecord.getCurrentValue());
                ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
                ScatterMap6<Object, Object> scatterMap6 = this.dependencyToDerivedStates;
                ScopeMap.m6423removeScopeimpl(scatterMap6, value);
                Object[] objArr = dependencies.keys;
                long[] jArr = dependencies.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    i3 = i4;
                                    StateObject stateObject = (StateObject) objArr[(i5 << 3) + i7];
                                    if (stateObject instanceof StateObjectImpl) {
                                        ((StateObjectImpl) stateObject).m6432recordReadInh_f27i8$runtime_release(StateObjectImpl2.m6430constructorimpl(i3));
                                    }
                                    ScopeMap.m6416addimpl(scatterMap6, stateObject, value);
                                } else {
                                    i3 = i4;
                                }
                                j >>= 8;
                                i7++;
                                i4 = i3;
                            }
                            i = i4;
                            if (i6 != 8) {
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
                } else {
                    i = 2;
                }
                i2 = -1;
            }
            if (iPut == i2) {
                if (value instanceof StateObjectImpl) {
                    ((StateObjectImpl) value).m6432recordReadInh_f27i8$runtime_release(StateObjectImpl2.m6430constructorimpl(i));
                }
                ScopeMap.m6416addimpl(this.valueToScopes, value, currentScope);
            }
        }

        public final void observe(Object scope, Function1<Object, Unit> readObserver, Function0<Unit> block) {
            Object obj = this.currentScope;
            ObjectIntMap2<Object> objectIntMap2 = this.currentScopeReads;
            int i = this.currentToken;
            this.currentScope = scope;
            this.currentScopeReads = this.scopeToValues.get(scope);
            if (this.currentToken == -1) {
                this.currentToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            }
            DerivedState4 derivedState4 = this.derivedStateObserver;
            MutableVector<DerivedState4> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                mutableVectorDerivedStateObservers.add(derivedState4);
                Snapshot.INSTANCE.observe(readObserver, null, block);
                mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                Object obj2 = this.currentScope;
                Intrinsics.checkNotNull(obj2);
                clearObsoleteStateReads(obj2);
                this.currentScope = obj;
                this.currentScopeReads = objectIntMap2;
                this.currentToken = i;
            } catch (Throwable th) {
                mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                throw th;
            }
        }

        private final void clearObsoleteStateReads(Object scope) {
            int i = this.currentToken;
            ObjectIntMap2<Object> objectIntMap2 = this.currentScopeReads;
            if (objectIntMap2 == null) {
                return;
            }
            long[] jArr = objectIntMap2.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objectIntMap2.keys[i5];
                            boolean z = objectIntMap2.values[i5] != i;
                            if (z) {
                                removeObservation(scope, obj);
                            }
                            if (z) {
                                objectIntMap2.removeValueAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        public final void clearScopeObservations(Object scope) {
            ObjectIntMap2<Object> objectIntMap2Remove = this.scopeToValues.remove(scope);
            if (objectIntMap2Remove == null) {
                return;
            }
            Object[] objArr = objectIntMap2Remove.keys;
            int[] iArr = objectIntMap2Remove.values;
            long[] jArr = objectIntMap2Remove.metadata;
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
                            Object obj = objArr[i4];
                            int i5 = iArr[i4];
                            removeObservation(scope, obj);
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

        /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void removeScopeIf(Function1<Object, Boolean> predicate) {
            long[] jArr;
            long[] jArr2;
            long j;
            char c;
            long j2;
            int i;
            long j3;
            ScatterMap6<Object, ObjectIntMap2<Object>> scatterMap6 = this.scopeToValues;
            long[] jArr3 = scatterMap6.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j4 = jArr3[i2];
                char c2 = 7;
                long j5 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j4 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            c = c2;
                            Object obj = scatterMap6.keys[i6];
                            j2 = j5;
                            ObjectIntMap2 objectIntMap2 = (ObjectIntMap2) scatterMap6.values[i6];
                            Boolean boolInvoke = predicate.invoke(obj);
                            if (boolInvoke.booleanValue()) {
                                Object[] objArr = objectIntMap2.keys;
                                int[] iArr = objectIntMap2.values;
                                long[] jArr4 = objectIntMap2.metadata;
                                int i7 = i3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j = j4;
                                    int i8 = 0;
                                    while (true) {
                                        long j6 = jArr4[i8];
                                        long[] jArr5 = jArr4;
                                        if ((((~j6) << c) & j6 & j2) != j2) {
                                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if ((j6 & 255) < 128) {
                                                    int i11 = (i8 << 3) + i10;
                                                    j3 = j6;
                                                    Object obj2 = objArr[i11];
                                                    int i12 = iArr[i11];
                                                    removeObservation(obj, obj2);
                                                } else {
                                                    j3 = j6;
                                                }
                                                j6 = j3 >> i7;
                                            }
                                            if (i9 != i7) {
                                                break;
                                            }
                                            if (i8 == length2) {
                                                break;
                                            }
                                            i8++;
                                            jArr4 = jArr5;
                                            i7 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j = j4;
                                }
                                if (boolInvoke.booleanValue()) {
                                    scatterMap6.removeValueAt(i6);
                                }
                                i = 8;
                            }
                        } else {
                            jArr2 = jArr3;
                            j = j4;
                            c = c2;
                            j2 = j5;
                            i = i3;
                        }
                        i5++;
                        i3 = i;
                        j4 = j >> i;
                        c2 = c;
                        j5 = j2;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                jArr3 = jArr;
            }
        }

        public final boolean hasScopeObservations() {
            return this.scopeToValues.isNotEmpty();
        }

        private final void removeObservation(Object scope, Object value) {
            ScopeMap.m6422removeimpl(this.valueToScopes, value, scope);
            if (!(value instanceof DerivedState) || ScopeMap.m6420containsimpl(this.valueToScopes, value)) {
                return;
            }
            ScopeMap.m6423removeScopeimpl(this.dependencyToDerivedStates, value);
            this.recordedDerivedStateValues.remove(value);
        }

        public final void clear() {
            ScopeMap.m6417clearimpl(this.valueToScopes);
            this.scopeToValues.clear();
            ScopeMap.m6417clearimpl(this.dependencyToDerivedStates);
            this.recordedDerivedStateValues.clear();
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x023f  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x02a2 A[PHI: r11
          0x02a2: PHI (r11v42 boolean) = (r11v41 boolean), (r11v43 boolean) binds: [B:111:0x027a, B:119:0x02a0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:179:0x03fc A[PHI: r13
          0x03fc: PHI (r13v8 boolean) = (r13v7 boolean), (r13v10 boolean) binds: [B:170:0x03d0, B:178:0x03fa] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:216:0x04bf A[PHI: r11
          0x04bf: PHI (r11v14 boolean) = (r11v13 boolean), (r11v15 boolean) binds: [B:207:0x0497, B:215:0x04bd] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:220:0x04cf  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x04d9  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0146 A[PHI: r37
          0x0146: PHI (r37v5 boolean) = (r37v4 boolean), (r37v6 boolean) binds: [B:47:0x011a, B:56:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x022f A[PHI: r11
          0x022f: PHI (r11v52 boolean) = (r11v51 boolean), (r11v53 boolean) binds: [B:87:0x0207, B:95:0x022d] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean recordInvalidation(Set<? extends Object> changes) {
            boolean z;
            Iterator it;
            ScatterMap6<Object, Object> scatterMap6;
            Object obj;
            int i;
            Object obj2;
            long[] jArr;
            Object[] objArr;
            Iterator it2;
            ScatterMap6<Object, Object> scatterMap62;
            long[] jArr2;
            Object[] objArr2;
            long j;
            long[] jArr3;
            Object[] objArr3;
            String str;
            int i2;
            long[] jArr4;
            Object[] objArr4;
            String str2;
            int i3;
            int i4;
            long j2;
            int i5;
            int i6;
            Object obj3;
            Object obj4;
            String str3;
            Object obj5;
            int i7;
            long j3;
            int i8;
            int i9;
            ScatterMap6<Object, Object> scatterMap63 = this.dependencyToDerivedStates;
            HashMap<DerivedState<?>, Object> map = this.recordedDerivedStateValues;
            ScatterMap6<Object, Object> scatterMap64 = this.valueToScopes;
            ScatterSet2<Object> scatterSet2 = this.invalidated;
            String str4 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            int i10 = 8;
            if (changes instanceof ScatterSetWrapper) {
                ScatterSet set$runtime_release = ((ScatterSetWrapper) changes).getSet$runtime_release();
                Object[] objArr5 = set$runtime_release.elements;
                long[] jArr5 = set$runtime_release.metadata;
                int length = jArr5.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    z = false;
                    while (true) {
                        long j4 = jArr5[i11];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j4 & 255) < 128) {
                                    int i14 = i10;
                                    Object obj6 = objArr5[(i11 << 3) + i13];
                                    jArr4 = jArr5;
                                    if (obj6 instanceof StateObjectImpl) {
                                        objArr4 = objArr5;
                                        if (!((StateObjectImpl) obj6).m6431isReadInh_f27i8$runtime_release(StateObjectImpl2.m6430constructorimpl(2))) {
                                            str2 = str4;
                                            i3 = length;
                                            i4 = i11;
                                            j2 = j4;
                                            i5 = i12;
                                        }
                                        i6 = 8;
                                    } else {
                                        objArr4 = objArr5;
                                    }
                                    if (ScopeMap.m6420containsimpl(scatterMap63, obj6)) {
                                        Object obj7 = scatterMap63.get(obj6);
                                        if (obj7 == null) {
                                            str2 = str4;
                                            obj4 = obj6;
                                            i3 = length;
                                            i4 = i11;
                                            j2 = j4;
                                            i5 = i12;
                                            obj3 = obj4;
                                        } else {
                                            if (obj7 instanceof ScatterSet2) {
                                                ScatterSet2 scatterSet22 = (ScatterSet2) obj7;
                                                Object[] objArr6 = scatterSet22.elements;
                                                long[] jArr6 = scatterSet22.metadata;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    j2 = j4;
                                                    int i15 = 0;
                                                    boolean z2 = z;
                                                    while (true) {
                                                        long j5 = jArr6[i15];
                                                        i3 = length;
                                                        i4 = i11;
                                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                            int i17 = 0;
                                                            while (i17 < i16) {
                                                                if ((j5 & 255) < 128) {
                                                                    i7 = i17;
                                                                    DerivedState<?> derivedState = (DerivedState) objArr6[(i15 << 3) + i17];
                                                                    Intrinsics.checkNotNull(derivedState, str4);
                                                                    j3 = j5;
                                                                    Object obj8 = map.get(derivedState);
                                                                    SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
                                                                    if (policy == null) {
                                                                        policy = SnapshotStateKt.structuralEqualityPolicy();
                                                                    }
                                                                    boolean z3 = z2;
                                                                    if (policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), obj8)) {
                                                                        str3 = str4;
                                                                        obj5 = obj6;
                                                                        i8 = i12;
                                                                        this.statesToReread.add(derivedState);
                                                                    } else {
                                                                        Object obj9 = scatterMap64.get(derivedState);
                                                                        if (obj9 == null) {
                                                                            str3 = str4;
                                                                            obj5 = obj6;
                                                                            i8 = i12;
                                                                        } else if (obj9 instanceof ScatterSet2) {
                                                                            ScatterSet2 scatterSet23 = (ScatterSet2) obj9;
                                                                            Object[] objArr7 = scatterSet23.elements;
                                                                            long[] jArr7 = scatterSet23.metadata;
                                                                            int length3 = jArr7.length - 2;
                                                                            if (length3 >= 0) {
                                                                                i8 = i12;
                                                                                int i18 = 0;
                                                                                while (true) {
                                                                                    long j6 = jArr7[i18];
                                                                                    str3 = str4;
                                                                                    obj5 = obj6;
                                                                                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                        int i19 = 8 - ((~(i18 - length3)) >>> 31);
                                                                                        int i20 = 0;
                                                                                        while (i20 < i19) {
                                                                                            if ((j6 & 255) < 128) {
                                                                                                i9 = i20;
                                                                                                scatterSet2.add(objArr7[(i18 << 3) + i20]);
                                                                                                z3 = true;
                                                                                            } else {
                                                                                                i9 = i20;
                                                                                            }
                                                                                            j6 >>= i14;
                                                                                            i20 = i9 + 1;
                                                                                        }
                                                                                        if (i19 != i14) {
                                                                                            break;
                                                                                        }
                                                                                        if (i18 == length3) {
                                                                                            break;
                                                                                        }
                                                                                        i18++;
                                                                                        str4 = str3;
                                                                                        obj6 = obj5;
                                                                                        i14 = 8;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str3 = str4;
                                                                            obj5 = obj6;
                                                                            i8 = i12;
                                                                            scatterSet2.add(obj9);
                                                                            z2 = true;
                                                                        }
                                                                    }
                                                                    z2 = z3;
                                                                } else {
                                                                    str3 = str4;
                                                                    obj5 = obj6;
                                                                    i7 = i17;
                                                                    j3 = j5;
                                                                    i8 = i12;
                                                                }
                                                                j5 = j3 >> 8;
                                                                i17 = i7 + 1;
                                                                i14 = 8;
                                                                i12 = i8;
                                                                str4 = str3;
                                                                obj6 = obj5;
                                                            }
                                                            str2 = str4;
                                                            obj4 = obj6;
                                                            boolean z4 = z2;
                                                            i5 = i12;
                                                            if (i16 != i14) {
                                                                z = z4;
                                                                break;
                                                            }
                                                            z2 = z4;
                                                        } else {
                                                            str2 = str4;
                                                            obj4 = obj6;
                                                            i5 = i12;
                                                        }
                                                        if (i15 == length2) {
                                                            z = z2;
                                                            break;
                                                        }
                                                        i15++;
                                                        length = i3;
                                                        i11 = i4;
                                                        i12 = i5;
                                                        str4 = str2;
                                                        obj6 = obj4;
                                                        i14 = 8;
                                                    }
                                                }
                                            } else {
                                                str2 = str4;
                                                obj4 = obj6;
                                                i3 = length;
                                                i4 = i11;
                                                j2 = j4;
                                                i5 = i12;
                                                DerivedState<?> derivedState2 = (DerivedState) obj7;
                                                Object obj10 = map.get(derivedState2);
                                                SnapshotMutationPolicy<?> policy2 = derivedState2.getPolicy();
                                                if (policy2 == null) {
                                                    policy2 = SnapshotStateKt.structuralEqualityPolicy();
                                                }
                                                if (policy2.equivalent(derivedState2.getCurrentRecord().getCurrentValue(), obj10)) {
                                                    this.statesToReread.add(derivedState2);
                                                } else {
                                                    Object obj11 = scatterMap64.get(derivedState2);
                                                    if (obj11 != null) {
                                                        if (obj11 instanceof ScatterSet2) {
                                                            ScatterSet2 scatterSet24 = (ScatterSet2) obj11;
                                                            Object[] objArr8 = scatterSet24.elements;
                                                            long[] jArr8 = scatterSet24.metadata;
                                                            int length4 = jArr8.length - 2;
                                                            if (length4 >= 0) {
                                                                int i21 = 0;
                                                                while (true) {
                                                                    long j7 = jArr8[i21];
                                                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i22 = 8 - ((~(i21 - length4)) >>> 31);
                                                                        for (int i23 = 0; i23 < i22; i23++) {
                                                                            if ((j7 & 255) < 128) {
                                                                                scatterSet2.add(objArr8[(i21 << 3) + i23]);
                                                                                z = true;
                                                                            }
                                                                            j7 >>= 8;
                                                                        }
                                                                        if (i22 != 8) {
                                                                            break;
                                                                        }
                                                                        if (i21 == length4) {
                                                                            break;
                                                                        }
                                                                        i21++;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            scatterSet2.add(obj11);
                                                            z = true;
                                                        }
                                                    }
                                                }
                                            }
                                            obj3 = obj4;
                                        }
                                    } else {
                                        str2 = str4;
                                        i3 = length;
                                        i4 = i11;
                                        j2 = j4;
                                        i5 = i12;
                                        obj3 = obj6;
                                    }
                                    Object obj12 = scatterMap64.get(obj3);
                                    if (obj12 != null) {
                                        if (obj12 instanceof ScatterSet2) {
                                            ScatterSet2 scatterSet25 = (ScatterSet2) obj12;
                                            Object[] objArr9 = scatterSet25.elements;
                                            long[] jArr9 = scatterSet25.metadata;
                                            int length5 = jArr9.length - 2;
                                            if (length5 >= 0) {
                                                int i24 = 0;
                                                while (true) {
                                                    long j8 = jArr9[i24];
                                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i25 = 8 - ((~(i24 - length5)) >>> 31);
                                                        for (int i26 = 0; i26 < i25; i26++) {
                                                            if ((j8 & 255) < 128) {
                                                                scatterSet2.add(objArr9[(i24 << 3) + i26]);
                                                                z = true;
                                                            }
                                                            j8 >>= 8;
                                                        }
                                                        if (i25 != 8) {
                                                            break;
                                                        }
                                                        if (i24 == length5) {
                                                            break;
                                                        }
                                                        i24++;
                                                    }
                                                }
                                            }
                                        } else {
                                            scatterSet2.add(obj12);
                                            z = true;
                                        }
                                    }
                                    i6 = 8;
                                } else {
                                    jArr4 = jArr5;
                                    objArr4 = objArr5;
                                    str2 = str4;
                                    i3 = length;
                                    i4 = i11;
                                    j2 = j4;
                                    i5 = i12;
                                    i6 = i10;
                                }
                                j4 = j2 >> i6;
                                i13++;
                                objArr5 = objArr4;
                                i10 = i6;
                                jArr5 = jArr4;
                                length = i3;
                                i11 = i4;
                                i12 = i5;
                                str4 = str2;
                            }
                            jArr3 = jArr5;
                            objArr3 = objArr5;
                            str = str4;
                            int i27 = length;
                            int i28 = i11;
                            if (i12 != i10) {
                                break;
                            }
                            length = i27;
                            i2 = i28;
                        } else {
                            jArr3 = jArr5;
                            objArr3 = objArr5;
                            str = str4;
                            i2 = i11;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i11 = i2 + 1;
                        objArr5 = objArr3;
                        jArr5 = jArr3;
                        str4 = str;
                        i10 = 8;
                    }
                } else {
                    z = false;
                }
            } else {
                Iterator it3 = changes.iterator();
                z = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof StateObjectImpl) || ((StateObjectImpl) next).m6431isReadInh_f27i8$runtime_release(StateObjectImpl2.m6430constructorimpl(2))) {
                        if (!ScopeMap.m6420containsimpl(scatterMap63, next) || (obj2 = scatterMap63.get(next)) == null) {
                            it = it3;
                            scatterMap6 = scatterMap63;
                            obj = scatterMap64.get(next);
                            if (obj != null) {
                                if (obj instanceof ScatterSet2) {
                                    ScatterSet2 scatterSet26 = (ScatterSet2) obj;
                                    Object[] objArr10 = scatterSet26.elements;
                                    long[] jArr10 = scatterSet26.metadata;
                                    int length6 = jArr10.length - 2;
                                    if (length6 >= 0) {
                                        while (true) {
                                            long j9 = jArr10[i];
                                            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i29 = 8 - ((~(i - length6)) >>> 31);
                                                for (int i30 = 0; i30 < i29; i30++) {
                                                    if ((j9 & 255) < 128) {
                                                        scatterSet2.add(objArr10[(i << 3) + i30]);
                                                        z = true;
                                                    }
                                                    j9 >>= 8;
                                                }
                                                if (i29 == 8) {
                                                    break;
                                                }
                                            }
                                            i = i != length6 ? i + 1 : 0;
                                        }
                                    }
                                } else {
                                    scatterSet2.add(obj);
                                    z = true;
                                }
                            }
                        } else {
                            if (obj2 instanceof ScatterSet2) {
                                ScatterSet2 scatterSet27 = (ScatterSet2) obj2;
                                Object[] objArr11 = scatterSet27.elements;
                                long[] jArr11 = scatterSet27.metadata;
                                int length7 = jArr11.length - 2;
                                if (length7 >= 0) {
                                    int i31 = 0;
                                    while (true) {
                                        long j10 = jArr11[i31];
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i32 = 8 - ((~(i31 - length7)) >>> 31);
                                            int i33 = 0;
                                            while (i33 < i32) {
                                                if ((j10 & 255) < 128) {
                                                    it2 = it3;
                                                    DerivedState<?> derivedState3 = (DerivedState) objArr11[(i31 << 3) + i33];
                                                    scatterMap62 = scatterMap63;
                                                    Intrinsics.checkNotNull(derivedState3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                    Object obj13 = map.get(derivedState3);
                                                    SnapshotMutationPolicy<?> policy3 = derivedState3.getPolicy();
                                                    if (policy3 == null) {
                                                        policy3 = SnapshotStateKt.structuralEqualityPolicy();
                                                    }
                                                    jArr2 = jArr11;
                                                    objArr2 = objArr11;
                                                    if (policy3.equivalent(derivedState3.getCurrentRecord().getCurrentValue(), obj13)) {
                                                        j = j10;
                                                        this.statesToReread.add(derivedState3);
                                                    } else {
                                                        Object obj14 = scatterMap64.get(derivedState3);
                                                        if (obj14 != null) {
                                                            if (obj14 instanceof ScatterSet2) {
                                                                ScatterSet2 scatterSet28 = (ScatterSet2) obj14;
                                                                Object[] objArr12 = scatterSet28.elements;
                                                                long[] jArr12 = scatterSet28.metadata;
                                                                int length8 = jArr12.length - 2;
                                                                if (length8 >= 0) {
                                                                    j = j10;
                                                                    int i34 = 0;
                                                                    boolean z5 = z;
                                                                    while (true) {
                                                                        long j11 = jArr12[i34];
                                                                        long[] jArr13 = jArr12;
                                                                        Object[] objArr13 = objArr12;
                                                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i35 = 8 - ((~(i34 - length8)) >>> 31);
                                                                            for (int i36 = 0; i36 < i35; i36++) {
                                                                                if ((j11 & 255) < 128) {
                                                                                    scatterSet2.add(objArr13[(i34 << 3) + i36]);
                                                                                    z5 = true;
                                                                                }
                                                                                j11 >>= 8;
                                                                            }
                                                                            if (i35 != 8) {
                                                                                break;
                                                                            }
                                                                            if (i34 == length8) {
                                                                                break;
                                                                            }
                                                                            i34++;
                                                                            objArr12 = objArr13;
                                                                            jArr12 = jArr13;
                                                                        }
                                                                    }
                                                                    z = z5;
                                                                }
                                                            } else {
                                                                j = j10;
                                                                scatterSet2.add(obj14);
                                                                z = true;
                                                            }
                                                        }
                                                    }
                                                    j10 = j >> 8;
                                                    i33++;
                                                    it3 = it2;
                                                    scatterMap63 = scatterMap62;
                                                    jArr11 = jArr2;
                                                    objArr11 = objArr2;
                                                } else {
                                                    it2 = it3;
                                                    scatterMap62 = scatterMap63;
                                                    jArr2 = jArr11;
                                                    objArr2 = objArr11;
                                                }
                                                j = j10;
                                                j10 = j >> 8;
                                                i33++;
                                                it3 = it2;
                                                scatterMap63 = scatterMap62;
                                                jArr11 = jArr2;
                                                objArr11 = objArr2;
                                            }
                                            it = it3;
                                            scatterMap6 = scatterMap63;
                                            jArr = jArr11;
                                            objArr = objArr11;
                                            if (i32 != 8) {
                                                break;
                                            }
                                        } else {
                                            it = it3;
                                            scatterMap6 = scatterMap63;
                                            jArr = jArr11;
                                            objArr = objArr11;
                                        }
                                        if (i31 == length7) {
                                            break;
                                        }
                                        i31++;
                                        it3 = it;
                                        scatterMap63 = scatterMap6;
                                        jArr11 = jArr;
                                        objArr11 = objArr;
                                    }
                                }
                            } else {
                                it = it3;
                                scatterMap6 = scatterMap63;
                                DerivedState<?> derivedState4 = (DerivedState) obj2;
                                Object obj15 = map.get(derivedState4);
                                SnapshotMutationPolicy<?> policy4 = derivedState4.getPolicy();
                                if (policy4 == null) {
                                    policy4 = SnapshotStateKt.structuralEqualityPolicy();
                                }
                                if (policy4.equivalent(derivedState4.getCurrentRecord().getCurrentValue(), obj15)) {
                                    this.statesToReread.add(derivedState4);
                                } else {
                                    Object obj16 = scatterMap64.get(derivedState4);
                                    if (obj16 != null) {
                                        if (obj16 instanceof ScatterSet2) {
                                            ScatterSet2 scatterSet29 = (ScatterSet2) obj16;
                                            Object[] objArr14 = scatterSet29.elements;
                                            long[] jArr14 = scatterSet29.metadata;
                                            int length9 = jArr14.length - 2;
                                            if (length9 >= 0) {
                                                int i37 = 0;
                                                while (true) {
                                                    long j12 = jArr14[i37];
                                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i38 = 8 - ((~(i37 - length9)) >>> 31);
                                                        for (int i39 = 0; i39 < i38; i39++) {
                                                            if ((j12 & 255) < 128) {
                                                                scatterSet2.add(objArr14[(i37 << 3) + i39]);
                                                                z = true;
                                                            }
                                                            j12 >>= 8;
                                                        }
                                                        if (i38 != 8) {
                                                            break;
                                                        }
                                                        if (i37 == length9) {
                                                            break;
                                                        }
                                                        i37++;
                                                    }
                                                }
                                            }
                                        } else {
                                            scatterSet2.add(obj16);
                                            z = true;
                                        }
                                    }
                                }
                            }
                            obj = scatterMap64.get(next);
                            if (obj != null) {
                            }
                        }
                        it3 = it;
                        scatterMap63 = scatterMap6;
                    } else {
                        it = it3;
                        scatterMap6 = scatterMap63;
                    }
                    it3 = it;
                    scatterMap63 = scatterMap6;
                }
            }
            if (this.statesToReread.getSize() != 0) {
                MutableVector<DerivedState<?>> mutableVector = this.statesToReread;
                DerivedState<?>[] derivedStateArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i40 = 0; i40 < size; i40++) {
                    rereadDerivedState(derivedStateArr[i40]);
                }
                this.statesToReread.clear();
            }
            return z;
        }

        public final void rereadDerivedState(DerivedState<?> derivedState) {
            long[] jArr;
            long[] jArr2;
            int i;
            ObjectIntMap2<Object> objectIntMap2;
            ScatterMap6<Object, ObjectIntMap2<Object>> scatterMap6 = this.scopeToValues;
            int iHashCode = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            Object obj = this.valueToScopes.get(derivedState);
            if (obj == null) {
                return;
            }
            if (obj instanceof ScatterSet2) {
                ScatterSet2 scatterSet2 = (ScatterSet2) obj;
                Object[] objArr = scatterSet2.elements;
                long[] jArr3 = scatterSet2.metadata;
                int length = jArr3.length - 2;
                if (length < 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    long j = jArr3[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((j & 255) < 128) {
                                i = i3;
                                Object obj2 = objArr[(i2 << 3) + i5];
                                ObjectIntMap2<Object> objectIntMap22 = scatterMap6.get(obj2);
                                jArr2 = jArr3;
                                if (objectIntMap22 == null) {
                                    objectIntMap2 = new ObjectIntMap2<>(0, 1, null);
                                    scatterMap6.set(obj2, objectIntMap2);
                                    Unit unit = Unit.INSTANCE;
                                } else {
                                    objectIntMap2 = objectIntMap22;
                                }
                                recordRead(derivedState, iHashCode, obj2, objectIntMap2);
                            } else {
                                jArr2 = jArr3;
                                i = i3;
                            }
                            j >>= i;
                            i5++;
                            i3 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i4 != i3) {
                            return;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i2 == length) {
                        return;
                    }
                    i2++;
                    jArr3 = jArr;
                }
            } else {
                ObjectIntMap2<Object> objectIntMap23 = scatterMap6.get(obj);
                if (objectIntMap23 == null) {
                    objectIntMap23 = new ObjectIntMap2<>(0, 1, null);
                    scatterMap6.set(obj, objectIntMap23);
                    Unit unit2 = Unit.INSTANCE;
                }
                recordRead(derivedState, iHashCode, obj, objectIntMap23);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void notifyInvalidatedScopes() {
            ScatterSet2<Object> scatterSet2 = this.invalidated;
            Function1<Object, Unit> function1 = this.onChanged;
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
                                function1.invoke(objArr[(i << 3) + i3]);
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
            scatterSet2.clear();
        }
    }
}
