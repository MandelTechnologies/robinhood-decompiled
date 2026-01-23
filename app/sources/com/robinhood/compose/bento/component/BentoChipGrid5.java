package com.robinhood.compose.bento.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoChip2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoChipGrid.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.ComposableSingletons$BentoChipGridKt$lambda$1756885299$1, reason: use source file name */
/* loaded from: classes15.dex */
final class BentoChipGrid5 implements Function2<Composer, Integer, Unit> {
    public static final BentoChipGrid5 INSTANCE = new BentoChipGrid5();

    BentoChipGrid5() {
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
            ComposerKt.traceEventStart(1756885299, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoChipGridKt.lambda$1756885299.<anonymous> (BentoChipGrid.kt:55)");
        }
        for (int i2 = 0; i2 < 10; i2++) {
            BentoChip2.Type type2 = BentoChip2.Type.Action;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoChipGridKt$lambda$1756885299$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoChip.BentoBaseChip(type2, (Function0) objRememberedValue, null, false, false, null, "Chip label " + i2, composer, 54, 60);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
