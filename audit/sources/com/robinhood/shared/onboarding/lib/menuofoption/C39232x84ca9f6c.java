package com.robinhood.shared.onboarding.lib.menuofoption;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MenuOfOptionsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.onboarding.lib.menuofoption.ComposableSingletons$MenuOfOptionsComposableKt$lambda$-460902276$1 */
/* loaded from: classes6.dex */
final class C39232x84ca9f6c implements Function2<Composer, Integer, Unit> {
    public static final C39232x84ca9f6c INSTANCE = new C39232x84ca9f6c();

    C39232x84ca9f6c() {
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
            ComposerKt.traceEventStart(-460902276, i, -1, "com.robinhood.shared.onboarding.lib.menuofoption.ComposableSingletons$MenuOfOptionsComposableKt.lambda$-460902276.<anonymous> (MenuOfOptionsComposable.kt:775)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.onboarding.lib.menuofoption.ComposableSingletons$MenuOfOptionsComposableKt$lambda$-460902276$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        MenuOfOptionsComposableKt.FirstTradeUpsellContent(null, (Function0) objRememberedValue, composer, 48, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
