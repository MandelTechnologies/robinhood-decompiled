package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.chatbot.proto.p285v1.IceConfigDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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

/* compiled from: RealtimeSessionResponseDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BG\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0010JD\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponse;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponseDto$Surrogate;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponseDto$Surrogate;)V", "conversation_id", "", "session_id", "signaling_url", "token", "expires_at", "ice_config", "Lcom/robinhood/chatbot/proto/v1/IceConfigDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/IceConfigDto;)V", "getConversation_id", "()Ljava/lang/String;", "getSession_id", "getSignaling_url", "getToken", "getExpires_at", "getIce_config", "()Lcom/robinhood/chatbot/proto/v1/IceConfigDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class RealtimeSessionResponseDto implements Dto3<RealtimeSessionResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<RealtimeSessionResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RealtimeSessionResponseDto, RealtimeSessionResponse>> binaryBase64Serializer$delegate;
    private static final RealtimeSessionResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RealtimeSessionResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RealtimeSessionResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getConversation_id() {
        return this.surrogate.getConversation_id();
    }

    public final String getSession_id() {
        return this.surrogate.getSession_id();
    }

    public final String getSignaling_url() {
        return this.surrogate.getSignaling_url();
    }

    public final String getToken() {
        return this.surrogate.getToken();
    }

    public final String getExpires_at() {
        return this.surrogate.getExpires_at();
    }

    public final IceConfigDto getIce_config() {
        return this.surrogate.getIce_config();
    }

    public /* synthetic */ RealtimeSessionResponseDto(String str, String str2, String str3, String str4, String str5, IceConfigDto iceConfigDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : iceConfigDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RealtimeSessionResponseDto(String conversation_id, String session_id, String signaling_url, String token, String expires_at, IceConfigDto iceConfigDto) {
        this(new Surrogate(conversation_id, session_id, signaling_url, token, expires_at, iceConfigDto));
        Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(signaling_url, "signaling_url");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(expires_at, "expires_at");
    }

    public static /* synthetic */ RealtimeSessionResponseDto copy$default(RealtimeSessionResponseDto realtimeSessionResponseDto, String str, String str2, String str3, String str4, String str5, IceConfigDto iceConfigDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = realtimeSessionResponseDto.surrogate.getConversation_id();
        }
        if ((i & 2) != 0) {
            str2 = realtimeSessionResponseDto.surrogate.getSession_id();
        }
        if ((i & 4) != 0) {
            str3 = realtimeSessionResponseDto.surrogate.getSignaling_url();
        }
        if ((i & 8) != 0) {
            str4 = realtimeSessionResponseDto.surrogate.getToken();
        }
        if ((i & 16) != 0) {
            str5 = realtimeSessionResponseDto.surrogate.getExpires_at();
        }
        if ((i & 32) != 0) {
            iceConfigDto = realtimeSessionResponseDto.surrogate.getIce_config();
        }
        String str6 = str5;
        IceConfigDto iceConfigDto2 = iceConfigDto;
        return realtimeSessionResponseDto.copy(str, str2, str3, str4, str6, iceConfigDto2);
    }

    public final RealtimeSessionResponseDto copy(String conversation_id, String session_id, String signaling_url, String token, String expires_at, IceConfigDto ice_config) {
        Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(signaling_url, "signaling_url");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(expires_at, "expires_at");
        return new RealtimeSessionResponseDto(new Surrogate(conversation_id, session_id, signaling_url, token, expires_at, ice_config));
    }

    @Override // com.robinhood.idl.Dto
    public RealtimeSessionResponse toProto() {
        String conversation_id = this.surrogate.getConversation_id();
        String session_id = this.surrogate.getSession_id();
        String signaling_url = this.surrogate.getSignaling_url();
        String token = this.surrogate.getToken();
        String expires_at = this.surrogate.getExpires_at();
        IceConfigDto ice_config = this.surrogate.getIce_config();
        return new RealtimeSessionResponse(conversation_id, session_id, signaling_url, token, expires_at, ice_config != null ? ice_config.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[RealtimeSessionResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RealtimeSessionResponseDto) && Intrinsics.areEqual(((RealtimeSessionResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: RealtimeSessionResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000245BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003JG\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\rHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J%\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\b3R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u001f¨\u00066"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponseDto$Surrogate;", "", "conversation_id", "", "session_id", "signaling_url", "token", "expires_at", "ice_config", "Lcom/robinhood/chatbot/proto/v1/IceConfigDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/IceConfigDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/IceConfigDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getConversation_id$annotations", "()V", "getConversation_id", "()Ljava/lang/String;", "getSession_id$annotations", "getSession_id", "getSignaling_url$annotations", "getSignaling_url", "getToken$annotations", "getToken", "getExpires_at$annotations", "getExpires_at", "getIce_config$annotations", "getIce_config", "()Lcom/robinhood/chatbot/proto/v1/IceConfigDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chatbot_v1_externalRelease", "$serializer", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String conversation_id;
        private final String expires_at;
        private final IceConfigDto ice_config;
        private final String session_id;
        private final String signaling_url;
        private final String token;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (IceConfigDto) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, IceConfigDto iceConfigDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.conversation_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.session_id;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.signaling_url;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.token;
            }
            if ((i & 16) != 0) {
                str5 = surrogate.expires_at;
            }
            if ((i & 32) != 0) {
                iceConfigDto = surrogate.ice_config;
            }
            String str6 = str5;
            IceConfigDto iceConfigDto2 = iceConfigDto;
            return surrogate.copy(str, str2, str3, str4, str6, iceConfigDto2);
        }

        @SerialName("conversationId")
        @JsonAnnotations2(names = {"conversation_id"})
        public static /* synthetic */ void getConversation_id$annotations() {
        }

        @SerialName("expiresAt")
        @JsonAnnotations2(names = {"expires_at"})
        public static /* synthetic */ void getExpires_at$annotations() {
        }

        @SerialName("iceConfig")
        @JsonAnnotations2(names = {"ice_config"})
        public static /* synthetic */ void getIce_config$annotations() {
        }

        @SerialName("sessionId")
        @JsonAnnotations2(names = {"session_id"})
        public static /* synthetic */ void getSession_id$annotations() {
        }

        @SerialName("signalingUrl")
        @JsonAnnotations2(names = {"signaling_url"})
        public static /* synthetic */ void getSignaling_url$annotations() {
        }

        @SerialName("token")
        @JsonAnnotations2(names = {"token"})
        public static /* synthetic */ void getToken$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getConversation_id() {
            return this.conversation_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSession_id() {
            return this.session_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSignaling_url() {
            return this.signaling_url;
        }

        /* renamed from: component4, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        /* renamed from: component5, reason: from getter */
        public final String getExpires_at() {
            return this.expires_at;
        }

        /* renamed from: component6, reason: from getter */
        public final IceConfigDto getIce_config() {
            return this.ice_config;
        }

        public final Surrogate copy(String conversation_id, String session_id, String signaling_url, String token, String expires_at, IceConfigDto ice_config) {
            Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(signaling_url, "signaling_url");
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(expires_at, "expires_at");
            return new Surrogate(conversation_id, session_id, signaling_url, token, expires_at, ice_config);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.conversation_id, surrogate.conversation_id) && Intrinsics.areEqual(this.session_id, surrogate.session_id) && Intrinsics.areEqual(this.signaling_url, surrogate.signaling_url) && Intrinsics.areEqual(this.token, surrogate.token) && Intrinsics.areEqual(this.expires_at, surrogate.expires_at) && Intrinsics.areEqual(this.ice_config, surrogate.ice_config);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.conversation_id.hashCode() * 31) + this.session_id.hashCode()) * 31) + this.signaling_url.hashCode()) * 31) + this.token.hashCode()) * 31) + this.expires_at.hashCode()) * 31;
            IceConfigDto iceConfigDto = this.ice_config;
            return iHashCode + (iceConfigDto == null ? 0 : iceConfigDto.hashCode());
        }

        public String toString() {
            return "Surrogate(conversation_id=" + this.conversation_id + ", session_id=" + this.session_id + ", signaling_url=" + this.signaling_url + ", token=" + this.token + ", expires_at=" + this.expires_at + ", ice_config=" + this.ice_config + ")";
        }

        /* compiled from: RealtimeSessionResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponseDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RealtimeSessionResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, IceConfigDto iceConfigDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.conversation_id = "";
            } else {
                this.conversation_id = str;
            }
            if ((i & 2) == 0) {
                this.session_id = "";
            } else {
                this.session_id = str2;
            }
            if ((i & 4) == 0) {
                this.signaling_url = "";
            } else {
                this.signaling_url = str3;
            }
            if ((i & 8) == 0) {
                this.token = "";
            } else {
                this.token = str4;
            }
            if ((i & 16) == 0) {
                this.expires_at = "";
            } else {
                this.expires_at = str5;
            }
            if ((i & 32) == 0) {
                this.ice_config = null;
            } else {
                this.ice_config = iceConfigDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.conversation_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.conversation_id);
            }
            if (!Intrinsics.areEqual(self.session_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.session_id);
            }
            if (!Intrinsics.areEqual(self.signaling_url, "")) {
                output.encodeStringElement(serialDesc, 2, self.signaling_url);
            }
            if (!Intrinsics.areEqual(self.token, "")) {
                output.encodeStringElement(serialDesc, 3, self.token);
            }
            if (!Intrinsics.areEqual(self.expires_at, "")) {
                output.encodeStringElement(serialDesc, 4, self.expires_at);
            }
            IceConfigDto iceConfigDto = self.ice_config;
            if (iceConfigDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, IceConfigDto.Serializer.INSTANCE, iceConfigDto);
            }
        }

        public Surrogate(String conversation_id, String session_id, String signaling_url, String token, String expires_at, IceConfigDto iceConfigDto) {
            Intrinsics.checkNotNullParameter(conversation_id, "conversation_id");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(signaling_url, "signaling_url");
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(expires_at, "expires_at");
            this.conversation_id = conversation_id;
            this.session_id = session_id;
            this.signaling_url = signaling_url;
            this.token = token;
            this.expires_at = expires_at;
            this.ice_config = iceConfigDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, IceConfigDto iceConfigDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : iceConfigDto);
        }

        public final String getConversation_id() {
            return this.conversation_id;
        }

        public final String getSession_id() {
            return this.session_id;
        }

        public final String getSignaling_url() {
            return this.signaling_url;
        }

        public final String getToken() {
            return this.token;
        }

        public final String getExpires_at() {
            return this.expires_at;
        }

        public final IceConfigDto getIce_config() {
            return this.ice_config;
        }
    }

    /* compiled from: RealtimeSessionResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponseDto;", "Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<RealtimeSessionResponseDto, RealtimeSessionResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RealtimeSessionResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RealtimeSessionResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RealtimeSessionResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) RealtimeSessionResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RealtimeSessionResponse> getProtoAdapter() {
            return RealtimeSessionResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RealtimeSessionResponseDto getZeroValue() {
            return RealtimeSessionResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RealtimeSessionResponseDto fromProto(RealtimeSessionResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String conversation_id = proto.getConversation_id();
            String session_id = proto.getSession_id();
            String signaling_url = proto.getSignaling_url();
            String token = proto.getToken();
            String expires_at = proto.getExpires_at();
            IceConfig ice_config = proto.getIce_config();
            return new RealtimeSessionResponseDto(new Surrogate(conversation_id, session_id, signaling_url, token, expires_at, ice_config != null ? IceConfigDto.INSTANCE.fromProto(ice_config) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.RealtimeSessionResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RealtimeSessionResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new RealtimeSessionResponseDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: RealtimeSessionResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<RealtimeSessionResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.RealtimeSessionResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RealtimeSessionResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RealtimeSessionResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RealtimeSessionResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: RealtimeSessionResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/RealtimeSessionResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.RealtimeSessionResponseDto";
        }
    }
}
