package bff_money_movement.service.p019v1;

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

/* compiled from: InvestmentsTrackerScrubPointMetadata.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\tH\u0016J<\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerScrubPointMetadata;", "Lcom/squareup/wire/Message;", "", "total_amount", "Lcom/robinhood/rosetta/common/Money;", "delta_amount", "percent", "", "time_text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;DLjava/lang/String;Lokio/ByteString;)V", "getTotal_amount", "()Lcom/robinhood/rosetta/common/Money;", "getDelta_amount", "getPercent", "()D", "getTime_text", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerScrubPointMetadata extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerScrubPointMetadata> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "deltaAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money delta_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double percent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "timeText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String time_text;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money total_amount;

    public InvestmentsTrackerScrubPointMetadata() {
        this(null, null, 0.0d, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8490newBuilder();
    }

    public final Money getTotal_amount() {
        return this.total_amount;
    }

    public final Money getDelta_amount() {
        return this.delta_amount;
    }

    public final double getPercent() {
        return this.percent;
    }

    public final String getTime_text() {
        return this.time_text;
    }

    public /* synthetic */ InvestmentsTrackerScrubPointMetadata(Money money, Money money2, double d, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerScrubPointMetadata(Money money, Money money2, double d, String time_text, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(time_text, "time_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.total_amount = money;
        this.delta_amount = money2;
        this.percent = d;
        this.time_text = time_text;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8490newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerScrubPointMetadata)) {
            return false;
        }
        InvestmentsTrackerScrubPointMetadata investmentsTrackerScrubPointMetadata = (InvestmentsTrackerScrubPointMetadata) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerScrubPointMetadata.unknownFields()) && Intrinsics.areEqual(this.total_amount, investmentsTrackerScrubPointMetadata.total_amount) && Intrinsics.areEqual(this.delta_amount, investmentsTrackerScrubPointMetadata.delta_amount) && this.percent == investmentsTrackerScrubPointMetadata.percent && Intrinsics.areEqual(this.time_text, investmentsTrackerScrubPointMetadata.time_text);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.total_amount;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.delta_amount;
        int iHashCode3 = ((((iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37) + Double.hashCode(this.percent)) * 37) + this.time_text.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.total_amount;
        if (money != null) {
            arrayList.add("total_amount=" + money);
        }
        Money money2 = this.delta_amount;
        if (money2 != null) {
            arrayList.add("delta_amount=" + money2);
        }
        arrayList.add("percent=" + this.percent);
        arrayList.add("time_text=" + Internal.sanitize(this.time_text));
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerScrubPointMetadata{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerScrubPointMetadata copy$default(InvestmentsTrackerScrubPointMetadata investmentsTrackerScrubPointMetadata, Money money, Money money2, double d, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            money = investmentsTrackerScrubPointMetadata.total_amount;
        }
        if ((i & 2) != 0) {
            money2 = investmentsTrackerScrubPointMetadata.delta_amount;
        }
        if ((i & 4) != 0) {
            d = investmentsTrackerScrubPointMetadata.percent;
        }
        if ((i & 8) != 0) {
            str = investmentsTrackerScrubPointMetadata.time_text;
        }
        if ((i & 16) != 0) {
            byteString = investmentsTrackerScrubPointMetadata.unknownFields();
        }
        double d2 = d;
        return investmentsTrackerScrubPointMetadata.copy(money, money2, d2, str, byteString);
    }

    public final InvestmentsTrackerScrubPointMetadata copy(Money total_amount, Money delta_amount, double percent, String time_text, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(time_text, "time_text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerScrubPointMetadata(total_amount, delta_amount, percent, time_text, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerScrubPointMetadata.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerScrubPointMetadata>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerScrubPointMetadata$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerScrubPointMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTotal_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getTotal_amount());
                }
                if (value.getDelta_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getDelta_amount());
                }
                if (!Double.valueOf(value.getPercent()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getPercent()));
                }
                return !Intrinsics.areEqual(value.getTime_text(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTime_text()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerScrubPointMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTotal_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getTotal_amount());
                }
                if (value.getDelta_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getDelta_amount());
                }
                if (!Double.valueOf(value.getPercent()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getPercent()));
                }
                if (!Intrinsics.areEqual(value.getTime_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTime_text());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerScrubPointMetadata value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTime_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTime_text());
                }
                if (!Double.valueOf(value.getPercent()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getPercent()));
                }
                if (value.getDelta_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getDelta_amount());
                }
                if (value.getTotal_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getTotal_amount());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerScrubPointMetadata redact(InvestmentsTrackerScrubPointMetadata value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money total_amount = value.getTotal_amount();
                Money moneyRedact = total_amount != null ? Money.ADAPTER.redact(total_amount) : null;
                Money delta_amount = value.getDelta_amount();
                return InvestmentsTrackerScrubPointMetadata.copy$default(value, moneyRedact, delta_amount != null ? Money.ADAPTER.redact(delta_amount) : null, 0.0d, null, ByteString.EMPTY, 12, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerScrubPointMetadata decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                String strDecode = "";
                double dDoubleValue = 0.0d;
                Money moneyDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InvestmentsTrackerScrubPointMetadata(moneyDecode, moneyDecode2, dDoubleValue, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode2 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 4) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
