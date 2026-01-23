package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.internal.format.FieldFormatDirective3;

/* compiled from: LocalDateFormat.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lkotlinx/datetime/format/MonthNameDirective;", "Lkotlinx/datetime/internal/format/NamedUnsignedIntFieldFormatDirective;", "Lkotlinx/datetime/format/DateFieldContainer;", "Lkotlinx/datetime/format/MonthNames;", "names", "<init>", "(Lkotlinx/datetime/format/MonthNames;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/datetime/format/MonthNames;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
final class MonthNameDirective extends FieldFormatDirective3<DateFieldContainer> {
    private final MonthNames names;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonthNameDirective(MonthNames names) {
        super(DateFields.INSTANCE.getMonth(), names.getNames(), "monthName");
        Intrinsics.checkNotNullParameter(names, "names");
        this.names = names;
    }

    public boolean equals(Object other) {
        return (other instanceof MonthNameDirective) && Intrinsics.areEqual(this.names.getNames(), ((MonthNameDirective) other).names.getNames());
    }

    public int hashCode() {
        return this.names.getNames().hashCode();
    }
}
