package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.UtcOffsetJvm;
import kotlinx.datetime.format.AbstractWithOffsetBuilder;
import kotlinx.datetime.format.DateTimeFormatBuilder;
import kotlinx.datetime.format.DateTimeFormatBuilder2;
import kotlinx.datetime.format.LocalDateTimeFormat2;
import kotlinx.datetime.internal.format.Builder2;
import kotlinx.datetime.internal.format.CachedFormatStructure;
import kotlinx.datetime.internal.format.FormatStructure;

/* compiled from: DateTimeComponents.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m3636d2 = {"Lkotlinx/datetime/format/DateTimeComponentsFormat;", "Lkotlinx/datetime/format/AbstractDateTimeFormat;", "Lkotlinx/datetime/format/DateTimeComponents;", "Lkotlinx/datetime/format/DateTimeComponentsContents;", "Lkotlinx/datetime/internal/format/CachedFormatStructure;", "actualFormat", "<init>", "(Lkotlinx/datetime/internal/format/CachedFormatStructure;)V", "intermediate", "valueFromIntermediate", "(Lkotlinx/datetime/format/DateTimeComponentsContents;)Lkotlinx/datetime/format/DateTimeComponents;", "Lkotlinx/datetime/internal/format/CachedFormatStructure;", "getActualFormat", "()Lkotlinx/datetime/internal/format/CachedFormatStructure;", "getEmptyIntermediate", "()Lkotlinx/datetime/format/DateTimeComponentsContents;", "emptyIntermediate", "Builder", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class DateTimeComponentsFormat extends DateTimeFormat2<DateTimeComponents, DateTimeComponentsContents> {
    private final CachedFormatStructure<DateTimeComponentsContents> actualFormat;

    @Override // kotlinx.datetime.format.DateTimeFormat2
    public CachedFormatStructure<DateTimeComponentsContents> getActualFormat() {
        return this.actualFormat;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateTimeComponentsFormat(CachedFormatStructure<? super DateTimeComponentsContents> actualFormat) {
        super(null);
        Intrinsics.checkNotNullParameter(actualFormat, "actualFormat");
        this.actualFormat = actualFormat;
    }

    @Override // kotlinx.datetime.format.DateTimeFormat2
    public DateTimeComponents valueFromIntermediate(DateTimeComponentsContents intermediate) {
        Intrinsics.checkNotNullParameter(intermediate, "intermediate");
        return new DateTimeComponents(intermediate);
    }

    @Override // kotlinx.datetime.format.DateTimeFormat2
    public DateTimeComponentsContents getEmptyIntermediate() {
        return DateTimeComponentsKt.emptyDateTimeComponentsContents;
    }

    /* compiled from: DateTimeComponents.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lkotlinx/datetime/format/DateTimeComponentsFormat$Builder;", "Lkotlinx/datetime/format/AbstractDateTimeFormatBuilder;", "Lkotlinx/datetime/format/DateTimeComponentsContents;", "Lkotlinx/datetime/format/AbstractWithDateTimeBuilder;", "Lkotlinx/datetime/format/AbstractWithOffsetBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTimeComponents;", "Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "actualBuilder", "<init>", "(Lkotlinx/datetime/internal/format/AppendableFormatStructure;)V", "Lkotlinx/datetime/internal/format/FormatStructure;", "", "structure", "", "addFormatStructureForDateTime", "(Lkotlinx/datetime/internal/format/FormatStructure;)V", "Lkotlinx/datetime/format/UtcOffsetFieldContainer;", "addFormatStructureForOffset", "createEmpty", "()Lkotlinx/datetime/format/DateTimeComponentsFormat$Builder;", "Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "getActualBuilder", "()Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Builder implements DateTimeFormatBuilder2<DateTimeComponentsContents, Builder>, LocalDateTimeFormat2, AbstractWithOffsetBuilder, DateTimeFormatBuilder.WithDateTimeComponents {
        private final Builder2<DateTimeComponentsContents> actualBuilder;

        public Builder(Builder2<DateTimeComponentsContents> actualBuilder) {
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

        public CachedFormatStructure<DateTimeComponentsContents> build() {
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

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithDate
        public void dayOfWeek(DayOfWeekNames dayOfWeekNames) {
            LocalDateTimeFormat2.DefaultImpls.dayOfWeek(this, dayOfWeekNames);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder2
        public Builder2<DateTimeComponentsContents> getActualBuilder() {
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
        public void monthName(MonthNames monthNames) {
            LocalDateTimeFormat2.DefaultImpls.monthName(this, monthNames);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithDate
        public void monthNumber(DateTimeFormat3 dateTimeFormat3) {
            LocalDateTimeFormat2.DefaultImpls.monthNumber(this, dateTimeFormat3);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset
        public void offset(DateTimeFormat<UtcOffsetJvm> dateTimeFormat) {
            AbstractWithOffsetBuilder.DefaultImpls.offset(this, dateTimeFormat);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset
        public void offsetHours(DateTimeFormat3 dateTimeFormat3) {
            AbstractWithOffsetBuilder.DefaultImpls.offsetHours(this, dateTimeFormat3);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset
        public void offsetMinutesOfHour(DateTimeFormat3 dateTimeFormat3) {
            AbstractWithOffsetBuilder.DefaultImpls.offsetMinutesOfHour(this, dateTimeFormat3);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset
        public void offsetSecondsOfMinute(DateTimeFormat3 dateTimeFormat3) {
            AbstractWithOffsetBuilder.DefaultImpls.offsetSecondsOfMinute(this, dateTimeFormat3);
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.datetime.format.AbstractWithOffsetBuilder
        public void addFormatStructureForOffset(FormatStructure<? super UtcOffsetFieldContainer> structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            getActualBuilder().add(structure);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder2
        public Builder createEmpty() {
            return new Builder(new Builder2());
        }
    }
}
