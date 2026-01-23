package bonfire.proto.idl.advisor_marketplace.p029v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: AdvisorMeeting.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B\u008b\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J\u0091\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010!R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b&\u0010!R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b'\u0010!R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b(\u0010!R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b)\u0010!R\"\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b-\u0010!R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b1\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b2\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b3\u0010!¨\u00065"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeeting;", "Lcom/squareup/wire/Message;", "", "", "id", "advisor_id", "advisor_first_name", "advisor_last_name", "advisor_image_url", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "timestamp_formatted", "Lbonfire/proto/idl/advisor_marketplace/v1/MeetingStatus;", "status", "notes", "meeting_url", "initial_meeting_time_formatted", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/MeetingStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/MeetingStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeeting;", "Ljava/lang/String;", "getId", "getAdvisor_id", "getAdvisor_first_name", "getAdvisor_last_name", "getAdvisor_image_url", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "getTimestamp_formatted", "Lbonfire/proto/idl/advisor_marketplace/v1/MeetingStatus;", "getStatus", "()Lbonfire/proto/idl/advisor_marketplace/v1/MeetingStatus;", "getNotes", "getMeeting_url", "getInitial_meeting_time_formatted", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AdvisorMeeting extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisorMeeting> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "advisorFirstName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String advisor_first_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "advisorId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String advisor_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "advisorImageUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String advisor_image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "advisorLastName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String advisor_last_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "initialMeetingTimeFormatted", schemaIndex = 10, tag = 11)
    private final String initial_meeting_time_formatted;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "meetingUrl", schemaIndex = 9, tag = 10)
    private final String meeting_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String notes;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.MeetingStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final MeetingStatus status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Instant timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "timestampFormatted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String timestamp_formatted;

    public AdvisorMeeting() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public /* synthetic */ AdvisorMeeting(String str, String str2, String str3, String str4, String str5, Instant instant, String str6, MeetingStatus meetingStatus, String str7, String str8, String str9, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? MeetingStatus.MEETING_STATUS_UNSPECIFIED : meetingStatus, (i & 256) == 0 ? str7 : "", (i & 512) != 0 ? null : str8, (i & 1024) == 0 ? str9 : null, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8766newBuilder();
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

    public final MeetingStatus getStatus() {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisorMeeting(String id, String advisor_id, String advisor_first_name, String advisor_last_name, String advisor_image_url, Instant instant, String timestamp_formatted, MeetingStatus status, String notes, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(advisor_id, "advisor_id");
        Intrinsics.checkNotNullParameter(advisor_first_name, "advisor_first_name");
        Intrinsics.checkNotNullParameter(advisor_last_name, "advisor_last_name");
        Intrinsics.checkNotNullParameter(advisor_image_url, "advisor_image_url");
        Intrinsics.checkNotNullParameter(timestamp_formatted, "timestamp_formatted");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(notes, "notes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
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

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8766newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisorMeeting)) {
            return false;
        }
        AdvisorMeeting advisorMeeting = (AdvisorMeeting) other;
        return Intrinsics.areEqual(unknownFields(), advisorMeeting.unknownFields()) && Intrinsics.areEqual(this.id, advisorMeeting.id) && Intrinsics.areEqual(this.advisor_id, advisorMeeting.advisor_id) && Intrinsics.areEqual(this.advisor_first_name, advisorMeeting.advisor_first_name) && Intrinsics.areEqual(this.advisor_last_name, advisorMeeting.advisor_last_name) && Intrinsics.areEqual(this.advisor_image_url, advisorMeeting.advisor_image_url) && Intrinsics.areEqual(this.timestamp, advisorMeeting.timestamp) && Intrinsics.areEqual(this.timestamp_formatted, advisorMeeting.timestamp_formatted) && this.status == advisorMeeting.status && Intrinsics.areEqual(this.notes, advisorMeeting.notes) && Intrinsics.areEqual(this.meeting_url, advisorMeeting.meeting_url) && Intrinsics.areEqual(this.initial_meeting_time_formatted, advisorMeeting.initial_meeting_time_formatted);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.advisor_id.hashCode()) * 37) + this.advisor_first_name.hashCode()) * 37) + this.advisor_last_name.hashCode()) * 37) + this.advisor_image_url.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.timestamp_formatted.hashCode()) * 37) + this.status.hashCode()) * 37) + this.notes.hashCode()) * 37;
        String str = this.meeting_url;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.initial_meeting_time_formatted;
        int iHashCode4 = iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("advisor_id=" + Internal.sanitize(this.advisor_id));
        arrayList.add("advisor_first_name=" + Internal.sanitize(this.advisor_first_name));
        arrayList.add("advisor_last_name=" + Internal.sanitize(this.advisor_last_name));
        arrayList.add("advisor_image_url=" + Internal.sanitize(this.advisor_image_url));
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("timestamp_formatted=" + Internal.sanitize(this.timestamp_formatted));
        arrayList.add("status=" + this.status);
        arrayList.add("notes=" + Internal.sanitize(this.notes));
        String str = this.meeting_url;
        if (str != null) {
            arrayList.add("meeting_url=" + Internal.sanitize(str));
        }
        String str2 = this.initial_meeting_time_formatted;
        if (str2 != null) {
            arrayList.add("initial_meeting_time_formatted=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisorMeeting{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisorMeeting copy$default(AdvisorMeeting advisorMeeting, String str, String str2, String str3, String str4, String str5, Instant instant, String str6, MeetingStatus meetingStatus, String str7, String str8, String str9, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisorMeeting.id;
        }
        if ((i & 2) != 0) {
            str2 = advisorMeeting.advisor_id;
        }
        if ((i & 4) != 0) {
            str3 = advisorMeeting.advisor_first_name;
        }
        if ((i & 8) != 0) {
            str4 = advisorMeeting.advisor_last_name;
        }
        if ((i & 16) != 0) {
            str5 = advisorMeeting.advisor_image_url;
        }
        if ((i & 32) != 0) {
            instant = advisorMeeting.timestamp;
        }
        if ((i & 64) != 0) {
            str6 = advisorMeeting.timestamp_formatted;
        }
        if ((i & 128) != 0) {
            meetingStatus = advisorMeeting.status;
        }
        if ((i & 256) != 0) {
            str7 = advisorMeeting.notes;
        }
        if ((i & 512) != 0) {
            str8 = advisorMeeting.meeting_url;
        }
        if ((i & 1024) != 0) {
            str9 = advisorMeeting.initial_meeting_time_formatted;
        }
        if ((i & 2048) != 0) {
            byteString = advisorMeeting.unknownFields();
        }
        String str10 = str9;
        ByteString byteString2 = byteString;
        String str11 = str7;
        String str12 = str8;
        String str13 = str6;
        MeetingStatus meetingStatus2 = meetingStatus;
        String str14 = str5;
        Instant instant2 = instant;
        return advisorMeeting.copy(str, str2, str3, str4, str14, instant2, str13, meetingStatus2, str11, str12, str10, byteString2);
    }

    public final AdvisorMeeting copy(String id, String advisor_id, String advisor_first_name, String advisor_last_name, String advisor_image_url, Instant timestamp, String timestamp_formatted, MeetingStatus status, String notes, String meeting_url, String initial_meeting_time_formatted, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(advisor_id, "advisor_id");
        Intrinsics.checkNotNullParameter(advisor_first_name, "advisor_first_name");
        Intrinsics.checkNotNullParameter(advisor_last_name, "advisor_last_name");
        Intrinsics.checkNotNullParameter(advisor_image_url, "advisor_image_url");
        Intrinsics.checkNotNullParameter(timestamp_formatted, "timestamp_formatted");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(notes, "notes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisorMeeting(id, advisor_id, advisor_first_name, advisor_last_name, advisor_image_url, timestamp, timestamp_formatted, status, notes, meeting_url, initial_meeting_time_formatted, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisorMeeting.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisorMeeting>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorMeeting$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisorMeeting value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getAdvisor_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAdvisor_id());
                }
                if (!Intrinsics.areEqual(value.getAdvisor_first_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAdvisor_first_name());
                }
                if (!Intrinsics.areEqual(value.getAdvisor_last_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAdvisor_last_name());
                }
                if (!Intrinsics.areEqual(value.getAdvisor_image_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAdvisor_image_url());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getTimestamp_formatted(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getTimestamp_formatted());
                }
                if (value.getStatus() != MeetingStatus.MEETING_STATUS_UNSPECIFIED) {
                    size += MeetingStatus.ADAPTER.encodedSizeWithTag(8, value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getNotes(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getNotes());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(10, value.getMeeting_url()) + protoAdapter.encodedSizeWithTag(11, value.getInitial_meeting_time_formatted());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisorMeeting value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getAdvisor_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAdvisor_id());
                }
                if (!Intrinsics.areEqual(value.getAdvisor_first_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAdvisor_first_name());
                }
                if (!Intrinsics.areEqual(value.getAdvisor_last_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAdvisor_last_name());
                }
                if (!Intrinsics.areEqual(value.getAdvisor_image_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAdvisor_image_url());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getTimestamp_formatted(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getTimestamp_formatted());
                }
                if (value.getStatus() != MeetingStatus.MEETING_STATUS_UNSPECIFIED) {
                    MeetingStatus.ADAPTER.encodeWithTag(writer, 8, (int) value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getNotes(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getNotes());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 10, (int) value.getMeeting_url());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getInitial_meeting_time_formatted());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisorMeeting value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 11, (int) value.getInitial_meeting_time_formatted());
                protoAdapter.encodeWithTag(writer, 10, (int) value.getMeeting_url());
                if (!Intrinsics.areEqual(value.getNotes(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getNotes());
                }
                if (value.getStatus() != MeetingStatus.MEETING_STATUS_UNSPECIFIED) {
                    MeetingStatus.ADAPTER.encodeWithTag(writer, 8, (int) value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getTimestamp_formatted(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getTimestamp_formatted());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getAdvisor_image_url(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getAdvisor_image_url());
                }
                if (!Intrinsics.areEqual(value.getAdvisor_last_name(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getAdvisor_last_name());
                }
                if (!Intrinsics.areEqual(value.getAdvisor_first_name(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getAdvisor_first_name());
                }
                if (!Intrinsics.areEqual(value.getAdvisor_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getAdvisor_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorMeeting decode(ProtoReader reader) throws IOException {
                MeetingStatus meetingStatus;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                MeetingStatus meetingStatus2 = MeetingStatus.MEETING_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                Instant instantDecode = null;
                String strDecode7 = null;
                String strDecode8 = null;
                MeetingStatus meetingStatusDecode = meetingStatus2;
                String strDecode9 = strDecode6;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 7:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                try {
                                    meetingStatusDecode = MeetingStatus.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    meetingStatus = meetingStatusDecode;
                                    str = strDecode9;
                                    str2 = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 9:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 11:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                meetingStatus = meetingStatusDecode;
                                str = strDecode9;
                                str2 = strDecode;
                                break;
                        }
                        meetingStatusDecode = meetingStatus;
                        strDecode9 = str;
                        strDecode = str2;
                    } else {
                        return new AdvisorMeeting(strDecode9, strDecode, strDecode2, strDecode3, strDecode4, instantDecode, strDecode5, meetingStatusDecode, strDecode6, strDecode7, strDecode8, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorMeeting redact(AdvisorMeeting value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return AdvisorMeeting.copy$default(value, null, null, null, null, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, null, null, ByteString.EMPTY, 2015, null);
            }
        };
    }
}
