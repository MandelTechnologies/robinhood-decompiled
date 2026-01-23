package com.robinhood.shared.crypto.p375ui.trade.view;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderConfirmationRow;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderConfirmationRowState;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoOrderConfirmationRow.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\t\u001aE\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"CryptoOrderConfirmationRow", "", "state", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState;", "modifier", "Landroidx/compose/ui/Modifier;", "onTap", "Lkotlin/Function1;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TapAction;", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "TextContent", "defaultTextStyle", "Landroidx/compose/ui/text/TextStyle;", "defaultTextColor", "Landroidx/compose/ui/graphics/Color;", "textContent", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TextContent;", "TextContent-8V94_ZQ", "(Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function1;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState$TextContent;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OrderConfirmationPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderConfirmationRowKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoOrderConfirmationRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderConfirmationRow$lambda$3(CryptoOrderConfirmationRowState cryptoOrderConfirmationRowState, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        CryptoOrderConfirmationRow(cryptoOrderConfirmationRowState, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderConfirmationPreview$lambda$9(int i, Composer composer, int i2) {
        OrderConfirmationPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextContent_8V94_ZQ$lambda$8(TextStyle textStyle, long j, Function1 function1, CryptoOrderConfirmationRowState.TextContent textContent, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m25276TextContent8V94_ZQ(textStyle, j, function1, textContent, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoOrderConfirmationRow(final CryptoOrderConfirmationRowState state, Modifier modifier, final Function1<? super CryptoOrderConfirmationRowState.TapAction, Unit> onTap, Composer composer, final int i, final int i2) {
        int i3;
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
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        Composer composerStartRestartGroup = composer.startRestartGroup(-31701399);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onTap) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-31701399, i3, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderConfirmationRow (CryptoOrderConfirmationRow.kt:39)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 1, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
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
                int i6 = i3 & 896;
                m25276TextContent8V94_ZQ(bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), onTap, state.getStartPrimaryTextContent(), null, composerStartRestartGroup, i6, 16);
                composerStartRestartGroup.startReplaceGroup(1723605526);
                if (state.getStartSecondaryTextContent() != null) {
                    m25276TextContent8V94_ZQ(bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), onTap, state.getStartSecondaryTextContent(), null, composerStartRestartGroup, i6, 16);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getEnd(), composerStartRestartGroup, 48);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
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
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                m25276TextContent8V94_ZQ(bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), onTap, state.getEndPrimaryTextContent(), null, composerStartRestartGroup, i6, 16);
                composerStartRestartGroup.startReplaceGroup(-467329335);
                if (state.getEndSecondaryTextContent() != null) {
                    m25276TextContent8V94_ZQ(bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), onTap, state.getEndSecondaryTextContent(), null, composerStartRestartGroup, i6, 16);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderConfirmationRowKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoOrderConfirmationRow.CryptoOrderConfirmationRow$lambda$3(state, modifier3, onTap, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 1, null);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    int i62 = i3 & 896;
                    m25276TextContent8V94_ZQ(bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), onTap, state.getStartPrimaryTextContent(), null, composerStartRestartGroup, i62, 16);
                    composerStartRestartGroup.startReplaceGroup(1723605526);
                    if (state.getStartSecondaryTextContent() != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    Spacer2.Spacer(Row5.weight$default(row62, companion32, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getEnd(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                    Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                        m25276TextContent8V94_ZQ(bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), onTap, state.getEndPrimaryTextContent(), null, composerStartRestartGroup, i62, 16);
                        composerStartRestartGroup.startReplaceGroup(-467329335);
                        if (state.getEndSecondaryTextContent() != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0161  */
    /* renamed from: TextContent-8V94_ZQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m25276TextContent8V94_ZQ(TextStyle textStyle, final long j, final Function1<? super CryptoOrderConfirmationRowState.TapAction, Unit> function1, final CryptoOrderConfirmationRowState.TextContent textContent, Modifier modifier, Composer composer, final int i, final int i2) {
        final TextStyle textStyle2;
        int i3;
        long j2;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(19941397);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            textStyle2 = textStyle;
        } else if ((i & 6) == 0) {
            textStyle2 = textStyle;
            i3 = (composerStartRestartGroup.changed(textStyle2) ? 4 : 2) | i;
        } else {
            textStyle2 = textStyle;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            j2 = j;
        } else {
            j2 = j;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(textContent) : composerStartRestartGroup.changedInstance(textContent) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(19941397, i3, -1, "com.robinhood.shared.crypto.ui.trade.view.TextContent (CryptoOrderConfirmationRow.kt:89)");
                }
                boolean z2 = textContent.getTapAction() == null;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z = ((i3 & 7168) != 2048 || ((i3 & 4096) != 0 && composerStartRestartGroup.changedInstance(textContent))) | ((i3 & 896) == 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderConfirmationRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoOrderConfirmationRow.TextContent_8V94_ZQ$lambda$6$lambda$5(textContent, function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier4, z2, null, null, (Function0) objRememberedValue, 6, null);
                Modifier modifier5 = modifier4;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                CryptoOrderConfirmationRowState.ColorOverride textColorOverride = textContent.getTextColorOverride();
                composerStartRestartGroup.startReplaceGroup(1896165883);
                Color colorM6701boximpl = null;
                Color colorM6701boximpl2 = textColorOverride != null ? null : Color.m6701boximpl(textColorOverride.getBentoColor(composerStartRestartGroup, 0));
                composerStartRestartGroup.endReplaceGroup();
                long value = colorM6701boximpl2 == null ? colorM6701boximpl2.getValue() : j2;
                FontWeight fontWeightOverride = textContent.getFontWeightOverride();
                CryptoOrderConfirmationRowState.TextStyleOverride textStyleOverride = textContent.getTextStyleOverride();
                composerStartRestartGroup.startReplaceGroup(1896170367);
                TextStyle bentoTextStyle = textStyleOverride != null ? null : textStyleOverride.getBentoTextStyle(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(textContent.getText(), composerStartRestartGroup, StringResource.$stable), null, Color.m6701boximpl(value), null, fontWeightOverride, null, null, 0, false, 0, 0, null, 0, bentoTextStyle != null ? textStyle2 : bentoTextStyle, composerStartRestartGroup, 0, 0, 8170);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(1896174012);
                if (textContent.getTrailingIcon() != null) {
                    BentoIcon4 icon = textContent.getTrailingIcon().getIcon();
                    CryptoOrderConfirmationRowState.ColorOverride colorOverride = textContent.getTrailingIcon().getColorOverride();
                    composerStartRestartGroup.startReplaceGroup(1896180795);
                    Color colorM6701boximpl3 = colorOverride == null ? null : Color.m6701boximpl(colorOverride.getBentoColor(composerStartRestartGroup, 0));
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1896179620);
                    if (colorM6701boximpl3 == null) {
                        CryptoOrderConfirmationRowState.ColorOverride textColorOverride2 = textContent.getTextColorOverride();
                        if (textColorOverride2 != null) {
                            colorM6701boximpl = Color.m6701boximpl(textColorOverride2.getBentoColor(composerStartRestartGroup, 0));
                        }
                    } else {
                        colorM6701boximpl = colorM6701boximpl3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoIcon2.m20644BentoIconFU0evQE(icon, null, colorM6701boximpl != null ? colorM6701boximpl.getValue() : j, null, null, false, composerStartRestartGroup, BentoIcon4.$stable | 48, 56);
                }
                composerStartRestartGroup.endReplaceGroup();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderConfirmationRowKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoOrderConfirmationRow.TextContent_8V94_ZQ$lambda$8(textStyle2, j, function1, textContent, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (textContent.getTapAction() == null) {
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            if ((i3 & 7168) != 2048) {
                z = ((i3 & 7168) != 2048 || ((i3 & 4096) != 0 && composerStartRestartGroup.changedInstance(textContent))) | ((i3 & 896) == 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderConfirmationRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoOrderConfirmationRow.TextContent_8V94_ZQ$lambda$6$lambda$5(textContent, function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifier4, z2, null, null, (Function0) objRememberedValue, 6, null);
                    Modifier modifier52 = modifier4;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default2);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        CryptoOrderConfirmationRowState.ColorOverride textColorOverride3 = textContent.getTextColorOverride();
                        composerStartRestartGroup.startReplaceGroup(1896165883);
                        Color colorM6701boximpl4 = null;
                        if (textColorOverride3 != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (colorM6701boximpl2 == null) {
                        }
                        FontWeight fontWeightOverride2 = textContent.getFontWeightOverride();
                        CryptoOrderConfirmationRowState.TextStyleOverride textStyleOverride2 = textContent.getTextStyleOverride();
                        composerStartRestartGroup.startReplaceGroup(1896170367);
                        if (textStyleOverride2 != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(textContent.getText(), composerStartRestartGroup, StringResource.$stable), null, Color.m6701boximpl(value), null, fontWeightOverride2, null, null, 0, false, 0, 0, null, 0, bentoTextStyle != null ? textStyle2 : bentoTextStyle, composerStartRestartGroup, 0, 0, 8170);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.startReplaceGroup(1896174012);
                        if (textContent.getTrailingIcon() != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CryptoOrderConfirmationRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderConfirmationRowKt$OrderConfirmationPreview$1 */
    static final class C386631 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ List<CryptoOrderConfirmationRowState> $rowStates;

        C386631(List<CryptoOrderConfirmationRowState> list) {
            this.$rowStates = list;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-714853859, i, -1, "com.robinhood.shared.crypto.ui.trade.view.OrderConfirmationPreview.<anonymous> (CryptoOrderConfirmationRow.kt:290)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            List<CryptoOrderConfirmationRowState> list = this.$rowStates;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
            composer.startReplaceGroup(1294542482);
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                CryptoOrderConfirmationRowState cryptoOrderConfirmationRowState = (CryptoOrderConfirmationRowState) obj;
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderConfirmationRowKt$OrderConfirmationPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return CryptoOrderConfirmationRow.C386631.invoke$lambda$3$lambda$2$lambda$1$lambda$0((CryptoOrderConfirmationRowState.TapAction) obj2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                CryptoOrderConfirmationRow.CryptoOrderConfirmationRow(cryptoOrderConfirmationRowState, null, (Function1) objRememberedValue, composer, 384, 2);
                composer.startReplaceGroup(1294547986);
                if (i3 != CollectionsKt.getLastIndex(list)) {
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
                }
                composer.endReplaceGroup();
                i3 = i4;
            }
            composer.endReplaceGroup();
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
        public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(CryptoOrderConfirmationRowState.TapAction it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextContent_8V94_ZQ$lambda$6$lambda$5(CryptoOrderConfirmationRowState.TextContent textContent, Function1 function1) {
        CryptoOrderConfirmationRowState.TapAction tapAction = textContent.getTapAction();
        if (tapAction != null) {
            function1.invoke(tapAction);
        }
        return Unit.INSTANCE;
    }

    public static final void OrderConfirmationPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(154745957);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(154745957, i, -1, "com.robinhood.shared.crypto.ui.trade.view.OrderConfirmationPreview (CryptoOrderConfirmationRow.kt:224)");
            }
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke("Robinhood fee");
            CryptoOrderConfirmationRowState.TextStyleOverride textStyleOverride = CryptoOrderConfirmationRowState.TextStyleOverride.TEXT_M_TRADE_BONUS_GRADIENT;
            FontWeight.Companion companion2 = FontWeight.INSTANCE;
            CryptoOrderConfirmationRowState cryptoOrderConfirmationRowState = new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(stringResourceInvoke, null, null, null, textStyleOverride, companion2.getBold(), 14, null), null, new CryptoOrderConfirmationRowState.TextContent(companion.invoke("$0.00"), null, null, null, textStyleOverride, companion2.getBold(), 14, null), null, 10, null);
            StringResource stringResourceInvoke2 = companion.invoke("Total cost");
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.QUESTION_FILLED_16;
            CryptoOrderConfirmationRowState cryptoOrderConfirmationRowState2 = new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(stringResourceInvoke2, null, new CryptoOrderConfirmationRowState.IconContent(new BentoIcon4.Size16(serverToBentoAssetMapper2), null, 2, null), CryptoOrderConfirmationRowState.TapAction.ShowCostDetailBottomSheet.INSTANCE, null, null, 50, null), null, new CryptoOrderConfirmationRowState.TextContent(companion.invoke("$100.00"), null, null, null, null, null, 62, null), null, 10, null);
            CryptoOrderConfirmationRowState cryptoOrderConfirmationRowState3 = new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(companion.invoke("BTC price"), null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(companion.invoke("$65,642.16"), null, null, null, null, null, 62, null), null, 10, null);
            CryptoOrderConfirmationRowState.TextContent textContent = new CryptoOrderConfirmationRowState.TextContent(companion.invoke("BTC purchased"), null, null, null, null, null, 62, null);
            StringResource stringResourceInvoke3 = companion.invoke("0.01% bonus");
            BentoIcon4.Size16 size16 = new BentoIcon4.Size16(serverToBentoAssetMapper2);
            CryptoOrderConfirmationRowState.ColorOverride colorOverride = CryptoOrderConfirmationRowState.ColorOverride.DAY_PRIME;
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-714853859, true, new C386631(CollectionsKt.listOf((Object[]) new CryptoOrderConfirmationRowState[]{cryptoOrderConfirmationRowState, cryptoOrderConfirmationRowState2, cryptoOrderConfirmationRowState3, new CryptoOrderConfirmationRowState(textContent, new CryptoOrderConfirmationRowState.TextContent(stringResourceInvoke3, null, new CryptoOrderConfirmationRowState.IconContent(size16, colorOverride), null, CryptoOrderConfirmationRowState.TextStyleOverride.TEXT_S_TRADE_BONUS_GRADIENT, companion2.getBold(), 10, null), new CryptoOrderConfirmationRowState.TextContent(companion.invoke("0.00152341 BTC"), null, null, null, null, null, 62, null), new CryptoOrderConfirmationRowState.TextContent(companion.invoke("0.00000015 BTC"), colorOverride, null, null, null, companion2.getBold(), 28, null)), new CryptoOrderConfirmationRowState(new CryptoOrderConfirmationRowState.TextContent(companion.invoke("Total BTC"), null, null, null, null, null, 62, null), null, new CryptoOrderConfirmationRowState.TextContent(companion.invoke("0.00152356 BTC"), null, null, null, null, null, 62, null), null, 10, null)})), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderConfirmationRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoOrderConfirmationRow.OrderConfirmationPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
