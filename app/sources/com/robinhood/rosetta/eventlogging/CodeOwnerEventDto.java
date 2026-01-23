package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.eventlogging.CodeOwnerEventDto;
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

/* compiled from: CodeOwnerEventDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004=<>?B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0085\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0006\u0010\u0018J\u0089\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001eR\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00108F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b7\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b8\u0010\u001eR\u0011\u0010\u0015\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b9\u0010\u001eR\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006@"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeOwnerEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CodeOwnerEvent;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/CodeOwnerEventDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CodeOwnerEventDto$Surrogate;)V", "", "directory_name", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "owner", "uuid", "commit_id", "", "people", "subteam", "team", "division", "manager", "", "blocking_code_reviewer", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/robinhood/rosetta/eventlogging/CodeOwnerEventDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/CodeOwnerEvent;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/CodeOwnerEventDto$Surrogate;", "getDirectory_name", "getTimestamp", "()Lj$/time/Instant;", "getOwner", "getUuid", "getCommit_id", "getPeople", "()Ljava/util/List;", "getSubteam", "getTeam", "getDivision", "getManager", "getBlocking_code_reviewer", "()Z", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class CodeOwnerEventDto implements Dto3<CodeOwnerEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CodeOwnerEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CodeOwnerEventDto, CodeOwnerEvent>> binaryBase64Serializer$delegate;
    private static final CodeOwnerEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CodeOwnerEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CodeOwnerEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getDirectory_name() {
        return this.surrogate.getDirectory_name();
    }

    public final Instant getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getOwner() {
        return this.surrogate.getOwner();
    }

    public final String getUuid() {
        return this.surrogate.getUuid();
    }

    public final String getCommit_id() {
        return this.surrogate.getCommit_id();
    }

    public final java.util.List<String> getPeople() {
        return this.surrogate.getPeople();
    }

    public final String getSubteam() {
        return this.surrogate.getSubteam();
    }

    public final String getTeam() {
        return this.surrogate.getTeam();
    }

    public final String getDivision() {
        return this.surrogate.getDivision();
    }

    public final String getManager() {
        return this.surrogate.getManager();
    }

    public final boolean getBlocking_code_reviewer() {
        return this.surrogate.getBlocking_code_reviewer();
    }

    public /* synthetic */ CodeOwnerEventDto(String str, Instant instant, String str2, String str3, String str4, java.util.List list, String str5, String str6, String str7, String str8, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodeOwnerEventDto(String directory_name, Instant instant, String owner, String uuid, String commit_id, java.util.List<String> people, String subteam, String team, String division, String manager, boolean z) {
        this(new Surrogate(directory_name, instant, owner, uuid, commit_id, people, subteam, team, division, manager, z));
        Intrinsics.checkNotNullParameter(directory_name, "directory_name");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(commit_id, "commit_id");
        Intrinsics.checkNotNullParameter(people, "people");
        Intrinsics.checkNotNullParameter(subteam, "subteam");
        Intrinsics.checkNotNullParameter(team, "team");
        Intrinsics.checkNotNullParameter(division, "division");
        Intrinsics.checkNotNullParameter(manager, "manager");
    }

    public static /* synthetic */ CodeOwnerEventDto copy$default(CodeOwnerEventDto codeOwnerEventDto, String str, Instant instant, String str2, String str3, String str4, java.util.List list, String str5, String str6, String str7, String str8, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeOwnerEventDto.surrogate.getDirectory_name();
        }
        if ((i & 2) != 0) {
            instant = codeOwnerEventDto.surrogate.getTimestamp();
        }
        if ((i & 4) != 0) {
            str2 = codeOwnerEventDto.surrogate.getOwner();
        }
        if ((i & 8) != 0) {
            str3 = codeOwnerEventDto.surrogate.getUuid();
        }
        if ((i & 16) != 0) {
            str4 = codeOwnerEventDto.surrogate.getCommit_id();
        }
        if ((i & 32) != 0) {
            list = codeOwnerEventDto.surrogate.getPeople();
        }
        if ((i & 64) != 0) {
            str5 = codeOwnerEventDto.surrogate.getSubteam();
        }
        if ((i & 128) != 0) {
            str6 = codeOwnerEventDto.surrogate.getTeam();
        }
        if ((i & 256) != 0) {
            str7 = codeOwnerEventDto.surrogate.getDivision();
        }
        if ((i & 512) != 0) {
            str8 = codeOwnerEventDto.surrogate.getManager();
        }
        if ((i & 1024) != 0) {
            z = codeOwnerEventDto.surrogate.getBlocking_code_reviewer();
        }
        String str9 = str8;
        boolean z2 = z;
        String str10 = str6;
        String str11 = str7;
        java.util.List list2 = list;
        String str12 = str5;
        String str13 = str4;
        String str14 = str2;
        return codeOwnerEventDto.copy(str, instant, str14, str3, str13, list2, str12, str10, str11, str9, z2);
    }

    public final CodeOwnerEventDto copy(String directory_name, Instant timestamp, String owner, String uuid, String commit_id, java.util.List<String> people, String subteam, String team, String division, String manager, boolean blocking_code_reviewer) {
        Intrinsics.checkNotNullParameter(directory_name, "directory_name");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(commit_id, "commit_id");
        Intrinsics.checkNotNullParameter(people, "people");
        Intrinsics.checkNotNullParameter(subteam, "subteam");
        Intrinsics.checkNotNullParameter(team, "team");
        Intrinsics.checkNotNullParameter(division, "division");
        Intrinsics.checkNotNullParameter(manager, "manager");
        return new CodeOwnerEventDto(new Surrogate(directory_name, timestamp, owner, uuid, commit_id, people, subteam, team, division, manager, blocking_code_reviewer));
    }

    @Override // com.robinhood.idl.Dto
    public CodeOwnerEvent toProto() {
        String directory_name = this.surrogate.getDirectory_name();
        Instant timestamp = this.surrogate.getTimestamp();
        String owner = this.surrogate.getOwner();
        String uuid = this.surrogate.getUuid();
        String commit_id = this.surrogate.getCommit_id();
        java.util.List<String> people = this.surrogate.getPeople();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(people, 10));
        Iterator<T> it = people.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new CodeOwnerEvent(directory_name, timestamp, owner, uuid, commit_id, arrayList, this.surrogate.getSubteam(), this.surrogate.getTeam(), this.surrogate.getDivision(), this.surrogate.getManager(), this.surrogate.getBlocking_code_reviewer(), null, 2048, null);
    }

    public String toString() {
        return "[CodeOwnerEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CodeOwnerEventDto) && Intrinsics.areEqual(((CodeOwnerEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: CodeOwnerEventDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b8\b\u0083\b\u0018\u0000 W2\u00020\u0001:\u0002XWB¡\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u008d\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J6\u0010'\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010&J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010&J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010&J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010&J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010&J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010&J\u0010\u00102\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b2\u00103Jª\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010&J\u0010\u00107\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020\u00132\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010&RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010@\u0012\u0004\bB\u0010?\u001a\u0004\bA\u0010(R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010<\u0012\u0004\bD\u0010?\u001a\u0004\bC\u0010&R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010<\u0012\u0004\bF\u0010?\u001a\u0004\bE\u0010&R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010<\u0012\u0004\bH\u0010?\u001a\u0004\bG\u0010&R&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010I\u0012\u0004\bK\u0010?\u001a\u0004\bJ\u0010-R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010<\u0012\u0004\bM\u0010?\u001a\u0004\bL\u0010&R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010<\u0012\u0004\bO\u0010?\u001a\u0004\bN\u0010&R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010<\u0012\u0004\bQ\u0010?\u001a\u0004\bP\u0010&R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010<\u0012\u0004\bS\u0010?\u001a\u0004\bR\u0010&R \u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010T\u0012\u0004\bV\u0010?\u001a\u0004\bU\u00103¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeOwnerEventDto$Surrogate;", "", "", "directory_name", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "timestamp", "owner", "uuid", "commit_id", "", "people", "subteam", "team", "division", "manager", "", "blocking_code_reviewer", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/CodeOwnerEventDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lj$/time/Instant;", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "component10", "component11", "()Z", "copy", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/robinhood/rosetta/eventlogging/CodeOwnerEventDto$Surrogate;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDirectory_name", "getDirectory_name$annotations", "()V", "Lj$/time/Instant;", "getTimestamp", "getTimestamp$annotations", "getOwner", "getOwner$annotations", "getUuid", "getUuid$annotations", "getCommit_id", "getCommit_id$annotations", "Ljava/util/List;", "getPeople", "getPeople$annotations", "getSubteam", "getSubteam$annotations", "getTeam", "getTeam$annotations", "getDivision", "getDivision$annotations", "getManager", "getManager$annotations", "Z", "getBlocking_code_reviewer", "getBlocking_code_reviewer$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final boolean blocking_code_reviewer;
        private final String commit_id;
        private final String directory_name;
        private final String division;
        private final String manager;
        private final String owner;
        private final java.util.List<String> people;
        private final String subteam;
        private final String team;
        private final Instant timestamp;
        private final String uuid;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.eventlogging.CodeOwnerEventDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CodeOwnerEventDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null};

        public Surrogate() {
            this((String) null, (Instant) null, (String) null, (String) null, (String) null, (java.util.List) null, (String) null, (String) null, (String) null, (String) null, false, 2047, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, Instant instant, String str2, String str3, String str4, java.util.List list, String str5, String str6, String str7, String str8, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.directory_name;
            }
            if ((i & 2) != 0) {
                instant = surrogate.timestamp;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.owner;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.uuid;
            }
            if ((i & 16) != 0) {
                str4 = surrogate.commit_id;
            }
            if ((i & 32) != 0) {
                list = surrogate.people;
            }
            if ((i & 64) != 0) {
                str5 = surrogate.subteam;
            }
            if ((i & 128) != 0) {
                str6 = surrogate.team;
            }
            if ((i & 256) != 0) {
                str7 = surrogate.division;
            }
            if ((i & 512) != 0) {
                str8 = surrogate.manager;
            }
            if ((i & 1024) != 0) {
                z = surrogate.blocking_code_reviewer;
            }
            String str9 = str8;
            boolean z2 = z;
            String str10 = str6;
            String str11 = str7;
            java.util.List list2 = list;
            String str12 = str5;
            String str13 = str4;
            String str14 = str2;
            return surrogate.copy(str, instant, str14, str3, str13, list2, str12, str10, str11, str9, z2);
        }

        @SerialName("blockingCodeReviewer")
        @JsonAnnotations2(names = {"blocking_code_reviewer"})
        public static /* synthetic */ void getBlocking_code_reviewer$annotations() {
        }

        @SerialName("commitId")
        @JsonAnnotations2(names = {"commit_id"})
        public static /* synthetic */ void getCommit_id$annotations() {
        }

        @SerialName("directoryName")
        @JsonAnnotations2(names = {"directory_name"})
        public static /* synthetic */ void getDirectory_name$annotations() {
        }

        @SerialName("division")
        @JsonAnnotations2(names = {"division"})
        public static /* synthetic */ void getDivision$annotations() {
        }

        @SerialName("manager")
        @JsonAnnotations2(names = {"manager"})
        public static /* synthetic */ void getManager$annotations() {
        }

        @SerialName("owner")
        @JsonAnnotations2(names = {"owner"})
        public static /* synthetic */ void getOwner$annotations() {
        }

        @SerialName("people")
        @JsonAnnotations2(names = {"people"})
        public static /* synthetic */ void getPeople$annotations() {
        }

        @SerialName("subteam")
        @JsonAnnotations2(names = {"subteam"})
        public static /* synthetic */ void getSubteam$annotations() {
        }

        @SerialName("team")
        @JsonAnnotations2(names = {"team"})
        public static /* synthetic */ void getTeam$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("uuid")
        @JsonAnnotations2(names = {"uuid"})
        public static /* synthetic */ void getUuid$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getDirectory_name() {
            return this.directory_name;
        }

        /* renamed from: component10, reason: from getter */
        public final String getManager() {
            return this.manager;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getBlocking_code_reviewer() {
            return this.blocking_code_reviewer;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final String getOwner() {
            return this.owner;
        }

        /* renamed from: component4, reason: from getter */
        public final String getUuid() {
            return this.uuid;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCommit_id() {
            return this.commit_id;
        }

        public final java.util.List<String> component6() {
            return this.people;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSubteam() {
            return this.subteam;
        }

        /* renamed from: component8, reason: from getter */
        public final String getTeam() {
            return this.team;
        }

        /* renamed from: component9, reason: from getter */
        public final String getDivision() {
            return this.division;
        }

        public final Surrogate copy(String directory_name, Instant timestamp, String owner, String uuid, String commit_id, java.util.List<String> people, String subteam, String team, String division, String manager, boolean blocking_code_reviewer) {
            Intrinsics.checkNotNullParameter(directory_name, "directory_name");
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(commit_id, "commit_id");
            Intrinsics.checkNotNullParameter(people, "people");
            Intrinsics.checkNotNullParameter(subteam, "subteam");
            Intrinsics.checkNotNullParameter(team, "team");
            Intrinsics.checkNotNullParameter(division, "division");
            Intrinsics.checkNotNullParameter(manager, "manager");
            return new Surrogate(directory_name, timestamp, owner, uuid, commit_id, people, subteam, team, division, manager, blocking_code_reviewer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.directory_name, surrogate.directory_name) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.owner, surrogate.owner) && Intrinsics.areEqual(this.uuid, surrogate.uuid) && Intrinsics.areEqual(this.commit_id, surrogate.commit_id) && Intrinsics.areEqual(this.people, surrogate.people) && Intrinsics.areEqual(this.subteam, surrogate.subteam) && Intrinsics.areEqual(this.team, surrogate.team) && Intrinsics.areEqual(this.division, surrogate.division) && Intrinsics.areEqual(this.manager, surrogate.manager) && this.blocking_code_reviewer == surrogate.blocking_code_reviewer;
        }

        public int hashCode() {
            int iHashCode = this.directory_name.hashCode() * 31;
            Instant instant = this.timestamp;
            return ((((((((((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.owner.hashCode()) * 31) + this.uuid.hashCode()) * 31) + this.commit_id.hashCode()) * 31) + this.people.hashCode()) * 31) + this.subteam.hashCode()) * 31) + this.team.hashCode()) * 31) + this.division.hashCode()) * 31) + this.manager.hashCode()) * 31) + java.lang.Boolean.hashCode(this.blocking_code_reviewer);
        }

        public String toString() {
            return "Surrogate(directory_name=" + this.directory_name + ", timestamp=" + this.timestamp + ", owner=" + this.owner + ", uuid=" + this.uuid + ", commit_id=" + this.commit_id + ", people=" + this.people + ", subteam=" + this.subteam + ", team=" + this.team + ", division=" + this.division + ", manager=" + this.manager + ", blocking_code_reviewer=" + this.blocking_code_reviewer + ")";
        }

        /* compiled from: CodeOwnerEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeOwnerEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CodeOwnerEventDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CodeOwnerEventDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, Instant instant, String str2, String str3, String str4, java.util.List list, String str5, String str6, String str7, String str8, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.directory_name = "";
            } else {
                this.directory_name = str;
            }
            if ((i & 2) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = instant;
            }
            if ((i & 4) == 0) {
                this.owner = "";
            } else {
                this.owner = str2;
            }
            if ((i & 8) == 0) {
                this.uuid = "";
            } else {
                this.uuid = str3;
            }
            if ((i & 16) == 0) {
                this.commit_id = "";
            } else {
                this.commit_id = str4;
            }
            if ((i & 32) == 0) {
                this.people = CollectionsKt.emptyList();
            } else {
                this.people = list;
            }
            if ((i & 64) == 0) {
                this.subteam = "";
            } else {
                this.subteam = str5;
            }
            if ((i & 128) == 0) {
                this.team = "";
            } else {
                this.team = str6;
            }
            if ((i & 256) == 0) {
                this.division = "";
            } else {
                this.division = str7;
            }
            if ((i & 512) == 0) {
                this.manager = "";
            } else {
                this.manager = str8;
            }
            if ((i & 1024) == 0) {
                this.blocking_code_reviewer = false;
            } else {
                this.blocking_code_reviewer = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.directory_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.directory_name);
            }
            Instant instant = self.timestamp;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.owner, "")) {
                output.encodeStringElement(serialDesc, 2, self.owner);
            }
            if (!Intrinsics.areEqual(self.uuid, "")) {
                output.encodeStringElement(serialDesc, 3, self.uuid);
            }
            if (!Intrinsics.areEqual(self.commit_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.commit_id);
            }
            if (!Intrinsics.areEqual(self.people, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.people);
            }
            if (!Intrinsics.areEqual(self.subteam, "")) {
                output.encodeStringElement(serialDesc, 6, self.subteam);
            }
            if (!Intrinsics.areEqual(self.team, "")) {
                output.encodeStringElement(serialDesc, 7, self.team);
            }
            if (!Intrinsics.areEqual(self.division, "")) {
                output.encodeStringElement(serialDesc, 8, self.division);
            }
            if (!Intrinsics.areEqual(self.manager, "")) {
                output.encodeStringElement(serialDesc, 9, self.manager);
            }
            boolean z = self.blocking_code_reviewer;
            if (z) {
                output.encodeBooleanElement(serialDesc, 10, z);
            }
        }

        public Surrogate(String directory_name, Instant instant, String owner, String uuid, String commit_id, java.util.List<String> people, String subteam, String team, String division, String manager, boolean z) {
            Intrinsics.checkNotNullParameter(directory_name, "directory_name");
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(commit_id, "commit_id");
            Intrinsics.checkNotNullParameter(people, "people");
            Intrinsics.checkNotNullParameter(subteam, "subteam");
            Intrinsics.checkNotNullParameter(team, "team");
            Intrinsics.checkNotNullParameter(division, "division");
            Intrinsics.checkNotNullParameter(manager, "manager");
            this.directory_name = directory_name;
            this.timestamp = instant;
            this.owner = owner;
            this.uuid = uuid;
            this.commit_id = commit_id;
            this.people = people;
            this.subteam = subteam;
            this.team = team;
            this.division = division;
            this.manager = manager;
            this.blocking_code_reviewer = z;
        }

        public /* synthetic */ Surrogate(String str, Instant instant, String str2, String str3, String str4, java.util.List list, String str5, String str6, String str7, String str8, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? false : z);
        }

        public final String getDirectory_name() {
            return this.directory_name;
        }

        public final Instant getTimestamp() {
            return this.timestamp;
        }

        public final String getOwner() {
            return this.owner;
        }

        public final String getUuid() {
            return this.uuid;
        }

        public final String getCommit_id() {
            return this.commit_id;
        }

        public final java.util.List<String> getPeople() {
            return this.people;
        }

        public final String getSubteam() {
            return this.subteam;
        }

        public final String getTeam() {
            return this.team;
        }

        public final String getDivision() {
            return this.division;
        }

        public final String getManager() {
            return this.manager;
        }

        public final boolean getBlocking_code_reviewer() {
            return this.blocking_code_reviewer;
        }
    }

    /* compiled from: CodeOwnerEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeOwnerEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CodeOwnerEventDto;", "Lcom/robinhood/rosetta/eventlogging/CodeOwnerEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CodeOwnerEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CodeOwnerEventDto, CodeOwnerEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CodeOwnerEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CodeOwnerEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CodeOwnerEventDto> getBinaryBase64Serializer() {
            return (KSerializer) CodeOwnerEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CodeOwnerEvent> getProtoAdapter() {
            return CodeOwnerEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CodeOwnerEventDto getZeroValue() {
            return CodeOwnerEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CodeOwnerEventDto fromProto(CodeOwnerEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String directory_name = proto.getDirectory_name();
            Instant timestamp = proto.getTimestamp();
            String owner = proto.getOwner();
            String uuid = proto.getUuid();
            String commit_id = proto.getCommit_id();
            java.util.List<String> people = proto.getPeople();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(people, 10));
            Iterator<T> it = people.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new CodeOwnerEventDto(new Surrogate(directory_name, timestamp, owner, uuid, commit_id, arrayList, proto.getSubteam(), proto.getTeam(), proto.getDivision(), proto.getManager(), proto.getBlocking_code_reviewer()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CodeOwnerEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CodeOwnerEventDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new CodeOwnerEventDto(null, null, null, null, null, null, null, null, null, null, false, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CodeOwnerEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeOwnerEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CodeOwnerEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CodeOwnerEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CodeOwnerEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CodeOwnerEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CodeOwnerEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CodeOwnerEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CodeOwnerEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CodeOwnerEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CodeOwnerEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CodeOwnerEventDto";
        }
    }
}
