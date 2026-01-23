package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.copilot.proto.p286v1.ArticleSourceDto;
import com.robinhood.copilot.proto.p286v1.PortfolioDigestAssetTypeDto;
import com.robinhood.copilot.proto.p286v1.PortfolioDigestSectionDto;
import com.robinhood.copilot.proto.p286v1.PortfolioDigestSectionTypeDto;
import com.robinhood.copilot.proto.p286v1.PortfolioDigestSentimentDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
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

/* compiled from: PortfolioDigestSectionDto.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004CBDEB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0085\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0006\u0010\u001bJ\u0089\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020'H\u0016¢\u0006\u0004\b0\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b6\u0010!R\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b7\u0010!R\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b8\u0010!R\u0011\u0010\u0011\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b9\u0010!R\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b:\u0010!R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010\u0018\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b?\u0010!R\u0011\u0010\u001a\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006F"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSection;", "Landroid/os/Parcelable;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto$Surrogate;)V", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionTypeDto;", "type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", InquiryField.DateField.TYPE, "", "instrument_id", "title", "description", "preview_title", "preview_description", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;", "sentiment", "", "Lcom/robinhood/copilot/proto/v1/ArticleSourceDto;", "sources", "sub_text", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetTypeDto;", "asset_type", "(Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionTypeDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetTypeDto;)V", "copy", "(Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionTypeDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetTypeDto;)Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto;", "toProto", "()Lcom/robinhood/copilot/proto/v1/PortfolioDigestSection;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto$Surrogate;", "getType", "()Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionTypeDto;", "getDate", "()Lj$/time/Instant;", "getInstrument_id", "getTitle", "getDescription", "getPreview_title", "getPreview_description", "getSentiment", "()Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;", "getSources", "()Ljava/util/List;", "getSub_text", "getAsset_type", "()Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class PortfolioDigestSectionDto implements Dto3<PortfolioDigestSection>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PortfolioDigestSectionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PortfolioDigestSectionDto, PortfolioDigestSection>> binaryBase64Serializer$delegate;
    private static final PortfolioDigestSectionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PortfolioDigestSectionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PortfolioDigestSectionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final PortfolioDigestSectionTypeDto getType() {
        return this.surrogate.getType();
    }

    public final Instant getDate() {
        return this.surrogate.getDate();
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final String getPreview_title() {
        return this.surrogate.getPreview_title();
    }

    public final String getPreview_description() {
        return this.surrogate.getPreview_description();
    }

    public final PortfolioDigestSentimentDto getSentiment() {
        return this.surrogate.getSentiment();
    }

    public final List<ArticleSourceDto> getSources() {
        return this.surrogate.getSources();
    }

    public final String getSub_text() {
        return this.surrogate.getSub_text();
    }

    public final PortfolioDigestAssetTypeDto getAsset_type() {
        return this.surrogate.getAsset_type();
    }

    public /* synthetic */ PortfolioDigestSectionDto(PortfolioDigestSectionTypeDto portfolioDigestSectionTypeDto, Instant instant, String str, String str2, String str3, String str4, String str5, PortfolioDigestSentimentDto portfolioDigestSentimentDto, List list, String str6, PortfolioDigestAssetTypeDto portfolioDigestAssetTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PortfolioDigestSectionTypeDto.INSTANCE.getZeroValue() : portfolioDigestSectionTypeDto, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? PortfolioDigestSentimentDto.INSTANCE.getZeroValue() : portfolioDigestSentimentDto, (i & 256) != 0 ? CollectionsKt.emptyList() : list, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? PortfolioDigestAssetTypeDto.INSTANCE.getZeroValue() : portfolioDigestAssetTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PortfolioDigestSectionDto(PortfolioDigestSectionTypeDto type2, Instant instant, String instrument_id, String title, String description, String preview_title, String preview_description, PortfolioDigestSentimentDto sentiment, List<ArticleSourceDto> sources, String sub_text, PortfolioDigestAssetTypeDto asset_type) {
        this(new Surrogate(type2, instant, instrument_id, title, description, preview_title, preview_description, sentiment, sources, sub_text, asset_type));
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
    }

    public static /* synthetic */ PortfolioDigestSectionDto copy$default(PortfolioDigestSectionDto portfolioDigestSectionDto, PortfolioDigestSectionTypeDto portfolioDigestSectionTypeDto, Instant instant, String str, String str2, String str3, String str4, String str5, PortfolioDigestSentimentDto portfolioDigestSentimentDto, List list, String str6, PortfolioDigestAssetTypeDto portfolioDigestAssetTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            portfolioDigestSectionTypeDto = portfolioDigestSectionDto.surrogate.getType();
        }
        if ((i & 2) != 0) {
            instant = portfolioDigestSectionDto.surrogate.getDate();
        }
        if ((i & 4) != 0) {
            str = portfolioDigestSectionDto.surrogate.getInstrument_id();
        }
        if ((i & 8) != 0) {
            str2 = portfolioDigestSectionDto.surrogate.getTitle();
        }
        if ((i & 16) != 0) {
            str3 = portfolioDigestSectionDto.surrogate.getDescription();
        }
        if ((i & 32) != 0) {
            str4 = portfolioDigestSectionDto.surrogate.getPreview_title();
        }
        if ((i & 64) != 0) {
            str5 = portfolioDigestSectionDto.surrogate.getPreview_description();
        }
        if ((i & 128) != 0) {
            portfolioDigestSentimentDto = portfolioDigestSectionDto.surrogate.getSentiment();
        }
        if ((i & 256) != 0) {
            list = portfolioDigestSectionDto.surrogate.getSources();
        }
        if ((i & 512) != 0) {
            str6 = portfolioDigestSectionDto.surrogate.getSub_text();
        }
        if ((i & 1024) != 0) {
            portfolioDigestAssetTypeDto = portfolioDigestSectionDto.surrogate.getAsset_type();
        }
        String str7 = str6;
        PortfolioDigestAssetTypeDto portfolioDigestAssetTypeDto2 = portfolioDigestAssetTypeDto;
        PortfolioDigestSentimentDto portfolioDigestSentimentDto2 = portfolioDigestSentimentDto;
        List list2 = list;
        String str8 = str4;
        String str9 = str5;
        String str10 = str3;
        String str11 = str;
        return portfolioDigestSectionDto.copy(portfolioDigestSectionTypeDto, instant, str11, str2, str10, str8, str9, portfolioDigestSentimentDto2, list2, str7, portfolioDigestAssetTypeDto2);
    }

    public final PortfolioDigestSectionDto copy(PortfolioDigestSectionTypeDto type2, Instant date, String instrument_id, String title, String description, String preview_title, String preview_description, PortfolioDigestSentimentDto sentiment, List<ArticleSourceDto> sources, String sub_text, PortfolioDigestAssetTypeDto asset_type) {
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
        return new PortfolioDigestSectionDto(new Surrogate(type2, date, instrument_id, title, description, preview_title, preview_description, sentiment, sources, sub_text, asset_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PortfolioDigestSection toProto() {
        PortfolioDigestSectionType portfolioDigestSectionType = (PortfolioDigestSectionType) this.surrogate.getType().toProto();
        Instant date = this.surrogate.getDate();
        String instrument_id = this.surrogate.getInstrument_id();
        String title = this.surrogate.getTitle();
        String description = this.surrogate.getDescription();
        String preview_title = this.surrogate.getPreview_title();
        String preview_description = this.surrogate.getPreview_description();
        PortfolioDigestSentiment portfolioDigestSentiment = (PortfolioDigestSentiment) this.surrogate.getSentiment().toProto();
        List<ArticleSourceDto> sources = this.surrogate.getSources();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sources, 10));
        Iterator<T> it = sources.iterator();
        while (it.hasNext()) {
            arrayList.add(((ArticleSourceDto) it.next()).toProto());
        }
        return new PortfolioDigestSection(portfolioDigestSectionType, date, instrument_id, title, description, preview_title, preview_description, portfolioDigestSentiment, arrayList, this.surrogate.getSub_text(), (PortfolioDigestAssetType) this.surrogate.getAsset_type().toProto(), null, 2048, null);
    }

    public String toString() {
        return "[PortfolioDigestSectionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PortfolioDigestSectionDto) && Intrinsics.areEqual(((PortfolioDigestSectionDto) other).surrogate, this.surrogate);
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
    /* compiled from: PortfolioDigestSectionDto.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\"\b\u0083\b\u0018\u0000 _2\u00020\u0001:\u0002`_B¡\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u008f\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ'\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J6\u0010*\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b/\u0010-J\u0010\u00100\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b0\u0010-J\u0010\u00101\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b1\u0010-J\u0010\u00102\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b2\u00103J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b6\u0010-J\u0010\u00107\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b7\u00108Jª\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b;\u0010-J\u0010\u0010<\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b@\u0010AR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010B\u0012\u0004\bD\u0010E\u001a\u0004\bC\u0010)RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010F\u0012\u0004\bH\u0010E\u001a\u0004\bG\u0010+R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010I\u0012\u0004\bK\u0010E\u001a\u0004\bJ\u0010-R \u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010I\u0012\u0004\bM\u0010E\u001a\u0004\bL\u0010-R \u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010I\u0012\u0004\bO\u0010E\u001a\u0004\bN\u0010-R \u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010I\u0012\u0004\bQ\u0010E\u001a\u0004\bP\u0010-R \u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010I\u0012\u0004\bS\u0010E\u001a\u0004\bR\u0010-R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010T\u0012\u0004\bV\u0010E\u001a\u0004\bU\u00103R&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010W\u0012\u0004\bY\u0010E\u001a\u0004\bX\u00105R \u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010I\u0012\u0004\b[\u0010E\u001a\u0004\bZ\u0010-R \u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\\\u0012\u0004\b^\u0010E\u001a\u0004\b]\u00108¨\u0006a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto$Surrogate;", "", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionTypeDto;", "type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", InquiryField.DateField.TYPE, "", "instrument_id", "title", "description", "preview_title", "preview_description", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;", "sentiment", "", "Lcom/robinhood/copilot/proto/v1/ArticleSourceDto;", "sources", "sub_text", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetTypeDto;", "asset_type", "<init>", "(Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionTypeDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/copilot/proto/v1/PortfolioDigestSectionTypeDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$copilot_service_v1_externalRelease", "(Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionTypeDto;", "component2", "()Lj$/time/Instant;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "()Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;", "component9", "()Ljava/util/List;", "component10", "component11", "()Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetTypeDto;", "copy", "(Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionTypeDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetTypeDto;)Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionTypeDto;", "getType", "getType$annotations", "()V", "Lj$/time/Instant;", "getDate", "getDate$annotations", "Ljava/lang/String;", "getInstrument_id", "getInstrument_id$annotations", "getTitle", "getTitle$annotations", "getDescription", "getDescription$annotations", "getPreview_title", "getPreview_title$annotations", "getPreview_description", "getPreview_description$annotations", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSentimentDto;", "getSentiment", "getSentiment$annotations", "Ljava/util/List;", "getSources", "getSources$annotations", "getSub_text", "getSub_text$annotations", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetTypeDto;", "getAsset_type", "getAsset_type$annotations", "Companion", "$serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final PortfolioDigestAssetTypeDto asset_type;
        private final Instant date;
        private final String description;
        private final String instrument_id;
        private final String preview_description;
        private final String preview_title;
        private final PortfolioDigestSentimentDto sentiment;
        private final List<ArticleSourceDto> sources;
        private final String sub_text;
        private final String title;
        private final PortfolioDigestSectionTypeDto type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.copilot.proto.v1.PortfolioDigestSectionDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PortfolioDigestSectionDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((PortfolioDigestSectionTypeDto) null, (Instant) null, (String) null, (String) null, (String) null, (String) null, (String) null, (PortfolioDigestSentimentDto) null, (List) null, (String) null, (PortfolioDigestAssetTypeDto) null, 2047, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(ArticleSourceDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, PortfolioDigestSectionTypeDto portfolioDigestSectionTypeDto, Instant instant, String str, String str2, String str3, String str4, String str5, PortfolioDigestSentimentDto portfolioDigestSentimentDto, List list, String str6, PortfolioDigestAssetTypeDto portfolioDigestAssetTypeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                portfolioDigestSectionTypeDto = surrogate.type;
            }
            if ((i & 2) != 0) {
                instant = surrogate.date;
            }
            if ((i & 4) != 0) {
                str = surrogate.instrument_id;
            }
            if ((i & 8) != 0) {
                str2 = surrogate.title;
            }
            if ((i & 16) != 0) {
                str3 = surrogate.description;
            }
            if ((i & 32) != 0) {
                str4 = surrogate.preview_title;
            }
            if ((i & 64) != 0) {
                str5 = surrogate.preview_description;
            }
            if ((i & 128) != 0) {
                portfolioDigestSentimentDto = surrogate.sentiment;
            }
            if ((i & 256) != 0) {
                list = surrogate.sources;
            }
            if ((i & 512) != 0) {
                str6 = surrogate.sub_text;
            }
            if ((i & 1024) != 0) {
                portfolioDigestAssetTypeDto = surrogate.asset_type;
            }
            String str7 = str6;
            PortfolioDigestAssetTypeDto portfolioDigestAssetTypeDto2 = portfolioDigestAssetTypeDto;
            PortfolioDigestSentimentDto portfolioDigestSentimentDto2 = portfolioDigestSentimentDto;
            List list2 = list;
            String str8 = str4;
            String str9 = str5;
            String str10 = str3;
            String str11 = str;
            return surrogate.copy(portfolioDigestSectionTypeDto, instant, str11, str2, str10, str8, str9, portfolioDigestSentimentDto2, list2, str7, portfolioDigestAssetTypeDto2);
        }

        @SerialName("assetType")
        @JsonAnnotations2(names = {"asset_type"})
        public static /* synthetic */ void getAsset_type$annotations() {
        }

        @SerialName(InquiryField.DateField.TYPE)
        @JsonAnnotations2(names = {InquiryField.DateField.TYPE})
        public static /* synthetic */ void getDate$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("previewDescription")
        @JsonAnnotations2(names = {"preview_description"})
        public static /* synthetic */ void getPreview_description$annotations() {
        }

        @SerialName("previewTitle")
        @JsonAnnotations2(names = {"preview_title"})
        public static /* synthetic */ void getPreview_title$annotations() {
        }

        @SerialName("sentiment")
        @JsonAnnotations2(names = {"sentiment"})
        public static /* synthetic */ void getSentiment$annotations() {
        }

        @SerialName("sources")
        @JsonAnnotations2(names = {"sources"})
        public static /* synthetic */ void getSources$annotations() {
        }

        @SerialName("subText")
        @JsonAnnotations2(names = {"sub_text"})
        public static /* synthetic */ void getSub_text$annotations() {
        }

        @SerialName("title")
        @JsonAnnotations2(names = {"title"})
        public static /* synthetic */ void getTitle$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final PortfolioDigestSectionTypeDto getType() {
            return this.type;
        }

        /* renamed from: component10, reason: from getter */
        public final String getSub_text() {
            return this.sub_text;
        }

        /* renamed from: component11, reason: from getter */
        public final PortfolioDigestAssetTypeDto getAsset_type() {
            return this.asset_type;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getDate() {
            return this.date;
        }

        /* renamed from: component3, reason: from getter */
        public final String getInstrument_id() {
            return this.instrument_id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPreview_title() {
            return this.preview_title;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPreview_description() {
            return this.preview_description;
        }

        /* renamed from: component8, reason: from getter */
        public final PortfolioDigestSentimentDto getSentiment() {
            return this.sentiment;
        }

        public final List<ArticleSourceDto> component9() {
            return this.sources;
        }

        public final Surrogate copy(PortfolioDigestSectionTypeDto type2, Instant date, String instrument_id, String title, String description, String preview_title, String preview_description, PortfolioDigestSentimentDto sentiment, List<ArticleSourceDto> sources, String sub_text, PortfolioDigestAssetTypeDto asset_type) {
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
            return new Surrogate(type2, date, instrument_id, title, description, preview_title, preview_description, sentiment, sources, sub_text, asset_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.type == surrogate.type && Intrinsics.areEqual(this.date, surrogate.date) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.preview_title, surrogate.preview_title) && Intrinsics.areEqual(this.preview_description, surrogate.preview_description) && this.sentiment == surrogate.sentiment && Intrinsics.areEqual(this.sources, surrogate.sources) && Intrinsics.areEqual(this.sub_text, surrogate.sub_text) && this.asset_type == surrogate.asset_type;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            Instant instant = this.date;
            return ((((((((((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.instrument_id.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.preview_title.hashCode()) * 31) + this.preview_description.hashCode()) * 31) + this.sentiment.hashCode()) * 31) + this.sources.hashCode()) * 31) + this.sub_text.hashCode()) * 31) + this.asset_type.hashCode();
        }

        public String toString() {
            return "Surrogate(type=" + this.type + ", date=" + this.date + ", instrument_id=" + this.instrument_id + ", title=" + this.title + ", description=" + this.description + ", preview_title=" + this.preview_title + ", preview_description=" + this.preview_description + ", sentiment=" + this.sentiment + ", sources=" + this.sources + ", sub_text=" + this.sub_text + ", asset_type=" + this.asset_type + ")";
        }

        /* compiled from: PortfolioDigestSectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PortfolioDigestSectionDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, PortfolioDigestSectionTypeDto portfolioDigestSectionTypeDto, Instant instant, String str, String str2, String str3, String str4, String str5, PortfolioDigestSentimentDto portfolioDigestSentimentDto, List list, String str6, PortfolioDigestAssetTypeDto portfolioDigestAssetTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.type = (i & 1) == 0 ? PortfolioDigestSectionTypeDto.INSTANCE.getZeroValue() : portfolioDigestSectionTypeDto;
            if ((i & 2) == 0) {
                this.date = null;
            } else {
                this.date = instant;
            }
            if ((i & 4) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str;
            }
            if ((i & 8) == 0) {
                this.title = "";
            } else {
                this.title = str2;
            }
            if ((i & 16) == 0) {
                this.description = "";
            } else {
                this.description = str3;
            }
            if ((i & 32) == 0) {
                this.preview_title = "";
            } else {
                this.preview_title = str4;
            }
            if ((i & 64) == 0) {
                this.preview_description = "";
            } else {
                this.preview_description = str5;
            }
            if ((i & 128) == 0) {
                this.sentiment = PortfolioDigestSentimentDto.INSTANCE.getZeroValue();
            } else {
                this.sentiment = portfolioDigestSentimentDto;
            }
            if ((i & 256) == 0) {
                this.sources = CollectionsKt.emptyList();
            } else {
                this.sources = list;
            }
            if ((i & 512) == 0) {
                this.sub_text = "";
            } else {
                this.sub_text = str6;
            }
            if ((i & 1024) == 0) {
                this.asset_type = PortfolioDigestAssetTypeDto.INSTANCE.getZeroValue();
            } else {
                this.asset_type = portfolioDigestAssetTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.type != PortfolioDigestSectionTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, PortfolioDigestSectionTypeDto.Serializer.INSTANCE, self.type);
            }
            Instant instant = self.date;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.instrument_id);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 3, self.title);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 4, self.description);
            }
            if (!Intrinsics.areEqual(self.preview_title, "")) {
                output.encodeStringElement(serialDesc, 5, self.preview_title);
            }
            if (!Intrinsics.areEqual(self.preview_description, "")) {
                output.encodeStringElement(serialDesc, 6, self.preview_description);
            }
            if (self.sentiment != PortfolioDigestSentimentDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, PortfolioDigestSentimentDto.Serializer.INSTANCE, self.sentiment);
            }
            if (!Intrinsics.areEqual(self.sources, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 8, lazyArr[8].getValue(), self.sources);
            }
            if (!Intrinsics.areEqual(self.sub_text, "")) {
                output.encodeStringElement(serialDesc, 9, self.sub_text);
            }
            if (self.asset_type != PortfolioDigestAssetTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 10, PortfolioDigestAssetTypeDto.Serializer.INSTANCE, self.asset_type);
            }
        }

        public Surrogate(PortfolioDigestSectionTypeDto type2, Instant instant, String instrument_id, String title, String description, String preview_title, String preview_description, PortfolioDigestSentimentDto sentiment, List<ArticleSourceDto> sources, String sub_text, PortfolioDigestAssetTypeDto asset_type) {
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
            this.type = type2;
            this.date = instant;
            this.instrument_id = instrument_id;
            this.title = title;
            this.description = description;
            this.preview_title = preview_title;
            this.preview_description = preview_description;
            this.sentiment = sentiment;
            this.sources = sources;
            this.sub_text = sub_text;
            this.asset_type = asset_type;
        }

        public final PortfolioDigestSectionTypeDto getType() {
            return this.type;
        }

        public /* synthetic */ Surrogate(PortfolioDigestSectionTypeDto portfolioDigestSectionTypeDto, Instant instant, String str, String str2, String str3, String str4, String str5, PortfolioDigestSentimentDto portfolioDigestSentimentDto, List list, String str6, PortfolioDigestAssetTypeDto portfolioDigestAssetTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? PortfolioDigestSectionTypeDto.INSTANCE.getZeroValue() : portfolioDigestSectionTypeDto, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? PortfolioDigestSentimentDto.INSTANCE.getZeroValue() : portfolioDigestSentimentDto, (i & 256) != 0 ? CollectionsKt.emptyList() : list, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? PortfolioDigestAssetTypeDto.INSTANCE.getZeroValue() : portfolioDigestAssetTypeDto);
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

        public final PortfolioDigestSentimentDto getSentiment() {
            return this.sentiment;
        }

        public final List<ArticleSourceDto> getSources() {
            return this.sources;
        }

        public final String getSub_text() {
            return this.sub_text;
        }

        public final PortfolioDigestAssetTypeDto getAsset_type() {
            return this.asset_type;
        }
    }

    /* compiled from: PortfolioDigestSectionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSection;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PortfolioDigestSectionDto, PortfolioDigestSection> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PortfolioDigestSectionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioDigestSectionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PortfolioDigestSectionDto> getBinaryBase64Serializer() {
            return (KSerializer) PortfolioDigestSectionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PortfolioDigestSection> getProtoAdapter() {
            return PortfolioDigestSection.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioDigestSectionDto getZeroValue() {
            return PortfolioDigestSectionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PortfolioDigestSectionDto fromProto(PortfolioDigestSection proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            PortfolioDigestSectionTypeDto portfolioDigestSectionTypeDtoFromProto = PortfolioDigestSectionTypeDto.INSTANCE.fromProto(proto.getType());
            Instant date = proto.getDate();
            String instrument_id = proto.getInstrument_id();
            String title = proto.getTitle();
            String description = proto.getDescription();
            String preview_title = proto.getPreview_title();
            String preview_description = proto.getPreview_description();
            PortfolioDigestSentimentDto portfolioDigestSentimentDtoFromProto = PortfolioDigestSentimentDto.INSTANCE.fromProto(proto.getSentiment());
            List<ArticleSource> sources = proto.getSources();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sources, 10));
            Iterator<T> it = sources.iterator();
            while (it.hasNext()) {
                arrayList.add(ArticleSourceDto.INSTANCE.fromProto((ArticleSource) it.next()));
            }
            return new PortfolioDigestSectionDto(new Surrogate(portfolioDigestSectionTypeDtoFromProto, date, instrument_id, title, description, preview_title, preview_description, portfolioDigestSentimentDtoFromProto, arrayList, proto.getSub_text(), PortfolioDigestAssetTypeDto.INSTANCE.fromProto(proto.getAsset_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.PortfolioDigestSectionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PortfolioDigestSectionDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new PortfolioDigestSectionDto(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PortfolioDigestSectionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PortfolioDigestSectionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.PortfolioDigestSection", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PortfolioDigestSectionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PortfolioDigestSectionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PortfolioDigestSectionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PortfolioDigestSectionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.PortfolioDigestSectionDto";
        }
    }
}
