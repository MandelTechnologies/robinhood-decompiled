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
import com.robinhood.rosetta.eventlogging.CatpayClient;
import com.robinhood.rosetta.eventlogging.CatpayClientDto;
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

/* compiled from: CatpayClientDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006$%&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000eJ$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayClientDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayClient;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$Surrogate;)V", "user_agent", "", "platform", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientPlatformDto;", "viewport", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientViewportDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientPlatformDto;Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientViewportDto;)V", "getUser_agent", "()Ljava/lang/String;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientPlatformDto;", "getViewport", "()Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientViewportDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "CatpayClientPlatformDto", "CatpayClientViewportDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CatpayClientDto implements Dto3<CatpayClient>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CatpayClientDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CatpayClientDto, CatpayClient>> binaryBase64Serializer$delegate;
    private static final CatpayClientDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CatpayClientDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CatpayClientDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getUser_agent() {
        return this.surrogate.getUser_agent();
    }

    public final CatpayClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final CatpayClientViewportDto getViewport() {
        return this.surrogate.getViewport();
    }

    public /* synthetic */ CatpayClientDto(String str, CatpayClientPlatformDto catpayClientPlatformDto, CatpayClientViewportDto catpayClientViewportDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CatpayClientPlatformDto.INSTANCE.getZeroValue() : catpayClientPlatformDto, (i & 4) != 0 ? CatpayClientViewportDto.INSTANCE.getZeroValue() : catpayClientViewportDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CatpayClientDto(String user_agent, CatpayClientPlatformDto platform, CatpayClientViewportDto viewport) {
        this(new Surrogate(user_agent, platform, viewport));
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
    }

    public static /* synthetic */ CatpayClientDto copy$default(CatpayClientDto catpayClientDto, String str, CatpayClientPlatformDto catpayClientPlatformDto, CatpayClientViewportDto catpayClientViewportDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = catpayClientDto.surrogate.getUser_agent();
        }
        if ((i & 2) != 0) {
            catpayClientPlatformDto = catpayClientDto.surrogate.getPlatform();
        }
        if ((i & 4) != 0) {
            catpayClientViewportDto = catpayClientDto.surrogate.getViewport();
        }
        return catpayClientDto.copy(str, catpayClientPlatformDto, catpayClientViewportDto);
    }

    public final CatpayClientDto copy(String user_agent, CatpayClientPlatformDto platform, CatpayClientViewportDto viewport) {
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        return new CatpayClientDto(new Surrogate(user_agent, platform, viewport));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CatpayClient toProto() {
        return new CatpayClient(this.surrogate.getUser_agent(), (CatpayClient.CatpayClientPlatform) this.surrogate.getPlatform().toProto(), (CatpayClient.CatpayClientViewport) this.surrogate.getViewport().toProto(), null, 8, null);
    }

    public String toString() {
        return "[CatpayClientDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CatpayClientDto) && Intrinsics.areEqual(((CatpayClientDto) other).surrogate, this.surrogate);
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
    /* compiled from: CatpayClientDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002*+B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J'\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$Surrogate;", "", "user_agent", "", "platform", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientPlatformDto;", "viewport", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientViewportDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientPlatformDto;Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientViewportDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientPlatformDto;Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientViewportDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUser_agent$annotations", "()V", "getUser_agent", "()Ljava/lang/String;", "getPlatform$annotations", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientPlatformDto;", "getViewport$annotations", "getViewport", "()Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientViewportDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CatpayClientPlatformDto platform;
        private final String user_agent;
        private final CatpayClientViewportDto viewport;

        public Surrogate() {
            this((String) null, (CatpayClientPlatformDto) null, (CatpayClientViewportDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, CatpayClientPlatformDto catpayClientPlatformDto, CatpayClientViewportDto catpayClientViewportDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.user_agent;
            }
            if ((i & 2) != 0) {
                catpayClientPlatformDto = surrogate.platform;
            }
            if ((i & 4) != 0) {
                catpayClientViewportDto = surrogate.viewport;
            }
            return surrogate.copy(str, catpayClientPlatformDto, catpayClientViewportDto);
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("userAgent")
        @JsonAnnotations2(names = {"user_agent"})
        public static /* synthetic */ void getUser_agent$annotations() {
        }

        @SerialName("viewport")
        @JsonAnnotations2(names = {"viewport"})
        public static /* synthetic */ void getViewport$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getUser_agent() {
            return this.user_agent;
        }

        /* renamed from: component2, reason: from getter */
        public final CatpayClientPlatformDto getPlatform() {
            return this.platform;
        }

        /* renamed from: component3, reason: from getter */
        public final CatpayClientViewportDto getViewport() {
            return this.viewport;
        }

        public final Surrogate copy(String user_agent, CatpayClientPlatformDto platform, CatpayClientViewportDto viewport) {
            Intrinsics.checkNotNullParameter(user_agent, "user_agent");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(viewport, "viewport");
            return new Surrogate(user_agent, platform, viewport);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.user_agent, surrogate.user_agent) && this.platform == surrogate.platform && this.viewport == surrogate.viewport;
        }

        public int hashCode() {
            return (((this.user_agent.hashCode() * 31) + this.platform.hashCode()) * 31) + this.viewport.hashCode();
        }

        public String toString() {
            return "Surrogate(user_agent=" + this.user_agent + ", platform=" + this.platform + ", viewport=" + this.viewport + ")";
        }

        /* compiled from: CatpayClientDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CatpayClientDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, CatpayClientPlatformDto catpayClientPlatformDto, CatpayClientViewportDto catpayClientViewportDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.user_agent = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.platform = CatpayClientPlatformDto.INSTANCE.getZeroValue();
            } else {
                this.platform = catpayClientPlatformDto;
            }
            if ((i & 4) == 0) {
                this.viewport = CatpayClientViewportDto.INSTANCE.getZeroValue();
            } else {
                this.viewport = catpayClientViewportDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.user_agent, "")) {
                output.encodeStringElement(serialDesc, 0, self.user_agent);
            }
            if (self.platform != CatpayClientPlatformDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, CatpayClientPlatformDto.Serializer.INSTANCE, self.platform);
            }
            if (self.viewport != CatpayClientViewportDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, CatpayClientViewportDto.Serializer.INSTANCE, self.viewport);
            }
        }

        public Surrogate(String user_agent, CatpayClientPlatformDto platform, CatpayClientViewportDto viewport) {
            Intrinsics.checkNotNullParameter(user_agent, "user_agent");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(viewport, "viewport");
            this.user_agent = user_agent;
            this.platform = platform;
            this.viewport = viewport;
        }

        public final String getUser_agent() {
            return this.user_agent;
        }

        public /* synthetic */ Surrogate(String str, CatpayClientPlatformDto catpayClientPlatformDto, CatpayClientViewportDto catpayClientViewportDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CatpayClientPlatformDto.INSTANCE.getZeroValue() : catpayClientPlatformDto, (i & 4) != 0 ? CatpayClientViewportDto.INSTANCE.getZeroValue() : catpayClientViewportDto);
        }

        public final CatpayClientPlatformDto getPlatform() {
            return this.platform;
        }

        public final CatpayClientViewportDto getViewport() {
            return this.viewport;
        }
    }

    /* compiled from: CatpayClientDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayClient;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CatpayClientDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CatpayClientDto, CatpayClient> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CatpayClientDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CatpayClientDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CatpayClientDto> getBinaryBase64Serializer() {
            return (KSerializer) CatpayClientDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CatpayClient> getProtoAdapter() {
            return CatpayClient.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CatpayClientDto getZeroValue() {
            return CatpayClientDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CatpayClientDto fromProto(CatpayClient proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CatpayClientDto(new Surrogate(proto.getUser_agent(), CatpayClientPlatformDto.INSTANCE.fromProto(proto.getPlatform()), CatpayClientViewportDto.INSTANCE.fromProto(proto.getViewport())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CatpayClientDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CatpayClientDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CatpayClientDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatpayClientDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientPlatformDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientPlatform;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CATPAY_CLIENT_PLATFORM_UNSPECIFIED", "IOS_WEBVIEW", "ANDROID_WEBVIEW", "WEB", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CatpayClientPlatformDto implements Dto2<CatpayClient.CatpayClientPlatform>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CatpayClientPlatformDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CatpayClientPlatformDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CatpayClientPlatformDto, CatpayClient.CatpayClientPlatform>> binaryBase64Serializer$delegate;
        public static final CatpayClientPlatformDto CATPAY_CLIENT_PLATFORM_UNSPECIFIED = new CATPAY_CLIENT_PLATFORM_UNSPECIFIED("CATPAY_CLIENT_PLATFORM_UNSPECIFIED", 0);
        public static final CatpayClientPlatformDto IOS_WEBVIEW = new IOS_WEBVIEW("IOS_WEBVIEW", 1);
        public static final CatpayClientPlatformDto ANDROID_WEBVIEW = new ANDROID_WEBVIEW("ANDROID_WEBVIEW", 2);
        public static final CatpayClientPlatformDto WEB = new WEB("WEB", 3);

        private static final /* synthetic */ CatpayClientPlatformDto[] $values() {
            return new CatpayClientPlatformDto[]{CATPAY_CLIENT_PLATFORM_UNSPECIFIED, IOS_WEBVIEW, ANDROID_WEBVIEW, WEB};
        }

        public /* synthetic */ CatpayClientPlatformDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CatpayClientPlatformDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CatpayClientPlatformDto(String str, int i) {
        }

        /* compiled from: CatpayClientDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayClientDto.CatpayClientPlatformDto.CATPAY_CLIENT_PLATFORM_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientPlatformDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientPlatform;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CATPAY_CLIENT_PLATFORM_UNSPECIFIED extends CatpayClientPlatformDto {
            CATPAY_CLIENT_PLATFORM_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayClient.CatpayClientPlatform toProto() {
                return CatpayClient.CatpayClientPlatform.CATPAY_CLIENT_PLATFORM_UNSPECIFIED;
            }
        }

        static {
            CatpayClientPlatformDto[] catpayClientPlatformDtoArr$values = $values();
            $VALUES = catpayClientPlatformDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(catpayClientPlatformDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CatpayClientDto$CatpayClientPlatformDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CatpayClientDto.CatpayClientPlatformDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CatpayClientDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayClientDto.CatpayClientPlatformDto.IOS_WEBVIEW", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientPlatformDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientPlatform;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IOS_WEBVIEW extends CatpayClientPlatformDto {
            IOS_WEBVIEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayClient.CatpayClientPlatform toProto() {
                return CatpayClient.CatpayClientPlatform.IOS_WEBVIEW;
            }
        }

        /* compiled from: CatpayClientDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayClientDto.CatpayClientPlatformDto.ANDROID_WEBVIEW", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientPlatformDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientPlatform;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ANDROID_WEBVIEW extends CatpayClientPlatformDto {
            ANDROID_WEBVIEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayClient.CatpayClientPlatform toProto() {
                return CatpayClient.CatpayClientPlatform.ANDROID_WEBVIEW;
            }
        }

        /* compiled from: CatpayClientDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayClientDto.CatpayClientPlatformDto.WEB", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientPlatformDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientPlatform;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WEB extends CatpayClientPlatformDto {
            WEB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayClient.CatpayClientPlatform toProto() {
                return CatpayClient.CatpayClientPlatform.WEB;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CatpayClientDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientPlatformDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientPlatformDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientPlatform;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientPlatformDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CatpayClientPlatformDto, CatpayClient.CatpayClientPlatform> {

            /* compiled from: CatpayClientDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CatpayClient.CatpayClientPlatform.values().length];
                    try {
                        iArr[CatpayClient.CatpayClientPlatform.CATPAY_CLIENT_PLATFORM_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CatpayClient.CatpayClientPlatform.IOS_WEBVIEW.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CatpayClient.CatpayClientPlatform.ANDROID_WEBVIEW.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CatpayClient.CatpayClientPlatform.WEB.ordinal()] = 4;
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

            public final KSerializer<CatpayClientPlatformDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CatpayClientPlatformDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CatpayClientPlatformDto> getBinaryBase64Serializer() {
                return (KSerializer) CatpayClientPlatformDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CatpayClient.CatpayClientPlatform> getProtoAdapter() {
                return CatpayClient.CatpayClientPlatform.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CatpayClientPlatformDto getZeroValue() {
                return CatpayClientPlatformDto.CATPAY_CLIENT_PLATFORM_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CatpayClientPlatformDto fromProto(CatpayClient.CatpayClientPlatform proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CatpayClientPlatformDto.CATPAY_CLIENT_PLATFORM_UNSPECIFIED;
                }
                if (i == 2) {
                    return CatpayClientPlatformDto.IOS_WEBVIEW;
                }
                if (i == 3) {
                    return CatpayClientPlatformDto.ANDROID_WEBVIEW;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return CatpayClientPlatformDto.WEB;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CatpayClientDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientPlatformDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientPlatformDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<CatpayClientPlatformDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CatpayClientPlatformDto, CatpayClient.CatpayClientPlatform> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CatpayClient.CatpayClientPlatform", CatpayClientPlatformDto.getEntries(), CatpayClientPlatformDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CatpayClientPlatformDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CatpayClientPlatformDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CatpayClientPlatformDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CatpayClientPlatformDto valueOf(String str) {
            return (CatpayClientPlatformDto) Enum.valueOf(CatpayClientPlatformDto.class, str);
        }

        public static CatpayClientPlatformDto[] values() {
            return (CatpayClientPlatformDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatpayClientDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientViewportDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientViewport;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CATPAY_CLIENT_VIEW_UNSPECIFIED", "DESKTOP", "MOBILE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CatpayClientViewportDto implements Dto2<CatpayClient.CatpayClientViewport>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CatpayClientViewportDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CatpayClientViewportDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CatpayClientViewportDto, CatpayClient.CatpayClientViewport>> binaryBase64Serializer$delegate;
        public static final CatpayClientViewportDto CATPAY_CLIENT_VIEW_UNSPECIFIED = new CATPAY_CLIENT_VIEW_UNSPECIFIED("CATPAY_CLIENT_VIEW_UNSPECIFIED", 0);
        public static final CatpayClientViewportDto DESKTOP = new DESKTOP("DESKTOP", 1);
        public static final CatpayClientViewportDto MOBILE = new MOBILE("MOBILE", 2);

        private static final /* synthetic */ CatpayClientViewportDto[] $values() {
            return new CatpayClientViewportDto[]{CATPAY_CLIENT_VIEW_UNSPECIFIED, DESKTOP, MOBILE};
        }

        public /* synthetic */ CatpayClientViewportDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CatpayClientViewportDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CatpayClientViewportDto(String str, int i) {
        }

        /* compiled from: CatpayClientDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayClientDto.CatpayClientViewportDto.CATPAY_CLIENT_VIEW_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientViewportDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientViewport;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CATPAY_CLIENT_VIEW_UNSPECIFIED extends CatpayClientViewportDto {
            CATPAY_CLIENT_VIEW_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayClient.CatpayClientViewport toProto() {
                return CatpayClient.CatpayClientViewport.CATPAY_CLIENT_VIEW_UNSPECIFIED;
            }
        }

        static {
            CatpayClientViewportDto[] catpayClientViewportDtoArr$values = $values();
            $VALUES = catpayClientViewportDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(catpayClientViewportDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CatpayClientDto$CatpayClientViewportDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CatpayClientDto.CatpayClientViewportDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CatpayClientDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayClientDto.CatpayClientViewportDto.DESKTOP", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientViewportDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientViewport;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DESKTOP extends CatpayClientViewportDto {
            DESKTOP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayClient.CatpayClientViewport toProto() {
                return CatpayClient.CatpayClientViewport.DESKTOP;
            }
        }

        /* compiled from: CatpayClientDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CatpayClientDto.CatpayClientViewportDto.MOBILE", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientViewportDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientViewport;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MOBILE extends CatpayClientViewportDto {
            MOBILE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CatpayClient.CatpayClientViewport toProto() {
                return CatpayClient.CatpayClientViewport.MOBILE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CatpayClientDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientViewportDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientViewportDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientViewport;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientViewportDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CatpayClientViewportDto, CatpayClient.CatpayClientViewport> {

            /* compiled from: CatpayClientDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CatpayClient.CatpayClientViewport.values().length];
                    try {
                        iArr[CatpayClient.CatpayClientViewport.CATPAY_CLIENT_VIEW_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CatpayClient.CatpayClientViewport.DESKTOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CatpayClient.CatpayClientViewport.MOBILE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CatpayClientViewportDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CatpayClientViewportDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CatpayClientViewportDto> getBinaryBase64Serializer() {
                return (KSerializer) CatpayClientViewportDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CatpayClient.CatpayClientViewport> getProtoAdapter() {
                return CatpayClient.CatpayClientViewport.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CatpayClientViewportDto getZeroValue() {
                return CatpayClientViewportDto.CATPAY_CLIENT_VIEW_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CatpayClientViewportDto fromProto(CatpayClient.CatpayClientViewport proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CatpayClientViewportDto.CATPAY_CLIENT_VIEW_UNSPECIFIED;
                }
                if (i == 2) {
                    return CatpayClientViewportDto.DESKTOP;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return CatpayClientViewportDto.MOBILE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CatpayClientDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientViewportDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$CatpayClientViewportDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<CatpayClientViewportDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CatpayClientViewportDto, CatpayClient.CatpayClientViewport> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CatpayClient.CatpayClientViewport", CatpayClientViewportDto.getEntries(), CatpayClientViewportDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CatpayClientViewportDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CatpayClientViewportDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CatpayClientViewportDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CatpayClientViewportDto valueOf(String str) {
            return (CatpayClientViewportDto) Enum.valueOf(CatpayClientViewportDto.class, str);
        }

        public static CatpayClientViewportDto[] values() {
            return (CatpayClientViewportDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CatpayClientDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CatpayClientDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CatpayClient", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CatpayClientDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CatpayClientDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CatpayClientDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CatpayClientDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayClientDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CatpayClientDto";
        }
    }
}
