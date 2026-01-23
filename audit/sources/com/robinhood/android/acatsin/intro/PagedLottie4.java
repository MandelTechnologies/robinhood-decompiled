package com.robinhood.android.acatsin.intro;

import androidx.compose.runtime.SnapshotIntState2;
import com.airbnb.lottie.compose.LottieAnimationState;
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
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.intro.PagedLottieKt$PagedLottie$2$1", m3645f = "PagedLottie.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.intro.PagedLottieKt$PagedLottie$2$1, reason: use source file name */
/* loaded from: classes24.dex */
final class PagedLottie4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotIntState2 $currentIndex$delegate;
    final /* synthetic */ List<PagedLottie> $pageSpecs;
    final /* synthetic */ boolean $playRemaining;
    final /* synthetic */ LottieAnimationState $transitionProgress;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PagedLottie4(boolean z, LottieAnimationState lottieAnimationState, List<? extends PagedLottie> list, SnapshotIntState2 snapshotIntState2, Continuation<? super PagedLottie4> continuation) {
        super(2, continuation);
        this.$playRemaining = z;
        this.$transitionProgress = lottieAnimationState;
        this.$pageSpecs = list;
        this.$currentIndex$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PagedLottie4(this.$playRemaining, this.$transitionProgress, this.$pageSpecs, this.$currentIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PagedLottie4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$playRemaining && !this.$transitionProgress.isPlaying() && this.$currentIndex$delegate.getIntValue() < this.$pageSpecs.size() - 1) {
            SnapshotIntState2 snapshotIntState2 = this.$currentIndex$delegate;
            snapshotIntState2.setIntValue(snapshotIntState2.getIntValue() + 1);
        }
        return Unit.INSTANCE;
    }
}
