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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetMeetingsHubResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B1\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J0\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/GetMeetingsHubResponse;", "Lcom/squareup/wire/Message;", "", "upcoming_meetings", "", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorMeeting;", "past_meetings", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getUpcoming_meetings", "()Ljava/util/List;", "getPast_meetings", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetMeetingsHubResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetMeetingsHubResponse> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorMeeting#ADAPTER", jsonName = "pastMeetings", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<AdvisorMeeting> past_meetings;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorMeeting#ADAPTER", jsonName = "upcomingMeetings", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<AdvisorMeeting> upcoming_meetings;

    public GetMeetingsHubResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8783newBuilder();
    }

    public /* synthetic */ GetMeetingsHubResponse(List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMeetingsHubResponse(List<AdvisorMeeting> upcoming_meetings, List<AdvisorMeeting> past_meetings, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(upcoming_meetings, "upcoming_meetings");
        Intrinsics.checkNotNullParameter(past_meetings, "past_meetings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.upcoming_meetings = Internal.immutableCopyOf("upcoming_meetings", upcoming_meetings);
        this.past_meetings = Internal.immutableCopyOf("past_meetings", past_meetings);
    }

    public final List<AdvisorMeeting> getUpcoming_meetings() {
        return this.upcoming_meetings;
    }

    public final List<AdvisorMeeting> getPast_meetings() {
        return this.past_meetings;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8783newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetMeetingsHubResponse)) {
            return false;
        }
        GetMeetingsHubResponse getMeetingsHubResponse = (GetMeetingsHubResponse) other;
        return Intrinsics.areEqual(unknownFields(), getMeetingsHubResponse.unknownFields()) && Intrinsics.areEqual(this.upcoming_meetings, getMeetingsHubResponse.upcoming_meetings) && Intrinsics.areEqual(this.past_meetings, getMeetingsHubResponse.past_meetings);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.upcoming_meetings.hashCode()) * 37) + this.past_meetings.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.upcoming_meetings.isEmpty()) {
            arrayList.add("upcoming_meetings=" + this.upcoming_meetings);
        }
        if (!this.past_meetings.isEmpty()) {
            arrayList.add("past_meetings=" + this.past_meetings);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMeetingsHubResponse{", "}", 0, null, null, 56, null);
    }

    public final GetMeetingsHubResponse copy(List<AdvisorMeeting> upcoming_meetings, List<AdvisorMeeting> past_meetings, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(upcoming_meetings, "upcoming_meetings");
        Intrinsics.checkNotNullParameter(past_meetings, "past_meetings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetMeetingsHubResponse(upcoming_meetings, past_meetings, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetMeetingsHubResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetMeetingsHubResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.advisor_marketplace.v1.GetMeetingsHubResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetMeetingsHubResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<AdvisorMeeting> protoAdapter = AdvisorMeeting.ADAPTER;
                return size + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getUpcoming_meetings()) + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getPast_meetings());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetMeetingsHubResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<AdvisorMeeting> protoAdapter = AdvisorMeeting.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getUpcoming_meetings());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getPast_meetings());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetMeetingsHubResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<AdvisorMeeting> protoAdapter = AdvisorMeeting.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getPast_meetings());
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getUpcoming_meetings());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetMeetingsHubResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetMeetingsHubResponse(arrayList, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(AdvisorMeeting.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        arrayList2.add(AdvisorMeeting.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetMeetingsHubResponse redact(GetMeetingsHubResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<AdvisorMeeting> upcoming_meetings = value.getUpcoming_meetings();
                ProtoAdapter<AdvisorMeeting> protoAdapter = AdvisorMeeting.ADAPTER;
                return value.copy(Internal.m26823redactElements(upcoming_meetings, protoAdapter), Internal.m26823redactElements(value.getPast_meetings(), protoAdapter), ByteString.EMPTY);
            }
        };
    }
}
