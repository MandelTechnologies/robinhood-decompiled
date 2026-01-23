package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerGetPageResponseDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingDataDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerTooltipDataDto;
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

/* compiled from: InvestmentsTrackerGetPageResponseDto.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00041023B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00064"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponse;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponseDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponseDto$Surrogate;)V", "", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentDto;", "components", "", "title", "navigation_title", "account_last_four", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto;", "onboarding_data", "Lbff_money_movement/service/v1/InvestmentsTrackerTooltipDataDto;", "tooltip", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto;Lbff_money_movement/service/v1/InvestmentsTrackerTooltipDataDto;)V", "toProto", "()Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponseDto$Surrogate;", "getComponents", "()Ljava/util/List;", "getTitle", "getNavigation_title", "getOnboarding_data", "()Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto;", "getTooltip", "()Lbff_money_movement/service/v1/InvestmentsTrackerTooltipDataDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class InvestmentsTrackerGetPageResponseDto implements Dto3<InvestmentsTrackerGetPageResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InvestmentsTrackerGetPageResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InvestmentsTrackerGetPageResponseDto, InvestmentsTrackerGetPageResponse>> binaryBase64Serializer$delegate;
    private static final InvestmentsTrackerGetPageResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InvestmentsTrackerGetPageResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InvestmentsTrackerGetPageResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<InvestmentsTrackerComponentDto> getComponents() {
        return this.surrogate.getComponents();
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getNavigation_title() {
        return this.surrogate.getNavigation_title();
    }

    public final InvestmentsTrackerOnboardingDataDto getOnboarding_data() {
        return this.surrogate.getOnboarding_data();
    }

    public final InvestmentsTrackerTooltipDataDto getTooltip() {
        return this.surrogate.getTooltip();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ InvestmentsTrackerGetPageResponseDto(java.util.List r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingDataDto r6, bff_money_movement.service.p019v1.InvestmentsTrackerTooltipDataDto r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r9 = r8 & 2
            java.lang.String r0 = ""
            if (r9 == 0) goto Lf
            r3 = r0
        Lf:
            r9 = r8 & 4
            if (r9 == 0) goto L14
            r4 = r0
        L14:
            r9 = r8 & 8
            if (r9 == 0) goto L19
            r5 = r0
        L19:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto L1f
            r6 = r0
        L1f:
            r8 = r8 & 32
            if (r8 == 0) goto L2b
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L32
        L2b:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L32:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bff_money_movement.service.p019v1.InvestmentsTrackerGetPageResponseDto.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, bff_money_movement.service.v1.InvestmentsTrackerOnboardingDataDto, bff_money_movement.service.v1.InvestmentsTrackerTooltipDataDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerGetPageResponseDto(List<InvestmentsTrackerComponentDto> components, String title, String navigation_title, String account_last_four, InvestmentsTrackerOnboardingDataDto investmentsTrackerOnboardingDataDto, InvestmentsTrackerTooltipDataDto investmentsTrackerTooltipDataDto) {
        this(new Surrogate(components, title, navigation_title, account_last_four, investmentsTrackerOnboardingDataDto, investmentsTrackerTooltipDataDto));
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(navigation_title, "navigation_title");
        Intrinsics.checkNotNullParameter(account_last_four, "account_last_four");
    }

    @Override // com.robinhood.idl.Dto
    public InvestmentsTrackerGetPageResponse toProto() {
        List<InvestmentsTrackerComponentDto> components = this.surrogate.getComponents();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(components, 10));
        Iterator<T> it = components.iterator();
        while (it.hasNext()) {
            arrayList.add(((InvestmentsTrackerComponentDto) it.next()).toProto());
        }
        String title = this.surrogate.getTitle();
        String navigation_title = this.surrogate.getNavigation_title();
        String account_last_four = this.surrogate.getAccount_last_four();
        InvestmentsTrackerOnboardingDataDto onboarding_data = this.surrogate.getOnboarding_data();
        InvestmentsTrackerOnboardingData proto = onboarding_data != null ? onboarding_data.toProto() : null;
        InvestmentsTrackerTooltipDataDto tooltip = this.surrogate.getTooltip();
        return new InvestmentsTrackerGetPageResponse(arrayList, title, navigation_title, account_last_four, proto, tooltip != null ? tooltip.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[InvestmentsTrackerGetPageResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InvestmentsTrackerGetPageResponseDto) && Intrinsics.areEqual(((InvestmentsTrackerGetPageResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: InvestmentsTrackerGetPageResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 92\u00020\u0001:\u0002:9BM\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001eR \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001eR \u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b0\u0010)\u001a\u0004\b/\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b4\u0010)\u001a\u0004\b2\u00103R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\b8\u0010)\u001a\u0004\b6\u00107¨\u0006;"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponseDto$Surrogate;", "", "", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentDto;", "components", "", "title", "navigation_title", "account_last_four", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto;", "onboarding_data", "Lbff_money_movement/service/v1/InvestmentsTrackerTooltipDataDto;", "tooltip", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto;Lbff_money_movement/service/v1/InvestmentsTrackerTooltipDataDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto;Lbff_money_movement/service/v1/InvestmentsTrackerTooltipDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "getComponents$annotations", "()V", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "getNavigation_title", "getNavigation_title$annotations", "getAccount_last_four", "getAccount_last_four$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto;", "getOnboarding_data", "()Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto;", "getOnboarding_data$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerTooltipDataDto;", "getTooltip", "()Lbff_money_movement/service/v1/InvestmentsTrackerTooltipDataDto;", "getTooltip$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_last_four;
        private final List<InvestmentsTrackerComponentDto> components;
        private final String navigation_title;
        private final InvestmentsTrackerOnboardingDataDto onboarding_data;
        private final String title;
        private final InvestmentsTrackerTooltipDataDto tooltip;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerGetPageResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerGetPageResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null};

        public Surrogate() {
            this((List) null, (String) null, (String) null, (String) null, (InvestmentsTrackerOnboardingDataDto) null, (InvestmentsTrackerTooltipDataDto) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(InvestmentsTrackerComponentDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.components, surrogate.components) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.navigation_title, surrogate.navigation_title) && Intrinsics.areEqual(this.account_last_four, surrogate.account_last_four) && Intrinsics.areEqual(this.onboarding_data, surrogate.onboarding_data) && Intrinsics.areEqual(this.tooltip, surrogate.tooltip);
        }

        public int hashCode() {
            int iHashCode = ((((((this.components.hashCode() * 31) + this.title.hashCode()) * 31) + this.navigation_title.hashCode()) * 31) + this.account_last_four.hashCode()) * 31;
            InvestmentsTrackerOnboardingDataDto investmentsTrackerOnboardingDataDto = this.onboarding_data;
            int iHashCode2 = (iHashCode + (investmentsTrackerOnboardingDataDto == null ? 0 : investmentsTrackerOnboardingDataDto.hashCode())) * 31;
            InvestmentsTrackerTooltipDataDto investmentsTrackerTooltipDataDto = this.tooltip;
            return iHashCode2 + (investmentsTrackerTooltipDataDto != null ? investmentsTrackerTooltipDataDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(components=" + this.components + ", title=" + this.title + ", navigation_title=" + this.navigation_title + ", account_last_four=" + this.account_last_four + ", onboarding_data=" + this.onboarding_data + ", tooltip=" + this.tooltip + ")";
        }

        /* compiled from: InvestmentsTrackerGetPageResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponseDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InvestmentsTrackerGetPageResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, String str, String str2, String str3, InvestmentsTrackerOnboardingDataDto investmentsTrackerOnboardingDataDto, InvestmentsTrackerTooltipDataDto investmentsTrackerTooltipDataDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.components = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 4) == 0) {
                this.navigation_title = "";
            } else {
                this.navigation_title = str2;
            }
            if ((i & 8) == 0) {
                this.account_last_four = "";
            } else {
                this.account_last_four = str3;
            }
            if ((i & 16) == 0) {
                this.onboarding_data = null;
            } else {
                this.onboarding_data = investmentsTrackerOnboardingDataDto;
            }
            if ((i & 32) == 0) {
                this.tooltip = null;
            } else {
                this.tooltip = investmentsTrackerTooltipDataDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.components, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.components);
            }
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 1, self.title);
            }
            if (!Intrinsics.areEqual(self.navigation_title, "")) {
                output.encodeStringElement(serialDesc, 2, self.navigation_title);
            }
            if (!Intrinsics.areEqual(self.account_last_four, "")) {
                output.encodeStringElement(serialDesc, 3, self.account_last_four);
            }
            InvestmentsTrackerOnboardingDataDto investmentsTrackerOnboardingDataDto = self.onboarding_data;
            if (investmentsTrackerOnboardingDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, InvestmentsTrackerOnboardingDataDto.Serializer.INSTANCE, investmentsTrackerOnboardingDataDto);
            }
            InvestmentsTrackerTooltipDataDto investmentsTrackerTooltipDataDto = self.tooltip;
            if (investmentsTrackerTooltipDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, InvestmentsTrackerTooltipDataDto.Serializer.INSTANCE, investmentsTrackerTooltipDataDto);
            }
        }

        public Surrogate(List<InvestmentsTrackerComponentDto> components, String title, String navigation_title, String account_last_four, InvestmentsTrackerOnboardingDataDto investmentsTrackerOnboardingDataDto, InvestmentsTrackerTooltipDataDto investmentsTrackerTooltipDataDto) {
            Intrinsics.checkNotNullParameter(components, "components");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(navigation_title, "navigation_title");
            Intrinsics.checkNotNullParameter(account_last_four, "account_last_four");
            this.components = components;
            this.title = title;
            this.navigation_title = navigation_title;
            this.account_last_four = account_last_four;
            this.onboarding_data = investmentsTrackerOnboardingDataDto;
            this.tooltip = investmentsTrackerTooltipDataDto;
        }

        public final List<InvestmentsTrackerComponentDto> getComponents() {
            return this.components;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.util.List r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingDataDto r6, bff_money_movement.service.p019v1.InvestmentsTrackerTooltipDataDto r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L8
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L8:
                r9 = r8 & 2
                java.lang.String r0 = ""
                if (r9 == 0) goto Lf
                r3 = r0
            Lf:
                r9 = r8 & 4
                if (r9 == 0) goto L14
                r4 = r0
            L14:
                r9 = r8 & 8
                if (r9 == 0) goto L19
                r5 = r0
            L19:
                r9 = r8 & 16
                r0 = 0
                if (r9 == 0) goto L1f
                r6 = r0
            L1f:
                r8 = r8 & 32
                if (r8 == 0) goto L2b
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L32
            L2b:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L32:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bff_money_movement.service.p019v1.InvestmentsTrackerGetPageResponseDto.Surrogate.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, bff_money_movement.service.v1.InvestmentsTrackerOnboardingDataDto, bff_money_movement.service.v1.InvestmentsTrackerTooltipDataDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getNavigation_title() {
            return this.navigation_title;
        }

        public final String getAccount_last_four() {
            return this.account_last_four;
        }

        public final InvestmentsTrackerOnboardingDataDto getOnboarding_data() {
            return this.onboarding_data;
        }

        public final InvestmentsTrackerTooltipDataDto getTooltip() {
            return this.tooltip;
        }
    }

    /* compiled from: InvestmentsTrackerGetPageResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponseDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InvestmentsTrackerGetPageResponseDto, InvestmentsTrackerGetPageResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestmentsTrackerGetPageResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerGetPageResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerGetPageResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) InvestmentsTrackerGetPageResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InvestmentsTrackerGetPageResponse> getProtoAdapter() {
            return InvestmentsTrackerGetPageResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerGetPageResponseDto getZeroValue() {
            return InvestmentsTrackerGetPageResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerGetPageResponseDto fromProto(InvestmentsTrackerGetPageResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<InvestmentsTrackerComponent> components = proto.getComponents();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(components, 10));
            Iterator<T> it = components.iterator();
            while (it.hasNext()) {
                arrayList.add(InvestmentsTrackerComponentDto.INSTANCE.fromProto((InvestmentsTrackerComponent) it.next()));
            }
            String title = proto.getTitle();
            String navigation_title = proto.getNavigation_title();
            String account_last_four = proto.getAccount_last_four();
            InvestmentsTrackerOnboardingData onboarding_data = proto.getOnboarding_data();
            DefaultConstructorMarker defaultConstructorMarker = null;
            InvestmentsTrackerOnboardingDataDto investmentsTrackerOnboardingDataDtoFromProto = onboarding_data != null ? InvestmentsTrackerOnboardingDataDto.INSTANCE.fromProto(onboarding_data) : null;
            InvestmentsTrackerTooltipData tooltip = proto.getTooltip();
            return new InvestmentsTrackerGetPageResponseDto(new Surrogate(arrayList, title, navigation_title, account_last_four, investmentsTrackerOnboardingDataDtoFromProto, tooltip != null ? InvestmentsTrackerTooltipDataDto.INSTANCE.fromProto(tooltip) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerGetPageResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerGetPageResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new InvestmentsTrackerGetPageResponseDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InvestmentsTrackerGetPageResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InvestmentsTrackerGetPageResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.InvestmentsTrackerGetPageResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InvestmentsTrackerGetPageResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InvestmentsTrackerGetPageResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InvestmentsTrackerGetPageResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InvestmentsTrackerGetPageResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerGetPageResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.InvestmentsTrackerGetPageResponseDto";
        }
    }
}
