package kotlinx.datetime.internal.format.parser;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Parser.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lkotlinx/datetime/internal/format/parser/ParseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errors", "", "Lkotlinx/datetime/internal/format/parser/ParseError;", "(Ljava/util/List;)V", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.internal.format.parser.ParseException, reason: use source file name */
/* loaded from: classes14.dex */
public final class Parser3 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Parser3(List<ParseResult2> errors) {
        super(Parser5.formatError(errors));
        Intrinsics.checkNotNullParameter(errors, "errors");
    }
}
