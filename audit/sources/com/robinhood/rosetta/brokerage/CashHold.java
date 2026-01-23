package com.robinhood.rosetta.brokerage;

import com.robinhood.rosetta.common.Currency;
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

/* compiled from: CashHold.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashHold;", "Lcom/squareup/wire/Message;", "", "held_amount", "", "outgoing_amount", "currency", "Lcom/robinhood/rosetta/common/Currency;", "short_held_amount", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Currency;Ljava/lang/String;Lokio/ByteString;)V", "getHeld_amount", "()Ljava/lang/String;", "getOutgoing_amount", "getCurrency", "()Lcom/robinhood/rosetta/common/Currency;", "getShort_held_amount", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CashHold extends Message {

    @JvmField
    public static final ProtoAdapter<CashHold> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Currency currency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "heldAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String held_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "outgoingAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String outgoing_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "shortHeldAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String short_held_amount;

    public CashHold() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ CashHold(String str, String str2, Currency currency, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23949newBuilder();
    }

    public final String getHeld_amount() {
        return this.held_amount;
    }

    public final String getOutgoing_amount() {
        return this.outgoing_amount;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final String getShort_held_amount() {
        return this.short_held_amount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashHold(String held_amount, String outgoing_amount, Currency currency, String short_held_amount, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(held_amount, "held_amount");
        Intrinsics.checkNotNullParameter(outgoing_amount, "outgoing_amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(short_held_amount, "short_held_amount");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.held_amount = held_amount;
        this.outgoing_amount = outgoing_amount;
        this.currency = currency;
        this.short_held_amount = short_held_amount;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23949newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CashHold)) {
            return false;
        }
        CashHold cashHold = (CashHold) other;
        return Intrinsics.areEqual(unknownFields(), cashHold.unknownFields()) && Intrinsics.areEqual(this.held_amount, cashHold.held_amount) && Intrinsics.areEqual(this.outgoing_amount, cashHold.outgoing_amount) && this.currency == cashHold.currency && Intrinsics.areEqual(this.short_held_amount, cashHold.short_held_amount);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.held_amount.hashCode()) * 37) + this.outgoing_amount.hashCode()) * 37) + this.currency.hashCode()) * 37) + this.short_held_amount.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("held_amount=" + Internal.sanitize(this.held_amount));
        arrayList.add("outgoing_amount=" + Internal.sanitize(this.outgoing_amount));
        arrayList.add("currency=" + this.currency);
        arrayList.add("short_held_amount=" + Internal.sanitize(this.short_held_amount));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashHold{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CashHold copy$default(CashHold cashHold, String str, String str2, Currency currency, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashHold.held_amount;
        }
        if ((i & 2) != 0) {
            str2 = cashHold.outgoing_amount;
        }
        if ((i & 4) != 0) {
            currency = cashHold.currency;
        }
        if ((i & 8) != 0) {
            str3 = cashHold.short_held_amount;
        }
        if ((i & 16) != 0) {
            byteString = cashHold.unknownFields();
        }
        ByteString byteString2 = byteString;
        Currency currency2 = currency;
        return cashHold.copy(str, str2, currency2, str3, byteString2);
    }

    public final CashHold copy(String held_amount, String outgoing_amount, Currency currency, String short_held_amount, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(held_amount, "held_amount");
        Intrinsics.checkNotNullParameter(outgoing_amount, "outgoing_amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(short_held_amount, "short_held_amount");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CashHold(held_amount, outgoing_amount, currency, short_held_amount, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CashHold.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CashHold>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.brokerage.CashHold$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CashHold value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getHeld_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHeld_amount());
                }
                if (!Intrinsics.areEqual(value.getOutgoing_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getOutgoing_amount());
                }
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    size += Currency.ADAPTER.encodedSizeWithTag(3, value.getCurrency());
                }
                return !Intrinsics.areEqual(value.getShort_held_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getShort_held_amount()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CashHold value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getHeld_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeld_amount());
                }
                if (!Intrinsics.areEqual(value.getOutgoing_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOutgoing_amount());
                }
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 3, (int) value.getCurrency());
                }
                if (!Intrinsics.areEqual(value.getShort_held_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getShort_held_amount());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CashHold value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getShort_held_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getShort_held_amount());
                }
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 3, (int) value.getCurrency());
                }
                if (!Intrinsics.areEqual(value.getOutgoing_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getOutgoing_amount());
                }
                if (Intrinsics.areEqual(value.getHeld_amount(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeld_amount());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CashHold decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Currency currencyDecode = Currency.CURRENCY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    Currency currency = currencyDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CashHold(strDecode, strDecode2, currency, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                currencyDecode = Currency.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CashHold redact(CashHold value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CashHold.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
