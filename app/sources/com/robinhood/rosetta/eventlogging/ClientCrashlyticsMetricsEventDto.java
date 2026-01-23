package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.ClientAppDto;
import com.robinhood.rosetta.eventlogging.ClientPlatformDto;
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

/* compiled from: ClientCrashlyticsMetricsEventDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004879:B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Ba\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0006\u0010\u0016Je\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u0010#R\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b1\u0010#R\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b2\u0010#R\u0011\u0010\u0011\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b3\u0010#R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b6\u0010\u001c¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "crashed_users", "total_users", "crashed_sessions", "total_sessions", "Lcom/robinhood/rosetta/eventlogging/ClientAppDto;", "app", "", "source", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;IIIILcom/robinhood/rosetta/eventlogging/ClientAppDto;Ljava/lang/String;)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;IIIILcom/robinhood/rosetta/eventlogging/ClientAppDto;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getTimestamp", "()Lj$/time/Instant;", "getCrashed_users", "getTotal_users", "getCrashed_sessions", "getTotal_sessions", "getApp", "()Lcom/robinhood/rosetta/eventlogging/ClientAppDto;", "getSource", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientCrashlyticsMetricsEventDto implements Dto3<ClientCrashlyticsMetricsEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientCrashlyticsMetricsEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientCrashlyticsMetricsEventDto, ClientCrashlyticsMetricsEvent>> binaryBase64Serializer$delegate;
    private static final ClientCrashlyticsMetricsEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientCrashlyticsMetricsEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientCrashlyticsMetricsEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final int getCrashed_users() {
        return this.surrogate.getCrashed_users();
    }

    public final int getTotal_users() {
        return this.surrogate.getTotal_users();
    }

    public final int getCrashed_sessions() {
        return this.surrogate.getCrashed_sessions();
    }

    public final int getTotal_sessions() {
        return this.surrogate.getTotal_sessions();
    }

    public final ClientAppDto getApp() {
        return this.surrogate.getApp();
    }

    public final String getSource() {
        return this.surrogate.getSource();
    }

    public /* synthetic */ ClientCrashlyticsMetricsEventDto(ClientPlatformDto clientPlatformDto, Instant instant, int i, int i2, int i3, int i4, ClientAppDto clientAppDto, String str, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i5 & 2) != 0 ? null : instant, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4, (i5 & 64) != 0 ? ClientAppDto.INSTANCE.getZeroValue() : clientAppDto, (i5 & 128) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientCrashlyticsMetricsEventDto(ClientPlatformDto platform, Instant instant, int i, int i2, int i3, int i4, ClientAppDto app, String source) {
        this(new Surrogate(platform, instant, i, i2, i3, i4, app, source));
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(source, "source");
    }

    public static /* synthetic */ ClientCrashlyticsMetricsEventDto copy$default(ClientCrashlyticsMetricsEventDto clientCrashlyticsMetricsEventDto, ClientPlatformDto clientPlatformDto, Instant instant, int i, int i2, int i3, int i4, ClientAppDto clientAppDto, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            clientPlatformDto = clientCrashlyticsMetricsEventDto.surrogate.getPlatform();
        }
        if ((i5 & 2) != 0) {
            instant = clientCrashlyticsMetricsEventDto.surrogate.getTimestamp();
        }
        if ((i5 & 4) != 0) {
            i = clientCrashlyticsMetricsEventDto.surrogate.getCrashed_users();
        }
        if ((i5 & 8) != 0) {
            i2 = clientCrashlyticsMetricsEventDto.surrogate.getTotal_users();
        }
        if ((i5 & 16) != 0) {
            i3 = clientCrashlyticsMetricsEventDto.surrogate.getCrashed_sessions();
        }
        if ((i5 & 32) != 0) {
            i4 = clientCrashlyticsMetricsEventDto.surrogate.getTotal_sessions();
        }
        if ((i5 & 64) != 0) {
            clientAppDto = clientCrashlyticsMetricsEventDto.surrogate.getApp();
        }
        if ((i5 & 128) != 0) {
            str = clientCrashlyticsMetricsEventDto.surrogate.getSource();
        }
        ClientAppDto clientAppDto2 = clientAppDto;
        String str2 = str;
        int i6 = i3;
        int i7 = i4;
        return clientCrashlyticsMetricsEventDto.copy(clientPlatformDto, instant, i, i2, i6, i7, clientAppDto2, str2);
    }

    public final ClientCrashlyticsMetricsEventDto copy(ClientPlatformDto platform, Instant timestamp, int crashed_users, int total_users, int crashed_sessions, int total_sessions, ClientAppDto app, String source) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(source, "source");
        return new ClientCrashlyticsMetricsEventDto(new Surrogate(platform, timestamp, crashed_users, total_users, crashed_sessions, total_sessions, app, source));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientCrashlyticsMetricsEvent toProto() {
        return new ClientCrashlyticsMetricsEvent((ClientPlatform) this.surrogate.getPlatform().toProto(), this.surrogate.getTimestamp(), this.surrogate.getCrashed_users(), this.surrogate.getTotal_users(), this.surrogate.getCrashed_sessions(), this.surrogate.getTotal_sessions(), (ClientApp) this.surrogate.getApp().toProto(), this.surrogate.getSource(), null, 256, null);
    }

    public String toString() {
        return "[ClientCrashlyticsMetricsEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientCrashlyticsMetricsEventDto) && Intrinsics.areEqual(((ClientCrashlyticsMetricsEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientCrashlyticsMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 N2\u00020\u0001:\u0002ONB¹\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\r\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Bc\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J6\u0010%\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b)\u0010(J\u001f\u0010*\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b*\u0010(J\u001f\u0010+\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000bHÆ\u0003¢\u0006\u0004\b+\u0010(J\u0010\u0010,\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b.\u0010/JÂ\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\r\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\u0017\b\u0002\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b2\u0010/J\u0010\u00103\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b3\u0010(J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010$RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\b>\u0010;\u001a\u0004\b=\u0010&R/\u0010\f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010?\u0012\u0004\bA\u0010;\u001a\u0004\b@\u0010(R/\u0010\r\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010?\u0012\u0004\bC\u0010;\u001a\u0004\bB\u0010(R/\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010?\u0012\u0004\bE\u0010;\u001a\u0004\bD\u0010(R/\u0010\u000f\u001a\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010?\u0012\u0004\bG\u0010;\u001a\u0004\bF\u0010(R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010H\u0012\u0004\bJ\u0010;\u001a\u0004\bI\u0010-R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010K\u0012\u0004\bM\u0010;\u001a\u0004\bL\u0010/¨\u0006P"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "crashed_users", "total_users", "crashed_sessions", "total_sessions", "Lcom/robinhood/rosetta/eventlogging/ClientAppDto;", "app", "", "source", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;IIIILcom/robinhood/rosetta/eventlogging/ClientAppDto;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;IIIILcom/robinhood/rosetta/eventlogging/ClientAppDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Lj$/time/Instant;", "component3", "()I", "component4", "component5", "component6", "component7", "()Lcom/robinhood/rosetta/eventlogging/ClientAppDto;", "component8", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;IIIILcom/robinhood/rosetta/eventlogging/ClientAppDto;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto$Surrogate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "I", "getCrashed_users", "getCrashed_users$annotations", "getTotal_users", "getTotal_users$annotations", "getCrashed_sessions", "getCrashed_sessions$annotations", "getTotal_sessions", "getTotal_sessions$annotations", "Lcom/robinhood/rosetta/eventlogging/ClientAppDto;", "getApp", "getApp$annotations", "Ljava/lang/String;", "getSource", "getSource$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ClientAppDto app;
        private final int crashed_sessions;
        private final int crashed_users;
        private final ClientPlatformDto platform;
        private final String source;
        private final Instant timestamp;
        private final int total_sessions;
        private final int total_users;

        public Surrogate() {
            this((ClientPlatformDto) null, (Instant) null, 0, 0, 0, 0, (ClientAppDto) null, (String) null, 255, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ClientPlatformDto clientPlatformDto, Instant instant, int i, int i2, int i3, int i4, ClientAppDto clientAppDto, String str, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                clientPlatformDto = surrogate.platform;
            }
            if ((i5 & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i5 & 4) != 0) {
                i = surrogate.crashed_users;
            }
            if ((i5 & 8) != 0) {
                i2 = surrogate.total_users;
            }
            if ((i5 & 16) != 0) {
                i3 = surrogate.crashed_sessions;
            }
            if ((i5 & 32) != 0) {
                i4 = surrogate.total_sessions;
            }
            if ((i5 & 64) != 0) {
                clientAppDto = surrogate.app;
            }
            if ((i5 & 128) != 0) {
                str = surrogate.source;
            }
            ClientAppDto clientAppDto2 = clientAppDto;
            String str2 = str;
            int i6 = i3;
            int i7 = i4;
            return surrogate.copy(clientPlatformDto, instant, i, i2, i6, i7, clientAppDto2, str2);
        }

        @SerialName("app")
        @JsonAnnotations2(names = {"app"})
        public static /* synthetic */ void getApp$annotations() {
        }

        @SerialName("crashedSessions")
        @JsonAnnotations2(names = {"crashed_sessions"})
        public static /* synthetic */ void getCrashed_sessions$annotations() {
        }

        @SerialName("crashedUsers")
        @JsonAnnotations2(names = {"crashed_users"})
        public static /* synthetic */ void getCrashed_users$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("totalSessions")
        @JsonAnnotations2(names = {"total_sessions"})
        public static /* synthetic */ void getTotal_sessions$annotations() {
        }

        @SerialName("totalUsers")
        @JsonAnnotations2(names = {"total_users"})
        public static /* synthetic */ void getTotal_users$annotations() {
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
        public final int getCrashed_users() {
            return this.crashed_users;
        }

        /* renamed from: component4, reason: from getter */
        public final int getTotal_users() {
            return this.total_users;
        }

        /* renamed from: component5, reason: from getter */
        public final int getCrashed_sessions() {
            return this.crashed_sessions;
        }

        /* renamed from: component6, reason: from getter */
        public final int getTotal_sessions() {
            return this.total_sessions;
        }

        /* renamed from: component7, reason: from getter */
        public final ClientAppDto getApp() {
            return this.app;
        }

        /* renamed from: component8, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Surrogate copy(ClientPlatformDto platform, Instant timestamp, int crashed_users, int total_users, int crashed_sessions, int total_sessions, ClientAppDto app, String source) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Surrogate(platform, timestamp, crashed_users, total_users, crashed_sessions, total_sessions, app, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && this.crashed_users == surrogate.crashed_users && this.total_users == surrogate.total_users && this.crashed_sessions == surrogate.crashed_sessions && this.total_sessions == surrogate.total_sessions && this.app == surrogate.app && Intrinsics.areEqual(this.source, surrogate.source);
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            Instant instant = this.timestamp;
            return ((((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + Integer.hashCode(this.crashed_users)) * 31) + Integer.hashCode(this.total_users)) * 31) + Integer.hashCode(this.crashed_sessions)) * 31) + Integer.hashCode(this.total_sessions)) * 31) + this.app.hashCode()) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", timestamp=" + this.timestamp + ", crashed_users=" + this.crashed_users + ", total_users=" + this.total_users + ", crashed_sessions=" + this.crashed_sessions + ", total_sessions=" + this.total_sessions + ", app=" + this.app + ", source=" + this.source + ")";
        }

        /* compiled from: ClientCrashlyticsMetricsEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientCrashlyticsMetricsEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, Instant instant, int i2, int i3, int i4, int i5, ClientAppDto clientAppDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.platform = (i & 1) == 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto;
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.crashed_users = 0;
            } else {
                this.crashed_users = i2;
            }
            if ((i & 8) == 0) {
                this.total_users = 0;
            } else {
                this.total_users = i3;
            }
            if ((i & 16) == 0) {
                this.crashed_sessions = 0;
            } else {
                this.crashed_sessions = i4;
            }
            if ((i & 32) == 0) {
                this.total_sessions = 0;
            } else {
                this.total_sessions = i5;
            }
            if ((i & 64) == 0) {
                this.app = ClientAppDto.INSTANCE.getZeroValue();
            } else {
                this.app = clientAppDto;
            }
            if ((i & 128) == 0) {
                this.source = "";
            } else {
                this.source = str;
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
            int i = self.crashed_users;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.total_users;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            int i3 = self.crashed_sessions;
            if (i3 != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
            }
            int i4 = self.total_sessions;
            if (i4 != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i4));
            }
            if (self.app != ClientAppDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, ClientAppDto.Serializer.INSTANCE, self.app);
            }
            if (Intrinsics.areEqual(self.source, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 7, self.source);
        }

        public Surrogate(ClientPlatformDto platform, Instant instant, int i, int i2, int i3, int i4, ClientAppDto app, String source) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(source, "source");
            this.platform = platform;
            this.timestamp = instant;
            this.crashed_users = i;
            this.total_users = i2;
            this.crashed_sessions = i3;
            this.total_sessions = i4;
            this.app = app;
            this.source = source;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        public /* synthetic */ Surrogate(ClientPlatformDto clientPlatformDto, Instant instant, int i, int i2, int i3, int i4, ClientAppDto clientAppDto, String str, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto, (i5 & 2) != 0 ? null : instant, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? 0 : i4, (i5 & 64) != 0 ? ClientAppDto.INSTANCE.getZeroValue() : clientAppDto, (i5 & 128) != 0 ? "" : str);
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final int getCrashed_users() {
            return this.crashed_users;
        }

        public final int getTotal_users() {
            return this.total_users;
        }

        public final int getCrashed_sessions() {
            return this.crashed_sessions;
        }

        public final int getTotal_sessions() {
            return this.total_sessions;
        }

        public final ClientAppDto getApp() {
            return this.app;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: ClientCrashlyticsMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ClientCrashlyticsMetricsEventDto, ClientCrashlyticsMetricsEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientCrashlyticsMetricsEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientCrashlyticsMetricsEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientCrashlyticsMetricsEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientCrashlyticsMetricsEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientCrashlyticsMetricsEvent> getProtoAdapter() {
            return ClientCrashlyticsMetricsEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientCrashlyticsMetricsEventDto getZeroValue() {
            return ClientCrashlyticsMetricsEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientCrashlyticsMetricsEventDto fromProto(ClientCrashlyticsMetricsEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ClientCrashlyticsMetricsEventDto(new Surrogate(ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform()), proto.getTimestamp(), proto.getCrashed_users(), proto.getTotal_users(), proto.getCrashed_sessions(), proto.getTotal_sessions(), ClientAppDto.INSTANCE.fromProto(proto.getApp()), proto.getSource()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientCrashlyticsMetricsEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientCrashlyticsMetricsEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientCrashlyticsMetricsEventDto(null, null, 0, 0, 0, 0, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientCrashlyticsMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientCrashlyticsMetricsEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientCrashlyticsMetricsEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientCrashlyticsMetricsEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientCrashlyticsMetricsEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientCrashlyticsMetricsEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientCrashlyticsMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCrashlyticsMetricsEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientCrashlyticsMetricsEventDto";
        }
    }
}
