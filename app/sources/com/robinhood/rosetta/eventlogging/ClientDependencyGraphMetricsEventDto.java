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
import com.squareup.wire.ProtoAdapter;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
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

/* compiled from: ClientDependencyGraphMetricsEventDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00044356B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0014J[\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b0\u0010!R\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b1\u0010!R\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b2\u0010!¨\u00067"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "name", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "", "depth", "breadth", "module_count", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;III)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;III)Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getTimestamp", "()Lj$/time/Instant;", "getName", "getConfiguration", "getDepth", "getBreadth", "getModule_count", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientDependencyGraphMetricsEventDto implements Dto3<ClientDependencyGraphMetricsEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientDependencyGraphMetricsEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientDependencyGraphMetricsEventDto, ClientDependencyGraphMetricsEvent>> binaryBase64Serializer$delegate;
    private static final ClientDependencyGraphMetricsEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientDependencyGraphMetricsEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientDependencyGraphMetricsEventDto(Surrogate surrogate) {
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

    public final String getConfiguration() {
        return this.surrogate.getConfiguration();
    }

    public final int getDepth() {
        return this.surrogate.getDepth();
    }

    public final int getBreadth() {
        return this.surrogate.getBreadth();
    }

    public final int getModule_count() {
        return this.surrogate.getModule_count();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ClientDependencyGraphMetricsEventDto(com.robinhood.rosetta.eventlogging.ClientPlatformDto r2, p479j$.time.Instant r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto La
            com.robinhood.rosetta.eventlogging.ClientPlatformDto$Companion r2 = com.robinhood.rosetta.eventlogging.ClientPlatformDto.INSTANCE
            com.robinhood.rosetta.eventlogging.ClientPlatformDto r2 = r2.getZeroValue()
        La:
            r10 = r9 & 2
            if (r10 == 0) goto Lf
            r3 = 0
        Lf:
            r10 = r9 & 4
            java.lang.String r0 = ""
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
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientDependencyGraphMetricsEventDto.<init>(com.robinhood.rosetta.eventlogging.ClientPlatformDto, j$.time.Instant, java.lang.String, java.lang.String, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientDependencyGraphMetricsEventDto(ClientPlatformDto platform, Instant instant, String name, String configuration, int i, int i2, int i3) {
        this(new Surrogate(platform, instant, name, configuration, i, i2, i3));
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
    }

    public static /* synthetic */ ClientDependencyGraphMetricsEventDto copy$default(ClientDependencyGraphMetricsEventDto clientDependencyGraphMetricsEventDto, ClientPlatformDto clientPlatformDto, Instant instant, String str, String str2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            clientPlatformDto = clientDependencyGraphMetricsEventDto.surrogate.getPlatform();
        }
        if ((i4 & 2) != 0) {
            instant = clientDependencyGraphMetricsEventDto.surrogate.getTimestamp();
        }
        if ((i4 & 4) != 0) {
            str = clientDependencyGraphMetricsEventDto.surrogate.getName();
        }
        if ((i4 & 8) != 0) {
            str2 = clientDependencyGraphMetricsEventDto.surrogate.getConfiguration();
        }
        if ((i4 & 16) != 0) {
            i = clientDependencyGraphMetricsEventDto.surrogate.getDepth();
        }
        if ((i4 & 32) != 0) {
            i2 = clientDependencyGraphMetricsEventDto.surrogate.getBreadth();
        }
        if ((i4 & 64) != 0) {
            i3 = clientDependencyGraphMetricsEventDto.surrogate.getModule_count();
        }
        int i5 = i2;
        int i6 = i3;
        int i7 = i;
        String str3 = str;
        return clientDependencyGraphMetricsEventDto.copy(clientPlatformDto, instant, str3, str2, i7, i5, i6);
    }

    public final ClientDependencyGraphMetricsEventDto copy(ClientPlatformDto platform, Instant timestamp, String name, String configuration, int depth, int breadth, int module_count) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new ClientDependencyGraphMetricsEventDto(new Surrogate(platform, timestamp, name, configuration, depth, breadth, module_count));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientDependencyGraphMetricsEvent toProto() {
        return new ClientDependencyGraphMetricsEvent((ClientPlatform) this.surrogate.getPlatform().toProto(), this.surrogate.getTimestamp(), this.surrogate.getName(), this.surrogate.getConfiguration(), this.surrogate.getDepth(), this.surrogate.getBreadth(), this.surrogate.getModule_count(), null, 128, null);
    }

    public String toString() {
        return "[ClientDependencyGraphMetricsEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientDependencyGraphMetricsEventDto) && Intrinsics.areEqual(((ClientDependencyGraphMetricsEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientDependencyGraphMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0083\b\u0018\u0000 G2\u00020\u0001:\u0002HGB \u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e¢\u0006\u0004\b\u0012\u0010\u0013B[\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J6\u0010#\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b*\u0010)J\u001f\u0010+\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b+\u0010)J©\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0017\b\u0002\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010\u0010\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010\u0011\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000eHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b.\u0010&J\u0010\u0010/\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b/\u0010)J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\"RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00108\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010$R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010;\u0012\u0004\b=\u00107\u001a\u0004\b<\u0010&R \u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010;\u0012\u0004\b?\u00107\u001a\u0004\b>\u0010&R/\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010@\u0012\u0004\bB\u00107\u001a\u0004\bA\u0010)R/\u0010\u0010\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010@\u0012\u0004\bD\u00107\u001a\u0004\bC\u0010)R/\u0010\u0011\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010@\u0012\u0004\bF\u00107\u001a\u0004\bE\u0010)¨\u0006I"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "", "name", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "depth", "breadth", "module_count", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;III)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Lj$/time/Instant;", "component3", "()Ljava/lang/String;", "component4", "component5", "()I", "component6", "component7", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;III)Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto$Surrogate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Ljava/lang/String;", "getName", "getName$annotations", "getConfiguration", "getConfiguration$annotations", "I", "getDepth", "getDepth$annotations", "getBreadth", "getBreadth$annotations", "getModule_count", "getModule_count$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int breadth;
        private final String configuration;
        private final int depth;
        private final int module_count;
        private final String name;
        private final ClientPlatformDto platform;
        private final Instant timestamp;

        public Surrogate() {
            this((ClientPlatformDto) null, (Instant) null, (String) null, (String) null, 0, 0, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ClientPlatformDto clientPlatformDto, Instant instant, String str, String str2, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                clientPlatformDto = surrogate.platform;
            }
            if ((i4 & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i4 & 4) != 0) {
                str = surrogate.name;
            }
            if ((i4 & 8) != 0) {
                str2 = surrogate.configuration;
            }
            if ((i4 & 16) != 0) {
                i = surrogate.depth;
            }
            if ((i4 & 32) != 0) {
                i2 = surrogate.breadth;
            }
            if ((i4 & 64) != 0) {
                i3 = surrogate.module_count;
            }
            int i5 = i2;
            int i6 = i3;
            int i7 = i;
            String str3 = str;
            return surrogate.copy(clientPlatformDto, instant, str3, str2, i7, i5, i6);
        }

        @SerialName("breadth")
        @JsonAnnotations2(names = {"breadth"})
        public static /* synthetic */ void getBreadth$annotations() {
        }

        @SerialName(EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION)
        @JsonAnnotations2(names = {EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION})
        public static /* synthetic */ void getConfiguration$annotations() {
        }

        @SerialName("depth")
        @JsonAnnotations2(names = {"depth"})
        public static /* synthetic */ void getDepth$annotations() {
        }

        @SerialName("moduleCount")
        @JsonAnnotations2(names = {"module_count"})
        public static /* synthetic */ void getModule_count$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
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
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component5, reason: from getter */
        public final int getDepth() {
            return this.depth;
        }

        /* renamed from: component6, reason: from getter */
        public final int getBreadth() {
            return this.breadth;
        }

        /* renamed from: component7, reason: from getter */
        public final int getModule_count() {
            return this.module_count;
        }

        public final Surrogate copy(ClientPlatformDto platform, Instant timestamp, String name, String configuration, int depth, int breadth, int module_count) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new Surrogate(platform, timestamp, name, configuration, depth, breadth, module_count);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.configuration, surrogate.configuration) && this.depth == surrogate.depth && this.breadth == surrogate.breadth && this.module_count == surrogate.module_count;
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            Instant instant = this.timestamp;
            return ((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.name.hashCode()) * 31) + this.configuration.hashCode()) * 31) + Integer.hashCode(this.depth)) * 31) + Integer.hashCode(this.breadth)) * 31) + Integer.hashCode(this.module_count);
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", timestamp=" + this.timestamp + ", name=" + this.name + ", configuration=" + this.configuration + ", depth=" + this.depth + ", breadth=" + this.breadth + ", module_count=" + this.module_count + ")";
        }

        /* compiled from: ClientDependencyGraphMetricsEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientDependencyGraphMetricsEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, Instant instant, String str, String str2, int i2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.configuration = "";
            } else {
                this.configuration = str2;
            }
            if ((i & 16) == 0) {
                this.depth = 0;
            } else {
                this.depth = i2;
            }
            if ((i & 32) == 0) {
                this.breadth = 0;
            } else {
                this.breadth = i3;
            }
            if ((i & 64) == 0) {
                this.module_count = 0;
            } else {
                this.module_count = i4;
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
            if (!Intrinsics.areEqual(self.configuration, "")) {
                output.encodeStringElement(serialDesc, 3, self.configuration);
            }
            int i = self.depth;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.breadth;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            int i3 = self.module_count;
            if (i3 != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
            }
        }

        public Surrogate(ClientPlatformDto platform, Instant instant, String name, String configuration, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.platform = platform;
            this.timestamp = instant;
            this.name = name;
            this.configuration = configuration;
            this.depth = i;
            this.breadth = i2;
            this.module_count = i3;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.rosetta.eventlogging.ClientPlatformDto r2, p479j$.time.Instant r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto La
                com.robinhood.rosetta.eventlogging.ClientPlatformDto$Companion r2 = com.robinhood.rosetta.eventlogging.ClientPlatformDto.INSTANCE
                com.robinhood.rosetta.eventlogging.ClientPlatformDto r2 = r2.getZeroValue()
            La:
                r10 = r9 & 2
                if (r10 == 0) goto Lf
                r3 = 0
            Lf:
                r10 = r9 & 4
                java.lang.String r0 = ""
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
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientDependencyGraphMetricsEventDto.Surrogate.<init>(com.robinhood.rosetta.eventlogging.ClientPlatformDto, j$.time.Instant, java.lang.String, java.lang.String, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getName() {
            return this.name;
        }

        public final String getConfiguration() {
            return this.configuration;
        }

        public final int getDepth() {
            return this.depth;
        }

        public final int getBreadth() {
            return this.breadth;
        }

        public final int getModule_count() {
            return this.module_count;
        }
    }

    /* compiled from: ClientDependencyGraphMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ClientDependencyGraphMetricsEventDto, ClientDependencyGraphMetricsEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientDependencyGraphMetricsEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientDependencyGraphMetricsEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientDependencyGraphMetricsEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientDependencyGraphMetricsEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientDependencyGraphMetricsEvent> getProtoAdapter() {
            return ClientDependencyGraphMetricsEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientDependencyGraphMetricsEventDto getZeroValue() {
            return ClientDependencyGraphMetricsEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientDependencyGraphMetricsEventDto fromProto(ClientDependencyGraphMetricsEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ClientDependencyGraphMetricsEventDto(new Surrogate(ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform()), proto.getTimestamp(), proto.getName(), proto.getConfiguration(), proto.getDepth(), proto.getBreadth(), proto.getModule_count()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientDependencyGraphMetricsEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientDependencyGraphMetricsEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientDependencyGraphMetricsEventDto(null, null, null, null, 0, 0, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientDependencyGraphMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientDependencyGraphMetricsEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientDependencyGraphMetricsEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientDependencyGraphMetricsEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientDependencyGraphMetricsEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientDependencyGraphMetricsEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientDependencyGraphMetricsEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientDependencyGraphMetricsEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientDependencyGraphMetricsEventDto";
        }
    }
}
