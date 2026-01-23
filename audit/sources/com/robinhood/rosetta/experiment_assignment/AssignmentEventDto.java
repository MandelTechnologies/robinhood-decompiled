package com.robinhood.rosetta.experiment_assignment;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.experiment_assignment.AssignmentEventDto;
import com.robinhood.rosetta.experiment_assignment.AssignmentResultDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: AssignmentEventDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004<=>?B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B§\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u001bJ¤\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\tJ\b\u0010/\u001a\u00020\u0002H\u0016J\b\u00100\u001a\u00020\tH\u0016J\u0013\u00101\u001a\u00020\u00112\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00104\u001a\u000205H\u0016J\u0018\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000205H\u0016J\b\u0010;\u001a\u000205H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000e8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b)\u0010$R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u0019\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001d¨\u0006@"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentEventDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentEvent;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentEventDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/experiment_assignment/AssignmentEventDto$Surrogate;)V", "user_agent", "", "results", "", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentResultDto;", "variants", "", "request_type", "kaizen_list_respected", "", "platform", "version", "entity_type", "entity_id", "trigger", "source", "event", "timestamp", "application", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUser_agent", "()Ljava/lang/String;", "getResults", "()Ljava/util/List;", "getVariants", "()Ljava/util/Map;", "getRequest_type", "getKaizen_list_respected", "()Z", "getPlatform", "getVersion", "getEntity_type", "getEntity_id", "getTrigger", "getSource", "getEvent", "getTimestamp", "getApplication", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class AssignmentEventDto implements Dto3<AssignmentEvent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AssignmentEventDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AssignmentEventDto, AssignmentEvent>> binaryBase64Serializer$delegate;
    private static final AssignmentEventDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AssignmentEventDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AssignmentEventDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getUser_agent() {
        return this.surrogate.getUser_agent();
    }

    public final List<AssignmentResultDto> getResults() {
        return this.surrogate.getResults();
    }

    public final Map<String, String> getVariants() {
        return this.surrogate.getVariants();
    }

    public final String getRequest_type() {
        return this.surrogate.getRequest_type();
    }

    public final boolean getKaizen_list_respected() {
        return this.surrogate.getKaizen_list_respected();
    }

    public final String getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final String getVersion() {
        return this.surrogate.getVersion();
    }

    public final String getEntity_type() {
        return this.surrogate.getEntity_type();
    }

    public final String getEntity_id() {
        return this.surrogate.getEntity_id();
    }

    public final boolean getTrigger() {
        return this.surrogate.getTrigger();
    }

    public final String getSource() {
        return this.surrogate.getSource();
    }

    public final String getEvent() {
        return this.surrogate.getEvent();
    }

    public final String getTimestamp() {
        return this.surrogate.getTimestamp();
    }

    public final String getApplication() {
        return this.surrogate.getApplication();
    }

    public /* synthetic */ AssignmentEventDto(String str, List list, Map map, String str2, boolean z, String str3, String str4, String str5, String str6, boolean z2, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) == 0 ? z2 : false, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? "" : str9, (i & 8192) != 0 ? "" : str10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssignmentEventDto(String user_agent, List<AssignmentResultDto> results, Map<String, String> variants, String request_type, boolean z, String platform, String version, String entity_type, String entity_id, boolean z2, String source, String event, String timestamp, String application) {
        this(new Surrogate(user_agent, results, variants, request_type, z, platform, version, entity_type, entity_id, z2, source, event, timestamp, application));
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(variants, "variants");
        Intrinsics.checkNotNullParameter(request_type, "request_type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(application, "application");
    }

    public final AssignmentEventDto copy(String user_agent, List<AssignmentResultDto> results, Map<String, String> variants, String request_type, boolean kaizen_list_respected, String platform, String version, String entity_type, String entity_id, boolean trigger, String source, String event, String timestamp, String application) {
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(variants, "variants");
        Intrinsics.checkNotNullParameter(request_type, "request_type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(application, "application");
        return new AssignmentEventDto(new Surrogate(user_agent, results, variants, request_type, kaizen_list_respected, platform, version, entity_type, entity_id, trigger, source, event, timestamp, application));
    }

    @Override // com.robinhood.idl.Dto
    public AssignmentEvent toProto() {
        String user_agent = this.surrogate.getUser_agent();
        List<AssignmentResultDto> results = this.surrogate.getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator<T> it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(((AssignmentResultDto) it.next()).toProto());
        }
        Set<Map.Entry<String, String>> setEntrySet = this.surrogate.getVariants().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return new AssignmentEvent(user_agent, arrayList, linkedHashMap, this.surrogate.getRequest_type(), this.surrogate.getKaizen_list_respected(), this.surrogate.getPlatform(), this.surrogate.getVersion(), this.surrogate.getEntity_type(), this.surrogate.getEntity_id(), this.surrogate.getTrigger(), this.surrogate.getSource(), this.surrogate.getEvent(), this.surrogate.getTimestamp(), this.surrogate.getApplication(), null, 16384, null);
    }

    public String toString() {
        return "[AssignmentEventDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AssignmentEventDto) && Intrinsics.areEqual(((AssignmentEventDto) other).surrogate, this.surrogate);
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
    /* compiled from: AssignmentEventDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 Y2\u00020\u0001:\u0002XYB¥\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016Bµ\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0015\u0010\u001bJ\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u000bHÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u000bHÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J§\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\u0013\u0010L\u001a\u00020\u000b2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020\u0018HÖ\u0001J\t\u0010O\u001a\u00020\u0003HÖ\u0001J%\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0001¢\u0006\u0002\bWR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"R(\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010%R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010*R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010\u001fR\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010\u001fR\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010\u001fR\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001d\u001a\u0004\b2\u0010\u001fR\u001c\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u001d\u001a\u0004\b4\u0010*R\u001c\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\u001d\u001a\u0004\b6\u0010\u001fR\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u001d\u001a\u0004\b8\u0010\u001fR\u001c\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010\u001d\u001a\u0004\b:\u0010\u001fR\u001c\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010\u001d\u001a\u0004\b<\u0010\u001f¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentEventDto$Surrogate;", "", "user_agent", "", "results", "", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentResultDto;", "variants", "", "request_type", "kaizen_list_respected", "", "platform", "version", "entity_type", "entity_id", "trigger", "source", "event", "timestamp", "application", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUser_agent$annotations", "()V", "getUser_agent", "()Ljava/lang/String;", "getResults$annotations", "getResults", "()Ljava/util/List;", "getVariants$annotations", "getVariants", "()Ljava/util/Map;", "getRequest_type$annotations", "getRequest_type", "getKaizen_list_respected$annotations", "getKaizen_list_respected", "()Z", "getPlatform$annotations", "getPlatform", "getVersion$annotations", "getVersion", "getEntity_type$annotations", "getEntity_type", "getEntity_id$annotations", "getEntity_id", "getTrigger$annotations", "getTrigger", "getSource$annotations", "getSource", "getEvent$annotations", "getEvent", "getTimestamp$annotations", "getTimestamp", "getApplication$annotations", "getApplication", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$experiment_assignment_service_externalRelease", "$serializer", "Companion", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String application;
        private final String entity_id;
        private final String entity_type;
        private final String event;
        private final boolean kaizen_list_respected;
        private final String platform;
        private final String request_type;
        private final List<AssignmentResultDto> results;
        private final String source;
        private final String timestamp;
        private final boolean trigger;
        private final String user_agent;
        private final Map<String, String> variants;
        private final String version;

        public Surrogate() {
            this((String) null, (List) null, (Map) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(AssignmentResultDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
        }

        @SerialName("application")
        @JsonAnnotations2(names = {"application"})
        public static /* synthetic */ void getApplication$annotations() {
        }

        @SerialName("entityId")
        @JsonAnnotations2(names = {"entity_id"})
        public static /* synthetic */ void getEntity_id$annotations() {
        }

        @SerialName("entityType")
        @JsonAnnotations2(names = {"entity_type"})
        public static /* synthetic */ void getEntity_type$annotations() {
        }

        @SerialName("event")
        @JsonAnnotations2(names = {"event"})
        public static /* synthetic */ void getEvent$annotations() {
        }

        @SerialName("kaizenListRespected")
        @JsonAnnotations2(names = {"kaizen_list_respected"})
        public static /* synthetic */ void getKaizen_list_respected$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("requestType")
        @JsonAnnotations2(names = {"request_type"})
        public static /* synthetic */ void getRequest_type$annotations() {
        }

        @SerialName("results")
        @JsonAnnotations2(names = {"results"})
        public static /* synthetic */ void getResults$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        @SerialName("timestamp")
        @JsonAnnotations2(names = {"timestamp"})
        public static /* synthetic */ void getTimestamp$annotations() {
        }

        @SerialName("trigger")
        @JsonAnnotations2(names = {"trigger"})
        public static /* synthetic */ void getTrigger$annotations() {
        }

        @SerialName("userAgent")
        @JsonAnnotations2(names = {"user_agent"})
        public static /* synthetic */ void getUser_agent$annotations() {
        }

        @SerialName("variants")
        @JsonAnnotations2(names = {"variants"})
        public static /* synthetic */ void getVariants$annotations() {
        }

        @SerialName("version")
        @JsonAnnotations2(names = {"version"})
        public static /* synthetic */ void getVersion$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getUser_agent() {
            return this.user_agent;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getTrigger() {
            return this.trigger;
        }

        /* renamed from: component11, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component12, reason: from getter */
        public final String getEvent() {
            return this.event;
        }

        /* renamed from: component13, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component14, reason: from getter */
        public final String getApplication() {
            return this.application;
        }

        public final List<AssignmentResultDto> component2() {
            return this.results;
        }

        public final Map<String, String> component3() {
            return this.variants;
        }

        /* renamed from: component4, reason: from getter */
        public final String getRequest_type() {
            return this.request_type;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getKaizen_list_respected() {
            return this.kaizen_list_respected;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPlatform() {
            return this.platform;
        }

        /* renamed from: component7, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component8, reason: from getter */
        public final String getEntity_type() {
            return this.entity_type;
        }

        /* renamed from: component9, reason: from getter */
        public final String getEntity_id() {
            return this.entity_id;
        }

        public final Surrogate copy(String user_agent, List<AssignmentResultDto> results, Map<String, String> variants, String request_type, boolean kaizen_list_respected, String platform, String version, String entity_type, String entity_id, boolean trigger, String source, String event, String timestamp, String application) {
            Intrinsics.checkNotNullParameter(user_agent, "user_agent");
            Intrinsics.checkNotNullParameter(results, "results");
            Intrinsics.checkNotNullParameter(variants, "variants");
            Intrinsics.checkNotNullParameter(request_type, "request_type");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(entity_type, "entity_type");
            Intrinsics.checkNotNullParameter(entity_id, "entity_id");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            Intrinsics.checkNotNullParameter(application, "application");
            return new Surrogate(user_agent, results, variants, request_type, kaizen_list_respected, platform, version, entity_type, entity_id, trigger, source, event, timestamp, application);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.user_agent, surrogate.user_agent) && Intrinsics.areEqual(this.results, surrogate.results) && Intrinsics.areEqual(this.variants, surrogate.variants) && Intrinsics.areEqual(this.request_type, surrogate.request_type) && this.kaizen_list_respected == surrogate.kaizen_list_respected && Intrinsics.areEqual(this.platform, surrogate.platform) && Intrinsics.areEqual(this.version, surrogate.version) && Intrinsics.areEqual(this.entity_type, surrogate.entity_type) && Intrinsics.areEqual(this.entity_id, surrogate.entity_id) && this.trigger == surrogate.trigger && Intrinsics.areEqual(this.source, surrogate.source) && Intrinsics.areEqual(this.event, surrogate.event) && Intrinsics.areEqual(this.timestamp, surrogate.timestamp) && Intrinsics.areEqual(this.application, surrogate.application);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((this.user_agent.hashCode() * 31) + this.results.hashCode()) * 31) + this.variants.hashCode()) * 31) + this.request_type.hashCode()) * 31) + Boolean.hashCode(this.kaizen_list_respected)) * 31) + this.platform.hashCode()) * 31) + this.version.hashCode()) * 31) + this.entity_type.hashCode()) * 31) + this.entity_id.hashCode()) * 31) + Boolean.hashCode(this.trigger)) * 31) + this.source.hashCode()) * 31) + this.event.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + this.application.hashCode();
        }

        public String toString() {
            return "Surrogate(user_agent=" + this.user_agent + ", results=" + this.results + ", variants=" + this.variants + ", request_type=" + this.request_type + ", kaizen_list_respected=" + this.kaizen_list_respected + ", platform=" + this.platform + ", version=" + this.version + ", entity_type=" + this.entity_type + ", entity_id=" + this.entity_id + ", trigger=" + this.trigger + ", source=" + this.source + ", event=" + this.event + ", timestamp=" + this.timestamp + ", application=" + this.application + ")";
        }

        /* compiled from: AssignmentEventDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentEventDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentEventDto$Surrogate;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AssignmentEventDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.experiment_assignment.AssignmentEventDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssignmentEventDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.experiment_assignment.AssignmentEventDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssignmentEventDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null, null, null, null, null, null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, String str, List list, Map map, String str2, boolean z, String str3, String str4, String str5, String str6, boolean z2, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.user_agent = "";
            } else {
                this.user_agent = str;
            }
            if ((i & 2) == 0) {
                this.results = CollectionsKt.emptyList();
            } else {
                this.results = list;
            }
            if ((i & 4) == 0) {
                this.variants = MapsKt.emptyMap();
            } else {
                this.variants = map;
            }
            if ((i & 8) == 0) {
                this.request_type = "";
            } else {
                this.request_type = str2;
            }
            if ((i & 16) == 0) {
                this.kaizen_list_respected = false;
            } else {
                this.kaizen_list_respected = z;
            }
            if ((i & 32) == 0) {
                this.platform = "";
            } else {
                this.platform = str3;
            }
            if ((i & 64) == 0) {
                this.version = "";
            } else {
                this.version = str4;
            }
            if ((i & 128) == 0) {
                this.entity_type = "";
            } else {
                this.entity_type = str5;
            }
            if ((i & 256) == 0) {
                this.entity_id = "";
            } else {
                this.entity_id = str6;
            }
            if ((i & 512) == 0) {
                this.trigger = false;
            } else {
                this.trigger = z2;
            }
            if ((i & 1024) == 0) {
                this.source = "";
            } else {
                this.source = str7;
            }
            if ((i & 2048) == 0) {
                this.event = "";
            } else {
                this.event = str8;
            }
            if ((i & 4096) == 0) {
                this.timestamp = "";
            } else {
                this.timestamp = str9;
            }
            if ((i & 8192) == 0) {
                this.application = "";
            } else {
                this.application = str10;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$experiment_assignment_service_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.user_agent, "")) {
                output.encodeStringElement(serialDesc, 0, self.user_agent);
            }
            if (!Intrinsics.areEqual(self.results, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.results);
            }
            if (!Intrinsics.areEqual(self.variants, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.variants);
            }
            if (!Intrinsics.areEqual(self.request_type, "")) {
                output.encodeStringElement(serialDesc, 3, self.request_type);
            }
            boolean z = self.kaizen_list_respected;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
            if (!Intrinsics.areEqual(self.platform, "")) {
                output.encodeStringElement(serialDesc, 5, self.platform);
            }
            if (!Intrinsics.areEqual(self.version, "")) {
                output.encodeStringElement(serialDesc, 6, self.version);
            }
            if (!Intrinsics.areEqual(self.entity_type, "")) {
                output.encodeStringElement(serialDesc, 7, self.entity_type);
            }
            if (!Intrinsics.areEqual(self.entity_id, "")) {
                output.encodeStringElement(serialDesc, 8, self.entity_id);
            }
            boolean z2 = self.trigger;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 9, z2);
            }
            if (!Intrinsics.areEqual(self.source, "")) {
                output.encodeStringElement(serialDesc, 10, self.source);
            }
            if (!Intrinsics.areEqual(self.event, "")) {
                output.encodeStringElement(serialDesc, 11, self.event);
            }
            if (!Intrinsics.areEqual(self.timestamp, "")) {
                output.encodeStringElement(serialDesc, 12, self.timestamp);
            }
            if (Intrinsics.areEqual(self.application, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 13, self.application);
        }

        public Surrogate(String user_agent, List<AssignmentResultDto> results, Map<String, String> variants, String request_type, boolean z, String platform, String version, String entity_type, String entity_id, boolean z2, String source, String event, String timestamp, String application) {
            Intrinsics.checkNotNullParameter(user_agent, "user_agent");
            Intrinsics.checkNotNullParameter(results, "results");
            Intrinsics.checkNotNullParameter(variants, "variants");
            Intrinsics.checkNotNullParameter(request_type, "request_type");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(entity_type, "entity_type");
            Intrinsics.checkNotNullParameter(entity_id, "entity_id");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            Intrinsics.checkNotNullParameter(application, "application");
            this.user_agent = user_agent;
            this.results = results;
            this.variants = variants;
            this.request_type = request_type;
            this.kaizen_list_respected = z;
            this.platform = platform;
            this.version = version;
            this.entity_type = entity_type;
            this.entity_id = entity_id;
            this.trigger = z2;
            this.source = source;
            this.event = event;
            this.timestamp = timestamp;
            this.application = application;
        }

        public /* synthetic */ Surrogate(String str, List list, Map map, String str2, boolean z, String str3, String str4, String str5, String str6, boolean z2, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) == 0 ? z2 : false, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? "" : str9, (i & 8192) != 0 ? "" : str10);
        }

        public final String getUser_agent() {
            return this.user_agent;
        }

        public final List<AssignmentResultDto> getResults() {
            return this.results;
        }

        public final Map<String, String> getVariants() {
            return this.variants;
        }

        public final String getRequest_type() {
            return this.request_type;
        }

        public final boolean getKaizen_list_respected() {
            return this.kaizen_list_respected;
        }

        public final String getPlatform() {
            return this.platform;
        }

        public final String getVersion() {
            return this.version;
        }

        public final String getEntity_type() {
            return this.entity_type;
        }

        public final String getEntity_id() {
            return this.entity_id;
        }

        public final boolean getTrigger() {
            return this.trigger;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getEvent() {
            return this.event;
        }

        public final String getTimestamp() {
            return this.timestamp;
        }

        public final String getApplication() {
            return this.application;
        }
    }

    /* compiled from: AssignmentEventDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentEventDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentEventDto;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentEvent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentEventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AssignmentEventDto, AssignmentEvent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AssignmentEventDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssignmentEventDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssignmentEventDto> getBinaryBase64Serializer() {
            return (KSerializer) AssignmentEventDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AssignmentEvent> getProtoAdapter() {
            return AssignmentEvent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssignmentEventDto getZeroValue() {
            return AssignmentEventDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssignmentEventDto fromProto(AssignmentEvent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String user_agent = proto.getUser_agent();
            List<AssignmentResult> results = proto.getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator<T> it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(AssignmentResultDto.INSTANCE.fromProto((AssignmentResult) it.next()));
            }
            Set<Map.Entry<String, String>> setEntrySet = proto.getVariants().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            return new AssignmentEventDto(new Surrogate(user_agent, arrayList, linkedHashMap, proto.getRequest_type(), proto.getKaizen_list_respected(), proto.getPlatform(), proto.getVersion(), proto.getEntity_type(), proto.getEntity_id(), proto.getTrigger(), proto.getSource(), proto.getEvent(), proto.getTimestamp(), proto.getApplication()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.experiment_assignment.AssignmentEventDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssignmentEventDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new AssignmentEventDto(null, null, null, null, false, null, null, null, null, false, null, null, null, null, 16383, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AssignmentEventDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentEventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentEventDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentEventDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AssignmentEventDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.experiment_assignment.service.AssignmentEvent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AssignmentEventDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AssignmentEventDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AssignmentEventDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AssignmentEventDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentEventDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.experiment_assignment.AssignmentEventDto";
        }
    }
}
