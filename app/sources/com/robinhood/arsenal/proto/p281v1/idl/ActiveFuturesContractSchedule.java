package com.robinhood.arsenal.proto.p281v1.idl;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: ActiveFuturesContractSchedule.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedule;", "Lcom/squareup/wire/Message;", "", "futures_contract_id", "", "symbol", "start_date", "roll_time", "end_date", "product_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getFutures_contract_id", "()Ljava/lang/String;", "getSymbol", "getStart_date", "getRoll_time", "getEnd_date", "getProduct_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ActiveFuturesContractSchedule extends Message {

    @JvmField
    public static final ProtoAdapter<ActiveFuturesContractSchedule> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "endDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String end_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "futuresContractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String futures_contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "productId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String product_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rollTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String roll_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "startDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String start_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String symbol;

    public ActiveFuturesContractSchedule() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ ActiveFuturesContractSchedule(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20110newBuilder();
    }

    public final String getFutures_contract_id() {
        return this.futures_contract_id;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getStart_date() {
        return this.start_date;
    }

    public final String getRoll_time() {
        return this.roll_time;
    }

    public final String getEnd_date() {
        return this.end_date;
    }

    public final String getProduct_id() {
        return this.product_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveFuturesContractSchedule(String futures_contract_id, String symbol, String start_date, String roll_time, String end_date, String product_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(futures_contract_id, "futures_contract_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(start_date, "start_date");
        Intrinsics.checkNotNullParameter(roll_time, "roll_time");
        Intrinsics.checkNotNullParameter(end_date, "end_date");
        Intrinsics.checkNotNullParameter(product_id, "product_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.futures_contract_id = futures_contract_id;
        this.symbol = symbol;
        this.start_date = start_date;
        this.roll_time = roll_time;
        this.end_date = end_date;
        this.product_id = product_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20110newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ActiveFuturesContractSchedule)) {
            return false;
        }
        ActiveFuturesContractSchedule activeFuturesContractSchedule = (ActiveFuturesContractSchedule) other;
        return Intrinsics.areEqual(unknownFields(), activeFuturesContractSchedule.unknownFields()) && Intrinsics.areEqual(this.futures_contract_id, activeFuturesContractSchedule.futures_contract_id) && Intrinsics.areEqual(this.symbol, activeFuturesContractSchedule.symbol) && Intrinsics.areEqual(this.start_date, activeFuturesContractSchedule.start_date) && Intrinsics.areEqual(this.roll_time, activeFuturesContractSchedule.roll_time) && Intrinsics.areEqual(this.end_date, activeFuturesContractSchedule.end_date) && Intrinsics.areEqual(this.product_id, activeFuturesContractSchedule.product_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.futures_contract_id.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.start_date.hashCode()) * 37) + this.roll_time.hashCode()) * 37) + this.end_date.hashCode()) * 37) + this.product_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("futures_contract_id=" + Internal.sanitize(this.futures_contract_id));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("start_date=" + Internal.sanitize(this.start_date));
        arrayList.add("roll_time=" + Internal.sanitize(this.roll_time));
        arrayList.add("end_date=" + Internal.sanitize(this.end_date));
        arrayList.add("product_id=" + Internal.sanitize(this.product_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActiveFuturesContractSchedule{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ActiveFuturesContractSchedule copy$default(ActiveFuturesContractSchedule activeFuturesContractSchedule, String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activeFuturesContractSchedule.futures_contract_id;
        }
        if ((i & 2) != 0) {
            str2 = activeFuturesContractSchedule.symbol;
        }
        if ((i & 4) != 0) {
            str3 = activeFuturesContractSchedule.start_date;
        }
        if ((i & 8) != 0) {
            str4 = activeFuturesContractSchedule.roll_time;
        }
        if ((i & 16) != 0) {
            str5 = activeFuturesContractSchedule.end_date;
        }
        if ((i & 32) != 0) {
            str6 = activeFuturesContractSchedule.product_id;
        }
        if ((i & 64) != 0) {
            byteString = activeFuturesContractSchedule.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        String str8 = str5;
        String str9 = str3;
        return activeFuturesContractSchedule.copy(str, str2, str9, str4, str8, str7, byteString2);
    }

    public final ActiveFuturesContractSchedule copy(String futures_contract_id, String symbol, String start_date, String roll_time, String end_date, String product_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(futures_contract_id, "futures_contract_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(start_date, "start_date");
        Intrinsics.checkNotNullParameter(roll_time, "roll_time");
        Intrinsics.checkNotNullParameter(end_date, "end_date");
        Intrinsics.checkNotNullParameter(product_id, "product_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ActiveFuturesContractSchedule(futures_contract_id, symbol, start_date, roll_time, end_date, product_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActiveFuturesContractSchedule.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ActiveFuturesContractSchedule>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.ActiveFuturesContractSchedule$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ActiveFuturesContractSchedule value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getFutures_contract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getFutures_contract_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getStart_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getStart_date());
                }
                if (!Intrinsics.areEqual(value.getRoll_time(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getRoll_time());
                }
                if (!Intrinsics.areEqual(value.getEnd_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getEnd_date());
                }
                return !Intrinsics.areEqual(value.getProduct_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getProduct_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ActiveFuturesContractSchedule value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getFutures_contract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFutures_contract_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getStart_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getStart_date());
                }
                if (!Intrinsics.areEqual(value.getRoll_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRoll_time());
                }
                if (!Intrinsics.areEqual(value.getEnd_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getEnd_date());
                }
                if (!Intrinsics.areEqual(value.getProduct_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getProduct_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ActiveFuturesContractSchedule value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getProduct_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getProduct_id());
                }
                if (!Intrinsics.areEqual(value.getEnd_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getEnd_date());
                }
                if (!Intrinsics.areEqual(value.getRoll_time(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getRoll_time());
                }
                if (!Intrinsics.areEqual(value.getStart_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getStart_date());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSymbol());
                }
                if (Intrinsics.areEqual(value.getFutures_contract_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFutures_contract_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ActiveFuturesContractSchedule redact(ActiveFuturesContractSchedule value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ActiveFuturesContractSchedule.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ActiveFuturesContractSchedule decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ActiveFuturesContractSchedule(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
