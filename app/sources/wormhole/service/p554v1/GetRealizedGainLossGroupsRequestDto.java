package wormhole.service.p554v1;

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
import wormhole.service.p554v1.AssetClassDto;
import wormhole.service.p554v1.GetRealizedGainLossGroupsRequestDto;
import wormhole.service.p554v1.GroupTypeDto;
import wormhole.service.p554v1.SortDirectionDto;
import wormhole.service.p554v1.SortTypeDto;
import wormhole.service.p554v1.SpanDto;

/* compiled from: GetRealizedGainLossGroupsRequestDto.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00046578B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0019R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00069"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lwormhole/service/v1/GetRealizedGainLossGroupsRequest;", "Landroid/os/Parcelable;", "Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto$Surrogate;", "surrogate", "<init>", "(Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto$Surrogate;)V", "Lwormhole/service/v1/GroupTypeDto;", "group_type", "", "account_number", "Lwormhole/service/v1/SpanDto;", "span", "", "Lwormhole/service/v1/AssetClassDto;", "asset_classes", "Lwormhole/service/v1/SortTypeDto;", "sort_type", "Lwormhole/service/v1/SortDirectionDto;", "sort_direction", "(Lwormhole/service/v1/GroupTypeDto;Ljava/lang/String;Lwormhole/service/v1/SpanDto;Ljava/util/List;Lwormhole/service/v1/SortTypeDto;Lwormhole/service/v1/SortDirectionDto;)V", "toProto", "()Lwormhole/service/v1/GetRealizedGainLossGroupsRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto$Surrogate;", "getGroup_type", "()Lwormhole/service/v1/GroupTypeDto;", "getAccount_number", "getSpan", "()Lwormhole/service/v1/SpanDto;", "getAsset_classes", "()Ljava/util/List;", "getSort_type", "()Lwormhole/service/v1/SortTypeDto;", "getSort_direction", "()Lwormhole/service/v1/SortDirectionDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class GetRealizedGainLossGroupsRequestDto implements Dto3<GetRealizedGainLossGroupsRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetRealizedGainLossGroupsRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetRealizedGainLossGroupsRequestDto, GetRealizedGainLossGroupsRequest>> binaryBase64Serializer$delegate;
    private static final GetRealizedGainLossGroupsRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetRealizedGainLossGroupsRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetRealizedGainLossGroupsRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final GroupTypeDto getGroup_type() {
        return this.surrogate.getGroup_type();
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

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GetRealizedGainLossGroupsRequestDto(wormhole.service.p554v1.GroupTypeDto r2, java.lang.String r3, wormhole.service.p554v1.SpanDto r4, java.util.List r5, wormhole.service.p554v1.SortTypeDto r6, wormhole.service.p554v1.SortDirectionDto r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto La
            wormhole.service.v1.GroupTypeDto$Companion r2 = wormhole.service.p554v1.GroupTypeDto.INSTANCE
            wormhole.service.v1.GroupTypeDto r2 = r2.getZeroValue()
        La:
            r9 = r8 & 2
            if (r9 == 0) goto L10
            java.lang.String r3 = ""
        L10:
            r9 = r8 & 4
            if (r9 == 0) goto L1a
            wormhole.service.v1.SpanDto$Companion r4 = wormhole.service.p554v1.SpanDto.INSTANCE
            wormhole.service.v1.SpanDto r4 = r4.getZeroValue()
        L1a:
            r9 = r8 & 8
            if (r9 == 0) goto L22
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
        L22:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto L28
            r6 = r0
        L28:
            r8 = r8 & 32
            if (r8 == 0) goto L34
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L3b
        L34:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L3b:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wormhole.service.p554v1.GetRealizedGainLossGroupsRequestDto.<init>(wormhole.service.v1.GroupTypeDto, java.lang.String, wormhole.service.v1.SpanDto, java.util.List, wormhole.service.v1.SortTypeDto, wormhole.service.v1.SortDirectionDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetRealizedGainLossGroupsRequestDto(GroupTypeDto group_type, String account_number, SpanDto span, List<? extends AssetClassDto> asset_classes, SortTypeDto sortTypeDto, SortDirectionDto sortDirectionDto) {
        this(new Surrogate(group_type, account_number, span, asset_classes, sortTypeDto, sortDirectionDto));
        Intrinsics.checkNotNullParameter(group_type, "group_type");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(asset_classes, "asset_classes");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetRealizedGainLossGroupsRequest toProto() {
        GroupType groupType = (GroupType) this.surrogate.getGroup_type().toProto();
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
        return new GetRealizedGainLossGroupsRequest(groupType, account_number, span, arrayList, sortType, sort_direction != null ? (SortDirection) sort_direction.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[GetRealizedGainLossGroupsRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetRealizedGainLossGroupsRequestDto) && Intrinsics.areEqual(((GetRealizedGainLossGroupsRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetRealizedGainLossGroupsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0083\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B]\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010 R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b2\u0010+\u001a\u0004\b0\u00101R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b6\u0010+\u001a\u0004\b4\u00105R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\b:\u0010+\u001a\u0004\b8\u00109R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010;\u0012\u0004\b>\u0010+\u001a\u0004\b<\u0010=¨\u0006A"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto$Surrogate;", "", "Lwormhole/service/v1/GroupTypeDto;", "group_type", "", "account_number", "Lwormhole/service/v1/SpanDto;", "span", "", "Lwormhole/service/v1/AssetClassDto;", "asset_classes", "Lwormhole/service/v1/SortTypeDto;", "sort_type", "Lwormhole/service/v1/SortDirectionDto;", "sort_direction", "<init>", "(Lwormhole/service/v1/GroupTypeDto;Ljava/lang/String;Lwormhole/service/v1/SpanDto;Ljava/util/List;Lwormhole/service/v1/SortTypeDto;Lwormhole/service/v1/SortDirectionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILwormhole/service/v1/GroupTypeDto;Ljava/lang/String;Lwormhole/service/v1/SpanDto;Ljava/util/List;Lwormhole/service/v1/SortTypeDto;Lwormhole/service/v1/SortDirectionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wormhole_v1_externalRelease", "(Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwormhole/service/v1/GroupTypeDto;", "getGroup_type", "()Lwormhole/service/v1/GroupTypeDto;", "getGroup_type$annotations", "()V", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "Lwormhole/service/v1/SpanDto;", "getSpan", "()Lwormhole/service/v1/SpanDto;", "getSpan$annotations", "Ljava/util/List;", "getAsset_classes", "()Ljava/util/List;", "getAsset_classes$annotations", "Lwormhole/service/v1/SortTypeDto;", "getSort_type", "()Lwormhole/service/v1/SortTypeDto;", "getSort_type$annotations", "Lwormhole/service/v1/SortDirectionDto;", "getSort_direction", "()Lwormhole/service/v1/SortDirectionDto;", "getSort_direction$annotations", "Companion", "$serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_number;
        private final List<AssetClassDto> asset_classes;
        private final GroupTypeDto group_type;
        private final SortDirectionDto sort_direction;
        private final SortTypeDto sort_type;
        private final SpanDto span;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: wormhole.service.v1.GetRealizedGainLossGroupsRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetRealizedGainLossGroupsRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((GroupTypeDto) null, (String) null, (SpanDto) null, (List) null, (SortTypeDto) null, (SortDirectionDto) null, 63, (DefaultConstructorMarker) null);
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
            return this.group_type == surrogate.group_type && Intrinsics.areEqual(this.account_number, surrogate.account_number) && this.span == surrogate.span && Intrinsics.areEqual(this.asset_classes, surrogate.asset_classes) && this.sort_type == surrogate.sort_type && this.sort_direction == surrogate.sort_direction;
        }

        public int hashCode() {
            int iHashCode = ((((((this.group_type.hashCode() * 31) + this.account_number.hashCode()) * 31) + this.span.hashCode()) * 31) + this.asset_classes.hashCode()) * 31;
            SortTypeDto sortTypeDto = this.sort_type;
            int iHashCode2 = (iHashCode + (sortTypeDto == null ? 0 : sortTypeDto.hashCode())) * 31;
            SortDirectionDto sortDirectionDto = this.sort_direction;
            return iHashCode2 + (sortDirectionDto != null ? sortDirectionDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(group_type=" + this.group_type + ", account_number=" + this.account_number + ", span=" + this.span + ", asset_classes=" + this.asset_classes + ", sort_type=" + this.sort_type + ", sort_direction=" + this.sort_direction + ")";
        }

        /* compiled from: GetRealizedGainLossGroupsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto$Surrogate;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetRealizedGainLossGroupsRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, GroupTypeDto groupTypeDto, String str, SpanDto spanDto, List list, SortTypeDto sortTypeDto, SortDirectionDto sortDirectionDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.group_type = (i & 1) == 0 ? GroupTypeDto.INSTANCE.getZeroValue() : groupTypeDto;
            if ((i & 2) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 4) == 0) {
                this.span = SpanDto.INSTANCE.getZeroValue();
            } else {
                this.span = spanDto;
            }
            if ((i & 8) == 0) {
                this.asset_classes = CollectionsKt.emptyList();
            } else {
                this.asset_classes = list;
            }
            if ((i & 16) == 0) {
                this.sort_type = null;
            } else {
                this.sort_type = sortTypeDto;
            }
            if ((i & 32) == 0) {
                this.sort_direction = null;
            } else {
                this.sort_direction = sortDirectionDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$wormhole_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.group_type != GroupTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, GroupTypeDto.Serializer.INSTANCE, self.group_type);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_number);
            }
            if (self.span != SpanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, SpanDto.Serializer.INSTANCE, self.span);
            }
            if (!Intrinsics.areEqual(self.asset_classes, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.asset_classes);
            }
            SortTypeDto sortTypeDto = self.sort_type;
            if (sortTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, SortTypeDto.Serializer.INSTANCE, sortTypeDto);
            }
            SortDirectionDto sortDirectionDto = self.sort_direction;
            if (sortDirectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, SortDirectionDto.Serializer.INSTANCE, sortDirectionDto);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(GroupTypeDto group_type, String account_number, SpanDto span, List<? extends AssetClassDto> asset_classes, SortTypeDto sortTypeDto, SortDirectionDto sortDirectionDto) {
            Intrinsics.checkNotNullParameter(group_type, "group_type");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(span, "span");
            Intrinsics.checkNotNullParameter(asset_classes, "asset_classes");
            this.group_type = group_type;
            this.account_number = account_number;
            this.span = span;
            this.asset_classes = asset_classes;
            this.sort_type = sortTypeDto;
            this.sort_direction = sortDirectionDto;
        }

        public final GroupTypeDto getGroup_type() {
            return this.group_type;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(wormhole.service.p554v1.GroupTypeDto r2, java.lang.String r3, wormhole.service.p554v1.SpanDto r4, java.util.List r5, wormhole.service.p554v1.SortTypeDto r6, wormhole.service.p554v1.SortDirectionDto r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto La
                wormhole.service.v1.GroupTypeDto$Companion r2 = wormhole.service.p554v1.GroupTypeDto.INSTANCE
                wormhole.service.v1.GroupTypeDto r2 = r2.getZeroValue()
            La:
                r9 = r8 & 2
                if (r9 == 0) goto L10
                java.lang.String r3 = ""
            L10:
                r9 = r8 & 4
                if (r9 == 0) goto L1a
                wormhole.service.v1.SpanDto$Companion r4 = wormhole.service.p554v1.SpanDto.INSTANCE
                wormhole.service.v1.SpanDto r4 = r4.getZeroValue()
            L1a:
                r9 = r8 & 8
                if (r9 == 0) goto L22
                java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            L22:
                r9 = r8 & 16
                r0 = 0
                if (r9 == 0) goto L28
                r6 = r0
            L28:
                r8 = r8 & 32
                if (r8 == 0) goto L34
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L3b
            L34:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L3b:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wormhole.service.p554v1.GetRealizedGainLossGroupsRequestDto.Surrogate.<init>(wormhole.service.v1.GroupTypeDto, java.lang.String, wormhole.service.v1.SpanDto, java.util.List, wormhole.service.v1.SortTypeDto, wormhole.service.v1.SortDirectionDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getAccount_number() {
            return this.account_number;
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
    }

    /* compiled from: GetRealizedGainLossGroupsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto;", "Lwormhole/service/v1/GetRealizedGainLossGroupsRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetRealizedGainLossGroupsRequestDto, GetRealizedGainLossGroupsRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetRealizedGainLossGroupsRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetRealizedGainLossGroupsRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetRealizedGainLossGroupsRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetRealizedGainLossGroupsRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetRealizedGainLossGroupsRequest> getProtoAdapter() {
            return GetRealizedGainLossGroupsRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetRealizedGainLossGroupsRequestDto getZeroValue() {
            return GetRealizedGainLossGroupsRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetRealizedGainLossGroupsRequestDto fromProto(GetRealizedGainLossGroupsRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            GroupTypeDto groupTypeDtoFromProto = GroupTypeDto.INSTANCE.fromProto(proto.getGroup_type());
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
            return new GetRealizedGainLossGroupsRequestDto(new Surrogate(groupTypeDtoFromProto, account_number, spanDtoFromProto, arrayList, sortTypeDtoFromProto, sort_direction != null ? SortDirectionDto.INSTANCE.fromProto(sort_direction) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: wormhole.service.v1.GetRealizedGainLossGroupsRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetRealizedGainLossGroupsRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetRealizedGainLossGroupsRequestDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetRealizedGainLossGroupsRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto;", "<init>", "()V", "surrogateSerializer", "Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes28.dex */
    public static final class Serializer implements KSerializer<GetRealizedGainLossGroupsRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/wormhole.service.v1.GetRealizedGainLossGroupsRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetRealizedGainLossGroupsRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetRealizedGainLossGroupsRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetRealizedGainLossGroupsRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetRealizedGainLossGroupsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lwormhole/service/v1/GetRealizedGainLossGroupsRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "wormhole.service.v1.GetRealizedGainLossGroupsRequestDto";
        }
    }
}
