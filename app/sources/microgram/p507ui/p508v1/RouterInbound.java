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
import microgram.p507ui.p508v1.RouterInbound;
import okio.ByteString;

/* compiled from: RouterInbound.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005!\"#$%BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J@\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, m3636d2 = {"Lmicrogram/ui/v1/RouterInbound;", "Lcom/squareup/wire/Message;", "", "teardown", "Lmicrogram/ui/v1/RouterInbound$Teardown;", "alert_action_triggered", "Lmicrogram/ui/v1/RouterInbound$AlertActionTriggered;", "toast_action_triggered", "Lmicrogram/ui/v1/RouterInbound$ToastActionTriggered;", "toast_dismissed", "Lmicrogram/ui/v1/RouterInbound$ToastDismissed;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/ui/v1/RouterInbound$Teardown;Lmicrogram/ui/v1/RouterInbound$AlertActionTriggered;Lmicrogram/ui/v1/RouterInbound$ToastActionTriggered;Lmicrogram/ui/v1/RouterInbound$ToastDismissed;Lokio/ByteString;)V", "getTeardown", "()Lmicrogram/ui/v1/RouterInbound$Teardown;", "getAlert_action_triggered", "()Lmicrogram/ui/v1/RouterInbound$AlertActionTriggered;", "getToast_action_triggered", "()Lmicrogram/ui/v1/RouterInbound$ToastActionTriggered;", "getToast_dismissed", "()Lmicrogram/ui/v1/RouterInbound$ToastDismissed;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Teardown", "AlertActionTriggered", "ToastActionTriggered", "ToastDismissed", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class RouterInbound extends Message {

    @JvmField
    public static final ProtoAdapter<RouterInbound> ADAPTER;

    @WireField(adapter = "microgram.ui.v1.RouterInbound$AlertActionTriggered#ADAPTER", jsonName = "alertActionTriggered", oneofName = "concrete", schemaIndex = 1, tag = 2)
    private final AlertActionTriggered alert_action_triggered;

    @WireField(adapter = "microgram.ui.v1.RouterInbound$Teardown#ADAPTER", oneofName = "concrete", schemaIndex = 0, tag = 1)
    private final Teardown teardown;

    @WireField(adapter = "microgram.ui.v1.RouterInbound$ToastActionTriggered#ADAPTER", jsonName = "toastActionTriggered", oneofName = "concrete", schemaIndex = 2, tag = 3)
    private final ToastActionTriggered toast_action_triggered;

    @WireField(adapter = "microgram.ui.v1.RouterInbound$ToastDismissed#ADAPTER", jsonName = "toastDismissed", oneofName = "concrete", schemaIndex = 3, tag = 4)
    private final ToastDismissed toast_dismissed;

    public RouterInbound() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29270newBuilder();
    }

    public final Teardown getTeardown() {
        return this.teardown;
    }

    public final AlertActionTriggered getAlert_action_triggered() {
        return this.alert_action_triggered;
    }

    public final ToastActionTriggered getToast_action_triggered() {
        return this.toast_action_triggered;
    }

    public final ToastDismissed getToast_dismissed() {
        return this.toast_dismissed;
    }

    public /* synthetic */ RouterInbound(Teardown teardown, AlertActionTriggered alertActionTriggered, ToastActionTriggered toastActionTriggered, ToastDismissed toastDismissed, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : teardown, (i & 2) != 0 ? null : alertActionTriggered, (i & 4) != 0 ? null : toastActionTriggered, (i & 8) != 0 ? null : toastDismissed, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterInbound(Teardown teardown, AlertActionTriggered alertActionTriggered, ToastActionTriggered toastActionTriggered, ToastDismissed toastDismissed, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.teardown = teardown;
        this.alert_action_triggered = alertActionTriggered;
        this.toast_action_triggered = toastActionTriggered;
        this.toast_dismissed = toastDismissed;
        if (Internal.countNonNull(teardown, alertActionTriggered, toastActionTriggered, toastDismissed, new Object[0]) > 1) {
            throw new IllegalArgumentException("At most one of teardown, alert_action_triggered, toast_action_triggered, toast_dismissed may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29270newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RouterInbound)) {
            return false;
        }
        RouterInbound routerInbound = (RouterInbound) other;
        return Intrinsics.areEqual(unknownFields(), routerInbound.unknownFields()) && Intrinsics.areEqual(this.teardown, routerInbound.teardown) && Intrinsics.areEqual(this.alert_action_triggered, routerInbound.alert_action_triggered) && Intrinsics.areEqual(this.toast_action_triggered, routerInbound.toast_action_triggered) && Intrinsics.areEqual(this.toast_dismissed, routerInbound.toast_dismissed);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Teardown teardown = this.teardown;
        int iHashCode2 = (iHashCode + (teardown != null ? teardown.hashCode() : 0)) * 37;
        AlertActionTriggered alertActionTriggered = this.alert_action_triggered;
        int iHashCode3 = (iHashCode2 + (alertActionTriggered != null ? alertActionTriggered.hashCode() : 0)) * 37;
        ToastActionTriggered toastActionTriggered = this.toast_action_triggered;
        int iHashCode4 = (iHashCode3 + (toastActionTriggered != null ? toastActionTriggered.hashCode() : 0)) * 37;
        ToastDismissed toastDismissed = this.toast_dismissed;
        int iHashCode5 = iHashCode4 + (toastDismissed != null ? toastDismissed.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Teardown teardown = this.teardown;
        if (teardown != null) {
            arrayList.add("teardown=" + teardown);
        }
        AlertActionTriggered alertActionTriggered = this.alert_action_triggered;
        if (alertActionTriggered != null) {
            arrayList.add("alert_action_triggered=" + alertActionTriggered);
        }
        ToastActionTriggered toastActionTriggered = this.toast_action_triggered;
        if (toastActionTriggered != null) {
            arrayList.add("toast_action_triggered=" + toastActionTriggered);
        }
        ToastDismissed toastDismissed = this.toast_dismissed;
        if (toastDismissed != null) {
            arrayList.add("toast_dismissed=" + toastDismissed);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RouterInbound{", "}", 0, null, null, 56, null);
    }

    public final RouterInbound copy(Teardown teardown, AlertActionTriggered alert_action_triggered, ToastActionTriggered toast_action_triggered, ToastDismissed toast_dismissed, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RouterInbound(teardown, alert_action_triggered, toast_action_triggered, toast_dismissed, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RouterInbound.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RouterInbound>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.RouterInbound$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RouterInbound value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + RouterInbound.Teardown.ADAPTER.encodedSizeWithTag(1, value.getTeardown()) + RouterInbound.AlertActionTriggered.ADAPTER.encodedSizeWithTag(2, value.getAlert_action_triggered()) + RouterInbound.ToastActionTriggered.ADAPTER.encodedSizeWithTag(3, value.getToast_action_triggered()) + RouterInbound.ToastDismissed.ADAPTER.encodedSizeWithTag(4, value.getToast_dismissed());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RouterInbound value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                RouterInbound.Teardown.ADAPTER.encodeWithTag(writer, 1, (int) value.getTeardown());
                RouterInbound.AlertActionTriggered.ADAPTER.encodeWithTag(writer, 2, (int) value.getAlert_action_triggered());
                RouterInbound.ToastActionTriggered.ADAPTER.encodeWithTag(writer, 3, (int) value.getToast_action_triggered());
                RouterInbound.ToastDismissed.ADAPTER.encodeWithTag(writer, 4, (int) value.getToast_dismissed());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RouterInbound value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                RouterInbound.ToastDismissed.ADAPTER.encodeWithTag(writer, 4, (int) value.getToast_dismissed());
                RouterInbound.ToastActionTriggered.ADAPTER.encodeWithTag(writer, 3, (int) value.getToast_action_triggered());
                RouterInbound.AlertActionTriggered.ADAPTER.encodeWithTag(writer, 2, (int) value.getAlert_action_triggered());
                RouterInbound.Teardown.ADAPTER.encodeWithTag(writer, 1, (int) value.getTeardown());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RouterInbound redact(RouterInbound value) {
                Intrinsics.checkNotNullParameter(value, "value");
                RouterInbound.Teardown teardown = value.getTeardown();
                RouterInbound.Teardown teardownRedact = teardown != null ? RouterInbound.Teardown.ADAPTER.redact(teardown) : null;
                RouterInbound.AlertActionTriggered alert_action_triggered = value.getAlert_action_triggered();
                RouterInbound.AlertActionTriggered alertActionTriggeredRedact = alert_action_triggered != null ? RouterInbound.AlertActionTriggered.ADAPTER.redact(alert_action_triggered) : null;
                RouterInbound.ToastActionTriggered toast_action_triggered = value.getToast_action_triggered();
                RouterInbound.ToastActionTriggered toastActionTriggeredRedact = toast_action_triggered != null ? RouterInbound.ToastActionTriggered.ADAPTER.redact(toast_action_triggered) : null;
                RouterInbound.ToastDismissed toast_dismissed = value.getToast_dismissed();
                return value.copy(teardownRedact, alertActionTriggeredRedact, toastActionTriggeredRedact, toast_dismissed != null ? RouterInbound.ToastDismissed.ADAPTER.redact(toast_dismissed) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RouterInbound decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                RouterInbound.Teardown teardownDecode = null;
                RouterInbound.AlertActionTriggered alertActionTriggeredDecode = null;
                RouterInbound.ToastActionTriggered toastActionTriggeredDecode = null;
                RouterInbound.ToastDismissed toastDismissedDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RouterInbound(teardownDecode, alertActionTriggeredDecode, toastActionTriggeredDecode, toastDismissedDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        teardownDecode = RouterInbound.Teardown.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        alertActionTriggeredDecode = RouterInbound.AlertActionTriggered.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        toastActionTriggeredDecode = RouterInbound.ToastActionTriggered.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        toastDismissedDecode = RouterInbound.ToastDismissed.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: RouterInbound.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lmicrogram/ui/v1/RouterInbound$Teardown;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Teardown extends Message {

        @JvmField
        public static final ProtoAdapter<Teardown> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public Teardown() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29272newBuilder();
        }

        public /* synthetic */ Teardown(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Teardown(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29272newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof Teardown) && Intrinsics.areEqual(unknownFields(), ((Teardown) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "Teardown{}";
        }

        public final Teardown copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Teardown(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Teardown.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Teardown>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.RouterInbound$Teardown$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RouterInbound.Teardown value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RouterInbound.Teardown value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RouterInbound.Teardown value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterInbound.Teardown redact(RouterInbound.Teardown value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterInbound.Teardown decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new RouterInbound.Teardown(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }
    }

    /* compiled from: RouterInbound.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/ui/v1/RouterInbound$AlertActionTriggered;", "Lcom/squareup/wire/Message;", "", "action", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getAction", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AlertActionTriggered extends Message {

        @JvmField
        public static final ProtoAdapter<AlertActionTriggered> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String action;

        /* JADX WARN: Multi-variable type inference failed */
        public AlertActionTriggered() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29271newBuilder();
        }

        public final String getAction() {
            return this.action;
        }

        public /* synthetic */ AlertActionTriggered(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlertActionTriggered(String action, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.action = action;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29271newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AlertActionTriggered)) {
                return false;
            }
            AlertActionTriggered alertActionTriggered = (AlertActionTriggered) other;
            return Intrinsics.areEqual(unknownFields(), alertActionTriggered.unknownFields()) && Intrinsics.areEqual(this.action, alertActionTriggered.action);
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
            return CollectionsKt.joinToString$default(arrayList, ", ", "AlertActionTriggered{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ AlertActionTriggered copy$default(AlertActionTriggered alertActionTriggered, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = alertActionTriggered.action;
            }
            if ((i & 2) != 0) {
                byteString = alertActionTriggered.unknownFields();
            }
            return alertActionTriggered.copy(str, byteString);
        }

        public final AlertActionTriggered copy(String action, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new AlertActionTriggered(action, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AlertActionTriggered.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<AlertActionTriggered>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.RouterInbound$AlertActionTriggered$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RouterInbound.AlertActionTriggered value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return !Intrinsics.areEqual(value.getAction(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAction()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RouterInbound.AlertActionTriggered value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getAction(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAction());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RouterInbound.AlertActionTriggered value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (Intrinsics.areEqual(value.getAction(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAction());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterInbound.AlertActionTriggered redact(RouterInbound.AlertActionTriggered value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return RouterInbound.AlertActionTriggered.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterInbound.AlertActionTriggered decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RouterInbound.AlertActionTriggered(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
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

    /* compiled from: RouterInbound.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lmicrogram/ui/v1/RouterInbound$ToastActionTriggered;", "Lcom/squareup/wire/Message;", "", "toast_id", "", "action", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getToast_id", "()Ljava/lang/String;", "getAction", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ToastActionTriggered extends Message {

        @JvmField
        public static final ProtoAdapter<ToastActionTriggered> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String action;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "toastId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String toast_id;

        public ToastActionTriggered() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ ToastActionTriggered(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29273newBuilder();
        }

        public final String getToast_id() {
            return this.toast_id;
        }

        public final String getAction() {
            return this.action;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ToastActionTriggered(String toast_id, String action, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(toast_id, "toast_id");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.toast_id = toast_id;
            this.action = action;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29273newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ToastActionTriggered)) {
                return false;
            }
            ToastActionTriggered toastActionTriggered = (ToastActionTriggered) other;
            return Intrinsics.areEqual(unknownFields(), toastActionTriggered.unknownFields()) && Intrinsics.areEqual(this.toast_id, toastActionTriggered.toast_id) && Intrinsics.areEqual(this.action, toastActionTriggered.action);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.toast_id.hashCode()) * 37) + this.action.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("toast_id=" + Internal.sanitize(this.toast_id));
            arrayList.add("action=" + Internal.sanitize(this.action));
            return CollectionsKt.joinToString$default(arrayList, ", ", "ToastActionTriggered{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ ToastActionTriggered copy$default(ToastActionTriggered toastActionTriggered, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toastActionTriggered.toast_id;
            }
            if ((i & 2) != 0) {
                str2 = toastActionTriggered.action;
            }
            if ((i & 4) != 0) {
                byteString = toastActionTriggered.unknownFields();
            }
            return toastActionTriggered.copy(str, str2, byteString);
        }

        public final ToastActionTriggered copy(String toast_id, String action, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(toast_id, "toast_id");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ToastActionTriggered(toast_id, action, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ToastActionTriggered.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ToastActionTriggered>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.RouterInbound$ToastActionTriggered$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RouterInbound.ToastActionTriggered value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getToast_id(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getToast_id());
                    }
                    return !Intrinsics.areEqual(value.getAction(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAction()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RouterInbound.ToastActionTriggered value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getToast_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getToast_id());
                    }
                    if (!Intrinsics.areEqual(value.getAction(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAction());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RouterInbound.ToastActionTriggered value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getAction(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAction());
                    }
                    if (Intrinsics.areEqual(value.getToast_id(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getToast_id());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterInbound.ToastActionTriggered redact(RouterInbound.ToastActionTriggered value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return RouterInbound.ToastActionTriggered.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterInbound.ToastActionTriggered decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RouterInbound.ToastActionTriggered(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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

    /* compiled from: RouterInbound.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/ui/v1/RouterInbound$ToastDismissed;", "Lcom/squareup/wire/Message;", "", "toast_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getToast_id", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ToastDismissed extends Message {

        @JvmField
        public static final ProtoAdapter<ToastDismissed> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "toastId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String toast_id;

        /* JADX WARN: Multi-variable type inference failed */
        public ToastDismissed() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29274newBuilder();
        }

        public final String getToast_id() {
            return this.toast_id;
        }

        public /* synthetic */ ToastDismissed(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ToastDismissed(String toast_id, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(toast_id, "toast_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.toast_id = toast_id;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29274newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ToastDismissed)) {
                return false;
            }
            ToastDismissed toastDismissed = (ToastDismissed) other;
            return Intrinsics.areEqual(unknownFields(), toastDismissed.unknownFields()) && Intrinsics.areEqual(this.toast_id, toastDismissed.toast_id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + this.toast_id.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("toast_id=" + Internal.sanitize(this.toast_id));
            return CollectionsKt.joinToString$default(arrayList, ", ", "ToastDismissed{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ ToastDismissed copy$default(ToastDismissed toastDismissed, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toastDismissed.toast_id;
            }
            if ((i & 2) != 0) {
                byteString = toastDismissed.unknownFields();
            }
            return toastDismissed.copy(str, byteString);
        }

        public final ToastDismissed copy(String toast_id, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(toast_id, "toast_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ToastDismissed(toast_id, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ToastDismissed.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ToastDismissed>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.RouterInbound$ToastDismissed$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RouterInbound.ToastDismissed decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RouterInbound.ToastDismissed(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RouterInbound.ToastDismissed value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return !Intrinsics.areEqual(value.getToast_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getToast_id()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RouterInbound.ToastDismissed value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getToast_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getToast_id());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RouterInbound.ToastDismissed value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (Intrinsics.areEqual(value.getToast_id(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getToast_id());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RouterInbound.ToastDismissed redact(RouterInbound.ToastDismissed value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return RouterInbound.ToastDismissed.copy$default(value, null, ByteString.EMPTY, 1, null);
                }
            };
        }
    }
}
