package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.NewsFeedItem;
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

/* compiled from: NewsFeedItem.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003!\"#BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016JB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NewsFeedItem;", "Lcom/squareup/wire/Message;", "", "unique_identifier", "", "content_type", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;", "media_type", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$MediaType;", "source", "carousel_item_count", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$MediaType;Ljava/lang/String;ILokio/ByteString;)V", "getUnique_identifier", "()Ljava/lang/String;", "getContent_type", "()Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;", "getMedia_type", "()Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$MediaType;", "getSource", "getCarousel_item_count", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "ContentType", "MediaType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class NewsFeedItem extends Message {

    @JvmField
    public static final ProtoAdapter<NewsFeedItem> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "carouselItemCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int carousel_item_count;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NewsFeedItem$ContentType#ADAPTER", jsonName = "contentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ContentType content_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NewsFeedItem$MediaType#ADAPTER", jsonName = "mediaType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final MediaType media_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "uniqueIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String unique_identifier;

    public NewsFeedItem() {
        this(null, null, null, null, 0, null, 63, null);
    }

    public /* synthetic */ NewsFeedItem(String str, ContentType contentType, MediaType mediaType, String str2, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? ContentType.CONTENT_TYPE_UNSPECIFIED : contentType, (i2 & 4) != 0 ? MediaType.MEDIA_TYPE_NONE : mediaType, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24408newBuilder();
    }

    public final String getUnique_identifier() {
        return this.unique_identifier;
    }

    public final ContentType getContent_type() {
        return this.content_type;
    }

    public final MediaType getMedia_type() {
        return this.media_type;
    }

    public final String getSource() {
        return this.source;
    }

    public final int getCarousel_item_count() {
        return this.carousel_item_count;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedItem(String unique_identifier, ContentType content_type, MediaType media_type, String source, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
        Intrinsics.checkNotNullParameter(content_type, "content_type");
        Intrinsics.checkNotNullParameter(media_type, "media_type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.unique_identifier = unique_identifier;
        this.content_type = content_type;
        this.media_type = media_type;
        this.source = source;
        this.carousel_item_count = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24408newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NewsFeedItem)) {
            return false;
        }
        NewsFeedItem newsFeedItem = (NewsFeedItem) other;
        return Intrinsics.areEqual(unknownFields(), newsFeedItem.unknownFields()) && Intrinsics.areEqual(this.unique_identifier, newsFeedItem.unique_identifier) && this.content_type == newsFeedItem.content_type && this.media_type == newsFeedItem.media_type && Intrinsics.areEqual(this.source, newsFeedItem.source) && this.carousel_item_count == newsFeedItem.carousel_item_count;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.unique_identifier.hashCode()) * 37) + this.content_type.hashCode()) * 37) + this.media_type.hashCode()) * 37) + this.source.hashCode()) * 37) + Integer.hashCode(this.carousel_item_count);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("unique_identifier=" + Internal.sanitize(this.unique_identifier));
        arrayList.add("content_type=" + this.content_type);
        arrayList.add("media_type=" + this.media_type);
        arrayList.add("source=" + Internal.sanitize(this.source));
        arrayList.add("carousel_item_count=" + this.carousel_item_count);
        return CollectionsKt.joinToString$default(arrayList, ", ", "NewsFeedItem{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NewsFeedItem copy$default(NewsFeedItem newsFeedItem, String str, ContentType contentType, MediaType mediaType, String str2, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = newsFeedItem.unique_identifier;
        }
        if ((i2 & 2) != 0) {
            contentType = newsFeedItem.content_type;
        }
        if ((i2 & 4) != 0) {
            mediaType = newsFeedItem.media_type;
        }
        if ((i2 & 8) != 0) {
            str2 = newsFeedItem.source;
        }
        if ((i2 & 16) != 0) {
            i = newsFeedItem.carousel_item_count;
        }
        if ((i2 & 32) != 0) {
            byteString = newsFeedItem.unknownFields();
        }
        int i3 = i;
        ByteString byteString2 = byteString;
        return newsFeedItem.copy(str, contentType, mediaType, str2, i3, byteString2);
    }

    public final NewsFeedItem copy(String unique_identifier, ContentType content_type, MediaType media_type, String source, int carousel_item_count, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unique_identifier, "unique_identifier");
        Intrinsics.checkNotNullParameter(content_type, "content_type");
        Intrinsics.checkNotNullParameter(media_type, "media_type");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NewsFeedItem(unique_identifier, content_type, media_type, source, carousel_item_count, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NewsFeedItem.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NewsFeedItem>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.NewsFeedItem$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NewsFeedItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUnique_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUnique_identifier());
                }
                if (value.getContent_type() != NewsFeedItem.ContentType.CONTENT_TYPE_UNSPECIFIED) {
                    size += NewsFeedItem.ContentType.ADAPTER.encodedSizeWithTag(2, value.getContent_type());
                }
                if (value.getMedia_type() != NewsFeedItem.MediaType.MEDIA_TYPE_NONE) {
                    size += NewsFeedItem.MediaType.ADAPTER.encodedSizeWithTag(3, value.getMedia_type());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSource());
                }
                return value.getCarousel_item_count() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getCarousel_item_count())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NewsFeedItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUnique_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUnique_identifier());
                }
                if (value.getContent_type() != NewsFeedItem.ContentType.CONTENT_TYPE_UNSPECIFIED) {
                    NewsFeedItem.ContentType.ADAPTER.encodeWithTag(writer, 2, (int) value.getContent_type());
                }
                if (value.getMedia_type() != NewsFeedItem.MediaType.MEDIA_TYPE_NONE) {
                    NewsFeedItem.MediaType.ADAPTER.encodeWithTag(writer, 3, (int) value.getMedia_type());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSource());
                }
                if (value.getCarousel_item_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getCarousel_item_count()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NewsFeedItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCarousel_item_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getCarousel_item_count()));
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSource());
                }
                if (value.getMedia_type() != NewsFeedItem.MediaType.MEDIA_TYPE_NONE) {
                    NewsFeedItem.MediaType.ADAPTER.encodeWithTag(writer, 3, (int) value.getMedia_type());
                }
                if (value.getContent_type() != NewsFeedItem.ContentType.CONTENT_TYPE_UNSPECIFIED) {
                    NewsFeedItem.ContentType.ADAPTER.encodeWithTag(writer, 2, (int) value.getContent_type());
                }
                if (Intrinsics.areEqual(value.getUnique_identifier(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUnique_identifier());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NewsFeedItem decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                NewsFeedItem.ContentType contentTypeDecode = NewsFeedItem.ContentType.CONTENT_TYPE_UNSPECIFIED;
                NewsFeedItem.MediaType mediaType = NewsFeedItem.MediaType.MEDIA_TYPE_NONE;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                NewsFeedItem.MediaType mediaTypeDecode = mediaType;
                String strDecode2 = strDecode;
                while (true) {
                    NewsFeedItem.ContentType contentType = contentTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new NewsFeedItem(strDecode2, contentType, mediaTypeDecode, strDecode, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                contentTypeDecode = NewsFeedItem.ContentType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                mediaTypeDecode = NewsFeedItem.MediaType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NewsFeedItem redact(NewsFeedItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return NewsFeedItem.copy$default(value, null, null, null, null, 0, ByteString.EMPTY, 31, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsFeedItem.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CONTENT_TYPE_UNSPECIFIED", "REGULAR_ARTICLE", "EMBEDDED_ARTICLE", "VIDEO", "CAROUSEL", "LIST_CHIP_GRID", "LEARNING_ENTRY_POINT", "MARKET_UPDATES", "MARKET_INDICATOR", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ContentType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ContentType> ADAPTER;
        public static final ContentType CAROUSEL;
        public static final ContentType CONTENT_TYPE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ContentType EMBEDDED_ARTICLE;
        public static final ContentType LEARNING_ENTRY_POINT;
        public static final ContentType LIST_CHIP_GRID;
        public static final ContentType MARKET_INDICATOR;
        public static final ContentType MARKET_UPDATES;
        public static final ContentType REGULAR_ARTICLE;
        public static final ContentType VIDEO;
        private final int value;

        private static final /* synthetic */ ContentType[] $values() {
            return new ContentType[]{CONTENT_TYPE_UNSPECIFIED, REGULAR_ARTICLE, EMBEDDED_ARTICLE, VIDEO, CAROUSEL, LIST_CHIP_GRID, LEARNING_ENTRY_POINT, MARKET_UPDATES, MARKET_INDICATOR};
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
            REGULAR_ARTICLE = new ContentType("REGULAR_ARTICLE", 1, 1);
            EMBEDDED_ARTICLE = new ContentType("EMBEDDED_ARTICLE", 2, 2);
            VIDEO = new ContentType("VIDEO", 3, 3);
            CAROUSEL = new ContentType("CAROUSEL", 4, 4);
            LIST_CHIP_GRID = new ContentType("LIST_CHIP_GRID", 5, 5);
            LEARNING_ENTRY_POINT = new ContentType("LEARNING_ENTRY_POINT", 6, 6);
            MARKET_UPDATES = new ContentType("MARKET_UPDATES", 7, 7);
            MARKET_INDICATOR = new ContentType("MARKET_INDICATOR", 8, 8);
            ContentType[] contentTypeArr$values = $values();
            $VALUES = contentTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(contentTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContentType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ContentType>(orCreateKotlinClass, syntax, contentType) { // from class: com.robinhood.rosetta.eventlogging.NewsFeedItem$ContentType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public NewsFeedItem.ContentType fromValue(int value) {
                    return NewsFeedItem.ContentType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: NewsFeedItem.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$ContentType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                        return ContentType.REGULAR_ARTICLE;
                    case 2:
                        return ContentType.EMBEDDED_ARTICLE;
                    case 3:
                        return ContentType.VIDEO;
                    case 4:
                        return ContentType.CAROUSEL;
                    case 5:
                        return ContentType.LIST_CHIP_GRID;
                    case 6:
                        return ContentType.LEARNING_ENTRY_POINT;
                    case 7:
                        return ContentType.MARKET_UPDATES;
                    case 8:
                        return ContentType.MARKET_INDICATOR;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsFeedItem.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$MediaType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MEDIA_TYPE_NONE", "MEDIA_TYPE_IMAGE", "MEDIA_TYPE_VIDEO", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MediaType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MediaType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<MediaType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final MediaType MEDIA_TYPE_IMAGE;
        public static final MediaType MEDIA_TYPE_NONE;
        public static final MediaType MEDIA_TYPE_VIDEO;
        private final int value;

        private static final /* synthetic */ MediaType[] $values() {
            return new MediaType[]{MEDIA_TYPE_NONE, MEDIA_TYPE_IMAGE, MEDIA_TYPE_VIDEO};
        }

        @JvmStatic
        public static final MediaType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<MediaType> getEntries() {
            return $ENTRIES;
        }

        private MediaType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final MediaType mediaType = new MediaType("MEDIA_TYPE_NONE", 0, 0);
            MEDIA_TYPE_NONE = mediaType;
            MEDIA_TYPE_IMAGE = new MediaType("MEDIA_TYPE_IMAGE", 1, 1);
            MEDIA_TYPE_VIDEO = new MediaType("MEDIA_TYPE_VIDEO", 2, 2);
            MediaType[] mediaTypeArr$values = $values();
            $VALUES = mediaTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(mediaTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MediaType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<MediaType>(orCreateKotlinClass, syntax, mediaType) { // from class: com.robinhood.rosetta.eventlogging.NewsFeedItem$MediaType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public NewsFeedItem.MediaType fromValue(int value) {
                    return NewsFeedItem.MediaType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: NewsFeedItem.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$MediaType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/NewsFeedItem$MediaType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final MediaType fromValue(int value) {
                if (value == 0) {
                    return MediaType.MEDIA_TYPE_NONE;
                }
                if (value == 1) {
                    return MediaType.MEDIA_TYPE_IMAGE;
                }
                if (value != 2) {
                    return null;
                }
                return MediaType.MEDIA_TYPE_VIDEO;
            }
        }

        public static MediaType valueOf(String str) {
            return (MediaType) Enum.valueOf(MediaType.class, str);
        }

        public static MediaType[] values() {
            return (MediaType[]) $VALUES.clone();
        }
    }
}
