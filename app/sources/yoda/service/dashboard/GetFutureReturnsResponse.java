package yoda.service.dashboard;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.common.Currency;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
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

/* compiled from: GetFutureReturnsResponse.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010&\u001a\u00020\u0002H\u0017J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\b\u0010+\u001a\u00020\u000fH\u0016J\b\u0010,\u001a\u00020\rH\u0016Jo\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010.R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00060"}, m3636d2 = {"Lyoda/service/dashboard/GetFutureReturnsResponse;", "Lcom/squareup/wire/Message;", "", "currency_code", "Lcom/robinhood/rosetta/common/Currency;", "initial_portfolio_value", "", "one_time_configuration", "Lyoda/service/dashboard/OneTimeConfiguration;", "recurring_deposit_configurations", "", "Lyoda/service/dashboard/RecurringConfiguration;", "account_number", "", "end_of_year_age", "", "highlight_year_idx", "optional_end_of_year_age", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/common/Currency;DLyoda/service/dashboard/OneTimeConfiguration;Ljava/util/List;Ljava/lang/String;IILjava/lang/Integer;Lokio/ByteString;)V", "getCurrency_code", "()Lcom/robinhood/rosetta/common/Currency;", "getInitial_portfolio_value", "()D", "getOne_time_configuration", "()Lyoda/service/dashboard/OneTimeConfiguration;", "getAccount_number", "()Ljava/lang/String;", "getEnd_of_year_age", "()I", "getHighlight_year_idx", "getOptional_end_of_year_age", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRecurring_deposit_configurations", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Lcom/robinhood/rosetta/common/Currency;DLyoda/service/dashboard/OneTimeConfiguration;Ljava/util/List;Ljava/lang/String;IILjava/lang/Integer;Lokio/ByteString;)Lyoda/service/dashboard/GetFutureReturnsResponse;", "Companion", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetFutureReturnsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetFutureReturnsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String account_number;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", jsonName = "currencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Currency currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "endOfYearAge", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int end_of_year_age;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "highlightYearIdx", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int highlight_year_idx;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "initialPortfolioValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double initial_portfolio_value;

    @WireField(adapter = "yoda.service.dashboard.OneTimeConfiguration#ADAPTER", jsonName = "oneTimeConfiguration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final OneTimeConfiguration one_time_configuration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "optionalEndOfYearAge", schemaIndex = 7, tag = 8)
    private final Integer optional_end_of_year_age;

    @WireField(adapter = "yoda.service.dashboard.RecurringConfiguration#ADAPTER", jsonName = "recurringDepositConfigurations", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<RecurringConfiguration> recurring_deposit_configurations;

    public GetFutureReturnsResponse() {
        this(null, 0.0d, null, null, null, 0, 0, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30094newBuilder();
    }

    public final Currency getCurrency_code() {
        return this.currency_code;
    }

    public /* synthetic */ GetFutureReturnsResponse(Currency currency, double d, OneTimeConfiguration oneTimeConfiguration, List list, String str, int i, int i2, Integer num, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i3 & 2) != 0 ? 0.0d : d, (i3 & 4) != 0 ? null : oneTimeConfiguration, (i3 & 8) != 0 ? CollectionsKt.emptyList() : list, (i3 & 16) != 0 ? "" : str, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? null : num, (i3 & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final double getInitial_portfolio_value() {
        return this.initial_portfolio_value;
    }

    public final OneTimeConfiguration getOne_time_configuration() {
        return this.one_time_configuration;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final int getEnd_of_year_age() {
        return this.end_of_year_age;
    }

    public final int getHighlight_year_idx() {
        return this.highlight_year_idx;
    }

    public final Integer getOptional_end_of_year_age() {
        return this.optional_end_of_year_age;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFutureReturnsResponse(Currency currency_code, double d, OneTimeConfiguration oneTimeConfiguration, List<RecurringConfiguration> recurring_deposit_configurations, String account_number, int i, int i2, Integer num, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(recurring_deposit_configurations, "recurring_deposit_configurations");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency_code = currency_code;
        this.initial_portfolio_value = d;
        this.one_time_configuration = oneTimeConfiguration;
        this.account_number = account_number;
        this.end_of_year_age = i;
        this.highlight_year_idx = i2;
        this.optional_end_of_year_age = num;
        this.recurring_deposit_configurations = Internal.immutableCopyOf("recurring_deposit_configurations", recurring_deposit_configurations);
    }

    public final List<RecurringConfiguration> getRecurring_deposit_configurations() {
        return this.recurring_deposit_configurations;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30094newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetFutureReturnsResponse)) {
            return false;
        }
        GetFutureReturnsResponse getFutureReturnsResponse = (GetFutureReturnsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getFutureReturnsResponse.unknownFields()) && this.currency_code == getFutureReturnsResponse.currency_code && this.initial_portfolio_value == getFutureReturnsResponse.initial_portfolio_value && Intrinsics.areEqual(this.one_time_configuration, getFutureReturnsResponse.one_time_configuration) && Intrinsics.areEqual(this.recurring_deposit_configurations, getFutureReturnsResponse.recurring_deposit_configurations) && Intrinsics.areEqual(this.account_number, getFutureReturnsResponse.account_number) && this.end_of_year_age == getFutureReturnsResponse.end_of_year_age && this.highlight_year_idx == getFutureReturnsResponse.highlight_year_idx && Intrinsics.areEqual(this.optional_end_of_year_age, getFutureReturnsResponse.optional_end_of_year_age);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.currency_code.hashCode()) * 37) + Double.hashCode(this.initial_portfolio_value)) * 37;
        OneTimeConfiguration oneTimeConfiguration = this.one_time_configuration;
        int iHashCode2 = (((((((((iHashCode + (oneTimeConfiguration != null ? oneTimeConfiguration.hashCode() : 0)) * 37) + this.recurring_deposit_configurations.hashCode()) * 37) + this.account_number.hashCode()) * 37) + Integer.hashCode(this.end_of_year_age)) * 37) + Integer.hashCode(this.highlight_year_idx)) * 37;
        Integer num = this.optional_end_of_year_age;
        int iHashCode3 = iHashCode2 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("currency_code=" + this.currency_code);
        arrayList.add("initial_portfolio_value=" + this.initial_portfolio_value);
        OneTimeConfiguration oneTimeConfiguration = this.one_time_configuration;
        if (oneTimeConfiguration != null) {
            arrayList.add("one_time_configuration=" + oneTimeConfiguration);
        }
        if (!this.recurring_deposit_configurations.isEmpty()) {
            arrayList.add("recurring_deposit_configurations=" + this.recurring_deposit_configurations);
        }
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("end_of_year_age=" + this.end_of_year_age);
        arrayList.add("highlight_year_idx=" + this.highlight_year_idx);
        Integer num = this.optional_end_of_year_age;
        if (num != null) {
            arrayList.add("optional_end_of_year_age=" + num);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFutureReturnsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetFutureReturnsResponse copy$default(GetFutureReturnsResponse getFutureReturnsResponse, Currency currency, double d, OneTimeConfiguration oneTimeConfiguration, List list, String str, int i, int i2, Integer num, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            currency = getFutureReturnsResponse.currency_code;
        }
        if ((i3 & 2) != 0) {
            d = getFutureReturnsResponse.initial_portfolio_value;
        }
        if ((i3 & 4) != 0) {
            oneTimeConfiguration = getFutureReturnsResponse.one_time_configuration;
        }
        if ((i3 & 8) != 0) {
            list = getFutureReturnsResponse.recurring_deposit_configurations;
        }
        if ((i3 & 16) != 0) {
            str = getFutureReturnsResponse.account_number;
        }
        if ((i3 & 32) != 0) {
            i = getFutureReturnsResponse.end_of_year_age;
        }
        if ((i3 & 64) != 0) {
            i2 = getFutureReturnsResponse.highlight_year_idx;
        }
        if ((i3 & 128) != 0) {
            num = getFutureReturnsResponse.optional_end_of_year_age;
        }
        if ((i3 & 256) != 0) {
            byteString = getFutureReturnsResponse.unknownFields();
        }
        Integer num2 = num;
        ByteString byteString2 = byteString;
        int i4 = i2;
        String str2 = str;
        OneTimeConfiguration oneTimeConfiguration2 = oneTimeConfiguration;
        return getFutureReturnsResponse.copy(currency, d, oneTimeConfiguration2, list, str2, i, i4, num2, byteString2);
    }

    public final GetFutureReturnsResponse copy(Currency currency_code, double initial_portfolio_value, OneTimeConfiguration one_time_configuration, List<RecurringConfiguration> recurring_deposit_configurations, String account_number, int end_of_year_age, int highlight_year_idx, Integer optional_end_of_year_age, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(recurring_deposit_configurations, "recurring_deposit_configurations");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetFutureReturnsResponse(currency_code, initial_portfolio_value, one_time_configuration, recurring_deposit_configurations, account_number, end_of_year_age, highlight_year_idx, optional_end_of_year_age, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetFutureReturnsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetFutureReturnsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: yoda.service.dashboard.GetFutureReturnsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetFutureReturnsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getCurrency_code() != Currency.CURRENCY_UNSPECIFIED) {
                    size += Currency.ADAPTER.encodedSizeWithTag(1, value.getCurrency_code());
                }
                if (!Double.valueOf(value.getInitial_portfolio_value()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getInitial_portfolio_value()));
                }
                if (value.getOne_time_configuration() != null) {
                    size += OneTimeConfiguration.ADAPTER.encodedSizeWithTag(3, value.getOne_time_configuration());
                }
                int iEncodedSizeWithTag = size + RecurringConfiguration.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getRecurring_deposit_configurations());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAccount_number());
                }
                if (value.getEnd_of_year_age() != 0) {
                    iEncodedSizeWithTag += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getEnd_of_year_age()));
                }
                if (value.getHighlight_year_idx() != 0) {
                    iEncodedSizeWithTag += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getHighlight_year_idx()));
                }
                return iEncodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(8, value.getOptional_end_of_year_age());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetFutureReturnsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCurrency_code() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 1, (int) value.getCurrency_code());
                }
                if (!Double.valueOf(value.getInitial_portfolio_value()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getInitial_portfolio_value()));
                }
                if (value.getOne_time_configuration() != null) {
                    OneTimeConfiguration.ADAPTER.encodeWithTag(writer, 3, (int) value.getOne_time_configuration());
                }
                RecurringConfiguration.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getRecurring_deposit_configurations());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAccount_number());
                }
                if (value.getEnd_of_year_age() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getEnd_of_year_age()));
                }
                if (value.getHighlight_year_idx() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getHighlight_year_idx()));
                }
                ProtoAdapter.INT32.encodeWithTag(writer, 8, (int) value.getOptional_end_of_year_age());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetFutureReturnsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getOptional_end_of_year_age());
                if (value.getHighlight_year_idx() != 0) {
                    protoAdapter.encodeWithTag(writer, 7, (int) Integer.valueOf(value.getHighlight_year_idx()));
                }
                if (value.getEnd_of_year_age() != 0) {
                    protoAdapter.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getEnd_of_year_age()));
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAccount_number());
                }
                RecurringConfiguration.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getRecurring_deposit_configurations());
                if (value.getOne_time_configuration() != null) {
                    OneTimeConfiguration.ADAPTER.encodeWithTag(writer, 3, (int) value.getOne_time_configuration());
                }
                if (!Double.valueOf(value.getInitial_portfolio_value()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getInitial_portfolio_value()));
                }
                if (value.getCurrency_code() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 1, (int) value.getCurrency_code());
                }
            }

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                */
            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0026. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public yoda.service.dashboard.GetFutureReturnsResponse decode(com.squareup.wire.ProtoReader r18) {
                /*
                    r17 = this;
                    r1 = r18
                    java.lang.String r0 = "reader"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                    com.robinhood.rosetta.common.Currency r0 = com.robinhood.rosetta.common.Currency.CURRENCY_UNSPECIFIED
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r6.<init>()
                    long r2 = r1.beginMessage()
                    r4 = 0
                    r7 = 0
                    java.lang.String r8 = ""
                    r9 = 0
                    r10 = r8
                    r11 = r9
                    r12 = r11
                    r9 = r7
                    r7 = r4
                    r5 = r9
                L1e:
                    r4 = r0
                L1f:
                    int r13 = r1.nextTag()
                    r0 = -1
                    if (r13 == r0) goto L97
                    switch(r13) {
                        case 1: goto L7c;
                        case 2: goto L6f;
                        case 3: goto L67;
                        case 4: goto L5d;
                        case 5: goto L55;
                        case 6: goto L47;
                        case 7: goto L39;
                        case 8: goto L31;
                        default: goto L29;
                    }
                L29:
                    r1.readUnknownField(r13)
                L2c:
                    r16 = r4
                    r15 = r5
                    goto L93
                L31:
                    com.squareup.wire.ProtoAdapter<java.lang.Integer> r0 = com.squareup.wire.ProtoAdapter.INT32
                    java.lang.Object r0 = r0.decode(r1)
                    r9 = r0
                    goto L1f
                L39:
                    com.squareup.wire.ProtoAdapter<java.lang.Integer> r0 = com.squareup.wire.ProtoAdapter.INT32
                    java.lang.Object r0 = r0.decode(r1)
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r0 = r0.intValue()
                    r12 = r0
                    goto L1f
                L47:
                    com.squareup.wire.ProtoAdapter<java.lang.Integer> r0 = com.squareup.wire.ProtoAdapter.INT32
                    java.lang.Object r0 = r0.decode(r1)
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r0 = r0.intValue()
                    r11 = r0
                    goto L1f
                L55:
                    com.squareup.wire.ProtoAdapter<java.lang.String> r0 = com.squareup.wire.ProtoAdapter.STRING
                    java.lang.Object r0 = r0.decode(r1)
                    r10 = r0
                    goto L1f
                L5d:
                    com.squareup.wire.ProtoAdapter<yoda.service.dashboard.RecurringConfiguration> r0 = yoda.service.dashboard.RecurringConfiguration.ADAPTER
                    java.lang.Object r0 = r0.decode(r1)
                    r6.add(r0)
                    goto L2c
                L67:
                    com.squareup.wire.ProtoAdapter<yoda.service.dashboard.OneTimeConfiguration> r0 = yoda.service.dashboard.OneTimeConfiguration.ADAPTER
                    java.lang.Object r0 = r0.decode(r1)
                    r5 = r0
                    goto L1f
                L6f:
                    com.squareup.wire.ProtoAdapter<java.lang.Double> r0 = com.squareup.wire.ProtoAdapter.DOUBLE
                    java.lang.Object r0 = r0.decode(r1)
                    java.lang.Number r0 = (java.lang.Number) r0
                    double r7 = r0.doubleValue()
                    goto L1f
                L7c:
                    com.squareup.wire.ProtoAdapter<com.robinhood.rosetta.common.Currency> r0 = com.robinhood.rosetta.common.Currency.ADAPTER     // Catch: com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException -> L83
                    java.lang.Object r0 = r0.decode(r1)     // Catch: com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException -> L83
                    goto L1e
                L83:
                    r0 = move-exception
                    com.squareup.wire.FieldEncoding r14 = com.squareup.wire.FieldEncoding.VARINT
                    int r0 = r0.value
                    r16 = r4
                    r15 = r5
                    long r4 = (long) r0
                    java.lang.Long r0 = java.lang.Long.valueOf(r4)
                    r1.addUnknownField(r13, r14, r0)
                L93:
                    r5 = r15
                    r4 = r16
                    goto L1f
                L97:
                    r16 = r4
                    r15 = r5
                    okio.ByteString r0 = r1.endMessageAndGetUnknownFields(r2)
                    yoda.service.dashboard.GetFutureReturnsResponse r1 = new yoda.service.dashboard.GetFutureReturnsResponse
                    r2 = r16
                    com.robinhood.rosetta.common.Currency r2 = (com.robinhood.rosetta.common.Currency) r2
                    r5 = r15
                    yoda.service.dashboard.OneTimeConfiguration r5 = (yoda.service.dashboard.OneTimeConfiguration) r5
                    java.lang.String r10 = (java.lang.String) r10
                    java.lang.Integer r9 = (java.lang.Integer) r9
                    r3 = r7
                    r7 = r10
                    r8 = r11
                    r11 = r0
                    r10 = r9
                    r9 = r12
                    r1.<init>(r2, r3, r5, r6, r7, r8, r9, r10, r11)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: yoda.service.dashboard.GetFutureReturnsResponse2.decode(com.squareup.wire.ProtoReader):yoda.service.dashboard.GetFutureReturnsResponse");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFutureReturnsResponse redact(GetFutureReturnsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                OneTimeConfiguration one_time_configuration = value.getOne_time_configuration();
                return GetFutureReturnsResponse.copy$default(value, null, 0.0d, one_time_configuration != null ? OneTimeConfiguration.ADAPTER.redact(one_time_configuration) : null, Internal.m26823redactElements(value.getRecurring_deposit_configurations(), RecurringConfiguration.ADAPTER), null, 0, 0, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, null);
            }
        };
    }
}
