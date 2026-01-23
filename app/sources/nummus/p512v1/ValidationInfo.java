package nummus.p512v1;

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

/* compiled from: ValidationInfo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lnummus/v1/ValidationInfo;", "Lcom/squareup/wire/Message;", "", "market_price_low", "", "market_price_high", "your_price", "result", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getMarket_price_low", "()Ljava/lang/String;", "getMarket_price_high", "getYour_price", "getResult", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class ValidationInfo extends Message {

    @JvmField
    public static final ProtoAdapter<ValidationInfo> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "marketPriceHigh", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String market_price_high;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "marketPriceLow", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String market_price_low;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String result;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "yourPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String your_price;

    public ValidationInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ ValidationInfo(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29447newBuilder();
    }

    public final String getMarket_price_low() {
        return this.market_price_low;
    }

    public final String getMarket_price_high() {
        return this.market_price_high;
    }

    public final String getYour_price() {
        return this.your_price;
    }

    public final String getResult() {
        return this.result;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidationInfo(String market_price_low, String market_price_high, String your_price, String result, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(market_price_low, "market_price_low");
        Intrinsics.checkNotNullParameter(market_price_high, "market_price_high");
        Intrinsics.checkNotNullParameter(your_price, "your_price");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.market_price_low = market_price_low;
        this.market_price_high = market_price_high;
        this.your_price = your_price;
        this.result = result;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29447newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ValidationInfo)) {
            return false;
        }
        ValidationInfo validationInfo = (ValidationInfo) other;
        return Intrinsics.areEqual(unknownFields(), validationInfo.unknownFields()) && Intrinsics.areEqual(this.market_price_low, validationInfo.market_price_low) && Intrinsics.areEqual(this.market_price_high, validationInfo.market_price_high) && Intrinsics.areEqual(this.your_price, validationInfo.your_price) && Intrinsics.areEqual(this.result, validationInfo.result);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.market_price_low.hashCode()) * 37) + this.market_price_high.hashCode()) * 37) + this.your_price.hashCode()) * 37) + this.result.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("market_price_low=" + Internal.sanitize(this.market_price_low));
        arrayList.add("market_price_high=" + Internal.sanitize(this.market_price_high));
        arrayList.add("your_price=" + Internal.sanitize(this.your_price));
        arrayList.add("result=" + Internal.sanitize(this.result));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValidationInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ValidationInfo copy$default(ValidationInfo validationInfo, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validationInfo.market_price_low;
        }
        if ((i & 2) != 0) {
            str2 = validationInfo.market_price_high;
        }
        if ((i & 4) != 0) {
            str3 = validationInfo.your_price;
        }
        if ((i & 8) != 0) {
            str4 = validationInfo.result;
        }
        if ((i & 16) != 0) {
            byteString = validationInfo.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return validationInfo.copy(str, str2, str5, str4, byteString2);
    }

    public final ValidationInfo copy(String market_price_low, String market_price_high, String your_price, String result, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(market_price_low, "market_price_low");
        Intrinsics.checkNotNullParameter(market_price_high, "market_price_high");
        Intrinsics.checkNotNullParameter(your_price, "your_price");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ValidationInfo(market_price_low, market_price_high, your_price, result, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValidationInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ValidationInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.ValidationInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ValidationInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getMarket_price_low(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getMarket_price_low());
                }
                if (!Intrinsics.areEqual(value.getMarket_price_high(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMarket_price_high());
                }
                if (!Intrinsics.areEqual(value.getYour_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getYour_price());
                }
                return !Intrinsics.areEqual(value.getResult(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getResult()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ValidationInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getMarket_price_low(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMarket_price_low());
                }
                if (!Intrinsics.areEqual(value.getMarket_price_high(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMarket_price_high());
                }
                if (!Intrinsics.areEqual(value.getYour_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getYour_price());
                }
                if (!Intrinsics.areEqual(value.getResult(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getResult());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ValidationInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getResult(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getResult());
                }
                if (!Intrinsics.areEqual(value.getYour_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getYour_price());
                }
                if (!Intrinsics.areEqual(value.getMarket_price_high(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMarket_price_high());
                }
                if (Intrinsics.areEqual(value.getMarket_price_low(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMarket_price_low());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValidationInfo redact(ValidationInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ValidationInfo.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValidationInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ValidationInfo(strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
