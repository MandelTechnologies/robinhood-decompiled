package wormhole.service.p554v1;

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

/* compiled from: RealizedGainLossItemComponent.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J`\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006#"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItemComponent;", "Lcom/squareup/wire/Message;", "", "quantity", "", "average_open_price", "Lcom/robinhood/rosetta/common/Money;", "average_close_price", "opening_amount", "closing_amount", "realized_return", "realized_return_percentage", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lokio/ByteString;)V", "getQuantity", "()Ljava/lang/String;", "getAverage_open_price", "()Lcom/robinhood/rosetta/common/Money;", "getAverage_close_price", "getOpening_amount", "getClosing_amount", "getRealized_return", "getRealized_return_percentage", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class RealizedGainLossItemComponent extends Message {

    @JvmField
    public static final ProtoAdapter<RealizedGainLossItemComponent> ADAPTER;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "averageClosePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money average_close_price;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "averageOpenPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money average_open_price;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "closingAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Money closing_amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "openingAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money opening_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String quantity;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "realizedReturn", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Money realized_return;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "realizedReturnPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String realized_return_percentage;

    public RealizedGainLossItemComponent() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ RealizedGainLossItemComponent(String str, Money money, Money money2, Money money3, Money money4, Money money5, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : money2, (i & 8) != 0 ? null : money3, (i & 16) != 0 ? null : money4, (i & 32) != 0 ? null : money5, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30077newBuilder();
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final Money getAverage_open_price() {
        return this.average_open_price;
    }

    public final Money getAverage_close_price() {
        return this.average_close_price;
    }

    public final Money getOpening_amount() {
        return this.opening_amount;
    }

    public final Money getClosing_amount() {
        return this.closing_amount;
    }

    public final Money getRealized_return() {
        return this.realized_return;
    }

    public final String getRealized_return_percentage() {
        return this.realized_return_percentage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealizedGainLossItemComponent(String quantity, Money money, Money money2, Money money3, Money money4, Money money5, String realized_return_percentage, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(realized_return_percentage, "realized_return_percentage");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.quantity = quantity;
        this.average_open_price = money;
        this.average_close_price = money2;
        this.opening_amount = money3;
        this.closing_amount = money4;
        this.realized_return = money5;
        this.realized_return_percentage = realized_return_percentage;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30077newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RealizedGainLossItemComponent)) {
            return false;
        }
        RealizedGainLossItemComponent realizedGainLossItemComponent = (RealizedGainLossItemComponent) other;
        return Intrinsics.areEqual(unknownFields(), realizedGainLossItemComponent.unknownFields()) && Intrinsics.areEqual(this.quantity, realizedGainLossItemComponent.quantity) && Intrinsics.areEqual(this.average_open_price, realizedGainLossItemComponent.average_open_price) && Intrinsics.areEqual(this.average_close_price, realizedGainLossItemComponent.average_close_price) && Intrinsics.areEqual(this.opening_amount, realizedGainLossItemComponent.opening_amount) && Intrinsics.areEqual(this.closing_amount, realizedGainLossItemComponent.closing_amount) && Intrinsics.areEqual(this.realized_return, realizedGainLossItemComponent.realized_return) && Intrinsics.areEqual(this.realized_return_percentage, realizedGainLossItemComponent.realized_return_percentage);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.quantity.hashCode()) * 37;
        Money money = this.average_open_price;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.average_close_price;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.opening_amount;
        int iHashCode4 = (iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.closing_amount;
        int iHashCode5 = (iHashCode4 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.realized_return;
        int iHashCode6 = ((iHashCode5 + (money5 != null ? money5.hashCode() : 0)) * 37) + this.realized_return_percentage.hashCode();
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        Money money = this.average_open_price;
        if (money != null) {
            arrayList.add("average_open_price=" + money);
        }
        Money money2 = this.average_close_price;
        if (money2 != null) {
            arrayList.add("average_close_price=" + money2);
        }
        Money money3 = this.opening_amount;
        if (money3 != null) {
            arrayList.add("opening_amount=" + money3);
        }
        Money money4 = this.closing_amount;
        if (money4 != null) {
            arrayList.add("closing_amount=" + money4);
        }
        Money money5 = this.realized_return;
        if (money5 != null) {
            arrayList.add("realized_return=" + money5);
        }
        arrayList.add("realized_return_percentage=" + Internal.sanitize(this.realized_return_percentage));
        return CollectionsKt.joinToString$default(arrayList, ", ", "RealizedGainLossItemComponent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RealizedGainLossItemComponent copy$default(RealizedGainLossItemComponent realizedGainLossItemComponent, String str, Money money, Money money2, Money money3, Money money4, Money money5, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = realizedGainLossItemComponent.quantity;
        }
        if ((i & 2) != 0) {
            money = realizedGainLossItemComponent.average_open_price;
        }
        if ((i & 4) != 0) {
            money2 = realizedGainLossItemComponent.average_close_price;
        }
        if ((i & 8) != 0) {
            money3 = realizedGainLossItemComponent.opening_amount;
        }
        if ((i & 16) != 0) {
            money4 = realizedGainLossItemComponent.closing_amount;
        }
        if ((i & 32) != 0) {
            money5 = realizedGainLossItemComponent.realized_return;
        }
        if ((i & 64) != 0) {
            str2 = realizedGainLossItemComponent.realized_return_percentage;
        }
        if ((i & 128) != 0) {
            byteString = realizedGainLossItemComponent.unknownFields();
        }
        String str3 = str2;
        ByteString byteString2 = byteString;
        Money money6 = money4;
        Money money7 = money5;
        return realizedGainLossItemComponent.copy(str, money, money2, money3, money6, money7, str3, byteString2);
    }

    public final RealizedGainLossItemComponent copy(String quantity, Money average_open_price, Money average_close_price, Money opening_amount, Money closing_amount, Money realized_return, String realized_return_percentage, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(realized_return_percentage, "realized_return_percentage");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RealizedGainLossItemComponent(quantity, average_open_price, average_close_price, opening_amount, closing_amount, realized_return, realized_return_percentage, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RealizedGainLossItemComponent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RealizedGainLossItemComponent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: wormhole.service.v1.RealizedGainLossItemComponent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RealizedGainLossItemComponent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getQuantity());
                }
                if (value.getAverage_open_price() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getAverage_open_price());
                }
                if (value.getAverage_close_price() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getAverage_close_price());
                }
                if (value.getOpening_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getOpening_amount());
                }
                if (value.getClosing_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(5, value.getClosing_amount());
                }
                if (value.getRealized_return() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(6, value.getRealized_return());
                }
                return !Intrinsics.areEqual(value.getRealized_return_percentage(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getRealized_return_percentage()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RealizedGainLossItemComponent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getQuantity());
                }
                if (value.getAverage_open_price() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getAverage_open_price());
                }
                if (value.getAverage_close_price() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAverage_close_price());
                }
                if (value.getOpening_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getOpening_amount());
                }
                if (value.getClosing_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getClosing_amount());
                }
                if (value.getRealized_return() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getRealized_return());
                }
                if (!Intrinsics.areEqual(value.getRealized_return_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getRealized_return_percentage());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RealizedGainLossItemComponent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRealized_return_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getRealized_return_percentage());
                }
                if (value.getRealized_return() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getRealized_return());
                }
                if (value.getClosing_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getClosing_amount());
                }
                if (value.getOpening_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getOpening_amount());
                }
                if (value.getAverage_close_price() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAverage_close_price());
                }
                if (value.getAverage_open_price() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getAverage_open_price());
                }
                if (Intrinsics.areEqual(value.getQuantity(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getQuantity());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RealizedGainLossItemComponent redact(RealizedGainLossItemComponent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money average_open_price = value.getAverage_open_price();
                Money moneyRedact = average_open_price != null ? Money.ADAPTER.redact(average_open_price) : null;
                Money average_close_price = value.getAverage_close_price();
                Money moneyRedact2 = average_close_price != null ? Money.ADAPTER.redact(average_close_price) : null;
                Money opening_amount = value.getOpening_amount();
                Money moneyRedact3 = opening_amount != null ? Money.ADAPTER.redact(opening_amount) : null;
                Money closing_amount = value.getClosing_amount();
                Money moneyRedact4 = closing_amount != null ? Money.ADAPTER.redact(closing_amount) : null;
                Money realized_return = value.getRealized_return();
                return RealizedGainLossItemComponent.copy$default(value, null, moneyRedact, moneyRedact2, moneyRedact3, moneyRedact4, realized_return != null ? Money.ADAPTER.redact(realized_return) : null, null, ByteString.EMPTY, 65, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RealizedGainLossItemComponent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                Money moneyDecode4 = null;
                Money moneyDecode5 = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 3:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 4:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                break;
                            case 5:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                break;
                            case 6:
                                moneyDecode5 = Money.ADAPTER.decode(reader);
                                break;
                            case 7:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new RealizedGainLossItemComponent(strDecode, moneyDecode, moneyDecode2, moneyDecode3, moneyDecode4, moneyDecode5, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
