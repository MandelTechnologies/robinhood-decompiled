package kotlinx.datetime.internal.format.parser;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlinx.datetime.internal.format.parser.NumberConsumer5;

/* compiled from: NumberConsumer.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ/\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u0015R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lkotlinx/datetime/internal/format/parser/UnsignedIntConsumer;", "Receiver", "Lkotlinx/datetime/internal/format/parser/NumberConsumer;", "minLength", "", "maxLength", "setter", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "name", "", "multiplyByMinus1", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/datetime/internal/format/parser/AssignableField;Ljava/lang/String;Z)V", "Ljava/lang/Integer;", "consume", "Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", PlaceTypes.STORAGE, "input", "", "start", "end", "(Ljava/lang/Object;Ljava/lang/CharSequence;II)Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.datetime.internal.format.parser.UnsignedIntConsumer, reason: use source file name */
/* loaded from: classes14.dex */
public final class NumberConsumer6<Receiver> extends NumberConsumer<Receiver> {
    private final Integer maxLength;
    private final Integer minLength;
    private final boolean multiplyByMinus1;
    private final AssignableField<Receiver, Integer> setter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NumberConsumer6(Integer num, Integer num2, AssignableField<? super Receiver, Integer> setter, String name, boolean z) {
        super(Intrinsics.areEqual(num, num2) ? num : null, name, null);
        Intrinsics.checkNotNullParameter(setter, "setter");
        Intrinsics.checkNotNullParameter(name, "name");
        this.minLength = num;
        this.maxLength = num2;
        this.setter = setter;
        this.multiplyByMinus1 = z;
        if (getLength() == null || new PrimitiveRanges2(1, 9).contains(getLength().intValue())) {
            return;
        }
        throw new IllegalArgumentException(("Invalid length for field " + getWhatThisExpects() + ": " + getLength()).toString());
    }

    @Override // kotlinx.datetime.internal.format.parser.NumberConsumer
    public NumberConsumer5 consume(Receiver storage, CharSequence input, int start, int end) {
        Intrinsics.checkNotNullParameter(input, "input");
        Integer num = this.maxLength;
        if (num != null && end - start > num.intValue()) {
            return new NumberConsumer5.TooManyDigits(this.maxLength.intValue());
        }
        Integer num2 = this.minLength;
        if (num2 != null && end - start < num2.intValue()) {
            return new NumberConsumer5.TooFewDigits(this.minLength.intValue());
        }
        Integer asciiIntOrNull = NumberConsumer4.parseAsciiIntOrNull(input, start, end);
        if (asciiIntOrNull == null) {
            return NumberConsumer5.ExpectedInt.INSTANCE;
        }
        AssignableField<Receiver, Integer> assignableField = this.setter;
        boolean z = this.multiplyByMinus1;
        int iIntValue = asciiIntOrNull.intValue();
        if (z) {
            iIntValue = -iIntValue;
        }
        return NumberConsumer4.setWithoutReassigning(assignableField, storage, Integer.valueOf(iIntValue));
    }
}
