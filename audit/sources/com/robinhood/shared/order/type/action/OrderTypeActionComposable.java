package com.robinhood.shared.order.type.action;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey5;
import com.robinhood.shared.order.type.C39278R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderTypeActionComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u0018\u0010\f\u001a\u00020\r*\u00020\u00038AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"OrderTypeActionComposable", "", "orderPrices", "Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices;", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "tint", "Landroidx/compose/ui/graphics/Color;", "OrderTypeActionComposable-xqIIw2o", "(Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)V", "actionText", "Lcom/robinhood/utils/resource/StringResource;", "getActionText", "(Lcom/robinhood/shared/crypto/contracts/orderType/OrderPrices;)Lcom/robinhood/utils/resource/StringResource;", "lib-order-type_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.order.type.action.OrderTypeActionComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderTypeActionComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderTypeActionComposable_xqIIw2o$lambda$3(CryptoOrderTypeFragmentKey5 cryptoOrderTypeFragmentKey5, Function0 function0, Modifier modifier, Color color, int i, int i2, Composer composer, int i3) {
        m25568OrderTypeActionComposablexqIIw2o(cryptoOrderTypeFragmentKey5, function0, modifier, color, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* renamed from: OrderTypeActionComposable-xqIIw2o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m25568OrderTypeActionComposablexqIIw2o(final CryptoOrderTypeFragmentKey5 orderPrices, final Function0<Unit> onClick, Modifier modifier, Color color, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Color color2;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Color color3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(orderPrices, "orderPrices");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1217223992);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(orderPrices) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    color2 = color;
                    i3 |= composerStartRestartGroup.changed(color2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    Color color4 = i4 == 0 ? null : color2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1217223992, i3, -1, "com.robinhood.shared.order.type.action.OrderTypeActionComposable (OrderTypeActionComposable.kt:29)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifier5 = modifier4;
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 11, null), false, null, null, onClick, 7, null);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.order.type.action.OrderTypeActionComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OrderTypeActionComposable.OrderTypeActionComposable_xqIIw2o$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierSemantics = SemanticsModifier6.semantics(modifierM4893clickableXHw0xAI$default, true, (Function1) objRememberedValue);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics);
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
                    String string2 = StringResource2.getString(getActionText(orderPrices), composerStartRestartGroup, StringResource.$stable);
                    composerStartRestartGroup.startReplaceGroup(-1608798464);
                    long jM21425getFg0d7_KjU = color4 != null ? bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU() : color4.getValue();
                    composerStartRestartGroup.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 24576, 0, 8170);
                    composerStartRestartGroup = composerStartRestartGroup;
                    BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.CARET_DOWN_12);
                    composerStartRestartGroup.startReplaceGroup(-1608789760);
                    long jM21425getFg0d7_KjU2 = color4 != null ? bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU() : color4.getValue();
                    composerStartRestartGroup.endReplaceGroup();
                    BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM21425getFg0d7_KjU2, null, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 56);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    color3 = color4;
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    color3 = color2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.order.type.action.OrderTypeActionComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OrderTypeActionComposable.OrderTypeActionComposable_xqIIw2o$lambda$3(orderPrices, onClick, modifier3, color3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            color2 = color;
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifier52 = modifier4;
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 11, null), false, null, null, onClick, 7, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierSemantics2 = SemanticsModifier6.semantics(modifierM4893clickableXHw0xAI$default2, true, (Function1) objRememberedValue);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics2);
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
                    String string22 = StringResource2.getString(getActionText(orderPrices), composerStartRestartGroup, StringResource.$stable);
                    composerStartRestartGroup.startReplaceGroup(-1608798464);
                    if (color4 != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(string22, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composerStartRestartGroup, 24576, 0, 8170);
                    composerStartRestartGroup = composerStartRestartGroup;
                    BentoIcon4.Size12 size122 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.CARET_DOWN_12);
                    composerStartRestartGroup.startReplaceGroup(-1608789760);
                    long jM21425getFg0d7_KjU22 = color4 != null ? bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU() : color4.getValue();
                    composerStartRestartGroup.endReplaceGroup();
                    BentoIcon2.m20644BentoIconFU0evQE(size122, null, jM21425getFg0d7_KjU22, null, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 48, 56);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    color3 = color4;
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        color2 = color;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderTypeActionComposable_xqIIw2o$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        return Unit.INSTANCE;
    }

    public static final StringResource getActionText(CryptoOrderTypeFragmentKey5 cryptoOrderTypeFragmentKey5) {
        Intrinsics.checkNotNullParameter(cryptoOrderTypeFragmentKey5, "<this>");
        if (Intrinsics.areEqual(cryptoOrderTypeFragmentKey5, CryptoOrderTypeFragmentKey5.Market.INSTANCE)) {
            return StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_market_action, new Object[0]);
        }
        if (cryptoOrderTypeFragmentKey5 instanceof CryptoOrderTypeFragmentKey5.Limit) {
            return StringResource.INSTANCE.invoke(C39278R.string.crypto_order_types_limit_action, new Object[0]);
        }
        throw new NoWhenBranchMatchedException();
    }
}
