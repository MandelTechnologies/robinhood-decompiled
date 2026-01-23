package helios.service.advancedorder.p467v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
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
import p479j$.time.Instant;

/* compiled from: GetAdvancedOrderResponse.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00017Bo\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!Ju\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010!R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b0\u0010/R\"\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106¨\u00068"}, m3636d2 = {"Lhelios/service/advancedorder/v1/GetAdvancedOrderResponse;", "Lcom/squareup/wire/Message;", "", "", "id", "", "account_id", "ref_id", "Lhelios/service/advancedorder/v1/ContingencyType;", "contingency_type", "", "proportional_triggering", "auto_send_enabled", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "", "Lhelios/service/advancedorder/v1/AdvancedOrderLink;", "advanced_order_links", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;JLjava/lang/String;Lhelios/service/advancedorder/v1/ContingencyType;ZZLj$/time/Instant;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;JLjava/lang/String;Lhelios/service/advancedorder/v1/ContingencyType;ZZLj$/time/Instant;Ljava/util/List;Lokio/ByteString;)Lhelios/service/advancedorder/v1/GetAdvancedOrderResponse;", "Ljava/lang/String;", "getId", "J", "getAccount_id", "()J", "getRef_id", "Lhelios/service/advancedorder/v1/ContingencyType;", "getContingency_type", "()Lhelios/service/advancedorder/v1/ContingencyType;", "Z", "getProportional_triggering", "()Z", "getAuto_send_enabled", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "Ljava/util/List;", "getAdvanced_order_links", "()Ljava/util/List;", "Companion", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GetAdvancedOrderResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAdvancedOrderResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long account_id;

    @WireField(adapter = "helios.service.advancedorder.v1.AdvancedOrderLink#ADAPTER", jsonName = "advancedOrderLinks", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    private final List<AdvancedOrderLink> advanced_order_links;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "autoSendEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean auto_send_enabled;

    @WireField(adapter = "helios.service.advancedorder.v1.ContingencyType#ADAPTER", jsonName = "contingencyType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ContingencyType contingency_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Instant created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "proportionalTriggering", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean proportional_triggering;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String ref_id;

    public GetAdvancedOrderResponse() {
        this(null, 0L, null, null, false, false, null, null, null, 511, null);
    }

    public /* synthetic */ GetAdvancedOrderResponse(String str, long j, String str2, ContingencyType contingencyType, boolean z, boolean z2, Instant instant, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ContingencyType.CONTINGENCY_TYPE_UNSPECIFIED : contingencyType, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : instant, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28227newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final long getAccount_id() {
        return this.account_id;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final ContingencyType getContingency_type() {
        return this.contingency_type;
    }

    public final boolean getProportional_triggering() {
        return this.proportional_triggering;
    }

    public final boolean getAuto_send_enabled() {
        return this.auto_send_enabled;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAdvancedOrderResponse(String id, long j, String ref_id, ContingencyType contingency_type, boolean z, boolean z2, Instant instant, List<AdvancedOrderLink> advanced_order_links, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(contingency_type, "contingency_type");
        Intrinsics.checkNotNullParameter(advanced_order_links, "advanced_order_links");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.account_id = j;
        this.ref_id = ref_id;
        this.contingency_type = contingency_type;
        this.proportional_triggering = z;
        this.auto_send_enabled = z2;
        this.created_at = instant;
        this.advanced_order_links = Internal.immutableCopyOf("advanced_order_links", advanced_order_links);
    }

    public final List<AdvancedOrderLink> getAdvanced_order_links() {
        return this.advanced_order_links;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28227newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAdvancedOrderResponse)) {
            return false;
        }
        GetAdvancedOrderResponse getAdvancedOrderResponse = (GetAdvancedOrderResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAdvancedOrderResponse.unknownFields()) && Intrinsics.areEqual(this.id, getAdvancedOrderResponse.id) && this.account_id == getAdvancedOrderResponse.account_id && Intrinsics.areEqual(this.ref_id, getAdvancedOrderResponse.ref_id) && this.contingency_type == getAdvancedOrderResponse.contingency_type && this.proportional_triggering == getAdvancedOrderResponse.proportional_triggering && this.auto_send_enabled == getAdvancedOrderResponse.auto_send_enabled && Intrinsics.areEqual(this.created_at, getAdvancedOrderResponse.created_at) && Intrinsics.areEqual(this.advanced_order_links, getAdvancedOrderResponse.advanced_order_links);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + Long.hashCode(this.account_id)) * 37) + this.ref_id.hashCode()) * 37) + this.contingency_type.hashCode()) * 37) + Boolean.hashCode(this.proportional_triggering)) * 37) + Boolean.hashCode(this.auto_send_enabled)) * 37;
        Instant instant = this.created_at;
        int iHashCode2 = ((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.advanced_order_links.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("account_id=" + this.account_id);
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        arrayList.add("contingency_type=" + this.contingency_type);
        arrayList.add("proportional_triggering=" + this.proportional_triggering);
        arrayList.add("auto_send_enabled=" + this.auto_send_enabled);
        Instant instant = this.created_at;
        if (instant != null) {
            arrayList.add("created_at=" + instant);
        }
        if (!this.advanced_order_links.isEmpty()) {
            arrayList.add("advanced_order_links=" + this.advanced_order_links);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAdvancedOrderResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAdvancedOrderResponse copy$default(GetAdvancedOrderResponse getAdvancedOrderResponse, String str, long j, String str2, ContingencyType contingencyType, boolean z, boolean z2, Instant instant, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAdvancedOrderResponse.id;
        }
        if ((i & 2) != 0) {
            j = getAdvancedOrderResponse.account_id;
        }
        if ((i & 4) != 0) {
            str2 = getAdvancedOrderResponse.ref_id;
        }
        if ((i & 8) != 0) {
            contingencyType = getAdvancedOrderResponse.contingency_type;
        }
        if ((i & 16) != 0) {
            z = getAdvancedOrderResponse.proportional_triggering;
        }
        if ((i & 32) != 0) {
            z2 = getAdvancedOrderResponse.auto_send_enabled;
        }
        if ((i & 64) != 0) {
            instant = getAdvancedOrderResponse.created_at;
        }
        if ((i & 128) != 0) {
            list = getAdvancedOrderResponse.advanced_order_links;
        }
        if ((i & 256) != 0) {
            byteString = getAdvancedOrderResponse.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        Instant instant2 = instant;
        boolean z3 = z;
        String str3 = str2;
        return getAdvancedOrderResponse.copy(str, j, str3, contingencyType, z3, z2, instant2, list2, byteString2);
    }

    public final GetAdvancedOrderResponse copy(String id, long account_id, String ref_id, ContingencyType contingency_type, boolean proportional_triggering, boolean auto_send_enabled, Instant created_at, List<AdvancedOrderLink> advanced_order_links, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(contingency_type, "contingency_type");
        Intrinsics.checkNotNullParameter(advanced_order_links, "advanced_order_links");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAdvancedOrderResponse(id, account_id, ref_id, contingency_type, proportional_triggering, auto_send_enabled, created_at, advanced_order_links, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAdvancedOrderResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAdvancedOrderResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: helios.service.advancedorder.v1.GetAdvancedOrderResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAdvancedOrderResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getAccount_id() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(2, Long.valueOf(value.getAccount_id()));
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRef_id());
                }
                if (value.getContingency_type() != ContingencyType.CONTINGENCY_TYPE_UNSPECIFIED) {
                    size += ContingencyType.ADAPTER.encodedSizeWithTag(4, value.getContingency_type());
                }
                if (value.getProportional_triggering()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getProportional_triggering()));
                }
                if (value.getAuto_send_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getAuto_send_enabled()));
                }
                if (value.getCreated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(7, value.getCreated_at());
                }
                return size + AdvancedOrderLink.ADAPTER.asRepeated().encodedSizeWithTag(8, value.getAdvanced_order_links());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAdvancedOrderResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getAccount_id() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getAccount_id()));
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRef_id());
                }
                if (value.getContingency_type() != ContingencyType.CONTINGENCY_TYPE_UNSPECIFIED) {
                    ContingencyType.ADAPTER.encodeWithTag(writer, 4, (int) value.getContingency_type());
                }
                if (value.getProportional_triggering()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getProportional_triggering()));
                }
                if (value.getAuto_send_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getAuto_send_enabled()));
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getCreated_at());
                }
                AdvancedOrderLink.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getAdvanced_order_links());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAdvancedOrderResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                AdvancedOrderLink.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getAdvanced_order_links());
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getCreated_at());
                }
                if (value.getAuto_send_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getAuto_send_enabled()));
                }
                if (value.getProportional_triggering()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getProportional_triggering()));
                }
                if (value.getContingency_type() != ContingencyType.CONTINGENCY_TYPE_UNSPECIFIED) {
                    ContingencyType.ADAPTER.encodeWithTag(writer, 4, (int) value.getContingency_type());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRef_id());
                }
                if (value.getAccount_id() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getAccount_id()));
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
                	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
                	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
                	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
                */
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0026. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public helios.service.advancedorder.p467v1.GetAdvancedOrderResponse decode(com.squareup.wire.ProtoReader r18) {
                /*
                    r17 = this;
                    r1 = r18
                    java.lang.String r0 = "reader"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                    helios.service.advancedorder.v1.ContingencyType r0 = helios.service.advancedorder.p467v1.ContingencyType.CONTINGENCY_TYPE_UNSPECIFIED
                    java.util.ArrayList r10 = new java.util.ArrayList
                    r10.<init>()
                    long r2 = r1.beginMessage()
                    java.lang.String r4 = ""
                    r5 = 0
                    r7 = 0
                    r8 = 0
                    r9 = r7
                    r11 = r9
                    r12 = r8
                    r7 = r5
                    r5 = r4
                    r6 = r5
                L1e:
                    r4 = r0
                L1f:
                    int r13 = r1.nextTag()
                    r0 = -1
                    if (r13 == r0) goto L9f
                    switch(r13) {
                        case 1: goto L95;
                        case 2: goto L84;
                        case 3: goto L79;
                        case 4: goto L5e;
                        case 5: goto L50;
                        case 6: goto L42;
                        case 7: goto L3a;
                        case 8: goto L30;
                        default: goto L29;
                    }
                L29:
                    r1.readUnknownField(r13)
                L2c:
                    r16 = r4
                    r15 = r5
                    goto L75
                L30:
                    com.squareup.wire.ProtoAdapter<helios.service.advancedorder.v1.AdvancedOrderLink> r0 = helios.service.advancedorder.p467v1.AdvancedOrderLink.ADAPTER
                    java.lang.Object r0 = r0.decode(r1)
                    r10.add(r0)
                    goto L2c
                L3a:
                    com.squareup.wire.ProtoAdapter<j$.time.Instant> r0 = com.squareup.wire.ProtoAdapter.INSTANT
                    java.lang.Object r0 = r0.decode(r1)
                    r12 = r0
                    goto L1f
                L42:
                    com.squareup.wire.ProtoAdapter<java.lang.Boolean> r0 = com.squareup.wire.ProtoAdapter.BOOL
                    java.lang.Object r0 = r0.decode(r1)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    r11 = r0
                    goto L1f
                L50:
                    com.squareup.wire.ProtoAdapter<java.lang.Boolean> r0 = com.squareup.wire.ProtoAdapter.BOOL
                    java.lang.Object r0 = r0.decode(r1)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    r9 = r0
                    goto L1f
                L5e:
                    com.squareup.wire.ProtoAdapter<helios.service.advancedorder.v1.ContingencyType> r0 = helios.service.advancedorder.p467v1.ContingencyType.ADAPTER     // Catch: com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException -> L65
                    java.lang.Object r0 = r0.decode(r1)     // Catch: com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException -> L65
                    goto L1e
                L65:
                    r0 = move-exception
                    com.squareup.wire.FieldEncoding r14 = com.squareup.wire.FieldEncoding.VARINT
                    int r0 = r0.value
                    r16 = r4
                    r15 = r5
                    long r4 = (long) r0
                    java.lang.Long r0 = java.lang.Long.valueOf(r4)
                    r1.addUnknownField(r13, r14, r0)
                L75:
                    r5 = r15
                    r4 = r16
                    goto L1f
                L79:
                    r16 = r4
                    r15 = r5
                    com.squareup.wire.ProtoAdapter<java.lang.String> r0 = com.squareup.wire.ProtoAdapter.STRING
                    java.lang.Object r0 = r0.decode(r1)
                    r6 = r0
                    goto L1f
                L84:
                    r16 = r4
                    r15 = r5
                    com.squareup.wire.ProtoAdapter<java.lang.Long> r0 = com.squareup.wire.ProtoAdapter.UINT64
                    java.lang.Object r0 = r0.decode(r1)
                    java.lang.Number r0 = (java.lang.Number) r0
                    long r4 = r0.longValue()
                    r7 = r4
                    goto L75
                L95:
                    r16 = r4
                    com.squareup.wire.ProtoAdapter<java.lang.String> r0 = com.squareup.wire.ProtoAdapter.STRING
                    java.lang.Object r0 = r0.decode(r1)
                    r5 = r0
                    goto L1f
                L9f:
                    r16 = r4
                    r15 = r5
                    okio.ByteString r0 = r1.endMessageAndGetUnknownFields(r2)
                    helios.service.advancedorder.v1.GetAdvancedOrderResponse r1 = new helios.service.advancedorder.v1.GetAdvancedOrderResponse
                    r2 = r15
                    java.lang.String r2 = (java.lang.String) r2
                    r5 = r6
                    java.lang.String r5 = (java.lang.String) r5
                    r6 = r16
                    helios.service.advancedorder.v1.ContingencyType r6 = (helios.service.advancedorder.p467v1.ContingencyType) r6
                    j$.time.Instant r12 = (p479j$.time.Instant) r12
                    r3 = r7
                    r7 = r9
                    r8 = r11
                    r9 = r12
                    r11 = r0
                    r1.<init>(r2, r3, r5, r6, r7, r8, r9, r10, r11)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: helios.service.advancedorder.p467v1.GetAdvancedOrderResponse2.decode(com.squareup.wire.ProtoReader):helios.service.advancedorder.v1.GetAdvancedOrderResponse");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAdvancedOrderResponse redact(GetAdvancedOrderResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant created_at = value.getCreated_at();
                return GetAdvancedOrderResponse.copy$default(value, null, 0L, null, null, false, false, created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null, Internal.m26823redactElements(value.getAdvanced_order_links(), AdvancedOrderLink.ADAPTER), ByteString.EMPTY, 63, null);
            }
        };
    }
}
