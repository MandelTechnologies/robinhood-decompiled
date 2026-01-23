package kotlinx.datetime.internal.format.formatter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Formatter.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\n"}, m3636d2 = {"Lkotlinx/datetime/internal/format/formatter/SpacePaddedFormatter;", "T", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "", "padding", "<init>", "(Lkotlinx/datetime/internal/format/formatter/FormatterStructure;I)V", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "I", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.datetime.internal.format.formatter.SpacePaddedFormatter, reason: use source file name */
/* loaded from: classes14.dex */
public final class Formatter6<T> implements Formatter4<T> {
    private final Formatter4<T> formatter;
    private final int padding;

    /* JADX WARN: Multi-variable type inference failed */
    public Formatter6(Formatter4<? super T> formatter, int i) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.formatter = formatter;
        this.padding = i;
    }
}
