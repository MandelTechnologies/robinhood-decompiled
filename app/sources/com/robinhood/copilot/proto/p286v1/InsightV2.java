package com.robinhood.copilot.proto.p286v1;

import com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDeeplinkTarget;
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
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: InsightV2.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\u0018\u0000 D2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DB©\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010(J¯\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010(R\"\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u00102R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b3\u0010-R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b8\u00109R\"\u0010\u0014\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b:\u00102R\u001a\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010.\u001a\u0004\b;\u0010(R\u001a\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\b<\u0010(R\u001a\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010=\u001a\u0004\b>\u0010?R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010BR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bC\u0010B¨\u0006E"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightV2;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/common/Money;", "target_price", "", "timeframe", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "estimated_date", "price_at_generation", "", "Lcom/robinhood/copilot/proto/v1/InsightDetail;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/copilot/proto/v1/InsightCategory;", "insight_category", "Lcom/robinhood/copilot/proto/v1/InsightMethodology;", "methodology", "Lcom/robinhood/copilot/proto/v1/ArticleSource;", "article_sources", "generation_timestamp", "title", AdvisoryInsightDetailDeeplinkTarget.INSIGHT_ID_QUERY_PARAM, "Lcom/robinhood/copilot/proto/v1/InsightSentiment;", "sentiment", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Money;Ljava/util/List;Lcom/robinhood/copilot/proto/v1/InsightCategory;Lcom/robinhood/copilot/proto/v1/InsightMethodology;Ljava/util/List;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/InsightSentiment;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/Money;Ljava/util/List;Lcom/robinhood/copilot/proto/v1/InsightCategory;Lcom/robinhood/copilot/proto/v1/InsightMethodology;Ljava/util/List;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/InsightSentiment;Lokio/ByteString;)Lcom/robinhood/copilot/proto/v1/InsightV2;", "Lcom/robinhood/rosetta/common/Money;", "getTarget_price", "()Lcom/robinhood/rosetta/common/Money;", "Ljava/lang/String;", "getTimeframe", "Lj$/time/Instant;", "getEstimated_date", "()Lj$/time/Instant;", "getPrice_at_generation", "Lcom/robinhood/copilot/proto/v1/InsightCategory;", "getInsight_category", "()Lcom/robinhood/copilot/proto/v1/InsightCategory;", "Lcom/robinhood/copilot/proto/v1/InsightMethodology;", "getMethodology", "()Lcom/robinhood/copilot/proto/v1/InsightMethodology;", "getGeneration_timestamp", "getTitle", "getInsight_id", "Lcom/robinhood/copilot/proto/v1/InsightSentiment;", "getSentiment", "()Lcom/robinhood/copilot/proto/v1/InsightSentiment;", "Ljava/util/List;", "getDetails", "()Ljava/util/List;", "getArticle_sources", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class InsightV2 extends Message {

    @JvmField
    public static final ProtoAdapter<InsightV2> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.ArticleSource#ADAPTER", jsonName = "articleSources", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    private final List<ArticleSource> article_sources;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.InsightDetail#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<InsightDetail> details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "estimatedDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant estimated_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "generationTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Instant generation_timestamp;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.InsightCategory#ADAPTER", jsonName = "insightCategory", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final InsightCategory insight_category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "insightId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String insight_id;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.InsightMethodology#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final InsightMethodology methodology;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "priceAtGeneration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money price_at_generation;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.InsightSentiment#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final InsightSentiment sentiment;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "targetPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money target_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String timeframe;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String title;

    public InsightV2() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public /* synthetic */ InsightV2(Money money, String str, Instant instant, Money money2, List list, InsightCategory insightCategory, InsightMethodology insightMethodology, List list2, Instant instant2, String str2, String str3, InsightSentiment insightSentiment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : money2, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? InsightCategory.INSIGHT_CATEGORY_UNSPECIFIED : insightCategory, (i & 64) != 0 ? InsightMethodology.INSIGHT_METHODOLOGY_UNSPECIFIED : insightMethodology, (i & 128) != 0 ? CollectionsKt.emptyList() : list2, (i & 256) == 0 ? instant2 : null, (i & 512) != 0 ? "" : str2, (i & 1024) == 0 ? str3 : "", (i & 2048) != 0 ? InsightSentiment.INSIGHT_SENTIMENT_UNSPECIFIED : insightSentiment, (i & 4096) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22149newBuilder();
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

    public final Money getPrice_at_generation() {
        return this.price_at_generation;
    }

    public final InsightCategory getInsight_category() {
        return this.insight_category;
    }

    public final InsightMethodology getMethodology() {
        return this.methodology;
    }

    public final Instant getGeneration_timestamp() {
        return this.generation_timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getInsight_id() {
        return this.insight_id;
    }

    public final InsightSentiment getSentiment() {
        return this.sentiment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightV2(Money money, String timeframe, Instant instant, Money money2, List<InsightDetail> details, InsightCategory insight_category, InsightMethodology methodology, List<ArticleSource> article_sources, Instant instant2, String title, String insight_id, InsightSentiment sentiment, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(insight_category, "insight_category");
        Intrinsics.checkNotNullParameter(methodology, "methodology");
        Intrinsics.checkNotNullParameter(article_sources, "article_sources");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(insight_id, "insight_id");
        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.target_price = money;
        this.timeframe = timeframe;
        this.estimated_date = instant;
        this.price_at_generation = money2;
        this.insight_category = insight_category;
        this.methodology = methodology;
        this.generation_timestamp = instant2;
        this.title = title;
        this.insight_id = insight_id;
        this.sentiment = sentiment;
        this.details = Internal.immutableCopyOf(ErrorBundle.DETAIL_ENTRY, details);
        this.article_sources = Internal.immutableCopyOf("article_sources", article_sources);
    }

    public final List<InsightDetail> getDetails() {
        return this.details;
    }

    public final List<ArticleSource> getArticle_sources() {
        return this.article_sources;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22149newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InsightV2)) {
            return false;
        }
        InsightV2 insightV2 = (InsightV2) other;
        return Intrinsics.areEqual(unknownFields(), insightV2.unknownFields()) && Intrinsics.areEqual(this.target_price, insightV2.target_price) && Intrinsics.areEqual(this.timeframe, insightV2.timeframe) && Intrinsics.areEqual(this.estimated_date, insightV2.estimated_date) && Intrinsics.areEqual(this.price_at_generation, insightV2.price_at_generation) && Intrinsics.areEqual(this.details, insightV2.details) && this.insight_category == insightV2.insight_category && this.methodology == insightV2.methodology && Intrinsics.areEqual(this.article_sources, insightV2.article_sources) && Intrinsics.areEqual(this.generation_timestamp, insightV2.generation_timestamp) && Intrinsics.areEqual(this.title, insightV2.title) && Intrinsics.areEqual(this.insight_id, insightV2.insight_id) && this.sentiment == insightV2.sentiment;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.target_price;
        int iHashCode2 = (((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.timeframe.hashCode()) * 37;
        Instant instant = this.estimated_date;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        Money money2 = this.price_at_generation;
        int iHashCode4 = (((((((((iHashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37) + this.details.hashCode()) * 37) + this.insight_category.hashCode()) * 37) + this.methodology.hashCode()) * 37) + this.article_sources.hashCode()) * 37;
        Instant instant2 = this.generation_timestamp;
        int iHashCode5 = ((((((iHashCode4 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.title.hashCode()) * 37) + this.insight_id.hashCode()) * 37) + this.sentiment.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.target_price;
        if (money != null) {
            arrayList.add("target_price=" + money);
        }
        arrayList.add("timeframe=" + Internal.sanitize(this.timeframe));
        Instant instant = this.estimated_date;
        if (instant != null) {
            arrayList.add("estimated_date=" + instant);
        }
        Money money2 = this.price_at_generation;
        if (money2 != null) {
            arrayList.add("price_at_generation=" + money2);
        }
        if (!this.details.isEmpty()) {
            arrayList.add("details=" + this.details);
        }
        arrayList.add("insight_category=" + this.insight_category);
        arrayList.add("methodology=" + this.methodology);
        if (!this.article_sources.isEmpty()) {
            arrayList.add("article_sources=" + this.article_sources);
        }
        Instant instant2 = this.generation_timestamp;
        if (instant2 != null) {
            arrayList.add("generation_timestamp=" + instant2);
        }
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("insight_id=" + Internal.sanitize(this.insight_id));
        arrayList.add("sentiment=" + this.sentiment);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InsightV2{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InsightV2 copy$default(InsightV2 insightV2, Money money, String str, Instant instant, Money money2, List list, InsightCategory insightCategory, InsightMethodology insightMethodology, List list2, Instant instant2, String str2, String str3, InsightSentiment insightSentiment, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            money = insightV2.target_price;
        }
        return insightV2.copy(money, (i & 2) != 0 ? insightV2.timeframe : str, (i & 4) != 0 ? insightV2.estimated_date : instant, (i & 8) != 0 ? insightV2.price_at_generation : money2, (i & 16) != 0 ? insightV2.details : list, (i & 32) != 0 ? insightV2.insight_category : insightCategory, (i & 64) != 0 ? insightV2.methodology : insightMethodology, (i & 128) != 0 ? insightV2.article_sources : list2, (i & 256) != 0 ? insightV2.generation_timestamp : instant2, (i & 512) != 0 ? insightV2.title : str2, (i & 1024) != 0 ? insightV2.insight_id : str3, (i & 2048) != 0 ? insightV2.sentiment : insightSentiment, (i & 4096) != 0 ? insightV2.unknownFields() : byteString);
    }

    public final InsightV2 copy(Money target_price, String timeframe, Instant estimated_date, Money price_at_generation, List<InsightDetail> details, InsightCategory insight_category, InsightMethodology methodology, List<ArticleSource> article_sources, Instant generation_timestamp, String title, String insight_id, InsightSentiment sentiment, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(insight_category, "insight_category");
        Intrinsics.checkNotNullParameter(methodology, "methodology");
        Intrinsics.checkNotNullParameter(article_sources, "article_sources");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(insight_id, "insight_id");
        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InsightV2(target_price, timeframe, estimated_date, price_at_generation, details, insight_category, methodology, article_sources, generation_timestamp, title, insight_id, sentiment, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InsightV2.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InsightV2>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.InsightV2$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InsightV2 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTarget_price() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getTarget_price());
                }
                if (!Intrinsics.areEqual(value.getTimeframe(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTimeframe());
                }
                if (value.getEstimated_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getEstimated_date());
                }
                if (value.getPrice_at_generation() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getPrice_at_generation());
                }
                int iEncodedSizeWithTag = size + InsightDetail.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getDetails());
                if (value.getInsight_category() != InsightCategory.INSIGHT_CATEGORY_UNSPECIFIED) {
                    iEncodedSizeWithTag += InsightCategory.ADAPTER.encodedSizeWithTag(6, value.getInsight_category());
                }
                if (value.getMethodology() != InsightMethodology.INSIGHT_METHODOLOGY_UNSPECIFIED) {
                    iEncodedSizeWithTag += InsightMethodology.ADAPTER.encodedSizeWithTag(7, value.getMethodology());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + ArticleSource.ADAPTER.asRepeated().encodedSizeWithTag(8, value.getArticle_sources());
                if (value.getGeneration_timestamp() != null) {
                    iEncodedSizeWithTag2 += ProtoAdapter.INSTANT.encodedSizeWithTag(9, value.getGeneration_timestamp());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getInsight_id(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getInsight_id());
                }
                return value.getSentiment() != InsightSentiment.INSIGHT_SENTIMENT_UNSPECIFIED ? iEncodedSizeWithTag2 + InsightSentiment.ADAPTER.encodedSizeWithTag(12, value.getSentiment()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InsightV2 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTarget_price() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getTarget_price());
                }
                if (!Intrinsics.areEqual(value.getTimeframe(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTimeframe());
                }
                if (value.getEstimated_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getEstimated_date());
                }
                if (value.getPrice_at_generation() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getPrice_at_generation());
                }
                InsightDetail.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getDetails());
                if (value.getInsight_category() != InsightCategory.INSIGHT_CATEGORY_UNSPECIFIED) {
                    InsightCategory.ADAPTER.encodeWithTag(writer, 6, (int) value.getInsight_category());
                }
                if (value.getMethodology() != InsightMethodology.INSIGHT_METHODOLOGY_UNSPECIFIED) {
                    InsightMethodology.ADAPTER.encodeWithTag(writer, 7, (int) value.getMethodology());
                }
                ArticleSource.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getArticle_sources());
                if (value.getGeneration_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getGeneration_timestamp());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getInsight_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getInsight_id());
                }
                if (value.getSentiment() != InsightSentiment.INSIGHT_SENTIMENT_UNSPECIFIED) {
                    InsightSentiment.ADAPTER.encodeWithTag(writer, 12, (int) value.getSentiment());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InsightV2 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSentiment() != InsightSentiment.INSIGHT_SENTIMENT_UNSPECIFIED) {
                    InsightSentiment.ADAPTER.encodeWithTag(writer, 12, (int) value.getSentiment());
                }
                if (!Intrinsics.areEqual(value.getInsight_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getInsight_id());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getTitle());
                }
                if (value.getGeneration_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 9, (int) value.getGeneration_timestamp());
                }
                ArticleSource.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getArticle_sources());
                if (value.getMethodology() != InsightMethodology.INSIGHT_METHODOLOGY_UNSPECIFIED) {
                    InsightMethodology.ADAPTER.encodeWithTag(writer, 7, (int) value.getMethodology());
                }
                if (value.getInsight_category() != InsightCategory.INSIGHT_CATEGORY_UNSPECIFIED) {
                    InsightCategory.ADAPTER.encodeWithTag(writer, 6, (int) value.getInsight_category());
                }
                InsightDetail.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getDetails());
                if (value.getPrice_at_generation() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getPrice_at_generation());
                }
                if (value.getEstimated_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getEstimated_date());
                }
                if (!Intrinsics.areEqual(value.getTimeframe(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTimeframe());
                }
                if (value.getTarget_price() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getTarget_price());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InsightV2 decode(ProtoReader reader) throws IOException {
                InsightMethodology insightMethodology;
                InsightSentiment insightSentiment;
                Money money;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                InsightCategory insightCategory = InsightCategory.INSIGHT_CATEGORY_UNSPECIFIED;
                InsightMethodology insightMethodology2 = InsightMethodology.INSIGHT_METHODOLOGY_UNSPECIFIED;
                ArrayList arrayList2 = new ArrayList();
                InsightSentiment insightSentiment2 = InsightSentiment.INSIGHT_SENTIMENT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                InsightCategory insightCategoryDecode = insightCategory;
                Instant instantDecode = null;
                Money moneyDecode = null;
                Instant instantDecode2 = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                InsightSentiment insightSentimentDecode = insightSentiment2;
                Money moneyDecode2 = null;
                InsightMethodology insightMethodologyDecode = insightMethodology2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 4:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 5:
                                insightMethodology = insightMethodologyDecode;
                                insightSentiment = insightSentimentDecode;
                                money = moneyDecode2;
                                arrayList.add(InsightDetail.ADAPTER.decode(reader));
                                insightMethodologyDecode = insightMethodology;
                                moneyDecode2 = money;
                                insightSentimentDecode = insightSentiment;
                                break;
                            case 6:
                                insightMethodology = insightMethodologyDecode;
                                insightSentiment = insightSentimentDecode;
                                money = moneyDecode2;
                                try {
                                    insightCategoryDecode = InsightCategory.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                insightMethodologyDecode = insightMethodology;
                                moneyDecode2 = money;
                                insightSentimentDecode = insightSentiment;
                                break;
                            case 7:
                                insightMethodology = insightMethodologyDecode;
                                insightSentiment = insightSentimentDecode;
                                money = moneyDecode2;
                                try {
                                    insightMethodologyDecode = InsightMethodology.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                moneyDecode2 = money;
                                insightSentimentDecode = insightSentiment;
                                break;
                            case 8:
                                insightMethodology = insightMethodologyDecode;
                                insightSentiment = insightSentimentDecode;
                                money = moneyDecode2;
                                arrayList2.add(ArticleSource.ADAPTER.decode(reader));
                                insightMethodologyDecode = insightMethodology;
                                moneyDecode2 = money;
                                insightSentimentDecode = insightSentiment;
                                break;
                            case 9:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 10:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                try {
                                    insightSentimentDecode = InsightSentiment.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    insightMethodology = insightMethodologyDecode;
                                    insightSentiment = insightSentimentDecode;
                                    money = moneyDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                insightMethodology = insightMethodologyDecode;
                                insightSentiment = insightSentimentDecode;
                                money = moneyDecode2;
                                insightMethodologyDecode = insightMethodology;
                                moneyDecode2 = money;
                                insightSentimentDecode = insightSentiment;
                                break;
                        }
                    } else {
                        return new InsightV2(moneyDecode2, strDecode, instantDecode, moneyDecode, arrayList, insightCategoryDecode, insightMethodologyDecode, arrayList2, instantDecode2, strDecode2, strDecode3, insightSentimentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InsightV2 redact(InsightV2 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money target_price = value.getTarget_price();
                Money moneyRedact = target_price != null ? Money.ADAPTER.redact(target_price) : null;
                Instant estimated_date = value.getEstimated_date();
                Instant instantRedact = estimated_date != null ? ProtoAdapter.INSTANT.redact(estimated_date) : null;
                Money price_at_generation = value.getPrice_at_generation();
                Money moneyRedact2 = price_at_generation != null ? Money.ADAPTER.redact(price_at_generation) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getDetails(), InsightDetail.ADAPTER);
                List listM26823redactElements2 = Internal.m26823redactElements(value.getArticle_sources(), ArticleSource.ADAPTER);
                Instant generation_timestamp = value.getGeneration_timestamp();
                return InsightV2.copy$default(value, moneyRedact, null, instantRedact, moneyRedact2, listM26823redactElements, null, null, listM26823redactElements2, generation_timestamp != null ? ProtoAdapter.INSTANT.redact(generation_timestamp) : null, null, null, null, ByteString.EMPTY, 3682, null);
            }
        };
    }
}
