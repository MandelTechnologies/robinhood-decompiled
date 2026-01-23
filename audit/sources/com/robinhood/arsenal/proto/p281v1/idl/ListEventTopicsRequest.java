package com.robinhood.arsenal.proto.p281v1.idl;

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

/* compiled from: ListEventTopicsRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016JL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ListEventTopicsRequest;", "Lcom/squareup/wire/Message;", "", "ids", "", "location", "Lcom/robinhood/arsenal/proto/v1/idl/EventTopicLocation;", "bracket_enabled", "", "hub_redesign_enabled", "forecastex_enabled", "exclude_sports", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/EventTopicLocation;ZZZZLokio/ByteString;)V", "getIds", "()Ljava/lang/String;", "getLocation", "()Lcom/robinhood/arsenal/proto/v1/idl/EventTopicLocation;", "getBracket_enabled", "()Z", "getHub_redesign_enabled", "getForecastex_enabled", "getExclude_sports", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ListEventTopicsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ListEventTopicsRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "bracketEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean bracket_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "excludeSports", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean exclude_sports;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "forecastexEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean forecastex_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hubRedesignEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean hub_redesign_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ids;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.EventTopicLocation#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final EventTopicLocation location;

    public ListEventTopicsRequest() {
        this(null, null, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20175newBuilder();
    }

    public final String getIds() {
        return this.ids;
    }

    public /* synthetic */ ListEventTopicsRequest(String str, EventTopicLocation eventTopicLocation, boolean z, boolean z2, boolean z3, boolean z4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EventTopicLocation.EVENT_TOPIC_LOCATION_UNSPECIFIED : eventTopicLocation, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final EventTopicLocation getLocation() {
        return this.location;
    }

    public final boolean getBracket_enabled() {
        return this.bracket_enabled;
    }

    public final boolean getHub_redesign_enabled() {
        return this.hub_redesign_enabled;
    }

    public final boolean getForecastex_enabled() {
        return this.forecastex_enabled;
    }

    public final boolean getExclude_sports() {
        return this.exclude_sports;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListEventTopicsRequest(String ids, EventTopicLocation location, boolean z, boolean z2, boolean z3, boolean z4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ids = ids;
        this.location = location;
        this.bracket_enabled = z;
        this.hub_redesign_enabled = z2;
        this.forecastex_enabled = z3;
        this.exclude_sports = z4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20175newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ListEventTopicsRequest)) {
            return false;
        }
        ListEventTopicsRequest listEventTopicsRequest = (ListEventTopicsRequest) other;
        return Intrinsics.areEqual(unknownFields(), listEventTopicsRequest.unknownFields()) && Intrinsics.areEqual(this.ids, listEventTopicsRequest.ids) && this.location == listEventTopicsRequest.location && this.bracket_enabled == listEventTopicsRequest.bracket_enabled && this.hub_redesign_enabled == listEventTopicsRequest.hub_redesign_enabled && this.forecastex_enabled == listEventTopicsRequest.forecastex_enabled && this.exclude_sports == listEventTopicsRequest.exclude_sports;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.ids.hashCode()) * 37) + this.location.hashCode()) * 37) + Boolean.hashCode(this.bracket_enabled)) * 37) + Boolean.hashCode(this.hub_redesign_enabled)) * 37) + Boolean.hashCode(this.forecastex_enabled)) * 37) + Boolean.hashCode(this.exclude_sports);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ids=" + Internal.sanitize(this.ids));
        arrayList.add("location=" + this.location);
        arrayList.add("bracket_enabled=" + this.bracket_enabled);
        arrayList.add("hub_redesign_enabled=" + this.hub_redesign_enabled);
        arrayList.add("forecastex_enabled=" + this.forecastex_enabled);
        arrayList.add("exclude_sports=" + this.exclude_sports);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListEventTopicsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ListEventTopicsRequest copy$default(ListEventTopicsRequest listEventTopicsRequest, String str, EventTopicLocation eventTopicLocation, boolean z, boolean z2, boolean z3, boolean z4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = listEventTopicsRequest.ids;
        }
        if ((i & 2) != 0) {
            eventTopicLocation = listEventTopicsRequest.location;
        }
        if ((i & 4) != 0) {
            z = listEventTopicsRequest.bracket_enabled;
        }
        if ((i & 8) != 0) {
            z2 = listEventTopicsRequest.hub_redesign_enabled;
        }
        if ((i & 16) != 0) {
            z3 = listEventTopicsRequest.forecastex_enabled;
        }
        if ((i & 32) != 0) {
            z4 = listEventTopicsRequest.exclude_sports;
        }
        if ((i & 64) != 0) {
            byteString = listEventTopicsRequest.unknownFields();
        }
        boolean z5 = z4;
        ByteString byteString2 = byteString;
        boolean z6 = z3;
        boolean z7 = z;
        return listEventTopicsRequest.copy(str, eventTopicLocation, z7, z2, z6, z5, byteString2);
    }

    public final ListEventTopicsRequest copy(String ids, EventTopicLocation location, boolean bracket_enabled, boolean hub_redesign_enabled, boolean forecastex_enabled, boolean exclude_sports, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ListEventTopicsRequest(ids, location, bracket_enabled, hub_redesign_enabled, forecastex_enabled, exclude_sports, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListEventTopicsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ListEventTopicsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.ListEventTopicsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ListEventTopicsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getIds(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getIds());
                }
                if (value.getLocation() != EventTopicLocation.EVENT_TOPIC_LOCATION_UNSPECIFIED) {
                    size += EventTopicLocation.ADAPTER.encodedSizeWithTag(2, value.getLocation());
                }
                if (value.getBracket_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getBracket_enabled()));
                }
                if (value.getHub_redesign_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getHub_redesign_enabled()));
                }
                if (value.getForecastex_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getForecastex_enabled()));
                }
                return value.getExclude_sports() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getExclude_sports())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ListEventTopicsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getIds(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIds());
                }
                if (value.getLocation() != EventTopicLocation.EVENT_TOPIC_LOCATION_UNSPECIFIED) {
                    EventTopicLocation.ADAPTER.encodeWithTag(writer, 2, (int) value.getLocation());
                }
                if (value.getBracket_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getBracket_enabled()));
                }
                if (value.getHub_redesign_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getHub_redesign_enabled()));
                }
                if (value.getForecastex_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getForecastex_enabled()));
                }
                if (value.getExclude_sports()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getExclude_sports()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ListEventTopicsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getExclude_sports()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getExclude_sports()));
                }
                if (value.getForecastex_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getForecastex_enabled()));
                }
                if (value.getHub_redesign_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getHub_redesign_enabled()));
                }
                if (value.getBracket_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getBracket_enabled()));
                }
                if (value.getLocation() != EventTopicLocation.EVENT_TOPIC_LOCATION_UNSPECIFIED) {
                    EventTopicLocation.ADAPTER.encodeWithTag(writer, 2, (int) value.getLocation());
                }
                if (Intrinsics.areEqual(value.getIds(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIds());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ListEventTopicsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                EventTopicLocation eventTopicLocationDecode = EventTopicLocation.EVENT_TOPIC_LOCATION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                boolean zBooleanValue4 = false;
                String strDecode = "";
                while (true) {
                    EventTopicLocation eventTopicLocation = eventTopicLocationDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        eventTopicLocationDecode = EventTopicLocation.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 4:
                                    zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 5:
                                    zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 6:
                                    zBooleanValue4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ListEventTopicsRequest(strDecode, eventTopicLocation, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ListEventTopicsRequest redact(ListEventTopicsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ListEventTopicsRequest.copy$default(value, null, null, false, false, false, false, ByteString.EMPTY, 63, null);
            }
        };
    }
}
