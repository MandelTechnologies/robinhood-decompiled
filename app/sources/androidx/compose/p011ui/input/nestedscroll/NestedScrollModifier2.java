package androidx.compose.p011ui.input.nestedscroll;

import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NestedScrollModifier.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR*\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010(\u001a\u0004\u0018\u00010!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0011\u0010/\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b.\u0010+R\u0016\u00103\u001a\u0004\u0018\u0001008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, m3636d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "dispatchPreScroll-OzD1aCk", "(JI)J", "dispatchPreScroll", "consumed", "dispatchPostScroll-DzOQY0M", "(JJI)J", "dispatchPostScroll", "Landroidx/compose/ui/unit/Velocity;", "dispatchPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPreFling", "dispatchPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPostFling", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "nestedScrollNode", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "getNestedScrollNode$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "setNestedScrollNode$ui_release", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;)V", "lastKnownParentNode", "getLastKnownParentNode$ui_release", "setLastKnownParentNode$ui_release", "Lkotlin/Function0;", "Lkotlinx/coroutines/CoroutineScope;", "calculateNestedScrollScope", "Lkotlin/jvm/functions/Function0;", "getCalculateNestedScrollScope$ui_release", "()Lkotlin/jvm/functions/Function0;", "setCalculateNestedScrollScope$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope$ui_release", "()Lkotlinx/coroutines/CoroutineScope;", "setScope$ui_release", "(Lkotlinx/coroutines/CoroutineScope;)V", "getCoroutineScope", "coroutineScope", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getParent$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "parent", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher, reason: use source file name */
/* loaded from: classes.dex */
public final class NestedScrollModifier2 {
    private Function0<? extends CoroutineScope> calculateNestedScrollScope = new Function0<CoroutineScope>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineScope invoke() {
            return this.this$0.getScope();
        }
    };
    private NestedScrollNode lastKnownParentNode;
    private NestedScrollNode nestedScrollNode;
    private CoroutineScope scope;

    /* renamed from: getNestedScrollNode$ui_release, reason: from getter */
    public final NestedScrollNode getNestedScrollNode() {
        return this.nestedScrollNode;
    }

    public final void setNestedScrollNode$ui_release(NestedScrollNode nestedScrollNode) {
        this.nestedScrollNode = nestedScrollNode;
    }

    public final void setLastKnownParentNode$ui_release(NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    public final void setCalculateNestedScrollScope$ui_release(Function0<? extends CoroutineScope> function0) {
        this.calculateNestedScrollScope = function0;
    }

    /* renamed from: getScope$ui_release, reason: from getter */
    public final CoroutineScope getScope() {
        return this.scope;
    }

    public final void setScope$ui_release(CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    public final CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScopeInvoke = this.calculateNestedScrollScope.invoke();
        if (coroutineScopeInvoke != null) {
            return coroutineScopeInvoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final NestedScrollModifier getParent$ui_release() {
        NestedScrollNode nestedScrollNode = this.nestedScrollNode;
        if (nestedScrollNode != null) {
            return nestedScrollNode.getParentNestedScrollNode$ui_release();
        }
        return null;
    }

    /* renamed from: dispatchPreScroll-OzD1aCk, reason: not valid java name */
    public final long m7131dispatchPreScrollOzD1aCk(long available, int source) {
        NestedScrollModifier parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo5298onPreScrollOzD1aCk(available, source) : Offset.INSTANCE.m6553getZeroF1C5BW0();
    }

    /* renamed from: dispatchPostScroll-DzOQY0M, reason: not valid java name */
    public final long m7129dispatchPostScrollDzOQY0M(long consumed, long available, int source) {
        NestedScrollModifier parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo5024onPostScrollDzOQY0M(consumed, available, source) : Offset.INSTANCE.m6553getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7130dispatchPreFlingQWom1Mo(long j, Continuation<? super Velocity> continuation) {
        NestedScrollModifier5 nestedScrollModifier5;
        long jM8109getZero9UxMQ8M;
        if (continuation instanceof NestedScrollModifier5) {
            nestedScrollModifier5 = (NestedScrollModifier5) continuation;
            int i = nestedScrollModifier5.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollModifier5.label = i - Integer.MIN_VALUE;
            } else {
                nestedScrollModifier5 = new NestedScrollModifier5(this, continuation);
            }
        }
        Object objMo5609onPreFlingQWom1Mo = nestedScrollModifier5.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = nestedScrollModifier5.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo5609onPreFlingQWom1Mo);
            NestedScrollModifier parent$ui_release = getParent$ui_release();
            if (parent$ui_release == null) {
                jM8109getZero9UxMQ8M = Velocity.INSTANCE.m8109getZero9UxMQ8M();
                return Velocity.m8095boximpl(jM8109getZero9UxMQ8M);
            }
            nestedScrollModifier5.label = 1;
            objMo5609onPreFlingQWom1Mo = parent$ui_release.mo5609onPreFlingQWom1Mo(j, nestedScrollModifier5);
            if (objMo5609onPreFlingQWom1Mo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo5609onPreFlingQWom1Mo);
        }
        jM8109getZero9UxMQ8M = ((Velocity) objMo5609onPreFlingQWom1Mo).getPackedValue();
        return Velocity.m8095boximpl(jM8109getZero9UxMQ8M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7128dispatchPostFlingRZ2iAVY(long j, long j2, Continuation<? super Velocity> continuation) {
        NestedScrollModifier4 nestedScrollModifier4;
        long jM8109getZero9UxMQ8M;
        if (continuation instanceof NestedScrollModifier4) {
            nestedScrollModifier4 = (NestedScrollModifier4) continuation;
            int i = nestedScrollModifier4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollModifier4.label = i - Integer.MIN_VALUE;
            } else {
                nestedScrollModifier4 = new NestedScrollModifier4(this, continuation);
            }
        }
        NestedScrollModifier4 nestedScrollModifier42 = nestedScrollModifier4;
        Object objMo5023onPostFlingRZ2iAVY = nestedScrollModifier42.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = nestedScrollModifier42.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo5023onPostFlingRZ2iAVY);
            if (getParent$ui_release() == null && ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled) {
                NestedScrollNode nestedScrollNode = this.lastKnownParentNode;
                if (nestedScrollNode != null) {
                    nestedScrollModifier42.label = 1;
                    objMo5023onPostFlingRZ2iAVY = nestedScrollNode.mo5023onPostFlingRZ2iAVY(j, j2, nestedScrollModifier42);
                } else {
                    jM8109getZero9UxMQ8M = Velocity.INSTANCE.m8109getZero9UxMQ8M();
                }
            } else {
                NestedScrollModifier parent$ui_release = getParent$ui_release();
                if (parent$ui_release != null) {
                    nestedScrollModifier42.label = 2;
                    objMo5023onPostFlingRZ2iAVY = parent$ui_release.mo5023onPostFlingRZ2iAVY(j, j2, nestedScrollModifier42);
                } else {
                    jM8109getZero9UxMQ8M = Velocity.INSTANCE.m8109getZero9UxMQ8M();
                }
            }
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(objMo5023onPostFlingRZ2iAVY);
            jM8109getZero9UxMQ8M = ((Velocity) objMo5023onPostFlingRZ2iAVY).getPackedValue();
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo5023onPostFlingRZ2iAVY);
            jM8109getZero9UxMQ8M = ((Velocity) objMo5023onPostFlingRZ2iAVY).getPackedValue();
        }
        return Velocity.m8095boximpl(jM8109getZero9UxMQ8M);
    }
}
