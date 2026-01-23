package com.robinhood.rosetta.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.cashier.PlaidSignalAttributesDto;
import com.squareup.wire.ProtoAdapter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: PlaidSignalAttributesDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BG\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0006\u0010\u0010JD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eJ\b\u0010\u0019\u001a\u00020\u0002H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020\tH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\tH\u0016J\b\u0010%\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/cashier/PlaidSignalAttributes;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto$Surrogate;)V", "bank_initiated_return_risk_score", "", "bank_initiated_return_risk_tier", "customer_initiated_return_risk_score", "customer_initiated_return_risk_tier", "core_attributes", "", "", "(IIIILjava/util/Map;)V", "getBank_initiated_return_risk_score", "()I", "getBank_initiated_return_risk_tier", "getCustomer_initiated_return_risk_score", "getCustomer_initiated_return_risk_tier", "getCore_attributes", "()Ljava/util/Map;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class PlaidSignalAttributesDto implements Dto3<PlaidSignalAttributes>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PlaidSignalAttributesDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PlaidSignalAttributesDto, PlaidSignalAttributes>> binaryBase64Serializer$delegate;
    private static final PlaidSignalAttributesDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PlaidSignalAttributesDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PlaidSignalAttributesDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final int getBank_initiated_return_risk_score() {
        return this.surrogate.getBank_initiated_return_risk_score();
    }

    public final int getBank_initiated_return_risk_tier() {
        return this.surrogate.getBank_initiated_return_risk_tier();
    }

    public final int getCustomer_initiated_return_risk_score() {
        return this.surrogate.getCustomer_initiated_return_risk_score();
    }

    public final int getCustomer_initiated_return_risk_tier() {
        return this.surrogate.getCustomer_initiated_return_risk_tier();
    }

    public final Map<String, String> getCore_attributes() {
        return this.surrogate.getCore_attributes();
    }

    public /* synthetic */ PlaidSignalAttributesDto(int i, int i2, int i3, int i4, Map map, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, (i5 & 16) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidSignalAttributesDto(int i, int i2, int i3, int i4, Map<String, String> core_attributes) {
        this(new Surrogate(i, i2, i3, i4, core_attributes));
        Intrinsics.checkNotNullParameter(core_attributes, "core_attributes");
    }

    public static /* synthetic */ PlaidSignalAttributesDto copy$default(PlaidSignalAttributesDto plaidSignalAttributesDto, int i, int i2, int i3, int i4, Map map, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = plaidSignalAttributesDto.surrogate.getBank_initiated_return_risk_score();
        }
        if ((i5 & 2) != 0) {
            i2 = plaidSignalAttributesDto.surrogate.getBank_initiated_return_risk_tier();
        }
        if ((i5 & 4) != 0) {
            i3 = plaidSignalAttributesDto.surrogate.getCustomer_initiated_return_risk_score();
        }
        if ((i5 & 8) != 0) {
            i4 = plaidSignalAttributesDto.surrogate.getCustomer_initiated_return_risk_tier();
        }
        if ((i5 & 16) != 0) {
            map = plaidSignalAttributesDto.surrogate.getCore_attributes();
        }
        Map map2 = map;
        int i6 = i3;
        return plaidSignalAttributesDto.copy(i, i2, i6, i4, map2);
    }

    public final PlaidSignalAttributesDto copy(int bank_initiated_return_risk_score, int bank_initiated_return_risk_tier, int customer_initiated_return_risk_score, int customer_initiated_return_risk_tier, Map<String, String> core_attributes) {
        Intrinsics.checkNotNullParameter(core_attributes, "core_attributes");
        return new PlaidSignalAttributesDto(new Surrogate(bank_initiated_return_risk_score, bank_initiated_return_risk_tier, customer_initiated_return_risk_score, customer_initiated_return_risk_tier, core_attributes));
    }

    @Override // com.robinhood.idl.Dto
    public PlaidSignalAttributes toProto() {
        int bank_initiated_return_risk_score = this.surrogate.getBank_initiated_return_risk_score();
        int bank_initiated_return_risk_tier = this.surrogate.getBank_initiated_return_risk_tier();
        int customer_initiated_return_risk_score = this.surrogate.getCustomer_initiated_return_risk_score();
        int customer_initiated_return_risk_tier = this.surrogate.getCustomer_initiated_return_risk_tier();
        Set<Map.Entry<String, String>> setEntrySet = this.surrogate.getCore_attributes().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return new PlaidSignalAttributes(bank_initiated_return_risk_score, bank_initiated_return_risk_tier, customer_initiated_return_risk_score, customer_initiated_return_risk_tier, linkedHashMap, null, 32, null);
    }

    public String toString() {
        return "[PlaidSignalAttributesDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PlaidSignalAttributesDto) && Intrinsics.areEqual(((PlaidSignalAttributesDto) other).surrogate, this.surrogate);
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
    /* compiled from: PlaidSignalAttributesDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000234B\u0081\u0001\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eBQ\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\u0018\u0010 \u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010!\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010\"\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010#\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0083\u0001\u0010%\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\fHÖ\u0001J%\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R+\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R+\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R(\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001f¨\u00065"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto$Surrogate;", "", "bank_initiated_return_risk_score", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "bank_initiated_return_risk_tier", "customer_initiated_return_risk_score", "customer_initiated_return_risk_tier", "core_attributes", "", "", "<init>", "(IIIILjava/util/Map;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIIILjava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBank_initiated_return_risk_score$annotations", "()V", "getBank_initiated_return_risk_score", "()I", "getBank_initiated_return_risk_tier$annotations", "getBank_initiated_return_risk_tier", "getCustomer_initiated_return_risk_score$annotations", "getCustomer_initiated_return_risk_score", "getCustomer_initiated_return_risk_tier$annotations", "getCustomer_initiated_return_risk_tier", "getCore_attributes$annotations", "getCore_attributes", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_cashier_externalRelease", "$serializer", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final int bank_initiated_return_risk_score;
        private final int bank_initiated_return_risk_tier;
        private final Map<String, String> core_attributes;
        private final int customer_initiated_return_risk_score;
        private final int customer_initiated_return_risk_tier;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.cashier.PlaidSignalAttributesDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlaidSignalAttributesDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this(0, 0, 0, 0, (Map) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, int i, int i2, int i3, int i4, Map map, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = surrogate.bank_initiated_return_risk_score;
            }
            if ((i5 & 2) != 0) {
                i2 = surrogate.bank_initiated_return_risk_tier;
            }
            if ((i5 & 4) != 0) {
                i3 = surrogate.customer_initiated_return_risk_score;
            }
            if ((i5 & 8) != 0) {
                i4 = surrogate.customer_initiated_return_risk_tier;
            }
            if ((i5 & 16) != 0) {
                map = surrogate.core_attributes;
            }
            Map map2 = map;
            int i6 = i3;
            return surrogate.copy(i, i2, i6, i4, map2);
        }

        @SerialName("bankInitiatedReturnRiskScore")
        @JsonAnnotations2(names = {"bank_initiated_return_risk_score"})
        public static /* synthetic */ void getBank_initiated_return_risk_score$annotations() {
        }

        @SerialName("bankInitiatedReturnRiskTier")
        @JsonAnnotations2(names = {"bank_initiated_return_risk_tier"})
        public static /* synthetic */ void getBank_initiated_return_risk_tier$annotations() {
        }

        @SerialName("coreAttributes")
        @JsonAnnotations2(names = {"core_attributes"})
        public static /* synthetic */ void getCore_attributes$annotations() {
        }

        @SerialName("customerInitiatedReturnRiskScore")
        @JsonAnnotations2(names = {"customer_initiated_return_risk_score"})
        public static /* synthetic */ void getCustomer_initiated_return_risk_score$annotations() {
        }

        @SerialName("customerInitiatedReturnRiskTier")
        @JsonAnnotations2(names = {"customer_initiated_return_risk_tier"})
        public static /* synthetic */ void getCustomer_initiated_return_risk_tier$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final int getBank_initiated_return_risk_score() {
            return this.bank_initiated_return_risk_score;
        }

        /* renamed from: component2, reason: from getter */
        public final int getBank_initiated_return_risk_tier() {
            return this.bank_initiated_return_risk_tier;
        }

        /* renamed from: component3, reason: from getter */
        public final int getCustomer_initiated_return_risk_score() {
            return this.customer_initiated_return_risk_score;
        }

        /* renamed from: component4, reason: from getter */
        public final int getCustomer_initiated_return_risk_tier() {
            return this.customer_initiated_return_risk_tier;
        }

        public final Map<String, String> component5() {
            return this.core_attributes;
        }

        public final Surrogate copy(int bank_initiated_return_risk_score, int bank_initiated_return_risk_tier, int customer_initiated_return_risk_score, int customer_initiated_return_risk_tier, Map<String, String> core_attributes) {
            Intrinsics.checkNotNullParameter(core_attributes, "core_attributes");
            return new Surrogate(bank_initiated_return_risk_score, bank_initiated_return_risk_tier, customer_initiated_return_risk_score, customer_initiated_return_risk_tier, core_attributes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.bank_initiated_return_risk_score == surrogate.bank_initiated_return_risk_score && this.bank_initiated_return_risk_tier == surrogate.bank_initiated_return_risk_tier && this.customer_initiated_return_risk_score == surrogate.customer_initiated_return_risk_score && this.customer_initiated_return_risk_tier == surrogate.customer_initiated_return_risk_tier && Intrinsics.areEqual(this.core_attributes, surrogate.core_attributes);
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.bank_initiated_return_risk_score) * 31) + Integer.hashCode(this.bank_initiated_return_risk_tier)) * 31) + Integer.hashCode(this.customer_initiated_return_risk_score)) * 31) + Integer.hashCode(this.customer_initiated_return_risk_tier)) * 31) + this.core_attributes.hashCode();
        }

        public String toString() {
            return "Surrogate(bank_initiated_return_risk_score=" + this.bank_initiated_return_risk_score + ", bank_initiated_return_risk_tier=" + this.bank_initiated_return_risk_tier + ", customer_initiated_return_risk_score=" + this.customer_initiated_return_risk_score + ", customer_initiated_return_risk_tier=" + this.customer_initiated_return_risk_tier + ", core_attributes=" + this.core_attributes + ")";
        }

        /* compiled from: PlaidSignalAttributesDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto$Surrogate;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PlaidSignalAttributesDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, int i3, int i4, int i5, Map map, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.bank_initiated_return_risk_score = 0;
            } else {
                this.bank_initiated_return_risk_score = i2;
            }
            if ((i & 2) == 0) {
                this.bank_initiated_return_risk_tier = 0;
            } else {
                this.bank_initiated_return_risk_tier = i3;
            }
            if ((i & 4) == 0) {
                this.customer_initiated_return_risk_score = 0;
            } else {
                this.customer_initiated_return_risk_score = i4;
            }
            if ((i & 8) == 0) {
                this.customer_initiated_return_risk_tier = 0;
            } else {
                this.customer_initiated_return_risk_tier = i5;
            }
            if ((i & 16) == 0) {
                this.core_attributes = MapsKt.emptyMap();
            } else {
                this.core_attributes = map;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_cashier_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            int i = self.bank_initiated_return_risk_score;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.bank_initiated_return_risk_tier;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            int i3 = self.customer_initiated_return_risk_score;
            if (i3 != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
            }
            int i4 = self.customer_initiated_return_risk_tier;
            if (i4 != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i4));
            }
            if (Intrinsics.areEqual(self.core_attributes, MapsKt.emptyMap())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.core_attributes);
        }

        public Surrogate(int i, int i2, int i3, int i4, Map<String, String> core_attributes) {
            Intrinsics.checkNotNullParameter(core_attributes, "core_attributes");
            this.bank_initiated_return_risk_score = i;
            this.bank_initiated_return_risk_tier = i2;
            this.customer_initiated_return_risk_score = i3;
            this.customer_initiated_return_risk_tier = i4;
            this.core_attributes = core_attributes;
        }

        public final int getBank_initiated_return_risk_score() {
            return this.bank_initiated_return_risk_score;
        }

        public final int getBank_initiated_return_risk_tier() {
            return this.bank_initiated_return_risk_tier;
        }

        public final int getCustomer_initiated_return_risk_score() {
            return this.customer_initiated_return_risk_score;
        }

        public final int getCustomer_initiated_return_risk_tier() {
            return this.customer_initiated_return_risk_tier;
        }

        public final Map<String, String> getCore_attributes() {
            return this.core_attributes;
        }

        public /* synthetic */ Surrogate(int i, int i2, int i3, int i4, Map map, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, (i5 & 16) != 0 ? MapsKt.emptyMap() : map);
        }
    }

    /* compiled from: PlaidSignalAttributesDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto;", "Lcom/robinhood/rosetta/cashier/PlaidSignalAttributes;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PlaidSignalAttributesDto, PlaidSignalAttributes> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PlaidSignalAttributesDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PlaidSignalAttributesDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PlaidSignalAttributesDto> getBinaryBase64Serializer() {
            return (KSerializer) PlaidSignalAttributesDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PlaidSignalAttributes> getProtoAdapter() {
            return PlaidSignalAttributes.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PlaidSignalAttributesDto getZeroValue() {
            return PlaidSignalAttributesDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PlaidSignalAttributesDto fromProto(PlaidSignalAttributes proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int bank_initiated_return_risk_score = proto.getBank_initiated_return_risk_score();
            int bank_initiated_return_risk_tier = proto.getBank_initiated_return_risk_tier();
            int customer_initiated_return_risk_score = proto.getCustomer_initiated_return_risk_score();
            int customer_initiated_return_risk_tier = proto.getCustomer_initiated_return_risk_tier();
            Set<Map.Entry<String, String>> setEntrySet = proto.getCore_attributes().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            return new PlaidSignalAttributesDto(new Surrogate(bank_initiated_return_risk_score, bank_initiated_return_risk_tier, customer_initiated_return_risk_score, customer_initiated_return_risk_tier, linkedHashMap), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.PlaidSignalAttributesDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlaidSignalAttributesDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new PlaidSignalAttributesDto(0, 0, 0, 0, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PlaidSignalAttributesDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PlaidSignalAttributesDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.cashier.PlaidSignalAttributes", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PlaidSignalAttributesDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PlaidSignalAttributesDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PlaidSignalAttributesDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PlaidSignalAttributesDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/PlaidSignalAttributesDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.cashier.PlaidSignalAttributesDto";
        }
    }
}
