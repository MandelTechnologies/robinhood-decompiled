package com.robinhood.android.advisory.onboarding.retirement.recommendation.selection;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.onboarding.retirement.recommendation.UtilsKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.store.AsyncResult;
import java.util.Iterator;
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
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AccountRecommendationSelectionScreen.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u0017\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0011\u001a-\u0010\u0013\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0015\"\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"LoadedAccountRecommendationSelectionScreen", "", "state", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionViewState;", "callbacks", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionViewState;Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PlaceholderAccountRecommendationTag", "", "PlaceholderTitleLineLengths", "", "", "PlaceholderSubtitleLineLengths", "PlaceholderRowLengths", "PlaceholderAccountRecommendationSelectionScreen", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AccountRecommendationSelectionErrorTag", "AccountRecommendationSelectionScreen", "Lcom/robinhood/store/AsyncResult;", "(Lcom/robinhood/store/AsyncResult;Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AccountRecommendationSelectionScreen2 {
    public static final String AccountRecommendationSelectionErrorTag = "account_recommendation_error";
    public static final String PlaceholderAccountRecommendationTag = "account_recommendation_placeholder";
    private static final List<Integer> PlaceholderTitleLineLengths = CollectionsKt.listOf((Object[]) new Integer[]{23, 20});
    private static final List<Integer> PlaceholderSubtitleLineLengths = CollectionsKt.listOf((Object[]) new Integer[]{40, 30});
    private static final List<Integer> PlaceholderRowLengths = CollectionsKt.listOf((Object[]) new Integer[]{30, 20});

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountRecommendationSelectionScreen$lambda$5(AsyncResult asyncResult, AccountRecommendationSelectionScreen accountRecommendationSelectionScreen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountRecommendationSelectionScreen(asyncResult, accountRecommendationSelectionScreen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedAccountRecommendationSelectionScreen$lambda$2(AccountRecommendationSelectionViewState accountRecommendationSelectionViewState, AccountRecommendationSelectionScreen accountRecommendationSelectionScreen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadedAccountRecommendationSelectionScreen(accountRecommendationSelectionViewState, accountRecommendationSelectionScreen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaceholderAccountRecommendationSelectionScreen$lambda$3(Modifier modifier, int i, int i2, Composer composer, int i3) {
        PlaceholderAccountRecommendationSelectionScreen(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadedAccountRecommendationSelectionScreen(final AccountRecommendationSelectionViewState state, final AccountRecommendationSelectionScreen callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1138244208);
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
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1138244208, i3, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.LoadedAccountRecommendationSelectionScreen (AccountRecommendationSelectionScreen.kt:39)");
                }
                PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(state) | ((i3 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountRecommendationSelectionScreen2.LoadedAccountRecommendationSelectionScreen$lambda$1$lambda$0(state, callbacks, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                UtilsKt.m11125StickyFooterLazyColumnmxsUjTo((Function1) objRememberedValue, ComposableLambda3.rememberComposableLambda(-1324120436, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionScreenKt.LoadedAccountRecommendationSelectionScreen.2
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
                            ComposerKt.traceEventStart(-1324120436, i5, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.LoadedAccountRecommendationSelectionScreen.<anonymous> (AccountRecommendationSelectionScreen.kt:72)");
                        }
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                        ImmutableList<UIComponent<GenericAction>> footer = state.getFooter();
                        composer2.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(footer, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 0, 0);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), modifier2, null, 0L, false, paddingValuesM5137PaddingValuesYgX7TsA$default, null, null, composerStartRestartGroup, (i3 & 896) | 48, 440);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountRecommendationSelectionScreen2.LoadedAccountRecommendationSelectionScreen$lambda$2(state, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default2 = PaddingKt.m5137PaddingValuesYgX7TsA$default(0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(state) | ((i3 & 112) != 32);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountRecommendationSelectionScreen2.LoadedAccountRecommendationSelectionScreen$lambda$1$lambda$0(state, callbacks, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                UtilsKt.m11125StickyFooterLazyColumnmxsUjTo((Function1) objRememberedValue, ComposableLambda3.rememberComposableLambda(-1324120436, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionScreenKt.LoadedAccountRecommendationSelectionScreen.2
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
                            ComposerKt.traceEventStart(-1324120436, i5, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.LoadedAccountRecommendationSelectionScreen.<anonymous> (AccountRecommendationSelectionScreen.kt:72)");
                        }
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                        ImmutableList<UIComponent<GenericAction>> footer = state.getFooter();
                        composer2.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(footer, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 0, 0);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), modifier2, null, 0L, false, paddingValuesM5137PaddingValuesYgX7TsA$default2, null, null, composerStartRestartGroup, (i3 & 896) | 48, 440);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedAccountRecommendationSelectionScreen$lambda$1$lambda$0(AccountRecommendationSelectionViewState accountRecommendationSelectionViewState, AccountRecommendationSelectionScreen accountRecommendationSelectionScreen, LazyListScope StickyFooterLazyColumn) {
        Intrinsics.checkNotNullParameter(StickyFooterLazyColumn, "$this$StickyFooterLazyColumn");
        SduiColumns.sduiItems(StickyFooterLazyColumn, accountRecommendationSelectionViewState.getHeader(), GenericAction.class, null, null, HorizontalPadding.Default);
        LazyListScope.item$default(StickyFooterLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1623915104, true, new AccountRecommendationSelectionScreen4(accountRecommendationSelectionViewState, accountRecommendationSelectionScreen)), 3, null);
        return Unit.INSTANCE;
    }

    private static final void PlaceholderAccountRecommendationSelectionScreen(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-846951468);
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
                ComposerKt.traceEventStart(-846951468, i3, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.PlaceholderAccountRecommendationSelectionScreen (AccountRecommendationSelectionScreen.kt:91)");
            }
            LocalShowPlaceholder.Loadable(true, TestTag3.testTag(modifier, PlaceholderAccountRecommendationTag), null, ComposableLambda3.rememberComposableLambda(1382845508, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionScreenKt.PlaceholderAccountRecommendationSelectionScreen.1
                public final void invoke(Composer composer2, int i5) {
                    int i6;
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1382845508, i5, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.PlaceholderAccountRecommendationSelectionScreen.<anonymous> (AccountRecommendationSelectionScreen.kt:95)");
                    }
                    float f = 0.0f;
                    int i7 = 1;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifier, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                    boolean z = false;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composer2.startReplaceGroup(2114492353);
                    Iterator it = AccountRecommendationSelectionScreen2.PlaceholderTitleLineLengths.iterator();
                    while (true) {
                        i6 = 6;
                        if (!it.hasNext()) {
                            break;
                        }
                        BentoText2.m20747BentoText38GnDrw(UtilsKt.textOfLength(((Number) it.next()).intValue()), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, f, composer2, 6, i7), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getDisplayCapsuleMedium(), composer2, 0, 0, 8188);
                        f = 0.0f;
                        i7 = 1;
                        z = false;
                    }
                    composer2.endReplaceGroup();
                    boolean z2 = false;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer2, 0);
                    composer2.startReplaceGroup(2114503549);
                    Iterator it2 = AccountRecommendationSelectionScreen2.PlaceholderSubtitleLineLengths.iterator();
                    while (it2.hasNext()) {
                        BentoText2.m20747BentoText38GnDrw(UtilsKt.textOfLength(((Number) it2.next()).intValue()), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, i6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16380);
                        i6 = i6;
                        z2 = false;
                    }
                    composer2.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), composer2, 0);
                    composer2.startReplaceGroup(2114512296);
                    Iterator it3 = AccountRecommendationSelectionScreen2.PlaceholderRowLengths.iterator();
                    while (it3.hasNext()) {
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, UtilsKt.textOfLength(((Number) it3.next()).intValue()), null, null, null, null, false, false, false, 0L, null, composer2, 0, 0, 4091);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountRecommendationSelectionScreen2.PlaceholderAccountRecommendationSelectionScreen$lambda$3(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountRecommendationSelectionScreen(final AsyncResult<AccountRecommendationSelectionViewState> state, final AccountRecommendationSelectionScreen callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(215228770);
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
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(215228770, i3, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionScreen (AccountRecommendationSelectionScreen.kt:127)");
                }
                if (state instanceof AsyncResult.Failure) {
                    if (state instanceof AsyncResult.Loading) {
                        composerStartRestartGroup.startReplaceGroup(-505377115);
                        PlaceholderAccountRecommendationSelectionScreen(modifier5, composerStartRestartGroup, (i3 >> 6) & 14, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!(state instanceof AsyncResult.Success)) {
                            composerStartRestartGroup.startReplaceGroup(676425388);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-505217186);
                        int i5 = i3 & 1008;
                        modifier3 = modifier5;
                        LoadedAccountRecommendationSelectionScreen((AccountRecommendationSelectionViewState) ((AsyncResult.Success) state).getValue(), callbacks, modifier3, composerStartRestartGroup, i5, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(-505614606);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z = (i3 & 112) == 32;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new AccountRecommendationSelectionScreen3(callbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ErrorScreenComposable.ErrorScreenComposable(TestTag3.testTag(modifier5, AccountRecommendationSelectionErrorTag), (Function0) ((KFunction) objRememberedValue), 0, null, null, null, null, false, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    composerStartRestartGroup.endReplaceGroup();
                }
                modifier3 = modifier5;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountRecommendationSelectionScreen2.AccountRecommendationSelectionScreen$lambda$5(state, callbacks, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (state instanceof AsyncResult.Failure) {
            }
            modifier3 = modifier5;
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
