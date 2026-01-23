package advisory.proto.p008v1;

import advisory.proto.p008v1.GetIRAManagementStyleSelectionResponseDto;
import advisory.proto.p008v1.ManagementStyleSelectionCtaDto;
import advisory.proto.p008v1.ManagementStyleSelectionLayoutDto;
import advisory.proto.p008v1.StrategiesValuePropsTermsSheetDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
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

/* compiled from: GetIRAManagementStyleSelectionResponseDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00040/12B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u000f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00063"}, m3636d2 = {"Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponse;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponseDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponseDto$Surrogate;)V", "Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto;", "layout", "", "title", "", "Ladvisory/proto/v1/ManagementStyleSelectionCtaDto;", "ctas", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Ladvisory/proto/v1/StrategiesValuePropsTermsSheetDto;", "terms_sheet", "(Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ladvisory/proto/v1/StrategiesValuePropsTermsSheetDto;)V", "toProto", "()Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponseDto$Surrogate;", "getLayout", "()Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto;", "getTitle", "getCtas", "()Ljava/util/List;", "getDisclosure", "getTerms_sheet", "()Ladvisory/proto/v1/StrategiesValuePropsTermsSheetDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class GetIRAManagementStyleSelectionResponseDto implements Dto3<GetIRAManagementStyleSelectionResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetIRAManagementStyleSelectionResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetIRAManagementStyleSelectionResponseDto, GetIRAManagementStyleSelectionResponse>> binaryBase64Serializer$delegate;
    private static final GetIRAManagementStyleSelectionResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetIRAManagementStyleSelectionResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetIRAManagementStyleSelectionResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ManagementStyleSelectionLayoutDto getLayout() {
        return this.surrogate.getLayout();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final List<ManagementStyleSelectionCtaDto> getCtas() {
        return this.surrogate.getCtas();
    }

    public final String getDisclosure() {
        return this.surrogate.getDisclosure();
    }

    public final StrategiesValuePropsTermsSheetDto getTerms_sheet() {
        return this.surrogate.getTerms_sheet();
    }

    public /* synthetic */ GetIRAManagementStyleSelectionResponseDto(ManagementStyleSelectionLayoutDto managementStyleSelectionLayoutDto, String str, List list, String str2, StrategiesValuePropsTermsSheetDto strategiesValuePropsTermsSheetDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : managementStyleSelectionLayoutDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : strategiesValuePropsTermsSheetDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetIRAManagementStyleSelectionResponseDto(ManagementStyleSelectionLayoutDto managementStyleSelectionLayoutDto, String title, List<ManagementStyleSelectionCtaDto> ctas, String disclosure, StrategiesValuePropsTermsSheetDto strategiesValuePropsTermsSheetDto) {
        this(new Surrogate(managementStyleSelectionLayoutDto, title, ctas, disclosure, strategiesValuePropsTermsSheetDto));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ctas, "ctas");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
    }

    @Override // com.robinhood.idl.Dto
    public GetIRAManagementStyleSelectionResponse toProto() {
        ManagementStyleSelectionLayoutDto layout = this.surrogate.getLayout();
        ManagementStyleSelectionLayout proto = layout != null ? layout.toProto() : null;
        String title = this.surrogate.getTitle();
        List<ManagementStyleSelectionCtaDto> ctas = this.surrogate.getCtas();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(ctas, 10));
        Iterator<T> it = ctas.iterator();
        while (it.hasNext()) {
            arrayList.add(((ManagementStyleSelectionCtaDto) it.next()).toProto());
        }
        String disclosure = this.surrogate.getDisclosure();
        StrategiesValuePropsTermsSheetDto terms_sheet = this.surrogate.getTerms_sheet();
        return new GetIRAManagementStyleSelectionResponse(proto, title, arrayList, disclosure, terms_sheet != null ? terms_sheet.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[GetIRAManagementStyleSelectionResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetIRAManagementStyleSelectionResponseDto) && Intrinsics.areEqual(((GetIRAManagementStyleSelectionResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetIRAManagementStyleSelectionResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083\b\u0018\u0000 62\u00020\u0001:\u000276BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001dR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b/\u0010(\u001a\u0004\b-\u0010.R \u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010)\u0012\u0004\b1\u0010(\u001a\u0004\b0\u0010\u001dR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00102\u0012\u0004\b5\u0010(\u001a\u0004\b3\u00104¨\u00068"}, m3636d2 = {"Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponseDto$Surrogate;", "", "Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto;", "layout", "", "title", "", "Ladvisory/proto/v1/ManagementStyleSelectionCtaDto;", "ctas", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Ladvisory/proto/v1/StrategiesValuePropsTermsSheetDto;", "terms_sheet", "<init>", "(Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ladvisory/proto/v1/StrategiesValuePropsTermsSheetDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILadvisory/proto/v1/ManagementStyleSelectionLayoutDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ladvisory/proto/v1/StrategiesValuePropsTermsSheetDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto;", "getLayout", "()Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto;", "getLayout$annotations", "()V", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "Ljava/util/List;", "getCtas", "()Ljava/util/List;", "getCtas$annotations", "getDisclosure", "getDisclosure$annotations", "Ladvisory/proto/v1/StrategiesValuePropsTermsSheetDto;", "getTerms_sheet", "()Ladvisory/proto/v1/StrategiesValuePropsTermsSheetDto;", "getTerms_sheet$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<ManagementStyleSelectionCtaDto> ctas;
        private final String disclosure;
        private final ManagementStyleSelectionLayoutDto layout;
        private final StrategiesValuePropsTermsSheetDto terms_sheet;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: advisory.proto.v1.GetIRAManagementStyleSelectionResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetIRAManagementStyleSelectionResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((ManagementStyleSelectionLayoutDto) null, (String) null, (List) null, (String) null, (StrategiesValuePropsTermsSheetDto) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(ManagementStyleSelectionCtaDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.layout, surrogate.layout) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.ctas, surrogate.ctas) && Intrinsics.areEqual(this.disclosure, surrogate.disclosure) && Intrinsics.areEqual(this.terms_sheet, surrogate.terms_sheet);
        }

        public int hashCode() {
            ManagementStyleSelectionLayoutDto managementStyleSelectionLayoutDto = this.layout;
            int iHashCode = (((((((managementStyleSelectionLayoutDto == null ? 0 : managementStyleSelectionLayoutDto.hashCode()) * 31) + this.title.hashCode()) * 31) + this.ctas.hashCode()) * 31) + this.disclosure.hashCode()) * 31;
            StrategiesValuePropsTermsSheetDto strategiesValuePropsTermsSheetDto = this.terms_sheet;
            return iHashCode + (strategiesValuePropsTermsSheetDto != null ? strategiesValuePropsTermsSheetDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(layout=" + this.layout + ", title=" + this.title + ", ctas=" + this.ctas + ", disclosure=" + this.disclosure + ", terms_sheet=" + this.terms_sheet + ")";
        }

        /* compiled from: GetIRAManagementStyleSelectionResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponseDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetIRAManagementStyleSelectionResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ManagementStyleSelectionLayoutDto managementStyleSelectionLayoutDto, String str, List list, String str2, StrategiesValuePropsTermsSheetDto strategiesValuePropsTermsSheetDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.layout = null;
            } else {
                this.layout = managementStyleSelectionLayoutDto;
            }
            if ((i & 2) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 4) == 0) {
                this.ctas = CollectionsKt.emptyList();
            } else {
                this.ctas = list;
            }
            if ((i & 8) == 0) {
                this.disclosure = "";
            } else {
                this.disclosure = str2;
            }
            if ((i & 16) == 0) {
                this.terms_sheet = null;
            } else {
                this.terms_sheet = strategiesValuePropsTermsSheetDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            ManagementStyleSelectionLayoutDto managementStyleSelectionLayoutDto = self.layout;
            if (managementStyleSelectionLayoutDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ManagementStyleSelectionLayoutDto.Serializer.INSTANCE, managementStyleSelectionLayoutDto);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 1, self.title);
            }
            if (!Intrinsics.areEqual(self.ctas, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.ctas);
            }
            if (!Intrinsics.areEqual(self.disclosure, "")) {
                output.encodeStringElement(serialDesc, 3, self.disclosure);
            }
            StrategiesValuePropsTermsSheetDto strategiesValuePropsTermsSheetDto = self.terms_sheet;
            if (strategiesValuePropsTermsSheetDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StrategiesValuePropsTermsSheetDto.Serializer.INSTANCE, strategiesValuePropsTermsSheetDto);
            }
        }

        public Surrogate(ManagementStyleSelectionLayoutDto managementStyleSelectionLayoutDto, String title, List<ManagementStyleSelectionCtaDto> ctas, String disclosure, StrategiesValuePropsTermsSheetDto strategiesValuePropsTermsSheetDto) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(ctas, "ctas");
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            this.layout = managementStyleSelectionLayoutDto;
            this.title = title;
            this.ctas = ctas;
            this.disclosure = disclosure;
            this.terms_sheet = strategiesValuePropsTermsSheetDto;
        }

        public /* synthetic */ Surrogate(ManagementStyleSelectionLayoutDto managementStyleSelectionLayoutDto, String str, List list, String str2, StrategiesValuePropsTermsSheetDto strategiesValuePropsTermsSheetDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : managementStyleSelectionLayoutDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : strategiesValuePropsTermsSheetDto);
        }

        public final ManagementStyleSelectionLayoutDto getLayout() {
            return this.layout;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<ManagementStyleSelectionCtaDto> getCtas() {
            return this.ctas;
        }

        public final String getDisclosure() {
            return this.disclosure;
        }

        public final StrategiesValuePropsTermsSheetDto getTerms_sheet() {
            return this.terms_sheet;
        }
    }

    /* compiled from: GetIRAManagementStyleSelectionResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponseDto;", "Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetIRAManagementStyleSelectionResponseDto, GetIRAManagementStyleSelectionResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetIRAManagementStyleSelectionResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetIRAManagementStyleSelectionResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetIRAManagementStyleSelectionResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetIRAManagementStyleSelectionResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetIRAManagementStyleSelectionResponse> getProtoAdapter() {
            return GetIRAManagementStyleSelectionResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetIRAManagementStyleSelectionResponseDto getZeroValue() {
            return GetIRAManagementStyleSelectionResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetIRAManagementStyleSelectionResponseDto fromProto(GetIRAManagementStyleSelectionResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ManagementStyleSelectionLayout layout = proto.getLayout();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ManagementStyleSelectionLayoutDto managementStyleSelectionLayoutDtoFromProto = layout != null ? ManagementStyleSelectionLayoutDto.INSTANCE.fromProto(layout) : null;
            String title = proto.getTitle();
            List<ManagementStyleSelectionCta> ctas = proto.getCtas();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(ctas, 10));
            Iterator<T> it = ctas.iterator();
            while (it.hasNext()) {
                arrayList.add(ManagementStyleSelectionCtaDto.INSTANCE.fromProto((ManagementStyleSelectionCta) it.next()));
            }
            String disclosure = proto.getDisclosure();
            StrategiesValuePropsTermsSheet terms_sheet = proto.getTerms_sheet();
            return new GetIRAManagementStyleSelectionResponseDto(new Surrogate(managementStyleSelectionLayoutDtoFromProto, title, arrayList, disclosure, terms_sheet != null ? StrategiesValuePropsTermsSheetDto.INSTANCE.fromProto(terms_sheet) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.GetIRAManagementStyleSelectionResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetIRAManagementStyleSelectionResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetIRAManagementStyleSelectionResponseDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetIRAManagementStyleSelectionResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponseDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetIRAManagementStyleSelectionResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.GetIRAManagementStyleSelectionResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetIRAManagementStyleSelectionResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetIRAManagementStyleSelectionResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetIRAManagementStyleSelectionResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetIRAManagementStyleSelectionResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/GetIRAManagementStyleSelectionResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "advisory.proto.v1.GetIRAManagementStyleSelectionResponseDto";
        }
    }
}
