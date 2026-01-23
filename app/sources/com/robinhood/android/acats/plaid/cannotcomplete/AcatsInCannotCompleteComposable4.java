package com.robinhood.android.acats.plaid.cannotcomplete;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInCannotCompleteComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acats.plaid.cannotcomplete.ComposableSingletons$AcatsInCannotCompleteComposableKt$lambda$206575444$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInCannotCompleteComposable4 implements Function2<Composer, Integer, Unit> {
    public static final AcatsInCannotCompleteComposable4 INSTANCE = new AcatsInCannotCompleteComposable4();

    AcatsInCannotCompleteComposable4() {
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
            ComposerKt.traceEventStart(206575444, i, -1, "com.robinhood.android.acats.plaid.cannotcomplete.ComposableSingletons$AcatsInCannotCompleteComposableKt.lambda$206575444.<anonymous> (AcatsInCannotCompleteComposable.kt:85)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.plaid.cannotcomplete.ComposableSingletons$AcatsInCannotCompleteComposableKt$lambda$206575444$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acats.plaid.cannotcomplete.ComposableSingletons$AcatsInCannotCompleteComposableKt$lambda$206575444$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        AcatsInCannotCompleteComposable.AcatsInCannotCompleteComposable("broker", function0, (Function0) objRememberedValue2, composer, 438);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
