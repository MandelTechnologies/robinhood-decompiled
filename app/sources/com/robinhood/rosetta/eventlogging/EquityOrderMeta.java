package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.rosetta.eventlogging.EquityOrderMeta;
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
import rosetta.account.BrokerageAccountType;

/* compiled from: EquityOrderMeta.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004*+,-BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016JX\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta;", "Lcom/squareup/wire/Message;", "", "existing_order_id", "", "source", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source;", "ipo_access_status", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus;", "quote", "Lcom/robinhood/rosetta/eventlogging/Quote;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/account/BrokerageAccountType;", "order_to_replace_id", "order_form_type", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$OrderFormType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source;Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus;Lcom/robinhood/rosetta/eventlogging/Quote;Lrosetta/account/BrokerageAccountType;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$OrderFormType;Lokio/ByteString;)V", "getExisting_order_id", "()Ljava/lang/String;", "getSource", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source;", "getIpo_access_status", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus;", "getQuote", "()Lcom/robinhood/rosetta/eventlogging/Quote;", "getAccount_type", "()Lrosetta/account/BrokerageAccountType;", "getOrder_to_replace_id", "getOrder_form_type", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$OrderFormType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Source", "IPOAccessStatus", "OrderFormType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class EquityOrderMeta extends Message {

    @JvmField
    public static final ProtoAdapter<EquityOrderMeta> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "rosetta.account.BrokerageAccountType#ADAPTER", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final BrokerageAccountType account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "existingOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String existing_order_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EquityOrderMeta$IPOAccessStatus#ADAPTER", jsonName = "ipoAccessStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final IPOAccessStatus ipo_access_status;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EquityOrderMeta$OrderFormType#ADAPTER", jsonName = "orderFormType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final OrderFormType order_form_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderToReplaceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String order_to_replace_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Quote#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Quote quote;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EquityOrderMeta$Source#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Source source;

    public EquityOrderMeta() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ EquityOrderMeta(String str, Source source, IPOAccessStatus iPOAccessStatus, Quote quote, BrokerageAccountType brokerageAccountType, String str2, OrderFormType orderFormType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Source.SOURCE_UNSPECIFIED : source, (i & 4) != 0 ? IPOAccessStatus.IPO_ACCESS_STATUS_UNSPECIFIED : iPOAccessStatus, (i & 8) != 0 ? null : quote, (i & 16) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? OrderFormType.ORDER_FORM_TYPE_UNSPECIFIED : orderFormType, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24249newBuilder();
    }

    public final String getExisting_order_id() {
        return this.existing_order_id;
    }

    public final Source getSource() {
        return this.source;
    }

    public final IPOAccessStatus getIpo_access_status() {
        return this.ipo_access_status;
    }

    public final Quote getQuote() {
        return this.quote;
    }

    public final BrokerageAccountType getAccount_type() {
        return this.account_type;
    }

    public final String getOrder_to_replace_id() {
        return this.order_to_replace_id;
    }

    public final OrderFormType getOrder_form_type() {
        return this.order_form_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityOrderMeta(String existing_order_id, Source source, IPOAccessStatus ipo_access_status, Quote quote, BrokerageAccountType account_type, String order_to_replace_id, OrderFormType order_form_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(existing_order_id, "existing_order_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(ipo_access_status, "ipo_access_status");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(order_to_replace_id, "order_to_replace_id");
        Intrinsics.checkNotNullParameter(order_form_type, "order_form_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.existing_order_id = existing_order_id;
        this.source = source;
        this.ipo_access_status = ipo_access_status;
        this.quote = quote;
        this.account_type = account_type;
        this.order_to_replace_id = order_to_replace_id;
        this.order_form_type = order_form_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24249newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EquityOrderMeta)) {
            return false;
        }
        EquityOrderMeta equityOrderMeta = (EquityOrderMeta) other;
        return Intrinsics.areEqual(unknownFields(), equityOrderMeta.unknownFields()) && Intrinsics.areEqual(this.existing_order_id, equityOrderMeta.existing_order_id) && this.source == equityOrderMeta.source && this.ipo_access_status == equityOrderMeta.ipo_access_status && Intrinsics.areEqual(this.quote, equityOrderMeta.quote) && this.account_type == equityOrderMeta.account_type && Intrinsics.areEqual(this.order_to_replace_id, equityOrderMeta.order_to_replace_id) && this.order_form_type == equityOrderMeta.order_form_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.existing_order_id.hashCode()) * 37) + this.source.hashCode()) * 37) + this.ipo_access_status.hashCode()) * 37;
        Quote quote = this.quote;
        int iHashCode2 = ((((((iHashCode + (quote != null ? quote.hashCode() : 0)) * 37) + this.account_type.hashCode()) * 37) + this.order_to_replace_id.hashCode()) * 37) + this.order_form_type.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("existing_order_id=" + Internal.sanitize(this.existing_order_id));
        arrayList.add("source=" + this.source);
        arrayList.add("ipo_access_status=" + this.ipo_access_status);
        Quote quote = this.quote;
        if (quote != null) {
            arrayList.add("quote=" + quote);
        }
        arrayList.add("account_type=" + this.account_type);
        arrayList.add("order_to_replace_id=" + Internal.sanitize(this.order_to_replace_id));
        arrayList.add("order_form_type=" + this.order_form_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "EquityOrderMeta{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EquityOrderMeta copy$default(EquityOrderMeta equityOrderMeta, String str, Source source, IPOAccessStatus iPOAccessStatus, Quote quote, BrokerageAccountType brokerageAccountType, String str2, OrderFormType orderFormType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = equityOrderMeta.existing_order_id;
        }
        if ((i & 2) != 0) {
            source = equityOrderMeta.source;
        }
        if ((i & 4) != 0) {
            iPOAccessStatus = equityOrderMeta.ipo_access_status;
        }
        if ((i & 8) != 0) {
            quote = equityOrderMeta.quote;
        }
        if ((i & 16) != 0) {
            brokerageAccountType = equityOrderMeta.account_type;
        }
        if ((i & 32) != 0) {
            str2 = equityOrderMeta.order_to_replace_id;
        }
        if ((i & 64) != 0) {
            orderFormType = equityOrderMeta.order_form_type;
        }
        if ((i & 128) != 0) {
            byteString = equityOrderMeta.unknownFields();
        }
        OrderFormType orderFormType2 = orderFormType;
        ByteString byteString2 = byteString;
        BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
        String str3 = str2;
        return equityOrderMeta.copy(str, source, iPOAccessStatus, quote, brokerageAccountType2, str3, orderFormType2, byteString2);
    }

    public final EquityOrderMeta copy(String existing_order_id, Source source, IPOAccessStatus ipo_access_status, Quote quote, BrokerageAccountType account_type, String order_to_replace_id, OrderFormType order_form_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(existing_order_id, "existing_order_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(ipo_access_status, "ipo_access_status");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(order_to_replace_id, "order_to_replace_id");
        Intrinsics.checkNotNullParameter(order_form_type, "order_form_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EquityOrderMeta(existing_order_id, source, ipo_access_status, quote, account_type, order_to_replace_id, order_form_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EquityOrderMeta.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EquityOrderMeta>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.EquityOrderMeta$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EquityOrderMeta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getExisting_order_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getExisting_order_id());
                }
                if (value.getSource() != EquityOrderMeta.Source.SOURCE_UNSPECIFIED) {
                    size += EquityOrderMeta.Source.ADAPTER.encodedSizeWithTag(2, value.getSource());
                }
                if (value.getIpo_access_status() != EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_UNSPECIFIED) {
                    size += EquityOrderMeta.IPOAccessStatus.ADAPTER.encodedSizeWithTag(3, value.getIpo_access_status());
                }
                if (value.getQuote() != null) {
                    size += Quote.ADAPTER.encodedSizeWithTag(4, value.getQuote());
                }
                if (value.getAccount_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    size += BrokerageAccountType.ADAPTER.encodedSizeWithTag(5, value.getAccount_type());
                }
                if (!Intrinsics.areEqual(value.getOrder_to_replace_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getOrder_to_replace_id());
                }
                return value.getOrder_form_type() != EquityOrderMeta.OrderFormType.ORDER_FORM_TYPE_UNSPECIFIED ? size + EquityOrderMeta.OrderFormType.ADAPTER.encodedSizeWithTag(7, value.getOrder_form_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EquityOrderMeta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getExisting_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getExisting_order_id());
                }
                if (value.getSource() != EquityOrderMeta.Source.SOURCE_UNSPECIFIED) {
                    EquityOrderMeta.Source.ADAPTER.encodeWithTag(writer, 2, (int) value.getSource());
                }
                if (value.getIpo_access_status() != EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_UNSPECIFIED) {
                    EquityOrderMeta.IPOAccessStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getIpo_access_status());
                }
                if (value.getQuote() != null) {
                    Quote.ADAPTER.encodeWithTag(writer, 4, (int) value.getQuote());
                }
                if (value.getAccount_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 5, (int) value.getAccount_type());
                }
                if (!Intrinsics.areEqual(value.getOrder_to_replace_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getOrder_to_replace_id());
                }
                if (value.getOrder_form_type() != EquityOrderMeta.OrderFormType.ORDER_FORM_TYPE_UNSPECIFIED) {
                    EquityOrderMeta.OrderFormType.ADAPTER.encodeWithTag(writer, 7, (int) value.getOrder_form_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EquityOrderMeta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOrder_form_type() != EquityOrderMeta.OrderFormType.ORDER_FORM_TYPE_UNSPECIFIED) {
                    EquityOrderMeta.OrderFormType.ADAPTER.encodeWithTag(writer, 7, (int) value.getOrder_form_type());
                }
                if (!Intrinsics.areEqual(value.getOrder_to_replace_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getOrder_to_replace_id());
                }
                if (value.getAccount_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 5, (int) value.getAccount_type());
                }
                if (value.getQuote() != null) {
                    Quote.ADAPTER.encodeWithTag(writer, 4, (int) value.getQuote());
                }
                if (value.getIpo_access_status() != EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_UNSPECIFIED) {
                    EquityOrderMeta.IPOAccessStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getIpo_access_status());
                }
                if (value.getSource() != EquityOrderMeta.Source.SOURCE_UNSPECIFIED) {
                    EquityOrderMeta.Source.ADAPTER.encodeWithTag(writer, 2, (int) value.getSource());
                }
                if (Intrinsics.areEqual(value.getExisting_order_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getExisting_order_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EquityOrderMeta decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                EquityOrderMeta.Source sourceDecode = EquityOrderMeta.Source.SOURCE_UNSPECIFIED;
                EquityOrderMeta.IPOAccessStatus iPOAccessStatus = EquityOrderMeta.IPOAccessStatus.IPO_ACCESS_STATUS_UNSPECIFIED;
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                EquityOrderMeta.OrderFormType orderFormType = EquityOrderMeta.OrderFormType.ORDER_FORM_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Quote quoteDecode = null;
                EquityOrderMeta.OrderFormType orderFormTypeDecode = orderFormType;
                String strDecode2 = strDecode;
                BrokerageAccountType brokerageAccountTypeDecode = brokerageAccountType;
                EquityOrderMeta.IPOAccessStatus iPOAccessStatusDecode = iPOAccessStatus;
                while (true) {
                    EquityOrderMeta.Source source = sourceDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        sourceDecode = EquityOrderMeta.Source.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    try {
                                        iPOAccessStatusDecode = EquityOrderMeta.IPOAccessStatus.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 4:
                                    quoteDecode = Quote.ADAPTER.decode(reader);
                                    break;
                                case 5:
                                    try {
                                        brokerageAccountTypeDecode = BrokerageAccountType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 6:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    try {
                                        orderFormTypeDecode = EquityOrderMeta.OrderFormType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new EquityOrderMeta(strDecode2, source, iPOAccessStatusDecode, quoteDecode, brokerageAccountTypeDecode, strDecode, orderFormTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EquityOrderMeta redact(EquityOrderMeta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Quote quote = value.getQuote();
                return EquityOrderMeta.copy$default(value, null, null, null, quote != null ? Quote.ADAPTER.redact(quote) : null, null, null, null, ByteString.EMPTY, 119, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EquityOrderMeta.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SOURCE_UNSPECIFIED", "SOURCE_STOCK_DETAIL", "SOURCE_ORDER_DETAIL", "SOURCE_INBOX_DEEPLINK", "SOURCE_PUSH_NOTIFICATION_DEEPLINK", "SOURCE_EMAIL_DEEPLINK", "SOURCE_INSTRUMENT_ROW", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Source implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Source> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Source SOURCE_EMAIL_DEEPLINK;
        public static final Source SOURCE_INBOX_DEEPLINK;
        public static final Source SOURCE_INSTRUMENT_ROW;
        public static final Source SOURCE_ORDER_DETAIL;
        public static final Source SOURCE_PUSH_NOTIFICATION_DEEPLINK;
        public static final Source SOURCE_STOCK_DETAIL;
        public static final Source SOURCE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Source[] $values() {
            return new Source[]{SOURCE_UNSPECIFIED, SOURCE_STOCK_DETAIL, SOURCE_ORDER_DETAIL, SOURCE_INBOX_DEEPLINK, SOURCE_PUSH_NOTIFICATION_DEEPLINK, SOURCE_EMAIL_DEEPLINK, SOURCE_INSTRUMENT_ROW};
        }

        @JvmStatic
        public static final Source fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Source> getEntries() {
            return $ENTRIES;
        }

        private Source(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Source source = new Source("SOURCE_UNSPECIFIED", 0, 0);
            SOURCE_UNSPECIFIED = source;
            SOURCE_STOCK_DETAIL = new Source("SOURCE_STOCK_DETAIL", 1, 1);
            SOURCE_ORDER_DETAIL = new Source("SOURCE_ORDER_DETAIL", 2, 2);
            SOURCE_INBOX_DEEPLINK = new Source("SOURCE_INBOX_DEEPLINK", 3, 3);
            SOURCE_PUSH_NOTIFICATION_DEEPLINK = new Source("SOURCE_PUSH_NOTIFICATION_DEEPLINK", 4, 4);
            SOURCE_EMAIL_DEEPLINK = new Source("SOURCE_EMAIL_DEEPLINK", 5, 5);
            SOURCE_INSTRUMENT_ROW = new Source("SOURCE_INSTRUMENT_ROW", 6, 6);
            Source[] sourceArr$values = $values();
            $VALUES = sourceArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Source.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Source>(orCreateKotlinClass, syntax, source) { // from class: com.robinhood.rosetta.eventlogging.EquityOrderMeta$Source$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public EquityOrderMeta.Source fromValue(int value) {
                    return EquityOrderMeta.Source.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: EquityOrderMeta.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$Source;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Source fromValue(int value) {
                switch (value) {
                    case 0:
                        return Source.SOURCE_UNSPECIFIED;
                    case 1:
                        return Source.SOURCE_STOCK_DETAIL;
                    case 2:
                        return Source.SOURCE_ORDER_DETAIL;
                    case 3:
                        return Source.SOURCE_INBOX_DEEPLINK;
                    case 4:
                        return Source.SOURCE_PUSH_NOTIFICATION_DEEPLINK;
                    case 5:
                        return Source.SOURCE_EMAIL_DEEPLINK;
                    case 6:
                        return Source.SOURCE_INSTRUMENT_ROW;
                    default:
                        return null;
                }
            }
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EquityOrderMeta.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "IPO_ACCESS_STATUS_UNSPECIFIED", "IPO_ACCESS_STATUS_S1_FILED", "IPO_ACCESS_STATUS_PRICE_INITIALIZED", "IPO_ACCESS_STATUS_PRICE_FINALIZED", "IPO_ACCESS_STATUS_PUBLIC", "IPO_ACCESS_STATUS_CANCELED", "IPO_ACCESS_STATUS_DELAYED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class IPOAccessStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IPOAccessStatus[] $VALUES;

        @JvmField
        public static final ProtoAdapter<IPOAccessStatus> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final IPOAccessStatus IPO_ACCESS_STATUS_CANCELED;
        public static final IPOAccessStatus IPO_ACCESS_STATUS_DELAYED;
        public static final IPOAccessStatus IPO_ACCESS_STATUS_PRICE_FINALIZED;
        public static final IPOAccessStatus IPO_ACCESS_STATUS_PRICE_INITIALIZED;
        public static final IPOAccessStatus IPO_ACCESS_STATUS_PUBLIC;
        public static final IPOAccessStatus IPO_ACCESS_STATUS_S1_FILED;
        public static final IPOAccessStatus IPO_ACCESS_STATUS_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ IPOAccessStatus[] $values() {
            return new IPOAccessStatus[]{IPO_ACCESS_STATUS_UNSPECIFIED, IPO_ACCESS_STATUS_S1_FILED, IPO_ACCESS_STATUS_PRICE_INITIALIZED, IPO_ACCESS_STATUS_PRICE_FINALIZED, IPO_ACCESS_STATUS_PUBLIC, IPO_ACCESS_STATUS_CANCELED, IPO_ACCESS_STATUS_DELAYED};
        }

        @JvmStatic
        public static final IPOAccessStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<IPOAccessStatus> getEntries() {
            return $ENTRIES;
        }

        private IPOAccessStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final IPOAccessStatus iPOAccessStatus = new IPOAccessStatus("IPO_ACCESS_STATUS_UNSPECIFIED", 0, 0);
            IPO_ACCESS_STATUS_UNSPECIFIED = iPOAccessStatus;
            IPO_ACCESS_STATUS_S1_FILED = new IPOAccessStatus("IPO_ACCESS_STATUS_S1_FILED", 1, 1);
            IPO_ACCESS_STATUS_PRICE_INITIALIZED = new IPOAccessStatus("IPO_ACCESS_STATUS_PRICE_INITIALIZED", 2, 2);
            IPO_ACCESS_STATUS_PRICE_FINALIZED = new IPOAccessStatus("IPO_ACCESS_STATUS_PRICE_FINALIZED", 3, 3);
            IPO_ACCESS_STATUS_PUBLIC = new IPOAccessStatus("IPO_ACCESS_STATUS_PUBLIC", 4, 4);
            IPO_ACCESS_STATUS_CANCELED = new IPOAccessStatus("IPO_ACCESS_STATUS_CANCELED", 5, 5);
            IPO_ACCESS_STATUS_DELAYED = new IPOAccessStatus("IPO_ACCESS_STATUS_DELAYED", 6, 6);
            IPOAccessStatus[] iPOAccessStatusArr$values = $values();
            $VALUES = iPOAccessStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(iPOAccessStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IPOAccessStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<IPOAccessStatus>(orCreateKotlinClass, syntax, iPOAccessStatus) { // from class: com.robinhood.rosetta.eventlogging.EquityOrderMeta$IPOAccessStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public EquityOrderMeta.IPOAccessStatus fromValue(int value) {
                    return EquityOrderMeta.IPOAccessStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: EquityOrderMeta.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$IPOAccessStatus;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final IPOAccessStatus fromValue(int value) {
                switch (value) {
                    case 0:
                        return IPOAccessStatus.IPO_ACCESS_STATUS_UNSPECIFIED;
                    case 1:
                        return IPOAccessStatus.IPO_ACCESS_STATUS_S1_FILED;
                    case 2:
                        return IPOAccessStatus.IPO_ACCESS_STATUS_PRICE_INITIALIZED;
                    case 3:
                        return IPOAccessStatus.IPO_ACCESS_STATUS_PRICE_FINALIZED;
                    case 4:
                        return IPOAccessStatus.IPO_ACCESS_STATUS_PUBLIC;
                    case 5:
                        return IPOAccessStatus.IPO_ACCESS_STATUS_CANCELED;
                    case 6:
                        return IPOAccessStatus.IPO_ACCESS_STATUS_DELAYED;
                    default:
                        return null;
                }
            }
        }

        public static IPOAccessStatus valueOf(String str) {
            return (IPOAccessStatus) Enum.valueOf(IPOAccessStatus.class, str);
        }

        public static IPOAccessStatus[] values() {
            return (IPOAccessStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EquityOrderMeta.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$OrderFormType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_FORM_TYPE_UNSPECIFIED", "ORDER_FORM_TYPE_DOLLARS", "ORDER_FORM_TYPE_SHARES", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class OrderFormType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OrderFormType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OrderFormType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OrderFormType ORDER_FORM_TYPE_DOLLARS;
        public static final OrderFormType ORDER_FORM_TYPE_SHARES;
        public static final OrderFormType ORDER_FORM_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ OrderFormType[] $values() {
            return new OrderFormType[]{ORDER_FORM_TYPE_UNSPECIFIED, ORDER_FORM_TYPE_DOLLARS, ORDER_FORM_TYPE_SHARES};
        }

        @JvmStatic
        public static final OrderFormType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OrderFormType> getEntries() {
            return $ENTRIES;
        }

        private OrderFormType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OrderFormType orderFormType = new OrderFormType("ORDER_FORM_TYPE_UNSPECIFIED", 0, 0);
            ORDER_FORM_TYPE_UNSPECIFIED = orderFormType;
            ORDER_FORM_TYPE_DOLLARS = new OrderFormType("ORDER_FORM_TYPE_DOLLARS", 1, 1);
            ORDER_FORM_TYPE_SHARES = new OrderFormType("ORDER_FORM_TYPE_SHARES", 2, 2);
            OrderFormType[] orderFormTypeArr$values = $values();
            $VALUES = orderFormTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(orderFormTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderFormType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OrderFormType>(orCreateKotlinClass, syntax, orderFormType) { // from class: com.robinhood.rosetta.eventlogging.EquityOrderMeta$OrderFormType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public EquityOrderMeta.OrderFormType fromValue(int value) {
                    return EquityOrderMeta.OrderFormType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: EquityOrderMeta.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$OrderFormType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderMeta$OrderFormType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OrderFormType fromValue(int value) {
                if (value == 0) {
                    return OrderFormType.ORDER_FORM_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return OrderFormType.ORDER_FORM_TYPE_DOLLARS;
                }
                if (value != 2) {
                    return null;
                }
                return OrderFormType.ORDER_FORM_TYPE_SHARES;
            }
        }

        public static OrderFormType valueOf(String str) {
            return (OrderFormType) Enum.valueOf(OrderFormType.class, str);
        }

        public static OrderFormType[] values() {
            return (OrderFormType[]) $VALUES.clone();
        }
    }
}
