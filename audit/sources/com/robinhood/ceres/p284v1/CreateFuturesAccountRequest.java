package com.robinhood.ceres.p284v1;

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

/* compiled from: CreateFuturesAccountRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountRequest;", "Lcom/squareup/wire/Message;", "", "user_uuid", "", "rhs_account_number", "allow_swaps_only_account_creation", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "getUser_uuid", "()Ljava/lang/String;", "getRhs_account_number", "getAllow_swaps_only_account_creation", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class CreateFuturesAccountRequest extends Message {

    @JvmField
    public static final ProtoAdapter<CreateFuturesAccountRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "allowSwapsOnlyAccountCreation", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean allow_swaps_only_account_creation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String rhs_account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userUuid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String user_uuid;

    public CreateFuturesAccountRequest() {
        this(null, null, false, null, 15, null);
    }

    public /* synthetic */ CreateFuturesAccountRequest(String str, String str2, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20286newBuilder();
    }

    public final String getUser_uuid() {
        return this.user_uuid;
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    public final boolean getAllow_swaps_only_account_creation() {
        return this.allow_swaps_only_account_creation;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFuturesAccountRequest(String user_uuid, String rhs_account_number, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.user_uuid = user_uuid;
        this.rhs_account_number = rhs_account_number;
        this.allow_swaps_only_account_creation = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20286newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateFuturesAccountRequest)) {
            return false;
        }
        CreateFuturesAccountRequest createFuturesAccountRequest = (CreateFuturesAccountRequest) other;
        return Intrinsics.areEqual(unknownFields(), createFuturesAccountRequest.unknownFields()) && Intrinsics.areEqual(this.user_uuid, createFuturesAccountRequest.user_uuid) && Intrinsics.areEqual(this.rhs_account_number, createFuturesAccountRequest.rhs_account_number) && this.allow_swaps_only_account_creation == createFuturesAccountRequest.allow_swaps_only_account_creation;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.user_uuid.hashCode()) * 37) + this.rhs_account_number.hashCode()) * 37) + Boolean.hashCode(this.allow_swaps_only_account_creation);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("user_uuid=" + Internal.sanitize(this.user_uuid));
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        arrayList.add("allow_swaps_only_account_creation=" + this.allow_swaps_only_account_creation);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateFuturesAccountRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateFuturesAccountRequest copy$default(CreateFuturesAccountRequest createFuturesAccountRequest, String str, String str2, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createFuturesAccountRequest.user_uuid;
        }
        if ((i & 2) != 0) {
            str2 = createFuturesAccountRequest.rhs_account_number;
        }
        if ((i & 4) != 0) {
            z = createFuturesAccountRequest.allow_swaps_only_account_creation;
        }
        if ((i & 8) != 0) {
            byteString = createFuturesAccountRequest.unknownFields();
        }
        return createFuturesAccountRequest.copy(str, str2, z, byteString);
    }

    public final CreateFuturesAccountRequest copy(String user_uuid, String rhs_account_number, boolean allow_swaps_only_account_creation, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateFuturesAccountRequest(user_uuid, rhs_account_number, allow_swaps_only_account_creation, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateFuturesAccountRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateFuturesAccountRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.CreateFuturesAccountRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateFuturesAccountRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUser_uuid());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRhs_account_number());
                }
                return value.getAllow_swaps_only_account_creation() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getAllow_swaps_only_account_creation())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateFuturesAccountRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_uuid());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRhs_account_number());
                }
                if (value.getAllow_swaps_only_account_creation()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getAllow_swaps_only_account_creation()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateFuturesAccountRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAllow_swaps_only_account_creation()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getAllow_swaps_only_account_creation()));
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRhs_account_number());
                }
                if (Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_uuid());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateFuturesAccountRequest redact(CreateFuturesAccountRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CreateFuturesAccountRequest.copy$default(value, null, null, false, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreateFuturesAccountRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CreateFuturesAccountRequest(strDecode, strDecode2, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
