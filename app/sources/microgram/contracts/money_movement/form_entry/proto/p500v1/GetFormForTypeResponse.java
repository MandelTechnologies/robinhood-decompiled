package microgram.contracts.money_movement.form_entry.proto.p500v1;

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

/* compiled from: GetFormForTypeResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetFormForTypeResponse;", "Lcom/squareup/wire/Message;", "", "header", "", "sub_heading", "inputs", "", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormInput;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getHeader", "()Ljava/lang/String;", "getSub_heading", "getInputs", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GetFormForTypeResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetFormForTypeResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String header;

    @WireField(adapter = "microgram.contracts.money_movement.form_entry.proto.v1.FormInput#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<FormInput> inputs;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subHeading", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String sub_heading;

    public GetFormForTypeResponse() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ GetFormForTypeResponse(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29188newBuilder();
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getSub_heading() {
        return this.sub_heading;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFormForTypeResponse(String header, String sub_heading, List<FormInput> inputs, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(sub_heading, "sub_heading");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.header = header;
        this.sub_heading = sub_heading;
        this.inputs = Internal.immutableCopyOf("inputs", inputs);
    }

    public final List<FormInput> getInputs() {
        return this.inputs;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29188newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetFormForTypeResponse)) {
            return false;
        }
        GetFormForTypeResponse getFormForTypeResponse = (GetFormForTypeResponse) other;
        return Intrinsics.areEqual(unknownFields(), getFormForTypeResponse.unknownFields()) && Intrinsics.areEqual(this.header, getFormForTypeResponse.header) && Intrinsics.areEqual(this.sub_heading, getFormForTypeResponse.sub_heading) && Intrinsics.areEqual(this.inputs, getFormForTypeResponse.inputs);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.header.hashCode()) * 37) + this.sub_heading.hashCode()) * 37) + this.inputs.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("header=" + Internal.sanitize(this.header));
        arrayList.add("sub_heading=" + Internal.sanitize(this.sub_heading));
        if (!this.inputs.isEmpty()) {
            arrayList.add("inputs=" + this.inputs);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFormForTypeResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetFormForTypeResponse copy$default(GetFormForTypeResponse getFormForTypeResponse, String str, String str2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getFormForTypeResponse.header;
        }
        if ((i & 2) != 0) {
            str2 = getFormForTypeResponse.sub_heading;
        }
        if ((i & 4) != 0) {
            list = getFormForTypeResponse.inputs;
        }
        if ((i & 8) != 0) {
            byteString = getFormForTypeResponse.unknownFields();
        }
        return getFormForTypeResponse.copy(str, str2, list, byteString);
    }

    public final GetFormForTypeResponse copy(String header, String sub_heading, List<FormInput> inputs, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(sub_heading, "sub_heading");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetFormForTypeResponse(header, sub_heading, inputs, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetFormForTypeResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetFormForTypeResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.money_movement.form_entry.proto.v1.GetFormForTypeResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetFormForTypeResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getHeader(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHeader());
                }
                if (!Intrinsics.areEqual(value.getSub_heading(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSub_heading());
                }
                return size + FormInput.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getInputs());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetFormForTypeResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getHeader(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeader());
                }
                if (!Intrinsics.areEqual(value.getSub_heading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSub_heading());
                }
                FormInput.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getInputs());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetFormForTypeResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                FormInput.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getInputs());
                if (!Intrinsics.areEqual(value.getSub_heading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSub_heading());
                }
                if (Intrinsics.areEqual(value.getHeader(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeader());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFormForTypeResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetFormForTypeResponse(strDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(FormInput.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFormForTypeResponse redact(GetFormForTypeResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetFormForTypeResponse.copy$default(value, null, null, Internal.m26823redactElements(value.getInputs(), FormInput.ADAPTER), ByteString.EMPTY, 3, null);
            }
        };
    }
}
