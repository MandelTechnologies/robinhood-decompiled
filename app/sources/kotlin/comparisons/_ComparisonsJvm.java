package kotlin.comparisons;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _ComparisonsJvm.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0010\u000f\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\b\u0003\u001a/\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0007\u001a#\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\n\u0010\n\u001a\u00020\t\"\u00020\bH\u0007¢\u0006\u0004\b\u0004\u0010\u000b\u001a#\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\n\u001a\u00020\r\"\u00020\fH\u0007¢\u0006\u0004\b\u0004\u0010\u000e\u001a/\u0010\u000f\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0005\u001a#\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\n\u001a\u00020\r\"\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"", "T", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "maxOf", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "c", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "other", "(I[I)I", "", "", "(F[F)F", "minOf", "kotlin-stdlib"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/comparisons/ComparisonsKt")
/* renamed from: kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt, reason: use source file name */
/* loaded from: classes21.dex */
public class _ComparisonsJvm extends ComparisonsKt__ComparisonsKt {
    @SinceKotlin
    public static <T extends Comparable<? super T>> T maxOf(T a, T b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return a.compareTo(b) >= 0 ? a : b;
    }

    @SinceKotlin
    public static <T extends Comparable<? super T>> T maxOf(T a, T b, T c) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(c, "c");
        return (T) maxOf(a, maxOf(b, c));
    }

    @SinceKotlin
    public static int maxOf(int i, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i2 : other) {
            i = Math.max(i, i2);
        }
        return i;
    }

    @SinceKotlin
    public static float maxOf(float f, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f2 : other) {
            f = Math.max(f, f2);
        }
        return f;
    }

    @SinceKotlin
    public static <T extends Comparable<? super T>> T minOf(T a, T b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return a.compareTo(b) <= 0 ? a : b;
    }

    @SinceKotlin
    public static float minOf(float f, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f2 : other) {
            f = Math.min(f, f2);
        }
        return f;
    }
}
