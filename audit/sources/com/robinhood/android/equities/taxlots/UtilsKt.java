package com.robinhood.android.equities.taxlots;

import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.rosetta.eventlogging.TaxLotsContext;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import equity_trading_tax_lots.proto.p460v1.TaxLotSort;
import equity_trading_tax_lots.proto.p460v1.TaxLotTerm;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\u0001¢\u0006\u0002\u0010\u0005\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0004H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\nH\u0000\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\r¨\u0006\u000e"}, m3636d2 = {"stringValue", "", "Lequity_trading_tax_lots/proto/v1/TaxLotTerm;", "(Lequity_trading_tax_lots/proto/v1/TaxLotTerm;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Lequity_trading_tax_lots/proto/v1/TaxLotSort;", "(Lequity_trading_tax_lots/proto/v1/TaxLotSort;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "headerAlignment", "Landroidx/compose/ui/Alignment;", "isIntegerValue", "", "Ljava/math/BigDecimal;", "toLoggingStrategy", "Lcom/robinhood/rosetta/eventlogging/TaxLotsContext$SelectionStrategy;", "Lequity_trading_tax_lots/proto/v1/SelectionStrategy;", "lib-tax-lots_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class UtilsKt {

    /* compiled from: Utils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[TaxLotTerm.values().length];
            try {
                iArr[TaxLotTerm.MIXED_TERM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaxLotTerm.OTHER_TERM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaxLotTerm.TAX_LOT_TERM_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TaxLotTerm.SHORT_TERM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TaxLotTerm.LONG_TERM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TaxLotSort.values().length];
            try {
                iArr2[TaxLotSort.TAX_LOT_SORT_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TaxLotSort.DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[TaxLotSort.COST_BASIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[TaxLotSort.GAIN_LOSS.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[TaxLotSort.SHARES.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SelectionStrategy.values().length];
            try {
                iArr3[SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[SelectionStrategy.SELECTION_STRATEGY_FIRST_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[SelectionStrategy.SELECTION_STRATEGY_LAST_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[SelectionStrategy.SELECTION_STRATEGY_HIGHEST_COST.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[SelectionStrategy.SELECTION_STRATEGY_LOWEST_COST.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[SelectionStrategy.SELECTION_STRATEGY_CUSTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final String stringValue(TaxLotTerm taxLotTerm, Composer composer, int i) {
        String strStringResource;
        Intrinsics.checkNotNullParameter(taxLotTerm, "<this>");
        composer.startReplaceGroup(568827146);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(568827146, i, -1, "com.robinhood.android.equities.taxlots.stringValue (Utils.kt:12)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[taxLotTerm.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            composer.startReplaceGroup(-2011272844);
            composer.endReplaceGroup();
            strStringResource = "";
        } else if (i2 == 4) {
            composer.startReplaceGroup(1182047317);
            strStringResource = StringResources_androidKt.stringResource(C14807R.string.tax_lot_short_term, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 5) {
                composer.startReplaceGroup(1182042647);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(1182049620);
            strStringResource = StringResources_androidKt.stringResource(C14807R.string.tax_lot_long_term, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }

    public static final String stringValue(TaxLotSort taxLotSort, Composer composer, int i) {
        String strStringResource;
        Intrinsics.checkNotNullParameter(taxLotSort, "<this>");
        composer.startReplaceGroup(-1678148328);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1678148328, i, -1, "com.robinhood.android.equities.taxlots.stringValue (Utils.kt:23)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[taxLotSort.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-297405818);
            composer.endReplaceGroup();
            strStringResource = "";
        } else if (i2 == 2) {
            composer.startReplaceGroup(-2087802831);
            strStringResource = StringResources_androidKt.stringResource(C14807R.string.select_tax_lot_table_header_date, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 3) {
            composer.startReplaceGroup(-2087800041);
            strStringResource = StringResources_androidKt.stringResource(C14807R.string.select_tax_lot_table_header_cost_basis, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 4) {
            composer.startReplaceGroup(-2087797098);
            strStringResource = StringResources_androidKt.stringResource(C14807R.string.select_tax_lot_table_header_gain_loss, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 5) {
                composer.startReplaceGroup(-2087805133);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-2087794285);
            strStringResource = StringResources_androidKt.stringResource(C14807R.string.select_tax_lot_table_header_shares, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }

    public static final Alignment headerAlignment(TaxLotSort taxLotSort) {
        Intrinsics.checkNotNullParameter(taxLotSort, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[taxLotSort.ordinal()];
        if (i == 1) {
            return Alignment.INSTANCE.getCenter();
        }
        if (i == 2) {
            return Alignment.INSTANCE.getCenter();
        }
        if (i == 3) {
            return Alignment.INSTANCE.getCenterEnd();
        }
        if (i == 4) {
            return Alignment.INSTANCE.getCenterEnd();
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return Alignment.INSTANCE.getCenter();
    }

    public static final boolean isIntegerValue(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.signum() == 0 || bigDecimal.scale() <= 0 || zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal).scale() <= 0;
    }

    public static final TaxLotsContext.SelectionStrategy toLoggingStrategy(SelectionStrategy selectionStrategy) {
        Intrinsics.checkNotNullParameter(selectionStrategy, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$2[selectionStrategy.ordinal()]) {
            case 1:
                return TaxLotsContext.SelectionStrategy.SELECTION_STRATEGY_UNSPECIFIED;
            case 2:
                return TaxLotsContext.SelectionStrategy.FIRST_IN;
            case 3:
                return TaxLotsContext.SelectionStrategy.LAST_IN;
            case 4:
                return TaxLotsContext.SelectionStrategy.HIGHEST_COST;
            case 5:
                return TaxLotsContext.SelectionStrategy.LOWEST_COST;
            case 6:
                return TaxLotsContext.SelectionStrategy.CUSTOM;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
