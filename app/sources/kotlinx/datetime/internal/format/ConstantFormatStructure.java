package kotlinx.datetime.internal.format;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.datetime.internal.UtilKt;
import kotlinx.datetime.internal.format.formatter.Formatter4;
import kotlinx.datetime.internal.format.formatter.FormatterOperation;
import kotlinx.datetime.internal.format.parser.NumberConsumer2;
import kotlinx.datetime.internal.format.parser.NumberSpanParserOperation;
import kotlinx.datetime.internal.format.parser.Parser6;
import kotlinx.datetime.internal.format.parser.PlainStringParserOperation;

/* compiled from: FormatStructure.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lkotlinx/datetime/internal/format/ConstantFormatStructure;", "T", "Lkotlinx/datetime/internal/format/NonConcatenatedFormatStructure;", "", "string", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Ljava/lang/String;", "getString", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ConstantFormatStructure<T> implements NonConcatenatedFormatStructure<T> {
    private final String string;

    public ConstantFormatStructure(String string2) {
        Intrinsics.checkNotNullParameter(string2, "string");
        this.string = string2;
    }

    public String toString() {
        return "ConstantFormatStructure(" + this.string + ')';
    }

    public boolean equals(Object other) {
        return (other instanceof ConstantFormatStructure) && Intrinsics.areEqual(this.string, ((ConstantFormatStructure) other).string);
    }

    public int hashCode() {
        return this.string.hashCode();
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public Parser6<T> parser() {
        String strSubstring;
        List listBuild;
        if (this.string.length() == 0) {
            listBuild = CollectionsKt.emptyList();
        } else {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            String strSubstring2 = "";
            if (UtilKt.isAsciiDigit(this.string.charAt(0))) {
                String strSubstring3 = this.string;
                int length = strSubstring3.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (!UtilKt.isAsciiDigit(strSubstring3.charAt(i))) {
                        strSubstring3 = strSubstring3.substring(0, i);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        break;
                    }
                    i++;
                }
                listCreateListBuilder.add(new NumberSpanParserOperation(CollectionsKt.listOf(new NumberConsumer2(strSubstring3))));
                String str = this.string;
                int length2 = str.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        strSubstring = "";
                        break;
                    }
                    if (!UtilKt.isAsciiDigit(str.charAt(i2))) {
                        strSubstring = str.substring(i2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        break;
                    }
                    i2++;
                }
            } else {
                strSubstring = this.string;
            }
            if (strSubstring.length() > 0) {
                if (!UtilKt.isAsciiDigit(strSubstring.charAt(strSubstring.length() - 1))) {
                    listCreateListBuilder.add(new PlainStringParserOperation(strSubstring));
                } else {
                    int lastIndex = StringsKt.getLastIndex(strSubstring);
                    while (true) {
                        if (-1 >= lastIndex) {
                            break;
                        }
                        if (!UtilKt.isAsciiDigit(strSubstring.charAt(lastIndex))) {
                            strSubstring2 = strSubstring.substring(0, lastIndex + 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                            break;
                        }
                        lastIndex--;
                    }
                    listCreateListBuilder.add(new PlainStringParserOperation(strSubstring2));
                    int lastIndex2 = StringsKt.getLastIndex(strSubstring);
                    while (true) {
                        if (-1 >= lastIndex2) {
                            break;
                        }
                        if (!UtilKt.isAsciiDigit(strSubstring.charAt(lastIndex2))) {
                            strSubstring = strSubstring.substring(lastIndex2 + 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                            break;
                        }
                        lastIndex2--;
                    }
                    listCreateListBuilder.add(new NumberSpanParserOperation(CollectionsKt.listOf(new NumberConsumer2(strSubstring))));
                }
            }
            listBuild = CollectionsKt.build(listCreateListBuilder);
        }
        return new Parser6<>(listBuild, CollectionsKt.emptyList());
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public Formatter4<T> formatter() {
        return new FormatterOperation(this.string);
    }
}
