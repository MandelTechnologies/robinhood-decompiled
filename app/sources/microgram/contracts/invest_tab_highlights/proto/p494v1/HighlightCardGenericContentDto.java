package microgram.contracts.invest_tab_highlights.proto.p494v1;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import rh_server_driven_ui.p531v1.Color;
import rh_server_driven_ui.p531v1.ColorDto;
import rh_server_driven_ui.p531v1.Icon;
import rh_server_driven_ui.p531v1.IconDto;

/* compiled from: HighlightCardGenericContentDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BM\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0016R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010-¨\u00062"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContent;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto$Surrogate;)V", "", "secondary_text", "primary_text", "Lrh_server_driven_ui/v1/IconDto;", "icon", "metadata_text", "Lrh_server_driven_ui/v1/ColorDto;", "metadata_text_color", "", "is_live_earnings", "(Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ColorDto;Ljava/lang/Boolean;)V", "toProto", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContent;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto$Surrogate;", "getSecondary_text", "getPrimary_text", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getMetadata_text", "getMetadata_text_color", "()Lrh_server_driven_ui/v1/ColorDto;", "()Ljava/lang/Boolean;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class HighlightCardGenericContentDto implements Dto3<HighlightCardGenericContent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<HighlightCardGenericContentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<HighlightCardGenericContentDto, HighlightCardGenericContent>> binaryBase64Serializer$delegate;
    private static final HighlightCardGenericContentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ HighlightCardGenericContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private HighlightCardGenericContentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getSecondary_text() {
        return this.surrogate.getSecondary_text();
    }

    public final String getPrimary_text() {
        return this.surrogate.getPrimary_text();
    }

    public final IconDto getIcon() {
        return this.surrogate.getIcon();
    }

    public final String getMetadata_text() {
        return this.surrogate.getMetadata_text();
    }

    public final ColorDto getMetadata_text_color() {
        return this.surrogate.getMetadata_text_color();
    }

    public final Boolean is_live_earnings() {
        return this.surrogate.getIs_live_earnings();
    }

    public /* synthetic */ HighlightCardGenericContentDto(String str, String str2, IconDto iconDto, String str3, ColorDto colorDto, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : iconDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : colorDto, (i & 32) != 0 ? null : bool);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HighlightCardGenericContentDto(String secondary_text, String primary_text, IconDto iconDto, String str, ColorDto colorDto, Boolean bool) {
        this(new Surrogate(secondary_text, primary_text, iconDto, str, colorDto, bool));
        Intrinsics.checkNotNullParameter(secondary_text, "secondary_text");
        Intrinsics.checkNotNullParameter(primary_text, "primary_text");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public HighlightCardGenericContent toProto() {
        String secondary_text = this.surrogate.getSecondary_text();
        String primary_text = this.surrogate.getPrimary_text();
        IconDto icon = this.surrogate.getIcon();
        Icon icon2 = icon != null ? (Icon) icon.toProto() : null;
        String metadata_text = this.surrogate.getMetadata_text();
        ColorDto metadata_text_color = this.surrogate.getMetadata_text_color();
        return new HighlightCardGenericContent(secondary_text, primary_text, icon2, metadata_text, metadata_text_color != null ? (Color) metadata_text_color.toProto() : null, this.surrogate.getIs_live_earnings(), null, 64, null);
    }

    public String toString() {
        return "[HighlightCardGenericContentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof HighlightCardGenericContentDto) && Intrinsics.areEqual(((HighlightCardGenericContentDto) other).surrogate, this.surrogate);
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
    /* compiled from: HighlightCardGenericContentDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \b\u0083\b\u0018\u0000 62\u00020\u0001:\u000276BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b,\u0010&\u001a\u0004\b*\u0010+R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010#\u0012\u0004\b.\u0010&\u001a\u0004\b-\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b2\u0010&\u001a\u0004\b0\u00101R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00103\u0012\u0004\b5\u0010&\u001a\u0004\b\u000b\u00104¨\u00068"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto$Surrogate;", "", "", "secondary_text", "primary_text", "Lrh_server_driven_ui/v1/IconDto;", "icon", "metadata_text", "Lrh_server_driven_ui/v1/ColorDto;", "metadata_text_color", "", "is_live_earnings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ColorDto;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;Ljava/lang/String;Lrh_server_driven_ui/v1/ColorDto;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_invest_tab_highlights_proto_v1_externalRelease", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSecondary_text", "getSecondary_text$annotations", "()V", "getPrimary_text", "getPrimary_text$annotations", "Lrh_server_driven_ui/v1/IconDto;", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getIcon$annotations", "getMetadata_text", "getMetadata_text$annotations", "Lrh_server_driven_ui/v1/ColorDto;", "getMetadata_text_color", "()Lrh_server_driven_ui/v1/ColorDto;", "getMetadata_text_color$annotations", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "is_live_earnings$annotations", "Companion", "$serializer", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IconDto icon;
        private final Boolean is_live_earnings;
        private final String metadata_text;
        private final ColorDto metadata_text_color;
        private final String primary_text;
        private final String secondary_text;

        public Surrogate() {
            this((String) null, (String) null, (IconDto) null, (String) null, (ColorDto) null, (Boolean) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.secondary_text, surrogate.secondary_text) && Intrinsics.areEqual(this.primary_text, surrogate.primary_text) && this.icon == surrogate.icon && Intrinsics.areEqual(this.metadata_text, surrogate.metadata_text) && this.metadata_text_color == surrogate.metadata_text_color && Intrinsics.areEqual(this.is_live_earnings, surrogate.is_live_earnings);
        }

        public int hashCode() {
            int iHashCode = ((this.secondary_text.hashCode() * 31) + this.primary_text.hashCode()) * 31;
            IconDto iconDto = this.icon;
            int iHashCode2 = (iHashCode + (iconDto == null ? 0 : iconDto.hashCode())) * 31;
            String str = this.metadata_text;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            ColorDto colorDto = this.metadata_text_color;
            int iHashCode4 = (iHashCode3 + (colorDto == null ? 0 : colorDto.hashCode())) * 31;
            Boolean bool = this.is_live_earnings;
            return iHashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(secondary_text=" + this.secondary_text + ", primary_text=" + this.primary_text + ", icon=" + this.icon + ", metadata_text=" + this.metadata_text + ", metadata_text_color=" + this.metadata_text_color + ", is_live_earnings=" + this.is_live_earnings + ")";
        }

        /* compiled from: HighlightCardGenericContentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto$Surrogate;", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return HighlightCardGenericContentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, IconDto iconDto, String str3, ColorDto colorDto, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.secondary_text = "";
            } else {
                this.secondary_text = str;
            }
            if ((i & 2) == 0) {
                this.primary_text = "";
            } else {
                this.primary_text = str2;
            }
            if ((i & 4) == 0) {
                this.icon = null;
            } else {
                this.icon = iconDto;
            }
            if ((i & 8) == 0) {
                this.metadata_text = null;
            } else {
                this.metadata_text = str3;
            }
            if ((i & 16) == 0) {
                this.metadata_text_color = null;
            } else {
                this.metadata_text_color = colorDto;
            }
            if ((i & 32) == 0) {
                this.is_live_earnings = null;
            } else {
                this.is_live_earnings = bool;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$microgram_contracts_invest_tab_highlights_proto_v1_externalRelease */
        public static final /* synthetic */ void m3755x47065b30(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.secondary_text, "")) {
                output.encodeStringElement(serialDesc, 0, self.secondary_text);
            }
            if (!Intrinsics.areEqual(self.primary_text, "")) {
                output.encodeStringElement(serialDesc, 1, self.primary_text);
            }
            IconDto iconDto = self.icon;
            if (iconDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, IconDto.Serializer.INSTANCE, iconDto);
            }
            String str = self.metadata_text;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
            ColorDto colorDto = self.metadata_text_color;
            if (colorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ColorDto.Serializer.INSTANCE, colorDto);
            }
            Boolean bool = self.is_live_earnings;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, bool);
            }
        }

        public Surrogate(String secondary_text, String primary_text, IconDto iconDto, String str, ColorDto colorDto, Boolean bool) {
            Intrinsics.checkNotNullParameter(secondary_text, "secondary_text");
            Intrinsics.checkNotNullParameter(primary_text, "primary_text");
            this.secondary_text = secondary_text;
            this.primary_text = primary_text;
            this.icon = iconDto;
            this.metadata_text = str;
            this.metadata_text_color = colorDto;
            this.is_live_earnings = bool;
        }

        public /* synthetic */ Surrogate(String str, String str2, IconDto iconDto, String str3, ColorDto colorDto, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : iconDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : colorDto, (i & 32) != 0 ? null : bool);
        }

        public final String getSecondary_text() {
            return this.secondary_text;
        }

        public final String getPrimary_text() {
            return this.primary_text;
        }

        public final IconDto getIcon() {
            return this.icon;
        }

        public final String getMetadata_text() {
            return this.metadata_text;
        }

        public final ColorDto getMetadata_text_color() {
            return this.metadata_text_color;
        }

        /* renamed from: is_live_earnings, reason: from getter */
        public final Boolean getIs_live_earnings() {
            return this.is_live_earnings;
        }
    }

    /* compiled from: HighlightCardGenericContentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<HighlightCardGenericContentDto, HighlightCardGenericContent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<HighlightCardGenericContentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HighlightCardGenericContentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HighlightCardGenericContentDto> getBinaryBase64Serializer() {
            return (KSerializer) HighlightCardGenericContentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<HighlightCardGenericContent> getProtoAdapter() {
            return HighlightCardGenericContent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HighlightCardGenericContentDto getZeroValue() {
            return HighlightCardGenericContentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HighlightCardGenericContentDto fromProto(HighlightCardGenericContent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String secondary_text = proto.getSecondary_text();
            String primary_text = proto.getPrimary_text();
            Icon icon = proto.getIcon();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IconDto iconDtoFromProto = icon != null ? IconDto.INSTANCE.fromProto(icon) : null;
            String metadata_text = proto.getMetadata_text();
            Color metadata_text_color = proto.getMetadata_text_color();
            return new HighlightCardGenericContentDto(new Surrogate(secondary_text, primary_text, iconDtoFromProto, metadata_text, metadata_text_color != null ? ColorDto.INSTANCE.fromProto(metadata_text_color) : null, proto.getIs_live_earnings()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.invest_tab_highlights.proto.v1.HighlightCardGenericContentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HighlightCardGenericContentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new HighlightCardGenericContentDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: HighlightCardGenericContentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<HighlightCardGenericContentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.invest_tab_highlights.proto.v1.HighlightCardGenericContent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, HighlightCardGenericContentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public HighlightCardGenericContentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new HighlightCardGenericContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: HighlightCardGenericContentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/HighlightCardGenericContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "microgram.contracts.invest_tab_highlights.proto.v1.HighlightCardGenericContentDto";
        }
    }
}
