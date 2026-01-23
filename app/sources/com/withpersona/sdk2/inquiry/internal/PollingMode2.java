package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PollingMode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"to", "Lcom/withpersona/sdk2/inquiry/internal/PollingMode;", "Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "inquiry-internal_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.internal.PollingModeKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class PollingMode2 {

    /* compiled from: PollingMode.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.internal.PollingModeKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckInquiryResponse.PollingMode.values().length];
            try {
                iArr[CheckInquiryResponse.PollingMode.Blocking.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckInquiryResponse.PollingMode.Background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckInquiryResponse.PollingMode.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: to */
    public static final PollingMode m3228to(CheckInquiryResponse.PollingMode pollingMode) {
        Intrinsics.checkNotNullParameter(pollingMode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[pollingMode.ordinal()];
        if (i == 1) {
            return PollingMode.Blocking;
        }
        if (i == 2) {
            return PollingMode.Background;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return PollingMode.Blocking;
    }
}
