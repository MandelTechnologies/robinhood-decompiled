package bonfire.proto.idl.beneficiaries.p031v1;

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
import rh_server_driven_ui.p531v1.UIComponent;

/* compiled from: BeneficiaryInfoViewModel.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\tH\u0016JX\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModel;", "Lcom/squareup/wire/Message;", "", "type", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoType;", "components", "", "Lrh_server_driven_ui/v1/UIComponent;", "done_button_text", "", "add_beneficiaries_text", "logging_identifier", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoLoggingIdentifier;", "footer_markdown", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoLoggingIdentifier;Ljava/lang/String;Lokio/ByteString;)V", "getType", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoType;", "getDone_button_text", "()Ljava/lang/String;", "getAdd_beneficiaries_text", "getLogging_identifier", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoLoggingIdentifier;", "getFooter_markdown", "getComponents", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BeneficiaryInfoViewModel extends Message {

    @JvmField
    public static final ProtoAdapter<BeneficiaryInfoViewModel> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "addBeneficiariesText", schemaIndex = 3, tag = 4)
    private final String add_beneficiaries_text;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<UIComponent> components;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "doneButtonText", schemaIndex = 2, tag = 3)
    private final String done_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "footerMarkdown", schemaIndex = 5, tag = 6)
    private final String footer_markdown;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoLoggingIdentifier#ADAPTER", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final BeneficiaryInfoLoggingIdentifier logging_identifier;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BeneficiaryInfoType type;

    public BeneficiaryInfoViewModel() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8822newBuilder();
    }

    public final BeneficiaryInfoType getType() {
        return this.type;
    }

    public /* synthetic */ BeneficiaryInfoViewModel(BeneficiaryInfoType beneficiaryInfoType, List list, String str, String str2, BeneficiaryInfoLoggingIdentifier beneficiaryInfoLoggingIdentifier, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BeneficiaryInfoType.BENEFICIARY_INFO_TYPE_UNSPECIFIED : beneficiaryInfoType, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? BeneficiaryInfoLoggingIdentifier.BENEFICIARY_INFO_LOGGING_IDENTIFIER_UNSPECIFIED : beneficiaryInfoLoggingIdentifier, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getDone_button_text() {
        return this.done_button_text;
    }

    public final String getAdd_beneficiaries_text() {
        return this.add_beneficiaries_text;
    }

    public final BeneficiaryInfoLoggingIdentifier getLogging_identifier() {
        return this.logging_identifier;
    }

    public final String getFooter_markdown() {
        return this.footer_markdown;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryInfoViewModel(BeneficiaryInfoType type2, List<UIComponent> components, String str, String str2, BeneficiaryInfoLoggingIdentifier logging_identifier, String str3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.done_button_text = str;
        this.add_beneficiaries_text = str2;
        this.logging_identifier = logging_identifier;
        this.footer_markdown = str3;
        this.components = Internal.immutableCopyOf("components", components);
    }

    public final List<UIComponent> getComponents() {
        return this.components;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8822newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BeneficiaryInfoViewModel)) {
            return false;
        }
        BeneficiaryInfoViewModel beneficiaryInfoViewModel = (BeneficiaryInfoViewModel) other;
        return Intrinsics.areEqual(unknownFields(), beneficiaryInfoViewModel.unknownFields()) && this.type == beneficiaryInfoViewModel.type && Intrinsics.areEqual(this.components, beneficiaryInfoViewModel.components) && Intrinsics.areEqual(this.done_button_text, beneficiaryInfoViewModel.done_button_text) && Intrinsics.areEqual(this.add_beneficiaries_text, beneficiaryInfoViewModel.add_beneficiaries_text) && this.logging_identifier == beneficiaryInfoViewModel.logging_identifier && Intrinsics.areEqual(this.footer_markdown, beneficiaryInfoViewModel.footer_markdown);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.components.hashCode()) * 37;
        String str = this.done_button_text;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.add_beneficiaries_text;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.logging_identifier.hashCode()) * 37;
        String str3 = this.footer_markdown;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        if (!this.components.isEmpty()) {
            arrayList.add("components=" + this.components);
        }
        String str = this.done_button_text;
        if (str != null) {
            arrayList.add("done_button_text=" + Internal.sanitize(str));
        }
        String str2 = this.add_beneficiaries_text;
        if (str2 != null) {
            arrayList.add("add_beneficiaries_text=" + Internal.sanitize(str2));
        }
        arrayList.add("logging_identifier=" + this.logging_identifier);
        String str3 = this.footer_markdown;
        if (str3 != null) {
            arrayList.add("footer_markdown=" + Internal.sanitize(str3));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BeneficiaryInfoViewModel{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BeneficiaryInfoViewModel copy$default(BeneficiaryInfoViewModel beneficiaryInfoViewModel, BeneficiaryInfoType beneficiaryInfoType, List list, String str, String str2, BeneficiaryInfoLoggingIdentifier beneficiaryInfoLoggingIdentifier, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            beneficiaryInfoType = beneficiaryInfoViewModel.type;
        }
        if ((i & 2) != 0) {
            list = beneficiaryInfoViewModel.components;
        }
        if ((i & 4) != 0) {
            str = beneficiaryInfoViewModel.done_button_text;
        }
        if ((i & 8) != 0) {
            str2 = beneficiaryInfoViewModel.add_beneficiaries_text;
        }
        if ((i & 16) != 0) {
            beneficiaryInfoLoggingIdentifier = beneficiaryInfoViewModel.logging_identifier;
        }
        if ((i & 32) != 0) {
            str3 = beneficiaryInfoViewModel.footer_markdown;
        }
        if ((i & 64) != 0) {
            byteString = beneficiaryInfoViewModel.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        BeneficiaryInfoLoggingIdentifier beneficiaryInfoLoggingIdentifier2 = beneficiaryInfoLoggingIdentifier;
        String str5 = str;
        return beneficiaryInfoViewModel.copy(beneficiaryInfoType, list, str5, str2, beneficiaryInfoLoggingIdentifier2, str4, byteString2);
    }

    public final BeneficiaryInfoViewModel copy(BeneficiaryInfoType type2, List<UIComponent> components, String done_button_text, String add_beneficiaries_text, BeneficiaryInfoLoggingIdentifier logging_identifier, String footer_markdown, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BeneficiaryInfoViewModel(type2, components, done_button_text, add_beneficiaries_text, logging_identifier, footer_markdown, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BeneficiaryInfoViewModel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BeneficiaryInfoViewModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryInfoViewModel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BeneficiaryInfoViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getType() != BeneficiaryInfoType.BENEFICIARY_INFO_TYPE_UNSPECIFIED) {
                    size += BeneficiaryInfoType.ADAPTER.encodedSizeWithTag(1, value.getType());
                }
                int iEncodedSizeWithTag = size + UIComponent.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getComponents());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, value.getDone_button_text()) + protoAdapter.encodedSizeWithTag(4, value.getAdd_beneficiaries_text());
                if (value.getLogging_identifier() != BeneficiaryInfoLoggingIdentifier.BENEFICIARY_INFO_LOGGING_IDENTIFIER_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += BeneficiaryInfoLoggingIdentifier.ADAPTER.encodedSizeWithTag(5, value.getLogging_identifier());
                }
                return iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(6, value.getFooter_markdown());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BeneficiaryInfoViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getType() != BeneficiaryInfoType.BENEFICIARY_INFO_TYPE_UNSPECIFIED) {
                    BeneficiaryInfoType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
                UIComponent.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getComponents());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDone_button_text());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getAdd_beneficiaries_text());
                if (value.getLogging_identifier() != BeneficiaryInfoLoggingIdentifier.BENEFICIARY_INFO_LOGGING_IDENTIFIER_UNSPECIFIED) {
                    BeneficiaryInfoLoggingIdentifier.ADAPTER.encodeWithTag(writer, 5, (int) value.getLogging_identifier());
                }
                protoAdapter.encodeWithTag(writer, 6, (int) value.getFooter_markdown());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BeneficiaryInfoViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getFooter_markdown());
                if (value.getLogging_identifier() != BeneficiaryInfoLoggingIdentifier.BENEFICIARY_INFO_LOGGING_IDENTIFIER_UNSPECIFIED) {
                    BeneficiaryInfoLoggingIdentifier.ADAPTER.encodeWithTag(writer, 5, (int) value.getLogging_identifier());
                }
                protoAdapter.encodeWithTag(writer, 4, (int) value.getAdd_beneficiaries_text());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getDone_button_text());
                UIComponent.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getComponents());
                if (value.getType() != BeneficiaryInfoType.BENEFICIARY_INFO_TYPE_UNSPECIFIED) {
                    BeneficiaryInfoType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryInfoViewModel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BeneficiaryInfoType beneficiaryInfoTypeDecode = BeneficiaryInfoType.BENEFICIARY_INFO_TYPE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                BeneficiaryInfoLoggingIdentifier beneficiaryInfoLoggingIdentifier = BeneficiaryInfoLoggingIdentifier.BENEFICIARY_INFO_LOGGING_IDENTIFIER_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                BeneficiaryInfoLoggingIdentifier beneficiaryInfoLoggingIdentifierDecode = beneficiaryInfoLoggingIdentifier;
                while (true) {
                    BeneficiaryInfoType beneficiaryInfoType = beneficiaryInfoTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        beneficiaryInfoTypeDecode = BeneficiaryInfoType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    arrayList.add(UIComponent.ADAPTER.decode(reader));
                                    break;
                                case 3:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    try {
                                        beneficiaryInfoLoggingIdentifierDecode = BeneficiaryInfoLoggingIdentifier.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 6:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new BeneficiaryInfoViewModel(beneficiaryInfoType, arrayList, strDecode, strDecode2, beneficiaryInfoLoggingIdentifierDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryInfoViewModel redact(BeneficiaryInfoViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BeneficiaryInfoViewModel.copy$default(value, null, Internal.m26823redactElements(value.getComponents(), UIComponent.ADAPTER), null, null, null, null, ByteString.EMPTY, 61, null);
            }
        };
    }
}
