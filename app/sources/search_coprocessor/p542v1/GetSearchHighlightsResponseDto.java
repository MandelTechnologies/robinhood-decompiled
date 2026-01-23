package search_coprocessor.p542v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import p479j$.time.Instant;
import search_coprocessor.p542v1.GetSearchHighlightsResponseDto;
import search_coprocessor.p542v1.HighlightItemDto;
import search_coprocessor.p542v1.SearchSubpageDto;

/* compiled from: GetSearchHighlightsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B]\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0019\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8F¢\u0006\u0006\u001a\u0004\b,\u0010)R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b8F¢\u0006\u0006\u001a\u0004\b-\u0010)¨\u00062"}, m3636d2 = {"Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lsearch_coprocessor/v1/GetSearchHighlightsResponse;", "Landroid/os/Parcelable;", "Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto$Surrogate;", "surrogate", "<init>", "(Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto$Surrogate;)V", "", "Lsearch_coprocessor/v1/HighlightItemDto;", "items", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "valid_until", "next_refresh_at", "", "templates_to_exclude", "Lsearch_coprocessor/v1/SearchSubpageDto;", "subpages", "(Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;Ljava/util/List;)V", "toProto", "()Lsearch_coprocessor/v1/GetSearchHighlightsResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto$Surrogate;", "getItems", "()Ljava/util/List;", "getNext_refresh_at", "()Lj$/time/Instant;", "getTemplates_to_exclude", "getSubpages", "Companion", "Surrogate", "Serializer", "MultibindingModule", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes28.dex */
public final class GetSearchHighlightsResponseDto implements Dto3<GetSearchHighlightsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetSearchHighlightsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetSearchHighlightsResponseDto, GetSearchHighlightsResponse>> binaryBase64Serializer$delegate;
    private static final GetSearchHighlightsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetSearchHighlightsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetSearchHighlightsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<HighlightItemDto> getItems() {
        return this.surrogate.getItems();
    }

    public final Instant getNext_refresh_at() {
        return this.surrogate.getNext_refresh_at();
    }

    public final List<String> getTemplates_to_exclude() {
        return this.surrogate.getTemplates_to_exclude();
    }

    public final List<SearchSubpageDto> getSubpages() {
        return this.surrogate.getSubpages();
    }

    public /* synthetic */ GetSearchHighlightsResponseDto(List list, Instant instant, Instant instant2, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? CollectionsKt.emptyList() : list3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetSearchHighlightsResponseDto(List<HighlightItemDto> items, Instant instant, Instant instant2, List<String> templates_to_exclude, List<SearchSubpageDto> subpages) {
        this(new Surrogate(items, instant, instant2, templates_to_exclude, subpages));
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(templates_to_exclude, "templates_to_exclude");
        Intrinsics.checkNotNullParameter(subpages, "subpages");
    }

    @Override // com.robinhood.idl.Dto
    public GetSearchHighlightsResponse toProto() {
        List<HighlightItemDto> items = this.surrogate.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(((HighlightItemDto) it.next()).toProto());
        }
        Instant valid_until = this.surrogate.getValid_until();
        Instant next_refresh_at = this.surrogate.getNext_refresh_at();
        List<String> templates_to_exclude = this.surrogate.getTemplates_to_exclude();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(templates_to_exclude, 10));
        Iterator<T> it2 = templates_to_exclude.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) it2.next());
        }
        List<SearchSubpageDto> subpages = this.surrogate.getSubpages();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subpages, 10));
        Iterator<T> it3 = subpages.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((SearchSubpageDto) it3.next()).toProto());
        }
        return new GetSearchHighlightsResponse(arrayList, valid_until, next_refresh_at, arrayList2, arrayList3, null, 32, null);
    }

    public String toString() {
        return "[GetSearchHighlightsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetSearchHighlightsResponseDto) && Intrinsics.areEqual(((GetSearchHighlightsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetSearchHighlightsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000287B\u0097\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002¢\u0006\u0004\b\u0010\u0010\u0011B_\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*RF\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b0\u0010,\u001a\u0004\b.\u0010/RF\u0010\u000b\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010-\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010/R&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010(\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010*R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010(\u0012\u0004\b6\u0010,\u001a\u0004\b5\u0010*¨\u00069"}, m3636d2 = {"Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto$Surrogate;", "", "", "Lsearch_coprocessor/v1/HighlightItemDto;", "items", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "valid_until", "next_refresh_at", "", "templates_to_exclude", "Lsearch_coprocessor/v1/SearchSubpageDto;", "subpages", "<init>", "(Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$search_coprocessor_v1_externalRelease", "(Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getItems$annotations", "()V", "Lj$/time/Instant;", "getValid_until", "()Lj$/time/Instant;", "getValid_until$annotations", "getNext_refresh_at", "getNext_refresh_at$annotations", "getTemplates_to_exclude", "getTemplates_to_exclude$annotations", "getSubpages", "getSubpages$annotations", "Companion", "$serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<HighlightItemDto> items;
        private final Instant next_refresh_at;
        private final List<SearchSubpageDto> subpages;
        private final List<String> templates_to_exclude;
        private final Instant valid_until;

        public Surrogate() {
            this((List) null, (Instant) null, (Instant) null, (List) null, (List) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(HighlightItemDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(SearchSubpageDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.items, surrogate.items) && Intrinsics.areEqual(this.valid_until, surrogate.valid_until) && Intrinsics.areEqual(this.next_refresh_at, surrogate.next_refresh_at) && Intrinsics.areEqual(this.templates_to_exclude, surrogate.templates_to_exclude) && Intrinsics.areEqual(this.subpages, surrogate.subpages);
        }

        public int hashCode() {
            int iHashCode = this.items.hashCode() * 31;
            Instant instant = this.valid_until;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.next_refresh_at;
            return ((((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.templates_to_exclude.hashCode()) * 31) + this.subpages.hashCode();
        }

        public String toString() {
            return "Surrogate(items=" + this.items + ", valid_until=" + this.valid_until + ", next_refresh_at=" + this.next_refresh_at + ", templates_to_exclude=" + this.templates_to_exclude + ", subpages=" + this.subpages + ")";
        }

        /* compiled from: GetSearchHighlightsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto$Surrogate;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetSearchHighlightsResponseDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: search_coprocessor.v1.GetSearchHighlightsResponseDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetSearchHighlightsResponseDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: search_coprocessor.v1.GetSearchHighlightsResponseDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetSearchHighlightsResponseDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: search_coprocessor.v1.GetSearchHighlightsResponseDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetSearchHighlightsResponseDto.Surrogate._childSerializers$_anonymous_$1();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, List list, Instant instant, Instant instant2, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
            this.items = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.valid_until = null;
            } else {
                this.valid_until = instant;
            }
            if ((i & 4) == 0) {
                this.next_refresh_at = null;
            } else {
                this.next_refresh_at = instant2;
            }
            if ((i & 8) == 0) {
                this.templates_to_exclude = CollectionsKt.emptyList();
            } else {
                this.templates_to_exclude = list2;
            }
            if ((i & 16) == 0) {
                this.subpages = CollectionsKt.emptyList();
            } else {
                this.subpages = list3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$search_coprocessor_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.items, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.items);
            }
            Instant instant = self.valid_until;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.next_refresh_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant2);
            }
            if (!Intrinsics.areEqual(self.templates_to_exclude, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.templates_to_exclude);
            }
            if (Intrinsics.areEqual(self.subpages, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.subpages);
        }

        public Surrogate(List<HighlightItemDto> items, Instant instant, Instant instant2, List<String> templates_to_exclude, List<SearchSubpageDto> subpages) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(templates_to_exclude, "templates_to_exclude");
            Intrinsics.checkNotNullParameter(subpages, "subpages");
            this.items = items;
            this.valid_until = instant;
            this.next_refresh_at = instant2;
            this.templates_to_exclude = templates_to_exclude;
            this.subpages = subpages;
        }

        public final List<HighlightItemDto> getItems() {
            return this.items;
        }

        public /* synthetic */ Surrogate(List list, Instant instant, Instant instant2, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : instant2, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? CollectionsKt.emptyList() : list3);
        }

        public final Instant getValid_until() {
            return this.valid_until;
        }

        public final Instant getNext_refresh_at() {
            return this.next_refresh_at;
        }

        public final List<String> getTemplates_to_exclude() {
            return this.templates_to_exclude;
        }

        public final List<SearchSubpageDto> getSubpages() {
            return this.subpages;
        }
    }

    /* compiled from: GetSearchHighlightsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto;", "Lsearch_coprocessor/v1/GetSearchHighlightsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetSearchHighlightsResponseDto, GetSearchHighlightsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetSearchHighlightsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetSearchHighlightsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetSearchHighlightsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetSearchHighlightsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetSearchHighlightsResponse> getProtoAdapter() {
            return GetSearchHighlightsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetSearchHighlightsResponseDto getZeroValue() {
            return GetSearchHighlightsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetSearchHighlightsResponseDto fromProto(GetSearchHighlightsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<HighlightItem> items = proto.getItems();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(HighlightItemDto.INSTANCE.fromProto((HighlightItem) it.next()));
            }
            Instant valid_until = proto.getValid_until();
            Instant next_refresh_at = proto.getNext_refresh_at();
            List<String> templates_to_exclude = proto.getTemplates_to_exclude();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(templates_to_exclude, 10));
            Iterator<T> it2 = templates_to_exclude.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) it2.next());
            }
            List<SearchSubpage> subpages = proto.getSubpages();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subpages, 10));
            Iterator<T> it3 = subpages.iterator();
            while (it3.hasNext()) {
                arrayList3.add(SearchSubpageDto.INSTANCE.fromProto((SearchSubpage) it3.next()));
            }
            return new GetSearchHighlightsResponseDto(new Surrogate(arrayList, valid_until, next_refresh_at, arrayList2, arrayList3), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: search_coprocessor.v1.GetSearchHighlightsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetSearchHighlightsResponseDto.binaryBase64Serializer_delegate$lambda$3();
            }
        });
        zeroValue = new GetSearchHighlightsResponseDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$3() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetSearchHighlightsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetSearchHighlightsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/search_coprocessor.v1.GetSearchHighlightsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetSearchHighlightsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetSearchHighlightsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetSearchHighlightsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetSearchHighlightsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lsearch_coprocessor/v1/GetSearchHighlightsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "search_coprocessor.v1.GetSearchHighlightsResponseDto";
        }
    }
}
