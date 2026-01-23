package kotlin.text;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Char.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0010\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"", "", "titlecase", "(C)Ljava/lang/String;", "other", "", "ignoreCase", "equals", "(CCZ)Z", "isSurrogate", "(C)Z", "kotlin-stdlib"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/text/CharsKt")
@SourceDebugExtension
/* renamed from: kotlin.text.CharsKt__CharKt, reason: use source file name */
/* loaded from: classes23.dex */
public class Char extends CharJVM {
    public static boolean isSurrogate(char c) {
        return 55296 <= c && c < 57344;
    }

    @SinceKotlin
    public static String titlecase(char c) {
        return _OneToManyTitlecaseMappings.titlecaseImpl(c);
    }

    public static final boolean equals(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
