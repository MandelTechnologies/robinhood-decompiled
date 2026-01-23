package com.robinhood.copilot.proto.p286v1;

import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
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

/* compiled from: PortfolioDigest.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B\u0083\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u0089\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\"R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b'\u0010\"R\"\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b,\u0010-R\"\u0010\u0012\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b.\u0010*R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u00101R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b2\u00101R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b3\u00101¨\u00065"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigest;", "Lcom/squareup/wire/Message;", "", "", "title", "", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSection;", "sections", "Lcom/robinhood/copilot/proto/v1/ArticleSource;", "sources", "Lcom/robinhood/copilot/proto/v1/PortfolioHolding;", CryptoDetailSource.HOLDINGS, "digest_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "read_at", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentiment;", "sentiment", "next_generation_timestamp", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentiment;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentiment;Lj$/time/Instant;Lokio/ByteString;)Lcom/robinhood/copilot/proto/v1/PortfolioDigest;", "Ljava/lang/String;", "getTitle", "getDigest_id", "Lj$/time/Instant;", "getRead_at", "()Lj$/time/Instant;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentiment;", "getSentiment", "()Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentiment;", "getNext_generation_timestamp", "Ljava/util/List;", "getSections", "()Ljava/util/List;", "getSources", "getHoldings", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PortfolioDigest extends Message {

    @JvmField
    public static final ProtoAdapter<PortfolioDigest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "digestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String digest_id;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.PortfolioHolding#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<PortfolioHolding> holdings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "nextGenerationTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Instant next_generation_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "readAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Instant read_at;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.PortfolioDigestSection#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<PortfolioDigestSection> sections;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.PortfolioDigestSentiment#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final PortfolioDigestSentiment sentiment;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.ArticleSource#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<ArticleSource> sources;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public PortfolioDigest() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ PortfolioDigest(String str, List list, List list2, List list3, String str2, Instant instant, PortfolioDigestSentiment portfolioDigestSentiment, Instant instant2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? PortfolioDigestSentiment.PORTFOLIO_DIGEST_SENTIMENT_UNSPECIFIED : portfolioDigestSentiment, (i & 128) != 0 ? null : instant2, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22154newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDigest_id() {
        return this.digest_id;
    }

    public final Instant getRead_at() {
        return this.read_at;
    }

    public final PortfolioDigestSentiment getSentiment() {
        return this.sentiment;
    }

    public final Instant getNext_generation_timestamp() {
        return this.next_generation_timestamp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioDigest(String title, List<PortfolioDigestSection> sections, List<ArticleSource> sources, List<? extends PortfolioHolding> holdings, String digest_id, Instant instant, PortfolioDigestSentiment sentiment, Instant instant2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(holdings, "holdings");
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.digest_id = digest_id;
        this.read_at = instant;
        this.sentiment = sentiment;
        this.next_generation_timestamp = instant2;
        this.sections = Internal.immutableCopyOf("sections", sections);
        this.sources = Internal.immutableCopyOf("sources", sources);
        this.holdings = Internal.immutableCopyOf(CryptoDetailSource.HOLDINGS, holdings);
    }

    public final List<PortfolioDigestSection> getSections() {
        return this.sections;
    }

    public final List<ArticleSource> getSources() {
        return this.sources;
    }

    public final List<PortfolioHolding> getHoldings() {
        return this.holdings;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22154newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PortfolioDigest)) {
            return false;
        }
        PortfolioDigest portfolioDigest = (PortfolioDigest) other;
        return Intrinsics.areEqual(unknownFields(), portfolioDigest.unknownFields()) && Intrinsics.areEqual(this.title, portfolioDigest.title) && Intrinsics.areEqual(this.sections, portfolioDigest.sections) && Intrinsics.areEqual(this.sources, portfolioDigest.sources) && Intrinsics.areEqual(this.holdings, portfolioDigest.holdings) && Intrinsics.areEqual(this.digest_id, portfolioDigest.digest_id) && Intrinsics.areEqual(this.read_at, portfolioDigest.read_at) && this.sentiment == portfolioDigest.sentiment && Intrinsics.areEqual(this.next_generation_timestamp, portfolioDigest.next_generation_timestamp);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.sections.hashCode()) * 37) + this.sources.hashCode()) * 37) + this.holdings.hashCode()) * 37) + this.digest_id.hashCode()) * 37;
        Instant instant = this.read_at;
        int iHashCode2 = (((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.sentiment.hashCode()) * 37;
        Instant instant2 = this.next_generation_timestamp;
        int iHashCode3 = iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        if (!this.sections.isEmpty()) {
            arrayList.add("sections=" + this.sections);
        }
        if (!this.sources.isEmpty()) {
            arrayList.add("sources=" + this.sources);
        }
        if (!this.holdings.isEmpty()) {
            arrayList.add("holdings=" + this.holdings);
        }
        arrayList.add("digest_id=" + Internal.sanitize(this.digest_id));
        Instant instant = this.read_at;
        if (instant != null) {
            arrayList.add("read_at=" + instant);
        }
        arrayList.add("sentiment=" + this.sentiment);
        Instant instant2 = this.next_generation_timestamp;
        if (instant2 != null) {
            arrayList.add("next_generation_timestamp=" + instant2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PortfolioDigest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PortfolioDigest copy$default(PortfolioDigest portfolioDigest, String str, List list, List list2, List list3, String str2, Instant instant, PortfolioDigestSentiment portfolioDigestSentiment, Instant instant2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = portfolioDigest.title;
        }
        if ((i & 2) != 0) {
            list = portfolioDigest.sections;
        }
        if ((i & 4) != 0) {
            list2 = portfolioDigest.sources;
        }
        if ((i & 8) != 0) {
            list3 = portfolioDigest.holdings;
        }
        if ((i & 16) != 0) {
            str2 = portfolioDigest.digest_id;
        }
        if ((i & 32) != 0) {
            instant = portfolioDigest.read_at;
        }
        if ((i & 64) != 0) {
            portfolioDigestSentiment = portfolioDigest.sentiment;
        }
        if ((i & 128) != 0) {
            instant2 = portfolioDigest.next_generation_timestamp;
        }
        if ((i & 256) != 0) {
            byteString = portfolioDigest.unknownFields();
        }
        Instant instant3 = instant2;
        ByteString byteString2 = byteString;
        Instant instant4 = instant;
        PortfolioDigestSentiment portfolioDigestSentiment2 = portfolioDigestSentiment;
        String str3 = str2;
        List list4 = list2;
        return portfolioDigest.copy(str, list, list4, list3, str3, instant4, portfolioDigestSentiment2, instant3, byteString2);
    }

    public final PortfolioDigest copy(String title, List<PortfolioDigestSection> sections, List<ArticleSource> sources, List<? extends PortfolioHolding> holdings, String digest_id, Instant read_at, PortfolioDigestSentiment sentiment, Instant next_generation_timestamp, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(holdings, "holdings");
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PortfolioDigest(title, sections, sources, holdings, digest_id, read_at, sentiment, next_generation_timestamp, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PortfolioDigest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PortfolioDigest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.PortfolioDigest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PortfolioDigest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                int iEncodedSizeWithTag = size + PortfolioDigestSection.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getSections()) + ArticleSource.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getSources()) + PortfolioHolding.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getHoldings());
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDigest_id());
                }
                if (value.getRead_at() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.getRead_at());
                }
                if (value.getSentiment() != PortfolioDigestSentiment.PORTFOLIO_DIGEST_SENTIMENT_UNSPECIFIED) {
                    iEncodedSizeWithTag += PortfolioDigestSentiment.ADAPTER.encodedSizeWithTag(7, value.getSentiment());
                }
                return value.getNext_generation_timestamp() != null ? iEncodedSizeWithTag + ProtoAdapter.INSTANT.encodedSizeWithTag(8, value.getNext_generation_timestamp()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PortfolioDigest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                PortfolioDigestSection.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSections());
                ArticleSource.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getSources());
                PortfolioHolding.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getHoldings());
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDigest_id());
                }
                if (value.getRead_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getRead_at());
                }
                if (value.getSentiment() != PortfolioDigestSentiment.PORTFOLIO_DIGEST_SENTIMENT_UNSPECIFIED) {
                    PortfolioDigestSentiment.ADAPTER.encodeWithTag(writer, 7, (int) value.getSentiment());
                }
                if (value.getNext_generation_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getNext_generation_timestamp());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PortfolioDigest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getNext_generation_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getNext_generation_timestamp());
                }
                if (value.getSentiment() != PortfolioDigestSentiment.PORTFOLIO_DIGEST_SENTIMENT_UNSPECIFIED) {
                    PortfolioDigestSentiment.ADAPTER.encodeWithTag(writer, 7, (int) value.getSentiment());
                }
                if (value.getRead_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getRead_at());
                }
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDigest_id());
                }
                PortfolioHolding.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getHoldings());
                ArticleSource.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getSources());
                PortfolioDigestSection.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getSections());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioDigest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                PortfolioDigestSentiment portfolioDigestSentiment = PortfolioDigestSentiment.PORTFOLIO_DIGEST_SENTIMENT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                PortfolioDigestSentiment portfolioDigestSentimentDecode = portfolioDigestSentiment;
                String strDecode2 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                arrayList.add(PortfolioDigestSection.ADAPTER.decode(reader));
                                break;
                            case 3:
                                arrayList2.add(ArticleSource.ADAPTER.decode(reader));
                                break;
                            case 4:
                                try {
                                    PortfolioHolding.ADAPTER.tryDecode(reader, arrayList3);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 7:
                                try {
                                    portfolioDigestSentimentDecode = PortfolioDigestSentiment.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 8:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new PortfolioDigest(strDecode2, arrayList, arrayList2, arrayList3, strDecode, instantDecode, portfolioDigestSentimentDecode, instantDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioDigest redact(PortfolioDigest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getSections(), PortfolioDigestSection.ADAPTER);
                List listM26823redactElements2 = Internal.m26823redactElements(value.getSources(), ArticleSource.ADAPTER);
                Instant read_at = value.getRead_at();
                Instant instantRedact = read_at != null ? ProtoAdapter.INSTANT.redact(read_at) : null;
                Instant next_generation_timestamp = value.getNext_generation_timestamp();
                return PortfolioDigest.copy$default(value, null, listM26823redactElements, listM26823redactElements2, null, null, instantRedact, null, next_generation_timestamp != null ? ProtoAdapter.INSTANT.redact(next_generation_timestamp) : null, ByteString.EMPTY, 89, null);
            }
        };
    }
}
