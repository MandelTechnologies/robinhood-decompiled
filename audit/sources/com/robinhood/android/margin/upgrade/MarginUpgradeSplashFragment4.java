package com.robinhood.android.margin.upgrade;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment;
import com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MarginUpgradeSplashFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginUpgradeSplashFragment4 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
    final /* synthetic */ MarginUpgradeSplashFragment this$0;

    MarginUpgradeSplashFragment4(MarginUpgradeSplashFragment marginUpgradeSplashFragment) {
        this.this$0 = marginUpgradeSplashFragment;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
        invoke(bentoButtonBar3, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MarginUpgradeSplashFragment marginUpgradeSplashFragment) {
        BaseMarginUpgradeStepComposeFragment.logTap$default(marginUpgradeSplashFragment, Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null);
        marginUpgradeSplashFragment.getCallbacks().onSplashContinue();
        return Unit.INSTANCE;
    }

    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-664013984, i, -1, "com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (MarginUpgradeSplashFragment.kt:131)");
        }
        Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
        if (((MarginUpgradeSplashFragment.Args) MarginUpgradeSplashFragment.INSTANCE.getArgs((Fragment) this.this$0)).getSplash().isGold()) {
            composer.startReplaceGroup(978980415);
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.this$0);
            final MarginUpgradeSplashFragment marginUpgradeSplashFragment = this.this$0;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment$ComposeContent$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginUpgradeSplashFragment4.invoke$lambda$1$lambda$0(marginUpgradeSplashFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.BentoGoldButton((Function0<Unit>) objRememberedValue, strStringResource, modifierM21618defaultFillMaxWidthPadding3ABfNKs, (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, false, false, (String) null, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(979465379);
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(this.this$0);
            final MarginUpgradeSplashFragment marginUpgradeSplashFragment2 = this.this$0;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment$ComposeContent$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginUpgradeSplashFragment4.invoke$lambda$3$lambda$2(marginUpgradeSplashFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource2, modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(MarginUpgradeSplashFragment marginUpgradeSplashFragment) {
        BaseMarginUpgradeStepComposeFragment.logTap$default(marginUpgradeSplashFragment, Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null);
        marginUpgradeSplashFragment.getCallbacks().onSplashContinue();
        return Unit.INSTANCE;
    }
}
