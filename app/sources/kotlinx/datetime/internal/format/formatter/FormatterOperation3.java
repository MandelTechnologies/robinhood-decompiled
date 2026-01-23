package kotlinx.datetime.internal.format.formatter;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FormatterOperation.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B-\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\r"}, m3636d2 = {"Lkotlinx/datetime/internal/format/formatter/SignedIntFormatterStructure;", "T", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlin/Function1;", "", InquiryField.FloatField.TYPE2, "zeroPadding", "outputPlusOnExceededWidth", "<init>", "(Lkotlin/jvm/functions/Function1;ILjava/lang/Integer;)V", "Lkotlin/jvm/functions/Function1;", "I", "Ljava/lang/Integer;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.datetime.internal.format.formatter.SignedIntFormatterStructure, reason: use source file name */
/* loaded from: classes14.dex */
public final class FormatterOperation3<T> implements Formatter4<T> {
    private final Function1<T, Integer> number;
    private final Integer outputPlusOnExceededWidth;
    private final int zeroPadding;

    /* JADX WARN: Multi-variable type inference failed */
    public FormatterOperation3(Function1<? super T, Integer> number, int i, Integer num) {
        Intrinsics.checkNotNullParameter(number, "number");
        this.number = number;
        this.zeroPadding = i;
        this.outputPlusOnExceededWidth = num;
        if (i < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i + ") is negative").toString());
        }
        if (i <= 9) {
            return;
        }
        throw new IllegalArgumentException(("The minimum number of digits (" + i + ") exceeds the length of an Int").toString());
    }
}
