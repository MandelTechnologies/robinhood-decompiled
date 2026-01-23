package com.robinhood.android.advisory.history.trade;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.advisory.history.C8736R;
import com.robinhood.android.advisory.history.trade.AdvisorTradeDetails;
import com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsViewState;
import com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsViewState3;
import com.robinhood.android.common.history.p082ui.HistoryRow4;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AdvisorTradeDetails.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\f2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\r\u001a/\u0010\u0010\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, m3636d2 = {"AdvisorTradeTitle", "", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/utils/resource/StringResource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AdvisorTradeLineItem", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/advisory/history/trade/LineItem;", "(Lcom/robinhood/android/advisory/history/trade/LineItem;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OrderGroupItemComponent", "Lcom/robinhood/android/advisory/history/trade/OrderGroupItem;", "(Lcom/robinhood/android/advisory/history/trade/OrderGroupItem;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AdvisoryTradeDetailsPlaceholderTestTag", "", "AdvisorTradeDetails", "onBackClicked", "Lkotlin/Function0;", "duxo", "Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-history_externalDebug", "viewState", "Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisorTradeDetails {
    public static final String AdvisoryTradeDetailsPlaceholderTestTag = "advisor_trade_details_placeholder";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisorTradeDetails$lambda$5(Function0 function0, Modifier modifier, AdvisorTradeDetailsDuxo advisorTradeDetailsDuxo, int i, int i2, Composer composer, int i3) {
        AdvisorTradeDetails(function0, modifier, advisorTradeDetailsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisorTradeLineItem$lambda$2(LineItem lineItem, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AdvisorTradeLineItem(lineItem, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisorTradeTitle$lambda$1(StringResource stringResource, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AdvisorTradeTitle(stringResource, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderGroupItemComponent$lambda$3(AdvisorTradeDetailsViewState3 advisorTradeDetailsViewState3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OrderGroupItemComponent(advisorTradeDetailsViewState3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisorTradeTitle(final StringResource stringResource, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(963126729);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(stringResource) : composerStartRestartGroup.changedInstance(stringResource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(963126729, i3, -1, "com.robinhood.android.advisory.history.trade.AdvisorTradeTitle (AdvisorTradeDetails.kt:35)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(modifier3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default);
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
                String strStringResource = StringResources_androidKt.stringResource(C8736R.string.advisor_trade_title, composerStartRestartGroup, 0);
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium();
                Modifier modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 0, 0, 8190);
                BentoText2.m20747BentoText38GnDrw(StringResources6.getText(stringResource, composer2, (i3 & 14) | StringResource.$stable).toString(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisorTradeDetails.AdvisorTradeTitle$lambda$1(stringResource, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2 = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(modifier3, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2);
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
                String strStringResource2 = StringResources_androidKt.stringResource(C8736R.string.advisor_trade_title, composerStartRestartGroup, 0);
                TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium();
                Modifier modifier42 = modifier3;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composer2, 0, 0, 8190);
                BentoText2.m20747BentoText38GnDrw(StringResources6.getText(stringResource, composer2, (i3 & 14) | StringResource.$stable).toString(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisorTradeLineItem(final LineItem lineItem, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-497769452);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(lineItem) : composerStartRestartGroup.changedInstance(lineItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-497769452, i3, -1, "com.robinhood.android.advisory.history.trade.AdvisorTradeLineItem (AdvisorTradeDetails.kt:56)");
                }
                StringResource label = lineItem.getLabel();
                int i5 = StringResource.$stable;
                modifier3 = modifier4;
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources6.getText(label, composerStartRestartGroup, i5).toString(), null, 2, null), null, null, null, new AnnotatedString(StringResources6.getText(lineItem.getValue(), composerStartRestartGroup, i5).toString(), null, 2, null), null, null, null, null, false, false, 4061, null), modifier3, null, composerStartRestartGroup, BentoDataRowState.$stable | (i3 & 112), 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisorTradeDetails.AdvisorTradeLineItem$lambda$2(lineItem, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            StringResource label2 = lineItem.getLabel();
            int i52 = StringResource.$stable;
            modifier3 = modifier4;
            BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources6.getText(label2, composerStartRestartGroup, i52).toString(), null, 2, null), null, null, null, new AnnotatedString(StringResources6.getText(lineItem.getValue(), composerStartRestartGroup, i52).toString(), null, 2, null), null, null, null, null, false, false, 4061, null), modifier3, null, composerStartRestartGroup, BentoDataRowState.$stable | (i3 & 112), 4);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OrderGroupItemComponent(final AdvisorTradeDetailsViewState3 advisorTradeDetailsViewState3, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1954111305);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(advisorTradeDetailsViewState3) : composerStartRestartGroup.changedInstance(advisorTradeDetailsViewState3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1954111305, i3, -1, "com.robinhood.android.advisory.history.trade.OrderGroupItemComponent (AdvisorTradeDetails.kt:70)");
                }
                if (!(advisorTradeDetailsViewState3 instanceof AdvisorTradeDetailsViewState3.HistoryRow)) {
                    composerStartRestartGroup.startReplaceGroup(943332144);
                    HistoryRow4.HistoryRow(((AdvisorTradeDetailsViewState3.HistoryRow) advisorTradeDetailsViewState3).getEvent(), null, false, false, "advisor_trade_order_", null, composerStartRestartGroup, 24576, 46);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier4;
                } else if (advisorTradeDetailsViewState3 instanceof AdvisorTradeDetailsViewState3.SectionHeader) {
                    composerStartRestartGroup.startReplaceGroup(943516749);
                    modifier3 = modifier4;
                    BentoText2.m20747BentoText38GnDrw(((AdvisorTradeDetailsViewState3.SectionHeader) advisorTradeDetailsViewState3).getTitle(), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(modifier4, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 1, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16364);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    modifier3 = modifier4;
                    if (advisorTradeDetailsViewState3 instanceof AdvisorTradeDetailsViewState3.Spacer) {
                        composerStartRestartGroup.startReplaceGroup(943815589);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(modifier3, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!(advisorTradeDetailsViewState3 instanceof AdvisorTradeDetailsViewState3.Title)) {
                            composerStartRestartGroup.startReplaceGroup(1000260563);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(943974092);
                        String strStringResource = StringResources_androidKt.stringResource(C8736R.string.advisor_trade_orders_label, composerStartRestartGroup, 0);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(modifier3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisorTradeDetails.OrderGroupItemComponent$lambda$3(advisorTradeDetailsViewState3, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!(advisorTradeDetailsViewState3 instanceof AdvisorTradeDetailsViewState3.HistoryRow)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvisorTradeDetailsViewState AdvisorTradeDetails$lambda$4(SnapshotState4<? extends AdvisorTradeDetailsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisorTradeDetails(final Function0<Unit> onBackClicked, Modifier modifier, AdvisorTradeDetailsDuxo advisorTradeDetailsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        AdvisorTradeDetailsDuxo advisorTradeDetailsDuxo2;
        Modifier modifier3;
        int i4;
        CreationExtras defaultViewModelCreationExtras;
        AdvisorTradeDetailsDuxo advisorTradeDetailsDuxo3;
        final AdvisorTradeDetailsDuxo advisorTradeDetailsDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1672749724);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    advisorTradeDetailsDuxo2 = advisorTradeDetailsDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(advisorTradeDetailsDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    advisorTradeDetailsDuxo2 = advisorTradeDetailsDuxo;
                }
                i3 |= i6;
            } else {
                advisorTradeDetailsDuxo2 = advisorTradeDetailsDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                } else {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AdvisorTradeDetailsDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i4 = i3 & (-897);
                        advisorTradeDetailsDuxo3 = (AdvisorTradeDetailsDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1672749724, i4, -1, "com.robinhood.android.advisory.history.trade.AdvisorTradeDetails (AdvisorTradeDetails.kt:114)");
                        }
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(advisorTradeDetailsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        modifier2 = modifier3;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, ComposableLambda3.rememberComposableLambda(-618583520, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt.AdvisorTradeDetails.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i7) {
                                if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-618583520, i7, -1, "com.robinhood.android.advisory.history.trade.AdvisorTradeDetails.<anonymous> (AdvisorTradeDetails.kt:119)");
                                }
                                Function2<Composer, Integer, Unit> lambda$1010583443$feature_advisory_history_externalDebug = AdvisorTradeDetails3.INSTANCE.getLambda$1010583443$feature_advisory_history_externalDebug();
                                final Function0<Unit> function0 = onBackClicked;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1010583443$feature_advisory_history_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1424963137, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt.AdvisorTradeDetails.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                        invoke(bentoAppBarScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i8) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i8 & 6) == 0) {
                                            i8 |= (i8 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1424963137, i8, -1, "com.robinhood.android.advisory.history.trade.AdvisorTradeDetails.<anonymous>.<anonymous> (AdvisorTradeDetails.kt:122)");
                                        }
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-342718091, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt.AdvisorTradeDetails.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                                invoke(paddingValues, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer2, int i7) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i7 & 6) == 0) {
                                    i7 |= composer2.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-342718091, i7, -1, "com.robinhood.android.advisory.history.trade.AdvisorTradeDetails.<anonymous> (AdvisorTradeDetails.kt:130)");
                                }
                                LocalShowPlaceholder.Loadable(AdvisorTradeDetails.AdvisorTradeDetails$lambda$4(snapshotState4CollectAsStateWithLifecycle) instanceof AdvisorTradeDetailsViewState.Loading, TestTag3.testTag(Modifier.INSTANCE, AdvisorTradeDetails.AdvisoryTradeDetailsPlaceholderTestTag), null, ComposableLambda3.rememberComposableLambda(593683205, true, new AnonymousClass1(paddingValues, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 3120, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: AdvisorTradeDetails.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ PaddingValues $paddingValues;
                                final /* synthetic */ SnapshotState4<AdvisorTradeDetailsViewState> $viewState$delegate;

                                /* JADX WARN: Multi-variable type inference failed */
                                AnonymousClass1(PaddingValues paddingValues, SnapshotState4<? extends AdvisorTradeDetailsViewState> snapshotState4) {
                                    this.$paddingValues = paddingValues;
                                    this.$viewState$delegate = snapshotState4;
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
                                        ComposerKt.traceEventStart(593683205, i, -1, "com.robinhood.android.advisory.history.trade.AdvisorTradeDetails.<anonymous>.<anonymous> (AdvisorTradeDetails.kt:134)");
                                    }
                                    PaddingValues paddingValues = this.$paddingValues;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(this.$viewState$delegate);
                                    final SnapshotState4<AdvisorTradeDetailsViewState> snapshotState4 = this.$viewState$delegate;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return AdvisorTradeDetails.C87672.AnonymousClass1.invoke$lambda$3$lambda$2(snapshotState4, (LazyListScope) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    LazyDslKt.LazyColumn(null, null, paddingValues, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 507);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$3$lambda$2(SnapshotState4 snapshotState4, LazyListScope LazyColumn) {
                                    Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                    final AdvisorTradeDetailsViewState advisorTradeDetailsViewStateAdvisorTradeDetails$lambda$4 = AdvisorTradeDetails.AdvisorTradeDetails$lambda$4(snapshotState4);
                                    if (advisorTradeDetailsViewStateAdvisorTradeDetails$lambda$4 instanceof AdvisorTradeDetailsViewState.Loaded) {
                                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(79720658, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1$1$1$1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                invoke(lazyItemScope, composer, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(LazyItemScope item, Composer composer, int i) {
                                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                                if ((i & 17) == 16 && composer.getSkipping()) {
                                                    composer.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(79720658, i, -1, "com.robinhood.android.advisory.history.trade.AdvisorTradeDetails.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisorTradeDetails.kt:141)");
                                                }
                                                AdvisorTradeDetails.AdvisorTradeTitle(((AdvisorTradeDetailsViewState.Loaded) advisorTradeDetailsViewStateAdvisorTradeDetails$lambda$4).getSubtitle(), null, composer, StringResource.$stable, 2);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }), 3, null);
                                        AdvisorTradeDetailsViewState.Loaded loaded = (AdvisorTradeDetailsViewState.Loaded) advisorTradeDetailsViewStateAdvisorTradeDetails$lambda$4;
                                        final ImmutableList<LineItem> lineItems = loaded.getLineItems();
                                        final C8758xd65d4cf2 c8758xd65d4cf2 = new Function1() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1$invoke$lambda$3$lambda$2$$inlined$items$default$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Void invoke(LineItem lineItem) {
                                                return null;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                return invoke((LineItem) obj);
                                            }
                                        };
                                        LazyColumn.items(lineItems.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1$invoke$lambda$3$lambda$2$$inlined$items$default$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                                return invoke(num.intValue());
                                            }

                                            public final Object invoke(int i) {
                                                return c8758xd65d4cf2.invoke(lineItems.get(i));
                                            }
                                        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1$invoke$lambda$3$lambda$2$$inlined$items$default$4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                                int i3;
                                                if ((i2 & 6) == 0) {
                                                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                                                } else {
                                                    i3 = i2;
                                                }
                                                if ((i2 & 48) == 0) {
                                                    i3 |= composer.changed(i) ? 32 : 16;
                                                }
                                                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                                    composer.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                                }
                                                LineItem lineItem = (LineItem) lineItems.get(i);
                                                composer.startReplaceGroup(-140402376);
                                                AdvisorTradeDetails.AdvisorTradeLineItem(lineItem, null, composer, StringResource.$stable, 2);
                                                composer.endReplaceGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        final ImmutableList<AdvisorTradeDetailsViewState3> orderGroupsItems = loaded.getOrderGroupsItems();
                                        final C8762xd65d4cf6 c8762xd65d4cf6 = new Function1() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1$invoke$lambda$3$lambda$2$$inlined$items$default$5
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Void invoke(AdvisorTradeDetailsViewState3 advisorTradeDetailsViewState3) {
                                                return null;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                return invoke((AdvisorTradeDetailsViewState3) obj);
                                            }
                                        };
                                        LazyColumn.items(orderGroupsItems.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1$invoke$lambda$3$lambda$2$$inlined$items$default$7
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                                return invoke(num.intValue());
                                            }

                                            public final Object invoke(int i) {
                                                return c8762xd65d4cf6.invoke(orderGroupsItems.get(i));
                                            }
                                        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1$invoke$lambda$3$lambda$2$$inlined$items$default$8
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                                int i3;
                                                if ((i2 & 6) == 0) {
                                                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                                                } else {
                                                    i3 = i2;
                                                }
                                                if ((i2 & 48) == 0) {
                                                    i3 |= composer.changed(i) ? 32 : 16;
                                                }
                                                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                                    composer.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                                }
                                                AdvisorTradeDetailsViewState3 advisorTradeDetailsViewState3 = (AdvisorTradeDetailsViewState3) orderGroupsItems.get(i);
                                                composer.startReplaceGroup(1570590913);
                                                AdvisorTradeDetails.OrderGroupItemComponent(advisorTradeDetailsViewState3, null, composer, 0, 2);
                                                composer.endReplaceGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                    } else {
                                        if (!Intrinsics.areEqual(advisorTradeDetailsViewStateAdvisorTradeDetails$lambda$4, AdvisorTradeDetailsViewState.Loading.INSTANCE)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        AdvisorTradeDetails3 advisorTradeDetails3 = AdvisorTradeDetails3.INSTANCE;
                                        LazyListScope.item$default(LazyColumn, null, null, advisorTradeDetails3.getLambda$288762427$feature_advisory_history_externalDebug(), 3, null);
                                        LazyListScope.items$default(LazyColumn, 5, null, null, advisorTradeDetails3.m11035getLambda$1437039420$feature_advisory_history_externalDebug(), 6, null);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | 805306416, 508);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        advisorTradeDetailsDuxo4 = advisorTradeDetailsDuxo3;
                    } else {
                        i4 = i3;
                    }
                }
                advisorTradeDetailsDuxo3 = advisorTradeDetailsDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<? extends AdvisorTradeDetailsViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(advisorTradeDetailsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                modifier2 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, ComposableLambda3.rememberComposableLambda(-618583520, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt.AdvisorTradeDetails.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-618583520, i7, -1, "com.robinhood.android.advisory.history.trade.AdvisorTradeDetails.<anonymous> (AdvisorTradeDetails.kt:119)");
                        }
                        Function2<Composer, Integer, Unit> lambda$1010583443$feature_advisory_history_externalDebug = AdvisorTradeDetails3.INSTANCE.getLambda$1010583443$feature_advisory_history_externalDebug();
                        final Function0<Unit> function0 = onBackClicked;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1010583443$feature_advisory_history_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1424963137, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt.AdvisorTradeDetails.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1424963137, i8, -1, "com.robinhood.android.advisory.history.trade.AdvisorTradeDetails.<anonymous>.<anonymous> (AdvisorTradeDetails.kt:122)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-342718091, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt.AdvisorTradeDetails.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i7 |= composer2.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-342718091, i7, -1, "com.robinhood.android.advisory.history.trade.AdvisorTradeDetails.<anonymous> (AdvisorTradeDetails.kt:130)");
                        }
                        LocalShowPlaceholder.Loadable(AdvisorTradeDetails.AdvisorTradeDetails$lambda$4(snapshotState4CollectAsStateWithLifecycle2) instanceof AdvisorTradeDetailsViewState.Loading, TestTag3.testTag(Modifier.INSTANCE, AdvisorTradeDetails.AdvisoryTradeDetailsPlaceholderTestTag), null, ComposableLambda3.rememberComposableLambda(593683205, true, new AnonymousClass1(paddingValues, snapshotState4CollectAsStateWithLifecycle2), composer2, 54), composer2, 3120, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: AdvisorTradeDetails.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ PaddingValues $paddingValues;
                        final /* synthetic */ SnapshotState4<AdvisorTradeDetailsViewState> $viewState$delegate;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(PaddingValues paddingValues, SnapshotState4<? extends AdvisorTradeDetailsViewState> snapshotState4) {
                            this.$paddingValues = paddingValues;
                            this.$viewState$delegate = snapshotState4;
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
                                ComposerKt.traceEventStart(593683205, i, -1, "com.robinhood.android.advisory.history.trade.AdvisorTradeDetails.<anonymous>.<anonymous> (AdvisorTradeDetails.kt:134)");
                            }
                            PaddingValues paddingValues = this.$paddingValues;
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$viewState$delegate);
                            final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AdvisorTradeDetails.C87672.AnonymousClass1.invoke$lambda$3$lambda$2(snapshotState4, (LazyListScope) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            LazyDslKt.LazyColumn(null, null, paddingValues, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 507);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(SnapshotState4 snapshotState4, LazyListScope LazyColumn) {
                            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                            final AdvisorTradeDetailsViewState advisorTradeDetailsViewStateAdvisorTradeDetails$lambda$4 = AdvisorTradeDetails.AdvisorTradeDetails$lambda$4(snapshotState4);
                            if (advisorTradeDetailsViewStateAdvisorTradeDetails$lambda$4 instanceof AdvisorTradeDetailsViewState.Loaded) {
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(79720658, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                        invoke(lazyItemScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(item, "$this$item");
                                        if ((i & 17) == 16 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(79720658, i, -1, "com.robinhood.android.advisory.history.trade.AdvisorTradeDetails.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdvisorTradeDetails.kt:141)");
                                        }
                                        AdvisorTradeDetails.AdvisorTradeTitle(((AdvisorTradeDetailsViewState.Loaded) advisorTradeDetailsViewStateAdvisorTradeDetails$lambda$4).getSubtitle(), null, composer, StringResource.$stable, 2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), 3, null);
                                AdvisorTradeDetailsViewState.Loaded loaded = (AdvisorTradeDetailsViewState.Loaded) advisorTradeDetailsViewStateAdvisorTradeDetails$lambda$4;
                                final List lineItems = loaded.getLineItems();
                                final Function1 c8758xd65d4cf2 = new Function1() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1$invoke$lambda$3$lambda$2$$inlined$items$default$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Void invoke(LineItem lineItem) {
                                        return null;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke((LineItem) obj);
                                    }
                                };
                                LazyColumn.items(lineItems.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1$invoke$lambda$3$lambda$2$$inlined$items$default$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int i) {
                                        return c8758xd65d4cf2.invoke(lineItems.get(i));
                                    }
                                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1$invoke$lambda$3$lambda$2$$inlined$items$default$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                        int i3;
                                        if ((i2 & 6) == 0) {
                                            i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                                        } else {
                                            i3 = i2;
                                        }
                                        if ((i2 & 48) == 0) {
                                            i3 |= composer.changed(i) ? 32 : 16;
                                        }
                                        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                        }
                                        LineItem lineItem = (LineItem) lineItems.get(i);
                                        composer.startReplaceGroup(-140402376);
                                        AdvisorTradeDetails.AdvisorTradeLineItem(lineItem, null, composer, StringResource.$stable, 2);
                                        composer.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                final List orderGroupsItems = loaded.getOrderGroupsItems();
                                final Function1 c8762xd65d4cf6 = new Function1() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1$invoke$lambda$3$lambda$2$$inlined$items$default$5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Void invoke(AdvisorTradeDetailsViewState3 advisorTradeDetailsViewState3) {
                                        return null;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke((AdvisorTradeDetailsViewState3) obj);
                                    }
                                };
                                LazyColumn.items(orderGroupsItems.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1$invoke$lambda$3$lambda$2$$inlined$items$default$7
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int i) {
                                        return c8762xd65d4cf6.invoke(orderGroupsItems.get(i));
                                    }
                                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$AdvisorTradeDetails$2$1$invoke$lambda$3$lambda$2$$inlined$items$default$8
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                                        int i3;
                                        if ((i2 & 6) == 0) {
                                            i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                                        } else {
                                            i3 = i2;
                                        }
                                        if ((i2 & 48) == 0) {
                                            i3 |= composer.changed(i) ? 32 : 16;
                                        }
                                        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                        }
                                        AdvisorTradeDetailsViewState3 advisorTradeDetailsViewState3 = (AdvisorTradeDetailsViewState3) orderGroupsItems.get(i);
                                        composer.startReplaceGroup(1570590913);
                                        AdvisorTradeDetails.OrderGroupItemComponent(advisorTradeDetailsViewState3, null, composer, 0, 2);
                                        composer.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                            } else {
                                if (!Intrinsics.areEqual(advisorTradeDetailsViewStateAdvisorTradeDetails$lambda$4, AdvisorTradeDetailsViewState.Loading.INSTANCE)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                AdvisorTradeDetails3 advisorTradeDetails3 = AdvisorTradeDetails3.INSTANCE;
                                LazyListScope.item$default(LazyColumn, null, null, advisorTradeDetails3.getLambda$288762427$feature_advisory_history_externalDebug(), 3, null);
                                LazyListScope.items$default(LazyColumn, 5, null, null, advisorTradeDetails3.m11035getLambda$1437039420$feature_advisory_history_externalDebug(), 6, null);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | 805306416, 508);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                advisorTradeDetailsDuxo4 = advisorTradeDetailsDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                advisorTradeDetailsDuxo4 = advisorTradeDetailsDuxo2;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.history.trade.AdvisorTradeDetailsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvisorTradeDetails.AdvisorTradeDetails$lambda$5(onBackClicked, modifier4, advisorTradeDetailsDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
