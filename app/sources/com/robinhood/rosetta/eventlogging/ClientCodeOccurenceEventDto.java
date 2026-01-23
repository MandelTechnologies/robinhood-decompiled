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
import com.robinhood.rosetta.eventlogging.ClientCodeOccurenceTypeDto;
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

/* compiled from: ClientCodeOccurenceEventDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004879:B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Ba\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u0016Je\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0011H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b3\u0010#R\u0011\u0010\u0013\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b5\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001c¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "identifier", "Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceTypeDto;", "codeType", "", "count", "module_name", "group_id", "variant_name", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceTypeDto;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceTypeDto;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getTimestamp", "()Lj$/time/Instant;", "getIdentifier", "getCodeType", "()Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceTypeDto;", "getCount", "getModule_name", "getGroup_id", "getVariant_name", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ClientCodeOccurenceEventDto implements Dto3<ClientCodeOccurenceEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientCodeOccurenceEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientCodeOccurenceEventDto, ClientCodeOccurenceEvent>> binaryBase64Serializer$delegate;
    private static final ClientCodeOccurenceEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientCodeOccurenceEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientCodeOccurenceEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getIdentifier() {
        return this.surrogate.getIdentifier();
    }

    public final ClientCodeOccurenceTypeDto getCodeType() {
        return this.surrogate.getCodeType();
    }

    public final int getCount() {
        return this.surrogate.getCount();
    }

    public final String getModule_name() {
        return this.surrogate.getModule_name();
    }

    public final String getGroup_id() {
        return this.surrogate.getGroup_id();
    }

    public final String getVariant_name() {
        return this.surrogate.getVariant_name();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ClientCodeOccurenceEventDto(com.robinhood.rosetta.eventlogging.ClientPlatformDto r2, p479j$.time.Instant r3, java.lang.String r4, com.robinhood.rosetta.eventlogging.ClientCodeOccurenceTypeDto r5, int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto La
            com.robinhood.rosetta.eventlogging.ClientPlatformDto$Companion r2 = com.robinhood.rosetta.eventlogging.ClientPlatformDto.INSTANCE
            com.robinhood.rosetta.eventlogging.ClientPlatformDto r2 = r2.getZeroValue()
        La:
            r11 = r10 & 2
            if (r11 == 0) goto Lf
            r3 = 0
        Lf:
            r11 = r10 & 4
            java.lang.String r0 = ""
            if (r11 == 0) goto L16
            r4 = r0
        L16:
            r11 = r10 & 8
            if (r11 == 0) goto L20
            com.robinhood.rosetta.eventlogging.ClientCodeOccurenceTypeDto$Companion r5 = com.robinhood.rosetta.eventlogging.ClientCodeOccurenceTypeDto.INSTANCE
            com.robinhood.rosetta.eventlogging.ClientCodeOccurenceTypeDto r5 = r5.getZeroValue()
        L20:
            r11 = r10 & 16
            if (r11 == 0) goto L25
            r6 = 0
        L25:
            r11 = r10 & 32
            if (r11 == 0) goto L2a
            r7 = r0
        L2a:
            r11 = r10 & 64
            if (r11 == 0) goto L2f
            r8 = r0
        L2f:
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L3d
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L46
        L3d:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L46:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientCodeOccurenceEventDto.<init>(com.robinhood.rosetta.eventlogging.ClientPlatformDto, j$.time.Instant, java.lang.String, com.robinhood.rosetta.eventlogging.ClientCodeOccurenceTypeDto, int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientCodeOccurenceEventDto(ClientPlatformDto platform, Instant instant, String identifier, ClientCodeOccurenceTypeDto codeType, int i, String module_name, String group_id, String variant_name) {
        this(new Surrogate(platform, instant, identifier, codeType, i, module_name, group_id, variant_name));
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(codeType, "codeType");
        Intrinsics.checkNotNullParameter(module_name, "module_name");
        Intrinsics.checkNotNullParameter(group_id, "group_id");
        Intrinsics.checkNotNullParameter(variant_name, "variant_name");
    }

    public static /* synthetic */ ClientCodeOccurenceEventDto copy$default(ClientCodeOccurenceEventDto clientCodeOccurenceEventDto, ClientPlatformDto clientPlatformDto, Instant instant, String str, ClientCodeOccurenceTypeDto clientCodeOccurenceTypeDto, int i, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            clientPlatformDto = clientCodeOccurenceEventDto.surrogate.getPlatform();
        }
        if ((i2 & 2) != 0) {
            instant = clientCodeOccurenceEventDto.surrogate.getTimestamp();
        }
        if ((i2 & 4) != 0) {
            str = clientCodeOccurenceEventDto.surrogate.getIdentifier();
        }
        if ((i2 & 8) != 0) {
            clientCodeOccurenceTypeDto = clientCodeOccurenceEventDto.surrogate.getCodeType();
        }
        if ((i2 & 16) != 0) {
            i = clientCodeOccurenceEventDto.surrogate.getCount();
        }
        if ((i2 & 32) != 0) {
            str2 = clientCodeOccurenceEventDto.surrogate.getModule_name();
        }
        if ((i2 & 64) != 0) {
            str3 = clientCodeOccurenceEventDto.surrogate.getGroup_id();
        }
        if ((i2 & 128) != 0) {
            str4 = clientCodeOccurenceEventDto.surrogate.getVariant_name();
        }
        String str5 = str3;
        String str6 = str4;
        int i3 = i;
        String str7 = str2;
        return clientCodeOccurenceEventDto.copy(clientPlatformDto, instant, str, clientCodeOccurenceTypeDto, i3, str7, str5, str6);
    }

    public final ClientCodeOccurenceEventDto copy(ClientPlatformDto platform, Instant timestamp, String identifier, ClientCodeOccurenceTypeDto codeType, int count, String module_name, String group_id, String variant_name) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(codeType, "codeType");
        Intrinsics.checkNotNullParameter(module_name, "module_name");
        Intrinsics.checkNotNullParameter(group_id, "group_id");
        Intrinsics.checkNotNullParameter(variant_name, "variant_name");
        return new ClientCodeOccurenceEventDto(new Surrogate(platform, timestamp, identifier, codeType, count, module_name, group_id, variant_name));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientCodeOccurenceEvent toProto() {
        return new ClientCodeOccurenceEvent((ClientPlatform) this.surrogate.getPlatform().toProto(), this.surrogate.getTimestamp(), this.surrogate.getIdentifier(), (ClientCodeOccurenceType) this.surrogate.getCodeType().toProto(), this.surrogate.getCount(), this.surrogate.getModule_name(), this.surrogate.getGroup_id(), this.surrogate.getVariant_name(), null, 256, null);
    }

    public String toString() {
        return "[ClientCodeOccurenceEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientCodeOccurenceEventDto) && Intrinsics.areEqual(((ClientCodeOccurenceEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientCodeOccurenceEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 N2\u00020\u0001:\u0002ONB\u008c\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015Bi\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J6\u0010%\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b-\u0010(J\u0010\u0010.\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b.\u0010(J\u0010\u0010/\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b/\u0010(J\u0095\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0017\b\u0002\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b2\u0010(J\u0010\u00103\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b3\u0010,J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010$RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\b>\u0010;\u001a\u0004\b=\u0010&R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010?\u0012\u0004\bA\u0010;\u001a\u0004\b@\u0010(R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010B\u0012\u0004\bD\u0010;\u001a\u0004\bC\u0010*R/\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010E\u0012\u0004\bG\u0010;\u001a\u0004\bF\u0010,R \u0010\u0011\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010?\u0012\u0004\bI\u0010;\u001a\u0004\bH\u0010(R \u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010?\u0012\u0004\bK\u0010;\u001a\u0004\bJ\u0010(R \u0010\u0013\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010?\u0012\u0004\bM\u0010;\u001a\u0004\bL\u0010(¨\u0006P"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "", "identifier", "Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceTypeDto;", "codeType", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "count", "module_name", "group_id", "variant_name", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceTypeDto;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceTypeDto;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Lj$/time/Instant;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceTypeDto;", "component5", "()I", "component6", "component7", "component8", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceTypeDto;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto$Surrogate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Ljava/lang/String;", "getIdentifier", "getIdentifier$annotations", "Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceTypeDto;", "getCodeType", "getCodeType$annotations", "I", "getCount", "getCount$annotations", "getModule_name", "getModule_name$annotations", "getGroup_id", "getGroup_id$annotations", "getVariant_name", "getVariant_name$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ClientCodeOccurenceTypeDto codeType;
        private final int count;
        private final String group_id;
        private final String identifier;
        private final String module_name;
        private final ClientPlatformDto platform;
        private final Instant timestamp;
        private final String variant_name;

        public Surrogate() {
            this((ClientPlatformDto) null, (Instant) null, (String) null, (ClientCodeOccurenceTypeDto) null, 0, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ClientPlatformDto clientPlatformDto, Instant instant, String str, ClientCodeOccurenceTypeDto clientCodeOccurenceTypeDto, int i, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                clientPlatformDto = surrogate.platform;
            }
            if ((i2 & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i2 & 4) != 0) {
                str = surrogate.identifier;
            }
            if ((i2 & 8) != 0) {
                clientCodeOccurenceTypeDto = surrogate.codeType;
            }
            if ((i2 & 16) != 0) {
                i = surrogate.count;
            }
            if ((i2 & 32) != 0) {
                str2 = surrogate.module_name;
            }
            if ((i2 & 64) != 0) {
                str3 = surrogate.group_id;
            }
            if ((i2 & 128) != 0) {
                str4 = surrogate.variant_name;
            }
            String str5 = str3;
            String str6 = str4;
            int i3 = i;
            String str7 = str2;
            return surrogate.copy(clientPlatformDto, instant, str, clientCodeOccurenceTypeDto, i3, str7, str5, str6);
        }

        @SerialName("codeType")
        @JsonAnnotations2(names = {"codeType"})
        public static /* synthetic */ void getCodeType$annotations() {
        }

        @SerialName("count")
        @JsonAnnotations2(names = {"count"})
        public static /* synthetic */ void getCount$annotations() {
        }

        @SerialName("groupId")
        @JsonAnnotations2(names = {"group_id"})
        public static /* synthetic */ void getGroup_id$annotations() {
        }

        @SerialName("identifier")
        @JsonAnnotations2(names = {"identifier"})
        public static /* synthetic */ void getIdentifier$annotations() {
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

        @SerialName("variantName")
        @JsonAnnotations2(names = {"variant_name"})
        public static /* synthetic */ void getVariant_name$annotations() {
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
        public final String getIdentifier() {
            return this.identifier;
        }

        /* renamed from: component4, reason: from getter */
        public final ClientCodeOccurenceTypeDto getCodeType() {
            return this.codeType;
        }

        /* renamed from: component5, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* renamed from: component6, reason: from getter */
        public final String getModule_name() {
            return this.module_name;
        }

        /* renamed from: component7, reason: from getter */
        public final String getGroup_id() {
            return this.group_id;
        }

        /* renamed from: component8, reason: from getter */
        public final String getVariant_name() {
            return this.variant_name;
        }

        public final Surrogate copy(ClientPlatformDto platform, Instant timestamp, String identifier, ClientCodeOccurenceTypeDto codeType, int count, String module_name, String group_id, String variant_name) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(codeType, "codeType");
            Intrinsics.checkNotNullParameter(module_name, "module_name");
            Intrinsics.checkNotNullParameter(group_id, "group_id");
            Intrinsics.checkNotNullParameter(variant_name, "variant_name");
            return new Surrogate(platform, timestamp, identifier, codeType, count, module_name, group_id, variant_name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.identifier, surrogate.identifier) && this.codeType == surrogate.codeType && this.count == surrogate.count && Intrinsics.areEqual(this.module_name, surrogate.module_name) && Intrinsics.areEqual(this.group_id, surrogate.group_id) && Intrinsics.areEqual(this.variant_name, surrogate.variant_name);
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            Instant instant = this.timestamp;
            return ((((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.identifier.hashCode()) * 31) + this.codeType.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + this.module_name.hashCode()) * 31) + this.group_id.hashCode()) * 31) + this.variant_name.hashCode();
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", timestamp=" + this.timestamp + ", identifier=" + this.identifier + ", codeType=" + this.codeType + ", count=" + this.count + ", module_name=" + this.module_name + ", group_id=" + this.group_id + ", variant_name=" + this.variant_name + ")";
        }

        /* compiled from: ClientCodeOccurenceEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientCodeOccurenceEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, Instant instant, String str, ClientCodeOccurenceTypeDto clientCodeOccurenceTypeDto, int i2, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            this.platform = (i & 1) == 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto;
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.identifier = "";
            } else {
                this.identifier = str;
            }
            if ((i & 8) == 0) {
                this.codeType = ClientCodeOccurenceTypeDto.INSTANCE.getZeroValue();
            } else {
                this.codeType = clientCodeOccurenceTypeDto;
            }
            if ((i & 16) == 0) {
                this.count = 0;
            } else {
                this.count = i2;
            }
            if ((i & 32) == 0) {
                this.module_name = "";
            } else {
                this.module_name = str2;
            }
            if ((i & 64) == 0) {
                this.group_id = "";
            } else {
                this.group_id = str3;
            }
            if ((i & 128) == 0) {
                this.variant_name = "";
            } else {
                this.variant_name = str4;
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
            if (!Intrinsics.areEqual(self.identifier, "")) {
                output.encodeStringElement(serialDesc, 2, self.identifier);
            }
            if (self.codeType != ClientCodeOccurenceTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, ClientCodeOccurenceTypeDto.Serializer.INSTANCE, self.codeType);
            }
            int i = self.count;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.module_name, "")) {
                output.encodeStringElement(serialDesc, 5, self.module_name);
            }
            if (!Intrinsics.areEqual(self.group_id, "")) {
                output.encodeStringElement(serialDesc, 6, self.group_id);
            }
            if (Intrinsics.areEqual(self.variant_name, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 7, self.variant_name);
        }

        public Surrogate(ClientPlatformDto platform, Instant instant, String identifier, ClientCodeOccurenceTypeDto codeType, int i, String module_name, String group_id, String variant_name) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(codeType, "codeType");
            Intrinsics.checkNotNullParameter(module_name, "module_name");
            Intrinsics.checkNotNullParameter(group_id, "group_id");
            Intrinsics.checkNotNullParameter(variant_name, "variant_name");
            this.platform = platform;
            this.timestamp = instant;
            this.identifier = identifier;
            this.codeType = codeType;
            this.count = i;
            this.module_name = module_name;
            this.group_id = group_id;
            this.variant_name = variant_name;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.rosetta.eventlogging.ClientPlatformDto r2, p479j$.time.Instant r3, java.lang.String r4, com.robinhood.rosetta.eventlogging.ClientCodeOccurenceTypeDto r5, int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
            /*
                r1 = this;
                r11 = r10 & 1
                if (r11 == 0) goto La
                com.robinhood.rosetta.eventlogging.ClientPlatformDto$Companion r2 = com.robinhood.rosetta.eventlogging.ClientPlatformDto.INSTANCE
                com.robinhood.rosetta.eventlogging.ClientPlatformDto r2 = r2.getZeroValue()
            La:
                r11 = r10 & 2
                if (r11 == 0) goto Lf
                r3 = 0
            Lf:
                r11 = r10 & 4
                java.lang.String r0 = ""
                if (r11 == 0) goto L16
                r4 = r0
            L16:
                r11 = r10 & 8
                if (r11 == 0) goto L20
                com.robinhood.rosetta.eventlogging.ClientCodeOccurenceTypeDto$Companion r5 = com.robinhood.rosetta.eventlogging.ClientCodeOccurenceTypeDto.INSTANCE
                com.robinhood.rosetta.eventlogging.ClientCodeOccurenceTypeDto r5 = r5.getZeroValue()
            L20:
                r11 = r10 & 16
                if (r11 == 0) goto L25
                r6 = 0
            L25:
                r11 = r10 & 32
                if (r11 == 0) goto L2a
                r7 = r0
            L2a:
                r11 = r10 & 64
                if (r11 == 0) goto L2f
                r8 = r0
            L2f:
                r10 = r10 & 128(0x80, float:1.794E-43)
                if (r10 == 0) goto L3d
                r11 = r0
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L46
            L3d:
                r11 = r9
                r10 = r8
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L46:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientCodeOccurenceEventDto.Surrogate.<init>(com.robinhood.rosetta.eventlogging.ClientPlatformDto, j$.time.Instant, java.lang.String, com.robinhood.rosetta.eventlogging.ClientCodeOccurenceTypeDto, int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final ClientCodeOccurenceTypeDto getCodeType() {
            return this.codeType;
        }

        public final int getCount() {
            return this.count;
        }

        public final String getModule_name() {
            return this.module_name;
        }

        public final String getGroup_id() {
            return this.group_id;
        }

        public final String getVariant_name() {
            return this.variant_name;
        }
    }

    /* compiled from: ClientCodeOccurenceEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ClientCodeOccurenceEventDto, ClientCodeOccurenceEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientCodeOccurenceEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientCodeOccurenceEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientCodeOccurenceEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientCodeOccurenceEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientCodeOccurenceEvent> getProtoAdapter() {
            return ClientCodeOccurenceEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientCodeOccurenceEventDto getZeroValue() {
            return ClientCodeOccurenceEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientCodeOccurenceEventDto fromProto(ClientCodeOccurenceEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ClientCodeOccurenceEventDto(new Surrogate(ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform()), proto.getTimestamp(), proto.getIdentifier(), ClientCodeOccurenceTypeDto.INSTANCE.fromProto(proto.getCodeType()), proto.getCount(), proto.getModule_name(), proto.getGroup_id(), proto.getVariant_name()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientCodeOccurenceEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientCodeOccurenceEventDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ClientCodeOccurenceEventDto(null, null, null, null, 0, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientCodeOccurenceEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientCodeOccurenceEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientCodeOccurenceEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientCodeOccurenceEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientCodeOccurenceEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientCodeOccurenceEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientCodeOccurenceEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientCodeOccurenceEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientCodeOccurenceEventDto";
        }
    }
}
