package bff_money_movement.service.p019v1;

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

/* compiled from: GetCryptoBillDetailsResponse.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016JJ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, m3636d2 = {"Lbff_money_movement/service/v1/GetCryptoBillDetailsResponse;", "Lcom/squareup/wire/Message;", "", "state", "Lbff_money_movement/service/v1/BillState;", "dcf_metadata", "Lbff_money_movement/service/v1/DCFMetaData;", "success", "Lbff_money_movement/service/v1/CryptoMetaData;", "error", "Lbff_money_movement/service/v1/BillError;", "error_alert", "Lbff_money_movement/service/v1/Alert;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_money_movement/service/v1/BillState;Lbff_money_movement/service/v1/DCFMetaData;Lbff_money_movement/service/v1/CryptoMetaData;Lbff_money_movement/service/v1/BillError;Lbff_money_movement/service/v1/Alert;Lokio/ByteString;)V", "getState", "()Lbff_money_movement/service/v1/BillState;", "getDcf_metadata", "()Lbff_money_movement/service/v1/DCFMetaData;", "getSuccess", "()Lbff_money_movement/service/v1/CryptoMetaData;", "getError", "()Lbff_money_movement/service/v1/BillError;", "getError_alert", "()Lbff_money_movement/service/v1/Alert;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetCryptoBillDetailsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetCryptoBillDetailsResponse> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.DCFMetaData#ADAPTER", jsonName = "dcfMetadata", oneofName = "interruption_metadata", schemaIndex = 1, tag = 2)
    private final DCFMetaData dcf_metadata;

    @WireField(adapter = "bff_money_movement.service.v1.BillError#ADAPTER", oneofName = "result", schemaIndex = 3, tag = 12)
    private final BillError error;

    @WireField(adapter = "bff_money_movement.service.v1.Alert#ADAPTER", jsonName = "errorAlert", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 13)
    private final Alert error_alert;

    @WireField(adapter = "bff_money_movement.service.v1.BillState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BillState state;

    @WireField(adapter = "bff_money_movement.service.v1.CryptoMetaData#ADAPTER", oneofName = "result", schemaIndex = 2, tag = 11)
    private final CryptoMetaData success;

    public GetCryptoBillDetailsResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8421newBuilder();
    }

    public final BillState getState() {
        return this.state;
    }

    public /* synthetic */ GetCryptoBillDetailsResponse(BillState billState, DCFMetaData dCFMetaData, CryptoMetaData cryptoMetaData, BillError billError, Alert alert, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BillState.BILL_STATE_UNSPECIFIED : billState, (i & 2) != 0 ? null : dCFMetaData, (i & 4) != 0 ? null : cryptoMetaData, (i & 8) != 0 ? null : billError, (i & 16) != 0 ? null : alert, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final DCFMetaData getDcf_metadata() {
        return this.dcf_metadata;
    }

    public final CryptoMetaData getSuccess() {
        return this.success;
    }

    public final BillError getError() {
        return this.error;
    }

    public final Alert getError_alert() {
        return this.error_alert;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCryptoBillDetailsResponse(BillState state, DCFMetaData dCFMetaData, CryptoMetaData cryptoMetaData, BillError billError, Alert alert, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.state = state;
        this.dcf_metadata = dCFMetaData;
        this.success = cryptoMetaData;
        this.error = billError;
        this.error_alert = alert;
        if (Internal.countNonNull(cryptoMetaData, billError) > 1) {
            throw new IllegalArgumentException("At most one of success, error may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8421newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCryptoBillDetailsResponse)) {
            return false;
        }
        GetCryptoBillDetailsResponse getCryptoBillDetailsResponse = (GetCryptoBillDetailsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getCryptoBillDetailsResponse.unknownFields()) && this.state == getCryptoBillDetailsResponse.state && Intrinsics.areEqual(this.dcf_metadata, getCryptoBillDetailsResponse.dcf_metadata) && Intrinsics.areEqual(this.success, getCryptoBillDetailsResponse.success) && this.error == getCryptoBillDetailsResponse.error && Intrinsics.areEqual(this.error_alert, getCryptoBillDetailsResponse.error_alert);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.state.hashCode()) * 37;
        DCFMetaData dCFMetaData = this.dcf_metadata;
        int iHashCode2 = (iHashCode + (dCFMetaData != null ? dCFMetaData.hashCode() : 0)) * 37;
        CryptoMetaData cryptoMetaData = this.success;
        int iHashCode3 = (iHashCode2 + (cryptoMetaData != null ? cryptoMetaData.hashCode() : 0)) * 37;
        BillError billError = this.error;
        int iHashCode4 = (iHashCode3 + (billError != null ? billError.hashCode() : 0)) * 37;
        Alert alert = this.error_alert;
        int iHashCode5 = iHashCode4 + (alert != null ? alert.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("state=" + this.state);
        DCFMetaData dCFMetaData = this.dcf_metadata;
        if (dCFMetaData != null) {
            arrayList.add("dcf_metadata=" + dCFMetaData);
        }
        CryptoMetaData cryptoMetaData = this.success;
        if (cryptoMetaData != null) {
            arrayList.add("success=" + cryptoMetaData);
        }
        BillError billError = this.error;
        if (billError != null) {
            arrayList.add("error=" + billError);
        }
        Alert alert = this.error_alert;
        if (alert != null) {
            arrayList.add("error_alert=" + alert);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCryptoBillDetailsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetCryptoBillDetailsResponse copy$default(GetCryptoBillDetailsResponse getCryptoBillDetailsResponse, BillState billState, DCFMetaData dCFMetaData, CryptoMetaData cryptoMetaData, BillError billError, Alert alert, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            billState = getCryptoBillDetailsResponse.state;
        }
        if ((i & 2) != 0) {
            dCFMetaData = getCryptoBillDetailsResponse.dcf_metadata;
        }
        if ((i & 4) != 0) {
            cryptoMetaData = getCryptoBillDetailsResponse.success;
        }
        if ((i & 8) != 0) {
            billError = getCryptoBillDetailsResponse.error;
        }
        if ((i & 16) != 0) {
            alert = getCryptoBillDetailsResponse.error_alert;
        }
        if ((i & 32) != 0) {
            byteString = getCryptoBillDetailsResponse.unknownFields();
        }
        Alert alert2 = alert;
        ByteString byteString2 = byteString;
        return getCryptoBillDetailsResponse.copy(billState, dCFMetaData, cryptoMetaData, billError, alert2, byteString2);
    }

    public final GetCryptoBillDetailsResponse copy(BillState state, DCFMetaData dcf_metadata, CryptoMetaData success, BillError error, Alert error_alert, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCryptoBillDetailsResponse(state, dcf_metadata, success, error, error_alert, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCryptoBillDetailsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCryptoBillDetailsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.GetCryptoBillDetailsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCryptoBillDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getState() != BillState.BILL_STATE_UNSPECIFIED) {
                    size += BillState.ADAPTER.encodedSizeWithTag(1, value.getState());
                }
                int iEncodedSizeWithTag = size + DCFMetaData.ADAPTER.encodedSizeWithTag(2, value.getDcf_metadata()) + CryptoMetaData.ADAPTER.encodedSizeWithTag(11, value.getSuccess()) + BillError.ADAPTER.encodedSizeWithTag(12, value.getError());
                return value.getError_alert() != null ? iEncodedSizeWithTag + Alert.ADAPTER.encodedSizeWithTag(13, value.getError_alert()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCryptoBillDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getState() != BillState.BILL_STATE_UNSPECIFIED) {
                    BillState.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
                if (value.getError_alert() != null) {
                    Alert.ADAPTER.encodeWithTag(writer, 13, (int) value.getError_alert());
                }
                DCFMetaData.ADAPTER.encodeWithTag(writer, 2, (int) value.getDcf_metadata());
                CryptoMetaData.ADAPTER.encodeWithTag(writer, 11, (int) value.getSuccess());
                BillError.ADAPTER.encodeWithTag(writer, 12, (int) value.getError());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCryptoBillDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                BillError.ADAPTER.encodeWithTag(writer, 12, (int) value.getError());
                CryptoMetaData.ADAPTER.encodeWithTag(writer, 11, (int) value.getSuccess());
                DCFMetaData.ADAPTER.encodeWithTag(writer, 2, (int) value.getDcf_metadata());
                if (value.getError_alert() != null) {
                    Alert.ADAPTER.encodeWithTag(writer, 13, (int) value.getError_alert());
                }
                if (value.getState() != BillState.BILL_STATE_UNSPECIFIED) {
                    BillState.ADAPTER.encodeWithTag(writer, 1, (int) value.getState());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoBillDetailsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BillState billStateDecode = BillState.BILL_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                DCFMetaData dCFMetaDataDecode = null;
                CryptoMetaData cryptoMetaDataDecode = null;
                BillError billErrorDecode = null;
                Alert alertDecode = null;
                while (true) {
                    BillState billState = billStateDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetCryptoBillDetailsResponse(billState, dCFMetaDataDecode, cryptoMetaDataDecode, billErrorDecode, alertDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                billStateDecode = BillState.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            dCFMetaDataDecode = DCFMetaData.ADAPTER.decode(reader);
                        } else {
                            switch (iNextTag) {
                                case 11:
                                    cryptoMetaDataDecode = CryptoMetaData.ADAPTER.decode(reader);
                                    break;
                                case 12:
                                    try {
                                        billErrorDecode = BillError.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 13:
                                    alertDecode = Alert.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoBillDetailsResponse redact(GetCryptoBillDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                DCFMetaData dcf_metadata = value.getDcf_metadata();
                DCFMetaData dCFMetaDataRedact = dcf_metadata != null ? DCFMetaData.ADAPTER.redact(dcf_metadata) : null;
                CryptoMetaData success = value.getSuccess();
                CryptoMetaData cryptoMetaDataRedact = success != null ? CryptoMetaData.ADAPTER.redact(success) : null;
                Alert error_alert = value.getError_alert();
                return GetCryptoBillDetailsResponse.copy$default(value, null, dCFMetaDataRedact, cryptoMetaDataRedact, null, error_alert != null ? Alert.ADAPTER.redact(error_alert) : null, ByteString.EMPTY, 9, null);
            }
        };
    }
}
