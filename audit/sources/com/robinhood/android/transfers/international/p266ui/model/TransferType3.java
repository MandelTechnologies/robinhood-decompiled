package com.robinhood.android.transfers.international.p266ui.model;

import bff_money_movement.service.p019v1.NonOriginatedTransferTypeDto;
import cashier_protos.payment_intents.p047v1.PurposeDto;
import com.robinhood.android.transfers.international.C30310R;
import com.robinhood.models.api.bonfire.paymentinstruments.TransferType;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferType.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0002\u001a\n\u0010\u000b\u001a\u00020\u0002*\u00020\f\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u0002\"\u0015\u0010\u000f\u001a\u00020\u0010*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"toNonOriginatedTransferTypeDto", "Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "Lcom/robinhood/android/transfers/international/ui/model/TransferType;", "toTransferApiTransferType", "Lcom/robinhood/transfers/api/TransferType;", "toPurposeDto", "Lcashier_protos/payment_intents/v1/PurposeDto;", "toMgTransferType", "Lcom/robinhood/transfers/disclosures/contracts/TransferType;", "toTransferMethod", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferMethod;", "toTransferType", "Lcom/robinhood/models/api/bonfire/paymentinstruments/TransferType;", "getStringResource", "Lcom/robinhood/utils/resource/StringResource;", "hasServiceFee", "", "getHasServiceFee", "(Lcom/robinhood/android/transfers/international/ui/model/TransferType;)Z", "feature-international-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.model.TransferTypeKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferType3 {

    /* compiled from: TransferType.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.international.ui.model.TransferTypeKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransferType.values().length];
            try {
                iArr[TransferType.FAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferType.WIRE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TransferType.values().length];
            try {
                iArr2[TransferType.OUTGOING_WIRE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TransferType.SG_BANK_WITHDRAWAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TransferType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final NonOriginatedTransferTypeDto toNonOriginatedTransferTypeDto(TransferType transferType) {
        Intrinsics.checkNotNullParameter(transferType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[transferType.ordinal()];
        if (i == 1) {
            return NonOriginatedTransferTypeDto.FAST;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return NonOriginatedTransferTypeDto.WIRE;
    }

    public static final com.robinhood.transfers.api.TransferType toTransferApiTransferType(TransferType transferType) {
        Intrinsics.checkNotNullParameter(transferType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[transferType.ordinal()];
        if (i == 1) {
            return com.robinhood.transfers.api.TransferType.SG_BANK_WITHDRAWAL;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return com.robinhood.transfers.api.TransferType.OUTGOING_WIRE;
    }

    public static final PurposeDto toPurposeDto(TransferType transferType) {
        Intrinsics.checkNotNullParameter(transferType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[transferType.ordinal()];
        if (i == 1) {
            return PurposeDto.PURPOSE_SG_BANK_TRANSFER;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return PurposeDto.PURPOSE_I18N_WIRE_TRANSFER;
    }

    public static final com.robinhood.transfers.disclosures.contracts.TransferType toMgTransferType(TransferType transferType) {
        Intrinsics.checkNotNullParameter(transferType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[transferType.ordinal()];
        if (i == 1) {
            return com.robinhood.transfers.disclosures.contracts.TransferType.SG_BANK_TRANSFER;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return com.robinhood.transfers.disclosures.contracts.TransferType.OUTGOING_WIRE;
    }

    public static final MAXTransferContext.TransferMethod toTransferMethod(TransferType transferType) {
        Intrinsics.checkNotNullParameter(transferType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[transferType.ordinal()];
        if (i == 1) {
            return MAXTransferContext.TransferMethod.FAST;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return MAXTransferContext.TransferMethod.WIRE;
    }

    public static final TransferType toTransferType(TransferType transferType) {
        Intrinsics.checkNotNullParameter(transferType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[transferType.ordinal()];
        if (i == 1) {
            return TransferType.WIRE;
        }
        if (i == 2) {
            return TransferType.FAST;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Unknown transfer type: " + transferType).toString());
    }

    public static final StringResource getStringResource(TransferType transferType) {
        int i;
        Intrinsics.checkNotNullParameter(transferType, "<this>");
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = WhenMappings.$EnumSwitchMapping$0[transferType.ordinal()];
        if (i2 == 1) {
            i = C30310R.string.select_deposit_method_fast_primary;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C30310R.string.select_deposit_method_wire_primary;
        }
        return companion.invoke(i, new Object[0]);
    }

    public static final boolean getHasServiceFee(TransferType transferType) {
        Intrinsics.checkNotNullParameter(transferType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[transferType.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
