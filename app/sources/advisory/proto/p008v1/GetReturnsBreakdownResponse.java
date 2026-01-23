package advisory.proto.p008v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.rosetta.common.Money;
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

/* compiled from: GetReturnsBreakdownResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'Bu\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016Jt\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u0006("}, m3636d2 = {"Ladvisory/proto/v1/GetReturnsBreakdownResponse;", "Lcom/squareup/wire/Message;", "", "account_number", "", "span", "income", "Lcom/robinhood/rosetta/common/Money;", "advisory_fee", "total_returns", "appreciation", "span_description", "show_bottom_sheet", "", AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_LEARN_MORE, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;ZLjava/lang/String;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getSpan", "getIncome", "()Lcom/robinhood/rosetta/common/Money;", "getAdvisory_fee", "getTotal_returns", "getAppreciation", "getSpan_description", "getShow_bottom_sheet", "()Z", "getLearn_more", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetReturnsBreakdownResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetReturnsBreakdownResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "advisoryFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money advisory_fee;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Money appreciation;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money income;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "learnMore", schemaIndex = 8, tag = 9)
    private final String learn_more;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showBottomSheet", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final boolean show_bottom_sheet;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String span;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "spanDescription", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String span_description;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalReturns", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Money total_returns;

    public GetReturnsBreakdownResponse() {
        this(null, null, null, null, null, null, null, false, null, null, 1023, null);
    }

    public /* synthetic */ GetReturnsBreakdownResponse(String str, String str2, Money money, Money money2, Money money3, Money money4, String str3, boolean z, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : money, (i & 8) != 0 ? null : money2, (i & 16) != 0 ? null : money3, (i & 32) != 0 ? null : money4, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4477newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getSpan() {
        return this.span;
    }

    public final Money getIncome() {
        return this.income;
    }

    public final Money getAdvisory_fee() {
        return this.advisory_fee;
    }

    public final Money getTotal_returns() {
        return this.total_returns;
    }

    public final Money getAppreciation() {
        return this.appreciation;
    }

    public final String getSpan_description() {
        return this.span_description;
    }

    public final boolean getShow_bottom_sheet() {
        return this.show_bottom_sheet;
    }

    public final String getLearn_more() {
        return this.learn_more;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetReturnsBreakdownResponse(String account_number, String span, Money money, Money money2, Money money3, Money money4, String span_description, boolean z, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(span_description, "span_description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.span = span;
        this.income = money;
        this.advisory_fee = money2;
        this.total_returns = money3;
        this.appreciation = money4;
        this.span_description = span_description;
        this.show_bottom_sheet = z;
        this.learn_more = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4477newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetReturnsBreakdownResponse)) {
            return false;
        }
        GetReturnsBreakdownResponse getReturnsBreakdownResponse = (GetReturnsBreakdownResponse) other;
        return Intrinsics.areEqual(unknownFields(), getReturnsBreakdownResponse.unknownFields()) && Intrinsics.areEqual(this.account_number, getReturnsBreakdownResponse.account_number) && Intrinsics.areEqual(this.span, getReturnsBreakdownResponse.span) && Intrinsics.areEqual(this.income, getReturnsBreakdownResponse.income) && Intrinsics.areEqual(this.advisory_fee, getReturnsBreakdownResponse.advisory_fee) && Intrinsics.areEqual(this.total_returns, getReturnsBreakdownResponse.total_returns) && Intrinsics.areEqual(this.appreciation, getReturnsBreakdownResponse.appreciation) && Intrinsics.areEqual(this.span_description, getReturnsBreakdownResponse.span_description) && this.show_bottom_sheet == getReturnsBreakdownResponse.show_bottom_sheet && Intrinsics.areEqual(this.learn_more, getReturnsBreakdownResponse.learn_more);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.span.hashCode()) * 37;
        Money money = this.income;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.advisory_fee;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.total_returns;
        int iHashCode4 = (iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.appreciation;
        int iHashCode5 = (((((iHashCode4 + (money4 != null ? money4.hashCode() : 0)) * 37) + this.span_description.hashCode()) * 37) + Boolean.hashCode(this.show_bottom_sheet)) * 37;
        String str = this.learn_more;
        int iHashCode6 = iHashCode5 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("span=" + Internal.sanitize(this.span));
        Money money = this.income;
        if (money != null) {
            arrayList.add("income=" + money);
        }
        Money money2 = this.advisory_fee;
        if (money2 != null) {
            arrayList.add("advisory_fee=" + money2);
        }
        Money money3 = this.total_returns;
        if (money3 != null) {
            arrayList.add("total_returns=" + money3);
        }
        Money money4 = this.appreciation;
        if (money4 != null) {
            arrayList.add("appreciation=" + money4);
        }
        arrayList.add("span_description=" + Internal.sanitize(this.span_description));
        arrayList.add("show_bottom_sheet=" + this.show_bottom_sheet);
        String str = this.learn_more;
        if (str != null) {
            arrayList.add("learn_more=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetReturnsBreakdownResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetReturnsBreakdownResponse copy$default(GetReturnsBreakdownResponse getReturnsBreakdownResponse, String str, String str2, Money money, Money money2, Money money3, Money money4, String str3, boolean z, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getReturnsBreakdownResponse.account_number;
        }
        if ((i & 2) != 0) {
            str2 = getReturnsBreakdownResponse.span;
        }
        if ((i & 4) != 0) {
            money = getReturnsBreakdownResponse.income;
        }
        if ((i & 8) != 0) {
            money2 = getReturnsBreakdownResponse.advisory_fee;
        }
        if ((i & 16) != 0) {
            money3 = getReturnsBreakdownResponse.total_returns;
        }
        if ((i & 32) != 0) {
            money4 = getReturnsBreakdownResponse.appreciation;
        }
        if ((i & 64) != 0) {
            str3 = getReturnsBreakdownResponse.span_description;
        }
        if ((i & 128) != 0) {
            z = getReturnsBreakdownResponse.show_bottom_sheet;
        }
        if ((i & 256) != 0) {
            str4 = getReturnsBreakdownResponse.learn_more;
        }
        if ((i & 512) != 0) {
            byteString = getReturnsBreakdownResponse.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        String str6 = str3;
        boolean z2 = z;
        Money money5 = money3;
        Money money6 = money4;
        return getReturnsBreakdownResponse.copy(str, str2, money, money2, money5, money6, str6, z2, str5, byteString2);
    }

    public final GetReturnsBreakdownResponse copy(String account_number, String span, Money income, Money advisory_fee, Money total_returns, Money appreciation, String span_description, boolean show_bottom_sheet, String learn_more, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(span_description, "span_description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetReturnsBreakdownResponse(account_number, span, income, advisory_fee, total_returns, appreciation, span_description, show_bottom_sheet, learn_more, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetReturnsBreakdownResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetReturnsBreakdownResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetReturnsBreakdownResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetReturnsBreakdownResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getSpan(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSpan());
                }
                if (value.getIncome() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getIncome());
                }
                if (value.getAdvisory_fee() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getAdvisory_fee());
                }
                if (value.getTotal_returns() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(5, value.getTotal_returns());
                }
                if (value.getAppreciation() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(6, value.getAppreciation());
                }
                if (!Intrinsics.areEqual(value.getSpan_description(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getSpan_description());
                }
                if (value.getShow_bottom_sheet()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getShow_bottom_sheet()));
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(9, value.getLearn_more());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetReturnsBreakdownResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getSpan(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSpan());
                }
                if (value.getIncome() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getIncome());
                }
                if (value.getAdvisory_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getAdvisory_fee());
                }
                if (value.getTotal_returns() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getTotal_returns());
                }
                if (value.getAppreciation() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getAppreciation());
                }
                if (!Intrinsics.areEqual(value.getSpan_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getSpan_description());
                }
                if (value.getShow_bottom_sheet()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getShow_bottom_sheet()));
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getLearn_more());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetReturnsBreakdownResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 9, (int) value.getLearn_more());
                if (value.getShow_bottom_sheet()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getShow_bottom_sheet()));
                }
                if (!Intrinsics.areEqual(value.getSpan_description(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getSpan_description());
                }
                if (value.getAppreciation() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getAppreciation());
                }
                if (value.getTotal_returns() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getTotal_returns());
                }
                if (value.getAdvisory_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getAdvisory_fee());
                }
                if (value.getIncome() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getIncome());
                }
                if (!Intrinsics.areEqual(value.getSpan(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getSpan());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetReturnsBreakdownResponse redact(GetReturnsBreakdownResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money income = value.getIncome();
                Money moneyRedact = income != null ? Money.ADAPTER.redact(income) : null;
                Money advisory_fee = value.getAdvisory_fee();
                Money moneyRedact2 = advisory_fee != null ? Money.ADAPTER.redact(advisory_fee) : null;
                Money total_returns = value.getTotal_returns();
                Money moneyRedact3 = total_returns != null ? Money.ADAPTER.redact(total_returns) : null;
                Money appreciation = value.getAppreciation();
                return GetReturnsBreakdownResponse.copy$default(value, null, null, moneyRedact, moneyRedact2, moneyRedact3, appreciation != null ? Money.ADAPTER.redact(appreciation) : null, null, false, null, ByteString.EMPTY, 451, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetReturnsBreakdownResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                Money moneyDecode4 = null;
                String strDecode2 = null;
                boolean zBooleanValue = false;
                String strDecode3 = "";
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 4:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 5:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                break;
                            case 6:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 9:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetReturnsBreakdownResponse(strDecode, strDecode3, moneyDecode, moneyDecode2, moneyDecode3, moneyDecode4, strDecode4, zBooleanValue, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
