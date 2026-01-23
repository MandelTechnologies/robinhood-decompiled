package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.EquityOrderCheckActionDataDto;
import com.robinhood.rosetta.eventlogging.EquityOrderCheckDataDto;
import com.robinhood.rosetta.eventlogging.EquityOrderEventDataDto;
import com.robinhood.rosetta.eventlogging.EquityOrderExecutionDataDto;
import com.robinhood.rosetta.eventlogging.EquityOrderMetaDto;
import com.robinhood.rosetta.eventlogging.EquityOrderPayloadDto;
import com.robinhood.rosetta.eventlogging.OrderFormStepDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: EquityOrderEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00042345B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BS\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0006\u0010\u0015JP\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\b\u0010#\u001a\u00020\u0002H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020+H\u0016J\b\u00101\u001a\u00020+H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u00066"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto$Surrogate;)V", "step", "Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto;", "payload", "Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto;", Constants.REFERRER_API_META, "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto;", "order_check_data", "Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckDataDto;", "order_check_action_data", "Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckActionDataDto;", "executions", "", "Lcom/robinhood/rosetta/eventlogging/EquityOrderExecutionDataDto;", "(Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckDataDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckActionDataDto;Ljava/util/List;)V", "getStep", "()Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto;", "getPayload", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto;", "getMeta", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto;", "getOrder_check_data", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckDataDto;", "getOrder_check_action_data", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckActionDataDto;", "getExecutions", "()Ljava/util/List;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class EquityOrderEventDataDto implements Dto3<EquityOrderEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EquityOrderEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EquityOrderEventDataDto, EquityOrderEventData>> binaryBase64Serializer$delegate;
    private static final EquityOrderEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EquityOrderEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EquityOrderEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final OrderFormStepDto getStep() {
        return this.surrogate.getStep();
    }

    public final EquityOrderPayloadDto getPayload() {
        return this.surrogate.getPayload();
    }

    public final EquityOrderMetaDto getMeta() {
        return this.surrogate.getMeta();
    }

    public final EquityOrderCheckDataDto getOrder_check_data() {
        return this.surrogate.getOrder_check_data();
    }

    public final EquityOrderCheckActionDataDto getOrder_check_action_data() {
        return this.surrogate.getOrder_check_action_data();
    }

    public final java.util.List<EquityOrderExecutionDataDto> getExecutions() {
        return this.surrogate.getExecutions();
    }

    public /* synthetic */ EquityOrderEventDataDto(OrderFormStepDto orderFormStepDto, EquityOrderPayloadDto equityOrderPayloadDto, EquityOrderMetaDto equityOrderMetaDto, EquityOrderCheckDataDto equityOrderCheckDataDto, EquityOrderCheckActionDataDto equityOrderCheckActionDataDto, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OrderFormStepDto.INSTANCE.getZeroValue() : orderFormStepDto, (i & 2) != 0 ? null : equityOrderPayloadDto, (i & 4) != 0 ? null : equityOrderMetaDto, (i & 8) != 0 ? null : equityOrderCheckDataDto, (i & 16) != 0 ? null : equityOrderCheckActionDataDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EquityOrderEventDataDto(OrderFormStepDto step, EquityOrderPayloadDto equityOrderPayloadDto, EquityOrderMetaDto equityOrderMetaDto, EquityOrderCheckDataDto equityOrderCheckDataDto, EquityOrderCheckActionDataDto equityOrderCheckActionDataDto, java.util.List<EquityOrderExecutionDataDto> executions) {
        this(new Surrogate(step, equityOrderPayloadDto, equityOrderMetaDto, equityOrderCheckDataDto, equityOrderCheckActionDataDto, executions));
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(executions, "executions");
    }

    public static /* synthetic */ EquityOrderEventDataDto copy$default(EquityOrderEventDataDto equityOrderEventDataDto, OrderFormStepDto orderFormStepDto, EquityOrderPayloadDto equityOrderPayloadDto, EquityOrderMetaDto equityOrderMetaDto, EquityOrderCheckDataDto equityOrderCheckDataDto, EquityOrderCheckActionDataDto equityOrderCheckActionDataDto, java.util.List list, int i, Object obj) {
        if ((i & 1) != 0) {
            orderFormStepDto = equityOrderEventDataDto.surrogate.getStep();
        }
        if ((i & 2) != 0) {
            equityOrderPayloadDto = equityOrderEventDataDto.surrogate.getPayload();
        }
        if ((i & 4) != 0) {
            equityOrderMetaDto = equityOrderEventDataDto.surrogate.getMeta();
        }
        if ((i & 8) != 0) {
            equityOrderCheckDataDto = equityOrderEventDataDto.surrogate.getOrder_check_data();
        }
        if ((i & 16) != 0) {
            equityOrderCheckActionDataDto = equityOrderEventDataDto.surrogate.getOrder_check_action_data();
        }
        if ((i & 32) != 0) {
            list = equityOrderEventDataDto.surrogate.getExecutions();
        }
        EquityOrderCheckActionDataDto equityOrderCheckActionDataDto2 = equityOrderCheckActionDataDto;
        java.util.List list2 = list;
        return equityOrderEventDataDto.copy(orderFormStepDto, equityOrderPayloadDto, equityOrderMetaDto, equityOrderCheckDataDto, equityOrderCheckActionDataDto2, list2);
    }

    public final EquityOrderEventDataDto copy(OrderFormStepDto step, EquityOrderPayloadDto payload, EquityOrderMetaDto meta, EquityOrderCheckDataDto order_check_data, EquityOrderCheckActionDataDto order_check_action_data, java.util.List<EquityOrderExecutionDataDto> executions) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(executions, "executions");
        return new EquityOrderEventDataDto(new Surrogate(step, payload, meta, order_check_data, order_check_action_data, executions));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EquityOrderEventData toProto() {
        OrderFormStep orderFormStep = (OrderFormStep) this.surrogate.getStep().toProto();
        EquityOrderPayloadDto payload = this.surrogate.getPayload();
        EquityOrderPayload proto = payload != null ? payload.toProto() : null;
        EquityOrderMetaDto meta = this.surrogate.getMeta();
        EquityOrderMeta proto2 = meta != null ? meta.toProto() : null;
        EquityOrderCheckDataDto order_check_data = this.surrogate.getOrder_check_data();
        EquityOrderCheckData proto3 = order_check_data != null ? order_check_data.toProto() : null;
        EquityOrderCheckActionDataDto order_check_action_data = this.surrogate.getOrder_check_action_data();
        EquityOrderCheckActionData proto4 = order_check_action_data != null ? order_check_action_data.toProto() : null;
        java.util.List<EquityOrderExecutionDataDto> executions = this.surrogate.getExecutions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(executions, 10));
        Iterator<T> it = executions.iterator();
        while (it.hasNext()) {
            arrayList.add(((EquityOrderExecutionDataDto) it.next()).toProto());
        }
        return new EquityOrderEventData(orderFormStep, proto, proto2, proto3, proto4, arrayList, null, 64, null);
    }

    public String toString() {
        return "[EquityOrderEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EquityOrderEventDataDto) && Intrinsics.areEqual(((EquityOrderEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: EquityOrderEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ?2\u00020\u0001:\u0002>?BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010B]\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003JS\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0012HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001J%\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0001¢\u0006\u0002\b=R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\"R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010%R\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010(¨\u0006@"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto$Surrogate;", "", "step", "Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto;", "payload", "Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto;", Constants.REFERRER_API_META, "Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto;", "order_check_data", "Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckDataDto;", "order_check_action_data", "Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckActionDataDto;", "executions", "", "Lcom/robinhood/rosetta/eventlogging/EquityOrderExecutionDataDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckDataDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckActionDataDto;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/OrderFormStepDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckDataDto;Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckActionDataDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getStep$annotations", "()V", "getStep", "()Lcom/robinhood/rosetta/eventlogging/OrderFormStepDto;", "getPayload$annotations", "getPayload", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderPayloadDto;", "getMeta$annotations", "getMeta", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderMetaDto;", "getOrder_check_data$annotations", "getOrder_check_data", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckDataDto;", "getOrder_check_action_data$annotations", "getOrder_check_action_data", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderCheckActionDataDto;", "getExecutions$annotations", "getExecutions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final java.util.List<EquityOrderExecutionDataDto> executions;
        private final EquityOrderMetaDto meta;
        private final EquityOrderCheckActionDataDto order_check_action_data;
        private final EquityOrderCheckDataDto order_check_data;
        private final EquityOrderPayloadDto payload;
        private final OrderFormStepDto step;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.eventlogging.EquityOrderEventDataDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityOrderEventDataDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((OrderFormStepDto) null, (EquityOrderPayloadDto) null, (EquityOrderMetaDto) null, (EquityOrderCheckDataDto) null, (EquityOrderCheckActionDataDto) null, (java.util.List) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(EquityOrderExecutionDataDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, OrderFormStepDto orderFormStepDto, EquityOrderPayloadDto equityOrderPayloadDto, EquityOrderMetaDto equityOrderMetaDto, EquityOrderCheckDataDto equityOrderCheckDataDto, EquityOrderCheckActionDataDto equityOrderCheckActionDataDto, java.util.List list, int i, Object obj) {
            if ((i & 1) != 0) {
                orderFormStepDto = surrogate.step;
            }
            if ((i & 2) != 0) {
                equityOrderPayloadDto = surrogate.payload;
            }
            if ((i & 4) != 0) {
                equityOrderMetaDto = surrogate.meta;
            }
            if ((i & 8) != 0) {
                equityOrderCheckDataDto = surrogate.order_check_data;
            }
            if ((i & 16) != 0) {
                equityOrderCheckActionDataDto = surrogate.order_check_action_data;
            }
            if ((i & 32) != 0) {
                list = surrogate.executions;
            }
            EquityOrderCheckActionDataDto equityOrderCheckActionDataDto2 = equityOrderCheckActionDataDto;
            java.util.List list2 = list;
            return surrogate.copy(orderFormStepDto, equityOrderPayloadDto, equityOrderMetaDto, equityOrderCheckDataDto, equityOrderCheckActionDataDto2, list2);
        }

        @SerialName("executions")
        @JsonAnnotations2(names = {"executions"})
        public static /* synthetic */ void getExecutions$annotations() {
        }

        @SerialName(Constants.REFERRER_API_META)
        @JsonAnnotations2(names = {Constants.REFERRER_API_META})
        public static /* synthetic */ void getMeta$annotations() {
        }

        @SerialName("orderCheckActionData")
        @JsonAnnotations2(names = {"order_check_action_data"})
        public static /* synthetic */ void getOrder_check_action_data$annotations() {
        }

        @SerialName("orderCheckData")
        @JsonAnnotations2(names = {"order_check_data"})
        public static /* synthetic */ void getOrder_check_data$annotations() {
        }

        @SerialName("payload")
        @JsonAnnotations2(names = {"payload"})
        public static /* synthetic */ void getPayload$annotations() {
        }

        @SerialName("step")
        @JsonAnnotations2(names = {"step"})
        public static /* synthetic */ void getStep$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final OrderFormStepDto getStep() {
            return this.step;
        }

        /* renamed from: component2, reason: from getter */
        public final EquityOrderPayloadDto getPayload() {
            return this.payload;
        }

        /* renamed from: component3, reason: from getter */
        public final EquityOrderMetaDto getMeta() {
            return this.meta;
        }

        /* renamed from: component4, reason: from getter */
        public final EquityOrderCheckDataDto getOrder_check_data() {
            return this.order_check_data;
        }

        /* renamed from: component5, reason: from getter */
        public final EquityOrderCheckActionDataDto getOrder_check_action_data() {
            return this.order_check_action_data;
        }

        public final java.util.List<EquityOrderExecutionDataDto> component6() {
            return this.executions;
        }

        public final Surrogate copy(OrderFormStepDto step, EquityOrderPayloadDto payload, EquityOrderMetaDto meta, EquityOrderCheckDataDto order_check_data, EquityOrderCheckActionDataDto order_check_action_data, java.util.List<EquityOrderExecutionDataDto> executions) {
            Intrinsics.checkNotNullParameter(step, "step");
            Intrinsics.checkNotNullParameter(executions, "executions");
            return new Surrogate(step, payload, meta, order_check_data, order_check_action_data, executions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.step == surrogate.step && Intrinsics.areEqual(this.payload, surrogate.payload) && Intrinsics.areEqual(this.meta, surrogate.meta) && Intrinsics.areEqual(this.order_check_data, surrogate.order_check_data) && Intrinsics.areEqual(this.order_check_action_data, surrogate.order_check_action_data) && Intrinsics.areEqual(this.executions, surrogate.executions);
        }

        public int hashCode() {
            int iHashCode = this.step.hashCode() * 31;
            EquityOrderPayloadDto equityOrderPayloadDto = this.payload;
            int iHashCode2 = (iHashCode + (equityOrderPayloadDto == null ? 0 : equityOrderPayloadDto.hashCode())) * 31;
            EquityOrderMetaDto equityOrderMetaDto = this.meta;
            int iHashCode3 = (iHashCode2 + (equityOrderMetaDto == null ? 0 : equityOrderMetaDto.hashCode())) * 31;
            EquityOrderCheckDataDto equityOrderCheckDataDto = this.order_check_data;
            int iHashCode4 = (iHashCode3 + (equityOrderCheckDataDto == null ? 0 : equityOrderCheckDataDto.hashCode())) * 31;
            EquityOrderCheckActionDataDto equityOrderCheckActionDataDto = this.order_check_action_data;
            return ((iHashCode4 + (equityOrderCheckActionDataDto != null ? equityOrderCheckActionDataDto.hashCode() : 0)) * 31) + this.executions.hashCode();
        }

        public String toString() {
            return "Surrogate(step=" + this.step + ", payload=" + this.payload + ", meta=" + this.meta + ", order_check_data=" + this.order_check_data + ", order_check_action_data=" + this.order_check_action_data + ", executions=" + this.executions + ")";
        }

        /* compiled from: EquityOrderEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EquityOrderEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, OrderFormStepDto orderFormStepDto, EquityOrderPayloadDto equityOrderPayloadDto, EquityOrderMetaDto equityOrderMetaDto, EquityOrderCheckDataDto equityOrderCheckDataDto, EquityOrderCheckActionDataDto equityOrderCheckActionDataDto, java.util.List list, SerializationConstructorMarker serializationConstructorMarker) {
            this.step = (i & 1) == 0 ? OrderFormStepDto.INSTANCE.getZeroValue() : orderFormStepDto;
            if ((i & 2) == 0) {
                this.payload = null;
            } else {
                this.payload = equityOrderPayloadDto;
            }
            if ((i & 4) == 0) {
                this.meta = null;
            } else {
                this.meta = equityOrderMetaDto;
            }
            if ((i & 8) == 0) {
                this.order_check_data = null;
            } else {
                this.order_check_data = equityOrderCheckDataDto;
            }
            if ((i & 16) == 0) {
                this.order_check_action_data = null;
            } else {
                this.order_check_action_data = equityOrderCheckActionDataDto;
            }
            if ((i & 32) == 0) {
                this.executions = CollectionsKt.emptyList();
            } else {
                this.executions = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.step != OrderFormStepDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, OrderFormStepDto.Serializer.INSTANCE, self.step);
            }
            EquityOrderPayloadDto equityOrderPayloadDto = self.payload;
            if (equityOrderPayloadDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, EquityOrderPayloadDto.Serializer.INSTANCE, equityOrderPayloadDto);
            }
            EquityOrderMetaDto equityOrderMetaDto = self.meta;
            if (equityOrderMetaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, EquityOrderMetaDto.Serializer.INSTANCE, equityOrderMetaDto);
            }
            EquityOrderCheckDataDto equityOrderCheckDataDto = self.order_check_data;
            if (equityOrderCheckDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, EquityOrderCheckDataDto.Serializer.INSTANCE, equityOrderCheckDataDto);
            }
            EquityOrderCheckActionDataDto equityOrderCheckActionDataDto = self.order_check_action_data;
            if (equityOrderCheckActionDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, EquityOrderCheckActionDataDto.Serializer.INSTANCE, equityOrderCheckActionDataDto);
            }
            if (Intrinsics.areEqual(self.executions, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.executions);
        }

        public Surrogate(OrderFormStepDto step, EquityOrderPayloadDto equityOrderPayloadDto, EquityOrderMetaDto equityOrderMetaDto, EquityOrderCheckDataDto equityOrderCheckDataDto, EquityOrderCheckActionDataDto equityOrderCheckActionDataDto, java.util.List<EquityOrderExecutionDataDto> executions) {
            Intrinsics.checkNotNullParameter(step, "step");
            Intrinsics.checkNotNullParameter(executions, "executions");
            this.step = step;
            this.payload = equityOrderPayloadDto;
            this.meta = equityOrderMetaDto;
            this.order_check_data = equityOrderCheckDataDto;
            this.order_check_action_data = equityOrderCheckActionDataDto;
            this.executions = executions;
        }

        public final OrderFormStepDto getStep() {
            return this.step;
        }

        public /* synthetic */ Surrogate(OrderFormStepDto orderFormStepDto, EquityOrderPayloadDto equityOrderPayloadDto, EquityOrderMetaDto equityOrderMetaDto, EquityOrderCheckDataDto equityOrderCheckDataDto, EquityOrderCheckActionDataDto equityOrderCheckActionDataDto, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? OrderFormStepDto.INSTANCE.getZeroValue() : orderFormStepDto, (i & 2) != 0 ? null : equityOrderPayloadDto, (i & 4) != 0 ? null : equityOrderMetaDto, (i & 8) != 0 ? null : equityOrderCheckDataDto, (i & 16) != 0 ? null : equityOrderCheckActionDataDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final EquityOrderPayloadDto getPayload() {
            return this.payload;
        }

        public final EquityOrderMetaDto getMeta() {
            return this.meta;
        }

        public final EquityOrderCheckDataDto getOrder_check_data() {
            return this.order_check_data;
        }

        public final EquityOrderCheckActionDataDto getOrder_check_action_data() {
            return this.order_check_action_data;
        }

        public final java.util.List<EquityOrderExecutionDataDto> getExecutions() {
            return this.executions;
        }
    }

    /* compiled from: EquityOrderEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<EquityOrderEventDataDto, EquityOrderEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EquityOrderEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquityOrderEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquityOrderEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) EquityOrderEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EquityOrderEventData> getProtoAdapter() {
            return EquityOrderEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquityOrderEventDataDto getZeroValue() {
            return EquityOrderEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquityOrderEventDataDto fromProto(EquityOrderEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            OrderFormStepDto orderFormStepDtoFromProto = OrderFormStepDto.INSTANCE.fromProto(proto.getStep());
            EquityOrderPayload payload = proto.getPayload();
            DefaultConstructorMarker defaultConstructorMarker = null;
            EquityOrderPayloadDto equityOrderPayloadDtoFromProto = payload != null ? EquityOrderPayloadDto.INSTANCE.fromProto(payload) : null;
            EquityOrderMeta meta = proto.getMeta();
            EquityOrderMetaDto equityOrderMetaDtoFromProto = meta != null ? EquityOrderMetaDto.INSTANCE.fromProto(meta) : null;
            EquityOrderCheckData order_check_data = proto.getOrder_check_data();
            EquityOrderCheckDataDto equityOrderCheckDataDtoFromProto = order_check_data != null ? EquityOrderCheckDataDto.INSTANCE.fromProto(order_check_data) : null;
            EquityOrderCheckActionData order_check_action_data = proto.getOrder_check_action_data();
            EquityOrderCheckActionDataDto equityOrderCheckActionDataDtoFromProto = order_check_action_data != null ? EquityOrderCheckActionDataDto.INSTANCE.fromProto(order_check_action_data) : null;
            java.util.List<EquityOrderExecutionData> executions = proto.getExecutions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(executions, 10));
            Iterator<T> it = executions.iterator();
            while (it.hasNext()) {
                arrayList.add(EquityOrderExecutionDataDto.INSTANCE.fromProto((EquityOrderExecutionData) it.next()));
            }
            return new EquityOrderEventDataDto(new Surrogate(orderFormStepDtoFromProto, equityOrderPayloadDtoFromProto, equityOrderMetaDtoFromProto, equityOrderCheckDataDtoFromProto, equityOrderCheckActionDataDtoFromProto, arrayList), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.EquityOrderEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityOrderEventDataDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new EquityOrderEventDataDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EquityOrderEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<EquityOrderEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.EquityOrderEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EquityOrderEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EquityOrderEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EquityOrderEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EquityOrderEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EquityOrderEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.EquityOrderEventDataDto";
        }
    }
}
