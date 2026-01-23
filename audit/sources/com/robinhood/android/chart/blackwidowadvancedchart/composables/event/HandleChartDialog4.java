package com.robinhood.android.chart.blackwidowadvancedchart.composables.event;

import android.content.res.Resources;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.ChartDialog;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HandleChartDialog.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.event.HandleChartDialogKt$ChartDialogComposable$1$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class HandleChartDialog4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ChartDialog $chartDialog;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Resources $resources;

    HandleChartDialog4(ChartDialog chartDialog, Resources resources, Function0<Unit> function0) {
        this.$chartDialog = chartDialog;
        this.$resources = resources;
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
            ComposerKt.traceEventStart(-1408148511, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.event.ChartDialogComposable.<anonymous>.<anonymous>.<anonymous> (HandleChartDialog.kt:62)");
        }
        StringResource title = this.$chartDialog.getTitle();
        Resources resources = this.$resources;
        Intrinsics.checkNotNull(resources);
        String string2 = title.getText(resources).toString();
        StringResource body = this.$chartDialog.getBody();
        Resources resources2 = this.$resources;
        Intrinsics.checkNotNull(resources2);
        BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(body.getText(resources2).toString());
        BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, 0), this.$onDismiss);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.event.HandleChartDialogKt$ChartDialogComposable$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoAlertDialog.BentoAlertDialog(string2, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue, composer, (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296 | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
