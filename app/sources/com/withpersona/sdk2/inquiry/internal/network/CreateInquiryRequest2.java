package com.withpersona.sdk2.inquiry.internal.network;

import com.adjust.sdk.AdjustConfig;
import com.withpersona.sdk2.inquiry.internal.Environment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateInquiryRequest.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"toServerKey", "", "Lcom/withpersona/sdk2/inquiry/internal/Environment;", "inquiry-internal_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequestKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class CreateInquiryRequest2 {

    /* compiled from: CreateInquiryRequest.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.internal.network.CreateInquiryRequestKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Environment.values().length];
            try {
                iArr[Environment.PRODUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Environment.SANDBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String toServerKey(Environment environment) {
        Intrinsics.checkNotNullParameter(environment, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[environment.ordinal()];
        if (i == 1) {
            return "production";
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return AdjustConfig.ENVIRONMENT_SANDBOX;
    }
}
