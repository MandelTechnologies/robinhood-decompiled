package com.robinhood.android.transfers.p271ui.max.i18n.details;

import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.api.TransferState;
import com.robinhood.transfers.api.p405uk.UkBankTransferState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsUkBankTransferCancelable.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, m3636d2 = {"isUkBankTransferCancelable", "", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "isInCancelableUkTransferExperiment", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.details.IsUkBankTransferCancelableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class IsUkBankTransferCancelable {

    /* compiled from: IsUkBankTransferCancelable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.details.IsUkBankTransferCancelableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferState.values().length];
            try {
                iArr[TransferState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferState.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferState.PREPROCESSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransferState.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransferState.COMPLETED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TransferState.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TransferState.PAUSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TransferState.PENDING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TransferState.PENDING_CANCEL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TransferState.REJECTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TransferState.REVERSED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TransferState.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean isUkBankTransferCancelable(PaymentTransfer paymentTransfer, boolean z) {
        Intrinsics.checkNotNullParameter(paymentTransfer, "<this>");
        if (z) {
            ApiPaymentTransferDetails details = paymentTransfer.getDetails();
            Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiUkBankTransfer");
            ApiPaymentTransferDetails.ApiUkBankTransfer apiUkBankTransfer = (ApiPaymentTransferDetails.ApiUkBankTransfer) details;
            switch (WhenMappings.$EnumSwitchMapping$0[paymentTransfer.getState().ordinal()]) {
                case 1:
                    if (apiUkBankTransfer.getState() == UkBankTransferState.NEW) {
                        return true;
                    }
                    break;
                case 2:
                    return apiUkBankTransfer.getState() == UkBankTransferState.READY;
                case 3:
                    return apiUkBankTransfer.getState() == UkBankTransferState.PAYMENT_PENDING;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    return false;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }
}
