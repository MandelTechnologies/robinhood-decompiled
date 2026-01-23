package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.util.notification.RhGcmListenerService;
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

/* compiled from: NotificationContext.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001e\u001a\u00020\u0002H\u0017J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016Jj\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NotificationContext;", "Lcom/squareup/wire/Message;", "", "type", "", RhGcmListenerService.EXTRA_CATEGORY, "", "isFixed", "", "load_id", "card_id", "title", "message", "actionUrl", "actionIdentifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getType", "()Ljava/lang/String;", "getCategory", "()I", "()Z", "getLoad_id", "getCard_id", "getTitle", "getMessage", "getActionUrl", "getActionIdentifier", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class NotificationContext extends Message {

    @JvmField
    public static final ProtoAdapter<NotificationContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String actionIdentifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String actionUrl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cardId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String card_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean isFixed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loadId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String load_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String type;

    public NotificationContext() {
        this(null, 0, false, null, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ NotificationContext(String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24411newBuilder();
    }

    public final String getType() {
        return this.type;
    }

    public final int getCategory() {
        return this.category;
    }

    /* renamed from: isFixed, reason: from getter */
    public final boolean getIsFixed() {
        return this.isFixed;
    }

    public final String getLoad_id() {
        return this.load_id;
    }

    public final String getCard_id() {
        return this.card_id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getActionUrl() {
        return this.actionUrl;
    }

    public final String getActionIdentifier() {
        return this.actionIdentifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationContext(String type2, int i, boolean z, String load_id, String card_id, String title, String message, String actionUrl, String actionIdentifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(load_id, "load_id");
        Intrinsics.checkNotNullParameter(card_id, "card_id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(actionUrl, "actionUrl");
        Intrinsics.checkNotNullParameter(actionIdentifier, "actionIdentifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.category = i;
        this.isFixed = z;
        this.load_id = load_id;
        this.card_id = card_id;
        this.title = title;
        this.message = message;
        this.actionUrl = actionUrl;
        this.actionIdentifier = actionIdentifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24411newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NotificationContext)) {
            return false;
        }
        NotificationContext notificationContext = (NotificationContext) other;
        return Intrinsics.areEqual(unknownFields(), notificationContext.unknownFields()) && Intrinsics.areEqual(this.type, notificationContext.type) && this.category == notificationContext.category && this.isFixed == notificationContext.isFixed && Intrinsics.areEqual(this.load_id, notificationContext.load_id) && Intrinsics.areEqual(this.card_id, notificationContext.card_id) && Intrinsics.areEqual(this.title, notificationContext.title) && Intrinsics.areEqual(this.message, notificationContext.message) && Intrinsics.areEqual(this.actionUrl, notificationContext.actionUrl) && Intrinsics.areEqual(this.actionIdentifier, notificationContext.actionIdentifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + Integer.hashCode(this.category)) * 37) + java.lang.Boolean.hashCode(this.isFixed)) * 37) + this.load_id.hashCode()) * 37) + this.card_id.hashCode()) * 37) + this.title.hashCode()) * 37) + this.message.hashCode()) * 37) + this.actionUrl.hashCode()) * 37) + this.actionIdentifier.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + Internal.sanitize(this.type));
        arrayList.add("category=" + this.category);
        arrayList.add("isFixed=" + this.isFixed);
        arrayList.add("load_id=" + Internal.sanitize(this.load_id));
        arrayList.add("card_id=" + Internal.sanitize(this.card_id));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("message=" + Internal.sanitize(this.message));
        arrayList.add("actionUrl=" + Internal.sanitize(this.actionUrl));
        arrayList.add("actionIdentifier=" + Internal.sanitize(this.actionIdentifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "NotificationContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NotificationContext copy$default(NotificationContext notificationContext, String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = notificationContext.type;
        }
        if ((i2 & 2) != 0) {
            i = notificationContext.category;
        }
        if ((i2 & 4) != 0) {
            z = notificationContext.isFixed;
        }
        if ((i2 & 8) != 0) {
            str2 = notificationContext.load_id;
        }
        if ((i2 & 16) != 0) {
            str3 = notificationContext.card_id;
        }
        if ((i2 & 32) != 0) {
            str4 = notificationContext.title;
        }
        if ((i2 & 64) != 0) {
            str5 = notificationContext.message;
        }
        if ((i2 & 128) != 0) {
            str6 = notificationContext.actionUrl;
        }
        if ((i2 & 256) != 0) {
            str7 = notificationContext.actionIdentifier;
        }
        if ((i2 & 512) != 0) {
            byteString = notificationContext.unknownFields();
        }
        String str8 = str7;
        ByteString byteString2 = byteString;
        String str9 = str5;
        String str10 = str6;
        String str11 = str3;
        String str12 = str4;
        return notificationContext.copy(str, i, z, str2, str11, str12, str9, str10, str8, byteString2);
    }

    public final NotificationContext copy(String type2, int category, boolean isFixed, String load_id, String card_id, String title, String message, String actionUrl, String actionIdentifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(load_id, "load_id");
        Intrinsics.checkNotNullParameter(card_id, "card_id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(actionUrl, "actionUrl");
        Intrinsics.checkNotNullParameter(actionIdentifier, "actionIdentifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NotificationContext(type2, category, isFixed, load_id, card_id, title, message, actionUrl, actionIdentifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NotificationContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NotificationContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.NotificationContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NotificationContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getType());
                }
                if (value.getCategory() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getCategory()));
                }
                if (value.getIsFixed()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, java.lang.Boolean.valueOf(value.getIsFixed()));
                }
                if (!Intrinsics.areEqual(value.getLoad_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getLoad_id());
                }
                if (!Intrinsics.areEqual(value.getCard_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getCard_id());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getMessage());
                }
                if (!Intrinsics.areEqual(value.getActionUrl(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getActionUrl());
                }
                return !Intrinsics.areEqual(value.getActionIdentifier(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(9, value.getActionIdentifier()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NotificationContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getType());
                }
                if (value.getCategory() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getCategory()));
                }
                if (value.getIsFixed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getIsFixed()));
                }
                if (!Intrinsics.areEqual(value.getLoad_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLoad_id());
                }
                if (!Intrinsics.areEqual(value.getCard_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCard_id());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMessage());
                }
                if (!Intrinsics.areEqual(value.getActionUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getActionUrl());
                }
                if (!Intrinsics.areEqual(value.getActionIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getActionIdentifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NotificationContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getActionIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getActionIdentifier());
                }
                if (!Intrinsics.areEqual(value.getActionUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getActionUrl());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getMessage());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getCard_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCard_id());
                }
                if (!Intrinsics.areEqual(value.getLoad_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLoad_id());
                }
                if (value.getIsFixed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getIsFixed()));
                }
                if (value.getCategory() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getCategory()));
                }
                if (Intrinsics.areEqual(value.getType(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getType());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NotificationContext redact(NotificationContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return NotificationContext.copy$default(value, null, 0, false, null, null, null, null, null, null, ByteString.EMPTY, 511, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NotificationContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                int iIntValue = 0;
                boolean zBooleanValue = false;
                String strDecode7 = strDecode6;
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
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 4:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
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
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new NotificationContext(strDecode, iIntValue, zBooleanValue, strDecode7, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
