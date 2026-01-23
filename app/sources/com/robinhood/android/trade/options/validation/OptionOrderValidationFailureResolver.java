package com.robinhood.android.trade.options.validation;

import android.net.Uri;
import com.robinhood.android.common.options.order.OptionOrderContext;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver;
import com.robinhood.models.api.ApiCryptoCancelAllPendingOrders;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.serverdriven.experimental.api.OptionOrderDirectionEnum;
import com.robinhood.models.serverdriven.experimental.api.OptionOrderFormAction;
import com.robinhood.utils.extensions.StringsKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Response;

/* compiled from: OptionOrderValidationFailureResolver.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u00011J,\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\u001e\u0010\u001d\u001a\u00020\u00032\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020 H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)H&J\u001a\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\u000e\u00100\u001a\u0004\u0018\u00010\u000b*\u00020-H\u0016¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/trade/options/validation/OptionOrderValidationFailureResolver;", "", "launchTransfers", "", "amount", "Ljava/math/BigDecimal;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "transferAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "accountNumber", "", "promptForLimitPrice", "updateQuantity", "newQuantity", "updateLimitPrice", "newLimitPrice", "overrideDayTradeChecks", "overrideDtbpChecks", "overrideDirection", "direction", "Lcom/robinhood/models/db/OrderDirection;", "launchRhsConversion", "promptAndClearStopPrice", "disableStopPrice", "promptForStopPrice", "disableStopPriceAndPromptLimit", "cancelPendingCryptoOrders", "clearCancelPendingCryptoState", "cancelBlockingOrders", "optionOrderRhIds", "", "Ljava/util/UUID;", "launchDeepLink", "uri", "Landroid/net/Uri;", "viewExistingOptionOrder", "orderId", "launchDayTradeSettings", "setPreserveUserInput", "preserveUserInput", "", "handleOrderCheckAction", "Lcom/robinhood/android/trade/options/validation/OptionOrderValidationFailureResolver$ActionWithOverrideName;", "action", "Lcom/robinhood/models/serverdriven/experimental/api/OptionOrderFormAction;", "optionOrderContext", "Lcom/robinhood/android/common/options/order/OptionOrderContext;", "loggingIdentifier", "ActionWithOverrideName", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface OptionOrderValidationFailureResolver {

    /* compiled from: OptionOrderValidationFailureResolver.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionOrderDirectionEnum.values().length];
            try {
                iArr[OptionOrderDirectionEnum.DEBIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionOrderDirectionEnum.CREDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    void cancelBlockingOrders(List<UUID> optionOrderRhIds, String accountNumber);

    void cancelPendingCryptoOrders();

    void clearCancelPendingCryptoState();

    void disableStopPrice();

    void disableStopPriceAndPromptLimit();

    ActionWithOverrideName handleOrderCheckAction(OptionOrderFormAction action, OptionOrderContext optionOrderContext);

    void launchDayTradeSettings(String accountNumber);

    void launchDeepLink(Uri uri);

    void launchRhsConversion();

    void launchTransfers(BigDecimal amount, BrokerageAccountType brokerageAccountType, ApiTransferAccount.TransferAccountType transferAccountType, String accountNumber);

    String loggingIdentifier(OptionOrderFormAction optionOrderFormAction);

    void overrideDayTradeChecks();

    void overrideDirection(OrderDirection direction);

    void overrideDtbpChecks();

    void promptAndClearStopPrice();

    void promptForLimitPrice();

    void promptForStopPrice();

    void setPreserveUserInput(boolean preserveUserInput);

    void updateLimitPrice(BigDecimal newLimitPrice);

    void updateQuantity(BigDecimal newQuantity);

    void viewExistingOptionOrder(UUID orderId);

    /* compiled from: OptionOrderValidationFailureResolver.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static /* synthetic */ void launchTransfers$default(OptionOrderValidationFailureResolver optionOrderValidationFailureResolver, BigDecimal bigDecimal, BrokerageAccountType brokerageAccountType, ApiTransferAccount.TransferAccountType transferAccountType, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchTransfers");
            }
            if ((i & 1) != 0) {
                bigDecimal = null;
            }
            optionOrderValidationFailureResolver.launchTransfers(bigDecimal, brokerageAccountType, transferAccountType, str);
        }

        public static ActionWithOverrideName handleOrderCheckAction(OptionOrderValidationFailureResolver optionOrderValidationFailureResolver, OptionOrderFormAction action, OptionOrderContext optionOrderContext) {
            final OrderDirection orderDirection;
            UUID uuid;
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(optionOrderContext, "optionOrderContext");
            UUID uuid2 = null;
            if (action instanceof OptionOrderFormAction.CancelBlockingOptionOrders) {
                String accountNumber = optionOrderContext.getAccountContext().getAccount().getAccountNumber();
                List<String> order_ids = ((OptionOrderFormAction.CancelBlockingOptionOrders) action).getValue2().getOrder_ids();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = order_ids.iterator();
                while (it.hasNext()) {
                    try {
                        uuid = StringsKt.toUuid((String) it.next());
                    } catch (IllegalArgumentException unused) {
                        uuid = null;
                    }
                    if (uuid != null) {
                        arrayList.add(uuid);
                    }
                }
                optionOrderValidationFailureResolver.cancelBlockingOrders(arrayList, accountNumber);
                return ActionWithOverrideName.AbortAction.INSTANCE;
            }
            if (action instanceof OptionOrderFormAction.ChangeToLimitTypeOptionOrder) {
                optionOrderValidationFailureResolver.disableStopPriceAndPromptLimit();
                return ActionWithOverrideName.AbortAction.INSTANCE;
            }
            if ((action instanceof OptionOrderFormAction.ClearOptionOrderForm) || (action instanceof OptionOrderFormAction.Deeplink)) {
                return null;
            }
            if (action instanceof OptionOrderFormAction.DepositFunds) {
                String accountNumberRhs = optionOrderContext.getAccountContext().getAccount().getAccountNumberRhs();
                BrokerageAccountType brokerageAccountType = optionOrderContext.getAccountContext().getAccount().getBrokerageAccountType();
                optionOrderValidationFailureResolver.launchTransfers(((OptionOrderFormAction.DepositFunds) action).getValue2().getDeposit_amount().getAmount(), brokerageAccountType, ApiTransferAccount.TransferAccountType.INSTANCE.fromBrokerageAccountType(brokerageAccountType), accountNumberRhs);
                return ActionWithOverrideName.AbortAction.INSTANCE;
            }
            if (action instanceof OptionOrderFormAction.Dismiss) {
                return ActionWithOverrideName.AbortAction.INSTANCE;
            }
            if (action instanceof OptionOrderFormAction.EditOptionOrderLimitPrice) {
                optionOrderValidationFailureResolver.promptForLimitPrice();
                return ActionWithOverrideName.AbortAction.INSTANCE;
            }
            if (action instanceof OptionOrderFormAction.EditOptionOrderStopPrice) {
                optionOrderValidationFailureResolver.promptForStopPrice();
                return ActionWithOverrideName.AbortAction.INSTANCE;
            }
            if (action instanceof OptionOrderFormAction.GoToEditStep) {
                return ActionWithOverrideName.AbortAction.INSTANCE;
            }
            if (action instanceof OptionOrderFormAction.InfoAlert) {
                return null;
            }
            if (action instanceof OptionOrderFormAction.OptionDeeplinkAction) {
                Uri uri = Uri.parse(((OptionOrderFormAction.OptionDeeplinkAction) action).getValue2().getUri());
                Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                optionOrderValidationFailureResolver.launchDeepLink(uri);
                return ActionWithOverrideName.AbortAction.INSTANCE;
            }
            if (action instanceof OptionOrderFormAction.OptionDismissAction) {
                return ActionWithOverrideName.AbortAction.INSTANCE;
            }
            if (action instanceof OptionOrderFormAction.OpenDayTradingSettings) {
                optionOrderValidationFailureResolver.launchDayTradeSettings(optionOrderContext.getAccountContext().getAccount().getAccountNumber());
                return ActionWithOverrideName.AbortAction.INSTANCE;
            }
            if (action instanceof OptionOrderFormAction.OverrideDayTradeChecks) {
                optionOrderValidationFailureResolver.overrideDayTradeChecks();
                return new ActionWithOverrideName.RetryAction(new Function1() { // from class: com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver$DefaultImpls$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(OptionOrderValidationFailureResolver.DefaultImpls.handleOrderCheckAction$lambda$1((OptionOrderContext) obj));
                    }
                });
            }
            if (action instanceof OptionOrderFormAction.OverrideOptionOrderCheck) {
                return new ActionWithOverrideName.SkipAction(((OptionOrderFormAction.OverrideOptionOrderCheck) action).getValue2().getOverride_name());
            }
            if (action instanceof OptionOrderFormAction.SetOptionOrderDirection) {
                OptionOrderFormAction.SetOptionOrderDirection setOptionOrderDirection = (OptionOrderFormAction.SetOptionOrderDirection) action;
                int i = WhenMappings.$EnumSwitchMapping$0[setOptionOrderDirection.getValue2().getTo_direction().ordinal()];
                if (i == 1) {
                    orderDirection = OrderDirection.DEBIT;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    orderDirection = OrderDirection.CREDIT;
                }
                optionOrderValidationFailureResolver.overrideDirection(orderDirection);
                if (!Intrinsics.areEqual(setOptionOrderDirection.getValue2().getPreserve_user_input(), Boolean.TRUE)) {
                    return optionOrderContext.getPrices().getNetDirection() != orderDirection ? ActionWithOverrideName.AbortAction.INSTANCE : new ActionWithOverrideName.RetryAction(new Function1() { // from class: com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver$DefaultImpls$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(OptionOrderValidationFailureResolver.DefaultImpls.handleOrderCheckAction$lambda$3(orderDirection, (OptionOrderContext) obj));
                        }
                    });
                }
                optionOrderValidationFailureResolver.setPreserveUserInput(true);
                return new ActionWithOverrideName.RetryAction(new Function1() { // from class: com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver$DefaultImpls$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(OptionOrderValidationFailureResolver.DefaultImpls.handleOrderCheckAction$lambda$2(orderDirection, (OptionOrderContext) obj));
                    }
                });
            }
            if (action instanceof OptionOrderFormAction.SetOptionOrderQuantity) {
                final BigDecimal bigDecimalValueOf = BigDecimal.valueOf(((OptionOrderFormAction.SetOptionOrderQuantity) action).getValue2().getQuantity());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                optionOrderValidationFailureResolver.updateQuantity(bigDecimalValueOf);
                return new ActionWithOverrideName.RetryAction(new Function1() { // from class: com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver$DefaultImpls$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(OptionOrderValidationFailureResolver.DefaultImpls.handleOrderCheckAction$lambda$4(bigDecimalValueOf, (OptionOrderContext) obj));
                    }
                });
            }
            if (action instanceof OptionOrderFormAction.SetOptionOrderLimitPrice) {
                final BigDecimal amount = ((OptionOrderFormAction.SetOptionOrderLimitPrice) action).getValue2().getPrice().getAmount();
                optionOrderValidationFailureResolver.updateLimitPrice(amount);
                return new ActionWithOverrideName.RetryAction(new Function1() { // from class: com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver$DefaultImpls$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(OptionOrderValidationFailureResolver.DefaultImpls.handleOrderCheckAction$lambda$5(amount, (OptionOrderContext) obj));
                    }
                });
            }
            if (action instanceof OptionOrderFormAction.SignRhsConsent) {
                optionOrderValidationFailureResolver.launchRhsConversion();
                return ActionWithOverrideName.AbortAction.INSTANCE;
            }
            if (action instanceof OptionOrderFormAction.ViewPendingOptionOrder) {
                return null;
            }
            if (action instanceof OptionOrderFormAction.OptionCancelPendingCryptoOrders) {
                optionOrderValidationFailureResolver.cancelPendingCryptoOrders();
                return new ActionWithOverrideName.RetryAction(new Function1() { // from class: com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver$DefaultImpls$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(OptionOrderValidationFailureResolver.DefaultImpls.handleOrderCheckAction$lambda$6((OptionOrderContext) obj));
                    }
                });
            }
            if (action instanceof OptionOrderFormAction.ViewExistingOptionOrder) {
                try {
                    uuid2 = StringsKt.toUuid(((OptionOrderFormAction.ViewExistingOptionOrder) action).getValue2().getExisting_option_order_id());
                } catch (IllegalArgumentException unused2) {
                }
                if (uuid2 != null) {
                    optionOrderValidationFailureResolver.viewExistingOptionOrder(uuid2);
                }
                return ActionWithOverrideName.AbortAction.INSTANCE;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean handleOrderCheckAction$lambda$1(OptionOrderContext it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getRequestArguments().getOverrideDayTradeChecks();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean handleOrderCheckAction$lambda$2(OrderDirection orderDirection, OptionOrderContext it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getPrices().getPreserveUserInput() && it.getPrices().getDirectionOverride() == orderDirection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean handleOrderCheckAction$lambda$3(OrderDirection orderDirection, OptionOrderContext it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getPrices().getDirectionOverride() == orderDirection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean handleOrderCheckAction$lambda$4(BigDecimal bigDecimal, OptionOrderContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getRequestArguments().getQuantity().compareTo(bigDecimal) == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean handleOrderCheckAction$lambda$5(BigDecimal bigDecimal, OptionOrderContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            BigDecimal absoluteLimitPriceForServerOrderCheckRetryAction = context.getPrices().getAbsoluteLimitPriceForServerOrderCheckRetryAction();
            return absoluteLimitPriceForServerOrderCheckRetryAction != null && absoluteLimitPriceForServerOrderCheckRetryAction.compareTo(bigDecimal) == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean handleOrderCheckAction$lambda$6(OptionOrderContext it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Response<ApiCryptoCancelAllPendingOrders> cryptoCancelAllPendingOrdersResponse = it.getValidationContext().getCryptoCancelAllPendingOrdersResponse();
            ApiCryptoCancelAllPendingOrders apiCryptoCancelAllPendingOrdersBody = cryptoCancelAllPendingOrdersResponse != null ? cryptoCancelAllPendingOrdersResponse.body() : null;
            return cryptoCancelAllPendingOrdersResponse != null && cryptoCancelAllPendingOrdersResponse.isSuccessful() && apiCryptoCancelAllPendingOrdersBody != null && apiCryptoCancelAllPendingOrdersBody.getTotal_pending_order_count() == apiCryptoCancelAllPendingOrdersBody.getCanceled_pending_order_count();
        }

        public static String loggingIdentifier(OptionOrderValidationFailureResolver optionOrderValidationFailureResolver, OptionOrderFormAction receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof OptionOrderFormAction.CancelBlockingOptionOrders) {
                return ((OptionOrderFormAction.CancelBlockingOptionOrders) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.ChangeToLimitTypeOptionOrder) {
                return ((OptionOrderFormAction.ChangeToLimitTypeOptionOrder) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.ClearOptionOrderForm) {
                return ((OptionOrderFormAction.ClearOptionOrderForm) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.Deeplink) {
                return null;
            }
            if (receiver instanceof OptionOrderFormAction.DepositFunds) {
                return ((OptionOrderFormAction.DepositFunds) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.Dismiss) {
                return null;
            }
            if (receiver instanceof OptionOrderFormAction.EditOptionOrderLimitPrice) {
                return ((OptionOrderFormAction.EditOptionOrderLimitPrice) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.EditOptionOrderStopPrice) {
                return ((OptionOrderFormAction.EditOptionOrderStopPrice) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.GoToEditStep) {
                return ((OptionOrderFormAction.GoToEditStep) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.InfoAlert) {
                return null;
            }
            if (receiver instanceof OptionOrderFormAction.OpenDayTradingSettings) {
                return ((OptionOrderFormAction.OpenDayTradingSettings) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.OptionCancelPendingCryptoOrders) {
                return ((OptionOrderFormAction.OptionCancelPendingCryptoOrders) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.OptionDeeplinkAction) {
                return ((OptionOrderFormAction.OptionDeeplinkAction) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.OptionDismissAction) {
                return ((OptionOrderFormAction.OptionDismissAction) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.OverrideDayTradeChecks) {
                return ((OptionOrderFormAction.OverrideDayTradeChecks) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.OverrideOptionOrderCheck) {
                return ((OptionOrderFormAction.OverrideOptionOrderCheck) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.SetOptionOrderDirection) {
                return ((OptionOrderFormAction.SetOptionOrderDirection) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.SetOptionOrderLimitPrice) {
                return ((OptionOrderFormAction.SetOptionOrderLimitPrice) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.SetOptionOrderQuantity) {
                return ((OptionOrderFormAction.SetOptionOrderQuantity) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.SignRhsConsent) {
                return ((OptionOrderFormAction.SignRhsConsent) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.ViewPendingOptionOrder) {
                return ((OptionOrderFormAction.ViewPendingOptionOrder) receiver).getValue2().getLogging_identifier();
            }
            if (receiver instanceof OptionOrderFormAction.ViewExistingOptionOrder) {
                return ((OptionOrderFormAction.ViewExistingOptionOrder) receiver).getValue2().getLogging_identifier();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: OptionOrderValidationFailureResolver.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB#\b\u0004\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/trade/options/validation/OptionOrderValidationFailureResolver$ActionWithOverrideName;", "", "action", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "Lcom/robinhood/android/common/options/order/OptionOrderContext;", "overrideName", "", "<init>", "(Lcom/robinhood/android/lib/trade/validation/Validator$Action;Ljava/lang/String;)V", "getAction", "()Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "getOverrideName", "()Ljava/lang/String;", "SkipAction", "AbortAction", "RetryAction", "Lcom/robinhood/android/trade/options/validation/OptionOrderValidationFailureResolver$ActionWithOverrideName$AbortAction;", "Lcom/robinhood/android/trade/options/validation/OptionOrderValidationFailureResolver$ActionWithOverrideName$RetryAction;", "Lcom/robinhood/android/trade/options/validation/OptionOrderValidationFailureResolver$ActionWithOverrideName$SkipAction;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ActionWithOverrideName {
        public static final int $stable = Validator.Action.$stable;
        private final Validator.Action<OptionOrderContext> action;
        private final String overrideName;

        public /* synthetic */ ActionWithOverrideName(Validator.Action action, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(action, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private ActionWithOverrideName(Validator.Action<? super OptionOrderContext> action, String str) {
            this.action = action;
            this.overrideName = str;
        }

        public /* synthetic */ ActionWithOverrideName(Validator.Action action, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(action, (i & 2) != 0 ? null : str, null);
        }

        public final Validator.Action<OptionOrderContext> getAction() {
            return this.action;
        }

        public String getOverrideName() {
            return this.overrideName;
        }

        /* compiled from: OptionOrderValidationFailureResolver.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/trade/options/validation/OptionOrderValidationFailureResolver$ActionWithOverrideName$SkipAction;", "Lcom/robinhood/android/trade/options/validation/OptionOrderValidationFailureResolver$ActionWithOverrideName;", "overrideName", "", "<init>", "(Ljava/lang/String;)V", "getOverrideName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SkipAction extends ActionWithOverrideName {
            public static final int $stable = Validator.Action.$stable;
            private final String overrideName;

            public static /* synthetic */ SkipAction copy$default(SkipAction skipAction, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = skipAction.overrideName;
                }
                return skipAction.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getOverrideName() {
                return this.overrideName;
            }

            public final SkipAction copy(String overrideName) {
                Intrinsics.checkNotNullParameter(overrideName, "overrideName");
                return new SkipAction(overrideName);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SkipAction) && Intrinsics.areEqual(this.overrideName, ((SkipAction) other).overrideName);
            }

            public int hashCode() {
                return this.overrideName.hashCode();
            }

            public String toString() {
                return "SkipAction(overrideName=" + this.overrideName + ")";
            }

            @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver.ActionWithOverrideName
            public String getOverrideName() {
                return this.overrideName;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SkipAction(String overrideName) {
                super(Validator.Action.Skip.INSTANCE, overrideName, null);
                Intrinsics.checkNotNullParameter(overrideName, "overrideName");
                this.overrideName = overrideName;
            }
        }

        /* compiled from: OptionOrderValidationFailureResolver.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/trade/options/validation/OptionOrderValidationFailureResolver$ActionWithOverrideName$AbortAction;", "Lcom/robinhood/android/trade/options/validation/OptionOrderValidationFailureResolver$ActionWithOverrideName;", "<init>", "()V", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AbortAction extends ActionWithOverrideName {
            public static final AbortAction INSTANCE = new AbortAction();
            public static final int $stable = Validator.Action.$stable;

            /* JADX WARN: Multi-variable type inference failed */
            private AbortAction() {
                super(Validator.Action.Abort.INSTANCE, null, 2, 0 == true ? 1 : 0);
            }
        }

        /* compiled from: OptionOrderValidationFailureResolver.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/trade/options/validation/OptionOrderValidationFailureResolver$ActionWithOverrideName$RetryAction;", "Lcom/robinhood/android/trade/options/validation/OptionOrderValidationFailureResolver$ActionWithOverrideName;", "retryPredicate", "Lkotlin/Function1;", "Lcom/robinhood/android/common/options/order/OptionOrderContext;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getRetryPredicate", "()Lkotlin/jvm/functions/Function1;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RetryAction extends ActionWithOverrideName {
            public static final int $stable = Validator.Action.$stable;
            private final Function1<OptionOrderContext, Boolean> retryPredicate;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RetryAction copy$default(RetryAction retryAction, Function1 function1, int i, Object obj) {
                if ((i & 1) != 0) {
                    function1 = retryAction.retryPredicate;
                }
                return retryAction.copy(function1);
            }

            public final Function1<OptionOrderContext, Boolean> component1() {
                return this.retryPredicate;
            }

            public final RetryAction copy(Function1<? super OptionOrderContext, Boolean> retryPredicate) {
                Intrinsics.checkNotNullParameter(retryPredicate, "retryPredicate");
                return new RetryAction(retryPredicate);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RetryAction) && Intrinsics.areEqual(this.retryPredicate, ((RetryAction) other).retryPredicate);
            }

            public int hashCode() {
                return this.retryPredicate.hashCode();
            }

            public String toString() {
                return "RetryAction(retryPredicate=" + this.retryPredicate + ")";
            }

            public final Function1<OptionOrderContext, Boolean> getRetryPredicate() {
                return this.retryPredicate;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public RetryAction(Function1<? super OptionOrderContext, Boolean> retryPredicate) {
                super(new Validator.Action.RetryWhen(retryPredicate), null, 2, 0 == true ? 1 : 0);
                Intrinsics.checkNotNullParameter(retryPredicate, "retryPredicate");
                this.retryPredicate = retryPredicate;
            }
        }
    }
}
