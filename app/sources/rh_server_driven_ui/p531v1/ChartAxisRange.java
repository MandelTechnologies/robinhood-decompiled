package rh_server_driven_ui.p531v1;

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

/* compiled from: ChartAxisRange.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartAxisRange;", "Lcom/squareup/wire/Message;", "", "money", "Lrh_server_driven_ui/v1/MoneyAxisRange;", "unitless", "Lrh_server_driven_ui/v1/UnitlessAxisRange;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/MoneyAxisRange;Lrh_server_driven_ui/v1/UnitlessAxisRange;Lokio/ByteString;)V", "getMoney", "()Lrh_server_driven_ui/v1/MoneyAxisRange;", "getUnitless", "()Lrh_server_driven_ui/v1/UnitlessAxisRange;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class ChartAxisRange extends Message {

    @JvmField
    public static final ProtoAdapter<ChartAxisRange> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.MoneyAxisRange#ADAPTER", oneofName = "range_details", schemaIndex = 0, tag = 1)
    private final MoneyAxisRange money;

    @WireField(adapter = "rh_server_driven_ui.v1.UnitlessAxisRange#ADAPTER", oneofName = "range_details", schemaIndex = 1, tag = 2)
    private final UnitlessAxisRange unitless;

    public ChartAxisRange() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29688newBuilder();
    }

    public final MoneyAxisRange getMoney() {
        return this.money;
    }

    public final UnitlessAxisRange getUnitless() {
        return this.unitless;
    }

    public /* synthetic */ ChartAxisRange(MoneyAxisRange moneyAxisRange, UnitlessAxisRange unitlessAxisRange, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : moneyAxisRange, (i & 2) != 0 ? null : unitlessAxisRange, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartAxisRange(MoneyAxisRange moneyAxisRange, UnitlessAxisRange unitlessAxisRange, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.money = moneyAxisRange;
        this.unitless = unitlessAxisRange;
        if (Internal.countNonNull(moneyAxisRange, unitlessAxisRange) > 1) {
            throw new IllegalArgumentException("At most one of money, unitless may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29688newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChartAxisRange)) {
            return false;
        }
        ChartAxisRange chartAxisRange = (ChartAxisRange) other;
        return Intrinsics.areEqual(unknownFields(), chartAxisRange.unknownFields()) && Intrinsics.areEqual(this.money, chartAxisRange.money) && Intrinsics.areEqual(this.unitless, chartAxisRange.unitless);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        MoneyAxisRange moneyAxisRange = this.money;
        int iHashCode2 = (iHashCode + (moneyAxisRange != null ? moneyAxisRange.hashCode() : 0)) * 37;
        UnitlessAxisRange unitlessAxisRange = this.unitless;
        int iHashCode3 = iHashCode2 + (unitlessAxisRange != null ? unitlessAxisRange.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        MoneyAxisRange moneyAxisRange = this.money;
        if (moneyAxisRange != null) {
            arrayList.add("money=" + moneyAxisRange);
        }
        UnitlessAxisRange unitlessAxisRange = this.unitless;
        if (unitlessAxisRange != null) {
            arrayList.add("unitless=" + unitlessAxisRange);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChartAxisRange{", "}", 0, null, null, 56, null);
    }

    public final ChartAxisRange copy(MoneyAxisRange money, UnitlessAxisRange unitless, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ChartAxisRange(money, unitless, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartAxisRange.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ChartAxisRange>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ChartAxisRange$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ChartAxisRange value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + MoneyAxisRange.ADAPTER.encodedSizeWithTag(1, value.getMoney()) + UnitlessAxisRange.ADAPTER.encodedSizeWithTag(2, value.getUnitless());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ChartAxisRange value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                MoneyAxisRange.ADAPTER.encodeWithTag(writer, 1, (int) value.getMoney());
                UnitlessAxisRange.ADAPTER.encodeWithTag(writer, 2, (int) value.getUnitless());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ChartAxisRange value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                UnitlessAxisRange.ADAPTER.encodeWithTag(writer, 2, (int) value.getUnitless());
                MoneyAxisRange.ADAPTER.encodeWithTag(writer, 1, (int) value.getMoney());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChartAxisRange redact(ChartAxisRange value) {
                Intrinsics.checkNotNullParameter(value, "value");
                MoneyAxisRange money = value.getMoney();
                MoneyAxisRange moneyAxisRangeRedact = money != null ? MoneyAxisRange.ADAPTER.redact(money) : null;
                UnitlessAxisRange unitless = value.getUnitless();
                return value.copy(moneyAxisRangeRedact, unitless != null ? UnitlessAxisRange.ADAPTER.redact(unitless) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChartAxisRange decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                MoneyAxisRange moneyAxisRangeDecode = null;
                UnitlessAxisRange unitlessAxisRangeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ChartAxisRange(moneyAxisRangeDecode, unitlessAxisRangeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        moneyAxisRangeDecode = MoneyAxisRange.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        unitlessAxisRangeDecode = UnitlessAxisRange.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
