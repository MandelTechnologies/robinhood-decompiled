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

/* compiled from: UpdateCryptoMonetizationModelResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/UpdateCryptoMonetizationModelResponse;", "Lcom/squareup/wire/Message;", "", "monetization_model", "Lrosetta/nummus/MonetizationModel;", "error", "Lcontracts/crypto/account_preferences/proto/v1/UpdateCryptoMonetizationModelError;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/nummus/MonetizationModel;Lcontracts/crypto/account_preferences/proto/v1/UpdateCryptoMonetizationModelError;Lokio/ByteString;)V", "getMonetization_model", "()Lrosetta/nummus/MonetizationModel;", "getError", "()Lcontracts/crypto/account_preferences/proto/v1/UpdateCryptoMonetizationModelError;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class UpdateCryptoMonetizationModelResponse extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateCryptoMonetizationModelResponse> ADAPTER;

    @WireField(adapter = "contracts.crypto.account_preferences.proto.v1.UpdateCryptoMonetizationModelError#ADAPTER", schemaIndex = 1, tag = 2)
    private final UpdateCryptoMonetizationModelError error;

    @WireField(adapter = "rosetta.nummus.MonetizationModel#ADAPTER", jsonName = "monetizationModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MonetizationModel monetization_model;

    public UpdateCryptoMonetizationModelResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27636newBuilder();
    }

    public final MonetizationModel getMonetization_model() {
        return this.monetization_model;
    }

    public /* synthetic */ UpdateCryptoMonetizationModelResponse(MonetizationModel monetizationModel, UpdateCryptoMonetizationModelError updateCryptoMonetizationModelError, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED : monetizationModel, (i & 2) != 0 ? null : updateCryptoMonetizationModelError, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final UpdateCryptoMonetizationModelError getError() {
        return this.error;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateCryptoMonetizationModelResponse(MonetizationModel monetization_model, UpdateCryptoMonetizationModelError updateCryptoMonetizationModelError, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.monetization_model = monetization_model;
        this.error = updateCryptoMonetizationModelError;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27636newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateCryptoMonetizationModelResponse)) {
            return false;
        }
        UpdateCryptoMonetizationModelResponse updateCryptoMonetizationModelResponse = (UpdateCryptoMonetizationModelResponse) other;
        return Intrinsics.areEqual(unknownFields(), updateCryptoMonetizationModelResponse.unknownFields()) && this.monetization_model == updateCryptoMonetizationModelResponse.monetization_model && Intrinsics.areEqual(this.error, updateCryptoMonetizationModelResponse.error);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.monetization_model.hashCode()) * 37;
        UpdateCryptoMonetizationModelError updateCryptoMonetizationModelError = this.error;
        int iHashCode2 = iHashCode + (updateCryptoMonetizationModelError != null ? updateCryptoMonetizationModelError.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("monetization_model=" + this.monetization_model);
        UpdateCryptoMonetizationModelError updateCryptoMonetizationModelError = this.error;
        if (updateCryptoMonetizationModelError != null) {
            arrayList.add("error=" + updateCryptoMonetizationModelError);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateCryptoMonetizationModelResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UpdateCryptoMonetizationModelResponse copy$default(UpdateCryptoMonetizationModelResponse updateCryptoMonetizationModelResponse, MonetizationModel monetizationModel, UpdateCryptoMonetizationModelError updateCryptoMonetizationModelError, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            monetizationModel = updateCryptoMonetizationModelResponse.monetization_model;
        }
        if ((i & 2) != 0) {
            updateCryptoMonetizationModelError = updateCryptoMonetizationModelResponse.error;
        }
        if ((i & 4) != 0) {
            byteString = updateCryptoMonetizationModelResponse.unknownFields();
        }
        return updateCryptoMonetizationModelResponse.copy(monetizationModel, updateCryptoMonetizationModelError, byteString);
    }

    public final UpdateCryptoMonetizationModelResponse copy(MonetizationModel monetization_model, UpdateCryptoMonetizationModelError error, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateCryptoMonetizationModelResponse(monetization_model, error, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateCryptoMonetizationModelResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateCryptoMonetizationModelResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.account_preferences.proto.v1.UpdateCryptoMonetizationModelResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateCryptoMonetizationModelResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    size += MonetizationModel.ADAPTER.encodedSizeWithTag(1, value.getMonetization_model());
                }
                return size + UpdateCryptoMonetizationModelError.ADAPTER.encodedSizeWithTag(2, value.getError());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateCryptoMonetizationModelResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    MonetizationModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getMonetization_model());
                }
                UpdateCryptoMonetizationModelError.ADAPTER.encodeWithTag(writer, 2, (int) value.getError());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateCryptoMonetizationModelResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                UpdateCryptoMonetizationModelError.ADAPTER.encodeWithTag(writer, 2, (int) value.getError());
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    MonetizationModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getMonetization_model());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UpdateCryptoMonetizationModelResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MonetizationModel monetizationModelDecode = MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                UpdateCryptoMonetizationModelError updateCryptoMonetizationModelErrorDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UpdateCryptoMonetizationModelResponse(monetizationModelDecode, updateCryptoMonetizationModelErrorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            monetizationModelDecode = MonetizationModel.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        updateCryptoMonetizationModelErrorDecode = UpdateCryptoMonetizationModelError.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateCryptoMonetizationModelResponse redact(UpdateCryptoMonetizationModelResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UpdateCryptoMonetizationModelError error = value.getError();
                return UpdateCryptoMonetizationModelResponse.copy$default(value, null, error != null ? UpdateCryptoMonetizationModelError.ADAPTER.redact(error) : null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
