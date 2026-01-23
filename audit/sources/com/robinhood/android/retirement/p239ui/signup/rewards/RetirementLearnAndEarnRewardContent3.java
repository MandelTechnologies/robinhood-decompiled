package com.robinhood.android.retirement.p239ui.signup.rewards;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.models.retirement.api.rewards.ApiRetirementLearnAndEarnRewardResponse;
import com.robinhood.android.models.retirement.api.rewards.ApiRetirementLearnAndEarnViewModel;
import com.robinhood.android.retirement.p239ui.signup.rewards.RetirementLearnAndEarnRewardViewState;
import com.robinhood.compose.bento.component.cards.BentoCelebrationCard;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.edge2edge.OverrideSystemBarsStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetirementLearnAndEarnRewardContent.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\u0010\u000b\u001a8\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"LoadingTag", "", "RetirementLearnAndEarnRewardContent", "", "viewState", "Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardViewState;", "onClickContinue", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "deeplink", "(Lcom/robinhood/android/retirement/ui/signup/rewards/RetirementLearnAndEarnRewardViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "RewardLoaded", "result", "Lcom/robinhood/android/models/retirement/api/rewards/ApiRetirementLearnAndEarnRewardResponse;", "(Lcom/robinhood/android/models/retirement/api/rewards/ApiRetirementLearnAndEarnRewardResponse;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Loading", "(Landroidx/compose/runtime/Composer;I)V", "feature-retirement-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.ui.signup.rewards.RetirementLearnAndEarnRewardContentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementLearnAndEarnRewardContent3 {
    public static final String LoadingTag = "loading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$3(int i, Composer composer, int i2) {
        Loading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementLearnAndEarnRewardContent$lambda$0(RetirementLearnAndEarnRewardViewState retirementLearnAndEarnRewardViewState, Function1 function1, int i, Composer composer, int i2) {
        RetirementLearnAndEarnRewardContent(retirementLearnAndEarnRewardViewState, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardLoaded$lambda$2(ApiRetirementLearnAndEarnRewardResponse apiRetirementLearnAndEarnRewardResponse, Function1 function1, int i, Composer composer, int i2) {
        RewardLoaded(apiRetirementLearnAndEarnRewardResponse, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RetirementLearnAndEarnRewardContent(final RetirementLearnAndEarnRewardViewState viewState, final Function1<? super String, Unit> onClickContinue, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onClickContinue, "onClickContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(1486081779);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickContinue) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1486081779, i2, -1, "com.robinhood.android.retirement.ui.signup.rewards.RetirementLearnAndEarnRewardContent (RetirementLearnAndEarnRewardContent.kt:33)");
            }
            OverrideSystemBarsStyle.OverrideSystemBarsStyle(false, composerStartRestartGroup, 6);
            if (viewState instanceof RetirementLearnAndEarnRewardViewState.Loading) {
                composerStartRestartGroup.startReplaceGroup(-2099510724);
                Loading(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(viewState instanceof RetirementLearnAndEarnRewardViewState.Loaded)) {
                    composerStartRestartGroup.startReplaceGroup(-2099512998);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-2099508416);
                RewardLoaded(((RetirementLearnAndEarnRewardViewState.Loaded) viewState).getResult(), onClickContinue, composerStartRestartGroup, i2 & 112);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.signup.rewards.RetirementLearnAndEarnRewardContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementLearnAndEarnRewardContent3.RetirementLearnAndEarnRewardContent$lambda$0(viewState, onClickContinue, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void RewardLoaded(final ApiRetirementLearnAndEarnRewardResponse result, final Function1<? super String, Unit> onClickContinue, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(onClickContinue, "onClickContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1738781486);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(result) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickContinue) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1738781486, i2, -1, "com.robinhood.android.retirement.ui.signup.rewards.RewardLoaded (RetirementLearnAndEarnRewardContent.kt:48)");
            }
            ApiRetirementLearnAndEarnViewModel confirmation_view_model = result.getConfirmation_view_model();
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composerStartRestartGroup, i3).getJade(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            String header = confirmation_view_model.getHeader();
            AnnotatedString annotatedString = new AnnotatedString(confirmation_view_model.getTitle(), null, 2, null);
            String subtitle = confirmation_view_model.getSubtitle();
            BentoCelebrationCard.m20873BentoCelebrationCardjY6E1Zs(SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), header, annotatedString, null, null, confirmation_view_model.getFooter().getLabel(), confirmation_view_model.getFooter().getValue(), subtitle, null, 0L, 0L, composerStartRestartGroup, 0, 0, 1816);
            composerStartRestartGroup = composerStartRestartGroup;
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null)), ComposableLambda3.rememberComposableLambda(1435525713, true, new RetirementLearnAndEarnRewardContent4(onClickContinue, result), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.signup.rewards.RetirementLearnAndEarnRewardContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementLearnAndEarnRewardContent3.RewardLoaded$lambda$2(result, onClickContinue, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Loading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1265140983);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1265140983, i, -1, "com.robinhood.android.retirement.ui.signup.rewards.Loading (RetirementLearnAndEarnRewardContent.kt:92)");
            }
            LocalShowPlaceholder.Loadable(true, TestTag3.testTag(Modifier.INSTANCE, "loading"), null, RetirementLearnAndEarnRewardContent.INSTANCE.getLambda$1156918631$feature_retirement_tab_externalDebug(), composerStartRestartGroup, 3126, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.signup.rewards.RetirementLearnAndEarnRewardContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementLearnAndEarnRewardContent3.Loading$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
