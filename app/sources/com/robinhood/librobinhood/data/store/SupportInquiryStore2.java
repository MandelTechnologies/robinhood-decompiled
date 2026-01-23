package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.ChannelType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportInquiryStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/UnexpectedChannelTypeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "expected", "Lcom/robinhood/models/api/ChannelType;", AnalyticsStrings.PUSH_NOTIF_EVENT_RECEIVED, "<init>", "(Lcom/robinhood/models/api/ChannelType;Lcom/robinhood/models/api/ChannelType;)V", "lib-store-cx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.UnexpectedChannelTypeException, reason: use source file name */
/* loaded from: classes13.dex */
public final class SupportInquiryStore2 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportInquiryStore2(ChannelType expected, ChannelType received) {
        super("Requested " + expected.getServerValue() + " support issue, but received channel type '" + received.getServerValue() + "' from backend instead.");
        Intrinsics.checkNotNullParameter(expected, "expected");
        Intrinsics.checkNotNullParameter(received, "received");
    }
}
