package com.robinhood.android.transfers.p271ui.p272v2.additionaldata;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.CreateTransferAccountDto;
import bff_money_movement.service.p019v1.GetTransferValidationRequestDto;
import bff_money_movement.service.p019v1.GetTransferValidationResponseDto;
import bff_money_movement.service.p019v1.TransferStateDto;
import bff_money_movement.service.p019v1.TransferValidationErrorDetailsDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.lib.transfers.util.IdlConverters;
import com.robinhood.android.lib.transfers.util.TransferAccounts2;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeResponse;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p320db.bonfire.ManagementInfo;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.common.CurrencyDto;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.transfers.api.TransferType;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.math.BigDecimal;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CreateTransferV2AdditionalDataClient.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002$%B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\n\u001a\u00020\u000b*\u00020\fH\u0002J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\f8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001e¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient;", "", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lbff_money_movement/service/v1/BffMoneyMovementService;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "isManagedAccountInvolved", "", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$Request;", "moneyAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/util/Money;", "getMoneyAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "moneyAdapter$delegate", "Lkotlin/Lazy;", "additionalDataType", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/TransferAdditionalDataType;", "getAdditionalDataType$feature_transfers_externalRelease$annotations", "(Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$Request;)V", "getAdditionalDataType$feature_transfers_externalRelease", "(Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$Request;)Lcom/robinhood/android/transfers/ui/v2/additionaldata/TransferAdditionalDataType;", "transferType", "Lcom/robinhood/transfers/api/TransferType;", "getTransferType$feature_transfers_externalRelease$annotations", "getTransferType$feature_transfers_externalRelease", "(Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$Request;)Lcom/robinhood/transfers/api/TransferType;", "getAdditionalData", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState;", "request", "(Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Request", "AdditionalDataState", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CreateTransferV2AdditionalDataClient {
    public static final int $stable = 8;
    private final BffMoneyMovementService bffMoneyMovementService;

    /* renamed from: moneyAdapter$delegate, reason: from kotlin metadata */
    private final Lazy moneyAdapter;
    private final LazyMoshi moshi;
    private final TransfersBonfireApi transfersBonfireApi;

    /* compiled from: CreateTransferV2AdditionalDataClient.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransferDirectionV2.values().length];
            try {
                iArr[TransferDirectionV2.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirectionV2.INTER_ENTITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferDirectionV2.WITHDRAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiTransferAccount.TransferAccountType.values().length];
            try {
                iArr2[ApiTransferAccount.TransferAccountType.DEBIT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.ACH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.RHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.RHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.IRA_ROTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.SEPA.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.RHCE.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.RHY_BANKING.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.RHUK_ISA_STOCKS_AND_SHARES.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.CUSTODIAL_UGMA.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.CUSTODIAL_UTMA.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.UNKNOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: getAdditionalDataType$feature_transfers_externalRelease$annotations */
    public static /* synthetic */ void m2554xeec271b9(Request request) {
    }

    public static /* synthetic */ void getTransferType$feature_transfers_externalRelease$annotations(Request request) {
    }

    public CreateTransferV2AdditionalDataClient(BffMoneyMovementService bffMoneyMovementService, TransfersBonfireApi transfersBonfireApi, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.transfersBonfireApi = transfersBonfireApi;
        this.moshi = moshi;
        this.moneyAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.v2.additionaldata.CreateTransferV2AdditionalDataClient$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateTransferV2AdditionalDataClient.moneyAdapter_delegate$lambda$0(this.f$0);
            }
        });
    }

    /* compiled from: CreateTransferV2AdditionalDataClient.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$Request;", "", "amount", "Ljava/math/BigDecimal;", "mode", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "direction", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "configuredTransferType", "Lcom/robinhood/transfers/api/TransferType;", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;Lcom/robinhood/transfers/api/TransferType;)V", "getAmount", "()Ljava/math/BigDecimal;", "getMode", "()Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$Mode;", "getSourceAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSinkAccount", "getDirection", "()Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "getConfiguredTransferType", "()Lcom/robinhood/transfers/api/TransferType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Request {
        public static final int $stable = 8;
        private final BigDecimal amount;
        private final TransferType configuredTransferType;
        private final TransferDirectionV2 direction;
        private final CreateTransferViewState.Mode mode;
        private final TransferAccount sinkAccount;
        private final TransferAccount sourceAccount;

        public static /* synthetic */ Request copy$default(Request request, BigDecimal bigDecimal, CreateTransferViewState.Mode mode, TransferAccount transferAccount, TransferAccount transferAccount2, TransferDirectionV2 transferDirectionV2, TransferType transferType, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = request.amount;
            }
            if ((i & 2) != 0) {
                mode = request.mode;
            }
            if ((i & 4) != 0) {
                transferAccount = request.sourceAccount;
            }
            if ((i & 8) != 0) {
                transferAccount2 = request.sinkAccount;
            }
            if ((i & 16) != 0) {
                transferDirectionV2 = request.direction;
            }
            if ((i & 32) != 0) {
                transferType = request.configuredTransferType;
            }
            TransferDirectionV2 transferDirectionV22 = transferDirectionV2;
            TransferType transferType2 = transferType;
            return request.copy(bigDecimal, mode, transferAccount, transferAccount2, transferDirectionV22, transferType2);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final CreateTransferViewState.Mode getMode() {
            return this.mode;
        }

        /* renamed from: component3, reason: from getter */
        public final TransferAccount getSourceAccount() {
            return this.sourceAccount;
        }

        /* renamed from: component4, reason: from getter */
        public final TransferAccount getSinkAccount() {
            return this.sinkAccount;
        }

        /* renamed from: component5, reason: from getter */
        public final TransferDirectionV2 getDirection() {
            return this.direction;
        }

        /* renamed from: component6, reason: from getter */
        public final TransferType getConfiguredTransferType() {
            return this.configuredTransferType;
        }

        public final Request copy(BigDecimal amount, CreateTransferViewState.Mode mode, TransferAccount sourceAccount, TransferAccount sinkAccount, TransferDirectionV2 direction, TransferType configuredTransferType) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(direction, "direction");
            return new Request(amount, mode, sourceAccount, sinkAccount, direction, configuredTransferType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.amount, request.amount) && this.mode == request.mode && Intrinsics.areEqual(this.sourceAccount, request.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, request.sinkAccount) && this.direction == request.direction && this.configuredTransferType == request.configuredTransferType;
        }

        public int hashCode() {
            int iHashCode = ((this.amount.hashCode() * 31) + this.mode.hashCode()) * 31;
            TransferAccount transferAccount = this.sourceAccount;
            int iHashCode2 = (iHashCode + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31;
            TransferAccount transferAccount2 = this.sinkAccount;
            int iHashCode3 = (((iHashCode2 + (transferAccount2 == null ? 0 : transferAccount2.hashCode())) * 31) + this.direction.hashCode()) * 31;
            TransferType transferType = this.configuredTransferType;
            return iHashCode3 + (transferType != null ? transferType.hashCode() : 0);
        }

        public String toString() {
            return "Request(amount=" + this.amount + ", mode=" + this.mode + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", direction=" + this.direction + ", configuredTransferType=" + this.configuredTransferType + ")";
        }

        public Request(BigDecimal amount, CreateTransferViewState.Mode mode, TransferAccount transferAccount, TransferAccount transferAccount2, TransferDirectionV2 direction, TransferType transferType) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.amount = amount;
            this.mode = mode;
            this.sourceAccount = transferAccount;
            this.sinkAccount = transferAccount2;
            this.direction = direction;
            this.configuredTransferType = transferType;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final CreateTransferViewState.Mode getMode() {
            return this.mode;
        }

        public final TransferAccount getSourceAccount() {
            return this.sourceAccount;
        }

        public final TransferAccount getSinkAccount() {
            return this.sinkAccount;
        }

        public final TransferDirectionV2 getDirection() {
            return this.direction;
        }

        public final TransferType getConfiguredTransferType() {
            return this.configuredTransferType;
        }
    }

    private final boolean isManagedAccountInvolved(Request request) {
        ManagementInfo managementInfo;
        ManagementInfo managementInfo2;
        TransferAccount sourceAccount = request.getSourceAccount();
        ManagementType management_type = null;
        ManagementType management_type2 = (sourceAccount == null || (managementInfo2 = sourceAccount.getManagementInfo()) == null) ? null : managementInfo2.getManagement_type();
        ManagementType managementType = ManagementType.MANAGED;
        if (management_type2 == managementType) {
            return true;
        }
        TransferAccount sinkAccount = request.getSinkAccount();
        if (sinkAccount != null && (managementInfo = sinkAccount.getManagementInfo()) != null) {
            management_type = managementInfo.getManagement_type();
        }
        return management_type == managementType;
    }

    /* compiled from: CreateTransferV2AdditionalDataClient.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState;", "Landroid/os/Parcelable;", "isLoaded", "", "()Z", "Loading", "None", "RfpEligibilityLoaded", "ServiceFeesLoaded", "ValidationCheck", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState$Loading;", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState$None;", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState$RfpEligibilityLoaded;", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState$ServiceFeesLoaded;", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState$ValidationCheck;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface AdditionalDataState extends Parcelable {
        /* renamed from: isLoaded */
        boolean getIsLoaded();

        /* compiled from: CreateTransferV2AdditionalDataClient.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\tHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState$Loading;", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState;", "<init>", "()V", "isLoaded", "", "isLoaded$annotations", "()Z", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements AdditionalDataState {
            public static final int $stable = 0;
            private static final boolean isLoaded = false;
            public static final Loading INSTANCE = new Loading();
            public static final Parcelable.Creator<Loading> CREATOR = new Creator();

            /* compiled from: CreateTransferV2AdditionalDataClient.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Loading> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Loading createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Loading.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Loading[] newArray(int i) {
                    return new Loading[i];
                }
            }

            public static /* synthetic */ void isLoaded$annotations() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -540821942;
            }

            public String toString() {
                return "Loading";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Loading() {
            }

            @Override // com.robinhood.android.transfers.ui.v2.additionaldata.CreateTransferV2AdditionalDataClient.AdditionalDataState
            /* renamed from: isLoaded */
            public boolean getIsLoaded() {
                return isLoaded;
            }
        }

        /* compiled from: CreateTransferV2AdditionalDataClient.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\tHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState$None;", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState;", "<init>", "()V", "isLoaded", "", "isLoaded$annotations", "()Z", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class None implements AdditionalDataState {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();
            private static final boolean isLoaded = true;
            public static final Parcelable.Creator<None> CREATOR = new Creator();

            /* compiled from: CreateTransferV2AdditionalDataClient.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<None> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final None createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return None.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final None[] newArray(int i) {
                    return new None[i];
                }
            }

            public static /* synthetic */ void isLoaded$annotations() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof None);
            }

            public int hashCode() {
                return -619600662;
            }

            public String toString() {
                return "None";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private None() {
            }

            @Override // com.robinhood.android.transfers.ui.v2.additionaldata.CreateTransferV2AdditionalDataClient.AdditionalDataState
            /* renamed from: isLoaded */
            public boolean getIsLoaded() {
                return isLoaded;
            }
        }

        /* compiled from: CreateTransferV2AdditionalDataClient.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState$RfpEligibilityLoaded;", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState;", "isEligible", "", "errorMessage", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getErrorMessage", "()Ljava/lang/String;", "isLoaded", "isLoaded$annotations", "()V", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RfpEligibilityLoaded implements AdditionalDataState {
            public static final int $stable = 0;
            public static final Parcelable.Creator<RfpEligibilityLoaded> CREATOR = new Creator();
            private final String errorMessage;
            private final boolean isEligible;
            private final boolean isLoaded = true;

            /* compiled from: CreateTransferV2AdditionalDataClient.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<RfpEligibilityLoaded> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RfpEligibilityLoaded createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RfpEligibilityLoaded(parcel.readInt() != 0, parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RfpEligibilityLoaded[] newArray(int i) {
                    return new RfpEligibilityLoaded[i];
                }
            }

            public static /* synthetic */ RfpEligibilityLoaded copy$default(RfpEligibilityLoaded rfpEligibilityLoaded, boolean z, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = rfpEligibilityLoaded.isEligible;
                }
                if ((i & 2) != 0) {
                    str = rfpEligibilityLoaded.errorMessage;
                }
                return rfpEligibilityLoaded.copy(z, str);
            }

            public static /* synthetic */ void isLoaded$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsEligible() {
                return this.isEligible;
            }

            /* renamed from: component2, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public final RfpEligibilityLoaded copy(boolean isEligible, String errorMessage) {
                return new RfpEligibilityLoaded(isEligible, errorMessage);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RfpEligibilityLoaded)) {
                    return false;
                }
                RfpEligibilityLoaded rfpEligibilityLoaded = (RfpEligibilityLoaded) other;
                return this.isEligible == rfpEligibilityLoaded.isEligible && Intrinsics.areEqual(this.errorMessage, rfpEligibilityLoaded.errorMessage);
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.isEligible) * 31;
                String str = this.errorMessage;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "RfpEligibilityLoaded(isEligible=" + this.isEligible + ", errorMessage=" + this.errorMessage + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.isEligible ? 1 : 0);
                dest.writeString(this.errorMessage);
            }

            public RfpEligibilityLoaded(boolean z, String str) {
                this.isEligible = z;
                this.errorMessage = str;
            }

            public final boolean isEligible() {
                return this.isEligible;
            }

            public final String getErrorMessage() {
                return this.errorMessage;
            }

            @Override // com.robinhood.android.transfers.ui.v2.additionaldata.CreateTransferV2AdditionalDataClient.AdditionalDataState
            /* renamed from: isLoaded, reason: from getter */
            public boolean getIsLoaded() {
                return this.isLoaded;
            }
        }

        /* compiled from: CreateTransferV2AdditionalDataClient.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState$ServiceFeesLoaded;", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState;", "serviceFeeParams", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "serviceFeeResponse", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;", "<init>", "(Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;)V", "getServiceFeeParams", "()Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "getServiceFeeResponse", "()Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;", "isLoaded", "", "isLoaded$annotations", "()V", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ServiceFeesLoaded implements AdditionalDataState {
            public static final int $stable = 8;
            public static final Parcelable.Creator<ServiceFeesLoaded> CREATOR = new Creator();
            private final boolean isLoaded;
            private final ApiServiceFeeParams serviceFeeParams;
            private final ApiServiceFeeResponse serviceFeeResponse;

            /* compiled from: CreateTransferV2AdditionalDataClient.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ServiceFeesLoaded> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ServiceFeesLoaded createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ServiceFeesLoaded((ApiServiceFeeParams) parcel.readParcelable(ServiceFeesLoaded.class.getClassLoader()), (ApiServiceFeeResponse) parcel.readParcelable(ServiceFeesLoaded.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ServiceFeesLoaded[] newArray(int i) {
                    return new ServiceFeesLoaded[i];
                }
            }

            public static /* synthetic */ ServiceFeesLoaded copy$default(ServiceFeesLoaded serviceFeesLoaded, ApiServiceFeeParams apiServiceFeeParams, ApiServiceFeeResponse apiServiceFeeResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    apiServiceFeeParams = serviceFeesLoaded.serviceFeeParams;
                }
                if ((i & 2) != 0) {
                    apiServiceFeeResponse = serviceFeesLoaded.serviceFeeResponse;
                }
                return serviceFeesLoaded.copy(apiServiceFeeParams, apiServiceFeeResponse);
            }

            public static /* synthetic */ void isLoaded$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final ApiServiceFeeParams getServiceFeeParams() {
                return this.serviceFeeParams;
            }

            /* renamed from: component2, reason: from getter */
            public final ApiServiceFeeResponse getServiceFeeResponse() {
                return this.serviceFeeResponse;
            }

            public final ServiceFeesLoaded copy(ApiServiceFeeParams serviceFeeParams, ApiServiceFeeResponse serviceFeeResponse) {
                Intrinsics.checkNotNullParameter(serviceFeeParams, "serviceFeeParams");
                Intrinsics.checkNotNullParameter(serviceFeeResponse, "serviceFeeResponse");
                return new ServiceFeesLoaded(serviceFeeParams, serviceFeeResponse);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ServiceFeesLoaded)) {
                    return false;
                }
                ServiceFeesLoaded serviceFeesLoaded = (ServiceFeesLoaded) other;
                return Intrinsics.areEqual(this.serviceFeeParams, serviceFeesLoaded.serviceFeeParams) && Intrinsics.areEqual(this.serviceFeeResponse, serviceFeesLoaded.serviceFeeResponse);
            }

            public int hashCode() {
                return (this.serviceFeeParams.hashCode() * 31) + this.serviceFeeResponse.hashCode();
            }

            public String toString() {
                return "ServiceFeesLoaded(serviceFeeParams=" + this.serviceFeeParams + ", serviceFeeResponse=" + this.serviceFeeResponse + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.serviceFeeParams, flags);
                dest.writeParcelable(this.serviceFeeResponse, flags);
            }

            public ServiceFeesLoaded(ApiServiceFeeParams serviceFeeParams, ApiServiceFeeResponse serviceFeeResponse) {
                Intrinsics.checkNotNullParameter(serviceFeeParams, "serviceFeeParams");
                Intrinsics.checkNotNullParameter(serviceFeeResponse, "serviceFeeResponse");
                this.serviceFeeParams = serviceFeeParams;
                this.serviceFeeResponse = serviceFeeResponse;
                this.isLoaded = true;
            }

            public final ApiServiceFeeParams getServiceFeeParams() {
                return this.serviceFeeParams;
            }

            public final ApiServiceFeeResponse getServiceFeeResponse() {
                return this.serviceFeeResponse;
            }

            @Override // com.robinhood.android.transfers.ui.v2.additionaldata.CreateTransferV2AdditionalDataClient.AdditionalDataState
            /* renamed from: isLoaded, reason: from getter */
            public boolean getIsLoaded() {
                return this.isLoaded;
            }
        }

        /* compiled from: CreateTransferV2AdditionalDataClient.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState$ValidationCheck;", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState;", "errorDetails", "Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;", "<init>", "(Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;)V", "getErrorDetails", "()Lbff_money_movement/service/v1/TransferValidationErrorDetailsDto;", "isLoaded", "", "isLoaded$annotations", "()V", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ValidationCheck implements AdditionalDataState {
            public static final int $stable = 8;
            public static final Parcelable.Creator<ValidationCheck> CREATOR = new Creator();
            private final TransferValidationErrorDetailsDto errorDetails;
            private final boolean isLoaded;

            /* compiled from: CreateTransferV2AdditionalDataClient.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ValidationCheck> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ValidationCheck createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ValidationCheck((TransferValidationErrorDetailsDto) parcel.readParcelable(ValidationCheck.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ValidationCheck[] newArray(int i) {
                    return new ValidationCheck[i];
                }
            }

            public static /* synthetic */ ValidationCheck copy$default(ValidationCheck validationCheck, TransferValidationErrorDetailsDto transferValidationErrorDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    transferValidationErrorDetailsDto = validationCheck.errorDetails;
                }
                return validationCheck.copy(transferValidationErrorDetailsDto);
            }

            public static /* synthetic */ void isLoaded$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final TransferValidationErrorDetailsDto getErrorDetails() {
                return this.errorDetails;
            }

            public final ValidationCheck copy(TransferValidationErrorDetailsDto errorDetails) {
                Intrinsics.checkNotNullParameter(errorDetails, "errorDetails");
                return new ValidationCheck(errorDetails);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ValidationCheck) && Intrinsics.areEqual(this.errorDetails, ((ValidationCheck) other).errorDetails);
            }

            public int hashCode() {
                return this.errorDetails.hashCode();
            }

            public String toString() {
                return "ValidationCheck(errorDetails=" + this.errorDetails + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.errorDetails, flags);
            }

            public ValidationCheck(TransferValidationErrorDetailsDto errorDetails) {
                Intrinsics.checkNotNullParameter(errorDetails, "errorDetails");
                this.errorDetails = errorDetails;
            }

            public final TransferValidationErrorDetailsDto getErrorDetails() {
                return this.errorDetails;
            }

            @Override // com.robinhood.android.transfers.ui.v2.additionaldata.CreateTransferV2AdditionalDataClient.AdditionalDataState
            /* renamed from: isLoaded, reason: from getter */
            public boolean getIsLoaded() {
                return this.isLoaded;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<Money> getMoneyAdapter() {
        return (JsonAdapter) this.moneyAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter moneyAdapter_delegate$lambda$0(CreateTransferV2AdditionalDataClient createTransferV2AdditionalDataClient) {
        LazyMoshi lazyMoshi = createTransferV2AdditionalDataClient.moshi;
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<Money>() { // from class: com.robinhood.android.transfers.ui.v2.additionaldata.CreateTransferV2AdditionalDataClient$moneyAdapter_delegate$lambda$0$$inlined$getAdapter$1
        }.getType());
    }

    public final TransferAdditionalDataType getAdditionalDataType$feature_transfers_externalRelease(Request request) {
        TransferAccount sinkAccount;
        TransferAccount sinkAccount2;
        ManagementInfo managementInfo;
        Intrinsics.checkNotNullParameter(request, "<this>");
        if (request.getMode() == CreateTransferViewState.Mode.EDIT) {
            return null;
        }
        if (isManagedAccountInvolved(request)) {
            int i = WhenMappings.$EnumSwitchMapping$0[request.getDirection().ordinal()];
            if (i == 1) {
                TransferAccount sourceAccount = request.getSourceAccount();
                if (sourceAccount == null || !TransferAccounts2.isRfpEligible(sourceAccount)) {
                    return null;
                }
                return TransferAdditionalDataType.ELIGIBILITY;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return TransferAdditionalDataType.VALIDATION_CHECK;
            }
            TransferAccount sourceAccount2 = request.getSourceAccount();
            if (((sourceAccount2 == null || (managementInfo = sourceAccount2.getManagementInfo()) == null) ? null : managementInfo.getManagement_type()) == ManagementType.MANAGED) {
                return TransferAdditionalDataType.VALIDATION_CHECK;
            }
            return null;
        }
        TransferAccount sinkAccount3 = request.getSinkAccount();
        if ((sinkAccount3 != null ? sinkAccount3.getType() : null) == ApiTransferAccount.TransferAccountType.DEBIT_CARD) {
            return TransferAdditionalDataType.FEES;
        }
        TransferAccount sourceAccount3 = request.getSourceAccount();
        if (sourceAccount3 != null && TransferAccounts2.isRfpEligible(sourceAccount3) && (sinkAccount2 = request.getSinkAccount()) != null && TransferAccounts2.isRfpEligibleSink(sinkAccount2)) {
            return TransferAdditionalDataType.ELIGIBILITY;
        }
        TransferAccount sourceAccount4 = request.getSourceAccount();
        if (sourceAccount4 == null || !TransferAccounts2.isRtpEligibleSource(sourceAccount4) || (sinkAccount = request.getSinkAccount()) == null || !TransferAccounts2.isRtpEligible(sinkAccount)) {
            return null;
        }
        return TransferAdditionalDataType.FEES;
    }

    public final TransferType getTransferType$feature_transfers_externalRelease(Request request) {
        Intrinsics.checkNotNullParameter(request, "<this>");
        TransferType configuredTransferType = request.getConfiguredTransferType();
        if (configuredTransferType != null) {
            return configuredTransferType;
        }
        TransferAccount sinkAccount = request.getSinkAccount();
        ApiTransferAccount.TransferAccountType type2 = sinkAccount != null ? sinkAccount.getType() : null;
        switch (type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[type2.ordinal()]) {
            case -1:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return TransferType.DEBIT_CARD_TRANSFER;
            case 2:
                if (TransferAccounts2.isRtpEligible(request.getSinkAccount())) {
                    return TransferType.INSTANT_BANK_TRANSFER;
                }
                return null;
            case 3:
            case 4:
                TransferAccount sourceAccount = request.getSourceAccount();
                if (sourceAccount == null || !TransferAccounts2.isRfpEligible(sourceAccount)) {
                    return null;
                }
                return TransferType.INSTANT_BANK_TRANSFER;
        }
    }

    /* compiled from: CreateTransferV2AdditionalDataClient.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.additionaldata.CreateTransferV2AdditionalDataClient$getAdditionalData$2", m3645f = "CreateTransferV2AdditionalDataClient.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 255, EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 300, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.additionaldata.CreateTransferV2AdditionalDataClient$getAdditionalData$2 */
    static final class C312302 extends ContinuationImpl7 implements Function2<FlowCollector<? super AdditionalDataState>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Request $request;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ CreateTransferV2AdditionalDataClient this$0;

        /* compiled from: CreateTransferV2AdditionalDataClient.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ui.v2.additionaldata.CreateTransferV2AdditionalDataClient$getAdditionalData$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TransferAdditionalDataType.values().length];
                try {
                    iArr[TransferAdditionalDataType.ELIGIBILITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TransferAdditionalDataType.FEES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TransferAdditionalDataType.VALIDATION_CHECK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C312302(Request request, CreateTransferV2AdditionalDataClient createTransferV2AdditionalDataClient, Continuation<? super C312302> continuation) {
            super(2, continuation);
            this.$request = request;
            this.this$0 = createTransferV2AdditionalDataClient;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C312302 c312302 = new C312302(this.$request, this.this$0, continuation);
            c312302.L$0 = obj;
            return c312302;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super AdditionalDataState> flowCollector, Continuation<? super Unit> continuation) {
            return ((C312302) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d8, code lost:
        
            if (r1.emit(r2, r14) == r0) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
        
            if (r1.emit(r15, r14) == r0) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x010f, code lost:
        
            if (kotlinx.coroutines.CoroutineScope2.coroutineScope(r15, r14) == r0) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0120, code lost:
        
            if (r5.emit(r15, r14) == r0) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0137, code lost:
        
            if (kotlinx.coroutines.CoroutineScope2.coroutineScope(r15, r14) == r0) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x014a, code lost:
        
            if (r5.emit(r15, r14) == r0) goto L66;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Request request;
            CreateTransferV2AdditionalDataClient createTransferV2AdditionalDataClient;
            int i;
            FlowCollector flowCollector2;
            TransferValidationErrorDetailsDto error_details;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.L$0;
                    request = this.$request;
                    createTransferV2AdditionalDataClient = this.this$0;
                    if (createTransferV2AdditionalDataClient.getAdditionalDataType$feature_transfers_externalRelease(request) != null) {
                        AdditionalDataState.Loading loading = AdditionalDataState.Loading.INSTANCE;
                        this.L$0 = flowCollector;
                        this.L$1 = createTransferV2AdditionalDataClient;
                        this.L$2 = request;
                        this.label = 1;
                        if (flowCollector.emit(loading, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    TransferAdditionalDataType additionalDataType$feature_transfers_externalRelease = createTransferV2AdditionalDataClient.getAdditionalDataType$feature_transfers_externalRelease(request);
                    i = additionalDataType$feature_transfers_externalRelease != null ? -1 : WhenMappings.$EnumSwitchMapping$0[additionalDataType$feature_transfers_externalRelease.ordinal()];
                    if (i != -1) {
                        AdditionalDataState.None none = AdditionalDataState.None.INSTANCE;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 8;
                        break;
                    } else if (i == 1) {
                        CreateTransferV2AdditionalDataClient2 createTransferV2AdditionalDataClient2 = new CreateTransferV2AdditionalDataClient2(createTransferV2AdditionalDataClient, request, flowCollector, null);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 2;
                        break;
                    } else {
                        if (i == 2) {
                            if (request.getSourceAccount() == null || request.getSinkAccount() == null) {
                                AdditionalDataState.None none2 = AdditionalDataState.None.INSTANCE;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 3;
                                break;
                            } else {
                                CreateTransferV2AdditionalDataClient3 createTransferV2AdditionalDataClient3 = new CreateTransferV2AdditionalDataClient3(flowCollector, createTransferV2AdditionalDataClient, request, null);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 4;
                                break;
                            }
                        } else if (i == 3) {
                            BffMoneyMovementService bffMoneyMovementService = createTransferV2AdditionalDataClient.bffMoneyMovementService;
                            TransferStateDto transferStateDto = TransferStateDto.TRANSFER_STATE_EDIT;
                            MoneyDto moneyDto = new MoneyDto(IdlDecimal2.toIdlDecimal(request.getAmount()), CurrencyDto.USD);
                            TransferAccount sourceAccount = request.getSourceAccount();
                            CreateTransferAccountDto transferAccountDto = sourceAccount != null ? IdlConverters.toTransferAccountDto(sourceAccount) : null;
                            TransferAccount sinkAccount = request.getSinkAccount();
                            GetTransferValidationRequestDto getTransferValidationRequestDto = new GetTransferValidationRequestDto(transferStateDto, null, moneyDto, transferAccountDto, sinkAccount != null ? IdlConverters.toTransferAccountDto(sinkAccount) : null, 2, null);
                            this.L$0 = flowCollector;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 5;
                            obj = bffMoneyMovementService.GetTransferValidation(getTransferValidationRequestDto, this);
                            if (obj != coroutine_suspended) {
                                flowCollector2 = flowCollector;
                                error_details = ((GetTransferValidationResponseDto) obj).getError_details();
                                if (error_details == null) {
                                    AdditionalDataState.ValidationCheck validationCheck = new AdditionalDataState.ValidationCheck(error_details);
                                    this.L$0 = flowCollector2;
                                    this.label = 6;
                                    break;
                                } else {
                                    AdditionalDataState.None none3 = AdditionalDataState.None.INSTANCE;
                                    this.L$0 = null;
                                    this.label = 7;
                                    break;
                                }
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    request = (Request) this.L$2;
                    createTransferV2AdditionalDataClient = (CreateTransferV2AdditionalDataClient) this.L$1;
                    flowCollector = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    TransferAdditionalDataType additionalDataType$feature_transfers_externalRelease2 = createTransferV2AdditionalDataClient.getAdditionalDataType$feature_transfers_externalRelease(request);
                    if (additionalDataType$feature_transfers_externalRelease2 != null) {
                    }
                    if (i != -1) {
                    }
                    break;
                case 2:
                case 4:
                case 7:
                case 8:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 3:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 5:
                    flowCollector2 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    error_details = ((GetTransferValidationResponseDto) obj).getError_details();
                    if (error_details == null) {
                    }
                    break;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Object getAdditionalData(Request request, Continuation<? super Flow<? extends AdditionalDataState>> continuation) {
        return FlowKt.flow(new C312302(request, this, null));
    }
}
