package com.robinhood.android.advisory.onboarding.outro;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.font.FontWeight;
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
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.onboarding.AdvisoryOnboardingSharedComponents;
import com.robinhood.android.advisory.onboarding.C8825R;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsViewState;
import com.robinhood.android.advisory.onboarding.outro.FirstDepositNumberVisual;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse3;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.retirement.contributions.ContributionProgressRing;
import com.robinhood.android.retirement.contributions.ContributionProgressRingState;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.Haptics;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.trading.tradeflow.OrderForm2;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AdvisoryFirstDepositSubmitComposable.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aI\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a3\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u00162\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u008a\u0084\u0002"}, m3636d2 = {"LottieBaseUrl", "", "CelebrationLightModeLottie", "CelebrationDarkModeLottie", "AdvisorySubmitFirstDepositScreen", "", "visual", "Lcom/robinhood/android/advisory/onboarding/outro/FirstDepositNumberVisual;", EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, "Ljava/math/BigDecimal;", "footerTitle", "Lcom/robinhood/utils/resource/StringResource;", "footerDescription", "onSwipeToSubmit", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/onboarding/outro/FirstDepositNumberVisual;Ljava/math/BigDecimal;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ConfirmationScreen", "viewState", "Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsViewState$Celebration;", "onCtaClicked", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "(Lcom/robinhood/android/advisory/onboarding/outro/AdvisoryPostAgreementsViewState$Celebration;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-onboarding_externalDebug", "lottieComposition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AdvisoryFirstDepositSubmitComposableKt {
    public static final String CelebrationDarkModeLottie = "https://cdn.robinhood.com/app_assets/advisory/account_created_success/dark/account_created_success_dark_v1.json";
    public static final String CelebrationLightModeLottie = "https://cdn.robinhood.com/app_assets/advisory/account_created_success/light/account_created_success_light_v1.json";
    private static final String LottieBaseUrl = "https://cdn.robinhood.com/app_assets/advisory";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisorySubmitFirstDepositScreen$lambda$2(FirstDepositNumberVisual firstDepositNumberVisual, BigDecimal bigDecimal, StringResource stringResource, StringResource stringResource2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AdvisorySubmitFirstDepositScreen(firstDepositNumberVisual, bigDecimal, stringResource, stringResource2, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmationScreen$lambda$4(AdvisoryPostAgreementsViewState.Celebration celebration, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ConfirmationScreen(celebration, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisorySubmitFirstDepositScreen(final FirstDepositNumberVisual visual, final BigDecimal depositAmount, final StringResource stringResource, final StringResource stringResource2, final Function0<Unit> onSwipeToSubmit, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(visual, "visual");
        Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
        Intrinsics.checkNotNullParameter(onSwipeToSubmit, "onSwipeToSubmit");
        Composer composerStartRestartGroup = composer.startRestartGroup(232094163);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(visual) : composerStartRestartGroup.changedInstance(visual) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(depositAmount) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(stringResource2) : composerStartRestartGroup.changedInstance(stringResource2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSwipeToSubmit) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(232094163, i3, -1, "com.robinhood.android.advisory.onboarding.outro.AdvisorySubmitFirstDepositScreen (AdvisoryFirstDepositSubmitComposable.kt:72)");
                }
                Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null);
                int i5 = i3;
                OrderForm6 orderForm6 = OrderForm6.REVIEWING;
                Modifier modifier5 = modifier4;
                Object obj = new Object();
                long nova = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getNova();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i5 & 57344) != 16384;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AdvisoryFirstDepositSubmitComposableKt.AdvisorySubmitFirstDepositScreen$lambda$1$lambda$0(onSwipeToSubmit, obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt composableSingletons$AdvisoryFirstDepositSubmitComposableKt = ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt.INSTANCE;
                composer2 = composerStartRestartGroup;
                OrderForm2.m26341OrderFormVzGUr2s(orderForm6, obj, (Function1) objRememberedValue, composableSingletons$AdvisoryFirstDepositSubmitComposableKt.getLambda$814352503$feature_advisory_onboarding_externalDebug(), ComposableLambda3.rememberComposableLambda(1985561174, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt.AdvisorySubmitFirstDepositScreen.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
                        final SnapshotState snapshotState;
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1985561174, i6, -1, "com.robinhood.android.advisory.onboarding.outro.AdvisorySubmitFirstDepositScreen.<anonymous> (AdvisoryFirstDepositSubmitComposable.kt:77)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final BigDecimal bigDecimal = depositAmount;
                        final FirstDepositNumberVisual firstDepositNumberVisual = visual;
                        final StringResource stringResource3 = stringResource;
                        final StringResource stringResource4 = stringResource2;
                        composer3.startReplaceGroup(-1003410150);
                        composer3.startReplaceGroup(212064437);
                        composer3.endReplaceGroup();
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        Object objRememberedValue2 = composer3.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Measurer2(density);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        final Measurer2 measurer2 = (Measurer2) objRememberedValue2;
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new ConstraintLayoutScope();
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue3;
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue4;
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue5;
                        Object objRememberedValue6 = composer3.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue6;
                        boolean zChangedInstance = composer3.changedInstance(measurer2);
                        final int i7 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                        boolean zChanged = zChangedInstance | composer3.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                        Object objRememberedValue7 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue7 == companion.getEmpty()) {
                            Object obj2 = new MeasurePolicy() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$AdvisorySubmitFirstDepositScreen$2$invoke$$inlined$ConstraintLayout$2
                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.minIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.minIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    snapshotState3.getValue();
                                    long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i7);
                                    snapshotState2.getValue();
                                    int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                    int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                    final Measurer2 measurer22 = measurer2;
                                    return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$AdvisorySubmitFirstDepositScreen$2$invoke$$inlined$ConstraintLayout$2.1
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
                            constraintSetForInlineDsl = constraintSetForInlineDsl2;
                            snapshotState = snapshotState2;
                            composer3.updateRememberedValue(obj2);
                            objRememberedValue7 = obj2;
                        } else {
                            constraintSetForInlineDsl = constraintSetForInlineDsl2;
                            snapshotState = snapshotState2;
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue7;
                        Object objRememberedValue8 = composer3.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                            objRememberedValue8 = new Function0<Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$AdvisorySubmitFirstDepositScreen$2$invoke$$inlined$ConstraintLayout$3
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
                                    snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                    constraintSetForInlineDsl.setKnownDirty(true);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue8);
                        }
                        final Function0 function0 = (Function0) objRememberedValue8;
                        boolean zChangedInstance2 = composer3.changedInstance(measurer2);
                        Object objRememberedValue9 = composer3.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue9 == companion.getEmpty()) {
                            objRememberedValue9 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$AdvisorySubmitFirstDepositScreen$2$invoke$$inlined$ConstraintLayout$4
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
                            composer3.updateRememberedValue(objRememberedValue9);
                        }
                        LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxSize$default, false, (Function1) objRememberedValue9, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$AdvisorySubmitFirstDepositScreen$2$invoke$$inlined$ConstraintLayout$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i8) {
                                String str;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
                                int i9;
                                ConstraintLayoutScope constraintLayoutScope2;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
                                ConstraintLayoutScope constraintLayoutScope3;
                                if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1200550679, i8, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                }
                                snapshotState3.setValue(Unit.INSTANCE);
                                int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                constraintLayoutScope.reset();
                                ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope;
                                composer4.startReplaceGroup(-950744102);
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope4.createRefs();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                String str2 = Formats.getPriceFormat().format(bigDecimal);
                                FirstDepositNumberVisual firstDepositNumberVisual2 = firstDepositNumberVisual;
                                if (firstDepositNumberVisual2 instanceof FirstDepositNumberVisual.Retirement) {
                                    composer4.startReplaceGroup(-950512874);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChanged2 = composer4.changed(constraintLayoutBaseScope4Component2);
                                    Object objRememberedValue10 = composer4.rememberedValue();
                                    if (zChanged2 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue10 = new C8918xc3adf98f(constraintLayoutBaseScope4Component2);
                                        composer4.updateRememberedValue(objRememberedValue10);
                                    }
                                    composer4.endReplaceGroup();
                                    ContributionProgressRing.m18111ContributionProgressRinguFdPcIQ(new ContributionProgressRingState(((FirstDepositNumberVisual.Retirement) firstDepositNumberVisual).getRingPercentage(), str2, ApiRetirementMatchResponse3.UNSPECIFIED, null), C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM(), constraintLayoutScope4.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10), composer4, ContributionProgressRingState.$stable | 48, 0);
                                    composer4.endReplaceGroup();
                                    i9 = helpersHashCode;
                                    constraintLayoutScope2 = constraintLayoutScope4;
                                    constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component2;
                                    constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component3;
                                    str = null;
                                } else {
                                    if (!Intrinsics.areEqual(firstDepositNumberVisual2, FirstDepositNumberVisual.Deposit.INSTANCE)) {
                                        composer4.startReplaceGroup(1770451939);
                                        composer4.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer4.startReplaceGroup(-949561050);
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChanged3 = composer4.changed(constraintLayoutBaseScope4Component2);
                                    Object objRememberedValue11 = composer4.rememberedValue();
                                    if (zChanged3 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue11 = new C8919xc3adfd50(constraintLayoutBaseScope4Component2);
                                        composer4.updateRememberedValue(objRememberedValue11);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierConstrainAs = constraintLayoutScope4.constrainAs(companion3, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue11);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i10 = BentoTheme.$stable;
                                    str = null;
                                    constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component2;
                                    constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component3;
                                    i9 = helpersHashCode;
                                    constraintLayoutScope2 = constraintLayoutScope4;
                                    BentoText2.m20747BentoText38GnDrw(str2, modifierConstrainAs, Color.m6701boximpl(bentoTheme.getColors(composer4, i10).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i10).getBookCoverCapsuleLarge(), composer4, 0, 0, 8184);
                                    composer4.endReplaceGroup();
                                }
                                composer4.startReplaceGroup(1770506602);
                                StringResource stringResource5 = stringResource3;
                                String string2 = stringResource5 == null ? str : StringResource2.getString(stringResource5, composer4, StringResource.$stable);
                                composer4.endReplaceGroup();
                                composer4.startReplaceGroup(1770507625);
                                if (string2 == null) {
                                    constraintLayoutScope3 = constraintLayoutScope2;
                                    constraintLayoutBaseScope43 = constraintLayoutBaseScope42;
                                } else {
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i11 = BentoTheme.$stable;
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme2.getSpacing(composer4, i11).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                                    composer4.startReplaceGroup(5004770);
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope44 = constraintLayoutBaseScope42;
                                    boolean zChanged4 = composer4.changed(constraintLayoutBaseScope44);
                                    Object objRememberedValue12 = composer4.rememberedValue();
                                    if (zChanged4 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue12 = new C8920x9032055e(constraintLayoutBaseScope44);
                                        composer4.updateRememberedValue(objRememberedValue12);
                                    }
                                    composer4.endReplaceGroup();
                                    ConstraintLayoutScope constraintLayoutScope5 = constraintLayoutScope2;
                                    constraintLayoutBaseScope43 = constraintLayoutBaseScope44;
                                    constraintLayoutScope3 = constraintLayoutScope5;
                                    BentoText2.m20747BentoText38GnDrw(string2, constraintLayoutScope5.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4, (Function1) objRememberedValue12), Color.m6701boximpl(bentoTheme2.getColors(composer4, i11).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i11).getTextM(), composer4, 24576, 0, 8168);
                                }
                                composer4.endReplaceGroup();
                                composer4.startReplaceGroup(1770527946);
                                StringResource stringResource6 = stringResource4;
                                String string3 = stringResource6 == null ? str : StringResource2.getString(stringResource6, composer4, StringResource.$stable);
                                composer4.endReplaceGroup();
                                composer4.startReplaceGroup(1770529295);
                                if (string3 != null) {
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    composer4.startReplaceGroup(1849434622);
                                    Object objRememberedValue13 = composer4.rememberedValue();
                                    if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue13 = C8921x90401cdf.INSTANCE;
                                        composer4.updateRememberedValue(objRememberedValue13);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierConstrainAs2 = constraintLayoutScope3.constrainAs(companion5, constraintLayoutBaseScope43, (Function1) objRememberedValue13);
                                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                    int i12 = BentoTheme.$stable;
                                    BentoText2.m20747BentoText38GnDrw(string3, PaddingKt.m5145paddingqDBjuR0(modifierConstrainAs2, bentoTheme3.getSpacing(composer4, i12).m21590getDefaultD9Ej5fM(), bentoTheme3.getSpacing(composer4, i12).m21593getSmallD9Ej5fM(), bentoTheme3.getSpacing(composer4, i12).m21590getDefaultD9Ej5fM(), bentoTheme3.getSpacing(composer4, i12).m21590getDefaultD9Ej5fM()), Color.m6701boximpl(bentoTheme3.getColors(composer4, i12).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer4, i12).getTextM(), composer4, 0, 0, 8184);
                                }
                                composer4.endReplaceGroup();
                                composer4.endReplaceGroup();
                                if (constraintLayoutScope.getHelpersHashCode() != i9) {
                                    EffectsKt.SideEffect(function0, composer4, 6);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), measurePolicy, composer3, 48, 0);
                        composer3.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composableSingletons$AdvisoryFirstDepositSubmitComposableKt.m11087getLambda$1138197451$feature_advisory_onboarding_externalDebug(), modifierLogScreenTransitions$default, null, null, false, composableSingletons$AdvisoryFirstDepositSubmitComposableKt.m11088getLambda$144866604$feature_advisory_onboarding_externalDebug(), 0L, nova, composableSingletons$AdvisoryFirstDepositSubmitComposableKt.m11089getLambda$1830152581$feature_advisory_onboarding_externalDebug(), null, null, composer2, 224262, 3078, 52096);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return AdvisoryFirstDepositSubmitComposableKt.AdvisorySubmitFirstDepositScreen$lambda$2(visual, depositAmount, stringResource, stringResource2, onSwipeToSubmit, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierLogScreenTransitions$default2 = ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null);
            int i52 = i3;
            OrderForm6 orderForm62 = OrderForm6.REVIEWING;
            Modifier modifier52 = modifier4;
            Object obj2 = new Object();
            long nova2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getNova();
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i52 & 57344) != 16384) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj22) {
                        return AdvisoryFirstDepositSubmitComposableKt.AdvisorySubmitFirstDepositScreen$lambda$1$lambda$0(onSwipeToSubmit, obj22);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt composableSingletons$AdvisoryFirstDepositSubmitComposableKt2 = ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt.INSTANCE;
                composer2 = composerStartRestartGroup;
                OrderForm2.m26341OrderFormVzGUr2s(orderForm62, obj2, (Function1) objRememberedValue, composableSingletons$AdvisoryFirstDepositSubmitComposableKt2.getLambda$814352503$feature_advisory_onboarding_externalDebug(), ComposableLambda3.rememberComposableLambda(1985561174, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt.AdvisorySubmitFirstDepositScreen.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
                        final SnapshotState snapshotState;
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1985561174, i6, -1, "com.robinhood.android.advisory.onboarding.outro.AdvisorySubmitFirstDepositScreen.<anonymous> (AdvisoryFirstDepositSubmitComposable.kt:77)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final BigDecimal bigDecimal = depositAmount;
                        final FirstDepositNumberVisual firstDepositNumberVisual = visual;
                        final StringResource stringResource3 = stringResource;
                        final StringResource stringResource4 = stringResource2;
                        composer3.startReplaceGroup(-1003410150);
                        composer3.startReplaceGroup(212064437);
                        composer3.endReplaceGroup();
                        Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        Object objRememberedValue2 = composer3.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Measurer2(density);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        final Measurer2 measurer2 = (Measurer2) objRememberedValue2;
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new ConstraintLayoutScope();
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue3;
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue4;
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue5;
                        Object objRememberedValue6 = composer3.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                            composer3.updateRememberedValue(objRememberedValue6);
                        }
                        final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue6;
                        boolean zChangedInstance = composer3.changedInstance(measurer2);
                        final int i7 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                        boolean zChanged = zChangedInstance | composer3.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                        Object objRememberedValue7 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue7 == companion.getEmpty()) {
                            Object obj22 = new MeasurePolicy() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$AdvisorySubmitFirstDepositScreen$2$invoke$$inlined$ConstraintLayout$2
                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.minIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.minIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                                    final Map linkedHashMap = new LinkedHashMap();
                                    snapshotState3.getValue();
                                    long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i7);
                                    snapshotState2.getValue();
                                    int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                    int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                    final Measurer2 measurer22 = measurer2;
                                    return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$AdvisorySubmitFirstDepositScreen$2$invoke$$inlined$ConstraintLayout$2.1
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
                            constraintSetForInlineDsl = constraintSetForInlineDsl2;
                            snapshotState = snapshotState2;
                            composer3.updateRememberedValue(obj22);
                            objRememberedValue7 = obj22;
                        } else {
                            constraintSetForInlineDsl = constraintSetForInlineDsl2;
                            snapshotState = snapshotState2;
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue7;
                        Object objRememberedValue8 = composer3.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                            objRememberedValue8 = new Function0<Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$AdvisorySubmitFirstDepositScreen$2$invoke$$inlined$ConstraintLayout$3
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
                                    snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                    constraintSetForInlineDsl.setKnownDirty(true);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue8);
                        }
                        final Function0 function0 = (Function0) objRememberedValue8;
                        boolean zChangedInstance2 = composer3.changedInstance(measurer2);
                        Object objRememberedValue9 = composer3.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue9 == companion.getEmpty()) {
                            objRememberedValue9 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$AdvisorySubmitFirstDepositScreen$2$invoke$$inlined$ConstraintLayout$4
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
                            composer3.updateRememberedValue(objRememberedValue9);
                        }
                        LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxSize$default, false, (Function1) objRememberedValue9, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$AdvisorySubmitFirstDepositScreen$2$invoke$$inlined$ConstraintLayout$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i8) {
                                String str;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
                                int i9;
                                ConstraintLayoutScope constraintLayoutScope2;
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
                                ConstraintLayoutScope constraintLayoutScope3;
                                if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1200550679, i8, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                }
                                snapshotState3.setValue(Unit.INSTANCE);
                                int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                constraintLayoutScope.reset();
                                ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope;
                                composer4.startReplaceGroup(-950744102);
                                ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope4.createRefs();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                String str2 = Formats.getPriceFormat().format(bigDecimal);
                                FirstDepositNumberVisual firstDepositNumberVisual2 = firstDepositNumberVisual;
                                if (firstDepositNumberVisual2 instanceof FirstDepositNumberVisual.Retirement) {
                                    composer4.startReplaceGroup(-950512874);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChanged2 = composer4.changed(constraintLayoutBaseScope4Component2);
                                    Object objRememberedValue10 = composer4.rememberedValue();
                                    if (zChanged2 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue10 = new C8918xc3adf98f(constraintLayoutBaseScope4Component2);
                                        composer4.updateRememberedValue(objRememberedValue10);
                                    }
                                    composer4.endReplaceGroup();
                                    ContributionProgressRing.m18111ContributionProgressRinguFdPcIQ(new ContributionProgressRingState(((FirstDepositNumberVisual.Retirement) firstDepositNumberVisual).getRingPercentage(), str2, ApiRetirementMatchResponse3.UNSPECIFIED, null), C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM(), constraintLayoutScope4.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10), composer4, ContributionProgressRingState.$stable | 48, 0);
                                    composer4.endReplaceGroup();
                                    i9 = helpersHashCode;
                                    constraintLayoutScope2 = constraintLayoutScope4;
                                    constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component2;
                                    constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component3;
                                    str = null;
                                } else {
                                    if (!Intrinsics.areEqual(firstDepositNumberVisual2, FirstDepositNumberVisual.Deposit.INSTANCE)) {
                                        composer4.startReplaceGroup(1770451939);
                                        composer4.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer4.startReplaceGroup(-949561050);
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChanged3 = composer4.changed(constraintLayoutBaseScope4Component2);
                                    Object objRememberedValue11 = composer4.rememberedValue();
                                    if (zChanged3 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue11 = new C8919xc3adfd50(constraintLayoutBaseScope4Component2);
                                        composer4.updateRememberedValue(objRememberedValue11);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierConstrainAs = constraintLayoutScope4.constrainAs(companion3, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue11);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i10 = BentoTheme.$stable;
                                    str = null;
                                    constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component2;
                                    constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component3;
                                    i9 = helpersHashCode;
                                    constraintLayoutScope2 = constraintLayoutScope4;
                                    BentoText2.m20747BentoText38GnDrw(str2, modifierConstrainAs, Color.m6701boximpl(bentoTheme.getColors(composer4, i10).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer4, i10).getBookCoverCapsuleLarge(), composer4, 0, 0, 8184);
                                    composer4.endReplaceGroup();
                                }
                                composer4.startReplaceGroup(1770506602);
                                StringResource stringResource5 = stringResource3;
                                String string2 = stringResource5 == null ? str : StringResource2.getString(stringResource5, composer4, StringResource.$stable);
                                composer4.endReplaceGroup();
                                composer4.startReplaceGroup(1770507625);
                                if (string2 == null) {
                                    constraintLayoutScope3 = constraintLayoutScope2;
                                    constraintLayoutBaseScope43 = constraintLayoutBaseScope42;
                                } else {
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i11 = BentoTheme.$stable;
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme2.getSpacing(composer4, i11).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                                    composer4.startReplaceGroup(5004770);
                                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope44 = constraintLayoutBaseScope42;
                                    boolean zChanged4 = composer4.changed(constraintLayoutBaseScope44);
                                    Object objRememberedValue12 = composer4.rememberedValue();
                                    if (zChanged4 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue12 = new C8920x9032055e(constraintLayoutBaseScope44);
                                        composer4.updateRememberedValue(objRememberedValue12);
                                    }
                                    composer4.endReplaceGroup();
                                    ConstraintLayoutScope constraintLayoutScope5 = constraintLayoutScope2;
                                    constraintLayoutBaseScope43 = constraintLayoutBaseScope44;
                                    constraintLayoutScope3 = constraintLayoutScope5;
                                    BentoText2.m20747BentoText38GnDrw(string2, constraintLayoutScope5.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4, (Function1) objRememberedValue12), Color.m6701boximpl(bentoTheme2.getColors(composer4, i11).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i11).getTextM(), composer4, 24576, 0, 8168);
                                }
                                composer4.endReplaceGroup();
                                composer4.startReplaceGroup(1770527946);
                                StringResource stringResource6 = stringResource4;
                                String string3 = stringResource6 == null ? str : StringResource2.getString(stringResource6, composer4, StringResource.$stable);
                                composer4.endReplaceGroup();
                                composer4.startReplaceGroup(1770529295);
                                if (string3 != null) {
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    composer4.startReplaceGroup(1849434622);
                                    Object objRememberedValue13 = composer4.rememberedValue();
                                    if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue13 = C8921x90401cdf.INSTANCE;
                                        composer4.updateRememberedValue(objRememberedValue13);
                                    }
                                    composer4.endReplaceGroup();
                                    Modifier modifierConstrainAs2 = constraintLayoutScope3.constrainAs(companion5, constraintLayoutBaseScope43, (Function1) objRememberedValue13);
                                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                    int i12 = BentoTheme.$stable;
                                    BentoText2.m20747BentoText38GnDrw(string3, PaddingKt.m5145paddingqDBjuR0(modifierConstrainAs2, bentoTheme3.getSpacing(composer4, i12).m21590getDefaultD9Ej5fM(), bentoTheme3.getSpacing(composer4, i12).m21593getSmallD9Ej5fM(), bentoTheme3.getSpacing(composer4, i12).m21590getDefaultD9Ej5fM(), bentoTheme3.getSpacing(composer4, i12).m21590getDefaultD9Ej5fM()), Color.m6701boximpl(bentoTheme3.getColors(composer4, i12).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer4, i12).getTextM(), composer4, 0, 0, 8184);
                                }
                                composer4.endReplaceGroup();
                                composer4.endReplaceGroup();
                                if (constraintLayoutScope.getHelpersHashCode() != i9) {
                                    EffectsKt.SideEffect(function0, composer4, 6);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), measurePolicy, composer3, 48, 0);
                        composer3.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composableSingletons$AdvisoryFirstDepositSubmitComposableKt2.m11087getLambda$1138197451$feature_advisory_onboarding_externalDebug(), modifierLogScreenTransitions$default2, null, null, false, composableSingletons$AdvisoryFirstDepositSubmitComposableKt2.m11088getLambda$144866604$feature_advisory_onboarding_externalDebug(), 0L, nova2, composableSingletons$AdvisoryFirstDepositSubmitComposableKt2.m11089getLambda$1830152581$feature_advisory_onboarding_externalDebug(), null, null, composer2, 224262, 3078, 52096);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieComposition ConfirmationScreen$lambda$3(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* compiled from: AdvisoryFirstDepositSubmitComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$ConfirmationScreen$2 */
    static final class C89232 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ LottieCompositionResult $lottieComposition$delegate;
        final /* synthetic */ Function1<IntentKey, Unit> $onCtaClicked;
        final /* synthetic */ AdvisoryPostAgreementsViewState.Celebration $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C89232(AdvisoryPostAgreementsViewState.Celebration celebration, Function1<? super IntentKey, Unit> function1, LottieCompositionResult lottieCompositionResult) {
            this.$viewState = celebration;
            this.$onCtaClicked = function1;
            this.$lottieComposition$delegate = lottieCompositionResult;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(900820455, i2, -1, "com.robinhood.android.advisory.onboarding.outro.ConfirmationScreen.<anonymous> (AdvisoryFirstDepositSubmitComposable.kt:210)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierPadding, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
            final AdvisoryPostAgreementsViewState.Celebration celebration = this.$viewState;
            final Function1<IntentKey, Unit> function1 = this.$onCtaClicked;
            LottieCompositionResult lottieCompositionResult = this.$lottieComposition$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5143paddingVpY3zN4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            LottieAnimation2.LottieAnimation(AdvisoryFirstDepositSubmitComposableKt.ConfirmationScreen$lambda$3(lottieCompositionResult), Column5.weight$default(column6, companion, 1.0f, false, 2, null), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, true, false, null, null, null, false, false, null, false, null, composer, 1572864, 48, 0, 2095036);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, 1, null);
            StringResource primaryText = celebration.getPrimaryText();
            int i4 = StringResource.$stable;
            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(primaryText, composer, i4), modifierFillMaxWidth$default, null, null, null, null, null, 0, false, 0, 0, null, 0, AdvisoryOnboardingSharedComponents.getAdvisoryOnboardingFancyTitle(bentoTheme.getTypography(composer, i3)), composer, 0, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(celebration.getSecondaryText(), composer, i4), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 48, 0, 8188);
            Spacer2.Spacer(Column5.weight$default(column6, companion, 0.3f, false, 2, null), composer, 0);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component.ComponentType componentType = Component.ComponentType.BUTTON;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, celebration.getPrimaryCtaIdentifier(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null), 0.0f, 1, null);
            String string2 = StringResource2.getString(celebration.getPrimaryCtaText(), composer, i4);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(function1) | composer.changedInstance(celebration);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$ConfirmationScreen$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AdvisoryFirstDepositSubmitComposableKt.C89232.invoke$lambda$5$lambda$1$lambda$0(function1, celebration);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8(Haptics.hapticClick((Function0) objRememberedValue, composer, 0), string2, modifierFillMaxWidth$default2, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
            final IntentKey alternateFundingDestination = celebration.getAlternateFundingDestination();
            composer.startReplaceGroup(1745597702);
            if (alternateFundingDestination != null) {
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, "alternate_funding_cta", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null), 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                String strStringResource = StringResources_androidKt.stringResource(C8825R.string.advisory_celebration_alternate_funding, composer, 0);
                BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                composer.startReplaceGroup(-1633490746);
                boolean zChanged2 = composer.changed(function1) | composer.changedInstance(alternateFundingDestination);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$ConfirmationScreen$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AdvisoryFirstDepositSubmitComposableKt.C89232.invoke$lambda$5$lambda$4$lambda$3$lambda$2(function1, alternateFundingDestination);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8(Haptics.hapticClick((Function0) objRememberedValue2, composer, 0), strStringResource, modifierFillMaxWidth$default3, null, type2, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$1$lambda$0(Function1 function1, AdvisoryPostAgreementsViewState.Celebration celebration) {
            function1.invoke(celebration.getPrimaryDestination());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2(Function1 function1, IntentKey intentKey) {
            function1.invoke(intentKey);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisorySubmitFirstDepositScreen$lambda$1$lambda$0(Function0 function0, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfirmationScreen(final AdvisoryPostAgreementsViewState.Celebration viewState, final Function1<? super IntentKey, Unit> onCtaClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        BentoTheme bentoTheme;
        int i4;
        String str;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onCtaClicked, "onCtaClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-274882792);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCtaClicked) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-274882792, i3, -1, "com.robinhood.android.advisory.onboarding.outro.ConfirmationScreen (AdvisoryFirstDepositSubmitComposable.kt:183)");
                }
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                if (!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                    str = CelebrationLightModeLottie;
                } else {
                    str = CelebrationDarkModeLottie;
                }
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(str)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(1775748828, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt.ConfirmationScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1775748828, i6, -1, "com.robinhood.android.advisory.onboarding.outro.ConfirmationScreen.<anonymous> (AdvisoryFirstDepositSubmitComposable.kt:198)");
                        }
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt.INSTANCE.m11090getLambda$795266551$feature_advisory_onboarding_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-20830627, true, new AnonymousClass1(onCtaClicked, viewState), composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: AdvisoryFirstDepositSubmitComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$ConfirmationScreen$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ Function1<IntentKey, Unit> $onCtaClicked;
                        final /* synthetic */ AdvisoryPostAgreementsViewState.Celebration $viewState;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(Function1<? super IntentKey, Unit> function1, AdvisoryPostAgreementsViewState.Celebration celebration) {
                            this.$onCtaClicked = function1;
                            this.$viewState = celebration;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                            invoke(bentoAppBarScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i & 6) == 0) {
                                i2 = ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2) | i;
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-20830627, i2, -1, "com.robinhood.android.advisory.onboarding.outro.ConfirmationScreen.<anonymous>.<anonymous> (AdvisoryFirstDepositSubmitComposable.kt:201)");
                            }
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged = composer.changed(this.$onCtaClicked) | composer.changedInstance(this.$viewState);
                            final Function1<IntentKey, Unit> function1 = this.$onCtaClicked;
                            final AdvisoryPostAgreementsViewState.Celebration celebration = this.$viewState;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$ConfirmationScreen$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AdvisoryFirstDepositSubmitComposableKt.C89221.AnonymousClass1.invoke$lambda$1$lambda$0(function1, celebration);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, AdvisoryPostAgreementsViewState.Celebration celebration) {
                            function1.invoke(celebration.getDashboardKey());
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(900820455, true, new C89232(viewState, onCtaClicked, lottieCompositionResultRememberLottieComposition), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 805306416, 316);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisoryFirstDepositSubmitComposableKt.ConfirmationScreen$lambda$4(viewState, onCtaClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            bentoTheme = BentoTheme.INSTANCE;
            i4 = BentoTheme.$stable;
            if (!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(str)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            Modifier modifier52 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(1775748828, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt.ConfirmationScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1775748828, i6, -1, "com.robinhood.android.advisory.onboarding.outro.ConfirmationScreen.<anonymous> (AdvisoryFirstDepositSubmitComposable.kt:198)");
                    }
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$AdvisoryFirstDepositSubmitComposableKt.INSTANCE.m11090getLambda$795266551$feature_advisory_onboarding_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-20830627, true, new AnonymousClass1(onCtaClicked, viewState), composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: AdvisoryFirstDepositSubmitComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$ConfirmationScreen$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ Function1<IntentKey, Unit> $onCtaClicked;
                    final /* synthetic */ AdvisoryPostAgreementsViewState.Celebration $viewState;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(Function1<? super IntentKey, Unit> function1, AdvisoryPostAgreementsViewState.Celebration celebration) {
                        this.$onCtaClicked = function1;
                        this.$viewState = celebration;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                        invoke(bentoAppBarScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                        int i2;
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 6) == 0) {
                            i2 = ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2) | i;
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-20830627, i2, -1, "com.robinhood.android.advisory.onboarding.outro.ConfirmationScreen.<anonymous>.<anonymous> (AdvisoryFirstDepositSubmitComposable.kt:201)");
                        }
                        composer.startReplaceGroup(-1633490746);
                        boolean zChanged = composer.changed(this.$onCtaClicked) | composer.changedInstance(this.$viewState);
                        final Function1 function1 = this.$onCtaClicked;
                        final AdvisoryPostAgreementsViewState.Celebration celebration = this.$viewState;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.outro.AdvisoryFirstDepositSubmitComposableKt$ConfirmationScreen$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AdvisoryFirstDepositSubmitComposableKt.C89221.AnonymousClass1.invoke$lambda$1$lambda$0(function1, celebration);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i2 << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, AdvisoryPostAgreementsViewState.Celebration celebration) {
                        function1.invoke(celebration.getDashboardKey());
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(900820455, true, new C89232(viewState, onCtaClicked, lottieCompositionResultRememberLottieComposition2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 805306416, 316);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
