package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.arsenal.proto.p281v1.idl.SessionTypeDto;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: SessionDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0013R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/Session;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/arsenal/proto/v1/idl/SessionDto$Surrogate;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/SessionDto$Surrogate;)V", "trading_date", "", "is_trading", "", "start_time", "end_time", "session_type", "Lcom/robinhood/arsenal/proto/v1/idl/SessionTypeDto;", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/SessionTypeDto;)V", "getTrading_date", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "getStart_time", "getEnd_time", "getSession_type", "()Lcom/robinhood/arsenal/proto/v1/idl/SessionTypeDto;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/SessionTypeDto;)Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
public final class SessionDto implements Dto3<Session>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SessionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SessionDto, Session>> binaryBase64Serializer$delegate;
    private static final SessionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SessionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SessionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTrading_date() {
        return this.surrogate.getTrading_date();
    }

    public final Boolean is_trading() {
        return this.surrogate.is_trading();
    }

    public final String getStart_time() {
        return this.surrogate.getStart_time();
    }

    public final String getEnd_time() {
        return this.surrogate.getEnd_time();
    }

    public final SessionTypeDto getSession_type() {
        return this.surrogate.getSession_type();
    }

    public /* synthetic */ SessionDto(String str, Boolean bool, String str2, String str3, SessionTypeDto sessionTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? SessionTypeDto.INSTANCE.getZeroValue() : sessionTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionDto(String trading_date, Boolean bool, String start_time, String end_time, SessionTypeDto session_type) {
        this(new Surrogate(trading_date, bool, start_time, end_time, session_type));
        Intrinsics.checkNotNullParameter(trading_date, "trading_date");
        Intrinsics.checkNotNullParameter(start_time, "start_time");
        Intrinsics.checkNotNullParameter(end_time, "end_time");
        Intrinsics.checkNotNullParameter(session_type, "session_type");
    }

    public static /* synthetic */ SessionDto copy$default(SessionDto sessionDto, String str, Boolean bool, String str2, String str3, SessionTypeDto sessionTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionDto.surrogate.getTrading_date();
        }
        if ((i & 2) != 0) {
            bool = sessionDto.surrogate.is_trading();
        }
        if ((i & 4) != 0) {
            str2 = sessionDto.surrogate.getStart_time();
        }
        if ((i & 8) != 0) {
            str3 = sessionDto.surrogate.getEnd_time();
        }
        if ((i & 16) != 0) {
            sessionTypeDto = sessionDto.surrogate.getSession_type();
        }
        SessionTypeDto sessionTypeDto2 = sessionTypeDto;
        String str4 = str2;
        return sessionDto.copy(str, bool, str4, str3, sessionTypeDto2);
    }

    public final SessionDto copy(String trading_date, Boolean is_trading, String start_time, String end_time, SessionTypeDto session_type) {
        Intrinsics.checkNotNullParameter(trading_date, "trading_date");
        Intrinsics.checkNotNullParameter(start_time, "start_time");
        Intrinsics.checkNotNullParameter(end_time, "end_time");
        Intrinsics.checkNotNullParameter(session_type, "session_type");
        return new SessionDto(new Surrogate(trading_date, is_trading, start_time, end_time, session_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Session toProto() {
        return new Session(this.surrogate.getTrading_date(), this.surrogate.is_trading(), this.surrogate.getStart_time(), this.surrogate.getEnd_time(), (SessionType) this.surrogate.getSession_type().toProto(), null, 32, null);
    }

    public String toString() {
        return "[SessionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SessionDto) && Intrinsics.areEqual(((SessionDto) other).surrogate, this.surrogate);
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
    /* compiled from: SessionDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 32\u00020\u0001:\u000223B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003JB\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\rHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J%\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0017\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0004\u0010\u0016R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001e¨\u00064"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/SessionDto$Surrogate;", "", "trading_date", "", "is_trading", "", "start_time", "end_time", "session_type", "Lcom/robinhood/arsenal/proto/v1/idl/SessionTypeDto;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/SessionTypeDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/SessionTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTrading_date$annotations", "()V", "getTrading_date", "()Ljava/lang/String;", "is_trading$annotations", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStart_time$annotations", "getStart_time", "getEnd_time$annotations", "getEnd_time", "getSession_type$annotations", "getSession_type", "()Lcom/robinhood/arsenal/proto/v1/idl/SessionTypeDto;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/SessionTypeDto;)Lcom/robinhood/arsenal/proto/v1/idl/SessionDto$Surrogate;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$arsenal_v1_public_externalRelease", "$serializer", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String end_time;
        private final Boolean is_trading;
        private final SessionTypeDto session_type;
        private final String start_time;
        private final String trading_date;

        public Surrogate() {
            this((String) null, (Boolean) null, (String) null, (String) null, (SessionTypeDto) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, Boolean bool, String str2, String str3, SessionTypeDto sessionTypeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.trading_date;
            }
            if ((i & 2) != 0) {
                bool = surrogate.is_trading;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.start_time;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.end_time;
            }
            if ((i & 16) != 0) {
                sessionTypeDto = surrogate.session_type;
            }
            SessionTypeDto sessionTypeDto2 = sessionTypeDto;
            String str4 = str2;
            return surrogate.copy(str, bool, str4, str3, sessionTypeDto2);
        }

        @SerialName("endTime")
        @JsonAnnotations2(names = {"end_time"})
        public static /* synthetic */ void getEnd_time$annotations() {
        }

        @SerialName("sessionType")
        @JsonAnnotations2(names = {"session_type"})
        public static /* synthetic */ void getSession_type$annotations() {
        }

        @SerialName("startTime")
        @JsonAnnotations2(names = {"start_time"})
        public static /* synthetic */ void getStart_time$annotations() {
        }

        @SerialName("tradingDate")
        @JsonAnnotations2(names = {"trading_date"})
        public static /* synthetic */ void getTrading_date$annotations() {
        }

        @SerialName("isTrading")
        @JsonAnnotations2(names = {"is_trading"})
        public static /* synthetic */ void is_trading$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTrading_date() {
            return this.trading_date;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIs_trading() {
            return this.is_trading;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStart_time() {
            return this.start_time;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEnd_time() {
            return this.end_time;
        }

        /* renamed from: component5, reason: from getter */
        public final SessionTypeDto getSession_type() {
            return this.session_type;
        }

        public final Surrogate copy(String trading_date, Boolean is_trading, String start_time, String end_time, SessionTypeDto session_type) {
            Intrinsics.checkNotNullParameter(trading_date, "trading_date");
            Intrinsics.checkNotNullParameter(start_time, "start_time");
            Intrinsics.checkNotNullParameter(end_time, "end_time");
            Intrinsics.checkNotNullParameter(session_type, "session_type");
            return new Surrogate(trading_date, is_trading, start_time, end_time, session_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.trading_date, surrogate.trading_date) && Intrinsics.areEqual(this.is_trading, surrogate.is_trading) && Intrinsics.areEqual(this.start_time, surrogate.start_time) && Intrinsics.areEqual(this.end_time, surrogate.end_time) && this.session_type == surrogate.session_type;
        }

        public int hashCode() {
            int iHashCode = this.trading_date.hashCode() * 31;
            Boolean bool = this.is_trading;
            return ((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.start_time.hashCode()) * 31) + this.end_time.hashCode()) * 31) + this.session_type.hashCode();
        }

        public String toString() {
            return "Surrogate(trading_date=" + this.trading_date + ", is_trading=" + this.is_trading + ", start_time=" + this.start_time + ", end_time=" + this.end_time + ", session_type=" + this.session_type + ")";
        }

        /* compiled from: SessionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/SessionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/SessionDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SessionDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, Boolean bool, String str2, String str3, SessionTypeDto sessionTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.trading_date = "";
            } else {
                this.trading_date = str;
            }
            if ((i & 2) == 0) {
                this.is_trading = null;
            } else {
                this.is_trading = bool;
            }
            if ((i & 4) == 0) {
                this.start_time = "";
            } else {
                this.start_time = str2;
            }
            if ((i & 8) == 0) {
                this.end_time = "";
            } else {
                this.end_time = str3;
            }
            if ((i & 16) == 0) {
                this.session_type = SessionTypeDto.INSTANCE.getZeroValue();
            } else {
                this.session_type = sessionTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.trading_date, "")) {
                output.encodeStringElement(serialDesc, 0, self.trading_date);
            }
            Boolean bool = self.is_trading;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, bool);
            }
            if (!Intrinsics.areEqual(self.start_time, "")) {
                output.encodeStringElement(serialDesc, 2, self.start_time);
            }
            if (!Intrinsics.areEqual(self.end_time, "")) {
                output.encodeStringElement(serialDesc, 3, self.end_time);
            }
            if (self.session_type != SessionTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, SessionTypeDto.Serializer.INSTANCE, self.session_type);
            }
        }

        public Surrogate(String trading_date, Boolean bool, String start_time, String end_time, SessionTypeDto session_type) {
            Intrinsics.checkNotNullParameter(trading_date, "trading_date");
            Intrinsics.checkNotNullParameter(start_time, "start_time");
            Intrinsics.checkNotNullParameter(end_time, "end_time");
            Intrinsics.checkNotNullParameter(session_type, "session_type");
            this.trading_date = trading_date;
            this.is_trading = bool;
            this.start_time = start_time;
            this.end_time = end_time;
            this.session_type = session_type;
        }

        public /* synthetic */ Surrogate(String str, Boolean bool, String str2, String str3, SessionTypeDto sessionTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? SessionTypeDto.INSTANCE.getZeroValue() : sessionTypeDto);
        }

        public final String getTrading_date() {
            return this.trading_date;
        }

        public final Boolean is_trading() {
            return this.is_trading;
        }

        public final String getStart_time() {
            return this.start_time;
        }

        public final String getEnd_time() {
            return this.end_time;
        }

        public final SessionTypeDto getSession_type() {
            return this.session_type;
        }
    }

    /* compiled from: SessionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/SessionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;", "Lcom/robinhood/arsenal/proto/v1/idl/Session;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<SessionDto, Session> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SessionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SessionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SessionDto> getBinaryBase64Serializer() {
            return (KSerializer) SessionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Session> getProtoAdapter() {
            return Session.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SessionDto getZeroValue() {
            return SessionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SessionDto fromProto(Session proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new SessionDto(new Surrogate(proto.getTrading_date(), proto.getIs_trading(), proto.getStart_time(), proto.getEnd_time(), SessionTypeDto.INSTANCE.fromProto(proto.getSession_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.SessionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SessionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SessionDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SessionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/SessionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/SessionDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/SessionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SessionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.Session", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SessionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SessionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SessionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SessionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/SessionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.SessionDto";
        }
    }
}
