package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.OptionsChainCustomizationContextDto;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.option.StrategyName;
import rosetta.option.StrategyNameDto;

/* compiled from: OptionsChainCustomizationContextDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004./01B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B_\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012¢\u0006\u0004\b\u0006\u0010\u0013J\\\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\tH\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020'H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00128F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsChainCustomizationContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/OptionsChainCustomizationContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/OptionsChainCustomizationContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OptionsChainCustomizationContextDto$Surrogate;)V", "order_side", "", "strategy", "Lrosetta/option/StrategyNameDto;", "selected_category", "previous_metric_one", "previous_metric_two", "metric_one", "metric_two", "metrics", "", "(Ljava/lang/String;Lrosetta/option/StrategyNameDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getOrder_side", "()Ljava/lang/String;", "getStrategy", "()Lrosetta/option/StrategyNameDto;", "getSelected_category", "getPrevious_metric_one", "getPrevious_metric_two", "getMetric_one", "getMetric_two", "getMetrics", "()Ljava/util/List;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class OptionsChainCustomizationContextDto implements Dto3<OptionsChainCustomizationContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OptionsChainCustomizationContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OptionsChainCustomizationContextDto, OptionsChainCustomizationContext>> binaryBase64Serializer$delegate;
    private static final OptionsChainCustomizationContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OptionsChainCustomizationContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OptionsChainCustomizationContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getOrder_side() {
        return this.surrogate.getOrder_side();
    }

    public final StrategyNameDto getStrategy() {
        return this.surrogate.getStrategy();
    }

    public final String getSelected_category() {
        return this.surrogate.getSelected_category();
    }

    public final String getPrevious_metric_one() {
        return this.surrogate.getPrevious_metric_one();
    }

    public final String getPrevious_metric_two() {
        return this.surrogate.getPrevious_metric_two();
    }

    public final String getMetric_one() {
        return this.surrogate.getMetric_one();
    }

    public final String getMetric_two() {
        return this.surrogate.getMetric_two();
    }

    public final java.util.List<String> getMetrics() {
        return this.surrogate.getMetrics();
    }

    public /* synthetic */ OptionsChainCustomizationContextDto(String str, StrategyNameDto strategyNameDto, String str2, String str3, String str4, String str5, String str6, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? StrategyNameDto.INSTANCE.getZeroValue() : strategyNameDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionsChainCustomizationContextDto(String order_side, StrategyNameDto strategy, String selected_category, String previous_metric_one, String previous_metric_two, String metric_one, String metric_two, java.util.List<String> metrics) {
        this(new Surrogate(order_side, strategy, selected_category, previous_metric_one, previous_metric_two, metric_one, metric_two, metrics));
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(selected_category, "selected_category");
        Intrinsics.checkNotNullParameter(previous_metric_one, "previous_metric_one");
        Intrinsics.checkNotNullParameter(previous_metric_two, "previous_metric_two");
        Intrinsics.checkNotNullParameter(metric_one, "metric_one");
        Intrinsics.checkNotNullParameter(metric_two, "metric_two");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
    }

    public static /* synthetic */ OptionsChainCustomizationContextDto copy$default(OptionsChainCustomizationContextDto optionsChainCustomizationContextDto, String str, StrategyNameDto strategyNameDto, String str2, String str3, String str4, String str5, String str6, java.util.List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionsChainCustomizationContextDto.surrogate.getOrder_side();
        }
        if ((i & 2) != 0) {
            strategyNameDto = optionsChainCustomizationContextDto.surrogate.getStrategy();
        }
        if ((i & 4) != 0) {
            str2 = optionsChainCustomizationContextDto.surrogate.getSelected_category();
        }
        if ((i & 8) != 0) {
            str3 = optionsChainCustomizationContextDto.surrogate.getPrevious_metric_one();
        }
        if ((i & 16) != 0) {
            str4 = optionsChainCustomizationContextDto.surrogate.getPrevious_metric_two();
        }
        if ((i & 32) != 0) {
            str5 = optionsChainCustomizationContextDto.surrogate.getMetric_one();
        }
        if ((i & 64) != 0) {
            str6 = optionsChainCustomizationContextDto.surrogate.getMetric_two();
        }
        if ((i & 128) != 0) {
            list = optionsChainCustomizationContextDto.surrogate.getMetrics();
        }
        String str7 = str6;
        java.util.List list2 = list;
        String str8 = str4;
        String str9 = str5;
        return optionsChainCustomizationContextDto.copy(str, strategyNameDto, str2, str3, str8, str9, str7, list2);
    }

    public final OptionsChainCustomizationContextDto copy(String order_side, StrategyNameDto strategy, String selected_category, String previous_metric_one, String previous_metric_two, String metric_one, String metric_two, java.util.List<String> metrics) {
        Intrinsics.checkNotNullParameter(order_side, "order_side");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(selected_category, "selected_category");
        Intrinsics.checkNotNullParameter(previous_metric_one, "previous_metric_one");
        Intrinsics.checkNotNullParameter(previous_metric_two, "previous_metric_two");
        Intrinsics.checkNotNullParameter(metric_one, "metric_one");
        Intrinsics.checkNotNullParameter(metric_two, "metric_two");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return new OptionsChainCustomizationContextDto(new Surrogate(order_side, strategy, selected_category, previous_metric_one, previous_metric_two, metric_one, metric_two, metrics));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OptionsChainCustomizationContext toProto() {
        String order_side = this.surrogate.getOrder_side();
        StrategyName strategyName = (StrategyName) this.surrogate.getStrategy().toProto();
        String selected_category = this.surrogate.getSelected_category();
        String previous_metric_one = this.surrogate.getPrevious_metric_one();
        String previous_metric_two = this.surrogate.getPrevious_metric_two();
        String metric_one = this.surrogate.getMetric_one();
        String metric_two = this.surrogate.getMetric_two();
        java.util.List<String> metrics = this.surrogate.getMetrics();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(metrics, 10));
        Iterator<T> it = metrics.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new OptionsChainCustomizationContext(order_side, strategyName, selected_category, previous_metric_one, previous_metric_two, metric_one, metric_two, arrayList, null, 256, null);
    }

    public String toString() {
        return "[OptionsChainCustomizationContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OptionsChainCustomizationContextDto) && Intrinsics.areEqual(((OptionsChainCustomizationContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: OptionsChainCustomizationContextDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ?2\u00020\u0001:\u0002>?B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0004\b\r\u0010\u000eBq\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J_\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0010HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001J%\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0001¢\u0006\u0002\b=R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u0017R\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0017R\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010'¨\u0006@"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsChainCustomizationContextDto$Surrogate;", "", "order_side", "", "strategy", "Lrosetta/option/StrategyNameDto;", "selected_category", "previous_metric_one", "previous_metric_two", "metric_one", "metric_two", "metrics", "", "<init>", "(Ljava/lang/String;Lrosetta/option/StrategyNameDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lrosetta/option/StrategyNameDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOrder_side$annotations", "()V", "getOrder_side", "()Ljava/lang/String;", "getStrategy$annotations", "getStrategy", "()Lrosetta/option/StrategyNameDto;", "getSelected_category$annotations", "getSelected_category", "getPrevious_metric_one$annotations", "getPrevious_metric_one", "getPrevious_metric_two$annotations", "getPrevious_metric_two", "getMetric_one$annotations", "getMetric_one", "getMetric_two$annotations", "getMetric_two", "getMetrics$annotations", "getMetrics", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String metric_one;
        private final String metric_two;
        private final java.util.List<String> metrics;
        private final String order_side;
        private final String previous_metric_one;
        private final String previous_metric_two;
        private final String selected_category;
        private final StrategyNameDto strategy;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.eventlogging.OptionsChainCustomizationContextDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsChainCustomizationContextDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (StrategyNameDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, (java.util.List) null, 255, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, StrategyNameDto strategyNameDto, String str2, String str3, String str4, String str5, String str6, java.util.List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.order_side;
            }
            if ((i & 2) != 0) {
                strategyNameDto = surrogate.strategy;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.selected_category;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.previous_metric_one;
            }
            if ((i & 16) != 0) {
                str4 = surrogate.previous_metric_two;
            }
            if ((i & 32) != 0) {
                str5 = surrogate.metric_one;
            }
            if ((i & 64) != 0) {
                str6 = surrogate.metric_two;
            }
            if ((i & 128) != 0) {
                list = surrogate.metrics;
            }
            String str7 = str6;
            java.util.List list2 = list;
            String str8 = str4;
            String str9 = str5;
            return surrogate.copy(str, strategyNameDto, str2, str3, str8, str9, str7, list2);
        }

        @SerialName("metricOne")
        @JsonAnnotations2(names = {"metric_one"})
        public static /* synthetic */ void getMetric_one$annotations() {
        }

        @SerialName("metricTwo")
        @JsonAnnotations2(names = {"metric_two"})
        public static /* synthetic */ void getMetric_two$annotations() {
        }

        @SerialName("metrics")
        @JsonAnnotations2(names = {"metrics"})
        public static /* synthetic */ void getMetrics$annotations() {
        }

        @SerialName("orderSide")
        @JsonAnnotations2(names = {"order_side"})
        public static /* synthetic */ void getOrder_side$annotations() {
        }

        @SerialName("previousMetricOne")
        @JsonAnnotations2(names = {"previous_metric_one"})
        public static /* synthetic */ void getPrevious_metric_one$annotations() {
        }

        @SerialName("previousMetricTwo")
        @JsonAnnotations2(names = {"previous_metric_two"})
        public static /* synthetic */ void getPrevious_metric_two$annotations() {
        }

        @SerialName("selectedCategory")
        @JsonAnnotations2(names = {"selected_category"})
        public static /* synthetic */ void getSelected_category$annotations() {
        }

        @SerialName("strategy")
        @JsonAnnotations2(names = {"strategy"})
        public static /* synthetic */ void getStrategy$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getOrder_side() {
            return this.order_side;
        }

        /* renamed from: component2, reason: from getter */
        public final StrategyNameDto getStrategy() {
            return this.strategy;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSelected_category() {
            return this.selected_category;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPrevious_metric_one() {
            return this.previous_metric_one;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPrevious_metric_two() {
            return this.previous_metric_two;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMetric_one() {
            return this.metric_one;
        }

        /* renamed from: component7, reason: from getter */
        public final String getMetric_two() {
            return this.metric_two;
        }

        public final java.util.List<String> component8() {
            return this.metrics;
        }

        public final Surrogate copy(String order_side, StrategyNameDto strategy, String selected_category, String previous_metric_one, String previous_metric_two, String metric_one, String metric_two, java.util.List<String> metrics) {
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            Intrinsics.checkNotNullParameter(selected_category, "selected_category");
            Intrinsics.checkNotNullParameter(previous_metric_one, "previous_metric_one");
            Intrinsics.checkNotNullParameter(previous_metric_two, "previous_metric_two");
            Intrinsics.checkNotNullParameter(metric_one, "metric_one");
            Intrinsics.checkNotNullParameter(metric_two, "metric_two");
            Intrinsics.checkNotNullParameter(metrics, "metrics");
            return new Surrogate(order_side, strategy, selected_category, previous_metric_one, previous_metric_two, metric_one, metric_two, metrics);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_side, surrogate.order_side) && this.strategy == surrogate.strategy && Intrinsics.areEqual(this.selected_category, surrogate.selected_category) && Intrinsics.areEqual(this.previous_metric_one, surrogate.previous_metric_one) && Intrinsics.areEqual(this.previous_metric_two, surrogate.previous_metric_two) && Intrinsics.areEqual(this.metric_one, surrogate.metric_one) && Intrinsics.areEqual(this.metric_two, surrogate.metric_two) && Intrinsics.areEqual(this.metrics, surrogate.metrics);
        }

        public int hashCode() {
            return (((((((((((((this.order_side.hashCode() * 31) + this.strategy.hashCode()) * 31) + this.selected_category.hashCode()) * 31) + this.previous_metric_one.hashCode()) * 31) + this.previous_metric_two.hashCode()) * 31) + this.metric_one.hashCode()) * 31) + this.metric_two.hashCode()) * 31) + this.metrics.hashCode();
        }

        public String toString() {
            return "Surrogate(order_side=" + this.order_side + ", strategy=" + this.strategy + ", selected_category=" + this.selected_category + ", previous_metric_one=" + this.previous_metric_one + ", previous_metric_two=" + this.previous_metric_two + ", metric_one=" + this.metric_one + ", metric_two=" + this.metric_two + ", metrics=" + this.metrics + ")";
        }

        /* compiled from: OptionsChainCustomizationContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsChainCustomizationContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionsChainCustomizationContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OptionsChainCustomizationContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, StrategyNameDto strategyNameDto, String str2, String str3, String str4, String str5, String str6, java.util.List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.order_side = "";
            } else {
                this.order_side = str;
            }
            if ((i & 2) == 0) {
                this.strategy = StrategyNameDto.INSTANCE.getZeroValue();
            } else {
                this.strategy = strategyNameDto;
            }
            if ((i & 4) == 0) {
                this.selected_category = "";
            } else {
                this.selected_category = str2;
            }
            if ((i & 8) == 0) {
                this.previous_metric_one = "";
            } else {
                this.previous_metric_one = str3;
            }
            if ((i & 16) == 0) {
                this.previous_metric_two = "";
            } else {
                this.previous_metric_two = str4;
            }
            if ((i & 32) == 0) {
                this.metric_one = "";
            } else {
                this.metric_one = str5;
            }
            if ((i & 64) == 0) {
                this.metric_two = "";
            } else {
                this.metric_two = str6;
            }
            if ((i & 128) == 0) {
                this.metrics = CollectionsKt.emptyList();
            } else {
                this.metrics = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.order_side, "")) {
                output.encodeStringElement(serialDesc, 0, self.order_side);
            }
            if (self.strategy != StrategyNameDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, StrategyNameDto.Serializer.INSTANCE, self.strategy);
            }
            if (!Intrinsics.areEqual(self.selected_category, "")) {
                output.encodeStringElement(serialDesc, 2, self.selected_category);
            }
            if (!Intrinsics.areEqual(self.previous_metric_one, "")) {
                output.encodeStringElement(serialDesc, 3, self.previous_metric_one);
            }
            if (!Intrinsics.areEqual(self.previous_metric_two, "")) {
                output.encodeStringElement(serialDesc, 4, self.previous_metric_two);
            }
            if (!Intrinsics.areEqual(self.metric_one, "")) {
                output.encodeStringElement(serialDesc, 5, self.metric_one);
            }
            if (!Intrinsics.areEqual(self.metric_two, "")) {
                output.encodeStringElement(serialDesc, 6, self.metric_two);
            }
            if (Intrinsics.areEqual(self.metrics, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.metrics);
        }

        public Surrogate(String order_side, StrategyNameDto strategy, String selected_category, String previous_metric_one, String previous_metric_two, String metric_one, String metric_two, java.util.List<String> metrics) {
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            Intrinsics.checkNotNullParameter(selected_category, "selected_category");
            Intrinsics.checkNotNullParameter(previous_metric_one, "previous_metric_one");
            Intrinsics.checkNotNullParameter(previous_metric_two, "previous_metric_two");
            Intrinsics.checkNotNullParameter(metric_one, "metric_one");
            Intrinsics.checkNotNullParameter(metric_two, "metric_two");
            Intrinsics.checkNotNullParameter(metrics, "metrics");
            this.order_side = order_side;
            this.strategy = strategy;
            this.selected_category = selected_category;
            this.previous_metric_one = previous_metric_one;
            this.previous_metric_two = previous_metric_two;
            this.metric_one = metric_one;
            this.metric_two = metric_two;
            this.metrics = metrics;
        }

        public /* synthetic */ Surrogate(String str, StrategyNameDto strategyNameDto, String str2, String str3, String str4, String str5, String str6, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? StrategyNameDto.INSTANCE.getZeroValue() : strategyNameDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getOrder_side() {
            return this.order_side;
        }

        public final StrategyNameDto getStrategy() {
            return this.strategy;
        }

        public final String getSelected_category() {
            return this.selected_category;
        }

        public final String getPrevious_metric_one() {
            return this.previous_metric_one;
        }

        public final String getPrevious_metric_two() {
            return this.previous_metric_two;
        }

        public final String getMetric_one() {
            return this.metric_one;
        }

        public final String getMetric_two() {
            return this.metric_two;
        }

        public final java.util.List<String> getMetrics() {
            return this.metrics;
        }
    }

    /* compiled from: OptionsChainCustomizationContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsChainCustomizationContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OptionsChainCustomizationContextDto;", "Lcom/robinhood/rosetta/eventlogging/OptionsChainCustomizationContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OptionsChainCustomizationContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OptionsChainCustomizationContextDto, OptionsChainCustomizationContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OptionsChainCustomizationContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionsChainCustomizationContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionsChainCustomizationContextDto> getBinaryBase64Serializer() {
            return (KSerializer) OptionsChainCustomizationContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OptionsChainCustomizationContext> getProtoAdapter() {
            return OptionsChainCustomizationContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionsChainCustomizationContextDto getZeroValue() {
            return OptionsChainCustomizationContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionsChainCustomizationContextDto fromProto(OptionsChainCustomizationContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String order_side = proto.getOrder_side();
            StrategyNameDto strategyNameDtoFromProto = StrategyNameDto.INSTANCE.fromProto(proto.getStrategy());
            String selected_category = proto.getSelected_category();
            String previous_metric_one = proto.getPrevious_metric_one();
            String previous_metric_two = proto.getPrevious_metric_two();
            String metric_one = proto.getMetric_one();
            String metric_two = proto.getMetric_two();
            java.util.List<String> metrics = proto.getMetrics();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(metrics, 10));
            Iterator<T> it = metrics.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new OptionsChainCustomizationContextDto(new Surrogate(order_side, strategyNameDtoFromProto, selected_category, previous_metric_one, previous_metric_two, metric_one, metric_two, arrayList), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OptionsChainCustomizationContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionsChainCustomizationContextDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new OptionsChainCustomizationContextDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OptionsChainCustomizationContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsChainCustomizationContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionsChainCustomizationContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/OptionsChainCustomizationContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<OptionsChainCustomizationContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.OptionsChainCustomizationContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OptionsChainCustomizationContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OptionsChainCustomizationContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OptionsChainCustomizationContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OptionsChainCustomizationContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionsChainCustomizationContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.OptionsChainCustomizationContextDto";
        }
    }
}
