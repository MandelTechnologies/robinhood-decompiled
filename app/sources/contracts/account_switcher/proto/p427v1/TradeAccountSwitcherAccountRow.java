package contracts.account_switcher.proto.p427v1;

import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
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
import p479j$.time.Instant;
import rh_server_driven_ui.p531v1.Icon;
import rosetta.account.BrokerageAccountType;
import rosetta.account.ManagementType;

/* compiled from: TradeAccountSwitcherAccountRow.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001e\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u008f\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#J\u0095\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010#R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b.\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b/\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b0\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b1\u0010#R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b8\u0010#R\"\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010;¨\u0006="}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRow;", "Lcom/squareup/wire/Message;", "", "", "account_number", "Lrosetta/account/BrokerageAccountType;", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lrosetta/account/ManagementType;", "management_type", "title", "subtitle", "metadata_title", "metadata_subtitle", "Lrh_server_driven_ui/v1/Icon;", "icon", "", "enabled", "logging_identifier", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lrosetta/account/BrokerageAccountType;Lrosetta/account/ManagementType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/Icon;ZLjava/lang/String;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lrosetta/account/BrokerageAccountType;Lrosetta/account/ManagementType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/Icon;ZLjava/lang/String;Lj$/time/Instant;Lokio/ByteString;)Lcontracts/account_switcher/proto/v1/TradeAccountSwitcherAccountRow;", "Ljava/lang/String;", "getAccount_number", "Lrosetta/account/BrokerageAccountType;", "getBrokerage_account_type", "()Lrosetta/account/BrokerageAccountType;", "Lrosetta/account/ManagementType;", "getManagement_type", "()Lrosetta/account/ManagementType;", "getTitle", "getSubtitle", "getMetadata_title", "getMetadata_subtitle", "Lrh_server_driven_ui/v1/Icon;", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "Z", "getEnabled", "()Z", "getLogging_identifier", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "Companion", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class TradeAccountSwitcherAccountRow extends Message {

    @JvmField
    public static final ProtoAdapter<TradeAccountSwitcherAccountRow> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "rosetta.account.BrokerageAccountType#ADAPTER", jsonName = "brokerageAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final BrokerageAccountType brokerage_account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Instant created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final boolean enabled;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Icon icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 9, tag = 10)
    private final String logging_identifier;

    @WireField(adapter = "rosetta.account.ManagementType#ADAPTER", jsonName = "managementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ManagementType management_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "metadataSubtitle", schemaIndex = 6, tag = 7)
    private final String metadata_subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "metadataTitle", schemaIndex = 5, tag = 6)
    private final String metadata_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String title;

    public TradeAccountSwitcherAccountRow() {
        this(null, null, null, null, null, null, null, null, false, null, null, null, 4095, null);
    }

    public /* synthetic */ TradeAccountSwitcherAccountRow(String str, BrokerageAccountType brokerageAccountType, ManagementType managementType, String str2, String str3, String str4, String str5, Icon icon, boolean z, String str6, Instant instant, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType, (i & 4) != 0 ? ManagementType.MANAGEMENT_TYPE_UNSPECIFIED : managementType, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? Icon.ICON_UNSPECIFIED : icon, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : instant, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27618newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final BrokerageAccountType getBrokerage_account_type() {
        return this.brokerage_account_type;
    }

    public final ManagementType getManagement_type() {
        return this.management_type;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getMetadata_title() {
        return this.metadata_title;
    }

    public final String getMetadata_subtitle() {
        return this.metadata_subtitle;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeAccountSwitcherAccountRow(String account_number, BrokerageAccountType brokerage_account_type, ManagementType management_type, String title, String str, String str2, String str3, Icon icon, boolean z, String str4, Instant instant, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.brokerage_account_type = brokerage_account_type;
        this.management_type = management_type;
        this.title = title;
        this.subtitle = str;
        this.metadata_title = str2;
        this.metadata_subtitle = str3;
        this.icon = icon;
        this.enabled = z;
        this.logging_identifier = str4;
        this.created_at = instant;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27618newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TradeAccountSwitcherAccountRow)) {
            return false;
        }
        TradeAccountSwitcherAccountRow tradeAccountSwitcherAccountRow = (TradeAccountSwitcherAccountRow) other;
        return Intrinsics.areEqual(unknownFields(), tradeAccountSwitcherAccountRow.unknownFields()) && Intrinsics.areEqual(this.account_number, tradeAccountSwitcherAccountRow.account_number) && this.brokerage_account_type == tradeAccountSwitcherAccountRow.brokerage_account_type && this.management_type == tradeAccountSwitcherAccountRow.management_type && Intrinsics.areEqual(this.title, tradeAccountSwitcherAccountRow.title) && Intrinsics.areEqual(this.subtitle, tradeAccountSwitcherAccountRow.subtitle) && Intrinsics.areEqual(this.metadata_title, tradeAccountSwitcherAccountRow.metadata_title) && Intrinsics.areEqual(this.metadata_subtitle, tradeAccountSwitcherAccountRow.metadata_subtitle) && this.icon == tradeAccountSwitcherAccountRow.icon && this.enabled == tradeAccountSwitcherAccountRow.enabled && Intrinsics.areEqual(this.logging_identifier, tradeAccountSwitcherAccountRow.logging_identifier) && Intrinsics.areEqual(this.created_at, tradeAccountSwitcherAccountRow.created_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.brokerage_account_type.hashCode()) * 37) + this.management_type.hashCode()) * 37) + this.title.hashCode()) * 37;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.metadata_title;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.metadata_subtitle;
        int iHashCode4 = (((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.icon.hashCode()) * 37) + Boolean.hashCode(this.enabled)) * 37;
        String str4 = this.logging_identifier;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Instant instant = this.created_at;
        int iHashCode6 = iHashCode5 + (instant != null ? instant.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("brokerage_account_type=" + this.brokerage_account_type);
        arrayList.add("management_type=" + this.management_type);
        arrayList.add("title=" + Internal.sanitize(this.title));
        String str = this.subtitle;
        if (str != null) {
            arrayList.add("subtitle=" + Internal.sanitize(str));
        }
        String str2 = this.metadata_title;
        if (str2 != null) {
            arrayList.add("metadata_title=" + Internal.sanitize(str2));
        }
        String str3 = this.metadata_subtitle;
        if (str3 != null) {
            arrayList.add("metadata_subtitle=" + Internal.sanitize(str3));
        }
        arrayList.add("icon=" + this.icon);
        arrayList.add("enabled=" + this.enabled);
        String str4 = this.logging_identifier;
        if (str4 != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str4));
        }
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TradeAccountSwitcherAccountRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TradeAccountSwitcherAccountRow copy$default(TradeAccountSwitcherAccountRow tradeAccountSwitcherAccountRow, String str, BrokerageAccountType brokerageAccountType, ManagementType managementType, String str2, String str3, String str4, String str5, Icon icon, boolean z, String str6, Instant instant, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeAccountSwitcherAccountRow.account_number;
        }
        if ((i & 2) != 0) {
            brokerageAccountType = tradeAccountSwitcherAccountRow.brokerage_account_type;
        }
        if ((i & 4) != 0) {
            managementType = tradeAccountSwitcherAccountRow.management_type;
        }
        if ((i & 8) != 0) {
            str2 = tradeAccountSwitcherAccountRow.title;
        }
        if ((i & 16) != 0) {
            str3 = tradeAccountSwitcherAccountRow.subtitle;
        }
        if ((i & 32) != 0) {
            str4 = tradeAccountSwitcherAccountRow.metadata_title;
        }
        if ((i & 64) != 0) {
            str5 = tradeAccountSwitcherAccountRow.metadata_subtitle;
        }
        if ((i & 128) != 0) {
            icon = tradeAccountSwitcherAccountRow.icon;
        }
        if ((i & 256) != 0) {
            z = tradeAccountSwitcherAccountRow.enabled;
        }
        if ((i & 512) != 0) {
            str6 = tradeAccountSwitcherAccountRow.logging_identifier;
        }
        if ((i & 1024) != 0) {
            instant = tradeAccountSwitcherAccountRow.created_at;
        }
        if ((i & 2048) != 0) {
            byteString = tradeAccountSwitcherAccountRow.unknownFields();
        }
        Instant instant2 = instant;
        ByteString byteString2 = byteString;
        boolean z2 = z;
        String str7 = str6;
        String str8 = str5;
        Icon icon2 = icon;
        String str9 = str3;
        String str10 = str4;
        return tradeAccountSwitcherAccountRow.copy(str, brokerageAccountType, managementType, str2, str9, str10, str8, icon2, z2, str7, instant2, byteString2);
    }

    public final TradeAccountSwitcherAccountRow copy(String account_number, BrokerageAccountType brokerage_account_type, ManagementType management_type, String title, String subtitle, String metadata_title, String metadata_subtitle, Icon icon, boolean enabled, String logging_identifier, Instant created_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TradeAccountSwitcherAccountRow(account_number, brokerage_account_type, management_type, title, subtitle, metadata_title, metadata_subtitle, icon, enabled, logging_identifier, created_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TradeAccountSwitcherAccountRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TradeAccountSwitcherAccountRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.account_switcher.proto.v1.TradeAccountSwitcherAccountRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TradeAccountSwitcherAccountRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    size += BrokerageAccountType.ADAPTER.encodedSizeWithTag(2, value.getBrokerage_account_type());
                }
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    size += ManagementType.ADAPTER.encodedSizeWithTag(3, value.getManagement_type());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(5, value.getSubtitle()) + protoAdapter.encodedSizeWithTag(6, value.getMetadata_title()) + protoAdapter.encodedSizeWithTag(7, value.getMetadata_subtitle());
                if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                    iEncodedSizeWithTag += Icon.ADAPTER.encodedSizeWithTag(8, value.getIcon());
                }
                if (value.getEnabled()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(9, Boolean.valueOf(value.getEnabled()));
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(10, value.getLogging_identifier());
                return value.getCreated_at() != null ? iEncodedSizeWithTag2 + ProtoAdapter.INSTANT.encodedSizeWithTag(11, value.getCreated_at()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TradeAccountSwitcherAccountRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrokerage_account_type());
                }
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 3, (int) value.getManagement_type());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getSubtitle());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getMetadata_title());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getMetadata_subtitle());
                if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                    Icon.ADAPTER.encodeWithTag(writer, 8, (int) value.getIcon());
                }
                if (value.getEnabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getEnabled()));
                }
                protoAdapter.encodeWithTag(writer, 10, (int) value.getLogging_identifier());
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getCreated_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TradeAccountSwitcherAccountRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getCreated_at());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 10, (int) value.getLogging_identifier());
                if (value.getEnabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getEnabled()));
                }
                if (value.getIcon() != Icon.ICON_UNSPECIFIED) {
                    Icon.ADAPTER.encodeWithTag(writer, 8, (int) value.getIcon());
                }
                protoAdapter.encodeWithTag(writer, 7, (int) value.getMetadata_subtitle());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getMetadata_title());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getSubtitle());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getTitle());
                }
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 3, (int) value.getManagement_type());
                }
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 2, (int) value.getBrokerage_account_type());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TradeAccountSwitcherAccountRow decode(ProtoReader reader) throws IOException {
                BrokerageAccountType brokerageAccountType;
                ManagementType managementType;
                Icon icon;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                BrokerageAccountType brokerageAccountType2 = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                ManagementType managementType2 = ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
                Icon icon2 = Icon.ICON_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                String strDecode4 = null;
                Instant instantDecode = null;
                boolean zBooleanValue = false;
                String strDecode5 = "";
                String strDecode6 = strDecode5;
                Icon iconDecode = icon2;
                ManagementType managementTypeDecode = managementType2;
                BrokerageAccountType brokerageAccountTypeDecode = brokerageAccountType2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                brokerageAccountType = brokerageAccountTypeDecode;
                                managementType = managementTypeDecode;
                                icon = iconDecode;
                                str = strDecode5;
                                try {
                                    brokerageAccountTypeDecode = BrokerageAccountType.ADAPTER.decode(reader);
                                    strDecode5 = str;
                                    iconDecode = icon;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                managementTypeDecode = managementType;
                                break;
                            case 3:
                                brokerageAccountType = brokerageAccountTypeDecode;
                                managementType = managementTypeDecode;
                                try {
                                    managementTypeDecode = ManagementType.ADAPTER.decode(reader);
                                    brokerageAccountTypeDecode = brokerageAccountType;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    icon = iconDecode;
                                    str = strDecode5;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 4:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                try {
                                    iconDecode = Icon.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    brokerageAccountType = brokerageAccountTypeDecode;
                                    managementType = managementTypeDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 9:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 10:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                brokerageAccountType = brokerageAccountTypeDecode;
                                managementType = managementTypeDecode;
                                icon = iconDecode;
                                str = strDecode5;
                                strDecode5 = str;
                                iconDecode = icon;
                                brokerageAccountTypeDecode = brokerageAccountType;
                                managementTypeDecode = managementType;
                                break;
                        }
                    } else {
                        return new TradeAccountSwitcherAccountRow(strDecode5, brokerageAccountTypeDecode, managementTypeDecode, strDecode6, strDecode, strDecode2, strDecode3, iconDecode, zBooleanValue, strDecode4, instantDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TradeAccountSwitcherAccountRow redact(TradeAccountSwitcherAccountRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant created_at = value.getCreated_at();
                return TradeAccountSwitcherAccountRow.copy$default(value, null, null, null, null, null, null, null, null, false, null, created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null, ByteString.EMPTY, 1023, null);
            }
        };
    }
}
