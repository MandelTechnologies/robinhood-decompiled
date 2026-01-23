package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.eventlogging.NcwTransferContext;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: NcwTransferContext.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005,-./0BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0010H\u0016JX\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContext;", "Lcom/squareup/wire/Message;", "", "currency", "Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalance;", "transfer_type", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferType;", "amount", "", "status", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferStatus;", "error", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$Error;", "input_style", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$InputStyle;", "connect_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalance;Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferType;DLcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferStatus;Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$Error;Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$InputStyle;Ljava/lang/String;Lokio/ByteString;)V", "getCurrency", "()Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalance;", "getTransfer_type", "()Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferType;", "getAmount", "()D", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferStatus;", "getError", "()Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$Error;", "getInput_style", "()Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$InputStyle;", "getConnect_id", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "TransferType", "Error", "TransferStatus", "InputStyle", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class NcwTransferContext extends Message {

    @JvmField
    public static final ProtoAdapter<NcwTransferContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "connectId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String connect_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoWalletAssetBalance#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CryptoWalletAssetBalance currency;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NcwTransferContext$Error#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Error error;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NcwTransferContext$InputStyle#ADAPTER", jsonName = "inputStyle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final InputStyle input_style;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NcwTransferContext$TransferStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final TransferStatus status;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NcwTransferContext$TransferType#ADAPTER", jsonName = "transferType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TransferType transfer_type;

    public NcwTransferContext() {
        this(null, null, 0.0d, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24401newBuilder();
    }

    public final CryptoWalletAssetBalance getCurrency() {
        return this.currency;
    }

    public final TransferType getTransfer_type() {
        return this.transfer_type;
    }

    public /* synthetic */ NcwTransferContext(CryptoWalletAssetBalance cryptoWalletAssetBalance, TransferType transferType, double d, TransferStatus transferStatus, Error error, InputStyle inputStyle, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoWalletAssetBalance, (i & 2) != 0 ? TransferType.TRANSFER_TYPE_UNSPECIFIED : transferType, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? TransferStatus.TRANSFER_STATUS_UNSPECIFIED : transferStatus, (i & 16) != 0 ? Error.ERROR_UNSPECIFIED : error, (i & 32) != 0 ? InputStyle.INPUTSTYLE_UNSPECIFIED : inputStyle, (i & 64) != 0 ? "" : str, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final TransferStatus getStatus() {
        return this.status;
    }

    public final Error getError() {
        return this.error;
    }

    public final InputStyle getInput_style() {
        return this.input_style;
    }

    public final String getConnect_id() {
        return this.connect_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NcwTransferContext(CryptoWalletAssetBalance cryptoWalletAssetBalance, TransferType transfer_type, double d, TransferStatus status, Error error, InputStyle input_style, String connect_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(input_style, "input_style");
        Intrinsics.checkNotNullParameter(connect_id, "connect_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency = cryptoWalletAssetBalance;
        this.transfer_type = transfer_type;
        this.amount = d;
        this.status = status;
        this.error = error;
        this.input_style = input_style;
        this.connect_id = connect_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24401newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NcwTransferContext)) {
            return false;
        }
        NcwTransferContext ncwTransferContext = (NcwTransferContext) other;
        return Intrinsics.areEqual(unknownFields(), ncwTransferContext.unknownFields()) && Intrinsics.areEqual(this.currency, ncwTransferContext.currency) && this.transfer_type == ncwTransferContext.transfer_type && this.amount == ncwTransferContext.amount && this.status == ncwTransferContext.status && this.error == ncwTransferContext.error && this.input_style == ncwTransferContext.input_style && Intrinsics.areEqual(this.connect_id, ncwTransferContext.connect_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        CryptoWalletAssetBalance cryptoWalletAssetBalance = this.currency;
        int iHashCode2 = ((((((((((((iHashCode + (cryptoWalletAssetBalance != null ? cryptoWalletAssetBalance.hashCode() : 0)) * 37) + this.transfer_type.hashCode()) * 37) + Double.hashCode(this.amount)) * 37) + this.status.hashCode()) * 37) + this.error.hashCode()) * 37) + this.input_style.hashCode()) * 37) + this.connect_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        CryptoWalletAssetBalance cryptoWalletAssetBalance = this.currency;
        if (cryptoWalletAssetBalance != null) {
            arrayList.add("currency=" + cryptoWalletAssetBalance);
        }
        arrayList.add("transfer_type=" + this.transfer_type);
        arrayList.add("amount=" + this.amount);
        arrayList.add("status=" + this.status);
        arrayList.add("error=" + this.error);
        arrayList.add("input_style=" + this.input_style);
        arrayList.add("connect_id=" + Internal.sanitize(this.connect_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "NcwTransferContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NcwTransferContext copy$default(NcwTransferContext ncwTransferContext, CryptoWalletAssetBalance cryptoWalletAssetBalance, TransferType transferType, double d, TransferStatus transferStatus, Error error, InputStyle inputStyle, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoWalletAssetBalance = ncwTransferContext.currency;
        }
        if ((i & 2) != 0) {
            transferType = ncwTransferContext.transfer_type;
        }
        if ((i & 4) != 0) {
            d = ncwTransferContext.amount;
        }
        if ((i & 8) != 0) {
            transferStatus = ncwTransferContext.status;
        }
        if ((i & 16) != 0) {
            error = ncwTransferContext.error;
        }
        if ((i & 32) != 0) {
            inputStyle = ncwTransferContext.input_style;
        }
        if ((i & 64) != 0) {
            str = ncwTransferContext.connect_id;
        }
        if ((i & 128) != 0) {
            byteString = ncwTransferContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        InputStyle inputStyle2 = inputStyle;
        TransferStatus transferStatus2 = transferStatus;
        double d2 = d;
        return ncwTransferContext.copy(cryptoWalletAssetBalance, transferType, d2, transferStatus2, error, inputStyle2, str, byteString2);
    }

    public final NcwTransferContext copy(CryptoWalletAssetBalance currency, TransferType transfer_type, double amount, TransferStatus status, Error error, InputStyle input_style, String connect_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(input_style, "input_style");
        Intrinsics.checkNotNullParameter(connect_id, "connect_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NcwTransferContext(currency, transfer_type, amount, status, error, input_style, connect_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NcwTransferContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NcwTransferContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.NcwTransferContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NcwTransferContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getCurrency() != null) {
                    size += CryptoWalletAssetBalance.ADAPTER.encodedSizeWithTag(1, value.getCurrency());
                }
                if (value.getTransfer_type() != NcwTransferContext.TransferType.TRANSFER_TYPE_UNSPECIFIED) {
                    size += NcwTransferContext.TransferType.ADAPTER.encodedSizeWithTag(2, value.getTransfer_type());
                }
                if (!Double.valueOf(value.getAmount()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getAmount()));
                }
                if (value.getStatus() != NcwTransferContext.TransferStatus.TRANSFER_STATUS_UNSPECIFIED) {
                    size += NcwTransferContext.TransferStatus.ADAPTER.encodedSizeWithTag(4, value.getStatus());
                }
                if (value.getError() != NcwTransferContext.Error.ERROR_UNSPECIFIED) {
                    size += NcwTransferContext.Error.ADAPTER.encodedSizeWithTag(5, value.getError());
                }
                if (value.getInput_style() != NcwTransferContext.InputStyle.INPUTSTYLE_UNSPECIFIED) {
                    size += NcwTransferContext.InputStyle.ADAPTER.encodedSizeWithTag(6, value.getInput_style());
                }
                return !Intrinsics.areEqual(value.getConnect_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getConnect_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NcwTransferContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCurrency() != null) {
                    CryptoWalletAssetBalance.ADAPTER.encodeWithTag(writer, 1, (int) value.getCurrency());
                }
                if (value.getTransfer_type() != NcwTransferContext.TransferType.TRANSFER_TYPE_UNSPECIFIED) {
                    NcwTransferContext.TransferType.ADAPTER.encodeWithTag(writer, 2, (int) value.getTransfer_type());
                }
                if (!Double.valueOf(value.getAmount()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getAmount()));
                }
                if (value.getStatus() != NcwTransferContext.TransferStatus.TRANSFER_STATUS_UNSPECIFIED) {
                    NcwTransferContext.TransferStatus.ADAPTER.encodeWithTag(writer, 4, (int) value.getStatus());
                }
                if (value.getError() != NcwTransferContext.Error.ERROR_UNSPECIFIED) {
                    NcwTransferContext.Error.ADAPTER.encodeWithTag(writer, 5, (int) value.getError());
                }
                if (value.getInput_style() != NcwTransferContext.InputStyle.INPUTSTYLE_UNSPECIFIED) {
                    NcwTransferContext.InputStyle.ADAPTER.encodeWithTag(writer, 6, (int) value.getInput_style());
                }
                if (!Intrinsics.areEqual(value.getConnect_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getConnect_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NcwTransferContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getConnect_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getConnect_id());
                }
                if (value.getInput_style() != NcwTransferContext.InputStyle.INPUTSTYLE_UNSPECIFIED) {
                    NcwTransferContext.InputStyle.ADAPTER.encodeWithTag(writer, 6, (int) value.getInput_style());
                }
                if (value.getError() != NcwTransferContext.Error.ERROR_UNSPECIFIED) {
                    NcwTransferContext.Error.ADAPTER.encodeWithTag(writer, 5, (int) value.getError());
                }
                if (value.getStatus() != NcwTransferContext.TransferStatus.TRANSFER_STATUS_UNSPECIFIED) {
                    NcwTransferContext.TransferStatus.ADAPTER.encodeWithTag(writer, 4, (int) value.getStatus());
                }
                if (!Double.valueOf(value.getAmount()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getAmount()));
                }
                if (value.getTransfer_type() != NcwTransferContext.TransferType.TRANSFER_TYPE_UNSPECIFIED) {
                    NcwTransferContext.TransferType.ADAPTER.encodeWithTag(writer, 2, (int) value.getTransfer_type());
                }
                if (value.getCurrency() != null) {
                    CryptoWalletAssetBalance.ADAPTER.encodeWithTag(writer, 1, (int) value.getCurrency());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NcwTransferContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                NcwTransferContext.TransferType transferTypeDecode = NcwTransferContext.TransferType.TRANSFER_TYPE_UNSPECIFIED;
                NcwTransferContext.TransferStatus transferStatus = NcwTransferContext.TransferStatus.TRANSFER_STATUS_UNSPECIFIED;
                NcwTransferContext.Error error = NcwTransferContext.Error.ERROR_UNSPECIFIED;
                NcwTransferContext.InputStyle inputStyle = NcwTransferContext.InputStyle.INPUTSTYLE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                double dDoubleValue = 0.0d;
                CryptoWalletAssetBalance cryptoWalletAssetBalanceDecode = null;
                NcwTransferContext.InputStyle inputStyleDecode = inputStyle;
                NcwTransferContext.Error errorDecode = error;
                NcwTransferContext.TransferStatus transferStatusDecode = transferStatus;
                while (true) {
                    NcwTransferContext.TransferType transferType = transferTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    cryptoWalletAssetBalanceDecode = CryptoWalletAssetBalance.ADAPTER.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        transferTypeDecode = NcwTransferContext.TransferType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 4:
                                    try {
                                        transferStatusDecode = NcwTransferContext.TransferStatus.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 5:
                                    try {
                                        errorDecode = NcwTransferContext.Error.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 6:
                                    try {
                                        inputStyleDecode = NcwTransferContext.InputStyle.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                        break;
                                    }
                                case 7:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new NcwTransferContext(cryptoWalletAssetBalanceDecode, transferType, dDoubleValue, transferStatusDecode, errorDecode, inputStyleDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NcwTransferContext redact(NcwTransferContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CryptoWalletAssetBalance currency = value.getCurrency();
                return NcwTransferContext.copy$default(value, currency != null ? CryptoWalletAssetBalance.ADAPTER.redact(currency) : null, null, 0.0d, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NcwTransferContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRANSFER_TYPE_UNSPECIFIED", "SEND", "RECEIVE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TransferType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransferType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<TransferType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TransferType RECEIVE;
        public static final TransferType SEND;
        public static final TransferType TRANSFER_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ TransferType[] $values() {
            return new TransferType[]{TRANSFER_TYPE_UNSPECIFIED, SEND, RECEIVE};
        }

        @JvmStatic
        public static final TransferType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<TransferType> getEntries() {
            return $ENTRIES;
        }

        private TransferType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final TransferType transferType = new TransferType("TRANSFER_TYPE_UNSPECIFIED", 0, 0);
            TRANSFER_TYPE_UNSPECIFIED = transferType;
            SEND = new TransferType("SEND", 1, 1);
            RECEIVE = new TransferType("RECEIVE", 2, 2);
            TransferType[] transferTypeArr$values = $values();
            $VALUES = transferTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(transferTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<TransferType>(orCreateKotlinClass, syntax, transferType) { // from class: com.robinhood.rosetta.eventlogging.NcwTransferContext$TransferType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public NcwTransferContext.TransferType fromValue(int value) {
                    return NcwTransferContext.TransferType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: NcwTransferContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final TransferType fromValue(int value) {
                if (value == 0) {
                    return TransferType.TRANSFER_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return TransferType.SEND;
                }
                if (value != 2) {
                    return null;
                }
                return TransferType.RECEIVE;
            }
        }

        public static TransferType valueOf(String str) {
            return (TransferType) Enum.valueOf(TransferType.class, str);
        }

        public static TransferType[] values() {
            return (TransferType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NcwTransferContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$Error;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ERROR_UNSPECIFIED", "INSUFFICIENT_BALANCE", "EXPIRED_FEE", "FAILED_AUTH", "FAILED_REQUEST", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Error[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Error> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Error ERROR_UNSPECIFIED;
        public static final Error EXPIRED_FEE;
        public static final Error FAILED_AUTH;
        public static final Error FAILED_REQUEST;
        public static final Error INSUFFICIENT_BALANCE;
        private final int value;

        private static final /* synthetic */ Error[] $values() {
            return new Error[]{ERROR_UNSPECIFIED, INSUFFICIENT_BALANCE, EXPIRED_FEE, FAILED_AUTH, FAILED_REQUEST};
        }

        @JvmStatic
        public static final Error fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Error> getEntries() {
            return $ENTRIES;
        }

        private Error(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Error error = new Error("ERROR_UNSPECIFIED", 0, 0);
            ERROR_UNSPECIFIED = error;
            INSUFFICIENT_BALANCE = new Error("INSUFFICIENT_BALANCE", 1, 1);
            EXPIRED_FEE = new Error("EXPIRED_FEE", 2, 2);
            FAILED_AUTH = new Error("FAILED_AUTH", 3, 3);
            FAILED_REQUEST = new Error("FAILED_REQUEST", 4, 4);
            Error[] errorArr$values = $values();
            $VALUES = errorArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Error.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Error>(orCreateKotlinClass, syntax, error) { // from class: com.robinhood.rosetta.eventlogging.NcwTransferContext$Error$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public NcwTransferContext.Error fromValue(int value) {
                    return NcwTransferContext.Error.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: NcwTransferContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$Error$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$Error;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Error fromValue(int value) {
                if (value == 0) {
                    return Error.ERROR_UNSPECIFIED;
                }
                if (value == 1) {
                    return Error.INSUFFICIENT_BALANCE;
                }
                if (value == 2) {
                    return Error.EXPIRED_FEE;
                }
                if (value == 3) {
                    return Error.FAILED_AUTH;
                }
                if (value != 4) {
                    return null;
                }
                return Error.FAILED_REQUEST;
            }
        }

        public static Error valueOf(String str) {
            return (Error) Enum.valueOf(Error.class, str);
        }

        public static Error[] values() {
            return (Error[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NcwTransferContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRANSFER_STATUS_UNSPECIFIED", "SUBMITTED", "FAILED", "SUCCEEDED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TransferStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TransferStatus[] $VALUES;

        @JvmField
        public static final ProtoAdapter<TransferStatus> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TransferStatus FAILED;
        public static final TransferStatus SUBMITTED;
        public static final TransferStatus SUCCEEDED;
        public static final TransferStatus TRANSFER_STATUS_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ TransferStatus[] $values() {
            return new TransferStatus[]{TRANSFER_STATUS_UNSPECIFIED, SUBMITTED, FAILED, SUCCEEDED};
        }

        @JvmStatic
        public static final TransferStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<TransferStatus> getEntries() {
            return $ENTRIES;
        }

        private TransferStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final TransferStatus transferStatus = new TransferStatus("TRANSFER_STATUS_UNSPECIFIED", 0, 0);
            TRANSFER_STATUS_UNSPECIFIED = transferStatus;
            SUBMITTED = new TransferStatus("SUBMITTED", 1, 1);
            FAILED = new TransferStatus("FAILED", 2, 2);
            SUCCEEDED = new TransferStatus("SUCCEEDED", 3, 3);
            TransferStatus[] transferStatusArr$values = $values();
            $VALUES = transferStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(transferStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<TransferStatus>(orCreateKotlinClass, syntax, transferStatus) { // from class: com.robinhood.rosetta.eventlogging.NcwTransferContext$TransferStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public NcwTransferContext.TransferStatus fromValue(int value) {
                    return NcwTransferContext.TransferStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: NcwTransferContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$TransferStatus;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final TransferStatus fromValue(int value) {
                if (value == 0) {
                    return TransferStatus.TRANSFER_STATUS_UNSPECIFIED;
                }
                if (value == 1) {
                    return TransferStatus.SUBMITTED;
                }
                if (value == 2) {
                    return TransferStatus.FAILED;
                }
                if (value != 3) {
                    return null;
                }
                return TransferStatus.SUCCEEDED;
            }
        }

        public static TransferStatus valueOf(String str) {
            return (TransferStatus) Enum.valueOf(TransferStatus.class, str);
        }

        public static TransferStatus[] values() {
            return (TransferStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NcwTransferContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$InputStyle;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INPUTSTYLE_UNSPECIFIED", "USD", "TOKEN", "CUSTOM", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InputStyle implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InputStyle[] $VALUES;

        @JvmField
        public static final ProtoAdapter<InputStyle> ADAPTER;
        public static final InputStyle CUSTOM;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final InputStyle INPUTSTYLE_UNSPECIFIED;
        public static final InputStyle TOKEN;
        public static final InputStyle USD;
        private final int value;

        private static final /* synthetic */ InputStyle[] $values() {
            return new InputStyle[]{INPUTSTYLE_UNSPECIFIED, USD, TOKEN, CUSTOM};
        }

        @JvmStatic
        public static final InputStyle fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<InputStyle> getEntries() {
            return $ENTRIES;
        }

        private InputStyle(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final InputStyle inputStyle = new InputStyle("INPUTSTYLE_UNSPECIFIED", 0, 0);
            INPUTSTYLE_UNSPECIFIED = inputStyle;
            USD = new InputStyle("USD", 1, 1);
            TOKEN = new InputStyle("TOKEN", 2, 2);
            CUSTOM = new InputStyle("CUSTOM", 3, 3);
            InputStyle[] inputStyleArr$values = $values();
            $VALUES = inputStyleArr$values;
            $ENTRIES = EnumEntries2.enumEntries(inputStyleArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InputStyle.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<InputStyle>(orCreateKotlinClass, syntax, inputStyle) { // from class: com.robinhood.rosetta.eventlogging.NcwTransferContext$InputStyle$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public NcwTransferContext.InputStyle fromValue(int value) {
                    return NcwTransferContext.InputStyle.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: NcwTransferContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$InputStyle$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/NcwTransferContext$InputStyle;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final InputStyle fromValue(int value) {
                if (value == 0) {
                    return InputStyle.INPUTSTYLE_UNSPECIFIED;
                }
                if (value == 1) {
                    return InputStyle.USD;
                }
                if (value == 2) {
                    return InputStyle.TOKEN;
                }
                if (value != 3) {
                    return null;
                }
                return InputStyle.CUSTOM;
            }
        }

        public static InputStyle valueOf(String str) {
            return (InputStyle) Enum.valueOf(InputStyle.class, str);
        }

        public static InputStyle[] values() {
            return (InputStyle[]) $VALUES.clone();
        }
    }
}
