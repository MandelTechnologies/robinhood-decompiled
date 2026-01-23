package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.eventlogging.CryptoTokenApprovalContext;
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

/* compiled from: CryptoTokenApprovalContext.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$%BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016JN\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContext;", "Lcom/squareup/wire/Message;", "", "transaction_hash", "", "currency_id", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;", "session_id", "network_fee", "", "rh_fee", "result", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContext$Result;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;Ljava/lang/String;DDLcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContext$Result;Lokio/ByteString;)V", "getTransaction_hash", "()Ljava/lang/String;", "getCurrency_id", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;", "getSession_id", "getNetwork_fee", "()D", "getRh_fee", "getResult", "()Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContext$Result;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Result", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CryptoTokenApprovalContext extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoTokenApprovalContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoAssetContext#ADAPTER", jsonName = "currencyId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CryptoAssetContext currency_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "networkFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double network_fee;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoTokenApprovalContext$Result#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Result result;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "rhFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final double rh_fee;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String session_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transactionHash", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String transaction_hash;

    public CryptoTokenApprovalContext() {
        this(null, null, null, 0.0d, 0.0d, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ CryptoTokenApprovalContext(String str, CryptoAssetContext cryptoAssetContext, String str2, double d, double d2, Result result, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : cryptoAssetContext, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? 0.0d : d2, (i & 32) != 0 ? Result.RESULT_UNSPECIFIED : result, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24165newBuilder();
    }

    public final String getTransaction_hash() {
        return this.transaction_hash;
    }

    public final CryptoAssetContext getCurrency_id() {
        return this.currency_id;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final double getNetwork_fee() {
        return this.network_fee;
    }

    public final double getRh_fee() {
        return this.rh_fee;
    }

    public final Result getResult() {
        return this.result;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTokenApprovalContext(String transaction_hash, CryptoAssetContext cryptoAssetContext, String session_id, double d, double d2, Result result, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.transaction_hash = transaction_hash;
        this.currency_id = cryptoAssetContext;
        this.session_id = session_id;
        this.network_fee = d;
        this.rh_fee = d2;
        this.result = result;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24165newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoTokenApprovalContext)) {
            return false;
        }
        CryptoTokenApprovalContext cryptoTokenApprovalContext = (CryptoTokenApprovalContext) other;
        return Intrinsics.areEqual(unknownFields(), cryptoTokenApprovalContext.unknownFields()) && Intrinsics.areEqual(this.transaction_hash, cryptoTokenApprovalContext.transaction_hash) && Intrinsics.areEqual(this.currency_id, cryptoTokenApprovalContext.currency_id) && Intrinsics.areEqual(this.session_id, cryptoTokenApprovalContext.session_id) && this.network_fee == cryptoTokenApprovalContext.network_fee && this.rh_fee == cryptoTokenApprovalContext.rh_fee && this.result == cryptoTokenApprovalContext.result;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.transaction_hash.hashCode()) * 37;
        CryptoAssetContext cryptoAssetContext = this.currency_id;
        int iHashCode2 = ((((((((iHashCode + (cryptoAssetContext != null ? cryptoAssetContext.hashCode() : 0)) * 37) + this.session_id.hashCode()) * 37) + Double.hashCode(this.network_fee)) * 37) + Double.hashCode(this.rh_fee)) * 37) + this.result.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("transaction_hash=" + Internal.sanitize(this.transaction_hash));
        CryptoAssetContext cryptoAssetContext = this.currency_id;
        if (cryptoAssetContext != null) {
            arrayList.add("currency_id=" + cryptoAssetContext);
        }
        arrayList.add("session_id=" + Internal.sanitize(this.session_id));
        arrayList.add("network_fee=" + this.network_fee);
        arrayList.add("rh_fee=" + this.rh_fee);
        arrayList.add("result=" + this.result);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoTokenApprovalContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CryptoTokenApprovalContext copy$default(CryptoTokenApprovalContext cryptoTokenApprovalContext, String str, CryptoAssetContext cryptoAssetContext, String str2, double d, double d2, Result result, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoTokenApprovalContext.transaction_hash;
        }
        if ((i & 2) != 0) {
            cryptoAssetContext = cryptoTokenApprovalContext.currency_id;
        }
        if ((i & 4) != 0) {
            str2 = cryptoTokenApprovalContext.session_id;
        }
        if ((i & 8) != 0) {
            d = cryptoTokenApprovalContext.network_fee;
        }
        if ((i & 16) != 0) {
            d2 = cryptoTokenApprovalContext.rh_fee;
        }
        if ((i & 32) != 0) {
            result = cryptoTokenApprovalContext.result;
        }
        if ((i & 64) != 0) {
            byteString = cryptoTokenApprovalContext.unknownFields();
        }
        double d3 = d2;
        double d4 = d;
        String str3 = str2;
        return cryptoTokenApprovalContext.copy(str, cryptoAssetContext, str3, d4, d3, result, byteString);
    }

    public final CryptoTokenApprovalContext copy(String transaction_hash, CryptoAssetContext currency_id, String session_id, double network_fee, double rh_fee, Result result, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoTokenApprovalContext(transaction_hash, currency_id, session_id, network_fee, rh_fee, result, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoTokenApprovalContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoTokenApprovalContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoTokenApprovalContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoTokenApprovalContext value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTransaction_hash(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTransaction_hash());
                }
                if (value.getCurrency_id() != null) {
                    size += CryptoAssetContext.ADAPTER.encodedSizeWithTag(2, value.getCurrency_id());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSession_id());
                }
                if (!Double.valueOf(value.getNetwork_fee()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getNetwork_fee()));
                }
                if (!Double.valueOf(value.getRh_fee()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(5, Double.valueOf(value.getRh_fee()));
                }
                return value.getResult() != CryptoTokenApprovalContext.Result.RESULT_UNSPECIFIED ? size + CryptoTokenApprovalContext.Result.ADAPTER.encodedSizeWithTag(6, value.getResult()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoTokenApprovalContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTransaction_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTransaction_hash());
                }
                if (value.getCurrency_id() != null) {
                    CryptoAssetContext.ADAPTER.encodeWithTag(writer, 2, (int) value.getCurrency_id());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSession_id());
                }
                if (!Double.valueOf(value.getNetwork_fee()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getNetwork_fee()));
                }
                if (!Double.valueOf(value.getRh_fee()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getRh_fee()));
                }
                if (value.getResult() != CryptoTokenApprovalContext.Result.RESULT_UNSPECIFIED) {
                    CryptoTokenApprovalContext.Result.ADAPTER.encodeWithTag(writer, 6, (int) value.getResult());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoTokenApprovalContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getResult() != CryptoTokenApprovalContext.Result.RESULT_UNSPECIFIED) {
                    CryptoTokenApprovalContext.Result.ADAPTER.encodeWithTag(writer, 6, (int) value.getResult());
                }
                if (!Double.valueOf(value.getRh_fee()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getRh_fee()));
                }
                if (!Double.valueOf(value.getNetwork_fee()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getNetwork_fee()));
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSession_id());
                }
                if (value.getCurrency_id() != null) {
                    CryptoAssetContext.ADAPTER.encodeWithTag(writer, 2, (int) value.getCurrency_id());
                }
                if (Intrinsics.areEqual(value.getTransaction_hash(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTransaction_hash());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoTokenApprovalContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CryptoTokenApprovalContext.Result result = CryptoTokenApprovalContext.Result.RESULT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                String strDecode = "";
                CryptoAssetContext cryptoAssetContextDecode = null;
                CryptoTokenApprovalContext.Result resultDecode = result;
                String strDecode2 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                cryptoAssetContextDecode = CryptoAssetContext.ADAPTER.decode(reader);
                                break;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 5:
                                dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 6:
                                try {
                                    resultDecode = CryptoTokenApprovalContext.Result.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CryptoTokenApprovalContext(strDecode2, cryptoAssetContextDecode, strDecode, dDoubleValue, dDoubleValue2, resultDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoTokenApprovalContext redact(CryptoTokenApprovalContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CryptoAssetContext currency_id = value.getCurrency_id();
                return CryptoTokenApprovalContext.copy$default(value, null, currency_id != null ? CryptoAssetContext.ADAPTER.redact(currency_id) : null, null, 0.0d, 0.0d, null, ByteString.EMPTY, 61, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoTokenApprovalContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContext$Result;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RESULT_UNSPECIFIED", "SUCCESS", "CANCELED_BY_USER", "ERROR", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Result implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Result[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Result> ADAPTER;
        public static final Result CANCELED_BY_USER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Result ERROR;
        public static final Result RESULT_UNSPECIFIED;
        public static final Result SUCCESS;
        private final int value;

        private static final /* synthetic */ Result[] $values() {
            return new Result[]{RESULT_UNSPECIFIED, SUCCESS, CANCELED_BY_USER, ERROR};
        }

        @JvmStatic
        public static final Result fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Result> getEntries() {
            return $ENTRIES;
        }

        private Result(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Result result = new Result("RESULT_UNSPECIFIED", 0, 0);
            RESULT_UNSPECIFIED = result;
            SUCCESS = new Result("SUCCESS", 1, 1);
            CANCELED_BY_USER = new Result("CANCELED_BY_USER", 2, 2);
            ERROR = new Result("ERROR", 3, 3);
            Result[] resultArr$values = $values();
            $VALUES = resultArr$values;
            $ENTRIES = EnumEntries2.enumEntries(resultArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Result.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Result>(orCreateKotlinClass, syntax, result) { // from class: com.robinhood.rosetta.eventlogging.CryptoTokenApprovalContext$Result$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CryptoTokenApprovalContext.Result fromValue(int value) {
                    return CryptoTokenApprovalContext.Result.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CryptoTokenApprovalContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContext$Result$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CryptoTokenApprovalContext$Result;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Result fromValue(int value) {
                if (value == 0) {
                    return Result.RESULT_UNSPECIFIED;
                }
                if (value == 1) {
                    return Result.SUCCESS;
                }
                if (value == 2) {
                    return Result.CANCELED_BY_USER;
                }
                if (value != 3) {
                    return null;
                }
                return Result.ERROR;
            }
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }
}
