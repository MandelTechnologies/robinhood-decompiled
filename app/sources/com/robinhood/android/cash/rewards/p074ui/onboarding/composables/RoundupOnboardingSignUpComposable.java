package com.robinhood.android.cash.rewards.p074ui.onboarding.composables;

import android.content.Context;
import android.text.SpannedString;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.Divider2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingSignUpDuxoV2;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingSignUpFragmentV2;
import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContent;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RoundupOnboardingSignUpComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"RoundupOnboardingSignUpComposable", "", "investmentName", "", "currentInvestmentName", "confirmationContent", "Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;", "brokerageApy", "args", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpFragmentV2$Args;", "duxo", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpDuxoV2;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent;Ljava/lang/String;Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpFragmentV2$Args;Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingSignUpDuxoV2;Landroidx/compose/runtime/Composer;I)V", "feature-cash-rewards_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingSignUpComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RoundupOnboardingSignUpComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RoundupOnboardingSignUpComposable$lambda$7(String str, String str2, RewardsOnboardingContent rewardsOnboardingContent, String str3, RewardsOnboardingSignUpFragmentV2.Args args, RewardsOnboardingSignUpDuxoV2 rewardsOnboardingSignUpDuxoV2, int i, Composer composer, int i2) {
        RoundupOnboardingSignUpComposable(str, str2, rewardsOnboardingContent, str3, args, rewardsOnboardingSignUpDuxoV2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RoundupOnboardingSignUpComposable(final String str, final String currentInvestmentName, final RewardsOnboardingContent rewardsOnboardingContent, final String brokerageApy, final RewardsOnboardingSignUpFragmentV2.Args args, final RewardsOnboardingSignUpDuxoV2 duxo, Composer composer, final int i) {
        int i2;
        Object obj;
        SnapshotState snapshotState;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        final SnapshotState snapshotState2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(currentInvestmentName, "currentInvestmentName");
        Intrinsics.checkNotNullParameter(brokerageApy, "brokerageApy");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(557477201);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(currentInvestmentName) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(rewardsOnboardingContent) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(brokerageApy) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(args) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(duxo) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(557477201, i2, -1, "com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingSignUpComposable (RoundupOnboardingSignUpComposable.kt:38)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
            composerStartRestartGroup.startReplaceGroup(-1003410150);
            composerStartRestartGroup.startReplaceGroup(212064437);
            composerStartRestartGroup.endReplaceGroup();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Measurer2(density);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Measurer2 measurer2 = (Measurer2) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue5;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(measurer2) | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                final int i3 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                obj = new MeasurePolicy() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingSignUpComposableKt$RoundupOnboardingSignUpComposable$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        snapshotState4.getValue();
                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i3);
                        snapshotState3.getValue();
                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingSignUpComposableKt$RoundupOnboardingSignUpComposable$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                measurer22.performLayout(placementScope, list, linkedHashMap);
                            }
                        }, 4, null);
                    }
                };
                snapshotState = snapshotState4;
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                snapshotState2 = snapshotState3;
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue6;
                snapshotState = snapshotState4;
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                snapshotState2 = snapshotState3;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) obj;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            final SnapshotState snapshotState5 = snapshotState;
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingSignUpComposableKt$RoundupOnboardingSignUpComposable$$inlined$ConstraintLayout$3
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
                        snapshotState2.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        constraintSetForInlineDsl.setKnownDirty(true);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final Function0 function0 = (Function0) objRememberedValue7;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingSignUpComposableKt$RoundupOnboardingSignUpComposable$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composer2 = composerStartRestartGroup;
            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierNavigationBarsPadding, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingSignUpComposableKt$RoundupOnboardingSignUpComposable$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    String strValueOf;
                    String strReplace$default;
                    C10254x11aaa5e8 c10254x11aaa5e8;
                    int i5;
                    RewardsOnboardingContent.Disclosure disclosure;
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i4, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    snapshotState5.setValue(Unit.INSTANCE);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    composer3.startReplaceGroup(1312548437);
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composer3.startReplaceGroup(1849434622);
                    Object objRememberedValue9 = composer3.rememberedValue();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objRememberedValue9 == companion3.getEmpty()) {
                        objRememberedValue9 = RoundupOnboardingSignUpComposable2.INSTANCE;
                        composer3.updateRememberedValue(objRememberedValue9);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion4.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    ImageKt.Image(PainterResources_androidKt.painterResource(C10176R.drawable.rewards_onboarding_signup_v2, composer3, 0), context.getString(C10176R.string.rewards_signup_image_description), column6.align(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer3, i6).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), companion4.getCenterHorizontally()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 0, 120);
                    Modifier modifierAlign = column6.align(com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, bentoTheme.getSpacing(composer3, i6).m21594getXlargeD9Ej5fM(), 0.0f, composer3, 6, 2), companion4.getCenterHorizontally());
                    if (str != null) {
                        RewardsOnboardingContent rewardsOnboardingContent2 = rewardsOnboardingContent;
                        strValueOf = StringsKt.replace$default(StringsKt.replace$default(String.valueOf(rewardsOnboardingContent2 != null ? rewardsOnboardingContent2.getTitle() : null), RewardsOnboardingSignUpFragmentV2.TICKER_PLACEHOLDER, str, false, 4, (Object) null), "{{ .INTEREST_APY }}", brokerageApy, false, 4, (Object) null);
                    } else {
                        RewardsOnboardingContent rewardsOnboardingContent3 = rewardsOnboardingContent;
                        strValueOf = String.valueOf(rewardsOnboardingContent3 != null ? rewardsOnboardingContent3.getTitle() : null);
                    }
                    TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer3, i6).getDisplayCapsuleMedium();
                    TextAlign.Companion companion6 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strValueOf, modifierAlign, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer3, 0, 0, 8124);
                    Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, bentoTheme.getSpacing(composer3, i6).m21592getMediumD9Ej5fM(), 0.0f, composer3, 6, 2);
                    if (str != null) {
                        RewardsOnboardingContent rewardsOnboardingContent4 = rewardsOnboardingContent;
                        String strReplace$default2 = StringsKt.replace$default(String.valueOf(rewardsOnboardingContent4 != null ? rewardsOnboardingContent4.getContent() : null), RewardsOnboardingSignUpFragmentV2.TICKER_PLACEHOLDER, str, false, 4, (Object) null);
                        RewardsOnboardingContent bonus = args.getBonus();
                        strReplace$default = StringsKt.replace$default(StringsKt.replace$default(strReplace$default2, "{{ .PERCENTAGE }}", String.valueOf(bonus != null ? bonus.getContent() : null), false, 4, (Object) null), RewardsOnboardingSignUpFragmentV2.OLD_TICKER_PLACEHOLDER, currentInvestmentName, false, 4, (Object) null);
                    } else {
                        RewardsOnboardingContent rewardsOnboardingContent5 = rewardsOnboardingContent;
                        String strValueOf2 = String.valueOf(rewardsOnboardingContent5 != null ? rewardsOnboardingContent5.getContent() : null);
                        RewardsOnboardingContent bonus2 = args.getBonus();
                        strReplace$default = StringsKt.replace$default(strValueOf2, "{{ .PERCENTAGE }}", String.valueOf(bonus2 != null ? bonus2.getContent() : null), false, 4, (Object) null);
                    }
                    BentoText2.m20747BentoText38GnDrw(strReplace$default, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8124);
                    composer3.endNode();
                    composer3.startReplaceGroup(1849434622);
                    Object objRememberedValue10 = composer3.rememberedValue();
                    if (objRememberedValue10 == companion3.getEmpty()) {
                        objRememberedValue10 = RoundupOnboardingSignUpComposable3.INSTANCE;
                        composer3.updateRememberedValue(objRememberedValue10);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer3, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierConstrainAs);
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    Divider2.m5581DivideroMI9zvI(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer3, 6, 1), bentoTheme.getColors(composer3, i6).m21373getBg30d7_KjU(), C2002Dp.m7995constructorimpl(1), 0.0f, composer3, 384, 8);
                    Composer composer4 = composer3;
                    RewardsOnboardingContent rewardsOnboardingContent6 = rewardsOnboardingContent;
                    CharSequence content = (rewardsOnboardingContent6 == null || (disclosure = rewardsOnboardingContent6.getDisclosure()) == null) ? null : disclosure.getContent();
                    composer4.startReplaceGroup(-1202109050);
                    if (content == null) {
                        c10254x11aaa5e8 = this;
                        i5 = i6;
                    } else {
                        c10254x11aaa5e8 = this;
                        i5 = i6;
                        BentoSpannedText.m21106BentoSpannedTextTHkziT8(SpannedString.valueOf(content), PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme.getSpacing(composer4, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer4, i6).m21590getDefaultD9Ej5fM()), Color.m6701boximpl(bentoTheme.getColors(composer4, i6).m21426getFg20d7_KjU()), null, C20690R.attr.textAppearanceRegularSmall, null, 0, 0, null, composer3, 0, 488);
                        composer4 = composer3;
                    }
                    composer4.endReplaceGroup();
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer4, i5).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                    composer4.startReplaceGroup(-1633490746);
                    boolean zChangedInstance3 = composer4.changedInstance(args) | composer4.changedInstance(duxo);
                    Object objRememberedValue11 = composer4.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue11 == companion3.getEmpty()) {
                        objRememberedValue11 = new RoundupOnboardingSignUpComposable4(args, duxo);
                        composer4.updateRememberedValue(objRememberedValue11);
                    }
                    composer4.endReplaceGroup();
                    BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, (Function0) objRememberedValue11, context.getString(C10176R.string.rewards_onboarding_sign_up_turn_on), false, null, false, null, null, false, null, false, composer3, 0, 0, 65342);
                    composer3.endNode();
                    composer3.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(function0, composer3, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), measurePolicy, composer2, 48, 0);
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingSignUpComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return RoundupOnboardingSignUpComposable.RoundupOnboardingSignUpComposable$lambda$7(str, currentInvestmentName, rewardsOnboardingContent, brokerageApy, args, duxo, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }
}
