package com.robinhood.android.transfers.p271ui.max.createtransfer;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiAmountLimit;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ValueTextState.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u001f !\"BY\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017\u0082\u0001\u0004#$%&¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/createtransfer/ValueTextState;", "", "selectedAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "otherAccount", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "isInInterEntityMatchExperiment", "", "isOutgoingWire", "serviceFee", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;", "dailyLimits", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;", "iraContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;ZZLcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;Lcom/robinhood/models/api/bonfire/IraContributionType;)V", "getSelectedAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getOtherAccount", "getDirection", "()Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "()Z", "getServiceFee", "()Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;", "getDailyLimits", "()Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;", "getIraContributionType", "()Lcom/robinhood/models/api/bonfire/IraContributionType;", "isLoading", "WithdrawalWithFees", "DefaultLoaded", "Error", "Loading", "Lcom/robinhood/android/transfers/ui/max/createtransfer/ValueTextState$DefaultLoaded;", "Lcom/robinhood/android/transfers/ui/max/createtransfer/ValueTextState$Error;", "Lcom/robinhood/android/transfers/ui/max/createtransfer/ValueTextState$Loading;", "Lcom/robinhood/android/transfers/ui/max/createtransfer/ValueTextState$WithdrawalWithFees;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class ValueTextState {
    public static final int $stable = 8;
    private final ApiAmountLimit dailyLimits;
    private final TransferAccountDirection direction;
    private final IraContributionType iraContributionType;
    private final boolean isInInterEntityMatchExperiment;
    private final boolean isLoading;
    private final boolean isOutgoingWire;
    private final TransferAccount otherAccount;
    private final TransferAccount selectedAccount;
    private final ApiServiceFeeResponse serviceFee;

    public /* synthetic */ ValueTextState(TransferAccount transferAccount, TransferAccount transferAccount2, TransferAccountDirection transferAccountDirection, boolean z, boolean z2, ApiServiceFeeResponse apiServiceFeeResponse, ApiAmountLimit apiAmountLimit, IraContributionType iraContributionType, DefaultConstructorMarker defaultConstructorMarker) {
        this(transferAccount, transferAccount2, transferAccountDirection, z, z2, apiServiceFeeResponse, apiAmountLimit, iraContributionType);
    }

    private ValueTextState(TransferAccount transferAccount, TransferAccount transferAccount2, TransferAccountDirection transferAccountDirection, boolean z, boolean z2, ApiServiceFeeResponse apiServiceFeeResponse, ApiAmountLimit apiAmountLimit, IraContributionType iraContributionType) {
        this.selectedAccount = transferAccount;
        this.otherAccount = transferAccount2;
        this.direction = transferAccountDirection;
        this.isInInterEntityMatchExperiment = z;
        this.isOutgoingWire = z2;
        this.serviceFee = apiServiceFeeResponse;
        this.dailyLimits = apiAmountLimit;
        this.iraContributionType = iraContributionType;
    }

    public /* synthetic */ ValueTextState(TransferAccount transferAccount, TransferAccount transferAccount2, TransferAccountDirection transferAccountDirection, boolean z, boolean z2, ApiServiceFeeResponse apiServiceFeeResponse, ApiAmountLimit apiAmountLimit, IraContributionType iraContributionType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transferAccount, transferAccount2, transferAccountDirection, z, z2, (i & 32) != 0 ? null : apiServiceFeeResponse, (i & 64) != 0 ? null : apiAmountLimit, (i & 128) != 0 ? null : iraContributionType, null);
    }

    public TransferAccount getSelectedAccount() {
        return this.selectedAccount;
    }

    public TransferAccount getOtherAccount() {
        return this.otherAccount;
    }

    public TransferAccountDirection getDirection() {
        return this.direction;
    }

    /* renamed from: isInInterEntityMatchExperiment, reason: from getter */
    public boolean getIsInInterEntityMatchExperiment() {
        return this.isInInterEntityMatchExperiment;
    }

    /* renamed from: isOutgoingWire, reason: from getter */
    public boolean getIsOutgoingWire() {
        return this.isOutgoingWire;
    }

    public ApiServiceFeeResponse getServiceFee() {
        return this.serviceFee;
    }

    public ApiAmountLimit getDailyLimits() {
        return this.dailyLimits;
    }

    public IraContributionType getIraContributionType() {
        return this.iraContributionType;
    }

    /* renamed from: isLoading, reason: from getter */
    public boolean getIsLoading() {
        return this.isLoading;
    }

    /* compiled from: ValueTextState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/createtransfer/ValueTextState$WithdrawalWithFees;", "Lcom/robinhood/android/transfers/ui/max/createtransfer/ValueTextState;", "selectedAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "otherAccount", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "serviceFee", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;", "dailyLimits", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;", "isInInterEntityMatchExperiment", "", "matchaDisplayInfo", "Lcom/robinhood/android/transfers/ui/max/createtransfer/MatchaDisplayInfo;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiAmountLimit;ZLcom/robinhood/android/transfers/ui/max/createtransfer/MatchaDisplayInfo;)V", "getSelectedAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getServiceFee", "()Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;", "getMatchaDisplayInfo", "()Lcom/robinhood/android/transfers/ui/max/createtransfer/MatchaDisplayInfo;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class WithdrawalWithFees extends ValueTextState {
        public static final int $stable = 8;
        private final MatchaDisplayInfo matchaDisplayInfo;
        private final TransferAccount selectedAccount;
        private final ApiServiceFeeResponse serviceFee;

        @Override // com.robinhood.android.transfers.p271ui.max.createtransfer.ValueTextState
        public TransferAccount getSelectedAccount() {
            return this.selectedAccount;
        }

        @Override // com.robinhood.android.transfers.p271ui.max.createtransfer.ValueTextState
        public ApiServiceFeeResponse getServiceFee() {
            return this.serviceFee;
        }

        public final MatchaDisplayInfo getMatchaDisplayInfo() {
            return this.matchaDisplayInfo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithdrawalWithFees(TransferAccount selectedAccount, TransferAccount transferAccount, TransferAccountDirection direction, ApiServiceFeeResponse apiServiceFeeResponse, ApiAmountLimit apiAmountLimit, boolean z, MatchaDisplayInfo matchaDisplayInfo) {
            super(selectedAccount, transferAccount, direction, z, false, null, apiAmountLimit, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, null);
            Intrinsics.checkNotNullParameter(selectedAccount, "selectedAccount");
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.selectedAccount = selectedAccount;
            this.serviceFee = apiServiceFeeResponse;
            this.matchaDisplayInfo = matchaDisplayInfo;
        }
    }

    /* compiled from: ValueTextState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/createtransfer/ValueTextState$DefaultLoaded;", "Lcom/robinhood/android/transfers/ui/max/createtransfer/ValueTextState;", "selectedAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "otherAccount", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "iraContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "isInInterEntityMatchExperiment", "", "isOutgoingWire", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;Lcom/robinhood/models/api/bonfire/IraContributionType;ZZ)V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultLoaded extends ValueTextState {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DefaultLoaded(TransferAccount transferAccount, TransferAccount transferAccount2, TransferAccountDirection direction, IraContributionType iraContributionType, boolean z, boolean z2) {
            super(transferAccount, transferAccount2, direction, z, z2, null, null, iraContributionType, 96, null);
            Intrinsics.checkNotNullParameter(direction, "direction");
        }
    }

    /* compiled from: ValueTextState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/createtransfer/ValueTextState$Error;", "Lcom/robinhood/android/transfers/ui/max/createtransfer/ValueTextState;", "selectedAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "otherAccount", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "isInInterEntityMatchExperiment", "", "throwable", "", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;ZLjava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends ValueTextState {
        public static final int $stable = 8;
        private final Throwable throwable;

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(TransferAccount transferAccount, TransferAccount transferAccount2, TransferAccountDirection direction, boolean z, Throwable throwable) {
            super(transferAccount, transferAccount2, direction, z, false, null, null, null, 224, null);
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }
    }

    /* compiled from: ValueTextState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/createtransfer/ValueTextState$Loading;", "Lcom/robinhood/android/transfers/ui/max/createtransfer/ValueTextState;", "selectedAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "otherAccount", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "isInInterEntityMatchExperiment", "", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;Z)V", "getSelectedAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "isLoading", "()Z", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends ValueTextState {
        public static final int $stable = 8;
        private final boolean isLoading;
        private final TransferAccount selectedAccount;

        @Override // com.robinhood.android.transfers.p271ui.max.createtransfer.ValueTextState
        public TransferAccount getSelectedAccount() {
            return this.selectedAccount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(TransferAccount selectedAccount, TransferAccount transferAccount, TransferAccountDirection direction, boolean z) {
            super(selectedAccount, transferAccount, direction, z, false, null, null, null, 224, null);
            Intrinsics.checkNotNullParameter(selectedAccount, "selectedAccount");
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.selectedAccount = selectedAccount;
            this.isLoading = true;
        }

        @Override // com.robinhood.android.transfers.p271ui.max.createtransfer.ValueTextState
        /* renamed from: isLoading, reason: from getter */
        public boolean getIsLoading() {
            return this.isLoading;
        }
    }
}
