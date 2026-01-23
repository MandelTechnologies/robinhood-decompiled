package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.BooleanDto;
import com.robinhood.rosetta.eventlogging.SLIPAccountCheckboxDto;
import com.robinhood.rosetta.eventlogging.SLIPContext;
import com.robinhood.rosetta.eventlogging.SLIPContextDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: SLIPContextDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006345678B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B_\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0006\u0010\u0016J\\\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\b\u0010%\u001a\u00020\u0002H\u0016J\b\u0010&\u001a\u00020\tH\u0016J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0096\u0002J\b\u0010+\u001a\u00020,H\u0016J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020,H\u0016J\b\u00102\u001a\u00020,H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b!\u0010 R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u00069"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/SLIPContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$Surrogate;)V", "entry_point_source", "", "onboarding_variant", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$OnboardingVariantDto;", "eligibility_status", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$EligibilityStatusDto;", "dollar_amount", "percent_amount", "has_quick_enrollment", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "skip_intro", "account_checkboxes", "", "Lcom/robinhood/rosetta/eventlogging/SLIPAccountCheckboxDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$OnboardingVariantDto;Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$EligibilityStatusDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/util/List;)V", "getEntry_point_source", "()Ljava/lang/String;", "getOnboarding_variant", "()Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$OnboardingVariantDto;", "getEligibility_status", "()Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$EligibilityStatusDto;", "getDollar_amount", "getPercent_amount", "getHas_quick_enrollment", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getSkip_intro", "getAccount_checkboxes", "()Ljava/util/List;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "OnboardingVariantDto", "EligibilityStatusDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class SLIPContextDto implements Dto3<SLIPContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SLIPContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SLIPContextDto, SLIPContext>> binaryBase64Serializer$delegate;
    private static final SLIPContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SLIPContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SLIPContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getEntry_point_source() {
        return this.surrogate.getEntry_point_source();
    }

    public final OnboardingVariantDto getOnboarding_variant() {
        return this.surrogate.getOnboarding_variant();
    }

    public final EligibilityStatusDto getEligibility_status() {
        return this.surrogate.getEligibility_status();
    }

    public final String getDollar_amount() {
        return this.surrogate.getDollar_amount();
    }

    public final String getPercent_amount() {
        return this.surrogate.getPercent_amount();
    }

    public final BooleanDto getHas_quick_enrollment() {
        return this.surrogate.getHas_quick_enrollment();
    }

    public final BooleanDto getSkip_intro() {
        return this.surrogate.getSkip_intro();
    }

    public final java.util.List<SLIPAccountCheckboxDto> getAccount_checkboxes() {
        return this.surrogate.getAccount_checkboxes();
    }

    public /* synthetic */ SLIPContextDto(String str, OnboardingVariantDto onboardingVariantDto, EligibilityStatusDto eligibilityStatusDto, String str2, String str3, BooleanDto booleanDto, BooleanDto booleanDto2, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? OnboardingVariantDto.INSTANCE.getZeroValue() : onboardingVariantDto, (i & 4) != 0 ? EligibilityStatusDto.INSTANCE.getZeroValue() : eligibilityStatusDto, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 64) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto2, (i & 128) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SLIPContextDto(String entry_point_source, OnboardingVariantDto onboarding_variant, EligibilityStatusDto eligibility_status, String dollar_amount, String percent_amount, BooleanDto has_quick_enrollment, BooleanDto skip_intro, java.util.List<SLIPAccountCheckboxDto> account_checkboxes) {
        this(new Surrogate(entry_point_source, onboarding_variant, eligibility_status, dollar_amount, percent_amount, has_quick_enrollment, skip_intro, account_checkboxes));
        Intrinsics.checkNotNullParameter(entry_point_source, "entry_point_source");
        Intrinsics.checkNotNullParameter(onboarding_variant, "onboarding_variant");
        Intrinsics.checkNotNullParameter(eligibility_status, "eligibility_status");
        Intrinsics.checkNotNullParameter(dollar_amount, "dollar_amount");
        Intrinsics.checkNotNullParameter(percent_amount, "percent_amount");
        Intrinsics.checkNotNullParameter(has_quick_enrollment, "has_quick_enrollment");
        Intrinsics.checkNotNullParameter(skip_intro, "skip_intro");
        Intrinsics.checkNotNullParameter(account_checkboxes, "account_checkboxes");
    }

    public static /* synthetic */ SLIPContextDto copy$default(SLIPContextDto sLIPContextDto, String str, OnboardingVariantDto onboardingVariantDto, EligibilityStatusDto eligibilityStatusDto, String str2, String str3, BooleanDto booleanDto, BooleanDto booleanDto2, java.util.List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sLIPContextDto.surrogate.getEntry_point_source();
        }
        if ((i & 2) != 0) {
            onboardingVariantDto = sLIPContextDto.surrogate.getOnboarding_variant();
        }
        if ((i & 4) != 0) {
            eligibilityStatusDto = sLIPContextDto.surrogate.getEligibility_status();
        }
        if ((i & 8) != 0) {
            str2 = sLIPContextDto.surrogate.getDollar_amount();
        }
        if ((i & 16) != 0) {
            str3 = sLIPContextDto.surrogate.getPercent_amount();
        }
        if ((i & 32) != 0) {
            booleanDto = sLIPContextDto.surrogate.getHas_quick_enrollment();
        }
        if ((i & 64) != 0) {
            booleanDto2 = sLIPContextDto.surrogate.getSkip_intro();
        }
        if ((i & 128) != 0) {
            list = sLIPContextDto.surrogate.getAccount_checkboxes();
        }
        BooleanDto booleanDto3 = booleanDto2;
        java.util.List list2 = list;
        String str4 = str3;
        BooleanDto booleanDto4 = booleanDto;
        return sLIPContextDto.copy(str, onboardingVariantDto, eligibilityStatusDto, str2, str4, booleanDto4, booleanDto3, list2);
    }

    public final SLIPContextDto copy(String entry_point_source, OnboardingVariantDto onboarding_variant, EligibilityStatusDto eligibility_status, String dollar_amount, String percent_amount, BooleanDto has_quick_enrollment, BooleanDto skip_intro, java.util.List<SLIPAccountCheckboxDto> account_checkboxes) {
        Intrinsics.checkNotNullParameter(entry_point_source, "entry_point_source");
        Intrinsics.checkNotNullParameter(onboarding_variant, "onboarding_variant");
        Intrinsics.checkNotNullParameter(eligibility_status, "eligibility_status");
        Intrinsics.checkNotNullParameter(dollar_amount, "dollar_amount");
        Intrinsics.checkNotNullParameter(percent_amount, "percent_amount");
        Intrinsics.checkNotNullParameter(has_quick_enrollment, "has_quick_enrollment");
        Intrinsics.checkNotNullParameter(skip_intro, "skip_intro");
        Intrinsics.checkNotNullParameter(account_checkboxes, "account_checkboxes");
        return new SLIPContextDto(new Surrogate(entry_point_source, onboarding_variant, eligibility_status, dollar_amount, percent_amount, has_quick_enrollment, skip_intro, account_checkboxes));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SLIPContext toProto() {
        String entry_point_source = this.surrogate.getEntry_point_source();
        SLIPContext.OnboardingVariant onboardingVariant = (SLIPContext.OnboardingVariant) this.surrogate.getOnboarding_variant().toProto();
        SLIPContext.EligibilityStatus eligibilityStatus = (SLIPContext.EligibilityStatus) this.surrogate.getEligibility_status().toProto();
        String dollar_amount = this.surrogate.getDollar_amount();
        String percent_amount = this.surrogate.getPercent_amount();
        Boolean r7 = (Boolean) this.surrogate.getHas_quick_enrollment().toProto();
        Boolean r8 = (Boolean) this.surrogate.getSkip_intro().toProto();
        java.util.List<SLIPAccountCheckboxDto> account_checkboxes = this.surrogate.getAccount_checkboxes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(account_checkboxes, 10));
        Iterator<T> it = account_checkboxes.iterator();
        while (it.hasNext()) {
            arrayList.add(((SLIPAccountCheckboxDto) it.next()).toProto());
        }
        return new SLIPContext(entry_point_source, onboardingVariant, eligibilityStatus, dollar_amount, percent_amount, r7, r8, arrayList, null, 256, null);
    }

    public String toString() {
        return "[SLIPContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SLIPContextDto) && Intrinsics.areEqual(((SLIPContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: SLIPContextDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002CDB]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bq\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0016J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J_\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0013HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001J%\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0001¢\u0006\u0002\bBR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010'R\u001c\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010'R\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010,¨\u0006E"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$Surrogate;", "", "entry_point_source", "", "onboarding_variant", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$OnboardingVariantDto;", "eligibility_status", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$EligibilityStatusDto;", "dollar_amount", "percent_amount", "has_quick_enrollment", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "skip_intro", "account_checkboxes", "", "Lcom/robinhood/rosetta/eventlogging/SLIPAccountCheckboxDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$OnboardingVariantDto;Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$EligibilityStatusDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$OnboardingVariantDto;Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$EligibilityStatusDto;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEntry_point_source$annotations", "()V", "getEntry_point_source", "()Ljava/lang/String;", "getOnboarding_variant$annotations", "getOnboarding_variant", "()Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$OnboardingVariantDto;", "getEligibility_status$annotations", "getEligibility_status", "()Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$EligibilityStatusDto;", "getDollar_amount$annotations", "getDollar_amount", "getPercent_amount$annotations", "getPercent_amount", "getHas_quick_enrollment$annotations", "getHas_quick_enrollment", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getSkip_intro$annotations", "getSkip_intro", "getAccount_checkboxes$annotations", "getAccount_checkboxes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final java.util.List<SLIPAccountCheckboxDto> account_checkboxes;
        private final String dollar_amount;
        private final EligibilityStatusDto eligibility_status;
        private final String entry_point_source;
        private final BooleanDto has_quick_enrollment;
        private final OnboardingVariantDto onboarding_variant;
        private final String percent_amount;
        private final BooleanDto skip_intro;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.eventlogging.SLIPContextDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SLIPContextDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (OnboardingVariantDto) null, (EligibilityStatusDto) null, (String) null, (String) null, (BooleanDto) null, (BooleanDto) null, (java.util.List) null, 255, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(SLIPAccountCheckboxDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, OnboardingVariantDto onboardingVariantDto, EligibilityStatusDto eligibilityStatusDto, String str2, String str3, BooleanDto booleanDto, BooleanDto booleanDto2, java.util.List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.entry_point_source;
            }
            if ((i & 2) != 0) {
                onboardingVariantDto = surrogate.onboarding_variant;
            }
            if ((i & 4) != 0) {
                eligibilityStatusDto = surrogate.eligibility_status;
            }
            if ((i & 8) != 0) {
                str2 = surrogate.dollar_amount;
            }
            if ((i & 16) != 0) {
                str3 = surrogate.percent_amount;
            }
            if ((i & 32) != 0) {
                booleanDto = surrogate.has_quick_enrollment;
            }
            if ((i & 64) != 0) {
                booleanDto2 = surrogate.skip_intro;
            }
            if ((i & 128) != 0) {
                list = surrogate.account_checkboxes;
            }
            BooleanDto booleanDto3 = booleanDto2;
            java.util.List list2 = list;
            String str4 = str3;
            BooleanDto booleanDto4 = booleanDto;
            return surrogate.copy(str, onboardingVariantDto, eligibilityStatusDto, str2, str4, booleanDto4, booleanDto3, list2);
        }

        @SerialName("accountCheckboxes")
        @JsonAnnotations2(names = {"account_checkboxes"})
        public static /* synthetic */ void getAccount_checkboxes$annotations() {
        }

        @SerialName("dollarAmount")
        @JsonAnnotations2(names = {"dollar_amount"})
        public static /* synthetic */ void getDollar_amount$annotations() {
        }

        @SerialName("eligibilityStatus")
        @JsonAnnotations2(names = {"eligibility_status"})
        public static /* synthetic */ void getEligibility_status$annotations() {
        }

        @SerialName("entryPointSource")
        @JsonAnnotations2(names = {"entry_point_source"})
        public static /* synthetic */ void getEntry_point_source$annotations() {
        }

        @SerialName("hasQuickEnrollment")
        @JsonAnnotations2(names = {"has_quick_enrollment"})
        public static /* synthetic */ void getHas_quick_enrollment$annotations() {
        }

        @SerialName("onboardingVariant")
        @JsonAnnotations2(names = {"onboarding_variant"})
        public static /* synthetic */ void getOnboarding_variant$annotations() {
        }

        @SerialName("percentAmount")
        @JsonAnnotations2(names = {"percent_amount"})
        public static /* synthetic */ void getPercent_amount$annotations() {
        }

        @SerialName("skipIntro")
        @JsonAnnotations2(names = {"skip_intro"})
        public static /* synthetic */ void getSkip_intro$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getEntry_point_source() {
            return this.entry_point_source;
        }

        /* renamed from: component2, reason: from getter */
        public final OnboardingVariantDto getOnboarding_variant() {
            return this.onboarding_variant;
        }

        /* renamed from: component3, reason: from getter */
        public final EligibilityStatusDto getEligibility_status() {
            return this.eligibility_status;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDollar_amount() {
            return this.dollar_amount;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPercent_amount() {
            return this.percent_amount;
        }

        /* renamed from: component6, reason: from getter */
        public final BooleanDto getHas_quick_enrollment() {
            return this.has_quick_enrollment;
        }

        /* renamed from: component7, reason: from getter */
        public final BooleanDto getSkip_intro() {
            return this.skip_intro;
        }

        public final java.util.List<SLIPAccountCheckboxDto> component8() {
            return this.account_checkboxes;
        }

        public final Surrogate copy(String entry_point_source, OnboardingVariantDto onboarding_variant, EligibilityStatusDto eligibility_status, String dollar_amount, String percent_amount, BooleanDto has_quick_enrollment, BooleanDto skip_intro, java.util.List<SLIPAccountCheckboxDto> account_checkboxes) {
            Intrinsics.checkNotNullParameter(entry_point_source, "entry_point_source");
            Intrinsics.checkNotNullParameter(onboarding_variant, "onboarding_variant");
            Intrinsics.checkNotNullParameter(eligibility_status, "eligibility_status");
            Intrinsics.checkNotNullParameter(dollar_amount, "dollar_amount");
            Intrinsics.checkNotNullParameter(percent_amount, "percent_amount");
            Intrinsics.checkNotNullParameter(has_quick_enrollment, "has_quick_enrollment");
            Intrinsics.checkNotNullParameter(skip_intro, "skip_intro");
            Intrinsics.checkNotNullParameter(account_checkboxes, "account_checkboxes");
            return new Surrogate(entry_point_source, onboarding_variant, eligibility_status, dollar_amount, percent_amount, has_quick_enrollment, skip_intro, account_checkboxes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.entry_point_source, surrogate.entry_point_source) && this.onboarding_variant == surrogate.onboarding_variant && this.eligibility_status == surrogate.eligibility_status && Intrinsics.areEqual(this.dollar_amount, surrogate.dollar_amount) && Intrinsics.areEqual(this.percent_amount, surrogate.percent_amount) && this.has_quick_enrollment == surrogate.has_quick_enrollment && this.skip_intro == surrogate.skip_intro && Intrinsics.areEqual(this.account_checkboxes, surrogate.account_checkboxes);
        }

        public int hashCode() {
            return (((((((((((((this.entry_point_source.hashCode() * 31) + this.onboarding_variant.hashCode()) * 31) + this.eligibility_status.hashCode()) * 31) + this.dollar_amount.hashCode()) * 31) + this.percent_amount.hashCode()) * 31) + this.has_quick_enrollment.hashCode()) * 31) + this.skip_intro.hashCode()) * 31) + this.account_checkboxes.hashCode();
        }

        public String toString() {
            return "Surrogate(entry_point_source=" + this.entry_point_source + ", onboarding_variant=" + this.onboarding_variant + ", eligibility_status=" + this.eligibility_status + ", dollar_amount=" + this.dollar_amount + ", percent_amount=" + this.percent_amount + ", has_quick_enrollment=" + this.has_quick_enrollment + ", skip_intro=" + this.skip_intro + ", account_checkboxes=" + this.account_checkboxes + ")";
        }

        /* compiled from: SLIPContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SLIPContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, OnboardingVariantDto onboardingVariantDto, EligibilityStatusDto eligibilityStatusDto, String str2, String str3, BooleanDto booleanDto, BooleanDto booleanDto2, java.util.List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.entry_point_source = "";
            } else {
                this.entry_point_source = str;
            }
            if ((i & 2) == 0) {
                this.onboarding_variant = OnboardingVariantDto.INSTANCE.getZeroValue();
            } else {
                this.onboarding_variant = onboardingVariantDto;
            }
            if ((i & 4) == 0) {
                this.eligibility_status = EligibilityStatusDto.INSTANCE.getZeroValue();
            } else {
                this.eligibility_status = eligibilityStatusDto;
            }
            if ((i & 8) == 0) {
                this.dollar_amount = "";
            } else {
                this.dollar_amount = str2;
            }
            if ((i & 16) == 0) {
                this.percent_amount = "";
            } else {
                this.percent_amount = str3;
            }
            if ((i & 32) == 0) {
                this.has_quick_enrollment = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.has_quick_enrollment = booleanDto;
            }
            if ((i & 64) == 0) {
                this.skip_intro = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.skip_intro = booleanDto2;
            }
            if ((i & 128) == 0) {
                this.account_checkboxes = CollectionsKt.emptyList();
            } else {
                this.account_checkboxes = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.entry_point_source, "")) {
                output.encodeStringElement(serialDesc, 0, self.entry_point_source);
            }
            if (self.onboarding_variant != OnboardingVariantDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, OnboardingVariantDto.Serializer.INSTANCE, self.onboarding_variant);
            }
            if (self.eligibility_status != EligibilityStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, EligibilityStatusDto.Serializer.INSTANCE, self.eligibility_status);
            }
            if (!Intrinsics.areEqual(self.dollar_amount, "")) {
                output.encodeStringElement(serialDesc, 3, self.dollar_amount);
            }
            if (!Intrinsics.areEqual(self.percent_amount, "")) {
                output.encodeStringElement(serialDesc, 4, self.percent_amount);
            }
            BooleanDto booleanDto = self.has_quick_enrollment;
            BooleanDto.Companion companion = BooleanDto.INSTANCE;
            if (booleanDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, BooleanDto.Serializer.INSTANCE, self.has_quick_enrollment);
            }
            if (self.skip_intro != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, BooleanDto.Serializer.INSTANCE, self.skip_intro);
            }
            if (Intrinsics.areEqual(self.account_checkboxes, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.account_checkboxes);
        }

        public Surrogate(String entry_point_source, OnboardingVariantDto onboarding_variant, EligibilityStatusDto eligibility_status, String dollar_amount, String percent_amount, BooleanDto has_quick_enrollment, BooleanDto skip_intro, java.util.List<SLIPAccountCheckboxDto> account_checkboxes) {
            Intrinsics.checkNotNullParameter(entry_point_source, "entry_point_source");
            Intrinsics.checkNotNullParameter(onboarding_variant, "onboarding_variant");
            Intrinsics.checkNotNullParameter(eligibility_status, "eligibility_status");
            Intrinsics.checkNotNullParameter(dollar_amount, "dollar_amount");
            Intrinsics.checkNotNullParameter(percent_amount, "percent_amount");
            Intrinsics.checkNotNullParameter(has_quick_enrollment, "has_quick_enrollment");
            Intrinsics.checkNotNullParameter(skip_intro, "skip_intro");
            Intrinsics.checkNotNullParameter(account_checkboxes, "account_checkboxes");
            this.entry_point_source = entry_point_source;
            this.onboarding_variant = onboarding_variant;
            this.eligibility_status = eligibility_status;
            this.dollar_amount = dollar_amount;
            this.percent_amount = percent_amount;
            this.has_quick_enrollment = has_quick_enrollment;
            this.skip_intro = skip_intro;
            this.account_checkboxes = account_checkboxes;
        }

        public /* synthetic */ Surrogate(String str, OnboardingVariantDto onboardingVariantDto, EligibilityStatusDto eligibilityStatusDto, String str2, String str3, BooleanDto booleanDto, BooleanDto booleanDto2, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? OnboardingVariantDto.INSTANCE.getZeroValue() : onboardingVariantDto, (i & 4) != 0 ? EligibilityStatusDto.INSTANCE.getZeroValue() : eligibilityStatusDto, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 64) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto2, (i & 128) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getEntry_point_source() {
            return this.entry_point_source;
        }

        public final OnboardingVariantDto getOnboarding_variant() {
            return this.onboarding_variant;
        }

        public final EligibilityStatusDto getEligibility_status() {
            return this.eligibility_status;
        }

        public final String getDollar_amount() {
            return this.dollar_amount;
        }

        public final String getPercent_amount() {
            return this.percent_amount;
        }

        public final BooleanDto getHas_quick_enrollment() {
            return this.has_quick_enrollment;
        }

        public final BooleanDto getSkip_intro() {
            return this.skip_intro;
        }

        public final java.util.List<SLIPAccountCheckboxDto> getAccount_checkboxes() {
            return this.account_checkboxes;
        }
    }

    /* compiled from: SLIPContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto;", "Lcom/robinhood/rosetta/eventlogging/SLIPContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/SLIPContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SLIPContextDto, SLIPContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SLIPContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SLIPContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SLIPContextDto> getBinaryBase64Serializer() {
            return (KSerializer) SLIPContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SLIPContext> getProtoAdapter() {
            return SLIPContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SLIPContextDto getZeroValue() {
            return SLIPContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SLIPContextDto fromProto(SLIPContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String entry_point_source = proto.getEntry_point_source();
            OnboardingVariantDto onboardingVariantDtoFromProto = OnboardingVariantDto.INSTANCE.fromProto(proto.getOnboarding_variant());
            EligibilityStatusDto eligibilityStatusDtoFromProto = EligibilityStatusDto.INSTANCE.fromProto(proto.getEligibility_status());
            String dollar_amount = proto.getDollar_amount();
            String percent_amount = proto.getPercent_amount();
            BooleanDto.Companion companion = BooleanDto.INSTANCE;
            BooleanDto booleanDtoFromProto = companion.fromProto(proto.getHas_quick_enrollment());
            BooleanDto booleanDtoFromProto2 = companion.fromProto(proto.getSkip_intro());
            java.util.List<SLIPAccountCheckbox> account_checkboxes = proto.getAccount_checkboxes();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(account_checkboxes, 10));
            Iterator<T> it = account_checkboxes.iterator();
            while (it.hasNext()) {
                arrayList.add(SLIPAccountCheckboxDto.INSTANCE.fromProto((SLIPAccountCheckbox) it.next()));
            }
            return new SLIPContextDto(new Surrogate(entry_point_source, onboardingVariantDtoFromProto, eligibilityStatusDtoFromProto, dollar_amount, percent_amount, booleanDtoFromProto, booleanDtoFromProto2, arrayList), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.SLIPContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SLIPContextDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new SLIPContextDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SLIPContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$OnboardingVariantDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$OnboardingVariant;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ONBOARDING_VARIANT_UNSPECIFIED", "ONBOARDING_VARIANT_GENERIC", "ONBOARDING_VARIANT_DOLLAR", "ONBOARDING_VARIANT_PERCENT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OnboardingVariantDto implements Dto2<SLIPContext.OnboardingVariant>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OnboardingVariantDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OnboardingVariantDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OnboardingVariantDto, SLIPContext.OnboardingVariant>> binaryBase64Serializer$delegate;
        public static final OnboardingVariantDto ONBOARDING_VARIANT_UNSPECIFIED = new ONBOARDING_VARIANT_UNSPECIFIED("ONBOARDING_VARIANT_UNSPECIFIED", 0);
        public static final OnboardingVariantDto ONBOARDING_VARIANT_GENERIC = new ONBOARDING_VARIANT_GENERIC("ONBOARDING_VARIANT_GENERIC", 1);
        public static final OnboardingVariantDto ONBOARDING_VARIANT_DOLLAR = new ONBOARDING_VARIANT_DOLLAR("ONBOARDING_VARIANT_DOLLAR", 2);
        public static final OnboardingVariantDto ONBOARDING_VARIANT_PERCENT = new ONBOARDING_VARIANT_PERCENT("ONBOARDING_VARIANT_PERCENT", 3);

        private static final /* synthetic */ OnboardingVariantDto[] $values() {
            return new OnboardingVariantDto[]{ONBOARDING_VARIANT_UNSPECIFIED, ONBOARDING_VARIANT_GENERIC, ONBOARDING_VARIANT_DOLLAR, ONBOARDING_VARIANT_PERCENT};
        }

        public /* synthetic */ OnboardingVariantDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<OnboardingVariantDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: SLIPContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SLIPContextDto.OnboardingVariantDto.ONBOARDING_VARIANT_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$OnboardingVariantDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$OnboardingVariant;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONBOARDING_VARIANT_UNSPECIFIED extends OnboardingVariantDto {
            ONBOARDING_VARIANT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SLIPContext.OnboardingVariant toProto() {
                return SLIPContext.OnboardingVariant.ONBOARDING_VARIANT_UNSPECIFIED;
            }
        }

        private OnboardingVariantDto(String str, int i) {
        }

        static {
            OnboardingVariantDto[] onboardingVariantDtoArr$values = $values();
            $VALUES = onboardingVariantDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(onboardingVariantDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.SLIPContextDto$OnboardingVariantDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SLIPContextDto.OnboardingVariantDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: SLIPContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SLIPContextDto.OnboardingVariantDto.ONBOARDING_VARIANT_GENERIC", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$OnboardingVariantDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$OnboardingVariant;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONBOARDING_VARIANT_GENERIC extends OnboardingVariantDto {
            ONBOARDING_VARIANT_GENERIC(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SLIPContext.OnboardingVariant toProto() {
                return SLIPContext.OnboardingVariant.ONBOARDING_VARIANT_GENERIC;
            }
        }

        /* compiled from: SLIPContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SLIPContextDto.OnboardingVariantDto.ONBOARDING_VARIANT_DOLLAR", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$OnboardingVariantDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$OnboardingVariant;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONBOARDING_VARIANT_DOLLAR extends OnboardingVariantDto {
            ONBOARDING_VARIANT_DOLLAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SLIPContext.OnboardingVariant toProto() {
                return SLIPContext.OnboardingVariant.ONBOARDING_VARIANT_DOLLAR;
            }
        }

        /* compiled from: SLIPContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SLIPContextDto.OnboardingVariantDto.ONBOARDING_VARIANT_PERCENT", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$OnboardingVariantDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$OnboardingVariant;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ONBOARDING_VARIANT_PERCENT extends OnboardingVariantDto {
            ONBOARDING_VARIANT_PERCENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SLIPContext.OnboardingVariant toProto() {
                return SLIPContext.OnboardingVariant.ONBOARDING_VARIANT_PERCENT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: SLIPContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$OnboardingVariantDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$OnboardingVariantDto;", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$OnboardingVariant;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$OnboardingVariantDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OnboardingVariantDto, SLIPContext.OnboardingVariant> {

            /* compiled from: SLIPContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SLIPContext.OnboardingVariant.values().length];
                    try {
                        iArr[SLIPContext.OnboardingVariant.ONBOARDING_VARIANT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SLIPContext.OnboardingVariant.ONBOARDING_VARIANT_GENERIC.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SLIPContext.OnboardingVariant.ONBOARDING_VARIANT_DOLLAR.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[SLIPContext.OnboardingVariant.ONBOARDING_VARIANT_PERCENT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OnboardingVariantDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OnboardingVariantDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OnboardingVariantDto> getBinaryBase64Serializer() {
                return (KSerializer) OnboardingVariantDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<SLIPContext.OnboardingVariant> getProtoAdapter() {
                return SLIPContext.OnboardingVariant.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OnboardingVariantDto getZeroValue() {
                return OnboardingVariantDto.ONBOARDING_VARIANT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OnboardingVariantDto fromProto(SLIPContext.OnboardingVariant proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return OnboardingVariantDto.ONBOARDING_VARIANT_UNSPECIFIED;
                }
                if (i == 2) {
                    return OnboardingVariantDto.ONBOARDING_VARIANT_GENERIC;
                }
                if (i == 3) {
                    return OnboardingVariantDto.ONBOARDING_VARIANT_DOLLAR;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return OnboardingVariantDto.ONBOARDING_VARIANT_PERCENT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SLIPContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$OnboardingVariantDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$OnboardingVariantDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<OnboardingVariantDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OnboardingVariantDto, SLIPContext.OnboardingVariant> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.SLIPContext.OnboardingVariant", OnboardingVariantDto.getEntries(), OnboardingVariantDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public OnboardingVariantDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (OnboardingVariantDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OnboardingVariantDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static OnboardingVariantDto valueOf(String str) {
            return (OnboardingVariantDto) Enum.valueOf(OnboardingVariantDto.class, str);
        }

        public static OnboardingVariantDto[] values() {
            return (OnboardingVariantDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SLIPContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$EligibilityStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$EligibilityStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ELIGIBILITY_STATUS_UNSPECIFIED", "ELIGIBILITY_STATUS_NOT_ELIGIBLE", "ELIGIBILITY_STATUS_ELIGIBLE", "ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EligibilityStatusDto implements Dto2<SLIPContext.EligibilityStatus>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EligibilityStatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EligibilityStatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EligibilityStatusDto, SLIPContext.EligibilityStatus>> binaryBase64Serializer$delegate;
        public static final EligibilityStatusDto ELIGIBILITY_STATUS_UNSPECIFIED = new ELIGIBILITY_STATUS_UNSPECIFIED("ELIGIBILITY_STATUS_UNSPECIFIED", 0);
        public static final EligibilityStatusDto ELIGIBILITY_STATUS_NOT_ELIGIBLE = new ELIGIBILITY_STATUS_NOT_ELIGIBLE("ELIGIBILITY_STATUS_NOT_ELIGIBLE", 1);
        public static final EligibilityStatusDto ELIGIBILITY_STATUS_ELIGIBLE = new ELIGIBILITY_STATUS_ELIGIBLE("ELIGIBILITY_STATUS_ELIGIBLE", 2);
        public static final EligibilityStatusDto ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION = new ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION("ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION", 3);

        private static final /* synthetic */ EligibilityStatusDto[] $values() {
            return new EligibilityStatusDto[]{ELIGIBILITY_STATUS_UNSPECIFIED, ELIGIBILITY_STATUS_NOT_ELIGIBLE, ELIGIBILITY_STATUS_ELIGIBLE, ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION};
        }

        public /* synthetic */ EligibilityStatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<EligibilityStatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: SLIPContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SLIPContextDto.EligibilityStatusDto.ELIGIBILITY_STATUS_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$EligibilityStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$EligibilityStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ELIGIBILITY_STATUS_UNSPECIFIED extends EligibilityStatusDto {
            ELIGIBILITY_STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SLIPContext.EligibilityStatus toProto() {
                return SLIPContext.EligibilityStatus.ELIGIBILITY_STATUS_UNSPECIFIED;
            }
        }

        private EligibilityStatusDto(String str, int i) {
        }

        static {
            EligibilityStatusDto[] eligibilityStatusDtoArr$values = $values();
            $VALUES = eligibilityStatusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eligibilityStatusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.SLIPContextDto$EligibilityStatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SLIPContextDto.EligibilityStatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: SLIPContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SLIPContextDto.EligibilityStatusDto.ELIGIBILITY_STATUS_NOT_ELIGIBLE", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$EligibilityStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$EligibilityStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ELIGIBILITY_STATUS_NOT_ELIGIBLE extends EligibilityStatusDto {
            ELIGIBILITY_STATUS_NOT_ELIGIBLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SLIPContext.EligibilityStatus toProto() {
                return SLIPContext.EligibilityStatus.ELIGIBILITY_STATUS_NOT_ELIGIBLE;
            }
        }

        /* compiled from: SLIPContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SLIPContextDto.EligibilityStatusDto.ELIGIBILITY_STATUS_ELIGIBLE", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$EligibilityStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$EligibilityStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ELIGIBILITY_STATUS_ELIGIBLE extends EligibilityStatusDto {
            ELIGIBILITY_STATUS_ELIGIBLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SLIPContext.EligibilityStatus toProto() {
                return SLIPContext.EligibilityStatus.ELIGIBILITY_STATUS_ELIGIBLE;
            }
        }

        /* compiled from: SLIPContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SLIPContextDto.EligibilityStatusDto.ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$EligibilityStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$EligibilityStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION extends EligibilityStatusDto {
            ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SLIPContext.EligibilityStatus toProto() {
                return SLIPContext.EligibilityStatus.ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: SLIPContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$EligibilityStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$EligibilityStatusDto;", "Lcom/robinhood/rosetta/eventlogging/SLIPContext$EligibilityStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$EligibilityStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EligibilityStatusDto, SLIPContext.EligibilityStatus> {

            /* compiled from: SLIPContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SLIPContext.EligibilityStatus.values().length];
                    try {
                        iArr[SLIPContext.EligibilityStatus.ELIGIBILITY_STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SLIPContext.EligibilityStatus.ELIGIBILITY_STATUS_NOT_ELIGIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SLIPContext.EligibilityStatus.ELIGIBILITY_STATUS_ELIGIBLE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[SLIPContext.EligibilityStatus.ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EligibilityStatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EligibilityStatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EligibilityStatusDto> getBinaryBase64Serializer() {
                return (KSerializer) EligibilityStatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<SLIPContext.EligibilityStatus> getProtoAdapter() {
                return SLIPContext.EligibilityStatus.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EligibilityStatusDto getZeroValue() {
                return EligibilityStatusDto.ELIGIBILITY_STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EligibilityStatusDto fromProto(SLIPContext.EligibilityStatus proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return EligibilityStatusDto.ELIGIBILITY_STATUS_UNSPECIFIED;
                }
                if (i == 2) {
                    return EligibilityStatusDto.ELIGIBILITY_STATUS_NOT_ELIGIBLE;
                }
                if (i == 3) {
                    return EligibilityStatusDto.ELIGIBILITY_STATUS_ELIGIBLE;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return EligibilityStatusDto.ELIGIBILITY_STATUS_ELIGIBLE_WITH_RECOMMENDATION;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SLIPContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$EligibilityStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$EligibilityStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<EligibilityStatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EligibilityStatusDto, SLIPContext.EligibilityStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.SLIPContext.EligibilityStatus", EligibilityStatusDto.getEntries(), EligibilityStatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EligibilityStatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EligibilityStatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EligibilityStatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EligibilityStatusDto valueOf(String str) {
            return (EligibilityStatusDto) Enum.valueOf(EligibilityStatusDto.class, str);
        }

        public static EligibilityStatusDto[] values() {
            return (EligibilityStatusDto[]) $VALUES.clone();
        }
    }

    /* compiled from: SLIPContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<SLIPContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.SLIPContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SLIPContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SLIPContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SLIPContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SLIPContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SLIPContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.SLIPContextDto";
        }
    }
}
