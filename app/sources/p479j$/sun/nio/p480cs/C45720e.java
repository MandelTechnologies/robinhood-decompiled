package p479j$.sun.nio.p480cs;

import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

/* renamed from: j$.sun.nio.cs.e */
/* loaded from: classes29.dex */
public final class C45720e {

    /* renamed from: a */
    public CoderResult f6661a;

    /* renamed from: b */
    public boolean f6662b;

    /* renamed from: a */
    public final int m3366a(char c, CharBuffer charBuffer) {
        if (Character.isHighSurrogate(c)) {
            if (!charBuffer.hasRemaining()) {
                this.f6661a = CoderResult.UNDERFLOW;
                return -1;
            }
            char c2 = charBuffer.get();
            if (Character.isLowSurrogate(c2)) {
                int codePoint = Character.toCodePoint(c, c2);
                this.f6662b = true;
                this.f6661a = null;
                return codePoint;
            }
            this.f6661a = CoderResult.malformedForLength(1);
            return -1;
        }
        if (Character.isLowSurrogate(c)) {
            this.f6661a = CoderResult.malformedForLength(1);
            return -1;
        }
        this.f6662b = false;
        this.f6661a = null;
        return c;
    }

    /* renamed from: b */
    public final int m3367b(char c, char[] cArr, int i, int i2) {
        if (!Character.isHighSurrogate(c)) {
            if (Character.isLowSurrogate(c)) {
                this.f6661a = CoderResult.malformedForLength(1);
                return -1;
            }
            this.f6662b = false;
            this.f6661a = null;
            return c;
        }
        if (i2 - i < 2) {
            this.f6661a = CoderResult.UNDERFLOW;
            return -1;
        }
        char c2 = cArr[i + 1];
        if (Character.isLowSurrogate(c2)) {
            int codePoint = Character.toCodePoint(c, c2);
            this.f6662b = true;
            this.f6661a = null;
            return codePoint;
        }
        this.f6661a = CoderResult.malformedForLength(1);
        return -1;
    }
}
