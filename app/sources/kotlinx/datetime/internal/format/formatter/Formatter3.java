package kotlinx.datetime.internal.format.formatter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Formatter.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B8\u0012/\u0010\b\u001a+\u0012'\u0012%\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00040\u0003¢\u0006\u0004\b\t\u0010\nR=\u0010\b\u001a+\u0012'\u0012%\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lkotlinx/datetime/internal/format/formatter/ConditionalFormatter;", "T", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "", "Lkotlin/Pair;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "formatters", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.internal.format.formatter.ConditionalFormatter, reason: use source file name */
/* loaded from: classes14.dex */
public final class Formatter3<T> implements Formatter4<T> {
    private final List<Tuples2<Function1<T, Boolean>, Formatter4<T>>> formatters;

    /* JADX WARN: Multi-variable type inference failed */
    public Formatter3(List<? extends Tuples2<? extends Function1<? super T, Boolean>, ? extends Formatter4<? super T>>> formatters) {
        Intrinsics.checkNotNullParameter(formatters, "formatters");
        this.formatters = formatters;
    }
}
