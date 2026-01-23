package com.robinhood.android.retirement.contributions;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RemoteImageRenderer;
import com.robinhood.android.transfers.lib.TransferAccounts4;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: ContributionReviewMode.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"GoldMatchSelectionRowTag", "", "AmountTestTag", "FrequencyTestTag", "FromAccountTestTag", "ToAccountTestTag", "ContributionTypeTestTag", "YearTestTag", "ContributionReviewMode", "", "state", "Lcom/robinhood/android/retirement/contributions/ContributionReviewModeState;", "callbacks", "Lcom/robinhood/android/retirement/contributions/ContributionReviewCallbacks;", "(Lcom/robinhood/android/retirement/contributions/ContributionReviewModeState;Lcom/robinhood/android/retirement/contributions/ContributionReviewCallbacks;Landroidx/compose/runtime/Composer;I)V", "ContributionReviewFooter", "Lcom/robinhood/android/retirement/contributions/ContributionFooterState;", "onSubmitClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/retirement/contributions/ContributionFooterState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-retirement-contributions_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ContributionReviewModeKt {
    public static final String AmountTestTag = "amount";
    public static final String ContributionTypeTestTag = "ContributionType";
    public static final String FrequencyTestTag = "frequency";
    public static final String FromAccountTestTag = "FromAccount";
    public static final String GoldMatchSelectionRowTag = "goldMatchSelectionRow";
    public static final String ToAccountTestTag = "ToAccount";
    public static final String YearTestTag = "Year";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionReviewFooter$lambda$16(ContributionFooterState contributionFooterState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContributionReviewFooter(contributionFooterState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionReviewMode$lambda$14(ContributionReviewModeState contributionReviewModeState, ContributionReviewCallbacks contributionReviewCallbacks, int i, Composer composer, int i2) {
        ContributionReviewMode(contributionReviewModeState, contributionReviewCallbacks, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ContributionReviewMode(final ContributionReviewModeState state, final ContributionReviewCallbacks callbacks, Composer composer, final int i) {
        int i2;
        boolean z;
        Function0 function0;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(324482996);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(324482996, i3, -1, "com.robinhood.android.retirement.contributions.ContributionReviewMode (ContributionReviewMode.kt:96)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            final GoldMatchSelectionRowState goldMatchSelectionRowState = state.getGoldMatchSelectionRowState();
            composerStartRestartGroup.startReplaceGroup(1924386809);
            if (goldMatchSelectionRowState == null) {
                z = true;
            } else {
                final UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.ROW, goldMatchSelectionRowState.getLoggingId(), null, 4, null), null, 47, null);
                BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(BentoSelectionRowState.Type.Checkbox, goldMatchSelectionRowState.getPrimaryText(), goldMatchSelectionRowState.getSelected(), (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(goldMatchSelectionRowState.getSecondaryText()), !state.isLoading(), false, (BentoSelectionRowState.IconPosition) new BentoSelectionRowState.IconPosition.Leading(ComposableLambda3.rememberComposableLambda(-1930029743, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.contributions.ContributionReviewModeKt$ContributionReviewMode$1$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1930029743, i4, -1, "com.robinhood.android.retirement.contributions.ContributionReviewMode.<anonymous>.<anonymous>.<anonymous> (ContributionReviewMode.kt:115)");
                        }
                        RemoteImageRenderer.SduiAspectFitRemoteImage(goldMatchSelectionRowState.getImage(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), false, composer2, 48, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54)), false, false, (ImmutableMap) null, (Function0) null, 1952, (DefaultConstructorMarker) null);
                Modifier modifierTestTag = TestTag3.testTag(ModifiersKt.autoLogEvents$default(companion, userInteractionEventDescriptorCopy$default, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), GoldMatchSelectionRowTag);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(goldMatchSelectionRowState) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptorCopy$default) | ((i3 & 112) == 32);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.contributions.ContributionReviewModeKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ContributionReviewModeKt.ContributionReviewMode$lambda$13$lambda$2$lambda$1$lambda$0(goldMatchSelectionRowState, current, userInteractionEventDescriptorCopy$default, callbacks);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                z = true;
                BentoSelectionRow2.BentoSelectionRow(modifierTestTag, bentoSelectionRowState, (Function0) objRememberedValue, composerStartRestartGroup, BentoSelectionRowState.$stable << 3, 0);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierTestTag2 = TestTag3.testTag(companion, "amount");
            String strStringResource = StringResources_androidKt.stringResource(C26981R.string.create_contribution_amount_label, composerStartRestartGroup, 0);
            String contributionAmount = state.getContributionAmount();
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i4 = i3 & 112;
            boolean z2 = i4 == 32 ? z : false;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ContributionReviewModeKt$ContributionReviewMode$1$2$1(callbacks);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            ContributionReviewRow.ContributionReviewRow(modifierTestTag2, strStringResource, contributionAmount, state.isLoading() ^ z, (Function0) ((KFunction) objRememberedValue2), false, false, composerStartRestartGroup, 6, 96);
            AnimatedVisibilityKt.AnimatedVisibility(column6, state.getShowFrequencyRow(), (Modifier) null, EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null), EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null), (String) null, ComposableLambda3.rememberComposableLambda(936220162, z, new ContributionReviewModeKt$ContributionReviewMode$1$3(state, callbacks), composerStartRestartGroup, 54), composerStartRestartGroup, 1600518, 18);
            Modifier modifierTestTag3 = TestTag3.testTag(companion, "FromAccount");
            String strStringResource2 = StringResources_androidKt.stringResource(C26981R.string.create_contribution_from_label, composerStartRestartGroup, 0);
            StringResource labelText = TransferAccounts4.getLabelText(state.getAccountSelectionData().getSourceAccount());
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String string2 = labelText.getText(resources).toString();
            boolean zIsLoading = state.isLoading() ^ z;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(state) | (i4 == 32 ? z : false);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.retirement.contributions.ContributionReviewModeKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ContributionReviewModeKt.ContributionReviewMode$lambda$13$lambda$5$lambda$4(callbacks, state);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean z3 = z;
            ContributionReviewRow.ContributionReviewRow(modifierTestTag3, strStringResource2, string2, zIsLoading, (Function0) objRememberedValue3, false, false, composerStartRestartGroup, 6, 96);
            Modifier modifierTestTag4 = TestTag3.testTag(companion, "ToAccount");
            ContributionSink contributionSink = state.getAccountSelectionData().getContributionSink();
            boolean z4 = !state.isLoading();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(state) | (i4 == 32 ? z3 : false);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.retirement.contributions.ContributionReviewModeKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ContributionReviewModeKt.ContributionReviewMode$lambda$13$lambda$7$lambda$6(callbacks, state);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            ContributionSink2.ContributionSinkRow(contributionSink, (Function0) objRememberedValue4, z4, modifierTestTag4, composerStartRestartGroup, 3072, 0);
            ContributionTypeRowState contributionTypeRowState = state.getContributionTypeRowState();
            composerStartRestartGroup.startReplaceGroup(1924505898);
            Function0 function02 = null;
            if (contributionTypeRowState != null) {
                Modifier modifierTestTag5 = TestTag3.testTag(companion, ContributionTypeTestTag);
                String strStringResource3 = StringResources_androidKt.stringResource(C26981R.string.create_contribution_contribution_type_label, composerStartRestartGroup, 0);
                String strStringResource4 = StringResources_androidKt.stringResource(contributionTypeRowState.getTextRes(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1924515118);
                if (contributionTypeRowState.getLocked()) {
                    function0 = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(state) | (i4 == 32 ? z3 : false);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.retirement.contributions.ContributionReviewModeKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ContributionReviewModeKt.ContributionReviewMode$lambda$13$lambda$10$lambda$9$lambda$8(callbacks, state);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    function0 = (Function0) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
                ContributionReviewRow.ContributionReviewRow(modifierTestTag5, strStringResource3, strStringResource4, !state.isLoading(), function0, contributionTypeRowState.getLocked(), false, composerStartRestartGroup, 6, 64);
                Unit unit2 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierTestTag6 = TestTag3.testTag(companion, YearTestTag);
            String strStringResource5 = StringResources_androidKt.stringResource(C26981R.string.create_contribution_tax_year_label, composerStartRestartGroup, 0);
            String string3 = state.getTaxYear().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            composerStartRestartGroup.startReplaceGroup(1924532400);
            if (!state.isTaxYearLocked()) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z5 = i4 == 32 ? z3 : false;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.retirement.contributions.ContributionReviewModeKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ContributionReviewModeKt.ContributionReviewMode$lambda$13$lambda$12$lambda$11(callbacks);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                function02 = (Function0) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            ContributionReviewRow.ContributionReviewRow(modifierTestTag6, strStringResource5, string3, !state.isLoading(), function02, state.isTaxYearLocked(), false, composerStartRestartGroup, 1572870, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.contributions.ContributionReviewModeKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContributionReviewModeKt.ContributionReviewMode$lambda$14(state, callbacks, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionReviewMode$lambda$13$lambda$2$lambda$1$lambda$0(GoldMatchSelectionRowState goldMatchSelectionRowState, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, ContributionReviewCallbacks contributionReviewCallbacks) {
        UserInteractionEventData.Action action;
        if (goldMatchSelectionRowState.getSelected()) {
            action = UserInteractionEventData.Action.DESELECT;
        } else {
            action = UserInteractionEventData.Action.SELECT;
        }
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, null, null, null, 59, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        contributionReviewCallbacks.onGoldSelectionRowClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionReviewMode$lambda$13$lambda$5$lambda$4(ContributionReviewCallbacks contributionReviewCallbacks, ContributionReviewModeState contributionReviewModeState) {
        contributionReviewCallbacks.onSourceAccountClicked(contributionReviewModeState.getAccountSelectionData());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionReviewMode$lambda$13$lambda$7$lambda$6(ContributionReviewCallbacks contributionReviewCallbacks, ContributionReviewModeState contributionReviewModeState) {
        contributionReviewCallbacks.onSinkAccountClicked(contributionReviewModeState.getAccountSelectionData());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionReviewMode$lambda$13$lambda$10$lambda$9$lambda$8(ContributionReviewCallbacks contributionReviewCallbacks, ContributionReviewModeState contributionReviewModeState) {
        contributionReviewCallbacks.onContributionTypeClicked(contributionReviewModeState.getAccountSelectionData().getContributionSink());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionReviewMode$lambda$13$lambda$12$lambda$11(ContributionReviewCallbacks contributionReviewCallbacks) {
        contributionReviewCallbacks.onTaxYearClicked();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContributionReviewFooter(final ContributionFooterState state, final Function0<Unit> onSubmitClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onSubmitClicked, "onSubmitClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1979793373);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSubmitClicked) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1979793373, i4, -1, "com.robinhood.android.retirement.contributions.ContributionReviewFooter (ContributionReviewMode.kt:227)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM());
                StringResource buttonText = state.getButtonText();
                int i7 = StringResource.$stable;
                String string2 = StringResource2.getString(buttonText, composerStartRestartGroup, i7);
                StringResource helperText = state.getHelperText();
                composerStartRestartGroup.startReplaceGroup(1885251730);
                String string3 = helperText != null ? null : StringResource2.getString(helperText, composerStartRestartGroup, i7);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                BentoButtonBar2.BentoButtonBar(modifierM5143paddingVpY3zN4, string3, null, false, null, null, onSubmitClicked, string2, state.isLoading(), null, state.isEnabled(), null, null, false, null, false, composerStartRestartGroup, (i4 << 15) & 3670016, 0, 64060);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.contributions.ContributionReviewModeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ContributionReviewModeKt.ContributionReviewFooter$lambda$16(state, onSubmitClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) != 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(Modifier.INSTANCE, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM());
                StringResource buttonText2 = state.getButtonText();
                int i72 = StringResource.$stable;
                String string22 = StringResource2.getString(buttonText2, composerStartRestartGroup, i72);
                StringResource helperText2 = state.getHelperText();
                composerStartRestartGroup.startReplaceGroup(1885251730);
                if (helperText2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                BentoButtonBar2.BentoButtonBar(modifierM5143paddingVpY3zN42, string3, null, false, null, null, onSubmitClicked, string22, state.isLoading(), null, state.isEnabled(), null, null, false, null, false, composerStartRestartGroup, (i4 << 15) & 3670016, 0, 64060);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
