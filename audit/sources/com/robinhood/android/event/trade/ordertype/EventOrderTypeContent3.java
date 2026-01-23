package com.robinhood.android.event.trade.ordertype;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.event.trade.C16465R;
import com.robinhood.android.trade.configuration.C29312R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EventOrderTypeContent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a#\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u000b\u001a#\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u000b\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"EventOrderTypeContent", "", "isBuy", "", "onNotionalInputSelected", "Lkotlin/Function0;", "onQuantityInputSelected", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "QuantityBasedOrderTypeRow", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NotionalOrderTypeRow", "PreviewOrderTypeContent", "(Landroidx/compose/runtime/Composer;I)V", "feature-event-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.trade.ordertype.EventOrderTypeContentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventOrderTypeContent3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventOrderTypeContent$lambda$1(boolean z, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventOrderTypeContent(z, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NotionalOrderTypeRow$lambda$3(boolean z, Function0 function0, int i, Composer composer, int i2) {
        NotionalOrderTypeRow(z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewOrderTypeContent$lambda$4(int i, Composer composer, int i2) {
        PreviewOrderTypeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuantityBasedOrderTypeRow$lambda$2(boolean z, Function0 function0, int i, Composer composer, int i2) {
        QuantityBasedOrderTypeRow(z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventOrderTypeContent(final boolean z, final Function0<Unit> onNotionalInputSelected, final Function0<Unit> onQuantityInputSelected, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onNotionalInputSelected, "onNotionalInputSelected");
        Intrinsics.checkNotNullParameter(onQuantityInputSelected, "onQuantityInputSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(1695258003);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNotionalInputSelected) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onQuantityInputSelected) ? 256 : 128;
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
                    ComposerKt.traceEventStart(1695258003, i3, -1, "com.robinhood.android.event.trade.ordertype.EventOrderTypeContent (EventOrderTypeContent.kt:23)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                if (!z) {
                    i4 = C16465R.string.order_type_buy_orders_title;
                } else {
                    i4 = C16465R.string.order_type_close_orders_title;
                }
                String strStringResource = StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleSmall();
                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 1);
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                NotionalOrderTypeRow(z, onNotionalInputSelected, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                QuantityBasedOrderTypeRow(z, onQuantityInputSelected, composerStartRestartGroup, ((i3 >> 3) & 112) | (i3 & 14));
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.ordertype.EventOrderTypeContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventOrderTypeContent3.EventOrderTypeContent$lambda$1(z, onNotionalInputSelected, onQuantityInputSelected, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                if (!z) {
                }
                String strStringResource2 = StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                TextStyle displayCapsuleSmall2 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleSmall();
                Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(Modifier.INSTANCE, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 1);
                Modifier modifier52 = modifier4;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM21622defaultHorizontalPaddingWMci_g02, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleSmall2, composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                NotionalOrderTypeRow(z, onNotionalInputSelected, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                QuantityBasedOrderTypeRow(z, onQuantityInputSelected, composerStartRestartGroup, ((i3 >> 3) & 112) | (i3 & 14));
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void QuantityBasedOrderTypeRow(final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        int i3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-498663543);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-498663543, i2, -1, "com.robinhood.android.event.trade.ordertype.QuantityBasedOrderTypeRow (EventOrderTypeContent.kt:43)");
            }
            if (BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay()) {
                i3 = C29312R.drawable.svg_shares_order_day;
            } else {
                i3 = C29312R.drawable.svg_shares_order_night;
            }
            BentoBaseRowState.Start.Drawable drawable = new BentoBaseRowState.Start.Drawable(i3, null, null, null, null, 30, null);
            String strStringResource = StringResources_androidKt.stringResource(C16465R.string.order_type_quantity_title, composerStartRestartGroup, 0);
            if (z) {
                i4 = C16465R.string.order_type_quantity_desc_buy;
            } else {
                i4 = C16465R.string.order_type_quantity_desc_close;
            }
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, drawable, strStringResource, StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0), null, null, null, false, false, false, 0L, function0, composerStartRestartGroup, BentoBaseRowState.Start.Drawable.$stable << 3, i2 & 112, 2033);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.ordertype.EventOrderTypeContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventOrderTypeContent3.QuantityBasedOrderTypeRow$lambda$2(z, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void NotionalOrderTypeRow(boolean z, Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        int i3;
        int i4;
        final boolean z2;
        final Function0<Unit> function02;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1369365525);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2;
        if ((i5 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1369365525, i5, -1, "com.robinhood.android.event.trade.ordertype.NotionalOrderTypeRow (EventOrderTypeContent.kt:65)");
            }
            if (BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay()) {
                i3 = C11048R.drawable.svg_dollars_order_day;
            } else {
                i3 = C11048R.drawable.svg_dollars_order_night;
            }
            BentoBaseRowState.Start.Drawable drawable = new BentoBaseRowState.Start.Drawable(i3, null, null, null, null, 30, null);
            BentoBaseRowState.Text.Plain plain = new BentoBaseRowState.Text.Plain(StringResources_androidKt.stringResource(C16465R.string.order_type_notional_title, composerStartRestartGroup, 0));
            if (z) {
                i4 = C16465R.string.order_type_notional_desc_buy;
            } else {
                i4 = C16465R.string.order_type_notional_desc_close;
            }
            BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) drawable, (BentoBaseRowState.Text) plain, new AnnotatedString(StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0), null, 2, null), (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, z, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, (DefaultConstructorMarker) null);
            z2 = z;
            function02 = function0;
            composer2 = composerStartRestartGroup;
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, false, false, false, 0L, function02, composer2, (BentoBaseRowState.$stable << 3) | ((i5 << 15) & 3670016), 61);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
            function02 = function0;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.ordertype.EventOrderTypeContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventOrderTypeContent3.NotionalOrderTypeRow$lambda$3(z2, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewOrderTypeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1725195172);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1725195172, i, -1, "com.robinhood.android.event.trade.ordertype.PreviewOrderTypeContent (EventOrderTypeContent.kt:93)");
            }
            Boolean bool = Boolean.TRUE;
            BentoTheme2.BentoTheme(bool, null, null, null, null, bool, null, null, EventOrderTypeContent.INSTANCE.m14306getLambda$1701907108$feature_event_trade_externalDebug(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.ordertype.EventOrderTypeContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventOrderTypeContent3.PreviewOrderTypeContent$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
