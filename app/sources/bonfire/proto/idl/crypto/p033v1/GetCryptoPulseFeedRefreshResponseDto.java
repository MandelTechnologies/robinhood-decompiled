package bonfire.proto.idl.crypto.p033v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.copilot.p032v1.InstrumentDigestDetail;
import bonfire.proto.idl.copilot.p032v1.InstrumentDigestDetailDto;
import bonfire.proto.idl.copilot.p032v1.InstrumentDigestPreview;
import bonfire.proto.idl.copilot.p032v1.InstrumentDigestPreviewDto;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedRefreshResponse;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulseFeedRefreshResponseDto;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.models.api.ErrorResponse;
import com.squareup.wire.ProtoAdapter;
import java.lang.annotation.Annotation;
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
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rh_server_driven_ui.p531v1.Button;
import rh_server_driven_ui.p531v1.ButtonDto;

/* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\u001e\u001f !\"B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0016\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006#"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse;", "Landroid/os/Parcelable;", "surrogate", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$Surrogate;", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$Surrogate;)V", "feed_items", "", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto;", "(Ljava/util/List;)V", "getFeed_items", "()Ljava/util/List;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "FeedItemDto", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class GetCryptoPulseFeedRefreshResponseDto implements Dto3<GetCryptoPulseFeedRefreshResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetCryptoPulseFeedRefreshResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetCryptoPulseFeedRefreshResponseDto, GetCryptoPulseFeedRefreshResponse>> binaryBase64Serializer$delegate;
    private static final GetCryptoPulseFeedRefreshResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetCryptoPulseFeedRefreshResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetCryptoPulseFeedRefreshResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<FeedItemDto> getFeed_items() {
        return this.surrogate.getFeed_items();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCryptoPulseFeedRefreshResponseDto(List<FeedItemDto> feed_items) {
        this(new Surrogate(feed_items));
        Intrinsics.checkNotNullParameter(feed_items, "feed_items");
    }

    public /* synthetic */ GetCryptoPulseFeedRefreshResponseDto(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<FeedItemDto>) ((i & 1) != 0 ? CollectionsKt.emptyList() : list));
    }

    public final GetCryptoPulseFeedRefreshResponseDto copy(List<FeedItemDto> feed_items) {
        Intrinsics.checkNotNullParameter(feed_items, "feed_items");
        return new GetCryptoPulseFeedRefreshResponseDto(new Surrogate(feed_items));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetCryptoPulseFeedRefreshResponse toProto() {
        List<FeedItemDto> feed_items = this.surrogate.getFeed_items();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(feed_items, 10));
        Iterator<T> it = feed_items.iterator();
        while (it.hasNext()) {
            arrayList.add(((FeedItemDto) it.next()).toProto());
        }
        return new GetCryptoPulseFeedRefreshResponse(arrayList, null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[GetCryptoPulseFeedRefreshResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetCryptoPulseFeedRefreshResponseDto) && Intrinsics.areEqual(((GetCryptoPulseFeedRefreshResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$Surrogate;", "", "", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto;", "feed_items", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFeed_items", "()Ljava/util/List;", "getFeed_items$annotations", "()V", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<FeedItemDto> feed_items;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCryptoPulseFeedRefreshResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(FeedItemDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && Intrinsics.areEqual(this.feed_items, ((Surrogate) other).feed_items);
        }

        public int hashCode() {
            return this.feed_items.hashCode();
        }

        public String toString() {
            return "Surrogate(feed_items=" + this.feed_items + ")";
        }

        /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetCryptoPulseFeedRefreshResponseDto6.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.feed_items = CollectionsKt.emptyList();
            } else {
                this.feed_items = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (Intrinsics.areEqual(self.feed_items, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.feed_items);
        }

        public Surrogate(List<FeedItemDto> feed_items) {
            Intrinsics.checkNotNullParameter(feed_items, "feed_items");
            this.feed_items = feed_items;
        }

        public final List<FeedItemDto> getFeed_items() {
            return this.feed_items;
        }

        public /* synthetic */ Surrogate(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetCryptoPulseFeedRefreshResponseDto, GetCryptoPulseFeedRefreshResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetCryptoPulseFeedRefreshResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCryptoPulseFeedRefreshResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCryptoPulseFeedRefreshResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetCryptoPulseFeedRefreshResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetCryptoPulseFeedRefreshResponse> getProtoAdapter() {
            return GetCryptoPulseFeedRefreshResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCryptoPulseFeedRefreshResponseDto getZeroValue() {
            return GetCryptoPulseFeedRefreshResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCryptoPulseFeedRefreshResponseDto fromProto(GetCryptoPulseFeedRefreshResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<GetCryptoPulseFeedRefreshResponse.FeedItem> feed_items = proto.getFeed_items();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(feed_items, 10));
            Iterator<T> it = feed_items.iterator();
            while (it.hasNext()) {
                arrayList.add(FeedItemDto.INSTANCE.fromProto((GetCryptoPulseFeedRefreshResponse.FeedItem) it.next()));
            }
            return new GetCryptoPulseFeedRefreshResponseDto(new Surrogate(arrayList), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCryptoPulseFeedRefreshResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetCryptoPulseFeedRefreshResponseDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00072345678B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B_\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0015J\\\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u0011J\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\tH\u0016J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020+H\u0016J\b\u00101\u001a\u00020+H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u0017R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001f¨\u00069"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem;", "Landroid/os/Parcelable;", "surrogate", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$Surrogate;", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$Surrogate;)V", "currency_pair_id", "", "header", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto;", "trade_button_content", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto;", "digest", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto;", "price_movement_ratio", "Lcom/robinhood/idl/IdlDecimal;", "asset_currency_code", "formatted_quote", "quantity", "(Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;)V", "getCurrency_pair_id", "()Ljava/lang/String;", "getHeader", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto;", "getTrade_button_content", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto;", "getDigest", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto;", "getPrice_movement_ratio", "()Lcom/robinhood/idl/IdlDecimal;", "getAsset_currency_code", "getFormatted_quote", "getQuantity", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "HeaderDto", "TradeButtonContentDto", "DigestDto", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class FeedItemDto implements Dto3<GetCryptoPulseFeedRefreshResponse.FeedItem>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<FeedItemDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<FeedItemDto, GetCryptoPulseFeedRefreshResponse.FeedItem>> binaryBase64Serializer$delegate;
        private static final FeedItemDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ FeedItemDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private FeedItemDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getCurrency_pair_id() {
            return this.surrogate.getCurrency_pair_id();
        }

        public final HeaderDto getHeader() {
            return this.surrogate.getHeader();
        }

        public final TradeButtonContentDto getTrade_button_content() {
            return this.surrogate.getTrade_button_content();
        }

        public final DigestDto getDigest() {
            return this.surrogate.getDigest();
        }

        public final IdlDecimal getPrice_movement_ratio() {
            return this.surrogate.getPrice_movement_ratio();
        }

        public final String getAsset_currency_code() {
            return this.surrogate.getAsset_currency_code();
        }

        public final String getFormatted_quote() {
            return this.surrogate.getFormatted_quote();
        }

        public final IdlDecimal getQuantity() {
            return this.surrogate.getQuantity();
        }

        public /* synthetic */ FeedItemDto(String str, HeaderDto headerDto, TradeButtonContentDto tradeButtonContentDto, DigestDto digestDto, IdlDecimal idlDecimal, String str2, String str3, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : headerDto, (i & 4) != 0 ? null : tradeButtonContentDto, (i & 8) != 0 ? null : digestDto, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? new IdlDecimal("") : idlDecimal2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public FeedItemDto(String currency_pair_id, HeaderDto headerDto, TradeButtonContentDto tradeButtonContentDto, DigestDto digestDto, IdlDecimal price_movement_ratio, String asset_currency_code, String formatted_quote, IdlDecimal quantity) {
            this(new Surrogate(currency_pair_id, headerDto, tradeButtonContentDto, digestDto, price_movement_ratio, asset_currency_code, formatted_quote, quantity));
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            Intrinsics.checkNotNullParameter(price_movement_ratio, "price_movement_ratio");
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(formatted_quote, "formatted_quote");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
        }

        public static /* synthetic */ FeedItemDto copy$default(FeedItemDto feedItemDto, String str, HeaderDto headerDto, TradeButtonContentDto tradeButtonContentDto, DigestDto digestDto, IdlDecimal idlDecimal, String str2, String str3, IdlDecimal idlDecimal2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feedItemDto.surrogate.getCurrency_pair_id();
            }
            if ((i & 2) != 0) {
                headerDto = feedItemDto.surrogate.getHeader();
            }
            if ((i & 4) != 0) {
                tradeButtonContentDto = feedItemDto.surrogate.getTrade_button_content();
            }
            if ((i & 8) != 0) {
                digestDto = feedItemDto.surrogate.getDigest();
            }
            if ((i & 16) != 0) {
                idlDecimal = feedItemDto.surrogate.getPrice_movement_ratio();
            }
            if ((i & 32) != 0) {
                str2 = feedItemDto.surrogate.getAsset_currency_code();
            }
            if ((i & 64) != 0) {
                str3 = feedItemDto.surrogate.getFormatted_quote();
            }
            if ((i & 128) != 0) {
                idlDecimal2 = feedItemDto.surrogate.getQuantity();
            }
            String str4 = str3;
            IdlDecimal idlDecimal3 = idlDecimal2;
            IdlDecimal idlDecimal4 = idlDecimal;
            String str5 = str2;
            return feedItemDto.copy(str, headerDto, tradeButtonContentDto, digestDto, idlDecimal4, str5, str4, idlDecimal3);
        }

        public final FeedItemDto copy(String currency_pair_id, HeaderDto header, TradeButtonContentDto trade_button_content, DigestDto digest, IdlDecimal price_movement_ratio, String asset_currency_code, String formatted_quote, IdlDecimal quantity) {
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            Intrinsics.checkNotNullParameter(price_movement_ratio, "price_movement_ratio");
            Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
            Intrinsics.checkNotNullParameter(formatted_quote, "formatted_quote");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            return new FeedItemDto(new Surrogate(currency_pair_id, header, trade_button_content, digest, price_movement_ratio, asset_currency_code, formatted_quote, quantity));
        }

        @Override // com.robinhood.idl.Dto
        public GetCryptoPulseFeedRefreshResponse.FeedItem toProto() {
            String currency_pair_id = this.surrogate.getCurrency_pair_id();
            HeaderDto header = this.surrogate.getHeader();
            GetCryptoPulseFeedRefreshResponse.FeedItem.Header proto = header != null ? header.toProto() : null;
            TradeButtonContentDto trade_button_content = this.surrogate.getTrade_button_content();
            GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent proto2 = trade_button_content != null ? trade_button_content.toProto() : null;
            DigestDto digest = this.surrogate.getDigest();
            return new GetCryptoPulseFeedRefreshResponse.FeedItem(currency_pair_id, proto, proto2, digest != null ? digest.toProto() : null, this.surrogate.getPrice_movement_ratio().getStringValue(), this.surrogate.getAsset_currency_code(), this.surrogate.getFormatted_quote(), this.surrogate.getQuantity().getStringValue(), null, 256, null);
        }

        public String toString() {
            return "[FeedItemDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof FeedItemDto) && Intrinsics.areEqual(((FeedItemDto) other).surrogate, this.surrogate);
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
        /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002EDB{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\u0004\b\u0012\u0010\u0013Bk\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b5\u0010-\u001a\u0004\b3\u00104R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b9\u0010-\u001a\u0004\b7\u00108R/\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010:\u0012\u0004\b=\u0010-\u001a\u0004\b;\u0010<R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010*\u0012\u0004\b?\u0010-\u001a\u0004\b>\u0010#R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010*\u0012\u0004\bA\u0010-\u001a\u0004\b@\u0010#R/\u0010\u0011\u001a\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010:\u0012\u0004\bC\u0010-\u001a\u0004\bB\u0010<¨\u0006F"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$Surrogate;", "", "", "currency_pair_id", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto;", "header", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto;", "trade_button_content", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto;", "digest", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "price_movement_ratio", "asset_currency_code", "formatted_quote", "quantity", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrency_pair_id", "getCurrency_pair_id$annotations", "()V", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto;", "getHeader", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto;", "getHeader$annotations", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto;", "getTrade_button_content", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto;", "getTrade_button_content$annotations", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto;", "getDigest", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto;", "getDigest$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getPrice_movement_ratio", "()Lcom/robinhood/idl/IdlDecimal;", "getPrice_movement_ratio$annotations", "getAsset_currency_code", "getAsset_currency_code$annotations", "getFormatted_quote", "getFormatted_quote$annotations", "getQuantity", "getQuantity$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        public static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String asset_currency_code;
            private final String currency_pair_id;
            private final DigestDto digest;
            private final String formatted_quote;
            private final HeaderDto header;
            private final IdlDecimal price_movement_ratio;
            private final IdlDecimal quantity;
            private final TradeButtonContentDto trade_button_content;

            public Surrogate() {
                this((String) null, (HeaderDto) null, (TradeButtonContentDto) null, (DigestDto) null, (IdlDecimal) null, (String) null, (String) null, (IdlDecimal) null, 255, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.currency_pair_id, surrogate.currency_pair_id) && Intrinsics.areEqual(this.header, surrogate.header) && Intrinsics.areEqual(this.trade_button_content, surrogate.trade_button_content) && Intrinsics.areEqual(this.digest, surrogate.digest) && Intrinsics.areEqual(this.price_movement_ratio, surrogate.price_movement_ratio) && Intrinsics.areEqual(this.asset_currency_code, surrogate.asset_currency_code) && Intrinsics.areEqual(this.formatted_quote, surrogate.formatted_quote) && Intrinsics.areEqual(this.quantity, surrogate.quantity);
            }

            public int hashCode() {
                int iHashCode = this.currency_pair_id.hashCode() * 31;
                HeaderDto headerDto = this.header;
                int iHashCode2 = (iHashCode + (headerDto == null ? 0 : headerDto.hashCode())) * 31;
                TradeButtonContentDto tradeButtonContentDto = this.trade_button_content;
                int iHashCode3 = (iHashCode2 + (tradeButtonContentDto == null ? 0 : tradeButtonContentDto.hashCode())) * 31;
                DigestDto digestDto = this.digest;
                return ((((((((iHashCode3 + (digestDto != null ? digestDto.hashCode() : 0)) * 31) + this.price_movement_ratio.hashCode()) * 31) + this.asset_currency_code.hashCode()) * 31) + this.formatted_quote.hashCode()) * 31) + this.quantity.hashCode();
            }

            public String toString() {
                return "Surrogate(currency_pair_id=" + this.currency_pair_id + ", header=" + this.header + ", trade_button_content=" + this.trade_button_content + ", digest=" + this.digest + ", price_movement_ratio=" + this.price_movement_ratio + ", asset_currency_code=" + this.asset_currency_code + ", formatted_quote=" + this.formatted_quote + ", quantity=" + this.quantity + ")";
            }

            /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return GetCryptoPulseFeedRefreshResponseDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, HeaderDto headerDto, TradeButtonContentDto tradeButtonContentDto, DigestDto digestDto, IdlDecimal idlDecimal, String str2, String str3, IdlDecimal idlDecimal2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.currency_pair_id = "";
                } else {
                    this.currency_pair_id = str;
                }
                if ((i & 2) == 0) {
                    this.header = null;
                } else {
                    this.header = headerDto;
                }
                if ((i & 4) == 0) {
                    this.trade_button_content = null;
                } else {
                    this.trade_button_content = tradeButtonContentDto;
                }
                if ((i & 8) == 0) {
                    this.digest = null;
                } else {
                    this.digest = digestDto;
                }
                if ((i & 16) == 0) {
                    this.price_movement_ratio = new IdlDecimal("");
                } else {
                    this.price_movement_ratio = idlDecimal;
                }
                if ((i & 32) == 0) {
                    this.asset_currency_code = "";
                } else {
                    this.asset_currency_code = str2;
                }
                if ((i & 64) == 0) {
                    this.formatted_quote = "";
                } else {
                    this.formatted_quote = str3;
                }
                if ((i & 128) == 0) {
                    this.quantity = new IdlDecimal("");
                } else {
                    this.quantity = idlDecimal2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.currency_pair_id, "")) {
                    output.encodeStringElement(serialDesc, 0, self.currency_pair_id);
                }
                HeaderDto headerDto = self.header;
                if (headerDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, HeaderDto.Serializer.INSTANCE, headerDto);
                }
                TradeButtonContentDto tradeButtonContentDto = self.trade_button_content;
                if (tradeButtonContentDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, TradeButtonContentDto.Serializer.INSTANCE, tradeButtonContentDto);
                }
                DigestDto digestDto = self.digest;
                if (digestDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 3, DigestDto.Serializer.INSTANCE, digestDto);
                }
                if (!Intrinsics.areEqual(self.price_movement_ratio, new IdlDecimal(""))) {
                    output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.price_movement_ratio);
                }
                if (!Intrinsics.areEqual(self.asset_currency_code, "")) {
                    output.encodeStringElement(serialDesc, 5, self.asset_currency_code);
                }
                if (!Intrinsics.areEqual(self.formatted_quote, "")) {
                    output.encodeStringElement(serialDesc, 6, self.formatted_quote);
                }
                if (Intrinsics.areEqual(self.quantity, new IdlDecimal(""))) {
                    return;
                }
                output.encodeSerializableElement(serialDesc, 7, IdlDecimalSerializer.INSTANCE, self.quantity);
            }

            public Surrogate(String currency_pair_id, HeaderDto headerDto, TradeButtonContentDto tradeButtonContentDto, DigestDto digestDto, IdlDecimal price_movement_ratio, String asset_currency_code, String formatted_quote, IdlDecimal quantity) {
                Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
                Intrinsics.checkNotNullParameter(price_movement_ratio, "price_movement_ratio");
                Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
                Intrinsics.checkNotNullParameter(formatted_quote, "formatted_quote");
                Intrinsics.checkNotNullParameter(quantity, "quantity");
                this.currency_pair_id = currency_pair_id;
                this.header = headerDto;
                this.trade_button_content = tradeButtonContentDto;
                this.digest = digestDto;
                this.price_movement_ratio = price_movement_ratio;
                this.asset_currency_code = asset_currency_code;
                this.formatted_quote = formatted_quote;
                this.quantity = quantity;
            }

            public /* synthetic */ Surrogate(String str, HeaderDto headerDto, TradeButtonContentDto tradeButtonContentDto, DigestDto digestDto, IdlDecimal idlDecimal, String str2, String str3, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : headerDto, (i & 4) != 0 ? null : tradeButtonContentDto, (i & 8) != 0 ? null : digestDto, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? new IdlDecimal("") : idlDecimal2);
            }

            public final String getCurrency_pair_id() {
                return this.currency_pair_id;
            }

            public final HeaderDto getHeader() {
                return this.header;
            }

            public final TradeButtonContentDto getTrade_button_content() {
                return this.trade_button_content;
            }

            public final DigestDto getDigest() {
                return this.digest;
            }

            public final IdlDecimal getPrice_movement_ratio() {
                return this.price_movement_ratio;
            }

            public final String getAsset_currency_code() {
                return this.asset_currency_code;
            }

            public final String getFormatted_quote() {
                return this.formatted_quote;
            }

            public final IdlDecimal getQuantity() {
                return this.quantity;
            }
        }

        /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<FeedItemDto, GetCryptoPulseFeedRefreshResponse.FeedItem> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<FeedItemDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FeedItemDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FeedItemDto> getBinaryBase64Serializer() {
                return (KSerializer) FeedItemDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetCryptoPulseFeedRefreshResponse.FeedItem> getProtoAdapter() {
                return GetCryptoPulseFeedRefreshResponse.FeedItem.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FeedItemDto getZeroValue() {
                return FeedItemDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FeedItemDto fromProto(GetCryptoPulseFeedRefreshResponse.FeedItem proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                String currency_pair_id = proto.getCurrency_pair_id();
                GetCryptoPulseFeedRefreshResponse.FeedItem.Header header = proto.getHeader();
                DefaultConstructorMarker defaultConstructorMarker = null;
                HeaderDto headerDtoFromProto = header != null ? HeaderDto.INSTANCE.fromProto(header) : null;
                GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent trade_button_content = proto.getTrade_button_content();
                TradeButtonContentDto tradeButtonContentDtoFromProto = trade_button_content != null ? TradeButtonContentDto.INSTANCE.fromProto(trade_button_content) : null;
                GetCryptoPulseFeedRefreshResponse.FeedItem.Digest digest = proto.getDigest();
                return new FeedItemDto(new Surrogate(currency_pair_id, headerDtoFromProto, tradeButtonContentDtoFromProto, digest != null ? DigestDto.INSTANCE.fromProto(digest) : null, new IdlDecimal(proto.getPrice_movement_ratio()), proto.getAsset_currency_code(), proto.getFormatted_quote(), new IdlDecimal(proto.getQuantity())), defaultConstructorMarker);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new FeedItemDto(null, null, null, null, null, null, null, null, 255, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007#\"$%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006)"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$Surrogate;)V", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$TypeDto;", "type", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$TypeDto;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$Surrogate;", "getType", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$TypeDto;", "Companion", "Surrogate", "TypeDto", "CondensedDto", "PositionDetailsDto", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class HeaderDto implements Dto3<GetCryptoPulseFeedRefreshResponse.FeedItem.Header>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<HeaderDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<HeaderDto, GetCryptoPulseFeedRefreshResponse.FeedItem.Header>> binaryBase64Serializer$delegate;
            private static final HeaderDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ HeaderDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private HeaderDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final TypeDto getType() {
                if (this.surrogate.getPosition_details() != null) {
                    return new TypeDto.PositionDetails(this.surrogate.getPosition_details());
                }
                if (this.surrogate.getCondensed() != null) {
                    return new TypeDto.Condensed(this.surrogate.getCondensed());
                }
                return null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public HeaderDto(TypeDto typeDto) {
                TypeDto.PositionDetails positionDetails = typeDto instanceof TypeDto.PositionDetails ? (TypeDto.PositionDetails) typeDto : null;
                PositionDetailsDto value = positionDetails != null ? positionDetails.getValue() : null;
                TypeDto.Condensed condensed = typeDto instanceof TypeDto.Condensed ? (TypeDto.Condensed) typeDto : null;
                this(new Surrogate(value, condensed != null ? condensed.getValue() : null));
            }

            public /* synthetic */ HeaderDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : typeDto);
            }

            @Override // com.robinhood.idl.Dto
            public GetCryptoPulseFeedRefreshResponse.FeedItem.Header toProto() {
                PositionDetailsDto position_details = this.surrogate.getPosition_details();
                GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails proto = position_details != null ? position_details.toProto() : null;
                CondensedDto condensed = this.surrogate.getCondensed();
                return new GetCryptoPulseFeedRefreshResponse.FeedItem.Header(proto, condensed != null ? condensed.toProto() : null, null, 4, null);
            }

            public String toString() {
                return "[HeaderDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof HeaderDto) && Intrinsics.areEqual(((HeaderDto) other).surrogate, this.surrogate);
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
            /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$Surrogate;", "", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto;", "position_details", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto;", "condensed", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto;Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto;", "getPosition_details", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto;", "getPosition_details$annotations", "()V", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto;", "getCondensed", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto;", "getCondensed$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final CondensedDto condensed;
                private final PositionDetailsDto position_details;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((PositionDetailsDto) null, (CondensedDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.position_details, surrogate.position_details) && Intrinsics.areEqual(this.condensed, surrogate.condensed);
                }

                public int hashCode() {
                    PositionDetailsDto positionDetailsDto = this.position_details;
                    int iHashCode = (positionDetailsDto == null ? 0 : positionDetailsDto.hashCode()) * 31;
                    CondensedDto condensedDto = this.condensed;
                    return iHashCode + (condensedDto != null ? condensedDto.hashCode() : 0);
                }

                public String toString() {
                    return "Surrogate(position_details=" + this.position_details + ", condensed=" + this.condensed + ")";
                }

                /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return GetCryptoPulseFeedRefreshResponseDto3.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, PositionDetailsDto positionDetailsDto, CondensedDto condensedDto, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.position_details = null;
                    } else {
                        this.position_details = positionDetailsDto;
                    }
                    if ((i & 2) == 0) {
                        this.condensed = null;
                    } else {
                        this.condensed = condensedDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    PositionDetailsDto positionDetailsDto = self.position_details;
                    if (positionDetailsDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, PositionDetailsDto.Serializer.INSTANCE, positionDetailsDto);
                    }
                    CondensedDto condensedDto = self.condensed;
                    if (condensedDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, CondensedDto.Serializer.INSTANCE, condensedDto);
                    }
                }

                public Surrogate(PositionDetailsDto positionDetailsDto, CondensedDto condensedDto) {
                    this.position_details = positionDetailsDto;
                    this.condensed = condensedDto;
                }

                public /* synthetic */ Surrogate(PositionDetailsDto positionDetailsDto, CondensedDto condensedDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : positionDetailsDto, (i & 2) != 0 ? null : condensedDto);
                }

                public final PositionDetailsDto getPosition_details() {
                    return this.position_details;
                }

                public final CondensedDto getCondensed() {
                    return this.condensed;
                }
            }

            /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<HeaderDto, GetCryptoPulseFeedRefreshResponse.FeedItem.Header> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<HeaderDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<HeaderDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<HeaderDto> getBinaryBase64Serializer() {
                    return (KSerializer) HeaderDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<GetCryptoPulseFeedRefreshResponse.FeedItem.Header> getProtoAdapter() {
                    return GetCryptoPulseFeedRefreshResponse.FeedItem.Header.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public HeaderDto getZeroValue() {
                    return HeaderDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public HeaderDto fromProto(GetCryptoPulseFeedRefreshResponse.FeedItem.Header proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails position_details = proto.getPosition_details();
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    PositionDetailsDto positionDetailsDtoFromProto = position_details != null ? PositionDetailsDto.INSTANCE.fromProto(position_details) : null;
                    GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed condensed = proto.getCondensed();
                    return new HeaderDto(new Surrogate(positionDetailsDtoFromProto, condensed != null ? CondensedDto.INSTANCE.fromProto(condensed) : null), defaultConstructorMarker);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.HeaderDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new HeaderDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "PositionDetails", "Condensed", "Companion", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$TypeDto$Condensed;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$TypeDto$PositionDetails;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @RhGenerated
            public static abstract class TypeDto implements Dto4 {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                public /* synthetic */ TypeDto(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private TypeDto() {
                }

                @Override // com.robinhood.idl.Dto
                public Void toProto() {
                    return Dto4.DefaultImpls.toProto(this);
                }

                /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$TypeDto$PositionDetails;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$TypeDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto;", "value", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto;", "getValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final /* data */ class PositionDetails extends TypeDto {
                    private final PositionDetailsDto value;

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof PositionDetails) && Intrinsics.areEqual(this.value, ((PositionDetails) other).value);
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "PositionDetails(value=" + this.value + ")";
                    }

                    public final PositionDetailsDto getValue() {
                        return this.value;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public PositionDetails(PositionDetailsDto value) {
                        super(null);
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.value = value;
                    }
                }

                /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$TypeDto$Condensed;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$TypeDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto;", "value", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto;", "getValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final /* data */ class Condensed extends TypeDto {
                    private final CondensedDto value;

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Condensed) && Intrinsics.areEqual(this.value, ((Condensed) other).value);
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "Condensed(value=" + this.value + ")";
                    }

                    public final CondensedDto getValue() {
                        return this.value;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Condensed(CondensedDto value) {
                        super(null);
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.value = value;
                    }
                }

                /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$TypeDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto4.Creator<TypeDto, GetCryptoPulseFeedRefreshResponse.FeedItem.Header> {
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
                    public ProtoAdapter<GetCryptoPulseFeedRefreshResponse.FeedItem.Header> getProtoAdapter() {
                        return GetCryptoPulseFeedRefreshResponse.FeedItem.Header.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public TypeDto fromProto(GetCryptoPulseFeedRefreshResponse.FeedItem.Header proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        if (proto.getPosition_details() != null) {
                            return new PositionDetails(PositionDetailsDto.INSTANCE.fromProto(proto.getPosition_details()));
                        }
                        if (proto.getCondensed() != null) {
                            return new Condensed(CondensedDto.INSTANCE.fromProto(proto.getCondensed()));
                        }
                        return null;
                    }
                }
            }

            /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header$Condensed;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto$Surrogate;)V", "()V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header$Condensed;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class CondensedDto implements Dto3<GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<CondensedDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<CondensedDto, GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed>> binaryBase64Serializer$delegate;
                private static final CondensedDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ CondensedDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private CondensedDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public CondensedDto() {
                    this(Surrogate.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.robinhood.idl.Dto
                public GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed toProto() {
                    return new GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed(null, 1, 0 == true ? 1 : 0);
                }

                public String toString() {
                    return "[CondensedDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof CondensedDto) && Intrinsics.areEqual(((CondensedDto) other).surrogate, this.surrogate);
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
                /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {
                    public static final Surrogate INSTANCE = new Surrogate();
                    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto$Surrogate$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.HeaderDto.CondensedDto.Surrogate._init_$_anonymous_();
                        }
                    });

                    public boolean equals(Object other) {
                        return this == other || (other instanceof Surrogate);
                    }

                    public int hashCode() {
                        return 562159913;
                    }

                    public String toString() {
                        return "Surrogate";
                    }

                    private Surrogate() {
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                        return new ObjectSerializer("bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.HeaderDto.CondensedDto.Surrogate", INSTANCE, new Annotation[0]);
                    }

                    private final /* synthetic */ KSerializer get$cachedSerializer() {
                        return $cachedSerializer$delegate.getValue();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return get$cachedSerializer();
                    }
                }

                /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header$Condensed;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto3.Creator<CondensedDto, GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<CondensedDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<CondensedDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<CondensedDto> getBinaryBase64Serializer() {
                        return (KSerializer) CondensedDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed> getProtoAdapter() {
                        return GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public CondensedDto getZeroValue() {
                        return CondensedDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public CondensedDto fromProto(GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        return new CondensedDto();
                    }
                }

                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.HeaderDto.CondensedDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new CondensedDto();
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<CondensedDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse.FeedItem.Header.Condensed", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, CondensedDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public CondensedDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new CondensedDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4190_6)
                    public final String provideIntoMap() {
                        return "bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$CondensedDto";
                    }
                }
            }

            /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header$PositionDetails;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto$Surrogate;)V", "()V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header$PositionDetails;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class PositionDetailsDto implements Dto3<GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<PositionDetailsDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<PositionDetailsDto, GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails>> binaryBase64Serializer$delegate;
                private static final PositionDetailsDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ PositionDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private PositionDetailsDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public PositionDetailsDto() {
                    this(Surrogate.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.robinhood.idl.Dto
                public GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails toProto() {
                    return new GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails(null, 1, 0 == true ? 1 : 0);
                }

                public String toString() {
                    return "[PositionDetailsDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof PositionDetailsDto) && Intrinsics.areEqual(((PositionDetailsDto) other).surrogate, this.surrogate);
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
                /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {
                    public static final Surrogate INSTANCE = new Surrogate();
                    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto$Surrogate$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.HeaderDto.PositionDetailsDto.Surrogate._init_$_anonymous_();
                        }
                    });

                    public boolean equals(Object other) {
                        return this == other || (other instanceof Surrogate);
                    }

                    public int hashCode() {
                        return 1238618487;
                    }

                    public String toString() {
                        return "Surrogate";
                    }

                    private Surrogate() {
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                        return new ObjectSerializer("bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.HeaderDto.PositionDetailsDto.Surrogate", INSTANCE, new Annotation[0]);
                    }

                    private final /* synthetic */ KSerializer get$cachedSerializer() {
                        return $cachedSerializer$delegate.getValue();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return get$cachedSerializer();
                    }
                }

                /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Header$PositionDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto3.Creator<PositionDetailsDto, GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<PositionDetailsDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<PositionDetailsDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<PositionDetailsDto> getBinaryBase64Serializer() {
                        return (KSerializer) PositionDetailsDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails> getProtoAdapter() {
                        return GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public PositionDetailsDto getZeroValue() {
                        return PositionDetailsDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public PositionDetailsDto fromProto(GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        return new PositionDetailsDto();
                    }
                }

                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.HeaderDto.PositionDetailsDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new PositionDetailsDto();
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<PositionDetailsDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse.FeedItem.Header.PositionDetails", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, PositionDetailsDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public PositionDetailsDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new PositionDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4186_2)
                    public final String provideIntoMap() {
                        return "bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$PositionDetailsDto";
                    }
                }
            }

            /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<HeaderDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse.FeedItem.Header", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, HeaderDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public HeaderDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new HeaderDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4184_0)
                public final String provideIntoMap() {
                    return "bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$HeaderDto";
                }
            }
        }

        /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
        @Serializable(with = Serializer.class)
        @RhGenerated
        @SourceDebugExtension
        @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004(')*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010$R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006+"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$TradeButtonContent;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto$Surrogate;)V", "", "expand_button_text", "", "is_expand_button_enabled", "", "Lrh_server_driven_ui/v1/ButtonDto;", "trade_buttons", "(Ljava/lang/String;ZLjava/util/List;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$TradeButtonContent;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto$Surrogate;", "getExpand_button_text", "()Z", "getTrade_buttons", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class TradeButtonContentDto implements Dto3<GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<TradeButtonContentDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<TradeButtonContentDto, GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent>> binaryBase64Serializer$delegate;
            private static final TradeButtonContentDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ TradeButtonContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private TradeButtonContentDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final String getExpand_button_text() {
                return this.surrogate.getExpand_button_text();
            }

            public final boolean is_expand_button_enabled() {
                return this.surrogate.getIs_expand_button_enabled();
            }

            public final List<ButtonDto> getTrade_buttons() {
                return this.surrogate.getTrade_buttons();
            }

            public /* synthetic */ TradeButtonContentDto(String str, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public TradeButtonContentDto(String expand_button_text, boolean z, List<ButtonDto> trade_buttons) {
                this(new Surrogate(expand_button_text, z, trade_buttons));
                Intrinsics.checkNotNullParameter(expand_button_text, "expand_button_text");
                Intrinsics.checkNotNullParameter(trade_buttons, "trade_buttons");
            }

            @Override // com.robinhood.idl.Dto
            public GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent toProto() {
                String expand_button_text = this.surrogate.getExpand_button_text();
                boolean is_expand_button_enabled = this.surrogate.getIs_expand_button_enabled();
                List<ButtonDto> trade_buttons = this.surrogate.getTrade_buttons();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(trade_buttons, 10));
                Iterator<T> it = trade_buttons.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ButtonDto) it.next()).toProto());
                }
                return new GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent(expand_button_text, is_expand_button_enabled, arrayList, null, 8, null);
            }

            public String toString() {
                return "[TradeButtonContentDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof TradeButtonContentDto) && Intrinsics.areEqual(((TradeButtonContentDto) other).surrogate, this.surrogate);
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
            /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002,+B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b&\u0010#\u001a\u0004\b\u0005\u0010%R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010'\u0012\u0004\b*\u0010#\u001a\u0004\b(\u0010)¨\u0006-"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto$Surrogate;", "", "", "expand_button_text", "", "is_expand_button_enabled", "", "Lrh_server_driven_ui/v1/ButtonDto;", "trade_buttons", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExpand_button_text", "getExpand_button_text$annotations", "()V", "Z", "()Z", "is_expand_button_enabled$annotations", "Ljava/util/List;", "getTrade_buttons", "()Ljava/util/List;", "getTrade_buttons$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {
                private final String expand_button_text;
                private final boolean is_expand_button_enabled;
                private final List<ButtonDto> trade_buttons;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                @JvmField
                private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto$Surrogate$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.TradeButtonContentDto.Surrogate._childSerializers$_anonymous_();
                    }
                })};

                public Surrogate() {
                    this((String) null, false, (List) null, 7, (DefaultConstructorMarker) null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                    return new ArrayListSerializer(ButtonDto.Serializer.INSTANCE);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.expand_button_text, surrogate.expand_button_text) && this.is_expand_button_enabled == surrogate.is_expand_button_enabled && Intrinsics.areEqual(this.trade_buttons, surrogate.trade_buttons);
                }

                public int hashCode() {
                    return (((this.expand_button_text.hashCode() * 31) + Boolean.hashCode(this.is_expand_button_enabled)) * 31) + this.trade_buttons.hashCode();
                }

                public String toString() {
                    return "Surrogate(expand_button_text=" + this.expand_button_text + ", is_expand_button_enabled=" + this.is_expand_button_enabled + ", trade_buttons=" + this.trade_buttons + ")";
                }

                /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return GetCryptoPulseFeedRefreshResponseDto5.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, String str, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
                    this.expand_button_text = (i & 1) == 0 ? "" : str;
                    if ((i & 2) == 0) {
                        this.is_expand_button_enabled = false;
                    } else {
                        this.is_expand_button_enabled = z;
                    }
                    if ((i & 4) == 0) {
                        this.trade_buttons = CollectionsKt.emptyList();
                    } else {
                        this.trade_buttons = list;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                    if (!Intrinsics.areEqual(self.expand_button_text, "")) {
                        output.encodeStringElement(serialDesc, 0, self.expand_button_text);
                    }
                    boolean z = self.is_expand_button_enabled;
                    if (z) {
                        output.encodeBooleanElement(serialDesc, 1, z);
                    }
                    if (Intrinsics.areEqual(self.trade_buttons, CollectionsKt.emptyList())) {
                        return;
                    }
                    output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.trade_buttons);
                }

                public Surrogate(String expand_button_text, boolean z, List<ButtonDto> trade_buttons) {
                    Intrinsics.checkNotNullParameter(expand_button_text, "expand_button_text");
                    Intrinsics.checkNotNullParameter(trade_buttons, "trade_buttons");
                    this.expand_button_text = expand_button_text;
                    this.is_expand_button_enabled = z;
                    this.trade_buttons = trade_buttons;
                }

                public final String getExpand_button_text() {
                    return this.expand_button_text;
                }

                public /* synthetic */ Surrogate(String str, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
                }

                /* renamed from: is_expand_button_enabled, reason: from getter */
                public final boolean getIs_expand_button_enabled() {
                    return this.is_expand_button_enabled;
                }

                public final List<ButtonDto> getTrade_buttons() {
                    return this.trade_buttons;
                }
            }

            /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$TradeButtonContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<TradeButtonContentDto, GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<TradeButtonContentDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TradeButtonContentDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TradeButtonContentDto> getBinaryBase64Serializer() {
                    return (KSerializer) TradeButtonContentDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent> getProtoAdapter() {
                    return GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TradeButtonContentDto getZeroValue() {
                    return TradeButtonContentDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TradeButtonContentDto fromProto(GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    String expand_button_text = proto.getExpand_button_text();
                    boolean zIs_expand_button_enabled = proto.getIs_expand_button_enabled();
                    List<Button> trade_buttons = proto.getTrade_buttons();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(trade_buttons, 10));
                    Iterator<T> it = trade_buttons.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ButtonDto.INSTANCE.fromProto((Button) it.next()));
                    }
                    return new TradeButtonContentDto(new Surrogate(expand_button_text, zIs_expand_button_enabled, arrayList), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.TradeButtonContentDto.binaryBase64Serializer_delegate$lambda$1();
                    }
                });
                zeroValue = new TradeButtonContentDto(null, false, null, 7, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<TradeButtonContentDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse.FeedItem.TradeButtonContent", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, TradeButtonContentDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public TradeButtonContentDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new TradeButtonContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4188_4)
                public final String provideIntoMap() {
                    return "bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$TradeButtonContentDto";
                }
            }
        }

        /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006,"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Digest;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto$Surrogate;)V", "", "digest_id", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreviewDto;", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetailDto;", ErrorResponse.DETAIL, "(Ljava/lang/String;Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreviewDto;Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetailDto;)V", "toProto", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Digest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto$Surrogate;", "getDigest_id", "getPreview", "()Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreviewDto;", "getDetail", "()Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetailDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class DigestDto implements Dto3<GetCryptoPulseFeedRefreshResponse.FeedItem.Digest>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<DigestDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<DigestDto, GetCryptoPulseFeedRefreshResponse.FeedItem.Digest>> binaryBase64Serializer$delegate;
            private static final DigestDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ DigestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private DigestDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final String getDigest_id() {
                return this.surrogate.getDigest_id();
            }

            public final InstrumentDigestPreviewDto getPreview() {
                return this.surrogate.getPreview();
            }

            public final InstrumentDigestDetailDto getDetail() {
                return this.surrogate.getDetail();
            }

            public /* synthetic */ DigestDto(String str, InstrumentDigestPreviewDto instrumentDigestPreviewDto, InstrumentDigestDetailDto instrumentDigestDetailDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instrumentDigestPreviewDto, (i & 4) != 0 ? null : instrumentDigestDetailDto);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public DigestDto(String digest_id, InstrumentDigestPreviewDto instrumentDigestPreviewDto, InstrumentDigestDetailDto instrumentDigestDetailDto) {
                this(new Surrogate(digest_id, instrumentDigestPreviewDto, instrumentDigestDetailDto));
                Intrinsics.checkNotNullParameter(digest_id, "digest_id");
            }

            @Override // com.robinhood.idl.Dto
            public GetCryptoPulseFeedRefreshResponse.FeedItem.Digest toProto() {
                String digest_id = this.surrogate.getDigest_id();
                InstrumentDigestPreviewDto preview = this.surrogate.getPreview();
                InstrumentDigestPreview proto = preview != null ? preview.toProto() : null;
                InstrumentDigestDetailDto detail = this.surrogate.getDetail();
                return new GetCryptoPulseFeedRefreshResponse.FeedItem.Digest(digest_id, proto, detail != null ? detail.toProto() : null, null, 8, null);
            }

            public String toString() {
                return "[DigestDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof DigestDto) && Intrinsics.areEqual(((DigestDto) other).surrogate, this.surrogate);
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
            /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b+\u0010#\u001a\u0004\b)\u0010*¨\u0006."}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto$Surrogate;", "", "", "digest_id", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreviewDto;", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetailDto;", ErrorResponse.DETAIL, "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreviewDto;Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetailDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreviewDto;Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetailDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_crypto_v1_externalRelease", "(Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDigest_id", "getDigest_id$annotations", "()V", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreviewDto;", "getPreview", "()Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreviewDto;", "getPreview$annotations", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetailDto;", "getDetail", "()Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetailDto;", "getDetail$annotations", "Companion", "$serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final InstrumentDigestDetailDto detail;
                private final String digest_id;
                private final InstrumentDigestPreviewDto preview;

                public Surrogate() {
                    this((String) null, (InstrumentDigestPreviewDto) null, (InstrumentDigestDetailDto) null, 7, (DefaultConstructorMarker) null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.digest_id, surrogate.digest_id) && Intrinsics.areEqual(this.preview, surrogate.preview) && Intrinsics.areEqual(this.detail, surrogate.detail);
                }

                public int hashCode() {
                    int iHashCode = this.digest_id.hashCode() * 31;
                    InstrumentDigestPreviewDto instrumentDigestPreviewDto = this.preview;
                    int iHashCode2 = (iHashCode + (instrumentDigestPreviewDto == null ? 0 : instrumentDigestPreviewDto.hashCode())) * 31;
                    InstrumentDigestDetailDto instrumentDigestDetailDto = this.detail;
                    return iHashCode2 + (instrumentDigestDetailDto != null ? instrumentDigestDetailDto.hashCode() : 0);
                }

                public String toString() {
                    return "Surrogate(digest_id=" + this.digest_id + ", preview=" + this.preview + ", detail=" + this.detail + ")";
                }

                /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto$Surrogate;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return GetCryptoPulseFeedRefreshResponseDto2.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, String str, InstrumentDigestPreviewDto instrumentDigestPreviewDto, InstrumentDigestDetailDto instrumentDigestDetailDto, SerializationConstructorMarker serializationConstructorMarker) {
                    this.digest_id = (i & 1) == 0 ? "" : str;
                    if ((i & 2) == 0) {
                        this.preview = null;
                    } else {
                        this.preview = instrumentDigestPreviewDto;
                    }
                    if ((i & 4) == 0) {
                        this.detail = null;
                    } else {
                        this.detail = instrumentDigestDetailDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$bonfire_proto_idl_crypto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (!Intrinsics.areEqual(self.digest_id, "")) {
                        output.encodeStringElement(serialDesc, 0, self.digest_id);
                    }
                    InstrumentDigestPreviewDto instrumentDigestPreviewDto = self.preview;
                    if (instrumentDigestPreviewDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, InstrumentDigestPreviewDto.Serializer.INSTANCE, instrumentDigestPreviewDto);
                    }
                    InstrumentDigestDetailDto instrumentDigestDetailDto = self.detail;
                    if (instrumentDigestDetailDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 2, InstrumentDigestDetailDto.Serializer.INSTANCE, instrumentDigestDetailDto);
                    }
                }

                public Surrogate(String digest_id, InstrumentDigestPreviewDto instrumentDigestPreviewDto, InstrumentDigestDetailDto instrumentDigestDetailDto) {
                    Intrinsics.checkNotNullParameter(digest_id, "digest_id");
                    this.digest_id = digest_id;
                    this.preview = instrumentDigestPreviewDto;
                    this.detail = instrumentDigestDetailDto;
                }

                public final String getDigest_id() {
                    return this.digest_id;
                }

                public /* synthetic */ Surrogate(String str, InstrumentDigestPreviewDto instrumentDigestPreviewDto, InstrumentDigestDetailDto instrumentDigestDetailDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : instrumentDigestPreviewDto, (i & 4) != 0 ? null : instrumentDigestDetailDto);
                }

                public final InstrumentDigestPreviewDto getPreview() {
                    return this.preview;
                }

                public final InstrumentDigestDetailDto getDetail() {
                    return this.detail;
                }
            }

            /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponse$FeedItem$Digest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<DigestDto, GetCryptoPulseFeedRefreshResponse.FeedItem.Digest> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<DigestDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<DigestDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<DigestDto> getBinaryBase64Serializer() {
                    return (KSerializer) DigestDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<GetCryptoPulseFeedRefreshResponse.FeedItem.Digest> getProtoAdapter() {
                    return GetCryptoPulseFeedRefreshResponse.FeedItem.Digest.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public DigestDto getZeroValue() {
                    return DigestDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public DigestDto fromProto(GetCryptoPulseFeedRefreshResponse.FeedItem.Digest proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    String digest_id = proto.getDigest_id();
                    InstrumentDigestPreview preview = proto.getPreview();
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    InstrumentDigestPreviewDto instrumentDigestPreviewDtoFromProto = preview != null ? InstrumentDigestPreviewDto.INSTANCE.fromProto(preview) : null;
                    InstrumentDigestDetail detail = proto.getDetail();
                    return new DigestDto(new Surrogate(digest_id, instrumentDigestPreviewDtoFromProto, detail != null ? InstrumentDigestDetailDto.INSTANCE.fromProto(detail) : null), defaultConstructorMarker);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GetCryptoPulseFeedRefreshResponseDto.FeedItemDto.DigestDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new DigestDto(null, null, null, 7, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<DigestDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse.FeedItem.Digest", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, DigestDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public DigestDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new DigestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4189_5)
                public final String provideIntoMap() {
                    return "bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$DigestDto";
                }
            }
        }

        /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<FeedItemDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse.FeedItem", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, FeedItemDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public FeedItemDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new FeedItemDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$FeedItemDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4186_2)
            public final String provideIntoMap() {
                return "bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto$FeedItemDto";
            }
        }
    }

    /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetCryptoPulseFeedRefreshResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetCryptoPulseFeedRefreshResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetCryptoPulseFeedRefreshResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetCryptoPulseFeedRefreshResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetCryptoPulseFeedRefreshResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshResponseDto";
        }
    }
}
