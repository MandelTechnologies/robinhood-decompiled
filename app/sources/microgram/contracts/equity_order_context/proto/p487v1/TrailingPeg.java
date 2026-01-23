package microgram.contracts.equity_order_context.proto.p487v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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

/* compiled from: TrailingPeg.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0019R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lmicrogram/contracts/equity_order_context/proto/v1/TrailingPeg;", "Lcom/squareup/wire/Message;", "", "percentage", "", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/rosetta/common/Money;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Integer;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getPercentage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrice", "()Lcom/robinhood/rosetta/common/Money;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "(Ljava/lang/Integer;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)Lmicrogram/contracts/equity_order_context/proto/v1/TrailingPeg;", "Companion", "equity_order_context.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TrailingPeg extends Message {

    @JvmField
    public static final ProtoAdapter<TrailingPeg> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", oneofName = "peg_type", schemaIndex = 0, tag = 1)
    private final Integer percentage;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", oneofName = "peg_type", schemaIndex = 1, tag = 2)
    private final Money price;

    public TrailingPeg() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29071newBuilder();
    }

    public final Integer getPercentage() {
        return this.percentage;
    }

    public final Money getPrice() {
        return this.price;
    }

    public /* synthetic */ TrailingPeg(Integer num, Money money, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : money, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrailingPeg(Integer num, Money money, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.percentage = num;
        this.price = money;
        if (Internal.countNonNull(num, money) > 1) {
            throw new IllegalArgumentException("At most one of percentage, price may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29071newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TrailingPeg)) {
            return false;
        }
        TrailingPeg trailingPeg = (TrailingPeg) other;
        return Intrinsics.areEqual(unknownFields(), trailingPeg.unknownFields()) && Intrinsics.areEqual(this.percentage, trailingPeg.percentage) && Intrinsics.areEqual(this.price, trailingPeg.price);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.percentage;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        Money money = this.price;
        int iHashCode3 = iHashCode2 + (money != null ? money.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.percentage;
        if (num != null) {
            arrayList.add("percentage=" + num);
        }
        Money money = this.price;
        if (money != null) {
            arrayList.add("price=" + money);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TrailingPeg{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TrailingPeg copy$default(TrailingPeg trailingPeg, Integer num, Money money, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            num = trailingPeg.percentage;
        }
        if ((i & 2) != 0) {
            money = trailingPeg.price;
        }
        if ((i & 4) != 0) {
            byteString = trailingPeg.unknownFields();
        }
        return trailingPeg.copy(num, money, byteString);
    }

    public final TrailingPeg copy(Integer percentage, Money price, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TrailingPeg(percentage, price, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TrailingPeg.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TrailingPeg>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.equity_order_context.proto.v1.TrailingPeg$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TrailingPeg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(1, value.getPercentage()) + Money.ADAPTER.encodedSizeWithTag(2, value.getPrice());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TrailingPeg value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) value.getPercentage());
                Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getPrice());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TrailingPeg value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getPrice());
                ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) value.getPercentage());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TrailingPeg redact(TrailingPeg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money price = value.getPrice();
                return TrailingPeg.copy$default(value, null, price != null ? Money.ADAPTER.redact(price) : null, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TrailingPeg decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Integer numDecode = null;
                Money moneyDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TrailingPeg(numDecode, moneyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        numDecode = ProtoAdapter.INT32.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
