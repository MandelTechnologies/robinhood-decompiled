package crypto_portkey.service.p443v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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

/* compiled from: PartnerAccountAssets.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcrypto_portkey/service/v1/PartnerAccountAssets;", "Lcom/squareup/wire/Message;", "", "partner_account_id", "", "partner_account_type", AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO, "", "Lcrypto_portkey/service/v1/PartnerCryptoAsset;", "fiat", "Lcrypto_portkey/service/v1/PartnerFiatAsset;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getPartner_account_id", "()Ljava/lang/String;", "getPartner_account_type", "getCrypto", "()Ljava/util/List;", "getFiat", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class PartnerAccountAssets extends Message {

    @JvmField
    public static final ProtoAdapter<PartnerAccountAssets> ADAPTER;

    @WireField(adapter = "crypto_portkey.service.v1.PartnerCryptoAsset#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<PartnerCryptoAsset> crypto;

    @WireField(adapter = "crypto_portkey.service.v1.PartnerFiatAsset#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<PartnerFiatAsset> fiat;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String partner_account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String partner_account_type;

    public PartnerAccountAssets() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ PartnerAccountAssets(String str, String str2, List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27911newBuilder();
    }

    public final String getPartner_account_id() {
        return this.partner_account_id;
    }

    public final String getPartner_account_type() {
        return this.partner_account_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerAccountAssets(String partner_account_id, String partner_account_type, List<PartnerCryptoAsset> crypto2, List<PartnerFiatAsset> fiat, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(partner_account_id, "partner_account_id");
        Intrinsics.checkNotNullParameter(partner_account_type, "partner_account_type");
        Intrinsics.checkNotNullParameter(crypto2, "crypto");
        Intrinsics.checkNotNullParameter(fiat, "fiat");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.partner_account_id = partner_account_id;
        this.partner_account_type = partner_account_type;
        this.crypto = Internal.immutableCopyOf(AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO, crypto2);
        this.fiat = Internal.immutableCopyOf("fiat", fiat);
    }

    public final List<PartnerCryptoAsset> getCrypto() {
        return this.crypto;
    }

    public final List<PartnerFiatAsset> getFiat() {
        return this.fiat;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27911newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PartnerAccountAssets)) {
            return false;
        }
        PartnerAccountAssets partnerAccountAssets = (PartnerAccountAssets) other;
        return Intrinsics.areEqual(unknownFields(), partnerAccountAssets.unknownFields()) && Intrinsics.areEqual(this.partner_account_id, partnerAccountAssets.partner_account_id) && Intrinsics.areEqual(this.partner_account_type, partnerAccountAssets.partner_account_type) && Intrinsics.areEqual(this.crypto, partnerAccountAssets.crypto) && Intrinsics.areEqual(this.fiat, partnerAccountAssets.fiat);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.partner_account_id.hashCode()) * 37) + this.partner_account_type.hashCode()) * 37) + this.crypto.hashCode()) * 37) + this.fiat.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("partner_account_id=" + Internal.sanitize(this.partner_account_id));
        arrayList.add("partner_account_type=" + Internal.sanitize(this.partner_account_type));
        if (!this.crypto.isEmpty()) {
            arrayList.add("crypto=" + this.crypto);
        }
        if (!this.fiat.isEmpty()) {
            arrayList.add("fiat=" + this.fiat);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PartnerAccountAssets{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PartnerAccountAssets copy$default(PartnerAccountAssets partnerAccountAssets, String str, String str2, List list, List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partnerAccountAssets.partner_account_id;
        }
        if ((i & 2) != 0) {
            str2 = partnerAccountAssets.partner_account_type;
        }
        if ((i & 4) != 0) {
            list = partnerAccountAssets.crypto;
        }
        if ((i & 8) != 0) {
            list2 = partnerAccountAssets.fiat;
        }
        if ((i & 16) != 0) {
            byteString = partnerAccountAssets.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list3 = list;
        return partnerAccountAssets.copy(str, str2, list3, list2, byteString2);
    }

    public final PartnerAccountAssets copy(String partner_account_id, String partner_account_type, List<PartnerCryptoAsset> crypto2, List<PartnerFiatAsset> fiat, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(partner_account_id, "partner_account_id");
        Intrinsics.checkNotNullParameter(partner_account_type, "partner_account_type");
        Intrinsics.checkNotNullParameter(crypto2, "crypto");
        Intrinsics.checkNotNullParameter(fiat, "fiat");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PartnerAccountAssets(partner_account_id, partner_account_type, crypto2, fiat, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PartnerAccountAssets.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PartnerAccountAssets>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_portkey.service.v1.PartnerAccountAssets$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PartnerAccountAssets value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPartner_account_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPartner_account_id());
                }
                if (!Intrinsics.areEqual(value.getPartner_account_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPartner_account_type());
                }
                return size + PartnerCryptoAsset.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getCrypto()) + PartnerFiatAsset.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getFiat());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PartnerAccountAssets value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPartner_account_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPartner_account_id());
                }
                if (!Intrinsics.areEqual(value.getPartner_account_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPartner_account_type());
                }
                PartnerCryptoAsset.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getCrypto());
                PartnerFiatAsset.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getFiat());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PartnerAccountAssets value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PartnerFiatAsset.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getFiat());
                PartnerCryptoAsset.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getCrypto());
                if (!Intrinsics.areEqual(value.getPartner_account_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPartner_account_type());
                }
                if (Intrinsics.areEqual(value.getPartner_account_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPartner_account_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PartnerAccountAssets decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PartnerAccountAssets(strDecode, strDecode2, arrayList, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(PartnerCryptoAsset.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        arrayList2.add(PartnerFiatAsset.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PartnerAccountAssets redact(PartnerAccountAssets value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PartnerAccountAssets.copy$default(value, null, null, Internal.m26823redactElements(value.getCrypto(), PartnerCryptoAsset.ADAPTER), Internal.m26823redactElements(value.getFiat(), PartnerFiatAsset.ADAPTER), ByteString.EMPTY, 3, null);
            }
        };
    }
}
