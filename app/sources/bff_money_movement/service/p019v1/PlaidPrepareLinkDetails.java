package bff_money_movement.service.p019v1;

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

/* compiled from: PlaidPrepareLinkDetails.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JV\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006!"}, m3636d2 = {"Lbff_money_movement/service/v1/PlaidPrepareLinkDetails;", "Lcom/squareup/wire/Message;", "", "account_link_id", "", "redirect_uri", "link_customization_name", "android_package_name", "institution_id", "investment_account_type", "client_name", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_link_id", "()Ljava/lang/String;", "getRedirect_uri", "getLink_customization_name", "getAndroid_package_name", "getInstitution_id", "getInvestment_account_type", "getClient_name", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class PlaidPrepareLinkDetails extends Message {

    @JvmField
    public static final ProtoAdapter<PlaidPrepareLinkDetails> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountLinkId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_link_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "androidPackageName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String android_package_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "clientName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String client_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "institutionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String institution_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "investmentAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String investment_account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "linkCustomizationName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String link_customization_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "redirectUri", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String redirect_uri;

    public PlaidPrepareLinkDetails() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ PlaidPrepareLinkDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8504newBuilder();
    }

    public final String getAccount_link_id() {
        return this.account_link_id;
    }

    public final String getRedirect_uri() {
        return this.redirect_uri;
    }

    public final String getLink_customization_name() {
        return this.link_customization_name;
    }

    public final String getAndroid_package_name() {
        return this.android_package_name;
    }

    public final String getInstitution_id() {
        return this.institution_id;
    }

    public final String getInvestment_account_type() {
        return this.investment_account_type;
    }

    public final String getClient_name() {
        return this.client_name;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidPrepareLinkDetails(String account_link_id, String redirect_uri, String link_customization_name, String android_package_name, String institution_id, String investment_account_type, String client_name, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_link_id, "account_link_id");
        Intrinsics.checkNotNullParameter(redirect_uri, "redirect_uri");
        Intrinsics.checkNotNullParameter(link_customization_name, "link_customization_name");
        Intrinsics.checkNotNullParameter(android_package_name, "android_package_name");
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(investment_account_type, "investment_account_type");
        Intrinsics.checkNotNullParameter(client_name, "client_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_link_id = account_link_id;
        this.redirect_uri = redirect_uri;
        this.link_customization_name = link_customization_name;
        this.android_package_name = android_package_name;
        this.institution_id = institution_id;
        this.investment_account_type = investment_account_type;
        this.client_name = client_name;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8504newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PlaidPrepareLinkDetails)) {
            return false;
        }
        PlaidPrepareLinkDetails plaidPrepareLinkDetails = (PlaidPrepareLinkDetails) other;
        return Intrinsics.areEqual(unknownFields(), plaidPrepareLinkDetails.unknownFields()) && Intrinsics.areEqual(this.account_link_id, plaidPrepareLinkDetails.account_link_id) && Intrinsics.areEqual(this.redirect_uri, plaidPrepareLinkDetails.redirect_uri) && Intrinsics.areEqual(this.link_customization_name, plaidPrepareLinkDetails.link_customization_name) && Intrinsics.areEqual(this.android_package_name, plaidPrepareLinkDetails.android_package_name) && Intrinsics.areEqual(this.institution_id, plaidPrepareLinkDetails.institution_id) && Intrinsics.areEqual(this.investment_account_type, plaidPrepareLinkDetails.investment_account_type) && Intrinsics.areEqual(this.client_name, plaidPrepareLinkDetails.client_name);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.account_link_id.hashCode()) * 37) + this.redirect_uri.hashCode()) * 37) + this.link_customization_name.hashCode()) * 37) + this.android_package_name.hashCode()) * 37) + this.institution_id.hashCode()) * 37) + this.investment_account_type.hashCode()) * 37) + this.client_name.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_link_id=" + Internal.sanitize(this.account_link_id));
        arrayList.add("redirect_uri=" + Internal.sanitize(this.redirect_uri));
        arrayList.add("link_customization_name=" + Internal.sanitize(this.link_customization_name));
        arrayList.add("android_package_name=" + Internal.sanitize(this.android_package_name));
        arrayList.add("institution_id=" + Internal.sanitize(this.institution_id));
        arrayList.add("investment_account_type=" + Internal.sanitize(this.investment_account_type));
        arrayList.add("client_name=" + Internal.sanitize(this.client_name));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlaidPrepareLinkDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PlaidPrepareLinkDetails copy$default(PlaidPrepareLinkDetails plaidPrepareLinkDetails, String str, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plaidPrepareLinkDetails.account_link_id;
        }
        if ((i & 2) != 0) {
            str2 = plaidPrepareLinkDetails.redirect_uri;
        }
        if ((i & 4) != 0) {
            str3 = plaidPrepareLinkDetails.link_customization_name;
        }
        if ((i & 8) != 0) {
            str4 = plaidPrepareLinkDetails.android_package_name;
        }
        if ((i & 16) != 0) {
            str5 = plaidPrepareLinkDetails.institution_id;
        }
        if ((i & 32) != 0) {
            str6 = plaidPrepareLinkDetails.investment_account_type;
        }
        if ((i & 64) != 0) {
            str7 = plaidPrepareLinkDetails.client_name;
        }
        if ((i & 128) != 0) {
            byteString = plaidPrepareLinkDetails.unknownFields();
        }
        String str8 = str7;
        ByteString byteString2 = byteString;
        String str9 = str5;
        String str10 = str6;
        return plaidPrepareLinkDetails.copy(str, str2, str3, str4, str9, str10, str8, byteString2);
    }

    public final PlaidPrepareLinkDetails copy(String account_link_id, String redirect_uri, String link_customization_name, String android_package_name, String institution_id, String investment_account_type, String client_name, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_link_id, "account_link_id");
        Intrinsics.checkNotNullParameter(redirect_uri, "redirect_uri");
        Intrinsics.checkNotNullParameter(link_customization_name, "link_customization_name");
        Intrinsics.checkNotNullParameter(android_package_name, "android_package_name");
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(investment_account_type, "investment_account_type");
        Intrinsics.checkNotNullParameter(client_name, "client_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PlaidPrepareLinkDetails(account_link_id, redirect_uri, link_customization_name, android_package_name, institution_id, investment_account_type, client_name, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PlaidPrepareLinkDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PlaidPrepareLinkDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.PlaidPrepareLinkDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PlaidPrepareLinkDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_link_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_link_id());
                }
                if (!Intrinsics.areEqual(value.getRedirect_uri(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRedirect_uri());
                }
                if (!Intrinsics.areEqual(value.getLink_customization_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLink_customization_name());
                }
                if (!Intrinsics.areEqual(value.getAndroid_package_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAndroid_package_name());
                }
                if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getInstitution_id());
                }
                if (!Intrinsics.areEqual(value.getInvestment_account_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getInvestment_account_type());
                }
                return !Intrinsics.areEqual(value.getClient_name(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getClient_name()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PlaidPrepareLinkDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_link_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_link_id());
                }
                if (!Intrinsics.areEqual(value.getRedirect_uri(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRedirect_uri());
                }
                if (!Intrinsics.areEqual(value.getLink_customization_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLink_customization_name());
                }
                if (!Intrinsics.areEqual(value.getAndroid_package_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAndroid_package_name());
                }
                if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getInstitution_id());
                }
                if (!Intrinsics.areEqual(value.getInvestment_account_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getInvestment_account_type());
                }
                if (!Intrinsics.areEqual(value.getClient_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getClient_name());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PlaidPrepareLinkDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getClient_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getClient_name());
                }
                if (!Intrinsics.areEqual(value.getInvestment_account_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getInvestment_account_type());
                }
                if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getInstitution_id());
                }
                if (!Intrinsics.areEqual(value.getAndroid_package_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAndroid_package_name());
                }
                if (!Intrinsics.areEqual(value.getLink_customization_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLink_customization_name());
                }
                if (!Intrinsics.areEqual(value.getRedirect_uri(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRedirect_uri());
                }
                if (Intrinsics.areEqual(value.getAccount_link_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_link_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PlaidPrepareLinkDetails redact(PlaidPrepareLinkDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PlaidPrepareLinkDetails.copy$default(value, null, null, null, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PlaidPrepareLinkDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
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
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new PlaidPrepareLinkDetails(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
