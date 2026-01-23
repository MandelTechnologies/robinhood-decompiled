package options_product.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.i18n.Locality;
import com.robinhood.rosetta.i18n.LocalityDto;
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
import options_product.service.GetNextOnboardingScreensRequestDto;
import options_product.service.OnboardingEntryPointDto;
import options_product.service.OnboardingExperimentDto;
import options_product.service.OnboardingScreenRequestDto;

/* compiled from: GetNextOnboardingScreensRequestDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B[\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)¨\u0006."}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Loptions_product/service/GetNextOnboardingScreensRequest;", "Landroid/os/Parcelable;", "Loptions_product/service/GetNextOnboardingScreensRequestDto$Surrogate;", "surrogate", "<init>", "(Loptions_product/service/GetNextOnboardingScreensRequestDto$Surrogate;)V", "", "account_number", "session_id", "", "Loptions_product/service/OnboardingScreenRequestDto;", "screen_requests", "logging_source", "Lcom/robinhood/rosetta/i18n/LocalityDto;", "locality", "Loptions_product/service/OnboardingExperimentDto;", "experiments", "Loptions_product/service/OnboardingEntryPointDto;", "entry_point", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/rosetta/i18n/LocalityDto;Ljava/util/List;Loptions_product/service/OnboardingEntryPointDto;)V", "toProto", "()Loptions_product/service/GetNextOnboardingScreensRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Loptions_product/service/GetNextOnboardingScreensRequestDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class GetNextOnboardingScreensRequestDto implements Dto3<GetNextOnboardingScreensRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetNextOnboardingScreensRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetNextOnboardingScreensRequestDto, GetNextOnboardingScreensRequest>> binaryBase64Serializer$delegate;
    private static final GetNextOnboardingScreensRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetNextOnboardingScreensRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetNextOnboardingScreensRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ GetNextOnboardingScreensRequestDto(String str, String str2, List list, String str3, LocalityDto localityDto, List list2, OnboardingEntryPointDto onboardingEntryPointDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? LocalityDto.INSTANCE.getZeroValue() : localityDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? OnboardingEntryPointDto.INSTANCE.getZeroValue() : onboardingEntryPointDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetNextOnboardingScreensRequestDto(String account_number, String session_id, List<OnboardingScreenRequestDto> screen_requests, String logging_source, LocalityDto locality, List<OnboardingExperimentDto> experiments, OnboardingEntryPointDto entry_point) {
        this(new Surrogate(account_number, session_id, screen_requests, logging_source, locality, experiments, entry_point));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(screen_requests, "screen_requests");
        Intrinsics.checkNotNullParameter(logging_source, "logging_source");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetNextOnboardingScreensRequest toProto() {
        String account_number = this.surrogate.getAccount_number();
        String session_id = this.surrogate.getSession_id();
        List<OnboardingScreenRequestDto> screen_requests = this.surrogate.getScreen_requests();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(screen_requests, 10));
        Iterator<T> it = screen_requests.iterator();
        while (it.hasNext()) {
            arrayList.add(((OnboardingScreenRequestDto) it.next()).toProto());
        }
        String logging_source = this.surrogate.getLogging_source();
        Locality locality = (Locality) this.surrogate.getLocality().toProto();
        List<OnboardingExperimentDto> experiments = this.surrogate.getExperiments();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(experiments, 10));
        Iterator<T> it2 = experiments.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((OnboardingExperimentDto) it2.next()).toProto());
        }
        return new GetNextOnboardingScreensRequest(account_number, session_id, arrayList, logging_source, locality, arrayList2, (OnboardingEntryPoint) this.surrogate.getEntry_point().toProto(), null, 128, null);
    }

    public String toString() {
        return "[GetNextOnboardingScreensRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetNextOnboardingScreensRequestDto) && Intrinsics.areEqual(((GetNextOnboardingScreensRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetNextOnboardingScreensRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 =2\u00020\u0001:\u0002>=BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bm\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010 R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010 R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b0\u0010*\u001a\u0004\b.\u0010/R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010'\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010 R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b6\u0010*\u001a\u0004\b4\u00105R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010-\u0012\u0004\b8\u0010*\u001a\u0004\b7\u0010/R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00109\u0012\u0004\b<\u0010*\u001a\u0004\b:\u0010;¨\u0006?"}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensRequestDto$Surrogate;", "", "", "account_number", "session_id", "", "Loptions_product/service/OnboardingScreenRequestDto;", "screen_requests", "logging_source", "Lcom/robinhood/rosetta/i18n/LocalityDto;", "locality", "Loptions_product/service/OnboardingExperimentDto;", "experiments", "Loptions_product/service/OnboardingEntryPointDto;", "entry_point", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/rosetta/i18n/LocalityDto;Ljava/util/List;Loptions_product/service/OnboardingEntryPointDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/rosetta/i18n/LocalityDto;Ljava/util/List;Loptions_product/service/OnboardingEntryPointDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$options_product_service_v1_onboarding_externalRelease", "(Loptions_product/service/GetNextOnboardingScreensRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "getSession_id", "getSession_id$annotations", "Ljava/util/List;", "getScreen_requests", "()Ljava/util/List;", "getScreen_requests$annotations", "getLogging_source", "getLogging_source$annotations", "Lcom/robinhood/rosetta/i18n/LocalityDto;", "getLocality", "()Lcom/robinhood/rosetta/i18n/LocalityDto;", "getLocality$annotations", "getExperiments", "getExperiments$annotations", "Loptions_product/service/OnboardingEntryPointDto;", "getEntry_point", "()Loptions_product/service/OnboardingEntryPointDto;", "getEntry_point$annotations", "Companion", "$serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final OnboardingEntryPointDto entry_point;
        private final List<OnboardingExperimentDto> experiments;
        private final LocalityDto locality;
        private final String logging_source;
        private final List<OnboardingScreenRequestDto> screen_requests;
        private final String session_id;

        public Surrogate() {
            this((String) null, (String) null, (List) null, (String) null, (LocalityDto) null, (List) null, (OnboardingEntryPointDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(OnboardingScreenRequestDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(OnboardingExperimentDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.session_id, surrogate.session_id) && Intrinsics.areEqual(this.screen_requests, surrogate.screen_requests) && Intrinsics.areEqual(this.logging_source, surrogate.logging_source) && this.locality == surrogate.locality && Intrinsics.areEqual(this.experiments, surrogate.experiments) && this.entry_point == surrogate.entry_point;
        }

        public int hashCode() {
            return (((((((((((this.account_number.hashCode() * 31) + this.session_id.hashCode()) * 31) + this.screen_requests.hashCode()) * 31) + this.logging_source.hashCode()) * 31) + this.locality.hashCode()) * 31) + this.experiments.hashCode()) * 31) + this.entry_point.hashCode();
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", session_id=" + this.session_id + ", screen_requests=" + this.screen_requests + ", logging_source=" + this.logging_source + ", locality=" + this.locality + ", experiments=" + this.experiments + ", entry_point=" + this.entry_point + ")";
        }

        /* compiled from: GetNextOnboardingScreensRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/GetNextOnboardingScreensRequestDto$Surrogate;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetNextOnboardingScreensRequestDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: options_product.service.GetNextOnboardingScreensRequestDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetNextOnboardingScreensRequestDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: options_product.service.GetNextOnboardingScreensRequestDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetNextOnboardingScreensRequestDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null};
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, List list, String str3, LocalityDto localityDto, List list2, OnboardingEntryPointDto onboardingEntryPointDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 2) == 0) {
                this.session_id = "";
            } else {
                this.session_id = str2;
            }
            if ((i & 4) == 0) {
                this.screen_requests = CollectionsKt.emptyList();
            } else {
                this.screen_requests = list;
            }
            if ((i & 8) == 0) {
                this.logging_source = "";
            } else {
                this.logging_source = str3;
            }
            if ((i & 16) == 0) {
                this.locality = LocalityDto.INSTANCE.getZeroValue();
            } else {
                this.locality = localityDto;
            }
            if ((i & 32) == 0) {
                this.experiments = CollectionsKt.emptyList();
            } else {
                this.experiments = list2;
            }
            if ((i & 64) == 0) {
                this.entry_point = OnboardingEntryPointDto.INSTANCE.getZeroValue();
            } else {
                this.entry_point = onboardingEntryPointDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$options_product_service_v1_onboarding_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            if (!Intrinsics.areEqual(self.session_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.session_id);
            }
            if (!Intrinsics.areEqual(self.screen_requests, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.screen_requests);
            }
            if (!Intrinsics.areEqual(self.logging_source, "")) {
                output.encodeStringElement(serialDesc, 3, self.logging_source);
            }
            if (self.locality != LocalityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, LocalityDto.Serializer.INSTANCE, self.locality);
            }
            if (!Intrinsics.areEqual(self.experiments, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.experiments);
            }
            if (self.entry_point != OnboardingEntryPointDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, OnboardingEntryPointDto.Serializer.INSTANCE, self.entry_point);
            }
        }

        public Surrogate(String account_number, String session_id, List<OnboardingScreenRequestDto> screen_requests, String logging_source, LocalityDto locality, List<OnboardingExperimentDto> experiments, OnboardingEntryPointDto entry_point) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(screen_requests, "screen_requests");
            Intrinsics.checkNotNullParameter(logging_source, "logging_source");
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(experiments, "experiments");
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            this.account_number = account_number;
            this.session_id = session_id;
            this.screen_requests = screen_requests;
            this.logging_source = logging_source;
            this.locality = locality;
            this.experiments = experiments;
            this.entry_point = entry_point;
        }

        public /* synthetic */ Surrogate(String str, String str2, List list, String str3, LocalityDto localityDto, List list2, OnboardingEntryPointDto onboardingEntryPointDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? LocalityDto.INSTANCE.getZeroValue() : localityDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list2, (i & 64) != 0 ? OnboardingEntryPointDto.INSTANCE.getZeroValue() : onboardingEntryPointDto);
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getSession_id() {
            return this.session_id;
        }

        public final List<OnboardingScreenRequestDto> getScreen_requests() {
            return this.screen_requests;
        }

        public final String getLogging_source() {
            return this.logging_source;
        }

        public final LocalityDto getLocality() {
            return this.locality;
        }

        public final List<OnboardingExperimentDto> getExperiments() {
            return this.experiments;
        }

        public final OnboardingEntryPointDto getEntry_point() {
            return this.entry_point;
        }
    }

    /* compiled from: GetNextOnboardingScreensRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Loptions_product/service/GetNextOnboardingScreensRequestDto;", "Loptions_product/service/GetNextOnboardingScreensRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/GetNextOnboardingScreensRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetNextOnboardingScreensRequestDto, GetNextOnboardingScreensRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetNextOnboardingScreensRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetNextOnboardingScreensRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetNextOnboardingScreensRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetNextOnboardingScreensRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetNextOnboardingScreensRequest> getProtoAdapter() {
            return GetNextOnboardingScreensRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetNextOnboardingScreensRequestDto getZeroValue() {
            return GetNextOnboardingScreensRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetNextOnboardingScreensRequestDto fromProto(GetNextOnboardingScreensRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            String session_id = proto.getSession_id();
            List<OnboardingScreenRequest> screen_requests = proto.getScreen_requests();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(screen_requests, 10));
            Iterator<T> it = screen_requests.iterator();
            while (it.hasNext()) {
                arrayList.add(OnboardingScreenRequestDto.INSTANCE.fromProto((OnboardingScreenRequest) it.next()));
            }
            String logging_source = proto.getLogging_source();
            LocalityDto localityDtoFromProto = LocalityDto.INSTANCE.fromProto(proto.getLocality());
            List<OnboardingExperiment> experiments = proto.getExperiments();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(experiments, 10));
            Iterator<T> it2 = experiments.iterator();
            while (it2.hasNext()) {
                arrayList2.add(OnboardingExperimentDto.INSTANCE.fromProto((OnboardingExperiment) it2.next()));
            }
            return new GetNextOnboardingScreensRequestDto(new Surrogate(account_number, session_id, arrayList, logging_source, localityDtoFromProto, arrayList2, OnboardingEntryPointDto.INSTANCE.fromProto(proto.getEntry_point())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.GetNextOnboardingScreensRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetNextOnboardingScreensRequestDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new GetNextOnboardingScreensRequestDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetNextOnboardingScreensRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/GetNextOnboardingScreensRequestDto;", "<init>", "()V", "surrogateSerializer", "Loptions_product/service/GetNextOnboardingScreensRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<GetNextOnboardingScreensRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/options_product.service.GetNextOnboardingScreensRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetNextOnboardingScreensRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetNextOnboardingScreensRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetNextOnboardingScreensRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetNextOnboardingScreensRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "options_product.service.GetNextOnboardingScreensRequestDto";
        }
    }
}
