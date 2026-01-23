package kotlinx.datetime.internal.format.parser;

import com.plaid.internal.EnumC7081g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections._Collections3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Parser.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a$\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0003H\u0000¨\u0006\b"}, m3636d2 = {"formatError", "", "errors", "", "Lkotlinx/datetime/internal/format/parser/ParseError;", "concat", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "T", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.datetime.internal.format.parser.ParserKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Parser5 {
    private static final <T> Parser6<T> concat$append(Parser6<? super T> parser6, Parser6<? super T> parser62) {
        if (parser6.getFollowedBy().isEmpty()) {
            return new Parser6<>(CollectionsKt.plus((Collection) parser6.getOperations(), (Iterable) parser62.getOperations()), parser62.getFollowedBy());
        }
        List<ParserOperation<? super T>> operations2 = parser6.getOperations();
        List<Parser6<? super T>> followedBy = parser6.getFollowedBy();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(followedBy, 10));
        Iterator<T> it = followedBy.iterator();
        while (it.hasNext()) {
            arrayList.add(concat$append((Parser6) it.next(), parser62));
        }
        return new Parser6<>(operations2, arrayList);
    }

    private static final <T> Parser6<T> concat$simplify(Parser6<? super T> parser6, List<UnconditionalModification<T>> list) {
        Parser6 parser62;
        List listListOf;
        ArrayList arrayList = new ArrayList();
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        List mutableList2 = null;
        for (ParserOperation<? super T> parserOperation : parser6.getOperations()) {
            if (parserOperation instanceof NumberSpanParserOperation) {
                if (mutableList2 != null) {
                    mutableList2.addAll(((NumberSpanParserOperation) parserOperation).getConsumers());
                } else {
                    mutableList2 = CollectionsKt.toMutableList((Collection) ((NumberSpanParserOperation) parserOperation).getConsumers());
                }
            } else if (parserOperation instanceof UnconditionalModification) {
                mutableList.add(parserOperation);
            } else {
                if (mutableList2 != null) {
                    arrayList.add(new NumberSpanParserOperation(mutableList2));
                    mutableList2 = null;
                }
                arrayList.add(parserOperation);
            }
        }
        List<Parser6<? super T>> followedBy = parser6.getFollowedBy();
        List arrayList2 = new ArrayList();
        Iterator<T> it = followedBy.iterator();
        while (it.hasNext()) {
            Parser6 parser6Concat$simplify = concat$simplify((Parser6) it.next(), mutableList);
            if (parser6Concat$simplify.getOperations().isEmpty()) {
                List followedBy2 = parser6Concat$simplify.getFollowedBy();
                if (followedBy2.isEmpty()) {
                    followedBy2 = CollectionsKt.listOf(parser6Concat$simplify);
                }
                listListOf = followedBy2;
            } else {
                listListOf = CollectionsKt.listOf(parser6Concat$simplify);
            }
            CollectionsKt.addAll(arrayList2, listListOf);
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = CollectionsKt.listOf(new Parser6(mutableList, CollectionsKt.emptyList()));
        }
        List list2 = arrayList2;
        if (mutableList2 == null) {
            return new Parser6<>(arrayList, list2);
        }
        List<Parser6> list3 = list2;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                ParserOperation parserOperation2 = (ParserOperation) CollectionsKt.firstOrNull(((Parser6) it2.next()).getOperations());
                if (parserOperation2 != null && (parserOperation2 instanceof NumberSpanParserOperation)) {
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    for (Parser6 parser63 : list3) {
                        ParserOperation parserOperation3 = (ParserOperation) CollectionsKt.firstOrNull(parser63.getOperations());
                        if (parserOperation3 instanceof NumberSpanParserOperation) {
                            parser62 = new Parser6(CollectionsKt.plus((Collection) CollectionsKt.listOf(new NumberSpanParserOperation(CollectionsKt.plus((Collection) mutableList2, (Iterable) ((NumberSpanParserOperation) parserOperation3).getConsumers()))), (Iterable) CollectionsKt.drop(parser63.getOperations(), 1)), parser63.getFollowedBy());
                        } else if (parserOperation3 == null) {
                            parser62 = new Parser6(CollectionsKt.listOf(new NumberSpanParserOperation(mutableList2)), parser63.getFollowedBy());
                        } else {
                            parser62 = new Parser6(CollectionsKt.plus((Collection) CollectionsKt.listOf(new NumberSpanParserOperation(mutableList2)), (Iterable) parser63.getOperations()), parser63.getFollowedBy());
                        }
                        arrayList3.add(parser62);
                    }
                    return new Parser6<>(arrayList, arrayList3);
                }
            }
        }
        arrayList.add(new NumberSpanParserOperation(mutableList2));
        return new Parser6<>(arrayList, list2);
    }

    public static final <T> Parser6<T> concat(List<? extends Parser6<? super T>> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Parser6 parser6 = new Parser6(CollectionsKt.emptyList(), CollectionsKt.emptyList());
        if (!list.isEmpty()) {
            ListIterator<? extends Parser6<? super T>> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                parser6 = concat$append(listIterator.previous(), parser6);
            }
        }
        return concat$simplify(parser6, CollectionsKt.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatError(List<ParseResult2> list) {
        if (list.size() == 1) {
            return "Position " + list.get(0).getPosition() + ": " + list.get(0).getMessage().invoke();
        }
        String string2 = ((StringBuilder) _Collections3.joinTo(list, new StringBuilder(list.size() * 33), (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 2) != 0 ? ", " : ", ", (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 4) != 0 ? "" : "Errors: ", (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 8) == 0 ? null : "", (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 16) != 0 ? -1 : 0, (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 32) != 0 ? "..." : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE & 64) != 0 ? null : new Function1<ParseResult2, CharSequence>() { // from class: kotlinx.datetime.internal.format.parser.ParserKt.formatError.1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(ParseResult2 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return "position " + it.getPosition() + ": '" + it.getMessage().invoke() + '\'';
            }
        })).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }
}
