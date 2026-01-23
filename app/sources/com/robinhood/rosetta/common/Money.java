package com.robinhood.rosetta.common;

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

/* compiled from: Money.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/common/Money;", "Lcom/squareup/wire/Message;", "", "amount", "", "currency", "Lcom/robinhood/rosetta/common/Currency;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/Currency;Lokio/ByteString;)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "()Lcom/robinhood/rosetta/common/Currency;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class Money extends Message {

    @JvmField
    public static final ProtoAdapter<Money> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Currency currency;

    public Money() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23984newBuilder();
    }

    public final String getAmount() {
        return this.amount;
    }

    public /* synthetic */ Money(String str, Currency currency, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Money(String amount, Currency currency, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.amount = amount;
        this.currency = currency;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23984newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Money)) {
            return false;
        }
        Money money = (Money) other;
        return Intrinsics.areEqual(unknownFields(), money.unknownFields()) && Intrinsics.areEqual(this.amount, money.amount) && this.currency == money.currency;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.amount.hashCode()) * 37) + this.currency.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("amount=" + Internal.sanitize(this.amount));
        arrayList.add("currency=" + this.currency);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Money{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Money copy$default(Money money, String str, Currency currency, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = money.amount;
        }
        if ((i & 2) != 0) {
            currency = money.currency;
        }
        if ((i & 4) != 0) {
            byteString = money.unknownFields();
        }
        return money.copy(str, currency, byteString);
    }

    public final Money copy(String amount, Currency currency, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Money(amount, currency, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Money.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Money>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.common.Money$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Money value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAmount());
                }
                return value.getCurrency() != Currency.CURRENCY_UNSPECIFIED ? size + Currency.ADAPTER.encodedSizeWithTag(2, value.getCurrency()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Money value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAmount());
                }
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 2, (int) value.getCurrency());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Money value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCurrency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 2, (int) value.getCurrency());
                }
                if (Intrinsics.areEqual(value.getAmount(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAmount());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Money decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Currency currencyDecode = Currency.CURRENCY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Money(strDecode, currencyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            currencyDecode = Currency.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Money redact(Money value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Money.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
