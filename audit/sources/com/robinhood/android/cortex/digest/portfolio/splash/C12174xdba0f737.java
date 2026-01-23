package com.robinhood.android.cortex.digest.portfolio.splash;

import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.DelayKt;

/* compiled from: PortfolioDigestSplashComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashLoaded$1$1", m3645f = "PortfolioDigestSplashComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashLoaded$1$1 */
/* loaded from: classes2.dex */
final class C12174xdba0f737 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Long> $animationDuration$delegate;
    final /* synthetic */ SnapshotState<Boolean> $isContainerAnimationThresholdReached$delegate;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C12174xdba0f737(SnapshotState<Long> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super C12174xdba0f737> continuation) {
        super(2, continuation);
        this.$animationDuration$delegate = snapshotState;
        this.$isContainerAnimationThresholdReached$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C12174xdba0f737 c12174xdba0f737 = new C12174xdba0f737(this.$animationDuration$delegate, this.$isContainerAnimationThresholdReached$delegate, continuation);
        c12174xdba0f737.L$0 = obj;
        return c12174xdba0f737;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C12174xdba0f737) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Long lPortfolioDigestSplashLoaded$lambda$15;
        long jCurrentTimeMillis;
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            lPortfolioDigestSplashLoaded$lambda$15 = PortfolioDigestSplashComposableKt.PortfolioDigestSplashLoaded$lambda$15(this.$animationDuration$delegate);
            if (lPortfolioDigestSplashLoaded$lambda$15 != null) {
                jCurrentTimeMillis = System.currentTimeMillis();
                coroutineScope = coroutineScope2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jCurrentTimeMillis = this.J$0;
        lPortfolioDigestSplashLoaded$lambda$15 = (Long) this.L$1;
        coroutineScope = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        while (CoroutineScope2.isActive(coroutineScope)) {
            PortfolioDigestSplashComposableKt.PortfolioDigestSplashLoaded$lambda$22(this.$isContainerAnimationThresholdReached$delegate, lPortfolioDigestSplashLoaded$lambda$15.longValue() - (System.currentTimeMillis() - jCurrentTimeMillis) <= 667);
            this.L$0 = coroutineScope;
            this.L$1 = lPortfolioDigestSplashLoaded$lambda$15;
            this.J$0 = jCurrentTimeMillis;
            this.label = 1;
            if (DelayKt.delay(10L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
