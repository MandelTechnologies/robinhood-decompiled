package bonfire.proto.idl.advisor_marketplace.p029v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorDashboardStateEnrolledNoBookingDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorDashboardStateFirstBookingDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorDashboardStateNotEnrolledDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorDashboardStatePostBookingDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorDashboardStateRelationshipActiveDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorDashboardStateRelationshipInitiatedDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
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

/* compiled from: AdvisorDashboardStateDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardState;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$Surrogate;)V", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto;", "state", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto;)V", "toProto", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardState;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$Surrogate;", "getState", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto;", "Companion", "Surrogate", "StateDto", "Serializer", "MultibindingModule", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class AdvisorDashboardStateDto implements Dto3<AdvisorDashboardState>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdvisorDashboardStateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdvisorDashboardStateDto, AdvisorDashboardState>> binaryBase64Serializer$delegate;
    private static final AdvisorDashboardStateDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdvisorDashboardStateDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdvisorDashboardStateDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final StateDto getState() {
        if (this.surrogate.getNot_enrolled() != null) {
            return new StateDto.NotEnrolled(this.surrogate.getNot_enrolled());
        }
        if (this.surrogate.getEnrolled_no_booking() != null) {
            return new StateDto.EnrolledNoBooking(this.surrogate.getEnrolled_no_booking());
        }
        if (this.surrogate.getFirst_booking() != null) {
            return new StateDto.FirstBooking(this.surrogate.getFirst_booking());
        }
        if (this.surrogate.getPost_booking() != null) {
            return new StateDto.PostBooking(this.surrogate.getPost_booking());
        }
        if (this.surrogate.getRelationship_initiated() != null) {
            return new StateDto.RelationshipInitiated(this.surrogate.getRelationship_initiated());
        }
        if (this.surrogate.getRelationship_active() != null) {
            return new StateDto.RelationshipActive(this.surrogate.getRelationship_active());
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdvisorDashboardStateDto(StateDto stateDto) {
        StateDto.NotEnrolled notEnrolled = stateDto instanceof StateDto.NotEnrolled ? (StateDto.NotEnrolled) stateDto : null;
        AdvisorDashboardStateNotEnrolledDto value = notEnrolled != null ? notEnrolled.getValue() : null;
        StateDto.EnrolledNoBooking enrolledNoBooking = stateDto instanceof StateDto.EnrolledNoBooking ? (StateDto.EnrolledNoBooking) stateDto : null;
        AdvisorDashboardStateEnrolledNoBookingDto value2 = enrolledNoBooking != null ? enrolledNoBooking.getValue() : null;
        StateDto.FirstBooking firstBooking = stateDto instanceof StateDto.FirstBooking ? (StateDto.FirstBooking) stateDto : null;
        AdvisorDashboardStateFirstBookingDto value3 = firstBooking != null ? firstBooking.getValue() : null;
        StateDto.PostBooking postBooking = stateDto instanceof StateDto.PostBooking ? (StateDto.PostBooking) stateDto : null;
        AdvisorDashboardStatePostBookingDto value4 = postBooking != null ? postBooking.getValue() : null;
        StateDto.RelationshipInitiated relationshipInitiated = stateDto instanceof StateDto.RelationshipInitiated ? (StateDto.RelationshipInitiated) stateDto : null;
        AdvisorDashboardStateRelationshipInitiatedDto value5 = relationshipInitiated != null ? relationshipInitiated.getValue() : null;
        StateDto.RelationshipActive relationshipActive = stateDto instanceof StateDto.RelationshipActive ? (StateDto.RelationshipActive) stateDto : null;
        this(new Surrogate(value, value2, value3, value4, value5, relationshipActive != null ? relationshipActive.getValue() : null));
    }

    public /* synthetic */ AdvisorDashboardStateDto(StateDto stateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : stateDto);
    }

    @Override // com.robinhood.idl.Dto
    public AdvisorDashboardState toProto() {
        AdvisorDashboardStateNotEnrolledDto not_enrolled = this.surrogate.getNot_enrolled();
        AdvisorDashboardStateNotEnrolled proto = not_enrolled != null ? not_enrolled.toProto() : null;
        AdvisorDashboardStateEnrolledNoBookingDto enrolled_no_booking = this.surrogate.getEnrolled_no_booking();
        AdvisorDashboardStateEnrolledNoBooking proto2 = enrolled_no_booking != null ? enrolled_no_booking.toProto() : null;
        AdvisorDashboardStateFirstBookingDto first_booking = this.surrogate.getFirst_booking();
        AdvisorDashboardStateFirstBooking proto3 = first_booking != null ? first_booking.toProto() : null;
        AdvisorDashboardStatePostBookingDto post_booking = this.surrogate.getPost_booking();
        AdvisorDashboardStatePostBooking proto4 = post_booking != null ? post_booking.toProto() : null;
        AdvisorDashboardStateRelationshipInitiatedDto relationship_initiated = this.surrogate.getRelationship_initiated();
        AdvisorDashboardStateRelationshipInitiated proto5 = relationship_initiated != null ? relationship_initiated.toProto() : null;
        AdvisorDashboardStateRelationshipActiveDto relationship_active = this.surrogate.getRelationship_active();
        return new AdvisorDashboardState(proto, proto2, proto3, proto4, proto5, relationship_active != null ? relationship_active.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[AdvisorDashboardStateDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdvisorDashboardStateDto) && Intrinsics.areEqual(((AdvisorDashboardStateDto) other).surrogate, this.surrogate);
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
    /* compiled from: AdvisorDashboardStateDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0083\b\u0018\u0000 @2\u00020\u0001:\u0002A@BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b3\u0010+\u001a\u0004\b1\u00102R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b7\u0010+\u001a\u0004\b5\u00106R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\b;\u0010+\u001a\u0004\b9\u0010:R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010<\u0012\u0004\b?\u0010+\u001a\u0004\b=\u0010>¨\u0006B"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$Surrogate;", "", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateNotEnrolledDto;", "not_enrolled", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto;", "enrolled_no_booking", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto;", "first_booking", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStatePostBookingDto;", "post_booking", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipInitiatedDto;", "relationship_initiated", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipActiveDto;", "relationship_active", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateNotEnrolledDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStatePostBookingDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipInitiatedDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipActiveDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateNotEnrolledDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStatePostBookingDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipInitiatedDto;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipActiveDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_advisor_marketplace_v1_externalRelease", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateNotEnrolledDto;", "getNot_enrolled", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateNotEnrolledDto;", "getNot_enrolled$annotations", "()V", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto;", "getEnrolled_no_booking", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto;", "getEnrolled_no_booking$annotations", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto;", "getFirst_booking", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto;", "getFirst_booking$annotations", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStatePostBookingDto;", "getPost_booking", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStatePostBookingDto;", "getPost_booking$annotations", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipInitiatedDto;", "getRelationship_initiated", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipInitiatedDto;", "getRelationship_initiated$annotations", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipActiveDto;", "getRelationship_active", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipActiveDto;", "getRelationship_active$annotations", "Companion", "$serializer", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AdvisorDashboardStateEnrolledNoBookingDto enrolled_no_booking;
        private final AdvisorDashboardStateFirstBookingDto first_booking;
        private final AdvisorDashboardStateNotEnrolledDto not_enrolled;
        private final AdvisorDashboardStatePostBookingDto post_booking;
        private final AdvisorDashboardStateRelationshipActiveDto relationship_active;
        private final AdvisorDashboardStateRelationshipInitiatedDto relationship_initiated;

        public Surrogate() {
            this((AdvisorDashboardStateNotEnrolledDto) null, (AdvisorDashboardStateEnrolledNoBookingDto) null, (AdvisorDashboardStateFirstBookingDto) null, (AdvisorDashboardStatePostBookingDto) null, (AdvisorDashboardStateRelationshipInitiatedDto) null, (AdvisorDashboardStateRelationshipActiveDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.not_enrolled, surrogate.not_enrolled) && Intrinsics.areEqual(this.enrolled_no_booking, surrogate.enrolled_no_booking) && Intrinsics.areEqual(this.first_booking, surrogate.first_booking) && Intrinsics.areEqual(this.post_booking, surrogate.post_booking) && Intrinsics.areEqual(this.relationship_initiated, surrogate.relationship_initiated) && Intrinsics.areEqual(this.relationship_active, surrogate.relationship_active);
        }

        public int hashCode() {
            AdvisorDashboardStateNotEnrolledDto advisorDashboardStateNotEnrolledDto = this.not_enrolled;
            int iHashCode = (advisorDashboardStateNotEnrolledDto == null ? 0 : advisorDashboardStateNotEnrolledDto.hashCode()) * 31;
            AdvisorDashboardStateEnrolledNoBookingDto advisorDashboardStateEnrolledNoBookingDto = this.enrolled_no_booking;
            int iHashCode2 = (iHashCode + (advisorDashboardStateEnrolledNoBookingDto == null ? 0 : advisorDashboardStateEnrolledNoBookingDto.hashCode())) * 31;
            AdvisorDashboardStateFirstBookingDto advisorDashboardStateFirstBookingDto = this.first_booking;
            int iHashCode3 = (iHashCode2 + (advisorDashboardStateFirstBookingDto == null ? 0 : advisorDashboardStateFirstBookingDto.hashCode())) * 31;
            AdvisorDashboardStatePostBookingDto advisorDashboardStatePostBookingDto = this.post_booking;
            int iHashCode4 = (iHashCode3 + (advisorDashboardStatePostBookingDto == null ? 0 : advisorDashboardStatePostBookingDto.hashCode())) * 31;
            AdvisorDashboardStateRelationshipInitiatedDto advisorDashboardStateRelationshipInitiatedDto = this.relationship_initiated;
            int iHashCode5 = (iHashCode4 + (advisorDashboardStateRelationshipInitiatedDto == null ? 0 : advisorDashboardStateRelationshipInitiatedDto.hashCode())) * 31;
            AdvisorDashboardStateRelationshipActiveDto advisorDashboardStateRelationshipActiveDto = this.relationship_active;
            return iHashCode5 + (advisorDashboardStateRelationshipActiveDto != null ? advisorDashboardStateRelationshipActiveDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(not_enrolled=" + this.not_enrolled + ", enrolled_no_booking=" + this.enrolled_no_booking + ", first_booking=" + this.first_booking + ", post_booking=" + this.post_booking + ", relationship_initiated=" + this.relationship_initiated + ", relationship_active=" + this.relationship_active + ")";
        }

        /* compiled from: AdvisorDashboardStateDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$Surrogate;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdvisorDashboardStateDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, AdvisorDashboardStateNotEnrolledDto advisorDashboardStateNotEnrolledDto, AdvisorDashboardStateEnrolledNoBookingDto advisorDashboardStateEnrolledNoBookingDto, AdvisorDashboardStateFirstBookingDto advisorDashboardStateFirstBookingDto, AdvisorDashboardStatePostBookingDto advisorDashboardStatePostBookingDto, AdvisorDashboardStateRelationshipInitiatedDto advisorDashboardStateRelationshipInitiatedDto, AdvisorDashboardStateRelationshipActiveDto advisorDashboardStateRelationshipActiveDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.not_enrolled = null;
            } else {
                this.not_enrolled = advisorDashboardStateNotEnrolledDto;
            }
            if ((i & 2) == 0) {
                this.enrolled_no_booking = null;
            } else {
                this.enrolled_no_booking = advisorDashboardStateEnrolledNoBookingDto;
            }
            if ((i & 4) == 0) {
                this.first_booking = null;
            } else {
                this.first_booking = advisorDashboardStateFirstBookingDto;
            }
            if ((i & 8) == 0) {
                this.post_booking = null;
            } else {
                this.post_booking = advisorDashboardStatePostBookingDto;
            }
            if ((i & 16) == 0) {
                this.relationship_initiated = null;
            } else {
                this.relationship_initiated = advisorDashboardStateRelationshipInitiatedDto;
            }
            if ((i & 32) == 0) {
                this.relationship_active = null;
            } else {
                this.relationship_active = advisorDashboardStateRelationshipActiveDto;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$bonfire_proto_idl_advisor_marketplace_v1_externalRelease */
        public static final /* synthetic */ void m718x79713acb(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            AdvisorDashboardStateNotEnrolledDto advisorDashboardStateNotEnrolledDto = self.not_enrolled;
            if (advisorDashboardStateNotEnrolledDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, AdvisorDashboardStateNotEnrolledDto.Serializer.INSTANCE, advisorDashboardStateNotEnrolledDto);
            }
            AdvisorDashboardStateEnrolledNoBookingDto advisorDashboardStateEnrolledNoBookingDto = self.enrolled_no_booking;
            if (advisorDashboardStateEnrolledNoBookingDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, AdvisorDashboardStateEnrolledNoBookingDto.Serializer.INSTANCE, advisorDashboardStateEnrolledNoBookingDto);
            }
            AdvisorDashboardStateFirstBookingDto advisorDashboardStateFirstBookingDto = self.first_booking;
            if (advisorDashboardStateFirstBookingDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, AdvisorDashboardStateFirstBookingDto.Serializer.INSTANCE, advisorDashboardStateFirstBookingDto);
            }
            AdvisorDashboardStatePostBookingDto advisorDashboardStatePostBookingDto = self.post_booking;
            if (advisorDashboardStatePostBookingDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, AdvisorDashboardStatePostBookingDto.Serializer.INSTANCE, advisorDashboardStatePostBookingDto);
            }
            AdvisorDashboardStateRelationshipInitiatedDto advisorDashboardStateRelationshipInitiatedDto = self.relationship_initiated;
            if (advisorDashboardStateRelationshipInitiatedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, AdvisorDashboardStateRelationshipInitiatedDto.Serializer.INSTANCE, advisorDashboardStateRelationshipInitiatedDto);
            }
            AdvisorDashboardStateRelationshipActiveDto advisorDashboardStateRelationshipActiveDto = self.relationship_active;
            if (advisorDashboardStateRelationshipActiveDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, AdvisorDashboardStateRelationshipActiveDto.Serializer.INSTANCE, advisorDashboardStateRelationshipActiveDto);
            }
        }

        public Surrogate(AdvisorDashboardStateNotEnrolledDto advisorDashboardStateNotEnrolledDto, AdvisorDashboardStateEnrolledNoBookingDto advisorDashboardStateEnrolledNoBookingDto, AdvisorDashboardStateFirstBookingDto advisorDashboardStateFirstBookingDto, AdvisorDashboardStatePostBookingDto advisorDashboardStatePostBookingDto, AdvisorDashboardStateRelationshipInitiatedDto advisorDashboardStateRelationshipInitiatedDto, AdvisorDashboardStateRelationshipActiveDto advisorDashboardStateRelationshipActiveDto) {
            this.not_enrolled = advisorDashboardStateNotEnrolledDto;
            this.enrolled_no_booking = advisorDashboardStateEnrolledNoBookingDto;
            this.first_booking = advisorDashboardStateFirstBookingDto;
            this.post_booking = advisorDashboardStatePostBookingDto;
            this.relationship_initiated = advisorDashboardStateRelationshipInitiatedDto;
            this.relationship_active = advisorDashboardStateRelationshipActiveDto;
        }

        public /* synthetic */ Surrogate(AdvisorDashboardStateNotEnrolledDto advisorDashboardStateNotEnrolledDto, AdvisorDashboardStateEnrolledNoBookingDto advisorDashboardStateEnrolledNoBookingDto, AdvisorDashboardStateFirstBookingDto advisorDashboardStateFirstBookingDto, AdvisorDashboardStatePostBookingDto advisorDashboardStatePostBookingDto, AdvisorDashboardStateRelationshipInitiatedDto advisorDashboardStateRelationshipInitiatedDto, AdvisorDashboardStateRelationshipActiveDto advisorDashboardStateRelationshipActiveDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : advisorDashboardStateNotEnrolledDto, (i & 2) != 0 ? null : advisorDashboardStateEnrolledNoBookingDto, (i & 4) != 0 ? null : advisorDashboardStateFirstBookingDto, (i & 8) != 0 ? null : advisorDashboardStatePostBookingDto, (i & 16) != 0 ? null : advisorDashboardStateRelationshipInitiatedDto, (i & 32) != 0 ? null : advisorDashboardStateRelationshipActiveDto);
        }

        public final AdvisorDashboardStateNotEnrolledDto getNot_enrolled() {
            return this.not_enrolled;
        }

        public final AdvisorDashboardStateEnrolledNoBookingDto getEnrolled_no_booking() {
            return this.enrolled_no_booking;
        }

        public final AdvisorDashboardStateFirstBookingDto getFirst_booking() {
            return this.first_booking;
        }

        public final AdvisorDashboardStatePostBookingDto getPost_booking() {
            return this.post_booking;
        }

        public final AdvisorDashboardStateRelationshipInitiatedDto getRelationship_initiated() {
            return this.relationship_initiated;
        }

        public final AdvisorDashboardStateRelationshipActiveDto getRelationship_active() {
            return this.relationship_active;
        }
    }

    /* compiled from: AdvisorDashboardStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AdvisorDashboardStateDto, AdvisorDashboardState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdvisorDashboardStateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisorDashboardStateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisorDashboardStateDto> getBinaryBase64Serializer() {
            return (KSerializer) AdvisorDashboardStateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdvisorDashboardState> getProtoAdapter() {
            return AdvisorDashboardState.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisorDashboardStateDto getZeroValue() {
            return AdvisorDashboardStateDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisorDashboardStateDto fromProto(AdvisorDashboardState proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            AdvisorDashboardStateNotEnrolled not_enrolled = proto.getNot_enrolled();
            DefaultConstructorMarker defaultConstructorMarker = null;
            AdvisorDashboardStateNotEnrolledDto advisorDashboardStateNotEnrolledDtoFromProto = not_enrolled != null ? AdvisorDashboardStateNotEnrolledDto.INSTANCE.fromProto(not_enrolled) : null;
            AdvisorDashboardStateEnrolledNoBooking enrolled_no_booking = proto.getEnrolled_no_booking();
            AdvisorDashboardStateEnrolledNoBookingDto advisorDashboardStateEnrolledNoBookingDtoFromProto = enrolled_no_booking != null ? AdvisorDashboardStateEnrolledNoBookingDto.INSTANCE.fromProto(enrolled_no_booking) : null;
            AdvisorDashboardStateFirstBooking first_booking = proto.getFirst_booking();
            AdvisorDashboardStateFirstBookingDto advisorDashboardStateFirstBookingDtoFromProto = first_booking != null ? AdvisorDashboardStateFirstBookingDto.INSTANCE.fromProto(first_booking) : null;
            AdvisorDashboardStatePostBooking post_booking = proto.getPost_booking();
            AdvisorDashboardStatePostBookingDto advisorDashboardStatePostBookingDtoFromProto = post_booking != null ? AdvisorDashboardStatePostBookingDto.INSTANCE.fromProto(post_booking) : null;
            AdvisorDashboardStateRelationshipInitiated relationship_initiated = proto.getRelationship_initiated();
            AdvisorDashboardStateRelationshipInitiatedDto advisorDashboardStateRelationshipInitiatedDtoFromProto = relationship_initiated != null ? AdvisorDashboardStateRelationshipInitiatedDto.INSTANCE.fromProto(relationship_initiated) : null;
            AdvisorDashboardStateRelationshipActive relationship_active = proto.getRelationship_active();
            return new AdvisorDashboardStateDto(new Surrogate(advisorDashboardStateNotEnrolledDtoFromProto, advisorDashboardStateEnrolledNoBookingDtoFromProto, advisorDashboardStateFirstBookingDtoFromProto, advisorDashboardStatePostBookingDtoFromProto, advisorDashboardStateRelationshipInitiatedDtoFromProto, relationship_active != null ? AdvisorDashboardStateRelationshipActiveDto.INSTANCE.fromProto(relationship_active) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisorDashboardStateDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AdvisorDashboardStateDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AdvisorDashboardStateDto.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "NotEnrolled", "EnrolledNoBooking", "FirstBooking", "PostBooking", "RelationshipInitiated", "RelationshipActive", "Companion", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto$EnrolledNoBooking;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto$FirstBooking;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto$NotEnrolled;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto$PostBooking;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto$RelationshipActive;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto$RelationshipInitiated;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class StateDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ StateDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: AdvisorDashboardStateDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto$NotEnrolled;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateNotEnrolledDto;", "value", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateNotEnrolledDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateNotEnrolledDto;", "getValue", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateNotEnrolledDto;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NotEnrolled extends StateDto {
            private final AdvisorDashboardStateNotEnrolledDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NotEnrolled) && Intrinsics.areEqual(this.value, ((NotEnrolled) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NotEnrolled(value=" + this.value + ")";
            }

            public final AdvisorDashboardStateNotEnrolledDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NotEnrolled(AdvisorDashboardStateNotEnrolledDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AdvisorDashboardStateDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto$EnrolledNoBooking;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto;", "value", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto;", "getValue", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateEnrolledNoBookingDto;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EnrolledNoBooking extends StateDto {
            private final AdvisorDashboardStateEnrolledNoBookingDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EnrolledNoBooking) && Intrinsics.areEqual(this.value, ((EnrolledNoBooking) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EnrolledNoBooking(value=" + this.value + ")";
            }

            public final AdvisorDashboardStateEnrolledNoBookingDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EnrolledNoBooking(AdvisorDashboardStateEnrolledNoBookingDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AdvisorDashboardStateDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto$FirstBooking;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto;", "value", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto;", "getValue", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateFirstBookingDto;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FirstBooking extends StateDto {
            private final AdvisorDashboardStateFirstBookingDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FirstBooking) && Intrinsics.areEqual(this.value, ((FirstBooking) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "FirstBooking(value=" + this.value + ")";
            }

            public final AdvisorDashboardStateFirstBookingDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FirstBooking(AdvisorDashboardStateFirstBookingDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AdvisorDashboardStateDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto$PostBooking;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStatePostBookingDto;", "value", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStatePostBookingDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStatePostBookingDto;", "getValue", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStatePostBookingDto;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PostBooking extends StateDto {
            private final AdvisorDashboardStatePostBookingDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PostBooking) && Intrinsics.areEqual(this.value, ((PostBooking) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PostBooking(value=" + this.value + ")";
            }

            public final AdvisorDashboardStatePostBookingDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PostBooking(AdvisorDashboardStatePostBookingDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AdvisorDashboardStateDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto$RelationshipInitiated;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipInitiatedDto;", "value", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipInitiatedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipInitiatedDto;", "getValue", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipInitiatedDto;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RelationshipInitiated extends StateDto {
            private final AdvisorDashboardStateRelationshipInitiatedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RelationshipInitiated) && Intrinsics.areEqual(this.value, ((RelationshipInitiated) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "RelationshipInitiated(value=" + this.value + ")";
            }

            public final AdvisorDashboardStateRelationshipInitiatedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RelationshipInitiated(AdvisorDashboardStateRelationshipInitiatedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AdvisorDashboardStateDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto$RelationshipActive;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipActiveDto;", "value", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipActiveDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipActiveDto;", "getValue", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateRelationshipActiveDto;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RelationshipActive extends StateDto {
            private final AdvisorDashboardStateRelationshipActiveDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RelationshipActive) && Intrinsics.areEqual(this.value, ((RelationshipActive) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "RelationshipActive(value=" + this.value + ")";
            }

            public final AdvisorDashboardStateRelationshipActiveDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RelationshipActive(AdvisorDashboardStateRelationshipActiveDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AdvisorDashboardStateDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$StateDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardState;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<StateDto, AdvisorDashboardState> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<AdvisorDashboardState> getProtoAdapter() {
                return AdvisorDashboardState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto fromProto(AdvisorDashboardState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getNot_enrolled() != null) {
                    return new NotEnrolled(AdvisorDashboardStateNotEnrolledDto.INSTANCE.fromProto(proto.getNot_enrolled()));
                }
                if (proto.getEnrolled_no_booking() != null) {
                    return new EnrolledNoBooking(AdvisorDashboardStateEnrolledNoBookingDto.INSTANCE.fromProto(proto.getEnrolled_no_booking()));
                }
                if (proto.getFirst_booking() != null) {
                    return new FirstBooking(AdvisorDashboardStateFirstBookingDto.INSTANCE.fromProto(proto.getFirst_booking()));
                }
                if (proto.getPost_booking() != null) {
                    return new PostBooking(AdvisorDashboardStatePostBookingDto.INSTANCE.fromProto(proto.getPost_booking()));
                }
                if (proto.getRelationship_initiated() != null) {
                    return new RelationshipInitiated(AdvisorDashboardStateRelationshipInitiatedDto.INSTANCE.fromProto(proto.getRelationship_initiated()));
                }
                if (proto.getRelationship_active() != null) {
                    return new RelationshipActive(AdvisorDashboardStateRelationshipActiveDto.INSTANCE.fromProto(proto.getRelationship_active()));
                }
                return null;
            }
        }
    }

    /* compiled from: AdvisorDashboardStateDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AdvisorDashboardStateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardState", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdvisorDashboardStateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdvisorDashboardStateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdvisorDashboardStateDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AdvisorDashboardStateDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDashboardStateDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDashboardStateDto";
        }
    }
}
