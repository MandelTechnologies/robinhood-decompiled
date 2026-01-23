package kotlinx.datetime.internal;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: math.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, m3636d2 = {"Lkotlinx/datetime/internal/DecimalFraction;", "", "", "fractionalPart", "digits", "<init>", "(II)V", "newDigits", "fractionalPartWithNDigits", "(I)I", "other", "compareTo", "(Lkotlinx/datetime/internal/DecimalFraction;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "I", "getFractionalPart", "getDigits", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.datetime.internal.DecimalFraction, reason: use source file name */
/* loaded from: classes14.dex */
public final class math implements Comparable<math> {
    private final int digits;
    private final int fractionalPart;

    public math(int i, int i2) {
        this.fractionalPart = i;
        this.digits = i2;
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Digits must be non-negative, but was " + i2).toString());
    }

    public final int fractionalPartWithNDigits(int newDigits) {
        int i = this.digits;
        if (newDigits == i) {
            return this.fractionalPart;
        }
        if (newDigits > i) {
            return this.fractionalPart * math3.getPOWERS_OF_TEN()[newDigits - this.digits];
        }
        return this.fractionalPart / math3.getPOWERS_OF_TEN()[this.digits - newDigits];
    }

    @Override // java.lang.Comparable
    public int compareTo(math other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iMax = Math.max(this.digits, other.digits);
        return Intrinsics.compare(fractionalPartWithNDigits(iMax), other.fractionalPartWithNDigits(iMax));
    }

    public boolean equals(Object other) {
        return (other instanceof math) && compareTo((math) other) == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = math3.getPOWERS_OF_TEN()[this.digits];
        sb.append(this.fractionalPart / i);
        sb.append('.');
        sb.append(StringsKt.removePrefix(String.valueOf(i + (this.fractionalPart % i)), Constants.SdidMigrationStatusCodes.ALREADY_SDID));
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }
}
