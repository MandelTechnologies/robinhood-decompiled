package kotlinx.datetime.format;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.format.DateTimeFormatBuilder;

/* compiled from: LocalDateFormat.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"T", "field", "", "name", "requireParsedField", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalDate;", "ISO_DATE$delegate", "Lkotlin/Lazy;", "getISO_DATE", "()Lkotlinx/datetime/format/DateTimeFormat;", "ISO_DATE", "ISO_DATE_BASIC$delegate", "getISO_DATE_BASIC", "ISO_DATE_BASIC", "Lkotlinx/datetime/format/IncompleteLocalDate;", "emptyIncompleteLocalDate", "Lkotlinx/datetime/format/IncompleteLocalDate;", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class LocalDateFormatKt {
    private static final Lazy ISO_DATE$delegate = LazyKt.lazy(new Function0<DateTimeFormat<LocalDate>>() { // from class: kotlinx.datetime.format.LocalDateFormatKt$ISO_DATE$2
        @Override // kotlin.jvm.functions.Function0
        public final DateTimeFormat<LocalDate> invoke() {
            return LocalDateFormat.Companion.build(new Function1<DateTimeFormatBuilder.WithDate, Unit>() { // from class: kotlinx.datetime.format.LocalDateFormatKt$ISO_DATE$2.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDate withDate) {
                    invoke2(withDate);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DateTimeFormatBuilder.WithDate build) {
                    Intrinsics.checkNotNullParameter(build, "$this$build");
                    DateTimeFormatBuilder.WithDate.DefaultImpls.year$default(build, null, 1, null);
                    DateTimeFormatBuilder3.m28853char(build, '-');
                    DateTimeFormatBuilder.WithDate.DefaultImpls.monthNumber$default(build, null, 1, null);
                    DateTimeFormatBuilder3.m28853char(build, '-');
                    DateTimeFormatBuilder.WithDate.DefaultImpls.dayOfMonth$default(build, null, 1, null);
                }
            });
        }
    });
    private static final Lazy ISO_DATE_BASIC$delegate = LazyKt.lazy(new Function0<DateTimeFormat<LocalDate>>() { // from class: kotlinx.datetime.format.LocalDateFormatKt$ISO_DATE_BASIC$2
        @Override // kotlin.jvm.functions.Function0
        public final DateTimeFormat<LocalDate> invoke() {
            return LocalDateFormat.Companion.build(new Function1<DateTimeFormatBuilder.WithDate, Unit>() { // from class: kotlinx.datetime.format.LocalDateFormatKt$ISO_DATE_BASIC$2.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DateTimeFormatBuilder.WithDate withDate) {
                    invoke2(withDate);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DateTimeFormatBuilder.WithDate build) {
                    Intrinsics.checkNotNullParameter(build, "$this$build");
                    DateTimeFormatBuilder.WithDate.DefaultImpls.year$default(build, null, 1, null);
                    DateTimeFormatBuilder.WithDate.DefaultImpls.monthNumber$default(build, null, 1, null);
                    DateTimeFormatBuilder.WithDate.DefaultImpls.dayOfMonth$default(build, null, 1, null);
                }
            });
        }
    });
    private static final IncompleteLocalDate emptyIncompleteLocalDate = new IncompleteLocalDate(null, null, null, null, null, 31, null);

    public static final <T> T requireParsedField(T t, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (t != null) {
            return t;
        }
        throw new DateTimeFormatException("Can not create a " + name + " from the given input: the field " + name + " is missing");
    }

    public static final DateTimeFormat<LocalDate> getISO_DATE() {
        return (DateTimeFormat) ISO_DATE$delegate.getValue();
    }

    public static final DateTimeFormat<LocalDate> getISO_DATE_BASIC() {
        return (DateTimeFormat) ISO_DATE_BASIC$delegate.getValue();
    }
}
