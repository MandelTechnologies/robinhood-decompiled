package bonfire.proto.idl.retirement.p038v1;

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

/* compiled from: GetAccountDetailsResponse.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<Bá\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00103\u001a\u00020\u0002H\u0017J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0096\u0002J\b\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\u0004H\u0016Jà\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0016\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0016\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0016\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00100¨\u0006="}, m3636d2 = {"Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponse;", "Lcom/squareup/wire/Message;", "", "title", "", "broker_name", "connected_date", "account_balance", "contribution_type", "last_contribution_date", "account_fees", "portfolio_allocations", "", "Lbonfire/proto/idl/retirement/v1/PortfolioAllocation;", "account_details_rows", "Lbonfire/proto/idl/retirement/v1/DataRow;", "portfolio_allocation_rows", "connected_message", "plaid_disclaimer", "footer_disclaimer", "disconnect_button_label", "disconnect_deeplink", "account_options_button_label", "account_options_deeplink", "account_details_heading", "portfolio_allocation_heading", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getBroker_name", "getConnected_date", "getAccount_balance", "getContribution_type", "getLast_contribution_date", "getAccount_fees", "getConnected_message", "getPlaid_disclaimer", "getFooter_disclaimer", "getDisconnect_button_label", "getDisconnect_deeplink", "getAccount_options_button_label", "getAccount_options_deeplink", "getAccount_details_heading", "getPortfolio_allocation_heading", "getPortfolio_allocations", "()Ljava/util/List;", "getAccount_details_rows", "getPortfolio_allocation_rows", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.retirement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetAccountDetailsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAccountDetailsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String account_balance;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final String account_details_heading;

    @WireField(adapter = "bonfire.proto.idl.retirement.v1.DataRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 8, tag = 9)
    private final List<DataRow> account_details_rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String account_fees;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final String account_options_button_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final String account_options_deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String broker_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String connected_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String connected_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String contribution_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String disconnect_button_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final String disconnect_deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String footer_disclaimer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String last_contribution_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String plaid_disclaimer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final String portfolio_allocation_heading;

    @WireField(adapter = "bonfire.proto.idl.retirement.v1.DataRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 9, tag = 10)
    private final List<DataRow> portfolio_allocation_rows;

    @WireField(adapter = "bonfire.proto.idl.retirement.v1.PortfolioAllocation#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    private final List<PortfolioAllocation> portfolio_allocations;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public GetAccountDetailsResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public /* synthetic */ GetAccountDetailsResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? CollectionsKt.emptyList() : list2, (i & 512) != 0 ? CollectionsKt.emptyList() : list3, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? "" : str10, (i & 8192) != 0 ? "" : str11, (i & 16384) != 0 ? "" : str12, (i & 32768) != 0 ? "" : str13, (i & 65536) != 0 ? "" : str14, (i & 131072) != 0 ? "" : str15, (i & 262144) == 0 ? str16 : "", (i & 524288) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9043newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBroker_name() {
        return this.broker_name;
    }

    public final String getConnected_date() {
        return this.connected_date;
    }

    public final String getAccount_balance() {
        return this.account_balance;
    }

    public final String getContribution_type() {
        return this.contribution_type;
    }

    public final String getLast_contribution_date() {
        return this.last_contribution_date;
    }

    public final String getAccount_fees() {
        return this.account_fees;
    }

    public final String getConnected_message() {
        return this.connected_message;
    }

    public final String getPlaid_disclaimer() {
        return this.plaid_disclaimer;
    }

    public final String getFooter_disclaimer() {
        return this.footer_disclaimer;
    }

    public final String getDisconnect_button_label() {
        return this.disconnect_button_label;
    }

    public final String getDisconnect_deeplink() {
        return this.disconnect_deeplink;
    }

    public final String getAccount_options_button_label() {
        return this.account_options_button_label;
    }

    public final String getAccount_options_deeplink() {
        return this.account_options_deeplink;
    }

    public final String getAccount_details_heading() {
        return this.account_details_heading;
    }

    public final String getPortfolio_allocation_heading() {
        return this.portfolio_allocation_heading;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountDetailsResponse(String title, String broker_name, String connected_date, String account_balance, String contribution_type, String last_contribution_date, String account_fees, List<PortfolioAllocation> portfolio_allocations, List<DataRow> account_details_rows, List<DataRow> portfolio_allocation_rows, String connected_message, String plaid_disclaimer, String footer_disclaimer, String disconnect_button_label, String disconnect_deeplink, String account_options_button_label, String account_options_deeplink, String account_details_heading, String portfolio_allocation_heading, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(broker_name, "broker_name");
        Intrinsics.checkNotNullParameter(connected_date, "connected_date");
        Intrinsics.checkNotNullParameter(account_balance, "account_balance");
        Intrinsics.checkNotNullParameter(contribution_type, "contribution_type");
        Intrinsics.checkNotNullParameter(last_contribution_date, "last_contribution_date");
        Intrinsics.checkNotNullParameter(account_fees, "account_fees");
        Intrinsics.checkNotNullParameter(portfolio_allocations, "portfolio_allocations");
        Intrinsics.checkNotNullParameter(account_details_rows, "account_details_rows");
        Intrinsics.checkNotNullParameter(portfolio_allocation_rows, "portfolio_allocation_rows");
        Intrinsics.checkNotNullParameter(connected_message, "connected_message");
        Intrinsics.checkNotNullParameter(plaid_disclaimer, "plaid_disclaimer");
        Intrinsics.checkNotNullParameter(footer_disclaimer, "footer_disclaimer");
        Intrinsics.checkNotNullParameter(disconnect_button_label, "disconnect_button_label");
        Intrinsics.checkNotNullParameter(disconnect_deeplink, "disconnect_deeplink");
        Intrinsics.checkNotNullParameter(account_options_button_label, "account_options_button_label");
        Intrinsics.checkNotNullParameter(account_options_deeplink, "account_options_deeplink");
        Intrinsics.checkNotNullParameter(account_details_heading, "account_details_heading");
        Intrinsics.checkNotNullParameter(portfolio_allocation_heading, "portfolio_allocation_heading");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.broker_name = broker_name;
        this.connected_date = connected_date;
        this.account_balance = account_balance;
        this.contribution_type = contribution_type;
        this.last_contribution_date = last_contribution_date;
        this.account_fees = account_fees;
        this.connected_message = connected_message;
        this.plaid_disclaimer = plaid_disclaimer;
        this.footer_disclaimer = footer_disclaimer;
        this.disconnect_button_label = disconnect_button_label;
        this.disconnect_deeplink = disconnect_deeplink;
        this.account_options_button_label = account_options_button_label;
        this.account_options_deeplink = account_options_deeplink;
        this.account_details_heading = account_details_heading;
        this.portfolio_allocation_heading = portfolio_allocation_heading;
        this.portfolio_allocations = Internal.immutableCopyOf("portfolio_allocations", portfolio_allocations);
        this.account_details_rows = Internal.immutableCopyOf("account_details_rows", account_details_rows);
        this.portfolio_allocation_rows = Internal.immutableCopyOf("portfolio_allocation_rows", portfolio_allocation_rows);
    }

    public final List<PortfolioAllocation> getPortfolio_allocations() {
        return this.portfolio_allocations;
    }

    public final List<DataRow> getAccount_details_rows() {
        return this.account_details_rows;
    }

    public final List<DataRow> getPortfolio_allocation_rows() {
        return this.portfolio_allocation_rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9043newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAccountDetailsResponse)) {
            return false;
        }
        GetAccountDetailsResponse getAccountDetailsResponse = (GetAccountDetailsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAccountDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.title, getAccountDetailsResponse.title) && Intrinsics.areEqual(this.broker_name, getAccountDetailsResponse.broker_name) && Intrinsics.areEqual(this.connected_date, getAccountDetailsResponse.connected_date) && Intrinsics.areEqual(this.account_balance, getAccountDetailsResponse.account_balance) && Intrinsics.areEqual(this.contribution_type, getAccountDetailsResponse.contribution_type) && Intrinsics.areEqual(this.last_contribution_date, getAccountDetailsResponse.last_contribution_date) && Intrinsics.areEqual(this.account_fees, getAccountDetailsResponse.account_fees) && Intrinsics.areEqual(this.portfolio_allocations, getAccountDetailsResponse.portfolio_allocations) && Intrinsics.areEqual(this.account_details_rows, getAccountDetailsResponse.account_details_rows) && Intrinsics.areEqual(this.portfolio_allocation_rows, getAccountDetailsResponse.portfolio_allocation_rows) && Intrinsics.areEqual(this.connected_message, getAccountDetailsResponse.connected_message) && Intrinsics.areEqual(this.plaid_disclaimer, getAccountDetailsResponse.plaid_disclaimer) && Intrinsics.areEqual(this.footer_disclaimer, getAccountDetailsResponse.footer_disclaimer) && Intrinsics.areEqual(this.disconnect_button_label, getAccountDetailsResponse.disconnect_button_label) && Intrinsics.areEqual(this.disconnect_deeplink, getAccountDetailsResponse.disconnect_deeplink) && Intrinsics.areEqual(this.account_options_button_label, getAccountDetailsResponse.account_options_button_label) && Intrinsics.areEqual(this.account_options_deeplink, getAccountDetailsResponse.account_options_deeplink) && Intrinsics.areEqual(this.account_details_heading, getAccountDetailsResponse.account_details_heading) && Intrinsics.areEqual(this.portfolio_allocation_heading, getAccountDetailsResponse.portfolio_allocation_heading);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.broker_name.hashCode()) * 37) + this.connected_date.hashCode()) * 37) + this.account_balance.hashCode()) * 37) + this.contribution_type.hashCode()) * 37) + this.last_contribution_date.hashCode()) * 37) + this.account_fees.hashCode()) * 37) + this.portfolio_allocations.hashCode()) * 37) + this.account_details_rows.hashCode()) * 37) + this.portfolio_allocation_rows.hashCode()) * 37) + this.connected_message.hashCode()) * 37) + this.plaid_disclaimer.hashCode()) * 37) + this.footer_disclaimer.hashCode()) * 37) + this.disconnect_button_label.hashCode()) * 37) + this.disconnect_deeplink.hashCode()) * 37) + this.account_options_button_label.hashCode()) * 37) + this.account_options_deeplink.hashCode()) * 37) + this.account_details_heading.hashCode()) * 37) + this.portfolio_allocation_heading.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("broker_name=" + Internal.sanitize(this.broker_name));
        arrayList.add("connected_date=" + Internal.sanitize(this.connected_date));
        arrayList.add("account_balance=" + Internal.sanitize(this.account_balance));
        arrayList.add("contribution_type=" + Internal.sanitize(this.contribution_type));
        arrayList.add("last_contribution_date=" + Internal.sanitize(this.last_contribution_date));
        arrayList.add("account_fees=" + Internal.sanitize(this.account_fees));
        if (!this.portfolio_allocations.isEmpty()) {
            arrayList.add("portfolio_allocations=" + this.portfolio_allocations);
        }
        if (!this.account_details_rows.isEmpty()) {
            arrayList.add("account_details_rows=" + this.account_details_rows);
        }
        if (!this.portfolio_allocation_rows.isEmpty()) {
            arrayList.add("portfolio_allocation_rows=" + this.portfolio_allocation_rows);
        }
        arrayList.add("connected_message=" + Internal.sanitize(this.connected_message));
        arrayList.add("plaid_disclaimer=" + Internal.sanitize(this.plaid_disclaimer));
        arrayList.add("footer_disclaimer=" + Internal.sanitize(this.footer_disclaimer));
        arrayList.add("disconnect_button_label=" + Internal.sanitize(this.disconnect_button_label));
        arrayList.add("disconnect_deeplink=" + Internal.sanitize(this.disconnect_deeplink));
        arrayList.add("account_options_button_label=" + Internal.sanitize(this.account_options_button_label));
        arrayList.add("account_options_deeplink=" + Internal.sanitize(this.account_options_deeplink));
        arrayList.add("account_details_heading=" + Internal.sanitize(this.account_details_heading));
        arrayList.add("portfolio_allocation_heading=" + Internal.sanitize(this.portfolio_allocation_heading));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAccountDetailsResponse{", "}", 0, null, null, 56, null);
    }

    public final GetAccountDetailsResponse copy(String title, String broker_name, String connected_date, String account_balance, String contribution_type, String last_contribution_date, String account_fees, List<PortfolioAllocation> portfolio_allocations, List<DataRow> account_details_rows, List<DataRow> portfolio_allocation_rows, String connected_message, String plaid_disclaimer, String footer_disclaimer, String disconnect_button_label, String disconnect_deeplink, String account_options_button_label, String account_options_deeplink, String account_details_heading, String portfolio_allocation_heading, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(broker_name, "broker_name");
        Intrinsics.checkNotNullParameter(connected_date, "connected_date");
        Intrinsics.checkNotNullParameter(account_balance, "account_balance");
        Intrinsics.checkNotNullParameter(contribution_type, "contribution_type");
        Intrinsics.checkNotNullParameter(last_contribution_date, "last_contribution_date");
        Intrinsics.checkNotNullParameter(account_fees, "account_fees");
        Intrinsics.checkNotNullParameter(portfolio_allocations, "portfolio_allocations");
        Intrinsics.checkNotNullParameter(account_details_rows, "account_details_rows");
        Intrinsics.checkNotNullParameter(portfolio_allocation_rows, "portfolio_allocation_rows");
        Intrinsics.checkNotNullParameter(connected_message, "connected_message");
        Intrinsics.checkNotNullParameter(plaid_disclaimer, "plaid_disclaimer");
        Intrinsics.checkNotNullParameter(footer_disclaimer, "footer_disclaimer");
        Intrinsics.checkNotNullParameter(disconnect_button_label, "disconnect_button_label");
        Intrinsics.checkNotNullParameter(disconnect_deeplink, "disconnect_deeplink");
        Intrinsics.checkNotNullParameter(account_options_button_label, "account_options_button_label");
        Intrinsics.checkNotNullParameter(account_options_deeplink, "account_options_deeplink");
        Intrinsics.checkNotNullParameter(account_details_heading, "account_details_heading");
        Intrinsics.checkNotNullParameter(portfolio_allocation_heading, "portfolio_allocation_heading");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAccountDetailsResponse(title, broker_name, connected_date, account_balance, contribution_type, last_contribution_date, account_fees, portfolio_allocations, account_details_rows, portfolio_allocation_rows, connected_message, plaid_disclaimer, footer_disclaimer, disconnect_button_label, disconnect_deeplink, account_options_button_label, account_options_deeplink, account_details_heading, portfolio_allocation_heading, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAccountDetailsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAccountDetailsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.retirement.v1.GetAccountDetailsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAccountDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getBroker_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getBroker_name());
                }
                if (!Intrinsics.areEqual(value.getConnected_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getConnected_date());
                }
                if (!Intrinsics.areEqual(value.getAccount_balance(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAccount_balance());
                }
                if (!Intrinsics.areEqual(value.getContribution_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getContribution_type());
                }
                if (!Intrinsics.areEqual(value.getLast_contribution_date(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getLast_contribution_date());
                }
                if (!Intrinsics.areEqual(value.getAccount_fees(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getAccount_fees());
                }
                int iEncodedSizeWithTag = size + PortfolioAllocation.ADAPTER.asRepeated().encodedSizeWithTag(8, value.getPortfolio_allocations());
                ProtoAdapter<DataRow> protoAdapter = DataRow.ADAPTER;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(9, value.getAccount_details_rows()) + protoAdapter.asRepeated().encodedSizeWithTag(10, value.getPortfolio_allocation_rows());
                if (!Intrinsics.areEqual(value.getConnected_message(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getConnected_message());
                }
                if (!Intrinsics.areEqual(value.getPlaid_disclaimer(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getPlaid_disclaimer());
                }
                if (!Intrinsics.areEqual(value.getFooter_disclaimer(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getFooter_disclaimer());
                }
                if (!Intrinsics.areEqual(value.getDisconnect_button_label(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getDisconnect_button_label());
                }
                if (!Intrinsics.areEqual(value.getDisconnect_deeplink(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getDisconnect_deeplink());
                }
                if (!Intrinsics.areEqual(value.getAccount_options_button_label(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(16, value.getAccount_options_button_label());
                }
                if (!Intrinsics.areEqual(value.getAccount_options_deeplink(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(17, value.getAccount_options_deeplink());
                }
                if (!Intrinsics.areEqual(value.getAccount_details_heading(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(18, value.getAccount_details_heading());
                }
                return !Intrinsics.areEqual(value.getPortfolio_allocation_heading(), "") ? iEncodedSizeWithTag2 + ProtoAdapter.STRING.encodedSizeWithTag(19, value.getPortfolio_allocation_heading()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAccountDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getBroker_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBroker_name());
                }
                if (!Intrinsics.areEqual(value.getConnected_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getConnected_date());
                }
                if (!Intrinsics.areEqual(value.getAccount_balance(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_balance());
                }
                if (!Intrinsics.areEqual(value.getContribution_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getContribution_type());
                }
                if (!Intrinsics.areEqual(value.getLast_contribution_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getLast_contribution_date());
                }
                if (!Intrinsics.areEqual(value.getAccount_fees(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getAccount_fees());
                }
                PortfolioAllocation.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getPortfolio_allocations());
                ProtoAdapter<DataRow> protoAdapter = DataRow.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 9, (int) value.getAccount_details_rows());
                protoAdapter.asRepeated().encodeWithTag(writer, 10, (int) value.getPortfolio_allocation_rows());
                if (!Intrinsics.areEqual(value.getConnected_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getConnected_message());
                }
                if (!Intrinsics.areEqual(value.getPlaid_disclaimer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getPlaid_disclaimer());
                }
                if (!Intrinsics.areEqual(value.getFooter_disclaimer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getFooter_disclaimer());
                }
                if (!Intrinsics.areEqual(value.getDisconnect_button_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getDisconnect_button_label());
                }
                if (!Intrinsics.areEqual(value.getDisconnect_deeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getDisconnect_deeplink());
                }
                if (!Intrinsics.areEqual(value.getAccount_options_button_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getAccount_options_button_label());
                }
                if (!Intrinsics.areEqual(value.getAccount_options_deeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getAccount_options_deeplink());
                }
                if (!Intrinsics.areEqual(value.getAccount_details_heading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getAccount_details_heading());
                }
                if (!Intrinsics.areEqual(value.getPortfolio_allocation_heading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getPortfolio_allocation_heading());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAccountDetailsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPortfolio_allocation_heading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getPortfolio_allocation_heading());
                }
                if (!Intrinsics.areEqual(value.getAccount_details_heading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getAccount_details_heading());
                }
                if (!Intrinsics.areEqual(value.getAccount_options_deeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getAccount_options_deeplink());
                }
                if (!Intrinsics.areEqual(value.getAccount_options_button_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getAccount_options_button_label());
                }
                if (!Intrinsics.areEqual(value.getDisconnect_deeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getDisconnect_deeplink());
                }
                if (!Intrinsics.areEqual(value.getDisconnect_button_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getDisconnect_button_label());
                }
                if (!Intrinsics.areEqual(value.getFooter_disclaimer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getFooter_disclaimer());
                }
                if (!Intrinsics.areEqual(value.getPlaid_disclaimer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getPlaid_disclaimer());
                }
                if (!Intrinsics.areEqual(value.getConnected_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getConnected_message());
                }
                ProtoAdapter<DataRow> protoAdapter = DataRow.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 10, (int) value.getPortfolio_allocation_rows());
                protoAdapter.asRepeated().encodeWithTag(writer, 9, (int) value.getAccount_details_rows());
                PortfolioAllocation.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getPortfolio_allocations());
                if (!Intrinsics.areEqual(value.getAccount_fees(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getAccount_fees());
                }
                if (!Intrinsics.areEqual(value.getLast_contribution_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getLast_contribution_date());
                }
                if (!Intrinsics.areEqual(value.getContribution_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getContribution_type());
                }
                if (!Intrinsics.areEqual(value.getAccount_balance(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_balance());
                }
                if (!Intrinsics.areEqual(value.getConnected_date(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getConnected_date());
                }
                if (!Intrinsics.areEqual(value.getBroker_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBroker_name());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountDetailsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                String strDecode11 = strDecode10;
                String strDecode12 = strDecode11;
                String strDecode13 = strDecode12;
                String strDecode14 = strDecode13;
                String strDecode15 = strDecode14;
                String strDecode16 = strDecode15;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode16 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                arrayList.add(PortfolioAllocation.ADAPTER.decode(reader));
                                break;
                            case 9:
                                arrayList2.add(DataRow.ADAPTER.decode(reader));
                                break;
                            case 10:
                                arrayList3.add(DataRow.ADAPTER.decode(reader));
                                break;
                            case 11:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 15:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 16:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 17:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 18:
                                strDecode14 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 19:
                                strDecode15 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        strDecode = str;
                    } else {
                        return new GetAccountDetailsResponse(strDecode16, str, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, arrayList, arrayList2, arrayList3, strDecode7, strDecode8, strDecode9, strDecode10, strDecode11, strDecode12, strDecode13, strDecode14, strDecode15, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountDetailsResponse redact(GetAccountDetailsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getPortfolio_allocations(), PortfolioAllocation.ADAPTER);
                List<DataRow> account_details_rows = value.getAccount_details_rows();
                ProtoAdapter<DataRow> protoAdapter = DataRow.ADAPTER;
                return value.copy((523391 & 1) != 0 ? value.title : null, (523391 & 2) != 0 ? value.broker_name : null, (523391 & 4) != 0 ? value.connected_date : null, (523391 & 8) != 0 ? value.account_balance : null, (523391 & 16) != 0 ? value.contribution_type : null, (523391 & 32) != 0 ? value.last_contribution_date : null, (523391 & 64) != 0 ? value.account_fees : null, (523391 & 128) != 0 ? value.portfolio_allocations : listM26823redactElements, (523391 & 256) != 0 ? value.account_details_rows : Internal.m26823redactElements(account_details_rows, protoAdapter), (523391 & 512) != 0 ? value.portfolio_allocation_rows : Internal.m26823redactElements(value.getPortfolio_allocation_rows(), protoAdapter), (523391 & 1024) != 0 ? value.connected_message : null, (523391 & 2048) != 0 ? value.plaid_disclaimer : null, (523391 & 4096) != 0 ? value.footer_disclaimer : null, (523391 & 8192) != 0 ? value.disconnect_button_label : null, (523391 & 16384) != 0 ? value.disconnect_deeplink : null, (523391 & 32768) != 0 ? value.account_options_button_label : null, (523391 & 65536) != 0 ? value.account_options_deeplink : null, (523391 & 131072) != 0 ? value.account_details_heading : null, (523391 & 262144) != 0 ? value.portfolio_allocation_heading : null, (523391 & 524288) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
