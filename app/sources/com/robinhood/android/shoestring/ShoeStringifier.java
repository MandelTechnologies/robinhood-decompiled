package com.robinhood.android.shoestring;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.p011ui.text.AnnotatedString;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ShoeStringifier.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n0\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ6\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0016H\u0002J6\u0010\u0017\u001a\u00020\u0010*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0016H\u0002J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019*\u00020\fH\u0000¢\u0006\u0002\b\u001aJ\u0014\u0010\u001b\u001a\u00020\f*\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J(\u0010\u001e\u001a\u0002H\u001f\"\u0006\b\u0000\u0010\u001f\u0018\u0001*\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010 \u001a\u00020\bH\u0082\b¢\u0006\u0002\u0010!¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/shoestring/ShoeStringifier;", "", "<init>", "()V", "parse", "Lkotlin/Pair;", "Landroidx/compose/ui/text/AnnotatedString;", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "Lcom/robinhood/android/shoestring/InlineContentMap;", "template", "", "handlers", "Lcom/robinhood/android/shoestring/TagHandlers;", "parseTemplateContents", "", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "tokens", "", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token;", "inlineContentMap", "", "parseNode", "tokenize", "Lkotlin/sequences/Sequence;", "tokenize$lib_shoestring_externalDebug", "nextThree", "pos", "", "consume", "T", "errorMessage", "(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/Object;", "Token", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ShoeStringifier {
    public static final int $stable = 0;
    public static final ShoeStringifier INSTANCE = new ShoeStringifier();

    private ShoeStringifier() {
    }

    public final Tuples2<AnnotatedString, ImmutableMap<String, InlineTextContent>> parse(CharSequence template, TagHandlers handlers) {
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        ShoeStringifier shoeStringifier = INSTANCE;
        shoeStringifier.parseTemplateContents(builder, shoeStringifier.tokenize$lib_shoestring_externalDebug(template).iterator2(), handlers, linkedHashMap);
        return Tuples4.m3642to(builder.toAnnotatedString(), extensions2.toImmutableMap(linkedHashMap));
    }

    private final void parseTemplateContents(AnnotatedString.Builder builder, Iterator<? extends Token> it, TagHandlers tagHandlers, Map<String, InlineTextContent> map) {
        while (it.hasNext()) {
            Token next = it.next();
            if (next instanceof Token.Opener) {
                Token.Opener opener = (Token.Opener) next;
                if (!Intrinsics.areEqual(opener, Token.Opener.TagOpener.INSTANCE)) {
                    if (!Intrinsics.areEqual(opener, Token.Opener.ClosingTagOpener.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                parseNode(builder, it, tagHandlers, map);
            } else {
                if (next instanceof Token.Closer) {
                    throw new IllegalStateException("Unexpected tag closer.");
                }
                if (!(next instanceof Token.Text)) {
                    if (!Intrinsics.areEqual(next, Token.End.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                builder.append(((Token.Text) next).getText());
            }
        }
    }

    private final void parseNode(AnnotatedString.Builder builder, Iterator<? extends Token> it, TagHandlers tagHandlers, Map<String, InlineTextContent> map) {
        try {
            Token next = it.next();
            if (!(next instanceof Token.Text)) {
                throw new IllegalStateException("Expected tag text.");
            }
            Token.Text text = (Token.Text) next;
            try {
                Token next2 = it.next();
                if (!(next2 instanceof Token.Closer)) {
                    throw new IllegalStateException("Expected tag closer '}}' or '/}}'.");
                }
                Token.Closer closer = (Token.Closer) next2;
                if (Intrinsics.areEqual(closer, Token.Closer.ClosingTagCloser.INSTANCE)) {
                    map.putAll(tagHandlers.handleInlineNode$lib_shoestring_externalDebug(text.getText(), builder));
                    return;
                }
                if (!Intrinsics.areEqual(closer, Token.Closer.TagCloser.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                map.putAll(tagHandlers.handleNodeOpen$lib_shoestring_externalDebug(text.getText(), builder));
                parseTemplateContents(builder, it, tagHandlers, map);
                try {
                    Token next3 = it.next();
                    if (!(next3 instanceof Token.Text)) {
                        throw new IllegalStateException("Expected closing tag");
                    }
                    Token.Text text2 = (Token.Text) next3;
                    try {
                        if (!(it.next() instanceof Token.Closer.TagCloser)) {
                            throw new IllegalStateException("Expected closing tag");
                        }
                        map.putAll(tagHandlers.handleNodeClose$lib_shoestring_externalDebug(text.getText(), text2.getText(), builder));
                    } catch (NoSuchElementException unused) {
                        throw new IllegalStateException("Expected closing tag");
                    }
                } catch (NoSuchElementException unused2) {
                    throw new IllegalStateException("Expected closing tag");
                }
            } catch (NoSuchElementException unused3) {
                throw new IllegalStateException("Expected tag closer '}}' or '/}}'.");
            }
        } catch (NoSuchElementException unused4) {
            throw new IllegalStateException("Expected tag text.");
        }
    }

    public final Sequence<Token> tokenize$lib_shoestring_externalDebug(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return SequencesKt.sequence(new ShoeStringifier2(charSequence, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence nextThree(CharSequence charSequence, int i) {
        int i2 = i + 3;
        return charSequence.length() > i2 ? charSequence.subSequence(i, i2) : charSequence.subSequence(i, charSequence.length());
    }

    private final /* synthetic */ <T> T consume(Iterator<? extends Token> it, String str) {
        try {
            T t = (T) ((Token) it.next());
            Intrinsics.reifiedOperationMarker(3, "T");
            if (t != null) {
                return t;
            }
            throw new IllegalStateException(str.toString());
        } catch (NoSuchElementException unused) {
            throw new IllegalStateException(str.toString());
        }
    }

    /* compiled from: ShoeStringifier.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/shoestring/ShoeStringifier$Token;", "", "text", "", "<init>", "(Ljava/lang/CharSequence;)V", "getText", "()Ljava/lang/CharSequence;", "Text", "Opener", "Closer", "End", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Closer;", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token$End;", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Opener;", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Text;", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Token {
        public static final int $stable = 8;
        private final CharSequence text;

        public /* synthetic */ Token(CharSequence charSequence, DefaultConstructorMarker defaultConstructorMarker) {
            this(charSequence);
        }

        /* compiled from: ShoeStringifier.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Text;", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token;", "text", "", "<init>", "(Ljava/lang/CharSequence;)V", "getText", "()Ljava/lang/CharSequence;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Text extends Token {
            public static final int $stable = 8;
            private final CharSequence text;

            public static /* synthetic */ Text copy$default(Text text, CharSequence charSequence, int i, Object obj) {
                if ((i & 1) != 0) {
                    charSequence = text.text;
                }
                return text.copy(charSequence);
            }

            /* renamed from: component1, reason: from getter */
            public final CharSequence getText() {
                return this.text;
            }

            public final Text copy(CharSequence text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new Text(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Text) && Intrinsics.areEqual(this.text, ((Text) other).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return "Text(text=" + ((Object) this.text) + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Text(CharSequence text) {
                super(text, null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            @Override // com.robinhood.android.shoestring.ShoeStringifier.Token
            public CharSequence getText() {
                return this.text;
            }
        }

        private Token(CharSequence charSequence) {
            this.text = charSequence;
        }

        public CharSequence getText() {
            return this.text;
        }

        /* compiled from: ShoeStringifier.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Opener;", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token;", "text", "", "<init>", "(Ljava/lang/CharSequence;)V", "getText", "()Ljava/lang/CharSequence;", "ClosingTagOpener", "TagOpener", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Opener$ClosingTagOpener;", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Opener$TagOpener;", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class Opener extends Token {
            public static final int $stable = 8;
            private final CharSequence text;

            public /* synthetic */ Opener(CharSequence charSequence, DefaultConstructorMarker defaultConstructorMarker) {
                this(charSequence);
            }

            /* compiled from: ShoeStringifier.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Opener$ClosingTagOpener;", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Opener;", "<init>", "()V", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class ClosingTagOpener extends Opener {
                public static final ClosingTagOpener INSTANCE = new ClosingTagOpener();
                public static final int $stable = 8;

                private ClosingTagOpener() {
                    super("{{/", null);
                }
            }

            private Opener(CharSequence charSequence) {
                super(charSequence, null);
                this.text = charSequence;
            }

            @Override // com.robinhood.android.shoestring.ShoeStringifier.Token
            public CharSequence getText() {
                return this.text;
            }

            /* compiled from: ShoeStringifier.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Opener$TagOpener;", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Opener;", "<init>", "()V", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class TagOpener extends Opener {
                public static final TagOpener INSTANCE = new TagOpener();
                public static final int $stable = 8;

                private TagOpener() {
                    super("{{", null);
                }
            }
        }

        /* compiled from: ShoeStringifier.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Closer;", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token;", "text", "", "<init>", "(Ljava/lang/CharSequence;)V", "getText", "()Ljava/lang/CharSequence;", "ClosingTagCloser", "TagCloser", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Closer$ClosingTagCloser;", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Closer$TagCloser;", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class Closer extends Token {
            public static final int $stable = 8;
            private final CharSequence text;

            public /* synthetic */ Closer(CharSequence charSequence, DefaultConstructorMarker defaultConstructorMarker) {
                this(charSequence);
            }

            /* compiled from: ShoeStringifier.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Closer$ClosingTagCloser;", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Closer;", "<init>", "()V", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class ClosingTagCloser extends Closer {
                public static final ClosingTagCloser INSTANCE = new ClosingTagCloser();
                public static final int $stable = 8;

                private ClosingTagCloser() {
                    super("/}}", null);
                }
            }

            private Closer(CharSequence charSequence) {
                super(charSequence, null);
                this.text = charSequence;
            }

            @Override // com.robinhood.android.shoestring.ShoeStringifier.Token
            public CharSequence getText() {
                return this.text;
            }

            /* compiled from: ShoeStringifier.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Closer$TagCloser;", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token$Closer;", "<init>", "()V", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class TagCloser extends Closer {
                public static final TagCloser INSTANCE = new TagCloser();
                public static final int $stable = 8;

                private TagCloser() {
                    super("}}", null);
                }
            }
        }

        /* compiled from: ShoeStringifier.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/shoestring/ShoeStringifier$Token$End;", "Lcom/robinhood/android/shoestring/ShoeStringifier$Token;", "<init>", "()V", "lib-shoestring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class End extends Token {
            public static final End INSTANCE = new End();
            public static final int $stable = 8;

            private End() {
                super("EOF", null);
            }
        }
    }
}
