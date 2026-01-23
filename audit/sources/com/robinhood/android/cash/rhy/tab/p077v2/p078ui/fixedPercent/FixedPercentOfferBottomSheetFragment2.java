package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.fixedPercent;

import android.os.Parcelable;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.fixedPercent.FixedPercentOfferBottomSheetFragment;
import com.robinhood.android.rhyrewards.p246ui.MerchantRewardsOfferDetailsBottomSheet;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FixedPercentOfferBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.fixedPercent.FixedPercentOfferBottomSheetFragment$ComposeContent$1$1$2, reason: use source file name */
/* loaded from: classes7.dex */
final class FixedPercentOfferBottomSheetFragment2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Component $loggingComponent;
    final /* synthetic */ FixedPercentOfferBottomSheetFragment this$0;

    FixedPercentOfferBottomSheetFragment2(FixedPercentOfferBottomSheetFragment fixedPercentOfferBottomSheetFragment, Component component) {
        this.this$0 = fixedPercentOfferBottomSheetFragment;
        this.$loggingComponent = component;
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
            ComposerKt.traceEventStart(1224379931, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.fixedPercent.FixedPercentOfferBottomSheetFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (FixedPercentOfferBottomSheetFragment.kt:108)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(this.$loggingComponent);
        final FixedPercentOfferBottomSheetFragment fixedPercentOfferBottomSheetFragment = this.this$0;
        final Component component = this.$loggingComponent;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.fixedPercent.FixedPercentOfferBottomSheetFragment$ComposeContent$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FixedPercentOfferBottomSheetFragment2.invoke$lambda$1$lambda$0(fixedPercentOfferBottomSheetFragment, component);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        FixedPercentOfferBottomSheetFragment.Companion companion2 = FixedPercentOfferBottomSheetFragment.INSTANCE;
        String primaryCta = ((FixedPercentOfferBottomSheetFragment.Args) companion2.getArgs((Fragment) this.this$0)).getTextResources().getPrimaryCta();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance2 = composer.changedInstance(this.this$0) | composer.changedInstance(this.$loggingComponent);
        final FixedPercentOfferBottomSheetFragment fixedPercentOfferBottomSheetFragment2 = this.this$0;
        final Component component2 = this.$loggingComponent;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.fixedPercent.FixedPercentOfferBottomSheetFragment$ComposeContent$1$1$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FixedPercentOfferBottomSheetFragment2.invoke$lambda$3$lambda$2(fixedPercentOfferBottomSheetFragment2, component2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(modifierM5146paddingqDBjuR0$default, null, null, false, null, null, function0, primaryCta, false, null, false, (Function0) objRememberedValue2, ((FixedPercentOfferBottomSheetFragment.Args) companion2.getArgs((Fragment) this.this$0)).getTextResources().getSecondaryCta(), false, null, false, composer, 0, 0, 59198);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(FixedPercentOfferBottomSheetFragment fixedPercentOfferBottomSheetFragment, Component component) {
        EventLogger.DefaultImpls.logTap$default(fixedPercentOfferBottomSheetFragment.getEventLogger(), UserInteractionEventData.Action.OFFER_PRIMARY_CTA, null, component, null, null, false, 58, null);
        MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet = (MerchantRewardsOfferDetailsBottomSheet) MerchantRewardsOfferDetailsBottomSheet.INSTANCE.newInstance((Parcelable) new MerchantRewardsOfferDetailsBottomSheet.Args(((FixedPercentOfferBottomSheetFragment.Args) FixedPercentOfferBottomSheetFragment.INSTANCE.getArgs((Fragment) fixedPercentOfferBottomSheetFragment)).getMerchantOffer(), false, 2, null));
        FragmentManager parentFragmentManager = fixedPercentOfferBottomSheetFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        merchantRewardsOfferDetailsBottomSheet.show(parentFragmentManager, "MerchantRewardsOfferDetailsBottomSheetDialogFragment");
        fixedPercentOfferBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(FixedPercentOfferBottomSheetFragment fixedPercentOfferBottomSheetFragment, Component component) {
        EventLogger.DefaultImpls.logTap$default(fixedPercentOfferBottomSheetFragment.getEventLogger(), UserInteractionEventData.Action.DISMISS, null, component, null, null, false, 58, null);
        fixedPercentOfferBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }
}
