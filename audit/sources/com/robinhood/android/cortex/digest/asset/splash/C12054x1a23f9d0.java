package com.robinhood.android.cortex.digest.asset.splash;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: AssetDigestSplashComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashComposableKt$AssetDigestOnboardingSplashLoaded$1$2$1 */
/* loaded from: classes2.dex */
final class C12054x1a23f9d0 implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $onAnimationComplete;
    final /* synthetic */ SnapshotState<Boolean> $showContent$delegate;

    C12054x1a23f9d0(Function0<Unit> function0, SnapshotState<Boolean> snapshotState) {
        this.$onAnimationComplete = function0;
        this.$showContent$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onAnimationComplete.invoke();
        AssetDigestSplashComposableKt.AssetDigestOnboardingSplashLoaded$lambda$7(this.$showContent$delegate, true);
    }
}
