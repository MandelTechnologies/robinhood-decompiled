package com.robinhood.android.cash.rewards.p074ui.onboarding.composables;

import android.content.Context;
import android.text.SpannedString;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.Divider2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingSignUpDuxoV2;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingSignUpFragmentV2;
import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContent;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingSignUpComposableKt$RoundupOnboardingSignUpComposable$$inlined$ConstraintLayout$1 */
/* loaded from: classes7.dex */
public final class C10250x11aaa5e4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ RewardsOnboardingSignUpFragmentV2.Args $args$inlined;
    final /* synthetic */ String $brokerageApy$inlined;
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ RewardsOnboardingContent $confirmationContent$inlined;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ Context $context$inlined;
    final /* synthetic */ String $currentInvestmentName$inlined;
    final /* synthetic */ RewardsOnboardingSignUpDuxoV2 $duxo$inlined;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ String $investmentName$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10250x11aaa5e4(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, Context context, String str, RewardsOnboardingContent rewardsOnboardingContent, String str2, RewardsOnboardingSignUpFragmentV2.Args args, String str3, RewardsOnboardingSignUpDuxoV2 rewardsOnboardingSignUpDuxoV2) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$context$inlined = context;
        this.$investmentName$inlined = str;
        this.$confirmationContent$inlined = rewardsOnboardingContent;
        this.$brokerageApy$inlined = str2;
        this.$args$inlined = args;
        this.$currentInvestmentName$inlined = str3;
        this.$duxo$inlined = rewardsOnboardingSignUpDuxoV2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String strValueOf;
        String strReplace$default;
        C10250x11aaa5e4 c10250x11aaa5e4;
        int i2;
        RewardsOnboardingContent.Disclosure disclosure;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        this.$contentTracker.setValue(Unit.INSTANCE);
        if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        this.$scope.reset();
        ConstraintLayoutScope constraintLayoutScope = this.$scope;
        composer.startReplaceGroup(1312548437);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue == companion2.getEmpty()) {
            objRememberedValue = RoundupOnboardingSignUpComposable2.INSTANCE;
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        ImageKt.Image(PainterResources_androidKt.painterResource(C10176R.drawable.rewards_onboarding_signup_v2, composer, 0), this.$context$inlined.getString(C10176R.string.rewards_signup_image_description), column6.align(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), companion3.getCenterHorizontally()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 0, 120);
        Modifier modifierAlign = column6.align(com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i3).m21594getXlargeD9Ej5fM(), 0.0f, composer, 6, 2), companion3.getCenterHorizontally());
        if (this.$investmentName$inlined != null) {
            RewardsOnboardingContent rewardsOnboardingContent = this.$confirmationContent$inlined;
            strValueOf = StringsKt.replace$default(StringsKt.replace$default(String.valueOf(rewardsOnboardingContent != null ? rewardsOnboardingContent.getTitle() : null), RewardsOnboardingSignUpFragmentV2.TICKER_PLACEHOLDER, this.$investmentName$inlined, false, 4, (Object) null), "{{ .INTEREST_APY }}", this.$brokerageApy$inlined, false, 4, (Object) null);
        } else {
            RewardsOnboardingContent rewardsOnboardingContent2 = this.$confirmationContent$inlined;
            strValueOf = String.valueOf(rewardsOnboardingContent2 != null ? rewardsOnboardingContent2.getTitle() : null);
        }
        TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium();
        TextAlign.Companion companion5 = TextAlign.INSTANCE;
        BentoText2.m20747BentoText38GnDrw(strValueOf, modifierAlign, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 0, 0, 8124);
        Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, composer, 6, 2);
        if (this.$investmentName$inlined != null) {
            RewardsOnboardingContent rewardsOnboardingContent3 = this.$confirmationContent$inlined;
            String strReplace$default2 = StringsKt.replace$default(String.valueOf(rewardsOnboardingContent3 != null ? rewardsOnboardingContent3.getContent() : null), RewardsOnboardingSignUpFragmentV2.TICKER_PLACEHOLDER, this.$investmentName$inlined, false, 4, (Object) null);
            RewardsOnboardingContent bonus = this.$args$inlined.getBonus();
            strReplace$default = StringsKt.replace$default(StringsKt.replace$default(strReplace$default2, "{{ .PERCENTAGE }}", String.valueOf(bonus != null ? bonus.getContent() : null), false, 4, (Object) null), RewardsOnboardingSignUpFragmentV2.OLD_TICKER_PLACEHOLDER, this.$currentInvestmentName$inlined, false, 4, (Object) null);
        } else {
            RewardsOnboardingContent rewardsOnboardingContent4 = this.$confirmationContent$inlined;
            String strValueOf2 = String.valueOf(rewardsOnboardingContent4 != null ? rewardsOnboardingContent4.getContent() : null);
            RewardsOnboardingContent bonus2 = this.$args$inlined.getBonus();
            strReplace$default = StringsKt.replace$default(strValueOf2, "{{ .PERCENTAGE }}", String.valueOf(bonus2 != null ? bonus2.getContent() : null), false, 4, (Object) null);
        }
        BentoText2.m20747BentoText38GnDrw(strReplace$default, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8124);
        composer.endNode();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = RoundupOnboardingSignUpComposable3.INSTANCE;
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue2);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer, 0);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierConstrainAs);
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
        Divider2.m5581DivideroMI9zvI(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), bentoTheme.getColors(composer, i3).m21373getBg30d7_KjU(), C2002Dp.m7995constructorimpl(1), 0.0f, composer, 384, 8);
        Composer composer2 = composer;
        RewardsOnboardingContent rewardsOnboardingContent5 = this.$confirmationContent$inlined;
        CharSequence content = (rewardsOnboardingContent5 == null || (disclosure = rewardsOnboardingContent5.getDisclosure()) == null) ? null : disclosure.getContent();
        composer2.startReplaceGroup(-1202109050);
        if (content == null) {
            c10250x11aaa5e4 = this;
            i2 = i3;
        } else {
            c10250x11aaa5e4 = this;
            i2 = i3;
            BentoSpannedText.m21106BentoSpannedTextTHkziT8(SpannedString.valueOf(content), PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM()), Color.m6701boximpl(bentoTheme.getColors(composer2, i3).m21426getFg20d7_KjU()), null, C20690R.attr.textAppearanceRegularSmall, null, 0, 0, null, composer, 0, 488);
            composer2 = composer;
        }
        composer2.endReplaceGroup();
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
        composer2.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer2.changedInstance(c10250x11aaa5e4.$args$inlined) | composer2.changedInstance(c10250x11aaa5e4.$duxo$inlined);
        Object objRememberedValue3 = composer2.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == companion2.getEmpty()) {
            objRememberedValue3 = new RoundupOnboardingSignUpComposable4(c10250x11aaa5e4.$args$inlined, c10250x11aaa5e4.$duxo$inlined);
            composer2.updateRememberedValue(objRememberedValue3);
        }
        composer2.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, (Function0) objRememberedValue3, c10250x11aaa5e4.$context$inlined.getString(C10176R.string.rewards_onboarding_sign_up_turn_on), false, null, false, null, null, false, null, false, composer, 0, 0, 65342);
        composer.endNode();
        composer.endReplaceGroup();
        boolean zChangedInstance2 = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue4 == companion2.getEmpty()) {
            objRememberedValue4 = new Function0<Unit>() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingSignUpComposableKt$RoundupOnboardingSignUpComposable$$inlined$ConstraintLayout$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope2.getContainerObject().mo8187clone());
                    if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                        snapshotState.setValue(constraintSet3);
                        snapshotState2.setValue(snapshotState.getValue());
                    } else {
                        channel.mo8337trySendJP2dKIU(constraintSet3);
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue4, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
