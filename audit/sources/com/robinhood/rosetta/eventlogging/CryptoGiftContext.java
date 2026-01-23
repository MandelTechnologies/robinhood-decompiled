package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: CryptoGiftContext.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoGiftContext;", "Lcom/squareup/wire/Message;", "", "card_id", "", "amount", "", "currency_id", "has_message", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "alert_button_title", "gift_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;DLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/Boolean;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getCard_id", "()Ljava/lang/String;", "getAmount", "()D", "getCurrency_id", "getHas_message", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getAlert_button_title", "getGift_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CryptoGiftContext extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoGiftContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "alertButtonTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String alert_button_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cardId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String card_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String currency_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "giftId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String gift_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "hasMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Boolean has_message;

    public CryptoGiftContext() {
        this(null, 0.0d, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ CryptoGiftContext(String str, double d, String str2, Boolean r6, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r6, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24152newBuilder();
    }

    public final String getCard_id() {
        return this.card_id;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getCurrency_id() {
        return this.currency_id;
    }

    public final Boolean getHas_message() {
        return this.has_message;
    }

    public final String getAlert_button_title() {
        return this.alert_button_title;
    }

    public final String getGift_id() {
        return this.gift_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoGiftContext(String card_id, double d, String currency_id, Boolean has_message, String alert_button_title, String gift_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(card_id, "card_id");
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(has_message, "has_message");
        Intrinsics.checkNotNullParameter(alert_button_title, "alert_button_title");
        Intrinsics.checkNotNullParameter(gift_id, "gift_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.card_id = card_id;
        this.amount = d;
        this.currency_id = currency_id;
        this.has_message = has_message;
        this.alert_button_title = alert_button_title;
        this.gift_id = gift_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24152newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoGiftContext)) {
            return false;
        }
        CryptoGiftContext cryptoGiftContext = (CryptoGiftContext) other;
        return Intrinsics.areEqual(unknownFields(), cryptoGiftContext.unknownFields()) && Intrinsics.areEqual(this.card_id, cryptoGiftContext.card_id) && this.amount == cryptoGiftContext.amount && Intrinsics.areEqual(this.currency_id, cryptoGiftContext.currency_id) && this.has_message == cryptoGiftContext.has_message && Intrinsics.areEqual(this.alert_button_title, cryptoGiftContext.alert_button_title) && Intrinsics.areEqual(this.gift_id, cryptoGiftContext.gift_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.card_id.hashCode()) * 37) + Double.hashCode(this.amount)) * 37) + this.currency_id.hashCode()) * 37) + this.has_message.hashCode()) * 37) + this.alert_button_title.hashCode()) * 37) + this.gift_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("card_id=" + Internal.sanitize(this.card_id));
        arrayList.add("amount=" + this.amount);
        arrayList.add("currency_id=" + Internal.sanitize(this.currency_id));
        arrayList.add("has_message=" + this.has_message);
        arrayList.add("alert_button_title=" + Internal.sanitize(this.alert_button_title));
        arrayList.add("gift_id=" + Internal.sanitize(this.gift_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoGiftContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CryptoGiftContext copy$default(CryptoGiftContext cryptoGiftContext, String str, double d, String str2, Boolean r5, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoGiftContext.card_id;
        }
        if ((i & 2) != 0) {
            d = cryptoGiftContext.amount;
        }
        if ((i & 4) != 0) {
            str2 = cryptoGiftContext.currency_id;
        }
        if ((i & 8) != 0) {
            r5 = cryptoGiftContext.has_message;
        }
        if ((i & 16) != 0) {
            str3 = cryptoGiftContext.alert_button_title;
        }
        if ((i & 32) != 0) {
            str4 = cryptoGiftContext.gift_id;
        }
        if ((i & 64) != 0) {
            byteString = cryptoGiftContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        String str6 = str2;
        return cryptoGiftContext.copy(str, d, str6, r5, str5, str4, byteString2);
    }

    public final CryptoGiftContext copy(String card_id, double amount, String currency_id, Boolean has_message, String alert_button_title, String gift_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(card_id, "card_id");
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(has_message, "has_message");
        Intrinsics.checkNotNullParameter(alert_button_title, "alert_button_title");
        Intrinsics.checkNotNullParameter(gift_id, "gift_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoGiftContext(card_id, amount, currency_id, has_message, alert_button_title, gift_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoGiftContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoGiftContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoGiftContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoGiftContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCard_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCard_id());
                }
                if (!Double.valueOf(value.getAmount()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getAmount()));
                }
                if (!Intrinsics.areEqual(value.getCurrency_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCurrency_id());
                }
                if (value.getHas_message() != Boolean.BOOLEAN_UNSPECIFIED) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(4, value.getHas_message());
                }
                if (!Intrinsics.areEqual(value.getAlert_button_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAlert_button_title());
                }
                return !Intrinsics.areEqual(value.getGift_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getGift_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoGiftContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCard_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCard_id());
                }
                if (!Double.valueOf(value.getAmount()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getAmount()));
                }
                if (!Intrinsics.areEqual(value.getCurrency_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCurrency_id());
                }
                if (value.getHas_message() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 4, (int) value.getHas_message());
                }
                if (!Intrinsics.areEqual(value.getAlert_button_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAlert_button_title());
                }
                if (!Intrinsics.areEqual(value.getGift_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getGift_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoGiftContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getGift_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getGift_id());
                }
                if (!Intrinsics.areEqual(value.getAlert_button_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAlert_button_title());
                }
                if (value.getHas_message() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 4, (int) value.getHas_message());
                }
                if (!Intrinsics.areEqual(value.getCurrency_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCurrency_id());
                }
                if (!Double.valueOf(value.getAmount()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getAmount()));
                }
                if (Intrinsics.areEqual(value.getCard_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCard_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoGiftContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Boolean r0 = Boolean.BOOLEAN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                double dDoubleValue = 0.0d;
                Boolean booleanDecode = r0;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 3:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                try {
                                    booleanDecode = Boolean.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new CryptoGiftContext(strDecode3, dDoubleValue, strDecode4, booleanDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoGiftContext redact(CryptoGiftContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CryptoGiftContext.copy$default(value, null, 0.0d, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }
}
