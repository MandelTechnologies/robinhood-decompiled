package com.robinhood.android.cortex.digest.asset.splash;

import com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AssetDigestSplashFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashFragment$ComposeContent$2$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class AssetDigestSplashFragment3 extends FunctionReferenceImpl implements Function2<Boolean, Boolean, Unit> {
    AssetDigestSplashFragment3(Object obj) {
        super(2, obj, AssetDigestSplashFragment.Callbacks.class, "onContinueClick", "onContinueClick(ZZ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2) {
        invoke(bool.booleanValue(), bool2.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, boolean z2) {
        ((AssetDigestSplashFragment.Callbacks) this.receiver).onContinueClick(z, z2);
    }
}
