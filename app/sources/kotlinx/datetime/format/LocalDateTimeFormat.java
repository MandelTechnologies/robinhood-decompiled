package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.format.DateTimeFormatBuilder;
import kotlinx.datetime.format.DateTimeFormatBuilder2;
import kotlinx.datetime.format.LocalDateTimeFormat2;
import kotlinx.datetime.internal.format.Builder2;
import kotlinx.datetime.internal.format.CachedFormatStructure;
import kotlinx.datetime.internal.format.FormatStructure;

/* compiled from: LocalDateTimeFormat.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0000\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0012B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lkotlinx/datetime/format/LocalDateTimeFormat;", "Lkotlinx/datetime/format/AbstractDateTimeFormat;", "Lkotlinx/datetime/LocalDateTime;", "Lkotlinx/datetime/format/IncompleteLocalDateTime;", "Lkotlinx/datetime/internal/format/CachedFormatStructure;", "", "actualFormat", "<init>", "(Lkotlinx/datetime/internal/format/CachedFormatStructure;)V", "intermediate", "valueFromIntermediate", "(Lkotlinx/datetime/format/IncompleteLocalDateTime;)Lkotlinx/datetime/LocalDateTime;", "Lkotlinx/datetime/internal/format/CachedFormatStructure;", "getActualFormat", "()Lkotlinx/datetime/internal/format/CachedFormatStructure;", "getEmptyIntermediate", "()Lkotlinx/datetime/format/IncompleteLocalDateTime;", "emptyIntermediate", "Companion", "Builder", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class LocalDateTimeFormat extends DateTimeFormat2<LocalDateTime, LocalDateTimeFormat3> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CachedFormatStructure<Object> actualFormat;

    @Override // kotlinx.datetime.format.DateTimeFormat2
    public CachedFormatStructure<Object> getActualFormat() {
        return this.actualFormat;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalDateTimeFormat(CachedFormatStructure<Object> actualFormat) {
        super(null);
        Intrinsics.checkNotNullParameter(actualFormat, "actualFormat");
        this.actualFormat = actualFormat;
    }

    @Override // kotlinx.datetime.format.DateTimeFormat2
    public LocalDateTime valueFromIntermediate(LocalDateTimeFormat3 intermediate) {
        Intrinsics.checkNotNullParameter(intermediate, "intermediate");
        return intermediate.toLocalDateTime();
    }

    @Override // kotlinx.datetime.format.DateTimeFormat2
    public LocalDateTimeFormat3 getEmptyIntermediate() {
        return LocalDateTimeFormat4.emptyIncompleteLocalDateTime;
    }

    /* compiled from: LocalDateTimeFormat.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lkotlinx/datetime/format/LocalDateTimeFormat$Companion;", "", "()V", "build", "Lkotlinx/datetime/format/LocalDateTimeFormat;", "block", "Lkotlin/Function1;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTime;", "", "Lkotlin/ExtensionFunctionType;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LocalDateTimeFormat build(Function1<? super DateTimeFormatBuilder.WithDateTime, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Builder builder = new Builder(new Builder2());
            block.invoke(builder);
            return new LocalDateTimeFormat(builder.build());
        }
    }

    /* compiled from: LocalDateTimeFormat.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lkotlinx/datetime/format/LocalDateTimeFormat$Builder;", "Lkotlinx/datetime/format/AbstractDateTimeFormatBuilder;", "", "Lkotlinx/datetime/format/AbstractWithDateTimeBuilder;", "Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "actualBuilder", "<init>", "(Lkotlinx/datetime/internal/format/AppendableFormatStructure;)V", "Lkotlinx/datetime/internal/format/FormatStructure;", "structure", "", "addFormatStructureForDateTime", "(Lkotlinx/datetime/internal/format/FormatStructure;)V", "createEmpty", "()Lkotlinx/datetime/format/LocalDateTimeFormat$Builder;", "Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "getActualBuilder", "()Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Builder implements DateTimeFormatBuilder2<Object, Builder>, LocalDateTimeFormat2 {
        private final Builder2<Object> actualBuilder;

        public Builder(Builder2<Object> actualBuilder) {
            Intrinsics.checkNotNullParameter(actualBuilder, "actualBuilder");
            this.actualBuilder = actualBuilder;
        }

        @Override // kotlinx.datetime.format.AbstractWithDateBuilder
        public void addFormatStructureForDate(FormatStructure<? super DateFieldContainer> formatStructure) {
            LocalDateTimeFormat2.DefaultImpls.addFormatStructureForDate(this, formatStructure);
        }

        @Override // kotlinx.datetime.format.AbstractWithTimeBuilder
        public void addFormatStructureForTime(FormatStructure<? super TimeFieldContainer> formatStructure) {
            LocalDateTimeFormat2.DefaultImpls.addFormatStructureForTime(this, formatStructure);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder2
        public void appendAlternativeParsingImpl(Function1<? super Builder, Unit>[] function1Arr, Function1<? super Builder, Unit> function1) {
            DateTimeFormatBuilder2.DefaultImpls.appendAlternativeParsingImpl(this, function1Arr, function1);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder2
        public void appendOptionalImpl(String str, Function1<? super Builder, Unit> function1) {
            DateTimeFormatBuilder2.DefaultImpls.appendOptionalImpl(this, str, function1);
        }

        public CachedFormatStructure<Object> build() {
            return DateTimeFormatBuilder2.DefaultImpls.build(this);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder
        public void chars(String str) {
            DateTimeFormatBuilder2.DefaultImpls.chars(this, str);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithDate
        public void date(DateTimeFormat<LocalDate> dateTimeFormat) {
            LocalDateTimeFormat2.DefaultImpls.date(this, dateTimeFormat);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithDate
        public void dayOfMonth(DateTimeFormat3 dateTimeFormat3) {
            LocalDateTimeFormat2.DefaultImpls.dayOfMonth(this, dateTimeFormat3);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder2
        public Builder2<Object> getActualBuilder() {
            return this.actualBuilder;
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithTime
        public void hour(DateTimeFormat3 dateTimeFormat3) {
            LocalDateTimeFormat2.DefaultImpls.hour(this, dateTimeFormat3);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithTime
        public void minute(DateTimeFormat3 dateTimeFormat3) {
            LocalDateTimeFormat2.DefaultImpls.minute(this, dateTimeFormat3);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithDate
        public void monthNumber(DateTimeFormat3 dateTimeFormat3) {
            LocalDateTimeFormat2.DefaultImpls.monthNumber(this, dateTimeFormat3);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithTime
        public void second(DateTimeFormat3 dateTimeFormat3) {
            LocalDateTimeFormat2.DefaultImpls.second(this, dateTimeFormat3);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithTime
        public void secondFraction(int i, int i2) {
            LocalDateTimeFormat2.DefaultImpls.secondFraction(this, i, i2);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithTime
        public void time(DateTimeFormat<LocalTime> dateTimeFormat) {
            LocalDateTimeFormat2.DefaultImpls.time(this, dateTimeFormat);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithDate
        public void year(DateTimeFormat3 dateTimeFormat3) {
            LocalDateTimeFormat2.DefaultImpls.year(this, dateTimeFormat3);
        }

        @Override // kotlinx.datetime.format.LocalDateTimeFormat2
        public void addFormatStructureForDateTime(FormatStructure<Object> structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            getActualBuilder().add(structure);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder2
        public Builder createEmpty() {
            return new Builder(new Builder2());
        }
    }
}
