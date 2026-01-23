package com.robinhood.android.retirement.p239ui.contributions;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.paging.Pager;
import androidx.paging.PagingData;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItems5;
import com.robinhood.android.dashboard.lib.footer.AnimatedFooterContent;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButton2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.models.retirement.p194db.RetirementCombinedContributionViewModel;
import com.robinhood.android.responsive.WindowSize;
import com.robinhood.android.retirement.C26959R;
import com.robinhood.android.retirement.p239ui.RetirementComponent;
import com.robinhood.android.retirement.p239ui.UtilKt;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.flow.Flow;

/* compiled from: Contributions.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\u001a'\u0010\r\u001a\u00020\u00052\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0011\u001aQ\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0018\u0010\u0015\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00180\u0017j\u0002`\u0019\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010 \u001a/\u0010!\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\"\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"ContributionsTopAppBarTag", "", "ContributionsLazyColumnTag", "ContributionsHeaderKey", "ContributionsTopAppBar", "", "topBarScrollState", "Lcom/robinhood/compose/bento/component/TopBarScrollState;", "onBackClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/compose/bento/component/TopBarScrollState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SduiFooterButton", "button", "Lcom/robinhood/models/serverdriven/experimental/api/Button;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "(Lcom/robinhood/models/serverdriven/experimental/api/Button;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CompactContributions", "state", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsViewState;", "historyItems", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "callbacks", "Lcom/robinhood/android/retirement/ui/contributions/ContributionsCallbacks;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "isFirstAppearance", "", "(Lcom/robinhood/android/retirement/ui/contributions/ContributionsViewState;Landroidx/paging/compose/LazyPagingItems;Lcom/robinhood/android/retirement/ui/contributions/ContributionsCallbacks;Landroidx/compose/foundation/lazy/LazyListState;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Contributions", "(Lcom/robinhood/android/retirement/ui/contributions/ContributionsViewState;Lcom/robinhood/android/retirement/ui/contributions/ContributionsCallbacks;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-retirement-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.ui.contributions.ContributionsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Contributions3 {
    public static final String ContributionsHeaderKey = "contributions_header";
    public static final String ContributionsLazyColumnTag = "contributions_lazy_column";
    public static final String ContributionsTopAppBarTag = "contributions_top_app_bar";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompactContributions$lambda$5(ContributionsViewState contributionsViewState, LazyPagingItems lazyPagingItems, Contributions2 contributions2, LazyListState lazyListState, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CompactContributions(contributionsViewState, lazyPagingItems, contributions2, lazyListState, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Contributions$lambda$6(ContributionsViewState contributionsViewState, Contributions2 contributions2, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Contributions(contributionsViewState, contributions2, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionsTopAppBar$lambda$0(TopBarScrollState topBarScrollState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContributionsTopAppBar(topBarScrollState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiFooterButton$lambda$1(Button button, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiFooterButton(button, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContributionsTopAppBar(final TopBarScrollState topBarScrollState, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2097376118);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(topBarScrollState) : composerStartRestartGroup.changedInstance(topBarScrollState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2097376118, i3, -1, "com.robinhood.android.retirement.ui.contributions.ContributionsTopAppBar (Contributions.kt:53)");
                }
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1728727593, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt.ContributionsTopAppBar.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1728727593, i5, -1, "com.robinhood.android.retirement.ui.contributions.ContributionsTopAppBar.<anonymous> (Contributions.kt:62)");
                        }
                        Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, topBarScrollState.getOpacity());
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAlpha);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C26959R.string.retirement_contributions_title, composer3, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextL(), composer3, 0, 0, 8190);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), TestTag3.testTag(modifier4, ContributionsTopAppBarTag), ComposableLambda3.rememberComposableLambda(601520469, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt.ContributionsTopAppBar.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                        invoke(bentoAppBarScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i5 & 6) == 0) {
                            i5 |= (i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i5 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(601520469, i5, -1, "com.robinhood.android.retirement.ui.contributions.ContributionsTopAppBar.<anonymous> (Contributions.kt:57)");
                        }
                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, false, topBarScrollState.getShowDivider(), null, null, 0L, null, composer2, 390, 0, 1976);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Contributions3.ContributionsTopAppBar$lambda$0(topBarScrollState, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(1728727593, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt.ContributionsTopAppBar.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1728727593, i5, -1, "com.robinhood.android.retirement.ui.contributions.ContributionsTopAppBar.<anonymous> (Contributions.kt:62)");
                    }
                    Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, topBarScrollState.getOpacity());
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAlpha);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C26959R.string.retirement_contributions_title, composer3, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextL(), composer3, 0, 0, 8190);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), TestTag3.testTag(modifier4, ContributionsTopAppBarTag), ComposableLambda3.rememberComposableLambda(601520469, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt.ContributionsTopAppBar.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i5) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i5 & 6) == 0) {
                        i5 |= (i5 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i5 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(601520469, i5, -1, "com.robinhood.android.retirement.ui.contributions.ContributionsTopAppBar.<anonymous> (Contributions.kt:57)");
                    }
                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, topBarScrollState.getShowDivider(), null, null, 0L, null, composer2, 390, 0, 1976);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void SduiFooterButton(final Button<? extends GenericAction> button, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2016246604);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(button) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2016246604, i3, -1, "com.robinhood.android.retirement.ui.contributions.SduiFooterButton (Contributions.kt:79)");
            }
            AnimatedFooterContent.AnimatedFooterContent(button != null, ComposableLambda3.rememberComposableLambda(109085219, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt.SduiFooterButton.1
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
                        ComposerKt.traceEventStart(109085219, i5, -1, "com.robinhood.android.retirement.ui.contributions.SduiFooterButton.<anonymous> (Contributions.kt:83)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer2, 6, 0), 0.0f, 1, null);
                    Button<GenericAction> button2 = button;
                    if (button2 == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        SduiButton2.SduiButton(button2, modifierFillMaxWidth$default, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }, composerStartRestartGroup, 54), modifier2, composerStartRestartGroup, ((i3 << 3) & 896) | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Contributions3.SduiFooterButton$lambda$1(button, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CompactContributions(final ContributionsViewState contributionsViewState, final LazyPagingItems<StatefulHistoryEvent<HistoryEvent>> lazyPagingItems, final Contributions2 contributions2, final LazyListState lazyListState, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Contributions2 contributions22;
        LazyListState lazyListState2;
        boolean z2;
        int i4;
        Modifier modifier2;
        int i5;
        RetirementCombinedContributionViewModel viewModel;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z3;
        boolean z4;
        Object objRememberedValue;
        final RetirementCombinedContributionViewModel retirementCombinedContributionViewModel;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-686093719);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(contributionsViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(lazyPagingItems) : composerStartRestartGroup.changedInstance(lazyPagingItems) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                contributions22 = contributions2;
                i3 |= composerStartRestartGroup.changed(contributions22) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    lazyListState2 = lazyListState;
                    i3 |= composerStartRestartGroup.changed(lazyListState2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    i4 = i2 & 32;
                    if (i4 != 0) {
                        if ((196608 & i) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                        }
                        i5 = i3;
                        if ((74899 & i5) == 74898 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier2;
                        } else {
                            Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-686093719, i5, -1, "com.robinhood.android.retirement.ui.contributions.CompactContributions (Contributions.kt:104)");
                            }
                            viewModel = contributionsViewState.getViewModel();
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
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierTestTag = TestTag3.testTag(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), ContributionsLazyColumnTag);
                            PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default = androidx.compose.foundation.layout.PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 7, null);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            z3 = true;
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(contributionsViewState) | ((i5 & 896) != 256) | ((57344 & i5) != 16384) | composerStartRestartGroup.changedInstance(viewModel);
                            if ((i5 & 112) != 32 && ((i5 & 64) == 0 || !composerStartRestartGroup.changedInstance(lazyPagingItems))) {
                                z3 = false;
                            }
                            z4 = zChangedInstance | z3;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                retirementCombinedContributionViewModel = viewModel;
                                final boolean z5 = z2;
                                Function1 function1 = new Function1() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Contributions3.CompactContributions$lambda$4$lambda$3$lambda$2(retirementCombinedContributionViewModel, lazyPagingItems, contributionsViewState, contributions22, z5, (LazyListScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(function1);
                                objRememberedValue = function1;
                            } else {
                                retirementCombinedContributionViewModel = viewModel;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier5 = modifier4;
                            LazyDslKt.LazyColumn(modifierTestTag, lazyListState2, paddingValuesM5139PaddingValuesa9UjIt4$default, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i5 >> 6) & 112, 504);
                            composer2 = composerStartRestartGroup;
                            SduiFooterButton(retirementCombinedContributionViewModel == null ? retirementCombinedContributionViewModel.getCtaButton() : null, UtilKt.autoLogEvents(companion2, RetirementComponent.ContributionCta.INSTANCE), composer2, 0, 0);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return Contributions3.CompactContributions$lambda$5(contributionsViewState, lazyPagingItems, contributions2, lazyListState, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    modifier2 = modifier;
                    i5 = i3;
                    if ((74899 & i5) == 74898) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        viewModel = contributionsViewState.getViewModel();
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            Modifier modifierTestTag2 = TestTag3.testTag(Column5.weight$default(column62, companion22, 1.0f, false, 2, null), ContributionsLazyColumnTag);
                            PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default2 = androidx.compose.foundation.layout.PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 7, null);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            z3 = true;
                            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(contributionsViewState) | ((i5 & 896) != 256) | ((57344 & i5) != 16384) | composerStartRestartGroup.changedInstance(viewModel);
                            if ((i5 & 112) != 32) {
                                z3 = false;
                            }
                            z4 = zChangedInstance2 | z3;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z4) {
                                retirementCombinedContributionViewModel = viewModel;
                                final boolean z52 = z2;
                                Function1 function12 = new Function1() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Contributions3.CompactContributions$lambda$4$lambda$3$lambda$2(retirementCombinedContributionViewModel, lazyPagingItems, contributionsViewState, contributions22, z52, (LazyListScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(function12);
                                objRememberedValue = function12;
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifier52 = modifier4;
                                LazyDslKt.LazyColumn(modifierTestTag2, lazyListState2, paddingValuesM5139PaddingValuesa9UjIt4$default2, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i5 >> 6) & 112, 504);
                                composer2 = composerStartRestartGroup;
                                SduiFooterButton(retirementCombinedContributionViewModel == null ? retirementCombinedContributionViewModel.getCtaButton() : null, UtilKt.autoLogEvents(companion22, RetirementComponent.ContributionCta.INSTANCE), composer2, 0, 0);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z2 = z;
                i4 = i2 & 32;
                if (i4 != 0) {
                }
                modifier2 = modifier;
                i5 = i3;
                if ((74899 & i5) == 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            lazyListState2 = lazyListState;
            if ((i2 & 16) != 0) {
            }
            z2 = z;
            i4 = i2 & 32;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            i5 = i3;
            if ((74899 & i5) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        contributions22 = contributions2;
        if ((i2 & 8) == 0) {
        }
        lazyListState2 = lazyListState;
        if ((i2 & 16) != 0) {
        }
        z2 = z;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i3;
        if ((74899 & i5) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompactContributions$lambda$4$lambda$3$lambda$2(RetirementCombinedContributionViewModel retirementCombinedContributionViewModel, LazyPagingItems lazyPagingItems, final ContributionsViewState contributionsViewState, final Contributions2 contributions2, final boolean z, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, ContributionsHeaderKey, null, ComposableLambda3.composableLambdaInstance(1789261822, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt$CompactContributions$1$1$1$1
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
                    ComposerKt.traceEventStart(1789261822, i, -1, "com.robinhood.android.retirement.ui.contributions.CompactContributions.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Contributions.kt:117)");
                }
                CombinedContributionHeader.CombinedContributionHeader(contributionsViewState, contributions2, z, null, composer, 0, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        if ((retirementCombinedContributionViewModel != null ? retirementCombinedContributionViewModel.getPreHistoryContent() : null) != null) {
            SduiColumns.sduiItems(LazyColumn, extensions2.toPersistentList(retirementCombinedContributionViewModel.getPreHistoryContent()), GenericAction.class, null, null, HorizontalPadding.Default);
        }
        ContributionsHistory5.contributionsHistorySection(LazyColumn, lazyPagingItems);
        if ((retirementCombinedContributionViewModel != null ? retirementCombinedContributionViewModel.getPostHistoryContent() : null) != null) {
            SduiColumns.sduiItems(LazyColumn, extensions2.toPersistentList(retirementCombinedContributionViewModel.getPostHistoryContent()), GenericAction.class, null, null, HorizontalPadding.Default);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Contributions(final ContributionsViewState state, final Contributions2 callbacks, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final boolean z2;
        Modifier modifier2;
        int i4;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(78687345);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(78687345, i4, -1, "com.robinhood.android.retirement.ui.contributions.Contributions (Contributions.kt:146)");
                }
                Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager = state.getHistoryPager();
                Flow<PagingData<StatefulHistoryEvent<HistoryEvent>>> flow = historyPager == null ? historyPager.getFlow() : null;
                composerStartRestartGroup.startReplaceGroup(-1690865557);
                final LazyPagingItems lazyPagingItemsCollectAsLazyPagingItems = flow != null ? LazyPagingItems5.collectAsLazyPagingItems(flow, null, composerStartRestartGroup, 0, 1) : null;
                composerStartRestartGroup.endReplaceGroup();
                final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                final TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU();
                composer2 = composerStartRestartGroup;
                Modifier modifier4 = modifier2;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier4, ComposableLambda3.rememberComposableLambda(-21565131, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt.Contributions.1
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
                            ComposerKt.traceEventStart(-21565131, i7, -1, "com.robinhood.android.retirement.ui.contributions.Contributions.<anonymous> (Contributions.kt:157)");
                        }
                        Modifier modifierScrollableTopBarState = TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, lazyListStateRememberLazyListState, topBarScrollStateRememberTopBarScrollState);
                        Contributions2 contributions2 = callbacks;
                        composer3.startReplaceGroup(5004770);
                        boolean zChanged = composer3.changed(contributions2);
                        Object objRememberedValue = composer3.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Contributions5(contributions2);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceGroup();
                        Contributions3.ContributionsTopAppBar(topBarScrollStateRememberTopBarScrollState, (Function0) ((KFunction) objRememberedValue), modifierScrollableTopBarState, composer3, TopBarScrollState.$stable, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(979100672, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt.Contributions.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final PaddingValues paddingValues, Composer composer3, int i7) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i7 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(979100672, i7, -1, "com.robinhood.android.retirement.ui.contributions.Contributions.<anonymous> (Contributions.kt:167)");
                        }
                        final Contributions2 contributions2 = callbacks;
                        final ContributionsViewState contributionsViewState = state;
                        final LazyPagingItems<StatefulHistoryEvent<HistoryEvent>> lazyPagingItems = lazyPagingItemsCollectAsLazyPagingItems;
                        final LazyListState lazyListState = lazyListStateRememberLazyListState;
                        final boolean z3 = z2;
                        SduiActionHandler3.ProvideActionHandler(contributions2, ComposableLambda3.rememberComposableLambda(586449343, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt.Contributions.2.1

                            /* compiled from: Contributions.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            /* renamed from: com.robinhood.android.retirement.ui.contributions.ContributionsKt$Contributions$2$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[WindowSize.values().length];
                                    try {
                                        iArr[WindowSize.Compact.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[WindowSize.Medium.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[WindowSize.Expanded.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i8) {
                                if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(586449343, i8, -1, "com.robinhood.android.retirement.ui.contributions.Contributions.<anonymous>.<anonymous> (Contributions.kt:168)");
                                }
                                int i9 = WhenMappings.$EnumSwitchMapping$0[WindowSize.INSTANCE.getCurrentWidth(composer4, 6).ordinal()];
                                if (i9 == 1) {
                                    composer4.startReplaceGroup(-1014488201);
                                    Contributions3.CompactContributions(contributionsViewState, lazyPagingItems, contributions2, lazyListState, z3, androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, LazyPagingItems.$stable << 3, 0);
                                    composer4.endReplaceGroup();
                                } else {
                                    if (i9 != 2 && i9 != 3) {
                                        composer4.startReplaceGroup(937104093);
                                        composer4.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer4.startReplaceGroup(-1014067965);
                                    MediumContributions.MediumContributions(contributionsViewState, lazyPagingItems, contributions2, z3, androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, LazyPagingItems.$stable << 3, 0);
                                    composer4.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, ((i4 >> 9) & 14) | 805306416, 316);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Contributions3.Contributions$lambda$6(state, callbacks, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager2 = state.getHistoryPager();
            if (historyPager2 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(-1690865557);
            if (flow != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            final LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            final TopBarScrollState topBarScrollStateRememberTopBarScrollState2 = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU();
            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU();
            composer2 = composerStartRestartGroup;
            Modifier modifier42 = modifier2;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier42, ComposableLambda3.rememberComposableLambda(-21565131, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt.Contributions.1
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
                        ComposerKt.traceEventStart(-21565131, i7, -1, "com.robinhood.android.retirement.ui.contributions.Contributions.<anonymous> (Contributions.kt:157)");
                    }
                    Modifier modifierScrollableTopBarState = TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, lazyListStateRememberLazyListState2, topBarScrollStateRememberTopBarScrollState2);
                    Contributions2 contributions2 = callbacks;
                    composer3.startReplaceGroup(5004770);
                    boolean zChanged = composer3.changed(contributions2);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Contributions5(contributions2);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    Contributions3.ContributionsTopAppBar(topBarScrollStateRememberTopBarScrollState2, (Function0) ((KFunction) objRememberedValue), modifierScrollableTopBarState, composer3, TopBarScrollState.$stable, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, null, ComposableLambda3.rememberComposableLambda(979100672, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt.Contributions.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final PaddingValues paddingValues, Composer composer3, int i7) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i7 & 6) == 0) {
                        i7 |= composer3.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i7 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(979100672, i7, -1, "com.robinhood.android.retirement.ui.contributions.Contributions.<anonymous> (Contributions.kt:167)");
                    }
                    final Contributions2 contributions2 = callbacks;
                    final ContributionsViewState contributionsViewState = state;
                    final LazyPagingItems<StatefulHistoryEvent<HistoryEvent>> lazyPagingItems = lazyPagingItemsCollectAsLazyPagingItems;
                    final LazyListState lazyListState = lazyListStateRememberLazyListState2;
                    final boolean z3 = z2;
                    SduiActionHandler3.ProvideActionHandler(contributions2, ComposableLambda3.rememberComposableLambda(586449343, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.contributions.ContributionsKt.Contributions.2.1

                        /* compiled from: Contributions.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.android.retirement.ui.contributions.ContributionsKt$Contributions$2$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[WindowSize.values().length];
                                try {
                                    iArr[WindowSize.Compact.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[WindowSize.Medium.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[WindowSize.Expanded.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i8) {
                            if ((i8 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(586449343, i8, -1, "com.robinhood.android.retirement.ui.contributions.Contributions.<anonymous>.<anonymous> (Contributions.kt:168)");
                            }
                            int i9 = WhenMappings.$EnumSwitchMapping$0[WindowSize.INSTANCE.getCurrentWidth(composer4, 6).ordinal()];
                            if (i9 == 1) {
                                composer4.startReplaceGroup(-1014488201);
                                Contributions3.CompactContributions(contributionsViewState, lazyPagingItems, contributions2, lazyListState, z3, androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, LazyPagingItems.$stable << 3, 0);
                                composer4.endReplaceGroup();
                            } else {
                                if (i9 != 2 && i9 != 3) {
                                    composer4.startReplaceGroup(937104093);
                                    composer4.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer4.startReplaceGroup(-1014067965);
                                MediumContributions.MediumContributions(contributionsViewState, lazyPagingItems, contributions2, z3, androidx.compose.foundation.layout.PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, LazyPagingItems.$stable << 3, 0);
                                composer4.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, ((i4 >> 9) & 14) | 805306416, 316);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
