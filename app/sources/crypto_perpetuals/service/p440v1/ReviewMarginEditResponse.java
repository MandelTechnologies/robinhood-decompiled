package crypto_perpetuals.service.p440v1;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import crypto_perpetuals.common.p435v1.FXFee;
import crypto_perpetuals.common.p435v1.FXQuote;
import crypto_perpetuals.common.p435v1.Money;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ReviewMarginEditResponse.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016Jv\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006-"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ReviewMarginEditResponse;", "Lcom/squareup/wire/Message;", "", "position_id", "", "ref_id", "fx_fee", "Lcrypto_perpetuals/common/v1/FXFee;", "new_estimated_liquidation_price", "margin_delta_breakdown", "", "Lcrypto_perpetuals/common/v1/Money;", "total_margin_delta", "fx_quote", "Lcrypto_perpetuals/common/v1/FXQuote;", "fx_summary", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/FXFee;Ljava/lang/String;Ljava/util/List;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/FXQuote;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getPosition_id", "()Ljava/lang/String;", "getRef_id", "getFx_fee", "()Lcrypto_perpetuals/common/v1/FXFee;", "getNew_estimated_liquidation_price", "getTotal_margin_delta", "()Lcrypto_perpetuals/common/v1/Money;", "getFx_quote", "()Lcrypto_perpetuals/common/v1/FXQuote;", "getFx_summary", "getDisclosure", "getMargin_delta_breakdown", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ReviewMarginEditResponse extends Message {

    @JvmField
    public static final ProtoAdapter<ReviewMarginEditResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 21)
    private final String disclosure;

    @WireField(adapter = "crypto_perpetuals.common.v1.FXFee#ADAPTER", jsonName = "fxFee", schemaIndex = 2, tag = 3)
    private final FXFee fx_fee;

    @WireField(adapter = "crypto_perpetuals.common.v1.FXQuote#ADAPTER", jsonName = "fxQuote", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final FXQuote fx_quote;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fxSummary", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 20)
    private final String fx_summary;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "marginDeltaBreakdown", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<Money> margin_delta_breakdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "newEstimatedLiquidationPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String new_estimated_liquidation_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "positionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String position_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String ref_id;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "totalMarginDelta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Money total_margin_delta;

    public ReviewMarginEditResponse() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ ReviewMarginEditResponse(String str, String str2, FXFee fXFee, String str3, List list, Money money, FXQuote fXQuote, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : fXFee, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : money, (i & 64) != 0 ? null : fXQuote, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27887newBuilder();
    }

    public final String getPosition_id() {
        return this.position_id;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final FXFee getFx_fee() {
        return this.fx_fee;
    }

    public final String getNew_estimated_liquidation_price() {
        return this.new_estimated_liquidation_price;
    }

    public final Money getTotal_margin_delta() {
        return this.total_margin_delta;
    }

    public final FXQuote getFx_quote() {
        return this.fx_quote;
    }

    public final String getFx_summary() {
        return this.fx_summary;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewMarginEditResponse(String position_id, String ref_id, FXFee fXFee, String new_estimated_liquidation_price, List<Money> margin_delta_breakdown, Money money, FXQuote fXQuote, String fx_summary, String disclosure, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(position_id, "position_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(new_estimated_liquidation_price, "new_estimated_liquidation_price");
        Intrinsics.checkNotNullParameter(margin_delta_breakdown, "margin_delta_breakdown");
        Intrinsics.checkNotNullParameter(fx_summary, "fx_summary");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.position_id = position_id;
        this.ref_id = ref_id;
        this.fx_fee = fXFee;
        this.new_estimated_liquidation_price = new_estimated_liquidation_price;
        this.total_margin_delta = money;
        this.fx_quote = fXQuote;
        this.fx_summary = fx_summary;
        this.disclosure = disclosure;
        this.margin_delta_breakdown = Internal.immutableCopyOf("margin_delta_breakdown", margin_delta_breakdown);
    }

    public final List<Money> getMargin_delta_breakdown() {
        return this.margin_delta_breakdown;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27887newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ReviewMarginEditResponse)) {
            return false;
        }
        ReviewMarginEditResponse reviewMarginEditResponse = (ReviewMarginEditResponse) other;
        return Intrinsics.areEqual(unknownFields(), reviewMarginEditResponse.unknownFields()) && Intrinsics.areEqual(this.position_id, reviewMarginEditResponse.position_id) && Intrinsics.areEqual(this.ref_id, reviewMarginEditResponse.ref_id) && Intrinsics.areEqual(this.fx_fee, reviewMarginEditResponse.fx_fee) && Intrinsics.areEqual(this.new_estimated_liquidation_price, reviewMarginEditResponse.new_estimated_liquidation_price) && Intrinsics.areEqual(this.margin_delta_breakdown, reviewMarginEditResponse.margin_delta_breakdown) && Intrinsics.areEqual(this.total_margin_delta, reviewMarginEditResponse.total_margin_delta) && Intrinsics.areEqual(this.fx_quote, reviewMarginEditResponse.fx_quote) && Intrinsics.areEqual(this.fx_summary, reviewMarginEditResponse.fx_summary) && Intrinsics.areEqual(this.disclosure, reviewMarginEditResponse.disclosure);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.position_id.hashCode()) * 37) + this.ref_id.hashCode()) * 37;
        FXFee fXFee = this.fx_fee;
        int iHashCode2 = (((((iHashCode + (fXFee != null ? fXFee.hashCode() : 0)) * 37) + this.new_estimated_liquidation_price.hashCode()) * 37) + this.margin_delta_breakdown.hashCode()) * 37;
        Money money = this.total_margin_delta;
        int iHashCode3 = (iHashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        FXQuote fXQuote = this.fx_quote;
        int iHashCode4 = ((((iHashCode3 + (fXQuote != null ? fXQuote.hashCode() : 0)) * 37) + this.fx_summary.hashCode()) * 37) + this.disclosure.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("position_id=" + Internal.sanitize(this.position_id));
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        FXFee fXFee = this.fx_fee;
        if (fXFee != null) {
            arrayList.add("fx_fee=" + fXFee);
        }
        arrayList.add("new_estimated_liquidation_price=" + Internal.sanitize(this.new_estimated_liquidation_price));
        if (!this.margin_delta_breakdown.isEmpty()) {
            arrayList.add("margin_delta_breakdown=" + this.margin_delta_breakdown);
        }
        Money money = this.total_margin_delta;
        if (money != null) {
            arrayList.add("total_margin_delta=" + money);
        }
        FXQuote fXQuote = this.fx_quote;
        if (fXQuote != null) {
            arrayList.add("fx_quote=" + fXQuote);
        }
        arrayList.add("fx_summary=" + Internal.sanitize(this.fx_summary));
        arrayList.add("disclosure=" + Internal.sanitize(this.disclosure));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReviewMarginEditResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ReviewMarginEditResponse copy$default(ReviewMarginEditResponse reviewMarginEditResponse, String str, String str2, FXFee fXFee, String str3, List list, Money money, FXQuote fXQuote, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reviewMarginEditResponse.position_id;
        }
        if ((i & 2) != 0) {
            str2 = reviewMarginEditResponse.ref_id;
        }
        if ((i & 4) != 0) {
            fXFee = reviewMarginEditResponse.fx_fee;
        }
        if ((i & 8) != 0) {
            str3 = reviewMarginEditResponse.new_estimated_liquidation_price;
        }
        if ((i & 16) != 0) {
            list = reviewMarginEditResponse.margin_delta_breakdown;
        }
        if ((i & 32) != 0) {
            money = reviewMarginEditResponse.total_margin_delta;
        }
        if ((i & 64) != 0) {
            fXQuote = reviewMarginEditResponse.fx_quote;
        }
        if ((i & 128) != 0) {
            str4 = reviewMarginEditResponse.fx_summary;
        }
        if ((i & 256) != 0) {
            str5 = reviewMarginEditResponse.disclosure;
        }
        if ((i & 512) != 0) {
            byteString = reviewMarginEditResponse.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        FXQuote fXQuote2 = fXQuote;
        String str7 = str4;
        List list2 = list;
        Money money2 = money;
        return reviewMarginEditResponse.copy(str, str2, fXFee, str3, list2, money2, fXQuote2, str7, str6, byteString2);
    }

    public final ReviewMarginEditResponse copy(String position_id, String ref_id, FXFee fx_fee, String new_estimated_liquidation_price, List<Money> margin_delta_breakdown, Money total_margin_delta, FXQuote fx_quote, String fx_summary, String disclosure, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(position_id, "position_id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(new_estimated_liquidation_price, "new_estimated_liquidation_price");
        Intrinsics.checkNotNullParameter(margin_delta_breakdown, "margin_delta_breakdown");
        Intrinsics.checkNotNullParameter(fx_summary, "fx_summary");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ReviewMarginEditResponse(position_id, ref_id, fx_fee, new_estimated_liquidation_price, margin_delta_breakdown, total_margin_delta, fx_quote, fx_summary, disclosure, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ReviewMarginEditResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ReviewMarginEditResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.service.v1.ReviewMarginEditResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ReviewMarginEditResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPosition_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPosition_id());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRef_id());
                }
                int iEncodedSizeWithTag = size + FXFee.ADAPTER.encodedSizeWithTag(3, value.getFx_fee());
                if (!Intrinsics.areEqual(value.getNew_estimated_liquidation_price(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getNew_estimated_liquidation_price());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(5, value.getMargin_delta_breakdown());
                if (value.getTotal_margin_delta() != null) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(6, value.getTotal_margin_delta());
                }
                if (value.getFx_quote() != null) {
                    iEncodedSizeWithTag2 += FXQuote.ADAPTER.encodedSizeWithTag(7, value.getFx_quote());
                }
                if (!Intrinsics.areEqual(value.getFx_summary(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(20, value.getFx_summary());
                }
                return !Intrinsics.areEqual(value.getDisclosure(), "") ? iEncodedSizeWithTag2 + ProtoAdapter.STRING.encodedSizeWithTag(21, value.getDisclosure()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ReviewMarginEditResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPosition_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPosition_id());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRef_id());
                }
                FXFee.ADAPTER.encodeWithTag(writer, 3, (int) value.getFx_fee());
                if (!Intrinsics.areEqual(value.getNew_estimated_liquidation_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getNew_estimated_liquidation_price());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 5, (int) value.getMargin_delta_breakdown());
                if (value.getTotal_margin_delta() != null) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getTotal_margin_delta());
                }
                if (value.getFx_quote() != null) {
                    FXQuote.ADAPTER.encodeWithTag(writer, 7, (int) value.getFx_quote());
                }
                if (!Intrinsics.areEqual(value.getFx_summary(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getFx_summary());
                }
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getDisclosure());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ReviewMarginEditResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDisclosure(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getDisclosure());
                }
                if (!Intrinsics.areEqual(value.getFx_summary(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getFx_summary());
                }
                if (value.getFx_quote() != null) {
                    FXQuote.ADAPTER.encodeWithTag(writer, 7, (int) value.getFx_quote());
                }
                if (value.getTotal_margin_delta() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getTotal_margin_delta());
                }
                Money.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getMargin_delta_breakdown());
                if (!Intrinsics.areEqual(value.getNew_estimated_liquidation_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getNew_estimated_liquidation_price());
                }
                FXFee.ADAPTER.encodeWithTag(writer, 3, (int) value.getFx_fee());
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRef_id());
                }
                if (Intrinsics.areEqual(value.getPosition_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPosition_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ReviewMarginEditResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                FXFee fXFeeDecode = null;
                Money moneyDecode = null;
                FXQuote fXQuoteDecode = null;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ReviewMarginEditResponse(strDecode, strDecode5, fXFeeDecode, strDecode2, arrayList, moneyDecode, fXQuoteDecode, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 20) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 21) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                fXFeeDecode = FXFee.ADAPTER.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                arrayList.add(Money.ADAPTER.decode(reader));
                                break;
                            case 6:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 7:
                                fXQuoteDecode = FXQuote.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ReviewMarginEditResponse redact(ReviewMarginEditResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FXFee fx_fee = value.getFx_fee();
                FXFee fXFeeRedact = fx_fee != null ? FXFee.ADAPTER.redact(fx_fee) : null;
                List<Money> margin_delta_breakdown = value.getMargin_delta_breakdown();
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                List listM26823redactElements = Internal.m26823redactElements(margin_delta_breakdown, protoAdapter);
                Money total_margin_delta = value.getTotal_margin_delta();
                Money moneyRedact = total_margin_delta != null ? protoAdapter.redact(total_margin_delta) : null;
                FXQuote fx_quote = value.getFx_quote();
                return ReviewMarginEditResponse.copy$default(value, null, null, fXFeeRedact, null, listM26823redactElements, moneyRedact, fx_quote != null ? FXQuote.ADAPTER.redact(fx_quote) : null, null, null, ByteString.EMPTY, 395, null);
            }
        };
    }
}
