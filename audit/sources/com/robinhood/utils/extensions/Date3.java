package com.robinhood.utils.extensions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Date.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001¨\u0006\u0007"}, m3636d2 = {"toOutput", "", "Ljava/util/Date;", AnalyticsStrings.MAX_WELCOME_TAG, "other", "plusMillis", "millis", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.DateKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Date3 {
    public static final long toOutput(Date date) {
        if (date != null) {
            return date.getTime();
        }
        return 0L;
    }

    public static final Date max(Date date, Date date2) {
        return (date != null && (date2 == null || date.getTime() > date2.getTime())) ? date : date2;
    }

    public static final Date plusMillis(Date date, long j) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        return new Date(date.getTime() + j);
    }
}
