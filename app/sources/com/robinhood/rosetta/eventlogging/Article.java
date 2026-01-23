package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.Article;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: Article.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Article;", "Lcom/squareup/wire/Message;", "", "article_type", "Lcom/robinhood/rosetta/eventlogging/Article$ArticleType;", "unique_identifier", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Article$ArticleType;Ljava/lang/String;Lokio/ByteString;)V", "getArticle_type", "()Lcom/robinhood/rosetta/eventlogging/Article$ArticleType;", "getUnique_identifier", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ArticleType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class Article extends Message {

    @JvmField
    public static final ProtoAdapter<Article> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Article$ArticleType#ADAPTER", jsonName = "articleType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ArticleType article_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "uniqueIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String unique_identifier;

    public Article() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24024newBuilder();
    }

    public final ArticleType getArticle_type() {
        return this.article_type;
    }

    public /* synthetic */ Article(ArticleType articleType, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ArticleType.ARTICLE_TYPE_UNSPECIFIED : articleType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getUnique_identifier() {
        return this.unique_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Article(ArticleType article_type, String unique_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(article_type, "article_type");
        Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.article_type = article_type;
        this.unique_identifier = unique_identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24024newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Article)) {
            return false;
        }
        Article article = (Article) other;
        return Intrinsics.areEqual(unknownFields(), article.unknownFields()) && this.article_type == article.article_type && Intrinsics.areEqual(this.unique_identifier, article.unique_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.article_type.hashCode()) * 37) + this.unique_identifier.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("article_type=" + this.article_type);
        arrayList.add("unique_identifier=" + Internal.sanitize(this.unique_identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Article{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Article copy$default(Article article, ArticleType articleType, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            articleType = article.article_type;
        }
        if ((i & 2) != 0) {
            str = article.unique_identifier;
        }
        if ((i & 4) != 0) {
            byteString = article.unknownFields();
        }
        return article.copy(articleType, str, byteString);
    }

    public final Article copy(ArticleType article_type, String unique_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(article_type, "article_type");
        Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Article(article_type, unique_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Article.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Article>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.Article$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Article value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getArticle_type() != Article.ArticleType.ARTICLE_TYPE_UNSPECIFIED) {
                    size += Article.ArticleType.ADAPTER.encodedSizeWithTag(1, value.getArticle_type());
                }
                return !Intrinsics.areEqual(value.getUnique_identifier(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUnique_identifier()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Article value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getArticle_type() != Article.ArticleType.ARTICLE_TYPE_UNSPECIFIED) {
                    Article.ArticleType.ADAPTER.encodeWithTag(writer, 1, (int) value.getArticle_type());
                }
                if (!Intrinsics.areEqual(value.getUnique_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUnique_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Article value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getUnique_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUnique_identifier());
                }
                if (value.getArticle_type() != Article.ArticleType.ARTICLE_TYPE_UNSPECIFIED) {
                    Article.ArticleType.ADAPTER.encodeWithTag(writer, 1, (int) value.getArticle_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Article decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Article.ArticleType articleTypeDecode = Article.ArticleType.ARTICLE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Article(articleTypeDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            articleTypeDecode = Article.ArticleType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Article redact(Article value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Article.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Article.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Article$ArticleType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ARTICLE_TYPE_UNSPECIFIED", "REGULAR", "HERO", "VIDEO", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ArticleType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ArticleType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ArticleType> ADAPTER;
        public static final ArticleType ARTICLE_TYPE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ArticleType HERO;
        public static final ArticleType REGULAR;
        public static final ArticleType VIDEO;
        private final int value;

        private static final /* synthetic */ ArticleType[] $values() {
            return new ArticleType[]{ARTICLE_TYPE_UNSPECIFIED, REGULAR, HERO, VIDEO};
        }

        @JvmStatic
        public static final ArticleType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ArticleType> getEntries() {
            return $ENTRIES;
        }

        private ArticleType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ArticleType articleType = new ArticleType("ARTICLE_TYPE_UNSPECIFIED", 0, 0);
            ARTICLE_TYPE_UNSPECIFIED = articleType;
            REGULAR = new ArticleType("REGULAR", 1, 1);
            HERO = new ArticleType("HERO", 2, 2);
            VIDEO = new ArticleType("VIDEO", 3, 3);
            ArticleType[] articleTypeArr$values = $values();
            $VALUES = articleTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(articleTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ArticleType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ArticleType>(orCreateKotlinClass, syntax, articleType) { // from class: com.robinhood.rosetta.eventlogging.Article$ArticleType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public Article.ArticleType fromValue(int value) {
                    return Article.ArticleType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: Article.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Article$ArticleType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/Article$ArticleType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ArticleType fromValue(int value) {
                if (value == 0) {
                    return ArticleType.ARTICLE_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return ArticleType.REGULAR;
                }
                if (value == 2) {
                    return ArticleType.HERO;
                }
                if (value != 3) {
                    return null;
                }
                return ArticleType.VIDEO;
            }
        }

        public static ArticleType valueOf(String str) {
            return (ArticleType) Enum.valueOf(ArticleType.class, str);
        }

        public static ArticleType[] values() {
            return (ArticleType[]) $VALUES.clone();
        }
    }
}
