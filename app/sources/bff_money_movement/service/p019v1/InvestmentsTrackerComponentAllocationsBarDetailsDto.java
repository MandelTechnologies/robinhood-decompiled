package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentAllocationsBarDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentAllocationsBarSectionDetailsDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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

/* compiled from: InvestmentsTrackerComponentAllocationsBarDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*)+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0014R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006-"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetails;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto$Surrogate;)V", "", "header", "amount", "", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarSectionDetailsDto;", "sections", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount_money", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/common/MoneyDto;)V", "toProto", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto$Surrogate;", "getHeader", "getAmount", "getSections", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponentAllocationsBarDetailsDto implements Dto3<InvestmentsTrackerComponentAllocationsBarDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InvestmentsTrackerComponentAllocationsBarDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InvestmentsTrackerComponentAllocationsBarDetailsDto, InvestmentsTrackerComponentAllocationsBarDetails>> binaryBase64Serializer$delegate;
    private static final InvestmentsTrackerComponentAllocationsBarDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InvestmentsTrackerComponentAllocationsBarDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InvestmentsTrackerComponentAllocationsBarDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getHeader() {
        return this.surrogate.getHeader();
    }

    public final String getAmount() {
        return this.surrogate.getAmount();
    }

    public final List<InvestmentsTrackerComponentAllocationsBarSectionDetailsDto> getSections() {
        return this.surrogate.getSections();
    }

    public /* synthetic */ InvestmentsTrackerComponentAllocationsBarDetailsDto(String str, String str2, List list, MoneyDto moneyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : moneyDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerComponentAllocationsBarDetailsDto(String header, String amount, List<InvestmentsTrackerComponentAllocationsBarSectionDetailsDto> sections, MoneyDto moneyDto) {
        this(new Surrogate(header, amount, sections, moneyDto));
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(sections, "sections");
    }

    @Override // com.robinhood.idl.Dto
    public InvestmentsTrackerComponentAllocationsBarDetails toProto() {
        String header = this.surrogate.getHeader();
        String amount = this.surrogate.getAmount();
        List<InvestmentsTrackerComponentAllocationsBarSectionDetailsDto> sections = this.surrogate.getSections();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(((InvestmentsTrackerComponentAllocationsBarSectionDetailsDto) it.next()).toProto());
        }
        MoneyDto amount_money = this.surrogate.getAmount_money();
        return new InvestmentsTrackerComponentAllocationsBarDetails(header, amount, arrayList, amount_money != null ? amount_money.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[InvestmentsTrackerComponentAllocationsBarDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InvestmentsTrackerComponentAllocationsBarDetailsDto) && Intrinsics.areEqual(((InvestmentsTrackerComponentAllocationsBarDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: InvestmentsTrackerComponentAllocationsBarDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u001bR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b+\u0010%\u001a\u0004\b)\u0010*R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b/\u0010%\u001a\u0004\b-\u0010.¨\u00062"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto$Surrogate;", "", "", "header", "amount", "", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarSectionDetailsDto;", "sections", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount_money", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/common/MoneyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/rosetta/common/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeader", "getHeader$annotations", "()V", "getAmount", "getAmount$annotations", "Ljava/util/List;", "getSections", "()Ljava/util/List;", "getSections$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount_money", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount_money$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String amount;
        private final MoneyDto amount_money;
        private final String header;
        private final List<InvestmentsTrackerComponentAllocationsBarSectionDetailsDto> sections;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentAllocationsBarDetailsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerComponentAllocationsBarDetailsDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((String) null, (String) null, (List) null, (MoneyDto) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(InvestmentsTrackerComponentAllocationsBarSectionDetailsDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.header, surrogate.header) && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.sections, surrogate.sections) && Intrinsics.areEqual(this.amount_money, surrogate.amount_money);
        }

        public int hashCode() {
            int iHashCode = ((((this.header.hashCode() * 31) + this.amount.hashCode()) * 31) + this.sections.hashCode()) * 31;
            MoneyDto moneyDto = this.amount_money;
            return iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode());
        }

        public String toString() {
            return "Surrogate(header=" + this.header + ", amount=" + this.amount + ", sections=" + this.sections + ", amount_money=" + this.amount_money + ")";
        }

        /* compiled from: InvestmentsTrackerComponentAllocationsBarDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InvestmentsTrackerComponentAllocationsBarDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, List list, MoneyDto moneyDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.header = "";
            } else {
                this.header = str;
            }
            if ((i & 2) == 0) {
                this.amount = "";
            } else {
                this.amount = str2;
            }
            if ((i & 4) == 0) {
                this.sections = CollectionsKt.emptyList();
            } else {
                this.sections = list;
            }
            if ((i & 8) == 0) {
                this.amount_money = null;
            } else {
                this.amount_money = moneyDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.header, "")) {
                output.encodeStringElement(serialDesc, 0, self.header);
            }
            if (!Intrinsics.areEqual(self.amount, "")) {
                output.encodeStringElement(serialDesc, 1, self.amount);
            }
            if (!Intrinsics.areEqual(self.sections, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.sections);
            }
            MoneyDto moneyDto = self.amount_money;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
        }

        public Surrogate(String header, String amount, List<InvestmentsTrackerComponentAllocationsBarSectionDetailsDto> sections, MoneyDto moneyDto) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(sections, "sections");
            this.header = header;
            this.amount = amount;
            this.sections = sections;
            this.amount_money = moneyDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, List list, MoneyDto moneyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : moneyDto);
        }

        public final String getHeader() {
            return this.header;
        }

        public final String getAmount() {
            return this.amount;
        }

        public final List<InvestmentsTrackerComponentAllocationsBarSectionDetailsDto> getSections() {
            return this.sections;
        }

        public final MoneyDto getAmount_money() {
            return this.amount_money;
        }
    }

    /* compiled from: InvestmentsTrackerComponentAllocationsBarDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InvestmentsTrackerComponentAllocationsBarDetailsDto, InvestmentsTrackerComponentAllocationsBarDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestmentsTrackerComponentAllocationsBarDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerComponentAllocationsBarDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerComponentAllocationsBarDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) InvestmentsTrackerComponentAllocationsBarDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InvestmentsTrackerComponentAllocationsBarDetails> getProtoAdapter() {
            return InvestmentsTrackerComponentAllocationsBarDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerComponentAllocationsBarDetailsDto getZeroValue() {
            return InvestmentsTrackerComponentAllocationsBarDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerComponentAllocationsBarDetailsDto fromProto(InvestmentsTrackerComponentAllocationsBarDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String header = proto.getHeader();
            String amount = proto.getAmount();
            List<InvestmentsTrackerComponentAllocationsBarSectionDetails> sections = proto.getSections();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
            Iterator<T> it = sections.iterator();
            while (it.hasNext()) {
                arrayList.add(InvestmentsTrackerComponentAllocationsBarSectionDetailsDto.INSTANCE.fromProto((InvestmentsTrackerComponentAllocationsBarSectionDetails) it.next()));
            }
            Money amount_money = proto.getAmount_money();
            return new InvestmentsTrackerComponentAllocationsBarDetailsDto(new Surrogate(header, amount, arrayList, amount_money != null ? MoneyDto.INSTANCE.fromProto(amount_money) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentAllocationsBarDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerComponentAllocationsBarDetailsDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new InvestmentsTrackerComponentAllocationsBarDetailsDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InvestmentsTrackerComponentAllocationsBarDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InvestmentsTrackerComponentAllocationsBarDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.InvestmentsTrackerComponentAllocationsBarDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InvestmentsTrackerComponentAllocationsBarDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InvestmentsTrackerComponentAllocationsBarDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InvestmentsTrackerComponentAllocationsBarDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InvestmentsTrackerComponentAllocationsBarDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentAllocationsBarDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.InvestmentsTrackerComponentAllocationsBarDetailsDto";
        }
    }
}
