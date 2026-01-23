package idl.recurring.proto.p474v1;

import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.common.Money;
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

/* compiled from: GetScheduleConfigResponse.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'Bm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u000bH\u0016Jl\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019¨\u0006("}, m3636d2 = {"Lidl/recurring/proto/v1/GetScheduleConfigResponse;", "Lcom/squareup/wire/Message;", "", "min_start_date", "Lcom/robinhood/rosetta/common/Date;", "max_start_date", "weekend_enabled", "", "buying_power", "Lcom/robinhood/rosetta/common/Money;", "fee_ratio", "", "min_order_size", "max_order_size", "min_fee", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/common/Date;Lcom/robinhood/rosetta/common/Date;ZLcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getMin_start_date", "()Lcom/robinhood/rosetta/common/Date;", "getMax_start_date", "getWeekend_enabled", "()Z", "getBuying_power", "()Lcom/robinhood/rosetta/common/Money;", "getFee_ratio", "()Ljava/lang/String;", "getMin_order_size", "getMax_order_size", "getMin_fee", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.recurring.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GetScheduleConfigResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetScheduleConfigResponse> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "buyingPower", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money buying_power;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feeRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String fee_ratio;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "maxOrderSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Money max_order_size;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "maxStartDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Date max_start_date;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "minFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Money min_fee;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "minOrderSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Money min_order_size;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "minStartDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Date min_start_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "weekendEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean weekend_enabled;

    public GetScheduleConfigResponse() {
        this(null, null, false, null, null, null, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28443newBuilder();
    }

    public final Date getMin_start_date() {
        return this.min_start_date;
    }

    public final Date getMax_start_date() {
        return this.max_start_date;
    }

    public final boolean getWeekend_enabled() {
        return this.weekend_enabled;
    }

    public final Money getBuying_power() {
        return this.buying_power;
    }

    public final String getFee_ratio() {
        return this.fee_ratio;
    }

    public /* synthetic */ GetScheduleConfigResponse(Date date, Date date2, boolean z, Money money, String str, Money money2, Money money3, Money money4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : date, (i & 2) != 0 ? null : date2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : money, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? null : money2, (i & 64) != 0 ? null : money3, (i & 128) != 0 ? null : money4, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Money getMin_order_size() {
        return this.min_order_size;
    }

    public final Money getMax_order_size() {
        return this.max_order_size;
    }

    public final Money getMin_fee() {
        return this.min_fee;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetScheduleConfigResponse(Date date, Date date2, boolean z, Money money, String fee_ratio, Money money2, Money money3, Money money4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.min_start_date = date;
        this.max_start_date = date2;
        this.weekend_enabled = z;
        this.buying_power = money;
        this.fee_ratio = fee_ratio;
        this.min_order_size = money2;
        this.max_order_size = money3;
        this.min_fee = money4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28443newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetScheduleConfigResponse)) {
            return false;
        }
        GetScheduleConfigResponse getScheduleConfigResponse = (GetScheduleConfigResponse) other;
        return Intrinsics.areEqual(unknownFields(), getScheduleConfigResponse.unknownFields()) && Intrinsics.areEqual(this.min_start_date, getScheduleConfigResponse.min_start_date) && Intrinsics.areEqual(this.max_start_date, getScheduleConfigResponse.max_start_date) && this.weekend_enabled == getScheduleConfigResponse.weekend_enabled && Intrinsics.areEqual(this.buying_power, getScheduleConfigResponse.buying_power) && Intrinsics.areEqual(this.fee_ratio, getScheduleConfigResponse.fee_ratio) && Intrinsics.areEqual(this.min_order_size, getScheduleConfigResponse.min_order_size) && Intrinsics.areEqual(this.max_order_size, getScheduleConfigResponse.max_order_size) && Intrinsics.areEqual(this.min_fee, getScheduleConfigResponse.min_fee);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Date date = this.min_start_date;
        int iHashCode2 = (iHashCode + (date != null ? date.hashCode() : 0)) * 37;
        Date date2 = this.max_start_date;
        int iHashCode3 = (((iHashCode2 + (date2 != null ? date2.hashCode() : 0)) * 37) + Boolean.hashCode(this.weekend_enabled)) * 37;
        Money money = this.buying_power;
        int iHashCode4 = (((iHashCode3 + (money != null ? money.hashCode() : 0)) * 37) + this.fee_ratio.hashCode()) * 37;
        Money money2 = this.min_order_size;
        int iHashCode5 = (iHashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.max_order_size;
        int iHashCode6 = (iHashCode5 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.min_fee;
        int iHashCode7 = iHashCode6 + (money4 != null ? money4.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Date date = this.min_start_date;
        if (date != null) {
            arrayList.add("min_start_date=" + date);
        }
        Date date2 = this.max_start_date;
        if (date2 != null) {
            arrayList.add("max_start_date=" + date2);
        }
        arrayList.add("weekend_enabled=" + this.weekend_enabled);
        Money money = this.buying_power;
        if (money != null) {
            arrayList.add("buying_power=" + money);
        }
        arrayList.add("fee_ratio=" + Internal.sanitize(this.fee_ratio));
        Money money2 = this.min_order_size;
        if (money2 != null) {
            arrayList.add("min_order_size=" + money2);
        }
        Money money3 = this.max_order_size;
        if (money3 != null) {
            arrayList.add("max_order_size=" + money3);
        }
        Money money4 = this.min_fee;
        if (money4 != null) {
            arrayList.add("min_fee=" + money4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetScheduleConfigResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetScheduleConfigResponse copy$default(GetScheduleConfigResponse getScheduleConfigResponse, Date date, Date date2, boolean z, Money money, String str, Money money2, Money money3, Money money4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            date = getScheduleConfigResponse.min_start_date;
        }
        if ((i & 2) != 0) {
            date2 = getScheduleConfigResponse.max_start_date;
        }
        if ((i & 4) != 0) {
            z = getScheduleConfigResponse.weekend_enabled;
        }
        if ((i & 8) != 0) {
            money = getScheduleConfigResponse.buying_power;
        }
        if ((i & 16) != 0) {
            str = getScheduleConfigResponse.fee_ratio;
        }
        if ((i & 32) != 0) {
            money2 = getScheduleConfigResponse.min_order_size;
        }
        if ((i & 64) != 0) {
            money3 = getScheduleConfigResponse.max_order_size;
        }
        if ((i & 128) != 0) {
            money4 = getScheduleConfigResponse.min_fee;
        }
        if ((i & 256) != 0) {
            byteString = getScheduleConfigResponse.unknownFields();
        }
        Money money5 = money4;
        ByteString byteString2 = byteString;
        Money money6 = money2;
        Money money7 = money3;
        String str2 = str;
        boolean z2 = z;
        return getScheduleConfigResponse.copy(date, date2, z2, money, str2, money6, money7, money5, byteString2);
    }

    public final GetScheduleConfigResponse copy(Date min_start_date, Date max_start_date, boolean weekend_enabled, Money buying_power, String fee_ratio, Money min_order_size, Money max_order_size, Money min_fee, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetScheduleConfigResponse(min_start_date, max_start_date, weekend_enabled, buying_power, fee_ratio, min_order_size, max_order_size, min_fee, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetScheduleConfigResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetScheduleConfigResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: idl.recurring.proto.v1.GetScheduleConfigResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetScheduleConfigResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMin_start_date() != null) {
                    size += Date.ADAPTER.encodedSizeWithTag(1, value.getMin_start_date());
                }
                if (value.getMax_start_date() != null) {
                    size += Date.ADAPTER.encodedSizeWithTag(2, value.getMax_start_date());
                }
                if (value.getWeekend_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getWeekend_enabled()));
                }
                if (value.getBuying_power() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getBuying_power());
                }
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getFee_ratio());
                }
                if (value.getMin_order_size() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(6, value.getMin_order_size());
                }
                if (value.getMax_order_size() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(7, value.getMax_order_size());
                }
                return value.getMin_fee() != null ? size + Money.ADAPTER.encodedSizeWithTag(8, value.getMin_fee()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetScheduleConfigResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMin_start_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 1, (int) value.getMin_start_date());
                }
                if (value.getMax_start_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 2, (int) value.getMax_start_date());
                }
                if (value.getWeekend_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getWeekend_enabled()));
                }
                if (value.getBuying_power() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getBuying_power());
                }
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getFee_ratio());
                }
                if (value.getMin_order_size() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getMin_order_size());
                }
                if (value.getMax_order_size() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getMax_order_size());
                }
                if (value.getMin_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getMin_fee());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetScheduleConfigResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getMin_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getMin_fee());
                }
                if (value.getMax_order_size() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getMax_order_size());
                }
                if (value.getMin_order_size() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getMin_order_size());
                }
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getFee_ratio());
                }
                if (value.getBuying_power() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getBuying_power());
                }
                if (value.getWeekend_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getWeekend_enabled()));
                }
                if (value.getMax_start_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 2, (int) value.getMax_start_date());
                }
                if (value.getMin_start_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 1, (int) value.getMin_start_date());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetScheduleConfigResponse redact(GetScheduleConfigResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Date min_start_date = value.getMin_start_date();
                Date dateRedact = min_start_date != null ? Date.ADAPTER.redact(min_start_date) : null;
                Date max_start_date = value.getMax_start_date();
                Date dateRedact2 = max_start_date != null ? Date.ADAPTER.redact(max_start_date) : null;
                Money buying_power = value.getBuying_power();
                Money moneyRedact = buying_power != null ? Money.ADAPTER.redact(buying_power) : null;
                Money min_order_size = value.getMin_order_size();
                Money moneyRedact2 = min_order_size != null ? Money.ADAPTER.redact(min_order_size) : null;
                Money max_order_size = value.getMax_order_size();
                Money moneyRedact3 = max_order_size != null ? Money.ADAPTER.redact(max_order_size) : null;
                Money min_fee = value.getMin_fee();
                return GetScheduleConfigResponse.copy$default(value, dateRedact, dateRedact2, false, moneyRedact, null, moneyRedact2, moneyRedact3, min_fee != null ? Money.ADAPTER.redact(min_fee) : null, ByteString.EMPTY, 20, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetScheduleConfigResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Date dateDecode = null;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                boolean zBooleanValue = false;
                String strDecode = "";
                Date dateDecode2 = null;
                Money moneyDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                dateDecode = Date.ADAPTER.decode(reader);
                                break;
                            case 2:
                                dateDecode2 = Date.ADAPTER.decode(reader);
                                break;
                            case 3:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 4:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                break;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 7:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 8:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetScheduleConfigResponse(dateDecode, dateDecode2, zBooleanValue, moneyDecode4, strDecode, moneyDecode, moneyDecode2, moneyDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
