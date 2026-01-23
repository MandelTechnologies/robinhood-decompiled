package advisory.portfolio_reveal.proto.p007v1;

import advisory.portfolio_reveal.proto.p007v1.GetPortfolioRevealResponseDto;
import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealAssetClassOverviewDto;
import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealInfoPageDto;
import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealIntroDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: GetPortfolioRevealResponseDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006/"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponse;", "Landroid/os/Parcelable;", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto$Surrogate;)V", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealIntroDto;", "intro", "", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealInfoPageDto;", "info_pages", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto;", "asset_class_overview", "(Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealIntroDto;Ljava/util/List;Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto;)V", "toProto", "()Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto$Surrogate;", "getIntro", "()Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealIntroDto;", "getInfo_pages", "()Ljava/util/List;", "getAsset_class_overview", "()Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GetPortfolioRevealResponseDto implements Dto3<GetPortfolioRevealResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetPortfolioRevealResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetPortfolioRevealResponseDto, GetPortfolioRevealResponse>> binaryBase64Serializer$delegate;
    private static final GetPortfolioRevealResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetPortfolioRevealResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetPortfolioRevealResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final PortfolioRevealIntroDto getIntro() {
        return this.surrogate.getIntro();
    }

    public final List<PortfolioRevealInfoPageDto> getInfo_pages() {
        return this.surrogate.getInfo_pages();
    }

    public final PortfolioRevealAssetClassOverviewDto getAsset_class_overview() {
        return this.surrogate.getAsset_class_overview();
    }

    public /* synthetic */ GetPortfolioRevealResponseDto(PortfolioRevealIntroDto portfolioRevealIntroDto, List list, PortfolioRevealAssetClassOverviewDto portfolioRevealAssetClassOverviewDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : portfolioRevealIntroDto, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : portfolioRevealAssetClassOverviewDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetPortfolioRevealResponseDto(PortfolioRevealIntroDto portfolioRevealIntroDto, List<PortfolioRevealInfoPageDto> info_pages, PortfolioRevealAssetClassOverviewDto portfolioRevealAssetClassOverviewDto) {
        this(new Surrogate(portfolioRevealIntroDto, info_pages, portfolioRevealAssetClassOverviewDto));
        Intrinsics.checkNotNullParameter(info_pages, "info_pages");
    }

    @Override // com.robinhood.idl.Dto
    public GetPortfolioRevealResponse toProto() {
        PortfolioRevealIntroDto intro = this.surrogate.getIntro();
        PortfolioRevealIntro proto = intro != null ? intro.toProto() : null;
        List<PortfolioRevealInfoPageDto> info_pages = this.surrogate.getInfo_pages();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(info_pages, 10));
        Iterator<T> it = info_pages.iterator();
        while (it.hasNext()) {
            arrayList.add(((PortfolioRevealInfoPageDto) it.next()).toProto());
        }
        PortfolioRevealAssetClassOverviewDto asset_class_overview = this.surrogate.getAsset_class_overview();
        return new GetPortfolioRevealResponse(proto, arrayList, asset_class_overview != null ? asset_class_overview.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[GetPortfolioRevealResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetPortfolioRevealResponseDto) && Intrinsics.areEqual(((GetPortfolioRevealResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetPortfolioRevealResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b.\u0010&\u001a\u0004\b,\u0010-¨\u00061"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto$Surrogate;", "", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealIntroDto;", "intro", "", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealInfoPageDto;", "info_pages", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto;", "asset_class_overview", "<init>", "(Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealIntroDto;Ljava/util/List;Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILadvisory/portfolio_reveal/proto/v1/PortfolioRevealIntroDto;Ljava/util/List;Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_portfolio_reveal_proto_v1_externalRelease", "(Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealIntroDto;", "getIntro", "()Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealIntroDto;", "getIntro$annotations", "()V", "Ljava/util/List;", "getInfo_pages", "()Ljava/util/List;", "getInfo_pages$annotations", "Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto;", "getAsset_class_overview", "()Ladvisory/portfolio_reveal/proto/v1/PortfolioRevealAssetClassOverviewDto;", "getAsset_class_overview$annotations", "Companion", "$serializer", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final PortfolioRevealAssetClassOverviewDto asset_class_overview;
        private final List<PortfolioRevealInfoPageDto> info_pages;
        private final PortfolioRevealIntroDto intro;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: advisory.portfolio_reveal.proto.v1.GetPortfolioRevealResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetPortfolioRevealResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((PortfolioRevealIntroDto) null, (List) null, (PortfolioRevealAssetClassOverviewDto) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(PortfolioRevealInfoPageDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.intro, surrogate.intro) && Intrinsics.areEqual(this.info_pages, surrogate.info_pages) && Intrinsics.areEqual(this.asset_class_overview, surrogate.asset_class_overview);
        }

        public int hashCode() {
            PortfolioRevealIntroDto portfolioRevealIntroDto = this.intro;
            int iHashCode = (((portfolioRevealIntroDto == null ? 0 : portfolioRevealIntroDto.hashCode()) * 31) + this.info_pages.hashCode()) * 31;
            PortfolioRevealAssetClassOverviewDto portfolioRevealAssetClassOverviewDto = this.asset_class_overview;
            return iHashCode + (portfolioRevealAssetClassOverviewDto != null ? portfolioRevealAssetClassOverviewDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(intro=" + this.intro + ", info_pages=" + this.info_pages + ", asset_class_overview=" + this.asset_class_overview + ")";
        }

        /* compiled from: GetPortfolioRevealResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto$Surrogate;", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetPortfolioRevealResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, PortfolioRevealIntroDto portfolioRevealIntroDto, List list, PortfolioRevealAssetClassOverviewDto portfolioRevealAssetClassOverviewDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.intro = null;
            } else {
                this.intro = portfolioRevealIntroDto;
            }
            if ((i & 2) == 0) {
                this.info_pages = CollectionsKt.emptyList();
            } else {
                this.info_pages = list;
            }
            if ((i & 4) == 0) {
                this.asset_class_overview = null;
            } else {
                this.asset_class_overview = portfolioRevealAssetClassOverviewDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_portfolio_reveal_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            PortfolioRevealIntroDto portfolioRevealIntroDto = self.intro;
            if (portfolioRevealIntroDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, PortfolioRevealIntroDto.Serializer.INSTANCE, portfolioRevealIntroDto);
            }
            if (!Intrinsics.areEqual(self.info_pages, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.info_pages);
            }
            PortfolioRevealAssetClassOverviewDto portfolioRevealAssetClassOverviewDto = self.asset_class_overview;
            if (portfolioRevealAssetClassOverviewDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, PortfolioRevealAssetClassOverviewDto.Serializer.INSTANCE, portfolioRevealAssetClassOverviewDto);
            }
        }

        public Surrogate(PortfolioRevealIntroDto portfolioRevealIntroDto, List<PortfolioRevealInfoPageDto> info_pages, PortfolioRevealAssetClassOverviewDto portfolioRevealAssetClassOverviewDto) {
            Intrinsics.checkNotNullParameter(info_pages, "info_pages");
            this.intro = portfolioRevealIntroDto;
            this.info_pages = info_pages;
            this.asset_class_overview = portfolioRevealAssetClassOverviewDto;
        }

        public final PortfolioRevealIntroDto getIntro() {
            return this.intro;
        }

        public final List<PortfolioRevealInfoPageDto> getInfo_pages() {
            return this.info_pages;
        }

        public /* synthetic */ Surrogate(PortfolioRevealIntroDto portfolioRevealIntroDto, List list, PortfolioRevealAssetClassOverviewDto portfolioRevealAssetClassOverviewDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : portfolioRevealIntroDto, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : portfolioRevealAssetClassOverviewDto);
        }

        public final PortfolioRevealAssetClassOverviewDto getAsset_class_overview() {
            return this.asset_class_overview;
        }
    }

    /* compiled from: GetPortfolioRevealResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetPortfolioRevealResponseDto, GetPortfolioRevealResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetPortfolioRevealResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetPortfolioRevealResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetPortfolioRevealResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetPortfolioRevealResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetPortfolioRevealResponse> getProtoAdapter() {
            return GetPortfolioRevealResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetPortfolioRevealResponseDto getZeroValue() {
            return GetPortfolioRevealResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetPortfolioRevealResponseDto fromProto(GetPortfolioRevealResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            PortfolioRevealIntro intro = proto.getIntro();
            DefaultConstructorMarker defaultConstructorMarker = null;
            PortfolioRevealIntroDto portfolioRevealIntroDtoFromProto = intro != null ? PortfolioRevealIntroDto.INSTANCE.fromProto(intro) : null;
            List<PortfolioRevealInfoPage> info_pages = proto.getInfo_pages();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(info_pages, 10));
            Iterator<T> it = info_pages.iterator();
            while (it.hasNext()) {
                arrayList.add(PortfolioRevealInfoPageDto.INSTANCE.fromProto((PortfolioRevealInfoPage) it.next()));
            }
            PortfolioRevealAssetClassOverview asset_class_overview = proto.getAsset_class_overview();
            return new GetPortfolioRevealResponseDto(new Surrogate(portfolioRevealIntroDtoFromProto, arrayList, asset_class_overview != null ? PortfolioRevealAssetClassOverviewDto.INSTANCE.fromProto(asset_class_overview) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.portfolio_reveal.proto.v1.GetPortfolioRevealResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetPortfolioRevealResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetPortfolioRevealResponseDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetPortfolioRevealResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes23.dex */
    public static final class Serializer implements KSerializer<GetPortfolioRevealResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.portfolio_reveal.proto.v1.GetPortfolioRevealResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetPortfolioRevealResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetPortfolioRevealResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetPortfolioRevealResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetPortfolioRevealResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/portfolio_reveal/proto/v1/GetPortfolioRevealResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory_portfolio_reveal.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "advisory.portfolio_reveal.proto.v1.GetPortfolioRevealResponseDto";
        }
    }
}
