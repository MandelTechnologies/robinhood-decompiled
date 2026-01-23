package com.robinhood.compose.bento.util;

import androidx.compose.foundation.gestures.ForEachGesture2;
import androidx.compose.foundation.gestures.TapGestureDetector2;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.Dp4;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: PointerInputScopes.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0012\u001a\u00020\u0013*\u00020\u0014H\u0097\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0012\u001a\u00020\u0013*\u00020\u0017H\u0097\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u0014*\u00020\u001bH\u0097\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u001a\u001a\u00020\u0014*\u00020\u0013H\u0097\u0001¢\u0006\u0004\b\u001c\u0010\u001eJ\u0014\u0010\u001a\u001a\u00020\u0014*\u00020\u0017H\u0097\u0001¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010!\u001a\u00020\"*\u00020#H\u0097\u0001¢\u0006\u0004\b$\u0010%J\u0014\u0010&\u001a\u00020\u001b*\u00020\u0014H\u0097\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0014\u0010&\u001a\u00020\u001b*\u00020\u0017H\u0097\u0001¢\u0006\u0004\b(\u0010 J\r\u0010)\u001a\u00020**\u00020+H\u0097\u0001J\u0014\u0010,\u001a\u00020#*\u00020\"H\u0097\u0001¢\u0006\u0004\b-\u0010%J\u0014\u0010.\u001a\u00020\u0017*\u00020\u001bH\u0097\u0001¢\u0006\u0004\b/\u00100J\u0014\u0010.\u001a\u00020\u0017*\u00020\u0013H\u0097\u0001¢\u0006\u0004\b/\u00101J\u0014\u0010.\u001a\u00020\u0017*\u00020\u0014H\u0097\u0001¢\u0006\u0004\b2\u00100R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u001b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u001b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b6\u00104¨\u00067"}, m3636d2 = {"Lcom/robinhood/compose/bento/util/PressGestureScopeImpl;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "isReleased", "", "isCanceled", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "cancel", "", "release", "reset", "awaitRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryAwaitRelease", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "toDp-GaN1DYA", "(J)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-kPz2Gy4", "(F)J", "(I)J", "toSp-0xMU5do", "getDensity", "()F", "fontScale", "getFontScale", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.util.PressGestureScopeImpl, reason: use source file name */
/* loaded from: classes15.dex */
final class PointerInputScopes2 implements TapGestureDetector2, Density {
    private final /* synthetic */ Density $$delegate_0;
    private boolean isCanceled;
    private boolean isReleased;
    private final Mutex mutex;

    /* compiled from: PointerInputScopes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.compose.bento.util.PressGestureScopeImpl", m3645f = "PointerInputScopes.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m3647m = "awaitRelease")
    /* renamed from: com.robinhood.compose.bento.util.PressGestureScopeImpl$awaitRelease$1 */
    static final class C326651 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C326651(Continuation<? super C326651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PointerInputScopes2.this.awaitRelease(this);
        }
    }

    /* compiled from: PointerInputScopes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.compose.bento.util.PressGestureScopeImpl", m3645f = "PointerInputScopes.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m3647m = "tryAwaitRelease")
    /* renamed from: com.robinhood.compose.bento.util.PressGestureScopeImpl$tryAwaitRelease$1 */
    static final class C326661 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C326661(Continuation<? super C326661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PointerInputScopes2.this.tryAwaitRelease(this);
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
    /* renamed from: roundToPx--R2X_6o */
    public int mo5009roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo5009roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo5010roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo5010roundToPx0680j_4(f);
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo5011toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo5011toDpGaN1DYA(j);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo5012toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo5012toDpu2uoSUM(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo5013toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo5013toDpu2uoSUM(i);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo5014toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo5014toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo5015toPxR2X_6o(long j) {
        return this.$$delegate_0.mo5015toPxR2X_6o(j);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo5016toPx0680j_4(float f) {
        return this.$$delegate_0.mo5016toPx0680j_4(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    public Rect toRect(Dp4 dp4) {
        Intrinsics.checkNotNullParameter(dp4, "<this>");
        return this.$$delegate_0.toRect(dp4);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo5017toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo5017toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo5018toSp0xMU5do(float f) {
        return this.$$delegate_0.mo5018toSp0xMU5do(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo5019toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo5019toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.p011ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo5020toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo5020toSpkPz2Gy4(i);
    }

    public PointerInputScopes2(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.$$delegate_0 = density;
        this.mutex = Mutex3.Mutex(false);
    }

    public final void cancel() {
        this.isCanceled = true;
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
    }

    public final void release() {
        this.isReleased = true;
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
    }

    public final void reset() {
        Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null);
        this.isReleased = false;
        this.isCanceled = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitRelease(Continuation<? super Unit> continuation) {
        C326651 c326651;
        if (continuation instanceof C326651) {
            c326651 = (C326651) continuation;
            int i = c326651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c326651.label = i - Integer.MIN_VALUE;
            } else {
                c326651 = new C326651(continuation);
            }
        }
        Object objTryAwaitRelease = c326651.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c326651.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTryAwaitRelease);
            c326651.label = 1;
            objTryAwaitRelease = tryAwaitRelease(c326651);
            if (objTryAwaitRelease == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTryAwaitRelease);
        }
        if (!((Boolean) objTryAwaitRelease).booleanValue()) {
            throw new ForEachGesture2("The press gesture was canceled.");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.TapGestureDetector2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object tryAwaitRelease(Continuation<? super Boolean> continuation) {
        C326661 c326661;
        if (continuation instanceof C326661) {
            c326661 = (C326661) continuation;
            int i = c326661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c326661.label = i - Integer.MIN_VALUE;
            } else {
                c326661 = new C326661(continuation);
            }
        }
        Object obj = c326661.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c326661.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.isReleased && !this.isCanceled) {
                Mutex mutex = this.mutex;
                c326661.label = 1;
                if (Mutex.DefaultImpls.lock$default(mutex, null, c326661, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return boxing.boxBoolean(this.isReleased);
    }
}
