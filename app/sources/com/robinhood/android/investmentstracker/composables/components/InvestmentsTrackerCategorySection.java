package com.robinhood.android.investmentstracker.composables.components;

import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.Divider5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import bff_money_movement.service.p019v1.InvestmentsTrackerActionDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerCategorySectionRowDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerDisconnectedDataDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.feature.margin.hub.sdui.SduiMarginStatusCardContent2;
import com.robinhood.android.investmentstracker.C19501R;
import com.robinhood.android.investmentstracker.Configurations;
import com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction;
import com.robinhood.android.investmentstracker.security.SecurityFilter;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerCategorySectionViewModel;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: InvestmentsTrackerCategorySection.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00052\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a[\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00102\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00052\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0011\"\u0015\u0010\u0012\u001a\u00020\u0013*\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"InvestmentsTrackerCategorySection", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerCategorySectionViewModel;", "actionHandler", "Lkotlin/Function2;", "Lbff_money_movement/service/v1/InvestmentsTrackerActionDto;", "", "nativeActionHandler", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerNativeAction;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerCategorySectionViewModel;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", EquityOrderFormRowState2.AccountRowTestTag, "securityFilter", "Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto;", "(Lcom/robinhood/android/investmentstracker/security/SecurityFilter;Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetailsDto;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "percentageColor", "Landroidx/compose/ui/graphics/Color;", "Ljava/math/BigDecimal;", "getPercentageColor", "(Ljava/math/BigDecimal;Landroidx/compose/runtime/Composer;I)J", "percentageIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getPercentageIcon", "(Ljava/math/BigDecimal;)Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "feature-investments-tracker_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerCategorySection {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountRow$lambda$25(SecurityFilter securityFilter, InvestmentsTrackerCategorySectionRowDetailsDto investmentsTrackerCategorySectionRowDetailsDto, Function2 function2, Function2 function22, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountRow(securityFilter, investmentsTrackerCategorySectionRowDetailsDto, function2, function22, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerCategorySection$lambda$11(InvestmentsTrackerCategorySectionViewModel investmentsTrackerCategorySectionViewModel, Function2 function2, Function2 function22, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestmentsTrackerCategorySection(investmentsTrackerCategorySectionViewModel, function2, function22, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05f9 A[LOOP:0: B:158:0x05f7->B:159:0x05f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestmentsTrackerCategorySection(final InvestmentsTrackerCategorySectionViewModel item, final Function2<? super InvestmentsTrackerActionDto, Object, Unit> actionHandler, final Function2<? super InvestmentsTrackerNativeAction, Object, Unit> nativeActionHandler, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zChangedInstance;
        Object objRememberedValue;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        int currentCompositeKeyHash5;
        Composer composerM6388constructorimpl5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5;
        int currentCompositeKeyHash6;
        Composer composerM6388constructorimpl6;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6;
        BigDecimal bigDecimalOrNull;
        int i4;
        int displayLimit;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(nativeActionHandler, "nativeActionHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1135215140);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(item) ? 4 : 2) | i;
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
            i3 |= composerStartRestartGroup.changedInstance(nativeActionHandler) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1135215140, i3, -1, "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySection (InvestmentsTrackerCategorySection.kt:40)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM());
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(item);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestmentsTrackerCategorySection.m2129x3d51adf8(nativeActionHandler, item);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion3, true, null, null, (Function0) objRememberedValue, 6, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor4);
                }
                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                Function0<ComposeUiNode> constructor5 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor5);
                }
                composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash5 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion2.getSetModifier());
                String header_text = item.getDetails().getHeader_text();
                TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM();
                FontWeight.Companion companion4 = FontWeight.INSTANCE;
                Modifier modifier5 = modifier4;
                int i7 = i3;
                int i8 = 1;
                BentoText2.m20747BentoText38GnDrw(header_text, null, null, null, companion4.getW700(), null, null, 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, 24576, 0, 8174);
                BentoIcon4.Size12 size12 = new BentoIcon4.Size12(item.getIcon());
                long jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU();
                Modifier modifierAlign = row6.align(companion3, companion.getCenterVertically());
                int i9 = BentoIcon4.Size12.$stable;
                BentoIcon2.m20644BentoIconFU0evQE(size12, SduiMarginStatusCardContent2.INLINE_CONTENT_ARROW_ID, jM21427getFg30d7_KjU, modifierAlign, null, false, composerStartRestartGroup, i9 | 48, 48);
                composerStartRestartGroup.endNode();
                BentoText2.m20747BentoText38GnDrw(item.getDetails().getHeader_subtitle(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, companion4.getW400(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composerStartRestartGroup, 24576, 0, 8170);
                composerStartRestartGroup.endNode();
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getEnd(), composerStartRestartGroup, 48);
                currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                Function0<ComposeUiNode> constructor6 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor6);
                }
                composerM6388constructorimpl6 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyColumnMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash6 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion2.getSetModifier());
                BentoText2.m20747BentoText38GnDrw(item.getSecurityFilter().getValueOrStars(item.getDetails().getAmount()), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, companion4.getW700(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 24576, 0, 8170);
                composerStartRestartGroup = composerStartRestartGroup;
                bigDecimalOrNull = item.getDetails().getPercentage().toBigDecimalOrNull();
                composerStartRestartGroup.startReplaceGroup(167147461);
                if (bigDecimalOrNull != null) {
                    i4 = 0;
                } else {
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash7 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                    Function0<ComposeUiNode> constructor7 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor7);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl7 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl7, measurePolicyRowMeasurePolicy3, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl7, currentCompositionLocalMap7, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        composerM6388constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                        composerM6388constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl7, modifierMaterializeModifier7, companion2.getSetModifier());
                    ServerToBentoAssetMapper2 percentageIcon = getPercentageIcon(bigDecimalOrNull);
                    composerStartRestartGroup.startReplaceGroup(1672155436);
                    if (percentageIcon != null) {
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(percentageIcon), SduiMarginStatusCardContent2.INLINE_CONTENT_ARROW_ID, getPercentageColor(bigDecimalOrNull, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(row6.align(companion3, companion.getCenterVertically()), 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, false, composerStartRestartGroup, i9 | 48, 48);
                        Unit unit = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    i4 = 0;
                    BentoText2.m20747BentoText38GnDrw(item.getSecurityFilter().getValueOrStars(Configurations.getInvestmentTrackerPercentFormat().format(item.getDetails().getPercentage().toBigDecimalOrThrow())), null, Color.m6701boximpl(getPercentageColor(bigDecimalOrNull, composerStartRestartGroup, 0)), null, companion4.getW400(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composerStartRestartGroup, 24576, 0, 8170);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    Unit unit2 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(1715511141);
                displayLimit = item.getDisplayLimit();
                while (i4 < displayLimit) {
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i10 = BentoTheme.$stable;
                    Divider5.m5851HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i10).m21590getDefaultD9Ej5fM(), 5, null), 0.0f, i8, null), C2002Dp.m7995constructorimpl(i8), bentoTheme2.getColors(composerStartRestartGroup, i10).m21373getBg30d7_KjU(), composerStartRestartGroup, 48, 0);
                    AccountRow(item.getSecurityFilter(), item.getDetails().getRows().get(i4), actionHandler, nativeActionHandler, null, composerStartRestartGroup, (i7 << 3) & 8064, 16);
                    i4++;
                    i8 = i8;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestmentsTrackerCategorySection.InvestmentsTrackerCategorySection$lambda$11(item, actionHandler, nativeActionHandler, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(modifier4, bentoTheme3.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM());
            Alignment.Companion companion6 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor8 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap8, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier8, companion22.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion6.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy4, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(item);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InvestmentsTrackerCategorySection.m2129x3d51adf8(nativeActionHandler, item);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(companion32, true, null, null, (Function0) objRememberedValue, 6, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy4 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion6.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default2);
                        Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy4, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            Modifier modifierWeight$default2 = Row5.weight$default(row62, companion32, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion6.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                            Function0<ComposeUiNode> constructor42 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash4 = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl4.getInserting()) {
                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion22.getSetModifier());
                                MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion6.getTop(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap52 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier52 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                                Function0<ComposeUiNode> constructor52 = companion22.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap52, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash5 = companion22.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl5.getInserting()) {
                                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier52, companion22.getSetModifier());
                                    String header_text2 = item.getDetails().getHeader_text();
                                    TextStyle textM2 = bentoTheme3.getTypography(composerStartRestartGroup, i62).getTextM();
                                    FontWeight.Companion companion42 = FontWeight.INSTANCE;
                                    Modifier modifier52 = modifier4;
                                    int i72 = i3;
                                    int i82 = 1;
                                    BentoText2.m20747BentoText38GnDrw(header_text2, null, null, null, companion42.getW700(), null, null, 0, false, 0, 0, null, 0, textM2, composerStartRestartGroup, 24576, 0, 8174);
                                    BentoIcon4.Size12 size122 = new BentoIcon4.Size12(item.getIcon());
                                    long jM21427getFg30d7_KjU2 = bentoTheme3.getColors(composerStartRestartGroup, i62).m21427getFg30d7_KjU();
                                    Modifier modifierAlign2 = row62.align(companion32, companion6.getCenterVertically());
                                    int i92 = BentoIcon4.Size12.$stable;
                                    BentoIcon2.m20644BentoIconFU0evQE(size122, SduiMarginStatusCardContent2.INLINE_CONTENT_ARROW_ID, jM21427getFg30d7_KjU2, modifierAlign2, null, false, composerStartRestartGroup, i92 | 48, 48);
                                    composerStartRestartGroup.endNode();
                                    BentoText2.m20747BentoText38GnDrw(item.getDetails().getHeader_subtitle(), null, Color.m6701boximpl(bentoTheme3.getColors(composerStartRestartGroup, i62).m21426getFg20d7_KjU()), null, companion42.getW400(), null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i62).getTextS(), composerStartRestartGroup, 24576, 0, 8170);
                                    composerStartRestartGroup.endNode();
                                    MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion6.getEnd(), composerStartRestartGroup, 48);
                                    currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap62 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier62 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                                    Function0<ComposeUiNode> constructor62 = companion22.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl6 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyColumnMeasurePolicy32, companion22.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap62, companion22.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash6 = companion22.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl6.getInserting()) {
                                        composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                        composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                        Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier62, companion22.getSetModifier());
                                        BentoText2.m20747BentoText38GnDrw(item.getSecurityFilter().getValueOrStars(item.getDetails().getAmount()), null, Color.m6701boximpl(bentoTheme3.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU()), null, companion42.getW700(), null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i62).getTextM(), composerStartRestartGroup, 24576, 0, 8170);
                                        composerStartRestartGroup = composerStartRestartGroup;
                                        bigDecimalOrNull = item.getDetails().getPercentage().toBigDecimalOrNull();
                                        composerStartRestartGroup.startReplaceGroup(167147461);
                                        if (bigDecimalOrNull != null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endNode();
                                        composerStartRestartGroup.endNode();
                                        composerStartRestartGroup.startReplaceGroup(1715511141);
                                        displayLimit = item.getDisplayLimit();
                                        while (i4 < displayLimit) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endNode();
                                        composerStartRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier3 = modifier52;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InvestmentsTrackerCategorySection$lambda$10$lambda$9$lambda$1$lambda$0 */
    public static final Unit m2129x3d51adf8(Function2 function2, InvestmentsTrackerCategorySectionViewModel investmentsTrackerCategorySectionViewModel) {
        function2.invoke(InvestmentsTrackerNativeAction.CATEGORY_CLICKED, investmentsTrackerCategorySectionViewModel);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountRow(final SecurityFilter securityFilter, final InvestmentsTrackerCategorySectionRowDetailsDto item, final Function2<? super InvestmentsTrackerActionDto, Object, Unit> actionHandler, final Function2<? super InvestmentsTrackerNativeAction, Object, Unit> nativeActionHandler, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Object objRememberedValue2;
        Composer.Companion companion;
        final Measurer2 measurer2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        final SnapshotState snapshotState;
        Object objRememberedValue5;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue6;
        SnapshotState snapshotState2;
        boolean zChangedInstance2;
        Object objRememberedValue7;
        final SnapshotState snapshotState3;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl2;
        final SnapshotState snapshotState4;
        Object objRememberedValue8;
        boolean zChangedInstance3;
        Object objRememberedValue9;
        Row6 row6;
        InvestmentsTrackerDisconnectedDataDto disconnected_data;
        int i4;
        Color composeColor;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        BigDecimal bigDecimalOrNull;
        BigDecimal bigDecimal;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final SecurityFilter securityFilter2 = securityFilter;
        Intrinsics.checkNotNullParameter(securityFilter2, "securityFilter");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(nativeActionHandler, "nativeActionHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(1322383695);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(securityFilter2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(item) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(actionHandler) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(nativeActionHandler) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1322383695, i3, -1, "com.robinhood.android.investmentstracker.composables.components.AccountRow (InvestmentsTrackerCategorySection.kt:140)");
                }
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(item) | ((i3 & 7168) != 2048) | ((i3 & 896) != 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InvestmentsTrackerCategorySection.AccountRow$lambda$13$lambda$12(item, nativeActionHandler, actionHandler);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue, 7, null);
                Modifier modifier5 = modifier4;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Horizontal start = arrangement.getStart();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                String icon = item.getIcon();
                String logo_url = item.getLogo_url();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                InvestmentsTrackerLogoIconFallback.InvestmentsTrackerLogoIconFallback(row62.align(companion4, companion2.getCenterVertically()), icon, logo_url, composerStartRestartGroup, 0, 0);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(row62.align(Row5.weight$default(row62, companion4, 2.0f, false, 2, null), companion2.getCenterVertically()), 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 11, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1003410150);
                composerStartRestartGroup.startReplaceGroup(212064437);
                composerStartRestartGroup.endReplaceGroup();
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Measurer2(density);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                measurer2 = (Measurer2) objRememberedValue2;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new ConstraintLayoutScope();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                snapshotState = (SnapshotState) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue5;
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                snapshotState2 = (SnapshotState) objRememberedValue6;
                zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2) | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                    snapshotState3 = snapshotState2;
                    final int i7 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                    objRememberedValue7 = new MeasurePolicy() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt$AccountRow$lambda$24$lambda$19$$inlined$ConstraintLayout$2
                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i8);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i8);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i8);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i8);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                            snapshotState3.getValue();
                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i7);
                            snapshotState.getValue();
                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                            final Measurer2 measurer22 = measurer2;
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt$AccountRow$lambda$24$lambda$19$$inlined$ConstraintLayout$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                    measurer22.performLayout(placementScope, list, linkedHashMap);
                                }
                            }, 4, null);
                        }
                    };
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState4 = snapshotState;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                } else {
                    snapshotState3 = snapshotState2;
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState4 = snapshotState;
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue7;
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function0<Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt$AccountRow$lambda$24$lambda$19$$inlined$ConstraintLayout$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            snapshotState4.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                            constraintSetForInlineDsl2.setKnownDirty(true);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                final Function0 function0 = (Function0) objRememberedValue8;
                zChangedInstance3 = composerStartRestartGroup.changedInstance(measurer2);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt$AccountRow$lambda$24$lambda$19$$inlined$ConstraintLayout$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierFillMaxWidth$default2, false, (Function1) objRememberedValue9, 1, null);
                final SnapshotState snapshotState5 = snapshotState3;
                Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt$AccountRow$lambda$24$lambda$19$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i8) throws Resources.NotFoundException {
                        if ((i8 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1200550679, i8, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            snapshotState5.setValue(Unit.INSTANCE);
                            int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                            constraintLayoutScope.reset();
                            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                            composer3.startReplaceGroup(-65511546);
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                            String title = item.getTitle();
                            if (title.length() == 0) {
                                title = item.getConnect_text();
                            }
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            TextStyle textM = bentoTheme2.getTypography(composer3, i9).getTextM();
                            long jM21425getFg0d7_KjU = bentoTheme2.getColors(composer3, i9).m21425getFg0d7_KjU();
                            TextOverflow.Companion companion5 = TextOverflow.INSTANCE;
                            int iM7959getEllipsisgIe3tQ8 = companion5.m7959getEllipsisgIe3tQ8();
                            FontWeight.Companion companion6 = FontWeight.INSTANCE;
                            String str = title;
                            FontWeight w400 = companion6.getW400();
                            Modifier.Companion companion7 = Modifier.INSTANCE;
                            composer3.startReplaceGroup(1849434622);
                            Object objRememberedValue10 = composer3.rememberedValue();
                            Composer.Companion companion8 = Composer.INSTANCE;
                            if (objRememberedValue10 == companion8.getEmpty()) {
                                objRememberedValue10 = InvestmentsTrackerCategorySection2.INSTANCE;
                                composer3.updateRememberedValue(objRememberedValue10);
                            }
                            composer3.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope2.constrainAs(companion7, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10), 0.0f, 0.0f, bentoTheme2.getSpacing(composer3, i9).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, w400, null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, textM, composer3, 817913856, 0, 7528);
                            composer3.startReplaceGroup(829193595);
                            if (item.getAccount_last_four().length() > 0) {
                                composer3.startReplaceGroup(5004770);
                                boolean zChanged = composer3.changed(constraintLayoutBaseScope4Component1);
                                Object objRememberedValue11 = composer3.rememberedValue();
                                if (zChanged || objRememberedValue11 == companion8.getEmpty()) {
                                    objRememberedValue11 = new InvestmentsTrackerCategorySection3(constraintLayoutBaseScope4Component1);
                                    composer3.updateRememberedValue(objRememberedValue11);
                                }
                                composer3.endReplaceGroup();
                                Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion7, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue11);
                                String strStringResource = StringResources_androidKt.stringResource(C19501R.string.last_four_string, new Object[]{securityFilter.getValueOrStars(item.getAccount_last_four())}, composer3, 0);
                                FontWeight w4002 = companion6.getW400();
                                TextStyle textM2 = bentoTheme2.getTypography(composer3, i9).getTextM();
                                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer3, i9).m21425getFg0d7_KjU();
                                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierConstrainAs, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, w4002, null, null, companion5.m7960getMiddleEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM2, composer3, 817913856, 0, 7528);
                            }
                            composer3.endReplaceGroup();
                            composer3.endReplaceGroup();
                            if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                EffectsKt.SideEffect(function0, composer3, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                };
                securityFilter2 = securityFilter;
                LayoutKt.MultiMeasureLayout(modifierSemantics$default, ComposableLambda3.rememberComposableLambda(1200550679, true, function2, composerStartRestartGroup, 54), measurePolicy, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-851712711);
                if (item.getSubtitle().length() <= 0) {
                    row6 = row62;
                    BentoText2.m20747BentoText38GnDrw(item.getSubtitle(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, FontWeight.INSTANCE.getW400(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composerStartRestartGroup, 24576, 0, 8170);
                    composerStartRestartGroup = composerStartRestartGroup;
                } else {
                    row6 = row62;
                }
                composerStartRestartGroup.endReplaceGroup();
                disconnected_data = item.getDisconnected_data();
                composerStartRestartGroup.startReplaceGroup(-851702041);
                if (disconnected_data != null) {
                    i4 = 0;
                } else {
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                    String display_text = disconnected_data.getDisplay_text();
                    TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM();
                    FontWeight w400 = FontWeight.INSTANCE.getW400();
                    InvestmentsTrackerDisconnectedDataDto disconnected_data2 = item.getDisconnected_data();
                    ThemedColorDto color = disconnected_data2 != null ? disconnected_data2.getColor() : null;
                    composerStartRestartGroup.startReplaceGroup(-851690939);
                    if (color == null) {
                        composeColor = null;
                        i4 = 0;
                    } else {
                        i4 = 0;
                        composeColor = SduiColors2.toComposeColor(color, composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-851691875);
                    long jM21426getFg20d7_KjU = composeColor == null ? bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU() : composeColor.getValue();
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer3 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(display_text, modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(jM21426getFg20d7_KjU), null, w400, null, null, 0, false, 0, 0, null, 0, textM, composer3, 24576, 0, 8168);
                    composerStartRestartGroup = composer3;
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                Alignment.Horizontal end = companion2.getEnd();
                Modifier modifierWeight$default = Row5.weight$default(row6, companion4, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), end, composerStartRestartGroup, 48);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                String valueOrStars = securityFilter2.getValueOrStars(item.getAmount());
                TextStyle textM2 = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU();
                FontWeight.Companion companion5 = FontWeight.INSTANCE;
                Composer composer4 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(valueOrStars, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, companion5.getW400(), null, null, 0, false, 0, 0, null, 0, textM2, composer4, 24576, 0, 8170);
                Composer composer5 = composer4;
                bigDecimalOrNull = item.getPercentage().toBigDecimalOrNull();
                composer5.startReplaceGroup(570355636);
                if (bigDecimalOrNull != null) {
                    composer2 = composer5;
                } else {
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer5, i4);
                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer5, i4);
                    CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer5, companion4);
                    Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                    if (composer5.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor4);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer5);
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                    ServerToBentoAssetMapper2 percentageIcon = getPercentageIcon(bigDecimalOrNull);
                    composer5.startReplaceGroup(-1819069485);
                    if (percentageIcon == null) {
                        bigDecimal = bigDecimalOrNull;
                    } else {
                        bigDecimal = bigDecimalOrNull;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(percentageIcon), SduiMarginStatusCardContent2.INLINE_CONTENT_ARROW_ID, getPercentageColor(bigDecimalOrNull, composer5, 0), PaddingKt.m5146paddingqDBjuR0$default(row6.align(companion4, companion2.getCenterVertically()), 0.0f, 0.0f, bentoTheme.getSpacing(composer5, i6).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, false, composer5, BentoIcon4.Size12.$stable | 48, 48);
                        composer5 = composer5;
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composer5.endReplaceGroup();
                    composer2 = composer5;
                    BentoText2.m20747BentoText38GnDrw(securityFilter2.getValueOrStars(Configurations.getInvestmentTrackerPercentFormat().format(bigDecimal)), null, Color.m6701boximpl(getPercentageColor(bigDecimal, composer5, 0)), null, companion5.getW400(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer5, i6).getTextS(), composer2, 24576, 0, 8170);
                    composer2.endNode();
                    Unit unit3 = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InvestmentsTrackerCategorySection.AccountRow$lambda$25(securityFilter2, item, actionHandler, nativeActionHandler, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = composerStartRestartGroup.changedInstance(item) | ((i3 & 7168) != 2048) | ((i3 & 896) != 256);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InvestmentsTrackerCategorySection.AccountRow$lambda$13$lambda$12(item, nativeActionHandler, actionHandler);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue, 7, null);
                Modifier modifier52 = modifier4;
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Horizontal start2 = arrangement2.getStart();
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(start2, companion22.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor5 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion32.getSetModifier());
                    Row6 row622 = Row6.INSTANCE;
                    String icon2 = item.getIcon();
                    String logo_url2 = item.getLogo_url();
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    InvestmentsTrackerLogoIconFallback.InvestmentsTrackerLogoIconFallback(row622.align(companion42, companion22.getCenterVertically()), icon2, logo_url2, composerStartRestartGroup, 0, 0);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(row622.align(Row5.weight$default(row622, companion42, 2.0f, false, 2, null), companion22.getCenterVertically()), 0.0f, 1, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default3, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 0.0f, 11, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default3);
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(-1003410150);
                        composerStartRestartGroup.startReplaceGroup(212064437);
                        composerStartRestartGroup.endReplaceGroup();
                        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        measurer2 = (Measurer2) objRememberedValue2;
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue3;
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue4;
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                        }
                        constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue5;
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                        }
                        snapshotState2 = (SnapshotState) objRememberedValue6;
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2) | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2) {
                            snapshotState3 = snapshotState2;
                            final int i72 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                            objRememberedValue7 = new MeasurePolicy() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt$AccountRow$lambda$24$lambda$19$$inlined$ConstraintLayout$2
                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.minIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.minIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                                    final Map linkedHashMap = new LinkedHashMap();
                                    snapshotState3.getValue();
                                    long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i72);
                                    snapshotState.getValue();
                                    int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                    int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                    final Measurer2 measurer22 = measurer2;
                                    return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt$AccountRow$lambda$24$lambda$19$$inlined$ConstraintLayout$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                            measurer22.performLayout(placementScope, list, linkedHashMap);
                                        }
                                    }, 4, null);
                                }
                            };
                            constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                            snapshotState4 = snapshotState;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue7;
                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue8 == companion.getEmpty()) {
                            }
                            final Function0 function02 = (Function0) objRememberedValue8;
                            zChangedInstance3 = composerStartRestartGroup.changedInstance(measurer2);
                            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance3) {
                                objRememberedValue9 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt$AccountRow$lambda$24$lambda$19$$inlined$ConstraintLayout$4
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifierFillMaxWidth$default22, false, (Function1) objRememberedValue9, 1, null);
                                final SnapshotState snapshotState52 = snapshotState3;
                                Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySectionKt$AccountRow$lambda$24$lambda$19$$inlined$ConstraintLayout$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer32, Integer num) throws Resources.NotFoundException {
                                        invoke(composer32, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer32, int i8) throws Resources.NotFoundException {
                                        if ((i8 & 3) != 2 || !composer32.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1200550679, i8, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                            }
                                            snapshotState52.setValue(Unit.INSTANCE);
                                            int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                                            constraintLayoutScope2.reset();
                                            ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                                            composer32.startReplaceGroup(-65511546);
                                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                            String title = item.getTitle();
                                            if (title.length() == 0) {
                                                title = item.getConnect_text();
                                            }
                                            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                            int i9 = BentoTheme.$stable;
                                            TextStyle textM3 = bentoTheme22.getTypography(composer32, i9).getTextM();
                                            long jM21425getFg0d7_KjU2 = bentoTheme22.getColors(composer32, i9).m21425getFg0d7_KjU();
                                            TextOverflow.Companion companion52 = TextOverflow.INSTANCE;
                                            int iM7959getEllipsisgIe3tQ8 = companion52.m7959getEllipsisgIe3tQ8();
                                            FontWeight.Companion companion6 = FontWeight.INSTANCE;
                                            String str = title;
                                            FontWeight w4002 = companion6.getW400();
                                            Modifier.Companion companion7 = Modifier.INSTANCE;
                                            composer32.startReplaceGroup(1849434622);
                                            Object objRememberedValue10 = composer32.rememberedValue();
                                            Composer.Companion companion8 = Composer.INSTANCE;
                                            if (objRememberedValue10 == companion8.getEmpty()) {
                                                objRememberedValue10 = InvestmentsTrackerCategorySection2.INSTANCE;
                                                composer32.updateRememberedValue(objRememberedValue10);
                                            }
                                            composer32.endReplaceGroup();
                                            BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope22.constrainAs(companion7, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue10), 0.0f, 0.0f, bentoTheme22.getSpacing(composer32, i9).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), Color.m6701boximpl(jM21425getFg0d7_KjU2), null, w4002, null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, textM3, composer32, 817913856, 0, 7528);
                                            composer32.startReplaceGroup(829193595);
                                            if (item.getAccount_last_four().length() > 0) {
                                                composer32.startReplaceGroup(5004770);
                                                boolean zChanged = composer32.changed(constraintLayoutBaseScope4Component1);
                                                Object objRememberedValue11 = composer32.rememberedValue();
                                                if (zChanged || objRememberedValue11 == companion8.getEmpty()) {
                                                    objRememberedValue11 = new InvestmentsTrackerCategorySection3(constraintLayoutBaseScope4Component1);
                                                    composer32.updateRememberedValue(objRememberedValue11);
                                                }
                                                composer32.endReplaceGroup();
                                                Modifier modifierConstrainAs = constraintLayoutScope22.constrainAs(companion7, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue11);
                                                String strStringResource = StringResources_androidKt.stringResource(C19501R.string.last_four_string, new Object[]{securityFilter.getValueOrStars(item.getAccount_last_four())}, composer32, 0);
                                                FontWeight w40022 = companion6.getW400();
                                                TextStyle textM22 = bentoTheme22.getTypography(composer32, i9).getTextM();
                                                long jM21425getFg0d7_KjU22 = bentoTheme22.getColors(composer32, i9).m21425getFg0d7_KjU();
                                                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierConstrainAs, Color.m6701boximpl(jM21425getFg0d7_KjU22), null, w40022, null, null, companion52.m7960getMiddleEllipsisgIe3tQ8(), false, 1, 0, null, 0, textM22, composer32, 817913856, 0, 7528);
                                            }
                                            composer32.endReplaceGroup();
                                            composer32.endReplaceGroup();
                                            if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                                EffectsKt.SideEffect(function02, composer32, 6);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer32.skipToGroupEnd();
                                    }
                                };
                                securityFilter2 = securityFilter;
                                LayoutKt.MultiMeasureLayout(modifierSemantics$default2, ComposableLambda3.rememberComposableLambda(1200550679, true, function22, composerStartRestartGroup, 54), measurePolicy2, composerStartRestartGroup, 48, 0);
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-851712711);
                                if (item.getSubtitle().length() <= 0) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                disconnected_data = item.getDisconnected_data();
                                composerStartRestartGroup.startReplaceGroup(-851702041);
                                if (disconnected_data != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                Alignment.Horizontal end2 = companion22.getEnd();
                                Modifier modifierWeight$default2 = Row5.weight$default(row6, companion42, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), end2, composerStartRestartGroup, 48);
                                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                                CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                                Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl3.getInserting()) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                                    String valueOrStars2 = securityFilter2.getValueOrStars(item.getAmount());
                                    TextStyle textM22 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM();
                                    long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU();
                                    FontWeight.Companion companion52 = FontWeight.INSTANCE;
                                    Composer composer42 = composerStartRestartGroup;
                                    BentoText2.m20747BentoText38GnDrw(valueOrStars2, null, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, companion52.getW400(), null, null, 0, false, 0, 0, null, 0, textM22, composer42, 24576, 0, 8170);
                                    Composer composer52 = composer42;
                                    bigDecimalOrNull = item.getPercentage().toBigDecimalOrNull();
                                    composer52.startReplaceGroup(570355636);
                                    if (bigDecimalOrNull != null) {
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier52;
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountRow$lambda$13$lambda$12(InvestmentsTrackerCategorySectionRowDetailsDto investmentsTrackerCategorySectionRowDetailsDto, Function2 function2, Function2 function22) {
        String institution_id;
        InvestmentsTrackerDisconnectedDataDto disconnected_data = investmentsTrackerCategorySectionRowDetailsDto.getDisconnected_data();
        if ((disconnected_data != null ? disconnected_data.getInstitution_id() : null) != null) {
            InvestmentsTrackerNativeAction investmentsTrackerNativeAction = InvestmentsTrackerNativeAction.ACCOUNT_CELL_RECONNECT_SELECTED;
            InvestmentsTrackerDisconnectedDataDto disconnected_data2 = investmentsTrackerCategorySectionRowDetailsDto.getDisconnected_data();
            if (disconnected_data2 == null || (institution_id = disconnected_data2.getInstitution_id()) == null) {
                institution_id = "";
            }
            function2.invoke(investmentsTrackerNativeAction, institution_id);
        } else {
            function22.invoke(investmentsTrackerCategorySectionRowDetailsDto.getAction(), investmentsTrackerCategorySectionRowDetailsDto);
        }
        return Unit.INSTANCE;
    }

    @JvmName
    public static final long getPercentageColor(BigDecimal bigDecimal, Composer composer, int i) {
        long jM21426getFg20d7_KjU;
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        composer.startReplaceGroup(554341034);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(554341034, i, -1, "com.robinhood.android.investmentstracker.composables.components.<get-percentageColor> (InvestmentsTrackerCategorySection.kt:260)");
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) > 0) {
            composer.startReplaceGroup(224543662);
            jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
            composer.endReplaceGroup();
        } else if (bigDecimal.compareTo(bigDecimal2) < 0) {
            composer.startReplaceGroup(224619054);
            jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(224666515);
            jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21426getFg20d7_KjU;
    }

    public static final ServerToBentoAssetMapper2 getPercentageIcon(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) > 0) {
            return ServerToBentoAssetMapper2.STOCK_UP_12;
        }
        if (bigDecimal.compareTo(bigDecimal2) < 0) {
            return ServerToBentoAssetMapper2.STOCK_DOWN_12;
        }
        return null;
    }
}
