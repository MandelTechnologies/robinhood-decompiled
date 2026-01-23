package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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
import okio.ByteString;

/* compiled from: AccountSecurityEventData.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00011Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010'\u001a\u00020\u0002H\u0017J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020/H\u0016Jp\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventData;", "Lcom/squareup/wire/Message;", "", "challenge_replacement_info", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo;", "suv_info", "Lcom/robinhood/rosetta/eventlogging/SUVInfo;", "auth_info", "Lcom/robinhood/rosetta/eventlogging/OAuthInfo;", "persona_info", "Lcom/robinhood/rosetta/eventlogging/PersonaInfo;", "workflow_info", "Lcom/robinhood/rosetta/eventlogging/WorkflowInfo;", "prism_info", "Lcom/robinhood/rosetta/eventlogging/PrismInfo;", "local_auth_info", "Lcom/robinhood/rosetta/eventlogging/LocalAuthInfo;", "auth_response_info", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo;Lcom/robinhood/rosetta/eventlogging/SUVInfo;Lcom/robinhood/rosetta/eventlogging/OAuthInfo;Lcom/robinhood/rosetta/eventlogging/PersonaInfo;Lcom/robinhood/rosetta/eventlogging/WorkflowInfo;Lcom/robinhood/rosetta/eventlogging/PrismInfo;Lcom/robinhood/rosetta/eventlogging/LocalAuthInfo;Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo;Lokio/ByteString;)V", "getChallenge_replacement_info", "()Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo;", "getSuv_info", "()Lcom/robinhood/rosetta/eventlogging/SUVInfo;", "getAuth_info", "()Lcom/robinhood/rosetta/eventlogging/OAuthInfo;", "getPersona_info", "()Lcom/robinhood/rosetta/eventlogging/PersonaInfo;", "getWorkflow_info", "()Lcom/robinhood/rosetta/eventlogging/WorkflowInfo;", "getPrism_info", "()Lcom/robinhood/rosetta/eventlogging/PrismInfo;", "getLocal_auth_info", "()Lcom/robinhood/rosetta/eventlogging/LocalAuthInfo;", "getAuth_response_info", "()Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class AccountSecurityEventData extends Message {

    @JvmField
    public static final ProtoAdapter<AccountSecurityEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OAuthInfo#ADAPTER", jsonName = "authInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final OAuthInfo auth_info;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AuthResponseInfo#ADAPTER", jsonName = "authResponseInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final AuthResponseInfo auth_response_info;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ChallengeReplacementInfo#ADAPTER", jsonName = "challengeReplacementInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ChallengeReplacementInfo challenge_replacement_info;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.LocalAuthInfo#ADAPTER", jsonName = "localAuthInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final LocalAuthInfo local_auth_info;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PersonaInfo#ADAPTER", jsonName = "personaInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final PersonaInfo persona_info;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PrismInfo#ADAPTER", jsonName = "prismInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final PrismInfo prism_info;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.SUVInfo#ADAPTER", jsonName = "suvInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final SUVInfo suv_info;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.WorkflowInfo#ADAPTER", jsonName = "workflowInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final WorkflowInfo workflow_info;

    public AccountSecurityEventData() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23994newBuilder();
    }

    public final ChallengeReplacementInfo getChallenge_replacement_info() {
        return this.challenge_replacement_info;
    }

    public final SUVInfo getSuv_info() {
        return this.suv_info;
    }

    public final OAuthInfo getAuth_info() {
        return this.auth_info;
    }

    public final PersonaInfo getPersona_info() {
        return this.persona_info;
    }

    public final WorkflowInfo getWorkflow_info() {
        return this.workflow_info;
    }

    public final PrismInfo getPrism_info() {
        return this.prism_info;
    }

    public final LocalAuthInfo getLocal_auth_info() {
        return this.local_auth_info;
    }

    public final AuthResponseInfo getAuth_response_info() {
        return this.auth_response_info;
    }

    public /* synthetic */ AccountSecurityEventData(ChallengeReplacementInfo challengeReplacementInfo, SUVInfo sUVInfo, OAuthInfo oAuthInfo, PersonaInfo personaInfo, WorkflowInfo workflowInfo, PrismInfo prismInfo, LocalAuthInfo localAuthInfo, AuthResponseInfo authResponseInfo, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : challengeReplacementInfo, (i & 2) != 0 ? null : sUVInfo, (i & 4) != 0 ? null : oAuthInfo, (i & 8) != 0 ? null : personaInfo, (i & 16) != 0 ? null : workflowInfo, (i & 32) != 0 ? null : prismInfo, (i & 64) != 0 ? null : localAuthInfo, (i & 128) != 0 ? null : authResponseInfo, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSecurityEventData(ChallengeReplacementInfo challengeReplacementInfo, SUVInfo sUVInfo, OAuthInfo oAuthInfo, PersonaInfo personaInfo, WorkflowInfo workflowInfo, PrismInfo prismInfo, LocalAuthInfo localAuthInfo, AuthResponseInfo authResponseInfo, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.challenge_replacement_info = challengeReplacementInfo;
        this.suv_info = sUVInfo;
        this.auth_info = oAuthInfo;
        this.persona_info = personaInfo;
        this.workflow_info = workflowInfo;
        this.prism_info = prismInfo;
        this.local_auth_info = localAuthInfo;
        this.auth_response_info = authResponseInfo;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23994newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AccountSecurityEventData)) {
            return false;
        }
        AccountSecurityEventData accountSecurityEventData = (AccountSecurityEventData) other;
        return Intrinsics.areEqual(unknownFields(), accountSecurityEventData.unknownFields()) && Intrinsics.areEqual(this.challenge_replacement_info, accountSecurityEventData.challenge_replacement_info) && Intrinsics.areEqual(this.suv_info, accountSecurityEventData.suv_info) && Intrinsics.areEqual(this.auth_info, accountSecurityEventData.auth_info) && Intrinsics.areEqual(this.persona_info, accountSecurityEventData.persona_info) && Intrinsics.areEqual(this.workflow_info, accountSecurityEventData.workflow_info) && Intrinsics.areEqual(this.prism_info, accountSecurityEventData.prism_info) && Intrinsics.areEqual(this.local_auth_info, accountSecurityEventData.local_auth_info) && Intrinsics.areEqual(this.auth_response_info, accountSecurityEventData.auth_response_info);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ChallengeReplacementInfo challengeReplacementInfo = this.challenge_replacement_info;
        int iHashCode2 = (iHashCode + (challengeReplacementInfo != null ? challengeReplacementInfo.hashCode() : 0)) * 37;
        SUVInfo sUVInfo = this.suv_info;
        int iHashCode3 = (iHashCode2 + (sUVInfo != null ? sUVInfo.hashCode() : 0)) * 37;
        OAuthInfo oAuthInfo = this.auth_info;
        int iHashCode4 = (iHashCode3 + (oAuthInfo != null ? oAuthInfo.hashCode() : 0)) * 37;
        PersonaInfo personaInfo = this.persona_info;
        int iHashCode5 = (iHashCode4 + (personaInfo != null ? personaInfo.hashCode() : 0)) * 37;
        WorkflowInfo workflowInfo = this.workflow_info;
        int iHashCode6 = (iHashCode5 + (workflowInfo != null ? workflowInfo.hashCode() : 0)) * 37;
        PrismInfo prismInfo = this.prism_info;
        int iHashCode7 = (iHashCode6 + (prismInfo != null ? prismInfo.hashCode() : 0)) * 37;
        LocalAuthInfo localAuthInfo = this.local_auth_info;
        int iHashCode8 = (iHashCode7 + (localAuthInfo != null ? localAuthInfo.hashCode() : 0)) * 37;
        AuthResponseInfo authResponseInfo = this.auth_response_info;
        int iHashCode9 = iHashCode8 + (authResponseInfo != null ? authResponseInfo.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ChallengeReplacementInfo challengeReplacementInfo = this.challenge_replacement_info;
        if (challengeReplacementInfo != null) {
            arrayList.add("challenge_replacement_info=" + challengeReplacementInfo);
        }
        SUVInfo sUVInfo = this.suv_info;
        if (sUVInfo != null) {
            arrayList.add("suv_info=" + sUVInfo);
        }
        OAuthInfo oAuthInfo = this.auth_info;
        if (oAuthInfo != null) {
            arrayList.add("auth_info=" + oAuthInfo);
        }
        PersonaInfo personaInfo = this.persona_info;
        if (personaInfo != null) {
            arrayList.add("persona_info=" + personaInfo);
        }
        WorkflowInfo workflowInfo = this.workflow_info;
        if (workflowInfo != null) {
            arrayList.add("workflow_info=" + workflowInfo);
        }
        PrismInfo prismInfo = this.prism_info;
        if (prismInfo != null) {
            arrayList.add("prism_info=" + prismInfo);
        }
        LocalAuthInfo localAuthInfo = this.local_auth_info;
        if (localAuthInfo != null) {
            arrayList.add("local_auth_info=" + localAuthInfo);
        }
        AuthResponseInfo authResponseInfo = this.auth_response_info;
        if (authResponseInfo != null) {
            arrayList.add("auth_response_info=" + authResponseInfo);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AccountSecurityEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AccountSecurityEventData copy$default(AccountSecurityEventData accountSecurityEventData, ChallengeReplacementInfo challengeReplacementInfo, SUVInfo sUVInfo, OAuthInfo oAuthInfo, PersonaInfo personaInfo, WorkflowInfo workflowInfo, PrismInfo prismInfo, LocalAuthInfo localAuthInfo, AuthResponseInfo authResponseInfo, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            challengeReplacementInfo = accountSecurityEventData.challenge_replacement_info;
        }
        if ((i & 2) != 0) {
            sUVInfo = accountSecurityEventData.suv_info;
        }
        if ((i & 4) != 0) {
            oAuthInfo = accountSecurityEventData.auth_info;
        }
        if ((i & 8) != 0) {
            personaInfo = accountSecurityEventData.persona_info;
        }
        if ((i & 16) != 0) {
            workflowInfo = accountSecurityEventData.workflow_info;
        }
        if ((i & 32) != 0) {
            prismInfo = accountSecurityEventData.prism_info;
        }
        if ((i & 64) != 0) {
            localAuthInfo = accountSecurityEventData.local_auth_info;
        }
        if ((i & 128) != 0) {
            authResponseInfo = accountSecurityEventData.auth_response_info;
        }
        if ((i & 256) != 0) {
            byteString = accountSecurityEventData.unknownFields();
        }
        AuthResponseInfo authResponseInfo2 = authResponseInfo;
        ByteString byteString2 = byteString;
        PrismInfo prismInfo2 = prismInfo;
        LocalAuthInfo localAuthInfo2 = localAuthInfo;
        WorkflowInfo workflowInfo2 = workflowInfo;
        OAuthInfo oAuthInfo2 = oAuthInfo;
        return accountSecurityEventData.copy(challengeReplacementInfo, sUVInfo, oAuthInfo2, personaInfo, workflowInfo2, prismInfo2, localAuthInfo2, authResponseInfo2, byteString2);
    }

    public final AccountSecurityEventData copy(ChallengeReplacementInfo challenge_replacement_info, SUVInfo suv_info, OAuthInfo auth_info, PersonaInfo persona_info, WorkflowInfo workflow_info, PrismInfo prism_info, LocalAuthInfo local_auth_info, AuthResponseInfo auth_response_info, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AccountSecurityEventData(challenge_replacement_info, suv_info, auth_info, persona_info, workflow_info, prism_info, local_auth_info, auth_response_info, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountSecurityEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AccountSecurityEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.AccountSecurityEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AccountSecurityEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getChallenge_replacement_info() != null) {
                    size += ChallengeReplacementInfo.ADAPTER.encodedSizeWithTag(1, value.getChallenge_replacement_info());
                }
                if (value.getSuv_info() != null) {
                    size += SUVInfo.ADAPTER.encodedSizeWithTag(2, value.getSuv_info());
                }
                if (value.getAuth_info() != null) {
                    size += OAuthInfo.ADAPTER.encodedSizeWithTag(3, value.getAuth_info());
                }
                if (value.getPersona_info() != null) {
                    size += PersonaInfo.ADAPTER.encodedSizeWithTag(4, value.getPersona_info());
                }
                if (value.getWorkflow_info() != null) {
                    size += WorkflowInfo.ADAPTER.encodedSizeWithTag(5, value.getWorkflow_info());
                }
                if (value.getPrism_info() != null) {
                    size += PrismInfo.ADAPTER.encodedSizeWithTag(6, value.getPrism_info());
                }
                if (value.getLocal_auth_info() != null) {
                    size += LocalAuthInfo.ADAPTER.encodedSizeWithTag(7, value.getLocal_auth_info());
                }
                return value.getAuth_response_info() != null ? size + AuthResponseInfo.ADAPTER.encodedSizeWithTag(8, value.getAuth_response_info()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AccountSecurityEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getChallenge_replacement_info() != null) {
                    ChallengeReplacementInfo.ADAPTER.encodeWithTag(writer, 1, (int) value.getChallenge_replacement_info());
                }
                if (value.getSuv_info() != null) {
                    SUVInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getSuv_info());
                }
                if (value.getAuth_info() != null) {
                    OAuthInfo.ADAPTER.encodeWithTag(writer, 3, (int) value.getAuth_info());
                }
                if (value.getPersona_info() != null) {
                    PersonaInfo.ADAPTER.encodeWithTag(writer, 4, (int) value.getPersona_info());
                }
                if (value.getWorkflow_info() != null) {
                    WorkflowInfo.ADAPTER.encodeWithTag(writer, 5, (int) value.getWorkflow_info());
                }
                if (value.getPrism_info() != null) {
                    PrismInfo.ADAPTER.encodeWithTag(writer, 6, (int) value.getPrism_info());
                }
                if (value.getLocal_auth_info() != null) {
                    LocalAuthInfo.ADAPTER.encodeWithTag(writer, 7, (int) value.getLocal_auth_info());
                }
                if (value.getAuth_response_info() != null) {
                    AuthResponseInfo.ADAPTER.encodeWithTag(writer, 8, (int) value.getAuth_response_info());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AccountSecurityEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAuth_response_info() != null) {
                    AuthResponseInfo.ADAPTER.encodeWithTag(writer, 8, (int) value.getAuth_response_info());
                }
                if (value.getLocal_auth_info() != null) {
                    LocalAuthInfo.ADAPTER.encodeWithTag(writer, 7, (int) value.getLocal_auth_info());
                }
                if (value.getPrism_info() != null) {
                    PrismInfo.ADAPTER.encodeWithTag(writer, 6, (int) value.getPrism_info());
                }
                if (value.getWorkflow_info() != null) {
                    WorkflowInfo.ADAPTER.encodeWithTag(writer, 5, (int) value.getWorkflow_info());
                }
                if (value.getPersona_info() != null) {
                    PersonaInfo.ADAPTER.encodeWithTag(writer, 4, (int) value.getPersona_info());
                }
                if (value.getAuth_info() != null) {
                    OAuthInfo.ADAPTER.encodeWithTag(writer, 3, (int) value.getAuth_info());
                }
                if (value.getSuv_info() != null) {
                    SUVInfo.ADAPTER.encodeWithTag(writer, 2, (int) value.getSuv_info());
                }
                if (value.getChallenge_replacement_info() != null) {
                    ChallengeReplacementInfo.ADAPTER.encodeWithTag(writer, 1, (int) value.getChallenge_replacement_info());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AccountSecurityEventData redact(AccountSecurityEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ChallengeReplacementInfo challenge_replacement_info = value.getChallenge_replacement_info();
                ChallengeReplacementInfo challengeReplacementInfoRedact = challenge_replacement_info != null ? ChallengeReplacementInfo.ADAPTER.redact(challenge_replacement_info) : null;
                SUVInfo suv_info = value.getSuv_info();
                SUVInfo sUVInfoRedact = suv_info != null ? SUVInfo.ADAPTER.redact(suv_info) : null;
                OAuthInfo auth_info = value.getAuth_info();
                OAuthInfo oAuthInfoRedact = auth_info != null ? OAuthInfo.ADAPTER.redact(auth_info) : null;
                PersonaInfo persona_info = value.getPersona_info();
                PersonaInfo personaInfoRedact = persona_info != null ? PersonaInfo.ADAPTER.redact(persona_info) : null;
                WorkflowInfo workflow_info = value.getWorkflow_info();
                WorkflowInfo workflowInfoRedact = workflow_info != null ? WorkflowInfo.ADAPTER.redact(workflow_info) : null;
                PrismInfo prism_info = value.getPrism_info();
                PrismInfo prismInfoRedact = prism_info != null ? PrismInfo.ADAPTER.redact(prism_info) : null;
                LocalAuthInfo local_auth_info = value.getLocal_auth_info();
                LocalAuthInfo localAuthInfoRedact = local_auth_info != null ? LocalAuthInfo.ADAPTER.redact(local_auth_info) : null;
                AuthResponseInfo auth_response_info = value.getAuth_response_info();
                return value.copy(challengeReplacementInfoRedact, sUVInfoRedact, oAuthInfoRedact, personaInfoRedact, workflowInfoRedact, prismInfoRedact, localAuthInfoRedact, auth_response_info != null ? AuthResponseInfo.ADAPTER.redact(auth_response_info) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AccountSecurityEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ChallengeReplacementInfo challengeReplacementInfoDecode = null;
                SUVInfo sUVInfoDecode = null;
                OAuthInfo oAuthInfoDecode = null;
                PersonaInfo personaInfoDecode = null;
                WorkflowInfo workflowInfoDecode = null;
                PrismInfo prismInfoDecode = null;
                LocalAuthInfo localAuthInfoDecode = null;
                AuthResponseInfo authResponseInfoDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                challengeReplacementInfoDecode = ChallengeReplacementInfo.ADAPTER.decode(reader);
                                break;
                            case 2:
                                sUVInfoDecode = SUVInfo.ADAPTER.decode(reader);
                                break;
                            case 3:
                                oAuthInfoDecode = OAuthInfo.ADAPTER.decode(reader);
                                break;
                            case 4:
                                personaInfoDecode = PersonaInfo.ADAPTER.decode(reader);
                                break;
                            case 5:
                                workflowInfoDecode = WorkflowInfo.ADAPTER.decode(reader);
                                break;
                            case 6:
                                prismInfoDecode = PrismInfo.ADAPTER.decode(reader);
                                break;
                            case 7:
                                localAuthInfoDecode = LocalAuthInfo.ADAPTER.decode(reader);
                                break;
                            case 8:
                                authResponseInfoDecode = AuthResponseInfo.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AccountSecurityEventData(challengeReplacementInfoDecode, sUVInfoDecode, oAuthInfoDecode, personaInfoDecode, workflowInfoDecode, prismInfoDecode, localAuthInfoDecode, authResponseInfoDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
