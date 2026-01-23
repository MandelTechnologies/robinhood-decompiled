package microgram.contracts.invest_tab_highlights.proto.p494v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import microgram.contracts.invest_tab_highlights.proto.p494v1.EcEventContentDto;
import microgram.contracts.invest_tab_highlights.proto.p494v1.EcReservedContentDto;
import microgram.contracts.invest_tab_highlights.proto.p494v1.HighlightCardGenericContentDto;
import microgram.contracts.invest_tab_highlights.proto.p494v1.HighlightTypeDto;
import microgram.contracts.invest_tab_highlights.proto.p494v1.PortfolioDigestContentDto;

/* compiled from: HighlightCardDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005-,./0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00061"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCard;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$Surrogate;)V", "", "id", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightTypeDto;", "type", "deeplink", "analytics_name", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto;", "content", "(Ljava/lang/String;Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightTypeDto;Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto;)V", "toProto", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCard;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$Surrogate;", "getId", "getType", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightTypeDto;", "getDeeplink", "getAnalytics_name", "getContent", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto;", "Companion", "Surrogate", "ContentDto", "Serializer", "MultibindingModule", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class HighlightCardDto implements Dto3<HighlightCard>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<HighlightCardDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<HighlightCardDto, HighlightCard>> binaryBase64Serializer$delegate;
    private static final HighlightCardDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ HighlightCardDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private HighlightCardDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final HighlightTypeDto getType() {
        return this.surrogate.getType();
    }

    public final String getDeeplink() {
        return this.surrogate.getDeeplink();
    }

    public final String getAnalytics_name() {
        return this.surrogate.getAnalytics_name();
    }

    public final ContentDto getContent() {
        if (this.surrogate.getGeneric_content() != null) {
            return new ContentDto.GenericContent(this.surrogate.getGeneric_content());
        }
        if (this.surrogate.getEc_event_content() != null) {
            return new ContentDto.EcEventContent(this.surrogate.getEc_event_content());
        }
        if (this.surrogate.getEc_reserved_content() != null) {
            return new ContentDto.EcReservedContent(this.surrogate.getEc_reserved_content());
        }
        if (this.surrogate.getPortfolio_digest_content() != null) {
            return new ContentDto.PortfolioDigestContent(this.surrogate.getPortfolio_digest_content());
        }
        return null;
    }

    public /* synthetic */ HighlightCardDto(String str, HighlightTypeDto highlightTypeDto, String str2, String str3, ContentDto contentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? HighlightTypeDto.INSTANCE.getZeroValue() : highlightTypeDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : contentDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HighlightCardDto(String id, HighlightTypeDto type2, String deeplink, String analytics_name, ContentDto contentDto) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(analytics_name, "analytics_name");
        ContentDto.GenericContent genericContent = contentDto instanceof ContentDto.GenericContent ? (ContentDto.GenericContent) contentDto : null;
        HighlightCardGenericContentDto value = genericContent != null ? genericContent.getValue() : null;
        ContentDto.EcEventContent ecEventContent = contentDto instanceof ContentDto.EcEventContent ? (ContentDto.EcEventContent) contentDto : null;
        EcEventContentDto value2 = ecEventContent != null ? ecEventContent.getValue() : null;
        ContentDto.EcReservedContent ecReservedContent = contentDto instanceof ContentDto.EcReservedContent ? (ContentDto.EcReservedContent) contentDto : null;
        EcReservedContentDto value3 = ecReservedContent != null ? ecReservedContent.getValue() : null;
        ContentDto.PortfolioDigestContent portfolioDigestContent = contentDto instanceof ContentDto.PortfolioDigestContent ? (ContentDto.PortfolioDigestContent) contentDto : null;
        this(new Surrogate(id, type2, deeplink, analytics_name, value, value2, value3, portfolioDigestContent != null ? portfolioDigestContent.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public HighlightCard toProto() {
        String id = this.surrogate.getId();
        HighlightType highlightType = (HighlightType) this.surrogate.getType().toProto();
        String deeplink = this.surrogate.getDeeplink();
        String analytics_name = this.surrogate.getAnalytics_name();
        HighlightCardGenericContentDto generic_content = this.surrogate.getGeneric_content();
        HighlightCardGenericContent proto = generic_content != null ? generic_content.toProto() : null;
        EcEventContentDto ec_event_content = this.surrogate.getEc_event_content();
        EcEventContent proto2 = ec_event_content != null ? ec_event_content.toProto() : null;
        EcReservedContentDto ec_reserved_content = this.surrogate.getEc_reserved_content();
        EcReservedContent proto3 = ec_reserved_content != null ? ec_reserved_content.toProto() : null;
        PortfolioDigestContentDto portfolio_digest_content = this.surrogate.getPortfolio_digest_content();
        return new HighlightCard(proto, proto2, proto3, portfolio_digest_content != null ? portfolio_digest_content.toProto() : null, id, highlightType, deeplink, analytics_name, null, 256, null);
    }

    public String toString() {
        return "[HighlightCardDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof HighlightCardDto) && Intrinsics.areEqual(((HighlightCardDto) other).surrogate, this.surrogate);
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
    /* compiled from: HighlightCardDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002EDB_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bk\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010!R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b3\u0010+\u001a\u0004\b2\u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b7\u0010+\u001a\u0004\b5\u00106R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\b;\u0010+\u001a\u0004\b9\u0010:R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010<\u0012\u0004\b?\u0010+\u001a\u0004\b=\u0010>R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010@\u0012\u0004\bC\u0010+\u001a\u0004\bA\u0010B¨\u0006F"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$Surrogate;", "", "", "id", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightTypeDto;", "type", "deeplink", "analytics_name", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto;", "generic_content", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto;", "ec_event_content", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcReservedContentDto;", "ec_reserved_content", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/PortfolioDigestContentDto;", "portfolio_digest_content", "<init>", "(Ljava/lang/String;Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightTypeDto;Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto;Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto;Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcReservedContentDto;Lmicrogram/contracts/invest_tab_highlights/proto/v1/PortfolioDigestContentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightTypeDto;Ljava/lang/String;Ljava/lang/String;Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto;Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto;Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcReservedContentDto;Lmicrogram/contracts/invest_tab_highlights/proto/v1/PortfolioDigestContentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_invest_tab_highlights_proto_v1_externalRelease", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightTypeDto;", "getType", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightTypeDto;", "getType$annotations", "getDeeplink", "getDeeplink$annotations", "getAnalytics_name", "getAnalytics_name$annotations", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto;", "getGeneric_content", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto;", "getGeneric_content$annotations", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto;", "getEc_event_content", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto;", "getEc_event_content$annotations", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcReservedContentDto;", "getEc_reserved_content", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcReservedContentDto;", "getEc_reserved_content$annotations", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/PortfolioDigestContentDto;", "getPortfolio_digest_content", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/PortfolioDigestContentDto;", "getPortfolio_digest_content$annotations", "Companion", "$serializer", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String analytics_name;
        private final String deeplink;
        private final EcEventContentDto ec_event_content;
        private final EcReservedContentDto ec_reserved_content;
        private final HighlightCardGenericContentDto generic_content;
        private final String id;
        private final PortfolioDigestContentDto portfolio_digest_content;
        private final HighlightTypeDto type;

        public Surrogate() {
            this((String) null, (HighlightTypeDto) null, (String) null, (String) null, (HighlightCardGenericContentDto) null, (EcEventContentDto) null, (EcReservedContentDto) null, (PortfolioDigestContentDto) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.type == surrogate.type && Intrinsics.areEqual(this.deeplink, surrogate.deeplink) && Intrinsics.areEqual(this.analytics_name, surrogate.analytics_name) && Intrinsics.areEqual(this.generic_content, surrogate.generic_content) && Intrinsics.areEqual(this.ec_event_content, surrogate.ec_event_content) && Intrinsics.areEqual(this.ec_reserved_content, surrogate.ec_reserved_content) && Intrinsics.areEqual(this.portfolio_digest_content, surrogate.portfolio_digest_content);
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.deeplink.hashCode()) * 31) + this.analytics_name.hashCode()) * 31;
            HighlightCardGenericContentDto highlightCardGenericContentDto = this.generic_content;
            int iHashCode2 = (iHashCode + (highlightCardGenericContentDto == null ? 0 : highlightCardGenericContentDto.hashCode())) * 31;
            EcEventContentDto ecEventContentDto = this.ec_event_content;
            int iHashCode3 = (iHashCode2 + (ecEventContentDto == null ? 0 : ecEventContentDto.hashCode())) * 31;
            EcReservedContentDto ecReservedContentDto = this.ec_reserved_content;
            int iHashCode4 = (iHashCode3 + (ecReservedContentDto == null ? 0 : ecReservedContentDto.hashCode())) * 31;
            PortfolioDigestContentDto portfolioDigestContentDto = this.portfolio_digest_content;
            return iHashCode4 + (portfolioDigestContentDto != null ? portfolioDigestContentDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", type=" + this.type + ", deeplink=" + this.deeplink + ", analytics_name=" + this.analytics_name + ", generic_content=" + this.generic_content + ", ec_event_content=" + this.ec_event_content + ", ec_reserved_content=" + this.ec_reserved_content + ", portfolio_digest_content=" + this.portfolio_digest_content + ")";
        }

        /* compiled from: HighlightCardDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$Surrogate;", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return HighlightCardDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, HighlightTypeDto highlightTypeDto, String str2, String str3, HighlightCardGenericContentDto highlightCardGenericContentDto, EcEventContentDto ecEventContentDto, EcReservedContentDto ecReservedContentDto, PortfolioDigestContentDto portfolioDigestContentDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.type = HighlightTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = highlightTypeDto;
            }
            if ((i & 4) == 0) {
                this.deeplink = "";
            } else {
                this.deeplink = str2;
            }
            if ((i & 8) == 0) {
                this.analytics_name = "";
            } else {
                this.analytics_name = str3;
            }
            if ((i & 16) == 0) {
                this.generic_content = null;
            } else {
                this.generic_content = highlightCardGenericContentDto;
            }
            if ((i & 32) == 0) {
                this.ec_event_content = null;
            } else {
                this.ec_event_content = ecEventContentDto;
            }
            if ((i & 64) == 0) {
                this.ec_reserved_content = null;
            } else {
                this.ec_reserved_content = ecReservedContentDto;
            }
            if ((i & 128) == 0) {
                this.portfolio_digest_content = null;
            } else {
                this.portfolio_digest_content = portfolioDigestContentDto;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$microgram_contracts_invest_tab_highlights_proto_v1_externalRelease */
        public static final /* synthetic */ void m3754x47065b30(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (self.type != HighlightTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, HighlightTypeDto.Serializer.INSTANCE, self.type);
            }
            if (!Intrinsics.areEqual(self.deeplink, "")) {
                output.encodeStringElement(serialDesc, 2, self.deeplink);
            }
            if (!Intrinsics.areEqual(self.analytics_name, "")) {
                output.encodeStringElement(serialDesc, 3, self.analytics_name);
            }
            HighlightCardGenericContentDto highlightCardGenericContentDto = self.generic_content;
            if (highlightCardGenericContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, HighlightCardGenericContentDto.Serializer.INSTANCE, highlightCardGenericContentDto);
            }
            EcEventContentDto ecEventContentDto = self.ec_event_content;
            if (ecEventContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, EcEventContentDto.Serializer.INSTANCE, ecEventContentDto);
            }
            EcReservedContentDto ecReservedContentDto = self.ec_reserved_content;
            if (ecReservedContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, EcReservedContentDto.Serializer.INSTANCE, ecReservedContentDto);
            }
            PortfolioDigestContentDto portfolioDigestContentDto = self.portfolio_digest_content;
            if (portfolioDigestContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, PortfolioDigestContentDto.Serializer.INSTANCE, portfolioDigestContentDto);
            }
        }

        public Surrogate(String id, HighlightTypeDto type2, String deeplink, String analytics_name, HighlightCardGenericContentDto highlightCardGenericContentDto, EcEventContentDto ecEventContentDto, EcReservedContentDto ecReservedContentDto, PortfolioDigestContentDto portfolioDigestContentDto) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(analytics_name, "analytics_name");
            this.id = id;
            this.type = type2;
            this.deeplink = deeplink;
            this.analytics_name = analytics_name;
            this.generic_content = highlightCardGenericContentDto;
            this.ec_event_content = ecEventContentDto;
            this.ec_reserved_content = ecReservedContentDto;
            this.portfolio_digest_content = portfolioDigestContentDto;
        }

        public /* synthetic */ Surrogate(String str, HighlightTypeDto highlightTypeDto, String str2, String str3, HighlightCardGenericContentDto highlightCardGenericContentDto, EcEventContentDto ecEventContentDto, EcReservedContentDto ecReservedContentDto, PortfolioDigestContentDto portfolioDigestContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? HighlightTypeDto.INSTANCE.getZeroValue() : highlightTypeDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : highlightCardGenericContentDto, (i & 32) != 0 ? null : ecEventContentDto, (i & 64) != 0 ? null : ecReservedContentDto, (i & 128) != 0 ? null : portfolioDigestContentDto);
        }

        public final String getId() {
            return this.id;
        }

        public final HighlightTypeDto getType() {
            return this.type;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getAnalytics_name() {
            return this.analytics_name;
        }

        public final HighlightCardGenericContentDto getGeneric_content() {
            return this.generic_content;
        }

        public final EcEventContentDto getEc_event_content() {
            return this.ec_event_content;
        }

        public final EcReservedContentDto getEc_reserved_content() {
            return this.ec_reserved_content;
        }

        public final PortfolioDigestContentDto getPortfolio_digest_content() {
            return this.portfolio_digest_content;
        }
    }

    /* compiled from: HighlightCardDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCard;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<HighlightCardDto, HighlightCard> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<HighlightCardDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HighlightCardDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HighlightCardDto> getBinaryBase64Serializer() {
            return (KSerializer) HighlightCardDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<HighlightCard> getProtoAdapter() {
            return HighlightCard.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HighlightCardDto getZeroValue() {
            return HighlightCardDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HighlightCardDto fromProto(HighlightCard proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            HighlightTypeDto highlightTypeDtoFromProto = HighlightTypeDto.INSTANCE.fromProto(proto.getType());
            String deeplink = proto.getDeeplink();
            String analytics_name = proto.getAnalytics_name();
            HighlightCardGenericContent generic_content = proto.getGeneric_content();
            DefaultConstructorMarker defaultConstructorMarker = null;
            HighlightCardGenericContentDto highlightCardGenericContentDtoFromProto = generic_content != null ? HighlightCardGenericContentDto.INSTANCE.fromProto(generic_content) : null;
            EcEventContent ec_event_content = proto.getEc_event_content();
            EcEventContentDto ecEventContentDtoFromProto = ec_event_content != null ? EcEventContentDto.INSTANCE.fromProto(ec_event_content) : null;
            EcReservedContent ec_reserved_content = proto.getEc_reserved_content();
            EcReservedContentDto ecReservedContentDtoFromProto = ec_reserved_content != null ? EcReservedContentDto.INSTANCE.fromProto(ec_reserved_content) : null;
            PortfolioDigestContent portfolio_digest_content = proto.getPortfolio_digest_content();
            return new HighlightCardDto(new Surrogate(id, highlightTypeDtoFromProto, deeplink, analytics_name, highlightCardGenericContentDtoFromProto, ecEventContentDtoFromProto, ecReservedContentDtoFromProto, portfolio_digest_content != null ? PortfolioDigestContentDto.INSTANCE.fromProto(portfolio_digest_content) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.invest_tab_highlights.proto.v1.HighlightCardDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HighlightCardDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new HighlightCardDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: HighlightCardDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "GenericContent", "EcEventContent", "EcReservedContent", "PortfolioDigestContent", "Companion", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto$EcEventContent;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto$EcReservedContent;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto$GenericContent;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto$PortfolioDigestContent;", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ContentDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ContentDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ContentDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: HighlightCardDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto$GenericContent;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto;", "value", "<init>", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto;", "getValue", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto;", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class GenericContent extends ContentDto {
            private final HighlightCardGenericContentDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GenericContent) && Intrinsics.areEqual(this.value, ((GenericContent) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "GenericContent(value=" + this.value + ")";
            }

            public final HighlightCardGenericContentDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GenericContent(HighlightCardGenericContentDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightCardDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto$EcEventContent;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto;", "value", "<init>", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto;", "getValue", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto;", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EcEventContent extends ContentDto {
            private final EcEventContentDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EcEventContent) && Intrinsics.areEqual(this.value, ((EcEventContent) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EcEventContent(value=" + this.value + ")";
            }

            public final EcEventContentDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EcEventContent(EcEventContentDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightCardDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto$EcReservedContent;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcReservedContentDto;", "value", "<init>", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcReservedContentDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcReservedContentDto;", "getValue", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcReservedContentDto;", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EcReservedContent extends ContentDto {
            private final EcReservedContentDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EcReservedContent) && Intrinsics.areEqual(this.value, ((EcReservedContent) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EcReservedContent(value=" + this.value + ")";
            }

            public final EcReservedContentDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EcReservedContent(EcReservedContentDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightCardDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto$PortfolioDigestContent;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/PortfolioDigestContentDto;", "value", "<init>", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/PortfolioDigestContentDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/PortfolioDigestContentDto;", "getValue", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/PortfolioDigestContentDto;", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PortfolioDigestContent extends ContentDto {
            private final PortfolioDigestContentDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PortfolioDigestContent) && Intrinsics.areEqual(this.value, ((PortfolioDigestContent) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PortfolioDigestContent(value=" + this.value + ")";
            }

            public final PortfolioDigestContentDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PortfolioDigestContent(PortfolioDigestContentDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: HighlightCardDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$ContentDto;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCard;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<ContentDto, HighlightCard> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<HighlightCard> getProtoAdapter() {
                return HighlightCard.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContentDto fromProto(HighlightCard proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getGeneric_content() != null) {
                    return new GenericContent(HighlightCardGenericContentDto.INSTANCE.fromProto(proto.getGeneric_content()));
                }
                if (proto.getEc_event_content() != null) {
                    return new EcEventContent(EcEventContentDto.INSTANCE.fromProto(proto.getEc_event_content()));
                }
                if (proto.getEc_reserved_content() != null) {
                    return new EcReservedContent(EcReservedContentDto.INSTANCE.fromProto(proto.getEc_reserved_content()));
                }
                if (proto.getPortfolio_digest_content() != null) {
                    return new PortfolioDigestContent(PortfolioDigestContentDto.INSTANCE.fromProto(proto.getPortfolio_digest_content()));
                }
                return null;
            }
        }
    }

    /* compiled from: HighlightCardDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<HighlightCardDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.invest_tab_highlights.proto.v1.HighlightCard", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, HighlightCardDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public HighlightCardDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new HighlightCardDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: HighlightCardDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "microgram.contracts.invest_tab_highlights.proto.v1.HighlightCardDto";
        }
    }
}
