package contracts.crypto.account_preferences.proto.p428v1;

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
import rosetta.nummus.MonetizationModel;

/* compiled from: UpdateCryptoMonetizationModelRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/UpdateCryptoMonetizationModelRequest;", "Lcom/squareup/wire/Message;", "", "monetization_model", "Lrosetta/nummus/MonetizationModel;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/nummus/MonetizationModel;Lokio/ByteString;)V", "getMonetization_model", "()Lrosetta/nummus/MonetizationModel;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class UpdateCryptoMonetizationModelRequest extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateCryptoMonetizationModelRequest> ADAPTER;

    @WireField(adapter = "rosetta.nummus.MonetizationModel#ADAPTER", jsonName = "monetizationModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MonetizationModel monetization_model;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateCryptoMonetizationModelRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27635newBuilder();
    }

    public final MonetizationModel getMonetization_model() {
        return this.monetization_model;
    }

    public /* synthetic */ UpdateCryptoMonetizationModelRequest(MonetizationModel monetizationModel, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED : monetizationModel, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateCryptoMonetizationModelRequest(MonetizationModel monetization_model, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.monetization_model = monetization_model;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27635newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateCryptoMonetizationModelRequest)) {
            return false;
        }
        UpdateCryptoMonetizationModelRequest updateCryptoMonetizationModelRequest = (UpdateCryptoMonetizationModelRequest) other;
        return Intrinsics.areEqual(unknownFields(), updateCryptoMonetizationModelRequest.unknownFields()) && this.monetization_model == updateCryptoMonetizationModelRequest.monetization_model;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.monetization_model.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("monetization_model=" + this.monetization_model);
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateCryptoMonetizationModelRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UpdateCryptoMonetizationModelRequest copy$default(UpdateCryptoMonetizationModelRequest updateCryptoMonetizationModelRequest, MonetizationModel monetizationModel, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            monetizationModel = updateCryptoMonetizationModelRequest.monetization_model;
        }
        if ((i & 2) != 0) {
            byteString = updateCryptoMonetizationModelRequest.unknownFields();
        }
        return updateCryptoMonetizationModelRequest.copy(monetizationModel, byteString);
    }

    public final UpdateCryptoMonetizationModelRequest copy(MonetizationModel monetization_model, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateCryptoMonetizationModelRequest(monetization_model, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateCryptoMonetizationModelRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateCryptoMonetizationModelRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.account_preferences.proto.v1.UpdateCryptoMonetizationModelRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateCryptoMonetizationModelRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED ? size + MonetizationModel.ADAPTER.encodedSizeWithTag(1, value.getMonetization_model()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateCryptoMonetizationModelRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    MonetizationModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getMonetization_model());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateCryptoMonetizationModelRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    MonetizationModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getMonetization_model());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UpdateCryptoMonetizationModelRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MonetizationModel monetizationModelDecode = MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UpdateCryptoMonetizationModelRequest(monetizationModelDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            monetizationModelDecode = MonetizationModel.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateCryptoMonetizationModelRequest redact(UpdateCryptoMonetizationModelRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UpdateCryptoMonetizationModelRequest.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
