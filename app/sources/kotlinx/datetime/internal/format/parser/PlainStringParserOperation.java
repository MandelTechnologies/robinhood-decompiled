package kotlinx.datetime.internal.format.parser;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.internal.UtilKt;

/* compiled from: ParserOperation.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J-\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, m3636d2 = {"Lkotlinx/datetime/internal/format/parser/PlainStringParserOperation;", "Output", "Lkotlinx/datetime/internal/format/parser/ParserOperation;", "string", "", "(Ljava/lang/String;)V", "getString", "()Ljava/lang/String;", "consume", "Lkotlinx/datetime/internal/format/parser/ParseResult;", PlaceTypes.STORAGE, "input", "", "startIndex", "", "consume-FANa98k", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "toString", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class PlainStringParserOperation<Output> implements ParserOperation<Output> {
    private final String string;

    public PlainStringParserOperation(String string2) {
        Intrinsics.checkNotNullParameter(string2, "string");
        this.string = string2;
        if (string2.length() <= 0) {
            throw new IllegalArgumentException("Empty string is not allowed");
        }
        if (UtilKt.isAsciiDigit(string2.charAt(0))) {
            throw new IllegalArgumentException(("String '" + string2 + "' starts with a digit").toString());
        }
        if (UtilKt.isAsciiDigit(string2.charAt(string2.length() - 1))) {
            throw new IllegalArgumentException(("String '" + string2 + "' ends with a digit").toString());
        }
    }

    public final String getString() {
        return this.string;
    }

    @Override // kotlinx.datetime.internal.format.parser.ParserOperation
    /* renamed from: consume-FANa98k */
    public Object mo28854consumeFANa98k(Output storage, final CharSequence input, final int startIndex) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.string.length() + startIndex > input.length()) {
            return ParseResult.INSTANCE.m28857ErrorRg3Co2E(startIndex, new Function0<String>(this) { // from class: kotlinx.datetime.internal.format.parser.PlainStringParserOperation$consume$1
                final /* synthetic */ PlainStringParserOperation<Output> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Unexpected end of input: yet to parse '" + this.this$0.getString() + '\'';
                }
            });
        }
        int length = this.string.length();
        for (final int i = 0; i < length; i++) {
            if (input.charAt(startIndex + i) != this.string.charAt(i)) {
                return ParseResult.INSTANCE.m28857ErrorRg3Co2E(startIndex, new Function0<String>(this) { // from class: kotlinx.datetime.internal.format.parser.PlainStringParserOperation$consume$2
                    final /* synthetic */ PlainStringParserOperation<Output> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.this$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected ");
                        sb.append(this.this$0.getString());
                        sb.append(" but got ");
                        CharSequence charSequence = input;
                        int i2 = startIndex;
                        sb.append(charSequence.subSequence(i2, i + i2 + 1).toString());
                        return sb.toString();
                    }
                });
            }
        }
        return ParseResult.INSTANCE.m28858OkQi1bsqg(startIndex + this.string.length());
    }

    public String toString() {
        return '\'' + this.string + '\'';
    }
}
