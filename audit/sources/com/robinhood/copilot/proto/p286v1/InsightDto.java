package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.copilot.proto.p286v1.ArticleSourceDto;
import com.robinhood.copilot.proto.p286v1.InsightCategoryDto;
import com.robinhood.copilot.proto.p286v1.InsightDto;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;

/* compiled from: InsightDto.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004?>@AB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0089\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f¢\u0006\u0004\b\u0006\u0010\u0019J\u008d\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\b2\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020%H\u0016¢\u0006\u0004\b.\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001fR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\f8F¢\u0006\u0006\u001a\u0004\b5\u00104R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b8\u0010\u001fR\u0019\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f8F¢\u0006\u0006\u001a\u0004\b=\u00104¨\u0006B"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/Insight;", "Landroid/os/Parcelable;", "Lcom/robinhood/copilot/proto/v1/InsightDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/copilot/proto/v1/InsightDto$Surrogate;)V", "", "title", "description", "rationale", "", "supporting_data", "article_ids", "Lcom/robinhood/rosetta/common/MoneyDto;", "target_price", "timeframe", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "estimated_date", "Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;", "insight_category", "Lcom/robinhood/copilot/proto/v1/ArticleSourceDto;", "article_sources", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;Ljava/util/List;)Lcom/robinhood/copilot/proto/v1/InsightDto;", "toProto", "()Lcom/robinhood/copilot/proto/v1/Insight;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/copilot/proto/v1/InsightDto$Surrogate;", "getTitle", "getDescription", "getRationale", "getSupporting_data", "()Ljava/util/List;", "getArticle_ids", "getTarget_price", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getTimeframe", "getEstimated_date", "()Lj$/time/Instant;", "getInsight_category", "()Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;", "getArticle_sources", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class InsightDto implements Dto3<Insight>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InsightDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InsightDto, Insight>> binaryBase64Serializer$delegate;
    private static final InsightDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InsightDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InsightDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final String getRationale() {
        return this.surrogate.getRationale();
    }

    public final List<String> getSupporting_data() {
        return this.surrogate.getSupporting_data();
    }

    public final List<String> getArticle_ids() {
        return this.surrogate.getArticle_ids();
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

    public final InsightCategoryDto getInsight_category() {
        return this.surrogate.getInsight_category();
    }

    public final List<ArticleSourceDto> getArticle_sources() {
        return this.surrogate.getArticle_sources();
    }

    public /* synthetic */ InsightDto(String str, String str2, String str3, List list, List list2, MoneyDto moneyDto, String str4, Instant instant, InsightCategoryDto insightCategoryDto, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? CollectionsKt.emptyList() : list2, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? null : instant, (i & 256) != 0 ? InsightCategoryDto.INSTANCE.getZeroValue() : insightCategoryDto, (i & 512) != 0 ? CollectionsKt.emptyList() : list3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InsightDto(String title, String description, String rationale, List<String> supporting_data, List<String> article_ids, MoneyDto moneyDto, String timeframe, Instant instant, InsightCategoryDto insight_category, List<ArticleSourceDto> article_sources) {
        this(new Surrogate(title, description, rationale, supporting_data, article_ids, moneyDto, timeframe, instant, insight_category, article_sources));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(rationale, "rationale");
        Intrinsics.checkNotNullParameter(supporting_data, "supporting_data");
        Intrinsics.checkNotNullParameter(article_ids, "article_ids");
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(insight_category, "insight_category");
        Intrinsics.checkNotNullParameter(article_sources, "article_sources");
    }

    public static /* synthetic */ InsightDto copy$default(InsightDto insightDto, String str, String str2, String str3, List list, List list2, MoneyDto moneyDto, String str4, Instant instant, InsightCategoryDto insightCategoryDto, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = insightDto.surrogate.getTitle();
        }
        if ((i & 2) != 0) {
            str2 = insightDto.surrogate.getDescription();
        }
        if ((i & 4) != 0) {
            str3 = insightDto.surrogate.getRationale();
        }
        if ((i & 8) != 0) {
            list = insightDto.surrogate.getSupporting_data();
        }
        if ((i & 16) != 0) {
            list2 = insightDto.surrogate.getArticle_ids();
        }
        if ((i & 32) != 0) {
            moneyDto = insightDto.surrogate.getTarget_price();
        }
        if ((i & 64) != 0) {
            str4 = insightDto.surrogate.getTimeframe();
        }
        if ((i & 128) != 0) {
            instant = insightDto.surrogate.getEstimated_date();
        }
        if ((i & 256) != 0) {
            insightCategoryDto = insightDto.surrogate.getInsight_category();
        }
        if ((i & 512) != 0) {
            list3 = insightDto.surrogate.getArticle_sources();
        }
        InsightCategoryDto insightCategoryDto2 = insightCategoryDto;
        List list4 = list3;
        String str5 = str4;
        Instant instant2 = instant;
        List list5 = list2;
        MoneyDto moneyDto2 = moneyDto;
        return insightDto.copy(str, str2, str3, list, list5, moneyDto2, str5, instant2, insightCategoryDto2, list4);
    }

    public final InsightDto copy(String title, String description, String rationale, List<String> supporting_data, List<String> article_ids, MoneyDto target_price, String timeframe, Instant estimated_date, InsightCategoryDto insight_category, List<ArticleSourceDto> article_sources) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(rationale, "rationale");
        Intrinsics.checkNotNullParameter(supporting_data, "supporting_data");
        Intrinsics.checkNotNullParameter(article_ids, "article_ids");
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(insight_category, "insight_category");
        Intrinsics.checkNotNullParameter(article_sources, "article_sources");
        return new InsightDto(new Surrogate(title, description, rationale, supporting_data, article_ids, target_price, timeframe, estimated_date, insight_category, article_sources));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Insight toProto() {
        String title = this.surrogate.getTitle();
        String description = this.surrogate.getDescription();
        String rationale = this.surrogate.getRationale();
        List<String> supporting_data = this.surrogate.getSupporting_data();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(supporting_data, 10));
        Iterator<T> it = supporting_data.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        List<String> article_ids = this.surrogate.getArticle_ids();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(article_ids, 10));
        Iterator<T> it2 = article_ids.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) it2.next());
        }
        MoneyDto target_price = this.surrogate.getTarget_price();
        Money proto = target_price != null ? target_price.toProto() : null;
        String timeframe = this.surrogate.getTimeframe();
        Instant estimated_date = this.surrogate.getEstimated_date();
        InsightCategory insightCategory = (InsightCategory) this.surrogate.getInsight_category().toProto();
        List<ArticleSourceDto> article_sources = this.surrogate.getArticle_sources();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(article_sources, 10));
        Iterator<T> it3 = article_sources.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((ArticleSourceDto) it3.next()).toProto());
        }
        return new Insight(title, description, rationale, arrayList, arrayList2, proto, timeframe, estimated_date, insightCategory, arrayList3, null, 1024, null);
    }

    public String toString() {
        return "[InsightDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InsightDto) && Intrinsics.areEqual(((InsightDto) other).surrogate, this.surrogate);
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
    /* compiled from: InsightDto.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0083\b\u0018\u0000 X2\u00020\u0001:\u0002YXB¥\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012.\b\u0002\u0010\u0011\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006¢\u0006\u0004\b\u0016\u0010\u0017B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010'J6\u00100\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b2\u00103J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006HÆ\u0003¢\u0006\u0004\b4\u0010+J®\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022.\b\u0002\u0010\u0011\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010'J\u0010\u00108\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010'R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010>\u0012\u0004\bC\u0010A\u001a\u0004\bB\u0010'R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010>\u0012\u0004\bE\u0010A\u001a\u0004\bD\u0010'R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010F\u0012\u0004\bH\u0010A\u001a\u0004\bG\u0010+R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010F\u0012\u0004\bJ\u0010A\u001a\u0004\bI\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010K\u0012\u0004\bM\u0010A\u001a\u0004\bL\u0010.R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010>\u0012\u0004\bO\u0010A\u001a\u0004\bN\u0010'RF\u0010\u0011\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010P\u0012\u0004\bR\u0010A\u001a\u0004\bQ\u00101R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010S\u0012\u0004\bU\u0010A\u001a\u0004\bT\u00103R&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010F\u0012\u0004\bW\u0010A\u001a\u0004\bV\u0010+¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightDto$Surrogate;", "", "", "title", "description", "rationale", "", "supporting_data", "article_ids", "Lcom/robinhood/rosetta/common/MoneyDto;", "target_price", "timeframe", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "estimated_date", "Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;", "insight_category", "Lcom/robinhood/copilot/proto/v1/ArticleSourceDto;", "article_sources", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_service_v1_externalRelease", "(Lcom/robinhood/copilot/proto/v1/InsightDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component7", "component8", "()Lj$/time/Instant;", "component9", "()Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;Ljava/util/List;)Lcom/robinhood/copilot/proto/v1/InsightDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "getRationale", "getRationale$annotations", "Ljava/util/List;", "getSupporting_data", "getSupporting_data$annotations", "getArticle_ids", "getArticle_ids$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getTarget_price", "getTarget_price$annotations", "getTimeframe", "getTimeframe$annotations", "Lj$/time/Instant;", "getEstimated_date", "getEstimated_date$annotations", "Lcom/robinhood/copilot/proto/v1/InsightCategoryDto;", "getInsight_category", "getInsight_category$annotations", "getArticle_sources", "getArticle_sources$annotations", "Companion", "$serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<String> article_ids;
        private final List<ArticleSourceDto> article_sources;
        private final String description;
        private final Instant estimated_date;
        private final InsightCategoryDto insight_category;
        private final String rationale;
        private final List<String> supporting_data;
        private final MoneyDto target_price;
        private final String timeframe;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (List) null, (List) null, (MoneyDto) null, (String) null, (Instant) null, (InsightCategoryDto) null, (List) null, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(ArticleSourceDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, List list, List list2, MoneyDto moneyDto, String str4, Instant instant, InsightCategoryDto insightCategoryDto, List list3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.title;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.description;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.rationale;
            }
            if ((i & 8) != 0) {
                list = surrogate.supporting_data;
            }
            if ((i & 16) != 0) {
                list2 = surrogate.article_ids;
            }
            if ((i & 32) != 0) {
                moneyDto = surrogate.target_price;
            }
            if ((i & 64) != 0) {
                str4 = surrogate.timeframe;
            }
            if ((i & 128) != 0) {
                instant = surrogate.estimated_date;
            }
            if ((i & 256) != 0) {
                insightCategoryDto = surrogate.insight_category;
            }
            if ((i & 512) != 0) {
                list3 = surrogate.article_sources;
            }
            InsightCategoryDto insightCategoryDto2 = insightCategoryDto;
            List list4 = list3;
            String str5 = str4;
            Instant instant2 = instant;
            List list5 = list2;
            MoneyDto moneyDto2 = moneyDto;
            return surrogate.copy(str, str2, str3, list, list5, moneyDto2, str5, instant2, insightCategoryDto2, list4);
        }

        @SerialName("articleIds")
        @JsonAnnotations2(names = {"article_ids"})
        public static /* synthetic */ void getArticle_ids$annotations() {
        }

        @SerialName("articleSources")
        @JsonAnnotations2(names = {"article_sources"})
        public static /* synthetic */ void getArticle_sources$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("estimatedDate")
        @JsonAnnotations2(names = {"estimated_date"})
        public static /* synthetic */ void getEstimated_date$annotations() {
        }

        @SerialName("insightCategory")
        @JsonAnnotations2(names = {"insight_category"})
        public static /* synthetic */ void getInsight_category$annotations() {
        }

        @SerialName("rationale")
        @JsonAnnotations2(names = {"rationale"})
        public static /* synthetic */ void getRationale$annotations() {
        }

        @SerialName("supportingData")
        @JsonAnnotations2(names = {"supporting_data"})
        public static /* synthetic */ void getSupporting_data$annotations() {
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
        public final String getTitle() {
            return this.title;
        }

        public final List<ArticleSourceDto> component10() {
            return this.article_sources;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRationale() {
            return this.rationale;
        }

        public final List<String> component4() {
            return this.supporting_data;
        }

        public final List<String> component5() {
            return this.article_ids;
        }

        /* renamed from: component6, reason: from getter */
        public final MoneyDto getTarget_price() {
            return this.target_price;
        }

        /* renamed from: component7, reason: from getter */
        public final String getTimeframe() {
            return this.timeframe;
        }

        /* renamed from: component8, reason: from getter */
        public final Instant getEstimated_date() {
            return this.estimated_date;
        }

        /* renamed from: component9, reason: from getter */
        public final InsightCategoryDto getInsight_category() {
            return this.insight_category;
        }

        public final Surrogate copy(String title, String description, String rationale, List<String> supporting_data, List<String> article_ids, MoneyDto target_price, String timeframe, Instant estimated_date, InsightCategoryDto insight_category, List<ArticleSourceDto> article_sources) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(rationale, "rationale");
            Intrinsics.checkNotNullParameter(supporting_data, "supporting_data");
            Intrinsics.checkNotNullParameter(article_ids, "article_ids");
            Intrinsics.checkNotNullParameter(timeframe, "timeframe");
            Intrinsics.checkNotNullParameter(insight_category, "insight_category");
            Intrinsics.checkNotNullParameter(article_sources, "article_sources");
            return new Surrogate(title, description, rationale, supporting_data, article_ids, target_price, timeframe, estimated_date, insight_category, article_sources);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.rationale, surrogate.rationale) && Intrinsics.areEqual(this.supporting_data, surrogate.supporting_data) && Intrinsics.areEqual(this.article_ids, surrogate.article_ids) && Intrinsics.areEqual(this.target_price, surrogate.target_price) && Intrinsics.areEqual(this.timeframe, surrogate.timeframe) && Intrinsics.areEqual(this.estimated_date, surrogate.estimated_date) && this.insight_category == surrogate.insight_category && Intrinsics.areEqual(this.article_sources, surrogate.article_sources);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.rationale.hashCode()) * 31) + this.supporting_data.hashCode()) * 31) + this.article_ids.hashCode()) * 31;
            MoneyDto moneyDto = this.target_price;
            int iHashCode2 = (((iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.timeframe.hashCode()) * 31;
            Instant instant = this.estimated_date;
            return ((((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 31) + this.insight_category.hashCode()) * 31) + this.article_sources.hashCode();
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", description=" + this.description + ", rationale=" + this.rationale + ", supporting_data=" + this.supporting_data + ", article_ids=" + this.article_ids + ", target_price=" + this.target_price + ", timeframe=" + this.timeframe + ", estimated_date=" + this.estimated_date + ", insight_category=" + this.insight_category + ", article_sources=" + this.article_sources + ")";
        }

        /* compiled from: InsightDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/InsightDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InsightDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.copilot.proto.v1.InsightDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InsightDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.copilot.proto.v1.InsightDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InsightDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.copilot.proto.v1.InsightDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InsightDto.Surrogate._childSerializers$_anonymous_$1();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, List list, List list2, MoneyDto moneyDto, String str4, Instant instant, InsightCategoryDto insightCategoryDto, List list3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.description = "";
            } else {
                this.description = str2;
            }
            if ((i & 4) == 0) {
                this.rationale = "";
            } else {
                this.rationale = str3;
            }
            if ((i & 8) == 0) {
                this.supporting_data = CollectionsKt.emptyList();
            } else {
                this.supporting_data = list;
            }
            if ((i & 16) == 0) {
                this.article_ids = CollectionsKt.emptyList();
            } else {
                this.article_ids = list2;
            }
            if ((i & 32) == 0) {
                this.target_price = null;
            } else {
                this.target_price = moneyDto;
            }
            if ((i & 64) == 0) {
                this.timeframe = "";
            } else {
                this.timeframe = str4;
            }
            if ((i & 128) == 0) {
                this.estimated_date = null;
            } else {
                this.estimated_date = instant;
            }
            if ((i & 256) == 0) {
                this.insight_category = InsightCategoryDto.INSTANCE.getZeroValue();
            } else {
                this.insight_category = insightCategoryDto;
            }
            if ((i & 512) == 0) {
                this.article_sources = CollectionsKt.emptyList();
            } else {
                this.article_sources = list3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 1, self.description);
            }
            if (!Intrinsics.areEqual(self.rationale, "")) {
                output.encodeStringElement(serialDesc, 2, self.rationale);
            }
            if (!Intrinsics.areEqual(self.supporting_data, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.supporting_data);
            }
            if (!Intrinsics.areEqual(self.article_ids, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.article_ids);
            }
            MoneyDto moneyDto = self.target_price;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.timeframe, "")) {
                output.encodeStringElement(serialDesc, 6, self.timeframe);
            }
            Instant instant = self.estimated_date;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, WireInstantSerializer.INSTANCE, instant);
            }
            if (self.insight_category != InsightCategoryDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, InsightCategoryDto.Serializer.INSTANCE, self.insight_category);
            }
            if (Intrinsics.areEqual(self.article_sources, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 9, lazyArr[9].getValue(), self.article_sources);
        }

        public Surrogate(String title, String description, String rationale, List<String> supporting_data, List<String> article_ids, MoneyDto moneyDto, String timeframe, Instant instant, InsightCategoryDto insight_category, List<ArticleSourceDto> article_sources) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(rationale, "rationale");
            Intrinsics.checkNotNullParameter(supporting_data, "supporting_data");
            Intrinsics.checkNotNullParameter(article_ids, "article_ids");
            Intrinsics.checkNotNullParameter(timeframe, "timeframe");
            Intrinsics.checkNotNullParameter(insight_category, "insight_category");
            Intrinsics.checkNotNullParameter(article_sources, "article_sources");
            this.title = title;
            this.description = description;
            this.rationale = rationale;
            this.supporting_data = supporting_data;
            this.article_ids = article_ids;
            this.target_price = moneyDto;
            this.timeframe = timeframe;
            this.estimated_date = instant;
            this.insight_category = insight_category;
            this.article_sources = article_sources;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, List list, List list2, MoneyDto moneyDto, String str4, Instant instant, InsightCategoryDto insightCategoryDto, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? CollectionsKt.emptyList() : list2, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? null : instant, (i & 256) != 0 ? InsightCategoryDto.INSTANCE.getZeroValue() : insightCategoryDto, (i & 512) != 0 ? CollectionsKt.emptyList() : list3);
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

        public final List<String> getSupporting_data() {
            return this.supporting_data;
        }

        public final List<String> getArticle_ids() {
            return this.article_ids;
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

        public final InsightCategoryDto getInsight_category() {
            return this.insight_category;
        }

        public final List<ArticleSourceDto> getArticle_sources() {
            return this.article_sources;
        }
    }

    /* compiled from: InsightDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/InsightDto;", "Lcom/robinhood/copilot/proto/v1/Insight;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/InsightDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InsightDto, Insight> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InsightDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InsightDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InsightDto> getBinaryBase64Serializer() {
            return (KSerializer) InsightDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Insight> getProtoAdapter() {
            return Insight.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InsightDto getZeroValue() {
            return InsightDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InsightDto fromProto(Insight proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String description = proto.getDescription();
            String rationale = proto.getRationale();
            List<String> supporting_data = proto.getSupporting_data();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(supporting_data, 10));
            Iterator<T> it = supporting_data.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            List<String> article_ids = proto.getArticle_ids();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(article_ids, 10));
            Iterator<T> it2 = article_ids.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) it2.next());
            }
            Money target_price = proto.getTarget_price();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = target_price != null ? MoneyDto.INSTANCE.fromProto(target_price) : null;
            String timeframe = proto.getTimeframe();
            Instant estimated_date = proto.getEstimated_date();
            InsightCategoryDto insightCategoryDtoFromProto = InsightCategoryDto.INSTANCE.fromProto(proto.getInsight_category());
            List<ArticleSource> article_sources = proto.getArticle_sources();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(article_sources, 10));
            Iterator<T> it3 = article_sources.iterator();
            while (it3.hasNext()) {
                arrayList3.add(ArticleSourceDto.INSTANCE.fromProto((ArticleSource) it3.next()));
            }
            return new InsightDto(new Surrogate(title, description, rationale, arrayList, arrayList2, moneyDtoFromProto, timeframe, estimated_date, insightCategoryDtoFromProto, arrayList3), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.InsightDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InsightDto.binaryBase64Serializer_delegate$lambda$3();
            }
        });
        zeroValue = new InsightDto(null, null, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$3() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InsightDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/InsightDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/InsightDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InsightDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.Insight", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InsightDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InsightDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InsightDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InsightDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/InsightDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.InsightDto";
        }
    }
}
