package com.robinhood.android.transfers.pathfinder.p269ui.fundsinitiated;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.transfers.pathfinder.C30419R;
import com.robinhood.android.transfers.pathfinder.p269ui.fundsinitiated.PdtDepositFundsInitiatedViewState;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoTimelineRowKt;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PdtDepositFundsInitiatedComposable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a+\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u000b\"\u000e\u0010\f\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"PdtDepositFundsInitiatedComposable", "", "viewState", "Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedViewState;", "onClickContinue", "Lkotlin/Function0;", "(Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", PdtDepositFundsInitiatedComposable.PdtDepositFundsInitiatedTestTagContent, "Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedViewState$State$Success;", "isSendingContinue", "", "(Lcom/robinhood/android/transfers/pathfinder/ui/fundsinitiated/PdtDepositFundsInitiatedViewState$State$Success;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PdtDepositFundsInitiatedTestTagProgressBar", "", "PdtDepositFundsInitiatedTestTagContent", "PdtDepositFundsInitiatedTestTagHeading", "PdtDepositFundsInitiatedTestTagDescription", "PdtDepositFundsInitiatedTestTagTimeline1", "PdtDepositFundsInitiatedTestTagTimeline2", "PdtDepositFundsInitiatedTestTagContinueButton", "feature-transfers-pathfinder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class PdtDepositFundsInitiatedComposable {
    public static final String PdtDepositFundsInitiatedTestTagContent = "PdtDepositFundsInitiatedContent";
    public static final String PdtDepositFundsInitiatedTestTagContinueButton = "PdtDepositFundsInitiatedContinueButton";
    public static final String PdtDepositFundsInitiatedTestTagDescription = "PdtDepositFundsInitiatedDescription";
    public static final String PdtDepositFundsInitiatedTestTagHeading = "PdtDepositFundsInitiatedHeading";
    public static final String PdtDepositFundsInitiatedTestTagProgressBar = "PdtDepositFundsInitiatedProgressBar";
    public static final String PdtDepositFundsInitiatedTestTagTimeline1 = "PdtDepositFundsInitiatedTimeline1";
    public static final String PdtDepositFundsInitiatedTestTagTimeline2 = "PdtDepositFundsInitiatedTimeline2";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdtDepositFundsInitiatedComposable$lambda$0(PdtDepositFundsInitiatedViewState pdtDepositFundsInitiatedViewState, Function0 function0, int i, Composer composer, int i2) {
        PdtDepositFundsInitiatedComposable(pdtDepositFundsInitiatedViewState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PdtDepositFundsInitiatedContent$lambda$5(PdtDepositFundsInitiatedViewState.State.Success success, boolean z, Function0 function0, int i, Composer composer, int i2) {
        PdtDepositFundsInitiatedContent(success, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PdtDepositFundsInitiatedComposable(final PdtDepositFundsInitiatedViewState viewState, final Function0<Unit> onClickContinue, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onClickContinue, "onClickContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1313419983);
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
                ComposerKt.traceEventStart(-1313419983, i2, -1, "com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedComposable (PdtDepositFundsInitiatedComposable.kt:29)");
            }
            PdtDepositFundsInitiatedViewState.State state = viewState.getState();
            if (Intrinsics.areEqual(state, PdtDepositFundsInitiatedViewState.State.Loading.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(-942405842);
                LoadingScreenComposablesKt.ListLoadingScreenComposable(TestTag3.testTag(Modifier.INSTANCE, PdtDepositFundsInitiatedTestTagProgressBar), true, false, 2, composerStartRestartGroup, 3126, 4);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(state instanceof PdtDepositFundsInitiatedViewState.State.Success)) {
                    composerStartRestartGroup.startReplaceGroup(523786724);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-942120549);
                PdtDepositFundsInitiatedContent((PdtDepositFundsInitiatedViewState.State.Success) viewState.getState(), viewState.isSendingContinue(), onClickContinue, composerStartRestartGroup, (i2 << 3) & 896);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PdtDepositFundsInitiatedComposable.PdtDepositFundsInitiatedComposable$lambda$0(viewState, onClickContinue, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PdtDepositFundsInitiatedContent(final PdtDepositFundsInitiatedViewState.State.Success success, final boolean z, Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final Function0<Unit> function02 = function0;
        Composer composerStartRestartGroup = composer.startRestartGroup(241040105);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(success) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(241040105, i2, -1, "com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedContent (PdtDepositFundsInitiatedComposable.kt:50)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, PdtDepositFundsInitiatedTestTagContent), 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Column5.weight$default(Column6.INSTANCE, ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Modifier modifierTestTag = TestTag3.testTag(companion, PdtDepositFundsInitiatedTestTagHeading);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C30419R.string.pathfinder_pdt_deposit_initiated_heading, composerStartRestartGroup, 0), PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 7, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(companion, PdtDepositFundsInitiatedTestTagDescription), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 7, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceGroup(779524942);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
            try {
                builder.append("+" + Money.format$default(success.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null) + PlaceholderUtils.XXShortPlaceholderText);
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                int i4 = C30419R.string.pathfinder_pdt_deposit_initiated_subheading;
                StringResource accountDisplayText = success.getAccountDisplayText();
                Intrinsics.checkNotNull(resources);
                builder.append(StringResources_androidKt.stringResource(i4, new Object[]{accountDisplayText.getText(resources)}, composerStartRestartGroup, 0));
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                BentoText2.m20748BentoTextQnj7Zds(annotatedString, modifierM5144paddingVpY3zN4$default, null, null, null, null, null, 0, false, 0, 0, null, null, null, composerStartRestartGroup, 0, 0, 16380);
                Modifier modifierTestTag2 = TestTag3.testTag(companion, PdtDepositFundsInitiatedTestTagTimeline1);
                Timeline.Status status = Timeline.Status.COMPLETE;
                composer2 = composerStartRestartGroup;
                BentoTimelineRowKt.m20996BentoTimelineRowcZKY2IM(status, Timeline.Position.TOP, StringResources_androidKt.stringResource(C30419R.string.pathfinder_pdt_deposit_initiated_timeline_1_title, composerStartRestartGroup, 0), modifierTestTag2, success.getTimeline1Timestamp().getText(resources).toString(), success.getTimeline1Metadata(resources), null, null, null, null, false, null, null, false, false, 0, false, 0, false, false, false, composer2, 3126, 0, 0, 2097088);
                BentoTimelineRowKt.m20996BentoTimelineRowcZKY2IM(success.getTimeline2Status(), Timeline.Position.BOTTOM, StringResources_androidKt.stringResource(C30419R.string.pathfinder_pdt_deposit_initiated_timeline_2_title, composer2, 0), TestTag3.testTag(companion, PdtDepositFundsInitiatedTestTagTimeline2), success.getTimeline2Timestamp().getText(resources).toString(), StringResources_androidKt.stringResource(C30419R.string.pathfinder_pdt_deposit_initiated_timeline_2_metadata, composer2, 0), null, null, null, status, false, null, null, false, false, 0, false, 0, false, false, false, composer2, 805309488, 0, 0, 2096576);
                composer2.endNode();
                function02 = function0;
                BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0), PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(TestTag3.testTag(companion, PdtDepositFundsInitiatedTestTagContinueButton), 0.0f, 1, null), bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM()), null, null, false, z, null, null, null, null, false, null, composer2, ((i2 >> 6) & 14) | ((i2 << 15) & 3670016), 0, 8120);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.pathfinder.ui.fundsinitiated.PdtDepositFundsInitiatedComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PdtDepositFundsInitiatedComposable.PdtDepositFundsInitiatedContent$lambda$5(success, z, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
