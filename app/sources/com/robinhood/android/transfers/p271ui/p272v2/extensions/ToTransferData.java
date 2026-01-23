package com.robinhood.android.transfers.p271ui.p272v2.extensions;

import com.robinhood.android.lib.transfers.TransferData;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2DataState;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2DataState2;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2StateProvider2;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ToTransferData.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"toTransferData", "Lcom/robinhood/android/lib/transfers/TransferData;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;", "clawbackGracePeriodOptIn", "", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;Ljava/lang/Boolean;)Lcom/robinhood/android/lib/transfers/TransferData;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.v2.extensions.ToTransferDataKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ToTransferData {
    public static /* synthetic */ TransferData toTransferData$default(CreateTransferV2DataState createTransferV2DataState, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        return toTransferData(createTransferV2DataState, bool);
    }

    public static final TransferData toTransferData(CreateTransferV2DataState createTransferV2DataState, Boolean bool) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        BigDecimal amount = createTransferV2DataState.getAmount();
        TransferDirectionV2 direction = createTransferV2DataState.getDirection();
        TransferAccount transferAccountFromTransferAccount = CreateTransferV2StateProvider2.fromTransferAccount(createTransferV2DataState);
        if (transferAccountFromTransferAccount == null) {
            throw new IllegalStateException("Required value was null.");
        }
        TransferAccount transferAccount = CreateTransferV2StateProvider2.toTransferAccount(createTransferV2DataState);
        if (transferAccount == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return new TransferData(amount, direction, transferAccountFromTransferAccount, transferAccount, CreateTransferV2DataState2.getAdjustedFrequency(createTransferV2DataState), CreateTransferV2DataState2.getSelectedAchTransferOptionOrDefault(createTransferV2DataState), CreateTransferV2DataState2.getIraDistributionData(createTransferV2DataState), createTransferV2DataState.getIraContribution(), createTransferV2DataState.getEntryPoint(), createTransferV2DataState.getPromotionName(), createTransferV2DataState.getPromotionType(), createTransferV2DataState.getSystemCalendarYear(), false, createTransferV2DataState.getRothConversionTransferInfo(), bool, null, 36864, null);
    }
}
