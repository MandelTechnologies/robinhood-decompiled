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
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.ClientPlatformDto;
import com.robinhood.rosetta.eventlogging.ClientTestResultDto;
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

/* compiled from: ClientTestEventDto.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004@?ABB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bu\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0006\u0010\u001aJy\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020%H\u0016¢\u0006\u0004\b.\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b4\u0010 R\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b5\u0010 R\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b6\u0010 R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010\u0015\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b;\u0010 R\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010\u0019\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010>¨\u0006C"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientTestEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "name", "class_name", "module", "", "duration", "Lcom/robinhood/rosetta/eventlogging/ClientTestResultDto;", "result", "test_suite_id", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "test_type", "", "is_flaky", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/robinhood/rosetta/eventlogging/ClientTestResultDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;Z)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/robinhood/rosetta/eventlogging/ClientTestResultDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;Z)Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientTestEvent;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getTimestamp", "()Lj$/time/Instant;", "getName", "getClass_name", "getModule", "getDuration", "()F", "getResult", "()Lcom/robinhood/rosetta/eventlogging/ClientTestResultDto;", "getTest_suite_id", "getTest_type", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "()Z", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientTestEventDto implements Dto3<ClientTestEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientTestEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientTestEventDto, ClientTestEvent>> binaryBase64Serializer$delegate;
    private static final ClientTestEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientTestEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientTestEventDto(Surrogate surrogate) {
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

    public final String getClass_name() {
        return this.surrogate.getClass_name();
    }

    public final String getModule() {
        return this.surrogate.getModule();
    }

    public final float getDuration() {
        return this.surrogate.getDuration();
    }

    public final ClientTestResultDto getResult() {
        return this.surrogate.getResult();
    }

    public final String getTest_suite_id() {
        return this.surrogate.getTest_suite_id();
    }

    public final ClientTestSuiteTypeDto getTest_type() {
        return this.surrogate.getTest_type();
    }

    public final boolean is_flaky() {
        return this.surrogate.is_flaky();
    }

    public /* synthetic */ ClientTestEventDto(ClientPlatformDto clientPlatformDto, Instant instant, String str, String str2, String str3, float f, ClientTestResultDto clientTestResultDto, String str4, ClientTestSuiteTypeDto clientTestSuiteTypeDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? 0.0f : f, (i & 64) != 0 ? ClientTestResultDto.INSTANCE.getZeroValue() : clientTestResultDto, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? ClientTestSuiteTypeDto.INSTANCE.getZeroValue() : clientTestSuiteTypeDto, (i & 512) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientTestEventDto(ClientPlatformDto platform, Instant instant, String name, String class_name, String module, float f, ClientTestResultDto result, String test_suite_id, ClientTestSuiteTypeDto test_type, boolean z) {
        this(new Surrogate(platform, instant, name, class_name, module, f, result, test_suite_id, test_type, z));
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(class_name, "class_name");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(test_suite_id, "test_suite_id");
        Intrinsics.checkNotNullParameter(test_type, "test_type");
    }

    public static /* synthetic */ ClientTestEventDto copy$default(ClientTestEventDto clientTestEventDto, ClientPlatformDto clientPlatformDto, Instant instant, String str, String str2, String str3, float f, ClientTestResultDto clientTestResultDto, String str4, ClientTestSuiteTypeDto clientTestSuiteTypeDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            clientPlatformDto = clientTestEventDto.surrogate.getPlatform();
        }
        if ((i & 2) != 0) {
            instant = clientTestEventDto.surrogate.getTimestamp();
        }
        if ((i & 4) != 0) {
            str = clientTestEventDto.surrogate.getName();
        }
        if ((i & 8) != 0) {
            str2 = clientTestEventDto.surrogate.getClass_name();
        }
        if ((i & 16) != 0) {
            str3 = clientTestEventDto.surrogate.getModule();
        }
        if ((i & 32) != 0) {
            f = clientTestEventDto.surrogate.getDuration();
        }
        if ((i & 64) != 0) {
            clientTestResultDto = clientTestEventDto.surrogate.getResult();
        }
        if ((i & 128) != 0) {
            str4 = clientTestEventDto.surrogate.getTest_suite_id();
        }
        if ((i & 256) != 0) {
            clientTestSuiteTypeDto = clientTestEventDto.surrogate.getTest_type();
        }
        if ((i & 512) != 0) {
            z = clientTestEventDto.surrogate.is_flaky();
        }
        ClientTestSuiteTypeDto clientTestSuiteTypeDto2 = clientTestSuiteTypeDto;
        boolean z2 = z;
        ClientTestResultDto clientTestResultDto2 = clientTestResultDto;
        String str5 = str4;
        String str6 = str3;
        float f2 = f;
        return clientTestEventDto.copy(clientPlatformDto, instant, str, str2, str6, f2, clientTestResultDto2, str5, clientTestSuiteTypeDto2, z2);
    }

    public final ClientTestEventDto copy(ClientPlatformDto platform, Instant timestamp, String name, String class_name, String module, float duration, ClientTestResultDto result, String test_suite_id, ClientTestSuiteTypeDto test_type, boolean is_flaky) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(class_name, "class_name");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(test_suite_id, "test_suite_id");
        Intrinsics.checkNotNullParameter(test_type, "test_type");
        return new ClientTestEventDto(new Surrogate(platform, timestamp, name, class_name, module, duration, result, test_suite_id, test_type, is_flaky));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientTestEvent toProto() {
        return new ClientTestEvent((ClientPlatform) this.surrogate.getPlatform().toProto(), this.surrogate.getTimestamp(), this.surrogate.getName(), this.surrogate.getClass_name(), this.surrogate.getModule(), this.surrogate.getDuration(), (ClientTestResult) this.surrogate.getResult().toProto(), this.surrogate.getTest_suite_id(), (ClientTestSuiteType) this.surrogate.getTest_type().toProto(), this.surrogate.is_flaky(), null, 1024, null);
    }

    public String toString() {
        return "[ClientTestEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientTestEventDto) && Intrinsics.areEqual(((ClientTestEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientTestEventDto.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b:\b\u0083\b\u0018\u0000 \\2\u00020\u0001:\u0002]\\B \u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B{\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ'\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J6\u0010*\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b/\u0010-J\u001f\u00100\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000fHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b4\u0010-J\u0010\u00105\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b7\u00108J©\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\u0017\b\u0002\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b;\u0010-J\u0010\u0010<\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u00020\u00162\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010A\u0012\u0004\bC\u0010D\u001a\u0004\bB\u0010)RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010E\u0012\u0004\bG\u0010D\u001a\u0004\bF\u0010+R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010H\u0012\u0004\bJ\u0010D\u001a\u0004\bI\u0010-R \u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010H\u0012\u0004\bL\u0010D\u001a\u0004\bK\u0010-R \u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010H\u0012\u0004\bN\u0010D\u001a\u0004\bM\u0010-R/\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010O\u0012\u0004\bQ\u0010D\u001a\u0004\bP\u00101R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010R\u0012\u0004\bT\u0010D\u001a\u0004\bS\u00103R \u0010\u0013\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010H\u0012\u0004\bV\u0010D\u001a\u0004\bU\u0010-R \u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010W\u0012\u0004\bY\u0010D\u001a\u0004\bX\u00106R \u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010Z\u0012\u0004\b[\u0010D\u001a\u0004\b\u0017\u00108¨\u0006^"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "", "name", "class_name", "module", "", "Lcom/robinhood/idl/serialization/FloatSerializer;", "duration", "Lcom/robinhood/rosetta/eventlogging/ClientTestResultDto;", "result", "test_suite_id", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "test_type", "", "is_flaky", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/robinhood/rosetta/eventlogging/ClientTestResultDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/robinhood/rosetta/eventlogging/ClientTestResultDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Lj$/time/Instant;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()F", "component7", "()Lcom/robinhood/rosetta/eventlogging/ClientTestResultDto;", "component8", "component9", "()Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "component10", "()Z", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/robinhood/rosetta/eventlogging/ClientTestResultDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;Z)Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto$Surrogate;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Ljava/lang/String;", "getName", "getName$annotations", "getClass_name", "getClass_name$annotations", "getModule", "getModule$annotations", "F", "getDuration", "getDuration$annotations", "Lcom/robinhood/rosetta/eventlogging/ClientTestResultDto;", "getResult", "getResult$annotations", "getTest_suite_id", "getTest_suite_id$annotations", "Lcom/robinhood/rosetta/eventlogging/ClientTestSuiteTypeDto;", "getTest_type", "getTest_type$annotations", "Z", "is_flaky$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String class_name;
        private final float duration;
        private final boolean is_flaky;
        private final String module;
        private final String name;
        private final ClientPlatformDto platform;
        private final ClientTestResultDto result;
        private final String test_suite_id;
        private final ClientTestSuiteTypeDto test_type;
        private final Instant timestamp;

        public Surrogate() {
            this((ClientPlatformDto) null, (Instant) null, (String) null, (String) null, (String) null, 0.0f, (ClientTestResultDto) null, (String) null, (ClientTestSuiteTypeDto) null, false, 1023, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ClientPlatformDto clientPlatformDto, Instant instant, String str, String str2, String str3, float f, ClientTestResultDto clientTestResultDto, String str4, ClientTestSuiteTypeDto clientTestSuiteTypeDto, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                clientPlatformDto = surrogate.platform;
            }
            if ((i & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i & 4) != 0) {
                str = surrogate.name;
            }
            if ((i & 8) != 0) {
                str2 = surrogate.class_name;
            }
            if ((i & 16) != 0) {
                str3 = surrogate.module;
            }
            if ((i & 32) != 0) {
                f = surrogate.duration;
            }
            if ((i & 64) != 0) {
                clientTestResultDto = surrogate.result;
            }
            if ((i & 128) != 0) {
                str4 = surrogate.test_suite_id;
            }
            if ((i & 256) != 0) {
                clientTestSuiteTypeDto = surrogate.test_type;
            }
            if ((i & 512) != 0) {
                z = surrogate.is_flaky;
            }
            ClientTestSuiteTypeDto clientTestSuiteTypeDto2 = clientTestSuiteTypeDto;
            boolean z2 = z;
            ClientTestResultDto clientTestResultDto2 = clientTestResultDto;
            String str5 = str4;
            String str6 = str3;
            float f2 = f;
            return surrogate.copy(clientPlatformDto, instant, str, str2, str6, f2, clientTestResultDto2, str5, clientTestSuiteTypeDto2, z2);
        }

        @SerialName("className")
        @JsonAnnotations2(names = {"class_name"})
        public static /* synthetic */ void getClass_name$annotations() {
        }

        @SerialName("duration")
        @JsonAnnotations2(names = {"duration"})
        public static /* synthetic */ void getDuration$annotations() {
        }

        @SerialName("module")
        @JsonAnnotations2(names = {"module"})
        public static /* synthetic */ void getModule$annotations() {
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

        @SerialName("testSuiteId")
        @JsonAnnotations2(names = {"test_suite_id"})
        public static /* synthetic */ void getTest_suite_id$annotations() {
        }

        @SerialName("testType")
        @JsonAnnotations2(names = {"test_type"})
        public static /* synthetic */ void getTest_type$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("isFlaky")
        @JsonAnnotations2(names = {"is_flaky"})
        public static /* synthetic */ void is_flaky$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIs_flaky() {
            return this.is_flaky;
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
        public final String getClass_name() {
            return this.class_name;
        }

        /* renamed from: component5, reason: from getter */
        public final String getModule() {
            return this.module;
        }

        /* renamed from: component6, reason: from getter */
        public final float getDuration() {
            return this.duration;
        }

        /* renamed from: component7, reason: from getter */
        public final ClientTestResultDto getResult() {
            return this.result;
        }

        /* renamed from: component8, reason: from getter */
        public final String getTest_suite_id() {
            return this.test_suite_id;
        }

        /* renamed from: component9, reason: from getter */
        public final ClientTestSuiteTypeDto getTest_type() {
            return this.test_type;
        }

        public final Surrogate copy(ClientPlatformDto platform, Instant timestamp, String name, String class_name, String module, float duration, ClientTestResultDto result, String test_suite_id, ClientTestSuiteTypeDto test_type, boolean is_flaky) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(class_name, "class_name");
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(test_suite_id, "test_suite_id");
            Intrinsics.checkNotNullParameter(test_type, "test_type");
            return new Surrogate(platform, timestamp, name, class_name, module, duration, result, test_suite_id, test_type, is_flaky);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.class_name, surrogate.class_name) && Intrinsics.areEqual(this.module, surrogate.module) && Float.compare(this.duration, surrogate.duration) == 0 && this.result == surrogate.result && Intrinsics.areEqual(this.test_suite_id, surrogate.test_suite_id) && this.test_type == surrogate.test_type && this.is_flaky == surrogate.is_flaky;
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            Instant instant = this.timestamp;
            return ((((((((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.name.hashCode()) * 31) + this.class_name.hashCode()) * 31) + this.module.hashCode()) * 31) + Float.hashCode(this.duration)) * 31) + this.result.hashCode()) * 31) + this.test_suite_id.hashCode()) * 31) + this.test_type.hashCode()) * 31) + java.lang.Boolean.hashCode(this.is_flaky);
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", timestamp=" + this.timestamp + ", name=" + this.name + ", class_name=" + this.class_name + ", module=" + this.module + ", duration=" + this.duration + ", result=" + this.result + ", test_suite_id=" + this.test_suite_id + ", test_type=" + this.test_type + ", is_flaky=" + this.is_flaky + ")";
        }

        /* compiled from: ClientTestEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientTestEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, Instant instant, String str, String str2, String str3, float f, ClientTestResultDto clientTestResultDto, String str4, ClientTestSuiteTypeDto clientTestSuiteTypeDto, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.class_name = "";
            } else {
                this.class_name = str2;
            }
            if ((i & 16) == 0) {
                this.module = "";
            } else {
                this.module = str3;
            }
            if ((i & 32) == 0) {
                this.duration = 0.0f;
            } else {
                this.duration = f;
            }
            if ((i & 64) == 0) {
                this.result = ClientTestResultDto.INSTANCE.getZeroValue();
            } else {
                this.result = clientTestResultDto;
            }
            if ((i & 128) == 0) {
                this.test_suite_id = "";
            } else {
                this.test_suite_id = str4;
            }
            if ((i & 256) == 0) {
                this.test_type = ClientTestSuiteTypeDto.INSTANCE.getZeroValue();
            } else {
                this.test_type = clientTestSuiteTypeDto;
            }
            if ((i & 512) == 0) {
                this.is_flaky = false;
            } else {
                this.is_flaky = z;
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
            if (!Intrinsics.areEqual(self.class_name, "")) {
                output.encodeStringElement(serialDesc, 3, self.class_name);
            }
            if (!Intrinsics.areEqual(self.module, "")) {
                output.encodeStringElement(serialDesc, 4, self.module);
            }
            if (Float.compare(self.duration, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 5, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.duration));
            }
            if (self.result != ClientTestResultDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, ClientTestResultDto.Serializer.INSTANCE, self.result);
            }
            if (!Intrinsics.areEqual(self.test_suite_id, "")) {
                output.encodeStringElement(serialDesc, 7, self.test_suite_id);
            }
            if (self.test_type != ClientTestSuiteTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, ClientTestSuiteTypeDto.Serializer.INSTANCE, self.test_type);
            }
            boolean z = self.is_flaky;
            if (z) {
                output.encodeBooleanElement(serialDesc, 9, z);
            }
        }

        public Surrogate(ClientPlatformDto platform, Instant instant, String name, String class_name, String module, float f, ClientTestResultDto result, String test_suite_id, ClientTestSuiteTypeDto test_type, boolean z) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(class_name, "class_name");
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(test_suite_id, "test_suite_id");
            Intrinsics.checkNotNullParameter(test_type, "test_type");
            this.platform = platform;
            this.timestamp = instant;
            this.name = name;
            this.class_name = class_name;
            this.module = module;
            this.duration = f;
            this.result = result;
            this.test_suite_id = test_suite_id;
            this.test_type = test_type;
            this.is_flaky = z;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        public /* synthetic */ Surrogate(ClientPlatformDto clientPlatformDto, Instant instant, String str, String str2, String str3, float f, ClientTestResultDto clientTestResultDto, String str4, ClientTestSuiteTypeDto clientTestSuiteTypeDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? 0.0f : f, (i & 64) != 0 ? ClientTestResultDto.INSTANCE.getZeroValue() : clientTestResultDto, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? ClientTestSuiteTypeDto.INSTANCE.getZeroValue() : clientTestSuiteTypeDto, (i & 512) != 0 ? false : z);
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getName() {
            return this.name;
        }

        public final String getClass_name() {
            return this.class_name;
        }

        public final String getModule() {
            return this.module;
        }

        public final float getDuration() {
            return this.duration;
        }

        public final ClientTestResultDto getResult() {
            return this.result;
        }

        public final String getTest_suite_id() {
            return this.test_suite_id;
        }

        public final ClientTestSuiteTypeDto getTest_type() {
            return this.test_type;
        }

        public final boolean is_flaky() {
            return this.is_flaky;
        }
    }

    /* compiled from: ClientTestEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientTestEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ClientTestEventDto, ClientTestEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientTestEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientTestEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientTestEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientTestEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientTestEvent> getProtoAdapter() {
            return ClientTestEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientTestEventDto getZeroValue() {
            return ClientTestEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientTestEventDto fromProto(ClientTestEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ClientTestEventDto(new Surrogate(ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform()), proto.getTimestamp(), proto.getName(), proto.getClass_name(), proto.getModule(), proto.getDuration(), ClientTestResultDto.INSTANCE.fromProto(proto.getResult()), proto.getTest_suite_id(), ClientTestSuiteTypeDto.INSTANCE.fromProto(proto.getTest_type()), proto.getIs_flaky()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientTestEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientTestEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientTestEventDto(null, null, null, null, null, 0.0f, null, null, null, false, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientTestEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientTestEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientTestEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientTestEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientTestEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientTestEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientTestEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientTestEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientTestEventDto";
        }
    }
}
