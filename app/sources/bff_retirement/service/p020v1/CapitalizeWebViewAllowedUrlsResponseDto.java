package bff_retirement.service.p020v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_retirement.service.p020v1.CapitalizeWebViewAllowedUrlsResponseDto;
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

/* compiled from: CapitalizeWebViewAllowedUrlsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\"¨\u0006("}, m3636d2 = {"Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponse;", "Landroid/os/Parcelable;", "Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto$Surrogate;", "surrogate", "<init>", "(Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto$Surrogate;)V", "", "", "allowed_urls", "hosts_to_open_externally", "(Ljava/util/List;Ljava/util/List;)V", "toProto", "()Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto$Surrogate;", "getAllowed_urls", "()Ljava/util/List;", "getHosts_to_open_externally", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_retirement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CapitalizeWebViewAllowedUrlsResponseDto implements Dto3<CapitalizeWebViewAllowedUrlsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CapitalizeWebViewAllowedUrlsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CapitalizeWebViewAllowedUrlsResponseDto, CapitalizeWebViewAllowedUrlsResponse>> binaryBase64Serializer$delegate;
    private static final CapitalizeWebViewAllowedUrlsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CapitalizeWebViewAllowedUrlsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CapitalizeWebViewAllowedUrlsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<String> getAllowed_urls() {
        return this.surrogate.getAllowed_urls();
    }

    public final List<String> getHosts_to_open_externally() {
        return this.surrogate.getHosts_to_open_externally();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CapitalizeWebViewAllowedUrlsResponseDto(List<String> allowed_urls, List<String> hosts_to_open_externally) {
        this(new Surrogate(allowed_urls, hosts_to_open_externally));
        Intrinsics.checkNotNullParameter(allowed_urls, "allowed_urls");
        Intrinsics.checkNotNullParameter(hosts_to_open_externally, "hosts_to_open_externally");
    }

    public /* synthetic */ CapitalizeWebViewAllowedUrlsResponseDto(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<String>) ((i & 1) != 0 ? CollectionsKt.emptyList() : list), (List<String>) ((i & 2) != 0 ? CollectionsKt.emptyList() : list2));
    }

    @Override // com.robinhood.idl.Dto
    public CapitalizeWebViewAllowedUrlsResponse toProto() {
        List<String> allowed_urls = this.surrogate.getAllowed_urls();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(allowed_urls, 10));
        Iterator<T> it = allowed_urls.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        List<String> hosts_to_open_externally = this.surrogate.getHosts_to_open_externally();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(hosts_to_open_externally, 10));
        Iterator<T> it2 = hosts_to_open_externally.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) it2.next());
        }
        return new CapitalizeWebViewAllowedUrlsResponse(arrayList, arrayList2, null, 4, null);
    }

    public String toString() {
        return "[CapitalizeWebViewAllowedUrlsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CapitalizeWebViewAllowedUrlsResponseDto) && Intrinsics.areEqual(((CapitalizeWebViewAllowedUrlsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: CapitalizeWebViewAllowedUrlsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010 ¨\u0006'"}, m3636d2 = {"Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto$Surrogate;", "", "", "", "allowed_urls", "hosts_to_open_externally", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_retirement_service_v1_externalRelease", "(Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAllowed_urls", "()Ljava/util/List;", "getAllowed_urls$annotations", "()V", "getHosts_to_open_externally", "getHosts_to_open_externally$annotations", "Companion", "$serializer", "bff_retirement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<String> allowed_urls;
        private final List<String> hosts_to_open_externally;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
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
            return Intrinsics.areEqual(this.allowed_urls, surrogate.allowed_urls) && Intrinsics.areEqual(this.hosts_to_open_externally, surrogate.hosts_to_open_externally);
        }

        public int hashCode() {
            return (this.allowed_urls.hashCode() * 31) + this.hosts_to_open_externally.hashCode();
        }

        public String toString() {
            return "Surrogate(allowed_urls=" + this.allowed_urls + ", hosts_to_open_externally=" + this.hosts_to_open_externally + ")";
        }

        /* compiled from: CapitalizeWebViewAllowedUrlsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto$Surrogate;", "bff_retirement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CapitalizeWebViewAllowedUrlsResponseDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bff_retirement.service.v1.CapitalizeWebViewAllowedUrlsResponseDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CapitalizeWebViewAllowedUrlsResponseDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bff_retirement.service.v1.CapitalizeWebViewAllowedUrlsResponseDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CapitalizeWebViewAllowedUrlsResponseDto.Surrogate._childSerializers$_anonymous_$0();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
            this.allowed_urls = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.hosts_to_open_externally = CollectionsKt.emptyList();
            } else {
                this.hosts_to_open_externally = list2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_retirement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.allowed_urls, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.allowed_urls);
            }
            if (Intrinsics.areEqual(self.hosts_to_open_externally, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.hosts_to_open_externally);
        }

        public Surrogate(List<String> allowed_urls, List<String> hosts_to_open_externally) {
            Intrinsics.checkNotNullParameter(allowed_urls, "allowed_urls");
            Intrinsics.checkNotNullParameter(hosts_to_open_externally, "hosts_to_open_externally");
            this.allowed_urls = allowed_urls;
            this.hosts_to_open_externally = hosts_to_open_externally;
        }

        public final List<String> getAllowed_urls() {
            return this.allowed_urls;
        }

        public /* synthetic */ Surrogate(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2);
        }

        public final List<String> getHosts_to_open_externally() {
            return this.hosts_to_open_externally;
        }
    }

    /* compiled from: CapitalizeWebViewAllowedUrlsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto;", "Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_retirement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CapitalizeWebViewAllowedUrlsResponseDto, CapitalizeWebViewAllowedUrlsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CapitalizeWebViewAllowedUrlsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CapitalizeWebViewAllowedUrlsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CapitalizeWebViewAllowedUrlsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) CapitalizeWebViewAllowedUrlsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CapitalizeWebViewAllowedUrlsResponse> getProtoAdapter() {
            return CapitalizeWebViewAllowedUrlsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CapitalizeWebViewAllowedUrlsResponseDto getZeroValue() {
            return CapitalizeWebViewAllowedUrlsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CapitalizeWebViewAllowedUrlsResponseDto fromProto(CapitalizeWebViewAllowedUrlsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<String> allowed_urls = proto.getAllowed_urls();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(allowed_urls, 10));
            Iterator<T> it = allowed_urls.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            List<String> hosts_to_open_externally = proto.getHosts_to_open_externally();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(hosts_to_open_externally, 10));
            Iterator<T> it2 = hosts_to_open_externally.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) it2.next());
            }
            return new CapitalizeWebViewAllowedUrlsResponseDto(new Surrogate(arrayList, arrayList2), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_retirement.service.v1.CapitalizeWebViewAllowedUrlsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CapitalizeWebViewAllowedUrlsResponseDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new CapitalizeWebViewAllowedUrlsResponseDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CapitalizeWebViewAllowedUrlsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_retirement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<CapitalizeWebViewAllowedUrlsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_retirement.service.v1.CapitalizeWebViewAllowedUrlsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CapitalizeWebViewAllowedUrlsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CapitalizeWebViewAllowedUrlsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CapitalizeWebViewAllowedUrlsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: CapitalizeWebViewAllowedUrlsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_retirement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "bff_retirement.service.v1.CapitalizeWebViewAllowedUrlsResponseDto";
        }
    }
}
