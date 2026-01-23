package com.robinhood.android.equitytradeladder.settingsbottomsheet;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.equitytradeladder.C15889R;
import com.robinhood.compose.bento.component.rows.BentoToggleRow3;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderSettingsBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderSettingsBottomSheetKt$LadderSettingsBottomSheetComposable$settingsData$1 */
/* loaded from: classes3.dex */
final class C15989x813b60ee implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ boolean $autoSendChecked;
    final /* synthetic */ boolean $autoSendLoading;
    final /* synthetic */ boolean $hideAutoSendToggle;
    final /* synthetic */ Function1<Boolean, Unit> $onAutoSendChecked;

    /* JADX WARN: Multi-variable type inference failed */
    C15989x813b60ee(boolean z, boolean z2, boolean z3, Function1<? super Boolean, Unit> function1) {
        this.$hideAutoSendToggle = z;
        this.$autoSendChecked = z2;
        this.$autoSendLoading = z3;
        this.$onAutoSendChecked = function1;
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
            ComposerKt.traceEventStart(-1003198712, i, -1, "com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderSettingsBottomSheetComposable.<anonymous> (LadderSettingsBottomSheet.kt:49)");
        }
        if (!this.$hideAutoSendToggle) {
            BentoToggleRowState bentoToggleRowState = new BentoToggleRowState(null, StringResources_androidKt.stringResource(C15889R.string.settings_autosend_toggle_label, composer, 0), new BentoToggleRowState.Text.Plain(StringResources_androidKt.stringResource(C15889R.string.settings_autosend_toggle_desc, composer, 0)), false, this.$autoSendChecked, null, null, this.$autoSendLoading, false, true, 361, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$onAutoSendChecked);
            final Function1<Boolean, Unit> function1 = this.$onAutoSendChecked;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equitytradeladder.settingsbottomsheet.LadderSettingsBottomSheetKt$LadderSettingsBottomSheetComposable$settingsData$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C15989x813b60ee.invoke$lambda$1$lambda$0(function1, ((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoToggleRow3.BentoToggleRow(bentoToggleRowState, (Function1) objRememberedValue, null, composer, BentoToggleRowState.$stable, 4);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }
}
