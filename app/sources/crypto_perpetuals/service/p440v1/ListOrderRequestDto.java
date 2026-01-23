package crypto_perpetuals.service.p440v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import crypto_perpetuals.order.p438v1.OrderStatus;
import crypto_perpetuals.order.p438v1.OrderStatusDto;
import crypto_perpetuals.order.p438v1.OrderType;
import crypto_perpetuals.order.p438v1.OrderTypeDto;
import crypto_perpetuals.service.p440v1.ListOrderRequestDto;
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
import p479j$.time.Instant;

/* compiled from: ListOrderRequestDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00045467B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u0015Jg\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0012H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8F¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b8F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0019\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001b¨\u00068"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ListOrderRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/service/v1/ListOrderRequest;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/service/v1/ListOrderRequestDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/service/v1/ListOrderRequestDto$Surrogate;)V", "", "Lcrypto_perpetuals/order/v1/OrderStatusDto;", "status_filter", "Lcrypto_perpetuals/order/v1/OrderTypeDto;", "type_filter", "", "contract_id_filter", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "updated_at_gte", "", "page_size", "token", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Ljava/lang/Integer;Ljava/lang/String;)V", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Ljava/lang/Integer;Ljava/lang/String;)Lcrypto_perpetuals/service/v1/ListOrderRequestDto;", "toProto", "()Lcrypto_perpetuals/service/v1/ListOrderRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/service/v1/ListOrderRequestDto$Surrogate;", "getStatus_filter", "()Ljava/util/List;", "getType_filter", "getContract_id_filter", "getUpdated_at_gte", "()Lj$/time/Instant;", "getPage_size", "()Ljava/lang/Integer;", "getToken", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class ListOrderRequestDto implements Dto3<ListOrderRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ListOrderRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ListOrderRequestDto, ListOrderRequest>> binaryBase64Serializer$delegate;
    private static final ListOrderRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ListOrderRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ListOrderRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<OrderStatusDto> getStatus_filter() {
        return this.surrogate.getStatus_filter();
    }

    public final List<OrderTypeDto> getType_filter() {
        return this.surrogate.getType_filter();
    }

    public final List<String> getContract_id_filter() {
        return this.surrogate.getContract_id_filter();
    }

    public final Instant getUpdated_at_gte() {
        return this.surrogate.getUpdated_at_gte();
    }

    public final Integer getPage_size() {
        return this.surrogate.getPage_size();
    }

    public final String getToken() {
        return this.surrogate.getToken();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ListOrderRequestDto(java.util.List r2, java.util.List r3, java.util.List r4, p479j$.time.Instant r5, java.lang.Integer r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r9 = r8 & 2
            if (r9 == 0) goto L10
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L10:
            r9 = r8 & 4
            if (r9 == 0) goto L18
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L18:
            r9 = r8 & 8
            r0 = 0
            if (r9 == 0) goto L1e
            r5 = r0
        L1e:
            r9 = r8 & 16
            if (r9 == 0) goto L23
            r6 = r0
        L23:
            r8 = r8 & 32
            if (r8 == 0) goto L2f
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L36
        L2f:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L36:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: crypto_perpetuals.service.p440v1.ListOrderRequestDto.<init>(java.util.List, java.util.List, java.util.List, j$.time.Instant, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListOrderRequestDto(List<? extends OrderStatusDto> status_filter, List<? extends OrderTypeDto> type_filter, List<String> contract_id_filter, Instant instant, Integer num, String str) {
        this(new Surrogate(status_filter, type_filter, contract_id_filter, instant, num, str));
        Intrinsics.checkNotNullParameter(status_filter, "status_filter");
        Intrinsics.checkNotNullParameter(type_filter, "type_filter");
        Intrinsics.checkNotNullParameter(contract_id_filter, "contract_id_filter");
    }

    public static /* synthetic */ ListOrderRequestDto copy$default(ListOrderRequestDto listOrderRequestDto, List list, List list2, List list3, Instant instant, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = listOrderRequestDto.surrogate.getStatus_filter();
        }
        if ((i & 2) != 0) {
            list2 = listOrderRequestDto.surrogate.getType_filter();
        }
        if ((i & 4) != 0) {
            list3 = listOrderRequestDto.surrogate.getContract_id_filter();
        }
        if ((i & 8) != 0) {
            instant = listOrderRequestDto.surrogate.getUpdated_at_gte();
        }
        if ((i & 16) != 0) {
            num = listOrderRequestDto.surrogate.getPage_size();
        }
        if ((i & 32) != 0) {
            str = listOrderRequestDto.surrogate.getToken();
        }
        Integer num2 = num;
        String str2 = str;
        return listOrderRequestDto.copy(list, list2, list3, instant, num2, str2);
    }

    public final ListOrderRequestDto copy(List<? extends OrderStatusDto> status_filter, List<? extends OrderTypeDto> type_filter, List<String> contract_id_filter, Instant updated_at_gte, Integer page_size, String token) {
        Intrinsics.checkNotNullParameter(status_filter, "status_filter");
        Intrinsics.checkNotNullParameter(type_filter, "type_filter");
        Intrinsics.checkNotNullParameter(contract_id_filter, "contract_id_filter");
        return new ListOrderRequestDto(new Surrogate(status_filter, type_filter, contract_id_filter, updated_at_gte, page_size, token));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ListOrderRequest toProto() {
        List<OrderStatusDto> status_filter = this.surrogate.getStatus_filter();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(status_filter, 10));
        Iterator<T> it = status_filter.iterator();
        while (it.hasNext()) {
            arrayList.add((OrderStatus) ((OrderStatusDto) it.next()).toProto());
        }
        List<OrderTypeDto> type_filter = this.surrogate.getType_filter();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(type_filter, 10));
        Iterator<T> it2 = type_filter.iterator();
        while (it2.hasNext()) {
            arrayList2.add((OrderType) ((OrderTypeDto) it2.next()).toProto());
        }
        List<String> contract_id_filter = this.surrogate.getContract_id_filter();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(contract_id_filter, 10));
        Iterator<T> it3 = contract_id_filter.iterator();
        while (it3.hasNext()) {
            arrayList3.add((String) it3.next());
        }
        return new ListOrderRequest(arrayList, arrayList2, arrayList3, this.surrogate.getUpdated_at_gte(), this.surrogate.getPage_size(), this.surrogate.getToken(), null, 64, null);
    }

    public String toString() {
        return "[ListOrderRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ListOrderRequestDto) && Intrinsics.areEqual(((ListOrderRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: ListOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 >2\u00020\u0001:\u0002?>B\u008e\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012.\b\u0002\u0010\u000e\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0019\b\u0002\u0010\u0011\u001a\u0013\u0018\u00010\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014Bi\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010,R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b2\u0010.\u001a\u0004\b1\u0010,RF\u0010\u000e\u001a(\u0018\u00010\tj\u0013\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00103\u0012\u0004\b6\u0010.\u001a\u0004\b4\u00105R1\u0010\u0011\u001a\u0013\u0018\u00010\u000f¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00107\u0012\u0004\b:\u0010.\u001a\u0004\b8\u00109R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010;\u0012\u0004\b=\u0010.\u001a\u0004\b<\u0010#¨\u0006@"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ListOrderRequestDto$Surrogate;", "", "", "Lcrypto_perpetuals/order/v1/OrderStatusDto;", "status_filter", "Lcrypto_perpetuals/order/v1/OrderTypeDto;", "type_filter", "", "contract_id_filter", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "updated_at_gte", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "page_size", "token", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lj$/time/Instant;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_service_v1_externalRelease", "(Lcrypto_perpetuals/service/v1/ListOrderRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getStatus_filter", "()Ljava/util/List;", "getStatus_filter$annotations", "()V", "getType_filter", "getType_filter$annotations", "getContract_id_filter", "getContract_id_filter$annotations", "Lj$/time/Instant;", "getUpdated_at_gte", "()Lj$/time/Instant;", "getUpdated_at_gte$annotations", "Ljava/lang/Integer;", "getPage_size", "()Ljava/lang/Integer;", "getPage_size$annotations", "Ljava/lang/String;", "getToken", "getToken$annotations", "Companion", "$serializer", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<String> contract_id_filter;
        private final Integer page_size;
        private final List<OrderStatusDto> status_filter;
        private final String token;
        private final List<OrderTypeDto> type_filter;
        private final Instant updated_at_gte;

        public Surrogate() {
            this((List) null, (List) null, (List) null, (Instant) null, (Integer) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(OrderStatusDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(OrderTypeDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
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
            return Intrinsics.areEqual(this.status_filter, surrogate.status_filter) && Intrinsics.areEqual(this.type_filter, surrogate.type_filter) && Intrinsics.areEqual(this.contract_id_filter, surrogate.contract_id_filter) && Intrinsics.areEqual(this.updated_at_gte, surrogate.updated_at_gte) && Intrinsics.areEqual(this.page_size, surrogate.page_size) && Intrinsics.areEqual(this.token, surrogate.token);
        }

        public int hashCode() {
            int iHashCode = ((((this.status_filter.hashCode() * 31) + this.type_filter.hashCode()) * 31) + this.contract_id_filter.hashCode()) * 31;
            Instant instant = this.updated_at_gte;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Integer num = this.page_size;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.token;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(status_filter=" + this.status_filter + ", type_filter=" + this.type_filter + ", contract_id_filter=" + this.contract_id_filter + ", updated_at_gte=" + this.updated_at_gte + ", page_size=" + this.page_size + ", token=" + this.token + ")";
        }

        /* compiled from: ListOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ListOrderRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/service/v1/ListOrderRequestDto$Surrogate;", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ListOrderRequestDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: crypto_perpetuals.service.v1.ListOrderRequestDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ListOrderRequestDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: crypto_perpetuals.service.v1.ListOrderRequestDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ListOrderRequestDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: crypto_perpetuals.service.v1.ListOrderRequestDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ListOrderRequestDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null, null, null};
        }

        public /* synthetic */ Surrogate(int i, List list, List list2, List list3, Instant instant, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.status_filter = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.type_filter = CollectionsKt.emptyList();
            } else {
                this.type_filter = list2;
            }
            if ((i & 4) == 0) {
                this.contract_id_filter = CollectionsKt.emptyList();
            } else {
                this.contract_id_filter = list3;
            }
            if ((i & 8) == 0) {
                this.updated_at_gte = null;
            } else {
                this.updated_at_gte = instant;
            }
            if ((i & 16) == 0) {
                this.page_size = null;
            } else {
                this.page_size = num;
            }
            if ((i & 32) == 0) {
                this.token = null;
            } else {
                this.token = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.status_filter, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.status_filter);
            }
            if (!Intrinsics.areEqual(self.type_filter, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.type_filter);
            }
            if (!Intrinsics.areEqual(self.contract_id_filter, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.contract_id_filter);
            }
            Instant instant = self.updated_at_gte;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant);
            }
            Integer num = self.page_size;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            String str = self.token;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(List<? extends OrderStatusDto> status_filter, List<? extends OrderTypeDto> type_filter, List<String> contract_id_filter, Instant instant, Integer num, String str) {
            Intrinsics.checkNotNullParameter(status_filter, "status_filter");
            Intrinsics.checkNotNullParameter(type_filter, "type_filter");
            Intrinsics.checkNotNullParameter(contract_id_filter, "contract_id_filter");
            this.status_filter = status_filter;
            this.type_filter = type_filter;
            this.contract_id_filter = contract_id_filter;
            this.updated_at_gte = instant;
            this.page_size = num;
            this.token = str;
        }

        public final List<OrderStatusDto> getStatus_filter() {
            return this.status_filter;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.util.List r2, java.util.List r3, java.util.List r4, p479j$.time.Instant r5, java.lang.Integer r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L8
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L8:
                r9 = r8 & 2
                if (r9 == 0) goto L10
                java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            L10:
                r9 = r8 & 4
                if (r9 == 0) goto L18
                java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            L18:
                r9 = r8 & 8
                r0 = 0
                if (r9 == 0) goto L1e
                r5 = r0
            L1e:
                r9 = r8 & 16
                if (r9 == 0) goto L23
                r6 = r0
            L23:
                r8 = r8 & 32
                if (r8 == 0) goto L2f
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L36
            L2f:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L36:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: crypto_perpetuals.service.p440v1.ListOrderRequestDto.Surrogate.<init>(java.util.List, java.util.List, java.util.List, j$.time.Instant, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final List<OrderTypeDto> getType_filter() {
            return this.type_filter;
        }

        public final List<String> getContract_id_filter() {
            return this.contract_id_filter;
        }

        public final Instant getUpdated_at_gte() {
            return this.updated_at_gte;
        }

        public final Integer getPage_size() {
            return this.page_size;
        }

        public final String getToken() {
            return this.token;
        }
    }

    /* compiled from: ListOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ListOrderRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/service/v1/ListOrderRequestDto;", "Lcrypto_perpetuals/service/v1/ListOrderRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/service/v1/ListOrderRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ListOrderRequestDto, ListOrderRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ListOrderRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ListOrderRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ListOrderRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) ListOrderRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ListOrderRequest> getProtoAdapter() {
            return ListOrderRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ListOrderRequestDto getZeroValue() {
            return ListOrderRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ListOrderRequestDto fromProto(ListOrderRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<OrderStatus> status_filter = proto.getStatus_filter();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(status_filter, 10));
            Iterator<T> it = status_filter.iterator();
            while (it.hasNext()) {
                arrayList.add(OrderStatusDto.INSTANCE.fromProto((OrderStatus) it.next()));
            }
            List<OrderType> type_filter = proto.getType_filter();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(type_filter, 10));
            Iterator<T> it2 = type_filter.iterator();
            while (it2.hasNext()) {
                arrayList2.add(OrderTypeDto.INSTANCE.fromProto((OrderType) it2.next()));
            }
            List<String> contract_id_filter = proto.getContract_id_filter();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(contract_id_filter, 10));
            Iterator<T> it3 = contract_id_filter.iterator();
            while (it3.hasNext()) {
                arrayList3.add((String) it3.next());
            }
            return new ListOrderRequestDto(new Surrogate(arrayList, arrayList2, arrayList3, proto.getUpdated_at_gte(), proto.getPage_size(), proto.getToken()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.service.v1.ListOrderRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListOrderRequestDto.binaryBase64Serializer_delegate$lambda$3();
            }
        });
        zeroValue = new ListOrderRequestDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$3() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ListOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ListOrderRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/service/v1/ListOrderRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/service/v1/ListOrderRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<ListOrderRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.service.v1.ListOrderRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ListOrderRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ListOrderRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ListOrderRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ListOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/ListOrderRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "crypto_perpetuals.service.v1.ListOrderRequestDto";
        }
    }
}
