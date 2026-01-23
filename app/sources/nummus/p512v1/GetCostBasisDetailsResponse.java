package nummus.p512v1;

import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: GetCostBasisDetailsResponse.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b$\u0018\u0000 J2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001JBÍ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0017¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010+JÓ\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010+R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b0\u0010+R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b1\u0010+R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b2\u0010+R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u00105R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b6\u0010+R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b7\u0010+R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b8\u0010+R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b9\u0010+R\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b:\u0010+R\"\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b>\u0010+R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010?\u001a\u0004\b\u0014\u0010@R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bB\u0010CR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010D\u001a\u0004\bE\u0010FR&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010G\u001a\u0004\bH\u0010I¨\u0006K"}, m3636d2 = {"Lnummus/v1/GetCostBasisDetailsResponse;", "Lcom/squareup/wire/Message;", "", "", "source_id", "source_type", "account_id", "year", "Lnummus/v1/CostBasisStatus;", "status", "status_display_text", "currency_pair_id", "currency_code", "currency_name", "deposit_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "deposit_date", "estimated_fiat_value", "", "is_editable", "Lnummus/v1/CostBasisLotsSummary;", ErrorBundle.SUMMARY_ENTRY, "", "Lnummus/v1/CostBasisLot;", "lots", "", "Lnummus/v1/CostBasisBottomSheet;", "bottom_sheets", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnummus/v1/CostBasisStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;ZLnummus/v1/CostBasisLotsSummary;Ljava/util/List;Ljava/util/Map;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnummus/v1/CostBasisStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;ZLnummus/v1/CostBasisLotsSummary;Ljava/util/List;Ljava/util/Map;Lokio/ByteString;)Lnummus/v1/GetCostBasisDetailsResponse;", "Ljava/lang/String;", "getSource_id", "getSource_type", "getAccount_id", "getYear", "Lnummus/v1/CostBasisStatus;", "getStatus", "()Lnummus/v1/CostBasisStatus;", "getStatus_display_text", "getCurrency_pair_id", "getCurrency_code", "getCurrency_name", "getDeposit_amount", "Lj$/time/Instant;", "getDeposit_date", "()Lj$/time/Instant;", "getEstimated_fiat_value", "Z", "()Z", "Lnummus/v1/CostBasisLotsSummary;", "getSummary", "()Lnummus/v1/CostBasisLotsSummary;", "Ljava/util/List;", "getLots", "()Ljava/util/List;", "Ljava/util/Map;", "getBottom_sheets", "()Ljava/util/Map;", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class GetCostBasisDetailsResponse extends Message {

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String account_id;

    @WireField(adapter = "nummus.v1.CostBasisBottomSheet#ADAPTER", jsonName = "bottomSheets", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 15, tag = 16)
    private final Map<String, CostBasisBottomSheet> bottom_sheets;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String currency_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String currency_pair_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String deposit_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "depositDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Instant deposit_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedFiatValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String estimated_fiat_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEditable", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final boolean is_editable;

    @WireField(adapter = "nummus.v1.CostBasisLot#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 14, tag = 15)
    private final List<CostBasisLot> lots;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String source_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String source_type;

    @WireField(adapter = "nummus.v1.CostBasisStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final CostBasisStatus status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "statusDisplayText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String status_display_text;

    @WireField(adapter = "nummus.v1.CostBasisLotsSummary#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final CostBasisLotsSummary summary;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String year;

    @JvmField
    public static final ProtoAdapter<GetCostBasisDetailsResponse> ADAPTER = new GetCostBasisDetailsResponse2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(GetCostBasisDetailsResponse.class), Syntax.PROTO_3);

    public GetCostBasisDetailsResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 131071, null);
    }

    public /* synthetic */ GetCostBasisDetailsResponse(String str, String str2, String str3, String str4, CostBasisStatus costBasisStatus, String str5, String str6, String str7, String str8, String str9, Instant instant, String str10, boolean z, CostBasisLotsSummary costBasisLotsSummary, List list, Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? CostBasisStatus.COST_BASIS_STATUS_UNSPECIFIED : costBasisStatus, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? null : instant, (i & 2048) == 0 ? str10 : "", (i & 4096) != 0 ? false : z, (i & 8192) == 0 ? costBasisLotsSummary : null, (i & 16384) != 0 ? CollectionsKt.emptyList() : list, (i & 32768) != 0 ? MapsKt.emptyMap() : map, (i & 65536) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29424newBuilder();
    }

    public final String getSource_id() {
        return this.source_id;
    }

    public final String getSource_type() {
        return this.source_type;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getYear() {
        return this.year;
    }

    public final CostBasisStatus getStatus() {
        return this.status;
    }

    public final String getStatus_display_text() {
        return this.status_display_text;
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
    }

    public final String getCurrency_code() {
        return this.currency_code;
    }

    public final String getCurrency_name() {
        return this.currency_name;
    }

    public final String getDeposit_amount() {
        return this.deposit_amount;
    }

    public final Instant getDeposit_date() {
        return this.deposit_date;
    }

    public final String getEstimated_fiat_value() {
        return this.estimated_fiat_value;
    }

    /* renamed from: is_editable, reason: from getter */
    public final boolean getIs_editable() {
        return this.is_editable;
    }

    public final CostBasisLotsSummary getSummary() {
        return this.summary;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCostBasisDetailsResponse(String source_id, String source_type, String account_id, String year, CostBasisStatus status, String status_display_text, String currency_pair_id, String currency_code, String currency_name, String deposit_amount, Instant instant, String estimated_fiat_value, boolean z, CostBasisLotsSummary costBasisLotsSummary, List<CostBasisLot> lots, Map<String, CostBasisBottomSheet> bottom_sheets, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(status_display_text, "status_display_text");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(currency_name, "currency_name");
        Intrinsics.checkNotNullParameter(deposit_amount, "deposit_amount");
        Intrinsics.checkNotNullParameter(estimated_fiat_value, "estimated_fiat_value");
        Intrinsics.checkNotNullParameter(lots, "lots");
        Intrinsics.checkNotNullParameter(bottom_sheets, "bottom_sheets");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.source_id = source_id;
        this.source_type = source_type;
        this.account_id = account_id;
        this.year = year;
        this.status = status;
        this.status_display_text = status_display_text;
        this.currency_pair_id = currency_pair_id;
        this.currency_code = currency_code;
        this.currency_name = currency_name;
        this.deposit_amount = deposit_amount;
        this.deposit_date = instant;
        this.estimated_fiat_value = estimated_fiat_value;
        this.is_editable = z;
        this.summary = costBasisLotsSummary;
        this.lots = Internal.immutableCopyOf("lots", lots);
        this.bottom_sheets = Internal.immutableCopyOf("bottom_sheets", bottom_sheets);
    }

    public final List<CostBasisLot> getLots() {
        return this.lots;
    }

    public final Map<String, CostBasisBottomSheet> getBottom_sheets() {
        return this.bottom_sheets;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29424newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCostBasisDetailsResponse)) {
            return false;
        }
        GetCostBasisDetailsResponse getCostBasisDetailsResponse = (GetCostBasisDetailsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getCostBasisDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.source_id, getCostBasisDetailsResponse.source_id) && Intrinsics.areEqual(this.source_type, getCostBasisDetailsResponse.source_type) && Intrinsics.areEqual(this.account_id, getCostBasisDetailsResponse.account_id) && Intrinsics.areEqual(this.year, getCostBasisDetailsResponse.year) && this.status == getCostBasisDetailsResponse.status && Intrinsics.areEqual(this.status_display_text, getCostBasisDetailsResponse.status_display_text) && Intrinsics.areEqual(this.currency_pair_id, getCostBasisDetailsResponse.currency_pair_id) && Intrinsics.areEqual(this.currency_code, getCostBasisDetailsResponse.currency_code) && Intrinsics.areEqual(this.currency_name, getCostBasisDetailsResponse.currency_name) && Intrinsics.areEqual(this.deposit_amount, getCostBasisDetailsResponse.deposit_amount) && Intrinsics.areEqual(this.deposit_date, getCostBasisDetailsResponse.deposit_date) && Intrinsics.areEqual(this.estimated_fiat_value, getCostBasisDetailsResponse.estimated_fiat_value) && this.is_editable == getCostBasisDetailsResponse.is_editable && Intrinsics.areEqual(this.summary, getCostBasisDetailsResponse.summary) && Intrinsics.areEqual(this.lots, getCostBasisDetailsResponse.lots) && Intrinsics.areEqual(this.bottom_sheets, getCostBasisDetailsResponse.bottom_sheets);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((unknownFields().hashCode() * 37) + this.source_id.hashCode()) * 37) + this.source_type.hashCode()) * 37) + this.account_id.hashCode()) * 37) + this.year.hashCode()) * 37) + this.status.hashCode()) * 37) + this.status_display_text.hashCode()) * 37) + this.currency_pair_id.hashCode()) * 37) + this.currency_code.hashCode()) * 37) + this.currency_name.hashCode()) * 37) + this.deposit_amount.hashCode()) * 37;
        Instant instant = this.deposit_date;
        int iHashCode2 = (((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.estimated_fiat_value.hashCode()) * 37) + Boolean.hashCode(this.is_editable)) * 37;
        CostBasisLotsSummary costBasisLotsSummary = this.summary;
        int iHashCode3 = ((((iHashCode2 + (costBasisLotsSummary != null ? costBasisLotsSummary.hashCode() : 0)) * 37) + this.lots.hashCode()) * 37) + this.bottom_sheets.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("source_id=" + Internal.sanitize(this.source_id));
        arrayList.add("source_type=" + Internal.sanitize(this.source_type));
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("year=" + Internal.sanitize(this.year));
        arrayList.add("status=" + this.status);
        arrayList.add("status_display_text=" + Internal.sanitize(this.status_display_text));
        arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
        arrayList.add("currency_code=" + Internal.sanitize(this.currency_code));
        arrayList.add("currency_name=" + Internal.sanitize(this.currency_name));
        arrayList.add("deposit_amount=" + Internal.sanitize(this.deposit_amount));
        Instant instant = this.deposit_date;
        if (instant != null) {
            arrayList.add("deposit_date=" + instant);
        }
        arrayList.add("estimated_fiat_value=" + Internal.sanitize(this.estimated_fiat_value));
        arrayList.add("is_editable=" + this.is_editable);
        CostBasisLotsSummary costBasisLotsSummary = this.summary;
        if (costBasisLotsSummary != null) {
            arrayList.add("summary=" + costBasisLotsSummary);
        }
        if (!this.lots.isEmpty()) {
            arrayList.add("lots=" + this.lots);
        }
        if (!this.bottom_sheets.isEmpty()) {
            arrayList.add("bottom_sheets=" + this.bottom_sheets);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCostBasisDetailsResponse{", "}", 0, null, null, 56, null);
    }

    public final GetCostBasisDetailsResponse copy(String source_id, String source_type, String account_id, String year, CostBasisStatus status, String status_display_text, String currency_pair_id, String currency_code, String currency_name, String deposit_amount, Instant deposit_date, String estimated_fiat_value, boolean is_editable, CostBasisLotsSummary summary, List<CostBasisLot> lots, Map<String, CostBasisBottomSheet> bottom_sheets, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(status_display_text, "status_display_text");
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(currency_name, "currency_name");
        Intrinsics.checkNotNullParameter(deposit_amount, "deposit_amount");
        Intrinsics.checkNotNullParameter(estimated_fiat_value, "estimated_fiat_value");
        Intrinsics.checkNotNullParameter(lots, "lots");
        Intrinsics.checkNotNullParameter(bottom_sheets, "bottom_sheets");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCostBasisDetailsResponse(source_id, source_type, account_id, year, status, status_display_text, currency_pair_id, currency_code, currency_name, deposit_amount, deposit_date, estimated_fiat_value, is_editable, summary, lots, bottom_sheets, unknownFields);
    }
}
