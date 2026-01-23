package com.robinhood.android.lib.store.mcw.data;

import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.mcw_currency_conversion.proto.p498v1.FxOrderResponseDto;
import microgram.contracts.mcw_currency_conversion.proto.p498v1.PerformQuickConversionResponseDto;

/* compiled from: PerformQuickConversionResponse.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toPerformQuickConversionResponse", "Lcom/robinhood/android/lib/store/mcw/data/PerformQuickConversionResponse;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/PerformQuickConversionResponseDto;", "lib-store-mcw_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.store.mcw.data.PerformQuickConversionResponseKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class PerformQuickConversionResponse2 {
    public static final PerformQuickConversionResponse toPerformQuickConversionResponse(PerformQuickConversionResponseDto performQuickConversionResponseDto) {
        Intrinsics.checkNotNullParameter(performQuickConversionResponseDto, "<this>");
        FxOrderResponseDto data = performQuickConversionResponseDto.getData();
        if (data == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        UUID uuidFromString = UUID.fromString(data.getRef_id());
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        FxOrderResponseDto data2 = performQuickConversionResponseDto.getData();
        if (data2 != null) {
            return new PerformQuickConversionResponse(uuidFromString, StringsKt.toUuid(data2.getOrder_id()));
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
