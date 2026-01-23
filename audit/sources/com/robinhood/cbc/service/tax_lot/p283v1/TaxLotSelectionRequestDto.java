package com.robinhood.cbc.service.tax_lot.p283v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.cbc.service.tax_lot.p283v1.SubLotSelectionDto;
import com.robinhood.cbc.service.tax_lot.p283v1.TaxLotSelectionRequestDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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

/* compiled from: TaxLotSelectionRequestDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0006\u0010\u000eJ*\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionRequestDto$Surrogate;)V", "account_id", "", "instrument_id", "sub_lot_selections", "", "Lcom/robinhood/cbc/service/tax_lot/v1/SubLotSelectionDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAccount_id", "()Ljava/lang/String;", "getInstrument_id", "getSub_lot_selections", "()Ljava/util/List;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "cbc.tax_lots_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TaxLotSelectionRequestDto implements Dto3<TaxLotSelectionRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TaxLotSelectionRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TaxLotSelectionRequestDto, TaxLotSelectionRequest>> binaryBase64Serializer$delegate;
    private static final TaxLotSelectionRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TaxLotSelectionRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TaxLotSelectionRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final List<SubLotSelectionDto> getSub_lot_selections() {
        return this.surrogate.getSub_lot_selections();
    }

    public /* synthetic */ TaxLotSelectionRequestDto(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxLotSelectionRequestDto(String account_id, String instrument_id, List<SubLotSelectionDto> sub_lot_selections) {
        this(new Surrogate(account_id, instrument_id, sub_lot_selections));
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(sub_lot_selections, "sub_lot_selections");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaxLotSelectionRequestDto copy$default(TaxLotSelectionRequestDto taxLotSelectionRequestDto, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLotSelectionRequestDto.surrogate.getAccount_id();
        }
        if ((i & 2) != 0) {
            str2 = taxLotSelectionRequestDto.surrogate.getInstrument_id();
        }
        if ((i & 4) != 0) {
            list = taxLotSelectionRequestDto.surrogate.getSub_lot_selections();
        }
        return taxLotSelectionRequestDto.copy(str, str2, list);
    }

    public final TaxLotSelectionRequestDto copy(String account_id, String instrument_id, List<SubLotSelectionDto> sub_lot_selections) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(sub_lot_selections, "sub_lot_selections");
        return new TaxLotSelectionRequestDto(new Surrogate(account_id, instrument_id, sub_lot_selections));
    }

    @Override // com.robinhood.idl.Dto
    public TaxLotSelectionRequest toProto() {
        String account_id = this.surrogate.getAccount_id();
        String instrument_id = this.surrogate.getInstrument_id();
        List<SubLotSelectionDto> sub_lot_selections = this.surrogate.getSub_lot_selections();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sub_lot_selections, 10));
        Iterator<T> it = sub_lot_selections.iterator();
        while (it.hasNext()) {
            arrayList.add(((SubLotSelectionDto) it.next()).toProto());
        }
        return new TaxLotSelectionRequest(account_id, instrument_id, arrayList, null, 8, null);
    }

    public String toString() {
        return "[TaxLotSelectionRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TaxLotSelectionRequestDto) && Intrinsics.areEqual(((TaxLotSelectionRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: TaxLotSelectionRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 *2\u00020\u0001:\u0002)*B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J%\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\b(R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, m3636d2 = {"Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionRequestDto$Surrogate;", "", "account_id", "", "instrument_id", "sub_lot_selections", "", "Lcom/robinhood/cbc/service/tax_lot/v1/SubLotSelectionDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccount_id$annotations", "()V", "getAccount_id", "()Ljava/lang/String;", "getInstrument_id$annotations", "getInstrument_id", "getSub_lot_selections$annotations", "getSub_lot_selections", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$cbc_tax_lots_externalRelease", "$serializer", "Companion", "cbc.tax_lots_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_id;
        private final String instrument_id;
        private final List<SubLotSelectionDto> sub_lot_selections;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.cbc.service.tax_lot.v1.TaxLotSelectionRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLotSelectionRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(SubLotSelectionDto.Serializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.account_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.instrument_id;
            }
            if ((i & 4) != 0) {
                list = surrogate.sub_lot_selections;
            }
            return surrogate.copy(str, str2, list);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("subLotSelections")
        @JsonAnnotations2(names = {"sub_lot_selections"})
        public static /* synthetic */ void getSub_lot_selections$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final List<SubLotSelectionDto> component3() {
            return this.sub_lot_selections;
        }

        public final Surrogate copy(String account_id, String instrument_id, List<SubLotSelectionDto> sub_lot_selections) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(sub_lot_selections, "sub_lot_selections");
            return new Surrogate(account_id, instrument_id, sub_lot_selections);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.sub_lot_selections, surrogate.sub_lot_selections);
        }

        public int hashCode() {
            return (((this.account_id.hashCode() * 31) + this.instrument_id.hashCode()) * 31) + this.sub_lot_selections.hashCode();
        }

        public String toString() {
            return "Surrogate(account_id=" + this.account_id + ", instrument_id=" + this.instrument_id + ", sub_lot_selections=" + this.sub_lot_selections + ")";
        }

        /* compiled from: TaxLotSelectionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionRequestDto$Surrogate;", "cbc.tax_lots_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TaxLotSelectionRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str;
            }
            if ((i & 2) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str2;
            }
            if ((i & 4) == 0) {
                this.sub_lot_selections = CollectionsKt.emptyList();
            } else {
                this.sub_lot_selections = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$cbc_tax_lots_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_id);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.instrument_id);
            }
            if (Intrinsics.areEqual(self.sub_lot_selections, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.sub_lot_selections);
        }

        public Surrogate(String account_id, String instrument_id, List<SubLotSelectionDto> sub_lot_selections) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(sub_lot_selections, "sub_lot_selections");
            this.account_id = account_id;
            this.instrument_id = instrument_id;
            this.sub_lot_selections = sub_lot_selections;
        }

        public /* synthetic */ Surrogate(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final List<SubLotSelectionDto> getSub_lot_selections() {
            return this.sub_lot_selections;
        }
    }

    /* compiled from: TaxLotSelectionRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionRequestDto;", "Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "cbc.tax_lots_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TaxLotSelectionRequestDto, TaxLotSelectionRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TaxLotSelectionRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLotSelectionRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLotSelectionRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) TaxLotSelectionRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TaxLotSelectionRequest> getProtoAdapter() {
            return TaxLotSelectionRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLotSelectionRequestDto getZeroValue() {
            return TaxLotSelectionRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLotSelectionRequestDto fromProto(TaxLotSelectionRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_id = proto.getAccount_id();
            String instrument_id = proto.getInstrument_id();
            List<SubLotSelection> sub_lot_selections = proto.getSub_lot_selections();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sub_lot_selections, 10));
            Iterator<T> it = sub_lot_selections.iterator();
            while (it.hasNext()) {
                arrayList.add(SubLotSelectionDto.INSTANCE.fromProto((SubLotSelection) it.next()));
            }
            return new TaxLotSelectionRequestDto(new Surrogate(account_id, instrument_id, arrayList), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.cbc.service.tax_lot.v1.TaxLotSelectionRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLotSelectionRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new TaxLotSelectionRequestDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TaxLotSelectionRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "cbc.tax_lots_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TaxLotSelectionRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/cbc.service.tax_lot.v1.TaxLotSelectionRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TaxLotSelectionRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TaxLotSelectionRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TaxLotSelectionRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TaxLotSelectionRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "cbc.tax_lots_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.cbc.service.tax_lot.v1.TaxLotSelectionRequestDto";
        }
    }
}
