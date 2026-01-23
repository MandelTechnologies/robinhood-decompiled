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

/* compiled from: OptionStrategyContextDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0011JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionStrategyContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/OptionStrategyContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/OptionStrategyContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OptionStrategyContextDto$Surrogate;)V", "is_watching", "", "has_position", "num_legs", "", "is_leg_context", "aggregate_option_position_id", "", "option_position_id", "(ZZJZLjava/lang/String;Ljava/lang/String;)V", "()Z", "getHas_position", "getNum_legs", "()J", "getAggregate_option_position_id", "()Ljava/lang/String;", "getOption_position_id", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class OptionStrategyContextDto implements Dto3<OptionStrategyContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OptionStrategyContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OptionStrategyContextDto, OptionStrategyContext>> binaryBase64Serializer$delegate;
    private static final OptionStrategyContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OptionStrategyContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OptionStrategyContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final boolean is_watching() {
        return this.surrogate.is_watching();
    }

    public final boolean getHas_position() {
        return this.surrogate.getHas_position();
    }

    public final long getNum_legs() {
        return this.surrogate.getNum_legs();
    }

    public final boolean is_leg_context() {
        return this.surrogate.is_leg_context();
    }

    public final String getAggregate_option_position_id() {
        return this.surrogate.getAggregate_option_position_id();
    }

    public final String getOption_position_id() {
        return this.surrogate.getOption_position_id();
    }

    public /* synthetic */ OptionStrategyContextDto(boolean z, boolean z2, long j, boolean z3, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionStrategyContextDto(boolean z, boolean z2, long j, boolean z3, String aggregate_option_position_id, String option_position_id) {
        this(new Surrogate(z, z2, j, z3, aggregate_option_position_id, option_position_id));
        Intrinsics.checkNotNullParameter(aggregate_option_position_id, "aggregate_option_position_id");
        Intrinsics.checkNotNullParameter(option_position_id, "option_position_id");
    }

    public static /* synthetic */ OptionStrategyContextDto copy$default(OptionStrategyContextDto optionStrategyContextDto, boolean z, boolean z2, long j, boolean z3, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = optionStrategyContextDto.surrogate.is_watching();
        }
        if ((i & 2) != 0) {
            z2 = optionStrategyContextDto.surrogate.getHas_position();
        }
        if ((i & 4) != 0) {
            j = optionStrategyContextDto.surrogate.getNum_legs();
        }
        if ((i & 8) != 0) {
            z3 = optionStrategyContextDto.surrogate.is_leg_context();
        }
        if ((i & 16) != 0) {
            str = optionStrategyContextDto.surrogate.getAggregate_option_position_id();
        }
        if ((i & 32) != 0) {
            str2 = optionStrategyContextDto.surrogate.getOption_position_id();
        }
        String str3 = str2;
        boolean z4 = z3;
        long j2 = j;
        return optionStrategyContextDto.copy(z, z2, j2, z4, str, str3);
    }

    public final OptionStrategyContextDto copy(boolean is_watching, boolean has_position, long num_legs, boolean is_leg_context, String aggregate_option_position_id, String option_position_id) {
        Intrinsics.checkNotNullParameter(aggregate_option_position_id, "aggregate_option_position_id");
        Intrinsics.checkNotNullParameter(option_position_id, "option_position_id");
        return new OptionStrategyContextDto(new Surrogate(is_watching, has_position, num_legs, is_leg_context, aggregate_option_position_id, option_position_id));
    }

    @Override // com.robinhood.idl.Dto
    public OptionStrategyContext toProto() {
        return new OptionStrategyContext(this.surrogate.is_watching(), this.surrogate.getHas_position(), this.surrogate.getNum_legs(), this.surrogate.is_leg_context(), this.surrogate.getAggregate_option_position_id(), this.surrogate.getOption_position_id(), null, 64, null);
    }

    public String toString() {
        return "[OptionStrategyContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OptionStrategyContextDto) && Intrinsics.areEqual(((OptionStrategyContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: OptionStrategyContextDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000267BR\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBO\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0018\u0010%\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003JT\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0011HÖ\u0001J\t\u0010-\u001a\u00020\fHÖ\u0001J%\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0002\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R+\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0016\u001a\u0004\b\n\u0010\u0017R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010 ¨\u00068"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionStrategyContextDto$Surrogate;", "", "is_watching", "", "has_position", "num_legs", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "is_leg_context", "aggregate_option_position_id", "", "option_position_id", "<init>", "(ZZJZLjava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZJZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "is_watching$annotations", "()V", "()Z", "getHas_position$annotations", "getHas_position", "getNum_legs$annotations", "getNum_legs", "()J", "is_leg_context$annotations", "getAggregate_option_position_id$annotations", "getAggregate_option_position_id", "()Ljava/lang/String;", "getOption_position_id$annotations", "getOption_position_id", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String aggregate_option_position_id;
        private final boolean has_position;
        private final boolean is_leg_context;
        private final boolean is_watching;
        private final long num_legs;
        private final String option_position_id;

        public Surrogate() {
            this(false, false, 0L, false, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, boolean z, boolean z2, long j, boolean z3, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = surrogate.is_watching;
            }
            if ((i & 2) != 0) {
                z2 = surrogate.has_position;
            }
            if ((i & 4) != 0) {
                j = surrogate.num_legs;
            }
            if ((i & 8) != 0) {
                z3 = surrogate.is_leg_context;
            }
            if ((i & 16) != 0) {
                str = surrogate.aggregate_option_position_id;
            }
            if ((i & 32) != 0) {
                str2 = surrogate.option_position_id;
            }
            String str3 = str2;
            boolean z4 = z3;
            long j2 = j;
            return surrogate.copy(z, z2, j2, z4, str, str3);
        }

        @SerialName("aggregateOptionPositionId")
        @JsonAnnotations2(names = {"aggregate_option_position_id"})
        public static /* synthetic */ void getAggregate_option_position_id$annotations() {
        }

        @SerialName("hasPosition")
        @JsonAnnotations2(names = {"has_position"})
        public static /* synthetic */ void getHas_position$annotations() {
        }

        @SerialName("numLegs")
        @JsonAnnotations2(names = {"num_legs"})
        public static /* synthetic */ void getNum_legs$annotations() {
        }

        @SerialName("optionPositionId")
        @JsonAnnotations2(names = {"option_position_id"})
        public static /* synthetic */ void getOption_position_id$annotations() {
        }

        @SerialName("isLegContext")
        @JsonAnnotations2(names = {"is_leg_context"})
        public static /* synthetic */ void is_leg_context$annotations() {
        }

        @SerialName("isWatching")
        @JsonAnnotations2(names = {"is_watching"})
        public static /* synthetic */ void is_watching$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIs_watching() {
            return this.is_watching;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHas_position() {
            return this.has_position;
        }

        /* renamed from: component3, reason: from getter */
        public final long getNum_legs() {
            return this.num_legs;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIs_leg_context() {
            return this.is_leg_context;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAggregate_option_position_id() {
            return this.aggregate_option_position_id;
        }

        /* renamed from: component6, reason: from getter */
        public final String getOption_position_id() {
            return this.option_position_id;
        }

        public final Surrogate copy(boolean is_watching, boolean has_position, long num_legs, boolean is_leg_context, String aggregate_option_position_id, String option_position_id) {
            Intrinsics.checkNotNullParameter(aggregate_option_position_id, "aggregate_option_position_id");
            Intrinsics.checkNotNullParameter(option_position_id, "option_position_id");
            return new Surrogate(is_watching, has_position, num_legs, is_leg_context, aggregate_option_position_id, option_position_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.is_watching == surrogate.is_watching && this.has_position == surrogate.has_position && this.num_legs == surrogate.num_legs && this.is_leg_context == surrogate.is_leg_context && Intrinsics.areEqual(this.aggregate_option_position_id, surrogate.aggregate_option_position_id) && Intrinsics.areEqual(this.option_position_id, surrogate.option_position_id);
        }

        public int hashCode() {
            return (((((((((java.lang.Boolean.hashCode(this.is_watching) * 31) + java.lang.Boolean.hashCode(this.has_position)) * 31) + Long.hashCode(this.num_legs)) * 31) + java.lang.Boolean.hashCode(this.is_leg_context)) * 31) + this.aggregate_option_position_id.hashCode()) * 31) + this.option_position_id.hashCode();
        }

        public String toString() {
            return "Surrogate(is_watching=" + this.is_watching + ", has_position=" + this.has_position + ", num_legs=" + this.num_legs + ", is_leg_context=" + this.is_leg_context + ", aggregate_option_position_id=" + this.aggregate_option_position_id + ", option_position_id=" + this.option_position_id + ")";
        }

        /* compiled from: OptionStrategyContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionStrategyContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionStrategyContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OptionStrategyContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, boolean z2, long j, boolean z3, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.is_watching = false;
            } else {
                this.is_watching = z;
            }
            if ((i & 2) == 0) {
                this.has_position = false;
            } else {
                this.has_position = z2;
            }
            if ((i & 4) == 0) {
                this.num_legs = 0L;
            } else {
                this.num_legs = j;
            }
            if ((i & 8) == 0) {
                this.is_leg_context = false;
            } else {
                this.is_leg_context = z3;
            }
            if ((i & 16) == 0) {
                this.aggregate_option_position_id = "";
            } else {
                this.aggregate_option_position_id = str;
            }
            if ((i & 32) == 0) {
                this.option_position_id = "";
            } else {
                this.option_position_id = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            boolean z = self.is_watching;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            boolean z2 = self.has_position;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 1, z2);
            }
            long j = self.num_legs;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            boolean z3 = self.is_leg_context;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 3, z3);
            }
            if (!Intrinsics.areEqual(self.aggregate_option_position_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.aggregate_option_position_id);
            }
            if (Intrinsics.areEqual(self.option_position_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.option_position_id);
        }

        public Surrogate(boolean z, boolean z2, long j, boolean z3, String aggregate_option_position_id, String option_position_id) {
            Intrinsics.checkNotNullParameter(aggregate_option_position_id, "aggregate_option_position_id");
            Intrinsics.checkNotNullParameter(option_position_id, "option_position_id");
            this.is_watching = z;
            this.has_position = z2;
            this.num_legs = j;
            this.is_leg_context = z3;
            this.aggregate_option_position_id = aggregate_option_position_id;
            this.option_position_id = option_position_id;
        }

        public /* synthetic */ Surrogate(boolean z, boolean z2, long j, boolean z3, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? "" : str2);
        }

        public final boolean is_watching() {
            return this.is_watching;
        }

        public final boolean getHas_position() {
            return this.has_position;
        }

        public final long getNum_legs() {
            return this.num_legs;
        }

        public final boolean is_leg_context() {
            return this.is_leg_context;
        }

        public final String getAggregate_option_position_id() {
            return this.aggregate_option_position_id;
        }

        public final String getOption_position_id() {
            return this.option_position_id;
        }
    }

    /* compiled from: OptionStrategyContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionStrategyContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OptionStrategyContextDto;", "Lcom/robinhood/rosetta/eventlogging/OptionStrategyContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OptionStrategyContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<OptionStrategyContextDto, OptionStrategyContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OptionStrategyContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionStrategyContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionStrategyContextDto> getBinaryBase64Serializer() {
            return (KSerializer) OptionStrategyContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OptionStrategyContext> getProtoAdapter() {
            return OptionStrategyContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionStrategyContextDto getZeroValue() {
            return OptionStrategyContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionStrategyContextDto fromProto(OptionStrategyContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new OptionStrategyContextDto(new Surrogate(proto.getIs_watching(), proto.getHas_position(), proto.getNum_legs(), proto.getIs_leg_context(), proto.getAggregate_option_position_id(), proto.getOption_position_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OptionStrategyContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionStrategyContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OptionStrategyContextDto(false, false, 0L, false, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OptionStrategyContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionStrategyContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionStrategyContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/OptionStrategyContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<OptionStrategyContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.OptionStrategyContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OptionStrategyContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OptionStrategyContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OptionStrategyContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OptionStrategyContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionStrategyContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.OptionStrategyContextDto";
        }
    }
}
