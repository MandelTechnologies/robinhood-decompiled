package options_product.service;

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

/* compiled from: GetAppointmentDataResponse.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J<\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Loptions_product/service/GetAppointmentDataResponse;", "Lcom/squareup/wire/Message;", "", "is_new", "", "campaign_id", "", "chat_inquiry_id", "appointment_id", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "()Z", "getCampaign_id", "()Ljava/lang/String;", "getChat_inquiry_id", "getAppointment_id", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class GetAppointmentDataResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAppointmentDataResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "appointmentId", schemaIndex = 3, tag = 4)
    private final String appointment_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "campaignId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String campaign_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chatInquiryId", schemaIndex = 2, tag = 3)
    private final String chat_inquiry_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isNew", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_new;

    public GetAppointmentDataResponse() {
        this(false, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29490newBuilder();
    }

    /* renamed from: is_new, reason: from getter */
    public final boolean getIs_new() {
        return this.is_new;
    }

    public final String getCampaign_id() {
        return this.campaign_id;
    }

    public /* synthetic */ GetAppointmentDataResponse(boolean z, String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getChat_inquiry_id() {
        return this.chat_inquiry_id;
    }

    public final String getAppointment_id() {
        return this.appointment_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAppointmentDataResponse(boolean z, String campaign_id, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_new = z;
        this.campaign_id = campaign_id;
        this.chat_inquiry_id = str;
        this.appointment_id = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29490newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAppointmentDataResponse)) {
            return false;
        }
        GetAppointmentDataResponse getAppointmentDataResponse = (GetAppointmentDataResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAppointmentDataResponse.unknownFields()) && this.is_new == getAppointmentDataResponse.is_new && Intrinsics.areEqual(this.campaign_id, getAppointmentDataResponse.campaign_id) && Intrinsics.areEqual(this.chat_inquiry_id, getAppointmentDataResponse.chat_inquiry_id) && Intrinsics.areEqual(this.appointment_id, getAppointmentDataResponse.appointment_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_new)) * 37) + this.campaign_id.hashCode()) * 37;
        String str = this.chat_inquiry_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.appointment_id;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_new=" + this.is_new);
        arrayList.add("campaign_id=" + Internal.sanitize(this.campaign_id));
        String str = this.chat_inquiry_id;
        if (str != null) {
            arrayList.add("chat_inquiry_id=" + Internal.sanitize(str));
        }
        String str2 = this.appointment_id;
        if (str2 != null) {
            arrayList.add("appointment_id=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAppointmentDataResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAppointmentDataResponse copy$default(GetAppointmentDataResponse getAppointmentDataResponse, boolean z, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getAppointmentDataResponse.is_new;
        }
        if ((i & 2) != 0) {
            str = getAppointmentDataResponse.campaign_id;
        }
        if ((i & 4) != 0) {
            str2 = getAppointmentDataResponse.chat_inquiry_id;
        }
        if ((i & 8) != 0) {
            str3 = getAppointmentDataResponse.appointment_id;
        }
        if ((i & 16) != 0) {
            byteString = getAppointmentDataResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str2;
        return getAppointmentDataResponse.copy(z, str, str4, str3, byteString2);
    }

    public final GetAppointmentDataResponse copy(boolean is_new, String campaign_id, String chat_inquiry_id, String appointment_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(campaign_id, "campaign_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAppointmentDataResponse(is_new, campaign_id, chat_inquiry_id, appointment_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAppointmentDataResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAppointmentDataResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.GetAppointmentDataResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAppointmentDataResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIs_new()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_new()));
                }
                if (!Intrinsics.areEqual(value.getCampaign_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCampaign_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(3, value.getChat_inquiry_id()) + protoAdapter.encodedSizeWithTag(4, value.getAppointment_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAppointmentDataResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_new()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_new()));
                }
                if (!Intrinsics.areEqual(value.getCampaign_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCampaign_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getChat_inquiry_id());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getAppointment_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAppointmentDataResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getAppointment_id());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getChat_inquiry_id());
                if (!Intrinsics.areEqual(value.getCampaign_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getCampaign_id());
                }
                if (value.getIs_new()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_new()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAppointmentDataResponse redact(GetAppointmentDataResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAppointmentDataResponse.copy$default(value, false, null, null, null, ByteString.EMPTY, 15, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAppointmentDataResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                boolean zBooleanValue = false;
                String strDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAppointmentDataResponse(zBooleanValue, strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
