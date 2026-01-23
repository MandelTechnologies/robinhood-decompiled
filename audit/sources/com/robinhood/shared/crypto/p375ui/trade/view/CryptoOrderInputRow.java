package com.robinhood.shared.crypto.p375ui.trade.view;

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
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.transfers.ach.p265ui.CreateQueuedAchDepositDuxo;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRow;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRowState;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoOrderInputRow.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\u000e\u001aE\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"CryptoOrderInputRow", "", "state", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState;", "onTap", "Lkotlin/Function1;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TapAction;", "onFocusRequested", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", ResourceTypes.STYLE, "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowStyle;", "onInputTooltipClick", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowStyle;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "TextContent", "defaultTextStyle", "Landroidx/compose/ui/text/TextStyle;", "defaultTextColor", "Landroidx/compose/ui/graphics/Color;", "textContent", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TextContent;", "TextContent-8V94_ZQ", "(Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function1;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState$TextContent;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoOrderInputRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-crypto-ui_externalDebug", "isCursorVisible", "", "backgroundColor"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoOrderInputRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderInputRow$lambda$7(CryptoOrderInputRowState cryptoOrderInputRowState, Function1 function1, Function0 function0, Modifier modifier, CryptoOrderInputRowStyle cryptoOrderInputRowStyle, Function0 function02, int i, int i2, Composer composer, int i3) {
        CryptoOrderInputRow(cryptoOrderInputRowState, function1, function0, modifier, cryptoOrderInputRowStyle, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderInputRowPreview$lambda$9(int i, Composer composer, int i2) {
        CryptoOrderInputRowPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextContent_8V94_ZQ$lambda$8(TextStyle textStyle, long j, Function1 function1, CryptoOrderInputRowState.TextContent textContent, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m25279TextContent8V94_ZQ(textStyle, j, function1, textContent, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoOrderInputRow(final CryptoOrderInputRowState state, final Function1<? super CryptoOrderInputRowState.TapAction, Unit> onTap, final Function0<Unit> onFocusRequested, Modifier modifier, CryptoOrderInputRowStyle cryptoOrderInputRowStyle, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoOrderInputRowStyle cryptoOrderInputRowStyle2;
        int i4;
        Function0<Unit> function02;
        CryptoOrderInputRowStyle style;
        Modifier modifier3;
        Function0<Unit> function03;
        CryptoOrderInputRowStyle cryptoOrderInputRowStyle3;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        boolean z;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        Composer composer2;
        final CryptoOrderInputRowStyle cryptoOrderInputRowStyle4;
        final Function0<Unit> function04;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        Intrinsics.checkNotNullParameter(onFocusRequested, "onFocusRequested");
        Composer composerStartRestartGroup = composer.startRestartGroup(-908786310);
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
            i3 |= composerStartRestartGroup.changedInstance(onTap) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFocusRequested) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    cryptoOrderInputRowStyle2 = cryptoOrderInputRowStyle;
                    int i6 = composerStartRestartGroup.changed(cryptoOrderInputRowStyle2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    cryptoOrderInputRowStyle2 = cryptoOrderInputRowStyle;
                }
                i3 |= i6;
            } else {
                cryptoOrderInputRowStyle2 = cryptoOrderInputRowStyle;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    cryptoOrderInputRowStyle4 = cryptoOrderInputRowStyle2;
                    function04 = function02;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 16) == 0) {
                            style = CryptoOrderInputRow8.INSTANCE.getStyle(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            style = cryptoOrderInputRowStyle2;
                        }
                        if (i4 == 0) {
                            modifier3 = modifier5;
                            cryptoOrderInputRowStyle3 = style;
                            function03 = null;
                        } else {
                            modifier3 = modifier5;
                            function03 = function02;
                            cryptoOrderInputRowStyle3 = style;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        modifier3 = modifier2;
                        function03 = function02;
                        cryptoOrderInputRowStyle3 = cryptoOrderInputRowStyle2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-908786310, i3, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRow (CryptoOrderInputRow.kt:60)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Boolean boolValueOf = Boolean.valueOf(state.isFocused());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    z = (i3 & 14) != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(state));
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new CryptoOrderInputRow2(state, snapshotState, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion4, 0.0f, cryptoOrderInputRowStyle3.m25291getVerticalSpacingD9Ej5fM(), 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
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
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    int i8 = (i3 << 3) & 896;
                    m25279TextContent8V94_ZQ(bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), cryptoOrderInputRowStyle3.m25289getStartPrimaryTextColor0d7_KjU(), onTap, state.getStartPrimaryTextContent(), null, composerStartRestartGroup, i8, 16);
                    composerStartRestartGroup.startReplaceGroup(-1702819359);
                    if (state.getStartSecondaryTextContent() != null) {
                        m25279TextContent8V94_ZQ(bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS(), cryptoOrderInputRowStyle3.m25290getStartSecondaryTextColor0d7_KjU(), onTap, state.getStartSecondaryTextContent(), null, composerStartRestartGroup, i8, 16);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    Spacer2.Spacer(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    CryptoOrderInputRowStyle cryptoOrderInputRowStyle5 = cryptoOrderInputRowStyle3;
                    Function0<Unit> function05 = function03;
                    LocalShowPlaceholder.Loadable(state.getInputPlaceholderText() != null && state.getInputText() == null, null, null, ComposableLambda3.rememberComposableLambda(402437988, true, new CryptoOrderInputRow3(onFocusRequested, state, cryptoOrderInputRowStyle5, function05, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                    composer2.startReplaceGroup(223938384);
                    if (state.getIncludeBottomDivider()) {
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), bentoTheme.getColors(composer2, i7).m21373getBg30d7_KjU(), 0.0f, composer2, 6, 4);
                        composer2 = composer2;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    cryptoOrderInputRowStyle4 = cryptoOrderInputRowStyle5;
                    function04 = function05;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoOrderInputRow.CryptoOrderInputRow$lambda$7(state, onTap, onFocusRequested, modifier4, cryptoOrderInputRowStyle4, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            function02 = function0;
            if ((74899 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if ((i2 & 16) == 0) {
                    }
                    if (i4 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Boolean boolValueOf2 = Boolean.valueOf(state.isFocused());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if ((i3 & 14) != 4) {
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue2 = new CryptoOrderInputRow2(state, snapshotState, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                            Arrangement arrangement2 = Arrangement.INSTANCE;
                            Arrangement.Vertical top2 = arrangement2.getTop();
                            Alignment.Companion companion22 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                Modifier.Companion companion42 = Modifier.INSTANCE;
                                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion42, 0.0f, cryptoOrderInputRowStyle3.m25291getVerticalSpacingD9Ej5fM(), 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting()) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                    Row6 row62 = Row6.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
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
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i72 = BentoTheme.$stable;
                                        int i82 = (i3 << 3) & 896;
                                        m25279TextContent8V94_ZQ(bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextM(), cryptoOrderInputRowStyle3.m25289getStartPrimaryTextColor0d7_KjU(), onTap, state.getStartPrimaryTextContent(), null, composerStartRestartGroup, i82, 16);
                                        composerStartRestartGroup.startReplaceGroup(-1702819359);
                                        if (state.getStartSecondaryTextContent() != null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.endNode();
                                        Spacer2.Spacer(Row5.weight$default(row62, companion42, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                        if (state.getInputPlaceholderText() != null) {
                                            CryptoOrderInputRowStyle cryptoOrderInputRowStyle52 = cryptoOrderInputRowStyle3;
                                            Function0<Unit> function052 = function03;
                                            LocalShowPlaceholder.Loadable(state.getInputPlaceholderText() != null && state.getInputText() == null, null, null, ComposableLambda3.rememberComposableLambda(402437988, true, new CryptoOrderInputRow3(onFocusRequested, state, cryptoOrderInputRowStyle52, function052, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                                            composer2 = composerStartRestartGroup;
                                            composer2.endNode();
                                            composer2.startReplaceGroup(223938384);
                                            if (state.getIncludeBottomDivider()) {
                                            }
                                            composer2.endReplaceGroup();
                                            composer2.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            cryptoOrderInputRowStyle4 = cryptoOrderInputRowStyle52;
                                            function04 = function052;
                                            modifier4 = modifier3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoOrderInputRow$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoOrderInputRow$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: CryptoOrderInputRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowKt$CryptoOrderInputRowPreview$1 */
    static final class C386691 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ List<CryptoOrderInputRowState> $states;

        C386691(List<CryptoOrderInputRowState> list) {
            this.$states = list;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-492353214, i, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowPreview.<anonymous> (CryptoOrderInputRow.kt:324)");
            }
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null);
            List<CryptoOrderInputRowState> list = this.$states;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierWrapContentHeight$default);
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
            composer.startReplaceGroup(1789800165);
            for (CryptoOrderInputRowState cryptoOrderInputRowState : list) {
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowKt$CryptoOrderInputRowPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoOrderInputRow.C386691.invoke$lambda$5$lambda$4$lambda$1$lambda$0((CryptoOrderInputRowState.TapAction) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion2.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowKt$CryptoOrderInputRowPreview$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                CryptoOrderInputRow.CryptoOrderInputRow(cryptoOrderInputRowState, function1, (Function0) objRememberedValue2, null, null, null, composer, 432, 56);
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
        public static final Unit invoke$lambda$5$lambda$4$lambda$1$lambda$0(CryptoOrderInputRowState.TapAction it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* renamed from: TextContent-8V94_ZQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m25279TextContent8V94_ZQ(final TextStyle textStyle, final long j, final Function1<? super CryptoOrderInputRowState.TapAction, Unit> function1, final CryptoOrderInputRowState.TextContent textContent, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        Function1<? super CryptoOrderInputRowState.TapAction, Unit> function12;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1124955580);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(textStyle) ? 4 : 2) | i;
        } else {
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
        } else {
            if ((i & 384) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(textContent) : composerStartRestartGroup.changedInstance(textContent) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1124955580, i3, -1, "com.robinhood.shared.crypto.ui.trade.view.TextContent (CryptoOrderInputRow.kt:165)");
                    }
                    Modifier modifier4 = modifier2;
                    LocalShowPlaceholder.Loadable(textContent.isLoading(), null, null, ComposableLambda3.rememberComposableLambda(-964214828, true, new CryptoOrderInputRow5(modifier4, textContent, function12, j2, textStyle), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoOrderInputRow.TextContent_8V94_ZQ$lambda$8(textStyle, j, function1, textContent, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) != 9362) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier42 = modifier2;
                LocalShowPlaceholder.Loadable(textContent.isLoading(), null, null, ComposableLambda3.rememberComposableLambda(-964214828, true, new CryptoOrderInputRow5(modifier42, textContent, function12, j2, textStyle), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function12 = function1;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void CryptoOrderInputRowPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1280766458);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1280766458, i, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowPreview (CryptoOrderInputRow.kt:282)");
            }
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke("Limit price");
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.QUESTION_FILLED_16;
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-492353214, true, new C386691(CollectionsKt.listOf((Object[]) new CryptoOrderInputRowState[]{new CryptoOrderInputRowState(new CryptoOrderInputRowState.TextContent(stringResourceInvoke, new CryptoOrderInputRowState.IconContent(new BentoIcon4.Size16(serverToBentoAssetMapper2), null, 2, null), null, false, 12, null), new CryptoOrderInputRowState.TextContent(companion.invoke("Bid: $1234.56"), null, null, false, 14, null), companion.invoke(CreateQueuedAchDepositDuxo.DEFAULT_AMOUNT_HINT_ZERO), companion.invoke("$1000.00"), null, false, false, 112, null), new CryptoOrderInputRowState(new CryptoOrderInputRowState.TextContent(companion.invoke("Limit price"), new CryptoOrderInputRowState.IconContent(new BentoIcon4.Size16(serverToBentoAssetMapper2), null, 2, null), null, false, 12, null), CryptoOrderInputRowState.TextContent.INSTANCE.getLOADING_TEXT_CONTENT(), companion.invoke(CreateQueuedAchDepositDuxo.DEFAULT_AMOUNT_HINT_ZERO), null, null, false, false, 112, null), new CryptoOrderInputRowState(new CryptoOrderInputRowState.TextContent(companion.invoke("Amount in ETH"), null, null, false, 14, null), null, companion.invoke(CreateQueuedAchDepositDuxo.DEFAULT_AMOUNT_HINT_ZERO), companion.invoke("0.5"), null, false, false, 114, null), new CryptoOrderInputRowState(new CryptoOrderInputRowState.TextContent(companion.invoke("Amount in ETH"), null, null, false, 14, null), null, companion.invoke(CreateQueuedAchDepositDuxo.DEFAULT_AMOUNT_HINT_ZERO), null, null, false, false, 114, null)})), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderInputRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoOrderInputRow.CryptoOrderInputRowPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
