package com.robinhood.android.ach.format;

import android.content.res.Resources;
import com.robinhood.android.models.transfer.shared.AchTransferState;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.util.Money;
import com.robinhood.transfers.models.p406db.AchTransfer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchTransfers.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"getAmountDisplayString", "", "Lcom/robinhood/transfers/models/db/AchTransfer;", "res", "Landroid/content/res/Resources;", "stateResId", "", "getStateResId", "(Lcom/robinhood/transfers/models/db/AchTransfer;)I", "lib-utils-ach-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.ach.format.AchTransfersKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AchTransfers {

    /* compiled from: AchTransfers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.ach.format.AchTransfersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AchTransferState.values().length];
            try {
                iArr[AchTransferState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AchTransferState.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AchTransferState.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AchTransferState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AchTransferState.REVERSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AchTransferState.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AchTransferState.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getAmountDisplayString(AchTransfer achTransfer, Resources res) throws Resources.NotFoundException {
        Money.Adjustment creditAdjustment;
        Intrinsics.checkNotNullParameter(achTransfer, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        switch (WhenMappings.$EnumSwitchMapping$0[achTransfer.getState().ordinal()]) {
            case 1:
            case 2:
            case 3:
                if (achTransfer.getDirection() == TransferDirection.WITHDRAW) {
                    creditAdjustment = achTransfer.getAmount().toDebitAdjustment();
                } else {
                    creditAdjustment = achTransfer.getAmount().toCreditAdjustment();
                }
                return Money.Adjustment.format$default(creditAdjustment, false, null, 3, null);
            case 4:
            case 5:
            case 6:
            case 7:
                String string2 = res.getString(getStateResId(achTransfer));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int getStateResId(AchTransfer achTransfer) {
        Intrinsics.checkNotNullParameter(achTransfer, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[achTransfer.getState().ordinal()]) {
            case 1:
                return C8331R.string.ach_transfer_state_new;
            case 2:
                return C8331R.string.ach_transfer_state_pending;
            case 3:
                return C8331R.string.ach_transfer_state_completed;
            case 4:
                return C8331R.string.ach_transfer_state_failed;
            case 5:
                return C8331R.string.ach_transfer_state_reversed;
            case 6:
                return C8331R.string.ach_transfer_state_canceled;
            case 7:
                return C8331R.string.ach_transfer_state_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
