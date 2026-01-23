package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.ChallengeContext;
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

/* compiled from: ChallengeContext.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004/012B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010&\u001a\u00020\u0002H\u0017J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u0006H\u0016J~\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010 R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0016\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001a¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContext;", "Lcom/squareup/wire/Message;", "", "challenge_status", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeStatus;", "challenge_identifier", "", "challenge_type", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeType;", "original_challenge_type", "twilio_verify_challenge_sid", "suv_workflow_identifier", "is_device_approval_silent", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "device_approval_blocked_type", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$DeviceApprovalBlockedType;", "error_message", "fallback_type", "pathfinder_inquiry_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeStatus;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeType;Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeType;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/ChallengeContext$DeviceApprovalBlockedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getChallenge_status", "()Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeStatus;", "getChallenge_identifier", "()Ljava/lang/String;", "getChallenge_type", "()Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeType;", "getOriginal_challenge_type", "getTwilio_verify_challenge_sid", "getSuv_workflow_identifier", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getDevice_approval_blocked_type", "()Lcom/robinhood/rosetta/eventlogging/ChallengeContext$DeviceApprovalBlockedType;", "getError_message", "getFallback_type", "getPathfinder_inquiry_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ChallengeStatus", "ChallengeType", "DeviceApprovalBlockedType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ChallengeContext extends Message {

    @JvmField
    public static final ProtoAdapter<ChallengeContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "challengeIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String challenge_identifier;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ChallengeContext$ChallengeStatus#ADAPTER", jsonName = "challengeStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ChallengeStatus challenge_status;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ChallengeContext$ChallengeType#ADAPTER", jsonName = "challengeType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ChallengeType challenge_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ChallengeContext$DeviceApprovalBlockedType#ADAPTER", jsonName = "deviceApprovalBlockedType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final DeviceApprovalBlockedType device_approval_blocked_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String error_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fallbackType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String fallback_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "isDeviceApprovalSilent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Boolean is_device_approval_silent;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ChallengeContext$ChallengeType#ADAPTER", jsonName = "originalChallengeType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ChallengeType original_challenge_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pathfinderInquiryId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String pathfinder_inquiry_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "suvWorkflowIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String suv_workflow_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "twilioVerifyChallengeSid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String twilio_verify_challenge_sid;

    public ChallengeContext() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24066newBuilder();
    }

    public final ChallengeStatus getChallenge_status() {
        return this.challenge_status;
    }

    public /* synthetic */ ChallengeContext(ChallengeStatus challengeStatus, String str, ChallengeType challengeType, ChallengeType challengeType2, String str2, String str3, Boolean r8, DeviceApprovalBlockedType deviceApprovalBlockedType, String str4, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ChallengeStatus.CHALLENGE_STATUS_UNSPECIFIED : challengeStatus, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ChallengeType.CHALLENGE_TYPE_UNSPECIFIED : challengeType, (i & 8) != 0 ? ChallengeType.CHALLENGE_TYPE_UNSPECIFIED : challengeType2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r8, (i & 128) != 0 ? DeviceApprovalBlockedType.DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED : deviceApprovalBlockedType, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? "" : str5, (i & 1024) != 0 ? "" : str6, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getChallenge_identifier() {
        return this.challenge_identifier;
    }

    public final ChallengeType getChallenge_type() {
        return this.challenge_type;
    }

    public final ChallengeType getOriginal_challenge_type() {
        return this.original_challenge_type;
    }

    public final String getTwilio_verify_challenge_sid() {
        return this.twilio_verify_challenge_sid;
    }

    public final String getSuv_workflow_identifier() {
        return this.suv_workflow_identifier;
    }

    /* renamed from: is_device_approval_silent, reason: from getter */
    public final Boolean getIs_device_approval_silent() {
        return this.is_device_approval_silent;
    }

    public final DeviceApprovalBlockedType getDevice_approval_blocked_type() {
        return this.device_approval_blocked_type;
    }

    public final String getError_message() {
        return this.error_message;
    }

    public final String getFallback_type() {
        return this.fallback_type;
    }

    public final String getPathfinder_inquiry_id() {
        return this.pathfinder_inquiry_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeContext(ChallengeStatus challenge_status, String challenge_identifier, ChallengeType challenge_type, ChallengeType original_challenge_type, String twilio_verify_challenge_sid, String suv_workflow_identifier, Boolean is_device_approval_silent, DeviceApprovalBlockedType device_approval_blocked_type, String error_message, String fallback_type, String pathfinder_inquiry_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(challenge_status, "challenge_status");
        Intrinsics.checkNotNullParameter(challenge_identifier, "challenge_identifier");
        Intrinsics.checkNotNullParameter(challenge_type, "challenge_type");
        Intrinsics.checkNotNullParameter(original_challenge_type, "original_challenge_type");
        Intrinsics.checkNotNullParameter(twilio_verify_challenge_sid, "twilio_verify_challenge_sid");
        Intrinsics.checkNotNullParameter(suv_workflow_identifier, "suv_workflow_identifier");
        Intrinsics.checkNotNullParameter(is_device_approval_silent, "is_device_approval_silent");
        Intrinsics.checkNotNullParameter(device_approval_blocked_type, "device_approval_blocked_type");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(fallback_type, "fallback_type");
        Intrinsics.checkNotNullParameter(pathfinder_inquiry_id, "pathfinder_inquiry_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.challenge_status = challenge_status;
        this.challenge_identifier = challenge_identifier;
        this.challenge_type = challenge_type;
        this.original_challenge_type = original_challenge_type;
        this.twilio_verify_challenge_sid = twilio_verify_challenge_sid;
        this.suv_workflow_identifier = suv_workflow_identifier;
        this.is_device_approval_silent = is_device_approval_silent;
        this.device_approval_blocked_type = device_approval_blocked_type;
        this.error_message = error_message;
        this.fallback_type = fallback_type;
        this.pathfinder_inquiry_id = pathfinder_inquiry_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24066newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChallengeContext)) {
            return false;
        }
        ChallengeContext challengeContext = (ChallengeContext) other;
        return Intrinsics.areEqual(unknownFields(), challengeContext.unknownFields()) && this.challenge_status == challengeContext.challenge_status && Intrinsics.areEqual(this.challenge_identifier, challengeContext.challenge_identifier) && this.challenge_type == challengeContext.challenge_type && this.original_challenge_type == challengeContext.original_challenge_type && Intrinsics.areEqual(this.twilio_verify_challenge_sid, challengeContext.twilio_verify_challenge_sid) && Intrinsics.areEqual(this.suv_workflow_identifier, challengeContext.suv_workflow_identifier) && this.is_device_approval_silent == challengeContext.is_device_approval_silent && this.device_approval_blocked_type == challengeContext.device_approval_blocked_type && Intrinsics.areEqual(this.error_message, challengeContext.error_message) && Intrinsics.areEqual(this.fallback_type, challengeContext.fallback_type) && Intrinsics.areEqual(this.pathfinder_inquiry_id, challengeContext.pathfinder_inquiry_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((unknownFields().hashCode() * 37) + this.challenge_status.hashCode()) * 37) + this.challenge_identifier.hashCode()) * 37) + this.challenge_type.hashCode()) * 37) + this.original_challenge_type.hashCode()) * 37) + this.twilio_verify_challenge_sid.hashCode()) * 37) + this.suv_workflow_identifier.hashCode()) * 37) + this.is_device_approval_silent.hashCode()) * 37) + this.device_approval_blocked_type.hashCode()) * 37) + this.error_message.hashCode()) * 37) + this.fallback_type.hashCode()) * 37) + this.pathfinder_inquiry_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("challenge_status=" + this.challenge_status);
        arrayList.add("challenge_identifier=" + Internal.sanitize(this.challenge_identifier));
        arrayList.add("challenge_type=" + this.challenge_type);
        arrayList.add("original_challenge_type=" + this.original_challenge_type);
        arrayList.add("twilio_verify_challenge_sid=" + Internal.sanitize(this.twilio_verify_challenge_sid));
        arrayList.add("suv_workflow_identifier=" + Internal.sanitize(this.suv_workflow_identifier));
        arrayList.add("is_device_approval_silent=" + this.is_device_approval_silent);
        arrayList.add("device_approval_blocked_type=" + this.device_approval_blocked_type);
        arrayList.add("error_message=" + Internal.sanitize(this.error_message));
        arrayList.add("fallback_type=" + Internal.sanitize(this.fallback_type));
        arrayList.add("pathfinder_inquiry_id=" + Internal.sanitize(this.pathfinder_inquiry_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChallengeContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ChallengeContext copy$default(ChallengeContext challengeContext, ChallengeStatus challengeStatus, String str, ChallengeType challengeType, ChallengeType challengeType2, String str2, String str3, Boolean r7, DeviceApprovalBlockedType deviceApprovalBlockedType, String str4, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            challengeStatus = challengeContext.challenge_status;
        }
        if ((i & 2) != 0) {
            str = challengeContext.challenge_identifier;
        }
        if ((i & 4) != 0) {
            challengeType = challengeContext.challenge_type;
        }
        if ((i & 8) != 0) {
            challengeType2 = challengeContext.original_challenge_type;
        }
        if ((i & 16) != 0) {
            str2 = challengeContext.twilio_verify_challenge_sid;
        }
        if ((i & 32) != 0) {
            str3 = challengeContext.suv_workflow_identifier;
        }
        if ((i & 64) != 0) {
            r7 = challengeContext.is_device_approval_silent;
        }
        if ((i & 128) != 0) {
            deviceApprovalBlockedType = challengeContext.device_approval_blocked_type;
        }
        if ((i & 256) != 0) {
            str4 = challengeContext.error_message;
        }
        if ((i & 512) != 0) {
            str5 = challengeContext.fallback_type;
        }
        if ((i & 1024) != 0) {
            str6 = challengeContext.pathfinder_inquiry_id;
        }
        if ((i & 2048) != 0) {
            byteString = challengeContext.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        String str8 = str4;
        String str9 = str5;
        Boolean r9 = r7;
        DeviceApprovalBlockedType deviceApprovalBlockedType2 = deviceApprovalBlockedType;
        String str10 = str2;
        String str11 = str3;
        return challengeContext.copy(challengeStatus, str, challengeType, challengeType2, str10, str11, r9, deviceApprovalBlockedType2, str8, str9, str7, byteString2);
    }

    public final ChallengeContext copy(ChallengeStatus challenge_status, String challenge_identifier, ChallengeType challenge_type, ChallengeType original_challenge_type, String twilio_verify_challenge_sid, String suv_workflow_identifier, Boolean is_device_approval_silent, DeviceApprovalBlockedType device_approval_blocked_type, String error_message, String fallback_type, String pathfinder_inquiry_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(challenge_status, "challenge_status");
        Intrinsics.checkNotNullParameter(challenge_identifier, "challenge_identifier");
        Intrinsics.checkNotNullParameter(challenge_type, "challenge_type");
        Intrinsics.checkNotNullParameter(original_challenge_type, "original_challenge_type");
        Intrinsics.checkNotNullParameter(twilio_verify_challenge_sid, "twilio_verify_challenge_sid");
        Intrinsics.checkNotNullParameter(suv_workflow_identifier, "suv_workflow_identifier");
        Intrinsics.checkNotNullParameter(is_device_approval_silent, "is_device_approval_silent");
        Intrinsics.checkNotNullParameter(device_approval_blocked_type, "device_approval_blocked_type");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(fallback_type, "fallback_type");
        Intrinsics.checkNotNullParameter(pathfinder_inquiry_id, "pathfinder_inquiry_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ChallengeContext(challenge_status, challenge_identifier, challenge_type, original_challenge_type, twilio_verify_challenge_sid, suv_workflow_identifier, is_device_approval_silent, device_approval_blocked_type, error_message, fallback_type, pathfinder_inquiry_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChallengeContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ChallengeContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ChallengeContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ChallengeContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getChallenge_status() != ChallengeContext.ChallengeStatus.CHALLENGE_STATUS_UNSPECIFIED) {
                    size += ChallengeContext.ChallengeStatus.ADAPTER.encodedSizeWithTag(1, value.getChallenge_status());
                }
                if (!Intrinsics.areEqual(value.getChallenge_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getChallenge_identifier());
                }
                ChallengeContext.ChallengeType challenge_type = value.getChallenge_type();
                ChallengeContext.ChallengeType challengeType = ChallengeContext.ChallengeType.CHALLENGE_TYPE_UNSPECIFIED;
                if (challenge_type != challengeType) {
                    size += ChallengeContext.ChallengeType.ADAPTER.encodedSizeWithTag(3, value.getChallenge_type());
                }
                if (value.getOriginal_challenge_type() != challengeType) {
                    size += ChallengeContext.ChallengeType.ADAPTER.encodedSizeWithTag(4, value.getOriginal_challenge_type());
                }
                if (!Intrinsics.areEqual(value.getTwilio_verify_challenge_sid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getTwilio_verify_challenge_sid());
                }
                if (!Intrinsics.areEqual(value.getSuv_workflow_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getSuv_workflow_identifier());
                }
                if (value.getIs_device_approval_silent() != Boolean.BOOLEAN_UNSPECIFIED) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(7, value.getIs_device_approval_silent());
                }
                if (value.getDevice_approval_blocked_type() != ChallengeContext.DeviceApprovalBlockedType.DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED) {
                    size += ChallengeContext.DeviceApprovalBlockedType.ADAPTER.encodedSizeWithTag(8, value.getDevice_approval_blocked_type());
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getError_message());
                }
                if (!Intrinsics.areEqual(value.getFallback_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getFallback_type());
                }
                return !Intrinsics.areEqual(value.getPathfinder_inquiry_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(11, value.getPathfinder_inquiry_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ChallengeContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getChallenge_status() != ChallengeContext.ChallengeStatus.CHALLENGE_STATUS_UNSPECIFIED) {
                    ChallengeContext.ChallengeStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getChallenge_status());
                }
                if (!Intrinsics.areEqual(value.getChallenge_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getChallenge_identifier());
                }
                ChallengeContext.ChallengeType challenge_type = value.getChallenge_type();
                ChallengeContext.ChallengeType challengeType = ChallengeContext.ChallengeType.CHALLENGE_TYPE_UNSPECIFIED;
                if (challenge_type != challengeType) {
                    ChallengeContext.ChallengeType.ADAPTER.encodeWithTag(writer, 3, (int) value.getChallenge_type());
                }
                if (value.getOriginal_challenge_type() != challengeType) {
                    ChallengeContext.ChallengeType.ADAPTER.encodeWithTag(writer, 4, (int) value.getOriginal_challenge_type());
                }
                if (!Intrinsics.areEqual(value.getTwilio_verify_challenge_sid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTwilio_verify_challenge_sid());
                }
                if (!Intrinsics.areEqual(value.getSuv_workflow_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSuv_workflow_identifier());
                }
                if (value.getIs_device_approval_silent() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 7, (int) value.getIs_device_approval_silent());
                }
                if (value.getDevice_approval_blocked_type() != ChallengeContext.DeviceApprovalBlockedType.DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED) {
                    ChallengeContext.DeviceApprovalBlockedType.ADAPTER.encodeWithTag(writer, 8, (int) value.getDevice_approval_blocked_type());
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getError_message());
                }
                if (!Intrinsics.areEqual(value.getFallback_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getFallback_type());
                }
                if (!Intrinsics.areEqual(value.getPathfinder_inquiry_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getPathfinder_inquiry_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ChallengeContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPathfinder_inquiry_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getPathfinder_inquiry_id());
                }
                if (!Intrinsics.areEqual(value.getFallback_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getFallback_type());
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getError_message());
                }
                if (value.getDevice_approval_blocked_type() != ChallengeContext.DeviceApprovalBlockedType.DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED) {
                    ChallengeContext.DeviceApprovalBlockedType.ADAPTER.encodeWithTag(writer, 8, (int) value.getDevice_approval_blocked_type());
                }
                if (value.getIs_device_approval_silent() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 7, (int) value.getIs_device_approval_silent());
                }
                if (!Intrinsics.areEqual(value.getSuv_workflow_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getSuv_workflow_identifier());
                }
                if (!Intrinsics.areEqual(value.getTwilio_verify_challenge_sid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getTwilio_verify_challenge_sid());
                }
                ChallengeContext.ChallengeType original_challenge_type = value.getOriginal_challenge_type();
                ChallengeContext.ChallengeType challengeType = ChallengeContext.ChallengeType.CHALLENGE_TYPE_UNSPECIFIED;
                if (original_challenge_type != challengeType) {
                    ChallengeContext.ChallengeType.ADAPTER.encodeWithTag(writer, 4, (int) value.getOriginal_challenge_type());
                }
                if (value.getChallenge_type() != challengeType) {
                    ChallengeContext.ChallengeType.ADAPTER.encodeWithTag(writer, 3, (int) value.getChallenge_type());
                }
                if (!Intrinsics.areEqual(value.getChallenge_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getChallenge_identifier());
                }
                if (value.getChallenge_status() != ChallengeContext.ChallengeStatus.CHALLENGE_STATUS_UNSPECIFIED) {
                    ChallengeContext.ChallengeStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getChallenge_status());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ChallengeContext decode(ProtoReader reader) throws IOException {
                ChallengeContext.ChallengeStatus challengeStatus;
                ChallengeContext.ChallengeType challengeType;
                ChallengeContext.ChallengeType challengeType2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ChallengeContext.ChallengeStatus challengeStatus2 = ChallengeContext.ChallengeStatus.CHALLENGE_STATUS_UNSPECIFIED;
                ChallengeContext.ChallengeType challengeType3 = ChallengeContext.ChallengeType.CHALLENGE_TYPE_UNSPECIFIED;
                Boolean r3 = Boolean.BOOLEAN_UNSPECIFIED;
                ChallengeContext.DeviceApprovalBlockedType deviceApprovalBlockedType = ChallengeContext.DeviceApprovalBlockedType.DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ChallengeContext.DeviceApprovalBlockedType deviceApprovalBlockedTypeDecode = deviceApprovalBlockedType;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                ChallengeContext.ChallengeType challengeTypeDecode = challengeType3;
                Boolean booleanDecode = r3;
                ChallengeContext.ChallengeStatus challengeStatusDecode = challengeStatus2;
                ChallengeContext.ChallengeType challengeTypeDecode2 = challengeTypeDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                challengeStatus = challengeStatusDecode;
                                challengeType = challengeTypeDecode2;
                                challengeType2 = challengeTypeDecode;
                                try {
                                    challengeStatusDecode = ChallengeContext.ChallengeStatus.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                challengeTypeDecode2 = challengeType;
                                challengeTypeDecode = challengeType2;
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                challengeStatus = challengeStatusDecode;
                                challengeType = challengeTypeDecode2;
                                challengeType2 = challengeTypeDecode;
                                try {
                                    challengeTypeDecode2 = ChallengeContext.ChallengeType.ADAPTER.decode(reader);
                                    challengeStatusDecode = challengeStatus;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                challengeTypeDecode = challengeType2;
                                break;
                            case 4:
                                challengeStatus = challengeStatusDecode;
                                challengeType = challengeTypeDecode2;
                                challengeType2 = challengeTypeDecode;
                                try {
                                    challengeTypeDecode = ChallengeContext.ChallengeType.ADAPTER.decode(reader);
                                    challengeStatusDecode = challengeStatus;
                                    challengeTypeDecode2 = challengeType;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                challengeStatus = challengeStatusDecode;
                                challengeType = challengeTypeDecode2;
                                challengeType2 = challengeTypeDecode;
                                try {
                                    booleanDecode = Boolean.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                }
                                challengeStatusDecode = challengeStatus;
                                challengeTypeDecode2 = challengeType;
                                challengeTypeDecode = challengeType2;
                                break;
                            case 8:
                                try {
                                    deviceApprovalBlockedTypeDecode = ChallengeContext.DeviceApprovalBlockedType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    challengeStatus = challengeStatusDecode;
                                    challengeType = challengeTypeDecode2;
                                    challengeType2 = challengeTypeDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                    break;
                                }
                            case 9:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                challengeStatus = challengeStatusDecode;
                                challengeType = challengeTypeDecode2;
                                challengeType2 = challengeTypeDecode;
                                challengeStatusDecode = challengeStatus;
                                challengeTypeDecode2 = challengeType;
                                challengeTypeDecode = challengeType2;
                                break;
                        }
                    } else {
                        return new ChallengeContext(challengeStatusDecode, strDecode, challengeTypeDecode2, challengeTypeDecode, strDecode2, strDecode3, booleanDecode, deviceApprovalBlockedTypeDecode, strDecode4, strDecode5, strDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChallengeContext redact(ChallengeContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ChallengeContext.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, ByteString.EMPTY, 2047, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChallengeContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CHALLENGE_STATUS_UNSPECIFIED", "CHALLENGE_STATUS_UNKNOWN", "ISSUED", "VALIDATED", "REDEEMED", "FAILED", "REPLACED", "EXPIRED", "CLIENT_TIMEOUT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ChallengeStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChallengeStatus[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ChallengeStatus> ADAPTER;
        public static final ChallengeStatus CHALLENGE_STATUS_UNKNOWN;
        public static final ChallengeStatus CHALLENGE_STATUS_UNSPECIFIED;
        public static final ChallengeStatus CLIENT_TIMEOUT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ChallengeStatus EXPIRED;
        public static final ChallengeStatus FAILED;
        public static final ChallengeStatus ISSUED;
        public static final ChallengeStatus REDEEMED;
        public static final ChallengeStatus REPLACED;
        public static final ChallengeStatus VALIDATED;
        private final int value;

        private static final /* synthetic */ ChallengeStatus[] $values() {
            return new ChallengeStatus[]{CHALLENGE_STATUS_UNSPECIFIED, CHALLENGE_STATUS_UNKNOWN, ISSUED, VALIDATED, REDEEMED, FAILED, REPLACED, EXPIRED, CLIENT_TIMEOUT};
        }

        @JvmStatic
        public static final ChallengeStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ChallengeStatus> getEntries() {
            return $ENTRIES;
        }

        private ChallengeStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ChallengeStatus challengeStatus = new ChallengeStatus("CHALLENGE_STATUS_UNSPECIFIED", 0, 0);
            CHALLENGE_STATUS_UNSPECIFIED = challengeStatus;
            CHALLENGE_STATUS_UNKNOWN = new ChallengeStatus("CHALLENGE_STATUS_UNKNOWN", 1, 1);
            ISSUED = new ChallengeStatus("ISSUED", 2, 2);
            VALIDATED = new ChallengeStatus("VALIDATED", 3, 3);
            REDEEMED = new ChallengeStatus("REDEEMED", 4, 4);
            FAILED = new ChallengeStatus("FAILED", 5, 5);
            REPLACED = new ChallengeStatus("REPLACED", 6, 6);
            EXPIRED = new ChallengeStatus("EXPIRED", 7, 7);
            CLIENT_TIMEOUT = new ChallengeStatus("CLIENT_TIMEOUT", 8, 8);
            ChallengeStatus[] challengeStatusArr$values = $values();
            $VALUES = challengeStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(challengeStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChallengeStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ChallengeStatus>(orCreateKotlinClass, syntax, challengeStatus) { // from class: com.robinhood.rosetta.eventlogging.ChallengeContext$ChallengeStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ChallengeContext.ChallengeStatus fromValue(int value) {
                    return ChallengeContext.ChallengeStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ChallengeContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeStatus;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ChallengeStatus fromValue(int value) {
                switch (value) {
                    case 0:
                        return ChallengeStatus.CHALLENGE_STATUS_UNSPECIFIED;
                    case 1:
                        return ChallengeStatus.CHALLENGE_STATUS_UNKNOWN;
                    case 2:
                        return ChallengeStatus.ISSUED;
                    case 3:
                        return ChallengeStatus.VALIDATED;
                    case 4:
                        return ChallengeStatus.REDEEMED;
                    case 5:
                        return ChallengeStatus.FAILED;
                    case 6:
                        return ChallengeStatus.REPLACED;
                    case 7:
                        return ChallengeStatus.EXPIRED;
                    case 8:
                        return ChallengeStatus.CLIENT_TIMEOUT;
                    default:
                        return null;
                }
            }
        }

        public static ChallengeStatus valueOf(String str) {
            return (ChallengeStatus) Enum.valueOf(ChallengeStatus.class, str);
        }

        public static ChallengeStatus[] values() {
            return (ChallengeStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChallengeContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CHALLENGE_TYPE_UNSPECIFIED", "CHALLENGE_TYPE_UNKNOWN", "SMS", "PROMPT", "APP", "EMAIL", "BACKUP_CODE", "CALL", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ChallengeType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChallengeType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ChallengeType> ADAPTER;
        public static final ChallengeType APP;
        public static final ChallengeType BACKUP_CODE;
        public static final ChallengeType CALL;
        public static final ChallengeType CHALLENGE_TYPE_UNKNOWN;
        public static final ChallengeType CHALLENGE_TYPE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ChallengeType EMAIL;
        public static final ChallengeType PROMPT;
        public static final ChallengeType SMS;
        private final int value;

        private static final /* synthetic */ ChallengeType[] $values() {
            return new ChallengeType[]{CHALLENGE_TYPE_UNSPECIFIED, CHALLENGE_TYPE_UNKNOWN, SMS, PROMPT, APP, EMAIL, BACKUP_CODE, CALL};
        }

        @JvmStatic
        public static final ChallengeType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ChallengeType> getEntries() {
            return $ENTRIES;
        }

        private ChallengeType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ChallengeType challengeType = new ChallengeType("CHALLENGE_TYPE_UNSPECIFIED", 0, 0);
            CHALLENGE_TYPE_UNSPECIFIED = challengeType;
            CHALLENGE_TYPE_UNKNOWN = new ChallengeType("CHALLENGE_TYPE_UNKNOWN", 1, 1);
            SMS = new ChallengeType("SMS", 2, 2);
            PROMPT = new ChallengeType("PROMPT", 3, 3);
            APP = new ChallengeType("APP", 4, 4);
            EMAIL = new ChallengeType("EMAIL", 5, 5);
            BACKUP_CODE = new ChallengeType("BACKUP_CODE", 6, 6);
            CALL = new ChallengeType("CALL", 7, 7);
            ChallengeType[] challengeTypeArr$values = $values();
            $VALUES = challengeTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(challengeTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChallengeType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ChallengeType>(orCreateKotlinClass, syntax, challengeType) { // from class: com.robinhood.rosetta.eventlogging.ChallengeContext$ChallengeType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ChallengeContext.ChallengeType fromValue(int value) {
                    return ChallengeContext.ChallengeType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ChallengeContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ChallengeType fromValue(int value) {
                switch (value) {
                    case 0:
                        return ChallengeType.CHALLENGE_TYPE_UNSPECIFIED;
                    case 1:
                        return ChallengeType.CHALLENGE_TYPE_UNKNOWN;
                    case 2:
                        return ChallengeType.SMS;
                    case 3:
                        return ChallengeType.PROMPT;
                    case 4:
                        return ChallengeType.APP;
                    case 5:
                        return ChallengeType.EMAIL;
                    case 6:
                        return ChallengeType.BACKUP_CODE;
                    case 7:
                        return ChallengeType.CALL;
                    default:
                        return null;
                }
            }
        }

        public static ChallengeType valueOf(String str) {
            return (ChallengeType) Enum.valueOf(ChallengeType.class, str);
        }

        public static ChallengeType[] values() {
            return (ChallengeType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChallengeContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContext$DeviceApprovalBlockedType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED", "ERROR", "TIMEOUT", "DENIED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DeviceApprovalBlockedType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DeviceApprovalBlockedType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<DeviceApprovalBlockedType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final DeviceApprovalBlockedType DENIED;
        public static final DeviceApprovalBlockedType DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED;
        public static final DeviceApprovalBlockedType ERROR;
        public static final DeviceApprovalBlockedType TIMEOUT;
        private final int value;

        private static final /* synthetic */ DeviceApprovalBlockedType[] $values() {
            return new DeviceApprovalBlockedType[]{DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED, ERROR, TIMEOUT, DENIED};
        }

        @JvmStatic
        public static final DeviceApprovalBlockedType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<DeviceApprovalBlockedType> getEntries() {
            return $ENTRIES;
        }

        private DeviceApprovalBlockedType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final DeviceApprovalBlockedType deviceApprovalBlockedType = new DeviceApprovalBlockedType("DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED", 0, 0);
            DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED = deviceApprovalBlockedType;
            ERROR = new DeviceApprovalBlockedType("ERROR", 1, 1);
            TIMEOUT = new DeviceApprovalBlockedType("TIMEOUT", 2, 2);
            DENIED = new DeviceApprovalBlockedType("DENIED", 3, 3);
            DeviceApprovalBlockedType[] deviceApprovalBlockedTypeArr$values = $values();
            $VALUES = deviceApprovalBlockedTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(deviceApprovalBlockedTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DeviceApprovalBlockedType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<DeviceApprovalBlockedType>(orCreateKotlinClass, syntax, deviceApprovalBlockedType) { // from class: com.robinhood.rosetta.eventlogging.ChallengeContext$DeviceApprovalBlockedType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ChallengeContext.DeviceApprovalBlockedType fromValue(int value) {
                    return ChallengeContext.DeviceApprovalBlockedType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ChallengeContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContext$DeviceApprovalBlockedType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$DeviceApprovalBlockedType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final DeviceApprovalBlockedType fromValue(int value) {
                if (value == 0) {
                    return DeviceApprovalBlockedType.DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return DeviceApprovalBlockedType.ERROR;
                }
                if (value == 2) {
                    return DeviceApprovalBlockedType.TIMEOUT;
                }
                if (value != 3) {
                    return null;
                }
                return DeviceApprovalBlockedType.DENIED;
            }
        }

        public static DeviceApprovalBlockedType valueOf(String str) {
            return (DeviceApprovalBlockedType) Enum.valueOf(DeviceApprovalBlockedType.class, str);
        }

        public static DeviceApprovalBlockedType[] values() {
            return (DeviceApprovalBlockedType[]) $VALUES.clone();
        }
    }
}
