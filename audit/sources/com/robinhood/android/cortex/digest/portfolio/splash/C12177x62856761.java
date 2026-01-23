package com.robinhood.android.cortex.digest.portfolio.splash;

import android.content.res.Resources;
import com.robinhood.android.cortex.digest.portfolio.PortfolioDigestDestinations;
import com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashDuxo4;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: PortfolioDigestSplashComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.portfolio.splash.PortfolioDigestSplashComposableKt$PortfolioDigestSplashLoaded$2$3$1$1$1 */
/* loaded from: classes2.dex */
final class C12177x62856761 implements Function0<Unit> {
    final /* synthetic */ LifecycleAwareNavigator $navigator;
    final /* synthetic */ String $source;
    final /* synthetic */ PortfolioDigestSplashDuxo4.Loaded $viewState;

    C12177x62856761(LifecycleAwareNavigator lifecycleAwareNavigator, PortfolioDigestSplashDuxo4.Loaded loaded, String str) {
        this.$navigator = lifecycleAwareNavigator;
        this.$viewState = loaded;
        this.$source = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws Resources.NotFoundException {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws Resources.NotFoundException {
        LifecycleAwareNavigator.navigate$default(this.$navigator, PortfolioDigestDestinations.INSTANCE, new PortfolioDigestDestinations.Args(this.$viewState.getDigest(), this.$source), null, null, false, null, 60, null);
    }
}
