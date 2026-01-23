package com.robinhood.android.advisory.onboarding.questionnaire;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.onboarding.AdvisoryOnboardingSharedComponents;
import com.robinhood.android.advisory.onboarding.C8825R;
import com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsScreen7;
import com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreen3;
import com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroViewState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.Haptics;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PortfolioQuestionnaireIntroScreen.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u001aA\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001d\u001a\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010!\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b\"\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e\"\u0010\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\"²\u0006\n\u0010#\u001a\u00020$X\u008a\u008e\u0002²\u0006\f\u0010%\u001a\u0004\u0018\u00010&X\u008a\u0084\u0002"}, m3636d2 = {"goalStringResource", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/api/BrokerageAccountType;", "getGoalStringResource", "(Lcom/robinhood/models/api/BrokerageAccountType;)Lcom/robinhood/utils/resource/StringResource;", "LottieBaseUrl", "", "LightModeLottie", "DarkModeLottie", "MaxAssetSize", "Landroidx/compose/ui/unit/Dp;", "F", "TopMostLightModeColor", "Landroidx/compose/ui/graphics/Color;", "J", "TopMostDarkModeColor", "PortfolioQuestionnaireIntroScreen", "", "viewState", "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState;", "onContinueClicked", "Lkotlin/Function1;", "Ljava/util/UUID;", "onBackClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "VideoHeader", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LottieHeader", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState$Asset$Lottie;", "(Lcom/robinhood/android/advisory/onboarding/questionnaire/PortfolioQuestionnaireIntroViewState$Asset$Lottie;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-onboarding_externalDebug", "showErrorDialog", "", "lottie", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class PortfolioQuestionnaireIntroScreen3 {
    public static final String DarkModeLottie = "https://cdn.robinhood.com/app_assets/advisory/portfolio_reveal/dark/portfolio_questionnaire_intro_dark_mode_v1.json";
    public static final String LightModeLottie = "https://cdn.robinhood.com/app_assets/advisory/portfolio_reveal/light/portfolio_questionnaire_intro_light_mode_v1.json";
    private static final String LottieBaseUrl = "https://cdn.robinhood.com/app_assets/advisory";
    private static final float MaxAssetSize = C2002Dp.m7995constructorimpl(400);
    private static final long TopMostLightModeColor = Color2.Color(4278255873L);
    private static final long TopMostDarkModeColor = Color2.Color(4286613146L);

    /* compiled from: PortfolioQuestionnaireIntroScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LottieHeader$lambda$9(PortfolioQuestionnaireIntroViewState.Asset.Lottie lottie, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LottieHeader(lottie, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioQuestionnaireIntroScreen$lambda$4(PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PortfolioQuestionnaireIntroScreen(portfolioQuestionnaireIntroViewState, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoHeader$lambda$6(Modifier modifier, int i, int i2, Composer composer, int i3) {
        VideoHeader(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final StringResource getGoalStringResource(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()]) {
            case 1:
                return StringResource.INSTANCE.invoke(C8825R.string.portfolio_questionnaire_goal_individual, new Object[0]);
            case 2:
            case 3:
                return StringResource.INSTANCE.invoke(C8825R.string.portfolio_questionnaire_goal_retirement, new Object[0]);
            case 4:
            case 5:
            case 6:
            case 7:
                throw new IllegalStateException(("Unsupported managed account type: " + brokerageAccountType).toString());
            case 8:
                throw new IllegalStateException("ISA stocks and share brokerage type not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final LottieComposition LottieHeader$lambda$8$lambda$7(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PortfolioQuestionnaireIntroScreen$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioQuestionnaireIntroScreen(final PortfolioQuestionnaireIntroViewState viewState, final Function1<? super UUID, Unit> onContinueClicked, final Function0<Unit> onBackClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChanged;
        Object objRememberedValue;
        final SnapshotState snapshotState;
        boolean zChanged2;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-712530828);
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
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-712530828, i3, -1, "com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreen (PortfolioQuestionnaireIntroScreen.kt:94)");
                }
                ErrorDialogData errorDialogData = viewState.getErrorDialogData();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(errorDialogData);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                final boolean isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
                final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                final Modifier modifier5 = modifier4;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1630133513, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt.PortfolioQuestionnaireIntroScreen.1

                    /* compiled from: PortfolioQuestionnaireIntroScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt$PortfolioQuestionnaireIntroScreen$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Function1<UUID, Unit> $onContinueClicked;
                        final /* synthetic */ PortfolioQuestionnaireIntroViewState $viewState;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass2(PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState, Function1<? super UUID, Unit> function1) {
                            this.$viewState = portfolioQuestionnaireIntroViewState;
                            this.$onContinueClicked = function1;
                        }

                        public final void invoke(Composer composer, int i) {
                            Modifier.Companion companion;
                            PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState;
                            Function1<UUID, Unit> function1;
                            Composer composer2 = composer;
                            if ((i & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1743235100, i, -1, "com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreen.<anonymous>.<anonymous> (PortfolioQuestionnaireIntroScreen.kt:141)");
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(companion2);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(modifierNavigationBarsPadding, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM());
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM());
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState2 = this.$viewState;
                            Function1<UUID, Unit> function12 = this.$onContinueClicked;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer2, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composer2.startReplaceGroup(-1696713325);
                            if (portfolioQuestionnaireIntroViewState2.getDisclosure() != null) {
                                function1 = function12;
                                portfolioQuestionnaireIntroViewState = portfolioQuestionnaireIntroViewState2;
                                companion = companion2;
                                BentoText2.m20747BentoText38GnDrw(portfolioQuestionnaireIntroViewState2.getDisclosure(), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i2).getTextS(), composer, 48, 0, 8120);
                                composer2 = composer;
                            } else {
                                companion = companion2;
                                portfolioQuestionnaireIntroViewState = portfolioQuestionnaireIntroViewState2;
                                function1 = function12;
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            String strStringResource = StringResources_androidKt.stringResource(C8825R.string.portfolio_questionnaire_intro_cta, composer2, 0);
                            composer2.startReplaceGroup(-1633490746);
                            final PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState3 = portfolioQuestionnaireIntroViewState;
                            final Function1<UUID, Unit> function13 = function1;
                            boolean zChangedInstance = composer2.changedInstance(portfolioQuestionnaireIntroViewState3) | composer2.changed(function13);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt$PortfolioQuestionnaireIntroScreen$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PortfolioQuestionnaireIntroScreen3.C90521.AnonymousClass2.invoke$lambda$2$lambda$1$lambda$0(portfolioQuestionnaireIntroViewState3, function13);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8(Haptics.hapticClick((Function0) objRememberedValue, composer2, 0), strStringResource, modifierFillMaxWidth$default, null, null, !portfolioQuestionnaireIntroViewState3.getLoading() && portfolioQuestionnaireIntroViewState3.getErrorDialogData() == null, portfolioQuestionnaireIntroViewState3.getLoading(), null, null, null, null, false, null, composer2, 384, 0, 8088);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1$lambda$0(PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState, Function1 function1) {
                            if (portfolioQuestionnaireIntroViewState.getApplicationId() != null) {
                                function1.invoke(portfolioQuestionnaireIntroViewState.getApplicationId());
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1630133513, i5, -1, "com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreen.<anonymous> (PortfolioQuestionnaireIntroScreen.kt:100)");
                        }
                        String str = null;
                        Object[] objArr = 0 == true ? 1 : 0;
                        Object[] objArr2 = 0 == true ? 1 : 0;
                        Object[] objArr3 = 0 == true ? 1 : 0;
                        Object[] objArr4 = 0 == true ? 1 : 0;
                        Object[] objArr5 = 0 == true ? 1 : 0;
                        Object[] objArr6 = 0 == true ? 1 : 0;
                        Object[] objArr7 = 0 == true ? 1 : 0;
                        Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(modifier5, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.PORTFOLIO_QUESTIONNAIRE_INTRO, null, viewState.getLoggingIdentifier(), null, 10, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, viewState.getSource(), null, null, str, objArr2, objArr3, null, null, objArr4, objArr5, objArr6, objArr7, null, objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(viewState.getBrokerageAccountType()), str, null, null, false, false, null, null, null, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -257, -1, -1, 16383, null), null, null, 53, null)));
                        composer2.startReplaceGroup(-1104728748);
                        long strategiesValuePropsLightBackground = (isDay && viewState.getUseGradientBackground()) ? StrategiesValuePropsScreen7.getStrategiesValuePropsLightBackground() : BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU();
                        composer2.endReplaceGroup();
                        long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU();
                        final boolean z = isDay;
                        final PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState = viewState;
                        final Function0<Unit> function0 = onBackClicked;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions, ComposableLambda3.rememberComposableLambda(-1084169019, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt.PortfolioQuestionnaireIntroScreen.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1084169019, i6, -1, "com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreen.<anonymous>.<anonymous> (PortfolioQuestionnaireIntroScreen.kt:125)");
                                }
                                Function2<Composer, Integer, Unit> function2M11113getLambda$1205635592$feature_advisory_onboarding_externalDebug = PortfolioQuestionnaireIntroScreen.INSTANCE.m11113getLambda$1205635592$feature_advisory_onboarding_externalDebug();
                                final PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState2 = portfolioQuestionnaireIntroViewState;
                                final Function0<Unit> function02 = function0;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1998471388, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt.PortfolioQuestionnaireIntroScreen.1.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                        invoke(bentoAppBarScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i7 & 6) == 0) {
                                            i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1998471388, i7, -1, "com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreen.<anonymous>.<anonymous>.<anonymous> (PortfolioQuestionnaireIntroScreen.kt:128)");
                                        }
                                        composer4.startReplaceGroup(-680618167);
                                        Color colorM6701boximpl = portfolioQuestionnaireIntroViewState2.getUseGradientBackground() ? Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).getNova()) : null;
                                        composer4.endReplaceGroup();
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, colorM6701boximpl, function02, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 3);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                Color colorM6701boximpl = Color.m6701boximpl(z ? PortfolioQuestionnaireIntroScreen3.TopMostLightModeColor : PortfolioQuestionnaireIntroScreen3.TopMostDarkModeColor);
                                PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState3 = portfolioQuestionnaireIntroViewState;
                                colorM6701boximpl.getValue();
                                if (!portfolioQuestionnaireIntroViewState3.getUseGradientBackground()) {
                                    colorM6701boximpl = null;
                                }
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11113getLambda$1205635592$feature_advisory_onboarding_externalDebug, null, composableLambdaRememberComposableLambda, null, null, false, false, null, colorM6701boximpl, 0L, null, composer3, 390, 0, 1786);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), ComposableLambda3.rememberComposableLambda(-1743235100, true, new AnonymousClass2(viewState, onContinueClicked), composer2, 54), null, null, 0, strategiesValuePropsLightBackground, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-1673647526, true, new AnonymousClass3(viewState, snapshotState, scrollStateRememberScrollState), composer2, 54), composer2, 805306800, EnumC7081g.f2774x74902ae0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: PortfolioQuestionnaireIntroScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt$PortfolioQuestionnaireIntroScreen$1$3, reason: invalid class name */
                    static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ ScrollState $scrollState;
                        final /* synthetic */ SnapshotState<Boolean> $showErrorDialog$delegate;
                        final /* synthetic */ PortfolioQuestionnaireIntroViewState $viewState;

                        AnonymousClass3(PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState, SnapshotState<Boolean> snapshotState, ScrollState scrollState) {
                            this.$viewState = portfolioQuestionnaireIntroViewState;
                            this.$showErrorDialog$delegate = snapshotState;
                            this.$scrollState = scrollState;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
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
                                ComposerKt.traceEventStart(-1673647526, i2, -1, "com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreen.<anonymous>.<anonymous> (PortfolioQuestionnaireIntroScreen.kt:175)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues);
                            PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState = this.$viewState;
                            ScrollState scrollState = this.$scrollState;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            PortfolioQuestionnaireIntroViewState.Asset asset = portfolioQuestionnaireIntroViewState.getAsset();
                            if (Intrinsics.areEqual(asset, PortfolioQuestionnaireIntroViewState.Asset.Video.INSTANCE)) {
                                composer.startReplaceGroup(-1886269942);
                                PortfolioQuestionnaireIntroScreen3.VideoHeader(Column5.weight$default(column6, companion, AdvisoryOnboardingSharedComponents.getHeroAssetContainerWeight(composer, 0), false, 2, null), composer, 0, 0);
                                composer.endReplaceGroup();
                            } else {
                                if (!(asset instanceof PortfolioQuestionnaireIntroViewState.Asset.Lottie)) {
                                    composer.startReplaceGroup(1601717878);
                                    composer.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer.startReplaceGroup(-1886024267);
                                PortfolioQuestionnaireIntroScreen3.LottieHeader((PortfolioQuestionnaireIntroViewState.Asset.Lottie) portfolioQuestionnaireIntroViewState.getAsset(), Column5.weight$default(column6, companion, AdvisoryOnboardingSharedComponents.getHeroAssetContainerWeight(composer, 0), false, 2, null), composer, 0, 0);
                                composer.endReplaceGroup();
                            }
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), scrollState, false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getSpaceBetween(), companion2.getStart(), composer, 6);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, companion);
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor3);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                            StringResource title = portfolioQuestionnaireIntroViewState.getTitle();
                            int i3 = StringResource.$stable;
                            String string2 = StringResource2.getString(title, composer, i3);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i4 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(string2, PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i4).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, AdvisoryOnboardingSharedComponents.getAdvisoryOnboardingFancyTitle(bentoTheme.getTypography(composer, i4)), composer, 0, 0, 8188);
                            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(portfolioQuestionnaireIntroViewState.getSubtitle(), composer, i3), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
                            composer.endNode();
                            composer.endNode();
                            composer.endNode();
                            if (PortfolioQuestionnaireIntroScreen3.PortfolioQuestionnaireIntroScreen$lambda$1(this.$showErrorDialog$delegate) && this.$viewState.getErrorDialogData() != null) {
                                String title2 = this.$viewState.getErrorDialogData().getTitle();
                                BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(this.$viewState.getErrorDialogData().getMessage());
                                String ctaText = this.$viewState.getErrorDialogData().getCtaText();
                                composer.startReplaceGroup(5004770);
                                boolean zChanged = composer.changed(this.$showErrorDialog$delegate);
                                final SnapshotState<Boolean> snapshotState = this.$showErrorDialog$delegate;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt$PortfolioQuestionnaireIntroScreen$1$3$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return PortfolioQuestionnaireIntroScreen3.C90521.AnonymousClass3.invoke$lambda$4$lambda$3(snapshotState);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoAlertButton bentoAlertButton = new BentoAlertButton(ctaText, (Function0) objRememberedValue);
                                composer.startReplaceGroup(5004770);
                                boolean zChanged2 = composer.changed(this.$showErrorDialog$delegate);
                                final SnapshotState<Boolean> snapshotState2 = this.$showErrorDialog$delegate;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt$PortfolioQuestionnaireIntroScreen$1$3$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return PortfolioQuestionnaireIntroScreen3.C90521.AnonymousClass3.invoke$lambda$6$lambda$5(snapshotState2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                BentoAlertDialog.BentoAlertDialog(title2, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue2, composer, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$3(SnapshotState snapshotState) {
                            PortfolioQuestionnaireIntroScreen3.PortfolioQuestionnaireIntroScreen$lambda$2(snapshotState, false);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5(SnapshotState snapshotState) {
                            PortfolioQuestionnaireIntroScreen3.PortfolioQuestionnaireIntroScreen$lambda$2(snapshotState, false);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                ErrorDialogData errorDialogData2 = viewState.getErrorDialogData();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged2 = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(viewState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new PortfolioQuestionnaireIntroScreen4(viewState, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(errorDialogData2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PortfolioQuestionnaireIntroScreen3.PortfolioQuestionnaireIntroScreen$lambda$4(viewState, onContinueClicked, onBackClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ErrorDialogData errorDialogData3 = viewState.getErrorDialogData();
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(errorDialogData3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                final boolean isDay2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
                final ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                final Modifier modifier52 = modifier4;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1630133513, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt.PortfolioQuestionnaireIntroScreen.1

                    /* compiled from: PortfolioQuestionnaireIntroScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt$PortfolioQuestionnaireIntroScreen$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Function1<UUID, Unit> $onContinueClicked;
                        final /* synthetic */ PortfolioQuestionnaireIntroViewState $viewState;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass2(PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState, Function1<? super UUID, Unit> function1) {
                            this.$viewState = portfolioQuestionnaireIntroViewState;
                            this.$onContinueClicked = function1;
                        }

                        public final void invoke(Composer composer, int i) {
                            Modifier.Companion companion;
                            PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState;
                            Function1<UUID, Unit> function1;
                            Composer composer2 = composer;
                            if ((i & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1743235100, i, -1, "com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreen.<anonymous>.<anonymous> (PortfolioQuestionnaireIntroScreen.kt:141)");
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(companion2);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(modifierNavigationBarsPadding, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM());
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM());
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState2 = this.$viewState;
                            Function1<UUID, Unit> function12 = this.$onContinueClicked;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer2, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composer2.startReplaceGroup(-1696713325);
                            if (portfolioQuestionnaireIntroViewState2.getDisclosure() != null) {
                                function1 = function12;
                                portfolioQuestionnaireIntroViewState = portfolioQuestionnaireIntroViewState2;
                                companion = companion2;
                                BentoText2.m20747BentoText38GnDrw(portfolioQuestionnaireIntroViewState2.getDisclosure(), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i2).getTextS(), composer, 48, 0, 8120);
                                composer2 = composer;
                            } else {
                                companion = companion2;
                                portfolioQuestionnaireIntroViewState = portfolioQuestionnaireIntroViewState2;
                                function1 = function12;
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            String strStringResource = StringResources_androidKt.stringResource(C8825R.string.portfolio_questionnaire_intro_cta, composer2, 0);
                            composer2.startReplaceGroup(-1633490746);
                            final PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState3 = portfolioQuestionnaireIntroViewState;
                            final Function1 function13 = function1;
                            boolean zChangedInstance = composer2.changedInstance(portfolioQuestionnaireIntroViewState3) | composer2.changed(function13);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt$PortfolioQuestionnaireIntroScreen$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PortfolioQuestionnaireIntroScreen3.C90521.AnonymousClass2.invoke$lambda$2$lambda$1$lambda$0(portfolioQuestionnaireIntroViewState3, function13);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8(Haptics.hapticClick((Function0) objRememberedValue, composer2, 0), strStringResource, modifierFillMaxWidth$default, null, null, !portfolioQuestionnaireIntroViewState3.getLoading() && portfolioQuestionnaireIntroViewState3.getErrorDialogData() == null, portfolioQuestionnaireIntroViewState3.getLoading(), null, null, null, null, false, null, composer2, 384, 0, 8088);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1$lambda$0(PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState, Function1 function1) {
                            if (portfolioQuestionnaireIntroViewState.getApplicationId() != null) {
                                function1.invoke(portfolioQuestionnaireIntroViewState.getApplicationId());
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1630133513, i5, -1, "com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreen.<anonymous> (PortfolioQuestionnaireIntroScreen.kt:100)");
                        }
                        String str = null;
                        Object[] objArr = 0 == true ? 1 : 0;
                        Object[] objArr2 = 0 == true ? 1 : 0;
                        Object[] objArr3 = 0 == true ? 1 : 0;
                        Object[] objArr4 = 0 == true ? 1 : 0;
                        Object[] objArr5 = 0 == true ? 1 : 0;
                        Object[] objArr6 = 0 == true ? 1 : 0;
                        Object[] objArr7 = 0 == true ? 1 : 0;
                        Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(modifier52, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.PORTFOLIO_QUESTIONNAIRE_INTRO, null, viewState.getLoggingIdentifier(), null, 10, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, viewState.getSource(), null, null, str, objArr2, objArr3, null, null, objArr4, objArr5, objArr6, objArr7, null, objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(viewState.getBrokerageAccountType()), str, null, null, false, false, null, null, null, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -257, -1, -1, 16383, null), null, null, 53, null)));
                        composer2.startReplaceGroup(-1104728748);
                        long strategiesValuePropsLightBackground = (isDay2 && viewState.getUseGradientBackground()) ? StrategiesValuePropsScreen7.getStrategiesValuePropsLightBackground() : BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU();
                        composer2.endReplaceGroup();
                        long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU();
                        final boolean z = isDay2;
                        final PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState = viewState;
                        final Function0<Unit> function0 = onBackClicked;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions, ComposableLambda3.rememberComposableLambda(-1084169019, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt.PortfolioQuestionnaireIntroScreen.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1084169019, i6, -1, "com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreen.<anonymous>.<anonymous> (PortfolioQuestionnaireIntroScreen.kt:125)");
                                }
                                Function2<Composer, Integer, Unit> function2M11113getLambda$1205635592$feature_advisory_onboarding_externalDebug = PortfolioQuestionnaireIntroScreen.INSTANCE.m11113getLambda$1205635592$feature_advisory_onboarding_externalDebug();
                                final PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState2 = portfolioQuestionnaireIntroViewState;
                                final Function0<Unit> function02 = function0;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1998471388, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt.PortfolioQuestionnaireIntroScreen.1.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                        invoke(bentoAppBarScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i7 & 6) == 0) {
                                            i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1998471388, i7, -1, "com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreen.<anonymous>.<anonymous>.<anonymous> (PortfolioQuestionnaireIntroScreen.kt:128)");
                                        }
                                        composer4.startReplaceGroup(-680618167);
                                        Color colorM6701boximpl = portfolioQuestionnaireIntroViewState2.getUseGradientBackground() ? Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).getNova()) : null;
                                        composer4.endReplaceGroup();
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, colorM6701boximpl, function02, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 3);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                Color colorM6701boximpl = Color.m6701boximpl(z ? PortfolioQuestionnaireIntroScreen3.TopMostLightModeColor : PortfolioQuestionnaireIntroScreen3.TopMostDarkModeColor);
                                PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState3 = portfolioQuestionnaireIntroViewState;
                                colorM6701boximpl.getValue();
                                if (!portfolioQuestionnaireIntroViewState3.getUseGradientBackground()) {
                                    colorM6701boximpl = null;
                                }
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11113getLambda$1205635592$feature_advisory_onboarding_externalDebug, null, composableLambdaRememberComposableLambda, null, null, false, false, null, colorM6701boximpl, 0L, null, composer3, 390, 0, 1786);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), ComposableLambda3.rememberComposableLambda(-1743235100, true, new AnonymousClass2(viewState, onContinueClicked), composer2, 54), null, null, 0, strategiesValuePropsLightBackground, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-1673647526, true, new AnonymousClass3(viewState, snapshotState, scrollStateRememberScrollState2), composer2, 54), composer2, 805306800, EnumC7081g.f2774x74902ae0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: PortfolioQuestionnaireIntroScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt$PortfolioQuestionnaireIntroScreen$1$3, reason: invalid class name */
                    static final class AnonymousClass3 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ ScrollState $scrollState;
                        final /* synthetic */ SnapshotState<Boolean> $showErrorDialog$delegate;
                        final /* synthetic */ PortfolioQuestionnaireIntroViewState $viewState;

                        AnonymousClass3(PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState, SnapshotState<Boolean> snapshotState, ScrollState scrollState) {
                            this.$viewState = portfolioQuestionnaireIntroViewState;
                            this.$showErrorDialog$delegate = snapshotState;
                            this.$scrollState = scrollState;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
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
                                ComposerKt.traceEventStart(-1673647526, i2, -1, "com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreen.<anonymous>.<anonymous> (PortfolioQuestionnaireIntroScreen.kt:175)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierPadding = androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues);
                            PortfolioQuestionnaireIntroViewState portfolioQuestionnaireIntroViewState = this.$viewState;
                            ScrollState scrollState = this.$scrollState;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            PortfolioQuestionnaireIntroViewState.Asset asset = portfolioQuestionnaireIntroViewState.getAsset();
                            if (Intrinsics.areEqual(asset, PortfolioQuestionnaireIntroViewState.Asset.Video.INSTANCE)) {
                                composer.startReplaceGroup(-1886269942);
                                PortfolioQuestionnaireIntroScreen3.VideoHeader(Column5.weight$default(column6, companion, AdvisoryOnboardingSharedComponents.getHeroAssetContainerWeight(composer, 0), false, 2, null), composer, 0, 0);
                                composer.endReplaceGroup();
                            } else {
                                if (!(asset instanceof PortfolioQuestionnaireIntroViewState.Asset.Lottie)) {
                                    composer.startReplaceGroup(1601717878);
                                    composer.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer.startReplaceGroup(-1886024267);
                                PortfolioQuestionnaireIntroScreen3.LottieHeader((PortfolioQuestionnaireIntroViewState.Asset.Lottie) portfolioQuestionnaireIntroViewState.getAsset(), Column5.weight$default(column6, companion, AdvisoryOnboardingSharedComponents.getHeroAssetContainerWeight(composer, 0), false, 2, null), composer, 0, 0);
                                composer.endReplaceGroup();
                            }
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), scrollState, false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getSpaceBetween(), companion2.getStart(), composer, 6);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, companion);
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor3);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                            StringResource title = portfolioQuestionnaireIntroViewState.getTitle();
                            int i3 = StringResource.$stable;
                            String string2 = StringResource2.getString(title, composer, i3);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i4 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(string2, PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i4).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, AdvisoryOnboardingSharedComponents.getAdvisoryOnboardingFancyTitle(bentoTheme.getTypography(composer, i4)), composer, 0, 0, 8188);
                            BentoText2.m20747BentoText38GnDrw(StringResource2.getString(portfolioQuestionnaireIntroViewState.getSubtitle(), composer, i3), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
                            composer.endNode();
                            composer.endNode();
                            composer.endNode();
                            if (PortfolioQuestionnaireIntroScreen3.PortfolioQuestionnaireIntroScreen$lambda$1(this.$showErrorDialog$delegate) && this.$viewState.getErrorDialogData() != null) {
                                String title2 = this.$viewState.getErrorDialogData().getTitle();
                                BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(this.$viewState.getErrorDialogData().getMessage());
                                String ctaText = this.$viewState.getErrorDialogData().getCtaText();
                                composer.startReplaceGroup(5004770);
                                boolean zChanged = composer.changed(this.$showErrorDialog$delegate);
                                final SnapshotState snapshotState = this.$showErrorDialog$delegate;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt$PortfolioQuestionnaireIntroScreen$1$3$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return PortfolioQuestionnaireIntroScreen3.C90521.AnonymousClass3.invoke$lambda$4$lambda$3(snapshotState);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoAlertButton bentoAlertButton = new BentoAlertButton(ctaText, (Function0) objRememberedValue);
                                composer.startReplaceGroup(5004770);
                                boolean zChanged2 = composer.changed(this.$showErrorDialog$delegate);
                                final SnapshotState snapshotState2 = this.$showErrorDialog$delegate;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt$PortfolioQuestionnaireIntroScreen$1$3$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return PortfolioQuestionnaireIntroScreen3.C90521.AnonymousClass3.invoke$lambda$6$lambda$5(snapshotState2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                BentoAlertDialog.BentoAlertDialog(title2, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue2, composer, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$3(SnapshotState snapshotState) {
                            PortfolioQuestionnaireIntroScreen3.PortfolioQuestionnaireIntroScreen$lambda$2(snapshotState, false);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5(SnapshotState snapshotState) {
                            PortfolioQuestionnaireIntroScreen3.PortfolioQuestionnaireIntroScreen$lambda$2(snapshotState, false);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                ErrorDialogData errorDialogData22 = viewState.getErrorDialogData();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged2 = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(viewState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue2 = new PortfolioQuestionnaireIntroScreen4(viewState, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(errorDialogData22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PortfolioQuestionnaireIntroScreen$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VideoHeader(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        String strStringResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(-658773947);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-658773947, i3, -1, "com.robinhood.android.advisory.onboarding.questionnaire.VideoHeader (PortfolioQuestionnaireIntroScreen.kt:246)");
            }
            boolean isDay = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay();
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            if (isDay) {
                composerStartRestartGroup.startReplaceGroup(-1592531224);
                strStringResource = StringResources_androidKt.stringResource(C8825R.string.intro_screen_header_video_mp4_link_day, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1592430970);
                strStringResource = StringResources_androidKt.stringResource(C8825R.string.intro_screen_header_video_mp4_link_night, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            StrategiesValuePropsScreen7.StrategiesVideoContent(strStringResource, null, composerStartRestartGroup, 0, 2);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PortfolioQuestionnaireIntroScreen3.VideoHeader$lambda$6(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LottieHeader(final PortfolioQuestionnaireIntroViewState.Asset.Lottie lottie, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        BentoTheme bentoTheme;
        int i4;
        String dark;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1513384268);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(lottie) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1513384268, i3, -1, "com.robinhood.android.advisory.onboarding.questionnaire.LottieHeader (PortfolioQuestionnaireIntroScreen.kt:265)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                if (!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                    dark = lottie.getLight();
                } else {
                    dark = lottie.getDark();
                }
                modifier3 = modifier4;
                LottieAnimation2.LottieAnimation(LottieHeader$lambda$8$lambda$7(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(dark)), null, null, null, null, null, composerStartRestartGroup, 0, 62)), AspectRatio3.aspectRatio$default(SizeKt.m5158heightInVpY3zN4$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21596getXxlargeD9Ej5fM(), 0.0f, 2, null), 0.0f, MaxAssetSize, 1, null), 1.0f, false, 2, null), false, false, null, 0.0f, !lottie.getIterateForever() ? Integer.MAX_VALUE : 1, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composerStartRestartGroup, 0, 0, 0, 2097084);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.PortfolioQuestionnaireIntroScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PortfolioQuestionnaireIntroScreen3.LottieHeader$lambda$9(lottie, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                if (!bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay()) {
                }
                modifier3 = modifier4;
                LottieAnimation2.LottieAnimation(LottieHeader$lambda$8$lambda$7(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(dark)), null, null, null, null, null, composerStartRestartGroup, 0, 62)), AspectRatio3.aspectRatio$default(SizeKt.m5158heightInVpY3zN4$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21596getXxlargeD9Ej5fM(), 0.0f, 2, null), 0.0f, MaxAssetSize, 1, null), 1.0f, false, 2, null), false, false, null, 0.0f, !lottie.getIterateForever() ? Integer.MAX_VALUE : 1, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composerStartRestartGroup, 0, 0, 0, 2097084);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
