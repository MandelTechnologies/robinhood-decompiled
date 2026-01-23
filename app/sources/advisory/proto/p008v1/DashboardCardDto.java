package advisory.proto.p008v1;

import advisory.proto.p008v1.DashboardCardAlignmentDto;
import advisory.proto.p008v1.DashboardCardCtaDto;
import advisory.proto.p008v1.DashboardCardDismissSettingsDto;
import advisory.proto.p008v1.DashboardCardImageDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
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

/* compiled from: DashboardCardDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00041023B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BC\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00064"}, m3636d2 = {"Ladvisory/proto/v1/DashboardCardDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/DashboardCard;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/DashboardCardDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/DashboardCardDto$Surrogate;)V", "Ladvisory/proto/v1/DashboardCardImageDto;", "image", "", "text_markdown", "Ladvisory/proto/v1/DashboardCardCtaDto;", AccountOverviewOptionsSettingCard4.CTA, "Ladvisory/proto/v1/DashboardCardDismissSettingsDto;", "dismiss_settings", "Ladvisory/proto/v1/DashboardCardAlignmentDto;", "alignment", "(Ladvisory/proto/v1/DashboardCardImageDto;Ljava/lang/String;Ladvisory/proto/v1/DashboardCardCtaDto;Ladvisory/proto/v1/DashboardCardDismissSettingsDto;Ladvisory/proto/v1/DashboardCardAlignmentDto;)V", "toProto", "()Ladvisory/proto/v1/DashboardCard;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/DashboardCardDto$Surrogate;", "getImage", "()Ladvisory/proto/v1/DashboardCardImageDto;", "getText_markdown", "getCta", "()Ladvisory/proto/v1/DashboardCardCtaDto;", "getDismiss_settings", "()Ladvisory/proto/v1/DashboardCardDismissSettingsDto;", "getAlignment", "()Ladvisory/proto/v1/DashboardCardAlignmentDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class DashboardCardDto implements Dto3<DashboardCard>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DashboardCardDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DashboardCardDto, DashboardCard>> binaryBase64Serializer$delegate;
    private static final DashboardCardDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DashboardCardDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DashboardCardDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DashboardCardImageDto getImage() {
        return this.surrogate.getImage();
    }

    public final String getText_markdown() {
        return this.surrogate.getText_markdown();
    }

    public final DashboardCardCtaDto getCta() {
        return this.surrogate.getCta();
    }

    public final DashboardCardDismissSettingsDto getDismiss_settings() {
        return this.surrogate.getDismiss_settings();
    }

    public final DashboardCardAlignmentDto getAlignment() {
        return this.surrogate.getAlignment();
    }

    public /* synthetic */ DashboardCardDto(DashboardCardImageDto dashboardCardImageDto, String str, DashboardCardCtaDto dashboardCardCtaDto, DashboardCardDismissSettingsDto dashboardCardDismissSettingsDto, DashboardCardAlignmentDto dashboardCardAlignmentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dashboardCardImageDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : dashboardCardCtaDto, (i & 8) != 0 ? null : dashboardCardDismissSettingsDto, (i & 16) != 0 ? null : dashboardCardAlignmentDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DashboardCardDto(DashboardCardImageDto dashboardCardImageDto, String text_markdown, DashboardCardCtaDto dashboardCardCtaDto, DashboardCardDismissSettingsDto dashboardCardDismissSettingsDto, DashboardCardAlignmentDto dashboardCardAlignmentDto) {
        this(new Surrogate(dashboardCardImageDto, text_markdown, dashboardCardCtaDto, dashboardCardDismissSettingsDto, dashboardCardAlignmentDto));
        Intrinsics.checkNotNullParameter(text_markdown, "text_markdown");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public DashboardCard toProto() {
        DashboardCardImageDto image = this.surrogate.getImage();
        DashboardCardImage proto = image != null ? image.toProto() : null;
        String text_markdown = this.surrogate.getText_markdown();
        DashboardCardCtaDto cta = this.surrogate.getCta();
        DashboardCardCta proto2 = cta != null ? cta.toProto() : null;
        DashboardCardDismissSettingsDto dismiss_settings = this.surrogate.getDismiss_settings();
        DashboardCardDismissSettings proto3 = dismiss_settings != null ? dismiss_settings.toProto() : null;
        DashboardCardAlignmentDto alignment = this.surrogate.getAlignment();
        return new DashboardCard(proto, text_markdown, proto2, proto3, alignment != null ? (DashboardCardAlignment) alignment.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[DashboardCardDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DashboardCardDto) && Intrinsics.areEqual(((DashboardCardDto) other).surrogate, this.surrogate);
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
    /* compiled from: DashboardCardDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000298BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010(\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010(\u001a\u0004\b1\u00102R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00104\u0012\u0004\b7\u0010(\u001a\u0004\b5\u00106¨\u0006:"}, m3636d2 = {"Ladvisory/proto/v1/DashboardCardDto$Surrogate;", "", "Ladvisory/proto/v1/DashboardCardImageDto;", "image", "", "text_markdown", "Ladvisory/proto/v1/DashboardCardCtaDto;", AccountOverviewOptionsSettingCard4.CTA, "Ladvisory/proto/v1/DashboardCardDismissSettingsDto;", "dismiss_settings", "Ladvisory/proto/v1/DashboardCardAlignmentDto;", "alignment", "<init>", "(Ladvisory/proto/v1/DashboardCardImageDto;Ljava/lang/String;Ladvisory/proto/v1/DashboardCardCtaDto;Ladvisory/proto/v1/DashboardCardDismissSettingsDto;Ladvisory/proto/v1/DashboardCardAlignmentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILadvisory/proto/v1/DashboardCardImageDto;Ljava/lang/String;Ladvisory/proto/v1/DashboardCardCtaDto;Ladvisory/proto/v1/DashboardCardDismissSettingsDto;Ladvisory/proto/v1/DashboardCardAlignmentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/DashboardCardDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/DashboardCardImageDto;", "getImage", "()Ladvisory/proto/v1/DashboardCardImageDto;", "getImage$annotations", "()V", "Ljava/lang/String;", "getText_markdown", "getText_markdown$annotations", "Ladvisory/proto/v1/DashboardCardCtaDto;", "getCta", "()Ladvisory/proto/v1/DashboardCardCtaDto;", "getCta$annotations", "Ladvisory/proto/v1/DashboardCardDismissSettingsDto;", "getDismiss_settings", "()Ladvisory/proto/v1/DashboardCardDismissSettingsDto;", "getDismiss_settings$annotations", "Ladvisory/proto/v1/DashboardCardAlignmentDto;", "getAlignment", "()Ladvisory/proto/v1/DashboardCardAlignmentDto;", "getAlignment$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DashboardCardAlignmentDto alignment;
        private final DashboardCardCtaDto cta;
        private final DashboardCardDismissSettingsDto dismiss_settings;
        private final DashboardCardImageDto image;
        private final String text_markdown;

        public Surrogate() {
            this((DashboardCardImageDto) null, (String) null, (DashboardCardCtaDto) null, (DashboardCardDismissSettingsDto) null, (DashboardCardAlignmentDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.image, surrogate.image) && Intrinsics.areEqual(this.text_markdown, surrogate.text_markdown) && Intrinsics.areEqual(this.cta, surrogate.cta) && Intrinsics.areEqual(this.dismiss_settings, surrogate.dismiss_settings) && this.alignment == surrogate.alignment;
        }

        public int hashCode() {
            DashboardCardImageDto dashboardCardImageDto = this.image;
            int iHashCode = (((dashboardCardImageDto == null ? 0 : dashboardCardImageDto.hashCode()) * 31) + this.text_markdown.hashCode()) * 31;
            DashboardCardCtaDto dashboardCardCtaDto = this.cta;
            int iHashCode2 = (iHashCode + (dashboardCardCtaDto == null ? 0 : dashboardCardCtaDto.hashCode())) * 31;
            DashboardCardDismissSettingsDto dashboardCardDismissSettingsDto = this.dismiss_settings;
            int iHashCode3 = (iHashCode2 + (dashboardCardDismissSettingsDto == null ? 0 : dashboardCardDismissSettingsDto.hashCode())) * 31;
            DashboardCardAlignmentDto dashboardCardAlignmentDto = this.alignment;
            return iHashCode3 + (dashboardCardAlignmentDto != null ? dashboardCardAlignmentDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(image=" + this.image + ", text_markdown=" + this.text_markdown + ", cta=" + this.cta + ", dismiss_settings=" + this.dismiss_settings + ", alignment=" + this.alignment + ")";
        }

        /* compiled from: DashboardCardDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/DashboardCardDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/DashboardCardDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DashboardCardDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DashboardCardImageDto dashboardCardImageDto, String str, DashboardCardCtaDto dashboardCardCtaDto, DashboardCardDismissSettingsDto dashboardCardDismissSettingsDto, DashboardCardAlignmentDto dashboardCardAlignmentDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.image = null;
            } else {
                this.image = dashboardCardImageDto;
            }
            if ((i & 2) == 0) {
                this.text_markdown = "";
            } else {
                this.text_markdown = str;
            }
            if ((i & 4) == 0) {
                this.cta = null;
            } else {
                this.cta = dashboardCardCtaDto;
            }
            if ((i & 8) == 0) {
                this.dismiss_settings = null;
            } else {
                this.dismiss_settings = dashboardCardDismissSettingsDto;
            }
            if ((i & 16) == 0) {
                this.alignment = null;
            } else {
                this.alignment = dashboardCardAlignmentDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            DashboardCardImageDto dashboardCardImageDto = self.image;
            if (dashboardCardImageDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, DashboardCardImageDto.Serializer.INSTANCE, dashboardCardImageDto);
            }
            if (!Intrinsics.areEqual(self.text_markdown, "")) {
                output.encodeStringElement(serialDesc, 1, self.text_markdown);
            }
            DashboardCardCtaDto dashboardCardCtaDto = self.cta;
            if (dashboardCardCtaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DashboardCardCtaDto.Serializer.INSTANCE, dashboardCardCtaDto);
            }
            DashboardCardDismissSettingsDto dashboardCardDismissSettingsDto = self.dismiss_settings;
            if (dashboardCardDismissSettingsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, DashboardCardDismissSettingsDto.Serializer.INSTANCE, dashboardCardDismissSettingsDto);
            }
            DashboardCardAlignmentDto dashboardCardAlignmentDto = self.alignment;
            if (dashboardCardAlignmentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, DashboardCardAlignmentDto.Serializer.INSTANCE, dashboardCardAlignmentDto);
            }
        }

        public Surrogate(DashboardCardImageDto dashboardCardImageDto, String text_markdown, DashboardCardCtaDto dashboardCardCtaDto, DashboardCardDismissSettingsDto dashboardCardDismissSettingsDto, DashboardCardAlignmentDto dashboardCardAlignmentDto) {
            Intrinsics.checkNotNullParameter(text_markdown, "text_markdown");
            this.image = dashboardCardImageDto;
            this.text_markdown = text_markdown;
            this.cta = dashboardCardCtaDto;
            this.dismiss_settings = dashboardCardDismissSettingsDto;
            this.alignment = dashboardCardAlignmentDto;
        }

        public final DashboardCardImageDto getImage() {
            return this.image;
        }

        public final String getText_markdown() {
            return this.text_markdown;
        }

        public /* synthetic */ Surrogate(DashboardCardImageDto dashboardCardImageDto, String str, DashboardCardCtaDto dashboardCardCtaDto, DashboardCardDismissSettingsDto dashboardCardDismissSettingsDto, DashboardCardAlignmentDto dashboardCardAlignmentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : dashboardCardImageDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : dashboardCardCtaDto, (i & 8) != 0 ? null : dashboardCardDismissSettingsDto, (i & 16) != 0 ? null : dashboardCardAlignmentDto);
        }

        public final DashboardCardCtaDto getCta() {
            return this.cta;
        }

        public final DashboardCardDismissSettingsDto getDismiss_settings() {
            return this.dismiss_settings;
        }

        public final DashboardCardAlignmentDto getAlignment() {
            return this.alignment;
        }
    }

    /* compiled from: DashboardCardDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/DashboardCardDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/DashboardCardDto;", "Ladvisory/proto/v1/DashboardCard;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/DashboardCardDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<DashboardCardDto, DashboardCard> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DashboardCardDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DashboardCardDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DashboardCardDto> getBinaryBase64Serializer() {
            return (KSerializer) DashboardCardDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DashboardCard> getProtoAdapter() {
            return DashboardCard.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DashboardCardDto getZeroValue() {
            return DashboardCardDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DashboardCardDto fromProto(DashboardCard proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            DashboardCardImage image = proto.getImage();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DashboardCardImageDto dashboardCardImageDtoFromProto = image != null ? DashboardCardImageDto.INSTANCE.fromProto(image) : null;
            String text_markdown = proto.getText_markdown();
            DashboardCardCta cta = proto.getCta();
            DashboardCardCtaDto dashboardCardCtaDtoFromProto = cta != null ? DashboardCardCtaDto.INSTANCE.fromProto(cta) : null;
            DashboardCardDismissSettings dismiss_settings = proto.getDismiss_settings();
            DashboardCardDismissSettingsDto dashboardCardDismissSettingsDtoFromProto = dismiss_settings != null ? DashboardCardDismissSettingsDto.INSTANCE.fromProto(dismiss_settings) : null;
            DashboardCardAlignment alignment = proto.getAlignment();
            return new DashboardCardDto(new Surrogate(dashboardCardImageDtoFromProto, text_markdown, dashboardCardCtaDtoFromProto, dashboardCardDismissSettingsDtoFromProto, alignment != null ? DashboardCardAlignmentDto.INSTANCE.fromProto(alignment) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.DashboardCardDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DashboardCardDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DashboardCardDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: DashboardCardDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/DashboardCardDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/DashboardCardDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/DashboardCardDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<DashboardCardDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.DashboardCard", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DashboardCardDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DashboardCardDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DashboardCardDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DashboardCardDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/DashboardCardDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "advisory.proto.v1.DashboardCardDto";
        }
    }
}
