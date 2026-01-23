package microgram.p507ui.p508v1;

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
import microgram.p507ui.p508v1.ScreenEventMessage;
import okio.ByteString;
import rh_server_driven_ui.p531v1.StateContext;

/* compiled from: ScreenEventMessage.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006%&'()*BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016JL\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, m3636d2 = {"Lmicrogram/ui/v1/ScreenEventMessage;", "Lcom/squareup/wire/Message;", "", "action_triggered", "Lmicrogram/ui/v1/ScreenEventMessage$ActionTriggeredMessage;", "state_updated", "Lmicrogram/ui/v1/ScreenEventMessage$ScreenStateUpdatedMessage;", "appeared", "Lmicrogram/ui/v1/ScreenEventMessage$ScreenAppearedMessage;", "disappeared", "Lmicrogram/ui/v1/ScreenEventMessage$ScreenDisappearedMessage;", "teardown", "Lmicrogram/ui/v1/ScreenEventMessage$ScreenTeardownMessage;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/ui/v1/ScreenEventMessage$ActionTriggeredMessage;Lmicrogram/ui/v1/ScreenEventMessage$ScreenStateUpdatedMessage;Lmicrogram/ui/v1/ScreenEventMessage$ScreenAppearedMessage;Lmicrogram/ui/v1/ScreenEventMessage$ScreenDisappearedMessage;Lmicrogram/ui/v1/ScreenEventMessage$ScreenTeardownMessage;Lokio/ByteString;)V", "getAction_triggered", "()Lmicrogram/ui/v1/ScreenEventMessage$ActionTriggeredMessage;", "getState_updated", "()Lmicrogram/ui/v1/ScreenEventMessage$ScreenStateUpdatedMessage;", "getAppeared", "()Lmicrogram/ui/v1/ScreenEventMessage$ScreenAppearedMessage;", "getDisappeared", "()Lmicrogram/ui/v1/ScreenEventMessage$ScreenDisappearedMessage;", "getTeardown", "()Lmicrogram/ui/v1/ScreenEventMessage$ScreenTeardownMessage;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ActionTriggeredMessage", "ScreenStateUpdatedMessage", "ScreenAppearedMessage", "ScreenDisappearedMessage", "ScreenTeardownMessage", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ScreenEventMessage extends Message {

    @JvmField
    public static final ProtoAdapter<ScreenEventMessage> ADAPTER;

    @WireField(adapter = "microgram.ui.v1.ScreenEventMessage$ActionTriggeredMessage#ADAPTER", jsonName = "actionTriggered", oneofName = "concrete", schemaIndex = 0, tag = 1)
    private final ActionTriggeredMessage action_triggered;

    @WireField(adapter = "microgram.ui.v1.ScreenEventMessage$ScreenAppearedMessage#ADAPTER", oneofName = "concrete", schemaIndex = 2, tag = 3)
    private final ScreenAppearedMessage appeared;

    @WireField(adapter = "microgram.ui.v1.ScreenEventMessage$ScreenDisappearedMessage#ADAPTER", oneofName = "concrete", schemaIndex = 3, tag = 4)
    private final ScreenDisappearedMessage disappeared;

    @WireField(adapter = "microgram.ui.v1.ScreenEventMessage$ScreenStateUpdatedMessage#ADAPTER", jsonName = "stateUpdated", oneofName = "concrete", schemaIndex = 1, tag = 2)
    private final ScreenStateUpdatedMessage state_updated;

    @WireField(adapter = "microgram.ui.v1.ScreenEventMessage$ScreenTeardownMessage#ADAPTER", oneofName = "concrete", schemaIndex = 4, tag = 5)
    private final ScreenTeardownMessage teardown;

    public ScreenEventMessage() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29291newBuilder();
    }

    public final ActionTriggeredMessage getAction_triggered() {
        return this.action_triggered;
    }

    public final ScreenStateUpdatedMessage getState_updated() {
        return this.state_updated;
    }

    public final ScreenAppearedMessage getAppeared() {
        return this.appeared;
    }

    public final ScreenDisappearedMessage getDisappeared() {
        return this.disappeared;
    }

    public final ScreenTeardownMessage getTeardown() {
        return this.teardown;
    }

    public /* synthetic */ ScreenEventMessage(ActionTriggeredMessage actionTriggeredMessage, ScreenStateUpdatedMessage screenStateUpdatedMessage, ScreenAppearedMessage screenAppearedMessage, ScreenDisappearedMessage screenDisappearedMessage, ScreenTeardownMessage screenTeardownMessage, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : actionTriggeredMessage, (i & 2) != 0 ? null : screenStateUpdatedMessage, (i & 4) != 0 ? null : screenAppearedMessage, (i & 8) != 0 ? null : screenDisappearedMessage, (i & 16) != 0 ? null : screenTeardownMessage, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenEventMessage(ActionTriggeredMessage actionTriggeredMessage, ScreenStateUpdatedMessage screenStateUpdatedMessage, ScreenAppearedMessage screenAppearedMessage, ScreenDisappearedMessage screenDisappearedMessage, ScreenTeardownMessage screenTeardownMessage, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.action_triggered = actionTriggeredMessage;
        this.state_updated = screenStateUpdatedMessage;
        this.appeared = screenAppearedMessage;
        this.disappeared = screenDisappearedMessage;
        this.teardown = screenTeardownMessage;
        if (Internal.countNonNull(actionTriggeredMessage, screenStateUpdatedMessage, screenAppearedMessage, screenDisappearedMessage, screenTeardownMessage) > 1) {
            throw new IllegalArgumentException("At most one of action_triggered, state_updated, appeared, disappeared, teardown may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29291newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ScreenEventMessage)) {
            return false;
        }
        ScreenEventMessage screenEventMessage = (ScreenEventMessage) other;
        return Intrinsics.areEqual(unknownFields(), screenEventMessage.unknownFields()) && Intrinsics.areEqual(this.action_triggered, screenEventMessage.action_triggered) && Intrinsics.areEqual(this.state_updated, screenEventMessage.state_updated) && Intrinsics.areEqual(this.appeared, screenEventMessage.appeared) && Intrinsics.areEqual(this.disappeared, screenEventMessage.disappeared) && Intrinsics.areEqual(this.teardown, screenEventMessage.teardown);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ActionTriggeredMessage actionTriggeredMessage = this.action_triggered;
        int iHashCode2 = (iHashCode + (actionTriggeredMessage != null ? actionTriggeredMessage.hashCode() : 0)) * 37;
        ScreenStateUpdatedMessage screenStateUpdatedMessage = this.state_updated;
        int iHashCode3 = (iHashCode2 + (screenStateUpdatedMessage != null ? screenStateUpdatedMessage.hashCode() : 0)) * 37;
        ScreenAppearedMessage screenAppearedMessage = this.appeared;
        int iHashCode4 = (iHashCode3 + (screenAppearedMessage != null ? screenAppearedMessage.hashCode() : 0)) * 37;
        ScreenDisappearedMessage screenDisappearedMessage = this.disappeared;
        int iHashCode5 = (iHashCode4 + (screenDisappearedMessage != null ? screenDisappearedMessage.hashCode() : 0)) * 37;
        ScreenTeardownMessage screenTeardownMessage = this.teardown;
        int iHashCode6 = iHashCode5 + (screenTeardownMessage != null ? screenTeardownMessage.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ActionTriggeredMessage actionTriggeredMessage = this.action_triggered;
        if (actionTriggeredMessage != null) {
            arrayList.add("action_triggered=" + actionTriggeredMessage);
        }
        ScreenStateUpdatedMessage screenStateUpdatedMessage = this.state_updated;
        if (screenStateUpdatedMessage != null) {
            arrayList.add("state_updated=" + screenStateUpdatedMessage);
        }
        ScreenAppearedMessage screenAppearedMessage = this.appeared;
        if (screenAppearedMessage != null) {
            arrayList.add("appeared=" + screenAppearedMessage);
        }
        ScreenDisappearedMessage screenDisappearedMessage = this.disappeared;
        if (screenDisappearedMessage != null) {
            arrayList.add("disappeared=" + screenDisappearedMessage);
        }
        ScreenTeardownMessage screenTeardownMessage = this.teardown;
        if (screenTeardownMessage != null) {
            arrayList.add("teardown=" + screenTeardownMessage);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScreenEventMessage{", "}", 0, null, null, 56, null);
    }

    public final ScreenEventMessage copy(ActionTriggeredMessage action_triggered, ScreenStateUpdatedMessage state_updated, ScreenAppearedMessage appeared, ScreenDisappearedMessage disappeared, ScreenTeardownMessage teardown, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ScreenEventMessage(action_triggered, state_updated, appeared, disappeared, teardown, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ScreenEventMessage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ScreenEventMessage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.ScreenEventMessage$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ScreenEventMessage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ScreenEventMessage.ActionTriggeredMessage.ADAPTER.encodedSizeWithTag(1, value.getAction_triggered()) + ScreenEventMessage.ScreenStateUpdatedMessage.ADAPTER.encodedSizeWithTag(2, value.getState_updated()) + ScreenEventMessage.ScreenAppearedMessage.ADAPTER.encodedSizeWithTag(3, value.getAppeared()) + ScreenEventMessage.ScreenDisappearedMessage.ADAPTER.encodedSizeWithTag(4, value.getDisappeared()) + ScreenEventMessage.ScreenTeardownMessage.ADAPTER.encodedSizeWithTag(5, value.getTeardown());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ScreenEventMessage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ScreenEventMessage.ActionTriggeredMessage.ADAPTER.encodeWithTag(writer, 1, (int) value.getAction_triggered());
                ScreenEventMessage.ScreenStateUpdatedMessage.ADAPTER.encodeWithTag(writer, 2, (int) value.getState_updated());
                ScreenEventMessage.ScreenAppearedMessage.ADAPTER.encodeWithTag(writer, 3, (int) value.getAppeared());
                ScreenEventMessage.ScreenDisappearedMessage.ADAPTER.encodeWithTag(writer, 4, (int) value.getDisappeared());
                ScreenEventMessage.ScreenTeardownMessage.ADAPTER.encodeWithTag(writer, 5, (int) value.getTeardown());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ScreenEventMessage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ScreenEventMessage.ScreenTeardownMessage.ADAPTER.encodeWithTag(writer, 5, (int) value.getTeardown());
                ScreenEventMessage.ScreenDisappearedMessage.ADAPTER.encodeWithTag(writer, 4, (int) value.getDisappeared());
                ScreenEventMessage.ScreenAppearedMessage.ADAPTER.encodeWithTag(writer, 3, (int) value.getAppeared());
                ScreenEventMessage.ScreenStateUpdatedMessage.ADAPTER.encodeWithTag(writer, 2, (int) value.getState_updated());
                ScreenEventMessage.ActionTriggeredMessage.ADAPTER.encodeWithTag(writer, 1, (int) value.getAction_triggered());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ScreenEventMessage redact(ScreenEventMessage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ScreenEventMessage.ActionTriggeredMessage action_triggered = value.getAction_triggered();
                ScreenEventMessage.ActionTriggeredMessage actionTriggeredMessageRedact = action_triggered != null ? ScreenEventMessage.ActionTriggeredMessage.ADAPTER.redact(action_triggered) : null;
                ScreenEventMessage.ScreenStateUpdatedMessage state_updated = value.getState_updated();
                ScreenEventMessage.ScreenStateUpdatedMessage screenStateUpdatedMessageRedact = state_updated != null ? ScreenEventMessage.ScreenStateUpdatedMessage.ADAPTER.redact(state_updated) : null;
                ScreenEventMessage.ScreenAppearedMessage appeared = value.getAppeared();
                ScreenEventMessage.ScreenAppearedMessage screenAppearedMessageRedact = appeared != null ? ScreenEventMessage.ScreenAppearedMessage.ADAPTER.redact(appeared) : null;
                ScreenEventMessage.ScreenDisappearedMessage disappeared = value.getDisappeared();
                ScreenEventMessage.ScreenDisappearedMessage screenDisappearedMessageRedact = disappeared != null ? ScreenEventMessage.ScreenDisappearedMessage.ADAPTER.redact(disappeared) : null;
                ScreenEventMessage.ScreenTeardownMessage teardown = value.getTeardown();
                return value.copy(actionTriggeredMessageRedact, screenStateUpdatedMessageRedact, screenAppearedMessageRedact, screenDisappearedMessageRedact, teardown != null ? ScreenEventMessage.ScreenTeardownMessage.ADAPTER.redact(teardown) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ScreenEventMessage decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ScreenEventMessage.ActionTriggeredMessage actionTriggeredMessageDecode = null;
                ScreenEventMessage.ScreenStateUpdatedMessage screenStateUpdatedMessageDecode = null;
                ScreenEventMessage.ScreenAppearedMessage screenAppearedMessageDecode = null;
                ScreenEventMessage.ScreenDisappearedMessage screenDisappearedMessageDecode = null;
                ScreenEventMessage.ScreenTeardownMessage screenTeardownMessageDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ScreenEventMessage(actionTriggeredMessageDecode, screenStateUpdatedMessageDecode, screenAppearedMessageDecode, screenDisappearedMessageDecode, screenTeardownMessageDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        actionTriggeredMessageDecode = ScreenEventMessage.ActionTriggeredMessage.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        screenStateUpdatedMessageDecode = ScreenEventMessage.ScreenStateUpdatedMessage.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        screenAppearedMessageDecode = ScreenEventMessage.ScreenAppearedMessage.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        screenDisappearedMessageDecode = ScreenEventMessage.ScreenDisappearedMessage.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        screenTeardownMessageDecode = ScreenEventMessage.ScreenTeardownMessage.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: ScreenEventMessage.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/ui/v1/ScreenEventMessage$ActionTriggeredMessage;", "Lcom/squareup/wire/Message;", "", "action", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getAction", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ActionTriggeredMessage extends Message {

        @JvmField
        public static final ProtoAdapter<ActionTriggeredMessage> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String action;

        /* JADX WARN: Multi-variable type inference failed */
        public ActionTriggeredMessage() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29292newBuilder();
        }

        public final String getAction() {
            return this.action;
        }

        public /* synthetic */ ActionTriggeredMessage(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionTriggeredMessage(String action, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.action = action;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29292newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ActionTriggeredMessage)) {
                return false;
            }
            ActionTriggeredMessage actionTriggeredMessage = (ActionTriggeredMessage) other;
            return Intrinsics.areEqual(unknownFields(), actionTriggeredMessage.unknownFields()) && Intrinsics.areEqual(this.action, actionTriggeredMessage.action);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + this.action.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("action=" + Internal.sanitize(this.action));
            return CollectionsKt.joinToString$default(arrayList, ", ", "ActionTriggeredMessage{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ ActionTriggeredMessage copy$default(ActionTriggeredMessage actionTriggeredMessage, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionTriggeredMessage.action;
            }
            if ((i & 2) != 0) {
                byteString = actionTriggeredMessage.unknownFields();
            }
            return actionTriggeredMessage.copy(str, byteString);
        }

        public final ActionTriggeredMessage copy(String action, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ActionTriggeredMessage(action, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActionTriggeredMessage.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ActionTriggeredMessage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.ScreenEventMessage$ActionTriggeredMessage$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ScreenEventMessage.ActionTriggeredMessage value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return !Intrinsics.areEqual(value.getAction(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAction()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ScreenEventMessage.ActionTriggeredMessage value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getAction(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAction());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ScreenEventMessage.ActionTriggeredMessage value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (Intrinsics.areEqual(value.getAction(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAction());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ScreenEventMessage.ActionTriggeredMessage redact(ScreenEventMessage.ActionTriggeredMessage value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return ScreenEventMessage.ActionTriggeredMessage.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ScreenEventMessage.ActionTriggeredMessage decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ScreenEventMessage.ActionTriggeredMessage(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }

    /* compiled from: ScreenEventMessage.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lmicrogram/ui/v1/ScreenEventMessage$ScreenStateUpdatedMessage;", "Lcom/squareup/wire/Message;", "", "state_context", "Lrh_server_driven_ui/v1/StateContext;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/StateContext;Lokio/ByteString;)V", "getState_context", "()Lrh_server_driven_ui/v1/StateContext;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ScreenStateUpdatedMessage extends Message {

        @JvmField
        public static final ProtoAdapter<ScreenStateUpdatedMessage> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.StateContext#ADAPTER", jsonName = "stateContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final StateContext state_context;

        /* JADX WARN: Multi-variable type inference failed */
        public ScreenStateUpdatedMessage() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29295newBuilder();
        }

        public final StateContext getState_context() {
            return this.state_context;
        }

        public /* synthetic */ ScreenStateUpdatedMessage(StateContext stateContext, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : stateContext, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreenStateUpdatedMessage(StateContext stateContext, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.state_context = stateContext;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29295newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ScreenStateUpdatedMessage)) {
                return false;
            }
            ScreenStateUpdatedMessage screenStateUpdatedMessage = (ScreenStateUpdatedMessage) other;
            return Intrinsics.areEqual(unknownFields(), screenStateUpdatedMessage.unknownFields()) && Intrinsics.areEqual(this.state_context, screenStateUpdatedMessage.state_context);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            StateContext stateContext = this.state_context;
            int iHashCode2 = iHashCode + (stateContext != null ? stateContext.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            StateContext stateContext = this.state_context;
            if (stateContext != null) {
                arrayList.add("state_context=" + stateContext);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ScreenStateUpdatedMessage{", "}", 0, null, null, 56, null);
        }

        public final ScreenStateUpdatedMessage copy(StateContext state_context, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ScreenStateUpdatedMessage(state_context, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ScreenStateUpdatedMessage.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ScreenStateUpdatedMessage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.ScreenEventMessage$ScreenStateUpdatedMessage$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ScreenEventMessage.ScreenStateUpdatedMessage value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getState_context() != null ? size + StateContext.ADAPTER.encodedSizeWithTag(1, value.getState_context()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ScreenEventMessage.ScreenStateUpdatedMessage value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getState_context() != null) {
                        StateContext.ADAPTER.encodeWithTag(writer, 1, (int) value.getState_context());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ScreenEventMessage.ScreenStateUpdatedMessage value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getState_context() != null) {
                        StateContext.ADAPTER.encodeWithTag(writer, 1, (int) value.getState_context());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ScreenEventMessage.ScreenStateUpdatedMessage redact(ScreenEventMessage.ScreenStateUpdatedMessage value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    StateContext state_context = value.getState_context();
                    return value.copy(state_context != null ? StateContext.ADAPTER.redact(state_context) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ScreenEventMessage.ScreenStateUpdatedMessage decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    StateContext stateContextDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ScreenEventMessage.ScreenStateUpdatedMessage(stateContextDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            stateContextDecode = StateContext.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }

    /* compiled from: ScreenEventMessage.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lmicrogram/ui/v1/ScreenEventMessage$ScreenAppearedMessage;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ScreenAppearedMessage extends Message {

        @JvmField
        public static final ProtoAdapter<ScreenAppearedMessage> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public ScreenAppearedMessage() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29293newBuilder();
        }

        public /* synthetic */ ScreenAppearedMessage(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreenAppearedMessage(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29293newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof ScreenAppearedMessage) && Intrinsics.areEqual(unknownFields(), ((ScreenAppearedMessage) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "ScreenAppearedMessage{}";
        }

        public final ScreenAppearedMessage copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ScreenAppearedMessage(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ScreenAppearedMessage.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ScreenAppearedMessage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.ScreenEventMessage$ScreenAppearedMessage$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ScreenEventMessage.ScreenAppearedMessage value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ScreenEventMessage.ScreenAppearedMessage value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ScreenEventMessage.ScreenAppearedMessage value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ScreenEventMessage.ScreenAppearedMessage redact(ScreenEventMessage.ScreenAppearedMessage value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ScreenEventMessage.ScreenAppearedMessage decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new ScreenEventMessage.ScreenAppearedMessage(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }
    }

    /* compiled from: ScreenEventMessage.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lmicrogram/ui/v1/ScreenEventMessage$ScreenDisappearedMessage;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ScreenDisappearedMessage extends Message {

        @JvmField
        public static final ProtoAdapter<ScreenDisappearedMessage> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public ScreenDisappearedMessage() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29294newBuilder();
        }

        public /* synthetic */ ScreenDisappearedMessage(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreenDisappearedMessage(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29294newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof ScreenDisappearedMessage) && Intrinsics.areEqual(unknownFields(), ((ScreenDisappearedMessage) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "ScreenDisappearedMessage{}";
        }

        public final ScreenDisappearedMessage copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ScreenDisappearedMessage(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ScreenDisappearedMessage.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ScreenDisappearedMessage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.ScreenEventMessage$ScreenDisappearedMessage$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ScreenEventMessage.ScreenDisappearedMessage decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new ScreenEventMessage.ScreenDisappearedMessage(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ScreenEventMessage.ScreenDisappearedMessage value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ScreenEventMessage.ScreenDisappearedMessage value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ScreenEventMessage.ScreenDisappearedMessage value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ScreenEventMessage.ScreenDisappearedMessage redact(ScreenEventMessage.ScreenDisappearedMessage value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: ScreenEventMessage.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lmicrogram/ui/v1/ScreenEventMessage$ScreenTeardownMessage;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ScreenTeardownMessage extends Message {

        @JvmField
        public static final ProtoAdapter<ScreenTeardownMessage> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public ScreenTeardownMessage() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29296newBuilder();
        }

        public /* synthetic */ ScreenTeardownMessage(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreenTeardownMessage(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29296newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof ScreenTeardownMessage) && Intrinsics.areEqual(unknownFields(), ((ScreenTeardownMessage) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "ScreenTeardownMessage{}";
        }

        public final ScreenTeardownMessage copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ScreenTeardownMessage(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ScreenTeardownMessage.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ScreenTeardownMessage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.ScreenEventMessage$ScreenTeardownMessage$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ScreenEventMessage.ScreenTeardownMessage decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new ScreenEventMessage.ScreenTeardownMessage(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ScreenEventMessage.ScreenTeardownMessage value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ScreenEventMessage.ScreenTeardownMessage value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ScreenEventMessage.ScreenTeardownMessage value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ScreenEventMessage.ScreenTeardownMessage redact(ScreenEventMessage.ScreenTeardownMessage value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }
}
