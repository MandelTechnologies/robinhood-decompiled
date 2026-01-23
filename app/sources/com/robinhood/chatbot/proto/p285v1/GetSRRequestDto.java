package com.robinhood.chatbot.proto.p285v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
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

/* compiled from: GetSRRequestDto.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\"#$%B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\rJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f¨\u0006&"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GetSRRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/chatbot/proto/v1/GetSRRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/chatbot/proto/v1/GetSRRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/GetSRRequestDto$Surrogate;)V", "twilio_conversation_id", "", "twilio_message_id", "response_version", "sf_case_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTwilio_conversation_id", "()Ljava/lang/String;", "getTwilio_message_id", "getResponse_version", "getSf_case_id", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
public final class GetSRRequestDto implements Dto3<GetSRRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetSRRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetSRRequestDto, GetSRRequest>> binaryBase64Serializer$delegate;
    private static final GetSRRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetSRRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetSRRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTwilio_conversation_id() {
        return this.surrogate.getTwilio_conversation_id();
    }

    public final String getTwilio_message_id() {
        return this.surrogate.getTwilio_message_id();
    }

    public final String getResponse_version() {
        return this.surrogate.getResponse_version();
    }

    public final String getSf_case_id() {
        return this.surrogate.getSf_case_id();
    }

    public /* synthetic */ GetSRRequestDto(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetSRRequestDto(String twilio_conversation_id, String twilio_message_id, String response_version, String sf_case_id) {
        this(new Surrogate(twilio_conversation_id, twilio_message_id, response_version, sf_case_id));
        Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
        Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
        Intrinsics.checkNotNullParameter(response_version, "response_version");
        Intrinsics.checkNotNullParameter(sf_case_id, "sf_case_id");
    }

    public static /* synthetic */ GetSRRequestDto copy$default(GetSRRequestDto getSRRequestDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getSRRequestDto.surrogate.getTwilio_conversation_id();
        }
        if ((i & 2) != 0) {
            str2 = getSRRequestDto.surrogate.getTwilio_message_id();
        }
        if ((i & 4) != 0) {
            str3 = getSRRequestDto.surrogate.getResponse_version();
        }
        if ((i & 8) != 0) {
            str4 = getSRRequestDto.surrogate.getSf_case_id();
        }
        return getSRRequestDto.copy(str, str2, str3, str4);
    }

    public final GetSRRequestDto copy(String twilio_conversation_id, String twilio_message_id, String response_version, String sf_case_id) {
        Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
        Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
        Intrinsics.checkNotNullParameter(response_version, "response_version");
        Intrinsics.checkNotNullParameter(sf_case_id, "sf_case_id");
        return new GetSRRequestDto(new Surrogate(twilio_conversation_id, twilio_message_id, response_version, sf_case_id));
    }

    @Override // com.robinhood.idl.Dto
    public GetSRRequest toProto() {
        return new GetSRRequest(this.surrogate.getTwilio_conversation_id(), this.surrogate.getTwilio_message_id(), this.surrogate.getResponse_version(), this.surrogate.getSf_case_id(), null, 16, null);
    }

    public String toString() {
        return "[GetSRRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetSRRequestDto) && Intrinsics.areEqual(((GetSRRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetSRRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002*+B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006,"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GetSRRequestDto$Surrogate;", "", "twilio_conversation_id", "", "twilio_message_id", "response_version", "sf_case_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTwilio_conversation_id$annotations", "()V", "getTwilio_conversation_id", "()Ljava/lang/String;", "getTwilio_message_id$annotations", "getTwilio_message_id", "getResponse_version$annotations", "getResponse_version", "getSf_case_id$annotations", "getSf_case_id", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chatbot_v1_externalRelease", "$serializer", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String response_version;
        private final String sf_case_id;
        private final String twilio_conversation_id;
        private final String twilio_message_id;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.twilio_conversation_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.twilio_message_id;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.response_version;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.sf_case_id;
            }
            return surrogate.copy(str, str2, str3, str4);
        }

        @SerialName("responseVersion")
        @JsonAnnotations2(names = {"response_version"})
        public static /* synthetic */ void getResponse_version$annotations() {
        }

        @SerialName("sfCaseId")
        @JsonAnnotations2(names = {"sf_case_id"})
        public static /* synthetic */ void getSf_case_id$annotations() {
        }

        @SerialName("twilioConversationId")
        @JsonAnnotations2(names = {"twilio_conversation_id"})
        public static /* synthetic */ void getTwilio_conversation_id$annotations() {
        }

        @SerialName("twilioMessageId")
        @JsonAnnotations2(names = {"twilio_message_id"})
        public static /* synthetic */ void getTwilio_message_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTwilio_conversation_id() {
            return this.twilio_conversation_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTwilio_message_id() {
            return this.twilio_message_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getResponse_version() {
            return this.response_version;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSf_case_id() {
            return this.sf_case_id;
        }

        public final Surrogate copy(String twilio_conversation_id, String twilio_message_id, String response_version, String sf_case_id) {
            Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
            Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
            Intrinsics.checkNotNullParameter(response_version, "response_version");
            Intrinsics.checkNotNullParameter(sf_case_id, "sf_case_id");
            return new Surrogate(twilio_conversation_id, twilio_message_id, response_version, sf_case_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.twilio_conversation_id, surrogate.twilio_conversation_id) && Intrinsics.areEqual(this.twilio_message_id, surrogate.twilio_message_id) && Intrinsics.areEqual(this.response_version, surrogate.response_version) && Intrinsics.areEqual(this.sf_case_id, surrogate.sf_case_id);
        }

        public int hashCode() {
            return (((((this.twilio_conversation_id.hashCode() * 31) + this.twilio_message_id.hashCode()) * 31) + this.response_version.hashCode()) * 31) + this.sf_case_id.hashCode();
        }

        public String toString() {
            return "Surrogate(twilio_conversation_id=" + this.twilio_conversation_id + ", twilio_message_id=" + this.twilio_message_id + ", response_version=" + this.response_version + ", sf_case_id=" + this.sf_case_id + ")";
        }

        /* compiled from: GetSRRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GetSRRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/GetSRRequestDto$Surrogate;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetSRRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.twilio_conversation_id = "";
            } else {
                this.twilio_conversation_id = str;
            }
            if ((i & 2) == 0) {
                this.twilio_message_id = "";
            } else {
                this.twilio_message_id = str2;
            }
            if ((i & 4) == 0) {
                this.response_version = "";
            } else {
                this.response_version = str3;
            }
            if ((i & 8) == 0) {
                this.sf_case_id = "";
            } else {
                this.sf_case_id = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$chatbot_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.twilio_conversation_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.twilio_conversation_id);
            }
            if (!Intrinsics.areEqual(self.twilio_message_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.twilio_message_id);
            }
            if (!Intrinsics.areEqual(self.response_version, "")) {
                output.encodeStringElement(serialDesc, 2, self.response_version);
            }
            if (Intrinsics.areEqual(self.sf_case_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.sf_case_id);
        }

        public Surrogate(String twilio_conversation_id, String twilio_message_id, String response_version, String sf_case_id) {
            Intrinsics.checkNotNullParameter(twilio_conversation_id, "twilio_conversation_id");
            Intrinsics.checkNotNullParameter(twilio_message_id, "twilio_message_id");
            Intrinsics.checkNotNullParameter(response_version, "response_version");
            Intrinsics.checkNotNullParameter(sf_case_id, "sf_case_id");
            this.twilio_conversation_id = twilio_conversation_id;
            this.twilio_message_id = twilio_message_id;
            this.response_version = response_version;
            this.sf_case_id = sf_case_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }

        public final String getTwilio_conversation_id() {
            return this.twilio_conversation_id;
        }

        public final String getTwilio_message_id() {
            return this.twilio_message_id;
        }

        public final String getResponse_version() {
            return this.response_version;
        }

        public final String getSf_case_id() {
            return this.sf_case_id;
        }
    }

    /* compiled from: GetSRRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GetSRRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/chatbot/proto/v1/GetSRRequestDto;", "Lcom/robinhood/chatbot/proto/v1/GetSRRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/chatbot/proto/v1/GetSRRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GetSRRequestDto, GetSRRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetSRRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetSRRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetSRRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetSRRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetSRRequest> getProtoAdapter() {
            return GetSRRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetSRRequestDto getZeroValue() {
            return GetSRRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetSRRequestDto fromProto(GetSRRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GetSRRequestDto(new Surrogate(proto.getTwilio_conversation_id(), proto.getTwilio_message_id(), proto.getResponse_version(), proto.getSf_case_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.chatbot.proto.v1.GetSRRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetSRRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetSRRequestDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetSRRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GetSRRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/chatbot/proto/v1/GetSRRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/chatbot/proto/v1/GetSRRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class Serializer implements KSerializer<GetSRRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/chatbot.service.GetSRRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetSRRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetSRRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetSRRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetSRRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GetSRRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.chatbot.proto.v1.GetSRRequestDto";
        }
    }
}
