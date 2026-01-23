package md_server_proxy.service.p483v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import md_server_proxy.service.p483v1.CurrencyCodeDto;
import md_server_proxy.service.p483v1.GetQuotesRequestDto;

/* compiled from: GetQuotesRequestDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004(')*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0012¨\u0006+"}, m3636d2 = {"Lmd_server_proxy/service/v1/GetQuotesRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lmd_server_proxy/service/v1/GetQuotesRequest;", "Landroid/os/Parcelable;", "Lmd_server_proxy/service/v1/GetQuotesRequestDto$Surrogate;", "surrogate", "<init>", "(Lmd_server_proxy/service/v1/GetQuotesRequestDto$Surrogate;)V", "", "", "currency_pair_ids", "Lmd_server_proxy/service/v1/CurrencyCodeDto;", "display_currency_codes", "routing_group", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "toProto", "()Lmd_server_proxy/service/v1/GetQuotesRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmd_server_proxy/service/v1/GetQuotesRequestDto$Surrogate;", "getCurrency_pair_ids", "()Ljava/util/List;", "getDisplay_currency_codes", "getRouting_group", "Companion", "Surrogate", "Serializer", "MultibindingModule", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class GetQuotesRequestDto implements Dto3<GetQuotesRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetQuotesRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetQuotesRequestDto, GetQuotesRequest>> binaryBase64Serializer$delegate;
    private static final GetQuotesRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetQuotesRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetQuotesRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<String> getCurrency_pair_ids() {
        return this.surrogate.getCurrency_pair_ids();
    }

    public final List<CurrencyCodeDto> getDisplay_currency_codes() {
        return this.surrogate.getDisplay_currency_codes();
    }

    public final String getRouting_group() {
        return this.surrogate.getRouting_group();
    }

    public /* synthetic */ GetQuotesRequestDto(List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetQuotesRequestDto(List<String> currency_pair_ids, List<? extends CurrencyCodeDto> display_currency_codes, String str) {
        this(new Surrogate(currency_pair_ids, display_currency_codes, str));
        Intrinsics.checkNotNullParameter(currency_pair_ids, "currency_pair_ids");
        Intrinsics.checkNotNullParameter(display_currency_codes, "display_currency_codes");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetQuotesRequest toProto() {
        List<String> currency_pair_ids = this.surrogate.getCurrency_pair_ids();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currency_pair_ids, 10));
        Iterator<T> it = currency_pair_ids.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        List<CurrencyCodeDto> display_currency_codes = this.surrogate.getDisplay_currency_codes();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(display_currency_codes, 10));
        Iterator<T> it2 = display_currency_codes.iterator();
        while (it2.hasNext()) {
            arrayList2.add((CurrencyCode) ((CurrencyCodeDto) it2.next()).toProto());
        }
        return new GetQuotesRequest(arrayList, arrayList2, this.surrogate.getRouting_group(), null, 8, null);
    }

    public String toString() {
        return "[GetQuotesRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetQuotesRequestDto) && Intrinsics.areEqual(((GetQuotesRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetQuotesRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 *2\u00020\u0001:\u0002+*B3\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b)\u0010$\u001a\u0004\b(\u0010\u0019¨\u0006,"}, m3636d2 = {"Lmd_server_proxy/service/v1/GetQuotesRequestDto$Surrogate;", "", "", "", "currency_pair_ids", "Lmd_server_proxy/service/v1/CurrencyCodeDto;", "display_currency_codes", "routing_group", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$md_server_proxy_service_v1_externalRelease", "(Lmd_server_proxy/service/v1/GetQuotesRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCurrency_pair_ids", "()Ljava/util/List;", "getCurrency_pair_ids$annotations", "()V", "getDisplay_currency_codes", "getDisplay_currency_codes$annotations", "Ljava/lang/String;", "getRouting_group", "getRouting_group$annotations", "Companion", "$serializer", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<String> currency_pair_ids;
        private final List<CurrencyCodeDto> display_currency_codes;
        private final String routing_group;

        public Surrogate() {
            this((List) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(CurrencyCodeDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.currency_pair_ids, surrogate.currency_pair_ids) && Intrinsics.areEqual(this.display_currency_codes, surrogate.display_currency_codes) && Intrinsics.areEqual(this.routing_group, surrogate.routing_group);
        }

        public int hashCode() {
            int iHashCode = ((this.currency_pair_ids.hashCode() * 31) + this.display_currency_codes.hashCode()) * 31;
            String str = this.routing_group;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Surrogate(currency_pair_ids=" + this.currency_pair_ids + ", display_currency_codes=" + this.display_currency_codes + ", routing_group=" + this.routing_group + ")";
        }

        /* compiled from: GetQuotesRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmd_server_proxy/service/v1/GetQuotesRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmd_server_proxy/service/v1/GetQuotesRequestDto$Surrogate;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetQuotesRequestDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: md_server_proxy.service.v1.GetQuotesRequestDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetQuotesRequestDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: md_server_proxy.service.v1.GetQuotesRequestDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetQuotesRequestDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null};
        }

        public /* synthetic */ Surrogate(int i, List list, List list2, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.currency_pair_ids = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.display_currency_codes = CollectionsKt.emptyList();
            } else {
                this.display_currency_codes = list2;
            }
            if ((i & 4) == 0) {
                this.routing_group = null;
            } else {
                this.routing_group = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$md_server_proxy_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.currency_pair_ids, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.currency_pair_ids);
            }
            if (!Intrinsics.areEqual(self.display_currency_codes, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.display_currency_codes);
            }
            String str = self.routing_group;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(List<String> currency_pair_ids, List<? extends CurrencyCodeDto> display_currency_codes, String str) {
            Intrinsics.checkNotNullParameter(currency_pair_ids, "currency_pair_ids");
            Intrinsics.checkNotNullParameter(display_currency_codes, "display_currency_codes");
            this.currency_pair_ids = currency_pair_ids;
            this.display_currency_codes = display_currency_codes;
            this.routing_group = str;
        }

        public final List<String> getCurrency_pair_ids() {
            return this.currency_pair_ids;
        }

        public /* synthetic */ Surrogate(List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? null : str);
        }

        public final List<CurrencyCodeDto> getDisplay_currency_codes() {
            return this.display_currency_codes;
        }

        public final String getRouting_group() {
            return this.routing_group;
        }
    }

    /* compiled from: GetQuotesRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmd_server_proxy/service/v1/GetQuotesRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmd_server_proxy/service/v1/GetQuotesRequestDto;", "Lmd_server_proxy/service/v1/GetQuotesRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmd_server_proxy/service/v1/GetQuotesRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetQuotesRequestDto, GetQuotesRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetQuotesRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetQuotesRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetQuotesRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetQuotesRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetQuotesRequest> getProtoAdapter() {
            return GetQuotesRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetQuotesRequestDto getZeroValue() {
            return GetQuotesRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetQuotesRequestDto fromProto(GetQuotesRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<String> currency_pair_ids = proto.getCurrency_pair_ids();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currency_pair_ids, 10));
            Iterator<T> it = currency_pair_ids.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            List<CurrencyCode> display_currency_codes = proto.getDisplay_currency_codes();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(display_currency_codes, 10));
            Iterator<T> it2 = display_currency_codes.iterator();
            while (it2.hasNext()) {
                arrayList2.add(CurrencyCodeDto.INSTANCE.fromProto((CurrencyCode) it2.next()));
            }
            return new GetQuotesRequestDto(new Surrogate(arrayList, arrayList2, proto.getRouting_group()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: md_server_proxy.service.v1.GetQuotesRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetQuotesRequestDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new GetQuotesRequestDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetQuotesRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmd_server_proxy/service/v1/GetQuotesRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmd_server_proxy/service/v1/GetQuotesRequestDto;", "<init>", "()V", "surrogateSerializer", "Lmd_server_proxy/service/v1/GetQuotesRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetQuotesRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/md_server_proxy.service.v1.GetQuotesRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetQuotesRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetQuotesRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetQuotesRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetQuotesRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmd_server_proxy/service/v1/GetQuotesRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "md_server_proxy.service.v1.GetQuotesRequestDto";
        }
    }
}
