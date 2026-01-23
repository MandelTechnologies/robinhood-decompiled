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
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.robinhood.rosetta.eventlogging.AuthResponseInfo;
import com.robinhood.rosetta.eventlogging.AuthResponseInfoDto;
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

/* compiled from: AuthResponseInfoDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005&'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u000fJ.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$Surrogate;)V", "blocked_reason", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$AuthBlockedReasonDto;", "request_url", "", "request_method", "token_expiry_seconds", "", "(Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$AuthBlockedReasonDto;Ljava/lang/String;Ljava/lang/String;J)V", "getBlocked_reason", "()Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$AuthBlockedReasonDto;", "getRequest_url", "()Ljava/lang/String;", "getRequest_method", "getToken_expiry_seconds", "()J", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "AuthBlockedReasonDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class AuthResponseInfoDto implements Dto3<AuthResponseInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AuthResponseInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AuthResponseInfoDto, AuthResponseInfo>> binaryBase64Serializer$delegate;
    private static final AuthResponseInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AuthResponseInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AuthResponseInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final AuthBlockedReasonDto getBlocked_reason() {
        return this.surrogate.getBlocked_reason();
    }

    public final String getRequest_url() {
        return this.surrogate.getRequest_url();
    }

    public final String getRequest_method() {
        return this.surrogate.getRequest_method();
    }

    public final long getToken_expiry_seconds() {
        return this.surrogate.getToken_expiry_seconds();
    }

    public /* synthetic */ AuthResponseInfoDto(AuthBlockedReasonDto authBlockedReasonDto, String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AuthBlockedReasonDto.INSTANCE.getZeroValue() : authBlockedReasonDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? 0L : j);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthResponseInfoDto(AuthBlockedReasonDto blocked_reason, String request_url, String request_method, long j) {
        this(new Surrogate(blocked_reason, request_url, request_method, j));
        Intrinsics.checkNotNullParameter(blocked_reason, "blocked_reason");
        Intrinsics.checkNotNullParameter(request_url, "request_url");
        Intrinsics.checkNotNullParameter(request_method, "request_method");
    }

    public static /* synthetic */ AuthResponseInfoDto copy$default(AuthResponseInfoDto authResponseInfoDto, AuthBlockedReasonDto authBlockedReasonDto, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            authBlockedReasonDto = authResponseInfoDto.surrogate.getBlocked_reason();
        }
        if ((i & 2) != 0) {
            str = authResponseInfoDto.surrogate.getRequest_url();
        }
        if ((i & 4) != 0) {
            str2 = authResponseInfoDto.surrogate.getRequest_method();
        }
        if ((i & 8) != 0) {
            j = authResponseInfoDto.surrogate.getToken_expiry_seconds();
        }
        String str3 = str2;
        return authResponseInfoDto.copy(authBlockedReasonDto, str, str3, j);
    }

    public final AuthResponseInfoDto copy(AuthBlockedReasonDto blocked_reason, String request_url, String request_method, long token_expiry_seconds) {
        Intrinsics.checkNotNullParameter(blocked_reason, "blocked_reason");
        Intrinsics.checkNotNullParameter(request_url, "request_url");
        Intrinsics.checkNotNullParameter(request_method, "request_method");
        return new AuthResponseInfoDto(new Surrogate(blocked_reason, request_url, request_method, token_expiry_seconds));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public AuthResponseInfo toProto() {
        return new AuthResponseInfo((AuthResponseInfo.AuthBlockedReason) this.surrogate.getBlocked_reason().toProto(), this.surrogate.getRequest_url(), this.surrogate.getRequest_method(), this.surrogate.getToken_expiry_seconds(), null, 16, null);
    }

    public String toString() {
        return "[AuthResponseInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AuthResponseInfoDto) && Intrinsics.areEqual(((AuthResponseInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: AuthResponseInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000212B>\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\u0004\b\f\u0010\rBA\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u0018\u0010\"\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0003J@\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\b\u0002\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u000fHÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001J%\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\b0R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0019R+\u0010\u0007\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001e¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$Surrogate;", "", "blocked_reason", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$AuthBlockedReasonDto;", "request_url", "", "request_method", "token_expiry_seconds", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$AuthBlockedReasonDto;Ljava/lang/String;Ljava/lang/String;J)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$AuthBlockedReasonDto;Ljava/lang/String;Ljava/lang/String;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBlocked_reason$annotations", "()V", "getBlocked_reason", "()Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$AuthBlockedReasonDto;", "getRequest_url$annotations", "getRequest_url", "()Ljava/lang/String;", "getRequest_method$annotations", "getRequest_method", "getToken_expiry_seconds$annotations", "getToken_expiry_seconds", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AuthBlockedReasonDto blocked_reason;
        private final String request_method;
        private final String request_url;
        private final long token_expiry_seconds;

        public Surrogate() {
            this((AuthBlockedReasonDto) null, (String) null, (String) null, 0L, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, AuthBlockedReasonDto authBlockedReasonDto, String str, String str2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                authBlockedReasonDto = surrogate.blocked_reason;
            }
            if ((i & 2) != 0) {
                str = surrogate.request_url;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.request_method;
            }
            if ((i & 8) != 0) {
                j = surrogate.token_expiry_seconds;
            }
            String str3 = str2;
            return surrogate.copy(authBlockedReasonDto, str, str3, j);
        }

        @SerialName("blockedReason")
        @JsonAnnotations2(names = {"blocked_reason"})
        public static /* synthetic */ void getBlocked_reason$annotations() {
        }

        @SerialName("requestMethod")
        @JsonAnnotations2(names = {"request_method"})
        public static /* synthetic */ void getRequest_method$annotations() {
        }

        @SerialName("requestUrl")
        @JsonAnnotations2(names = {"request_url"})
        public static /* synthetic */ void getRequest_url$annotations() {
        }

        @SerialName("tokenExpirySeconds")
        @JsonAnnotations2(names = {"token_expiry_seconds"})
        public static /* synthetic */ void getToken_expiry_seconds$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final AuthBlockedReasonDto getBlocked_reason() {
            return this.blocked_reason;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRequest_url() {
            return this.request_url;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRequest_method() {
            return this.request_method;
        }

        /* renamed from: component4, reason: from getter */
        public final long getToken_expiry_seconds() {
            return this.token_expiry_seconds;
        }

        public final Surrogate copy(AuthBlockedReasonDto blocked_reason, String request_url, String request_method, long token_expiry_seconds) {
            Intrinsics.checkNotNullParameter(blocked_reason, "blocked_reason");
            Intrinsics.checkNotNullParameter(request_url, "request_url");
            Intrinsics.checkNotNullParameter(request_method, "request_method");
            return new Surrogate(blocked_reason, request_url, request_method, token_expiry_seconds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.blocked_reason == surrogate.blocked_reason && Intrinsics.areEqual(this.request_url, surrogate.request_url) && Intrinsics.areEqual(this.request_method, surrogate.request_method) && this.token_expiry_seconds == surrogate.token_expiry_seconds;
        }

        public int hashCode() {
            return (((((this.blocked_reason.hashCode() * 31) + this.request_url.hashCode()) * 31) + this.request_method.hashCode()) * 31) + Long.hashCode(this.token_expiry_seconds);
        }

        public String toString() {
            return "Surrogate(blocked_reason=" + this.blocked_reason + ", request_url=" + this.request_url + ", request_method=" + this.request_method + ", token_expiry_seconds=" + this.token_expiry_seconds + ")";
        }

        /* compiled from: AuthResponseInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AuthResponseInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, AuthBlockedReasonDto authBlockedReasonDto, String str, String str2, long j, SerializationConstructorMarker serializationConstructorMarker) {
            this.blocked_reason = (i & 1) == 0 ? AuthBlockedReasonDto.INSTANCE.getZeroValue() : authBlockedReasonDto;
            if ((i & 2) == 0) {
                this.request_url = "";
            } else {
                this.request_url = str;
            }
            if ((i & 4) == 0) {
                this.request_method = "";
            } else {
                this.request_method = str2;
            }
            if ((i & 8) == 0) {
                this.token_expiry_seconds = 0L;
            } else {
                this.token_expiry_seconds = j;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.blocked_reason != AuthBlockedReasonDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, AuthBlockedReasonDto.Serializer.INSTANCE, self.blocked_reason);
            }
            if (!Intrinsics.areEqual(self.request_url, "")) {
                output.encodeStringElement(serialDesc, 1, self.request_url);
            }
            if (!Intrinsics.areEqual(self.request_method, "")) {
                output.encodeStringElement(serialDesc, 2, self.request_method);
            }
            long j = self.token_expiry_seconds;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
        }

        public Surrogate(AuthBlockedReasonDto blocked_reason, String request_url, String request_method, long j) {
            Intrinsics.checkNotNullParameter(blocked_reason, "blocked_reason");
            Intrinsics.checkNotNullParameter(request_url, "request_url");
            Intrinsics.checkNotNullParameter(request_method, "request_method");
            this.blocked_reason = blocked_reason;
            this.request_url = request_url;
            this.request_method = request_method;
            this.token_expiry_seconds = j;
        }

        public final AuthBlockedReasonDto getBlocked_reason() {
            return this.blocked_reason;
        }

        public /* synthetic */ Surrogate(AuthBlockedReasonDto authBlockedReasonDto, String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? AuthBlockedReasonDto.INSTANCE.getZeroValue() : authBlockedReasonDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? 0L : j);
        }

        public final String getRequest_url() {
            return this.request_url;
        }

        public final String getRequest_method() {
            return this.request_method;
        }

        public final long getToken_expiry_seconds() {
            return this.token_expiry_seconds;
        }
    }

    /* compiled from: AuthResponseInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto;", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<AuthResponseInfoDto, AuthResponseInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AuthResponseInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AuthResponseInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AuthResponseInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) AuthResponseInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AuthResponseInfo> getProtoAdapter() {
            return AuthResponseInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AuthResponseInfoDto getZeroValue() {
            return AuthResponseInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AuthResponseInfoDto fromProto(AuthResponseInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new AuthResponseInfoDto(new Surrogate(AuthBlockedReasonDto.INSTANCE.fromProto(proto.getBlocked_reason()), proto.getRequest_url(), proto.getRequest_method(), proto.getToken_expiry_seconds()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AuthResponseInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AuthResponseInfoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AuthResponseInfoDto(null, null, null, 0L, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthResponseInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$AuthBlockedReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo$AuthBlockedReason;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "AUTH_BLOCKED_REASON_UNSPECIFIED", "JWT_INVALID", "TOKEN_REVOKED", "HEADER_NOT_PRESENT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AuthBlockedReasonDto implements Dto2<AuthResponseInfo.AuthBlockedReason>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AuthBlockedReasonDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AuthBlockedReasonDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AuthBlockedReasonDto, AuthResponseInfo.AuthBlockedReason>> binaryBase64Serializer$delegate;
        public static final AuthBlockedReasonDto AUTH_BLOCKED_REASON_UNSPECIFIED = new AUTH_BLOCKED_REASON_UNSPECIFIED("AUTH_BLOCKED_REASON_UNSPECIFIED", 0);
        public static final AuthBlockedReasonDto JWT_INVALID = new JWT_INVALID("JWT_INVALID", 1);
        public static final AuthBlockedReasonDto TOKEN_REVOKED = new TOKEN_REVOKED("TOKEN_REVOKED", 2);
        public static final AuthBlockedReasonDto HEADER_NOT_PRESENT = new HEADER_NOT_PRESENT("HEADER_NOT_PRESENT", 3);

        private static final /* synthetic */ AuthBlockedReasonDto[] $values() {
            return new AuthBlockedReasonDto[]{AUTH_BLOCKED_REASON_UNSPECIFIED, JWT_INVALID, TOKEN_REVOKED, HEADER_NOT_PRESENT};
        }

        public /* synthetic */ AuthBlockedReasonDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<AuthBlockedReasonDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private AuthBlockedReasonDto(String str, int i) {
        }

        /* compiled from: AuthResponseInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AuthResponseInfoDto.AuthBlockedReasonDto.AUTH_BLOCKED_REASON_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$AuthBlockedReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo$AuthBlockedReason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AUTH_BLOCKED_REASON_UNSPECIFIED extends AuthBlockedReasonDto {
            AUTH_BLOCKED_REASON_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AuthResponseInfo.AuthBlockedReason toProto() {
                return AuthResponseInfo.AuthBlockedReason.AUTH_BLOCKED_REASON_UNSPECIFIED;
            }
        }

        static {
            AuthBlockedReasonDto[] authBlockedReasonDtoArr$values = $values();
            $VALUES = authBlockedReasonDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(authBlockedReasonDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.AuthResponseInfoDto$AuthBlockedReasonDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AuthResponseInfoDto.AuthBlockedReasonDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: AuthResponseInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AuthResponseInfoDto.AuthBlockedReasonDto.JWT_INVALID", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$AuthBlockedReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo$AuthBlockedReason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class JWT_INVALID extends AuthBlockedReasonDto {
            JWT_INVALID(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AuthResponseInfo.AuthBlockedReason toProto() {
                return AuthResponseInfo.AuthBlockedReason.JWT_INVALID;
            }
        }

        /* compiled from: AuthResponseInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AuthResponseInfoDto.AuthBlockedReasonDto.TOKEN_REVOKED", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$AuthBlockedReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo$AuthBlockedReason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOKEN_REVOKED extends AuthBlockedReasonDto {
            TOKEN_REVOKED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AuthResponseInfo.AuthBlockedReason toProto() {
                return AuthResponseInfo.AuthBlockedReason.TOKEN_REVOKED;
            }
        }

        /* compiled from: AuthResponseInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/AuthResponseInfoDto.AuthBlockedReasonDto.HEADER_NOT_PRESENT", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$AuthBlockedReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo$AuthBlockedReason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HEADER_NOT_PRESENT extends AuthBlockedReasonDto {
            HEADER_NOT_PRESENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AuthResponseInfo.AuthBlockedReason toProto() {
                return AuthResponseInfo.AuthBlockedReason.HEADER_NOT_PRESENT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: AuthResponseInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$AuthBlockedReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$AuthBlockedReasonDto;", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfo$AuthBlockedReason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$AuthBlockedReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AuthBlockedReasonDto, AuthResponseInfo.AuthBlockedReason> {

            /* compiled from: AuthResponseInfoDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AuthResponseInfo.AuthBlockedReason.values().length];
                    try {
                        iArr[AuthResponseInfo.AuthBlockedReason.AUTH_BLOCKED_REASON_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AuthResponseInfo.AuthBlockedReason.JWT_INVALID.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AuthResponseInfo.AuthBlockedReason.TOKEN_REVOKED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[AuthResponseInfo.AuthBlockedReason.HEADER_NOT_PRESENT.ordinal()] = 4;
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

            public final KSerializer<AuthBlockedReasonDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AuthBlockedReasonDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AuthBlockedReasonDto> getBinaryBase64Serializer() {
                return (KSerializer) AuthBlockedReasonDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<AuthResponseInfo.AuthBlockedReason> getProtoAdapter() {
                return AuthResponseInfo.AuthBlockedReason.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AuthBlockedReasonDto getZeroValue() {
                return AuthBlockedReasonDto.AUTH_BLOCKED_REASON_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AuthBlockedReasonDto fromProto(AuthResponseInfo.AuthBlockedReason proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return AuthBlockedReasonDto.AUTH_BLOCKED_REASON_UNSPECIFIED;
                }
                if (i == 2) {
                    return AuthBlockedReasonDto.JWT_INVALID;
                }
                if (i == 3) {
                    return AuthBlockedReasonDto.TOKEN_REVOKED;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return AuthBlockedReasonDto.HEADER_NOT_PRESENT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: AuthResponseInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$AuthBlockedReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$AuthBlockedReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<AuthBlockedReasonDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AuthBlockedReasonDto, AuthResponseInfo.AuthBlockedReason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.AuthResponseInfo.AuthBlockedReason", AuthBlockedReasonDto.getEntries(), AuthBlockedReasonDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public AuthBlockedReasonDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (AuthBlockedReasonDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AuthBlockedReasonDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static AuthBlockedReasonDto valueOf(String str) {
            return (AuthBlockedReasonDto) Enum.valueOf(AuthBlockedReasonDto.class, str);
        }

        public static AuthBlockedReasonDto[] values() {
            return (AuthBlockedReasonDto[]) $VALUES.clone();
        }
    }

    /* compiled from: AuthResponseInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AuthResponseInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.AuthResponseInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AuthResponseInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AuthResponseInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AuthResponseInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AuthResponseInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AuthResponseInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.AuthResponseInfoDto";
        }
    }
}
