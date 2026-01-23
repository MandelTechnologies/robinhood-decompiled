package kotlinx.datetime.internal.format.formatter;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Formatter.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lkotlinx/datetime/internal/format/formatter/ConcatenatedFormatter;", "T", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "", "formatters", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.internal.format.formatter.ConcatenatedFormatter, reason: use source file name */
/* loaded from: classes14.dex */
public final class Formatter2<T> implements Formatter4<T> {
    private final List<Formatter4<T>> formatters;

    /* JADX WARN: Multi-variable type inference failed */
    public Formatter2(List<? extends Formatter4<? super T>> formatters) {
        Intrinsics.checkNotNullParameter(formatters, "formatters");
        this.formatters = formatters;
    }
}
