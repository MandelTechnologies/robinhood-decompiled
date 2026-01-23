package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.copilot.proto.p286v1.ArticleSourceDto;
import com.robinhood.copilot.proto.p286v1.PortfolioDigestDto;
import com.robinhood.copilot.proto.p286v1.PortfolioDigestSectionDto;
import com.robinhood.copilot.proto.p286v1.PortfolioDigestSentimentDto;
import com.robinhood.copilot.proto.p286v1.PortfolioHoldingDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
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
import p479j$.time.Instant;

/* compiled from: PortfolioDigestDto.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004;:<=B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B{\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0006\u0010\u0018J\u007f\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\b\b\u0002\u0010\u0011\u001a\u00020\b2\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001eR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8F¢\u0006\u0006\u001a\u0004\b2\u00101R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8F¢\u0006\u0006\u001a\u0004\b3\u00101R\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0019\u0010\u0017\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138F¢\u0006\u0006\u001a\u0004\b9\u00106¨\u0006>"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigest;", "Landroid/os/Parcelable;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/copilot/proto/v1/PortfolioDigestDto$Surrogate;)V", "", "title", "", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto;", "sections", "Lcom/robinhood/copilot/proto/v1/ArticleSourceDto;", "sources", "Lcom/robinhood/copilot/proto/v1/PortfolioHoldingDto;", CryptoDetailSource.HOLDINGS, "digest_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "read_at", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;", "sentiment", "next_generation_timestamp", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;Lj$/time/Instant;)V", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;Lj$/time/Instant;)Lcom/robinhood/copilot/proto/v1/PortfolioDigestDto;", "toProto", "()Lcom/robinhood/copilot/proto/v1/PortfolioDigest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestDto$Surrogate;", "getTitle", "getSections", "()Ljava/util/List;", "getSources", "getHoldings", "getDigest_id", "getRead_at", "()Lj$/time/Instant;", "getSentiment", "()Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;", "getNext_generation_timestamp", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class PortfolioDigestDto implements Dto3<PortfolioDigest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PortfolioDigestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PortfolioDigestDto, PortfolioDigest>> binaryBase64Serializer$delegate;
    private static final PortfolioDigestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PortfolioDigestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PortfolioDigestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final List<PortfolioDigestSectionDto> getSections() {
        return this.surrogate.getSections();
    }

    public final List<ArticleSourceDto> getSources() {
        return this.surrogate.getSources();
    }

    public final List<PortfolioHoldingDto> getHoldings() {
        return this.surrogate.getHoldings();
    }

    public final String getDigest_id() {
        return this.surrogate.getDigest_id();
    }

    public final Instant getRead_at() {
        return this.surrogate.getRead_at();
    }

    public final PortfolioDigestSentimentDto getSentiment() {
        return this.surrogate.getSentiment();
    }

    public final Instant getNext_generation_timestamp() {
        return this.surrogate.getNext_generation_timestamp();
    }

    public /* synthetic */ PortfolioDigestDto(String str, List list, List list2, List list3, String str2, Instant instant, PortfolioDigestSentimentDto portfolioDigestSentimentDto, Instant instant2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? PortfolioDigestSentimentDto.INSTANCE.getZeroValue() : portfolioDigestSentimentDto, (i & 128) != 0 ? null : instant2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PortfolioDigestDto(String title, List<PortfolioDigestSectionDto> sections, List<ArticleSourceDto> sources, List<? extends PortfolioHoldingDto> holdings, String digest_id, Instant instant, PortfolioDigestSentimentDto sentiment, Instant instant2) {
        this(new Surrogate(title, sections, sources, holdings, digest_id, instant, sentiment, instant2));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(holdings, "holdings");
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
    }

    public static /* synthetic */ PortfolioDigestDto copy$default(PortfolioDigestDto portfolioDigestDto, String str, List list, List list2, List list3, String str2, Instant instant, PortfolioDigestSentimentDto portfolioDigestSentimentDto, Instant instant2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = portfolioDigestDto.surrogate.getTitle();
        }
        if ((i & 2) != 0) {
            list = portfolioDigestDto.surrogate.getSections();
        }
        if ((i & 4) != 0) {
            list2 = portfolioDigestDto.surrogate.getSources();
        }
        if ((i & 8) != 0) {
            list3 = portfolioDigestDto.surrogate.getHoldings();
        }
        if ((i & 16) != 0) {
            str2 = portfolioDigestDto.surrogate.getDigest_id();
        }
        if ((i & 32) != 0) {
            instant = portfolioDigestDto.surrogate.getRead_at();
        }
        if ((i & 64) != 0) {
            portfolioDigestSentimentDto = portfolioDigestDto.surrogate.getSentiment();
        }
        if ((i & 128) != 0) {
            instant2 = portfolioDigestDto.surrogate.getNext_generation_timestamp();
        }
        PortfolioDigestSentimentDto portfolioDigestSentimentDto2 = portfolioDigestSentimentDto;
        Instant instant3 = instant2;
        String str3 = str2;
        Instant instant4 = instant;
        return portfolioDigestDto.copy(str, list, list2, list3, str3, instant4, portfolioDigestSentimentDto2, instant3);
    }

    public final PortfolioDigestDto copy(String title, List<PortfolioDigestSectionDto> sections, List<ArticleSourceDto> sources, List<? extends PortfolioHoldingDto> holdings, String digest_id, Instant read_at, PortfolioDigestSentimentDto sentiment, Instant next_generation_timestamp) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(holdings, "holdings");
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
        return new PortfolioDigestDto(new Surrogate(title, sections, sources, holdings, digest_id, read_at, sentiment, next_generation_timestamp));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PortfolioDigest toProto() {
        String title = this.surrogate.getTitle();
        List<PortfolioDigestSectionDto> sections = this.surrogate.getSections();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(((PortfolioDigestSectionDto) it.next()).toProto());
        }
        List<ArticleSourceDto> sources = this.surrogate.getSources();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sources, 10));
        Iterator<T> it2 = sources.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ArticleSourceDto) it2.next()).toProto());
        }
        List<PortfolioHoldingDto> holdings = this.surrogate.getHoldings();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(holdings, 10));
        Iterator<T> it3 = holdings.iterator();
        while (it3.hasNext()) {
            arrayList3.add((PortfolioHolding) ((PortfolioHoldingDto) it3.next()).toProto());
        }
        return new PortfolioDigest(title, arrayList, arrayList2, arrayList3, this.surrogate.getDigest_id(), this.surrogate.getRead_at(), (PortfolioDigestSentiment) this.surrogate.getSentiment().toProto(), this.surrogate.getNext_generation_timestamp(), null, 256, null);
    }

    public String toString() {
        return "[PortfolioDigestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PortfolioDigestDto) && Intrinsics.areEqual(((PortfolioDigestDto) other).surrogate, this.surrogate);
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
    /* compiled from: PortfolioDigestDto.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0083\b\u0018\u0000 O2\u00020\u0001:\u0002POBµ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012.\b\u0002\u0010\u0011\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012.\b\u0002\u0010\u0014\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\u0004\b\u0015\u0010\u0016B}\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010&J6\u0010,\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b.\u0010/J6\u00100\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b0\u0010-J¾\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022.\b\u0002\u0010\u0011\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122.\b\u0002\u0010\u0014\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010&J\u0010\u00104\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010&R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010>\u0012\u0004\b@\u0010=\u001a\u0004\b?\u0010(R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010>\u0012\u0004\bB\u0010=\u001a\u0004\bA\u0010(R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010>\u0012\u0004\bD\u0010=\u001a\u0004\bC\u0010(R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010:\u0012\u0004\bF\u0010=\u001a\u0004\bE\u0010&RF\u0010\u0011\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010G\u0012\u0004\bI\u0010=\u001a\u0004\bH\u0010-R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010J\u0012\u0004\bL\u0010=\u001a\u0004\bK\u0010/RF\u0010\u0014\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010G\u0012\u0004\bN\u0010=\u001a\u0004\bM\u0010-¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestDto$Surrogate;", "", "", "title", "", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto;", "sections", "Lcom/robinhood/copilot/proto/v1/ArticleSourceDto;", "sources", "Lcom/robinhood/copilot/proto/v1/PortfolioHoldingDto;", CryptoDetailSource.HOLDINGS, "digest_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "read_at", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;", "sentiment", "next_generation_timestamp", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;Lj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_service_v1_externalRelease", "(Lcom/robinhood/copilot/proto/v1/PortfolioDigestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "()Lj$/time/Instant;", "component7", "()Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;", "component8", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;Lj$/time/Instant;)Lcom/robinhood/copilot/proto/v1/PortfolioDigestDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/util/List;", "getSections", "getSections$annotations", "getSources", "getSources$annotations", "getHoldings", "getHoldings$annotations", "getDigest_id", "getDigest_id$annotations", "Lj$/time/Instant;", "getRead_at", "getRead_at$annotations", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;", "getSentiment", "getSentiment$annotations", "getNext_generation_timestamp", "getNext_generation_timestamp$annotations", "Companion", "$serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String digest_id;
        private final List<PortfolioHoldingDto> holdings;
        private final Instant next_generation_timestamp;
        private final Instant read_at;
        private final List<PortfolioDigestSectionDto> sections;
        private final PortfolioDigestSentimentDto sentiment;
        private final List<ArticleSourceDto> sources;
        private final String title;

        public Surrogate() {
            this((String) null, (List) null, (List) null, (List) null, (String) null, (Instant) null, (PortfolioDigestSentimentDto) null, (Instant) null, 255, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(PortfolioDigestSectionDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(ArticleSourceDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(PortfolioHoldingDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, List list, List list2, List list3, String str2, Instant instant, PortfolioDigestSentimentDto portfolioDigestSentimentDto, Instant instant2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.title;
            }
            if ((i & 2) != 0) {
                list = surrogate.sections;
            }
            if ((i & 4) != 0) {
                list2 = surrogate.sources;
            }
            if ((i & 8) != 0) {
                list3 = surrogate.holdings;
            }
            if ((i & 16) != 0) {
                str2 = surrogate.digest_id;
            }
            if ((i & 32) != 0) {
                instant = surrogate.read_at;
            }
            if ((i & 64) != 0) {
                portfolioDigestSentimentDto = surrogate.sentiment;
            }
            if ((i & 128) != 0) {
                instant2 = surrogate.next_generation_timestamp;
            }
            PortfolioDigestSentimentDto portfolioDigestSentimentDto2 = portfolioDigestSentimentDto;
            Instant instant3 = instant2;
            String str3 = str2;
            Instant instant4 = instant;
            return surrogate.copy(str, list, list2, list3, str3, instant4, portfolioDigestSentimentDto2, instant3);
        }

        @SerialName("digestId")
        @JsonAnnotations2(names = {"digest_id"})
        public static /* synthetic */ void getDigest_id$annotations() {
        }

        @SerialName(CryptoDetailSource.HOLDINGS)
        @JsonAnnotations2(names = {CryptoDetailSource.HOLDINGS})
        public static /* synthetic */ void getHoldings$annotations() {
        }

        @SerialName("nextGenerationTimestamp")
        @JsonAnnotations2(names = {"next_generation_timestamp"})
        public static /* synthetic */ void getNext_generation_timestamp$annotations() {
        }

        @SerialName("readAt")
        @JsonAnnotations2(names = {"read_at"})
        public static /* synthetic */ void getRead_at$annotations() {
        }

        @SerialName("sections")
        @JsonAnnotations2(names = {"sections"})
        public static /* synthetic */ void getSections$annotations() {
        }

        @SerialName("sentiment")
        @JsonAnnotations2(names = {"sentiment"})
        public static /* synthetic */ void getSentiment$annotations() {
        }

        @SerialName("sources")
        @JsonAnnotations2(names = {"sources"})
        public static /* synthetic */ void getSources$annotations() {
        }

        @SerialName("title")
        @JsonAnnotations2(names = {"title"})
        public static /* synthetic */ void getTitle$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<PortfolioDigestSectionDto> component2() {
            return this.sections;
        }

        public final List<ArticleSourceDto> component3() {
            return this.sources;
        }

        public final List<PortfolioHoldingDto> component4() {
            return this.holdings;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDigest_id() {
            return this.digest_id;
        }

        /* renamed from: component6, reason: from getter */
        public final Instant getRead_at() {
            return this.read_at;
        }

        /* renamed from: component7, reason: from getter */
        public final PortfolioDigestSentimentDto getSentiment() {
            return this.sentiment;
        }

        /* renamed from: component8, reason: from getter */
        public final Instant getNext_generation_timestamp() {
            return this.next_generation_timestamp;
        }

        public final Surrogate copy(String title, List<PortfolioDigestSectionDto> sections, List<ArticleSourceDto> sources, List<? extends PortfolioHoldingDto> holdings, String digest_id, Instant read_at, PortfolioDigestSentimentDto sentiment, Instant next_generation_timestamp) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(sections, "sections");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(holdings, "holdings");
            Intrinsics.checkNotNullParameter(digest_id, "digest_id");
            Intrinsics.checkNotNullParameter(sentiment, "sentiment");
            return new Surrogate(title, sections, sources, holdings, digest_id, read_at, sentiment, next_generation_timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.sections, surrogate.sections) && Intrinsics.areEqual(this.sources, surrogate.sources) && Intrinsics.areEqual(this.holdings, surrogate.holdings) && Intrinsics.areEqual(this.digest_id, surrogate.digest_id) && Intrinsics.areEqual(this.read_at, surrogate.read_at) && this.sentiment == surrogate.sentiment && Intrinsics.areEqual(this.next_generation_timestamp, surrogate.next_generation_timestamp);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.title.hashCode() * 31) + this.sections.hashCode()) * 31) + this.sources.hashCode()) * 31) + this.holdings.hashCode()) * 31) + this.digest_id.hashCode()) * 31;
            Instant instant = this.read_at;
            int iHashCode2 = (((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.sentiment.hashCode()) * 31;
            Instant instant2 = this.next_generation_timestamp;
            return iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", sections=" + this.sections + ", sources=" + this.sources + ", holdings=" + this.holdings + ", digest_id=" + this.digest_id + ", read_at=" + this.read_at + ", sentiment=" + this.sentiment + ", next_generation_timestamp=" + this.next_generation_timestamp + ")";
        }

        /* compiled from: PortfolioDigestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PortfolioDigestDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.copilot.proto.v1.PortfolioDigestDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PortfolioDigestDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.copilot.proto.v1.PortfolioDigestDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PortfolioDigestDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.copilot.proto.v1.PortfolioDigestDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PortfolioDigestDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, String str, List list, List list2, List list3, String str2, Instant instant, PortfolioDigestSentimentDto portfolioDigestSentimentDto, Instant instant2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.sections = CollectionsKt.emptyList();
            } else {
                this.sections = list;
            }
            if ((i & 4) == 0) {
                this.sources = CollectionsKt.emptyList();
            } else {
                this.sources = list2;
            }
            if ((i & 8) == 0) {
                this.holdings = CollectionsKt.emptyList();
            } else {
                this.holdings = list3;
            }
            if ((i & 16) == 0) {
                this.digest_id = "";
            } else {
                this.digest_id = str2;
            }
            if ((i & 32) == 0) {
                this.read_at = null;
            } else {
                this.read_at = instant;
            }
            if ((i & 64) == 0) {
                this.sentiment = PortfolioDigestSentimentDto.INSTANCE.getZeroValue();
            } else {
                this.sentiment = portfolioDigestSentimentDto;
            }
            if ((i & 128) == 0) {
                this.next_generation_timestamp = null;
            } else {
                this.next_generation_timestamp = instant2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.sections, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.sections);
            }
            if (!Intrinsics.areEqual(self.sources, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.sources);
            }
            if (!Intrinsics.areEqual(self.holdings, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.holdings);
            }
            if (!Intrinsics.areEqual(self.digest_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.digest_id);
            }
            Instant instant = self.read_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, WireInstantSerializer.INSTANCE, instant);
            }
            if (self.sentiment != PortfolioDigestSentimentDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, PortfolioDigestSentimentDto.Serializer.INSTANCE, self.sentiment);
            }
            Instant instant2 = self.next_generation_timestamp;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, WireInstantSerializer.INSTANCE, instant2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(String title, List<PortfolioDigestSectionDto> sections, List<ArticleSourceDto> sources, List<? extends PortfolioHoldingDto> holdings, String digest_id, Instant instant, PortfolioDigestSentimentDto sentiment, Instant instant2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(sections, "sections");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(holdings, "holdings");
            Intrinsics.checkNotNullParameter(digest_id, "digest_id");
            Intrinsics.checkNotNullParameter(sentiment, "sentiment");
            this.title = title;
            this.sections = sections;
            this.sources = sources;
            this.holdings = holdings;
            this.digest_id = digest_id;
            this.read_at = instant;
            this.sentiment = sentiment;
            this.next_generation_timestamp = instant2;
        }

        public /* synthetic */ Surrogate(String str, List list, List list2, List list3, String str2, Instant instant, PortfolioDigestSentimentDto portfolioDigestSentimentDto, Instant instant2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? PortfolioDigestSentimentDto.INSTANCE.getZeroValue() : portfolioDigestSentimentDto, (i & 128) != 0 ? null : instant2);
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<PortfolioDigestSectionDto> getSections() {
            return this.sections;
        }

        public final List<ArticleSourceDto> getSources() {
            return this.sources;
        }

        public final List<PortfolioHoldingDto> getHoldings() {
            return this.holdings;
        }

        public final String getDigest_id() {
            return this.digest_id;
        }

        public final Instant getRead_at() {
            return this.read_at;
        }

        public final PortfolioDigestSentimentDto getSentiment() {
            return this.sentiment;
        }

        public final Instant getNext_generation_timestamp() {
            return this.next_generation_timestamp;
        }
    }

    /* compiled from: PortfolioDigestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestDto;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/PortfolioDigestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PortfolioDigestDto, PortfolioDigest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PortfolioDigestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioDigestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioDigestDto> getBinaryBase64Serializer() {
            return (KSerializer) PortfolioDigestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PortfolioDigest> getProtoAdapter() {
            return PortfolioDigest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioDigestDto getZeroValue() {
            return PortfolioDigestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioDigestDto fromProto(PortfolioDigest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            List<PortfolioDigestSection> sections = proto.getSections();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
            Iterator<T> it = sections.iterator();
            while (it.hasNext()) {
                arrayList.add(PortfolioDigestSectionDto.INSTANCE.fromProto((PortfolioDigestSection) it.next()));
            }
            List<ArticleSource> sources = proto.getSources();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sources, 10));
            Iterator<T> it2 = sources.iterator();
            while (it2.hasNext()) {
                arrayList2.add(ArticleSourceDto.INSTANCE.fromProto((ArticleSource) it2.next()));
            }
            List<PortfolioHolding> holdings = proto.getHoldings();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(holdings, 10));
            Iterator<T> it3 = holdings.iterator();
            while (it3.hasNext()) {
                arrayList3.add(PortfolioHoldingDto.INSTANCE.fromProto((PortfolioHolding) it3.next()));
            }
            return new PortfolioDigestDto(new Surrogate(title, arrayList, arrayList2, arrayList3, proto.getDigest_id(), proto.getRead_at(), PortfolioDigestSentimentDto.INSTANCE.fromProto(proto.getSentiment()), proto.getNext_generation_timestamp()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.PortfolioDigestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PortfolioDigestDto.binaryBase64Serializer_delegate$lambda$3();
            }
        });
        zeroValue = new PortfolioDigestDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$3() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PortfolioDigestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PortfolioDigestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.PortfolioDigest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PortfolioDigestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PortfolioDigestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PortfolioDigestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PortfolioDigestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.PortfolioDigestDto";
        }
    }
}
