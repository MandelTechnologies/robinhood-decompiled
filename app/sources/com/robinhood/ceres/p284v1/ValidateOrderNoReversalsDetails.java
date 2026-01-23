package com.robinhood.ceres.p284v1;

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

/* compiled from: ValidateOrderNoReversalsDetails.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderNoReversalsDetails;", "Lcom/squareup/wire/Message;", "", "symbol", "", "held_quantity_available_to_close", "held_quantity", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getSymbol", "()Ljava/lang/String;", "getHeld_quantity_available_to_close", "getHeld_quantity", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ValidateOrderNoReversalsDetails extends Message {

    @JvmField
    public static final ProtoAdapter<ValidateOrderNoReversalsDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "heldQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String held_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "heldQuantityAvailableToClose", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String held_quantity_available_to_close;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String symbol;

    public ValidateOrderNoReversalsDetails() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ ValidateOrderNoReversalsDetails(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20448newBuilder();
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getHeld_quantity_available_to_close() {
        return this.held_quantity_available_to_close;
    }

    public final String getHeld_quantity() {
        return this.held_quantity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateOrderNoReversalsDetails(String symbol, String held_quantity_available_to_close, String held_quantity, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(held_quantity_available_to_close, "held_quantity_available_to_close");
        Intrinsics.checkNotNullParameter(held_quantity, "held_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.symbol = symbol;
        this.held_quantity_available_to_close = held_quantity_available_to_close;
        this.held_quantity = held_quantity;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20448newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ValidateOrderNoReversalsDetails)) {
            return false;
        }
        ValidateOrderNoReversalsDetails validateOrderNoReversalsDetails = (ValidateOrderNoReversalsDetails) other;
        return Intrinsics.areEqual(unknownFields(), validateOrderNoReversalsDetails.unknownFields()) && Intrinsics.areEqual(this.symbol, validateOrderNoReversalsDetails.symbol) && Intrinsics.areEqual(this.held_quantity_available_to_close, validateOrderNoReversalsDetails.held_quantity_available_to_close) && Intrinsics.areEqual(this.held_quantity, validateOrderNoReversalsDetails.held_quantity);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.symbol.hashCode()) * 37) + this.held_quantity_available_to_close.hashCode()) * 37) + this.held_quantity.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("held_quantity_available_to_close=" + Internal.sanitize(this.held_quantity_available_to_close));
        arrayList.add("held_quantity=" + Internal.sanitize(this.held_quantity));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidateOrderNoReversalsDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ValidateOrderNoReversalsDetails copy$default(ValidateOrderNoReversalsDetails validateOrderNoReversalsDetails, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateOrderNoReversalsDetails.symbol;
        }
        if ((i & 2) != 0) {
            str2 = validateOrderNoReversalsDetails.held_quantity_available_to_close;
        }
        if ((i & 4) != 0) {
            str3 = validateOrderNoReversalsDetails.held_quantity;
        }
        if ((i & 8) != 0) {
            byteString = validateOrderNoReversalsDetails.unknownFields();
        }
        return validateOrderNoReversalsDetails.copy(str, str2, str3, byteString);
    }

    public final ValidateOrderNoReversalsDetails copy(String symbol, String held_quantity_available_to_close, String held_quantity, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(held_quantity_available_to_close, "held_quantity_available_to_close");
        Intrinsics.checkNotNullParameter(held_quantity, "held_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ValidateOrderNoReversalsDetails(symbol, held_quantity_available_to_close, held_quantity, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValidateOrderNoReversalsDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ValidateOrderNoReversalsDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.ValidateOrderNoReversalsDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ValidateOrderNoReversalsDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getHeld_quantity_available_to_close(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getHeld_quantity_available_to_close());
                }
                return !Intrinsics.areEqual(value.getHeld_quantity(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getHeld_quantity()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ValidateOrderNoReversalsDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getHeld_quantity_available_to_close(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHeld_quantity_available_to_close());
                }
                if (!Intrinsics.areEqual(value.getHeld_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getHeld_quantity());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ValidateOrderNoReversalsDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getHeld_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getHeld_quantity());
                }
                if (!Intrinsics.areEqual(value.getHeld_quantity_available_to_close(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHeld_quantity_available_to_close());
                }
                if (Intrinsics.areEqual(value.getSymbol(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSymbol());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValidateOrderNoReversalsDetails redact(ValidateOrderNoReversalsDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ValidateOrderNoReversalsDetails.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ValidateOrderNoReversalsDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ValidateOrderNoReversalsDetails(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
