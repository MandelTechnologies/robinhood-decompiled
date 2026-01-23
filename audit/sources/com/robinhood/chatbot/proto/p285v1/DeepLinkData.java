package com.robinhood.chatbot.proto.p285v1;

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

/* compiled from: DeepLinkData.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J0\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/DeepLinkData;", "Lcom/squareup/wire/Message;", "", "deeplink", "", "open_in_same_window", "", "logging_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lokio/ByteString;)V", "getDeeplink", "()Ljava/lang/String;", "getOpen_in_same_window", "()Z", "getLogging_id", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class DeepLinkData extends Message {

    @JvmField
    public static final ProtoAdapter<DeepLinkData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingId", schemaIndex = 2, tag = 3)
    private final String logging_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "openInSameWindow", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean open_in_same_window;

    public DeepLinkData() {
        this(null, false, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20485newBuilder();
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public /* synthetic */ DeepLinkData(String str, boolean z, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final boolean getOpen_in_same_window() {
        return this.open_in_same_window;
    }

    public final String getLogging_id() {
        return this.logging_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLinkData(String deeplink, boolean z, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.deeplink = deeplink;
        this.open_in_same_window = z;
        this.logging_id = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20485newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DeepLinkData)) {
            return false;
        }
        DeepLinkData deepLinkData = (DeepLinkData) other;
        return Intrinsics.areEqual(unknownFields(), deepLinkData.unknownFields()) && Intrinsics.areEqual(this.deeplink, deepLinkData.deeplink) && this.open_in_same_window == deepLinkData.open_in_same_window && Intrinsics.areEqual(this.logging_id, deepLinkData.logging_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.deeplink.hashCode()) * 37) + Boolean.hashCode(this.open_in_same_window)) * 37;
        String str = this.logging_id;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("deeplink=" + Internal.sanitize(this.deeplink));
        arrayList.add("open_in_same_window=" + this.open_in_same_window);
        String str = this.logging_id;
        if (str != null) {
            arrayList.add("logging_id=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DeepLinkData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DeepLinkData copy$default(DeepLinkData deepLinkData, String str, boolean z, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deepLinkData.deeplink;
        }
        if ((i & 2) != 0) {
            z = deepLinkData.open_in_same_window;
        }
        if ((i & 4) != 0) {
            str2 = deepLinkData.logging_id;
        }
        if ((i & 8) != 0) {
            byteString = deepLinkData.unknownFields();
        }
        return deepLinkData.copy(str, z, str2, byteString);
    }

    public final DeepLinkData copy(String deeplink, boolean open_in_same_window, String logging_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DeepLinkData(deeplink, open_in_same_window, logging_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DeepLinkData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DeepLinkData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.DeepLinkData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DeepLinkData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDeeplink());
                }
                if (value.getOpen_in_same_window()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getOpen_in_same_window()));
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLogging_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DeepLinkData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDeeplink());
                }
                if (value.getOpen_in_same_window()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getOpen_in_same_window()));
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLogging_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DeepLinkData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getLogging_id());
                if (value.getOpen_in_same_window()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getOpen_in_same_window()));
                }
                if (Intrinsics.areEqual(value.getDeeplink(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getDeeplink());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DeepLinkData redact(DeepLinkData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DeepLinkData.copy$default(value, null, false, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DeepLinkData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DeepLinkData(strDecode, zBooleanValue, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
