package crypto.fee_tier.proto.p434v1;

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

/* compiled from: FeeTier.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTier;", "Lcom/squareup/wire/Message;", "", "tier_id", "", "fee_ratio", "max_volume", "min_volume", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTier_id", "()Ljava/lang/String;", "getFee_ratio", "getMax_volume", "getMin_volume", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class FeeTier extends Message {

    @JvmField
    public static final ProtoAdapter<FeeTier> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feeRatio", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String fee_ratio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maxVolume", schemaIndex = 2, tag = 3)
    private final String max_volume;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minVolume", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String min_volume;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tierId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String tier_id;

    public FeeTier() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ FeeTier(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27780newBuilder();
    }

    public final String getTier_id() {
        return this.tier_id;
    }

    public final String getFee_ratio() {
        return this.fee_ratio;
    }

    public final String getMax_volume() {
        return this.max_volume;
    }

    public final String getMin_volume() {
        return this.min_volume;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeeTier(String tier_id, String fee_ratio, String str, String min_volume, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(tier_id, "tier_id");
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(min_volume, "min_volume");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.tier_id = tier_id;
        this.fee_ratio = fee_ratio;
        this.max_volume = str;
        this.min_volume = min_volume;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27780newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FeeTier)) {
            return false;
        }
        FeeTier feeTier = (FeeTier) other;
        return Intrinsics.areEqual(unknownFields(), feeTier.unknownFields()) && Intrinsics.areEqual(this.tier_id, feeTier.tier_id) && Intrinsics.areEqual(this.fee_ratio, feeTier.fee_ratio) && Intrinsics.areEqual(this.max_volume, feeTier.max_volume) && Intrinsics.areEqual(this.min_volume, feeTier.min_volume);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.tier_id.hashCode()) * 37) + this.fee_ratio.hashCode()) * 37;
        String str = this.max_volume;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.min_volume.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("tier_id=" + Internal.sanitize(this.tier_id));
        arrayList.add("fee_ratio=" + Internal.sanitize(this.fee_ratio));
        String str = this.max_volume;
        if (str != null) {
            arrayList.add("max_volume=" + Internal.sanitize(str));
        }
        arrayList.add("min_volume=" + Internal.sanitize(this.min_volume));
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeeTier{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FeeTier copy$default(FeeTier feeTier, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feeTier.tier_id;
        }
        if ((i & 2) != 0) {
            str2 = feeTier.fee_ratio;
        }
        if ((i & 4) != 0) {
            str3 = feeTier.max_volume;
        }
        if ((i & 8) != 0) {
            str4 = feeTier.min_volume;
        }
        if ((i & 16) != 0) {
            byteString = feeTier.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return feeTier.copy(str, str2, str5, str4, byteString2);
    }

    public final FeeTier copy(String tier_id, String fee_ratio, String max_volume, String min_volume, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(tier_id, "tier_id");
        Intrinsics.checkNotNullParameter(fee_ratio, "fee_ratio");
        Intrinsics.checkNotNullParameter(min_volume, "min_volume");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FeeTier(tier_id, fee_ratio, max_volume, min_volume, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeeTier.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FeeTier>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto.fee_tier.proto.v1.FeeTier$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FeeTier value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTier_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTier_id());
                }
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFee_ratio());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getMax_volume());
                return !Intrinsics.areEqual(value.getMin_volume(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getMin_volume()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FeeTier value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTier_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTier_id());
                }
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFee_ratio());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getMax_volume());
                if (!Intrinsics.areEqual(value.getMin_volume(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getMin_volume());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FeeTier value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMin_volume(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMin_volume());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getMax_volume());
                if (!Intrinsics.areEqual(value.getFee_ratio(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getFee_ratio());
                }
                if (Intrinsics.areEqual(value.getTier_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getTier_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FeeTier redact(FeeTier value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FeeTier.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FeeTier decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = null;
                String strDecode4 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FeeTier(strDecode, strDecode4, strDecode3, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
