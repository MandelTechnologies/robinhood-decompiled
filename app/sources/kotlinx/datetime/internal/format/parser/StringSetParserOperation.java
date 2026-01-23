package kotlinx.datetime.internal.format.parser;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.datetime.internal.format.parser.StringSetParserOperation;

/* compiled from: ParserOperation.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0015B/\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ-\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, m3636d2 = {"Lkotlinx/datetime/internal/format/parser/StringSetParserOperation;", "Output", "Lkotlinx/datetime/internal/format/parser/ParserOperation;", "strings", "", "", "setter", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "whatThisExpects", "(Ljava/util/Collection;Lkotlinx/datetime/internal/format/parser/AssignableField;Ljava/lang/String;)V", "trie", "Lkotlinx/datetime/internal/format/parser/StringSetParserOperation$TrieNode;", "consume", "Lkotlinx/datetime/internal/format/parser/ParseResult;", PlaceTypes.STORAGE, "input", "", "startIndex", "", "consume-FANa98k", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "TrieNode", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class StringSetParserOperation<Output> implements ParserOperation<Output> {
    private final AssignableField<Output, String> setter;
    private final TrieNode trie;
    private final String whatThisExpects;

    /* JADX WARN: Multi-variable type inference failed */
    public StringSetParserOperation(Collection<String> strings, AssignableField<? super Output, String> setter, String whatThisExpects) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(setter, "setter");
        Intrinsics.checkNotNullParameter(whatThisExpects, "whatThisExpects");
        this.setter = setter;
        this.whatThisExpects = whatThisExpects;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        boolean z = false;
        int i = 3;
        this.trie = new TrieNode(null, z, i, 0 == true ? 1 : 0);
        for (String str : strings) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException(("Found an empty string in " + this.whatThisExpects).toString());
            }
            TrieNode second = this.trie;
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                List<Tuples2<String, TrieNode>> children = second.getChildren();
                final String strValueOf = String.valueOf(cCharAt);
                int iBinarySearch = CollectionsKt.binarySearch(children, 0, children.size(), new Function1<Tuples2<? extends String, ? extends TrieNode>, Integer>() { // from class: kotlinx.datetime.internal.format.parser.StringSetParserOperation$special$$inlined$binarySearchBy$default$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Integer invoke(Tuples2<? extends String, ? extends StringSetParserOperation.TrieNode> tuples2) {
                        return Integer.valueOf(ComparisonsKt.compareValues(tuples2.getFirst(), strValueOf));
                    }
                });
                if (iBinarySearch < 0) {
                    TrieNode trieNode = new TrieNode(objArr2 == true ? 1 : 0, z, i, objArr == true ? 1 : 0);
                    second.getChildren().add((-iBinarySearch) - 1, Tuples4.m3642to(String.valueOf(cCharAt), trieNode));
                    second = trieNode;
                } else {
                    second = second.getChildren().get(iBinarySearch).getSecond();
                }
            }
            if (second.getIsTerminal()) {
                throw new IllegalArgumentException(("The string '" + str + "' was passed several times").toString());
            }
            second.setTerminal(true);
        }
        _init_$reduceTrie(this.trie);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ParserOperation.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00000\u00040\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00000\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lkotlinx/datetime/internal/format/parser/StringSetParserOperation$TrieNode;", "", "children", "", "Lkotlin/Pair;", "", "isTerminal", "", "(Ljava/util/List;Z)V", "getChildren", "()Ljava/util/List;", "()Z", "setTerminal", "(Z)V", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    static final class TrieNode {
        private final List<Tuples2<String, TrieNode>> children;
        private boolean isTerminal;

        /* JADX WARN: Multi-variable type inference failed */
        public TrieNode() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public TrieNode(List<Tuples2<String, TrieNode>> children, boolean z) {
            Intrinsics.checkNotNullParameter(children, "children");
            this.children = children;
            this.isTerminal = z;
        }

        public /* synthetic */ TrieNode(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? false : z);
        }

        public final List<Tuples2<String, TrieNode>> getChildren() {
            return this.children;
        }

        /* renamed from: isTerminal, reason: from getter */
        public final boolean getIsTerminal() {
            return this.isTerminal;
        }

        public final void setTerminal(boolean z) {
            this.isTerminal = z;
        }
    }

    private static final void _init_$reduceTrie(TrieNode trieNode) {
        Iterator<Tuples2<String, TrieNode>> it = trieNode.getChildren().iterator();
        while (it.hasNext()) {
            _init_$reduceTrie(it.next().component2());
        }
        ArrayList arrayList = new ArrayList();
        for (Tuples2<String, TrieNode> tuples2 : trieNode.getChildren()) {
            String strComponent1 = tuples2.component1();
            TrieNode trieNodeComponent2 = tuples2.component2();
            if (!trieNodeComponent2.getIsTerminal() && trieNodeComponent2.getChildren().size() == 1) {
                Tuples2 tuples22 = (Tuples2) CollectionsKt.single((List) trieNodeComponent2.getChildren());
                String str = (String) tuples22.component1();
                arrayList.add(Tuples4.m3642to(strComponent1 + str, (TrieNode) tuples22.component2()));
            } else {
                arrayList.add(Tuples4.m3642to(strComponent1, trieNodeComponent2));
            }
        }
        trieNode.getChildren().clear();
        trieNode.getChildren().addAll(CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: kotlinx.datetime.internal.format.parser.StringSetParserOperation$_init_$reduceTrie$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((String) ((Tuples2) t).getFirst(), (String) ((Tuples2) t2).getFirst());
            }
        }));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        r1.element += r6.length();
        r0 = r3;
        r13 = r5;
     */
    @Override // kotlinx.datetime.internal.format.parser.ParserOperation
    /* renamed from: consume-FANa98k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo28854consumeFANa98k(Output storage, CharSequence input, final int startIndex) {
        Intrinsics.checkNotNullParameter(input, "input");
        TrieNode trieNode = this.trie;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = startIndex;
        Integer numValueOf = null;
        loop0: while (intRef.element <= input.length()) {
            if (trieNode.getIsTerminal()) {
                numValueOf = Integer.valueOf(intRef.element);
            }
            for (Tuples2<String, TrieNode> tuples2 : trieNode.getChildren()) {
                String strComponent1 = tuples2.component1();
                TrieNode trieNodeComponent2 = tuples2.component2();
                CharSequence charSequence = input;
                if (StringsKt.startsWith$default(charSequence, (CharSequence) strComponent1, intRef.element, false, 4, (Object) null)) {
                    break;
                }
                input = charSequence;
            }
        }
        final CharSequence charSequence2 = input;
        if (numValueOf != null) {
            return ParserOperationKt.setWithoutReassigning(this.setter, storage, charSequence2.subSequence(startIndex, numValueOf.intValue()).toString(), startIndex, numValueOf.intValue());
        }
        return ParseResult.INSTANCE.m28857ErrorRg3Co2E(startIndex, new Function0<String>(this) { // from class: kotlinx.datetime.internal.format.parser.StringSetParserOperation$consume$1
            final /* synthetic */ StringSetParserOperation<Output> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Expected " + ((StringSetParserOperation) this.this$0).whatThisExpects + " but got " + charSequence2.subSequence(startIndex, intRef.element).toString();
            }
        });
    }
}
