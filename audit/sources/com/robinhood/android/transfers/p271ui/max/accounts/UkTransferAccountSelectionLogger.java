package com.robinhood.android.transfers.p271ui.max.accounts;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.converters.cash.Transfers;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkTransferAccountSelectionLogger.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0000\u001a(\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0000¨\u0006\u000b"}, m3636d2 = {"logAddNewUkBankAccountSelected", "", "Lcom/robinhood/analytics/EventLogger;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "logUkBankAccountSelected", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "selectedAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.accounts.UkTransferAccountSelectionLoggerKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UkTransferAccountSelectionLogger {

    /* compiled from: UkTransferAccountSelectionLogger.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.accounts.UkTransferAccountSelectionLoggerKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferAccountDirection.values().length];
            try {
                iArr[TransferAccountDirection.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferAccountDirection.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void logAddNewUkBankAccountSelected(EventLogger eventLogger, Context eventContext) {
        MAXTransferContext mAXTransferContextCopy;
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        Screen screen = new Screen(Screen.Name.TRANSFER_ACCOUNT_SELECTION, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.ROW, "new_bank_account", null, 4, null);
        MAXTransferContext max_transfer_context = eventContext.getMax_transfer_context();
        if (max_transfer_context != null) {
            mAXTransferContextCopy = max_transfer_context.copy((377169 & 1) != 0 ? max_transfer_context.id : null, (377169 & 2) != 0 ? max_transfer_context.amount : null, (377169 & 4) != 0 ? max_transfer_context.source_account : new MAXTransferContext.TransferAccount(null, MAXTransferContext.TransferAccount.TransferAccountType.UK_BANK_ACCOUNT, null, null, null, null, 61, null), (377169 & 8) != 0 ? max_transfer_context.sink_account : new MAXTransferContext.TransferAccount(null, MAXTransferContext.TransferAccount.TransferAccountType.RHS, null, null, null, null, 61, null), (377169 & 16) != 0 ? max_transfer_context.frequency : null, (377169 & 32) != 0 ? max_transfer_context.ira_contribution_data : null, (377169 & 64) != 0 ? max_transfer_context.entry_point : null, (377169 & 128) != 0 ? max_transfer_context.ira_distribution_data : null, (377169 & 256) != 0 ? max_transfer_context.session_id : null, (377169 & 512) != 0 ? max_transfer_context.ach_transfer_data : null, (377169 & 1024) != 0 ? max_transfer_context.deposit_suggestions : null, (377169 & 2048) != 0 ? max_transfer_context.ira_roth_conversion_data : null, (377169 & 4096) != 0 ? max_transfer_context.transfer_limit_validation_error : null, (377169 & 8192) != 0 ? max_transfer_context.currency_conversion_data : null, (377169 & 16384) != 0 ? max_transfer_context.locality : null, (377169 & 32768) != 0 ? max_transfer_context.entry_point_logging_identifier : null, (377169 & 65536) != 0 ? max_transfer_context.transfer_v2_direction : null, (377169 & 131072) != 0 ? max_transfer_context.selected_pill_amount : null, (377169 & 262144) != 0 ? max_transfer_context.transfer_method : null, (377169 & 524288) != 0 ? max_transfer_context.unknownFields() : null);
        } else {
            mAXTransferContextCopy = null;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, Context.copy$default(eventContext, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mAXTransferContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), false, 41, null);
    }

    public static final void logUkBankAccountSelected(EventLogger eventLogger, TransferAccountDirection direction, TransferAccount selectedAccount, Context eventContext) {
        MAXTransferContext mAXTransferContextCopy;
        MAXTransferContext.TransferAccount protobuf;
        MAXTransferContext.TransferAccount transferAccount;
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(selectedAccount, "selectedAccount");
        Intrinsics.checkNotNullParameter(eventContext, "eventContext");
        Screen screen = new Screen(Screen.Name.TRANSFER_ACCOUNT_SELECTION, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.ROW, "linked_bank_account", null, 4, null);
        MAXTransferContext max_transfer_context = eventContext.getMax_transfer_context();
        if (max_transfer_context != null) {
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i = iArr[direction.ordinal()];
            if (i == 1) {
                protobuf = Transfers.toProtobuf(selectedAccount);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                protobuf = new MAXTransferContext.TransferAccount(null, MAXTransferContext.TransferAccount.TransferAccountType.RHS, null, null, null, null, 61, null);
            }
            int i2 = iArr[direction.ordinal()];
            if (i2 == 1) {
                transferAccount = new MAXTransferContext.TransferAccount(null, MAXTransferContext.TransferAccount.TransferAccountType.RHS, null, null, null, null, 61, null);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                transferAccount = Transfers.toProtobuf(selectedAccount);
            }
            mAXTransferContextCopy = max_transfer_context.copy((377169 & 1) != 0 ? max_transfer_context.id : null, (377169 & 2) != 0 ? max_transfer_context.amount : null, (377169 & 4) != 0 ? max_transfer_context.source_account : protobuf, (377169 & 8) != 0 ? max_transfer_context.sink_account : transferAccount, (377169 & 16) != 0 ? max_transfer_context.frequency : null, (377169 & 32) != 0 ? max_transfer_context.ira_contribution_data : null, (377169 & 64) != 0 ? max_transfer_context.entry_point : null, (377169 & 128) != 0 ? max_transfer_context.ira_distribution_data : null, (377169 & 256) != 0 ? max_transfer_context.session_id : null, (377169 & 512) != 0 ? max_transfer_context.ach_transfer_data : null, (377169 & 1024) != 0 ? max_transfer_context.deposit_suggestions : null, (377169 & 2048) != 0 ? max_transfer_context.ira_roth_conversion_data : null, (377169 & 4096) != 0 ? max_transfer_context.transfer_limit_validation_error : null, (377169 & 8192) != 0 ? max_transfer_context.currency_conversion_data : null, (377169 & 16384) != 0 ? max_transfer_context.locality : null, (377169 & 32768) != 0 ? max_transfer_context.entry_point_logging_identifier : null, (377169 & 65536) != 0 ? max_transfer_context.transfer_v2_direction : null, (377169 & 131072) != 0 ? max_transfer_context.selected_pill_amount : null, (377169 & 262144) != 0 ? max_transfer_context.transfer_method : null, (377169 & 524288) != 0 ? max_transfer_context.unknownFields() : null);
        } else {
            mAXTransferContextCopy = null;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, Context.copy$default(eventContext, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mAXTransferContextCopy, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), false, 41, null);
    }
}
