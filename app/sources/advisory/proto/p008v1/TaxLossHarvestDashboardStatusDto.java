package advisory.proto.p008v1;

import advisory.proto.p008v1.TaxLossHarvestDashboardStatusButtonDto;
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
import rh_server_driven_ui.p531v1.ThemedColor;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: TaxLossHarvestDashboardStatusDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatus;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto$Surrogate;)V", "", "status", "Lrh_server_driven_ui/v1/ThemedColorDto;", "status_color", "description_markdown", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto;", "cta_button", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/String;Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto;)V", "toProto", "()Ladvisory/proto/v1/TaxLossHarvestDashboardStatus;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto$Surrogate;", "getStatus", "getStatus_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getDescription_markdown", "getCta_button", "()Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class TaxLossHarvestDashboardStatusDto implements Dto3<TaxLossHarvestDashboardStatus>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TaxLossHarvestDashboardStatusDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TaxLossHarvestDashboardStatusDto, TaxLossHarvestDashboardStatus>> binaryBase64Serializer$delegate;
    private static final TaxLossHarvestDashboardStatusDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TaxLossHarvestDashboardStatusDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TaxLossHarvestDashboardStatusDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getStatus() {
        return this.surrogate.getStatus();
    }

    public final ThemedColorDto getStatus_color() {
        return this.surrogate.getStatus_color();
    }

    public final String getDescription_markdown() {
        return this.surrogate.getDescription_markdown();
    }

    public final TaxLossHarvestDashboardStatusButtonDto getCta_button() {
        return this.surrogate.getCta_button();
    }

    public /* synthetic */ TaxLossHarvestDashboardStatusDto(String str, ThemedColorDto themedColorDto, String str2, TaxLossHarvestDashboardStatusButtonDto taxLossHarvestDashboardStatusButtonDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : themedColorDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : taxLossHarvestDashboardStatusButtonDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestDashboardStatusDto(String status, ThemedColorDto themedColorDto, String description_markdown, TaxLossHarvestDashboardStatusButtonDto taxLossHarvestDashboardStatusButtonDto) {
        this(new Surrogate(status, themedColorDto, description_markdown, taxLossHarvestDashboardStatusButtonDto));
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(description_markdown, "description_markdown");
    }

    @Override // com.robinhood.idl.Dto
    public TaxLossHarvestDashboardStatus toProto() {
        String status = this.surrogate.getStatus();
        ThemedColorDto status_color = this.surrogate.getStatus_color();
        ThemedColor proto = status_color != null ? status_color.toProto() : null;
        String description_markdown = this.surrogate.getDescription_markdown();
        TaxLossHarvestDashboardStatusButtonDto cta_button = this.surrogate.getCta_button();
        return new TaxLossHarvestDashboardStatus(status, proto, description_markdown, cta_button != null ? cta_button.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[TaxLossHarvestDashboardStatusDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TaxLossHarvestDashboardStatusDto) && Intrinsics.areEqual(((TaxLossHarvestDashboardStatusDto) other).surrogate, this.surrogate);
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
    /* compiled from: TaxLossHarvestDashboardStatusDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b.\u0010$\u001a\u0004\b,\u0010-¨\u00061"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto$Surrogate;", "", "", "status", "Lrh_server_driven_ui/v1/ThemedColorDto;", "status_color", "description_markdown", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto;", "cta_button", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/String;Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Ljava/lang/String;Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatus", "getStatus$annotations", "()V", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getStatus_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getStatus_color$annotations", "getDescription_markdown", "getDescription_markdown$annotations", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto;", "getCta_button", "()Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto;", "getCta_button$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TaxLossHarvestDashboardStatusButtonDto cta_button;
        private final String description_markdown;
        private final String status;
        private final ThemedColorDto status_color;

        public Surrogate() {
            this((String) null, (ThemedColorDto) null, (String) null, (TaxLossHarvestDashboardStatusButtonDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.status, surrogate.status) && Intrinsics.areEqual(this.status_color, surrogate.status_color) && Intrinsics.areEqual(this.description_markdown, surrogate.description_markdown) && Intrinsics.areEqual(this.cta_button, surrogate.cta_button);
        }

        public int hashCode() {
            int iHashCode = this.status.hashCode() * 31;
            ThemedColorDto themedColorDto = this.status_color;
            int iHashCode2 = (((iHashCode + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31) + this.description_markdown.hashCode()) * 31;
            TaxLossHarvestDashboardStatusButtonDto taxLossHarvestDashboardStatusButtonDto = this.cta_button;
            return iHashCode2 + (taxLossHarvestDashboardStatusButtonDto != null ? taxLossHarvestDashboardStatusButtonDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(status=" + this.status + ", status_color=" + this.status_color + ", description_markdown=" + this.description_markdown + ", cta_button=" + this.cta_button + ")";
        }

        /* compiled from: TaxLossHarvestDashboardStatusDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TaxLossHarvestDashboardStatusDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, ThemedColorDto themedColorDto, String str2, TaxLossHarvestDashboardStatusButtonDto taxLossHarvestDashboardStatusButtonDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.status = "";
            } else {
                this.status = str;
            }
            if ((i & 2) == 0) {
                this.status_color = null;
            } else {
                this.status_color = themedColorDto;
            }
            if ((i & 4) == 0) {
                this.description_markdown = "";
            } else {
                this.description_markdown = str2;
            }
            if ((i & 8) == 0) {
                this.cta_button = null;
            } else {
                this.cta_button = taxLossHarvestDashboardStatusButtonDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.status, "")) {
                output.encodeStringElement(serialDesc, 0, self.status);
            }
            ThemedColorDto themedColorDto = self.status_color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            if (!Intrinsics.areEqual(self.description_markdown, "")) {
                output.encodeStringElement(serialDesc, 2, self.description_markdown);
            }
            TaxLossHarvestDashboardStatusButtonDto taxLossHarvestDashboardStatusButtonDto = self.cta_button;
            if (taxLossHarvestDashboardStatusButtonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TaxLossHarvestDashboardStatusButtonDto.Serializer.INSTANCE, taxLossHarvestDashboardStatusButtonDto);
            }
        }

        public Surrogate(String status, ThemedColorDto themedColorDto, String description_markdown, TaxLossHarvestDashboardStatusButtonDto taxLossHarvestDashboardStatusButtonDto) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(description_markdown, "description_markdown");
            this.status = status;
            this.status_color = themedColorDto;
            this.description_markdown = description_markdown;
            this.cta_button = taxLossHarvestDashboardStatusButtonDto;
        }

        public /* synthetic */ Surrogate(String str, ThemedColorDto themedColorDto, String str2, TaxLossHarvestDashboardStatusButtonDto taxLossHarvestDashboardStatusButtonDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : themedColorDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : taxLossHarvestDashboardStatusButtonDto);
        }

        public final String getStatus() {
            return this.status;
        }

        public final ThemedColorDto getStatus_color() {
            return this.status_color;
        }

        public final String getDescription_markdown() {
            return this.description_markdown;
        }

        public final TaxLossHarvestDashboardStatusButtonDto getCta_button() {
            return this.cta_button;
        }
    }

    /* compiled from: TaxLossHarvestDashboardStatusDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto;", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TaxLossHarvestDashboardStatusDto, TaxLossHarvestDashboardStatus> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TaxLossHarvestDashboardStatusDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLossHarvestDashboardStatusDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLossHarvestDashboardStatusDto> getBinaryBase64Serializer() {
            return (KSerializer) TaxLossHarvestDashboardStatusDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TaxLossHarvestDashboardStatus> getProtoAdapter() {
            return TaxLossHarvestDashboardStatus.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLossHarvestDashboardStatusDto getZeroValue() {
            return TaxLossHarvestDashboardStatusDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLossHarvestDashboardStatusDto fromProto(TaxLossHarvestDashboardStatus proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String status = proto.getStatus();
            ThemedColor status_color = proto.getStatus_color();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ThemedColorDto themedColorDtoFromProto = status_color != null ? ThemedColorDto.INSTANCE.fromProto(status_color) : null;
            String description_markdown = proto.getDescription_markdown();
            TaxLossHarvestDashboardStatusButton cta_button = proto.getCta_button();
            return new TaxLossHarvestDashboardStatusDto(new Surrogate(status, themedColorDtoFromProto, description_markdown, cta_button != null ? TaxLossHarvestDashboardStatusButtonDto.INSTANCE.fromProto(cta_button) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.TaxLossHarvestDashboardStatusDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLossHarvestDashboardStatusDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TaxLossHarvestDashboardStatusDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TaxLossHarvestDashboardStatusDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TaxLossHarvestDashboardStatusDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.TaxLossHarvestDashboardStatus", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TaxLossHarvestDashboardStatusDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TaxLossHarvestDashboardStatusDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TaxLossHarvestDashboardStatusDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TaxLossHarvestDashboardStatusDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardStatusDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "advisory.proto.v1.TaxLossHarvestDashboardStatusDto";
        }
    }
}
