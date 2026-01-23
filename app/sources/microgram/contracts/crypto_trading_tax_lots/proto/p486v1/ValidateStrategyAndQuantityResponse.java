package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

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
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.ValidateStrategyAndQuantityResponse;
import okio.ByteString;

/* compiled from: ValidateStrategyAndQuantityResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0015\u0016\u0017B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ValidateStrategyAndQuantityResponse;", "Lcom/squareup/wire/Message;", "", "error", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ValidateStrategyAndQuantityResponse$Error;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ValidateStrategyAndQuantityResponse$Error;Lokio/ByteString;)V", "getError", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ValidateStrategyAndQuantityResponse$Error;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Error", "InputsResultInMaxLotsExceeded", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ValidateStrategyAndQuantityResponse extends Message {

    @JvmField
    public static final ProtoAdapter<ValidateStrategyAndQuantityResponse> ADAPTER;

    @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.ValidateStrategyAndQuantityResponse$Error#ADAPTER", schemaIndex = 0, tag = 1)
    private final Error error;

    /* JADX WARN: Multi-variable type inference failed */
    public ValidateStrategyAndQuantityResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29061newBuilder();
    }

    public final Error getError() {
        return this.error;
    }

    public /* synthetic */ ValidateStrategyAndQuantityResponse(Error error, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : error, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateStrategyAndQuantityResponse(Error error, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.error = error;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29061newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ValidateStrategyAndQuantityResponse)) {
            return false;
        }
        ValidateStrategyAndQuantityResponse validateStrategyAndQuantityResponse = (ValidateStrategyAndQuantityResponse) other;
        return Intrinsics.areEqual(unknownFields(), validateStrategyAndQuantityResponse.unknownFields()) && Intrinsics.areEqual(this.error, validateStrategyAndQuantityResponse.error);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Error error = this.error;
        int iHashCode2 = iHashCode + (error != null ? error.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Error error = this.error;
        if (error != null) {
            arrayList.add("error=" + error);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidateStrategyAndQuantityResponse{", "}", 0, null, null, 56, null);
    }

    public final ValidateStrategyAndQuantityResponse copy(Error error, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ValidateStrategyAndQuantityResponse(error, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValidateStrategyAndQuantityResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ValidateStrategyAndQuantityResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.ValidateStrategyAndQuantityResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ValidateStrategyAndQuantityResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ValidateStrategyAndQuantityResponse.Error.ADAPTER.encodedSizeWithTag(1, value.getError());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ValidateStrategyAndQuantityResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ValidateStrategyAndQuantityResponse.Error.ADAPTER.encodeWithTag(writer, 1, (int) value.getError());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ValidateStrategyAndQuantityResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ValidateStrategyAndQuantityResponse.Error.ADAPTER.encodeWithTag(writer, 1, (int) value.getError());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValidateStrategyAndQuantityResponse redact(ValidateStrategyAndQuantityResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ValidateStrategyAndQuantityResponse.Error error = value.getError();
                return value.copy(error != null ? ValidateStrategyAndQuantityResponse.Error.ADAPTER.redact(error) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValidateStrategyAndQuantityResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ValidateStrategyAndQuantityResponse.Error errorDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ValidateStrategyAndQuantityResponse(errorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        errorDecode = ValidateStrategyAndQuantityResponse.Error.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: ValidateStrategyAndQuantityResponse.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ValidateStrategyAndQuantityResponse$Error;", "Lcom/squareup/wire/Message;", "", "inputs_result_in_max_lots_exceeded", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ValidateStrategyAndQuantityResponse$InputsResultInMaxLotsExceeded;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ValidateStrategyAndQuantityResponse$InputsResultInMaxLotsExceeded;Lokio/ByteString;)V", "getInputs_result_in_max_lots_exceeded", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ValidateStrategyAndQuantityResponse$InputsResultInMaxLotsExceeded;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends Message {

        @JvmField
        public static final ProtoAdapter<Error> ADAPTER;

        @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.ValidateStrategyAndQuantityResponse$InputsResultInMaxLotsExceeded#ADAPTER", jsonName = "inputsResultInMaxLotsExceeded", oneofName = "type", schemaIndex = 0, tag = 1)
        private final InputsResultInMaxLotsExceeded inputs_result_in_max_lots_exceeded;

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29062newBuilder();
        }

        public final InputsResultInMaxLotsExceeded getInputs_result_in_max_lots_exceeded() {
            return this.inputs_result_in_max_lots_exceeded;
        }

        public /* synthetic */ Error(InputsResultInMaxLotsExceeded inputsResultInMaxLotsExceeded, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : inputsResultInMaxLotsExceeded, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(InputsResultInMaxLotsExceeded inputsResultInMaxLotsExceeded, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.inputs_result_in_max_lots_exceeded = inputsResultInMaxLotsExceeded;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29062newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(unknownFields(), error.unknownFields()) && Intrinsics.areEqual(this.inputs_result_in_max_lots_exceeded, error.inputs_result_in_max_lots_exceeded);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            InputsResultInMaxLotsExceeded inputsResultInMaxLotsExceeded = this.inputs_result_in_max_lots_exceeded;
            int iHashCode2 = iHashCode + (inputsResultInMaxLotsExceeded != null ? inputsResultInMaxLotsExceeded.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            InputsResultInMaxLotsExceeded inputsResultInMaxLotsExceeded = this.inputs_result_in_max_lots_exceeded;
            if (inputsResultInMaxLotsExceeded != null) {
                arrayList.add("inputs_result_in_max_lots_exceeded=" + inputsResultInMaxLotsExceeded);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Error{", "}", 0, null, null, 56, null);
        }

        public final Error copy(InputsResultInMaxLotsExceeded inputs_result_in_max_lots_exceeded, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Error(inputs_result_in_max_lots_exceeded, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Error.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Error>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.ValidateStrategyAndQuantityResponse$Error$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ValidateStrategyAndQuantityResponse.Error value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + ValidateStrategyAndQuantityResponse.InputsResultInMaxLotsExceeded.ADAPTER.encodedSizeWithTag(1, value.getInputs_result_in_max_lots_exceeded());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ValidateStrategyAndQuantityResponse.Error value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ValidateStrategyAndQuantityResponse.InputsResultInMaxLotsExceeded.ADAPTER.encodeWithTag(writer, 1, (int) value.getInputs_result_in_max_lots_exceeded());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ValidateStrategyAndQuantityResponse.Error value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ValidateStrategyAndQuantityResponse.InputsResultInMaxLotsExceeded.ADAPTER.encodeWithTag(writer, 1, (int) value.getInputs_result_in_max_lots_exceeded());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ValidateStrategyAndQuantityResponse.Error redact(ValidateStrategyAndQuantityResponse.Error value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    ValidateStrategyAndQuantityResponse.InputsResultInMaxLotsExceeded inputs_result_in_max_lots_exceeded = value.getInputs_result_in_max_lots_exceeded();
                    return value.copy(inputs_result_in_max_lots_exceeded != null ? ValidateStrategyAndQuantityResponse.InputsResultInMaxLotsExceeded.ADAPTER.redact(inputs_result_in_max_lots_exceeded) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ValidateStrategyAndQuantityResponse.Error decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    ValidateStrategyAndQuantityResponse.InputsResultInMaxLotsExceeded inputsResultInMaxLotsExceededDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ValidateStrategyAndQuantityResponse.Error(inputsResultInMaxLotsExceededDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            inputsResultInMaxLotsExceededDecode = ValidateStrategyAndQuantityResponse.InputsResultInMaxLotsExceeded.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }

    /* compiled from: ValidateStrategyAndQuantityResponse.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/ValidateStrategyAndQuantityResponse$InputsResultInMaxLotsExceeded;", "Lcom/squareup/wire/Message;", "", "maximum_quantity", "", "maximum_lots", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ILokio/ByteString;)V", "getMaximum_quantity", "()Ljava/lang/String;", "getMaximum_lots", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InputsResultInMaxLotsExceeded extends Message {

        @JvmField
        public static final ProtoAdapter<InputsResultInMaxLotsExceeded> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "maximumLots", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final int maximum_lots;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maximumQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String maximum_quantity;

        public InputsResultInMaxLotsExceeded() {
            this(null, 0, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29063newBuilder();
        }

        public final String getMaximum_quantity() {
            return this.maximum_quantity;
        }

        public /* synthetic */ InputsResultInMaxLotsExceeded(String str, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public final int getMaximum_lots() {
            return this.maximum_lots;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InputsResultInMaxLotsExceeded(String maximum_quantity, int i, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(maximum_quantity, "maximum_quantity");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.maximum_quantity = maximum_quantity;
            this.maximum_lots = i;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29063newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof InputsResultInMaxLotsExceeded)) {
                return false;
            }
            InputsResultInMaxLotsExceeded inputsResultInMaxLotsExceeded = (InputsResultInMaxLotsExceeded) other;
            return Intrinsics.areEqual(unknownFields(), inputsResultInMaxLotsExceeded.unknownFields()) && Intrinsics.areEqual(this.maximum_quantity, inputsResultInMaxLotsExceeded.maximum_quantity) && this.maximum_lots == inputsResultInMaxLotsExceeded.maximum_lots;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.maximum_quantity.hashCode()) * 37) + Integer.hashCode(this.maximum_lots);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("maximum_quantity=" + Internal.sanitize(this.maximum_quantity));
            arrayList.add("maximum_lots=" + this.maximum_lots);
            return CollectionsKt.joinToString$default(arrayList, ", ", "InputsResultInMaxLotsExceeded{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ InputsResultInMaxLotsExceeded copy$default(InputsResultInMaxLotsExceeded inputsResultInMaxLotsExceeded, String str, int i, ByteString byteString, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = inputsResultInMaxLotsExceeded.maximum_quantity;
            }
            if ((i2 & 2) != 0) {
                i = inputsResultInMaxLotsExceeded.maximum_lots;
            }
            if ((i2 & 4) != 0) {
                byteString = inputsResultInMaxLotsExceeded.unknownFields();
            }
            return inputsResultInMaxLotsExceeded.copy(str, i, byteString);
        }

        public final InputsResultInMaxLotsExceeded copy(String maximum_quantity, int maximum_lots, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(maximum_quantity, "maximum_quantity");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new InputsResultInMaxLotsExceeded(maximum_quantity, maximum_lots, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InputsResultInMaxLotsExceeded.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<InputsResultInMaxLotsExceeded>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.ValidateStrategyAndQuantityResponse$InputsResultInMaxLotsExceeded$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ValidateStrategyAndQuantityResponse.InputsResultInMaxLotsExceeded value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getMaximum_quantity(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getMaximum_quantity());
                    }
                    return value.getMaximum_lots() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getMaximum_lots())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ValidateStrategyAndQuantityResponse.InputsResultInMaxLotsExceeded value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getMaximum_quantity(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMaximum_quantity());
                    }
                    if (value.getMaximum_lots() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getMaximum_lots()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ValidateStrategyAndQuantityResponse.InputsResultInMaxLotsExceeded value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getMaximum_lots() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getMaximum_lots()));
                    }
                    if (Intrinsics.areEqual(value.getMaximum_quantity(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMaximum_quantity());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ValidateStrategyAndQuantityResponse.InputsResultInMaxLotsExceeded redact(ValidateStrategyAndQuantityResponse.InputsResultInMaxLotsExceeded value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return ValidateStrategyAndQuantityResponse.InputsResultInMaxLotsExceeded.copy$default(value, null, 0, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ValidateStrategyAndQuantityResponse.InputsResultInMaxLotsExceeded decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    int iIntValue = 0;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ValidateStrategyAndQuantityResponse.InputsResultInMaxLotsExceeded(strDecode, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
