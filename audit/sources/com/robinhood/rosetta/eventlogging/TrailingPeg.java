package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
import rosetta.order.PegType;

/* compiled from: TrailingPeg.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J0\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/TrailingPeg;", "Lcom/squareup/wire/Message;", "", "type", "Lrosetta/order/PegType;", "percentage", "", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/rosetta/eventlogging/Money;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/order/PegType;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Money;Lokio/ByteString;)V", "getType", "()Lrosetta/order/PegType;", "getPercentage", "()Ljava/lang/String;", "getPrice", "()Lcom/robinhood/rosetta/eventlogging/Money;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class TrailingPeg extends Message {

    @JvmField
    public static final ProtoAdapter<TrailingPeg> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String percentage;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money price;

    @WireField(adapter = "rosetta.order.PegType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final PegType type;

    public TrailingPeg() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24582newBuilder();
    }

    public final PegType getType() {
        return this.type;
    }

    public /* synthetic */ TrailingPeg(PegType pegType, String str, Money money, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PegType.PEG_TYPE_UNSPECIFIED : pegType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : money, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getPercentage() {
        return this.percentage;
    }

    public final Money getPrice() {
        return this.price;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrailingPeg(PegType type2, String percentage, Money money, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.percentage = percentage;
        this.price = money;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24582newBuilder() {
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
        return Intrinsics.areEqual(unknownFields(), trailingPeg.unknownFields()) && this.type == trailingPeg.type && Intrinsics.areEqual(this.percentage, trailingPeg.percentage) && Intrinsics.areEqual(this.price, trailingPeg.price);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.percentage.hashCode()) * 37;
        Money money = this.price;
        int iHashCode2 = iHashCode + (money != null ? money.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        arrayList.add("percentage=" + Internal.sanitize(this.percentage));
        Money money = this.price;
        if (money != null) {
            arrayList.add("price=" + money);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TrailingPeg{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TrailingPeg copy$default(TrailingPeg trailingPeg, PegType pegType, String str, Money money, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            pegType = trailingPeg.type;
        }
        if ((i & 2) != 0) {
            str = trailingPeg.percentage;
        }
        if ((i & 4) != 0) {
            money = trailingPeg.price;
        }
        if ((i & 8) != 0) {
            byteString = trailingPeg.unknownFields();
        }
        return trailingPeg.copy(pegType, str, money, byteString);
    }

    public final TrailingPeg copy(PegType type2, String percentage, Money price, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TrailingPeg(type2, percentage, price, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TrailingPeg.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TrailingPeg>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.TrailingPeg$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TrailingPeg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getType() != PegType.PEG_TYPE_UNSPECIFIED) {
                    size += PegType.ADAPTER.encodedSizeWithTag(1, value.getType());
                }
                if (!Intrinsics.areEqual(value.getPercentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPercentage());
                }
                return value.getPrice() != null ? size + Money.ADAPTER.encodedSizeWithTag(3, value.getPrice()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TrailingPeg value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getType() != PegType.PEG_TYPE_UNSPECIFIED) {
                    PegType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getPercentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPercentage());
                }
                if (value.getPrice() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getPrice());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TrailingPeg value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPrice() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getPercentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPercentage());
                }
                if (value.getType() != PegType.PEG_TYPE_UNSPECIFIED) {
                    PegType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TrailingPeg decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PegType pegTypeDecode = PegType.PEG_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Money moneyDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TrailingPeg(pegTypeDecode, strDecode, moneyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            pegTypeDecode = PegType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TrailingPeg redact(TrailingPeg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money price = value.getPrice();
                return TrailingPeg.copy$default(value, null, null, price != null ? Money.ADAPTER.redact(price) : null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
