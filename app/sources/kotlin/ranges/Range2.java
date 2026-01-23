package kotlin.ranges;

import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Range.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0016R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u000e"}, m3636d2 = {"Lkotlin/ranges/ClosedRange;", "T", "", "", "start", "getStart", "()Ljava/lang/Comparable;", "endInclusive", "getEndInclusive", "contains", "", "value", "(Ljava/lang/Comparable;)Z", "isEmpty", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlin.ranges.ClosedRange, reason: use source file name */
/* loaded from: classes21.dex */
public interface Range2<T extends Comparable<? super T>> {
    boolean contains(T value);

    T getEndInclusive();

    T getStart();

    boolean isEmpty();

    /* compiled from: Range.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: kotlin.ranges.ClosedRange$DefaultImpls */
    /* loaded from: classes14.dex */
    public static final class DefaultImpls {
        public static <T extends Comparable<? super T>> boolean contains(Range2<T> range2, T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.compareTo(range2.getStart()) >= 0 && value.compareTo(range2.getEndInclusive()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean isEmpty(Range2<T> range2) {
            return range2.getStart().compareTo(range2.getEndInclusive()) > 0;
        }
    }
}
