package com.robinhood.android.transfers.util;

import com.robinhood.models.api.bonfire.transfer.banner.ApiAdvancedKycBannerMetadata;
import com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBannerMetadata;
import com.robinhood.rosetta.converters.cash.PaymentInstruments2;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.DcfKycContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggingUtils.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toLoggingContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/models/api/bonfire/transfer/banner/ApiTransferBannerMetadata;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.util.LoggingUtilsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class LoggingUtils8 {
    public static final Context toLoggingContext(ApiTransferBannerMetadata apiTransferBannerMetadata) {
        Intrinsics.checkNotNullParameter(apiTransferBannerMetadata, "<this>");
        ApiAdvancedKycBannerMetadata advanced_kyc = apiTransferBannerMetadata.getAdvanced_kyc();
        if (advanced_kyc != null) {
            return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new DcfKycContext(PaymentInstruments2.toProtobuf(advanced_kyc.getUser_status_with_external_provider()), null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -8388609, -1, -1, -1, 16383, null);
        }
        return null;
    }
}
