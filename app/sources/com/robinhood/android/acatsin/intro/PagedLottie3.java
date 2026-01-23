package com.robinhood.android.acatsin.intro;

import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import com.airbnb.lottie.compose.LottieClipSpec;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PagedLottie.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.intro.PagedLottieKt$PagedLottie$1$1", m3645f = "PagedLottie.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.intro.PagedLottieKt$PagedLottie$1$1, reason: use source file name */
/* loaded from: classes24.dex */
final class PagedLottie3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float $animationSpeed;
    final /* synthetic */ SnapshotIntState2 $currentIndex$delegate;
    final /* synthetic */ SnapshotState<LottieClipSpec> $loopClipSpec$delegate;
    final /* synthetic */ List<PagedLottie> $pageSpecs;
    final /* synthetic */ SnapshotIntState2 $prevIndex$delegate;
    final /* synthetic */ SnapshotState<LottieClipSpec> $transitionClipSpec$delegate;
    final /* synthetic */ SnapshotFloatState2 $transitionSpeed$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PagedLottie3(List<? extends PagedLottie> list, float f, SnapshotIntState2 snapshotIntState2, SnapshotIntState2 snapshotIntState22, SnapshotState<LottieClipSpec> snapshotState, SnapshotFloatState2 snapshotFloatState2, SnapshotState<LottieClipSpec> snapshotState2, Continuation<? super PagedLottie3> continuation) {
        super(2, continuation);
        this.$pageSpecs = list;
        this.$animationSpeed = f;
        this.$currentIndex$delegate = snapshotIntState2;
        this.$prevIndex$delegate = snapshotIntState22;
        this.$transitionClipSpec$delegate = snapshotState;
        this.$transitionSpeed$delegate = snapshotFloatState2;
        this.$loopClipSpec$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PagedLottie3(this.$pageSpecs, this.$animationSpeed, this.$currentIndex$delegate, this.$prevIndex$delegate, this.$transitionClipSpec$delegate, this.$transitionSpeed$delegate, this.$loopClipSpec$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PagedLottie3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PagedLottie pagedLottie = this.$pageSpecs.get(this.$currentIndex$delegate.getIntValue());
        if (this.$prevIndex$delegate.getIntValue() > this.$currentIndex$delegate.getIntValue()) {
            this.$transitionClipSpec$delegate.setValue(this.$pageSpecs.get(this.$prevIndex$delegate.getIntValue()).getInitialClipSpec());
            this.$transitionSpeed$delegate.setFloatValue(-this.$animationSpeed);
            this.$loopClipSpec$delegate.setValue(pagedLottie.getLoopClipSpec());
        } else {
            this.$transitionClipSpec$delegate.setValue(pagedLottie.getInitialClipSpec());
            this.$transitionSpeed$delegate.setFloatValue(this.$animationSpeed);
            this.$loopClipSpec$delegate.setValue(pagedLottie.getLoopClipSpec());
        }
        this.$prevIndex$delegate.setIntValue(this.$currentIndex$delegate.getIntValue());
        return Unit.INSTANCE;
    }
}
