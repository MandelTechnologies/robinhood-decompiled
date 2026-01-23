package com.robinhood.rosetta.eventlogging;

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

/* compiled from: CryptoWalletAssetBalance.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J0\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalance;", "Lcom/squareup/wire/Message;", "", "asset", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;", "balance", "", "token_balance", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;DDLokio/ByteString;)V", "getAsset", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;", "getBalance", "()D", "getToken_balance", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CryptoWalletAssetBalance extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoWalletAssetBalance> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoAssetContext#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CryptoAssetContext asset;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double balance;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "tokenBalance", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double token_balance;

    public CryptoWalletAssetBalance() {
        this(null, 0.0d, 0.0d, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24177newBuilder();
    }

    public final CryptoAssetContext getAsset() {
        return this.asset;
    }

    public final double getBalance() {
        return this.balance;
    }

    public final double getToken_balance() {
        return this.token_balance;
    }

    public /* synthetic */ CryptoWalletAssetBalance(CryptoAssetContext cryptoAssetContext, double d, double d2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoAssetContext, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoWalletAssetBalance(CryptoAssetContext cryptoAssetContext, double d, double d2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.asset = cryptoAssetContext;
        this.balance = d;
        this.token_balance = d2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24177newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoWalletAssetBalance)) {
            return false;
        }
        CryptoWalletAssetBalance cryptoWalletAssetBalance = (CryptoWalletAssetBalance) other;
        return Intrinsics.areEqual(unknownFields(), cryptoWalletAssetBalance.unknownFields()) && Intrinsics.areEqual(this.asset, cryptoWalletAssetBalance.asset) && this.balance == cryptoWalletAssetBalance.balance && this.token_balance == cryptoWalletAssetBalance.token_balance;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        CryptoAssetContext cryptoAssetContext = this.asset;
        int iHashCode2 = ((((iHashCode + (cryptoAssetContext != null ? cryptoAssetContext.hashCode() : 0)) * 37) + Double.hashCode(this.balance)) * 37) + Double.hashCode(this.token_balance);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        CryptoAssetContext cryptoAssetContext = this.asset;
        if (cryptoAssetContext != null) {
            arrayList.add("asset=" + cryptoAssetContext);
        }
        arrayList.add("balance=" + this.balance);
        arrayList.add("token_balance=" + this.token_balance);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoWalletAssetBalance{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CryptoWalletAssetBalance copy$default(CryptoWalletAssetBalance cryptoWalletAssetBalance, CryptoAssetContext cryptoAssetContext, double d, double d2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoAssetContext = cryptoWalletAssetBalance.asset;
        }
        if ((i & 2) != 0) {
            d = cryptoWalletAssetBalance.balance;
        }
        if ((i & 4) != 0) {
            d2 = cryptoWalletAssetBalance.token_balance;
        }
        if ((i & 8) != 0) {
            byteString = cryptoWalletAssetBalance.unknownFields();
        }
        ByteString byteString2 = byteString;
        return cryptoWalletAssetBalance.copy(cryptoAssetContext, d, d2, byteString2);
    }

    public final CryptoWalletAssetBalance copy(CryptoAssetContext asset, double balance, double token_balance, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoWalletAssetBalance(asset, balance, token_balance, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoWalletAssetBalance.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoWalletAssetBalance>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoWalletAssetBalance$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoWalletAssetBalance value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAsset() != null) {
                    size += CryptoAssetContext.ADAPTER.encodedSizeWithTag(1, value.getAsset());
                }
                if (!Double.valueOf(value.getBalance()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getBalance()));
                }
                return !Double.valueOf(value.getToken_balance()).equals(dValueOf) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getToken_balance())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoWalletAssetBalance value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAsset() != null) {
                    CryptoAssetContext.ADAPTER.encodeWithTag(writer, 1, (int) value.getAsset());
                }
                if (!Double.valueOf(value.getBalance()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getBalance()));
                }
                if (!Double.valueOf(value.getToken_balance()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getToken_balance()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoWalletAssetBalance value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Double dValueOf = Double.valueOf(value.getToken_balance());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getToken_balance()));
                }
                if (!Double.valueOf(value.getBalance()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getBalance()));
                }
                if (value.getAsset() != null) {
                    CryptoAssetContext.ADAPTER.encodeWithTag(writer, 1, (int) value.getAsset());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoWalletAssetBalance redact(CryptoWalletAssetBalance value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CryptoAssetContext asset = value.getAsset();
                return CryptoWalletAssetBalance.copy$default(value, asset != null ? CryptoAssetContext.ADAPTER.redact(asset) : null, 0.0d, 0.0d, ByteString.EMPTY, 6, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoWalletAssetBalance decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                CryptoAssetContext cryptoAssetContextDecode = null;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CryptoWalletAssetBalance(cryptoAssetContextDecode, dDoubleValue, dDoubleValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        cryptoAssetContextDecode = CryptoAssetContext.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 3) {
                        dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
