package com.robinhood.rosetta.mainst;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: FractionalOrderDetails.kt */
@kotlin.Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/FractionalOrderDetails;", "Lcom/squareup/wire/Message;", "", "dollar_based_amount", "Lcom/robinhood/rosetta/mainst/Decimal;", "original_firm_account", "Lcom/robinhood/rosetta/mainst/NullableString;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/NullableString;Lokio/ByteString;)V", "getDollar_based_amount", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getOriginal_firm_account", "()Lcom/robinhood/rosetta/mainst/NullableString;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FractionalOrderDetails extends Message {

    @JvmField
    public static final ProtoAdapter<FractionalOrderDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "dollarBasedAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Decimal dollar_based_amount;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "originalFirmAccount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 3)
    private final NullableString original_firm_account;

    public FractionalOrderDetails() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24661newBuilder();
    }

    public final Decimal getDollar_based_amount() {
        return this.dollar_based_amount;
    }

    public final NullableString getOriginal_firm_account() {
        return this.original_firm_account;
    }

    public /* synthetic */ FractionalOrderDetails(Decimal decimal, NullableString nullableString, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : decimal, (i & 2) != 0 ? null : nullableString, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FractionalOrderDetails(Decimal decimal, NullableString nullableString, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.dollar_based_amount = decimal;
        this.original_firm_account = nullableString;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24661newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FractionalOrderDetails)) {
            return false;
        }
        FractionalOrderDetails fractionalOrderDetails = (FractionalOrderDetails) other;
        return Intrinsics.areEqual(unknownFields(), fractionalOrderDetails.unknownFields()) && Intrinsics.areEqual(this.dollar_based_amount, fractionalOrderDetails.dollar_based_amount) && Intrinsics.areEqual(this.original_firm_account, fractionalOrderDetails.original_firm_account);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Decimal decimal = this.dollar_based_amount;
        int iHashCode2 = (iHashCode + (decimal != null ? decimal.hashCode() : 0)) * 37;
        NullableString nullableString = this.original_firm_account;
        int iHashCode3 = iHashCode2 + (nullableString != null ? nullableString.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Decimal decimal = this.dollar_based_amount;
        if (decimal != null) {
            arrayList.add("dollar_based_amount=" + decimal);
        }
        NullableString nullableString = this.original_firm_account;
        if (nullableString != null) {
            arrayList.add("original_firm_account=" + nullableString);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FractionalOrderDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FractionalOrderDetails copy$default(FractionalOrderDetails fractionalOrderDetails, Decimal decimal, NullableString nullableString, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            decimal = fractionalOrderDetails.dollar_based_amount;
        }
        if ((i & 2) != 0) {
            nullableString = fractionalOrderDetails.original_firm_account;
        }
        if ((i & 4) != 0) {
            byteString = fractionalOrderDetails.unknownFields();
        }
        return fractionalOrderDetails.copy(decimal, nullableString, byteString);
    }

    public final FractionalOrderDetails copy(Decimal dollar_based_amount, NullableString original_firm_account, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FractionalOrderDetails(dollar_based_amount, original_firm_account, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FractionalOrderDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FractionalOrderDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.FractionalOrderDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FractionalOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDollar_based_amount() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(1, value.getDollar_based_amount());
                }
                return value.getOriginal_firm_account() != null ? size + NullableString.ADAPTER.encodedSizeWithTag(3, value.getOriginal_firm_account()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FractionalOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDollar_based_amount() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 1, (int) value.getDollar_based_amount());
                }
                if (value.getOriginal_firm_account() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 3, (int) value.getOriginal_firm_account());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FractionalOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOriginal_firm_account() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 3, (int) value.getOriginal_firm_account());
                }
                if (value.getDollar_based_amount() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 1, (int) value.getDollar_based_amount());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FractionalOrderDetails redact(FractionalOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Decimal dollar_based_amount = value.getDollar_based_amount();
                Decimal decimalRedact = dollar_based_amount != null ? Decimal.ADAPTER.redact(dollar_based_amount) : null;
                NullableString original_firm_account = value.getOriginal_firm_account();
                return value.copy(decimalRedact, original_firm_account != null ? NullableString.ADAPTER.redact(original_firm_account) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FractionalOrderDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Decimal decimalDecode = null;
                NullableString nullableStringDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FractionalOrderDetails(decimalDecode, nullableStringDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        decimalDecode = Decimal.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        nullableStringDecode = NullableString.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
