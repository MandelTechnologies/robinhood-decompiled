package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.CIStatusDto;
import com.robinhood.rosetta.eventlogging.ClientPlatformDto;
import com.robinhood.rosetta.eventlogging.EnvironmentDto;
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
import p479j$.time.Instant;

/* compiled from: ClientCIEventDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004:9;<B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BY\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0016J]\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\"H\u0016¢\u0006\u0004\b+\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0019\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\u0015\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b8\u00105¨\u0006="}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientCIEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto$Surrogate;)V", "", "id", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "environment", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "duration", "Lcom/robinhood/rosetta/eventlogging/CIStatusDto;", "status", "wait_duration", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lj$/time/Instant;FLcom/robinhood/rosetta/eventlogging/CIStatusDto;F)V", "copy", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lj$/time/Instant;FLcom/robinhood/rosetta/eventlogging/CIStatusDto;F)Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientCIEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto$Surrogate;", "getId", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getEnvironment", "()Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "getTimestamp", "()Lj$/time/Instant;", "getDuration", "()F", "getStatus", "()Lcom/robinhood/rosetta/eventlogging/CIStatusDto;", "getWait_duration", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientCIEventDto implements Dto3<ClientCIEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientCIEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientCIEventDto, ClientCIEvent>> binaryBase64Serializer$delegate;
    private static final ClientCIEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientCIEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientCIEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final ClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final EnvironmentDto getEnvironment() {
        return this.surrogate.getEnvironment();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final float getDuration() {
        return this.surrogate.getDuration();
    }

    public final CIStatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final float getWait_duration() {
        return this.surrogate.getWait_duration();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ClientCIEventDto(java.lang.String r2, com.robinhood.rosetta.eventlogging.ClientPlatformDto r3, com.robinhood.rosetta.eventlogging.EnvironmentDto r4, p479j$.time.Instant r5, float r6, com.robinhood.rosetta.eventlogging.CIStatusDto r7, float r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto L10
            com.robinhood.rosetta.eventlogging.ClientPlatformDto$Companion r3 = com.robinhood.rosetta.eventlogging.ClientPlatformDto.INSTANCE
            com.robinhood.rosetta.eventlogging.ClientPlatformDto r3 = r3.getZeroValue()
        L10:
            r10 = r9 & 4
            r0 = 0
            if (r10 == 0) goto L16
            r4 = r0
        L16:
            r10 = r9 & 8
            if (r10 == 0) goto L1b
            r5 = r0
        L1b:
            r10 = r9 & 16
            r0 = 0
            if (r10 == 0) goto L21
            r6 = r0
        L21:
            r10 = r9 & 32
            if (r10 == 0) goto L2b
            com.robinhood.rosetta.eventlogging.CIStatusDto$Companion r7 = com.robinhood.rosetta.eventlogging.CIStatusDto.INSTANCE
            com.robinhood.rosetta.eventlogging.CIStatusDto r7 = r7.getZeroValue()
        L2b:
            r9 = r9 & 64
            if (r9 == 0) goto L38
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L40
        L38:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L40:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientCIEventDto.<init>(java.lang.String, com.robinhood.rosetta.eventlogging.ClientPlatformDto, com.robinhood.rosetta.eventlogging.EnvironmentDto, j$.time.Instant, float, com.robinhood.rosetta.eventlogging.CIStatusDto, float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientCIEventDto(String id, ClientPlatformDto platform, EnvironmentDto environmentDto, Instant instant, float f, CIStatusDto status, float f2) {
        this(new Surrogate(id, platform, environmentDto, instant, f, status, f2));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(status, "status");
    }

    public static /* synthetic */ ClientCIEventDto copy$default(ClientCIEventDto clientCIEventDto, String str, ClientPlatformDto clientPlatformDto, EnvironmentDto environmentDto, Instant instant, float f, CIStatusDto cIStatusDto, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientCIEventDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            clientPlatformDto = clientCIEventDto.surrogate.getPlatform();
        }
        if ((i & 4) != 0) {
            environmentDto = clientCIEventDto.surrogate.getEnvironment();
        }
        if ((i & 8) != 0) {
            instant = clientCIEventDto.surrogate.getTimestamp();
        }
        if ((i & 16) != 0) {
            f = clientCIEventDto.surrogate.getDuration();
        }
        if ((i & 32) != 0) {
            cIStatusDto = clientCIEventDto.surrogate.getStatus();
        }
        if ((i & 64) != 0) {
            f2 = clientCIEventDto.surrogate.getWait_duration();
        }
        CIStatusDto cIStatusDto2 = cIStatusDto;
        float f3 = f2;
        float f4 = f;
        EnvironmentDto environmentDto2 = environmentDto;
        return clientCIEventDto.copy(str, clientPlatformDto, environmentDto2, instant, f4, cIStatusDto2, f3);
    }

    public final ClientCIEventDto copy(String id, ClientPlatformDto platform, EnvironmentDto environment, Instant timestamp, float duration, CIStatusDto status, float wait_duration) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(status, "status");
        return new ClientCIEventDto(new Surrogate(id, platform, environment, timestamp, duration, status, wait_duration));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientCIEvent toProto() {
        String id = this.surrogate.getId();
        ClientPlatform clientPlatform = (ClientPlatform) this.surrogate.getPlatform().toProto();
        EnvironmentDto environment = this.surrogate.getEnvironment();
        return new ClientCIEvent(id, clientPlatform, environment != null ? environment.toProto() : null, this.surrogate.getTimestamp(), this.surrogate.getDuration(), (CIStatus) this.surrogate.getStatus().toProto(), this.surrogate.getWait_duration(), null, 128, null);
    }

    public String toString() {
        return "[ClientCIEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientCIEventDto) && Intrinsics.areEqual(((ClientCIEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientCIEventDto.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0083\b\u0018\u0000 O2\u00020\u0001:\u0002POB\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012.\b\u0002\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u000f¢\u0006\u0004\b\u0014\u0010\u0015B]\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010)J6\u0010*\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u000fHÆ\u0003¢\u0006\u0004\b0\u0010-J\u009c\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062.\b\u0002\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2\u0017\b\u0002\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0017\b\u0002\u0010\u0013\u001a\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u000fHÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010%J\u0010\u00104\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010%R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010>\u0012\u0004\b@\u0010=\u001a\u0004\b?\u0010'R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010A\u0012\u0004\bC\u0010=\u001a\u0004\bB\u0010)RF\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010D\u0012\u0004\bF\u0010=\u001a\u0004\bE\u0010+R/\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010G\u0012\u0004\bI\u0010=\u001a\u0004\bH\u0010-R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010J\u0012\u0004\bL\u0010=\u001a\u0004\bK\u0010/R/\u0010\u0013\u001a\u00110\u000e¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010G\u0012\u0004\bN\u0010=\u001a\u0004\bM\u0010-¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto$Surrogate;", "", "", "id", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "environment", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "", "Lcom/robinhood/idl/serialization/FloatSerializer;", "duration", "Lcom/robinhood/rosetta/eventlogging/CIStatusDto;", "status", "wait_duration", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lj$/time/Instant;FLcom/robinhood/rosetta/eventlogging/CIStatusDto;F)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lj$/time/Instant;FLcom/robinhood/rosetta/eventlogging/CIStatusDto;FLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component3", "()Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "component4", "()Lj$/time/Instant;", "component5", "()F", "component6", "()Lcom/robinhood/rosetta/eventlogging/CIStatusDto;", "component7", "copy", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Lj$/time/Instant;FLcom/robinhood/rosetta/eventlogging/CIStatusDto;F)Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "getEnvironment", "getEnvironment$annotations", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "F", "getDuration", "getDuration$annotations", "Lcom/robinhood/rosetta/eventlogging/CIStatusDto;", "getStatus", "getStatus$annotations", "getWait_duration", "getWait_duration$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final float duration;
        private final EnvironmentDto environment;
        private final String id;
        private final ClientPlatformDto platform;
        private final CIStatusDto status;
        private final Instant timestamp;
        private final float wait_duration;

        public Surrogate() {
            this((String) null, (ClientPlatformDto) null, (EnvironmentDto) null, (Instant) null, 0.0f, (CIStatusDto) null, 0.0f, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, ClientPlatformDto clientPlatformDto, EnvironmentDto environmentDto, Instant instant, float f, CIStatusDto cIStatusDto, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                clientPlatformDto = surrogate.platform;
            }
            if ((i & 4) != 0) {
                environmentDto = surrogate.environment;
            }
            if ((i & 8) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i & 16) != 0) {
                f = surrogate.duration;
            }
            if ((i & 32) != 0) {
                cIStatusDto = surrogate.status;
            }
            if ((i & 64) != 0) {
                f2 = surrogate.wait_duration;
            }
            CIStatusDto cIStatusDto2 = cIStatusDto;
            float f3 = f2;
            float f4 = f;
            EnvironmentDto environmentDto2 = environmentDto;
            return surrogate.copy(str, clientPlatformDto, environmentDto2, instant, f4, cIStatusDto2, f3);
        }

        @SerialName("duration")
        @JsonAnnotations2(names = {"duration"})
        public static /* synthetic */ void getDuration$annotations() {
        }

        @SerialName("environment")
        @JsonAnnotations2(names = {"environment"})
        public static /* synthetic */ void getEnvironment$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("status")
        @JsonAnnotations2(names = {"status"})
        public static /* synthetic */ void getStatus$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("waitDuration")
        @JsonAnnotations2(names = {"wait_duration"})
        public static /* synthetic */ void getWait_duration$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        /* renamed from: component3, reason: from getter */
        public final EnvironmentDto getEnvironment() {
            return this.environment;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component5, reason: from getter */
        public final float getDuration() {
            return this.duration;
        }

        /* renamed from: component6, reason: from getter */
        public final CIStatusDto getStatus() {
            return this.status;
        }

        /* renamed from: component7, reason: from getter */
        public final float getWait_duration() {
            return this.wait_duration;
        }

        public final Surrogate copy(String id, ClientPlatformDto platform, EnvironmentDto environment, Instant timestamp, float duration, CIStatusDto status, float wait_duration) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(status, "status");
            return new Surrogate(id, platform, environment, timestamp, duration, status, wait_duration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.platform == surrogate.platform && Intrinsics.areEqual(this.environment, surrogate.environment) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Float.compare(this.duration, surrogate.duration) == 0 && this.status == surrogate.status && Float.compare(this.wait_duration, surrogate.wait_duration) == 0;
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.platform.hashCode()) * 31;
            EnvironmentDto environmentDto = this.environment;
            int iHashCode2 = (iHashCode + (environmentDto == null ? 0 : environmentDto.hashCode())) * 31;
            Instant instant = this.timestamp;
            return ((((((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 31) + Float.hashCode(this.duration)) * 31) + this.status.hashCode()) * 31) + Float.hashCode(this.wait_duration);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", platform=" + this.platform + ", environment=" + this.environment + ", timestamp=" + this.timestamp + ", duration=" + this.duration + ", status=" + this.status + ", wait_duration=" + this.wait_duration + ")";
        }

        /* compiled from: ClientCIEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientCIEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, ClientPlatformDto clientPlatformDto, EnvironmentDto environmentDto, Instant instant, float f, CIStatusDto cIStatusDto, float f2, SerializationConstructorMarker serializationConstructorMarker) {
            this.id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.platform = ClientPlatformDto.INSTANCE.getZeroValue();
            } else {
                this.platform = clientPlatformDto;
            }
            if ((i & 4) == 0) {
                this.environment = null;
            } else {
                this.environment = environmentDto;
            }
            if ((i & 8) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 16) == 0) {
                this.duration = 0.0f;
            } else {
                this.duration = f;
            }
            if ((i & 32) == 0) {
                this.status = CIStatusDto.INSTANCE.getZeroValue();
            } else {
                this.status = cIStatusDto;
            }
            if ((i & 64) == 0) {
                this.wait_duration = 0.0f;
            } else {
                this.wait_duration = f2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (self.platform != ClientPlatformDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, ClientPlatformDto.Serializer.INSTANCE, self.platform);
            }
            EnvironmentDto environmentDto = self.environment;
            if (environmentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, EnvironmentDto.Serializer.INSTANCE, environmentDto);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant);
            }
            if (Float.compare(self.duration, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 4, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.duration));
            }
            if (self.status != CIStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, CIStatusDto.Serializer.INSTANCE, self.status);
            }
            if (Float.compare(self.wait_duration, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 6, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.wait_duration));
            }
        }

        public Surrogate(String id, ClientPlatformDto platform, EnvironmentDto environmentDto, Instant instant, float f, CIStatusDto status, float f2) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(status, "status");
            this.id = id;
            this.platform = platform;
            this.environment = environmentDto;
            this.timestamp = instant;
            this.duration = f;
            this.status = status;
            this.wait_duration = f2;
        }

        public final String getId() {
            return this.id;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, com.robinhood.rosetta.eventlogging.ClientPlatformDto r3, com.robinhood.rosetta.eventlogging.EnvironmentDto r4, p479j$.time.Instant r5, float r6, com.robinhood.rosetta.eventlogging.CIStatusDto r7, float r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r10 = r9 & 2
                if (r10 == 0) goto L10
                com.robinhood.rosetta.eventlogging.ClientPlatformDto$Companion r3 = com.robinhood.rosetta.eventlogging.ClientPlatformDto.INSTANCE
                com.robinhood.rosetta.eventlogging.ClientPlatformDto r3 = r3.getZeroValue()
            L10:
                r10 = r9 & 4
                r0 = 0
                if (r10 == 0) goto L16
                r4 = r0
            L16:
                r10 = r9 & 8
                if (r10 == 0) goto L1b
                r5 = r0
            L1b:
                r10 = r9 & 16
                r0 = 0
                if (r10 == 0) goto L21
                r6 = r0
            L21:
                r10 = r9 & 32
                if (r10 == 0) goto L2b
                com.robinhood.rosetta.eventlogging.CIStatusDto$Companion r7 = com.robinhood.rosetta.eventlogging.CIStatusDto.INSTANCE
                com.robinhood.rosetta.eventlogging.CIStatusDto r7 = r7.getZeroValue()
            L2b:
                r9 = r9 & 64
                if (r9 == 0) goto L38
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L40
            L38:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L40:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientCIEventDto.Surrogate.<init>(java.lang.String, com.robinhood.rosetta.eventlogging.ClientPlatformDto, com.robinhood.rosetta.eventlogging.EnvironmentDto, j$.time.Instant, float, com.robinhood.rosetta.eventlogging.CIStatusDto, float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        public final EnvironmentDto getEnvironment() {
            return this.environment;
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final float getDuration() {
            return this.duration;
        }

        public final CIStatusDto getStatus() {
            return this.status;
        }

        public final float getWait_duration() {
            return this.wait_duration;
        }
    }

    /* compiled from: ClientCIEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientCIEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ClientCIEventDto, ClientCIEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientCIEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientCIEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientCIEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientCIEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientCIEvent> getProtoAdapter() {
            return ClientCIEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientCIEventDto getZeroValue() {
            return ClientCIEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientCIEventDto fromProto(ClientCIEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            ClientPlatformDto clientPlatformDtoFromProto = ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform());
            Environment environment = proto.getEnvironment();
            return new ClientCIEventDto(new Surrogate(id, clientPlatformDtoFromProto, environment != null ? EnvironmentDto.INSTANCE.fromProto(environment) : null, proto.getTimestamp(), proto.getDuration(), CIStatusDto.INSTANCE.fromProto(proto.getStatus()), proto.getWait_duration()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientCIEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientCIEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientCIEventDto(null, null, null, null, 0.0f, null, 0.0f, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientCIEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientCIEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientCIEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientCIEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientCIEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientCIEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientCIEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCIEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientCIEventDto";
        }
    }
}
