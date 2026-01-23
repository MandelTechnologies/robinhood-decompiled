package nummus.p512v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import kotlinx.serialization.internal.StringSerializer;
import nummus.p512v1.CreateCostBasisLotRequestDto;
import p479j$.time.Instant;

/* compiled from: CreateCostBasisLotRequestDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B]\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0004\b\u0006\u0010\u0014Ja\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*¨\u0006/"}, m3636d2 = {"Lnummus/v1/CreateCostBasisLotRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/CreateCostBasisLotRequest;", "Landroid/os/Parcelable;", "Lnummus/v1/CreateCostBasisLotRequestDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/CreateCostBasisLotRequestDto$Surrogate;)V", "", "account_id", "source_id", "source_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "acquisition_date", "Lcom/robinhood/idl/IdlDecimal;", "quantity", "total_cost_basis_fiat", "", "validation_only", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/util/List;)Lnummus/v1/CreateCostBasisLotRequestDto;", "toProto", "()Lnummus/v1/CreateCostBasisLotRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/CreateCostBasisLotRequestDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class CreateCostBasisLotRequestDto implements Dto3<CreateCostBasisLotRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CreateCostBasisLotRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CreateCostBasisLotRequestDto, CreateCostBasisLotRequest>> binaryBase64Serializer$delegate;
    private static final CreateCostBasisLotRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CreateCostBasisLotRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CreateCostBasisLotRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ CreateCostBasisLotRequestDto(String str, String str2, String str3, Instant instant, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 64) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateCostBasisLotRequestDto(String account_id, String source_id, String source_type, Instant instant, IdlDecimal quantity, IdlDecimal total_cost_basis_fiat, List<String> validation_only) {
        this(new Surrogate(account_id, source_id, source_type, instant, quantity, total_cost_basis_fiat, validation_only));
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(total_cost_basis_fiat, "total_cost_basis_fiat");
        Intrinsics.checkNotNullParameter(validation_only, "validation_only");
    }

    public static /* synthetic */ CreateCostBasisLotRequestDto copy$default(CreateCostBasisLotRequestDto createCostBasisLotRequestDto, String str, String str2, String str3, Instant instant, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createCostBasisLotRequestDto.surrogate.getAccount_id();
        }
        if ((i & 2) != 0) {
            str2 = createCostBasisLotRequestDto.surrogate.getSource_id();
        }
        if ((i & 4) != 0) {
            str3 = createCostBasisLotRequestDto.surrogate.getSource_type();
        }
        if ((i & 8) != 0) {
            instant = createCostBasisLotRequestDto.surrogate.getAcquisition_date();
        }
        if ((i & 16) != 0) {
            idlDecimal = createCostBasisLotRequestDto.surrogate.getQuantity();
        }
        if ((i & 32) != 0) {
            idlDecimal2 = createCostBasisLotRequestDto.surrogate.getTotal_cost_basis_fiat();
        }
        if ((i & 64) != 0) {
            list = createCostBasisLotRequestDto.surrogate.getValidation_only();
        }
        IdlDecimal idlDecimal3 = idlDecimal2;
        List list2 = list;
        IdlDecimal idlDecimal4 = idlDecimal;
        String str4 = str3;
        return createCostBasisLotRequestDto.copy(str, str2, str4, instant, idlDecimal4, idlDecimal3, list2);
    }

    public final CreateCostBasisLotRequestDto copy(String account_id, String source_id, String source_type, Instant acquisition_date, IdlDecimal quantity, IdlDecimal total_cost_basis_fiat, List<String> validation_only) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(source_id, "source_id");
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(total_cost_basis_fiat, "total_cost_basis_fiat");
        Intrinsics.checkNotNullParameter(validation_only, "validation_only");
        return new CreateCostBasisLotRequestDto(new Surrogate(account_id, source_id, source_type, acquisition_date, quantity, total_cost_basis_fiat, validation_only));
    }

    @Override // com.robinhood.idl.Dto
    public CreateCostBasisLotRequest toProto() {
        String account_id = this.surrogate.getAccount_id();
        String source_id = this.surrogate.getSource_id();
        String source_type = this.surrogate.getSource_type();
        Instant acquisition_date = this.surrogate.getAcquisition_date();
        String stringValue = this.surrogate.getQuantity().getStringValue();
        String stringValue2 = this.surrogate.getTotal_cost_basis_fiat().getStringValue();
        List<String> validation_only = this.surrogate.getValidation_only();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(validation_only, 10));
        Iterator<T> it = validation_only.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new CreateCostBasisLotRequest(account_id, source_id, source_type, acquisition_date, stringValue, stringValue2, arrayList, null, 128, null);
    }

    public String toString() {
        return "[CreateCostBasisLotRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CreateCostBasisLotRequestDto) && Intrinsics.areEqual(((CreateCostBasisLotRequestDto) other).surrogate, this.surrogate);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CreateCostBasisLotRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 @2\u00020\u0001:\u0002A@B\u0097\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bg\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010#R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010#R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010#RF\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00102\u0012\u0004\b5\u0010-\u001a\u0004\b3\u00104R/\u0010\u000e\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\b9\u0010-\u001a\u0004\b7\u00108R/\u0010\u000f\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00106\u0012\u0004\b;\u0010-\u001a\u0004\b:\u00108R&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010<\u0012\u0004\b?\u0010-\u001a\u0004\b=\u0010>¨\u0006B"}, m3636d2 = {"Lnummus/v1/CreateCostBasisLotRequestDto$Surrogate;", "", "", "account_id", "source_id", "source_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "acquisition_date", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "quantity", "total_cost_basis_fiat", "", "validation_only", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/CreateCostBasisLotRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_id", "getAccount_id$annotations", "()V", "getSource_id", "getSource_id$annotations", "getSource_type", "getSource_type$annotations", "Lj$/time/Instant;", "getAcquisition_date", "()Lj$/time/Instant;", "getAcquisition_date$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getQuantity$annotations", "getTotal_cost_basis_fiat", "getTotal_cost_basis_fiat$annotations", "Ljava/util/List;", "getValidation_only", "()Ljava/util/List;", "getValidation_only$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Surrogate {
        private final String account_id;
        private final Instant acquisition_date;
        private final IdlDecimal quantity;
        private final String source_id;
        private final String source_type;
        private final IdlDecimal total_cost_basis_fiat;
        private final List<String> validation_only;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: nummus.v1.CreateCostBasisLotRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateCostBasisLotRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (Instant) null, (IdlDecimal) null, (IdlDecimal) null, (List) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.source_id, surrogate.source_id) && Intrinsics.areEqual(this.source_type, surrogate.source_type) && Intrinsics.areEqual(this.acquisition_date, surrogate.acquisition_date) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.total_cost_basis_fiat, surrogate.total_cost_basis_fiat) && Intrinsics.areEqual(this.validation_only, surrogate.validation_only);
        }

        public int hashCode() {
            int iHashCode = ((((this.account_id.hashCode() * 31) + this.source_id.hashCode()) * 31) + this.source_type.hashCode()) * 31;
            Instant instant = this.acquisition_date;
            return ((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.quantity.hashCode()) * 31) + this.total_cost_basis_fiat.hashCode()) * 31) + this.validation_only.hashCode();
        }

        public String toString() {
            return "Surrogate(account_id=" + this.account_id + ", source_id=" + this.source_id + ", source_type=" + this.source_type + ", acquisition_date=" + this.acquisition_date + ", quantity=" + this.quantity + ", total_cost_basis_fiat=" + this.total_cost_basis_fiat + ", validation_only=" + this.validation_only + ")";
        }

        /* compiled from: CreateCostBasisLotRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/CreateCostBasisLotRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/CreateCostBasisLotRequestDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CreateCostBasisLotRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, Instant instant, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str;
            }
            if ((i & 2) == 0) {
                this.source_id = "";
            } else {
                this.source_id = str2;
            }
            if ((i & 4) == 0) {
                this.source_type = "";
            } else {
                this.source_type = str3;
            }
            if ((i & 8) == 0) {
                this.acquisition_date = null;
            } else {
                this.acquisition_date = instant;
            }
            if ((i & 16) == 0) {
                this.quantity = new IdlDecimal("");
            } else {
                this.quantity = idlDecimal;
            }
            if ((i & 32) == 0) {
                this.total_cost_basis_fiat = new IdlDecimal("");
            } else {
                this.total_cost_basis_fiat = idlDecimal2;
            }
            if ((i & 64) == 0) {
                this.validation_only = CollectionsKt.emptyList();
            } else {
                this.validation_only = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_id);
            }
            if (!Intrinsics.areEqual(self.source_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.source_id);
            }
            if (!Intrinsics.areEqual(self.source_type, "")) {
                output.encodeStringElement(serialDesc, 2, self.source_type);
            }
            Instant instant = self.acquisition_date;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.quantity);
            }
            if (!Intrinsics.areEqual(self.total_cost_basis_fiat, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.total_cost_basis_fiat);
            }
            if (Intrinsics.areEqual(self.validation_only, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.validation_only);
        }

        public Surrogate(String account_id, String source_id, String source_type, Instant instant, IdlDecimal quantity, IdlDecimal total_cost_basis_fiat, List<String> validation_only) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(source_id, "source_id");
            Intrinsics.checkNotNullParameter(source_type, "source_type");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(total_cost_basis_fiat, "total_cost_basis_fiat");
            Intrinsics.checkNotNullParameter(validation_only, "validation_only");
            this.account_id = account_id;
            this.source_id = source_id;
            this.source_type = source_type;
            this.acquisition_date = instant;
            this.quantity = quantity;
            this.total_cost_basis_fiat = total_cost_basis_fiat;
            this.validation_only = validation_only;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, Instant instant, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 64) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final String getSource_id() {
            return this.source_id;
        }

        public final String getSource_type() {
            return this.source_type;
        }

        public final Instant getAcquisition_date() {
            return this.acquisition_date;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final IdlDecimal getTotal_cost_basis_fiat() {
            return this.total_cost_basis_fiat;
        }

        public final List<String> getValidation_only() {
            return this.validation_only;
        }
    }

    /* compiled from: CreateCostBasisLotRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/CreateCostBasisLotRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/CreateCostBasisLotRequestDto;", "Lnummus/v1/CreateCostBasisLotRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/CreateCostBasisLotRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CreateCostBasisLotRequestDto, CreateCostBasisLotRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreateCostBasisLotRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateCostBasisLotRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateCostBasisLotRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) CreateCostBasisLotRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CreateCostBasisLotRequest> getProtoAdapter() {
            return CreateCostBasisLotRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateCostBasisLotRequestDto getZeroValue() {
            return CreateCostBasisLotRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateCostBasisLotRequestDto fromProto(CreateCostBasisLotRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_id = proto.getAccount_id();
            String source_id = proto.getSource_id();
            String source_type = proto.getSource_type();
            Instant acquisition_date = proto.getAcquisition_date();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getQuantity());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getTotal_cost_basis_fiat());
            List<String> validation_only = proto.getValidation_only();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(validation_only, 10));
            Iterator<T> it = validation_only.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new CreateCostBasisLotRequestDto(new Surrogate(account_id, source_id, source_type, acquisition_date, idlDecimal, idlDecimal2, arrayList), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.CreateCostBasisLotRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateCostBasisLotRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new CreateCostBasisLotRequestDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CreateCostBasisLotRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/CreateCostBasisLotRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/CreateCostBasisLotRequestDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/CreateCostBasisLotRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CreateCostBasisLotRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.CreateCostBasisLotRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CreateCostBasisLotRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CreateCostBasisLotRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CreateCostBasisLotRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CreateCostBasisLotRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/CreateCostBasisLotRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "nummus.v1.CreateCostBasisLotRequestDto";
        }
    }
}
