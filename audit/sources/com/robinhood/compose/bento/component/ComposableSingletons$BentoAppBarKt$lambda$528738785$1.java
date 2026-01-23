package com.robinhood.compose.bento.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoAppBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.ComposableSingletons$BentoAppBarKt$lambda$-528738785$1, reason: invalid class name */
/* loaded from: classes15.dex */
final class ComposableSingletons$BentoAppBarKt$lambda$528738785$1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$BentoAppBarKt$lambda$528738785$1 INSTANCE = new ComposableSingletons$BentoAppBarKt$lambda$528738785$1();

    ComposableSingletons$BentoAppBarKt$lambda$528738785$1() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
        invoke(bentoAppBarScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
        if ((i & 6) == 0) {
            i |= composer.changed(BentoAppBar) ? 4 : 2;
        }
        if ((i & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-528738785, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoAppBarKt.lambda$-528738785.<anonymous> (BentoAppBar.kt:297)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoAppBarKt$lambda$-528738785$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, ((i << 12) & 57344) | 3072, 7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
