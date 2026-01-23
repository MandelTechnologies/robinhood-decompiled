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
import com.robinhood.rosetta.eventlogging.ClientModuleEventDto;
import com.robinhood.rosetta.eventlogging.ClientPlatformDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
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
import p479j$.time.Instant;

/* compiled from: ClientModuleEventDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004<;=>B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bq\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u0018Ju\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00102\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\b\b\u0002\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0010H\u0016¢\u0006\u0004\b,\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b4\u0010%R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u0014\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b7\u0010%R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00158F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010\u0017\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b:\u0010\u001e¨\u0006?"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ClientModuleEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto$Surrogate;)V", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "group_id", "name", "", "test_count", "", "test_coverage", "file_count", "", "dependencies", "module_type", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;IFILjava/util/List;Ljava/lang/String;)V", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;IFILjava/util/List;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/ClientModuleEvent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto$Surrogate;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getTimestamp", "()Lj$/time/Instant;", "getGroup_id", "getName", "getTest_count", "getTest_coverage", "()F", "getFile_count", "getDependencies", "()Ljava/util/List;", "getModule_type", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class ClientModuleEventDto implements Dto3<ClientModuleEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ClientModuleEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ClientModuleEventDto, ClientModuleEvent>> binaryBase64Serializer$delegate;
    private static final ClientModuleEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ClientModuleEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ClientModuleEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ClientPlatformDto getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getGroup_id() {
        return this.surrogate.getGroup_id();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final int getTest_count() {
        return this.surrogate.getTest_count();
    }

    public final float getTest_coverage() {
        return this.surrogate.getTest_coverage();
    }

    public final int getFile_count() {
        return this.surrogate.getFile_count();
    }

    public final java.util.List<String> getDependencies() {
        return this.surrogate.getDependencies();
    }

    public final String getModule_type() {
        return this.surrogate.getModule_type();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ClientModuleEventDto(com.robinhood.rosetta.eventlogging.ClientPlatformDto r3, p479j$.time.Instant r4, java.lang.String r5, java.lang.String r6, int r7, float r8, int r9, java.util.List r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r2 = this;
            r13 = r12 & 1
            if (r13 == 0) goto La
            com.robinhood.rosetta.eventlogging.ClientPlatformDto$Companion r3 = com.robinhood.rosetta.eventlogging.ClientPlatformDto.INSTANCE
            com.robinhood.rosetta.eventlogging.ClientPlatformDto r3 = r3.getZeroValue()
        La:
            r13 = r12 & 2
            if (r13 == 0) goto Lf
            r4 = 0
        Lf:
            r13 = r12 & 4
            java.lang.String r0 = ""
            if (r13 == 0) goto L16
            r5 = r0
        L16:
            r13 = r12 & 8
            if (r13 == 0) goto L1b
            r6 = r0
        L1b:
            r13 = r12 & 16
            r1 = 0
            if (r13 == 0) goto L21
            r7 = r1
        L21:
            r13 = r12 & 32
            if (r13 == 0) goto L26
            r8 = 0
        L26:
            r13 = r12 & 64
            if (r13 == 0) goto L2b
            r9 = r1
        L2b:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L33
            java.util.List r10 = kotlin.collections.CollectionsKt.emptyList()
        L33:
            r12 = r12 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L42
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L4c
        L42:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L4c:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientModuleEventDto.<init>(com.robinhood.rosetta.eventlogging.ClientPlatformDto, j$.time.Instant, java.lang.String, java.lang.String, int, float, int, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClientModuleEventDto(ClientPlatformDto platform, Instant instant, String group_id, String name, int i, float f, int i2, java.util.List<String> dependencies, String module_type) {
        this(new Surrogate(platform, instant, group_id, name, i, f, i2, dependencies, module_type));
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(group_id, "group_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        Intrinsics.checkNotNullParameter(module_type, "module_type");
    }

    public static /* synthetic */ ClientModuleEventDto copy$default(ClientModuleEventDto clientModuleEventDto, ClientPlatformDto clientPlatformDto, Instant instant, String str, String str2, int i, float f, int i2, java.util.List list, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            clientPlatformDto = clientModuleEventDto.surrogate.getPlatform();
        }
        if ((i3 & 2) != 0) {
            instant = clientModuleEventDto.surrogate.getTimestamp();
        }
        if ((i3 & 4) != 0) {
            str = clientModuleEventDto.surrogate.getGroup_id();
        }
        if ((i3 & 8) != 0) {
            str2 = clientModuleEventDto.surrogate.getName();
        }
        if ((i3 & 16) != 0) {
            i = clientModuleEventDto.surrogate.getTest_count();
        }
        if ((i3 & 32) != 0) {
            f = clientModuleEventDto.surrogate.getTest_coverage();
        }
        if ((i3 & 64) != 0) {
            i2 = clientModuleEventDto.surrogate.getFile_count();
        }
        if ((i3 & 128) != 0) {
            list = clientModuleEventDto.surrogate.getDependencies();
        }
        if ((i3 & 256) != 0) {
            str3 = clientModuleEventDto.surrogate.getModule_type();
        }
        java.util.List list2 = list;
        String str4 = str3;
        float f2 = f;
        int i4 = i2;
        int i5 = i;
        String str5 = str;
        return clientModuleEventDto.copy(clientPlatformDto, instant, str5, str2, i5, f2, i4, list2, str4);
    }

    public final ClientModuleEventDto copy(ClientPlatformDto platform, Instant timestamp, String group_id, String name, int test_count, float test_coverage, int file_count, java.util.List<String> dependencies, String module_type) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(group_id, "group_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        Intrinsics.checkNotNullParameter(module_type, "module_type");
        return new ClientModuleEventDto(new Surrogate(platform, timestamp, group_id, name, test_count, test_coverage, file_count, dependencies, module_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ClientModuleEvent toProto() {
        ClientPlatform clientPlatform = (ClientPlatform) this.surrogate.getPlatform().toProto();
        Instant timestamp = this.surrogate.getTimestamp();
        String group_id = this.surrogate.getGroup_id();
        String name = this.surrogate.getName();
        int test_count = this.surrogate.getTest_count();
        float test_coverage = this.surrogate.getTest_coverage();
        int file_count = this.surrogate.getFile_count();
        java.util.List<String> dependencies = this.surrogate.getDependencies();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(dependencies, 10));
        Iterator<T> it = dependencies.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new ClientModuleEvent(clientPlatform, timestamp, group_id, name, test_count, test_coverage, file_count, arrayList, this.surrogate.getModule_type(), null, 512, null);
    }

    public String toString() {
        return "[ClientModuleEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ClientModuleEventDto) && Intrinsics.areEqual(((ClientModuleEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: ClientModuleEventDto.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0083\b\u0018\u0000 V2\u00020\u0001:\u0002WVBº\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u0010¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0011\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018Bu\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J6\u0010(\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b,\u0010+J\u001f\u0010-\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00110\u0010¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0011HÆ\u0003¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000eHÆ\u0003¢\u0006\u0004\b1\u0010.J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\n0\u0014HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b4\u0010+JÃ\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0017\b\u0002\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010\u0012\u001a\u00110\u0010¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00112\u0017\b\u0002\u0010\u0013\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\b\b\u0002\u0010\u0016\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b7\u0010+J\u0010\u00108\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b8\u0010.J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b>\u0010'RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010A\u0012\u0004\bC\u0010@\u001a\u0004\bB\u0010)R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010D\u0012\u0004\bF\u0010@\u001a\u0004\bE\u0010+R \u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010D\u0012\u0004\bH\u0010@\u001a\u0004\bG\u0010+R/\u0010\u000f\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010I\u0012\u0004\bK\u0010@\u001a\u0004\bJ\u0010.R/\u0010\u0012\u001a\u00110\u0010¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010L\u0012\u0004\bN\u0010@\u001a\u0004\bM\u00100R/\u0010\u0013\u001a\u00110\r¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010I\u0012\u0004\bP\u0010@\u001a\u0004\bO\u0010.R&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010Q\u0012\u0004\bS\u0010@\u001a\u0004\bR\u00103R \u0010\u0016\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010D\u0012\u0004\bU\u0010@\u001a\u0004\bT\u0010+¨\u0006X"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto$Surrogate;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "", "group_id", "name", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "test_count", "", "Lcom/robinhood/idl/serialization/FloatSerializer;", "test_coverage", "file_count", "", "dependencies", "module_type", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;IFILjava/util/List;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;IFILjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "component2", "()Lj$/time/Instant;", "component3", "()Ljava/lang/String;", "component4", "component5", "()I", "component6", "()F", "component7", "component8", "()Ljava/util/List;", "component9", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;IFILjava/util/List;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto$Surrogate;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/eventlogging/ClientPlatformDto;", "getPlatform", "getPlatform$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "Ljava/lang/String;", "getGroup_id", "getGroup_id$annotations", "getName", "getName$annotations", "I", "getTest_count", "getTest_count$annotations", "F", "getTest_coverage", "getTest_coverage$annotations", "getFile_count", "getFile_count$annotations", "Ljava/util/List;", "getDependencies", "getDependencies$annotations", "getModule_type", "getModule_type$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final java.util.List<String> dependencies;
        private final int file_count;
        private final String group_id;
        private final String module_type;
        private final String name;
        private final ClientPlatformDto platform;
        private final int test_count;
        private final float test_coverage;
        private final Instant timestamp;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientModuleEventDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientModuleEventDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((ClientPlatformDto) null, (Instant) null, (String) null, (String) null, 0, 0.0f, 0, (java.util.List) null, (String) null, 511, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ClientPlatformDto clientPlatformDto, Instant instant, String str, String str2, int i, float f, int i2, java.util.List list, String str3, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                clientPlatformDto = surrogate.platform;
            }
            if ((i3 & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i3 & 4) != 0) {
                str = surrogate.group_id;
            }
            if ((i3 & 8) != 0) {
                str2 = surrogate.name;
            }
            if ((i3 & 16) != 0) {
                i = surrogate.test_count;
            }
            if ((i3 & 32) != 0) {
                f = surrogate.test_coverage;
            }
            if ((i3 & 64) != 0) {
                i2 = surrogate.file_count;
            }
            if ((i3 & 128) != 0) {
                list = surrogate.dependencies;
            }
            if ((i3 & 256) != 0) {
                str3 = surrogate.module_type;
            }
            java.util.List list2 = list;
            String str4 = str3;
            float f2 = f;
            int i4 = i2;
            int i5 = i;
            String str5 = str;
            return surrogate.copy(clientPlatformDto, instant, str5, str2, i5, f2, i4, list2, str4);
        }

        @SerialName("dependencies")
        @JsonAnnotations2(names = {"dependencies"})
        public static /* synthetic */ void getDependencies$annotations() {
        }

        @SerialName("fileCount")
        @JsonAnnotations2(names = {"file_count"})
        public static /* synthetic */ void getFile_count$annotations() {
        }

        @SerialName("groupId")
        @JsonAnnotations2(names = {"group_id"})
        public static /* synthetic */ void getGroup_id$annotations() {
        }

        @SerialName("moduleType")
        @JsonAnnotations2(names = {"module_type"})
        public static /* synthetic */ void getModule_type$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("testCount")
        @JsonAnnotations2(names = {"test_count"})
        public static /* synthetic */ void getTest_count$annotations() {
        }

        @SerialName("testCoverage")
        @JsonAnnotations2(names = {"test_coverage"})
        public static /* synthetic */ void getTest_coverage$annotations() {
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
        public final String getGroup_id() {
            return this.group_id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component5, reason: from getter */
        public final int getTest_count() {
            return this.test_count;
        }

        /* renamed from: component6, reason: from getter */
        public final float getTest_coverage() {
            return this.test_coverage;
        }

        /* renamed from: component7, reason: from getter */
        public final int getFile_count() {
            return this.file_count;
        }

        public final java.util.List<String> component8() {
            return this.dependencies;
        }

        /* renamed from: component9, reason: from getter */
        public final String getModule_type() {
            return this.module_type;
        }

        public final Surrogate copy(ClientPlatformDto platform, Instant timestamp, String group_id, String name, int test_count, float test_coverage, int file_count, java.util.List<String> dependencies, String module_type) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(group_id, "group_id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(dependencies, "dependencies");
            Intrinsics.checkNotNullParameter(module_type, "module_type");
            return new Surrogate(platform, timestamp, group_id, name, test_count, test_coverage, file_count, dependencies, module_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.platform == surrogate.platform && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.group_id, surrogate.group_id) && Intrinsics.areEqual(this.name, surrogate.name) && this.test_count == surrogate.test_count && Float.compare(this.test_coverage, surrogate.test_coverage) == 0 && this.file_count == surrogate.file_count && Intrinsics.areEqual(this.dependencies, surrogate.dependencies) && Intrinsics.areEqual(this.module_type, surrogate.module_type);
        }

        public int hashCode() {
            int iHashCode = this.platform.hashCode() * 31;
            Instant instant = this.timestamp;
            return ((((((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.group_id.hashCode()) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.test_count)) * 31) + Float.hashCode(this.test_coverage)) * 31) + Integer.hashCode(this.file_count)) * 31) + this.dependencies.hashCode()) * 31) + this.module_type.hashCode();
        }

        public String toString() {
            return "Surrogate(platform=" + this.platform + ", timestamp=" + this.timestamp + ", group_id=" + this.group_id + ", name=" + this.name + ", test_count=" + this.test_count + ", test_coverage=" + this.test_coverage + ", file_count=" + this.file_count + ", dependencies=" + this.dependencies + ", module_type=" + this.module_type + ")";
        }

        /* compiled from: ClientModuleEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ClientModuleEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ClientPlatformDto clientPlatformDto, Instant instant, String str, String str2, int i2, float f, int i3, java.util.List list, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            this.platform = (i & 1) == 0 ? ClientPlatformDto.INSTANCE.getZeroValue() : clientPlatformDto;
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.group_id = "";
            } else {
                this.group_id = str;
            }
            if ((i & 8) == 0) {
                this.name = "";
            } else {
                this.name = str2;
            }
            if ((i & 16) == 0) {
                this.test_count = 0;
            } else {
                this.test_count = i2;
            }
            if ((i & 32) == 0) {
                this.test_coverage = 0.0f;
            } else {
                this.test_coverage = f;
            }
            if ((i & 64) == 0) {
                this.file_count = 0;
            } else {
                this.file_count = i3;
            }
            if ((i & 128) == 0) {
                this.dependencies = CollectionsKt.emptyList();
            } else {
                this.dependencies = list;
            }
            if ((i & 256) == 0) {
                this.module_type = "";
            } else {
                this.module_type = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.platform != ClientPlatformDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, ClientPlatformDto.Serializer.INSTANCE, self.platform);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.group_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.group_id);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 3, self.name);
            }
            int i = self.test_count;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (Float.compare(self.test_coverage, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 5, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.test_coverage));
            }
            int i2 = self.file_count;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            if (!Intrinsics.areEqual(self.dependencies, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.dependencies);
            }
            if (Intrinsics.areEqual(self.module_type, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 8, self.module_type);
        }

        public Surrogate(ClientPlatformDto platform, Instant instant, String group_id, String name, int i, float f, int i2, java.util.List<String> dependencies, String module_type) {
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(group_id, "group_id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(dependencies, "dependencies");
            Intrinsics.checkNotNullParameter(module_type, "module_type");
            this.platform = platform;
            this.timestamp = instant;
            this.group_id = group_id;
            this.name = name;
            this.test_count = i;
            this.test_coverage = f;
            this.file_count = i2;
            this.dependencies = dependencies;
            this.module_type = module_type;
        }

        public final ClientPlatformDto getPlatform() {
            return this.platform;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.rosetta.eventlogging.ClientPlatformDto r3, p479j$.time.Instant r4, java.lang.String r5, java.lang.String r6, int r7, float r8, int r9, java.util.List r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r2 = this;
                r13 = r12 & 1
                if (r13 == 0) goto La
                com.robinhood.rosetta.eventlogging.ClientPlatformDto$Companion r3 = com.robinhood.rosetta.eventlogging.ClientPlatformDto.INSTANCE
                com.robinhood.rosetta.eventlogging.ClientPlatformDto r3 = r3.getZeroValue()
            La:
                r13 = r12 & 2
                if (r13 == 0) goto Lf
                r4 = 0
            Lf:
                r13 = r12 & 4
                java.lang.String r0 = ""
                if (r13 == 0) goto L16
                r5 = r0
            L16:
                r13 = r12 & 8
                if (r13 == 0) goto L1b
                r6 = r0
            L1b:
                r13 = r12 & 16
                r1 = 0
                if (r13 == 0) goto L21
                r7 = r1
            L21:
                r13 = r12 & 32
                if (r13 == 0) goto L26
                r8 = 0
            L26:
                r13 = r12 & 64
                if (r13 == 0) goto L2b
                r9 = r1
            L2b:
                r13 = r12 & 128(0x80, float:1.794E-43)
                if (r13 == 0) goto L33
                java.util.List r10 = kotlin.collections.CollectionsKt.emptyList()
            L33:
                r12 = r12 & 256(0x100, float:3.59E-43)
                if (r12 == 0) goto L42
                r13 = r0
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
                goto L4c
            L42:
                r13 = r11
                r12 = r10
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
            L4c:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.ClientModuleEventDto.Surrogate.<init>(com.robinhood.rosetta.eventlogging.ClientPlatformDto, j$.time.Instant, java.lang.String, java.lang.String, int, float, int, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getGroup_id() {
            return this.group_id;
        }

        public final String getName() {
            return this.name;
        }

        public final int getTest_count() {
            return this.test_count;
        }

        public final float getTest_coverage() {
            return this.test_coverage;
        }

        public final int getFile_count() {
            return this.file_count;
        }

        public final java.util.List<String> getDependencies() {
            return this.dependencies;
        }

        public final String getModule_type() {
            return this.module_type;
        }
    }

    /* compiled from: ClientModuleEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto;", "Lcom/robinhood/rosetta/eventlogging/ClientModuleEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ClientModuleEventDto, ClientModuleEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientModuleEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientModuleEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ClientModuleEventDto> getBinaryBase64Serializer() {
            return (KSerializer) ClientModuleEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ClientModuleEvent> getProtoAdapter() {
            return ClientModuleEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientModuleEventDto getZeroValue() {
            return ClientModuleEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ClientModuleEventDto fromProto(ClientModuleEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ClientPlatformDto clientPlatformDtoFromProto = ClientPlatformDto.INSTANCE.fromProto(proto.getPlatform());
            Instant timestamp = proto.getTimestamp();
            String group_id = proto.getGroup_id();
            String name = proto.getName();
            int test_count = proto.getTest_count();
            float test_coverage = proto.getTest_coverage();
            int file_count = proto.getFile_count();
            java.util.List<String> dependencies = proto.getDependencies();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(dependencies, 10));
            Iterator<T> it = dependencies.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new ClientModuleEventDto(new Surrogate(clientPlatformDtoFromProto, timestamp, group_id, name, test_count, test_coverage, file_count, arrayList, proto.getModule_type()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ClientModuleEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientModuleEventDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new ClientModuleEventDto(null, null, null, null, 0, 0.0f, 0, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ClientModuleEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ClientModuleEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ClientModuleEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ClientModuleEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ClientModuleEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ClientModuleEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ClientModuleEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientModuleEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ClientModuleEventDto";
        }
    }
}
