package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.SearchResultItem;
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

/* compiled from: SearchResultItem.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SearchResultItem;", "Lcom/squareup/wire/Message;", "", "unique_identifier", "", "content_type", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "title", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;Ljava/lang/String;Lokio/ByteString;)V", "getUnique_identifier", "()Ljava/lang/String;", "getContent_type", "()Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "getTitle", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ContentType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class SearchResultItem extends Message {

    @JvmField
    public static final ProtoAdapter<SearchResultItem> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.SearchResultItem$ContentType#ADAPTER", jsonName = "contentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ContentType content_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "uniqueIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String unique_identifier;

    public SearchResultItem() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ SearchResultItem(String str, ContentType contentType, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ContentType.CONTENT_TYPE_UNSPECIFIED : contentType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24563newBuilder();
    }

    public final String getUnique_identifier() {
        return this.unique_identifier;
    }

    public final ContentType getContent_type() {
        return this.content_type;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultItem(String unique_identifier, ContentType content_type, String title, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
        Intrinsics.checkNotNullParameter(content_type, "content_type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.unique_identifier = unique_identifier;
        this.content_type = content_type;
        this.title = title;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24563newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SearchResultItem)) {
            return false;
        }
        SearchResultItem searchResultItem = (SearchResultItem) other;
        return Intrinsics.areEqual(unknownFields(), searchResultItem.unknownFields()) && Intrinsics.areEqual(this.unique_identifier, searchResultItem.unique_identifier) && this.content_type == searchResultItem.content_type && Intrinsics.areEqual(this.title, searchResultItem.title);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.unique_identifier.hashCode()) * 37) + this.content_type.hashCode()) * 37) + this.title.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("unique_identifier=" + Internal.sanitize(this.unique_identifier));
        arrayList.add("content_type=" + this.content_type);
        arrayList.add("title=" + Internal.sanitize(this.title));
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchResultItem{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SearchResultItem copy$default(SearchResultItem searchResultItem, String str, ContentType contentType, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchResultItem.unique_identifier;
        }
        if ((i & 2) != 0) {
            contentType = searchResultItem.content_type;
        }
        if ((i & 4) != 0) {
            str2 = searchResultItem.title;
        }
        if ((i & 8) != 0) {
            byteString = searchResultItem.unknownFields();
        }
        return searchResultItem.copy(str, contentType, str2, byteString);
    }

    public final SearchResultItem copy(String unique_identifier, ContentType content_type, String title, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
        Intrinsics.checkNotNullParameter(content_type, "content_type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SearchResultItem(unique_identifier, content_type, title, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SearchResultItem.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SearchResultItem>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.SearchResultItem$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SearchResultItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUnique_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUnique_identifier());
                }
                if (value.getContent_type() != SearchResultItem.ContentType.CONTENT_TYPE_UNSPECIFIED) {
                    size += SearchResultItem.ContentType.ADAPTER.encodedSizeWithTag(2, value.getContent_type());
                }
                return !Intrinsics.areEqual(value.getTitle(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTitle()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SearchResultItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUnique_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUnique_identifier());
                }
                if (value.getContent_type() != SearchResultItem.ContentType.CONTENT_TYPE_UNSPECIFIED) {
                    SearchResultItem.ContentType.ADAPTER.encodeWithTag(writer, 2, (int) value.getContent_type());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SearchResultItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                if (value.getContent_type() != SearchResultItem.ContentType.CONTENT_TYPE_UNSPECIFIED) {
                    SearchResultItem.ContentType.ADAPTER.encodeWithTag(writer, 2, (int) value.getContent_type());
                }
                if (Intrinsics.areEqual(value.getUnique_identifier(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUnique_identifier());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SearchResultItem decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SearchResultItem.ContentType contentTypeDecode = SearchResultItem.ContentType.CONTENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SearchResultItem(strDecode, contentTypeDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            contentTypeDecode = SearchResultItem.ContentType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SearchResultItem redact(SearchResultItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SearchResultItem.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchResultItem.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CONTENT_TYPE_UNSPECIFIED", "INSTRUMENT", "LIST", "CRYPTO", "HELP_ARTICLE", "LEARN_ARTICLE", "DEEPLINK", "EDUCATION", "ACTIVE_FUTURES", "NON_ACTIVE_FUTURES", "MARKET_INDEXES", "FUTURES_PRODUCTS", "EVENT_CONTRACTS", "FUTURES_CONTRACTS", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ContentType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;
        public static final ContentType ACTIVE_FUTURES;

        @JvmField
        public static final ProtoAdapter<ContentType> ADAPTER;
        public static final ContentType CONTENT_TYPE_UNSPECIFIED;
        public static final ContentType CRYPTO;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ContentType DEEPLINK;
        public static final ContentType EDUCATION;
        public static final ContentType EVENT_CONTRACTS;
        public static final ContentType FUTURES_CONTRACTS;
        public static final ContentType FUTURES_PRODUCTS;
        public static final ContentType HELP_ARTICLE;
        public static final ContentType INSTRUMENT;
        public static final ContentType LEARN_ARTICLE;
        public static final ContentType LIST;
        public static final ContentType MARKET_INDEXES;
        public static final ContentType NON_ACTIVE_FUTURES;
        private final int value;

        private static final /* synthetic */ ContentType[] $values() {
            return new ContentType[]{CONTENT_TYPE_UNSPECIFIED, INSTRUMENT, LIST, CRYPTO, HELP_ARTICLE, LEARN_ARTICLE, DEEPLINK, EDUCATION, ACTIVE_FUTURES, NON_ACTIVE_FUTURES, MARKET_INDEXES, FUTURES_PRODUCTS, EVENT_CONTRACTS, FUTURES_CONTRACTS};
        }

        @JvmStatic
        public static final ContentType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ContentType> getEntries() {
            return $ENTRIES;
        }

        private ContentType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ContentType contentType = new ContentType("CONTENT_TYPE_UNSPECIFIED", 0, 0);
            CONTENT_TYPE_UNSPECIFIED = contentType;
            INSTRUMENT = new ContentType("INSTRUMENT", 1, 1);
            LIST = new ContentType("LIST", 2, 2);
            CRYPTO = new ContentType("CRYPTO", 3, 3);
            HELP_ARTICLE = new ContentType("HELP_ARTICLE", 4, 4);
            LEARN_ARTICLE = new ContentType("LEARN_ARTICLE", 5, 5);
            DEEPLINK = new ContentType("DEEPLINK", 6, 6);
            EDUCATION = new ContentType("EDUCATION", 7, 7);
            ACTIVE_FUTURES = new ContentType("ACTIVE_FUTURES", 8, 8);
            NON_ACTIVE_FUTURES = new ContentType("NON_ACTIVE_FUTURES", 9, 9);
            MARKET_INDEXES = new ContentType("MARKET_INDEXES", 10, 10);
            FUTURES_PRODUCTS = new ContentType("FUTURES_PRODUCTS", 11, 11);
            EVENT_CONTRACTS = new ContentType("EVENT_CONTRACTS", 12, 12);
            FUTURES_CONTRACTS = new ContentType("FUTURES_CONTRACTS", 13, 13);
            ContentType[] contentTypeArr$values = $values();
            $VALUES = contentTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(contentTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContentType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ContentType>(orCreateKotlinClass, syntax, contentType) { // from class: com.robinhood.rosetta.eventlogging.SearchResultItem$ContentType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public SearchResultItem.ContentType fromValue(int value) {
                    return SearchResultItem.ContentType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: SearchResultItem.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/SearchResultItem$ContentType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ContentType fromValue(int value) {
                switch (value) {
                    case 0:
                        return ContentType.CONTENT_TYPE_UNSPECIFIED;
                    case 1:
                        return ContentType.INSTRUMENT;
                    case 2:
                        return ContentType.LIST;
                    case 3:
                        return ContentType.CRYPTO;
                    case 4:
                        return ContentType.HELP_ARTICLE;
                    case 5:
                        return ContentType.LEARN_ARTICLE;
                    case 6:
                        return ContentType.DEEPLINK;
                    case 7:
                        return ContentType.EDUCATION;
                    case 8:
                        return ContentType.ACTIVE_FUTURES;
                    case 9:
                        return ContentType.NON_ACTIVE_FUTURES;
                    case 10:
                        return ContentType.MARKET_INDEXES;
                    case 11:
                        return ContentType.FUTURES_PRODUCTS;
                    case 12:
                        return ContentType.EVENT_CONTRACTS;
                    case 13:
                        return ContentType.FUTURES_CONTRACTS;
                    default:
                        return null;
                }
            }
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }
    }
}
