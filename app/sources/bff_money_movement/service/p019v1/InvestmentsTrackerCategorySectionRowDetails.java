package bff_money_movement.service.p019v1;

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

/* compiled from: InvestmentsTrackerCategorySectionRowDetails.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0095\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010)\u001a\u00020\u0002H\u0017J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u0006H\u0016J\u0094\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00063"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowDetails;", "Lcom/squareup/wire/Message;", "", "type", "Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowType;", "icon", "", "title", "subtitle", "amount", "percentage", "action", "Lbff_money_movement/service/v1/InvestmentsTrackerAction;", "id", "logo_url", "connect_text", "deeplink", "account_last_four", "disconnected_data", "Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedData;Lokio/ByteString;)V", "getType", "()Lbff_money_movement/service/v1/InvestmentsTrackerCategorySectionRowType;", "getIcon", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getAmount", "getPercentage", "getAction", "()Lbff_money_movement/service/v1/InvestmentsTrackerAction;", "getId", "getLogo_url", "getConnect_text", "getDeeplink", "getAccount_last_four", "getDisconnected_data", "()Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedData;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerCategorySectionRowDetails extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerCategorySectionRowDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountLastFour", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String account_last_four;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerAction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final InvestmentsTrackerAction action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "connectText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String connect_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String deeplink;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerDisconnectedData#ADAPTER", jsonName = "disconnectedData", schemaIndex = 12, tag = 13)
    private final InvestmentsTrackerDisconnectedData disconnected_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "logoUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String logo_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String title;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerCategorySectionRowType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final InvestmentsTrackerCategorySectionRowType type;

    public InvestmentsTrackerCategorySectionRowDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8447newBuilder();
    }

    public final InvestmentsTrackerCategorySectionRowType getType() {
        return this.type;
    }

    public /* synthetic */ InvestmentsTrackerCategorySectionRowDetails(InvestmentsTrackerCategorySectionRowType investmentsTrackerCategorySectionRowType, String str, String str2, String str3, String str4, String str5, InvestmentsTrackerAction investmentsTrackerAction, String str6, String str7, String str8, String str9, String str10, InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InvestmentsTrackerCategorySectionRowType.ROW_UNSPECIFIED : investmentsTrackerCategorySectionRowType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? InvestmentsTrackerAction.ACTION_UNSPECIFIED : investmentsTrackerAction, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, (i & 2048) == 0 ? str10 : "", (i & 4096) != 0 ? null : investmentsTrackerDisconnectedData, (i & 8192) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getPercentage() {
        return this.percentage;
    }

    public final InvestmentsTrackerAction getAction() {
        return this.action;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLogo_url() {
        return this.logo_url;
    }

    public final String getConnect_text() {
        return this.connect_text;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getAccount_last_four() {
        return this.account_last_four;
    }

    public final InvestmentsTrackerDisconnectedData getDisconnected_data() {
        return this.disconnected_data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerCategorySectionRowDetails(InvestmentsTrackerCategorySectionRowType type2, String icon, String title, String subtitle, String amount, String percentage, InvestmentsTrackerAction action, String id, String logo_url, String connect_text, String deeplink, String account_last_four, InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(logo_url, "logo_url");
        Intrinsics.checkNotNullParameter(connect_text, "connect_text");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(account_last_four, "account_last_four");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.icon = icon;
        this.title = title;
        this.subtitle = subtitle;
        this.amount = amount;
        this.percentage = percentage;
        this.action = action;
        this.id = id;
        this.logo_url = logo_url;
        this.connect_text = connect_text;
        this.deeplink = deeplink;
        this.account_last_four = account_last_four;
        this.disconnected_data = investmentsTrackerDisconnectedData;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8447newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerCategorySectionRowDetails)) {
            return false;
        }
        InvestmentsTrackerCategorySectionRowDetails investmentsTrackerCategorySectionRowDetails = (InvestmentsTrackerCategorySectionRowDetails) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerCategorySectionRowDetails.unknownFields()) && this.type == investmentsTrackerCategorySectionRowDetails.type && Intrinsics.areEqual(this.icon, investmentsTrackerCategorySectionRowDetails.icon) && Intrinsics.areEqual(this.title, investmentsTrackerCategorySectionRowDetails.title) && Intrinsics.areEqual(this.subtitle, investmentsTrackerCategorySectionRowDetails.subtitle) && Intrinsics.areEqual(this.amount, investmentsTrackerCategorySectionRowDetails.amount) && Intrinsics.areEqual(this.percentage, investmentsTrackerCategorySectionRowDetails.percentage) && this.action == investmentsTrackerCategorySectionRowDetails.action && Intrinsics.areEqual(this.id, investmentsTrackerCategorySectionRowDetails.id) && Intrinsics.areEqual(this.logo_url, investmentsTrackerCategorySectionRowDetails.logo_url) && Intrinsics.areEqual(this.connect_text, investmentsTrackerCategorySectionRowDetails.connect_text) && Intrinsics.areEqual(this.deeplink, investmentsTrackerCategorySectionRowDetails.deeplink) && Intrinsics.areEqual(this.account_last_four, investmentsTrackerCategorySectionRowDetails.account_last_four) && Intrinsics.areEqual(this.disconnected_data, investmentsTrackerCategorySectionRowDetails.disconnected_data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.icon.hashCode()) * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.amount.hashCode()) * 37) + this.percentage.hashCode()) * 37) + this.action.hashCode()) * 37) + this.id.hashCode()) * 37) + this.logo_url.hashCode()) * 37) + this.connect_text.hashCode()) * 37) + this.deeplink.hashCode()) * 37) + this.account_last_four.hashCode()) * 37;
        InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData = this.disconnected_data;
        int iHashCode2 = iHashCode + (investmentsTrackerDisconnectedData != null ? investmentsTrackerDisconnectedData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        arrayList.add("icon=" + Internal.sanitize(this.icon));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("amount=" + Internal.sanitize(this.amount));
        arrayList.add("percentage=" + Internal.sanitize(this.percentage));
        arrayList.add("action=" + this.action);
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("logo_url=" + Internal.sanitize(this.logo_url));
        arrayList.add("connect_text=" + Internal.sanitize(this.connect_text));
        arrayList.add("deeplink=" + Internal.sanitize(this.deeplink));
        arrayList.add("account_last_four=" + Internal.sanitize(this.account_last_four));
        InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData = this.disconnected_data;
        if (investmentsTrackerDisconnectedData != null) {
            arrayList.add("disconnected_data=" + investmentsTrackerDisconnectedData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerCategorySectionRowDetails{", "}", 0, null, null, 56, null);
    }

    public final InvestmentsTrackerCategorySectionRowDetails copy(InvestmentsTrackerCategorySectionRowType type2, String icon, String title, String subtitle, String amount, String percentage, InvestmentsTrackerAction action, String id, String logo_url, String connect_text, String deeplink, String account_last_four, InvestmentsTrackerDisconnectedData disconnected_data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(logo_url, "logo_url");
        Intrinsics.checkNotNullParameter(connect_text, "connect_text");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(account_last_four, "account_last_four");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerCategorySectionRowDetails(type2, icon, title, subtitle, amount, percentage, action, id, logo_url, connect_text, deeplink, account_last_four, disconnected_data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerCategorySectionRowDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerCategorySectionRowDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerCategorySectionRowDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerCategorySectionRowDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getType() != InvestmentsTrackerCategorySectionRowType.ROW_UNSPECIFIED) {
                    size += InvestmentsTrackerCategorySectionRowType.ADAPTER.encodedSizeWithTag(1, value.getType());
                }
                if (!Intrinsics.areEqual(value.getIcon(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getIcon());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getPercentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getPercentage());
                }
                if (value.getAction() != InvestmentsTrackerAction.ACTION_UNSPECIFIED) {
                    size += InvestmentsTrackerAction.ADAPTER.encodedSizeWithTag(7, value.getAction());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getId());
                }
                if (!Intrinsics.areEqual(value.getLogo_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getLogo_url());
                }
                if (!Intrinsics.areEqual(value.getConnect_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getConnect_text());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getAccount_last_four(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getAccount_last_four());
                }
                return size + InvestmentsTrackerDisconnectedData.ADAPTER.encodedSizeWithTag(13, value.getDisconnected_data());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerCategorySectionRowDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getType() != InvestmentsTrackerCategorySectionRowType.ROW_UNSPECIFIED) {
                    InvestmentsTrackerCategorySectionRowType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getIcon(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getIcon());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getPercentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getPercentage());
                }
                if (value.getAction() != InvestmentsTrackerAction.ACTION_UNSPECIFIED) {
                    InvestmentsTrackerAction.ADAPTER.encodeWithTag(writer, 7, (int) value.getAction());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getLogo_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getLogo_url());
                }
                if (!Intrinsics.areEqual(value.getConnect_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getConnect_text());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getAccount_last_four(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getAccount_last_four());
                }
                InvestmentsTrackerDisconnectedData.ADAPTER.encodeWithTag(writer, 13, (int) value.getDisconnected_data());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerCategorySectionRowDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                InvestmentsTrackerDisconnectedData.ADAPTER.encodeWithTag(writer, 13, (int) value.getDisconnected_data());
                if (!Intrinsics.areEqual(value.getAccount_last_four(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getAccount_last_four());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getConnect_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getConnect_text());
                }
                if (!Intrinsics.areEqual(value.getLogo_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getLogo_url());
                }
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getId());
                }
                if (value.getAction() != InvestmentsTrackerAction.ACTION_UNSPECIFIED) {
                    InvestmentsTrackerAction.ADAPTER.encodeWithTag(writer, 7, (int) value.getAction());
                }
                if (!Intrinsics.areEqual(value.getPercentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getPercentage());
                }
                if (!Intrinsics.areEqual(value.getAmount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getIcon(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getIcon());
                }
                if (value.getType() != InvestmentsTrackerCategorySectionRowType.ROW_UNSPECIFIED) {
                    InvestmentsTrackerCategorySectionRowType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerCategorySectionRowDetails decode(ProtoReader reader) throws IOException {
                InvestmentsTrackerAction investmentsTrackerAction;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                InvestmentsTrackerCategorySectionRowType investmentsTrackerCategorySectionRowType = InvestmentsTrackerCategorySectionRowType.ROW_UNSPECIFIED;
                InvestmentsTrackerAction investmentsTrackerAction2 = InvestmentsTrackerAction.ACTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                InvestmentsTrackerCategorySectionRowType investmentsTrackerCategorySectionRowTypeDecode = investmentsTrackerCategorySectionRowType;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedDataDecode = null;
                InvestmentsTrackerAction investmentsTrackerActionDecode = investmentsTrackerAction2;
                String strDecode10 = strDecode9;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                investmentsTrackerAction = investmentsTrackerActionDecode;
                                str = strDecode10;
                                str2 = strDecode;
                                try {
                                    investmentsTrackerCategorySectionRowTypeDecode = InvestmentsTrackerCategorySectionRowType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 2:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                try {
                                    investmentsTrackerActionDecode = InvestmentsTrackerAction.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    investmentsTrackerAction = investmentsTrackerActionDecode;
                                    str = strDecode10;
                                    str2 = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 8:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 11:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 12:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 13:
                                investmentsTrackerDisconnectedDataDecode = InvestmentsTrackerDisconnectedData.ADAPTER.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                investmentsTrackerAction = investmentsTrackerActionDecode;
                                str = strDecode10;
                                str2 = strDecode;
                                break;
                        }
                        investmentsTrackerActionDecode = investmentsTrackerAction;
                        strDecode10 = str;
                        strDecode = str2;
                    } else {
                        return new InvestmentsTrackerCategorySectionRowDetails(investmentsTrackerCategorySectionRowTypeDecode, strDecode10, strDecode, strDecode2, strDecode3, strDecode4, investmentsTrackerActionDecode, strDecode5, strDecode6, strDecode7, strDecode8, strDecode9, investmentsTrackerDisconnectedDataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerCategorySectionRowDetails redact(InvestmentsTrackerCategorySectionRowDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                InvestmentsTrackerDisconnectedData disconnected_data = value.getDisconnected_data();
                return value.copy((4095 & 1) != 0 ? value.type : null, (4095 & 2) != 0 ? value.icon : null, (4095 & 4) != 0 ? value.title : null, (4095 & 8) != 0 ? value.subtitle : null, (4095 & 16) != 0 ? value.amount : null, (4095 & 32) != 0 ? value.percentage : null, (4095 & 64) != 0 ? value.action : null, (4095 & 128) != 0 ? value.id : null, (4095 & 256) != 0 ? value.logo_url : null, (4095 & 512) != 0 ? value.connect_text : null, (4095 & 1024) != 0 ? value.deeplink : null, (4095 & 2048) != 0 ? value.account_last_four : null, (4095 & 4096) != 0 ? value.disconnected_data : disconnected_data != null ? InvestmentsTrackerDisconnectedData.ADAPTER.redact(disconnected_data) : null, (4095 & 8192) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
