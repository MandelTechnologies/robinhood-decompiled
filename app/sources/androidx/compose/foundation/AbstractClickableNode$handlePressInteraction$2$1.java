package androidx.compose.foundation;

import androidx.compose.foundation.gestures.TapGestureDetector2;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* compiled from: Clickable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", m3645f = "Clickable.kt", m3646l = {1263, 1265, 1272, 1273, 1283}, m3647m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AbstractClickableNode$handlePressInteraction$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InteractionSource3 $interactionSource;
    final /* synthetic */ long $offset;
    final /* synthetic */ TapGestureDetector2 $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractClickableNode$handlePressInteraction$2$1(TapGestureDetector2 tapGestureDetector2, long j, InteractionSource3 interactionSource3, AbstractClickableNode abstractClickableNode, Continuation<? super AbstractClickableNode$handlePressInteraction$2$1> continuation) {
        super(2, continuation);
        this.$this_handlePressInteraction = tapGestureDetector2;
        this.$offset = j;
        this.$interactionSource = interactionSource3;
        this.this$0 = abstractClickableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AbstractClickableNode$handlePressInteraction$2$1 abstractClickableNode$handlePressInteraction$2$1 = new AbstractClickableNode$handlePressInteraction$2$1(this.$this_handlePressInteraction, this.$offset, this.$interactionSource, this.this$0, continuation);
        abstractClickableNode$handlePressInteraction$2$1.L$0 = obj;
        return abstractClickableNode$handlePressInteraction$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AbstractClickableNode$handlePressInteraction$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
    
        if (r3.emit(r2, r16) != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        if (r4.emit(r5, r16) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Job jobLaunch$default;
        Object objTryAwaitRelease;
        Interaction cancel;
        boolean z;
        PressInteraction.Release release;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            jobLaunch$default = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.this$0, this.$offset, this.$interactionSource, null), 3, null);
            TapGestureDetector2 tapGestureDetector2 = this.$this_handlePressInteraction;
            this.L$0 = jobLaunch$default;
            this.label = 1;
            objTryAwaitRelease = tapGestureDetector2.tryAwaitRelease(this);
            if (objTryAwaitRelease != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            jobLaunch$default = (Job) this.L$0;
            ResultKt.throwOnFailure(obj);
            objTryAwaitRelease = obj;
        } else {
            if (i == 2) {
                z = this.Z$0;
                ResultKt.throwOnFailure(obj);
                if (z) {
                    PressInteraction.Press press = new PressInteraction.Press(this.$offset, null);
                    PressInteraction.Release release2 = new PressInteraction.Release(press);
                    InteractionSource3 interactionSource3 = this.$interactionSource;
                    this.L$0 = release2;
                    this.label = 3;
                    if (interactionSource3.emit(press, this) != coroutine_suspended) {
                        release = release2;
                        InteractionSource3 interactionSource32 = this.$interactionSource;
                        this.L$0 = null;
                        this.label = 4;
                    }
                    return coroutine_suspended;
                }
                this.this$0.pressInteraction = null;
                return Unit.INSTANCE;
            }
            if (i != 3) {
                if (i != 4 && i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.pressInteraction = null;
                return Unit.INSTANCE;
            }
            release = (PressInteraction.Release) this.L$0;
            ResultKt.throwOnFailure(obj);
            InteractionSource3 interactionSource322 = this.$interactionSource;
            this.L$0 = null;
            this.label = 4;
        }
        boolean zBooleanValue = ((Boolean) objTryAwaitRelease).booleanValue();
        if (!jobLaunch$default.isActive()) {
            PressInteraction.Press press2 = this.this$0.pressInteraction;
            if (press2 != null) {
                InteractionSource3 interactionSource33 = this.$interactionSource;
                if (zBooleanValue) {
                    cancel = new PressInteraction.Release(press2);
                } else {
                    cancel = new PressInteraction.Cancel(press2);
                }
                this.L$0 = null;
                this.label = 5;
            }
            this.this$0.pressInteraction = null;
            return Unit.INSTANCE;
        }
        this.L$0 = null;
        this.Z$0 = zBooleanValue;
        this.label = 2;
        if (JobKt.cancelAndJoin(jobLaunch$default, this) != coroutine_suspended) {
            z = zBooleanValue;
            if (z) {
            }
            this.this$0.pressInteraction = null;
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
