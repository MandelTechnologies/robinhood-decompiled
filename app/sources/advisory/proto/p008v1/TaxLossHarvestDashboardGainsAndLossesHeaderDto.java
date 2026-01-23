package advisory.proto.p008v1;

import advisory.proto.p008v1.BottomSheetDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TaxLossHarvestDashboardGainsAndLossesHeaderDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006*"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeader;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto$Surrogate;)V", "", "title", "info_icon", "Ladvisory/proto/v1/BottomSheetDto;", "info_bottom_sheet", "(Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/BottomSheetDto;)V", "toProto", "()Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeader;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto$Surrogate;", "getTitle", "getInfo_icon", "getInfo_bottom_sheet", "()Ladvisory/proto/v1/BottomSheetDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class TaxLossHarvestDashboardGainsAndLossesHeaderDto implements Dto3<TaxLossHarvestDashboardGainsAndLossesHeader>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TaxLossHarvestDashboardGainsAndLossesHeaderDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TaxLossHarvestDashboardGainsAndLossesHeaderDto, TaxLossHarvestDashboardGainsAndLossesHeader>> binaryBase64Serializer$delegate;
    private static final TaxLossHarvestDashboardGainsAndLossesHeaderDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TaxLossHarvestDashboardGainsAndLossesHeaderDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TaxLossHarvestDashboardGainsAndLossesHeaderDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getInfo_icon() {
        return this.surrogate.getInfo_icon();
    }

    public final BottomSheetDto getInfo_bottom_sheet() {
        return this.surrogate.getInfo_bottom_sheet();
    }

    public /* synthetic */ TaxLossHarvestDashboardGainsAndLossesHeaderDto(String str, String str2, BottomSheetDto bottomSheetDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bottomSheetDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestDashboardGainsAndLossesHeaderDto(String title, String str, BottomSheetDto bottomSheetDto) {
        this(new Surrogate(title, str, bottomSheetDto));
        Intrinsics.checkNotNullParameter(title, "title");
    }

    @Override // com.robinhood.idl.Dto
    public TaxLossHarvestDashboardGainsAndLossesHeader toProto() {
        String title = this.surrogate.getTitle();
        String info_icon = this.surrogate.getInfo_icon();
        BottomSheetDto info_bottom_sheet = this.surrogate.getInfo_bottom_sheet();
        return new TaxLossHarvestDashboardGainsAndLossesHeader(title, info_icon, info_bottom_sheet != null ? info_bottom_sheet.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[TaxLossHarvestDashboardGainsAndLossesHeaderDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TaxLossHarvestDashboardGainsAndLossesHeaderDto) && Intrinsics.areEqual(((TaxLossHarvestDashboardGainsAndLossesHeaderDto) other).surrogate, this.surrogate);
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
    /* compiled from: TaxLossHarvestDashboardGainsAndLossesHeaderDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002*)B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b(\u0010\"\u001a\u0004\b&\u0010'¨\u0006+"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto$Surrogate;", "", "", "title", "info_icon", "Ladvisory/proto/v1/BottomSheetDto;", "info_bottom_sheet", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/BottomSheetDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ladvisory/proto/v1/BottomSheetDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getInfo_icon", "getInfo_icon$annotations", "Ladvisory/proto/v1/BottomSheetDto;", "getInfo_bottom_sheet", "()Ladvisory/proto/v1/BottomSheetDto;", "getInfo_bottom_sheet$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BottomSheetDto info_bottom_sheet;
        private final String info_icon;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, (BottomSheetDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.info_icon, surrogate.info_icon) && Intrinsics.areEqual(this.info_bottom_sheet, surrogate.info_bottom_sheet);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.info_icon;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            BottomSheetDto bottomSheetDto = this.info_bottom_sheet;
            return iHashCode2 + (bottomSheetDto != null ? bottomSheetDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", info_icon=" + this.info_icon + ", info_bottom_sheet=" + this.info_bottom_sheet + ")";
        }

        /* compiled from: TaxLossHarvestDashboardGainsAndLossesHeaderDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TaxLossHarvestDashboardGainsAndLossesHeaderDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, BottomSheetDto bottomSheetDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.title = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.info_icon = null;
            } else {
                this.info_icon = str2;
            }
            if ((i & 4) == 0) {
                this.info_bottom_sheet = null;
            } else {
                this.info_bottom_sheet = bottomSheetDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            String str = self.info_icon;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str);
            }
            BottomSheetDto bottomSheetDto = self.info_bottom_sheet;
            if (bottomSheetDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, BottomSheetDto.Serializer.INSTANCE, bottomSheetDto);
            }
        }

        public Surrogate(String title, String str, BottomSheetDto bottomSheetDto) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.info_icon = str;
            this.info_bottom_sheet = bottomSheetDto;
        }

        public final String getTitle() {
            return this.title;
        }

        public /* synthetic */ Surrogate(String str, String str2, BottomSheetDto bottomSheetDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bottomSheetDto);
        }

        public final String getInfo_icon() {
            return this.info_icon;
        }

        public final BottomSheetDto getInfo_bottom_sheet() {
            return this.info_bottom_sheet;
        }
    }

    /* compiled from: TaxLossHarvestDashboardGainsAndLossesHeaderDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto;", "Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeader;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TaxLossHarvestDashboardGainsAndLossesHeaderDto, TaxLossHarvestDashboardGainsAndLossesHeader> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TaxLossHarvestDashboardGainsAndLossesHeaderDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLossHarvestDashboardGainsAndLossesHeaderDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLossHarvestDashboardGainsAndLossesHeaderDto> getBinaryBase64Serializer() {
            return (KSerializer) TaxLossHarvestDashboardGainsAndLossesHeaderDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TaxLossHarvestDashboardGainsAndLossesHeader> getProtoAdapter() {
            return TaxLossHarvestDashboardGainsAndLossesHeader.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLossHarvestDashboardGainsAndLossesHeaderDto getZeroValue() {
            return TaxLossHarvestDashboardGainsAndLossesHeaderDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLossHarvestDashboardGainsAndLossesHeaderDto fromProto(TaxLossHarvestDashboardGainsAndLossesHeader proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String info_icon = proto.getInfo_icon();
            BottomSheet info_bottom_sheet = proto.getInfo_bottom_sheet();
            return new TaxLossHarvestDashboardGainsAndLossesHeaderDto(new Surrogate(title, info_icon, info_bottom_sheet != null ? BottomSheetDto.INSTANCE.fromProto(info_bottom_sheet) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.TaxLossHarvestDashboardGainsAndLossesHeaderDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLossHarvestDashboardGainsAndLossesHeaderDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TaxLossHarvestDashboardGainsAndLossesHeaderDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TaxLossHarvestDashboardGainsAndLossesHeaderDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TaxLossHarvestDashboardGainsAndLossesHeaderDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.TaxLossHarvestDashboardGainsAndLossesHeader", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TaxLossHarvestDashboardGainsAndLossesHeaderDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TaxLossHarvestDashboardGainsAndLossesHeaderDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TaxLossHarvestDashboardGainsAndLossesHeaderDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TaxLossHarvestDashboardGainsAndLossesHeaderDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardGainsAndLossesHeaderDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "advisory.proto.v1.TaxLossHarvestDashboardGainsAndLossesHeaderDto";
        }
    }
}
