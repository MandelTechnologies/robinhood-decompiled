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

/* compiled from: SMSData.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SMSData;", "Lcom/squareup/wire/Message;", "", "recipient", "", "sender", "message", "type", "provider", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getRecipient", "()Ljava/lang/String;", "getSender", "getMessage", "getType", "getProvider", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class SMSData extends Message {

    @JvmField
    public static final ProtoAdapter<SMSData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String provider;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String recipient;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String sender;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String type;

    public SMSData() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ SMSData(String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24551newBuilder();
    }

    public final String getRecipient() {
        return this.recipient;
    }

    public final String getSender() {
        return this.sender;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getType() {
        return this.type;
    }

    public final String getProvider() {
        return this.provider;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SMSData(String recipient, String sender, String message, String type2, String provider, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.recipient = recipient;
        this.sender = sender;
        this.message = message;
        this.type = type2;
        this.provider = provider;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24551newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SMSData)) {
            return false;
        }
        SMSData sMSData = (SMSData) other;
        return Intrinsics.areEqual(unknownFields(), sMSData.unknownFields()) && Intrinsics.areEqual(this.recipient, sMSData.recipient) && Intrinsics.areEqual(this.sender, sMSData.sender) && Intrinsics.areEqual(this.message, sMSData.message) && Intrinsics.areEqual(this.type, sMSData.type) && Intrinsics.areEqual(this.provider, sMSData.provider);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.recipient.hashCode()) * 37) + this.sender.hashCode()) * 37) + this.message.hashCode()) * 37) + this.type.hashCode()) * 37) + this.provider.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("recipient=" + Internal.sanitize(this.recipient));
        arrayList.add("sender=" + Internal.sanitize(this.sender));
        arrayList.add("message=" + Internal.sanitize(this.message));
        arrayList.add("type=" + Internal.sanitize(this.type));
        arrayList.add("provider=" + Internal.sanitize(this.provider));
        return CollectionsKt.joinToString$default(arrayList, ", ", "SMSData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SMSData copy$default(SMSData sMSData, String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sMSData.recipient;
        }
        if ((i & 2) != 0) {
            str2 = sMSData.sender;
        }
        if ((i & 4) != 0) {
            str3 = sMSData.message;
        }
        if ((i & 8) != 0) {
            str4 = sMSData.type;
        }
        if ((i & 16) != 0) {
            str5 = sMSData.provider;
        }
        if ((i & 32) != 0) {
            byteString = sMSData.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        return sMSData.copy(str, str2, str3, str4, str6, byteString2);
    }

    public final SMSData copy(String recipient, String sender, String message, String type2, String provider, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SMSData(recipient, sender, message, type2, provider, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SMSData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SMSData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.SMSData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SMSData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRecipient(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRecipient());
                }
                if (!Intrinsics.areEqual(value.getSender(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSender());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getMessage());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getType());
                }
                return !Intrinsics.areEqual(value.getProvider(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getProvider()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SMSData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRecipient(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRecipient());
                }
                if (!Intrinsics.areEqual(value.getSender(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSender());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMessage());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getProvider(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getProvider());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SMSData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getProvider(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getProvider());
                }
                if (!Intrinsics.areEqual(value.getType(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMessage());
                }
                if (!Intrinsics.areEqual(value.getSender(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSender());
                }
                if (Intrinsics.areEqual(value.getRecipient(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRecipient());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SMSData redact(SMSData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SMSData.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SMSData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SMSData(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
