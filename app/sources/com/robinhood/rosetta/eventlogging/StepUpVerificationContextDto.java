package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.lib.stepupverification.SuvConstants;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.StepUpVerificationContext;
import com.robinhood.rosetta.eventlogging.StepUpVerificationContextDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: StepUpVerificationContextDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005()*+,B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u0010JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$Surrogate;)V", "workflow_status", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;", SuvConstants.PARAM_WORKFLOW_ID, "", "screen_name", "block_id", "logging_identifier", "frontend_event_id", "(Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getWorkflow_status", "()Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;", "getWorkflow_id", "()Ljava/lang/String;", "getScreen_name", "getBlock_id", "getLogging_identifier", "getFrontend_event_id", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "WorkflowStatusDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class StepUpVerificationContextDto implements Dto3<StepUpVerificationContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StepUpVerificationContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StepUpVerificationContextDto, StepUpVerificationContext>> binaryBase64Serializer$delegate;
    private static final StepUpVerificationContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StepUpVerificationContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StepUpVerificationContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final WorkflowStatusDto getWorkflow_status() {
        return this.surrogate.getWorkflow_status();
    }

    public final String getWorkflow_id() {
        return this.surrogate.getWorkflow_id();
    }

    public final String getScreen_name() {
        return this.surrogate.getScreen_name();
    }

    public final String getBlock_id() {
        return this.surrogate.getBlock_id();
    }

    public final String getLogging_identifier() {
        return this.surrogate.getLogging_identifier();
    }

    public final String getFrontend_event_id() {
        return this.surrogate.getFrontend_event_id();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ StepUpVerificationContextDto(com.robinhood.rosetta.eventlogging.StepUpVerificationContextDto.WorkflowStatusDto r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto La
            com.robinhood.rosetta.eventlogging.StepUpVerificationContextDto$WorkflowStatusDto$Companion r2 = com.robinhood.rosetta.eventlogging.StepUpVerificationContextDto.WorkflowStatusDto.INSTANCE
            com.robinhood.rosetta.eventlogging.StepUpVerificationContextDto$WorkflowStatusDto r2 = r2.getZeroValue()
        La:
            r9 = r8 & 2
            java.lang.String r0 = ""
            if (r9 == 0) goto L11
            r3 = r0
        L11:
            r9 = r8 & 4
            if (r9 == 0) goto L16
            r4 = r0
        L16:
            r9 = r8 & 8
            if (r9 == 0) goto L1b
            r5 = r0
        L1b:
            r9 = r8 & 16
            if (r9 == 0) goto L20
            r6 = r0
        L20:
            r8 = r8 & 32
            if (r8 == 0) goto L2c
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L33
        L2c:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L33:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.StepUpVerificationContextDto.<init>(com.robinhood.rosetta.eventlogging.StepUpVerificationContextDto$WorkflowStatusDto, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StepUpVerificationContextDto(WorkflowStatusDto workflow_status, String workflow_id, String screen_name, String block_id, String logging_identifier, String frontend_event_id) {
        this(new Surrogate(workflow_status, workflow_id, screen_name, block_id, logging_identifier, frontend_event_id));
        Intrinsics.checkNotNullParameter(workflow_status, "workflow_status");
        Intrinsics.checkNotNullParameter(workflow_id, "workflow_id");
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(block_id, "block_id");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(frontend_event_id, "frontend_event_id");
    }

    public static /* synthetic */ StepUpVerificationContextDto copy$default(StepUpVerificationContextDto stepUpVerificationContextDto, WorkflowStatusDto workflowStatusDto, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            workflowStatusDto = stepUpVerificationContextDto.surrogate.getWorkflow_status();
        }
        if ((i & 2) != 0) {
            str = stepUpVerificationContextDto.surrogate.getWorkflow_id();
        }
        if ((i & 4) != 0) {
            str2 = stepUpVerificationContextDto.surrogate.getScreen_name();
        }
        if ((i & 8) != 0) {
            str3 = stepUpVerificationContextDto.surrogate.getBlock_id();
        }
        if ((i & 16) != 0) {
            str4 = stepUpVerificationContextDto.surrogate.getLogging_identifier();
        }
        if ((i & 32) != 0) {
            str5 = stepUpVerificationContextDto.surrogate.getFrontend_event_id();
        }
        String str6 = str4;
        String str7 = str5;
        return stepUpVerificationContextDto.copy(workflowStatusDto, str, str2, str3, str6, str7);
    }

    public final StepUpVerificationContextDto copy(WorkflowStatusDto workflow_status, String workflow_id, String screen_name, String block_id, String logging_identifier, String frontend_event_id) {
        Intrinsics.checkNotNullParameter(workflow_status, "workflow_status");
        Intrinsics.checkNotNullParameter(workflow_id, "workflow_id");
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(block_id, "block_id");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(frontend_event_id, "frontend_event_id");
        return new StepUpVerificationContextDto(new Surrogate(workflow_status, workflow_id, screen_name, block_id, logging_identifier, frontend_event_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public StepUpVerificationContext toProto() {
        return new StepUpVerificationContext((StepUpVerificationContext.WorkflowStatus) this.surrogate.getWorkflow_status().toProto(), this.surrogate.getWorkflow_id(), this.surrogate.getScreen_name(), this.surrogate.getBlock_id(), this.surrogate.getLogging_identifier(), this.surrogate.getFrontend_event_id(), null, 64, null);
    }

    public String toString() {
        return "[StepUpVerificationContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StepUpVerificationContextDto) && Intrinsics.areEqual(((StepUpVerificationContextDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StepUpVerificationContextDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000245BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003JE\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\rHÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001J%\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\b3R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0017R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0017R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010\u0017¨\u00066"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$Surrogate;", "", "workflow_status", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;", SuvConstants.PARAM_WORKFLOW_ID, "", "screen_name", "block_id", "logging_identifier", "frontend_event_id", "<init>", "(Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getWorkflow_status$annotations", "()V", "getWorkflow_status", "()Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;", "getWorkflow_id$annotations", "getWorkflow_id", "()Ljava/lang/String;", "getScreen_name$annotations", "getScreen_name", "getBlock_id$annotations", "getBlock_id", "getLogging_identifier$annotations", "getLogging_identifier", "getFrontend_event_id$annotations", "getFrontend_event_id", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String block_id;
        private final String frontend_event_id;
        private final String logging_identifier;
        private final String screen_name;
        private final String workflow_id;
        private final WorkflowStatusDto workflow_status;

        public Surrogate() {
            this((WorkflowStatusDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, WorkflowStatusDto workflowStatusDto, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                workflowStatusDto = surrogate.workflow_status;
            }
            if ((i & 2) != 0) {
                str = surrogate.workflow_id;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.screen_name;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.block_id;
            }
            if ((i & 16) != 0) {
                str4 = surrogate.logging_identifier;
            }
            if ((i & 32) != 0) {
                str5 = surrogate.frontend_event_id;
            }
            String str6 = str4;
            String str7 = str5;
            return surrogate.copy(workflowStatusDto, str, str2, str3, str6, str7);
        }

        @SerialName("blockId")
        @JsonAnnotations2(names = {"block_id"})
        public static /* synthetic */ void getBlock_id$annotations() {
        }

        @SerialName("frontendEventId")
        @JsonAnnotations2(names = {"frontend_event_id"})
        public static /* synthetic */ void getFrontend_event_id$annotations() {
        }

        @SerialName("loggingIdentifier")
        @JsonAnnotations2(names = {"logging_identifier"})
        public static /* synthetic */ void getLogging_identifier$annotations() {
        }

        @SerialName("screenName")
        @JsonAnnotations2(names = {"screen_name"})
        public static /* synthetic */ void getScreen_name$annotations() {
        }

        @SerialName("workflowId")
        @JsonAnnotations2(names = {SuvConstants.PARAM_WORKFLOW_ID})
        public static /* synthetic */ void getWorkflow_id$annotations() {
        }

        @SerialName("workflowStatus")
        @JsonAnnotations2(names = {"workflow_status"})
        public static /* synthetic */ void getWorkflow_status$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final WorkflowStatusDto getWorkflow_status() {
            return this.workflow_status;
        }

        /* renamed from: component2, reason: from getter */
        public final String getWorkflow_id() {
            return this.workflow_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getScreen_name() {
            return this.screen_name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBlock_id() {
            return this.block_id;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        /* renamed from: component6, reason: from getter */
        public final String getFrontend_event_id() {
            return this.frontend_event_id;
        }

        public final Surrogate copy(WorkflowStatusDto workflow_status, String workflow_id, String screen_name, String block_id, String logging_identifier, String frontend_event_id) {
            Intrinsics.checkNotNullParameter(workflow_status, "workflow_status");
            Intrinsics.checkNotNullParameter(workflow_id, "workflow_id");
            Intrinsics.checkNotNullParameter(screen_name, "screen_name");
            Intrinsics.checkNotNullParameter(block_id, "block_id");
            Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
            Intrinsics.checkNotNullParameter(frontend_event_id, "frontend_event_id");
            return new Surrogate(workflow_status, workflow_id, screen_name, block_id, logging_identifier, frontend_event_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.workflow_status == surrogate.workflow_status && Intrinsics.areEqual(this.workflow_id, surrogate.workflow_id) && Intrinsics.areEqual(this.screen_name, surrogate.screen_name) && Intrinsics.areEqual(this.block_id, surrogate.block_id) && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier) && Intrinsics.areEqual(this.frontend_event_id, surrogate.frontend_event_id);
        }

        public int hashCode() {
            return (((((((((this.workflow_status.hashCode() * 31) + this.workflow_id.hashCode()) * 31) + this.screen_name.hashCode()) * 31) + this.block_id.hashCode()) * 31) + this.logging_identifier.hashCode()) * 31) + this.frontend_event_id.hashCode();
        }

        public String toString() {
            return "Surrogate(workflow_status=" + this.workflow_status + ", workflow_id=" + this.workflow_id + ", screen_name=" + this.screen_name + ", block_id=" + this.block_id + ", logging_identifier=" + this.logging_identifier + ", frontend_event_id=" + this.frontend_event_id + ")";
        }

        /* compiled from: StepUpVerificationContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StepUpVerificationContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, WorkflowStatusDto workflowStatusDto, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            this.workflow_status = (i & 1) == 0 ? WorkflowStatusDto.INSTANCE.getZeroValue() : workflowStatusDto;
            if ((i & 2) == 0) {
                this.workflow_id = "";
            } else {
                this.workflow_id = str;
            }
            if ((i & 4) == 0) {
                this.screen_name = "";
            } else {
                this.screen_name = str2;
            }
            if ((i & 8) == 0) {
                this.block_id = "";
            } else {
                this.block_id = str3;
            }
            if ((i & 16) == 0) {
                this.logging_identifier = "";
            } else {
                this.logging_identifier = str4;
            }
            if ((i & 32) == 0) {
                this.frontend_event_id = "";
            } else {
                this.frontend_event_id = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.workflow_status != WorkflowStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, WorkflowStatusDto.Serializer.INSTANCE, self.workflow_status);
            }
            if (!Intrinsics.areEqual(self.workflow_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.workflow_id);
            }
            if (!Intrinsics.areEqual(self.screen_name, "")) {
                output.encodeStringElement(serialDesc, 2, self.screen_name);
            }
            if (!Intrinsics.areEqual(self.block_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.block_id);
            }
            if (!Intrinsics.areEqual(self.logging_identifier, "")) {
                output.encodeStringElement(serialDesc, 4, self.logging_identifier);
            }
            if (Intrinsics.areEqual(self.frontend_event_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.frontend_event_id);
        }

        public Surrogate(WorkflowStatusDto workflow_status, String workflow_id, String screen_name, String block_id, String logging_identifier, String frontend_event_id) {
            Intrinsics.checkNotNullParameter(workflow_status, "workflow_status");
            Intrinsics.checkNotNullParameter(workflow_id, "workflow_id");
            Intrinsics.checkNotNullParameter(screen_name, "screen_name");
            Intrinsics.checkNotNullParameter(block_id, "block_id");
            Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
            Intrinsics.checkNotNullParameter(frontend_event_id, "frontend_event_id");
            this.workflow_status = workflow_status;
            this.workflow_id = workflow_id;
            this.screen_name = screen_name;
            this.block_id = block_id;
            this.logging_identifier = logging_identifier;
            this.frontend_event_id = frontend_event_id;
        }

        public final WorkflowStatusDto getWorkflow_status() {
            return this.workflow_status;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.rosetta.eventlogging.StepUpVerificationContextDto.WorkflowStatusDto r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto La
                com.robinhood.rosetta.eventlogging.StepUpVerificationContextDto$WorkflowStatusDto$Companion r2 = com.robinhood.rosetta.eventlogging.StepUpVerificationContextDto.WorkflowStatusDto.INSTANCE
                com.robinhood.rosetta.eventlogging.StepUpVerificationContextDto$WorkflowStatusDto r2 = r2.getZeroValue()
            La:
                r9 = r8 & 2
                java.lang.String r0 = ""
                if (r9 == 0) goto L11
                r3 = r0
            L11:
                r9 = r8 & 4
                if (r9 == 0) goto L16
                r4 = r0
            L16:
                r9 = r8 & 8
                if (r9 == 0) goto L1b
                r5 = r0
            L1b:
                r9 = r8 & 16
                if (r9 == 0) goto L20
                r6 = r0
            L20:
                r8 = r8 & 32
                if (r8 == 0) goto L2c
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L33
            L2c:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L33:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.StepUpVerificationContextDto.Surrogate.<init>(com.robinhood.rosetta.eventlogging.StepUpVerificationContextDto$WorkflowStatusDto, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
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
    }

    /* compiled from: StepUpVerificationContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto;", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<StepUpVerificationContextDto, StepUpVerificationContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StepUpVerificationContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StepUpVerificationContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StepUpVerificationContextDto> getBinaryBase64Serializer() {
            return (KSerializer) StepUpVerificationContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StepUpVerificationContext> getProtoAdapter() {
            return StepUpVerificationContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StepUpVerificationContextDto getZeroValue() {
            return StepUpVerificationContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StepUpVerificationContextDto fromProto(StepUpVerificationContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new StepUpVerificationContextDto(new Surrogate(WorkflowStatusDto.INSTANCE.fromProto(proto.getWorkflow_status()), proto.getWorkflow_id(), proto.getScreen_name(), proto.getBlock_id(), proto.getLogging_identifier(), proto.getFrontend_event_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.StepUpVerificationContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StepUpVerificationContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StepUpVerificationContextDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StepUpVerificationContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext$WorkflowStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "WORKFLOW_STATUS_UNSPECIFIED", "USER_PENDING", "INTERNAL_PENDING", "DENIED", "CANCELLED", "LOADING", "APPROVED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class WorkflowStatusDto implements Dto2<StepUpVerificationContext.WorkflowStatus>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ WorkflowStatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<WorkflowStatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<WorkflowStatusDto, StepUpVerificationContext.WorkflowStatus>> binaryBase64Serializer$delegate;
        public static final WorkflowStatusDto WORKFLOW_STATUS_UNSPECIFIED = new WORKFLOW_STATUS_UNSPECIFIED("WORKFLOW_STATUS_UNSPECIFIED", 0);
        public static final WorkflowStatusDto USER_PENDING = new USER_PENDING("USER_PENDING", 1);
        public static final WorkflowStatusDto INTERNAL_PENDING = new INTERNAL_PENDING("INTERNAL_PENDING", 2);
        public static final WorkflowStatusDto DENIED = new DENIED("DENIED", 3);
        public static final WorkflowStatusDto CANCELLED = new CANCELLED("CANCELLED", 4);
        public static final WorkflowStatusDto LOADING = new LOADING("LOADING", 5);
        public static final WorkflowStatusDto APPROVED = new APPROVED("APPROVED", 6);

        private static final /* synthetic */ WorkflowStatusDto[] $values() {
            return new WorkflowStatusDto[]{WORKFLOW_STATUS_UNSPECIFIED, USER_PENDING, INTERNAL_PENDING, DENIED, CANCELLED, LOADING, APPROVED};
        }

        public /* synthetic */ WorkflowStatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<WorkflowStatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private WorkflowStatusDto(String str, int i) {
        }

        /* compiled from: StepUpVerificationContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/StepUpVerificationContextDto.WorkflowStatusDto.WORKFLOW_STATUS_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext$WorkflowStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WORKFLOW_STATUS_UNSPECIFIED extends WorkflowStatusDto {
            WORKFLOW_STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public StepUpVerificationContext.WorkflowStatus toProto() {
                return StepUpVerificationContext.WorkflowStatus.WORKFLOW_STATUS_UNSPECIFIED;
            }
        }

        static {
            WorkflowStatusDto[] workflowStatusDtoArr$values = $values();
            $VALUES = workflowStatusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(workflowStatusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.StepUpVerificationContextDto$WorkflowStatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StepUpVerificationContextDto.WorkflowStatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: StepUpVerificationContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/StepUpVerificationContextDto.WorkflowStatusDto.USER_PENDING", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext$WorkflowStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class USER_PENDING extends WorkflowStatusDto {
            USER_PENDING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public StepUpVerificationContext.WorkflowStatus toProto() {
                return StepUpVerificationContext.WorkflowStatus.USER_PENDING;
            }
        }

        /* compiled from: StepUpVerificationContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/StepUpVerificationContextDto.WorkflowStatusDto.INTERNAL_PENDING", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext$WorkflowStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INTERNAL_PENDING extends WorkflowStatusDto {
            INTERNAL_PENDING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public StepUpVerificationContext.WorkflowStatus toProto() {
                return StepUpVerificationContext.WorkflowStatus.INTERNAL_PENDING;
            }
        }

        /* compiled from: StepUpVerificationContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/StepUpVerificationContextDto.WorkflowStatusDto.DENIED", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext$WorkflowStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DENIED extends WorkflowStatusDto {
            DENIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public StepUpVerificationContext.WorkflowStatus toProto() {
                return StepUpVerificationContext.WorkflowStatus.DENIED;
            }
        }

        /* compiled from: StepUpVerificationContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/StepUpVerificationContextDto.WorkflowStatusDto.CANCELLED", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext$WorkflowStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANCELLED extends WorkflowStatusDto {
            CANCELLED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public StepUpVerificationContext.WorkflowStatus toProto() {
                return StepUpVerificationContext.WorkflowStatus.CANCELLED;
            }
        }

        /* compiled from: StepUpVerificationContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/StepUpVerificationContextDto.WorkflowStatusDto.LOADING", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext$WorkflowStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LOADING extends WorkflowStatusDto {
            LOADING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public StepUpVerificationContext.WorkflowStatus toProto() {
                return StepUpVerificationContext.WorkflowStatus.LOADING;
            }
        }

        /* compiled from: StepUpVerificationContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/StepUpVerificationContextDto.WorkflowStatusDto.APPROVED", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext$WorkflowStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APPROVED extends WorkflowStatusDto {
            APPROVED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public StepUpVerificationContext.WorkflowStatus toProto() {
                return StepUpVerificationContext.WorkflowStatus.APPROVED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: StepUpVerificationContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext$WorkflowStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<WorkflowStatusDto, StepUpVerificationContext.WorkflowStatus> {

            /* compiled from: StepUpVerificationContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[StepUpVerificationContext.WorkflowStatus.values().length];
                    try {
                        iArr[StepUpVerificationContext.WorkflowStatus.WORKFLOW_STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[StepUpVerificationContext.WorkflowStatus.USER_PENDING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[StepUpVerificationContext.WorkflowStatus.INTERNAL_PENDING.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[StepUpVerificationContext.WorkflowStatus.DENIED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[StepUpVerificationContext.WorkflowStatus.CANCELLED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[StepUpVerificationContext.WorkflowStatus.LOADING.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[StepUpVerificationContext.WorkflowStatus.APPROVED.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<WorkflowStatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<WorkflowStatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<WorkflowStatusDto> getBinaryBase64Serializer() {
                return (KSerializer) WorkflowStatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<StepUpVerificationContext.WorkflowStatus> getProtoAdapter() {
                return StepUpVerificationContext.WorkflowStatus.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public WorkflowStatusDto getZeroValue() {
                return WorkflowStatusDto.WORKFLOW_STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public WorkflowStatusDto fromProto(StepUpVerificationContext.WorkflowStatus proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return WorkflowStatusDto.WORKFLOW_STATUS_UNSPECIFIED;
                    case 2:
                        return WorkflowStatusDto.USER_PENDING;
                    case 3:
                        return WorkflowStatusDto.INTERNAL_PENDING;
                    case 4:
                        return WorkflowStatusDto.DENIED;
                    case 5:
                        return WorkflowStatusDto.CANCELLED;
                    case 6:
                        return WorkflowStatusDto.LOADING;
                    case 7:
                        return WorkflowStatusDto.APPROVED;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: StepUpVerificationContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$WorkflowStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<WorkflowStatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<WorkflowStatusDto, StepUpVerificationContext.WorkflowStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.StepUpVerificationContext.WorkflowStatus", WorkflowStatusDto.getEntries(), WorkflowStatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public WorkflowStatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (WorkflowStatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, WorkflowStatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static WorkflowStatusDto valueOf(String str) {
            return (WorkflowStatusDto) Enum.valueOf(WorkflowStatusDto.class, str);
        }

        public static WorkflowStatusDto[] values() {
            return (WorkflowStatusDto[]) $VALUES.clone();
        }
    }

    /* compiled from: StepUpVerificationContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<StepUpVerificationContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.StepUpVerificationContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StepUpVerificationContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StepUpVerificationContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StepUpVerificationContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StepUpVerificationContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.StepUpVerificationContextDto";
        }
    }
}
