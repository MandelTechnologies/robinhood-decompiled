package com.robinhood.rosetta.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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

/* compiled from: RequestContextDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0011JL\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/common/RequestContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/common/RequestContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/common/RequestContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/common/RequestContextDto$Surrogate;)V", "ip", "", "device_id", "user_agent", "request_path", "author_major_oak_email", "device_token_hash", "device_creation_time", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getIp", "()Ljava/lang/String;", "getDevice_id", "getUser_agent", "getRequest_path", "getAuthor_major_oak_email", "getDevice_token_hash", "getDevice_creation_time", "()J", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class RequestContextDto implements Dto3<RequestContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<RequestContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RequestContextDto, RequestContext>> binaryBase64Serializer$delegate;
    private static final RequestContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RequestContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RequestContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getIp() {
        return this.surrogate.getIp();
    }

    public final String getDevice_id() {
        return this.surrogate.getDevice_id();
    }

    public final String getUser_agent() {
        return this.surrogate.getUser_agent();
    }

    public final String getRequest_path() {
        return this.surrogate.getRequest_path();
    }

    public final String getAuthor_major_oak_email() {
        return this.surrogate.getAuthor_major_oak_email();
    }

    public final String getDevice_token_hash() {
        return this.surrogate.getDevice_token_hash();
    }

    public final long getDevice_creation_time() {
        return this.surrogate.getDevice_creation_time();
    }

    public /* synthetic */ RequestContextDto(String str, String str2, String str3, String str4, String str5, String str6, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? 0L : j);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RequestContextDto(String ip, String device_id, String user_agent, String request_path, String author_major_oak_email, String device_token_hash, long j) {
        this(new Surrogate(ip, device_id, user_agent, request_path, author_major_oak_email, device_token_hash, j));
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(device_id, "device_id");
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(request_path, "request_path");
        Intrinsics.checkNotNullParameter(author_major_oak_email, "author_major_oak_email");
        Intrinsics.checkNotNullParameter(device_token_hash, "device_token_hash");
    }

    public static /* synthetic */ RequestContextDto copy$default(RequestContextDto requestContextDto, String str, String str2, String str3, String str4, String str5, String str6, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestContextDto.surrogate.getIp();
        }
        if ((i & 2) != 0) {
            str2 = requestContextDto.surrogate.getDevice_id();
        }
        if ((i & 4) != 0) {
            str3 = requestContextDto.surrogate.getUser_agent();
        }
        if ((i & 8) != 0) {
            str4 = requestContextDto.surrogate.getRequest_path();
        }
        if ((i & 16) != 0) {
            str5 = requestContextDto.surrogate.getAuthor_major_oak_email();
        }
        if ((i & 32) != 0) {
            str6 = requestContextDto.surrogate.getDevice_token_hash();
        }
        if ((i & 64) != 0) {
            j = requestContextDto.surrogate.getDevice_creation_time();
        }
        long j2 = j;
        String str7 = str5;
        String str8 = str6;
        return requestContextDto.copy(str, str2, str3, str4, str7, str8, j2);
    }

    public final RequestContextDto copy(String ip, String device_id, String user_agent, String request_path, String author_major_oak_email, String device_token_hash, long device_creation_time) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(device_id, "device_id");
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(request_path, "request_path");
        Intrinsics.checkNotNullParameter(author_major_oak_email, "author_major_oak_email");
        Intrinsics.checkNotNullParameter(device_token_hash, "device_token_hash");
        return new RequestContextDto(new Surrogate(ip, device_id, user_agent, request_path, author_major_oak_email, device_token_hash, device_creation_time));
    }

    @Override // com.robinhood.idl.Dto
    public RequestContext toProto() {
        return new RequestContext(this.surrogate.getIp(), this.surrogate.getDevice_id(), this.surrogate.getUser_agent(), this.surrogate.getRequest_path(), this.surrogate.getAuthor_major_oak_email(), this.surrogate.getDevice_token_hash(), this.surrogate.getDevice_creation_time(), null, 128, null);
    }

    public String toString() {
        return "[RequestContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RequestContextDto) && Intrinsics.areEqual(((RequestContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: RequestContextDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 <2\u00020\u0001:\u0002;<B\\\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0018\u0010,\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003J^\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0017\b\u0002\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0011HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J%\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\b:R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R+\u0010\t\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010%¨\u0006="}, m3636d2 = {"Lcom/robinhood/rosetta/common/RequestContextDto$Surrogate;", "", "ip", "", "device_id", "user_agent", "request_path", "author_major_oak_email", "device_token_hash", "device_creation_time", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIp$annotations", "()V", "getIp", "()Ljava/lang/String;", "getDevice_id$annotations", "getDevice_id", "getUser_agent$annotations", "getUser_agent", "getRequest_path$annotations", "getRequest_path", "getAuthor_major_oak_email$annotations", "getAuthor_major_oak_email", "getDevice_token_hash$annotations", "getDevice_token_hash", "getDevice_creation_time$annotations", "getDevice_creation_time", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_common_externalRelease", "$serializer", "Companion", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String author_major_oak_email;
        private final long device_creation_time;
        private final String device_id;
        private final String device_token_hash;
        private final String ip;
        private final String request_path;
        private final String user_agent;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, String str6, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.ip;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.device_id;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.user_agent;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.request_path;
            }
            if ((i & 16) != 0) {
                str5 = surrogate.author_major_oak_email;
            }
            if ((i & 32) != 0) {
                str6 = surrogate.device_token_hash;
            }
            if ((i & 64) != 0) {
                j = surrogate.device_creation_time;
            }
            long j2 = j;
            String str7 = str5;
            String str8 = str6;
            return surrogate.copy(str, str2, str3, str4, str7, str8, j2);
        }

        @SerialName("authorMajorOakEmail")
        @JsonAnnotations2(names = {"author_major_oak_email"})
        public static /* synthetic */ void getAuthor_major_oak_email$annotations() {
        }

        @SerialName("deviceCreationTime")
        @JsonAnnotations2(names = {"device_creation_time"})
        public static /* synthetic */ void getDevice_creation_time$annotations() {
        }

        @SerialName(CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID)
        @JsonAnnotations2(names = {"device_id"})
        public static /* synthetic */ void getDevice_id$annotations() {
        }

        @SerialName("deviceTokenHash")
        @JsonAnnotations2(names = {"device_token_hash"})
        public static /* synthetic */ void getDevice_token_hash$annotations() {
        }

        @SerialName("ip")
        @JsonAnnotations2(names = {"ip"})
        public static /* synthetic */ void getIp$annotations() {
        }

        @SerialName("requestPath")
        @JsonAnnotations2(names = {"request_path"})
        public static /* synthetic */ void getRequest_path$annotations() {
        }

        @SerialName("userAgent")
        @JsonAnnotations2(names = {"user_agent"})
        public static /* synthetic */ void getUser_agent$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getIp() {
            return this.ip;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDevice_id() {
            return this.device_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUser_agent() {
            return this.user_agent;
        }

        /* renamed from: component4, reason: from getter */
        public final String getRequest_path() {
            return this.request_path;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAuthor_major_oak_email() {
            return this.author_major_oak_email;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDevice_token_hash() {
            return this.device_token_hash;
        }

        /* renamed from: component7, reason: from getter */
        public final long getDevice_creation_time() {
            return this.device_creation_time;
        }

        public final Surrogate copy(String ip, String device_id, String user_agent, String request_path, String author_major_oak_email, String device_token_hash, long device_creation_time) {
            Intrinsics.checkNotNullParameter(ip, "ip");
            Intrinsics.checkNotNullParameter(device_id, "device_id");
            Intrinsics.checkNotNullParameter(user_agent, "user_agent");
            Intrinsics.checkNotNullParameter(request_path, "request_path");
            Intrinsics.checkNotNullParameter(author_major_oak_email, "author_major_oak_email");
            Intrinsics.checkNotNullParameter(device_token_hash, "device_token_hash");
            return new Surrogate(ip, device_id, user_agent, request_path, author_major_oak_email, device_token_hash, device_creation_time);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ip, surrogate.ip) && Intrinsics.areEqual(this.device_id, surrogate.device_id) && Intrinsics.areEqual(this.user_agent, surrogate.user_agent) && Intrinsics.areEqual(this.request_path, surrogate.request_path) && Intrinsics.areEqual(this.author_major_oak_email, surrogate.author_major_oak_email) && Intrinsics.areEqual(this.device_token_hash, surrogate.device_token_hash) && this.device_creation_time == surrogate.device_creation_time;
        }

        public int hashCode() {
            return (((((((((((this.ip.hashCode() * 31) + this.device_id.hashCode()) * 31) + this.user_agent.hashCode()) * 31) + this.request_path.hashCode()) * 31) + this.author_major_oak_email.hashCode()) * 31) + this.device_token_hash.hashCode()) * 31) + Long.hashCode(this.device_creation_time);
        }

        public String toString() {
            return "Surrogate(ip=" + this.ip + ", device_id=" + this.device_id + ", user_agent=" + this.user_agent + ", request_path=" + this.request_path + ", author_major_oak_email=" + this.author_major_oak_email + ", device_token_hash=" + this.device_token_hash + ", device_creation_time=" + this.device_creation_time + ")";
        }

        /* compiled from: RequestContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/common/RequestContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/common/RequestContextDto$Surrogate;", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RequestContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, long j, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.ip = "";
            } else {
                this.ip = str;
            }
            if ((i & 2) == 0) {
                this.device_id = "";
            } else {
                this.device_id = str2;
            }
            if ((i & 4) == 0) {
                this.user_agent = "";
            } else {
                this.user_agent = str3;
            }
            if ((i & 8) == 0) {
                this.request_path = "";
            } else {
                this.request_path = str4;
            }
            if ((i & 16) == 0) {
                this.author_major_oak_email = "";
            } else {
                this.author_major_oak_email = str5;
            }
            if ((i & 32) == 0) {
                this.device_token_hash = "";
            } else {
                this.device_token_hash = str6;
            }
            if ((i & 64) == 0) {
                this.device_creation_time = 0L;
            } else {
                this.device_creation_time = j;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_common_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.ip, "")) {
                output.encodeStringElement(serialDesc, 0, self.ip);
            }
            if (!Intrinsics.areEqual(self.device_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.device_id);
            }
            if (!Intrinsics.areEqual(self.user_agent, "")) {
                output.encodeStringElement(serialDesc, 2, self.user_agent);
            }
            if (!Intrinsics.areEqual(self.request_path, "")) {
                output.encodeStringElement(serialDesc, 3, self.request_path);
            }
            if (!Intrinsics.areEqual(self.author_major_oak_email, "")) {
                output.encodeStringElement(serialDesc, 4, self.author_major_oak_email);
            }
            if (!Intrinsics.areEqual(self.device_token_hash, "")) {
                output.encodeStringElement(serialDesc, 5, self.device_token_hash);
            }
            long j = self.device_creation_time;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
        }

        public Surrogate(String ip, String device_id, String user_agent, String request_path, String author_major_oak_email, String device_token_hash, long j) {
            Intrinsics.checkNotNullParameter(ip, "ip");
            Intrinsics.checkNotNullParameter(device_id, "device_id");
            Intrinsics.checkNotNullParameter(user_agent, "user_agent");
            Intrinsics.checkNotNullParameter(request_path, "request_path");
            Intrinsics.checkNotNullParameter(author_major_oak_email, "author_major_oak_email");
            Intrinsics.checkNotNullParameter(device_token_hash, "device_token_hash");
            this.ip = ip;
            this.device_id = device_id;
            this.user_agent = user_agent;
            this.request_path = request_path;
            this.author_major_oak_email = author_major_oak_email;
            this.device_token_hash = device_token_hash;
            this.device_creation_time = j;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? 0L : j);
        }

        public final String getIp() {
            return this.ip;
        }

        public final String getDevice_id() {
            return this.device_id;
        }

        public final String getUser_agent() {
            return this.user_agent;
        }

        public final String getRequest_path() {
            return this.request_path;
        }

        public final String getAuthor_major_oak_email() {
            return this.author_major_oak_email;
        }

        public final String getDevice_token_hash() {
            return this.device_token_hash;
        }

        public final long getDevice_creation_time() {
            return this.device_creation_time;
        }
    }

    /* compiled from: RequestContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/common/RequestContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/common/RequestContextDto;", "Lcom/robinhood/rosetta/common/RequestContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/common/RequestContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<RequestContextDto, RequestContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RequestContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RequestContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RequestContextDto> getBinaryBase64Serializer() {
            return (KSerializer) RequestContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RequestContext> getProtoAdapter() {
            return RequestContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RequestContextDto getZeroValue() {
            return RequestContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RequestContextDto fromProto(RequestContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new RequestContextDto(new Surrogate(proto.getIp(), proto.getDevice_id(), proto.getUser_agent(), proto.getRequest_path(), proto.getAuthor_major_oak_email(), proto.getDevice_token_hash(), proto.getDevice_creation_time()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.common.RequestContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RequestContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new RequestContextDto(null, null, null, null, null, null, 0L, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: RequestContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/common/RequestContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/common/RequestContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/common/RequestContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<RequestContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.common.RequestContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RequestContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RequestContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RequestContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: RequestContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/common/RequestContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.common.RequestContextDto";
        }
    }
}
