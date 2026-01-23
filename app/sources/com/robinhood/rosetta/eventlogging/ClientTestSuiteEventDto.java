package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.ClientPlatformDto;
import com.robinhood.rosetta.eventlogging.ClientTestSuiteContextDto;
import com.robinhood.rosetta.eventlogging.ClientTestSuiteTypeDto;
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
import p479j$.time.Instant;

/* compiled from: ClientTestSuiteEventDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004FEGHB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0093\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u001dJ\u0097\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0011H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0011H\u0016¢\u0006\u0004\b1\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b7\u0010#R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b:\u0010*R\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b;\u0010*R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b<\u0010*R\u0011\u0010\u0015\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b=\u0010*R\u0011\u0010\u0016\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b>\u0010#R\u0011\u0010\u0017\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b?\u0010#R\u0011\u0010\u0019\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010\u001b\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010\u001c\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bD\u0010*¨\u0006I"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "name", "", "duration", "", "passed_count", "failed_count", "ignored_count", "retry_count", "group_id", "module_name", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "type", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;", "context", "untested_count", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;FIIIILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;I)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;FIIIILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;I)Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getTimestamp", "()Lj$/time/Instant;", "getName", "getDuration", "()F", "getPassed_count", "getFailed_count", "getIgnored_count", "getRetry_count", "getGroup_id", "getModule_name", "getType", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;", "getUntested_count", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientTestSuiteEventDto implements Dto3<ClientTestSuiteEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientTestSuiteEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientTestSuiteEventDto, ClientTestSuiteEvent>> binaryBase64Serializer$delegate;
    private static final ClientTestSuiteEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientTestSuiteEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientTestSuiteEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final float getDuration() {
        return this.surrogate.getDuration();
    }

    public final int getPassed_count() {
        return this.surrogate.getPassed_count();
    }

    public final int getFailed_count() {
        return this.surrogate.getFailed_count();
    }

    public final int getIgnored_count() {
        return this.surrogate.getIgnored_count();
    }

    public final int getRetry_count() {
        return this.surrogate.getRetry_count();
    }

    public final String getGroup_id() {
        return this.surrogate.getGroup_id();
    }

    public final String getModule_name() {
        return this.surrogate.getModule_name();
    }

    public final ClientTestSuiteTypeDto getType() {
        return this.surrogate.getType();
    }

    public final ClientTestSuiteContextDto getContext() {
        return this.surrogate.getContext();
    }

    public final int getUntested_count() {
        return this.surrogate.getUntested_count();
    }

    public /* synthetic */ ClientTestSuiteEventDto(ClientPlatformDto clientPlatformDto, Instant instant, String str, float f, int i, int i2, int i3, int i4, String str2, String str3, ClientTestSuiteTypeDto clientTestSuiteTypeDto, ClientTestSuiteContextDto clientTestSuiteContextDto, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i6 & 2) != 0 ? null : instant, (i6 & 4) != 0 ? "" : str, (i6 & 8) != 0 ? 0.0f : f, (i6 & 16) != 0 ? 0 : i, (i6 & 32) != 0 ? 0 : i2, (i6 & 64) != 0 ? 0 : i3, (i6 & 128) != 0 ? 0 : i4, (i6 & 256) != 0 ? "" : str2, (i6 & 512) == 0 ? str3 : "", (i6 & 1024) != 0 ? ClientTestSuiteTypeDto.INSTANCE.getZeroValue() : clientTestSuiteTypeDto, (i6 & 2048) != 0 ? ClientTestSuiteContextDto.INSTANCE.getZeroValue() : clientTestSuiteContextDto, (i6 & 4096) != 0 ? 0 : i5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientTestSuiteEventDto(ClientPlatformDto platform, Instant instant, String name, float f, int i, int i2, int i3, int i4, String group_id, String module_name, ClientTestSuiteTypeDto type2, ClientTestSuiteContextDto context, int i5) {
        this(new Surrogate(platform, instant, name, f, i, i2, i3, i4, group_id, module_name, type2, context, i5));
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(group_id, "group_id");
        Intrinsics.checkNotNullParameter(module_name, "module_name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ ClientTestSuiteEventDto copy$default(ClientTestSuiteEventDto clientTestSuiteEventDto, ClientPlatformDto clientPlatformDto, Instant instant, String str, float f, int i, int i2, int i3, int i4, String str2, String str3, ClientTestSuiteTypeDto clientTestSuiteTypeDto, ClientTestSuiteContextDto clientTestSuiteContextDto, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            clientPlatformDto = clientTestSuiteEventDto.surrogate.getPlatform();
        }
        return clientTestSuiteEventDto.copy(clientPlatformDto, (i6 & 2) != 0 ? clientTestSuiteEventDto.surrogate.getTimestamp() : instant, (i6 & 4) != 0 ? clientTestSuiteEventDto.surrogate.getName() : str, (i6 & 8) != 0 ? clientTestSuiteEventDto.surrogate.getDuration() : f, (i6 & 16) != 0 ? clientTestSuiteEventDto.surrogate.getPassed_count() : i, (i6 & 32) != 0 ? clientTestSuiteEventDto.surrogate.getFailed_count() : i2, (i6 & 64) != 0 ? clientTestSuiteEventDto.surrogate.getIgnored_count() : i3, (i6 & 128) != 0 ? clientTestSuiteEventDto.surrogate.getRetry_count() : i4, (i6 & 256) != 0 ? clientTestSuiteEventDto.surrogate.getGroup_id() : str2, (i6 & 512) != 0 ? clientTestSuiteEventDto.surrogate.getModule_name() : str3, (i6 & 1024) != 0 ? clientTestSuiteEventDto.surrogate.getType() : clientTestSuiteTypeDto, (i6 & 2048) != 0 ? clientTestSuiteEventDto.surrogate.getContext() : clientTestSuiteContextDto, (i6 & 4096) != 0 ? clientTestSuiteEventDto.surrogate.getUntested_count() : i5);
    }

    public final ClientTestSuiteEventDto copy(ClientPlatformDto platform, Instant timestamp, String name, float duration, int passed_count, int failed_count, int ignored_count, int retry_count, String group_id, String module_name, ClientTestSuiteTypeDto type2, ClientTestSuiteContextDto context, int untested_count) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(group_id, "group_id");
        Intrinsics.checkNotNullParameter(module_name, "module_name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        return new ClientTestSuiteEventDto(new Surrogate(platform, timestamp, name, duration, passed_count, failed_count, ignored_count, retry_count, group_id, module_name, type2, context, untested_count));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientTestSuiteEvent toProto() {
        return new ClientTestSuiteEvent((ClientPlatform) this.surrogate.getPlatform().toProto(), this.surrogate.getTimestamp(), this.surrogate.getName(), this.surrogate.getDuration(), this.surrogate.getPassed_count(), this.surrogate.getFailed_count(), this.surrogate.getIgnored_count(), this.surrogate.getRetry_count(), this.surrogate.getGroup_id(), this.surrogate.getModule_name(), (ClientTestSuiteType) this.surrogate.getType().toProto(), (ClientTestSuiteContext) this.surrogate.getContext().toProto(), this.surrogate.getUntested_count(), null, 8192, null);
    }

    public String toString() {
        return "[ClientTestSuiteEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientTestSuiteEventDto) && Intrinsics.areEqual(((ClientTestSuiteEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientTestSuiteEventDto.kt */
    @Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b'\b\u0083\b\u0018\u0000 i2\u00020\u0001:\u0002jiB\u0089\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0010\u0012\u0017\b\u0002\u0010\u0014\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\u0017\b\u0002\u0010\u001b\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0010¢\u0006\u0004\b\u001c\u0010\u001dB\u0091\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J'\u0010*\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010,J6\u0010-\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b5\u00104J\u001f\u00106\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b6\u00104J\u001f\u00107\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b7\u00104J\u0010\u00108\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b8\u00100J\u0010\u00109\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b9\u00100J\u0010\u0010:\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b>\u00104J\u0092\u0002\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0017\b\u0002\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r2\u0017\b\u0002\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0012\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0013\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00102\u0017\b\u0002\u0010\u0014\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00102\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0017\b\u0002\u0010\u001b\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0010HÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\nHÖ\u0001¢\u0006\u0004\bA\u00100J\u0010\u0010B\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bB\u00104J\u001a\u0010E\u001a\u00020D2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bE\u0010FR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010G\u0012\u0004\bI\u0010J\u001a\u0004\bH\u0010,RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010K\u0012\u0004\bM\u0010J\u001a\u0004\bL\u0010.R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010N\u0012\u0004\bP\u0010J\u001a\u0004\bO\u00100R/\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010Q\u0012\u0004\bS\u0010J\u001a\u0004\bR\u00102R/\u0010\u0011\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010T\u0012\u0004\bV\u0010J\u001a\u0004\bU\u00104R/\u0010\u0012\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010T\u0012\u0004\bX\u0010J\u001a\u0004\bW\u00104R/\u0010\u0013\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010T\u0012\u0004\bZ\u0010J\u001a\u0004\bY\u00104R/\u0010\u0014\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010T\u0012\u0004\b\\\u0010J\u001a\u0004\b[\u00104R \u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010N\u0012\u0004\b^\u0010J\u001a\u0004\b]\u00100R \u0010\u0016\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010N\u0012\u0004\b`\u0010J\u001a\u0004\b_\u00100R \u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010a\u0012\u0004\bc\u0010J\u001a\u0004\bb\u0010;R \u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010d\u0012\u0004\bf\u0010J\u001a\u0004\be\u0010=R/\u0010\u001b\u001a\u00110\u000f¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010T\u0012\u0004\bh\u0010J\u001a\u0004\bg\u00104¨\u0006k"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "", "name", "", "Lcom/robinhood/idl/serialization/FloatSerializer;", "duration", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "passed_count", "failed_count", "ignored_count", "retry_count", "group_id", "module_name", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "type", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;", "context", "untested_count", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;FIIIILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;FIIIILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Lj$/time/Instant;", "component3", "()Ljava/lang/String;", "component4", "()F", "component5", "()I", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "component12", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;", "component13", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;FIIIILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;I)Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto$Surrogate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Ljava/lang/String;", "getName", "getName$annotations", "F", "getDuration", "getDuration$annotations", "I", "getPassed_count", "getPassed_count$annotations", "getFailed_count", "getFailed_count$annotations", "getIgnored_count", "getIgnored_count$annotations", "getRetry_count", "getRetry_count$annotations", "getGroup_id", "getGroup_id$annotations", "getModule_name", "getModule_name$annotations", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "getType", "getType$annotations", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteContextDto;", "getContext", "getContext$annotations", "getUntested_count", "getUntested_count$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ClientTestSuiteContextDto context;
        private final float duration;
        private final int failed_count;
        private final String group_id;
        private final int ignored_count;
        private final String module_name;
        private final String name;
        private final int passed_count;
        private final ClientPlatformDto platform;
        private final int retry_count;
        private final Instant timestamp;
        private final ClientTestSuiteTypeDto type;
        private final int untested_count;

        public Surrogate() {
            this((ClientPlatformDto) null, (Instant) null, (String) null, 0.0f, 0, 0, 0, 0, (String) null, (String) null, (ClientTestSuiteTypeDto) null, (ClientTestSuiteContextDto) null, 0, 8191, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ClientPlatformDto clientPlatformDto, Instant instant, String str, float f, int i, int i2, int i3, int i4, String str2, String str3, ClientTestSuiteTypeDto clientTestSuiteTypeDto, ClientTestSuiteContextDto clientTestSuiteContextDto, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                clientPlatformDto = surrogate.platform;
            }
            return surrogate.copy(clientPlatformDto, (i6 & 2) != 0 ? surrogate.timestamp : instant, (i6 & 4) != 0 ? surrogate.name : str, (i6 & 8) != 0 ? surrogate.duration : f, (i6 & 16) != 0 ? surrogate.passed_count : i, (i6 & 32) != 0 ? surrogate.failed_count : i2, (i6 & 64) != 0 ? surrogate.ignored_count : i3, (i6 & 128) != 0 ? surrogate.retry_count : i4, (i6 & 256) != 0 ? surrogate.group_id : str2, (i6 & 512) != 0 ? surrogate.module_name : str3, (i6 & 1024) != 0 ? surrogate.type : clientTestSuiteTypeDto, (i6 & 2048) != 0 ? surrogate.context : clientTestSuiteContextDto, (i6 & 4096) != 0 ? surrogate.untested_count : i5);
        }

        @SerialName("context")
        @JsonAnnotations2(names = {"context"})
        public static /* synthetic */ void getContext$annotations() {
        }

        @SerialName("duration")
        @JsonAnnotations2(names = {"duration"})
        public static /* synthetic */ void getDuration$annotations() {
        }

        @SerialName("failedCount")
        @JsonAnnotations2(names = {"failed_count"})
        public static /* synthetic */ void getFailed_count$annotations() {
        }

        @SerialName("groupId")
        @JsonAnnotations2(names = {"group_id"})
        public static /* synthetic */ void getGroup_id$annotations() {
        }

        @SerialName("ignoredCount")
        @JsonAnnotations2(names = {"ignored_count"})
        public static /* synthetic */ void getIgnored_count$annotations() {
        }

        @SerialName("moduleName")
        @JsonAnnotations2(names = {"module_name"})
        public static /* synthetic */ void getModule_name$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("passedCount")
        @JsonAnnotations2(names = {"passed_count"})
        public static /* synthetic */ void getPassed_count$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("retryCount")
        @JsonAnnotations2(names = {"retry_count"})
        public static /* synthetic */ void getRetry_count$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        @SerialName("untestedCount")
        @JsonAnnotations2(names = {"untested_count"})
        public static /* synthetic */ void getUntested_count$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        /* renamed from: component10, reason: from getter */
        public final String getModule_name() {
            return this.module_name;
        }

        /* renamed from: component11, reason: from getter */
        public final ClientTestSuiteTypeDto getType() {
            return this.type;
        }

        /* renamed from: component12, reason: from getter */
        public final ClientTestSuiteContextDto getContext() {
            return this.context;
        }

        /* renamed from: component13, reason: from getter */
        public final int getUntested_count() {
            return this.untested_count;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final float getDuration() {
            return this.duration;
        }

        /* renamed from: component5, reason: from getter */
        public final int getPassed_count() {
            return this.passed_count;
        }

        /* renamed from: component6, reason: from getter */
        public final int getFailed_count() {
            return this.failed_count;
        }

        /* renamed from: component7, reason: from getter */
        public final int getIgnored_count() {
            return this.ignored_count;
        }

        /* renamed from: component8, reason: from getter */
        public final int getRetry_count() {
            return this.retry_count;
        }

        /* renamed from: component9, reason: from getter */
        public final String getGroup_id() {
            return this.group_id;
        }

        public final Surrogate copy(ClientPlatformDto platform, Instant timestamp, String name, float duration, int passed_count, int failed_count, int ignored_count, int retry_count, String group_id, String module_name, ClientTestSuiteTypeDto type2, ClientTestSuiteContextDto context, int untested_count) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(group_id, "group_id");
            Intrinsics.checkNotNullParameter(module_name, "module_name");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(context, "context");
            return new Surrogate(platform, timestamp, name, duration, passed_count, failed_count, ignored_count, retry_count, group_id, module_name, type2, context, untested_count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.name, surrogate.name) && Float.compare(this.duration, surrogate.duration) == 0 && this.passed_count == surrogate.passed_count && this.failed_count == surrogate.failed_count && this.ignored_count == surrogate.ignored_count && this.retry_count == surrogate.retry_count && Intrinsics.areEqual(this.group_id, surrogate.group_id) && Intrinsics.areEqual(this.module_name, surrogate.module_name) && this.type == surrogate.type && this.context == surrogate.context && this.untested_count == surrogate.untested_count;
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            Instant instant = this.timestamp;
            return ((((((((((((((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.name.hashCode()) * 31) + Float.hashCode(this.duration)) * 31) + Integer.hashCode(this.passed_count)) * 31) + Integer.hashCode(this.failed_count)) * 31) + Integer.hashCode(this.ignored_count)) * 31) + Integer.hashCode(this.retry_count)) * 31) + this.group_id.hashCode()) * 31) + this.module_name.hashCode()) * 31) + this.type.hashCode()) * 31) + this.context.hashCode()) * 31) + Integer.hashCode(this.untested_count);
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", timestamp=" + this.timestamp + ", name=" + this.name + ", duration=" + this.duration + ", passed_count=" + this.passed_count + ", failed_count=" + this.failed_count + ", ignored_count=" + this.ignored_count + ", retry_count=" + this.retry_count + ", group_id=" + this.group_id + ", module_name=" + this.module_name + ", type=" + this.type + ", context=" + this.context + ", untested_count=" + this.untested_count + ")";
        }

        /* compiled from: ClientTestSuiteEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientTestSuiteEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, Instant instant, String str, float f, int i2, int i3, int i4, int i5, String str2, String str3, ClientTestSuiteTypeDto clientTestSuiteTypeDto, ClientTestSuiteContextDto clientTestSuiteContextDto, int i6, SerializationConstructorMarker serializationConstructorMarker) {
            this.platform = (i & 1) == 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto;
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.name = "";
            } else {
                this.name = str;
            }
            if ((i & 8) == 0) {
                this.duration = 0.0f;
            } else {
                this.duration = f;
            }
            if ((i & 16) == 0) {
                this.passed_count = 0;
            } else {
                this.passed_count = i2;
            }
            if ((i & 32) == 0) {
                this.failed_count = 0;
            } else {
                this.failed_count = i3;
            }
            if ((i & 64) == 0) {
                this.ignored_count = 0;
            } else {
                this.ignored_count = i4;
            }
            if ((i & 128) == 0) {
                this.retry_count = 0;
            } else {
                this.retry_count = i5;
            }
            if ((i & 256) == 0) {
                this.group_id = "";
            } else {
                this.group_id = str2;
            }
            if ((i & 512) == 0) {
                this.module_name = "";
            } else {
                this.module_name = str3;
            }
            if ((i & 1024) == 0) {
                this.type = ClientTestSuiteTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = clientTestSuiteTypeDto;
            }
            if ((i & 2048) == 0) {
                this.context = ClientTestSuiteContextDto.INSTANCE.getZeroValue();
            } else {
                this.context = clientTestSuiteContextDto;
            }
            if ((i & 4096) == 0) {
                this.untested_count = 0;
            } else {
                this.untested_count = i6;
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
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 2, self.name);
            }
            if (Float.compare(self.duration, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 3, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.duration));
            }
            int i = self.passed_count;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.failed_count;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            int i3 = self.ignored_count;
            if (i3 != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
            }
            int i4 = self.retry_count;
            if (i4 != 0) {
                output.encodeSerializableElement(serialDesc, 7, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i4));
            }
            if (!Intrinsics.areEqual(self.group_id, "")) {
                output.encodeStringElement(serialDesc, 8, self.group_id);
            }
            if (!Intrinsics.areEqual(self.module_name, "")) {
                output.encodeStringElement(serialDesc, 9, self.module_name);
            }
            if (self.type != ClientTestSuiteTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 10, ClientTestSuiteTypeDto.Serializer.INSTANCE, self.type);
            }
            if (self.context != ClientTestSuiteContextDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 11, ClientTestSuiteContextDto.Serializer.INSTANCE, self.context);
            }
            int i5 = self.untested_count;
            if (i5 != 0) {
                output.encodeSerializableElement(serialDesc, 12, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i5));
            }
        }

        public Surrogate(ClientPlatformDto platform, Instant instant, String name, float f, int i, int i2, int i3, int i4, String group_id, String module_name, ClientTestSuiteTypeDto type2, ClientTestSuiteContextDto context, int i5) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(group_id, "group_id");
            Intrinsics.checkNotNullParameter(module_name, "module_name");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(context, "context");
            this.platform = platform;
            this.timestamp = instant;
            this.name = name;
            this.duration = f;
            this.passed_count = i;
            this.failed_count = i2;
            this.ignored_count = i3;
            this.retry_count = i4;
            this.group_id = group_id;
            this.module_name = module_name;
            this.type = type2;
            this.context = context;
            this.untested_count = i5;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        public /* synthetic */ Surrogate(ClientPlatformDto clientPlatformDto, Instant instant, String str, float f, int i, int i2, int i3, int i4, String str2, String str3, ClientTestSuiteTypeDto clientTestSuiteTypeDto, ClientTestSuiteContextDto clientTestSuiteContextDto, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i6 & 2) != 0 ? null : instant, (i6 & 4) != 0 ? "" : str, (i6 & 8) != 0 ? 0.0f : f, (i6 & 16) != 0 ? 0 : i, (i6 & 32) != 0 ? 0 : i2, (i6 & 64) != 0 ? 0 : i3, (i6 & 128) != 0 ? 0 : i4, (i6 & 256) != 0 ? "" : str2, (i6 & 512) == 0 ? str3 : "", (i6 & 1024) != 0 ? ClientTestSuiteTypeDto.INSTANCE.getZeroValue() : clientTestSuiteTypeDto, (i6 & 2048) != 0 ? ClientTestSuiteContextDto.INSTANCE.getZeroValue() : clientTestSuiteContextDto, (i6 & 4096) != 0 ? 0 : i5);
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getName() {
            return this.name;
        }

        public final float getDuration() {
            return this.duration;
        }

        public final int getPassed_count() {
            return this.passed_count;
        }

        public final int getFailed_count() {
            return this.failed_count;
        }

        public final int getIgnored_count() {
            return this.ignored_count;
        }

        public final int getRetry_count() {
            return this.retry_count;
        }

        public final String getGroup_id() {
            return this.group_id;
        }

        public final String getModule_name() {
            return this.module_name;
        }

        public final ClientTestSuiteTypeDto getType() {
            return this.type;
        }

        public final ClientTestSuiteContextDto getContext() {
            return this.context;
        }

        public final int getUntested_count() {
            return this.untested_count;
        }
    }

    /* compiled from: ClientTestSuiteEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ClientTestSuiteEventDto, ClientTestSuiteEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientTestSuiteEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientTestSuiteEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientTestSuiteEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientTestSuiteEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientTestSuiteEvent> getProtoAdapter() {
            return ClientTestSuiteEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientTestSuiteEventDto getZeroValue() {
            return ClientTestSuiteEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientTestSuiteEventDto fromProto(ClientTestSuiteEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ClientTestSuiteEventDto(new Surrogate(ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform()), proto.getTimestamp(), proto.getName(), proto.getDuration(), proto.getPassed_count(), proto.getFailed_count(), proto.getIgnored_count(), proto.getRetry_count(), proto.getGroup_id(), proto.getModule_name(), ClientTestSuiteTypeDto.INSTANCE.fromProto(proto.getType()), ClientTestSuiteContextDto.INSTANCE.fromProto(proto.getContext()), proto.getUntested_count()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientTestSuiteEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientTestSuiteEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientTestSuiteEventDto(null, null, null, 0.0f, 0, 0, 0, 0, null, null, null, null, 0, 8191, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientTestSuiteEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientTestSuiteEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientTestSuiteEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientTestSuiteEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientTestSuiteEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientTestSuiteEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientTestSuiteEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientTestSuiteEventDto";
        }
    }
}
