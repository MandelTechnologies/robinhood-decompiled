package com.robinhood.android.transfers.p271ui.max.iradistribution;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.models.api.bonfire.ApiIraDistributionQuestionnaire;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IraDistributionQuestionnaireDistributionTypeScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeScreenKt$IraDistributionQuestionnaireDistributionTypeScreen$1$1$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class IraDistributionQuestionnaireDistributionTypeScreen3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ IraDistributionQuestionnaireDistributionTypeScreen $callbacks;
    final /* synthetic */ ApiIraDistributionQuestionnaire.DistributionTypeRow $row;

    IraDistributionQuestionnaireDistributionTypeScreen3(ApiIraDistributionQuestionnaire.DistributionTypeRow distributionTypeRow, IraDistributionQuestionnaireDistributionTypeScreen iraDistributionQuestionnaireDistributionTypeScreen) {
        this.$row = distributionTypeRow;
        this.$callbacks = iraDistributionQuestionnaireDistributionTypeScreen;
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
            ComposerKt.traceEventStart(-1999935076, i, -1, "com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IraDistributionQuestionnaireDistributionTypeScreen.kt:72)");
        }
        Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, true, false, null, 109, null), IraDistributionQuestionnaireDistributionTypeScreen2.IraDistributionQuestionnaireDistributionTypeRow);
        String title = this.$row.getTitle();
        String subtitle = this.$row.getSubtitle();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$callbacks) | composer.changedInstance(this.$row);
        final IraDistributionQuestionnaireDistributionTypeScreen iraDistributionQuestionnaireDistributionTypeScreen = this.$callbacks;
        final ApiIraDistributionQuestionnaire.DistributionTypeRow distributionTypeRow = this.$row;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeScreenKt$IraDistributionQuestionnaireDistributionTypeScreen$1$1$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IraDistributionQuestionnaireDistributionTypeScreen3.invoke$lambda$1$lambda$0(iraDistributionQuestionnaireDistributionTypeScreen, distributionTypeRow);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierTestTag, null, title, subtitle, null, null, null, false, false, false, 0L, (Function0) objRememberedValue, composer, 0, 0, 2034);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(IraDistributionQuestionnaireDistributionTypeScreen iraDistributionQuestionnaireDistributionTypeScreen, ApiIraDistributionQuestionnaire.DistributionTypeRow distributionTypeRow) {
        iraDistributionQuestionnaireDistributionTypeScreen.onDistributionTypeSelected(distributionTypeRow.getDistribution_type());
        return Unit.INSTANCE;
    }
}
