package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.internal.format.FieldFormatDirective4;

/* compiled from: LocalDateFormat.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lkotlinx/datetime/format/YearDirective;", "Lkotlinx/datetime/internal/format/SignedIntFieldFormatDirective;", "Lkotlinx/datetime/format/DateFieldContainer;", "Lkotlinx/datetime/format/Padding;", "padding", "", "isYearOfEra", "<init>", "(Lkotlinx/datetime/format/Padding;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/datetime/format/Padding;", "Z", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
final class YearDirective extends FieldFormatDirective4<DateFieldContainer> {
    private final boolean isYearOfEra;
    private final DateTimeFormat3 padding;

    public /* synthetic */ YearDirective(DateTimeFormat3 dateTimeFormat3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dateTimeFormat3, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YearDirective(DateTimeFormat3 padding, boolean z) {
        super(DateFields.INSTANCE.getYear(), Integer.valueOf(padding != DateTimeFormat3.ZERO ? 1 : 4), null, padding == DateTimeFormat3.SPACE ? 4 : null, 4);
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.padding = padding;
        this.isYearOfEra = z;
    }

    public boolean equals(Object other) {
        if (!(other instanceof YearDirective)) {
            return false;
        }
        YearDirective yearDirective = (YearDirective) other;
        return this.padding == yearDirective.padding && this.isYearOfEra == yearDirective.isYearOfEra;
    }

    public int hashCode() {
        return (this.padding.hashCode() * 31) + Boolean.hashCode(this.isYearOfEra);
    }
}
