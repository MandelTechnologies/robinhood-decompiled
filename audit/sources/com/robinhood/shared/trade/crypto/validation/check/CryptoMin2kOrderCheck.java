package com.robinhood.shared.trade.crypto.validation.check;

import android.os.Bundle;
import android.text.Spannable;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.HtmlCompat;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator2;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoMin2kOrderCheck.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0002\u000e\u000fB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin2kOrderCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationCheck;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/analytics/EventLogger;)V", "check", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin2kOrderCheck$Failure;", "input", "Failure", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoMin2kOrderCheck implements Validator.Check<CryptoOrderContext, CryptoOrderValidator3> {
    private static final BigDecimal minRequiredAmountCollared;
    private final AppType appType;
    private final EventLogger eventLogger;
    public static final int $stable = 8;

    public CryptoMin2kOrderCheck(AppType appType, EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.appType = appType;
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public Failure check(CryptoOrderContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.appType == AppType.RHC) {
            return null;
        }
        CryptoOrderContext.AccountContext accountContext = input.getAccountContext();
        CryptoOrderContext.RequestContext requestContext = input.getRequestContext();
        Currency assetCurrency = requestContext.getCurrencyPair().getAssetCurrency();
        Currency quoteCurrency = requestContext.getCurrencyPair().getQuoteCurrency();
        UnifiedBalances unifiedBalances = accountContext.getUnifiedBalances();
        OrderSide side = input.getRequest().getSide();
        BigDecimal equity = unifiedBalances.getBrokerageBalances().getPortfolio().getEquity();
        boolean z = Intrinsics.areEqual(accountContext.isMarginInvestingEnabled(), Boolean.TRUE) && equity.compareTo(Portfolio.MINIMUM_EQUITY_FOR_GOLD_ELIGIBILITY) >= 0;
        if (!quoteCurrency.isUsd() || !z || side != OrderSide.BUY) {
            return null;
        }
        BigDecimal orderQuantity = input.getRequest().getOrderQuantity();
        BigDecimal collaredPrice = input.getRequest().getCollaredPrice();
        BigDecimal bigDecimalMultiply = orderQuantity.multiply(collaredPrice);
        BigDecimal bigDecimalSubtract = equity.subtract(bigDecimalMultiply);
        BigDecimal bigDecimal = minRequiredAmountCollared;
        if (BigDecimals7.gte(bigDecimalSubtract, bigDecimal)) {
            return null;
        }
        boolean zIsLevered = unifiedBalances.isLevered();
        RequestInputs requestInputs = requestContext.getRequestInputs();
        BigDecimal bigDecimalSubtract2 = equity.subtract(bigDecimal);
        if (!zIsLevered) {
            if (zIsLevered) {
                throw new NoWhenBranchMatchedException();
            }
            if (requestInputs instanceof RequestInputs.AsQuote) {
                Intrinsics.checkNotNull(bigDecimalSubtract2);
                return new Failure.AsQuoteUnlevered(quoteCurrency, bigDecimalSubtract2, this.eventLogger);
            }
            if (!(requestInputs instanceof RequestInputs.AsAsset)) {
                throw new NoWhenBranchMatchedException();
            }
            return new Failure.AsAssetUnlevered(assetCurrency, BigDecimals7.safeDivide(bigDecimalSubtract2, collaredPrice), this.eventLogger);
        }
        if (requestInputs instanceof RequestInputs.AsQuote) {
            Intrinsics.checkNotNull(bigDecimalMultiply);
            Intrinsics.checkNotNull(bigDecimalSubtract2);
            return new Failure.AsQuoteLevered(quoteCurrency, bigDecimalMultiply, bigDecimalSubtract2, this.eventLogger, input.getEventScreen(), input.getLoggingCryptoOrderContext());
        }
        if (!(requestInputs instanceof RequestInputs.AsAsset)) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNull(bigDecimalMultiply);
        Intrinsics.checkNotNull(bigDecimalSubtract2);
        return new Failure.AsAssetLevered(assetCurrency, bigDecimalMultiply, bigDecimalSubtract2, BigDecimals7.safeDivide(bigDecimalSubtract2, collaredPrice), this.eventLogger, input.getEventScreen(), input.getLoggingCryptoOrderContext());
    }

    /* compiled from: CryptoMin2kOrderCheck.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin2kOrderCheck$Failure;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailure;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "getTitle", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "Unlevered", "AsQuoteUnlevered", "AsAssetUnlevered", "Levered", "AsQuoteLevered", "AsAssetLevered", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin2kOrderCheck$Failure$Levered;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin2kOrderCheck$Failure$Unlevered;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Failure extends CryptoOrderValidator2 {
        public static final int $stable = 8;
        private final String checkIdentifier;

        public /* synthetic */ Failure(EventLogger eventLogger, DefaultConstructorMarker defaultConstructorMarker) {
            this(eventLogger);
        }

        private Failure(EventLogger eventLogger) {
            super(eventLogger);
            this.checkIdentifier = "crypto_min_2k_order_check";
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public final String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public String getTitle(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C40095R.string.crypto_order_check_margin_minimum_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        /* compiled from: CryptoMin2kOrderCheck.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin2kOrderCheck$Failure$Unlevered;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin2kOrderCheck$Failure;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "getPositiveAction", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getNegativeAction", "onNegativeResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "resolver", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "passthroughArgs", "Landroid/os/Bundle;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class Unlevered extends Failure {
            public static final int $stable = 8;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Unlevered(EventLogger eventLogger) {
                super(eventLogger, null);
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public String getPositiveAction(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String string2 = activity.getString(C11048R.string.general_label_cancel);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public String getNegativeAction(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String string2 = activity.getString(C11048R.string.general_label_continue);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure, com.robinhood.android.lib.trade.validation.Validator.Failure
            public Validator.Action<CryptoOrderContext> onNegativeResponse(CryptoOrderValidator3 resolver, Bundle passthroughArgs) {
                Intrinsics.checkNotNullParameter(resolver, "resolver");
                return Validator.Action.Skip.INSTANCE;
            }
        }

        /* compiled from: CryptoMin2kOrderCheck.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin2kOrderCheck$Failure$AsQuoteUnlevered;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin2kOrderCheck$Failure$Unlevered;", "quoteCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "allowedAmount", "Ljava/math/BigDecimal;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/models/crypto/db/Currency;Ljava/math/BigDecimal;Lcom/robinhood/analytics/EventLogger;)V", "getQuoteCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "getAllowedAmount", "()Ljava/math/BigDecimal;", "getMessage", "Landroid/text/Spannable;", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AsQuoteUnlevered extends Unlevered {
            public static final int $stable = 8;
            private final BigDecimal allowedAmount;
            private final Currency quoteCurrency;

            public final Currency getQuoteCurrency() {
                return this.quoteCurrency;
            }

            public final BigDecimal getAllowedAmount() {
                return this.allowedAmount;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsQuoteUnlevered(Currency quoteCurrency, BigDecimal allowedAmount, EventLogger eventLogger) {
                super(eventLogger);
                Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
                Intrinsics.checkNotNullParameter(allowedAmount, "allowedAmount");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                this.quoteCurrency = quoteCurrency;
                this.allowedAmount = allowedAmount;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public Spannable getMessage(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String string2 = activity.getString(C40095R.string.crypto_order_check_margin_buying_power, CurrencyDefinitions.formatCurrency$default(this.quoteCurrency, this.allowedAmount, false, false, null, 0, null, null, false, false, false, false, 2046, null));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return HtmlCompat.fromHtml$default(string2, 0, 2, null);
            }
        }

        /* compiled from: CryptoMin2kOrderCheck.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin2kOrderCheck$Failure$AsAssetUnlevered;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin2kOrderCheck$Failure$Unlevered;", "assetCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "allowedQuantity", "Ljava/math/BigDecimal;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/models/crypto/db/Currency;Ljava/math/BigDecimal;Lcom/robinhood/analytics/EventLogger;)V", "getAssetCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "getAllowedQuantity", "()Ljava/math/BigDecimal;", "getMessage", "Landroid/text/Spannable;", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AsAssetUnlevered extends Unlevered {
            public static final int $stable = 8;
            private final BigDecimal allowedQuantity;
            private final Currency assetCurrency;

            public final Currency getAssetCurrency() {
                return this.assetCurrency;
            }

            public final BigDecimal getAllowedQuantity() {
                return this.allowedQuantity;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsAssetUnlevered(Currency assetCurrency, BigDecimal allowedQuantity, EventLogger eventLogger) {
                super(eventLogger);
                Intrinsics.checkNotNullParameter(assetCurrency, "assetCurrency");
                Intrinsics.checkNotNullParameter(allowedQuantity, "allowedQuantity");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                this.assetCurrency = assetCurrency;
                this.allowedQuantity = allowedQuantity;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public Spannable getMessage(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String string2 = activity.getString(C40095R.string.crypto_order_check_margin_buying_power, CurrencyDefinitions.formatCurrency$default(this.assetCurrency, this.allowedQuantity, false, false, null, 0, null, null, false, false, false, false, 2046, null));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return HtmlCompat.fromHtml$default(string2, 0, 2, null);
            }
        }

        /* compiled from: CryptoMin2kOrderCheck.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\n \u000e*\u0004\u0018\u00010\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin2kOrderCheck$Failure$Levered;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin2kOrderCheck$Failure;", "enteredAmount", "Ljava/math/BigDecimal;", "allowedAmount", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingCryptoOrderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;)V", "recommendedDepositAmount", "kotlin.jvm.PlatformType", "getRecommendedDepositAmount", "()Ljava/math/BigDecimal;", "getPositiveAction", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getNegativeAction", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "resolver", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "passthroughArgs", "Landroid/os/Bundle;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class Levered extends Failure {
            public static final int $stable = 8;
            private final EventLogger eventLogger;
            private final Screen eventScreen;
            private final com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext;
            private final BigDecimal recommendedDepositAmount;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Levered(BigDecimal enteredAmount, BigDecimal allowedAmount, EventLogger eventLogger, Screen eventScreen, com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext) {
                super(eventLogger, null);
                Intrinsics.checkNotNullParameter(enteredAmount, "enteredAmount");
                Intrinsics.checkNotNullParameter(allowedAmount, "allowedAmount");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
                Intrinsics.checkNotNullParameter(loggingCryptoOrderContext, "loggingCryptoOrderContext");
                this.eventLogger = eventLogger;
                this.eventScreen = eventScreen;
                this.loggingCryptoOrderContext = loggingCryptoOrderContext;
                this.recommendedDepositAmount = enteredAmount.subtract(allowedAmount);
            }

            public final BigDecimal getRecommendedDepositAmount() {
                return this.recommendedDepositAmount;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public String getPositiveAction(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                int i = C40095R.string.crypto_order_check_deposit_action;
                NumberFormatter currencyFormat = Formats.getCurrencyFormat();
                BigDecimal recommendedDepositAmount = this.recommendedDepositAmount;
                Intrinsics.checkNotNullExpressionValue(recommendedDepositAmount, "recommendedDepositAmount");
                String string2 = activity.getString(i, currencyFormat.format(recommendedDepositAmount));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public String getNegativeAction(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String string2 = activity.getString(C11048R.string.general_label_cancel);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure, com.robinhood.android.lib.trade.validation.Validator.Failure
            public Validator.Action<CryptoOrderContext> onPositiveResponse(CryptoOrderValidator3 resolver, Bundle passthroughArgs) {
                Intrinsics.checkNotNullParameter(resolver, "resolver");
                resolver.initiateDeposit();
                EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, this.eventScreen, new Component(Component.ComponentType.BUTTON, getCheckIdentifier() + "_deposit_funds", null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.loggingCryptoOrderContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), false, 41, null);
                return Validator.Action.Abort.INSTANCE;
            }
        }

        /* compiled from: CryptoMin2kOrderCheck.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin2kOrderCheck$Failure$AsQuoteLevered;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin2kOrderCheck$Failure$Levered;", "quoteCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "enteredAmount", "Ljava/math/BigDecimal;", "allowedAmount", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingCryptoOrderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "<init>", "(Lcom/robinhood/models/crypto/db/Currency;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;)V", "getQuoteCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "getEnteredAmount", "()Ljava/math/BigDecimal;", "getAllowedAmount", "getMessage", "Landroid/text/Spannable;", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AsQuoteLevered extends Levered {
            public static final int $stable = 8;
            private final BigDecimal allowedAmount;
            private final BigDecimal enteredAmount;
            private final Currency quoteCurrency;

            public final Currency getQuoteCurrency() {
                return this.quoteCurrency;
            }

            public final BigDecimal getEnteredAmount() {
                return this.enteredAmount;
            }

            public final BigDecimal getAllowedAmount() {
                return this.allowedAmount;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsQuoteLevered(Currency quoteCurrency, BigDecimal enteredAmount, BigDecimal allowedAmount, EventLogger eventLogger, Screen eventScreen, com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext) {
                super(enteredAmount, allowedAmount, eventLogger, eventScreen, loggingCryptoOrderContext);
                Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
                Intrinsics.checkNotNullParameter(enteredAmount, "enteredAmount");
                Intrinsics.checkNotNullParameter(allowedAmount, "allowedAmount");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
                Intrinsics.checkNotNullParameter(loggingCryptoOrderContext, "loggingCryptoOrderContext");
                this.quoteCurrency = quoteCurrency;
                this.enteredAmount = enteredAmount;
                this.allowedAmount = allowedAmount;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public Spannable getMessage(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String string2 = activity.getString(C40095R.string.crypto_order_check_margin_buying_power, CurrencyDefinitions.formatCurrency$default(this.quoteCurrency, this.allowedAmount, false, false, null, 0, null, null, false, false, false, false, 2046, null));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return HtmlCompat.fromHtml$default(string2, 0, 2, null);
            }
        }

        /* compiled from: CryptoMin2kOrderCheck.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin2kOrderCheck$Failure$AsAssetLevered;", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin2kOrderCheck$Failure$Levered;", "assetCurrency", "Lcom/robinhood/models/crypto/db/Currency;", "enteredAmount", "Ljava/math/BigDecimal;", "allowedAmount", "allowedQuantity", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingCryptoOrderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "<init>", "(Lcom/robinhood/models/crypto/db/Currency;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;)V", "getAssetCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "getEnteredAmount", "()Ljava/math/BigDecimal;", "getAllowedAmount", "getAllowedQuantity", "getMessage", "Landroid/text/Spannable;", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AsAssetLevered extends Levered {
            public static final int $stable = 8;
            private final BigDecimal allowedAmount;
            private final BigDecimal allowedQuantity;
            private final Currency assetCurrency;
            private final BigDecimal enteredAmount;

            public final Currency getAssetCurrency() {
                return this.assetCurrency;
            }

            public final BigDecimal getEnteredAmount() {
                return this.enteredAmount;
            }

            public final BigDecimal getAllowedAmount() {
                return this.allowedAmount;
            }

            public final BigDecimal getAllowedQuantity() {
                return this.allowedQuantity;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AsAssetLevered(Currency assetCurrency, BigDecimal enteredAmount, BigDecimal allowedAmount, BigDecimal allowedQuantity, EventLogger eventLogger, Screen eventScreen, com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext) {
                super(enteredAmount, allowedAmount, eventLogger, eventScreen, loggingCryptoOrderContext);
                Intrinsics.checkNotNullParameter(assetCurrency, "assetCurrency");
                Intrinsics.checkNotNullParameter(enteredAmount, "enteredAmount");
                Intrinsics.checkNotNullParameter(allowedAmount, "allowedAmount");
                Intrinsics.checkNotNullParameter(allowedQuantity, "allowedQuantity");
                Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
                Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
                Intrinsics.checkNotNullParameter(loggingCryptoOrderContext, "loggingCryptoOrderContext");
                this.assetCurrency = assetCurrency;
                this.enteredAmount = enteredAmount;
                this.allowedAmount = allowedAmount;
                this.allowedQuantity = allowedQuantity;
            }

            @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
            public Spannable getMessage(BaseActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String string2 = activity.getString(C40095R.string.crypto_order_check_margin_buying_power, CurrencyDefinitions.formatCurrency$default(this.assetCurrency, this.allowedQuantity, false, false, null, 0, null, null, false, false, false, false, 2046, null));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return HtmlCompat.fromHtml$default(string2, 0, 2, null);
            }
        }
    }

    static {
        BigDecimal bigDecimalMultiply = Portfolio.MINIMUM_EQUITY_FOR_GOLD_ELIGIBILITY.multiply(Portfolio.INSTANCE.getCOLLAR_TO_PREVENT_REACHING_MINIMUM_BALANCE());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        minRequiredAmountCollared = bigDecimalMultiply;
    }
}
