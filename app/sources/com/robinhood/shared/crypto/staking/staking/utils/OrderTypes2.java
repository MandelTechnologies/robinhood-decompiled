package com.robinhood.shared.crypto.staking.staking.utils;

import com.robinhood.models.api.staking.ApiCryptoStakingOrder;
import com.robinhood.shared.staking.contracts.CryptoStakingIntentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypes.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"apiOrderType", "Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;", "Lcom/robinhood/shared/staking/contracts/CryptoStakingIntentKey$OrderType;", "getApiOrderType", "(Lcom/robinhood/shared/staking/contracts/CryptoStakingIntentKey$OrderType;)Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;", "feature-crypto-staking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.utils.OrderTypesKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class OrderTypes2 {

    /* compiled from: OrderTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.staking.staking.utils.OrderTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoStakingIntentKey.OrderType.values().length];
            try {
                iArr[CryptoStakingIntentKey.OrderType.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoStakingIntentKey.OrderType.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ApiCryptoStakingOrder.OrderType getApiOrderType(CryptoStakingIntentKey.OrderType orderType) {
        Intrinsics.checkNotNullParameter(orderType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[orderType.ordinal()];
        if (i == 1) {
            return ApiCryptoStakingOrder.OrderType.DEPOSIT;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return ApiCryptoStakingOrder.OrderType.WITHDRAW;
    }
}
