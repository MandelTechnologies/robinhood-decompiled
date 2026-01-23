package com.robinhood.android.gold.hub.boost;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.gold.lib.hub.api.ApiGoldSweepHub;
import com.robinhood.android.gold.lib.hub.api.ApiSweepHubRowData;
import com.robinhood.android.gold.lib.hub.api.GoldSegmentedControl;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButton2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoSegmentedControl2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.Segment;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldDepositBoostSweepHubComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aP\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"GoldDepositBoostSweepHubComposable", "", "viewState", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostSweepHubViewState;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "switchTab", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "newTabIndex", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostSweepHubViewState;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-gold-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.hub.boost.GoldDepositBoostSweepHubComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldDepositBoostSweepHubComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldDepositBoostSweepHubComposable$lambda$9(GoldDepositBoostSweepHubViewState goldDepositBoostSweepHubViewState, SduiActionHandler sduiActionHandler, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldDepositBoostSweepHubComposable(goldDepositBoostSweepHubViewState, sduiActionHandler, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldDepositBoostSweepHubComposable(final GoldDepositBoostSweepHubViewState viewState, SduiActionHandler<? super GenericAction> actionHandler, final Function1<? super Integer, Unit> switchTab, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ApiGoldSweepHub sweepHubData;
        Modifier modifier3;
        SduiActionHandler<? super GenericAction> sduiActionHandler;
        final Modifier modifier4;
        List<GoldSegmentedControl> segmentedControl;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(switchTab, "switchTab");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1367474632);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionHandler) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(switchTab) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1367474632, i3, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostSweepHubComposable (GoldDepositBoostSweepHubComposable.kt:33)");
                }
                sweepHubData = viewState.getSweepHubData();
                if (sweepHubData == null) {
                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null));
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding);
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
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
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
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    int i6 = i3;
                    modifier3 = modifier5;
                    BentoText2.m20747BentoText38GnDrw(sweepHubData.getTitle(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoText2.m20747BentoText38GnDrw(sweepHubData.getAmount(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8186);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.startReplaceGroup(-241341439);
                    if (viewState.getShowSegmentedControl() && (segmentedControl = sweepHubData.getSegmentedControl()) != null) {
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                        List<GoldSegmentedControl> list = segmentedControl;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new Segment(null, ((GoldSegmentedControl) it.next()).getTitle(), null, 5, null));
                        }
                        BentoSegmentedControl2.BentoSegmentedControl(arrayList, viewState.getCurrentTab().getIndex(), switchTab, null, false, composerStartRestartGroup, i6 & 896, 24);
                        Unit unit = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    List<ApiSweepHubRowData> rowsToShow = viewState.getRowsToShow();
                    composerStartRestartGroup.startReplaceGroup(-241320292);
                    if (rowsToShow != null) {
                        for (ApiSweepHubRowData apiSweepHubRowData : rowsToShow) {
                            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) null, apiSweepHubRowData.getTitle(), apiSweepHubRowData.getSubtitle(), (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine(apiSweepHubRowData.getValue()), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, (DefaultConstructorMarker) null), false, false, true, 0L, null, composerStartRestartGroup, (BentoBaseRowState.$stable << 3) | 24576, 109);
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composerStartRestartGroup, 6, 1);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    String disclosureMarkdownToShow = viewState.getDisclosureMarkdownToShow();
                    composerStartRestartGroup.startReplaceGroup(-1094311502);
                    if (disclosureMarkdownToShow != null) {
                        BentoMarkdownText2.BentoMarkdownText(disclosureMarkdownToShow, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composerStartRestartGroup, i7).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme2.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU(), false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, MarkdownStyle.$stable << 6, 26);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    final Button<GenericAction> ctaToShow = viewState.getCtaToShow();
                    composerStartRestartGroup.startReplaceGroup(-1094291282);
                    if (ctaToShow == null) {
                        sduiActionHandler = actionHandler;
                    } else {
                        sduiActionHandler = actionHandler;
                        SduiActionHandler3.ProvideActionHandler(sduiActionHandler, ComposableLambda3.rememberComposableLambda(-868993576, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostSweepHubComposableKt$GoldDepositBoostSweepHubComposable$1$1$2$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i8) {
                                if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-868993576, i8, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostSweepHubComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GoldDepositBoostSweepHubComposable.kt:103)");
                                }
                                SduiButton2.SduiButton(ctaToShow, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 48, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 >> 3) & 14) | 48);
                        Unit unit4 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    Unit unit5 = Unit.INSTANCE;
                } else {
                    modifier3 = modifier5;
                    sduiActionHandler = actionHandler;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                sduiActionHandler = actionHandler;
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final SduiActionHandler<? super GenericAction> sduiActionHandler2 = sduiActionHandler;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostSweepHubComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldDepositBoostSweepHubComposable.GoldDepositBoostSweepHubComposable$lambda$9(viewState, sduiActionHandler2, switchTab, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            sweepHubData = viewState.getSweepHubData();
            if (sweepHubData == null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
