package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringBuilder.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a1\u0010\u0005\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0002\"\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "", "value", "append", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;", "kotlin-stdlib"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.StringsKt__StringBuilderKt, reason: use source file name */
/* loaded from: classes23.dex */
public class StringBuilder extends StringBuilderJVM {
    public static java.lang.StringBuilder append(java.lang.StringBuilder sb, String... value) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        for (String str : value) {
            sb.append(str);
        }
        return sb;
    }
}
