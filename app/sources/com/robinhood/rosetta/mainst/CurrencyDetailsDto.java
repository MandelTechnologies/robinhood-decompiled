package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.mainst.CurrencyDetailsDto;
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.TimeDto;
import com.squareup.wire.ProtoAdapter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import rosetta.mainst.CurrencyType;
import rosetta.mainst.CurrencyTypeDto;
import rosetta.mainst.InstrumentState;
import rosetta.mainst.InstrumentStateDto;

/* compiled from: CurrencyDetailsDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000489:;B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u008b\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0011¢\u0006\u0004\b\u0006\u0010\u0018J\u0088\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0011J\b\u0010*\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020\tH\u0016J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u000201H\u0016J\u0018\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000201H\u0016J\b\u00107\u001a\u000201H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00118F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u00118F¢\u0006\u0006\u001a\u0004\b(\u0010\"¨\u0006<"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/CurrencyDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto$Surrogate;)V", "code", "", "name", "brand_color", "currency_type", "Lrosetta/mainst/CurrencyTypeDto;", "Increment", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "crypto_metadata", "", "created_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "updated_at", "state", "Lrosetta/mainst/InstrumentStateDto;", "state_by_region", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/CurrencyTypeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/util/Map;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/InstrumentStateDto;Ljava/util/Map;)V", "getCode", "()Ljava/lang/String;", "getName", "getBrand_color", "getCurrency_type", "()Lrosetta/mainst/CurrencyTypeDto;", "getIncrement", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getCrypto_metadata", "()Ljava/util/Map;", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getUpdated_at", "getState", "()Lrosetta/mainst/InstrumentStateDto;", "getState_by_region", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class CurrencyDetailsDto implements Dto3<CurrencyDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CurrencyDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CurrencyDetailsDto, CurrencyDetails>> binaryBase64Serializer$delegate;
    private static final CurrencyDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CurrencyDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CurrencyDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getCode() {
        return this.surrogate.getCode();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final String getBrand_color() {
        return this.surrogate.getBrand_color();
    }

    public final CurrencyTypeDto getCurrency_type() {
        return this.surrogate.getCurrency_type();
    }

    public final DecimalDto getIncrement() {
        return this.surrogate.getIncrement();
    }

    public final Map<String, String> getCrypto_metadata() {
        return this.surrogate.getCrypto_metadata();
    }

    public final TimeDto getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final TimeDto getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final InstrumentStateDto getState() {
        return this.surrogate.getState();
    }

    public final Map<String, InstrumentStateDto> getState_by_region() {
        return this.surrogate.getState_by_region();
    }

    public /* synthetic */ CurrencyDetailsDto(String str, String str2, String str3, CurrencyTypeDto currencyTypeDto, DecimalDto decimalDto, Map map, TimeDto timeDto, TimeDto timeDto2, InstrumentStateDto instrumentStateDto, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CurrencyTypeDto.INSTANCE.getZeroValue() : currencyTypeDto, (i & 16) != 0 ? null : decimalDto, (i & 32) != 0 ? MapsKt.emptyMap() : map, (i & 64) != 0 ? null : timeDto, (i & 128) != 0 ? null : timeDto2, (i & 256) != 0 ? InstrumentStateDto.INSTANCE.getZeroValue() : instrumentStateDto, (i & 512) != 0 ? MapsKt.emptyMap() : map2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CurrencyDetailsDto(String code, String name, String brand_color, CurrencyTypeDto currency_type, DecimalDto decimalDto, Map<String, String> crypto_metadata, TimeDto timeDto, TimeDto timeDto2, InstrumentStateDto state, Map<String, ? extends InstrumentStateDto> state_by_region) {
        this(new Surrogate(code, name, brand_color, currency_type, decimalDto, crypto_metadata, timeDto, timeDto2, state, state_by_region));
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(brand_color, "brand_color");
        Intrinsics.checkNotNullParameter(currency_type, "currency_type");
        Intrinsics.checkNotNullParameter(crypto_metadata, "crypto_metadata");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(state_by_region, "state_by_region");
    }

    public static /* synthetic */ CurrencyDetailsDto copy$default(CurrencyDetailsDto currencyDetailsDto, String str, String str2, String str3, CurrencyTypeDto currencyTypeDto, DecimalDto decimalDto, Map map, TimeDto timeDto, TimeDto timeDto2, InstrumentStateDto instrumentStateDto, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currencyDetailsDto.surrogate.getCode();
        }
        if ((i & 2) != 0) {
            str2 = currencyDetailsDto.surrogate.getName();
        }
        if ((i & 4) != 0) {
            str3 = currencyDetailsDto.surrogate.getBrand_color();
        }
        if ((i & 8) != 0) {
            currencyTypeDto = currencyDetailsDto.surrogate.getCurrency_type();
        }
        if ((i & 16) != 0) {
            decimalDto = currencyDetailsDto.surrogate.getIncrement();
        }
        if ((i & 32) != 0) {
            map = currencyDetailsDto.surrogate.getCrypto_metadata();
        }
        if ((i & 64) != 0) {
            timeDto = currencyDetailsDto.surrogate.getCreated_at();
        }
        if ((i & 128) != 0) {
            timeDto2 = currencyDetailsDto.surrogate.getUpdated_at();
        }
        if ((i & 256) != 0) {
            instrumentStateDto = currencyDetailsDto.surrogate.getState();
        }
        if ((i & 512) != 0) {
            map2 = currencyDetailsDto.surrogate.getState_by_region();
        }
        InstrumentStateDto instrumentStateDto2 = instrumentStateDto;
        Map map3 = map2;
        TimeDto timeDto3 = timeDto;
        TimeDto timeDto4 = timeDto2;
        DecimalDto decimalDto2 = decimalDto;
        Map map4 = map;
        return currencyDetailsDto.copy(str, str2, str3, currencyTypeDto, decimalDto2, map4, timeDto3, timeDto4, instrumentStateDto2, map3);
    }

    public final CurrencyDetailsDto copy(String code, String name, String brand_color, CurrencyTypeDto currency_type, DecimalDto Increment, Map<String, String> crypto_metadata, TimeDto created_at, TimeDto updated_at, InstrumentStateDto state, Map<String, ? extends InstrumentStateDto> state_by_region) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(brand_color, "brand_color");
        Intrinsics.checkNotNullParameter(currency_type, "currency_type");
        Intrinsics.checkNotNullParameter(crypto_metadata, "crypto_metadata");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(state_by_region, "state_by_region");
        return new CurrencyDetailsDto(new Surrogate(code, name, brand_color, currency_type, Increment, crypto_metadata, created_at, updated_at, state, state_by_region));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CurrencyDetails toProto() {
        String code = this.surrogate.getCode();
        String name = this.surrogate.getName();
        String brand_color = this.surrogate.getBrand_color();
        CurrencyType currencyType = (CurrencyType) this.surrogate.getCurrency_type().toProto();
        DecimalDto increment = this.surrogate.getIncrement();
        Decimal proto = increment != null ? increment.toProto() : null;
        Set<Map.Entry<String, String>> setEntrySet = this.surrogate.getCrypto_metadata().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        TimeDto created_at = this.surrogate.getCreated_at();
        Time proto2 = created_at != null ? created_at.toProto() : null;
        TimeDto updated_at = this.surrogate.getUpdated_at();
        Time proto3 = updated_at != null ? updated_at.toProto() : null;
        InstrumentState instrumentState = (InstrumentState) this.surrogate.getState().toProto();
        Set<Map.Entry<String, InstrumentStateDto>> setEntrySet2 = this.surrogate.getState_by_region().entrySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet2, 10)), 16));
        Iterator<T> it2 = setEntrySet2.iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            Tuples2 tuples2M3642to2 = Tuples4.m3642to((String) entry2.getKey(), ((InstrumentStateDto) entry2.getValue()).toProto());
            linkedHashMap2.put(tuples2M3642to2.getFirst(), tuples2M3642to2.getSecond());
        }
        return new CurrencyDetails(code, name, brand_color, currencyType, proto, linkedHashMap, proto2, proto3, instrumentState, linkedHashMap2, null, 1024, null);
    }

    public String toString() {
        return "[CurrencyDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CurrencyDetailsDto) && Intrinsics.areEqual(((CurrencyDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: CurrencyDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 M2\u00020\u0001:\u0002LMB\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0004\b\u0012\u0010\u0013B\u0097\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0012\u0010\u0018J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0015\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010<\u001a\u00020\u0010HÆ\u0003J\u0015\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000bHÆ\u0003J\u008b\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000bHÆ\u0001J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u0015HÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001J%\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u00002\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0001¢\u0006\u0002\bKR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010#R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&R(\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010)R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010,R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010,R\u001c\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001a\u001a\u0004\b0\u00101R(\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010)¨\u0006N"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto$Surrogate;", "", "code", "", "name", "brand_color", "currency_type", "Lrosetta/mainst/CurrencyTypeDto;", "Increment", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "crypto_metadata", "", "created_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "updated_at", "state", "Lrosetta/mainst/InstrumentStateDto;", "state_by_region", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/CurrencyTypeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/util/Map;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/InstrumentStateDto;Ljava/util/Map;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/CurrencyTypeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Ljava/util/Map;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/InstrumentStateDto;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCode$annotations", "()V", "getCode", "()Ljava/lang/String;", "getName$annotations", "getName", "getBrand_color$annotations", "getBrand_color", "getCurrency_type$annotations", "getCurrency_type", "()Lrosetta/mainst/CurrencyTypeDto;", "getIncrement$annotations", "getIncrement", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getCrypto_metadata$annotations", "getCrypto_metadata", "()Ljava/util/Map;", "getCreated_at$annotations", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getUpdated_at$annotations", "getUpdated_at", "getState$annotations", "getState", "()Lrosetta/mainst/InstrumentStateDto;", "getState_by_region$annotations", "getState_by_region", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DecimalDto Increment;
        private final String brand_color;
        private final String code;
        private final TimeDto created_at;
        private final Map<String, String> crypto_metadata;
        private final CurrencyTypeDto currency_type;
        private final String name;
        private final InstrumentStateDto state;
        private final Map<String, InstrumentStateDto> state_by_region;
        private final TimeDto updated_at;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (CurrencyTypeDto) null, (DecimalDto) null, (Map) null, (TimeDto) null, (TimeDto) null, (InstrumentStateDto) null, (Map) null, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new LinkedHashMapSerializer(StringSerializer.INSTANCE, InstrumentStateDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, CurrencyTypeDto currencyTypeDto, DecimalDto decimalDto, Map map, TimeDto timeDto, TimeDto timeDto2, InstrumentStateDto instrumentStateDto, Map map2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.code;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.name;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.brand_color;
            }
            if ((i & 8) != 0) {
                currencyTypeDto = surrogate.currency_type;
            }
            if ((i & 16) != 0) {
                decimalDto = surrogate.Increment;
            }
            if ((i & 32) != 0) {
                map = surrogate.crypto_metadata;
            }
            if ((i & 64) != 0) {
                timeDto = surrogate.created_at;
            }
            if ((i & 128) != 0) {
                timeDto2 = surrogate.updated_at;
            }
            if ((i & 256) != 0) {
                instrumentStateDto = surrogate.state;
            }
            if ((i & 512) != 0) {
                map2 = surrogate.state_by_region;
            }
            InstrumentStateDto instrumentStateDto2 = instrumentStateDto;
            Map map3 = map2;
            TimeDto timeDto3 = timeDto;
            TimeDto timeDto4 = timeDto2;
            DecimalDto decimalDto2 = decimalDto;
            Map map4 = map;
            return surrogate.copy(str, str2, str3, currencyTypeDto, decimalDto2, map4, timeDto3, timeDto4, instrumentStateDto2, map3);
        }

        @SerialName("brandColor")
        @JsonAnnotations2(names = {"brand_color"})
        public static /* synthetic */ void getBrand_color$annotations() {
        }

        @SerialName("code")
        @JsonAnnotations2(names = {"code"})
        public static /* synthetic */ void getCode$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("cryptoMetadata")
        @JsonAnnotations2(names = {"crypto_metadata"})
        public static /* synthetic */ void getCrypto_metadata$annotations() {
        }

        @SerialName("currencyType")
        @JsonAnnotations2(names = {"currency_type"})
        public static /* synthetic */ void getCurrency_type$annotations() {
        }

        @SerialName("Increment")
        @JsonAnnotations2(names = {"Increment"})
        public static /* synthetic */ void getIncrement$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("stateByRegion")
        @JsonAnnotations2(names = {"state_by_region"})
        public static /* synthetic */ void getState_by_region$annotations() {
        }

        @SerialName("updatedAt")
        @JsonAnnotations2(names = {"updated_at"})
        public static /* synthetic */ void getUpdated_at$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public final Map<String, InstrumentStateDto> component10() {
            return this.state_by_region;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBrand_color() {
            return this.brand_color;
        }

        /* renamed from: component4, reason: from getter */
        public final CurrencyTypeDto getCurrency_type() {
            return this.currency_type;
        }

        /* renamed from: component5, reason: from getter */
        public final DecimalDto getIncrement() {
            return this.Increment;
        }

        public final Map<String, String> component6() {
            return this.crypto_metadata;
        }

        /* renamed from: component7, reason: from getter */
        public final TimeDto getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component8, reason: from getter */
        public final TimeDto getUpdated_at() {
            return this.updated_at;
        }

        /* renamed from: component9, reason: from getter */
        public final InstrumentStateDto getState() {
            return this.state;
        }

        public final Surrogate copy(String code, String name, String brand_color, CurrencyTypeDto currency_type, DecimalDto Increment, Map<String, String> crypto_metadata, TimeDto created_at, TimeDto updated_at, InstrumentStateDto state, Map<String, ? extends InstrumentStateDto> state_by_region) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(brand_color, "brand_color");
            Intrinsics.checkNotNullParameter(currency_type, "currency_type");
            Intrinsics.checkNotNullParameter(crypto_metadata, "crypto_metadata");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(state_by_region, "state_by_region");
            return new Surrogate(code, name, brand_color, currency_type, Increment, crypto_metadata, created_at, updated_at, state, state_by_region);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.code, surrogate.code) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.brand_color, surrogate.brand_color) && this.currency_type == surrogate.currency_type && Intrinsics.areEqual(this.Increment, surrogate.Increment) && Intrinsics.areEqual(this.crypto_metadata, surrogate.crypto_metadata) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && this.state == surrogate.state && Intrinsics.areEqual(this.state_by_region, surrogate.state_by_region);
        }

        public int hashCode() {
            int iHashCode = ((((((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + this.brand_color.hashCode()) * 31) + this.currency_type.hashCode()) * 31;
            DecimalDto decimalDto = this.Increment;
            int iHashCode2 = (((iHashCode + (decimalDto == null ? 0 : decimalDto.hashCode())) * 31) + this.crypto_metadata.hashCode()) * 31;
            TimeDto timeDto = this.created_at;
            int iHashCode3 = (iHashCode2 + (timeDto == null ? 0 : timeDto.hashCode())) * 31;
            TimeDto timeDto2 = this.updated_at;
            return ((((iHashCode3 + (timeDto2 != null ? timeDto2.hashCode() : 0)) * 31) + this.state.hashCode()) * 31) + this.state_by_region.hashCode();
        }

        public String toString() {
            return "Surrogate(code=" + this.code + ", name=" + this.name + ", brand_color=" + this.brand_color + ", currency_type=" + this.currency_type + ", Increment=" + this.Increment + ", crypto_metadata=" + this.crypto_metadata + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", state=" + this.state + ", state_by_region=" + this.state_by_region + ")";
        }

        /* compiled from: CurrencyDetailsDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CurrencyDetailsDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.CurrencyDetailsDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CurrencyDetailsDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.CurrencyDetailsDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CurrencyDetailsDto.Surrogate._childSerializers$_anonymous_$0();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, CurrencyTypeDto currencyTypeDto, DecimalDto decimalDto, Map map, TimeDto timeDto, TimeDto timeDto2, InstrumentStateDto instrumentStateDto, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.code = "";
            } else {
                this.code = str;
            }
            if ((i & 2) == 0) {
                this.name = "";
            } else {
                this.name = str2;
            }
            if ((i & 4) == 0) {
                this.brand_color = "";
            } else {
                this.brand_color = str3;
            }
            if ((i & 8) == 0) {
                this.currency_type = CurrencyTypeDto.INSTANCE.getZeroValue();
            } else {
                this.currency_type = currencyTypeDto;
            }
            if ((i & 16) == 0) {
                this.Increment = null;
            } else {
                this.Increment = decimalDto;
            }
            if ((i & 32) == 0) {
                this.crypto_metadata = MapsKt.emptyMap();
            } else {
                this.crypto_metadata = map;
            }
            if ((i & 64) == 0) {
                this.created_at = null;
            } else {
                this.created_at = timeDto;
            }
            if ((i & 128) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = timeDto2;
            }
            if ((i & 256) == 0) {
                this.state = InstrumentStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = instrumentStateDto;
            }
            if ((i & 512) == 0) {
                this.state_by_region = MapsKt.emptyMap();
            } else {
                this.state_by_region = map2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.code, "")) {
                output.encodeStringElement(serialDesc, 0, self.code);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 1, self.name);
            }
            if (!Intrinsics.areEqual(self.brand_color, "")) {
                output.encodeStringElement(serialDesc, 2, self.brand_color);
            }
            if (self.currency_type != CurrencyTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, CurrencyTypeDto.Serializer.INSTANCE, self.currency_type);
            }
            DecimalDto decimalDto = self.Increment;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            if (!Intrinsics.areEqual(self.crypto_metadata, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.crypto_metadata);
            }
            TimeDto timeDto = self.created_at;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, TimeDto.Serializer.INSTANCE, timeDto);
            }
            TimeDto timeDto2 = self.updated_at;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            if (self.state != InstrumentStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, InstrumentStateDto.Serializer.INSTANCE, self.state);
            }
            if (Intrinsics.areEqual(self.state_by_region, MapsKt.emptyMap())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 9, lazyArr[9].getValue(), self.state_by_region);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(String code, String name, String brand_color, CurrencyTypeDto currency_type, DecimalDto decimalDto, Map<String, String> crypto_metadata, TimeDto timeDto, TimeDto timeDto2, InstrumentStateDto state, Map<String, ? extends InstrumentStateDto> state_by_region) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(brand_color, "brand_color");
            Intrinsics.checkNotNullParameter(currency_type, "currency_type");
            Intrinsics.checkNotNullParameter(crypto_metadata, "crypto_metadata");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(state_by_region, "state_by_region");
            this.code = code;
            this.name = name;
            this.brand_color = brand_color;
            this.currency_type = currency_type;
            this.Increment = decimalDto;
            this.crypto_metadata = crypto_metadata;
            this.created_at = timeDto;
            this.updated_at = timeDto2;
            this.state = state;
            this.state_by_region = state_by_region;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, CurrencyTypeDto currencyTypeDto, DecimalDto decimalDto, Map map, TimeDto timeDto, TimeDto timeDto2, InstrumentStateDto instrumentStateDto, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CurrencyTypeDto.INSTANCE.getZeroValue() : currencyTypeDto, (i & 16) != 0 ? null : decimalDto, (i & 32) != 0 ? MapsKt.emptyMap() : map, (i & 64) != 0 ? null : timeDto, (i & 128) != 0 ? null : timeDto2, (i & 256) != 0 ? InstrumentStateDto.INSTANCE.getZeroValue() : instrumentStateDto, (i & 512) != 0 ? MapsKt.emptyMap() : map2);
        }

        public final String getCode() {
            return this.code;
        }

        public final String getName() {
            return this.name;
        }

        public final String getBrand_color() {
            return this.brand_color;
        }

        public final CurrencyTypeDto getCurrency_type() {
            return this.currency_type;
        }

        public final DecimalDto getIncrement() {
            return this.Increment;
        }

        public final Map<String, String> getCrypto_metadata() {
            return this.crypto_metadata;
        }

        public final TimeDto getCreated_at() {
            return this.created_at;
        }

        public final TimeDto getUpdated_at() {
            return this.updated_at;
        }

        public final InstrumentStateDto getState() {
            return this.state;
        }

        public final Map<String, InstrumentStateDto> getState_by_region() {
            return this.state_by_region;
        }
    }

    /* compiled from: CurrencyDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto;", "Lcom/robinhood/rosetta/mainst/CurrencyDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CurrencyDetailsDto, CurrencyDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CurrencyDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CurrencyDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CurrencyDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) CurrencyDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CurrencyDetails> getProtoAdapter() {
            return CurrencyDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CurrencyDetailsDto getZeroValue() {
            return CurrencyDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CurrencyDetailsDto fromProto(CurrencyDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String code = proto.getCode();
            String name = proto.getName();
            String brand_color = proto.getBrand_color();
            CurrencyTypeDto currencyTypeDtoFromProto = CurrencyTypeDto.INSTANCE.fromProto(proto.getCurrency_type());
            Decimal increment = proto.getIncrement();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DecimalDto decimalDtoFromProto = increment != null ? DecimalDto.INSTANCE.fromProto(increment) : null;
            Set<Map.Entry<String, String>> setEntrySet = proto.getCrypto_metadata().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            Time created_at = proto.getCreated_at();
            TimeDto timeDtoFromProto = created_at != null ? TimeDto.INSTANCE.fromProto(created_at) : null;
            Time updated_at = proto.getUpdated_at();
            TimeDto timeDtoFromProto2 = updated_at != null ? TimeDto.INSTANCE.fromProto(updated_at) : null;
            InstrumentStateDto instrumentStateDtoFromProto = InstrumentStateDto.INSTANCE.fromProto(proto.getState());
            Set<Map.Entry<String, InstrumentState>> setEntrySet2 = proto.getState_by_region().entrySet();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet2, 10)), 16));
            Iterator<T> it2 = setEntrySet2.iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                Tuples2 tuples2M3642to2 = Tuples4.m3642to((String) entry2.getKey(), InstrumentStateDto.INSTANCE.fromProto((InstrumentState) entry2.getValue()));
                linkedHashMap2.put(tuples2M3642to2.getFirst(), tuples2M3642to2.getSecond());
            }
            return new CurrencyDetailsDto(new Surrogate(code, name, brand_color, currencyTypeDtoFromProto, decimalDtoFromProto, linkedHashMap, timeDtoFromProto, timeDtoFromProto2, instrumentStateDtoFromProto, linkedHashMap2), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.CurrencyDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurrencyDetailsDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new CurrencyDetailsDto(null, null, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CurrencyDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CurrencyDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.CurrencyDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CurrencyDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CurrencyDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CurrencyDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CurrencyDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.CurrencyDetailsDto";
        }
    }
}
