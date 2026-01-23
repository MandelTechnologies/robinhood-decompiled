package advisory.proto.p008v1;

import advisory.proto.p008v1.AdvisoryDepositGoldValuePropDynamicContentDto;
import advisory.proto.p008v1.AdvisoryDepositGoldValuePropModalDto;
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

/* compiled from: AdvisoryDepositGoldValuePropContentDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006*"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContentDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContent;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContentDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContentDto$Surrogate;)V", "", "pill_title", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropModalDto;", "value_prop_modal", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropDynamicContentDto;", "dynamic_content", "(Ljava/lang/String;Ladvisory/proto/v1/AdvisoryDepositGoldValuePropModalDto;Ladvisory/proto/v1/AdvisoryDepositGoldValuePropDynamicContentDto;)V", "toProto", "()Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContentDto$Surrogate;", "getPill_title", "getDynamic_content", "()Ladvisory/proto/v1/AdvisoryDepositGoldValuePropDynamicContentDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class AdvisoryDepositGoldValuePropContentDto implements Dto3<AdvisoryDepositGoldValuePropContent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdvisoryDepositGoldValuePropContentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdvisoryDepositGoldValuePropContentDto, AdvisoryDepositGoldValuePropContent>> binaryBase64Serializer$delegate;
    private static final AdvisoryDepositGoldValuePropContentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdvisoryDepositGoldValuePropContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdvisoryDepositGoldValuePropContentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getPill_title() {
        return this.surrogate.getPill_title();
    }

    public final AdvisoryDepositGoldValuePropDynamicContentDto getDynamic_content() {
        return this.surrogate.getDynamic_content();
    }

    public /* synthetic */ AdvisoryDepositGoldValuePropContentDto(String str, AdvisoryDepositGoldValuePropModalDto advisoryDepositGoldValuePropModalDto, AdvisoryDepositGoldValuePropDynamicContentDto advisoryDepositGoldValuePropDynamicContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : advisoryDepositGoldValuePropModalDto, (i & 4) != 0 ? null : advisoryDepositGoldValuePropDynamicContentDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvisoryDepositGoldValuePropContentDto(String pill_title, AdvisoryDepositGoldValuePropModalDto advisoryDepositGoldValuePropModalDto, AdvisoryDepositGoldValuePropDynamicContentDto advisoryDepositGoldValuePropDynamicContentDto) {
        this(new Surrogate(pill_title, advisoryDepositGoldValuePropModalDto, advisoryDepositGoldValuePropDynamicContentDto));
        Intrinsics.checkNotNullParameter(pill_title, "pill_title");
    }

    @Override // com.robinhood.idl.Dto
    public AdvisoryDepositGoldValuePropContent toProto() {
        String pill_title = this.surrogate.getPill_title();
        AdvisoryDepositGoldValuePropModalDto value_prop_modal = this.surrogate.getValue_prop_modal();
        AdvisoryDepositGoldValuePropModal proto = value_prop_modal != null ? value_prop_modal.toProto() : null;
        AdvisoryDepositGoldValuePropDynamicContentDto dynamic_content = this.surrogate.getDynamic_content();
        return new AdvisoryDepositGoldValuePropContent(pill_title, proto, dynamic_content != null ? dynamic_content.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[AdvisoryDepositGoldValuePropContentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdvisoryDepositGoldValuePropContentDto) && Intrinsics.areEqual(((AdvisoryDepositGoldValuePropContentDto) other).surrogate, this.surrogate);
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
    /* compiled from: AdvisoryDepositGoldValuePropContentDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b+\u0010#\u001a\u0004\b)\u0010*¨\u0006."}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContentDto$Surrogate;", "", "", "pill_title", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropModalDto;", "value_prop_modal", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropDynamicContentDto;", "dynamic_content", "<init>", "(Ljava/lang/String;Ladvisory/proto/v1/AdvisoryDepositGoldValuePropModalDto;Ladvisory/proto/v1/AdvisoryDepositGoldValuePropDynamicContentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ladvisory/proto/v1/AdvisoryDepositGoldValuePropModalDto;Ladvisory/proto/v1/AdvisoryDepositGoldValuePropDynamicContentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPill_title", "getPill_title$annotations", "()V", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropModalDto;", "getValue_prop_modal", "()Ladvisory/proto/v1/AdvisoryDepositGoldValuePropModalDto;", "getValue_prop_modal$annotations", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropDynamicContentDto;", "getDynamic_content", "()Ladvisory/proto/v1/AdvisoryDepositGoldValuePropDynamicContentDto;", "getDynamic_content$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AdvisoryDepositGoldValuePropDynamicContentDto dynamic_content;
        private final String pill_title;
        private final AdvisoryDepositGoldValuePropModalDto value_prop_modal;

        public Surrogate() {
            this((String) null, (AdvisoryDepositGoldValuePropModalDto) null, (AdvisoryDepositGoldValuePropDynamicContentDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.pill_title, surrogate.pill_title) && Intrinsics.areEqual(this.value_prop_modal, surrogate.value_prop_modal) && Intrinsics.areEqual(this.dynamic_content, surrogate.dynamic_content);
        }

        public int hashCode() {
            int iHashCode = this.pill_title.hashCode() * 31;
            AdvisoryDepositGoldValuePropModalDto advisoryDepositGoldValuePropModalDto = this.value_prop_modal;
            int iHashCode2 = (iHashCode + (advisoryDepositGoldValuePropModalDto == null ? 0 : advisoryDepositGoldValuePropModalDto.hashCode())) * 31;
            AdvisoryDepositGoldValuePropDynamicContentDto advisoryDepositGoldValuePropDynamicContentDto = this.dynamic_content;
            return iHashCode2 + (advisoryDepositGoldValuePropDynamicContentDto != null ? advisoryDepositGoldValuePropDynamicContentDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(pill_title=" + this.pill_title + ", value_prop_modal=" + this.value_prop_modal + ", dynamic_content=" + this.dynamic_content + ")";
        }

        /* compiled from: AdvisoryDepositGoldValuePropContentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContentDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdvisoryDepositGoldValuePropContentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, AdvisoryDepositGoldValuePropModalDto advisoryDepositGoldValuePropModalDto, AdvisoryDepositGoldValuePropDynamicContentDto advisoryDepositGoldValuePropDynamicContentDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.pill_title = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.value_prop_modal = null;
            } else {
                this.value_prop_modal = advisoryDepositGoldValuePropModalDto;
            }
            if ((i & 4) == 0) {
                this.dynamic_content = null;
            } else {
                this.dynamic_content = advisoryDepositGoldValuePropDynamicContentDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.pill_title, "")) {
                output.encodeStringElement(serialDesc, 0, self.pill_title);
            }
            AdvisoryDepositGoldValuePropModalDto advisoryDepositGoldValuePropModalDto = self.value_prop_modal;
            if (advisoryDepositGoldValuePropModalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, AdvisoryDepositGoldValuePropModalDto.Serializer.INSTANCE, advisoryDepositGoldValuePropModalDto);
            }
            AdvisoryDepositGoldValuePropDynamicContentDto advisoryDepositGoldValuePropDynamicContentDto = self.dynamic_content;
            if (advisoryDepositGoldValuePropDynamicContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, AdvisoryDepositGoldValuePropDynamicContentDto.Serializer.INSTANCE, advisoryDepositGoldValuePropDynamicContentDto);
            }
        }

        public Surrogate(String pill_title, AdvisoryDepositGoldValuePropModalDto advisoryDepositGoldValuePropModalDto, AdvisoryDepositGoldValuePropDynamicContentDto advisoryDepositGoldValuePropDynamicContentDto) {
            Intrinsics.checkNotNullParameter(pill_title, "pill_title");
            this.pill_title = pill_title;
            this.value_prop_modal = advisoryDepositGoldValuePropModalDto;
            this.dynamic_content = advisoryDepositGoldValuePropDynamicContentDto;
        }

        public final String getPill_title() {
            return this.pill_title;
        }

        public /* synthetic */ Surrogate(String str, AdvisoryDepositGoldValuePropModalDto advisoryDepositGoldValuePropModalDto, AdvisoryDepositGoldValuePropDynamicContentDto advisoryDepositGoldValuePropDynamicContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : advisoryDepositGoldValuePropModalDto, (i & 4) != 0 ? null : advisoryDepositGoldValuePropDynamicContentDto);
        }

        public final AdvisoryDepositGoldValuePropModalDto getValue_prop_modal() {
            return this.value_prop_modal;
        }

        public final AdvisoryDepositGoldValuePropDynamicContentDto getDynamic_content() {
            return this.dynamic_content;
        }
    }

    /* compiled from: AdvisoryDepositGoldValuePropContentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContentDto;", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AdvisoryDepositGoldValuePropContentDto, AdvisoryDepositGoldValuePropContent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdvisoryDepositGoldValuePropContentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryDepositGoldValuePropContentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryDepositGoldValuePropContentDto> getBinaryBase64Serializer() {
            return (KSerializer) AdvisoryDepositGoldValuePropContentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdvisoryDepositGoldValuePropContent> getProtoAdapter() {
            return AdvisoryDepositGoldValuePropContent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryDepositGoldValuePropContentDto getZeroValue() {
            return AdvisoryDepositGoldValuePropContentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryDepositGoldValuePropContentDto fromProto(AdvisoryDepositGoldValuePropContent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String pill_title = proto.getPill_title();
            AdvisoryDepositGoldValuePropModal value_prop_modal = proto.getValue_prop_modal();
            DefaultConstructorMarker defaultConstructorMarker = null;
            AdvisoryDepositGoldValuePropModalDto advisoryDepositGoldValuePropModalDtoFromProto = value_prop_modal != null ? AdvisoryDepositGoldValuePropModalDto.INSTANCE.fromProto(value_prop_modal) : null;
            AdvisoryDepositGoldValuePropDynamicContent dynamic_content = proto.getDynamic_content();
            return new AdvisoryDepositGoldValuePropContentDto(new Surrogate(pill_title, advisoryDepositGoldValuePropModalDtoFromProto, dynamic_content != null ? AdvisoryDepositGoldValuePropDynamicContentDto.INSTANCE.fromProto(dynamic_content) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.AdvisoryDepositGoldValuePropContentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisoryDepositGoldValuePropContentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AdvisoryDepositGoldValuePropContentDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AdvisoryDepositGoldValuePropContentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContentDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AdvisoryDepositGoldValuePropContentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.AdvisoryDepositGoldValuePropContent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdvisoryDepositGoldValuePropContentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdvisoryDepositGoldValuePropContentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdvisoryDepositGoldValuePropContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AdvisoryDepositGoldValuePropContentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryDepositGoldValuePropContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "advisory.proto.v1.AdvisoryDepositGoldValuePropContentDto";
        }
    }
}
