package advisory.proto.p008v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: TaxLossHarvestChooseAccountsRow.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016JN\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014¨\u0006\u001e"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestChooseAccountsRow;", "Lcom/squareup/wire/Message;", "", "account_number", "", "title", "icon", "subtitle", "is_editable", "", "is_checked", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getTitle", "getIcon", "getSubtitle", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class TaxLossHarvestChooseAccountsRow extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLossHarvestChooseAccountsRow> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isChecked", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean is_checked;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEditable", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean is_editable;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    public TaxLossHarvestChooseAccountsRow() {
        this(null, null, null, null, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ TaxLossHarvestChooseAccountsRow(String str, String str2, String str3, String str4, boolean z, boolean z2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4546newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: is_editable, reason: from getter */
    public final boolean getIs_editable() {
        return this.is_editable;
    }

    /* renamed from: is_checked, reason: from getter */
    public final boolean getIs_checked() {
        return this.is_checked;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestChooseAccountsRow(String account_number, String title, String icon, String str, boolean z, boolean z2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.title = title;
        this.icon = icon;
        this.subtitle = str;
        this.is_editable = z;
        this.is_checked = z2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4546newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLossHarvestChooseAccountsRow)) {
            return false;
        }
        TaxLossHarvestChooseAccountsRow taxLossHarvestChooseAccountsRow = (TaxLossHarvestChooseAccountsRow) other;
        return Intrinsics.areEqual(unknownFields(), taxLossHarvestChooseAccountsRow.unknownFields()) && Intrinsics.areEqual(this.account_number, taxLossHarvestChooseAccountsRow.account_number) && Intrinsics.areEqual(this.title, taxLossHarvestChooseAccountsRow.title) && Intrinsics.areEqual(this.icon, taxLossHarvestChooseAccountsRow.icon) && Intrinsics.areEqual(this.subtitle, taxLossHarvestChooseAccountsRow.subtitle) && this.is_editable == taxLossHarvestChooseAccountsRow.is_editable && this.is_checked == taxLossHarvestChooseAccountsRow.is_checked;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.title.hashCode()) * 37) + this.icon.hashCode()) * 37;
        String str = this.subtitle;
        int iHashCode2 = ((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_editable)) * 37) + Boolean.hashCode(this.is_checked);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("icon=" + Internal.sanitize(this.icon));
        String str = this.subtitle;
        if (str != null) {
            arrayList.add("subtitle=" + Internal.sanitize(str));
        }
        arrayList.add("is_editable=" + this.is_editable);
        arrayList.add("is_checked=" + this.is_checked);
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLossHarvestChooseAccountsRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxLossHarvestChooseAccountsRow copy$default(TaxLossHarvestChooseAccountsRow taxLossHarvestChooseAccountsRow, String str, String str2, String str3, String str4, boolean z, boolean z2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLossHarvestChooseAccountsRow.account_number;
        }
        if ((i & 2) != 0) {
            str2 = taxLossHarvestChooseAccountsRow.title;
        }
        if ((i & 4) != 0) {
            str3 = taxLossHarvestChooseAccountsRow.icon;
        }
        if ((i & 8) != 0) {
            str4 = taxLossHarvestChooseAccountsRow.subtitle;
        }
        if ((i & 16) != 0) {
            z = taxLossHarvestChooseAccountsRow.is_editable;
        }
        if ((i & 32) != 0) {
            z2 = taxLossHarvestChooseAccountsRow.is_checked;
        }
        if ((i & 64) != 0) {
            byteString = taxLossHarvestChooseAccountsRow.unknownFields();
        }
        boolean z3 = z2;
        ByteString byteString2 = byteString;
        boolean z4 = z;
        String str5 = str3;
        return taxLossHarvestChooseAccountsRow.copy(str, str2, str5, str4, z4, z3, byteString2);
    }

    public final TaxLossHarvestChooseAccountsRow copy(String account_number, String title, String icon, String subtitle, boolean is_editable, boolean is_checked, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLossHarvestChooseAccountsRow(account_number, title, icon, subtitle, is_editable, is_checked, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLossHarvestChooseAccountsRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLossHarvestChooseAccountsRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.TaxLossHarvestChooseAccountsRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLossHarvestChooseAccountsRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getIcon(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getIcon());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSubtitle());
                if (value.getIs_editable()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getIs_editable()));
                }
                return value.getIs_checked() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getIs_checked())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLossHarvestChooseAccountsRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getIcon(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getIcon());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSubtitle());
                if (value.getIs_editable()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_editable()));
                }
                if (value.getIs_checked()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_checked()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLossHarvestChooseAccountsRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_checked()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getIs_checked()));
                }
                if (value.getIs_editable()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_editable()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getSubtitle());
                if (!Intrinsics.areEqual(value.getIcon(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getIcon());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestChooseAccountsRow redact(TaxLossHarvestChooseAccountsRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TaxLossHarvestChooseAccountsRow.copy$default(value, null, null, null, null, false, false, ByteString.EMPTY, 63, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TaxLossHarvestChooseAccountsRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
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
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 6:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new TaxLossHarvestChooseAccountsRow(strDecode, strDecode3, strDecode4, strDecode2, zBooleanValue, zBooleanValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
