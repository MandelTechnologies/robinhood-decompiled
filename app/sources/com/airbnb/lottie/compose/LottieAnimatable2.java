package com.airbnb.lottie.compose;

import androidx.compose.animation.core.InfiniteAnimationPolicy2;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MonotonicFrameClock2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.airbnb.lottie.LottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.investFlow.InvestFlowConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;

/* compiled from: LottieAnimatable.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002Jj\u0010P\u001a\u00020Q2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020$2\u0006\u0010+\u001a\u00020$2\u0006\u0010A\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010R\u001a\u00020\u00142\u0006\u0010S\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u001dH\u0096@¢\u0006\u0002\u0010WJ\u0016\u0010X\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020$H\u0082@¢\u0006\u0002\u0010YJ\u0018\u0010Z\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020$2\u0006\u0010[\u001a\u00020/H\u0002J0\u0010\\\u001a\u00020Q2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u00108\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$2\u0006\u0010]\u001a\u00020\u001dH\u0096@¢\u0006\u0002\u0010^J\u0010\u0010_\u001a\u00020Q2\u0006\u00108\u001a\u00020\u0014H\u0002J\u0016\u0010`\u001a\u00020\u0014*\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002R/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR/\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\f8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001c\u0010\u001eR+\u0010 \u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u000b\u001a\u0004\b \u0010\u001e\"\u0004\b!\u0010\"R+\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020$8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u000b\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010+\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020$8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u000b\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R+\u00100\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020/8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u000b\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R+\u00108\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010\u000b\u001a\u0004\b9\u0010\u0016\"\u0004\b:\u0010;R+\u0010=\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010\u000b\u001a\u0004\b>\u0010\u0016\"\u0004\b?\u0010;R+\u0010A\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\u000b\u001a\u0004\bB\u0010\u001e\"\u0004\bC\u0010\"R+\u0010E\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010\u000b\u001a\u0004\bF\u0010\u0016\"\u0004\bG\u0010;R+\u0010I\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010\u000b\u001a\u0004\bJ\u0010\u001e\"\u0004\bK\u0010\"R\u0014\u0010M\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006a"}, m3636d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatableImpl;", "Lcom/airbnb/lottie/compose/LottieAnimatable;", "()V", "<set-?>", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "getClipSpec", "()Lcom/airbnb/lottie/compose/LottieClipSpec;", "setClipSpec", "(Lcom/airbnb/lottie/compose/LottieClipSpec;)V", "clipSpec$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/airbnb/lottie/LottieComposition;", "composition", "getComposition", "()Lcom/airbnb/lottie/LottieComposition;", "setComposition", "(Lcom/airbnb/lottie/LottieComposition;)V", "composition$delegate", "endProgress", "", "getEndProgress", "()F", "endProgress$delegate", "Landroidx/compose/runtime/State;", "frameSpeed", "getFrameSpeed", "frameSpeed$delegate", "isAtEnd", "", "()Z", "isAtEnd$delegate", "isPlaying", "setPlaying", "(Z)V", "isPlaying$delegate", "", "iteration", "getIteration", "()I", "setIteration", "(I)V", "iteration$delegate", "iterations", "getIterations", "setIterations", "iterations$delegate", "", "lastFrameNanos", "getLastFrameNanos", "()J", "setLastFrameNanos", "(J)V", "lastFrameNanos$delegate", "mutex", "Landroidx/compose/foundation/MutatorMutex;", "progress", "getProgress", "setProgress", "(F)V", "progress$delegate", "progressRaw", "getProgressRaw", "setProgressRaw", "progressRaw$delegate", "reverseOnRepeat", "getReverseOnRepeat", "setReverseOnRepeat", "reverseOnRepeat$delegate", "speed", "getSpeed", "setSpeed", "speed$delegate", "useCompositionFrameRate", "getUseCompositionFrameRate", "setUseCompositionFrameRate", "useCompositionFrameRate$delegate", "value", "getValue", "()Ljava/lang/Float;", "animate", "", "initialProgress", "continueFromPreviousAnimate", "cancellationBehavior", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "ignoreSystemAnimationsDisabled", "(Lcom/airbnb/lottie/LottieComposition;IIZFLcom/airbnb/lottie/compose/LottieClipSpec;FZLcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doFrame", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onFrame", "frameNanos", "snapTo", "resetLastFrameNanos", "(Lcom/airbnb/lottie/LottieComposition;FIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProgress", "roundToCompositionFrameRate", "lottie-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl, reason: use source file name */
/* loaded from: classes16.dex */
final class LottieAnimatable2 implements LottieAnimatable {

    /* renamed from: clipSpec$delegate, reason: from kotlin metadata */
    private final SnapshotState clipSpec;

    /* renamed from: composition$delegate, reason: from kotlin metadata */
    private final SnapshotState composition;

    /* renamed from: endProgress$delegate, reason: from kotlin metadata */
    private final SnapshotState4 endProgress;

    /* renamed from: frameSpeed$delegate, reason: from kotlin metadata */
    private final SnapshotState4 frameSpeed;

    /* renamed from: isAtEnd$delegate, reason: from kotlin metadata */
    private final SnapshotState4 isAtEnd;

    /* renamed from: isPlaying$delegate, reason: from kotlin metadata */
    private final SnapshotState isPlaying;

    /* renamed from: iteration$delegate, reason: from kotlin metadata */
    private final SnapshotState iteration;

    /* renamed from: iterations$delegate, reason: from kotlin metadata */
    private final SnapshotState iterations;

    /* renamed from: lastFrameNanos$delegate, reason: from kotlin metadata */
    private final SnapshotState lastFrameNanos;
    private final MutatorMutex mutex;

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    private final SnapshotState progress;

    /* renamed from: progressRaw$delegate, reason: from kotlin metadata */
    private final SnapshotState progressRaw;

    /* renamed from: reverseOnRepeat$delegate, reason: from kotlin metadata */
    private final SnapshotState reverseOnRepeat;

    /* renamed from: speed$delegate, reason: from kotlin metadata */
    private final SnapshotState speed;

    /* renamed from: useCompositionFrameRate$delegate, reason: from kotlin metadata */
    private final SnapshotState useCompositionFrameRate;

    public LottieAnimatable2() {
        Boolean bool = Boolean.FALSE;
        this.isPlaying = SnapshotState3.mutableStateOf$default(bool, null, 2, null);
        this.iteration = SnapshotState3.mutableStateOf$default(1, null, 2, null);
        this.iterations = SnapshotState3.mutableStateOf$default(1, null, 2, null);
        this.reverseOnRepeat = SnapshotState3.mutableStateOf$default(bool, null, 2, null);
        this.clipSpec = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.speed = SnapshotState3.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
        this.useCompositionFrameRate = SnapshotState3.mutableStateOf$default(bool, null, 2, null);
        this.frameSpeed = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$frameSpeed$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                return Float.valueOf((this.this$0.getReverseOnRepeat() && this.this$0.getIteration() % 2 == 0) ? -this.this$0.getSpeed() : this.this$0.getSpeed());
            }
        });
        this.composition = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        Float fValueOf = Float.valueOf(0.0f);
        this.progressRaw = SnapshotState3.mutableStateOf$default(fValueOf, null, 2, null);
        this.progress = SnapshotState3.mutableStateOf$default(fValueOf, null, 2, null);
        this.lastFrameNanos = SnapshotState3.mutableStateOf$default(Long.MIN_VALUE, null, 2, null);
        this.endProgress = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl$endProgress$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                LottieComposition composition = this.this$0.getComposition();
                float maxProgress$lottie_compose_release = 0.0f;
                if (composition != null) {
                    if (this.this$0.getSpeed() < 0.0f) {
                        LottieClipSpec clipSpec = this.this$0.getClipSpec();
                        if (clipSpec != null) {
                            maxProgress$lottie_compose_release = clipSpec.getMinProgress$lottie_compose_release(composition);
                        }
                    } else {
                        LottieClipSpec clipSpec2 = this.this$0.getClipSpec();
                        maxProgress$lottie_compose_release = clipSpec2 != null ? clipSpec2.getMaxProgress$lottie_compose_release(composition) : 1.0f;
                    }
                }
                return Float.valueOf(maxProgress$lottie_compose_release);
            }
        });
        this.isAtEnd = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl.isAtEnd.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(LottieAnimatable2.this.getIteration() == LottieAnimatable2.this.getIterations() && LottieAnimatable2.this.getProgress() == LottieAnimatable2.this.getEndProgress());
            }
        });
        this.mutex = new MutatorMutex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaying(boolean z) {
        this.isPlaying.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean isPlaying() {
        return ((Boolean) this.isPlaying.getValue()).booleanValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.SnapshotState4
    public Float getValue() {
        return Float.valueOf(getProgress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIteration(int i) {
        this.iteration.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int getIteration() {
        return ((Number) this.iteration.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIterations(int i) {
        this.iterations.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public int getIterations() {
        return ((Number) this.iterations.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReverseOnRepeat(boolean z) {
        this.reverseOnRepeat.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean getReverseOnRepeat() {
        return ((Boolean) this.reverseOnRepeat.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipSpec(LottieClipSpec lottieClipSpec) {
        this.clipSpec.setValue(lottieClipSpec);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public LottieClipSpec getClipSpec() {
        return (LottieClipSpec) this.clipSpec.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeed(float f) {
        this.speed.setValue(Float.valueOf(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float getSpeed() {
        return ((Number) this.speed.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCompositionFrameRate(boolean z) {
        this.useCompositionFrameRate.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean getUseCompositionFrameRate() {
        return ((Boolean) this.useCompositionFrameRate.getValue()).booleanValue();
    }

    private final float getFrameSpeed() {
        return ((Number) this.frameSpeed.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComposition(LottieComposition lottieComposition) {
        this.composition.setValue(lottieComposition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public LottieComposition getComposition() {
        return (LottieComposition) this.composition.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float getProgressRaw() {
        return ((Number) this.progressRaw.getValue()).floatValue();
    }

    private final void setProgressRaw(float f) {
        this.progressRaw.setValue(Float.valueOf(f));
    }

    private void setProgress(float f) {
        this.progress.setValue(Float.valueOf(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastFrameNanos(long j) {
        this.lastFrameNanos.setValue(Long.valueOf(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public long getLastFrameNanos() {
        return ((Number) this.lastFrameNanos.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getEndProgress() {
        return ((Number) this.endProgress.getValue()).floatValue();
    }

    @Override // com.airbnb.lottie.compose.LottieAnimationState
    public boolean isAtEnd() {
        return ((Boolean) this.isAtEnd.getValue()).booleanValue();
    }

    /* compiled from: LottieAnimatable.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", m3645f = "LottieAnimatable.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2 */
    static final class C47702 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ LottieComposition $composition;
        final /* synthetic */ int $iteration;
        final /* synthetic */ float $progress;
        final /* synthetic */ boolean $resetLastFrameNanos;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47702(LottieComposition lottieComposition, float f, int i, boolean z, Continuation<? super C47702> continuation) {
            super(1, continuation);
            this.$composition = lottieComposition;
            this.$progress = f;
            this.$iteration = i;
            this.$resetLastFrameNanos = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return LottieAnimatable2.this.new C47702(this.$composition, this.$progress, this.$iteration, this.$resetLastFrameNanos, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C47702) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                LottieAnimatable2.this.setComposition(this.$composition);
                LottieAnimatable2.this.updateProgress(this.$progress);
                LottieAnimatable2.this.setIteration(this.$iteration);
                LottieAnimatable2.this.setPlaying(false);
                if (this.$resetLastFrameNanos) {
                    LottieAnimatable2.this.setLastFrameNanos(Long.MIN_VALUE);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    public Object snapTo(LottieComposition lottieComposition, float f, int i, boolean z, Continuation<? super Unit> continuation) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutex, null, new C47702(lottieComposition, f, i, z, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    /* compiled from: LottieAnimatable.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", m3645f = "LottieAnimatable.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2 */
    static final class C47662 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
        final /* synthetic */ LottieClipSpec $clipSpec;
        final /* synthetic */ LottieComposition $composition;
        final /* synthetic */ boolean $continueFromPreviousAnimate;
        final /* synthetic */ float $initialProgress;
        final /* synthetic */ int $iteration;
        final /* synthetic */ int $iterations;
        final /* synthetic */ boolean $reverseOnRepeat;
        final /* synthetic */ float $speed;
        final /* synthetic */ boolean $useCompositionFrameRate;
        int label;

        /* compiled from: LottieAnimatable.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LottieCancellationBehavior.values().length];
                try {
                    iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LottieCancellationBehavior.Immediately.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47662(int i, int i2, boolean z, float f, LottieClipSpec lottieClipSpec, LottieComposition lottieComposition, float f2, boolean z2, boolean z3, LottieCancellationBehavior lottieCancellationBehavior, Continuation<? super C47662> continuation) {
            super(1, continuation);
            this.$iteration = i;
            this.$iterations = i2;
            this.$reverseOnRepeat = z;
            this.$speed = f;
            this.$clipSpec = lottieClipSpec;
            this.$composition = lottieComposition;
            this.$initialProgress = f2;
            this.$useCompositionFrameRate = z2;
            this.$continueFromPreviousAnimate = z3;
            this.$cancellationBehavior = lottieCancellationBehavior;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return LottieAnimatable2.this.new C47662(this.$iteration, this.$iterations, this.$reverseOnRepeat, this.$speed, this.$clipSpec, this.$composition, this.$initialProgress, this.$useCompositionFrameRate, this.$continueFromPreviousAnimate, this.$cancellationBehavior, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C47662) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CoroutineContext coroutineContext;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    LottieAnimatable2.this.setIteration(this.$iteration);
                    LottieAnimatable2.this.setIterations(this.$iterations);
                    LottieAnimatable2.this.setReverseOnRepeat(this.$reverseOnRepeat);
                    LottieAnimatable2.this.setSpeed(this.$speed);
                    LottieAnimatable2.this.setClipSpec(this.$clipSpec);
                    LottieAnimatable2.this.setComposition(this.$composition);
                    LottieAnimatable2.this.updateProgress(this.$initialProgress);
                    LottieAnimatable2.this.setUseCompositionFrameRate(this.$useCompositionFrameRate);
                    if (!this.$continueFromPreviousAnimate) {
                        LottieAnimatable2.this.setLastFrameNanos(Long.MIN_VALUE);
                    }
                    if (this.$composition == null) {
                        LottieAnimatable2.this.setPlaying(false);
                        return Unit.INSTANCE;
                    }
                    if (!Float.isInfinite(this.$speed)) {
                        LottieAnimatable2.this.setPlaying(true);
                        int i2 = WhenMappings.$EnumSwitchMapping$0[this.$cancellationBehavior.ordinal()];
                        if (i2 == 1) {
                            coroutineContext = NonCancellable.INSTANCE;
                        } else {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            coroutineContext = CoroutineContextImpl6.INSTANCE;
                        }
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cancellationBehavior, JobKt.getJob(getContext()), this.$iterations, this.$iteration, LottieAnimatable2.this, null);
                        this.label = 1;
                        if (BuildersKt.withContext(coroutineContext, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        LottieAnimatable2 lottieAnimatable2 = LottieAnimatable2.this;
                        lottieAnimatable2.updateProgress(lottieAnimatable2.getEndProgress());
                        LottieAnimatable2.this.setPlaying(false);
                        LottieAnimatable2.this.setIteration(this.$iterations);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                JobKt.ensureActive(getContext());
                LottieAnimatable2.this.setPlaying(false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                LottieAnimatable2.this.setPlaying(false);
                throw th;
            }
        }

        /* compiled from: LottieAnimatable.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", m3645f = "LottieAnimatable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
            final /* synthetic */ int $iteration;
            final /* synthetic */ int $iterations;
            final /* synthetic */ Job $parentJob;
            int label;
            final /* synthetic */ LottieAnimatable2 this$0;

            /* compiled from: LottieAnimatable.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            /* renamed from: com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LottieCancellationBehavior.values().length];
                    try {
                        iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LottieCancellationBehavior lottieCancellationBehavior, Job job, int i, int i2, LottieAnimatable2 lottieAnimatable2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$cancellationBehavior = lottieCancellationBehavior;
                this.$parentJob = job;
                this.$iterations = i;
                this.$iteration = i2;
                this.this$0 = lottieAnimatable2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$cancellationBehavior, this.$parentJob, this.$iterations, this.$iteration, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[ADDED_TO_REGION, REMOVE] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003e -> B:19:0x0041). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r3.label
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.ResultKt.throwOnFailure(r4)
                    goto L41
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    kotlin.ResultKt.throwOnFailure(r4)
                L1a:
                    com.airbnb.lottie.compose.LottieCancellationBehavior r4 = r3.$cancellationBehavior
                    int[] r1 = com.airbnb.lottie.compose.LottieAnimatable2.C47662.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0
                    int r4 = r4.ordinal()
                    r4 = r1[r4]
                    if (r4 != r2) goto L34
                    kotlinx.coroutines.Job r4 = r3.$parentJob
                    boolean r4 = r4.isActive()
                    if (r4 == 0) goto L31
                    int r4 = r3.$iterations
                    goto L36
                L31:
                    int r4 = r3.$iteration
                    goto L36
                L34:
                    int r4 = r3.$iterations
                L36:
                    com.airbnb.lottie.compose.LottieAnimatableImpl r1 = r3.this$0
                    r3.label = r2
                    java.lang.Object r4 = com.airbnb.lottie.compose.LottieAnimatable2.access$doFrame(r1, r4, r3)
                    if (r4 != r0) goto L41
                    return r0
                L41:
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 != 0) goto L1a
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.LottieAnimatable2.C47662.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }
    }

    @Override // com.airbnb.lottie.compose.LottieAnimatable
    public Object animate(LottieComposition lottieComposition, int i, int i2, boolean z, float f, LottieClipSpec lottieClipSpec, float f2, boolean z2, LottieCancellationBehavior lottieCancellationBehavior, boolean z3, boolean z4, Continuation<? super Unit> continuation) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutex, null, new C47662(i, i2, z, f, lottieClipSpec, lottieComposition, f2, z4, z2, lottieCancellationBehavior, null), continuation, 1, null);
        return objMutate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doFrame(final int i, Continuation<? super Boolean> continuation) {
        if (i == Integer.MAX_VALUE) {
            return InfiniteAnimationPolicy2.withInfiniteAnimationFrameNanos(new Function1<Long, Boolean>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl.doFrame.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Long l) {
                    return invoke(l.longValue());
                }

                public final Boolean invoke(long j) {
                    return Boolean.valueOf(LottieAnimatable2.this.onFrame(i, j));
                }
            }, continuation);
        }
        return MonotonicFrameClock2.withFrameNanos(new Function1<Long, Boolean>() { // from class: com.airbnb.lottie.compose.LottieAnimatableImpl.doFrame.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Long l) {
                return invoke(l.longValue());
            }

            public final Boolean invoke(long j) {
                return Boolean.valueOf(LottieAnimatable2.this.onFrame(i, j));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onFrame(int iterations, long frameNanos) {
        LottieComposition composition = getComposition();
        if (composition == null) {
            return true;
        }
        long lastFrameNanos = getLastFrameNanos() == Long.MIN_VALUE ? 0L : frameNanos - getLastFrameNanos();
        setLastFrameNanos(frameNanos);
        LottieClipSpec clipSpec = getClipSpec();
        float minProgress$lottie_compose_release = clipSpec != null ? clipSpec.getMinProgress$lottie_compose_release(composition) : 0.0f;
        LottieClipSpec clipSpec2 = getClipSpec();
        float maxProgress$lottie_compose_release = clipSpec2 != null ? clipSpec2.getMaxProgress$lottie_compose_release(composition) : 1.0f;
        float duration = ((lastFrameNanos / InvestFlowConstants.MAX_ONE_TIME_AMOUNT) / composition.getDuration()) * getFrameSpeed();
        float progressRaw = getFrameSpeed() < 0.0f ? minProgress$lottie_compose_release - (getProgressRaw() + duration) : (getProgressRaw() + duration) - maxProgress$lottie_compose_release;
        if (progressRaw < 0.0f) {
            updateProgress(RangesKt.coerceIn(getProgressRaw(), minProgress$lottie_compose_release, maxProgress$lottie_compose_release) + duration);
        } else {
            float f = maxProgress$lottie_compose_release - minProgress$lottie_compose_release;
            int i = (int) (progressRaw / f);
            int i2 = i + 1;
            if (getIteration() + i2 > iterations) {
                updateProgress(getEndProgress());
                setIteration(iterations);
                return false;
            }
            setIteration(getIteration() + i2);
            float f2 = progressRaw - (i * f);
            updateProgress(getFrameSpeed() < 0.0f ? maxProgress$lottie_compose_release - f2 : minProgress$lottie_compose_release + f2);
        }
        return true;
    }

    private final float roundToCompositionFrameRate(float f, LottieComposition lottieComposition) {
        if (lottieComposition == null) {
            return f;
        }
        return f - (f % (1 / lottieComposition.getFrameRate()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateProgress(float progress) {
        setProgressRaw(progress);
        if (getUseCompositionFrameRate()) {
            progress = roundToCompositionFrameRate(progress, getComposition());
        }
        setProgress(progress);
    }
}
