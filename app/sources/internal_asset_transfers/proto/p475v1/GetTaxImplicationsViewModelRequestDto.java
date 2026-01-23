package internal_asset_transfers.proto.p475v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import internal_asset_transfers.proto.p475v1.AnswerDto;
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

/* compiled from: GetTaxImplicationsViewModelRequestDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$#%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006'"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequest;", "Landroid/os/Parcelable;", "Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto$Surrogate;", "surrogate", "<init>", "(Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto$Surrogate;)V", "", "product_context", "key", "rhf_account_number", "Linternal_asset_transfers/proto/v1/AnswerDto;", "answer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Linternal_asset_transfers/proto/v1/AnswerDto;)V", "toProto", "()Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class GetTaxImplicationsViewModelRequestDto implements Dto3<GetTaxImplicationsViewModelRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetTaxImplicationsViewModelRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetTaxImplicationsViewModelRequestDto, GetTaxImplicationsViewModelRequest>> binaryBase64Serializer$delegate;
    private static final GetTaxImplicationsViewModelRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetTaxImplicationsViewModelRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetTaxImplicationsViewModelRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ GetTaxImplicationsViewModelRequestDto(String str, String str2, String str3, AnswerDto answerDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : answerDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetTaxImplicationsViewModelRequestDto(String product_context, String key, String rhf_account_number, AnswerDto answerDto) {
        this(new Surrogate(product_context, key, rhf_account_number, answerDto));
        Intrinsics.checkNotNullParameter(product_context, "product_context");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
    }

    @Override // com.robinhood.idl.Dto
    public GetTaxImplicationsViewModelRequest toProto() {
        String product_context = this.surrogate.getProduct_context();
        String key = this.surrogate.getKey();
        String rhf_account_number = this.surrogate.getRhf_account_number();
        AnswerDto answer = this.surrogate.getAnswer();
        return new GetTaxImplicationsViewModelRequest(product_context, key, rhf_account_number, answer != null ? answer.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[GetTaxImplicationsViewModelRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetTaxImplicationsViewModelRequestDto) && Intrinsics.areEqual(((GetTaxImplicationsViewModelRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetTaxImplicationsViewModelRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010 \u0012\u0004\b'\u0010#\u001a\u0004\b&\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b+\u0010#\u001a\u0004\b)\u0010*¨\u0006."}, m3636d2 = {"Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto$Surrogate;", "", "", "product_context", "key", "rhf_account_number", "Linternal_asset_transfers/proto/v1/AnswerDto;", "answer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Linternal_asset_transfers/proto/v1/AnswerDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Linternal_asset_transfers/proto/v1/AnswerDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$internal_asset_transfers_v1_externalRelease", "(Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct_context", "getProduct_context$annotations", "()V", "getKey", "getKey$annotations", "getRhf_account_number", "getRhf_account_number$annotations", "Linternal_asset_transfers/proto/v1/AnswerDto;", "getAnswer", "()Linternal_asset_transfers/proto/v1/AnswerDto;", "getAnswer$annotations", "Companion", "$serializer", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AnswerDto answer;
        private final String key;
        private final String product_context;
        private final String rhf_account_number;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (AnswerDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.product_context, surrogate.product_context) && Intrinsics.areEqual(this.key, surrogate.key) && Intrinsics.areEqual(this.rhf_account_number, surrogate.rhf_account_number) && Intrinsics.areEqual(this.answer, surrogate.answer);
        }

        public int hashCode() {
            int iHashCode = ((((this.product_context.hashCode() * 31) + this.key.hashCode()) * 31) + this.rhf_account_number.hashCode()) * 31;
            AnswerDto answerDto = this.answer;
            return iHashCode + (answerDto == null ? 0 : answerDto.hashCode());
        }

        public String toString() {
            return "Surrogate(product_context=" + this.product_context + ", key=" + this.key + ", rhf_account_number=" + this.rhf_account_number + ", answer=" + this.answer + ")";
        }

        /* compiled from: GetTaxImplicationsViewModelRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto$Surrogate;", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetTaxImplicationsViewModelRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, AnswerDto answerDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.product_context = "";
            } else {
                this.product_context = str;
            }
            if ((i & 2) == 0) {
                this.key = "";
            } else {
                this.key = str2;
            }
            if ((i & 4) == 0) {
                this.rhf_account_number = "";
            } else {
                this.rhf_account_number = str3;
            }
            if ((i & 8) == 0) {
                this.answer = null;
            } else {
                this.answer = answerDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$internal_asset_transfers_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.product_context, "")) {
                output.encodeStringElement(serialDesc, 0, self.product_context);
            }
            if (!Intrinsics.areEqual(self.key, "")) {
                output.encodeStringElement(serialDesc, 1, self.key);
            }
            if (!Intrinsics.areEqual(self.rhf_account_number, "")) {
                output.encodeStringElement(serialDesc, 2, self.rhf_account_number);
            }
            AnswerDto answerDto = self.answer;
            if (answerDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, AnswerDto.Serializer.INSTANCE, answerDto);
            }
        }

        public Surrogate(String product_context, String key, String rhf_account_number, AnswerDto answerDto) {
            Intrinsics.checkNotNullParameter(product_context, "product_context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(rhf_account_number, "rhf_account_number");
            this.product_context = product_context;
            this.key = key;
            this.rhf_account_number = rhf_account_number;
            this.answer = answerDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, AnswerDto answerDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : answerDto);
        }

        public final String getProduct_context() {
            return this.product_context;
        }

        public final String getKey() {
            return this.key;
        }

        public final String getRhf_account_number() {
            return this.rhf_account_number;
        }

        public final AnswerDto getAnswer() {
            return this.answer;
        }
    }

    /* compiled from: GetTaxImplicationsViewModelRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto;", "Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetTaxImplicationsViewModelRequestDto, GetTaxImplicationsViewModelRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetTaxImplicationsViewModelRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTaxImplicationsViewModelRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTaxImplicationsViewModelRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetTaxImplicationsViewModelRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetTaxImplicationsViewModelRequest> getProtoAdapter() {
            return GetTaxImplicationsViewModelRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTaxImplicationsViewModelRequestDto getZeroValue() {
            return GetTaxImplicationsViewModelRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTaxImplicationsViewModelRequestDto fromProto(GetTaxImplicationsViewModelRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String product_context = proto.getProduct_context();
            String key = proto.getKey();
            String rhf_account_number = proto.getRhf_account_number();
            Answer answer = proto.getAnswer();
            return new GetTaxImplicationsViewModelRequestDto(new Surrogate(product_context, key, rhf_account_number, answer != null ? AnswerDto.INSTANCE.fromProto(answer) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: internal_asset_transfers.proto.v1.GetTaxImplicationsViewModelRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetTaxImplicationsViewModelRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetTaxImplicationsViewModelRequestDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetTaxImplicationsViewModelRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto;", "<init>", "()V", "surrogateSerializer", "Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<GetTaxImplicationsViewModelRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/internal_asset_transfers.proto.v1.GetTaxImplicationsViewModelRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetTaxImplicationsViewModelRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetTaxImplicationsViewModelRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetTaxImplicationsViewModelRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetTaxImplicationsViewModelRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/GetTaxImplicationsViewModelRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "internal_asset_transfers.proto.v1.GetTaxImplicationsViewModelRequestDto";
        }
    }
}
