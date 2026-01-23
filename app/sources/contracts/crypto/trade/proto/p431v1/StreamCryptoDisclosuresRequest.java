package contracts.crypto.trade.proto.p431v1;

import bff_money_movement.service.p019v1.BillingAccount;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.rosetta.common.Date;
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
import contracts.crypto.trade.proto.p431v1.StreamCryptoDisclosuresRequest;
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
import rosetta.nummus.CurrencyPair;

/* compiled from: StreamCryptoDisclosuresRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest;", "Lcom/squareup/wire/Message;", "", "crypto_trading", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading;Lokio/ByteString;)V", "getCrypto_trading", "()Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "CryptoTrading", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class StreamCryptoDisclosuresRequest extends Message {

    @JvmField
    public static final ProtoAdapter<StreamCryptoDisclosuresRequest> ADAPTER;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequest$CryptoTrading#ADAPTER", jsonName = "cryptoTrading", oneofName = "location", schemaIndex = 0, tag = 1)
    private final CryptoTrading crypto_trading;

    /* JADX WARN: Multi-variable type inference failed */
    public StreamCryptoDisclosuresRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27702newBuilder();
    }

    public final CryptoTrading getCrypto_trading() {
        return this.crypto_trading;
    }

    public /* synthetic */ StreamCryptoDisclosuresRequest(CryptoTrading cryptoTrading, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoTrading, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamCryptoDisclosuresRequest(CryptoTrading cryptoTrading, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.crypto_trading = cryptoTrading;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27702newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamCryptoDisclosuresRequest)) {
            return false;
        }
        StreamCryptoDisclosuresRequest streamCryptoDisclosuresRequest = (StreamCryptoDisclosuresRequest) other;
        return Intrinsics.areEqual(unknownFields(), streamCryptoDisclosuresRequest.unknownFields()) && Intrinsics.areEqual(this.crypto_trading, streamCryptoDisclosuresRequest.crypto_trading);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        CryptoTrading cryptoTrading = this.crypto_trading;
        int iHashCode2 = iHashCode + (cryptoTrading != null ? cryptoTrading.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        CryptoTrading cryptoTrading = this.crypto_trading;
        if (cryptoTrading != null) {
            arrayList.add("crypto_trading=" + cryptoTrading);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamCryptoDisclosuresRequest{", "}", 0, null, null, 56, null);
    }

    public final StreamCryptoDisclosuresRequest copy(CryptoTrading crypto_trading, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamCryptoDisclosuresRequest(crypto_trading, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamCryptoDisclosuresRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamCryptoDisclosuresRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamCryptoDisclosuresRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + StreamCryptoDisclosuresRequest.CryptoTrading.ADAPTER.encodedSizeWithTag(1, value.getCrypto_trading());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamCryptoDisclosuresRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                StreamCryptoDisclosuresRequest.CryptoTrading.ADAPTER.encodeWithTag(writer, 1, (int) value.getCrypto_trading());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamCryptoDisclosuresRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                StreamCryptoDisclosuresRequest.CryptoTrading.ADAPTER.encodeWithTag(writer, 1, (int) value.getCrypto_trading());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoDisclosuresRequest redact(StreamCryptoDisclosuresRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                StreamCryptoDisclosuresRequest.CryptoTrading crypto_trading = value.getCrypto_trading();
                return value.copy(crypto_trading != null ? StreamCryptoDisclosuresRequest.CryptoTrading.ADAPTER.redact(crypto_trading) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamCryptoDisclosuresRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                StreamCryptoDisclosuresRequest.CryptoTrading cryptoTradingDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamCryptoDisclosuresRequest(cryptoTradingDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        cryptoTradingDecode = StreamCryptoDisclosuresRequest.CryptoTrading.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: StreamCryptoDisclosuresRequest.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f !B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J>\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading;", "Lcom/squareup/wire/Message;", "", Content.MarketIndicator.CRYPTO_TYPE, "Lrosetta/nummus/CurrencyPair;", "recurring_info", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$RecurringInfo;", "payment_method", "Lbff_money_movement/service/v1/BillingAccount;", "is_replacing_order", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/nummus/CurrencyPair;Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$RecurringInfo;Lbff_money_movement/service/v1/BillingAccount;ZLokio/ByteString;)V", "getCurrency_pair", "()Lrosetta/nummus/CurrencyPair;", "getRecurring_info", "()Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$RecurringInfo;", "getPayment_method", "()Lbff_money_movement/service/v1/BillingAccount;", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "InvestmentFrequency", "RecurringInfo", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CryptoTrading extends Message {

        @JvmField
        public static final ProtoAdapter<CryptoTrading> ADAPTER;

        @WireField(adapter = "rosetta.nummus.CurrencyPair#ADAPTER", jsonName = "currencyPair", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final CurrencyPair currency_pair;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isReplacingOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final boolean is_replacing_order;

        @WireField(adapter = "bff_money_movement.service.v1.BillingAccount#ADAPTER", jsonName = "paymentMethod", schemaIndex = 2, tag = 3)
        private final BillingAccount payment_method;

        @WireField(adapter = "contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequest$CryptoTrading$RecurringInfo#ADAPTER", jsonName = "recurringInfo", schemaIndex = 1, tag = 2)
        private final RecurringInfo recurring_info;

        public CryptoTrading() {
            this(null, null, null, false, null, 31, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27703newBuilder();
        }

        public final CurrencyPair getCurrency_pair() {
            return this.currency_pair;
        }

        public final RecurringInfo getRecurring_info() {
            return this.recurring_info;
        }

        public final BillingAccount getPayment_method() {
            return this.payment_method;
        }

        /* renamed from: is_replacing_order, reason: from getter */
        public final boolean getIs_replacing_order() {
            return this.is_replacing_order;
        }

        public /* synthetic */ CryptoTrading(CurrencyPair currencyPair, RecurringInfo recurringInfo, BillingAccount billingAccount, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : currencyPair, (i & 2) != 0 ? null : recurringInfo, (i & 4) != 0 ? null : billingAccount, (i & 8) != 0 ? false : z, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CryptoTrading(CurrencyPair currencyPair, RecurringInfo recurringInfo, BillingAccount billingAccount, boolean z, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.currency_pair = currencyPair;
            this.recurring_info = recurringInfo;
            this.payment_method = billingAccount;
            this.is_replacing_order = z;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27703newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CryptoTrading)) {
                return false;
            }
            CryptoTrading cryptoTrading = (CryptoTrading) other;
            return Intrinsics.areEqual(unknownFields(), cryptoTrading.unknownFields()) && Intrinsics.areEqual(this.currency_pair, cryptoTrading.currency_pair) && Intrinsics.areEqual(this.recurring_info, cryptoTrading.recurring_info) && Intrinsics.areEqual(this.payment_method, cryptoTrading.payment_method) && this.is_replacing_order == cryptoTrading.is_replacing_order;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            CurrencyPair currencyPair = this.currency_pair;
            int iHashCode2 = (iHashCode + (currencyPair != null ? currencyPair.hashCode() : 0)) * 37;
            RecurringInfo recurringInfo = this.recurring_info;
            int iHashCode3 = (iHashCode2 + (recurringInfo != null ? recurringInfo.hashCode() : 0)) * 37;
            BillingAccount billingAccount = this.payment_method;
            int iHashCode4 = ((iHashCode3 + (billingAccount != null ? billingAccount.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_replacing_order);
            this.hashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            CurrencyPair currencyPair = this.currency_pair;
            if (currencyPair != null) {
                arrayList.add("currency_pair=" + currencyPair);
            }
            RecurringInfo recurringInfo = this.recurring_info;
            if (recurringInfo != null) {
                arrayList.add("recurring_info=" + recurringInfo);
            }
            BillingAccount billingAccount = this.payment_method;
            if (billingAccount != null) {
                arrayList.add("payment_method=" + billingAccount);
            }
            arrayList.add("is_replacing_order=" + this.is_replacing_order);
            return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoTrading{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ CryptoTrading copy$default(CryptoTrading cryptoTrading, CurrencyPair currencyPair, RecurringInfo recurringInfo, BillingAccount billingAccount, boolean z, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                currencyPair = cryptoTrading.currency_pair;
            }
            if ((i & 2) != 0) {
                recurringInfo = cryptoTrading.recurring_info;
            }
            if ((i & 4) != 0) {
                billingAccount = cryptoTrading.payment_method;
            }
            if ((i & 8) != 0) {
                z = cryptoTrading.is_replacing_order;
            }
            if ((i & 16) != 0) {
                byteString = cryptoTrading.unknownFields();
            }
            ByteString byteString2 = byteString;
            BillingAccount billingAccount2 = billingAccount;
            return cryptoTrading.copy(currencyPair, recurringInfo, billingAccount2, z, byteString2);
        }

        public final CryptoTrading copy(CurrencyPair currency_pair, RecurringInfo recurring_info, BillingAccount payment_method, boolean is_replacing_order, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CryptoTrading(currency_pair, recurring_info, payment_method, is_replacing_order, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoTrading.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CryptoTrading>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequest$CryptoTrading$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(StreamCryptoDisclosuresRequest.CryptoTrading value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getCurrency_pair() != null) {
                        size += CurrencyPair.ADAPTER.encodedSizeWithTag(1, value.getCurrency_pair());
                    }
                    int iEncodedSizeWithTag = size + StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo.ADAPTER.encodedSizeWithTag(2, value.getRecurring_info()) + BillingAccount.ADAPTER.encodedSizeWithTag(3, value.getPayment_method());
                    return value.getIs_replacing_order() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_replacing_order())) : iEncodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, StreamCryptoDisclosuresRequest.CryptoTrading value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getCurrency_pair() != null) {
                        CurrencyPair.ADAPTER.encodeWithTag(writer, 1, (int) value.getCurrency_pair());
                    }
                    StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getRecurring_info());
                    BillingAccount.ADAPTER.encodeWithTag(writer, 3, (int) value.getPayment_method());
                    if (value.getIs_replacing_order()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_replacing_order()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, StreamCryptoDisclosuresRequest.CryptoTrading value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getIs_replacing_order()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_replacing_order()));
                    }
                    BillingAccount.ADAPTER.encodeWithTag(writer, 3, (int) value.getPayment_method());
                    StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getRecurring_info());
                    if (value.getCurrency_pair() != null) {
                        CurrencyPair.ADAPTER.encodeWithTag(writer, 1, (int) value.getCurrency_pair());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamCryptoDisclosuresRequest.CryptoTrading redact(StreamCryptoDisclosuresRequest.CryptoTrading value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    CurrencyPair currency_pair = value.getCurrency_pair();
                    CurrencyPair currencyPairRedact = currency_pair != null ? CurrencyPair.ADAPTER.redact(currency_pair) : null;
                    StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo recurring_info = value.getRecurring_info();
                    StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo recurringInfoRedact = recurring_info != null ? StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo.ADAPTER.redact(recurring_info) : null;
                    BillingAccount payment_method = value.getPayment_method();
                    return StreamCryptoDisclosuresRequest.CryptoTrading.copy$default(value, currencyPairRedact, recurringInfoRedact, payment_method != null ? BillingAccount.ADAPTER.redact(payment_method) : null, false, ByteString.EMPTY, 8, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public StreamCryptoDisclosuresRequest.CryptoTrading decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    CurrencyPair currencyPairDecode = null;
                    BillingAccount billingAccountDecode = null;
                    boolean zBooleanValue = false;
                    StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo recurringInfoDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new StreamCryptoDisclosuresRequest.CryptoTrading(currencyPairDecode, recurringInfoDecode, billingAccountDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            currencyPairDecode = CurrencyPair.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            recurringInfoDecode = StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            billingAccountDecode = BillingAccount.ADAPTER.decode(reader);
                        } else if (iNextTag == 4) {
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: StreamCryptoDisclosuresRequest.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$InvestmentFrequency;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INVESTMENT_FREQUENCY_UNSPECIFIED", "DAILY", "WEEKLY", "BIWEEKLY", "MONTHLY", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class InvestmentFrequency implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ InvestmentFrequency[] $VALUES;

            @JvmField
            public static final ProtoAdapter<InvestmentFrequency> ADAPTER;
            public static final InvestmentFrequency BIWEEKLY;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final InvestmentFrequency DAILY;
            public static final InvestmentFrequency INVESTMENT_FREQUENCY_UNSPECIFIED;
            public static final InvestmentFrequency MONTHLY;
            public static final InvestmentFrequency WEEKLY;
            private final int value;

            private static final /* synthetic */ InvestmentFrequency[] $values() {
                return new InvestmentFrequency[]{INVESTMENT_FREQUENCY_UNSPECIFIED, DAILY, WEEKLY, BIWEEKLY, MONTHLY};
            }

            @JvmStatic
            public static final InvestmentFrequency fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<InvestmentFrequency> getEntries() {
                return $ENTRIES;
            }

            private InvestmentFrequency(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final InvestmentFrequency investmentFrequency = new InvestmentFrequency("INVESTMENT_FREQUENCY_UNSPECIFIED", 0, 0);
                INVESTMENT_FREQUENCY_UNSPECIFIED = investmentFrequency;
                DAILY = new InvestmentFrequency("DAILY", 1, 1);
                WEEKLY = new InvestmentFrequency("WEEKLY", 2, 2);
                BIWEEKLY = new InvestmentFrequency("BIWEEKLY", 3, 3);
                MONTHLY = new InvestmentFrequency("MONTHLY", 4, 4);
                InvestmentFrequency[] investmentFrequencyArr$values = $values();
                $VALUES = investmentFrequencyArr$values;
                $ENTRIES = EnumEntries2.enumEntries(investmentFrequencyArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentFrequency.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<InvestmentFrequency>(orCreateKotlinClass, syntax, investmentFrequency) { // from class: contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequest$CryptoTrading$InvestmentFrequency$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency fromValue(int value) {
                        return StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: StreamCryptoDisclosuresRequest.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$InvestmentFrequency$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$InvestmentFrequency;", "fromValue", "value", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final InvestmentFrequency fromValue(int value) {
                    if (value == 0) {
                        return InvestmentFrequency.INVESTMENT_FREQUENCY_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return InvestmentFrequency.DAILY;
                    }
                    if (value == 2) {
                        return InvestmentFrequency.WEEKLY;
                    }
                    if (value == 3) {
                        return InvestmentFrequency.BIWEEKLY;
                    }
                    if (value != 4) {
                        return null;
                    }
                    return InvestmentFrequency.MONTHLY;
                }
            }

            public static InvestmentFrequency valueOf(String str) {
                return (InvestmentFrequency) Enum.valueOf(InvestmentFrequency.class, str);
            }

            public static InvestmentFrequency[] values() {
                return (InvestmentFrequency[]) $VALUES.clone();
            }
        }

        /* compiled from: StreamCryptoDisclosuresRequest.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$RecurringInfo;", "Lcom/squareup/wire/Message;", "", "frequency", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$InvestmentFrequency;", "start_date", "Lcom/robinhood/rosetta/common/Date;", "quote_amount", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$InvestmentFrequency;Lcom/robinhood/rosetta/common/Date;Ljava/lang/String;Lokio/ByteString;)V", "getFrequency", "()Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$InvestmentFrequency;", "getStart_date", "()Lcom/robinhood/rosetta/common/Date;", "getQuote_amount", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class RecurringInfo extends Message {

            @JvmField
            public static final ProtoAdapter<RecurringInfo> ADAPTER;

            @WireField(adapter = "contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequest$CryptoTrading$InvestmentFrequency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final InvestmentFrequency frequency;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quoteAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
            private final String quote_amount;

            @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "startDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final Date start_date;

            public RecurringInfo() {
                this(null, null, null, null, 15, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m27704newBuilder();
            }

            public final InvestmentFrequency getFrequency() {
                return this.frequency;
            }

            public /* synthetic */ RecurringInfo(InvestmentFrequency investmentFrequency, Date date, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? InvestmentFrequency.INVESTMENT_FREQUENCY_UNSPECIFIED : investmentFrequency, (i & 2) != 0 ? null : date, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public final Date getStart_date() {
                return this.start_date;
            }

            public final String getQuote_amount() {
                return this.quote_amount;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RecurringInfo(InvestmentFrequency frequency, Date date, String quote_amount, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(frequency, "frequency");
                Intrinsics.checkNotNullParameter(quote_amount, "quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.frequency = frequency;
                this.start_date = date;
                this.quote_amount = quote_amount;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m27704newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof RecurringInfo)) {
                    return false;
                }
                RecurringInfo recurringInfo = (RecurringInfo) other;
                return Intrinsics.areEqual(unknownFields(), recurringInfo.unknownFields()) && this.frequency == recurringInfo.frequency && Intrinsics.areEqual(this.start_date, recurringInfo.start_date) && Intrinsics.areEqual(this.quote_amount, recurringInfo.quote_amount);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = ((unknownFields().hashCode() * 37) + this.frequency.hashCode()) * 37;
                Date date = this.start_date;
                int iHashCode2 = ((iHashCode + (date != null ? date.hashCode() : 0)) * 37) + this.quote_amount.hashCode();
                this.hashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("frequency=" + this.frequency);
                Date date = this.start_date;
                if (date != null) {
                    arrayList.add("start_date=" + date);
                }
                arrayList.add("quote_amount=" + Internal.sanitize(this.quote_amount));
                return CollectionsKt.joinToString$default(arrayList, ", ", "RecurringInfo{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ RecurringInfo copy$default(RecurringInfo recurringInfo, InvestmentFrequency investmentFrequency, Date date, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    investmentFrequency = recurringInfo.frequency;
                }
                if ((i & 2) != 0) {
                    date = recurringInfo.start_date;
                }
                if ((i & 4) != 0) {
                    str = recurringInfo.quote_amount;
                }
                if ((i & 8) != 0) {
                    byteString = recurringInfo.unknownFields();
                }
                return recurringInfo.copy(investmentFrequency, date, str, byteString);
            }

            public final RecurringInfo copy(InvestmentFrequency frequency, Date start_date, String quote_amount, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(frequency, "frequency");
                Intrinsics.checkNotNullParameter(quote_amount, "quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new RecurringInfo(frequency, start_date, quote_amount, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RecurringInfo.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<RecurringInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequest$CryptoTrading$RecurringInfo$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (value.getFrequency() != StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.INVESTMENT_FREQUENCY_UNSPECIFIED) {
                            size += StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.ADAPTER.encodedSizeWithTag(1, value.getFrequency());
                        }
                        if (value.getStart_date() != null) {
                            size += Date.ADAPTER.encodedSizeWithTag(2, value.getStart_date());
                        }
                        return !Intrinsics.areEqual(value.getQuote_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getQuote_amount()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (value.getFrequency() != StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.INVESTMENT_FREQUENCY_UNSPECIFIED) {
                            StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.ADAPTER.encodeWithTag(writer, 1, (int) value.getFrequency());
                        }
                        if (value.getStart_date() != null) {
                            Date.ADAPTER.encodeWithTag(writer, 2, (int) value.getStart_date());
                        }
                        if (!Intrinsics.areEqual(value.getQuote_amount(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuote_amount());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (!Intrinsics.areEqual(value.getQuote_amount(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuote_amount());
                        }
                        if (value.getStart_date() != null) {
                            Date.ADAPTER.encodeWithTag(writer, 2, (int) value.getStart_date());
                        }
                        if (value.getFrequency() != StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.INVESTMENT_FREQUENCY_UNSPECIFIED) {
                            StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.ADAPTER.encodeWithTag(writer, 1, (int) value.getFrequency());
                        }
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency investmentFrequencyDecode = StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.INVESTMENT_FREQUENCY_UNSPECIFIED;
                        long jBeginMessage = reader.beginMessage();
                        Date dateDecode = null;
                        String strDecode = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo(investmentFrequencyDecode, dateDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                try {
                                    investmentFrequencyDecode = StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 2) {
                                dateDecode = Date.ADAPTER.decode(reader);
                            } else if (iNextTag == 3) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo redact(StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        Date start_date = value.getStart_date();
                        return StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo.copy$default(value, null, start_date != null ? Date.ADAPTER.redact(start_date) : null, null, ByteString.EMPTY, 5, null);
                    }
                };
            }
        }
    }
}
