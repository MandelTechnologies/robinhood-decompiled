package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedLongAsStringSerializer;
import com.robinhood.rosetta.eventlogging.BooleanDto;
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

/* compiled from: ResumeApplicationTakeoverContextDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u000fJ.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ResumeApplicationTakeoverContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ResumeApplicationTakeoverContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ResumeApplicationTakeoverContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ResumeApplicationTakeoverContextDto$Surrogate;)V", "ms_since_last_resurrection_seen", "", "seen_resurrection_count", "was_upsell_shown", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "upsell_identifier", "", "(JJLcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/lang/String;)V", "getMs_since_last_resurrection_seen", "()J", "getSeen_resurrection_count", "getWas_upsell_shown", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getUpsell_identifier", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ResumeApplicationTakeoverContextDto implements Dto3<ResumeApplicationTakeoverContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ResumeApplicationTakeoverContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ResumeApplicationTakeoverContextDto, ResumeApplicationTakeoverContext>> binaryBase64Serializer$delegate;
    private static final ResumeApplicationTakeoverContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ResumeApplicationTakeoverContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ResumeApplicationTakeoverContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final long getMs_since_last_resurrection_seen() {
        return this.surrogate.getMs_since_last_resurrection_seen();
    }

    public final long getSeen_resurrection_count() {
        return this.surrogate.getSeen_resurrection_count();
    }

    public final BooleanDto getWas_upsell_shown() {
        return this.surrogate.getWas_upsell_shown();
    }

    public final String getUpsell_identifier() {
        return this.surrogate.getUpsell_identifier();
    }

    public /* synthetic */ ResumeApplicationTakeoverContextDto(long j, long j2, BooleanDto booleanDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 8) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResumeApplicationTakeoverContextDto(long j, long j2, BooleanDto was_upsell_shown, String upsell_identifier) {
        this(new Surrogate(j, j2, was_upsell_shown, upsell_identifier));
        Intrinsics.checkNotNullParameter(was_upsell_shown, "was_upsell_shown");
        Intrinsics.checkNotNullParameter(upsell_identifier, "upsell_identifier");
    }

    public static /* synthetic */ ResumeApplicationTakeoverContextDto copy$default(ResumeApplicationTakeoverContextDto resumeApplicationTakeoverContextDto, long j, long j2, BooleanDto booleanDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = resumeApplicationTakeoverContextDto.surrogate.getMs_since_last_resurrection_seen();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = resumeApplicationTakeoverContextDto.surrogate.getSeen_resurrection_count();
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            booleanDto = resumeApplicationTakeoverContextDto.surrogate.getWas_upsell_shown();
        }
        BooleanDto booleanDto2 = booleanDto;
        if ((i & 8) != 0) {
            str = resumeApplicationTakeoverContextDto.surrogate.getUpsell_identifier();
        }
        return resumeApplicationTakeoverContextDto.copy(j3, j4, booleanDto2, str);
    }

    public final ResumeApplicationTakeoverContextDto copy(long ms_since_last_resurrection_seen, long seen_resurrection_count, BooleanDto was_upsell_shown, String upsell_identifier) {
        Intrinsics.checkNotNullParameter(was_upsell_shown, "was_upsell_shown");
        Intrinsics.checkNotNullParameter(upsell_identifier, "upsell_identifier");
        return new ResumeApplicationTakeoverContextDto(new Surrogate(ms_since_last_resurrection_seen, seen_resurrection_count, was_upsell_shown, upsell_identifier));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ResumeApplicationTakeoverContext toProto() {
        return new ResumeApplicationTakeoverContext(this.surrogate.getMs_since_last_resurrection_seen(), this.surrogate.getSeen_resurrection_count(), (Boolean) this.surrogate.getWas_upsell_shown().toProto(), this.surrogate.getUpsell_identifier(), null, 16, null);
    }

    public String toString() {
        return "[ResumeApplicationTakeoverContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ResumeApplicationTakeoverContextDto) && Intrinsics.areEqual(((ResumeApplicationTakeoverContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: ResumeApplicationTakeoverContextDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000212BM\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rB?\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\u0018\u0010\u001f\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010 \u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003JO\u0010#\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u000fHÖ\u0001J\t\u0010(\u001a\u00020\u000bHÖ\u0001J%\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\b0R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001e¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ResumeApplicationTakeoverContextDto$Surrogate;", "", "ms_since_last_resurrection_seen", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "seen_resurrection_count", "was_upsell_shown", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "upsell_identifier", "", "<init>", "(JJLcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJJLcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMs_since_last_resurrection_seen$annotations", "()V", "getMs_since_last_resurrection_seen", "()J", "getSeen_resurrection_count$annotations", "getSeen_resurrection_count", "getWas_upsell_shown$annotations", "getWas_upsell_shown", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getUpsell_identifier$annotations", "getUpsell_identifier", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long ms_since_last_resurrection_seen;
        private final long seen_resurrection_count;
        private final String upsell_identifier;
        private final BooleanDto was_upsell_shown;

        public Surrogate() {
            this(0L, 0L, (BooleanDto) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, long j, long j2, BooleanDto booleanDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                j = surrogate.ms_since_last_resurrection_seen;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = surrogate.seen_resurrection_count;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                booleanDto = surrogate.was_upsell_shown;
            }
            BooleanDto booleanDto2 = booleanDto;
            if ((i & 8) != 0) {
                str = surrogate.upsell_identifier;
            }
            return surrogate.copy(j3, j4, booleanDto2, str);
        }

        @SerialName("msSinceLastResurrectionSeen")
        @JsonAnnotations2(names = {"ms_since_last_resurrection_seen"})
        public static /* synthetic */ void getMs_since_last_resurrection_seen$annotations() {
        }

        @SerialName("seenResurrectionCount")
        @JsonAnnotations2(names = {"seen_resurrection_count"})
        public static /* synthetic */ void getSeen_resurrection_count$annotations() {
        }

        @SerialName("upsellIdentifier")
        @JsonAnnotations2(names = {"upsell_identifier"})
        public static /* synthetic */ void getUpsell_identifier$annotations() {
        }

        @SerialName("wasUpsellShown")
        @JsonAnnotations2(names = {"was_upsell_shown"})
        public static /* synthetic */ void getWas_upsell_shown$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final long getMs_since_last_resurrection_seen() {
            return this.ms_since_last_resurrection_seen;
        }

        /* renamed from: component2, reason: from getter */
        public final long getSeen_resurrection_count() {
            return this.seen_resurrection_count;
        }

        /* renamed from: component3, reason: from getter */
        public final BooleanDto getWas_upsell_shown() {
            return this.was_upsell_shown;
        }

        /* renamed from: component4, reason: from getter */
        public final String getUpsell_identifier() {
            return this.upsell_identifier;
        }

        public final Surrogate copy(long ms_since_last_resurrection_seen, long seen_resurrection_count, BooleanDto was_upsell_shown, String upsell_identifier) {
            Intrinsics.checkNotNullParameter(was_upsell_shown, "was_upsell_shown");
            Intrinsics.checkNotNullParameter(upsell_identifier, "upsell_identifier");
            return new Surrogate(ms_since_last_resurrection_seen, seen_resurrection_count, was_upsell_shown, upsell_identifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.ms_since_last_resurrection_seen == surrogate.ms_since_last_resurrection_seen && this.seen_resurrection_count == surrogate.seen_resurrection_count && this.was_upsell_shown == surrogate.was_upsell_shown && Intrinsics.areEqual(this.upsell_identifier, surrogate.upsell_identifier);
        }

        public int hashCode() {
            return (((((Long.hashCode(this.ms_since_last_resurrection_seen) * 31) + Long.hashCode(this.seen_resurrection_count)) * 31) + this.was_upsell_shown.hashCode()) * 31) + this.upsell_identifier.hashCode();
        }

        public String toString() {
            return "Surrogate(ms_since_last_resurrection_seen=" + this.ms_since_last_resurrection_seen + ", seen_resurrection_count=" + this.seen_resurrection_count + ", was_upsell_shown=" + this.was_upsell_shown + ", upsell_identifier=" + this.upsell_identifier + ")";
        }

        /* compiled from: ResumeApplicationTakeoverContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ResumeApplicationTakeoverContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ResumeApplicationTakeoverContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ResumeApplicationTakeoverContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, long j, long j2, BooleanDto booleanDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.ms_since_last_resurrection_seen = 0L;
            } else {
                this.ms_since_last_resurrection_seen = j;
            }
            if ((i & 2) == 0) {
                this.seen_resurrection_count = 0L;
            } else {
                this.seen_resurrection_count = j2;
            }
            if ((i & 4) == 0) {
                this.was_upsell_shown = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.was_upsell_shown = booleanDto;
            }
            if ((i & 8) == 0) {
                this.upsell_identifier = "";
            } else {
                this.upsell_identifier = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            long j = self.ms_since_last_resurrection_seen;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 0, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            long j2 = self.seen_resurrection_count;
            if (j2 != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j2));
            }
            if (self.was_upsell_shown != BooleanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, BooleanDto.Serializer.INSTANCE, self.was_upsell_shown);
            }
            if (Intrinsics.areEqual(self.upsell_identifier, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.upsell_identifier);
        }

        public Surrogate(long j, long j2, BooleanDto was_upsell_shown, String upsell_identifier) {
            Intrinsics.checkNotNullParameter(was_upsell_shown, "was_upsell_shown");
            Intrinsics.checkNotNullParameter(upsell_identifier, "upsell_identifier");
            this.ms_since_last_resurrection_seen = j;
            this.seen_resurrection_count = j2;
            this.was_upsell_shown = was_upsell_shown;
            this.upsell_identifier = upsell_identifier;
        }

        public final long getMs_since_last_resurrection_seen() {
            return this.ms_since_last_resurrection_seen;
        }

        public final long getSeen_resurrection_count() {
            return this.seen_resurrection_count;
        }

        public final BooleanDto getWas_upsell_shown() {
            return this.was_upsell_shown;
        }

        public /* synthetic */ Surrogate(long j, long j2, BooleanDto booleanDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 8) != 0 ? "" : str);
        }

        public final String getUpsell_identifier() {
            return this.upsell_identifier;
        }
    }

    /* compiled from: ResumeApplicationTakeoverContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ResumeApplicationTakeoverContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ResumeApplicationTakeoverContextDto;", "Lcom/robinhood/rosetta/eventlogging/ResumeApplicationTakeoverContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ResumeApplicationTakeoverContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ResumeApplicationTakeoverContextDto, ResumeApplicationTakeoverContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ResumeApplicationTakeoverContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ResumeApplicationTakeoverContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ResumeApplicationTakeoverContextDto> getBinaryBase64Serializer() {
            return (KSerializer) ResumeApplicationTakeoverContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ResumeApplicationTakeoverContext> getProtoAdapter() {
            return ResumeApplicationTakeoverContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ResumeApplicationTakeoverContextDto getZeroValue() {
            return ResumeApplicationTakeoverContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ResumeApplicationTakeoverContextDto fromProto(ResumeApplicationTakeoverContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ResumeApplicationTakeoverContextDto(new Surrogate(proto.getMs_since_last_resurrection_seen(), proto.getSeen_resurrection_count(), BooleanDto.INSTANCE.fromProto(proto.getWas_upsell_shown()), proto.getUpsell_identifier()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ResumeApplicationTakeoverContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ResumeApplicationTakeoverContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ResumeApplicationTakeoverContextDto(0L, 0L, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ResumeApplicationTakeoverContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ResumeApplicationTakeoverContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ResumeApplicationTakeoverContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ResumeApplicationTakeoverContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ResumeApplicationTakeoverContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ResumeApplicationTakeoverContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ResumeApplicationTakeoverContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ResumeApplicationTakeoverContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ResumeApplicationTakeoverContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ResumeApplicationTakeoverContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ResumeApplicationTakeoverContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ResumeApplicationTakeoverContextDto";
        }
    }
}
