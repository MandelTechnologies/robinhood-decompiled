package com.robinhood.copilot.proto.p286v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
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

/* compiled from: PortfolioDigestSection.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001>B\u008d\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%J\u0093\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010*R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010%R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b0\u0010%R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b1\u0010%R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b2\u0010%R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b3\u0010%R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0013\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b7\u0010%R\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestSection;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionType;", "type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", InquiryField.DateField.TYPE, "", "instrument_id", "title", "description", "preview_title", "preview_description", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentiment;", "sentiment", "", "Lcom/robinhood/copilot/proto/v1/ArticleSource;", "sources", "sub_text", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetType;", "asset_type", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionType;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentiment;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetType;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionType;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentiment;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetType;Lokio/ByteString;)Lcom/robinhood/copilot/proto/v1/PortfolioDigestSection;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionType;", "getType", "()Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionType;", "Lj$/time/Instant;", "getDate", "()Lj$/time/Instant;", "Ljava/lang/String;", "getInstrument_id", "getTitle", "getDescription", "getPreview_title", "getPreview_description", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentiment;", "getSentiment", "()Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentiment;", "getSub_text", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetType;", "getAsset_type", "()Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetType;", "Ljava/util/List;", "getSources", "()Ljava/util/List;", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PortfolioDigestSection extends Message {

    @JvmField
    public static final ProtoAdapter<PortfolioDigestSection> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.PortfolioDigestAssetType#ADAPTER", jsonName = "assetType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final PortfolioDigestAssetType asset_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "previewDescription", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String preview_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "previewTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String preview_title;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.PortfolioDigestSentiment#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final PortfolioDigestSentiment sentiment;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.ArticleSource#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 8, tag = 9)
    private final List<ArticleSource> sources;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String sub_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String title;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.PortfolioDigestSectionType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final PortfolioDigestSectionType type;

    public PortfolioDigestSection() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22157newBuilder();
    }

    public final PortfolioDigestSectionType getType() {
        return this.type;
    }

    public /* synthetic */ PortfolioDigestSection(PortfolioDigestSectionType portfolioDigestSectionType, Instant instant, String str, String str2, String str3, String str4, String str5, PortfolioDigestSentiment portfolioDigestSentiment, List list, String str6, PortfolioDigestAssetType portfolioDigestAssetType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED : portfolioDigestSectionType, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? PortfolioDigestSentiment.PORTFOLIO_DIGEST_SENTIMENT_UNSPECIFIED : portfolioDigestSentiment, (i & 256) != 0 ? CollectionsKt.emptyList() : list, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? PortfolioDigestAssetType.PORTFOLIO_DIGEST_ASSET_TYPE_UNSPECIFIED : portfolioDigestAssetType, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getDate() {
        return this.date;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getPreview_title() {
        return this.preview_title;
    }

    public final String getPreview_description() {
        return this.preview_description;
    }

    public final PortfolioDigestSentiment getSentiment() {
        return this.sentiment;
    }

    public final String getSub_text() {
        return this.sub_text;
    }

    public final PortfolioDigestAssetType getAsset_type() {
        return this.asset_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioDigestSection(PortfolioDigestSectionType type2, Instant instant, String instrument_id, String title, String description, String preview_title, String preview_description, PortfolioDigestSentiment sentiment, List<ArticleSource> sources, String sub_text, PortfolioDigestAssetType asset_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(preview_title, "preview_title");
        Intrinsics.checkNotNullParameter(preview_description, "preview_description");
        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(sub_text, "sub_text");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.date = instant;
        this.instrument_id = instrument_id;
        this.title = title;
        this.description = description;
        this.preview_title = preview_title;
        this.preview_description = preview_description;
        this.sentiment = sentiment;
        this.sub_text = sub_text;
        this.asset_type = asset_type;
        this.sources = Internal.immutableCopyOf("sources", sources);
    }

    public final List<ArticleSource> getSources() {
        return this.sources;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22157newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PortfolioDigestSection)) {
            return false;
        }
        PortfolioDigestSection portfolioDigestSection = (PortfolioDigestSection) other;
        return Intrinsics.areEqual(unknownFields(), portfolioDigestSection.unknownFields()) && this.type == portfolioDigestSection.type && Intrinsics.areEqual(this.date, portfolioDigestSection.date) && Intrinsics.areEqual(this.instrument_id, portfolioDigestSection.instrument_id) && Intrinsics.areEqual(this.title, portfolioDigestSection.title) && Intrinsics.areEqual(this.description, portfolioDigestSection.description) && Intrinsics.areEqual(this.preview_title, portfolioDigestSection.preview_title) && Intrinsics.areEqual(this.preview_description, portfolioDigestSection.preview_description) && this.sentiment == portfolioDigestSection.sentiment && Intrinsics.areEqual(this.sources, portfolioDigestSection.sources) && Intrinsics.areEqual(this.sub_text, portfolioDigestSection.sub_text) && this.asset_type == portfolioDigestSection.asset_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37;
        Instant instant = this.date;
        int iHashCode2 = ((((((((((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.instrument_id.hashCode()) * 37) + this.title.hashCode()) * 37) + this.description.hashCode()) * 37) + this.preview_title.hashCode()) * 37) + this.preview_description.hashCode()) * 37) + this.sentiment.hashCode()) * 37) + this.sources.hashCode()) * 37) + this.sub_text.hashCode()) * 37) + this.asset_type.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        Instant instant = this.date;
        if (instant != null) {
            arrayList.add("date=" + instant);
        }
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("preview_title=" + Internal.sanitize(this.preview_title));
        arrayList.add("preview_description=" + Internal.sanitize(this.preview_description));
        arrayList.add("sentiment=" + this.sentiment);
        if (!this.sources.isEmpty()) {
            arrayList.add("sources=" + this.sources);
        }
        arrayList.add("sub_text=" + Internal.sanitize(this.sub_text));
        arrayList.add("asset_type=" + this.asset_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PortfolioDigestSection{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PortfolioDigestSection copy$default(PortfolioDigestSection portfolioDigestSection, PortfolioDigestSectionType portfolioDigestSectionType, Instant instant, String str, String str2, String str3, String str4, String str5, PortfolioDigestSentiment portfolioDigestSentiment, List list, String str6, PortfolioDigestAssetType portfolioDigestAssetType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            portfolioDigestSectionType = portfolioDigestSection.type;
        }
        if ((i & 2) != 0) {
            instant = portfolioDigestSection.date;
        }
        if ((i & 4) != 0) {
            str = portfolioDigestSection.instrument_id;
        }
        if ((i & 8) != 0) {
            str2 = portfolioDigestSection.title;
        }
        if ((i & 16) != 0) {
            str3 = portfolioDigestSection.description;
        }
        if ((i & 32) != 0) {
            str4 = portfolioDigestSection.preview_title;
        }
        if ((i & 64) != 0) {
            str5 = portfolioDigestSection.preview_description;
        }
        if ((i & 128) != 0) {
            portfolioDigestSentiment = portfolioDigestSection.sentiment;
        }
        if ((i & 256) != 0) {
            list = portfolioDigestSection.sources;
        }
        if ((i & 512) != 0) {
            str6 = portfolioDigestSection.sub_text;
        }
        if ((i & 1024) != 0) {
            portfolioDigestAssetType = portfolioDigestSection.asset_type;
        }
        if ((i & 2048) != 0) {
            byteString = portfolioDigestSection.unknownFields();
        }
        PortfolioDigestAssetType portfolioDigestAssetType2 = portfolioDigestAssetType;
        ByteString byteString2 = byteString;
        List list2 = list;
        String str7 = str6;
        String str8 = str5;
        PortfolioDigestSentiment portfolioDigestSentiment2 = portfolioDigestSentiment;
        String str9 = str3;
        String str10 = str4;
        return portfolioDigestSection.copy(portfolioDigestSectionType, instant, str, str2, str9, str10, str8, portfolioDigestSentiment2, list2, str7, portfolioDigestAssetType2, byteString2);
    }

    public final PortfolioDigestSection copy(PortfolioDigestSectionType type2, Instant date, String instrument_id, String title, String description, String preview_title, String preview_description, PortfolioDigestSentiment sentiment, List<ArticleSource> sources, String sub_text, PortfolioDigestAssetType asset_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(preview_title, "preview_title");
        Intrinsics.checkNotNullParameter(preview_description, "preview_description");
        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(sub_text, "sub_text");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PortfolioDigestSection(type2, date, instrument_id, title, description, preview_title, preview_description, sentiment, sources, sub_text, asset_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PortfolioDigestSection.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PortfolioDigestSection>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.PortfolioDigestSection$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PortfolioDigestSection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getType() != PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED) {
                    size += PortfolioDigestSectionType.ADAPTER.encodedSizeWithTag(1, value.getType());
                }
                if (value.getDate() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getDate());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getPreview_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getPreview_title());
                }
                if (!Intrinsics.areEqual(value.getPreview_description(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getPreview_description());
                }
                if (value.getSentiment() != PortfolioDigestSentiment.PORTFOLIO_DIGEST_SENTIMENT_UNSPECIFIED) {
                    size += PortfolioDigestSentiment.ADAPTER.encodedSizeWithTag(8, value.getSentiment());
                }
                int iEncodedSizeWithTag = size + ArticleSource.ADAPTER.asRepeated().encodedSizeWithTag(9, value.getSources());
                if (!Intrinsics.areEqual(value.getSub_text(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getSub_text());
                }
                return value.getAsset_type() != PortfolioDigestAssetType.PORTFOLIO_DIGEST_ASSET_TYPE_UNSPECIFIED ? iEncodedSizeWithTag + PortfolioDigestAssetType.ADAPTER.encodedSizeWithTag(11, value.getAsset_type()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PortfolioDigestSection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getType() != PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED) {
                    PortfolioDigestSectionType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
                if (value.getDate() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getDate());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getPreview_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getPreview_title());
                }
                if (!Intrinsics.areEqual(value.getPreview_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getPreview_description());
                }
                if (value.getSentiment() != PortfolioDigestSentiment.PORTFOLIO_DIGEST_SENTIMENT_UNSPECIFIED) {
                    PortfolioDigestSentiment.ADAPTER.encodeWithTag(writer, 8, (int) value.getSentiment());
                }
                ArticleSource.ADAPTER.asRepeated().encodeWithTag(writer, 9, (int) value.getSources());
                if (!Intrinsics.areEqual(value.getSub_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getSub_text());
                }
                if (value.getAsset_type() != PortfolioDigestAssetType.PORTFOLIO_DIGEST_ASSET_TYPE_UNSPECIFIED) {
                    PortfolioDigestAssetType.ADAPTER.encodeWithTag(writer, 11, (int) value.getAsset_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PortfolioDigestSection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAsset_type() != PortfolioDigestAssetType.PORTFOLIO_DIGEST_ASSET_TYPE_UNSPECIFIED) {
                    PortfolioDigestAssetType.ADAPTER.encodeWithTag(writer, 11, (int) value.getAsset_type());
                }
                if (!Intrinsics.areEqual(value.getSub_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getSub_text());
                }
                ArticleSource.ADAPTER.asRepeated().encodeWithTag(writer, 9, (int) value.getSources());
                if (value.getSentiment() != PortfolioDigestSentiment.PORTFOLIO_DIGEST_SENTIMENT_UNSPECIFIED) {
                    PortfolioDigestSentiment.ADAPTER.encodeWithTag(writer, 8, (int) value.getSentiment());
                }
                if (!Intrinsics.areEqual(value.getPreview_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getPreview_description());
                }
                if (!Intrinsics.areEqual(value.getPreview_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getPreview_title());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInstrument_id());
                }
                if (value.getDate() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getDate());
                }
                if (value.getType() != PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED) {
                    PortfolioDigestSectionType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioDigestSection decode(ProtoReader reader) throws IOException {
                PortfolioDigestSectionType portfolioDigestSectionType;
                PortfolioDigestAssetType portfolioDigestAssetType;
                Instant instant;
                Intrinsics.checkNotNullParameter(reader, "reader");
                PortfolioDigestSectionType portfolioDigestSectionType2 = PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED;
                PortfolioDigestSentiment portfolioDigestSentiment = PortfolioDigestSentiment.PORTFOLIO_DIGEST_SENTIMENT_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                PortfolioDigestAssetType portfolioDigestAssetType2 = PortfolioDigestAssetType.PORTFOLIO_DIGEST_ASSET_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                Instant instantDecode = null;
                PortfolioDigestAssetType portfolioDigestAssetTypeDecode = portfolioDigestAssetType2;
                PortfolioDigestSentiment portfolioDigestSentimentDecode = portfolioDigestSentiment;
                PortfolioDigestSectionType portfolioDigestSectionTypeDecode = portfolioDigestSectionType2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                portfolioDigestSectionType = portfolioDigestSectionTypeDecode;
                                portfolioDigestAssetType = portfolioDigestAssetTypeDecode;
                                instant = instantDecode;
                                try {
                                    portfolioDigestSectionTypeDecode = PortfolioDigestSectionType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                instantDecode = instant;
                                portfolioDigestAssetTypeDecode = portfolioDigestAssetType;
                                break;
                            case 2:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                portfolioDigestSectionType = portfolioDigestSectionTypeDecode;
                                portfolioDigestAssetType = portfolioDigestAssetTypeDecode;
                                instant = instantDecode;
                                try {
                                    portfolioDigestSentimentDecode = PortfolioDigestSentiment.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                                portfolioDigestSectionTypeDecode = portfolioDigestSectionType;
                                instantDecode = instant;
                                portfolioDigestAssetTypeDecode = portfolioDigestAssetType;
                                break;
                            case 9:
                                portfolioDigestSectionType = portfolioDigestSectionTypeDecode;
                                portfolioDigestAssetType = portfolioDigestAssetTypeDecode;
                                instant = instantDecode;
                                arrayList.add(ArticleSource.ADAPTER.decode(reader));
                                portfolioDigestSectionTypeDecode = portfolioDigestSectionType;
                                instantDecode = instant;
                                portfolioDigestAssetTypeDecode = portfolioDigestAssetType;
                                break;
                            case 10:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                try {
                                    portfolioDigestAssetTypeDecode = PortfolioDigestAssetType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    portfolioDigestSectionType = portfolioDigestSectionTypeDecode;
                                    portfolioDigestAssetType = portfolioDigestAssetTypeDecode;
                                    instant = instantDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                portfolioDigestSectionType = portfolioDigestSectionTypeDecode;
                                portfolioDigestAssetType = portfolioDigestAssetTypeDecode;
                                instant = instantDecode;
                                portfolioDigestSectionTypeDecode = portfolioDigestSectionType;
                                instantDecode = instant;
                                portfolioDigestAssetTypeDecode = portfolioDigestAssetType;
                                break;
                        }
                    } else {
                        return new PortfolioDigestSection(portfolioDigestSectionTypeDecode, instantDecode, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, portfolioDigestSentimentDecode, arrayList, strDecode6, portfolioDigestAssetTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioDigestSection redact(PortfolioDigestSection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant date = value.getDate();
                return PortfolioDigestSection.copy$default(value, null, date != null ? ProtoAdapter.INSTANT.redact(date) : null, null, null, null, null, null, null, Internal.m26823redactElements(value.getSources(), ArticleSource.ADAPTER), null, null, ByteString.EMPTY, 1789, null);
            }
        };
    }
}
