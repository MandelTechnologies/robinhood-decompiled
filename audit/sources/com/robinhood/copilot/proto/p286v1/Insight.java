package com.robinhood.copilot.proto.p286v1;

import com.robinhood.rosetta.common.Money;
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

/* compiled from: Insight.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u0091\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#J\u0097\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010#R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b(\u0010#R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b)\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b-\u0010#R\"\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b:\u00108\u001a\u0004\b9\u00106R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b;\u00106¨\u0006="}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/Insight;", "Lcom/squareup/wire/Message;", "", "", "title", "description", "rationale", "", "supporting_data", "article_ids", "Lcom/robinhood/rosetta/common/Money;", "target_price", "timeframe", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "estimated_date", "Lcom/robinhood/copilot/proto/v1/InsightCategory;", "insight_category", "Lcom/robinhood/copilot/proto/v1/ArticleSource;", "article_sources", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/InsightCategory;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/InsightCategory;Ljava/util/List;Lokio/ByteString;)Lcom/robinhood/copilot/proto/v1/Insight;", "Ljava/lang/String;", "getTitle", "getDescription", "getRationale", "Lcom/robinhood/rosetta/common/Money;", "getTarget_price", "()Lcom/robinhood/rosetta/common/Money;", "getTimeframe", "Lj$/time/Instant;", "getEstimated_date", "()Lj$/time/Instant;", "Lcom/robinhood/copilot/proto/v1/InsightCategory;", "getInsight_category", "()Lcom/robinhood/copilot/proto/v1/InsightCategory;", "Ljava/util/List;", "getSupporting_data", "()Ljava/util/List;", "getSupporting_data$annotations", "()V", "getArticle_ids", "getArticle_ids$annotations", "getArticle_sources", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class Insight extends Message {

    @JvmField
    public static final ProtoAdapter<Insight> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "articleIds", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<String> article_ids;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.ArticleSource#ADAPTER", jsonName = "articleSources", label = WireField.Label.REPEATED, schemaIndex = 9, tag = 10)
    private final List<ArticleSource> article_sources;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "estimatedDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Instant estimated_date;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.InsightCategory#ADAPTER", jsonName = "insightCategory", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final InsightCategory insight_category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String rationale;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "supportingData", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<String> supporting_data;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "targetPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Money target_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String timeframe;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public Insight() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Deprecated
    public static /* synthetic */ void getArticle_ids$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getSupporting_data$annotations() {
    }

    public /* synthetic */ Insight(String str, String str2, String str3, List list, List list2, Money money, String str4, Instant instant, InsightCategory insightCategory, List list3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? CollectionsKt.emptyList() : list2, (i & 32) != 0 ? null : money, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? null : instant, (i & 256) != 0 ? InsightCategory.INSIGHT_CATEGORY_UNSPECIFIED : insightCategory, (i & 512) != 0 ? CollectionsKt.emptyList() : list3, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22144newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getRationale() {
        return this.rationale;
    }

    public final Money getTarget_price() {
        return this.target_price;
    }

    public final String getTimeframe() {
        return this.timeframe;
    }

    public final Instant getEstimated_date() {
        return this.estimated_date;
    }

    public final InsightCategory getInsight_category() {
        return this.insight_category;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Insight(String title, String description, String rationale, List<String> supporting_data, List<String> article_ids, Money money, String timeframe, Instant instant, InsightCategory insight_category, List<ArticleSource> article_sources, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(rationale, "rationale");
        Intrinsics.checkNotNullParameter(supporting_data, "supporting_data");
        Intrinsics.checkNotNullParameter(article_ids, "article_ids");
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(insight_category, "insight_category");
        Intrinsics.checkNotNullParameter(article_sources, "article_sources");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.description = description;
        this.rationale = rationale;
        this.target_price = money;
        this.timeframe = timeframe;
        this.estimated_date = instant;
        this.insight_category = insight_category;
        this.supporting_data = Internal.immutableCopyOf("supporting_data", supporting_data);
        this.article_ids = Internal.immutableCopyOf("article_ids", article_ids);
        this.article_sources = Internal.immutableCopyOf("article_sources", article_sources);
    }

    public final List<String> getSupporting_data() {
        return this.supporting_data;
    }

    public final List<String> getArticle_ids() {
        return this.article_ids;
    }

    public final List<ArticleSource> getArticle_sources() {
        return this.article_sources;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22144newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Insight)) {
            return false;
        }
        Insight insight = (Insight) other;
        return Intrinsics.areEqual(unknownFields(), insight.unknownFields()) && Intrinsics.areEqual(this.title, insight.title) && Intrinsics.areEqual(this.description, insight.description) && Intrinsics.areEqual(this.rationale, insight.rationale) && Intrinsics.areEqual(this.supporting_data, insight.supporting_data) && Intrinsics.areEqual(this.article_ids, insight.article_ids) && Intrinsics.areEqual(this.target_price, insight.target_price) && Intrinsics.areEqual(this.timeframe, insight.timeframe) && Intrinsics.areEqual(this.estimated_date, insight.estimated_date) && this.insight_category == insight.insight_category && Intrinsics.areEqual(this.article_sources, insight.article_sources);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.description.hashCode()) * 37) + this.rationale.hashCode()) * 37) + this.supporting_data.hashCode()) * 37) + this.article_ids.hashCode()) * 37;
        Money money = this.target_price;
        int iHashCode2 = (((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.timeframe.hashCode()) * 37;
        Instant instant = this.estimated_date;
        int iHashCode3 = ((((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37) + this.insight_category.hashCode()) * 37) + this.article_sources.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("rationale=" + Internal.sanitize(this.rationale));
        if (!this.supporting_data.isEmpty()) {
            arrayList.add("supporting_data=" + Internal.sanitize(this.supporting_data));
        }
        if (!this.article_ids.isEmpty()) {
            arrayList.add("article_ids=" + Internal.sanitize(this.article_ids));
        }
        Money money = this.target_price;
        if (money != null) {
            arrayList.add("target_price=" + money);
        }
        arrayList.add("timeframe=" + Internal.sanitize(this.timeframe));
        Instant instant = this.estimated_date;
        if (instant != null) {
            arrayList.add("estimated_date=" + instant);
        }
        arrayList.add("insight_category=" + this.insight_category);
        if (!this.article_sources.isEmpty()) {
            arrayList.add("article_sources=" + this.article_sources);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Insight{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Insight copy$default(Insight insight, String str, String str2, String str3, List list, List list2, Money money, String str4, Instant instant, InsightCategory insightCategory, List list3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = insight.title;
        }
        if ((i & 2) != 0) {
            str2 = insight.description;
        }
        if ((i & 4) != 0) {
            str3 = insight.rationale;
        }
        if ((i & 8) != 0) {
            list = insight.supporting_data;
        }
        if ((i & 16) != 0) {
            list2 = insight.article_ids;
        }
        if ((i & 32) != 0) {
            money = insight.target_price;
        }
        if ((i & 64) != 0) {
            str4 = insight.timeframe;
        }
        if ((i & 128) != 0) {
            instant = insight.estimated_date;
        }
        if ((i & 256) != 0) {
            insightCategory = insight.insight_category;
        }
        if ((i & 512) != 0) {
            list3 = insight.article_sources;
        }
        if ((i & 1024) != 0) {
            byteString = insight.unknownFields();
        }
        List list4 = list3;
        ByteString byteString2 = byteString;
        Instant instant2 = instant;
        InsightCategory insightCategory2 = insightCategory;
        Money money2 = money;
        String str5 = str4;
        List list5 = list2;
        String str6 = str3;
        return insight.copy(str, str2, str6, list, list5, money2, str5, instant2, insightCategory2, list4, byteString2);
    }

    public final Insight copy(String title, String description, String rationale, List<String> supporting_data, List<String> article_ids, Money target_price, String timeframe, Instant estimated_date, InsightCategory insight_category, List<ArticleSource> article_sources, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(rationale, "rationale");
        Intrinsics.checkNotNullParameter(supporting_data, "supporting_data");
        Intrinsics.checkNotNullParameter(article_ids, "article_ids");
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(insight_category, "insight_category");
        Intrinsics.checkNotNullParameter(article_sources, "article_sources");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Insight(title, description, rationale, supporting_data, article_ids, target_price, timeframe, estimated_date, insight_category, article_sources, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Insight.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Insight>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.Insight$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Insight value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getRationale(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRationale());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(4, value.getSupporting_data()) + protoAdapter.asRepeated().encodedSizeWithTag(5, value.getArticle_ids());
                if (value.getTarget_price() != null) {
                    iEncodedSizeWithTag += Money.ADAPTER.encodedSizeWithTag(6, value.getTarget_price());
                }
                if (!Intrinsics.areEqual(value.getTimeframe(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(7, value.getTimeframe());
                }
                if (value.getEstimated_date() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(8, value.getEstimated_date());
                }
                if (value.getInsight_category() != InsightCategory.INSIGHT_CATEGORY_UNSPECIFIED) {
                    iEncodedSizeWithTag += InsightCategory.ADAPTER.encodedSizeWithTag(9, value.getInsight_category());
                }
                return iEncodedSizeWithTag + ArticleSource.ADAPTER.asRepeated().encodedSizeWithTag(10, value.getArticle_sources());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Insight value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getRationale(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRationale());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getSupporting_data());
                protoAdapter.asRepeated().encodeWithTag(writer, 5, (int) value.getArticle_ids());
                if (value.getTarget_price() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getTarget_price());
                }
                if (!Intrinsics.areEqual(value.getTimeframe(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getTimeframe());
                }
                if (value.getEstimated_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getEstimated_date());
                }
                if (value.getInsight_category() != InsightCategory.INSIGHT_CATEGORY_UNSPECIFIED) {
                    InsightCategory.ADAPTER.encodeWithTag(writer, 9, (int) value.getInsight_category());
                }
                ArticleSource.ADAPTER.asRepeated().encodeWithTag(writer, 10, (int) value.getArticle_sources());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Insight value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ArticleSource.ADAPTER.asRepeated().encodeWithTag(writer, 10, (int) value.getArticle_sources());
                if (value.getInsight_category() != InsightCategory.INSIGHT_CATEGORY_UNSPECIFIED) {
                    InsightCategory.ADAPTER.encodeWithTag(writer, 9, (int) value.getInsight_category());
                }
                if (value.getEstimated_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getEstimated_date());
                }
                if (!Intrinsics.areEqual(value.getTimeframe(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getTimeframe());
                }
                if (value.getTarget_price() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getTarget_price());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 5, (int) value.getArticle_ids());
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getSupporting_data());
                if (!Intrinsics.areEqual(value.getRationale(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getRationale());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Insight decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                InsightCategory insightCategory = InsightCategory.INSIGHT_CATEGORY_UNSPECIFIED;
                ArrayList arrayList3 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                Money moneyDecode = null;
                Instant instantDecode = null;
                InsightCategory insightCategoryDecode = insightCategory;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                str = strDecode4;
                                str2 = strDecode;
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                strDecode4 = str;
                                strDecode = str2;
                                break;
                            case 5:
                                str = strDecode4;
                                str2 = strDecode;
                                arrayList2.add(ProtoAdapter.STRING.decode(reader));
                                strDecode4 = str;
                                strDecode = str2;
                                break;
                            case 6:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 9:
                                try {
                                    insightCategoryDecode = InsightCategory.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str = strDecode4;
                                    str2 = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 10:
                                arrayList3.add(ArticleSource.ADAPTER.decode(reader));
                                str = strDecode4;
                                str2 = strDecode;
                                strDecode4 = str;
                                strDecode = str2;
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode4;
                                str2 = strDecode;
                                strDecode4 = str;
                                strDecode = str2;
                                break;
                        }
                    } else {
                        return new Insight(strDecode4, strDecode, strDecode2, arrayList, arrayList2, moneyDecode, strDecode3, instantDecode, insightCategoryDecode, arrayList3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Insight redact(Insight value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money target_price = value.getTarget_price();
                Money moneyRedact = target_price != null ? Money.ADAPTER.redact(target_price) : null;
                Instant estimated_date = value.getEstimated_date();
                return Insight.copy$default(value, null, null, null, null, null, moneyRedact, null, estimated_date != null ? ProtoAdapter.INSTANT.redact(estimated_date) : null, null, Internal.m26823redactElements(value.getArticle_sources(), ArticleSource.ADAPTER), ByteString.EMPTY, 351, null);
            }
        };
    }
}
