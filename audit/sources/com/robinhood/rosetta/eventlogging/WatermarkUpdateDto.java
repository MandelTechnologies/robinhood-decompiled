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
import com.robinhood.rosetta.eventlogging.WatermarkUpdateDto;
import com.squareup.wire.ProtoAdapter;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;

/* compiled from: WatermarkUpdateDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BM\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0006\u0010\u0010JQ\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0016R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010)R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000e8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/WatermarkUpdate;", "Landroid/os/Parcelable;", "Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateDto$Surrogate;)V", "", "table_name", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "watermark_utc", "published_at_utc", "", "publisher_metadata", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/Map;)V", "copy", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/Map;)Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateDto;", "toProto", "()Lcom/robinhood/rosetta/eventlogging/WatermarkUpdate;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateDto$Surrogate;", "getTable_name", "getWatermark_utc", "()Lj$/time/Instant;", "getPublished_at_utc", "getPublisher_metadata", "()Ljava/util/Map;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class WatermarkUpdateDto implements Dto3<WatermarkUpdate>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<WatermarkUpdateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<WatermarkUpdateDto, WatermarkUpdate>> binaryBase64Serializer$delegate;
    private static final WatermarkUpdateDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ WatermarkUpdateDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private WatermarkUpdateDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTable_name() {
        return this.surrogate.getTable_name();
    }

    public final Instant getWatermark_utc() {
        return this.surrogate.getWatermark_utc();
    }

    public final Instant getPublished_at_utc() {
        return this.surrogate.getPublished_at_utc();
    }

    public final Map<String, String> getPublisher_metadata() {
        return this.surrogate.getPublisher_metadata();
    }

    public /* synthetic */ WatermarkUpdateDto(String str, Instant instant, Instant instant2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WatermarkUpdateDto(String table_name, Instant instant, Instant instant2, Map<String, String> publisher_metadata) {
        this(new Surrogate(table_name, instant, instant2, publisher_metadata));
        Intrinsics.checkNotNullParameter(table_name, "table_name");
        Intrinsics.checkNotNullParameter(publisher_metadata, "publisher_metadata");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WatermarkUpdateDto copy$default(WatermarkUpdateDto watermarkUpdateDto, String str, Instant instant, Instant instant2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = watermarkUpdateDto.surrogate.getTable_name();
        }
        if ((i & 2) != 0) {
            instant = watermarkUpdateDto.surrogate.getWatermark_utc();
        }
        if ((i & 4) != 0) {
            instant2 = watermarkUpdateDto.surrogate.getPublished_at_utc();
        }
        if ((i & 8) != 0) {
            map = watermarkUpdateDto.surrogate.getPublisher_metadata();
        }
        return watermarkUpdateDto.copy(str, instant, instant2, map);
    }

    public final WatermarkUpdateDto copy(String table_name, Instant watermark_utc, Instant published_at_utc, Map<String, String> publisher_metadata) {
        Intrinsics.checkNotNullParameter(table_name, "table_name");
        Intrinsics.checkNotNullParameter(publisher_metadata, "publisher_metadata");
        return new WatermarkUpdateDto(new Surrogate(table_name, watermark_utc, published_at_utc, publisher_metadata));
    }

    @Override // com.robinhood.idl.Dto
    public WatermarkUpdate toProto() {
        String table_name = this.surrogate.getTable_name();
        Instant watermark_utc = this.surrogate.getWatermark_utc();
        Instant published_at_utc = this.surrogate.getPublished_at_utc();
        Set<Map.Entry<String, String>> setEntrySet = this.surrogate.getPublisher_metadata().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return new WatermarkUpdate(table_name, watermark_utc, published_at_utc, linkedHashMap, null, 16, null);
    }

    public String toString() {
        return "[WatermarkUpdateDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof WatermarkUpdateDto) && Intrinsics.areEqual(((WatermarkUpdateDto) other).surrogate, this.surrogate);
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
    /* compiled from: WatermarkUpdateDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 92\u00020\u0001:\u0002:9B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBO\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J6\u0010!\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b!\u0010 J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0090\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2.\b\u0002\u0010\n\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000bHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001eRF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010 RF\u0010\n\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b5\u00100\u001a\u0004\b4\u0010 R,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00106\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010#¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateDto$Surrogate;", "", "", "table_name", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "watermark_utc", "published_at_utc", "", "publisher_metadata", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$data_platform_event_logging_externalRelease", "(Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lj$/time/Instant;", "component3", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/Map;)Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTable_name", "getTable_name$annotations", "()V", "Lj$/time/Instant;", "getWatermark_utc", "getWatermark_utc$annotations", "getPublished_at_utc", "getPublished_at_utc$annotations", "Ljava/util/Map;", "getPublisher_metadata", "getPublisher_metadata$annotations", "Companion", "$serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final Instant published_at_utc;
        private final Map<String, String> publisher_metadata;
        private final String table_name;
        private final Instant watermark_utc;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.eventlogging.WatermarkUpdateDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WatermarkUpdateDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (Instant) null, (Instant) null, (Map) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, Instant instant, Instant instant2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.table_name;
            }
            if ((i & 2) != 0) {
                instant = surrogate.watermark_utc;
            }
            if ((i & 4) != 0) {
                instant2 = surrogate.published_at_utc;
            }
            if ((i & 8) != 0) {
                map = surrogate.publisher_metadata;
            }
            return surrogate.copy(str, instant, instant2, map);
        }

        @SerialName("publishedAtUtc")
        @JsonAnnotations2(names = {"published_at_utc"})
        public static /* synthetic */ void getPublished_at_utc$annotations() {
        }

        @SerialName("publisherMetadata")
        @JsonAnnotations2(names = {"publisher_metadata"})
        public static /* synthetic */ void getPublisher_metadata$annotations() {
        }

        @SerialName("tableName")
        @JsonAnnotations2(names = {"table_name"})
        public static /* synthetic */ void getTable_name$annotations() {
        }

        @SerialName("watermarkUtc")
        @JsonAnnotations2(names = {"watermark_utc"})
        public static /* synthetic */ void getWatermark_utc$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTable_name() {
            return this.table_name;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getWatermark_utc() {
            return this.watermark_utc;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getPublished_at_utc() {
            return this.published_at_utc;
        }

        public final Map<String, String> component4() {
            return this.publisher_metadata;
        }

        public final Surrogate copy(String table_name, Instant watermark_utc, Instant published_at_utc, Map<String, String> publisher_metadata) {
            Intrinsics.checkNotNullParameter(table_name, "table_name");
            Intrinsics.checkNotNullParameter(publisher_metadata, "publisher_metadata");
            return new Surrogate(table_name, watermark_utc, published_at_utc, publisher_metadata);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.table_name, surrogate.table_name) && Intrinsics.areEqual(this.watermark_utc, surrogate.watermark_utc) && Intrinsics.areEqual(this.published_at_utc, surrogate.published_at_utc) && Intrinsics.areEqual(this.publisher_metadata, surrogate.publisher_metadata);
        }

        public int hashCode() {
            int iHashCode = this.table_name.hashCode() * 31;
            Instant instant = this.watermark_utc;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.published_at_utc;
            return ((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.publisher_metadata.hashCode();
        }

        public String toString() {
            return "Surrogate(table_name=" + this.table_name + ", watermark_utc=" + this.watermark_utc + ", published_at_utc=" + this.published_at_utc + ", publisher_metadata=" + this.publisher_metadata + ")";
        }

        /* compiled from: WatermarkUpdateDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return WatermarkUpdateDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, Instant instant, Instant instant2, Map map, SerializationConstructorMarker serializationConstructorMarker) {
            this.table_name = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.watermark_utc = null;
            } else {
                this.watermark_utc = instant;
            }
            if ((i & 4) == 0) {
                this.published_at_utc = null;
            } else {
                this.published_at_utc = instant2;
            }
            if ((i & 8) == 0) {
                this.publisher_metadata = MapsKt.emptyMap();
            } else {
                this.publisher_metadata = map;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.table_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.table_name);
            }
            Instant instant = self.watermark_utc;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.published_at_utc;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant2);
            }
            if (Intrinsics.areEqual(self.publisher_metadata, MapsKt.emptyMap())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.publisher_metadata);
        }

        public Surrogate(String table_name, Instant instant, Instant instant2, Map<String, String> publisher_metadata) {
            Intrinsics.checkNotNullParameter(table_name, "table_name");
            Intrinsics.checkNotNullParameter(publisher_metadata, "publisher_metadata");
            this.table_name = table_name;
            this.watermark_utc = instant;
            this.published_at_utc = instant2;
            this.publisher_metadata = publisher_metadata;
        }

        public final String getTable_name() {
            return this.table_name;
        }

        public /* synthetic */ Surrogate(String str, Instant instant, Instant instant2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? MapsKt.emptyMap() : map);
        }

        public final Instant getWatermark_utc() {
            return this.watermark_utc;
        }

        public final Instant getPublished_at_utc() {
            return this.published_at_utc;
        }

        public final Map<String, String> getPublisher_metadata() {
            return this.publisher_metadata;
        }
    }

    /* compiled from: WatermarkUpdateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateDto;", "Lcom/robinhood/rosetta/eventlogging/WatermarkUpdate;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<WatermarkUpdateDto, WatermarkUpdate> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WatermarkUpdateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WatermarkUpdateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WatermarkUpdateDto> getBinaryBase64Serializer() {
            return (KSerializer) WatermarkUpdateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<WatermarkUpdate> getProtoAdapter() {
            return WatermarkUpdate.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WatermarkUpdateDto getZeroValue() {
            return WatermarkUpdateDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WatermarkUpdateDto fromProto(WatermarkUpdate proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String table_name = proto.getTable_name();
            Instant watermark_utc = proto.getWatermark_utc();
            Instant published_at_utc = proto.getPublished_at_utc();
            Set<Map.Entry<String, String>> setEntrySet = proto.getPublisher_metadata().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            return new WatermarkUpdateDto(new Surrogate(table_name, watermark_utc, published_at_utc, linkedHashMap), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.WatermarkUpdateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WatermarkUpdateDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new WatermarkUpdateDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: WatermarkUpdateDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<WatermarkUpdateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.WatermarkUpdate", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, WatermarkUpdateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public WatermarkUpdateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new WatermarkUpdateDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: WatermarkUpdateDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/WatermarkUpdateDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.WatermarkUpdateDto";
        }
    }
}
