package com.robinhood.shared.equities.subzero;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiShortingInfo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toShortingInfo", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "Lcom/robinhood/shared/equities/subzero/ApiShortingInfo;", "lib-equity-subzero_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.equities.subzero.ApiShortingInfoKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ApiShortingInfo2 {
    public static final ShortingInfo toShortingInfo(ApiShortingInfo apiShortingInfo) {
        Intrinsics.checkNotNullParameter(apiShortingInfo, "<this>");
        return new ShortingInfo(apiShortingInfo.getInstrument_id(), apiShortingInfo.getFee(), apiShortingInfo.getDaily_fee(), apiShortingInfo.getFee_timestamp(), ShortingInventoryRange.INSTANCE.fromServerValue(apiShortingInfo.getInventory_range()));
    }
}
