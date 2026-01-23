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

/* compiled from: PartnerFiatAsset.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J>\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m3636d2 = {"Lcrypto_portkey/service/v1/PartnerFiatAsset;", "Lcom/squareup/wire/Message;", "", "asset_symbol", "", "asset_name", "balance", "", "Lcrypto_portkey/service/v1/PartnerAssetBalance;", "is_supported", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLokio/ByteString;)V", "getAsset_symbol", "()Ljava/lang/String;", "getAsset_name", "()Z", "getBalance", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class PartnerFiatAsset extends Message {

    @JvmField
    public static final ProtoAdapter<PartnerFiatAsset> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String asset_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String asset_symbol;

    @WireField(adapter = "crypto_portkey.service.v1.PartnerAssetBalance#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<PartnerAssetBalance> balance;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_supported;

    public PartnerFiatAsset() {
        this(null, null, null, false, null, 31, null);
    }

    public /* synthetic */ PartnerFiatAsset(String str, String str2, List list, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? false : z, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27917newBuilder();
    }

    public final String getAsset_symbol() {
        return this.asset_symbol;
    }

    public final String getAsset_name() {
        return this.asset_name;
    }

    /* renamed from: is_supported, reason: from getter */
    public final boolean getIs_supported() {
        return this.is_supported;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerFiatAsset(String asset_symbol, String asset_name, List<PartnerAssetBalance> balance, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(asset_symbol, "asset_symbol");
        Intrinsics.checkNotNullParameter(asset_name, "asset_name");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.asset_symbol = asset_symbol;
        this.asset_name = asset_name;
        this.is_supported = z;
        this.balance = Internal.immutableCopyOf("balance", balance);
    }

    public final List<PartnerAssetBalance> getBalance() {
        return this.balance;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27917newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PartnerFiatAsset)) {
            return false;
        }
        PartnerFiatAsset partnerFiatAsset = (PartnerFiatAsset) other;
        return Intrinsics.areEqual(unknownFields(), partnerFiatAsset.unknownFields()) && Intrinsics.areEqual(this.asset_symbol, partnerFiatAsset.asset_symbol) && Intrinsics.areEqual(this.asset_name, partnerFiatAsset.asset_name) && Intrinsics.areEqual(this.balance, partnerFiatAsset.balance) && this.is_supported == partnerFiatAsset.is_supported;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.asset_symbol.hashCode()) * 37) + this.asset_name.hashCode()) * 37) + this.balance.hashCode()) * 37) + Boolean.hashCode(this.is_supported);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("asset_symbol=" + Internal.sanitize(this.asset_symbol));
        arrayList.add("asset_name=" + Internal.sanitize(this.asset_name));
        if (!this.balance.isEmpty()) {
            arrayList.add("balance=" + this.balance);
        }
        arrayList.add("is_supported=" + this.is_supported);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PartnerFiatAsset{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PartnerFiatAsset copy$default(PartnerFiatAsset partnerFiatAsset, String str, String str2, List list, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partnerFiatAsset.asset_symbol;
        }
        if ((i & 2) != 0) {
            str2 = partnerFiatAsset.asset_name;
        }
        if ((i & 4) != 0) {
            list = partnerFiatAsset.balance;
        }
        if ((i & 8) != 0) {
            z = partnerFiatAsset.is_supported;
        }
        if ((i & 16) != 0) {
            byteString = partnerFiatAsset.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list2 = list;
        return partnerFiatAsset.copy(str, str2, list2, z, byteString2);
    }

    public final PartnerFiatAsset copy(String asset_symbol, String asset_name, List<PartnerAssetBalance> balance, boolean is_supported, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(asset_symbol, "asset_symbol");
        Intrinsics.checkNotNullParameter(asset_name, "asset_name");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PartnerFiatAsset(asset_symbol, asset_name, balance, is_supported, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PartnerFiatAsset.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PartnerFiatAsset>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_portkey.service.v1.PartnerFiatAsset$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PartnerFiatAsset value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAsset_symbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAsset_symbol());
                }
                if (!Intrinsics.areEqual(value.getAsset_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAsset_name());
                }
                int iEncodedSizeWithTag = size + PartnerAssetBalance.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getBalance());
                return value.getIs_supported() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_supported())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PartnerFiatAsset value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAsset_symbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsset_symbol());
                }
                if (!Intrinsics.areEqual(value.getAsset_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsset_name());
                }
                PartnerAssetBalance.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getBalance());
                if (value.getIs_supported()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_supported()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PartnerFiatAsset value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_supported()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_supported()));
                }
                PartnerAssetBalance.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getBalance());
                if (!Intrinsics.areEqual(value.getAsset_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAsset_name());
                }
                if (Intrinsics.areEqual(value.getAsset_symbol(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsset_symbol());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PartnerFiatAsset decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PartnerFiatAsset(strDecode, strDecode2, arrayList, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(PartnerAssetBalance.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PartnerFiatAsset redact(PartnerFiatAsset value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PartnerFiatAsset.copy$default(value, null, null, Internal.m26823redactElements(value.getBalance(), PartnerAssetBalance.ADAPTER), false, ByteString.EMPTY, 11, null);
            }
        };
    }
}
