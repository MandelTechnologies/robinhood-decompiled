package accounts.onboarding.proto.p006v1;

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

/* compiled from: AvailableAccountRow.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\\\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u0006("}, m3636d2 = {"Laccounts/onboarding/proto/v1/AvailableAccountRow;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", "enabled", "", "brokerage_account_type_selection", "Laccounts/onboarding/proto/v1/BrokerageAccountTypeSelection;", "retirement_selection", "Laccounts/onboarding/proto/v1/RetirementAccountSelection;", "custodial_selection", "Laccounts/onboarding/proto/v1/CustodialAccountSelection;", "identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLaccounts/onboarding/proto/v1/BrokerageAccountTypeSelection;Laccounts/onboarding/proto/v1/RetirementAccountSelection;Laccounts/onboarding/proto/v1/CustodialAccountSelection;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getEnabled", "()Z", "getBrokerage_account_type_selection", "()Laccounts/onboarding/proto/v1/BrokerageAccountTypeSelection;", "getRetirement_selection", "()Laccounts/onboarding/proto/v1/RetirementAccountSelection;", "getCustodial_selection", "()Laccounts/onboarding/proto/v1/CustodialAccountSelection;", "getIdentifier", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class AvailableAccountRow extends Message {

    @JvmField
    public static final ProtoAdapter<AvailableAccountRow> ADAPTER;

    @WireField(adapter = "accounts.onboarding.proto.v1.BrokerageAccountTypeSelection#ADAPTER", jsonName = "brokerageAccountTypeSelection", oneofName = "row_type", schemaIndex = 3, tag = 4)
    private final BrokerageAccountTypeSelection brokerage_account_type_selection;

    @WireField(adapter = "accounts.onboarding.proto.v1.CustodialAccountSelection#ADAPTER", jsonName = "custodialSelection", oneofName = "row_type", schemaIndex = 5, tag = 7)
    private final CustodialAccountSelection custodial_selection;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 6)
    private final String identifier;

    @WireField(adapter = "accounts.onboarding.proto.v1.RetirementAccountSelection#ADAPTER", jsonName = "retirementSelection", oneofName = "row_type", schemaIndex = 4, tag = 5)
    private final RetirementAccountSelection retirement_selection;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public AvailableAccountRow() {
        this(null, null, false, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ AvailableAccountRow(String str, String str2, boolean z, BrokerageAccountTypeSelection brokerageAccountTypeSelection, RetirementAccountSelection retirementAccountSelection, CustodialAccountSelection custodialAccountSelection, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : brokerageAccountTypeSelection, (i & 16) != 0 ? null : retirementAccountSelection, (i & 32) != 0 ? null : custodialAccountSelection, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4342newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final BrokerageAccountTypeSelection getBrokerage_account_type_selection() {
        return this.brokerage_account_type_selection;
    }

    public final RetirementAccountSelection getRetirement_selection() {
        return this.retirement_selection;
    }

    public final CustodialAccountSelection getCustodial_selection() {
        return this.custodial_selection;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailableAccountRow(String title, String subtitle, boolean z, BrokerageAccountTypeSelection brokerageAccountTypeSelection, RetirementAccountSelection retirementAccountSelection, CustodialAccountSelection custodialAccountSelection, String identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.enabled = z;
        this.brokerage_account_type_selection = brokerageAccountTypeSelection;
        this.retirement_selection = retirementAccountSelection;
        this.custodial_selection = custodialAccountSelection;
        this.identifier = identifier;
        if (Internal.countNonNull(brokerageAccountTypeSelection, retirementAccountSelection, custodialAccountSelection) > 1) {
            throw new IllegalArgumentException("At most one of brokerage_account_type_selection, retirement_selection, custodial_selection may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4342newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AvailableAccountRow)) {
            return false;
        }
        AvailableAccountRow availableAccountRow = (AvailableAccountRow) other;
        return Intrinsics.areEqual(unknownFields(), availableAccountRow.unknownFields()) && Intrinsics.areEqual(this.title, availableAccountRow.title) && Intrinsics.areEqual(this.subtitle, availableAccountRow.subtitle) && this.enabled == availableAccountRow.enabled && Intrinsics.areEqual(this.brokerage_account_type_selection, availableAccountRow.brokerage_account_type_selection) && Intrinsics.areEqual(this.retirement_selection, availableAccountRow.retirement_selection) && Intrinsics.areEqual(this.custodial_selection, availableAccountRow.custodial_selection) && Intrinsics.areEqual(this.identifier, availableAccountRow.identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + Boolean.hashCode(this.enabled)) * 37;
        BrokerageAccountTypeSelection brokerageAccountTypeSelection = this.brokerage_account_type_selection;
        int iHashCode2 = (iHashCode + (brokerageAccountTypeSelection != null ? brokerageAccountTypeSelection.hashCode() : 0)) * 37;
        RetirementAccountSelection retirementAccountSelection = this.retirement_selection;
        int iHashCode3 = (iHashCode2 + (retirementAccountSelection != null ? retirementAccountSelection.hashCode() : 0)) * 37;
        CustodialAccountSelection custodialAccountSelection = this.custodial_selection;
        int iHashCode4 = ((iHashCode3 + (custodialAccountSelection != null ? custodialAccountSelection.hashCode() : 0)) * 37) + this.identifier.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("enabled=" + this.enabled);
        BrokerageAccountTypeSelection brokerageAccountTypeSelection = this.brokerage_account_type_selection;
        if (brokerageAccountTypeSelection != null) {
            arrayList.add("brokerage_account_type_selection=" + brokerageAccountTypeSelection);
        }
        RetirementAccountSelection retirementAccountSelection = this.retirement_selection;
        if (retirementAccountSelection != null) {
            arrayList.add("retirement_selection=" + retirementAccountSelection);
        }
        CustodialAccountSelection custodialAccountSelection = this.custodial_selection;
        if (custodialAccountSelection != null) {
            arrayList.add("custodial_selection=" + custodialAccountSelection);
        }
        arrayList.add("identifier=" + Internal.sanitize(this.identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AvailableAccountRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AvailableAccountRow copy$default(AvailableAccountRow availableAccountRow, String str, String str2, boolean z, BrokerageAccountTypeSelection brokerageAccountTypeSelection, RetirementAccountSelection retirementAccountSelection, CustodialAccountSelection custodialAccountSelection, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = availableAccountRow.title;
        }
        if ((i & 2) != 0) {
            str2 = availableAccountRow.subtitle;
        }
        if ((i & 4) != 0) {
            z = availableAccountRow.enabled;
        }
        if ((i & 8) != 0) {
            brokerageAccountTypeSelection = availableAccountRow.brokerage_account_type_selection;
        }
        if ((i & 16) != 0) {
            retirementAccountSelection = availableAccountRow.retirement_selection;
        }
        if ((i & 32) != 0) {
            custodialAccountSelection = availableAccountRow.custodial_selection;
        }
        if ((i & 64) != 0) {
            str3 = availableAccountRow.identifier;
        }
        if ((i & 128) != 0) {
            byteString = availableAccountRow.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        RetirementAccountSelection retirementAccountSelection2 = retirementAccountSelection;
        CustodialAccountSelection custodialAccountSelection2 = custodialAccountSelection;
        return availableAccountRow.copy(str, str2, z, brokerageAccountTypeSelection, retirementAccountSelection2, custodialAccountSelection2, str4, byteString2);
    }

    public final AvailableAccountRow copy(String title, String subtitle, boolean enabled, BrokerageAccountTypeSelection brokerage_account_type_selection, RetirementAccountSelection retirement_selection, CustodialAccountSelection custodial_selection, String identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AvailableAccountRow(title, subtitle, enabled, brokerage_account_type_selection, retirement_selection, custodial_selection, identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AvailableAccountRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AvailableAccountRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: accounts.onboarding.proto.v1.AvailableAccountRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AvailableAccountRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                if (value.getEnabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getEnabled()));
                }
                int iEncodedSizeWithTag = size + BrokerageAccountTypeSelection.ADAPTER.encodedSizeWithTag(4, value.getBrokerage_account_type_selection()) + RetirementAccountSelection.ADAPTER.encodedSizeWithTag(5, value.getRetirement_selection()) + CustodialAccountSelection.ADAPTER.encodedSizeWithTag(7, value.getCustodial_selection());
                return !Intrinsics.areEqual(value.getIdentifier(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getIdentifier()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AvailableAccountRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (value.getEnabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getEnabled()));
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getIdentifier());
                }
                BrokerageAccountTypeSelection.ADAPTER.encodeWithTag(writer, 4, (int) value.getBrokerage_account_type_selection());
                RetirementAccountSelection.ADAPTER.encodeWithTag(writer, 5, (int) value.getRetirement_selection());
                CustodialAccountSelection.ADAPTER.encodeWithTag(writer, 7, (int) value.getCustodial_selection());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AvailableAccountRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                CustodialAccountSelection.ADAPTER.encodeWithTag(writer, 7, (int) value.getCustodial_selection());
                RetirementAccountSelection.ADAPTER.encodeWithTag(writer, 5, (int) value.getRetirement_selection());
                BrokerageAccountTypeSelection.ADAPTER.encodeWithTag(writer, 4, (int) value.getBrokerage_account_type_selection());
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getIdentifier());
                }
                if (value.getEnabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getEnabled()));
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AvailableAccountRow redact(AvailableAccountRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BrokerageAccountTypeSelection brokerage_account_type_selection = value.getBrokerage_account_type_selection();
                BrokerageAccountTypeSelection brokerageAccountTypeSelectionRedact = brokerage_account_type_selection != null ? BrokerageAccountTypeSelection.ADAPTER.redact(brokerage_account_type_selection) : null;
                RetirementAccountSelection retirement_selection = value.getRetirement_selection();
                RetirementAccountSelection retirementAccountSelectionRedact = retirement_selection != null ? RetirementAccountSelection.ADAPTER.redact(retirement_selection) : null;
                CustodialAccountSelection custodial_selection = value.getCustodial_selection();
                return AvailableAccountRow.copy$default(value, null, null, false, brokerageAccountTypeSelectionRedact, retirementAccountSelectionRedact, custodial_selection != null ? CustodialAccountSelection.ADAPTER.redact(custodial_selection) : null, null, ByteString.EMPTY, 71, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AvailableAccountRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                BrokerageAccountTypeSelection brokerageAccountTypeSelectionDecode = null;
                RetirementAccountSelection retirementAccountSelectionDecode = null;
                CustodialAccountSelection custodialAccountSelectionDecode = null;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 4:
                                brokerageAccountTypeSelectionDecode = BrokerageAccountTypeSelection.ADAPTER.decode(reader);
                                break;
                            case 5:
                                retirementAccountSelectionDecode = RetirementAccountSelection.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                custodialAccountSelectionDecode = CustodialAccountSelection.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AvailableAccountRow(strDecode, strDecode2, zBooleanValue, brokerageAccountTypeSelectionDecode, retirementAccountSelectionDecode, custodialAccountSelectionDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
