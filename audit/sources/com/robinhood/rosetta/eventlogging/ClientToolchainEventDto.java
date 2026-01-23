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
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.ClientPlatformDto;
import com.robinhood.rosetta.eventlogging.ClientToolchainEvent;
import com.robinhood.rosetta.eventlogging.ClientToolchainEventDto;
import com.robinhood.rosetta.eventlogging.EnvironmentDto;
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
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: ClientToolchainEventDto.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006@?ABCDB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bm\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0006\u0010\u001aJq\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0016H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0016H\u0016¢\u0006\u0004\b.\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b8\u0010 R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010\u0015\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b;\u0010 R\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b<\u0010'R\u0011\u0010\u0019\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006E"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "environment", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto;", "location", "", "name", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto;", "result", ErrorBundle.DETAIL_ENTRY, "", "count", "", "magnitude", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto;Ljava/lang/String;IF)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto;Ljava/lang/String;IF)Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getTimestamp", "()Lj$/time/Instant;", "getEnvironment", "()Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "getLocation", "()Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto;", "getName", "getResult", "()Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto;", "getDetails", "getCount", "getMagnitude", "()F", "Companion", "Surrogate", "ToolchainEventResultDto", "ToolchainEventLocationDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientToolchainEventDto implements Dto3<ClientToolchainEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientToolchainEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientToolchainEventDto, ClientToolchainEvent>> binaryBase64Serializer$delegate;
    private static final ClientToolchainEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientToolchainEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientToolchainEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final EnvironmentDto getEnvironment() {
        return this.surrogate.getEnvironment();
    }

    public final ToolchainEventLocationDto getLocation() {
        return this.surrogate.getLocation();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final ToolchainEventResultDto getResult() {
        return this.surrogate.getResult();
    }

    public final String getDetails() {
        return this.surrogate.getDetails();
    }

    public final int getCount() {
        return this.surrogate.getCount();
    }

    public final float getMagnitude() {
        return this.surrogate.getMagnitude();
    }

    public /* synthetic */ ClientToolchainEventDto(ClientPlatformDto clientPlatformDto, Instant instant, EnvironmentDto environmentDto, ToolchainEventLocationDto toolchainEventLocationDto, String str, ToolchainEventResultDto toolchainEventResultDto, String str2, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i2 & 2) != 0 ? null : instant, (i2 & 4) != 0 ? null : environmentDto, (i2 & 8) != 0 ? ToolchainEventLocationDto.INSTANCE.getZeroValue() : toolchainEventLocationDto, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? ToolchainEventResultDto.INSTANCE.getZeroValue() : toolchainEventResultDto, (i2 & 64) != 0 ? "" : str2, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? 0.0f : f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientToolchainEventDto(ClientPlatformDto platform, Instant instant, EnvironmentDto environmentDto, ToolchainEventLocationDto location, String name, ToolchainEventResultDto result, String details, int i, float f) {
        this(new Surrogate(platform, instant, environmentDto, location, name, result, details, i, f));
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(details, "details");
    }

    public static /* synthetic */ ClientToolchainEventDto copy$default(ClientToolchainEventDto clientToolchainEventDto, ClientPlatformDto clientPlatformDto, Instant instant, EnvironmentDto environmentDto, ToolchainEventLocationDto toolchainEventLocationDto, String str, ToolchainEventResultDto toolchainEventResultDto, String str2, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            clientPlatformDto = clientToolchainEventDto.surrogate.getPlatform();
        }
        if ((i2 & 2) != 0) {
            instant = clientToolchainEventDto.surrogate.getTimestamp();
        }
        if ((i2 & 4) != 0) {
            environmentDto = clientToolchainEventDto.surrogate.getEnvironment();
        }
        if ((i2 & 8) != 0) {
            toolchainEventLocationDto = clientToolchainEventDto.surrogate.getLocation();
        }
        if ((i2 & 16) != 0) {
            str = clientToolchainEventDto.surrogate.getName();
        }
        if ((i2 & 32) != 0) {
            toolchainEventResultDto = clientToolchainEventDto.surrogate.getResult();
        }
        if ((i2 & 64) != 0) {
            str2 = clientToolchainEventDto.surrogate.getDetails();
        }
        if ((i2 & 128) != 0) {
            i = clientToolchainEventDto.surrogate.getCount();
        }
        if ((i2 & 256) != 0) {
            f = clientToolchainEventDto.surrogate.getMagnitude();
        }
        int i3 = i;
        float f2 = f;
        ToolchainEventResultDto toolchainEventResultDto2 = toolchainEventResultDto;
        String str3 = str2;
        String str4 = str;
        EnvironmentDto environmentDto2 = environmentDto;
        return clientToolchainEventDto.copy(clientPlatformDto, instant, environmentDto2, toolchainEventLocationDto, str4, toolchainEventResultDto2, str3, i3, f2);
    }

    public final ClientToolchainEventDto copy(ClientPlatformDto platform, Instant timestamp, EnvironmentDto environment, ToolchainEventLocationDto location, String name, ToolchainEventResultDto result, String details, int count, float magnitude) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(details, "details");
        return new ClientToolchainEventDto(new Surrogate(platform, timestamp, environment, location, name, result, details, count, magnitude));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientToolchainEvent toProto() {
        ClientPlatform clientPlatform = (ClientPlatform) this.surrogate.getPlatform().toProto();
        Instant timestamp = this.surrogate.getTimestamp();
        EnvironmentDto environment = this.surrogate.getEnvironment();
        return new ClientToolchainEvent(clientPlatform, timestamp, environment != null ? environment.toProto() : null, (ClientToolchainEvent.ToolchainEventLocation) this.surrogate.getLocation().toProto(), this.surrogate.getName(), (ClientToolchainEvent.ToolchainEventResult) this.surrogate.getResult().toProto(), this.surrogate.getDetails(), this.surrogate.getCount(), this.surrogate.getMagnitude(), null, 512, null);
    }

    public String toString() {
        return "[ClientToolchainEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientToolchainEventDto) && Intrinsics.areEqual(((ClientToolchainEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientToolchainEventDto.kt */
    @Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b \b\u0083\b\u0018\u0000 \\2\u00020\u0001:\u0002]\\B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\u0017\b\u0002\u0010\u0015\u001a\u00110\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0014\u0012\u0017\b\u0002\u0010\u0018\u001a\u00110\u0016¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0017¢\u0006\u0004\b\u0019\u0010\u001aBq\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ'\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J6\u0010*\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b4\u00101J\u001f\u00105\u001a\u00110\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0014HÆ\u0003¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00110\u0016¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0017HÆ\u0003¢\u0006\u0004\b7\u00108J°\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\u0017\b\u0002\u0010\u0015\u001a\u00110\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00142\u0017\b\u0002\u0010\u0018\u001a\u00110\u0016¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0017HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b;\u00101J\u0010\u0010<\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b<\u00106J\u001a\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010A\u0012\u0004\bC\u0010D\u001a\u0004\bB\u0010)RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010E\u0012\u0004\bG\u0010D\u001a\u0004\bF\u0010+R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010H\u0012\u0004\bJ\u0010D\u001a\u0004\bI\u0010-R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010K\u0012\u0004\bM\u0010D\u001a\u0004\bL\u0010/R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010N\u0012\u0004\bP\u0010D\u001a\u0004\bO\u00101R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010Q\u0012\u0004\bS\u0010D\u001a\u0004\bR\u00103R \u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010N\u0012\u0004\bU\u0010D\u001a\u0004\bT\u00101R/\u0010\u0015\u001a\u00110\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010V\u0012\u0004\bX\u0010D\u001a\u0004\bW\u00106R/\u0010\u0018\u001a\u00110\u0016¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010Y\u0012\u0004\b[\u0010D\u001a\u0004\bZ\u00108¨\u0006^"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "environment", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto;", "location", "", "name", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto;", "result", ErrorBundle.DETAIL_ENTRY, "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "count", "", "Lcom/robinhood/idl/serialization/FloatSerializer;", "magnitude", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto;Ljava/lang/String;IF)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto;Ljava/lang/String;IFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Lj$/time/Instant;", "component3", "()Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "component4", "()Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto;", "component5", "()Ljava/lang/String;", "component6", "()Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto;", "component7", "component8", "()I", "component9", "()F", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto;Ljava/lang/String;IF)Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$Surrogate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "getEnvironment", "getEnvironment$annotations", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto;", "getLocation", "getLocation$annotations", "Ljava/lang/String;", "getName", "getName$annotations", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto;", "getResult", "getResult$annotations", "getDetails", "getDetails$annotations", "I", "getCount", "getCount$annotations", "F", "getMagnitude", "getMagnitude$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int count;
        private final String details;
        private final EnvironmentDto environment;
        private final ToolchainEventLocationDto location;
        private final float magnitude;
        private final String name;
        private final ClientPlatformDto platform;
        private final ToolchainEventResultDto result;
        private final Instant timestamp;

        public Surrogate() {
            this((ClientPlatformDto) null, (Instant) null, (EnvironmentDto) null, (ToolchainEventLocationDto) null, (String) null, (ToolchainEventResultDto) null, (String) null, 0, 0.0f, 511, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ClientPlatformDto clientPlatformDto, Instant instant, EnvironmentDto environmentDto, ToolchainEventLocationDto toolchainEventLocationDto, String str, ToolchainEventResultDto toolchainEventResultDto, String str2, int i, float f, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                clientPlatformDto = surrogate.platform;
            }
            if ((i2 & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i2 & 4) != 0) {
                environmentDto = surrogate.environment;
            }
            if ((i2 & 8) != 0) {
                toolchainEventLocationDto = surrogate.location;
            }
            if ((i2 & 16) != 0) {
                str = surrogate.name;
            }
            if ((i2 & 32) != 0) {
                toolchainEventResultDto = surrogate.result;
            }
            if ((i2 & 64) != 0) {
                str2 = surrogate.details;
            }
            if ((i2 & 128) != 0) {
                i = surrogate.count;
            }
            if ((i2 & 256) != 0) {
                f = surrogate.magnitude;
            }
            int i3 = i;
            float f2 = f;
            ToolchainEventResultDto toolchainEventResultDto2 = toolchainEventResultDto;
            String str3 = str2;
            String str4 = str;
            EnvironmentDto environmentDto2 = environmentDto;
            return surrogate.copy(clientPlatformDto, instant, environmentDto2, toolchainEventLocationDto, str4, toolchainEventResultDto2, str3, i3, f2);
        }

        @SerialName("count")
        @JsonAnnotations2(names = {"count"})
        public static /* synthetic */ void getCount$annotations() {
        }

        @SerialName(ErrorBundle.DETAIL_ENTRY)
        @JsonAnnotations2(names = {ErrorBundle.DETAIL_ENTRY})
        public static /* synthetic */ void getDetails$annotations() {
        }

        @SerialName("environment")
        @JsonAnnotations2(names = {"environment"})
        public static /* synthetic */ void getEnvironment$annotations() {
        }

        @SerialName("location")
        @JsonAnnotations2(names = {"location"})
        public static /* synthetic */ void getLocation$annotations() {
        }

        @SerialName("magnitude")
        @JsonAnnotations2(names = {"magnitude"})
        public static /* synthetic */ void getMagnitude$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("result")
        @JsonAnnotations2(names = {"result"})
        public static /* synthetic */ void getResult$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final EnvironmentDto getEnvironment() {
            return this.environment;
        }

        /* renamed from: component4, reason: from getter */
        public final ToolchainEventLocationDto getLocation() {
            return this.location;
        }

        /* renamed from: component5, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component6, reason: from getter */
        public final ToolchainEventResultDto getResult() {
            return this.result;
        }

        /* renamed from: component7, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        /* renamed from: component8, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* renamed from: component9, reason: from getter */
        public final float getMagnitude() {
            return this.magnitude;
        }

        public final Surrogate copy(ClientPlatformDto platform, Instant timestamp, EnvironmentDto environment, ToolchainEventLocationDto location, String name, ToolchainEventResultDto result, String details, int count, float magnitude) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(details, "details");
            return new Surrogate(platform, timestamp, environment, location, name, result, details, count, magnitude);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.environment, surrogate.environment) && this.location == surrogate.location && Intrinsics.areEqual(this.name, surrogate.name) && this.result == surrogate.result && Intrinsics.areEqual(this.details, surrogate.details) && this.count == surrogate.count && Float.compare(this.magnitude, surrogate.magnitude) == 0;
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            Instant instant = this.timestamp;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            EnvironmentDto environmentDto = this.environment;
            return ((((((((((((iHashCode2 + (environmentDto != null ? environmentDto.hashCode() : 0)) * 31) + this.location.hashCode()) * 31) + this.name.hashCode()) * 31) + this.result.hashCode()) * 31) + this.details.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + Float.hashCode(this.magnitude);
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", timestamp=" + this.timestamp + ", environment=" + this.environment + ", location=" + this.location + ", name=" + this.name + ", result=" + this.result + ", details=" + this.details + ", count=" + this.count + ", magnitude=" + this.magnitude + ")";
        }

        /* compiled from: ClientToolchainEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientToolchainEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, Instant instant, EnvironmentDto environmentDto, ToolchainEventLocationDto toolchainEventLocationDto, String str, ToolchainEventResultDto toolchainEventResultDto, String str2, int i2, float f, SerializationConstructorMarker serializationConstructorMarker) {
            this.platform = (i & 1) == 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto;
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.environment = null;
            } else {
                this.environment = environmentDto;
            }
            if ((i & 8) == 0) {
                this.location = ToolchainEventLocationDto.INSTANCE.getZeroValue();
            } else {
                this.location = toolchainEventLocationDto;
            }
            if ((i & 16) == 0) {
                this.name = "";
            } else {
                this.name = str;
            }
            if ((i & 32) == 0) {
                this.result = ToolchainEventResultDto.INSTANCE.getZeroValue();
            } else {
                this.result = toolchainEventResultDto;
            }
            if ((i & 64) == 0) {
                this.details = "";
            } else {
                this.details = str2;
            }
            if ((i & 128) == 0) {
                this.count = 0;
            } else {
                this.count = i2;
            }
            if ((i & 256) == 0) {
                this.magnitude = 0.0f;
            } else {
                this.magnitude = f;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.platform != ClientPlatformDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, ClientPlatformDto.Serializer.INSTANCE, self.platform);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            EnvironmentDto environmentDto = self.environment;
            if (environmentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, EnvironmentDto.Serializer.INSTANCE, environmentDto);
            }
            if (self.location != ToolchainEventLocationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, ToolchainEventLocationDto.Serializer.INSTANCE, self.location);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 4, self.name);
            }
            if (self.result != ToolchainEventResultDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, ToolchainEventResultDto.Serializer.INSTANCE, self.result);
            }
            if (!Intrinsics.areEqual(self.details, "")) {
                output.encodeStringElement(serialDesc, 6, self.details);
            }
            int i = self.count;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 7, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (Float.compare(self.magnitude, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 8, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.magnitude));
            }
        }

        public Surrogate(ClientPlatformDto platform, Instant instant, EnvironmentDto environmentDto, ToolchainEventLocationDto location, String name, ToolchainEventResultDto result, String details, int i, float f) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(details, "details");
            this.platform = platform;
            this.timestamp = instant;
            this.environment = environmentDto;
            this.location = location;
            this.name = name;
            this.result = result;
            this.details = details;
            this.count = i;
            this.magnitude = f;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        public /* synthetic */ Surrogate(ClientPlatformDto clientPlatformDto, Instant instant, EnvironmentDto environmentDto, ToolchainEventLocationDto toolchainEventLocationDto, String str, ToolchainEventResultDto toolchainEventResultDto, String str2, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i2 & 2) != 0 ? null : instant, (i2 & 4) != 0 ? null : environmentDto, (i2 & 8) != 0 ? ToolchainEventLocationDto.INSTANCE.getZeroValue() : toolchainEventLocationDto, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? ToolchainEventResultDto.INSTANCE.getZeroValue() : toolchainEventResultDto, (i2 & 64) != 0 ? "" : str2, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? 0.0f : f);
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final EnvironmentDto getEnvironment() {
            return this.environment;
        }

        public final ToolchainEventLocationDto getLocation() {
            return this.location;
        }

        public final String getName() {
            return this.name;
        }

        public final ToolchainEventResultDto getResult() {
            return this.result;
        }

        public final String getDetails() {
            return this.details;
        }

        public final int getCount() {
            return this.count;
        }

        public final float getMagnitude() {
            return this.magnitude;
        }
    }

    /* compiled from: ClientToolchainEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ClientToolchainEventDto, ClientToolchainEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientToolchainEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientToolchainEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientToolchainEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientToolchainEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientToolchainEvent> getProtoAdapter() {
            return ClientToolchainEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientToolchainEventDto getZeroValue() {
            return ClientToolchainEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientToolchainEventDto fromProto(ClientToolchainEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ClientPlatformDto clientPlatformDtoFromProto = ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform());
            Instant timestamp = proto.getTimestamp();
            Environment environment = proto.getEnvironment();
            return new ClientToolchainEventDto(new Surrogate(clientPlatformDtoFromProto, timestamp, environment != null ? EnvironmentDto.INSTANCE.fromProto(environment) : null, ToolchainEventLocationDto.INSTANCE.fromProto(proto.getLocation()), proto.getName(), ToolchainEventResultDto.INSTANCE.fromProto(proto.getResult()), proto.getDetails(), proto.getCount(), proto.getMagnitude()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientToolchainEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientToolchainEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientToolchainEventDto(null, null, null, null, null, null, null, 0, 0.0f, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClientToolchainEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventResult;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "TOOLCHAIN_RESULT_UNSPECIFIED", "TOOLCHAIN_EVENT_SUCCESS", "TOOLCHAIN_EVENT_FAILURE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ToolchainEventResultDto implements Dto2<ClientToolchainEvent.ToolchainEventResult>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ToolchainEventResultDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ToolchainEventResultDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ToolchainEventResultDto, ClientToolchainEvent.ToolchainEventResult>> binaryBase64Serializer$delegate;
        private final String json_value;
        public static final ToolchainEventResultDto TOOLCHAIN_RESULT_UNSPECIFIED = new TOOLCHAIN_RESULT_UNSPECIFIED("TOOLCHAIN_RESULT_UNSPECIFIED", 0);
        public static final ToolchainEventResultDto TOOLCHAIN_EVENT_SUCCESS = new TOOLCHAIN_EVENT_SUCCESS("TOOLCHAIN_EVENT_SUCCESS", 1);
        public static final ToolchainEventResultDto TOOLCHAIN_EVENT_FAILURE = new TOOLCHAIN_EVENT_FAILURE("TOOLCHAIN_EVENT_FAILURE", 2);

        private static final /* synthetic */ ToolchainEventResultDto[] $values() {
            return new ToolchainEventResultDto[]{TOOLCHAIN_RESULT_UNSPECIFIED, TOOLCHAIN_EVENT_SUCCESS, TOOLCHAIN_EVENT_FAILURE};
        }

        public /* synthetic */ ToolchainEventResultDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2);
        }

        public static EnumEntries<ToolchainEventResultDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ToolchainEventResultDto(String str, int i, String str2) {
            this.json_value = str2;
        }

        public final String getJson_value() {
            return this.json_value;
        }

        /* compiled from: ClientToolchainEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ClientToolchainEventDto.ToolchainEventResultDto.TOOLCHAIN_RESULT_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventResult;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOOLCHAIN_RESULT_UNSPECIFIED extends ToolchainEventResultDto {
            TOOLCHAIN_RESULT_UNSPECIFIED(String str, int i) {
                super(str, i, "", null);
            }

            @Override // com.robinhood.idl.Dto
            public ClientToolchainEvent.ToolchainEventResult toProto() {
                return ClientToolchainEvent.ToolchainEventResult.TOOLCHAIN_RESULT_UNSPECIFIED;
            }
        }

        static {
            ToolchainEventResultDto[] toolchainEventResultDtoArr$values = $values();
            $VALUES = toolchainEventResultDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(toolchainEventResultDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientToolchainEventDto$ToolchainEventResultDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ClientToolchainEventDto.ToolchainEventResultDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ClientToolchainEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ClientToolchainEventDto.ToolchainEventResultDto.TOOLCHAIN_EVENT_SUCCESS", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventResult;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOOLCHAIN_EVENT_SUCCESS extends ToolchainEventResultDto {
            TOOLCHAIN_EVENT_SUCCESS(String str, int i) {
                super(str, i, "toolchain_event_success", null);
            }

            @Override // com.robinhood.idl.Dto
            public ClientToolchainEvent.ToolchainEventResult toProto() {
                return ClientToolchainEvent.ToolchainEventResult.TOOLCHAIN_EVENT_SUCCESS;
            }
        }

        /* compiled from: ClientToolchainEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ClientToolchainEventDto.ToolchainEventResultDto.TOOLCHAIN_EVENT_FAILURE", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventResult;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOOLCHAIN_EVENT_FAILURE extends ToolchainEventResultDto {
            TOOLCHAIN_EVENT_FAILURE(String str, int i) {
                super(str, i, "toolchain_event_failure", null);
            }

            @Override // com.robinhood.idl.Dto
            public ClientToolchainEvent.ToolchainEventResult toProto() {
                return ClientToolchainEvent.ToolchainEventResult.TOOLCHAIN_EVENT_FAILURE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ClientToolchainEventDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto;", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventResult;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ToolchainEventResultDto, ClientToolchainEvent.ToolchainEventResult> {

            /* compiled from: ClientToolchainEventDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ClientToolchainEvent.ToolchainEventResult.values().length];
                    try {
                        iArr[ClientToolchainEvent.ToolchainEventResult.TOOLCHAIN_RESULT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ClientToolchainEvent.ToolchainEventResult.TOOLCHAIN_EVENT_SUCCESS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ClientToolchainEvent.ToolchainEventResult.TOOLCHAIN_EVENT_FAILURE.ordinal()] = 3;
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

            public final KSerializer<ToolchainEventResultDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ToolchainEventResultDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ToolchainEventResultDto> getBinaryBase64Serializer() {
                return (KSerializer) ToolchainEventResultDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ClientToolchainEvent.ToolchainEventResult> getProtoAdapter() {
                return ClientToolchainEvent.ToolchainEventResult.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ToolchainEventResultDto getZeroValue() {
                return ToolchainEventResultDto.TOOLCHAIN_RESULT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ToolchainEventResultDto fromProto(ClientToolchainEvent.ToolchainEventResult proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ToolchainEventResultDto.TOOLCHAIN_RESULT_UNSPECIFIED;
                }
                if (i == 2) {
                    return ToolchainEventResultDto.TOOLCHAIN_EVENT_SUCCESS;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return ToolchainEventResultDto.TOOLCHAIN_EVENT_FAILURE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ClientToolchainEventDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventResultDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ToolchainEventResultDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ToolchainEventResultDto, ClientToolchainEvent.ToolchainEventResult> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ClientToolchainEvent.ToolchainEventResult", ToolchainEventResultDto.getEntries(), ToolchainEventResultDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ToolchainEventResultDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ToolchainEventResultDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ToolchainEventResultDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ToolchainEventResultDto valueOf(String str) {
            return (ToolchainEventResultDto) Enum.valueOf(ToolchainEventResultDto.class, str);
        }

        public static ToolchainEventResultDto[] values() {
            return (ToolchainEventResultDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClientToolchainEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventLocation;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "DEFAULT_LOCATION", "LOCAL", "CI", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ToolchainEventLocationDto implements Dto2<ClientToolchainEvent.ToolchainEventLocation>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ToolchainEventLocationDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ToolchainEventLocationDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ToolchainEventLocationDto, ClientToolchainEvent.ToolchainEventLocation>> binaryBase64Serializer$delegate;
        private final String json_value;
        public static final ToolchainEventLocationDto DEFAULT_LOCATION = new DEFAULT_LOCATION("DEFAULT_LOCATION", 0);
        public static final ToolchainEventLocationDto LOCAL = new LOCAL("LOCAL", 1);

        /* renamed from: CI */
        public static final ToolchainEventLocationDto f5973CI = new C36421CI("CI", 2);

        private static final /* synthetic */ ToolchainEventLocationDto[] $values() {
            return new ToolchainEventLocationDto[]{DEFAULT_LOCATION, LOCAL, f5973CI};
        }

        public /* synthetic */ ToolchainEventLocationDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2);
        }

        public static EnumEntries<ToolchainEventLocationDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ToolchainEventLocationDto(String str, int i, String str2) {
            this.json_value = str2;
        }

        public final String getJson_value() {
            return this.json_value;
        }

        /* compiled from: ClientToolchainEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ClientToolchainEventDto.ToolchainEventLocationDto.DEFAULT_LOCATION", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventLocation;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEFAULT_LOCATION extends ToolchainEventLocationDto {
            DEFAULT_LOCATION(String str, int i) {
                super(str, i, "", null);
            }

            @Override // com.robinhood.idl.Dto
            public ClientToolchainEvent.ToolchainEventLocation toProto() {
                return ClientToolchainEvent.ToolchainEventLocation.DEFAULT_LOCATION;
            }
        }

        static {
            ToolchainEventLocationDto[] toolchainEventLocationDtoArr$values = $values();
            $VALUES = toolchainEventLocationDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(toolchainEventLocationDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientToolchainEventDto$ToolchainEventLocationDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ClientToolchainEventDto.ToolchainEventLocationDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ClientToolchainEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ClientToolchainEventDto.ToolchainEventLocationDto.LOCAL", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventLocation;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LOCAL extends ToolchainEventLocationDto {
            LOCAL(String str, int i) {
                super(str, i, "local", null);
            }

            @Override // com.robinhood.idl.Dto
            public ClientToolchainEvent.ToolchainEventLocation toProto() {
                return ClientToolchainEvent.ToolchainEventLocation.LOCAL;
            }
        }

        /* compiled from: ClientToolchainEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ClientToolchainEventDto.ToolchainEventLocationDto.CI", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventLocation;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.eventlogging.ClientToolchainEventDto$ToolchainEventLocationDto$CI */
        static final class C36421CI extends ToolchainEventLocationDto {
            C36421CI(String str, int i) {
                super(str, i, "ci", null);
            }

            @Override // com.robinhood.idl.Dto
            public ClientToolchainEvent.ToolchainEventLocation toProto() {
                return ClientToolchainEvent.ToolchainEventLocation.f5972CI;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ClientToolchainEventDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto;", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEvent$ToolchainEventLocation;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ToolchainEventLocationDto, ClientToolchainEvent.ToolchainEventLocation> {

            /* compiled from: ClientToolchainEventDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ClientToolchainEvent.ToolchainEventLocation.values().length];
                    try {
                        iArr[ClientToolchainEvent.ToolchainEventLocation.DEFAULT_LOCATION.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ClientToolchainEvent.ToolchainEventLocation.LOCAL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ClientToolchainEvent.ToolchainEventLocation.f5972CI.ordinal()] = 3;
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

            public final KSerializer<ToolchainEventLocationDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ToolchainEventLocationDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ToolchainEventLocationDto> getBinaryBase64Serializer() {
                return (KSerializer) ToolchainEventLocationDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ClientToolchainEvent.ToolchainEventLocation> getProtoAdapter() {
                return ClientToolchainEvent.ToolchainEventLocation.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ToolchainEventLocationDto getZeroValue() {
                return ToolchainEventLocationDto.DEFAULT_LOCATION;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ToolchainEventLocationDto fromProto(ClientToolchainEvent.ToolchainEventLocation proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ToolchainEventLocationDto.DEFAULT_LOCATION;
                }
                if (i == 2) {
                    return ToolchainEventLocationDto.LOCAL;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return ToolchainEventLocationDto.f5973CI;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ClientToolchainEventDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$ToolchainEventLocationDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ToolchainEventLocationDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ToolchainEventLocationDto, ClientToolchainEvent.ToolchainEventLocation> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ClientToolchainEvent.ToolchainEventLocation", ToolchainEventLocationDto.getEntries(), ToolchainEventLocationDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ToolchainEventLocationDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ToolchainEventLocationDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ToolchainEventLocationDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ToolchainEventLocationDto valueOf(String str) {
            return (ToolchainEventLocationDto) Enum.valueOf(ToolchainEventLocationDto.class, str);
        }

        public static ToolchainEventLocationDto[] values() {
            return (ToolchainEventLocationDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ClientToolchainEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientToolchainEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientToolchainEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientToolchainEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientToolchainEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientToolchainEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientToolchainEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientToolchainEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientToolchainEventDto";
        }
    }
}
