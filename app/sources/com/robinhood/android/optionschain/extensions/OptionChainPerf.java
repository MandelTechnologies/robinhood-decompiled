package com.robinhood.android.optionschain.extensions;

import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OrderSide;
import kotlin.Metadata;
import rosetta.option.OptionType;
import rosetta.order.Side;

/* compiled from: OptionChainPerf.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0005¨\u0006\u0006"}, m3636d2 = {"toRosettaOrderSide", "Lrosetta/order/Side;", "Lcom/robinhood/models/db/OrderSide;", "toRosettaOptionContractType", "Lrosetta/option/OptionType;", "Lcom/robinhood/models/db/OptionContractType;", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.extensions.OptionChainPerfKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainPerf {

    /* compiled from: OptionChainPerf.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.extensions.OptionChainPerfKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionContractType.values().length];
            try {
                iArr2[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Side toRosettaOrderSide(OrderSide orderSide) {
        int i = orderSide == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
        if (i == 1) {
            return Side.BUY;
        }
        if (i == 2) {
            return Side.SELL;
        }
        return Side.SIDE_UNSPECIFIED;
    }

    public static final OptionType toRosettaOptionContractType(OptionContractType optionContractType) {
        int i = optionContractType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[optionContractType.ordinal()];
        if (i == 1) {
            return OptionType.CALL;
        }
        if (i == 2) {
            return OptionType.PUT;
        }
        return OptionType.OPTION_TYPE_UNSPECIFIED;
    }
}
