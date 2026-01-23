package accounts.onboarding.proto.p006v1;

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
import rosetta.account.ManagementType;

/* compiled from: ManagementStyleRow.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016Jd\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u0006("}, m3636d2 = {"Laccounts/onboarding/proto/v1/ManagementStyleRow;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", "enabled", "", "management_type", "Lrosetta/account/ManagementType;", "learn_more_cta_text", "learn_more_sheet", "Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheet;", "identifier", "promotional_title", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLrosetta/account/ManagementType;Ljava/lang/String;Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheet;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getEnabled", "()Z", "getManagement_type", "()Lrosetta/account/ManagementType;", "getLearn_more_cta_text", "getLearn_more_sheet", "()Laccounts/onboarding/proto/v1/ManagementStyleRowLearnMoreSheet;", "getIdentifier", "getPromotional_title", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class ManagementStyleRow extends Message {

    @JvmField
    public static final ProtoAdapter<ManagementStyleRow> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "learnMoreCtaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String learn_more_cta_text;

    @WireField(adapter = "accounts.onboarding.proto.v1.ManagementStyleRowLearnMoreSheet#ADAPTER", jsonName = "learnMoreSheet", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final ManagementStyleRowLearnMoreSheet learn_more_sheet;

    @WireField(adapter = "rosetta.account.ManagementType#ADAPTER", jsonName = "managementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ManagementType management_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "promotionalTitle", schemaIndex = 7, tag = 8)
    private final String promotional_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public ManagementStyleRow() {
        this(null, null, false, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ ManagementStyleRow(String str, String str2, boolean z, ManagementType managementType, String str3, ManagementStyleRowLearnMoreSheet managementStyleRowLearnMoreSheet, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ManagementType.MANAGEMENT_TYPE_UNSPECIFIED : managementType, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : managementStyleRowLearnMoreSheet, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4353newBuilder();
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

    public final ManagementType getManagement_type() {
        return this.management_type;
    }

    public final String getLearn_more_cta_text() {
        return this.learn_more_cta_text;
    }

    public final ManagementStyleRowLearnMoreSheet getLearn_more_sheet() {
        return this.learn_more_sheet;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getPromotional_title() {
        return this.promotional_title;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagementStyleRow(String title, String subtitle, boolean z, ManagementType management_type, String learn_more_cta_text, ManagementStyleRowLearnMoreSheet managementStyleRowLearnMoreSheet, String identifier, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
        Intrinsics.checkNotNullParameter(learn_more_cta_text, "learn_more_cta_text");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.enabled = z;
        this.management_type = management_type;
        this.learn_more_cta_text = learn_more_cta_text;
        this.learn_more_sheet = managementStyleRowLearnMoreSheet;
        this.identifier = identifier;
        this.promotional_title = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4353newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ManagementStyleRow)) {
            return false;
        }
        ManagementStyleRow managementStyleRow = (ManagementStyleRow) other;
        return Intrinsics.areEqual(unknownFields(), managementStyleRow.unknownFields()) && Intrinsics.areEqual(this.title, managementStyleRow.title) && Intrinsics.areEqual(this.subtitle, managementStyleRow.subtitle) && this.enabled == managementStyleRow.enabled && this.management_type == managementStyleRow.management_type && Intrinsics.areEqual(this.learn_more_cta_text, managementStyleRow.learn_more_cta_text) && Intrinsics.areEqual(this.learn_more_sheet, managementStyleRow.learn_more_sheet) && Intrinsics.areEqual(this.identifier, managementStyleRow.identifier) && Intrinsics.areEqual(this.promotional_title, managementStyleRow.promotional_title);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + Boolean.hashCode(this.enabled)) * 37) + this.management_type.hashCode()) * 37) + this.learn_more_cta_text.hashCode()) * 37;
        ManagementStyleRowLearnMoreSheet managementStyleRowLearnMoreSheet = this.learn_more_sheet;
        int iHashCode2 = (((iHashCode + (managementStyleRowLearnMoreSheet != null ? managementStyleRowLearnMoreSheet.hashCode() : 0)) * 37) + this.identifier.hashCode()) * 37;
        String str = this.promotional_title;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        arrayList.add("enabled=" + this.enabled);
        arrayList.add("management_type=" + this.management_type);
        arrayList.add("learn_more_cta_text=" + Internal.sanitize(this.learn_more_cta_text));
        ManagementStyleRowLearnMoreSheet managementStyleRowLearnMoreSheet = this.learn_more_sheet;
        if (managementStyleRowLearnMoreSheet != null) {
            arrayList.add("learn_more_sheet=" + managementStyleRowLearnMoreSheet);
        }
        arrayList.add("identifier=" + Internal.sanitize(this.identifier));
        String str = this.promotional_title;
        if (str != null) {
            arrayList.add("promotional_title=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ManagementStyleRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ManagementStyleRow copy$default(ManagementStyleRow managementStyleRow, String str, String str2, boolean z, ManagementType managementType, String str3, ManagementStyleRowLearnMoreSheet managementStyleRowLearnMoreSheet, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = managementStyleRow.title;
        }
        if ((i & 2) != 0) {
            str2 = managementStyleRow.subtitle;
        }
        if ((i & 4) != 0) {
            z = managementStyleRow.enabled;
        }
        if ((i & 8) != 0) {
            managementType = managementStyleRow.management_type;
        }
        if ((i & 16) != 0) {
            str3 = managementStyleRow.learn_more_cta_text;
        }
        if ((i & 32) != 0) {
            managementStyleRowLearnMoreSheet = managementStyleRow.learn_more_sheet;
        }
        if ((i & 64) != 0) {
            str4 = managementStyleRow.identifier;
        }
        if ((i & 128) != 0) {
            str5 = managementStyleRow.promotional_title;
        }
        if ((i & 256) != 0) {
            byteString = managementStyleRow.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        ManagementStyleRowLearnMoreSheet managementStyleRowLearnMoreSheet2 = managementStyleRowLearnMoreSheet;
        String str7 = str4;
        String str8 = str3;
        boolean z2 = z;
        return managementStyleRow.copy(str, str2, z2, managementType, str8, managementStyleRowLearnMoreSheet2, str7, str6, byteString2);
    }

    public final ManagementStyleRow copy(String title, String subtitle, boolean enabled, ManagementType management_type, String learn_more_cta_text, ManagementStyleRowLearnMoreSheet learn_more_sheet, String identifier, String promotional_title, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(management_type, "management_type");
        Intrinsics.checkNotNullParameter(learn_more_cta_text, "learn_more_cta_text");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ManagementStyleRow(title, subtitle, enabled, management_type, learn_more_cta_text, learn_more_sheet, identifier, promotional_title, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ManagementStyleRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ManagementStyleRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: accounts.onboarding.proto.v1.ManagementStyleRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ManagementStyleRow value) {
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
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    size += ManagementType.ADAPTER.encodedSizeWithTag(4, value.getManagement_type());
                }
                if (!Intrinsics.areEqual(value.getLearn_more_cta_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getLearn_more_cta_text());
                }
                if (value.getLearn_more_sheet() != null) {
                    size += ManagementStyleRowLearnMoreSheet.ADAPTER.encodedSizeWithTag(6, value.getLearn_more_sheet());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getIdentifier());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(8, value.getPromotional_title());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ManagementStyleRow value) throws IOException {
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
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 4, (int) value.getManagement_type());
                }
                if (!Intrinsics.areEqual(value.getLearn_more_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLearn_more_cta_text());
                }
                if (value.getLearn_more_sheet() != null) {
                    ManagementStyleRowLearnMoreSheet.ADAPTER.encodeWithTag(writer, 6, (int) value.getLearn_more_sheet());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getIdentifier());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPromotional_title());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ManagementStyleRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getPromotional_title());
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getIdentifier());
                }
                if (value.getLearn_more_sheet() != null) {
                    ManagementStyleRowLearnMoreSheet.ADAPTER.encodeWithTag(writer, 6, (int) value.getLearn_more_sheet());
                }
                if (!Intrinsics.areEqual(value.getLearn_more_cta_text(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getLearn_more_cta_text());
                }
                if (value.getManagement_type() != ManagementType.MANAGEMENT_TYPE_UNSPECIFIED) {
                    ManagementType.ADAPTER.encodeWithTag(writer, 4, (int) value.getManagement_type());
                }
                if (value.getEnabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getEnabled()));
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ManagementStyleRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ManagementType managementType = ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                boolean zBooleanValue = false;
                ManagementStyleRowLearnMoreSheet managementStyleRowLearnMoreSheetDecode = null;
                String strDecode3 = null;
                ManagementType managementTypeDecode = managementType;
                String strDecode4 = strDecode2;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 4:
                                try {
                                    managementTypeDecode = ManagementType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                managementStyleRowLearnMoreSheetDecode = ManagementStyleRowLearnMoreSheet.ADAPTER.decode(reader);
                                break;
                            case 7:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ManagementStyleRow(strDecode4, strDecode5, zBooleanValue, managementTypeDecode, strDecode, managementStyleRowLearnMoreSheetDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ManagementStyleRow redact(ManagementStyleRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ManagementStyleRowLearnMoreSheet learn_more_sheet = value.getLearn_more_sheet();
                return ManagementStyleRow.copy$default(value, null, null, false, null, null, learn_more_sheet != null ? ManagementStyleRowLearnMoreSheet.ADAPTER.redact(learn_more_sheet) : null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
            }
        };
    }
}
