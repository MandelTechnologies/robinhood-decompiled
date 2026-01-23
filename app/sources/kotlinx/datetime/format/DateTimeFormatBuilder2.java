package kotlinx.datetime.format;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.format.DateTimeFormatBuilder2;
import kotlinx.datetime.internal.format.AlternativesParsing;
import kotlinx.datetime.internal.format.Builder2;
import kotlinx.datetime.internal.format.CachedFormatStructure;
import kotlinx.datetime.internal.format.ConstantFormatStructure;
import kotlinx.datetime.internal.format.Optional;

/* compiled from: DateTimeFormatBuilder.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0014\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u00020\u0003J\u000f\u0010\u0004\u001a\u00028\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J^\u0010\f\u001a\u00020\b24\u0010\n\u001a\u001b\u0012\u0017\b\u0001\u0012\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t0\u0006\"\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0016¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m3636d2 = {"Lkotlinx/datetime/format/AbstractDateTimeFormatBuilder;", "Target", "ActualSelf", "Lkotlinx/datetime/format/DateTimeFormatBuilder;", "createEmpty", "()Lkotlinx/datetime/format/AbstractDateTimeFormatBuilder;", "", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "otherFormats", "mainFormat", "appendAlternativeParsingImpl", "([Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "onZero", "format", "appendOptionalImpl", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "getActualBuilder", "()Lkotlinx/datetime/internal/format/AppendableFormatStructure;", "actualBuilder", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.format.AbstractDateTimeFormatBuilder, reason: use source file name */
/* loaded from: classes14.dex */
public interface DateTimeFormatBuilder2<Target, ActualSelf extends DateTimeFormatBuilder2<Target, ActualSelf>> extends DateTimeFormatBuilder {
    void appendAlternativeParsingImpl(Function1<? super ActualSelf, Unit>[] otherFormats, Function1<? super ActualSelf, Unit> mainFormat);

    void appendOptionalImpl(String onZero, Function1<? super ActualSelf, Unit> format2);

    ActualSelf createEmpty();

    Builder2<Target> getActualBuilder();

    /* compiled from: DateTimeFormatBuilder.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: kotlinx.datetime.format.AbstractDateTimeFormatBuilder$DefaultImpls */
    public static final class DefaultImpls {
        public static <Target, ActualSelf extends DateTimeFormatBuilder2<Target, ActualSelf>> void appendOptionalImpl(DateTimeFormatBuilder2<Target, ActualSelf> dateTimeFormatBuilder2, String onZero, Function1<? super ActualSelf, Unit> format2) {
            Intrinsics.checkNotNullParameter(onZero, "onZero");
            Intrinsics.checkNotNullParameter(format2, "format");
            Builder2<Target> actualBuilder = dateTimeFormatBuilder2.getActualBuilder();
            DateTimeFormatBuilder2 dateTimeFormatBuilder2CreateEmpty = dateTimeFormatBuilder2.createEmpty();
            format2.invoke(dateTimeFormatBuilder2CreateEmpty);
            Unit unit = Unit.INSTANCE;
            actualBuilder.add(new Optional(onZero, dateTimeFormatBuilder2CreateEmpty.getActualBuilder().build()));
        }

        public static <Target, ActualSelf extends DateTimeFormatBuilder2<Target, ActualSelf>> void chars(DateTimeFormatBuilder2<Target, ActualSelf> dateTimeFormatBuilder2, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            dateTimeFormatBuilder2.getActualBuilder().add(new ConstantFormatStructure(value));
        }

        public static <Target, ActualSelf extends DateTimeFormatBuilder2<Target, ActualSelf>> CachedFormatStructure<Target> build(DateTimeFormatBuilder2<Target, ActualSelf> dateTimeFormatBuilder2) {
            return new CachedFormatStructure<>(dateTimeFormatBuilder2.getActualBuilder().build().getFormats());
        }

        public static <Target, ActualSelf extends DateTimeFormatBuilder2<Target, ActualSelf>> void appendAlternativeParsingImpl(DateTimeFormatBuilder2<Target, ActualSelf> dateTimeFormatBuilder2, Function1<? super ActualSelf, Unit>[] otherFormats, Function1<? super ActualSelf, Unit> mainFormat) {
            Intrinsics.checkNotNullParameter(otherFormats, "otherFormats");
            Intrinsics.checkNotNullParameter(mainFormat, "mainFormat");
            ArrayList arrayList = new ArrayList(otherFormats.length);
            for (Function1<? super ActualSelf, Unit> function1 : otherFormats) {
                DateTimeFormatBuilder2 dateTimeFormatBuilder2CreateEmpty = dateTimeFormatBuilder2.createEmpty();
                function1.invoke(dateTimeFormatBuilder2CreateEmpty);
                arrayList.add(dateTimeFormatBuilder2CreateEmpty.getActualBuilder().build());
            }
            DateTimeFormatBuilder2 dateTimeFormatBuilder2CreateEmpty2 = dateTimeFormatBuilder2.createEmpty();
            mainFormat.invoke(dateTimeFormatBuilder2CreateEmpty2);
            dateTimeFormatBuilder2.getActualBuilder().add(new AlternativesParsing(dateTimeFormatBuilder2CreateEmpty2.getActualBuilder().build(), arrayList));
        }
    }
}
