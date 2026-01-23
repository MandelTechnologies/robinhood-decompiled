package rh_server_driven_ui.p531v1;

import com.robinhood.rosetta.common.Money;
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

/* compiled from: PriceChartData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J4\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/PriceChartData;", "Lcom/squareup/wire/Message;", "", "dollar_value", "Lcom/robinhood/rosetta/common/Money;", "dollar_value_for_return", "dollar_value_for_rate_of_return", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getDollar_value", "()Lcom/robinhood/rosetta/common/Money;", "getDollar_value_for_return", "getDollar_value_for_rate_of_return", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class PriceChartData extends Message {

    @JvmField
    public static final ProtoAdapter<PriceChartData> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "dollarValue", schemaIndex = 0, tag = 1)
    private final Money dollar_value;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "dollarValueForRateOfReturn", schemaIndex = 2, tag = 3)
    private final Money dollar_value_for_rate_of_return;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "dollarValueForReturn", schemaIndex = 1, tag = 2)
    private final Money dollar_value_for_return;

    public PriceChartData() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29798newBuilder();
    }

    public final Money getDollar_value() {
        return this.dollar_value;
    }

    public final Money getDollar_value_for_return() {
        return this.dollar_value_for_return;
    }

    public final Money getDollar_value_for_rate_of_return() {
        return this.dollar_value_for_rate_of_return;
    }

    public /* synthetic */ PriceChartData(Money money, Money money2, Money money3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, (i & 4) != 0 ? null : money3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceChartData(Money money, Money money2, Money money3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.dollar_value = money;
        this.dollar_value_for_return = money2;
        this.dollar_value_for_rate_of_return = money3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29798newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PriceChartData)) {
            return false;
        }
        PriceChartData priceChartData = (PriceChartData) other;
        return Intrinsics.areEqual(unknownFields(), priceChartData.unknownFields()) && Intrinsics.areEqual(this.dollar_value, priceChartData.dollar_value) && Intrinsics.areEqual(this.dollar_value_for_return, priceChartData.dollar_value_for_return) && Intrinsics.areEqual(this.dollar_value_for_rate_of_return, priceChartData.dollar_value_for_rate_of_return);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.dollar_value;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.dollar_value_for_return;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.dollar_value_for_rate_of_return;
        int iHashCode4 = iHashCode3 + (money3 != null ? money3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.dollar_value;
        if (money != null) {
            arrayList.add("dollar_value=" + money);
        }
        Money money2 = this.dollar_value_for_return;
        if (money2 != null) {
            arrayList.add("dollar_value_for_return=" + money2);
        }
        Money money3 = this.dollar_value_for_rate_of_return;
        if (money3 != null) {
            arrayList.add("dollar_value_for_rate_of_return=" + money3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PriceChartData{", "}", 0, null, null, 56, null);
    }

    public final PriceChartData copy(Money dollar_value, Money dollar_value_for_return, Money dollar_value_for_rate_of_return, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PriceChartData(dollar_value, dollar_value_for_return, dollar_value_for_rate_of_return, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PriceChartData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PriceChartData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.PriceChartData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PriceChartData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                return size + protoAdapter.encodedSizeWithTag(1, value.getDollar_value()) + protoAdapter.encodedSizeWithTag(2, value.getDollar_value_for_return()) + protoAdapter.encodedSizeWithTag(3, value.getDollar_value_for_rate_of_return());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PriceChartData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getDollar_value());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getDollar_value_for_return());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDollar_value_for_rate_of_return());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PriceChartData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDollar_value_for_rate_of_return());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getDollar_value_for_return());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getDollar_value());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PriceChartData redact(PriceChartData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money dollar_value = value.getDollar_value();
                Money moneyRedact = dollar_value != null ? Money.ADAPTER.redact(dollar_value) : null;
                Money dollar_value_for_return = value.getDollar_value_for_return();
                Money moneyRedact2 = dollar_value_for_return != null ? Money.ADAPTER.redact(dollar_value_for_return) : null;
                Money dollar_value_for_rate_of_return = value.getDollar_value_for_rate_of_return();
                return value.copy(moneyRedact, moneyRedact2, dollar_value_for_rate_of_return != null ? Money.ADAPTER.redact(dollar_value_for_rate_of_return) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PriceChartData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PriceChartData(moneyDecode, moneyDecode2, moneyDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode2 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        moneyDecode3 = Money.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
