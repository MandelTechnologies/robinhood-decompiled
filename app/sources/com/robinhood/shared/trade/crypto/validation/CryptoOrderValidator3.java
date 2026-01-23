package com.robinhood.shared.trade.crypto.validation;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderValidator.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "", "initiateDeposit", "", "selectPaymentMethod", "setOrderSize", "orderAmount", "Ljava/math/BigDecimal;", "orderQuantity", "startSignupFlow", "setPdtWarningAsSeen", "convertToSellAll", "setLimitPrice", "limitPrice", "requestFocusOnLimitPriceInput", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.validation.CryptoOrderValidationFailureResolver, reason: use source file name */
/* loaded from: classes12.dex */
public interface CryptoOrderValidator3 {

    /* compiled from: CryptoOrderValidator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.validation.CryptoOrderValidationFailureResolver$DefaultImpls */
    public static final class DefaultImpls {
        public static void convertToSellAll(CryptoOrderValidator3 cryptoOrderValidator3) {
        }

        public static void initiateDeposit(CryptoOrderValidator3 cryptoOrderValidator3) {
        }

        public static void requestFocusOnLimitPriceInput(CryptoOrderValidator3 cryptoOrderValidator3) {
        }

        public static void selectPaymentMethod(CryptoOrderValidator3 cryptoOrderValidator3) {
        }

        public static void setLimitPrice(CryptoOrderValidator3 cryptoOrderValidator3, BigDecimal limitPrice) {
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
        }

        public static void setOrderSize(CryptoOrderValidator3 cryptoOrderValidator3, BigDecimal orderAmount, BigDecimal orderQuantity) {
            Intrinsics.checkNotNullParameter(orderAmount, "orderAmount");
            Intrinsics.checkNotNullParameter(orderQuantity, "orderQuantity");
        }

        public static void setPdtWarningAsSeen(CryptoOrderValidator3 cryptoOrderValidator3) {
        }

        public static void startSignupFlow(CryptoOrderValidator3 cryptoOrderValidator3) {
        }
    }

    void convertToSellAll();

    void initiateDeposit();

    void requestFocusOnLimitPriceInput();

    void selectPaymentMethod();

    void setLimitPrice(BigDecimal limitPrice);

    void setOrderSize(BigDecimal orderAmount, BigDecimal orderQuantity);

    void setPdtWarningAsSeen();

    void startSignupFlow();
}
