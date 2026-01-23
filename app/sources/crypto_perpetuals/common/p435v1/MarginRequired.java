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

/* compiled from: MarginRequired.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\fH\u0016Jp\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u0006)"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/MarginRequired;", "Lcom/squareup/wire/Message;", "", "total_margin_required", "Lcrypto_perpetuals/common/v1/Money;", "margin_from_existing_position", "margin_from_spot_position", "fx_quote", "Lcrypto_perpetuals/common/v1/FXQuote;", "tiered_margin_breakdowns", "Lcrypto_perpetuals/common/v1/TieredMarginBreakdowns;", "banner_text", "", "estimated_order_notional", "additional_margin_required", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/FXQuote;Lcrypto_perpetuals/common/v1/TieredMarginBreakdowns;Ljava/lang/String;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lokio/ByteString;)V", "getTotal_margin_required", "()Lcrypto_perpetuals/common/v1/Money;", "getMargin_from_existing_position", "getMargin_from_spot_position", "getFx_quote", "()Lcrypto_perpetuals/common/v1/FXQuote;", "getTiered_margin_breakdowns", "()Lcrypto_perpetuals/common/v1/TieredMarginBreakdowns;", "getBanner_text", "()Ljava/lang/String;", "getEstimated_order_notional", "getAdditional_margin_required", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class MarginRequired extends Message {

    @JvmField
    public static final ProtoAdapter<MarginRequired> ADAPTER;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "additionalMarginRequired", schemaIndex = 7, tag = 8)
    private final Money additional_margin_required;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bannerText", schemaIndex = 5, tag = 6)
    private final String banner_text;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "estimatedOrderNotional", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Money estimated_order_notional;

    @WireField(adapter = "crypto_perpetuals.common.v1.FXQuote#ADAPTER", jsonName = "fxQuote", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final FXQuote fx_quote;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "marginFromExistingPosition", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money margin_from_existing_position;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "marginFromSpotPosition", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money margin_from_spot_position;

    @WireField(adapter = "crypto_perpetuals.common.v1.TieredMarginBreakdowns#ADAPTER", jsonName = "tieredMarginBreakdowns", schemaIndex = 4, tag = 5)
    private final TieredMarginBreakdowns tiered_margin_breakdowns;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "totalMarginRequired", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money total_margin_required;

    public MarginRequired() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27815newBuilder();
    }

    public final Money getTotal_margin_required() {
        return this.total_margin_required;
    }

    public final Money getMargin_from_existing_position() {
        return this.margin_from_existing_position;
    }

    public final Money getMargin_from_spot_position() {
        return this.margin_from_spot_position;
    }

    public final FXQuote getFx_quote() {
        return this.fx_quote;
    }

    public final TieredMarginBreakdowns getTiered_margin_breakdowns() {
        return this.tiered_margin_breakdowns;
    }

    public final String getBanner_text() {
        return this.banner_text;
    }

    public final Money getEstimated_order_notional() {
        return this.estimated_order_notional;
    }

    public final Money getAdditional_margin_required() {
        return this.additional_margin_required;
    }

    public /* synthetic */ MarginRequired(Money money, Money money2, Money money3, FXQuote fXQuote, TieredMarginBreakdowns tieredMarginBreakdowns, String str, Money money4, Money money5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, (i & 4) != 0 ? null : money3, (i & 8) != 0 ? null : fXQuote, (i & 16) != 0 ? null : tieredMarginBreakdowns, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : money4, (i & 128) != 0 ? null : money5, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginRequired(Money money, Money money2, Money money3, FXQuote fXQuote, TieredMarginBreakdowns tieredMarginBreakdowns, String str, Money money4, Money money5, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.total_margin_required = money;
        this.margin_from_existing_position = money2;
        this.margin_from_spot_position = money3;
        this.fx_quote = fXQuote;
        this.tiered_margin_breakdowns = tieredMarginBreakdowns;
        this.banner_text = str;
        this.estimated_order_notional = money4;
        this.additional_margin_required = money5;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27815newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarginRequired)) {
            return false;
        }
        MarginRequired marginRequired = (MarginRequired) other;
        return Intrinsics.areEqual(unknownFields(), marginRequired.unknownFields()) && Intrinsics.areEqual(this.total_margin_required, marginRequired.total_margin_required) && Intrinsics.areEqual(this.margin_from_existing_position, marginRequired.margin_from_existing_position) && Intrinsics.areEqual(this.margin_from_spot_position, marginRequired.margin_from_spot_position) && Intrinsics.areEqual(this.fx_quote, marginRequired.fx_quote) && Intrinsics.areEqual(this.tiered_margin_breakdowns, marginRequired.tiered_margin_breakdowns) && Intrinsics.areEqual(this.banner_text, marginRequired.banner_text) && Intrinsics.areEqual(this.estimated_order_notional, marginRequired.estimated_order_notional) && Intrinsics.areEqual(this.additional_margin_required, marginRequired.additional_margin_required);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.total_margin_required;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.margin_from_existing_position;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.margin_from_spot_position;
        int iHashCode4 = (iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37;
        FXQuote fXQuote = this.fx_quote;
        int iHashCode5 = (iHashCode4 + (fXQuote != null ? fXQuote.hashCode() : 0)) * 37;
        TieredMarginBreakdowns tieredMarginBreakdowns = this.tiered_margin_breakdowns;
        int iHashCode6 = (iHashCode5 + (tieredMarginBreakdowns != null ? tieredMarginBreakdowns.hashCode() : 0)) * 37;
        String str = this.banner_text;
        int iHashCode7 = (iHashCode6 + (str != null ? str.hashCode() : 0)) * 37;
        Money money4 = this.estimated_order_notional;
        int iHashCode8 = (iHashCode7 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.additional_margin_required;
        int iHashCode9 = iHashCode8 + (money5 != null ? money5.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.total_margin_required;
        if (money != null) {
            arrayList.add("total_margin_required=" + money);
        }
        Money money2 = this.margin_from_existing_position;
        if (money2 != null) {
            arrayList.add("margin_from_existing_position=" + money2);
        }
        Money money3 = this.margin_from_spot_position;
        if (money3 != null) {
            arrayList.add("margin_from_spot_position=" + money3);
        }
        FXQuote fXQuote = this.fx_quote;
        if (fXQuote != null) {
            arrayList.add("fx_quote=" + fXQuote);
        }
        TieredMarginBreakdowns tieredMarginBreakdowns = this.tiered_margin_breakdowns;
        if (tieredMarginBreakdowns != null) {
            arrayList.add("tiered_margin_breakdowns=" + tieredMarginBreakdowns);
        }
        String str = this.banner_text;
        if (str != null) {
            arrayList.add("banner_text=" + Internal.sanitize(str));
        }
        Money money4 = this.estimated_order_notional;
        if (money4 != null) {
            arrayList.add("estimated_order_notional=" + money4);
        }
        Money money5 = this.additional_margin_required;
        if (money5 != null) {
            arrayList.add("additional_margin_required=" + money5);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarginRequired{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MarginRequired copy$default(MarginRequired marginRequired, Money money, Money money2, Money money3, FXQuote fXQuote, TieredMarginBreakdowns tieredMarginBreakdowns, String str, Money money4, Money money5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            money = marginRequired.total_margin_required;
        }
        if ((i & 2) != 0) {
            money2 = marginRequired.margin_from_existing_position;
        }
        if ((i & 4) != 0) {
            money3 = marginRequired.margin_from_spot_position;
        }
        if ((i & 8) != 0) {
            fXQuote = marginRequired.fx_quote;
        }
        if ((i & 16) != 0) {
            tieredMarginBreakdowns = marginRequired.tiered_margin_breakdowns;
        }
        if ((i & 32) != 0) {
            str = marginRequired.banner_text;
        }
        if ((i & 64) != 0) {
            money4 = marginRequired.estimated_order_notional;
        }
        if ((i & 128) != 0) {
            money5 = marginRequired.additional_margin_required;
        }
        if ((i & 256) != 0) {
            byteString = marginRequired.unknownFields();
        }
        Money money6 = money5;
        ByteString byteString2 = byteString;
        String str2 = str;
        Money money7 = money4;
        TieredMarginBreakdowns tieredMarginBreakdowns2 = tieredMarginBreakdowns;
        Money money8 = money3;
        return marginRequired.copy(money, money2, money8, fXQuote, tieredMarginBreakdowns2, str2, money7, money6, byteString2);
    }

    public final MarginRequired copy(Money total_margin_required, Money margin_from_existing_position, Money margin_from_spot_position, FXQuote fx_quote, TieredMarginBreakdowns tiered_margin_breakdowns, String banner_text, Money estimated_order_notional, Money additional_margin_required, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarginRequired(total_margin_required, margin_from_existing_position, margin_from_spot_position, fx_quote, tiered_margin_breakdowns, banner_text, estimated_order_notional, additional_margin_required, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginRequired.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarginRequired>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.common.v1.MarginRequired$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarginRequired value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTotal_margin_required() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getTotal_margin_required());
                }
                if (value.getMargin_from_existing_position() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getMargin_from_existing_position());
                }
                if (value.getMargin_from_spot_position() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getMargin_from_spot_position());
                }
                if (value.getFx_quote() != null) {
                    size += FXQuote.ADAPTER.encodedSizeWithTag(4, value.getFx_quote());
                }
                int iEncodedSizeWithTag = size + TieredMarginBreakdowns.ADAPTER.encodedSizeWithTag(5, value.getTiered_margin_breakdowns()) + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getBanner_text());
                if (value.getEstimated_order_notional() != null) {
                    iEncodedSizeWithTag += Money.ADAPTER.encodedSizeWithTag(7, value.getEstimated_order_notional());
                }
                return iEncodedSizeWithTag + Money.ADAPTER.encodedSizeWithTag(8, value.getAdditional_margin_required());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarginRequired value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTotal_margin_required() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getTotal_margin_required());
                }
                if (value.getMargin_from_existing_position() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getMargin_from_existing_position());
                }
                if (value.getMargin_from_spot_position() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getMargin_from_spot_position());
                }
                if (value.getFx_quote() != null) {
                    FXQuote.ADAPTER.encodeWithTag(writer, 4, (int) value.getFx_quote());
                }
                TieredMarginBreakdowns.ADAPTER.encodeWithTag(writer, 5, (int) value.getTiered_margin_breakdowns());
                ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getBanner_text());
                if (value.getEstimated_order_notional() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getEstimated_order_notional());
                }
                Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getAdditional_margin_required());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarginRequired value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getAdditional_margin_required());
                if (value.getEstimated_order_notional() != null) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getEstimated_order_notional());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getBanner_text());
                TieredMarginBreakdowns.ADAPTER.encodeWithTag(writer, 5, (int) value.getTiered_margin_breakdowns());
                if (value.getFx_quote() != null) {
                    FXQuote.ADAPTER.encodeWithTag(writer, 4, (int) value.getFx_quote());
                }
                if (value.getMargin_from_spot_position() != null) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getMargin_from_spot_position());
                }
                if (value.getMargin_from_existing_position() != null) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getMargin_from_existing_position());
                }
                if (value.getTotal_margin_required() != null) {
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getTotal_margin_required());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginRequired redact(MarginRequired value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money total_margin_required = value.getTotal_margin_required();
                Money moneyRedact = total_margin_required != null ? Money.ADAPTER.redact(total_margin_required) : null;
                Money margin_from_existing_position = value.getMargin_from_existing_position();
                Money moneyRedact2 = margin_from_existing_position != null ? Money.ADAPTER.redact(margin_from_existing_position) : null;
                Money margin_from_spot_position = value.getMargin_from_spot_position();
                Money moneyRedact3 = margin_from_spot_position != null ? Money.ADAPTER.redact(margin_from_spot_position) : null;
                FXQuote fx_quote = value.getFx_quote();
                FXQuote fXQuoteRedact = fx_quote != null ? FXQuote.ADAPTER.redact(fx_quote) : null;
                TieredMarginBreakdowns tiered_margin_breakdowns = value.getTiered_margin_breakdowns();
                TieredMarginBreakdowns tieredMarginBreakdownsRedact = tiered_margin_breakdowns != null ? TieredMarginBreakdowns.ADAPTER.redact(tiered_margin_breakdowns) : null;
                Money estimated_order_notional = value.getEstimated_order_notional();
                Money moneyRedact4 = estimated_order_notional != null ? Money.ADAPTER.redact(estimated_order_notional) : null;
                Money additional_margin_required = value.getAdditional_margin_required();
                return MarginRequired.copy$default(value, moneyRedact, moneyRedact2, moneyRedact3, fXQuoteRedact, tieredMarginBreakdownsRedact, null, moneyRedact4, additional_margin_required != null ? Money.ADAPTER.redact(additional_margin_required) : null, ByteString.EMPTY, 32, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MarginRequired decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                FXQuote fXQuoteDecode = null;
                TieredMarginBreakdowns tieredMarginBreakdownsDecode = null;
                String strDecode = null;
                Money moneyDecode4 = null;
                Money moneyDecode5 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 2:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 3:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                break;
                            case 4:
                                fXQuoteDecode = FXQuote.ADAPTER.decode(reader);
                                break;
                            case 5:
                                tieredMarginBreakdownsDecode = TieredMarginBreakdowns.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                break;
                            case 8:
                                moneyDecode5 = Money.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new MarginRequired(moneyDecode, moneyDecode2, moneyDecode3, fXQuoteDecode, tieredMarginBreakdownsDecode, strDecode, moneyDecode4, moneyDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
