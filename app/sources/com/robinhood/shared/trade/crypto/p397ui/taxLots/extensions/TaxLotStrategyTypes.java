package com.robinhood.shared.trade.crypto.p397ui.taxLots.extensions;

import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nummus.p512v1.TaxLotStrategyType;

/* compiled from: TaxLotStrategyTypes.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"displayName", "Lcom/robinhood/utils/resource/StringResource;", "Lnummus/v1/TaxLotStrategyType;", "getDisplayName", "(Lnummus/v1/TaxLotStrategyType;)Lcom/robinhood/utils/resource/StringResource;", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.extensions.TaxLotStrategyTypesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TaxLotStrategyTypes {

    /* compiled from: TaxLotStrategyTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.extensions.TaxLotStrategyTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaxLotStrategyType.values().length];
            try {
                iArr[TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_FIRST_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_LAST_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_HIGHEST_COST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_LOWEST_COST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_CUSTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getDisplayName(TaxLotStrategyType taxLotStrategyType) {
        int i;
        Intrinsics.checkNotNullParameter(taxLotStrategyType, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        switch (WhenMappings.$EnumSwitchMapping$0[taxLotStrategyType.ordinal()]) {
            case 1:
                throw new IllegalStateException("Unsupported tax lot strategy");
            case 2:
                i = C40095R.string.crypto_tax_lot_first_in_display_name;
                break;
            case 3:
                i = C40095R.string.crypto_tax_lot_last_in_display_name;
                break;
            case 4:
                i = C40095R.string.crypto_tax_lot_highest_cost_display_name;
                break;
            case 5:
                i = C40095R.string.crypto_tax_lot_lowest_cost_display_name;
                break;
            case 6:
                i = C40095R.string.crypto_tax_lot_custom_display_name;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return companion.invoke(i, new Object[0]);
    }
}
