package com.robinhood.android.gold.upgrade.legacy;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LegacyGoldUpgradeAgreementsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt$GoldUpgradeAgreementsComposable$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class LegacyGoldUpgradeAgreementsComposable2 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<Boolean> $isSweepChecked$delegate;
    final /* synthetic */ Function2<Boolean, UUID, Unit> $onClickCta;
    final /* synthetic */ boolean $showSparkleButton;
    final /* synthetic */ ApiGoldUpgradeFlow.ApiGoldSweepAgreements $this_with;
    final /* synthetic */ SnapshotState4<LegacyGoldUpgradeAgreementsViewState> $viewState$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    LegacyGoldUpgradeAgreementsComposable2(ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements, Function2<? super Boolean, ? super UUID, Unit> function2, SnapshotState<Boolean> snapshotState, SnapshotState4<LegacyGoldUpgradeAgreementsViewState> snapshotState4, boolean z) {
        this.$this_with = apiGoldSweepAgreements;
        this.$onClickCta = function2;
        this.$isSweepChecked$delegate = snapshotState;
        this.$viewState$delegate = snapshotState4;
        this.$showSparkleButton = z;
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
            ComposerKt.traceEventStart(-1548014774, i, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeAgreementsComposable.<anonymous>.<anonymous> (LegacyGoldUpgradeAgreementsComposable.kt:96)");
        }
        String ctaText = this.$this_with.getCtaText();
        String disclaimerMarkdown = this.$this_with.getDisclaimerMarkdown();
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = composer.changed(this.$onClickCta) | composer.changed(this.$isSweepChecked$delegate) | composer.changed(this.$viewState$delegate);
        final Function2<Boolean, UUID, Unit> function2 = this.$onClickCta;
        final SnapshotState<Boolean> snapshotState = this.$isSweepChecked$delegate;
        final SnapshotState4<LegacyGoldUpgradeAgreementsViewState> snapshotState4 = this.$viewState$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeAgreementsComposableKt$GoldUpgradeAgreementsComposable$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LegacyGoldUpgradeAgreementsComposable2.invoke$lambda$1$lambda$0(function2, snapshotState, snapshotState4);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        LegacyGoldUpgradeAgreementsComposable.ButtonBar(ctaText, disclaimerMarkdown, (Function0) objRememberedValue, this.$showSparkleButton, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function2 function2, SnapshotState snapshotState, SnapshotState4 snapshotState4) {
        function2.invoke(Boolean.valueOf(LegacyGoldUpgradeAgreementsComposable.GoldUpgradeAgreementsComposable$lambda$6(snapshotState)), LegacyGoldUpgradeAgreementsComposable.GoldUpgradeAgreementsComposable$lambda$3(snapshotState4).getSelectedPlanId());
        return Unit.INSTANCE;
    }
}
