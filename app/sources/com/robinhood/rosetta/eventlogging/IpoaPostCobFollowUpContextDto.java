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

/* compiled from: IpoaPostCobFollowUpContextDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u000fJ.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IpoaPostCobFollowUpContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/IpoaPostCobFollowUpContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/IpoaPostCobFollowUpContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/IpoaPostCobFollowUpContextDto$Surrogate;)V", "instrument_id", "", "expected_ipo_date", "projected_allocated_shares", "", "projected_allocated_percentage", "", "(Ljava/lang/String;Ljava/lang/String;JF)V", "getInstrument_id", "()Ljava/lang/String;", "getExpected_ipo_date", "getProjected_allocated_shares", "()J", "getProjected_allocated_percentage", "()F", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class IpoaPostCobFollowUpContextDto implements Dto3<IpoaPostCobFollowUpContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IpoaPostCobFollowUpContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IpoaPostCobFollowUpContextDto, IpoaPostCobFollowUpContext>> binaryBase64Serializer$delegate;
    private static final IpoaPostCobFollowUpContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IpoaPostCobFollowUpContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IpoaPostCobFollowUpContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final String getExpected_ipo_date() {
        return this.surrogate.getExpected_ipo_date();
    }

    public final long getProjected_allocated_shares() {
        return this.surrogate.getProjected_allocated_shares();
    }

    public final float getProjected_allocated_percentage() {
        return this.surrogate.getProjected_allocated_percentage();
    }

    public /* synthetic */ IpoaPostCobFollowUpContextDto(String str, String str2, long j, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0.0f : f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IpoaPostCobFollowUpContextDto(String instrument_id, String expected_ipo_date, long j, float f) {
        this(new Surrogate(instrument_id, expected_ipo_date, j, f));
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(expected_ipo_date, "expected_ipo_date");
    }

    public static /* synthetic */ IpoaPostCobFollowUpContextDto copy$default(IpoaPostCobFollowUpContextDto ipoaPostCobFollowUpContextDto, String str, String str2, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ipoaPostCobFollowUpContextDto.surrogate.getInstrument_id();
        }
        if ((i & 2) != 0) {
            str2 = ipoaPostCobFollowUpContextDto.surrogate.getExpected_ipo_date();
        }
        if ((i & 4) != 0) {
            j = ipoaPostCobFollowUpContextDto.surrogate.getProjected_allocated_shares();
        }
        if ((i & 8) != 0) {
            f = ipoaPostCobFollowUpContextDto.surrogate.getProjected_allocated_percentage();
        }
        float f2 = f;
        return ipoaPostCobFollowUpContextDto.copy(str, str2, j, f2);
    }

    public final IpoaPostCobFollowUpContextDto copy(String instrument_id, String expected_ipo_date, long projected_allocated_shares, float projected_allocated_percentage) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(expected_ipo_date, "expected_ipo_date");
        return new IpoaPostCobFollowUpContextDto(new Surrogate(instrument_id, expected_ipo_date, projected_allocated_shares, projected_allocated_percentage));
    }

    @Override // com.robinhood.idl.Dto
    public IpoaPostCobFollowUpContext toProto() {
        return new IpoaPostCobFollowUpContext(this.surrogate.getInstrument_id(), this.surrogate.getExpected_ipo_date(), this.surrogate.getProjected_allocated_shares(), this.surrogate.getProjected_allocated_percentage(), null, 16, null);
    }

    public String toString() {
        return "[IpoaPostCobFollowUpContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IpoaPostCobFollowUpContextDto) && Intrinsics.areEqual(((IpoaPostCobFollowUpContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: IpoaPostCobFollowUpContextDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 32\u00020\u0001:\u000223BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\f¢\u0006\u0004\b\r\u0010\u000eB?\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0018\u0010\"\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\u0018\u0010#\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\fHÆ\u0003JO\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\u0017\b\u0002\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0010HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J%\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R+\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR+\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u001f¨\u00064"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IpoaPostCobFollowUpContextDto$Surrogate;", "", "instrument_id", "", "expected_ipo_date", "projected_allocated_shares", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int64Serializer;", "projected_allocated_percentage", "", "Lcom/robinhood/idl/serialization/FloatSerializer;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JF)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;JFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getInstrument_id$annotations", "()V", "getInstrument_id", "()Ljava/lang/String;", "getExpected_ipo_date$annotations", "getExpected_ipo_date", "getProjected_allocated_shares$annotations", "getProjected_allocated_shares", "()J", "getProjected_allocated_percentage$annotations", "getProjected_allocated_percentage", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String expected_ipo_date;
        private final String instrument_id;
        private final float projected_allocated_percentage;
        private final long projected_allocated_shares;

        public Surrogate() {
            this((String) null, (String) null, 0L, 0.0f, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, long j, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.instrument_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.expected_ipo_date;
            }
            if ((i & 4) != 0) {
                j = surrogate.projected_allocated_shares;
            }
            if ((i & 8) != 0) {
                f = surrogate.projected_allocated_percentage;
            }
            float f2 = f;
            return surrogate.copy(str, str2, j, f2);
        }

        @SerialName("expectedIpoDate")
        @JsonAnnotations2(names = {"expected_ipo_date"})
        public static /* synthetic */ void getExpected_ipo_date$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("projectedAllocatedPercentage")
        @JsonAnnotations2(names = {"projected_allocated_percentage"})
        public static /* synthetic */ void getProjected_allocated_percentage$annotations() {
        }

        @SerialName("projectedAllocatedShares")
        @JsonAnnotations2(names = {"projected_allocated_shares"})
        public static /* synthetic */ void getProjected_allocated_shares$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrument_id() {
            return this.instrument_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getExpected_ipo_date() {
            return this.expected_ipo_date;
        }

        /* renamed from: component3, reason: from getter */
        public final long getProjected_allocated_shares() {
            return this.projected_allocated_shares;
        }

        /* renamed from: component4, reason: from getter */
        public final float getProjected_allocated_percentage() {
            return this.projected_allocated_percentage;
        }

        public final Surrogate copy(String instrument_id, String expected_ipo_date, long projected_allocated_shares, float projected_allocated_percentage) {
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(expected_ipo_date, "expected_ipo_date");
            return new Surrogate(instrument_id, expected_ipo_date, projected_allocated_shares, projected_allocated_percentage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.expected_ipo_date, surrogate.expected_ipo_date) && this.projected_allocated_shares == surrogate.projected_allocated_shares && Float.compare(this.projected_allocated_percentage, surrogate.projected_allocated_percentage) == 0;
        }

        public int hashCode() {
            return (((((this.instrument_id.hashCode() * 31) + this.expected_ipo_date.hashCode()) * 31) + Long.hashCode(this.projected_allocated_shares)) * 31) + Float.hashCode(this.projected_allocated_percentage);
        }

        public String toString() {
            return "Surrogate(instrument_id=" + this.instrument_id + ", expected_ipo_date=" + this.expected_ipo_date + ", projected_allocated_shares=" + this.projected_allocated_shares + ", projected_allocated_percentage=" + this.projected_allocated_percentage + ")";
        }

        /* compiled from: IpoaPostCobFollowUpContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IpoaPostCobFollowUpContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/IpoaPostCobFollowUpContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IpoaPostCobFollowUpContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, long j, float f, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str;
            }
            if ((i & 2) == 0) {
                this.expected_ipo_date = "";
            } else {
                this.expected_ipo_date = str2;
            }
            if ((i & 4) == 0) {
                this.projected_allocated_shares = 0L;
            } else {
                this.projected_allocated_shares = j;
            }
            if ((i & 8) == 0) {
                this.projected_allocated_percentage = 0.0f;
            } else {
                this.projected_allocated_percentage = f;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.instrument_id);
            }
            if (!Intrinsics.areEqual(self.expected_ipo_date, "")) {
                output.encodeStringElement(serialDesc, 1, self.expected_ipo_date);
            }
            long j = self.projected_allocated_shares;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            if (Float.compare(self.projected_allocated_percentage, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 3, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.projected_allocated_percentage));
            }
        }

        public Surrogate(String instrument_id, String expected_ipo_date, long j, float f) {
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(expected_ipo_date, "expected_ipo_date");
            this.instrument_id = instrument_id;
            this.expected_ipo_date = expected_ipo_date;
            this.projected_allocated_shares = j;
            this.projected_allocated_percentage = f;
        }

        public /* synthetic */ Surrogate(String str, String str2, long j, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0.0f : f);
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final String getExpected_ipo_date() {
            return this.expected_ipo_date;
        }

        public final long getProjected_allocated_shares() {
            return this.projected_allocated_shares;
        }

        public final float getProjected_allocated_percentage() {
            return this.projected_allocated_percentage;
        }
    }

    /* compiled from: IpoaPostCobFollowUpContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IpoaPostCobFollowUpContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/IpoaPostCobFollowUpContextDto;", "Lcom/robinhood/rosetta/eventlogging/IpoaPostCobFollowUpContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/IpoaPostCobFollowUpContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<IpoaPostCobFollowUpContextDto, IpoaPostCobFollowUpContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IpoaPostCobFollowUpContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IpoaPostCobFollowUpContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IpoaPostCobFollowUpContextDto> getBinaryBase64Serializer() {
            return (KSerializer) IpoaPostCobFollowUpContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IpoaPostCobFollowUpContext> getProtoAdapter() {
            return IpoaPostCobFollowUpContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IpoaPostCobFollowUpContextDto getZeroValue() {
            return IpoaPostCobFollowUpContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IpoaPostCobFollowUpContextDto fromProto(IpoaPostCobFollowUpContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new IpoaPostCobFollowUpContextDto(new Surrogate(proto.getInstrument_id(), proto.getExpected_ipo_date(), proto.getProjected_allocated_shares(), proto.getProjected_allocated_percentage()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.IpoaPostCobFollowUpContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IpoaPostCobFollowUpContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new IpoaPostCobFollowUpContextDto(null, null, 0L, 0.0f, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IpoaPostCobFollowUpContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IpoaPostCobFollowUpContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/IpoaPostCobFollowUpContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/IpoaPostCobFollowUpContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<IpoaPostCobFollowUpContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.IpoaPostCobFollowUpContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IpoaPostCobFollowUpContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IpoaPostCobFollowUpContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IpoaPostCobFollowUpContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IpoaPostCobFollowUpContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IpoaPostCobFollowUpContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.IpoaPostCobFollowUpContextDto";
        }
    }
}
