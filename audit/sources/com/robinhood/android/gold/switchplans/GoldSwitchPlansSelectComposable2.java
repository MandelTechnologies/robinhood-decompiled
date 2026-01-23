package com.robinhood.android.gold.switchplans;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import midas.service.p509v1.GoldPlanSelectionOption;
import midas.service.p509v1.PlanSelectionPageContent;
import midas.service.p509v1.SwitchPlansConfirmationContent;

/* compiled from: GoldSwitchPlansSelectComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposableKt$GoldPlanSelection$2$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldSwitchPlansSelectComposable2 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
    final /* synthetic */ SwitchPlansConfirmationContent $confirmationPage;
    final /* synthetic */ Function2<String, SwitchPlansConfirmationContent, Unit> $onClickCta;
    final /* synthetic */ SnapshotState<String> $selectedPlanId$delegate;
    final /* synthetic */ PlanSelectionPageContent $this_with;

    /* JADX WARN: Multi-variable type inference failed */
    GoldSwitchPlansSelectComposable2(PlanSelectionPageContent planSelectionPageContent, Function2<? super String, ? super SwitchPlansConfirmationContent, Unit> function2, SwitchPlansConfirmationContent switchPlansConfirmationContent, SnapshotState<String> snapshotState) {
        this.$this_with = planSelectionPageContent;
        this.$onClickCta = function2;
        this.$confirmationPage = switchPlansConfirmationContent;
        this.$selectedPlanId$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
        invoke(bentoButtonBar3, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1202332587, i, -1, "com.robinhood.android.gold.switchplans.GoldPlanSelection.<anonymous>.<anonymous> (GoldSwitchPlansSelectComposable.kt:105)");
        }
        List<GoldPlanSelectionOption> plans = this.$this_with.getPlans();
        SnapshotState<String> snapshotState = this.$selectedPlanId$delegate;
        for (GoldPlanSelectionOption goldPlanSelectionOption : plans) {
            if (Intrinsics.areEqual(goldPlanSelectionOption.getPlan_id(), GoldSwitchPlansSelectComposable.GoldPlanSelection$lambda$5$lambda$3(snapshotState))) {
                String select_text = goldPlanSelectionOption.getSelect_text();
                if (select_text == null) {
                    select_text = "";
                }
                String cta_text = this.$this_with.getCta_text();
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(this.$this_with) | composer.changed(this.$onClickCta) | composer.changedInstance(this.$confirmationPage);
                final PlanSelectionPageContent planSelectionPageContent = this.$this_with;
                final Function2<String, SwitchPlansConfirmationContent, Unit> function2 = this.$onClickCta;
                final SwitchPlansConfirmationContent switchPlansConfirmationContent = this.$confirmationPage;
                final SnapshotState<String> snapshotState2 = this.$selectedPlanId$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposableKt$GoldPlanSelection$2$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GoldSwitchPlansSelectComposable2.invoke$lambda$2$lambda$1(planSelectionPageContent, function2, switchPlansConfirmationContent, snapshotState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                GoldSwitchPlansSelectComposable.BottomBar(select_text, cta_text, (Function0) objRememberedValue, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(PlanSelectionPageContent planSelectionPageContent, Function2 function2, SwitchPlansConfirmationContent switchPlansConfirmationContent, SnapshotState snapshotState) {
        if (!Intrinsics.areEqual(((GoldPlanSelectionOption) CollectionsKt.first((List) planSelectionPageContent.getPlans())).getPlan_id(), GoldSwitchPlansSelectComposable.GoldPlanSelection$lambda$5$lambda$3(snapshotState))) {
            function2.invoke(GoldSwitchPlansSelectComposable.GoldPlanSelection$lambda$5$lambda$3(snapshotState), switchPlansConfirmationContent);
        } else {
            function2.invoke("", null);
        }
        return Unit.INSTANCE;
    }
}
