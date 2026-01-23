package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.lib.stepupverification.SuvConstants;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.WorkflowInfo;
import com.robinhood.rosetta.eventlogging.WorkflowInfoDto;
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
import p479j$.time.Instant;

/* compiled from: WorkflowInfoDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005<;=>?B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u007f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\u0017J\u0083\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u0010\u000f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b5\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b7\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b8\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b9\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b:\u0010\u001d¨\u0006@"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfo;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto;", "event_type", "", "frontend_event_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "event_time", SuvConstants.PARAM_WORKFLOW_ID, "screen_name", "block_id", "client_version", "action", "logging_identifier", "challenge_id", "error", "(Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/WorkflowInfo;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$Surrogate;", "getEvent_type", "()Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto;", "getFrontend_event_id", "getEvent_time", "()Lj$/time/Instant;", "getWorkflow_id", "getScreen_name", "getBlock_id", "getClient_version", "getAction", "getLogging_identifier", "getChallenge_id", "getError", "Companion", "Surrogate", "EventTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class WorkflowInfoDto implements Dto3<WorkflowInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<WorkflowInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<WorkflowInfoDto, WorkflowInfo>> binaryBase64Serializer$delegate;
    private static final WorkflowInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ WorkflowInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private WorkflowInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final EventTypeDto getEvent_type() {
        return this.surrogate.getEvent_type();
    }

    public final String getFrontend_event_id() {
        return this.surrogate.getFrontend_event_id();
    }

    public final Instant getEvent_time() {
        return this.surrogate.getEvent_time();
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

    public final String getClient_version() {
        return this.surrogate.getClient_version();
    }

    public final String getAction() {
        return this.surrogate.getAction();
    }

    public final String getLogging_identifier() {
        return this.surrogate.getLogging_identifier();
    }

    public final String getChallenge_id() {
        return this.surrogate.getChallenge_id();
    }

    public final String getError() {
        return this.surrogate.getError();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ WorkflowInfoDto(com.robinhood.rosetta.eventlogging.WorkflowInfoDto.EventTypeDto r2, java.lang.String r3, p479j$.time.Instant r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r1 = this;
            r14 = r13 & 1
            if (r14 == 0) goto La
            com.robinhood.rosetta.eventlogging.WorkflowInfoDto$EventTypeDto$Companion r2 = com.robinhood.rosetta.eventlogging.WorkflowInfoDto.EventTypeDto.INSTANCE
            com.robinhood.rosetta.eventlogging.WorkflowInfoDto$EventTypeDto r2 = r2.getZeroValue()
        La:
            r14 = r13 & 2
            java.lang.String r0 = ""
            if (r14 == 0) goto L11
            r3 = r0
        L11:
            r14 = r13 & 4
            if (r14 == 0) goto L16
            r4 = 0
        L16:
            r14 = r13 & 8
            if (r14 == 0) goto L1b
            r5 = r0
        L1b:
            r14 = r13 & 16
            if (r14 == 0) goto L20
            r6 = r0
        L20:
            r14 = r13 & 32
            if (r14 == 0) goto L25
            r7 = r0
        L25:
            r14 = r13 & 64
            if (r14 == 0) goto L2a
            r8 = r0
        L2a:
            r14 = r13 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L2f
            r9 = r0
        L2f:
            r14 = r13 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L34
            r10 = r0
        L34:
            r14 = r13 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L39
            r11 = r0
        L39:
            r13 = r13 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L4a
            r14 = r0
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L56
        L4a:
            r14 = r12
            r13 = r11
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L56:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.WorkflowInfoDto.<init>(com.robinhood.rosetta.eventlogging.WorkflowInfoDto$EventTypeDto, java.lang.String, j$.time.Instant, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkflowInfoDto(EventTypeDto event_type, String frontend_event_id, Instant instant, String workflow_id, String screen_name, String block_id, String client_version, String action, String logging_identifier, String challenge_id, String error) {
        this(new Surrogate(event_type, frontend_event_id, instant, workflow_id, screen_name, block_id, client_version, action, logging_identifier, challenge_id, error));
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(frontend_event_id, "frontend_event_id");
        Intrinsics.checkNotNullParameter(workflow_id, "workflow_id");
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(block_id, "block_id");
        Intrinsics.checkNotNullParameter(client_version, "client_version");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(challenge_id, "challenge_id");
        Intrinsics.checkNotNullParameter(error, "error");
    }

    public static /* synthetic */ WorkflowInfoDto copy$default(WorkflowInfoDto workflowInfoDto, EventTypeDto eventTypeDto, String str, Instant instant, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            eventTypeDto = workflowInfoDto.surrogate.getEvent_type();
        }
        if ((i & 2) != 0) {
            str = workflowInfoDto.surrogate.getFrontend_event_id();
        }
        if ((i & 4) != 0) {
            instant = workflowInfoDto.surrogate.getEvent_time();
        }
        if ((i & 8) != 0) {
            str2 = workflowInfoDto.surrogate.getWorkflow_id();
        }
        if ((i & 16) != 0) {
            str3 = workflowInfoDto.surrogate.getScreen_name();
        }
        if ((i & 32) != 0) {
            str4 = workflowInfoDto.surrogate.getBlock_id();
        }
        if ((i & 64) != 0) {
            str5 = workflowInfoDto.surrogate.getClient_version();
        }
        if ((i & 128) != 0) {
            str6 = workflowInfoDto.surrogate.getAction();
        }
        if ((i & 256) != 0) {
            str7 = workflowInfoDto.surrogate.getLogging_identifier();
        }
        if ((i & 512) != 0) {
            str8 = workflowInfoDto.surrogate.getChallenge_id();
        }
        if ((i & 1024) != 0) {
            str9 = workflowInfoDto.surrogate.getError();
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str4;
        String str15 = str5;
        String str16 = str3;
        Instant instant2 = instant;
        return workflowInfoDto.copy(eventTypeDto, str, instant2, str2, str16, str14, str15, str12, str13, str10, str11);
    }

    public final WorkflowInfoDto copy(EventTypeDto event_type, String frontend_event_id, Instant event_time, String workflow_id, String screen_name, String block_id, String client_version, String action, String logging_identifier, String challenge_id, String error) {
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(frontend_event_id, "frontend_event_id");
        Intrinsics.checkNotNullParameter(workflow_id, "workflow_id");
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(block_id, "block_id");
        Intrinsics.checkNotNullParameter(client_version, "client_version");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(challenge_id, "challenge_id");
        Intrinsics.checkNotNullParameter(error, "error");
        return new WorkflowInfoDto(new Surrogate(event_type, frontend_event_id, event_time, workflow_id, screen_name, block_id, client_version, action, logging_identifier, challenge_id, error));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public WorkflowInfo toProto() {
        return new WorkflowInfo((WorkflowInfo.EventType) this.surrogate.getEvent_type().toProto(), this.surrogate.getFrontend_event_id(), this.surrogate.getEvent_time(), this.surrogate.getWorkflow_id(), this.surrogate.getScreen_name(), this.surrogate.getBlock_id(), this.surrogate.getClient_version(), this.surrogate.getAction(), this.surrogate.getLogging_identifier(), this.surrogate.getChallenge_id(), this.surrogate.getError(), null, 2048, null);
    }

    public String toString() {
        return "[WorkflowInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof WorkflowInfoDto) && Intrinsics.areEqual(((WorkflowInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: WorkflowInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0083\b\u0018\u0000 U2\u00020\u0001:\u0002VUB\u009b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J6\u0010(\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010'J\u0010\u0010,\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b,\u0010'J\u0010\u0010-\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b-\u0010'J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010'J\u0010\u0010/\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b/\u0010'J\u0010\u00100\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b0\u0010'J\u0010\u00101\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b1\u0010'J¤\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b4\u0010'J\u0010\u00105\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010;\u0012\u0004\b=\u0010>\u001a\u0004\b<\u0010%R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010?\u0012\u0004\bA\u0010>\u001a\u0004\b@\u0010'RF\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010B\u0012\u0004\bD\u0010>\u001a\u0004\bC\u0010)R \u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010?\u0012\u0004\bF\u0010>\u001a\u0004\bE\u0010'R \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010?\u0012\u0004\bH\u0010>\u001a\u0004\bG\u0010'R \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010?\u0012\u0004\bJ\u0010>\u001a\u0004\bI\u0010'R \u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010?\u0012\u0004\bL\u0010>\u001a\u0004\bK\u0010'R \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010?\u0012\u0004\bN\u0010>\u001a\u0004\bM\u0010'R \u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010?\u0012\u0004\bP\u0010>\u001a\u0004\bO\u0010'R \u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010?\u0012\u0004\bR\u0010>\u001a\u0004\bQ\u0010'R \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010?\u0012\u0004\bT\u0010>\u001a\u0004\bS\u0010'¨\u0006W"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto;", "event_type", "", "frontend_event_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "event_time", SuvConstants.PARAM_WORKFLOW_ID, "screen_name", "block_id", "client_version", "action", "logging_identifier", "challenge_id", "error", "<init>", "(Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto;", "component2", "()Ljava/lang/String;", "component3", "()Lj$/time/Instant;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto;", "getEvent_type", "getEvent_type$annotations", "()V", "Ljava/lang/String;", "getFrontend_event_id", "getFrontend_event_id$annotations", "Lj$/time/Instant;", "getEvent_time", "getEvent_time$annotations", "getWorkflow_id", "getWorkflow_id$annotations", "getScreen_name", "getScreen_name$annotations", "getBlock_id", "getBlock_id$annotations", "getClient_version", "getClient_version$annotations", "getAction", "getAction$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "getChallenge_id", "getChallenge_id$annotations", "getError", "getError$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String action;
        private final String block_id;
        private final String challenge_id;
        private final String client_version;
        private final String error;
        private final Instant event_time;
        private final EventTypeDto event_type;
        private final String frontend_event_id;
        private final String logging_identifier;
        private final String screen_name;
        private final String workflow_id;

        public Surrogate() {
            this((EventTypeDto) null, (String) null, (Instant) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, EventTypeDto eventTypeDto, String str, Instant instant, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
            if ((i & 1) != 0) {
                eventTypeDto = surrogate.event_type;
            }
            if ((i & 2) != 0) {
                str = surrogate.frontend_event_id;
            }
            if ((i & 4) != 0) {
                instant = surrogate.event_time;
            }
            if ((i & 8) != 0) {
                str2 = surrogate.workflow_id;
            }
            if ((i & 16) != 0) {
                str3 = surrogate.screen_name;
            }
            if ((i & 32) != 0) {
                str4 = surrogate.block_id;
            }
            if ((i & 64) != 0) {
                str5 = surrogate.client_version;
            }
            if ((i & 128) != 0) {
                str6 = surrogate.action;
            }
            if ((i & 256) != 0) {
                str7 = surrogate.logging_identifier;
            }
            if ((i & 512) != 0) {
                str8 = surrogate.challenge_id;
            }
            if ((i & 1024) != 0) {
                str9 = surrogate.error;
            }
            String str10 = str8;
            String str11 = str9;
            String str12 = str6;
            String str13 = str7;
            String str14 = str4;
            String str15 = str5;
            String str16 = str3;
            Instant instant2 = instant;
            return surrogate.copy(eventTypeDto, str, instant2, str2, str16, str14, str15, str12, str13, str10, str11);
        }

        @SerialName("action")
        @JsonAnnotations2(names = {"action"})
        public static /* synthetic */ void getAction$annotations() {
        }

        @SerialName("blockId")
        @JsonAnnotations2(names = {"block_id"})
        public static /* synthetic */ void getBlock_id$annotations() {
        }

        @SerialName(ChallengeResponseActivity.EXTRA_CHALLENGE_ID)
        @JsonAnnotations2(names = {"challenge_id"})
        public static /* synthetic */ void getChallenge_id$annotations() {
        }

        @SerialName("clientVersion")
        @JsonAnnotations2(names = {"client_version"})
        public static /* synthetic */ void getClient_version$annotations() {
        }

        @SerialName("error")
        @JsonAnnotations2(names = {"error"})
        public static /* synthetic */ void getError$annotations() {
        }

        @SerialName("eventTime")
        @JsonAnnotations2(names = {"event_time"})
        public static /* synthetic */ void getEvent_time$annotations() {
        }

        @SerialName("eventType")
        @JsonAnnotations2(names = {"event_type"})
        public static /* synthetic */ void getEvent_type$annotations() {
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

        /* renamed from: component1, reason: from getter */
        public final EventTypeDto getEvent_type() {
            return this.event_type;
        }

        /* renamed from: component10, reason: from getter */
        public final String getChallenge_id() {
            return this.challenge_id;
        }

        /* renamed from: component11, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFrontend_event_id() {
            return this.frontend_event_id;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getEvent_time() {
            return this.event_time;
        }

        /* renamed from: component4, reason: from getter */
        public final String getWorkflow_id() {
            return this.workflow_id;
        }

        /* renamed from: component5, reason: from getter */
        public final String getScreen_name() {
            return this.screen_name;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBlock_id() {
            return this.block_id;
        }

        /* renamed from: component7, reason: from getter */
        public final String getClient_version() {
            return this.client_version;
        }

        /* renamed from: component8, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        /* renamed from: component9, reason: from getter */
        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        public final Surrogate copy(EventTypeDto event_type, String frontend_event_id, Instant event_time, String workflow_id, String screen_name, String block_id, String client_version, String action, String logging_identifier, String challenge_id, String error) {
            Intrinsics.checkNotNullParameter(event_type, "event_type");
            Intrinsics.checkNotNullParameter(frontend_event_id, "frontend_event_id");
            Intrinsics.checkNotNullParameter(workflow_id, "workflow_id");
            Intrinsics.checkNotNullParameter(screen_name, "screen_name");
            Intrinsics.checkNotNullParameter(block_id, "block_id");
            Intrinsics.checkNotNullParameter(client_version, "client_version");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
            Intrinsics.checkNotNullParameter(challenge_id, "challenge_id");
            Intrinsics.checkNotNullParameter(error, "error");
            return new Surrogate(event_type, frontend_event_id, event_time, workflow_id, screen_name, block_id, client_version, action, logging_identifier, challenge_id, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.event_type == surrogate.event_type && Intrinsics.areEqual(this.frontend_event_id, surrogate.frontend_event_id) && Intrinsics.areEqual(this.event_time, surrogate.event_time) && Intrinsics.areEqual(this.workflow_id, surrogate.workflow_id) && Intrinsics.areEqual(this.screen_name, surrogate.screen_name) && Intrinsics.areEqual(this.block_id, surrogate.block_id) && Intrinsics.areEqual(this.client_version, surrogate.client_version) && Intrinsics.areEqual(this.action, surrogate.action) && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier) && Intrinsics.areEqual(this.challenge_id, surrogate.challenge_id) && Intrinsics.areEqual(this.error, surrogate.error);
        }

        public int hashCode() {
            int iHashCode = ((this.event_type.hashCode() * 31) + this.frontend_event_id.hashCode()) * 31;
            Instant instant = this.event_time;
            return ((((((((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.workflow_id.hashCode()) * 31) + this.screen_name.hashCode()) * 31) + this.block_id.hashCode()) * 31) + this.client_version.hashCode()) * 31) + this.action.hashCode()) * 31) + this.logging_identifier.hashCode()) * 31) + this.challenge_id.hashCode()) * 31) + this.error.hashCode();
        }

        public String toString() {
            return "Surrogate(event_type=" + this.event_type + ", frontend_event_id=" + this.frontend_event_id + ", event_time=" + this.event_time + ", workflow_id=" + this.workflow_id + ", screen_name=" + this.screen_name + ", block_id=" + this.block_id + ", client_version=" + this.client_version + ", action=" + this.action + ", logging_identifier=" + this.logging_identifier + ", challenge_id=" + this.challenge_id + ", error=" + this.error + ")";
        }

        /* compiled from: WorkflowInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return WorkflowInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, EventTypeDto eventTypeDto, String str, Instant instant, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
            this.event_type = (i & 1) == 0 ? EventTypeDto.INSTANCE.getZeroValue() : eventTypeDto;
            if ((i & 2) == 0) {
                this.frontend_event_id = "";
            } else {
                this.frontend_event_id = str;
            }
            if ((i & 4) == 0) {
                this.event_time = null;
            } else {
                this.event_time = instant;
            }
            if ((i & 8) == 0) {
                this.workflow_id = "";
            } else {
                this.workflow_id = str2;
            }
            if ((i & 16) == 0) {
                this.screen_name = "";
            } else {
                this.screen_name = str3;
            }
            if ((i & 32) == 0) {
                this.block_id = "";
            } else {
                this.block_id = str4;
            }
            if ((i & 64) == 0) {
                this.client_version = "";
            } else {
                this.client_version = str5;
            }
            if ((i & 128) == 0) {
                this.action = "";
            } else {
                this.action = str6;
            }
            if ((i & 256) == 0) {
                this.logging_identifier = "";
            } else {
                this.logging_identifier = str7;
            }
            if ((i & 512) == 0) {
                this.challenge_id = "";
            } else {
                this.challenge_id = str8;
            }
            if ((i & 1024) == 0) {
                this.error = "";
            } else {
                this.error = str9;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.event_type != EventTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, EventTypeDto.Serializer.INSTANCE, self.event_type);
            }
            if (!Intrinsics.areEqual(self.frontend_event_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.frontend_event_id);
            }
            Instant instant = self.event_time;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.workflow_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.workflow_id);
            }
            if (!Intrinsics.areEqual(self.screen_name, "")) {
                output.encodeStringElement(serialDesc, 4, self.screen_name);
            }
            if (!Intrinsics.areEqual(self.block_id, "")) {
                output.encodeStringElement(serialDesc, 5, self.block_id);
            }
            if (!Intrinsics.areEqual(self.client_version, "")) {
                output.encodeStringElement(serialDesc, 6, self.client_version);
            }
            if (!Intrinsics.areEqual(self.action, "")) {
                output.encodeStringElement(serialDesc, 7, self.action);
            }
            if (!Intrinsics.areEqual(self.logging_identifier, "")) {
                output.encodeStringElement(serialDesc, 8, self.logging_identifier);
            }
            if (!Intrinsics.areEqual(self.challenge_id, "")) {
                output.encodeStringElement(serialDesc, 9, self.challenge_id);
            }
            if (Intrinsics.areEqual(self.error, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 10, self.error);
        }

        public Surrogate(EventTypeDto event_type, String frontend_event_id, Instant instant, String workflow_id, String screen_name, String block_id, String client_version, String action, String logging_identifier, String challenge_id, String error) {
            Intrinsics.checkNotNullParameter(event_type, "event_type");
            Intrinsics.checkNotNullParameter(frontend_event_id, "frontend_event_id");
            Intrinsics.checkNotNullParameter(workflow_id, "workflow_id");
            Intrinsics.checkNotNullParameter(screen_name, "screen_name");
            Intrinsics.checkNotNullParameter(block_id, "block_id");
            Intrinsics.checkNotNullParameter(client_version, "client_version");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
            Intrinsics.checkNotNullParameter(challenge_id, "challenge_id");
            Intrinsics.checkNotNullParameter(error, "error");
            this.event_type = event_type;
            this.frontend_event_id = frontend_event_id;
            this.event_time = instant;
            this.workflow_id = workflow_id;
            this.screen_name = screen_name;
            this.block_id = block_id;
            this.client_version = client_version;
            this.action = action;
            this.logging_identifier = logging_identifier;
            this.challenge_id = challenge_id;
            this.error = error;
        }

        public final EventTypeDto getEvent_type() {
            return this.event_type;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.rosetta.eventlogging.WorkflowInfoDto.EventTypeDto r2, java.lang.String r3, p479j$.time.Instant r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            /*
                r1 = this;
                r14 = r13 & 1
                if (r14 == 0) goto La
                com.robinhood.rosetta.eventlogging.WorkflowInfoDto$EventTypeDto$Companion r2 = com.robinhood.rosetta.eventlogging.WorkflowInfoDto.EventTypeDto.INSTANCE
                com.robinhood.rosetta.eventlogging.WorkflowInfoDto$EventTypeDto r2 = r2.getZeroValue()
            La:
                r14 = r13 & 2
                java.lang.String r0 = ""
                if (r14 == 0) goto L11
                r3 = r0
            L11:
                r14 = r13 & 4
                if (r14 == 0) goto L16
                r4 = 0
            L16:
                r14 = r13 & 8
                if (r14 == 0) goto L1b
                r5 = r0
            L1b:
                r14 = r13 & 16
                if (r14 == 0) goto L20
                r6 = r0
            L20:
                r14 = r13 & 32
                if (r14 == 0) goto L25
                r7 = r0
            L25:
                r14 = r13 & 64
                if (r14 == 0) goto L2a
                r8 = r0
            L2a:
                r14 = r13 & 128(0x80, float:1.794E-43)
                if (r14 == 0) goto L2f
                r9 = r0
            L2f:
                r14 = r13 & 256(0x100, float:3.59E-43)
                if (r14 == 0) goto L34
                r10 = r0
            L34:
                r14 = r13 & 512(0x200, float:7.175E-43)
                if (r14 == 0) goto L39
                r11 = r0
            L39:
                r13 = r13 & 1024(0x400, float:1.435E-42)
                if (r13 == 0) goto L4a
                r14 = r0
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L56
            L4a:
                r14 = r12
                r13 = r11
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L56:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.WorkflowInfoDto.Surrogate.<init>(com.robinhood.rosetta.eventlogging.WorkflowInfoDto$EventTypeDto, java.lang.String, j$.time.Instant, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getFrontend_event_id() {
            return this.frontend_event_id;
        }

        public final Instant getEvent_time() {
            return this.event_time;
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

        public final String getClient_version() {
            return this.client_version;
        }

        public final String getAction() {
            return this.action;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        public final String getChallenge_id() {
            return this.challenge_id;
        }

        public final String getError() {
            return this.error;
        }
    }

    /* compiled from: WorkflowInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto;", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<WorkflowInfoDto, WorkflowInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WorkflowInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WorkflowInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WorkflowInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) WorkflowInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<WorkflowInfo> getProtoAdapter() {
            return WorkflowInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WorkflowInfoDto getZeroValue() {
            return WorkflowInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WorkflowInfoDto fromProto(WorkflowInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new WorkflowInfoDto(new Surrogate(EventTypeDto.INSTANCE.fromProto(proto.getEvent_type()), proto.getFrontend_event_id(), proto.getEvent_time(), proto.getWorkflow_id(), proto.getScreen_name(), proto.getBlock_id(), proto.getClient_version(), proto.getAction(), proto.getLogging_identifier(), proto.getChallenge_id(), proto.getError()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.WorkflowInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WorkflowInfoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new WorkflowInfoDto(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WorkflowInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfo$EventType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "EVENT_TYPE_UNSPECIFIED", "REQUEST", "RESPONSE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EventTypeDto implements Dto2<WorkflowInfo.EventType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EventTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EventTypeDto EVENT_TYPE_UNSPECIFIED = new EVENT_TYPE_UNSPECIFIED("EVENT_TYPE_UNSPECIFIED", 0);
        public static final EventTypeDto REQUEST = new REQUEST("REQUEST", 1);
        public static final EventTypeDto RESPONSE = new RESPONSE("RESPONSE", 2);
        private static final Lazy<BinaryBase64DtoSerializer<EventTypeDto, WorkflowInfo.EventType>> binaryBase64Serializer$delegate;

        private static final /* synthetic */ EventTypeDto[] $values() {
            return new EventTypeDto[]{EVENT_TYPE_UNSPECIFIED, REQUEST, RESPONSE};
        }

        public /* synthetic */ EventTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<EventTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: WorkflowInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WorkflowInfoDto.EventTypeDto.EVENT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfo$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EVENT_TYPE_UNSPECIFIED extends EventTypeDto {
            EVENT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowInfo.EventType toProto() {
                return WorkflowInfo.EventType.EVENT_TYPE_UNSPECIFIED;
            }
        }

        private EventTypeDto(String str, int i) {
        }

        static {
            EventTypeDto[] eventTypeDtoArr$values = $values();
            $VALUES = eventTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.WorkflowInfoDto$EventTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WorkflowInfoDto.EventTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: WorkflowInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WorkflowInfoDto.EventTypeDto.REQUEST", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfo$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REQUEST extends EventTypeDto {
            REQUEST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowInfo.EventType toProto() {
                return WorkflowInfo.EventType.REQUEST;
            }
        }

        /* compiled from: WorkflowInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/WorkflowInfoDto.EventTypeDto.RESPONSE", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfo$EventType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RESPONSE extends EventTypeDto {
            RESPONSE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowInfo.EventType toProto() {
                return WorkflowInfo.EventType.RESPONSE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: WorkflowInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto;", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfo$EventType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EventTypeDto, WorkflowInfo.EventType> {

            /* compiled from: WorkflowInfoDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[WorkflowInfo.EventType.values().length];
                    try {
                        iArr[WorkflowInfo.EventType.EVENT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[WorkflowInfo.EventType.REQUEST.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[WorkflowInfo.EventType.RESPONSE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EventTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EventTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EventTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) EventTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<WorkflowInfo.EventType> getProtoAdapter() {
                return WorkflowInfo.EventType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventTypeDto getZeroValue() {
                return EventTypeDto.EVENT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventTypeDto fromProto(WorkflowInfo.EventType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return EventTypeDto.EVENT_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return EventTypeDto.REQUEST;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return EventTypeDto.RESPONSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: WorkflowInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$EventTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<EventTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EventTypeDto, WorkflowInfo.EventType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.WorkflowInfo.EventType", EventTypeDto.getEntries(), EventTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EventTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EventTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EventTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EventTypeDto valueOf(String str) {
            return (EventTypeDto) Enum.valueOf(EventTypeDto.class, str);
        }

        public static EventTypeDto[] values() {
            return (EventTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: WorkflowInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<WorkflowInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.WorkflowInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, WorkflowInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public WorkflowInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new WorkflowInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: WorkflowInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.WorkflowInfoDto";
        }
    }
}
