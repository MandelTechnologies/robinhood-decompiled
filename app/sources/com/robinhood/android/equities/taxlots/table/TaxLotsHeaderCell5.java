package com.robinhood.android.equities.taxlots.table;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equities.taxlots.UtilsKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.rosetta.eventlogging.TaxLotsContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import equity_trading_tax_lots.proto.p460v1.TaxLotSort;
import equity_trading_tax_lots.proto.p460v1.TaxLotSortDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLotsHeaderCell.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0002\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002"}, m3636d2 = {"TaxLotsHeaderCellComposable", "", "taxLotsHeaderCell", "Lcom/robinhood/android/equities/taxlots/table/TaxLotsHeaderCell;", "width", "Landroidx/compose/ui/unit/Dp;", "height", "modifier", "Landroidx/compose/ui/Modifier;", "TaxLotsHeaderCellComposable-UmHF5L4", "(Lcom/robinhood/android/equities/taxlots/table/TaxLotsHeaderCell;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SortDirectionWithGradientBackground", "Landroidx/compose/foundation/layout/BoxScope;", "SortDirectionWithGradientBackground-l39uw8o", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/robinhood/android/equities/taxlots/table/TaxLotsHeaderCell;Landroidx/compose/ui/unit/Dp;Landroidx/compose/runtime/Composer;I)V", "toLoggable", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SortType;", "Lequity_trading_tax_lots/proto/v1/TaxLotSort;", "TaxLotsHeaderCellPreview", "(Landroidx/compose/runtime/Composer;I)V", "TaxLotsHeaderCellPreviewNoArrow", "lib-tax-lots_externalDebug", "headerTextSize", "Landroidx/compose/ui/unit/IntSize;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotsHeaderCellKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotsHeaderCell5 {

    /* compiled from: TaxLotsHeaderCell.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.taxlots.table.TaxLotsHeaderCellKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TaxLotSortDirection.values().length];
            try {
                iArr[TaxLotSortDirection.ACCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TaxLotSort.values().length];
            try {
                iArr2[TaxLotSort.SHARES.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[TaxLotSort.TAX_LOT_SORT_UNSPECIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TaxLotSort.DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TaxLotSort.COST_BASIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TaxLotSort.GAIN_LOSS.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SortDirectionWithGradientBackground_l39uw8o$lambda$10(BoxScope boxScope, TaxLotsHeaderCell taxLotsHeaderCell, C2002Dp c2002Dp, int i, Composer composer, int i2) {
        m13650SortDirectionWithGradientBackgroundl39uw8o(boxScope, taxLotsHeaderCell, c2002Dp, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsHeaderCellComposable_UmHF5L4$lambda$4(TaxLotsHeaderCell taxLotsHeaderCell, C2002Dp c2002Dp, C2002Dp c2002Dp2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m13651TaxLotsHeaderCellComposableUmHF5L4(taxLotsHeaderCell, c2002Dp, c2002Dp2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsHeaderCellPreview$lambda$11(int i, Composer composer, int i2) {
        TaxLotsHeaderCellPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsHeaderCellPreviewNoArrow$lambda$12(int i, Composer composer, int i2) {
        TaxLotsHeaderCellPreviewNoArrow(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: TaxLotsHeaderCellComposable-UmHF5L4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13651TaxLotsHeaderCellComposableUmHF5L4(final TaxLotsHeaderCell taxLotsHeaderCell, final C2002Dp c2002Dp, final C2002Dp c2002Dp2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Context context;
        UserInteractionEventData.Action action;
        final Modifier modifier3;
        EquityOrderContext equity_order_context;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(taxLotsHeaderCell, "taxLotsHeaderCell");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1424796630);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(taxLotsHeaderCell) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(c2002Dp) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(c2002Dp2) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1424796630, i3, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsHeaderCellComposable (TaxLotsHeaderCell.kt:64)");
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                composerStartRestartGroup.startReplaceGroup(865051655);
                composerStartRestartGroup.startReplaceGroup(865045842);
                context = userInteractionEventDescriptor.getContext();
                Context contextCopy$default = null;
                equityOrderContextCopy = null;
                EquityOrderContext equityOrderContextCopy = null;
                if (context != null) {
                    Context context2 = userInteractionEventDescriptor.getContext();
                    if (context2 != null && (equity_order_context = context2.getEquity_order_context()) != null) {
                        equityOrderContextCopy = equity_order_context.copy((493567 & 1) != 0 ? equity_order_context.instrument_id : null, (493567 & 2) != 0 ? equity_order_context.symbol : null, (493567 & 4) != 0 ? equity_order_context.side : null, (493567 & 8) != 0 ? equity_order_context.type : null, (493567 & 16) != 0 ? equity_order_context.trigger : null, (493567 & 32) != 0 ? equity_order_context.is_dollar_based_amount : null, (493567 & 64) != 0 ? equity_order_context.is_trailing_order : null, (493567 & 128) != 0 ? equity_order_context.is_preset_percent_limit_order : null, (493567 & 256) != 0 ? equity_order_context.market_hours : null, (493567 & 512) != 0 ? equity_order_context.bid_price : null, (493567 & 1024) != 0 ? equity_order_context.ask_price : null, (493567 & 2048) != 0 ? equity_order_context.bid_ask_timestamp : null, (493567 & 4096) != 0 ? equity_order_context.quote_last_cache_timestamp : null, (493567 & 8192) != 0 ? equity_order_context.tax_lot_selections : null, (493567 & 16384) != 0 ? equity_order_context.tax_lots_context : new TaxLotsContext(null, null, null, toLoggable(taxLotsHeaderCell.getValue()), 0.0d, 0.0d, 0.0d, null, null, 503, null), (493567 & 32768) != 0 ? equity_order_context.estimated_total_fees : null, (493567 & 65536) != 0 ? equity_order_context.position_effect : null, (493567 & 131072) != 0 ? equity_order_context.order_entry_point : null, (493567 & 262144) != 0 ? equity_order_context.order_input_format : null, (493567 & 524288) != 0 ? equity_order_context.unknownFields() : null);
                    }
                    contextCopy$default = Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, equityOrderContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null);
                }
                Context context3 = contextCopy$default;
                Component component = new Component(Component.ComponentType.LIST_HEADER, "tax_lots.table.sort", null, 4, null);
                if (taxLotsHeaderCell.getSortDirection() != TaxLotSortDirection.ACCENDING) {
                    action = UserInteractionEventData.Action.SORT_DESCENDING;
                } else {
                    action = UserInteractionEventData.Action.SORT_ASCENDING;
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier2, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, context3, component, null, 35, null), false, false, false, true, false, null, 110, null);
                Modifier modifier4 = modifier2;
                if (taxLotsHeaderCell.isSortable()) {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object[] objArr = (i3 & 14) == 4;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objArr != false || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsHeaderCellKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TaxLotsHeaderCell5.TaxLotsHeaderCellComposable_UmHF5L4$lambda$2$lambda$1$lambda$0(taxLotsHeaderCell);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifierAutoLogEvents$default = ClickableKt.m4893clickableXHw0xAI$default(modifierAutoLogEvents$default, false, null, null, (Function0) objRememberedValue, 7, null);
                }
                Modifier modifierTestTag = modifierAutoLogEvents$default;
                composerStartRestartGroup.endReplaceGroup();
                if ((c2002Dp2 == null && c2002Dp != null) != false) {
                    modifierTestTag = TestTag3.testTag(modifierTestTag, UtilsKt.stringValue(taxLotsHeaderCell.getValue(), composerStartRestartGroup, 0) + "_" + taxLotsHeaderCell.getSortDirection());
                }
                composerStartRestartGroup.endReplaceGroup();
                int i5 = i3 >> 3;
                TaxLotsTableHelpers5.m13659TaxLotsBaseCell4xCAqhw(c2002Dp, c2002Dp2, modifierTestTag, taxLotsHeaderCell.getContentAlignment(), null, ComposableLambda3.rememberComposableLambda(1555692497, true, new TaxLotsHeaderCell6(c2002Dp, taxLotsHeaderCell, c2002Dp2), composerStartRestartGroup, 54), composerStartRestartGroup, (i5 & 14) | 196608 | (i5 & 112), 16);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsHeaderCellKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TaxLotsHeaderCell5.TaxLotsHeaderCellComposable_UmHF5L4$lambda$4(taxLotsHeaderCell, c2002Dp, c2002Dp2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            composerStartRestartGroup.startReplaceGroup(865051655);
            composerStartRestartGroup.startReplaceGroup(865045842);
            context = userInteractionEventDescriptor2.getContext();
            Context contextCopy$default2 = null;
            equityOrderContextCopy = null;
            EquityOrderContext equityOrderContextCopy2 = null;
            if (context != null) {
            }
            Context context32 = contextCopy$default2;
            Component component2 = new Component(Component.ComponentType.LIST_HEADER, "tax_lots.table.sort", null, 4, null);
            if (taxLotsHeaderCell.getSortDirection() != TaxLotSortDirection.ACCENDING) {
            }
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier2, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, action, context32, component2, null, 35, null), false, false, false, true, false, null, 110, null);
            Modifier modifier42 = modifier2;
            if (taxLotsHeaderCell.isSortable()) {
            }
            Modifier modifierTestTag2 = modifierAutoLogEvents$default2;
            composerStartRestartGroup.endReplaceGroup();
            if (c2002Dp2 == null) {
                if ((c2002Dp2 == null && c2002Dp != null) != false) {
                }
                composerStartRestartGroup.endReplaceGroup();
                int i52 = i3 >> 3;
                TaxLotsTableHelpers5.m13659TaxLotsBaseCell4xCAqhw(c2002Dp, c2002Dp2, modifierTestTag2, taxLotsHeaderCell.getContentAlignment(), null, ComposableLambda3.rememberComposableLambda(1555692497, true, new TaxLotsHeaderCell6(c2002Dp, taxLotsHeaderCell, c2002Dp2), composerStartRestartGroup, 54), composerStartRestartGroup, (i52 & 14) | 196608 | (i52 & 112), 16);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotsHeaderCellComposable_UmHF5L4$lambda$2$lambda$1$lambda$0(TaxLotsHeaderCell taxLotsHeaderCell) {
        taxLotsHeaderCell.getOnClick().invoke(taxLotsHeaderCell.getValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SortDirectionWithGradientBackground-l39uw8o, reason: not valid java name */
    public static final void m13650SortDirectionWithGradientBackgroundl39uw8o(final BoxScope boxScope, final TaxLotsHeaderCell taxLotsHeaderCell, final C2002Dp c2002Dp, Composer composer, final int i) {
        int i2;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        long jM6725getTransparent0d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(1279969996);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(taxLotsHeaderCell) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(c2002Dp) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1279969996, i2, -1, "com.robinhood.android.equities.taxlots.table.SortDirectionWithGradientBackground (TaxLotsHeaderCell.kt:155)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            final long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU();
            composerStartRestartGroup.startReplaceGroup(1690530544);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(18));
            if (c2002Dp != null) {
                c2002Dp.getValue();
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(modifierM5174width3ABfNKs, 0.0f, 1, null);
                if (modifierFillMaxHeight$default != null) {
                    modifierM5174width3ABfNKs = modifierFillMaxHeight$default;
                }
            }
            if (taxLotsHeaderCell.isActiveSort()) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged = composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsHeaderCellKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TaxLotsHeaderCell5.m1954x85c8e18d(jM21371getBg0d7_KjU, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifierM5174width3ABfNKs = DrawModifierKt.drawBehind(modifierM5174width3ABfNKs, (Function1) objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierZIndex = ZIndexModifier2.zIndex(modifierM5174width3ABfNKs, 2.0f);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(modifierZIndex, companion2.getCenterStart());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenterStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (WhenMappings.$EnumSwitchMapping$0[taxLotsHeaderCell.getSortDirection().ordinal()] == 1) {
                serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.ARROW_UP_12;
            } else {
                serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.ARROW_DOWN_12;
            }
            BentoIcon4.Size12 size12 = new BentoIcon4.Size12(serverToBentoAssetMapper2);
            composerStartRestartGroup.startReplaceGroup(261246433);
            if (taxLotsHeaderCell.isActiveSort()) {
                jM6725getTransparent0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
            } else {
                jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
            }
            long j = jM6725getTransparent0d7_KjU;
            composerStartRestartGroup.endReplaceGroup();
            BentoIcon2.m20644BentoIconFU0evQE(size12, null, j, companion, null, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | 3120, 48);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsHeaderCellKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotsHeaderCell5.SortDirectionWithGradientBackground_l39uw8o$lambda$10(boxScope, taxLotsHeaderCell, c2002Dp, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SortDirectionWithGradientBackground_l39uw8o$lambda$8$lambda$7$lambda$6 */
    public static final Unit m1954x85c8e18d(long j, DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        DrawScope.m6957drawRectAsUm42w$default(drawBehind, Brush.Companion.m6676horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(j), Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU())}), Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32)) / 2.0f, Float.POSITIVE_INFINITY, 0, 8, (Object) null), 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        return Unit.INSTANCE;
    }

    private static final TaxLotsContext.SortType toLoggable(TaxLotSort taxLotSort) {
        int i = WhenMappings.$EnumSwitchMapping$1[taxLotSort.ordinal()];
        if (i == 1 || i == 2) {
            return TaxLotsContext.SortType.SORT_TYPE_UNSPECIFIED;
        }
        if (i == 3) {
            return TaxLotsContext.SortType.DATE;
        }
        if (i == 4) {
            return TaxLotsContext.SortType.COST_SHARE;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return TaxLotsContext.SortType.GAIN_LOSS;
    }

    public static final void TaxLotsHeaderCellPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(766754852);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(766754852, i, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsHeaderCellPreview (TaxLotsHeaderCell.kt:205)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TaxLotsHeaderCell2.INSTANCE.getLambda$1540841436$lib_tax_lots_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsHeaderCellKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotsHeaderCell5.TaxLotsHeaderCellPreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TaxLotsHeaderCellPreviewNoArrow(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-412805904);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-412805904, i, -1, "com.robinhood.android.equities.taxlots.table.TaxLotsHeaderCellPreviewNoArrow (TaxLotsHeaderCell.kt:258)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TaxLotsHeaderCell2.INSTANCE.m13625getLambda$1600596424$lib_tax_lots_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.table.TaxLotsHeaderCellKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotsHeaderCell5.TaxLotsHeaderCellPreviewNoArrow$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
