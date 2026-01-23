package wormhole.service.p554v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
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
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.GetRealizedGainLossItemsRequestDto;
import wormhole.service.p554v1.SortDirectionDto;
import wormhole.service.p554v1.SortTypeDto;
import wormhole.service.p554v1.SpanDto;

/* compiled from: GetRealizedGainLossItemsRequestDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00041234B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B]\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u0015JZ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\tJ\b\u0010#\u001a\u00020\u0002H\u0016J\b\u0010$\u001a\u00020\tH\u0016J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010)\u001a\u00020*H\u0016J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020*H\u0016J\b\u00100\u001a\u00020*H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u0017R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0017¨\u00065"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lwormhole/service/v1/GetRealizedGainLossItemsRequest;", "Landroid/os/Parcelable;", "surrogate", "Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto$Surrogate;", "<init>", "(Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto$Surrogate;)V", "account_number", "", "span", "Lwormhole/service/v1/SpanDto;", "asset_classes", "", "Lwormhole/service/v1/AssetClassDto;", "sort_type", "Lwormhole/service/v1/SortTypeDto;", "sort_direction", "Lwormhole/service/v1/SortDirectionDto;", "symbol", "next_cursor", "(Ljava/lang/String;Lwormhole/service/v1/SpanDto;Ljava/util/List;Lwormhole/service/v1/SortTypeDto;Lwormhole/service/v1/SortDirectionDto;Ljava/lang/String;Ljava/lang/String;)V", "getAccount_number", "()Ljava/lang/String;", "getSpan", "()Lwormhole/service/v1/SpanDto;", "getAsset_classes", "()Ljava/util/List;", "getSort_type", "()Lwormhole/service/v1/SortTypeDto;", "getSort_direction", "()Lwormhole/service/v1/SortDirectionDto;", "getSymbol", "getNext_cursor", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class GetRealizedGainLossItemsRequestDto implements Dto3<GetRealizedGainLossItemsRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetRealizedGainLossItemsRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetRealizedGainLossItemsRequestDto, GetRealizedGainLossItemsRequest>> binaryBase64Serializer$delegate;
    private static final GetRealizedGainLossItemsRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetRealizedGainLossItemsRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetRealizedGainLossItemsRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final SpanDto getSpan() {
        return this.surrogate.getSpan();
    }

    public final List<AssetClassDto> getAsset_classes() {
        return this.surrogate.getAsset_classes();
    }

    public final SortTypeDto getSort_type() {
        return this.surrogate.getSort_type();
    }

    public final SortDirectionDto getSort_direction() {
        return this.surrogate.getSort_direction();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final String getNext_cursor() {
        return this.surrogate.getNext_cursor();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GetRealizedGainLossItemsRequestDto(java.lang.String r2, wormhole.service.p554v1.SpanDto r3, java.util.List r4, wormhole.service.p554v1.SortTypeDto r5, wormhole.service.p554v1.SortDirectionDto r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto L10
            wormhole.service.v1.SpanDto$Companion r3 = wormhole.service.p554v1.SpanDto.INSTANCE
            wormhole.service.v1.SpanDto r3 = r3.getZeroValue()
        L10:
            r10 = r9 & 4
            if (r10 == 0) goto L18
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L18:
            r10 = r9 & 8
            r0 = 0
            if (r10 == 0) goto L1e
            r5 = r0
        L1e:
            r10 = r9 & 16
            if (r10 == 0) goto L23
            r6 = r0
        L23:
            r10 = r9 & 32
            if (r10 == 0) goto L28
            r7 = r0
        L28:
            r9 = r9 & 64
            if (r9 == 0) goto L35
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L3d
        L35:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L3d:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wormhole.service.p554v1.GetRealizedGainLossItemsRequestDto.<init>(java.lang.String, wormhole.service.v1.SpanDto, java.util.List, wormhole.service.v1.SortTypeDto, wormhole.service.v1.SortDirectionDto, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetRealizedGainLossItemsRequestDto(String account_number, SpanDto span, List<? extends AssetClassDto> asset_classes, SortTypeDto sortTypeDto, SortDirectionDto sortDirectionDto, String str, String str2) {
        this(new Surrogate(account_number, span, asset_classes, sortTypeDto, sortDirectionDto, str, str2));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(asset_classes, "asset_classes");
    }

    public static /* synthetic */ GetRealizedGainLossItemsRequestDto copy$default(GetRealizedGainLossItemsRequestDto getRealizedGainLossItemsRequestDto, String str, SpanDto spanDto, List list, SortTypeDto sortTypeDto, SortDirectionDto sortDirectionDto, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getRealizedGainLossItemsRequestDto.surrogate.getAccount_number();
        }
        if ((i & 2) != 0) {
            spanDto = getRealizedGainLossItemsRequestDto.surrogate.getSpan();
        }
        if ((i & 4) != 0) {
            list = getRealizedGainLossItemsRequestDto.surrogate.getAsset_classes();
        }
        if ((i & 8) != 0) {
            sortTypeDto = getRealizedGainLossItemsRequestDto.surrogate.getSort_type();
        }
        if ((i & 16) != 0) {
            sortDirectionDto = getRealizedGainLossItemsRequestDto.surrogate.getSort_direction();
        }
        if ((i & 32) != 0) {
            str2 = getRealizedGainLossItemsRequestDto.surrogate.getSymbol();
        }
        if ((i & 64) != 0) {
            str3 = getRealizedGainLossItemsRequestDto.surrogate.getNext_cursor();
        }
        String str4 = str2;
        String str5 = str3;
        SortDirectionDto sortDirectionDto2 = sortDirectionDto;
        List list2 = list;
        return getRealizedGainLossItemsRequestDto.copy(str, spanDto, list2, sortTypeDto, sortDirectionDto2, str4, str5);
    }

    public final GetRealizedGainLossItemsRequestDto copy(String account_number, SpanDto span, List<? extends AssetClassDto> asset_classes, SortTypeDto sort_type, SortDirectionDto sort_direction, String symbol, String next_cursor) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(asset_classes, "asset_classes");
        return new GetRealizedGainLossItemsRequestDto(new Surrogate(account_number, span, asset_classes, sort_type, sort_direction, symbol, next_cursor));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetRealizedGainLossItemsRequest toProto() {
        String account_number = this.surrogate.getAccount_number();
        Span span = (Span) this.surrogate.getSpan().toProto();
        List<AssetClassDto> asset_classes = this.surrogate.getAsset_classes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asset_classes, 10));
        Iterator<T> it = asset_classes.iterator();
        while (it.hasNext()) {
            arrayList.add((AssetClass) ((AssetClassDto) it.next()).toProto());
        }
        SortTypeDto sort_type = this.surrogate.getSort_type();
        SortType sortType = sort_type != null ? (SortType) sort_type.toProto() : null;
        SortDirectionDto sort_direction = this.surrogate.getSort_direction();
        return new GetRealizedGainLossItemsRequest(account_number, span, arrayList, sortType, sort_direction != null ? (SortDirection) sort_direction.toProto() : null, this.surrogate.getSymbol(), this.surrogate.getNext_cursor(), null, 128, null);
    }

    public String toString() {
        return "[GetRealizedGainLossItemsRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetRealizedGainLossItemsRequestDto) && Intrinsics.areEqual(((GetRealizedGainLossItemsRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetRealizedGainLossItemsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0083\b\u0018\u0000 ?2\u00020\u0001:\u0002@?B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010Bg\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b2\u0010*\u001a\u0004\b0\u00101R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b6\u0010*\u001a\u0004\b4\u00105R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\b:\u0010*\u001a\u0004\b8\u00109R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010'\u0012\u0004\b<\u0010*\u001a\u0004\b;\u0010 R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010'\u0012\u0004\b>\u0010*\u001a\u0004\b=\u0010 ¨\u0006A"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto$Surrogate;", "", "", "account_number", "Lwormhole/service/v1/SpanDto;", "span", "", "Lwormhole/service/v1/AssetClassDto;", "asset_classes", "Lwormhole/service/v1/SortTypeDto;", "sort_type", "Lwormhole/service/v1/SortDirectionDto;", "sort_direction", "symbol", "next_cursor", "<init>", "(Ljava/lang/String;Lwormhole/service/v1/SpanDto;Ljava/util/List;Lwormhole/service/v1/SortTypeDto;Lwormhole/service/v1/SortDirectionDto;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lwormhole/service/v1/SpanDto;Ljava/util/List;Lwormhole/service/v1/SortTypeDto;Lwormhole/service/v1/SortDirectionDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wormhole_v1_externalRelease", "(Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "Lwormhole/service/v1/SpanDto;", "getSpan", "()Lwormhole/service/v1/SpanDto;", "getSpan$annotations", "Ljava/util/List;", "getAsset_classes", "()Ljava/util/List;", "getAsset_classes$annotations", "Lwormhole/service/v1/SortTypeDto;", "getSort_type", "()Lwormhole/service/v1/SortTypeDto;", "getSort_type$annotations", "Lwormhole/service/v1/SortDirectionDto;", "getSort_direction", "()Lwormhole/service/v1/SortDirectionDto;", "getSort_direction$annotations", "getSymbol", "getSymbol$annotations", "getNext_cursor", "getNext_cursor$annotations", "Companion", "$serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Surrogate {
        private final String account_number;
        private final List<AssetClassDto> asset_classes;
        private final String next_cursor;
        private final SortDirectionDto sort_direction;
        private final SortTypeDto sort_type;
        private final SpanDto span;
        private final String symbol;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: wormhole.service.v1.GetRealizedGainLossItemsRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetRealizedGainLossItemsRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null};

        public Surrogate() {
            this((String) null, (SpanDto) null, (List) null, (SortTypeDto) null, (SortDirectionDto) null, (String) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(AssetClassDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && this.span == surrogate.span && Intrinsics.areEqual(this.asset_classes, surrogate.asset_classes) && this.sort_type == surrogate.sort_type && this.sort_direction == surrogate.sort_direction && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.next_cursor, surrogate.next_cursor);
        }

        public int hashCode() {
            int iHashCode = ((((this.account_number.hashCode() * 31) + this.span.hashCode()) * 31) + this.asset_classes.hashCode()) * 31;
            SortTypeDto sortTypeDto = this.sort_type;
            int iHashCode2 = (iHashCode + (sortTypeDto == null ? 0 : sortTypeDto.hashCode())) * 31;
            SortDirectionDto sortDirectionDto = this.sort_direction;
            int iHashCode3 = (iHashCode2 + (sortDirectionDto == null ? 0 : sortDirectionDto.hashCode())) * 31;
            String str = this.symbol;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.next_cursor;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", span=" + this.span + ", asset_classes=" + this.asset_classes + ", sort_type=" + this.sort_type + ", sort_direction=" + this.sort_direction + ", symbol=" + this.symbol + ", next_cursor=" + this.next_cursor + ")";
        }

        /* compiled from: GetRealizedGainLossItemsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto$Surrogate;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetRealizedGainLossItemsRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, SpanDto spanDto, List list, SortTypeDto sortTypeDto, SortDirectionDto sortDirectionDto, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_number = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.span = SpanDto.INSTANCE.getZeroValue();
            } else {
                this.span = spanDto;
            }
            if ((i & 4) == 0) {
                this.asset_classes = CollectionsKt.emptyList();
            } else {
                this.asset_classes = list;
            }
            if ((i & 8) == 0) {
                this.sort_type = null;
            } else {
                this.sort_type = sortTypeDto;
            }
            if ((i & 16) == 0) {
                this.sort_direction = null;
            } else {
                this.sort_direction = sortDirectionDto;
            }
            if ((i & 32) == 0) {
                this.symbol = null;
            } else {
                this.symbol = str2;
            }
            if ((i & 64) == 0) {
                this.next_cursor = null;
            } else {
                this.next_cursor = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$wormhole_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            if (self.span != SpanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, SpanDto.Serializer.INSTANCE, self.span);
            }
            if (!Intrinsics.areEqual(self.asset_classes, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.asset_classes);
            }
            SortTypeDto sortTypeDto = self.sort_type;
            if (sortTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, SortTypeDto.Serializer.INSTANCE, sortTypeDto);
            }
            SortDirectionDto sortDirectionDto = self.sort_direction;
            if (sortDirectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, SortDirectionDto.Serializer.INSTANCE, sortDirectionDto);
            }
            String str = self.symbol;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str);
            }
            String str2 = self.next_cursor;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(String account_number, SpanDto span, List<? extends AssetClassDto> asset_classes, SortTypeDto sortTypeDto, SortDirectionDto sortDirectionDto, String str, String str2) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(span, "span");
            Intrinsics.checkNotNullParameter(asset_classes, "asset_classes");
            this.account_number = account_number;
            this.span = span;
            this.asset_classes = asset_classes;
            this.sort_type = sortTypeDto;
            this.sort_direction = sortDirectionDto;
            this.symbol = str;
            this.next_cursor = str2;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, wormhole.service.p554v1.SpanDto r3, java.util.List r4, wormhole.service.p554v1.SortTypeDto r5, wormhole.service.p554v1.SortDirectionDto r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r10 = r9 & 2
                if (r10 == 0) goto L10
                wormhole.service.v1.SpanDto$Companion r3 = wormhole.service.p554v1.SpanDto.INSTANCE
                wormhole.service.v1.SpanDto r3 = r3.getZeroValue()
            L10:
                r10 = r9 & 4
                if (r10 == 0) goto L18
                java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            L18:
                r10 = r9 & 8
                r0 = 0
                if (r10 == 0) goto L1e
                r5 = r0
            L1e:
                r10 = r9 & 16
                if (r10 == 0) goto L23
                r6 = r0
            L23:
                r10 = r9 & 32
                if (r10 == 0) goto L28
                r7 = r0
            L28:
                r9 = r9 & 64
                if (r9 == 0) goto L35
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L3d
            L35:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L3d:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wormhole.service.p554v1.GetRealizedGainLossItemsRequestDto.Surrogate.<init>(java.lang.String, wormhole.service.v1.SpanDto, java.util.List, wormhole.service.v1.SortTypeDto, wormhole.service.v1.SortDirectionDto, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final SpanDto getSpan() {
            return this.span;
        }

        public final List<AssetClassDto> getAsset_classes() {
            return this.asset_classes;
        }

        public final SortTypeDto getSort_type() {
            return this.sort_type;
        }

        public final SortDirectionDto getSort_direction() {
            return this.sort_direction;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getNext_cursor() {
            return this.next_cursor;
        }
    }

    /* compiled from: GetRealizedGainLossItemsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;", "Lwormhole/service/v1/GetRealizedGainLossItemsRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetRealizedGainLossItemsRequestDto, GetRealizedGainLossItemsRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetRealizedGainLossItemsRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetRealizedGainLossItemsRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetRealizedGainLossItemsRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetRealizedGainLossItemsRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetRealizedGainLossItemsRequest> getProtoAdapter() {
            return GetRealizedGainLossItemsRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetRealizedGainLossItemsRequestDto getZeroValue() {
            return GetRealizedGainLossItemsRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetRealizedGainLossItemsRequestDto fromProto(GetRealizedGainLossItemsRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            SpanDto spanDtoFromProto = SpanDto.INSTANCE.fromProto(proto.getSpan());
            List<AssetClass> asset_classes = proto.getAsset_classes();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asset_classes, 10));
            Iterator<T> it = asset_classes.iterator();
            while (it.hasNext()) {
                arrayList.add(AssetClassDto.INSTANCE.fromProto((AssetClass) it.next()));
            }
            SortType sort_type = proto.getSort_type();
            DefaultConstructorMarker defaultConstructorMarker = null;
            SortTypeDto sortTypeDtoFromProto = sort_type != null ? SortTypeDto.INSTANCE.fromProto(sort_type) : null;
            SortDirection sort_direction = proto.getSort_direction();
            return new GetRealizedGainLossItemsRequestDto(new Surrogate(account_number, spanDtoFromProto, arrayList, sortTypeDtoFromProto, sort_direction != null ? SortDirectionDto.INSTANCE.fromProto(sort_direction) : null, proto.getSymbol(), proto.getNext_cursor()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: wormhole.service.v1.GetRealizedGainLossItemsRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetRealizedGainLossItemsRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetRealizedGainLossItemsRequestDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetRealizedGainLossItemsRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto;", "<init>", "()V", "surrogateSerializer", "Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes28.dex */
    public static final class Serializer implements KSerializer<GetRealizedGainLossItemsRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/wormhole.service.v1.GetRealizedGainLossItemsRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetRealizedGainLossItemsRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetRealizedGainLossItemsRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetRealizedGainLossItemsRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetRealizedGainLossItemsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedGainLossItemsRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "wormhole.service.v1.GetRealizedGainLossItemsRequestDto";
        }
    }
}
