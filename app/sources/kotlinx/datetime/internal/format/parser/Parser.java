package kotlinx.datetime.internal.format.parser;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.internal.format.parser.Parser2;

/* compiled from: Parser.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003:\u0001\u0010B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u0088\u0001\u0005\u0092\u0001\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0011"}, m3636d2 = {"Lkotlinx/datetime/internal/format/parser/Parser;", "Lkotlinx/datetime/internal/format/parser/Copyable;", "Output", "", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "commands", "constructor-impl", "(Lkotlinx/datetime/internal/format/parser/ParserStructure;)Lkotlinx/datetime/internal/format/parser/ParserStructure;", "", "input", "initialContainer", "", "startIndex", "match-impl", "(Lkotlinx/datetime/internal/format/parser/ParserStructure;Ljava/lang/CharSequence;Lkotlinx/datetime/internal/format/parser/Copyable;I)Lkotlinx/datetime/internal/format/parser/Copyable;", "match", "ParserState", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class Parser<Output extends Parser2<Output>> {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <Output extends Parser2<Output>> Parser6<Output> m28859constructorimpl(Parser6<? super Output> commands) {
        Intrinsics.checkNotNullParameter(commands, "commands");
        return commands;
    }

    /* renamed from: match-impl$default, reason: not valid java name */
    public static /* synthetic */ Parser2 m28861matchimpl$default(Parser6 parser6, CharSequence charSequence, Parser2 parser2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m28860matchimpl(parser6, charSequence, parser2, i);
    }

    /* renamed from: match-impl, reason: not valid java name */
    public static final Output m28860matchimpl(Parser6<? super Output> parser6, CharSequence input, Output initialContainer, int i) throws Parser3 {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(initialContainer, "initialContainer");
        ArrayList arrayList = new ArrayList();
        List listMutableListOf = CollectionsKt.mutableListOf(new ParserState(initialContainer, parser6, i));
        while (true) {
            ParserState parserState = (ParserState) CollectionsKt.removeLastOrNull(listMutableListOf);
            if (parserState != null) {
                Output output = (Output) ((Parser2) parserState.getOutput()).copy();
                int inputPosition = parserState.getInputPosition();
                Parser6 parserStructure = parserState.getParserStructure();
                int size = parserStructure.getOperations().size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        Object objMo28854consumeFANa98k = ((ParserOperation) parserStructure.getOperations().get(i2)).mo28854consumeFANa98k(output, input, inputPosition);
                        if (objMo28854consumeFANa98k instanceof Integer) {
                            inputPosition = ((Number) objMo28854consumeFANa98k).intValue();
                            i2++;
                        } else {
                            if (!(objMo28854consumeFANa98k instanceof ParseResult2)) {
                                throw new IllegalStateException(("Unexpected parse result: " + objMo28854consumeFANa98k).toString());
                            }
                            arrayList.add((ParseResult2) objMo28854consumeFANa98k);
                        }
                    } else if (parserStructure.getFollowedBy().isEmpty()) {
                        if (inputPosition == input.length()) {
                            return output;
                        }
                        arrayList.add(new ParseResult2(inputPosition, new Function0<String>() { // from class: kotlinx.datetime.internal.format.parser.Parser$parse$1$3
                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "There is more input to consume";
                            }
                        }));
                    } else {
                        int size2 = parserStructure.getFollowedBy().size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i3 = size2 - 1;
                                listMutableListOf.add(new ParserState(output, (Parser6) parserStructure.getFollowedBy().get(size2), inputPosition));
                                if (i3 < 0) {
                                    break;
                                }
                                size2 = i3;
                            }
                        }
                    }
                }
            } else {
                if (arrayList.size() > 1) {
                    CollectionsKt.sortWith(arrayList, new Comparator() { // from class: kotlinx.datetime.internal.format.parser.Parser$match-impl$$inlined$sortByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(Integer.valueOf(((ParseResult2) t2).getPosition()), Integer.valueOf(((ParseResult2) t).getPosition()));
                        }
                    });
                }
                throw new Parser3(arrayList);
            }
        }
    }

    /* compiled from: Parser.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lkotlinx/datetime/internal/format/parser/Parser$ParserState;", "Output", "", "output", "parserStructure", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "inputPosition", "", "(Ljava/lang/Object;Lkotlinx/datetime/internal/format/parser/ParserStructure;I)V", "getInputPosition", "()I", "getOutput", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getParserStructure", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class ParserState<Output> {
        private final int inputPosition;
        private final Output output;
        private final Parser6<Output> parserStructure;

        /* JADX WARN: Multi-variable type inference failed */
        public ParserState(Output output, Parser6<? super Output> parserStructure, int i) {
            Intrinsics.checkNotNullParameter(parserStructure, "parserStructure");
            this.output = output;
            this.parserStructure = parserStructure;
            this.inputPosition = i;
        }

        public final Output getOutput() {
            return this.output;
        }

        public final Parser6<Output> getParserStructure() {
            return this.parserStructure;
        }

        public final int getInputPosition() {
            return this.inputPosition;
        }
    }
}
