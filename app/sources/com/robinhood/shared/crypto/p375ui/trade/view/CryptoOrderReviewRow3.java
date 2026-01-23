package com.robinhood.shared.crypto.p375ui.trade.view;

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
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyKey;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIcon;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.extensions.AutomationTestTagModifierExt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoOrderReviewRow.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\t\u001aM\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\r\u0010\"\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010#\"\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"/\u0010\u001a\u001a\u00020\u0003*\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!*\u0004\b\u001c\u0010\u001d¨\u0006$"}, m3636d2 = {"CryptoOrderReviewRow", "", "state", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "modifier", "Landroidx/compose/ui/Modifier;", "onTap", "Lkotlin/Function1;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "TextContent", "defaultTextStyle", "Landroidx/compose/ui/text/TextStyle;", "defaultTextColor", "Landroidx/compose/ui/graphics/Color;", "enabled", "", "textContent", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TextContent;", "TextContent-OadGlvw", "(Landroidx/compose/ui/text/TextStyle;JZLkotlin/jvm/functions/Function1;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TextContent;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoOrderReviewRowSemanticKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getCryptoOrderReviewRowSemanticKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "<set-?>", "cryptoOrderReviewRow", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getCryptoOrderReviewRow$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "getCryptoOrderReviewRow", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", "setCryptoOrderReviewRow", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;)V", "OrderReviewPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoOrderReviewRow3 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CryptoOrderReviewRow3.class, "cryptoOrderReviewRow", "getCryptoOrderReviewRow(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState;", 1))};
    private static final SemanticsPropertyKey<CryptoOrderReviewRowState> CryptoOrderReviewRowSemanticKey = new SemanticsPropertyKey<>("crypto_order_review_row_key", null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderReviewRow$lambda$17(CryptoOrderReviewRowState cryptoOrderReviewRowState, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        CryptoOrderReviewRow(cryptoOrderReviewRowState, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderReviewPreview$lambda$21(int i, Composer composer, int i2) {
        OrderReviewPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextContent_OadGlvw$lambda$20(TextStyle textStyle, long j, boolean z, Function1 function1, CryptoOrderReviewRowState.TextContent textContent, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m25296TextContentOadGlvw(textStyle, j, z, function1, textContent, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoOrderReviewRow(final CryptoOrderReviewRowState state, Modifier modifier, final Function1<? super CryptoOrderReviewRowState.TapAction, Unit> onTap, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        long jM21427getFg30d7_KjU;
        Modifier modifierM5144paddingVpY3zN4$default;
        String startPrimaryTextAutomationTestTag;
        ImmutableList<CryptoOrderReviewRowState.SecondaryTextRow> secondaryRows;
        ArrayList<CryptoOrderReviewRowState.TextContent> arrayList;
        final Function1<? super CryptoOrderReviewRowState.TapAction, Unit> function1;
        int i5;
        long jM21427getFg30d7_KjU2;
        CryptoOrderReviewRowState.TextContent tertiaryTextButton;
        ArrayList arrayList2;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        long jM21427getFg30d7_KjU3;
        ImmutableList<CryptoOrderReviewRowState.SecondaryTextRow> secondaryRows2;
        ArrayList<CryptoOrderReviewRowState.TextContent> arrayList3;
        CryptoOrderReviewRowState.IconContent trailingIcon;
        final Modifier modifier3;
        long jM21427getFg30d7_KjU4;
        Modifier modifierAutomationTestTag;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onTap, "onTap");
        Composer composerStartRestartGroup = composer.startRestartGroup(2018844588);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onTap) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2018844588, i4, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRow (CryptoOrderReviewRow.kt:56)");
                }
                composerStartRestartGroup.startReplaceGroup(-1215558683);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i7 = i4 & 14;
                z = i7 != 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(state));
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoOrderReviewRow3.CryptoOrderReviewRow$lambda$1$lambda$0(state, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierFillMaxWidth$default, false, (Function1) objRememberedValue, 1, null);
                if (state.getRowTapAction() == null) {
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z2 = ((i4 & 896) == 256) | (i7 == 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(state)));
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoOrderReviewRow3.CryptoOrderReviewRow$lambda$4$lambda$3$lambda$2(onTap, state);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifierSemantics$default = ClickableKt.m4893clickableXHw0xAI$default(modifierSemantics$default, false, null, null, (Function0) objRememberedValue2, 7, null);
                }
                Modifier modifier5 = modifierSemantics$default;
                composerStartRestartGroup.endReplaceGroup();
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
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
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                CryptoOrderReviewRowState.VerticalPadding verticalPaddingOverride = state.getVerticalPaddingOverride();
                composerStartRestartGroup.startReplaceGroup(-5851666);
                C2002Dp c2002DpM7993boximpl = verticalPaddingOverride != null ? null : C2002Dp.m7993boximpl(verticalPaddingOverride.getBentoSpacing(composerStartRestartGroup, 0));
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default2, 0.0f, c2002DpM7993boximpl == null ? c2002DpM7993boximpl.getValue() : C2002Dp.m7995constructorimpl(12), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
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
                Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 25.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
                if (state.getEnabled()) {
                    composerStartRestartGroup.startReplaceGroup(1808141599);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1808140766);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                TextStyle textM = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM();
                boolean enabled = state.getEnabled();
                CryptoOrderReviewRowState.TextContent startPrimaryTextContent = state.getStartPrimaryTextContent();
                modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, 0.0f, 3, null);
                startPrimaryTextAutomationTestTag = state.getStartPrimaryTextAutomationTestTag();
                if (startPrimaryTextAutomationTestTag != null && (modifierAutomationTestTag = AutomationTestTagModifierExt.automationTestTag(modifierM5144paddingVpY3zN4$default, startPrimaryTextAutomationTestTag)) != null) {
                    modifierM5144paddingVpY3zN4$default = modifierAutomationTestTag;
                }
                int i8 = (i4 << 3) & 7168;
                m25296TextContentOadGlvw(textM, jM21427getFg30d7_KjU, enabled, onTap, startPrimaryTextContent, modifierM5144paddingVpY3zN4$default, composerStartRestartGroup, i8, 0);
                secondaryRows = state.getSecondaryRows();
                if (secondaryRows == null) {
                    arrayList = new ArrayList();
                    Iterator<CryptoOrderReviewRowState.SecondaryTextRow> it = secondaryRows.iterator();
                    while (it.hasNext()) {
                        CryptoOrderReviewRowState.TextContent start = it.next().getStart();
                        if (start != null) {
                            arrayList.add(start);
                        }
                    }
                } else {
                    arrayList = null;
                }
                composerStartRestartGroup.startReplaceGroup(1808158760);
                if (arrayList != null) {
                    function1 = onTap;
                    i5 = i8;
                } else {
                    for (CryptoOrderReviewRowState.TextContent textContent : arrayList) {
                        if (state.getEnabled()) {
                            composerStartRestartGroup.startReplaceGroup(-1793994219);
                            jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1793993355);
                            jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        m25296TextContentOadGlvw(BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS(), jM21427getFg30d7_KjU2, state.getEnabled(), onTap, textContent, null, composerStartRestartGroup, i8, 32);
                    }
                    function1 = onTap;
                    i5 = i8;
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1808171999);
                tertiaryTextButton = state.getTertiaryTextButton();
                if ((tertiaryTextButton == null ? tertiaryTextButton.getTapAction() : null) == null) {
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    String string2 = StringResource2.getString(state.getTertiaryTextButton().getText(), composerStartRestartGroup, StringResource.$stable);
                    BentoTextButton3.Size size = BentoTextButton3.Size.f5148S;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z3 = ((i4 & 896) == 256) | (i7 == 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(state)));
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoOrderReviewRow3.m2803xf3dd2067(function1, state);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    arrayList2 = null;
                    BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue3, string2, null, null, size, false, null, composerStartRestartGroup, 24576, 108);
                    composerStartRestartGroup = composerStartRestartGroup;
                } else {
                    arrayList2 = null;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Spacer2.Spacer(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getEnd(), composerStartRestartGroup, 48);
                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                if (state.getEnabled()) {
                    composerStartRestartGroup.startReplaceGroup(655428694);
                    jM21427getFg30d7_KjU3 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                } else {
                    composerStartRestartGroup.startReplaceGroup(655427861);
                    jM21427getFg30d7_KjU3 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                }
                composerStartRestartGroup.endReplaceGroup();
                int i9 = i5;
                m25296TextContentOadGlvw(BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM(), jM21427getFg30d7_KjU3, state.getEnabled(), onTap, state.getEndPrimaryTextContent(), null, composerStartRestartGroup, i9, 32);
                secondaryRows2 = state.getSecondaryRows();
                if (secondaryRows2 == null) {
                    arrayList3 = new ArrayList();
                    Iterator<CryptoOrderReviewRowState.SecondaryTextRow> it2 = secondaryRows2.iterator();
                    while (it2.hasNext()) {
                        CryptoOrderReviewRowState.TextContent end = it2.next().getEnd();
                        if (end != null) {
                            arrayList3.add(end);
                        }
                    }
                } else {
                    arrayList3 = arrayList2;
                }
                composerStartRestartGroup.startReplaceGroup(655438495);
                if (arrayList3 != null) {
                    for (CryptoOrderReviewRowState.TextContent textContent2 : arrayList3) {
                        if (state.getEnabled()) {
                            composerStartRestartGroup.startReplaceGroup(747101132);
                            jM21427getFg30d7_KjU4 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(747101996);
                            jM21427getFg30d7_KjU4 = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        m25296TextContentOadGlvw(BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS(), jM21427getFg30d7_KjU4, state.getEnabled(), onTap, textContent2, null, composerStartRestartGroup, i9, 32);
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                trailingIcon = state.getTrailingIcon();
                composerStartRestartGroup.startReplaceGroup(-1109759679);
                if (trailingIcon != null) {
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i10 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion6, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                    BentoIcon4 icon = trailingIcon.getIcon();
                    CryptoOrderReviewRowState.ColorOverride colorOverride = trailingIcon.getColorOverride();
                    composerStartRestartGroup.startReplaceGroup(-1109751056);
                    Color colorM6701boximpl = colorOverride == null ? arrayList2 : Color.m6701boximpl(colorOverride.getBentoColor(composerStartRestartGroup, 0));
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1109751899);
                    long jM21427getFg30d7_KjU5 = colorM6701boximpl == 0 ? bentoTheme.getColors(composerStartRestartGroup, i10).m21427getFg30d7_KjU() : colorM6701boximpl.getValue();
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer2 = composerStartRestartGroup;
                    BentoIcon2.m20644BentoIconFU0evQE(icon, null, jM21427getFg30d7_KjU5, modifierM5146paddingqDBjuR0$default, null, false, composer2, BentoIcon4.$stable | 48, 48);
                    composerStartRestartGroup = composer2;
                    Unit unit3 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(-5755646);
                if (state.getIncludeBottomDivider()) {
                    Composer composer3 = composerStartRestartGroup;
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, arrayList2), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer3, 6, 4);
                    composerStartRestartGroup = composer3;
                }
                composerStartRestartGroup.endReplaceGroup();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoOrderReviewRow3.CryptoOrderReviewRow$lambda$17(state, modifier3, onTap, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(-1215558683);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i72 = i4 & 14;
            if (i72 != 4) {
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoOrderReviewRow3.CryptoOrderReviewRow$lambda$1$lambda$0(state, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifierFillMaxWidth$default3, false, (Function1) objRememberedValue, 1, null);
                    if (state.getRowTapAction() == null) {
                    }
                    Modifier modifier52 = modifierSemantics$default2;
                    composerStartRestartGroup.endReplaceGroup();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(top2, companion7.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier52);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion22.getSetModifier());
                        Column6 column63 = Column6.INSTANCE;
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null);
                        CryptoOrderReviewRowState.VerticalPadding verticalPaddingOverride2 = state.getVerticalPaddingOverride();
                        composerStartRestartGroup.startReplaceGroup(-5851666);
                        if (verticalPaddingOverride2 != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM5144paddingVpY3zN4$default22 = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default22, 0.0f, c2002DpM7993boximpl == null ? c2002DpM7993boximpl.getValue() : C2002Dp.m7995constructorimpl(12), 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion7.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default22);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            Row6 row62 = Row6.INSTANCE;
                            Modifier modifierWeight$default2 = Row5.weight$default(row62, companion32, 25.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion7.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
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
                                if (state.getEnabled()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                TextStyle textM2 = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM();
                                boolean enabled2 = state.getEnabled();
                                CryptoOrderReviewRowState.TextContent startPrimaryTextContent2 = state.getStartPrimaryTextContent();
                                modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion32, 0.0f, 0.0f, 3, null);
                                startPrimaryTextAutomationTestTag = state.getStartPrimaryTextAutomationTestTag();
                                if (startPrimaryTextAutomationTestTag != null) {
                                    modifierM5144paddingVpY3zN4$default = modifierAutomationTestTag;
                                }
                                int i82 = (i4 << 3) & 7168;
                                m25296TextContentOadGlvw(textM2, jM21427getFg30d7_KjU, enabled2, onTap, startPrimaryTextContent2, modifierM5144paddingVpY3zN4$default, composerStartRestartGroup, i82, 0);
                                secondaryRows = state.getSecondaryRows();
                                if (secondaryRows == null) {
                                }
                                composerStartRestartGroup.startReplaceGroup(1808158760);
                                if (arrayList != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1808171999);
                                tertiaryTextButton = state.getTertiaryTextButton();
                                if ((tertiaryTextButton == null ? tertiaryTextButton.getTapAction() : null) == null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                Modifier.Companion companion42 = Modifier.INSTANCE;
                                Spacer2.Spacer(Row5.weight$default(row62, companion42, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                MeasurePolicy measurePolicyColumnMeasurePolicy32 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getEnd(), composerStartRestartGroup, 48);
                                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
                                ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor42 = companion52.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy32, companion52.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion52.getSetResolvedCompositionLocals());
                                setCompositeKeyHash4 = companion52.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl4.getInserting()) {
                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion52.getSetModifier());
                                    Column6 column622 = Column6.INSTANCE;
                                    if (state.getEnabled()) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    int i92 = i5;
                                    m25296TextContentOadGlvw(BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM(), jM21427getFg30d7_KjU3, state.getEnabled(), onTap, state.getEndPrimaryTextContent(), null, composerStartRestartGroup, i92, 32);
                                    secondaryRows2 = state.getSecondaryRows();
                                    if (secondaryRows2 == null) {
                                    }
                                    composerStartRestartGroup.startReplaceGroup(655438495);
                                    if (arrayList3 != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    trailingIcon = state.getTrailingIcon();
                                    composerStartRestartGroup.startReplaceGroup(-1109759679);
                                    if (trailingIcon != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.startReplaceGroup(-5755646);
                                    if (state.getIncludeBottomDivider()) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier4;
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
    public static final Unit CryptoOrderReviewRow$lambda$1$lambda$0(CryptoOrderReviewRowState cryptoOrderReviewRowState, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        setCryptoOrderReviewRow(semantics, cryptoOrderReviewRowState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderReviewRow$lambda$4$lambda$3$lambda$2(Function1 function1, CryptoOrderReviewRowState cryptoOrderReviewRowState) {
        CryptoOrderReviewRowState.TapAction rowTapAction = cryptoOrderReviewRowState.getRowTapAction();
        if (rowTapAction == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        function1.invoke(rowTapAction);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoOrderReviewRow$lambda$16$lambda$15$lambda$10$lambda$9$lambda$8 */
    public static final Unit m2803xf3dd2067(Function1 function1, CryptoOrderReviewRowState cryptoOrderReviewRowState) {
        function1.invoke(cryptoOrderReviewRowState.getTertiaryTextButton().getTapAction());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* renamed from: TextContent-OadGlvw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m25296TextContentOadGlvw(final TextStyle textStyle, final long j, final boolean z, final Function1<? super CryptoOrderReviewRowState.TapAction, Unit> function1, final CryptoOrderReviewRowState.TextContent textContent, Modifier modifier, Composer composer, final int i, final int i2) {
        TextStyle textStyle2;
        int i3;
        long j2;
        int i4;
        Modifier modifier2;
        Modifier modifierM4893clickableXHw0xAI$default;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-819896740);
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
        } else {
            if ((i & 48) == 0) {
                j2 = j;
                i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= (i & 32768) == 0 ? composerStartRestartGroup.changed(textContent) : composerStartRestartGroup.changedInstance(textContent) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-819896740, i3, -1, "com.robinhood.shared.crypto.ui.trade.view.TextContent (CryptoOrderReviewRow.kt:147)");
                    }
                    composerStartRestartGroup.startReplaceGroup(-1941740981);
                    if (textContent.getTapAction() == null && z) {
                        Modifier.Companion companion = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean z2 = false;
                        boolean z3 = (i3 & 7168) == 2048;
                        if ((57344 & i3) == 16384 || ((i3 & 32768) != 0 && composerStartRestartGroup.changedInstance(textContent))) {
                            z2 = true;
                        }
                        boolean z4 = z3 | z2;
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoOrderReviewRow3.TextContent_OadGlvw$lambda$19$lambda$18(function1, textContent);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null);
                    } else {
                        modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    final Modifier modifierThen = modifier3.then(modifierM4893clickableXHw0xAI$default);
                    Modifier modifier4 = modifier3;
                    final long j3 = j2;
                    final TextStyle textStyle3 = textStyle2;
                    LocalShowPlaceholder.Loadable(textContent.isLoading(), null, null, ComposableLambda3.rememberComposableLambda(-1571296564, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowKt$TextContent$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            long jM21427getFg30d7_KjU;
                            TextStyle bentoTextStyle;
                            long jM21427getFg30d7_KjU2;
                            long jM21427getFg30d7_KjU3;
                            TextStyle bentoTextStyle2;
                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1571296564, i5, -1, "com.robinhood.shared.crypto.ui.trade.view.TextContent.<anonymous> (CryptoOrderReviewRow.kt:156)");
                            }
                            Color colorM6701boximpl = null;
                            if (textContent.getTrailingIcon() == null) {
                                composer2.startReplaceGroup(352688252);
                                if (z) {
                                    composer2.startReplaceGroup(352791761);
                                    CryptoOrderReviewRowState.ColorOverride textColorOverride = textContent.getTextColorOverride();
                                    Color colorM6701boximpl2 = textColorOverride == null ? null : Color.m6701boximpl(textColorOverride.getBentoColor(composer2, 0));
                                    jM21427getFg30d7_KjU3 = colorM6701boximpl2 != null ? colorM6701boximpl2.getValue() : j3;
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(352896665);
                                    jM21427getFg30d7_KjU3 = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU();
                                    composer2.endReplaceGroup();
                                }
                                FontWeight fontWeightOverride = textContent.getFontWeightOverride();
                                composer2.startReplaceGroup(1812503936);
                                if (z) {
                                    CryptoOrderReviewRowState.TextStyleOverride textStyleOverride = textContent.getTextStyleOverride();
                                    bentoTextStyle2 = textStyleOverride != null ? textStyleOverride.getBentoTextStyle(composer2, 0) : null;
                                    if (bentoTextStyle2 == null) {
                                        bentoTextStyle2 = textStyle3;
                                    }
                                } else {
                                    bentoTextStyle2 = textStyle3;
                                }
                                TextStyle textStyle4 = bentoTextStyle2;
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(textContent.getText(), composer2, StringResource.$stable), modifierThen, Color.m6701boximpl(jM21427getFg30d7_KjU3), null, fontWeightOverride, null, null, 0, false, 0, 0, null, 0, textStyle4, composer2, 0, 0, 8168);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(353341360);
                                if (z) {
                                    composer2.startReplaceGroup(353502281);
                                    CryptoOrderReviewRowState.ColorOverride textColorOverride2 = textContent.getTextColorOverride();
                                    Color colorM6701boximpl3 = textColorOverride2 == null ? null : Color.m6701boximpl(textColorOverride2.getBentoColor(composer2, 0));
                                    jM21427getFg30d7_KjU = colorM6701boximpl3 != null ? colorM6701boximpl3.getValue() : j3;
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(353615121);
                                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU();
                                    composer2.endReplaceGroup();
                                }
                                FontWeight fontWeightOverride2 = textContent.getFontWeightOverride();
                                composer2.startReplaceGroup(1812527632);
                                if (z) {
                                    CryptoOrderReviewRowState.TextStyleOverride textStyleOverride2 = textContent.getTextStyleOverride();
                                    bentoTextStyle = textStyleOverride2 == null ? null : textStyleOverride2.getBentoTextStyle(composer2, 0);
                                    if (bentoTextStyle == null) {
                                        bentoTextStyle = textStyle3;
                                    }
                                } else {
                                    bentoTextStyle = textStyle3;
                                }
                                TextStyle textStyle5 = bentoTextStyle;
                                composer2.endReplaceGroup();
                                String string2 = StringResource2.getString(textContent.getText(), composer2, StringResource.$stable);
                                BentoIcon4 icon = textContent.getTrailingIcon().getIcon();
                                if (z) {
                                    composer2.startReplaceGroup(354187195);
                                    CryptoOrderReviewRowState.ColorOverride colorOverride = textContent.getTrailingIcon().getColorOverride();
                                    composer2.startReplaceGroup(1812542614);
                                    Color colorM6701boximpl4 = colorOverride == null ? null : Color.m6701boximpl(colorOverride.getBentoColor(composer2, 0));
                                    composer2.endReplaceGroup();
                                    if (colorM6701boximpl4 == null) {
                                        CryptoOrderReviewRowState.ColorOverride textColorOverride3 = textContent.getTextColorOverride();
                                        if (textColorOverride3 != null) {
                                            colorM6701boximpl = Color.m6701boximpl(textColorOverride3.getBentoColor(composer2, 0));
                                        }
                                    } else {
                                        colorM6701boximpl = colorM6701boximpl4;
                                    }
                                    jM21427getFg30d7_KjU2 = colorM6701boximpl != null ? colorM6701boximpl.getValue() : j3;
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(354405745);
                                    jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU();
                                    composer2.endReplaceGroup();
                                }
                                BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIconState(string2, icon, null, jM21427getFg30d7_KjU2, Color.m6701boximpl(jM21427getFg30d7_KjU), null, fontWeightOverride2, null, null, 0, false, 0, 0, textStyle5, false, null, null, false, 253856, null), modifierThen, null, null, composer2, BentoTextWithTrailingIconState.$stable, 12);
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoOrderReviewRow3.TextContent_OadGlvw$lambda$20(textStyle, j, z, function1, textContent, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((74899 & i3) != 74898) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(-1941740981);
                if (textContent.getTapAction() == null) {
                    modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
                    composerStartRestartGroup.endReplaceGroup();
                    final Modifier modifierThen2 = modifier3.then(modifierM4893clickableXHw0xAI$default);
                    Modifier modifier42 = modifier3;
                    final long j32 = j2;
                    final TextStyle textStyle32 = textStyle2;
                    LocalShowPlaceholder.Loadable(textContent.isLoading(), null, null, ComposableLambda3.rememberComposableLambda(-1571296564, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowKt$TextContent$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            long jM21427getFg30d7_KjU;
                            TextStyle bentoTextStyle;
                            long jM21427getFg30d7_KjU2;
                            long jM21427getFg30d7_KjU3;
                            TextStyle bentoTextStyle2;
                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1571296564, i5, -1, "com.robinhood.shared.crypto.ui.trade.view.TextContent.<anonymous> (CryptoOrderReviewRow.kt:156)");
                            }
                            Color colorM6701boximpl = null;
                            if (textContent.getTrailingIcon() == null) {
                                composer2.startReplaceGroup(352688252);
                                if (z) {
                                    composer2.startReplaceGroup(352791761);
                                    CryptoOrderReviewRowState.ColorOverride textColorOverride = textContent.getTextColorOverride();
                                    Color colorM6701boximpl2 = textColorOverride == null ? null : Color.m6701boximpl(textColorOverride.getBentoColor(composer2, 0));
                                    jM21427getFg30d7_KjU3 = colorM6701boximpl2 != null ? colorM6701boximpl2.getValue() : j32;
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(352896665);
                                    jM21427getFg30d7_KjU3 = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU();
                                    composer2.endReplaceGroup();
                                }
                                FontWeight fontWeightOverride = textContent.getFontWeightOverride();
                                composer2.startReplaceGroup(1812503936);
                                if (z) {
                                    CryptoOrderReviewRowState.TextStyleOverride textStyleOverride = textContent.getTextStyleOverride();
                                    bentoTextStyle2 = textStyleOverride != null ? textStyleOverride.getBentoTextStyle(composer2, 0) : null;
                                    if (bentoTextStyle2 == null) {
                                        bentoTextStyle2 = textStyle32;
                                    }
                                } else {
                                    bentoTextStyle2 = textStyle32;
                                }
                                TextStyle textStyle4 = bentoTextStyle2;
                                composer2.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(textContent.getText(), composer2, StringResource.$stable), modifierThen2, Color.m6701boximpl(jM21427getFg30d7_KjU3), null, fontWeightOverride, null, null, 0, false, 0, 0, null, 0, textStyle4, composer2, 0, 0, 8168);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(353341360);
                                if (z) {
                                    composer2.startReplaceGroup(353502281);
                                    CryptoOrderReviewRowState.ColorOverride textColorOverride2 = textContent.getTextColorOverride();
                                    Color colorM6701boximpl3 = textColorOverride2 == null ? null : Color.m6701boximpl(textColorOverride2.getBentoColor(composer2, 0));
                                    jM21427getFg30d7_KjU = colorM6701boximpl3 != null ? colorM6701boximpl3.getValue() : j32;
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(353615121);
                                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU();
                                    composer2.endReplaceGroup();
                                }
                                FontWeight fontWeightOverride2 = textContent.getFontWeightOverride();
                                composer2.startReplaceGroup(1812527632);
                                if (z) {
                                    CryptoOrderReviewRowState.TextStyleOverride textStyleOverride2 = textContent.getTextStyleOverride();
                                    bentoTextStyle = textStyleOverride2 == null ? null : textStyleOverride2.getBentoTextStyle(composer2, 0);
                                    if (bentoTextStyle == null) {
                                        bentoTextStyle = textStyle32;
                                    }
                                } else {
                                    bentoTextStyle = textStyle32;
                                }
                                TextStyle textStyle5 = bentoTextStyle;
                                composer2.endReplaceGroup();
                                String string2 = StringResource2.getString(textContent.getText(), composer2, StringResource.$stable);
                                BentoIcon4 icon = textContent.getTrailingIcon().getIcon();
                                if (z) {
                                    composer2.startReplaceGroup(354187195);
                                    CryptoOrderReviewRowState.ColorOverride colorOverride = textContent.getTrailingIcon().getColorOverride();
                                    composer2.startReplaceGroup(1812542614);
                                    Color colorM6701boximpl4 = colorOverride == null ? null : Color.m6701boximpl(colorOverride.getBentoColor(composer2, 0));
                                    composer2.endReplaceGroup();
                                    if (colorM6701boximpl4 == null) {
                                        CryptoOrderReviewRowState.ColorOverride textColorOverride3 = textContent.getTextColorOverride();
                                        if (textColorOverride3 != null) {
                                            colorM6701boximpl = Color.m6701boximpl(textColorOverride3.getBentoColor(composer2, 0));
                                        }
                                    } else {
                                        colorM6701boximpl = colorM6701boximpl4;
                                    }
                                    jM21427getFg30d7_KjU2 = colorM6701boximpl != null ? colorM6701boximpl.getValue() : j32;
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(354405745);
                                    jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU();
                                    composer2.endReplaceGroup();
                                }
                                BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIconState(string2, icon, null, jM21427getFg30d7_KjU2, Color.m6701boximpl(jM21427getFg30d7_KjU), null, fontWeightOverride2, null, null, 0, false, 0, 0, textStyle5, false, null, null, false, 253856, null), modifierThen2, null, null, composer2, BentoTextWithTrailingIconState.$stable, 12);
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        j2 = j;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextContent_OadGlvw$lambda$19$lambda$18(Function1 function1, CryptoOrderReviewRowState.TextContent textContent) {
        CryptoOrderReviewRowState.TapAction tapAction = textContent.getTapAction();
        if (tapAction == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        function1.invoke(tapAction);
        return Unit.INSTANCE;
    }

    public static final SemanticsPropertyKey<CryptoOrderReviewRowState> getCryptoOrderReviewRowSemanticKey() {
        return CryptoOrderReviewRowSemanticKey;
    }

    private static final CryptoOrderReviewRowState getCryptoOrderReviewRow(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return CryptoOrderReviewRowSemanticKey.getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    private static final void setCryptoOrderReviewRow(SemanticsPropertyReceiver semanticsPropertyReceiver, CryptoOrderReviewRowState cryptoOrderReviewRowState) {
        CryptoOrderReviewRowSemanticKey.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], cryptoOrderReviewRowState);
    }

    public static final void OrderReviewPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-103311957);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-103311957, i, -1, "com.robinhood.shared.crypto.ui.trade.view.OrderReviewPreview (CryptoOrderReviewRow.kt:380)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoOrderReviewRow.INSTANCE.m25270getLambda$197435549$lib_crypto_ui_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderReviewRowKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoOrderReviewRow3.OrderReviewPreview$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
