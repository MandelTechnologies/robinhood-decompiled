package com.robinhood.android.acatsin.enablemargin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginViewState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInEnableMarginComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.enablemargin.ComposableSingletons$AcatsInEnableMarginComposableKt$lambda$-929519608$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInEnableMarginComposable5 implements Function2<Composer, Integer, Unit> {
    public static final AcatsInEnableMarginComposable5 INSTANCE = new AcatsInEnableMarginComposable5();

    AcatsInEnableMarginComposable5() {
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
            ComposerKt.traceEventStart(-929519608, i, -1, "com.robinhood.android.acatsin.enablemargin.ComposableSingletons$AcatsInEnableMarginComposableKt.lambda$-929519608.<anonymous> (AcatsInEnableMarginComposable.kt:34)");
        }
        AcatsInEnableMarginViewState.Loaded placeholderContent = AcatsInEnableMarginViewState.INSTANCE.getPlaceholderContent();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.acatsin.enablemargin.ComposableSingletons$AcatsInEnableMarginComposableKt$lambda$-929519608$1$$ExternalSyntheticLambda0
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
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acatsin.enablemargin.ComposableSingletons$AcatsInEnableMarginComposableKt$lambda$-929519608$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        AcatsInEnableMarginComposable.Content(placeholderContent, function0, (Function0) objRememberedValue2, null, composer, StringResource.$stable | 432, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
