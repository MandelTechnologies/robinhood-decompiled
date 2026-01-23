package com.robinhood.android.optionsexercise;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionExerciseShortDetailBottomSheetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsexercise.OptionExerciseShortDetailBottomSheetComposableKt$OptionExerciseShortDetailBottomSheetComposable$1$3, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionExerciseShortDetailBottomSheetComposable2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $dismissBottomSheet;

    OptionExerciseShortDetailBottomSheetComposable2(Function0<Unit> function0) {
        this.$dismissBottomSheet = function0;
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
            ComposerKt.traceEventStart(1793284972, i, -1, "com.robinhood.android.optionsexercise.OptionExerciseShortDetailBottomSheetComposable.<anonymous>.<anonymous> (OptionExerciseShortDetailBottomSheetComposable.kt:99)");
        }
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, OptionExerciseShortDetailBottomSheetComposable.ShortDetailBottomSheetDismissButtonTestTag);
        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, 0);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$dismissBottomSheet);
        final Function0<Unit> function0 = this.$dismissBottomSheet;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsexercise.OptionExerciseShortDetailBottomSheetComposableKt$OptionExerciseShortDetailBottomSheetComposable$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionExerciseShortDetailBottomSheetComposable2.invoke$lambda$1$lambda$0(function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(modifierTestTag, null, null, false, null, null, (Function0) objRememberedValue, strStringResource, false, null, false, null, null, false, null, false, composer, 6, 0, 65342);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
