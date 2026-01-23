package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.internal.format.CachedFormatStructure;
import kotlinx.datetime.internal.format.parser.Parser;
import kotlinx.datetime.internal.format.parser.Parser2;
import kotlinx.datetime.internal.format.parser.Parser3;

/* compiled from: DateTimeFormat.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0005\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lkotlinx/datetime/format/AbstractDateTimeFormat;", "T", "Lkotlinx/datetime/internal/format/parser/Copyable;", "U", "Lkotlinx/datetime/format/DateTimeFormat;", "<init>", "()V", "intermediate", "valueFromIntermediate", "(Lkotlinx/datetime/internal/format/parser/Copyable;)Ljava/lang/Object;", "", "input", "parse", "(Ljava/lang/CharSequence;)Ljava/lang/Object;", "Lkotlinx/datetime/internal/format/CachedFormatStructure;", "getActualFormat", "()Lkotlinx/datetime/internal/format/CachedFormatStructure;", "actualFormat", "getEmptyIntermediate", "()Lkotlinx/datetime/internal/format/parser/Copyable;", "emptyIntermediate", "Lkotlinx/datetime/format/DateTimeComponentsFormat;", "Lkotlinx/datetime/format/LocalDateFormat;", "Lkotlinx/datetime/format/LocalDateTimeFormat;", "Lkotlinx/datetime/format/LocalTimeFormat;", "Lkotlinx/datetime/format/UtcOffsetFormat;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.datetime.format.AbstractDateTimeFormat, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class DateTimeFormat2<T, U extends Parser2<U>> implements DateTimeFormat<T> {
    public /* synthetic */ DateTimeFormat2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract CachedFormatStructure<U> getActualFormat();

    public abstract U getEmptyIntermediate();

    public abstract T valueFromIntermediate(U intermediate);

    private DateTimeFormat2() {
    }

    @Override // kotlinx.datetime.format.DateTimeFormat
    public T parse(CharSequence input) {
        CharSequence charSequence;
        String str;
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            charSequence = input;
        } catch (Parser3 e) {
            e = e;
            charSequence = input;
        }
        try {
            try {
                return valueFromIntermediate(Parser.m28861matchimpl$default(Parser.m28859constructorimpl(getActualFormat().parser()), charSequence, getEmptyIntermediate(), 0, 4, null));
            } catch (IllegalArgumentException e2) {
                String message = e2.getMessage();
                if (message == null) {
                    str = "The value parsed from '" + ((Object) charSequence) + "' is invalid";
                } else {
                    str = message + " (when parsing '" + ((Object) charSequence) + "')";
                }
                throw new DateTimeFormatException(str, e2);
            }
        } catch (Parser3 e3) {
            e = e3;
            throw new DateTimeFormatException("Failed to parse value from '" + ((Object) charSequence) + '\'', e);
        }
    }
}
