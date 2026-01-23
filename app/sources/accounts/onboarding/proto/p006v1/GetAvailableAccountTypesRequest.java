package accounts.onboarding.proto.p006v1;

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
import rosetta.account.ManagementType;

/* compiled from: GetAvailableAccountTypesRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Laccounts/onboarding/proto/v1/GetAvailableAccountTypesRequest;", "Lcom/squareup/wire/Message;", "", "management_type", "Lrosetta/account/ManagementType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/account/ManagementType;Lokio/ByteString;)V", "getManagement_type", "()Lrosetta/account/ManagementType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetAvailableAccountTypesRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetAvailableAccountTypesRequest> ADAPTER;

    @WireField(adapter = "rosetta.account.ManagementType#ADAPTER", jsonName = "managementType", schemaIndex = 0, tag = 1)
    private final ManagementType management_type;

    /* JADX WARN: Multi-variable type inference failed */
    public GetAvailableAccountTypesRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4346newBuilder();
    }

    public final ManagementType getManagement_type() {
        return this.management_type;
    }

    public /* synthetic */ GetAvailableAccountTypesRequest(ManagementType managementType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : managementType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAvailableAccountTypesRequest(ManagementType managementType, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.management_type = managementType;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4346newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAvailableAccountTypesRequest)) {
            return false;
        }
        GetAvailableAccountTypesRequest getAvailableAccountTypesRequest = (GetAvailableAccountTypesRequest) other;
        return Intrinsics.areEqual(unknownFields(), getAvailableAccountTypesRequest.unknownFields()) && this.management_type == getAvailableAccountTypesRequest.management_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ManagementType managementType = this.management_type;
        int iHashCode2 = iHashCode + (managementType != null ? managementType.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ManagementType managementType = this.management_type;
        if (managementType != null) {
            arrayList.add("management_type=" + managementType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAvailableAccountTypesRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAvailableAccountTypesRequest copy$default(GetAvailableAccountTypesRequest getAvailableAccountTypesRequest, ManagementType managementType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            managementType = getAvailableAccountTypesRequest.management_type;
        }
        if ((i & 2) != 0) {
            byteString = getAvailableAccountTypesRequest.unknownFields();
        }
        return getAvailableAccountTypesRequest.copy(managementType, byteString);
    }

    public final GetAvailableAccountTypesRequest copy(ManagementType management_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAvailableAccountTypesRequest(management_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAvailableAccountTypesRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAvailableAccountTypesRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: accounts.onboarding.proto.v1.GetAvailableAccountTypesRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAvailableAccountTypesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ManagementType.ADAPTER.encodedSizeWithTag(1, value.getManagement_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAvailableAccountTypesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ManagementType.ADAPTER.encodeWithTag(writer, 1, (int) value.getManagement_type());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAvailableAccountTypesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ManagementType.ADAPTER.encodeWithTag(writer, 1, (int) value.getManagement_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAvailableAccountTypesRequest redact(GetAvailableAccountTypesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAvailableAccountTypesRequest.copy$default(value, null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAvailableAccountTypesRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ManagementType managementTypeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAvailableAccountTypesRequest(managementTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            managementTypeDecode = ManagementType.ADAPTER.decode(reader);
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
