package advisory.proto.p008v1;

import advisory.proto.p008v1.CategoryDto;
import advisory.proto.p008v1.LinkDetailsDto;
import advisory.proto.p008v1.RegionDto;
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
import org.bouncycastle.i18n.ErrorBundle;
import yoda.service.dashboard.AssetClassRegion;
import yoda.service.dashboard.AssetClassRegionDto;
import yoda.service.dashboard.ClassificationDetails;
import yoda.service.dashboard.ClassificationDetailsDto;

/* compiled from: RegionDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, m3636d2 = {"Ladvisory/proto/v1/RegionDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/Region;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/RegionDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/RegionDto$Surrogate;)V", "Lyoda/service/dashboard/AssetClassRegionDto;", "region", "Lyoda/service/dashboard/ClassificationDetailsDto;", ErrorBundle.DETAIL_ENTRY, "", "Ladvisory/proto/v1/CategoryDto;", "categories", "Ladvisory/proto/v1/LinkDetailsDto;", "link", "(Lyoda/service/dashboard/AssetClassRegionDto;Lyoda/service/dashboard/ClassificationDetailsDto;Ljava/util/List;Ladvisory/proto/v1/LinkDetailsDto;)V", "toProto", "()Ladvisory/proto/v1/Region;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/RegionDto$Surrogate;", "getRegion", "()Lyoda/service/dashboard/AssetClassRegionDto;", "getDetails", "()Lyoda/service/dashboard/ClassificationDetailsDto;", "getCategories", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RegionDto implements Dto3<Region>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<RegionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RegionDto, Region>> binaryBase64Serializer$delegate;
    private static final RegionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RegionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RegionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final AssetClassRegionDto getRegion() {
        return this.surrogate.getRegion();
    }

    public final ClassificationDetailsDto getDetails() {
        return this.surrogate.getDetails();
    }

    public final List<CategoryDto> getCategories() {
        return this.surrogate.getCategories();
    }

    public /* synthetic */ RegionDto(AssetClassRegionDto assetClassRegionDto, ClassificationDetailsDto classificationDetailsDto, List list, LinkDetailsDto linkDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AssetClassRegionDto.INSTANCE.getZeroValue() : assetClassRegionDto, (i & 2) != 0 ? null : classificationDetailsDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : linkDetailsDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RegionDto(AssetClassRegionDto region, ClassificationDetailsDto classificationDetailsDto, List<CategoryDto> categories, LinkDetailsDto linkDetailsDto) {
        this(new Surrogate(region, classificationDetailsDto, categories, linkDetailsDto));
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(categories, "categories");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Region toProto() {
        AssetClassRegion assetClassRegion = (AssetClassRegion) this.surrogate.getRegion().toProto();
        ClassificationDetailsDto details = this.surrogate.getDetails();
        ClassificationDetails proto = details != null ? details.toProto() : null;
        List<CategoryDto> categories = this.surrogate.getCategories();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(categories, 10));
        Iterator<T> it = categories.iterator();
        while (it.hasNext()) {
            arrayList.add(((CategoryDto) it.next()).toProto());
        }
        LinkDetailsDto link = this.surrogate.getLink();
        return new Region(assetClassRegion, proto, arrayList, link != null ? link.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[RegionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RegionDto) && Intrinsics.areEqual(((RegionDto) other).surrogate, this.surrogate);
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
    /* compiled from: RegionDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000265B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b4\u0010(\u001a\u0004\b2\u00103¨\u00067"}, m3636d2 = {"Ladvisory/proto/v1/RegionDto$Surrogate;", "", "Lyoda/service/dashboard/AssetClassRegionDto;", "region", "Lyoda/service/dashboard/ClassificationDetailsDto;", ErrorBundle.DETAIL_ENTRY, "", "Ladvisory/proto/v1/CategoryDto;", "categories", "Ladvisory/proto/v1/LinkDetailsDto;", "link", "<init>", "(Lyoda/service/dashboard/AssetClassRegionDto;Lyoda/service/dashboard/ClassificationDetailsDto;Ljava/util/List;Ladvisory/proto/v1/LinkDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILyoda/service/dashboard/AssetClassRegionDto;Lyoda/service/dashboard/ClassificationDetailsDto;Ljava/util/List;Ladvisory/proto/v1/LinkDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/RegionDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lyoda/service/dashboard/AssetClassRegionDto;", "getRegion", "()Lyoda/service/dashboard/AssetClassRegionDto;", "getRegion$annotations", "()V", "Lyoda/service/dashboard/ClassificationDetailsDto;", "getDetails", "()Lyoda/service/dashboard/ClassificationDetailsDto;", "getDetails$annotations", "Ljava/util/List;", "getCategories", "()Ljava/util/List;", "getCategories$annotations", "Ladvisory/proto/v1/LinkDetailsDto;", "getLink", "()Ladvisory/proto/v1/LinkDetailsDto;", "getLink$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<CategoryDto> categories;
        private final ClassificationDetailsDto details;
        private final LinkDetailsDto link;
        private final AssetClassRegionDto region;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: advisory.proto.v1.RegionDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RegionDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((AssetClassRegionDto) null, (ClassificationDetailsDto) null, (List) null, (LinkDetailsDto) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(CategoryDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.region == surrogate.region && Intrinsics.areEqual(this.details, surrogate.details) && Intrinsics.areEqual(this.categories, surrogate.categories) && Intrinsics.areEqual(this.link, surrogate.link);
        }

        public int hashCode() {
            int iHashCode = this.region.hashCode() * 31;
            ClassificationDetailsDto classificationDetailsDto = this.details;
            int iHashCode2 = (((iHashCode + (classificationDetailsDto == null ? 0 : classificationDetailsDto.hashCode())) * 31) + this.categories.hashCode()) * 31;
            LinkDetailsDto linkDetailsDto = this.link;
            return iHashCode2 + (linkDetailsDto != null ? linkDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(region=" + this.region + ", details=" + this.details + ", categories=" + this.categories + ", link=" + this.link + ")";
        }

        /* compiled from: RegionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/RegionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/RegionDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RegionDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, AssetClassRegionDto assetClassRegionDto, ClassificationDetailsDto classificationDetailsDto, List list, LinkDetailsDto linkDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.region = (i & 1) == 0 ? AssetClassRegionDto.INSTANCE.getZeroValue() : assetClassRegionDto;
            if ((i & 2) == 0) {
                this.details = null;
            } else {
                this.details = classificationDetailsDto;
            }
            if ((i & 4) == 0) {
                this.categories = CollectionsKt.emptyList();
            } else {
                this.categories = list;
            }
            if ((i & 8) == 0) {
                this.link = null;
            } else {
                this.link = linkDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.region != AssetClassRegionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, AssetClassRegionDto.Serializer.INSTANCE, self.region);
            }
            ClassificationDetailsDto classificationDetailsDto = self.details;
            if (classificationDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ClassificationDetailsDto.Serializer.INSTANCE, classificationDetailsDto);
            }
            if (!Intrinsics.areEqual(self.categories, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.categories);
            }
            LinkDetailsDto linkDetailsDto = self.link;
            if (linkDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, LinkDetailsDto.Serializer.INSTANCE, linkDetailsDto);
            }
        }

        public Surrogate(AssetClassRegionDto region, ClassificationDetailsDto classificationDetailsDto, List<CategoryDto> categories, LinkDetailsDto linkDetailsDto) {
            Intrinsics.checkNotNullParameter(region, "region");
            Intrinsics.checkNotNullParameter(categories, "categories");
            this.region = region;
            this.details = classificationDetailsDto;
            this.categories = categories;
            this.link = linkDetailsDto;
        }

        public final AssetClassRegionDto getRegion() {
            return this.region;
        }

        public /* synthetic */ Surrogate(AssetClassRegionDto assetClassRegionDto, ClassificationDetailsDto classificationDetailsDto, List list, LinkDetailsDto linkDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? AssetClassRegionDto.INSTANCE.getZeroValue() : assetClassRegionDto, (i & 2) != 0 ? null : classificationDetailsDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : linkDetailsDto);
        }

        public final ClassificationDetailsDto getDetails() {
            return this.details;
        }

        public final List<CategoryDto> getCategories() {
            return this.categories;
        }

        public final LinkDetailsDto getLink() {
            return this.link;
        }
    }

    /* compiled from: RegionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/RegionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/RegionDto;", "Ladvisory/proto/v1/Region;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/RegionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<RegionDto, Region> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RegionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RegionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RegionDto> getBinaryBase64Serializer() {
            return (KSerializer) RegionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Region> getProtoAdapter() {
            return Region.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RegionDto getZeroValue() {
            return RegionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RegionDto fromProto(Region proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            AssetClassRegionDto assetClassRegionDtoFromProto = AssetClassRegionDto.INSTANCE.fromProto(proto.getRegion());
            ClassificationDetails details = proto.getDetails();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ClassificationDetailsDto classificationDetailsDtoFromProto = details != null ? ClassificationDetailsDto.INSTANCE.fromProto(details) : null;
            List<Category> categories = proto.getCategories();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(categories, 10));
            Iterator<T> it = categories.iterator();
            while (it.hasNext()) {
                arrayList.add(CategoryDto.INSTANCE.fromProto((Category) it.next()));
            }
            LinkDetails link = proto.getLink();
            return new RegionDto(new Surrogate(assetClassRegionDtoFromProto, classificationDetailsDtoFromProto, arrayList, link != null ? LinkDetailsDto.INSTANCE.fromProto(link) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.RegionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RegionDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new RegionDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: RegionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/RegionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/RegionDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/RegionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<RegionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.Region", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RegionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RegionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RegionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: RegionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/RegionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "advisory.proto.v1.RegionDto";
        }
    }
}
