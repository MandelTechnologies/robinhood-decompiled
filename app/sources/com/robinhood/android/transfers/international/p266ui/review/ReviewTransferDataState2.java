package com.robinhood.android.transfers.international.p266ui.review;

import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount2;
import com.robinhood.android.transfers.international.p266ui.model.TransferType3;
import com.robinhood.lib.bigdecimalinterop.BigDecimals6;
import com.robinhood.lib.transfers.contracts.TransferEntryPoint;
import com.robinhood.transfers.disclosures.contracts.CreateTransferState;
import com.robinhood.transfers.disclosures.contracts.CreateTransferState6;
import com.robinhood.transfers.disclosures.contracts.ServiceFeeParams;
import com.robinhood.transfers.disclosures.contracts.TransferMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewTransferDataState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"toMgCreateTransferState", "Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState;", "Lcom/robinhood/android/transfers/international/ui/review/ReviewTransferDataState;", "feature-international-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.review.ReviewTransferDataStateKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ReviewTransferDataState2 {
    public static final CreateTransferState toMgCreateTransferState(ReviewTransferDataState reviewTransferDataState) {
        Intrinsics.checkNotNullParameter(reviewTransferDataState, "<this>");
        return new CreateTransferState(BigDecimals6.toBignumBigDecimal(reviewTransferDataState.getAmount().getDecimalValue()), MultiCurrencyAccount2.toMgTransferAccount(reviewTransferDataState.getSourceAccount()), MultiCurrencyAccount2.toMgTransferAccount(reviewTransferDataState.getSinkAccount()), CreateTransferState6.ONCE, (CreateTransferState.ApiTransferAdditionalData) null, reviewTransferDataState.getAmount().getCurrency().toString(), TransferType3.toMgTransferType(reviewTransferDataState.getTransferType()), TransferMode.REVIEW, (ServiceFeeParams) null, (TransferEntryPoint) null, 16, (DefaultConstructorMarker) null);
    }
}
