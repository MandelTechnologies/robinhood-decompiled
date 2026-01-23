package com.robinhood.shared.crypto.transfer.send.amount;

import com.robinhood.shared.crypto.contracts.transfers.CryptoTransferVerificationIntentKey;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendAmountEvent.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent;", "", "InputErrorEvent", "InsufficientHoldings", "WithdrawalPrepared", "ShowInputModeSelector", "ShowWarnSheet", "UpdateToolbarItem", "VerifyAddressOwnership", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent$InputErrorEvent;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent$InsufficientHoldings;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent$ShowInputModeSelector;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent$ShowWarnSheet;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent$UpdateToolbarItem;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent$VerifyAddressOwnership;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent$WithdrawalPrepared;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface CryptoTransferSendAmountEvent {

    /* compiled from: CryptoTransferSendAmountEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent$InputErrorEvent;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent;", "error", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$CryptoValidationErrorWrapper;", "<init>", "(Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$CryptoValidationErrorWrapper;)V", "getError", "()Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$CryptoValidationErrorWrapper;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InputErrorEvent implements CryptoTransferSendAmountEvent {
        public static final int $stable = 8;
        private final CryptoTransferSendAmountViewState.CryptoValidationErrorWrapper error;

        public static /* synthetic */ InputErrorEvent copy$default(InputErrorEvent inputErrorEvent, CryptoTransferSendAmountViewState.CryptoValidationErrorWrapper cryptoValidationErrorWrapper, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoValidationErrorWrapper = inputErrorEvent.error;
            }
            return inputErrorEvent.copy(cryptoValidationErrorWrapper);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoTransferSendAmountViewState.CryptoValidationErrorWrapper getError() {
            return this.error;
        }

        public final InputErrorEvent copy(CryptoTransferSendAmountViewState.CryptoValidationErrorWrapper error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new InputErrorEvent(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InputErrorEvent) && Intrinsics.areEqual(this.error, ((InputErrorEvent) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "InputErrorEvent(error=" + this.error + ")";
        }

        public InputErrorEvent(CryptoTransferSendAmountViewState.CryptoValidationErrorWrapper error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final CryptoTransferSendAmountViewState.CryptoValidationErrorWrapper getError() {
            return this.error;
        }
    }

    /* compiled from: CryptoTransferSendAmountEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent$InsufficientHoldings;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent;", "isFromGateway", "", "message", "Lcom/robinhood/utils/resource/StringResource;", "positiveButton", "negativeButton", "<init>", "(ZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "()Z", "getMessage", "()Lcom/robinhood/utils/resource/StringResource;", "getPositiveButton", "getNegativeButton", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InsufficientHoldings implements CryptoTransferSendAmountEvent {
        public static final int $stable = StringResource.$stable;
        private final boolean isFromGateway;
        private final StringResource message;
        private final StringResource negativeButton;
        private final StringResource positiveButton;

        public static /* synthetic */ InsufficientHoldings copy$default(InsufficientHoldings insufficientHoldings, boolean z, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = insufficientHoldings.isFromGateway;
            }
            if ((i & 2) != 0) {
                stringResource = insufficientHoldings.message;
            }
            if ((i & 4) != 0) {
                stringResource2 = insufficientHoldings.positiveButton;
            }
            if ((i & 8) != 0) {
                stringResource3 = insufficientHoldings.negativeButton;
            }
            return insufficientHoldings.copy(z, stringResource, stringResource2, stringResource3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsFromGateway() {
            return this.isFromGateway;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getPositiveButton() {
            return this.positiveButton;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getNegativeButton() {
            return this.negativeButton;
        }

        public final InsufficientHoldings copy(boolean isFromGateway, StringResource message, StringResource positiveButton, StringResource negativeButton) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
            return new InsufficientHoldings(isFromGateway, message, positiveButton, negativeButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InsufficientHoldings)) {
                return false;
            }
            InsufficientHoldings insufficientHoldings = (InsufficientHoldings) other;
            return this.isFromGateway == insufficientHoldings.isFromGateway && Intrinsics.areEqual(this.message, insufficientHoldings.message) && Intrinsics.areEqual(this.positiveButton, insufficientHoldings.positiveButton) && Intrinsics.areEqual(this.negativeButton, insufficientHoldings.negativeButton);
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.isFromGateway) * 31) + this.message.hashCode()) * 31) + this.positiveButton.hashCode()) * 31) + this.negativeButton.hashCode();
        }

        public String toString() {
            return "InsufficientHoldings(isFromGateway=" + this.isFromGateway + ", message=" + this.message + ", positiveButton=" + this.positiveButton + ", negativeButton=" + this.negativeButton + ")";
        }

        public InsufficientHoldings(boolean z, StringResource message, StringResource positiveButton, StringResource negativeButton) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
            this.isFromGateway = z;
            this.message = message;
            this.positiveButton = positiveButton;
            this.negativeButton = negativeButton;
        }

        public final boolean isFromGateway() {
            return this.isFromGateway;
        }

        public final StringResource getMessage() {
            return this.message;
        }

        public final StringResource getPositiveButton() {
            return this.positiveButton;
        }

        public final StringResource getNegativeButton() {
            return this.negativeButton;
        }
    }

    /* compiled from: CryptoTransferSendAmountEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent$WithdrawalPrepared;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalAttempt;", "<init>", "(Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalAttempt;)V", "getData", "()Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalAttempt;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class WithdrawalPrepared implements CryptoTransferSendAmountEvent {
        public static final int $stable = 8;
        private final CryptoTransferSendAmountViewState.WithdrawalAttempt data;

        public static /* synthetic */ WithdrawalPrepared copy$default(WithdrawalPrepared withdrawalPrepared, CryptoTransferSendAmountViewState.WithdrawalAttempt withdrawalAttempt, int i, Object obj) {
            if ((i & 1) != 0) {
                withdrawalAttempt = withdrawalPrepared.data;
            }
            return withdrawalPrepared.copy(withdrawalAttempt);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoTransferSendAmountViewState.WithdrawalAttempt getData() {
            return this.data;
        }

        public final WithdrawalPrepared copy(CryptoTransferSendAmountViewState.WithdrawalAttempt data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new WithdrawalPrepared(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WithdrawalPrepared) && Intrinsics.areEqual(this.data, ((WithdrawalPrepared) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "WithdrawalPrepared(data=" + this.data + ")";
        }

        public WithdrawalPrepared(CryptoTransferSendAmountViewState.WithdrawalAttempt data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final CryptoTransferSendAmountViewState.WithdrawalAttempt getData() {
            return this.data;
        }
    }

    /* compiled from: CryptoTransferSendAmountEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent$ShowInputModeSelector;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent;", "state", "Lcom/robinhood/shared/crypto/transfer/send/amount/InputModeSelectorSheetContentState;", "<init>", "(Lcom/robinhood/shared/crypto/transfer/send/amount/InputModeSelectorSheetContentState;)V", "getState", "()Lcom/robinhood/shared/crypto/transfer/send/amount/InputModeSelectorSheetContentState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowInputModeSelector implements CryptoTransferSendAmountEvent {
        public static final int $stable = 8;
        private final InputModeSelectorSheetContentState state;

        public static /* synthetic */ ShowInputModeSelector copy$default(ShowInputModeSelector showInputModeSelector, InputModeSelectorSheetContentState inputModeSelectorSheetContentState, int i, Object obj) {
            if ((i & 1) != 0) {
                inputModeSelectorSheetContentState = showInputModeSelector.state;
            }
            return showInputModeSelector.copy(inputModeSelectorSheetContentState);
        }

        /* renamed from: component1, reason: from getter */
        public final InputModeSelectorSheetContentState getState() {
            return this.state;
        }

        public final ShowInputModeSelector copy(InputModeSelectorSheetContentState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new ShowInputModeSelector(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowInputModeSelector) && Intrinsics.areEqual(this.state, ((ShowInputModeSelector) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "ShowInputModeSelector(state=" + this.state + ")";
        }

        public ShowInputModeSelector(InputModeSelectorSheetContentState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        public final InputModeSelectorSheetContentState getState() {
            return this.state;
        }
    }

    /* compiled from: CryptoTransferSendAmountEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent$ShowWarnSheet;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent;", "sheetState", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$CryptoTransferSendWarningSheetState;", "<init>", "(Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$CryptoTransferSendWarningSheetState;)V", "getSheetState", "()Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$CryptoTransferSendWarningSheetState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowWarnSheet implements CryptoTransferSendAmountEvent {
        public static final int $stable = 8;
        private final CryptoTransferSendAmountViewState.CryptoTransferSendWarningSheetState sheetState;

        public static /* synthetic */ ShowWarnSheet copy$default(ShowWarnSheet showWarnSheet, CryptoTransferSendAmountViewState.CryptoTransferSendWarningSheetState cryptoTransferSendWarningSheetState, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoTransferSendWarningSheetState = showWarnSheet.sheetState;
            }
            return showWarnSheet.copy(cryptoTransferSendWarningSheetState);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoTransferSendAmountViewState.CryptoTransferSendWarningSheetState getSheetState() {
            return this.sheetState;
        }

        public final ShowWarnSheet copy(CryptoTransferSendAmountViewState.CryptoTransferSendWarningSheetState sheetState) {
            Intrinsics.checkNotNullParameter(sheetState, "sheetState");
            return new ShowWarnSheet(sheetState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowWarnSheet) && Intrinsics.areEqual(this.sheetState, ((ShowWarnSheet) other).sheetState);
        }

        public int hashCode() {
            return this.sheetState.hashCode();
        }

        public String toString() {
            return "ShowWarnSheet(sheetState=" + this.sheetState + ")";
        }

        public ShowWarnSheet(CryptoTransferSendAmountViewState.CryptoTransferSendWarningSheetState sheetState) {
            Intrinsics.checkNotNullParameter(sheetState, "sheetState");
            this.sheetState = sheetState;
        }

        public final CryptoTransferSendAmountViewState.CryptoTransferSendWarningSheetState getSheetState() {
            return this.sheetState;
        }
    }

    /* compiled from: CryptoTransferSendAmountEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent$UpdateToolbarItem;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent;", "menuText", "", "<init>", "(Ljava/lang/String;)V", "getMenuText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpdateToolbarItem implements CryptoTransferSendAmountEvent {
        public static final int $stable = 0;
        private final String menuText;

        public static /* synthetic */ UpdateToolbarItem copy$default(UpdateToolbarItem updateToolbarItem, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updateToolbarItem.menuText;
            }
            return updateToolbarItem.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMenuText() {
            return this.menuText;
        }

        public final UpdateToolbarItem copy(String menuText) {
            Intrinsics.checkNotNullParameter(menuText, "menuText");
            return new UpdateToolbarItem(menuText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateToolbarItem) && Intrinsics.areEqual(this.menuText, ((UpdateToolbarItem) other).menuText);
        }

        public int hashCode() {
            return this.menuText.hashCode();
        }

        public String toString() {
            return "UpdateToolbarItem(menuText=" + this.menuText + ")";
        }

        public UpdateToolbarItem(String menuText) {
            Intrinsics.checkNotNullParameter(menuText, "menuText");
            this.menuText = menuText;
        }

        public final String getMenuText() {
            return this.menuText;
        }
    }

    /* compiled from: CryptoTransferSendAmountEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent$VerifyAddressOwnership;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$Withdrawal;", "<init>", "(Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$Withdrawal;)V", "getData", "()Lcom/robinhood/shared/crypto/contracts/transfers/CryptoTransferVerificationIntentKey$Withdrawal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class VerifyAddressOwnership implements CryptoTransferSendAmountEvent {
        public static final int $stable = 8;
        private final CryptoTransferVerificationIntentKey.Withdrawal data;

        public static /* synthetic */ VerifyAddressOwnership copy$default(VerifyAddressOwnership verifyAddressOwnership, CryptoTransferVerificationIntentKey.Withdrawal withdrawal, int i, Object obj) {
            if ((i & 1) != 0) {
                withdrawal = verifyAddressOwnership.data;
            }
            return verifyAddressOwnership.copy(withdrawal);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoTransferVerificationIntentKey.Withdrawal getData() {
            return this.data;
        }

        public final VerifyAddressOwnership copy(CryptoTransferVerificationIntentKey.Withdrawal data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new VerifyAddressOwnership(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerifyAddressOwnership) && Intrinsics.areEqual(this.data, ((VerifyAddressOwnership) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "VerifyAddressOwnership(data=" + this.data + ")";
        }

        public VerifyAddressOwnership(CryptoTransferVerificationIntentKey.Withdrawal data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final CryptoTransferVerificationIntentKey.Withdrawal getData() {
            return this.data;
        }
    }
}
