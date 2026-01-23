package com.robinhood.rosetta.eventlogging;

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

/* compiled from: ScreenTransitionEventData.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020\u0006H\u0016J\b\u0010)\u001a\u00020\u0004H\u0016J\u0088\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventData;", "Lcom/squareup/wire/Message;", "", "screen_name", "", "screen_depth", "", "screen_description", "time_spent", "transition_reason", "type", "message_type", "message_uuid", "entity_id", "source", "source_screen_name", "target_screen_name", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getScreen_name", "()Ljava/lang/String;", "getScreen_depth", "()I", "getScreen_description", "getTime_spent", "getTransition_reason", "getType", "getMessage_type", "getMessage_uuid", "getEntity_id", "getSource", "getSource_screen_name", "getTarget_screen_name", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ScreenTransitionEventData extends Message {

    @JvmField
    public static final ProtoAdapter<ScreenTransitionEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "entityId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final int entity_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "messageType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String message_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "messageUuid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String message_uuid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "screenDepth", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int screen_depth;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenDescription", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String screen_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String screen_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceScreenName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String source_screen_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "targetScreenName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String target_screen_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "timeSpent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final int time_spent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transitionReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String transition_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String type;

    public ScreenTransitionEventData() {
        this(null, 0, null, 0, null, null, null, null, 0, null, null, null, null, 8191, null);
    }

    public /* synthetic */ ScreenTransitionEventData(String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, String str9, ByteString byteString, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? "" : str3, (i4 & 32) != 0 ? "" : str4, (i4 & 64) != 0 ? "" : str5, (i4 & 128) != 0 ? "" : str6, (i4 & 256) == 0 ? i3 : 0, (i4 & 512) != 0 ? "" : str7, (i4 & 1024) != 0 ? "" : str8, (i4 & 2048) == 0 ? str9 : "", (i4 & 4096) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24560newBuilder();
    }

    public final String getScreen_name() {
        return this.screen_name;
    }

    public final int getScreen_depth() {
        return this.screen_depth;
    }

    public final String getScreen_description() {
        return this.screen_description;
    }

    public final int getTime_spent() {
        return this.time_spent;
    }

    public final String getTransition_reason() {
        return this.transition_reason;
    }

    public final String getType() {
        return this.type;
    }

    public final String getMessage_type() {
        return this.message_type;
    }

    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    public final int getEntity_id() {
        return this.entity_id;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSource_screen_name() {
        return this.source_screen_name;
    }

    public final String getTarget_screen_name() {
        return this.target_screen_name;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenTransitionEventData(String screen_name, int i, String screen_description, int i2, String transition_reason, String type2, String message_type, String message_uuid, int i3, String source, String source_screen_name, String target_screen_name, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(screen_description, "screen_description");
        Intrinsics.checkNotNullParameter(transition_reason, "transition_reason");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(message_type, "message_type");
        Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(source_screen_name, "source_screen_name");
        Intrinsics.checkNotNullParameter(target_screen_name, "target_screen_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.screen_name = screen_name;
        this.screen_depth = i;
        this.screen_description = screen_description;
        this.time_spent = i2;
        this.transition_reason = transition_reason;
        this.type = type2;
        this.message_type = message_type;
        this.message_uuid = message_uuid;
        this.entity_id = i3;
        this.source = source;
        this.source_screen_name = source_screen_name;
        this.target_screen_name = target_screen_name;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24560newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ScreenTransitionEventData)) {
            return false;
        }
        ScreenTransitionEventData screenTransitionEventData = (ScreenTransitionEventData) other;
        return Intrinsics.areEqual(unknownFields(), screenTransitionEventData.unknownFields()) && Intrinsics.areEqual(this.screen_name, screenTransitionEventData.screen_name) && this.screen_depth == screenTransitionEventData.screen_depth && Intrinsics.areEqual(this.screen_description, screenTransitionEventData.screen_description) && this.time_spent == screenTransitionEventData.time_spent && Intrinsics.areEqual(this.transition_reason, screenTransitionEventData.transition_reason) && Intrinsics.areEqual(this.type, screenTransitionEventData.type) && Intrinsics.areEqual(this.message_type, screenTransitionEventData.message_type) && Intrinsics.areEqual(this.message_uuid, screenTransitionEventData.message_uuid) && this.entity_id == screenTransitionEventData.entity_id && Intrinsics.areEqual(this.source, screenTransitionEventData.source) && Intrinsics.areEqual(this.source_screen_name, screenTransitionEventData.source_screen_name) && Intrinsics.areEqual(this.target_screen_name, screenTransitionEventData.target_screen_name);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((unknownFields().hashCode() * 37) + this.screen_name.hashCode()) * 37) + Integer.hashCode(this.screen_depth)) * 37) + this.screen_description.hashCode()) * 37) + Integer.hashCode(this.time_spent)) * 37) + this.transition_reason.hashCode()) * 37) + this.type.hashCode()) * 37) + this.message_type.hashCode()) * 37) + this.message_uuid.hashCode()) * 37) + Integer.hashCode(this.entity_id)) * 37) + this.source.hashCode()) * 37) + this.source_screen_name.hashCode()) * 37) + this.target_screen_name.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("screen_name=" + Internal.sanitize(this.screen_name));
        arrayList.add("screen_depth=" + this.screen_depth);
        arrayList.add("screen_description=" + Internal.sanitize(this.screen_description));
        arrayList.add("time_spent=" + this.time_spent);
        arrayList.add("transition_reason=" + Internal.sanitize(this.transition_reason));
        arrayList.add("type=" + Internal.sanitize(this.type));
        arrayList.add("message_type=" + Internal.sanitize(this.message_type));
        arrayList.add("message_uuid=" + Internal.sanitize(this.message_uuid));
        arrayList.add("entity_id=" + this.entity_id);
        arrayList.add("source=" + Internal.sanitize(this.source));
        arrayList.add("source_screen_name=" + Internal.sanitize(this.source_screen_name));
        arrayList.add("target_screen_name=" + Internal.sanitize(this.target_screen_name));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScreenTransitionEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ScreenTransitionEventData copy$default(ScreenTransitionEventData screenTransitionEventData, String str, int i, String str2, int i2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, String str9, ByteString byteString, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = screenTransitionEventData.screen_name;
        }
        return screenTransitionEventData.copy(str, (i4 & 2) != 0 ? screenTransitionEventData.screen_depth : i, (i4 & 4) != 0 ? screenTransitionEventData.screen_description : str2, (i4 & 8) != 0 ? screenTransitionEventData.time_spent : i2, (i4 & 16) != 0 ? screenTransitionEventData.transition_reason : str3, (i4 & 32) != 0 ? screenTransitionEventData.type : str4, (i4 & 64) != 0 ? screenTransitionEventData.message_type : str5, (i4 & 128) != 0 ? screenTransitionEventData.message_uuid : str6, (i4 & 256) != 0 ? screenTransitionEventData.entity_id : i3, (i4 & 512) != 0 ? screenTransitionEventData.source : str7, (i4 & 1024) != 0 ? screenTransitionEventData.source_screen_name : str8, (i4 & 2048) != 0 ? screenTransitionEventData.target_screen_name : str9, (i4 & 4096) != 0 ? screenTransitionEventData.unknownFields() : byteString);
    }

    public final ScreenTransitionEventData copy(String screen_name, int screen_depth, String screen_description, int time_spent, String transition_reason, String type2, String message_type, String message_uuid, int entity_id, String source, String source_screen_name, String target_screen_name, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(screen_description, "screen_description");
        Intrinsics.checkNotNullParameter(transition_reason, "transition_reason");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(message_type, "message_type");
        Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(source_screen_name, "source_screen_name");
        Intrinsics.checkNotNullParameter(target_screen_name, "target_screen_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ScreenTransitionEventData(screen_name, screen_depth, screen_description, time_spent, transition_reason, type2, message_type, message_uuid, entity_id, source, source_screen_name, target_screen_name, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ScreenTransitionEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ScreenTransitionEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ScreenTransitionEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ScreenTransitionEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getScreen_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getScreen_name());
                }
                if (value.getScreen_depth() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getScreen_depth()));
                }
                if (!Intrinsics.areEqual(value.getScreen_description(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getScreen_description());
                }
                if (value.getTime_spent() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getTime_spent()));
                }
                if (!Intrinsics.areEqual(value.getTransition_reason(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getTransition_reason());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getType());
                }
                if (!Intrinsics.areEqual(value.getMessage_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getMessage_type());
                }
                if (!Intrinsics.areEqual(value.getMessage_uuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getMessage_uuid());
                }
                if (value.getEntity_id() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(9, Integer.valueOf(value.getEntity_id()));
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getSource());
                }
                if (!Intrinsics.areEqual(value.getSource_screen_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getSource_screen_name());
                }
                return !Intrinsics.areEqual(value.getTarget_screen_name(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(12, value.getTarget_screen_name()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ScreenTransitionEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getScreen_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getScreen_name());
                }
                if (value.getScreen_depth() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getScreen_depth()));
                }
                if (!Intrinsics.areEqual(value.getScreen_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getScreen_description());
                }
                if (value.getTime_spent() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getTime_spent()));
                }
                if (!Intrinsics.areEqual(value.getTransition_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTransition_reason());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getMessage_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMessage_type());
                }
                if (!Intrinsics.areEqual(value.getMessage_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getMessage_uuid());
                }
                if (value.getEntity_id() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getEntity_id()));
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getSource());
                }
                if (!Intrinsics.areEqual(value.getSource_screen_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getSource_screen_name());
                }
                if (!Intrinsics.areEqual(value.getTarget_screen_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getTarget_screen_name());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ScreenTransitionEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTarget_screen_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getTarget_screen_name());
                }
                if (!Intrinsics.areEqual(value.getSource_screen_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getSource_screen_name());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getSource());
                }
                if (value.getEntity_id() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getEntity_id()));
                }
                if (!Intrinsics.areEqual(value.getMessage_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getMessage_uuid());
                }
                if (!Intrinsics.areEqual(value.getMessage_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMessage_type());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getTransition_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTransition_reason());
                }
                if (value.getTime_spent() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getTime_spent()));
                }
                if (!Intrinsics.areEqual(value.getScreen_description(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getScreen_description());
                }
                if (value.getScreen_depth() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getScreen_depth()));
                }
                if (Intrinsics.areEqual(value.getScreen_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getScreen_name());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ScreenTransitionEventData redact(ScreenTransitionEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ScreenTransitionEventData.copy$default(value, null, 0, null, 0, null, null, null, null, 0, null, null, null, ByteString.EMPTY, 4095, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ScreenTransitionEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                int iIntValue = 0;
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                String strDecode9 = strDecode8;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 3:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 10:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ScreenTransitionEventData(strDecode, iIntValue, strDecode9, iIntValue2, strDecode2, strDecode3, strDecode4, strDecode5, iIntValue3, strDecode6, strDecode7, strDecode8, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
