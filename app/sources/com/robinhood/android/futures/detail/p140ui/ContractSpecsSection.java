package com.robinhood.android.futures.detail.p140ui;

import android.content.Context;
import android.content.res.Resources;
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
import androidx.compose.material3.TooltipDefaults;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipScope;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.Tooltip_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.futures.detail.C17042R;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.futures.sharedfuturesui.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ContractSpecsSection.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a=\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"ContractSpecsSection", "", "contractSpecsData", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$ContractSpecsData;", "isFtuxContractSpecsEducationInProgress", "", "showScrimOnLeverage", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$ContractSpecsData;ZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ContractSpec", "Landroidx/compose/foundation/layout/RowScope;", AnnotatedPrivateKey.LABEL, "", "value", "tooltipContent", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "(Landroidx/compose/foundation/layout/RowScope;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoIcons;Landroidx/compose/runtime/Composer;II)V", "feature-futures-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.detail.ui.ContractSpecsSectionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ContractSpecsSection {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractSpec$lambda$7(Row5 row5, String str, String str2, String str3, Modifier modifier, BentoIcon4 bentoIcon4, int i, int i2, Composer composer, int i3) {
        ContractSpec(row5, str, str2, str3, modifier, bentoIcon4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractSpecsSection$lambda$5(FuturesDetailViewState.ContractSpecsData contractSpecsData, boolean z, boolean z2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContractSpecsSection(contractSpecsData, z, z2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x035b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContractSpecsSection(final FuturesDetailViewState.ContractSpecsData contractSpecsData, final boolean z, final boolean z2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        int currentCompositeKeyHash5;
        Composer composerM6388constructorimpl5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(contractSpecsData, "contractSpecsData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1283217712);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(contractSpecsData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
                }
                i4 = i2 & 8;
                if (i4 == 0) {
                    if ((i & 3072) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1283217712, i3, -1, "com.robinhood.android.futures.detail.ui.ContractSpecsSection (ContractSpecsSection.kt:42)");
                        }
                        Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                        String strStringResource = StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_header, composerStartRestartGroup, 0);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium();
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 2, null);
                        Modifier modifier5 = modifier4;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8188);
                        composerStartRestartGroup = composerStartRestartGroup;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        String strStringResource2 = StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_margin_required, composerStartRestartGroup, 0);
                        StringResource marginRequired = contractSpecsData.getMarginRequired();
                        Intrinsics.checkNotNull(resources);
                        ContractSpec(row6, strStringResource2, marginRequired.getText(resources).toString(), StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_margin_required_definition, composerStartRestartGroup, 0), null, null, composerStartRestartGroup, 6, 24);
                        ContractSpec(row6, StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_leverage, composerStartRestartGroup, 0), contractSpecsData.getLeverage().getText(resources).toString(), StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_leverage_definition, composerStartRestartGroup, 0), ModifiersKt.m14735scrimGUYwDQI$default(companion3, z4, null, null, 6, null), null, composerStartRestartGroup, 6, 16);
                        composerStartRestartGroup.endNode();
                        Modifier modifierM14735scrimGUYwDQI$default = ModifiersKt.m14735scrimGUYwDQI$default(companion3, z3, null, null, 6, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM14735scrimGUYwDQI$default);
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
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                        ContractSpec(row6, StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_tick_size, composerStartRestartGroup, 0), contractSpecsData.getTickSize().getText(resources).toString(), StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_tick_size_definition, composerStartRestartGroup, 0), null, null, composerStartRestartGroup, 6, 24);
                        ContractSpec(row6, StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_tick_value, composerStartRestartGroup, 0), contractSpecsData.getTickValue().getText(resources).toString(), StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_tick_value_definition, composerStartRestartGroup, 0), null, null, composerStartRestartGroup, 6, 24);
                        composerStartRestartGroup.endNode();
                        Modifier modifierM14735scrimGUYwDQI$default2 = ModifiersKt.m14735scrimGUYwDQI$default(companion3, z, null, null, 6, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM14735scrimGUYwDQI$default2);
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
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy3, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                        ContractSpec(row6, StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_multiplier, composerStartRestartGroup, 0), contractSpecsData.getMultiplier().getText(resources).toString(), StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_multiplier_definition, composerStartRestartGroup, 0), null, null, composerStartRestartGroup, 6, 24);
                        ContractSpec(row6, StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_delivery, composerStartRestartGroup, 0), contractSpecsData.getDelivery().getText(resources).toString(), contractSpecsData.getDeliveryDefinition().getText(resources).toString(), null, null, composerStartRestartGroup, 6, 24);
                        composerStartRestartGroup.endNode();
                        Modifier modifierM14735scrimGUYwDQI$default3 = ModifiersKt.m14735scrimGUYwDQI$default(companion3, z, null, null, 6, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy4 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM14735scrimGUYwDQI$default3);
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
                        Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy4, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash5 = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion2.getSetModifier());
                        ContractSpec(row6, StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_hours, composerStartRestartGroup, 0), contractSpecsData.getHours().getText(resources).toString(), contractSpecsData.getHoursDefinition().getText(resources).toString(), null, null, composerStartRestartGroup, 6, 24);
                        ContractSpec(row6, StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_last_trade, composerStartRestartGroup, 0), contractSpecsData.getLastTradeDate().getText(resources).toString(), StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_last_trade_definition, composerStartRestartGroup, 0), null, null, composerStartRestartGroup, 6, 24);
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
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.ContractSpecsSectionKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ContractSpecsSection.ContractSpecsSection$lambda$5(contractSpecsData, z, z2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                    Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap6, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier6, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        String strStringResource3 = StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_header, composerStartRestartGroup, 0);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i52 = BentoTheme.$stable;
                        TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium();
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 2, null);
                        Modifier modifier52 = modifier4;
                        BentoText2.m20747BentoText38GnDrw(strStringResource3, modifierM5146paddingqDBjuR0$default2, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 0, 0, 8188);
                        composerStartRestartGroup = composerStartRestartGroup;
                        MeasurePolicy measurePolicyRowMeasurePolicy5 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
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
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy5, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            String strStringResource22 = StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_margin_required, composerStartRestartGroup, 0);
                            StringResource marginRequired2 = contractSpecsData.getMarginRequired();
                            Intrinsics.checkNotNull(resources2);
                            ContractSpec(row62, strStringResource22, marginRequired2.getText(resources2).toString(), StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_margin_required_definition, composerStartRestartGroup, 0), null, null, composerStartRestartGroup, 6, 24);
                            ContractSpec(row62, StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_leverage, composerStartRestartGroup, 0), contractSpecsData.getLeverage().getText(resources2).toString(), StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_leverage_definition, composerStartRestartGroup, 0), ModifiersKt.m14735scrimGUYwDQI$default(companion32, z4, null, null, 6, null), null, composerStartRestartGroup, 6, 16);
                            composerStartRestartGroup.endNode();
                            Modifier modifierM14735scrimGUYwDQI$default4 = ModifiersKt.m14735scrimGUYwDQI$default(companion32, z3, null, null, 6, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM14735scrimGUYwDQI$default4);
                            Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl3.getInserting()) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                                ContractSpec(row62, StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_tick_size, composerStartRestartGroup, 0), contractSpecsData.getTickSize().getText(resources2).toString(), StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_tick_size_definition, composerStartRestartGroup, 0), null, null, composerStartRestartGroup, 6, 24);
                                ContractSpec(row62, StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_tick_value, composerStartRestartGroup, 0), contractSpecsData.getTickValue().getText(resources2).toString(), StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_tick_value_definition, composerStartRestartGroup, 0), null, null, composerStartRestartGroup, 6, 24);
                                composerStartRestartGroup.endNode();
                                Modifier modifierM14735scrimGUYwDQI$default22 = ModifiersKt.m14735scrimGUYwDQI$default(companion32, z, null, null, 6, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy32 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM14735scrimGUYwDQI$default22);
                                Function0<ComposeUiNode> constructor42 = companion22.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy32, companion22.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash4 = companion22.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl4.getInserting()) {
                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion22.getSetModifier());
                                    ContractSpec(row62, StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_multiplier, composerStartRestartGroup, 0), contractSpecsData.getMultiplier().getText(resources2).toString(), StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_multiplier_definition, composerStartRestartGroup, 0), null, null, composerStartRestartGroup, 6, 24);
                                    ContractSpec(row62, StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_delivery, composerStartRestartGroup, 0), contractSpecsData.getDelivery().getText(resources2).toString(), contractSpecsData.getDeliveryDefinition().getText(resources2).toString(), null, null, composerStartRestartGroup, 6, 24);
                                    composerStartRestartGroup.endNode();
                                    Modifier modifierM14735scrimGUYwDQI$default32 = ModifiersKt.m14735scrimGUYwDQI$default(companion32, z, null, null, 6, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy42 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getTop(), composerStartRestartGroup, 0);
                                    currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap52 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier52 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM14735scrimGUYwDQI$default32);
                                    Function0<ComposeUiNode> constructor52 = companion22.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy42, companion22.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap52, companion22.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash5 = companion22.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl5.getInserting()) {
                                        composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                        Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier52, companion22.getSetModifier());
                                        ContractSpec(row62, StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_hours, composerStartRestartGroup, 0), contractSpecsData.getHours().getText(resources2).toString(), contractSpecsData.getHoursDefinition().getText(resources2).toString(), null, null, composerStartRestartGroup, 6, 24);
                                        ContractSpec(row62, StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_last_trade, composerStartRestartGroup, 0), contractSpecsData.getLastTradeDate().getText(resources2).toString(), StringResources_androidKt.stringResource(C17042R.string.futures_detail_contract_specs_last_trade_definition, composerStartRestartGroup, 0), null, null, composerStartRestartGroup, 6, 24);
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
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z4 = z2;
            i4 = i2 & 8;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z3 = z;
        if ((i2 & 4) == 0) {
        }
        z4 = z2;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ContractSpec(final Row5 row5, final String str, final String str2, final String str3, Modifier modifier, BentoIcon4 bentoIcon4, Composer composer, final int i, final int i2) {
        Row5 row52;
        int i3;
        String str4;
        String str5;
        int i4;
        Modifier modifier2;
        BentoIcon4 bentoIcon42;
        Modifier modifier3;
        int i5;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final BentoIcon4 bentoIcon43;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        BentoIcon4 size16 = bentoIcon4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1311914595);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
            row52 = row5;
        } else if ((i & 6) == 0) {
            row52 = row5;
            i3 = (composerStartRestartGroup.changed(row52) ? 4 : 2) | i;
        } else {
            row52 = row5;
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str4 = str;
                i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
            if ((i2 & 2) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str5 = str2;
                    i3 |= composerStartRestartGroup.changed(str5) ? 256 : 128;
                }
                if ((i2 & 4) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
                }
                i4 = i2 & 8;
                if (i4 == 0) {
                    if ((i & 24576) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 16) != 0) {
                            i6 = 65536;
                            i3 |= i6;
                        } else {
                            if ((262144 & i) == 0 ? composerStartRestartGroup.changed(size16) : composerStartRestartGroup.changedInstance(size16)) {
                                i6 = 131072;
                            }
                            i3 |= i6;
                        }
                    }
                    if ((74899 & i3) != 74898 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        bentoIcon43 = size16;
                        modifier4 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 16) != 0) {
                                size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16);
                                i3 &= -458753;
                            }
                            int i7 = i3;
                            bentoIcon42 = size16;
                            modifier3 = modifier5;
                            i5 = i7;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -458753;
                            }
                            i5 = i3;
                            bentoIcon42 = size16;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1311914595, i5, -1, "com.robinhood.android.futures.detail.ui.ContractSpec (ContractSpecsSection.kt:134)");
                        }
                        final Context applicationContext = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getApplicationContext();
                        TooltipState tooltipStateRememberTooltipState = TooltipKt.rememberTooltipState(false, true, null, composerStartRestartGroup, 48, 5);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                        Modifier modifierWeight$default = Row5.weight$default(row52, SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(0)), 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
                        Modifier modifier6 = modifier3;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        BentoIcon4 bentoIcon44 = bentoIcon42;
                        TooltipKt.TooltipBox(TooltipDefaults.INSTANCE.m6073rememberPlainTooltipPositionProviderkHDZbjc(0.0f, composerStartRestartGroup, TooltipDefaults.$stable << 3, 1), ComposableLambda3.rememberComposableLambda(-2011317054, true, new Function3<TooltipScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.ContractSpecsSectionKt$ContractSpec$1$1

                            /* compiled from: ContractSpecsSection.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.futures.detail.ui.ContractSpecsSectionKt$ContractSpec$1$1$1 */
                            static final class C170511 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ Context $appContext;
                                final /* synthetic */ String $tooltipContent;

                                C170511(String str, Context context) {
                                    this.$tooltipContent = str;
                                    this.$appContext = context;
                                }

                                public final void invoke(Composer composer, int i) {
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-567973265, i, -1, "com.robinhood.android.futures.detail.ui.ContractSpec.<anonymous>.<anonymous>.<anonymous> (ContractSpecsSection.kt:150)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i2 = BentoTheme.$stable;
                                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21597getXxsmallD9Ej5fM());
                                    String str = this.$tooltipContent;
                                    final Context context = this.$appContext;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5143paddingVpY3zN4);
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, 0, bentoTheme.getColors(composer, i2).getNova(), bentoTheme.getColors(composer, i2).getNova(), false, composer, BentoMarkdownText.$stable << 15, 19);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(context);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00f0: CONSTRUCTOR (r1v7 'objRememberedValue' java.lang.Object) = (r12v0 'context' android.content.Context A[DONT_INLINE]) A[MD:(android.content.Context):void (m)] (LINE:163) call: com.robinhood.android.futures.detail.ui.ContractSpecsSectionKt$ContractSpec$1$1$1$$ExternalSyntheticLambda0.<init>(android.content.Context):void type: CONSTRUCTOR in method: com.robinhood.android.futures.detail.ui.ContractSpecsSectionKt$ContractSpec$1$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes3.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.futures.detail.ui.ContractSpecsSectionKt$ContractSpec$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 25 more
                                            */
                                        /*
                                            Method dump skipped, instructions count: 278
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.futures.detail.p140ui.ContractSpecsSection2.C170511.invoke(androidx.compose.runtime.Composer, int):void");
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Context context, String uri) {
                                        Intrinsics.checkNotNullParameter(uri, "uri");
                                        WebUtils.viewUrl$default(context, uri, 0, 4, (Object) null);
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(TooltipScope tooltipScope, Composer composer2, Integer num) {
                                    invoke(tooltipScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(TooltipScope TooltipBox, Composer composer2, int i8) {
                                    long jM21373getBg30d7_KjU;
                                    Intrinsics.checkNotNullParameter(TooltipBox, "$this$TooltipBox");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2011317054, i8, -1, "com.robinhood.android.futures.detail.ui.ContractSpec.<anonymous>.<anonymous> (ContractSpecsSection.kt:146)");
                                    }
                                    long jM6072getCaretSizeMYxV2XQ = TooltipDefaults.INSTANCE.m6072getCaretSizeMYxV2XQ();
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i9 = BentoTheme.$stable;
                                    if (bentoTheme.getColors(composer2, i9).getIsDay()) {
                                        composer2.startReplaceGroup(-140400092);
                                        jM21373getBg30d7_KjU = bentoTheme.getColors(composer2, i9).m21425getFg0d7_KjU();
                                    } else {
                                        composer2.startReplaceGroup(-140399259);
                                        jM21373getBg30d7_KjU = bentoTheme.getColors(composer2, i9).m21373getBg30d7_KjU();
                                    }
                                    composer2.endReplaceGroup();
                                    Tooltip_androidKt.m6074PlainTooltip7QI4Sbk(TooltipBox, null, jM6072getCaretSizeMYxV2XQ, null, 0L, jM21373getBg30d7_KjU, 0.0f, 0.0f, ComposableLambda3.rememberComposableLambda(-567973265, true, new C170511(str3, applicationContext), composer2, 54), composer2, (i8 & 14) | 100663296, 109);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), tooltipStateRememberTooltipState, null, false, false, ComposableLambda3.rememberComposableLambda(2077851420, true, new ContractSpecsSection3(str4, str5, bentoIcon44, modifier6, coroutineScope, tooltipStateRememberTooltipState), composerStartRestartGroup, 54), composerStartRestartGroup, 1572912, 56);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            bentoIcon43 = bentoIcon44;
                            modifier4 = modifier6;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.ContractSpecsSectionKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ContractSpecsSection.ContractSpec$lambda$7(row5, str, str2, str3, modifier4, bentoIcon43, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    modifier2 = modifier;
                    if ((196608 & i) == 0) {
                    }
                    if ((74899 & i3) != 74898) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            int i72 = i3;
                            bentoIcon42 = size16;
                            modifier3 = modifier5;
                            i5 = i72;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final Context applicationContext2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getApplicationContext();
                            TooltipState tooltipStateRememberTooltipState2 = TooltipKt.rememberTooltipState(false, true, null, composerStartRestartGroup, 48, 5);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
                            Modifier modifierWeight$default2 = Row5.weight$default(row52, SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(0)), 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Modifier modifier62 = modifier3;
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                BentoIcon4 bentoIcon442 = bentoIcon42;
                                TooltipKt.TooltipBox(TooltipDefaults.INSTANCE.m6073rememberPlainTooltipPositionProviderkHDZbjc(0.0f, composerStartRestartGroup, TooltipDefaults.$stable << 3, 1), ComposableLambda3.rememberComposableLambda(-2011317054, true, new Function3<TooltipScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.ContractSpecsSectionKt$ContractSpec$1$1

                                    /* compiled from: ContractSpecsSection.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.futures.detail.ui.ContractSpecsSectionKt$ContractSpec$1$1$1 */
                                    static final class C170511 implements Function2<Composer, Integer, Unit> {
                                        final /* synthetic */ Context $appContext;
                                        final /* synthetic */ String $tooltipContent;

                                        C170511(String str, Context context) {
                                            this.$tooltipContent = str;
                                            this.$appContext = context;
                                        }

                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00f0: CONSTRUCTOR (r1v7 'objRememberedValue' java.lang.Object) = (r12v0 'context' android.content.Context A[DONT_INLINE]) A[MD:(android.content.Context):void (m)] (LINE:163) call: com.robinhood.android.futures.detail.ui.ContractSpecsSectionKt$ContractSpec$1$1$1$$ExternalSyntheticLambda0.<init>(android.content.Context):void type: CONSTRUCTOR in method: com.robinhood.android.futures.detail.ui.ContractSpecsSectionKt$ContractSpec$1$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes3.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.futures.detail.ui.ContractSpecsSectionKt$ContractSpec$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 20 more
                                            */
                                        public final void invoke(androidx.compose.runtime.Composer r14, int r15) {
                                            /*
                                                Method dump skipped, instructions count: 278
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.futures.detail.p140ui.ContractSpecsSection2.C170511.invoke(androidx.compose.runtime.Composer, int):void");
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                            invoke(composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Context context, String uri) {
                                            Intrinsics.checkNotNullParameter(uri, "uri");
                                            WebUtils.viewUrl$default(context, uri, 0, 4, (Object) null);
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(TooltipScope tooltipScope, Composer composer2, Integer num) {
                                        invoke(tooltipScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(TooltipScope TooltipBox, Composer composer2, int i8) {
                                        long jM21373getBg30d7_KjU;
                                        Intrinsics.checkNotNullParameter(TooltipBox, "$this$TooltipBox");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2011317054, i8, -1, "com.robinhood.android.futures.detail.ui.ContractSpec.<anonymous>.<anonymous> (ContractSpecsSection.kt:146)");
                                        }
                                        long jM6072getCaretSizeMYxV2XQ = TooltipDefaults.INSTANCE.m6072getCaretSizeMYxV2XQ();
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i9 = BentoTheme.$stable;
                                        if (bentoTheme.getColors(composer2, i9).getIsDay()) {
                                            composer2.startReplaceGroup(-140400092);
                                            jM21373getBg30d7_KjU = bentoTheme.getColors(composer2, i9).m21425getFg0d7_KjU();
                                        } else {
                                            composer2.startReplaceGroup(-140399259);
                                            jM21373getBg30d7_KjU = bentoTheme.getColors(composer2, i9).m21373getBg30d7_KjU();
                                        }
                                        composer2.endReplaceGroup();
                                        Tooltip_androidKt.m6074PlainTooltip7QI4Sbk(TooltipBox, null, jM6072getCaretSizeMYxV2XQ, null, 0L, jM21373getBg30d7_KjU, 0.0f, 0.0f, ComposableLambda3.rememberComposableLambda(-567973265, true, new C170511(str3, applicationContext2), composer2, 54), composer2, (i8 & 14) | 100663296, 109);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), tooltipStateRememberTooltipState2, null, false, false, ComposableLambda3.rememberComposableLambda(2077851420, true, new ContractSpecsSection3(str4, str5, bentoIcon442, modifier62, coroutineScope2, tooltipStateRememberTooltipState2), composerStartRestartGroup, 54), composerStartRestartGroup, 1572912, 56);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                bentoIcon43 = bentoIcon442;
                                modifier4 = modifier62;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                str5 = str2;
                if ((i2 & 4) != 0) {
                }
                i4 = i2 & 8;
                if (i4 == 0) {
                }
                modifier2 = modifier;
                if ((196608 & i) == 0) {
                }
                if ((74899 & i3) != 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str4 = str;
            if ((i2 & 2) == 0) {
            }
            str5 = str2;
            if ((i2 & 4) != 0) {
            }
            i4 = i2 & 8;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((196608 & i) == 0) {
            }
            if ((74899 & i3) != 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
    }
