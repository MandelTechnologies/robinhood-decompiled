package androidx.compose.foundation.text.input.internal;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import com.plaid.internal.EnumC7081g;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* compiled from: CursorAnimationState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR*\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\r0\fj\n\u0012\u0006\u0012\u0004\u0018\u00010\r`\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R+\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnimationState;", "", "", "animate", "<init>", "(Z)V", "", "snapToVisibleAndAnimate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Z", "getAnimate", "()Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/Job;", "Landroidx/compose/foundation/AtomicReference;", "animationJob", "Ljava/util/concurrent/atomic/AtomicReference;", "", "<set-?>", "cursorAlpha$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getCursorAlpha", "()F", "setCursorAlpha", "(F)V", "cursorAlpha", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CursorAnimationState {
    private final boolean animate;
    private AtomicReference<Job> animationJob = new AtomicReference<>(null);

    /* renamed from: cursorAlpha$delegate, reason: from kotlin metadata */
    private final SnapshotFloatState2 cursorAlpha = SnapshotFloatState3.mutableFloatStateOf(0.0f);

    public CursorAnimationState(boolean z) {
        this.animate = z;
    }

    public final boolean getAnimate() {
        return this.animate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCursorAlpha(float f) {
        this.cursorAlpha.setFloatValue(f);
    }

    public final float getCursorAlpha() {
        return this.cursorAlpha.getFloatValue();
    }

    /* compiled from: CursorAnimationState.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", m3645f = "CursorAnimationState.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2 */
    static final class C14042 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C14042(Continuation<? super C14042> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C14042 c14042 = CursorAnimationState.this.new C14042(continuation);
            c14042.L$0 = obj;
            return c14042;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C14042) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return boxing.boxBoolean(PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(CursorAnimationState.this.animationJob, null, BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1((Job) CursorAnimationState.this.animationJob.getAndSet(null), CursorAnimationState.this, null), 3, null)));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CursorAnimationState.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", m3645f = "CursorAnimationState.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE, 77, 79, 81}, m3647m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Job $oldJob;
            int label;
            final /* synthetic */ CursorAnimationState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Job job, CursorAnimationState cursorAnimationState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$oldJob = job;
                this.this$0 = cursorAnimationState;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$oldJob, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
            
                if (kotlinx.coroutines.DelayKt.delay(500, r10) != r0) goto L36;
             */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0068 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0019, B:36:0x0076, B:30:0x005f, B:33:0x0068, B:14:0x0027, B:15:0x002b, B:28:0x0059, B:29:0x005e, B:23:0x0043, B:25:0x0050), top: B:40:0x000f }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0073 -> B:36:0x0076). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Job job = this.$oldJob;
                        if (job != null) {
                            this.label = 1;
                            if (JobKt.cancelAndJoin(job, this) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        this.label = 3;
                        if (DelayKt.delay(500L, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            throw new ExceptionsH();
                        }
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            this.this$0.setCursorAlpha(1.0f);
                            this.label = 3;
                            if (DelayKt.delay(500L, this) != coroutine_suspended) {
                                this.this$0.setCursorAlpha(0.0f);
                                this.label = 4;
                            }
                            return coroutine_suspended;
                        }
                        ResultKt.throwOnFailure(obj);
                        this.this$0.setCursorAlpha(0.0f);
                        this.label = 4;
                    }
                    this.this$0.setCursorAlpha(1.0f);
                    if (!this.this$0.getAnimate()) {
                        this.label = 2;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        }
                        throw new ExceptionsH();
                    }
                    this.label = 3;
                    if (DelayKt.delay(500L, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (Throwable th) {
                    this.this$0.setCursorAlpha(0.0f);
                    throw th;
                }
            }
        }
    }

    public final Object snapToVisibleAndAnimate(Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScope2.coroutineScope(new C14042(null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
