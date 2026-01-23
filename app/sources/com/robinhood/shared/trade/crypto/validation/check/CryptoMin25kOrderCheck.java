package com.robinhood.shared.trade.crypto.validation.check;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spanned;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.account.strings.BrokerageAccountTypes2;
import com.robinhood.android.account.strings.C8179R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.HtmlCompat;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.crypto.p314db.BrokerageBalances;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator2;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoMin25kOrderCheck.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0002\u000e\u000fB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin25kOrderCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationCheck;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/analytics/EventLogger;)V", "check", "Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin25kOrderCheck$CryptoPdtWarningFailure;", "input", "CryptoPdtWarningFailure", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoMin25kOrderCheck implements Validator.Check<CryptoOrderContext, CryptoOrderValidator3> {
    private final AppType appType;
    private final EventLogger eventLogger;
    public static final int $stable = 8;
    private static final BigDecimal pdtAmount = Portfolio.MINIMUM_BALANCE_FOR_PDT_EXEMPTION;

    public CryptoMin25kOrderCheck(AppType appType, EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.appType = appType;
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public CryptoPdtWarningFailure check(CryptoOrderContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.appType != AppType.RHC && !input.getAccountContext().isMemberPdtRevampV1()) {
            BrokerageBalances brokerageBalances = input.getAccountContext().getUnifiedBalances().getBrokerageBalances();
            OrderSide side = input.getRequest().getSide();
            BigDecimal equity = brokerageBalances.getPortfolio().getEquity();
            BigDecimal bigDecimal = pdtAmount;
            BigDecimal bigDecimalSubtract = equity.subtract(bigDecimal);
            Intrinsics.checkNotNull(bigDecimalSubtract);
            BigDecimal bigDecimalMultiply = bigDecimalSubtract.multiply(new BigDecimal("0.9"));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            boolean zM2978gt = BigDecimals7.m2978gt(input.getOrderInfo().getUncollaredTotalCost(), bigDecimalMultiply);
            if (!input.getRequestContext().getRequestInputs().getHasSeenPdtWarning() && brokerageBalances.isPatternDayTrader() && brokerageBalances.isMargin() && side == OrderSide.BUY && BigDecimals7.m2978gt(equity, bigDecimal) && zM2978gt) {
                UnifiedAccountV2 unifiedAccount = input.getAccountContext().getUnifiedAccount();
                return new CryptoPdtWarningFailure(bigDecimalSubtract, unifiedAccount != null ? unifiedAccount.getBrokerageAccountType() : null, input.getRequestContext().getCurrencyPair().getAssetCurrency().getName(), this.eventLogger, input.getEventScreen(), input.getLoggingCryptoOrderContext());
            }
        }
        return null;
    }

    /* compiled from: CryptoMin25kOrderCheck.kt */
    @Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u0018\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J \u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u000e\u0010*\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b+J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b-J\u000e\u0010.\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b/J\t\u00100\u001a\u00020\tHÂ\u0003J\t\u00101\u001a\u00020\u000bHÂ\u0003J\t\u00102\u001a\u00020\rHÂ\u0003JG\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006;"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/check/CryptoMin25kOrderCheck$CryptoPdtWarningFailure;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailure;", "allowedAmount", "Ljava/math/BigDecimal;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "cryptoAsset", "", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingCryptoOrderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;)V", "getAllowedAmount$feature_trade_crypto_externalDebug", "()Ljava/math/BigDecimal;", "getAccountType$feature_trade_crypto_externalDebug", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getCryptoAsset$feature_trade_crypto_externalDebug", "()Ljava/lang/String;", "checkIdentifier", "getCheckIdentifier", "getMessage", "Lcom/robinhood/utils/resource/StringResource;", "resources", "Landroid/content/res/Resources;", "getTitle", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "Landroid/text/Spanned;", "getPositiveAction", "getNegativeAction", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContext;", "resolver", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidationFailureResolver;", "passthroughArgs", "Landroid/os/Bundle;", "onNegativeResponse", "component1", "component1$feature_trade_crypto_externalDebug", "component2", "component2$feature_trade_crypto_externalDebug", "component3", "component3$feature_trade_crypto_externalDebug", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CryptoPdtWarningFailure extends CryptoOrderValidator2 {
        public static final int $stable = 8;
        private final BrokerageAccountType accountType;
        private final BigDecimal allowedAmount;
        private final String checkIdentifier;
        private final String cryptoAsset;
        private final EventLogger eventLogger;
        private final Screen eventScreen;
        private final com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext;

        /* renamed from: component4, reason: from getter */
        private final EventLogger getEventLogger() {
            return this.eventLogger;
        }

        /* renamed from: component5, reason: from getter */
        private final Screen getEventScreen() {
            return this.eventScreen;
        }

        /* renamed from: component6, reason: from getter */
        private final com.robinhood.rosetta.eventlogging.CryptoOrderContext getLoggingCryptoOrderContext() {
            return this.loggingCryptoOrderContext;
        }

        public static /* synthetic */ CryptoPdtWarningFailure copy$default(CryptoPdtWarningFailure cryptoPdtWarningFailure, BigDecimal bigDecimal, BrokerageAccountType brokerageAccountType, String str, EventLogger eventLogger, Screen screen, com.robinhood.rosetta.eventlogging.CryptoOrderContext cryptoOrderContext, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = cryptoPdtWarningFailure.allowedAmount;
            }
            if ((i & 2) != 0) {
                brokerageAccountType = cryptoPdtWarningFailure.accountType;
            }
            if ((i & 4) != 0) {
                str = cryptoPdtWarningFailure.cryptoAsset;
            }
            if ((i & 8) != 0) {
                eventLogger = cryptoPdtWarningFailure.eventLogger;
            }
            if ((i & 16) != 0) {
                screen = cryptoPdtWarningFailure.eventScreen;
            }
            if ((i & 32) != 0) {
                cryptoOrderContext = cryptoPdtWarningFailure.loggingCryptoOrderContext;
            }
            Screen screen2 = screen;
            com.robinhood.rosetta.eventlogging.CryptoOrderContext cryptoOrderContext2 = cryptoOrderContext;
            return cryptoPdtWarningFailure.copy(bigDecimal, brokerageAccountType, str, eventLogger, screen2, cryptoOrderContext2);
        }

        /* renamed from: component1$feature_trade_crypto_externalDebug, reason: from getter */
        public final BigDecimal getAllowedAmount() {
            return this.allowedAmount;
        }

        /* renamed from: component2$feature_trade_crypto_externalDebug, reason: from getter */
        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        /* renamed from: component3$feature_trade_crypto_externalDebug, reason: from getter */
        public final String getCryptoAsset() {
            return this.cryptoAsset;
        }

        public final CryptoPdtWarningFailure copy(BigDecimal allowedAmount, BrokerageAccountType accountType, String cryptoAsset, EventLogger eventLogger, Screen eventScreen, com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext) {
            Intrinsics.checkNotNullParameter(allowedAmount, "allowedAmount");
            Intrinsics.checkNotNullParameter(cryptoAsset, "cryptoAsset");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
            Intrinsics.checkNotNullParameter(loggingCryptoOrderContext, "loggingCryptoOrderContext");
            return new CryptoPdtWarningFailure(allowedAmount, accountType, cryptoAsset, eventLogger, eventScreen, loggingCryptoOrderContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CryptoPdtWarningFailure)) {
                return false;
            }
            CryptoPdtWarningFailure cryptoPdtWarningFailure = (CryptoPdtWarningFailure) other;
            return Intrinsics.areEqual(this.allowedAmount, cryptoPdtWarningFailure.allowedAmount) && this.accountType == cryptoPdtWarningFailure.accountType && Intrinsics.areEqual(this.cryptoAsset, cryptoPdtWarningFailure.cryptoAsset) && Intrinsics.areEqual(this.eventLogger, cryptoPdtWarningFailure.eventLogger) && Intrinsics.areEqual(this.eventScreen, cryptoPdtWarningFailure.eventScreen) && Intrinsics.areEqual(this.loggingCryptoOrderContext, cryptoPdtWarningFailure.loggingCryptoOrderContext);
        }

        public int hashCode() {
            int iHashCode = this.allowedAmount.hashCode() * 31;
            BrokerageAccountType brokerageAccountType = this.accountType;
            return ((((((((iHashCode + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31) + this.cryptoAsset.hashCode()) * 31) + this.eventLogger.hashCode()) * 31) + this.eventScreen.hashCode()) * 31) + this.loggingCryptoOrderContext.hashCode();
        }

        public String toString() {
            return "CryptoPdtWarningFailure(allowedAmount=" + this.allowedAmount + ", accountType=" + this.accountType + ", cryptoAsset=" + this.cryptoAsset + ", eventLogger=" + this.eventLogger + ", eventScreen=" + this.eventScreen + ", loggingCryptoOrderContext=" + this.loggingCryptoOrderContext + ")";
        }

        public final BigDecimal getAllowedAmount$feature_trade_crypto_externalDebug() {
            return this.allowedAmount;
        }

        public final BrokerageAccountType getAccountType$feature_trade_crypto_externalDebug() {
            return this.accountType;
        }

        public final String getCryptoAsset$feature_trade_crypto_externalDebug() {
            return this.cryptoAsset;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CryptoPdtWarningFailure(BigDecimal allowedAmount, BrokerageAccountType brokerageAccountType, String cryptoAsset, EventLogger eventLogger, Screen eventScreen, com.robinhood.rosetta.eventlogging.CryptoOrderContext loggingCryptoOrderContext) {
            super(eventLogger);
            Intrinsics.checkNotNullParameter(allowedAmount, "allowedAmount");
            Intrinsics.checkNotNullParameter(cryptoAsset, "cryptoAsset");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
            Intrinsics.checkNotNullParameter(loggingCryptoOrderContext, "loggingCryptoOrderContext");
            this.allowedAmount = allowedAmount;
            this.accountType = brokerageAccountType;
            this.cryptoAsset = cryptoAsset;
            this.eventLogger = eventLogger;
            this.eventScreen = eventScreen;
            this.loggingCryptoOrderContext = loggingCryptoOrderContext;
            this.checkIdentifier = "crypto_order_pdt_warning";
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        public final StringResource getMessage(Resources resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C40095R.string.crypto_order_check_pdt_message;
            BrokerageAccountType brokerageAccountType = this.accountType;
            return companion.invoke(i, resources.getString(brokerageAccountType != null ? BrokerageAccountTypes2.getDisplayNameShortRes(brokerageAccountType) : C8179R.string.account_type_individual), Formats.getCurrencyFormat().format(this.allowedAmount), this.cryptoAsset);
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public String getTitle(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C40095R.string.crypto_order_check_pdt_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public Spanned getMessage(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Resources resources = activity.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            StringResource message = getMessage(resources);
            Resources resources2 = activity.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            return HtmlCompat.fromHtml$default(message.getText(resources2).toString(), 0, 2, null);
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public String getPositiveAction(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C11048R.string.general_action_deposit_funds);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure
        public String getNegativeAction(BaseActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String string2 = activity.getString(C40095R.string.crypto_order_check_pdt_continue);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure, com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<CryptoOrderContext> onPositiveResponse(CryptoOrderValidator3 resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            resolver.setPdtWarningAsSeen();
            EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, this.eventScreen, new Component(Component.ComponentType.BUTTON, getCheckIdentifier() + "_deposit_funds", null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.loggingCryptoOrderContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), false, 41, null);
            resolver.initiateDeposit();
            return Validator.Action.Abort.INSTANCE;
        }

        @Override // com.robinhood.android.lib.trade.validation.DefaultValidatorFailure, com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<CryptoOrderContext> onNegativeResponse(CryptoOrderValidator3 resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            resolver.setPdtWarningAsSeen();
            EventLogger.DefaultImpls.logTap$default(this.eventLogger, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, "CRYPTO_ORDER_PDT_WARNING_CONTINUE", null, 4, null), null, null, false, 58, null);
            return Validator.Action.Abort.INSTANCE;
        }
    }
}
