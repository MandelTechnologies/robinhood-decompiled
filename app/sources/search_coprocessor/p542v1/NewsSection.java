package search_coprocessor.p542v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;
import search_coprocessor.p542v1.NewsSection;

/* compiled from: NewsSection.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J*\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lsearch_coprocessor/v1/NewsSection;", "Lcom/squareup/wire/Message;", "", "id", "", "news", "", "Lsearch_coprocessor/v1/NewsSection$NewsContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getNews", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "NewsContent", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class NewsSection extends Message {

    @JvmField
    public static final ProtoAdapter<NewsSection> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "search_coprocessor.v1.NewsSection$NewsContent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<NewsContent> news;

    public NewsSection() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29970newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ NewsSection(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsSection(String id, List<NewsContent> news, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(news, "news");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.news = Internal.immutableCopyOf("news", news);
    }

    public final List<NewsContent> getNews() {
        return this.news;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29970newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NewsSection)) {
            return false;
        }
        NewsSection newsSection = (NewsSection) other;
        return Intrinsics.areEqual(unknownFields(), newsSection.unknownFields()) && Intrinsics.areEqual(this.id, newsSection.id) && Intrinsics.areEqual(this.news, newsSection.news);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.news.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        if (!this.news.isEmpty()) {
            arrayList.add("news=" + this.news);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NewsSection{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsSection copy$default(NewsSection newsSection, String str, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsSection.id;
        }
        if ((i & 2) != 0) {
            list = newsSection.news;
        }
        if ((i & 4) != 0) {
            byteString = newsSection.unknownFields();
        }
        return newsSection.copy(str, list, byteString);
    }

    public final NewsSection copy(String id, List<NewsContent> news, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(news, "news");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NewsSection(id, news, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NewsSection.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NewsSection>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.NewsSection$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NewsSection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                return size + NewsSection.NewsContent.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getNews());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NewsSection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                NewsSection.NewsContent.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getNews());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NewsSection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                NewsSection.NewsContent.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getNews());
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NewsSection decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new NewsSection(strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(NewsSection.NewsContent.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NewsSection redact(NewsSection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return NewsSection.copy$default(value, null, Internal.m26823redactElements(value.getNews(), NewsSection.NewsContent.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }

    /* compiled from: NewsSection.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B]\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJc\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\"\u0010\u001dR\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b&\u0010\u001dR\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b'\u0010\u001dR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, m3636d2 = {"Lsearch_coprocessor/v1/NewsSection$NewsContent;", "Lcom/squareup/wire/Message;", "", "", "title", "source", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "image_url", "news_link", "", "Lsearch_coprocessor/v1/Asset;", "associated_assets", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)Lsearch_coprocessor/v1/NewsSection$NewsContent;", "Ljava/lang/String;", "getTitle", "getSource", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "getImage_url", "getNews_link", "Ljava/util/List;", "getAssociated_assets", "()Ljava/util/List;", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NewsContent extends Message {

        @JvmField
        public static final ProtoAdapter<NewsContent> ADAPTER;

        @WireField(adapter = "search_coprocessor.v1.Asset#ADAPTER", jsonName = "associatedAssets", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
        private final List<Asset> associated_assets;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = MarkdownText4.TagImageUrl, schemaIndex = 3, tag = 4)
        private final String image_url;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "newsLink", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final String news_link;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String source;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final Instant timestamp;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String title;

        public NewsContent() {
            this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }

        public /* synthetic */ NewsContent(String str, String str2, Instant instant, String str3, String str4, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29971newBuilder();
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSource() {
            return this.source;
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getImage_url() {
            return this.image_url;
        }

        public final String getNews_link() {
            return this.news_link;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewsContent(String title, String source, Instant instant, String str, String news_link, List<Asset> associated_assets, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(news_link, "news_link");
            Intrinsics.checkNotNullParameter(associated_assets, "associated_assets");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.title = title;
            this.source = source;
            this.timestamp = instant;
            this.image_url = str;
            this.news_link = news_link;
            this.associated_assets = Internal.immutableCopyOf("associated_assets", associated_assets);
        }

        public final List<Asset> getAssociated_assets() {
            return this.associated_assets;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29971newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof NewsContent)) {
                return false;
            }
            NewsContent newsContent = (NewsContent) other;
            return Intrinsics.areEqual(unknownFields(), newsContent.unknownFields()) && Intrinsics.areEqual(this.title, newsContent.title) && Intrinsics.areEqual(this.source, newsContent.source) && Intrinsics.areEqual(this.timestamp, newsContent.timestamp) && Intrinsics.areEqual(this.image_url, newsContent.image_url) && Intrinsics.areEqual(this.news_link, newsContent.news_link) && Intrinsics.areEqual(this.associated_assets, newsContent.associated_assets);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.source.hashCode()) * 37;
            Instant instant = this.timestamp;
            int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
            String str = this.image_url;
            int iHashCode3 = ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 37) + this.news_link.hashCode()) * 37) + this.associated_assets.hashCode();
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("title=" + Internal.sanitize(this.title));
            arrayList.add("source=" + Internal.sanitize(this.source));
            Instant instant = this.timestamp;
            if (instant != null) {
                arrayList.add("timestamp=" + instant);
            }
            String str = this.image_url;
            if (str != null) {
                arrayList.add("image_url=" + Internal.sanitize(str));
            }
            arrayList.add("news_link=" + Internal.sanitize(this.news_link));
            if (!this.associated_assets.isEmpty()) {
                arrayList.add("associated_assets=" + this.associated_assets);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "NewsContent{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ NewsContent copy$default(NewsContent newsContent, String str, String str2, Instant instant, String str3, String str4, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = newsContent.title;
            }
            if ((i & 2) != 0) {
                str2 = newsContent.source;
            }
            if ((i & 4) != 0) {
                instant = newsContent.timestamp;
            }
            if ((i & 8) != 0) {
                str3 = newsContent.image_url;
            }
            if ((i & 16) != 0) {
                str4 = newsContent.news_link;
            }
            if ((i & 32) != 0) {
                list = newsContent.associated_assets;
            }
            if ((i & 64) != 0) {
                byteString = newsContent.unknownFields();
            }
            List list2 = list;
            ByteString byteString2 = byteString;
            String str5 = str4;
            Instant instant2 = instant;
            return newsContent.copy(str, str2, instant2, str3, str5, list2, byteString2);
        }

        public final NewsContent copy(String title, String source, Instant timestamp, String image_url, String news_link, List<Asset> associated_assets, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(news_link, "news_link");
            Intrinsics.checkNotNullParameter(associated_assets, "associated_assets");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new NewsContent(title, source, timestamp, image_url, news_link, associated_assets, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NewsContent.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<NewsContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: search_coprocessor.v1.NewsSection$NewsContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(NewsSection.NewsContent value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                    }
                    if (!Intrinsics.areEqual(value.getSource(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSource());
                    }
                    if (value.getTimestamp() != null) {
                        size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getTimestamp());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(4, value.getImage_url());
                    if (!Intrinsics.areEqual(value.getNews_link(), "")) {
                        iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getNews_link());
                    }
                    return iEncodedSizeWithTag + Asset.ADAPTER.asRepeated().encodedSizeWithTag(6, value.getAssociated_assets());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, NewsSection.NewsContent value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                    }
                    if (!Intrinsics.areEqual(value.getSource(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSource());
                    }
                    if (value.getTimestamp() != null) {
                        ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getTimestamp());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getImage_url());
                    if (!Intrinsics.areEqual(value.getNews_link(), "")) {
                        protoAdapter.encodeWithTag(writer, 5, (int) value.getNews_link());
                    }
                    Asset.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getAssociated_assets());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, NewsSection.NewsContent value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    Asset.ADAPTER.asRepeated().encodeWithTag(writer, 6, (int) value.getAssociated_assets());
                    if (!Intrinsics.areEqual(value.getNews_link(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getNews_link());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getImage_url());
                    if (value.getTimestamp() != null) {
                        ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getTimestamp());
                    }
                    if (!Intrinsics.areEqual(value.getSource(), "")) {
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getSource());
                    }
                    if (Intrinsics.areEqual(value.getTitle(), "")) {
                        return;
                    }
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public NewsSection.NewsContent decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    ArrayList arrayList = new ArrayList();
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    Instant instantDecode = null;
                    String strDecode3 = null;
                    String strDecode4 = strDecode2;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                    break;
                                case 4:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    arrayList.add(Asset.ADAPTER.decode(reader));
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new NewsSection.NewsContent(strDecode, strDecode4, instantDecode, strDecode3, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public NewsSection.NewsContent redact(NewsSection.NewsContent value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Instant timestamp = value.getTimestamp();
                    return NewsSection.NewsContent.copy$default(value, null, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, Internal.m26823redactElements(value.getAssociated_assets(), Asset.ADAPTER), ByteString.EMPTY, 27, null);
                }
            };
        }
    }
}
