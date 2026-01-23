package com.robinhood.android.cortex.digest.portfolio.splash;

import com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo4;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PortfolioDigestSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/portfolio/splash/PortfolioDigestSplashViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo$loadDigest$3$1", m3645f = "PortfolioDigestSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo$loadDigest$3$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PortfolioDigestSplashDuxo2 extends ContinuationImpl7 implements Function2<PortfolioDigestSplashDuxo4, Continuation<? super PortfolioDigestSplashDuxo4>, Object> {
    final /* synthetic */ PortfolioDigest $portfolioDigest;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PortfolioDigestSplashDuxo2(PortfolioDigest portfolioDigest, Continuation<? super PortfolioDigestSplashDuxo2> continuation) {
        super(2, continuation);
        this.$portfolioDigest = portfolioDigest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PortfolioDigestSplashDuxo2(this.$portfolioDigest, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PortfolioDigestSplashDuxo4 portfolioDigestSplashDuxo4, Continuation<? super PortfolioDigestSplashDuxo4> continuation) {
        return ((PortfolioDigestSplashDuxo2) create(portfolioDigestSplashDuxo4, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new PortfolioDigestSplashDuxo4.Loaded((PortfolioDigest.NeedsOnboarding) this.$portfolioDigest);
    }
}
