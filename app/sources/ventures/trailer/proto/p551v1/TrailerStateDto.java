package ventures.trailer.proto.p551v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.car.result.CarResultComposable2;
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
import rh_server_driven_ui.p531v1.Icon;
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.UIComponent;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: TrailerStateDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0013¨\u0006."}, m3636d2 = {"Lventures/trailer/proto/v1/TrailerStateDto;", "Lcom/robinhood/idl/MessageDto;", "Lventures/trailer/proto/v1/TrailerState;", "Landroid/os/Parcelable;", "Lventures/trailer/proto/v1/TrailerStateDto$Surrogate;", "surrogate", "<init>", "(Lventures/trailer/proto/v1/TrailerStateDto$Surrogate;)V", "Lrh_server_driven_ui/v1/UIComponentDto;", CarResultComposable2.BODY, "", "primary_cta_text", "Lrh_server_driven_ui/v1/IconDto;", "primary_cta_icon", "secondary_cta_text", "(Lrh_server_driven_ui/v1/UIComponentDto;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;Ljava/lang/String;)V", "toProto", "()Lventures/trailer/proto/v1/TrailerState;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lventures/trailer/proto/v1/TrailerStateDto$Surrogate;", "getBody", "()Lrh_server_driven_ui/v1/UIComponentDto;", "getPrimary_cta_text", "getPrimary_cta_icon", "()Lrh_server_driven_ui/v1/IconDto;", "getSecondary_cta_text", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes28.dex */
public final class TrailerStateDto implements Dto3<TrailerState>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TrailerStateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TrailerStateDto, TrailerState>> binaryBase64Serializer$delegate;
    private static final TrailerStateDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TrailerStateDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TrailerStateDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UIComponentDto getBody() {
        return this.surrogate.getBody();
    }

    public final String getPrimary_cta_text() {
        return this.surrogate.getPrimary_cta_text();
    }

    public final IconDto getPrimary_cta_icon() {
        return this.surrogate.getPrimary_cta_icon();
    }

    public final String getSecondary_cta_text() {
        return this.surrogate.getSecondary_cta_text();
    }

    public /* synthetic */ TrailerStateDto(UIComponentDto uIComponentDto, String str, IconDto iconDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uIComponentDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : iconDto, (i & 8) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrailerStateDto(UIComponentDto uIComponentDto, String primary_cta_text, IconDto iconDto, String str) {
        this(new Surrogate(uIComponentDto, primary_cta_text, iconDto, str));
        Intrinsics.checkNotNullParameter(primary_cta_text, "primary_cta_text");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TrailerState toProto() {
        UIComponentDto body = this.surrogate.getBody();
        UIComponent proto = body != null ? body.toProto() : null;
        String primary_cta_text = this.surrogate.getPrimary_cta_text();
        IconDto primary_cta_icon = this.surrogate.getPrimary_cta_icon();
        return new TrailerState(proto, primary_cta_text, primary_cta_icon != null ? (Icon) primary_cta_icon.toProto() : null, this.surrogate.getSecondary_cta_text(), null, 16, null);
    }

    public String toString() {
        return "[TrailerStateDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TrailerStateDto) && Intrinsics.areEqual(((TrailerStateDto) other).surrogate, this.surrogate);
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
    /* compiled from: TrailerStateDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b,\u0010%\u001a\u0004\b*\u0010+R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b.\u0010%\u001a\u0004\b-\u0010\u001a¨\u00061"}, m3636d2 = {"Lventures/trailer/proto/v1/TrailerStateDto$Surrogate;", "", "Lrh_server_driven_ui/v1/UIComponentDto;", CarResultComposable2.BODY, "", "primary_cta_text", "Lrh_server_driven_ui/v1/IconDto;", "primary_cta_icon", "secondary_cta_text", "<init>", "(Lrh_server_driven_ui/v1/UIComponentDto;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/UIComponentDto;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_ventures_proto_v1_externalRelease", "(Lventures/trailer/proto/v1/TrailerStateDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/UIComponentDto;", "getBody", "()Lrh_server_driven_ui/v1/UIComponentDto;", "getBody$annotations", "()V", "Ljava/lang/String;", "getPrimary_cta_text", "getPrimary_cta_text$annotations", "Lrh_server_driven_ui/v1/IconDto;", "getPrimary_cta_icon", "()Lrh_server_driven_ui/v1/IconDto;", "getPrimary_cta_icon$annotations", "getSecondary_cta_text", "getSecondary_cta_text$annotations", "Companion", "$serializer", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final UIComponentDto body;
        private final IconDto primary_cta_icon;
        private final String primary_cta_text;
        private final String secondary_cta_text;

        public Surrogate() {
            this((UIComponentDto) null, (String) null, (IconDto) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.body, surrogate.body) && Intrinsics.areEqual(this.primary_cta_text, surrogate.primary_cta_text) && this.primary_cta_icon == surrogate.primary_cta_icon && Intrinsics.areEqual(this.secondary_cta_text, surrogate.secondary_cta_text);
        }

        public int hashCode() {
            UIComponentDto uIComponentDto = this.body;
            int iHashCode = (((uIComponentDto == null ? 0 : uIComponentDto.hashCode()) * 31) + this.primary_cta_text.hashCode()) * 31;
            IconDto iconDto = this.primary_cta_icon;
            int iHashCode2 = (iHashCode + (iconDto == null ? 0 : iconDto.hashCode())) * 31;
            String str = this.secondary_cta_text;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(body=" + this.body + ", primary_cta_text=" + this.primary_cta_text + ", primary_cta_icon=" + this.primary_cta_icon + ", secondary_cta_text=" + this.secondary_cta_text + ")";
        }

        /* compiled from: TrailerStateDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lventures/trailer/proto/v1/TrailerStateDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lventures/trailer/proto/v1/TrailerStateDto$Surrogate;", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TrailerStateDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UIComponentDto uIComponentDto, String str, IconDto iconDto, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.body = null;
            } else {
                this.body = uIComponentDto;
            }
            if ((i & 2) == 0) {
                this.primary_cta_text = "";
            } else {
                this.primary_cta_text = str;
            }
            if ((i & 4) == 0) {
                this.primary_cta_icon = null;
            } else {
                this.primary_cta_icon = iconDto;
            }
            if ((i & 8) == 0) {
                this.secondary_cta_text = null;
            } else {
                this.secondary_cta_text = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_contracts_ventures_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UIComponentDto uIComponentDto = self.body;
            if (uIComponentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UIComponentDto.Serializer.INSTANCE, uIComponentDto);
            }
            if (!Intrinsics.areEqual(self.primary_cta_text, "")) {
                output.encodeStringElement(serialDesc, 1, self.primary_cta_text);
            }
            IconDto iconDto = self.primary_cta_icon;
            if (iconDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, IconDto.Serializer.INSTANCE, iconDto);
            }
            String str = self.secondary_cta_text;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(UIComponentDto uIComponentDto, String primary_cta_text, IconDto iconDto, String str) {
            Intrinsics.checkNotNullParameter(primary_cta_text, "primary_cta_text");
            this.body = uIComponentDto;
            this.primary_cta_text = primary_cta_text;
            this.primary_cta_icon = iconDto;
            this.secondary_cta_text = str;
        }

        public final UIComponentDto getBody() {
            return this.body;
        }

        public final String getPrimary_cta_text() {
            return this.primary_cta_text;
        }

        public /* synthetic */ Surrogate(UIComponentDto uIComponentDto, String str, IconDto iconDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uIComponentDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : iconDto, (i & 8) != 0 ? null : str2);
        }

        public final IconDto getPrimary_cta_icon() {
            return this.primary_cta_icon;
        }

        public final String getSecondary_cta_text() {
            return this.secondary_cta_text;
        }
    }

    /* compiled from: TrailerStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lventures/trailer/proto/v1/TrailerStateDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lventures/trailer/proto/v1/TrailerStateDto;", "Lventures/trailer/proto/v1/TrailerState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lventures/trailer/proto/v1/TrailerStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TrailerStateDto, TrailerState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TrailerStateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TrailerStateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TrailerStateDto> getBinaryBase64Serializer() {
            return (KSerializer) TrailerStateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TrailerState> getProtoAdapter() {
            return TrailerState.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TrailerStateDto getZeroValue() {
            return TrailerStateDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TrailerStateDto fromProto(TrailerState proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UIComponent body = proto.getBody();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UIComponentDto uIComponentDtoFromProto = body != null ? UIComponentDto.INSTANCE.fromProto(body) : null;
            String primary_cta_text = proto.getPrimary_cta_text();
            Icon primary_cta_icon = proto.getPrimary_cta_icon();
            return new TrailerStateDto(new Surrogate(uIComponentDtoFromProto, primary_cta_text, primary_cta_icon != null ? IconDto.INSTANCE.fromProto(primary_cta_icon) : null, proto.getSecondary_cta_text()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: ventures.trailer.proto.v1.TrailerStateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrailerStateDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TrailerStateDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TrailerStateDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lventures/trailer/proto/v1/TrailerStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lventures/trailer/proto/v1/TrailerStateDto;", "<init>", "()V", "surrogateSerializer", "Lventures/trailer/proto/v1/TrailerStateDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TrailerStateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ventures.trailer.proto.v1.TrailerState", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TrailerStateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TrailerStateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TrailerStateDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TrailerStateDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lventures/trailer/proto/v1/TrailerStateDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "ventures.trailer.proto.v1.TrailerStateDto";
        }
    }
}
