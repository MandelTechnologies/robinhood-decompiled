package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.creditcard.C12201R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PlanSelectorComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class PlanSelectorComposableKt$PlanSelectorComposable$1$1$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Function1<SelectedPlan, Unit> $onPlanSelected;
    final /* synthetic */ SelectedPlan $selectedPlan;

    /* JADX WARN: Multi-variable type inference failed */
    PlanSelectorComposableKt$PlanSelectorComposable$1$1$1(SelectedPlan selectedPlan, Function1<? super SelectedPlan, Unit> function1) {
        this.$selectedPlan = selectedPlan;
        this.$onPlanSelected = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1468065390, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.PlanSelectorComposable.<anonymous>.<anonymous>.<anonymous> (PlanSelectorComposable.kt:185)");
        }
        int i2 = C12201R.drawable.cashback_1p5;
        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_final_terms_plan_selector_gold_basic_title, composer, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.credit_app_final_terms_plan_selector_gold_basic_subtitle, composer, 0);
        SelectedPlan selectedPlan = SelectedPlan.BASIC_1P5_PERCENT;
        boolean z = this.$selectedPlan == selectedPlan;
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$onPlanSelected);
        final Function1<SelectedPlan, Unit> function1 = this.$onPlanSelected;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.PlanSelectorComposableKt$PlanSelectorComposable$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PlanSelectorComposableKt$PlanSelectorComposable$1$1$1.invoke$lambda$1$lambda$0(function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        PlanSelectorComposableKt.PlanSelectorCell(i2, strStringResource, strStringResource2, selectedPlan, z, null, (Function0) objRememberedValue, composer, 3072, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1) {
        function1.invoke(SelectedPlan.BASIC_1P5_PERCENT);
        return Unit.INSTANCE;
    }
}
