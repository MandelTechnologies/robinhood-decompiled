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

/* compiled from: GetManagedPortfolioRestrictedStocksResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020\fH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016JR\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006#"}, m3636d2 = {"Ladvisory/proto/v1/GetManagedPortfolioRestrictedStocksResponse;", "Lcom/squareup/wire/Message;", "", "account_number", "", "restricted_assets", "", "Ladvisory/proto/v1/RestrictedAsset;", "disclosure_subtitle", "disclosure_cta_text", "disclosure_title", "max_restricted_assets_allowed", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getDisclosure_subtitle", "getDisclosure_cta_text", "getDisclosure_title", "getMax_restricted_assets_allowed", "()I", "getRestricted_assets", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetManagedPortfolioRestrictedStocksResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetManagedPortfolioRestrictedStocksResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureCtaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String disclosure_cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureSubtitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String disclosure_subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "disclosureTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String disclosure_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "maxRestrictedAssetsAllowed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int max_restricted_assets_allowed;

    @WireField(adapter = "advisory.proto.v1.RestrictedAsset#ADAPTER", jsonName = "restrictedAssets", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<RestrictedAsset> restricted_assets;

    public GetManagedPortfolioRestrictedStocksResponse() {
        this(null, null, null, null, null, 0, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ GetManagedPortfolioRestrictedStocksResponse(String str, List list, String str2, String str3, String str4, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4460newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getDisclosure_subtitle() {
        return this.disclosure_subtitle;
    }

    public final String getDisclosure_cta_text() {
        return this.disclosure_cta_text;
    }

    public final String getDisclosure_title() {
        return this.disclosure_title;
    }

    public final int getMax_restricted_assets_allowed() {
        return this.max_restricted_assets_allowed;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetManagedPortfolioRestrictedStocksResponse(String account_number, List<RestrictedAsset> restricted_assets, String disclosure_subtitle, String disclosure_cta_text, String disclosure_title, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(restricted_assets, "restricted_assets");
        Intrinsics.checkNotNullParameter(disclosure_subtitle, "disclosure_subtitle");
        Intrinsics.checkNotNullParameter(disclosure_cta_text, "disclosure_cta_text");
        Intrinsics.checkNotNullParameter(disclosure_title, "disclosure_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.disclosure_subtitle = disclosure_subtitle;
        this.disclosure_cta_text = disclosure_cta_text;
        this.disclosure_title = disclosure_title;
        this.max_restricted_assets_allowed = i;
        this.restricted_assets = Internal.immutableCopyOf("restricted_assets", restricted_assets);
    }

    public final List<RestrictedAsset> getRestricted_assets() {
        return this.restricted_assets;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4460newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetManagedPortfolioRestrictedStocksResponse)) {
            return false;
        }
        GetManagedPortfolioRestrictedStocksResponse getManagedPortfolioRestrictedStocksResponse = (GetManagedPortfolioRestrictedStocksResponse) other;
        return Intrinsics.areEqual(unknownFields(), getManagedPortfolioRestrictedStocksResponse.unknownFields()) && Intrinsics.areEqual(this.account_number, getManagedPortfolioRestrictedStocksResponse.account_number) && Intrinsics.areEqual(this.restricted_assets, getManagedPortfolioRestrictedStocksResponse.restricted_assets) && Intrinsics.areEqual(this.disclosure_subtitle, getManagedPortfolioRestrictedStocksResponse.disclosure_subtitle) && Intrinsics.areEqual(this.disclosure_cta_text, getManagedPortfolioRestrictedStocksResponse.disclosure_cta_text) && Intrinsics.areEqual(this.disclosure_title, getManagedPortfolioRestrictedStocksResponse.disclosure_title) && this.max_restricted_assets_allowed == getManagedPortfolioRestrictedStocksResponse.max_restricted_assets_allowed;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.restricted_assets.hashCode()) * 37) + this.disclosure_subtitle.hashCode()) * 37) + this.disclosure_cta_text.hashCode()) * 37) + this.disclosure_title.hashCode()) * 37) + Integer.hashCode(this.max_restricted_assets_allowed);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        if (!this.restricted_assets.isEmpty()) {
            arrayList.add("restricted_assets=" + this.restricted_assets);
        }
        arrayList.add("disclosure_subtitle=" + Internal.sanitize(this.disclosure_subtitle));
        arrayList.add("disclosure_cta_text=" + Internal.sanitize(this.disclosure_cta_text));
        arrayList.add("disclosure_title=" + Internal.sanitize(this.disclosure_title));
        arrayList.add("max_restricted_assets_allowed=" + this.max_restricted_assets_allowed);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetManagedPortfolioRestrictedStocksResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetManagedPortfolioRestrictedStocksResponse copy$default(GetManagedPortfolioRestrictedStocksResponse getManagedPortfolioRestrictedStocksResponse, String str, List list, String str2, String str3, String str4, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getManagedPortfolioRestrictedStocksResponse.account_number;
        }
        if ((i2 & 2) != 0) {
            list = getManagedPortfolioRestrictedStocksResponse.restricted_assets;
        }
        if ((i2 & 4) != 0) {
            str2 = getManagedPortfolioRestrictedStocksResponse.disclosure_subtitle;
        }
        if ((i2 & 8) != 0) {
            str3 = getManagedPortfolioRestrictedStocksResponse.disclosure_cta_text;
        }
        if ((i2 & 16) != 0) {
            str4 = getManagedPortfolioRestrictedStocksResponse.disclosure_title;
        }
        if ((i2 & 32) != 0) {
            i = getManagedPortfolioRestrictedStocksResponse.max_restricted_assets_allowed;
        }
        if ((i2 & 64) != 0) {
            byteString = getManagedPortfolioRestrictedStocksResponse.unknownFields();
        }
        int i3 = i;
        ByteString byteString2 = byteString;
        String str5 = str4;
        String str6 = str2;
        return getManagedPortfolioRestrictedStocksResponse.copy(str, list, str6, str3, str5, i3, byteString2);
    }

    public final GetManagedPortfolioRestrictedStocksResponse copy(String account_number, List<RestrictedAsset> restricted_assets, String disclosure_subtitle, String disclosure_cta_text, String disclosure_title, int max_restricted_assets_allowed, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(restricted_assets, "restricted_assets");
        Intrinsics.checkNotNullParameter(disclosure_subtitle, "disclosure_subtitle");
        Intrinsics.checkNotNullParameter(disclosure_cta_text, "disclosure_cta_text");
        Intrinsics.checkNotNullParameter(disclosure_title, "disclosure_title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetManagedPortfolioRestrictedStocksResponse(account_number, restricted_assets, disclosure_subtitle, disclosure_cta_text, disclosure_title, max_restricted_assets_allowed, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetManagedPortfolioRestrictedStocksResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetManagedPortfolioRestrictedStocksResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.GetManagedPortfolioRestrictedStocksResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetManagedPortfolioRestrictedStocksResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                int iEncodedSizeWithTag = size + RestrictedAsset.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getRestricted_assets());
                if (!Intrinsics.areEqual(value.getDisclosure_subtitle(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDisclosure_subtitle());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_cta_text(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDisclosure_cta_text());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_title(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDisclosure_title());
                }
                return value.getMax_restricted_assets_allowed() != 0 ? iEncodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getMax_restricted_assets_allowed())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetManagedPortfolioRestrictedStocksResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                RestrictedAsset.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getRestricted_assets());
                if (!Intrinsics.areEqual(value.getDisclosure_subtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDisclosure_subtitle());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisclosure_cta_text());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisclosure_title());
                }
                if (value.getMax_restricted_assets_allowed() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getMax_restricted_assets_allowed()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetManagedPortfolioRestrictedStocksResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getMax_restricted_assets_allowed() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getMax_restricted_assets_allowed()));
                }
                if (!Intrinsics.areEqual(value.getDisclosure_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisclosure_title());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_cta_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDisclosure_cta_text());
                }
                if (!Intrinsics.areEqual(value.getDisclosure_subtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDisclosure_subtitle());
                }
                RestrictedAsset.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getRestricted_assets());
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetManagedPortfolioRestrictedStocksResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                int iIntValue = 0;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                arrayList.add(RestrictedAsset.ADAPTER.decode(reader));
                                break;
                            case 3:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetManagedPortfolioRestrictedStocksResponse(strDecode, arrayList, strDecode4, strDecode2, strDecode3, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetManagedPortfolioRestrictedStocksResponse redact(GetManagedPortfolioRestrictedStocksResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetManagedPortfolioRestrictedStocksResponse.copy$default(value, null, Internal.m26823redactElements(value.getRestricted_assets(), RestrictedAsset.ADAPTER), null, null, null, 0, ByteString.EMPTY, 61, null);
            }
        };
    }
}
