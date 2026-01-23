package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.AuthResponseInfoDto;
import com.robinhood.rosetta.eventlogging.ChallengeReplacementInfoDto;
import com.robinhood.rosetta.eventlogging.LocalAuthInfoDto;
import com.robinhood.rosetta.eventlogging.OAuthInfoDto;
import com.robinhood.rosetta.eventlogging.PersonaInfoDto;
import com.robinhood.rosetta.eventlogging.PrismInfoDto;
import com.robinhood.rosetta.eventlogging.SUVInfoDto;
import com.robinhood.rosetta.eventlogging.WorkflowInfoDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
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

/* compiled from: AccountSecurityEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00049:;<B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bi\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0006\u0010\u0018Jf\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\b\u0010*\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020,H\u0016J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0096\u0002J\b\u00101\u001a\u000202H\u0016J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000202H\u0016J\b\u00108\u001a\u000202H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006="}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto$Surrogate;)V", "challenge_replacement_info", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto;", "suv_info", "Lcom/robinhood/rosetta/eventlogging/SUVInfoDto;", "auth_info", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto;", "persona_info", "Lcom/robinhood/rosetta/eventlogging/PersonaInfoDto;", "workflow_info", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto;", "prism_info", "Lcom/robinhood/rosetta/eventlogging/PrismInfoDto;", "local_auth_info", "Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto;", "auth_response_info", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto;", "(Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto;Lcom/robinhood/rosetta/eventlogging/SUVInfoDto;Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto;Lcom/robinhood/rosetta/eventlogging/PersonaInfoDto;Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto;Lcom/robinhood/rosetta/eventlogging/PrismInfoDto;Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto;Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto;)V", "getChallenge_replacement_info", "()Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto;", "getSuv_info", "()Lcom/robinhood/rosetta/eventlogging/SUVInfoDto;", "getAuth_info", "()Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto;", "getPersona_info", "()Lcom/robinhood/rosetta/eventlogging/PersonaInfoDto;", "getWorkflow_info", "()Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto;", "getPrism_info", "()Lcom/robinhood/rosetta/eventlogging/PrismInfoDto;", "getLocal_auth_info", "()Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto;", "getAuth_response_info", "()Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class AccountSecurityEventDataDto implements Dto3<AccountSecurityEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AccountSecurityEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AccountSecurityEventDataDto, AccountSecurityEventData>> binaryBase64Serializer$delegate;
    private static final AccountSecurityEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AccountSecurityEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AccountSecurityEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ChallengeReplacementInfoDto getChallenge_replacement_info() {
        return this.surrogate.getChallenge_replacement_info();
    }

    public final SUVInfoDto getSuv_info() {
        return this.surrogate.getSuv_info();
    }

    public final OAuthInfoDto getAuth_info() {
        return this.surrogate.getAuth_info();
    }

    public final PersonaInfoDto getPersona_info() {
        return this.surrogate.getPersona_info();
    }

    public final WorkflowInfoDto getWorkflow_info() {
        return this.surrogate.getWorkflow_info();
    }

    public final PrismInfoDto getPrism_info() {
        return this.surrogate.getPrism_info();
    }

    public final LocalAuthInfoDto getLocal_auth_info() {
        return this.surrogate.getLocal_auth_info();
    }

    public final AuthResponseInfoDto getAuth_response_info() {
        return this.surrogate.getAuth_response_info();
    }

    public /* synthetic */ AccountSecurityEventDataDto(ChallengeReplacementInfoDto challengeReplacementInfoDto, SUVInfoDto sUVInfoDto, OAuthInfoDto oAuthInfoDto, PersonaInfoDto personaInfoDto, WorkflowInfoDto workflowInfoDto, PrismInfoDto prismInfoDto, LocalAuthInfoDto localAuthInfoDto, AuthResponseInfoDto authResponseInfoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : challengeReplacementInfoDto, (i & 2) != 0 ? null : sUVInfoDto, (i & 4) != 0 ? null : oAuthInfoDto, (i & 8) != 0 ? null : personaInfoDto, (i & 16) != 0 ? null : workflowInfoDto, (i & 32) != 0 ? null : prismInfoDto, (i & 64) != 0 ? null : localAuthInfoDto, (i & 128) != 0 ? null : authResponseInfoDto);
    }

    public AccountSecurityEventDataDto(ChallengeReplacementInfoDto challengeReplacementInfoDto, SUVInfoDto sUVInfoDto, OAuthInfoDto oAuthInfoDto, PersonaInfoDto personaInfoDto, WorkflowInfoDto workflowInfoDto, PrismInfoDto prismInfoDto, LocalAuthInfoDto localAuthInfoDto, AuthResponseInfoDto authResponseInfoDto) {
        this(new Surrogate(challengeReplacementInfoDto, sUVInfoDto, oAuthInfoDto, personaInfoDto, workflowInfoDto, prismInfoDto, localAuthInfoDto, authResponseInfoDto));
    }

    public static /* synthetic */ AccountSecurityEventDataDto copy$default(AccountSecurityEventDataDto accountSecurityEventDataDto, ChallengeReplacementInfoDto challengeReplacementInfoDto, SUVInfoDto sUVInfoDto, OAuthInfoDto oAuthInfoDto, PersonaInfoDto personaInfoDto, WorkflowInfoDto workflowInfoDto, PrismInfoDto prismInfoDto, LocalAuthInfoDto localAuthInfoDto, AuthResponseInfoDto authResponseInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            challengeReplacementInfoDto = accountSecurityEventDataDto.surrogate.getChallenge_replacement_info();
        }
        if ((i & 2) != 0) {
            sUVInfoDto = accountSecurityEventDataDto.surrogate.getSuv_info();
        }
        if ((i & 4) != 0) {
            oAuthInfoDto = accountSecurityEventDataDto.surrogate.getAuth_info();
        }
        if ((i & 8) != 0) {
            personaInfoDto = accountSecurityEventDataDto.surrogate.getPersona_info();
        }
        if ((i & 16) != 0) {
            workflowInfoDto = accountSecurityEventDataDto.surrogate.getWorkflow_info();
        }
        if ((i & 32) != 0) {
            prismInfoDto = accountSecurityEventDataDto.surrogate.getPrism_info();
        }
        if ((i & 64) != 0) {
            localAuthInfoDto = accountSecurityEventDataDto.surrogate.getLocal_auth_info();
        }
        if ((i & 128) != 0) {
            authResponseInfoDto = accountSecurityEventDataDto.surrogate.getAuth_response_info();
        }
        LocalAuthInfoDto localAuthInfoDto2 = localAuthInfoDto;
        AuthResponseInfoDto authResponseInfoDto2 = authResponseInfoDto;
        WorkflowInfoDto workflowInfoDto2 = workflowInfoDto;
        PrismInfoDto prismInfoDto2 = prismInfoDto;
        return accountSecurityEventDataDto.copy(challengeReplacementInfoDto, sUVInfoDto, oAuthInfoDto, personaInfoDto, workflowInfoDto2, prismInfoDto2, localAuthInfoDto2, authResponseInfoDto2);
    }

    public final AccountSecurityEventDataDto copy(ChallengeReplacementInfoDto challenge_replacement_info, SUVInfoDto suv_info, OAuthInfoDto auth_info, PersonaInfoDto persona_info, WorkflowInfoDto workflow_info, PrismInfoDto prism_info, LocalAuthInfoDto local_auth_info, AuthResponseInfoDto auth_response_info) {
        return new AccountSecurityEventDataDto(new Surrogate(challenge_replacement_info, suv_info, auth_info, persona_info, workflow_info, prism_info, local_auth_info, auth_response_info));
    }

    @Override // com.robinhood.idl.Dto
    public AccountSecurityEventData toProto() {
        ChallengeReplacementInfoDto challenge_replacement_info = this.surrogate.getChallenge_replacement_info();
        ChallengeReplacementInfo proto = challenge_replacement_info != null ? challenge_replacement_info.toProto() : null;
        SUVInfoDto suv_info = this.surrogate.getSuv_info();
        SUVInfo proto2 = suv_info != null ? suv_info.toProto() : null;
        OAuthInfoDto auth_info = this.surrogate.getAuth_info();
        OAuthInfo proto3 = auth_info != null ? auth_info.toProto() : null;
        PersonaInfoDto persona_info = this.surrogate.getPersona_info();
        PersonaInfo proto4 = persona_info != null ? persona_info.toProto() : null;
        WorkflowInfoDto workflow_info = this.surrogate.getWorkflow_info();
        WorkflowInfo proto5 = workflow_info != null ? workflow_info.toProto() : null;
        PrismInfoDto prism_info = this.surrogate.getPrism_info();
        PrismInfo proto6 = prism_info != null ? prism_info.toProto() : null;
        LocalAuthInfoDto local_auth_info = this.surrogate.getLocal_auth_info();
        LocalAuthInfo proto7 = local_auth_info != null ? local_auth_info.toProto() : null;
        AuthResponseInfoDto auth_response_info = this.surrogate.getAuth_response_info();
        return new AccountSecurityEventData(proto, proto2, proto3, proto4, proto5, proto6, proto7, auth_response_info != null ? auth_response_info.toProto() : null, null, 256, null);
    }

    public String toString() {
        return "[AccountSecurityEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AccountSecurityEventDataDto) && Intrinsics.areEqual(((AccountSecurityEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: AccountSecurityEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 J2\u00020\u0001:\u0002IJBg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013Bk\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0012\u0010\u0018J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0011HÆ\u0003Ji\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0015HÖ\u0001J\t\u0010?\u001a\u00020@HÖ\u0001J%\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0001¢\u0006\u0002\bHR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\"R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010%R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010(R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010+R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010.R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001a\u001a\u0004\b0\u00101¨\u0006K"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto$Surrogate;", "", "challenge_replacement_info", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto;", "suv_info", "Lcom/robinhood/rosetta/eventlogging/SUVInfoDto;", "auth_info", "Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto;", "persona_info", "Lcom/robinhood/rosetta/eventlogging/PersonaInfoDto;", "workflow_info", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto;", "prism_info", "Lcom/robinhood/rosetta/eventlogging/PrismInfoDto;", "local_auth_info", "Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto;", "auth_response_info", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto;Lcom/robinhood/rosetta/eventlogging/SUVInfoDto;Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto;Lcom/robinhood/rosetta/eventlogging/PersonaInfoDto;Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto;Lcom/robinhood/rosetta/eventlogging/PrismInfoDto;Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto;Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto;Lcom/robinhood/rosetta/eventlogging/SUVInfoDto;Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto;Lcom/robinhood/rosetta/eventlogging/PersonaInfoDto;Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto;Lcom/robinhood/rosetta/eventlogging/PrismInfoDto;Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto;Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getChallenge_replacement_info$annotations", "()V", "getChallenge_replacement_info", "()Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfoDto;", "getSuv_info$annotations", "getSuv_info", "()Lcom/robinhood/rosetta/eventlogging/SUVInfoDto;", "getAuth_info$annotations", "getAuth_info", "()Lcom/robinhood/rosetta/eventlogging/OAuthInfoDto;", "getPersona_info$annotations", "getPersona_info", "()Lcom/robinhood/rosetta/eventlogging/PersonaInfoDto;", "getWorkflow_info$annotations", "getWorkflow_info", "()Lcom/robinhood/rosetta/eventlogging/WorkflowInfoDto;", "getPrism_info$annotations", "getPrism_info", "()Lcom/robinhood/rosetta/eventlogging/PrismInfoDto;", "getLocal_auth_info$annotations", "getLocal_auth_info", "()Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto;", "getAuth_response_info$annotations", "getAuth_response_info", "()Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final OAuthInfoDto auth_info;
        private final AuthResponseInfoDto auth_response_info;
        private final ChallengeReplacementInfoDto challenge_replacement_info;
        private final LocalAuthInfoDto local_auth_info;
        private final PersonaInfoDto persona_info;
        private final PrismInfoDto prism_info;
        private final SUVInfoDto suv_info;
        private final WorkflowInfoDto workflow_info;

        public Surrogate() {
            this((ChallengeReplacementInfoDto) null, (SUVInfoDto) null, (OAuthInfoDto) null, (PersonaInfoDto) null, (WorkflowInfoDto) null, (PrismInfoDto) null, (LocalAuthInfoDto) null, (AuthResponseInfoDto) null, 255, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ChallengeReplacementInfoDto challengeReplacementInfoDto, SUVInfoDto sUVInfoDto, OAuthInfoDto oAuthInfoDto, PersonaInfoDto personaInfoDto, WorkflowInfoDto workflowInfoDto, PrismInfoDto prismInfoDto, LocalAuthInfoDto localAuthInfoDto, AuthResponseInfoDto authResponseInfoDto, int i, Object obj) {
            if ((i & 1) != 0) {
                challengeReplacementInfoDto = surrogate.challenge_replacement_info;
            }
            if ((i & 2) != 0) {
                sUVInfoDto = surrogate.suv_info;
            }
            if ((i & 4) != 0) {
                oAuthInfoDto = surrogate.auth_info;
            }
            if ((i & 8) != 0) {
                personaInfoDto = surrogate.persona_info;
            }
            if ((i & 16) != 0) {
                workflowInfoDto = surrogate.workflow_info;
            }
            if ((i & 32) != 0) {
                prismInfoDto = surrogate.prism_info;
            }
            if ((i & 64) != 0) {
                localAuthInfoDto = surrogate.local_auth_info;
            }
            if ((i & 128) != 0) {
                authResponseInfoDto = surrogate.auth_response_info;
            }
            LocalAuthInfoDto localAuthInfoDto2 = localAuthInfoDto;
            AuthResponseInfoDto authResponseInfoDto2 = authResponseInfoDto;
            WorkflowInfoDto workflowInfoDto2 = workflowInfoDto;
            PrismInfoDto prismInfoDto2 = prismInfoDto;
            return surrogate.copy(challengeReplacementInfoDto, sUVInfoDto, oAuthInfoDto, personaInfoDto, workflowInfoDto2, prismInfoDto2, localAuthInfoDto2, authResponseInfoDto2);
        }

        @SerialName("authInfo")
        @JsonAnnotations2(names = {"auth_info"})
        public static /* synthetic */ void getAuth_info$annotations() {
        }

        @SerialName("authResponseInfo")
        @JsonAnnotations2(names = {"auth_response_info"})
        public static /* synthetic */ void getAuth_response_info$annotations() {
        }

        @SerialName("challengeReplacementInfo")
        @JsonAnnotations2(names = {"challenge_replacement_info"})
        public static /* synthetic */ void getChallenge_replacement_info$annotations() {
        }

        @SerialName("localAuthInfo")
        @JsonAnnotations2(names = {"local_auth_info"})
        public static /* synthetic */ void getLocal_auth_info$annotations() {
        }

        @SerialName("personaInfo")
        @JsonAnnotations2(names = {"persona_info"})
        public static /* synthetic */ void getPersona_info$annotations() {
        }

        @SerialName("prismInfo")
        @JsonAnnotations2(names = {"prism_info"})
        public static /* synthetic */ void getPrism_info$annotations() {
        }

        @SerialName("suvInfo")
        @JsonAnnotations2(names = {"suv_info"})
        public static /* synthetic */ void getSuv_info$annotations() {
        }

        @SerialName("workflowInfo")
        @JsonAnnotations2(names = {"workflow_info"})
        public static /* synthetic */ void getWorkflow_info$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ChallengeReplacementInfoDto getChallenge_replacement_info() {
            return this.challenge_replacement_info;
        }

        /* renamed from: component2, reason: from getter */
        public final SUVInfoDto getSuv_info() {
            return this.suv_info;
        }

        /* renamed from: component3, reason: from getter */
        public final OAuthInfoDto getAuth_info() {
            return this.auth_info;
        }

        /* renamed from: component4, reason: from getter */
        public final PersonaInfoDto getPersona_info() {
            return this.persona_info;
        }

        /* renamed from: component5, reason: from getter */
        public final WorkflowInfoDto getWorkflow_info() {
            return this.workflow_info;
        }

        /* renamed from: component6, reason: from getter */
        public final PrismInfoDto getPrism_info() {
            return this.prism_info;
        }

        /* renamed from: component7, reason: from getter */
        public final LocalAuthInfoDto getLocal_auth_info() {
            return this.local_auth_info;
        }

        /* renamed from: component8, reason: from getter */
        public final AuthResponseInfoDto getAuth_response_info() {
            return this.auth_response_info;
        }

        public final Surrogate copy(ChallengeReplacementInfoDto challenge_replacement_info, SUVInfoDto suv_info, OAuthInfoDto auth_info, PersonaInfoDto persona_info, WorkflowInfoDto workflow_info, PrismInfoDto prism_info, LocalAuthInfoDto local_auth_info, AuthResponseInfoDto auth_response_info) {
            return new Surrogate(challenge_replacement_info, suv_info, auth_info, persona_info, workflow_info, prism_info, local_auth_info, auth_response_info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.challenge_replacement_info, surrogate.challenge_replacement_info) && Intrinsics.areEqual(this.suv_info, surrogate.suv_info) && Intrinsics.areEqual(this.auth_info, surrogate.auth_info) && Intrinsics.areEqual(this.persona_info, surrogate.persona_info) && Intrinsics.areEqual(this.workflow_info, surrogate.workflow_info) && Intrinsics.areEqual(this.prism_info, surrogate.prism_info) && Intrinsics.areEqual(this.local_auth_info, surrogate.local_auth_info) && Intrinsics.areEqual(this.auth_response_info, surrogate.auth_response_info);
        }

        public int hashCode() {
            ChallengeReplacementInfoDto challengeReplacementInfoDto = this.challenge_replacement_info;
            int iHashCode = (challengeReplacementInfoDto == null ? 0 : challengeReplacementInfoDto.hashCode()) * 31;
            SUVInfoDto sUVInfoDto = this.suv_info;
            int iHashCode2 = (iHashCode + (sUVInfoDto == null ? 0 : sUVInfoDto.hashCode())) * 31;
            OAuthInfoDto oAuthInfoDto = this.auth_info;
            int iHashCode3 = (iHashCode2 + (oAuthInfoDto == null ? 0 : oAuthInfoDto.hashCode())) * 31;
            PersonaInfoDto personaInfoDto = this.persona_info;
            int iHashCode4 = (iHashCode3 + (personaInfoDto == null ? 0 : personaInfoDto.hashCode())) * 31;
            WorkflowInfoDto workflowInfoDto = this.workflow_info;
            int iHashCode5 = (iHashCode4 + (workflowInfoDto == null ? 0 : workflowInfoDto.hashCode())) * 31;
            PrismInfoDto prismInfoDto = this.prism_info;
            int iHashCode6 = (iHashCode5 + (prismInfoDto == null ? 0 : prismInfoDto.hashCode())) * 31;
            LocalAuthInfoDto localAuthInfoDto = this.local_auth_info;
            int iHashCode7 = (iHashCode6 + (localAuthInfoDto == null ? 0 : localAuthInfoDto.hashCode())) * 31;
            AuthResponseInfoDto authResponseInfoDto = this.auth_response_info;
            return iHashCode7 + (authResponseInfoDto != null ? authResponseInfoDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(challenge_replacement_info=" + this.challenge_replacement_info + ", suv_info=" + this.suv_info + ", auth_info=" + this.auth_info + ", persona_info=" + this.persona_info + ", workflow_info=" + this.workflow_info + ", prism_info=" + this.prism_info + ", local_auth_info=" + this.local_auth_info + ", auth_response_info=" + this.auth_response_info + ")";
        }

        /* compiled from: AccountSecurityEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AccountSecurityEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ChallengeReplacementInfoDto challengeReplacementInfoDto, SUVInfoDto sUVInfoDto, OAuthInfoDto oAuthInfoDto, PersonaInfoDto personaInfoDto, WorkflowInfoDto workflowInfoDto, PrismInfoDto prismInfoDto, LocalAuthInfoDto localAuthInfoDto, AuthResponseInfoDto authResponseInfoDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.challenge_replacement_info = null;
            } else {
                this.challenge_replacement_info = challengeReplacementInfoDto;
            }
            if ((i & 2) == 0) {
                this.suv_info = null;
            } else {
                this.suv_info = sUVInfoDto;
            }
            if ((i & 4) == 0) {
                this.auth_info = null;
            } else {
                this.auth_info = oAuthInfoDto;
            }
            if ((i & 8) == 0) {
                this.persona_info = null;
            } else {
                this.persona_info = personaInfoDto;
            }
            if ((i & 16) == 0) {
                this.workflow_info = null;
            } else {
                this.workflow_info = workflowInfoDto;
            }
            if ((i & 32) == 0) {
                this.prism_info = null;
            } else {
                this.prism_info = prismInfoDto;
            }
            if ((i & 64) == 0) {
                this.local_auth_info = null;
            } else {
                this.local_auth_info = localAuthInfoDto;
            }
            if ((i & 128) == 0) {
                this.auth_response_info = null;
            } else {
                this.auth_response_info = authResponseInfoDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ChallengeReplacementInfoDto challengeReplacementInfoDto = self.challenge_replacement_info;
            if (challengeReplacementInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ChallengeReplacementInfoDto.Serializer.INSTANCE, challengeReplacementInfoDto);
            }
            SUVInfoDto sUVInfoDto = self.suv_info;
            if (sUVInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, SUVInfoDto.Serializer.INSTANCE, sUVInfoDto);
            }
            OAuthInfoDto oAuthInfoDto = self.auth_info;
            if (oAuthInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, OAuthInfoDto.Serializer.INSTANCE, oAuthInfoDto);
            }
            PersonaInfoDto personaInfoDto = self.persona_info;
            if (personaInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, PersonaInfoDto.Serializer.INSTANCE, personaInfoDto);
            }
            WorkflowInfoDto workflowInfoDto = self.workflow_info;
            if (workflowInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WorkflowInfoDto.Serializer.INSTANCE, workflowInfoDto);
            }
            PrismInfoDto prismInfoDto = self.prism_info;
            if (prismInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, PrismInfoDto.Serializer.INSTANCE, prismInfoDto);
            }
            LocalAuthInfoDto localAuthInfoDto = self.local_auth_info;
            if (localAuthInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, LocalAuthInfoDto.Serializer.INSTANCE, localAuthInfoDto);
            }
            AuthResponseInfoDto authResponseInfoDto = self.auth_response_info;
            if (authResponseInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, AuthResponseInfoDto.Serializer.INSTANCE, authResponseInfoDto);
            }
        }

        public Surrogate(ChallengeReplacementInfoDto challengeReplacementInfoDto, SUVInfoDto sUVInfoDto, OAuthInfoDto oAuthInfoDto, PersonaInfoDto personaInfoDto, WorkflowInfoDto workflowInfoDto, PrismInfoDto prismInfoDto, LocalAuthInfoDto localAuthInfoDto, AuthResponseInfoDto authResponseInfoDto) {
            this.challenge_replacement_info = challengeReplacementInfoDto;
            this.suv_info = sUVInfoDto;
            this.auth_info = oAuthInfoDto;
            this.persona_info = personaInfoDto;
            this.workflow_info = workflowInfoDto;
            this.prism_info = prismInfoDto;
            this.local_auth_info = localAuthInfoDto;
            this.auth_response_info = authResponseInfoDto;
        }

        public /* synthetic */ Surrogate(ChallengeReplacementInfoDto challengeReplacementInfoDto, SUVInfoDto sUVInfoDto, OAuthInfoDto oAuthInfoDto, PersonaInfoDto personaInfoDto, WorkflowInfoDto workflowInfoDto, PrismInfoDto prismInfoDto, LocalAuthInfoDto localAuthInfoDto, AuthResponseInfoDto authResponseInfoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : challengeReplacementInfoDto, (i & 2) != 0 ? null : sUVInfoDto, (i & 4) != 0 ? null : oAuthInfoDto, (i & 8) != 0 ? null : personaInfoDto, (i & 16) != 0 ? null : workflowInfoDto, (i & 32) != 0 ? null : prismInfoDto, (i & 64) != 0 ? null : localAuthInfoDto, (i & 128) != 0 ? null : authResponseInfoDto);
        }

        public final ChallengeReplacementInfoDto getChallenge_replacement_info() {
            return this.challenge_replacement_info;
        }

        public final SUVInfoDto getSuv_info() {
            return this.suv_info;
        }

        public final OAuthInfoDto getAuth_info() {
            return this.auth_info;
        }

        public final PersonaInfoDto getPersona_info() {
            return this.persona_info;
        }

        public final WorkflowInfoDto getWorkflow_info() {
            return this.workflow_info;
        }

        public final PrismInfoDto getPrism_info() {
            return this.prism_info;
        }

        public final LocalAuthInfoDto getLocal_auth_info() {
            return this.local_auth_info;
        }

        public final AuthResponseInfoDto getAuth_response_info() {
            return this.auth_response_info;
        }
    }

    /* compiled from: AccountSecurityEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AccountSecurityEventDataDto, AccountSecurityEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AccountSecurityEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountSecurityEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountSecurityEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) AccountSecurityEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AccountSecurityEventData> getProtoAdapter() {
            return AccountSecurityEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountSecurityEventDataDto getZeroValue() {
            return AccountSecurityEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountSecurityEventDataDto fromProto(AccountSecurityEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ChallengeReplacementInfo challenge_replacement_info = proto.getChallenge_replacement_info();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ChallengeReplacementInfoDto challengeReplacementInfoDtoFromProto = challenge_replacement_info != null ? ChallengeReplacementInfoDto.INSTANCE.fromProto(challenge_replacement_info) : null;
            SUVInfo suv_info = proto.getSuv_info();
            SUVInfoDto sUVInfoDtoFromProto = suv_info != null ? SUVInfoDto.INSTANCE.fromProto(suv_info) : null;
            OAuthInfo auth_info = proto.getAuth_info();
            OAuthInfoDto oAuthInfoDtoFromProto = auth_info != null ? OAuthInfoDto.INSTANCE.fromProto(auth_info) : null;
            PersonaInfo persona_info = proto.getPersona_info();
            PersonaInfoDto personaInfoDtoFromProto = persona_info != null ? PersonaInfoDto.INSTANCE.fromProto(persona_info) : null;
            WorkflowInfo workflow_info = proto.getWorkflow_info();
            WorkflowInfoDto workflowInfoDtoFromProto = workflow_info != null ? WorkflowInfoDto.INSTANCE.fromProto(workflow_info) : null;
            PrismInfo prism_info = proto.getPrism_info();
            PrismInfoDto prismInfoDtoFromProto = prism_info != null ? PrismInfoDto.INSTANCE.fromProto(prism_info) : null;
            LocalAuthInfo local_auth_info = proto.getLocal_auth_info();
            LocalAuthInfoDto localAuthInfoDtoFromProto = local_auth_info != null ? LocalAuthInfoDto.INSTANCE.fromProto(local_auth_info) : null;
            AuthResponseInfo auth_response_info = proto.getAuth_response_info();
            return new AccountSecurityEventDataDto(new Surrogate(challengeReplacementInfoDtoFromProto, sUVInfoDtoFromProto, oAuthInfoDtoFromProto, personaInfoDtoFromProto, workflowInfoDtoFromProto, prismInfoDtoFromProto, localAuthInfoDtoFromProto, auth_response_info != null ? AuthResponseInfoDto.INSTANCE.fromProto(auth_response_info) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AccountSecurityEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountSecurityEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AccountSecurityEventDataDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AccountSecurityEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<AccountSecurityEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.AccountSecurityEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AccountSecurityEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AccountSecurityEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AccountSecurityEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AccountSecurityEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.AccountSecurityEventDataDto";
        }
    }
}
