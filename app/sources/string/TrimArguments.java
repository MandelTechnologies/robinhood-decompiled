package string;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Trim.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lstring/TrimArguments;", "", "", "text", "", "char", "Lstring/TrimMode;", "mode", "<init>", "(Ljava/lang/String;CLstring/TrimMode;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "C", "getChar", "()C", "Lstring/TrimMode;", "getMode", "()Lstring/TrimMode;", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
final /* data */ class TrimArguments {
    private final char char;
    private final Trim3 mode;
    private final String text;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrimArguments)) {
            return false;
        }
        TrimArguments trimArguments = (TrimArguments) other;
        return Intrinsics.areEqual(this.text, trimArguments.text) && this.char == trimArguments.char && Intrinsics.areEqual(this.mode, trimArguments.mode);
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + Character.hashCode(this.char)) * 31) + this.mode.hashCode();
    }

    public String toString() {
        return "TrimArguments(text=" + this.text + ", char=" + this.char + ", mode=" + this.mode + ")";
    }

    public TrimArguments(String text, char c, Trim3 mode) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.text = text;
        this.char = c;
        this.mode = mode;
    }

    public final String getText() {
        return this.text;
    }

    public final char getChar() {
        return this.char;
    }

    public final Trim3 getMode() {
        return this.mode;
    }
}
