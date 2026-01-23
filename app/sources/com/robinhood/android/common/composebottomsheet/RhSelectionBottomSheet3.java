package com.robinhood.android.common.composebottomsheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhSelectionBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.composebottomsheet.ComposableSingletons$RhSelectionBottomSheetKt$lambda$305070269$1, reason: use source file name */
/* loaded from: classes2.dex */
final class RhSelectionBottomSheet3 implements Function2<Composer, Integer, Unit> {
    public static final RhSelectionBottomSheet3 INSTANCE = new RhSelectionBottomSheet3();

    RhSelectionBottomSheet3() {
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
            ComposerKt.traceEventStart(305070269, i, -1, "com.robinhood.android.common.composebottomsheet.ComposableSingletons$RhSelectionBottomSheetKt.lambda$305070269.<anonymous> (RhSelectionBottomSheet.kt:148)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.common.composebottomsheet.ComposableSingletons$RhSelectionBottomSheetKt$lambda$305070269$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        RhSelectionBottomSheet4.RhSelectionBottomSheet("Really cool title", (Function0) objRememberedValue, RhSelectionBottomSheet.INSTANCE.getLambda$1205070960$lib_compose_bottom_sheet_externalDebug(), null, null, false, null, false, null, null, null, composer, 438, 0, 2040);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
