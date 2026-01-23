package helios.service.advancedorder.p467v1;

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
import p479j$.time.Instant;

/* compiled from: AdvancedOrderLink.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,Bi\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJo\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\"\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b$\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b%\u0010\u001dR\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b&\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b\u000b\u0010(R\"\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, m3636d2 = {"Lhelios/service/advancedorder/v1/AdvancedOrderLink;", "Lcom/squareup/wire/Message;", "", "", "id", "root_advanced_order_id", "parent_advanced_order_id", "order_id", "fx_order_id", "advanced_order_id", "", "is_primary", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLj$/time/Instant;Lokio/ByteString;)Lhelios/service/advancedorder/v1/AdvancedOrderLink;", "Ljava/lang/String;", "getId", "getRoot_advanced_order_id", "getParent_advanced_order_id", "getOrder_id", "getFx_order_id", "getAdvanced_order_id", "Z", "()Z", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "Companion", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class AdvancedOrderLink extends Message {

    @JvmField
    public static final ProtoAdapter<AdvancedOrderLink> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "advancedOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String advanced_order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Instant created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fxOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String fx_order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPrimary", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final boolean is_primary;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "parentAdvancedOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String parent_advanced_order_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rootAdvancedOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String root_advanced_order_id;

    public AdvancedOrderLink() {
        this(null, null, null, null, null, null, false, null, null, 511, null);
    }

    public /* synthetic */ AdvancedOrderLink(String str, String str2, String str3, String str4, String str5, String str6, boolean z, Instant instant, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : instant, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28226newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getRoot_advanced_order_id() {
        return this.root_advanced_order_id;
    }

    public final String getParent_advanced_order_id() {
        return this.parent_advanced_order_id;
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public final String getFx_order_id() {
        return this.fx_order_id;
    }

    public final String getAdvanced_order_id() {
        return this.advanced_order_id;
    }

    /* renamed from: is_primary, reason: from getter */
    public final boolean getIs_primary() {
        return this.is_primary;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedOrderLink(String id, String root_advanced_order_id, String parent_advanced_order_id, String order_id, String fx_order_id, String advanced_order_id, boolean z, Instant instant, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(root_advanced_order_id, "root_advanced_order_id");
        Intrinsics.checkNotNullParameter(parent_advanced_order_id, "parent_advanced_order_id");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(fx_order_id, "fx_order_id");
        Intrinsics.checkNotNullParameter(advanced_order_id, "advanced_order_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.root_advanced_order_id = root_advanced_order_id;
        this.parent_advanced_order_id = parent_advanced_order_id;
        this.order_id = order_id;
        this.fx_order_id = fx_order_id;
        this.advanced_order_id = advanced_order_id;
        this.is_primary = z;
        this.created_at = instant;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28226newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvancedOrderLink)) {
            return false;
        }
        AdvancedOrderLink advancedOrderLink = (AdvancedOrderLink) other;
        return Intrinsics.areEqual(unknownFields(), advancedOrderLink.unknownFields()) && Intrinsics.areEqual(this.id, advancedOrderLink.id) && Intrinsics.areEqual(this.root_advanced_order_id, advancedOrderLink.root_advanced_order_id) && Intrinsics.areEqual(this.parent_advanced_order_id, advancedOrderLink.parent_advanced_order_id) && Intrinsics.areEqual(this.order_id, advancedOrderLink.order_id) && Intrinsics.areEqual(this.fx_order_id, advancedOrderLink.fx_order_id) && Intrinsics.areEqual(this.advanced_order_id, advancedOrderLink.advanced_order_id) && this.is_primary == advancedOrderLink.is_primary && Intrinsics.areEqual(this.created_at, advancedOrderLink.created_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.root_advanced_order_id.hashCode()) * 37) + this.parent_advanced_order_id.hashCode()) * 37) + this.order_id.hashCode()) * 37) + this.fx_order_id.hashCode()) * 37) + this.advanced_order_id.hashCode()) * 37) + Boolean.hashCode(this.is_primary)) * 37;
        Instant instant = this.created_at;
        int iHashCode2 = iHashCode + (instant != null ? instant.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("root_advanced_order_id=" + Internal.sanitize(this.root_advanced_order_id));
        arrayList.add("parent_advanced_order_id=" + Internal.sanitize(this.parent_advanced_order_id));
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("fx_order_id=" + Internal.sanitize(this.fx_order_id));
        arrayList.add("advanced_order_id=" + Internal.sanitize(this.advanced_order_id));
        arrayList.add("is_primary=" + this.is_primary);
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvancedOrderLink{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvancedOrderLink copy$default(AdvancedOrderLink advancedOrderLink, String str, String str2, String str3, String str4, String str5, String str6, boolean z, Instant instant, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advancedOrderLink.id;
        }
        if ((i & 2) != 0) {
            str2 = advancedOrderLink.root_advanced_order_id;
        }
        if ((i & 4) != 0) {
            str3 = advancedOrderLink.parent_advanced_order_id;
        }
        if ((i & 8) != 0) {
            str4 = advancedOrderLink.order_id;
        }
        if ((i & 16) != 0) {
            str5 = advancedOrderLink.fx_order_id;
        }
        if ((i & 32) != 0) {
            str6 = advancedOrderLink.advanced_order_id;
        }
        if ((i & 64) != 0) {
            z = advancedOrderLink.is_primary;
        }
        if ((i & 128) != 0) {
            instant = advancedOrderLink.created_at;
        }
        if ((i & 256) != 0) {
            byteString = advancedOrderLink.unknownFields();
        }
        Instant instant2 = instant;
        ByteString byteString2 = byteString;
        String str7 = str6;
        boolean z2 = z;
        String str8 = str5;
        String str9 = str3;
        return advancedOrderLink.copy(str, str2, str9, str4, str8, str7, z2, instant2, byteString2);
    }

    public final AdvancedOrderLink copy(String id, String root_advanced_order_id, String parent_advanced_order_id, String order_id, String fx_order_id, String advanced_order_id, boolean is_primary, Instant created_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(root_advanced_order_id, "root_advanced_order_id");
        Intrinsics.checkNotNullParameter(parent_advanced_order_id, "parent_advanced_order_id");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(fx_order_id, "fx_order_id");
        Intrinsics.checkNotNullParameter(advanced_order_id, "advanced_order_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvancedOrderLink(id, root_advanced_order_id, parent_advanced_order_id, order_id, fx_order_id, advanced_order_id, is_primary, created_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvancedOrderLink.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvancedOrderLink>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: helios.service.advancedorder.v1.AdvancedOrderLink$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvancedOrderLink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getRoot_advanced_order_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRoot_advanced_order_id());
                }
                if (!Intrinsics.areEqual(value.getParent_advanced_order_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getParent_advanced_order_id());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getFx_order_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getFx_order_id());
                }
                if (!Intrinsics.areEqual(value.getAdvanced_order_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getAdvanced_order_id());
                }
                if (value.getIs_primary()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getIs_primary()));
                }
                return value.getCreated_at() != null ? size + ProtoAdapter.INSTANT.encodedSizeWithTag(8, value.getCreated_at()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvancedOrderLink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getRoot_advanced_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRoot_advanced_order_id());
                }
                if (!Intrinsics.areEqual(value.getParent_advanced_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getParent_advanced_order_id());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getFx_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getFx_order_id());
                }
                if (!Intrinsics.areEqual(value.getAdvanced_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAdvanced_order_id());
                }
                if (value.getIs_primary()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getIs_primary()));
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getCreated_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvancedOrderLink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getCreated_at());
                }
                if (value.getIs_primary()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getIs_primary()));
                }
                if (!Intrinsics.areEqual(value.getAdvanced_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getAdvanced_order_id());
                }
                if (!Intrinsics.areEqual(value.getFx_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getFx_order_id());
                }
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOrder_id());
                }
                if (!Intrinsics.areEqual(value.getParent_advanced_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getParent_advanced_order_id());
                }
                if (!Intrinsics.areEqual(value.getRoot_advanced_order_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRoot_advanced_order_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvancedOrderLink redact(AdvancedOrderLink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant created_at = value.getCreated_at();
                return AdvancedOrderLink.copy$default(value, null, null, null, null, null, null, false, created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvancedOrderLink decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                boolean zBooleanValue = false;
                Instant instantDecode = null;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 8:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AdvancedOrderLink(strDecode, strDecode5, strDecode6, strDecode2, strDecode3, strDecode4, zBooleanValue, instantDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
