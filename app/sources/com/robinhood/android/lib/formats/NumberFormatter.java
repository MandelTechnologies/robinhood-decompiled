package com.robinhood.android.lib.formats;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;

/* compiled from: NumberFormatter.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u001c\u0010\u000f\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\fH&J$\u0010\u0011\u001a\u00020\f2\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u00132\b\b\u0002\u0010\u0010\u001a\u00020\fH&J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\fH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/NumberFormatter;", "", "maximumFractionalDigits", "", "getMaximumFractionalDigits", "()I", "setMaximumFractionalDigits", "(I)V", "minimumFractionDigits", "getMinimumFractionDigits", "setMinimumFractionDigits", "format", "", InquiryField.FloatField.TYPE2, "", "formatNullable", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "formatMultiple", "values", "", "parse", "source", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface NumberFormatter {
    String format(Number number);

    String formatMultiple(Iterable<? extends Number> values, String str);

    String formatNullable(Number number, String str);

    int getMaximumFractionalDigits();

    int getMinimumFractionDigits();

    Number parse(String source);

    void setMaximumFractionalDigits(int i);

    void setMinimumFractionDigits(int i);

    /* compiled from: NumberFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ String formatNullable$default(NumberFormatter numberFormatter, Number number, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatNullable");
            }
            if ((i & 2) != 0) {
                str = "-";
            }
            return numberFormatter.formatNullable(number, str);
        }

        public static /* synthetic */ String formatMultiple$default(NumberFormatter numberFormatter, Iterable iterable, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatMultiple");
            }
            if ((i & 2) != 0) {
                str = "-";
            }
            return numberFormatter.formatMultiple(iterable, str);
        }
    }
}
