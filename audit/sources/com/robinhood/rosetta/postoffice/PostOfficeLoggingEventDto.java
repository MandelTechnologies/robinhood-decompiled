package com.robinhood.rosetta.postoffice;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.postoffice.CommInfoDto;
import com.robinhood.rosetta.postoffice.EventContextDto;
import com.robinhood.rosetta.postoffice.UserInfoDto;
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

/* compiled from: PostOfficeLoggingEventDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010J4\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/postoffice/PostOfficeLoggingEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/postoffice/PostOfficeLoggingEvent;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/postoffice/PostOfficeLoggingEventDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/postoffice/PostOfficeLoggingEventDto$Surrogate;)V", "user_info", "Lcom/robinhood/rosetta/postoffice/UserInfoDto;", "comm_info", "Lcom/robinhood/rosetta/postoffice/CommInfoDto;", "event_context", "Lcom/robinhood/rosetta/postoffice/EventContextDto;", "extra_fields", "", "(Lcom/robinhood/rosetta/postoffice/UserInfoDto;Lcom/robinhood/rosetta/postoffice/CommInfoDto;Lcom/robinhood/rosetta/postoffice/EventContextDto;Ljava/lang/String;)V", "getUser_info", "()Lcom/robinhood/rosetta/postoffice/UserInfoDto;", "getComm_info", "()Lcom/robinhood/rosetta/postoffice/CommInfoDto;", "getEvent_context", "()Lcom/robinhood/rosetta/postoffice/EventContextDto;", "getExtra_fields", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.postoffice_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class PostOfficeLoggingEventDto implements Dto3<PostOfficeLoggingEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PostOfficeLoggingEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PostOfficeLoggingEventDto, PostOfficeLoggingEvent>> binaryBase64Serializer$delegate;
    private static final PostOfficeLoggingEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PostOfficeLoggingEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PostOfficeLoggingEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UserInfoDto getUser_info() {
        return this.surrogate.getUser_info();
    }

    public final CommInfoDto getComm_info() {
        return this.surrogate.getComm_info();
    }

    public final EventContextDto getEvent_context() {
        return this.surrogate.getEvent_context();
    }

    public final String getExtra_fields() {
        return this.surrogate.getExtra_fields();
    }

    public /* synthetic */ PostOfficeLoggingEventDto(UserInfoDto userInfoDto, CommInfoDto commInfoDto, EventContextDto eventContextDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userInfoDto, (i & 2) != 0 ? null : commInfoDto, (i & 4) != 0 ? null : eventContextDto, (i & 8) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostOfficeLoggingEventDto(UserInfoDto userInfoDto, CommInfoDto commInfoDto, EventContextDto eventContextDto, String extra_fields) {
        this(new Surrogate(userInfoDto, commInfoDto, eventContextDto, extra_fields));
        Intrinsics.checkNotNullParameter(extra_fields, "extra_fields");
    }

    public static /* synthetic */ PostOfficeLoggingEventDto copy$default(PostOfficeLoggingEventDto postOfficeLoggingEventDto, UserInfoDto userInfoDto, CommInfoDto commInfoDto, EventContextDto eventContextDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            userInfoDto = postOfficeLoggingEventDto.surrogate.getUser_info();
        }
        if ((i & 2) != 0) {
            commInfoDto = postOfficeLoggingEventDto.surrogate.getComm_info();
        }
        if ((i & 4) != 0) {
            eventContextDto = postOfficeLoggingEventDto.surrogate.getEvent_context();
        }
        if ((i & 8) != 0) {
            str = postOfficeLoggingEventDto.surrogate.getExtra_fields();
        }
        return postOfficeLoggingEventDto.copy(userInfoDto, commInfoDto, eventContextDto, str);
    }

    public final PostOfficeLoggingEventDto copy(UserInfoDto user_info, CommInfoDto comm_info, EventContextDto event_context, String extra_fields) {
        Intrinsics.checkNotNullParameter(extra_fields, "extra_fields");
        return new PostOfficeLoggingEventDto(new Surrogate(user_info, comm_info, event_context, extra_fields));
    }

    @Override // com.robinhood.idl.Dto
    public PostOfficeLoggingEvent toProto() {
        UserInfoDto user_info = this.surrogate.getUser_info();
        UserInfo proto = user_info != null ? user_info.toProto() : null;
        CommInfoDto comm_info = this.surrogate.getComm_info();
        CommInfo proto2 = comm_info != null ? comm_info.toProto() : null;
        EventContextDto event_context = this.surrogate.getEvent_context();
        return new PostOfficeLoggingEvent(proto, proto2, event_context != null ? event_context.toProto() : null, this.surrogate.getExtra_fields(), null, 16, null);
    }

    public String toString() {
        return "[PostOfficeLoggingEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PostOfficeLoggingEventDto) && Intrinsics.areEqual(((PostOfficeLoggingEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: PostOfficeLoggingEventDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000201B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J7\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\rHÖ\u0001J\t\u0010'\u001a\u00020\tHÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/postoffice/PostOfficeLoggingEventDto$Surrogate;", "", "user_info", "Lcom/robinhood/rosetta/postoffice/UserInfoDto;", "comm_info", "Lcom/robinhood/rosetta/postoffice/CommInfoDto;", "event_context", "Lcom/robinhood/rosetta/postoffice/EventContextDto;", "extra_fields", "", "<init>", "(Lcom/robinhood/rosetta/postoffice/UserInfoDto;Lcom/robinhood/rosetta/postoffice/CommInfoDto;Lcom/robinhood/rosetta/postoffice/EventContextDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/postoffice/UserInfoDto;Lcom/robinhood/rosetta/postoffice/CommInfoDto;Lcom/robinhood/rosetta/postoffice/EventContextDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUser_info$annotations", "()V", "getUser_info", "()Lcom/robinhood/rosetta/postoffice/UserInfoDto;", "getComm_info$annotations", "getComm_info", "()Lcom/robinhood/rosetta/postoffice/CommInfoDto;", "getEvent_context$annotations", "getEvent_context", "()Lcom/robinhood/rosetta/postoffice/EventContextDto;", "getExtra_fields$annotations", "getExtra_fields", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_postoffice_externalRelease", "$serializer", "Companion", "rosetta.postoffice_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CommInfoDto comm_info;
        private final EventContextDto event_context;
        private final String extra_fields;
        private final UserInfoDto user_info;

        public Surrogate() {
            this((UserInfoDto) null, (CommInfoDto) null, (EventContextDto) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UserInfoDto userInfoDto, CommInfoDto commInfoDto, EventContextDto eventContextDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                userInfoDto = surrogate.user_info;
            }
            if ((i & 2) != 0) {
                commInfoDto = surrogate.comm_info;
            }
            if ((i & 4) != 0) {
                eventContextDto = surrogate.event_context;
            }
            if ((i & 8) != 0) {
                str = surrogate.extra_fields;
            }
            return surrogate.copy(userInfoDto, commInfoDto, eventContextDto, str);
        }

        @SerialName("commInfo")
        @JsonAnnotations2(names = {"comm_info"})
        public static /* synthetic */ void getComm_info$annotations() {
        }

        @SerialName("eventContext")
        @JsonAnnotations2(names = {"event_context"})
        public static /* synthetic */ void getEvent_context$annotations() {
        }

        @SerialName("extraFields")
        @JsonAnnotations2(names = {"extra_fields"})
        public static /* synthetic */ void getExtra_fields$annotations() {
        }

        @SerialName("userInfo")
        @JsonAnnotations2(names = {"user_info"})
        public static /* synthetic */ void getUser_info$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UserInfoDto getUser_info() {
            return this.user_info;
        }

        /* renamed from: component2, reason: from getter */
        public final CommInfoDto getComm_info() {
            return this.comm_info;
        }

        /* renamed from: component3, reason: from getter */
        public final EventContextDto getEvent_context() {
            return this.event_context;
        }

        /* renamed from: component4, reason: from getter */
        public final String getExtra_fields() {
            return this.extra_fields;
        }

        public final Surrogate copy(UserInfoDto user_info, CommInfoDto comm_info, EventContextDto event_context, String extra_fields) {
            Intrinsics.checkNotNullParameter(extra_fields, "extra_fields");
            return new Surrogate(user_info, comm_info, event_context, extra_fields);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.user_info, surrogate.user_info) && Intrinsics.areEqual(this.comm_info, surrogate.comm_info) && Intrinsics.areEqual(this.event_context, surrogate.event_context) && Intrinsics.areEqual(this.extra_fields, surrogate.extra_fields);
        }

        public int hashCode() {
            UserInfoDto userInfoDto = this.user_info;
            int iHashCode = (userInfoDto == null ? 0 : userInfoDto.hashCode()) * 31;
            CommInfoDto commInfoDto = this.comm_info;
            int iHashCode2 = (iHashCode + (commInfoDto == null ? 0 : commInfoDto.hashCode())) * 31;
            EventContextDto eventContextDto = this.event_context;
            return ((iHashCode2 + (eventContextDto != null ? eventContextDto.hashCode() : 0)) * 31) + this.extra_fields.hashCode();
        }

        public String toString() {
            return "Surrogate(user_info=" + this.user_info + ", comm_info=" + this.comm_info + ", event_context=" + this.event_context + ", extra_fields=" + this.extra_fields + ")";
        }

        /* compiled from: PostOfficeLoggingEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/postoffice/PostOfficeLoggingEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/postoffice/PostOfficeLoggingEventDto$Surrogate;", "rosetta.postoffice_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PostOfficeLoggingEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UserInfoDto userInfoDto, CommInfoDto commInfoDto, EventContextDto eventContextDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.user_info = null;
            } else {
                this.user_info = userInfoDto;
            }
            if ((i & 2) == 0) {
                this.comm_info = null;
            } else {
                this.comm_info = commInfoDto;
            }
            if ((i & 4) == 0) {
                this.event_context = null;
            } else {
                this.event_context = eventContextDto;
            }
            if ((i & 8) == 0) {
                this.extra_fields = "";
            } else {
                this.extra_fields = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_postoffice_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UserInfoDto userInfoDto = self.user_info;
            if (userInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UserInfoDto.Serializer.INSTANCE, userInfoDto);
            }
            CommInfoDto commInfoDto = self.comm_info;
            if (commInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CommInfoDto.Serializer.INSTANCE, commInfoDto);
            }
            EventContextDto eventContextDto = self.event_context;
            if (eventContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, EventContextDto.Serializer.INSTANCE, eventContextDto);
            }
            if (Intrinsics.areEqual(self.extra_fields, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.extra_fields);
        }

        public Surrogate(UserInfoDto userInfoDto, CommInfoDto commInfoDto, EventContextDto eventContextDto, String extra_fields) {
            Intrinsics.checkNotNullParameter(extra_fields, "extra_fields");
            this.user_info = userInfoDto;
            this.comm_info = commInfoDto;
            this.event_context = eventContextDto;
            this.extra_fields = extra_fields;
        }

        public final UserInfoDto getUser_info() {
            return this.user_info;
        }

        public final CommInfoDto getComm_info() {
            return this.comm_info;
        }

        public final EventContextDto getEvent_context() {
            return this.event_context;
        }

        public final String getExtra_fields() {
            return this.extra_fields;
        }

        public /* synthetic */ Surrogate(UserInfoDto userInfoDto, CommInfoDto commInfoDto, EventContextDto eventContextDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : userInfoDto, (i & 2) != 0 ? null : commInfoDto, (i & 4) != 0 ? null : eventContextDto, (i & 8) != 0 ? "" : str);
        }
    }

    /* compiled from: PostOfficeLoggingEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/postoffice/PostOfficeLoggingEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/postoffice/PostOfficeLoggingEventDto;", "Lcom/robinhood/rosetta/postoffice/PostOfficeLoggingEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/postoffice/PostOfficeLoggingEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.postoffice_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PostOfficeLoggingEventDto, PostOfficeLoggingEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PostOfficeLoggingEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PostOfficeLoggingEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PostOfficeLoggingEventDto> getBinaryBase64Serializer() {
            return (KSerializer) PostOfficeLoggingEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PostOfficeLoggingEvent> getProtoAdapter() {
            return PostOfficeLoggingEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PostOfficeLoggingEventDto getZeroValue() {
            return PostOfficeLoggingEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PostOfficeLoggingEventDto fromProto(PostOfficeLoggingEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UserInfo user_info = proto.getUser_info();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UserInfoDto userInfoDtoFromProto = user_info != null ? UserInfoDto.INSTANCE.fromProto(user_info) : null;
            CommInfo comm_info = proto.getComm_info();
            CommInfoDto commInfoDtoFromProto = comm_info != null ? CommInfoDto.INSTANCE.fromProto(comm_info) : null;
            EventContext event_context = proto.getEvent_context();
            return new PostOfficeLoggingEventDto(new Surrogate(userInfoDtoFromProto, commInfoDtoFromProto, event_context != null ? EventContextDto.INSTANCE.fromProto(event_context) : null, proto.getExtra_fields()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.postoffice.PostOfficeLoggingEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostOfficeLoggingEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PostOfficeLoggingEventDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PostOfficeLoggingEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/postoffice/PostOfficeLoggingEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/postoffice/PostOfficeLoggingEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/postoffice/PostOfficeLoggingEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.postoffice_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PostOfficeLoggingEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.postoffice.PostOfficeLoggingEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PostOfficeLoggingEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PostOfficeLoggingEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PostOfficeLoggingEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PostOfficeLoggingEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/postoffice/PostOfficeLoggingEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.postoffice_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.postoffice.PostOfficeLoggingEventDto";
        }
    }
}
