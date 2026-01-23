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
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamTaxLotSelectionFooterResponse;
import okio.ByteString;

/* compiled from: StreamTaxLotSelectionFooterResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001e\u001f B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J<\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse;", "Lcom/squareup/wire/Message;", "", "estimated_gain_loss_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent;", "quantity", "", "is_cta_enabled", "", "error_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$ErrorContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent;Ljava/lang/String;ZLmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$ErrorContent;Lokio/ByteString;)V", "getEstimated_gain_loss_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent;", "getQuantity", "()Ljava/lang/String;", "()Z", "getError_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$ErrorContent;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "ErrorContent", "EstimatedGainLossContent", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class StreamTaxLotSelectionFooterResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamTaxLotSelectionFooterResponse> ADAPTER;

    @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponse$ErrorContent#ADAPTER", jsonName = "errorContent", schemaIndex = 3, tag = 4)
    private final ErrorContent error_content;

    @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent#ADAPTER", jsonName = "estimatedGainLossContent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final EstimatedGainLossContent estimated_gain_loss_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isCtaEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_cta_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String quantity;

    public StreamTaxLotSelectionFooterResponse() {
        this(null, null, false, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29011newBuilder();
    }

    public final EstimatedGainLossContent getEstimated_gain_loss_content() {
        return this.estimated_gain_loss_content;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public /* synthetic */ StreamTaxLotSelectionFooterResponse(EstimatedGainLossContent estimatedGainLossContent, String str, boolean z, ErrorContent errorContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : estimatedGainLossContent, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : errorContent, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* renamed from: is_cta_enabled, reason: from getter */
    public final boolean getIs_cta_enabled() {
        return this.is_cta_enabled;
    }

    public final ErrorContent getError_content() {
        return this.error_content;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamTaxLotSelectionFooterResponse(EstimatedGainLossContent estimatedGainLossContent, String quantity, boolean z, ErrorContent errorContent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.estimated_gain_loss_content = estimatedGainLossContent;
        this.quantity = quantity;
        this.is_cta_enabled = z;
        this.error_content = errorContent;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29011newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamTaxLotSelectionFooterResponse)) {
            return false;
        }
        StreamTaxLotSelectionFooterResponse streamTaxLotSelectionFooterResponse = (StreamTaxLotSelectionFooterResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamTaxLotSelectionFooterResponse.unknownFields()) && Intrinsics.areEqual(this.estimated_gain_loss_content, streamTaxLotSelectionFooterResponse.estimated_gain_loss_content) && Intrinsics.areEqual(this.quantity, streamTaxLotSelectionFooterResponse.quantity) && this.is_cta_enabled == streamTaxLotSelectionFooterResponse.is_cta_enabled && Intrinsics.areEqual(this.error_content, streamTaxLotSelectionFooterResponse.error_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        EstimatedGainLossContent estimatedGainLossContent = this.estimated_gain_loss_content;
        int iHashCode2 = (((((iHashCode + (estimatedGainLossContent != null ? estimatedGainLossContent.hashCode() : 0)) * 37) + this.quantity.hashCode()) * 37) + Boolean.hashCode(this.is_cta_enabled)) * 37;
        ErrorContent errorContent = this.error_content;
        int iHashCode3 = iHashCode2 + (errorContent != null ? errorContent.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        EstimatedGainLossContent estimatedGainLossContent = this.estimated_gain_loss_content;
        if (estimatedGainLossContent != null) {
            arrayList.add("estimated_gain_loss_content=" + estimatedGainLossContent);
        }
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("is_cta_enabled=" + this.is_cta_enabled);
        ErrorContent errorContent = this.error_content;
        if (errorContent != null) {
            arrayList.add("error_content=" + errorContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamTaxLotSelectionFooterResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamTaxLotSelectionFooterResponse copy$default(StreamTaxLotSelectionFooterResponse streamTaxLotSelectionFooterResponse, EstimatedGainLossContent estimatedGainLossContent, String str, boolean z, ErrorContent errorContent, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            estimatedGainLossContent = streamTaxLotSelectionFooterResponse.estimated_gain_loss_content;
        }
        if ((i & 2) != 0) {
            str = streamTaxLotSelectionFooterResponse.quantity;
        }
        if ((i & 4) != 0) {
            z = streamTaxLotSelectionFooterResponse.is_cta_enabled;
        }
        if ((i & 8) != 0) {
            errorContent = streamTaxLotSelectionFooterResponse.error_content;
        }
        if ((i & 16) != 0) {
            byteString = streamTaxLotSelectionFooterResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        boolean z2 = z;
        return streamTaxLotSelectionFooterResponse.copy(estimatedGainLossContent, str, z2, errorContent, byteString2);
    }

    public final StreamTaxLotSelectionFooterResponse copy(EstimatedGainLossContent estimated_gain_loss_content, String quantity, boolean is_cta_enabled, ErrorContent error_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamTaxLotSelectionFooterResponse(estimated_gain_loss_content, quantity, is_cta_enabled, error_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamTaxLotSelectionFooterResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamTaxLotSelectionFooterResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamTaxLotSelectionFooterResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getEstimated_gain_loss_content() != null) {
                    size += StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.ADAPTER.encodedSizeWithTag(1, value.getEstimated_gain_loss_content());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getQuantity());
                }
                if (value.getIs_cta_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_cta_enabled()));
                }
                return size + StreamTaxLotSelectionFooterResponse.ErrorContent.ADAPTER.encodedSizeWithTag(4, value.getError_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamTaxLotSelectionFooterResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getEstimated_gain_loss_content() != null) {
                    StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getEstimated_gain_loss_content());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getQuantity());
                }
                if (value.getIs_cta_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_cta_enabled()));
                }
                StreamTaxLotSelectionFooterResponse.ErrorContent.ADAPTER.encodeWithTag(writer, 4, (int) value.getError_content());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamTaxLotSelectionFooterResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                StreamTaxLotSelectionFooterResponse.ErrorContent.ADAPTER.encodeWithTag(writer, 4, (int) value.getError_content());
                if (value.getIs_cta_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_cta_enabled()));
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getQuantity());
                }
                if (value.getEstimated_gain_loss_content() != null) {
                    StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getEstimated_gain_loss_content());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamTaxLotSelectionFooterResponse redact(StreamTaxLotSelectionFooterResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent estimated_gain_loss_content = value.getEstimated_gain_loss_content();
                StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent estimatedGainLossContentRedact = estimated_gain_loss_content != null ? StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.ADAPTER.redact(estimated_gain_loss_content) : null;
                StreamTaxLotSelectionFooterResponse.ErrorContent error_content = value.getError_content();
                return StreamTaxLotSelectionFooterResponse.copy$default(value, estimatedGainLossContentRedact, null, false, error_content != null ? StreamTaxLotSelectionFooterResponse.ErrorContent.ADAPTER.redact(error_content) : null, ByteString.EMPTY, 6, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamTaxLotSelectionFooterResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent estimatedGainLossContentDecode = null;
                boolean zBooleanValue = false;
                String strDecode = "";
                StreamTaxLotSelectionFooterResponse.ErrorContent errorContentDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamTaxLotSelectionFooterResponse(estimatedGainLossContentDecode, strDecode, zBooleanValue, errorContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        estimatedGainLossContentDecode = StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 4) {
                        errorContentDecode = StreamTaxLotSelectionFooterResponse.ErrorContent.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: StreamTaxLotSelectionFooterResponse.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$ErrorContent;", "Lcom/squareup/wire/Message;", "", "input_quantity_exceeds_available_quantity", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$ErrorContent$InputQuantityExceedsAvailableQuantity;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$ErrorContent$InputQuantityExceedsAvailableQuantity;Lokio/ByteString;)V", "getInput_quantity_exceeds_available_quantity", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$ErrorContent$InputQuantityExceedsAvailableQuantity;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "InputQuantityExceedsAvailableQuantity", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ErrorContent extends Message {

        @JvmField
        public static final ProtoAdapter<ErrorContent> ADAPTER;

        @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponse$ErrorContent$InputQuantityExceedsAvailableQuantity#ADAPTER", jsonName = "inputQuantityExceedsAvailableQuantity", oneofName = "type", schemaIndex = 0, tag = 1)
        private final InputQuantityExceedsAvailableQuantity input_quantity_exceeds_available_quantity;

        /* JADX WARN: Multi-variable type inference failed */
        public ErrorContent() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29012newBuilder();
        }

        public final InputQuantityExceedsAvailableQuantity getInput_quantity_exceeds_available_quantity() {
            return this.input_quantity_exceeds_available_quantity;
        }

        public /* synthetic */ ErrorContent(InputQuantityExceedsAvailableQuantity inputQuantityExceedsAvailableQuantity, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : inputQuantityExceedsAvailableQuantity, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorContent(InputQuantityExceedsAvailableQuantity inputQuantityExceedsAvailableQuantity, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.input_quantity_exceeds_available_quantity = inputQuantityExceedsAvailableQuantity;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29012newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ErrorContent)) {
                return false;
            }
            ErrorContent errorContent = (ErrorContent) other;
            return Intrinsics.areEqual(unknownFields(), errorContent.unknownFields()) && Intrinsics.areEqual(this.input_quantity_exceeds_available_quantity, errorContent.input_quantity_exceeds_available_quantity);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            InputQuantityExceedsAvailableQuantity inputQuantityExceedsAvailableQuantity = this.input_quantity_exceeds_available_quantity;
            int iHashCode2 = iHashCode + (inputQuantityExceedsAvailableQuantity != null ? inputQuantityExceedsAvailableQuantity.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            InputQuantityExceedsAvailableQuantity inputQuantityExceedsAvailableQuantity = this.input_quantity_exceeds_available_quantity;
            if (inputQuantityExceedsAvailableQuantity != null) {
                arrayList.add("input_quantity_exceeds_available_quantity=" + inputQuantityExceedsAvailableQuantity);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ErrorContent{", "}", 0, null, null, 56, null);
        }

        public final ErrorContent copy(InputQuantityExceedsAvailableQuantity input_quantity_exceeds_available_quantity, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ErrorContent(input_quantity_exceeds_available_quantity, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ErrorContent.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ErrorContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponse$ErrorContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(StreamTaxLotSelectionFooterResponse.ErrorContent value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity.ADAPTER.encodedSizeWithTag(1, value.getInput_quantity_exceeds_available_quantity());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, StreamTaxLotSelectionFooterResponse.ErrorContent value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity.ADAPTER.encodeWithTag(writer, 1, (int) value.getInput_quantity_exceeds_available_quantity());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, StreamTaxLotSelectionFooterResponse.ErrorContent value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity.ADAPTER.encodeWithTag(writer, 1, (int) value.getInput_quantity_exceeds_available_quantity());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamTaxLotSelectionFooterResponse.ErrorContent redact(StreamTaxLotSelectionFooterResponse.ErrorContent value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity input_quantity_exceeds_available_quantity = value.getInput_quantity_exceeds_available_quantity();
                    return value.copy(input_quantity_exceeds_available_quantity != null ? StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity.ADAPTER.redact(input_quantity_exceeds_available_quantity) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamTaxLotSelectionFooterResponse.ErrorContent decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity inputQuantityExceedsAvailableQuantityDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new StreamTaxLotSelectionFooterResponse.ErrorContent(inputQuantityExceedsAvailableQuantityDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            inputQuantityExceedsAvailableQuantityDecode = StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }

        /* compiled from: StreamTaxLotSelectionFooterResponse.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$ErrorContent$InputQuantityExceedsAvailableQuantity;", "Lcom/squareup/wire/Message;", "", "available_quantity", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getAvailable_quantity", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class InputQuantityExceedsAvailableQuantity extends Message {

            @JvmField
            public static final ProtoAdapter<InputQuantityExceedsAvailableQuantity> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "availableQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String available_quantity;

            /* JADX WARN: Multi-variable type inference failed */
            public InputQuantityExceedsAvailableQuantity() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29013newBuilder();
            }

            public final String getAvailable_quantity() {
                return this.available_quantity;
            }

            public /* synthetic */ InputQuantityExceedsAvailableQuantity(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InputQuantityExceedsAvailableQuantity(String available_quantity, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(available_quantity, "available_quantity");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.available_quantity = available_quantity;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29013newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof InputQuantityExceedsAvailableQuantity)) {
                    return false;
                }
                InputQuantityExceedsAvailableQuantity inputQuantityExceedsAvailableQuantity = (InputQuantityExceedsAvailableQuantity) other;
                return Intrinsics.areEqual(unknownFields(), inputQuantityExceedsAvailableQuantity.unknownFields()) && Intrinsics.areEqual(this.available_quantity, inputQuantityExceedsAvailableQuantity.available_quantity);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (unknownFields().hashCode() * 37) + this.available_quantity.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("available_quantity=" + Internal.sanitize(this.available_quantity));
                return CollectionsKt.joinToString$default(arrayList, ", ", "InputQuantityExceedsAvailableQuantity{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ InputQuantityExceedsAvailableQuantity copy$default(InputQuantityExceedsAvailableQuantity inputQuantityExceedsAvailableQuantity, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = inputQuantityExceedsAvailableQuantity.available_quantity;
                }
                if ((i & 2) != 0) {
                    byteString = inputQuantityExceedsAvailableQuantity.unknownFields();
                }
                return inputQuantityExceedsAvailableQuantity.copy(str, byteString);
            }

            public final InputQuantityExceedsAvailableQuantity copy(String available_quantity, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(available_quantity, "available_quantity");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new InputQuantityExceedsAvailableQuantity(available_quantity, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InputQuantityExceedsAvailableQuantity.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<InputQuantityExceedsAvailableQuantity>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponse$ErrorContent$InputQuantityExceedsAvailableQuantity$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        return !Intrinsics.areEqual(value.getAvailable_quantity(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAvailable_quantity()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getAvailable_quantity(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAvailable_quantity());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (Intrinsics.areEqual(value.getAvailable_quantity(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAvailable_quantity());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity redact(StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new StreamTaxLotSelectionFooterResponse.ErrorContent.InputQuantityExceedsAvailableQuantity(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                };
            }
        }
    }

    /* compiled from: StreamTaxLotSelectionFooterResponse.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u001eB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent;", "Lcom/squareup/wire/Message;", "", "estimated_gain_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedGainContent;", "estimated_loss_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedLossContent;", "text_content", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedGainContent;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedLossContent;Ljava/lang/String;Lokio/ByteString;)V", "getEstimated_gain_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedGainContent;", "getEstimated_loss_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedLossContent;", "getText_content", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "EstimatedGainContent", "EstimatedLossContent", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EstimatedGainLossContent extends Message {

        @JvmField
        public static final ProtoAdapter<EstimatedGainLossContent> ADAPTER;

        @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedGainContent#ADAPTER", jsonName = "estimatedGainContent", oneofName = "content", schemaIndex = 0, tag = 1)
        private final EstimatedGainContent estimated_gain_content;

        @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedLossContent#ADAPTER", jsonName = "estimatedLossContent", oneofName = "content", schemaIndex = 1, tag = 2)
        private final EstimatedLossContent estimated_loss_content;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "textContent", oneofName = "content", schemaIndex = 2, tag = 3)
        private final String text_content;

        public EstimatedGainLossContent() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29014newBuilder();
        }

        public final EstimatedGainContent getEstimated_gain_content() {
            return this.estimated_gain_content;
        }

        public final EstimatedLossContent getEstimated_loss_content() {
            return this.estimated_loss_content;
        }

        public final String getText_content() {
            return this.text_content;
        }

        public /* synthetic */ EstimatedGainLossContent(EstimatedGainContent estimatedGainContent, EstimatedLossContent estimatedLossContent, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : estimatedGainContent, (i & 2) != 0 ? null : estimatedLossContent, (i & 4) != 0 ? null : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EstimatedGainLossContent(EstimatedGainContent estimatedGainContent, EstimatedLossContent estimatedLossContent, String str, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.estimated_gain_content = estimatedGainContent;
            this.estimated_loss_content = estimatedLossContent;
            this.text_content = str;
            if (Internal.countNonNull(estimatedGainContent, estimatedLossContent, str) > 1) {
                throw new IllegalArgumentException("At most one of estimated_gain_content, estimated_loss_content, text_content may be non-null");
            }
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29014newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof EstimatedGainLossContent)) {
                return false;
            }
            EstimatedGainLossContent estimatedGainLossContent = (EstimatedGainLossContent) other;
            return Intrinsics.areEqual(unknownFields(), estimatedGainLossContent.unknownFields()) && Intrinsics.areEqual(this.estimated_gain_content, estimatedGainLossContent.estimated_gain_content) && Intrinsics.areEqual(this.estimated_loss_content, estimatedGainLossContent.estimated_loss_content) && Intrinsics.areEqual(this.text_content, estimatedGainLossContent.text_content);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            EstimatedGainContent estimatedGainContent = this.estimated_gain_content;
            int iHashCode2 = (iHashCode + (estimatedGainContent != null ? estimatedGainContent.hashCode() : 0)) * 37;
            EstimatedLossContent estimatedLossContent = this.estimated_loss_content;
            int iHashCode3 = (iHashCode2 + (estimatedLossContent != null ? estimatedLossContent.hashCode() : 0)) * 37;
            String str = this.text_content;
            int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
            this.hashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            EstimatedGainContent estimatedGainContent = this.estimated_gain_content;
            if (estimatedGainContent != null) {
                arrayList.add("estimated_gain_content=" + estimatedGainContent);
            }
            EstimatedLossContent estimatedLossContent = this.estimated_loss_content;
            if (estimatedLossContent != null) {
                arrayList.add("estimated_loss_content=" + estimatedLossContent);
            }
            String str = this.text_content;
            if (str != null) {
                arrayList.add("text_content=" + Internal.sanitize(str));
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EstimatedGainLossContent{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ EstimatedGainLossContent copy$default(EstimatedGainLossContent estimatedGainLossContent, EstimatedGainContent estimatedGainContent, EstimatedLossContent estimatedLossContent, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                estimatedGainContent = estimatedGainLossContent.estimated_gain_content;
            }
            if ((i & 2) != 0) {
                estimatedLossContent = estimatedGainLossContent.estimated_loss_content;
            }
            if ((i & 4) != 0) {
                str = estimatedGainLossContent.text_content;
            }
            if ((i & 8) != 0) {
                byteString = estimatedGainLossContent.unknownFields();
            }
            return estimatedGainLossContent.copy(estimatedGainContent, estimatedLossContent, str, byteString);
        }

        public final EstimatedGainLossContent copy(EstimatedGainContent estimated_gain_content, EstimatedLossContent estimated_loss_content, String text_content, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new EstimatedGainLossContent(estimated_gain_content, estimated_loss_content, text_content, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EstimatedGainLossContent.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<EstimatedGainLossContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent estimatedGainContentDecode = null;
                    StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent estimatedLossContentDecode = null;
                    String strDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent(estimatedGainContentDecode, estimatedLossContentDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            estimatedGainContentDecode = StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            estimatedLossContentDecode = StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent.ADAPTER.encodedSizeWithTag(1, value.getEstimated_gain_content()) + StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent.ADAPTER.encodedSizeWithTag(2, value.getEstimated_loss_content()) + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getText_content());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getEstimated_gain_content());
                    StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getEstimated_loss_content());
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getText_content());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getText_content());
                    StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getEstimated_loss_content());
                    StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getEstimated_gain_content());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent redact(StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent estimated_gain_content = value.getEstimated_gain_content();
                    StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent estimatedGainContentRedact = estimated_gain_content != null ? StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent.ADAPTER.redact(estimated_gain_content) : null;
                    StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent estimated_loss_content = value.getEstimated_loss_content();
                    return StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.copy$default(value, estimatedGainContentRedact, estimated_loss_content != null ? StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent.ADAPTER.redact(estimated_loss_content) : null, null, ByteString.EMPTY, 4, null);
                }
            };
        }

        /* compiled from: StreamTaxLotSelectionFooterResponse.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedGainContent;", "Lcom/squareup/wire/Message;", "", "estimated_gain_quote_amount", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getEstimated_gain_quote_amount", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class EstimatedGainContent extends Message {

            @JvmField
            public static final ProtoAdapter<EstimatedGainContent> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedGainQuoteAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String estimated_gain_quote_amount;

            /* JADX WARN: Multi-variable type inference failed */
            public EstimatedGainContent() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29015newBuilder();
            }

            public final String getEstimated_gain_quote_amount() {
                return this.estimated_gain_quote_amount;
            }

            public /* synthetic */ EstimatedGainContent(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EstimatedGainContent(String estimated_gain_quote_amount, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(estimated_gain_quote_amount, "estimated_gain_quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.estimated_gain_quote_amount = estimated_gain_quote_amount;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29015newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof EstimatedGainContent)) {
                    return false;
                }
                EstimatedGainContent estimatedGainContent = (EstimatedGainContent) other;
                return Intrinsics.areEqual(unknownFields(), estimatedGainContent.unknownFields()) && Intrinsics.areEqual(this.estimated_gain_quote_amount, estimatedGainContent.estimated_gain_quote_amount);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (unknownFields().hashCode() * 37) + this.estimated_gain_quote_amount.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("estimated_gain_quote_amount=" + Internal.sanitize(this.estimated_gain_quote_amount));
                return CollectionsKt.joinToString$default(arrayList, ", ", "EstimatedGainContent{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ EstimatedGainContent copy$default(EstimatedGainContent estimatedGainContent, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = estimatedGainContent.estimated_gain_quote_amount;
                }
                if ((i & 2) != 0) {
                    byteString = estimatedGainContent.unknownFields();
                }
                return estimatedGainContent.copy(str, byteString);
            }

            public final EstimatedGainContent copy(String estimated_gain_quote_amount, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(estimated_gain_quote_amount, "estimated_gain_quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new EstimatedGainContent(estimated_gain_quote_amount, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EstimatedGainContent.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<EstimatedGainContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedGainContent$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        return !Intrinsics.areEqual(value.getEstimated_gain_quote_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEstimated_gain_quote_amount()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getEstimated_gain_quote_amount(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEstimated_gain_quote_amount());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (Intrinsics.areEqual(value.getEstimated_gain_quote_amount(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEstimated_gain_quote_amount());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent redact(StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedGainContent.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }
                };
            }
        }

        /* compiled from: StreamTaxLotSelectionFooterResponse.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedLossContent;", "Lcom/squareup/wire/Message;", "", "estimated_loss_quote_amount", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getEstimated_loss_quote_amount", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class EstimatedLossContent extends Message {

            @JvmField
            public static final ProtoAdapter<EstimatedLossContent> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedLossQuoteAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String estimated_loss_quote_amount;

            /* JADX WARN: Multi-variable type inference failed */
            public EstimatedLossContent() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m29016newBuilder();
            }

            public final String getEstimated_loss_quote_amount() {
                return this.estimated_loss_quote_amount;
            }

            public /* synthetic */ EstimatedLossContent(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EstimatedLossContent(String estimated_loss_quote_amount, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(estimated_loss_quote_amount, "estimated_loss_quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.estimated_loss_quote_amount = estimated_loss_quote_amount;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m29016newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof EstimatedLossContent)) {
                    return false;
                }
                EstimatedLossContent estimatedLossContent = (EstimatedLossContent) other;
                return Intrinsics.areEqual(unknownFields(), estimatedLossContent.unknownFields()) && Intrinsics.areEqual(this.estimated_loss_quote_amount, estimatedLossContent.estimated_loss_quote_amount);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (unknownFields().hashCode() * 37) + this.estimated_loss_quote_amount.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("estimated_loss_quote_amount=" + Internal.sanitize(this.estimated_loss_quote_amount));
                return CollectionsKt.joinToString$default(arrayList, ", ", "EstimatedLossContent{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ EstimatedLossContent copy$default(EstimatedLossContent estimatedLossContent, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = estimatedLossContent.estimated_loss_quote_amount;
                }
                if ((i & 2) != 0) {
                    byteString = estimatedLossContent.unknownFields();
                }
                return estimatedLossContent.copy(str, byteString);
            }

            public final EstimatedLossContent copy(String estimated_loss_quote_amount, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(estimated_loss_quote_amount, "estimated_loss_quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new EstimatedLossContent(estimated_loss_quote_amount, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EstimatedLossContent.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<EstimatedLossContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotSelectionFooterResponse$EstimatedGainLossContent$EstimatedLossContent$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        return !Intrinsics.areEqual(value.getEstimated_loss_quote_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEstimated_loss_quote_amount()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getEstimated_loss_quote_amount(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEstimated_loss_quote_amount());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (Intrinsics.areEqual(value.getEstimated_loss_quote_amount(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEstimated_loss_quote_amount());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent redact(StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return StreamTaxLotSelectionFooterResponse.EstimatedGainLossContent.EstimatedLossContent.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }
                };
            }
        }
    }
}
