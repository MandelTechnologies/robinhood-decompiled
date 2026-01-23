package com.robinhood.android.futures.detail.utils;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.models.futures.api.arsenal.FuturesContractTradability;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.ContractTradability;
import com.robinhood.rosetta.eventlogging.FuturesContractContext;
import com.robinhood.rosetta.eventlogging.FuturesPositionContext;
import com.robinhood.rosetta.eventlogging.FuturesTradeBarContext;
import com.robinhood.rosetta.eventlogging.Money;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LoggingUtils.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u00012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0001¢\u0006\u0002\u0010\t\u001a\u0015\u0010\n\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001a\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u000e\u0010\u0015\u001a\u00020\u0016*\u0004\u0018\u00010\u0017H\u0002¨\u0006\u0018"}, m3636d2 = {"futuresDetailBaseEventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$LoggingData;", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$LoggingData;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "actionDescriptor", "identifier", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "buttonDescriptor", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "tradeBarEventDescriptor", "tradeBarData", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData;", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$TradeBarData;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "getButtonStatus", "Lcom/robinhood/rosetta/eventlogging/FuturesTradeBarContext$ButtonStatus;", "isEnabled", "", "toProto", "Lcom/robinhood/rosetta/eventlogging/ContractTradability;", "Lcom/robinhood/android/models/futures/api/arsenal/FuturesContractTradability;", "feature-futures-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.detail.utils.LoggingUtilsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class LoggingUtils5 {

    /* compiled from: LoggingUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.detail.utils.LoggingUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FuturesContractTradability.values().length];
            try {
                iArr[FuturesContractTradability.TRADABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesContractTradability.UNTRADABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesContractTradability.PCO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final UserInteractionEventDescriptor futuresDetailBaseEventDescriptor(FuturesDetailViewState.LoggingData data, Composer composer, int i) {
        String strSafeToString;
        Money money;
        ContractTradability proto;
        Intrinsics.checkNotNullParameter(data, "data");
        composer.startReplaceGroup(884734546);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(884734546, i, -1, "com.robinhood.android.futures.detail.utils.futuresDetailBaseEventDescriptor (LoggingUtils.kt:23)");
        }
        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
        Screen screen = new Screen(Screen.Name.FUTURES_DETAIL_SCREEN, null, null, null, 14, null);
        Context contextOrNew = UserInteractionEventDescriptor2.orNew(((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getContext());
        UUID selectedContractId = data.getSelectedContractId();
        if (selectedContractId == null || (strSafeToString = Uuids.safeToString(selectedContractId)) == null) {
            strSafeToString = "";
        }
        String str = strSafeToString;
        com.robinhood.models.util.Money marginRequirement = data.getMarginRequirement();
        if (marginRequirement != null) {
            String plainString = marginRequirement.getDecimalValue().toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
            String currencyCode = marginRequirement.getCurrency().getCurrencyCode();
            Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
            money = new Money(plainString, Currency.valueOf(currencyCode), null, null, 12, null);
        } else {
            money = null;
        }
        FuturesContractTradability selectedContractTradability = data.getSelectedContractTradability();
        if (selectedContractTradability == null || (proto = toProto(selectedContractTradability)) == null) {
            proto = ContractTradability.TRADABILITY_UNSPECIFIED;
        }
        UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, screen, null, Context.copy$default(contextOrNew, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new FuturesContractContext(str, money, proto, null, 8, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new FuturesPositionContext(data.getNumPosition(), data.getNumPendingOrders(), 0.0d, 0, null, 28, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -2097169, 16383, null), null, null, 53, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return userInteractionEventDescriptorCopy$default;
    }

    public static final UserInteractionEventDescriptor actionDescriptor(UserInteractionEventData.Action identifier, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        composer.startReplaceGroup(1865348781);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1865348781, i, -1, "com.robinhood.android.futures.detail.utils.actionDescriptor (LoggingUtils.kt:51)");
        }
        UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, identifier, null, null, null, 59, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return userInteractionEventDescriptorCopy$default;
    }

    public static final UserInteractionEventDescriptor buttonDescriptor(String identifier, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        composer.startReplaceGroup(658868718);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(658868718, i, -1, "com.robinhood.android.futures.detail.utils.buttonDescriptor (LoggingUtils.kt:60)");
        }
        UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), identifier, null, null, null, new Component(Component.ComponentType.BUTTON, identifier, null, 4, null), null, 46, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return userInteractionEventDescriptorCopy$default;
    }

    public static final UserInteractionEventDescriptor tradeBarEventDescriptor(FuturesDetailViewState.TradeBarData tradeBarData, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(tradeBarData, "tradeBarData");
        composer.startReplaceGroup(-1284357661);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1284357661, i, -1, "com.robinhood.android.futures.detail.utils.tradeBarEventDescriptor (LoggingUtils.kt:73)");
        }
        UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, null, null, Context.copy$default(UserInteractionEventDescriptor2.orNew(((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getContext()), 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new FuturesTradeBarContext(getButtonStatus(tradeBarData.getTradeButtonEnabled()), getButtonStatus(tradeBarData.getBuyButtonEnabled()), getButtonStatus(tradeBarData.getSellButtonEnabled()), toProto(tradeBarData.getTradability()), null, 16, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -33, 16383, null), null, new ComponentHierarchy(new Component(Component.ComponentType.FUTURES_TRADE_BAR, null, null, 6, null), null, null, null, null, 30, null), 23, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return userInteractionEventDescriptor;
    }

    private static final FuturesTradeBarContext.ButtonStatus getButtonStatus(boolean z) {
        if (z) {
            return FuturesTradeBarContext.ButtonStatus.ENABLED;
        }
        return FuturesTradeBarContext.ButtonStatus.DISABLED;
    }

    private static final ContractTradability toProto(FuturesContractTradability futuresContractTradability) {
        int i = futuresContractTradability == null ? -1 : WhenMappings.$EnumSwitchMapping$0[futuresContractTradability.ordinal()];
        if (i == -1) {
            return ContractTradability.TRADABILITY_UNSPECIFIED;
        }
        if (i == 1) {
            return ContractTradability.TRADABLE;
        }
        if (i == 2) {
            return ContractTradability.UNTRADABLE;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return ContractTradability.PCO;
    }
}
