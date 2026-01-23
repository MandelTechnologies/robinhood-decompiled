package microgram.p507ui.p508v1;

import com.robinhood.compose.bento.component.alerts.BentoAlertSheet6;
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
import microgram.p507ui.p508v1.BottomSheetOutboundMessage;
import okio.ByteString;

/* compiled from: BottomSheetOutboundMessage.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lmicrogram/ui/v1/BottomSheetOutboundMessage;", "Lcom/squareup/wire/Message;", "", "update", "Lmicrogram/ui/v1/BottomSheetOutboundMessage$Update;", "dismiss", "Lmicrogram/ui/v1/BottomSheetOutboundMessage$Dismiss;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/ui/v1/BottomSheetOutboundMessage$Update;Lmicrogram/ui/v1/BottomSheetOutboundMessage$Dismiss;Lokio/ByteString;)V", "getUpdate", "()Lmicrogram/ui/v1/BottomSheetOutboundMessage$Update;", "getDismiss", "()Lmicrogram/ui/v1/BottomSheetOutboundMessage$Dismiss;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Update", BentoAlertSheet6.button2Title, "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class BottomSheetOutboundMessage extends Message {

    @JvmField
    public static final ProtoAdapter<BottomSheetOutboundMessage> ADAPTER;

    @WireField(adapter = "microgram.ui.v1.BottomSheetOutboundMessage$Dismiss#ADAPTER", oneofName = "concrete", schemaIndex = 1, tag = 2)
    private final Dismiss dismiss;

    @WireField(adapter = "microgram.ui.v1.BottomSheetOutboundMessage$Update#ADAPTER", oneofName = "concrete", schemaIndex = 0, tag = 1)
    private final Update update;

    public BottomSheetOutboundMessage() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29240newBuilder();
    }

    public final Update getUpdate() {
        return this.update;
    }

    public final Dismiss getDismiss() {
        return this.dismiss;
    }

    public /* synthetic */ BottomSheetOutboundMessage(Update update, Dismiss dismiss, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : update, (i & 2) != 0 ? null : dismiss, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetOutboundMessage(Update update, Dismiss dismiss, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.update = update;
        this.dismiss = dismiss;
        if (Internal.countNonNull(update, dismiss) > 1) {
            throw new IllegalArgumentException("At most one of update, dismiss may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29240newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BottomSheetOutboundMessage)) {
            return false;
        }
        BottomSheetOutboundMessage bottomSheetOutboundMessage = (BottomSheetOutboundMessage) other;
        return Intrinsics.areEqual(unknownFields(), bottomSheetOutboundMessage.unknownFields()) && Intrinsics.areEqual(this.update, bottomSheetOutboundMessage.update) && Intrinsics.areEqual(this.dismiss, bottomSheetOutboundMessage.dismiss);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Update update = this.update;
        int iHashCode2 = (iHashCode + (update != null ? update.hashCode() : 0)) * 37;
        Dismiss dismiss = this.dismiss;
        int iHashCode3 = iHashCode2 + (dismiss != null ? dismiss.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Update update = this.update;
        if (update != null) {
            arrayList.add("update=" + update);
        }
        Dismiss dismiss = this.dismiss;
        if (dismiss != null) {
            arrayList.add("dismiss=" + dismiss);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BottomSheetOutboundMessage{", "}", 0, null, null, 56, null);
    }

    public final BottomSheetOutboundMessage copy(Update update, Dismiss dismiss, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BottomSheetOutboundMessage(update, dismiss, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BottomSheetOutboundMessage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BottomSheetOutboundMessage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.BottomSheetOutboundMessage$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BottomSheetOutboundMessage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + BottomSheetOutboundMessage.Update.ADAPTER.encodedSizeWithTag(1, value.getUpdate()) + BottomSheetOutboundMessage.Dismiss.ADAPTER.encodedSizeWithTag(2, value.getDismiss());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BottomSheetOutboundMessage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                BottomSheetOutboundMessage.Update.ADAPTER.encodeWithTag(writer, 1, (int) value.getUpdate());
                BottomSheetOutboundMessage.Dismiss.ADAPTER.encodeWithTag(writer, 2, (int) value.getDismiss());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BottomSheetOutboundMessage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                BottomSheetOutboundMessage.Dismiss.ADAPTER.encodeWithTag(writer, 2, (int) value.getDismiss());
                BottomSheetOutboundMessage.Update.ADAPTER.encodeWithTag(writer, 1, (int) value.getUpdate());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BottomSheetOutboundMessage redact(BottomSheetOutboundMessage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BottomSheetOutboundMessage.Update update = value.getUpdate();
                BottomSheetOutboundMessage.Update updateRedact = update != null ? BottomSheetOutboundMessage.Update.ADAPTER.redact(update) : null;
                BottomSheetOutboundMessage.Dismiss dismiss = value.getDismiss();
                return value.copy(updateRedact, dismiss != null ? BottomSheetOutboundMessage.Dismiss.ADAPTER.redact(dismiss) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BottomSheetOutboundMessage decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                BottomSheetOutboundMessage.Update updateDecode = null;
                BottomSheetOutboundMessage.Dismiss dismissDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BottomSheetOutboundMessage(updateDecode, dismissDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        updateDecode = BottomSheetOutboundMessage.Update.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        dismissDecode = BottomSheetOutboundMessage.Dismiss.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: BottomSheetOutboundMessage.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lmicrogram/ui/v1/BottomSheetOutboundMessage$Update;", "Lcom/squareup/wire/Message;", "", "content", "Lmicrogram/ui/v1/BottomSheetContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/ui/v1/BottomSheetContent;Lokio/ByteString;)V", "getContent", "()Lmicrogram/ui/v1/BottomSheetContent;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Update extends Message {

        @JvmField
        public static final ProtoAdapter<Update> ADAPTER;

        @WireField(adapter = "microgram.ui.v1.BottomSheetContent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final BottomSheetContent content;

        /* JADX WARN: Multi-variable type inference failed */
        public Update() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29242newBuilder();
        }

        public final BottomSheetContent getContent() {
            return this.content;
        }

        public /* synthetic */ Update(BottomSheetContent bottomSheetContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bottomSheetContent, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Update(BottomSheetContent bottomSheetContent, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.content = bottomSheetContent;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29242newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Update)) {
                return false;
            }
            Update update = (Update) other;
            return Intrinsics.areEqual(unknownFields(), update.unknownFields()) && Intrinsics.areEqual(this.content, update.content);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            BottomSheetContent bottomSheetContent = this.content;
            int iHashCode2 = iHashCode + (bottomSheetContent != null ? bottomSheetContent.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            BottomSheetContent bottomSheetContent = this.content;
            if (bottomSheetContent != null) {
                arrayList.add("content=" + bottomSheetContent);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Update{", "}", 0, null, null, 56, null);
        }

        public final Update copy(BottomSheetContent content, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Update(content, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Update.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Update>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.BottomSheetOutboundMessage$Update$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BottomSheetOutboundMessage.Update value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getContent() != null ? size + BottomSheetContent.ADAPTER.encodedSizeWithTag(1, value.getContent()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BottomSheetOutboundMessage.Update value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getContent() != null) {
                        BottomSheetContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getContent());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BottomSheetOutboundMessage.Update value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getContent() != null) {
                        BottomSheetContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getContent());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetOutboundMessage.Update redact(BottomSheetOutboundMessage.Update value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    BottomSheetContent content = value.getContent();
                    return value.copy(content != null ? BottomSheetContent.ADAPTER.redact(content) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetOutboundMessage.Update decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    BottomSheetContent bottomSheetContentDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new BottomSheetOutboundMessage.Update(bottomSheetContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            bottomSheetContentDecode = BottomSheetContent.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }

    /* compiled from: BottomSheetOutboundMessage.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lmicrogram/ui/v1/BottomSheetOutboundMessage$Dismiss;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Dismiss extends Message {

        @JvmField
        public static final ProtoAdapter<Dismiss> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public Dismiss() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29241newBuilder();
        }

        public /* synthetic */ Dismiss(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dismiss(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29241newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof Dismiss) && Intrinsics.areEqual(unknownFields(), ((Dismiss) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "Dismiss{}";
        }

        public final Dismiss copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Dismiss(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Dismiss.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Dismiss>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.BottomSheetOutboundMessage$Dismiss$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BottomSheetOutboundMessage.Dismiss value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BottomSheetOutboundMessage.Dismiss value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BottomSheetOutboundMessage.Dismiss value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetOutboundMessage.Dismiss redact(BottomSheetOutboundMessage.Dismiss value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BottomSheetOutboundMessage.Dismiss decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new BottomSheetOutboundMessage.Dismiss(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }
    }
}
