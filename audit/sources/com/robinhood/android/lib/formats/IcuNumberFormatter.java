package com.robinhood.android.lib.formats;

import android.icu.text.NumberFormat;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: IcuNumberFormatter.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\"\u0010\u0018\u001a\u00020\u00132\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u0013H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/IcuNumberFormatter;", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "numberFormat", "Landroid/icu/text/NumberFormat;", "<init>", "(Landroid/icu/text/NumberFormat;)V", "getNumberFormat", "()Landroid/icu/text/NumberFormat;", "value", "", "maximumFractionalDigits", "getMaximumFractionalDigits", "()I", "setMaximumFractionalDigits", "(I)V", "minimumFractionDigits", "getMinimumFractionDigits", "setMinimumFractionDigits", "format", "", InquiryField.FloatField.TYPE2, "", "formatNullable", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "formatMultiple", "values", "", "parse", "source", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public class IcuNumberFormatter implements NumberFormatter {
    private final NumberFormat numberFormat;

    public IcuNumberFormatter(NumberFormat numberFormat) {
        Intrinsics.checkNotNullParameter(numberFormat, "numberFormat");
        this.numberFormat = numberFormat;
    }

    protected final NumberFormat getNumberFormat() {
        return this.numberFormat;
    }

    @Override // com.robinhood.android.lib.formats.NumberFormatter
    public int getMaximumFractionalDigits() {
        return this.numberFormat.getMaximumFractionDigits();
    }

    @Override // com.robinhood.android.lib.formats.NumberFormatter
    public void setMaximumFractionalDigits(int i) {
        this.numberFormat.setMaximumFractionDigits(i);
    }

    @Override // com.robinhood.android.lib.formats.NumberFormatter
    public int getMinimumFractionDigits() {
        return this.numberFormat.getMinimumFractionDigits();
    }

    @Override // com.robinhood.android.lib.formats.NumberFormatter
    public void setMinimumFractionDigits(int i) {
        this.numberFormat.setMinimumFractionDigits(i);
    }

    @Override // com.robinhood.android.lib.formats.NumberFormatter
    public String format(Number number) {
        Intrinsics.checkNotNullParameter(number, "number");
        String str = this.numberFormat.format(number);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // com.robinhood.android.lib.formats.NumberFormatter
    public String formatNullable(Number number, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "default");
        return (number == null || (str2 = format(number)) == null) ? str : str2;
    }

    @Override // com.robinhood.android.lib.formats.NumberFormatter
    public String formatMultiple(Iterable<? extends Number> values, String str) {
        Sequence sequenceAsSequence;
        Sequence sequenceFilterNotNull;
        Sequence map;
        String strJoinToString$default;
        Intrinsics.checkNotNullParameter(str, "default");
        if (values != null && (sequenceAsSequence = CollectionsKt.asSequence(values)) != null && (sequenceFilterNotNull = SequencesKt.filterNotNull(sequenceAsSequence)) != null && (map = SequencesKt.map(sequenceFilterNotNull, new C202811(this))) != null && (strJoinToString$default = SequencesKt.joinToString$default(map, null, null, null, 0, null, null, 63, null)) != null) {
            if (strJoinToString$default.length() <= 0) {
                strJoinToString$default = null;
            }
            if (strJoinToString$default != null) {
                return strJoinToString$default;
            }
        }
        return str;
    }

    /* compiled from: IcuNumberFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.formats.IcuNumberFormatter$formatMultiple$1 */
    /* synthetic */ class C202811 extends FunctionReferenceImpl implements Function1<Number, String> {
        C202811(Object obj) {
            super(1, obj, IcuNumberFormatter.class, "format", "format(Ljava/lang/Number;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Number p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((IcuNumberFormatter) this.receiver).format(p0);
        }
    }

    @Override // com.robinhood.android.lib.formats.NumberFormatter
    public Number parse(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return this.numberFormat.parse(source);
    }
}
