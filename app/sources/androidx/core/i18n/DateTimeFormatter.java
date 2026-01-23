package androidx.core.i18n;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.provider.Settings;
import com.singular.sdk.internal.Constants;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DateTimeFormatter.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB#\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatter;", "", "Landroid/content/Context;", "context", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions;", "options", "Ljava/util/Locale;", "locale", "<init>", "(Landroid/content/Context;Landroidx/core/i18n/DateTimeFormatterSkeletonOptions;Ljava/util/Locale;)V", "", "skeletonRespectingPrefs", "(Landroid/content/Context;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;", "", "is24HourLocale", "(Ljava/util/Locale;)Z", "Ljava/util/Date;", InquiryField.DateField.TYPE, "format", "(Ljava/util/Date;)Ljava/lang/String;", "Ljava/util/Calendar;", "calendar", "(Ljava/util/Calendar;)Ljava/lang/String;", "Landroidx/core/i18n/IDateTimeFormatterImpl;", "dateFormatter", "Landroidx/core/i18n/IDateTimeFormatterImpl;", "Companion", "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class DateTimeFormatter {
    private static final Companion Companion = new Companion(null);
    private final IDateTimeFormatterImpl dateFormatter;

    @JvmOverloads
    public DateTimeFormatter(Context context, DateTimeFormatterSkeletonOptions options, Locale locale) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.dateFormatter = new IDateTimeFormatterImpl2(skeletonRespectingPrefs(context, locale, options.toString()), locale);
    }

    private final String skeletonRespectingPrefs(Context context, Locale locale, String options) {
        if (Build.VERSION.SDK_INT <= 28) {
            options = StringsKt.replace$default(options, "B", "", false, 4, (Object) null);
        }
        String str = options;
        if (StringsKt.contains$default((CharSequence) str, 'j', false, 2, (Object) null)) {
            String string2 = Settings.System.getString(context.getContentResolver(), "time_12_24");
            if (Intrinsics.areEqual(string2, "12")) {
                return StringsKt.replace$default(str, 'j', 'h', false, 4, (Object) null);
            }
            if (Intrinsics.areEqual(string2, "24")) {
                return StringsKt.replace$default(str, 'j', 'H', false, 4, (Object) null);
            }
            if (!is24HourLocale(locale)) {
                StringsKt.replace$default(str, Constants.RequestParamsKeys.DEVELOPER_API_KEY, "", false, 4, (Object) null);
                return StringsKt.replace$default(str, 'j', 'h', false, 4, (Object) null);
            }
        }
        return str;
    }

    private final boolean is24HourLocale(Locale locale) {
        return Companion.Api24Utils.INSTANCE.is24HourLocale(locale);
    }

    public final String format(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
        return format(calendar);
    }

    public final String format(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        return this.dateFormatter.format(calendar);
    }

    /* compiled from: DateTimeFormatter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatter$Companion;", "", "()V", "Api24Utils", "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* compiled from: DateTimeFormatter.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatter$Companion$Api24Utils;", "", "Companion", "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
        private static final class Api24Utils {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* compiled from: DateTimeFormatter.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m3636d2 = {"Landroidx/core/i18n/DateTimeFormatter$Companion$Api24Utils$Companion;", "", "()V", "is24HourLocale", "", "locale", "Ljava/util/Locale;", "core-i18n_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final boolean is24HourLocale(Locale locale) {
                    String tmpPattern;
                    Intrinsics.checkNotNullParameter(locale, "locale");
                    DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("jm", locale);
                    if (instanceForSkeleton instanceof SimpleDateFormat) {
                        tmpPattern = ((SimpleDateFormat) instanceForSkeleton).toPattern();
                    } else {
                        tmpPattern = android.text.format.DateFormat.getBestDateTimePattern(locale, "jm");
                    }
                    Intrinsics.checkNotNullExpressionValue(tmpPattern, "tmpPattern");
                    return StringsKt.contains$default((CharSequence) tmpPattern, 'H', false, 2, (Object) null);
                }
            }
        }
    }
}
