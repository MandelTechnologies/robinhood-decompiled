package kotlin.ranges;

import com.singular.sdk.internal.Constants;
import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.SinceKotlin;

/* compiled from: Ranges.kt */
@SinceKotlin
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"Lkotlin/ranges/ClosedFloatingPointRange;", "T", "", "Lkotlin/ranges/ClosedRange;", "contains", "", "value", "(Ljava/lang/Comparable;)Z", "isEmpty", "lessThanOrEquals", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlin.ranges.ClosedFloatingPointRange, reason: use source file name */
/* loaded from: classes21.dex */
public interface Ranges3<T extends Comparable<? super T>> extends Range2<T> {

    /* compiled from: Ranges.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: kotlin.ranges.ClosedFloatingPointRange$DefaultImpls */
    /* loaded from: classes14.dex */
    public static final class DefaultImpls {
    }

    @Override // kotlin.ranges.Range2
    boolean contains(T value);

    @Override // kotlin.ranges.Range2
    boolean isEmpty();

    boolean lessThanOrEquals(T a, T b);
}
