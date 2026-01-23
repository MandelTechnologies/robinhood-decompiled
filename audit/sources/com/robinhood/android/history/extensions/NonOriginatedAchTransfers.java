package com.robinhood.android.history.extensions;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.history.C18359R;
import com.robinhood.models.p320db.NonOriginatedAchTransfer;
import com.robinhood.models.util.Money;
import com.robinhood.transfers.api.NonOriginatedAchTransferState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NonOriginatedAchTransfers.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, m3636d2 = {"getTitleForHistory", "", "Lcom/robinhood/models/db/NonOriginatedAchTransfer;", "resources", "Landroid/content/res/Resources;", "getStatusForDetail", "feature-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.extensions.NonOriginatedAchTransfersKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class NonOriginatedAchTransfers {

    /* compiled from: NonOriginatedAchTransfers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.history.extensions.NonOriginatedAchTransfersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Money.Direction.values().length];
            try {
                iArr[Money.Direction.CREDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Money.Direction.DEBIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NonOriginatedAchTransferState.values().length];
            try {
                iArr2[NonOriginatedAchTransferState.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NonOriginatedAchTransferState.COMPLETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[NonOriginatedAchTransferState.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[NonOriginatedAchTransferState.REVERSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[NonOriginatedAchTransferState.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String getTitleForHistory(NonOriginatedAchTransfer nonOriginatedAchTransfer, Resources resources) {
        int i;
        Intrinsics.checkNotNullParameter(nonOriginatedAchTransfer, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i2 = WhenMappings.$EnumSwitchMapping$0[nonOriginatedAchTransfer.getDirection().ordinal()];
        if (i2 == 1) {
            i = C18359R.string.non_orig_ach_transfer_history_title_credit;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C18359R.string.non_orig_ach_transfer_history_title_debit;
        }
        String string2 = resources.getString(i, nonOriginatedAchTransfer.getLabel(), nonOriginatedAchTransfer.getOriginatorName());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getStatusForDetail(NonOriginatedAchTransfer nonOriginatedAchTransfer, Resources resources) {
        int i;
        Intrinsics.checkNotNullParameter(nonOriginatedAchTransfer, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i2 = WhenMappings.$EnumSwitchMapping$1[nonOriginatedAchTransfer.getState().ordinal()];
        if (i2 == 1) {
            i = C18359R.string.non_orig_ach_transfer_detail_status_pending;
        } else if (i2 == 2) {
            i = C18359R.string.non_orig_ach_transfer_detail_status_completed;
        } else if (i2 == 3) {
            i = C18359R.string.non_orig_ach_transfer_detail_status_rejected;
        } else if (i2 == 4) {
            i = C18359R.string.non_orig_ach_transfer_detail_status_reversed;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = C11048R.string.general_label_unknown;
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
