package com.robinhood.prediction_markets.proto.p361v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetOrderFormDisplayDetailsRequestDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetOrderFormDisplayDetailsResponseDto;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: GetOrderFormDisplayDetailsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\u0004\b\u0006\u0010\u0011JL\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponse;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto$Surrogate;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto$Surrogate;)V", "title_string", "", "subtitle_string", "order_receipt_title", "yes_no_and_contract_name", "caching_key", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto;", "selected_leg_strings", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto;Ljava/util/List;)V", "getTitle_string", "()Ljava/lang/String;", "getSubtitle_string", "getOrder_receipt_title", "getYes_no_and_contract_name", "getCaching_key", "()Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto;", "getSelected_leg_strings", "()Ljava/util/List;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class GetOrderFormDisplayDetailsResponseDto implements Dto3<GetOrderFormDisplayDetailsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetOrderFormDisplayDetailsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetOrderFormDisplayDetailsResponseDto, GetOrderFormDisplayDetailsResponse>> binaryBase64Serializer$delegate;
    private static final GetOrderFormDisplayDetailsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetOrderFormDisplayDetailsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetOrderFormDisplayDetailsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle_string() {
        return this.surrogate.getTitle_string();
    }

    public final String getSubtitle_string() {
        return this.surrogate.getSubtitle_string();
    }

    public final String getOrder_receipt_title() {
        return this.surrogate.getOrder_receipt_title();
    }

    public final String getYes_no_and_contract_name() {
        return this.surrogate.getYes_no_and_contract_name();
    }

    public final GetOrderFormDisplayDetailsRequestDto getCaching_key() {
        return this.surrogate.getCaching_key();
    }

    public final List<String> getSelected_leg_strings() {
        return this.surrogate.getSelected_leg_strings();
    }

    public /* synthetic */ GetOrderFormDisplayDetailsResponseDto(String str, String str2, String str3, String str4, GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : getOrderFormDisplayDetailsRequestDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetOrderFormDisplayDetailsResponseDto(String title_string, String str, String order_receipt_title, String yes_no_and_contract_name, GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDto, List<String> selected_leg_strings) {
        this(new Surrogate(title_string, str, order_receipt_title, yes_no_and_contract_name, getOrderFormDisplayDetailsRequestDto, selected_leg_strings));
        Intrinsics.checkNotNullParameter(title_string, "title_string");
        Intrinsics.checkNotNullParameter(order_receipt_title, "order_receipt_title");
        Intrinsics.checkNotNullParameter(yes_no_and_contract_name, "yes_no_and_contract_name");
        Intrinsics.checkNotNullParameter(selected_leg_strings, "selected_leg_strings");
    }

    public static /* synthetic */ GetOrderFormDisplayDetailsResponseDto copy$default(GetOrderFormDisplayDetailsResponseDto getOrderFormDisplayDetailsResponseDto, String str, String str2, String str3, String str4, GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getOrderFormDisplayDetailsResponseDto.surrogate.getTitle_string();
        }
        if ((i & 2) != 0) {
            str2 = getOrderFormDisplayDetailsResponseDto.surrogate.getSubtitle_string();
        }
        if ((i & 4) != 0) {
            str3 = getOrderFormDisplayDetailsResponseDto.surrogate.getOrder_receipt_title();
        }
        if ((i & 8) != 0) {
            str4 = getOrderFormDisplayDetailsResponseDto.surrogate.getYes_no_and_contract_name();
        }
        if ((i & 16) != 0) {
            getOrderFormDisplayDetailsRequestDto = getOrderFormDisplayDetailsResponseDto.surrogate.getCaching_key();
        }
        if ((i & 32) != 0) {
            list = getOrderFormDisplayDetailsResponseDto.surrogate.getSelected_leg_strings();
        }
        GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDto2 = getOrderFormDisplayDetailsRequestDto;
        List list2 = list;
        return getOrderFormDisplayDetailsResponseDto.copy(str, str2, str3, str4, getOrderFormDisplayDetailsRequestDto2, list2);
    }

    public final GetOrderFormDisplayDetailsResponseDto copy(String title_string, String subtitle_string, String order_receipt_title, String yes_no_and_contract_name, GetOrderFormDisplayDetailsRequestDto caching_key, List<String> selected_leg_strings) {
        Intrinsics.checkNotNullParameter(title_string, "title_string");
        Intrinsics.checkNotNullParameter(order_receipt_title, "order_receipt_title");
        Intrinsics.checkNotNullParameter(yes_no_and_contract_name, "yes_no_and_contract_name");
        Intrinsics.checkNotNullParameter(selected_leg_strings, "selected_leg_strings");
        return new GetOrderFormDisplayDetailsResponseDto(new Surrogate(title_string, subtitle_string, order_receipt_title, yes_no_and_contract_name, caching_key, selected_leg_strings));
    }

    @Override // com.robinhood.idl.Dto
    public GetOrderFormDisplayDetailsResponse toProto() {
        String title_string = this.surrogate.getTitle_string();
        String subtitle_string = this.surrogate.getSubtitle_string();
        String order_receipt_title = this.surrogate.getOrder_receipt_title();
        String yes_no_and_contract_name = this.surrogate.getYes_no_and_contract_name();
        GetOrderFormDisplayDetailsRequestDto caching_key = this.surrogate.getCaching_key();
        GetOrderFormDisplayDetailsRequest proto = caching_key != null ? caching_key.toProto() : null;
        List<String> selected_leg_strings = this.surrogate.getSelected_leg_strings();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selected_leg_strings, 10));
        Iterator<T> it = selected_leg_strings.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new GetOrderFormDisplayDetailsResponse(title_string, subtitle_string, order_receipt_title, yes_no_and_contract_name, proto, arrayList, null, 64, null);
    }

    public String toString() {
        return "[GetOrderFormDisplayDetailsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetOrderFormDisplayDetailsResponseDto) && Intrinsics.areEqual(((GetOrderFormDisplayDetailsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetOrderFormDisplayDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000267BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003JO\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000eHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J%\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010!¨\u00068"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto$Surrogate;", "", "title_string", "", "subtitle_string", "order_receipt_title", "yes_no_and_contract_name", "caching_key", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto;", "selected_leg_strings", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitle_string$annotations", "()V", "getTitle_string", "()Ljava/lang/String;", "getSubtitle_string$annotations", "getSubtitle_string", "getOrder_receipt_title$annotations", "getOrder_receipt_title", "getYes_no_and_contract_name$annotations", "getYes_no_and_contract_name", "getCaching_key$annotations", "getCaching_key", "()Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsRequestDto;", "getSelected_leg_strings$annotations", "getSelected_leg_strings", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$prediction_markets_v1_externalRelease", "$serializer", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final GetOrderFormDisplayDetailsRequestDto caching_key;
        private final String order_receipt_title;
        private final List<String> selected_leg_strings;
        private final String subtitle_string;
        private final String title_string;
        private final String yes_no_and_contract_name;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.GetOrderFormDisplayDetailsResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetOrderFormDisplayDetailsResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (GetOrderFormDisplayDetailsRequestDto) null, (List) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDto, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.title_string;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.subtitle_string;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.order_receipt_title;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.yes_no_and_contract_name;
            }
            if ((i & 16) != 0) {
                getOrderFormDisplayDetailsRequestDto = surrogate.caching_key;
            }
            if ((i & 32) != 0) {
                list = surrogate.selected_leg_strings;
            }
            GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDto2 = getOrderFormDisplayDetailsRequestDto;
            List list2 = list;
            return surrogate.copy(str, str2, str3, str4, getOrderFormDisplayDetailsRequestDto2, list2);
        }

        @SerialName("cachingKey")
        @JsonAnnotations2(names = {"caching_key"})
        public static /* synthetic */ void getCaching_key$annotations() {
        }

        @SerialName("orderReceiptTitle")
        @JsonAnnotations2(names = {"order_receipt_title"})
        public static /* synthetic */ void getOrder_receipt_title$annotations() {
        }

        @SerialName("selectedLegStrings")
        @JsonAnnotations2(names = {"selected_leg_strings"})
        public static /* synthetic */ void getSelected_leg_strings$annotations() {
        }

        @SerialName("subtitleString")
        @JsonAnnotations2(names = {"subtitle_string"})
        public static /* synthetic */ void getSubtitle_string$annotations() {
        }

        @SerialName("titleString")
        @JsonAnnotations2(names = {"title_string"})
        public static /* synthetic */ void getTitle_string$annotations() {
        }

        @SerialName("yesNoAndContractName")
        @JsonAnnotations2(names = {"yes_no_and_contract_name"})
        public static /* synthetic */ void getYes_no_and_contract_name$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle_string() {
            return this.title_string;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle_string() {
            return this.subtitle_string;
        }

        /* renamed from: component3, reason: from getter */
        public final String getOrder_receipt_title() {
            return this.order_receipt_title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getYes_no_and_contract_name() {
            return this.yes_no_and_contract_name;
        }

        /* renamed from: component5, reason: from getter */
        public final GetOrderFormDisplayDetailsRequestDto getCaching_key() {
            return this.caching_key;
        }

        public final List<String> component6() {
            return this.selected_leg_strings;
        }

        public final Surrogate copy(String title_string, String subtitle_string, String order_receipt_title, String yes_no_and_contract_name, GetOrderFormDisplayDetailsRequestDto caching_key, List<String> selected_leg_strings) {
            Intrinsics.checkNotNullParameter(title_string, "title_string");
            Intrinsics.checkNotNullParameter(order_receipt_title, "order_receipt_title");
            Intrinsics.checkNotNullParameter(yes_no_and_contract_name, "yes_no_and_contract_name");
            Intrinsics.checkNotNullParameter(selected_leg_strings, "selected_leg_strings");
            return new Surrogate(title_string, subtitle_string, order_receipt_title, yes_no_and_contract_name, caching_key, selected_leg_strings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title_string, surrogate.title_string) && Intrinsics.areEqual(this.subtitle_string, surrogate.subtitle_string) && Intrinsics.areEqual(this.order_receipt_title, surrogate.order_receipt_title) && Intrinsics.areEqual(this.yes_no_and_contract_name, surrogate.yes_no_and_contract_name) && Intrinsics.areEqual(this.caching_key, surrogate.caching_key) && Intrinsics.areEqual(this.selected_leg_strings, surrogate.selected_leg_strings);
        }

        public int hashCode() {
            int iHashCode = this.title_string.hashCode() * 31;
            String str = this.subtitle_string;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.order_receipt_title.hashCode()) * 31) + this.yes_no_and_contract_name.hashCode()) * 31;
            GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDto = this.caching_key;
            return ((iHashCode2 + (getOrderFormDisplayDetailsRequestDto != null ? getOrderFormDisplayDetailsRequestDto.hashCode() : 0)) * 31) + this.selected_leg_strings.hashCode();
        }

        public String toString() {
            return "Surrogate(title_string=" + this.title_string + ", subtitle_string=" + this.subtitle_string + ", order_receipt_title=" + this.order_receipt_title + ", yes_no_and_contract_name=" + this.yes_no_and_contract_name + ", caching_key=" + this.caching_key + ", selected_leg_strings=" + this.selected_leg_strings + ")";
        }

        /* compiled from: GetOrderFormDisplayDetailsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto$Surrogate;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetOrderFormDisplayDetailsResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDto, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title_string = "";
            } else {
                this.title_string = str;
            }
            if ((i & 2) == 0) {
                this.subtitle_string = null;
            } else {
                this.subtitle_string = str2;
            }
            if ((i & 4) == 0) {
                this.order_receipt_title = "";
            } else {
                this.order_receipt_title = str3;
            }
            if ((i & 8) == 0) {
                this.yes_no_and_contract_name = "";
            } else {
                this.yes_no_and_contract_name = str4;
            }
            if ((i & 16) == 0) {
                this.caching_key = null;
            } else {
                this.caching_key = getOrderFormDisplayDetailsRequestDto;
            }
            if ((i & 32) == 0) {
                this.selected_leg_strings = CollectionsKt.emptyList();
            } else {
                this.selected_leg_strings = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$prediction_markets_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.title_string, "")) {
                output.encodeStringElement(serialDesc, 0, self.title_string);
            }
            String str = self.subtitle_string;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.order_receipt_title, "")) {
                output.encodeStringElement(serialDesc, 2, self.order_receipt_title);
            }
            if (!Intrinsics.areEqual(self.yes_no_and_contract_name, "")) {
                output.encodeStringElement(serialDesc, 3, self.yes_no_and_contract_name);
            }
            GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDto = self.caching_key;
            if (getOrderFormDisplayDetailsRequestDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, GetOrderFormDisplayDetailsRequestDto.Serializer.INSTANCE, getOrderFormDisplayDetailsRequestDto);
            }
            if (Intrinsics.areEqual(self.selected_leg_strings, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.selected_leg_strings);
        }

        public Surrogate(String title_string, String str, String order_receipt_title, String yes_no_and_contract_name, GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDto, List<String> selected_leg_strings) {
            Intrinsics.checkNotNullParameter(title_string, "title_string");
            Intrinsics.checkNotNullParameter(order_receipt_title, "order_receipt_title");
            Intrinsics.checkNotNullParameter(yes_no_and_contract_name, "yes_no_and_contract_name");
            Intrinsics.checkNotNullParameter(selected_leg_strings, "selected_leg_strings");
            this.title_string = title_string;
            this.subtitle_string = str;
            this.order_receipt_title = order_receipt_title;
            this.yes_no_and_contract_name = yes_no_and_contract_name;
            this.caching_key = getOrderFormDisplayDetailsRequestDto;
            this.selected_leg_strings = selected_leg_strings;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : getOrderFormDisplayDetailsRequestDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getTitle_string() {
            return this.title_string;
        }

        public final String getSubtitle_string() {
            return this.subtitle_string;
        }

        public final String getOrder_receipt_title() {
            return this.order_receipt_title;
        }

        public final String getYes_no_and_contract_name() {
            return this.yes_no_and_contract_name;
        }

        public final GetOrderFormDisplayDetailsRequestDto getCaching_key() {
            return this.caching_key;
        }

        public final List<String> getSelected_leg_strings() {
            return this.selected_leg_strings;
        }
    }

    /* compiled from: GetOrderFormDisplayDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetOrderFormDisplayDetailsResponseDto, GetOrderFormDisplayDetailsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetOrderFormDisplayDetailsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetOrderFormDisplayDetailsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetOrderFormDisplayDetailsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetOrderFormDisplayDetailsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetOrderFormDisplayDetailsResponse> getProtoAdapter() {
            return GetOrderFormDisplayDetailsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetOrderFormDisplayDetailsResponseDto getZeroValue() {
            return GetOrderFormDisplayDetailsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetOrderFormDisplayDetailsResponseDto fromProto(GetOrderFormDisplayDetailsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title_string = proto.getTitle_string();
            String subtitle_string = proto.getSubtitle_string();
            String order_receipt_title = proto.getOrder_receipt_title();
            String yes_no_and_contract_name = proto.getYes_no_and_contract_name();
            GetOrderFormDisplayDetailsRequest caching_key = proto.getCaching_key();
            DefaultConstructorMarker defaultConstructorMarker = null;
            GetOrderFormDisplayDetailsRequestDto getOrderFormDisplayDetailsRequestDtoFromProto = caching_key != null ? GetOrderFormDisplayDetailsRequestDto.INSTANCE.fromProto(caching_key) : null;
            List<String> selected_leg_strings = proto.getSelected_leg_strings();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selected_leg_strings, 10));
            Iterator<T> it = selected_leg_strings.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new GetOrderFormDisplayDetailsResponseDto(new Surrogate(title_string, subtitle_string, order_receipt_title, yes_no_and_contract_name, getOrderFormDisplayDetailsRequestDtoFromProto, arrayList), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.GetOrderFormDisplayDetailsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetOrderFormDisplayDetailsResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetOrderFormDisplayDetailsResponseDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetOrderFormDisplayDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetOrderFormDisplayDetailsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/prediction_markets.v1.GetOrderFormDisplayDetailsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetOrderFormDisplayDetailsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetOrderFormDisplayDetailsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetOrderFormDisplayDetailsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetOrderFormDisplayDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.prediction_markets.proto.v1.idl.GetOrderFormDisplayDetailsResponseDto";
        }
    }
}
