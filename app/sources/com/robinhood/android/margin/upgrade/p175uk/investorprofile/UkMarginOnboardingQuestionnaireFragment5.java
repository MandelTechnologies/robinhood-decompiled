package com.robinhood.android.margin.upgrade.p175uk.investorprofile;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.margin.upgrade.p175uk.investorprofile.UkMarginOnboardingInvestorProfileState3;
import com.robinhood.android.margin.upgrade.p175uk.investorprofile.UkMarginOnboardingQuestionnaireFragment5;
import com.robinhood.compose.bento.component.BentoAppBarDefaults;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost;
import com.robinhood.utils.p409ui.edge2edge.LocalEdgeToEdgeHost;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UkMarginOnboardingQuestionnaireFragment.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\r\u001aA\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"UkMarginOnboardingQuestionnaireScreen", "", "state", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileViewState;", "onCloseClicked", "Lkotlin/Function0;", "onPrimaryButtonClicked", "Lkotlin/Function1;", "Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileViewState$Questionnaire;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewUkMarginOnboardingQuestionnaireScreen", "(Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileViewState;Landroidx/compose/runtime/Composer;I)V", "SplashScreen", "(Lcom/robinhood/android/margin/upgrade/uk/investorprofile/UkMarginOnboardingInvestorProfileViewState$Questionnaire;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-margin-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class UkMarginOnboardingQuestionnaireFragment5 {

    /* compiled from: UkMarginOnboardingQuestionnaireFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UkMarginOnboardingQuestionnaireSplashStyle.values().length];
            try {
                iArr[UkMarginOnboardingQuestionnaireSplashStyle.INVESTOR_PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UkMarginOnboardingQuestionnaireSplashStyle.MARGIN_INVESTING_EXPERIENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UkMarginOnboardingQuestionnaireSplashStyle.MARGIN_KNOWLEDGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewUkMarginOnboardingQuestionnaireScreen$lambda$1(UkMarginOnboardingInvestorProfileState3 ukMarginOnboardingInvestorProfileState3, int i, Composer composer, int i2) {
        PreviewUkMarginOnboardingQuestionnaireScreen(ukMarginOnboardingInvestorProfileState3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SplashScreen$lambda$5(UkMarginOnboardingInvestorProfileState3.Questionnaire questionnaire, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SplashScreen(questionnaire, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UkMarginOnboardingQuestionnaireScreen$lambda$0(UkMarginOnboardingInvestorProfileState3 ukMarginOnboardingInvestorProfileState3, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UkMarginOnboardingQuestionnaireScreen(ukMarginOnboardingInvestorProfileState3, function0, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UkMarginOnboardingQuestionnaireScreen(final UkMarginOnboardingInvestorProfileState3 ukMarginOnboardingInvestorProfileState3, final Function0<Unit> function0, final Function1<? super UkMarginOnboardingInvestorProfileState3.Questionnaire, Unit> function1, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1842389553);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(ukMarginOnboardingInvestorProfileState3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1842389553, i3, -1, "com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireScreen (UkMarginOnboardingQuestionnaireFragment.kt:115)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1254110108, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt.UkMarginOnboardingQuestionnaireScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1254110108, i5, -1, "com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireScreen.<anonymous> (UkMarginOnboardingQuestionnaireFragment.kt:116)");
                    }
                    UkMarginOnboardingInvestorProfileState3 ukMarginOnboardingInvestorProfileState32 = ukMarginOnboardingInvestorProfileState3;
                    if (ukMarginOnboardingInvestorProfileState32 instanceof UkMarginOnboardingInvestorProfileState3.Loading) {
                        composer2.startReplaceGroup(1685999345);
                        LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(WindowInsetsPadding_androidKt.navigationBarsPadding(modifier), new ShimmerLoaderType.Hero.Size.Relative(0.0f, 1, null), false, true, composer2, (ShimmerLoaderType.Hero.Size.Relative.$stable << 3) | 3072, 4);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(ukMarginOnboardingInvestorProfileState32 instanceof UkMarginOnboardingInvestorProfileState3.Questionnaire)) {
                            composer2.startReplaceGroup(1685997133);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(1686008225);
                        UkMarginOnboardingQuestionnaireFragment5.SplashScreen((UkMarginOnboardingInvestorProfileState3.Questionnaire) ukMarginOnboardingInvestorProfileState3, function0, function1, modifier, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UkMarginOnboardingQuestionnaireFragment5.UkMarginOnboardingQuestionnaireScreen$lambda$0(ukMarginOnboardingInvestorProfileState3, function0, function1, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: UkMarginOnboardingQuestionnaireFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt$PreviewUkMarginOnboardingQuestionnaireScreen$1 */
    static final class C212491 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ UkMarginOnboardingInvestorProfileState3 $state;

        C212491(UkMarginOnboardingInvestorProfileState3 ukMarginOnboardingInvestorProfileState3) {
            this.$state = ukMarginOnboardingInvestorProfileState3;
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
                ComposerKt.traceEventStart(1494064117, i, -1, "com.robinhood.android.margin.upgrade.uk.investorprofile.PreviewUkMarginOnboardingQuestionnaireScreen.<anonymous> (UkMarginOnboardingQuestionnaireFragment.kt:139)");
            }
            UkMarginOnboardingInvestorProfileState3 ukMarginOnboardingInvestorProfileState3 = this.$state;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt$PreviewUkMarginOnboardingQuestionnaireScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt$PreviewUkMarginOnboardingQuestionnaireScreen$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UkMarginOnboardingQuestionnaireFragment5.C212491.invoke$lambda$3$lambda$2((UkMarginOnboardingInvestorProfileState3.Questionnaire) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            UkMarginOnboardingQuestionnaireFragment5.UkMarginOnboardingQuestionnaireScreen(ukMarginOnboardingInvestorProfileState3, function0, (Function1) objRememberedValue2, null, composer, 432, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(UkMarginOnboardingInvestorProfileState3.Questionnaire it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    private static final void PreviewUkMarginOnboardingQuestionnaireScreen(final UkMarginOnboardingInvestorProfileState3 ukMarginOnboardingInvestorProfileState3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-81431891);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(ukMarginOnboardingInvestorProfileState3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-81431891, i2, -1, "com.robinhood.android.margin.upgrade.uk.investorprofile.PreviewUkMarginOnboardingQuestionnaireScreen (UkMarginOnboardingQuestionnaireFragment.kt:137)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1494064117, true, new C212491(ukMarginOnboardingInvestorProfileState3), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UkMarginOnboardingQuestionnaireFragment5.PreviewUkMarginOnboardingQuestionnaireScreen$lambda$1(ukMarginOnboardingInvestorProfileState3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SplashScreen(final UkMarginOnboardingInvestorProfileState3.Questionnaire questionnaire, final Function0<Unit> function0, final Function1<? super UkMarginOnboardingInvestorProfileState3.Questionnaire, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final UkMarginOnboardingQuestionnaireSplashStyle splashStyle;
        int i4;
        final long jade;
        Composer composer2;
        final EdgeToEdgeHost edgeToEdgeHost;
        final EventLogger current;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1972712427);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(questionnaire) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1972712427, i3, -1, "com.robinhood.android.margin.upgrade.uk.investorprofile.SplashScreen (UkMarginOnboardingQuestionnaireFragment.kt:153)");
                }
                splashStyle = questionnaire.getSplashStyle();
                i4 = WhenMappings.$EnumSwitchMapping$0[splashStyle.ordinal()];
                if (i4 != 1) {
                    composerStartRestartGroup.startReplaceGroup(1696078735);
                    jade = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJade();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 == 2) {
                    composerStartRestartGroup.startReplaceGroup(1696082094);
                    jade = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIon();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i4 != 3) {
                        composerStartRestartGroup.startReplaceGroup(1696075719);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1696085075);
                    jade = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getSolLight();
                    composerStartRestartGroup.endReplaceGroup();
                }
                int i6 = i3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4), ComposableLambda3.rememberComposableLambda(801049767, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt.SplashScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(801049767, i7, -1, "com.robinhood.android.margin.upgrade.uk.investorprofile.SplashScreen.<anonymous> (UkMarginOnboardingQuestionnaireFragment.kt:165)");
                        }
                        Function2<Composer, Integer, Unit> function2M16257getLambda$1975140070$feature_margin_upgrade_externalDebug = UkMarginOnboardingQuestionnaireFragment2.INSTANCE.m16257getLambda$1975140070$feature_margin_upgrade_externalDebug();
                        final UkMarginOnboardingQuestionnaireSplashStyle ukMarginOnboardingQuestionnaireSplashStyle = splashStyle;
                        final Function0<Unit> function02 = function0;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M16257getLambda$1975140070$feature_margin_upgrade_externalDebug, null, ComposableLambda3.rememberComposableLambda(-58622138, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt.SplashScreen.1.1

                            /* compiled from: UkMarginOnboardingQuestionnaireFragment.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            /* renamed from: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt$SplashScreen$1$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[UkMarginOnboardingQuestionnaireSplashStyle.values().length];
                                    try {
                                        iArr[UkMarginOnboardingQuestionnaireSplashStyle.INVESTOR_PROFILE.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[UkMarginOnboardingQuestionnaireSplashStyle.MARGIN_INVESTING_EXPERIENCE.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[UkMarginOnboardingQuestionnaireSplashStyle.MARGIN_KNOWLEDGE.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(final BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                int i9;
                                long nova;
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i9 = i8 | ((i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2);
                                } else {
                                    i9 = i8;
                                }
                                if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-58622138, i9, -1, "com.robinhood.android.margin.upgrade.uk.investorprofile.SplashScreen.<anonymous>.<anonymous> (UkMarginOnboardingQuestionnaireFragment.kt:167)");
                                }
                                int i10 = WhenMappings.$EnumSwitchMapping$0[ukMarginOnboardingQuestionnaireSplashStyle.ordinal()];
                                if (i10 == 1) {
                                    composer4.startReplaceGroup(-501293526);
                                    nova = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).getNova();
                                    composer4.endReplaceGroup();
                                } else {
                                    if (i10 != 2 && i10 != 3) {
                                        composer4.startReplaceGroup(-501297098);
                                        composer4.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer4.startReplaceGroup(-501285623);
                                    nova = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).getJet();
                                    composer4.endReplaceGroup();
                                }
                                final Function0<Unit> function03 = function02;
                                BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, nova, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-644201960, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt.SplashScreen.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i11) {
                                        if ((i11 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-644201960, i11, -1, "com.robinhood.android.margin.upgrade.uk.investorprofile.SplashScreen.<anonymous>.<anonymous>.<anonymous> (UkMarginOnboardingQuestionnaireFragment.kt:175)");
                                        }
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, BentoAppBarDefaults.NavIconTestTag), false, 0L, function03, composer5, (BentoAppBarScope.$stable << 12) | 6, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54), composer4, 805306368, 509);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, Color.m6701boximpl(jade), 0L, null, composer3, 390, 0, 1786);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-236066810, true, new C212512(function1, questionnaire), composerStartRestartGroup, 54), null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(231537916, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt.SplashScreen.3
                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                        int i8;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i8 = i7 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i8 = i7;
                        }
                        if ((i8 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(231537916, i8, -1, "com.robinhood.android.margin.upgrade.uk.investorprofile.SplashScreen.<anonymous> (UkMarginOnboardingQuestionnaireFragment.kt:195)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierPadding, bentoTheme.getColors(composer3, i9).m21371getBg0d7_KjU(), null, 2, null);
                        long j = jade;
                        UkMarginOnboardingQuestionnaireSplashStyle ukMarginOnboardingQuestionnaireSplashStyle = splashStyle;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM4872backgroundbw27NRU$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier modifierWeight$default = Column5.weight$default(column6, Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), j, null, 2, null), 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResources_androidKt.painterResource(ukMarginOnboardingQuestionnaireSplashStyle.getImageRes(), composer3, 0), (String) null, (Modifier) null, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 24624, 108);
                        composer3.endNode();
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer3, i9).getJet(), 0.0f, composer3, 0, 5);
                        Modifier modifierWeight$default2 = Column5.weight$default(column6, SizeKt.fillMaxSize$default(PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer3, i9).m21592getMediumD9Ej5fM()), 0.0f, 1, null), 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default2);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(ukMarginOnboardingQuestionnaireSplashStyle.getTitleRes(), composer3, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(12), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i9).getBookCoverCapsuleSmall(), composer3, 48, 0, 8188);
                        if (ukMarginOnboardingQuestionnaireSplashStyle == UkMarginOnboardingQuestionnaireSplashStyle.MARGIN_KNOWLEDGE) {
                            composer3.startReplaceGroup(-617322332);
                            BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(ukMarginOnboardingQuestionnaireSplashStyle.getSubtitleRes(), bentoTheme.getColors(composer3, i9).m21425getFg0d7_KjU(), 0L, (LinkInteractionListener) null, composer3, 0, 12), null, null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer3, i9).getTextM(), composer3, 0, 0, 8190);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-616954145);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(ukMarginOnboardingQuestionnaireSplashStyle.getSubtitleRes(), composer3, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                            composer3.endReplaceGroup();
                        }
                        composer3.endNode();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306800, 440);
                composer2 = composerStartRestartGroup;
                edgeToEdgeHost = (EdgeToEdgeHost) composer2.consume(LocalEdgeToEdgeHost.getLocalEdgeToEdgeHost());
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                Unit unit = Unit.INSTANCE;
                composer2.startReplaceGroup(-1224400529);
                zChangedInstance = ((i6 & 14) != 4) | composer2.changedInstance(current) | composer2.changedInstance(edgeToEdgeHost) | composer2.changed(splashStyle.ordinal());
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return UkMarginOnboardingQuestionnaireFragment5.SplashScreen$lambda$4$lambda$3(current, questionnaire, edgeToEdgeHost, splashStyle, (DisposableEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UkMarginOnboardingQuestionnaireFragment5.SplashScreen$lambda$5(questionnaire, function0, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            splashStyle = questionnaire.getSplashStyle();
            i4 = WhenMappings.$EnumSwitchMapping$0[splashStyle.ordinal()];
            if (i4 != 1) {
            }
            int i62 = i3;
            ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4), ComposableLambda3.rememberComposableLambda(801049767, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt.SplashScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(801049767, i7, -1, "com.robinhood.android.margin.upgrade.uk.investorprofile.SplashScreen.<anonymous> (UkMarginOnboardingQuestionnaireFragment.kt:165)");
                    }
                    Function2<Composer, Integer, Unit> function2M16257getLambda$1975140070$feature_margin_upgrade_externalDebug = UkMarginOnboardingQuestionnaireFragment2.INSTANCE.m16257getLambda$1975140070$feature_margin_upgrade_externalDebug();
                    final UkMarginOnboardingQuestionnaireSplashStyle ukMarginOnboardingQuestionnaireSplashStyle = splashStyle;
                    final Function0<Unit> function02 = function0;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M16257getLambda$1975140070$feature_margin_upgrade_externalDebug, null, ComposableLambda3.rememberComposableLambda(-58622138, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt.SplashScreen.1.1

                        /* compiled from: UkMarginOnboardingQuestionnaireFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt$SplashScreen$1$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[UkMarginOnboardingQuestionnaireSplashStyle.values().length];
                                try {
                                    iArr[UkMarginOnboardingQuestionnaireSplashStyle.INVESTOR_PROFILE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[UkMarginOnboardingQuestionnaireSplashStyle.MARGIN_INVESTING_EXPERIENCE.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[UkMarginOnboardingQuestionnaireSplashStyle.MARGIN_KNOWLEDGE.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                            int i9;
                            long nova;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i8 & 6) == 0) {
                                i9 = i8 | ((i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2);
                            } else {
                                i9 = i8;
                            }
                            if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-58622138, i9, -1, "com.robinhood.android.margin.upgrade.uk.investorprofile.SplashScreen.<anonymous>.<anonymous> (UkMarginOnboardingQuestionnaireFragment.kt:167)");
                            }
                            int i10 = WhenMappings.$EnumSwitchMapping$0[ukMarginOnboardingQuestionnaireSplashStyle.ordinal()];
                            if (i10 == 1) {
                                composer4.startReplaceGroup(-501293526);
                                nova = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).getNova();
                                composer4.endReplaceGroup();
                            } else {
                                if (i10 != 2 && i10 != 3) {
                                    composer4.startReplaceGroup(-501297098);
                                    composer4.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer4.startReplaceGroup(-501285623);
                                nova = BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).getJet();
                                composer4.endReplaceGroup();
                            }
                            final Function0<Unit> function03 = function02;
                            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, nova, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-644201960, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt.SplashScreen.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                    invoke(composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer5, int i11) {
                                    if ((i11 & 3) == 2 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-644201960, i11, -1, "com.robinhood.android.margin.upgrade.uk.investorprofile.SplashScreen.<anonymous>.<anonymous>.<anonymous> (UkMarginOnboardingQuestionnaireFragment.kt:175)");
                                    }
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, BentoAppBarDefaults.NavIconTestTag), false, 0L, function03, composer5, (BentoAppBarScope.$stable << 12) | 6, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer4, 54), composer4, 805306368, 509);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, Color.m6701boximpl(jade), 0L, null, composer3, 390, 0, 1786);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-236066810, true, new C212512(function1, questionnaire), composerStartRestartGroup, 54), null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(231537916, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt.SplashScreen.3
                public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                    int i8;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i7 & 6) == 0) {
                        i8 = i7 | (composer3.changed(paddingValues) ? 4 : 2);
                    } else {
                        i8 = i7;
                    }
                    if ((i8 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(231537916, i8, -1, "com.robinhood.android.margin.upgrade.uk.investorprofile.SplashScreen.<anonymous> (UkMarginOnboardingQuestionnaireFragment.kt:195)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierPadding, bentoTheme.getColors(composer3, i9).m21371getBg0d7_KjU(), null, 2, null);
                    long j = jade;
                    UkMarginOnboardingQuestionnaireSplashStyle ukMarginOnboardingQuestionnaireSplashStyle = splashStyle;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM4872backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierWeight$default = Column5.weight$default(column6, Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), j, null, 2, null), 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(ukMarginOnboardingQuestionnaireSplashStyle.getImageRes(), composer3, 0), (String) null, (Modifier) null, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 24624, 108);
                    composer3.endNode();
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer3, i9).getJet(), 0.0f, composer3, 0, 5);
                    Modifier modifierWeight$default2 = Column5.weight$default(column6, SizeKt.fillMaxSize$default(PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer3, i9).m21592getMediumD9Ej5fM()), 0.0f, 1, null), 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default2);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(ukMarginOnboardingQuestionnaireSplashStyle.getTitleRes(), composer3, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(12), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i9).getBookCoverCapsuleSmall(), composer3, 48, 0, 8188);
                    if (ukMarginOnboardingQuestionnaireSplashStyle == UkMarginOnboardingQuestionnaireSplashStyle.MARGIN_KNOWLEDGE) {
                        composer3.startReplaceGroup(-617322332);
                        BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(ukMarginOnboardingQuestionnaireSplashStyle.getSubtitleRes(), bentoTheme.getColors(composer3, i9).m21425getFg0d7_KjU(), 0L, (LinkInteractionListener) null, composer3, 0, 12), null, null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer3, i9).getTextM(), composer3, 0, 0, 8190);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-616954145);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(ukMarginOnboardingQuestionnaireSplashStyle.getSubtitleRes(), composer3, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        composer3.endReplaceGroup();
                    }
                    composer3.endNode();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306800, 440);
            composer2 = composerStartRestartGroup;
            edgeToEdgeHost = (EdgeToEdgeHost) composer2.consume(LocalEdgeToEdgeHost.getLocalEdgeToEdgeHost());
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
            Unit unit2 = Unit.INSTANCE;
            composer2.startReplaceGroup(-1224400529);
            zChangedInstance = ((i62 & 14) != 4) | composer2.changedInstance(current) | composer2.changedInstance(edgeToEdgeHost) | composer2.changed(splashStyle.ordinal());
            objRememberedValue = composer2.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UkMarginOnboardingQuestionnaireFragment5.SplashScreen$lambda$4$lambda$3(current, questionnaire, edgeToEdgeHost, splashStyle, (DisposableEffectScope) obj);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
                composer2.endReplaceGroup();
                EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: UkMarginOnboardingQuestionnaireFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt$SplashScreen$2 */
    static final class C212512 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function1<UkMarginOnboardingInvestorProfileState3.Questionnaire, Unit> $onPrimaryButtonClicked;
        final /* synthetic */ UkMarginOnboardingInvestorProfileState3.Questionnaire $state;

        /* JADX WARN: Multi-variable type inference failed */
        C212512(Function1<? super UkMarginOnboardingInvestorProfileState3.Questionnaire, Unit> function1, UkMarginOnboardingInvestorProfileState3.Questionnaire questionnaire) {
            this.$onPrimaryButtonClicked = function1;
            this.$state = questionnaire;
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
                ComposerKt.traceEventStart(-236066810, i, -1, "com.robinhood.android.margin.upgrade.uk.investorprofile.SplashScreen.<anonymous> (UkMarginOnboardingQuestionnaireFragment.kt:186)");
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onPrimaryButtonClicked) | composer.changed(this.$state);
            final Function1<UkMarginOnboardingInvestorProfileState3.Questionnaire, Unit> function1 = this.$onPrimaryButtonClicked;
            final UkMarginOnboardingInvestorProfileState3.Questionnaire questionnaire = this.$state;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt$SplashScreen$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UkMarginOnboardingQuestionnaireFragment5.C212512.invoke$lambda$1$lambda$0(function1, questionnaire);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, null, (Function0) objRememberedValue, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0), false, null, false, null, null, false, null, false, composer, 0, 0, 65342);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, UkMarginOnboardingInvestorProfileState3.Questionnaire questionnaire) {
            function1.invoke(questionnaire);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult SplashScreen$lambda$4$lambda$3(EventLogger eventLogger, UkMarginOnboardingInvestorProfileState3.Questionnaire questionnaire, final EdgeToEdgeHost edgeToEdgeHost, UkMarginOnboardingQuestionnaireSplashStyle ukMarginOnboardingQuestionnaireSplashStyle, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, new Screen(questionnaire.getSplashStyle().toScreenName(), null, null, null, 14, null), null, null, null, 29, null);
        if (edgeToEdgeHost != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[ukMarginOnboardingQuestionnaireSplashStyle.ordinal()];
            boolean z = true;
            if (i == 1) {
                z = false;
            } else if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            edgeToEdgeHost.overrideSystemBarsStyle(z);
        }
        return new DisposableEffectResult() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.UkMarginOnboardingQuestionnaireFragmentKt$SplashScreen$lambda$4$lambda$3$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                EdgeToEdgeHost edgeToEdgeHost2 = edgeToEdgeHost;
                if (edgeToEdgeHost2 != null) {
                    edgeToEdgeHost2.resetStatusBarStyleOverride();
                }
            }
        };
    }
}
