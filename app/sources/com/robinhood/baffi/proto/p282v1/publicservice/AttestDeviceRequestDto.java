package com.robinhood.baffi.proto.p282v1.publicservice;

import android.os.Parcel;
import android.os.Parcelable;
import baffi.service.p016v1.common.DevicePlatform;
import baffi.service.p016v1.common.DevicePlatformDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.baffi.proto.p282v1.publicservice.AttestDeviceRequestDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: AttestDeviceRequestDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BS\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\u0011JP\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015¨\u0006."}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto$Surrogate;)V", "device_platform", "Lbaffi/service/v1/common/DevicePlatformDto;", "attestation_object", "", "attestation_chain", "", "play_integrity_token", "mobile_sdk_device_id", "device_token", "(Lbaffi/service/v1/common/DevicePlatformDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDevice_platform", "()Lbaffi/service/v1/common/DevicePlatformDto;", "getAttestation_object", "()Ljava/lang/String;", "getAttestation_chain", "()Ljava/util/List;", "getPlay_integrity_token", "getMobile_sdk_device_id", "getDevice_token", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AttestDeviceRequestDto implements Dto3<AttestDeviceRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AttestDeviceRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AttestDeviceRequestDto, AttestDeviceRequest>> binaryBase64Serializer$delegate;
    private static final AttestDeviceRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AttestDeviceRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AttestDeviceRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DevicePlatformDto getDevice_platform() {
        return this.surrogate.getDevice_platform();
    }

    public final String getAttestation_object() {
        return this.surrogate.getAttestation_object();
    }

    public final List<String> getAttestation_chain() {
        return this.surrogate.getAttestation_chain();
    }

    public final String getPlay_integrity_token() {
        return this.surrogate.getPlay_integrity_token();
    }

    public final String getMobile_sdk_device_id() {
        return this.surrogate.getMobile_sdk_device_id();
    }

    public final String getDevice_token() {
        return this.surrogate.getDevice_token();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AttestDeviceRequestDto(baffi.service.p016v1.common.DevicePlatformDto r2, java.lang.String r3, java.util.List r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto La
            baffi.service.v1.common.DevicePlatformDto$Companion r2 = baffi.service.p016v1.common.DevicePlatformDto.INSTANCE
            baffi.service.v1.common.DevicePlatformDto r2 = r2.getZeroValue()
        La:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto L10
            r3 = r0
        L10:
            r9 = r8 & 4
            if (r9 == 0) goto L18
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L18:
            r9 = r8 & 8
            if (r9 == 0) goto L1d
            r5 = r0
        L1d:
            r9 = r8 & 16
            if (r9 == 0) goto L22
            r6 = r0
        L22:
            r8 = r8 & 32
            if (r8 == 0) goto L2e
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L35
        L2e:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L35:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.baffi.proto.p282v1.publicservice.AttestDeviceRequestDto.<init>(baffi.service.v1.common.DevicePlatformDto, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AttestDeviceRequestDto(DevicePlatformDto device_platform, String str, List<String> attestation_chain, String str2, String str3, String str4) {
        this(new Surrogate(device_platform, str, attestation_chain, str2, str3, str4));
        Intrinsics.checkNotNullParameter(device_platform, "device_platform");
        Intrinsics.checkNotNullParameter(attestation_chain, "attestation_chain");
    }

    public static /* synthetic */ AttestDeviceRequestDto copy$default(AttestDeviceRequestDto attestDeviceRequestDto, DevicePlatformDto devicePlatformDto, String str, List list, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            devicePlatformDto = attestDeviceRequestDto.surrogate.getDevice_platform();
        }
        if ((i & 2) != 0) {
            str = attestDeviceRequestDto.surrogate.getAttestation_object();
        }
        if ((i & 4) != 0) {
            list = attestDeviceRequestDto.surrogate.getAttestation_chain();
        }
        if ((i & 8) != 0) {
            str2 = attestDeviceRequestDto.surrogate.getPlay_integrity_token();
        }
        if ((i & 16) != 0) {
            str3 = attestDeviceRequestDto.surrogate.getMobile_sdk_device_id();
        }
        if ((i & 32) != 0) {
            str4 = attestDeviceRequestDto.surrogate.getDevice_token();
        }
        String str5 = str3;
        String str6 = str4;
        return attestDeviceRequestDto.copy(devicePlatformDto, str, list, str2, str5, str6);
    }

    public final AttestDeviceRequestDto copy(DevicePlatformDto device_platform, String attestation_object, List<String> attestation_chain, String play_integrity_token, String mobile_sdk_device_id, String device_token) {
        Intrinsics.checkNotNullParameter(device_platform, "device_platform");
        Intrinsics.checkNotNullParameter(attestation_chain, "attestation_chain");
        return new AttestDeviceRequestDto(new Surrogate(device_platform, attestation_object, attestation_chain, play_integrity_token, mobile_sdk_device_id, device_token));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public AttestDeviceRequest toProto() {
        DevicePlatform devicePlatform = (DevicePlatform) this.surrogate.getDevice_platform().toProto();
        String attestation_object = this.surrogate.getAttestation_object();
        List<String> attestation_chain = this.surrogate.getAttestation_chain();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(attestation_chain, 10));
        Iterator<T> it = attestation_chain.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new AttestDeviceRequest(devicePlatform, attestation_object, arrayList, this.surrogate.getPlay_integrity_token(), this.surrogate.getMobile_sdk_device_id(), this.surrogate.getDevice_token(), null, 64, null);
    }

    public String toString() {
        return "[AttestDeviceRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AttestDeviceRequestDto) && Intrinsics.areEqual(((AttestDeviceRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: AttestDeviceRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000267BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003JS\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000eHÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001J%\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0018R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0018R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0018¨\u00068"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto$Surrogate;", "", "device_platform", "Lbaffi/service/v1/common/DevicePlatformDto;", "attestation_object", "", "attestation_chain", "", "play_integrity_token", "mobile_sdk_device_id", "device_token", "<init>", "(Lbaffi/service/v1/common/DevicePlatformDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILbaffi/service/v1/common/DevicePlatformDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDevice_platform$annotations", "()V", "getDevice_platform", "()Lbaffi/service/v1/common/DevicePlatformDto;", "getAttestation_object$annotations", "getAttestation_object", "()Ljava/lang/String;", "getAttestation_chain$annotations", "getAttestation_chain", "()Ljava/util/List;", "getPlay_integrity_token$annotations", "getPlay_integrity_token", "getMobile_sdk_device_id$annotations", "getMobile_sdk_device_id", "getDevice_token$annotations", "getDevice_token", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$baffi_service_v1_public_externalRelease", "$serializer", "Companion", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<String> attestation_chain;
        private final String attestation_object;
        private final DevicePlatformDto device_platform;
        private final String device_token;
        private final String mobile_sdk_device_id;
        private final String play_integrity_token;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.baffi.proto.v1.publicservice.AttestDeviceRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AttestDeviceRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null};

        public Surrogate() {
            this((DevicePlatformDto) null, (String) null, (List) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, DevicePlatformDto devicePlatformDto, String str, List list, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                devicePlatformDto = surrogate.device_platform;
            }
            if ((i & 2) != 0) {
                str = surrogate.attestation_object;
            }
            if ((i & 4) != 0) {
                list = surrogate.attestation_chain;
            }
            if ((i & 8) != 0) {
                str2 = surrogate.play_integrity_token;
            }
            if ((i & 16) != 0) {
                str3 = surrogate.mobile_sdk_device_id;
            }
            if ((i & 32) != 0) {
                str4 = surrogate.device_token;
            }
            String str5 = str3;
            String str6 = str4;
            return surrogate.copy(devicePlatformDto, str, list, str2, str5, str6);
        }

        @SerialName("attestationChain")
        @JsonAnnotations2(names = {"attestation_chain"})
        public static /* synthetic */ void getAttestation_chain$annotations() {
        }

        @SerialName("attestationObject")
        @JsonAnnotations2(names = {"attestation_object"})
        public static /* synthetic */ void getAttestation_object$annotations() {
        }

        @SerialName("devicePlatform")
        @JsonAnnotations2(names = {"device_platform"})
        public static /* synthetic */ void getDevice_platform$annotations() {
        }

        @SerialName("deviceToken")
        @JsonAnnotations2(names = {"device_token"})
        public static /* synthetic */ void getDevice_token$annotations() {
        }

        @SerialName("mobileSdkDeviceId")
        @JsonAnnotations2(names = {"mobile_sdk_device_id"})
        public static /* synthetic */ void getMobile_sdk_device_id$annotations() {
        }

        @SerialName("playIntegrityToken")
        @JsonAnnotations2(names = {"play_integrity_token"})
        public static /* synthetic */ void getPlay_integrity_token$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final DevicePlatformDto getDevice_platform() {
            return this.device_platform;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAttestation_object() {
            return this.attestation_object;
        }

        public final List<String> component3() {
            return this.attestation_chain;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPlay_integrity_token() {
            return this.play_integrity_token;
        }

        /* renamed from: component5, reason: from getter */
        public final String getMobile_sdk_device_id() {
            return this.mobile_sdk_device_id;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDevice_token() {
            return this.device_token;
        }

        public final Surrogate copy(DevicePlatformDto device_platform, String attestation_object, List<String> attestation_chain, String play_integrity_token, String mobile_sdk_device_id, String device_token) {
            Intrinsics.checkNotNullParameter(device_platform, "device_platform");
            Intrinsics.checkNotNullParameter(attestation_chain, "attestation_chain");
            return new Surrogate(device_platform, attestation_object, attestation_chain, play_integrity_token, mobile_sdk_device_id, device_token);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.device_platform == surrogate.device_platform && Intrinsics.areEqual(this.attestation_object, surrogate.attestation_object) && Intrinsics.areEqual(this.attestation_chain, surrogate.attestation_chain) && Intrinsics.areEqual(this.play_integrity_token, surrogate.play_integrity_token) && Intrinsics.areEqual(this.mobile_sdk_device_id, surrogate.mobile_sdk_device_id) && Intrinsics.areEqual(this.device_token, surrogate.device_token);
        }

        public int hashCode() {
            int iHashCode = this.device_platform.hashCode() * 31;
            String str = this.attestation_object;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.attestation_chain.hashCode()) * 31;
            String str2 = this.play_integrity_token;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.mobile_sdk_device_id;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.device_token;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(device_platform=" + this.device_platform + ", attestation_object=" + this.attestation_object + ", attestation_chain=" + this.attestation_chain + ", play_integrity_token=" + this.play_integrity_token + ", mobile_sdk_device_id=" + this.mobile_sdk_device_id + ", device_token=" + this.device_token + ")";
        }

        /* compiled from: AttestDeviceRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto$Surrogate;", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AttestDeviceRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DevicePlatformDto devicePlatformDto, String str, List list, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            this.device_platform = (i & 1) == 0 ? DevicePlatformDto.INSTANCE.getZeroValue() : devicePlatformDto;
            if ((i & 2) == 0) {
                this.attestation_object = null;
            } else {
                this.attestation_object = str;
            }
            if ((i & 4) == 0) {
                this.attestation_chain = CollectionsKt.emptyList();
            } else {
                this.attestation_chain = list;
            }
            if ((i & 8) == 0) {
                this.play_integrity_token = null;
            } else {
                this.play_integrity_token = str2;
            }
            if ((i & 16) == 0) {
                this.mobile_sdk_device_id = null;
            } else {
                this.mobile_sdk_device_id = str3;
            }
            if ((i & 32) == 0) {
                this.device_token = null;
            } else {
                this.device_token = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$baffi_service_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.device_platform != DevicePlatformDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, DevicePlatformDto.Serializer.INSTANCE, self.device_platform);
            }
            String str = self.attestation_object;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.attestation_chain, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.attestation_chain);
            }
            String str2 = self.play_integrity_token;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.mobile_sdk_device_id;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str3);
            }
            String str4 = self.device_token;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str4);
            }
        }

        public Surrogate(DevicePlatformDto device_platform, String str, List<String> attestation_chain, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(device_platform, "device_platform");
            Intrinsics.checkNotNullParameter(attestation_chain, "attestation_chain");
            this.device_platform = device_platform;
            this.attestation_object = str;
            this.attestation_chain = attestation_chain;
            this.play_integrity_token = str2;
            this.mobile_sdk_device_id = str3;
            this.device_token = str4;
        }

        public final DevicePlatformDto getDevice_platform() {
            return this.device_platform;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(baffi.service.p016v1.common.DevicePlatformDto r2, java.lang.String r3, java.util.List r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto La
                baffi.service.v1.common.DevicePlatformDto$Companion r2 = baffi.service.p016v1.common.DevicePlatformDto.INSTANCE
                baffi.service.v1.common.DevicePlatformDto r2 = r2.getZeroValue()
            La:
                r9 = r8 & 2
                r0 = 0
                if (r9 == 0) goto L10
                r3 = r0
            L10:
                r9 = r8 & 4
                if (r9 == 0) goto L18
                java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            L18:
                r9 = r8 & 8
                if (r9 == 0) goto L1d
                r5 = r0
            L1d:
                r9 = r8 & 16
                if (r9 == 0) goto L22
                r6 = r0
            L22:
                r8 = r8 & 32
                if (r8 == 0) goto L2e
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L35
            L2e:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L35:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.baffi.proto.p282v1.publicservice.AttestDeviceRequestDto.Surrogate.<init>(baffi.service.v1.common.DevicePlatformDto, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getAttestation_object() {
            return this.attestation_object;
        }

        public final List<String> getAttestation_chain() {
            return this.attestation_chain;
        }

        public final String getPlay_integrity_token() {
            return this.play_integrity_token;
        }

        public final String getMobile_sdk_device_id() {
            return this.mobile_sdk_device_id;
        }

        public final String getDevice_token() {
            return this.device_token;
        }
    }

    /* compiled from: AttestDeviceRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto;", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AttestDeviceRequestDto, AttestDeviceRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AttestDeviceRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AttestDeviceRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AttestDeviceRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) AttestDeviceRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AttestDeviceRequest> getProtoAdapter() {
            return AttestDeviceRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AttestDeviceRequestDto getZeroValue() {
            return AttestDeviceRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AttestDeviceRequestDto fromProto(AttestDeviceRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            DevicePlatformDto devicePlatformDtoFromProto = DevicePlatformDto.INSTANCE.fromProto(proto.getDevice_platform());
            String attestation_object = proto.getAttestation_object();
            List<String> attestation_chain = proto.getAttestation_chain();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(attestation_chain, 10));
            Iterator<T> it = attestation_chain.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new AttestDeviceRequestDto(new Surrogate(devicePlatformDtoFromProto, attestation_object, arrayList, proto.getPlay_integrity_token(), proto.getMobile_sdk_device_id(), proto.getDevice_token()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.baffi.proto.v1.publicservice.AttestDeviceRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AttestDeviceRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new AttestDeviceRequestDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AttestDeviceRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AttestDeviceRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/baffi.service.v1.public.AttestDeviceRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AttestDeviceRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AttestDeviceRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AttestDeviceRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AttestDeviceRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/baffi/proto/v1/publicservice/AttestDeviceRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "baffi.service.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.baffi.proto.v1.publicservice.AttestDeviceRequestDto";
        }
    }
}
