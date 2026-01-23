package com.robinhood.prediction_markets.proto.p361v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.prediction_markets.proto.p361v1.idl.YesNoDto;
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

/* compiled from: ListStrikesRequestDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 !\"#B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto$Surrogate;)V", "yes_no", "Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;", "contract_id", "", "(Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;Ljava/lang/String;)V", "getYes_no", "()Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;", "getContract_id", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class ListStrikesRequestDto implements Dto3<ListStrikesRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ListStrikesRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ListStrikesRequestDto, ListStrikesRequest>> binaryBase64Serializer$delegate;
    private static final ListStrikesRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ListStrikesRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ListStrikesRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final YesNoDto getYes_no() {
        return this.surrogate.getYes_no();
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListStrikesRequestDto(YesNoDto yes_no, String contract_id) {
        this(new Surrogate(yes_no, contract_id));
        Intrinsics.checkNotNullParameter(yes_no, "yes_no");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
    }

    public /* synthetic */ ListStrikesRequestDto(YesNoDto yesNoDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? YesNoDto.INSTANCE.getZeroValue() : yesNoDto, (i & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ ListStrikesRequestDto copy$default(ListStrikesRequestDto listStrikesRequestDto, YesNoDto yesNoDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            yesNoDto = listStrikesRequestDto.surrogate.getYes_no();
        }
        if ((i & 2) != 0) {
            str = listStrikesRequestDto.surrogate.getContract_id();
        }
        return listStrikesRequestDto.copy(yesNoDto, str);
    }

    public final ListStrikesRequestDto copy(YesNoDto yes_no, String contract_id) {
        Intrinsics.checkNotNullParameter(yes_no, "yes_no");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        return new ListStrikesRequestDto(new Surrogate(yes_no, contract_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ListStrikesRequest toProto() {
        return new ListStrikesRequest((YesNo) this.surrogate.getYes_no().toProto(), this.surrogate.getContract_id(), null, 4, null);
    }

    public String toString() {
        return "[ListStrikesRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ListStrikesRequestDto) && Intrinsics.areEqual(((ListStrikesRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: ListStrikesRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto$Surrogate;", "", "yes_no", "Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;", "contract_id", "", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getYes_no$annotations", "()V", "getYes_no", "()Lcom/robinhood/prediction_markets/proto/v1/idl/YesNoDto;", "getContract_id$annotations", "getContract_id", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$prediction_markets_v1_externalRelease", "$serializer", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String contract_id;
        private final YesNoDto yes_no;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((YesNoDto) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, YesNoDto yesNoDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                yesNoDto = surrogate.yes_no;
            }
            if ((i & 2) != 0) {
                str = surrogate.contract_id;
            }
            return surrogate.copy(yesNoDto, str);
        }

        @SerialName("contractId")
        @JsonAnnotations2(names = {"contract_id"})
        public static /* synthetic */ void getContract_id$annotations() {
        }

        @SerialName("yesNo")
        @JsonAnnotations2(names = {"yes_no"})
        public static /* synthetic */ void getYes_no$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final YesNoDto getYes_no() {
            return this.yes_no;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContract_id() {
            return this.contract_id;
        }

        public final Surrogate copy(YesNoDto yes_no, String contract_id) {
            Intrinsics.checkNotNullParameter(yes_no, "yes_no");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            return new Surrogate(yes_no, contract_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.yes_no == surrogate.yes_no && Intrinsics.areEqual(this.contract_id, surrogate.contract_id);
        }

        public int hashCode() {
            return (this.yes_no.hashCode() * 31) + this.contract_id.hashCode();
        }

        public String toString() {
            return "Surrogate(yes_no=" + this.yes_no + ", contract_id=" + this.contract_id + ")";
        }

        /* compiled from: ListStrikesRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto$Surrogate;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ListStrikesRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, YesNoDto yesNoDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.yes_no = (i & 1) == 0 ? YesNoDto.INSTANCE.getZeroValue() : yesNoDto;
            if ((i & 2) == 0) {
                this.contract_id = "";
            } else {
                this.contract_id = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$prediction_markets_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.yes_no != YesNoDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, YesNoDto.Serializer.INSTANCE, self.yes_no);
            }
            if (Intrinsics.areEqual(self.contract_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 1, self.contract_id);
        }

        public Surrogate(YesNoDto yes_no, String contract_id) {
            Intrinsics.checkNotNullParameter(yes_no, "yes_no");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            this.yes_no = yes_no;
            this.contract_id = contract_id;
        }

        public final YesNoDto getYes_no() {
            return this.yes_no;
        }

        public /* synthetic */ Surrogate(YesNoDto yesNoDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? YesNoDto.INSTANCE.getZeroValue() : yesNoDto, (i & 2) != 0 ? "" : str);
        }

        public final String getContract_id() {
            return this.contract_id;
        }
    }

    /* compiled from: ListStrikesRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ListStrikesRequestDto, ListStrikesRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ListStrikesRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ListStrikesRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ListStrikesRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) ListStrikesRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ListStrikesRequest> getProtoAdapter() {
            return ListStrikesRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ListStrikesRequestDto getZeroValue() {
            return ListStrikesRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ListStrikesRequestDto fromProto(ListStrikesRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ListStrikesRequestDto(new Surrogate(YesNoDto.INSTANCE.fromProto(proto.getYes_no()), proto.getContract_id()), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.ListStrikesRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListStrikesRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ListStrikesRequestDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ListStrikesRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ListStrikesRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/prediction_markets.v1.ListStrikesRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ListStrikesRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ListStrikesRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ListStrikesRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: ListStrikesRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.prediction_markets.proto.v1.idl.ListStrikesRequestDto";
        }
    }
}
