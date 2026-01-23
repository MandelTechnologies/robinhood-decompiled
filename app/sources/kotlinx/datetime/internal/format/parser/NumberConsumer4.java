package kotlinx.datetime.internal.format.parser;

import kotlin.Metadata;
import kotlinx.datetime.internal.UtilKt;
import kotlinx.datetime.internal.format.parser.NumberConsumer5;

/* compiled from: NumberConsumer.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a#\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0007\u001a\u0004\u0018\u00010\b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n*\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\f\u001a\u0002H\t2\u0006\u0010\r\u001a\u0002H\nH\u0002¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"parseAsciiInt", "", "", "start", "end", "parseAsciiIntOrNull", "(Ljava/lang/CharSequence;II)Ljava/lang/Integer;", "setWithoutReassigning", "Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "Object", "Type", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "receiver", "value", "(Lkotlinx/datetime/internal/format/parser/AssignableField;Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.internal.format.parser.NumberConsumerKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class NumberConsumer4 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <Object, Type> NumberConsumer5 setWithoutReassigning(AssignableField<? super Object, Type> assignableField, Object object, Type type2) {
        Type typeTrySetWithoutReassigning = assignableField.trySetWithoutReassigning(object, type2);
        if (typeTrySetWithoutReassigning == null) {
            return null;
        }
        return new NumberConsumer5.Conflicting(typeTrySetWithoutReassigning);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int parseAsciiInt(CharSequence charSequence, int i, int i2) {
        int iAsciiDigitToInt = 0;
        while (i < i2) {
            iAsciiDigitToInt = (iAsciiDigitToInt * 10) + UtilKt.asciiDigitToInt(charSequence.charAt(i));
            i++;
        }
        return iAsciiDigitToInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer parseAsciiIntOrNull(CharSequence charSequence, int i, int i2) {
        int iAsciiDigitToInt = 0;
        while (i < i2) {
            iAsciiDigitToInt = (iAsciiDigitToInt * 10) + UtilKt.asciiDigitToInt(charSequence.charAt(i));
            if (iAsciiDigitToInt < 0) {
                return null;
            }
            i++;
        }
        return Integer.valueOf(iAsciiDigitToInt);
    }
}
