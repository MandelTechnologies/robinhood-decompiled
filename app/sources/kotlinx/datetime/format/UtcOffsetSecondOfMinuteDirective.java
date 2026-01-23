package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.internal.format.FieldFormatDirective6;

/* compiled from: UtcOffsetFormat.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lkotlinx/datetime/format/UtcOffsetSecondOfMinuteDirective;", "Lkotlinx/datetime/internal/format/UnsignedIntFieldFormatDirective;", "Lkotlinx/datetime/format/UtcOffsetFieldContainer;", "Lkotlinx/datetime/format/Padding;", "padding", "<init>", "(Lkotlinx/datetime/format/Padding;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/datetime/format/Padding;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
final class UtcOffsetSecondOfMinuteDirective extends FieldFormatDirective6<UtcOffsetFieldContainer> {
    private final DateTimeFormat3 padding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtcOffsetSecondOfMinuteDirective(DateTimeFormat3 padding) {
        super(OffsetFields.INSTANCE.getSecondsOfMinute(), padding == DateTimeFormat3.ZERO ? 2 : 1, padding == DateTimeFormat3.SPACE ? 2 : null);
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.padding = padding;
    }

    public boolean equals(Object other) {
        return (other instanceof UtcOffsetSecondOfMinuteDirective) && this.padding == ((UtcOffsetSecondOfMinuteDirective) other).padding;
    }

    public int hashCode() {
        return this.padding.hashCode();
    }
}
