package bonfire.proto.idl.advisor_marketplace.p029v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.advisor_marketplace.p029v1.MeetingStatusDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p479j$.time.Instant;

/* compiled from: AdvisorMeetingDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004:9;<B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0083\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001bR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001bR\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001bR\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001bR\u0019\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b7\u0010\u001bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b8\u0010\u001b¨\u0006="}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeetingDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeeting;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeetingDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeetingDto$Surrogate;)V", "", "id", "advisor_id", "advisor_first_name", "advisor_last_name", "advisor_image_url", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "timestamp_formatted", "Lbonfire/proto/idl/advisor_marketplace/v1/MeetingStatusDto;", "status", "notes", "meeting_url", "initial_meeting_time_formatted", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/MeetingStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeeting;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeetingDto$Surrogate;", "getId", "getAdvisor_id", "getAdvisor_first_name", "getAdvisor_last_name", "getAdvisor_image_url", "getTimestamp", "()Lj$/time/Instant;", "getTimestamp_formatted", "getStatus", "()Lbonfire/proto/idl/advisor_marketplace/v1/MeetingStatusDto;", "getNotes", "getMeeting_url", "getInitial_meeting_time_formatted", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class AdvisorMeetingDto implements Dto3<AdvisorMeeting>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdvisorMeetingDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdvisorMeetingDto, AdvisorMeeting>> binaryBase64Serializer$delegate;
    private static final AdvisorMeetingDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdvisorMeetingDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdvisorMeetingDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getAdvisor_id() {
        return this.surrogate.getAdvisor_id();
    }

    public final String getAdvisor_first_name() {
        return this.surrogate.getAdvisor_first_name();
    }

    public final String getAdvisor_last_name() {
        return this.surrogate.getAdvisor_last_name();
    }

    public final String getAdvisor_image_url() {
        return this.surrogate.getAdvisor_image_url();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getTimestamp_formatted() {
        return this.surrogate.getTimestamp_formatted();
    }

    public final MeetingStatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final String getNotes() {
        return this.surrogate.getNotes();
    }

    public final String getMeeting_url() {
        return this.surrogate.getMeeting_url();
    }

    public final String getInitial_meeting_time_formatted() {
        return this.surrogate.getInitial_meeting_time_formatted();
    }

    public /* synthetic */ AdvisorMeetingDto(String str, String str2, String str3, String str4, String str5, Instant instant, String str6, MeetingStatusDto meetingStatusDto, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? MeetingStatusDto.INSTANCE.getZeroValue() : meetingStatusDto, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvisorMeetingDto(String id, String advisor_id, String advisor_first_name, String advisor_last_name, String advisor_image_url, Instant instant, String timestamp_formatted, MeetingStatusDto status, String notes, String str, String str2) {
        this(new Surrogate(id, advisor_id, advisor_first_name, advisor_last_name, advisor_image_url, instant, timestamp_formatted, status, notes, str, str2));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(advisor_id, "advisor_id");
        Intrinsics.checkNotNullParameter(advisor_first_name, "advisor_first_name");
        Intrinsics.checkNotNullParameter(advisor_last_name, "advisor_last_name");
        Intrinsics.checkNotNullParameter(advisor_image_url, "advisor_image_url");
        Intrinsics.checkNotNullParameter(timestamp_formatted, "timestamp_formatted");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(notes, "notes");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public AdvisorMeeting toProto() {
        return new AdvisorMeeting(this.surrogate.getId(), this.surrogate.getAdvisor_id(), this.surrogate.getAdvisor_first_name(), this.surrogate.getAdvisor_last_name(), this.surrogate.getAdvisor_image_url(), this.surrogate.getTimestamp(), this.surrogate.getTimestamp_formatted(), (MeetingStatus) this.surrogate.getStatus().toProto(), this.surrogate.getNotes(), this.surrogate.getMeeting_url(), this.surrogate.getInitial_meeting_time_formatted(), null, 2048, null);
    }

    public String toString() {
        return "[AdvisorMeetingDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdvisorMeetingDto) && Intrinsics.areEqual(((AdvisorMeetingDto) other).surrogate, this.surrogate);
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
    /* compiled from: AdvisorMeetingDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\b\u0083\b\u0018\u0000 H2\u00020\u0001:\u0002IHB\u009f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012.\b\u0002\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010%R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010%R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010%R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010%R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b7\u0010/\u001a\u0004\b6\u0010%RF\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00108\u0012\u0004\b;\u0010/\u001a\u0004\b9\u0010:R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010,\u0012\u0004\b=\u0010/\u001a\u0004\b<\u0010%R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010>\u0012\u0004\bA\u0010/\u001a\u0004\b?\u0010@R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010,\u0012\u0004\bC\u0010/\u001a\u0004\bB\u0010%R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010,\u0012\u0004\bE\u0010/\u001a\u0004\bD\u0010%R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010,\u0012\u0004\bG\u0010/\u001a\u0004\bF\u0010%¨\u0006J"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeetingDto$Surrogate;", "", "", "id", "advisor_id", "advisor_first_name", "advisor_last_name", "advisor_image_url", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "timestamp_formatted", "Lbonfire/proto/idl/advisor_marketplace/v1/MeetingStatusDto;", "status", "notes", "meeting_url", "initial_meeting_time_formatted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/MeetingStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/MeetingStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_advisor_marketplace_v1_externalRelease", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeetingDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getAdvisor_id", "getAdvisor_id$annotations", "getAdvisor_first_name", "getAdvisor_first_name$annotations", "getAdvisor_last_name", "getAdvisor_last_name$annotations", "getAdvisor_image_url", "getAdvisor_image_url$annotations", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "getTimestamp$annotations", "getTimestamp_formatted", "getTimestamp_formatted$annotations", "Lbonfire/proto/idl/advisor_marketplace/v1/MeetingStatusDto;", "getStatus", "()Lbonfire/proto/idl/advisor_marketplace/v1/MeetingStatusDto;", "getStatus$annotations", "getNotes", "getNotes$annotations", "getMeeting_url", "getMeeting_url$annotations", "getInitial_meeting_time_formatted", "getInitial_meeting_time_formatted$annotations", "Companion", "$serializer", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String advisor_first_name;
        private final String advisor_id;
        private final String advisor_image_url;
        private final String advisor_last_name;
        private final String id;
        private final String initial_meeting_time_formatted;
        private final String meeting_url;
        private final String notes;
        private final MeetingStatusDto status;
        private final Instant timestamp;
        private final String timestamp_formatted;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (Instant) null, (String) null, (MeetingStatusDto) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.advisor_id, surrogate.advisor_id) && Intrinsics.areEqual(this.advisor_first_name, surrogate.advisor_first_name) && Intrinsics.areEqual(this.advisor_last_name, surrogate.advisor_last_name) && Intrinsics.areEqual(this.advisor_image_url, surrogate.advisor_image_url) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.timestamp_formatted, surrogate.timestamp_formatted) && this.status == surrogate.status && Intrinsics.areEqual(this.notes, surrogate.notes) && Intrinsics.areEqual(this.meeting_url, surrogate.meeting_url) && Intrinsics.areEqual(this.initial_meeting_time_formatted, surrogate.initial_meeting_time_formatted);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.advisor_id.hashCode()) * 31) + this.advisor_first_name.hashCode()) * 31) + this.advisor_last_name.hashCode()) * 31) + this.advisor_image_url.hashCode()) * 31;
            Instant instant = this.timestamp;
            int iHashCode2 = (((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.timestamp_formatted.hashCode()) * 31) + this.status.hashCode()) * 31) + this.notes.hashCode()) * 31;
            String str = this.meeting_url;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.initial_meeting_time_formatted;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", advisor_id=" + this.advisor_id + ", advisor_first_name=" + this.advisor_first_name + ", advisor_last_name=" + this.advisor_last_name + ", advisor_image_url=" + this.advisor_image_url + ", timestamp=" + this.timestamp + ", timestamp_formatted=" + this.timestamp_formatted + ", status=" + this.status + ", notes=" + this.notes + ", meeting_url=" + this.meeting_url + ", initial_meeting_time_formatted=" + this.initial_meeting_time_formatted + ")";
        }

        /* compiled from: AdvisorMeetingDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeetingDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeetingDto$Surrogate;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdvisorMeetingDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, Instant instant, String str6, MeetingStatusDto meetingStatusDto, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.advisor_id = "";
            } else {
                this.advisor_id = str2;
            }
            if ((i & 4) == 0) {
                this.advisor_first_name = "";
            } else {
                this.advisor_first_name = str3;
            }
            if ((i & 8) == 0) {
                this.advisor_last_name = "";
            } else {
                this.advisor_last_name = str4;
            }
            if ((i & 16) == 0) {
                this.advisor_image_url = "";
            } else {
                this.advisor_image_url = str5;
            }
            if ((i & 32) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 64) == 0) {
                this.timestamp_formatted = "";
            } else {
                this.timestamp_formatted = str6;
            }
            if ((i & 128) == 0) {
                this.status = MeetingStatusDto.INSTANCE.getZeroValue();
            } else {
                this.status = meetingStatusDto;
            }
            if ((i & 256) == 0) {
                this.notes = "";
            } else {
                this.notes = str7;
            }
            if ((i & 512) == 0) {
                this.meeting_url = null;
            } else {
                this.meeting_url = str8;
            }
            if ((i & 1024) == 0) {
                this.initial_meeting_time_formatted = null;
            } else {
                this.initial_meeting_time_formatted = str9;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$bonfire_proto_idl_advisor_marketplace_v1_externalRelease */
        public static final /* synthetic */ void m730x79713acb(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.advisor_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.advisor_id);
            }
            if (!Intrinsics.areEqual(self.advisor_first_name, "")) {
                output.encodeStringElement(serialDesc, 2, self.advisor_first_name);
            }
            if (!Intrinsics.areEqual(self.advisor_last_name, "")) {
                output.encodeStringElement(serialDesc, 3, self.advisor_last_name);
            }
            if (!Intrinsics.areEqual(self.advisor_image_url, "")) {
                output.encodeStringElement(serialDesc, 4, self.advisor_image_url);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.timestamp_formatted, "")) {
                output.encodeStringElement(serialDesc, 6, self.timestamp_formatted);
            }
            if (self.status != MeetingStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, MeetingStatusDto.Serializer.INSTANCE, self.status);
            }
            if (!Intrinsics.areEqual(self.notes, "")) {
                output.encodeStringElement(serialDesc, 8, self.notes);
            }
            String str = self.meeting_url;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str);
            }
            String str2 = self.initial_meeting_time_formatted;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, str2);
            }
        }

        public Surrogate(String id, String advisor_id, String advisor_first_name, String advisor_last_name, String advisor_image_url, Instant instant, String timestamp_formatted, MeetingStatusDto status, String notes, String str, String str2) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(advisor_id, "advisor_id");
            Intrinsics.checkNotNullParameter(advisor_first_name, "advisor_first_name");
            Intrinsics.checkNotNullParameter(advisor_last_name, "advisor_last_name");
            Intrinsics.checkNotNullParameter(advisor_image_url, "advisor_image_url");
            Intrinsics.checkNotNullParameter(timestamp_formatted, "timestamp_formatted");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(notes, "notes");
            this.id = id;
            this.advisor_id = advisor_id;
            this.advisor_first_name = advisor_first_name;
            this.advisor_last_name = advisor_last_name;
            this.advisor_image_url = advisor_image_url;
            this.timestamp = instant;
            this.timestamp_formatted = timestamp_formatted;
            this.status = status;
            this.notes = notes;
            this.meeting_url = str;
            this.initial_meeting_time_formatted = str2;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, Instant instant, String str6, MeetingStatusDto meetingStatusDto, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? MeetingStatusDto.INSTANCE.getZeroValue() : meetingStatusDto, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9);
        }

        public final String getId() {
            return this.id;
        }

        public final String getAdvisor_id() {
            return this.advisor_id;
        }

        public final String getAdvisor_first_name() {
            return this.advisor_first_name;
        }

        public final String getAdvisor_last_name() {
            return this.advisor_last_name;
        }

        public final String getAdvisor_image_url() {
            return this.advisor_image_url;
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getTimestamp_formatted() {
            return this.timestamp_formatted;
        }

        public final MeetingStatusDto getStatus() {
            return this.status;
        }

        public final String getNotes() {
            return this.notes;
        }

        public final String getMeeting_url() {
            return this.meeting_url;
        }

        public final String getInitial_meeting_time_formatted() {
            return this.initial_meeting_time_formatted;
        }
    }

    /* compiled from: AdvisorMeetingDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeetingDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeetingDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeeting;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeetingDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<AdvisorMeetingDto, AdvisorMeeting> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdvisorMeetingDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisorMeetingDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisorMeetingDto> getBinaryBase64Serializer() {
            return (KSerializer) AdvisorMeetingDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdvisorMeeting> getProtoAdapter() {
            return AdvisorMeeting.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisorMeetingDto getZeroValue() {
            return AdvisorMeetingDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisorMeetingDto fromProto(AdvisorMeeting proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new AdvisorMeetingDto(new Surrogate(proto.getId(), proto.getAdvisor_id(), proto.getAdvisor_first_name(), proto.getAdvisor_last_name(), proto.getAdvisor_image_url(), proto.getTimestamp(), proto.getTimestamp_formatted(), MeetingStatusDto.INSTANCE.fromProto(proto.getStatus()), proto.getNotes(), proto.getMeeting_url(), proto.getInitial_meeting_time_formatted()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorMeetingDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisorMeetingDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AdvisorMeetingDto(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AdvisorMeetingDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeetingDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeetingDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeetingDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AdvisorMeetingDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.advisor_marketplace.v1.AdvisorMeeting", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdvisorMeetingDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdvisorMeetingDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdvisorMeetingDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AdvisorMeetingDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeetingDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.advisor_marketplace.v1.AdvisorMeetingDto";
        }
    }
}
