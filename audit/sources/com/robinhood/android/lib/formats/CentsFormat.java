package com.robinhood.android.lib.formats;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CentsFormat.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/CentsFormat;", "Lcom/robinhood/android/lib/formats/DefaultNumberFormatter;", "integerFormat", "<init>", "(Lcom/robinhood/android/lib/formats/DefaultNumberFormatter;)V", "format", "", InquiryField.FloatField.TYPE2, "", "Companion", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CentsFormat extends DefaultNumberFormatter {
    private static final long CENTS_MULTIPLIER = 100;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CentsFormat(DefaultNumberFormatter integerFormat) {
        super(integerFormat);
        Intrinsics.checkNotNullParameter(integerFormat, "integerFormat");
    }

    @Override // com.robinhood.android.lib.formats.DefaultNumberFormatter, com.robinhood.android.lib.formats.NumberFormatter
    public String format(Number number) {
        Intrinsics.checkNotNullParameter(number, "number");
        return super.format(Double.valueOf(number.doubleValue() * 100));
    }
}
