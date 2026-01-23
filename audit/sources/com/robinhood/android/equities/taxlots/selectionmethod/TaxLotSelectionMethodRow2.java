package com.robinhood.android.equities.taxlots.selectionmethod;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.equities.taxlots.UtilsKt;
import com.robinhood.compose.bento.component.BentoChip;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.rosetta.eventlogging.TaxLotsContext;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: TaxLotSelectionMethodRow.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"TaxLotSelectionMethodRow", "", "selectionMethods", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equities/taxlots/selectionmethod/TaxLotSelectionMethod;", "setSelectionStrategy", "Lkotlin/Function2;", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "Ljava/math/BigDecimal;", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "lib-tax-lots_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.taxlots.selectionmethod.TaxLotSelectionMethodRowKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotSelectionMethodRow2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotSelectionMethodRow$lambda$4(ImmutableList immutableList, Function2 function2, int i, Composer composer, int i2) {
        TaxLotSelectionMethodRow(immutableList, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TaxLotSelectionMethodRow(final ImmutableList<TaxLotSelectionMethod> selectionMethods, final Function2<? super SelectionStrategy, ? super BigDecimal, Unit> setSelectionStrategy, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(selectionMethods, "selectionMethods");
        Intrinsics.checkNotNullParameter(setSelectionStrategy, "setSelectionStrategy");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2054873117);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(selectionMethods) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(setSelectionStrategy) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2054873117, i2, -1, "com.robinhood.android.equities.taxlots.selectionmethod.TaxLotSelectionMethodRow (TaxLotSelectionMethodRow.kt:28)");
            }
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Context context = userInteractionEventDescriptor.getContext();
            final EquityOrderContext equity_order_context = context != null ? context.getEquity_order_context() : null;
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 6, null);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(selectionMethods) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(equity_order_context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equities.taxlots.selectionmethod.TaxLotSelectionMethodRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TaxLotSelectionMethodRow2.TaxLotSelectionMethodRow$lambda$3$lambda$2(selectionMethods, userInteractionEventDescriptor, equity_order_context, setSelectionStrategy, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyRow(modifierM5146paddingqDBjuR0$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.taxlots.selectionmethod.TaxLotSelectionMethodRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotSelectionMethodRow2.TaxLotSelectionMethodRow$lambda$4(selectionMethods, setSelectionStrategy, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLotSelectionMethodRow$lambda$3$lambda$2(final ImmutableList immutableList, final UserInteractionEventDescriptor userInteractionEventDescriptor, final EquityOrderContext equityOrderContext, final Function2 function2, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final C14893x1ea3ba57 c14893x1ea3ba57 = new Function1() { // from class: com.robinhood.android.equities.taxlots.selectionmethod.TaxLotSelectionMethodRowKt$TaxLotSelectionMethodRow$lambda$3$lambda$2$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(TaxLotSelectionMethod taxLotSelectionMethod) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((TaxLotSelectionMethod) obj);
            }
        };
        LazyRow.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.equities.taxlots.selectionmethod.TaxLotSelectionMethodRowKt$TaxLotSelectionMethodRow$lambda$3$lambda$2$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c14893x1ea3ba57.invoke(immutableList.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.selectionmethod.TaxLotSelectionMethodRowKt$TaxLotSelectionMethodRow$lambda$3$lambda$2$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:40:0x02dc  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                Object obj;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final TaxLotSelectionMethod taxLotSelectionMethod = (TaxLotSelectionMethod) immutableList.get(i);
                composer.startReplaceGroup(1469501483);
                Context contextCopy$default = null;
                EquityOrderContext equityOrderContextCopy = null;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21597getXxsmallD9Ej5fM(), 0.0f, 2, null);
                Component component = new Component(Component.ComponentType.CHIP, "TAX_LOT_SELECTION_METHOD", null, 4, null);
                Context context = userInteractionEventDescriptor.getContext();
                if (context != null) {
                    EquityOrderContext equityOrderContext2 = equityOrderContext;
                    if (equityOrderContext2 != null) {
                        TaxLotsContext tax_lots_context = equityOrderContext2.getTax_lots_context();
                        equityOrderContextCopy = equityOrderContext2.copy((493567 & 1) != 0 ? equityOrderContext2.instrument_id : null, (493567 & 2) != 0 ? equityOrderContext2.symbol : null, (493567 & 4) != 0 ? equityOrderContext2.side : null, (493567 & 8) != 0 ? equityOrderContext2.type : null, (493567 & 16) != 0 ? equityOrderContext2.trigger : null, (493567 & 32) != 0 ? equityOrderContext2.is_dollar_based_amount : null, (493567 & 64) != 0 ? equityOrderContext2.is_trailing_order : null, (493567 & 128) != 0 ? equityOrderContext2.is_preset_percent_limit_order : null, (493567 & 256) != 0 ? equityOrderContext2.market_hours : null, (493567 & 512) != 0 ? equityOrderContext2.bid_price : null, (493567 & 1024) != 0 ? equityOrderContext2.ask_price : null, (493567 & 2048) != 0 ? equityOrderContext2.bid_ask_timestamp : null, (493567 & 4096) != 0 ? equityOrderContext2.quote_last_cache_timestamp : null, (493567 & 8192) != 0 ? equityOrderContext2.tax_lot_selections : null, (493567 & 16384) != 0 ? equityOrderContext2.tax_lots_context : TaxLotsContext.copy$default(tax_lots_context == null ? new TaxLotsContext(null, null, null, null, 0.0d, 0.0d, 0.0d, null, null, 511, null) : tax_lots_context, null, null, null, null, 0.0d, 0.0d, 0.0d, UtilsKt.toLoggingStrategy(taxLotSelectionMethod.getSelectionStrategy().getSelection_strategy()), null, 383, null), (493567 & 32768) != 0 ? equityOrderContext2.estimated_total_fees : null, (493567 & 65536) != 0 ? equityOrderContext2.position_effect : null, (493567 & 131072) != 0 ? equityOrderContext2.order_entry_point : null, (493567 & 262144) != 0 ? equityOrderContext2.order_input_format : null, (493567 & 524288) != 0 ? equityOrderContext2.unknownFields() : null);
                    }
                    contextCopy$default = Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, equityOrderContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null);
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM5144paddingVpY3zN4$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, contextCopy$default, component, null, 39, null), false, false, false, true, false, null, 110, null);
                String title = taxLotSelectionMethod.getSelectionStrategy().getTitle();
                boolean zIsSelected = taxLotSelectionMethod.isSelected();
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function2) | composer.changedInstance(taxLotSelectionMethod);
                Object objRememberedValue = composer.rememberedValue();
                if (!zChanged) {
                    obj = objRememberedValue;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function2 function22 = function2;
                        Object obj2 = new Function0<Unit>() { // from class: com.robinhood.android.equities.taxlots.selectionmethod.TaxLotSelectionMethodRowKt$TaxLotSelectionMethodRow$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function22.invoke(taxLotSelectionMethod.getSelectionStrategy().getSelection_strategy(), null);
                            }
                        };
                        composer.updateRememberedValue(obj2);
                        obj = obj2;
                    }
                }
                composer.endReplaceGroup();
                BentoChip.BentoSelectionChip((Function0) obj, modifierAutoLogEvents$default, false, zIsSelected, null, title, composer, 0, 20);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
