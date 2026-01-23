package yoda.service.dashboard;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.rosetta.common.CurrencyDto;
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
import yoda.service.dashboard.GetFutureReturnsResponseDto;
import yoda.service.dashboard.OneTimeConfigurationDto;
import yoda.service.dashboard.RecurringConfigurationDto;

/* compiled from: GetFutureReturnsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004879:B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0013H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b3\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b4\u0010\"R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006;"}, m3636d2 = {"Lyoda/service/dashboard/GetFutureReturnsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lyoda/service/dashboard/GetFutureReturnsResponse;", "Landroid/os/Parcelable;", "Lyoda/service/dashboard/GetFutureReturnsResponseDto$Surrogate;", "surrogate", "<init>", "(Lyoda/service/dashboard/GetFutureReturnsResponseDto$Surrogate;)V", "Lcom/robinhood/rosetta/common/CurrencyDto;", "currency_code", "", "initial_portfolio_value", "Lyoda/service/dashboard/OneTimeConfigurationDto;", "one_time_configuration", "", "Lyoda/service/dashboard/RecurringConfigurationDto;", "recurring_deposit_configurations", "", "account_number", "", "end_of_year_age", "highlight_year_idx", "optional_end_of_year_age", "(Lcom/robinhood/rosetta/common/CurrencyDto;DLyoda/service/dashboard/OneTimeConfigurationDto;Ljava/util/List;Ljava/lang/String;IILjava/lang/Integer;)V", "toProto", "()Lyoda/service/dashboard/GetFutureReturnsResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lyoda/service/dashboard/GetFutureReturnsResponseDto$Surrogate;", "getCurrency_code", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getInitial_portfolio_value", "()D", "getOne_time_configuration", "()Lyoda/service/dashboard/OneTimeConfigurationDto;", "getRecurring_deposit_configurations", "()Ljava/util/List;", "getAccount_number", "getHighlight_year_idx", "getOptional_end_of_year_age", "()Ljava/lang/Integer;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class GetFutureReturnsResponseDto implements Dto3<GetFutureReturnsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetFutureReturnsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetFutureReturnsResponseDto, GetFutureReturnsResponse>> binaryBase64Serializer$delegate;
    private static final GetFutureReturnsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetFutureReturnsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetFutureReturnsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final CurrencyDto getCurrency_code() {
        return this.surrogate.getCurrency_code();
    }

    public final double getInitial_portfolio_value() {
        return this.surrogate.getInitial_portfolio_value();
    }

    public final OneTimeConfigurationDto getOne_time_configuration() {
        return this.surrogate.getOne_time_configuration();
    }

    public final List<RecurringConfigurationDto> getRecurring_deposit_configurations() {
        return this.surrogate.getRecurring_deposit_configurations();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final int getHighlight_year_idx() {
        return this.surrogate.getHighlight_year_idx();
    }

    public final Integer getOptional_end_of_year_age() {
        return this.surrogate.getOptional_end_of_year_age();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GetFutureReturnsResponseDto(CurrencyDto currencyDto, double d, OneTimeConfigurationDto oneTimeConfigurationDto, List list, String str, int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num2;
        int i4;
        String str2;
        int i5;
        OneTimeConfigurationDto oneTimeConfigurationDto2;
        List list2;
        currencyDto = (i3 & 1) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto;
        d = (i3 & 2) != 0 ? 0.0d : d;
        oneTimeConfigurationDto = (i3 & 4) != 0 ? null : oneTimeConfigurationDto;
        list = (i3 & 8) != 0 ? CollectionsKt.emptyList() : list;
        str = (i3 & 16) != 0 ? "" : str;
        i = (i3 & 32) != 0 ? 0 : i;
        i2 = (i3 & 64) != 0 ? 0 : i2;
        if ((i3 & 128) != 0) {
            num2 = null;
            i5 = i;
            i4 = i2;
            list2 = list;
            str2 = str;
            oneTimeConfigurationDto2 = oneTimeConfigurationDto;
        } else {
            num2 = num;
            i4 = i2;
            str2 = str;
            i5 = i;
            oneTimeConfigurationDto2 = oneTimeConfigurationDto;
            list2 = list;
        }
        this(currencyDto, d, oneTimeConfigurationDto2, list2, str2, i5, i4, num2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetFutureReturnsResponseDto(CurrencyDto currency_code, double d, OneTimeConfigurationDto oneTimeConfigurationDto, List<RecurringConfigurationDto> recurring_deposit_configurations, String account_number, int i, int i2, Integer num) {
        this(new Surrogate(currency_code, d, oneTimeConfigurationDto, recurring_deposit_configurations, account_number, i, i2, num));
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(recurring_deposit_configurations, "recurring_deposit_configurations");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetFutureReturnsResponse toProto() {
        Currency currency = (Currency) this.surrogate.getCurrency_code().toProto();
        double initial_portfolio_value = this.surrogate.getInitial_portfolio_value();
        OneTimeConfigurationDto one_time_configuration = this.surrogate.getOne_time_configuration();
        OneTimeConfiguration proto = one_time_configuration != null ? one_time_configuration.toProto() : null;
        List<RecurringConfigurationDto> recurring_deposit_configurations = this.surrogate.getRecurring_deposit_configurations();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(recurring_deposit_configurations, 10));
        Iterator<T> it = recurring_deposit_configurations.iterator();
        while (it.hasNext()) {
            arrayList.add(((RecurringConfigurationDto) it.next()).toProto());
        }
        return new GetFutureReturnsResponse(currency, initial_portfolio_value, proto, arrayList, this.surrogate.getAccount_number(), this.surrogate.getEnd_of_year_age(), this.surrogate.getHighlight_year_idx(), this.surrogate.getOptional_end_of_year_age(), null, 256, null);
    }

    public String toString() {
        return "[GetFutureReturnsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetFutureReturnsResponseDto) && Intrinsics.areEqual(((GetFutureReturnsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetFutureReturnsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\"\b\u0083\b\u0018\u0000 I2\u00020\u0001:\u0002JIB\u009d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u0010¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0011\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\u0010¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0011\u0012\u0019\b\u0002\u0010\u0014\u001a\u0013\u0018\u00010\u0010¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0011¢\u0006\u0004\b\u0015\u0010\u0016Bk\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b4\u00100\u001a\u0004\b2\u00103R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00105\u0012\u0004\b8\u00100\u001a\u0004\b6\u00107R&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00109\u0012\u0004\b<\u00100\u001a\u0004\b:\u0010;R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010=\u0012\u0004\b?\u00100\u001a\u0004\b>\u0010%R/\u0010\u0012\u001a\u00110\u0010¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010@\u0012\u0004\bB\u00100\u001a\u0004\bA\u0010'R/\u0010\u0013\u001a\u00110\u0010¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010@\u0012\u0004\bD\u00100\u001a\u0004\bC\u0010'R1\u0010\u0014\u001a\u0013\u0018\u00010\u0010¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010E\u0012\u0004\bH\u00100\u001a\u0004\bF\u0010G¨\u0006K"}, m3636d2 = {"Lyoda/service/dashboard/GetFutureReturnsResponseDto$Surrogate;", "", "Lcom/robinhood/rosetta/common/CurrencyDto;", "currency_code", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "initial_portfolio_value", "Lyoda/service/dashboard/OneTimeConfigurationDto;", "one_time_configuration", "", "Lyoda/service/dashboard/RecurringConfigurationDto;", "recurring_deposit_configurations", "", "account_number", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "end_of_year_age", "highlight_year_idx", "optional_end_of_year_age", "<init>", "(Lcom/robinhood/rosetta/common/CurrencyDto;DLyoda/service/dashboard/OneTimeConfigurationDto;Ljava/util/List;Ljava/lang/String;IILjava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/rosetta/common/CurrencyDto;DLyoda/service/dashboard/OneTimeConfigurationDto;Ljava/util/List;Ljava/lang/String;IILjava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$yoda_v1_dashboard_externalRelease", "(Lyoda/service/dashboard/GetFutureReturnsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/rosetta/common/CurrencyDto;", "getCurrency_code", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getCurrency_code$annotations", "()V", "D", "getInitial_portfolio_value", "()D", "getInitial_portfolio_value$annotations", "Lyoda/service/dashboard/OneTimeConfigurationDto;", "getOne_time_configuration", "()Lyoda/service/dashboard/OneTimeConfigurationDto;", "getOne_time_configuration$annotations", "Ljava/util/List;", "getRecurring_deposit_configurations", "()Ljava/util/List;", "getRecurring_deposit_configurations$annotations", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "I", "getEnd_of_year_age", "getEnd_of_year_age$annotations", "getHighlight_year_idx", "getHighlight_year_idx$annotations", "Ljava/lang/Integer;", "getOptional_end_of_year_age", "()Ljava/lang/Integer;", "getOptional_end_of_year_age$annotations", "Companion", "$serializer", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_number;
        private final CurrencyDto currency_code;
        private final int end_of_year_age;
        private final int highlight_year_idx;
        private final double initial_portfolio_value;
        private final OneTimeConfigurationDto one_time_configuration;
        private final Integer optional_end_of_year_age;
        private final List<RecurringConfigurationDto> recurring_deposit_configurations;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: yoda.service.dashboard.GetFutureReturnsResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetFutureReturnsResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null};

        public Surrogate() {
            this((CurrencyDto) null, 0.0d, (OneTimeConfigurationDto) null, (List) null, (String) null, 0, 0, (Integer) null, 255, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(RecurringConfigurationDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.currency_code == surrogate.currency_code && Double.compare(this.initial_portfolio_value, surrogate.initial_portfolio_value) == 0 && Intrinsics.areEqual(this.one_time_configuration, surrogate.one_time_configuration) && Intrinsics.areEqual(this.recurring_deposit_configurations, surrogate.recurring_deposit_configurations) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && this.end_of_year_age == surrogate.end_of_year_age && this.highlight_year_idx == surrogate.highlight_year_idx && Intrinsics.areEqual(this.optional_end_of_year_age, surrogate.optional_end_of_year_age);
        }

        public int hashCode() {
            int iHashCode = ((this.currency_code.hashCode() * 31) + Double.hashCode(this.initial_portfolio_value)) * 31;
            OneTimeConfigurationDto oneTimeConfigurationDto = this.one_time_configuration;
            int iHashCode2 = (((((((((iHashCode + (oneTimeConfigurationDto == null ? 0 : oneTimeConfigurationDto.hashCode())) * 31) + this.recurring_deposit_configurations.hashCode()) * 31) + this.account_number.hashCode()) * 31) + Integer.hashCode(this.end_of_year_age)) * 31) + Integer.hashCode(this.highlight_year_idx)) * 31;
            Integer num = this.optional_end_of_year_age;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(currency_code=" + this.currency_code + ", initial_portfolio_value=" + this.initial_portfolio_value + ", one_time_configuration=" + this.one_time_configuration + ", recurring_deposit_configurations=" + this.recurring_deposit_configurations + ", account_number=" + this.account_number + ", end_of_year_age=" + this.end_of_year_age + ", highlight_year_idx=" + this.highlight_year_idx + ", optional_end_of_year_age=" + this.optional_end_of_year_age + ")";
        }

        /* compiled from: GetFutureReturnsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lyoda/service/dashboard/GetFutureReturnsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lyoda/service/dashboard/GetFutureReturnsResponseDto$Surrogate;", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetFutureReturnsResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CurrencyDto currencyDto, double d, OneTimeConfigurationDto oneTimeConfigurationDto, List list, String str, int i2, int i3, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
            this.currency_code = (i & 1) == 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto;
            if ((i & 2) == 0) {
                this.initial_portfolio_value = 0.0d;
            } else {
                this.initial_portfolio_value = d;
            }
            if ((i & 4) == 0) {
                this.one_time_configuration = null;
            } else {
                this.one_time_configuration = oneTimeConfigurationDto;
            }
            if ((i & 8) == 0) {
                this.recurring_deposit_configurations = CollectionsKt.emptyList();
            } else {
                this.recurring_deposit_configurations = list;
            }
            if ((i & 16) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 32) == 0) {
                this.end_of_year_age = 0;
            } else {
                this.end_of_year_age = i2;
            }
            if ((i & 64) == 0) {
                this.highlight_year_idx = 0;
            } else {
                this.highlight_year_idx = i3;
            }
            if ((i & 128) == 0) {
                this.optional_end_of_year_age = null;
            } else {
                this.optional_end_of_year_age = num;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$yoda_v1_dashboard_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.currency_code != CurrencyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, CurrencyDto.Serializer.INSTANCE, self.currency_code);
            }
            if (Double.compare(self.initial_portfolio_value, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.initial_portfolio_value));
            }
            OneTimeConfigurationDto oneTimeConfigurationDto = self.one_time_configuration;
            if (oneTimeConfigurationDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, OneTimeConfigurationDto.Serializer.INSTANCE, oneTimeConfigurationDto);
            }
            if (!Intrinsics.areEqual(self.recurring_deposit_configurations, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.recurring_deposit_configurations);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 4, self.account_number);
            }
            int i = self.end_of_year_age;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.highlight_year_idx;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            Integer num = self.optional_end_of_year_age;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, SignedIntAsNumberSerializer.INSTANCE, num);
            }
        }

        public Surrogate(CurrencyDto currency_code, double d, OneTimeConfigurationDto oneTimeConfigurationDto, List<RecurringConfigurationDto> recurring_deposit_configurations, String account_number, int i, int i2, Integer num) {
            Intrinsics.checkNotNullParameter(currency_code, "currency_code");
            Intrinsics.checkNotNullParameter(recurring_deposit_configurations, "recurring_deposit_configurations");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            this.currency_code = currency_code;
            this.initial_portfolio_value = d;
            this.one_time_configuration = oneTimeConfigurationDto;
            this.recurring_deposit_configurations = recurring_deposit_configurations;
            this.account_number = account_number;
            this.end_of_year_age = i;
            this.highlight_year_idx = i2;
            this.optional_end_of_year_age = num;
        }

        public final CurrencyDto getCurrency_code() {
            return this.currency_code;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Surrogate(CurrencyDto currencyDto, double d, OneTimeConfigurationDto oneTimeConfigurationDto, List list, String str, int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            Integer num2;
            int i4;
            String str2;
            int i5;
            OneTimeConfigurationDto oneTimeConfigurationDto2;
            List list2;
            currencyDto = (i3 & 1) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto;
            d = (i3 & 2) != 0 ? 0.0d : d;
            oneTimeConfigurationDto = (i3 & 4) != 0 ? null : oneTimeConfigurationDto;
            list = (i3 & 8) != 0 ? CollectionsKt.emptyList() : list;
            str = (i3 & 16) != 0 ? "" : str;
            i = (i3 & 32) != 0 ? 0 : i;
            i2 = (i3 & 64) != 0 ? 0 : i2;
            if ((i3 & 128) != 0) {
                num2 = null;
                i5 = i;
                i4 = i2;
                list2 = list;
                str2 = str;
                oneTimeConfigurationDto2 = oneTimeConfigurationDto;
            } else {
                num2 = num;
                i4 = i2;
                str2 = str;
                i5 = i;
                oneTimeConfigurationDto2 = oneTimeConfigurationDto;
                list2 = list;
            }
            this(currencyDto, d, oneTimeConfigurationDto2, list2, str2, i5, i4, num2);
        }

        public final double getInitial_portfolio_value() {
            return this.initial_portfolio_value;
        }

        public final OneTimeConfigurationDto getOne_time_configuration() {
            return this.one_time_configuration;
        }

        public final List<RecurringConfigurationDto> getRecurring_deposit_configurations() {
            return this.recurring_deposit_configurations;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final int getEnd_of_year_age() {
            return this.end_of_year_age;
        }

        public final int getHighlight_year_idx() {
            return this.highlight_year_idx;
        }

        public final Integer getOptional_end_of_year_age() {
            return this.optional_end_of_year_age;
        }
    }

    /* compiled from: GetFutureReturnsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lyoda/service/dashboard/GetFutureReturnsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lyoda/service/dashboard/GetFutureReturnsResponseDto;", "Lyoda/service/dashboard/GetFutureReturnsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lyoda/service/dashboard/GetFutureReturnsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetFutureReturnsResponseDto, GetFutureReturnsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetFutureReturnsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetFutureReturnsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetFutureReturnsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetFutureReturnsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetFutureReturnsResponse> getProtoAdapter() {
            return GetFutureReturnsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetFutureReturnsResponseDto getZeroValue() {
            return GetFutureReturnsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetFutureReturnsResponseDto fromProto(GetFutureReturnsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            CurrencyDto currencyDtoFromProto = CurrencyDto.INSTANCE.fromProto(proto.getCurrency_code());
            double initial_portfolio_value = proto.getInitial_portfolio_value();
            OneTimeConfiguration one_time_configuration = proto.getOne_time_configuration();
            DefaultConstructorMarker defaultConstructorMarker = null;
            OneTimeConfigurationDto oneTimeConfigurationDtoFromProto = one_time_configuration != null ? OneTimeConfigurationDto.INSTANCE.fromProto(one_time_configuration) : null;
            List<RecurringConfiguration> recurring_deposit_configurations = proto.getRecurring_deposit_configurations();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(recurring_deposit_configurations, 10));
            Iterator<T> it = recurring_deposit_configurations.iterator();
            while (it.hasNext()) {
                arrayList.add(RecurringConfigurationDto.INSTANCE.fromProto((RecurringConfiguration) it.next()));
            }
            return new GetFutureReturnsResponseDto(new Surrogate(currencyDtoFromProto, initial_portfolio_value, oneTimeConfigurationDtoFromProto, arrayList, proto.getAccount_number(), proto.getEnd_of_year_age(), proto.getHighlight_year_idx(), proto.getOptional_end_of_year_age()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: yoda.service.dashboard.GetFutureReturnsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetFutureReturnsResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetFutureReturnsResponseDto(null, 0.0d, null, null, null, 0, 0, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetFutureReturnsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lyoda/service/dashboard/GetFutureReturnsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lyoda/service/dashboard/GetFutureReturnsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lyoda/service/dashboard/GetFutureReturnsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes28.dex */
    public static final class Serializer implements KSerializer<GetFutureReturnsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/yoda.service.dashboard.GetFutureReturnsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetFutureReturnsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetFutureReturnsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetFutureReturnsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetFutureReturnsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lyoda/service/dashboard/GetFutureReturnsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "yoda.service.dashboard.GetFutureReturnsResponseDto";
        }
    }
}
