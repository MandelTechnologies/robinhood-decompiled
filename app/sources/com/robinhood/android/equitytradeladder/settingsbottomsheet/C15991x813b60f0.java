package com.robinhood.android.equitytradeladder.settingsbottomsheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.equitytradeladder.LadderScreenState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderSettingsBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderSettingsBottomSheetKt$LadderSettingsBottomSheetComposable$settingsData$3 */
/* loaded from: classes3.dex */
final class C15991x813b60f0 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function1<LadderScreenState.BottomSheet.NestedSettingsBottomSheet, Unit> $onShowNestedBottomSheet;

    /* JADX WARN: Multi-variable type inference failed */
    C15991x813b60f0(Function1<? super LadderScreenState.BottomSheet.NestedSettingsBottomSheet, Unit> function1) {
        this.$onShowNestedBottomSheet = function1;
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
            ComposerKt.traceEventStart(1092210561, i, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderSettingsBottomSheetComposable.<anonymous> (LadderSettingsBottomSheet.kt:82)");
        }
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$onShowNestedBottomSheet);
        final Function1<LadderScreenState.BottomSheet.NestedSettingsBottomSheet, Unit> function1 = this.$onShowNestedBottomSheet;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderSettingsBottomSheetKt$LadderSettingsBottomSheetComposable$settingsData$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C15991x813b60f0.invoke$lambda$1$lambda$0(function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        LadderSettingsBottomSheetKt.TimeInForceSection((Function0) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1) {
        function1.invoke(new LadderScreenState.BottomSheet.NestedSettingsBottomSheet.EquityTimeInForce(false, new LadderScreenState.BottomSheet.LadderSettings(false, null, 3, null), 1, null));
        return Unit.INSTANCE;
    }
}
