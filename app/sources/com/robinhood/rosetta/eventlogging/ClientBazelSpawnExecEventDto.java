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

/* compiled from: ClientBazelSpawnExecEventDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000498:;B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Ba\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u0017Je\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0014H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0014H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b6\u0010#R\u0011\u0010\u0016\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b7\u0010\u001d¨\u0006<"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "mnemonic", "target_label", "", "total_time_in_seconds", "", "cache_hit", "", "exit_code", "pipeline_slug", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;FZILjava/lang/String;)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;FZILjava/lang/String;)Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEvent;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getTimestamp", "()Lj$/time/Instant;", "getMnemonic", "getTarget_label", "getTotal_time_in_seconds", "()F", "getCache_hit", "()Z", "getExit_code", "getPipeline_slug", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class ClientBazelSpawnExecEventDto implements Dto3<ClientBazelSpawnExecEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientBazelSpawnExecEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientBazelSpawnExecEventDto, ClientBazelSpawnExecEvent>> binaryBase64Serializer$delegate;
    private static final ClientBazelSpawnExecEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientBazelSpawnExecEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientBazelSpawnExecEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getMnemonic() {
        return this.surrogate.getMnemonic();
    }

    public final String getTarget_label() {
        return this.surrogate.getTarget_label();
    }

    public final float getTotal_time_in_seconds() {
        return this.surrogate.getTotal_time_in_seconds();
    }

    public final boolean getCache_hit() {
        return this.surrogate.getCache_hit();
    }

    public final int getExit_code() {
        return this.surrogate.getExit_code();
    }

    public final String getPipeline_slug() {
        return this.surrogate.getPipeline_slug();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ClientBazelSpawnExecEventDto(com.robinhood.rosetta.eventlogging.ClientPlatformDto r3, p479j$.time.Instant r4, java.lang.String r5, java.lang.String r6, float r7, boolean r8, int r9, java.lang.String r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r2 = this;
            r12 = r11 & 1
            if (r12 == 0) goto La
            com.robinhood.rosetta.eventlogging.ClientPlatformDto$Companion r3 = com.robinhood.rosetta.eventlogging.ClientPlatformDto.INSTANCE
            com.robinhood.rosetta.eventlogging.ClientPlatformDto r3 = r3.getZeroValue()
        La:
            r12 = r11 & 2
            if (r12 == 0) goto Lf
            r4 = 0
        Lf:
            r12 = r11 & 4
            java.lang.String r0 = ""
            if (r12 == 0) goto L16
            r5 = r0
        L16:
            r12 = r11 & 8
            if (r12 == 0) goto L1b
            r6 = r0
        L1b:
            r12 = r11 & 16
            if (r12 == 0) goto L20
            r7 = 0
        L20:
            r12 = r11 & 32
            r1 = 0
            if (r12 == 0) goto L26
            r8 = r1
        L26:
            r12 = r11 & 64
            if (r12 == 0) goto L2b
            r9 = r1
        L2b:
            r11 = r11 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L39
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            goto L42
        L39:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
        L42:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientBazelSpawnExecEventDto.<init>(com.robinhood.rosetta.eventlogging.ClientPlatformDto, j$.time.Instant, java.lang.String, java.lang.String, float, boolean, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientBazelSpawnExecEventDto(ClientPlatformDto platform, Instant instant, String mnemonic, String target_label, float f, boolean z, int i, String pipeline_slug) {
        this(new Surrogate(platform, instant, mnemonic, target_label, f, z, i, pipeline_slug));
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(mnemonic, "mnemonic");
        Intrinsics.checkNotNullParameter(target_label, "target_label");
        Intrinsics.checkNotNullParameter(pipeline_slug, "pipeline_slug");
    }

    public static /* synthetic */ ClientBazelSpawnExecEventDto copy$default(ClientBazelSpawnExecEventDto clientBazelSpawnExecEventDto, ClientPlatformDto clientPlatformDto, Instant instant, String str, String str2, float f, boolean z, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            clientPlatformDto = clientBazelSpawnExecEventDto.surrogate.getPlatform();
        }
        if ((i2 & 2) != 0) {
            instant = clientBazelSpawnExecEventDto.surrogate.getTimestamp();
        }
        if ((i2 & 4) != 0) {
            str = clientBazelSpawnExecEventDto.surrogate.getMnemonic();
        }
        if ((i2 & 8) != 0) {
            str2 = clientBazelSpawnExecEventDto.surrogate.getTarget_label();
        }
        if ((i2 & 16) != 0) {
            f = clientBazelSpawnExecEventDto.surrogate.getTotal_time_in_seconds();
        }
        if ((i2 & 32) != 0) {
            z = clientBazelSpawnExecEventDto.surrogate.getCache_hit();
        }
        if ((i2 & 64) != 0) {
            i = clientBazelSpawnExecEventDto.surrogate.getExit_code();
        }
        if ((i2 & 128) != 0) {
            str3 = clientBazelSpawnExecEventDto.surrogate.getPipeline_slug();
        }
        int i3 = i;
        String str4 = str3;
        float f2 = f;
        boolean z2 = z;
        return clientBazelSpawnExecEventDto.copy(clientPlatformDto, instant, str, str2, f2, z2, i3, str4);
    }

    public final ClientBazelSpawnExecEventDto copy(ClientPlatformDto platform, Instant timestamp, String mnemonic, String target_label, float total_time_in_seconds, boolean cache_hit, int exit_code, String pipeline_slug) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(mnemonic, "mnemonic");
        Intrinsics.checkNotNullParameter(target_label, "target_label");
        Intrinsics.checkNotNullParameter(pipeline_slug, "pipeline_slug");
        return new ClientBazelSpawnExecEventDto(new Surrogate(platform, timestamp, mnemonic, target_label, total_time_in_seconds, cache_hit, exit_code, pipeline_slug));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientBazelSpawnExecEvent toProto() {
        return new ClientBazelSpawnExecEvent((ClientPlatform) this.surrogate.getPlatform().toProto(), this.surrogate.getTimestamp(), this.surrogate.getMnemonic(), this.surrogate.getTarget_label(), this.surrogate.getTotal_time_in_seconds(), this.surrogate.getCache_hit(), this.surrogate.getExit_code(), this.surrogate.getPipeline_slug(), null, 256, null);
    }

    public String toString() {
        return "[ClientBazelSpawnExecEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientBazelSpawnExecEventDto) && Intrinsics.areEqual(((ClientBazelSpawnExecEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientBazelSpawnExecEventDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b2\b\u0083\b\u0018\u0000 Q2\u00020\u0001:\u0002RQB\u009b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0017\b\u0002\u0010\u0014\u001a\u00110\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017Be\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J6\u0010'\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b+\u0010*J\u001f\u0010,\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00110\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0013HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b2\u0010*J¤\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0017\b\u0002\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0017\b\u0002\u0010\u0014\u001a\u00110\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00132\b\b\u0002\u0010\u0015\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b5\u0010*J\u0010\u00106\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b6\u00101J\u001a\u00108\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010&RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\b@\u0010=\u001a\u0004\b?\u0010(R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010A\u0012\u0004\bC\u0010=\u001a\u0004\bB\u0010*R \u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010A\u0012\u0004\bE\u0010=\u001a\u0004\bD\u0010*R/\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010F\u0012\u0004\bH\u0010=\u001a\u0004\bG\u0010-R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010I\u0012\u0004\bK\u0010=\u001a\u0004\bJ\u0010/R/\u0010\u0014\u001a\u00110\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010L\u0012\u0004\bN\u0010=\u001a\u0004\bM\u00101R \u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010A\u0012\u0004\bP\u0010=\u001a\u0004\bO\u0010*¨\u0006S"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "", "mnemonic", "target_label", "", "Lcom/robinhood/idl/serialization/FloatSerializer;", "total_time_in_seconds", "", "cache_hit", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "exit_code", "pipeline_slug", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;FZILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;FZILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Lj$/time/Instant;", "component3", "()Ljava/lang/String;", "component4", "component5", "()F", "component6", "()Z", "component7", "()I", "component8", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;FZILjava/lang/String;)Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto$Surrogate;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Ljava/lang/String;", "getMnemonic", "getMnemonic$annotations", "getTarget_label", "getTarget_label$annotations", "F", "getTotal_time_in_seconds", "getTotal_time_in_seconds$annotations", "Z", "getCache_hit", "getCache_hit$annotations", "I", "getExit_code", "getExit_code$annotations", "getPipeline_slug", "getPipeline_slug$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean cache_hit;
        private final int exit_code;
        private final String mnemonic;
        private final String pipeline_slug;
        private final ClientPlatformDto platform;
        private final String target_label;
        private final Instant timestamp;
        private final float total_time_in_seconds;

        public Surrogate() {
            this((ClientPlatformDto) null, (Instant) null, (String) null, (String) null, 0.0f, false, 0, (String) null, 255, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ClientPlatformDto clientPlatformDto, Instant instant, String str, String str2, float f, boolean z, int i, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                clientPlatformDto = surrogate.platform;
            }
            if ((i2 & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i2 & 4) != 0) {
                str = surrogate.mnemonic;
            }
            if ((i2 & 8) != 0) {
                str2 = surrogate.target_label;
            }
            if ((i2 & 16) != 0) {
                f = surrogate.total_time_in_seconds;
            }
            if ((i2 & 32) != 0) {
                z = surrogate.cache_hit;
            }
            if ((i2 & 64) != 0) {
                i = surrogate.exit_code;
            }
            if ((i2 & 128) != 0) {
                str3 = surrogate.pipeline_slug;
            }
            int i3 = i;
            String str4 = str3;
            float f2 = f;
            boolean z2 = z;
            return surrogate.copy(clientPlatformDto, instant, str, str2, f2, z2, i3, str4);
        }

        @SerialName("cacheHit")
        @JsonAnnotations2(names = {"cache_hit"})
        public static /* synthetic */ void getCache_hit$annotations() {
        }

        @SerialName("exitCode")
        @JsonAnnotations2(names = {"exit_code"})
        public static /* synthetic */ void getExit_code$annotations() {
        }

        @SerialName("mnemonic")
        @JsonAnnotations2(names = {"mnemonic"})
        public static /* synthetic */ void getMnemonic$annotations() {
        }

        @SerialName("pipelineSlug")
        @JsonAnnotations2(names = {"pipeline_slug"})
        public static /* synthetic */ void getPipeline_slug$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("targetLabel")
        @JsonAnnotations2(names = {"target_label"})
        public static /* synthetic */ void getTarget_label$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("totalTimeInSeconds")
        @JsonAnnotations2(names = {"total_time_in_seconds"})
        public static /* synthetic */ void getTotal_time_in_seconds$annotations() {
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
        public final String getMnemonic() {
            return this.mnemonic;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTarget_label() {
            return this.target_label;
        }

        /* renamed from: component5, reason: from getter */
        public final float getTotal_time_in_seconds() {
            return this.total_time_in_seconds;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getCache_hit() {
            return this.cache_hit;
        }

        /* renamed from: component7, reason: from getter */
        public final int getExit_code() {
            return this.exit_code;
        }

        /* renamed from: component8, reason: from getter */
        public final String getPipeline_slug() {
            return this.pipeline_slug;
        }

        public final Surrogate copy(ClientPlatformDto platform, Instant timestamp, String mnemonic, String target_label, float total_time_in_seconds, boolean cache_hit, int exit_code, String pipeline_slug) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(mnemonic, "mnemonic");
            Intrinsics.checkNotNullParameter(target_label, "target_label");
            Intrinsics.checkNotNullParameter(pipeline_slug, "pipeline_slug");
            return new Surrogate(platform, timestamp, mnemonic, target_label, total_time_in_seconds, cache_hit, exit_code, pipeline_slug);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.mnemonic, surrogate.mnemonic) && Intrinsics.areEqual(this.target_label, surrogate.target_label) && Float.compare(this.total_time_in_seconds, surrogate.total_time_in_seconds) == 0 && this.cache_hit == surrogate.cache_hit && this.exit_code == surrogate.exit_code && Intrinsics.areEqual(this.pipeline_slug, surrogate.pipeline_slug);
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            Instant instant = this.timestamp;
            return ((((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.mnemonic.hashCode()) * 31) + this.target_label.hashCode()) * 31) + Float.hashCode(this.total_time_in_seconds)) * 31) + java.lang.Boolean.hashCode(this.cache_hit)) * 31) + Integer.hashCode(this.exit_code)) * 31) + this.pipeline_slug.hashCode();
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", timestamp=" + this.timestamp + ", mnemonic=" + this.mnemonic + ", target_label=" + this.target_label + ", total_time_in_seconds=" + this.total_time_in_seconds + ", cache_hit=" + this.cache_hit + ", exit_code=" + this.exit_code + ", pipeline_slug=" + this.pipeline_slug + ")";
        }

        /* compiled from: ClientBazelSpawnExecEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientBazelSpawnExecEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, Instant instant, String str, String str2, float f, boolean z, int i2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            this.platform = (i & 1) == 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto;
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.mnemonic = "";
            } else {
                this.mnemonic = str;
            }
            if ((i & 8) == 0) {
                this.target_label = "";
            } else {
                this.target_label = str2;
            }
            if ((i & 16) == 0) {
                this.total_time_in_seconds = 0.0f;
            } else {
                this.total_time_in_seconds = f;
            }
            if ((i & 32) == 0) {
                this.cache_hit = false;
            } else {
                this.cache_hit = z;
            }
            if ((i & 64) == 0) {
                this.exit_code = 0;
            } else {
                this.exit_code = i2;
            }
            if ((i & 128) == 0) {
                this.pipeline_slug = "";
            } else {
                this.pipeline_slug = str3;
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
            if (!Intrinsics.areEqual(self.mnemonic, "")) {
                output.encodeStringElement(serialDesc, 2, self.mnemonic);
            }
            if (!Intrinsics.areEqual(self.target_label, "")) {
                output.encodeStringElement(serialDesc, 3, self.target_label);
            }
            if (Float.compare(self.total_time_in_seconds, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 4, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.total_time_in_seconds));
            }
            boolean z = self.cache_hit;
            if (z) {
                output.encodeBooleanElement(serialDesc, 5, z);
            }
            int i = self.exit_code;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (Intrinsics.areEqual(self.pipeline_slug, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 7, self.pipeline_slug);
        }

        public Surrogate(ClientPlatformDto platform, Instant instant, String mnemonic, String target_label, float f, boolean z, int i, String pipeline_slug) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(mnemonic, "mnemonic");
            Intrinsics.checkNotNullParameter(target_label, "target_label");
            Intrinsics.checkNotNullParameter(pipeline_slug, "pipeline_slug");
            this.platform = platform;
            this.timestamp = instant;
            this.mnemonic = mnemonic;
            this.target_label = target_label;
            this.total_time_in_seconds = f;
            this.cache_hit = z;
            this.exit_code = i;
            this.pipeline_slug = pipeline_slug;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.rosetta.eventlogging.ClientPlatformDto r3, p479j$.time.Instant r4, java.lang.String r5, java.lang.String r6, float r7, boolean r8, int r9, java.lang.String r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
            /*
                r2 = this;
                r12 = r11 & 1
                if (r12 == 0) goto La
                com.robinhood.rosetta.eventlogging.ClientPlatformDto$Companion r3 = com.robinhood.rosetta.eventlogging.ClientPlatformDto.INSTANCE
                com.robinhood.rosetta.eventlogging.ClientPlatformDto r3 = r3.getZeroValue()
            La:
                r12 = r11 & 2
                if (r12 == 0) goto Lf
                r4 = 0
            Lf:
                r12 = r11 & 4
                java.lang.String r0 = ""
                if (r12 == 0) goto L16
                r5 = r0
            L16:
                r12 = r11 & 8
                if (r12 == 0) goto L1b
                r6 = r0
            L1b:
                r12 = r11 & 16
                if (r12 == 0) goto L20
                r7 = 0
            L20:
                r12 = r11 & 32
                r1 = 0
                if (r12 == 0) goto L26
                r8 = r1
            L26:
                r12 = r11 & 64
                if (r12 == 0) goto L2b
                r9 = r1
            L2b:
                r11 = r11 & 128(0x80, float:1.794E-43)
                if (r11 == 0) goto L39
                r12 = r0
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                goto L42
            L39:
                r12 = r10
                r11 = r9
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
            L42:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientBazelSpawnExecEventDto.Surrogate.<init>(com.robinhood.rosetta.eventlogging.ClientPlatformDto, j$.time.Instant, java.lang.String, java.lang.String, float, boolean, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getMnemonic() {
            return this.mnemonic;
        }

        public final String getTarget_label() {
            return this.target_label;
        }

        public final float getTotal_time_in_seconds() {
            return this.total_time_in_seconds;
        }

        public final boolean getCache_hit() {
            return this.cache_hit;
        }

        public final int getExit_code() {
            return this.exit_code;
        }

        public final String getPipeline_slug() {
            return this.pipeline_slug;
        }
    }

    /* compiled from: ClientBazelSpawnExecEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ClientBazelSpawnExecEventDto, ClientBazelSpawnExecEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientBazelSpawnExecEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientBazelSpawnExecEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientBazelSpawnExecEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientBazelSpawnExecEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientBazelSpawnExecEvent> getProtoAdapter() {
            return ClientBazelSpawnExecEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientBazelSpawnExecEventDto getZeroValue() {
            return ClientBazelSpawnExecEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientBazelSpawnExecEventDto fromProto(ClientBazelSpawnExecEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ClientBazelSpawnExecEventDto(new Surrogate(ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform()), proto.getTimestamp(), proto.getMnemonic(), proto.getTarget_label(), proto.getTotal_time_in_seconds(), proto.getCache_hit(), proto.getExit_code(), proto.getPipeline_slug()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientBazelSpawnExecEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientBazelSpawnExecEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientBazelSpawnExecEventDto(null, null, null, null, 0.0f, false, 0, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientBazelSpawnExecEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ClientBazelSpawnExecEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientBazelSpawnExecEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientBazelSpawnExecEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientBazelSpawnExecEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientBazelSpawnExecEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientBazelSpawnExecEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientBazelSpawnExecEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientBazelSpawnExecEventDto";
        }
    }
}
