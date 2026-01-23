package accio.service.p003v1;

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

/* compiled from: PlaidAccountDetails.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\"\u001a\u00020\u0002H\u0017J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u0004H\u0016J\u0089\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010+R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u0006-"}, m3636d2 = {"Laccio/service/v1/PlaidAccountDetails;", "Lcom/squareup/wire/Message;", "", "plaid_account_id", "", "account_number_mask", "current_balance", "", "available_balance", "limit", "account_number", "routing_number", "institution_id", "institution_name", "logo_url", "account_link_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getPlaid_account_id", "()Ljava/lang/String;", "getAccount_number_mask", "getCurrent_balance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAvailable_balance", "getLimit", "getAccount_number", "getRouting_number", "getInstitution_id", "getInstitution_name", "getLogo_url", "getAccount_link_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Laccio/service/v1/PlaidAccountDetails;", "Companion", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class PlaidAccountDetails extends Message {

    @JvmField
    public static final ProtoAdapter<PlaidAccountDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountLinkId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String account_link_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumberMask", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number_mask;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE_VALUE", jsonName = "availableBalance", schemaIndex = 3, tag = 4)
    private final Double available_balance;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE_VALUE", jsonName = "currentBalance", schemaIndex = 2, tag = 3)
    private final Double current_balance;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "institutionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String institution_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "institutionName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String institution_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE_VALUE", schemaIndex = 4, tag = 5)
    private final Double limit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "logoUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String logo_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "plaidAccountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String plaid_account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "routingNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String routing_number;

    public PlaidAccountDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public /* synthetic */ PlaidAccountDetails(String str, String str2, Double d, Double d2, Double d3, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2, (i & 16) == 0 ? d3 : null, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) == 0 ? str8 : "", (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4325newBuilder();
    }

    public final String getPlaid_account_id() {
        return this.plaid_account_id;
    }

    public final String getAccount_number_mask() {
        return this.account_number_mask;
    }

    public final Double getCurrent_balance() {
        return this.current_balance;
    }

    public final Double getAvailable_balance() {
        return this.available_balance;
    }

    public final Double getLimit() {
        return this.limit;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getRouting_number() {
        return this.routing_number;
    }

    public final String getInstitution_id() {
        return this.institution_id;
    }

    public final String getInstitution_name() {
        return this.institution_name;
    }

    public final String getLogo_url() {
        return this.logo_url;
    }

    public final String getAccount_link_id() {
        return this.account_link_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidAccountDetails(String plaid_account_id, String account_number_mask, Double d, Double d2, Double d3, String account_number, String routing_number, String institution_id, String institution_name, String logo_url, String account_link_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(plaid_account_id, "plaid_account_id");
        Intrinsics.checkNotNullParameter(account_number_mask, "account_number_mask");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(routing_number, "routing_number");
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(institution_name, "institution_name");
        Intrinsics.checkNotNullParameter(logo_url, "logo_url");
        Intrinsics.checkNotNullParameter(account_link_id, "account_link_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.plaid_account_id = plaid_account_id;
        this.account_number_mask = account_number_mask;
        this.current_balance = d;
        this.available_balance = d2;
        this.limit = d3;
        this.account_number = account_number;
        this.routing_number = routing_number;
        this.institution_id = institution_id;
        this.institution_name = institution_name;
        this.logo_url = logo_url;
        this.account_link_id = account_link_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4325newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PlaidAccountDetails)) {
            return false;
        }
        PlaidAccountDetails plaidAccountDetails = (PlaidAccountDetails) other;
        return Intrinsics.areEqual(unknownFields(), plaidAccountDetails.unknownFields()) && Intrinsics.areEqual(this.plaid_account_id, plaidAccountDetails.plaid_account_id) && Intrinsics.areEqual(this.account_number_mask, plaidAccountDetails.account_number_mask) && Intrinsics.areEqual(this.current_balance, plaidAccountDetails.current_balance) && Intrinsics.areEqual(this.available_balance, plaidAccountDetails.available_balance) && Intrinsics.areEqual(this.limit, plaidAccountDetails.limit) && Intrinsics.areEqual(this.account_number, plaidAccountDetails.account_number) && Intrinsics.areEqual(this.routing_number, plaidAccountDetails.routing_number) && Intrinsics.areEqual(this.institution_id, plaidAccountDetails.institution_id) && Intrinsics.areEqual(this.institution_name, plaidAccountDetails.institution_name) && Intrinsics.areEqual(this.logo_url, plaidAccountDetails.logo_url) && Intrinsics.areEqual(this.account_link_id, plaidAccountDetails.account_link_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.plaid_account_id.hashCode()) * 37) + this.account_number_mask.hashCode()) * 37;
        Double d = this.current_balance;
        int iHashCode2 = (iHashCode + (d != null ? d.hashCode() : 0)) * 37;
        Double d2 = this.available_balance;
        int iHashCode3 = (iHashCode2 + (d2 != null ? d2.hashCode() : 0)) * 37;
        Double d3 = this.limit;
        int iHashCode4 = ((((((((((((iHashCode3 + (d3 != null ? d3.hashCode() : 0)) * 37) + this.account_number.hashCode()) * 37) + this.routing_number.hashCode()) * 37) + this.institution_id.hashCode()) * 37) + this.institution_name.hashCode()) * 37) + this.logo_url.hashCode()) * 37) + this.account_link_id.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("plaid_account_id=" + Internal.sanitize(this.plaid_account_id));
        arrayList.add("account_number_mask=" + Internal.sanitize(this.account_number_mask));
        Double d = this.current_balance;
        if (d != null) {
            arrayList.add("current_balance=" + d);
        }
        Double d2 = this.available_balance;
        if (d2 != null) {
            arrayList.add("available_balance=" + d2);
        }
        Double d3 = this.limit;
        if (d3 != null) {
            arrayList.add("limit=" + d3);
        }
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("routing_number=" + Internal.sanitize(this.routing_number));
        arrayList.add("institution_id=" + Internal.sanitize(this.institution_id));
        arrayList.add("institution_name=" + Internal.sanitize(this.institution_name));
        arrayList.add("logo_url=" + Internal.sanitize(this.logo_url));
        arrayList.add("account_link_id=" + Internal.sanitize(this.account_link_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlaidAccountDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PlaidAccountDetails copy$default(PlaidAccountDetails plaidAccountDetails, String str, String str2, Double d, Double d2, Double d3, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plaidAccountDetails.plaid_account_id;
        }
        if ((i & 2) != 0) {
            str2 = plaidAccountDetails.account_number_mask;
        }
        if ((i & 4) != 0) {
            d = plaidAccountDetails.current_balance;
        }
        if ((i & 8) != 0) {
            d2 = plaidAccountDetails.available_balance;
        }
        if ((i & 16) != 0) {
            d3 = plaidAccountDetails.limit;
        }
        if ((i & 32) != 0) {
            str3 = plaidAccountDetails.account_number;
        }
        if ((i & 64) != 0) {
            str4 = plaidAccountDetails.routing_number;
        }
        if ((i & 128) != 0) {
            str5 = plaidAccountDetails.institution_id;
        }
        if ((i & 256) != 0) {
            str6 = plaidAccountDetails.institution_name;
        }
        if ((i & 512) != 0) {
            str7 = plaidAccountDetails.logo_url;
        }
        if ((i & 1024) != 0) {
            str8 = plaidAccountDetails.account_link_id;
        }
        if ((i & 2048) != 0) {
            byteString = plaidAccountDetails.unknownFields();
        }
        String str9 = str8;
        ByteString byteString2 = byteString;
        String str10 = str6;
        String str11 = str7;
        String str12 = str4;
        String str13 = str5;
        Double d4 = d3;
        String str14 = str3;
        return plaidAccountDetails.copy(str, str2, d, d2, d4, str14, str12, str13, str10, str11, str9, byteString2);
    }

    public final PlaidAccountDetails copy(String plaid_account_id, String account_number_mask, Double current_balance, Double available_balance, Double limit, String account_number, String routing_number, String institution_id, String institution_name, String logo_url, String account_link_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(plaid_account_id, "plaid_account_id");
        Intrinsics.checkNotNullParameter(account_number_mask, "account_number_mask");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(routing_number, "routing_number");
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(institution_name, "institution_name");
        Intrinsics.checkNotNullParameter(logo_url, "logo_url");
        Intrinsics.checkNotNullParameter(account_link_id, "account_link_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PlaidAccountDetails(plaid_account_id, account_number_mask, current_balance, available_balance, limit, account_number, routing_number, institution_id, institution_name, logo_url, account_link_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PlaidAccountDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PlaidAccountDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: accio.service.v1.PlaidAccountDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PlaidAccountDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPlaid_account_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPlaid_account_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_number_mask(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number_mask());
                }
                if (value.getCurrent_balance() != null) {
                    size += ProtoAdapter.DOUBLE_VALUE.encodedSizeWithTag(3, value.getCurrent_balance());
                }
                if (value.getAvailable_balance() != null) {
                    size += ProtoAdapter.DOUBLE_VALUE.encodedSizeWithTag(4, value.getAvailable_balance());
                }
                if (value.getLimit() != null) {
                    size += ProtoAdapter.DOUBLE_VALUE.encodedSizeWithTag(5, value.getLimit());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getRouting_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getRouting_number());
                }
                if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getInstitution_id());
                }
                if (!Intrinsics.areEqual(value.getInstitution_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getInstitution_name());
                }
                if (!Intrinsics.areEqual(value.getLogo_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getLogo_url());
                }
                return !Intrinsics.areEqual(value.getAccount_link_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(11, value.getAccount_link_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PlaidAccountDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPlaid_account_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPlaid_account_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_number_mask(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number_mask());
                }
                if (value.getCurrent_balance() != null) {
                    ProtoAdapter.DOUBLE_VALUE.encodeWithTag(writer, 3, (int) value.getCurrent_balance());
                }
                if (value.getAvailable_balance() != null) {
                    ProtoAdapter.DOUBLE_VALUE.encodeWithTag(writer, 4, (int) value.getAvailable_balance());
                }
                if (value.getLimit() != null) {
                    ProtoAdapter.DOUBLE_VALUE.encodeWithTag(writer, 5, (int) value.getLimit());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getRouting_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getRouting_number());
                }
                if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getInstitution_id());
                }
                if (!Intrinsics.areEqual(value.getInstitution_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getInstitution_name());
                }
                if (!Intrinsics.areEqual(value.getLogo_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getLogo_url());
                }
                if (!Intrinsics.areEqual(value.getAccount_link_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getAccount_link_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PlaidAccountDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAccount_link_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getAccount_link_id());
                }
                if (!Intrinsics.areEqual(value.getLogo_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getLogo_url());
                }
                if (!Intrinsics.areEqual(value.getInstitution_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getInstitution_name());
                }
                if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getInstitution_id());
                }
                if (!Intrinsics.areEqual(value.getRouting_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getRouting_number());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAccount_number());
                }
                if (value.getLimit() != null) {
                    ProtoAdapter.DOUBLE_VALUE.encodeWithTag(writer, 5, (int) value.getLimit());
                }
                if (value.getAvailable_balance() != null) {
                    ProtoAdapter.DOUBLE_VALUE.encodeWithTag(writer, 4, (int) value.getAvailable_balance());
                }
                if (value.getCurrent_balance() != null) {
                    ProtoAdapter.DOUBLE_VALUE.encodeWithTag(writer, 3, (int) value.getCurrent_balance());
                }
                if (!Intrinsics.areEqual(value.getAccount_number_mask(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number_mask());
                }
                if (Intrinsics.areEqual(value.getPlaid_account_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPlaid_account_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PlaidAccountDetails redact(PlaidAccountDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Double current_balance = value.getCurrent_balance();
                Double dRedact = current_balance != null ? ProtoAdapter.DOUBLE_VALUE.redact(current_balance) : null;
                Double available_balance = value.getAvailable_balance();
                Double dRedact2 = available_balance != null ? ProtoAdapter.DOUBLE_VALUE.redact(available_balance) : null;
                Double limit = value.getLimit();
                return PlaidAccountDetails.copy$default(value, null, null, dRedact, dRedact2, limit != null ? ProtoAdapter.DOUBLE_VALUE.redact(limit) : null, null, null, null, null, null, null, ByteString.EMPTY, 2019, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PlaidAccountDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                Double dDecode = null;
                Double dDecode2 = null;
                Double dDecode3 = null;
                String strDecode8 = strDecode7;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                dDecode = ProtoAdapter.DOUBLE_VALUE.decode(reader);
                                break;
                            case 4:
                                dDecode2 = ProtoAdapter.DOUBLE_VALUE.decode(reader);
                                break;
                            case 5:
                                dDecode3 = ProtoAdapter.DOUBLE_VALUE.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new PlaidAccountDetails(strDecode, strDecode8, dDecode, dDecode2, dDecode3, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
