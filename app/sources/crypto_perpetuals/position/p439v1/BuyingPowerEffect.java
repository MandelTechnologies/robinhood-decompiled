package crypto_perpetuals.position.p439v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import crypto_perpetuals.common.p435v1.FXQuote;
import crypto_perpetuals.common.p435v1.Money;
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

/* compiled from: BuyingPowerEffect.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J@\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/BuyingPowerEffect;", "Lcom/squareup/wire/Message;", "", "fx_quote", "Lcrypto_perpetuals/common/v1/FXQuote;", "usd_margin", "Lcrypto_perpetuals/common/v1/Money;", "eur_margin", "estimated_total", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_perpetuals/common/v1/FXQuote;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lokio/ByteString;)V", "getFx_quote", "()Lcrypto_perpetuals/common/v1/FXQuote;", "getUsd_margin", "()Lcrypto_perpetuals/common/v1/Money;", "getEur_margin", "getEstimated_total", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class BuyingPowerEffect extends Message {

    @JvmField
    public static final ProtoAdapter<BuyingPowerEffect> ADAPTER;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "estimatedTotal", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money estimated_total;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "eurMargin", schemaIndex = 2, tag = 3)
    private final Money eur_margin;

    @WireField(adapter = "crypto_perpetuals.common.v1.FXQuote#ADAPTER", jsonName = "fxQuote", schemaIndex = 0, tag = 1)
    private final FXQuote fx_quote;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "usdMargin", schemaIndex = 1, tag = 2)
    private final Money usd_margin;

    public BuyingPowerEffect() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27854newBuilder();
    }

    public final FXQuote getFx_quote() {
        return this.fx_quote;
    }

    public final Money getUsd_margin() {
        return this.usd_margin;
    }

    public final Money getEur_margin() {
        return this.eur_margin;
    }

    public final Money getEstimated_total() {
        return this.estimated_total;
    }

    public /* synthetic */ BuyingPowerEffect(FXQuote fXQuote, Money money, Money money2, Money money3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fXQuote, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : money2, (i & 8) != 0 ? null : money3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyingPowerEffect(FXQuote fXQuote, Money money, Money money2, Money money3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.fx_quote = fXQuote;
        this.usd_margin = money;
        this.eur_margin = money2;
        this.estimated_total = money3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27854newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BuyingPowerEffect)) {
            return false;
        }
        BuyingPowerEffect buyingPowerEffect = (BuyingPowerEffect) other;
        return Intrinsics.areEqual(unknownFields(), buyingPowerEffect.unknownFields()) && Intrinsics.areEqual(this.fx_quote, buyingPowerEffect.fx_quote) && Intrinsics.areEqual(this.usd_margin, buyingPowerEffect.usd_margin) && Intrinsics.areEqual(this.eur_margin, buyingPowerEffect.eur_margin) && Intrinsics.areEqual(this.estimated_total, buyingPowerEffect.estimated_total);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        FXQuote fXQuote = this.fx_quote;
        int iHashCode2 = (iHashCode + (fXQuote != null ? fXQuote.hashCode() : 0)) * 37;
        Money money = this.usd_margin;
        int iHashCode3 = (iHashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.eur_margin;
        int iHashCode4 = (iHashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.estimated_total;
        int iHashCode5 = iHashCode4 + (money3 != null ? money3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        FXQuote fXQuote = this.fx_quote;
        if (fXQuote != null) {
            arrayList.add("fx_quote=" + fXQuote);
        }
        Money money = this.usd_margin;
        if (money != null) {
            arrayList.add("usd_margin=" + money);
        }
        Money money2 = this.eur_margin;
        if (money2 != null) {
            arrayList.add("eur_margin=" + money2);
        }
        Money money3 = this.estimated_total;
        if (money3 != null) {
            arrayList.add("estimated_total=" + money3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BuyingPowerEffect{", "}", 0, null, null, 56, null);
    }

    public final BuyingPowerEffect copy(FXQuote fx_quote, Money usd_margin, Money eur_margin, Money estimated_total, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BuyingPowerEffect(fx_quote, usd_margin, eur_margin, estimated_total, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BuyingPowerEffect.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BuyingPowerEffect>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.position.v1.BuyingPowerEffect$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BuyingPowerEffect value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + FXQuote.ADAPTER.encodedSizeWithTag(1, value.getFx_quote());
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getUsd_margin()) + protoAdapter.encodedSizeWithTag(3, value.getEur_margin());
                return value.getEstimated_total() != null ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getEstimated_total()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BuyingPowerEffect value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                FXQuote.ADAPTER.encodeWithTag(writer, 1, (int) value.getFx_quote());
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getUsd_margin());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getEur_margin());
                if (value.getEstimated_total() != null) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getEstimated_total());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BuyingPowerEffect value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEstimated_total() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getEstimated_total());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getEur_margin());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getUsd_margin());
                FXQuote.ADAPTER.encodeWithTag(writer, 1, (int) value.getFx_quote());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BuyingPowerEffect redact(BuyingPowerEffect value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FXQuote fx_quote = value.getFx_quote();
                FXQuote fXQuoteRedact = fx_quote != null ? FXQuote.ADAPTER.redact(fx_quote) : null;
                Money usd_margin = value.getUsd_margin();
                Money moneyRedact = usd_margin != null ? Money.ADAPTER.redact(usd_margin) : null;
                Money eur_margin = value.getEur_margin();
                Money moneyRedact2 = eur_margin != null ? Money.ADAPTER.redact(eur_margin) : null;
                Money estimated_total = value.getEstimated_total();
                return value.copy(fXQuoteRedact, moneyRedact, moneyRedact2, estimated_total != null ? Money.ADAPTER.redact(estimated_total) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BuyingPowerEffect decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                FXQuote fXQuoteDecode = null;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BuyingPowerEffect(fXQuoteDecode, moneyDecode, moneyDecode2, moneyDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        fXQuoteDecode = FXQuote.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        moneyDecode2 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        moneyDecode3 = Money.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
