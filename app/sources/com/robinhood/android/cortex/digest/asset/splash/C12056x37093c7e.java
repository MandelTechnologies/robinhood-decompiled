package com.robinhood.android.cortex.digest.asset.splash;

import com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: AssetDigestSplashComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestOnboardingSplashLoaded$1$4$1$1$onClick$1$1 */
/* loaded from: classes2.dex */
final class C12056x37093c7e implements Function0<Unit> {
    final /* synthetic */ Function2<Boolean, Boolean, Unit> $onContinueClick;
    final /* synthetic */ AssetDigestSplashViewState.Loaded $viewState;

    /* JADX WARN: Multi-variable type inference failed */
    C12056x37093c7e(Function2<? super Boolean, ? super Boolean, Unit> function2, AssetDigestSplashViewState.Loaded loaded) {
        this.$onContinueClick = function2;
        this.$viewState = loaded;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onContinueClick.invoke(Boolean.valueOf(this.$viewState.getHasSignedAgreement()), Boolean.valueOf(this.$viewState.getHasGoldOrNotRequired()));
    }
}
