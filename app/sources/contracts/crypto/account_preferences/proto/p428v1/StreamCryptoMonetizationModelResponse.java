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

/* compiled from: StreamCryptoMonetizationModelResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelResponse;", "Lcom/squareup/wire/Message;", "", "monetization_model", "Lrosetta/nummus/MonetizationModel;", "ineligible_for_monetization", "", "error", "Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/nummus/MonetizationModel;ZLcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError;Lokio/ByteString;)V", "getMonetization_model", "()Lrosetta/nummus/MonetizationModel;", "getIneligible_for_monetization", "()Z", "getError", "()Lcontracts/crypto/account_preferences/proto/v1/StreamCryptoMonetizationModelError;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.account_preferences.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class StreamCryptoMonetizationModelResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamCryptoMonetizationModelResponse> ADAPTER;

    @WireField(adapter = "contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelError#ADAPTER", schemaIndex = 2, tag = 3)
    private final StreamCryptoMonetizationModelError error;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "ineligibleForMonetization", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean ineligible_for_monetization;

    @WireField(adapter = "rosetta.nummus.MonetizationModel#ADAPTER", jsonName = "monetizationModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MonetizationModel monetization_model;

    public StreamCryptoMonetizationModelResponse() {
        this(null, false, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27629newBuilder();
    }

    public final MonetizationModel getMonetization_model() {
        return this.monetization_model;
    }

    public /* synthetic */ StreamCryptoMonetizationModelResponse(MonetizationModel monetizationModel, boolean z, StreamCryptoMonetizationModelError streamCryptoMonetizationModelError, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED : monetizationModel, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : streamCryptoMonetizationModelError, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final boolean getIneligible_for_monetization() {
        return this.ineligible_for_monetization;
    }

    public final StreamCryptoMonetizationModelError getError() {
        return this.error;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamCryptoMonetizationModelResponse(MonetizationModel monetization_model, boolean z, StreamCryptoMonetizationModelError streamCryptoMonetizationModelError, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.monetization_model = monetization_model;
        this.ineligible_for_monetization = z;
        this.error = streamCryptoMonetizationModelError;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27629newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamCryptoMonetizationModelResponse)) {
            return false;
        }
        StreamCryptoMonetizationModelResponse streamCryptoMonetizationModelResponse = (StreamCryptoMonetizationModelResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamCryptoMonetizationModelResponse.unknownFields()) && this.monetization_model == streamCryptoMonetizationModelResponse.monetization_model && this.ineligible_for_monetization == streamCryptoMonetizationModelResponse.ineligible_for_monetization && Intrinsics.areEqual(this.error, streamCryptoMonetizationModelResponse.error);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.monetization_model.hashCode()) * 37) + Boolean.hashCode(this.ineligible_for_monetization)) * 37;
        StreamCryptoMonetizationModelError streamCryptoMonetizationModelError = this.error;
        int iHashCode2 = iHashCode + (streamCryptoMonetizationModelError != null ? streamCryptoMonetizationModelError.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("monetization_model=" + this.monetization_model);
        arrayList.add("ineligible_for_monetization=" + this.ineligible_for_monetization);
        StreamCryptoMonetizationModelError streamCryptoMonetizationModelError = this.error;
        if (streamCryptoMonetizationModelError != null) {
            arrayList.add("error=" + streamCryptoMonetizationModelError);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamCryptoMonetizationModelResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamCryptoMonetizationModelResponse copy$default(StreamCryptoMonetizationModelResponse streamCryptoMonetizationModelResponse, MonetizationModel monetizationModel, boolean z, StreamCryptoMonetizationModelError streamCryptoMonetizationModelError, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            monetizationModel = streamCryptoMonetizationModelResponse.monetization_model;
        }
        if ((i & 2) != 0) {
            z = streamCryptoMonetizationModelResponse.ineligible_for_monetization;
        }
        if ((i & 4) != 0) {
            streamCryptoMonetizationModelError = streamCryptoMonetizationModelResponse.error;
        }
        if ((i & 8) != 0) {
            byteString = streamCryptoMonetizationModelResponse.unknownFields();
        }
        return streamCryptoMonetizationModelResponse.copy(monetizationModel, z, streamCryptoMonetizationModelError, byteString);
    }

    public final StreamCryptoMonetizationModelResponse copy(MonetizationModel monetization_model, boolean ineligible_for_monetization, StreamCryptoMonetizationModelError error, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamCryptoMonetizationModelResponse(monetization_model, ineligible_for_monetization, error, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamCryptoMonetizationModelResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamCryptoMonetizationModelResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.account_preferences.proto.v1.StreamCryptoMonetizationModelResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamCryptoMonetizationModelResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    size += MonetizationModel.ADAPTER.encodedSizeWithTag(1, value.getMonetization_model());
                }
                if (value.getIneligible_for_monetization()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIneligible_for_monetization()));
                }
                return size + StreamCryptoMonetizationModelError.ADAPTER.encodedSizeWithTag(3, value.getError());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamCryptoMonetizationModelResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    MonetizationModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getMonetization_model());
                }
                if (value.getIneligible_for_monetization()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIneligible_for_monetization()));
                }
                StreamCryptoMonetizationModelError.ADAPTER.encodeWithTag(writer, 3, (int) value.getError());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamCryptoMonetizationModelResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                StreamCryptoMonetizationModelError.ADAPTER.encodeWithTag(writer, 3, (int) value.getError());
                if (value.getIneligible_for_monetization()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIneligible_for_monetization()));
                }
                if (value.getMonetization_model() != MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED) {
                    MonetizationModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getMonetization_model());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoMonetizationModelResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MonetizationModel monetizationModelDecode = MonetizationModel.MONETIZATION_MODEL_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                StreamCryptoMonetizationModelError streamCryptoMonetizationModelErrorDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamCryptoMonetizationModelResponse(monetizationModelDecode, zBooleanValue, streamCryptoMonetizationModelErrorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            monetizationModelDecode = MonetizationModel.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 3) {
                        streamCryptoMonetizationModelErrorDecode = StreamCryptoMonetizationModelError.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoMonetizationModelResponse redact(StreamCryptoMonetizationModelResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                StreamCryptoMonetizationModelError error = value.getError();
                return StreamCryptoMonetizationModelResponse.copy$default(value, null, false, error != null ? StreamCryptoMonetizationModelError.ADAPTER.redact(error) : null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
