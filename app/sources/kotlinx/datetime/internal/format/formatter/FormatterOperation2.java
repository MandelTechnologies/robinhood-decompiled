package kotlinx.datetime.internal.format.formatter;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.internal.math;

/* compiled from: FormatterOperation.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lkotlinx/datetime/internal/format/formatter/DecimalFractionFormatterStructure;", "T", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlin/Function1;", "Lkotlinx/datetime/internal/DecimalFraction;", InquiryField.FloatField.TYPE2, "", "minDigits", "maxDigits", "", "zerosToAdd", "<init>", "(Lkotlin/jvm/functions/Function1;IILjava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "I", "Ljava/util/List;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.internal.format.formatter.DecimalFractionFormatterStructure, reason: use source file name */
/* loaded from: classes14.dex */
public final class FormatterOperation2<T> implements Formatter4<T> {
    private final int maxDigits;
    private final int minDigits;
    private final Function1<T, math> number;
    private final List<Integer> zerosToAdd;

    /* JADX WARN: Multi-variable type inference failed */
    public FormatterOperation2(Function1<? super T, math> number, int i, int i2, List<Integer> zerosToAdd) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(zerosToAdd, "zerosToAdd");
        this.number = number;
        this.minDigits = i;
        this.maxDigits = i2;
        this.zerosToAdd = zerosToAdd;
        if (1 > i || i >= 10) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i + ") is not in range 1..9").toString());
        }
        if (i > i2 || i2 >= 10) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i2 + ") is not in range " + i + "..9").toString());
        }
    }
}
