package com.robinhood.android.transfers.p271ui.max.limits;

import com.robinhood.android.lib.transfers.util.TransferAccounts2;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.limitsv1.TransferProductType;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferLimitsBundle.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J5\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010#\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/limits/CreateTransferLimitsBundle;", "", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/TransferFrequency;Lcom/robinhood/android/transfers/contracts/TransferConfiguration;)V", "getSourceAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSinkAccount", "getFrequency", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getConfiguration", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "shouldRetrieveLimits", "", "getShouldRetrieveLimits", "()Z", "direction", "Lcom/robinhood/models/db/TransferDirection;", "getDirection", "()Lcom/robinhood/models/db/TransferDirection;", "transferProductType", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/TransferProductType;", "getTransferProductType", "()Lcom/robinhood/models/api/bonfire/transfer/limitsv1/TransferProductType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CreateTransferLimitsBundle {
    public static final int $stable = 8;
    private final TransferConfiguration configuration;
    private final ApiCreateTransferRequest2 frequency;
    private final TransferAccount sinkAccount;
    private final TransferAccount sourceAccount;

    /* compiled from: CreateTransferLimitsBundle.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiTransferAccount.TransferAccountType.values().length];
            try {
                iArr[ApiTransferAccount.TransferAccountType.ACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.DEBIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ CreateTransferLimitsBundle copy$default(CreateTransferLimitsBundle createTransferLimitsBundle, TransferAccount transferAccount, TransferAccount transferAccount2, ApiCreateTransferRequest2 apiCreateTransferRequest2, TransferConfiguration transferConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            transferAccount = createTransferLimitsBundle.sourceAccount;
        }
        if ((i & 2) != 0) {
            transferAccount2 = createTransferLimitsBundle.sinkAccount;
        }
        if ((i & 4) != 0) {
            apiCreateTransferRequest2 = createTransferLimitsBundle.frequency;
        }
        if ((i & 8) != 0) {
            transferConfiguration = createTransferLimitsBundle.configuration;
        }
        return createTransferLimitsBundle.copy(transferAccount, transferAccount2, apiCreateTransferRequest2, transferConfiguration);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component2, reason: from getter */
    public final TransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    /* renamed from: component4, reason: from getter */
    public final TransferConfiguration getConfiguration() {
        return this.configuration;
    }

    public final CreateTransferLimitsBundle copy(TransferAccount sourceAccount, TransferAccount sinkAccount, ApiCreateTransferRequest2 frequency, TransferConfiguration configuration) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new CreateTransferLimitsBundle(sourceAccount, sinkAccount, frequency, configuration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateTransferLimitsBundle)) {
            return false;
        }
        CreateTransferLimitsBundle createTransferLimitsBundle = (CreateTransferLimitsBundle) other;
        return Intrinsics.areEqual(this.sourceAccount, createTransferLimitsBundle.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, createTransferLimitsBundle.sinkAccount) && this.frequency == createTransferLimitsBundle.frequency && Intrinsics.areEqual(this.configuration, createTransferLimitsBundle.configuration);
    }

    public int hashCode() {
        TransferAccount transferAccount = this.sourceAccount;
        int iHashCode = (transferAccount == null ? 0 : transferAccount.hashCode()) * 31;
        TransferAccount transferAccount2 = this.sinkAccount;
        return ((((iHashCode + (transferAccount2 != null ? transferAccount2.hashCode() : 0)) * 31) + this.frequency.hashCode()) * 31) + this.configuration.hashCode();
    }

    public String toString() {
        return "CreateTransferLimitsBundle(sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", frequency=" + this.frequency + ", configuration=" + this.configuration + ")";
    }

    public CreateTransferLimitsBundle(TransferAccount transferAccount, TransferAccount transferAccount2, ApiCreateTransferRequest2 frequency, TransferConfiguration configuration) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.sourceAccount = transferAccount;
        this.sinkAccount = transferAccount2;
        this.frequency = frequency;
        this.configuration = configuration;
    }

    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final TransferAccount getSinkAccount() {
        return this.sinkAccount;
    }

    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    public final TransferConfiguration getConfiguration() {
        return this.configuration;
    }

    public final boolean getShouldRetrieveLimits() {
        TransferAccount transferAccount = this.sourceAccount;
        if (transferAccount == null || this.sinkAccount == null || transferAccount.getType().isIra() || this.sinkAccount.getType().isIra() || this.frequency != ApiCreateTransferRequest2.ONCE || (this.configuration instanceof TransferConfiguration.OutgoingWire)) {
            return false;
        }
        ApiTransferAccount.TransferAccountType type2 = this.sourceAccount.getType();
        ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.ACH;
        if (type2 != transferAccountType || this.sinkAccount.isExternal()) {
            return !(this.sourceAccount.getType().isExternal() || this.sinkAccount.getType() != transferAccountType || TransferAccounts2.isRtpEligible(this.sinkAccount)) || getTransferProductType() == TransferProductType.DEBIT_CARD_FUNDING;
        }
        return true;
    }

    public final TransferDirection getDirection() {
        TransferAccount transferAccount;
        TransferAccount transferAccount2 = this.sourceAccount;
        if (transferAccount2 != null && !transferAccount2.isExternal() && (transferAccount = this.sinkAccount) != null && !transferAccount.isExternal()) {
            return null;
        }
        TransferAccount transferAccount3 = this.sourceAccount;
        if (transferAccount3 != null && transferAccount3.isExternal()) {
            return TransferDirection.DEPOSIT;
        }
        TransferAccount transferAccount4 = this.sinkAccount;
        if (transferAccount4 == null || !transferAccount4.isExternal()) {
            return null;
        }
        return TransferDirection.WITHDRAW;
    }

    public final TransferProductType getTransferProductType() {
        TransferAccount transferAccount;
        TransferAccount transferAccount2 = this.sourceAccount;
        if (transferAccount2 == null || this.sinkAccount == null) {
            return null;
        }
        if (!transferAccount2.isExternal() && !this.sinkAccount.isExternal()) {
            return TransferProductType.INTER_ENTITY;
        }
        if (this.sourceAccount.isExternal()) {
            transferAccount = this.sourceAccount;
        } else {
            transferAccount = this.sinkAccount;
        }
        ApiTransferAccount.TransferAccountType type2 = transferAccount.getType();
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            return TransferProductType.ORIGINATED_ACH;
        }
        if (i == 2) {
            return TransferProductType.DEBIT_CARD_FUNDING;
        }
        throw new IllegalStateException(("Unsupported externalAccountType: " + type2).toString());
    }
}
