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
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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

/* compiled from: ClientIndividualProfileModuleResultEventDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00046578B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BY\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0015J]\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b2\u0010\"R\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b3\u0010\"R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b4\u0010\"¨\u00069"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "environment", "", "module_name", "", "incremental_build_time", "transitive_dependent_count", "direct_dependent_count", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Ljava/lang/String;III)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Ljava/lang/String;III)Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getTimestamp", "()Lj$/time/Instant;", "getEnvironment", "()Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "getModule_name", "getIncremental_build_time", "getTransitive_dependent_count", "getDirect_dependent_count", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientIndividualProfileModuleResultEventDto implements Dto3<ClientIndividualProfileModuleResultEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientIndividualProfileModuleResultEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientIndividualProfileModuleResultEventDto, ClientIndividualProfileModuleResultEvent>> binaryBase64Serializer$delegate;
    private static final ClientIndividualProfileModuleResultEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientIndividualProfileModuleResultEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientIndividualProfileModuleResultEventDto(Surrogate surrogate) {
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

    public final String getModule_name() {
        return this.surrogate.getModule_name();
    }

    public final int getIncremental_build_time() {
        return this.surrogate.getIncremental_build_time();
    }

    public final int getTransitive_dependent_count() {
        return this.surrogate.getTransitive_dependent_count();
    }

    public final int getDirect_dependent_count() {
        return this.surrogate.getDirect_dependent_count();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ClientIndividualProfileModuleResultEventDto(com.robinhood.rosetta.eventlogging.ClientPlatformDto r2, p479j$.time.Instant r3, com.robinhood.rosetta.eventlogging.EnvironmentDto r4, java.lang.String r5, int r6, int r7, int r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto La
            com.robinhood.rosetta.eventlogging.ClientPlatformDto$Companion r2 = com.robinhood.rosetta.eventlogging.ClientPlatformDto.INSTANCE
            com.robinhood.rosetta.eventlogging.ClientPlatformDto r2 = r2.getZeroValue()
        La:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto L10
            r3 = r0
        L10:
            r10 = r9 & 4
            if (r10 == 0) goto L15
            r4 = r0
        L15:
            r10 = r9 & 8
            if (r10 == 0) goto L1b
            java.lang.String r5 = ""
        L1b:
            r10 = r9 & 16
            r0 = 0
            if (r10 == 0) goto L21
            r6 = r0
        L21:
            r10 = r9 & 32
            if (r10 == 0) goto L26
            r7 = r0
        L26:
            r9 = r9 & 64
            if (r9 == 0) goto L33
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L3b
        L33:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L3b:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientIndividualProfileModuleResultEventDto.<init>(com.robinhood.rosetta.eventlogging.ClientPlatformDto, j$.time.Instant, com.robinhood.rosetta.eventlogging.EnvironmentDto, java.lang.String, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientIndividualProfileModuleResultEventDto(ClientPlatformDto platform, Instant instant, EnvironmentDto environmentDto, String module_name, int i, int i2, int i3) {
        this(new Surrogate(platform, instant, environmentDto, module_name, i, i2, i3));
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(module_name, "module_name");
    }

    public static /* synthetic */ ClientIndividualProfileModuleResultEventDto copy$default(ClientIndividualProfileModuleResultEventDto clientIndividualProfileModuleResultEventDto, ClientPlatformDto clientPlatformDto, Instant instant, EnvironmentDto environmentDto, String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            clientPlatformDto = clientIndividualProfileModuleResultEventDto.surrogate.getPlatform();
        }
        if ((i4 & 2) != 0) {
            instant = clientIndividualProfileModuleResultEventDto.surrogate.getTimestamp();
        }
        if ((i4 & 4) != 0) {
            environmentDto = clientIndividualProfileModuleResultEventDto.surrogate.getEnvironment();
        }
        if ((i4 & 8) != 0) {
            str = clientIndividualProfileModuleResultEventDto.surrogate.getModule_name();
        }
        if ((i4 & 16) != 0) {
            i = clientIndividualProfileModuleResultEventDto.surrogate.getIncremental_build_time();
        }
        if ((i4 & 32) != 0) {
            i2 = clientIndividualProfileModuleResultEventDto.surrogate.getTransitive_dependent_count();
        }
        if ((i4 & 64) != 0) {
            i3 = clientIndividualProfileModuleResultEventDto.surrogate.getDirect_dependent_count();
        }
        int i5 = i2;
        int i6 = i3;
        int i7 = i;
        EnvironmentDto environmentDto2 = environmentDto;
        return clientIndividualProfileModuleResultEventDto.copy(clientPlatformDto, instant, environmentDto2, str, i7, i5, i6);
    }

    public final ClientIndividualProfileModuleResultEventDto copy(ClientPlatformDto platform, Instant timestamp, EnvironmentDto environment, String module_name, int incremental_build_time, int transitive_dependent_count, int direct_dependent_count) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(module_name, "module_name");
        return new ClientIndividualProfileModuleResultEventDto(new Surrogate(platform, timestamp, environment, module_name, incremental_build_time, transitive_dependent_count, direct_dependent_count));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientIndividualProfileModuleResultEvent toProto() {
        ClientPlatform clientPlatform = (ClientPlatform) this.surrogate.getPlatform().toProto();
        Instant timestamp = this.surrogate.getTimestamp();
        EnvironmentDto environment = this.surrogate.getEnvironment();
        return new ClientIndividualProfileModuleResultEvent(clientPlatform, timestamp, environment != null ? environment.toProto() : null, this.surrogate.getModule_name(), this.surrogate.getIncremental_build_time(), this.surrogate.getTransitive_dependent_count(), this.surrogate.getDirect_dependent_count(), null, 128, null);
    }

    public String toString() {
        return "[ClientIndividualProfileModuleResultEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientIndividualProfileModuleResultEventDto) && Intrinsics.areEqual(((ClientIndividualProfileModuleResultEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientIndividualProfileModuleResultEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 J2\u00020\u0001:\u0002KJB¢\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f¢\u0006\u0004\b\u0013\u0010\u0014B[\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J6\u0010$\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000fHÆ\u0003¢\u0006\u0004\b,\u0010+J\u001f\u0010-\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000fHÆ\u0003¢\u0006\u0004\b-\u0010+J«\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0017\b\u0002\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f2\u0017\b\u0002\u0010\u0011\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f2\u0017\b\u0002\u0010\u0012\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000fHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b0\u0010)J\u0010\u00101\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b1\u0010+J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010#RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\b<\u00109\u001a\u0004\b;\u0010%R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010=\u0012\u0004\b?\u00109\u001a\u0004\b>\u0010'R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010@\u0012\u0004\bB\u00109\u001a\u0004\bA\u0010)R/\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010C\u0012\u0004\bE\u00109\u001a\u0004\bD\u0010+R/\u0010\u0011\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010C\u0012\u0004\bG\u00109\u001a\u0004\bF\u0010+R/\u0010\u0012\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010C\u0012\u0004\bI\u00109\u001a\u0004\bH\u0010+¨\u0006L"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "environment", "", "module_name", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "incremental_build_time", "transitive_dependent_count", "direct_dependent_count", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Ljava/lang/String;III)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Ljava/lang/String;IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Lj$/time/Instant;", "component3", "()Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "component4", "()Ljava/lang/String;", "component5", "()I", "component6", "component7", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;Ljava/lang/String;III)Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto$Surrogate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Lcom/robinhood/rosetta/eventlogging/EnvironmentDto;", "getEnvironment", "getEnvironment$annotations", "Ljava/lang/String;", "getModule_name", "getModule_name$annotations", "I", "getIncremental_build_time", "getIncremental_build_time$annotations", "getTransitive_dependent_count", "getTransitive_dependent_count$annotations", "getDirect_dependent_count", "getDirect_dependent_count$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int direct_dependent_count;
        private final EnvironmentDto environment;
        private final int incremental_build_time;
        private final String module_name;
        private final ClientPlatformDto platform;
        private final Instant timestamp;
        private final int transitive_dependent_count;

        public Surrogate() {
            this((ClientPlatformDto) null, (Instant) null, (EnvironmentDto) null, (String) null, 0, 0, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ClientPlatformDto clientPlatformDto, Instant instant, EnvironmentDto environmentDto, String str, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                clientPlatformDto = surrogate.platform;
            }
            if ((i4 & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i4 & 4) != 0) {
                environmentDto = surrogate.environment;
            }
            if ((i4 & 8) != 0) {
                str = surrogate.module_name;
            }
            if ((i4 & 16) != 0) {
                i = surrogate.incremental_build_time;
            }
            if ((i4 & 32) != 0) {
                i2 = surrogate.transitive_dependent_count;
            }
            if ((i4 & 64) != 0) {
                i3 = surrogate.direct_dependent_count;
            }
            int i5 = i2;
            int i6 = i3;
            int i7 = i;
            EnvironmentDto environmentDto2 = environmentDto;
            return surrogate.copy(clientPlatformDto, instant, environmentDto2, str, i7, i5, i6);
        }

        @SerialName("directDependentCount")
        @JsonAnnotations2(names = {"direct_dependent_count"})
        public static /* synthetic */ void getDirect_dependent_count$annotations() {
        }

        @SerialName("environment")
        @JsonAnnotations2(names = {"environment"})
        public static /* synthetic */ void getEnvironment$annotations() {
        }

        @SerialName("incrementalBuildTime")
        @JsonAnnotations2(names = {"incremental_build_time"})
        public static /* synthetic */ void getIncremental_build_time$annotations() {
        }

        @SerialName("moduleName")
        @JsonAnnotations2(names = {"module_name"})
        public static /* synthetic */ void getModule_name$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("transitiveDependentCount")
        @JsonAnnotations2(names = {"transitive_dependent_count"})
        public static /* synthetic */ void getTransitive_dependent_count$annotations() {
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
        public final String getModule_name() {
            return this.module_name;
        }

        /* renamed from: component5, reason: from getter */
        public final int getIncremental_build_time() {
            return this.incremental_build_time;
        }

        /* renamed from: component6, reason: from getter */
        public final int getTransitive_dependent_count() {
            return this.transitive_dependent_count;
        }

        /* renamed from: component7, reason: from getter */
        public final int getDirect_dependent_count() {
            return this.direct_dependent_count;
        }

        public final Surrogate copy(ClientPlatformDto platform, Instant timestamp, EnvironmentDto environment, String module_name, int incremental_build_time, int transitive_dependent_count, int direct_dependent_count) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(module_name, "module_name");
            return new Surrogate(platform, timestamp, environment, module_name, incremental_build_time, transitive_dependent_count, direct_dependent_count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.environment, surrogate.environment) && Intrinsics.areEqual(this.module_name, surrogate.module_name) && this.incremental_build_time == surrogate.incremental_build_time && this.transitive_dependent_count == surrogate.transitive_dependent_count && this.direct_dependent_count == surrogate.direct_dependent_count;
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            Instant instant = this.timestamp;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            EnvironmentDto environmentDto = this.environment;
            return ((((((((iHashCode2 + (environmentDto != null ? environmentDto.hashCode() : 0)) * 31) + this.module_name.hashCode()) * 31) + Integer.hashCode(this.incremental_build_time)) * 31) + Integer.hashCode(this.transitive_dependent_count)) * 31) + Integer.hashCode(this.direct_dependent_count);
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", timestamp=" + this.timestamp + ", environment=" + this.environment + ", module_name=" + this.module_name + ", incremental_build_time=" + this.incremental_build_time + ", transitive_dependent_count=" + this.transitive_dependent_count + ", direct_dependent_count=" + this.direct_dependent_count + ")";
        }

        /* compiled from: ClientIndividualProfileModuleResultEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientIndividualProfileModuleResultEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, Instant instant, EnvironmentDto environmentDto, String str, int i2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.module_name = "";
            } else {
                this.module_name = str;
            }
            if ((i & 16) == 0) {
                this.incremental_build_time = 0;
            } else {
                this.incremental_build_time = i2;
            }
            if ((i & 32) == 0) {
                this.transitive_dependent_count = 0;
            } else {
                this.transitive_dependent_count = i3;
            }
            if ((i & 64) == 0) {
                this.direct_dependent_count = 0;
            } else {
                this.direct_dependent_count = i4;
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
            if (!Intrinsics.areEqual(self.module_name, "")) {
                output.encodeStringElement(serialDesc, 3, self.module_name);
            }
            int i = self.incremental_build_time;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.transitive_dependent_count;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            int i3 = self.direct_dependent_count;
            if (i3 != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
            }
        }

        public Surrogate(ClientPlatformDto platform, Instant instant, EnvironmentDto environmentDto, String module_name, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(module_name, "module_name");
            this.platform = platform;
            this.timestamp = instant;
            this.environment = environmentDto;
            this.module_name = module_name;
            this.incremental_build_time = i;
            this.transitive_dependent_count = i2;
            this.direct_dependent_count = i3;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.rosetta.eventlogging.ClientPlatformDto r2, p479j$.time.Instant r3, com.robinhood.rosetta.eventlogging.EnvironmentDto r4, java.lang.String r5, int r6, int r7, int r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto La
                com.robinhood.rosetta.eventlogging.ClientPlatformDto$Companion r2 = com.robinhood.rosetta.eventlogging.ClientPlatformDto.INSTANCE
                com.robinhood.rosetta.eventlogging.ClientPlatformDto r2 = r2.getZeroValue()
            La:
                r10 = r9 & 2
                r0 = 0
                if (r10 == 0) goto L10
                r3 = r0
            L10:
                r10 = r9 & 4
                if (r10 == 0) goto L15
                r4 = r0
            L15:
                r10 = r9 & 8
                if (r10 == 0) goto L1b
                java.lang.String r5 = ""
            L1b:
                r10 = r9 & 16
                r0 = 0
                if (r10 == 0) goto L21
                r6 = r0
            L21:
                r10 = r9 & 32
                if (r10 == 0) goto L26
                r7 = r0
            L26:
                r9 = r9 & 64
                if (r9 == 0) goto L33
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L3b
            L33:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L3b:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientIndividualProfileModuleResultEventDto.Surrogate.<init>(com.robinhood.rosetta.eventlogging.ClientPlatformDto, j$.time.Instant, com.robinhood.rosetta.eventlogging.EnvironmentDto, java.lang.String, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final EnvironmentDto getEnvironment() {
            return this.environment;
        }

        public final String getModule_name() {
            return this.module_name;
        }

        public final int getIncremental_build_time() {
            return this.incremental_build_time;
        }

        public final int getTransitive_dependent_count() {
            return this.transitive_dependent_count;
        }

        public final int getDirect_dependent_count() {
            return this.direct_dependent_count;
        }
    }

    /* compiled from: ClientIndividualProfileModuleResultEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ClientIndividualProfileModuleResultEventDto, ClientIndividualProfileModuleResultEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientIndividualProfileModuleResultEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientIndividualProfileModuleResultEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientIndividualProfileModuleResultEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientIndividualProfileModuleResultEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientIndividualProfileModuleResultEvent> getProtoAdapter() {
            return ClientIndividualProfileModuleResultEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientIndividualProfileModuleResultEventDto getZeroValue() {
            return ClientIndividualProfileModuleResultEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientIndividualProfileModuleResultEventDto fromProto(ClientIndividualProfileModuleResultEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ClientPlatformDto clientPlatformDtoFromProto = ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform());
            Instant timestamp = proto.getTimestamp();
            Environment environment = proto.getEnvironment();
            return new ClientIndividualProfileModuleResultEventDto(new Surrogate(clientPlatformDtoFromProto, timestamp, environment != null ? EnvironmentDto.INSTANCE.fromProto(environment) : null, proto.getModule_name(), proto.getIncremental_build_time(), proto.getTransitive_dependent_count(), proto.getDirect_dependent_count()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientIndividualProfileModuleResultEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientIndividualProfileModuleResultEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientIndividualProfileModuleResultEventDto(null, null, null, null, 0, 0, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientIndividualProfileModuleResultEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientIndividualProfileModuleResultEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientIndividualProfileModuleResultEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientIndividualProfileModuleResultEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientIndividualProfileModuleResultEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientIndividualProfileModuleResultEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientIndividualProfileModuleResultEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientIndividualProfileModuleResultEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientIndividualProfileModuleResultEventDto";
        }
    }
}
