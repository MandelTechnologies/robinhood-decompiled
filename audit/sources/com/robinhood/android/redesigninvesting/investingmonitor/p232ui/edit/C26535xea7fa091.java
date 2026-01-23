package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.edit;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.redesigninvesting.investingmonitor.C26507R;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorPage;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestingMonitorActionsBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$DeleteConfirmationBottomSheet$1$1$1$1 */
/* loaded from: classes5.dex */
final class C26535xea7fa091 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ InvestingMonitorPage $investingMonitorPage;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function1<InvestingMonitorPage, Unit> $onPageDeleteRequested;

    /* JADX WARN: Multi-variable type inference failed */
    C26535xea7fa091(Function1<? super InvestingMonitorPage, Unit> function1, InvestingMonitorPage investingMonitorPage, Function0<Unit> function0) {
        this.$onPageDeleteRequested = function1;
        this.$investingMonitorPage = investingMonitorPage;
        this.$onDismiss = function0;
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
            ComposerKt.traceEventStart(1401207968, i, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.DeleteConfirmationBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InvestingMonitorActionsBottomSheet.kt:370)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C26507R.string.investing_monitor_delete, composer, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(C26507R.string.investing_monitor_go_back, composer, 0);
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = composer.changed(this.$onPageDeleteRequested) | composer.changedInstance(this.$investingMonitorPage) | composer.changed(this.$onDismiss);
        final Function1<InvestingMonitorPage, Unit> function1 = this.$onPageDeleteRequested;
        final InvestingMonitorPage investingMonitorPage = this.$investingMonitorPage;
        final Function0<Unit> function0 = this.$onDismiss;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$DeleteConfirmationBottomSheet$1$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C26535xea7fa091.invoke$lambda$1$lambda$0(function1, investingMonitorPage, function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function02 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean zChanged2 = composer.changed(this.$onDismiss);
        final Function0<Unit> function03 = this.$onDismiss;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.edit.InvestingMonitorActionsBottomSheetKt$DeleteConfirmationBottomSheet$1$1$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C26535xea7fa091.invoke$lambda$3$lambda$2(function03);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function02, strStringResource, false, null, false, (Function0) objRememberedValue2, strStringResource2, false, null, false, composer, 0, 0, 59199);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, InvestingMonitorPage investingMonitorPage, Function0 function0) {
        function1.invoke(investingMonitorPage);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
