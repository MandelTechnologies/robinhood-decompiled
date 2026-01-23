package com.twilio.twilsock.util;

import com.twilio.twilsock.client.Status;
import com.twilio.util.ErrorInfo;
import com.twilio.util.TwilioException2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: commonUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"toErrorInfo", "Lcom/twilio/util/ErrorInfo;", "Lcom/twilio/twilsock/client/Status;", "reason", "Lcom/twilio/util/ErrorReason;", "twilsock_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.twilsock.util.CommonUtilsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class commonUtils {
    public static /* synthetic */ ErrorInfo toErrorInfo$default(Status status, TwilioException2 twilioException2, int i, Object obj) {
        if ((i & 1) != 0) {
            twilioException2 = TwilioException2.Unknown;
        }
        return toErrorInfo(status, twilioException2);
    }

    public static final ErrorInfo toErrorInfo(Status status, TwilioException2 reason) {
        Intrinsics.checkNotNullParameter(status, "<this>");
        Intrinsics.checkNotNullParameter(reason, "reason");
        int code = status.getCode();
        Integer errorCode = status.getErrorCode();
        int iIntValue = errorCode != null ? errorCode.intValue() : 0;
        String status2 = status.getStatus();
        String description = status.getDescription();
        if (description == null) {
            description = "";
        }
        return new ErrorInfo(reason, code, iIntValue, status2, description);
    }
}
