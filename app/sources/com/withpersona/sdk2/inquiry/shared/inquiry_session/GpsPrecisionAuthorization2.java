package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GpsPrecisionAuthorization.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toServerRequestFormat", "", "Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionAuthorization;", "shared_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionAuthorizationKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class GpsPrecisionAuthorization2 {

    /* compiled from: GpsPrecisionAuthorization.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsPrecisionAuthorizationKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GpsPrecisionAuthorization.values().length];
            try {
                iArr[GpsPrecisionAuthorization.ROUGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GpsPrecisionAuthorization.PRECISE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String toServerRequestFormat(GpsPrecisionAuthorization gpsPrecisionAuthorization) {
        Intrinsics.checkNotNullParameter(gpsPrecisionAuthorization, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[gpsPrecisionAuthorization.ordinal()];
        if (i == 1) {
            return "rough";
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "precise";
    }
}
