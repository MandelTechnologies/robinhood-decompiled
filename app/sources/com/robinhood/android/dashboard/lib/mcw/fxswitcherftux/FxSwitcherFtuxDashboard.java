package com.robinhood.android.dashboard.lib.mcw.fxswitcherftux;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.portfolio.position.DisplayPositionListItem;
import com.robinhood.android.common.portfolio.position.NavigatingPositionListItem;
import com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList;
import com.robinhood.android.dashboard.lib.DashboardViewState;
import com.robinhood.android.dashboard.lib.Positions2;
import com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerRow3;
import com.robinhood.android.dashboard.lib.chart.DashboardChart4;
import com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxState;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcher;
import com.robinhood.android.mcw.feature.lib.displaycurrencyswitcher.DisplayCurrencySwitcherLocation;
import com.robinhood.android.mcw.fxswitcher.ftux.constants.BezierControlPoints;
import com.robinhood.android.mcw.fxswitcher.ftux.constants.FxSwitcherFtuxAnimationConstants;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.models.home.component.DashboardComponent;
import com.robinhood.models.serverdriven.experimental.api.AccountPositionAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.shared.cards.p371v3.CardStackComposable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FxSwitcherFtuxDashboard.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"FxSwitcherFtuxDashboard", "", "accountNumber", "", "dashboardState", "Lcom/robinhood/android/dashboard/lib/DashboardViewState$Loaded;", "ftuxState", "Lcom/robinhood/android/dashboard/lib/mcw/fxswitcherftux/FxSwitcherFtuxState$Data;", "performClickOnUnselectedCurrency", "", "modifier", "Landroidx/compose/ui/Modifier;", "onDropdownDismissed", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/robinhood/android/dashboard/lib/DashboardViewState$Loaded;Lcom/robinhood/android/dashboard/lib/mcw/fxswitcherftux/FxSwitcherFtuxState$Data;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-account-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDashboardKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class FxSwitcherFtuxDashboard {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FxSwitcherFtuxDashboard$lambda$8(String str, DashboardViewState.Loaded loaded, FxSwitcherFtuxState.Data data, boolean z, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        FxSwitcherFtuxDashboard(str, loaded, data, z, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FxSwitcherFtuxDashboard(final String accountNumber, final DashboardViewState.Loaded dashboardState, final FxSwitcherFtuxState.Data ftuxState, final boolean z, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        final Function0<Unit> function03;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z2;
        Object objRememberedValue;
        final Function0<Unit> function04;
        Ref.BooleanRef booleanRef;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(dashboardState, "dashboardState");
        Intrinsics.checkNotNullParameter(ftuxState, "ftuxState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1987756171);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(dashboardState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(ftuxState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    function04 = function02;
                } else {
                    Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDashboardKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        function03 = (Function0) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        function03 = function02;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1987756171, i3, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDashboard (FxSwitcherFtuxDashboard.kt:43)");
                    }
                    FxSwitcherFtuxAnimationConstants fxSwitcherFtuxAnimationConstants = FxSwitcherFtuxAnimationConstants.INSTANCE;
                    ImmutableList<DashboardComponent> components = dashboardState.getComponents();
                    FxSwitcherFtuxState.Step currentStep = ftuxState.getCurrentStep();
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), scrollStateRememberScrollState, false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    int i7 = i3;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM(), C2002Dp.m7995constructorimpl(36), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM());
                    DisplayCurrencySwitcherLocation displayCurrencySwitcherLocation = DisplayCurrencySwitcherLocation.HOME_TAB;
                    boolean isFxSwitcherStep = ftuxState.getIsFxSwitcherStep();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z2 = (i7 & 458752) != 131072;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDashboardKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FxSwitcherFtuxDashboard.FxSwitcherFtuxDashboard$lambda$7$lambda$3$lambda$2(function03);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function0<Unit> function05 = function03;
                    Ref.BooleanRef booleanRef3 = booleanRef2;
                    DisplayCurrencySwitcher.DisplayCurrencySwitcher(accountNumber, displayCurrencySwitcherLocation, modifierM5145paddingqDBjuR0, null, isFxSwitcherStep, false, z, null, (Function0) objRememberedValue, composerStartRestartGroup, (i7 & 14) | 196656 | ((i7 << 9) & 3670016), 136);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(-1692874438);
                    for (DashboardComponent dashboardComponent : components) {
                        composerStartRestartGroup.startReplaceGroup(-1692874760);
                        if (dashboardComponent instanceof DashboardComponent.Chart) {
                            DashboardChart4.DashboardChart((DashboardComponent.Chart) dashboardComponent, false, null, null, Boolean.valueOf(ftuxState.getIsBigNumberStep() || ftuxState.getIsEndStep()), Boolean.valueOf(ftuxState.getIsChartStep() || ftuxState.getIsEndStep()), composerStartRestartGroup, 48, 12);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1692862477);
                        if (dashboardComponent instanceof DashboardComponent.BuyingPower) {
                            PortfolioBuyingPowerRow3.PortfolioBuyingPowerRow(((DashboardComponent.BuyingPower) dashboardComponent).getAccountNumber(), FxSwitcherFtuxDashboard$highlight(Modifier.INSTANCE, ftuxState, fxSwitcherFtuxAnimationConstants, false), null, composerStartRestartGroup, 0, 4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1692854132);
                        if (dashboardComponent instanceof DashboardComponent.CardStack) {
                            Modifier modifierFxSwitcherFtuxDashboard$highlight = FxSwitcherFtuxDashboard$highlight(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), ftuxState, fxSwitcherFtuxAnimationConstants, false);
                            BentoTheme4 pageDirection = dashboardState.getPageDirection();
                            if (pageDirection == null) {
                                pageDirection = BentoTheme4.POSITIVE;
                            }
                            Composer composer2 = composerStartRestartGroup;
                            CardStackComposable.CardStackComposable(pageDirection, modifierFxSwitcherFtuxDashboard$highlight, true, null, composer2, 384, 8);
                            composerStartRestartGroup = composer2;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1692840441);
                        if (dashboardComponent instanceof DashboardComponent.Positions) {
                            ReorderablePositionsList reorderablePositionsListCreateStaticEquityPositions = Positions2.createStaticEquityPositions((DashboardComponent.Positions) dashboardComponent, composerStartRestartGroup, 0);
                            if (reorderablePositionsListCreateStaticEquityPositions instanceof ReorderablePositionsList.Ready.FixedOrder) {
                                Modifier modifierFxSwitcherFtuxDashboard$highlight2 = FxSwitcherFtuxDashboard$highlight(Modifier.INSTANCE, ftuxState, fxSwitcherFtuxAnimationConstants, ftuxState.getIsPositionsStep() || ftuxState.getIsEndStep());
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFxSwitcherFtuxDashboard$highlight2);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
                                Column6 column62 = Column6.INSTANCE;
                                ReorderablePositionsList.Ready.FixedOrder fixedOrder = (ReorderablePositionsList.Ready.FixedOrder) reorderablePositionsListCreateStaticEquityPositions;
                                UIComponent<AccountPositionAction> header = fixedOrder.getHeader();
                                composerStartRestartGroup.startReplaceGroup(1251408335);
                                if (header != null) {
                                    SduiComponent3.SduiComponent(header, null, HorizontalPadding.Default, composerStartRestartGroup, 384, 2);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                ImmutableList<DisplayPositionListItem> displayPositionListItems = fixedOrder.getDisplayPositionListItems();
                                composerStartRestartGroup.startReplaceGroup(1251419483);
                                Iterator<DisplayPositionListItem> it = displayPositionListItems.iterator();
                                while (it.hasNext()) {
                                    NavigatingPositionListItem.NavigatingPositionListItem(it.next(), null, null, null, null, null, composerStartRestartGroup, DisplayPositionListItem.$stable, 62);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                booleanRef = booleanRef3;
                                booleanRef.element = true;
                                composerStartRestartGroup.endNode();
                            } else {
                                booleanRef = booleanRef3;
                            }
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        booleanRef3 = booleanRef;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    EffectsKt.LaunchedEffect(currentStep, new C137603(currentStep, scrollStateRememberScrollState, fxSwitcherFtuxAnimationConstants, booleanRef3, null), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    function04 = function05;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDashboardKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return FxSwitcherFtuxDashboard.FxSwitcherFtuxDashboard$lambda$8(accountNumber, dashboardState, ftuxState, z, modifier2, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            function02 = function0;
            if ((74899 & i3) == 74898) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                FxSwitcherFtuxAnimationConstants fxSwitcherFtuxAnimationConstants2 = FxSwitcherFtuxAnimationConstants.INSTANCE;
                ImmutableList<DashboardComponent> components2 = dashboardState.getComponents();
                FxSwitcherFtuxState.Step currentStep2 = ftuxState.getCurrentStep();
                Ref.BooleanRef booleanRef22 = new Ref.BooleanRef();
                ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), scrollStateRememberScrollState2, false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                int i72 = i3;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion3.getSetModifier());
                    Column6 column63 = Column6.INSTANCE;
                    Modifier modifierM5145paddingqDBjuR02 = PaddingKt.m5145paddingqDBjuR0(Modifier.INSTANCE, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM(), C2002Dp.m7995constructorimpl(36), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM());
                    DisplayCurrencySwitcherLocation displayCurrencySwitcherLocation2 = DisplayCurrencySwitcherLocation.HOME_TAB;
                    boolean isFxSwitcherStep2 = ftuxState.getIsFxSwitcherStep();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i72 & 458752) != 131072) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDashboardKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FxSwitcherFtuxDashboard.FxSwitcherFtuxDashboard$lambda$7$lambda$3$lambda$2(function03);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        Function0<Unit> function052 = function03;
                        Ref.BooleanRef booleanRef32 = booleanRef22;
                        DisplayCurrencySwitcher.DisplayCurrencySwitcher(accountNumber, displayCurrencySwitcherLocation2, modifierM5145paddingqDBjuR02, null, isFxSwitcherStep2, false, z, null, (Function0) objRememberedValue, composerStartRestartGroup, (i72 & 14) | 196656 | ((i72 << 9) & 3670016), 136);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.startReplaceGroup(-1692874438);
                        while (r0.hasNext()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        EffectsKt.LaunchedEffect(currentStep2, new C137603(currentStep2, scrollStateRememberScrollState2, fxSwitcherFtuxAnimationConstants2, booleanRef32, null), composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier3;
                        function04 = function052;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final Modifier FxSwitcherFtuxDashboard$highlight(Modifier modifier, final FxSwitcherFtuxState.Data data, final FxSwitcherFtuxAnimationConstants fxSwitcherFtuxAnimationConstants, final boolean z) {
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDashboardKt$FxSwitcherFtuxDashboard$highlight$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(1140994889);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1140994889, i, -1, "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDashboard.highlight.<anonymous> (FxSwitcherFtuxDashboard.kt:51)");
                }
                float f = (z || data.getIsEndStep()) ? 1.0f : 0.1f;
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = Animatable2.Animatable$default(1.0f, 0.0f, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                Animatable animatable = (Animatable) objRememberedValue;
                composer.endReplaceGroup();
                Float fValueOf = Float.valueOf(f);
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(animatable) | composer.changed(f) | composer.changedInstance(fxSwitcherFtuxAnimationConstants);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new FxSwitcherFtuxDashboard3(animatable, f, null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(fValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 0);
                Modifier modifierAlpha = Alpha.alpha(composed, ((Number) animatable.getValue()).floatValue());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierAlpha;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FxSwitcherFtuxDashboard$lambda$7$lambda$3$lambda$2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* compiled from: FxSwitcherFtuxDashboard.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDashboardKt$FxSwitcherFtuxDashboard$3", m3645f = "FxSwitcherFtuxDashboard.kt", m3646l = {147, 150, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtuxDashboardKt$FxSwitcherFtuxDashboard$3 */
    static final class C137603 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FxSwitcherFtuxAnimationConstants $animationConstants;
        final /* synthetic */ FxSwitcherFtuxState.Step $currentStep;
        final /* synthetic */ Ref.BooleanRef $hasPositions;
        final /* synthetic */ ScrollState $scrollState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C137603(FxSwitcherFtuxState.Step step, ScrollState scrollState, FxSwitcherFtuxAnimationConstants fxSwitcherFtuxAnimationConstants, Ref.BooleanRef booleanRef, Continuation<? super C137603> continuation) {
            super(2, continuation);
            this.$currentStep = step;
            this.$scrollState = scrollState;
            this.$animationConstants = fxSwitcherFtuxAnimationConstants;
            this.$hasPositions = booleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C137603(this.$currentStep, this.$scrollState, this.$animationConstants, this.$hasPositions, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C137603) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        
            if (r13.scrollTo(0, r12) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
        
            if (r13.animateScrollTo(0, r1, r12) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
        
            if (r13.animateScrollTo(r1, r3, r12) == r0) goto L34;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FxSwitcherFtuxState.Step step = this.$currentStep;
                if ((step instanceof FxSwitcherFtuxState.Step.BigNumber) || (step instanceof FxSwitcherFtuxState.Step.End)) {
                    Unit unit = Unit.INSTANCE;
                } else {
                    if (step instanceof FxSwitcherFtuxState.Step.FxSwitcher) {
                        ScrollState scrollState = this.$scrollState;
                        this.label = 1;
                    } else if (step instanceof FxSwitcherFtuxState.Step.Chart) {
                        ScrollState scrollState2 = this.$scrollState;
                        BezierControlPoints decelCurveSpec = this.$animationConstants.getDecelCurveSpec();
                        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(600, 0, new CubicBezierEasing(decelCurveSpec.getA(), decelCurveSpec.getB(), decelCurveSpec.getC(), decelCurveSpec.getD()), 2, null);
                        this.label = 2;
                    } else {
                        if (!(step instanceof FxSwitcherFtuxState.Step.Positions)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (this.$hasPositions.element) {
                            ScrollState scrollState3 = this.$scrollState;
                            int maxValue = scrollState3.getMaxValue();
                            BezierControlPoints decelCurveSpec2 = this.$animationConstants.getDecelCurveSpec();
                            TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(600, 0, new CubicBezierEasing(decelCurveSpec2.getA(), decelCurveSpec2.getB(), decelCurveSpec2.getC(), decelCurveSpec2.getD()), 2, null);
                            this.label = 3;
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                Unit unit3 = Unit.INSTANCE;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Unit unit22 = Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }
}
