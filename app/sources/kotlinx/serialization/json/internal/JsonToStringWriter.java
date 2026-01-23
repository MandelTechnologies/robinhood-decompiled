package kotlinx.serialization.json.internal;

import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: JsonToStringWriter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\tH\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lkotlinx/serialization/json/internal/JsonToStringWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "<init>", "()V", ResourceTypes.ARRAY, "", "size", "", "writeLong", "", "value", "", "writeChar", "char", "", "write", "text", "", "writeQuoted", "appendStringSlowPath", "firstEscapedChar", "currentSize", "string", "release", "toString", "ensureAdditionalCapacity", "expected", "ensureTotalCapacity", "oldSize", "additional", "kotlinx-serialization-json"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class JsonToStringWriter implements JsonStreams3 {
    private char[] array = ArrayPools4.INSTANCE.take();
    private int size;

    @Override // kotlinx.serialization.json.internal.JsonStreams3
    public void writeLong(long value) {
        write(String.valueOf(value));
    }

    @Override // kotlinx.serialization.json.internal.JsonStreams3
    public void writeChar(char c) {
        ensureAdditionalCapacity(1);
        char[] cArr = this.array;
        int i = this.size;
        this.size = i + 1;
        cArr[i] = c;
    }

    @Override // kotlinx.serialization.json.internal.JsonStreams3
    public void write(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        ensureAdditionalCapacity(length);
        text.getChars(0, text.length(), this.array, this.size);
        this.size += length;
    }

    @Override // kotlinx.serialization.json.internal.JsonStreams3
    public void writeQuoted(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        ensureAdditionalCapacity(text.length() + 2);
        char[] cArr = this.array;
        int i = this.size;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        for (int i4 = i2; i4 < i3; i4++) {
            char c = cArr[i4];
            if (c < StringOps.getESCAPE_MARKERS().length && StringOps.getESCAPE_MARKERS()[c] != 0) {
                appendStringSlowPath(i4 - i2, i4, text);
                return;
            }
        }
        cArr[i3] = '\"';
        this.size = i3 + 1;
    }

    private final void appendStringSlowPath(int firstEscapedChar, int currentSize, String string2) {
        byte b;
        int length = string2.length();
        while (firstEscapedChar < length) {
            int iEnsureTotalCapacity = ensureTotalCapacity(currentSize, 2);
            char cCharAt = string2.charAt(firstEscapedChar);
            if (cCharAt >= StringOps.getESCAPE_MARKERS().length || (b = StringOps.getESCAPE_MARKERS()[cCharAt]) == 0) {
                int i = iEnsureTotalCapacity + 1;
                this.array[iEnsureTotalCapacity] = cCharAt;
                currentSize = i;
                firstEscapedChar++;
            } else {
                if (b == 1) {
                    String str = StringOps.getESCAPE_STRINGS()[cCharAt];
                    Intrinsics.checkNotNull(str);
                    int iEnsureTotalCapacity2 = ensureTotalCapacity(iEnsureTotalCapacity, str.length());
                    str.getChars(0, str.length(), this.array, iEnsureTotalCapacity2);
                    currentSize = iEnsureTotalCapacity2 + str.length();
                    this.size = currentSize;
                } else {
                    char[] cArr = this.array;
                    cArr[iEnsureTotalCapacity] = '\\';
                    cArr[iEnsureTotalCapacity + 1] = (char) b;
                    currentSize = iEnsureTotalCapacity + 2;
                    this.size = currentSize;
                }
                firstEscapedChar++;
            }
        }
        int iEnsureTotalCapacity3 = ensureTotalCapacity(currentSize, 1);
        this.array[iEnsureTotalCapacity3] = '\"';
        this.size = iEnsureTotalCapacity3 + 1;
    }

    public void release() {
        ArrayPools4.INSTANCE.release(this.array);
    }

    public String toString() {
        return new String(this.array, 0, this.size);
    }

    private final void ensureAdditionalCapacity(int expected) {
        ensureTotalCapacity(this.size, expected);
    }

    private final int ensureTotalCapacity(int oldSize, int additional) {
        int i = additional + oldSize;
        char[] cArr = this.array;
        if (cArr.length <= i) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, RangesKt.coerceAtLeast(i, oldSize * 2));
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.array = cArrCopyOf;
        }
        return oldSize;
    }
}
