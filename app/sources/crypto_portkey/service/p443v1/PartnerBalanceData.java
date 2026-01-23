package crypto_portkey.service.p443v1;

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

/* compiled from: PartnerBalanceData.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcrypto_portkey/service/v1/PartnerBalanceData;", "Lcom/squareup/wire/Message;", "", "partner_migration_code", "", "rh_migration_code", "assets", "", "Lcrypto_portkey/service/v1/PartnerAccountAssets;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getPartner_migration_code", "()Ljava/lang/String;", "getRh_migration_code", "getAssets", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class PartnerBalanceData extends Message {

    @JvmField
    public static final ProtoAdapter<PartnerBalanceData> ADAPTER;

    @WireField(adapter = "crypto_portkey.service.v1.PartnerAccountAssets#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<PartnerAccountAssets> assets;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String partner_migration_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String rh_migration_code;

    public PartnerBalanceData() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ PartnerBalanceData(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27915newBuilder();
    }

    public final String getPartner_migration_code() {
        return this.partner_migration_code;
    }

    public final String getRh_migration_code() {
        return this.rh_migration_code;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerBalanceData(String partner_migration_code, String rh_migration_code, List<PartnerAccountAssets> assets, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(partner_migration_code, "partner_migration_code");
        Intrinsics.checkNotNullParameter(rh_migration_code, "rh_migration_code");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.partner_migration_code = partner_migration_code;
        this.rh_migration_code = rh_migration_code;
        this.assets = Internal.immutableCopyOf("assets", assets);
    }

    public final List<PartnerAccountAssets> getAssets() {
        return this.assets;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27915newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PartnerBalanceData)) {
            return false;
        }
        PartnerBalanceData partnerBalanceData = (PartnerBalanceData) other;
        return Intrinsics.areEqual(unknownFields(), partnerBalanceData.unknownFields()) && Intrinsics.areEqual(this.partner_migration_code, partnerBalanceData.partner_migration_code) && Intrinsics.areEqual(this.rh_migration_code, partnerBalanceData.rh_migration_code) && Intrinsics.areEqual(this.assets, partnerBalanceData.assets);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.partner_migration_code.hashCode()) * 37) + this.rh_migration_code.hashCode()) * 37) + this.assets.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("partner_migration_code=" + Internal.sanitize(this.partner_migration_code));
        arrayList.add("rh_migration_code=" + Internal.sanitize(this.rh_migration_code));
        if (!this.assets.isEmpty()) {
            arrayList.add("assets=" + this.assets);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PartnerBalanceData{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PartnerBalanceData copy$default(PartnerBalanceData partnerBalanceData, String str, String str2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partnerBalanceData.partner_migration_code;
        }
        if ((i & 2) != 0) {
            str2 = partnerBalanceData.rh_migration_code;
        }
        if ((i & 4) != 0) {
            list = partnerBalanceData.assets;
        }
        if ((i & 8) != 0) {
            byteString = partnerBalanceData.unknownFields();
        }
        return partnerBalanceData.copy(str, str2, list, byteString);
    }

    public final PartnerBalanceData copy(String partner_migration_code, String rh_migration_code, List<PartnerAccountAssets> assets, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(partner_migration_code, "partner_migration_code");
        Intrinsics.checkNotNullParameter(rh_migration_code, "rh_migration_code");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PartnerBalanceData(partner_migration_code, rh_migration_code, assets, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PartnerBalanceData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PartnerBalanceData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_portkey.service.v1.PartnerBalanceData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PartnerBalanceData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPartner_migration_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPartner_migration_code());
                }
                if (!Intrinsics.areEqual(value.getRh_migration_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRh_migration_code());
                }
                return size + PartnerAccountAssets.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getAssets());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PartnerBalanceData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPartner_migration_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPartner_migration_code());
                }
                if (!Intrinsics.areEqual(value.getRh_migration_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRh_migration_code());
                }
                PartnerAccountAssets.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAssets());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PartnerBalanceData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PartnerAccountAssets.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAssets());
                if (!Intrinsics.areEqual(value.getRh_migration_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRh_migration_code());
                }
                if (Intrinsics.areEqual(value.getPartner_migration_code(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPartner_migration_code());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PartnerBalanceData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PartnerBalanceData(strDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(PartnerAccountAssets.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PartnerBalanceData redact(PartnerBalanceData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PartnerBalanceData.copy$default(value, null, null, Internal.m26823redactElements(value.getAssets(), PartnerAccountAssets.ADAPTER), ByteString.EMPTY, 3, null);
            }
        };
    }
}
