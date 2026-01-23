package advisory.proto.p008v1;

import advisory.proto.p008v1.AdvisoryInsightContentViewModelDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p479j$.time.Instant;
import yoda.service.insight.InsightPageType;
import yoda.service.insight.InsightPageTypeDto;
import yoda.service.insight.InsightType;
import yoda.service.insight.InsightTypeDto;

/* compiled from: AdvisoryInsightDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00047689B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0006\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0019\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u00100R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b1\u0010\"R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006:"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/AdvisoryInsight;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/AdvisoryInsightDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightDto$Surrogate;)V", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto;", "content_view_model", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "created_at", "", "id", "", "is_seen", "", "priority", "Lyoda/service/insight/InsightTypeDto;", "insight_type", "account_number", "Lyoda/service/insight/InsightPageTypeDto;", "page_type", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto;Lj$/time/Instant;Ljava/lang/String;ZILyoda/service/insight/InsightTypeDto;Ljava/lang/String;Lyoda/service/insight/InsightPageTypeDto;)V", "toProto", "()Ladvisory/proto/v1/AdvisoryInsight;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/AdvisoryInsightDto$Surrogate;", "getContent_view_model", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto;", "getCreated_at", "()Lj$/time/Instant;", "getId", "()Z", "getPriority", "getInsight_type", "()Lyoda/service/insight/InsightTypeDto;", "getPage_type", "()Lyoda/service/insight/InsightPageTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class AdvisoryInsightDto implements Dto3<AdvisoryInsight>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdvisoryInsightDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdvisoryInsightDto, AdvisoryInsight>> binaryBase64Serializer$delegate;
    private static final AdvisoryInsightDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdvisoryInsightDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdvisoryInsightDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final AdvisoryInsightContentViewModelDto getContent_view_model() {
        return this.surrogate.getContent_view_model();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final boolean is_seen() {
        return this.surrogate.getIs_seen();
    }

    public final int getPriority() {
        return this.surrogate.getPriority();
    }

    public final InsightTypeDto getInsight_type() {
        return this.surrogate.getInsight_type();
    }

    public final InsightPageTypeDto getPage_type() {
        return this.surrogate.getPage_type();
    }

    public /* synthetic */ AdvisoryInsightDto(AdvisoryInsightContentViewModelDto advisoryInsightContentViewModelDto, Instant instant, String str, boolean z, int i, InsightTypeDto insightTypeDto, String str2, InsightPageTypeDto insightPageTypeDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : advisoryInsightContentViewModelDto, (i2 & 2) != 0 ? null : instant, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? InsightTypeDto.INSTANCE.getZeroValue() : insightTypeDto, (i2 & 64) != 0 ? "" : str2, (i2 & 128) != 0 ? InsightPageTypeDto.INSTANCE.getZeroValue() : insightPageTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvisoryInsightDto(AdvisoryInsightContentViewModelDto advisoryInsightContentViewModelDto, Instant instant, String id, boolean z, int i, InsightTypeDto insight_type, String account_number, InsightPageTypeDto page_type) {
        this(new Surrogate(advisoryInsightContentViewModelDto, instant, id, z, i, insight_type, account_number, page_type));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(insight_type, "insight_type");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(page_type, "page_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public AdvisoryInsight toProto() {
        AdvisoryInsightContentViewModelDto content_view_model = this.surrogate.getContent_view_model();
        return new AdvisoryInsight(content_view_model != null ? content_view_model.toProto() : null, this.surrogate.getCreated_at(), this.surrogate.getId(), this.surrogate.getIs_seen(), this.surrogate.getPriority(), (InsightType) this.surrogate.getInsight_type().toProto(), this.surrogate.getAccount_number(), (InsightPageType) this.surrogate.getPage_type().toProto(), null, 256, null);
    }

    public String toString() {
        return "[AdvisoryInsightDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdvisoryInsightDto) && Intrinsics.areEqual(((AdvisoryInsightDto) other).surrogate, this.surrogate);
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
    /* compiled from: AdvisoryInsightDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b)\b\u0083\b\u0018\u0000 H2\u00020\u0001:\u0002IHB\u008e\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012.\b\u0002\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017Bg\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.RF\u0010\t\u001a(\u0018\u00010\u0004j\u0013\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b4\u00100\u001a\u0004\b2\u00103R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b7\u00100\u001a\u0004\b6\u0010&R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00108\u0012\u0004\b:\u00100\u001a\u0004\b\r\u00109R/\u0010\u0010\u001a\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010;\u0012\u0004\b=\u00100\u001a\u0004\b<\u0010(R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010>\u0012\u0004\bA\u00100\u001a\u0004\b?\u0010@R \u0010\u0013\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u00105\u0012\u0004\bC\u00100\u001a\u0004\bB\u0010&R \u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010D\u0012\u0004\bG\u00100\u001a\u0004\bE\u0010F¨\u0006J"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightDto$Surrogate;", "", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto;", "content_view_model", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "created_at", "", "id", "", "is_seen", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "priority", "Lyoda/service/insight/InsightTypeDto;", "insight_type", "account_number", "Lyoda/service/insight/InsightPageTypeDto;", "page_type", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto;Lj$/time/Instant;Ljava/lang/String;ZILyoda/service/insight/InsightTypeDto;Ljava/lang/String;Lyoda/service/insight/InsightPageTypeDto;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILadvisory/proto/v1/AdvisoryInsightContentViewModelDto;Lj$/time/Instant;Ljava/lang/String;ZILyoda/service/insight/InsightTypeDto;Ljava/lang/String;Lyoda/service/insight/InsightPageTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/AdvisoryInsightDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto;", "getContent_view_model", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelDto;", "getContent_view_model$annotations", "()V", "Lj$/time/Instant;", "getCreated_at", "()Lj$/time/Instant;", "getCreated_at$annotations", "Ljava/lang/String;", "getId", "getId$annotations", "Z", "()Z", "is_seen$annotations", "I", "getPriority", "getPriority$annotations", "Lyoda/service/insight/InsightTypeDto;", "getInsight_type", "()Lyoda/service/insight/InsightTypeDto;", "getInsight_type$annotations", "getAccount_number", "getAccount_number$annotations", "Lyoda/service/insight/InsightPageTypeDto;", "getPage_type", "()Lyoda/service/insight/InsightPageTypeDto;", "getPage_type$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final AdvisoryInsightContentViewModelDto content_view_model;
        private final Instant created_at;
        private final String id;
        private final InsightTypeDto insight_type;
        private final boolean is_seen;
        private final InsightPageTypeDto page_type;
        private final int priority;

        public Surrogate() {
            this((AdvisoryInsightContentViewModelDto) null, (Instant) null, (String) null, false, 0, (InsightTypeDto) null, (String) null, (InsightPageTypeDto) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.content_view_model, surrogate.content_view_model) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.id, surrogate.id) && this.is_seen == surrogate.is_seen && this.priority == surrogate.priority && this.insight_type == surrogate.insight_type && Intrinsics.areEqual(this.account_number, surrogate.account_number) && this.page_type == surrogate.page_type;
        }

        public int hashCode() {
            AdvisoryInsightContentViewModelDto advisoryInsightContentViewModelDto = this.content_view_model;
            int iHashCode = (advisoryInsightContentViewModelDto == null ? 0 : advisoryInsightContentViewModelDto.hashCode()) * 31;
            Instant instant = this.created_at;
            return ((((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.is_seen)) * 31) + Integer.hashCode(this.priority)) * 31) + this.insight_type.hashCode()) * 31) + this.account_number.hashCode()) * 31) + this.page_type.hashCode();
        }

        public String toString() {
            return "Surrogate(content_view_model=" + this.content_view_model + ", created_at=" + this.created_at + ", id=" + this.id + ", is_seen=" + this.is_seen + ", priority=" + this.priority + ", insight_type=" + this.insight_type + ", account_number=" + this.account_number + ", page_type=" + this.page_type + ")";
        }

        /* compiled from: AdvisoryInsightDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/AdvisoryInsightDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdvisoryInsightDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, AdvisoryInsightContentViewModelDto advisoryInsightContentViewModelDto, Instant instant, String str, boolean z, int i2, InsightTypeDto insightTypeDto, String str2, InsightPageTypeDto insightPageTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.content_view_model = null;
            } else {
                this.content_view_model = advisoryInsightContentViewModelDto;
            }
            if ((i & 2) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant;
            }
            if ((i & 4) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 8) == 0) {
                this.is_seen = false;
            } else {
                this.is_seen = z;
            }
            if ((i & 16) == 0) {
                this.priority = 0;
            } else {
                this.priority = i2;
            }
            if ((i & 32) == 0) {
                this.insight_type = InsightTypeDto.INSTANCE.getZeroValue();
            } else {
                this.insight_type = insightTypeDto;
            }
            if ((i & 64) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str2;
            }
            if ((i & 128) == 0) {
                this.page_type = InsightPageTypeDto.INSTANCE.getZeroValue();
            } else {
                this.page_type = insightPageTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            AdvisoryInsightContentViewModelDto advisoryInsightContentViewModelDto = self.content_view_model;
            if (advisoryInsightContentViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, AdvisoryInsightContentViewModelDto.Serializer.INSTANCE, advisoryInsightContentViewModelDto);
            }
            Instant instant = self.created_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 2, self.id);
            }
            boolean z = self.is_seen;
            if (z) {
                output.encodeBooleanElement(serialDesc, 3, z);
            }
            int i = self.priority;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (self.insight_type != InsightTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, InsightTypeDto.Serializer.INSTANCE, self.insight_type);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 6, self.account_number);
            }
            if (self.page_type != InsightPageTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, InsightPageTypeDto.Serializer.INSTANCE, self.page_type);
            }
        }

        public Surrogate(AdvisoryInsightContentViewModelDto advisoryInsightContentViewModelDto, Instant instant, String id, boolean z, int i, InsightTypeDto insight_type, String account_number, InsightPageTypeDto page_type) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(insight_type, "insight_type");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(page_type, "page_type");
            this.content_view_model = advisoryInsightContentViewModelDto;
            this.created_at = instant;
            this.id = id;
            this.is_seen = z;
            this.priority = i;
            this.insight_type = insight_type;
            this.account_number = account_number;
            this.page_type = page_type;
        }

        public /* synthetic */ Surrogate(AdvisoryInsightContentViewModelDto advisoryInsightContentViewModelDto, Instant instant, String str, boolean z, int i, InsightTypeDto insightTypeDto, String str2, InsightPageTypeDto insightPageTypeDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : advisoryInsightContentViewModelDto, (i2 & 2) != 0 ? null : instant, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? InsightTypeDto.INSTANCE.getZeroValue() : insightTypeDto, (i2 & 64) != 0 ? "" : str2, (i2 & 128) != 0 ? InsightPageTypeDto.INSTANCE.getZeroValue() : insightPageTypeDto);
        }

        public final AdvisoryInsightContentViewModelDto getContent_view_model() {
            return this.content_view_model;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final String getId() {
            return this.id;
        }

        /* renamed from: is_seen, reason: from getter */
        public final boolean getIs_seen() {
            return this.is_seen;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final InsightTypeDto getInsight_type() {
            return this.insight_type;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final InsightPageTypeDto getPage_type() {
            return this.page_type;
        }
    }

    /* compiled from: AdvisoryInsightDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/AdvisoryInsightDto;", "Ladvisory/proto/v1/AdvisoryInsight;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/AdvisoryInsightDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AdvisoryInsightDto, AdvisoryInsight> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdvisoryInsightDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryInsightDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryInsightDto> getBinaryBase64Serializer() {
            return (KSerializer) AdvisoryInsightDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdvisoryInsight> getProtoAdapter() {
            return AdvisoryInsight.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryInsightDto getZeroValue() {
            return AdvisoryInsightDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryInsightDto fromProto(AdvisoryInsight proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            AdvisoryInsightContentViewModel content_view_model = proto.getContent_view_model();
            return new AdvisoryInsightDto(new Surrogate(content_view_model != null ? AdvisoryInsightContentViewModelDto.INSTANCE.fromProto(content_view_model) : null, proto.getCreated_at(), proto.getId(), proto.getIs_seen(), proto.getPriority(), InsightTypeDto.INSTANCE.fromProto(proto.getInsight_type()), proto.getAccount_number(), InsightPageTypeDto.INSTANCE.fromProto(proto.getPage_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.AdvisoryInsightDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisoryInsightDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AdvisoryInsightDto(null, null, null, false, 0, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AdvisoryInsightDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/AdvisoryInsightDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/AdvisoryInsightDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AdvisoryInsightDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.AdvisoryInsight", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdvisoryInsightDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdvisoryInsightDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdvisoryInsightDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AdvisoryInsightDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "advisory.proto.v1.AdvisoryInsightDto";
        }
    }
}
