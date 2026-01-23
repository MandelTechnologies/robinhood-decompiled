package androidx.constraintlayout.compose;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel5;

/* compiled from: MotionDragHandler.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$1$1", m3645f = "MotionDragHandler.kt", m3646l = {77, 80, 85}, m3647m = "invokeSuspend")
/* renamed from: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$1$1, reason: use source file name */
/* loaded from: classes4.dex */
final class MotionDragHandler2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Channel<MotionDragState> $dragChannel;
    final /* synthetic */ TransitionHandler $swipeHandler;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MotionDragHandler2(TransitionHandler transitionHandler, Channel<MotionDragState> channel, Continuation<? super MotionDragHandler2> continuation) {
        super(2, continuation);
        this.$swipeHandler = transitionHandler;
        this.$dragChannel = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MotionDragHandler2 motionDragHandler2 = new MotionDragHandler2(this.$swipeHandler, this.$dragChannel, continuation);
        motionDragHandler2.L$0 = obj;
        return motionDragHandler2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MotionDragHandler2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00aa -> B:34:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:36:0x00b6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        int i;
        MotionDragState motionDragState;
        CoroutineScope coroutineScope2;
        boolean isDragging;
        int i2;
        Object objMo28799tryReceivePtdJZtk;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            i = 0;
            motionDragState = null;
            if (JobKt.isActive(coroutineScope.getCoroutineContext())) {
            }
        } else if (i3 == 1) {
            int i4 = this.I$0;
            motionDragState = (MotionDragState) this.L$1;
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            i = i4;
            coroutineScope = coroutineScope3;
            objMo28799tryReceivePtdJZtk = this.$dragChannel.mo28799tryReceivePtdJZtk();
            if (Channel5.m28810isSuccessimpl(objMo28799tryReceivePtdJZtk)) {
            }
            if (JobKt.isActive(coroutineScope.getCoroutineContext())) {
            }
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = this.I$0;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                i2 = i5;
                coroutineScope = coroutineScope2;
                i = i2;
                motionDragState = null;
                objMo28799tryReceivePtdJZtk = this.$dragChannel.mo28799tryReceivePtdJZtk();
                if (Channel5.m28810isSuccessimpl(objMo28799tryReceivePtdJZtk)) {
                    motionDragState = (MotionDragState) Channel5.m28807getOrThrowimpl(objMo28799tryReceivePtdJZtk);
                    if (motionDragState.getIsDragging()) {
                        i = 0;
                    }
                }
                if (JobKt.isActive(coroutineScope.getCoroutineContext())) {
                    if (i != 0 && this.$swipeHandler.pendingProgressWhileTouchUp()) {
                        TransitionHandler transitionHandler = this.$swipeHandler;
                        this.L$0 = coroutineScope;
                        this.L$1 = motionDragState;
                        this.I$0 = i;
                        this.label = 1;
                        if (transitionHandler.updateProgressWhileTouchUp(this) != coroutine_suspended) {
                            i = i;
                            coroutineScope = coroutineScope;
                            objMo28799tryReceivePtdJZtk = this.$dragChannel.mo28799tryReceivePtdJZtk();
                            if (Channel5.m28810isSuccessimpl(objMo28799tryReceivePtdJZtk)) {
                            }
                            if (JobKt.isActive(coroutineScope.getCoroutineContext())) {
                            }
                        }
                    } else if (motionDragState == null) {
                        Channel<MotionDragState> channel = this.$dragChannel;
                        this.L$0 = coroutineScope;
                        this.L$1 = null;
                        this.label = 2;
                        obj = channel.receive(this);
                    } else {
                        MotionDragState motionDragState2 = motionDragState;
                        coroutineScope2 = coroutineScope;
                        JobKt.ensureActive(coroutineScope2.getCoroutineContext());
                        isDragging = motionDragState2.getIsDragging();
                        i2 = !isDragging ? 1 : 0;
                        if (isDragging) {
                            TransitionHandler transitionHandler2 = this.$swipeHandler;
                            long velocity = motionDragState2.getVelocity();
                            this.L$0 = coroutineScope2;
                            this.L$1 = null;
                            this.I$0 = i2;
                            this.label = 3;
                            if (transitionHandler2.m8183onTouchUpsFctU(velocity, this) != coroutine_suspended) {
                                i5 = i2;
                                i2 = i5;
                                coroutineScope = coroutineScope2;
                                i = i2;
                                motionDragState = null;
                                objMo28799tryReceivePtdJZtk = this.$dragChannel.mo28799tryReceivePtdJZtk();
                                if (Channel5.m28810isSuccessimpl(objMo28799tryReceivePtdJZtk)) {
                                }
                                if (JobKt.isActive(coroutineScope.getCoroutineContext())) {
                                }
                            }
                        } else {
                            this.$swipeHandler.m8184updateProgressOnDragk4lQ0M(motionDragState2.getDragAmount());
                            coroutineScope = coroutineScope2;
                            i = i2;
                            motionDragState = null;
                            objMo28799tryReceivePtdJZtk = this.$dragChannel.mo28799tryReceivePtdJZtk();
                            if (Channel5.m28810isSuccessimpl(objMo28799tryReceivePtdJZtk)) {
                            }
                            if (JobKt.isActive(coroutineScope.getCoroutineContext())) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            motionDragState = (MotionDragState) obj;
            MotionDragState motionDragState22 = motionDragState;
            coroutineScope2 = coroutineScope;
            JobKt.ensureActive(coroutineScope2.getCoroutineContext());
            isDragging = motionDragState22.getIsDragging();
            i2 = !isDragging ? 1 : 0;
            if (isDragging) {
            }
        }
    }
}
