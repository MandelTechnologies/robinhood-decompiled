package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamAvailableTaxLotStrategyViewModelsResponse;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamAvailableTaxLotStrategyViewModelsResponseDto;
import nummus.p512v1.TaxLotStrategyType;
import nummus.p512v1.TaxLotStrategyTypeDto;

/* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006$#%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006)"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$Surrogate;)V", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto;", "strategy_view_models", "(Ljava/util/List;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$Surrogate;", "getStrategy_view_models", "()Ljava/util/List;", "Companion", "Surrogate", "AvailableTaxLotStrategyViewModelDto", "StartSecondaryTextContentDto", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class StreamAvailableTaxLotStrategyViewModelsResponseDto implements Dto3<StreamAvailableTaxLotStrategyViewModelsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamAvailableTaxLotStrategyViewModelsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamAvailableTaxLotStrategyViewModelsResponseDto, StreamAvailableTaxLotStrategyViewModelsResponse>> binaryBase64Serializer$delegate;
    private static final StreamAvailableTaxLotStrategyViewModelsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamAvailableTaxLotStrategyViewModelsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamAvailableTaxLotStrategyViewModelsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<AvailableTaxLotStrategyViewModelDto> getStrategy_view_models() {
        return this.surrogate.getStrategy_view_models();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamAvailableTaxLotStrategyViewModelsResponseDto(List<AvailableTaxLotStrategyViewModelDto> strategy_view_models) {
        this(new Surrogate(strategy_view_models));
        Intrinsics.checkNotNullParameter(strategy_view_models, "strategy_view_models");
    }

    public /* synthetic */ StreamAvailableTaxLotStrategyViewModelsResponseDto(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<AvailableTaxLotStrategyViewModelDto>) ((i & 1) != 0 ? CollectionsKt.emptyList() : list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public StreamAvailableTaxLotStrategyViewModelsResponse toProto() {
        List<AvailableTaxLotStrategyViewModelDto> strategy_view_models = this.surrogate.getStrategy_view_models();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(strategy_view_models, 10));
        Iterator<T> it = strategy_view_models.iterator();
        while (it.hasNext()) {
            arrayList.add(((AvailableTaxLotStrategyViewModelDto) it.next()).toProto());
        }
        return new StreamAvailableTaxLotStrategyViewModelsResponse(arrayList, null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[StreamAvailableTaxLotStrategyViewModelsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamAvailableTaxLotStrategyViewModelsResponseDto) && Intrinsics.areEqual(((StreamAvailableTaxLotStrategyViewModelsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$Surrogate;", "", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto;", "strategy_view_models", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getStrategy_view_models", "()Ljava/util/List;", "getStrategy_view_models$annotations", "()V", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<AvailableTaxLotStrategyViewModelDto> strategy_view_models;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamAvailableTaxLotStrategyViewModelsResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(AvailableTaxLotStrategyViewModelDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && Intrinsics.areEqual(this.strategy_view_models, ((Surrogate) other).strategy_view_models);
        }

        public int hashCode() {
            return this.strategy_view_models.hashCode();
        }

        public String toString() {
            return "Surrogate(strategy_view_models=" + this.strategy_view_models + ")";
        }

        /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamAvailableTaxLotStrategyViewModelsResponseDto7.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.strategy_view_models = CollectionsKt.emptyList();
            } else {
                this.strategy_view_models = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (Intrinsics.areEqual(self.strategy_view_models, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.strategy_view_models);
        }

        public Surrogate(List<AvailableTaxLotStrategyViewModelDto> strategy_view_models) {
            Intrinsics.checkNotNullParameter(strategy_view_models, "strategy_view_models");
            this.strategy_view_models = strategy_view_models;
        }

        public final List<AvailableTaxLotStrategyViewModelDto> getStrategy_view_models() {
            return this.strategy_view_models;
        }

        public /* synthetic */ Surrogate(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamAvailableTaxLotStrategyViewModelsResponseDto, StreamAvailableTaxLotStrategyViewModelsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamAvailableTaxLotStrategyViewModelsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamAvailableTaxLotStrategyViewModelsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamAvailableTaxLotStrategyViewModelsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamAvailableTaxLotStrategyViewModelsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamAvailableTaxLotStrategyViewModelsResponse> getProtoAdapter() {
            return StreamAvailableTaxLotStrategyViewModelsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamAvailableTaxLotStrategyViewModelsResponseDto getZeroValue() {
            return StreamAvailableTaxLotStrategyViewModelsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamAvailableTaxLotStrategyViewModelsResponseDto fromProto(StreamAvailableTaxLotStrategyViewModelsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel> strategy_view_models = proto.getStrategy_view_models();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(strategy_view_models, 10));
            Iterator<T> it = strategy_view_models.iterator();
            while (it.hasNext()) {
                arrayList.add(AvailableTaxLotStrategyViewModelDto.INSTANCE.fromProto((StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel) it.next()));
            }
            return new StreamAvailableTaxLotStrategyViewModelsResponseDto(new Surrogate(arrayList), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamAvailableTaxLotStrategyViewModelsResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new StreamAvailableTaxLotStrategyViewModelsResponseDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010'R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$AvailableTaxLotStrategyViewModel;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto$Surrogate;)V", "", "start_primary_text", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto;", "start_secondary_text_content", "", "is_selected", "Lnummus/v1/TaxLotStrategyTypeDto;", "strategy_type", "(Ljava/lang/String;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto;ZLnummus/v1/TaxLotStrategyTypeDto;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$AvailableTaxLotStrategyViewModel;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto$Surrogate;", "getStart_primary_text", "getStart_secondary_text_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto;", "()Z", "getStrategy_type", "()Lnummus/v1/TaxLotStrategyTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AvailableTaxLotStrategyViewModelDto implements Dto3<StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<AvailableTaxLotStrategyViewModelDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AvailableTaxLotStrategyViewModelDto, StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel>> binaryBase64Serializer$delegate;
        private static final AvailableTaxLotStrategyViewModelDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ AvailableTaxLotStrategyViewModelDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private AvailableTaxLotStrategyViewModelDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getStart_primary_text() {
            return this.surrogate.getStart_primary_text();
        }

        public final StartSecondaryTextContentDto getStart_secondary_text_content() {
            return this.surrogate.getStart_secondary_text_content();
        }

        public final boolean is_selected() {
            return this.surrogate.getIs_selected();
        }

        public final TaxLotStrategyTypeDto getStrategy_type() {
            return this.surrogate.getStrategy_type();
        }

        public /* synthetic */ AvailableTaxLotStrategyViewModelDto(String str, StartSecondaryTextContentDto startSecondaryTextContentDto, boolean z, TaxLotStrategyTypeDto taxLotStrategyTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : startSecondaryTextContentDto, (i & 4) != 0 ? false : z, (i & 8) != 0 ? TaxLotStrategyTypeDto.INSTANCE.getZeroValue() : taxLotStrategyTypeDto);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AvailableTaxLotStrategyViewModelDto(String start_primary_text, StartSecondaryTextContentDto startSecondaryTextContentDto, boolean z, TaxLotStrategyTypeDto strategy_type) {
            this(new Surrogate(start_primary_text, startSecondaryTextContentDto, z, strategy_type));
            Intrinsics.checkNotNullParameter(start_primary_text, "start_primary_text");
            Intrinsics.checkNotNullParameter(strategy_type, "strategy_type");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel toProto() {
            String start_primary_text = this.surrogate.getStart_primary_text();
            StartSecondaryTextContentDto start_secondary_text_content = this.surrogate.getStart_secondary_text_content();
            return new StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel(start_primary_text, start_secondary_text_content != null ? start_secondary_text_content.toProto() : null, this.surrogate.getIs_selected(), (TaxLotStrategyType) this.surrogate.getStrategy_type().toProto(), null, 16, null);
        }

        public String toString() {
            return "[AvailableTaxLotStrategyViewModelDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof AvailableTaxLotStrategyViewModelDto) && Intrinsics.areEqual(((AvailableTaxLotStrategyViewModelDto) other).surrogate, this.surrogate);
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
        /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBA\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b+\u0010$\u001a\u0004\b\u0007\u0010*R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b/\u0010$\u001a\u0004\b-\u0010.¨\u00062"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto$Surrogate;", "", "", "start_primary_text", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto;", "start_secondary_text_content", "", "is_selected", "Lnummus/v1/TaxLotStrategyTypeDto;", "strategy_type", "<init>", "(Ljava/lang/String;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto;ZLnummus/v1/TaxLotStrategyTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto;ZLnummus/v1/TaxLotStrategyTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStart_primary_text", "getStart_primary_text$annotations", "()V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto;", "getStart_secondary_text_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto;", "getStart_secondary_text_content$annotations", "Z", "()Z", "is_selected$annotations", "Lnummus/v1/TaxLotStrategyTypeDto;", "getStrategy_type", "()Lnummus/v1/TaxLotStrategyTypeDto;", "getStrategy_type$annotations", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final boolean is_selected;
            private final String start_primary_text;
            private final StartSecondaryTextContentDto start_secondary_text_content;
            private final TaxLotStrategyTypeDto strategy_type;

            public Surrogate() {
                this((String) null, (StartSecondaryTextContentDto) null, false, (TaxLotStrategyTypeDto) null, 15, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.start_primary_text, surrogate.start_primary_text) && Intrinsics.areEqual(this.start_secondary_text_content, surrogate.start_secondary_text_content) && this.is_selected == surrogate.is_selected && this.strategy_type == surrogate.strategy_type;
            }

            public int hashCode() {
                int iHashCode = this.start_primary_text.hashCode() * 31;
                StartSecondaryTextContentDto startSecondaryTextContentDto = this.start_secondary_text_content;
                return ((((iHashCode + (startSecondaryTextContentDto == null ? 0 : startSecondaryTextContentDto.hashCode())) * 31) + Boolean.hashCode(this.is_selected)) * 31) + this.strategy_type.hashCode();
            }

            public String toString() {
                return "Surrogate(start_primary_text=" + this.start_primary_text + ", start_secondary_text_content=" + this.start_secondary_text_content + ", is_selected=" + this.is_selected + ", strategy_type=" + this.strategy_type + ")";
            }

            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return StreamAvailableTaxLotStrategyViewModelsResponseDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, StartSecondaryTextContentDto startSecondaryTextContentDto, boolean z, TaxLotStrategyTypeDto taxLotStrategyTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
                this.start_primary_text = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.start_secondary_text_content = null;
                } else {
                    this.start_secondary_text_content = startSecondaryTextContentDto;
                }
                if ((i & 4) == 0) {
                    this.is_selected = false;
                } else {
                    this.is_selected = z;
                }
                if ((i & 8) == 0) {
                    this.strategy_type = TaxLotStrategyTypeDto.INSTANCE.getZeroValue();
                } else {
                    this.strategy_type = taxLotStrategyTypeDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.start_primary_text, "")) {
                    output.encodeStringElement(serialDesc, 0, self.start_primary_text);
                }
                StartSecondaryTextContentDto startSecondaryTextContentDto = self.start_secondary_text_content;
                if (startSecondaryTextContentDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, StartSecondaryTextContentDto.Serializer.INSTANCE, startSecondaryTextContentDto);
                }
                boolean z = self.is_selected;
                if (z) {
                    output.encodeBooleanElement(serialDesc, 2, z);
                }
                if (self.strategy_type != TaxLotStrategyTypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 3, TaxLotStrategyTypeDto.Serializer.INSTANCE, self.strategy_type);
                }
            }

            public Surrogate(String start_primary_text, StartSecondaryTextContentDto startSecondaryTextContentDto, boolean z, TaxLotStrategyTypeDto strategy_type) {
                Intrinsics.checkNotNullParameter(start_primary_text, "start_primary_text");
                Intrinsics.checkNotNullParameter(strategy_type, "strategy_type");
                this.start_primary_text = start_primary_text;
                this.start_secondary_text_content = startSecondaryTextContentDto;
                this.is_selected = z;
                this.strategy_type = strategy_type;
            }

            public final String getStart_primary_text() {
                return this.start_primary_text;
            }

            public /* synthetic */ Surrogate(String str, StartSecondaryTextContentDto startSecondaryTextContentDto, boolean z, TaxLotStrategyTypeDto taxLotStrategyTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : startSecondaryTextContentDto, (i & 4) != 0 ? false : z, (i & 8) != 0 ? TaxLotStrategyTypeDto.INSTANCE.getZeroValue() : taxLotStrategyTypeDto);
            }

            public final StartSecondaryTextContentDto getStart_secondary_text_content() {
                return this.start_secondary_text_content;
            }

            /* renamed from: is_selected, reason: from getter */
            public final boolean getIs_selected() {
                return this.is_selected;
            }

            public final TaxLotStrategyTypeDto getStrategy_type() {
                return this.strategy_type;
            }
        }

        /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$AvailableTaxLotStrategyViewModel;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<AvailableTaxLotStrategyViewModelDto, StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AvailableTaxLotStrategyViewModelDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AvailableTaxLotStrategyViewModelDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AvailableTaxLotStrategyViewModelDto> getBinaryBase64Serializer() {
                return (KSerializer) AvailableTaxLotStrategyViewModelDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel> getProtoAdapter() {
                return StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AvailableTaxLotStrategyViewModelDto getZeroValue() {
                return AvailableTaxLotStrategyViewModelDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AvailableTaxLotStrategyViewModelDto fromProto(StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                String start_primary_text = proto.getStart_primary_text();
                StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent start_secondary_text_content = proto.getStart_secondary_text_content();
                return new AvailableTaxLotStrategyViewModelDto(new Surrogate(start_primary_text, start_secondary_text_content != null ? StartSecondaryTextContentDto.INSTANCE.fromProto(start_secondary_text_content) : null, proto.getIs_selected(), TaxLotStrategyTypeDto.INSTANCE.fromProto(proto.getStrategy_type())), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamAvailableTaxLotStrategyViewModelsResponseDto.AvailableTaxLotStrategyViewModelDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new AvailableTaxLotStrategyViewModelDto(null, null, false, null, 15, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<AvailableTaxLotStrategyViewModelDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AvailableTaxLotStrategyViewModelDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public AvailableTaxLotStrategyViewModelDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new AvailableTaxLotStrategyViewModelDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponseDto$AvailableTaxLotStrategyViewModelDto";
            }
        }
    }

    /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b#\"$%&'()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006*"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$Surrogate;)V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$ContentTypeDto;", "content_type", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$ContentTypeDto;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$Surrogate;", "getContent_type", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$ContentTypeDto;", "Companion", "Surrogate", "ContentTypeDto", "EstimatedGainContentDto", "EstimatedLossContentDto", "TextContentDto", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class StartSecondaryTextContentDto implements Dto3<StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<StartSecondaryTextContentDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<StartSecondaryTextContentDto, StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent>> binaryBase64Serializer$delegate;
        private static final StartSecondaryTextContentDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ StartSecondaryTextContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private StartSecondaryTextContentDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final ContentTypeDto getContent_type() {
            if (this.surrogate.getEstimated_gain_content() != null) {
                return new ContentTypeDto.EstimatedGainContent(this.surrogate.getEstimated_gain_content());
            }
            if (this.surrogate.getEstimated_loss_content() != null) {
                return new ContentTypeDto.EstimatedLossContent(this.surrogate.getEstimated_loss_content());
            }
            if (this.surrogate.getText_content() != null) {
                return new ContentTypeDto.TextContent(this.surrogate.getText_content());
            }
            return null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public StartSecondaryTextContentDto(ContentTypeDto contentTypeDto) {
            ContentTypeDto.EstimatedGainContent estimatedGainContent = contentTypeDto instanceof ContentTypeDto.EstimatedGainContent ? (ContentTypeDto.EstimatedGainContent) contentTypeDto : null;
            EstimatedGainContentDto value = estimatedGainContent != null ? estimatedGainContent.getValue() : null;
            ContentTypeDto.EstimatedLossContent estimatedLossContent = contentTypeDto instanceof ContentTypeDto.EstimatedLossContent ? (ContentTypeDto.EstimatedLossContent) contentTypeDto : null;
            EstimatedLossContentDto value2 = estimatedLossContent != null ? estimatedLossContent.getValue() : null;
            ContentTypeDto.TextContent textContent = contentTypeDto instanceof ContentTypeDto.TextContent ? (ContentTypeDto.TextContent) contentTypeDto : null;
            this(new Surrogate(value, value2, textContent != null ? textContent.getValue() : null));
        }

        public /* synthetic */ StartSecondaryTextContentDto(ContentTypeDto contentTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : contentTypeDto);
        }

        @Override // com.robinhood.idl.Dto
        public StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent toProto() {
            EstimatedGainContentDto estimated_gain_content = this.surrogate.getEstimated_gain_content();
            StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent proto = estimated_gain_content != null ? estimated_gain_content.toProto() : null;
            EstimatedLossContentDto estimated_loss_content = this.surrogate.getEstimated_loss_content();
            StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent proto2 = estimated_loss_content != null ? estimated_loss_content.toProto() : null;
            TextContentDto text_content = this.surrogate.getText_content();
            return new StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent(proto, proto2, text_content != null ? text_content.toProto() : null, null, 8, null);
        }

        public String toString() {
            return "[StartSecondaryTextContentDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof StartSecondaryTextContentDto) && Intrinsics.areEqual(((StartSecondaryTextContentDto) other).surrogate, this.surrogate);
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
        /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$Surrogate;", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto;", "estimated_gain_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto;", "estimated_loss_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto;", "text_content", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto;", "getEstimated_gain_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto;", "getEstimated_gain_content$annotations", "()V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto;", "getEstimated_loss_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto;", "getEstimated_loss_content$annotations", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto;", "getText_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto;", "getText_content$annotations", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final EstimatedGainContentDto estimated_gain_content;
            private final EstimatedLossContentDto estimated_loss_content;
            private final TextContentDto text_content;

            public Surrogate() {
                this((EstimatedGainContentDto) null, (EstimatedLossContentDto) null, (TextContentDto) null, 7, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.estimated_gain_content, surrogate.estimated_gain_content) && Intrinsics.areEqual(this.estimated_loss_content, surrogate.estimated_loss_content) && Intrinsics.areEqual(this.text_content, surrogate.text_content);
            }

            public int hashCode() {
                EstimatedGainContentDto estimatedGainContentDto = this.estimated_gain_content;
                int iHashCode = (estimatedGainContentDto == null ? 0 : estimatedGainContentDto.hashCode()) * 31;
                EstimatedLossContentDto estimatedLossContentDto = this.estimated_loss_content;
                int iHashCode2 = (iHashCode + (estimatedLossContentDto == null ? 0 : estimatedLossContentDto.hashCode())) * 31;
                TextContentDto textContentDto = this.text_content;
                return iHashCode2 + (textContentDto != null ? textContentDto.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(estimated_gain_content=" + this.estimated_gain_content + ", estimated_loss_content=" + this.estimated_loss_content + ", text_content=" + this.text_content + ")";
            }

            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return StreamAvailableTaxLotStrategyViewModelsResponseDto5.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, EstimatedGainContentDto estimatedGainContentDto, EstimatedLossContentDto estimatedLossContentDto, TextContentDto textContentDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.estimated_gain_content = null;
                } else {
                    this.estimated_gain_content = estimatedGainContentDto;
                }
                if ((i & 2) == 0) {
                    this.estimated_loss_content = null;
                } else {
                    this.estimated_loss_content = estimatedLossContentDto;
                }
                if ((i & 4) == 0) {
                    this.text_content = null;
                } else {
                    this.text_content = textContentDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                EstimatedGainContentDto estimatedGainContentDto = self.estimated_gain_content;
                if (estimatedGainContentDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, EstimatedGainContentDto.Serializer.INSTANCE, estimatedGainContentDto);
                }
                EstimatedLossContentDto estimatedLossContentDto = self.estimated_loss_content;
                if (estimatedLossContentDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, EstimatedLossContentDto.Serializer.INSTANCE, estimatedLossContentDto);
                }
                TextContentDto textContentDto = self.text_content;
                if (textContentDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, TextContentDto.Serializer.INSTANCE, textContentDto);
                }
            }

            public Surrogate(EstimatedGainContentDto estimatedGainContentDto, EstimatedLossContentDto estimatedLossContentDto, TextContentDto textContentDto) {
                this.estimated_gain_content = estimatedGainContentDto;
                this.estimated_loss_content = estimatedLossContentDto;
                this.text_content = textContentDto;
            }

            public /* synthetic */ Surrogate(EstimatedGainContentDto estimatedGainContentDto, EstimatedLossContentDto estimatedLossContentDto, TextContentDto textContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : estimatedGainContentDto, (i & 2) != 0 ? null : estimatedLossContentDto, (i & 4) != 0 ? null : textContentDto);
            }

            public final EstimatedGainContentDto getEstimated_gain_content() {
                return this.estimated_gain_content;
            }

            public final EstimatedLossContentDto getEstimated_loss_content() {
                return this.estimated_loss_content;
            }

            public final TextContentDto getText_content() {
                return this.text_content;
            }
        }

        /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<StartSecondaryTextContentDto, StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<StartSecondaryTextContentDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StartSecondaryTextContentDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StartSecondaryTextContentDto> getBinaryBase64Serializer() {
                return (KSerializer) StartSecondaryTextContentDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent> getProtoAdapter() {
                return StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StartSecondaryTextContentDto getZeroValue() {
                return StartSecondaryTextContentDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StartSecondaryTextContentDto fromProto(StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent estimated_gain_content = proto.getEstimated_gain_content();
                DefaultConstructorMarker defaultConstructorMarker = null;
                EstimatedGainContentDto estimatedGainContentDtoFromProto = estimated_gain_content != null ? EstimatedGainContentDto.INSTANCE.fromProto(estimated_gain_content) : null;
                StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent estimated_loss_content = proto.getEstimated_loss_content();
                EstimatedLossContentDto estimatedLossContentDtoFromProto = estimated_loss_content != null ? EstimatedLossContentDto.INSTANCE.fromProto(estimated_loss_content) : null;
                StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent text_content = proto.getText_content();
                return new StartSecondaryTextContentDto(new Surrogate(estimatedGainContentDtoFromProto, estimatedLossContentDtoFromProto, text_content != null ? TextContentDto.INSTANCE.fromProto(text_content) : null), defaultConstructorMarker);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamAvailableTaxLotStrategyViewModelsResponseDto.StartSecondaryTextContentDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new StartSecondaryTextContentDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$ContentTypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "EstimatedGainContent", "EstimatedLossContent", "TextContent", "Companion", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$ContentTypeDto$EstimatedGainContent;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$ContentTypeDto$EstimatedLossContent;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$ContentTypeDto$TextContent;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @RhGenerated
        public static abstract class ContentTypeDto implements Dto4 {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ ContentTypeDto(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ContentTypeDto() {
            }

            @Override // com.robinhood.idl.Dto
            public Void toProto() {
                return Dto4.DefaultImpls.toProto(this);
            }

            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$ContentTypeDto$EstimatedGainContent;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$ContentTypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto;", "value", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto;", "getValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class EstimatedGainContent extends ContentTypeDto {
                private final EstimatedGainContentDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof EstimatedGainContent) && Intrinsics.areEqual(this.value, ((EstimatedGainContent) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "EstimatedGainContent(value=" + this.value + ")";
                }

                public final EstimatedGainContentDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public EstimatedGainContent(EstimatedGainContentDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$ContentTypeDto$EstimatedLossContent;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$ContentTypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto;", "value", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto;", "getValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class EstimatedLossContent extends ContentTypeDto {
                private final EstimatedLossContentDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof EstimatedLossContent) && Intrinsics.areEqual(this.value, ((EstimatedLossContent) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "EstimatedLossContent(value=" + this.value + ")";
                }

                public final EstimatedLossContentDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public EstimatedLossContent(EstimatedLossContentDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$ContentTypeDto$TextContent;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$ContentTypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto;", "value", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto;", "getValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class TextContent extends ContentTypeDto {
                private final TextContentDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof TextContent) && Intrinsics.areEqual(this.value, ((TextContent) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "TextContent(value=" + this.value + ")";
                }

                public final TextContentDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public TextContent(TextContentDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$ContentTypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$ContentTypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes14.dex */
            public static final class Companion implements Dto4.Creator<ContentTypeDto, StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @Override // com.robinhood.idl.Dto.Creator
                public Void getZeroValue() {
                    return Dto4.Creator.DefaultImpls.getZeroValue(this);
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent> getProtoAdapter() {
                    return StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ContentTypeDto fromProto(StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    if (proto.getEstimated_gain_content() != null) {
                        return new EstimatedGainContent(EstimatedGainContentDto.INSTANCE.fromProto(proto.getEstimated_gain_content()));
                    }
                    if (proto.getEstimated_loss_content() != null) {
                        return new EstimatedLossContent(EstimatedLossContentDto.INSTANCE.fromProto(proto.getEstimated_loss_content()));
                    }
                    if (proto.getText_content() != null) {
                        return new TextContent(TextContentDto.INSTANCE.fromProto(proto.getText_content()));
                    }
                    return null;
                }
            }
        }

        /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedGainContent;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "estimated_gain_quote_amount", "(Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedGainContent;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto$Surrogate;", "getEstimated_gain_quote_amount", "()Lcom/robinhood/idl/IdlDecimal;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class EstimatedGainContentDto implements Dto3<StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<EstimatedGainContentDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<EstimatedGainContentDto, StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent>> binaryBase64Serializer$delegate;
            private static final EstimatedGainContentDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ EstimatedGainContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private EstimatedGainContentDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final IdlDecimal getEstimated_gain_quote_amount() {
                return this.surrogate.getEstimated_gain_quote_amount();
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public EstimatedGainContentDto(IdlDecimal estimated_gain_quote_amount) {
                this(new Surrogate(estimated_gain_quote_amount));
                Intrinsics.checkNotNullParameter(estimated_gain_quote_amount, "estimated_gain_quote_amount");
            }

            public /* synthetic */ EstimatedGainContentDto(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent toProto() {
                return new StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent(this.surrogate.getEstimated_gain_quote_amount().getStringValue(), null, 2, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[EstimatedGainContentDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof EstimatedGainContentDto) && Intrinsics.areEqual(((EstimatedGainContentDto) other).surrogate, this.surrogate);
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
            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B \u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "estimated_gain_quote_amount", "<init>", "(Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getEstimated_gain_quote_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getEstimated_gain_quote_amount$annotations", "()V", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final IdlDecimal estimated_gain_quote_amount;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((IdlDecimal) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Surrogate) && Intrinsics.areEqual(this.estimated_gain_quote_amount, ((Surrogate) other).estimated_gain_quote_amount);
                }

                public int hashCode() {
                    return this.estimated_gain_quote_amount.hashCode();
                }

                public String toString() {
                    return "Surrogate(estimated_gain_quote_amount=" + this.estimated_gain_quote_amount + ")";
                }

                /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return StreamAvailableTaxLotStrategyViewModelsResponseDto3.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.estimated_gain_quote_amount = new IdlDecimal("");
                    } else {
                        this.estimated_gain_quote_amount = idlDecimal;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (Intrinsics.areEqual(self.estimated_gain_quote_amount, new IdlDecimal(""))) {
                        return;
                    }
                    output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.estimated_gain_quote_amount);
                }

                public Surrogate(IdlDecimal estimated_gain_quote_amount) {
                    Intrinsics.checkNotNullParameter(estimated_gain_quote_amount, "estimated_gain_quote_amount");
                    this.estimated_gain_quote_amount = estimated_gain_quote_amount;
                }

                public final IdlDecimal getEstimated_gain_quote_amount() {
                    return this.estimated_gain_quote_amount;
                }

                public /* synthetic */ Surrogate(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
                }
            }

            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedGainContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<EstimatedGainContentDto, StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<EstimatedGainContentDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<EstimatedGainContentDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<EstimatedGainContentDto> getBinaryBase64Serializer() {
                    return (KSerializer) EstimatedGainContentDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent> getProtoAdapter() {
                    return StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public EstimatedGainContentDto getZeroValue() {
                    return EstimatedGainContentDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public EstimatedGainContentDto fromProto(StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new EstimatedGainContentDto(new Surrogate(new IdlDecimal(proto.getEstimated_gain_quote_amount())), null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StreamAvailableTaxLotStrategyViewModelsResponseDto.StartSecondaryTextContentDto.EstimatedGainContentDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new EstimatedGainContentDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes14.dex */
            public static final class Serializer implements KSerializer<EstimatedGainContentDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, EstimatedGainContentDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public EstimatedGainContentDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new EstimatedGainContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4193_9)
                public final String provideIntoMap() {
                    return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedGainContentDto";
                }
            }
        }

        /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedLossContent;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "estimated_loss_quote_amount", "(Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedLossContent;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto$Surrogate;", "getEstimated_loss_quote_amount", "()Lcom/robinhood/idl/IdlDecimal;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class EstimatedLossContentDto implements Dto3<StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<EstimatedLossContentDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<EstimatedLossContentDto, StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent>> binaryBase64Serializer$delegate;
            private static final EstimatedLossContentDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ EstimatedLossContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private EstimatedLossContentDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final IdlDecimal getEstimated_loss_quote_amount() {
                return this.surrogate.getEstimated_loss_quote_amount();
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public EstimatedLossContentDto(IdlDecimal estimated_loss_quote_amount) {
                this(new Surrogate(estimated_loss_quote_amount));
                Intrinsics.checkNotNullParameter(estimated_loss_quote_amount, "estimated_loss_quote_amount");
            }

            public /* synthetic */ EstimatedLossContentDto(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent toProto() {
                return new StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent(this.surrogate.getEstimated_loss_quote_amount().getStringValue(), null, 2, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[EstimatedLossContentDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof EstimatedLossContentDto) && Intrinsics.areEqual(((EstimatedLossContentDto) other).surrogate, this.surrogate);
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
            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B \u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "estimated_loss_quote_amount", "<init>", "(Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getEstimated_loss_quote_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getEstimated_loss_quote_amount$annotations", "()V", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final IdlDecimal estimated_loss_quote_amount;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((IdlDecimal) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Surrogate) && Intrinsics.areEqual(this.estimated_loss_quote_amount, ((Surrogate) other).estimated_loss_quote_amount);
                }

                public int hashCode() {
                    return this.estimated_loss_quote_amount.hashCode();
                }

                public String toString() {
                    return "Surrogate(estimated_loss_quote_amount=" + this.estimated_loss_quote_amount + ")";
                }

                /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return StreamAvailableTaxLotStrategyViewModelsResponseDto4.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.estimated_loss_quote_amount = new IdlDecimal("");
                    } else {
                        this.estimated_loss_quote_amount = idlDecimal;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (Intrinsics.areEqual(self.estimated_loss_quote_amount, new IdlDecimal(""))) {
                        return;
                    }
                    output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.estimated_loss_quote_amount);
                }

                public Surrogate(IdlDecimal estimated_loss_quote_amount) {
                    Intrinsics.checkNotNullParameter(estimated_loss_quote_amount, "estimated_loss_quote_amount");
                    this.estimated_loss_quote_amount = estimated_loss_quote_amount;
                }

                public final IdlDecimal getEstimated_loss_quote_amount() {
                    return this.estimated_loss_quote_amount;
                }

                public /* synthetic */ Surrogate(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
                }
            }

            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedLossContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<EstimatedLossContentDto, StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<EstimatedLossContentDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<EstimatedLossContentDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<EstimatedLossContentDto> getBinaryBase64Serializer() {
                    return (KSerializer) EstimatedLossContentDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent> getProtoAdapter() {
                    return StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public EstimatedLossContentDto getZeroValue() {
                    return EstimatedLossContentDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public EstimatedLossContentDto fromProto(StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new EstimatedLossContentDto(new Surrogate(new IdlDecimal(proto.getEstimated_loss_quote_amount())), null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StreamAvailableTaxLotStrategyViewModelsResponseDto.StartSecondaryTextContentDto.EstimatedLossContentDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new EstimatedLossContentDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes14.dex */
            public static final class Serializer implements KSerializer<EstimatedLossContentDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, EstimatedLossContentDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public EstimatedLossContentDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new EstimatedLossContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4185_1)
                public final String provideIntoMap() {
                    return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$EstimatedLossContentDto";
                }
            }
        }

        /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004! \"#B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000e¨\u0006$"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$TextContent;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto$Surrogate;)V", "", "text", "(Ljava/lang/String;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$TextContent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto$Surrogate;", "getText", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class TextContentDto implements Dto3<StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<TextContentDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<TextContentDto, StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent>> binaryBase64Serializer$delegate;
            private static final TextContentDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ TextContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private TextContentDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final String getText() {
                return this.surrogate.getText();
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public TextContentDto(String text) {
                this(new Surrogate(text));
                Intrinsics.checkNotNullParameter(text, "text");
            }

            public /* synthetic */ TextContentDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent toProto() {
                return new StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent(this.surrogate.getText(), null, 2, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[TextContentDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof TextContentDto) && Intrinsics.areEqual(((TextContentDto) other).surrogate, this.surrogate);
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
            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015¨\u0006\""}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto$Surrogate;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getText$annotations", "()V", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String text;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Surrogate) && Intrinsics.areEqual(this.text, ((Surrogate) other).text);
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                public String toString() {
                    return "Surrogate(text=" + this.text + ")";
                }

                /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return StreamAvailableTaxLotStrategyViewModelsResponseDto6.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.text = "";
                    } else {
                        this.text = str;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (Intrinsics.areEqual(self.text, "")) {
                        return;
                    }
                    output.encodeStringElement(serialDesc, 0, self.text);
                }

                public Surrogate(String text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                }

                public final String getText() {
                    return this.text;
                }

                public /* synthetic */ Surrogate(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str);
                }
            }

            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$TextContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<TextContentDto, StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<TextContentDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TextContentDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TextContentDto> getBinaryBase64Serializer() {
                    return (KSerializer) TextContentDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent> getProtoAdapter() {
                    return StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TextContentDto getZeroValue() {
                    return TextContentDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TextContentDto fromProto(StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new TextContentDto(new Surrogate(proto.getText()), null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StreamAvailableTaxLotStrategyViewModelsResponseDto.StartSecondaryTextContentDto.TextContentDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new TextContentDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes14.dex */
            public static final class Serializer implements KSerializer<TextContentDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, TextContentDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public TextContentDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new TextContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4185_1)
                public final String provideIntoMap() {
                    return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$TextContentDto";
                }
            }
        }

        /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<StartSecondaryTextContentDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, StartSecondaryTextContentDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public StartSecondaryTextContentDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new StartSecondaryTextContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponseDto$StartSecondaryTextContentDto";
            }
        }
    }

    /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<StreamAvailableTaxLotStrategyViewModelsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamAvailableTaxLotStrategyViewModelsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamAvailableTaxLotStrategyViewModelsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamAvailableTaxLotStrategyViewModelsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponseDto";
        }
    }
}
