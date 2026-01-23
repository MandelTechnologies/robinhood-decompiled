package com.robinhood.librobinhood.data.store.bonfire;

import acats_aggregation.service.p001v1.FeeReimbursementsHistoryItemDto;
import com.robinhood.models.acats.p299db.bonfire.AcatsReimbursement;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: AcatsReimbursementStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toDbModel", "Lcom/robinhood/models/acats/db/bonfire/AcatsReimbursement;", "Lacats_aggregation/service/v1/FeeReimbursementsHistoryItemDto;", "lib-store-acats_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsReimbursementStoreKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class AcatsReimbursementStore7 {
    public static final AcatsReimbursement toDbModel(FeeReimbursementsHistoryItemDto feeReimbursementsHistoryItemDto) {
        Intrinsics.checkNotNullParameter(feeReimbursementsHistoryItemDto, "<this>");
        String id = feeReimbursementsHistoryItemDto.getId();
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        String account_number = feeReimbursementsHistoryItemDto.getAccount_number();
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(feeReimbursementsHistoryItemDto.getAmount()));
        String title = feeReimbursementsHistoryItemDto.getTitle();
        Instant completion_date = feeReimbursementsHistoryItemDto.getCompletion_date();
        Intrinsics.checkNotNull(completion_date, "null cannot be cast to non-null type java.time.Instant");
        return new AcatsReimbursement(id, uuidRandomUUID, account_number, bigDecimal, title, completion_date);
    }
}
