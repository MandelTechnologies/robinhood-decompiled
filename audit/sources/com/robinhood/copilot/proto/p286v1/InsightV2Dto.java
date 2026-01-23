package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.advisory.insights.detail.AdvisoryInsightDetailDeeplinkTarget;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.copilot.proto.p286v1.ArticleSourceDto;
import com.robinhood.copilot.proto.p286v1.InsightCategoryDto;
import com.robinhood.copilot.proto.p286v1.InsightDetailDto;
import com.robinhood.copilot.proto.p286v1.InsightMethodologyDto;
import com.robinhood.copilot.proto.p286v1.InsightSentimentDto;
import com.robinhood.copilot.proto.p286v1.InsightV2Dto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: InsightV2Dto.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004HGIJB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B¡\u0001\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u0006\u0010\u001eJ¥\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00102\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020*H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020*H\u0016¢\u0006\u0004\b3\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b7\u0010$R\u0019\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b:\u00106R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00108F¢\u0006\u0006\u001a\u0004\bA\u0010<R\u0019\u0010\u0019\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\bB\u00109R\u0011\u0010\u001a\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bC\u0010$R\u0011\u0010\u001b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bD\u0010$R\u0011\u0010\u001d\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006K"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightV2Dto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/InsightV2;", "Landroid/os/Parcelable;", "Lcom/robinhood/copilot/proto/v1/InsightV2Dto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/copilot/proto/v1/InsightV2Dto$Surrogate;)V", "Lcom/robinhood/rosetta/common/MoneyDto;", "target_price", "", "timeframe", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "estimated_date", "price_at_generation", "", "Lcom/robinhood/copilot/proto/v1/InsightDetailDto;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;", "insight_category", "Lcom/robinhood/copilot/proto/v1/InsightMethodologyDto;", "methodology", "Lcom/robinhood/copilot/proto/v1/ArticleSourceDto;", "article_sources", "generation_timestamp", "title", AdvisoryInsightDetailDeeplinkTarget.INSIGHT_ID_QUERY_PARAM, "Lcom/robinhood/copilot/proto/v1/InsightSentimentDto;", "sentiment", "(Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;Lcom/robinhood/copilot/proto/v1/InsightMethodologyDto;Ljava/util/List;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/InsightSentimentDto;)V", "copy", "(Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;Lcom/robinhood/copilot/proto/v1/InsightMethodologyDto;Ljava/util/List;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/InsightSentimentDto;)Lcom/robinhood/copilot/proto/v1/InsightV2Dto;", "toProto", "()Lcom/robinhood/copilot/proto/v1/InsightV2;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/copilot/proto/v1/InsightV2Dto$Surrogate;", "getTarget_price", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getTimeframe", "getEstimated_date", "()Lj$/time/Instant;", "getPrice_at_generation", "getDetails", "()Ljava/util/List;", "getInsight_category", "()Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;", "getMethodology", "()Lcom/robinhood/copilot/proto/v1/InsightMethodologyDto;", "getArticle_sources", "getGeneration_timestamp", "getTitle", "getInsight_id", "getSentiment", "()Lcom/robinhood/copilot/proto/v1/InsightSentimentDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class InsightV2Dto implements Dto3<InsightV2>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InsightV2Dto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InsightV2Dto, InsightV2>> binaryBase64Serializer$delegate;
    private static final InsightV2Dto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InsightV2Dto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InsightV2Dto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MoneyDto getTarget_price() {
        return this.surrogate.getTarget_price();
    }

    public final String getTimeframe() {
        return this.surrogate.getTimeframe();
    }

    public final Instant getEstimated_date() {
        return this.surrogate.getEstimated_date();
    }

    public final MoneyDto getPrice_at_generation() {
        return this.surrogate.getPrice_at_generation();
    }

    public final List<InsightDetailDto> getDetails() {
        return this.surrogate.getDetails();
    }

    public final InsightCategoryDto getInsight_category() {
        return this.surrogate.getInsight_category();
    }

    public final InsightMethodologyDto getMethodology() {
        return this.surrogate.getMethodology();
    }

    public final List<ArticleSourceDto> getArticle_sources() {
        return this.surrogate.getArticle_sources();
    }

    public final Instant getGeneration_timestamp() {
        return this.surrogate.getGeneration_timestamp();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getInsight_id() {
        return this.surrogate.getInsight_id();
    }

    public final InsightSentimentDto getSentiment() {
        return this.surrogate.getSentiment();
    }

    public /* synthetic */ InsightV2Dto(MoneyDto moneyDto, String str, Instant instant, MoneyDto moneyDto2, List list, InsightCategoryDto insightCategoryDto, InsightMethodologyDto insightMethodologyDto, List list2, Instant instant2, String str2, String str3, InsightSentimentDto insightSentimentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : moneyDto2, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? InsightCategoryDto.INSTANCE.getZeroValue() : insightCategoryDto, (i & 64) != 0 ? InsightMethodologyDto.INSTANCE.getZeroValue() : insightMethodologyDto, (i & 128) != 0 ? CollectionsKt.emptyList() : list2, (i & 256) == 0 ? instant2 : null, (i & 512) != 0 ? "" : str2, (i & 1024) == 0 ? str3 : "", (i & 2048) != 0 ? InsightSentimentDto.INSTANCE.getZeroValue() : insightSentimentDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InsightV2Dto(MoneyDto moneyDto, String timeframe, Instant instant, MoneyDto moneyDto2, List<InsightDetailDto> details, InsightCategoryDto insight_category, InsightMethodologyDto methodology, List<ArticleSourceDto> article_sources, Instant instant2, String title, String insight_id, InsightSentimentDto sentiment) {
        this(new Surrogate(moneyDto, timeframe, instant, moneyDto2, details, insight_category, methodology, article_sources, instant2, title, insight_id, sentiment));
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(insight_category, "insight_category");
        Intrinsics.checkNotNullParameter(methodology, "methodology");
        Intrinsics.checkNotNullParameter(article_sources, "article_sources");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(insight_id, "insight_id");
        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
    }

    public static /* synthetic */ InsightV2Dto copy$default(InsightV2Dto insightV2Dto, MoneyDto moneyDto, String str, Instant instant, MoneyDto moneyDto2, List list, InsightCategoryDto insightCategoryDto, InsightMethodologyDto insightMethodologyDto, List list2, Instant instant2, String str2, String str3, InsightSentimentDto insightSentimentDto, int i, Object obj) {
        if ((i & 1) != 0) {
            moneyDto = insightV2Dto.surrogate.getTarget_price();
        }
        if ((i & 2) != 0) {
            str = insightV2Dto.surrogate.getTimeframe();
        }
        if ((i & 4) != 0) {
            instant = insightV2Dto.surrogate.getEstimated_date();
        }
        if ((i & 8) != 0) {
            moneyDto2 = insightV2Dto.surrogate.getPrice_at_generation();
        }
        if ((i & 16) != 0) {
            list = insightV2Dto.surrogate.getDetails();
        }
        if ((i & 32) != 0) {
            insightCategoryDto = insightV2Dto.surrogate.getInsight_category();
        }
        if ((i & 64) != 0) {
            insightMethodologyDto = insightV2Dto.surrogate.getMethodology();
        }
        if ((i & 128) != 0) {
            list2 = insightV2Dto.surrogate.getArticle_sources();
        }
        if ((i & 256) != 0) {
            instant2 = insightV2Dto.surrogate.getGeneration_timestamp();
        }
        if ((i & 512) != 0) {
            str2 = insightV2Dto.surrogate.getTitle();
        }
        if ((i & 1024) != 0) {
            str3 = insightV2Dto.surrogate.getInsight_id();
        }
        if ((i & 2048) != 0) {
            insightSentimentDto = insightV2Dto.surrogate.getSentiment();
        }
        String str4 = str3;
        InsightSentimentDto insightSentimentDto2 = insightSentimentDto;
        Instant instant3 = instant2;
        String str5 = str2;
        InsightMethodologyDto insightMethodologyDto2 = insightMethodologyDto;
        List list3 = list2;
        List list4 = list;
        InsightCategoryDto insightCategoryDto2 = insightCategoryDto;
        return insightV2Dto.copy(moneyDto, str, instant, moneyDto2, list4, insightCategoryDto2, insightMethodologyDto2, list3, instant3, str5, str4, insightSentimentDto2);
    }

    public final InsightV2Dto copy(MoneyDto target_price, String timeframe, Instant estimated_date, MoneyDto price_at_generation, List<InsightDetailDto> details, InsightCategoryDto insight_category, InsightMethodologyDto methodology, List<ArticleSourceDto> article_sources, Instant generation_timestamp, String title, String insight_id, InsightSentimentDto sentiment) {
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(insight_category, "insight_category");
        Intrinsics.checkNotNullParameter(methodology, "methodology");
        Intrinsics.checkNotNullParameter(article_sources, "article_sources");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(insight_id, "insight_id");
        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
        return new InsightV2Dto(new Surrogate(target_price, timeframe, estimated_date, price_at_generation, details, insight_category, methodology, article_sources, generation_timestamp, title, insight_id, sentiment));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public InsightV2 toProto() {
        MoneyDto target_price = this.surrogate.getTarget_price();
        Money proto = target_price != null ? target_price.toProto() : null;
        String timeframe = this.surrogate.getTimeframe();
        Instant estimated_date = this.surrogate.getEstimated_date();
        MoneyDto price_at_generation = this.surrogate.getPrice_at_generation();
        Money proto2 = price_at_generation != null ? price_at_generation.toProto() : null;
        List<InsightDetailDto> details = this.surrogate.getDetails();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(details, 10));
        Iterator<T> it = details.iterator();
        while (it.hasNext()) {
            arrayList.add(((InsightDetailDto) it.next()).toProto());
        }
        InsightCategory insightCategory = (InsightCategory) this.surrogate.getInsight_category().toProto();
        InsightMethodology insightMethodology = (InsightMethodology) this.surrogate.getMethodology().toProto();
        List<ArticleSourceDto> article_sources = this.surrogate.getArticle_sources();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(article_sources, 10));
        Iterator<T> it2 = article_sources.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ArticleSourceDto) it2.next()).toProto());
        }
        return new InsightV2(proto, timeframe, estimated_date, proto2, arrayList, insightCategory, insightMethodology, arrayList2, this.surrogate.getGeneration_timestamp(), this.surrogate.getTitle(), this.surrogate.getInsight_id(), (InsightSentiment) this.surrogate.getSentiment().toProto(), null, 4096, null);
    }

    public String toString() {
        return "[InsightV2Dto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InsightV2Dto) && Intrinsics.areEqual(((InsightV2Dto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InsightV2Dto.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b%\b\u0083\b\u0018\u0000 g2\u00020\u0001:\u0002hgBÛ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r\u0012.\b\u0002\u0010\u0016\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u009f\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J'\u0010*\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b-\u0010.J6\u0010/\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010,J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b6\u00107J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\u00140\rHÆ\u0003¢\u0006\u0004\b8\u00103J6\u00109\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b9\u00100J\u0010\u0010:\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b:\u0010.J\u0010\u0010;\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b;\u0010.J\u0010\u0010<\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b<\u0010=Jä\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r2.\b\u0002\u0010\u0016\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0019HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b@\u0010.J\u0010\u0010A\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\bA\u0010BJ\u001a\u0010E\u001a\u00020D2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bE\u0010FR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010G\u0012\u0004\bI\u0010J\u001a\u0004\bH\u0010,R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010K\u0012\u0004\bM\u0010J\u001a\u0004\bL\u0010.RF\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010N\u0012\u0004\bP\u0010J\u001a\u0004\bO\u00100R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010G\u0012\u0004\bR\u0010J\u001a\u0004\bQ\u0010,R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010S\u0012\u0004\bU\u0010J\u001a\u0004\bT\u00103R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010V\u0012\u0004\bX\u0010J\u001a\u0004\bW\u00105R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010Y\u0012\u0004\b[\u0010J\u001a\u0004\bZ\u00107R&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010S\u0012\u0004\b]\u0010J\u001a\u0004\b\\\u00103RF\u0010\u0016\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010N\u0012\u0004\b_\u0010J\u001a\u0004\b^\u00100R \u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010K\u0012\u0004\ba\u0010J\u001a\u0004\b`\u0010.R \u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010K\u0012\u0004\bc\u0010J\u001a\u0004\bb\u0010.R \u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010d\u0012\u0004\bf\u0010J\u001a\u0004\be\u0010=¨\u0006i"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightV2Dto$Surrogate;", "", "Lcom/robinhood/rosetta/common/MoneyDto;", "target_price", "", "timeframe", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "estimated_date", "price_at_generation", "", "Lcom/robinhood/copilot/proto/v1/InsightDetailDto;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;", "insight_category", "Lcom/robinhood/copilot/proto/v1/InsightMethodologyDto;", "methodology", "Lcom/robinhood/copilot/proto/v1/ArticleSourceDto;", "article_sources", "generation_timestamp", "title", AdvisoryInsightDetailDeeplinkTarget.INSIGHT_ID_QUERY_PARAM, "Lcom/robinhood/copilot/proto/v1/InsightSentimentDto;", "sentiment", "<init>", "(Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;Lcom/robinhood/copilot/proto/v1/InsightMethodologyDto;Ljava/util/List;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/InsightSentimentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;Lcom/robinhood/copilot/proto/v1/InsightMethodologyDto;Ljava/util/List;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/InsightSentimentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_service_v1_externalRelease", "(Lcom/robinhood/copilot/proto/v1/InsightV2Dto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component2", "()Ljava/lang/String;", "component3", "()Lj$/time/Instant;", "component4", "component5", "()Ljava/util/List;", "component6", "()Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;", "component7", "()Lcom/robinhood/copilot/proto/v1/InsightMethodologyDto;", "component8", "component9", "component10", "component11", "component12", "()Lcom/robinhood/copilot/proto/v1/InsightSentimentDto;", "copy", "(Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;Lcom/robinhood/copilot/proto/v1/InsightMethodologyDto;Ljava/util/List;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/InsightSentimentDto;)Lcom/robinhood/copilot/proto/v1/InsightV2Dto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/common/MoneyDto;", "getTarget_price", "getTarget_price$annotations", "()V", "Ljava/lang/String;", "getTimeframe", "getTimeframe$annotations", "Lj$/time/Instant;", "getEstimated_date", "getEstimated_date$annotations", "getPrice_at_generation", "getPrice_at_generation$annotations", "Ljava/util/List;", "getDetails", "getDetails$annotations", "Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;", "getInsight_category", "getInsight_category$annotations", "Lcom/robinhood/copilot/proto/v1/InsightMethodologyDto;", "getMethodology", "getMethodology$annotations", "getArticle_sources", "getArticle_sources$annotations", "getGeneration_timestamp", "getGeneration_timestamp$annotations", "getTitle", "getTitle$annotations", "getInsight_id", "getInsight_id$annotations", "Lcom/robinhood/copilot/proto/v1/InsightSentimentDto;", "getSentiment", "getSentiment$annotations", "Companion", "$serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<ArticleSourceDto> article_sources;
        private final List<InsightDetailDto> details;
        private final Instant estimated_date;
        private final Instant generation_timestamp;
        private final InsightCategoryDto insight_category;
        private final String insight_id;
        private final InsightMethodologyDto methodology;
        private final MoneyDto price_at_generation;
        private final InsightSentimentDto sentiment;
        private final MoneyDto target_price;
        private final String timeframe;
        private final String title;

        public Surrogate() {
            this((MoneyDto) null, (String) null, (Instant) null, (MoneyDto) null, (List) null, (InsightCategoryDto) null, (InsightMethodologyDto) null, (List) null, (Instant) null, (String) null, (String) null, (InsightSentimentDto) null, 4095, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(InsightDetailDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(ArticleSourceDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, MoneyDto moneyDto, String str, Instant instant, MoneyDto moneyDto2, List list, InsightCategoryDto insightCategoryDto, InsightMethodologyDto insightMethodologyDto, List list2, Instant instant2, String str2, String str3, InsightSentimentDto insightSentimentDto, int i, Object obj) {
            if ((i & 1) != 0) {
                moneyDto = surrogate.target_price;
            }
            if ((i & 2) != 0) {
                str = surrogate.timeframe;
            }
            if ((i & 4) != 0) {
                instant = surrogate.estimated_date;
            }
            if ((i & 8) != 0) {
                moneyDto2 = surrogate.price_at_generation;
            }
            if ((i & 16) != 0) {
                list = surrogate.details;
            }
            if ((i & 32) != 0) {
                insightCategoryDto = surrogate.insight_category;
            }
            if ((i & 64) != 0) {
                insightMethodologyDto = surrogate.methodology;
            }
            if ((i & 128) != 0) {
                list2 = surrogate.article_sources;
            }
            if ((i & 256) != 0) {
                instant2 = surrogate.generation_timestamp;
            }
            if ((i & 512) != 0) {
                str2 = surrogate.title;
            }
            if ((i & 1024) != 0) {
                str3 = surrogate.insight_id;
            }
            if ((i & 2048) != 0) {
                insightSentimentDto = surrogate.sentiment;
            }
            String str4 = str3;
            InsightSentimentDto insightSentimentDto2 = insightSentimentDto;
            Instant instant3 = instant2;
            String str5 = str2;
            InsightMethodologyDto insightMethodologyDto2 = insightMethodologyDto;
            List list3 = list2;
            List list4 = list;
            InsightCategoryDto insightCategoryDto2 = insightCategoryDto;
            return surrogate.copy(moneyDto, str, instant, moneyDto2, list4, insightCategoryDto2, insightMethodologyDto2, list3, instant3, str5, str4, insightSentimentDto2);
        }

        @SerialName("articleSources")
        @JsonAnnotations2(names = {"article_sources"})
        public static /* synthetic */ void getArticle_sources$annotations() {
        }

        @SerialName(ErrorBundle.DETAIL_ENTRY)
        @JsonAnnotations2(names = {ErrorBundle.DETAIL_ENTRY})
        public static /* synthetic */ void getDetails$annotations() {
        }

        @SerialName("estimatedDate")
        @JsonAnnotations2(names = {"estimated_date"})
        public static /* synthetic */ void getEstimated_date$annotations() {
        }

        @SerialName("generationTimestamp")
        @JsonAnnotations2(names = {"generation_timestamp"})
        public static /* synthetic */ void getGeneration_timestamp$annotations() {
        }

        @SerialName("insightCategory")
        @JsonAnnotations2(names = {"insight_category"})
        public static /* synthetic */ void getInsight_category$annotations() {
        }

        @SerialName("insightId")
        @JsonAnnotations2(names = {AdvisoryInsightDetailDeeplinkTarget.INSIGHT_ID_QUERY_PARAM})
        public static /* synthetic */ void getInsight_id$annotations() {
        }

        @SerialName("methodology")
        @JsonAnnotations2(names = {"methodology"})
        public static /* synthetic */ void getMethodology$annotations() {
        }

        @SerialName("priceAtGeneration")
        @JsonAnnotations2(names = {"price_at_generation"})
        public static /* synthetic */ void getPrice_at_generation$annotations() {
        }

        @SerialName("sentiment")
        @JsonAnnotations2(names = {"sentiment"})
        public static /* synthetic */ void getSentiment$annotations() {
        }

        @SerialName("targetPrice")
        @JsonAnnotations2(names = {"target_price"})
        public static /* synthetic */ void getTarget_price$annotations() {
        }

        @SerialName("timeframe")
        @JsonAnnotations2(names = {"timeframe"})
        public static /* synthetic */ void getTimeframe$annotations() {
        }

        @SerialName("title")
        @JsonAnnotations2(names = {"title"})
        public static /* synthetic */ void getTitle$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final MoneyDto getTarget_price() {
            return this.target_price;
        }

        /* renamed from: component10, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component11, reason: from getter */
        public final String getInsight_id() {
            return this.insight_id;
        }

        /* renamed from: component12, reason: from getter */
        public final InsightSentimentDto getSentiment() {
            return this.sentiment;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTimeframe() {
            return this.timeframe;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getEstimated_date() {
            return this.estimated_date;
        }

        /* renamed from: component4, reason: from getter */
        public final MoneyDto getPrice_at_generation() {
            return this.price_at_generation;
        }

        public final List<InsightDetailDto> component5() {
            return this.details;
        }

        /* renamed from: component6, reason: from getter */
        public final InsightCategoryDto getInsight_category() {
            return this.insight_category;
        }

        /* renamed from: component7, reason: from getter */
        public final InsightMethodologyDto getMethodology() {
            return this.methodology;
        }

        public final List<ArticleSourceDto> component8() {
            return this.article_sources;
        }

        /* renamed from: component9, reason: from getter */
        public final Instant getGeneration_timestamp() {
            return this.generation_timestamp;
        }

        public final Surrogate copy(MoneyDto target_price, String timeframe, Instant estimated_date, MoneyDto price_at_generation, List<InsightDetailDto> details, InsightCategoryDto insight_category, InsightMethodologyDto methodology, List<ArticleSourceDto> article_sources, Instant generation_timestamp, String title, String insight_id, InsightSentimentDto sentiment) {
            Intrinsics.checkNotNullParameter(timeframe, "timeframe");
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(insight_category, "insight_category");
            Intrinsics.checkNotNullParameter(methodology, "methodology");
            Intrinsics.checkNotNullParameter(article_sources, "article_sources");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(insight_id, "insight_id");
            Intrinsics.checkNotNullParameter(sentiment, "sentiment");
            return new Surrogate(target_price, timeframe, estimated_date, price_at_generation, details, insight_category, methodology, article_sources, generation_timestamp, title, insight_id, sentiment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.target_price, surrogate.target_price) && Intrinsics.areEqual(this.timeframe, surrogate.timeframe) && Intrinsics.areEqual(this.estimated_date, surrogate.estimated_date) && Intrinsics.areEqual(this.price_at_generation, surrogate.price_at_generation) && Intrinsics.areEqual(this.details, surrogate.details) && this.insight_category == surrogate.insight_category && this.methodology == surrogate.methodology && Intrinsics.areEqual(this.article_sources, surrogate.article_sources) && Intrinsics.areEqual(this.generation_timestamp, surrogate.generation_timestamp) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.insight_id, surrogate.insight_id) && this.sentiment == surrogate.sentiment;
        }

        public int hashCode() {
            MoneyDto moneyDto = this.target_price;
            int iHashCode = (((moneyDto == null ? 0 : moneyDto.hashCode()) * 31) + this.timeframe.hashCode()) * 31;
            Instant instant = this.estimated_date;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            MoneyDto moneyDto2 = this.price_at_generation;
            int iHashCode3 = (((((((((iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31) + this.details.hashCode()) * 31) + this.insight_category.hashCode()) * 31) + this.methodology.hashCode()) * 31) + this.article_sources.hashCode()) * 31;
            Instant instant2 = this.generation_timestamp;
            return ((((((iHashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + this.insight_id.hashCode()) * 31) + this.sentiment.hashCode();
        }

        public String toString() {
            return "Surrogate(target_price=" + this.target_price + ", timeframe=" + this.timeframe + ", estimated_date=" + this.estimated_date + ", price_at_generation=" + this.price_at_generation + ", details=" + this.details + ", insight_category=" + this.insight_category + ", methodology=" + this.methodology + ", article_sources=" + this.article_sources + ", generation_timestamp=" + this.generation_timestamp + ", title=" + this.title + ", insight_id=" + this.insight_id + ", sentiment=" + this.sentiment + ")";
        }

        /* compiled from: InsightV2Dto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightV2Dto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/InsightV2Dto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InsightV2Dto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.copilot.proto.v1.InsightV2Dto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InsightV2Dto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.copilot.proto.v1.InsightV2Dto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InsightV2Dto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, MoneyDto moneyDto, String str, Instant instant, MoneyDto moneyDto2, List list, InsightCategoryDto insightCategoryDto, InsightMethodologyDto insightMethodologyDto, List list2, Instant instant2, String str2, String str3, InsightSentimentDto insightSentimentDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.target_price = null;
            } else {
                this.target_price = moneyDto;
            }
            if ((i & 2) == 0) {
                this.timeframe = "";
            } else {
                this.timeframe = str;
            }
            if ((i & 4) == 0) {
                this.estimated_date = null;
            } else {
                this.estimated_date = instant;
            }
            if ((i & 8) == 0) {
                this.price_at_generation = null;
            } else {
                this.price_at_generation = moneyDto2;
            }
            if ((i & 16) == 0) {
                this.details = CollectionsKt.emptyList();
            } else {
                this.details = list;
            }
            if ((i & 32) == 0) {
                this.insight_category = InsightCategoryDto.INSTANCE.getZeroValue();
            } else {
                this.insight_category = insightCategoryDto;
            }
            if ((i & 64) == 0) {
                this.methodology = InsightMethodologyDto.INSTANCE.getZeroValue();
            } else {
                this.methodology = insightMethodologyDto;
            }
            if ((i & 128) == 0) {
                this.article_sources = CollectionsKt.emptyList();
            } else {
                this.article_sources = list2;
            }
            if ((i & 256) == 0) {
                this.generation_timestamp = null;
            } else {
                this.generation_timestamp = instant2;
            }
            if ((i & 512) == 0) {
                this.title = "";
            } else {
                this.title = str2;
            }
            if ((i & 1024) == 0) {
                this.insight_id = "";
            } else {
                this.insight_id = str3;
            }
            if ((i & 2048) == 0) {
                this.sentiment = InsightSentimentDto.INSTANCE.getZeroValue();
            } else {
                this.sentiment = insightSentimentDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            MoneyDto moneyDto = self.target_price;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.timeframe, "")) {
                output.encodeStringElement(serialDesc, 1, self.timeframe);
            }
            Instant instant = self.estimated_date;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            MoneyDto moneyDto2 = self.price_at_generation;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            if (!Intrinsics.areEqual(self.details, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.details);
            }
            if (self.insight_category != InsightCategoryDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, InsightCategoryDto.Serializer.INSTANCE, self.insight_category);
            }
            if (self.methodology != InsightMethodologyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, InsightMethodologyDto.Serializer.INSTANCE, self.methodology);
            }
            if (!Intrinsics.areEqual(self.article_sources, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.article_sources);
            }
            Instant instant2 = self.generation_timestamp;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, WireInstantSerializer.INSTANCE, instant2);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 9, self.title);
            }
            if (!Intrinsics.areEqual(self.insight_id, "")) {
                output.encodeStringElement(serialDesc, 10, self.insight_id);
            }
            if (self.sentiment != InsightSentimentDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 11, InsightSentimentDto.Serializer.INSTANCE, self.sentiment);
            }
        }

        public Surrogate(MoneyDto moneyDto, String timeframe, Instant instant, MoneyDto moneyDto2, List<InsightDetailDto> details, InsightCategoryDto insight_category, InsightMethodologyDto methodology, List<ArticleSourceDto> article_sources, Instant instant2, String title, String insight_id, InsightSentimentDto sentiment) {
            Intrinsics.checkNotNullParameter(timeframe, "timeframe");
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(insight_category, "insight_category");
            Intrinsics.checkNotNullParameter(methodology, "methodology");
            Intrinsics.checkNotNullParameter(article_sources, "article_sources");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(insight_id, "insight_id");
            Intrinsics.checkNotNullParameter(sentiment, "sentiment");
            this.target_price = moneyDto;
            this.timeframe = timeframe;
            this.estimated_date = instant;
            this.price_at_generation = moneyDto2;
            this.details = details;
            this.insight_category = insight_category;
            this.methodology = methodology;
            this.article_sources = article_sources;
            this.generation_timestamp = instant2;
            this.title = title;
            this.insight_id = insight_id;
            this.sentiment = sentiment;
        }

        public /* synthetic */ Surrogate(MoneyDto moneyDto, String str, Instant instant, MoneyDto moneyDto2, List list, InsightCategoryDto insightCategoryDto, InsightMethodologyDto insightMethodologyDto, List list2, Instant instant2, String str2, String str3, InsightSentimentDto insightSentimentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : moneyDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : moneyDto2, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? InsightCategoryDto.INSTANCE.getZeroValue() : insightCategoryDto, (i & 64) != 0 ? InsightMethodologyDto.INSTANCE.getZeroValue() : insightMethodologyDto, (i & 128) != 0 ? CollectionsKt.emptyList() : list2, (i & 256) == 0 ? instant2 : null, (i & 512) != 0 ? "" : str2, (i & 1024) == 0 ? str3 : "", (i & 2048) != 0 ? InsightSentimentDto.INSTANCE.getZeroValue() : insightSentimentDto);
        }

        public final MoneyDto getTarget_price() {
            return this.target_price;
        }

        public final String getTimeframe() {
            return this.timeframe;
        }

        public final Instant getEstimated_date() {
            return this.estimated_date;
        }

        public final MoneyDto getPrice_at_generation() {
            return this.price_at_generation;
        }

        public final List<InsightDetailDto> getDetails() {
            return this.details;
        }

        public final InsightCategoryDto getInsight_category() {
            return this.insight_category;
        }

        public final InsightMethodologyDto getMethodology() {
            return this.methodology;
        }

        public final List<ArticleSourceDto> getArticle_sources() {
            return this.article_sources;
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

        public final InsightSentimentDto getSentiment() {
            return this.sentiment;
        }
    }

    /* compiled from: InsightV2Dto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightV2Dto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/InsightV2Dto;", "Lcom/robinhood/copilot/proto/v1/InsightV2;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/InsightV2Dto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InsightV2Dto, InsightV2> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InsightV2Dto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InsightV2Dto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InsightV2Dto> getBinaryBase64Serializer() {
            return (KSerializer) InsightV2Dto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InsightV2> getProtoAdapter() {
            return InsightV2.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InsightV2Dto getZeroValue() {
            return InsightV2Dto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InsightV2Dto fromProto(InsightV2 proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Money target_price = proto.getTarget_price();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = target_price != null ? MoneyDto.INSTANCE.fromProto(target_price) : null;
            String timeframe = proto.getTimeframe();
            Instant estimated_date = proto.getEstimated_date();
            Money price_at_generation = proto.getPrice_at_generation();
            MoneyDto moneyDtoFromProto2 = price_at_generation != null ? MoneyDto.INSTANCE.fromProto(price_at_generation) : null;
            List<InsightDetail> details = proto.getDetails();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(details, 10));
            Iterator<T> it = details.iterator();
            while (it.hasNext()) {
                arrayList.add(InsightDetailDto.INSTANCE.fromProto((InsightDetail) it.next()));
            }
            InsightCategoryDto insightCategoryDtoFromProto = InsightCategoryDto.INSTANCE.fromProto(proto.getInsight_category());
            InsightMethodologyDto insightMethodologyDtoFromProto = InsightMethodologyDto.INSTANCE.fromProto(proto.getMethodology());
            List<ArticleSource> article_sources = proto.getArticle_sources();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(article_sources, 10));
            Iterator<T> it2 = article_sources.iterator();
            while (it2.hasNext()) {
                arrayList2.add(ArticleSourceDto.INSTANCE.fromProto((ArticleSource) it2.next()));
            }
            return new InsightV2Dto(new Surrogate(moneyDtoFromProto, timeframe, estimated_date, moneyDtoFromProto2, arrayList, insightCategoryDtoFromProto, insightMethodologyDtoFromProto, arrayList2, proto.getGeneration_timestamp(), proto.getTitle(), proto.getInsight_id(), InsightSentimentDto.INSTANCE.fromProto(proto.getSentiment())), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.InsightV2Dto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InsightV2Dto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new InsightV2Dto(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InsightV2Dto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightV2Dto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/InsightV2Dto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/InsightV2Dto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InsightV2Dto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.InsightV2", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InsightV2Dto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InsightV2Dto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InsightV2Dto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InsightV2Dto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightV2Dto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.InsightV2Dto";
        }
    }
}
