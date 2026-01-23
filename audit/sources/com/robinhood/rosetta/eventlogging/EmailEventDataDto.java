package com.robinhood.rosetta.eventlogging;

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

/* compiled from: EmailEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000fJB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\tJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/EmailEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto$Surrogate;)V", "email_address", "", "email_category", "test_version", "uuid", "user_agent", "masked_email_address", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail_address", "()Ljava/lang/String;", "getEmail_category", "getTest_version", "getUuid", "getUser_agent", "getMasked_email_address", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class EmailEventDataDto implements Dto3<EmailEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EmailEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EmailEventDataDto, EmailEventData>> binaryBase64Serializer$delegate;
    private static final EmailEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EmailEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EmailEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getEmail_address() {
        return this.surrogate.getEmail_address();
    }

    public final String getEmail_category() {
        return this.surrogate.getEmail_category();
    }

    public final String getTest_version() {
        return this.surrogate.getTest_version();
    }

    public final String getUuid() {
        return this.surrogate.getUuid();
    }

    public final String getUser_agent() {
        return this.surrogate.getUser_agent();
    }

    public final String getMasked_email_address() {
        return this.surrogate.getMasked_email_address();
    }

    public /* synthetic */ EmailEventDataDto(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmailEventDataDto(String email_address, String email_category, String test_version, String uuid, String user_agent, String masked_email_address) {
        this(new Surrogate(email_address, email_category, test_version, uuid, user_agent, masked_email_address));
        Intrinsics.checkNotNullParameter(email_address, "email_address");
        Intrinsics.checkNotNullParameter(email_category, "email_category");
        Intrinsics.checkNotNullParameter(test_version, "test_version");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(masked_email_address, "masked_email_address");
    }

    public static /* synthetic */ EmailEventDataDto copy$default(EmailEventDataDto emailEventDataDto, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailEventDataDto.surrogate.getEmail_address();
        }
        if ((i & 2) != 0) {
            str2 = emailEventDataDto.surrogate.getEmail_category();
        }
        if ((i & 4) != 0) {
            str3 = emailEventDataDto.surrogate.getTest_version();
        }
        if ((i & 8) != 0) {
            str4 = emailEventDataDto.surrogate.getUuid();
        }
        if ((i & 16) != 0) {
            str5 = emailEventDataDto.surrogate.getUser_agent();
        }
        if ((i & 32) != 0) {
            str6 = emailEventDataDto.surrogate.getMasked_email_address();
        }
        String str7 = str5;
        String str8 = str6;
        return emailEventDataDto.copy(str, str2, str3, str4, str7, str8);
    }

    public final EmailEventDataDto copy(String email_address, String email_category, String test_version, String uuid, String user_agent, String masked_email_address) {
        Intrinsics.checkNotNullParameter(email_address, "email_address");
        Intrinsics.checkNotNullParameter(email_category, "email_category");
        Intrinsics.checkNotNullParameter(test_version, "test_version");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(masked_email_address, "masked_email_address");
        return new EmailEventDataDto(new Surrogate(email_address, email_category, test_version, uuid, user_agent, masked_email_address));
    }

    @Override // com.robinhood.idl.Dto
    public EmailEventData toProto() {
        return new EmailEventData(this.surrogate.getEmail_address(), this.surrogate.getEmail_category(), this.surrogate.getTest_version(), this.surrogate.getUuid(), this.surrogate.getUser_agent(), this.surrogate.getMasked_email_address(), null, 64, null);
    }

    public String toString() {
        return "[EmailEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EmailEventDataDto) && Intrinsics.areEqual(((EmailEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: EmailEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 32\u00020\u0001:\u000223BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\fHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J%\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013¨\u00064"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto$Surrogate;", "", "email_address", "", "email_category", "test_version", "uuid", "user_agent", "masked_email_address", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEmail_address$annotations", "()V", "getEmail_address", "()Ljava/lang/String;", "getEmail_category$annotations", "getEmail_category", "getTest_version$annotations", "getTest_version", "getUuid$annotations", "getUuid", "getUser_agent$annotations", "getUser_agent", "getMasked_email_address$annotations", "getMasked_email_address", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String email_address;
        private final String email_category;
        private final String masked_email_address;
        private final String test_version;
        private final String user_agent;
        private final String uuid;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.email_address;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.email_category;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.test_version;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.uuid;
            }
            if ((i & 16) != 0) {
                str5 = surrogate.user_agent;
            }
            if ((i & 32) != 0) {
                str6 = surrogate.masked_email_address;
            }
            String str7 = str5;
            String str8 = str6;
            return surrogate.copy(str, str2, str3, str4, str7, str8);
        }

        @SerialName("emailAddress")
        @JsonAnnotations2(names = {"email_address"})
        public static /* synthetic */ void getEmail_address$annotations() {
        }

        @SerialName("emailCategory")
        @JsonAnnotations2(names = {"email_category"})
        public static /* synthetic */ void getEmail_category$annotations() {
        }

        @SerialName("maskedEmailAddress")
        @JsonAnnotations2(names = {"masked_email_address"})
        public static /* synthetic */ void getMasked_email_address$annotations() {
        }

        @SerialName("testVersion")
        @JsonAnnotations2(names = {"test_version"})
        public static /* synthetic */ void getTest_version$annotations() {
        }

        @SerialName("userAgent")
        @JsonAnnotations2(names = {"user_agent"})
        public static /* synthetic */ void getUser_agent$annotations() {
        }

        @SerialName("uuid")
        @JsonAnnotations2(names = {"uuid"})
        public static /* synthetic */ void getUuid$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail_address() {
            return this.email_address;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEmail_category() {
            return this.email_category;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTest_version() {
            return this.test_version;
        }

        /* renamed from: component4, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        /* renamed from: component5, reason: from getter */
        public final String getUser_agent() {
            return this.user_agent;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMasked_email_address() {
            return this.masked_email_address;
        }

        public final Surrogate copy(String email_address, String email_category, String test_version, String uuid, String user_agent, String masked_email_address) {
            Intrinsics.checkNotNullParameter(email_address, "email_address");
            Intrinsics.checkNotNullParameter(email_category, "email_category");
            Intrinsics.checkNotNullParameter(test_version, "test_version");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(user_agent, "user_agent");
            Intrinsics.checkNotNullParameter(masked_email_address, "masked_email_address");
            return new Surrogate(email_address, email_category, test_version, uuid, user_agent, masked_email_address);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.email_address, surrogate.email_address) && Intrinsics.areEqual(this.email_category, surrogate.email_category) && Intrinsics.areEqual(this.test_version, surrogate.test_version) && Intrinsics.areEqual(this.uuid, surrogate.uuid) && Intrinsics.areEqual(this.user_agent, surrogate.user_agent) && Intrinsics.areEqual(this.masked_email_address, surrogate.masked_email_address);
        }

        public int hashCode() {
            return (((((((((this.email_address.hashCode() * 31) + this.email_category.hashCode()) * 31) + this.test_version.hashCode()) * 31) + this.uuid.hashCode()) * 31) + this.user_agent.hashCode()) * 31) + this.masked_email_address.hashCode();
        }

        public String toString() {
            return "Surrogate(email_address=" + this.email_address + ", email_category=" + this.email_category + ", test_version=" + this.test_version + ", uuid=" + this.uuid + ", user_agent=" + this.user_agent + ", masked_email_address=" + this.masked_email_address + ")";
        }

        /* compiled from: EmailEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EmailEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.email_address = "";
            } else {
                this.email_address = str;
            }
            if ((i & 2) == 0) {
                this.email_category = "";
            } else {
                this.email_category = str2;
            }
            if ((i & 4) == 0) {
                this.test_version = "";
            } else {
                this.test_version = str3;
            }
            if ((i & 8) == 0) {
                this.uuid = "";
            } else {
                this.uuid = str4;
            }
            if ((i & 16) == 0) {
                this.user_agent = "";
            } else {
                this.user_agent = str5;
            }
            if ((i & 32) == 0) {
                this.masked_email_address = "";
            } else {
                this.masked_email_address = str6;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.email_address, "")) {
                output.encodeStringElement(serialDesc, 0, self.email_address);
            }
            if (!Intrinsics.areEqual(self.email_category, "")) {
                output.encodeStringElement(serialDesc, 1, self.email_category);
            }
            if (!Intrinsics.areEqual(self.test_version, "")) {
                output.encodeStringElement(serialDesc, 2, self.test_version);
            }
            if (!Intrinsics.areEqual(self.uuid, "")) {
                output.encodeStringElement(serialDesc, 3, self.uuid);
            }
            if (!Intrinsics.areEqual(self.user_agent, "")) {
                output.encodeStringElement(serialDesc, 4, self.user_agent);
            }
            if (Intrinsics.areEqual(self.masked_email_address, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.masked_email_address);
        }

        public Surrogate(String email_address, String email_category, String test_version, String uuid, String user_agent, String masked_email_address) {
            Intrinsics.checkNotNullParameter(email_address, "email_address");
            Intrinsics.checkNotNullParameter(email_category, "email_category");
            Intrinsics.checkNotNullParameter(test_version, "test_version");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(user_agent, "user_agent");
            Intrinsics.checkNotNullParameter(masked_email_address, "masked_email_address");
            this.email_address = email_address;
            this.email_category = email_category;
            this.test_version = test_version;
            this.uuid = uuid;
            this.user_agent = user_agent;
            this.masked_email_address = masked_email_address;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
        }

        public final String getEmail_address() {
            return this.email_address;
        }

        public final String getEmail_category() {
            return this.email_category;
        }

        public final String getTest_version() {
            return this.test_version;
        }

        public final String getUuid() {
            return this.uuid;
        }

        public final String getUser_agent() {
            return this.user_agent;
        }

        public final String getMasked_email_address() {
            return this.masked_email_address;
        }
    }

    /* compiled from: EmailEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/EmailEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<EmailEventDataDto, EmailEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EmailEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EmailEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EmailEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) EmailEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EmailEventData> getProtoAdapter() {
            return EmailEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EmailEventDataDto getZeroValue() {
            return EmailEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EmailEventDataDto fromProto(EmailEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new EmailEventDataDto(new Surrogate(proto.getEmail_address(), proto.getEmail_category(), proto.getTest_version(), proto.getUuid(), proto.getUser_agent(), proto.getMasked_email_address()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EmailEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmailEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new EmailEventDataDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EmailEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<EmailEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.EmailEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EmailEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EmailEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EmailEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EmailEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EmailEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.EmailEventDataDto";
        }
    }
}
