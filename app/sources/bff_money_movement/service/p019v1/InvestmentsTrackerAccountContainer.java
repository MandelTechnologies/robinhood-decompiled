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

/* compiled from: InvestmentsTrackerAccountContainer.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016J^\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainer;", "Lcom/squareup/wire/Message;", "", "icon", "", "name", "subtitle", "connection_id", "account_rows", "", "Lbff_money_movement/service/v1/InvestmentsTrackerAccountRow;", "logo_url", "disconnected_data", "Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedData;Lokio/ByteString;)V", "getIcon", "()Ljava/lang/String;", "getName", "getSubtitle", "getConnection_id", "getLogo_url", "getDisconnected_data", "()Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedData;", "getAccount_rows", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerAccountContainer extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerAccountContainer> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerAccountRow#ADAPTER", jsonName = "accountRows", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<InvestmentsTrackerAccountRow> account_rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "connectionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String connection_id;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerDisconnectedData#ADAPTER", jsonName = "disconnectedData", schemaIndex = 6, tag = 7)
    private final InvestmentsTrackerDisconnectedData disconnected_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "logoUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String logo_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String subtitle;

    public InvestmentsTrackerAccountContainer() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ InvestmentsTrackerAccountContainer(String str, String str2, String str3, String str4, List list, String str5, InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? null : investmentsTrackerDisconnectedData, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8441newBuilder();
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getConnection_id() {
        return this.connection_id;
    }

    public final String getLogo_url() {
        return this.logo_url;
    }

    public final InvestmentsTrackerDisconnectedData getDisconnected_data() {
        return this.disconnected_data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerAccountContainer(String icon, String name, String subtitle, String connection_id, List<InvestmentsTrackerAccountRow> account_rows, String logo_url, InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(connection_id, "connection_id");
        Intrinsics.checkNotNullParameter(account_rows, "account_rows");
        Intrinsics.checkNotNullParameter(logo_url, "logo_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.icon = icon;
        this.name = name;
        this.subtitle = subtitle;
        this.connection_id = connection_id;
        this.logo_url = logo_url;
        this.disconnected_data = investmentsTrackerDisconnectedData;
        this.account_rows = Internal.immutableCopyOf("account_rows", account_rows);
    }

    public final List<InvestmentsTrackerAccountRow> getAccount_rows() {
        return this.account_rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8441newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerAccountContainer)) {
            return false;
        }
        InvestmentsTrackerAccountContainer investmentsTrackerAccountContainer = (InvestmentsTrackerAccountContainer) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerAccountContainer.unknownFields()) && Intrinsics.areEqual(this.icon, investmentsTrackerAccountContainer.icon) && Intrinsics.areEqual(this.name, investmentsTrackerAccountContainer.name) && Intrinsics.areEqual(this.subtitle, investmentsTrackerAccountContainer.subtitle) && Intrinsics.areEqual(this.connection_id, investmentsTrackerAccountContainer.connection_id) && Intrinsics.areEqual(this.account_rows, investmentsTrackerAccountContainer.account_rows) && Intrinsics.areEqual(this.logo_url, investmentsTrackerAccountContainer.logo_url) && Intrinsics.areEqual(this.disconnected_data, investmentsTrackerAccountContainer.disconnected_data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.icon.hashCode()) * 37) + this.name.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.connection_id.hashCode()) * 37) + this.account_rows.hashCode()) * 37) + this.logo_url.hashCode()) * 37;
        InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData = this.disconnected_data;
        int iHashCode2 = iHashCode + (investmentsTrackerDisconnectedData != null ? investmentsTrackerDisconnectedData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("icon=" + Internal.sanitize(this.icon));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("connection_id=" + Internal.sanitize(this.connection_id));
        if (!this.account_rows.isEmpty()) {
            arrayList.add("account_rows=" + this.account_rows);
        }
        arrayList.add("logo_url=" + Internal.sanitize(this.logo_url));
        InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData = this.disconnected_data;
        if (investmentsTrackerDisconnectedData != null) {
            arrayList.add("disconnected_data=" + investmentsTrackerDisconnectedData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerAccountContainer{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerAccountContainer copy$default(InvestmentsTrackerAccountContainer investmentsTrackerAccountContainer, String str, String str2, String str3, String str4, List list, String str5, InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investmentsTrackerAccountContainer.icon;
        }
        if ((i & 2) != 0) {
            str2 = investmentsTrackerAccountContainer.name;
        }
        if ((i & 4) != 0) {
            str3 = investmentsTrackerAccountContainer.subtitle;
        }
        if ((i & 8) != 0) {
            str4 = investmentsTrackerAccountContainer.connection_id;
        }
        if ((i & 16) != 0) {
            list = investmentsTrackerAccountContainer.account_rows;
        }
        if ((i & 32) != 0) {
            str5 = investmentsTrackerAccountContainer.logo_url;
        }
        if ((i & 64) != 0) {
            investmentsTrackerDisconnectedData = investmentsTrackerAccountContainer.disconnected_data;
        }
        if ((i & 128) != 0) {
            byteString = investmentsTrackerAccountContainer.unknownFields();
        }
        InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedData2 = investmentsTrackerDisconnectedData;
        ByteString byteString2 = byteString;
        List list2 = list;
        String str6 = str5;
        return investmentsTrackerAccountContainer.copy(str, str2, str3, str4, list2, str6, investmentsTrackerDisconnectedData2, byteString2);
    }

    public final InvestmentsTrackerAccountContainer copy(String icon, String name, String subtitle, String connection_id, List<InvestmentsTrackerAccountRow> account_rows, String logo_url, InvestmentsTrackerDisconnectedData disconnected_data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(connection_id, "connection_id");
        Intrinsics.checkNotNullParameter(account_rows, "account_rows");
        Intrinsics.checkNotNullParameter(logo_url, "logo_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerAccountContainer(icon, name, subtitle, connection_id, account_rows, logo_url, disconnected_data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerAccountContainer.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerAccountContainer>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerAccountContainer$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerAccountContainer value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getIcon(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getIcon());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getConnection_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getConnection_id());
                }
                int iEncodedSizeWithTag = size + InvestmentsTrackerAccountRow.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getAccount_rows());
                if (!Intrinsics.areEqual(value.getLogo_url(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getLogo_url());
                }
                return iEncodedSizeWithTag + InvestmentsTrackerDisconnectedData.ADAPTER.encodedSizeWithTag(7, value.getDisconnected_data());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerAccountContainer value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getIcon(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIcon());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getConnection_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getConnection_id());
                }
                InvestmentsTrackerAccountRow.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getAccount_rows());
                if (!Intrinsics.areEqual(value.getLogo_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getLogo_url());
                }
                InvestmentsTrackerDisconnectedData.ADAPTER.encodeWithTag(writer, 7, (int) value.getDisconnected_data());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerAccountContainer value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                InvestmentsTrackerDisconnectedData.ADAPTER.encodeWithTag(writer, 7, (int) value.getDisconnected_data());
                if (!Intrinsics.areEqual(value.getLogo_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getLogo_url());
                }
                InvestmentsTrackerAccountRow.ADAPTER.asRepeated().encodeWithTag(writer, 5, (int) value.getAccount_rows());
                if (!Intrinsics.areEqual(value.getConnection_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getConnection_id());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (Intrinsics.areEqual(value.getIcon(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIcon());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerAccountContainer decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                InvestmentsTrackerDisconnectedData investmentsTrackerDisconnectedDataDecode = null;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                arrayList.add(InvestmentsTrackerAccountRow.ADAPTER.decode(reader));
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                investmentsTrackerDisconnectedDataDecode = InvestmentsTrackerDisconnectedData.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new InvestmentsTrackerAccountContainer(strDecode, strDecode5, strDecode2, strDecode3, arrayList, strDecode4, investmentsTrackerDisconnectedDataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerAccountContainer redact(InvestmentsTrackerAccountContainer value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getAccount_rows(), InvestmentsTrackerAccountRow.ADAPTER);
                InvestmentsTrackerDisconnectedData disconnected_data = value.getDisconnected_data();
                return InvestmentsTrackerAccountContainer.copy$default(value, null, null, null, null, listM26823redactElements, null, disconnected_data != null ? InvestmentsTrackerDisconnectedData.ADAPTER.redact(disconnected_data) : null, ByteString.EMPTY, 47, null);
            }
        };
    }
}
