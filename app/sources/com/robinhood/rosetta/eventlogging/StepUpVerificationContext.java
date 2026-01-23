package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.stepupverification.SuvConstants;
import com.robinhood.rosetta.eventlogging.StepUpVerificationContext;
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

/* compiled from: StepUpVerificationContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016JL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006\""}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext;", "Lcom/squareup/wire/Message;", "", "workflow_status", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext$WorkflowStatus;", SuvConstants.PARAM_WORKFLOW_ID, "", "screen_name", "block_id", "logging_identifier", "frontend_event_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext$WorkflowStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getWorkflow_status", "()Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext$WorkflowStatus;", "getWorkflow_id", "()Ljava/lang/String;", "getScreen_name", "getBlock_id", "getLogging_identifier", "getFrontend_event_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "WorkflowStatus", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class StepUpVerificationContext extends Message {

    @JvmField
    public static final ProtoAdapter<StepUpVerificationContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "blockId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String block_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "frontendEventId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String frontend_event_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screenName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String screen_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "workflowId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String workflow_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.StepUpVerificationContext$WorkflowStatus#ADAPTER", jsonName = "workflowStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final WorkflowStatus workflow_status;

    public StepUpVerificationContext() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24568newBuilder();
    }

    public final WorkflowStatus getWorkflow_status() {
        return this.workflow_status;
    }

    public /* synthetic */ StepUpVerificationContext(WorkflowStatus workflowStatus, String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? WorkflowStatus.WORKFLOW_STATUS_UNSPECIFIED : workflowStatus, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getWorkflow_id() {
        return this.workflow_id;
    }

    public final String getScreen_name() {
        return this.screen_name;
    }

    public final String getBlock_id() {
        return this.block_id;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public final String getFrontend_event_id() {
        return this.frontend_event_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepUpVerificationContext(WorkflowStatus workflow_status, String workflow_id, String screen_name, String block_id, String logging_identifier, String frontend_event_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(workflow_status, "workflow_status");
        Intrinsics.checkNotNullParameter(workflow_id, "workflow_id");
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(block_id, "block_id");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(frontend_event_id, "frontend_event_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.workflow_status = workflow_status;
        this.workflow_id = workflow_id;
        this.screen_name = screen_name;
        this.block_id = block_id;
        this.logging_identifier = logging_identifier;
        this.frontend_event_id = frontend_event_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24568newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StepUpVerificationContext)) {
            return false;
        }
        StepUpVerificationContext stepUpVerificationContext = (StepUpVerificationContext) other;
        return Intrinsics.areEqual(unknownFields(), stepUpVerificationContext.unknownFields()) && this.workflow_status == stepUpVerificationContext.workflow_status && Intrinsics.areEqual(this.workflow_id, stepUpVerificationContext.workflow_id) && Intrinsics.areEqual(this.screen_name, stepUpVerificationContext.screen_name) && Intrinsics.areEqual(this.block_id, stepUpVerificationContext.block_id) && Intrinsics.areEqual(this.logging_identifier, stepUpVerificationContext.logging_identifier) && Intrinsics.areEqual(this.frontend_event_id, stepUpVerificationContext.frontend_event_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.workflow_status.hashCode()) * 37) + this.workflow_id.hashCode()) * 37) + this.screen_name.hashCode()) * 37) + this.block_id.hashCode()) * 37) + this.logging_identifier.hashCode()) * 37) + this.frontend_event_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("workflow_status=" + this.workflow_status);
        arrayList.add("workflow_id=" + Internal.sanitize(this.workflow_id));
        arrayList.add("screen_name=" + Internal.sanitize(this.screen_name));
        arrayList.add("block_id=" + Internal.sanitize(this.block_id));
        arrayList.add("logging_identifier=" + Internal.sanitize(this.logging_identifier));
        arrayList.add("frontend_event_id=" + Internal.sanitize(this.frontend_event_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "StepUpVerificationContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StepUpVerificationContext copy$default(StepUpVerificationContext stepUpVerificationContext, WorkflowStatus workflowStatus, String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            workflowStatus = stepUpVerificationContext.workflow_status;
        }
        if ((i & 2) != 0) {
            str = stepUpVerificationContext.workflow_id;
        }
        if ((i & 4) != 0) {
            str2 = stepUpVerificationContext.screen_name;
        }
        if ((i & 8) != 0) {
            str3 = stepUpVerificationContext.block_id;
        }
        if ((i & 16) != 0) {
            str4 = stepUpVerificationContext.logging_identifier;
        }
        if ((i & 32) != 0) {
            str5 = stepUpVerificationContext.frontend_event_id;
        }
        if ((i & 64) != 0) {
            byteString = stepUpVerificationContext.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        String str7 = str4;
        String str8 = str2;
        return stepUpVerificationContext.copy(workflowStatus, str, str8, str3, str7, str6, byteString2);
    }

    public final StepUpVerificationContext copy(WorkflowStatus workflow_status, String workflow_id, String screen_name, String block_id, String logging_identifier, String frontend_event_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(workflow_status, "workflow_status");
        Intrinsics.checkNotNullParameter(workflow_id, "workflow_id");
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(block_id, "block_id");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(frontend_event_id, "frontend_event_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StepUpVerificationContext(workflow_status, workflow_id, screen_name, block_id, logging_identifier, frontend_event_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StepUpVerificationContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StepUpVerificationContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.StepUpVerificationContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StepUpVerificationContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getWorkflow_status() != StepUpVerificationContext.WorkflowStatus.WORKFLOW_STATUS_UNSPECIFIED) {
                    size += StepUpVerificationContext.WorkflowStatus.ADAPTER.encodedSizeWithTag(1, value.getWorkflow_status());
                }
                if (!Intrinsics.areEqual(value.getWorkflow_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getWorkflow_id());
                }
                if (!Intrinsics.areEqual(value.getScreen_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getScreen_name());
                }
                if (!Intrinsics.areEqual(value.getBlock_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getBlock_id());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getLogging_identifier());
                }
                return !Intrinsics.areEqual(value.getFrontend_event_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getFrontend_event_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StepUpVerificationContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getWorkflow_status() != StepUpVerificationContext.WorkflowStatus.WORKFLOW_STATUS_UNSPECIFIED) {
                    StepUpVerificationContext.WorkflowStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getWorkflow_status());
                }
                if (!Intrinsics.areEqual(value.getWorkflow_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getWorkflow_id());
                }
                if (!Intrinsics.areEqual(value.getScreen_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getScreen_name());
                }
                if (!Intrinsics.areEqual(value.getBlock_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getBlock_id());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLogging_identifier());
                }
                if (!Intrinsics.areEqual(value.getFrontend_event_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getFrontend_event_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StepUpVerificationContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getFrontend_event_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getFrontend_event_id());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLogging_identifier());
                }
                if (!Intrinsics.areEqual(value.getBlock_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getBlock_id());
                }
                if (!Intrinsics.areEqual(value.getScreen_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getScreen_name());
                }
                if (!Intrinsics.areEqual(value.getWorkflow_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getWorkflow_id());
                }
                if (value.getWorkflow_status() != StepUpVerificationContext.WorkflowStatus.WORKFLOW_STATUS_UNSPECIFIED) {
                    StepUpVerificationContext.WorkflowStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getWorkflow_status());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StepUpVerificationContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                StepUpVerificationContext.WorkflowStatus workflowStatusDecode = StepUpVerificationContext.WorkflowStatus.WORKFLOW_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                while (true) {
                    StepUpVerificationContext.WorkflowStatus workflowStatus = workflowStatusDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        workflowStatusDecode = StepUpVerificationContext.WorkflowStatus.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new StepUpVerificationContext(workflowStatus, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StepUpVerificationContext redact(StepUpVerificationContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return StepUpVerificationContext.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StepUpVerificationContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext$WorkflowStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "WORKFLOW_STATUS_UNSPECIFIED", "USER_PENDING", "INTERNAL_PENDING", "DENIED", "CANCELLED", "LOADING", "APPROVED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class WorkflowStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ WorkflowStatus[] $VALUES;

        @JvmField
        public static final ProtoAdapter<WorkflowStatus> ADAPTER;
        public static final WorkflowStatus APPROVED;
        public static final WorkflowStatus CANCELLED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final WorkflowStatus DENIED;
        public static final WorkflowStatus INTERNAL_PENDING;
        public static final WorkflowStatus LOADING;
        public static final WorkflowStatus USER_PENDING;
        public static final WorkflowStatus WORKFLOW_STATUS_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ WorkflowStatus[] $values() {
            return new WorkflowStatus[]{WORKFLOW_STATUS_UNSPECIFIED, USER_PENDING, INTERNAL_PENDING, DENIED, CANCELLED, LOADING, APPROVED};
        }

        @JvmStatic
        public static final WorkflowStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<WorkflowStatus> getEntries() {
            return $ENTRIES;
        }

        private WorkflowStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final WorkflowStatus workflowStatus = new WorkflowStatus("WORKFLOW_STATUS_UNSPECIFIED", 0, 0);
            WORKFLOW_STATUS_UNSPECIFIED = workflowStatus;
            USER_PENDING = new WorkflowStatus("USER_PENDING", 1, 1);
            INTERNAL_PENDING = new WorkflowStatus("INTERNAL_PENDING", 2, 2);
            DENIED = new WorkflowStatus("DENIED", 3, 3);
            CANCELLED = new WorkflowStatus("CANCELLED", 4, 4);
            LOADING = new WorkflowStatus("LOADING", 5, 5);
            APPROVED = new WorkflowStatus("APPROVED", 6, 6);
            WorkflowStatus[] workflowStatusArr$values = $values();
            $VALUES = workflowStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(workflowStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WorkflowStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<WorkflowStatus>(orCreateKotlinClass, syntax, workflowStatus) { // from class: com.robinhood.rosetta.eventlogging.StepUpVerificationContext$WorkflowStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public StepUpVerificationContext.WorkflowStatus fromValue(int value) {
                    return StepUpVerificationContext.WorkflowStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: StepUpVerificationContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext$WorkflowStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext$WorkflowStatus;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final WorkflowStatus fromValue(int value) {
                switch (value) {
                    case 0:
                        return WorkflowStatus.WORKFLOW_STATUS_UNSPECIFIED;
                    case 1:
                        return WorkflowStatus.USER_PENDING;
                    case 2:
                        return WorkflowStatus.INTERNAL_PENDING;
                    case 3:
                        return WorkflowStatus.DENIED;
                    case 4:
                        return WorkflowStatus.CANCELLED;
                    case 5:
                        return WorkflowStatus.LOADING;
                    case 6:
                        return WorkflowStatus.APPROVED;
                    default:
                        return null;
                }
            }
        }

        public static WorkflowStatus valueOf(String str) {
            return (WorkflowStatus) Enum.valueOf(WorkflowStatus.class, str);
        }

        public static WorkflowStatus[] values() {
            return (WorkflowStatus[]) $VALUES.clone();
        }
    }
}
