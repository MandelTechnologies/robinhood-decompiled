package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.arsenal.proto.p281v1.idl.EventSeriesDto;
import com.robinhood.arsenal.proto.p281v1.idl.EventSeriesStateDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import p479j$.time.Instant;

/* compiled from: EventSeriesDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00044356B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BS\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0006\u0010\u0013JW\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0019R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0019R\u0019\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00118F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00067"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/EventSeries;", "Landroid/os/Parcelable;", "Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesDto$Surrogate;)V", "", "id", "name", "symbol", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "end_time", "Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesStateDto;", "state", "", "event_ids", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesStateDto;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesStateDto;Ljava/util/List;)Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesDto;", "toProto", "()Lcom/robinhood/arsenal/proto/v1/idl/EventSeries;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesDto$Surrogate;", "getId", "getName", "getSymbol", "getEnd_time", "()Lj$/time/Instant;", "getState", "()Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesStateDto;", "getEvent_ids", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class EventSeriesDto implements Dto3<EventSeries>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EventSeriesDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EventSeriesDto, EventSeries>> binaryBase64Serializer$delegate;
    private static final EventSeriesDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EventSeriesDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EventSeriesDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final Instant getEnd_time() {
        return this.surrogate.getEnd_time();
    }

    public final EventSeriesStateDto getState() {
        return this.surrogate.getState();
    }

    public final List<String> getEvent_ids() {
        return this.surrogate.getEvent_ids();
    }

    public /* synthetic */ EventSeriesDto(String str, String str2, String str3, Instant instant, EventSeriesStateDto eventSeriesStateDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? EventSeriesStateDto.INSTANCE.getZeroValue() : eventSeriesStateDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventSeriesDto(String id, String name, String symbol, Instant instant, EventSeriesStateDto state, List<String> event_ids) {
        this(new Surrogate(id, name, symbol, instant, state, event_ids));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(event_ids, "event_ids");
    }

    public static /* synthetic */ EventSeriesDto copy$default(EventSeriesDto eventSeriesDto, String str, String str2, String str3, Instant instant, EventSeriesStateDto eventSeriesStateDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventSeriesDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            str2 = eventSeriesDto.surrogate.getName();
        }
        if ((i & 4) != 0) {
            str3 = eventSeriesDto.surrogate.getSymbol();
        }
        if ((i & 8) != 0) {
            instant = eventSeriesDto.surrogate.getEnd_time();
        }
        if ((i & 16) != 0) {
            eventSeriesStateDto = eventSeriesDto.surrogate.getState();
        }
        if ((i & 32) != 0) {
            list = eventSeriesDto.surrogate.getEvent_ids();
        }
        EventSeriesStateDto eventSeriesStateDto2 = eventSeriesStateDto;
        List list2 = list;
        return eventSeriesDto.copy(str, str2, str3, instant, eventSeriesStateDto2, list2);
    }

    public final EventSeriesDto copy(String id, String name, String symbol, Instant end_time, EventSeriesStateDto state, List<String> event_ids) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(event_ids, "event_ids");
        return new EventSeriesDto(new Surrogate(id, name, symbol, end_time, state, event_ids));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EventSeries toProto() {
        String id = this.surrogate.getId();
        String name = this.surrogate.getName();
        String symbol = this.surrogate.getSymbol();
        Instant end_time = this.surrogate.getEnd_time();
        EventSeriesState eventSeriesState = (EventSeriesState) this.surrogate.getState().toProto();
        List<String> event_ids = this.surrogate.getEvent_ids();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(event_ids, 10));
        Iterator<T> it = event_ids.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new EventSeries(id, name, symbol, end_time, eventSeriesState, arrayList, null, 64, null);
    }

    public String toString() {
        return "[EventSeriesDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EventSeriesDto) && Intrinsics.areEqual(((EventSeriesDto) other).surrogate, this.surrogate);
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
    /* compiled from: EventSeriesDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002EDBo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B]\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J6\u0010$\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)Jx\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010!J\u0010\u0010-\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010!R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00103\u0012\u0004\b8\u00106\u001a\u0004\b7\u0010!R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00103\u0012\u0004\b:\u00106\u001a\u0004\b9\u0010!RF\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010;\u0012\u0004\b=\u00106\u001a\u0004\b<\u0010%R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\b@\u00106\u001a\u0004\b?\u0010'R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010A\u0012\u0004\bC\u00106\u001a\u0004\bB\u0010)¨\u0006F"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesDto$Surrogate;", "", "", "id", "name", "symbol", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "end_time", "Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesStateDto;", "state", "", "event_ids", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesStateDto;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesStateDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$arsenal_v1_public_externalRelease", "(Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lj$/time/Instant;", "component5", "()Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesStateDto;", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesStateDto;Ljava/util/List;)Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getName", "getName$annotations", "getSymbol", "getSymbol$annotations", "Lj$/time/Instant;", "getEnd_time", "getEnd_time$annotations", "Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesStateDto;", "getState", "getState$annotations", "Ljava/util/List;", "getEvent_ids", "getEvent_ids$annotations", "Companion", "$serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final Instant end_time;
        private final List<String> event_ids;
        private final String id;
        private final String name;
        private final EventSeriesStateDto state;
        private final String symbol;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.EventSeriesDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventSeriesDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (Instant) null, (EventSeriesStateDto) null, (List) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, Instant instant, EventSeriesStateDto eventSeriesStateDto, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.name;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.symbol;
            }
            if ((i & 8) != 0) {
                instant = surrogate.end_time;
            }
            if ((i & 16) != 0) {
                eventSeriesStateDto = surrogate.state;
            }
            if ((i & 32) != 0) {
                list = surrogate.event_ids;
            }
            EventSeriesStateDto eventSeriesStateDto2 = eventSeriesStateDto;
            List list2 = list;
            return surrogate.copy(str, str2, str3, instant, eventSeriesStateDto2, list2);
        }

        @SerialName("endTime")
        @JsonAnnotations2(names = {"end_time"})
        public static /* synthetic */ void getEnd_time$annotations() {
        }

        @SerialName("eventIds")
        @JsonAnnotations2(names = {"event_ids"})
        public static /* synthetic */ void getEvent_ids$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getEnd_time() {
            return this.end_time;
        }

        /* renamed from: component5, reason: from getter */
        public final EventSeriesStateDto getState() {
            return this.state;
        }

        public final List<String> component6() {
            return this.event_ids;
        }

        public final Surrogate copy(String id, String name, String symbol, Instant end_time, EventSeriesStateDto state, List<String> event_ids) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(event_ids, "event_ids");
            return new Surrogate(id, name, symbol, end_time, state, event_ids);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.end_time, surrogate.end_time) && this.state == surrogate.state && Intrinsics.areEqual(this.event_ids, surrogate.event_ids);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.symbol.hashCode()) * 31;
            Instant instant = this.end_time;
            return ((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.state.hashCode()) * 31) + this.event_ids.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", name=" + this.name + ", symbol=" + this.symbol + ", end_time=" + this.end_time + ", state=" + this.state + ", event_ids=" + this.event_ids + ")";
        }

        /* compiled from: EventSeriesDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EventSeriesDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, Instant instant, EventSeriesStateDto eventSeriesStateDto, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.name = "";
            } else {
                this.name = str2;
            }
            if ((i & 4) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str3;
            }
            if ((i & 8) == 0) {
                this.end_time = null;
            } else {
                this.end_time = instant;
            }
            if ((i & 16) == 0) {
                this.state = EventSeriesStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = eventSeriesStateDto;
            }
            if ((i & 32) == 0) {
                this.event_ids = CollectionsKt.emptyList();
            } else {
                this.event_ids = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 1, self.name);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 2, self.symbol);
            }
            Instant instant = self.end_time;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant);
            }
            if (self.state != EventSeriesStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, EventSeriesStateDto.Serializer.INSTANCE, self.state);
            }
            if (Intrinsics.areEqual(self.event_ids, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.event_ids);
        }

        public Surrogate(String id, String name, String symbol, Instant instant, EventSeriesStateDto state, List<String> event_ids) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(event_ids, "event_ids");
            this.id = id;
            this.name = name;
            this.symbol = symbol;
            this.end_time = instant;
            this.state = state;
            this.event_ids = event_ids;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, Instant instant, EventSeriesStateDto eventSeriesStateDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? EventSeriesStateDto.INSTANCE.getZeroValue() : eventSeriesStateDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final Instant getEnd_time() {
            return this.end_time;
        }

        public final EventSeriesStateDto getState() {
            return this.state;
        }

        public final List<String> getEvent_ids() {
            return this.event_ids;
        }
    }

    /* compiled from: EventSeriesDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesDto;", "Lcom/robinhood/arsenal/proto/v1/idl/EventSeries;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<EventSeriesDto, EventSeries> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EventSeriesDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventSeriesDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EventSeriesDto> getBinaryBase64Serializer() {
            return (KSerializer) EventSeriesDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EventSeries> getProtoAdapter() {
            return EventSeries.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventSeriesDto getZeroValue() {
            return EventSeriesDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EventSeriesDto fromProto(EventSeries proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String name = proto.getName();
            String symbol = proto.getSymbol();
            Instant end_time = proto.getEnd_time();
            EventSeriesStateDto eventSeriesStateDtoFromProto = EventSeriesStateDto.INSTANCE.fromProto(proto.getState());
            List<String> event_ids = proto.getEvent_ids();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(event_ids, 10));
            Iterator<T> it = event_ids.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new EventSeriesDto(new Surrogate(id, name, symbol, end_time, eventSeriesStateDtoFromProto, arrayList), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.EventSeriesDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EventSeriesDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new EventSeriesDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EventSeriesDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EventSeriesDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.EventSeries", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EventSeriesDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EventSeriesDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EventSeriesDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EventSeriesDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventSeriesDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.EventSeriesDto";
        }
    }
}
