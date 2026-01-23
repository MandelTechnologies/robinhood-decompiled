package com.robinhood.android.transfers.p271ui.p272v2;

import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.transfers.p271ui.p272v2.additionaldata.CreateTransferV2AdditionalDataClient;
import com.robinhood.android.transfers.util.ToApiAccount;
import com.robinhood.lib.bigdecimalinterop.BigDecimals6;
import com.robinhood.lib.transfers.contracts.TransferEntryPoint;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiManagementInfo;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFee;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.transfers.disclosures.contracts.CreateTransferState;
import com.robinhood.transfers.disclosures.contracts.CreateTransferState6;
import com.robinhood.transfers.disclosures.contracts.ManagementInfo;
import com.robinhood.transfers.disclosures.contracts.ManagementInfo3;
import com.robinhood.transfers.disclosures.contracts.ServiceFee;
import com.robinhood.transfers.disclosures.contracts.ServiceFeeParams;
import com.robinhood.transfers.disclosures.contracts.TransferAccountType;
import com.robinhood.transfers.disclosures.contracts.TransferMode;
import com.robinhood.transfers.disclosures.contracts.TransferType;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MicrogramConverters.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u0005H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002\u001a\n\u0010\u0013\u001a\u00020\u0014*\u00020\u000e\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0017H\u0002\" \u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u000e8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m3636d2 = {"toMicrogramTransferAccount", "Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAccount;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;", "toMicrogramManagementInfo", "Lcom/robinhood/transfers/disclosures/contracts/ManagementInfo;", "Lcom/robinhood/models/api/bonfire/ApiManagementInfo;", "toMicrogramServiceFee", "Lcom/robinhood/transfers/disclosures/contracts/ServiceFee;", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFee;", "toMicrogramServiceFeeParams", "Lcom/robinhood/transfers/disclosures/contracts/ServiceFeeParams;", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "microgramTransferType", "Lcom/robinhood/transfers/disclosures/contracts/TransferType;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;", "getMicrogramTransferType$annotations", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;)V", "getMicrogramTransferType", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;)Lcom/robinhood/transfers/disclosures/contracts/TransferType;", "toMicrogramCreateTransferState", "Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState;", "toMicrogramEntryPoint", "Lcom/robinhood/lib/transfers/contracts/TransferEntryPoint;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.v2.MicrogramConvertersKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class MicrogramConverters {

    /* compiled from: MicrogramConverters.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.v2.MicrogramConvertersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ManagementType.values().length];
            try {
                iArr[ManagementType.SELF_DIRECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ManagementType.MANAGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ManagementType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AchTransferOption.values().length];
            try {
                iArr2[AchTransferOption.INSTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AchTransferOption.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MAXTransferContext.EntryPoint.values().length];
            try {
                iArr3[MAXTransferContext.EntryPoint.RECURRING_DEPOSIT_UPSELL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[MAXTransferContext.EntryPoint.RECURRING_TRANSFER_HUB.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static /* synthetic */ void getMicrogramTransferType$annotations(CreateTransferV2DataState createTransferV2DataState) {
    }

    private static final CreateTransferState.ApiTransferAccount toMicrogramTransferAccount(ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount) {
        TransferAccountType next;
        Iterator<TransferAccountType> it = TransferAccountType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(next.getServerValue(), apiTransferAccount.getType().getServerValue())) {
                break;
            }
        }
        TransferAccountType transferAccountType = next;
        if (transferAccountType == null) {
            transferAccountType = TransferAccountType.UNKNOWN;
        }
        TransferAccountType transferAccountType2 = transferAccountType;
        ApiManagementInfo managementInfo = apiTransferAccount.getManagementInfo();
        return new CreateTransferState.ApiTransferAccount(managementInfo != null ? toMicrogramManagementInfo(managementInfo) : null, transferAccountType2, apiTransferAccount.getId(), (String) null, 8, (DefaultConstructorMarker) null);
    }

    private static final ManagementInfo toMicrogramManagementInfo(ApiManagementInfo apiManagementInfo) {
        ManagementType managementType;
        ManagementInfo3 managementInfo3;
        if (apiManagementInfo == null || (managementType = apiManagementInfo.getManagementType()) == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[managementType.ordinal()];
        if (i == 1) {
            managementInfo3 = ManagementInfo3.SELF_DIRECTED;
        } else if (i == 2) {
            managementInfo3 = ManagementInfo3.MANAGED;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            managementInfo3 = ManagementInfo3.UNKNOWN;
        }
        return new ManagementInfo(managementInfo3);
    }

    private static final ServiceFee toMicrogramServiceFee(ApiServiceFee apiServiceFee) {
        String string2 = apiServiceFee.getFee_rate().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String string3 = apiServiceFee.getMax_fee().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        String string4 = apiServiceFee.getMin_fee().toString();
        Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
        return new ServiceFee(string2, string3, string4);
    }

    private static final ServiceFeeParams toMicrogramServiceFeeParams(ApiServiceFeeParams apiServiceFeeParams) {
        return new ServiceFeeParams(toMicrogramServiceFee(apiServiceFeeParams.getPull()), toMicrogramServiceFee(apiServiceFeeParams.getPush()));
    }

    public static final TransferType getMicrogramTransferType(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        if (!createTransferV2DataState.getAdditionalDataState().getIsLoaded()) {
            return null;
        }
        TransferAccount transferAccountFromTransferAccount = CreateTransferV2StateProvider2.fromTransferAccount(createTransferV2DataState);
        TransferAccount transferAccount = CreateTransferV2StateProvider2.toTransferAccount(createTransferV2DataState);
        if (CreateTransferV2DataState2.isRtpEligibleTransfer(createTransferV2DataState) || CreateTransferV2DataState2.isRfpEligibleTransfer(createTransferV2DataState)) {
            AchTransferOption selectedAchTransferOptionOrDefault = CreateTransferV2DataState2.getSelectedAchTransferOptionOrDefault(createTransferV2DataState);
            int i = selectedAchTransferOptionOrDefault == null ? -1 : WhenMappings.$EnumSwitchMapping$1[selectedAchTransferOptionOrDefault.ordinal()];
            if (i == -1) {
                return null;
            }
            if (i == 1) {
                return TransferType.INSTANT_BANK_TRANSFER;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return TransferType.ORIGINATED_ACH;
        }
        if ((transferAccountFromTransferAccount != null ? transferAccountFromTransferAccount.getType() : null) != ApiTransferAccount.TransferAccountType.IRA_ROTH) {
            if ((transferAccountFromTransferAccount != null ? transferAccountFromTransferAccount.getType() : null) != ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL) {
                ApiTransferAccount.TransferAccountType type2 = transferAccountFromTransferAccount != null ? transferAccountFromTransferAccount.getType() : null;
                ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.ACH;
                if (type2 != transferAccountType) {
                    if ((transferAccount != null ? transferAccount.getType() : null) != transferAccountType) {
                        return null;
                    }
                }
                return TransferType.ORIGINATED_ACH;
            }
        }
        return null;
    }

    public static final CreateTransferState toMicrogramCreateTransferState(CreateTransferV2DataState createTransferV2DataState) {
        CreateTransferState6 next;
        ApiServiceFeeParams serviceFeeParams;
        ApiCreateTransferRequest.ApiTransferAccount apiAccount;
        ApiCreateTransferRequest.ApiTransferAccount apiAccount2;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        TransferAccount transferAccountFromTransferAccount = CreateTransferV2StateProvider2.fromTransferAccount(createTransferV2DataState);
        TransferAccount transferAccount = CreateTransferV2StateProvider2.toTransferAccount(createTransferV2DataState);
        BigDecimal bignumBigDecimal = BigDecimals6.toBignumBigDecimal(createTransferV2DataState.getAmount());
        ServiceFeeParams microgramServiceFeeParams = null;
        CreateTransferState.ApiTransferAccount microgramTransferAccount = (transferAccountFromTransferAccount == null || (apiAccount2 = ToApiAccount.toApiAccount(transferAccountFromTransferAccount)) == null) ? null : toMicrogramTransferAccount(apiAccount2);
        CreateTransferState.ApiTransferAccount microgramTransferAccount2 = (transferAccount == null || (apiAccount = ToApiAccount.toApiAccount(transferAccount)) == null) ? null : toMicrogramTransferAccount(apiAccount);
        TransferType microgramTransferType = getMicrogramTransferType(createTransferV2DataState);
        Iterator<CreateTransferState6> it = CreateTransferState6.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(next.getServerValue(), CreateTransferV2DataState2.getAdjustedFrequency(createTransferV2DataState).getServerValue())) {
                break;
            }
        }
        CreateTransferState6 createTransferState6 = next;
        if (createTransferState6 == null) {
            createTransferState6 = CreateTransferState6.ONCE;
        }
        CreateTransferState6 createTransferState62 = createTransferState6;
        TransferMode transferMode = TransferMode.values()[createTransferV2DataState.getMode().ordinal()];
        CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState = createTransferV2DataState.getAdditionalDataState();
        CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded serviceFeesLoaded = additionalDataState instanceof CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded ? (CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded) additionalDataState : null;
        if (serviceFeesLoaded != null && (serviceFeeParams = serviceFeesLoaded.getServiceFeeParams()) != null) {
            microgramServiceFeeParams = toMicrogramServiceFeeParams(serviceFeeParams);
        }
        return new CreateTransferState(bignumBigDecimal, microgramTransferAccount, microgramTransferAccount2, createTransferState62, (CreateTransferState.ApiTransferAdditionalData) null, (String) null, microgramTransferType, transferMode, microgramServiceFeeParams, toMicrogramEntryPoint(createTransferV2DataState.getEntryPoint()), 16, (DefaultConstructorMarker) null);
    }

    private static final TransferEntryPoint toMicrogramEntryPoint(MAXTransferContext.EntryPoint entryPoint) {
        int i = WhenMappings.$EnumSwitchMapping$2[entryPoint.ordinal()];
        if (i == 1) {
            return TransferEntryPoint.RECURRING_DEPOSIT_UPSELL;
        }
        if (i == 2) {
            return TransferEntryPoint.RECURRING_TRANSFER_HUB;
        }
        return TransferEntryPoint.UNKNOWN;
    }
}
