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

/* compiled from: ClientFirebaseScreenMetricsEventDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00042134B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BM\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0013JQ\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b-\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b.\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b/\u0010 R\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b0\u0010 ¨\u00065"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "screen_name", "metric_name", "", "affected_users", "total_users", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;II)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;II)Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getTimestamp", "()Lj$/time/Instant;", "getScreen_name", "getMetric_name", "getAffected_users", "getTotal_users", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientFirebaseScreenMetricsEventDto implements Dto3<ClientFirebaseScreenMetricsEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientFirebaseScreenMetricsEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientFirebaseScreenMetricsEventDto, ClientFirebaseScreenMetricsEvent>> binaryBase64Serializer$delegate;
    private static final ClientFirebaseScreenMetricsEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientFirebaseScreenMetricsEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientFirebaseScreenMetricsEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getScreen_name() {
        return this.surrogate.getScreen_name();
    }

    public final String getMetric_name() {
        return this.surrogate.getMetric_name();
    }

    public final int getAffected_users() {
        return this.surrogate.getAffected_users();
    }

    public final int getTotal_users() {
        return this.surrogate.getTotal_users();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ClientFirebaseScreenMetricsEventDto(com.robinhood.rosetta.eventlogging.ClientPlatformDto r2, p479j$.time.Instant r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto La
            com.robinhood.rosetta.eventlogging.ClientPlatformDto$Companion r2 = com.robinhood.rosetta.eventlogging.ClientPlatformDto.INSTANCE
            com.robinhood.rosetta.eventlogging.ClientPlatformDto r2 = r2.getZeroValue()
        La:
            r9 = r8 & 2
            if (r9 == 0) goto Lf
            r3 = 0
        Lf:
            r9 = r8 & 4
            java.lang.String r0 = ""
            if (r9 == 0) goto L16
            r4 = r0
        L16:
            r9 = r8 & 8
            if (r9 == 0) goto L1b
            r5 = r0
        L1b:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto L21
            r6 = r0
        L21:
            r8 = r8 & 32
            if (r8 == 0) goto L2d
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L34
        L2d:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L34:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientFirebaseScreenMetricsEventDto.<init>(com.robinhood.rosetta.eventlogging.ClientPlatformDto, j$.time.Instant, java.lang.String, java.lang.String, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientFirebaseScreenMetricsEventDto(ClientPlatformDto platform, Instant instant, String screen_name, String metric_name, int i, int i2) {
        this(new Surrogate(platform, instant, screen_name, metric_name, i, i2));
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(metric_name, "metric_name");
    }

    public static /* synthetic */ ClientFirebaseScreenMetricsEventDto copy$default(ClientFirebaseScreenMetricsEventDto clientFirebaseScreenMetricsEventDto, ClientPlatformDto clientPlatformDto, Instant instant, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            clientPlatformDto = clientFirebaseScreenMetricsEventDto.surrogate.getPlatform();
        }
        if ((i3 & 2) != 0) {
            instant = clientFirebaseScreenMetricsEventDto.surrogate.getTimestamp();
        }
        if ((i3 & 4) != 0) {
            str = clientFirebaseScreenMetricsEventDto.surrogate.getScreen_name();
        }
        if ((i3 & 8) != 0) {
            str2 = clientFirebaseScreenMetricsEventDto.surrogate.getMetric_name();
        }
        if ((i3 & 16) != 0) {
            i = clientFirebaseScreenMetricsEventDto.surrogate.getAffected_users();
        }
        if ((i3 & 32) != 0) {
            i2 = clientFirebaseScreenMetricsEventDto.surrogate.getTotal_users();
        }
        int i4 = i;
        int i5 = i2;
        return clientFirebaseScreenMetricsEventDto.copy(clientPlatformDto, instant, str, str2, i4, i5);
    }

    public final ClientFirebaseScreenMetricsEventDto copy(ClientPlatformDto platform, Instant timestamp, String screen_name, String metric_name, int affected_users, int total_users) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(screen_name, "screen_name");
        Intrinsics.checkNotNullParameter(metric_name, "metric_name");
        return new ClientFirebaseScreenMetricsEventDto(new Surrogate(platform, timestamp, screen_name, metric_name, affected_users, total_users));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientFirebaseScreenMetricsEvent toProto() {
        return new ClientFirebaseScreenMetricsEvent((ClientPlatform) this.surrogate.getPlatform().toProto(), this.surrogate.getTimestamp(), this.surrogate.getScreen_name(), this.surrogate.getMetric_name(), this.surrogate.getAffected_users(), this.surrogate.getTotal_users(), null, 64, null);
    }

    public String toString() {
        return "[ClientFirebaseScreenMetricsEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientFirebaseScreenMetricsEventDto) && Intrinsics.areEqual(((ClientFirebaseScreenMetricsEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientFirebaseScreenMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 C2\u00020\u0001:\u0002DCB\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e¢\u0006\u0004\b\u0011\u0010\u0012BS\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J6\u0010\"\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010%J\u001f\u0010'\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0090\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0017\b\u0002\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010\u0010\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000eHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b,\u0010%J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b-\u0010(J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010!RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b8\u00105\u001a\u0004\b7\u0010#R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00109\u0012\u0004\b;\u00105\u001a\u0004\b:\u0010%R \u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00109\u0012\u0004\b=\u00105\u001a\u0004\b<\u0010%R/\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010>\u0012\u0004\b@\u00105\u001a\u0004\b?\u0010(R/\u0010\u0010\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010>\u0012\u0004\bB\u00105\u001a\u0004\bA\u0010(¨\u0006E"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "", "screen_name", "metric_name", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "affected_users", "total_users", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;II)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Lj$/time/Instant;", "component3", "()Ljava/lang/String;", "component4", "component5", "()I", "component6", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;II)Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto$Surrogate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Ljava/lang/String;", "getScreen_name", "getScreen_name$annotations", "getMetric_name", "getMetric_name$annotations", "I", "getAffected_users", "getAffected_users$annotations", "getTotal_users", "getTotal_users$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int affected_users;
        private final String metric_name;
        private final ClientPlatformDto platform;
        private final String screen_name;
        private final Instant timestamp;
        private final int total_users;

        public Surrogate() {
            this((ClientPlatformDto) null, (Instant) null, (String) null, (String) null, 0, 0, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ClientPlatformDto clientPlatformDto, Instant instant, String str, String str2, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                clientPlatformDto = surrogate.platform;
            }
            if ((i3 & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i3 & 4) != 0) {
                str = surrogate.screen_name;
            }
            if ((i3 & 8) != 0) {
                str2 = surrogate.metric_name;
            }
            if ((i3 & 16) != 0) {
                i = surrogate.affected_users;
            }
            if ((i3 & 32) != 0) {
                i2 = surrogate.total_users;
            }
            int i4 = i;
            int i5 = i2;
            return surrogate.copy(clientPlatformDto, instant, str, str2, i4, i5);
        }

        @SerialName("affectedUsers")
        @JsonAnnotations2(names = {"affected_users"})
        public static /* synthetic */ void getAffected_users$annotations() {
        }

        @SerialName("metricName")
        @JsonAnnotations2(names = {"metric_name"})
        public static /* synthetic */ void getMetric_name$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("screenName")
        @JsonAnnotations2(names = {"screen_name"})
        public static /* synthetic */ void getScreen_name$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
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
        public final String getScreen_name() {
            return this.screen_name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMetric_name() {
            return this.metric_name;
        }

        /* renamed from: component5, reason: from getter */
        public final int getAffected_users() {
            return this.affected_users;
        }

        /* renamed from: component6, reason: from getter */
        public final int getTotal_users() {
            return this.total_users;
        }

        public final Surrogate copy(ClientPlatformDto platform, Instant timestamp, String screen_name, String metric_name, int affected_users, int total_users) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(screen_name, "screen_name");
            Intrinsics.checkNotNullParameter(metric_name, "metric_name");
            return new Surrogate(platform, timestamp, screen_name, metric_name, affected_users, total_users);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.screen_name, surrogate.screen_name) && Intrinsics.areEqual(this.metric_name, surrogate.metric_name) && this.affected_users == surrogate.affected_users && this.total_users == surrogate.total_users;
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            Instant instant = this.timestamp;
            return ((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.screen_name.hashCode()) * 31) + this.metric_name.hashCode()) * 31) + Integer.hashCode(this.affected_users)) * 31) + Integer.hashCode(this.total_users);
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", timestamp=" + this.timestamp + ", screen_name=" + this.screen_name + ", metric_name=" + this.metric_name + ", affected_users=" + this.affected_users + ", total_users=" + this.total_users + ")";
        }

        /* compiled from: ClientFirebaseScreenMetricsEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientFirebaseScreenMetricsEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, Instant instant, String str, String str2, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
            this.platform = (i & 1) == 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto;
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.screen_name = "";
            } else {
                this.screen_name = str;
            }
            if ((i & 8) == 0) {
                this.metric_name = "";
            } else {
                this.metric_name = str2;
            }
            if ((i & 16) == 0) {
                this.affected_users = 0;
            } else {
                this.affected_users = i2;
            }
            if ((i & 32) == 0) {
                this.total_users = 0;
            } else {
                this.total_users = i3;
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
            if (!Intrinsics.areEqual(self.screen_name, "")) {
                output.encodeStringElement(serialDesc, 2, self.screen_name);
            }
            if (!Intrinsics.areEqual(self.metric_name, "")) {
                output.encodeStringElement(serialDesc, 3, self.metric_name);
            }
            int i = self.affected_users;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.total_users;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
        }

        public Surrogate(ClientPlatformDto platform, Instant instant, String screen_name, String metric_name, int i, int i2) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(screen_name, "screen_name");
            Intrinsics.checkNotNullParameter(metric_name, "metric_name");
            this.platform = platform;
            this.timestamp = instant;
            this.screen_name = screen_name;
            this.metric_name = metric_name;
            this.affected_users = i;
            this.total_users = i2;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.rosetta.eventlogging.ClientPlatformDto r2, p479j$.time.Instant r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto La
                com.robinhood.rosetta.eventlogging.ClientPlatformDto$Companion r2 = com.robinhood.rosetta.eventlogging.ClientPlatformDto.INSTANCE
                com.robinhood.rosetta.eventlogging.ClientPlatformDto r2 = r2.getZeroValue()
            La:
                r9 = r8 & 2
                if (r9 == 0) goto Lf
                r3 = 0
            Lf:
                r9 = r8 & 4
                java.lang.String r0 = ""
                if (r9 == 0) goto L16
                r4 = r0
            L16:
                r9 = r8 & 8
                if (r9 == 0) goto L1b
                r5 = r0
            L1b:
                r9 = r8 & 16
                r0 = 0
                if (r9 == 0) goto L21
                r6 = r0
            L21:
                r8 = r8 & 32
                if (r8 == 0) goto L2d
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L34
            L2d:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L34:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientFirebaseScreenMetricsEventDto.Surrogate.<init>(com.robinhood.rosetta.eventlogging.ClientPlatformDto, j$.time.Instant, java.lang.String, java.lang.String, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getScreen_name() {
            return this.screen_name;
        }

        public final String getMetric_name() {
            return this.metric_name;
        }

        public final int getAffected_users() {
            return this.affected_users;
        }

        public final int getTotal_users() {
            return this.total_users;
        }
    }

    /* compiled from: ClientFirebaseScreenMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ClientFirebaseScreenMetricsEventDto, ClientFirebaseScreenMetricsEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientFirebaseScreenMetricsEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientFirebaseScreenMetricsEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientFirebaseScreenMetricsEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientFirebaseScreenMetricsEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientFirebaseScreenMetricsEvent> getProtoAdapter() {
            return ClientFirebaseScreenMetricsEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientFirebaseScreenMetricsEventDto getZeroValue() {
            return ClientFirebaseScreenMetricsEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientFirebaseScreenMetricsEventDto fromProto(ClientFirebaseScreenMetricsEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ClientFirebaseScreenMetricsEventDto(new Surrogate(ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform()), proto.getTimestamp(), proto.getScreen_name(), proto.getMetric_name(), proto.getAffected_users(), proto.getTotal_users()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientFirebaseScreenMetricsEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientFirebaseScreenMetricsEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientFirebaseScreenMetricsEventDto(null, null, null, null, 0, 0, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientFirebaseScreenMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientFirebaseScreenMetricsEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientFirebaseScreenMetricsEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientFirebaseScreenMetricsEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientFirebaseScreenMetricsEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientFirebaseScreenMetricsEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientFirebaseScreenMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientFirebaseScreenMetricsEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientFirebaseScreenMetricsEventDto";
        }
    }
}
