package microgram.contracts.isa_transfer_funds.proto.p495v1;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
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

/* compiled from: StreamPersonalInfoResponse.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponse;", "Lcom/squareup/wire/Message;", "", "full_name", "", GovernmentIdNfcScan.dateOfBirthName, "national_insurance_number", PlaceTypes.ADDRESS, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getFull_name", "()Ljava/lang/String;", "getDate_of_birth", "getNational_insurance_number", "getAddress", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.isa_transfer_funds.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class StreamPersonalInfoResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamPersonalInfoResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dateOfBirth", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String date_of_birth;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fullName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String full_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nationalInsuranceNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String national_insurance_number;

    public StreamPersonalInfoResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ StreamPersonalInfoResponse(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29137newBuilder();
    }

    public final String getFull_name() {
        return this.full_name;
    }

    public final String getDate_of_birth() {
        return this.date_of_birth;
    }

    public final String getNational_insurance_number() {
        return this.national_insurance_number;
    }

    public final String getAddress() {
        return this.address;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamPersonalInfoResponse(String full_name, String date_of_birth, String national_insurance_number, String address, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(full_name, "full_name");
        Intrinsics.checkNotNullParameter(date_of_birth, "date_of_birth");
        Intrinsics.checkNotNullParameter(national_insurance_number, "national_insurance_number");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.full_name = full_name;
        this.date_of_birth = date_of_birth;
        this.national_insurance_number = national_insurance_number;
        this.address = address;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29137newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamPersonalInfoResponse)) {
            return false;
        }
        StreamPersonalInfoResponse streamPersonalInfoResponse = (StreamPersonalInfoResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamPersonalInfoResponse.unknownFields()) && Intrinsics.areEqual(this.full_name, streamPersonalInfoResponse.full_name) && Intrinsics.areEqual(this.date_of_birth, streamPersonalInfoResponse.date_of_birth) && Intrinsics.areEqual(this.national_insurance_number, streamPersonalInfoResponse.national_insurance_number) && Intrinsics.areEqual(this.address, streamPersonalInfoResponse.address);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.full_name.hashCode()) * 37) + this.date_of_birth.hashCode()) * 37) + this.national_insurance_number.hashCode()) * 37) + this.address.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("full_name=" + Internal.sanitize(this.full_name));
        arrayList.add("date_of_birth=" + Internal.sanitize(this.date_of_birth));
        arrayList.add("national_insurance_number=" + Internal.sanitize(this.national_insurance_number));
        arrayList.add("address=" + Internal.sanitize(this.address));
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamPersonalInfoResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamPersonalInfoResponse copy$default(StreamPersonalInfoResponse streamPersonalInfoResponse, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamPersonalInfoResponse.full_name;
        }
        if ((i & 2) != 0) {
            str2 = streamPersonalInfoResponse.date_of_birth;
        }
        if ((i & 4) != 0) {
            str3 = streamPersonalInfoResponse.national_insurance_number;
        }
        if ((i & 8) != 0) {
            str4 = streamPersonalInfoResponse.address;
        }
        if ((i & 16) != 0) {
            byteString = streamPersonalInfoResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return streamPersonalInfoResponse.copy(str, str2, str5, str4, byteString2);
    }

    public final StreamPersonalInfoResponse copy(String full_name, String date_of_birth, String national_insurance_number, String address, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(full_name, "full_name");
        Intrinsics.checkNotNullParameter(date_of_birth, "date_of_birth");
        Intrinsics.checkNotNullParameter(national_insurance_number, "national_insurance_number");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamPersonalInfoResponse(full_name, date_of_birth, national_insurance_number, address, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamPersonalInfoResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamPersonalInfoResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.isa_transfer_funds.proto.v1.StreamPersonalInfoResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamPersonalInfoResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getFull_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getFull_name());
                }
                if (!Intrinsics.areEqual(value.getDate_of_birth(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDate_of_birth());
                }
                if (!Intrinsics.areEqual(value.getNational_insurance_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getNational_insurance_number());
                }
                return !Intrinsics.areEqual(value.getAddress(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAddress()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamPersonalInfoResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getFull_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFull_name());
                }
                if (!Intrinsics.areEqual(value.getDate_of_birth(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDate_of_birth());
                }
                if (!Intrinsics.areEqual(value.getNational_insurance_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNational_insurance_number());
                }
                if (!Intrinsics.areEqual(value.getAddress(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAddress());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamPersonalInfoResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAddress(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAddress());
                }
                if (!Intrinsics.areEqual(value.getNational_insurance_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNational_insurance_number());
                }
                if (!Intrinsics.areEqual(value.getDate_of_birth(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDate_of_birth());
                }
                if (Intrinsics.areEqual(value.getFull_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFull_name());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamPersonalInfoResponse redact(StreamPersonalInfoResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return StreamPersonalInfoResponse.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamPersonalInfoResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamPersonalInfoResponse(strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
