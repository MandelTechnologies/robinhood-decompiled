package wormhole.service.p554v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.rosetta.common.Money;
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

/* compiled from: RealizedGainLossGroup.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020\u0007H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J^\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006("}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossGroup;", "Lcom/squareup/wire/Message;", "", "id", "", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "group_size", "", "realized_return", "Lcom/robinhood/rosetta/common/Money;", "realized_return_percentage", "null_out_group_pnl", "", "asset_classes", "", "Lwormhole/service/v1/AssetClass;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/rosetta/common/Money;Ljava/lang/String;ZLjava/util/List;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getDisplay_name", "getGroup_size", "()I", "getRealized_return", "()Lcom/robinhood/rosetta/common/Money;", "getRealized_return_percentage", "getNull_out_group_pnl", "()Z", "getAsset_classes", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class RealizedGainLossGroup extends Message {

    @JvmField
    public static final ProtoAdapter<RealizedGainLossGroup> ADAPTER;

    @WireField(adapter = "wormhole.service.v1.AssetClass#ADAPTER", jsonName = "assetClasses", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<AssetClass> asset_classes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String display_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "groupSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int group_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "nullOutGroupPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean null_out_group_pnl;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "realizedReturn", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money realized_return;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "realizedReturnPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String realized_return_percentage;

    public RealizedGainLossGroup() {
        this(null, null, 0, null, null, false, null, null, 255, null);
    }

    public /* synthetic */ RealizedGainLossGroup(String str, String str2, int i, Money money, String str3, boolean z, List list, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : money, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? CollectionsKt.emptyList() : list, (i2 & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30071newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final int getGroup_size() {
        return this.group_size;
    }

    public final Money getRealized_return() {
        return this.realized_return;
    }

    public final String getRealized_return_percentage() {
        return this.realized_return_percentage;
    }

    public final boolean getNull_out_group_pnl() {
        return this.null_out_group_pnl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealizedGainLossGroup(String id, String display_name, int i, Money money, String realized_return_percentage, boolean z, List<? extends AssetClass> asset_classes, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(display_name, "display_name");
        Intrinsics.checkNotNullParameter(realized_return_percentage, "realized_return_percentage");
        Intrinsics.checkNotNullParameter(asset_classes, "asset_classes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.display_name = display_name;
        this.group_size = i;
        this.realized_return = money;
        this.realized_return_percentage = realized_return_percentage;
        this.null_out_group_pnl = z;
        this.asset_classes = Internal.immutableCopyOf("asset_classes", asset_classes);
    }

    public final List<AssetClass> getAsset_classes() {
        return this.asset_classes;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30071newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RealizedGainLossGroup)) {
            return false;
        }
        RealizedGainLossGroup realizedGainLossGroup = (RealizedGainLossGroup) other;
        return Intrinsics.areEqual(unknownFields(), realizedGainLossGroup.unknownFields()) && Intrinsics.areEqual(this.id, realizedGainLossGroup.id) && Intrinsics.areEqual(this.display_name, realizedGainLossGroup.display_name) && this.group_size == realizedGainLossGroup.group_size && Intrinsics.areEqual(this.realized_return, realizedGainLossGroup.realized_return) && Intrinsics.areEqual(this.realized_return_percentage, realizedGainLossGroup.realized_return_percentage) && this.null_out_group_pnl == realizedGainLossGroup.null_out_group_pnl && Intrinsics.areEqual(this.asset_classes, realizedGainLossGroup.asset_classes);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.display_name.hashCode()) * 37) + Integer.hashCode(this.group_size)) * 37;
        Money money = this.realized_return;
        int iHashCode2 = ((((((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.realized_return_percentage.hashCode()) * 37) + Boolean.hashCode(this.null_out_group_pnl)) * 37) + this.asset_classes.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("display_name=" + Internal.sanitize(this.display_name));
        arrayList.add("group_size=" + this.group_size);
        Money money = this.realized_return;
        if (money != null) {
            arrayList.add("realized_return=" + money);
        }
        arrayList.add("realized_return_percentage=" + Internal.sanitize(this.realized_return_percentage));
        arrayList.add("null_out_group_pnl=" + this.null_out_group_pnl);
        if (!this.asset_classes.isEmpty()) {
            arrayList.add("asset_classes=" + this.asset_classes);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RealizedGainLossGroup{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RealizedGainLossGroup copy$default(RealizedGainLossGroup realizedGainLossGroup, String str, String str2, int i, Money money, String str3, boolean z, List list, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = realizedGainLossGroup.id;
        }
        if ((i2 & 2) != 0) {
            str2 = realizedGainLossGroup.display_name;
        }
        if ((i2 & 4) != 0) {
            i = realizedGainLossGroup.group_size;
        }
        if ((i2 & 8) != 0) {
            money = realizedGainLossGroup.realized_return;
        }
        if ((i2 & 16) != 0) {
            str3 = realizedGainLossGroup.realized_return_percentage;
        }
        if ((i2 & 32) != 0) {
            z = realizedGainLossGroup.null_out_group_pnl;
        }
        if ((i2 & 64) != 0) {
            list = realizedGainLossGroup.asset_classes;
        }
        if ((i2 & 128) != 0) {
            byteString = realizedGainLossGroup.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        String str4 = str3;
        boolean z2 = z;
        return realizedGainLossGroup.copy(str, str2, i, money, str4, z2, list2, byteString2);
    }

    public final RealizedGainLossGroup copy(String id, String display_name, int group_size, Money realized_return, String realized_return_percentage, boolean null_out_group_pnl, List<? extends AssetClass> asset_classes, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(display_name, "display_name");
        Intrinsics.checkNotNullParameter(realized_return_percentage, "realized_return_percentage");
        Intrinsics.checkNotNullParameter(asset_classes, "asset_classes");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RealizedGainLossGroup(id, display_name, group_size, realized_return, realized_return_percentage, null_out_group_pnl, asset_classes, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RealizedGainLossGroup.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RealizedGainLossGroup>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: wormhole.service.v1.RealizedGainLossGroup$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RealizedGainLossGroup value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDisplay_name());
                }
                if (value.getGroup_size() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getGroup_size()));
                }
                if (value.getRealized_return() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getRealized_return());
                }
                if (!Intrinsics.areEqual(value.getRealized_return_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getRealized_return_percentage());
                }
                if (value.getNull_out_group_pnl()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getNull_out_group_pnl()));
                }
                return size + AssetClass.ADAPTER.asRepeated().encodedSizeWithTag(7, value.getAsset_classes());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RealizedGainLossGroup value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDisplay_name());
                }
                if (value.getGroup_size() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getGroup_size()));
                }
                if (value.getRealized_return() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getRealized_return());
                }
                if (!Intrinsics.areEqual(value.getRealized_return_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getRealized_return_percentage());
                }
                if (value.getNull_out_group_pnl()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getNull_out_group_pnl()));
                }
                AssetClass.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getAsset_classes());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RealizedGainLossGroup value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                AssetClass.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getAsset_classes());
                if (value.getNull_out_group_pnl()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getNull_out_group_pnl()));
                }
                if (!Intrinsics.areEqual(value.getRealized_return_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getRealized_return_percentage());
                }
                if (value.getRealized_return() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getRealized_return());
                }
                if (value.getGroup_size() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getGroup_size()));
                }
                if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDisplay_name());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RealizedGainLossGroup decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                boolean zBooleanValue = false;
                Money moneyDecode = null;
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 4:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 7:
                                try {
                                    AssetClass.ADAPTER.tryDecode(reader, arrayList);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new RealizedGainLossGroup(strDecode2, strDecode3, iIntValue, moneyDecode, strDecode, zBooleanValue, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RealizedGainLossGroup redact(RealizedGainLossGroup value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money realized_return = value.getRealized_return();
                return RealizedGainLossGroup.copy$default(value, null, null, 0, realized_return != null ? Money.ADAPTER.redact(realized_return) : null, null, false, null, ByteString.EMPTY, 119, null);
            }
        };
    }
}
