package com.robinhood.shared.crypto.p375ui.menu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AppBarActionItemComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.menu.ComposableSingletons$AppBarActionItemComposableKt$lambda$1164697486$1, reason: use source file name */
/* loaded from: classes6.dex */
final class AppBarActionItemComposable3 implements Function2<Composer, Integer, Unit> {
    public static final AppBarActionItemComposable3 INSTANCE = new AppBarActionItemComposable3();

    AppBarActionItemComposable3() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1164697486, i, -1, "com.robinhood.shared.crypto.ui.menu.ComposableSingletons$AppBarActionItemComposableKt.lambda$1164697486.<anonymous> (AppBarActionItemComposable.kt:65)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.ui.menu.ComposableSingletons$AppBarActionItemComposableKt$lambda$1164697486$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AppBarActionItemComposable.m25228AppBarActionItemComposableV9fs2A("Action", (Function0) objRememberedValue, null, null, false, 0L, composer, 54, 60);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
