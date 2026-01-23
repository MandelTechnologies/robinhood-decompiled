package androidx.core.i18n;

import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import java.text.FieldPosition;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IDateTimeFormatterImpl.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatterImplIcu;", "Landroidx/core/i18n/IDateTimeFormatterImpl;", "skeleton", "", "locale", "Ljava/util/Locale;", "(Ljava/lang/String;Ljava/util/Locale;)V", "sdf", "Landroid/icu/text/DateFormat;", "kotlin.jvm.PlatformType", "format", "calendar", "Ljava/util/Calendar;", "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.core.i18n.DateTimeFormatterImplIcu, reason: use source file name */
/* loaded from: classes4.dex */
public final class IDateTimeFormatterImpl2 implements IDateTimeFormatterImpl {
    private Locale locale;
    private final DateFormat sdf;

    public IDateTimeFormatterImpl2(String skeleton, Locale locale) {
        Intrinsics.checkNotNullParameter(skeleton, "skeleton");
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.locale = locale;
        this.sdf = DateFormat.getInstanceForSkeleton(skeleton, locale);
    }

    @Override // androidx.core.i18n.IDateTimeFormatterImpl
    public String format(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        StringBuffer stringBuffer = new StringBuffer();
        this.sdf.setCalendar(android.icu.util.Calendar.getInstance(TimeZone.getTimeZone(calendar.getTimeZone().getID()), this.locale));
        this.sdf.format(Long.valueOf(calendar.getTimeInMillis()), stringBuffer, new FieldPosition(0));
        String string2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "result.toString()");
        return string2;
    }
}
