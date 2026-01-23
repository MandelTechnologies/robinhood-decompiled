package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
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

/* compiled from: MarginTieredRatesContextDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\"#$%B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginTieredRatesContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/MarginTieredRatesContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/MarginTieredRatesContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MarginTieredRatesContextDto$Surrogate;)V", "margin_available_amount", "", "highlighted_amount_borrowed_range", "", "highlighted_interest_rate", "(DLjava/lang/String;Ljava/lang/String;)V", "getMargin_available_amount", "()D", "getHighlighted_amount_borrowed_range", "()Ljava/lang/String;", "getHighlighted_interest_rate", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class MarginTieredRatesContextDto implements Dto3<MarginTieredRatesContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MarginTieredRatesContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MarginTieredRatesContextDto, MarginTieredRatesContext>> binaryBase64Serializer$delegate;
    private static final MarginTieredRatesContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MarginTieredRatesContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MarginTieredRatesContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final double getMargin_available_amount() {
        return this.surrogate.getMargin_available_amount();
    }

    public final String getHighlighted_amount_borrowed_range() {
        return this.surrogate.getHighlighted_amount_borrowed_range();
    }

    public final String getHighlighted_interest_rate() {
        return this.surrogate.getHighlighted_interest_rate();
    }

    public /* synthetic */ MarginTieredRatesContextDto(double d, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarginTieredRatesContextDto(double d, String highlighted_amount_borrowed_range, String highlighted_interest_rate) {
        this(new Surrogate(d, highlighted_amount_borrowed_range, highlighted_interest_rate));
        Intrinsics.checkNotNullParameter(highlighted_amount_borrowed_range, "highlighted_amount_borrowed_range");
        Intrinsics.checkNotNullParameter(highlighted_interest_rate, "highlighted_interest_rate");
    }

    public static /* synthetic */ MarginTieredRatesContextDto copy$default(MarginTieredRatesContextDto marginTieredRatesContextDto, double d, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = marginTieredRatesContextDto.surrogate.getMargin_available_amount();
        }
        if ((i & 2) != 0) {
            str = marginTieredRatesContextDto.surrogate.getHighlighted_amount_borrowed_range();
        }
        if ((i & 4) != 0) {
            str2 = marginTieredRatesContextDto.surrogate.getHighlighted_interest_rate();
        }
        return marginTieredRatesContextDto.copy(d, str, str2);
    }

    public final MarginTieredRatesContextDto copy(double margin_available_amount, String highlighted_amount_borrowed_range, String highlighted_interest_rate) {
        Intrinsics.checkNotNullParameter(highlighted_amount_borrowed_range, "highlighted_amount_borrowed_range");
        Intrinsics.checkNotNullParameter(highlighted_interest_rate, "highlighted_interest_rate");
        return new MarginTieredRatesContextDto(new Surrogate(margin_available_amount, highlighted_amount_borrowed_range, highlighted_interest_rate));
    }

    @Override // com.robinhood.idl.Dto
    public MarginTieredRatesContext toProto() {
        return new MarginTieredRatesContext(this.surrogate.getMargin_available_amount(), this.surrogate.getHighlighted_amount_borrowed_range(), this.surrogate.getHighlighted_interest_rate(), null, 8, null);
    }

    public String toString() {
        return "[MarginTieredRatesContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MarginTieredRatesContextDto) && Intrinsics.areEqual(((MarginTieredRatesContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: MarginTieredRatesContextDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B4\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB7\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\u0018\u0010\u001a\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J6\u0010\u001d\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\rHÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0017¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginTieredRatesContextDto$Surrogate;", "", "margin_available_amount", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "highlighted_amount_borrowed_range", "", "highlighted_interest_rate", "<init>", "(DLjava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMargin_available_amount$annotations", "()V", "getMargin_available_amount", "()D", "getHighlighted_amount_borrowed_range$annotations", "getHighlighted_amount_borrowed_range", "()Ljava/lang/String;", "getHighlighted_interest_rate$annotations", "getHighlighted_interest_rate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String highlighted_amount_borrowed_range;
        private final String highlighted_interest_rate;
        private final double margin_available_amount;

        public Surrogate() {
            this(0.0d, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, double d, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = surrogate.margin_available_amount;
            }
            if ((i & 2) != 0) {
                str = surrogate.highlighted_amount_borrowed_range;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.highlighted_interest_rate;
            }
            return surrogate.copy(d, str, str2);
        }

        @SerialName("highlightedAmountBorrowedRange")
        @JsonAnnotations2(names = {"highlighted_amount_borrowed_range"})
        public static /* synthetic */ void getHighlighted_amount_borrowed_range$annotations() {
        }

        @SerialName("highlightedInterestRate")
        @JsonAnnotations2(names = {"highlighted_interest_rate"})
        public static /* synthetic */ void getHighlighted_interest_rate$annotations() {
        }

        @SerialName("marginAvailableAmount")
        @JsonAnnotations2(names = {"margin_available_amount"})
        public static /* synthetic */ void getMargin_available_amount$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final double getMargin_available_amount() {
            return this.margin_available_amount;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHighlighted_amount_borrowed_range() {
            return this.highlighted_amount_borrowed_range;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHighlighted_interest_rate() {
            return this.highlighted_interest_rate;
        }

        public final Surrogate copy(double margin_available_amount, String highlighted_amount_borrowed_range, String highlighted_interest_rate) {
            Intrinsics.checkNotNullParameter(highlighted_amount_borrowed_range, "highlighted_amount_borrowed_range");
            Intrinsics.checkNotNullParameter(highlighted_interest_rate, "highlighted_interest_rate");
            return new Surrogate(margin_available_amount, highlighted_amount_borrowed_range, highlighted_interest_rate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Double.compare(this.margin_available_amount, surrogate.margin_available_amount) == 0 && Intrinsics.areEqual(this.highlighted_amount_borrowed_range, surrogate.highlighted_amount_borrowed_range) && Intrinsics.areEqual(this.highlighted_interest_rate, surrogate.highlighted_interest_rate);
        }

        public int hashCode() {
            return (((Double.hashCode(this.margin_available_amount) * 31) + this.highlighted_amount_borrowed_range.hashCode()) * 31) + this.highlighted_interest_rate.hashCode();
        }

        public String toString() {
            return "Surrogate(margin_available_amount=" + this.margin_available_amount + ", highlighted_amount_borrowed_range=" + this.highlighted_amount_borrowed_range + ", highlighted_interest_rate=" + this.highlighted_interest_rate + ")";
        }

        /* compiled from: MarginTieredRatesContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginTieredRatesContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MarginTieredRatesContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MarginTieredRatesContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, double d, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.margin_available_amount = (i & 1) == 0 ? 0.0d : d;
            if ((i & 2) == 0) {
                this.highlighted_amount_borrowed_range = "";
            } else {
                this.highlighted_amount_borrowed_range = str;
            }
            if ((i & 4) == 0) {
                this.highlighted_interest_rate = "";
            } else {
                this.highlighted_interest_rate = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (Double.compare(self.margin_available_amount, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 0, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.margin_available_amount));
            }
            if (!Intrinsics.areEqual(self.highlighted_amount_borrowed_range, "")) {
                output.encodeStringElement(serialDesc, 1, self.highlighted_amount_borrowed_range);
            }
            if (Intrinsics.areEqual(self.highlighted_interest_rate, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 2, self.highlighted_interest_rate);
        }

        public Surrogate(double d, String highlighted_amount_borrowed_range, String highlighted_interest_rate) {
            Intrinsics.checkNotNullParameter(highlighted_amount_borrowed_range, "highlighted_amount_borrowed_range");
            Intrinsics.checkNotNullParameter(highlighted_interest_rate, "highlighted_interest_rate");
            this.margin_available_amount = d;
            this.highlighted_amount_borrowed_range = highlighted_amount_borrowed_range;
            this.highlighted_interest_rate = highlighted_interest_rate;
        }

        public /* synthetic */ Surrogate(double d, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
        }

        public final double getMargin_available_amount() {
            return this.margin_available_amount;
        }

        public final String getHighlighted_amount_borrowed_range() {
            return this.highlighted_amount_borrowed_range;
        }

        public final String getHighlighted_interest_rate() {
            return this.highlighted_interest_rate;
        }
    }

    /* compiled from: MarginTieredRatesContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginTieredRatesContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MarginTieredRatesContextDto;", "Lcom/robinhood/rosetta/eventlogging/MarginTieredRatesContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MarginTieredRatesContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<MarginTieredRatesContextDto, MarginTieredRatesContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MarginTieredRatesContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginTieredRatesContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginTieredRatesContextDto> getBinaryBase64Serializer() {
            return (KSerializer) MarginTieredRatesContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MarginTieredRatesContext> getProtoAdapter() {
            return MarginTieredRatesContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginTieredRatesContextDto getZeroValue() {
            return MarginTieredRatesContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginTieredRatesContextDto fromProto(MarginTieredRatesContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new MarginTieredRatesContextDto(new Surrogate(proto.getMargin_available_amount(), proto.getHighlighted_amount_borrowed_range(), proto.getHighlighted_interest_rate()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MarginTieredRatesContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginTieredRatesContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MarginTieredRatesContextDto(0.0d, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MarginTieredRatesContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginTieredRatesContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MarginTieredRatesContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/MarginTieredRatesContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<MarginTieredRatesContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.MarginTieredRatesContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MarginTieredRatesContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MarginTieredRatesContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MarginTieredRatesContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MarginTieredRatesContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MarginTieredRatesContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.MarginTieredRatesContextDto";
        }
    }
}
