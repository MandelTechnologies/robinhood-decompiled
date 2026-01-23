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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LegacyGoldUpgradeExtraAgreementsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$GoldUpgradeExtraAgreementsComposable$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class LegacyGoldUpgradeExtraAgreementsComposable2 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<Boolean> $isSlipChecked$delegate;
    final /* synthetic */ SnapshotState<Boolean> $isSweepChecked$delegate;
    final /* synthetic */ Function3<Boolean, Boolean, UUID, Unit> $onClickCta;
    final /* synthetic */ ApiGoldUpgradeFlow.ApiGoldExtraAgreements $this_with;
    final /* synthetic */ SnapshotState4<LegacyGoldUpgradeExtraAgreementsViewState> $viewState$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    LegacyGoldUpgradeExtraAgreementsComposable2(ApiGoldUpgradeFlow.ApiGoldExtraAgreements apiGoldExtraAgreements, Function3<? super Boolean, ? super Boolean, ? super UUID, Unit> function3, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState4<LegacyGoldUpgradeExtraAgreementsViewState> snapshotState4) {
        this.$this_with = apiGoldExtraAgreements;
        this.$onClickCta = function3;
        this.$isSweepChecked$delegate = snapshotState;
        this.$isSlipChecked$delegate = snapshotState2;
        this.$viewState$delegate = snapshotState4;
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
            ComposerKt.traceEventStart(1996543432, i, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeExtraAgreementsComposable.<anonymous>.<anonymous> (LegacyGoldUpgradeExtraAgreementsComposable.kt:63)");
        }
        String ctaText = this.$this_with.getCtaText();
        String strMakeDisclaimer = LegacyGoldUpgradeExtraAgreementsComposable.makeDisclaimer(LegacyGoldUpgradeExtraAgreementsComposable.GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$3(this.$isSweepChecked$delegate), LegacyGoldUpgradeExtraAgreementsComposable.GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$7(this.$isSlipChecked$delegate), this.$this_with.getDynamicDisclaimerMarkdowns());
        composer.startReplaceGroup(-1224400529);
        boolean zChanged = composer.changed(this.$onClickCta) | composer.changed(this.$isSweepChecked$delegate) | composer.changed(this.$isSlipChecked$delegate) | composer.changed(this.$viewState$delegate);
        final Function3<Boolean, Boolean, UUID, Unit> function3 = this.$onClickCta;
        final SnapshotState<Boolean> snapshotState = this.$isSweepChecked$delegate;
        final SnapshotState<Boolean> snapshotState2 = this.$isSlipChecked$delegate;
        final SnapshotState4<LegacyGoldUpgradeExtraAgreementsViewState> snapshotState4 = this.$viewState$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeExtraAgreementsComposableKt$GoldUpgradeExtraAgreementsComposable$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LegacyGoldUpgradeExtraAgreementsComposable2.invoke$lambda$1$lambda$0(function3, snapshotState, snapshotState2, snapshotState4);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        LegacyGoldUpgradeAgreementsComposable.ButtonBar(ctaText, strMakeDisclaimer, (Function0) objRememberedValue, true, composer, 3072);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function3 function3, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState4 snapshotState4) {
        function3.invoke(Boolean.valueOf(LegacyGoldUpgradeExtraAgreementsComposable.GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$3(snapshotState)), Boolean.valueOf(LegacyGoldUpgradeExtraAgreementsComposable.GoldUpgradeExtraAgreementsComposable$lambda$11$lambda$7(snapshotState2)), LegacyGoldUpgradeExtraAgreementsComposable.GoldUpgradeExtraAgreementsComposable$lambda$0(snapshotState4).getSelectedPlanId());
        return Unit.INSTANCE;
    }
}
