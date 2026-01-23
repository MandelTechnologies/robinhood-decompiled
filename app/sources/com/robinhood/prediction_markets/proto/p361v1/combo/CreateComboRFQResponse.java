package com.robinhood.prediction_markets.proto.p361v1.combo;

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

/* compiled from: CreateComboRFQResponse.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/CreateComboRFQResponse;", "Lcom/squareup/wire/Message;", "", "rfq_id", "", "combo_instrument_id", "proposal_polling_duration_ms", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILokio/ByteString;)V", "getRfq_id", "()Ljava/lang/String;", "getCombo_instrument_id", "getProposal_polling_duration_ms", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CreateComboRFQResponse extends Message {

    @JvmField
    public static final ProtoAdapter<CreateComboRFQResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "comboInstrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String combo_instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "proposalPollingDurationMs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int proposal_polling_duration_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rfqId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String rfq_id;

    public CreateComboRFQResponse() {
        this(null, null, 0, null, 15, null);
    }

    public /* synthetic */ CreateComboRFQResponse(String str, String str2, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23758newBuilder();
    }

    public final String getRfq_id() {
        return this.rfq_id;
    }

    public final String getCombo_instrument_id() {
        return this.combo_instrument_id;
    }

    public final int getProposal_polling_duration_ms() {
        return this.proposal_polling_duration_ms;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateComboRFQResponse(String rfq_id, String combo_instrument_id, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rfq_id, "rfq_id");
        Intrinsics.checkNotNullParameter(combo_instrument_id, "combo_instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.rfq_id = rfq_id;
        this.combo_instrument_id = combo_instrument_id;
        this.proposal_polling_duration_ms = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23758newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateComboRFQResponse)) {
            return false;
        }
        CreateComboRFQResponse createComboRFQResponse = (CreateComboRFQResponse) other;
        return Intrinsics.areEqual(unknownFields(), createComboRFQResponse.unknownFields()) && Intrinsics.areEqual(this.rfq_id, createComboRFQResponse.rfq_id) && Intrinsics.areEqual(this.combo_instrument_id, createComboRFQResponse.combo_instrument_id) && this.proposal_polling_duration_ms == createComboRFQResponse.proposal_polling_duration_ms;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.rfq_id.hashCode()) * 37) + this.combo_instrument_id.hashCode()) * 37) + Integer.hashCode(this.proposal_polling_duration_ms);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("rfq_id=" + Internal.sanitize(this.rfq_id));
        arrayList.add("combo_instrument_id=" + Internal.sanitize(this.combo_instrument_id));
        arrayList.add("proposal_polling_duration_ms=" + this.proposal_polling_duration_ms);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateComboRFQResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateComboRFQResponse copy$default(CreateComboRFQResponse createComboRFQResponse, String str, String str2, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = createComboRFQResponse.rfq_id;
        }
        if ((i2 & 2) != 0) {
            str2 = createComboRFQResponse.combo_instrument_id;
        }
        if ((i2 & 4) != 0) {
            i = createComboRFQResponse.proposal_polling_duration_ms;
        }
        if ((i2 & 8) != 0) {
            byteString = createComboRFQResponse.unknownFields();
        }
        return createComboRFQResponse.copy(str, str2, i, byteString);
    }

    public final CreateComboRFQResponse copy(String rfq_id, String combo_instrument_id, int proposal_polling_duration_ms, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rfq_id, "rfq_id");
        Intrinsics.checkNotNullParameter(combo_instrument_id, "combo_instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateComboRFQResponse(rfq_id, combo_instrument_id, proposal_polling_duration_ms, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateComboRFQResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateComboRFQResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.combo.CreateComboRFQResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateComboRFQResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRfq_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRfq_id());
                }
                if (!Intrinsics.areEqual(value.getCombo_instrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCombo_instrument_id());
                }
                return value.getProposal_polling_duration_ms() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getProposal_polling_duration_ms())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateComboRFQResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRfq_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRfq_id());
                }
                if (!Intrinsics.areEqual(value.getCombo_instrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCombo_instrument_id());
                }
                if (value.getProposal_polling_duration_ms() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getProposal_polling_duration_ms()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateComboRFQResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getProposal_polling_duration_ms() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getProposal_polling_duration_ms()));
                }
                if (!Intrinsics.areEqual(value.getCombo_instrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCombo_instrument_id());
                }
                if (Intrinsics.areEqual(value.getRfq_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRfq_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateComboRFQResponse redact(CreateComboRFQResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CreateComboRFQResponse.copy$default(value, null, null, 0, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreateComboRFQResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CreateComboRFQResponse(strDecode, strDecode2, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
