package accio.service.p003v1;

import accio.service.p003v1.AccountStateDto;
import accio.service.p003v1.AccountSubtypeDto;
import accio.service.p003v1.AccountTypeDto;
import accio.service.p003v1.EntityDto;
import accio.service.p003v1.LinkedAccountDto;
import accio.service.p003v1.PlaidAccountDetailsDto;
import accio.service.p003v1.PurposeDto;
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
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p479j$.time.Instant;

/* compiled from: LinkedAccountDto.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005;:<=>B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B¹\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u0006\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020,H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020,H\u0016¢\u0006\u0004\b5\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0011\u0010\u0017\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b7\u0010&R\u0011\u0010\u001f\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006?"}, m3636d2 = {"Laccio/service/v1/LinkedAccountDto;", "Lcom/robinhood/idl/MessageDto;", "Laccio/service/v1/LinkedAccount;", "Landroid/os/Parcelable;", "Laccio/service/v1/LinkedAccountDto$Surrogate;", "surrogate", "<init>", "(Laccio/service/v1/LinkedAccountDto$Surrogate;)V", "", "account_id", "", "metadata", "name", "official_name", "Laccio/service/v1/AccountTypeDto;", "type", "Laccio/service/v1/AccountSubtypeDto;", "subtype", "", "Laccio/service/v1/PurposeDto;", "purposes", "Laccio/service/v1/AccountStateDto;", "state", "id", "Laccio/service/v1/EntityDto;", "source_entity", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "lookback_start_time", "last_updated_at_time", "Lcom/robinhood/idl/IdlDecimal;", "earliest_balance", "Laccio/service/v1/LinkedAccountDto$AccountDetailsDto;", "account_details", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Laccio/service/v1/AccountTypeDto;Laccio/service/v1/AccountSubtypeDto;Ljava/util/List;Laccio/service/v1/AccountStateDto;Ljava/lang/String;Laccio/service/v1/EntityDto;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Laccio/service/v1/LinkedAccountDto$AccountDetailsDto;)V", "toProto", "()Laccio/service/v1/LinkedAccount;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Laccio/service/v1/LinkedAccountDto$Surrogate;", "getId", "getEarliest_balance", "()Lcom/robinhood/idl/IdlDecimal;", "Companion", "Surrogate", "AccountDetailsDto", "Serializer", "MultibindingModule", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class LinkedAccountDto implements Dto3<LinkedAccount>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<LinkedAccountDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LinkedAccountDto, LinkedAccount>> binaryBase64Serializer$delegate;
    private static final LinkedAccountDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ LinkedAccountDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LinkedAccountDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final IdlDecimal getEarliest_balance() {
        return this.surrogate.getEarliest_balance();
    }

    public /* synthetic */ LinkedAccountDto(String str, Map map, String str2, String str3, AccountTypeDto accountTypeDto, AccountSubtypeDto accountSubtypeDto, List list, AccountStateDto accountStateDto, String str4, EntityDto entityDto, Instant instant, Instant instant2, IdlDecimal idlDecimal, AccountDetailsDto accountDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MapsKt.emptyMap() : map, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 32) != 0 ? AccountSubtypeDto.INSTANCE.getZeroValue() : accountSubtypeDto, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? AccountStateDto.INSTANCE.getZeroValue() : accountStateDto, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? EntityDto.INSTANCE.getZeroValue() : entityDto, (i & 1024) != 0 ? null : instant, (i & 2048) != 0 ? null : instant2, (i & 4096) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8192) != 0 ? null : accountDetailsDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LinkedAccountDto(String account_id, Map<String, String> metadata, String name, String official_name, AccountTypeDto type2, AccountSubtypeDto subtype, List<? extends PurposeDto> purposes, AccountStateDto state, String id, EntityDto source_entity, Instant instant, Instant instant2, IdlDecimal earliest_balance, AccountDetailsDto accountDetailsDto) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(official_name, "official_name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(source_entity, "source_entity");
        Intrinsics.checkNotNullParameter(earliest_balance, "earliest_balance");
        AccountDetailsDto.PlaidAccountDetails plaidAccountDetails = accountDetailsDto instanceof AccountDetailsDto.PlaidAccountDetails ? (AccountDetailsDto.PlaidAccountDetails) accountDetailsDto : null;
        this(new Surrogate(account_id, metadata, name, official_name, type2, subtype, purposes, state, id, source_entity, instant, instant2, earliest_balance, plaidAccountDetails != null ? plaidAccountDetails.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public LinkedAccount toProto() {
        String account_id = this.surrogate.getAccount_id();
        Set<Map.Entry<String, String>> setEntrySet = this.surrogate.getMetadata().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        String name = this.surrogate.getName();
        String official_name = this.surrogate.getOfficial_name();
        AccountType accountType = (AccountType) this.surrogate.getType().toProto();
        AccountSubtype accountSubtype = (AccountSubtype) this.surrogate.getSubtype().toProto();
        List<PurposeDto> purposes = this.surrogate.getPurposes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(purposes, 10));
        Iterator<T> it2 = purposes.iterator();
        while (it2.hasNext()) {
            arrayList.add((Purpose) ((PurposeDto) it2.next()).toProto());
        }
        AccountState accountState = (AccountState) this.surrogate.getState().toProto();
        String id = this.surrogate.getId();
        Entity entity = (Entity) this.surrogate.getSource_entity().toProto();
        Instant lookback_start_time = this.surrogate.getLookback_start_time();
        Instant last_updated_at_time = this.surrogate.getLast_updated_at_time();
        String stringValue = this.surrogate.getEarliest_balance().getStringValue();
        PlaidAccountDetailsDto plaid_account_details = this.surrogate.getPlaid_account_details();
        return new LinkedAccount(account_id, linkedHashMap, name, official_name, accountType, accountSubtype, plaid_account_details != null ? plaid_account_details.toProto() : null, arrayList, accountState, id, entity, lookback_start_time, last_updated_at_time, stringValue, null, 16384, null);
    }

    public String toString() {
        return "[LinkedAccountDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof LinkedAccountDto) && Intrinsics.areEqual(((LinkedAccountDto) other).surrogate, this.surrogate);
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
    /* compiled from: LinkedAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b5\b\u0083\b\u0018\u0000 h2\u00020\u0001:\u0002ihB\u0082\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012.\b\u0002\u0010\u0019\u001a(\u0018\u00010\u0014j\u0013\u0018\u0001`\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\t0\u0018¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\t0\u0018\u0012.\b\u0002\u0010\u001a\u001a(\u0018\u00010\u0014j\u0013\u0018\u0001`\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\t0\u0018¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\t0\u0018\u0012\u0017\b\u0002\u0010\u001d\u001a\u00110\u001b¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\t0\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!B¹\u0001\b\u0010\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b \u0010&J'\u0010/\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u00101R,\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010<\u0012\u0004\b?\u0010;\u001a\u0004\b=\u0010>R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00108\u0012\u0004\bA\u0010;\u001a\u0004\b@\u00101R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00108\u0012\u0004\bC\u0010;\u001a\u0004\bB\u00101R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010D\u0012\u0004\bG\u0010;\u001a\u0004\bE\u0010FR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010H\u0012\u0004\bK\u0010;\u001a\u0004\bI\u0010JR&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010L\u0012\u0004\bO\u0010;\u001a\u0004\bM\u0010NR \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010P\u0012\u0004\bS\u0010;\u001a\u0004\bQ\u0010RR \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00108\u0012\u0004\bU\u0010;\u001a\u0004\bT\u00101R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010V\u0012\u0004\bY\u0010;\u001a\u0004\bW\u0010XRF\u0010\u0019\u001a(\u0018\u00010\u0014j\u0013\u0018\u0001`\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\t0\u0018¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\t0\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010Z\u0012\u0004\b]\u0010;\u001a\u0004\b[\u0010\\RF\u0010\u001a\u001a(\u0018\u00010\u0014j\u0013\u0018\u0001`\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\t0\u0018¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\t0\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010Z\u0012\u0004\b_\u0010;\u001a\u0004\b^\u0010\\R/\u0010\u001d\u001a\u00110\u001b¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\t0\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010`\u0012\u0004\bc\u0010;\u001a\u0004\ba\u0010bR\"\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010d\u0012\u0004\bg\u0010;\u001a\u0004\be\u0010f¨\u0006j"}, m3636d2 = {"Laccio/service/v1/LinkedAccountDto$Surrogate;", "", "", "account_id", "", "metadata", "name", "official_name", "Laccio/service/v1/AccountTypeDto;", "type", "Laccio/service/v1/AccountSubtypeDto;", "subtype", "", "Laccio/service/v1/PurposeDto;", "purposes", "Laccio/service/v1/AccountStateDto;", "state", "id", "Laccio/service/v1/EntityDto;", "source_entity", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "lookback_start_time", "last_updated_at_time", "Lcom/robinhood/idl/IdlDecimal;", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "earliest_balance", "Laccio/service/v1/PlaidAccountDetailsDto;", "plaid_account_details", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Laccio/service/v1/AccountTypeDto;Laccio/service/v1/AccountSubtypeDto;Ljava/util/List;Laccio/service/v1/AccountStateDto;Ljava/lang/String;Laccio/service/v1/EntityDto;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Laccio/service/v1/PlaidAccountDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Laccio/service/v1/AccountTypeDto;Laccio/service/v1/AccountSubtypeDto;Ljava/util/List;Laccio/service/v1/AccountStateDto;Ljava/lang/String;Laccio/service/v1/EntityDto;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Laccio/service/v1/PlaidAccountDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$accio_service_v1_externalRelease", "(Laccio/service/v1/LinkedAccountDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_id", "getAccount_id$annotations", "()V", "Ljava/util/Map;", "getMetadata", "()Ljava/util/Map;", "getMetadata$annotations", "getName", "getName$annotations", "getOfficial_name", "getOfficial_name$annotations", "Laccio/service/v1/AccountTypeDto;", "getType", "()Laccio/service/v1/AccountTypeDto;", "getType$annotations", "Laccio/service/v1/AccountSubtypeDto;", "getSubtype", "()Laccio/service/v1/AccountSubtypeDto;", "getSubtype$annotations", "Ljava/util/List;", "getPurposes", "()Ljava/util/List;", "getPurposes$annotations", "Laccio/service/v1/AccountStateDto;", "getState", "()Laccio/service/v1/AccountStateDto;", "getState$annotations", "getId", "getId$annotations", "Laccio/service/v1/EntityDto;", "getSource_entity", "()Laccio/service/v1/EntityDto;", "getSource_entity$annotations", "Lj$/time/Instant;", "getLookback_start_time", "()Lj$/time/Instant;", "getLookback_start_time$annotations", "getLast_updated_at_time", "getLast_updated_at_time$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getEarliest_balance", "()Lcom/robinhood/idl/IdlDecimal;", "getEarliest_balance$annotations", "Laccio/service/v1/PlaidAccountDetailsDto;", "getPlaid_account_details", "()Laccio/service/v1/PlaidAccountDetailsDto;", "getPlaid_account_details$annotations", "Companion", "$serializer", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final IdlDecimal earliest_balance;
        private final String id;
        private final Instant last_updated_at_time;
        private final Instant lookback_start_time;
        private final Map<String, String> metadata;
        private final String name;
        private final String official_name;
        private final PlaidAccountDetailsDto plaid_account_details;
        private final List<PurposeDto> purposes;
        private final EntityDto source_entity;
        private final AccountStateDto state;
        private final AccountSubtypeDto subtype;
        private final AccountTypeDto type;

        public Surrogate() {
            this((String) null, (Map) null, (String) null, (String) null, (AccountTypeDto) null, (AccountSubtypeDto) null, (List) null, (AccountStateDto) null, (String) null, (EntityDto) null, (Instant) null, (Instant) null, (IdlDecimal) null, (PlaidAccountDetailsDto) null, 16383, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(PurposeDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.metadata, surrogate.metadata) && Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.official_name, surrogate.official_name) && this.type == surrogate.type && this.subtype == surrogate.subtype && Intrinsics.areEqual(this.purposes, surrogate.purposes) && this.state == surrogate.state && Intrinsics.areEqual(this.id, surrogate.id) && this.source_entity == surrogate.source_entity && Intrinsics.areEqual(this.lookback_start_time, surrogate.lookback_start_time) && Intrinsics.areEqual(this.last_updated_at_time, surrogate.last_updated_at_time) && Intrinsics.areEqual(this.earliest_balance, surrogate.earliest_balance) && Intrinsics.areEqual(this.plaid_account_details, surrogate.plaid_account_details);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((this.account_id.hashCode() * 31) + this.metadata.hashCode()) * 31) + this.name.hashCode()) * 31) + this.official_name.hashCode()) * 31) + this.type.hashCode()) * 31) + this.subtype.hashCode()) * 31) + this.purposes.hashCode()) * 31) + this.state.hashCode()) * 31) + this.id.hashCode()) * 31) + this.source_entity.hashCode()) * 31;
            Instant instant = this.lookback_start_time;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.last_updated_at_time;
            int iHashCode3 = (((iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.earliest_balance.hashCode()) * 31;
            PlaidAccountDetailsDto plaidAccountDetailsDto = this.plaid_account_details;
            return iHashCode3 + (plaidAccountDetailsDto != null ? plaidAccountDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_id=" + this.account_id + ", metadata=" + this.metadata + ", name=" + this.name + ", official_name=" + this.official_name + ", type=" + this.type + ", subtype=" + this.subtype + ", purposes=" + this.purposes + ", state=" + this.state + ", id=" + this.id + ", source_entity=" + this.source_entity + ", lookback_start_time=" + this.lookback_start_time + ", last_updated_at_time=" + this.last_updated_at_time + ", earliest_balance=" + this.earliest_balance + ", plaid_account_details=" + this.plaid_account_details + ")";
        }

        /* compiled from: LinkedAccountDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Laccio/service/v1/LinkedAccountDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Laccio/service/v1/LinkedAccountDto$Surrogate;", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return LinkedAccountDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: accio.service.v1.LinkedAccountDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LinkedAccountDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: accio.service.v1.LinkedAccountDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LinkedAccountDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null, null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, String str, Map map, String str2, String str3, AccountTypeDto accountTypeDto, AccountSubtypeDto accountSubtypeDto, List list, AccountStateDto accountStateDto, String str4, EntityDto entityDto, Instant instant, Instant instant2, IdlDecimal idlDecimal, PlaidAccountDetailsDto plaidAccountDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str;
            }
            if ((i & 2) == 0) {
                this.metadata = MapsKt.emptyMap();
            } else {
                this.metadata = map;
            }
            if ((i & 4) == 0) {
                this.name = "";
            } else {
                this.name = str2;
            }
            if ((i & 8) == 0) {
                this.official_name = "";
            } else {
                this.official_name = str3;
            }
            if ((i & 16) == 0) {
                this.type = AccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = accountTypeDto;
            }
            if ((i & 32) == 0) {
                this.subtype = AccountSubtypeDto.INSTANCE.getZeroValue();
            } else {
                this.subtype = accountSubtypeDto;
            }
            if ((i & 64) == 0) {
                this.purposes = CollectionsKt.emptyList();
            } else {
                this.purposes = list;
            }
            if ((i & 128) == 0) {
                this.state = AccountStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = accountStateDto;
            }
            if ((i & 256) == 0) {
                this.id = "";
            } else {
                this.id = str4;
            }
            if ((i & 512) == 0) {
                this.source_entity = EntityDto.INSTANCE.getZeroValue();
            } else {
                this.source_entity = entityDto;
            }
            if ((i & 1024) == 0) {
                this.lookback_start_time = null;
            } else {
                this.lookback_start_time = instant;
            }
            if ((i & 2048) == 0) {
                this.last_updated_at_time = null;
            } else {
                this.last_updated_at_time = instant2;
            }
            this.earliest_balance = (i & 4096) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 8192) == 0) {
                this.plaid_account_details = null;
            } else {
                this.plaid_account_details = plaidAccountDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$accio_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_id);
            }
            if (!Intrinsics.areEqual(self.metadata, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.metadata);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 2, self.name);
            }
            if (!Intrinsics.areEqual(self.official_name, "")) {
                output.encodeStringElement(serialDesc, 3, self.official_name);
            }
            if (self.type != AccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, AccountTypeDto.Serializer.INSTANCE, self.type);
            }
            if (self.subtype != AccountSubtypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, AccountSubtypeDto.Serializer.INSTANCE, self.subtype);
            }
            if (!Intrinsics.areEqual(self.purposes, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.purposes);
            }
            if (self.state != AccountStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, AccountStateDto.Serializer.INSTANCE, self.state);
            }
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 8, self.id);
            }
            if (self.source_entity != EntityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, EntityDto.Serializer.INSTANCE, self.source_entity);
            }
            Instant instant = self.lookback_start_time;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.last_updated_at_time;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, WireInstantSerializer.INSTANCE, instant2);
            }
            if (!Intrinsics.areEqual(self.earliest_balance, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 12, IdlDecimalSerializer.INSTANCE, self.earliest_balance);
            }
            PlaidAccountDetailsDto plaidAccountDetailsDto = self.plaid_account_details;
            if (plaidAccountDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, PlaidAccountDetailsDto.Serializer.INSTANCE, plaidAccountDetailsDto);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(String account_id, Map<String, String> metadata, String name, String official_name, AccountTypeDto type2, AccountSubtypeDto subtype, List<? extends PurposeDto> purposes, AccountStateDto state, String id, EntityDto source_entity, Instant instant, Instant instant2, IdlDecimal earliest_balance, PlaidAccountDetailsDto plaidAccountDetailsDto) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(official_name, "official_name");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(subtype, "subtype");
            Intrinsics.checkNotNullParameter(purposes, "purposes");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(source_entity, "source_entity");
            Intrinsics.checkNotNullParameter(earliest_balance, "earliest_balance");
            this.account_id = account_id;
            this.metadata = metadata;
            this.name = name;
            this.official_name = official_name;
            this.type = type2;
            this.subtype = subtype;
            this.purposes = purposes;
            this.state = state;
            this.id = id;
            this.source_entity = source_entity;
            this.lookback_start_time = instant;
            this.last_updated_at_time = instant2;
            this.earliest_balance = earliest_balance;
            this.plaid_account_details = plaidAccountDetailsDto;
        }

        public /* synthetic */ Surrogate(String str, Map map, String str2, String str3, AccountTypeDto accountTypeDto, AccountSubtypeDto accountSubtypeDto, List list, AccountStateDto accountStateDto, String str4, EntityDto entityDto, Instant instant, Instant instant2, IdlDecimal idlDecimal, PlaidAccountDetailsDto plaidAccountDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MapsKt.emptyMap() : map, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 32) != 0 ? AccountSubtypeDto.INSTANCE.getZeroValue() : accountSubtypeDto, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? AccountStateDto.INSTANCE.getZeroValue() : accountStateDto, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? EntityDto.INSTANCE.getZeroValue() : entityDto, (i & 1024) != 0 ? null : instant, (i & 2048) != 0 ? null : instant2, (i & 4096) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8192) != 0 ? null : plaidAccountDetailsDto);
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final Map<String, String> getMetadata() {
            return this.metadata;
        }

        public final String getName() {
            return this.name;
        }

        public final String getOfficial_name() {
            return this.official_name;
        }

        public final AccountTypeDto getType() {
            return this.type;
        }

        public final AccountSubtypeDto getSubtype() {
            return this.subtype;
        }

        public final List<PurposeDto> getPurposes() {
            return this.purposes;
        }

        public final AccountStateDto getState() {
            return this.state;
        }

        public final String getId() {
            return this.id;
        }

        public final EntityDto getSource_entity() {
            return this.source_entity;
        }

        public final Instant getLookback_start_time() {
            return this.lookback_start_time;
        }

        public final Instant getLast_updated_at_time() {
            return this.last_updated_at_time;
        }

        public final IdlDecimal getEarliest_balance() {
            return this.earliest_balance;
        }

        public final PlaidAccountDetailsDto getPlaid_account_details() {
            return this.plaid_account_details;
        }
    }

    /* compiled from: LinkedAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Laccio/service/v1/LinkedAccountDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Laccio/service/v1/LinkedAccountDto;", "Laccio/service/v1/LinkedAccount;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Laccio/service/v1/LinkedAccountDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<LinkedAccountDto, LinkedAccount> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LinkedAccountDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LinkedAccountDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LinkedAccountDto> getBinaryBase64Serializer() {
            return (KSerializer) LinkedAccountDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<LinkedAccount> getProtoAdapter() {
            return LinkedAccount.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LinkedAccountDto getZeroValue() {
            return LinkedAccountDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LinkedAccountDto fromProto(LinkedAccount proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_id = proto.getAccount_id();
            Set<Map.Entry<String, String>> setEntrySet = proto.getMetadata().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            String name = proto.getName();
            String official_name = proto.getOfficial_name();
            AccountTypeDto accountTypeDtoFromProto = AccountTypeDto.INSTANCE.fromProto(proto.getType());
            AccountSubtypeDto accountSubtypeDtoFromProto = AccountSubtypeDto.INSTANCE.fromProto(proto.getSubtype());
            List<Purpose> purposes = proto.getPurposes();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(purposes, 10));
            Iterator<T> it2 = purposes.iterator();
            while (it2.hasNext()) {
                arrayList.add(PurposeDto.INSTANCE.fromProto((Purpose) it2.next()));
            }
            AccountStateDto accountStateDtoFromProto = AccountStateDto.INSTANCE.fromProto(proto.getState());
            String id = proto.getId();
            EntityDto entityDtoFromProto = EntityDto.INSTANCE.fromProto(proto.getSource_entity());
            Instant lookback_start_time = proto.getLookback_start_time();
            Instant last_updated_at_time = proto.getLast_updated_at_time();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getEarliest_balance());
            PlaidAccountDetails plaid_account_details = proto.getPlaid_account_details();
            return new LinkedAccountDto(new Surrogate(account_id, linkedHashMap, name, official_name, accountTypeDtoFromProto, accountSubtypeDtoFromProto, arrayList, accountStateDtoFromProto, id, entityDtoFromProto, lookback_start_time, last_updated_at_time, idlDecimal, plaid_account_details != null ? PlaidAccountDetailsDto.INSTANCE.fromProto(plaid_account_details) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: accio.service.v1.LinkedAccountDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LinkedAccountDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new LinkedAccountDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LinkedAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Laccio/service/v1/LinkedAccountDto$AccountDetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "PlaidAccountDetails", "Companion", "Laccio/service/v1/LinkedAccountDto$AccountDetailsDto$PlaidAccountDetails;", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class AccountDetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ AccountDetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AccountDetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: LinkedAccountDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Laccio/service/v1/LinkedAccountDto$AccountDetailsDto$PlaidAccountDetails;", "Laccio/service/v1/LinkedAccountDto$AccountDetailsDto;", "Laccio/service/v1/PlaidAccountDetailsDto;", "value", "<init>", "(Laccio/service/v1/PlaidAccountDetailsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Laccio/service/v1/PlaidAccountDetailsDto;", "getValue", "()Laccio/service/v1/PlaidAccountDetailsDto;", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PlaidAccountDetails extends AccountDetailsDto {
            private final PlaidAccountDetailsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlaidAccountDetails) && Intrinsics.areEqual(this.value, ((PlaidAccountDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PlaidAccountDetails(value=" + this.value + ")";
            }

            public final PlaidAccountDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlaidAccountDetails(PlaidAccountDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: LinkedAccountDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Laccio/service/v1/LinkedAccountDto$AccountDetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Laccio/service/v1/LinkedAccountDto$AccountDetailsDto;", "Laccio/service/v1/LinkedAccount;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<AccountDetailsDto, LinkedAccount> {
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
            public ProtoAdapter<LinkedAccount> getProtoAdapter() {
                return LinkedAccount.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AccountDetailsDto fromProto(LinkedAccount proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getPlaid_account_details() != null) {
                    return new PlaidAccountDetails(PlaidAccountDetailsDto.INSTANCE.fromProto(proto.getPlaid_account_details()));
                }
                return null;
            }
        }
    }

    /* compiled from: LinkedAccountDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Laccio/service/v1/LinkedAccountDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Laccio/service/v1/LinkedAccountDto;", "<init>", "()V", "surrogateSerializer", "Laccio/service/v1/LinkedAccountDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<LinkedAccountDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/accio.service.v1.LinkedAccount", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LinkedAccountDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public LinkedAccountDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new LinkedAccountDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: LinkedAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Laccio/service/v1/LinkedAccountDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "accio.service.v1.LinkedAccountDto";
        }
    }
}
