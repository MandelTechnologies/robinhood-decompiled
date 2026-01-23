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

/* compiled from: MoneyAxisRange.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J4\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/MoneyAxisRange;", "Lcom/squareup/wire/Message;", "", "min_value", "Lcom/robinhood/rosetta/common/Money;", "max_value", "scrubbing_increment", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getMin_value", "()Lcom/robinhood/rosetta/common/Money;", "getMax_value", "getScrubbing_increment", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class MoneyAxisRange extends Message {

    @JvmField
    public static final ProtoAdapter<MoneyAxisRange> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "maxValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money max_value;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "minValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money min_value;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "scrubbingIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money scrubbing_increment;

    public MoneyAxisRange() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29782newBuilder();
    }

    public final Money getMin_value() {
        return this.min_value;
    }

    public final Money getMax_value() {
        return this.max_value;
    }

    public final Money getScrubbing_increment() {
        return this.scrubbing_increment;
    }

    public /* synthetic */ MoneyAxisRange(Money money, Money money2, Money money3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, (i & 4) != 0 ? null : money3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneyAxisRange(Money money, Money money2, Money money3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.min_value = money;
        this.max_value = money2;
        this.scrubbing_increment = money3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29782newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MoneyAxisRange)) {
            return false;
        }
        MoneyAxisRange moneyAxisRange = (MoneyAxisRange) other;
        return Intrinsics.areEqual(unknownFields(), moneyAxisRange.unknownFields()) && Intrinsics.areEqual(this.min_value, moneyAxisRange.min_value) && Intrinsics.areEqual(this.max_value, moneyAxisRange.max_value) && Intrinsics.areEqual(this.scrubbing_increment, moneyAxisRange.scrubbing_increment);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.min_value;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.max_value;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.scrubbing_increment;
        int iHashCode4 = iHashCode3 + (money3 != null ? money3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.min_value;
        if (money != null) {
            arrayList.add("min_value=" + money);
        }
        Money money2 = this.max_value;
        if (money2 != null) {
            arrayList.add("max_value=" + money2);
        }
        Money money3 = this.scrubbing_increment;
        if (money3 != null) {
            arrayList.add("scrubbing_increment=" + money3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MoneyAxisRange{", "}", 0, null, null, 56, null);
    }

    public final MoneyAxisRange copy(Money min_value, Money max_value, Money scrubbing_increment, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MoneyAxisRange(min_value, max_value, scrubbing_increment, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MoneyAxisRange.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MoneyAxisRange>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.MoneyAxisRange$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MoneyAxisRange value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMin_value() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getMin_value());
                }
                if (value.getMax_value() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getMax_value());
                }
                return value.getScrubbing_increment() != null ? size + Money.ADAPTER.encodedSizeWithTag(3, value.getScrubbing_increment()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MoneyAxisRange value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMin_value() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getMin_value());
                }
                if (value.getMax_value() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getMax_value());
                }
                if (value.getScrubbing_increment() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getScrubbing_increment());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MoneyAxisRange value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getScrubbing_increment() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getScrubbing_increment());
                }
                if (value.getMax_value() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getMax_value());
                }
                if (value.getMin_value() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getMin_value());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MoneyAxisRange redact(MoneyAxisRange value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money min_value = value.getMin_value();
                Money moneyRedact = min_value != null ? Money.ADAPTER.redact(min_value) : null;
                Money max_value = value.getMax_value();
                Money moneyRedact2 = max_value != null ? Money.ADAPTER.redact(max_value) : null;
                Money scrubbing_increment = value.getScrubbing_increment();
                return value.copy(moneyRedact, moneyRedact2, scrubbing_increment != null ? Money.ADAPTER.redact(scrubbing_increment) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MoneyAxisRange decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MoneyAxisRange(moneyDecode, moneyDecode2, moneyDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
