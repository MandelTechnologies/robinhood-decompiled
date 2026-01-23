package com.robinhood.ceres.p284v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.common.Date;
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

/* compiled from: FuturesOrderExecution.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016Jb\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderExecution;", "Lcom/squareup/wire/Message;", "", "id", "", "order_id", "account_id", "quantity", "price_per_contract", "event_time", "master_id", "trade_date", "Lcom/robinhood/rosetta/common/Date;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Date;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getOrder_id", "getAccount_id", "getQuantity", "getPrice_per_contract", "getEvent_time", "getMaster_id", "getTrade_date", "()Lcom/robinhood/rosetta/common/Date;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FuturesOrderExecution extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesOrderExecution> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String event_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "masterId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String master_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pricePerContract", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String price_per_contract;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String quantity;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "tradeDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Date trade_date;

    public FuturesOrderExecution() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ FuturesOrderExecution(String str, String str2, String str3, String str4, String str5, String str6, String str7, Date date, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? null : date, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20326newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getPrice_per_contract() {
        return this.price_per_contract;
    }

    public final String getEvent_time() {
        return this.event_time;
    }

    public final String getMaster_id() {
        return this.master_id;
    }

    public final Date getTrade_date() {
        return this.trade_date;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesOrderExecution(String id, String order_id, String account_id, String quantity, String price_per_contract, String event_time, String master_id, Date date, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(price_per_contract, "price_per_contract");
        Intrinsics.checkNotNullParameter(event_time, "event_time");
        Intrinsics.checkNotNullParameter(master_id, "master_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.order_id = order_id;
        this.account_id = account_id;
        this.quantity = quantity;
        this.price_per_contract = price_per_contract;
        this.event_time = event_time;
        this.master_id = master_id;
        this.trade_date = date;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20326newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesOrderExecution)) {
            return false;
        }
        FuturesOrderExecution futuresOrderExecution = (FuturesOrderExecution) other;
        return Intrinsics.areEqual(unknownFields(), futuresOrderExecution.unknownFields()) && Intrinsics.areEqual(this.id, futuresOrderExecution.id) && Intrinsics.areEqual(this.order_id, futuresOrderExecution.order_id) && Intrinsics.areEqual(this.account_id, futuresOrderExecution.account_id) && Intrinsics.areEqual(this.quantity, futuresOrderExecution.quantity) && Intrinsics.areEqual(this.price_per_contract, futuresOrderExecution.price_per_contract) && Intrinsics.areEqual(this.event_time, futuresOrderExecution.event_time) && Intrinsics.areEqual(this.master_id, futuresOrderExecution.master_id) && Intrinsics.areEqual(this.trade_date, futuresOrderExecution.trade_date);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.order_id.hashCode()) * 37) + this.account_id.hashCode()) * 37) + this.quantity.hashCode()) * 37) + this.price_per_contract.hashCode()) * 37) + this.event_time.hashCode()) * 37) + this.master_id.hashCode()) * 37;
        Date date = this.trade_date;
        int iHashCode2 = iHashCode + (date != null ? date.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("price_per_contract=" + Internal.sanitize(this.price_per_contract));
        arrayList.add("event_time=" + Internal.sanitize(this.event_time));
        arrayList.add("master_id=" + Internal.sanitize(this.master_id));
        Date date = this.trade_date;
        if (date != null) {
            arrayList.add("trade_date=" + date);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesOrderExecution{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FuturesOrderExecution copy$default(FuturesOrderExecution futuresOrderExecution, String str, String str2, String str3, String str4, String str5, String str6, String str7, Date date, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresOrderExecution.id;
        }
        if ((i & 2) != 0) {
            str2 = futuresOrderExecution.order_id;
        }
        if ((i & 4) != 0) {
            str3 = futuresOrderExecution.account_id;
        }
        if ((i & 8) != 0) {
            str4 = futuresOrderExecution.quantity;
        }
        if ((i & 16) != 0) {
            str5 = futuresOrderExecution.price_per_contract;
        }
        if ((i & 32) != 0) {
            str6 = futuresOrderExecution.event_time;
        }
        if ((i & 64) != 0) {
            str7 = futuresOrderExecution.master_id;
        }
        if ((i & 128) != 0) {
            date = futuresOrderExecution.trade_date;
        }
        if ((i & 256) != 0) {
            byteString = futuresOrderExecution.unknownFields();
        }
        Date date2 = date;
        ByteString byteString2 = byteString;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return futuresOrderExecution.copy(str, str2, str11, str4, str10, str8, str9, date2, byteString2);
    }

    public final FuturesOrderExecution copy(String id, String order_id, String account_id, String quantity, String price_per_contract, String event_time, String master_id, Date trade_date, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(price_per_contract, "price_per_contract");
        Intrinsics.checkNotNullParameter(event_time, "event_time");
        Intrinsics.checkNotNullParameter(master_id, "master_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesOrderExecution(id, order_id, account_id, quantity, price_per_contract, event_time, master_id, trade_date, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesOrderExecution.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesOrderExecution>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.FuturesOrderExecution$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesOrderExecution value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getPrice_per_contract(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getPrice_per_contract());
                }
                if (!Intrinsics.areEqual(value.getEvent_time(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getEvent_time());
                }
                if (!Intrinsics.areEqual(value.getMaster_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getMaster_id());
                }
                return value.getTrade_date() != null ? size + Date.ADAPTER.encodedSizeWithTag(8, value.getTrade_date()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesOrderExecution value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getPrice_per_contract(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPrice_per_contract());
                }
                if (!Intrinsics.areEqual(value.getEvent_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getEvent_time());
                }
                if (!Intrinsics.areEqual(value.getMaster_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMaster_id());
                }
                if (value.getTrade_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 8, (int) value.getTrade_date());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesOrderExecution value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTrade_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 8, (int) value.getTrade_date());
                }
                if (!Intrinsics.areEqual(value.getMaster_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMaster_id());
                }
                if (!Intrinsics.areEqual(value.getEvent_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getEvent_time());
                }
                if (!Intrinsics.areEqual(value.getPrice_per_contract(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPrice_per_contract());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesOrderExecution redact(FuturesOrderExecution value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Date trade_date = value.getTrade_date();
                return FuturesOrderExecution.copy$default(value, null, null, null, null, null, null, null, trade_date != null ? Date.ADAPTER.redact(trade_date) : null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesOrderExecution decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                Date dateDecode = null;
                String strDecode7 = strDecode6;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                dateDecode = Date.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new FuturesOrderExecution(strDecode, strDecode7, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, dateDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
