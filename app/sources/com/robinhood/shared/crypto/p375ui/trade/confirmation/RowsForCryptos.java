package com.robinhood.shared.crypto.p375ui.trade.confirmation;

import com.robinhood.android.crypto.lib.UiCryptoOrders;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.crypto.p314db.fee.CryptoFee;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.crypto.p375ui.trade.confirmation.BaseCryptoConfirmationState;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.utils.math.BigDecimals7;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RowsForCryptos.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, m3636d2 = {"createRowsForCryptos", "", "Lcom/robinhood/shared/crypto/ui/trade/confirmation/BaseCryptoConfirmationState$CryptoOrderConfirmationRowType;", "Lcom/robinhood/shared/crypto/ui/trade/confirmation/BaseCryptoConfirmationState;", "uiCryptoOrder", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.ui.trade.confirmation.RowsForCryptosKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class RowsForCryptos {

    /* compiled from: RowsForCryptos.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.ui.trade.confirmation.RowsForCryptosKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CryptoOrderType.values().length];
            try {
                iArr[CryptoOrderType.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoOrderType.MARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoOrderType.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoOrderType.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderSide.values().length];
            try {
                iArr2[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OrderState.values().length];
            try {
                iArr3[OrderState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[OrderState.UNCONFIRMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[OrderState.CONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[OrderState.TRIGGERED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[OrderState.QUEUED.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[OrderState.PARTIALLY_FILLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[OrderState.PARTIALLY_FILLED_REST_CANCELLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[OrderState.FILLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[OrderState.REJECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[OrderState.FAILED.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[OrderState.CANCELED.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[OrderState.PENDING_CANCELLED.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[OrderState.VOIDED.ordinal()] = 13;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[OrderState.NOT_ACCEPTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final List<BaseCryptoConfirmationState.CryptoOrderConfirmationRowType> createRowsForCryptos(BaseCryptoConfirmationState baseCryptoConfirmationState, UiCryptoOrder uiCryptoOrder, UiCurrencyPair uiCurrencyPair) {
        BaseCryptoConfirmationState.CryptoOrderConfirmationRowType cryptoOrderConfirmationRowType;
        BaseCryptoConfirmationState.CryptoOrderConfirmationRowType cryptoOrderConfirmationRowType2;
        BaseCryptoConfirmationState.CryptoOrderConfirmationRowType cryptoOrderConfirmationRowType3;
        BaseCryptoConfirmationState.CryptoOrderConfirmationRowType cryptoOrderConfirmationRowType4;
        BaseCryptoConfirmationState.CryptoOrderConfirmationRowType cryptoOrderConfirmationRowType5;
        Intrinsics.checkNotNullParameter(baseCryptoConfirmationState, "<this>");
        Intrinsics.checkNotNullParameter(uiCryptoOrder, "uiCryptoOrder");
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        boolean z = false;
        boolean z2 = baseCryptoConfirmationState.isRhcApp() && BigDecimals7.isZero(uiCurrencyPair.getQuoteFee());
        CryptoFee cryptoFee = UiCryptoOrders.getCryptoFee(uiCryptoOrder);
        if ((cryptoFee instanceof CryptoFee.FixedRateFee) || (cryptoFee instanceof CryptoFee.VolumeTieredFee)) {
            z = true;
        } else if (!(cryptoFee instanceof CryptoFee.Unspecified) && cryptoFee != null) {
            throw new NoWhenBranchMatchedException();
        }
        switch (WhenMappings.$EnumSwitchMapping$2[uiCryptoOrder.getCryptoOrder().getState().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                int i = WhenMappings.$EnumSwitchMapping$1[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
                if (i == 1) {
                    if (uiCryptoOrder.getCryptoOrder().getHasTradeBonus()) {
                        List listCreateListBuilder = CollectionsKt.createListBuilder();
                        if (z2) {
                            listCreateListBuilder.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ROBINHOOD_FEE);
                        }
                        listCreateListBuilder.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ESTIMATED_COST_CREDIT_BREAKDOWN);
                        int i2 = WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
                        if (i2 == 1) {
                            cryptoOrderConfirmationRowType2 = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.LIMIT_PRICE;
                        } else if (i2 == 2) {
                            cryptoOrderConfirmationRowType2 = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ESTIMATED_PRICE;
                        } else if (i2 == 3) {
                            cryptoOrderConfirmationRowType2 = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.STOP_PRICE;
                        } else {
                            if (i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cryptoOrderConfirmationRowType2 = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.LIMIT_PRICE;
                        }
                        listCreateListBuilder.add(cryptoOrderConfirmationRowType2);
                        listCreateListBuilder.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ESTIMATED_CRYPTO_BREAKDOWN);
                        listCreateListBuilder.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ESTIMATED_CRYPTO_TOTAL);
                        listCreateListBuilder.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ACCOUNT_NAME);
                        return CollectionsKt.build(listCreateListBuilder);
                    }
                    List listCreateListBuilder2 = CollectionsKt.createListBuilder();
                    listCreateListBuilder2.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ESTIMATED_CRYPTO_BREAKDOWN);
                    int i3 = WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
                    if (i3 == 1) {
                        cryptoOrderConfirmationRowType = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.LIMIT_PRICE;
                    } else if (i3 == 2) {
                        cryptoOrderConfirmationRowType = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ESTIMATED_PRICE;
                    } else if (i3 == 3) {
                        cryptoOrderConfirmationRowType = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.STOP_PRICE;
                    } else {
                        if (i3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cryptoOrderConfirmationRowType = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.LIMIT_PRICE;
                    }
                    listCreateListBuilder2.add(cryptoOrderConfirmationRowType);
                    if (z) {
                        listCreateListBuilder2.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.FEE);
                    } else if (z2) {
                        listCreateListBuilder2.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ROBINHOOD_FEE);
                    }
                    listCreateListBuilder2.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ESTIMATED_COST_CREDIT_BREAKDOWN);
                    listCreateListBuilder2.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ACCOUNT_NAME);
                    return CollectionsKt.build(listCreateListBuilder2);
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (uiCryptoOrder.getCryptoOrder().getHasTradeBonus()) {
                    List listCreateListBuilder3 = CollectionsKt.createListBuilder();
                    if (z2) {
                        listCreateListBuilder3.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ROBINHOOD_FEE);
                    }
                    if (uiCryptoOrder.getCryptoOrder().getQuoteTradeBonus() == null) {
                        listCreateListBuilder3.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ESTIMATED_COST_CREDIT_TOTAL);
                    }
                    int i4 = WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
                    if (i4 == 1) {
                        cryptoOrderConfirmationRowType4 = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.LIMIT_PRICE;
                    } else if (i4 == 2) {
                        cryptoOrderConfirmationRowType4 = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ESTIMATED_PRICE;
                    } else if (i4 == 3) {
                        cryptoOrderConfirmationRowType4 = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.STOP_PRICE;
                    } else {
                        if (i4 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cryptoOrderConfirmationRowType4 = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.LIMIT_PRICE;
                    }
                    listCreateListBuilder3.add(cryptoOrderConfirmationRowType4);
                    listCreateListBuilder3.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ESTIMATED_CRYPTO_BREAKDOWN);
                    if (uiCryptoOrder.getCryptoOrder().getQuoteTradeBonus() != null) {
                        listCreateListBuilder3.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ESTIMATED_COST_CREDIT_BREAKDOWN);
                        listCreateListBuilder3.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ESTIMATED_COST_CREDIT_TOTAL);
                    }
                    listCreateListBuilder3.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ACCOUNT_NAME);
                    return CollectionsKt.build(listCreateListBuilder3);
                }
                List listCreateListBuilder4 = CollectionsKt.createListBuilder();
                listCreateListBuilder4.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ESTIMATED_CRYPTO_BREAKDOWN);
                int i5 = WhenMappings.$EnumSwitchMapping$0[uiCryptoOrder.getCryptoOrder().getType().ordinal()];
                if (i5 == 1) {
                    cryptoOrderConfirmationRowType3 = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.LIMIT_PRICE;
                } else if (i5 == 2) {
                    cryptoOrderConfirmationRowType3 = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ESTIMATED_PRICE;
                } else if (i5 == 3) {
                    cryptoOrderConfirmationRowType3 = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.STOP_PRICE;
                } else {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cryptoOrderConfirmationRowType3 = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.LIMIT_PRICE;
                }
                listCreateListBuilder4.add(cryptoOrderConfirmationRowType3);
                listCreateListBuilder4.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.LOTS_SELECTED);
                if (z) {
                    listCreateListBuilder4.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.FEE);
                } else if (z2) {
                    listCreateListBuilder4.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ROBINHOOD_FEE);
                }
                listCreateListBuilder4.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ESTIMATED_COST_CREDIT_BREAKDOWN);
                listCreateListBuilder4.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ACCOUNT_NAME);
                return CollectionsKt.build(listCreateListBuilder4);
            case 6:
            case 7:
                if (uiCryptoOrder.getCryptoOrder().getState() == OrderState.PARTIALLY_FILLED) {
                    cryptoOrderConfirmationRowType5 = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.CRYPTO_PURCHASED_OR_SOLD_AS_SUBTOTAL;
                } else {
                    cryptoOrderConfirmationRowType5 = BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.CRYPTO_PURCHASED_OR_SOLD_BREAKDOWN;
                }
                if (uiCryptoOrder.getCryptoOrder().getHasTradeBonus()) {
                    List listCreateListBuilder5 = CollectionsKt.createListBuilder();
                    if (z2) {
                        listCreateListBuilder5.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ROBINHOOD_FEE);
                    }
                    listCreateListBuilder5.addAll(CollectionsKt.listOf((Object[]) new BaseCryptoConfirmationState.CryptoOrderConfirmationRowType[]{BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.AMOUNT_BREAKDOWN, BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.PRICE_AT_EXECUTION, cryptoOrderConfirmationRowType5, BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.PENDING_CRYPTO, BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ACCOUNT_NAME}));
                    return CollectionsKt.build(listCreateListBuilder5);
                }
                List listCreateListBuilder6 = CollectionsKt.createListBuilder();
                listCreateListBuilder6.addAll(CollectionsKt.listOf((Object[]) new BaseCryptoConfirmationState.CryptoOrderConfirmationRowType[]{cryptoOrderConfirmationRowType5, BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.PRICE_AT_EXECUTION}));
                listCreateListBuilder6.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.LOTS_SELECTED);
                if (z) {
                    listCreateListBuilder6.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.FEE);
                } else if (z2) {
                    listCreateListBuilder6.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ROBINHOOD_FEE);
                }
                listCreateListBuilder6.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.AMOUNT_TOTAL);
                listCreateListBuilder6.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ACCOUNT_NAME);
                return CollectionsKt.build(listCreateListBuilder6);
            case 8:
                int i6 = WhenMappings.$EnumSwitchMapping$1[uiCryptoOrder.getCryptoOrder().getSide().ordinal()];
                if (i6 == 1) {
                    if (uiCryptoOrder.getCryptoOrder().getHasTradeBonus()) {
                        List listCreateListBuilder7 = CollectionsKt.createListBuilder();
                        if (z2) {
                            listCreateListBuilder7.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ROBINHOOD_FEE);
                        }
                        listCreateListBuilder7.addAll(CollectionsKt.listOf((Object[]) new BaseCryptoConfirmationState.CryptoOrderConfirmationRowType[]{BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.AMOUNT_TOTAL, BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.PRICE_AT_EXECUTION, BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.CRYPTO_PURCHASED_OR_SOLD_BREAKDOWN, BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.CRYPTO_PURCHASED_OR_SOLD_TOTAL, BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ACCOUNT_NAME}));
                        return CollectionsKt.build(listCreateListBuilder7);
                    }
                    List listCreateListBuilder8 = CollectionsKt.createListBuilder();
                    listCreateListBuilder8.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.CRYPTO_PURCHASED_OR_SOLD_BREAKDOWN);
                    listCreateListBuilder8.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.PRICE_AT_EXECUTION);
                    if (z) {
                        listCreateListBuilder8.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.FEE);
                    } else if (z2) {
                        listCreateListBuilder8.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ROBINHOOD_FEE);
                    }
                    listCreateListBuilder8.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.AMOUNT_TOTAL);
                    listCreateListBuilder8.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ACCOUNT_NAME);
                    return CollectionsKt.build(listCreateListBuilder8);
                }
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (uiCryptoOrder.getCryptoOrder().getHasTradeBonus()) {
                    List listCreateListBuilder9 = CollectionsKt.createListBuilder();
                    if (z2) {
                        listCreateListBuilder9.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ROBINHOOD_FEE);
                    }
                    if (uiCryptoOrder.getCryptoOrder().getQuoteTradeBonus() == null) {
                        listCreateListBuilder9.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.AMOUNT_TOTAL);
                    }
                    listCreateListBuilder9.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.PRICE_AT_EXECUTION);
                    listCreateListBuilder9.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.CRYPTO_PURCHASED_OR_SOLD_BREAKDOWN);
                    if (uiCryptoOrder.getCryptoOrder().getQuoteTradeBonus() != null) {
                        listCreateListBuilder9.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.AMOUNT_BREAKDOWN);
                        listCreateListBuilder9.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.AMOUNT_TOTAL);
                    }
                    listCreateListBuilder9.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ACCOUNT_NAME);
                    return CollectionsKt.build(listCreateListBuilder9);
                }
                List listCreateListBuilder10 = CollectionsKt.createListBuilder();
                listCreateListBuilder10.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.CRYPTO_PURCHASED_OR_SOLD_BREAKDOWN);
                listCreateListBuilder10.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.PRICE_AT_EXECUTION);
                listCreateListBuilder10.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.LOTS_SELECTED);
                if (z) {
                    listCreateListBuilder10.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.FEE);
                } else if (z2) {
                    listCreateListBuilder10.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ROBINHOOD_FEE);
                }
                listCreateListBuilder10.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.AMOUNT_TOTAL);
                listCreateListBuilder10.add(BaseCryptoConfirmationState.CryptoOrderConfirmationRowType.ACCOUNT_NAME);
                return CollectionsKt.build(listCreateListBuilder10);
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return CollectionsKt.emptyList();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
