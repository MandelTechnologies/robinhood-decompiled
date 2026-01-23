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

/* compiled from: PushNotificationEventData.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JV\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PushNotificationEventData;", "Lcom/squareup/wire/Message;", "", "message_uuid", "", "message_type", "message", "po_box", "message_title", "message_body", "locality", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getMessage_uuid", "()Ljava/lang/String;", "getMessage_type", "getMessage", "getPo_box", "getMessage_title", "getMessage_body", "getLocality", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PushNotificationEventData extends Message {

    @JvmField
    public static final ProtoAdapter<PushNotificationEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String locality;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "messageBody", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String message_body;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "messageTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String message_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "messageType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String message_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "messageUuid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String message_uuid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "poBox", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String po_box;

    public PushNotificationEventData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ PushNotificationEventData(String str, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24515newBuilder();
    }

    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    public final String getMessage_type() {
        return this.message_type;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPo_box() {
        return this.po_box;
    }

    public final String getMessage_title() {
        return this.message_title;
    }

    public final String getMessage_body() {
        return this.message_body;
    }

    public final String getLocality() {
        return this.locality;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationEventData(String message_uuid, String message_type, String message, String po_box, String message_title, String message_body, String locality, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
        Intrinsics.checkNotNullParameter(message_type, "message_type");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(po_box, "po_box");
        Intrinsics.checkNotNullParameter(message_title, "message_title");
        Intrinsics.checkNotNullParameter(message_body, "message_body");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.message_uuid = message_uuid;
        this.message_type = message_type;
        this.message = message;
        this.po_box = po_box;
        this.message_title = message_title;
        this.message_body = message_body;
        this.locality = locality;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24515newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PushNotificationEventData)) {
            return false;
        }
        PushNotificationEventData pushNotificationEventData = (PushNotificationEventData) other;
        return Intrinsics.areEqual(unknownFields(), pushNotificationEventData.unknownFields()) && Intrinsics.areEqual(this.message_uuid, pushNotificationEventData.message_uuid) && Intrinsics.areEqual(this.message_type, pushNotificationEventData.message_type) && Intrinsics.areEqual(this.message, pushNotificationEventData.message) && Intrinsics.areEqual(this.po_box, pushNotificationEventData.po_box) && Intrinsics.areEqual(this.message_title, pushNotificationEventData.message_title) && Intrinsics.areEqual(this.message_body, pushNotificationEventData.message_body) && Intrinsics.areEqual(this.locality, pushNotificationEventData.locality);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.message_uuid.hashCode()) * 37) + this.message_type.hashCode()) * 37) + this.message.hashCode()) * 37) + this.po_box.hashCode()) * 37) + this.message_title.hashCode()) * 37) + this.message_body.hashCode()) * 37) + this.locality.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("message_uuid=" + Internal.sanitize(this.message_uuid));
        arrayList.add("message_type=" + Internal.sanitize(this.message_type));
        arrayList.add("message=" + Internal.sanitize(this.message));
        arrayList.add("po_box=" + Internal.sanitize(this.po_box));
        arrayList.add("message_title=" + Internal.sanitize(this.message_title));
        arrayList.add("message_body=" + Internal.sanitize(this.message_body));
        arrayList.add("locality=" + Internal.sanitize(this.locality));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PushNotificationEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PushNotificationEventData copy$default(PushNotificationEventData pushNotificationEventData, String str, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushNotificationEventData.message_uuid;
        }
        if ((i & 2) != 0) {
            str2 = pushNotificationEventData.message_type;
        }
        if ((i & 4) != 0) {
            str3 = pushNotificationEventData.message;
        }
        if ((i & 8) != 0) {
            str4 = pushNotificationEventData.po_box;
        }
        if ((i & 16) != 0) {
            str5 = pushNotificationEventData.message_title;
        }
        if ((i & 32) != 0) {
            str6 = pushNotificationEventData.message_body;
        }
        if ((i & 64) != 0) {
            str7 = pushNotificationEventData.locality;
        }
        if ((i & 128) != 0) {
            byteString = pushNotificationEventData.unknownFields();
        }
        String str8 = str7;
        ByteString byteString2 = byteString;
        String str9 = str5;
        String str10 = str6;
        return pushNotificationEventData.copy(str, str2, str3, str4, str9, str10, str8, byteString2);
    }

    public final PushNotificationEventData copy(String message_uuid, String message_type, String message, String po_box, String message_title, String message_body, String locality, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(message_uuid, "message_uuid");
        Intrinsics.checkNotNullParameter(message_type, "message_type");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(po_box, "po_box");
        Intrinsics.checkNotNullParameter(message_title, "message_title");
        Intrinsics.checkNotNullParameter(message_body, "message_body");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PushNotificationEventData(message_uuid, message_type, message, po_box, message_title, message_body, locality, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PushNotificationEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PushNotificationEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PushNotificationEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PushNotificationEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getMessage_uuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getMessage_uuid());
                }
                if (!Intrinsics.areEqual(value.getMessage_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMessage_type());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getMessage());
                }
                if (!Intrinsics.areEqual(value.getPo_box(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getPo_box());
                }
                if (!Intrinsics.areEqual(value.getMessage_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getMessage_title());
                }
                if (!Intrinsics.areEqual(value.getMessage_body(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getMessage_body());
                }
                return !Intrinsics.areEqual(value.getLocality(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getLocality()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PushNotificationEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getMessage_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMessage_uuid());
                }
                if (!Intrinsics.areEqual(value.getMessage_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMessage_type());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMessage());
                }
                if (!Intrinsics.areEqual(value.getPo_box(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPo_box());
                }
                if (!Intrinsics.areEqual(value.getMessage_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMessage_title());
                }
                if (!Intrinsics.areEqual(value.getMessage_body(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getMessage_body());
                }
                if (!Intrinsics.areEqual(value.getLocality(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getLocality());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PushNotificationEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getLocality(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getLocality());
                }
                if (!Intrinsics.areEqual(value.getMessage_body(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getMessage_body());
                }
                if (!Intrinsics.areEqual(value.getMessage_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getMessage_title());
                }
                if (!Intrinsics.areEqual(value.getPo_box(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getPo_box());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMessage());
                }
                if (!Intrinsics.areEqual(value.getMessage_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMessage_type());
                }
                if (Intrinsics.areEqual(value.getMessage_uuid(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMessage_uuid());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PushNotificationEventData redact(PushNotificationEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PushNotificationEventData.copy$default(value, null, null, null, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PushNotificationEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new PushNotificationEventData(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
