package kotlin.ranges;

import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Range.kt */
@SinceKotlin
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, m3636d2 = {"Lkotlin/ranges/OpenEndRange;", "", "T", "", "value", "", "contains", "(Ljava/lang/Comparable;)Z", "getStart", "()Ljava/lang/Comparable;", "start", "getEndExclusive", "endExclusive", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@WasExperimental
/* renamed from: kotlin.ranges.OpenEndRange, reason: use source file name */
/* loaded from: classes21.dex */
public interface Range3<T extends Comparable<? super T>> {
    boolean contains(T value);

    T getEndExclusive();

    T getStart();

    /* compiled from: Range.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: kotlin.ranges.OpenEndRange$DefaultImpls */
    /* loaded from: classes14.dex */
    public static final class DefaultImpls {
        public static <T extends Comparable<? super T>> boolean contains(Range3<T> range3, T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.compareTo(range3.getStart()) >= 0 && value.compareTo(range3.getEndExclusive()) < 0;
        }

        public static <T extends Comparable<? super T>> boolean isEmpty(Range3<T> range3) {
            return range3.getStart().compareTo(range3.getEndExclusive()) >= 0;
        }
    }
}
