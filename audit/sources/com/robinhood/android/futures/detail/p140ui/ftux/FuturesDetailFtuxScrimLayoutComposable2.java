package com.robinhood.android.futures.detail.p140ui.ftux;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesDetailFtuxScrimLayoutComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.detail.ui.ftux.ComposableSingletons$FuturesDetailFtuxScrimLayoutComposableKt$lambda$-310541536$1, reason: use source file name */
/* loaded from: classes3.dex */
final class FuturesDetailFtuxScrimLayoutComposable2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    public static final FuturesDetailFtuxScrimLayoutComposable2 INSTANCE = new FuturesDetailFtuxScrimLayoutComposable2();

    FuturesDetailFtuxScrimLayoutComposable2() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-310541536, i, -1, "com.robinhood.android.futures.detail.ui.ftux.ComposableSingletons$FuturesDetailFtuxScrimLayoutComposableKt.lambda$-310541536.<anonymous> (FuturesDetailFtuxScrimLayoutComposable.kt:27)");
        }
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.detail.ui.ftux.ComposableSingletons$FuturesDetailFtuxScrimLayoutComposableKt$lambda$-310541536$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BoxKt.Box(ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue, 6, null), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
