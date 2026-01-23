package com.robinhood.android.transfers.lib.validation;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.transfers.lib.ExtensionsKt;
import com.robinhood.android.transfers.lib.validation.LimitsHubCheck;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.converters.cash.Transfers;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Money;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogLimitsHubCheckFailure.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aB\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f\u001aB\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0011\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u000fH\u0002¨\u0006\u0014"}, m3636d2 = {"logLimitsHubCheckFailure", "", "Lcom/robinhood/analytics/EventLogger;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPointLoggingIdentifier", "", "sessionId", "Ljava/util/UUID;", "amount", "Ljava/math/BigDecimal;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "failure", "Lcom/robinhood/android/transfers/lib/validation/LimitsHubCheck$Failure;", "logWireUpsellAmountError", "Lcom/robinhood/android/transfers/lib/validation/LimitsHubCheck$Failure$Amount;", "toTransferLimitValidationError", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferLimitValidationError;", "lib-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.lib.validation.LogLimitsHubCheckFailureKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class LogLimitsHubCheckFailure {
    public static final void logLimitsHubCheckFailure(EventLogger eventLogger, MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier, UUID sessionId, BigDecimal amount, TransferAccount sourceAccount, TransferAccount sinkAccount, LimitsHubCheck.Failure failure) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(entryPointLoggingIdentifier, "entryPointLoggingIdentifier");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        Intrinsics.checkNotNullParameter(failure, "failure");
        Money moneyForLogging = ExtensionsKt.toMoneyForLogging(amount);
        MAXTransferContext.TransferAccount protobuf = Transfers.toProtobuf(sourceAccount);
        MAXTransferContext.TransferAccount protobuf2 = Transfers.toProtobuf(sinkAccount);
        String string2 = sessionId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(null, null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MAXTransferContext(null, moneyForLogging, protobuf, protobuf2, null, null, entryPoint, null, string2, null, null, null, toTransferLimitValidationError(failure), null, null, entryPointLoggingIdentifier, null, null, null, null, 1011377, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), null, null, 111, null), false, false, 6, null);
    }

    public static final void logWireUpsellAmountError(EventLogger eventLogger, MAXTransferContext.EntryPoint entryPoint, String entryPointLoggingIdentifier, UUID sessionId, BigDecimal amount, TransferAccount sourceAccount, TransferAccount sinkAccount, LimitsHubCheck.Failure.Amount failure) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(entryPointLoggingIdentifier, "entryPointLoggingIdentifier");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        Intrinsics.checkNotNullParameter(failure, "failure");
        Money moneyForLogging = ExtensionsKt.toMoneyForLogging(amount);
        MAXTransferContext.TransferAccount protobuf = Transfers.toProtobuf(sourceAccount);
        MAXTransferContext.TransferAccount protobuf2 = Transfers.toProtobuf(sinkAccount);
        String string2 = sessionId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, new Screen(Screen.Name.CREATE_MAX_TRANSFER, null, null, null, 14, null), new Component(Component.ComponentType.ALERT, "limit-hub-error-wires-upsell", null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MAXTransferContext(null, moneyForLogging, protobuf, protobuf2, null, null, entryPoint, null, string2, null, null, null, toTransferLimitValidationError(failure), null, null, entryPointLoggingIdentifier, null, null, null, null, 1011377, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), 9, null);
    }

    private static final MAXTransferContext.TransferLimitValidationError toTransferLimitValidationError(LimitsHubCheck.Failure failure) {
        if (failure instanceof LimitsHubCheck.Failure.Amount) {
            MAXTransferContext.TransferLimitValidationError.LimitErrorType limitErrorType = MAXTransferContext.TransferLimitValidationError.LimitErrorType.AMOUNT;
            LimitsHubCheck.Failure.Amount amount = (LimitsHubCheck.Failure.Amount) failure;
            String string2 = amount.getAmountLimit().getTotal_amount().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            String string3 = amount.getAmountLimit().getRemaining_amount().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            return new MAXTransferContext.TransferLimitValidationError(limitErrorType, string2, string3, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        }
        if (failure instanceof LimitsHubCheck.Failure.Count) {
            LimitsHubCheck.Failure.Count count = (LimitsHubCheck.Failure.Count) failure;
            return new MAXTransferContext.TransferLimitValidationError(MAXTransferContext.TransferLimitValidationError.LimitErrorType.COUNT, null, String.valueOf(count.getCountLimit().getRemaining_count()), String.valueOf(count.getCountLimit().getTotal_count()), null, null, null, null, EnumC7081g.f2778x3356acf6, null);
        }
        if (!(failure instanceof LimitsHubCheck.Failure.HigherThanAllRemainingAmount)) {
            throw new NoWhenBranchMatchedException();
        }
        return new MAXTransferContext.TransferLimitValidationError(MAXTransferContext.TransferLimitValidationError.LimitErrorType.AMOUNT, null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
    }
}
