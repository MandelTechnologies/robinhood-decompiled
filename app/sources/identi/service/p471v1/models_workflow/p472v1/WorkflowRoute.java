package identi.service.p471v1.models_workflow.p472v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import identi.service.p471v1.models_workflow.p472v1.WorkflowRoute;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: WorkflowRoute.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRoute;", "Lcom/squareup/wire/Message;", "", "replace", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Replace;", "exit", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Replace;Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit;Lokio/ByteString;)V", "getReplace", "()Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Replace;", "getExit", "()Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Replace", "Exit", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class WorkflowRoute extends Message {

    @JvmField
    public static final ProtoAdapter<WorkflowRoute> ADAPTER;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.WorkflowRoute$Exit#ADAPTER", oneofName = "type", schemaIndex = 1, tag = 2)
    private final Exit exit;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.WorkflowRoute$Replace#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
    private final Replace replace;

    public WorkflowRoute() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28423newBuilder();
    }

    public final Replace getReplace() {
        return this.replace;
    }

    public final Exit getExit() {
        return this.exit;
    }

    public /* synthetic */ WorkflowRoute(Replace replace, Exit exit, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : replace, (i & 2) != 0 ? null : exit, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowRoute(Replace replace, Exit exit, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.replace = replace;
        this.exit = exit;
        if (Internal.countNonNull(replace, exit) > 1) {
            throw new IllegalArgumentException("At most one of replace, exit may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28423newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof WorkflowRoute)) {
            return false;
        }
        WorkflowRoute workflowRoute = (WorkflowRoute) other;
        return Intrinsics.areEqual(unknownFields(), workflowRoute.unknownFields()) && Intrinsics.areEqual(this.replace, workflowRoute.replace) && Intrinsics.areEqual(this.exit, workflowRoute.exit);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Replace replace = this.replace;
        int iHashCode2 = (iHashCode + (replace != null ? replace.hashCode() : 0)) * 37;
        Exit exit = this.exit;
        int iHashCode3 = iHashCode2 + (exit != null ? exit.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Replace replace = this.replace;
        if (replace != null) {
            arrayList.add("replace=" + replace);
        }
        Exit exit = this.exit;
        if (exit != null) {
            arrayList.add("exit=" + exit);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WorkflowRoute{", "}", 0, null, null, 56, null);
    }

    public final WorkflowRoute copy(Replace replace, Exit exit, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new WorkflowRoute(replace, exit, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WorkflowRoute.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<WorkflowRoute>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.WorkflowRoute$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(WorkflowRoute value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + WorkflowRoute.Replace.ADAPTER.encodedSizeWithTag(1, value.getReplace()) + WorkflowRoute.Exit.ADAPTER.encodedSizeWithTag(2, value.getExit());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, WorkflowRoute value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                WorkflowRoute.Replace.ADAPTER.encodeWithTag(writer, 1, (int) value.getReplace());
                WorkflowRoute.Exit.ADAPTER.encodeWithTag(writer, 2, (int) value.getExit());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, WorkflowRoute value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                WorkflowRoute.Exit.ADAPTER.encodeWithTag(writer, 2, (int) value.getExit());
                WorkflowRoute.Replace.ADAPTER.encodeWithTag(writer, 1, (int) value.getReplace());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public WorkflowRoute redact(WorkflowRoute value) {
                Intrinsics.checkNotNullParameter(value, "value");
                WorkflowRoute.Replace replace = value.getReplace();
                WorkflowRoute.Replace replaceRedact = replace != null ? WorkflowRoute.Replace.ADAPTER.redact(replace) : null;
                WorkflowRoute.Exit exit = value.getExit();
                return value.copy(replaceRedact, exit != null ? WorkflowRoute.Exit.ADAPTER.redact(exit) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public WorkflowRoute decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                WorkflowRoute.Replace replaceDecode = null;
                WorkflowRoute.Exit exitDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new WorkflowRoute(replaceDecode, exitDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        replaceDecode = WorkflowRoute.Replace.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        exitDecode = WorkflowRoute.Exit.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: WorkflowRoute.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Replace;", "Lcom/squareup/wire/Message;", "", "screen", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowScreen;Lokio/ByteString;)V", "getScreen", "()Lidenti/service/v1/models_workflow/v1/WorkflowScreen;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Replace extends Message {

        @JvmField
        public static final ProtoAdapter<Replace> ADAPTER;

        @WireField(adapter = "identi.service.v1.models_workflow.v1.WorkflowScreen#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final WorkflowScreen screen;

        /* JADX WARN: Multi-variable type inference failed */
        public Replace() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28425newBuilder();
        }

        public final WorkflowScreen getScreen() {
            return this.screen;
        }

        public /* synthetic */ Replace(WorkflowScreen workflowScreen, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : workflowScreen, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Replace(WorkflowScreen workflowScreen, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.screen = workflowScreen;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28425newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Replace)) {
                return false;
            }
            Replace replace = (Replace) other;
            return Intrinsics.areEqual(unknownFields(), replace.unknownFields()) && Intrinsics.areEqual(this.screen, replace.screen);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            WorkflowScreen workflowScreen = this.screen;
            int iHashCode2 = iHashCode + (workflowScreen != null ? workflowScreen.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            WorkflowScreen workflowScreen = this.screen;
            if (workflowScreen != null) {
                arrayList.add("screen=" + workflowScreen);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Replace{", "}", 0, null, null, 56, null);
        }

        public final Replace copy(WorkflowScreen screen, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Replace(screen, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Replace.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Replace>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.WorkflowRoute$Replace$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(WorkflowRoute.Replace value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getScreen() != null ? size + WorkflowScreen.ADAPTER.encodedSizeWithTag(1, value.getScreen()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, WorkflowRoute.Replace value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getScreen() != null) {
                        WorkflowScreen.ADAPTER.encodeWithTag(writer, 1, (int) value.getScreen());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, WorkflowRoute.Replace value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getScreen() != null) {
                        WorkflowScreen.ADAPTER.encodeWithTag(writer, 1, (int) value.getScreen());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public WorkflowRoute.Replace redact(WorkflowRoute.Replace value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    WorkflowScreen screen = value.getScreen();
                    return value.copy(screen != null ? WorkflowScreen.ADAPTER.redact(screen) : null, ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public WorkflowRoute.Replace decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    WorkflowScreen workflowScreenDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new WorkflowRoute.Replace(workflowScreenDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            workflowScreenDecode = WorkflowScreen.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }

    /* compiled from: WorkflowRoute.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit;", "Lcom/squareup/wire/Message;", "", "status", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit$Status;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit$Status;Lokio/ByteString;)V", "getStatus", "()Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit$Status;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Status", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Exit extends Message {

        @JvmField
        public static final ProtoAdapter<Exit> ADAPTER;

        @WireField(adapter = "identi.service.v1.models_workflow.v1.WorkflowRoute$Exit$Status#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final Status status;

        /* JADX WARN: Multi-variable type inference failed */
        public Exit() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28424newBuilder();
        }

        public final Status getStatus() {
            return this.status;
        }

        public /* synthetic */ Exit(Status status, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Status.STATUS_UNSPECIFIED : status, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Exit(Status status, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.status = status;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28424newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Exit)) {
                return false;
            }
            Exit exit = (Exit) other;
            return Intrinsics.areEqual(unknownFields(), exit.unknownFields()) && this.status == exit.status;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + this.status.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("status=" + this.status);
            return CollectionsKt.joinToString$default(arrayList, ", ", "Exit{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Exit copy$default(Exit exit, Status status, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                status = exit.status;
            }
            if ((i & 2) != 0) {
                byteString = exit.unknownFields();
            }
            return exit.copy(status, byteString);
        }

        public final Exit copy(Status status, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Exit(status, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Exit.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Exit>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.WorkflowRoute$Exit$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(WorkflowRoute.Exit value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getStatus() != WorkflowRoute.Exit.Status.STATUS_UNSPECIFIED ? size + WorkflowRoute.Exit.Status.ADAPTER.encodedSizeWithTag(1, value.getStatus()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, WorkflowRoute.Exit value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getStatus() != WorkflowRoute.Exit.Status.STATUS_UNSPECIFIED) {
                        WorkflowRoute.Exit.Status.ADAPTER.encodeWithTag(writer, 1, (int) value.getStatus());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, WorkflowRoute.Exit value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getStatus() != WorkflowRoute.Exit.Status.STATUS_UNSPECIFIED) {
                        WorkflowRoute.Exit.Status.ADAPTER.encodeWithTag(writer, 1, (int) value.getStatus());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public WorkflowRoute.Exit decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    WorkflowRoute.Exit.Status statusDecode = WorkflowRoute.Exit.Status.STATUS_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new WorkflowRoute.Exit(statusDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                statusDecode = WorkflowRoute.Exit.Status.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public WorkflowRoute.Exit redact(WorkflowRoute.Exit value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return WorkflowRoute.Exit.copy$default(value, null, ByteString.EMPTY, 1, null);
                }
            };
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WorkflowRoute.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit$Status;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATUS_UNSPECIFIED", "WORKFLOW_STATUS_APPROVED", "WORKFLOW_STATUS_USER_PENDING", "WORKFLOW_STATUS_INTERNAL_PENDING", "WORKFLOW_STATUS_DENIED", "WORKFLOW_STATUS_CANCELLED", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Status implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;

            @JvmField
            public static final ProtoAdapter<Status> ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Status STATUS_UNSPECIFIED;
            public static final Status WORKFLOW_STATUS_APPROVED;
            public static final Status WORKFLOW_STATUS_CANCELLED;
            public static final Status WORKFLOW_STATUS_DENIED;
            public static final Status WORKFLOW_STATUS_INTERNAL_PENDING;
            public static final Status WORKFLOW_STATUS_USER_PENDING;
            private final int value;

            private static final /* synthetic */ Status[] $values() {
                return new Status[]{STATUS_UNSPECIFIED, WORKFLOW_STATUS_APPROVED, WORKFLOW_STATUS_USER_PENDING, WORKFLOW_STATUS_INTERNAL_PENDING, WORKFLOW_STATUS_DENIED, WORKFLOW_STATUS_CANCELLED};
            }

            @JvmStatic
            public static final Status fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<Status> getEntries() {
                return $ENTRIES;
            }

            private Status(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final Status status = new Status("STATUS_UNSPECIFIED", 0, 0);
                STATUS_UNSPECIFIED = status;
                WORKFLOW_STATUS_APPROVED = new Status("WORKFLOW_STATUS_APPROVED", 1, 1);
                WORKFLOW_STATUS_USER_PENDING = new Status("WORKFLOW_STATUS_USER_PENDING", 2, 2);
                WORKFLOW_STATUS_INTERNAL_PENDING = new Status("WORKFLOW_STATUS_INTERNAL_PENDING", 3, 3);
                WORKFLOW_STATUS_DENIED = new Status("WORKFLOW_STATUS_DENIED", 4, 4);
                WORKFLOW_STATUS_CANCELLED = new Status("WORKFLOW_STATUS_CANCELLED", 5, 5);
                Status[] statusArr$values = $values();
                $VALUES = statusArr$values;
                $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Status.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<Status>(orCreateKotlinClass, syntax, status) { // from class: identi.service.v1.models_workflow.v1.WorkflowRoute$Exit$Status$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public WorkflowRoute.Exit.Status fromValue(int value) {
                        return WorkflowRoute.Exit.Status.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: WorkflowRoute.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit$Status$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit$Status;", "fromValue", "value", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final Status fromValue(int value) {
                    if (value == 0) {
                        return Status.STATUS_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return Status.WORKFLOW_STATUS_APPROVED;
                    }
                    if (value == 2) {
                        return Status.WORKFLOW_STATUS_USER_PENDING;
                    }
                    if (value == 3) {
                        return Status.WORKFLOW_STATUS_INTERNAL_PENDING;
                    }
                    if (value == 4) {
                        return Status.WORKFLOW_STATUS_DENIED;
                    }
                    if (value != 5) {
                        return null;
                    }
                    return Status.WORKFLOW_STATUS_CANCELLED;
                }
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }
        }
    }
}
