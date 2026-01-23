package com.robinhood.rosetta.eventlogging;

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

/* compiled from: ClientBuildStepEvent.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016JL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBuildStepEvent;", "Lcom/squareup/wire/Message;", "", "build_event_id", "", "type", "name", "context", "duration", "", "occurrences", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FILokio/ByteString;)V", "getBuild_event_id", "()Ljava/lang/String;", "getType", "getName", "getContext", "getDuration", "()F", "getOccurrences", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientBuildStepEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientBuildStepEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buildEventId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String build_event_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final float duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int occurrences;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String type;

    public ClientBuildStepEvent() {
        this(null, null, null, null, 0.0f, 0, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ ClientBuildStepEvent(String str, String str2, String str3, String str4, float f, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 0.0f : f, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24084newBuilder();
    }

    public final String getBuild_event_id() {
        return this.build_event_id;
    }

    public final String getType() {
        return this.type;
    }

    public final String getName() {
        return this.name;
    }

    public final String getContext() {
        return this.context;
    }

    public final float getDuration() {
        return this.duration;
    }

    public final int getOccurrences() {
        return this.occurrences;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientBuildStepEvent(String build_event_id, String type2, String name, String context, float f, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(build_event_id, "build_event_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.build_event_id = build_event_id;
        this.type = type2;
        this.name = name;
        this.context = context;
        this.duration = f;
        this.occurrences = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24084newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientBuildStepEvent)) {
            return false;
        }
        ClientBuildStepEvent clientBuildStepEvent = (ClientBuildStepEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientBuildStepEvent.unknownFields()) && Intrinsics.areEqual(this.build_event_id, clientBuildStepEvent.build_event_id) && Intrinsics.areEqual(this.type, clientBuildStepEvent.type) && Intrinsics.areEqual(this.name, clientBuildStepEvent.name) && Intrinsics.areEqual(this.context, clientBuildStepEvent.context) && this.duration == clientBuildStepEvent.duration && this.occurrences == clientBuildStepEvent.occurrences;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.build_event_id.hashCode()) * 37) + this.type.hashCode()) * 37) + this.name.hashCode()) * 37) + this.context.hashCode()) * 37) + Float.hashCode(this.duration)) * 37) + Integer.hashCode(this.occurrences);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("build_event_id=" + Internal.sanitize(this.build_event_id));
        arrayList.add("type=" + Internal.sanitize(this.type));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("context=" + Internal.sanitize(this.context));
        arrayList.add("duration=" + this.duration);
        arrayList.add("occurrences=" + this.occurrences);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientBuildStepEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientBuildStepEvent copy$default(ClientBuildStepEvent clientBuildStepEvent, String str, String str2, String str3, String str4, float f, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = clientBuildStepEvent.build_event_id;
        }
        if ((i2 & 2) != 0) {
            str2 = clientBuildStepEvent.type;
        }
        if ((i2 & 4) != 0) {
            str3 = clientBuildStepEvent.name;
        }
        if ((i2 & 8) != 0) {
            str4 = clientBuildStepEvent.context;
        }
        if ((i2 & 16) != 0) {
            f = clientBuildStepEvent.duration;
        }
        if ((i2 & 32) != 0) {
            i = clientBuildStepEvent.occurrences;
        }
        if ((i2 & 64) != 0) {
            byteString = clientBuildStepEvent.unknownFields();
        }
        int i3 = i;
        ByteString byteString2 = byteString;
        float f2 = f;
        String str5 = str3;
        return clientBuildStepEvent.copy(str, str2, str5, str4, f2, i3, byteString2);
    }

    public final ClientBuildStepEvent copy(String build_event_id, String type2, String name, String context, float duration, int occurrences, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(build_event_id, "build_event_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientBuildStepEvent(build_event_id, type2, name, context, duration, occurrences, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientBuildStepEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientBuildStepEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientBuildStepEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientBuildStepEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getBuild_event_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getBuild_event_id());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getType());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getName());
                }
                if (!Intrinsics.areEqual(value.getContext(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getContext());
                }
                if (!Float.valueOf(value.getDuration()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(5, Float.valueOf(value.getDuration()));
                }
                return value.getOccurrences() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getOccurrences())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientBuildStepEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getBuild_event_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBuild_event_id());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getContext(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getContext());
                }
                if (!Float.valueOf(value.getDuration()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 5, (int) Float.valueOf(value.getDuration()));
                }
                if (value.getOccurrences() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getOccurrences()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientBuildStepEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOccurrences() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, (int) Integer.valueOf(value.getOccurrences()));
                }
                if (!Float.valueOf(value.getDuration()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 5, (int) Float.valueOf(value.getDuration()));
                }
                if (!Intrinsics.areEqual(value.getContext(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getContext());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getType());
                }
                if (Intrinsics.areEqual(value.getBuild_event_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBuild_event_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientBuildStepEvent redact(ClientBuildStepEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ClientBuildStepEvent.copy$default(value, null, null, null, null, 0.0f, 0, ByteString.EMPTY, 63, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ClientBuildStepEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                float fFloatValue = 0.0f;
                int iIntValue = 0;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 6:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ClientBuildStepEvent(strDecode, strDecode3, strDecode4, strDecode2, fFloatValue, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
