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

/* compiled from: AlertContext.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AlertContext;", "Lcom/squareup/wire/Message;", "", "alert_title", "", "alert_message", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAlert_title", "()Ljava/lang/String;", "getAlert_message", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class AlertContext extends Message {

    @JvmField
    public static final ProtoAdapter<AlertContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "alertMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String alert_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "alertTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String alert_title;

    public AlertContext() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ AlertContext(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24006newBuilder();
    }

    public final String getAlert_title() {
        return this.alert_title;
    }

    public final String getAlert_message() {
        return this.alert_message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertContext(String alert_title, String alert_message, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(alert_title, "alert_title");
        Intrinsics.checkNotNullParameter(alert_message, "alert_message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.alert_title = alert_title;
        this.alert_message = alert_message;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24006newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AlertContext)) {
            return false;
        }
        AlertContext alertContext = (AlertContext) other;
        return Intrinsics.areEqual(unknownFields(), alertContext.unknownFields()) && Intrinsics.areEqual(this.alert_title, alertContext.alert_title) && Intrinsics.areEqual(this.alert_message, alertContext.alert_message);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.alert_title.hashCode()) * 37) + this.alert_message.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("alert_title=" + Internal.sanitize(this.alert_title));
        arrayList.add("alert_message=" + Internal.sanitize(this.alert_message));
        return CollectionsKt.joinToString$default(arrayList, ", ", "AlertContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AlertContext copy$default(AlertContext alertContext, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alertContext.alert_title;
        }
        if ((i & 2) != 0) {
            str2 = alertContext.alert_message;
        }
        if ((i & 4) != 0) {
            byteString = alertContext.unknownFields();
        }
        return alertContext.copy(str, str2, byteString);
    }

    public final AlertContext copy(String alert_title, String alert_message, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(alert_title, "alert_title");
        Intrinsics.checkNotNullParameter(alert_message, "alert_message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AlertContext(alert_title, alert_message, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AlertContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AlertContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.AlertContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AlertContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAlert_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAlert_title());
                }
                return !Intrinsics.areEqual(value.getAlert_message(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAlert_message()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AlertContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAlert_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAlert_title());
                }
                if (!Intrinsics.areEqual(value.getAlert_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAlert_message());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AlertContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAlert_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAlert_message());
                }
                if (Intrinsics.areEqual(value.getAlert_title(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAlert_title());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AlertContext redact(AlertContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AlertContext.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AlertContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AlertContext(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
