package com.robinhood.prediction_markets.proto.p361v1.idl;

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

/* compiled from: ComboProposal.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ComboProposal;", "Lcom/squareup/wire/Message;", "", "quote_id", "", "yes_no", "Lcom/robinhood/prediction_markets/proto/v1/idl/YesNo;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "quantity", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/YesNo;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getQuote_id", "()Ljava/lang/String;", "getYes_no", "()Lcom/robinhood/prediction_markets/proto/v1/idl/YesNo;", "getPrice", "getQuantity", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ComboProposal extends Message {

    @JvmField
    public static final ProtoAdapter<ComboProposal> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quoteId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String quote_id;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.YesNo#ADAPTER", jsonName = "yesNo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final YesNo yes_no;

    public ComboProposal() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ ComboProposal(String str, YesNo yesNo, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? YesNo.YESNO_UNSPECIFIED : yesNo, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23767newBuilder();
    }

    public final String getQuote_id() {
        return this.quote_id;
    }

    public final YesNo getYes_no() {
        return this.yes_no;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboProposal(String quote_id, YesNo yes_no, String price, String quantity, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(quote_id, "quote_id");
        Intrinsics.checkNotNullParameter(yes_no, "yes_no");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.quote_id = quote_id;
        this.yes_no = yes_no;
        this.price = price;
        this.quantity = quantity;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23767newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ComboProposal)) {
            return false;
        }
        ComboProposal comboProposal = (ComboProposal) other;
        return Intrinsics.areEqual(unknownFields(), comboProposal.unknownFields()) && Intrinsics.areEqual(this.quote_id, comboProposal.quote_id) && this.yes_no == comboProposal.yes_no && Intrinsics.areEqual(this.price, comboProposal.price) && Intrinsics.areEqual(this.quantity, comboProposal.quantity);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.quote_id.hashCode()) * 37) + this.yes_no.hashCode()) * 37) + this.price.hashCode()) * 37) + this.quantity.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("quote_id=" + Internal.sanitize(this.quote_id));
        arrayList.add("yes_no=" + this.yes_no);
        arrayList.add("price=" + Internal.sanitize(this.price));
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ComboProposal{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ComboProposal copy$default(ComboProposal comboProposal, String str, YesNo yesNo, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = comboProposal.quote_id;
        }
        if ((i & 2) != 0) {
            yesNo = comboProposal.yes_no;
        }
        if ((i & 4) != 0) {
            str2 = comboProposal.price;
        }
        if ((i & 8) != 0) {
            str3 = comboProposal.quantity;
        }
        if ((i & 16) != 0) {
            byteString = comboProposal.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str2;
        return comboProposal.copy(str, yesNo, str4, str3, byteString2);
    }

    public final ComboProposal copy(String quote_id, YesNo yes_no, String price, String quantity, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(quote_id, "quote_id");
        Intrinsics.checkNotNullParameter(yes_no, "yes_no");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ComboProposal(quote_id, yes_no, price, quantity, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ComboProposal.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ComboProposal>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.ComboProposal$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ComboProposal value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getQuote_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getQuote_id());
                }
                if (value.getYes_no() != YesNo.YESNO_UNSPECIFIED) {
                    size += YesNo.ADAPTER.encodedSizeWithTag(2, value.getYes_no());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPrice());
                }
                return !Intrinsics.areEqual(value.getQuantity(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getQuantity()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ComboProposal value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getQuote_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getQuote_id());
                }
                if (value.getYes_no() != YesNo.YESNO_UNSPECIFIED) {
                    YesNo.ADAPTER.encodeWithTag(writer, 2, (int) value.getYes_no());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getQuantity());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ComboProposal value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrice());
                }
                if (value.getYes_no() != YesNo.YESNO_UNSPECIFIED) {
                    YesNo.ADAPTER.encodeWithTag(writer, 2, (int) value.getYes_no());
                }
                if (Intrinsics.areEqual(value.getQuote_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getQuote_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ComboProposal decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                YesNo yesNoDecode = YesNo.YESNO_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    YesNo yesNo = yesNoDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ComboProposal(strDecode, yesNo, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                yesNoDecode = YesNo.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ComboProposal redact(ComboProposal value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ComboProposal.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
