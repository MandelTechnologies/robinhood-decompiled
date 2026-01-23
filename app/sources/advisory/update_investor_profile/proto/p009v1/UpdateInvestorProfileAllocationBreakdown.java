package advisory.update_investor_profile.proto.p009v1;

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

/* compiled from: UpdateInvestorProfileAllocationBreakdown.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfileAllocationBreakdown;", "Lcom/squareup/wire/Message;", "", "title", "", "description", "allocation_percentage", "direction", "Ladvisory/update_investor_profile/proto/v1/Direction;", "asset_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ladvisory/update_investor_profile/proto/v1/Direction;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getAllocation_percentage", "getDirection", "()Ladvisory/update_investor_profile/proto/v1/Direction;", "getAsset_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class UpdateInvestorProfileAllocationBreakdown extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateInvestorProfileAllocationBreakdown> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "allocationPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String allocation_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String asset_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "advisory.update_investor_profile.proto.v1.Direction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Direction direction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public UpdateInvestorProfileAllocationBreakdown() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ UpdateInvestorProfileAllocationBreakdown(String str, String str2, String str3, Direction direction, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? Direction.DIRECTION_UNSPECIFIED : direction, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4582newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getAllocation_percentage() {
        return this.allocation_percentage;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final String getAsset_id() {
        return this.asset_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateInvestorProfileAllocationBreakdown(String title, String description, String allocation_percentage, Direction direction, String asset_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(allocation_percentage, "allocation_percentage");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(asset_id, "asset_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.description = description;
        this.allocation_percentage = allocation_percentage;
        this.direction = direction;
        this.asset_id = asset_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4582newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateInvestorProfileAllocationBreakdown)) {
            return false;
        }
        UpdateInvestorProfileAllocationBreakdown updateInvestorProfileAllocationBreakdown = (UpdateInvestorProfileAllocationBreakdown) other;
        return Intrinsics.areEqual(unknownFields(), updateInvestorProfileAllocationBreakdown.unknownFields()) && Intrinsics.areEqual(this.title, updateInvestorProfileAllocationBreakdown.title) && Intrinsics.areEqual(this.description, updateInvestorProfileAllocationBreakdown.description) && Intrinsics.areEqual(this.allocation_percentage, updateInvestorProfileAllocationBreakdown.allocation_percentage) && this.direction == updateInvestorProfileAllocationBreakdown.direction && Intrinsics.areEqual(this.asset_id, updateInvestorProfileAllocationBreakdown.asset_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.description.hashCode()) * 37) + this.allocation_percentage.hashCode()) * 37) + this.direction.hashCode()) * 37) + this.asset_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("allocation_percentage=" + Internal.sanitize(this.allocation_percentage));
        arrayList.add("direction=" + this.direction);
        arrayList.add("asset_id=" + Internal.sanitize(this.asset_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateInvestorProfileAllocationBreakdown{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UpdateInvestorProfileAllocationBreakdown copy$default(UpdateInvestorProfileAllocationBreakdown updateInvestorProfileAllocationBreakdown, String str, String str2, String str3, Direction direction, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateInvestorProfileAllocationBreakdown.title;
        }
        if ((i & 2) != 0) {
            str2 = updateInvestorProfileAllocationBreakdown.description;
        }
        if ((i & 4) != 0) {
            str3 = updateInvestorProfileAllocationBreakdown.allocation_percentage;
        }
        if ((i & 8) != 0) {
            direction = updateInvestorProfileAllocationBreakdown.direction;
        }
        if ((i & 16) != 0) {
            str4 = updateInvestorProfileAllocationBreakdown.asset_id;
        }
        if ((i & 32) != 0) {
            byteString = updateInvestorProfileAllocationBreakdown.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return updateInvestorProfileAllocationBreakdown.copy(str, str2, str3, direction, str5, byteString2);
    }

    public final UpdateInvestorProfileAllocationBreakdown copy(String title, String description, String allocation_percentage, Direction direction, String asset_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(allocation_percentage, "allocation_percentage");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(asset_id, "asset_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateInvestorProfileAllocationBreakdown(title, description, allocation_percentage, direction, asset_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateInvestorProfileAllocationBreakdown.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateInvestorProfileAllocationBreakdown>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.update_investor_profile.proto.v1.UpdateInvestorProfileAllocationBreakdown$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateInvestorProfileAllocationBreakdown value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getAllocation_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAllocation_percentage());
                }
                if (value.getDirection() != Direction.DIRECTION_UNSPECIFIED) {
                    size += Direction.ADAPTER.encodedSizeWithTag(4, value.getDirection());
                }
                return !Intrinsics.areEqual(value.getAsset_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getAsset_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateInvestorProfileAllocationBreakdown value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getAllocation_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAllocation_percentage());
                }
                if (value.getDirection() != Direction.DIRECTION_UNSPECIFIED) {
                    Direction.ADAPTER.encodeWithTag(writer, 4, (int) value.getDirection());
                }
                if (!Intrinsics.areEqual(value.getAsset_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAsset_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateInvestorProfileAllocationBreakdown value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAsset_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getAsset_id());
                }
                if (value.getDirection() != Direction.DIRECTION_UNSPECIFIED) {
                    Direction.ADAPTER.encodeWithTag(writer, 4, (int) value.getDirection());
                }
                if (!Intrinsics.areEqual(value.getAllocation_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAllocation_percentage());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UpdateInvestorProfileAllocationBreakdown decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Direction directionDecode = Direction.DIRECTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    Direction direction = directionDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new UpdateInvestorProfileAllocationBreakdown(strDecode, strDecode2, strDecode3, direction, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                directionDecode = Direction.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 5) {
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateInvestorProfileAllocationBreakdown redact(UpdateInvestorProfileAllocationBreakdown value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UpdateInvestorProfileAllocationBreakdown.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
