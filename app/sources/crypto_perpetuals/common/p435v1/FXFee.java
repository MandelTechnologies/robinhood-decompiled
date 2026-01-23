package crypto_perpetuals.common.p435v1;

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

/* compiled from: FXFee.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J2\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/FXFee;", "Lcom/squareup/wire/Message;", "", "fx_amount", "Lcrypto_perpetuals/common/v1/Money;", "fx_fee_percentage", "", "estimated_fx_fee", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_perpetuals/common/v1/Money;Ljava/lang/String;Lcrypto_perpetuals/common/v1/Money;Lokio/ByteString;)V", "getFx_amount", "()Lcrypto_perpetuals/common/v1/Money;", "getFx_fee_percentage", "()Ljava/lang/String;", "getEstimated_fx_fee", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FXFee extends Message {

    @JvmField
    public static final ProtoAdapter<FXFee> ADAPTER;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "estimatedFxFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money estimated_fx_fee;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "fxAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money fx_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fxFeePercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String fx_fee_percentage;

    public FXFee() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27812newBuilder();
    }

    public final Money getFx_amount() {
        return this.fx_amount;
    }

    public final String getFx_fee_percentage() {
        return this.fx_fee_percentage;
    }

    public /* synthetic */ FXFee(Money money, String str, Money money2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : money2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Money getEstimated_fx_fee() {
        return this.estimated_fx_fee;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FXFee(Money money, String fx_fee_percentage, Money money2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(fx_fee_percentage, "fx_fee_percentage");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.fx_amount = money;
        this.fx_fee_percentage = fx_fee_percentage;
        this.estimated_fx_fee = money2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27812newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FXFee)) {
            return false;
        }
        FXFee fXFee = (FXFee) other;
        return Intrinsics.areEqual(unknownFields(), fXFee.unknownFields()) && Intrinsics.areEqual(this.fx_amount, fXFee.fx_amount) && Intrinsics.areEqual(this.fx_fee_percentage, fXFee.fx_fee_percentage) && Intrinsics.areEqual(this.estimated_fx_fee, fXFee.estimated_fx_fee);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.fx_amount;
        int iHashCode2 = (((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.fx_fee_percentage.hashCode()) * 37;
        Money money2 = this.estimated_fx_fee;
        int iHashCode3 = iHashCode2 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.fx_amount;
        if (money != null) {
            arrayList.add("fx_amount=" + money);
        }
        arrayList.add("fx_fee_percentage=" + Internal.sanitize(this.fx_fee_percentage));
        Money money2 = this.estimated_fx_fee;
        if (money2 != null) {
            arrayList.add("estimated_fx_fee=" + money2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FXFee{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FXFee copy$default(FXFee fXFee, Money money, String str, Money money2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            money = fXFee.fx_amount;
        }
        if ((i & 2) != 0) {
            str = fXFee.fx_fee_percentage;
        }
        if ((i & 4) != 0) {
            money2 = fXFee.estimated_fx_fee;
        }
        if ((i & 8) != 0) {
            byteString = fXFee.unknownFields();
        }
        return fXFee.copy(money, str, money2, byteString);
    }

    public final FXFee copy(Money fx_amount, String fx_fee_percentage, Money estimated_fx_fee, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(fx_fee_percentage, "fx_fee_percentage");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FXFee(fx_amount, fx_fee_percentage, estimated_fx_fee, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FXFee.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FXFee>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.common.v1.FXFee$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FXFee value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getFx_amount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getFx_amount());
                }
                if (!Intrinsics.areEqual(value.getFx_fee_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFx_fee_percentage());
                }
                return value.getEstimated_fx_fee() != null ? size + Money.ADAPTER.encodedSizeWithTag(3, value.getEstimated_fx_fee()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FXFee value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getFx_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getFx_amount());
                }
                if (!Intrinsics.areEqual(value.getFx_fee_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFx_fee_percentage());
                }
                if (value.getEstimated_fx_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getEstimated_fx_fee());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FXFee value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEstimated_fx_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getEstimated_fx_fee());
                }
                if (!Intrinsics.areEqual(value.getFx_fee_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFx_fee_percentage());
                }
                if (value.getFx_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getFx_amount());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FXFee redact(FXFee value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money fx_amount = value.getFx_amount();
                Money moneyRedact = fx_amount != null ? Money.ADAPTER.redact(fx_amount) : null;
                Money estimated_fx_fee = value.getEstimated_fx_fee();
                return FXFee.copy$default(value, moneyRedact, null, estimated_fx_fee != null ? Money.ADAPTER.redact(estimated_fx_fee) : null, ByteString.EMPTY, 2, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FXFee decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                String strDecode = "";
                Money moneyDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FXFee(moneyDecode, strDecode, moneyDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        moneyDecode2 = Money.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
