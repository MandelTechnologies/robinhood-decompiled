package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.mainst.InternalHaltDetailsDto;
import com.robinhood.rosetta.mainst.TimeDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlinx.serialization.json.JsonAnnotations2;
import org.bouncycastle.i18n.ErrorBundle;
import rosetta.order.MarketHours;
import rosetta.order.MarketHoursDto;

/* compiled from: InternalHaltDetailsDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+,-.B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0012JL\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\tJ\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\tH\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020$H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014¨\u0006/"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/InternalHaltDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto$Surrogate;)V", "reason", "", ErrorBundle.DETAIL_ENTRY, "sessions", "", "Lrosetta/order/MarketHoursDto;", "start_time", "Lcom/robinhood/rosetta/mainst/TimeDto;", "end_time", "source", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "getDetails", "getSessions", "()Ljava/util/List;", "getStart_time", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getEnd_time", "getSource", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class InternalHaltDetailsDto implements Dto3<InternalHaltDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InternalHaltDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InternalHaltDetailsDto, InternalHaltDetails>> binaryBase64Serializer$delegate;
    private static final InternalHaltDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InternalHaltDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InternalHaltDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getReason() {
        return this.surrogate.getReason();
    }

    public final String getDetails() {
        return this.surrogate.getDetails();
    }

    public final List<MarketHoursDto> getSessions() {
        return this.surrogate.getSessions();
    }

    public final TimeDto getStart_time() {
        return this.surrogate.getStart_time();
    }

    public final TimeDto getEnd_time() {
        return this.surrogate.getEnd_time();
    }

    public final String getSource() {
        return this.surrogate.getSource();
    }

    public /* synthetic */ InternalHaltDetailsDto(String str, String str2, List list, TimeDto timeDto, TimeDto timeDto2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : timeDto, (i & 16) != 0 ? null : timeDto2, (i & 32) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InternalHaltDetailsDto(String reason, String details, List<? extends MarketHoursDto> sessions, TimeDto timeDto, TimeDto timeDto2, String source) {
        this(new Surrogate(reason, details, sessions, timeDto, timeDto2, source));
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        Intrinsics.checkNotNullParameter(source, "source");
    }

    public static /* synthetic */ InternalHaltDetailsDto copy$default(InternalHaltDetailsDto internalHaltDetailsDto, String str, String str2, List list, TimeDto timeDto, TimeDto timeDto2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = internalHaltDetailsDto.surrogate.getReason();
        }
        if ((i & 2) != 0) {
            str2 = internalHaltDetailsDto.surrogate.getDetails();
        }
        if ((i & 4) != 0) {
            list = internalHaltDetailsDto.surrogate.getSessions();
        }
        if ((i & 8) != 0) {
            timeDto = internalHaltDetailsDto.surrogate.getStart_time();
        }
        if ((i & 16) != 0) {
            timeDto2 = internalHaltDetailsDto.surrogate.getEnd_time();
        }
        if ((i & 32) != 0) {
            str3 = internalHaltDetailsDto.surrogate.getSource();
        }
        TimeDto timeDto3 = timeDto2;
        String str4 = str3;
        return internalHaltDetailsDto.copy(str, str2, list, timeDto, timeDto3, str4);
    }

    public final InternalHaltDetailsDto copy(String reason, String details, List<? extends MarketHoursDto> sessions, TimeDto start_time, TimeDto end_time, String source) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        Intrinsics.checkNotNullParameter(source, "source");
        return new InternalHaltDetailsDto(new Surrogate(reason, details, sessions, start_time, end_time, source));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public InternalHaltDetails toProto() {
        String reason = this.surrogate.getReason();
        String details = this.surrogate.getDetails();
        List<MarketHoursDto> sessions = this.surrogate.getSessions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sessions, 10));
        Iterator<T> it = sessions.iterator();
        while (it.hasNext()) {
            arrayList.add((MarketHours) ((MarketHoursDto) it.next()).toProto());
        }
        TimeDto start_time = this.surrogate.getStart_time();
        Time proto = start_time != null ? start_time.toProto() : null;
        TimeDto end_time = this.surrogate.getEnd_time();
        return new InternalHaltDetails(reason, details, arrayList, proto, end_time != null ? end_time.toProto() : null, this.surrogate.getSource(), null, 64, null);
    }

    public String toString() {
        return "[InternalHaltDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InternalHaltDetailsDto) && Intrinsics.areEqual(((InternalHaltDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: InternalHaltDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000278BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003JO\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u000fHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J%\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0001¢\u0006\u0002\b6R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u001eR\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016¨\u00069"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto$Surrogate;", "", "reason", "", ErrorBundle.DETAIL_ENTRY, "sessions", "", "Lrosetta/order/MarketHoursDto;", "start_time", "Lcom/robinhood/rosetta/mainst/TimeDto;", "end_time", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getReason$annotations", "()V", "getReason", "()Ljava/lang/String;", "getDetails$annotations", "getDetails", "getSessions$annotations", "getSessions", "()Ljava/util/List;", "getStart_time$annotations", "getStart_time", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getEnd_time$annotations", "getEnd_time", "getSource$annotations", "getSource", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String details;
        private final TimeDto end_time;
        private final String reason;
        private final List<MarketHoursDto> sessions;
        private final String source;
        private final TimeDto start_time;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.mainst.InternalHaltDetailsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InternalHaltDetailsDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null};

        public Surrogate() {
            this((String) null, (String) null, (List) null, (TimeDto) null, (TimeDto) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(MarketHoursDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, List list, TimeDto timeDto, TimeDto timeDto2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.reason;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.details;
            }
            if ((i & 4) != 0) {
                list = surrogate.sessions;
            }
            if ((i & 8) != 0) {
                timeDto = surrogate.start_time;
            }
            if ((i & 16) != 0) {
                timeDto2 = surrogate.end_time;
            }
            if ((i & 32) != 0) {
                str3 = surrogate.source;
            }
            TimeDto timeDto3 = timeDto2;
            String str4 = str3;
            return surrogate.copy(str, str2, list, timeDto, timeDto3, str4);
        }

        @SerialName(ErrorBundle.DETAIL_ENTRY)
        @JsonAnnotations2(names = {ErrorBundle.DETAIL_ENTRY})
        public static /* synthetic */ void getDetails$annotations() {
        }

        @SerialName("endTime")
        @JsonAnnotations2(names = {"end_time"})
        public static /* synthetic */ void getEnd_time$annotations() {
        }

        @SerialName("reason")
        @JsonAnnotations2(names = {"reason"})
        public static /* synthetic */ void getReason$annotations() {
        }

        @SerialName("sessions")
        @JsonAnnotations2(names = {"sessions"})
        public static /* synthetic */ void getSessions$annotations() {
        }

        @SerialName("source")
        @JsonAnnotations2(names = {"source"})
        public static /* synthetic */ void getSource$annotations() {
        }

        @SerialName("startTime")
        @JsonAnnotations2(names = {"start_time"})
        public static /* synthetic */ void getStart_time$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public final List<MarketHoursDto> component3() {
            return this.sessions;
        }

        /* renamed from: component4, reason: from getter */
        public final TimeDto getStart_time() {
            return this.start_time;
        }

        /* renamed from: component5, reason: from getter */
        public final TimeDto getEnd_time() {
            return this.end_time;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Surrogate copy(String reason, String details, List<? extends MarketHoursDto> sessions, TimeDto start_time, TimeDto end_time, String source) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(sessions, "sessions");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Surrogate(reason, details, sessions, start_time, end_time, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.reason, surrogate.reason) && Intrinsics.areEqual(this.details, surrogate.details) && Intrinsics.areEqual(this.sessions, surrogate.sessions) && Intrinsics.areEqual(this.start_time, surrogate.start_time) && Intrinsics.areEqual(this.end_time, surrogate.end_time) && Intrinsics.areEqual(this.source, surrogate.source);
        }

        public int hashCode() {
            int iHashCode = ((((this.reason.hashCode() * 31) + this.details.hashCode()) * 31) + this.sessions.hashCode()) * 31;
            TimeDto timeDto = this.start_time;
            int iHashCode2 = (iHashCode + (timeDto == null ? 0 : timeDto.hashCode())) * 31;
            TimeDto timeDto2 = this.end_time;
            return ((iHashCode2 + (timeDto2 != null ? timeDto2.hashCode() : 0)) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Surrogate(reason=" + this.reason + ", details=" + this.details + ", sessions=" + this.sessions + ", start_time=" + this.start_time + ", end_time=" + this.end_time + ", source=" + this.source + ")";
        }

        /* compiled from: InternalHaltDetailsDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InternalHaltDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, List list, TimeDto timeDto, TimeDto timeDto2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.reason = "";
            } else {
                this.reason = str;
            }
            if ((i & 2) == 0) {
                this.details = "";
            } else {
                this.details = str2;
            }
            if ((i & 4) == 0) {
                this.sessions = CollectionsKt.emptyList();
            } else {
                this.sessions = list;
            }
            if ((i & 8) == 0) {
                this.start_time = null;
            } else {
                this.start_time = timeDto;
            }
            if ((i & 16) == 0) {
                this.end_time = null;
            } else {
                this.end_time = timeDto2;
            }
            if ((i & 32) == 0) {
                this.source = "";
            } else {
                this.source = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.reason, "")) {
                output.encodeStringElement(serialDesc, 0, self.reason);
            }
            if (!Intrinsics.areEqual(self.details, "")) {
                output.encodeStringElement(serialDesc, 1, self.details);
            }
            if (!Intrinsics.areEqual(self.sessions, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.sessions);
            }
            TimeDto timeDto = self.start_time;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TimeDto.Serializer.INSTANCE, timeDto);
            }
            TimeDto timeDto2 = self.end_time;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            if (Intrinsics.areEqual(self.source, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.source);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(String reason, String details, List<? extends MarketHoursDto> sessions, TimeDto timeDto, TimeDto timeDto2, String source) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(sessions, "sessions");
            Intrinsics.checkNotNullParameter(source, "source");
            this.reason = reason;
            this.details = details;
            this.sessions = sessions;
            this.start_time = timeDto;
            this.end_time = timeDto2;
            this.source = source;
        }

        public /* synthetic */ Surrogate(String str, String str2, List list, TimeDto timeDto, TimeDto timeDto2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : timeDto, (i & 16) != 0 ? null : timeDto2, (i & 32) != 0 ? "" : str3);
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getDetails() {
            return this.details;
        }

        public final List<MarketHoursDto> getSessions() {
            return this.sessions;
        }

        public final TimeDto getStart_time() {
            return this.start_time;
        }

        public final TimeDto getEnd_time() {
            return this.end_time;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: InternalHaltDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto;", "Lcom/robinhood/rosetta/mainst/InternalHaltDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InternalHaltDetailsDto, InternalHaltDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InternalHaltDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InternalHaltDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InternalHaltDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) InternalHaltDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InternalHaltDetails> getProtoAdapter() {
            return InternalHaltDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InternalHaltDetailsDto getZeroValue() {
            return InternalHaltDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InternalHaltDetailsDto fromProto(InternalHaltDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String reason = proto.getReason();
            String details = proto.getDetails();
            List<MarketHours> sessions = proto.getSessions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sessions, 10));
            Iterator<T> it = sessions.iterator();
            while (it.hasNext()) {
                arrayList.add(MarketHoursDto.INSTANCE.fromProto((MarketHours) it.next()));
            }
            Time start_time = proto.getStart_time();
            DefaultConstructorMarker defaultConstructorMarker = null;
            TimeDto timeDtoFromProto = start_time != null ? TimeDto.INSTANCE.fromProto(start_time) : null;
            Time end_time = proto.getEnd_time();
            return new InternalHaltDetailsDto(new Surrogate(reason, details, arrayList, timeDtoFromProto, end_time != null ? TimeDto.INSTANCE.fromProto(end_time) : null, proto.getSource()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.InternalHaltDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InternalHaltDetailsDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new InternalHaltDetailsDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InternalHaltDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<InternalHaltDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.InternalHaltDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InternalHaltDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InternalHaltDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InternalHaltDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InternalHaltDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InternalHaltDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.InternalHaltDetailsDto";
        }
    }
}
