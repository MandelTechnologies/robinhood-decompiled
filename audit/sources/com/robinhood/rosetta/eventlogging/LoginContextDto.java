package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.ArkoseLabEnforcementEventDto;
import com.robinhood.rosetta.eventlogging.BooleanDto;
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

/* compiled from: LoginContextDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004!\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LoginContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/LoginContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/LoginContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/LoginContextDto$Surrogate;)V", "arkose_lab_enforcement_event", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabEnforcementEventDto;", "saved_password", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "(Lcom/robinhood/rosetta/eventlogging/ArkoseLabEnforcementEventDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "getArkose_lab_enforcement_event", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabEnforcementEventDto;", "getSaved_password", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class LoginContextDto implements Dto3<LoginContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<LoginContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LoginContextDto, LoginContext>> binaryBase64Serializer$delegate;
    private static final LoginContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ LoginContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LoginContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ArkoseLabEnforcementEventDto getArkose_lab_enforcement_event() {
        return this.surrogate.getArkose_lab_enforcement_event();
    }

    public final BooleanDto getSaved_password() {
        return this.surrogate.getSaved_password();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginContextDto(ArkoseLabEnforcementEventDto arkoseLabEnforcementEventDto, BooleanDto saved_password) {
        this(new Surrogate(arkoseLabEnforcementEventDto, saved_password));
        Intrinsics.checkNotNullParameter(saved_password, "saved_password");
    }

    public /* synthetic */ LoginContextDto(ArkoseLabEnforcementEventDto arkoseLabEnforcementEventDto, BooleanDto booleanDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arkoseLabEnforcementEventDto, (i & 2) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto);
    }

    public static /* synthetic */ LoginContextDto copy$default(LoginContextDto loginContextDto, ArkoseLabEnforcementEventDto arkoseLabEnforcementEventDto, BooleanDto booleanDto, int i, Object obj) {
        if ((i & 1) != 0) {
            arkoseLabEnforcementEventDto = loginContextDto.surrogate.getArkose_lab_enforcement_event();
        }
        if ((i & 2) != 0) {
            booleanDto = loginContextDto.surrogate.getSaved_password();
        }
        return loginContextDto.copy(arkoseLabEnforcementEventDto, booleanDto);
    }

    public final LoginContextDto copy(ArkoseLabEnforcementEventDto arkose_lab_enforcement_event, BooleanDto saved_password) {
        Intrinsics.checkNotNullParameter(saved_password, "saved_password");
        return new LoginContextDto(new Surrogate(arkose_lab_enforcement_event, saved_password));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public LoginContext toProto() {
        ArkoseLabEnforcementEventDto arkose_lab_enforcement_event = this.surrogate.getArkose_lab_enforcement_event();
        return new LoginContext(arkose_lab_enforcement_event != null ? arkose_lab_enforcement_event.toProto() : null, (Boolean) this.surrogate.getSaved_password().toProto(), null, 4, null);
    }

    public String toString() {
        return "[LoginContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof LoginContextDto) && Intrinsics.areEqual(((LoginContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: LoginContextDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002%&B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LoginContextDto$Surrogate;", "", "arkose_lab_enforcement_event", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabEnforcementEventDto;", "saved_password", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ArkoseLabEnforcementEventDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/ArkoseLabEnforcementEventDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getArkose_lab_enforcement_event$annotations", "()V", "getArkose_lab_enforcement_event", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabEnforcementEventDto;", "getSaved_password$annotations", "getSaved_password", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ArkoseLabEnforcementEventDto arkose_lab_enforcement_event;
        private final BooleanDto saved_password;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((ArkoseLabEnforcementEventDto) null, (BooleanDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ArkoseLabEnforcementEventDto arkoseLabEnforcementEventDto, BooleanDto booleanDto, int i, Object obj) {
            if ((i & 1) != 0) {
                arkoseLabEnforcementEventDto = surrogate.arkose_lab_enforcement_event;
            }
            if ((i & 2) != 0) {
                booleanDto = surrogate.saved_password;
            }
            return surrogate.copy(arkoseLabEnforcementEventDto, booleanDto);
        }

        @SerialName("arkoseLabEnforcementEvent")
        @JsonAnnotations2(names = {"arkose_lab_enforcement_event"})
        public static /* synthetic */ void getArkose_lab_enforcement_event$annotations() {
        }

        @SerialName("savedPassword")
        @JsonAnnotations2(names = {"saved_password"})
        public static /* synthetic */ void getSaved_password$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ArkoseLabEnforcementEventDto getArkose_lab_enforcement_event() {
            return this.arkose_lab_enforcement_event;
        }

        /* renamed from: component2, reason: from getter */
        public final BooleanDto getSaved_password() {
            return this.saved_password;
        }

        public final Surrogate copy(ArkoseLabEnforcementEventDto arkose_lab_enforcement_event, BooleanDto saved_password) {
            Intrinsics.checkNotNullParameter(saved_password, "saved_password");
            return new Surrogate(arkose_lab_enforcement_event, saved_password);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.arkose_lab_enforcement_event, surrogate.arkose_lab_enforcement_event) && this.saved_password == surrogate.saved_password;
        }

        public int hashCode() {
            ArkoseLabEnforcementEventDto arkoseLabEnforcementEventDto = this.arkose_lab_enforcement_event;
            return ((arkoseLabEnforcementEventDto == null ? 0 : arkoseLabEnforcementEventDto.hashCode()) * 31) + this.saved_password.hashCode();
        }

        public String toString() {
            return "Surrogate(arkose_lab_enforcement_event=" + this.arkose_lab_enforcement_event + ", saved_password=" + this.saved_password + ")";
        }

        /* compiled from: LoginContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LoginContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/LoginContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return LoginContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ArkoseLabEnforcementEventDto arkoseLabEnforcementEventDto, BooleanDto booleanDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.arkose_lab_enforcement_event = (i & 1) == 0 ? null : arkoseLabEnforcementEventDto;
            if ((i & 2) == 0) {
                this.saved_password = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.saved_password = booleanDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ArkoseLabEnforcementEventDto arkoseLabEnforcementEventDto = self.arkose_lab_enforcement_event;
            if (arkoseLabEnforcementEventDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ArkoseLabEnforcementEventDto.Serializer.INSTANCE, arkoseLabEnforcementEventDto);
            }
            if (self.saved_password != BooleanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, BooleanDto.Serializer.INSTANCE, self.saved_password);
            }
        }

        public Surrogate(ArkoseLabEnforcementEventDto arkoseLabEnforcementEventDto, BooleanDto saved_password) {
            Intrinsics.checkNotNullParameter(saved_password, "saved_password");
            this.arkose_lab_enforcement_event = arkoseLabEnforcementEventDto;
            this.saved_password = saved_password;
        }

        public final ArkoseLabEnforcementEventDto getArkose_lab_enforcement_event() {
            return this.arkose_lab_enforcement_event;
        }

        public final BooleanDto getSaved_password() {
            return this.saved_password;
        }

        public /* synthetic */ Surrogate(ArkoseLabEnforcementEventDto arkoseLabEnforcementEventDto, BooleanDto booleanDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : arkoseLabEnforcementEventDto, (i & 2) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto);
        }
    }

    /* compiled from: LoginContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LoginContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/LoginContextDto;", "Lcom/robinhood/rosetta/eventlogging/LoginContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/LoginContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<LoginContextDto, LoginContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LoginContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LoginContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LoginContextDto> getBinaryBase64Serializer() {
            return (KSerializer) LoginContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<LoginContext> getProtoAdapter() {
            return LoginContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LoginContextDto getZeroValue() {
            return LoginContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LoginContextDto fromProto(LoginContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ArkoseLabEnforcementEvent arkose_lab_enforcement_event = proto.getArkose_lab_enforcement_event();
            return new LoginContextDto(new Surrogate(arkose_lab_enforcement_event != null ? ArkoseLabEnforcementEventDto.INSTANCE.fromProto(arkose_lab_enforcement_event) : null, BooleanDto.INSTANCE.fromProto(proto.getSaved_password())), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.LoginContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LoginContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new LoginContextDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LoginContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LoginContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/LoginContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/LoginContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<LoginContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.LoginContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LoginContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public LoginContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new LoginContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: LoginContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LoginContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.LoginContextDto";
        }
    }
}
