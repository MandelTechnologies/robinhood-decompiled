package kotlinx.datetime.internal.format;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.internal.format.formatter.Formatter4;
import kotlinx.datetime.internal.format.parser.Parser6;

/* compiled from: FormatStructure.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lkotlinx/datetime/internal/format/CachedFormatStructure;", "T", "Lkotlinx/datetime/internal/format/ConcatenatedFormatStructure;", "formats", "", "Lkotlinx/datetime/internal/format/NonConcatenatedFormatStructure;", "(Ljava/util/List;)V", "cachedFormatter", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "cachedParser", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "formatter", "parser", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class CachedFormatStructure<T> extends ConcatenatedFormatStructure<T> {
    private final Formatter4<T> cachedFormatter;
    private final Parser6<T> cachedParser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedFormatStructure(List<? extends NonConcatenatedFormatStructure<? super T>> formats) {
        super(formats);
        Intrinsics.checkNotNullParameter(formats, "formats");
        this.cachedFormatter = super.formatter();
        this.cachedParser = super.parser();
    }

    @Override // kotlinx.datetime.internal.format.ConcatenatedFormatStructure, kotlinx.datetime.internal.format.FormatStructure
    public Formatter4<T> formatter() {
        return this.cachedFormatter;
    }

    @Override // kotlinx.datetime.internal.format.ConcatenatedFormatStructure, kotlinx.datetime.internal.format.FormatStructure
    public Parser6<T> parser() {
        return this.cachedParser;
    }
}
