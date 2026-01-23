package microgram.contracts.money_movement.form_entry.proto.p500v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: GetFormForTypeRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lmicrogram/contracts/money_movement/form_entry/proto/v1/GetFormForTypeRequest;", "Lcom/squareup/wire/Message;", "", "form_type", "Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormType;Lokio/ByteString;)V", "getForm_type", "()Lmicrogram/contracts/money_movement/form_entry/proto/v1/FormType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.contracts.money_movement.form_entry.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GetFormForTypeRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetFormForTypeRequest> ADAPTER;

    @WireField(adapter = "microgram.contracts.money_movement.form_entry.proto.v1.FormType#ADAPTER", jsonName = "formType", schemaIndex = 0, tag = 1)
    private final FormType form_type;

    /* JADX WARN: Multi-variable type inference failed */
    public GetFormForTypeRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29186newBuilder();
    }

    public final FormType getForm_type() {
        return this.form_type;
    }

    public /* synthetic */ GetFormForTypeRequest(FormType formType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : formType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFormForTypeRequest(FormType formType, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.form_type = formType;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29186newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetFormForTypeRequest)) {
            return false;
        }
        GetFormForTypeRequest getFormForTypeRequest = (GetFormForTypeRequest) other;
        return Intrinsics.areEqual(unknownFields(), getFormForTypeRequest.unknownFields()) && this.form_type == getFormForTypeRequest.form_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        FormType formType = this.form_type;
        int iHashCode2 = iHashCode + (formType != null ? formType.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        FormType formType = this.form_type;
        if (formType != null) {
            arrayList.add("form_type=" + formType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFormForTypeRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetFormForTypeRequest copy$default(GetFormForTypeRequest getFormForTypeRequest, FormType formType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            formType = getFormForTypeRequest.form_type;
        }
        if ((i & 2) != 0) {
            byteString = getFormForTypeRequest.unknownFields();
        }
        return getFormForTypeRequest.copy(formType, byteString);
    }

    public final GetFormForTypeRequest copy(FormType form_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetFormForTypeRequest(form_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetFormForTypeRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetFormForTypeRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.money_movement.form_entry.proto.v1.GetFormForTypeRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetFormForTypeRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + FormType.ADAPTER.encodedSizeWithTag(1, value.getForm_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetFormForTypeRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                FormType.ADAPTER.encodeWithTag(writer, 1, (int) value.getForm_type());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetFormForTypeRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                FormType.ADAPTER.encodeWithTag(writer, 1, (int) value.getForm_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFormForTypeRequest redact(GetFormForTypeRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetFormForTypeRequest.copy$default(value, null, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFormForTypeRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                FormType formTypeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetFormForTypeRequest(formTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            formTypeDecode = FormType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
