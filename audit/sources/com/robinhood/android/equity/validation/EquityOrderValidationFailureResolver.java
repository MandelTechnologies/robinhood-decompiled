package com.robinhood.android.equity.validation;

import android.content.Context;
import android.net.Uri;
import com.robinhood.android.mcw.contracts.QuickConversionKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.p320db.DirectOrderRequestDraft;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericOrderCheckAction;
import com.robinhood.models.serverdriven.utils.MoneyData;
import com.robinhood.models.util.Money;
import com.robinhood.utils.Preconditions;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderValidationFailureResolver.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\u000bH&J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000fH&J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000fH&J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u001c\u001a\u00020\u000bH&J\b\u0010\u001d\u001a\u00020\u000bH&J\u0016\u0010\u001e\u001a\u00020\u000b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0 H&J\b\u0010!\u001a\u00020\u000bH&J\b\u0010\"\u001a\u00020\u000bH&J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%H&J\"\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0019H\u0016J\u0010\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u0002002\u0006\u0010*\u001a\u00020\u0019H\u0002R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/EquityOrderValidationFailureResolver;", "", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "resolverContext", "Landroid/content/Context;", "getResolverContext", "()Landroid/content/Context;", "convertToLimitOrder", "", "accountNumber", "", "quantity", "Ljava/math/BigDecimal;", "convertToMarketOrder", "convertToSimpleLimitOrder", "presetPercentLimit", "convertToAllDayOrder", "convertToShareQuantity", "setLimitOrderConfiguration", "amount", "editLimitOrder", "context", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "editStopOrder", "setShareQuantity", "overrideToExecuteInMarketHoursOnly", "overrideToFlipIpoAccessShares", "appendOverrides", "overrides", "", "cancelPendingCryptoOrders", "clearTaxLotSelection", "presentQuickConversionSheet", "key", "Lcom/robinhood/android/mcw/contracts/QuickConversionKey;", "performTypedAction", "", "typedAction", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "equityOrderContext", "handleDeeplink", "uri", "Landroid/net/Uri;", "handleOrderCheckAction", "orderCheckAction", "Lcom/robinhood/models/serverdriven/db/GenericOrderCheckAction;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EquityOrderValidationFailureResolver {
    void appendOverrides(List<String> overrides);

    void cancelPendingCryptoOrders();

    void clearTaxLotSelection();

    void convertToAllDayOrder(String accountNumber);

    void convertToLimitOrder(String accountNumber, BigDecimal quantity);

    void convertToMarketOrder();

    void convertToShareQuantity(String accountNumber);

    void convertToSimpleLimitOrder(BigDecimal presetPercentLimit);

    void editLimitOrder(EquityOrderContext context);

    void editStopOrder(EquityOrderContext context);

    Navigator getNavigator();

    Context getResolverContext();

    void overrideToExecuteInMarketHoursOnly();

    void overrideToFlipIpoAccessShares();

    boolean performTypedAction(GenericAction typedAction, String accountNumber, EquityOrderContext equityOrderContext);

    void presentQuickConversionSheet(QuickConversionKey key);

    void setLimitOrderConfiguration(String accountNumber, BigDecimal amount);

    void setShareQuantity(BigDecimal quantity);

    /* compiled from: EquityOrderValidationFailureResolver.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void convertToLimitOrder$default(EquityOrderValidationFailureResolver equityOrderValidationFailureResolver, String str, BigDecimal bigDecimal, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertToLimitOrder");
            }
            if ((i & 2) != 0) {
                bigDecimal = null;
            }
            equityOrderValidationFailureResolver.convertToLimitOrder(str, bigDecimal);
        }

        public static boolean performTypedAction(EquityOrderValidationFailureResolver equityOrderValidationFailureResolver, GenericAction genericAction, String accountNumber, EquityOrderContext equityOrderContext) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(equityOrderContext, "equityOrderContext");
            if (genericAction instanceof GenericAction.DismissAction) {
                return true;
            }
            if (genericAction instanceof GenericAction.OrderCheckAction) {
                handleOrderCheckAction(equityOrderValidationFailureResolver, ((GenericAction.OrderCheckAction) genericAction).getGenericOrderCheckAction(), equityOrderContext);
                return true;
            }
            if (!(genericAction instanceof GenericAction.DeeplinkAction)) {
                return false;
            }
            handleDeeplink(equityOrderValidationFailureResolver, ((GenericAction.DeeplinkAction) genericAction).getUri());
            return true;
        }

        private static void handleDeeplink(EquityOrderValidationFailureResolver equityOrderValidationFailureResolver, Uri uri) {
            Navigator.DefaultImpls.handleDeepLink$default(equityOrderValidationFailureResolver.getNavigator(), equityOrderValidationFailureResolver.getResolverContext(), uri, null, null, false, null, 44, null);
        }

        private static void handleOrderCheckAction(EquityOrderValidationFailureResolver equityOrderValidationFailureResolver, GenericOrderCheckAction genericOrderCheckAction, EquityOrderContext equityOrderContext) {
            if (genericOrderCheckAction instanceof GenericOrderCheckAction.AppendOverridesAction) {
                equityOrderValidationFailureResolver.appendOverrides(((GenericOrderCheckAction.AppendOverridesAction) genericOrderCheckAction).getOverrides());
                return;
            }
            if (genericOrderCheckAction instanceof GenericOrderCheckAction.ConvertToLimitAction) {
                equityOrderValidationFailureResolver.convertToLimitOrder(equityOrderContext.getAccountNumber(), ((GenericOrderCheckAction.ConvertToLimitAction) genericOrderCheckAction).getQuantity());
                return;
            }
            if (genericOrderCheckAction instanceof GenericOrderCheckAction.ConvertToMarketAction) {
                equityOrderValidationFailureResolver.convertToMarketOrder();
                return;
            }
            if (genericOrderCheckAction instanceof GenericOrderCheckAction.ConvertToSimpleLimitAction) {
                equityOrderValidationFailureResolver.convertToSimpleLimitOrder(equityOrderContext.getRequestContext().getDefaultPresetPercentLimit());
                return;
            }
            if (genericOrderCheckAction instanceof GenericOrderCheckAction.ConvertToAllDayOrderAction) {
                equityOrderValidationFailureResolver.convertToAllDayOrder(equityOrderContext.getAccountNumber());
                return;
            }
            if (genericOrderCheckAction instanceof GenericOrderCheckAction.ConvertToSharesAction) {
                equityOrderValidationFailureResolver.convertToShareQuantity(equityOrderContext.getAccountNumber());
                return;
            }
            if (genericOrderCheckAction instanceof GenericOrderCheckAction.SetLimitPriceAction) {
                equityOrderValidationFailureResolver.setLimitOrderConfiguration(equityOrderContext.getAccountNumber(), ((GenericOrderCheckAction.SetLimitPriceAction) genericOrderCheckAction).getLimitPrice());
                return;
            }
            if (genericOrderCheckAction instanceof GenericOrderCheckAction.SetQuantityAction) {
                equityOrderValidationFailureResolver.setShareQuantity(((GenericOrderCheckAction.SetQuantityAction) genericOrderCheckAction).getQuantity());
                return;
            }
            if (genericOrderCheckAction instanceof GenericOrderCheckAction.EditLimitOrderAction) {
                equityOrderValidationFailureResolver.editLimitOrder(equityOrderContext);
                return;
            }
            if (genericOrderCheckAction instanceof GenericOrderCheckAction.EditStopOrderAction) {
                equityOrderValidationFailureResolver.editStopOrder(equityOrderContext);
                return;
            }
            if (genericOrderCheckAction instanceof GenericOrderCheckAction.OverrideExtendedHoursFlagAction) {
                equityOrderValidationFailureResolver.overrideToExecuteInMarketHoursOnly();
                return;
            }
            if (genericOrderCheckAction instanceof GenericOrderCheckAction.CancelPendingCryptoOrdersAction) {
                equityOrderValidationFailureResolver.cancelPendingCryptoOrders();
                return;
            }
            if (genericOrderCheckAction instanceof GenericOrderCheckAction.ClearTaxLotSelectionAction) {
                equityOrderValidationFailureResolver.clearTaxLotSelection();
                return;
            }
            if (genericOrderCheckAction instanceof GenericOrderCheckAction.McwPresentQuickConversionAction) {
                String accountNumber = equityOrderContext.getAccountNumber();
                GenericOrderCheckAction.McwPresentQuickConversionAction mcwPresentQuickConversionAction = (GenericOrderCheckAction.McwPresentQuickConversionAction) genericOrderCheckAction;
                String title = mcwPresentQuickConversionAction.getTitle();
                String message = mcwPresentQuickConversionAction.getMessage();
                String placeholder = mcwPresentQuickConversionAction.getPlaceholder();
                Currency currency = Currency.getInstance(mcwPresentQuickConversionAction.getSourceCurrencyCode());
                Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
                MoneyData amountNeeded = mcwPresentQuickConversionAction.getAmountNeeded();
                Currency currency2 = Currency.getInstance(amountNeeded.getCurrency_code());
                Intrinsics.checkNotNullExpressionValue(currency2, "getInstance(...)");
                Money money = new Money(currency2, amountNeeded.getAmount());
                MoneyData currentBuyingPower = mcwPresentQuickConversionAction.getCurrentBuyingPower();
                Currency currency3 = Currency.getInstance(currentBuyingPower.getCurrency_code());
                Intrinsics.checkNotNullExpressionValue(currency3, "getInstance(...)");
                equityOrderValidationFailureResolver.presentQuickConversionSheet(new QuickConversionKey(accountNumber, title, message, placeholder, currency, money, new Money(currency3, currentBuyingPower.getAmount()), mcwPresentQuickConversionAction.getSecondaryCta()));
                return;
            }
            if (genericOrderCheckAction instanceof GenericOrderCheckAction.ChangeTradingSessionAction) {
                equityOrderValidationFailureResolver.editLimitOrder(EquityOrderContext.copy$default(equityOrderContext, DirectOrderRequestDraft.copy$default(equityOrderContext.getOrderRequestDraft(), null, null, null, null, 0, null, null, null, null, OrderMarketHours.EXTENDED_HOURS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268434943, null), null, 2, null));
            } else {
                if (!(genericOrderCheckAction instanceof GenericOrderCheckAction.Unknown) && !(genericOrderCheckAction instanceof GenericOrderCheckAction.OptionsConvertToLimit)) {
                    throw new NoWhenBranchMatchedException();
                }
                Preconditions.INSTANCE.failUnexpectedItemKotlin(genericOrderCheckAction);
                throw new ExceptionsH();
            }
        }
    }
}
