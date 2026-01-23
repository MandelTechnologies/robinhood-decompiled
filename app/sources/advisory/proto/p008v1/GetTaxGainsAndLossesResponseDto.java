package advisory.proto.p008v1;

import advisory.proto.p008v1.GainsAndLossesFullScreenDataDto;
import advisory.proto.p008v1.GetTaxGainsAndLossesAccountSnapshotDto;
import advisory.proto.p008v1.GetTaxGainsAndLossesResponseDto;
import advisory.proto.p008v1.GetTaxGainsAndLossesSectionDto;
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

/* compiled from: GetTaxGainsAndLossesResponseDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-,./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8F¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0015¨\u00060"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxGainsAndLossesResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/GetTaxGainsAndLossesResponse;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/GetTaxGainsAndLossesResponseDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/GetTaxGainsAndLossesResponseDto$Surrogate;)V", "", "Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshotDto;", "account_snapshots", "Ladvisory/proto/v1/GetTaxGainsAndLossesSectionDto;", "aggregated_accounts_sections", "Ladvisory/proto/v1/GainsAndLossesFullScreenDataDto;", "full_screen_data", "", "year", "(Ljava/util/List;Ljava/util/List;Ladvisory/proto/v1/GainsAndLossesFullScreenDataDto;Ljava/lang/String;)V", "toProto", "()Ladvisory/proto/v1/GetTaxGainsAndLossesResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/GetTaxGainsAndLossesResponseDto$Surrogate;", "getAccount_snapshots", "()Ljava/util/List;", "getAggregated_accounts_sections", "getFull_screen_data", "()Ladvisory/proto/v1/GainsAndLossesFullScreenDataDto;", "getYear", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class GetTaxGainsAndLossesResponseDto implements Dto3<GetTaxGainsAndLossesResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetTaxGainsAndLossesResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetTaxGainsAndLossesResponseDto, GetTaxGainsAndLossesResponse>> binaryBase64Serializer$delegate;
    private static final GetTaxGainsAndLossesResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetTaxGainsAndLossesResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetTaxGainsAndLossesResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<GetTaxGainsAndLossesAccountSnapshotDto> getAccount_snapshots() {
        return this.surrogate.getAccount_snapshots();
    }

    public final List<GetTaxGainsAndLossesSectionDto> getAggregated_accounts_sections() {
        return this.surrogate.getAggregated_accounts_sections();
    }

    public final GainsAndLossesFullScreenDataDto getFull_screen_data() {
        return this.surrogate.getFull_screen_data();
    }

    public final String getYear() {
        return this.surrogate.getYear();
    }

    public /* synthetic */ GetTaxGainsAndLossesResponseDto(List list, List list2, GainsAndLossesFullScreenDataDto gainsAndLossesFullScreenDataDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? null : gainsAndLossesFullScreenDataDto, (i & 8) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetTaxGainsAndLossesResponseDto(List<GetTaxGainsAndLossesAccountSnapshotDto> account_snapshots, List<GetTaxGainsAndLossesSectionDto> aggregated_accounts_sections, GainsAndLossesFullScreenDataDto gainsAndLossesFullScreenDataDto, String year) {
        this(new Surrogate(account_snapshots, aggregated_accounts_sections, gainsAndLossesFullScreenDataDto, year));
        Intrinsics.checkNotNullParameter(account_snapshots, "account_snapshots");
        Intrinsics.checkNotNullParameter(aggregated_accounts_sections, "aggregated_accounts_sections");
        Intrinsics.checkNotNullParameter(year, "year");
    }

    @Override // com.robinhood.idl.Dto
    public GetTaxGainsAndLossesResponse toProto() {
        List<GetTaxGainsAndLossesAccountSnapshotDto> account_snapshots = this.surrogate.getAccount_snapshots();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(account_snapshots, 10));
        Iterator<T> it = account_snapshots.iterator();
        while (it.hasNext()) {
            arrayList.add(((GetTaxGainsAndLossesAccountSnapshotDto) it.next()).toProto());
        }
        List<GetTaxGainsAndLossesSectionDto> aggregated_accounts_sections = this.surrogate.getAggregated_accounts_sections();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(aggregated_accounts_sections, 10));
        Iterator<T> it2 = aggregated_accounts_sections.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((GetTaxGainsAndLossesSectionDto) it2.next()).toProto());
        }
        GainsAndLossesFullScreenDataDto full_screen_data = this.surrogate.getFull_screen_data();
        return new GetTaxGainsAndLossesResponse(arrayList, arrayList2, full_screen_data != null ? full_screen_data.toProto() : null, this.surrogate.getYear(), null, 16, null);
    }

    public String toString() {
        return "[GetTaxGainsAndLossesResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetTaxGainsAndLossesResponseDto) && Intrinsics.areEqual(((GetTaxGainsAndLossesResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetTaxGainsAndLossesResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000221B=\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010%R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b-\u0010'\u001a\u0004\b+\u0010,R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b0\u0010'\u001a\u0004\b/\u0010\u001c¨\u00063"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxGainsAndLossesResponseDto$Surrogate;", "", "", "Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshotDto;", "account_snapshots", "Ladvisory/proto/v1/GetTaxGainsAndLossesSectionDto;", "aggregated_accounts_sections", "Ladvisory/proto/v1/GainsAndLossesFullScreenDataDto;", "full_screen_data", "", "year", "<init>", "(Ljava/util/List;Ljava/util/List;Ladvisory/proto/v1/GainsAndLossesFullScreenDataDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ladvisory/proto/v1/GainsAndLossesFullScreenDataDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/GetTaxGainsAndLossesResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAccount_snapshots", "()Ljava/util/List;", "getAccount_snapshots$annotations", "()V", "getAggregated_accounts_sections", "getAggregated_accounts_sections$annotations", "Ladvisory/proto/v1/GainsAndLossesFullScreenDataDto;", "getFull_screen_data", "()Ladvisory/proto/v1/GainsAndLossesFullScreenDataDto;", "getFull_screen_data$annotations", "Ljava/lang/String;", "getYear", "getYear$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<GetTaxGainsAndLossesAccountSnapshotDto> account_snapshots;
        private final List<GetTaxGainsAndLossesSectionDto> aggregated_accounts_sections;
        private final GainsAndLossesFullScreenDataDto full_screen_data;
        private final String year;

        public Surrogate() {
            this((List) null, (List) null, (GainsAndLossesFullScreenDataDto) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(GetTaxGainsAndLossesAccountSnapshotDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(GetTaxGainsAndLossesSectionDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_snapshots, surrogate.account_snapshots) && Intrinsics.areEqual(this.aggregated_accounts_sections, surrogate.aggregated_accounts_sections) && Intrinsics.areEqual(this.full_screen_data, surrogate.full_screen_data) && Intrinsics.areEqual(this.year, surrogate.year);
        }

        public int hashCode() {
            int iHashCode = ((this.account_snapshots.hashCode() * 31) + this.aggregated_accounts_sections.hashCode()) * 31;
            GainsAndLossesFullScreenDataDto gainsAndLossesFullScreenDataDto = this.full_screen_data;
            return ((iHashCode + (gainsAndLossesFullScreenDataDto == null ? 0 : gainsAndLossesFullScreenDataDto.hashCode())) * 31) + this.year.hashCode();
        }

        public String toString() {
            return "Surrogate(account_snapshots=" + this.account_snapshots + ", aggregated_accounts_sections=" + this.aggregated_accounts_sections + ", full_screen_data=" + this.full_screen_data + ", year=" + this.year + ")";
        }

        /* compiled from: GetTaxGainsAndLossesResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxGainsAndLossesResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetTaxGainsAndLossesResponseDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetTaxGainsAndLossesResponseDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: advisory.proto.v1.GetTaxGainsAndLossesResponseDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetTaxGainsAndLossesResponseDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: advisory.proto.v1.GetTaxGainsAndLossesResponseDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetTaxGainsAndLossesResponseDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null};
        }

        public /* synthetic */ Surrogate(int i, List list, List list2, GainsAndLossesFullScreenDataDto gainsAndLossesFullScreenDataDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_snapshots = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.aggregated_accounts_sections = CollectionsKt.emptyList();
            } else {
                this.aggregated_accounts_sections = list2;
            }
            if ((i & 4) == 0) {
                this.full_screen_data = null;
            } else {
                this.full_screen_data = gainsAndLossesFullScreenDataDto;
            }
            if ((i & 8) == 0) {
                this.year = "";
            } else {
                this.year = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_snapshots, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.account_snapshots);
            }
            if (!Intrinsics.areEqual(self.aggregated_accounts_sections, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.aggregated_accounts_sections);
            }
            GainsAndLossesFullScreenDataDto gainsAndLossesFullScreenDataDto = self.full_screen_data;
            if (gainsAndLossesFullScreenDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, GainsAndLossesFullScreenDataDto.Serializer.INSTANCE, gainsAndLossesFullScreenDataDto);
            }
            if (Intrinsics.areEqual(self.year, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.year);
        }

        public Surrogate(List<GetTaxGainsAndLossesAccountSnapshotDto> account_snapshots, List<GetTaxGainsAndLossesSectionDto> aggregated_accounts_sections, GainsAndLossesFullScreenDataDto gainsAndLossesFullScreenDataDto, String year) {
            Intrinsics.checkNotNullParameter(account_snapshots, "account_snapshots");
            Intrinsics.checkNotNullParameter(aggregated_accounts_sections, "aggregated_accounts_sections");
            Intrinsics.checkNotNullParameter(year, "year");
            this.account_snapshots = account_snapshots;
            this.aggregated_accounts_sections = aggregated_accounts_sections;
            this.full_screen_data = gainsAndLossesFullScreenDataDto;
            this.year = year;
        }

        public final List<GetTaxGainsAndLossesAccountSnapshotDto> getAccount_snapshots() {
            return this.account_snapshots;
        }

        public /* synthetic */ Surrogate(List list, List list2, GainsAndLossesFullScreenDataDto gainsAndLossesFullScreenDataDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? null : gainsAndLossesFullScreenDataDto, (i & 8) != 0 ? "" : str);
        }

        public final List<GetTaxGainsAndLossesSectionDto> getAggregated_accounts_sections() {
            return this.aggregated_accounts_sections;
        }

        public final GainsAndLossesFullScreenDataDto getFull_screen_data() {
            return this.full_screen_data;
        }

        public final String getYear() {
            return this.year;
        }
    }

    /* compiled from: GetTaxGainsAndLossesResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxGainsAndLossesResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/GetTaxGainsAndLossesResponseDto;", "Ladvisory/proto/v1/GetTaxGainsAndLossesResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/GetTaxGainsAndLossesResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetTaxGainsAndLossesResponseDto, GetTaxGainsAndLossesResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetTaxGainsAndLossesResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTaxGainsAndLossesResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTaxGainsAndLossesResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetTaxGainsAndLossesResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetTaxGainsAndLossesResponse> getProtoAdapter() {
            return GetTaxGainsAndLossesResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTaxGainsAndLossesResponseDto getZeroValue() {
            return GetTaxGainsAndLossesResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTaxGainsAndLossesResponseDto fromProto(GetTaxGainsAndLossesResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<GetTaxGainsAndLossesAccountSnapshot> account_snapshots = proto.getAccount_snapshots();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(account_snapshots, 10));
            Iterator<T> it = account_snapshots.iterator();
            while (it.hasNext()) {
                arrayList.add(GetTaxGainsAndLossesAccountSnapshotDto.INSTANCE.fromProto((GetTaxGainsAndLossesAccountSnapshot) it.next()));
            }
            List<GetTaxGainsAndLossesSection> aggregated_accounts_sections = proto.getAggregated_accounts_sections();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(aggregated_accounts_sections, 10));
            Iterator<T> it2 = aggregated_accounts_sections.iterator();
            while (it2.hasNext()) {
                arrayList2.add(GetTaxGainsAndLossesSectionDto.INSTANCE.fromProto((GetTaxGainsAndLossesSection) it2.next()));
            }
            GainsAndLossesFullScreenData full_screen_data = proto.getFull_screen_data();
            return new GetTaxGainsAndLossesResponseDto(new Surrogate(arrayList, arrayList2, full_screen_data != null ? GainsAndLossesFullScreenDataDto.INSTANCE.fromProto(full_screen_data) : null, proto.getYear()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.GetTaxGainsAndLossesResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetTaxGainsAndLossesResponseDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new GetTaxGainsAndLossesResponseDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetTaxGainsAndLossesResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxGainsAndLossesResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetTaxGainsAndLossesResponseDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/GetTaxGainsAndLossesResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetTaxGainsAndLossesResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.GetTaxGainsAndLossesResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetTaxGainsAndLossesResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetTaxGainsAndLossesResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetTaxGainsAndLossesResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetTaxGainsAndLossesResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxGainsAndLossesResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "advisory.proto.v1.GetTaxGainsAndLossesResponseDto";
        }
    }
}
