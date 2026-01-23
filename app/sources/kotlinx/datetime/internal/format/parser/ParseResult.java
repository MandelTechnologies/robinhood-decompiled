package kotlinx.datetime.internal.format.parser;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ParseResult.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0081@\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0088\u0001\u0002\u0092\u0001\u00020\u0001¨\u0006\u0006"}, m3636d2 = {"Lkotlinx/datetime/internal/format/parser/ParseResult;", "", "value", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "Companion", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
/* loaded from: classes14.dex */
public final class ParseResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Object m28856constructorimpl(Object obj) {
        return obj;
    }

    /* compiled from: ParseResult.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, m3636d2 = {"Lkotlinx/datetime/internal/format/parser/ParseResult$Companion;", "", "()V", "Error", "Lkotlinx/datetime/internal/format/parser/ParseResult;", "position", "", "message", "Lkotlin/Function0;", "", "Error-Rg3Co2E", "(ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ok", "indexOfNextUnparsed", "Ok-Qi1bsqg", "(I)Ljava/lang/Object;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: Ok-Qi1bsqg, reason: not valid java name */
        public final Object m28858OkQi1bsqg(int indexOfNextUnparsed) {
            return ParseResult.m28856constructorimpl(Integer.valueOf(indexOfNextUnparsed));
        }

        /* renamed from: Error-Rg3Co2E, reason: not valid java name */
        public final Object m28857ErrorRg3Co2E(int position, Function0<String> message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return ParseResult.m28856constructorimpl(new ParseResult2(position, message));
        }
    }
}
