package kotlinx.datetime.internal.format.formatter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Formatter.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B6\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR%\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lkotlinx/datetime/internal/format/formatter/SignedFormatter;", "T", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "allSubFormatsNegative", "alwaysOutputSign", "<init>", "(Lkotlinx/datetime/internal/format/formatter/FormatterStructure;Lkotlin/jvm/functions/Function1;Z)V", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlin/jvm/functions/Function1;", "Z", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.datetime.internal.format.formatter.SignedFormatter, reason: use source file name */
/* loaded from: classes14.dex */
public final class Formatter5<T> implements Formatter4<T> {
    private final Function1<T, Boolean> allSubFormatsNegative;
    private final boolean alwaysOutputSign;
    private final Formatter4<T> formatter;

    /* JADX WARN: Multi-variable type inference failed */
    public Formatter5(Formatter4<? super T> formatter, Function1<? super T, Boolean> allSubFormatsNegative, boolean z) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(allSubFormatsNegative, "allSubFormatsNegative");
        this.formatter = formatter;
        this.allSubFormatsNegative = allSubFormatsNegative;
        this.alwaysOutputSign = z;
    }
}
