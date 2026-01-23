package bonfire.proto.idl.acats.p027v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.acats.p027v1.AcatsTransferHubBottomSheetCtaDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
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

/* compiled from: AcatsTransferHubBottomSheetDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BS\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010)R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0015¨\u00062"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetails;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto$Surrogate;)V", "", "title", "subtitle", "Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetCtaDto;", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "source_brokerage_icon_url", "destination_brokerage_icon_url", MatchSelectionActivity.TRANSFER_ID_EXTRA, "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetCtaDto;Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetCtaDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto$Surrogate;", "getTitle", "getSubtitle", "getPrimary_cta", "()Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetCtaDto;", "getSecondary_cta", "getSource_brokerage_icon_url", "getDestination_brokerage_icon_url", "getTransfer_id", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class AcatsTransferHubBottomSheetDetailsDto implements Dto3<AcatsTransferHubBottomSheetDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AcatsTransferHubBottomSheetDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AcatsTransferHubBottomSheetDetailsDto, AcatsTransferHubBottomSheetDetails>> binaryBase64Serializer$delegate;
    private static final AcatsTransferHubBottomSheetDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AcatsTransferHubBottomSheetDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AcatsTransferHubBottomSheetDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final AcatsTransferHubBottomSheetCtaDto getPrimary_cta() {
        return this.surrogate.getPrimary_cta();
    }

    public final AcatsTransferHubBottomSheetCtaDto getSecondary_cta() {
        return this.surrogate.getSecondary_cta();
    }

    public final String getSource_brokerage_icon_url() {
        return this.surrogate.getSource_brokerage_icon_url();
    }

    public final String getDestination_brokerage_icon_url() {
        return this.surrogate.getDestination_brokerage_icon_url();
    }

    public final String getTransfer_id() {
        return this.surrogate.getTransfer_id();
    }

    public /* synthetic */ AcatsTransferHubBottomSheetDetailsDto(String str, String str2, AcatsTransferHubBottomSheetCtaDto acatsTransferHubBottomSheetCtaDto, AcatsTransferHubBottomSheetCtaDto acatsTransferHubBottomSheetCtaDto2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : acatsTransferHubBottomSheetCtaDto, (i & 8) != 0 ? null : acatsTransferHubBottomSheetCtaDto2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AcatsTransferHubBottomSheetDetailsDto(String title, String subtitle, AcatsTransferHubBottomSheetCtaDto acatsTransferHubBottomSheetCtaDto, AcatsTransferHubBottomSheetCtaDto acatsTransferHubBottomSheetCtaDto2, String source_brokerage_icon_url, String destination_brokerage_icon_url, String transfer_id) {
        this(new Surrogate(title, subtitle, acatsTransferHubBottomSheetCtaDto, acatsTransferHubBottomSheetCtaDto2, source_brokerage_icon_url, destination_brokerage_icon_url, transfer_id));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(source_brokerage_icon_url, "source_brokerage_icon_url");
        Intrinsics.checkNotNullParameter(destination_brokerage_icon_url, "destination_brokerage_icon_url");
        Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
    }

    @Override // com.robinhood.idl.Dto
    public AcatsTransferHubBottomSheetDetails toProto() {
        String title = this.surrogate.getTitle();
        String subtitle = this.surrogate.getSubtitle();
        AcatsTransferHubBottomSheetCtaDto primary_cta = this.surrogate.getPrimary_cta();
        AcatsTransferHubBottomSheetCta proto = primary_cta != null ? primary_cta.toProto() : null;
        AcatsTransferHubBottomSheetCtaDto secondary_cta = this.surrogate.getSecondary_cta();
        return new AcatsTransferHubBottomSheetDetails(title, subtitle, proto, secondary_cta != null ? secondary_cta.toProto() : null, this.surrogate.getSource_brokerage_icon_url(), this.surrogate.getDestination_brokerage_icon_url(), this.surrogate.getTransfer_id(), null, 128, null);
    }

    public String toString() {
        return "[AcatsTransferHubBottomSheetDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AcatsTransferHubBottomSheetDetailsDto) && Intrinsics.areEqual(((AcatsTransferHubBottomSheetDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: AcatsTransferHubBottomSheetDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000265BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b,\u0010&\u001a\u0004\b*\u0010+R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b.\u0010&\u001a\u0004\b-\u0010+R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010#\u0012\u0004\b0\u0010&\u001a\u0004\b/\u0010\u001cR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010#\u0012\u0004\b2\u0010&\u001a\u0004\b1\u0010\u001cR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010#\u0012\u0004\b4\u0010&\u001a\u0004\b3\u0010\u001c¨\u00067"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto$Surrogate;", "", "", "title", "subtitle", "Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetCtaDto;", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "source_brokerage_icon_url", "destination_brokerage_icon_url", MatchSelectionActivity.TRANSFER_ID_EXTRA, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetCtaDto;Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetCtaDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetCtaDto;Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetCtaDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_acats_v1_externalRelease", "(Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetCtaDto;", "getPrimary_cta", "()Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetCtaDto;", "getPrimary_cta$annotations", "getSecondary_cta", "getSecondary_cta$annotations", "getSource_brokerage_icon_url", "getSource_brokerage_icon_url$annotations", "getDestination_brokerage_icon_url", "getDestination_brokerage_icon_url$annotations", "getTransfer_id", "getTransfer_id$annotations", "Companion", "$serializer", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String destination_brokerage_icon_url;
        private final AcatsTransferHubBottomSheetCtaDto primary_cta;
        private final AcatsTransferHubBottomSheetCtaDto secondary_cta;
        private final String source_brokerage_icon_url;
        private final String subtitle;
        private final String title;
        private final String transfer_id;

        public Surrogate() {
            this((String) null, (String) null, (AcatsTransferHubBottomSheetCtaDto) null, (AcatsTransferHubBottomSheetCtaDto) null, (String) null, (String) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && Intrinsics.areEqual(this.primary_cta, surrogate.primary_cta) && Intrinsics.areEqual(this.secondary_cta, surrogate.secondary_cta) && Intrinsics.areEqual(this.source_brokerage_icon_url, surrogate.source_brokerage_icon_url) && Intrinsics.areEqual(this.destination_brokerage_icon_url, surrogate.destination_brokerage_icon_url) && Intrinsics.areEqual(this.transfer_id, surrogate.transfer_id);
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31;
            AcatsTransferHubBottomSheetCtaDto acatsTransferHubBottomSheetCtaDto = this.primary_cta;
            int iHashCode2 = (iHashCode + (acatsTransferHubBottomSheetCtaDto == null ? 0 : acatsTransferHubBottomSheetCtaDto.hashCode())) * 31;
            AcatsTransferHubBottomSheetCtaDto acatsTransferHubBottomSheetCtaDto2 = this.secondary_cta;
            return ((((((iHashCode2 + (acatsTransferHubBottomSheetCtaDto2 != null ? acatsTransferHubBottomSheetCtaDto2.hashCode() : 0)) * 31) + this.source_brokerage_icon_url.hashCode()) * 31) + this.destination_brokerage_icon_url.hashCode()) * 31) + this.transfer_id.hashCode();
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", subtitle=" + this.subtitle + ", primary_cta=" + this.primary_cta + ", secondary_cta=" + this.secondary_cta + ", source_brokerage_icon_url=" + this.source_brokerage_icon_url + ", destination_brokerage_icon_url=" + this.destination_brokerage_icon_url + ", transfer_id=" + this.transfer_id + ")";
        }

        /* compiled from: AcatsTransferHubBottomSheetDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto$Surrogate;", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AcatsTransferHubBottomSheetDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, AcatsTransferHubBottomSheetCtaDto acatsTransferHubBottomSheetCtaDto, AcatsTransferHubBottomSheetCtaDto acatsTransferHubBottomSheetCtaDto2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.subtitle = "";
            } else {
                this.subtitle = str2;
            }
            if ((i & 4) == 0) {
                this.primary_cta = null;
            } else {
                this.primary_cta = acatsTransferHubBottomSheetCtaDto;
            }
            if ((i & 8) == 0) {
                this.secondary_cta = null;
            } else {
                this.secondary_cta = acatsTransferHubBottomSheetCtaDto2;
            }
            if ((i & 16) == 0) {
                this.source_brokerage_icon_url = "";
            } else {
                this.source_brokerage_icon_url = str3;
            }
            if ((i & 32) == 0) {
                this.destination_brokerage_icon_url = "";
            } else {
                this.destination_brokerage_icon_url = str4;
            }
            if ((i & 64) == 0) {
                this.transfer_id = "";
            } else {
                this.transfer_id = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_acats_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.subtitle, "")) {
                output.encodeStringElement(serialDesc, 1, self.subtitle);
            }
            AcatsTransferHubBottomSheetCtaDto acatsTransferHubBottomSheetCtaDto = self.primary_cta;
            if (acatsTransferHubBottomSheetCtaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, AcatsTransferHubBottomSheetCtaDto.Serializer.INSTANCE, acatsTransferHubBottomSheetCtaDto);
            }
            AcatsTransferHubBottomSheetCtaDto acatsTransferHubBottomSheetCtaDto2 = self.secondary_cta;
            if (acatsTransferHubBottomSheetCtaDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, AcatsTransferHubBottomSheetCtaDto.Serializer.INSTANCE, acatsTransferHubBottomSheetCtaDto2);
            }
            if (!Intrinsics.areEqual(self.source_brokerage_icon_url, "")) {
                output.encodeStringElement(serialDesc, 4, self.source_brokerage_icon_url);
            }
            if (!Intrinsics.areEqual(self.destination_brokerage_icon_url, "")) {
                output.encodeStringElement(serialDesc, 5, self.destination_brokerage_icon_url);
            }
            if (Intrinsics.areEqual(self.transfer_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.transfer_id);
        }

        public Surrogate(String title, String subtitle, AcatsTransferHubBottomSheetCtaDto acatsTransferHubBottomSheetCtaDto, AcatsTransferHubBottomSheetCtaDto acatsTransferHubBottomSheetCtaDto2, String source_brokerage_icon_url, String destination_brokerage_icon_url, String transfer_id) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(source_brokerage_icon_url, "source_brokerage_icon_url");
            Intrinsics.checkNotNullParameter(destination_brokerage_icon_url, "destination_brokerage_icon_url");
            Intrinsics.checkNotNullParameter(transfer_id, "transfer_id");
            this.title = title;
            this.subtitle = subtitle;
            this.primary_cta = acatsTransferHubBottomSheetCtaDto;
            this.secondary_cta = acatsTransferHubBottomSheetCtaDto2;
            this.source_brokerage_icon_url = source_brokerage_icon_url;
            this.destination_brokerage_icon_url = destination_brokerage_icon_url;
            this.transfer_id = transfer_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, AcatsTransferHubBottomSheetCtaDto acatsTransferHubBottomSheetCtaDto, AcatsTransferHubBottomSheetCtaDto acatsTransferHubBottomSheetCtaDto2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : acatsTransferHubBottomSheetCtaDto, (i & 8) != 0 ? null : acatsTransferHubBottomSheetCtaDto2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final AcatsTransferHubBottomSheetCtaDto getPrimary_cta() {
            return this.primary_cta;
        }

        public final AcatsTransferHubBottomSheetCtaDto getSecondary_cta() {
            return this.secondary_cta;
        }

        public final String getSource_brokerage_icon_url() {
            return this.source_brokerage_icon_url;
        }

        public final String getDestination_brokerage_icon_url() {
            return this.destination_brokerage_icon_url;
        }

        public final String getTransfer_id() {
            return this.transfer_id;
        }
    }

    /* compiled from: AcatsTransferHubBottomSheetDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto;", "Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AcatsTransferHubBottomSheetDetailsDto, AcatsTransferHubBottomSheetDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AcatsTransferHubBottomSheetDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AcatsTransferHubBottomSheetDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AcatsTransferHubBottomSheetDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) AcatsTransferHubBottomSheetDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AcatsTransferHubBottomSheetDetails> getProtoAdapter() {
            return AcatsTransferHubBottomSheetDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AcatsTransferHubBottomSheetDetailsDto getZeroValue() {
            return AcatsTransferHubBottomSheetDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AcatsTransferHubBottomSheetDetailsDto fromProto(AcatsTransferHubBottomSheetDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String subtitle = proto.getSubtitle();
            AcatsTransferHubBottomSheetCta primary_cta = proto.getPrimary_cta();
            DefaultConstructorMarker defaultConstructorMarker = null;
            AcatsTransferHubBottomSheetCtaDto acatsTransferHubBottomSheetCtaDtoFromProto = primary_cta != null ? AcatsTransferHubBottomSheetCtaDto.INSTANCE.fromProto(primary_cta) : null;
            AcatsTransferHubBottomSheetCta secondary_cta = proto.getSecondary_cta();
            return new AcatsTransferHubBottomSheetDetailsDto(new Surrogate(title, subtitle, acatsTransferHubBottomSheetCtaDtoFromProto, secondary_cta != null ? AcatsTransferHubBottomSheetCtaDto.INSTANCE.fromProto(secondary_cta) : null, proto.getSource_brokerage_icon_url(), proto.getDestination_brokerage_icon_url(), proto.getTransfer_id()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.acats.v1.AcatsTransferHubBottomSheetDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AcatsTransferHubBottomSheetDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AcatsTransferHubBottomSheetDetailsDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AcatsTransferHubBottomSheetDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AcatsTransferHubBottomSheetDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.acats.v1.AcatsTransferHubBottomSheetDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AcatsTransferHubBottomSheetDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AcatsTransferHubBottomSheetDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AcatsTransferHubBottomSheetDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AcatsTransferHubBottomSheetDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.acats.v1.AcatsTransferHubBottomSheetDetailsDto";
        }
    }
}
