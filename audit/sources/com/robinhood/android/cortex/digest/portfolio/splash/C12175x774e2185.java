package com.robinhood.android.cortex.digest.portfolio.splash;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: PortfolioDigestSplashComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashLoaded$2$1$1 */
/* loaded from: classes2.dex */
final class C12175x774e2185 implements Function1<Long, Unit> {
    final /* synthetic */ SnapshotState<Long> $animationDuration$delegate;

    C12175x774e2185(SnapshotState<Long> snapshotState) {
        this.$animationDuration$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l) {
        invoke(l.longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j) {
        this.$animationDuration$delegate.setValue(Long.valueOf(j));
    }
}
