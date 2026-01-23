package com.twilio.util;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;

/* compiled from: TwilioLogger.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J&\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J&\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J&\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J&\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\r"}, m3636d2 = {"Lcom/twilio/util/LogWriter;", "", "d", "", "tag", "", "msg", "t", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "v", "w", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.util.LogWriter, reason: use source file name */
/* loaded from: classes11.dex */
public interface TwilioLogger2 {
    /* renamed from: d */
    void mo3178d(String tag, String msg, Throwable t);

    /* renamed from: e */
    void mo3179e(String tag, String msg, Throwable t);

    /* renamed from: i */
    void mo3180i(String tag, String msg, Throwable t);

    /* renamed from: v */
    void mo3181v(String tag, String msg, Throwable t);

    /* renamed from: w */
    void mo3182w(String tag, String msg, Throwable t);

    /* compiled from: TwilioLogger.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.twilio.util.LogWriter$DefaultImpls */
    public static final class DefaultImpls {
        public static /* synthetic */ void v$default(TwilioLogger2 twilioLogger2, String str, String str2, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: v");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                th = null;
            }
            twilioLogger2.mo3181v(str, str2, th);
        }

        public static /* synthetic */ void d$default(TwilioLogger2 twilioLogger2, String str, String str2, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                th = null;
            }
            twilioLogger2.mo3178d(str, str2, th);
        }

        public static /* synthetic */ void i$default(TwilioLogger2 twilioLogger2, String str, String str2, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: i");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                th = null;
            }
            twilioLogger2.mo3180i(str, str2, th);
        }

        public static /* synthetic */ void w$default(TwilioLogger2 twilioLogger2, String str, String str2, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                th = null;
            }
            twilioLogger2.mo3182w(str, str2, th);
        }

        public static /* synthetic */ void e$default(TwilioLogger2 twilioLogger2, String str, String str2, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                th = null;
            }
            twilioLogger2.mo3179e(str, str2, th);
        }
    }
}
