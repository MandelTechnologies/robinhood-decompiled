package com.robinhood.android.transfers.p271ui.max.iradistribution;

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
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
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
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.bonfire.ApiIraDistributionQuestionnaire;
import com.robinhood.models.api.bonfire.IraDistributionType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: IraDistributionQuestionnaireDistributionTypeScreen.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"IraDistributionQuestionnaireDistributionTypeTitle", "", "IraDistributionQuestionnaireDistributionTypeRow", "IraDistributionQuestionnaireDistributionTypeCta", "IraDistributionQuestionnaireDistributionTypeScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/models/api/bonfire/ApiIraDistributionQuestionnaire$DistributionTypeViewModel;", "callbacks", "Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireDistributionTypeCallbacks;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/api/bonfire/ApiIraDistributionQuestionnaire$DistributionTypeViewModel;Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireDistributionTypeCallbacks;Landroidx/compose/runtime/Composer;II)V", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeScreenKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class IraDistributionQuestionnaireDistributionTypeScreen2 {
    public static final String IraDistributionQuestionnaireDistributionTypeCta = "ira-distribution-type-cta";
    public static final String IraDistributionQuestionnaireDistributionTypeRow = "ira-distribution-type-row";
    public static final String IraDistributionQuestionnaireDistributionTypeTitle = "ira-distribution-type-title";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IraDistributionQuestionnaireDistributionTypeScreen$lambda$5(Modifier modifier, ApiIraDistributionQuestionnaire.DistributionTypeViewModel distributionTypeViewModel, IraDistributionQuestionnaireDistributionTypeScreen iraDistributionQuestionnaireDistributionTypeScreen, int i, int i2, Composer composer, int i3) {
        IraDistributionQuestionnaireDistributionTypeScreen(modifier, distributionTypeViewModel, iraDistributionQuestionnaireDistributionTypeScreen, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void IraDistributionQuestionnaireDistributionTypeScreen(Modifier modifier, final ApiIraDistributionQuestionnaire.DistributionTypeViewModel state, final IraDistributionQuestionnaireDistributionTypeScreen callbacks, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(357092152);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(357092152, i3, -1, "com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeScreen (IraDistributionQuestionnaireDistributionTypeScreen.kt:39)");
            }
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(modifier4, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5145paddingqDBjuR0(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), IraDistributionQuestionnaireDistributionTypeTitle);
            Modifier modifier5 = modifier4;
            String title = state.getTitle();
            TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall();
            int i6 = i3;
            BentoText2.m20747BentoText38GnDrw(title, modifierTestTag, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, 0, 0, 8188);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(438371506);
            List<ApiIraDistributionQuestionnaire.DistributionTypeRow> rows = state.getRows();
            ArrayList<ApiIraDistributionQuestionnaire.DistributionTypeRow> arrayList = new ArrayList();
            for (Object obj : rows) {
                if (((ApiIraDistributionQuestionnaire.DistributionTypeRow) obj).getDistribution_type() != IraDistributionType.UNKNOWN) {
                    arrayList.add(obj);
                }
            }
            for (ApiIraDistributionQuestionnaire.DistributionTypeRow distributionTypeRow : arrayList) {
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), distributionTypeRow.getLogging_identifier(), null, null, null, new Component(Component.ComponentType.ROW, distributionTypeRow.getLogging_identifier(), null, 4, null), null, 46, null), ComposableLambda3.rememberComposableLambda(-1999935076, true, new IraDistributionQuestionnaireDistributionTypeScreen3(distributionTypeRow, callbacks), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            UIComponent<GenericAction> footer_button = state.getFooter_button();
            composerStartRestartGroup.startReplaceGroup(-1653331825);
            if (footer_button != null) {
                ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(footer_button);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Alignment.Companion companion5 = Alignment.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1772220517);
                SduiColumns.SduiColumn(immutableList3PersistentListOf, GenericAction.class, TestTag3.testTag(PaddingKt.m5144paddingVpY3zN4$default(column6.align(companion4, companion5.getCenterHorizontally()), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 1, null), IraDistributionQuestionnaireDistributionTypeCta), null, callbacks, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), companion5.getStart(), false, composerStartRestartGroup, (((((i6 << 3) & 7168) | 12582912) << 3) & 57344) | 100663296, 0);
                composerStartRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return IraDistributionQuestionnaireDistributionTypeScreen2.IraDistributionQuestionnaireDistributionTypeScreen$lambda$5(modifier3, state, callbacks, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }
}
