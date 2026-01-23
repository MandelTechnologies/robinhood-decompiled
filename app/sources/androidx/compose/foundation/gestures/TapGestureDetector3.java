package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Dp4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: TapGestureDetector.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u0007*\u00020\u000bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u0006*\u00020\u000bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u0006*\u00020\u0011H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0010\u001a\u00020\u0006*\u00020\u0007H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u0016*\u00020\u0015H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u0011*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u0011*\u00020\u000bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u000fJ\u0014\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0097\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u0015*\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0018J\u0017\u0010%\u001a\u00020\u000b*\u00020\u0006H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u000b*\u00020\u0011H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010$J\u001a\u0010%\u001a\u00020\u000b*\u00020\u0007H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020(¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020(H\u0086@¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.H\u0096@¢\u0006\u0004\b/\u0010-R\u0016\u00100\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00118\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u00109\u001a\u00020\u00118\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b8\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, m3636d2 = {"Landroidx/compose/foundation/gestures/PressGestureScopeImpl;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "", "cancel", "()V", "release", "reset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tryAwaitRelease", "isReleased", "Z", "isCanceled", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "getDensity", "()F", "getFontScale", "fontScale", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl, reason: use source file name */
/* loaded from: classes4.dex */
public final class TapGestureDetector3 implements TapGestureDetector2, Density {
    private final /* synthetic */ Density $$delegate_0;
    private boolean isCanceled;
    private boolean isReleased;
    private final Mutex mutex = Mutex3.Mutex(false);

    /* compiled from: TapGestureDetector.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m3645f = "TapGestureDetector.kt", m3646l = {531}, m3647m = "reset")
    /* renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 */
    static final class C11251 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11251(Continuation<? super C11251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetector3.this.reset(this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", m3645f = "TapGestureDetector.kt", m3646l = {544}, m3647m = "tryAwaitRelease")
    /* renamed from: androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 */
    static final class C11261 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11261(Continuation<? super C11261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetector3.this.tryAwaitRelease(this);
        }
    }

    @Override // androidx.compose.p011ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
    public int mo5009roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo5009roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: roundToPx-0680j_4, reason: not valid java name */
    public int mo5010roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo5010roundToPx0680j_4(f);
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA, reason: not valid java name */
    public float mo5011toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo5011toDpGaN1DYA(j);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
    public float mo5012toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo5012toDpu2uoSUM(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toDp-u2uoSUM, reason: not valid java name */
    public float mo5013toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo5013toDpu2uoSUM(i);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
    public long mo5014toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo5014toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toPx--R2X_6o, reason: not valid java name */
    public float mo5015toPxR2X_6o(long j) {
        return this.$$delegate_0.mo5015toPxR2X_6o(j);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toPx-0680j_4, reason: not valid java name */
    public float mo5016toPx0680j_4(float f) {
        return this.$$delegate_0.mo5016toPx0680j_4(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    public Rect toRect(Dp4 dp4) {
        return this.$$delegate_0.toRect(dp4);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
    public long mo5017toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo5017toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do, reason: not valid java name */
    public long mo5018toSp0xMU5do(float f) {
        return this.$$delegate_0.mo5018toSp0xMU5do(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
    public long mo5019toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo5019toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
    public long mo5020toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo5020toSpkPz2Gy4(i);
    }

    public TapGestureDetector3(Density density) {
        this.$$delegate_0 = density;
    }

    public final void cancel() {
        this.isCanceled = true;
        if (this.mutex.isLocked()) {
            Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
        }
    }

    public final void release() {
        this.isReleased = true;
        if (this.mutex.isLocked()) {
            Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reset(Continuation<? super Unit> continuation) {
        C11251 c11251;
        TapGestureDetector3 tapGestureDetector3;
        if (continuation instanceof C11251) {
            c11251 = (C11251) continuation;
            int i = c11251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11251.label = i - Integer.MIN_VALUE;
            } else {
                c11251 = new C11251(continuation);
            }
        }
        Object obj = c11251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11251.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex = this.mutex;
            c11251.L$0 = this;
            c11251.label = 1;
            if (Mutex.DefaultImpls.lock$default(mutex, null, c11251, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            tapGestureDetector3 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tapGestureDetector3 = (TapGestureDetector3) c11251.L$0;
            ResultKt.throwOnFailure(obj);
        }
        tapGestureDetector3.isReleased = false;
        tapGestureDetector3.isCanceled = false;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.TapGestureDetector2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object tryAwaitRelease(Continuation<? super Boolean> continuation) {
        C11261 c11261;
        TapGestureDetector3 tapGestureDetector3;
        if (continuation instanceof C11261) {
            c11261 = (C11261) continuation;
            int i = c11261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11261.label = i - Integer.MIN_VALUE;
            } else {
                c11261 = new C11261(continuation);
            }
        }
        Object obj = c11261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.isReleased && !this.isCanceled) {
                Mutex mutex = this.mutex;
                c11261.L$0 = this;
                c11261.label = 1;
                if (Mutex.DefaultImpls.lock$default(mutex, null, c11261, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapGestureDetector3 = this;
            } else {
                tapGestureDetector3 = this;
                return boxing.boxBoolean(tapGestureDetector3.isReleased);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tapGestureDetector3 = (TapGestureDetector3) c11261.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Mutex.DefaultImpls.unlock$default(tapGestureDetector3.mutex, null, 1, null);
        return boxing.boxBoolean(tapGestureDetector3.isReleased);
    }
}
