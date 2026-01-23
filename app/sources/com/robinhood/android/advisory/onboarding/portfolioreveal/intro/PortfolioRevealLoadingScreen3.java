package com.robinhood.android.advisory.onboarding.portfolioreveal.intro;

import androidx.compose.runtime.SnapshotIntState2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PortfolioRevealLoadingScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.portfolioreveal.intro.PortfolioRevealLoadingScreenKt$PortfolioRevealLoading$2$1", m3645f = "PortfolioRevealLoadingScreen.kt", m3646l = {111, 114}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.intro.PortfolioRevealLoadingScreenKt$PortfolioRevealLoading$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class PortfolioRevealLoadingScreen3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotIntState2 $activeIndex$delegate;
    final /* synthetic */ Function0<Unit> $onLoadingAnimationComplete;
    final /* synthetic */ ImmutableList<Integer> $portfolioRevealMessages;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PortfolioRevealLoadingScreen3(ImmutableList<Integer> immutableList, Function0<Unit> function0, SnapshotIntState2 snapshotIntState2, Continuation<? super PortfolioRevealLoadingScreen3> continuation) {
        super(2, continuation);
        this.$portfolioRevealMessages = immutableList;
        this.$onLoadingAnimationComplete = function0;
        this.$activeIndex$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PortfolioRevealLoadingScreen3(this.$portfolioRevealMessages, this.$onLoadingAnimationComplete, this.$activeIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PortfolioRevealLoadingScreen3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r6) == r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0038 -> B:16:0x003b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$activeIndex$delegate.getIntValue() >= this.$portfolioRevealMessages.size() - 1) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$onLoadingAnimationComplete.invoke();
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.$activeIndex$delegate.setIntValue(this.$activeIndex$delegate.getIntValue() + 1);
        if (this.$activeIndex$delegate.getIntValue() >= this.$portfolioRevealMessages.size() - 1) {
            this.label = 1;
        } else {
            this.label = 2;
        }
        return coroutine_suspended;
    }
}
