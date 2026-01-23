package com.robinhood.android.advisory.portfolio.update.results;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Rotate;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
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
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsViewState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: UpdatePortfolioResultsScreen.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a-\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0012\u001a-\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00142\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0015\u001a'\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u001b\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001c²\u0006\f\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002²\u0006\n\u0010#\u001a\u00020 X\u008a\u0084\u0002"}, m3636d2 = {"MaxLottieHeight", "Landroidx/compose/ui/unit/Dp;", "F", "ChangeLoggingIdentifier", "", "NoChangeLoggingIdentifier", "NoChangeScreen", "", "state", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState$NoChange;", "onDoneClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState$NoChange;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ChangeRow", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/advisory/portfolio/update/results/ModelPortfolioChangeRow;", "(Lcom/robinhood/android/advisory/portfolio/update/results/ModelPortfolioChangeRow;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ChangeScreen", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState$Change;", "(Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState$Change;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "UpdatePortfolioResultsErrorTag", "UpdatePortfolioResultsScreen", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState;", "callbacks", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsScreenCallbacks;", "(Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsViewState;Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-portfolio_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;", "isExpanded", "", "caretRotation", "", "showFooterDivider"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class UpdatePortfolioResultsScreenKt {
    public static final String ChangeLoggingIdentifier = "changed";
    private static final float MaxLottieHeight = C2002Dp.m7995constructorimpl(400);
    public static final String NoChangeLoggingIdentifier = "no_change";
    public static final String UpdatePortfolioResultsErrorTag = "update_portfolio_results_error";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeRow$lambda$12(ModelPortfolioChangeRow modelPortfolioChangeRow, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ChangeRow(modelPortfolioChangeRow, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeScreen$lambda$16(UpdatePortfolioResultsViewState.Change change, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ChangeScreen(change, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoChangeScreen$lambda$3(UpdatePortfolioResultsViewState.NoChange noChange, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NoChangeScreen(noChange, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdatePortfolioResultsScreen$lambda$17(UpdatePortfolioResultsViewState updatePortfolioResultsViewState, UpdatePortfolioResultsScreenCallbacks updatePortfolioResultsScreenCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UpdatePortfolioResultsScreen(updatePortfolioResultsViewState, updatePortfolioResultsScreenCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChangeRow$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ChangeRow$lambda$8(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChangeScreen$lambda$15(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final LottieComposition NoChangeScreen$lambda$2$lambda$1$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NoChangeScreen(final UpdatePortfolioResultsViewState.NoChange noChange, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        UpdatePortfolioResultsViewState.NoChange noChange2;
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1839128710);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            noChange2 = noChange;
        } else if ((i & 6) == 0) {
            noChange2 = noChange;
            i3 = (composerStartRestartGroup.changed(noChange2) ? 4 : 2) | i;
        } else {
            noChange2 = noChange;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1839128710, i3, -1, "com.robinhood.android.advisory.portfolio.update.results.NoChangeScreen (UpdatePortfolioResultsScreen.kt:85)");
                    }
                    Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(modifier4, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.UPDATE_MANAGED_INVESTOR_PROFILE_RESULTS, null, NoChangeLoggingIdentifier, null, 10, null), null, null, null, null, 61, null)));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierLogScreenTransitions);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor);
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierWeight$default = Column5.weight$default(column6, ScrollKt.verticalScroll$default(companion3, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor2);
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifier5 = modifier4;
                    LottieAnimation2.LottieAnimation(NoChangeScreen$lambda$2$lambda$1$lambda$0(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(!bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay() ? noChange2.getLottieUrlLight() : noChange2.getLottieUrlDark())), null, null, null, null, null, composerStartRestartGroup, 0, 62)), PaddingKt.m5145paddingqDBjuR0(SizeKt.m5156height3ABfNKs(companion3, MaxLottieHeight), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21594getXlargeD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21594getXlargeD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21594getXlargeD9Ej5fM()), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composerStartRestartGroup, 3072, 0, 0, 2097140);
                    String title = noChange.getTitle();
                    TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium();
                    TextAlign.Companion companion4 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(title, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8124);
                    BentoText2.m20747BentoText38GnDrw(noChange.getSubtitle(), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16316);
                    composerStartRestartGroup.endNode();
                    BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, (i3 >> 3) & 14, 0, 8184);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return UpdatePortfolioResultsScreenKt.NoChangeScreen$lambda$3(noChange, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                Modifier modifierLogScreenTransitions2 = ModifiersKt.logScreenTransitions(modifier4, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.UPDATE_MANAGED_INVESTOR_PROFILE_RESULTS, null, NoChangeLoggingIdentifier, null, 10, null), null, null, null, null, 61, null)));
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion5 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion5.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierLogScreenTransitions2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierWeight$default2 = Column5.weight$default(column62, ScrollKt.verticalScroll$default(companion32, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i52 = BentoTheme.$stable;
                        Modifier modifier52 = modifier4;
                        LottieAnimation2.LottieAnimation(NoChangeScreen$lambda$2$lambda$1$lambda$0(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(!bentoTheme2.getColors(composerStartRestartGroup, i52).getIsDay() ? noChange2.getLottieUrlLight() : noChange2.getLottieUrlDark())), null, null, null, null, null, composerStartRestartGroup, 0, 62)), PaddingKt.m5145paddingqDBjuR0(SizeKt.m5156height3ABfNKs(companion32, MaxLottieHeight), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21594getXlargeD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21594getXlargeD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21594getXlargeD9Ej5fM()), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composerStartRestartGroup, 3072, 0, 0, 2097140);
                        String title2 = noChange.getTitle();
                        TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium();
                        TextAlign.Companion companion42 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(title2, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 1, null), null, null, null, null, TextAlign.m7912boximpl(companion42.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 0, 0, 8124);
                        BentoText2.m20747BentoText38GnDrw(noChange.getSubtitle(), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion32, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion42.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16316);
                        composerStartRestartGroup.endNode();
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, (i3 >> 3) & 14, 0, 8184);
                        composer2 = composerStartRestartGroup;
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
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: UpdatePortfolioResultsScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$ChangeScreen$1 */
    static final class C92451 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onDoneClicked;
        final /* synthetic */ LazyListState $scrollState;
        final /* synthetic */ SnapshotState4<Boolean> $showFooterDivider$delegate;
        final /* synthetic */ UpdatePortfolioResultsViewState.Change $state;

        C92451(Modifier modifier, LazyListState lazyListState, UpdatePortfolioResultsViewState.Change change, Function0<Unit> function0, SnapshotState4<Boolean> snapshotState4) {
            this.$modifier = modifier;
            this.$scrollState = lazyListState;
            this.$state = change;
            this.$onDoneClicked = function0;
            this.$showFooterDivider$delegate = snapshotState4;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-28508325, i, -1, "com.robinhood.android.advisory.portfolio.update.results.ChangeScreen.<anonymous> (UpdatePortfolioResultsScreen.kt:251)");
            }
            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(this.$modifier, null, 1, null);
            LazyListState lazyListState = this.$scrollState;
            final UpdatePortfolioResultsViewState.Change change = this.$state;
            Function0<Unit> function0 = this.$onDoneClicked;
            SnapshotState4<Boolean> snapshotState4 = this.$showFooterDivider$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierLogScreenTransitions$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
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
            Modifier modifierWeight$default = Column5.weight$default(column6, companion2, 1.0f, false, 2, null);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(change);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$ChangeScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UpdatePortfolioResultsScreenKt.C92451.invoke$lambda$3$lambda$2$lambda$1(change, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierWeight$default, lazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 508);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), UpdatePortfolioResultsScreenKt.ChangeScreen$lambda$15(snapshotState4) ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composer, 0, 5);
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion2, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(final UpdatePortfolioResultsViewState.Change change, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(2133786470, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$ChangeScreen$1$1$1$1$1
                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2133786470, i, -1, "com.robinhood.android.advisory.portfolio.update.results.ChangeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpdatePortfolioResultsScreen.kt:259)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
                    UpdatePortfolioResultsViewState.Change change2 = change;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(change2.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8190);
                    BentoText2.m20747BentoText38GnDrw(change2.getSubtitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }
            }), 3, null);
            final ImmutableList<ModelPortfolioChangeRow> rows = change.getRows();
            final C9241x4debdc53 c9241x4debdc53 = new Function1() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$ChangeScreen$1$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(ModelPortfolioChangeRow modelPortfolioChangeRow) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((ModelPortfolioChangeRow) obj);
                }
            };
            LazyColumn.items(rows.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$ChangeScreen$1$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c9241x4debdc53.invoke(rows.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$ChangeScreen$1$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$4
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
                    ModelPortfolioChangeRow modelPortfolioChangeRow = (ModelPortfolioChangeRow) rows.get(i);
                    composer.startReplaceGroup(1630776852);
                    UpdatePortfolioResultsScreenKt.ChangeRow(modelPortfolioChangeRow, null, composer, 0, 2);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(292139613, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$ChangeScreen$1$1$1$1$3
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
                        ComposerKt.traceEventStart(292139613, i, -1, "com.robinhood.android.advisory.portfolio.update.results.ChangeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpdatePortfolioResultsScreen.kt:280)");
                    }
                    String disclosure = change.getDisclosure();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(disclosure, com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16376);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChangeRow(final ModelPortfolioChangeRow modelPortfolioChangeRow, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1152542431);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(modelPortfolioChangeRow) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1152542431, i3, -1, "com.robinhood.android.advisory.portfolio.update.results.ChangeRow (UpdatePortfolioResultsScreen.kt:151)");
                }
                Object[] objArr = {modelPortfolioChangeRow.getLabel()};
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UpdatePortfolioResultsScreenKt.ChangeRow$lambda$5$lambda$4();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(!ChangeRow$lambda$6(snapshotState) ? 180.0f : 360.0f, null, 0.0f, "history_row_expansion_anim", null, composerStartRestartGroup, 3072, 22);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(snapshotState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UpdatePortfolioResultsScreenKt.ChangeRow$lambda$10$lambda$9(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier4 = modifier3;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue2, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.ROW, modelPortfolioChangeRow.getLabel(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, ComposableLambda3.rememberComposableLambda(67392462, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$ChangeRow$2$1
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
                            ComposerKt.traceEventStart(67392462, i5, -1, "com.robinhood.android.advisory.portfolio.update.results.ChangeRow.<anonymous>.<anonymous> (UpdatePortfolioResultsScreen.kt:177)");
                        }
                        BentoText2.m20747BentoText38GnDrw(modelPortfolioChangeRow.getLabel(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(958467084, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$ChangeRow$2$2
                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(958467084, i5, -1, "com.robinhood.android.advisory.portfolio.update.results.ChangeRow.<anonymous>.<anonymous> (UpdatePortfolioResultsScreen.kt:182)");
                        }
                        ThemedColorDto valueColor = modelPortfolioChangeRow.getValueColor();
                        composer2.startReplaceGroup(1963868069);
                        final Color colorM6701boximpl = valueColor == null ? null : Color.m6701boximpl(SduiColors2.m18897toComposeColorDefaultediJQMabo(valueColor, 0L, composer2, 0, 1));
                        composer2.endReplaceGroup();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        final ModelPortfolioChangeRow modelPortfolioChangeRow2 = modelPortfolioChangeRow;
                        SnapshotState<Boolean> snapshotState2 = snapshotState;
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion3);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                        AnimatedVisibilityKt.AnimatedVisibility(Row6.INSTANCE, UpdatePortfolioResultsScreenKt.ChangeRow$lambda$6(snapshotState2) && modelPortfolioChangeRow2.getOriginalValue() != null, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null)), (String) null, ComposableLambda3.rememberComposableLambda(-1945897136, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$ChangeRow$2$2$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                invoke(animatedVisibilityScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1945897136, i6, -1, "com.robinhood.android.advisory.portfolio.update.results.ChangeRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpdatePortfolioResultsScreen.kt:191)");
                                }
                                BentoText2.m20747BentoText38GnDrw(modelPortfolioChangeRow2.getOriginalValue() + " → ", null, colorM6701boximpl, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16378);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 1600518, 18);
                        BentoText2.m20747BentoText38GnDrw(modelPortfolioChangeRow2.getNewValue(), null, colorM6701boximpl, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16378);
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
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1404004395, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$ChangeRow$2$3
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
                            ComposerKt.traceEventStart(1404004395, i5, -1, "com.robinhood.android.advisory.portfolio.update.results.ChangeRow.<anonymous>.<anonymous> (UpdatePortfolioResultsScreen.kt:203)");
                        }
                        IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(ServerToBentoAssetMapper2.CARET_DOWN_16.getResourceId(), composer2, 0), (String) null, Rotate.rotate(Modifier.INSTANCE, UpdatePortfolioResultsScreenKt.ChangeRow$lambda$8(snapshotState4AnimateFloatAsState)), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU(), composer2, 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), false, false, false, null, composerStartRestartGroup, 14355456, 0, 1815);
                AnimatedVisibilityKt.AnimatedVisibility(column6, ChangeRow$lambda$6(snapshotState), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(1060185619, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$ChangeRow$2$4
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1060185619, i5, -1, "com.robinhood.android.advisory.portfolio.update.results.ChangeRow.<anonymous>.<anonymous> (UpdatePortfolioResultsScreen.kt:213)");
                        }
                        String description = modelPortfolioChangeRow.getDescription();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(description, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), 1, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16376);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 30);
                composerStartRestartGroup = composerStartRestartGroup;
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UpdatePortfolioResultsScreenKt.ChangeRow$lambda$12(modelPortfolioChangeRow, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Object[] objArr2 = {modelPortfolioChangeRow.getLabel()};
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            final SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(!ChangeRow$lambda$6(snapshotState) ? 180.0f : 360.0f, null, 0.0f, "history_row_expansion_anim", null, composerStartRestartGroup, 3072, 22);
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(snapshotState);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdatePortfolioResultsScreenKt.ChangeRow$lambda$10$lambda$9(snapshotState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier42 = modifier3;
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifier42, false, null, null, (Function0) objRememberedValue2, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.ROW, modelPortfolioChangeRow.getLabel(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, ComposableLambda3.rememberComposableLambda(67392462, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$ChangeRow$2$1
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
                                ComposerKt.traceEventStart(67392462, i5, -1, "com.robinhood.android.advisory.portfolio.update.results.ChangeRow.<anonymous>.<anonymous> (UpdatePortfolioResultsScreen.kt:177)");
                            }
                            BentoText2.m20747BentoText38GnDrw(modelPortfolioChangeRow.getLabel(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(958467084, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$ChangeRow$2$2
                        public final void invoke(Composer composer2, int i5) {
                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(958467084, i5, -1, "com.robinhood.android.advisory.portfolio.update.results.ChangeRow.<anonymous>.<anonymous> (UpdatePortfolioResultsScreen.kt:182)");
                            }
                            ThemedColorDto valueColor = modelPortfolioChangeRow.getValueColor();
                            composer2.startReplaceGroup(1963868069);
                            final Color colorM6701boximpl = valueColor == null ? null : Color.m6701boximpl(SduiColors2.m18897toComposeColorDefaultediJQMabo(valueColor, 0L, composer2, 0, 1));
                            composer2.endReplaceGroup();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            final ModelPortfolioChangeRow modelPortfolioChangeRow2 = modelPortfolioChangeRow;
                            SnapshotState<Boolean> snapshotState2 = snapshotState;
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, companion3);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor22 = companion4.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor22);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion4.getSetModifier());
                            AnimatedVisibilityKt.AnimatedVisibility(Row6.INSTANCE, UpdatePortfolioResultsScreenKt.ChangeRow$lambda$6(snapshotState2) && modelPortfolioChangeRow2.getOriginalValue() != null, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null)), (String) null, ComposableLambda3.rememberComposableLambda(-1945897136, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$ChangeRow$2$2$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                    invoke(animatedVisibilityScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i6) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1945897136, i6, -1, "com.robinhood.android.advisory.portfolio.update.results.ChangeRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpdatePortfolioResultsScreen.kt:191)");
                                    }
                                    BentoText2.m20747BentoText38GnDrw(modelPortfolioChangeRow2.getOriginalValue() + " → ", null, colorM6701boximpl, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16378);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 1600518, 18);
                            BentoText2.m20747BentoText38GnDrw(modelPortfolioChangeRow2.getNewValue(), null, colorM6701boximpl, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16378);
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
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1404004395, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$ChangeRow$2$3
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
                                ComposerKt.traceEventStart(1404004395, i5, -1, "com.robinhood.android.advisory.portfolio.update.results.ChangeRow.<anonymous>.<anonymous> (UpdatePortfolioResultsScreen.kt:203)");
                            }
                            IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(ServerToBentoAssetMapper2.CARET_DOWN_16.getResourceId(), composer2, 0), (String) null, Rotate.rotate(Modifier.INSTANCE, UpdatePortfolioResultsScreenKt.ChangeRow$lambda$8(snapshotState4AnimateFloatAsState2)), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU(), composer2, 48, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), false, false, false, null, composerStartRestartGroup, 14355456, 0, 1815);
                    AnimatedVisibilityKt.AnimatedVisibility(column62, ChangeRow$lambda$6(snapshotState), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(1060185619, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$ChangeRow$2$4
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1060185619, i5, -1, "com.robinhood.android.advisory.portfolio.update.results.ChangeRow.<anonymous>.<anonymous> (UpdatePortfolioResultsScreen.kt:213)");
                            }
                            String description = modelPortfolioChangeRow.getDescription();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(description, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), 1, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16376);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 30);
                    composerStartRestartGroup = composerStartRestartGroup;
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState ChangeRow$lambda$5$lambda$4() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void ChangeRow$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeRow$lambda$10$lambda$9(SnapshotState snapshotState) {
        ChangeRow$lambda$7(snapshotState, !ChangeRow$lambda$6(snapshotState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChangeScreen(final UpdatePortfolioResultsViewState.Change change, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        UpdatePortfolioResultsViewState.Change change2;
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-350686618);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            change2 = change;
        } else {
            change2 = change;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(change2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
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
                    ComposerKt.traceEventStart(-350686618, i3, -1, "com.robinhood.android.advisory.portfolio.update.results.ChangeScreen (UpdatePortfolioResultsScreen.kt:233)");
                }
                final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(UpdatePortfolioResultsScreenKt.ChangeScreen$lambda$14$lambda$13(lazyListStateRememberLazyListState));
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.UPDATE_MANAGED_INVESTOR_PROFILE_RESULTS, null, ChangeLoggingIdentifier, null, 10, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(-28508325, true, new C92451(modifier4, lazyListStateRememberLazyListState, change2, function02, (SnapshotState4) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UpdatePortfolioResultsScreenKt.ChangeScreen$lambda$16(change, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            final LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.UPDATE_MANAGED_INVESTOR_PROFILE_RESULTS, null, ChangeLoggingIdentifier, null, 10, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(-28508325, true, new C92451(modifier4, lazyListStateRememberLazyListState2, change2, function02, (SnapshotState4) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChangeScreen$lambda$14$lambda$13(LazyListState lazyListState) {
        return !TopBarScrollState3.isScrolledToTheEnd(lazyListState) && TopBarScrollState3.getCanBeScrolled(lazyListState);
    }

    public static final void UpdatePortfolioResultsScreen(final UpdatePortfolioResultsViewState state, final UpdatePortfolioResultsScreenCallbacks callbacks, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(910521475);
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
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(910521475, i3, -1, "com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreen (UpdatePortfolioResultsScreen.kt:312)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1994655794, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt.UpdatePortfolioResultsScreen.1
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
                        ComposerKt.traceEventStart(-1994655794, i5, -1, "com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreen.<anonymous> (UpdatePortfolioResultsScreen.kt:314)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU();
                    Modifier modifier2 = modifier;
                    final UpdatePortfolioResultsScreenCallbacks updatePortfolioResultsScreenCallbacks = callbacks;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1862862482, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt.UpdatePortfolioResultsScreen.1.1
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
                                ComposerKt.traceEventStart(1862862482, i7, -1, "com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreen.<anonymous>.<anonymous> (UpdatePortfolioResultsScreen.kt:319)");
                            }
                            Function2<Composer, Integer, Unit> function2M11188getLambda$385350529$feature_advisory_portfolio_externalDebug = ComposableSingletons$UpdatePortfolioResultsScreenKt.INSTANCE.m11188getLambda$385350529$feature_advisory_portfolio_externalDebug();
                            final UpdatePortfolioResultsScreenCallbacks updatePortfolioResultsScreenCallbacks2 = updatePortfolioResultsScreenCallbacks;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M11188getLambda$385350529$feature_advisory_portfolio_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1731388461, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt.UpdatePortfolioResultsScreen.1.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i8 & 6) == 0) {
                                        i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1731388461, i8, -1, "com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreen.<anonymous>.<anonymous>.<anonymous> (UpdatePortfolioResultsScreen.kt:322)");
                                    }
                                    UpdatePortfolioResultsScreenCallbacks updatePortfolioResultsScreenCallbacks3 = updatePortfolioResultsScreenCallbacks2;
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChanged = composer4.changed(updatePortfolioResultsScreenCallbacks3);
                                    Object objRememberedValue = composer4.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new C9247x609f9d5c(updatePortfolioResultsScreenCallbacks3);
                                        composer4.updateRememberedValue(objRememberedValue);
                                    }
                                    composer4.endReplaceGroup();
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) ((KFunction) objRememberedValue), composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final UpdatePortfolioResultsViewState updatePortfolioResultsViewState = state;
                    final UpdatePortfolioResultsScreenCallbacks updatePortfolioResultsScreenCallbacks2 = callbacks;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-1465033507, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt.UpdatePortfolioResultsScreen.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                            int i8;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i7 & 6) == 0) {
                                i8 = (composer3.changed(paddingValues) ? 4 : 2) | i7;
                            } else {
                                i8 = i7;
                            }
                            if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1465033507, i8, -1, "com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreen.<anonymous>.<anonymous> (UpdatePortfolioResultsScreen.kt:329)");
                            }
                            UpdatePortfolioResultsViewState updatePortfolioResultsViewState2 = updatePortfolioResultsViewState;
                            if (updatePortfolioResultsViewState2 instanceof UpdatePortfolioResultsViewState.Change) {
                                composer3.startReplaceGroup(644568749);
                                UpdatePortfolioResultsViewState.Change change = (UpdatePortfolioResultsViewState.Change) updatePortfolioResultsViewState;
                                UpdatePortfolioResultsScreenCallbacks updatePortfolioResultsScreenCallbacks3 = updatePortfolioResultsScreenCallbacks2;
                                composer3.startReplaceGroup(5004770);
                                boolean zChanged = composer3.changed(updatePortfolioResultsScreenCallbacks3);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new C9248xea0b9810(updatePortfolioResultsScreenCallbacks3);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceGroup();
                                UpdatePortfolioResultsScreenKt.ChangeScreen(change, (Function0) ((KFunction) objRememberedValue), PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                                composer3.endReplaceGroup();
                            } else if (updatePortfolioResultsViewState2 instanceof UpdatePortfolioResultsViewState.Error) {
                                composer3.startReplaceGroup(644878470);
                                UpdatePortfolioResultsScreenCallbacks updatePortfolioResultsScreenCallbacks4 = updatePortfolioResultsScreenCallbacks2;
                                composer3.startReplaceGroup(5004770);
                                boolean zChanged2 = composer3.changed(updatePortfolioResultsScreenCallbacks4);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new C9249xea0b9bd1(updatePortfolioResultsScreenCallbacks4);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceGroup();
                                ErrorScreenComposable.ErrorScreenComposable(TestTag3.testTag(PaddingKt.padding(Modifier.INSTANCE, paddingValues), UpdatePortfolioResultsScreenKt.UpdatePortfolioResultsErrorTag), (Function0) ((KFunction) objRememberedValue2), 0, null, null, null, null, false, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                composer3.endReplaceGroup();
                            } else if (updatePortfolioResultsViewState2 instanceof UpdatePortfolioResultsViewState.Loading) {
                                composer3.startReplaceGroup(645256143);
                                LoadingScreenComposablesKt.ListLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), true, false, 5, composer3, 3120, 4);
                                composer3.endReplaceGroup();
                            } else {
                                if (!(updatePortfolioResultsViewState2 instanceof UpdatePortfolioResultsViewState.NoChange)) {
                                    composer3.startReplaceGroup(852075197);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(645564779);
                                UpdatePortfolioResultsViewState.NoChange noChange = (UpdatePortfolioResultsViewState.NoChange) updatePortfolioResultsViewState;
                                UpdatePortfolioResultsScreenCallbacks updatePortfolioResultsScreenCallbacks5 = updatePortfolioResultsScreenCallbacks2;
                                composer3.startReplaceGroup(5004770);
                                boolean zChanged3 = composer3.changed(updatePortfolioResultsScreenCallbacks5);
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new C9250xea0b9f92(updatePortfolioResultsScreenCallbacks5);
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                composer3.endReplaceGroup();
                                UpdatePortfolioResultsScreenKt.NoChangeScreen(noChange, (Function0) ((KFunction) objRememberedValue3), PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 805306416, 316);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdatePortfolioResultsScreenKt.UpdatePortfolioResultsScreen$lambda$17(state, callbacks, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
