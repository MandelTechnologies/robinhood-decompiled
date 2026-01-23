package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.P2PContext;
import com.robinhood.rosetta.eventlogging.P2PContextDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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

/* compiled from: P2PContextDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006,-./01B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0004\b\u0006\u0010\u0012J>\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/P2PContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/P2PContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/P2PContextDto$Surrogate;)V", "direction", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$DirectionDto;", "target_type", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;", "amount", "", "search_query", "", "target_types", "", "(Lcom/robinhood/rosetta/eventlogging/P2PContextDto$DirectionDto;Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;FLjava/lang/String;Ljava/util/List;)V", "getDirection", "()Lcom/robinhood/rosetta/eventlogging/P2PContextDto$DirectionDto;", "getTarget_type", "()Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;", "getAmount", "()F", "getSearch_query", "()Ljava/lang/String;", "getTarget_types", "()Ljava/util/List;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "DirectionDto", "TargetTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class P2PContextDto implements Dto3<P2PContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<P2PContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<P2PContextDto, P2PContext>> binaryBase64Serializer$delegate;
    private static final P2PContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ P2PContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private P2PContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DirectionDto getDirection() {
        return this.surrogate.getDirection();
    }

    public final TargetTypeDto getTarget_type() {
        return this.surrogate.getTarget_type();
    }

    public final float getAmount() {
        return this.surrogate.getAmount();
    }

    public final String getSearch_query() {
        return this.surrogate.getSearch_query();
    }

    public final java.util.List<TargetTypeDto> getTarget_types() {
        return this.surrogate.getTarget_types();
    }

    public /* synthetic */ P2PContextDto(DirectionDto directionDto, TargetTypeDto targetTypeDto, float f, String str, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 2) != 0 ? TargetTypeDto.INSTANCE.getZeroValue() : targetTypeDto, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public P2PContextDto(DirectionDto direction, TargetTypeDto target_type, float f, String search_query, java.util.List<? extends TargetTypeDto> target_types) {
        this(new Surrogate(direction, target_type, f, search_query, target_types));
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(target_type, "target_type");
        Intrinsics.checkNotNullParameter(search_query, "search_query");
        Intrinsics.checkNotNullParameter(target_types, "target_types");
    }

    public static /* synthetic */ P2PContextDto copy$default(P2PContextDto p2PContextDto, DirectionDto directionDto, TargetTypeDto targetTypeDto, float f, String str, java.util.List list, int i, Object obj) {
        if ((i & 1) != 0) {
            directionDto = p2PContextDto.surrogate.getDirection();
        }
        if ((i & 2) != 0) {
            targetTypeDto = p2PContextDto.surrogate.getTarget_type();
        }
        if ((i & 4) != 0) {
            f = p2PContextDto.surrogate.getAmount();
        }
        if ((i & 8) != 0) {
            str = p2PContextDto.surrogate.getSearch_query();
        }
        if ((i & 16) != 0) {
            list = p2PContextDto.surrogate.getTarget_types();
        }
        java.util.List list2 = list;
        float f2 = f;
        return p2PContextDto.copy(directionDto, targetTypeDto, f2, str, list2);
    }

    public final P2PContextDto copy(DirectionDto direction, TargetTypeDto target_type, float amount, String search_query, java.util.List<? extends TargetTypeDto> target_types) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(target_type, "target_type");
        Intrinsics.checkNotNullParameter(search_query, "search_query");
        Intrinsics.checkNotNullParameter(target_types, "target_types");
        return new P2PContextDto(new Surrogate(direction, target_type, amount, search_query, target_types));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public P2PContext toProto() {
        P2PContext.Direction direction = (P2PContext.Direction) this.surrogate.getDirection().toProto();
        P2PContext.TargetType targetType = (P2PContext.TargetType) this.surrogate.getTarget_type().toProto();
        float amount = this.surrogate.getAmount();
        String search_query = this.surrogate.getSearch_query();
        java.util.List<TargetTypeDto> target_types = this.surrogate.getTarget_types();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(target_types, 10));
        Iterator<T> it = target_types.iterator();
        while (it.hasNext()) {
            arrayList.add((P2PContext.TargetType) ((TargetTypeDto) it.next()).toProto());
        }
        return new P2PContext(direction, targetType, amount, search_query, arrayList, null, 32, null);
    }

    public String toString() {
        return "[P2PContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof P2PContextDto) && Intrinsics.areEqual(((P2PContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: P2PContextDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u00029:BN\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\u0004\b\u000f\u0010\u0010BQ\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u0018\u0010(\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eHÆ\u0003JP\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0012HÖ\u0001J\t\u00100\u001a\u00020\fHÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\"R\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010%¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/P2PContextDto$Surrogate;", "", "direction", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$DirectionDto;", "target_type", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;", "amount", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "search_query", "", "target_types", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/P2PContextDto$DirectionDto;Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;FLjava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/P2PContextDto$DirectionDto;Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;FLjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDirection$annotations", "()V", "getDirection", "()Lcom/robinhood/rosetta/eventlogging/P2PContextDto$DirectionDto;", "getTarget_type$annotations", "getTarget_type", "()Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;", "getAmount$annotations", "getAmount", "()F", "getSearch_query$annotations", "getSearch_query", "()Ljava/lang/String;", "getTarget_types$annotations", "getTarget_types", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final float amount;
        private final DirectionDto direction;
        private final String search_query;
        private final TargetTypeDto target_type;
        private final java.util.List<TargetTypeDto> target_types;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.eventlogging.P2PContextDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PContextDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((DirectionDto) null, (TargetTypeDto) null, 0.0f, (String) null, (java.util.List) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(TargetTypeDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, DirectionDto directionDto, TargetTypeDto targetTypeDto, float f, String str, java.util.List list, int i, Object obj) {
            if ((i & 1) != 0) {
                directionDto = surrogate.direction;
            }
            if ((i & 2) != 0) {
                targetTypeDto = surrogate.target_type;
            }
            if ((i & 4) != 0) {
                f = surrogate.amount;
            }
            if ((i & 8) != 0) {
                str = surrogate.search_query;
            }
            if ((i & 16) != 0) {
                list = surrogate.target_types;
            }
            java.util.List list2 = list;
            float f2 = f;
            return surrogate.copy(directionDto, targetTypeDto, f2, str, list2);
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("direction")
        @JsonAnnotations2(names = {"direction"})
        public static /* synthetic */ void getDirection$annotations() {
        }

        @SerialName("searchQuery")
        @JsonAnnotations2(names = {"search_query"})
        public static /* synthetic */ void getSearch_query$annotations() {
        }

        @SerialName("targetType")
        @JsonAnnotations2(names = {"target_type"})
        public static /* synthetic */ void getTarget_type$annotations() {
        }

        @SerialName("targetTypes")
        @JsonAnnotations2(names = {"target_types"})
        public static /* synthetic */ void getTarget_types$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final DirectionDto getDirection() {
            return this.direction;
        }

        /* renamed from: component2, reason: from getter */
        public final TargetTypeDto getTarget_type() {
            return this.target_type;
        }

        /* renamed from: component3, reason: from getter */
        public final float getAmount() {
            return this.amount;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSearch_query() {
            return this.search_query;
        }

        public final java.util.List<TargetTypeDto> component5() {
            return this.target_types;
        }

        public final Surrogate copy(DirectionDto direction, TargetTypeDto target_type, float amount, String search_query, java.util.List<? extends TargetTypeDto> target_types) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(target_type, "target_type");
            Intrinsics.checkNotNullParameter(search_query, "search_query");
            Intrinsics.checkNotNullParameter(target_types, "target_types");
            return new Surrogate(direction, target_type, amount, search_query, target_types);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.direction == surrogate.direction && this.target_type == surrogate.target_type && Float.compare(this.amount, surrogate.amount) == 0 && Intrinsics.areEqual(this.search_query, surrogate.search_query) && Intrinsics.areEqual(this.target_types, surrogate.target_types);
        }

        public int hashCode() {
            return (((((((this.direction.hashCode() * 31) + this.target_type.hashCode()) * 31) + Float.hashCode(this.amount)) * 31) + this.search_query.hashCode()) * 31) + this.target_types.hashCode();
        }

        public String toString() {
            return "Surrogate(direction=" + this.direction + ", target_type=" + this.target_type + ", amount=" + this.amount + ", search_query=" + this.search_query + ", target_types=" + this.target_types + ")";
        }

        /* compiled from: P2PContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/P2PContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return P2PContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DirectionDto directionDto, TargetTypeDto targetTypeDto, float f, String str, java.util.List list, SerializationConstructorMarker serializationConstructorMarker) {
            this.direction = (i & 1) == 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto;
            if ((i & 2) == 0) {
                this.target_type = TargetTypeDto.INSTANCE.getZeroValue();
            } else {
                this.target_type = targetTypeDto;
            }
            if ((i & 4) == 0) {
                this.amount = 0.0f;
            } else {
                this.amount = f;
            }
            if ((i & 8) == 0) {
                this.search_query = "";
            } else {
                this.search_query = str;
            }
            if ((i & 16) == 0) {
                this.target_types = CollectionsKt.emptyList();
            } else {
                this.target_types = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.direction != DirectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, DirectionDto.Serializer.INSTANCE, self.direction);
            }
            if (self.target_type != TargetTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, TargetTypeDto.Serializer.INSTANCE, self.target_type);
            }
            if (Float.compare(self.amount, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 2, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.amount));
            }
            if (!Intrinsics.areEqual(self.search_query, "")) {
                output.encodeStringElement(serialDesc, 3, self.search_query);
            }
            if (Intrinsics.areEqual(self.target_types, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.target_types);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(DirectionDto direction, TargetTypeDto target_type, float f, String search_query, java.util.List<? extends TargetTypeDto> target_types) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(target_type, "target_type");
            Intrinsics.checkNotNullParameter(search_query, "search_query");
            Intrinsics.checkNotNullParameter(target_types, "target_types");
            this.direction = direction;
            this.target_type = target_type;
            this.amount = f;
            this.search_query = search_query;
            this.target_types = target_types;
        }

        public final DirectionDto getDirection() {
            return this.direction;
        }

        public /* synthetic */ Surrogate(DirectionDto directionDto, TargetTypeDto targetTypeDto, float f, String str, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? DirectionDto.INSTANCE.getZeroValue() : directionDto, (i & 2) != 0 ? TargetTypeDto.INSTANCE.getZeroValue() : targetTypeDto, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final TargetTypeDto getTarget_type() {
            return this.target_type;
        }

        public final float getAmount() {
            return this.amount;
        }

        public final String getSearch_query() {
            return this.search_query;
        }

        public final java.util.List<TargetTypeDto> getTarget_types() {
            return this.target_types;
        }
    }

    /* compiled from: P2PContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/P2PContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto;", "Lcom/robinhood/rosetta/eventlogging/P2PContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/P2PContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<P2PContextDto, P2PContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<P2PContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<P2PContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<P2PContextDto> getBinaryBase64Serializer() {
            return (KSerializer) P2PContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<P2PContext> getProtoAdapter() {
            return P2PContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public P2PContextDto getZeroValue() {
            return P2PContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public P2PContextDto fromProto(P2PContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            DirectionDto directionDtoFromProto = DirectionDto.INSTANCE.fromProto(proto.getDirection());
            TargetTypeDto targetTypeDtoFromProto = TargetTypeDto.INSTANCE.fromProto(proto.getTarget_type());
            float amount = proto.getAmount();
            String search_query = proto.getSearch_query();
            java.util.List<P2PContext.TargetType> target_types = proto.getTarget_types();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(target_types, 10));
            Iterator<T> it = target_types.iterator();
            while (it.hasNext()) {
                arrayList.add(TargetTypeDto.INSTANCE.fromProto((P2PContext.TargetType) it.next()));
            }
            return new P2PContextDto(new Surrogate(directionDtoFromProto, targetTypeDtoFromProto, amount, search_query, arrayList), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.P2PContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PContextDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new P2PContextDto(null, null, 0.0f, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: P2PContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/P2PContextDto$DirectionDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/P2PContext$Direction;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DIRECTION_UNSPECIFIED", "PAY", "REQUEST", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DirectionDto implements Dto2<P2PContext.Direction>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DirectionDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<DirectionDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final DirectionDto DIRECTION_UNSPECIFIED = new DIRECTION_UNSPECIFIED("DIRECTION_UNSPECIFIED", 0);
        public static final DirectionDto PAY = new PAY("PAY", 1);
        public static final DirectionDto REQUEST = new REQUEST("REQUEST", 2);
        private static final Lazy<BinaryBase64DtoSerializer<DirectionDto, P2PContext.Direction>> binaryBase64Serializer$delegate;

        private static final /* synthetic */ DirectionDto[] $values() {
            return new DirectionDto[]{DIRECTION_UNSPECIFIED, PAY, REQUEST};
        }

        public /* synthetic */ DirectionDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<DirectionDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: P2PContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/P2PContextDto.DirectionDto.DIRECTION_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/P2PContext$Direction;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DIRECTION_UNSPECIFIED extends DirectionDto {
            DIRECTION_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public P2PContext.Direction toProto() {
                return P2PContext.Direction.DIRECTION_UNSPECIFIED;
            }
        }

        private DirectionDto(String str, int i) {
        }

        static {
            DirectionDto[] directionDtoArr$values = $values();
            $VALUES = directionDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(directionDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.P2PContextDto$DirectionDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PContextDto.DirectionDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: P2PContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/P2PContextDto.DirectionDto.PAY", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/P2PContext$Direction;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PAY extends DirectionDto {
            PAY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public P2PContext.Direction toProto() {
                return P2PContext.Direction.PAY;
            }
        }

        /* compiled from: P2PContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/P2PContextDto.DirectionDto.REQUEST", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$DirectionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/P2PContext$Direction;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REQUEST extends DirectionDto {
            REQUEST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public P2PContext.Direction toProto() {
                return P2PContext.Direction.REQUEST;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: P2PContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/P2PContextDto$DirectionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$DirectionDto;", "Lcom/robinhood/rosetta/eventlogging/P2PContext$Direction;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/P2PContextDto$DirectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<DirectionDto, P2PContext.Direction> {

            /* compiled from: P2PContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[P2PContext.Direction.values().length];
                    try {
                        iArr[P2PContext.Direction.DIRECTION_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[P2PContext.Direction.PAY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[P2PContext.Direction.REQUEST.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<DirectionDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DirectionDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DirectionDto> getBinaryBase64Serializer() {
                return (KSerializer) DirectionDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<P2PContext.Direction> getProtoAdapter() {
                return P2PContext.Direction.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DirectionDto getZeroValue() {
                return DirectionDto.DIRECTION_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DirectionDto fromProto(P2PContext.Direction proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return DirectionDto.DIRECTION_UNSPECIFIED;
                }
                if (i == 2) {
                    return DirectionDto.PAY;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return DirectionDto.REQUEST;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: P2PContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/P2PContextDto$DirectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$DirectionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<DirectionDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<DirectionDto, P2PContext.Direction> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.P2PContext.Direction", DirectionDto.getEntries(), DirectionDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public DirectionDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (DirectionDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DirectionDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static DirectionDto valueOf(String str) {
            return (DirectionDto) Enum.valueOf(DirectionDto.class, str);
        }

        public static DirectionDto[] values() {
            return (DirectionDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: P2PContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/P2PContext$TargetType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TARGET_TYPE_UNSPECIFIED", "RH_USER", "CONNECTION", "OFF_NETWORK_EMAIL", "OFF_NETWORK_PHONE", "CONTACT_PHONE", "CONTACT_EMAIL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TargetTypeDto implements Dto2<P2PContext.TargetType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TargetTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TargetTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TargetTypeDto, P2PContext.TargetType>> binaryBase64Serializer$delegate;
        public static final TargetTypeDto TARGET_TYPE_UNSPECIFIED = new TARGET_TYPE_UNSPECIFIED("TARGET_TYPE_UNSPECIFIED", 0);
        public static final TargetTypeDto RH_USER = new RH_USER("RH_USER", 1);
        public static final TargetTypeDto CONNECTION = new CONNECTION("CONNECTION", 2);
        public static final TargetTypeDto OFF_NETWORK_EMAIL = new OFF_NETWORK_EMAIL("OFF_NETWORK_EMAIL", 3);
        public static final TargetTypeDto OFF_NETWORK_PHONE = new OFF_NETWORK_PHONE("OFF_NETWORK_PHONE", 4);
        public static final TargetTypeDto CONTACT_PHONE = new CONTACT_PHONE("CONTACT_PHONE", 5);
        public static final TargetTypeDto CONTACT_EMAIL = new CONTACT_EMAIL("CONTACT_EMAIL", 6);

        private static final /* synthetic */ TargetTypeDto[] $values() {
            return new TargetTypeDto[]{TARGET_TYPE_UNSPECIFIED, RH_USER, CONNECTION, OFF_NETWORK_EMAIL, OFF_NETWORK_PHONE, CONTACT_PHONE, CONTACT_EMAIL};
        }

        public /* synthetic */ TargetTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TargetTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: P2PContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/P2PContextDto.TargetTypeDto.TARGET_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/P2PContext$TargetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TARGET_TYPE_UNSPECIFIED extends TargetTypeDto {
            TARGET_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public P2PContext.TargetType toProto() {
                return P2PContext.TargetType.TARGET_TYPE_UNSPECIFIED;
            }
        }

        private TargetTypeDto(String str, int i) {
        }

        static {
            TargetTypeDto[] targetTypeDtoArr$values = $values();
            $VALUES = targetTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(targetTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.P2PContextDto$TargetTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return P2PContextDto.TargetTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: P2PContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/P2PContextDto.TargetTypeDto.RH_USER", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/P2PContext$TargetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RH_USER extends TargetTypeDto {
            RH_USER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public P2PContext.TargetType toProto() {
                return P2PContext.TargetType.RH_USER;
            }
        }

        /* compiled from: P2PContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/P2PContextDto.TargetTypeDto.CONNECTION", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/P2PContext$TargetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONNECTION extends TargetTypeDto {
            CONNECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public P2PContext.TargetType toProto() {
                return P2PContext.TargetType.CONNECTION;
            }
        }

        /* compiled from: P2PContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/P2PContextDto.TargetTypeDto.OFF_NETWORK_EMAIL", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/P2PContext$TargetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OFF_NETWORK_EMAIL extends TargetTypeDto {
            OFF_NETWORK_EMAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public P2PContext.TargetType toProto() {
                return P2PContext.TargetType.OFF_NETWORK_EMAIL;
            }
        }

        /* compiled from: P2PContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/P2PContextDto.TargetTypeDto.OFF_NETWORK_PHONE", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/P2PContext$TargetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OFF_NETWORK_PHONE extends TargetTypeDto {
            OFF_NETWORK_PHONE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public P2PContext.TargetType toProto() {
                return P2PContext.TargetType.OFF_NETWORK_PHONE;
            }
        }

        /* compiled from: P2PContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/P2PContextDto.TargetTypeDto.CONTACT_PHONE", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/P2PContext$TargetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONTACT_PHONE extends TargetTypeDto {
            CONTACT_PHONE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public P2PContext.TargetType toProto() {
                return P2PContext.TargetType.CONTACT_PHONE;
            }
        }

        /* compiled from: P2PContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/P2PContextDto.TargetTypeDto.CONTACT_EMAIL", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/P2PContext$TargetType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONTACT_EMAIL extends TargetTypeDto {
            CONTACT_EMAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public P2PContext.TargetType toProto() {
                return P2PContext.TargetType.CONTACT_EMAIL;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: P2PContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;", "Lcom/robinhood/rosetta/eventlogging/P2PContext$TargetType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TargetTypeDto, P2PContext.TargetType> {

            /* compiled from: P2PContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[P2PContext.TargetType.values().length];
                    try {
                        iArr[P2PContext.TargetType.TARGET_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[P2PContext.TargetType.RH_USER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[P2PContext.TargetType.CONNECTION.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[P2PContext.TargetType.OFF_NETWORK_EMAIL.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[P2PContext.TargetType.OFF_NETWORK_PHONE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[P2PContext.TargetType.CONTACT_PHONE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[P2PContext.TargetType.CONTACT_EMAIL.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TargetTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TargetTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TargetTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) TargetTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<P2PContext.TargetType> getProtoAdapter() {
                return P2PContext.TargetType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TargetTypeDto getZeroValue() {
                return TargetTypeDto.TARGET_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TargetTypeDto fromProto(P2PContext.TargetType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return TargetTypeDto.TARGET_TYPE_UNSPECIFIED;
                    case 2:
                        return TargetTypeDto.RH_USER;
                    case 3:
                        return TargetTypeDto.CONNECTION;
                    case 4:
                        return TargetTypeDto.OFF_NETWORK_EMAIL;
                    case 5:
                        return TargetTypeDto.OFF_NETWORK_PHONE;
                    case 6:
                        return TargetTypeDto.CONTACT_PHONE;
                    case 7:
                        return TargetTypeDto.CONTACT_EMAIL;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: P2PContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$TargetTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TargetTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TargetTypeDto, P2PContext.TargetType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.P2PContext.TargetType", TargetTypeDto.getEntries(), TargetTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TargetTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TargetTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TargetTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TargetTypeDto valueOf(String str) {
            return (TargetTypeDto) Enum.valueOf(TargetTypeDto.class, str);
        }

        public static TargetTypeDto[] values() {
            return (TargetTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: P2PContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/P2PContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/P2PContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<P2PContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.P2PContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, P2PContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public P2PContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new P2PContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: P2PContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/P2PContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.P2PContextDto";
        }
    }
}
