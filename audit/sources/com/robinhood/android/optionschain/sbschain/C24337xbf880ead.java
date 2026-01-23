package com.robinhood.android.optionschain.sbschain;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.optionschain.sbschain.appbar.OptionSideBySideChainTopAppBar4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$2 */
/* loaded from: classes11.dex */
final class C24337xbf880ead implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ OptionSideBySideChainDuxo $duxo;
    final /* synthetic */ Function0<Unit> $onBackClick;
    final /* synthetic */ Function0<Unit> $onChainSettingsTapped;
    final /* synthetic */ Function1<FragmentKey, Unit> $openChainSettings;
    final /* synthetic */ SnapshotState4<OptionSideBySideChainViewState> $viewState$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    C24337xbf880ead(Function0<Unit> function0, Function1<? super FragmentKey, Unit> function1, Function0<Unit> function02, OptionSideBySideChainDuxo optionSideBySideChainDuxo, SnapshotState4<OptionSideBySideChainViewState> snapshotState4) {
        this.$onBackClick = function0;
        this.$openChainSettings = function1;
        this.$onChainSettingsTapped = function02;
        this.$duxo = optionSideBySideChainDuxo;
        this.$viewState$delegate = snapshotState4;
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
            ComposerKt.traceEventStart(-1625872682, i, -1, "com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposable.<anonymous>.<anonymous> (OptionSideBySideChainComposable.kt:153)");
        }
        boolean showClearButton = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(this.$viewState$delegate).getShowClearButton();
        OptionSideBySideChainDataState7 tooltipState = OptionSideBySideChainComposableKt.OptionSideBySideChainComposable$lambda$0(this.$viewState$delegate).getTooltipState();
        Function0<Unit> function0 = this.$onBackClick;
        Function1<FragmentKey, Unit> function1 = this.$openChainSettings;
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$onChainSettingsTapped) | composer.changedInstance(this.$duxo);
        final Function0<Unit> function02 = this.$onChainSettingsTapped;
        final OptionSideBySideChainDuxo optionSideBySideChainDuxo = this.$duxo;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C24337xbf880ead.invoke$lambda$1$lambda$0(function02, optionSideBySideChainDuxo);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function03 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        OptionSideBySideChainDuxo optionSideBySideChainDuxo2 = this.$duxo;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(optionSideBySideChainDuxo2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new C24338x8a680dc8(optionSideBySideChainDuxo2);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Function0 function04 = (Function0) ((KFunction) objRememberedValue2);
        OptionSideBySideChainDuxo optionSideBySideChainDuxo3 = this.$duxo;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance2 = composer.changedInstance(optionSideBySideChainDuxo3);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new C24339x8a681189(optionSideBySideChainDuxo3);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        Function0 function05 = (Function0) ((KFunction) objRememberedValue3);
        OptionSideBySideChainDuxo optionSideBySideChainDuxo4 = this.$duxo;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance3 = composer.changedInstance(optionSideBySideChainDuxo4);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new C24340x8a68154a(optionSideBySideChainDuxo4);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        Function1 function12 = (Function1) ((KFunction) objRememberedValue4);
        OptionSideBySideChainDuxo optionSideBySideChainDuxo5 = this.$duxo;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance4 = composer.changedInstance(optionSideBySideChainDuxo5);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new C24341x8a68190b(optionSideBySideChainDuxo5);
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        Function0 function06 = (Function0) ((KFunction) objRememberedValue5);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance5 = composer.changedInstance(this.$duxo);
        final OptionSideBySideChainDuxo optionSideBySideChainDuxo6 = this.$duxo;
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChangedInstance5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue6 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C24337xbf880ead.invoke$lambda$7$lambda$6(optionSideBySideChainDuxo6);
                }
            };
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        OptionSideBySideChainTopAppBar4.OptionSideBySideChainTopAppBar(showClearButton, tooltipState, function0, function1, function03, function04, function05, function12, function06, null, null, (Function0) objRememberedValue6, composer, 0, 0, 1536);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function0 function0, OptionSideBySideChainDuxo optionSideBySideChainDuxo) {
        function0.invoke();
        optionSideBySideChainDuxo.setTappedChainSettingsInCurrentSession();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(OptionSideBySideChainDuxo optionSideBySideChainDuxo) {
        optionSideBySideChainDuxo.logTapClearMultilegSelection();
        optionSideBySideChainDuxo.clearSelectedLegs();
        return Unit.INSTANCE;
    }
}
