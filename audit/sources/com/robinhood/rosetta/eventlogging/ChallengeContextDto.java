package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.BooleanDto;
import com.robinhood.rosetta.eventlogging.ChallengeContext;
import com.robinhood.rosetta.eventlogging.ChallengeContextDto;
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

/* compiled from: ChallengeContextDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007789:;<=B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bw\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u0018Jt\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000bJ\b\u0010)\u001a\u00020\u0002H\u0016J\b\u0010*\u001a\u00020\u000bH\u0016J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0096\u0002J\b\u0010/\u001a\u000200H\u0016J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000200H\u0016J\b\u00106\u001a\u000200H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\"R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u0015\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u0017\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001c¨\u0006>"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$Surrogate;)V", "challenge_status", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;", "challenge_identifier", "", "challenge_type", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;", "original_challenge_type", "twilio_verify_challenge_sid", "suv_workflow_identifier", "is_device_approval_silent", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "device_approval_blocked_type", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$DeviceApprovalBlockedTypeDto;", "error_message", "fallback_type", "pathfinder_inquiry_id", "(Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$DeviceApprovalBlockedTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChallenge_status", "()Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;", "getChallenge_identifier", "()Ljava/lang/String;", "getChallenge_type", "()Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;", "getOriginal_challenge_type", "getTwilio_verify_challenge_sid", "getSuv_workflow_identifier", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getDevice_approval_blocked_type", "()Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$DeviceApprovalBlockedTypeDto;", "getError_message", "getFallback_type", "getPathfinder_inquiry_id", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ChallengeStatusDto", "ChallengeTypeDto", "DeviceApprovalBlockedTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ChallengeContextDto implements Dto3<ChallengeContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ChallengeContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ChallengeContextDto, ChallengeContext>> binaryBase64Serializer$delegate;
    private static final ChallengeContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ChallengeContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ChallengeContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ChallengeStatusDto getChallenge_status() {
        return this.surrogate.getChallenge_status();
    }

    public final String getChallenge_identifier() {
        return this.surrogate.getChallenge_identifier();
    }

    public final ChallengeTypeDto getChallenge_type() {
        return this.surrogate.getChallenge_type();
    }

    public final ChallengeTypeDto getOriginal_challenge_type() {
        return this.surrogate.getOriginal_challenge_type();
    }

    public final String getTwilio_verify_challenge_sid() {
        return this.surrogate.getTwilio_verify_challenge_sid();
    }

    public final String getSuv_workflow_identifier() {
        return this.surrogate.getSuv_workflow_identifier();
    }

    public final BooleanDto is_device_approval_silent() {
        return this.surrogate.is_device_approval_silent();
    }

    public final DeviceApprovalBlockedTypeDto getDevice_approval_blocked_type() {
        return this.surrogate.getDevice_approval_blocked_type();
    }

    public final String getError_message() {
        return this.surrogate.getError_message();
    }

    public final String getFallback_type() {
        return this.surrogate.getFallback_type();
    }

    public final String getPathfinder_inquiry_id() {
        return this.surrogate.getPathfinder_inquiry_id();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ChallengeContextDto(com.robinhood.rosetta.eventlogging.ChallengeContextDto.ChallengeStatusDto r2, java.lang.String r3, com.robinhood.rosetta.eventlogging.ChallengeContextDto.ChallengeTypeDto r4, com.robinhood.rosetta.eventlogging.ChallengeContextDto.ChallengeTypeDto r5, java.lang.String r6, java.lang.String r7, com.robinhood.rosetta.eventlogging.BooleanDto r8, com.robinhood.rosetta.eventlogging.ChallengeContextDto.DeviceApprovalBlockedTypeDto r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r1 = this;
            r14 = r13 & 1
            if (r14 == 0) goto La
            com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeStatusDto$Companion r2 = com.robinhood.rosetta.eventlogging.ChallengeContextDto.ChallengeStatusDto.INSTANCE
            com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeStatusDto r2 = r2.getZeroValue()
        La:
            r14 = r13 & 2
            java.lang.String r0 = ""
            if (r14 == 0) goto L11
            r3 = r0
        L11:
            r14 = r13 & 4
            if (r14 == 0) goto L1b
            com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeTypeDto$Companion r4 = com.robinhood.rosetta.eventlogging.ChallengeContextDto.ChallengeTypeDto.INSTANCE
            com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeTypeDto r4 = r4.getZeroValue()
        L1b:
            r14 = r13 & 8
            if (r14 == 0) goto L25
            com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeTypeDto$Companion r5 = com.robinhood.rosetta.eventlogging.ChallengeContextDto.ChallengeTypeDto.INSTANCE
            com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeTypeDto r5 = r5.getZeroValue()
        L25:
            r14 = r13 & 16
            if (r14 == 0) goto L2a
            r6 = r0
        L2a:
            r14 = r13 & 32
            if (r14 == 0) goto L2f
            r7 = r0
        L2f:
            r14 = r13 & 64
            if (r14 == 0) goto L39
            com.robinhood.rosetta.eventlogging.BooleanDto$Companion r8 = com.robinhood.rosetta.eventlogging.BooleanDto.INSTANCE
            com.robinhood.rosetta.eventlogging.BooleanDto r8 = r8.getZeroValue()
        L39:
            r14 = r13 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L43
            com.robinhood.rosetta.eventlogging.ChallengeContextDto$DeviceApprovalBlockedTypeDto$Companion r9 = com.robinhood.rosetta.eventlogging.ChallengeContextDto.DeviceApprovalBlockedTypeDto.INSTANCE
            com.robinhood.rosetta.eventlogging.ChallengeContextDto$DeviceApprovalBlockedTypeDto r9 = r9.getZeroValue()
        L43:
            r14 = r13 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L48
            r10 = r0
        L48:
            r14 = r13 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L4d
            r11 = r0
        L4d:
            r13 = r13 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L5e
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
            goto L6a
        L5e:
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
        L6a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ChallengeContextDto.<init>(com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeStatusDto, java.lang.String, com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeTypeDto, com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeTypeDto, java.lang.String, java.lang.String, com.robinhood.rosetta.eventlogging.BooleanDto, com.robinhood.rosetta.eventlogging.ChallengeContextDto$DeviceApprovalBlockedTypeDto, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeContextDto(ChallengeStatusDto challenge_status, String challenge_identifier, ChallengeTypeDto challenge_type, ChallengeTypeDto original_challenge_type, String twilio_verify_challenge_sid, String suv_workflow_identifier, BooleanDto is_device_approval_silent, DeviceApprovalBlockedTypeDto device_approval_blocked_type, String error_message, String fallback_type, String pathfinder_inquiry_id) {
        this(new Surrogate(challenge_status, challenge_identifier, challenge_type, original_challenge_type, twilio_verify_challenge_sid, suv_workflow_identifier, is_device_approval_silent, device_approval_blocked_type, error_message, fallback_type, pathfinder_inquiry_id));
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
    }

    public static /* synthetic */ ChallengeContextDto copy$default(ChallengeContextDto challengeContextDto, ChallengeStatusDto challengeStatusDto, String str, ChallengeTypeDto challengeTypeDto, ChallengeTypeDto challengeTypeDto2, String str2, String str3, BooleanDto booleanDto, DeviceApprovalBlockedTypeDto deviceApprovalBlockedTypeDto, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            challengeStatusDto = challengeContextDto.surrogate.getChallenge_status();
        }
        if ((i & 2) != 0) {
            str = challengeContextDto.surrogate.getChallenge_identifier();
        }
        if ((i & 4) != 0) {
            challengeTypeDto = challengeContextDto.surrogate.getChallenge_type();
        }
        if ((i & 8) != 0) {
            challengeTypeDto2 = challengeContextDto.surrogate.getOriginal_challenge_type();
        }
        if ((i & 16) != 0) {
            str2 = challengeContextDto.surrogate.getTwilio_verify_challenge_sid();
        }
        if ((i & 32) != 0) {
            str3 = challengeContextDto.surrogate.getSuv_workflow_identifier();
        }
        if ((i & 64) != 0) {
            booleanDto = challengeContextDto.surrogate.is_device_approval_silent();
        }
        if ((i & 128) != 0) {
            deviceApprovalBlockedTypeDto = challengeContextDto.surrogate.getDevice_approval_blocked_type();
        }
        if ((i & 256) != 0) {
            str4 = challengeContextDto.surrogate.getError_message();
        }
        if ((i & 512) != 0) {
            str5 = challengeContextDto.surrogate.getFallback_type();
        }
        if ((i & 1024) != 0) {
            str6 = challengeContextDto.surrogate.getPathfinder_inquiry_id();
        }
        String str7 = str5;
        String str8 = str6;
        DeviceApprovalBlockedTypeDto deviceApprovalBlockedTypeDto2 = deviceApprovalBlockedTypeDto;
        String str9 = str4;
        String str10 = str3;
        BooleanDto booleanDto2 = booleanDto;
        String str11 = str2;
        ChallengeTypeDto challengeTypeDto3 = challengeTypeDto;
        return challengeContextDto.copy(challengeStatusDto, str, challengeTypeDto3, challengeTypeDto2, str11, str10, booleanDto2, deviceApprovalBlockedTypeDto2, str9, str7, str8);
    }

    public final ChallengeContextDto copy(ChallengeStatusDto challenge_status, String challenge_identifier, ChallengeTypeDto challenge_type, ChallengeTypeDto original_challenge_type, String twilio_verify_challenge_sid, String suv_workflow_identifier, BooleanDto is_device_approval_silent, DeviceApprovalBlockedTypeDto device_approval_blocked_type, String error_message, String fallback_type, String pathfinder_inquiry_id) {
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
        return new ChallengeContextDto(new Surrogate(challenge_status, challenge_identifier, challenge_type, original_challenge_type, twilio_verify_challenge_sid, suv_workflow_identifier, is_device_approval_silent, device_approval_blocked_type, error_message, fallback_type, pathfinder_inquiry_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ChallengeContext toProto() {
        return new ChallengeContext((ChallengeContext.ChallengeStatus) this.surrogate.getChallenge_status().toProto(), this.surrogate.getChallenge_identifier(), (ChallengeContext.ChallengeType) this.surrogate.getChallenge_type().toProto(), (ChallengeContext.ChallengeType) this.surrogate.getOriginal_challenge_type().toProto(), this.surrogate.getTwilio_verify_challenge_sid(), this.surrogate.getSuv_workflow_identifier(), (Boolean) this.surrogate.is_device_approval_silent().toProto(), (ChallengeContext.DeviceApprovalBlockedType) this.surrogate.getDevice_approval_blocked_type().toProto(), this.surrogate.getError_message(), this.surrogate.getFallback_type(), this.surrogate.getPathfinder_inquiry_id(), null, 2048, null);
    }

    public String toString() {
        return "[ChallengeContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ChallengeContextDto) && Intrinsics.areEqual(((ChallengeContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: ChallengeContextDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 N2\u00020\u0001:\u0002MNBu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0012\u0010\u0018J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\t\u0010;\u001a\u00020\u000eHÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003Jw\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\u0015HÖ\u0001J\t\u0010D\u001a\u00020\u0005HÖ\u0001J%\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0001¢\u0006\u0002\bLR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\"R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001fR\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001fR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001a\u001a\u0004\b\u000b\u0010*R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010-R\u001c\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001fR\u001c\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001a\u001a\u0004\b1\u0010\u001fR\u001c\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010\u001f¨\u0006O"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$Surrogate;", "", "challenge_status", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;", "challenge_identifier", "", "challenge_type", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;", "original_challenge_type", "twilio_verify_challenge_sid", "suv_workflow_identifier", "is_device_approval_silent", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "device_approval_blocked_type", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$DeviceApprovalBlockedTypeDto;", "error_message", "fallback_type", "pathfinder_inquiry_id", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$DeviceApprovalBlockedTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$DeviceApprovalBlockedTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getChallenge_status$annotations", "()V", "getChallenge_status", "()Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;", "getChallenge_identifier$annotations", "getChallenge_identifier", "()Ljava/lang/String;", "getChallenge_type$annotations", "getChallenge_type", "()Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;", "getOriginal_challenge_type$annotations", "getOriginal_challenge_type", "getTwilio_verify_challenge_sid$annotations", "getTwilio_verify_challenge_sid", "getSuv_workflow_identifier$annotations", "getSuv_workflow_identifier", "is_device_approval_silent$annotations", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getDevice_approval_blocked_type$annotations", "getDevice_approval_blocked_type", "()Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$DeviceApprovalBlockedTypeDto;", "getError_message$annotations", "getError_message", "getFallback_type$annotations", "getFallback_type", "getPathfinder_inquiry_id$annotations", "getPathfinder_inquiry_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String challenge_identifier;
        private final ChallengeStatusDto challenge_status;
        private final ChallengeTypeDto challenge_type;
        private final DeviceApprovalBlockedTypeDto device_approval_blocked_type;
        private final String error_message;
        private final String fallback_type;
        private final BooleanDto is_device_approval_silent;
        private final ChallengeTypeDto original_challenge_type;
        private final String pathfinder_inquiry_id;
        private final String suv_workflow_identifier;
        private final String twilio_verify_challenge_sid;

        public Surrogate() {
            this((ChallengeStatusDto) null, (String) null, (ChallengeTypeDto) null, (ChallengeTypeDto) null, (String) null, (String) null, (BooleanDto) null, (DeviceApprovalBlockedTypeDto) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ChallengeStatusDto challengeStatusDto, String str, ChallengeTypeDto challengeTypeDto, ChallengeTypeDto challengeTypeDto2, String str2, String str3, BooleanDto booleanDto, DeviceApprovalBlockedTypeDto deviceApprovalBlockedTypeDto, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                challengeStatusDto = surrogate.challenge_status;
            }
            if ((i & 2) != 0) {
                str = surrogate.challenge_identifier;
            }
            if ((i & 4) != 0) {
                challengeTypeDto = surrogate.challenge_type;
            }
            if ((i & 8) != 0) {
                challengeTypeDto2 = surrogate.original_challenge_type;
            }
            if ((i & 16) != 0) {
                str2 = surrogate.twilio_verify_challenge_sid;
            }
            if ((i & 32) != 0) {
                str3 = surrogate.suv_workflow_identifier;
            }
            if ((i & 64) != 0) {
                booleanDto = surrogate.is_device_approval_silent;
            }
            if ((i & 128) != 0) {
                deviceApprovalBlockedTypeDto = surrogate.device_approval_blocked_type;
            }
            if ((i & 256) != 0) {
                str4 = surrogate.error_message;
            }
            if ((i & 512) != 0) {
                str5 = surrogate.fallback_type;
            }
            if ((i & 1024) != 0) {
                str6 = surrogate.pathfinder_inquiry_id;
            }
            String str7 = str5;
            String str8 = str6;
            DeviceApprovalBlockedTypeDto deviceApprovalBlockedTypeDto2 = deviceApprovalBlockedTypeDto;
            String str9 = str4;
            String str10 = str3;
            BooleanDto booleanDto2 = booleanDto;
            String str11 = str2;
            ChallengeTypeDto challengeTypeDto3 = challengeTypeDto;
            return surrogate.copy(challengeStatusDto, str, challengeTypeDto3, challengeTypeDto2, str11, str10, booleanDto2, deviceApprovalBlockedTypeDto2, str9, str7, str8);
        }

        @SerialName("challengeIdentifier")
        @JsonAnnotations2(names = {"challenge_identifier"})
        public static /* synthetic */ void getChallenge_identifier$annotations() {
        }

        @SerialName("challengeStatus")
        @JsonAnnotations2(names = {"challenge_status"})
        public static /* synthetic */ void getChallenge_status$annotations() {
        }

        @SerialName("challengeType")
        @JsonAnnotations2(names = {"challenge_type"})
        public static /* synthetic */ void getChallenge_type$annotations() {
        }

        @SerialName("deviceApprovalBlockedType")
        @JsonAnnotations2(names = {"device_approval_blocked_type"})
        public static /* synthetic */ void getDevice_approval_blocked_type$annotations() {
        }

        @SerialName("errorMessage")
        @JsonAnnotations2(names = {"error_message"})
        public static /* synthetic */ void getError_message$annotations() {
        }

        @SerialName("fallbackType")
        @JsonAnnotations2(names = {"fallback_type"})
        public static /* synthetic */ void getFallback_type$annotations() {
        }

        @SerialName("originalChallengeType")
        @JsonAnnotations2(names = {"original_challenge_type"})
        public static /* synthetic */ void getOriginal_challenge_type$annotations() {
        }

        @SerialName("pathfinderInquiryId")
        @JsonAnnotations2(names = {"pathfinder_inquiry_id"})
        public static /* synthetic */ void getPathfinder_inquiry_id$annotations() {
        }

        @SerialName("suvWorkflowIdentifier")
        @JsonAnnotations2(names = {"suv_workflow_identifier"})
        public static /* synthetic */ void getSuv_workflow_identifier$annotations() {
        }

        @SerialName("twilioVerifyChallengeSid")
        @JsonAnnotations2(names = {"twilio_verify_challenge_sid"})
        public static /* synthetic */ void getTwilio_verify_challenge_sid$annotations() {
        }

        @SerialName("isDeviceApprovalSilent")
        @JsonAnnotations2(names = {"is_device_approval_silent"})
        public static /* synthetic */ void is_device_approval_silent$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ChallengeStatusDto getChallenge_status() {
            return this.challenge_status;
        }

        /* renamed from: component10, reason: from getter */
        public final String getFallback_type() {
            return this.fallback_type;
        }

        /* renamed from: component11, reason: from getter */
        public final String getPathfinder_inquiry_id() {
            return this.pathfinder_inquiry_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getChallenge_identifier() {
            return this.challenge_identifier;
        }

        /* renamed from: component3, reason: from getter */
        public final ChallengeTypeDto getChallenge_type() {
            return this.challenge_type;
        }

        /* renamed from: component4, reason: from getter */
        public final ChallengeTypeDto getOriginal_challenge_type() {
            return this.original_challenge_type;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTwilio_verify_challenge_sid() {
            return this.twilio_verify_challenge_sid;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSuv_workflow_identifier() {
            return this.suv_workflow_identifier;
        }

        /* renamed from: component7, reason: from getter */
        public final BooleanDto getIs_device_approval_silent() {
            return this.is_device_approval_silent;
        }

        /* renamed from: component8, reason: from getter */
        public final DeviceApprovalBlockedTypeDto getDevice_approval_blocked_type() {
            return this.device_approval_blocked_type;
        }

        /* renamed from: component9, reason: from getter */
        public final String getError_message() {
            return this.error_message;
        }

        public final Surrogate copy(ChallengeStatusDto challenge_status, String challenge_identifier, ChallengeTypeDto challenge_type, ChallengeTypeDto original_challenge_type, String twilio_verify_challenge_sid, String suv_workflow_identifier, BooleanDto is_device_approval_silent, DeviceApprovalBlockedTypeDto device_approval_blocked_type, String error_message, String fallback_type, String pathfinder_inquiry_id) {
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
            return new Surrogate(challenge_status, challenge_identifier, challenge_type, original_challenge_type, twilio_verify_challenge_sid, suv_workflow_identifier, is_device_approval_silent, device_approval_blocked_type, error_message, fallback_type, pathfinder_inquiry_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.challenge_status == surrogate.challenge_status && Intrinsics.areEqual(this.challenge_identifier, surrogate.challenge_identifier) && this.challenge_type == surrogate.challenge_type && this.original_challenge_type == surrogate.original_challenge_type && Intrinsics.areEqual(this.twilio_verify_challenge_sid, surrogate.twilio_verify_challenge_sid) && Intrinsics.areEqual(this.suv_workflow_identifier, surrogate.suv_workflow_identifier) && this.is_device_approval_silent == surrogate.is_device_approval_silent && this.device_approval_blocked_type == surrogate.device_approval_blocked_type && Intrinsics.areEqual(this.error_message, surrogate.error_message) && Intrinsics.areEqual(this.fallback_type, surrogate.fallback_type) && Intrinsics.areEqual(this.pathfinder_inquiry_id, surrogate.pathfinder_inquiry_id);
        }

        public int hashCode() {
            return (((((((((((((((((((this.challenge_status.hashCode() * 31) + this.challenge_identifier.hashCode()) * 31) + this.challenge_type.hashCode()) * 31) + this.original_challenge_type.hashCode()) * 31) + this.twilio_verify_challenge_sid.hashCode()) * 31) + this.suv_workflow_identifier.hashCode()) * 31) + this.is_device_approval_silent.hashCode()) * 31) + this.device_approval_blocked_type.hashCode()) * 31) + this.error_message.hashCode()) * 31) + this.fallback_type.hashCode()) * 31) + this.pathfinder_inquiry_id.hashCode();
        }

        public String toString() {
            return "Surrogate(challenge_status=" + this.challenge_status + ", challenge_identifier=" + this.challenge_identifier + ", challenge_type=" + this.challenge_type + ", original_challenge_type=" + this.original_challenge_type + ", twilio_verify_challenge_sid=" + this.twilio_verify_challenge_sid + ", suv_workflow_identifier=" + this.suv_workflow_identifier + ", is_device_approval_silent=" + this.is_device_approval_silent + ", device_approval_blocked_type=" + this.device_approval_blocked_type + ", error_message=" + this.error_message + ", fallback_type=" + this.fallback_type + ", pathfinder_inquiry_id=" + this.pathfinder_inquiry_id + ")";
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ChallengeContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ChallengeStatusDto challengeStatusDto, String str, ChallengeTypeDto challengeTypeDto, ChallengeTypeDto challengeTypeDto2, String str2, String str3, BooleanDto booleanDto, DeviceApprovalBlockedTypeDto deviceApprovalBlockedTypeDto, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
            this.challenge_status = (i & 1) == 0 ? ChallengeStatusDto.INSTANCE.getZeroValue() : challengeStatusDto;
            if ((i & 2) == 0) {
                this.challenge_identifier = "";
            } else {
                this.challenge_identifier = str;
            }
            if ((i & 4) == 0) {
                this.challenge_type = ChallengeTypeDto.INSTANCE.getZeroValue();
            } else {
                this.challenge_type = challengeTypeDto;
            }
            if ((i & 8) == 0) {
                this.original_challenge_type = ChallengeTypeDto.INSTANCE.getZeroValue();
            } else {
                this.original_challenge_type = challengeTypeDto2;
            }
            if ((i & 16) == 0) {
                this.twilio_verify_challenge_sid = "";
            } else {
                this.twilio_verify_challenge_sid = str2;
            }
            if ((i & 32) == 0) {
                this.suv_workflow_identifier = "";
            } else {
                this.suv_workflow_identifier = str3;
            }
            if ((i & 64) == 0) {
                this.is_device_approval_silent = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.is_device_approval_silent = booleanDto;
            }
            if ((i & 128) == 0) {
                this.device_approval_blocked_type = DeviceApprovalBlockedTypeDto.INSTANCE.getZeroValue();
            } else {
                this.device_approval_blocked_type = deviceApprovalBlockedTypeDto;
            }
            if ((i & 256) == 0) {
                this.error_message = "";
            } else {
                this.error_message = str4;
            }
            if ((i & 512) == 0) {
                this.fallback_type = "";
            } else {
                this.fallback_type = str5;
            }
            if ((i & 1024) == 0) {
                this.pathfinder_inquiry_id = "";
            } else {
                this.pathfinder_inquiry_id = str6;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.challenge_status != ChallengeStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, ChallengeStatusDto.Serializer.INSTANCE, self.challenge_status);
            }
            if (!Intrinsics.areEqual(self.challenge_identifier, "")) {
                output.encodeStringElement(serialDesc, 1, self.challenge_identifier);
            }
            ChallengeTypeDto challengeTypeDto = self.challenge_type;
            ChallengeTypeDto.Companion companion = ChallengeTypeDto.INSTANCE;
            if (challengeTypeDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, ChallengeTypeDto.Serializer.INSTANCE, self.challenge_type);
            }
            if (self.original_challenge_type != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, ChallengeTypeDto.Serializer.INSTANCE, self.original_challenge_type);
            }
            if (!Intrinsics.areEqual(self.twilio_verify_challenge_sid, "")) {
                output.encodeStringElement(serialDesc, 4, self.twilio_verify_challenge_sid);
            }
            if (!Intrinsics.areEqual(self.suv_workflow_identifier, "")) {
                output.encodeStringElement(serialDesc, 5, self.suv_workflow_identifier);
            }
            if (self.is_device_approval_silent != BooleanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, BooleanDto.Serializer.INSTANCE, self.is_device_approval_silent);
            }
            if (self.device_approval_blocked_type != DeviceApprovalBlockedTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, DeviceApprovalBlockedTypeDto.Serializer.INSTANCE, self.device_approval_blocked_type);
            }
            if (!Intrinsics.areEqual(self.error_message, "")) {
                output.encodeStringElement(serialDesc, 8, self.error_message);
            }
            if (!Intrinsics.areEqual(self.fallback_type, "")) {
                output.encodeStringElement(serialDesc, 9, self.fallback_type);
            }
            if (Intrinsics.areEqual(self.pathfinder_inquiry_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 10, self.pathfinder_inquiry_id);
        }

        public Surrogate(ChallengeStatusDto challenge_status, String challenge_identifier, ChallengeTypeDto challenge_type, ChallengeTypeDto original_challenge_type, String twilio_verify_challenge_sid, String suv_workflow_identifier, BooleanDto is_device_approval_silent, DeviceApprovalBlockedTypeDto device_approval_blocked_type, String error_message, String fallback_type, String pathfinder_inquiry_id) {
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

        public final ChallengeStatusDto getChallenge_status() {
            return this.challenge_status;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.rosetta.eventlogging.ChallengeContextDto.ChallengeStatusDto r2, java.lang.String r3, com.robinhood.rosetta.eventlogging.ChallengeContextDto.ChallengeTypeDto r4, com.robinhood.rosetta.eventlogging.ChallengeContextDto.ChallengeTypeDto r5, java.lang.String r6, java.lang.String r7, com.robinhood.rosetta.eventlogging.BooleanDto r8, com.robinhood.rosetta.eventlogging.ChallengeContextDto.DeviceApprovalBlockedTypeDto r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            /*
                r1 = this;
                r14 = r13 & 1
                if (r14 == 0) goto La
                com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeStatusDto$Companion r2 = com.robinhood.rosetta.eventlogging.ChallengeContextDto.ChallengeStatusDto.INSTANCE
                com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeStatusDto r2 = r2.getZeroValue()
            La:
                r14 = r13 & 2
                java.lang.String r0 = ""
                if (r14 == 0) goto L11
                r3 = r0
            L11:
                r14 = r13 & 4
                if (r14 == 0) goto L1b
                com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeTypeDto$Companion r4 = com.robinhood.rosetta.eventlogging.ChallengeContextDto.ChallengeTypeDto.INSTANCE
                com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeTypeDto r4 = r4.getZeroValue()
            L1b:
                r14 = r13 & 8
                if (r14 == 0) goto L25
                com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeTypeDto$Companion r5 = com.robinhood.rosetta.eventlogging.ChallengeContextDto.ChallengeTypeDto.INSTANCE
                com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeTypeDto r5 = r5.getZeroValue()
            L25:
                r14 = r13 & 16
                if (r14 == 0) goto L2a
                r6 = r0
            L2a:
                r14 = r13 & 32
                if (r14 == 0) goto L2f
                r7 = r0
            L2f:
                r14 = r13 & 64
                if (r14 == 0) goto L39
                com.robinhood.rosetta.eventlogging.BooleanDto$Companion r8 = com.robinhood.rosetta.eventlogging.BooleanDto.INSTANCE
                com.robinhood.rosetta.eventlogging.BooleanDto r8 = r8.getZeroValue()
            L39:
                r14 = r13 & 128(0x80, float:1.794E-43)
                if (r14 == 0) goto L43
                com.robinhood.rosetta.eventlogging.ChallengeContextDto$DeviceApprovalBlockedTypeDto$Companion r9 = com.robinhood.rosetta.eventlogging.ChallengeContextDto.DeviceApprovalBlockedTypeDto.INSTANCE
                com.robinhood.rosetta.eventlogging.ChallengeContextDto$DeviceApprovalBlockedTypeDto r9 = r9.getZeroValue()
            L43:
                r14 = r13 & 256(0x100, float:3.59E-43)
                if (r14 == 0) goto L48
                r10 = r0
            L48:
                r14 = r13 & 512(0x200, float:7.175E-43)
                if (r14 == 0) goto L4d
                r11 = r0
            L4d:
                r13 = r13 & 1024(0x400, float:1.435E-42)
                if (r13 == 0) goto L5e
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
                goto L6a
            L5e:
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
            L6a:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ChallengeContextDto.Surrogate.<init>(com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeStatusDto, java.lang.String, com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeTypeDto, com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeTypeDto, java.lang.String, java.lang.String, com.robinhood.rosetta.eventlogging.BooleanDto, com.robinhood.rosetta.eventlogging.ChallengeContextDto$DeviceApprovalBlockedTypeDto, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getChallenge_identifier() {
            return this.challenge_identifier;
        }

        public final ChallengeTypeDto getChallenge_type() {
            return this.challenge_type;
        }

        public final ChallengeTypeDto getOriginal_challenge_type() {
            return this.original_challenge_type;
        }

        public final String getTwilio_verify_challenge_sid() {
            return this.twilio_verify_challenge_sid;
        }

        public final String getSuv_workflow_identifier() {
            return this.suv_workflow_identifier;
        }

        public final BooleanDto is_device_approval_silent() {
            return this.is_device_approval_silent;
        }

        public final DeviceApprovalBlockedTypeDto getDevice_approval_blocked_type() {
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
    }

    /* compiled from: ChallengeContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ChallengeContextDto, ChallengeContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ChallengeContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChallengeContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChallengeContextDto> getBinaryBase64Serializer() {
            return (KSerializer) ChallengeContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ChallengeContext> getProtoAdapter() {
            return ChallengeContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChallengeContextDto getZeroValue() {
            return ChallengeContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChallengeContextDto fromProto(ChallengeContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ChallengeStatusDto challengeStatusDtoFromProto = ChallengeStatusDto.INSTANCE.fromProto(proto.getChallenge_status());
            String challenge_identifier = proto.getChallenge_identifier();
            ChallengeTypeDto.Companion companion = ChallengeTypeDto.INSTANCE;
            return new ChallengeContextDto(new Surrogate(challengeStatusDtoFromProto, challenge_identifier, companion.fromProto(proto.getChallenge_type()), companion.fromProto(proto.getOriginal_challenge_type()), proto.getTwilio_verify_challenge_sid(), proto.getSuv_workflow_identifier(), BooleanDto.INSTANCE.fromProto(proto.getIs_device_approval_silent()), DeviceApprovalBlockedTypeDto.INSTANCE.fromProto(proto.getDevice_approval_blocked_type()), proto.getError_message(), proto.getFallback_type(), proto.getPathfinder_inquiry_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ChallengeContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChallengeContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ChallengeContextDto(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChallengeContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CHALLENGE_STATUS_UNSPECIFIED", "CHALLENGE_STATUS_UNKNOWN", "ISSUED", "VALIDATED", "REDEEMED", "FAILED", "REPLACED", "EXPIRED", "CLIENT_TIMEOUT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ChallengeStatusDto implements Dto2<ChallengeContext.ChallengeStatus>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChallengeStatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ChallengeStatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ChallengeStatusDto, ChallengeContext.ChallengeStatus>> binaryBase64Serializer$delegate;
        public static final ChallengeStatusDto CHALLENGE_STATUS_UNSPECIFIED = new CHALLENGE_STATUS_UNSPECIFIED("CHALLENGE_STATUS_UNSPECIFIED", 0);
        public static final ChallengeStatusDto CHALLENGE_STATUS_UNKNOWN = new CHALLENGE_STATUS_UNKNOWN("CHALLENGE_STATUS_UNKNOWN", 1);
        public static final ChallengeStatusDto ISSUED = new ISSUED("ISSUED", 2);
        public static final ChallengeStatusDto VALIDATED = new VALIDATED("VALIDATED", 3);
        public static final ChallengeStatusDto REDEEMED = new REDEEMED("REDEEMED", 4);
        public static final ChallengeStatusDto FAILED = new FAILED("FAILED", 5);
        public static final ChallengeStatusDto REPLACED = new REPLACED("REPLACED", 6);
        public static final ChallengeStatusDto EXPIRED = new EXPIRED("EXPIRED", 7);
        public static final ChallengeStatusDto CLIENT_TIMEOUT = new CLIENT_TIMEOUT("CLIENT_TIMEOUT", 8);

        private static final /* synthetic */ ChallengeStatusDto[] $values() {
            return new ChallengeStatusDto[]{CHALLENGE_STATUS_UNSPECIFIED, CHALLENGE_STATUS_UNKNOWN, ISSUED, VALIDATED, REDEEMED, FAILED, REPLACED, EXPIRED, CLIENT_TIMEOUT};
        }

        public /* synthetic */ ChallengeStatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ChallengeStatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.ChallengeStatusDto.CHALLENGE_STATUS_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHALLENGE_STATUS_UNSPECIFIED extends ChallengeStatusDto {
            CHALLENGE_STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.ChallengeStatus toProto() {
                return ChallengeContext.ChallengeStatus.CHALLENGE_STATUS_UNSPECIFIED;
            }
        }

        private ChallengeStatusDto(String str, int i) {
        }

        static {
            ChallengeStatusDto[] challengeStatusDtoArr$values = $values();
            $VALUES = challengeStatusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(challengeStatusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeStatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChallengeContextDto.ChallengeStatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.ChallengeStatusDto.CHALLENGE_STATUS_UNKNOWN", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHALLENGE_STATUS_UNKNOWN extends ChallengeStatusDto {
            CHALLENGE_STATUS_UNKNOWN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.ChallengeStatus toProto() {
                return ChallengeContext.ChallengeStatus.CHALLENGE_STATUS_UNKNOWN;
            }
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.ChallengeStatusDto.ISSUED", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ISSUED extends ChallengeStatusDto {
            ISSUED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.ChallengeStatus toProto() {
                return ChallengeContext.ChallengeStatus.ISSUED;
            }
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.ChallengeStatusDto.VALIDATED", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VALIDATED extends ChallengeStatusDto {
            VALIDATED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.ChallengeStatus toProto() {
                return ChallengeContext.ChallengeStatus.VALIDATED;
            }
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.ChallengeStatusDto.REDEEMED", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REDEEMED extends ChallengeStatusDto {
            REDEEMED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.ChallengeStatus toProto() {
                return ChallengeContext.ChallengeStatus.REDEEMED;
            }
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.ChallengeStatusDto.FAILED", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILED extends ChallengeStatusDto {
            FAILED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.ChallengeStatus toProto() {
                return ChallengeContext.ChallengeStatus.FAILED;
            }
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.ChallengeStatusDto.REPLACED", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REPLACED extends ChallengeStatusDto {
            REPLACED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.ChallengeStatus toProto() {
                return ChallengeContext.ChallengeStatus.REPLACED;
            }
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.ChallengeStatusDto.EXPIRED", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EXPIRED extends ChallengeStatusDto {
            EXPIRED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.ChallengeStatus toProto() {
                return ChallengeContext.ChallengeStatus.EXPIRED;
            }
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.ChallengeStatusDto.CLIENT_TIMEOUT", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CLIENT_TIMEOUT extends ChallengeStatusDto {
            CLIENT_TIMEOUT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.ChallengeStatus toProto() {
                return ChallengeContext.ChallengeStatus.CLIENT_TIMEOUT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ChallengeStatusDto, ChallengeContext.ChallengeStatus> {

            /* compiled from: ChallengeContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ChallengeContext.ChallengeStatus.values().length];
                    try {
                        iArr[ChallengeContext.ChallengeStatus.CHALLENGE_STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ChallengeContext.ChallengeStatus.CHALLENGE_STATUS_UNKNOWN.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ChallengeContext.ChallengeStatus.ISSUED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ChallengeContext.ChallengeStatus.VALIDATED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ChallengeContext.ChallengeStatus.REDEEMED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ChallengeContext.ChallengeStatus.FAILED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[ChallengeContext.ChallengeStatus.REPLACED.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[ChallengeContext.ChallengeStatus.EXPIRED.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[ChallengeContext.ChallengeStatus.CLIENT_TIMEOUT.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ChallengeStatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChallengeStatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChallengeStatusDto> getBinaryBase64Serializer() {
                return (KSerializer) ChallengeStatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ChallengeContext.ChallengeStatus> getProtoAdapter() {
                return ChallengeContext.ChallengeStatus.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChallengeStatusDto getZeroValue() {
                return ChallengeStatusDto.CHALLENGE_STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChallengeStatusDto fromProto(ChallengeContext.ChallengeStatus proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ChallengeStatusDto.CHALLENGE_STATUS_UNSPECIFIED;
                    case 2:
                        return ChallengeStatusDto.CHALLENGE_STATUS_UNKNOWN;
                    case 3:
                        return ChallengeStatusDto.ISSUED;
                    case 4:
                        return ChallengeStatusDto.VALIDATED;
                    case 5:
                        return ChallengeStatusDto.REDEEMED;
                    case 6:
                        return ChallengeStatusDto.FAILED;
                    case 7:
                        return ChallengeStatusDto.REPLACED;
                    case 8:
                        return ChallengeStatusDto.EXPIRED;
                    case 9:
                        return ChallengeStatusDto.CLIENT_TIMEOUT;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ChallengeStatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ChallengeStatusDto, ChallengeContext.ChallengeStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ChallengeContext.ChallengeStatus", ChallengeStatusDto.getEntries(), ChallengeStatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ChallengeStatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ChallengeStatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ChallengeStatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ChallengeStatusDto valueOf(String str) {
            return (ChallengeStatusDto) Enum.valueOf(ChallengeStatusDto.class, str);
        }

        public static ChallengeStatusDto[] values() {
            return (ChallengeStatusDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChallengeContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0016\u0017B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CHALLENGE_TYPE_UNSPECIFIED", "CHALLENGE_TYPE_UNKNOWN", "SMS", "PROMPT", "APP", "EMAIL", "BACKUP_CODE", "CALL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ChallengeTypeDto implements Dto2<ChallengeContext.ChallengeType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChallengeTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ChallengeTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ChallengeTypeDto, ChallengeContext.ChallengeType>> binaryBase64Serializer$delegate;
        public static final ChallengeTypeDto CHALLENGE_TYPE_UNSPECIFIED = new CHALLENGE_TYPE_UNSPECIFIED("CHALLENGE_TYPE_UNSPECIFIED", 0);
        public static final ChallengeTypeDto CHALLENGE_TYPE_UNKNOWN = new CHALLENGE_TYPE_UNKNOWN("CHALLENGE_TYPE_UNKNOWN", 1);
        public static final ChallengeTypeDto SMS = new SMS("SMS", 2);
        public static final ChallengeTypeDto PROMPT = new PROMPT("PROMPT", 3);
        public static final ChallengeTypeDto APP = new APP("APP", 4);
        public static final ChallengeTypeDto EMAIL = new EMAIL("EMAIL", 5);
        public static final ChallengeTypeDto BACKUP_CODE = new BACKUP_CODE("BACKUP_CODE", 6);
        public static final ChallengeTypeDto CALL = new CALL("CALL", 7);

        private static final /* synthetic */ ChallengeTypeDto[] $values() {
            return new ChallengeTypeDto[]{CHALLENGE_TYPE_UNSPECIFIED, CHALLENGE_TYPE_UNKNOWN, SMS, PROMPT, APP, EMAIL, BACKUP_CODE, CALL};
        }

        public /* synthetic */ ChallengeTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ChallengeTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.ChallengeTypeDto.CHALLENGE_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHALLENGE_TYPE_UNSPECIFIED extends ChallengeTypeDto {
            CHALLENGE_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.ChallengeType toProto() {
                return ChallengeContext.ChallengeType.CHALLENGE_TYPE_UNSPECIFIED;
            }
        }

        private ChallengeTypeDto(String str, int i) {
        }

        static {
            ChallengeTypeDto[] challengeTypeDtoArr$values = $values();
            $VALUES = challengeTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(challengeTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ChallengeContextDto$ChallengeTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChallengeContextDto.ChallengeTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.ChallengeTypeDto.CHALLENGE_TYPE_UNKNOWN", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHALLENGE_TYPE_UNKNOWN extends ChallengeTypeDto {
            CHALLENGE_TYPE_UNKNOWN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.ChallengeType toProto() {
                return ChallengeContext.ChallengeType.CHALLENGE_TYPE_UNKNOWN;
            }
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.ChallengeTypeDto.SMS", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SMS extends ChallengeTypeDto {
            SMS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.ChallengeType toProto() {
                return ChallengeContext.ChallengeType.SMS;
            }
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.ChallengeTypeDto.PROMPT", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PROMPT extends ChallengeTypeDto {
            PROMPT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.ChallengeType toProto() {
                return ChallengeContext.ChallengeType.PROMPT;
            }
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.ChallengeTypeDto.APP", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APP extends ChallengeTypeDto {
            APP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.ChallengeType toProto() {
                return ChallengeContext.ChallengeType.APP;
            }
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.ChallengeTypeDto.EMAIL", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EMAIL extends ChallengeTypeDto {
            EMAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.ChallengeType toProto() {
                return ChallengeContext.ChallengeType.EMAIL;
            }
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.ChallengeTypeDto.BACKUP_CODE", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BACKUP_CODE extends ChallengeTypeDto {
            BACKUP_CODE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.ChallengeType toProto() {
                return ChallengeContext.ChallengeType.BACKUP_CODE;
            }
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.ChallengeTypeDto.CALL", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CALL extends ChallengeTypeDto {
            CALL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.ChallengeType toProto() {
                return ChallengeContext.ChallengeType.CALL;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$ChallengeType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ChallengeTypeDto, ChallengeContext.ChallengeType> {

            /* compiled from: ChallengeContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ChallengeContext.ChallengeType.values().length];
                    try {
                        iArr[ChallengeContext.ChallengeType.CHALLENGE_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ChallengeContext.ChallengeType.CHALLENGE_TYPE_UNKNOWN.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ChallengeContext.ChallengeType.SMS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ChallengeContext.ChallengeType.PROMPT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ChallengeContext.ChallengeType.APP.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ChallengeContext.ChallengeType.EMAIL.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[ChallengeContext.ChallengeType.BACKUP_CODE.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[ChallengeContext.ChallengeType.CALL.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ChallengeTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChallengeTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChallengeTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) ChallengeTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ChallengeContext.ChallengeType> getProtoAdapter() {
                return ChallengeContext.ChallengeType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChallengeTypeDto getZeroValue() {
                return ChallengeTypeDto.CHALLENGE_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChallengeTypeDto fromProto(ChallengeContext.ChallengeType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ChallengeTypeDto.CHALLENGE_TYPE_UNSPECIFIED;
                    case 2:
                        return ChallengeTypeDto.CHALLENGE_TYPE_UNKNOWN;
                    case 3:
                        return ChallengeTypeDto.SMS;
                    case 4:
                        return ChallengeTypeDto.PROMPT;
                    case 5:
                        return ChallengeTypeDto.APP;
                    case 6:
                        return ChallengeTypeDto.EMAIL;
                    case 7:
                        return ChallengeTypeDto.BACKUP_CODE;
                    case 8:
                        return ChallengeTypeDto.CALL;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$ChallengeTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ChallengeTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ChallengeTypeDto, ChallengeContext.ChallengeType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ChallengeContext.ChallengeType", ChallengeTypeDto.getEntries(), ChallengeTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ChallengeTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ChallengeTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ChallengeTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ChallengeTypeDto valueOf(String str) {
            return (ChallengeTypeDto) Enum.valueOf(ChallengeTypeDto.class, str);
        }

        public static ChallengeTypeDto[] values() {
            return (ChallengeTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChallengeContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$DeviceApprovalBlockedTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$DeviceApprovalBlockedType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED", "ERROR", "TIMEOUT", "DENIED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DeviceApprovalBlockedTypeDto implements Dto2<ChallengeContext.DeviceApprovalBlockedType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DeviceApprovalBlockedTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<DeviceApprovalBlockedTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<DeviceApprovalBlockedTypeDto, ChallengeContext.DeviceApprovalBlockedType>> binaryBase64Serializer$delegate;
        public static final DeviceApprovalBlockedTypeDto DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED = new DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED("DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED", 0);
        public static final DeviceApprovalBlockedTypeDto ERROR = new ERROR("ERROR", 1);
        public static final DeviceApprovalBlockedTypeDto TIMEOUT = new TIMEOUT("TIMEOUT", 2);
        public static final DeviceApprovalBlockedTypeDto DENIED = new DENIED("DENIED", 3);

        private static final /* synthetic */ DeviceApprovalBlockedTypeDto[] $values() {
            return new DeviceApprovalBlockedTypeDto[]{DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED, ERROR, TIMEOUT, DENIED};
        }

        public /* synthetic */ DeviceApprovalBlockedTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<DeviceApprovalBlockedTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private DeviceApprovalBlockedTypeDto(String str, int i) {
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.DeviceApprovalBlockedTypeDto.DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$DeviceApprovalBlockedTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$DeviceApprovalBlockedType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED extends DeviceApprovalBlockedTypeDto {
            DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.DeviceApprovalBlockedType toProto() {
                return ChallengeContext.DeviceApprovalBlockedType.DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED;
            }
        }

        static {
            DeviceApprovalBlockedTypeDto[] deviceApprovalBlockedTypeDtoArr$values = $values();
            $VALUES = deviceApprovalBlockedTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(deviceApprovalBlockedTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ChallengeContextDto$DeviceApprovalBlockedTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChallengeContextDto.DeviceApprovalBlockedTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.DeviceApprovalBlockedTypeDto.ERROR", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$DeviceApprovalBlockedTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$DeviceApprovalBlockedType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ERROR extends DeviceApprovalBlockedTypeDto {
            ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.DeviceApprovalBlockedType toProto() {
                return ChallengeContext.DeviceApprovalBlockedType.ERROR;
            }
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.DeviceApprovalBlockedTypeDto.TIMEOUT", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$DeviceApprovalBlockedTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$DeviceApprovalBlockedType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TIMEOUT extends DeviceApprovalBlockedTypeDto {
            TIMEOUT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.DeviceApprovalBlockedType toProto() {
                return ChallengeContext.DeviceApprovalBlockedType.TIMEOUT;
            }
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ChallengeContextDto.DeviceApprovalBlockedTypeDto.DENIED", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$DeviceApprovalBlockedTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$DeviceApprovalBlockedType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DENIED extends DeviceApprovalBlockedTypeDto {
            DENIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ChallengeContext.DeviceApprovalBlockedType toProto() {
                return ChallengeContext.DeviceApprovalBlockedType.DENIED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$DeviceApprovalBlockedTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$DeviceApprovalBlockedTypeDto;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContext$DeviceApprovalBlockedType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$DeviceApprovalBlockedTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<DeviceApprovalBlockedTypeDto, ChallengeContext.DeviceApprovalBlockedType> {

            /* compiled from: ChallengeContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ChallengeContext.DeviceApprovalBlockedType.values().length];
                    try {
                        iArr[ChallengeContext.DeviceApprovalBlockedType.DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ChallengeContext.DeviceApprovalBlockedType.ERROR.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ChallengeContext.DeviceApprovalBlockedType.TIMEOUT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ChallengeContext.DeviceApprovalBlockedType.DENIED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<DeviceApprovalBlockedTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DeviceApprovalBlockedTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DeviceApprovalBlockedTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) DeviceApprovalBlockedTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ChallengeContext.DeviceApprovalBlockedType> getProtoAdapter() {
                return ChallengeContext.DeviceApprovalBlockedType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DeviceApprovalBlockedTypeDto getZeroValue() {
                return DeviceApprovalBlockedTypeDto.DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DeviceApprovalBlockedTypeDto fromProto(ChallengeContext.DeviceApprovalBlockedType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return DeviceApprovalBlockedTypeDto.DEVICE_APPROVAL_BLOCKED_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return DeviceApprovalBlockedTypeDto.ERROR;
                }
                if (i == 3) {
                    return DeviceApprovalBlockedTypeDto.TIMEOUT;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return DeviceApprovalBlockedTypeDto.DENIED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ChallengeContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$DeviceApprovalBlockedTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$DeviceApprovalBlockedTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<DeviceApprovalBlockedTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<DeviceApprovalBlockedTypeDto, ChallengeContext.DeviceApprovalBlockedType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ChallengeContext.DeviceApprovalBlockedType", DeviceApprovalBlockedTypeDto.getEntries(), DeviceApprovalBlockedTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public DeviceApprovalBlockedTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (DeviceApprovalBlockedTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DeviceApprovalBlockedTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static DeviceApprovalBlockedTypeDto valueOf(String str) {
            return (DeviceApprovalBlockedTypeDto) Enum.valueOf(DeviceApprovalBlockedTypeDto.class, str);
        }

        public static DeviceApprovalBlockedTypeDto[] values() {
            return (DeviceApprovalBlockedTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ChallengeContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ChallengeContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ChallengeContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ChallengeContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ChallengeContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ChallengeContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ChallengeContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ChallengeContextDto";
        }
    }
}
