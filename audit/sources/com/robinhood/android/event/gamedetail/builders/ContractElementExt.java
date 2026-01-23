package com.robinhood.android.event.gamedetail.builders;

import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContractElementExt.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toContractIdWithSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.builders.ContractElementExtKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ContractElementExt {
    public static final ContractIdWithSide toContractIdWithSide(ContractElement contractElement) {
        Intrinsics.checkNotNullParameter(contractElement, "<this>");
        return new ContractIdWithSide(contractElement.getContractId(), contractElement.getContractSide());
    }
}
