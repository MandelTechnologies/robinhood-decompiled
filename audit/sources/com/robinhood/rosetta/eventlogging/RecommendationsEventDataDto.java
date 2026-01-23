package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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

/* compiled from: RecommendationsEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 !\"#B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\fJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto$Surrogate;)V", "recommendation_id", "", "invest_flow_schedule_id", "invest_flow_order_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRecommendation_id", "()Ljava/lang/String;", "getInvest_flow_schedule_id", "getInvest_flow_order_id", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class RecommendationsEventDataDto implements Dto3<RecommendationsEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<RecommendationsEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RecommendationsEventDataDto, RecommendationsEventData>> binaryBase64Serializer$delegate;
    private static final RecommendationsEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RecommendationsEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RecommendationsEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getRecommendation_id() {
        return this.surrogate.getRecommendation_id();
    }

    public final String getInvest_flow_schedule_id() {
        return this.surrogate.getInvest_flow_schedule_id();
    }

    public final String getInvest_flow_order_id() {
        return this.surrogate.getInvest_flow_order_id();
    }

    public /* synthetic */ RecommendationsEventDataDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecommendationsEventDataDto(String recommendation_id, String invest_flow_schedule_id, String invest_flow_order_id) {
        this(new Surrogate(recommendation_id, invest_flow_schedule_id, invest_flow_order_id));
        Intrinsics.checkNotNullParameter(recommendation_id, "recommendation_id");
        Intrinsics.checkNotNullParameter(invest_flow_schedule_id, "invest_flow_schedule_id");
        Intrinsics.checkNotNullParameter(invest_flow_order_id, "invest_flow_order_id");
    }

    public static /* synthetic */ RecommendationsEventDataDto copy$default(RecommendationsEventDataDto recommendationsEventDataDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recommendationsEventDataDto.surrogate.getRecommendation_id();
        }
        if ((i & 2) != 0) {
            str2 = recommendationsEventDataDto.surrogate.getInvest_flow_schedule_id();
        }
        if ((i & 4) != 0) {
            str3 = recommendationsEventDataDto.surrogate.getInvest_flow_order_id();
        }
        return recommendationsEventDataDto.copy(str, str2, str3);
    }

    public final RecommendationsEventDataDto copy(String recommendation_id, String invest_flow_schedule_id, String invest_flow_order_id) {
        Intrinsics.checkNotNullParameter(recommendation_id, "recommendation_id");
        Intrinsics.checkNotNullParameter(invest_flow_schedule_id, "invest_flow_schedule_id");
        Intrinsics.checkNotNullParameter(invest_flow_order_id, "invest_flow_order_id");
        return new RecommendationsEventDataDto(new Surrogate(recommendation_id, invest_flow_schedule_id, invest_flow_order_id));
    }

    @Override // com.robinhood.idl.Dto
    public RecommendationsEventData toProto() {
        return new RecommendationsEventData(this.surrogate.getRecommendation_id(), this.surrogate.getInvest_flow_schedule_id(), this.surrogate.getInvest_flow_order_id(), null, 8, null);
    }

    public String toString() {
        return "[RecommendationsEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RecommendationsEventDataDto) && Intrinsics.areEqual(((RecommendationsEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: RecommendationsEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 '2\u00020\u0001:\u0002&'B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto$Surrogate;", "", "recommendation_id", "", "invest_flow_schedule_id", "invest_flow_order_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRecommendation_id$annotations", "()V", "getRecommendation_id", "()Ljava/lang/String;", "getInvest_flow_schedule_id$annotations", "getInvest_flow_schedule_id", "getInvest_flow_order_id$annotations", "getInvest_flow_order_id", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String invest_flow_order_id;
        private final String invest_flow_schedule_id;
        private final String recommendation_id;

        public Surrogate() {
            this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.recommendation_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.invest_flow_schedule_id;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.invest_flow_order_id;
            }
            return surrogate.copy(str, str2, str3);
        }

        @SerialName("investFlowOrderId")
        @JsonAnnotations2(names = {"invest_flow_order_id"})
        public static /* synthetic */ void getInvest_flow_order_id$annotations() {
        }

        @SerialName("investFlowScheduleId")
        @JsonAnnotations2(names = {"invest_flow_schedule_id"})
        public static /* synthetic */ void getInvest_flow_schedule_id$annotations() {
        }

        @SerialName("recommendationId")
        @JsonAnnotations2(names = {"recommendation_id"})
        public static /* synthetic */ void getRecommendation_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getRecommendation_id() {
            return this.recommendation_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInvest_flow_schedule_id() {
            return this.invest_flow_schedule_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getInvest_flow_order_id() {
            return this.invest_flow_order_id;
        }

        public final Surrogate copy(String recommendation_id, String invest_flow_schedule_id, String invest_flow_order_id) {
            Intrinsics.checkNotNullParameter(recommendation_id, "recommendation_id");
            Intrinsics.checkNotNullParameter(invest_flow_schedule_id, "invest_flow_schedule_id");
            Intrinsics.checkNotNullParameter(invest_flow_order_id, "invest_flow_order_id");
            return new Surrogate(recommendation_id, invest_flow_schedule_id, invest_flow_order_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.recommendation_id, surrogate.recommendation_id) && Intrinsics.areEqual(this.invest_flow_schedule_id, surrogate.invest_flow_schedule_id) && Intrinsics.areEqual(this.invest_flow_order_id, surrogate.invest_flow_order_id);
        }

        public int hashCode() {
            return (((this.recommendation_id.hashCode() * 31) + this.invest_flow_schedule_id.hashCode()) * 31) + this.invest_flow_order_id.hashCode();
        }

        public String toString() {
            return "Surrogate(recommendation_id=" + this.recommendation_id + ", invest_flow_schedule_id=" + this.invest_flow_schedule_id + ", invest_flow_order_id=" + this.invest_flow_order_id + ")";
        }

        /* compiled from: RecommendationsEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RecommendationsEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.recommendation_id = "";
            } else {
                this.recommendation_id = str;
            }
            if ((i & 2) == 0) {
                this.invest_flow_schedule_id = "";
            } else {
                this.invest_flow_schedule_id = str2;
            }
            if ((i & 4) == 0) {
                this.invest_flow_order_id = "";
            } else {
                this.invest_flow_order_id = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.recommendation_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.recommendation_id);
            }
            if (!Intrinsics.areEqual(self.invest_flow_schedule_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.invest_flow_schedule_id);
            }
            if (Intrinsics.areEqual(self.invest_flow_order_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 2, self.invest_flow_order_id);
        }

        public Surrogate(String recommendation_id, String invest_flow_schedule_id, String invest_flow_order_id) {
            Intrinsics.checkNotNullParameter(recommendation_id, "recommendation_id");
            Intrinsics.checkNotNullParameter(invest_flow_schedule_id, "invest_flow_schedule_id");
            Intrinsics.checkNotNullParameter(invest_flow_order_id, "invest_flow_order_id");
            this.recommendation_id = recommendation_id;
            this.invest_flow_schedule_id = invest_flow_schedule_id;
            this.invest_flow_order_id = invest_flow_order_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }

        public final String getRecommendation_id() {
            return this.recommendation_id;
        }

        public final String getInvest_flow_schedule_id() {
            return this.invest_flow_schedule_id;
        }

        public final String getInvest_flow_order_id() {
            return this.invest_flow_order_id;
        }
    }

    /* compiled from: RecommendationsEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<RecommendationsEventDataDto, RecommendationsEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RecommendationsEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RecommendationsEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RecommendationsEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) RecommendationsEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RecommendationsEventData> getProtoAdapter() {
            return RecommendationsEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RecommendationsEventDataDto getZeroValue() {
            return RecommendationsEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RecommendationsEventDataDto fromProto(RecommendationsEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new RecommendationsEventDataDto(new Surrogate(proto.getRecommendation_id(), proto.getInvest_flow_schedule_id(), proto.getInvest_flow_order_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RecommendationsEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new RecommendationsEventDataDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: RecommendationsEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<RecommendationsEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.RecommendationsEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RecommendationsEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RecommendationsEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RecommendationsEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: RecommendationsEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.RecommendationsEventDataDto";
        }
    }
}
