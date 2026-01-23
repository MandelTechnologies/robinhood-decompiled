package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.UtcOffsetJvm;
import kotlinx.datetime.format.AbstractWithOffsetBuilder;
import kotlinx.datetime.format.DateTimeFormatBuilder;
import kotlinx.datetime.format.DateTimeFormatBuilder2;
import kotlinx.datetime.internal.format.Builder2;
import kotlinx.datetime.internal.format.CachedFormatStructure;
import kotlinx.datetime.internal.format.FormatStructure;

/* compiled from: UtcOffsetFormat.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0012B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lkotlinx/datetime/format/UtcOffsetFormat;", "Lkotlinx/datetime/format/AbstractDateTimeFormat;", "Lkotlinx/datetime/UtcOffset;", "Lkotlinx/datetime/format/IncompleteUtcOffset;", "Lkotlinx/datetime/internal/format/CachedFormatStructure;", "Lkotlinx/datetime/format/UtcOffsetFieldContainer;", "actualFormat", "<init>", "(Lkotlinx/datetime/internal/format/CachedFormatStructure;)V", "intermediate", "valueFromIntermediate", "(Lkotlinx/datetime/format/IncompleteUtcOffset;)Lkotlinx/datetime/UtcOffset;", "Lkotlinx/datetime/internal/format/CachedFormatStructure;", "getActualFormat", "()Lkotlinx/datetime/internal/format/CachedFormatStructure;", "getEmptyIntermediate", "()Lkotlinx/datetime/format/IncompleteUtcOffset;", "emptyIntermediate", "Companion", "Builder", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class UtcOffsetFormat extends DateTimeFormat2<UtcOffsetJvm, IncompleteUtcOffset> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CachedFormatStructure<UtcOffsetFieldContainer> actualFormat;

    @Override // kotlinx.datetime.format.DateTimeFormat2
    public CachedFormatStructure<UtcOffsetFieldContainer> getActualFormat() {
        return this.actualFormat;
    }

    /* compiled from: UtcOffsetFormat.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lkotlinx/datetime/format/UtcOffsetFormat$Companion;", "", "()V", "build", "Lkotlinx/datetime/format/UtcOffsetFormat;", "block", "Lkotlin/Function1;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;", "", "Lkotlin/ExtensionFunctionType;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UtcOffsetFormat build(Function1<? super DateTimeFormatBuilder.WithUtcOffset, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Builder builder = new Builder(new Builder2());
            block.invoke(builder);
            return new UtcOffsetFormat(builder.build());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UtcOffsetFormat(CachedFormatStructure<? super UtcOffsetFieldContainer> actualFormat) {
        super(null);
        Intrinsics.checkNotNullParameter(actualFormat, "actualFormat");
        this.actualFormat = actualFormat;
    }

    /* compiled from: UtcOffsetFormat.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m3636d2 = {"Lkotlinx/datetime/format/UtcOffsetFormat$Builder;", "Lkotlinx/datetime/format/AbstractDateTimeFormatBuilder;", "Lkotlinx/datetime/format/UtcOffsetFieldContainer;", "Lkotlinx/datetime/format/AbstractWithOffsetBuilder;", "actualBuilder", "Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "(Lkotlinx/datetime/internal/format/AppendableFormatStructure;)V", "getActualBuilder", "()Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "addFormatStructureForOffset", "", "structure", "Lkotlinx/datetime/internal/format/FormatStructure;", "createEmpty", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Builder implements DateTimeFormatBuilder2<UtcOffsetFieldContainer, Builder>, AbstractWithOffsetBuilder {
        private final Builder2<UtcOffsetFieldContainer> actualBuilder;

        public Builder(Builder2<UtcOffsetFieldContainer> actualBuilder) {
            Intrinsics.checkNotNullParameter(actualBuilder, "actualBuilder");
            this.actualBuilder = actualBuilder;
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder2
        public void appendAlternativeParsingImpl(Function1<? super Builder, Unit>[] function1Arr, Function1<? super Builder, Unit> function1) {
            DateTimeFormatBuilder2.DefaultImpls.appendAlternativeParsingImpl(this, function1Arr, function1);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder2
        public void appendOptionalImpl(String str, Function1<? super Builder, Unit> function1) {
            DateTimeFormatBuilder2.DefaultImpls.appendOptionalImpl(this, str, function1);
        }

        public CachedFormatStructure<UtcOffsetFieldContainer> build() {
            return DateTimeFormatBuilder2.DefaultImpls.build(this);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder
        public void chars(String str) {
            DateTimeFormatBuilder2.DefaultImpls.chars(this, str);
        }

        @Override // kotlinx.datetime.format.DateTimeFormatBuilder2
        public Builder2<UtcOffsetFieldContainer> getActualBuilder() {
            return this.actualBuilder;
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

    @Override // kotlinx.datetime.format.DateTimeFormat2
    public UtcOffsetJvm valueFromIntermediate(IncompleteUtcOffset intermediate) {
        Intrinsics.checkNotNullParameter(intermediate, "intermediate");
        return intermediate.toUtcOffset();
    }

    @Override // kotlinx.datetime.format.DateTimeFormat2
    public IncompleteUtcOffset getEmptyIntermediate() {
        return UtcOffsetFormatKt.emptyIncompleteUtcOffset;
    }
}
