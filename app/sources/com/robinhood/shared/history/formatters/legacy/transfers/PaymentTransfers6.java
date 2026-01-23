package com.robinhood.shared.history.formatters.legacy.transfers;

import com.robinhood.android.ach.format.C8331R;
import com.robinhood.android.debitcard.strings.C13932R;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.transfers.api.TransferType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PaymentTransfers.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"nonOwnerExternalAccountDisplayTitle", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "getNonOwnerExternalAccountDisplayTitle", "(Lcom/robinhood/models/db/bonfire/PaymentTransfer;)Lcom/robinhood/utils/resource/StringResource;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.history.formatters.legacy.transfers.PaymentTransfersKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PaymentTransfers6 {

    /* compiled from: PaymentTransfers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.history.formatters.legacy.transfers.PaymentTransfersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferType.values().length];
            try {
                iArr[TransferType.INSTANT_BANK_TRANSFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferType.ORIGINATED_ACH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferType.DEBIT_CARD_TRANSFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getNonOwnerExternalAccountDisplayTitle(PaymentTransfer paymentTransfer) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(paymentTransfer, "<this>");
        if (paymentTransfer.getIsOwner()) {
            throw new IllegalStateException("The user is the owner for the transfer, so do not use this method!");
        }
        if (paymentTransfer.getOwnerName() == null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i3 = WhenMappings.$EnumSwitchMapping$0[paymentTransfer.getTransferType().ordinal()];
            if (i3 == 1 || i3 == 2) {
                i2 = C8331R.string.non_owner_ach_relationship_account_fallback;
            } else if (i3 == 3) {
                i2 = C13932R.string.non_owner_debit_card_fallback;
            } else {
                throw new IllegalStateException(("Unsupported transfer type: " + paymentTransfer.getTransferType()).toString());
            }
            return companion.invoke(i2, new Object[0]);
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        int i4 = WhenMappings.$EnumSwitchMapping$0[paymentTransfer.getTransferType().ordinal()];
        if (i4 == 1 || i4 == 2) {
            i = C8331R.string.non_owner_ach_relationship_account;
        } else if (i4 == 3) {
            i = C13932R.string.non_owner_debit_card;
        } else {
            throw new IllegalStateException(("Unsupported transfer type: " + paymentTransfer.getTransferType()).toString());
        }
        return companion2.invoke(i, paymentTransfer.getOwnerName());
    }
}
