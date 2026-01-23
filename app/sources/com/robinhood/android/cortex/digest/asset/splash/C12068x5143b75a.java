package com.robinhood.android.cortex.digest.asset.splash;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashViewState;
import com.robinhood.android.cortex.models.asset.onboarding.AssetDigestOnboarding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AssetDigestSplashComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cortex.digest.asset.splash.ComposableSingletons$AssetDigestSplashComposableKt$lambda$-414010447$1 */
/* loaded from: classes2.dex */
final class C12068x5143b75a implements Function3<PaddingValues, Composer, Integer, Unit> {
    public static final C12068x5143b75a INSTANCE = new C12068x5143b75a();

    C12068x5143b75a() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-414010447, i2, -1, "com.robinhood.android.cortex.digest.asset.splash.ComposableSingletons$AssetDigestSplashComposableKt.lambda$-414010447.<anonymous> (AssetDigestSplashComposable.kt:380)");
        }
        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
        AssetDigestSplashViewState.Loaded loaded = new AssetDigestSplashViewState.Loaded(new AssetDigestOnboarding("Unlock Digests by Robinhood Cortex", "Uncover what’s driving the latest stock moves with the power of AI. Exclusively for Robinhood Gold members, along with 4% APY and more.", "First 30 days are free, then pay $5/mo. Gold membership offered by Robinhood Gold, LLC. Rate may change.", false, false, true), false, 2, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.splash.ComposableSingletons$AssetDigestSplashComposableKt$lambda$-414010447$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12068x5143b75a.invoke$lambda$1$lambda$0(((Long) obj).longValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.splash.ComposableSingletons$AssetDigestSplashComposableKt$lambda$-414010447$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function2() { // from class: com.robinhood.android.cortex.digest.asset.splash.ComposableSingletons$AssetDigestSplashComposableKt$lambda$-414010447$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12068x5143b75a.invoke$lambda$5$lambda$4(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        AssetDigestSplashComposableKt.AssetDigestOnboardingSplashLoaded(loaded, true, function1, function0, (Function2) objRememberedValue3, modifierPadding, composer, 28080, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(long j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(boolean z, boolean z2) {
        return Unit.INSTANCE;
    }
}
