package com.robinhood.transfers.gold;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldDepositBoostTransferDetail.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toDbModel", "Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;", "Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "lib-models-transfer-gold_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.transfers.gold.GoldDepositBoostTransferDetailKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class GoldDepositBoostTransferDetail2 {
    public static final GoldDepositBoostTransferDetail toDbModel(ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail) {
        Intrinsics.checkNotNullParameter(apiGoldDepositBoostTransferDetail, "<this>");
        return new GoldDepositBoostTransferDetail(apiGoldDepositBoostTransferDetail.getBadge_text(), apiGoldDepositBoostTransferDetail.getAmount_title(), apiGoldDepositBoostTransferDetail.getAmount_text(), apiGoldDepositBoostTransferDetail.getIcon_asset(), apiGoldDepositBoostTransferDetail.getDetail_text());
    }
}
