package com.robinhood.android.rhy.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.recurring.models.RecurringInvestmentCategory;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckRecurringInvestmentsOnboardingIntentKey.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "PreSelectedCategory", "General", "SypIntro", "Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey$General;", "Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey$PreSelectedCategory;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface PaycheckRecurringInvestmentsOnboardingIntentKey extends IntentKey, Parcelable {

    /* compiled from: PaycheckRecurringInvestmentsOnboardingIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static NavigationType getNavigationType(PaycheckRecurringInvestmentsOnboardingIntentKey paycheckRecurringInvestmentsOnboardingIntentKey) {
            return IntentKey.DefaultImpls.getNavigationType(paycheckRecurringInvestmentsOnboardingIntentKey);
        }
    }

    /* compiled from: PaycheckRecurringInvestmentsOnboardingIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey$PreSelectedCategory;", "Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey;", "assetCategory", "Lcom/robinhood/recurring/models/RecurringInvestmentCategory;", "sypIntro", "Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey$SypIntro;", "<init>", "(Lcom/robinhood/recurring/models/RecurringInvestmentCategory;Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey$SypIntro;)V", "getAssetCategory", "()Lcom/robinhood/recurring/models/RecurringInvestmentCategory;", "getSypIntro", "()Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey$SypIntro;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes20.dex */
    public static final class PreSelectedCategory implements PaycheckRecurringInvestmentsOnboardingIntentKey {
        public static final Parcelable.Creator<PreSelectedCategory> CREATOR = new Creator();
        private final RecurringInvestmentCategory assetCategory;
        private final SypIntro sypIntro;

        /* compiled from: PaycheckRecurringInvestmentsOnboardingIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes5.dex */
        public static final class Creator implements Parcelable.Creator<PreSelectedCategory> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreSelectedCategory createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreSelectedCategory((RecurringInvestmentCategory) parcel.readParcelable(PreSelectedCategory.class.getClassLoader()), SypIntro.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreSelectedCategory[] newArray(int i) {
                return new PreSelectedCategory[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PreSelectedCategory() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.assetCategory, flags);
            dest.writeString(this.sypIntro.name());
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public PreSelectedCategory(RecurringInvestmentCategory recurringInvestmentCategory, SypIntro sypIntro) {
            Intrinsics.checkNotNullParameter(sypIntro, "sypIntro");
            this.assetCategory = recurringInvestmentCategory;
            this.sypIntro = sypIntro;
        }

        public final RecurringInvestmentCategory getAssetCategory() {
            return this.assetCategory;
        }

        public /* synthetic */ PreSelectedCategory(RecurringInvestmentCategory recurringInvestmentCategory, SypIntro sypIntro, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : recurringInvestmentCategory, (i & 2) != 0 ? SypIntro.INTRO_WITH_DIRECT_DEPOSIT : sypIntro);
        }

        public final SypIntro getSypIntro() {
            return this.sypIntro;
        }
    }

    /* compiled from: PaycheckRecurringInvestmentsOnboardingIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey$General;", "Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey;", "sypIntro", "Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey$SypIntro;", "retirementOnly", "", "canSkipCategorySelection", "<init>", "(Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey$SypIntro;ZZ)V", "getSypIntro", "()Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey$SypIntro;", "getRetirementOnly", "()Z", "getCanSkipCategorySelection", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes20.dex */
    public static final class General implements PaycheckRecurringInvestmentsOnboardingIntentKey {
        public static final Parcelable.Creator<General> CREATOR = new Creator();
        private final boolean canSkipCategorySelection;
        private final boolean retirementOnly;
        private final SypIntro sypIntro;

        /* compiled from: PaycheckRecurringInvestmentsOnboardingIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes5.dex */
        public static final class Creator implements Parcelable.Creator<General> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final General createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new General(SypIntro.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final General[] newArray(int i) {
                return new General[i];
            }
        }

        public General() {
            this(null, false, false, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sypIntro.name());
            dest.writeInt(this.retirementOnly ? 1 : 0);
            dest.writeInt(this.canSkipCategorySelection ? 1 : 0);
        }

        @Override // com.robinhood.android.navigation.keys.IntentKey
        public NavigationType getNavigationType() {
            return DefaultImpls.getNavigationType(this);
        }

        public General(SypIntro sypIntro, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(sypIntro, "sypIntro");
            this.sypIntro = sypIntro;
            this.retirementOnly = z;
            this.canSkipCategorySelection = z2;
        }

        public /* synthetic */ General(SypIntro sypIntro, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? SypIntro.INTRO_WITH_DIRECT_DEPOSIT : sypIntro, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
        }

        public final SypIntro getSypIntro() {
            return this.sypIntro;
        }

        public final boolean getRetirementOnly() {
            return this.retirementOnly;
        }

        public final boolean getCanSkipCategorySelection() {
            return this.canSkipCategorySelection;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaycheckRecurringInvestmentsOnboardingIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey$SypIntro;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "INTRO_WITH_DIRECT_DEPOSIT", "DIRECT_DEPOSIT_ONLY", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class SypIntro {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SypIntro[] $VALUES;
        public static final SypIntro NONE = new SypIntro("NONE", 0);
        public static final SypIntro INTRO_WITH_DIRECT_DEPOSIT = new SypIntro("INTRO_WITH_DIRECT_DEPOSIT", 1);
        public static final SypIntro DIRECT_DEPOSIT_ONLY = new SypIntro("DIRECT_DEPOSIT_ONLY", 2);

        private static final /* synthetic */ SypIntro[] $values() {
            return new SypIntro[]{NONE, INTRO_WITH_DIRECT_DEPOSIT, DIRECT_DEPOSIT_ONLY};
        }

        public static EnumEntries<SypIntro> getEntries() {
            return $ENTRIES;
        }

        private SypIntro(String str, int i) {
        }

        static {
            SypIntro[] sypIntroArr$values = $values();
            $VALUES = sypIntroArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sypIntroArr$values);
        }

        public static SypIntro valueOf(String str) {
            return (SypIntro) Enum.valueOf(SypIntro.class, str);
        }

        public static SypIntro[] values() {
            return (SypIntro[]) $VALUES.clone();
        }
    }
}
