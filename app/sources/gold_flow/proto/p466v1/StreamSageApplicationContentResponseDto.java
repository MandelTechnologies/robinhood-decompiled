package gold_flow.proto.p466v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import gold_flow.proto.p466v1.StreamSageApplicationContentResponseDto;
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

/* compiled from: StreamSageApplicationContentResponseDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BU\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006("}, m3636d2 = {"Lgold_flow/proto/v1/StreamSageApplicationContentResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lgold_flow/proto/v1/StreamSageApplicationContentResponse;", "Landroid/os/Parcelable;", "Lgold_flow/proto/v1/StreamSageApplicationContentResponseDto$Surrogate;", "surrogate", "<init>", "(Lgold_flow/proto/v1/StreamSageApplicationContentResponseDto$Surrogate;)V", "", "url", "", "allowed_urls", "hosts_to_open_externally", "allowed_urls_to_open_externally", "allowed_urls_to_open_in_app", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "toProto", "()Lgold_flow/proto/v1/StreamSageApplicationContentResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lgold_flow/proto/v1/StreamSageApplicationContentResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class StreamSageApplicationContentResponseDto implements Dto3<StreamSageApplicationContentResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamSageApplicationContentResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamSageApplicationContentResponseDto, StreamSageApplicationContentResponse>> binaryBase64Serializer$delegate;
    private static final StreamSageApplicationContentResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamSageApplicationContentResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamSageApplicationContentResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ StreamSageApplicationContentResponseDto(String str, List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? CollectionsKt.emptyList() : list4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamSageApplicationContentResponseDto(String str, List<String> allowed_urls, List<String> hosts_to_open_externally, List<String> allowed_urls_to_open_externally, List<String> allowed_urls_to_open_in_app) {
        this(new Surrogate(str, allowed_urls, hosts_to_open_externally, allowed_urls_to_open_externally, allowed_urls_to_open_in_app));
        Intrinsics.checkNotNullParameter(allowed_urls, "allowed_urls");
        Intrinsics.checkNotNullParameter(hosts_to_open_externally, "hosts_to_open_externally");
        Intrinsics.checkNotNullParameter(allowed_urls_to_open_externally, "allowed_urls_to_open_externally");
        Intrinsics.checkNotNullParameter(allowed_urls_to_open_in_app, "allowed_urls_to_open_in_app");
    }

    @Override // com.robinhood.idl.Dto
    public StreamSageApplicationContentResponse toProto() {
        String url = this.surrogate.getUrl();
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
        List<String> allowed_urls_to_open_externally = this.surrogate.getAllowed_urls_to_open_externally();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(allowed_urls_to_open_externally, 10));
        Iterator<T> it3 = allowed_urls_to_open_externally.iterator();
        while (it3.hasNext()) {
            arrayList3.add((String) it3.next());
        }
        List<String> allowed_urls_to_open_in_app = this.surrogate.getAllowed_urls_to_open_in_app();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(allowed_urls_to_open_in_app, 10));
        Iterator<T> it4 = allowed_urls_to_open_in_app.iterator();
        while (it4.hasNext()) {
            arrayList4.add((String) it4.next());
        }
        return new StreamSageApplicationContentResponse(url, arrayList, arrayList2, arrayList3, arrayList4, null, 32, null);
    }

    public String toString() {
        return "[StreamSageApplicationContentResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamSageApplicationContentResponseDto) && Intrinsics.areEqual(((StreamSageApplicationContentResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamSageApplicationContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\t\u0010\nBe\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010'R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010%\u0012\u0004\b,\u0010$\u001a\u0004\b+\u0010'R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010%\u0012\u0004\b.\u0010$\u001a\u0004\b-\u0010'¨\u00061"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSageApplicationContentResponseDto$Surrogate;", "", "", "url", "", "allowed_urls", "hosts_to_open_externally", "allowed_urls_to_open_externally", "allowed_urls_to_open_in_app", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$gold_flow_v1_externalRelease", "(Lgold_flow/proto/v1/StreamSageApplicationContentResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getUrl$annotations", "()V", "Ljava/util/List;", "getAllowed_urls", "()Ljava/util/List;", "getAllowed_urls$annotations", "getHosts_to_open_externally", "getHosts_to_open_externally$annotations", "getAllowed_urls_to_open_externally", "getAllowed_urls_to_open_externally$annotations", "getAllowed_urls_to_open_in_app", "getAllowed_urls_to_open_in_app$annotations", "Companion", "$serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<String> allowed_urls;
        private final List<String> allowed_urls_to_open_externally;
        private final List<String> allowed_urls_to_open_in_app;
        private final List<String> hosts_to_open_externally;
        private final String url;

        public Surrogate() {
            this((String) null, (List) null, (List) null, (List) null, (List) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
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
            return Intrinsics.areEqual(this.url, surrogate.url) && Intrinsics.areEqual(this.allowed_urls, surrogate.allowed_urls) && Intrinsics.areEqual(this.hosts_to_open_externally, surrogate.hosts_to_open_externally) && Intrinsics.areEqual(this.allowed_urls_to_open_externally, surrogate.allowed_urls_to_open_externally) && Intrinsics.areEqual(this.allowed_urls_to_open_in_app, surrogate.allowed_urls_to_open_in_app);
        }

        public int hashCode() {
            String str = this.url;
            return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.allowed_urls.hashCode()) * 31) + this.hosts_to_open_externally.hashCode()) * 31) + this.allowed_urls_to_open_externally.hashCode()) * 31) + this.allowed_urls_to_open_in_app.hashCode();
        }

        public String toString() {
            return "Surrogate(url=" + this.url + ", allowed_urls=" + this.allowed_urls + ", hosts_to_open_externally=" + this.hosts_to_open_externally + ", allowed_urls_to_open_externally=" + this.allowed_urls_to_open_externally + ", allowed_urls_to_open_in_app=" + this.allowed_urls_to_open_in_app + ")";
        }

        /* compiled from: StreamSageApplicationContentResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSageApplicationContentResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamSageApplicationContentResponseDto$Surrogate;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamSageApplicationContentResponseDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: gold_flow.proto.v1.StreamSageApplicationContentResponseDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamSageApplicationContentResponseDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: gold_flow.proto.v1.StreamSageApplicationContentResponseDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamSageApplicationContentResponseDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: gold_flow.proto.v1.StreamSageApplicationContentResponseDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamSageApplicationContentResponseDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: gold_flow.proto.v1.StreamSageApplicationContentResponseDto$Surrogate$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamSageApplicationContentResponseDto.Surrogate._childSerializers$_anonymous_$2();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, String str, List list, List list2, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker) {
            this.url = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.allowed_urls = CollectionsKt.emptyList();
            } else {
                this.allowed_urls = list;
            }
            if ((i & 4) == 0) {
                this.hosts_to_open_externally = CollectionsKt.emptyList();
            } else {
                this.hosts_to_open_externally = list2;
            }
            if ((i & 8) == 0) {
                this.allowed_urls_to_open_externally = CollectionsKt.emptyList();
            } else {
                this.allowed_urls_to_open_externally = list3;
            }
            if ((i & 16) == 0) {
                this.allowed_urls_to_open_in_app = CollectionsKt.emptyList();
            } else {
                this.allowed_urls_to_open_in_app = list4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$gold_flow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            String str = self.url;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.allowed_urls, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.allowed_urls);
            }
            if (!Intrinsics.areEqual(self.hosts_to_open_externally, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.hosts_to_open_externally);
            }
            if (!Intrinsics.areEqual(self.allowed_urls_to_open_externally, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.allowed_urls_to_open_externally);
            }
            if (Intrinsics.areEqual(self.allowed_urls_to_open_in_app, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.allowed_urls_to_open_in_app);
        }

        public Surrogate(String str, List<String> allowed_urls, List<String> hosts_to_open_externally, List<String> allowed_urls_to_open_externally, List<String> allowed_urls_to_open_in_app) {
            Intrinsics.checkNotNullParameter(allowed_urls, "allowed_urls");
            Intrinsics.checkNotNullParameter(hosts_to_open_externally, "hosts_to_open_externally");
            Intrinsics.checkNotNullParameter(allowed_urls_to_open_externally, "allowed_urls_to_open_externally");
            Intrinsics.checkNotNullParameter(allowed_urls_to_open_in_app, "allowed_urls_to_open_in_app");
            this.url = str;
            this.allowed_urls = allowed_urls;
            this.hosts_to_open_externally = hosts_to_open_externally;
            this.allowed_urls_to_open_externally = allowed_urls_to_open_externally;
            this.allowed_urls_to_open_in_app = allowed_urls_to_open_in_app;
        }

        public final String getUrl() {
            return this.url;
        }

        public final List<String> getAllowed_urls() {
            return this.allowed_urls;
        }

        public /* synthetic */ Surrogate(String str, List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? CollectionsKt.emptyList() : list4);
        }

        public final List<String> getHosts_to_open_externally() {
            return this.hosts_to_open_externally;
        }

        public final List<String> getAllowed_urls_to_open_externally() {
            return this.allowed_urls_to_open_externally;
        }

        public final List<String> getAllowed_urls_to_open_in_app() {
            return this.allowed_urls_to_open_in_app;
        }
    }

    /* compiled from: StreamSageApplicationContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSageApplicationContentResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lgold_flow/proto/v1/StreamSageApplicationContentResponseDto;", "Lgold_flow/proto/v1/StreamSageApplicationContentResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold_flow/proto/v1/StreamSageApplicationContentResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamSageApplicationContentResponseDto, StreamSageApplicationContentResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamSageApplicationContentResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamSageApplicationContentResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamSageApplicationContentResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamSageApplicationContentResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamSageApplicationContentResponse> getProtoAdapter() {
            return StreamSageApplicationContentResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamSageApplicationContentResponseDto getZeroValue() {
            return StreamSageApplicationContentResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamSageApplicationContentResponseDto fromProto(StreamSageApplicationContentResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String url = proto.getUrl();
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
            List<String> allowed_urls_to_open_externally = proto.getAllowed_urls_to_open_externally();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(allowed_urls_to_open_externally, 10));
            Iterator<T> it3 = allowed_urls_to_open_externally.iterator();
            while (it3.hasNext()) {
                arrayList3.add((String) it3.next());
            }
            List<String> allowed_urls_to_open_in_app = proto.getAllowed_urls_to_open_in_app();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(allowed_urls_to_open_in_app, 10));
            Iterator<T> it4 = allowed_urls_to_open_in_app.iterator();
            while (it4.hasNext()) {
                arrayList4.add((String) it4.next());
            }
            return new StreamSageApplicationContentResponseDto(new Surrogate(url, arrayList, arrayList2, arrayList3, arrayList4), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.StreamSageApplicationContentResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamSageApplicationContentResponseDto.binaryBase64Serializer_delegate$lambda$4();
            }
        });
        zeroValue = new StreamSageApplicationContentResponseDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$4() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamSageApplicationContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSageApplicationContentResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/StreamSageApplicationContentResponseDto;", "<init>", "()V", "surrogateSerializer", "Lgold_flow/proto/v1/StreamSageApplicationContentResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StreamSageApplicationContentResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/gold_flow.proto.v1.StreamSageApplicationContentResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamSageApplicationContentResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamSageApplicationContentResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamSageApplicationContentResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamSageApplicationContentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSageApplicationContentResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "gold_flow.proto.v1.StreamSageApplicationContentResponseDto";
        }
    }
}
