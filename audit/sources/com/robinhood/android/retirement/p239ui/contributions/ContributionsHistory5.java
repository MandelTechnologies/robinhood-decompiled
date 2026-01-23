package com.robinhood.android.retirement.p239ui.contributions;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.paging.compose.LazyPagingItems;
import com.robinhood.android.common.history.p082ui.ComposableSingletons$HistoryRowsKt;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.retirement.C26959R;
import com.robinhood.android.retirement.p239ui.UtilKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContributionsHistory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0004\u001a&\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r\u0018\u00010\nH\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"EmptyHistorySection", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EmptyHistorySectionKey", "", "contributionsHistorySection", "Landroidx/compose/foundation/lazy/LazyListScope;", "historyItems", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "feature-retirement-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.ui.contributions.ContributionsHistoryKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ContributionsHistory5 {
    public static final String EmptyHistorySectionKey = "empty_history_section";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyHistorySection$lambda$1(Modifier modifier, int i, int i2, Composer composer, int i3) {
        EmptyHistorySection(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EmptyHistorySection(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-208940404);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-208940404, i3, -1, "com.robinhood.android.retirement.ui.contributions.EmptyHistorySection (ContributionsHistory.kt:23)");
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierSectionHeaderBottomPadding$default = UtilKt.sectionHeaderBottomPadding$default(companion2, false, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifier4 = modifier3;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C26959R.string.retirement_contribution_history_title, composerStartRestartGroup, 0), modifierSectionHeaderBottomPadding$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composer2, 0, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C26959R.string.retirement_empty_history_message, composer2, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i5).m21594getXlargeD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16380);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsHistoryKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContributionsHistory5.EmptyHistorySection$lambda$1(modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void contributionsHistorySection(LazyListScope lazyListScope, LazyPagingItems<StatefulHistoryEvent<HistoryEvent>> lazyPagingItems) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        if (lazyPagingItems != null && lazyPagingItems.getItemCount() > 0) {
            ContributionsHistory contributionsHistory = ContributionsHistory.INSTANCE;
            HistoryRowsKt.historySection(lazyListScope, lazyPagingItems, (120 & 2) != 0 ? ComposableSingletons$HistoryRowsKt.INSTANCE.getLambda$345760199$lib_history_row_externalDebug() : contributionsHistory.m18205getLambda$202194232$feature_retirement_tab_externalDebug(), (120 & 4) != 0 ? ComposableSingletons$HistoryRowsKt.INSTANCE.getLambda$1027653753$lib_history_row_externalDebug() : contributionsHistory.m18204getLambda$1470864311$feature_retirement_tab_externalDebug(), (120 & 8) != 0 ? 5 : 0, (120 & 16) != 0 ? false : false, (120 & 32) != 0, (120 & 64) == 0 ? false : false, (120 & 128) != 0 ? "history_section_" : "contributions_");
        } else {
            LazyListScope.item$default(lazyListScope, EmptyHistorySectionKey, null, ContributionsHistory.INSTANCE.m18203getLambda$1083058060$feature_retirement_tab_externalDebug(), 2, null);
        }
    }
}
