package com.robinhood.android.gold.switchplans;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.RadioButtonColors;
import androidx.compose.material3.RadioButtonDefaults;
import androidx.compose.material3.RadioButtonKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposable;
import com.robinhood.android.gold.switchplans.GoldSwitchPlansViewState;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import midas.service.p509v1.GoldPlanSelectionOption;
import midas.service.p509v1.PlanSelectionPageContent;
import midas.service.p509v1.SwitchPlansConfirmationContent;
import midas.service.p509v1.SwitchPlansContentResponse;

/* compiled from: GoldSwitchPlansSelectComposable.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aY\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000328\u0010\u0004\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001aY\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u001428\u0010\u0004\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0015\u001a+\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001cH\u0003¢\u0006\u0002\u0010\u001d\u001a+\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u001cH\u0003¢\u0006\u0002\u0010!\u001aG\u0010\"\u001a\u00020\u000128\u0010\u0004\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010#\"\u0014\u0010\u000f\u001a\u00020\u0006X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0011¨\u0006$²\u0006\n\u0010\t\u001a\u00020\u0006X\u008a\u008e\u0002"}, m3636d2 = {"GoldSwitchPlansSelectComposable", "", "state", "Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState;", "onClickCta", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "selectedPlanId", "Lmidas/service/v1/SwitchPlansConfirmationContent;", "confirmationPage", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/gold/switchplans/GoldSwitchPlansViewState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PlanSelectionRadioTestTag", "getPlanSelectionRadioTestTag$annotations", "()V", "GoldPlanSelection", "planSwitch", "Lmidas/service/v1/SwitchPlansContentResponse;", "(Lmidas/service/v1/SwitchPlansContentResponse;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PricingPlan", "pricingPlan", "Lmidas/service/v1/GoldPlanSelectionOption;", "isSelected", "", "onClick", "Lkotlin/Function0;", "(Lmidas/service/v1/GoldPlanSelectionOption;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BottomBar", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "ctaText", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "GoldSwitchPlansFailed", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "feature-gold-switch-plans_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSwitchPlansSelectComposable {
    public static final String PlanSelectionRadioTestTag = "planSelectionRadio";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$16(String str, String str2, Function0 function0, int i, Composer composer, int i2) {
        BottomBar(str, str2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldPlanSelection$lambda$1(SwitchPlansContentResponse switchPlansContentResponse, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldPlanSelection(switchPlansContentResponse, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldPlanSelection$lambda$6(SwitchPlansContentResponse switchPlansContentResponse, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldPlanSelection(switchPlansContentResponse, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldSwitchPlansFailed$lambda$19(Function2 function2, int i, Composer composer, int i2) {
        GoldSwitchPlansFailed(function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldSwitchPlansSelectComposable$lambda$0(GoldSwitchPlansViewState goldSwitchPlansViewState, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldSwitchPlansSelectComposable(goldSwitchPlansViewState, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PricingPlan$lambda$14(GoldPlanSelectionOption goldPlanSelectionOption, boolean z, Function0 function0, int i, Composer composer, int i2) {
        PricingPlan(goldPlanSelectionOption, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getPlanSelectionRadioTestTag$annotations() {
    }

    public static final void GoldSwitchPlansSelectComposable(final GoldSwitchPlansViewState state, final Function2<? super String, ? super SwitchPlansConfirmationContent, Unit> onClickCta, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2057635007);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickCta) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2057635007, i3, -1, "com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposable (GoldSwitchPlansSelectComposable.kt:53)");
            }
            if (Intrinsics.areEqual(state, GoldSwitchPlansViewState.Loading.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(-1702275670);
                LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(-1865845175, true, new C179451(modifier), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else if (state instanceof GoldSwitchPlansViewState.Loaded) {
                composerStartRestartGroup.startReplaceGroup(-1230622202);
                if (((GoldSwitchPlansViewState.Loaded) state).getSwitchPlans().getPlan_selection() != null) {
                    composerStartRestartGroup.startReplaceGroup(-1230567053);
                    GoldThemeOverlay2.GoldThemeOverlay(ComposableLambda3.rememberComposableLambda(1989804561, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposableKt.GoldSwitchPlansSelectComposable.2
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
                                ComposerKt.traceEventStart(1989804561, i5, -1, "com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposable.<anonymous> (GoldSwitchPlansSelectComposable.kt:67)");
                            }
                            GoldSwitchPlansSelectComposable.GoldPlanSelection(((GoldSwitchPlansViewState.Loaded) state).getSwitchPlans(), onClickCta, ModifiersKt.logScreenTransitions$default(modifier, null, 1, null), composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1230268864);
                    GoldSwitchPlansFailed(onClickCta, composerStartRestartGroup, (i3 >> 3) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(state instanceof GoldSwitchPlansViewState.Error)) {
                    composerStartRestartGroup.startReplaceGroup(-1702277294);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1702250206);
                GoldSwitchPlansFailed(onClickCta, composerStartRestartGroup, (i3 >> 3) & 14);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSwitchPlansSelectComposable.GoldSwitchPlansSelectComposable$lambda$0(state, onClickCta, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GoldSwitchPlansSelectComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposableKt$GoldSwitchPlansSelectComposable$1 */
    static final class C179451 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;

        C179451(Modifier modifier) {
            this.$modifier = modifier;
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
                ComposerKt.traceEventStart(-1865845175, i, -1, "com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposable.<anonymous> (GoldSwitchPlansSelectComposable.kt:57)");
            }
            SwitchPlansContentResponse switchPlans = GoldSwitchPlansViewState.INSTANCE.getLoadingMock().getSwitchPlans();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposableKt$GoldSwitchPlansSelectComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldSwitchPlansSelectComposable.C179451.invoke$lambda$1$lambda$0((String) obj, (SwitchPlansConfirmationContent) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            GoldSwitchPlansSelectComposable.GoldPlanSelection(switchPlans, (Function2) objRememberedValue, this.$modifier, composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(String str, SwitchPlansConfirmationContent switchPlansConfirmationContent) {
            Intrinsics.checkNotNullParameter(str, "<unused var>");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GoldPlanSelection$lambda$5$lambda$3(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    public static final void GoldPlanSelection(final SwitchPlansContentResponse planSwitch, final Function2<? super String, ? super SwitchPlansConfirmationContent, Unit> onClickCta, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(planSwitch, "planSwitch");
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1020775593);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(planSwitch) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickCta) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1020775593, i3, -1, "com.robinhood.android.gold.switchplans.GoldPlanSelection (GoldSwitchPlansSelectComposable.kt:90)");
            }
            PlanSelectionPageContent plan_selection = planSwitch.getPlan_selection();
            SwitchPlansConfirmationContent confirmation_page = planSwitch.getConfirmation_page();
            composerStartRestartGroup.startReplaceGroup(-1712790742);
            if (plan_selection == null) {
                GoldSwitchPlansFailed(onClickCta, composerStartRestartGroup, (i3 >> 3) & 14);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposableKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GoldSwitchPlansSelectComposable.GoldPlanSelection$lambda$1(planSwitch, onClickCta, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Modifier modifier5 = modifier3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(((GoldPlanSelectionOption) CollectionsKt.first((List) plan_selection.getPlans())).getPlan_id(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-1202332587, true, new GoldSwitchPlansSelectComposable2(plan_selection, onClickCta, confirmation_page, snapshotState), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1548377080, true, new GoldSwitchPlansSelectComposable3(modifier5, plan_selection, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSwitchPlansSelectComposable.GoldPlanSelection$lambda$6(planSwitch, onClickCta, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PricingPlan(final GoldPlanSelectionOption goldPlanSelectionOption, boolean z, Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        long jM21373getBg30d7_KjU;
        long jM21425getFg0d7_KjU;
        final Function0<Unit> function02;
        Composer composer2;
        final boolean z2 = z;
        Composer composerStartRestartGroup = composer.startRestartGroup(1003535666);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(goldPlanSelectionOption) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1003535666, i3, -1, "com.robinhood.android.gold.switchplans.PricingPlan (GoldSwitchPlansSelectComposable.kt:155)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierClip = Clip.clip(modifierFillMaxWidth$default, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()));
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(256607278);
                jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(256680717);
                jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21373getBg30d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Selectable3.m5316selectableXHw0xAI$default(BorderKt.m4876borderxT4_qwU(modifierClip, fM7995constructorimpl, jM21373getBg30d7_KjU, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM())), z2, false, Role.m7472boximpl(Role.INSTANCE.m7484getRadioButtono7Vup1c()), function0, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM());
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierWeight$default = Row5.weight$default(Row6.INSTANCE, companion2, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            BentoText2.m20747BentoText38GnDrw(goldPlanSelectionOption.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8190);
            String badge = goldPlanSelectionOption.getBadge();
            composerStartRestartGroup.startReplaceGroup(-1043583153);
            if (badge != null) {
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                InfoTagsKt.m20826BentoInlineInfoTagyZUFuyM(badge, null, null, null, false, null, null, composerStartRestartGroup, 1572864, 62);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            BentoMarkdownText2.BentoMarkdownText(goldPlanSelectionOption.getDescription(), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), (MarkdownStyle) null, function0, (Function1<? super String, Unit>) null, composerStartRestartGroup, ((i3 << 3) & 7168) | 48, 20);
            composerStartRestartGroup.endNode();
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            RadioButtonDefaults radioButtonDefaults = RadioButtonDefaults.INSTANCE;
            long jM21368getAccent0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21368getAccent0d7_KjU();
            if (((Boolean) composerStartRestartGroup.consume(LocalShowPlaceholder.getLocalShowPlaceholder())).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1484468247);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21373getBg30d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1484393878);
                jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU();
                composerStartRestartGroup.endReplaceGroup();
            }
            z2 = z;
            RadioButtonColors radioButtonColorsM5934colorsro_MJ88 = radioButtonDefaults.m5934colorsro_MJ88(jM21368getAccent0d7_KjU, jM21425getFg0d7_KjU, 0L, 0L, composerStartRestartGroup, RadioButtonDefaults.$stable << 12, 12);
            Modifier modifierTestTag = TestTag3.testTag(companion2, PlanSelectionRadioTestTag);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z3 = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GoldSwitchPlansSelectComposable.PricingPlan$lambda$13$lambda$12$lambda$11$lambda$10(z2, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            function02 = function0;
            RadioButtonKt.RadioButton(z2, null, SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue, 1, null), false, radioButtonColorsM5934colorsro_MJ88, null, composerStartRestartGroup, ((i3 >> 3) & 14) | 48, 40);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            Unit unit2 = Unit.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSwitchPlansSelectComposable.PricingPlan$lambda$14(goldPlanSelectionOption, z2, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PricingPlan$lambda$13$lambda$12$lambda$11$lambda$10(boolean z, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setSelected(semantics, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomBar(String str, String str2, Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final String str3;
        final Function0<Unit> function02;
        final String str4 = str2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-320140957);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str;
            function02 = function0;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-320140957, i2, -1, "com.robinhood.android.gold.switchplans.BottomBar (GoldSwitchPlansSelectComposable.kt:217)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            int i4 = i2;
            BentoText2.m20747BentoText38GnDrw(str, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composerStartRestartGroup, (i2 & 14) | 48, 0, 8120);
            str3 = str;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            str4 = str2;
            function02 = function0;
            BentoSparkleButton2.BentoSparkleButton(function02, str4, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, false, false, composerStartRestartGroup, ((i4 >> 6) & 14) | 384 | (i4 & 112), 120);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSwitchPlansSelectComposable.BottomBar$lambda$16(str3, str4, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void GoldSwitchPlansFailed(final Function2<? super String, ? super SwitchPlansConfirmationContent, Unit> onClickCta, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1438118448);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onClickCta) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1438118448, i2, -1, "com.robinhood.android.gold.switchplans.GoldSwitchPlansFailed (GoldSwitchPlansSelectComposable.kt:241)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldSwitchPlansSelectComposable.GoldSwitchPlansFailed$lambda$18$lambda$17(onClickCta);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            ErrorScreenComposable.ErrorScreenComposable(null, (Function0) objRememberedValue, 0, null, null, StringResources_androidKt.stringResource(C11048R.string.general_label_close, composerStartRestartGroup, 0), null, false, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.switchplans.GoldSwitchPlansSelectComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSwitchPlansSelectComposable.GoldSwitchPlansFailed$lambda$19(onClickCta, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldSwitchPlansFailed$lambda$18$lambda$17(Function2 function2) {
        function2.invoke("", null);
        return Unit.INSTANCE;
    }
}
