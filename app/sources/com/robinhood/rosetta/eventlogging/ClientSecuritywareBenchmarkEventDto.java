package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.ClientSecuritywareBenchmarkEvent;
import com.robinhood.rosetta.eventlogging.ClientSecuritywareBenchmarkEventDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;

/* compiled from: ClientSecuritywareBenchmarkEventDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005:9;<=B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bg\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0006\u0010\u0016Jk\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\"H\u0016¢\u0006\u0004\b+\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001cR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001cR\u0019\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0013\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006>"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$Surrogate;)V", "", "repository", "commit_hash", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "benchmark_id", "", "", "durations", "average_duration", "machine_id", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;", "environment", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/List;DLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/List;DLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;)Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$Surrogate;", "getRepository", "getCommit_hash", "getTimestamp", "()Lj$/time/Instant;", "getBenchmark_id", "getDurations", "()Ljava/util/List;", "getAverage_duration", "()D", "getMachine_id", "getEnvironment", "()Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;", "Companion", "Surrogate", "EnvironmentDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class ClientSecuritywareBenchmarkEventDto implements Dto3<ClientSecuritywareBenchmarkEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientSecuritywareBenchmarkEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientSecuritywareBenchmarkEventDto, ClientSecuritywareBenchmarkEvent>> binaryBase64Serializer$delegate;
    private static final ClientSecuritywareBenchmarkEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientSecuritywareBenchmarkEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientSecuritywareBenchmarkEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getRepository() {
        return this.surrogate.getRepository();
    }

    public final String getCommit_hash() {
        return this.surrogate.getCommit_hash();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getBenchmark_id() {
        return this.surrogate.getBenchmark_id();
    }

    public final java.util.List<Double> getDurations() {
        return this.surrogate.getDurations();
    }

    public final double getAverage_duration() {
        return this.surrogate.getAverage_duration();
    }

    public final String getMachine_id() {
        return this.surrogate.getMachine_id();
    }

    public final EnvironmentDto getEnvironment() {
        return this.surrogate.getEnvironment();
    }

    public /* synthetic */ ClientSecuritywareBenchmarkEventDto(String str, String str2, Instant instant, String str3, java.util.List list, double d, String str4, EnvironmentDto environmentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? EnvironmentDto.INSTANCE.getZeroValue() : environmentDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientSecuritywareBenchmarkEventDto(String repository, String commit_hash, Instant instant, String benchmark_id, java.util.List<Double> durations, double d, String machine_id, EnvironmentDto environment) {
        this(new Surrogate(repository, commit_hash, instant, benchmark_id, durations, d, machine_id, environment));
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(commit_hash, "commit_hash");
        Intrinsics.checkNotNullParameter(benchmark_id, "benchmark_id");
        Intrinsics.checkNotNullParameter(durations, "durations");
        Intrinsics.checkNotNullParameter(machine_id, "machine_id");
        Intrinsics.checkNotNullParameter(environment, "environment");
    }

    public static /* synthetic */ ClientSecuritywareBenchmarkEventDto copy$default(ClientSecuritywareBenchmarkEventDto clientSecuritywareBenchmarkEventDto, String str, String str2, Instant instant, String str3, java.util.List list, double d, String str4, EnvironmentDto environmentDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientSecuritywareBenchmarkEventDto.surrogate.getRepository();
        }
        if ((i & 2) != 0) {
            str2 = clientSecuritywareBenchmarkEventDto.surrogate.getCommit_hash();
        }
        if ((i & 4) != 0) {
            instant = clientSecuritywareBenchmarkEventDto.surrogate.getTimestamp();
        }
        if ((i & 8) != 0) {
            str3 = clientSecuritywareBenchmarkEventDto.surrogate.getBenchmark_id();
        }
        if ((i & 16) != 0) {
            list = clientSecuritywareBenchmarkEventDto.surrogate.getDurations();
        }
        if ((i & 32) != 0) {
            d = clientSecuritywareBenchmarkEventDto.surrogate.getAverage_duration();
        }
        if ((i & 64) != 0) {
            str4 = clientSecuritywareBenchmarkEventDto.surrogate.getMachine_id();
        }
        if ((i & 128) != 0) {
            environmentDto = clientSecuritywareBenchmarkEventDto.surrogate.getEnvironment();
        }
        double d2 = d;
        String str5 = str3;
        java.util.List list2 = list;
        Instant instant2 = instant;
        return clientSecuritywareBenchmarkEventDto.copy(str, str2, instant2, str5, list2, d2, str4, environmentDto);
    }

    public final ClientSecuritywareBenchmarkEventDto copy(String repository, String commit_hash, Instant timestamp, String benchmark_id, java.util.List<Double> durations, double average_duration, String machine_id, EnvironmentDto environment) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(commit_hash, "commit_hash");
        Intrinsics.checkNotNullParameter(benchmark_id, "benchmark_id");
        Intrinsics.checkNotNullParameter(durations, "durations");
        Intrinsics.checkNotNullParameter(machine_id, "machine_id");
        Intrinsics.checkNotNullParameter(environment, "environment");
        return new ClientSecuritywareBenchmarkEventDto(new Surrogate(repository, commit_hash, timestamp, benchmark_id, durations, average_duration, machine_id, environment));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientSecuritywareBenchmarkEvent toProto() {
        String repository = this.surrogate.getRepository();
        String commit_hash = this.surrogate.getCommit_hash();
        Instant timestamp = this.surrogate.getTimestamp();
        String benchmark_id = this.surrogate.getBenchmark_id();
        java.util.List<Double> durations = this.surrogate.getDurations();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(durations, 10));
        Iterator<T> it = durations.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) it.next()).doubleValue()));
        }
        return new ClientSecuritywareBenchmarkEvent(repository, commit_hash, timestamp, benchmark_id, arrayList, this.surrogate.getAverage_duration(), this.surrogate.getMachine_id(), (ClientSecuritywareBenchmarkEvent.Environment) this.surrogate.getEnvironment().toProto(), null, 256, null);
    }

    public String toString() {
        return "[ClientSecuritywareBenchmarkEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientSecuritywareBenchmarkEventDto) && Intrinsics.areEqual(((ClientSecuritywareBenchmarkEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientSecuritywareBenchmarkEventDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 P2\u00020\u0001:\u0002QPB¡\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u001d\b\u0002\u0010\u000f\u001a\u0017\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e0\f\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Bo\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J6\u0010'\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010%J%\u0010*\u001a\u0017\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e0\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00110\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0010\u0010/\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b/\u00100Jª\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u001d\b\u0002\u0010\u000f\u001a\u0017\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e0\f2\u0017\b\u0002\u0010\u0010\u001a\u00110\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010%J\u0010\u00104\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010%R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010:\u0012\u0004\b?\u0010=\u001a\u0004\b>\u0010%RF\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010@\u0012\u0004\bB\u0010=\u001a\u0004\bA\u0010(R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010:\u0012\u0004\bD\u0010=\u001a\u0004\bC\u0010%R5\u0010\u000f\u001a\u0017\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010E\u0012\u0004\bG\u0010=\u001a\u0004\bF\u0010+R/\u0010\u0010\u001a\u00110\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010H\u0012\u0004\bJ\u0010=\u001a\u0004\bI\u0010-R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010:\u0012\u0004\bL\u0010=\u001a\u0004\bK\u0010%R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010M\u0012\u0004\bO\u0010=\u001a\u0004\bN\u00100¨\u0006R"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$Surrogate;", "", "", "repository", "commit_hash", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "benchmark_id", "", "", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "durations", "average_duration", "machine_id", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;", "environment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/List;DLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/List;DLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lj$/time/Instant;", "component4", "component5", "()Ljava/util/List;", "component6", "()D", "component7", "component8", "()Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/util/List;DLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;)Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRepository", "getRepository$annotations", "()V", "getCommit_hash", "getCommit_hash$annotations", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "getBenchmark_id", "getBenchmark_id$annotations", "Ljava/util/List;", "getDurations", "getDurations$annotations", "D", "getAverage_duration", "getAverage_duration$annotations", "getMachine_id", "getMachine_id$annotations", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;", "getEnvironment", "getEnvironment$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final double average_duration;
        private final String benchmark_id;
        private final String commit_hash;
        private final java.util.List<Double> durations;
        private final EnvironmentDto environment;
        private final String machine_id;
        private final String repository;
        private final Instant timestamp;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientSecuritywareBenchmarkEventDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientSecuritywareBenchmarkEventDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null};

        public Surrogate() {
            this((String) null, (String) null, (Instant) null, (String) null, (java.util.List) null, 0.0d, (String) null, (EnvironmentDto) null, 255, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(DoubleAsNumberSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, Instant instant, String str3, java.util.List list, double d, String str4, EnvironmentDto environmentDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.repository;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.commit_hash;
            }
            if ((i & 4) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.benchmark_id;
            }
            if ((i & 16) != 0) {
                list = surrogate.durations;
            }
            if ((i & 32) != 0) {
                d = surrogate.average_duration;
            }
            if ((i & 64) != 0) {
                str4 = surrogate.machine_id;
            }
            if ((i & 128) != 0) {
                environmentDto = surrogate.environment;
            }
            double d2 = d;
            String str5 = str3;
            java.util.List list2 = list;
            Instant instant2 = instant;
            return surrogate.copy(str, str2, instant2, str5, list2, d2, str4, environmentDto);
        }

        @SerialName("averageDuration")
        @JsonAnnotations2(names = {"average_duration"})
        public static /* synthetic */ void getAverage_duration$annotations() {
        }

        @SerialName("benchmarkId")
        @JsonAnnotations2(names = {"benchmark_id"})
        public static /* synthetic */ void getBenchmark_id$annotations() {
        }

        @SerialName("commitHash")
        @JsonAnnotations2(names = {"commit_hash"})
        public static /* synthetic */ void getCommit_hash$annotations() {
        }

        @SerialName("durations")
        @JsonAnnotations2(names = {"durations"})
        public static /* synthetic */ void getDurations$annotations() {
        }

        @SerialName("environment")
        @JsonAnnotations2(names = {"environment"})
        public static /* synthetic */ void getEnvironment$annotations() {
        }

        @SerialName("machineId")
        @JsonAnnotations2(names = {"machine_id"})
        public static /* synthetic */ void getMachine_id$annotations() {
        }

        @SerialName("repository")
        @JsonAnnotations2(names = {"repository"})
        public static /* synthetic */ void getRepository$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getRepository() {
            return this.repository;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCommit_hash() {
            return this.commit_hash;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBenchmark_id() {
            return this.benchmark_id;
        }

        public final java.util.List<Double> component5() {
            return this.durations;
        }

        /* renamed from: component6, reason: from getter */
        public final double getAverage_duration() {
            return this.average_duration;
        }

        /* renamed from: component7, reason: from getter */
        public final String getMachine_id() {
            return this.machine_id;
        }

        /* renamed from: component8, reason: from getter */
        public final EnvironmentDto getEnvironment() {
            return this.environment;
        }

        public final Surrogate copy(String repository, String commit_hash, Instant timestamp, String benchmark_id, java.util.List<Double> durations, double average_duration, String machine_id, EnvironmentDto environment) {
            Intrinsics.checkNotNullParameter(repository, "repository");
            Intrinsics.checkNotNullParameter(commit_hash, "commit_hash");
            Intrinsics.checkNotNullParameter(benchmark_id, "benchmark_id");
            Intrinsics.checkNotNullParameter(durations, "durations");
            Intrinsics.checkNotNullParameter(machine_id, "machine_id");
            Intrinsics.checkNotNullParameter(environment, "environment");
            return new Surrogate(repository, commit_hash, timestamp, benchmark_id, durations, average_duration, machine_id, environment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.repository, surrogate.repository) && Intrinsics.areEqual(this.commit_hash, surrogate.commit_hash) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.benchmark_id, surrogate.benchmark_id) && Intrinsics.areEqual(this.durations, surrogate.durations) && Double.compare(this.average_duration, surrogate.average_duration) == 0 && Intrinsics.areEqual(this.machine_id, surrogate.machine_id) && this.environment == surrogate.environment;
        }

        public int hashCode() {
            int iHashCode = ((this.repository.hashCode() * 31) + this.commit_hash.hashCode()) * 31;
            Instant instant = this.timestamp;
            return ((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.benchmark_id.hashCode()) * 31) + this.durations.hashCode()) * 31) + Double.hashCode(this.average_duration)) * 31) + this.machine_id.hashCode()) * 31) + this.environment.hashCode();
        }

        public String toString() {
            return "Surrogate(repository=" + this.repository + ", commit_hash=" + this.commit_hash + ", timestamp=" + this.timestamp + ", benchmark_id=" + this.benchmark_id + ", durations=" + this.durations + ", average_duration=" + this.average_duration + ", machine_id=" + this.machine_id + ", environment=" + this.environment + ")";
        }

        /* compiled from: ClientSecuritywareBenchmarkEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientSecuritywareBenchmarkEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, Instant instant, String str3, java.util.List list, double d, String str4, EnvironmentDto environmentDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.repository = "";
            } else {
                this.repository = str;
            }
            if ((i & 2) == 0) {
                this.commit_hash = "";
            } else {
                this.commit_hash = str2;
            }
            if ((i & 4) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 8) == 0) {
                this.benchmark_id = "";
            } else {
                this.benchmark_id = str3;
            }
            if ((i & 16) == 0) {
                this.durations = CollectionsKt.emptyList();
            } else {
                this.durations = list;
            }
            if ((i & 32) == 0) {
                this.average_duration = 0.0d;
            } else {
                this.average_duration = d;
            }
            if ((i & 64) == 0) {
                this.machine_id = "";
            } else {
                this.machine_id = str4;
            }
            if ((i & 128) == 0) {
                this.environment = EnvironmentDto.INSTANCE.getZeroValue();
            } else {
                this.environment = environmentDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.repository, "")) {
                output.encodeStringElement(serialDesc, 0, self.repository);
            }
            if (!Intrinsics.areEqual(self.commit_hash, "")) {
                output.encodeStringElement(serialDesc, 1, self.commit_hash);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.benchmark_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.benchmark_id);
            }
            if (!Intrinsics.areEqual(self.durations, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.durations);
            }
            if (Double.compare(self.average_duration, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 5, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.average_duration));
            }
            if (!Intrinsics.areEqual(self.machine_id, "")) {
                output.encodeStringElement(serialDesc, 6, self.machine_id);
            }
            if (self.environment != EnvironmentDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, EnvironmentDto.Serializer.INSTANCE, self.environment);
            }
        }

        public Surrogate(String repository, String commit_hash, Instant instant, String benchmark_id, java.util.List<Double> durations, double d, String machine_id, EnvironmentDto environment) {
            Intrinsics.checkNotNullParameter(repository, "repository");
            Intrinsics.checkNotNullParameter(commit_hash, "commit_hash");
            Intrinsics.checkNotNullParameter(benchmark_id, "benchmark_id");
            Intrinsics.checkNotNullParameter(durations, "durations");
            Intrinsics.checkNotNullParameter(machine_id, "machine_id");
            Intrinsics.checkNotNullParameter(environment, "environment");
            this.repository = repository;
            this.commit_hash = commit_hash;
            this.timestamp = instant;
            this.benchmark_id = benchmark_id;
            this.durations = durations;
            this.average_duration = d;
            this.machine_id = machine_id;
            this.environment = environment;
        }

        public /* synthetic */ Surrogate(String str, String str2, Instant instant, String str3, java.util.List list, double d, String str4, EnvironmentDto environmentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? EnvironmentDto.INSTANCE.getZeroValue() : environmentDto);
        }

        public final String getRepository() {
            return this.repository;
        }

        public final String getCommit_hash() {
            return this.commit_hash;
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getBenchmark_id() {
            return this.benchmark_id;
        }

        public final java.util.List<Double> getDurations() {
            return this.durations;
        }

        public final double getAverage_duration() {
            return this.average_duration;
        }

        public final String getMachine_id() {
            return this.machine_id;
        }

        public final EnvironmentDto getEnvironment() {
            return this.environment;
        }
    }

    /* compiled from: ClientSecuritywareBenchmarkEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ClientSecuritywareBenchmarkEventDto, ClientSecuritywareBenchmarkEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientSecuritywareBenchmarkEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientSecuritywareBenchmarkEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientSecuritywareBenchmarkEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientSecuritywareBenchmarkEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientSecuritywareBenchmarkEvent> getProtoAdapter() {
            return ClientSecuritywareBenchmarkEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientSecuritywareBenchmarkEventDto getZeroValue() {
            return ClientSecuritywareBenchmarkEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientSecuritywareBenchmarkEventDto fromProto(ClientSecuritywareBenchmarkEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String repository = proto.getRepository();
            String commit_hash = proto.getCommit_hash();
            Instant timestamp = proto.getTimestamp();
            String benchmark_id = proto.getBenchmark_id();
            java.util.List<Double> durations = proto.getDurations();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(durations, 10));
            Iterator<T> it = durations.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((Number) it.next()).doubleValue()));
            }
            return new ClientSecuritywareBenchmarkEventDto(new Surrogate(repository, commit_hash, timestamp, benchmark_id, arrayList, proto.getAverage_duration(), proto.getMachine_id(), EnvironmentDto.INSTANCE.fromProto(proto.getEnvironment())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientSecuritywareBenchmarkEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientSecuritywareBenchmarkEventDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new ClientSecuritywareBenchmarkEventDto(null, null, null, null, null, 0.0d, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClientSecuritywareBenchmarkEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0016\u0017B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent$Environment;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "UNKNOWN", "DEFAULT", "BASELINE", "STAGING", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EnvironmentDto implements Dto2<ClientSecuritywareBenchmarkEvent.Environment>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnvironmentDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EnvironmentDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EnvironmentDto, ClientSecuritywareBenchmarkEvent.Environment>> binaryBase64Serializer$delegate;
        private final String json_value;
        public static final EnvironmentDto UNKNOWN = new UNKNOWN("UNKNOWN", 0);
        public static final EnvironmentDto DEFAULT = new DEFAULT("DEFAULT", 1);
        public static final EnvironmentDto BASELINE = new BASELINE("BASELINE", 2);
        public static final EnvironmentDto STAGING = new STAGING("STAGING", 3);

        private static final /* synthetic */ EnvironmentDto[] $values() {
            return new EnvironmentDto[]{UNKNOWN, DEFAULT, BASELINE, STAGING};
        }

        public /* synthetic */ EnvironmentDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2);
        }

        public static EnumEntries<EnvironmentDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private EnvironmentDto(String str, int i, String str2) {
            this.json_value = str2;
        }

        public final String getJson_value() {
            return this.json_value;
        }

        /* compiled from: ClientSecuritywareBenchmarkEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto.EnvironmentDto.UNKNOWN", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent$Environment;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNKNOWN extends EnvironmentDto {
            UNKNOWN(String str, int i) {
                super(str, i, "", null);
            }

            @Override // com.robinhood.idl.Dto
            public ClientSecuritywareBenchmarkEvent.Environment toProto() {
                return ClientSecuritywareBenchmarkEvent.Environment.UNKNOWN;
            }
        }

        static {
            EnvironmentDto[] environmentDtoArr$values = $values();
            $VALUES = environmentDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(environmentDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientSecuritywareBenchmarkEventDto$EnvironmentDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ClientSecuritywareBenchmarkEventDto.EnvironmentDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ClientSecuritywareBenchmarkEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto.EnvironmentDto.DEFAULT", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent$Environment;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEFAULT extends EnvironmentDto {
            DEFAULT(String str, int i) {
                super(str, i, AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, null);
            }

            @Override // com.robinhood.idl.Dto
            public ClientSecuritywareBenchmarkEvent.Environment toProto() {
                return ClientSecuritywareBenchmarkEvent.Environment.DEFAULT;
            }
        }

        /* compiled from: ClientSecuritywareBenchmarkEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto.EnvironmentDto.BASELINE", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent$Environment;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BASELINE extends EnvironmentDto {
            BASELINE(String str, int i) {
                super(str, i, "baseline", null);
            }

            @Override // com.robinhood.idl.Dto
            public ClientSecuritywareBenchmarkEvent.Environment toProto() {
                return ClientSecuritywareBenchmarkEvent.Environment.BASELINE;
            }
        }

        /* compiled from: ClientSecuritywareBenchmarkEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto.EnvironmentDto.STAGING", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent$Environment;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STAGING extends EnvironmentDto {
            STAGING(String str, int i) {
                super(str, i, "staging", null);
            }

            @Override // com.robinhood.idl.Dto
            public ClientSecuritywareBenchmarkEvent.Environment toProto() {
                return ClientSecuritywareBenchmarkEvent.Environment.STAGING;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ClientSecuritywareBenchmarkEventDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEvent$Environment;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EnvironmentDto, ClientSecuritywareBenchmarkEvent.Environment> {

            /* compiled from: ClientSecuritywareBenchmarkEventDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ClientSecuritywareBenchmarkEvent.Environment.values().length];
                    try {
                        iArr[ClientSecuritywareBenchmarkEvent.Environment.UNKNOWN.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ClientSecuritywareBenchmarkEvent.Environment.DEFAULT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ClientSecuritywareBenchmarkEvent.Environment.BASELINE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ClientSecuritywareBenchmarkEvent.Environment.STAGING.ordinal()] = 4;
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

            public final KSerializer<EnvironmentDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EnvironmentDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EnvironmentDto> getBinaryBase64Serializer() {
                return (KSerializer) EnvironmentDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ClientSecuritywareBenchmarkEvent.Environment> getProtoAdapter() {
                return ClientSecuritywareBenchmarkEvent.Environment.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EnvironmentDto getZeroValue() {
                return EnvironmentDto.UNKNOWN;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EnvironmentDto fromProto(ClientSecuritywareBenchmarkEvent.Environment proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return EnvironmentDto.UNKNOWN;
                }
                if (i == 2) {
                    return EnvironmentDto.DEFAULT;
                }
                if (i == 3) {
                    return EnvironmentDto.BASELINE;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return EnvironmentDto.STAGING;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ClientSecuritywareBenchmarkEventDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$EnvironmentDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<EnvironmentDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EnvironmentDto, ClientSecuritywareBenchmarkEvent.Environment> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ClientSecuritywareBenchmarkEvent.Environment", EnvironmentDto.getEntries(), EnvironmentDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EnvironmentDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EnvironmentDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EnvironmentDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EnvironmentDto valueOf(String str) {
            return (EnvironmentDto) Enum.valueOf(EnvironmentDto.class, str);
        }

        public static EnvironmentDto[] values() {
            return (EnvironmentDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ClientSecuritywareBenchmarkEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ClientSecuritywareBenchmarkEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientSecuritywareBenchmarkEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientSecuritywareBenchmarkEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientSecuritywareBenchmarkEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientSecuritywareBenchmarkEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientSecuritywareBenchmarkEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientSecuritywareBenchmarkEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientSecuritywareBenchmarkEventDto";
        }
    }
}
