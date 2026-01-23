package com.google.maps.android.compose;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver2;
import androidx.compose.runtime.saveable.Saver5;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.compose.CameraPositionState;
import com.plaid.internal.EnumC7081g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;

/* compiled from: CameraPositionState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u0000 C2\u00020\u0001:\u0002CDB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0087@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001bR+\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010*\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020$8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010/\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u0005R\u0014\u00100\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R/\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u001f\u001a\u0004\b3\u00104\"\u0004\b\u0017\u0010\u0016R/\u00109\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001f\u001a\u0004\b6\u00107\"\u0004\b8\u0010\nR/\u0010?\u001a\u0004\u0018\u00010\u00012\b\u0010\u001d\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u001f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010-\"\u0004\bB\u0010\u0005¨\u0006E"}, m3636d2 = {"Lcom/google/maps/android/compose/CameraPositionState;", "", "Lcom/google/android/gms/maps/model/CameraPosition;", "position", "<init>", "(Lcom/google/android/gms/maps/model/CameraPosition;)V", "Lcom/google/maps/android/compose/CameraPositionState$OnMapChangedCallback;", "callback", "", "doOnMapChangedLocked", "(Lcom/google/maps/android/compose/CameraPositionState$OnMapChangedCallback;)V", "Lcom/google/android/gms/maps/GoogleMap;", "map", "Lcom/google/android/gms/maps/CameraUpdate;", "update", "", "durationMs", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "performAnimateCameraLocked", "(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/CameraUpdate;ILkotlinx/coroutines/CancellableContinuation;)V", "setMap$maps_compose_release", "(Lcom/google/android/gms/maps/GoogleMap;)V", "setMap", "animate", "(Lcom/google/android/gms/maps/CameraUpdate;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "move", "(Lcom/google/android/gms/maps/CameraUpdate;)V", "", "<set-?>", "isMoving$delegate", "Landroidx/compose/runtime/MutableState;", "isMoving", "()Z", "setMoving$maps_compose_release", "(Z)V", "Lcom/google/maps/android/compose/CameraMoveStartedReason;", "cameraMoveStartedReason$delegate", "getCameraMoveStartedReason", "()Lcom/google/maps/android/compose/CameraMoveStartedReason;", "setCameraMoveStartedReason$maps_compose_release", "(Lcom/google/maps/android/compose/CameraMoveStartedReason;)V", "cameraMoveStartedReason", "rawPosition$delegate", "getRawPosition$maps_compose_release", "()Lcom/google/android/gms/maps/model/CameraPosition;", "setRawPosition$maps_compose_release", "rawPosition", "lock", "Lkotlin/Unit;", "map$delegate", "getMap", "()Lcom/google/android/gms/maps/GoogleMap;", "onMapChanged$delegate", "getOnMapChanged", "()Lcom/google/maps/android/compose/CameraPositionState$OnMapChangedCallback;", "setOnMapChanged", "onMapChanged", "movementOwner$delegate", "getMovementOwner", "()Ljava/lang/Object;", "setMovementOwner", "(Ljava/lang/Object;)V", "movementOwner", "value", "getPosition", "setPosition", "Companion", "OnMapChangedCallback", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class CameraPositionState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<CameraPositionState, CameraPosition> Saver = Saver2.Saver(new Function2<Saver5, CameraPositionState, CameraPosition>() { // from class: com.google.maps.android.compose.CameraPositionState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final CameraPosition invoke(Saver5 Saver2, CameraPositionState it) {
            Intrinsics.checkNotNullParameter(Saver2, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getPosition();
        }
    }, new Function1<CameraPosition, CameraPositionState>() { // from class: com.google.maps.android.compose.CameraPositionState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public final CameraPositionState invoke(CameraPosition it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new CameraPositionState(it);
        }
    });

    /* renamed from: cameraMoveStartedReason$delegate, reason: from kotlin metadata */
    private final SnapshotState cameraMoveStartedReason;

    /* renamed from: isMoving$delegate, reason: from kotlin metadata */
    private final SnapshotState isMoving;
    private final Unit lock;

    /* renamed from: map$delegate, reason: from kotlin metadata */
    private final SnapshotState map;

    /* renamed from: movementOwner$delegate, reason: from kotlin metadata */
    private final SnapshotState movementOwner;

    /* renamed from: onMapChanged$delegate, reason: from kotlin metadata */
    private final SnapshotState onMapChanged;

    /* renamed from: rawPosition$delegate, reason: from kotlin metadata */
    private final SnapshotState rawPosition;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CameraPositionState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/google/maps/android/compose/CameraPositionState$OnMapChangedCallback;", "", "onCancelLocked", "", "onMapChangedLocked", "newMap", "Lcom/google/android/gms/maps/GoogleMap;", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    interface OnMapChangedCallback {

        /* compiled from: CameraPositionState.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static void onCancelLocked(OnMapChangedCallback onMapChangedCallback) {
            }
        }

        void onCancelLocked();

        void onMapChangedLocked(GoogleMap newMap);
    }

    /* compiled from: CameraPositionState.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.google.maps.android.compose.CameraPositionState", m3645f = "CameraPositionState.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE}, m3647m = "animate")
    /* renamed from: com.google.maps.android.compose.CameraPositionState$animate$1 */
    static final class C56201 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C56201(Continuation<? super C56201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CameraPositionState.this.animate(null, 0, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CameraPositionState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public CameraPositionState(CameraPosition position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.isMoving = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.cameraMoveStartedReason = SnapshotState3.mutableStateOf$default(CameraMoveStartedReason.NO_MOVEMENT_YET, null, 2, null);
        this.rawPosition = SnapshotState3.mutableStateOf$default(position, null, 2, null);
        this.lock = Unit.INSTANCE;
        this.map = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.onMapChanged = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.movementOwner = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    public /* synthetic */ CameraPositionState(CameraPosition cameraPosition, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CameraPosition(new LatLng(0.0d, 0.0d), 0.0f, 0.0f, 0.0f) : cameraPosition);
    }

    public final void setMoving$maps_compose_release(boolean z) {
        this.isMoving.setValue(Boolean.valueOf(z));
    }

    public final void setCameraMoveStartedReason$maps_compose_release(CameraMoveStartedReason cameraMoveStartedReason) {
        Intrinsics.checkNotNullParameter(cameraMoveStartedReason, "<set-?>");
        this.cameraMoveStartedReason.setValue(cameraMoveStartedReason);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CameraPosition getRawPosition$maps_compose_release() {
        return (CameraPosition) this.rawPosition.getValue();
    }

    public final void setRawPosition$maps_compose_release(CameraPosition cameraPosition) {
        Intrinsics.checkNotNullParameter(cameraPosition, "<set-?>");
        this.rawPosition.setValue(cameraPosition);
    }

    public final CameraPosition getPosition() {
        return getRawPosition$maps_compose_release();
    }

    public final void setPosition(CameraPosition value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            try {
                GoogleMap map = getMap();
                if (map == null) {
                    setRawPosition$maps_compose_release(value);
                } else {
                    map.moveCamera(CameraUpdateFactory.newCameraPosition(value));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final GoogleMap getMap() {
        return (GoogleMap) this.map.getValue();
    }

    private final void setMap(GoogleMap googleMap) {
        this.map.setValue(googleMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnMapChangedCallback getOnMapChanged() {
        return (OnMapChangedCallback) this.onMapChanged.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOnMapChanged(OnMapChangedCallback onMapChangedCallback) {
        this.onMapChanged.setValue(onMapChangedCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doOnMapChangedLocked(OnMapChangedCallback callback) {
        OnMapChangedCallback onMapChanged = getOnMapChanged();
        if (onMapChanged != null) {
            onMapChanged.onCancelLocked();
        }
        setOnMapChanged(callback);
    }

    private final Object getMovementOwner() {
        return this.movementOwner.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMovementOwner(Object obj) {
        this.movementOwner.setValue(obj);
    }

    public final void setMap$maps_compose_release(GoogleMap map) {
        synchronized (this.lock) {
            try {
                if (getMap() == null && map == null) {
                    return;
                }
                if (getMap() != null && map != null) {
                    throw new IllegalStateException("CameraPositionState may only be associated with one GoogleMap at a time");
                }
                setMap(map);
                if (map == null) {
                    setMoving$maps_compose_release(false);
                } else {
                    map.moveCamera(CameraUpdateFactory.newCameraPosition(getPosition()));
                }
                OnMapChangedCallback onMapChanged = getOnMapChanged();
                if (onMapChanged != null) {
                    setOnMapChanged(null);
                    onMapChanged.onMapChangedLocked(map);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object animate$default(CameraPositionState cameraPositionState, CameraUpdate cameraUpdate, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return cameraPositionState.animate(cameraUpdate, i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.maps.android.compose.CameraPositionState$OnMapChangedCallback, com.google.maps.android.compose.CameraPositionState$animate$2$1$animateOnMapAvailable$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animate(final CameraUpdate cameraUpdate, final int i, Continuation<? super Unit> continuation) throws Throwable {
        C56201 c56201;
        Throwable th;
        Job job;
        CameraPositionState cameraPositionState;
        if (continuation instanceof C56201) {
            c56201 = (C56201) continuation;
            int i2 = c56201.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c56201.label = i2 - Integer.MIN_VALUE;
            } else {
                c56201 = new C56201(continuation);
            }
        }
        Object obj = c56201.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c56201.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            job = (Job) c56201.L$2;
            cameraPositionState = (CameraPositionState) c56201.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                synchronized (cameraPositionState.lock) {
                    if (job != null) {
                        if (cameraPositionState.getMovementOwner() == job) {
                            cameraPositionState.setMovementOwner(null);
                            GoogleMap map = cameraPositionState.getMap();
                            if (map != null) {
                                map.stopAnimation();
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                synchronized (cameraPositionState.lock) {
                    if (job != null) {
                        try {
                            if (cameraPositionState.getMovementOwner() == job) {
                                cameraPositionState.setMovementOwner(null);
                                GoogleMap map2 = cameraPositionState.getMap();
                                if (map2 != null) {
                                    map2.stopAnimation();
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        Job job2 = (Job) c56201.getContext().get(Job.INSTANCE);
        try {
            c56201.L$0 = this;
            c56201.L$1 = cameraUpdate;
            c56201.L$2 = job2;
            c56201.I$0 = i;
            c56201.label = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(c56201), 1);
            cancellableContinuationImpl.initCancellability();
            this.lock;
            synchronized (Unit.INSTANCE) {
                try {
                    setMovementOwner(job2);
                    GoogleMap map3 = getMap();
                    if (map3 == null) {
                        final ?? r5 = new OnMapChangedCallback() { // from class: com.google.maps.android.compose.CameraPositionState$animate$2$1$animateOnMapAvailable$1
                            @Override // com.google.maps.android.compose.CameraPositionState.OnMapChangedCallback
                            public void onMapChangedLocked(GoogleMap newMap) {
                                if (newMap != null) {
                                    this.performAnimateCameraLocked(newMap, cameraUpdate, i, cancellableContinuationImpl);
                                    return;
                                }
                                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                                Result.Companion companion = Result.INSTANCE;
                                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new CancellationException("internal error; no GoogleMap available"))));
                                throw new IllegalStateException("internal error; no GoogleMap available to animate position");
                            }

                            @Override // com.google.maps.android.compose.CameraPositionState.OnMapChangedCallback
                            public void onCancelLocked() {
                                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                                Result.Companion companion = Result.INSTANCE;
                                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new CancellationException("Animation cancelled"))));
                            }
                        };
                        doOnMapChangedLocked(r5);
                        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.google.maps.android.compose.CameraPositionState$animate$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th4) {
                                invoke2(th4);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Throwable th4) {
                                this.this$0.lock;
                                Unit unit2 = Unit.INSTANCE;
                                CameraPositionState cameraPositionState2 = this.this$0;
                                CameraPositionState$animate$2$1$animateOnMapAvailable$1 cameraPositionState$animate$2$1$animateOnMapAvailable$1 = r5;
                                synchronized (unit2) {
                                    if (cameraPositionState2.getOnMapChanged() == cameraPositionState$animate$2$1$animateOnMapAvailable$1) {
                                        cameraPositionState2.setOnMapChanged(null);
                                    }
                                }
                            }
                        });
                    } else {
                        performAnimateCameraLocked(map3, cameraUpdate, i, cancellableContinuationImpl);
                    }
                } finally {
                }
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(c56201);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            cameraPositionState = this;
            job = job2;
            synchronized (cameraPositionState.lock) {
            }
        } catch (Throwable th4) {
            th = th4;
            job = job2;
            cameraPositionState = this;
            synchronized (cameraPositionState.lock) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performAnimateCameraLocked(final GoogleMap map, CameraUpdate update, int durationMs, final CancellableContinuation<? super Unit> continuation) {
        GoogleMap.CancelableCallback cancelableCallback = new GoogleMap.CancelableCallback() { // from class: com.google.maps.android.compose.CameraPositionState$performAnimateCameraLocked$cancelableCallback$1
            @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
            public void onCancel() {
                CancellableContinuation<Unit> cancellableContinuation = continuation;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new CancellationException("Animation cancelled"))));
            }

            @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
            public void onFinish() {
                CancellableContinuation<Unit> cancellableContinuation = continuation;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }
        };
        if (durationMs == Integer.MAX_VALUE) {
            map.animateCamera(update, cancelableCallback);
        } else {
            map.animateCamera(update, durationMs, cancelableCallback);
        }
        doOnMapChangedLocked(new OnMapChangedCallback() { // from class: com.google.maps.android.compose.CameraPositionState.performAnimateCameraLocked.1
            @Override // com.google.maps.android.compose.CameraPositionState.OnMapChangedCallback
            public void onCancelLocked() {
                OnMapChangedCallback.DefaultImpls.onCancelLocked(this);
            }

            @Override // com.google.maps.android.compose.CameraPositionState.OnMapChangedCallback
            public final void onMapChangedLocked(GoogleMap googleMap) {
                if (googleMap != null) {
                    throw new IllegalStateException("New GoogleMap unexpectedly set while an animation was still running");
                }
                map.stopAnimation();
            }
        });
    }

    public final void move(final CameraUpdate update) {
        Intrinsics.checkNotNullParameter(update, "update");
        synchronized (this.lock) {
            try {
                GoogleMap map = getMap();
                setMovementOwner(null);
                if (map == null) {
                    doOnMapChangedLocked(new OnMapChangedCallback() { // from class: com.google.maps.android.compose.CameraPositionState$move$1$1
                        @Override // com.google.maps.android.compose.CameraPositionState.OnMapChangedCallback
                        public void onCancelLocked() {
                            CameraPositionState.OnMapChangedCallback.DefaultImpls.onCancelLocked(this);
                        }

                        @Override // com.google.maps.android.compose.CameraPositionState.OnMapChangedCallback
                        public final void onMapChangedLocked(GoogleMap googleMap) {
                            if (googleMap != null) {
                                googleMap.moveCamera(update);
                            }
                        }
                    });
                } else {
                    map.moveCamera(update);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: CameraPositionState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/google/maps/android/compose/CameraPositionState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/google/maps/android/compose/CameraPositionState;", "Lcom/google/android/gms/maps/model/CameraPosition;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "maps-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<CameraPositionState, CameraPosition> getSaver() {
            return CameraPositionState.Saver;
        }
    }
}
